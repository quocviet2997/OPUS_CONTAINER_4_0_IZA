/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0005.js
*@FileTitle  : Entry and Inquiry of Target Voyage Choose by Settlement Item
*@author     : CLT 
*@version    : 1.0
*@since      : 2014/06/26
=========================================================*/
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var gBasicPortCombo;
var gPairPortCombo;
var gUnitPortCombo;
//현재 row
var gCurRow;
//VVD
var gVVD;
var prefix="sheet1_";
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
		if (srcName == null || srcName == "re_divr_cd") {
			return;
		}
		//return in case class is btn1_1
		if (!JooBtnClickEnable(srcName)) {
			return;
		}
		switch (srcName) {
		case "btn_retrieve":
			doActionIBSheet(sheetObject1, formObj, IBSEARCH);
			break;
		case "btn_create":			
			doActionIBSheet(sheetObject1, formObj, IBCREATE);
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
 				var downCols = "";
 				downCols += "sheet1_vsl_cd|sheet1_skd_voy_no|sheet1_skd_dir_cd|sheet1_rev_dir_cd|sheet1_jo_stl_itm_cd|";
 				downCols += "sheet1_jo_mnl_cre_flg|sheet1_stl_bzc_port_cd|sheet1_agmt_mon_cond_cd|sheet1_agmt_port_cond_cd|";
 				downCols += "sheet1_agmt_port_tp_cond_cd|sheet1_agmt_op_tp_cond_cd|sheet1_jo_stl_cfm_cd|sheet1_bzc_port_eta_dt|";
 				downCols += "sheet1_bzc_port_etd_dt|sheet1_proc_jb_flg|sheet1_stl_rmk";
 				sheetObject1.Down2Excel({ HiddenColumn:1,CheckBoxOnValue:"Y" ,CheckBoxOffValue:"N" , Merge:1, DownCols:downCols});
 			}	
			break;
		case "btn_lskd":
			if (!validateForm(sheetObject1, formObj, IBSEARCHAPPEND))
				return;	

			UF_popLSKD();
			break;
		case "btn_copy":
			if (!validateForm(sheetObject1, formObj, IBSEARCHAPPEND))
				return;	
			UF_copyRow();
			break;
		case "btn_add":
			if (!validateForm(sheetObject1, formObj, IBSEARCHAPPEND))
				return;	
			UF_addRow();
			break;
		case "btn_del":
			JooRowHideDelete(sheetObject1, prefix+"del_chk");
			break;
		case "btns_back":
	    	sheetObjects[0].RemoveAll();
			if (formObj.acct_yrmon.value!=""){
				formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);
			}
			doActionIBSheet(sheetObject1, formObj, IBSEARCH_ASYNC10);

			break;
		case "btns_next":
			sheetObjects[0].RemoveAll();
			if (formObj.acct_yrmon.value!=""){
				formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M", 1).substring(0,7);
			}
			doActionIBSheet(sheetObject1, formObj, IBSEARCH_ASYNC10);

			break;
		case "proc_jb_flg":
			if (formObj.proc_jb_flg.checked){
				formObj.proc_jb_flg.value="Y";
			}else{
				formObj.proc_jb_flg.value="N";
			}
			sheetObjects[0].RemoveAll();
			break;
		//proc_jb_flg is Y. but to delete Target VVD by Adjust, delete that jo_stl_cfm_cd is N.
		case "btn_enable":
			var sheetObj=sheetObjects[0];
			var cnt=0;
			for(var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
				if (sheetObj.GetCellValue(i, prefix+"jo_stl_cfm_cd") == "N" && sheetObj.GetCellValue(i, prefix+"proc_jb_flg") == "Y"){
					cnt++;
				}
			}
			//activating delete button
			if (cnt >0){
				JooSetBtnClass("C", false);
				JooSetBtnClass("U", false);
				JooSetBtnClass("D", true);
				sheetObj.SetEditable(1);
				for(var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
					if (sheetObj.GetCellValue(i, prefix+"jo_stl_cfm_cd") == "N" && sheetObj.GetCellValue(i, prefix+"proc_jb_flg") == "Y"){
						sheetObj.SetCellEditable(i, prefix+"stl_rmk",0);
						sheetObj.SetCellEditable(i, prefix+"del_chk",1);
					}else{
						sheetObj.SetRowEditable(i,0);
					}
				}
			}
			break;
			//proc_jb_flg is Y. but to delete Target VVD by Adjust, delete that jo_stl_cfm_cd is N.
		case "btn_delete":
			doActionIBSheet(sheetObject1, formObj, IBDELETE);
			break;
		} // end switch
	} catch (e) {
		if (e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
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
function loadPage(crrCombo,abbrSheet,dirSheet) {
	for (i=0; i < sheetObjects.length; i++) {
		ComConfigSheet(sheetObjects[i]);
		initSheet(sheetObjects[i], i+1, abbrSheet, dirSheet);
		ComEndConfigSheet(sheetObjects[i]);
	}
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1, crrCombo);
    }
    gBasicPortCombo=new Array(300);//max row is 300
    gPairPortCombo=new Array(300);//max row is 300
    gUnitPortCombo=new Array(300);//max row is 300
    initControl();
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

	//[2015.09.18] New Carrier jo_crr_cd/trd_cd/rlane_cd 조회.
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC20);
    
    formObj.acct_yrmon.focus();
}

/**
 * OnBlur
 * @return
 */
function obj_blur(){
	ComChkObjValid(event.srcElement);
	var src=ComGetEvent("name")
    if (src == "acct_yrmon"){
    	ComAddSeparator(ComGetEvent(), "Ym");
    	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
    }
}

function change_event_radio(){
	sheetObjects[0].RemoveAll();
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
}
/**
 * 
 * @param sheetObj
 * @param Row
 * @param rlaneCd
 * @param skdDirCd
 * @return
 */
