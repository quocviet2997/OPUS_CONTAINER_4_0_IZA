/*=========================================================

*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : fns_joo_0029.js
*@FileTitle  : Estimate Performance Creation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/23

=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class fns_joo_0029 : business script for fns_joo_0029
 */

// common global variable
var tabObjects=new Array();
var tabCnt=0;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix="sheet1_";
var gRefresh=true;
var ROWMARK="|";
var FIELDMARK=",";
var dftUserFormatYmdhhmi = "####-##-## ##:##";
var gJoStlItmCdByOPR = "OPR";
var gCheckJoStlOptCds = ["S/H","OPR"];
var gAmountRoundPoint = 2;
var gDysRoundPoint = 5;

// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick() {
	/***** setting sheet object *****/
	var sheetObject=sheetObjects[0];
	/*******************************************************/
	var formObject=document.form;
	var srcName=ComGetEvent("name");
	if (srcName == null) {
		return;
	}
	switch (srcName) {
		case "btn1_Create": //CREATE
			doActionIBSheet(sheetObjects[0], formObject, IBCREATE);
			break;
		case "btn1_save": //SAVE
			/*if (!fnBtnEnbleCheck(srcName)) {
				return;
			}*/
			doActionIBSheet(sheetObjects[0], formObject, IBSAVE);
			break;
		case "btn1_I_F": //InterFace
			/*if (!fnBtnEnbleCheck(srcName)) {
				return;
			}*/
			doActionIBSheet(sheetObjects[0], formObject, IBBATCH);
			break;
		case "btn1_Retrieve": //RETRIEVE
			doActionIBSheet(sheetObjects[0], formObject, IBSEARCH);
			break;
		case "btn_Delete":
			//정책1. 체크된 데이타의 그룹 테이타를 찾아서 check box check 처리한다.
			//정책2. 체크된 레코드의 Estimated Cost 를 빼주어야 한다.(Sheet 의 Total 정보를 넣어 준다.)
			//정책3. Total Count 를 그룹체크만큼 제외 시켜 준다.(RowCount() - RowCount("D"))
			//REV_YRMON, JO_CRR_CD, RLANE_CD, VVD, ACCT_CD, JO_STL_ITM_CD, JO_STL_JB_CD
			//ObjId.FindText(Col,SearchText,[StartRow],[FullMatch], [CaseSensitive])
		    if(sheetObjects[0].RowCount() < 1){//no data
		        ComShowCodeMessage("JOO00093");
		        return;
		    }
			
			var sCheckedRow=sheetObjects[0].FindCheckedRow(1);

			if(sCheckedRow == ""){
			    ComShowCodeMessage("JOO00117", "[Delete Row]");//Please check {?msg1}
			    return;
			}
			
			var arrRow=sCheckedRow.split("|"); //result : "1|3|5|"
			for (var idx=arrRow.length-1; idx>=0; idx--){
				var sSelGrpNo = sheetObjects[0].GetCellValue(arrRow[idx], prefix +"grp_no");				
				
				for (var i=sheetObjects[0].LastRow(); i >= sheetObjects[0].HeaderRows(); i--){
					var tmpGrpNo = sheetObjects[0].GetCellValue(i, prefix +"grp_no");
					//동일 그룹일때 Del 체크 및 Delete.
					if(sSelGrpNo == tmpGrpNo){
						sheetObjects[0].SetCellValue(i, prefix+"del_chk", 	1, 0);	
						sheetObjects[0].SetCellValue(i, prefix+"ibflag", 	"D", 0);				
					}
				}
			}
			//선택 Row Delete
			JooRowHideDelete(sheetObjects[0], 1);
			
			//정책2.정책3.
			SetMakeTotalCalculation(sheetObjects[0]);
			return; 		
			break;
		case "btn1_New": //NEW
			UF_reset();
			break;
		case "btn1_Down_Excel": //DownExcel
			if(sheetObjects[0].RowCount() < 1){//no data
				ComShowCodeMessage("COM132501");
			}else{
				sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
			}
			break;
		case "btn_next" :
			doActionIBSheet(sheetObjects[0], formObject, IBROWSEARCH);			
			break;
		case "btn_exe_back":
			UF_addMonth(formObject.exe_yrmon, -1);
			UF_setCond("1");
			break;
		case "btn_exe_next":
			UF_addMonth(formObject.exe_yrmon, +1);
			UF_setCond("1");
			break;
		case "btn_vvd_from_back":
			UF_addMonth(formObject.rev_yrmon_fr, -1);
			formObject.estm_amt.value="";
			formObject.act_amt .value="";
			formObject.accl_amt.value="";
			formObject.tot_cnt .value="";
			sheetObjects[0].RemoveAll();
			break;
		case "btn_vvd_from_next":
			if (!UF_checkPeriod()){
				ComShowCodeMessage("JOO00078");
				return;
			}
			UF_addMonth(formObject.rev_yrmon_fr, +1);
			formObject.estm_amt.value="";
			formObject.act_amt .value="";
			formObject.accl_amt.value="";
			formObject.tot_cnt .value="";
			sheetObjects[0].RemoveAll();
			break;
		case "btn_vvd_to_back":
			if (!UF_checkPeriod()){
				ComShowCodeMessage("JOO00078");
				return;
			}
			UF_addMonth(formObject.rev_yrmon_to, -1);
			formObject.estm_amt.value="";
			formObject.act_amt .value="";
			formObject.accl_amt.value="";
			formObject.tot_cnt .value="";
			sheetObjects[0].RemoveAll();
			break;
		case "btn_vvd_to_next":
			UF_addMonth(formObject.rev_yrmon_to, +1);
			formObject.estm_amt.value="";
			formObject.act_amt .value="";
			formObject.accl_amt.value="";
			formObject.tot_cnt .value="";
			sheetObjects[0].RemoveAll();
			break;
	} // end switch
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
		//doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
	}
	// initializing IBMultiCombo
	for ( var k=0; k < comboObjects.length; k++) {
		initCombo(comboObjects[k], k + 1);
	}
	initControl();
//	UF_setCond("1");
	resizeSheet();
}
/**
 * setting Combo basic info
 * @param comboObj 
 * @param comboIndex Number
 */
function initCombo(comboObj, comboNo) {
	var formObject=document.form
	switch (comboNo) {
		case 1: 
			with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
//				SetColWidth(0, "30");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
				SetMaxLength(3);
			}
			if (ComTrim(gTrdCd) != ""){
				var comboItems=(" |"+gTrdCd).split("|");
				addComboItem(comboObj, comboItems);
			}
			break; 
		case 2: 
			with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
//				SetColWidth(0, "50");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case, numbers
				SetMaxLength(5);
			}
			if (ComTrim(gRlaneCd) != ""){
				var comboItems=(" |"+gRlaneCd).split("|");
				addComboItem(comboObj, comboItems);
			}
			break;
		case 3: 
			with (comboObj) { 
				SetMultiSelect(0);
				SetUseAutoComplete(1);
				SetColAlign(0, "left");
//				SetColWidth(0, "30");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
				SetMaxLength(3);
			}
			if (ComTrim(gJoCrrCd) != ""){
				var comboItems=(" |"+gJoCrrCd).split("|");
				addComboItem(comboObj, comboItems);
			}
			break;
		case 4: 
			with (comboObj) { 
				SetMultiSelect(true);
			    SetMultiSeparator(",");  // add 
				SetUseAutoComplete(1);
 				SetColAlign(0, "left");
				//SetColAlign(1, "left");
				SetColWidth(0, "150");
				//SetColWidth(1, "130");
				SetDropHeight(160);
 				ValidChar(2,1);//only upper case
 				SetMaxLength(7);
			}
			if (ComTrim(gJoStlItmCd) != ""){
				var comboItems=gJoStlItmCd.split(ROWMARK);
				var comboItem="";
				jo_stl_itm_cd.InsertItem(-1, "ALL|", "ALL");	//ALL
				for (var i=0 ; i < comboItems.length ; i++) {
					comboItem=comboItems[i].split(FIELDMARK);
					jo_stl_itm_cd.InsertItem(-1, comboItem[0], comboItem[0]);
				}
				//jo_stl_itm_cd.SetSelectIndex(0);

				jo_stl_itm_cd.SetSelectCode("S/H", true);
				jo_stl_itm_cd.SetSelectCode("OPR", true);
			}else{
				jo_stl_itm_cd.RemoveAll();
			}
			break;
	}
}


