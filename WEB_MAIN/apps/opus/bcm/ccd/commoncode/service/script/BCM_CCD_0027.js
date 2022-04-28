/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0027.js
*@FileTitle  : Revenue lane
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
			   MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
			   THER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------From here the common JavaScript function is defined.     ------------------*/

/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix="sheet1_";
/** Event handler processing by button click event */
document.onclick=processButtonClick;
    /** Event handler processing by button name */
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
            if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
            case "btn_Retrieve":
				doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
				break;
            case "btn_New":
            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
            	break;
            case "btn_Save":
            	doActionIBSheet(sheetObjects[0],formObj,MULTI01);
            	break;
            case "btn_rlane_search":
            	var objEvt = ComGetEvent();
            	if(objEvt.style.cursor == "default") return;
            	var sUrl="/opuscntr/COM_COM_0011.do?rlane_cd=" + formObj.rlane_cd.value +"&mdm_yn="+ formObj.mdm_yn.value+"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 770, 420, "get_rLaneCd", "1,0,1", true);
    			break;
            case "btn_slan_search":
            	var sUrl="/opuscntr/COM_ENS_081.do?vsl_slan_cd=" + formObj.vsl_slan_cd.value +"&main_page=false";
                var rVal=ComOpenPopup(sUrl, 770, 420, "get_sLaneCd", "1,0,1", true);
    			break;
            case "btn_row_add":
            	addRow();
            	break;
            case "btn_row_delete":
            	deleteRow();
            	break;
    		case "btn_Close":
    			ComClosePopup(); 
    			break;
    		case "btn_Request":
    			doActionIBSheet(sheetObjects[0], document.form, MULTI03); 
    			break;
            }
        }catch(e) {
            if( e == "[object Error]") {
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
 	} 
    /**
     * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
     */
    function loadPage() {
        //페이지 로드시 선처리 기능을 호출한다.
        var formObj=document.form;
        for(i=0;i<sheetObjects.length;i++){
            //khlee-시작 환경 설정 함수 이름 변경
            ComConfigSheet (sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
        doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
//        doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
        vsl_tp_cd.SetSelectCode("C");
		delt_flg.SetSelectCode("N");
		
    	// auth_tp_cd retrieve
    	doActionIBSheet(sheetObjects[0], formObj, SEARCH10);
    	var authTpCd=G_AHTU_TP_CD;
    	var rqstNo=formObj.rqst_no.value;
    	if(G_MDAA_CHK == 'Y')
    		formObj.delt_flg.enable=true;
    	else
    		formObj.delt_flg.enable=false; 
    	// If the Process Status screen call, in the Detail PopUp
    	if(rqstNo != '') {
    		doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		ComSetDisplay('btn_Close', true);
    		var procTpCd=formObj.proc_tp_cd.value;
    		var rqstUsrChk=formObj.rqst_usr_chk.value;
    		ComEnableObject(formObj.btn_rlane_search, false);
    		// Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
    		if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
    			ComSetDisplay('btn_Request', true);
    			ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
    			ComSetDisplay('btn_Retrieve', true);
    			ComSetDisplay('btn_Save', true);
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		} else if(procTpCd == 'A') {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    			ComEnableObject(formObj.btn_rlane_search, false);
    		} else {
    			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
    		}
    	} else {
    		ComSetDisplay('btn_Retrieve', true);
    		// MDM Authority is not Approval('A') or MDDA
    		if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
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
        with(sheetObj){
	          var HeadTitle="|Del.|VSL Direction|IOC|Trade|Sub Trade|Continent From|Continent To|Dominant Leg Flag|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time";
	          SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );
	          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	          var headers = [ { Text:HeadTitle, Align:"Center"} ];
	          InitHeaders(headers, info);
	
	          var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
	                 {Type:"DummyCheck", Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk",         KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_slan_dir_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ioc_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:160,  Align:"Left",    ColMerge:0,   SaveName:prefix+"trd_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:260,  Align:"Left",    ColMerge:0,   SaveName:prefix+"sub_trd_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_conti_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"to_conti_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:130,   Align:"Center",  ColMerge:0,   SaveName:prefix+"dmnt_leg_flg",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"dtl_delt_flg",    KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
	                 {Type:"Text",      Hidden:0,  Width:80,  Align:"Center",    ColMerge:1,   SaveName:prefix+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",    ColMerge:1,   SaveName:prefix+"cre_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",    ColMerge:1,   SaveName:prefix+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",    ColMerge:1,   SaveName:prefix+"upd_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
	                 {Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"flg",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
	           
	          InitColumns(cols);
	          SetEditable(1);
	          SetSheetHeight(400);
                //no support[implemented common]CLT SelectHighLight=true;
          }
    }
    /**
     * 모든 콤보 박스 조회
     * 공통 부분 완성되면 추가 작업 요
     */
    	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    		switch (sAction) {
    			case SEARCH01: // load page 시
    				var Xml=sheetObj.GetSearchData("BCM_CCD_0027GS.do", "f_cmd=" + SEARCH01);
					var rtnValue=Xml.split("|$$|");
					subTrdCombo=rtnValue[8];			//trd_cd에 맞는 sub_trd_cd 콤보를 만들기 위해 전역변수화
					for(var i=0; i < rtnValue.length; i++){
						var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
						var cdName=comboXml[0].split("|");
						var cdValue=comboXml[1].split("|");
						for (var j=0; j < cdName.length; j++) {
							if(i == 0){
								comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
							} else if(i == 1){
								comboObjects[i].InsertItem(j, cdValue[j], cdValue[j]);
							} else if(i == 2){
								comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
							}
			        	}
						if(i == 3){
							sheetObj.SetColProperty(prefix+"vsl_slan_dir_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}else if(i == 4){
							sheetObj.SetColProperty(prefix+"ioc_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}else if(i == 5){
							sheetObj.SetColProperty(prefix+"fm_conti_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
							sheetObj.SetColProperty(prefix+"to_conti_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}else if(i == 6){
							sheetObj.SetColProperty(prefix+"dtl_delt_flg", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
							sheetObj.SetColProperty(prefix+"dmnt_leg_flg", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}
						else if(i == 7){
							sheetObj.SetColProperty(prefix+"trd_cd", {ComboText:"|"+comboXml[0], ComboCode:"|"+comboXml[1]} );
						}
					}					
         		break;
         	}
    	}
    // /handling sheet process
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH02:				//조회
    		if (validateForm(sheetObj, formObj, sAction)) {
    			if( formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=SEARCH02;
    	 		}else{
    	 			formObj.f_cmd.value=SEARCH05;
    	 		}
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	        	sheetObj.RemoveAll();
	        	sheetObj.RemoveEtcData();
	    		var sParam=FormQueryString(formObj);
	    		var prefixArr=new Array("", prefix);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_0027GS.do", sParam + "&" + ComGetPrefixParam(prefixArr));		//Search End 시 sub_trd_cd 콤보를 선택해주기 위해 전역 변수화
	    		var rtnValue=sXml.split("|$$|");
	    		subTrdNameList=rtnValue[1];
	    		var sav=ComGetEtcData(rtnValue[0], "TRANS_RESULT_KEY");
	    		var rqstNo=ComGetEtcData(rtnValue[0], "RQST_NO");
				ComSetObjValue(formObj.rqst_no, rqstNo);
	    		if(sav != "S" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		if(ComXmlString(rtnValue[0], "delt_flg") == null || ComXmlString(rtnValue[0], "delt_flg") == ""){
	    			ComOpenWait(false);
	    			formObj.creflag.value="Y";
	    			formObj.rlane_cd.readOnly=true;
	    			ComBtnEnable("btn_row_add");
		    		ComBtnEnable("btn_row_delete");
	    			formObj.rlane_nm.focus();
	    			if(G_AHTU_TP_CD=="A"){
	    	    		ComShowCodeMessage("CCD00033", "Revenue Lane Code");
	    	    		doActionIBSheet(sheetObj, formObj, IBCLEAR);
	    	    	}else{
	    	    		if(!ComShowConfirm(ComGetMsg("CCD00034", "Revenue Lane Code"))){
	    	    			doActionIBSheet(sheetObj, formObj, IBCLEAR);
	    	    		}
	    	    	}
	    			return;
	    		}else{
	    			formObj.creflag.value="N";
	    		}
	    		// 입력 박스 데이터 채우기
	    		formObj.add_flg.value="U";							//조회 후 조회 건에 대해 insert 아닌 update 되도록
	    		formObj.rlane_cd.value=getValueForCombo(ComXmlString(rtnValue[0], "rlane_cd"));
	    		formObj.rlane_nm.value=getValueForCombo(ComXmlString(rtnValue[0], "rlane_nm"));
	    		vsl_tp_cd.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "vsl_tp_cd")));
	    		rep_trd_cd.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "rep_trd_cd")));
	    		formObj.vsl_slan_cd.value=getValueForCombo(ComXmlString(rtnValue[0], "vsl_slan_cd"));
	    		delt_flg.SetSelectCode(getValueForCombo(ComXmlString(rtnValue[0], "delt_flg")),false);
	    		formObj.cre_usr_id.value=getValueForCombo(ComXmlString(rtnValue[0], "cre_usr_id"));
	    		formObj.cre_dt.value=getValueForCombo(ComXmlString(rtnValue[0], "cre_dt"));
	    		formObj.upd_usr_id.value=getValueForCombo(ComXmlString(rtnValue[0], "upd_usr_id"));
	    		formObj.upd_dt.value=getValueForCombo(ComXmlString(rtnValue[0], "upd_dt"));
	    		formObj.modi_rlane_cd.value = getValueForCombo(ComXmlString(rtnValue[0], "modi_rlane_cd"));
	    		sheetObj.LoadSearchData(rtnValue[1],{Sync:1} );
	    		ComOpenWait(false);
	    		formObj.rlane_cd.readOnly=true;		//내용 수정 시 조회 건에 대한 update를 하므로 key 값 변경 못하도록 disable
	    		ComBtnEnable("btn_row_add");
	    		ComBtnEnable("btn_row_delete");
    		}
    		break;
    	case MULTI01:				//저장
    		if (validateForm(sheetObj, formObj, sAction)) {
    			if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
    				formObj.f_cmd.value=MULTI01;
    	 		}else{
    	 			formObj.f_cmd.value=MULTI02;
    	 			ComEnableObject(formObj.btn_rlane_search, false);
    	 		}
    			var tmpMsg="";
    			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
    				tmpMsg="CCD00035";
    			}else{
    				tmpMsg="COM130101";
    			}
	    		if(ComShowConfirm(ComGetMsg(tmpMsg, "Data"))){
		    		sheetObj.SetWaitImageVisible(0);
		        	ComOpenWait(true);
		    		var sParam=FormQueryString(formObj);
		    		sParam += "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
		    		var Xml=sheetObj.GetSaveData("BCM_CCD_0027GS.do", sParam);
	    			var sav=ComGetEtcData(Xml, "TRANS_RESULT_KEY");
		    		if(sav == "S" ){					//저장 성공 후 재조회
		    			if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
	    					ComShowCodeMessage("CCD00031");
	    				} else {
	    					ComShowCodeMessage("COM130102", "Data");
	    				}
		        	}else{
		        		ComShowCodeMessage("COM132103", "Data");
		        	}
		    		var rqstNo=ComGetEtcData(Xml, "RQST_NO");
					ComSetObjValue(formObj.rqst_no, rqstNo);
					doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
		    		ComOpenWait(false);
	    		}
    		}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		formObj.rqst_no.value = "";
    		formObj.rlane_cd.readOnly=false;		//다시 조회 가능하도록 enable
    		vsl_tp_cd.SetSelectCode("C");
    		delt_flg.SetSelectCode("N");
//    		formObj.rep_trd_cd.value="";
    		rep_trd_cd.SetSelectCode("");
    		sheetObj.RemoveAll();
        	sheetObj.RemoveEtcData();
    		ComBtnDisable("btn_row_add");
            ComBtnDisable("btn_row_delete");
            ComEnableObject(formObj.btn_rlane_search, true);
    		formObj.add_flg.value="I";							//조회 후 조회 건에 대해 insert 아닌 update 되도록
    		break;
    	case SEARCH03:				//조회
			if (validateForm(sheetObj, formObj, sAction)) {
	    		formObj.f_cmd.value=SEARCH03;
	    		sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	    		var sParam=FormQueryString(formObj);
	    		var Xml=sheetObj.GetSearchData("BCM_CCD_0027GS.do", sParam);
	    		var sav=ComGetEtcData(Xml, "TRANS_RESULT_KEY");
	    		if(sav != "S" ){
	        		ComOpenWait(false);
	        		return;
	    		}
	    		if(ComGetEtcData(Xml, "result") == null || ComGetEtcData(Xml, "result") == ""){
	    			formObj.vsl_slan_cd.value="";
	    			ComShowCodeMessage("COM130402", "Vessel Service Lane");
	    			ComOpenWait(false);
	    			return;
	    		}
	    		ComOpenWait(false);
			}		
			break;
    	case SEARCH10: // MDM AUTH_TP_CD query
			var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=REVL';
			var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
			// global var sestting
			G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
			G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
			break;
		case MULTI03:	// Request
			if (!ComShowCodeConfirm("CCD00030")) {
			    return;
			}
			var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&rqst_ofc_cd=' + ComGetObjValue(formObj.rqst_ofc_cd) + '&proc_tp_cd=O';
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
    }
	/**
	 * Sheet1의 OnSearchEnd 이벤트 처리
	 */
	function sheet_OnSearchEnd(sheetObj, ErrMsg) {
	   var frmObj=document.form;
	   var subTrdName=ComXmlString(subTrdNameList, prefix+"sub_trd_cd").toString().split("|");
	   for (i=1; i <= sheetObj.LastRow(); i++ ) {
		   subTrdCdCombo(sheetObj, i, sheetObj.GetCellValue(i, prefix+"trd_cd"));
		   if(subTrdName[i-1] != null || subTrdName[i-1] != ""){
			   sheetObj.SetCellValue(i, prefix+"sub_trd_cd",subTrdName[i-1],0);
		   }
		   if(sheetObj.GetCellValue(i, prefix+"dtl_delt_flg") == "" || sheetObj.GetCellValue(i, prefix+"dtl_delt_flg") == null){
	 		  sheetObj.RowDelete(i, false);
	       }
	   }
	}
	/**
	 * Sheet1의 OnChange 이벤트 처리
	 */
	function sheet_OnChange(sheetObj, Row, Col, Value) {
         with (sheetObj) {
             switch(ColSaveName(Col)) {
             case prefix+"trd_cd":
            	 subTrdCdCombo(sheetObj, Row, Value);
            	 break;
             case prefix+"ioc_cd":
            	 subTrdCdCombo(sheetObj, Row, GetCellValue(Row, prefix+"trd_cd"));
            	 break;
             }
         }
	}
	function chkSheetVal(sheetObj, Row){
		with (sheetObj) {
			for(var i=1; i <= LastRow(); i++){
				if(i != Row){
					if(GetCellValue(i, prefix+"vsl_slan_dir_cd") == GetCellValue(Row, prefix+"vsl_slan_dir_cd")){
						if(GetCellValue(i, prefix+"ioc_cd") == GetCellValue(Row, prefix+"ioc_cd")){
							if(GetCellValue(i, prefix+"trd_cd") == GetCellValue(Row, prefix+"trd_cd")){
								if(GetCellValue(i, prefix+"fm_conti_cd") == GetCellValue(Row, prefix+"fm_conti_cd")){
									if(GetCellValue(i, prefix+"to_conti_cd") == GetCellValue(Row, prefix+"to_conti_cd")){
										ComShowCodeMessage("CCD00006");
				            			SelectCell(Row, prefix+"vsl_slan_dir_cd");
				            			return true;
									}
								}
							}						
						}					
					}
				}
			}
		}
	}
	/**
	 * Sheet1의 OnChange 이벤트 처리
	 */
	 function subTrdCdCombo(sheetObj, Row, trdCd){
		 var cdName=ComXmlString(subTrdCombo, "cd_desc").toString().split("|");
		 var cdValue=ComXmlString(subTrdCombo, "cd").toString().split("|");
		 var cdTrdCd=ComXmlString(subTrdCombo, "cd_etc").toString().split("|");
		 var cdDesc="";
		 var cd="";
		 if(sheetObj.GetCellValue(Row, prefix+"ioc_cd") == "I"){
			 for (var i=0; i < cdName.length; i++) {
				 if(trdCd == cdTrdCd[i]){
					 cdDesc += "|" + cdName[i];
					 cd += "|" + cdValue[i];
				 }
			 }
			 for (var i=0; i < cdName.length; i++) {
				 if("COM" == cdTrdCd[i]){
					 cdDesc += "|" + cdName[i];
					 cd += "|" + cdValue[i];
				 }
			 }
		 }else{
			 for (var i=0; i < cdName.length; i++) {
				 if(trdCd == cdTrdCd[i]){
					 cdDesc += "|" + cdName[i];
					 cd += "|" + cdValue[i];
				 }
			 }
		 }
		 sheetObj.CellComboItem(Row,prefix+"sub_trd_cd", {ComboText:cdDesc, ComboCode:cd} );
		 sheetObj.SetCellValue(Row, prefix+"sub_trd_cd","",0);
	 }
    /**
     * handling process for input validation
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
    	case SEARCH02:
    		if( formObj.rqst_no.value == ''){    		
	    		if(formObj.rlane_cd.value == "" || formObj.rlane_cd.value == null){
	    			ComShowCodeMessage("CCD00001", "Revenue Lane Code");
	    			formObj.rlane_cd.focus();
	    			return false;
	    		}
    		}
    		break;
    	case MULTI01:
    		if(ComTrimAll(formObj.rlane_cd.value) == "" || formObj.rlane_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Revenue Lane Code");
//    			formObj.rlane_cd.focus();
    			return false;
    		}
    		if(ComTrimAll(formObj.rlane_nm.value) == "" || formObj.rlane_nm.value == null){
    			ComShowCodeMessage("CCD00001", "Name");
//    			formObj.rlane_nm.focus();
    			return false;
    		}
    		if(ComTrimAll(rep_trd_cd.GetSelectCode()) == "" || rep_trd_cd.GetSelectCode()== null){
    			ComShowCodeMessage("CCD00001", "Representative Trade");
//    			formObj.rep_trd_cd.focus();
    			return false;
    		}
    		if(ComTrimAll(formObj.vsl_slan_cd.value) == "" || formObj.vsl_slan_cd.value == null){
    			ComShowCodeMessage("CCD00001", "Vessel Service Lane");
//    			formObj.vsl_slan_cd.focus();
    			return false;
    		}
    		var cnt=0;
    		for(var i=sheetObj.LastRow(); i > 0; i--){
    			if("U" == sheetObj.GetCellValue(i, prefix+"ibflag") || "I" == sheetObj.GetCellValue(i, prefix+"ibflag") || "D" == sheetObj.GetCellValue(i, prefix+"ibflag")){
    				cnt++;
    				if(chkSheetVal(sheetObj, i)){
               		 	return false;
               	 	}
    			}
    			
    			if(sheetObj.GetCellValue(i, prefix+"dmnt_leg_flg") == ""){
    				ComShowCodeMessage("CCD00001", "Dominant Leg Flag");
    				sheetObj.SelectCell(i, prefix+"dmnt_leg_flg");
    				return false;
    			}
    		}
    		
			if(cnt > 0 && !(sheetObj.GetSaveString(false, true, prefix+"ibflag"))){
				return false;
			}
    		break;
    	}
    	return true;
    }
	function initControl() {
		var formObj=document.form;
//		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('change', 'obj_change', formObj);
//		axon_event.addListenerForm('keypress', 'obj_keypress', form);
//		axon_event.addListenerForm('keyup', 'obj_keyup', form); 	
//		axon_event.addListenerForm('keydown', 'obj_keydown', form); 
//		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}
    /**
    * HTML Object OnKeyPress event handling
    */
   function obj_keypress(event) {
     	obj=ComGetEvent();
     	keyValidation(obj);
    }
    /**
    * If the data field to be the CHANGE Event
    */
   function obj_change(){
	   	var formObj=document.form;
	   	try {
	   		var srcName=ComGetEvent("name");
	           switch(srcName) {
	           	case "rlane_cd":
	           		if(formObj.rlane_cd.value.length>0){
	           			doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
	           		}
	           	break;
	           	case "vsl_slan_cd":
	           		if(formObj.vsl_slan_cd.value.length>0){
	           			doActionIBSheet(sheetObjects[0], formObj, SEARCH03);
	           		}
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
     * sheet1 add row
     */
    function addRow() {
    	with (sheetObjects[0]) {
    		var nowRow=GetSelectRow();
         	nowRow=DataInsert(-1);
         	SetCellValue(nowRow, prefix+"dtl_delt_flg","N",0);
//         	SetCellValue(nowRow, prefix+"dmnt_leg_flg","N",0);
         	SetCellValue(nowRow, prefix+"flg","Y",0);
         	return true;
        }
    }
     /**
		 * sheet1 delete row
		 */
    function deleteRow() {
        with (sheetObjects[0]) {
            var sRowStr=FindCheckedRow(prefix+"del_chk");
            if(sRowStr == "")
            	return;
            var arr=sRowStr.split("|");
            var len = 0;
            for (var i=0; i < arr.length; i++) {
            	var idx = arr[i] - len;
            	if (GetCellValue(idx, prefix+"flg") == "Y") {
                    RowDelete(idx);
                    len++;
                }else{
	            	SetRowStatus(idx,"D");
	            	SetRowHidden(idx,1);
                }
            }
        }         
    }
      function get_sLaneCd(rowArray) {
    		var sheetObj=sheetObjects[0];
    	    var formObj=document.form;
    	   	var colArray=rowArray[0];
    		formObj.vsl_slan_cd.value=colArray[3];
    	}
      function get_rLaneCd(rowArray) {
  		var sheetObj=sheetObjects[0];
  	    var formObj=document.form;
  	   	var colArray=rowArray[0];
  		formObj.rlane_cd.value=colArray[2];
  		if(formObj.rlane_cd.value != ""){
  			doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
  		}
  	}
	  function delt_flg_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
	  	if(comboObj.GetSelectCode()== "Y"){
	  		  if(!ComShowCodeConfirm("COM130301", "data")) comboObj.SetSelectCode("N",false);
	      }
	  }
	  function getValueForCombo(obj) {
		  if (Object.prototype.toString.call(obj) === '[object Array]') {
			  var str = obj[0];
			  return str.split('|')[0];
		  }
		  return obj;
	  }      