function UF_setPortCombo(sheetObj, Row, rlaneCd, skdDirCd){
	var portItems="";
	for (var inx=0; inx < gBasicPortCombo.length; inx++){
		if ((rlaneCd == gBasicPortCombo[inx][0]) && (skdDirCd == gBasicPortCombo[inx][1])){
			portItems=portItems + gBasicPortCombo[inx][2] +"|";
		}
	}
	if (portItems.length > 0){
		portItems=portItems.substring(0,portItems.length-1);
	}
    sheetObj.CellComboItem(Row,prefix+"stl_bzc_port_cd", {ComboText:portItems, ComboCode:portItems} );
    sheetObj.CellComboItem(Row,prefix+"stl_pair_port_cd", {ComboText:portItems, ComboCode:portItems} );
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo, abbrSheet, dirSheet) {

	var cnt = 0;
	var sheetID = sheetObj.id;
	switch (sheetID) {
	case "sheet1":
		with (sheetObj) {
	        
	        if (location.hostname != "")
	        //no support[check again]CLT 				InitHostInfo(location.hostname, location.port, page_path);
	        var HeadTitle="STS||VSL|VOY|Dir.|Fin.\nDir|Item|Manual\nSettle|Basic\nPort|Status|Status|Status|Status|Confirm|ETA|ETD|Basic\nPair Port|"+
	        "Pair Port ETA|Pair Port ETD|Settle.\nStatus|Unit Cost\nBasic Port|Unit Cost\nBasic Por ETD|Remark|"+
	        "h_acct_yrmon|h_stl_vvd_seq|h_trd_cd|h_jo_crr_cd|h_rlane_cd|h_jo_mnu_nm|re_divr_cd|jo_mnu_nm1|status|rev_yrmon|pop_flg|rvs_flg|pending_flg";
	        var headCount=ComCountHeadTitle(HeadTitle);
	
	        SetConfig( { SearchMode:2, MergeSheet:1, Page:20, FrozenCol:8, DataRowMerge:0 } );
	
	        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);
	
	        var cols = [ {Type:"Status",    Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
               {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
               {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
               {Type:"Text",      Hidden:0,  Width:35,   Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_voy_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:4 },
               {Type:"Combo",     Hidden:0, Width:35,   Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_dir_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_dir_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Combo",     Hidden:0, Width:45,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"CheckBox",  Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_mnl_cre_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:-1 },
               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_bzc_port_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               
               {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_mon_cond_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_port_cond_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_port_tp_cond_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Combo",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"agmt_op_tp_cond_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },               
               {Type:"Combo",     Hidden:0, Width:55,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_stl_cfm_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
               
               {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bzc_port_eta_dt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bzc_port_etd_dt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:prefix+"stl_pair_port_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:1,  Width:0,  Align:"Center",  ColMerge:0,   SaveName:prefix+"pair_port_eta_dt",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1,  Width:0,  Align:"Center",  ColMerge:0,   SaveName:prefix+"pair_port_etd_dt",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"proc_jb_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,   Align:"Center",  ColMerge:0,   SaveName:prefix+"uc_bss_port_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
               {Type:"Text",      Hidden:1, Width:0,  Align:"Center",  ColMerge:0,   SaveName:prefix+"uc_bss_port_etd_dt",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:0,  Width:80,   Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_rmk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"acct_yrmon",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_vvd_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_crr_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rlane_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_mnu_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"re_divr_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_mnu_nm1",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"stl_tgt_vvd_bss_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rev_yrmon",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"pop_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"rvs_flg",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
               {Type:"Text",      Hidden:1, Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"pending_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
	        
            InitColumns(cols);
	        
			SetColProperty(prefix+"jo_stl_cfm_cd", {ComboText:"YES|PENDING|NO", ComboCode:"Y|P|N"} );			
			SetColProperty(prefix+"skd_dir_cd", {ComboText:dirSheet, ComboCode:dirSheet} );
			SetColProperty(prefix+"jo_stl_itm_cd", {ComboText:abbrSheet, ComboCode:abbrSheet} );
			//InitDataCombo(0, prefix+"stl_tgt_vvd_bss_cd", staSheet , staSheet );
			
			InitDataCombo(0, prefix+"agmt_mon_cond_cd"     , UF_getComboStringForSheet(gMnthCondSheet, gMnthNameSheet), gMnthCondSheet);
			InitDataCombo(0, prefix+"agmt_port_cond_cd"    , UF_getComboStringForSheet(gPortCondSheet, gPortNameSheet), gPortCondSheet);
			InitDataCombo(0, prefix+"agmt_port_tp_cond_cd" , UF_getComboStringForSheet(gPortTypeSheet, gPtTpNameSheet), gPortTypeSheet);
			InitDataCombo(0, prefix+"agmt_op_tp_cond_cd"   , UF_getComboStringForSheet(gOperTypeSheet, gOperNameSheet), gOperTypeSheet);
			
			SetColProperty(0 ,prefix+"vsl_cd" , {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			SetColProperty(0 ,prefix+"skd_voy_no" , {AcceptKeys:"N"});
//			SetColProperty(0 ,prefix+"stl_rmk" , {AcceptKeys:"E"});
						
            SetColProperty(prefix+"bzc_port_eta_dt", {Format:"####-##-## ##:##:##"} );
            SetColProperty(prefix+"bzc_port_etd_dt", {Format:"####-##-## ##:##:##"} );
            SetColProperty(prefix+"pair_port_eta_dt", {Format:"####-##-## ##:##:##"} );
            SetColProperty(prefix+"pair_port_etd_dt", {Format:"####-##-## ##:##:##"} );
            SetColProperty(prefix+"uc_bss_port_etd_dt", {Format:"####-##-## ##:##:##"} );
            
			SetEditable(1);
//			SetSheetHeight(450);	        
			resizeSheet();
		}
		break;		
	case "2" :
		with (sheetObj) {
	        if (location.hostname != "")
	            var HeadTitle="||||||||||"; //11
	        var headCount=ComCountHeadTitle(HeadTitle);
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"} ];
	        InitHeaders(headers, info);
	        var cols = 
	        	[ {Type:"Status",   Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		          {Type:"Text",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_auth_cd",		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",          	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"acct_yrmon",      	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"super_cd1",     		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"auth_delcheck_yn",	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"super_cd2",    		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:75,   Align:"Center",  ColMerge:0,   SaveName:"name",      			KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"jo_crr_cd",  		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"code",  				KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          {Type:"Text",     Hidden:0, Width:65,   Align:"Center",  ColMerge:0,   SaveName:"sort_key",  			KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		          ];
            InitColumns(cols);
            SetEditable(1);
		    SetVisible(0);
			SetSheetHeight(70);
		}
		break;

	}
}
//handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction, flag) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction))
		return;	
 		
	formObj.acct_yrmon.value=ComGetUnMaskedValue($("#acct_yrmon").val(),"ym");
	
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0005GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			break;
		case IBCREATE: //CREATE
			formObj.f_cmd.value=SEARCH02;
 			var sXml=sheetObj.GetSearchData("FNS_JOO_0005GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			break;
		case IBSAVE: //save
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			formObj.f_cmd.value=MULTI;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0005GS.do", ComGetSaveString(sheetObj) + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			ComOpenWait(false);
			//retrieve
			//if (ComGetEtcData(sXml, "TRANS_RESULT_KEY") == "S")
			doActionIBSheet(sheetObj, formObj, IBSEARCH);
			break;
		//getting Fin.Dir in case of inputting VVD 9 digit
		case IBSEARCH_ASYNC01: //getting Port
			formObj.f_cmd.value		= SEARCHLIST10;
			formObj.code.value 		= JooComGetCarrierText(cmb_jo_crr_cd, 0);//jo_crr_cd
			formObj.name.value		= formObj.jo_stl_opt_cd.value; 
			formObj.super_cd1.value	= JooComGetCarrierText(cmb_jo_crr_cd, 2);//rlane_cd
			formObj.super_cd2.value	= gVVD;
			
 	        var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
	        var basicPorts=ComGetEtcData(sXml, "basicPorts");
	        var pairPorts=ComGetEtcData(sXml, "pairPorts");
	        var unitPorts=ComGetEtcData(sXml, "unitPorts");   
	        //gBasicPortCombo[inx][0] ==> rlane_dir_cd
	        //gBasicPortCombo[inx][1] ==> delt_flg of rlane_dir_cd
	        //gBasicPortCombo[inx][2] ==> basic port
	        //gBasicPortCombo[inx][3] ==> eta
	        //gBasicPortCombo[inx][4] ==> etd
	        gBasicPortCombo[gCurRow]=basicPorts.split("|");
	        //gPairPortCombo[inx][0] ==> pair port
	        //gPairPortCombo[inx][1] ==> eta
	        //gPairPortCombo[inx][2] ==> etd
	        gPairPortCombo[gCurRow]=pairPorts.split("|");
	        //gUnitPortCombo[inx][0] ==> pair port
	        //gUnitPortCombo[inx][1] ==> etd
	        gUnitPortCombo[gCurRow]=unitPorts.split("|");
	        var cnt=gBasicPortCombo[gCurRow].length;
	        if (gBasicPortCombo[gCurRow] == "" || cnt==0){
	        	ComShowCodeMessage('JOO00031');
    			sheetObj.SetCellValue(gCurRow, prefix+"vsl_cd","",0);
    			sheetObj.SetCellValue(gCurRow, prefix+"skd_voy_no","",0);
    			sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd","",0);
    			sheetObj.SelectCell(gCurRow, prefix+"vsl_cd", true);
        		return;	        		
	        }
	        var basicPortCombo="";
	        for (var inx=0; inx < cnt;  inx++){
	        	gBasicPortCombo[gCurRow][inx]=gBasicPortCombo[gCurRow][inx].split(",");
		        if (inx == cnt -1){
		        	basicPortCombo += gBasicPortCombo[gCurRow][inx][2];
	        	}else{
	        		basicPortCombo += gBasicPortCombo[gCurRow][inx][2]+"|";
	        	}
	        }
	        //in case of deleted VVD
	        var deltFlg=gBasicPortCombo[gCurRow][0][1];	        
	        if (deltFlg == "Y"){
	        	if (!ComShowCodeConfirm('JOO00032',gVVD)) {
	    			sheetObj.SetCellValue(gCurRow, prefix+"vsl_cd","",0);
	    			sheetObj.SetCellValue(gCurRow, prefix+"skd_voy_no","",0);
	    			sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd","",0);
	    			sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd","",0);
	    			sheetObj.SelectCell(gCurRow, prefix+"vsl_cd", true);
	        		return;	        		
	        	}
	        }
	        //revenue lane direction setting
			sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd" ,gBasicPortCombo[gCurRow][0][0]);
	        var pairPortCombo="";
	        cnt=gPairPortCombo[gCurRow].length;
	        for (var inx=0; inx < cnt;  inx++){
	        	gPairPortCombo[gCurRow][inx]=gPairPortCombo[gCurRow][inx].split(",");
		        if (inx == cnt -1){
		        	pairPortCombo += gPairPortCombo[gCurRow][inx][0];
	        	}else{
	        		pairPortCombo += gPairPortCombo[gCurRow][inx][0]+"|";
	        	}
	        }
	        var unitPortCombo="";
	        cnt=gUnitPortCombo[gCurRow].length;
	        for (var inx=0; inx < cnt; inx++) {
	        	gUnitPortCombo[gCurRow][inx]=gUnitPortCombo[gCurRow][inx].split(",");
		        if (inx == cnt -1){
		        	unitPortCombo += gUnitPortCombo[gCurRow][inx][0];
		        }else{
		        	unitPortCombo += gUnitPortCombo[gCurRow][inx][0]+"|";
		        }
	        }
	        //changing combo
 	        sheetObj.InitCellProperty(gCurRow, 8,{ Type:"Combo",Align:"Center",Format:"dfNone"} );
 	        sheetObj.InitCellProperty(gCurRow,16,{ Type:"Combo",Align:"Center",Format:"dfNone"} );
 	        //	        sheetObj.InitCellProperty(gCurRow,20, dtCombo, daCenter, prefix+"uc_bss_port_cd", "", dfNone);
			sheetObj.CellComboItem(gCurRow,prefix+"stl_bzc_port_cd", {ComboText:basicPortCombo, ComboCode:basicPortCombo} );
			sheetObj.CellComboItem(gCurRow,prefix+"stl_pair_port_cd", {ComboText:pairPortCombo, ComboCode:pairPortCombo} );
			//			sheetObj.CellComboItem(gCurRow, prefix+"uc_bss_port_cd"  , unitPortCombo , unitPortCombo , 0);
			sheetObj.SetCellValue(gCurRow, prefix+"stl_bzc_port_cd"   ,"",0);
			sheetObj.SetCellValue(gCurRow, prefix+"bzc_port_eta_dt"   ,"",0);
			sheetObj.SetCellValue(gCurRow, prefix+"bzc_port_etd_dt"   ,"",0);
			sheetObj.SetCellValue(gCurRow, prefix+"stl_pair_port_cd"  ,"",0);
			sheetObj.SetCellValue(gCurRow, prefix+"pair_port_eta_dt"  ,"",0);
			sheetObj.SetCellValue(gCurRow, prefix+"pair_port_etd_dt"  ,"",0);
			//			sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_cd"    ) = "";
			//			sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_etd_dt") = "";
	        break;
	        
	     // ITEM을 OUS로 변경할 경우 RDR인지 TDR인지 BASIC PORT를 검색하여 Setting한다.
		case IBSEARCH_ASYNC02: //getting OUS TDR/RDR
			formObj.f_cmd.value=SEARCH01;
			//getting total row not only revised
			var SaveStr=ComGetSaveString(sheetObj,true,true,-1);
 			var sXml=sheetObj.GetSaveData("FNS_JOO_0005GS.do", SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			var joMnuNm=ComGetEtcData(sXml,"jo_mnu_nm");
			var flg=sheetObj.GetCellValue(gCurRow,prefix+"jo_mnl_cre_flg");
			if (flg=="1"){
				sheetObj.SetCellValue(gCurRow, prefix+"jo_mnu_nm","M/S");
			}else{
				sheetObj.SetCellValue(gCurRow, prefix+"jo_mnu_nm",joMnuNm);
			}
			sheetObj.SetCellValue(gCurRow, prefix+"jo_mnu_nm1",joMnuNm);
			break;
		case IBSEARCH_ASYNC03: //getting UnitCost Port
			formObj.f_cmd.value		= SEARCHLIST14;
			formObj.code.value		= JooComGetCarrierText(cmb_jo_crr_cd, 0); //jo_crr_cd
			formObj.super_cd1.value	= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			formObj.super_cd2.value	= gVVD;
			
 	        var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
	        var unitPorts=ComGetEtcData(sXml, "unitPorts");   
	        //gUnitPortCombo[Row][portInx][0] ==> pair port
	        //gUnitPortCombo[Row][portInx][1] ==> etd
	        gUnitPortCombo[gCurRow]=unitPorts.split("|");
	        var unitPortCombo="";
	        var cnt=gUnitPortCombo[gCurRow].length;
	        for (var inx=0; inx < cnt; inx++) {
	        	gUnitPortCombo[gCurRow][inx]=gUnitPortCombo[gCurRow][inx].split(",");
		        if (inx == cnt -1){
		        	unitPortCombo += gUnitPortCombo[gCurRow][inx][0];
		        }else{
		        	unitPortCombo += gUnitPortCombo[gCurRow][inx][0]+"|";
		        }
	        }
//	        sheetObj.InitCellProperty(gCurRow,20, dtCombo, daCenter, prefix+"uc_bss_port_cd", "", dfNone);
//			sheetObj.CellComboItem(gCurRow, prefix+"uc_bss_port_cd"  , unitPortCombo , unitPortCombo , 0);
			//sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_cd"  ) = "";
			//sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_etd_dt"  ) = "";
	        break;
		case IBSEARCH_ASYNC04: //getting Unit Cost Port
			formObj.f_cmd.value		= SEARCH09;
			formObj.code.value		= JooComGetCarrierText(cmb_jo_crr_cd, 0);//jo_crr_cd
			formObj.super_cd1.value	= JooComGetCarrierText(cmb_jo_crr_cd, 2); //rlane_cd
			formObj.super_cd2.value	= gVVD;
			
 	        var sXml=sheetObj.GetSearchData("JOOCommonGS.do", FormQueryString(formObj));
	        var unitPorts=ComGetEtcData(sXml, "unitPorts");   
	        //if VVD is deleted
	        var deltFlg=ComGetEtcData(sXml, "deltFlg");
	        var revDirCd=ComGetEtcData(sXml, "revDirCd");
	        if (deltFlg == "Y"){
	        	if (!ComShowCodeConfirm('JOO00032',gVVD)) {
	    			sheetObj.SetCellValue(gCurRow, prefix+"vsl_cd","",0);
	    			sheetObj.SetCellValue(gCurRow, prefix+"skd_voy_no","",0);
	    			sheetObj.SetCellValue(gCurRow, prefix+"skd_dir_cd","",0);
	    			sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd","",0);
	    			sheetObj.SelectCell(gCurRow, prefix+"vsl_cd", true);
	        		return;	        		
	        	}
	        }
	        //revenue lane direction setting
			sheetObj.SetCellValue(gCurRow, prefix+"rev_dir_cd" ,revDirCd);
	        //gUnitPortCombo[Row][portInx][0] ==> pair port
	        //gUnitPortCombo[Row][portInx][1] ==> etd
	        gUnitPortCombo[gCurRow]=unitPorts.split("|");
	        var unitPortCombo="";
	        var cnt=gUnitPortCombo[gCurRow].length;
	        for (var inx=0; inx < cnt; inx++) {
	        	gUnitPortCombo[gCurRow][inx]=gUnitPortCombo[gCurRow][inx].split(",");
		        if (inx == cnt -1){
		        	unitPortCombo += gUnitPortCombo[gCurRow][inx][0];
		        }else{
		        	unitPortCombo += gUnitPortCombo[gCurRow][inx][0]+"|";
		        }
	        }
//	        sheetObj.InitCellProperty(gCurRow,20, dtCombo, daCenter, prefix+"uc_bss_port_cd", "", dfNone);
//			sheetObj.CellComboItem(gCurRow, prefix+"uc_bss_port_cd"  , unitPortCombo , unitPortCombo , 0);
//			sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_cd"  ) = "";
//			sheetObj.CellValue2(gCurRow, prefix+"uc_bss_port_etd_dt"  ) = "";
	        break;
		case IBDELETE: //delete
			if (!ComShowCodeConfirm("JOO00135", "selected")){
				return false;
			}
			formObj.f_cmd.value=REMOVE;
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			try{
 				var sXml=sheetObj.GetSaveData("FNS_JOO_0005GS.do", ComGetSaveString(sheetObj) + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
			}finally{
				ComOpenWait(false);
			}
			//retrieve
			if (ComGetEtcData(sXml, "TRANS_RESULT_KEY") == "S")
				if (ComGetEtcData(sXml,"RTNVAL") == "E"){
					ComShowCodeMessage("JOO00183");
				}else{
					sheetObj.LoadSearchData(sXml,{Sync:1} );
					doActionIBSheet(sheetObj, formObj, IBSEARCH);
				}
			break;

		case IBSEARCH_ASYNC10: //retrieving closing status
			formObj.f_cmd.value=SEARCH10;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0005GS.do", FormQueryString(formObj));
			if (ComGetEtcData(sXml,"TRANS_RESULT_KEY") == "S"){
				gClzYn=ComGetEtcData(sXml,"clz_yn"); 
				if (gClzYn == "C"){
					//ComShowCodeMessage("JOO00177");
					JooSetBtnClass("C", false);
					JooSetBtnClass("U", false);
			
					sheetObjects[0].SetEditable(0);
				//if Open status, activating or deactivating button by Authority
				}else{
					JooSetBtnClass("C", true);
					JooSetBtnClass("U", true);
					if (!(Number(cmb_jo_crr_cd.GetSelectIndex()) == -1 || cmb_jo_crr_cd.GetSelectCode() == "")){

						var selJoStlOptCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 3);//jo_stl_opt_cd
						var selCrrAuthCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 4);//jo_crr_auth_cd
						
						UF_setAuth(selCrrAuthCd, selJoStlOptCd);
					}
				}
			}
			break;
			
		case IBSEARCH_ASYNC20 : //2015.09.17 MultiCombo Rlane CD			
			var params = "";					
			params += "f_cmd=" + SEARCH21; 
			params += "&jo_stl_itm_cd=";	 			
			params += "&re_divr_cd="; 
			
			var sXml = sheetObj.GetSearchData("JOOCommonGS.do", params);
			ComXml2ComboItem(sXml, cmb_jo_crr_cd, "grp_key", "jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|re_divr_cd");
			break;
			
			
	}
	formObj.acct_yrmon.value=ComGetMaskedValue($("#acct_yrmon").val(), "ym","-");
}
/**
 * setting Combo basic info 
 * param : comboObj, comboNo
 * initializing sheet 
 */ 
function initCombo(comboObj, comboNo, crrCombo) {
    var formObj=document.form
    switch(comboNo) {
		case 1: 
	        with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetTitleVisible(1);//title
				SetTitle("Carrier|Trade|Lane|S.Option|Auth|Rev/Exp")
				SetColAlign(0, "center");
				SetColAlign(1, "center");
				SetColAlign(2, "center");
				SetColAlign(3, "center");
				SetColAlign(4, "center");
				SetColAlign(5, "center");
				SetColWidth(0, "40");
				SetColWidth(1, "40");
				SetColWidth(2, "60");
				SetColWidth(3, "60");
				SetColWidth(4, "0");
				SetColWidth(5, "0");
				//SetDropHeight(160);
				ValidChar(2,1);//only upper case, numbers
				SetSelectIndex(0);
		    }
			break;
 	} 
}


//jo_crr_cd|trd_cd|rlane_cd|jo_stl_opt_cd|jo_crr_auth_cd|re_divr_cd
function cmb_jo_crr_cd_OnChange(comboObj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode) { 
	if(OldIndex == NewIndex) return;
	
	var formObj = document.form;
	var selJoCrrCd 		= JooComGetCarrierText(comboObj, 0); //jo_crr_cd
	var selTrdCd 		= JooComGetCarrierText(comboObj, 1); //trd_cd
	var selRlaneCd 		= JooComGetCarrierText(comboObj, 2); //rlane_cd
	var selJoStlOptCd 	= JooComGetCarrierText(comboObj, 3); //jo_stl_opt_cd
	var selCrrAuthCd 	= JooComGetCarrierText(comboObj, 4); //jo_crr_auth_cd
	var selReDivrCd 	= JooComGetCarrierText(comboObj, 5); //re_divr_cd
	

	ComSetObjValue(formObj.jo_crr_cd	, selJoCrrCd);
	ComSetObjValue(formObj.trd_cd		, selTrdCd);
	ComSetObjValue(formObj.rlane_cd		, selRlaneCd);
	ComSetObjValue(formObj.jo_stl_opt_cd, selJoStlOptCd);
	
	UF_setReDivrCd(selReDivrCd);	
	
	UF_setAuth(selCrrAuthCd, selJoStlOptCd);//jo_crr_auth_cd, jo_stl_opt_cd
		
	sheetObjects[0].RemoveAll();
}

/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	switch (sAction) {
		case IBSEARCH: //retrieve
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
				formObj.acct_yrmon.focus();
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
		case IBCREATE: //retrieving for saving
			if (formObj.acct_yrmon.value.length == 0){
				ComShowCodeMessage('JOO00033');
				formObj.acct_yrmon.focus();
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
			var revYrmonNull="";
			var pendingList="";
			var hasPending=false;
			for (var inx=1; inx <= sheetObj.LastRow(); inx++){
				var ibflag=sheetObj.GetRowStatus(inx);
				if (ibflag == "R")
					continue;
				cnt++;
				//deleted item
				if (ibflag == "D")
					continue;
				var stlOptCd=formObj.jo_stl_opt_cd.value;
				//to prohibit only del_chk checked
				if ((ibflag == "I" || ibflag == "U") && sheetObj.GetCellValue(inx,prefix+"del_chk") == "1"){
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
				if (sheetObj.GetCellValue(inx, prefix+"jo_stl_itm_cd").length < 3){
					ComShowCodeMessage('JOO00043',inx);
					sheetObj.SelectCell(inx, prefix+"jo_stl_itm_cd", true);
					return false;
				}
				var joStlItmCd=sheetObj.GetCellValue(inx, prefix+"jo_stl_itm_cd");
				var joMnuNm=sheetObj.GetCellValue(inx, prefix+"jo_mnu_nm");
				//P/B, W/R, OTH는 Basic Port가 없어도 된다?
				if (!(joStlItmCd == "P/B" || joStlItmCd == "W/R" || joStlItmCd == "OTH")){
					if (sheetObj.GetCellValue(inx, prefix+"stl_bzc_port_cd").length == 0){
						ComShowCodeMessage('JOO00044',inx);
						sheetObj.SelectCell(inx, prefix+"stl_bzc_port_cd", true);
						return false;
					}
				}
				//in case of Cycle, Status can not exist.
				if (stlOptCd != "C"){
					var mnthCondCd=sheetObj.GetCellValue(inx,prefix+"mnth_cond_cd");
					if (mnthCondCd == ""){
						ComShowCodeMessage('JOO00019', inx + " Month Option ");
						sheetObj.SelectCell(inx,prefix+"mnth_cond_cd",true);
						return false;
					}
					var portCondCd=sheetObj.GetCellValue(inx,prefix+"port_cond_cd");
					if (portCondCd == ""){
						ComShowCodeMessage('JOO00019', inx + " Port Option ");
						sheetObj.SelectCell(inx,prefix+"port_cond_cd",true);
						return false;
					}
					var portTypeCd=sheetObj.GetCellValue(inx,prefix+"port_type_cd");
					if (portTypeCd == ""){
						ComShowCodeMessage('JOO00019', inx + " Port Type ");
						sheetObj.SelectCell(inx,prefix+"port_type_cd",true);
						return false;
					}
					var operTypeCd=sheetObj.GetCellValue(inx,prefix+"oper_type_cd");
					if (operTypeCd == ""){
						ComShowCodeMessage('JOO00019', inx + " Operation Type ");
						sheetObj.SelectCell(inx,prefix+"oper_type_cd",true);
						return false;
					}
				}
				//error message when Basic Port == Basic Pair Port
				//P/B, W/R, OTH는 Basic Pair Port 가 없어도 된다? => 그외에 Basic Port와 Basic Pair Port가 같으면 Error Message				
				if (!(joStlItmCd == "P/B" || joStlItmCd == "W/R" || joStlItmCd == "OTH")){
					if (sheetObj.GetCellValue(inx, prefix+"stl_bzc_port_cd") == sheetObj.GetCellValue(inx, prefix+"stl_pair_port_cd")){
						ComShowCodeMessage('JOO00029', inx);
						sheetObj.SelectCell(inx, prefix+"stl_pair_port_cd", true);
						return false;
					}
				}
//				var ucBssPortCd = sheetObj.CellValue(inx, prefix+"uc_bss_port_cd");
//				if (ucBssPortCd == ""){
//					if ((joStlItmCd == "S/H" || joStlItmCd == "OUS" || joStlItmCd == "R/F") && (joMnuNm != "M/S")){
//						ComShowCodeMessage('JOO00035',inx);
//						sheetObj.SelectCell(inx, prefix+"uc_bss_port_cd", true);
//						return false;
//					}
//				}
//				var ucBssPortDt = sheetObj.CellValue(inx, prefix+"uc_bss_port_etd_dt");
//				if (ucBssPortDt == ""){
//					if ((joStlItmCd == "S/H" || joStlItmCd == "OUS" || joStlItmCd == "R/F") && (joMnuNm != "M/S")){
//						ComShowCodeMessage('JOO00154');
//						sheetObj.SelectCell(inx, prefix+"uc_bss_port_etd_dt", true);
//						return false;
//					}
//				}
				//can't save when rev_yrmon not exists (only insert)
				if (ibflag == "I"){
					var revYrmon=sheetObj.GetCellValue(inx, prefix+"rev_yrmon");
					var vvd=sheetObj.GetCellValue(inx, prefix+"vsl_cd")
							+ sheetObj.GetCellValue(inx, prefix+"skd_voy_no")
							+ sheetObj.GetCellValue(inx, prefix+"skd_dir_cd")
							+ sheetObj.GetCellValue(inx, prefix+"rev_dir_cd");
					if (ComTrim(revYrmon) == ""){
						revYrmonNull=revYrmonNull + vvd + "("+inx+"),";						
					}
					if (sheetObj.GetCellValue(inx, prefix+"pending_flg") == "Y"){
						if (!hasPending) hasPending=true;
			            pendingList=pendingList + vvd + "("+inx+"),";
					}
				}
			}
			if (ComTrim(revYrmonNull) != ""){
				ComShowCodeMessage('JOO00148', revYrmonNull.substring(0,revYrmonNull.length-1));
				return false;
			}
			if(cnt==0){
				cnt = sheetObj.RowCount("D");
			}
			if (cnt==0){
				ComShowCodeMessage('JOO00036');
				return false;
			}
			if (hasPending){
				pendingList=pendingList.substring(0, pendingList.length-1);		
				ComShowCodeMessage('JOO00182', pendingList);
			}
			
			//Duplicate : VSL/VOY/Dir./Fin.Dir/Item Dup Check.
			var dupCols = prefix+"vsl_cd"+"|"+prefix+"skd_voy_no"+"|"+prefix+"skd_dir_cd"+"|"+prefix+"rev_dir_cd"+"|"+prefix+"jo_stl_itm_cd";
			var iDupRow=sheetObj.ColValueDup(dupCols, false);
            if( iDupRow > -1){
            	var dupVslCd = sheetObj.GetCellValue(iDupRow, prefix+"vsl_cd");
            	var dupSkdVoyNo = sheetObj.GetCellValue(iDupRow, prefix+"skd_voy_no");
            	var dupSkdDirCd = sheetObj.GetCellValue(iDupRow, prefix+"skd_dir_cd");
            	var dupRevDirCd = sheetObj.GetCellValue(iDupRow, prefix+"rev_dir_cd");
            	var dupJoStlItmCd = sheetObj.GetCellValue(iDupRow, prefix+"jo_stl_itm_cd");
            	ComShowCodeMessage("JOO00205", iDupRow+" Row , "+dupVslCd+dupSkdVoyNo+dupSkdDirCd+dupRevDirCd+" "+dupJoStlItmCd);
                //sheetObj.SelectCell(Row, "auth_ofc_cd");
                return false;
            }
			break;
		case IBDELETE:
			var cnt=0;
			for(var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++){
				if (sheetObj.GetCellValue(i, prefix+"del_chk") == "1"){
					cnt++;
				}
			}
			//activating delete button
			if (cnt == 0){
				ComShowCodeMessage("JOO00093");
				return;
			}
			break;
			
		case IBSEARCHAPPEND:
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
	}
	return true;
}
/**
 * after retrieving
 * @param sheetObj
 * @param ErrMsg
 * @return
 */
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var formObj = document.form;
    ComChkObjValid(formObj.acct_yrmon);
    //reset
    gBasicPortCombo=new Array(300);//max row is 300
    gPairPortCombo=new Array(300);//max row is 300
    gUnitPortCombo=new Array(300);//max row is 300
    var revYrmonNullList="";
	var revYrmon="";
	var hasRevNull=false; //chechking AR_MST_REV_VVD's Revenue Year Month is Null
	//deactivating Delete button
	JooSetBtnClass("D", false);
	var adjCnt=0;
			
	//can't delete when PROC_JB_FLG == 'Y'
	for (var inx=sheetObj.HeaderRows(); inx <= sheetObj.LastRow(); inx++){
		//can't update manually when PROC_JB_FLG == 'Y' : PROC_JB_FLG가 Y이면 Manual Settle 수정불가
		if (sheetObj.GetCellValue(inx, prefix+"proc_jb_flg") == "Y"){
			sheetObj.SetCellEditable(inx, prefix+"del_chk",0);
			sheetObj.SetCellEditable(inx, prefix+"jo_mnl_cre_flg",0);
			//can update confirm in case of reverse (Reverse가 된 건은 confirm을 수정할 수 있다.)
			if (sheetObj.GetCellValue(inx, prefix+"rvs_flg") == "Y"){
				sheetObj.SetCellEditable(inx, prefix+"jo_stl_cfm_cd",1);
			}else{
				sheetObj.SetCellEditable(inx, prefix+"jo_stl_cfm_cd",0);
			}
			// proc_jb_flg = 'Y' and jo_stl_cfm_cd = 'N' --> Target VVD by Adjust creation
			if (sheetObj.GetCellValue(inx, prefix+"jo_stl_cfm_cd") == "N"){
				adjCnt++;
			}
		}else{
			sheetObj.SetCellEditable(inx, prefix+"del_chk",1);
			sheetObj.SetCellEditable(inx, prefix+"jo_stl_cfm_cd",1);
			var varJoStlItmCd = sheetObj.GetCellValue(inx, prefix+"jo_stl_itm_cd");
			//2015.07.06 NYK Add OPR Add
			if ("S/H" == varJoStlItmCd || "R/F" == varJoStlItmCd || "OUS" == varJoStlItmCd || "OPR" == varJoStlItmCd){
				sheetObj.SetCellEditable(inx, prefix+"jo_mnl_cre_flg",1);
			}else{
				sheetObj.SetCellEditable(inx, prefix+"jo_mnl_cre_flg",0);
			}
		}
				
		if (sheetObj.GetRowStatus(inx) == "I"){
			revYrmon=ComTrim(sheetObj.GetCellValue(inx, prefix+"rev_yrmon"));
			if (revYrmon == "" || revYrmon == "null"){
				if (!hasRevNull) 
					hasRevNull=true;
					var vvd=sheetObj.GetCellValue(inx, prefix+"vsl_cd")
					+ sheetObj.GetCellValue(inx, prefix+"skd_voy_no")
					+ sheetObj.GetCellValue(inx, prefix+"skd_dir_cd")
					+ sheetObj.GetCellValue(inx, prefix+"rev_dir_cd");
					revYrmonNullList=revYrmonNullList + vvd + "("+inx+"),"; 
				}
			}
		
		// changing color in case of pending VVD
		if (sheetObj.GetCellValue(inx, prefix+"pending_flg") == "Y"){			
            sheetObj.SetRowFontColor(inx,"#FF0000");
		}
	}
		
	//activating or deactivating button (Adjst Cancel 대상이 없으면 권한에 관계없이 버튼 비활성화...있으면 권한에 따라 활성화/비활성화 결정)
	if (adjCnt == 0){
		JooSetBtnClass("A", false);
	}else{
		var selCrrAuthCd 	= JooComGetCarrierText(cmb_jo_crr_cd, 4); //jo_crr_auth_cd
		
		if (selCrrAuthCd == "W"){			
			JooSetBtnClass("A", true);
		}else{			
			JooSetBtnClass("A", false);
		}
	}
	
	if (hasRevNull){
		revYrmonNullList=revYrmonNullList.substring(0, revYrmonNullList.length-1);		
		ComShowCodeMessage('JOO00148', revYrmonNullList);
	}
}

/**
 * Sheet1_KeyUp
 * @param sheetObj
 * @param Row
 * @param Col
 * @param KeyCode
 * @param Shift
 * @return
 */
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
/**
 * IBSheet OnChange Event
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @return
 */
function sheet1_OnChange(sheetObj, Row, Col, Value) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	gCurRow=Row;
	formObj.curr_row.value=gCurRow - sheetObj.HeaderRows();
	var vvd="";
		vvd += sheetObj.GetCellValue(Row, prefix+"vsl_cd");
		vvd += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
		vvd += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
	//VVD changed ==> retrieving REV_DIR_CD, Port List
	if (sName == prefix+"vsl_cd"){
		if (Value.length < 4){
			ComShowCodeMessage('JOO00037');
			sheetObj.SelectCell(Row, Col, true);
			return;
		}
		if (vvd.length == 9){
			gVVD=vvd;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	if (sName == prefix+"skd_voy_no"){
		if (Value.length < 4){
			ComShowCodeMessage('JOO00038');
			sheetObj.SelectCell(Row, Col, true);
			return;
		}
		if (vvd.length == 9){
			gVVD=vvd;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	if (sName == prefix+"skd_dir_cd"){
		var joStlItmCd=sheetObj.GetCellValue(Row, prefix+"jo_stl_itm_cd");
		//OUS이면 SKD_DIR에 따라 JO_MNU_NM를 가져오는 logic을 타야 하므로 clear시켜준다.
		/*if (joStlItmCd == "OUS"){
			sheetObj.SetCellValue(Row, prefix+"jo_stl_itm_cd","",0);
		}*/
		if (vvd.length == 9){
			gVVD=vvd;
			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
		}
	}
	if (sName == prefix+"jo_stl_itm_cd"){
		//if Item is W/R or P/B, Mannual settle can't be checked.(Item이 W/R이거나 P/B이면 Mannual settle 체크 못하게)
		//2015.07.06 NYK Add OPR
		if(Value=="R/F" || Value=="S/H" || Value == "OUS"|| Value == "OPR"){
			sheetObj.SetCellValue(Row,prefix+"jo_mnl_cre_flg","0",0);
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",1);
			sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm",Value,0);		
			//Cycle은 R로 임의 setting , Cycle 외에는 OUS인 경우는 Basic Port에서 TDR/RDR을 가져온다.
			if (Value=="OUS"){
				if (formObj.jo_stl_opt_cd.value == "C"){
					sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm","RDR",0);
					sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm1","RDR",0);
				}else{
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
				}
			}
		}else{
			sheetObj.SetCellValue(Row,prefix+"jo_mnl_cre_flg","1",0);
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",0);
			sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm","M/S",0);
		}
		/*if (Value=="P/B" || Value=="W/R"){
			sheetObj.SetCellValue(Row,prefix+"jo_mnl_cre_flg","0",0);
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",0);
			sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm",Value,0);
		//if Item is OTH, jo_mnu_nm = M/S(Item이 OTH이면 무조건 jo_mnu_nm = M/S)
		}else if (Value=="OTH"){
			sheetObj.SetCellValue(Row,prefix+"jo_mnl_cre_flg","1",0);
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",0);
			sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm","M/S",0);
		}else{
			sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm",Value,0);
			sheetObj.SetCellValue(Row,prefix+"jo_mnl_cre_flg","0",0);
			sheetObj.SetCellEditable(Row,prefix+"jo_mnl_cre_flg",1);
			//Cycle은 R로 임의 setting , Cycle 외에는 OUS인 경우는 Basic Port에서 TDR/RDR을 가져온다.
			if (Value=="OUS"){
				if (formObj.jo_stl_opt_cd.value == "C"){
					sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm","RDR",0);
					sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm1","RDR",0);
				}else{
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC02);
				}
			}
		}*/
	}
	//in case of checking Mannual Settle ( Mannual Settle 을 Check할 경우)
	if (sName == prefix+"jo_mnl_cre_flg"){
		var flg=Value;//sheetObj.GetEditText();
		//if Checking, JO_MNU_NM = M/S
		if (flg == "1"){
			sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm","M/S",0);
		}else{
			//if Unchecking
			//Uncheck하면 JO_MNU_NM에 ==> OUS인 경우는 RDR/TDR중 가져온 값을 넣고 그외에는 자신의 ITEM을 넣는다.
			var joStlItmCd=sheetObj.GetCellValue(Row,prefix+"jo_stl_itm_cd");
			if (joStlItmCd == "OUS"){
				var joMnuNm=sheetObj.GetCellValue(Row,prefix+"jo_mnu_nm1");
				sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm",joMnuNm,0);
			}else{
				sheetObj.SetCellValue(Row, prefix+"jo_mnu_nm",joStlItmCd,0);
			}
		}
	}
	//setting ETA, ETD in case of changing Basic Port
	if (sName == prefix+"stl_bzc_port_cd"){
		var eta="";
		var etd="";
		//getting ETA, ETD of same VVD, Port ( VVD가 같고 Port 가 같은 것의 ETA, ETD를 가져온다.)
		for (var inx=0; inx<gBasicPortCombo[Row].length; inx++){
			if (Value == gBasicPortCombo[Row][inx][2]){
				eta=gBasicPortCombo[Row][inx][3];
				etd=gBasicPortCombo[Row][inx][4];
				break;
			}
		}
		sheetObj.SetCellValue(Row, prefix+"bzc_port_eta_dt",eta);
		sheetObj.SetCellValue(Row, prefix+"bzc_port_etd_dt",etd);
	}
	//setting ETA, ETD in case of changing Pair Port
	if (sName == prefix+"stl_pair_port_cd"){
		var eta="";
		var etd="";
		//getting ETA, ETD of same Port ( Port 가 같은 것의 ETA, ETD를 가져온다. )
		for (var inx=0; inx<gPairPortCombo[Row].length; inx++){
			if (Value == gPairPortCombo[Row][inx][0]){
				eta=gPairPortCombo[Row][inx][1];
				etd=gPairPortCombo[Row][inx][2];
				break;
			}
		}
		sheetObj.SetCellValue(Row, prefix+"pair_port_eta_dt",eta);
		sheetObj.SetCellValue(Row, prefix+"pair_port_etd_dt",etd);
	}
//	if (sName == prefix+"uc_bss_port_cd"){
//		var etd = "";
//		for (var inx=0; inx<gUnitPortCombo[Row].length; inx++){
//			if (Value == gUnitPortCombo[Row][inx][0]){
//				etd = gUnitPortCombo[Row][inx][1];
//				break;
//			}
//		}
//		sheetObj.CellValue(Row, prefix+"uc_bss_port_etd_dt") = etd;
//	}
}
/**
 * IBSheet Click
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @param CellX
 * @param CellY
 * @param CellW
 * @param CellH
 * @return
 */
function sheet1_OnClick(sheetObj, Row, Col, Value, CellX, CellY, CellW, CellH) {
	var sName=sheetObj.ColSaveName(Col);
	var formObj=document.form;
	gCurRow=Row;
	formObj.curr_row.value=gCurRow - sheetObj.HeaderRows();
	
	//checking VVD from L/SKD ( L/SKD 에서 받은 VVD인지를 체크하기 위함)
	var pop_flg=sheetObj.GetCellValue(Row, prefix+"pop_flg");	
	
	if (pop_flg == "1"){
		//L/SKD로 POP되어 받아온 VVD는 FIN_DIR을 클릭할 때 모든 데이터(Basic Port List, Pair Port List, UnitCostBasicPort List)를 가져온다.
		if (sName == prefix+"rev_dir_cd"){
			var vvd="";
			vvd += sheetObj.GetCellValue(Row, prefix+"vsl_cd");
			vvd += sheetObj.GetCellValue(Row, prefix+"skd_voy_no");
			vvd += sheetObj.GetCellValue(Row, prefix+"skd_dir_cd");
// 아래부분 주석 처리(201409  민정호)						
//			var tmp=sheetObj.GetComboInfo(Row, prefix+"rev_dir_cd", "Code");						
//			if (tmp.length <= 1){
				if (vvd.length == 9){
					gVVD=vvd;
					doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC04);
				}
//			}
		}
	}
//	if (sName == prefix+"uc_bss_port_cd"){
//		var vvd = "";
//		vvd += sheetObj.CellValue(Row, prefix+"vsl_cd");
//		vvd += sheetObj.CellValue(Row, prefix+"skd_voy_no");
//		vvd += sheetObj.CellValue(Row, prefix+"skd_dir_cd");
//		if (vvd.length != 9){		
//			ComShowCodeMessage('JOO00039');
//			sheetObj.SelectCell(Row, prefix+"vsl_cd", true);
//			return;
//		}
//		gVVD = vvd;
//		var tmp = sheetObj.GetComboInfo(Row, prefix+"uc_bss_port_cd", "Code");
//		if (tmp.length <= 1)
//			doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
//	}
}
function UF_copyRow(){
	var formObj=document.form;
	var sheetObj=sheetObjects[0];
	var arrs=sheetObj.GetSelectionRows(",");
	var rows=arrs.split(",");
	for (var i=rows.length-1; i >= 0; i--){
		sheetObj.SelectCell(rows[i], 7);
		var row=sheetObj.DataCopy();
		if(sheetObj.GetCellValue(row, prefix+"jo_stl_itm_cd") != "OUS"){
			sheetObj.SetCellValue(row, prefix+"jo_stl_itm_cd","",0);
			sheetObj.SetCellValue(row, prefix+"jo_mnu_nm","",0);
			sheetObj.SetCellValue(row, prefix+"jo_mnu_nm1","",0);
			sheetObj.SetCellValue(row, prefix+"jo_mnl_cre_flg","0",0);
		}
		sheetObj.SetCellEditable(row, prefix+"del_chk",1);
		sheetObj.SetCellValue(row, prefix+"proc_jb_flg","N",0);
		sheetObj.SetCellValue(row, prefix+"rev_yrmon","999912",0);//copy item has revenue year month probably
	}
}
function UF_addRow(){
	var formObj=document.form;
	var sheetObject1=sheetObjects[0];
	var row=sheetObject1.DataInsert(-1);
	var reDivrCd="";
	for (var inx=0; inx<formObj.re_divr_cd.length; inx++){
		if (formObj.re_divr_cd[inx].checked){
			reDivrCd=formObj.re_divr_cd[inx].value;
			break;
		}
	}
	sheetObject1.SetCellValue(row, prefix+"acct_yrmon",ComReplaceStr(formObj.acct_yrmon,"-",""));
	sheetObject1.SetCellValue(row, prefix+"re_divr_cd",reDivrCd);
	sheetObject1.SetCellValue(row, prefix+"jo_crr_cd" ,JooComGetCarrierText(cmb_jo_crr_cd, 0));
	sheetObject1.SetCellValue(row, prefix+"trd_cd"    ,JooComGetCarrierText(cmb_jo_crr_cd, 1));
	sheetObject1.SetCellValue(row, prefix+"rlane_cd"  ,JooComGetCarrierText(cmb_jo_crr_cd, 2));
	//initializing
	sheetObject1.SetCellValue(row, prefix+"skd_dir_cd","");
	sheetObject1.SetCellValue(row, prefix+"rev_dir_cd","");
	sheetObject1.SetCellValue(row, prefix+"jo_stl_itm_cd","");
	//sheetObject1.CellValue(row, prefix+"stl_tgt_vvd_bss_cd") = "";
	sheetObject1.SetCellValue(row, prefix+"proc_jb_flg","");//N is NULL
	sheetObject1.SetCellValue(row, prefix+"agmt_mon_cond_cd","");
	sheetObject1.SetCellValue(row, prefix+"agmt_port_cond_cd","");
	sheetObject1.SetCellValue(row, prefix+"agmt_port_tp_cond_cd","");
	sheetObject1.SetCellValue(row, prefix+"agmt_op_tp_cond_cd","");
	sheetObject1.SetCellValue(row, prefix+"rev_yrmon","999912");
	sheetObject1.SelectCell(row, prefix+"vsl_cd", true);
	//var rlaneCd  = formObj.rlane_cd.text;
	//var skdDirCd = sheetObject1.CellValue(row, prefix+"rev_dir_cd"); 
	//UF_setPortCombo(sheetObject1, row, rlaneCd, skdDirCd);				
	return row;
}
/**
 * if Cycle, getting VVD from Long range schedule
 * @return
 */
function UF_popLSKD(){
	var param="?select_mode=Y";
	var sUrl="/opuscntr/VOP_VSK_0012_POP.do"+param;
//	var rVal=ComOpenPopupWithTarget(sUrl, 1040, 690, "", "0,0", true, "yes");
	
	ComOpenPopup(sUrl, 1040, 690, "UF_LSKD", "0,0,1,1,1,1,1,1", false);
}

function UF_LSKD(rVal){
	var sheetObj=sheetObjects[0];
	if(rVal){
	    var item=null;
	    var row;

	    for(var i=0; i<rVal.length; i++){
	        item=rVal[i];
	        row=UF_addRow();
	        sheetObj.SetCellValue(row, prefix+"vsl_cd",item.vsl_cd,0);
	        sheetObj.SetCellValue(row, prefix+"skd_voy_no",item.skd_voy_no,0);
	        sheetObj.SetCellValue(row, prefix+"skd_dir_cd",item.skd_dir_cd,0);
	        sheetObj.SetCellValue(row, prefix+"stl_bzc_port_cd",item.port_cd,0);
	        var etbDt=(item.etb_dt).replace("/","");
	        etbDt=etbDt.substring(4,8)+etbDt.substring(0,4)+etbDt.substring(8);
	        var etdDt=(item.etd_dt).replace("/","");
	        etdDt=etdDt.substring(4,8)+etdDt.substring(0,4)+etdDt.substring(8);
	        sheetObj.SetCellValue(row, prefix+"bzc_port_eta_dt",etbDt+"00",0);
	        sheetObj.SetCellValue(row, prefix+"bzc_port_etd_dt",etdDt+"00",0);
	        sheetObj.SetCellValue(row, prefix+"pop_flg","1",0);
	        //sheetObj.SetCellValue(row, prefix+"rev_dir_cd", item.vsl_cd) = item.vsl_cd;
	        //alert(item.vsl_cd + ":" + item.skd_voy_no + ":" + item.skd_dir_cd + ":" + item.port_cd + ":" + item.clpt_ind_seq);
	        
	        var vvd="";
			vvd += sheetObj.GetCellValue(row, prefix+"vsl_cd");
			vvd += sheetObj.GetCellValue(row, prefix+"skd_voy_no");
			vvd += sheetObj.GetCellValue(row, prefix+"skd_dir_cd");
	        if (vvd.length == 9){
				gVVD=vvd;
				doActionIBSheet(sheetObj, document.form, IBSEARCH_ASYNC04);
			}
	    }
	}	
}

function UF_setAuth(auth, opt){
	if (gClzYn == "C") return;
	if (auth == null || auth == undefined){
		auth="R";
	}
	var editable=true;
	if (auth == "R"){
		editable=false;
	}
	JooSetBtnClass("C", editable);
//	if (opt == "C" && editable){
//		JooSetBtnClass("U", false);
//	}else{
		JooSetBtnClass("U", editable);
//	}
	for (var i=0; i < sheetObjects.length; i++) {
		sheetObjects[i].SetEditable(editable);
	}
}
function UF_setReDivrCd(reDivrCd){
	var formObj=document.form;
	var radio=formObj.re_divr_cd;
	if (reDivrCd == "A"){
		ComJooRadioDisabled(radio, false);
	}else if (reDivrCd == "R"){
		formObj.re_divr_cd[0].checked=true;
		ComJooRadioDisabled(radio, true);
	}else if (reDivrCd == "E"){
		formObj.re_divr_cd[1].checked=true;
		ComJooRadioDisabled(radio, true);
	}
}

function UF_reset(){
	var formObj = document.form;
	ComResetAll();
	sheetObjects[0].RemoveAll();

	cmb_jo_crr_cd.SetSelectIndex(-1,1);
	
	formObj.proc_jb_flg.checked=false;
	formObj.proc_jb_flg.value="N";
	formObj.re_divr_cd[0].checked=true;
	formObj.acct_yrmon.focus();
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