var selComboIndex, selComboCode;
function jo_stl_itm_cd_OnSelect(comboObj ,index, text , code) {
	selComboIndex = index;
	selComboCode = code;
}
/*function jo_stl_itm_cd_OnChange(comboObj , oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	ComSetMultiCombo(comboObj, selComboIndex, selComboCode);
	var cnt=0;
	var count = parseInt(comboObj.GetItemCount());
	var name = "";
	//var isAllText = false;
	for(var i = 1 ; i <  count; i++) {
	   if(comboObj.GetItemCheck(i)) {
	       cnt++;
	       if(comboObj.GetSelectCode().indexOf("ALL") > -1){
	    	   //isAllText = true;
	    	   break;
	       }else{
	    	   name = comboObj.GetText(comboObj.GetSelectCode(), 1);
	       }
	   }
	}
}*/
function jo_stl_itm_cd_OnCheckClick(comboObj, index, code) {
    if(index==0) {          
        var bChk=comboObj.GetItemCheck(index);
        if(bChk){
            for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
                comboObj.SetItemCheck(i,0);
            }
        }
    } else {
        //ALL 이 아닌 다른 Item 체크.
        var bChk=comboObj.GetItemCheck(index);
        if (bChk) {
            comboObj.SetItemCheck(0,0);
        }
    }
    //Combo Item이 전부 Uncheck 일때 자동으로 All 선택이 되도록 한다.
    var checkCnt=0;
    var count = parseInt(comboObj.GetItemCount());
    for(var i = 1 ; i <  count; i++) {
        if(comboObj.GetItemCheck(i)) {
            checkCnt++;
        }
    }
    if(checkCnt == 0) {
        comboObj.SetItemCheck(0,true, null, null, false);
    }
}
/**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
	var formObject=document.form;   
	
	//axon_event.addListenerFormat('blur', 'fnDeactivate', formObject);
    
	if (gClzFlg == "N") {
		fnBtnEnable("C", true);
	} else {
		fnBtnEnable("C", false);
	}
	/*
	var tmpFrYm = ComGetDateAdd(formObject.exe_yrmon.value,"M", -6);
	var tmpToYm = ComGetDateAdd(formObject.exe_yrmon.value,"M", 1);
	formObject.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");
	formObject.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");
    */ 
	//From : -3년, To : +1 월
	var tmpToYm = ComGetDateAdd(formObject.exe_yrmon.value,"M", 1);
	formObject.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");
	
	//년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
	var tmpFrYm = ComGetDateAdd(formObject.rev_yrmon_to.value+"-02","Y", -3);
	formObject.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");	
	
	document.getElementById("exe_yrmon").focus();
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj, sheetNo) {
	var cnt=0;
	switch (sheetNo) {
	case 1: //t1sheet1 init
		with (sheetObj) {
	        var HeadTitle = "STS||G.No|Seq.|Revenue\nMonth|Activity\nDate|Partner|Vendor/\nCustomer|Item|Rev.VVD|Rev.\nLane|BSA Type";
	            HeadTitle += "|BSA|Slot\nPrice|VVD Duration|VVD Duration|Voy Days|Voy Days|Voy Days";
	        	HeadTitle += "|Estimated\nCost|Actual\nCost|Accrual\nCost";
	        	HeadTitle += "|exe_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|sys_src_id|loc_cd";
	            HeadTitle += "|jo_ioc_div_cd|estm_vvd_hdr_id|jo_cntr_div_ctnt|cntr_blk_div_cd|jo_stl_jb_cd|cust_cnt_cd|cust_seq|Port to\nPort|org_estm_amt|org_act_amt|min_estm_yrmon|max_estm_yrmon";
	            HeadTitle += "|chk_edit_flg";
	        
	        var HeadTitle1 = "STS||G.No|Seq.|Revenue\nMonth|Activity\nDate|Partner|Vendor/\nCustomer|Item|Rev.VVD|Rev.\nLane|BSA Type";
	        	HeadTitle1 += "|BSA|Slot\nPrice|From|To|Total|By Month|Days"
	            HeadTitle1 += "|Estimated\nCost|Actual\nCost|Accrual\nCost";
	        	HeadTitle1 += "|exe_yrmon|vsl_cd|skd_voy_no|skd_dir_cd|rev_dir_cd|estm_vvd_tp_cd|acct_cd|estm_act_seq|sys_src_id|loc_cd";
	            HeadTitle1 += "|jo_ioc_div_cd|estm_vvd_hdr_id|jo_cntr_div_ctnt|cntr_blk_div_cd|jo_stl_jb_cd|cust_cnt_cd|cust_seq|Port to\nPort|org_estm_amt|org_act_amt|min_estm_yrmon|max_estm_yrmon";
	            HeadTitle1 += "|chk_edit_flg";
	        
	        var headCount=ComCountHeadTitle(HeadTitle);
	
	        SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
	
	        var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	        var headers = [ { Text:HeadTitle, Align:"Center"},{ Text:HeadTitle1, Align:"Center"} ];
	        InitHeaders(headers, info);
	
	        var cols = [ 
	               {Type:"Status",    Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag"},
	  	           {Type:"CheckBox",  Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk",   UpdateEdit:0,   InsertEdit:0},
	               {Type:"Text",      Hidden:1,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"grp_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Seq",       Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Date",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_yrmon",         KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:prefix+"act_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_crr_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vndr_cust_seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                   {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_stl_itm_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vvd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rlane_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_jb_nm",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_qty",           KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:prefix+"bsa_slt_prc",       KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:prefix+"st_dt",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:prefix+"end_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:prefix+"sail_dys",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Date",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_yrmon",        KeyField:0,   CalcLogic:"",   Format:"Ym",          PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:prefix+"estm_dys",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	               
	               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"estm_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"act_amt",           KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"accl_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       UpdateEdit:0,   InsertEdit:0 },
	               
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"exe_yrmon",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_voy_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_dir_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_dir_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_vvd_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"acct_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_act_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"sys_src_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"loc_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_ioc_div_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"estm_vvd_hdr_id",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"jo_cntr_div_ctnt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cntr_blk_div_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Left",    ColMerge:0,   SaveName:prefix+"jo_stl_jb_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"accl_amt_corr_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                   
	               //var CalcuLogicOriEstmAmt = "|sheet1_bsa_qty|*|sheet1_bsa_slt_prc;
	               {Type:"AutoSum",   Hidden:1,  Width:0,    Align:"Right",   ColMerge:0,   SaveName:prefix+"org_estm_amt",  	 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"AutoSum",   Hidden:1,  Width:0,    Align:"Right",   ColMerge:0,   SaveName:prefix+"org_act_amt",   	 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"min_estm_yrmon",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	               {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"max_estm_yrmon",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                   {Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"chk_edit_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }];
	               
	         
	        InitColumns(cols);
	        SetColProperty(0, prefix+"st_dt", {Format:dftUserFormatYmdhhmi, AcceptKeys:"N"} );
			SetColProperty(0, prefix+"end_dt", {Format:dftUserFormatYmdhhmi, AcceptKeys:"N"} );
			SetColProperty(0, prefix+"bsa_qty", {AcceptKeys:"N|[.]"} );
			SetColProperty(0, prefix+"bsa_slt_prc", {AcceptKeys:"N|[.]"} );
			
	        SetEditable(1);
	        SetSheetHeight(420);
		}
		break;
	case 2: // to prohibit flickering screen
		with (sheetObj) {
			// setting height
			SetVisible(false);
		}
		break;
	}
}
// handling sheet process
function doActionIBSheet(sheetObj, formObj, sAction) {
	sheetObj.ShowDebugMsg(false);
	if (!validateForm(sheetObj, formObj, sAction)) {
		return;
	}
	switch (sAction) {
		case IBSEARCH: //retrieve
			formObj.f_cmd.value=SEARCH;
			formObj.page_no.value="1";
			formObj.cre_flg.value="N";			
			var param=FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var sXml=sheetObj.GetSearchData("FNS_JOO_0029GS.do", param);
			sheetObj.LoadSearchData(sXml,{Sync:0} );
			formObj.estm_amt.value=ComGetEtcData(sXml, "estm_amt");
			formObj.act_amt .value=ComGetEtcData(sXml, "act_amt");
			formObj.accl_amt.value=ComGetEtcData(sXml, "accl_amt");
			formObj.tot_cnt .value=ComGetEtcData(sXml, "tot_cnt");
			ComAddSeparator(formObj.estm_amt,"float");
		    ComAddSeparator(formObj.act_amt ,"float");
		    ComAddSeparator(formObj.accl_amt,"float");
		    ComAddSeparator(formObj.tot_cnt ,"int");			
			break;
		case IBROWSEARCH: //Next retrieving			
			formObj.f_cmd.value=SEARCH;
			var pageNo=Number(formObj.page_no.value);
			formObj.cre_flg.value="N";			
			formObj.page_no.value=(pageNo+1);
			var param=FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var sXml=sheetObj.GetSearchData("FNS_JOO_0029GS.do", param);
			if (ComGetTotalRows(sXml) == 0){
				ComShowCodeMessage("JOO00054");
				return;
			}else{
				sheetObj.LoadSearchData(sXml,{Append:1 , Sync:1} );
			}
			break;
		case IBCREATE: //Create
			formObj.f_cmd.value=SEARCHLIST01;
			formObj.cre_flg.value="Y"; 
			var sXml=sheetObj.GetSearchData("FNS_JOO_0029GS.do", FormQueryString(formObj));
			var key=ComGetEtcData(sXml,"key");
            if (key.length > 0) {
    			gRefresh=true; // should retrieve result file
                formObj.key.value=key;
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(UF_getBackEndJobStatus, 3000); // action getBackEndJobStatus function after 3 seconds.
            }
			break;
		case IBSAVE: //save
			formObj.f_cmd.value=MULTI;
			var SaveStr=ComGetSaveString(sheetObj);
			if (formObj.cre_flg.value == "N" && SaveStr == ""){
				ComShowCodeMessage("JOO00036");
				return false;
			}
			if (!ComShowCodeConfirm("JOO00046")){
				return false;
			}
			//var param = ComJooGetAllSaveText(sheetObj,false,prefix+"ibflag") + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var param=SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0029GS.do", param);
			//sheetObj.LoadSearchXml(sXml, true);
			var key=ComGetEtcData(sXml, "key");
            if (key.length > 0) {
    			gRefresh=false; // should retrieve result file
                formObj.key.value=key;
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(UF_getBackEndJobStatus, 3000); // action getBackEndJobStatus function after 3 seconds.
    			formObj.cre_flg.value="N"; 
            }			
			break;
		case IBBATCH: //I/F
			formObj.f_cmd.value=MULTI01;
			if (sheetObj.RowCount()== 0){
				ComShowCodeMessage('JOO00036');
				return;
			}
			var SaveStr=ComGetSaveString(sheetObj);
			if (SaveStr != ""){					
				ComShowCodeMessage('JOO00128');
				return false;
			}
			if (!ComShowCodeConfirm("JOO00129")){
				return false;
			}
			formObj.page_no.value="";
			//var param = SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
			var param=FormQueryString(formObj);
			var sXml=sheetObj.GetSaveData("FNS_JOO_0029GS.do", param);
			var key=ComGetEtcData(sXml, "key");
            if (key.length > 0) {
    			gRefresh=false; // not necessary to retrieve result file
                formObj.key.value=key;
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                //sheetObj.RequestTimeOut = 600;  //10분
				//intervalId = setInterval("doActionValidationResult();",3000);
				
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(UF_getBackEndJobStatus, 10000); // action getBackEndJobStatus function after 3 seconds.
            }			
			break;			
		//changing search condition
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCHLIST02;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0029GS.do", FormQueryString(formObj));
			var conFlg=formObj.estm_cond_flg.value+"";
			switch(conFlg){
				//retrieving REV_YRMON_FR, REV_YRMON_TO, TRADE, LANE, CARRIER in case of changing EXE_YRMON, RE_DIVR_Cd
				case "1":
					var clzFlg=ComGetEtcData(sXml, "estm_clz_flg");
					if (clzFlg == "N") {
						fnBtnEnable("C", true);
					} else {
						fnBtnEnable("C", false);
					}	
				//retrieving REV_YRMON_FR, REV_YRMON_TO, TRADE, LANE, CARRIER in case of changing EXE_YRMON, RE_DIVR_Cd
				case "2":
					var trdCombo=ComGetEtcData(sXml, "TRD_CD");
					if (ComTrim(trdCombo) != ""){
						var comboItems=(" |"+trdCombo).split("|");
						addComboItem(comboObjects[0], comboItems);
					}
				case "3":
					var rlaneCombo=ComGetEtcData(sXml, "RLANE_CD");
					if (ComTrim(rlaneCombo) != ""){
						var comboItems=(" |"+rlaneCombo).split("|");
						addComboItem(comboObjects[1], comboItems);
					}
				case "4":
					var crrCombo=ComGetEtcData(sXml, "JO_CRR_CD");
					if (ComTrim(crrCombo) != ""){
						var comboItems=(" |"+crrCombo).split("|");
						addComboItem(comboObjects[2], comboItems);
					}
					break;
			}
			break;
		case IBRESET: //NEW button  
			UF_reset();
			break;
		//BackEndJob Status
		case IBSEARCH_ASYNC02: 			
		    formObj.f_cmd.value=SEARCHLIST;
		    var sXml=sheetObj.GetSearchData("FNS_JOO_0029GS.do", FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix));
		    var jobState=ComGetEtcData(sXml, "jb_sts_flg")+"";
		    // 2 : processing, 3:success , 4:fail
		    if (jobState == "3") {//success
		        ComOpenWait(false);
		        clearInterval(timer);
		        ComShowCodeMessage("JOO00160");
		        if (gRefresh)
		        	doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC03);
		    } else if (jobState == "4") {
		        ComOpenWait(false);
		        clearInterval(timer);
		        // BackEndJob Fail
		        ComShowCodeMessage('JOO00151');
		    } else if (jobState == "5") {
		        ComOpenWait(false);
		        clearInterval(timer);
		        ComShowCodeMessage('JOO00152');
		    }
			break;
		//BackEndJob result
		case IBSEARCH_ASYNC03: 			
            sheetObj.SetWaitImageVisible(1);
		    formObj.f_cmd.value=SEARCHLIST03;
		    var sXml=sheetObj.GetSearchData("FNS_JOO_0029GS.do", FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix));
		    sheetObj.LoadSearchData(sXml,{Sync:0} );

			formObj.estm_amt.value=ComGetEtcData(sXml, "estm_amt");
			formObj.act_amt .value=ComGetEtcData(sXml, "act_amt");
			formObj.accl_amt.value=ComGetEtcData(sXml, "accl_amt");
			formObj.tot_cnt .value=ComGetEtcData(sXml, "tot_cnt");
			ComAddSeparator(formObj.estm_amt,"float");
		    ComAddSeparator(formObj.act_amt ,"float");
		    ComAddSeparator(formObj.accl_amt,"float");
		    ComAddSeparator(formObj.tot_cnt ,"int");
			break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
	with (formObj) {
		switch (sAction) {
			case IBSEARCH:
				if (formObj.exe_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00089');
					formObj.exe_yrmon.focus();
					return false;
				}
				break;
			case IBROWSEARCH:
				if (formObj.exe_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00089');
					formObj.exe_yrmon.focus();
					return false;
				}
				if (sheetObj.RowCount()== 0){
					ComShowCodeMessage("JOO00169");
					return false;
				}
				if (formObj.cre_flg.value == "Y"){					
					ComShowCodeMessage("JOO00172");
					return false;
				}
				break;
			case IBCREATE:
				if (formObj.exe_yrmon.value.length == 0){
					ComShowCodeMessage('JOO00089');
					formObj.exe_yrmon.focus();
					return false;
				}
				if (formObj.rev_yrmon_fr.value.length == 0){
					ComShowCodeMessage('JOO00089');
					formObj.rev_yrmon_fr.focus();
					return false;
				}
				if (formObj.rev_yrmon_to.value.length == 0){
					ComShowCodeMessage('JOO00089');
					formObj.rev_yrmon_to.focus();
					return false;
				}
				var exDt=formObj.exe_yrmon.value.replaceStr("-","")+"01";
				var frDt=formObj.rev_yrmon_fr.value.replaceStr("-","")+"01";
				var toDt=formObj.rev_yrmon_to.value.replaceStr("-","")+"01";
				if (ComGetDaysBetween(frDt, toDt) < 0){
					ComShowCodeMessage('JOO00078');
					formObj.rev_yrmon_to.focus();
					return false;
				}	
				if ((exDt.substring(0,4) != frDt.substring(0,4)) && (ComGetDaysBetween(exDt, frDt) > 0)){
					ComShowCodeMessage('JOO00130');
					formObj.exe_yrmon.focus();
					return false;
				}
				//Item 은 1개라도 선택을 해야 한다.
				if (comboObjects[3].GetSelectCode() == "" || comboObjects[3].GetSelectIndex() == -1){
					ComShowCodeMessage('JOO00115', "Item ");
					return false;
				}
				
				
				break;
			case IBSAVE:
				break;
			case IBBATCH: // I/F
				if (JooGetRadioValue(formObj.re_divr_cd) != ""){
					ComShowCodeMessage('JOO00127');
					return false;
				}
				if (comboObjects[0].GetSelectIndex()!= -1){
					ComShowCodeMessage('JOO00127');
					return false;
				}
				if (comboObjects[1].GetSelectIndex()!= -1){
					ComShowCodeMessage('JOO00127');
					return false;
				}
				if (comboObjects[2].GetSelectIndex()!= -1){
					ComShowCodeMessage('JOO00127');
					return false;
				}
				break;
		}
	}
	return true;
}
/************************************** Object EVENT FUNCTION ********************************************************/
//Find or create function combo_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode)

function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	sheetObjects[0].RemoveAll();
}
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	UF_setCond("3");
}
function rlane_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	UF_setCond("4");
}
/**************************************USER FUNCTION *****************************************************/
/**
 * NEW button 
 * @param    void
 * @return   void
 */
function UF_reset() {
	var formObj=document.form;
	formObj.page_no.value="1";
	sheetObjects[0].RemoveAll();
	formObj.estm_amt.value=0;
	formObj.act_amt .value=0;
	formObj.accl_amt.value=0;
	formObj.tot_cnt .value=0;
	comboObjects[0].RemoveAll();
	comboObjects[1].RemoveAll();
	comboObjects[2].RemoveAll();
	comboObjects[3].RemoveAll();
	var comboItems;
	if (ComTrim(gTrdCd) != ""){
		comboItems=(" |"+gTrdCd).split("|");
		addComboItem(comboObjects[0], comboItems);           	
	}
	//Rlane Combo setting
	if (ComTrim(gRlaneCd) != ""){
		comboItems=(" |"+gRlaneCd).split("|");
		addComboItem(comboObjects[1], comboItems);
	}
	//Carrier Combo setting
	if (ComTrim(gJoCrrCd) != ""){
		comboItems=(" |"+gJoCrrCd).split("|");
		addComboItem(comboObjects[2], comboItems);           	
	}
	//Item Combo setting
	if (ComTrim(gJoStlItmCd) != ""){
		var comboItems=gJoStlItmCd.split(ROWMARK);
		var comboItem="";
		jo_stl_itm_cd.InsertItem(-1, "ALL|", "ALL");	//ALL
		for (var i=0 ; i < comboItems.length ; i++) {
			comboItem=comboItems[i].split(FIELDMARK);
			jo_stl_itm_cd.InsertItem(-1, comboItem[0], comboItem[0]);
		}
		//jo_stl_itm_cd.SetSelectIndex(0);
		jo_stl_itm_cd.SetSelectCode("S/H", true);
		jo_stl_itm_cd.SetSelectCode("OPR", true);
	}else{
		jo_stl_itm_cd.RemoveAll();
	}
	
	//formObj.chk_port.checked=false;
	//formObj.chk_port.value="N";
	formObj.voy_days_cd[0].checked=true;
	
	formObj.exe_yrmon.value=ComGetDateAdd(gYyyyMM+"01","M",-1,"-").substring(0,7);
	/*
	var tmpFrYm = ComGetDateAdd(formObj.exe_yrmon.value,"M", -6);
	var tmpToYm = ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
	formObj.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");
	formObj.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");
	*/
	
	//From : -3년, To : +1 월
	var tmpToYm = ComGetDateAdd(formObj.exe_yrmon.value,"M", 1);
	formObj.rev_yrmon_to.value=JooGetDateFormat(tmpToYm,"ym");	
	
	//년월 만 하면 -3년이 넘게 설정 되어 동일 월로 설정하기 위해서 2015-07-02 로 Day 를 마춘다.
	var tmpFrYm = ComGetDateAdd(formObj.rev_yrmon_to.value+"-02","Y", -3);
	formObj.rev_yrmon_fr.value=JooGetDateFormat(tmpFrYm,"ym");	
	
	formObj.re_divr_cd[2].checked=true;
	formObj.vvd.value="";
	sheetObjects[0].RemoveAll();
	formObj.exe_yrmon.focus();
}

/**
 * 
 * <pre>
 *      handling button autority
 * </pre>
 *
 * @param   
 * @return
 * @author jang kang cheol
 */
function fnBtnEnable(auth, editable) {
	JooSetBtnClass("C", editable);
}

function sheet1_OnChange(sheetObj, Row, Col, Value) {
    var value = sheetObj.GetCellValue(Row, Col);
    switch (sheetObj.ColSaveName(Col)) {
        case prefix + "bsa_qty" :
            SetMakeCalculation(sheetObj, Row, Col);
            break;
        case prefix + "bsa_slt_prc":
            SetMakeCalculation(sheetObj, Row, Col);
            break;
            
        case prefix + "st_dt":
            var sFrDate = sheetObj.GetCellValue(Row,prefix + "st_dt");
            var sToDate = sheetObj.GetCellValue(Row,prefix + "end_dt");
            if(!getCheckPeriod(sFrDate, sToDate)){
                return;
            }else{
                SetMakeVvdDurationCalculation(sheetObj, Row, Col);
                
                //var dVoyDays = getVoyDays(sFrDate, sToDate);
                
                //sheetObj.SetCellValue(Row, prefix +"sail_dys", dVoyDays, 0);
            }
            break;
        case prefix + "end_dt":
            var sFrDate = sheetObj.GetCellValue(Row,prefix + "st_dt");
            var sToDate = sheetObj.GetCellValue(Row,prefix + "end_dt");
            if(!getCheckPeriod(sFrDate, sToDate)){
                return;
            }else{
                SetMakeVvdDurationCalculation(sheetObj, Row, Col);
            }           
            
            break;            
    }
}
function sheet1_OnSearchEnd(sheetObj, errMsg) {
	var formObj=document.form;
	if (formObj.cre_flg.value == "Y"){
		if(formObj.estm_amt.value!=0)
		formObj.estm_amt.value=sheetObj.GetSumText(0, prefix+"estm_amt");
		if(formObj.act_amt.value!=0)
		formObj.act_amt .value=sheetObj.GetSumText(0, prefix+"act_amt");
		if(formObj.accl_amt.value!=0)
		formObj.accl_amt.value=sheetObj.GetSumText(0, prefix+"accl_amt");
		formObj.tot_cnt .value=sheetObj.RowCount();
	    ComAddSeparator(formObj.tot_cnt ,"int");			
	}
	
	//BSA, Slot Price, From, To Edit 여부
	var val = $("input[name='voy_days_cd']:checked").val(); //$("#voy_days_cd").val();
	var isEditable = 0;
	if("V" == val){
		isEditable = 0;
	}else if("M" == val){
		isEditable = 1;
	}
	
	var iStRow = sheetObj.HeaderRows();
	var iEdRow = sheetObj.LastRow(); 
	
	for (var i=iStRow; i<=iEdRow; i++){
		sheetObj.SetCellEditable(i, prefix+"del_chk", 		isEditable);
		sheetObj.SetCellEditable(i, prefix+"bsa_qty", 		isEditable);
		sheetObj.SetCellEditable(i, prefix+"bsa_slt_prc", 	isEditable);
		sheetObj.SetCellEditable(i, prefix+"st_dt", 		isEditable);
		sheetObj.SetCellEditable(i, prefix+"end_dt", 		isEditable);
		
		var tmpChkEditFlg   = sheetObj.GetCellValue(i, prefix+"chk_edit_flg");
		if(tmpChkEditFlg == "N"){
            sheetObj.SetCellEditable(i, prefix+"st_dt", 0);
            sheetObj.SetCellEditable(i, prefix+"end_dt", 0);
        }
	}
	
}

function sheet1_OnAfterEdit(sheetObj, Row, Col) {
	var value = sheetObj.GetCellValue(Row, Col);
	switch (sheetObj.ColSaveName(Col)) {
		case prefix + "bsa_qty" :
			//SetMakeCalculation(sheetObj, Row, Col);
			break;
		case prefix + "bsa_slt_prc":
			//SetMakeCalculation(sheetObj, Row, Col);
			break;
		case prefix + "st_dt":
			var sFrDate = sheetObj.GetCellValue(Row,prefix + "st_dt");
			var sToDate = sheetObj.GetCellValue(Row,prefix + "end_dt");
			if(!getCheckPeriod(sFrDate, sToDate)){
				return;
			}else{
				//SetMakeVvdDurationCalculation(sheetObj, Row, Col);
			}
			break;
		case prefix + "end_dt":
			var sFrDate = sheetObj.GetCellValue(Row,prefix + "st_dt");
			var sToDate = sheetObj.GetCellValue(Row,prefix + "end_dt");
			if(!getCheckPeriod(sFrDate, sToDate)){
				return;
			}else{
				//SetMakeVvdDurationCalculation(sheetObj, Row, Col);
			}			
			
			break;
	}
}
function sheet1_OnEditValidation(sheetObj,Row, Col, Value) { 
	switch (sheetObj.ColSaveName(Col)) {
		case prefix + "del_chk" :
			//정책2. 체크된 레코드의 Estimated Cost 를 빼주어야 한다. Value = 1 : 빼준다. Value = 0 더해준다.
			
			//정책3. Total Count 를 그룹체크만큼 제외 시켜 준다.
			break;
		case prefix + "bsa_qty" :
			//var val=sheetObj.GetCellValue(Row, Col);
			if(!f_SetCipherLess(Value, 10, 3)){
				sheetObj.ValidateFail(2);
			}
			break;
		case prefix + "bsa_slt_prc":
			//var val=sheetObj.GetCellValue(Row, Col);
			if(!f_SetCipherLess(Value, 13, 3)){
				sheetObj.ValidateFail(2); 
			}
			break;
		case prefix + "st_dt":
		    if(ComIsEmpty(Value)) return;
		    
			var sDate = getArgValue(ComGetUnMaskedValue(Value	, "ymdhm"));
			if(!ComIsDateTime(sDate	, "ymd", "hm")){
				
				sheetObj.ValidateFail(2, ComShowMessage(ComGetMsg('JOO00201'))); 
				//sheetObj.SelectCell(Row, Col);
			}
			break;
		case prefix + "end_dt":
		    if(ComIsEmpty(Value)) return;
		    
			var sDate = getArgValue(ComGetUnMaskedValue(Value	, "ymdhm"));
			if(!ComIsDateTime(sDate	, "ymd", "hm")){
				sheetObj.ValidateFail(2, ComShowMessage(ComGetMsg('JOO00202'))); 
				//sheetObj.SelectCell(Row, Col);
			}
			break;
	}
}
/**
 * 정책1.sheet1_org_estm_amt = sheet1_bsa_qty|*|sheet1_bsa_slt_prc (변경된 Row를 가지고 동일 그룹 모두 변경)
 * @param sheetObj
 */
function SetMakeCalculation(sheetObj,Row, Col){
	var bsaQty 		= sheetObj.GetCellValue(Row, prefix + "bsa_qty");
	var bsaSltPrc 	= sheetObj.GetCellValue(Row, prefix + "bsa_slt_prc");
	var grpNo		= sheetObj.GetCellValue(Row, prefix + "grp_no");
	
	var orgEstmAmt 	= JooComGetRound(Number(bsaQty) * Number(bsaSltPrc), gAmountRoundPoint);
	var nowTmpTotEstmAmt = 0;
	
	var iStRow          = GetSheetRangeRow(sheetObj, Row, "S");
    var iEdRow          = GetSheetRangeRow(sheetObj, Row, "E");
    

    var tmpJoStlItmCd     = sheetObj.GetCellValue(Row, prefix + "jo_stl_itm_cd");
    
    if(tmpJoStlItmCd == gJoStlItmCdByOPR){ //OPR Item.
        //bsa_qty Data Set.
        sheetObj.SetCellValue(Row, prefix + "bsa_qty"      , bsaQty, 0);
        
        //bsa_slt_prc Data Set.
        sheetObj.SetCellValue(Row, prefix + "bsa_slt_prc"  , bsaSltPrc, 0);        

        //Opr은 estm_dys를 * 연산 추가.
        var sheetEstmDys    = sheetObj.GetCellValue(Row, prefix + "estm_dys"); 
        orgEstmAmt          = JooComGetRound(Number(bsaQty) * Number(bsaSltPrc) * Number(sheetEstmDys), gAmountRoundPoint); 
        
        //org_estm_amt Data Set.
        sheetObj.SetCellValue(Row, prefix + "org_estm_amt" , orgEstmAmt, 0);
        
        sheetObj.SetCellValue(Row, prefix + "estm_amt"     , orgEstmAmt, 0);
        
        //Accrual Cost 재계산
        var sheetActAmt = sheetObj.GetCellValue(Row, prefix + "act_amt");
        var tmpAcclAmt  = JooComGetRound(Number(orgEstmAmt) - Number(sheetActAmt) , gAmountRoundPoint);

        sheetObj.SetCellValue(Row, prefix + "accl_amt", tmpAcclAmt, 0);
    }else{    
    	for (var i=iStRow; i<=iEdRow; i++){
    		//1. 동일 그룹 찾기 ( 나 자신 포함)
    		var tmpGrpNo          = sheetObj.GetCellValue(i, prefix + "grp_no");
    		var sheetSailDys      = "";
    		var sheetEstmDys      = "";
    		var tmpEstmAmt        = "";
    		var tmpEstmYrmon      = "";
    		if(grpNo == tmpGrpNo){
    			//bsa_qty Data Set.
    			sheetObj.SetCellValue(i, prefix + "bsa_qty", bsaQty, 0);
    			
    			//bsa_slt_prc Data Set.
    			sheetObj.SetCellValue(i, prefix + "bsa_slt_prc", bsaSltPrc, 0);
    			
    			//org_estm_amt Data Set.
    			sheetObj.SetCellValue(i, prefix + "org_estm_amt", orgEstmAmt, 0);
    			
    			
    			sheetSailDys = sheetObj.GetCellValue(i, prefix + "sail_dys");
    			sheetEstmDys = sheetObj.GetCellValue(i, prefix + "estm_dys");
    			//각월별 Estimated Cost Data Set. orgEstmAmt * Days / Total
    			var tmpEstmYrMonDys = JooComGetRound( Number(sheetEstmDys) / Number(sheetSailDys), gDysRoundPoint);
    			var tmpEstmAmt = JooComGetRound( Number(orgEstmAmt) *  Number(tmpEstmYrMonDys) , gAmountRoundPoint);
    			
    			//estm_amt Data Set.
    			sheetObj.SetCellValue(i, prefix + "estm_amt", tmpEstmAmt, 0);
    			
    			nowTmpTotEstmAmt = Number(nowTmpTotEstmAmt) + Number(tmpEstmAmt);
    			
    			var sheetEndDt = sheetObj.GetCellValue(i, prefix + "end_dt");
    			var sheetEstmYrmon = sheetObj.GetCellValue(i, prefix + "estm_yrmon");
    			
    			//5.End Duration 년월 == estmYrmon 가 동일할때는 수치 보정을 해준다.
    			if(sheetEndDt.substring(0,6) == sheetEstmYrmon){
    				//Estimated Cost 보정.
    				tmpEstmAmt = Number(tmpEstmAmt) + (Number(orgEstmAmt) - Number(nowTmpTotEstmAmt));
    				sheetObj.SetCellValue(i, prefix + "estm_amt", tmpEstmAmt, 0);
    			}
    			
    			//Accrual Cost 재계산
    			var sheetActAmt = sheetObj.GetCellValue(i, prefix + "act_amt");
    			var tmpAcclAmt = JooComGetRound(Number(tmpEstmAmt) - Number(sheetActAmt) , gDysRoundPoint);
    
    			sheetObj.SetCellValue(i, prefix + "accl_amt", tmpAcclAmt, 0);
    		}
    	}
    }
	
	//Total Estimated Cost,  Actual Cost, Accrual Cost, Total Count	수치 변경.
	SetMakeTotalCalculation(sheetObj);
}
/*
//From 정책1. 수정된 년월이 ByMonth 보다 얼마나 작은지 확인.
//           차수 만큼 Row Insert 한다.

//From 정책2. 수정된 년월이 Bymonth 보다 얼마나 큰지 확인.
//
            차수 만큼 Row Delete 한다.
*/
function SetMakeVvdDurationCalculation(sheetObj,Row, Col){
	var grpNo 			= sheetObj.GetCellValue(Row, prefix + "grp_no"); 
	var stDt 			= sheetObj.GetCellValue(Row, prefix + "st_dt"); 
	var endDt 			= sheetObj.GetCellValue(Row, prefix + "end_dt"); 
	var estmYrmon 		= sheetObj.GetCellValue(Row, prefix + "estm_yrmon");
	var exeYrmon 		= sheetObj.GetCellValue(Row, prefix + "exe_yrmon");
	var minEstmYrmon 	= sheetObj.GetCellValue(Row, prefix + "min_estm_yrmon");
	var maxEstmYrmon 	= sheetObj.GetCellValue(Row, prefix + "max_estm_yrmon");
	
	var tmpFrDate = stDt.substring(0,6)+ "01";;
	var tmpToDate = endDt.substring(0,6)+ "01";
	var tmpMaxDate= exeYrmon.substring(0,6)+ "01";
	
	var tmpSailDys = GetVoySailDays(stDt, endDt);
	
	var arrayEstmYrmon = GetVvdDurationMonthData(tmpFrDate, tmpToDate, tmpMaxDate);
	var iSheetBreakCnt=0;
	if(arrayEstmYrmon.length > 0){
		//insert 
		for (var j=0 ; j < arrayEstmYrmon.length; j++){
			var varEstmYrmon = arrayEstmYrmon[j];		
			//var iSheetBreakCnt=0;
			var isFirstRow = true;
			var iStartMaxRow = 0;
			for (var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
				//1. 동일 그룹 찾기 ( 나 자신 포함)
				var tmpGrpNo = sheetObj.GetCellValue(i, prefix + "grp_no");
				if(grpNo == tmpGrpNo){
					if(isFirstRow){
						iStartMaxRow = i;
						isFirstRow= false;
					}
					var sheetEstmYrmon = sheetObj.GetCellValue(i, prefix + "estm_yrmon");
					if(GetVvdDurationMonthSheetContains(sheetObj, varEstmYrmon, grpNo)){
						break;
					}else{
						var inRow = Row;
						if(parseInt(varEstmYrmon) < parseInt(sheetEstmYrmon) && parseInt(varEstmYrmon) < parseInt(minEstmYrmon)){
							inRow = i;
							//DataInsert : DataCopy 후에 이동시켜준다.
							sheetObj.DataCopy();
							//DataMove시 시작은 1부터 시작. Move후에 Move된 Row를 리턴한다.
							inRow = sheetObj.DataMove(inRow);
							//estm_yrmon 를 Data Set.
							sheetObj.SetCellValue(inRow, prefix + "estm_yrmon", varEstmYrmon, 0);
							sheetObj.SetCellValue(inRow, prefix + "min_estm_yrmon", varEstmYrmon, 0);
							sheetObj.SetCellValue(inRow, prefix + "estm_act_seq", "", 0);//신규 입력시 널로 해주어야야 신규로 인식 가능함.
							//minEstmYrmon 를 바꾸어 준다.
							minEstmYrmon = varEstmYrmon;
							break;
						}else if(parseInt(varEstmYrmon) > parseInt(sheetEstmYrmon) && parseInt(varEstmYrmon) > parseInt(maxEstmYrmon)){
							inRow = iStartMaxRow + j + 1;
							//DataInsert : DataCopy후에 마지막 라인으로 이동시켜 준다.
							sheetObj.DataCopy();
							//DataMove시 시작은 1부터 시작. Move후에 Move된 Row를 리턴한다.
							inRow = sheetObj.DataMove(inRow);
							//estm_yrmon 를 Data Set.
							sheetObj.SetCellValue(inRow, prefix + "estm_yrmon", varEstmYrmon, 0);
							sheetObj.SetCellValue(inRow, prefix + "max_estm_yrmon", varEstmYrmon, 0);
							sheetObj.SetCellValue(inRow, prefix + "estm_act_seq", "", 0);//신규 입력시 널로 해주어야야 신규로 인식 가능함.
							//maxEstmYrmon 를 바꾸어 준다.
							maxEstmYrmon = varEstmYrmon;
							break;
						}
					}
					iSheetBreakCnt ++;
				}
				//선택된 grpNo 만 Loop를 돌리기 위한 로직. 
				if(arrayEstmYrmon.length == iSheetBreakCnt) break;
			}
		}//insert end
		
		//delete 시에는 전체로 찾아서 지우도록 한다.
		for (var j=0 ; j < arrayEstmYrmon.length; j++){
			var varEstmYrmon = arrayEstmYrmon[j];		
			
			var iSheetDeleteCnt =0;
			for (var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
				//1. 동일 그룹 찾기 ( 나 자신 포함)
				var tmpGrpNo = sheetObj.GetCellValue(i, prefix + "grp_no");
				if(grpNo == tmpGrpNo){
					var sheetEstmYrmon = sheetObj.GetCellValue(i, prefix + "estm_yrmon");
					if(!GetVvdDurationMonthContains(arrayEstmYrmon, sheetEstmYrmon)){
						sheetObj.SetCellValue(i, prefix+"del_chk", 	1, 0);
						iSheetDeleteCnt++;
					}
					//iSheetBreakCnt ++;
				}
				//선택된 grpNo 만 Loop를 돌리기 위한 로직. 
				//if(arrayEstmYrmon.length == iSheetBreakCnt) break;
			}
		}//delete end
		
		//선택 Row Delete
		if(iSheetDeleteCnt> 0) JooRowHideDelete(sheetObj, 1);
		
		//계산 로직을 돌린다.
		var nowTmpTotEstmAmt  = 0;
		var nowTmpTotActAmt   = 0;
		var nowTmpTotEstmDys  = 0;
		iSheetBreakCnt=0;
		
		//위에서 Delete Row가 존재하므로 새로 구한다.
        var iStRow          = GetSheetRangeRow(sheetObj, Row, "S");
        var iEdRow          = GetSheetRangeRow(sheetObj, Row, "E");        
		
		for (var i=iStRow; i<=iEdRow; i++){
			//1. 동일 그룹 찾기 ( 나 자신 포함)
			var sheetGrpNo      = sheetObj.GetCellValue(i, prefix + "grp_no");
            var tmpJoStlItmCd   = sheetObj.GetCellValue(i, prefix + "jo_stl_itm_cd");
			if(grpNo == sheetGrpNo){
				//1.Voy Days Total(sail_dys) Data Set.
				sheetObj.SetCellValue(i, prefix + "sail_dys", tmpSailDys, 0);
				
				//2.Voy Days Days(estm_dys) Data Set.
				var sheetEstmYrmon = sheetObj.GetCellValue(i, prefix + "estm_yrmon");
				var tmpEstmDys = GetVoyEstmDays(stDt, endDt, sheetEstmYrmon);
				sheetObj.SetCellValue(i, prefix + "estm_dys", tmpEstmDys, 0);
				
				//2.1.Estm Dys 수치 보정 : End Duration 년월 == estmYrmon 가 동일할때는 수치 보정을 해준다.
				nowTmpTotEstmDys = Number(nowTmpTotEstmDys) +  Number(tmpEstmDys);
                if(endDt.substring(0,6) == sheetEstmYrmon){
                    //Estimated Cost 보정.
                    tmpEstmDys = Number(tmpEstmDys) + (Number(tmpSailDys) - Number(nowTmpTotEstmDys));
                    tmpEstmDys = JooComGetRound(tmpEstmDys, gDysRoundPoint);
                    
                    sheetObj.SetCellValue(i, prefix + "estm_dys", tmpEstmDys, 0);
                }

				var tmpEstmYrmonDys = JooComGetRound( Number(tmpEstmDys) / Number(tmpSailDys), gDysRoundPoint);
				
				if(tmpJoStlItmCd == gJoStlItmCdByOPR ){ //OPR
                    var tmpOprBsaQty          = sheetObj.GetCellValue(i, prefix + "bsa_qty");
                    var tmpOprBsaSltPrc       = sheetObj.GetCellValue(i, prefix + "bsa_slt_prc");
                    
                    var tmpOprOrgEstmAmt      = JooComGetRound(Number(tmpOprBsaQty) * Number(tmpOprBsaSltPrc) * Number(tmpEstmDys), gAmountRoundPoint); 
                    
                    sheetObj.SetCellValue(i, prefix + "estm_amt", tmpOprOrgEstmAmt, 0);
                    
                    //Accrual Cost 재계산
                    var sheetActAmt = sheetObj.GetCellValue(i, prefix + "act_amt");
                    var tmpAcclAmt  = JooComGetRound(Number(tmpOprOrgEstmAmt) - Number(sheetActAmt) , gAmountRoundPoint);

                    sheetObj.SetCellValue(i, prefix + "accl_amt", tmpAcclAmt, 0);
				}else{
	                
	                //3.각월별 Estimated Cost Data Set. orgEstmAmt * Days / Total
	                var sheetOrgEstmAmt = sheetObj.GetCellValue(i, prefix + "org_estm_amt");
	                var tmpEstmAmt = JooComGetRound( Number(sheetOrgEstmAmt) *  Number(tmpEstmYrmonDys) , gAmountRoundPoint);
	                sheetObj.SetCellValue(i, prefix + "estm_amt", tmpEstmAmt, 0);
	                
	                //4.각월별 Actual Cost Data Set. org_act_amt * Days / Total
	                var sheetOrgActAmt = sheetObj.GetCellValue(i, prefix + "org_act_amt");
	                var tmpActAmt = JooComGetRound( Number(sheetOrgActAmt) *  Number(tmpEstmYrmonDys) , gAmountRoundPoint);
	                sheetObj.SetCellValue(i, prefix + "act_amt", tmpActAmt, 0);
	                
	                nowTmpTotEstmAmt = Number(nowTmpTotEstmAmt) +  Number(tmpEstmAmt);
	                nowTmpTotActAmt  = Number(nowTmpTotActAmt)  +  Number(tmpActAmt);
	                
	                //5.End Duration 년월 == estmYrmon 가 동일할때는 수치 보정을 해준다.
	                if(endDt.substring(0,6) == sheetEstmYrmon){
	                    //Estimated Cost 보정.
	                    tmpEstmAmt = Number(tmpEstmAmt) + (Number(sheetOrgEstmAmt) - Number(nowTmpTotEstmAmt));
	                    sheetObj.SetCellValue(i, prefix + "estm_amt", tmpEstmAmt, 0);
	                    
	                    //Actual cost 보정.
	                    tmpActAmt = Number(tmpActAmt) + (Number(sheetOrgActAmt) - Number(nowTmpTotActAmt));
	                    sheetObj.SetCellValue(i, prefix + "act_amt", tmpActAmt, 0);
	                }
	                
	                //6.Accrual Cost 재계산
	                var tmpAcclAmt = JooComGetRound(Number(tmpEstmAmt) - Number(tmpActAmt) , gAmountRoundPoint);
	                sheetObj.SetCellValue(i, prefix + "accl_amt", tmpAcclAmt, 0);				    
				}
				
				//7.VVD Duration 다시 셋팅.
				sheetObj.SetCellValue(i, prefix + "st_dt", stDt, 0);
				sheetObj.SetCellValue(i, prefix + "end_dt", endDt, 0);
				
				//8.Min/Max estm yrmon Data Set.
				sheetObj.SetCellValue(i, prefix + "min_estm_yrmon", tmpFrDate.substr(0,6), 0);
				sheetObj.SetCellValue(i, prefix + "max_estm_yrmon", tmpToDate.substr(0,6), 0);
				
				
				//9.IBFlag 변경한다.
				var sheetEstmActSeq = sheetObj.GetCellValue(i, prefix + "estm_act_seq");
				if(sheetEstmActSeq == ""){
					sheetObj.SetCellValue(i, prefix + "ibflag", "I", 0);
				}else{
					sheetObj.SetCellValue(i, prefix + "ibflag", "U", 0);
				}
				iSheetBreakCnt++;
			}
			//선택된 grpNo 만 Loop를 돌리기 위한 로직. 
			if(arrayEstmYrmon.length == iSheetBreakCnt) break;
		}
	}
	
	//Total Estimated Cost,  Actual Cost, Accrual Cost, Total Count	수치 변경.
	SetMakeTotalCalculation(sheetObj);
	
	return;
	
}

/* Estimate 에서는 의미 없는 컬럼임.
var gSheetInitCols = "act_inv_amt|act_slip_amt|act_appr_amt|act_amt|stl_rmk|stl_vvd_seq|chk_qty_priority|chk_prc_priority|chk_del_flg|chk_eq_act_flg|chk_del_mrk_flg|chk_edit_flg";
function SetSheetInitCols(sheetObj, Row){
    var tmpCols=gSheetInitCols.split(ROWMARK);
    for (var i=0 ; i < tmpCols.length ; i++) {
        sheetObj.SetCellValue(Row, tmpCols[i], "", 0);
    }
}*/

/*
 * Sheet의 Row가 많으므로 특정 Gap으로 범위를 줄이기 위한 Row값 리턴.
 */
function GetSheetRangeRow(sheetObj, selRow, flg){
    var iHeadRow = sheetObj.HeaderRows();
    var iLastRow = sheetObj.LastRow();
    var iGapRow = 20;
    var iReturnRow = iHeadRow;
    switch(flg){
        case "S":
            var iStartRow = selRow - iGapRow;
            
            if(iHeadRow >= iStartRow){
                iReturnRow = iHeadRow;
            }else{
                iReturnRow = iStartRow;
            }
            break;
        case "E":
            var iEndRow = selRow + iGapRow;
            
            if(iLastRow <= iEndRow){
                iReturnRow = iLastRow;
            }else{
                iReturnRow = iEndRow;
            }            
            break;
    }
    
    return iReturnRow;
}

function GetDateDiffMonth(frDt, toDt)
{
	var sText = getArgValue(frDt);
	var eText = getArgValue(toDt);
	sYear  = sText.substring(0,4);
    sMonth = sText.substring(4,6);
    sDay   = sText.substring(6,8);
	eYear  = eText.substring(0,4);
    eMonth = eText.substring(4,6);
    eDay   = eText.substring(6,8);
    
    if(!ComIsDay( year,month ,day)) return false;
    
	var FromDate = new Date(ComParseInt(sYear),ComParseInt(sMonth),ComParseInt(sDay));
	var ToDate = new Date(ComParseInt(eYear),ComParseInt(eMonth),ComParseInt(eDay));

    var diffYears = ToDate.getFullYear()-FromDate.getFullYear();
    var diffMonths = ToDate.getMonth()-FromDate.getMonth();
    var diffDays = ToDate.getDate()-FromDate.getDate();
    
    var months = (diffYears*12 + diffMonths);
        
    return months;
}


function GetVvdDurationMonthData(stDt, endDt, maxDt)
{
	var sText = getArgValue(stDt);
	var eText = getArgValue(endDt);
	var mText = getArgValue(maxDt);
	sYear  = sText.substring(0,4);
    sMonth = sText.substring(4,6);
    sDay   = sText.substring(6,8);
	eYear  = eText.substring(0,4);
    eMonth = eText.substring(4,6);
    eDay   = eText.substring(6,8);
    
    mTextYrmon = mText.substring(0,6);
    
    if(!ComIsDay( year,month ,day)) return false;
    
	var FromDate = new Date(ComParseInt(sYear),ComParseInt(sMonth)-1,ComParseInt(sDay));
	var ToDate = new Date(ComParseInt(eYear),ComParseInt(eMonth)-1,ComParseInt(eDay));

    var diffYears = ToDate.getFullYear()-FromDate.getFullYear();
    var diffMonths = ToDate.getMonth()-FromDate.getMonth() + 1;
    var diffDays = ToDate.getDate()-FromDate.getDate();
    
    var months = (diffYears*12 + diffMonths);
    var arryEstmYrmon = new Array();
    
    //sText는 Day는 무조건 01로 준다.
    for(var i=0 ; i < months ; i++){
    	
    	//
    	var tmpEstmYrmon = ComGetUnMaskedValue(JooGetDateFormat(ComGetDateAdd(sText, "M", i),"ym"),"ym");
    	if(parseInt(tmpEstmYrmon) <= parseInt(mTextYrmon)){
    		arryEstmYrmon[i] = tmpEstmYrmon;
    	}
    }
        
    return arryEstmYrmon;
}

function GetVvdDurationMonthContains(arrayObj, yrMon){
	if(arrayObj.length > 0){
		for (var j=0 ; j < arrayObj.length; j++){
			var varEstmYrmon = arrayObj[j];
			if(varEstmYrmon == yrMon){
				return true;
			}
		}		
	}
	return false;
}

function GetVvdDurationMonthSheetContains(sheetObj, yrMon, grpNo){
	for (var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
		//1. 동일 그룹 찾기 ( 나 자신 포함)
		var tmpGrpNo = sheetObj.GetCellValue(i, prefix + "grp_no");
		if(grpNo == tmpGrpNo){
			var tmpEstmYrmon = sheetObj.GetCellValue(i, prefix + "estm_yrmon");
			if(yrMon == tmpEstmYrmon){
				return true;
			}
		}
	}
	
	return false;
}


function SetMakeTotalCalculation(sheetObj){
	var formObj = document.form;
	var tot_estm_amt 	= sheetObj.GetCellValue(sheetObj.LastRow(), prefix +"estm_amt");
	var tot_act_amt 	= sheetObj.GetCellValue(sheetObj.LastRow(), prefix +"act_amt");
	var tot_accl_amt 	= sheetObj.GetCellValue(sheetObj.LastRow(), prefix +"accl_amt");
	var tot_count 		= sheetObj.RowCount() - sheetObj.RowCount("D");
	formObj.estm_amt.value=tot_estm_amt;
	formObj.act_amt .value=tot_act_amt;
	formObj.accl_amt.value=tot_accl_amt;
	formObj.tot_cnt .value=tot_count;
	ComAddSeparator(formObj.estm_amt,"float");
    ComAddSeparator(formObj.act_amt ,"float");
    ComAddSeparator(formObj.accl_amt,"float");
    ComAddSeparator(formObj.tot_cnt ,"int");
}

function UF_setCond(flg){
	var formObj=document.form;
	formObj.estm_amt.value="";
	formObj.act_amt .value="";
	formObj.accl_amt.value="";
	formObj.tot_cnt .value="";
	formObj.estm_cond_flg.value=flg;
	var varFlag = flg+"";
	switch (varFlag){
		//in case of changing exe month, re_divr_cd
		case "1":
		//in case of changing rev year month
		case "2":
			trd_cd.SetSelectIndex(-1,false);
			trd_cd.RemoveAll();
		//in case of changing Trade
		case "3":
			rlane_cd.SetSelectIndex(-1,false);
			rlane_cd.RemoveAll();
		//in case of changing Lane
		case "4":
			jo_crr_cd.SetSelectIndex(-1,false);
			jo_crr_cd.RemoveAll();
			break;
	}
	sheetObjects[0].RemoveAll();
	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);		
}
function UF_checkPeriod(){
	var formObj=document.form;
	var frDt=formObj.rev_yrmon_fr.value.replaceStr("-","")+"01";
	var toDt=formObj.rev_yrmon_to.value.replaceStr("-","")+"01";
	if (ComGetDaysBetween(frDt, toDt) <= 0){
		return false;
	}	
	return true;
}
function UF_getBackEndJobStatus() {
	//alert("UF_getBackEndJobStatus");
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
}

