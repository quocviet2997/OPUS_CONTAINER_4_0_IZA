/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0Y1.js
*@FileTitle  : (India)Inquiry for GST Collected in Other Offices
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/12
* History
* 2010.11.08 김영철 [CHM-201007559-01] 칼럼명 변경 : Effactive Date => Effective Date
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
	/**
	 * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
	 * @author 한진해운
	 */
	/**
	 * @extends 
	 * @class FNS_INV_0069 : FNS_INV_0069 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
	 */
	function FNS_INV_0069() {
		this.processButtonClick=tprocessButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.validateForm=validateForm;
	}
var sheetObjects=new Array();
var sheetCnt=0;
//IBMultiCombo
var comboObjects=new Array();
var combo1=null;
var comboCnt=0;
document.onclick=processButtonClick;
    function processButtonClick(){
         var sheetObject=sheetObjects[0];
         var sheetObject1=sheetObjects[1];
         /*******************************************************/
         var formObject=document.form;
         var sub_sys_cd=formObject.sub_sys_cd.value;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
        	    case "btn_Retrieve":
        	    	doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btn_New":
    	            sheetObject.RemoveAll();
    	            formObject.reset();
        	        break;
        	    //달력    
	 			case "btns_Calendar2" :		// Agreement Date (To Date)
					var cal=new ComCalendar();
		         	cal.select(formObject.inv_eff_dt, 'yyyy-MM-dd');
	 	    		break;
				case "btn_ofc_cd":
					var hq = ar_hd_qtr_ofc_cd.GetSelectCode();
					if(hq == 'ALL') hq='';
					ComOpenPopupWithTarget('/opuscntr/viewOrg.do?rhq='+hq, 700, 500, "ofc_cd:ofc_cd", "0,1,1", true);
					break;
				case "btn_DownExcel":
					if(sheetObject.RowCount() < 1){//no data	
						ComShowCodeMessage("COM132501");
					}else{	
//						 sheetObj.Down2Excel({ HiddenColumn:{HiddenColumn:-1}});
						sheetObject.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1 });
					}	
					
 					break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(getMsg("COM12111"));
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
 	/** 
 	 * IBSheet Object를 sheetObjects 배열로 등록 <br>
 	 * <br><b>Example :</b>
 	 * <pre>
 	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
 	 * 배열은 소스 상단에 정의
 	 * </pre>
 	 * @param  {IBSheet} sheetObj IBSheet Object
 	 * @return 없음
 	 * @see #
 	 * @author 함대성
 	 * @version 2010.07.19
 	 */
 	function setSheetObject(sheet_obj){
 		sheetObjects[sheetCnt++]=sheet_obj;
 	}
    /** 
    * body 태그의 onLoad 이벤트핸들러 구현 <br>
    * <br><b>Example :</b>
	 * <pre>
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 * </pre>
	 * @param 없음
	 * @return 없음
	 * @see #
	 * @author 함대성
	 * @version 2010.07.19
	 */
 	function setComboObject(combo_obj){
 		comboObjects[comboCnt++]=combo_obj;
 	}     
    /**
     * Sheet ?? ???? ?? ????
     * body ?±??? onLoad ??????? ????
     * ????? ?????? ?ε??? ?Ŀ? ??o????? ??? ????? ??????
     */
    function loadPage() {
 		sheet1=sheetObjects[0];
		sheetCnt=sheetObjects.length ;
		// combo
		combo1=comboObjects[1];
		comboCnt=comboObjects.length;
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
		//IBMultiCombo초기화
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}		
		initControl();
		sheet1_OnLoadFinish(sheet1);
    }
 	/** 
 	 * 페이지에 생성된 IBCombo Object를 comboObjects 배열에 등록 <br>
 	 * <br><b>Example :</b>
 	 * <pre>
 	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
 	 * 배열은 소스 상단에 정의
 	 * </pre>
 	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
 	 * @return 없음
 	 * @see #
 	 * @author 함대성
 	 * @version 2010.07.19
 	 */
   	function initCombo(comboObj, comboNo) {
 		switch (comboObj.options.id) {
 			case "ar_hd_qtr_ofc_cd":
 				with (comboObj) {
 				SetColAlign(0, "left");
 				SetColWidth(0, "50");
 	                //SetTitle("Office Code");
 					SetMultiSelect(0);
 					SetUseAutoComplete(1);
 					SetDropHeight(200);
 					SetMaxLength(6);
 				}
 				break;
 			/*	
 			case "ofc_cd":
 				with (comboObj) {
SetColAlign(0, "left");
SetColWidth(0, "100");
SetColWidth(1, "150");
 					SetTitle("Office Code|Office Name");
 					SetMultiSelect(0);
 					SetUseAutoComplete(1);
 					SetDropHeight(200);
 //no support[check again]CLT 					ValidChar(2,1);
 					SetMaxLength(6);
 				}
 				break;
 			*/
 		}
   	}
     function initControl() {
     	//** Date 구분자 **/
     	DATE_SEPARATOR="/";
     	var formObj=document.form; 
//     	axon_event.addListenerForm  ('keypress', 'obj_keypress',  formObj );
        axon_event.addListenerForm  ('change',	 'obj_change',	formObj); //- 변경될때.
      }
   /**
     * ??? ???????, ??? ????
     * param : sheetObj ==> ??????????, sheetNo ==> ?????????? ?±??? ????? ???? ??u??
     * ????? ????? ??? ??? ????? case?? ?????? ??? ????????? ???????
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with(sheetObj){
		                
//		              (16, 0, 0, true);
		              var HeadTitle="Seq.||RHQ|OFC|Module|CSR NO|Invoice Date|Effective Date|Curr|INV AMT|Unapproval ID|Unapproval Name|CSR Cre Date|CSR RQST Date|Cre User ID|Cre User Name" ;
		
		              SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );
		
		              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
		              var headers = [ { Text:HeadTitle, Align:"Center"} ];
		              InitHeaders(headers, info);
		
		              var cols = [ {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
		                     {Type:"Status",    Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"ar_hd_qtr_ofc_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"sub_sys_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"csr_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Date",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"inv_dt",            KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"gl_dt",             KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Float",     Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"apro_ttl_amt",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"apro_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Date",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"apro_usr_nm",       KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cre_dt",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                     {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"rqst_st_dt",        KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:2 },
		                     {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"usr_nm",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		               
		              InitColumns(cols);
		
		              SetEditable(1);
		              SetColHidden(1,1);
		              SetSheetHeight(420);
              }
             break;
        }
    }
  	/** 
      * Object 의 Keypress 이벤트에 대한 처리  <br>
      * 객체의 dataformat 에 따라 입력값에 대한 유효성을 체크한다.  <br>
      * @param  없음
      * @return 없음
      * @author 최민회
      * @version 2009.05.20
      */ 
