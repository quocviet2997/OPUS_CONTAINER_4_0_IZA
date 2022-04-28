/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_02.jsp
*@FileTitle  : Invoice Issue (Email)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/31
=========================================================*/
/****************************************************************************************
	  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
						[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
						기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @fileoverview define calandar method when common use in java script file.
 * @author Cyberlogitec
 */
/** 
 * fns_inv_0034_02 : defile script for create fns_inv_0034_02 UI. <br>
 * <br><b>Example :</b>
 * <pre>
 *     fns_inv_0034_02()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
// common global valiables
var ROWMARK="|";
var FIELDMARK="^";
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
//var rdObjects=new Array();
//var rdCnt=0;
var appendReport = [];
var uploadObjects=new Array();
var uploadCnt=0;
var pSheetObj, pRow, pCol ;
var rdFile="";

// define button click event handler */
document.onclick=processButtonClick;

var cfmFlg = ""; //2018-04-30	
var mmFlg = ""; //2018-04-30	

/**
 * define onLoad event handler<br>
 * <br><b>Example :</b>
 * <pre>
 *     loadPage()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function loadPage() {
	var formObject=document.form;
	var opener = window.dialogArguments;
	if (!opener) opener=window.opener;  
	if (!opener) opener=parent;
	if (formObject.issue_gubn.value == "I") {
		formObject.f_inv.value=opener.document.form.f_inv.value;
		formObject.t_inv.value=opener.document.form.t_inv.value;
		formObject.inv_nos.value=opener.document.form.invoice_nos.value;
		formObject.flag.value="M";
		formObject.copy_cnt.value=opener.document.form.copy_cnt.value;
		formObject.iss_ofc_cd.value=opener.document.form.ar_ofc_cd2.value; 
	} else {
		
		formObject.invs.value=opener.document.form.invs_email.value;
		formObject.f_inv.value=opener.document.form.f_inv.value;
		formObject.t_inv.value=opener.document.form.t_inv.value;
		formObject.flag.value=(opener.document.form.sel_option[0].checked ? "S" : "M");
		formObject.copy_cnt.value=opener.document.form.copy_cnt.value;
		formObject.iss_ofc_cd.value=opener.document.form.ar_ofc_cd2.value; 
//		if (formObject.office_cnt_cd.value == "FR") {
//			formObject.logo_gb1.disabled = false;
//			formObject.logo_gb2.disabled = false;
//			formObject.logo_gb1.checked = false;
//			formObject.logo_gb2.checked = false;
//			formObject.iss_fr.value = "Y";
//			logoGbChk();
//			document.all.layer1.style.display = "";
//			document.all.layer2.style.display = "";
//		}else{
			formObject.logo_gb1.disabled = true;
			formObject.logo_gb2.disabled = true;
			formObject.logo_gb1.checked = false;
			formObject.logo_gb2.checked = false;
			document.all.layer1.style.display = "none";
			document.all.layer2.style.display = "none";
//		}
	}
	for(i=0;i<sheetObjects.length;i++){
		ComConfigSheet (sheetObjects[i] );
		initSheet(sheetObjects[i],i+1);
		ComEndConfigSheet(sheetObjects[i]);
	}
	//initRdConfig(rdObjects[0]);
	//initRdConfig(rdObjects[1]);
	
	//ComConfigUpload(uploadObjects[0], "/opuscntr/FNS_INV_0034_02GS.do");
	initUpload();
	sheetObjects[0].SetColHidden("f_del",1);
	sheetObjects[0].SetColHidden("f_copy",1);
	
	doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
	
	sheetObjects[0].SetColHidden("f_del",0);
	sheetObjects[0].SetColHidden("f_copy",0);
}

/**	 
 * logo_gb1, logo_gb2 클릭시 값 세팅 <br>
 * <br><b>Example :</b>
 * <pre>
 *     
 * </pre>
 * @param 없음
 * @return 없음
 * @author 정휘택
 * @version 2009.10.20
 */
function logoGbChk(){
	var formObject = document.form;
//	if (formObject.office_cnt_cd.value == "FR") {
//		if(formObject.logo_gb1.checked == true && formObject.logo_gb2.checked == false){
//			formObject.logo_gb.value = "1";			
//		}
//		if(formObject.logo_gb1.checked == false && formObject.logo_gb2.checked == true){
//			formObject.logo_gb.value = "2";			
//		}
//		if(formObject.logo_gb1.checked == true && formObject.logo_gb2.checked == true){
//			formObject.logo_gb.value = "3";			
//		}
//		if(formObject.logo_gb1.checked == false && formObject.logo_gb2.checked == false){
//			formObject.logo_gb.value = "";			
//		}
//	}	
}

/**	 
 * send_type 클릭시 값 세팅 <br>
 * <br><b>Example :</b>
 * <pre>
 *    
 * </pre>
 * @param 없음
 * @return 없음
 * @author 정휘택
 * @version 2009.10.20
 */
function sendTypeChk(){
	var formObject = document.form;
//	if (formObject.office_cnt_cd.value == "FR") {
//		if (formObject.send_type[0].checked || formObject.send_type[1].checked || formObject.send_type[2].checked){
//			formObject.logo_gb1.disabled = false;
//			formObject.logo_gb2.disabled = false;
//			formObject.logo_gb1.checked = false;
//			formObject.logo_gb2.checked = false;
//			formObject.iss_fr.value = "Y";
//				logoGbChk();
//		}else{
//			formObject.logo_gb1.disabled = true;
//			formObject.logo_gb2.disabled = true;
//			formObject.logo_gb1.checked = false;
//			formObject.logo_gb2.checked = false;
//			formObject.logo_gb.value = "";
//			formObject.iss_fr.value = "";
//		}
//	}
}

/**
 * event handler branch process by button name <br>
 * <br><b>Example :</b>
 * <pre>
 *     processButtonClick()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */

function processButtonClick(){
	var sheetObject1=sheetObjects[0];
	var sheetObject2=sheetObjects[1];
	/*******************************************************/
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
		switch(srcName) {
		case "btn_retrieve":
			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
			break;
		case "btn_preview":
			invPreview(sheetObject1, formObject);
			break; 
		case "btn_send":
			invSend(sheetObject1, formObject);      					
			break; 
		case "btn_close":
			ComClosePopup(); 
			break;      					
		} // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}
/**
 * add IBSheet Object array <br>
 * <br><b>Example :</b>
 * <pre>
 *     setSheetObject(sheetObj)
 * </pre>
 * @param {ibsheet} sheetObj
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function setSheetObject(sheetObj){
	sheetObjects[sheetCnt++]=sheetObj;
}

/**
 * initializing sheet, define header<br> 
 * <br><b>Example :</b>
 * <pre>
 *     initSheet(sheetObj, 0)
 * </pre>
 * @param {ibsheet} sheetObj 
 * @param {int} sheetNo 
 * @return none 
 * @author 정휘택
 * @version 2009.10.20     
 */  
function initSheet(sheetObj,sheetNo) {
	var formObject=document.form;
	var cnt=0;
	switch(sheetNo) {
	case 1:      //t2sheet1 init
	with (sheetObj) {
//		SetGetSelectionMode(smSelectionList);
		SelectionMode = smSelectionList;		
		
		var HeadTitle1="|Sel.|VVD|Cust. Code|Cust. Name|Invoice No.|Group Invoice No.|Group Invoice Flag|LPO No.|E-mail Address|Fax No.|INV Ref. No.|I/F No.|B/L No.|Port Cd.|Remark(s)|inv_rmk2|Attach more from my PC|Attach more from my PC|Attach more from my PC|Attach more from my PC|File Key|Inv Seq.|CMB FLG|f_save_id|iss_grp_tp_cd|rd_name";
		var headCount=ComCountHeadTitle(HeadTitle1);
		(headCount, 6, 0, true);

		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1, FrozenCol:6 } );

		var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
		var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		InitHeaders(headers, info);

		var cols = [ {Type:"Status",    Hidden:1,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag",           Wrap:1 },
		             {Type:"CheckBox",  Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"slt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"vvd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cust_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:215,  Align:"Left",    ColMerge:0,   SaveName:"cust_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"grp_inv_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:1,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"grp_iss_flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:1,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:"locl_po_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:25,    Wrap:1 },
	            	 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"cust_eml",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"cust_fax_no",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_ref_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"port_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Popup",     Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"inv_rmk",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_iss_rmk",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"PopupEdit", Hidden:0, Width:200,   Align:"Left",  ColMerge:0,   SaveName:"f_name",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   Wrap:1, EditLen:200 },
		             //{Type:"Image",     Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"f_add",       	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Image",     Hidden:0, Width:75,   Align:"Center",  ColMerge:0,   SaveName:"f_del",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Image",     Hidden:0, Width:140,  Align:"Center",  ColMerge:0,   SaveName:"f_copy",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"f_key",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"inv_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:10,   Align:"Center",  ColMerge:0,   SaveName:"inv_iss_cmb_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:10,   Align:"Center",  ColMerge:0,   SaveName:"f_save_id",  	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:10,   Align:"Center",  ColMerge:0,   SaveName:"iss_grp_tp_cd",  	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
		             {Type:"Text",      Hidden:1, Width:10,   Align:"Center",  ColMerge:0,   SaveName:"rd_name",  	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 }
		             ];    
		 
		InitColumns(cols);  
       
		SetEditable(1);  
		SetImageList(0,"img/btng_add.gif"); 
		SetImageList(1,"img/btng_delete.gif");
		SetImageList(2,"img/btng_copy_to_same_vvd.gif");
		//SetCountPosition()(2);
		SetDataLinkMouse("f_name", true);
		SetShowButtonImage(2);
		SetSheetHeight(480);
		}


	break;
	}
}
/**
 * init combo box<br>
 * <br><b>Example :</b>
 * <pre>
 *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
 * </pre>
 * @param {ibsheet} sheetObj
 * @param {form} formObj
 * @param {int} sAction 
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
	sheetObj.ShowDebugMsg(false);
	switch(sAction) {
	case IBSEARCH:      //retrieve
	    formObj.f_cmd.value=SEARCH01;
	    ComOpenWait(true);
	 	var sXml=sheetObj.GetSearchData("FNS_INV_0034_02GS.do", FormQueryString(formObj));
	 	sheetObj.LoadSearchData(sXml,{Sync:1} );
	 	ComOpenWait(false);
		var vvd="";
		var cust_cd="";
		var inv_no="";
		var if_cd="";
		var bl_no="";
		var rows="";	
		var vvd_cd = "";
	
	// merge row whent vvd, cust_cd, inv_no have same value
	   for (var idx=0; idx < sheetObj.RowCount()+ 1; idx++){
		   
			if(cust_cd == sheetObj.GetCellValue(idx, "cust_cd") && inv_no == sheetObj.GetCellValue(idx, "inv_no")) {
				
				if(vvd != sheetObj.GetCellValue(idx, "vvd")) {
					vvd_cd = vvd_cd + "\r\n" + sheetObj.GetCellValue(idx, "vvd");
				}
				
			    if_cd = sheetObj.GetCellValue(idx - 1, "ar_if_no");
		    	if_cd = if_cd + "\r\n" + sheetObj.GetCellValue(idx, "ar_if_no");
			    bl_no = sheetObj.GetCellValue(idx - 1, "bl_src_no");
			    bl_no = bl_no + "\r\n" + sheetObj.GetCellValue(idx, "bl_src_no");
				rows=rows + (idx - 1) + "|";
				if(idx == sheetObj.RowCount()) sheetObj.SetCellValue(idx, "vvd", vvd_cd);
				sheetObj.SetCellValue(idx, "ar_if_no",if_cd);
				sheetObj.SetCellValue(idx, "bl_src_no",bl_no);
			} else{
				if(idx > 0) sheetObj.SetCellValue(idx - 1, "vvd", vvd_cd);
				
				vvd_cd = sheetObj.GetCellValue(idx, "vvd");
				if_cd="";
				bl_no="";
			}
		vvd=sheetObj.GetCellValue(idx, "vvd");
		cust_cd=sheetObj.GetCellValue(idx, "cust_cd");
		inv_no=sheetObj.GetCellValue(idx, "inv_no");
	  }
	   var arrRow=rows.split("|");
	   for (var idx=arrRow.length - 2; idx >= 0; idx--){
		sheetObj.RowDelete(Number(arrRow[idx]), false);
	   }
	   sheetObj.CheckAll("slt",1);
	   var sStr=ComGetEtcData(sXml,"inv_prn_dvc_nm");
	   formObj.print_nm.value=sStr;
	   
	   //2016.05.11 FTP 처리 임시로 제거
	   /*var office_cnt_cd = formObj.office_cnt_cd.value;
	   if (office_cnt_cd == "IN") { //2016.03.04 India의 Email 처리시 별도의 FTP 전송 방식 추가
		   if ( sheetObj.RowCount()> 0 ) {
				for (var i=1; i <= sheetObj.RowCount(); i++) {
					sheetObj.SetCellValue(i, "cust_eml", "", 0);
					sheetObj.SetCellEditable(i, "cust_eml", 0);
				}
			}
		}*/
	   
	break;
	case IBSAVE:        //save	    
		formObj.f_cmd.value=MULTI01;
		var sParam=FormQueryString(formObj);					
		var sParam1=sheetObj.GetSaveString(false, true, 1);
			
		if (sParam1 == "") {	
			formObj.state.value="";
			return; 
		} else {
			sParam1=ComSetPrifix(sParam1, "sheet1_");
			sParam=sParam + "&" + sParam1;					   
		}	
			
			
		var sXml=sheetObj.GetSaveData("FNS_INV_0034_02GS.do", sParam);
		var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
		formObj.state.value=state;
		var issueCnt=ComGetEtcData(sXml, "issueCnt");
		formObj.issueCnt.value=issueCnt;
		// fail 시 message 출력
	    if (state == "F") {
	       	ComOpenWait(false);
	       	showErrorMsg(sXml);
	        return true;  
	    }
	break;
	case IBINSERT:      // insert

		formObj.f_cmd.value=MULTI02;    
	 	sheetObj.DoSearch("FNS_INV_0034_02GS.do", FormQueryString(formObj) );
	 	var sXml=sheetObj.GetSearchData("FNS_INV_0034_02GS.do", FormQueryString(formObj));
		var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
		formObj.state.value=state;
	break;
	}
}
/**
 * open Invoice Remark(FNS_INV_0087) UI<br>
 * <br><b>Example :</b>
 * <pre>
 *     sheet1_OnPopupClick(sheetObj, Row, Col)
 * </pre>
 * @param {ibsheet} sheetObj
 * @param {int} Row ibsheet
 * @param {int} Col ibsheet
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */       
function sheet1_OnPopupClick(sheetObj, Row, Col)
{
	if (sheetObj.ColSaveName(Col) == "inv_rmk") {
		ComOpenWindowCenter("FNS_INV_0087.do", "pop2", 700, 259);
		
	} 
}
/**
 * opne RD Preview(FNS_INV_0034_02_prev) UI<br>
 * <br><b>Example :</b>
 * <pre>
 *     invPreview(sheetObj, formObj)
 * </pre>
 * @param {ibsheet} sheetObj
 * @param {form} formObj
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function invPreview(sheetObj, formObj) {
	var sRow=sheetObj.FindCheckedRow(1);
	
	if (sRow == "") {
		ComShowCodeMessage("INV00025");
	}  
	
	var rdFiles="";
	var ofc_cd=formObj.iss_ofc_cd.value;

	
	var arrRow=sRow.split("|");
	var rdParam="";

	for (var idx=0; idx < arrRow.length ; idx++){
			var inv_no=sheetObj.GetCellValue(arrRow[idx], "inv_no");
			var vvd=sheetObj.GetCellValue(arrRow[idx], "vvd");
			var port_cd=sheetObj.GetCellValue(arrRow[idx], "port_cd");
		    var attach="N";
		    var attach2="N";
			var cust_cd=sheetObj.GetCellValue(arrRow[idx], "cust_cd");
			var cmb_flg=sheetObj.GetCellValue(arrRow[idx], "inv_iss_cmb_flg");
			var logo="ORIGINAL";
			//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
			var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
			var grp_inv_flg=sheetObj.GetCellValue(arrRow[idx], "grp_iss_flg");
		    decideRdType(iss_grp_tp_cd);

		    //REISSUE - FRANCE 일 경우--------시작
//			if (formObj.iss_fr.value == "Y") {
//				if(formObj.logo_gb.value == "1"){
//					logo = "COPIE2";
//				}else if(formObj.logo_gb.value == "2"){
//					logo = "COPY";
//				}else if(formObj.logo_gb.value == "3"){
//					logo = "COPIE2";
//				}
//			}
		    if(formObj.office_cnt_cd.value == "IN"){
		    	if(grp_inv_flg == "Y"){
		    		rdFile = "FNS_INV_0516.mrd";
		    	}else{
			    	if(inv_no.length > 9){
			    		rdFile = "FNS_INV_0515.mrd";
			    	}else{
			    		rdFile = "FNS_INV_0514.mrd";
			    	}
		    	}
		    }
			rdFiles=rdFiles + rdFile +"|";
			
			//rdParam = rdParam + "/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+formObj.user_nm.value+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num [15] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_issue_type["+inv_no.substr(2,1)+"] frm1_att_gb2["+attach2+"] frm1_cust_cnt_cd["+cust_cd.substr(0,2)+"] frm1_cust_seq["+Number(cust_cd.substr(2,6))+"]" +"|";
			rdParam = rdParam + "/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+formObj.user_nm.value+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num [15] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_issue_type["+inv_no.substr(2,1)+"] frm1_att_gb2["+attach2+"] frm1_cust_cnt_cd["+cust_cd.substr(0,2)+"] frm1_cust_seq["+Number(cust_cd.substr(2,6))+"] frm1_mm_flg["+mmFlg+"] frm1_send_flg[E]" +"|";
		    //alert(rdParam);
			formObj.com_mrdPath.value = rdFiles ;
		    formObj.com_mrdArguments.value = rdParam;

	}			
	ComOpenWindowCenter("FNS_INV_0034_02_prev.do?view_flag=I", "pop3", 870, 700);
}
/**
 * handling Send button<br>
 * <br><b>Example :</b>
 * <pre>
 *     invSend(sheetObj, formObj)
 * </pre>
 * @param {ibsheet} sheetObj 
 * @param {form} formObj
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */     
function invSend(sheetObj, formObj) {
	var report;
	var sRow=sheetObj.FindCheckedRow(1);
	if (sRow == "") {
		ComShowCodeMessage("INV00025");
		return 0;
	}
	var arrRow=sRow.split("|");
	var v_copy_cnt=formObj.copy_cnt.value;  
	var issue_type=""; 
	// Paper Issue
	if (formObj.send_type[0].checked) {
		ComOpenWait(true);
		setTimeout( function () {
			formObj.send_flag.value="P"; 
			doActionIBSheet(sheetObj,formObj,IBSAVE);
			var attachCnt=0;
			var attachCnt2=0;
			if (formObj.state.value == "S") {
				//rdObjects[0].SetAppendReport(0);
				for (var idx=0; idx < arrRow.length; idx++){
					var inv_no=sheetObj.GetCellValue(arrRow[idx], "inv_no");
					var vvd=sheetObj.GetCellValue(arrRow[idx], "vvd");
					var cust_cd=sheetObj.GetCellValue(arrRow[idx], "cust_cd");
					var port_cd=sheetObj.GetCellValue(arrRow[idx], "port_cd");
					var attach=sheetObj.GetCellValue(arrRow[idx], "attach") == "1" ? "Y" : "N";
					var attach_view=sheetObj.GetCellValue(arrRow[idx], "attach_view");
					var attach2=sheetObj.GetCellValue(arrRow[idx], "attach2") == "1" ? "Y" : "N";
					var attach_view2=sheetObj.GetCellValue(arrRow[idx], "attach_view2");
					var cmb_flg=sheetObj.GetCellValue(arrRow[idx], "inv_iss_cmb_flg");
					//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
					var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
					var grp_inv_flg=sheetObj.GetCellValue(arrRow[idx], "grp_iss_flg");
					var logo="ORIGINAL";
					report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, logo, vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg);
					appendReport.push(report);
					for(var j=0; j<v_copy_cnt; j++) {  	
						logo="COPY";
						if (formObj.iss_fr.value == "Y" && formObj.logo_gb.value == "3") {
							logo="COPY";
						}
						report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, logo, vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg);
						appendReport.push(report);
					}
					
					if (idx < arrRow.length - 2) {
						if (attach2 == "Y") {
							attachCnt2++
						}
						
						if (attach == "Y") {
							attachCnt++
						}
					} else {
						
					}					
				}
				ComOpenWait(false);
				// setting print
		    	//var print_nm=form.print_nm.value;
		    	//if(print_nm != ""){
		    	//	rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
		    	//}
				//rdObjects[0].CMPrint(); //print start
				//rdObjects[0].SetAppendReport(0);
				//viewer.openFile(appendReport, {timeout:3000});
				//viewer.print({isServerSide:true}); //print start
				directReportDownload(appendReport);
				appendReport = [];
				
				ComShowCodeMessage("INV00065", formObj.issueCnt.value);
			}
		} , 100);	
		// E-mail, Fax Issue 
	} else if (formObj.send_type[1].checked || formObj.send_type[2].checked){
		if (formObj.send_type[1].checked) {
			formObj.send_flag.value="E";
			formObj.send_flag2.value="";
			var office_cnt_cd = formObj.office_cnt_cd.value;
			var invNos="";
			for (var idx=1; idx < sheetObj.RowCount()+ 1; idx++){
				//2016.05.11 FTP 처리 임시로 제거
				//if (sheetObj.GetCellValue(idx, "slt") == "1" && sheetObj.GetCellValue(idx, "cust_eml") == "" && office_cnt_cd != "IN") {
				if (sheetObj.GetCellValue(idx, "slt") == "1" && sheetObj.GetCellValue(idx, "cust_eml") == "" ) {
				invNos=invNos + sheetObj.GetCellValue(idx, "inv_no") + (idx == sheetObj.RowCount()? "" : ", ");
									sheetObj.SetCellValue(idx, "slt",0);
				}
			}
			if (invNos != "") {
				ComShowCodeMessage("INV00099", invNos);  //Please check E-mail address(Fax number) of {?msg1}.
				return;
			}				
		} else {
			formObj.send_flag.value="F";
			formObj.send_flag2.value="";
			var invNos="";
			for (var idx=1; idx < sheetObj.RowCount()+ 1; idx++){
				if (sheetObj.GetCellValue(idx, "slt") == "1" && sheetObj.GetCellValue(idx, "cust_fax_no") == "") {
				invNos=invNos + sheetObj.GetCellValue(idx, "inv_no") + (idx == sheetObj.RowCount()? "" : ", ");
					sheetObj.SetCellValue(idx, "slt",0);
				}
			}
			if (invNos != "") {
				ComShowCodeMessage("INV00110", invNos);  //There is no item for new template.
				return;
			}	
		}
		
		ComOpenWait(true);

		setTimeout( function () {
			var ofc_cd=formObj.iss_ofc_cd.value;
			for (var idx=0; idx < arrRow.length; idx++){
				rdFile="";
				var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
				var inv_no=sheetObj.GetCellValue(arrRow[idx], "inv_no");
				var grp_inv_flg=sheetObj.GetCellValue(arrRow[idx], "grp_iss_flg");
				decideRdType(iss_grp_tp_cd);
				if(formObj.office_cnt_cd.value == "IN"){
					if(grp_inv_flg =="Y"){
						rdFile = "FNS_INV_0516.mrd";
					}else{
				    	if(inv_no.length > 9){
				    		rdFile = "FNS_INV_0515.mrd";
				    	}else{
				    		rdFile = "FNS_INV_0514.mrd";
				    	}
					}
			    }
				sheetObj.SetCellValue(arrRow[idx], "rd_name", rdFile);
			}
			doActionIBSheet(sheetObj,formObj,IBSAVE);	
			if (formObj.state.value == "S") {
				ComOpenWait(false);
				ComShowCodeMessage("INV00065", formObj.issueCnt.value);  //It was transmitted successfully.\n(Successfully Sent E-mail/Fax or Printed Invoice Count : {?msg1})
			}
		} , 100);	
		// Paper Issue + E-mail Issue
	} else if (formObj.send_type[3].checked){
		var ofc_cd=formObj.iss_ofc_cd.value;
		//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
//		decideRdType();
//		formObj.rd_name.value=rdFile;
		
		ComOpenWait(true);
		
		setTimeout( function () {

			for (var idx=0; idx < arrRow.length; idx++){
				rdFile="";
				var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
				decideRdType(iss_grp_tp_cd);
				sheetObj.SetCellValue(arrRow[idx], "rd_name", rdFile);
			}
			formObj.send_flag.value="E"; 
			formObj.send_flag2.value="P"; 
			doActionIBSheet(sheetObj,formObj,IBSAVE);
			var attachCnt=0;
			var attachCnt2=0;
			if (formObj.state.value == "S") {
				//rdObjects[1].SetAppendReport(0);
				for (var idx=0; idx < arrRow.length ; idx++){
					var inv_no=sheetObj.GetCellValue(arrRow[idx], "inv_no");
					var vvd=sheetObj.GetCellValue(arrRow[idx], "vvd");
					var cust_cd=sheetObj.GetCellValue(arrRow[idx], "cust_cd");
					var port_cd=sheetObj.GetCellValue(arrRow[idx], "port_cd");
					var attach=sheetObj.GetCellValue(arrRow[idx], "attach") == "1" ? "Y" : "N";
					var attach_view=sheetObj.GetCellValue(arrRow[idx], "attach_view");
					var attach2=sheetObj.GetCellValue(arrRow[idx], "attach2") == "1" ? "Y" : "N";
					var attach_view2=sheetObj.GetCellValue(arrRow[idx], "attach_view2");
					var cmb_flg=sheetObj.GetCellValue(arrRow[idx], "inv_iss_cmb_flg");
					var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
					var grp_inv_flg=sheetObj.GetCellValue(arrRow[idx], "grp_iss_flg");
					if (sheetObj.GetCellValue(arrRow[idx], "cust_eml") == "") {
						report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, "ORIGINAL", vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg); 
						appendReport.push(report);
						for(var j=0; j<v_copy_cnt; j++) {  	
							report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, "COPY", vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg);
							appendReport.push(report);
						}
						
						if (idx < arrRow.length - 2) {							
							if (attach2 == "Y") {
								attachCnt2++
							}
							
							if (attach == "Y") {
								attachCnt++
							}
						} else {
							
						}
					} else {
						for(var j=0; j<v_copy_cnt; j++) {  		
							report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, "COPY", vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg);
							appendReport.push(report);
						}		
						
						if (idx < arrRow.length - 2) {
							if (attach2 == "Y") {
								attachCnt2++
							}
							
							if (attach == "Y") {
								attachCnt++
							}
						} else {
							
						}
					}					
				}
				// setting print
		    	//var print_nm=form.print_nm.value;
		    	//if(print_nm != ""){
		    	//	rdObjects[1].SetPrintInfo (print_nm, 1, 1, 4);
		    	//}
				ComOpenWait(false);
				
		    	if(v_copy_cnt != 0){
		    		//viewer.openFile(appendReport, {timeout:3000});
		    		//viewer.print({isServerSide:true});
		    		directReportDownload(appendReport);
		    		appendReport = [];
		    	}
		    	
		    	ComShowCodeMessage("INV00065", formObj.issueCnt.value);
			}
		} , 100);	
		// Paper(Original) Issue + E-mail(Copy) Issue
	} else if (formObj.send_type[4].checked){
		ComOpenWait(true);
		setTimeout( function () {
			var ofc_cd=formObj.iss_ofc_cd.value;
			//2015.07.31 Save ISS_GRP_TP_CD column to print same form in case of Re-issue by IY Cho
	//		decideRdType();
	//		formObj.rd_name.value=rdFile;
			for (var idx=0; idx < arrRow.length; idx++){
				rdFile="";
				var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
				decideRdType(iss_grp_tp_cd);
				sheetObj.SetCellValue(arrRow[idx], "rd_name", rdFile);
			}
			formObj.send_flag.value="E"; 
			formObj.send_flag2.value="P"; 
			doActionIBSheet(sheetObj,formObj,IBSAVE);
			var attachCnt=0;
			var attachCnt2=0;
			if (formObj.state.value == "S") {
				//rdObjects[1].SetAppendReport(0);
				for (var idx=0; idx < arrRow.length ; idx++){
					 var inv_no=sheetObj.GetCellValue(arrRow[idx], "inv_no");
				 	 var vvd=sheetObj.GetCellValue(arrRow[idx], "vvd");
					 var cust_cd=sheetObj.GetCellValue(arrRow[idx], "cust_cd");
					 var port_cd=sheetObj.GetCellValue(arrRow[idx], "port_cd");
					 var attach=sheetObj.GetCellValue(arrRow[idx], "attach") == "1" ? "Y" : "N";
					 var attach_view=sheetObj.GetCellValue(arrRow[idx], "attach_view");
					 var attach2=sheetObj.GetCellValue(arrRow[idx], "attach2") == "1" ? "Y" : "N";
					 var attach_view2=sheetObj.GetCellValue(arrRow[idx], "attach_view2");
					 var cmb_flg=sheetObj.GetCellValue(arrRow[idx], "inv_iss_cmb_flg");
					 var iss_grp_tp_cd=sheetObj.GetCellValue(arrRow[idx], "iss_grp_tp_cd");
					 var grp_inv_flg=sheetObj.GetCellValue(arrRow[idx], "grp_iss_flg");
					if (sheetObj.GetCellValue(arrRow[idx], "cust_eml") == "") {
						report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, "ORIGINAL", vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg); 
						appendReport.push(report);
						for(var j=0; j<v_copy_cnt; j++) {  	
							report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, "COPY", vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg);
							appendReport.push(report);
						}
						
						if (idx < arrRow.length - 2) {
							if (attach2 == "Y") {
								attachCnt2++
							}
							
							if (attach == "Y") {
								attachCnt++
							}
						} else {
							
						}
					} else {
						report = rdOpen(inv_no, 15, formObj.user_nm.value, formObj.iss_ofc_cd.value, "ORIGINAL", vvd, port_cd, "N", "Y", cmb_flg, iss_grp_tp_cd, grp_inv_flg);
						appendReport.push(report);
						if (idx < arrRow.length - 2) {
							if (attach2 == "Y") {
								attachCnt2++
							}
							
							if (attach == "Y") {
								attachCnt++
							}
						} else {
							
						}
					}					
				}
				ComOpenWait(false);
				
				// setting print
		    	//var print_nm=form.print_nm.value;
		    	//if(print_nm != ""){
		    	//	rdObjects[1].SetPrintInfo (print_nm, 1, 1, 4);
		    	//}
				//rdObjects[1].CMPrint(); //print start
				//rdObjects[1].SetAppendReport(0);
				//viewer.openFile(appendReport, {timeout:3000});
	    		//viewer.print({isServerSide:true});
				directReportDownload(appendReport);
	    		appendReport = [];
	    		
				ComShowCodeMessage("INV00065", formObj.issueCnt.value);
			}
		} , 100);	
	}
}
/**
 * handling attach file uplaod<br>
 * <br><b>Example :</b>
 * <pre>
 *     fileUpload(formObj, file_path)
 * </pre>
 * @param {form} formObj 필수 html form object
 * @param {String}
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */     
function fileUpload(formObj, file_path) {
	formObj.f_cmd.value=SEARCH02;
	var sFile=file_path;
	var upObj=uploadObjects[0];
	upObj.Files="";
	// add file to IBUpload
	upObj.AddFile(sFile);
	if(upObj.LocalFiles == "") {
		return;
	}
	upObj.ExtendParam=FormQueryString(formObj);
	upObj.ParamDecoding=true;
	var sXml=upObj.DoUpload(true);
	var fileKey=ComGetEtcData(sXml, "fileKey");
	//formObj.fileKey.value = fileKey;	
	return fileKey;	 		
}
/**
 * init RD Object <br>
 * <br><b>Example :</b>
 * <pre>
 *     initRdConfig(rdObject)
 * </pre>
 * @param {rdviewer} rdObject Rdviewer Object
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function initRdConfig(rdObject){
	var Rdviewer = rdObject;
//	Rdviewer.SetSheetHeight(0);
	Rdviewer.style.height = 0;
	Rdviewer.style.width = 0;
	//Rdviewer.DisableToolbar(1)
	Rdviewer.AutoAdjust=true;
	Rdviewer.ViewShowMode(0);
	Rdviewer.SetBackgroundColor(128,128,128);
	Rdviewer.SetPageLineColor(128,128,128);
	Rdviewer.ApplyLicense("0.0.0.0"); 
	
}
/**
 * open RD File <br>
 * <br><b>Example :</b>
 * <pre>
 *     rdOpen(Rdviewer, inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn)
 * </pre>
 * @param {rdviewer} rdObject Rdviewer Object
 * @param {String} inv_no Invoice number
 * @param {String} line_num Description lile number
 * @param {String} user_nm user name
 * @param {String} ofc_cd office code
 * @param {String} logo logo name
 * @param {String} vvd vvd
 * @param {String} port_cd port code
 * @param {String} attach letter wording  attach flag
 * @param {String} paperYn print, email flag
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function rdOpen(inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn, cmbFlg, iss_grp_tp_cd, grp_inv_flg){  		
	var formObj=document.form;
	
	decideRdType(iss_grp_tp_cd);
	
	//REISSUE - FRANCE 일 경우--------시작
//	if (formObj.iss_fr.value == "Y") {
//		if(formObj.logo_gb.value == "1"){
//			logo = "COPIE2";
//		}else if(formObj.logo_gb.value == "2"){
//			logo = "COPY";
//		}else if(formObj.logo_gb.value == "3"){
//			logo = "COPIE2";
//		}
//	}
	if(formObj.office_cnt_cd.value == "IN"){
		if(grp_inv_flg =="Y"){
			rdFile = "FNS_INV_0516.mrd";
		}else{
	    	if(inv_no.length > 9){
	    		rdFile = "FNS_INV_0515.mrd";
	    	}else{
	    		rdFile = "FNS_INV_0514.mrd";
	    	}
		}
    }
	rdParam="/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+user_nm+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num ["+line_num+"] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_paper_yn ["+paperYn+"] frm1_issue_type["+inv_no.substr(2,1)+"] frm1_att_gb2[N] frm1_cust_cnt_cd[] frm1_cust_seq[] frm1_mm_flg["+mmFlg+"] frm1_send_flg["+formObj.send_flag.value+"]";
	//alert("rdParam2 : " + rdParam);
	var rdUrl="apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/";	
	var report = {mrdPath:RD_path + rdUrl + rdFile, mrdParam:RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait"};
	return report;
}
/**
 * attach file Add, Delete button <br>
 * <br><b>Example :</b>
 * <pre>
 *     sheet1_OnClick(sheetObj, row, col, value)
 * </pre>
 * @param {ibsheet} sheetObj 
 * @param {int} Row ibsheet 
 * @param {int} Col ibsheet 
 * @param {String} value
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */  
function sheet1_OnClick(sheetObj, row, col, value) {
	var formObj=document.form;
	/*if (sheetObj.ColSaveName(col) == "f_add") {
		alert('xxxx');
       if (sheetObj.GetCellValue(row, "f_key") == "") {
    	    var file=sheetObj.OpenFileDialog("", "", "C:\\","All Files(*.*)|*.*" );
 			var fileKey=fileUpload(formObj, file);
			if (fileKey != "" && fileKey != undefined) {
				sheetObj.SetCellValue(row, "f_name",file); 
				sheetObj.SetCellValue(row, "f_key",fileKey);
			} else {
				sheetObj.SetCellValue(row, "f_name","");
				sheetObj.SetCellValue(row, "f_key","");
			}       		    		
		} else {
			if(ComShowCodeConfirm("INV00124")) {
 				var file=sheetObj.OpenFileDialog("", "", "C:\\","All Files(*.*)|*.*" );
				var fileKey=fileUpload(formObj, file);            		
				if (fileKey != "" && fileKey != undefined) {
					sheetObj.SetCellValue(row, "f_name",file);
					sheetObj.SetCellValue(row, "f_key",fileKey);
				} else {
					sheetObj.SetCellValue(row, "f_name","");
					sheetObj.SetCellValue(row, "f_key","");
				}
			} else {
				return;
			} 			
		}
	}*/
	if (sheetObj.ColSaveName(col) == "f_del") {
        var sheet_serial = sheetObj.GetCellValue(row, "f_key");

        //ibsheet에 이미 업로드된 파일이 있으면 해당 serial의 파일을 삭제한다.
        if (sheet_serial!="") {
            ComUploadRemoveFile(upload1, sheet_serial, false);
        }
		sheetObj.SetCellValue(row, "f_name","");
		sheetObj.SetCellValue(row, "f_key","");
		sheetObj.SetCellValue(row, "f_save_id","");
	}	
	
	if (sheetObj.ColSaveName(col) == "f_copy") {
        if (sheetObj.GetCellValue(row, "f_key") != "") {
			for (var idx=1; idx < sheetObj.RowCount()+ 1; idx++){
               if (sheetObj.GetCellValue(row, "vvd") == sheetObj.GetCellValue(idx, "vvd")) {
                   sheetObj.SetCellValue(idx, "f_name",sheetObj.GetCellValue(row, "f_name"),0);
                   sheetObj.SetCellValue(idx, "f_key",sheetObj.GetCellValue(row, "f_key"),0);
                   sheetObj.SetCellValue(idx, "f_save_id",sheetObj.GetCellValue(row, "f_save_id"),0);
				}
			}
		}
	}
}
/**
 * view attach file<br>
 * <br><b>Example :</b>
 * <pre>
 *     sheet1_OnDblClick(sheetObj, row, col, value)
 * </pre>
 * @param {ibsheet} sheetObj 
 * @param {int} Row ibsheet 
 * @param {int} Col ibsheet 
 * @param {String} value 
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */  
function sheet1_OnDblClick(sheetObj, row, col) {
	var formObj=document.form;
var value=sheetObj.GetCellValue(row, col);
	if (sheetObj.ColSaveName(col) == "f_name") {
		if (value != "") {
             document.getElementById("key").value=sheetObj.GetCellValue(row, "f_key");
			sheetObj.HtmlControlEnterKey("downbtn","sheet1");
			sheetObj.HtmlControlEnterKey("downbtn","sheet1");
		}
	}
}	
   