function resizeSheet(){
    for (i=0; i<sheetObjects.length; i++){
        ComResizeSheet(sheetObjects[i], 70);
    }
}

function setVoyDaysOnClick(val){
	//재조회 한다.
	sheetObjects[0].RemoveAll();
	doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
}

function dateTimeOnChange(sheetObj,row,col,value) {
	if (sheetObj.GetCellProperty(row,col,"Format") != dftUserFormatYmdhhmi) return;

	if (value=="") return;
	
	var sText=sheetObj.GetCellText(row,col);
	if (!ComIsDateTime2(sText, "ymdhm")) {
		ComShowMessage(ComGetMsg('JOO00198', sheetObj.GetCellText(0,col)));
		//ComShowMessage(sheetObj.CellText(0,col) + " is not valid date-time. Please enter a correct date-time. \n\n Format : YYYY-MM-DD HH:MM");
		sheetObj.SelectCell(row,col,true);
		return;
	}
	// Period Check
	var sFrDate = sheetObj.GetCellText(row,prefix + "st_dt");
	var sToDate = sheetObj.GetCellText(row,prefix + "end_dt")
	if (sFrDate != "" && sToDate != ""){
		
		if(!getCheckPeriod(sFrDate, sToDate)){		
			if(sheetObj.ColSaveName(col)==prefix + "st_dt") {
				sText=sheetObj.GetCellText(row,col+1);
				sheetObj.SelectCell(row,col+1,true);
			} else {
				sheetObj.SelectCell(row,col,true);
			}
			return;
		}
	}else{
		return;
	}
}
/*
 *  Setting data with integerPlace and decimalPlace
 */
