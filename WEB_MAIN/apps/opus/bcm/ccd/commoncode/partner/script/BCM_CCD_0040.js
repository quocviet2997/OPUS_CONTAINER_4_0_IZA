/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0040.js
*@FileTitle  : Vendor 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================
*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
    		   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
     		   OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class BCM_CCD_0040 : BCM_CCD_0040 on the screen for creating the script defines the task using.
 */
 
    /** Common global variable */
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var create_vndr_seq='';
    var prefix1="sheet1_";
    var prefix2="sheet2_";
    /** Event handler processing by button click event */
    var init_delt_flg = "N";
	document.onclick=processButtonClick;  
  	/**
 	  * initializing sheet
 	  * implementing onLoad event handler in body tag
 	  * adding first-served functions after loading screen.
 	  */
	function loadPage() {
        var formObj=document.form;
        initControl();
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);	
		}
		doActionIBCombo(sheetObjects[0], formObj, SEARCH);
		ComSetFocus(document.form.vndr_seq);
		formObj.saveflag.value="N";
		formObj.edi_if_flg.value="N";
		doActionIBSheet(sheetObjects[0], formObj, SEARCH10);
		var authTpCd=G_AHTU_TP_CD;
		var rqstNo=formObj.rqst_no.value;
		if(G_MDAA_CHK == 'Y')
			formObj.delt_flg.enable=true;
		else
			//ComEnableObject(formObj.delt_flg, false);
			formObj.delt_flg.enable=false;
		// If the Process Status screen call, in the Detail PopUp
		if(rqstNo != '') {
			doActionIBSheet(sheetObjects[0], formObj, SEARCH08);
			formObj.vndr_seq.readOnly=true;
        	formObj.vndr_seq.style.backgroundColor="#bebebe";
			ComSetDisplay('btn_Close', true);
			var procTpCd=formObj.proc_tp_cd.value;
			var vndrSeq=formObj.vndr_seq.value;
			var rqstUsrChk=formObj.rqst_usr_chk.value;
			ComEnableObject(formObj.btn_vndr_cd_pop, false);
			// AuthType not Request, ProcessType is Open, 'CheckDup' button display
			if(authTpCd != 'R' && procTpCd == 'O') {
				ComSetDisplay('btn_CheckDup', true);
			}
			// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
			if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
				ComSetDisplay('btn_Request', true);
				ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
				ComSetDisplay('btn_Retrieve', true);
				ComSetDisplay('btn_Save', true);
				doActionIBSheet(sheetObjects[0], formObj, SEARCH08);
			} else if(procTpCd == 'A') {
				doActionIBSheet(sheetObjects[0], formObj, SEARCH01);
				ComEnableObject(formObj.btn_vndr_cd_pop, false);
			} else {
				doActionIBSheet(sheetObjects[0], formObj, SEARCH08);
			}
		} else {
			ComSetDisplay('btn_Retrieve', true);
			// MDM Authority is not Approval('A') or MDDA
			if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
				ComSetDisplay('btn_Create', true);
				ComSetDisplay('btn_New', true);
				ComSetDisplay('btn_Save', true);
			} else {
				//General User if you do not have MDM Authority
				ComSetDisplay('btn_New', true);
			}
		}
	}		
	/**
	  * setting sheet initial values and header
	  * param : sheetObj, sheetNo
	  * adding case as numbers of counting sheets
	  */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var sheetID=sheetObj.id;
     	switch(sheetID) {
     	case "sheet1":
     	    with(sheetObj){
		          var HeadTitle="ibflag|Del|Primary Flag|Seq|International\nPhone No|Phone No|International\nFax No|Fax No|E-Mail|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time|VNDR Seq|Cntc Div CD";
		          var headCount=ComCountHeadTitle(HeadTitle);
		          SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);
		          var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix1+"ibflag" },
		                 {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix1+"del" },
		                 {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"prmry_chk_flg",	   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1  },
		                 {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix1+"vndr_cntc_pnt_seq", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:12 },
		                 {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"intl_phn_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4  , AcceptKeys:"N|[-]"},
		                 {Type:"Text",      Hidden:0, Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"phn_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 , AcceptKeys:"N|[-]" },
		                 {Type:"Text",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"intl_fax_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4  , AcceptKeys:"N|[-]"},
		                 {Type:"Text",      Hidden:0, Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"fax_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 , AcceptKeys:"N|[-]" },
		                 {Type:"Text",      Hidden:0, Width:240,  Align:"Center",  ColMerge:0,   SaveName:prefix1+"vndr_eml",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:200, AcceptKeys:"E|N|[@._-]" },
		                 {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix1+"delt_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1  },
		                 {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix1+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix1+"cre_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
                         {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix1+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix1+"upd_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:1, Width:5,    Align:"Left",    ColMerge:0,   SaveName:prefix1+"vndr_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:1, Width:5,    Align:"Left",    ColMerge:0,   SaveName:prefix1+"cntc_div_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
//		          SetColProperty(0 ,"intl_phn_no" , {AcceptKeys:"N|[-]"});
//		          SetColProperty(0 ,"phn_no" , {AcceptKeys:"N|[-]"});
//		          SetColProperty(0 ,"intl_fax_no" , {AcceptKeys:"N|[-]"});
//		          SetColProperty(0 ,"fax_no" , {AcceptKeys:"N|[-]"});
		          InitColumns(cols);
		          SetEditable(1);
		          SetColProperty(0, prefix1+ "prmry_chk_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
		          SetWaitImageVisible(0);
		          SetSheetHeight(200);
                }
          	break;
     	case "sheet2":
     	    with(sheetObj){
		          var HeadTitle="ibflag|Del|Subject|Kind of Service|SAC|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time|";
		          var headCount=ComCountHeadTitle(HeadTitle);
		          SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
		          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		          var headers = [ { Text:HeadTitle, Align:"Center"} ];
		          InitHeaders(headers, info);
		          var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"ibflag" },
		                 {Type:"DelCheck",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"del" },
		                 {Type:"Combo",     Hidden:0, Width:400,  Align:"Left",    ColMerge:0,   SaveName:prefix2+"vndr_cost_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                 {Type:"Combo",     Hidden:0, Width:400,  Align:"Left",    ColMerge:0,   SaveName:prefix2+"cntr_vndr_svc_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                 {Type:"Text",      Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:prefix2+"svc_acctg_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,  EditLen:10,  AcceptKeys:"E|N",  InputCaseSensitive:1},
		                 {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                 {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix2+"cre_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix2+"cre_dt",           KeyField:0,   CalcLogic:"",   Format:"YmdHms",      PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix2+"upd_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix2+"upd_dt",           KeyField:0,   CalcLogic:"",   Format:"YmdHms",      PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
				         {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"vndr_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		          InitColumns(cols);
		          SetEditable(1);
		          SetWaitImageVisible(0);
		          SetSheetHeight(200);
     			}
          	break;
     	}
	}
	/** Event handler processing by button name */
	function processButtonClick(){
		/*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];   
        var sheetObject2=sheetObjects[1];   
        /*******************************************************/
        var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			switch (srcName) {		
				case "btn_Retrieve": //retrieve
					if (formObject.rqst_no.value=='' || formObject.rqst_no.value == "undefined"){
						doActionIBSheet(sheetObject1,	formObject,	SEARCH01);
					} else{
						formObject.vndr_seq.value="";
						doActionIBSheet(sheetObject1,	formObject,	SEARCH08);
					}
					break;
				case "btn_New": 	//New
					doActionIBSheet(sheetObject1,	formObject,	IBCLEAR);
					formObject.rqst_no.value="";
					formObject.saveflag.value="N";
					break;	
				case "btn_Save": //save
					doActionIBSheet(sheetObject1,	formObject,	IBSAVE);
					break;
				case "btn_Create": //Sequence generation
					doActionIBSheet(sheetObject1,	formObject,	IBCREATE);
					break;
				case "btn_Close":
					ComClosePopup(); 
					break;
				case "btn_CheckDup":
					var param="rqst_no=" + ComGetObjValue(formObject.rqst_no);
					param=param + "&" + "name=" + formObject.vndr_lgl_eng_nm.value;
		         	var sUrl="BCM_CCD_1040.do?" + param;
		         	sUrl=sUrl+ "&vndrCntCd=" + formObject.loc_cd.value.substring(0, 2);
		         	var rVal=ComOpenPopup(sUrl, 770, 460, "", "0,0", true);
					break;
				case "btn_Request":
					doActionIBSheet(sheetObject1, formObject, MULTI03); 
					break;
				case "btn_rowadd_sheet1": //add row 
	                doActionIBSheet(sheetObject1, formObject, IBINSERT);
					break;
				case "btn_rowdelete_sheet1": //delete row
					doActionIBSheet(sheetObject1, formObject, IBDELETE);					
					break;		
				case "btn_rowadd_sheet2": //add row 
	                doActionIBSheet(sheetObject2, formObject, MODIFY01);
					break;
				case "btn_rowdelete_sheet2": //delete row
					doActionIBSheet(sheetObject2, formObject, MODIFY02);					
					break;		
				case "btn_com_ens_0m1_vndr_cnt_cd":
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_0M1.do?cnt_cd=" + formObj.vndr_cnt_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 450, "getCOM_ENS_0M1_vndr_cnt_cd", "0,0", true);
					break;	
				case "btn_com_ens_051_loc_cd":
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_051.do?loc_cd=" + formObj.loc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 460, "getCOM_ENS_051_loc_cd", "0,0", true);
					break;	
				case "btn_com_ens_071_ofc_cd": 		  			
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 620, "getCOM_ENS_071_ofc_cd", "0,0", true);
					break;	
				case "btn_com_ens_n13_inv_curr_cd": 
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_N13.do?curr_cd=" + formObj.inv_curr_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 700, 470, "getCOM_ENS_N13_inv_curr_cd", "0,0", true);
					break;		
				case "btn_com_ens_071_vndr_ofc_cd": 		  			
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_071.do?ofc_cd=" + formObj.vndr_ofc_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 620, "getCOM_ENS_071_vndr_ofc_cd", "0,0", true);
					break;
				case "btn_com_ens_0c1_prnt_vndr_cd": 
		  			var formObj=document.form;
		  			var sUrl="COM_COM_0007.do?mdm_yn=" + formObj.mdm_yn.value;
		         	var rVal=ComOpenPopup(sUrl, 770, 470, "getCOM_ENS_0C1_prnt_vndr_cd", "0,0", true);
					break;
				case "btn_vndr_cd_pop":
					if(ComGetEvent().style.cursor == "default") return;
		  			var formObj=document.form;
		         	var sUrl="COM_COM_0007.do?mdm_yn=" + formObj.mdm_yn.value;
		         	var rVal=ComOpenPopup(sUrl, 770, 450, "getBtn_vndr_cd_pop", "0,0", true);
		        	if (formObj.vndr_seq.value !="" ){
		         	    doActionIBSheet(sheetObject1, formObj, SEARCH01);
		        	}
					break;	
				case "btn_chk_de_ste_cd" :
		  			var formObj=document.form;
		  			var sUrl="COM_ENS_0X1.do?cnt_cd=" + formObj.chk_de_cnt_cd.value;
		         	var rVal=ComOpenPopup(sUrl, 770, 470, "getCOM_ENS_0X1_chk_de_ste_cd", "1,0,1,1,1,1,1,1", true);
		         	//ComOpenPopup('/opuscntr/COM_ENS_0X1.do?' + param, 780, 470, 'getCOM_ENS_0X1', '1,0,1,1,1,1,1,1', true, Col,Row);
					break;
		        case "btn_chk_de_cnt_cd":
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_0M1.do?cnt_cd=" + formObj.chk_de_cnt_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 450, "getCOM_ENS_0M1_chk_de_cnt_cd", "0,0", true);
		            //ComOpenPopup('/opuscntr/COM_ENS_0M1.do', 770, 520, 'getCnt_cd', "1,0,1,1,1,1,1", true);
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

	function getCOM_ENS_0X1_chk_de_ste_cd(rowArray, Row, Col) {
	   	var formObj=document.form;
		var colArray=rowArray[0];
		formObj.chk_de_cnt_cd.value=colArray[5];
		formObj.chk_de_ste_cd.value=colArray[3];
	}
	
  /**
   * Sheet processing-related processes <br>
   */
 	function doActionIBSheet(sheetObj, formObj, sAction) {
	   try {
	 		sheetObj.ShowDebugMsg(false);
 			var ins_vndr_seq=""
 				if(document.form.vndr_seq.value == "") {
 					//ins_vndr_seq = document.form.new_vndr_seq.value;
 					ins_vndr_seq="1";
 				}else{
 					ins_vndr_seq=document.form.vndr_seq.value;
 				}
	 		switch (sAction) {																		
	 			case IBSEARCH: // retrieve
	 				if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}
	 				break;
	 			case IBCREATE: // New retrieve
	 			    ComResetAll();
	 				formObj.new_vndr_seq.value="1";
					ComEnableObject(formObj.vndr_seq, false);
					ComEnableObject(formObj.btn_vndr_cd_pop, false);
					ComEnableObject(formObj.tpb_flg, false);  // TPB Customer checkbox disable
 		 			formObj.vndr_seq.setAttribute("className","input2");
 		 			formObj.ibflag.value="I";
 		 			delt_flg.SetSelectCode("N");
					ComBtnDisable("btn_Create");
					pay_mzd_cd.SetSelectCode('X', false);
//					pay_mzd_cd.SetEnable(1);
	 				break;
		 		case SEARCH01:  			
		 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}	
		 			formObj.f_cmd.value=SEARCH01;			 			
		 			create_vndr_seq=formObj.vndr_seq.value;
		        	sheetObjects[0].RemoveAll();
		        	sheetObjects[0].RemoveEtcData();
		        	sheetObjects[1].RemoveAll();
		        	sheetObjects[1].RemoveEtcData();
		        	var prefixArr=new Array("", prefix1, prefix2);
		        	var sXml=sheetObj.GetSearchData("BCM_CCD_0040GS.do", FormQueryString(formObj)+"&" + ComGetPrefixParam(prefixArr));
		 			var rtnValue=sXml.split("|$$|");
		    		var sav=ComGetEtcData(rtnValue[0], "TRANS_RESULT_KEY");
		    		if(sav != "S" ){
		        		ComOpenWait(false);
		        		return;
		    		}
 		 			formObj.vndr_seq.readOnly=true;
	 		 		if (ComGetEtcData(rtnValue[0],"input_flg") == 'N'){ 
	 		 			formObj.vndr_cnt_cd.value=ComXmlString(rtnValue[0], "vndr_cnt_cd");
	 		 			formObj.vndr_lgl_eng_nm.value=ComXmlString(rtnValue[0], "vndr_lgl_eng_nm");
	 		 			formObj.vndr_locl_lang_nm.value=ComXmlString(rtnValue[0], "vndr_locl_lang_nm");
	 		 			formObj.vndr_abbr_nm.value=ComXmlString(rtnValue[0], "vndr_abbr_nm");	 		
	 		 			
	 		 			if(ComXmlString(rtnValue[0], "lgs_flg") =="Y"){
	 		 				formObj.lgs_flg.checked=true;
	 		 			}	 		 			
	 		 			if(ComXmlString(rtnValue[0], "procu_flg") =="Y"){
	 		 				formObj.procu_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "finc_flg") =="Y"){
	 		 				formObj.finc_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "team_flg") =="Y"){
	 		 				formObj.team_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "inter_co_flg") =="Y"){
	 		 				formObj.inter_co_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "otr_flg") =="Y"){
	 		 				formObj.otr_flg.checked=true;
	 		 			}
	 		 			formObj.loc_cd.value=ComXmlString(rtnValue[0], "loc_cd");
	 		 			formObj.ofc_cd.value=ComXmlString(rtnValue[0], "ofc_cd");
	 		 			//formObj.rgst_no.value=ComXmlString(rtnValue[0], "rgst_no");
	 		 			formObj.tax_id.value=ComXmlString(rtnValue[0], "tax_id");
	 		 			gen_pay_term_cd.SetSelectCode(ComXmlString(rtnValue[0], "gen_pay_term_cd"));
	 		 			pay_term_tp_cd.SetSelectCode(ComXmlString(rtnValue[0], "pay_term_tp_cd"));
	 		 			pay_mzd_cd.SetSelectCode(ComXmlString(rtnValue[0], "pay_mzd_cd"));
	 		 			formObj.prnt_vndr_seq.value=ComXmlString(rtnValue[0], "prnt_vndr_seq");
	 		 			formObj.inv_curr_cd.value=ComXmlString(rtnValue[0], "inv_curr_cd");
	 		 			formObj.cntc_pson_nm.value=ComXmlString(rtnValue[0], "cntc_pson_nm");
	 		 			formObj.ceo_nm.value=ComXmlString(rtnValue[0], "ceo_nm");
	 		 			formObj.bzct_nm.value=ComXmlString(rtnValue[0], "bzct_nm");
	 		 			formObj.bztp_nm.value=ComXmlString(rtnValue[0], "bztp_nm");
	 		 			formObj.usa_edi_cd.value=ComXmlString(rtnValue[0], "usa_edi_cd");
	 		 			formObj.svc_scp_cd_nm.value=ComXmlString(rtnValue[0], "svc_scp_cd_nm");
	 		 			formObj.svc_prd_tp_nm.value=ComXmlString(rtnValue[0], "svc_prd_tp_nm");
	 		 			formObj.svc_prd_rmk.value=ComXmlString(rtnValue[0], "svc_prd_rmk");
	 		 			dcgo_hndl_flg.SetSelectCode(ComXmlString(rtnValue[0], "dcgo_hndl_flg"));
	 		 			mty_rro_edi_use_flg.SetSelectCode(ComXmlString(rtnValue[0], "mty_rro_edi_use_flg"));
	 		 			wo_atch_file_flg.SetSelectCode(ComXmlString(rtnValue[0], "wo_atch_file_flg"));
	 		 			wo_edi_use_flg.SetSelectCode(ComXmlString(rtnValue[0], "wo_edi_use_flg"));
	 		 			inv_edi_use_flg.SetSelectCode(ComXmlString(rtnValue[0], "inv_edi_use_flg"));
	 		 			formObj.rfnd_psdo_cust_cd.value=ComXmlString(rtnValue[0], "rfnd_psdo_cust_cd");
	 		 			formObj.vndr_ofc_cd.value=ComXmlString(rtnValue[0], "vndr_ofc_cd");
	 		 			subs_co_cd.SetSelectCode(ComXmlString(rtnValue[0], "subs_co_cd"));
	 		 			formObj.eng_addr.value=ComXmlString(rtnValue[0], "eng_addr");
	 		 			formObj.zip_cd.value=ComXmlString(rtnValue[0], "zip_cd");
	 		 			formObj.locl_lang_addr.value=ComXmlString(rtnValue[0], "locl_lang_addr");
	 		 			formObj.chk_de_addr1.value=ComXmlString(rtnValue[0], "chk_de_addr1");
	 		 			formObj.chk_de_addr2.value=ComXmlString(rtnValue[0], "chk_de_addr2");
	 		 			formObj.chk_de_addr3.value=ComXmlString(rtnValue[0], "chk_de_addr3");
	 		 			formObj.chk_de_cty_nm.value=ComXmlString(rtnValue[0], "chk_de_cty_nm");
	 		 			formObj.chk_de_ste_cd.value=ComXmlString(rtnValue[0], "chk_de_ste_cd");
	 		 			formObj.chk_de_zip_cd.value=ComXmlString(rtnValue[0], "chk_de_zip_cd");
	 		 			formObj.chk_de_cnt_cd.value=ComXmlString(rtnValue[0], "chk_de_cnt_cd");
	 		 			lu_delt_flg.SetSelectCode(ComXmlString(rtnValue[0], "lu_delt_flg"));
	 		 			delt_flg.SetSelectCode(ComXmlString(rtnValue[0], "delt_flg"),false);
	 		 			//formObj.modi_vndr_cd.value=ComXmlString(rtnValue[0], "modi_vndr_cd");
	 		 			//formObj.old_modi_vndr_cd.value=ComXmlString(rtnValue[0], "modi_vndr_cd");
	 		 			formObj.cre_usr_id.value=ComXmlString(rtnValue[0], "cre_usr_id");
	 		 			formObj.cre_dt.value=ComXmlString(rtnValue[0], "cre_dt");
	 		 			formObj.upd_usr_id.value=ComXmlString(rtnValue[0], "upd_usr_id");
	 		 			formObj.upd_dt.value=ComXmlString(rtnValue[0], "upd_dt");
	 		 			//formObj.sap_id.value=ComXmlString(rtnValue[0], "sap_id");
	 		 			formObj.bank_acct_flg.value=ComXmlString(rtnValue[0], "bank_acct_flg");
	 		 			formObj.vndr_gst_no.value=ComXmlString(rtnValue[0], "vndr_gst_no");
	 		 			formObj.svc_acctg_cd.value=ComXmlString(rtnValue[0], "svc_acctg_cd");
	 		 			formObj.ida_gst_no.value=ComXmlString(rtnValue[0], "ida_gst_no");	 		 			
	 		 			init_delt_flg = ComXmlString(rtnValue[0], "delt_flg");

	 		 			sheetObjects[0].LoadSearchData(rtnValue[1],{Sync:1} );
	 		    		sheetObjects[1].LoadSearchData(rtnValue[2],{Sync:1} );
	 		    		formObj.ibflag.value="U";
	 		    		if(formObj.rfnd_psdo_cust_cd.value != '')
	 		    			formObj.tpb_flg.checked=true;
	 		    		else
	 		    			formObj.tpb_flg.checked=false;
	 		    		
	 		    		pay_mzd_cd.SetEnable(0);
	 		 		}else { 
	 		 			//new vndr_cd.
	 		 			formObj.input_flg.value="Y";
	 		 			delt_flg.SetSelectCode("N");
	 		 			formObj.ibflag.value="I";
	 		 			formObj.vndr_seq.value=create_vndr_seq;
	 	    	    	ComShowCodeMessage("CCD00033", "Vendor Code");
	 	    	    	doActionIBSheet(sheetObj, formObj, IBCLEAR);
	 		 		}
	 		 		//ComBtnDisable("btn_create");			
	 		 		break;	 				 		
		 		case IBCLEAR:      // initializing
		 			ComResetAll();
		 			// ComEnableObject(formObj.vndr_seq, true);
		 			formObj.vndr_seq.readOnly = false;
		 			ComEnableObject(formObj.btn_vndr_cd_pop, true);
		 			ComEnableObject(formObj.tpb_flg, true);  // TPB Customer checkbox abled
		 			formObj.vndr_seq.setAttribute("class","input1");
		 			ComSetFocus(document.form.vndr_seq);
		 			//formObj.old_modi_vndr_cd.value = "";
		    		formObj.edi_if_flg.value = "N";
		    		init_delt_flg = "N";
		 			ComBtnEnable("btn_Create");	
		 			ComBtnEnable("btn_Save"); 
//		 			pay_mzd_cd.SetEnable(1);
		 			pay_mzd_cd.SetSelectCode('X', false);
	 		 		break;	
		 		case IBINSERT: 	
		 			with (sheetObjects[0]) {
		 				sheetObj.DataInsert(-1);
		                SetCellValue(sheetObj.RowCount(), prefix1+"vndr_seq",ins_vndr_seq);
		                SetCellValue(sheetObj.RowCount(), prefix1+"delt_flg","N");
		 			}
		 			break;	
		 		case MODIFY01: 
		 			with (sheetObjects[1]) {
		 				sheetObj.DataInsert(-1);
		                SetCellValue(sheetObj.RowCount(), prefix2+"vndr_seq",ins_vndr_seq);
		                SetCellValue(sheetObj.RowCount(), prefix2+"delt_flg","N");
		 			}
	 		 		break;	
		 		case IBDELETE:      		
 	        	   for(var i=1; i<sheetObjects[0].RowCount()+1 ;i++){
 	        		   if(sheetObjects[0].GetRowStatus(i) =="D"){
 	        			  sheetObjects[0].SetRowHidden(i,1);
 	        		   }
 	        	   }
			 	   break;  
		 		case MODIFY02: 
 	        	   for(var i=1; i<sheetObjects[1].RowCount()+1 ;i++){
 	        		   if(sheetObjects[1].GetRowStatus(i) =="D"){
 	        			  sheetObjects[1].SetRowHidden(i,1);
 	        		   }
 	        	   }
			 	   break; 
		 		case IBSAVE: 
		 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}	
                    var sParamSheet2=sheetObjects[1].GetSaveString(true);
					if (sheetObjects[1].IsDataModified()&& sParamSheet2 == "") {
					    return;
					}	
             		if(formObj.ibflag.value == "I"){
	             		//vendor name search popup
			         	var sUrl="BCM_CCD_1040.do?name=" + formObj.vndr_lgl_eng_nm.value;
			         	sUrl= sUrl+ "&vndrCntCd=" + formObj.loc_cd.value.substring(0, 2);
			         	ComOpenPopup(sUrl, 770, 460, "getBCM_CCD_1040_saveflag", "0,0", true);
             		}
		 			if(formObj.vndr_seq.value == "" && formObj.saveflag.value == "Y"){ 
		 				//formObj.vndr_seq.value = formObj.new_vndr_seq.value ; //new_vndr_seq value is set to vndr_seq
		 				formObj.vndr_seq.value="1";
		 			}
		         	if (formObj.ibflag.value == "I" && formObj.saveflag.value == "N"){
		         		return false;
		         	}
	         		var locCd=formObj.loc_cd.value;
	         		var vndrCntCd=locCd.substring(0, 2);
	         		ComSetObjValue(formObj.vndr_cnt_cd, vndrCntCd);
	         		if( formObj.saveflag.value == "N" && formObj.rqst_no.value == ''){
	         			formObj.f_cmd.value=MULTI;
	         		}else{
	         			formObj.f_cmd.value=MULTI01;
	         		}
		 			if(formObj.lgs_flg.checked){
		 				formObj.lgs_flg.value="Y";
              		}
             		if(formObj.procu_flg.checked){
             			formObj.procu_flg.value="Y";
              		}
             		if(formObj.finc_flg.checked){
             			formObj.finc_flg.value="Y";
              		}
             		if(formObj.team_flg.checked){
             			formObj.team_flg.value="Y";
              		}
             		if(formObj.inter_co_flg.checked){
             			formObj.inter_co_flg.value="Y";
             		}
             		if(formObj.otr_flg.checked){
             			formObj.otr_flg.value="Y";
              		}
		 			var sParam=FormQueryString(formObj);
		    		sParam += "&" + sheetObjects[0].GetSaveString(false, true, prefix1+"ibflag");
		    		sParam += "&" + sheetObjects[1].GetSaveString(false, true, prefix2+"ibflag");
		    		var sXml=sheetObj.GetSaveData("BCM_CCD_0040GS.do", sParam);
	    			
	    			var rqstNo=ComGetEtcData(sXml, "RQST_NO");
					ComSetObjValue(formObj.rqst_no, rqstNo);
		 			var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
			     	if(sav == "S"  ){
			     		if(formObj.saveflag.value != "N" && formObj.rqst_no.value == ''){
			     			ComShowCodeMessage("CCD00031");
			     		} else if ( formObj.saveflag.value == "N" && formObj.rqst_no.value == '') {
			     			ComShowCodeMessage("COM130102", "Data");
						} else {
							ComShowCodeMessage("COM130102", "Data");
						}
			     		
			     		if( formObj.rqst_no.value == "undefined"){
			     			doActionIBSheet(sheetObjects[0], document.form, SEARCH01);
			     			formObj.rqst_no.value="" ;
			     		} else {
			     			formObj.vndr_seq.value="";
			     			doActionIBSheet(sheetObjects[0], document.form, SEARCH08);
//			     			 ComBtnDisable("btn_Save");
			     		}
			     	}else{
			     		ComShowCodeMessage("COM130103", "Data");
			     		formObj.rqst_no.value = ""; // Reset Request Number if vendor save is failed.
			       	}
			     	sheetObj.LoadSaveData(sXml);
	 		 		break;
		 		case SEARCH08:  			
		 			if (!validateForm(sheetObj,document.form,sAction)) {
						return false;
					}
		 			formObj.f_cmd.value=SEARCH08;			 			
		 			create_vndr_seq=formObj.vndr_seq.value;
		        	sheetObjects[0].RemoveAll();
		        	sheetObjects[0].RemoveEtcData();
		        	sheetObjects[1].RemoveAll();
		        	sheetObjects[1].RemoveEtcData();
		        	var prefixArr=new Array("", prefix1, prefix2);
		        	var sXml=sheetObj.GetSearchData("BCM_CCD_0040GS.do", FormQueryString(formObj)+"&" + ComGetPrefixParam(prefixArr));
		 			var rtnValue=sXml.split("|$$|");
		    		var sav=ComGetEtcData(rtnValue[0], "TRANS_RESULT_KEY");
		    		if(sav != "S" ){
		        		ComOpenWait(false);
		        		return;
		    		}
 		 			formObj.vndr_seq.readOnly=true;
	 		 		if (ComGetEtcData(rtnValue[0],"input_flg") == 'N'){ 
	 		 			formObj.vndr_cnt_cd.value=ComXmlString(rtnValue[0], "vndr_cnt_cd");
	 		 			formObj.vndr_lgl_eng_nm.value=ComXmlString(rtnValue[0], "vndr_lgl_eng_nm");
	 		 			formObj.vndr_locl_lang_nm.value=ComXmlString(rtnValue[0], "vndr_locl_lang_nm");
	 		 			formObj.vndr_abbr_nm.value=ComXmlString(rtnValue[0], "vndr_abbr_nm");	 			
	 		 			
	 		 			if(ComXmlString(rtnValue[0], "lgs_flg") =="Y"){
	 		 				formObj.lgs_flg.checked=true;
	 		 			}	 		 			
	 		 			if(ComXmlString(rtnValue[0], "procu_flg") =="Y"){
	 		 				formObj.procu_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "finc_flg") =="Y"){
	 		 				formObj.finc_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "team_flg") =="Y"){
	 		 				formObj.team_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "inter_co_flg") =="Y"){
	 		 				formObj.inter_co_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "otr_flg") =="Y"){
	 		 				formObj.otr_flg.checked=true;
	 		 			}
	 		 			if(ComXmlString(rtnValue[0], "vndr_seq")!='1'){
	 		 				formObj.vndr_seq.value=ComXmlString(rtnValue[0], "vndr_seq");
	 		 			}
	 		 			formObj.loc_cd.value=ComXmlString(rtnValue[0], "loc_cd");
	 		 			formObj.ofc_cd.value=ComXmlString(rtnValue[0], "ofc_cd");
	 		 			//formObj.rgst_no.value=ComXmlString(rtnValue[0], "rgst_no");
	 		 			formObj.tax_id.value=ComXmlString(rtnValue[0], "tax_id");
	 		 			gen_pay_term_cd.SetSelectCode(ComXmlString(rtnValue[0], "gen_pay_term_cd"));
	 		 			pay_term_tp_cd.SetSelectCode(ComXmlString(rtnValue[0], "pay_term_tp_cd"));
	 		 			pay_mzd_cd.SetSelectCode(ComXmlString(rtnValue[0], "pay_mzd_cd"));
	 		 			formObj.prnt_vndr_seq.value=ComXmlString(rtnValue[0], "prnt_vndr_seq");
	 		 			formObj.inv_curr_cd.value=ComXmlString(rtnValue[0], "inv_curr_cd");
	 		 			formObj.cntc_pson_nm.value=ComXmlString(rtnValue[0], "cntc_pson_nm");
	 		 			formObj.ceo_nm.value=ComXmlString(rtnValue[0], "ceo_nm");
	 		 			formObj.bzct_nm.value=ComXmlString(rtnValue[0], "bzct_nm");
	 		 			formObj.bztp_nm.value=ComXmlString(rtnValue[0], "bztp_nm");
	 		 			formObj.usa_edi_cd.value=ComXmlString(rtnValue[0], "usa_edi_cd");
	 		 			formObj.svc_scp_cd_nm.value=ComXmlString(rtnValue[0], "svc_scp_cd_nm");
	 		 			formObj.svc_prd_tp_nm.value=ComXmlString(rtnValue[0], "svc_prd_tp_nm");
	 		 			formObj.svc_prd_rmk.value=ComXmlString(rtnValue[0], "svc_prd_rmk");
	 		 			dcgo_hndl_flg.SetSelectCode(ComXmlString(rtnValue[0], "dcgo_hndl_flg"));
	 		 			mty_rro_edi_use_flg.SetSelectCode(ComXmlString(rtnValue[0], "mty_rro_edi_use_flg"));
	 		 			wo_atch_file_flg.SetSelectCode(ComXmlString(rtnValue[0], "wo_atch_file_flg"));
	 		 			wo_edi_use_flg.SetSelectCode(ComXmlString(rtnValue[0], "wo_edi_use_flg"));
	 		 			inv_edi_use_flg.SetSelectCode(ComXmlString(rtnValue[0], "inv_edi_use_flg"));
	 		 			formObj.rfnd_psdo_cust_cd.value=ComXmlString(rtnValue[0], "rfnd_psdo_cust_cd");
	 		 			formObj.vndr_ofc_cd.value=ComXmlString(rtnValue[0], "vndr_ofc_cd");
	 		 			formObj.subs_co_cd.value=ComXmlString(rtnValue[0], "subs_co_cd");
	 		 			formObj.eng_addr.value=ComXmlString(rtnValue[0], "eng_addr");
	 		 			formObj.zip_cd.value=ComXmlString(rtnValue[0], "zip_cd");
	 		 			formObj.locl_lang_addr.value=ComXmlString(rtnValue[0], "locl_lang_addr");
	 		 			formObj.chk_de_addr1.value=ComXmlString(rtnValue[0], "chk_de_addr1");
	 		 			formObj.chk_de_addr2.value=ComXmlString(rtnValue[0], "chk_de_addr2");
	 		 			formObj.chk_de_addr3.value=ComXmlString(rtnValue[0], "chk_de_addr3");
	 		 			formObj.chk_de_cty_nm.value=ComXmlString(rtnValue[0], "chk_de_cty_nm");
	 		 			formObj.chk_de_ste_cd.value=ComXmlString(rtnValue[0], "chk_de_ste_cd");
	 		 			formObj.chk_de_zip_cd.value=ComXmlString(rtnValue[0], "chk_de_zip_cd");
	 		 			formObj.chk_de_cnt_cd.value=ComXmlString(rtnValue[0], "chk_de_cnt_cd");
	 		 			lu_delt_flg.SetSelectCode(ComXmlString(rtnValue[0], "lu_delt_flg"));
	 		 			delt_flg.SetSelectCode(ComXmlString(rtnValue[0], "delt_flg"),false);
	 		 			//formObj.modi_vndr_cd.value=ComXmlString(rtnValue[0], "modi_vndr_cd");
	 		 			formObj.bank_acct_flg.value=ComXmlString(rtnValue[0], "bank_acct_flg");
	 		 			formObj.vndr_gst_no.value=ComXmlString(rtnValue[0], "vndr_gst_no");
	 		 			formObj.svc_acctg_cd.value=ComXmlString(rtnValue[0], "svc_acctg_cd");
	 		 			formObj.ida_gst_no.value=ComXmlString(rtnValue[0], "ida_gst_no");
	 		 			
	 		 			init_delt_flg = ComXmlString(rtnValue[0], "delt_flg");
	 		 			sheetObjects[0].LoadSearchData(rtnValue[1],{Sync:1} );
	 		    		sheetObjects[1].LoadSearchData(rtnValue[2],{Sync:1} );
	 		    		formObj.ibflag.value="U";
	 		    		if(formObj.rfnd_psdo_cust_cd.value != '')
	 		    			formObj.tpb_flg.checked=true;
	 		    		else
	 		    			formObj.tpb_flg.checked=false;
	 		 		}else { 
	 		 			//new vndr_cd.
	 		 			formObj.input_flg.value="Y";
	 		 			delt_flg.SetSelectCode("N");
	 		 			formObj.ibflag.value="I";
	 		 		}
	 		 		break;
	 		 		
		 		case SEARCH10: // MDM AUTH_TP_CD query
					var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=VNDR';
					var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
					// global var sestting
					G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
					G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
						break;
			 		case MULTI03:	// Request
					if (!ComShowCodeConfirm("CCD00030")) {
					    return;
					}
					var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&proc_tp_cd=O';
					var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
						var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
						if(sav == "S"  ){
							ComShowCodeMessage("CCD00031");
							ComPopUpReturnValue("Y");
							ComClosePopup(); 
						} else {
							ComShowCodeMessage("COM130103", "Data");
						}
					break;
	 		}
		} catch(e){
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
		}finally {
			 ComOpenWait(false);
		}
	}	
 	
 	 	
	/**
	 * registering IBSheet Object as list
	 * adding process for list in case of needing batch processing with other items 
	 * defining list on the top of source
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	} 	
  	/**
  	 * registering IBCombo Object as list
  	 * adding process for list in case of needing batch processing with other items 
  	 * defining list on the top of source
  	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
		try{
			if(combo_obj.options.id=="mty_rro_edi_use_flg" || combo_obj.options.id=="wo_atch_file_flg" || combo_obj.options.id=="subs_co_cd") {
				combo_obj.SetVisible(false);
			}
		} catch(e){
			if (e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			}
		}
	}		
    /**
     * handling process for input validation <br>
     */
     function validateForm(sheetObj, formObj, sAction) {
        var sheetObject1=sheetObjects[0];   
        var sheetObject2=sheetObjects[1];   
        /*******************************************************/
    	 switch (sAction) {
	    	 case SEARCH01: 
		    		// Vendor Seq is null
			    	 if(formObj.vndr_seq.value == "") {
							ComShowCodeMessage('CCD00001',"Vendor"); 
							ComSetFocus(document.form.vndr_seq);					
							return false;
						}
	    	 	break;
	    	 	
	    	 case IBSAVE: // save
		    	// Vendor Seq is null , ComIsEmpty()
	    	 	if(delt_flg.GetSelectCode()!="Y" || init_delt_flg != "Y"){
	    	 		if( formObj.rqst_no.value == ''){
				    	if(formObj.vndr_seq.value == "" && formObj.ibflag.value != "I") {
				    		ComShowCodeMessage('CCD00001',"Vendor"); 
							ComSetFocus(document.form.vndr_seq);					
							return false;
				    	}
		    	 	}
			    	 if(formObj.vndr_lgl_eng_nm.value == "") {
							ComShowCodeMessage('CCD00001',"Vendor Name"); 
							ComSetFocus(document.form.vndr_lgl_eng_nm);					
							return false;
						}
				    	// Location is null
			    	 if(formObj.loc_cd.value == "") {
							ComShowCodeMessage('CCD00001',"Location"); 
							ComSetFocus(document.form.loc_cd);					
							return false;
						}
				    	// Control Office is null
			    	 if(formObj.ofc_cd.value == "") {
							ComShowCodeMessage('CCD00001',"Control Office"); 
							ComSetFocus(document.form.ofc_cd);					
							return false;
						}
				    	//Payment Term is null
			    	 if(gen_pay_term_cd.GetSelectCode()== "") {
							ComShowCodeMessage('CCD00001',"Payment Term"); 
							ComSetFocus(document.form.gen_pay_term_cd);					
							return false;
						}
				    	//Payment Term Type is null
			    	 if(pay_term_tp_cd.GetSelectCode()== "") {
							ComShowCodeMessage('CCD00001',"Payment Term Type"); 
							ComSetFocus(document.form.pay_term_tp_cd);					
							return false;
						}
				    	//Payment Method is null
			    	 if(pay_mzd_cd.GetSelectCode()== "") {
							ComShowCodeMessage('CCD00001',"Payment Method"); 
							ComSetFocus(document.form.pay_mzd_cd);					
							return false;
						}
				    	//Invoice Currency is null
			    	 if(formObj.inv_curr_cd.value == "") {
							ComShowCodeMessage('CCD00001',"Invoice Currency"); 
							ComSetFocus(document.form.inv_curr_cd);					
							return false;
						}
				    	//Address(ENG) is null
			    	 if(formObj.eng_addr.value == "") {
							ComShowCodeMessage('CCD00001',"Address(ENG)"); 
							ComSetFocus(document.form.eng_addr);					
							return false;
						}
			    	 if (ComGetLenByByte(formObj.vndr_locl_lang_nm.value) > formObj.vndr_locl_lang_nm.getAttribute("maxLength")){
			              ComShowCodeMessage("COM12142", "Vendor Name(Local)", formObj.vndr_locl_lang_nm.getAttribute("maxLength")+" Bytes");
			              formObj.vndr_locl_lang_nm.select(); 
	       			     return false;
	    	          }   
			    	 if (ComGetLenByByte(formObj.locl_lang_addr.value) > formObj.locl_lang_addr.getAttribute("maxLength")){
			              ComShowCodeMessage("COM12142", "Address(Local)", formObj.locl_lang_addr.getAttribute("maxLength")+" Bytes");
			              formObj.locl_lang_addr.select(); 
	      			     return false;
	   	             }
			    	 if (ComGetLenByByte(formObj.chk_de_addr1.value) > formObj.chk_de_addr1.getAttribute("maxLength")){
			              ComShowCodeMessage("COM12142", "Address1(Local)", formObj.chk_de_addr1.getAttribute("maxLength")+" Bytes");
			              formObj.chk_de_addr1.select(); 
	     			     return false;
	  	             }
			    	 if (ComGetLenByByte(formObj.chk_de_addr2.value) > formObj.chk_de_addr2.getAttribute("maxLength")){
			              ComShowCodeMessage("COM12142", "Address2(Local)", formObj.chk_de_addr2.getAttribute("maxLength")+" Bytes");
			              formObj.chk_de_addr2.select(); 
	    			     return false;
	 	             } 
			    	 if (ComGetLenByByte(formObj.chk_de_addr3.value) > formObj.chk_de_addr3.getAttribute("maxLength")){
			              ComShowCodeMessage("COM12142", "Address3(Local)", formObj.chk_de_addr3.getAttribute("maxLength")+" Bytes");
			              formObj.chk_de_addr3.select(); 
	    			     return false;
	 	             }
			    	 
			    	 if(pay_mzd_cd.GetSelectCode() == "P" || pay_mzd_cd.GetSelectCode() == "T" || pay_mzd_cd.GetSelectCode() == "V"){
				    	 if(formObj.chk_de_addr1.value == "") {
								ComShowCodeMessage('CCD00001',"Address1(Local)"); 
								ComSetFocus(document.form.chk_de_addr1);					
								return false;
						 }
				    	 
				    	 if(formObj.chk_de_addr2.value == "") {
								ComShowCodeMessage('CCD00001',"Address2(Local)"); 
								ComSetFocus(document.form.chk_de_addr2);					
								return false;
						 }
				    	 
				    	 if(formObj.chk_de_cnt_cd.value == "") {
								ComShowCodeMessage('CCD00001',"Country Code"); 
								ComSetFocus(document.form.chk_de_cnt_cd);					
								return false;
						 }
			    	 }
			    	 
			    	 //VENDOR CONTACT POINT
		            sheetObj=sheetObjects[0];
		            var rowCnt = sheetObj.RowCount("I")+sheetObj.RowCount("R")+sheetObj.RowCount("U") ;
		            var cntPrimary=0;
		            for(i=1; i <= sheetObj.LastRow(); i++){
		            	if(sheetObj.GetCellValue(i,prefix1+"prmry_chk_flg")=="Y"){
		                    cntPrimary++;
		                }
		            }
		            // prmry_chk_flg 는 1개만 가능 
		            if(cntPrimary>1  || (cntPrimary == 0 && rowCnt > 0)){
		                sheetObj.SelectCell(1,prefix1+"prmry_chk_flg",0);
		                //ComShowMessage('Address primary flag only one.');
		                ComShowCodeMessage("CCD00008");
		                return false;
		            }
			    	 
		    		for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
		    			var sb1=sheetObjects[1].GetCellValue(i,  prefix2+"vndr_cost_cd");
		    			var knd1=sheetObjects[1].GetCellValue(i, prefix2+"cntr_vndr_svc_cd");
		    			 if(sb1 == "" ) {
								ComShowCodeMessage('CCD00001',"Vendor Classification - Subject"); 
								sheetObjects[1].SelectCell(i,2, false);
								return false;
							}
		    			 if(knd1 == "") {
								ComShowCodeMessage('CCD00001',"Vendor Classification - Kind of Service"); 
								sheetObjects[1].SelectCell(i,3, false);
								return false;
							}
		    			for (var j=1; j<=sheetObjects[1].RowCount(); j++) {
		    				var sb2=sheetObjects[1].GetCellValue(j,  prefix2+"vndr_cost_cd");
		    				var knd2=sheetObjects[1].GetCellValue(j, prefix2+"cntr_vndr_svc_cd");
							if (j != i && sb1 == sb2 && knd1 == knd2 ) {
								ComShowCodeMessage("CCD00004", "Vendor Classification : "+ sheetObjects[1].GetCellText(i, prefix2+"vndr_cost_cd")+" | "+ sheetObjects[1].GetCellText(i,  prefix2+"cntr_vndr_svc_cd"));
								sheetObjects[1].SelectCell(i,3, false);
								return false;
							}
		    			}
		    		}
		    		
//		    		if (formObj.modi_vndr_cd.value != formObj.old_modi_vndr_cd.value) {
//		    	    	 formObj.edi_if_flg.value = "Y";
//		    	     } else {
//		    	    	 formObj.edi_if_flg.value = "N";
//		    	     }
	    	 	}else{
	    	 		ComShowCodeMessage("CCD00048");
	    	 		return false;
	    	 	}
	    		
	    	 	break;
    	 }
 		return true;
 	}
    /**
     * OnKeyPress eventn handling. <br>
     */     