/**
 * show Help tooltip. <br>
 * <br><b>Example :</b>
 * <pre>
 *     showHelp()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */      
function showHelp() {
	if(document.getElementById) { 
		var msg="* Where e-mail address or fax no is brought from\n"
			+ "  - O/B : Credit Customer (MDA) > O/B E-mail or O/B Fax No\n"
			+ "  - I/B : Credit Customer (MDA) > I/B E-mail or I/B Fax No\n"
			+ "  - If nothing from above, e-mail or fax lastly sent is displayed in case of re-issue.\n";
		var elm=document.getElementById("help_layer")      
		elm.innerText=msg;
		elm.style.width=500;
		//elm.style.height=obj.style.height
		elm.style.top=document.body.scrollTop+event.clientY - 30
		elm.style.left=document.body.scrollLeft+event.clientX - 500
		elm.style.visibility="visible"
	}
}
/**
 * close Help tooltip. <br>
 * <br><b>Example :</b>
 * <pre>
 *     showHelp()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function hideHelp(){
	if(document.getElementById) { 
		var elm=document.getElementById("help_layer")     
		elm.style.visibility="hidden"
	}
}

function getPreviewIssue(){   
	invSend(sheetObjects[0], document.form);   
}

function decideRdType(iss_grp_tp_cd){
	formObj = document.form;
	//2014.10.16 INV Form logic change by IY Cho
	var ots_smry_cd = formObj.ots_smry_cd.value;
	var inv_mlt_bl_iss_flg = formObj.inv_mlt_bl_iss_flg.value;
//	var iss_grp_tp_cd = formObj.iss_grp_tp_cd.value;
	var issue_gubn = formObj.issue_gubn.value;
	var ofc_cd = formObj.iss_ofc_cd.value;
	var office_cnt_cd = formObj.office_cnt_cd.value;
	var tax_cnt_flg = formObj.tax_cnt_flg.value;
	var inv_no = formObj.inv_no.value;
	if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg == "N"){
		rdFile = "FNS_INV_0001.mrd";
	}else{
		if(iss_grp_tp_cd == "C" || iss_grp_tp_cd == ""){
			rdFile = "FNS_INV_0003.mrd";
		}else if(iss_grp_tp_cd == "V"){
			rdFile = "FNS_INV_0002.mrd";
		}
	}
	
	if(office_cnt_cd == "BR"){
		if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg == "N"){
			rdFile = "FNS_INV_0005.mrd";
		}else{
			if(iss_grp_tp_cd == "C" || iss_grp_tp_cd == ""){
				rdFile = "FNS_INV_0004.mrd";
			}else if(iss_grp_tp_cd == "V"){
				rdFile = "FNS_INV_0006.mrd";
			}
		}
//	}else if(office_cnt_cd == "FR"){
//		rdFile = "FNS_INV_0522.mrd";
	}else if(office_cnt_cd == "TH"){
		rdFile = "FNS_INV_0540.mrd";
	}else if(office_cnt_cd == "VN"){
		rdFile = "FNS_INV_0531_SINGLE.mrd";
	}else if(office_cnt_cd == "KR"){
		//rdFile = "FNS_INV_0104.mrd";
		if(formObj.iss_ofc_cd.value == 'PUSBB'){
			rdFile = "FNS_INV_0104.mrd";
		}
	}

//*********** JHJ 2018.01  START!  *************      
	if(tax_cnt_flg =="Y"){
		
		if(office_cnt_cd == "CI" ){
			//alert("Ivory Coast!!!-DE");
			rdFile = "FNS_INV_0101.mrd";
		} else if(office_cnt_cd == "MM" ){
			rdFile = "FNS_INV_0001.mrd";
		} else {
			rdFile = "FNS_INV_0102.mrd";
		}
		
		if(office_cnt_cd == "AE" ){	
			rdFile = "FNS_INV_0103.mrd";
			if(cfmFlg == "" ) {  //2018-04-30	
				if(ComShowCodeConfirm("INV00180")) {   //YES
					mmFlg = "Y";
				} else {						
					mmFlg = "";
				}
				cfmFlg = "Y";
			} 			
		}	
		
	}
//*********** JHJ 2018.01  END!  *************     
  
	
	if(rdFile==""){
		rdFile="FNS_INV_0003.mrd";
	}
}

/**
 * Upload initializing sheet
 */