function f_SetCipherLess(val, integerPlace, decimalPlace){
	val = val+"";
	var arrVal=val.split(".");
	if(arrVal.length == 1){
		if(arrVal[0].length > integerPlace){
			ComShowCodeMessage("JOO00199", "[The Part Of The Integer]", "[Less Than or Equal To " + integerPlace + "-Digit]");
			return false;
		}
	} else if(arrVal.length == 2){
		if(arrVal[0].length > integerPlace){
			ComShowCodeMessage("JOO00199", "[The Part Of The Integer]", "[Less Than or Equal To " + integerPlace + "-Digit]");
			return false;
		}
		if(arrVal[1].length > decimalPlace){
			ComShowCodeMessage("JOO00199", "[The Part Of The Decimal]", "[Less Than or Equal To " + decimalPlace + "-Digit]");
			return false;
		}
	}	
	return true;
}

function GetVoySailDays(sFrDate, sToDate) {
	var dVoyDays = 0;
	sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate	, "ymdhm"));
	sToDate = getArgValue(ComGetUnMaskedValue(sToDate	, "ymdhm"));

	if(!getCheckPeriod(sFrDate, sToDate)) return;
	
	//ComJoo Function Call.
	try {
		
		dVoyDays = JooComGetDaysBetween2(sFrDate, sToDate, gDysRoundPoint);//소수점 5자리까지.
		
	} catch(err) {ComFuncErrMsg(err.message);}
	
	return dVoyDays;
}