//   function obj_keypress() {
//	 	obj=event.srcElement;	 	
//	 	keyValidation(obj);  
//	 	var srcName=ComGetEvent("name");
//			if(ComGetBtnDisable(srcName)) return false;
//        switch(srcName) { 	
//          // case "vndr_locl_lang_nm":
//   	       case "locl_lang_addr":
//   	      // case "chk_de_addr1":
//   	      // case "chk_de_addr2":
//   	      // case "chk_de_addr3":
//   			var attriVal=obj.getAttribute("maxLength");
//   			var sVal=ComGetLenByByte(obj.value);
//   			var rel=obj.value.length;
//   			if (sVal < attriVal){
//   				obj.maxLength=attriVal ;
//   			}else{
//   				obj.maxLength=rel ;
//   			}   
//      break;
//      }  
//   } 	  
   /**
    * Axon EVENT.<br>
    */    
     function initControl() {
    	//Axon event handling     
		axon_event.addListenerForm('beforedeactivate', 'obj_deactivate', document.form);   
		//	axon_event.addListenerFormat('keypress', 'obj_keypress', document.form	); 
		axon_event.addListenerForm('change', 'obj_change', document.form);
     } 
     /**
      * All the combo box query
      */
 	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
 		switch (sAction) {
 			case SEARCH: // load page
 				var sXml=sheetObj.GetSearchData("BCM_CCD_0040GS.do", "f_cmd=" + SEARCH);
 				var rtnValue=sXml.split("|$$|");
 				for(var i=0; i<rtnValue.length; i++){
 					var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
 					var cdName=comboXml[0].split("|");
 					var cdValue=comboXml[1].split("|");
 					if(i == 11){
						sheetObj.SetColProperty(prefix1+"delt_flg", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
					}else if(i == 12){
						sheetObjects[1].SetColProperty(prefix2+"vndr_cost_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
					}else if(i == 13){
						sheetObjects[1].SetColProperty(prefix2+"cntr_vndr_svc_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
					}else if(i == 14){						
						sheetObjects[1].SetColProperty(prefix2+"delt_flg", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
					}else{
	 					for (var j=0; j < cdName.length; j++) {
 							comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
	 					}
					}
 				}  
 				// Delete Flag combo value init
 				delt_flg.SetSelectCode('N',false);
 				pay_mzd_cd.SetSelectCode('X', false);
 				pay_mzd_cd.SetEnable(0);
      		break;
      	}
 	}
    /**
     * If the data field to be the change Event
     */
    function obj_change(){
    	  var formObject=document.form;
    	  /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];
        /*******************************************************/
        if(formObject.ibflag.value != "I"){
        	formObject.ibflag.value="U";
        }
    	try {
    		var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
    		var obj=ComGetEvent();
    		var cName="";
            switch(srcName) {
            		case "tpb_flg":
            			var vndrSeq=formObject.vndr_seq.value;
            			if(formObject.tpb_flg.checked) {
            				formObject.tpb_flg.value='Y';
            				if(vndrSeq != '')
            					formObject.rfnd_psdo_cust_cd.value='TB' + vndrSeq;
            				else
            					formObject.rfnd_psdo_cust_cd.value = 'TB' ;
            			} else {
            				formObject.tpb_flg.value='N';
            				ComClearObject(formObject.rfnd_psdo_cust_cd);
            			}
            			break;
            		case "vndr_seq":
            			var max_seq=formObject.vndr_seq.value;
    					while(max_seq.toString().length < 6){
    						max_seq="0" + max_seq;
    					}
    					formObject.vndr_seq.value=max_seq;
	             		if(formObject.vndr_seq.value.length > 0){
	        		        doActionIBSheet(sheetObject1,	formObject,	SEARCH01);
	              		}
	              		break;
            		case "lgs_flg":
	             		if(formObject.lgs_flg.checked){
	             			formObject.lgs_flg.value="Y";
	              		}else{
	              			formObject.lgs_flg.value="N";
	              		}
	              		break;	
            		case "procu_flg":
	             		if(formObject.procu_flg.checked){
	             			formObject.procu_flg.value="Y";
	              		}else{
	              			formObject.procu_flg.value="N";
	              		}
	              		break;	
            		case "finc_flg":
	             		if(formObject.finc_flg.checked){
	             			formObject.finc_flg.value="Y";
	              		}else{
	              			formObject.finc_flg.value="N";
	              		}
	              		break;	
            		case "team_flg":
	             		if(formObject.team_flg.checked){
	             			formObject.team_flg.value="Y";
	              		}else{
	              			formObject.team_flg.value="N";
	              		}
	              		break;	
            		case "inter_co_flg":
	             		if(formObject.inter_co_flg.checked){
	             			formObject.inter_co_flg.value="Y";
	              		}else{
	              			formObject.inter_co_flg.value="N";
	              		}
	              		break;	
            		case "otr_flg":
	             		if(formObject.otr_flg.checked){
	             			formObject.otr_flg.value="Y";
	              		}else{
	              			formObject.otr_flg.value="N";
	              		}
	              		break;	
	              	case "vndr_cnt_cd":
	              		if(formObject.vndr_cnt_cd.value.length>0){	
	              			formObject.f_cmd.value=SEARCH03;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value + "&check_cd=" +formObject.vndr_cnt_cd.value;
	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd=ComGetEtcData(sXml, "result");
	        		        if(check_cd == ""){
	        		        	formObject.vndr_cnt_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Vendor Country"); 		
	        		        	ComSetFocus(document.form.vndr_cnt_cd);		
	        		        } 
	              		}
	              		break;
	              	case "loc_cd":
	              		if(formObject.loc_cd.value.length>0){	
	              			formObject.f_cmd.value=SEARCH04;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value + "&check_cd=" +formObject.loc_cd.value;
	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd=ComGetEtcData(sXml, "result");
	    		 			
	        		        if(check_cd == ""){
	        		        	formObject.loc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Location"); 		
	        		        	ComSetFocus(document.form.loc_cd);		
	        		        }else{
	        		        	ComSetFocus(document.form.ofc_cd);
	        		        }
	              		}
	              		break;
	              	case "ofc_cd":
	              		if(formObject.ofc_cd.value.length>0){	
	              			formObject.f_cmd.value=SEARCH05;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value + "&check_cd=" +formObject.ofc_cd.value;
	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd=ComGetEtcData(sXml, "result");
	    		 			var cont_cd=ComGetEtcData(sXml, "country");
	        		        if(check_cd == ""){
	        		        	formObject.ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Control Office"); 		
	        		        	ComSetFocus(document.form.ofc_cd);		
	        		        }else{
	        		        	if(cont_cd == "JP"){
	        		        		ComShowCodeMessage("CCD00047");
	        		        		formObject.eng_addr.setAttribute("dataformat","engup");
	        		        		formObject.eng_addr.setAttribute("otherchar", " (,)/.+:'-");
	        		        	}else{
	        		        		formObject.eng_addr.setAttribute("dataformat","excepthan");
	        		        	}
	        		        	//ComSetFocus(document.form.rgst_no);
	        		        	ComSetFocus(document.form.tax_id);
	        		        } 
	              		}
	              		break;
	              	case "prnt_vndr_seq":
	              		if(formObject.prnt_vndr_seq.value.length>0){	
	              			formObject.f_cmd.value=SEARCH06;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value + "&check_cd=" +formObject.prnt_vndr_seq.value;
	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd=ComGetEtcData(sXml, "result");
	        		        if(check_cd == ""){
	        		        	formObject.prnt_vndr_seq.value="";
	        		        	ComShowCodeMessage("COM130402", "Parent Vendor"); 		
	        		        	ComSetFocus(document.form.prnt_vndr_seq);		
	        		        } 
	              		}
	              		break;
	              	case "inv_curr_cd":
	              		if(formObject.inv_curr_cd.value.length>0){	
	              			formObject.f_cmd.value=SEARCH07;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value + "&check_cd=" +formObject.inv_curr_cd.value;
	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd=ComGetEtcData(sXml, "result");
	        		        if(check_cd == ""){
	        		        	formObject.inv_curr_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Invoice Currency"); 		
	        		        	ComSetFocus(document.form.inv_curr_cd);		
	        		        }else{
	        		        	ComSetFocus(document.form.cntc_pson_nm);
	        		        }  
	              		}
	              		break;
	              	case "vndr_ofc_cd":
	              		if(formObject.vndr_ofc_cd.value.length>0){	
	              			formObject.f_cmd.value=SEARCH05;
	    		 			var sParam="f_cmd="       +formObject.f_cmd.value + "&check_cd=" +formObject.vndr_ofc_cd.value;
	    		 			var sXml=sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd=ComGetEtcData(sXml, "result");
	        		        if(check_cd == ""){
	        		        	formObject.vndr_ofc_cd.value="";
	        		        	ComShowCodeMessage("COM130402", "Vendor Office"); 		
	        		        	ComSetFocus(document.form.vndr_ofc_cd);		
	        		        }else{
	        		        	ComSetFocus(document.form.subs_co_cd);
	        		        }  
	              		}
	              		break;
	              	 case "vndr_locl_lang_nm":
	              		cName="Vendor Name(Local)";
	              		var attriVal=obj.getAttribute("maxLength");
	              		var sVal=ComGetLenByByte(obj.value);
	              		if (sVal > attriVal){
	              			ComShowCodeMessage("COM12142", cName, attriVal+" Bytes");
//		              			formObject.vndr_locl_lang_nm.focus(); 
	              			return false;
	              		}
	              		break;
	              	 case "locl_lang_addr":
	              		cName="Address(Local)";
	              		var attriVal=obj.getAttribute("maxLength");
	              		var sVal=ComGetLenByByte(obj.value);
	              		if (sVal > attriVal){
	              			ComShowCodeMessage("COM12142", cName, attriVal+" Bytes");
//		              			formObject.locl_lang_addr.focus(); 
	              			return false;
	              		}
	              		break;
	              	 case "chk_de_addr1":
	              		cName="Address1(Local)";
	              		var attriVal=obj.getAttribute("maxLength");
	              		var sVal=ComGetLenByByte(obj.value);
	              		if (sVal > attriVal){
	              			ComShowCodeMessage("COM12142", cName, attriVal+" Bytes");
//		              			formObject.chk_de_addr1.focus(); 
	              			return false;
	              		}
	              		break;
	              	 case "chk_de_addr2":
	              		cName="Address2(Local)";
	              		var attriVal=obj.getAttribute("maxLength");
	              		var sVal=ComGetLenByByte(obj.value);
	              		if (sVal > attriVal){
	              			ComShowCodeMessage("COM12142", cName, attriVal+" Bytes");
//		              			formObject.chk_de_addr2.focus(); 
	              			return false;
	              		}
	              		break;
	              	 case "chk_de_addr3":
	              		cName="Address3(Local)";
	              		var attriVal=obj.getAttribute("maxLength");
	              		var sVal=ComGetLenByByte(obj.value);
	              		if (sVal > attriVal){
	              			ComShowCodeMessage("COM12142", cName, attriVal+" Bytes");
//		              			formObject.chk_de_addr3.focus(); 
	              			return false;
	              		}
	              		break;
	              	case "chk_de_ste_cd":
	              		if(formObject.chk_de_ste_cd.value.length > 0) {	
	              			formObject.f_cmd.value = SEARCH09;
	    		 			var sParam = "f_cmd=" + SEARCH09 + "&check_de_cnt_cd=" + formObject.chk_de_cnt_cd.value + "&check_cd=" + formObject.chk_de_ste_cd.value;
	    		 			var sXml = sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd = ComGetEtcData(sXml, "result");
	        		        if(check_cd == "") {
	        		        	formObject.chk_de_ste_cd.value = "";
	        		        	ComShowCodeMessage("COM130402", "State"); 		
	        		        	ComSetFocus(document.form.chk_de_ste_cd);		
	        		        } else {
	        		        	formObject.chk_de_cnt_cd.value = ComGetEtcData(sXml, "cnt_cd");
	        		        }
	              		}
	              		break;
	              	case "chk_de_cnt_cd":
	              		if(formObject.chk_de_cnt_cd.value.length > 0) {
	              			formObject.f_cmd.value = SEARCH03;
	    		 			var sParam = "f_cmd=" + formObject.f_cmd.value + "&check_cd=" + formObject.chk_de_cnt_cd.value;
	    		 			var sXml = sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
	    		 			var check_cd = ComGetEtcData(sXml, "result");
	        		        if(check_cd == ""){
	        		        	formObject.chk_de_cnt_cd.value = "";
	        		        	ComShowCodeMessage("COM130402", "Check Delivery Country");
	        		        	ComSetFocus(document.form.chk_de_cnt_cd);
	        		        } else {
	    	              		if(formObject.chk_de_ste_cd.value.length > 0) {	
			              			formObject.f_cmd.value = SEARCH09;
			    		 			var sParam = "f_cmd=" + SEARCH09 + "&check_de_cnt_cd=" + formObject.chk_de_cnt_cd.value + "&check_cd=" + formObject.chk_de_ste_cd.value;
			    		 			var sXml = sheetObject1.GetSearchData("BCM_CCD_0040GS.do", sParam);
			    		 			var check_cd = ComGetEtcData(sXml, "result");
			        		        if(check_cd == "") {
			        		        	ComShowCodeMessage("COM130402", "Check Delivery State");
			        		        	ComSetFocus(document.form.chk_de_ste_cd);
			        		        }
	    	              		}
	        		        }
	              		}
	              		break;
            } // end switch
    	} catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
    /**
     * Delete Flag column values ​​'Y' Confirm Message When selecting the output
     * @param sheetObj
     * @param Row
     * @param Col
     * @param Value
     */
    function sheet1_OnChange(sheetObj, row, col, value) {
    	if(sheetObj.ColSaveName(col) != prefix1+"delt_flg") return;
    	if(value != 'Y') return;
    	if( !ComShowConfirm(ComGetMsg("CCD00012")) ) {
    		sheetObj.SetCellValue(row, col,'N',0);
    	}
    }
    /**
     * Delete Flag column values ​​'Y' Confirm Message When selecting the output
     * @param sheetObj
     * @param Row
     * @param Col
     * @param Value
     */
    function sheet2_OnChange(sheetObj, row, col, value) {
    	if(sheetObj.ColSaveName(col) != prefix2+"delt_flg") return;
    	if(value != 'Y') return;
    	if( !ComShowConfirm(ComGetMsg("CCD00012")) ) {
    		sheetObj.SetCellValue(row, col,'N',0);
    	}
    }
    /**
     * Delete Flag column values ​​'Y' Confirm Message When selecting the output
     * @param comboObj
     * @param code
     * @param text
     */
    function delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, code, text) {
 	   if(newCode != 'Y') return;
 	   if( !ComShowConfirm(ComGetMsg("CCD00012")) ) {
 		   comboObj.SetSelectCode('N',false);
 	   }
    }
    /**
     * ComResetAll()  Delete Flag IBCombo init
     */
    function initComboValue_delt_flg() {
    	delt_flg.SetSelectCode("N",false);
    }
    /**
     * COM_ENS_051 : LOC_CD
     */
    function getCOM_ENS_051_loc_cd(rowArray) { 
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.loc_cd.value=colArray[1];
    }    
    /**
     * COM_ENS_071 : Office code
     */
    function getCOM_ENS_071_ofc_cd(rowArray) {    	
    	var formObj=document.form;
    	var colArray=rowArray[0];	
    	formObj.ofc_cd.value=colArray[1];			 
    }	
    
    /**
     * BCM_CCD_1040 : saveflag
     */
    function getBCM_CCD_1040_saveflag(saveFlag) {
	var formObj = document.form;
	var sheetObj = sheetObjects[0];
	formObj.saveflag.value = saveFlag;

	/* Save Start */
	if (formObj.vndr_seq.value == "" && formObj.saveflag.value == "Y") {
		// formObj.vndr_seq.value = formObj.new_vndr_seq.value ; //new_vndr_seq
		// value is set to vndr_seq
		formObj.vndr_seq.value = "1";
	}
	if (formObj.ibflag.value == "I" && formObj.saveflag.value == "N") {
		return false;
	}
	var locCd = formObj.loc_cd.value;
	var vndrCntCd = locCd.substring(0, 2);
	ComSetObjValue(formObj.vndr_cnt_cd, vndrCntCd);
	if (formObj.saveflag.value == "N" && formObj.rqst_no.value == '') {
		formObj.f_cmd.value = MULTI;
	} else {
		formObj.f_cmd.value = MULTI01;
	}
	if (formObj.lgs_flg.checked) {
		formObj.lgs_flg.value = "Y";
	}
	if (formObj.procu_flg.checked) {
		formObj.procu_flg.value = "Y";
	}
	if (formObj.finc_flg.checked) {
		formObj.finc_flg.value = "Y";
	}
	if (formObj.team_flg.checked) {
		formObj.team_flg.value = "Y";
	}
	if (formObj.inter_co_flg.checked) {
		formObj.inter_co_flg.value = "Y";
	}
	if (formObj.otr_flg.checked) {
		formObj.otr_flg.value = "Y";
	}
	var sParam = FormQueryString(formObj);
	sParam += "&"+ sheetObjects[0].GetSaveString(false, true, prefix1 + "ibflag");
	sParam += "&"+ sheetObjects[1].GetSaveString(false, true, prefix2 + "ibflag");
	var sXml = sheetObj.GetSaveData("BCM_CCD_0040GS.do", sParam);

	var rqstNo = ComGetEtcData(sXml, "RQST_NO");
	ComSetObjValue(formObj.rqst_no, rqstNo);
	var sav = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
	if (sav == "S") {
		if (formObj.saveflag.value != "N" && formObj.rqst_no.value == '') {
			ComShowCodeMessage("CCD00031");
		} else if (formObj.saveflag.value == "N" && formObj.rqst_no.value == '') {
			ComShowCodeMessage("COM130102", "Data");
		} else {
			ComShowCodeMessage("COM130102", "Data");
		}

		if (formObj.rqst_no.value == "undefined") {
			doActionIBSheet(sheetObjects[0], document.form, SEARCH01);
			formObj.rqst_no.value = "";
		} else {
			formObj.vndr_seq.value = "";
			doActionIBSheet(sheetObjects[0], document.form, SEARCH08);
			ComBtnDisable("btn_Save");
		}
	} else {
		ComShowCodeMessage("COM130103", "Data");
		formObj.saveflag.value = "N";
		formObj.rqst_no.value = "";
	}
	sheetObj.LoadSaveData(sXml);

	/* Save End */
}
    
    
    /**
	 * COM_ENS_0C1 : Vendor code
	 */
   function getCOM_ENS_0C1_prnt_vndr_cd(rowArray, row, col) {   
   	var formObj=document.form;
	var colArray=rowArray[0];	
	formObj.prnt_vndr_seq.value=colArray[2];		
    }   
   /**
	 * COM_ENS_N13 : Currency code
	 */
   function getCOM_ENS_N13_inv_curr_cd(rowArray) { 
   	var formObj=document.form;
   	var colArray=rowArray[0];	
   	formObj.inv_curr_cd.value=colArray[0];		
   } 
   /**
    * COM_ENS_071 : Office code
    */
   function getCOM_ENS_071_vndr_ofc_cd(rowArray) {    	
   	var formObj=document.form;
   	var colArray=rowArray[0];	
   	formObj.vndr_ofc_cd.value=colArray[1];		
   }	
   /**
    * COM_ENS_0M1 : Country code
    */
   function getCOM_ENS_0M1_vndr_cnt_cd(rowArray) {    	
   	var formObj=document.form;
   	var colArray=rowArray[0];	
   	formObj.vndr_cnt_cd.value=colArray[1];			 
   }
   function getCOM_ENS_0M1_chk_de_cnt_cd(rowArray) {    	
		var formObj=document.form;
		var colArray=rowArray[0];	
		formObj.chk_de_cnt_cd.value=colArray[1];			 
   }
   /**
    * COM_COM_0007 : Vendor code
    */
   function getBtn_vndr_cd_pop(rowArray) {    	
   	var formObj=document.form;
   	var colArray=rowArray[0];	
   	formObj.vndr_seq.value=colArray[2];
    var sheetObject1=sheetObjects[0];

	if (formObj.rqst_no.value=='' || formObj.rqst_no.value == "undefined"){
		doActionIBSheet(sheetObject1,	formObj,	SEARCH01);
	} else{
		formObj.vndr_seq.value="";
		doActionIBSheet(sheetObject1,	formObj,	SEARCH08);
	}
   }
   
   /**
    * Payment Method Change Event
    * @param comboObj
    * @param code
    * @param text
    */
   function pay_mzd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {//CHECK OLD CODE: OnChange(comboObj, code, text) {
	   var formObj=document.form;
	   if(newCode == "P" || newCode == "T" || newCode == "V"){
		   formObj.chk_de_addr1.setAttribute("class","input1");
		   formObj.chk_de_addr2.setAttribute("class","input1");
		   formObj.chk_de_cnt_cd.setAttribute("class","input1");
	   }else{
		   formObj.chk_de_addr1.setAttribute("class","input");
		   formObj.chk_de_addr2.setAttribute("class","input");
		   formObj.chk_de_cnt_cd.setAttribute("class","input");
	   }
   }