//     function obj_keypress(){
//  		var formObj=document.form;
//    	var srcName=ComGetEvent("name");
//    	var srcValue=window.event.srcElement.getAttribute("value");
//    	if(srcName == "csr_no"){
//    		if(event.keyCode == 13){
//	    		if(!ComIsNull(srcValue)){
//	    			formObj.elements[srcName].value=srcValue.toUpperCase();
//	    			ComKeyEnter();
//	    			return;
//		    	}	 
//    		}
//    	} 
//    	 obj=event.srcElement;
//    	 if(obj.dataformat == null) return;
//    	 window.defaultStatus=obj.dataformat;
//    	 switch(obj.dataformat) {
//    	 	case "ymd":
//    	 		ComKeyOnlyNumber(obj);
//    	        break;
//    	    case "eng":
//    	    	if(obj.name=="sts_evnt_yd_cd") ComKeyOnlyAlphabet('uppernum')
//    	        else ComKeyOnlyAlphabet('upper');
//    	        break;
//    	    case "engup":
//    	        if(obj.name=="eq_no") ComKeyOnlyAlphabet('uppernum')
//    	        else ComKeyOnlyAlphabet('upper');
//    	        break;
//    	 }
//     } 
   	function obj_change(){
		var obj=event.srcElement;
		var formObj=document.form;
		if ( ComTrim(obj.value) != "" ) {
			switch(ComGetEvent("name")) {
	    		case "sub_sys_cd":
	    			//
				break;
			}
	    }
	}
    function sheet1_OnSaveEnd() {
    	var sheetObj=sheetObjects[0];
    	for(var i=0; i<sheetObj.RowCount(); i++) {
    		if(sheetObj.GetCellValue(i + 1, "appyn") == "Y") {
                sheetObj.SetCellEditable(i + 1, "checkbox",0);
                sheetObj.SetCellEditable(i + 1, "apro_rmk",0);
            }
        }
    }
    function sheet1_OnChange(sheetObj , row , col, value)
    {
    	var formObj=document.form;
		var sName=sheetObj.ColSaveName(col);
		var rows=sheetObj.LastRow();
    }
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
        case IBSEARCH:        //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                formObj.f_cmd.value=SEARCHLIST;
                selectVal=FormQueryString(formObj)
                sheetObj.DoSearch("COM_ENS_0Y1GS.do", selectVal );
           break;
           case IBDOWNEXCEL: 
        	   sheetObj.Down2Excel({ HiddenColumn:-1,Merge:true});
              break;
			case IBSEARCH_ASYNC10: // 화면 로딩시 AR Office 조회
				formObj.f_cmd.value=SEARCH01;
				var sXml=sheetObj.GetSearchData("COM_ENS_0Y1GS.do", FormQueryString(formObj));
				var sStr=ComGetEtcData(sXml,"ar_hd_qtr_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject(ar_hd_qtr_ofc_cd, arrStr);
			break;
			case IBSEARCH_ASYNC11: // 화면 로딩시 Office 조회
				formObj.f_cmd.value=SEARCH02;
				var sXml=sheetObj.GetSearchData("COM_ENS_0Y1GS.do", FormQueryString(formObj));
				var aXml=sXml.split("|$$|");
				ComXml2ComboItem( aXml[0], ofc_cd    , "ofc_cd","ofc_cd" ); 
				//ofc_cd.InsertItem(0,"ALL","ALL");
			 	with (ofc_cd) {
			 		SetMultiSelect(1);
			 		SetMultiSeparator(",");
			 		SetDropHeight(320);
			 		InsertItem(0 ,'ALL','ALL');
			 	}
				// 2010-07-30 추가
				if(sheetObj.RowCount()> 0)
		    		sheetObj.RemoveAll();
			break;
        }
    }
	/**
    * Lease Term  클릭 이벤트 등록
   */       
   function ofc_cd_OnCheckClick(comboObj, index, code) {
   	if(index==0) { 	    	
   		var bChk=comboObj.GetItemCheck(index);
   		if(bChk){
   			for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
   				comboObj.SetItemCheck(i,0);
   			}
   		}
   	} else {
   		comboObj.SetItemCheck(0,0);
   	}
   }
   /**
     * valid
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(iPage)) {
//
//                return false;
//            }
        }
        return true;
    }
    function releasePage() {
    	event.returnValue="If you navigate away from this page now, the approval can't be completed successfully."
    }
    /** 
	 * OnLoadFinish 이벤트 발생시 호출되는 function <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
    * @param {ibsheet} sheetObj 필수 IBSheet Object        
    * @return 없음
    * @see #
    * @author 함대성
    * @version 2010.07.19
    */  	
    function sheet1_OnLoadFinish(sheetObj){
		var formObj=document.form;
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC10);
		//JOO 모듈 추가 
		addOption('sub_sys_cd','JOO','JOO');
		addOption('sub_sys_cd','FMS','FMS');
    }

    function ar_hd_qtr_ofc_cd_OnChange(sheetObj)
    {
    	var formObj=document.form;
    	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC11);
    	ofc_cd.SetSelectCode("ALL");
    }
    function ofc_cd_OnChange(comboObj, indexCode, text) {
    	var sheetObj=sheetObjects[0];
    	if(sheetObj.RowCount()> 0)
    		sheetObj.RemoveAll();
    }
	function addOption(selectId, oText, oValue){	//옵션추가
		var objSelect=document.getElementById(selectId);
		var objOption=document.createElement('option');
		objOption.text=oText;
		objOption.value=oValue;
		objSelect.options.add(objOption);
	}
	/** 
	 * 화면 초기화<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return 없음
	 * @see #
	 * @author 함대성
	 * @version 2010.07.19
	 */
	function removeAll(formObj) {
		formObj.reset();
		sheetObjects[0].RemoveAll();
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
		doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC11);
	}
	/** 
	 * office code select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.08.10
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var ar_hd_qtr_ofc_cd='';
			if (arrStr[i] != '') {
				ar_hd_qtr_ofc_cd=arrStr[i];
			}
			cmbObj.InsertItem(i-1, ar_hd_qtr_ofc_cd, ar_hd_qtr_ofc_cd);
		}
		cmbObj.SetSelectCode(arrStr[1]);
		cmbObj.SetBackColor("#CCFFFD");
	}