function GetVoyEstmDays(sFrDate, sToDate, sEstmYrmon){
	sFrDate 	= getArgValue(ComGetUnMaskedValue(sFrDate	, "ymdhm"));
	sToDate 	= getArgValue(ComGetUnMaskedValue(sToDate	, "ymdhm"));
	sEstmYrmon 	= getArgValue(ComGetUnMaskedValue(sEstmYrmon	, "ym"));
	
	//YYYYMMDDHH24MISS 포맷으로 맞추어 준다.
	var tmpFrDate = "";
	var tmpToDate = "";
	//Estm 시작일
	if(sEstmYrmon == sFrDate.substring(0,6)){
		tmpFrDate = sFrDate + "00";
	}else{
		tmpFrDate = sEstmYrmon +"01000000";
	}
	
	//Estm 종료일
	if(sEstmYrmon ==  sToDate.substring(0,6)){
		tmpToDate = sToDate + "59";
	}else{
		//마지막 날을 찾는다.		
		
		var varLastDay = ComGetLastDay(parseInt(sEstmYrmon.substr(0,4)), parseInt(sEstmYrmon.substr(4,6)));
		tmpToDate = sEstmYrmon + varLastDay + "235959";
	}
	
	var dEstmDays = 0;
	try {
		
		dEstmDays = JooComGetDaysBetween2(tmpFrDate, tmpToDate, gDysRoundPoint);//소수점 5자리까지.
		
	} catch(err) {ComFuncErrMsg(err.message);}
	
	return dEstmDays;
	
}

