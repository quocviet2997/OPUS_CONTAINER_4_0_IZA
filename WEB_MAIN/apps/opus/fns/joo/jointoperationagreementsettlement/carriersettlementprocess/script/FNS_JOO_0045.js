/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0045.js
 *@FileTitle: Adjustment Slot Hire
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0045 : business script for FNS_JOO_0045
 */
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var gCurRow=0;
var prefix="sheet1_";
var gYmFr;
var gYmTo;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject1=sheetObjects[0];
	/*******************************************************/
	var formObj=document.form;
	try {
		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
		if (srcName == null || srcName == "re_divr_cd" || srcName == "stl_adj_irr_flg") {
			return;
		}
		//return in case class is btn1_1
		if (!JooBtnClickEnable(srcName)) {
			return;
		}
		switch (srcName) {
			case "btn_left_fm":
		    	sheetObjects[0].RemoveAll();
				if (formObj.fm_acct_yrmon.value!=""){
					var fr=ComGetDateAdd(formObj.fm_acct_yrmon.value+"-01","M",-1).substring(0,7);
					var to=formObj.to_acct_yrmon.value;
					if (!UF_checkPeriod(fr, to)){
						return;
					}
					formObj.fm_acct_yrmon.value=fr;
					gYmFr=ComReplaceStr(fr,"-","");
				}
				break;
			case "btn_right_fm":
		    	sheetObjects[0].RemoveAll();
				if (formObj.fm_acct_yrmon.value!=""){
					var fr=ComGetDateAdd(formObj.fm_acct_yrmon.value+"-01","M", 1).substring(0,7);
					var to=formObj.to_acct_yrmon.value;
					if (!UF_checkPeriod(fr, to)){
						return;
					}
					formObj.fm_acct_yrmon.value=fr;
					gYmFr=ComReplaceStr(fr,"-","");
				}
				break;
			case "btn_left_to":
		    	sheetObjects[0].RemoveAll();
				if (formObj.to_acct_yrmon.value!=""){
					var fr=formObj.fm_acct_yrmon.value;
					var to=ComGetDateAdd(formObj.to_acct_yrmon.value+"-01","M",-1).substring(0,7);
					if (!UF_checkPeriod(fr, to)){
						return;
					}
					formObj.to_acct_yrmon.value=to;
					gYmTo=ComReplaceStr(to,"-","");
				}
				break;
			case "btn_right_to":
		    	sheetObjects[0].RemoveAll();
				if (formObj.to_acct_yrmon.value!=""){
					var fr=formObj.fm_acct_yrmon.value;
					var to=ComGetDateAdd(formObj.to_acct_yrmon.value+"-01","M", 1).substring(0,7);
					if (!UF_checkPeriod(fr, to)){
						return;
					}
					formObj.to_acct_yrmon.value=to;
					gYmTo=ComReplaceStr(to,"-","");
				}
				break;
			case "btns_back":
				sheetObjects[0].RemoveAll();
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);
					//UF_setAcctYrmon(formObj.acct_yrmon.value);					
				}
				doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
				
	        	setPeriod();//Period 자동 셋팅
				break;				
			case "btns_next":
		    	sheetObjects[0].RemoveAll();
				if (formObj.acct_yrmon.value!=""){
					formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M", 1).substring(0,7);
					//UF_setAcctYrmon(formObj.acct_yrmon.value);					
				}
				doActionIBSheet(sheetObjects[1], formObj, IBSEARCH_ASYNC10);
				
				setPeriod();//Period 자동 셋팅
				break;
			case "btn_delete":
				JooRowHideDelete(sheetObject1, prefix+"del_chk");
				break;
			case "btn_retrieve":
				doActionIBSheet(sheetObject1, formObj, IBSEARCH);
				break;
			case "btn_new":
				UF_reset();
				break;
			case "btn_save":
				doActionIBSheet(sheetObject1, formObj, IBSAVE);
				break;
			case "btn_downexcel":
				if(sheetObject1.RowCount() < 1){//no data
           		 ComShowCodeMessage("COM132501");
   	       		}else{        	       			  
   	       			sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
   	       		}	
 				
				break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowCodeMessage('JOO00001');
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setSheetObject(sheet_obj) {
	sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * registering IBCombo Object as list
 * param : combo_obj
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */ 
function setComboObject(combo_obj) {  
    comboObjects[comboCnt++]=combo_obj;  
}
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage() {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i + 1);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    gYmFr=gYYYYMM;
    gYmTo=gYYYYMM;
    initControl();
//    form.btn_delete.disabled=true;
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
	//** Date Separator **/
	DATE_SEPARATOR="-";
	var formObj=document.form;
    //handling Axon event. event catch
	axon_event.addListenerFormat('blur', 'obj_blur'    , formObj);
    axon_event.addListener('click', 'change_event_radio', 're_divr_cd');
    axon_event.addListener('click', 'diff_only_yn_click', 'diff_only_yn');    

	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
}
//handling Axon event 2
function obj_blur(){
    ComChkObjValid(ComGetEvent());
	var src=ComGetEvent("name");
    switch(src){
    	case "acct_yrmon":
        	ComAddSeparator(ComGetEvent(), "Ym");
        	doActionIBSheet(sheetObjects[1], document.form, IBSEARCH_ASYNC10);
        	
        	//Period 자동 셋팅
        	setPeriod();
    		break;
    	case "fm_acct_yrmon":
    		ComAddSeparator(ComGetEvent(), "Ym");
    		var fm=ComReplaceStr(document.form.fm_acct_yrmon.value,"-","")+"01";	
    		var to=ComReplaceStr(document.form.to_acct_yrmon.value,"-","")+"01";
    		if (!UF_checkPeriod(fm,to)){
    			//document.form.fm_acct_yrmon.focus();
    		}
    		gYmFr=ComReplaceStr(document.form.fm_acct_yrmon.value,"-","");
    		break;
    	case "to_acct_yrmon":
    		ComAddSeparator(ComGetEvent(), "Ym");
    		var fm=ComReplaceStr(document.form.fm_acct_yrmon.value,"-","")+"01";	
    		var to=ComReplaceStr(document.form.to_acct_yrmon.value,"-","")+"01";
    		if (!UF_checkPeriod(fm,to)){
    			//document.form.to_acct_yrmon.focus();
    		}
    		gYmTo=ComReplaceStr(document.form.to_acct_yrmon.value,"-","");
    		break;
    	
    }
}
function setPeriod(){
	//Period 자동 셋팅
	var tmpAcctYrmon = document.form.acct_yrmon.value;
	if (form.diff_only_yn.checked){		
		var tmpFmAcctYrmon = document.form.fm_acct_yrmon.value;
		
		var sAcctYrmon = getArgValue(ComReplaceStr(tmpAcctYrmon)+"01");
	    var sFmAcctYrmon   = getArgValue(ComReplaceStr(tmpFmAcctYrmon)+"01");
	
	    var iAcctYrmon = getDateObj(sAcctYrmon);
	    var iFmAcctYrmon   = getDateObj(sFmAcctYrmon);
	    
	    if(iFmAcctYrmon >= iAcctYrmon){
	    	document.form.fm_acct_yrmon.value = tmpAcctYrmon;
	    	gYmFr = ComReplaceStr(tmpAcctYrmon,"-","");
	    }
	    document.form.to_acct_yrmon.value = tmpAcctYrmon;	
		gYmTo = ComReplaceStr(tmpAcctYrmon,"-","");
	}else{
		document.form.fm_acct_yrmon.value="";
		document.form.to_acct_yrmon.value="";
		
		gYmFr = ComReplaceStr(tmpAcctYrmon,"-","");
		gYmTo = ComReplaceStr(tmpAcctYrmon,"-","");
	}
}
function change_event_radio(){
	var formObj = document.form;
	sheetObjects[0].RemoveAll();

	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
	
	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	var rtnFlg = doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
	
	if(rtnFlg == "S"){
		var tmpJoCrrCd 	= ComGetObjValue(formObj.jo_crr_cd);
		var tmpTrdCd 	= ComGetObjValue(formObj.trd_cd);
		var tmpRlaneCd 	= ComGetObjValue(formObj.rlane_cd);
		
		var tmpGrpKey 	= tmpJoCrrCd + tmpTrdCd + tmpRlaneCd;
		
		ComSetObjValue(formObj.jo_crr_cd	, "");
		ComSetObjValue(formObj.trd_cd		, "");
		ComSetObjValue(formObj.rlane_cd		, "");
		
		cmb_jo_crr_cd.SetSelectCode(tmpGrpKey, 1);
	}	
}
function diff_only_yn_click(){
	var form=document.form;
	var sheetObj=sheetObjects[0];
	
	sheetObj.RemoveAll();
	var i=sheetObj.HeaderRows();
	var status=sheetObj.GetRowStatus(i);
	//var calDiffTEUAmt="|sheet1_bsa_slt_prc| * |sheet1_dtl_bsa_qty|";
	//var calDiffPrcAmt="|sheet1_bsa_qty1| * |sheet1_dtl_bsa_slt_prc|";
	var calDiffTEUAmt="calDiffTEUAmt(|sheet1_bsa_slt_prc|,|sheet1_dtl_bsa_qty|)";
	var calDiffPrcAmt="calDiffPrcAmt(|sheet1_dtl_bsa_slt_prc|,|sheet1_bsa_qty1|)";
	var calTotAmt="|sheet1_adj_bsa_qty_locl_amt| + |sheet1_adj_bsa_slt_prc_locl_amt|";
	if (form.diff_only_yn.checked){
		form.fm_acct_yrmon.readOnly=false;
		form.to_acct_yrmon.readOnly=false;
		form.btn_left_fm.disabled=false;
		form.btn_left_to.disabled=false;
		form.btn_right_fm.disabled=false;
		form.btn_right_to.disabled=false;
		
		//UI 성능 개선(2014.민정호)
		form.fm_acct_yrmon.value=JooGetDateFormat(gYmFr, "ym");//gYYYYMM;
		form.to_acct_yrmon.value=JooGetDateFormat(gYmTo, "ym");//gYYYYMM;
		
		form.diff_only_yn.value="Y";
//		for (var inx=0; inx<form.stl_adj_irr_flg.length; inx++){
//			form.stl_adj_irr_flg[inx].disabled = false;
//		}
//		form.fm_acct_yrmon.focus();
	}else{
		form.fm_acct_yrmon.value="";
		form.to_acct_yrmon.value="";
		form.fm_acct_yrmon.readOnly=true;
		form.to_acct_yrmon.readOnly=true;
		form.btn_left_fm.disabled=true;
		form.btn_left_to.disabled=true;
		form.btn_right_fm.disabled=true;
		form.btn_right_to.disabled=true;
		form.diff_only_yn.value="N";		
//		form.stl_adj_irr_flg[0].checked =true;
//		for (var inx=0; inx<form.stl_adj_irr_flg.length; inx++){
//			form.stl_adj_irr_flg[inx].disabled = true;
//		}
		calDiffTEUAmt="";
		calDiffPrcAmt="";
		calTotAmt="";
//		form.acct_yrmon.focus();
	}
	with (sheetObj){      
        SetConfig( { SearchMode:2, DataRowMerge:0 } );
        var info    = { Sort:1, ColMove:1, ColResize:1, HeaderCheck:1 };
        var headers = [ ];
        InitHeaders(headers, info);
        var cols = [ 
                     {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:prefix+"adj_bsa_qty_locl_amt",     KeyField:0,   CalcLogic:calDiffTEUAmt,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:prefix+"adj_bsa_slt_prc_locl_amt", KeyField:0,   CalcLogic:calDiffPrcAmt,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"AutoSum",   Hidden:0, Width:80,   Align:"Right",   ColMerge:0,   SaveName:prefix+"stl_locl_amt",             KeyField:0,   CalcLogic:calTotAmt,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 } ];       
        InitColumns(cols);
	}
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: // sheet1 init
		with (sheetObj) {     
	        if (location.hostname != "")
	        var HeadTitle1="STS|VVD|VSL|VOY|Dir.|Fin.\nDir.|BSA Type.|BSA|BSA|Manual\nSettle|RN||JOO|JOO|Difference BSA|Difference BSA|Cur.|Adjustment Amount|Adjustment Amount|Adjustment Amount|Flg|Remark|Unit Cost\nBasic Port|Combined\nNo"
	        + "|acct_yrmon|stl_vvd_seq|stl_seq|jo_crr_cd|re_divr_cd|trd_cd|rlane_cd|jo_stl_itm_cd|stl_adj_flg|pre_acct_yrmon|pre_stl_vvd_seq|pre_stl_seq|stl_lst_flg|uc_bss_port_etd_dt|slip_no|Basic\nPort|Schedule";
	        var HeadTitle2="STS|VVD|VSL|VOY|Dir.|Fin.\nDir.|BSA Type.|TEU|Price|Manual\nSettle|RN||TEU|Price|TEU|Price|Cur.|TEU DIFF|Price DIFF|Total|Flg|Remark|Unit Cost\nBasic Port|Combined\nNo"
	        + "|acct_yrmon|stl_vvd_seq|stl_seq|jo_crr_cd|re_divr_cd|trd_cd|rlane_cd|jo_stl_itm_cd|stl_adj_flg|pre_acct_yrmon|pre_stl_vvd_seq|pre_stl_seq|stl_lst_flg|uc_bss_port_etd_dt|slip_no|Basic\nPort|Schedule";
	        var headCount=ComCountHeadTitle(HeadTitle1);
	        //(headCount,11, 0, true);
	        var calDiffTEU="|sheet1_bsa_qty| - |sheet1_bsa_qty1|";
	        var calDiffPrc="|sheet1_bsa_slt_prc| - |sheet1_bsa_slt_prc1|";
	        var calDiffTEUAmt="calDiffTEUAmt(|sheet1_bsa_slt_prc|,|sheet1_dtl_bsa_qty|)"; 
	        var calDiffPrcAmt="calDiffPrcAmt(|sheet1_dtl_bsa_slt_prc|,|sheet1_bsa_qty1|)";
	        var calTotAmt="|sheet1_adj_bsa_qty_locl_amt| + |sheet1_adj_bsa_slt_prc_locl_amt|";
	        SetConfig( { SearchMode:2, MergeSheet:7, Page:20, DataRowMerge:1 } );
	        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        var headers = [ { Text:HeadTitle1, Align:"Center"},
	                    { Text:HeadTitle2, Align:"Center"} ];
	        InitHeaders(headers, info);
	
	        var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
	               {Type:"Text",      Hidden:0, Width:90,   Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd",                      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:4 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"vsl_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:4 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_voy_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:4 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"skd_dir_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"rev_dir_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:1 },
	               {Type:"Combo",     Hidden:0, Width:140,  Align:"Left",    ColMerge:1,   SaveName:prefix+"jo_stl_jb_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_qty",                  KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:90,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_slt_prc",              KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_mnu_nm",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rn",                       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
	               {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_qty1",                 KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_slt_prc1",             KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"dtl_bsa_qty",              KeyField:0,   CalcLogic:""/*calDiffTEU*/,Format:"NullFloat", PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"dtl_bsa_slt_prc",          KeyField:0,   CalcLogic:""/*calDiffPrc*/,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"locl_curr_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"adj_bsa_qty_locl_amt",     KeyField:0,   CalcLogic:calDiffTEUAmt,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"adj_bsa_slt_prc_locl_amt", KeyField:0,   CalcLogic:calDiffPrcAmt,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0, Width:85,   Align:"Right",   ColMerge:0,   SaveName:prefix+"stl_locl_amt",             KeyField:0,   CalcLogic:calTotAmt,Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_adj_irr_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	               {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_adj_irr_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:100 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"uc_bss_port_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_cmb_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"acct_yrmon",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_vvd_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"re_divr_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_adj_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"pre_acct_yrmon",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"pre_stl_vvd_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"pre_stl_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_lst_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"uc_bss_port_etd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"slip_no",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_bzc_port_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"eta_dt",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	         
			        InitColumns(cols);		
			        SetEditable(1);
//			        SetSheetHeight(460);
			        resizeSheet();
			        SetColProperty(prefix+"jo_stl_jb_cd", {ComboText:gStlComnm, ComboCode:gStlCombo} );
		}
		break;
	case 2: // sheet1 init
//		sheetObj.SetSheetHeight(0);
		//SetVisible(false);
		sheetObj.SetVisible(false);
		break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
 			sheetObj.DoSearch("FNS_JOO_0045GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix) );
			break;
		case IBSAVE: //save
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			formObj.f_cmd.value=MULTI;
			sheetObj.DoSave("FNS_JOO_0045GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix), -1, false);
			break;
		case IBSEARCH_ASYNC10: //retrieving closing status
			formObj.f_cmd.value=SEARCH10;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0045GS.do", FormQueryString(formObj));
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				gClzYn=ComGetEtcData(sXml,"clz_yn"); 
				if (gClzYn == "C"){
					//ComShowCodeMessage("JOO00177");
					JooSetBtnClass("C", false);
					sheetObjects[0].SetEditable(0);
				//if Open status, activating or deactivating button by Authority
				}else{
					JooSetBtnClass("C", true);
					if (!(Number(cmb_jo_crr_cd.GetSelectIndex()) == -1 || cmb_jo_crr_cd.GetSelectCode() == "")){	
						var selCrrAuthCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 4);//jo_crr_auth_cd
						UF_setAuth(selCrrAuthCd);
					}
				}
			}
			break;

			
		case IBSEARCH_ASYNC20 : //2015.09.17 MultiCombo Rlane CD			
			var params = "";					
			params += "f_cmd=" + SEARCH21; 
			params += "&jo_stl_itm_cd="+ComGetObjValue(formObj.jo_stl_itm_cd);	 			
			params += "&re_divr_cd="+JooGetRadioValue(formObj.re_divr_cd); 
			
			var sXml = sheetObj.GetSearchData("JOOCommonGS.do", params);
			ComXml2ComboItem(sXml, cmb_jo_crr_cd, "grp_key", "jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd|jo_stl_tgt_tp_cd");
			return "S";
			break;
	}
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */ 
function initCombo(comboObj, comboNo) {
    var formObj=document.form
    switch(comboNo) {    
	case 1: 
        with (comboObj) { 
			SetMultiSelect(0);
			SetUseAutoComplete(1);
			SetTitleVisible(1);//title
			SetTitle("Carrier|Trade|Lane|S.Option|Auth|Currency|JO_STL_TGT_TP_CD")
			SetColAlign(0, "center");
			SetColAlign(1, "center");
			SetColAlign(2, "center");
			SetColAlign(3, "center");
			SetColAlign(4, "center");
			SetColAlign(5, "center");
			SetColAlign(6, "center");
			SetColWidth(0, "40");
			SetColWidth(1, "40");
			SetColWidth(2, "60");
			SetColWidth(3, "0");
			SetColWidth(4, "0");
			SetColWidth(5, "0");
			SetColWidth(6, "0");
			//SetDropHeight(160);
			ValidChar(2,1);//only upper case, numbers
			SetSelectIndex(0);
	    }
		break;
 	} 
}

//jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|locl_curr_cd|jo_stl_tgt_tp_cd
function cmb_jo_crr_cd_OnChange(comboObj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
	if(OldIndex == NewIndex) return;
	
	var formObj = document.form;
	var selJoCrrCd 		= JooComGetCarrierText(comboObj, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(comboObj, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	var selJoStlOptCd 	= JooComGetCarrierText(comboObj, 3); //jo_stl_opt_cd
	var selCrrAuthCd 	= JooComGetCarrierText(comboObj, 4); //jo_crr_auth_cd
	var selLoclCurrCd 	= JooComGetCarrierText(comboObj, 5); //locl_curr_cd	
	var selJoStlTgtTpCd	= JooComGetCarrierText(comboObj, 6); //jo_stl_tgt_tp_cd	

	ComSetObjValue(formObj.jo_crr_cd	, selJoCrrCd);
	ComSetObjValue(formObj.trd_cd		, selTrdCd);
	ComSetObjValue(formObj.rlane_cd		, selRlaneCd);
	ComSetObjValue(formObj.locl_curr_cd	, selLoclCurrCd);	
		
	sheetObjects[0].RemoveAll();
	
	UF_setAuth(selCrrAuthCd);	
	
	if (selCrrAuthCd == "R"){
		formObj.diff_only_yn.checked=false;
		formObj.diff_only_yn.value="N";
		formObj.diff_only_yn.disabled=true;
	}else{
		formObj.diff_only_yn.disabled=false;
	}
	diff_only_yn_click();
}

function cmb_jo_crr_cd_OnBlur(comboObj){
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	if (selRlaneCd.length == 5){
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
}

function UF_setAuth(auth){
	if (gClzYn == "C") return;
	if (auth == null || auth == undefined){
		auth="R";
	}
	var editable=true;
	if (auth == "R"){
		editable=false;
	}	
	JooSetBtnClass("C", editable);	
	
	for (var i=0; i < sheetObjects.length; i++) {
		sheetObjects[i].SetEditable(editable);
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (formObj.diff_only_yn.checked){
				if (formObj.fm_acct_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00089');
					return false;
				}
				if (formObj.to_acct_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00089');
					return false;
				}
				var fmDate=ComReplaceStr(formObj.fm_acct_yrmon.value,"-","")+"01";
				var toDate=ComReplaceStr(formObj.to_acct_yrmon.value,"-","")+"01";
				var fmDateAdd6m=ComGetDateAdd(fmDate,"M",6);
				//error msg in case of gap over 6 months
				if (ComGetDaysBetween(fmDateAdd6m, toDate) > 0){
					ComShowCodeMessage("JOO00090");
					return false;
				}
				var yrmon=ComReplaceStr(formObj.acct_yrmon.value,"-","")+"01";
				//to_acct_yrmon < acct_yrmon
				if (ComGetDaysBetween(toDate, yrmon) < 0){
					ComShowCodeMessage("JOO00091");
					return false;
				}
			}
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
				return false;
			}
			if (ComIsEmpty(formObj.jo_crr_cd)){
				ComShowCodeMessage('JOO00008');
				return false;
			}
			if (ComIsEmpty(formObj.trd_cd)){
				ComShowCodeMessage('JOO00009');
				return false;
			}
			if (ComIsEmpty(formObj.rlane_cd)){
				ComShowCodeMessage('JOO00010');
				return false;
			}
			break;
		case IBSAVE:   //save
			var cnt=0;
			for (var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){
				var status=sheetObj.GetRowStatus(inx);
				if (status =="R")
					continue;
				cnt++;
				var slip=sheetObj.GetCellValue(inx, prefix+"slip_no");
				if (status == "D" &&  slip != ""){
					ComShowCodeMessage('JOO00057',inx, slip);
					sheetObj.SelectCell(inx, prefix+"del_chk", true);
					return false;
				}
				if ((status == "I" || status == "U") && sheetObj.GetCellValue(inx, prefix+"del_chk") == "1"){
					ComShowCodeMessage("JOO00079");
					sheetObj.SelectCell(inx,prefix+"del_chk",true);
					return false;
				}
				if (sheetObj.GetCellValue(inx, prefix+"vsl_cd").length < 4){
					ComShowCodeMessage('JOO00040',inx);
					sheetObj.SelectCell(inx, prefix+"vsl_cd", true);
					return false;
				}
				if (sheetObj.GetCellValue(inx, prefix+"skd_voy_no").length < 4){
					ComShowCodeMessage('JOO00041',inx);
					sheetObj.SelectCell(inx, prefix+"skd_voy_no", true);
					return false;
				}
				if (sheetObj.GetCellValue(inx, prefix+"skd_dir_cd").length < 1){
					ComShowCodeMessage('JOO00042',inx);
					sheetObj.SelectCell(inx, prefix+"skd_dir_cd", true);
					return false;
				}
				if (sheetObj.GetCellValue(inx, prefix+"rev_dir_cd").length < 1){
					ComShowCodeMessage('JOO00055',inx);
					sheetObj.SelectCell(inx, prefix+"rev_dir_cd", true);
					return false;
				}
				if (sheetObj.GetCellValue(inx, prefix+"stl_locl_amt").length == 0){
					ComShowCodeMessage('JOO00056',inx);
					sheetObj.SelectCell(inx, prefix+"stl_locl_amt", true);
					return false;
				}
			}
			if(cnt==0){
				cnt = sheetObj.RowCount("D");
			}
			if (cnt==0){
				ComShowCodeMessage('JOO00036');
				return false;
			}
			break;
	}
	return true;
}
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {	
	// UI성능개선(민정호 201407)
	if(sheetObj.LastRow() > sheetObj.HeaderRows()){		
		sheetObj.SetSumText(0,prefix+"jo_stl_jb_cd","TOTAL");
	}	
	//can't delete in case of existing combined data
	for (var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){			
		var rowStatus=sheetObj.GetRowStatus(inx);
		var stlCmbSeq=sheetObj.GetCellValue(inx, prefix+"stl_cmb_seq");
			
		if (rowStatus == "R" && ComTrim(stlCmbSeq) != ""){
			sheetObj.SetCellEditable(inx, prefix+"del_chk",0);
		}else{
			sheetObj.SetCellEditable(inx, prefix+"del_chk",1);
		}
	}
}
function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode, Shift){
	var sName=sheetObj.ColSaveName(Col);
	var Value=sheetObj.GetEditText();
	//moving next field in case of inputting 4 characters
	if ((sName == (prefix+"vsl_cd")) && (Value.length == 4)){
		sheetObj.SelectCell(Row, prefix+"skd_voy_no",true);
	}
	//moving next field in case of inputting 4 characters
	if (sName == prefix+"skd_voy_no" && Value.length==4){
		sheetObj.SelectCell(Row, prefix+"skd_dir_cd",true);
	}
}
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	gCurRow=Row;
}
/**
 * changing acct_yrmon in case of changing acct_yrmon
 * @param acctYrmon
 * @return
 */
function UF_setAcctYrmon(acctYrmon){
	var sheetObj=sheetObjects[0];
	for (var inx=sheetObj.HeaderRows(); inx < sheetObj.LastRow(); inx++){
		if (sheetObj.GetRowStatus(inx) != "I") continue;
		sheetObj.SetCellValue(inx, prefix+"acct_yrmon",acctYrmon,0);
	}
}
function UF_checkPeriod(fr, to){
	var fmDate=ComReplaceStr(fr)+"01";  
	var toDate=ComReplaceStr(to)+"01";  
	if (ComGetDaysBetween(fmDate, toDate) < 0){
		ComShowCodeMessage("JOO00078");
		return false;
	}
//	var fmDateAdd6m = ComGetDateAdd(fmDate,"M",6);
//	
//	if (ComGetDaysBetween(fmDateAdd6m, toDate) > 0){
//		ComShowCodeMessage("JOO00090");
//		return false;
//	}
	return true;
}


function calDiffTEUAmt(sheet1_bsa_slt_prc, sheet1_dtl_bsa_qty){
	return ComRound(sheet1_bsa_slt_prc * sheet1_dtl_bsa_qty,2);
}

function calDiffPrcAmt(sheet1_dtl_bsa_slt_prc, sheet1_bsa_qty1){
	return ComRound(sheet1_dtl_bsa_slt_prc * sheet1_bsa_qty1,2);
}

function UF_reset(){
	var formObj = document.form;
	ComResetAll();
	sheetObjects[0].RemoveAll();

	cmb_jo_crr_cd.SetSelectIndex(-1,0);	
	formObj.re_divr_cd[0].checked=true;	
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