function initUpload() {

    upload1.Initialize({
        SaveUrl:'/opuscntr/FNS_INV_0034_02GS.do',
        ShowButtonArea: false,
        ShowInfoArea: false,
        ExtraForm:'upLoadForm',
        AfterSaveStatus : function(result) {
            var code = result.code;
            var formObj=document.form;
            if( code == 0) {
                var sXml = (new XMLSerializer()).serializeToString(result.xmlData);
                sXml = convert2ibsheet7(sXml);
                //ibupload-page별 변경 영역--s
                var sheetObj = sheetObjects[0];
                if (sXml.length> 0) sheetObj.LoadSaveData(sXml);
                ComOpenWait(false); 
    			var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
    			var fileKey=ComGetEtcData(sXml,"fileKey"); 
    			var row = sheetObj.GetSelectRow();
    			sheetObj.SetCellValue(row, "f_save_id",fileKey,0); 
    			formObj.state.value=state;
                //ibupload-page별 변경 영역--e
                ComUploadRemoveFile(upload1, "", true); 
            }else {
                ComShowMessage(result.msg);
            }
        },
        AfterAddFile : function(result) {
        	var formObj=document.form;
            var files = upload1.GetList();
            var fileName=files[files.length-1].GetFileName();
            var serialNo = files[files.length-1].GetSerialNo();
            var sheetObj = sheetObjects[0];
            var row = sheetObj.GetSelectRow();

            //ibsheet에 이미 업로드된 파일이 있으면 해당 serial의 파일을 삭제한다.
            var sheet_serial = sheetObj.GetCellValue(row, "f_key");
            if (sheet_serial!="") {
                ComUploadRemoveFile(upload1, sheet_serial, false);
            }

            //ibupload-page별 변경 영역--s
            //(필수)
            sheetObj.SetCellValue(row, "f_key",serialNo,0); 
            sheetObj.SetCellValue(row, "f_name",fileName,0);
            sheetObj.SetCellFontUnderline(row, "f_name",1);
            //ibupload-page별 변경 영역--e
            formObj.f_cmd.value=MULTI03;
	    	var sParam=FormQueryString(formObj);
	    	var sParam1=ComGetFileSaveString(sheetObj, upload1, "f_key");
			if (sParam1 == "") {	
				formObj.state.value=""; 
				return; 
			} else {
				sParam1=ComSetPrifix(sParam1, "sheet1_");
				sParam=sParam + "&" + sParam1;					   
			}
	        paramToForm(sParam);
	        upload1.SaveStatus();
        },
        AfterOnload : function() {
            //ibupload-page별 변경 영역--s
            //upload1.SetCustomAddButtonAsID('btn_FileAdd');
            //ibupload-page별 변경 영역--e
        }
    });
}

function sheet1_OnMouseMove(sheetObj){
    var row = sheetObj.MouseRow();
    var col = sheetObj.MouseCol();

    if (row > 0 && sheetObj.ColSaveName(col) == "f_name") {
        var info = sheetObj.GetCellElement(row, col, 1);
        upload1.SetFileUploadElement(info);
    }
}

/**
 * onclick event
 * @param sheetObj
 * @param row
 * @param col
 * @param val
 */
function sheet1_OnChange(sheetObj, row, col, val) {
	var invNo = "";
	var flag = sheetObj.GetCellText(row,"slt");
	
	if (sheetObj.GetCellValue(row, "gfp_iss_flg") == "Y") {
		
		invNo = sheetObj.GetCellValue(row, "inv_no");
        
		for (var iRow=1;iRow<=sheetObj.LastRow();iRow++) {
        	if(sheetObj.GetCellValue(iRow, "inv_no") == invNo ) {
        		sheetObj.SetCellValue(iRow, "slt", flag, 0);     
        	}
        }
	}
		
}