function getCheckDate(sDate, val){
	sDate = getArgValue(ComGetUnMaskedValue(sDate	, "ymdhm"));
	switch(val){
		case prefix + "st_dt":
			if(!ComIsDateTime(sDate	, "ymd", "hm")){
				ComShowMessage(ComGetMsg('JOO00201')); //Please input Duration From exactly.
				return false;
			}
			break;
		case prefix + "end_dt":
			if(!ComIsDateTime(sDate	, "ymd", "hm")){
				ComShowMessage(ComGetMsg('JOO00202')); //Please input Duration To exactly.
				return false;
			}
			break;
	}
}

function getCheckPeriod(sFrDate, sToDate){
	sFrDate = getArgValue(ComGetUnMaskedValue(sFrDate	, "ymdhm"));
	sToDate = getArgValue(ComGetUnMaskedValue(sToDate	, "ymdhm"));
	/*//1.년월일시분 인지 체크
	if(!ComIsDateTime(sFrDate	, "ymd", "hm")){
		ComShowMessage(ComGetMsg('JOO00201')); //Please input Duration From exactly.
		return false;
	}
	if(!ComIsDateTime(sToDate	, "ymd", "hm")){
		ComShowMessage(ComGetMsg('JOO00202')); //Please input Duration To exactly.
		return false;
	}*/
	
	//2.from, to 날짜 비교
	var sFrYmd = sFrDate.substring(0,8);
	var sToYmd = sToDate.substring(0,8);
	if(ComChkPeriod(sFrYmd, sToYmd) < 1) {
		ComShowMessage(ComGetMsg('JOO00200')); //Please input Duration(From ~ To) exactly.
		return false;
	}
	
	return true;
}