/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_2002.js
*@FileTitle  : BCM_CCD_2002
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author 
     */
    /**
     * @extends 
     * @class BCM_CCD_2002 : BCM_CCD_2002 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
   	/* 개발자 작업	*/
	// 공통전역변수
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var prefix="sheet1_";
	var prefix2="sheet2_";
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick() {
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		/** **************************************************** */
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
				case "btns_calendar": //달력 버튼
         			var cal=new ComCalendarFromTo();
                    cal.select(formObj.fm_rqst_dt, formObj.to_rqst_dt, 'yyyy-MM-dd');
					break;
				case "btn_Retrieve":
					doActionIBSheet(sheetObject, formObj, SEARCH);
					break;
				case "btn_Approval":
				    doActionIBSheet(sheetObject, formObj, MULTI01);
					break;
				case "btn_Reject":
					doActionIBSheet(sheetObject, formObj, MULTI02);
					break;	
				case "btn_Delete":
					doActionIBSheet(sheetObject2, formObj, REMOVE);
					break;
				case "btn_ReOpen":
					doActionIBSheet(sheetObject2, formObj, MULTI03);
					break;
				case "btn_New":
					doActionIBSheet(sheetObject, formObj, IBCLEAR);
				    break;		
				case "btn_com_ens_091":
					var param="";
		    		param=param + "&" + "srep_cd=" + form.usr_id.value;
		    		ComOpenPopup('/opuscntr/COM_ENS_091.do?' + param, 780, 550, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
					break;
				case "btn_downexcel":
					if(sheetObject.RowCount() < 1) { //no data	
						ComShowCodeMessage("COM132501");
					}else{					
						sheetObject.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1 });
					}
 					break;
		        case "btns_search2":  // Country
		  			var formObj=document.form;
		         	var sUrl="COM_ENS_0M1.do?cnt_cd=" + formObj.cnt_cd.value +"&main_page=false";
		         	var rVal=ComOpenPopup(sUrl, 770, 500, "getCOM_ENS_0M1_cnt_cd", "0,0", true);
		            break;		
	                   
                case "btns_search4": // Request Office 
                    var formObj=document.form;
                    var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.ofc_cd.value +"&main_page=false";
                    var rVal=ComOpenPopup(sUrl, 600, 600, "ofcCodeHelp", "0,0", true);
                    break;
                    
                case "btns_search5": // Admin Office 
                    var formObj=document.form;
                    var sUrl="/opuscntr/COM_ENS_071.do?ofc_cd=" + formObj.adm_ofc_cd.value +"&main_page=false";
                    var rVal=ComOpenPopup(sUrl, 600, 600, "ofcCodeHelpAdm", "0,0", true);
                    break;  	                    
			} 
		} catch (e) {
			if (e == "[object Error]") {
				ComShowCodeMessage("COM12111");
			} else {
				ComShowMessage(e.message);
			}
		}
	} 

	/**
	 * IBSheet Object를 배열로 등록
	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	 * 배열은 소스 상단에 정의
	 */
	function setSheetObject(sheet_obj) {
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	 /**  
	  	 * IBCombo Object를 배열로 등록
	  	 * @param	{IBMultiCombo}	combo_obj	화면에서 사용할 콤보들을 추가한다. 
	  	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	  	 * 배열은 소스 상단에 정의
	  	 */ 
	  	function setComboObject(combo_obj){	     
	      	comboObjects[comboCnt++]=combo_obj;  
	  	} 
	/**
	 * Sheet 기본 설정 및 초기화
	 * body 태그의 onLoad 이벤트핸들러 구현
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 */
	function loadPage() {
		var formObj=document.form;
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		doActionIBCombo(sheetObjects[0], formObj, SEARCH01);
		doActionIBSheet(sheetObjects[0], formObj, IBCLEAR);
		var fmRqstDt=ComGetDateAdd(null, "D", -3);
		var toRqstDt=ComGetNowInfo();
		ComSetObjValue(formObj.fm_rqst_dt, fmRqstDt);
		ComSetObjValue(formObj.to_rqst_dt, toRqstDt);
		doActionIBSheet(sheetObjects[0], formObj, SEARCH02);
		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
	}
	/**
	 * 페이지에 있는 HTML Control의 이벤트를 동적으로 로드한다. <br>
	 * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {int}
	 *            sheetNo sheetObjects 배열에서 순번
	 */
	function initControl() {
		var formObj=document.form;
		//Axon 이벤트 처리1. 이벤트catch(개발자변경)
//		axon_event.addListenerForm('change', 'obj_change', form);
//		axon_event.addListenerForm('blur',			'obj_blur',		document.form);
//		axon_event.addListenerFormat('focus',		'obj_focus',	document.form); //- 포커스 들어갈때
//	    axon_event.addListenerFormat('keypress',	'obj_keypress', formObj); //- 키보드 입력할때
//	    axon_event.addListener('keydown', 'ComKeyEnter', 'form');
//	    axon_event.addListener  ('keyup'  , 'obj_keyup', 'cust_cd', 'addr_tp_cd');
//	    ComClearSeparator (formObject.cust_cd,"eng"); //한글 변환 키 막기 
	}
	//포커스가 나갈 때
    function obj_blur(){
        //입력Validation 확인하기 + 마스크구분자 넣기
        var obj=event.srcElement;
        if(obj.name == 'fm_rqst_dt' || obj.name == 'to_rqst_dt') {
        	ComChkObjValid(obj);
        }
    }
    /**
     * HTML Control Foucs in
     */
//    function obj_focus(){
//   	 var obj=event.srcElement;
//        ComClearSeparator(obj);
//        //글자가 있는 경우 블럭으로 선택할수 있도록 한다.
//        if (obj.getAttribute("isContentEditable") && obj.getAttribute("value") != null && obj.value.length >=1 ) obj.select();
//    }
	/**
	 * CustomerCode, AddressType 입력시 자동조회. <br>
	 **/
//    function obj_keyup() {
//    	var keyValue=event.keyCode;
//    	var formObj=document.form;
//    	if(formObj.cust_cd.value != "" && formObj.addr_tp_cd.GetSelectCode()!= ""){
//    		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
//    	}
//    }
//    function obj_focus() {
//      	if(event.srcElement.options){
//      		event.srcElement.focus();
//      	}else{
//      		event.srcElement.select();
//      	}
//    }
	/**
     * 필드 데이타가 CHANGE될 경우 이벤트
     */
    function obj_change(){
    	var formObject=document.form;
        /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한다 *****/
        var sheetObject1=sheetObjects[0];
        /*******************************************************/
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
            	case "cust_cd":	
            		if(formObject.cust_cd.value.length>0){
              			if(!ComIsNumber(formObject.cust_cd.value.substring(2,formObject.cust_cd.value.length))){
        		        	formObject.cust_cd.value="";
        		        	ComShowCodeMessage("COM130402", "Customer Code"); 	
        		        	ComSetFocus(document.form.cust_cd);	
        		        	return false;
              			}
          			         doActionIBSheet(sheetObject1, formObject, SEARCH04);
    		         }
            		break;
            	
            	// Country	
                case "cnt_cd":
                    if(formObject.cnt_cd.value.length>0){
                    	
                        doActionIBSheet(sheetObject1, formObject, SEARCH06);
                    }
                break;
                 
                case "ofc_cd":  // Reqeust AOffice 
                    if(formObject.ofc_cd.value.length>0){
                        doActionIBSheet(sheetObject1, formObject, SEARCH07);
                    }                  
                break;    
                
                case "adm_ofc_cd":  // adm Office 
                    if(formObject.adm_ofc_cd.value.length>0){
                        doActionIBSheet(sheetObject1, formObject, SEARCH08);
                    }                  
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
	  * 키보드가 눌릴 때 dataformat으로 세팅하고 엔터키를 누를때 조회한다.
	 * @author  
	  */
//	  function obj_keypress() {
//		 	obj=event.srcElement;	 	
//		 	keyValidation(obj);  
//	 }
	/**
	 * 시트 초기설정값, 헤더 정의
	 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
	 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
	 */
	function initSheet(sheetObj, sheetNo) {
		var cnt=0;
		var sheetId=sheetObj.id;
		switch (sheetId) {
			case "sheet1":
			    with(sheetObj){
				      var HeadTitle1="|Sel|Seq.|Request No|Subject|Req. Office|Requester|Code|Name|Req. Date(GMT)|Status|By|Action Date(GMT)|Country|Office|Comment";
				      var headCount=ComCountHeadTitle(HeadTitle1) + 4;
		
				      SetConfig( { SearchMode:2, FrozenCol:SaveNameCol(prefix+"mst_dat_subj_desc"), MergeSheet:5, Page:20, DataRowMerge:1 } );
		
				      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				      InitHeaders(headers, info);
		
				      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
				             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix+"chk" },
				             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"seq" },
				             {Type:"Popup",     Hidden:0, Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"mst_dat_subj_desc", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"rqst_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_cre_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"proc_tp_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"apro_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"proc_upd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:70,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cnt_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,  Align:"Center",  ColMerge:0,   SaveName:prefix+"ofc_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:prefix+"rmk",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"proc_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"auth_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_dtl_pgm_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"mst_dat_subj_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rqst_usr_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 }];
				       
				      InitColumns(cols);
		
				      SetEditable(1);
				      FrozenCols=SaveNameCol(prefix+"mst_dat_subj_desc");
				      SetShowButtonImage(2);
				      SetSheetHeight(225);
				      SetHighlightAfterSort(0);
		      }
				break;
			case "sheet2":
			    with(sheetObj){				        
				      var HeadTitle1="|Sel|Seq.|Request No|Subject|Req. Office|Requester|Code|Name|Req. Date(GMT)|Status|By|Action Date(GMT)|Comment";
				      var headCount=ComCountHeadTitle(HeadTitle1) + 4;
		
				      SetConfig( { SearchMode:2, FrozenCol:SaveNameCol(prefix2+"mst_dat_subj_desc"), MergeSheet:5, Page:20, DataRowMerge:1 } );		
				      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				      InitHeaders(headers, info);
		
				      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix2+"ibflag" },
				             {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:prefix2+"chk" },
				             {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"seq" },
				             {Type:"Popup",     Hidden:0, Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"rqst_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"mst_dat_subj_desc", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"rqst_ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"rqst_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"rqst_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix2+"rqst_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"rqst_cre_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"proc_tp_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"apro_usr_id",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"proc_upd_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:prefix2+"rmk",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix2+"proc_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix2+"auth_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix2+"rqst_dtl_pgm_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix2+"mst_dat_subj_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0 } ];
				       
				      InitColumns(cols);		
				      SetEditable(1);
				      FrozenCols=SaveNameCol(prefix2+"mst_dat_subj_desc");
				      SetShowButtonImage(2);
				      //SetSheetHeight(225);
				      resizeSheet();
				      SetHighlightAfterSort(0);
			      }
				break;
		}
	}
	function resizeSheet(){
		ComResizeSheet(sheetObjects[1]);
	}
	/**
	 * Request List 그리드에서 Request No. 컬럼 더블클릭이나 팝업 이미지 클릭시
	 */    
 	function sheet1_OnPopupClick(sheetObj, row, col) {
 		var formObj=document.form;
 		var param="";
 		if (sheetObj.ColSaveName(col) == prefix+"rqst_no") {
			var rqstDtlPgmNo=sheetObj.GetCellValue(row, prefix+"rqst_dtl_pgm_no");
			var rqstNo=sheetObj.GetCellValue(row, prefix+"rqst_no");
			var procTpCd=sheetObj.GetCellValue(row, prefix+"proc_tp_cd");
 			var param='?rqst_no=' + rqstNo + '&proc_tp_cd=' + procTpCd;
 			var url=rqstDtlPgmNo + '_POP.do' + param;
// 			var returnVal=ComOpenPopup(url, 1025, 560, "", "0,0,1,1,1", true);
 			var returnVal=ComOpenPopup(url,  1200, 700,rqstDtlPgmNo, "0,0", true);
// 			var returnVal=ComOpenWindowCenter(url, rqstDtlPgmNo, 1025, 560, true, true);
 		}
 	}
 	/**
	 * Completion List 그리드에서 Request No. 컬럼 더블클릭이나 팝업 이미지 클릭시
	 */    
 	var selectedProcTpCd;
 	function sheet2_OnPopupClick(sheetObj, row, col) {
 		var formObj=document.form;
 		var param="";
 		if (sheetObj.ColSaveName(col) == prefix2+"rqst_no") {
			var mstDatSubjCd=sheetObj.GetCellValue(row, prefix2+"mst_dat_subj_cd");
			var rqstNo=sheetObj.GetCellValue(row, prefix2+"rqst_no");
			var rqstDtlPgmNo=sheetObj.GetCellValue(row, prefix2+"rqst_dtl_pgm_no");
			var rqstCd=sheetObj.GetCellValue(row, prefix2+"rqst_cd");
			var procTpCd=sheetObj.GetCellValue(row, prefix2+"proc_tp_cd");
			selectedProcTpCd = procTpCd;
			var rqstOfcCd=sheetObj.GetCellValue(row, prefix2+"rqst_ofc_cd");
 			var param='?rqst_no=' + rqstNo + '&cust_cd=' + rqstCd + '&proc_tp_cd=' + procTpCd + '&rqst_ofc_cd=' + rqstOfcCd;
 			if(procTpCd == 'R') {
				var rqstUsrId=sheetObj.GetCellValue(row, prefix2+"rqst_usr_id");
 				var loginUsrId=formObj.login_usr_id.value;
 				if(rqstUsrId == loginUsrId)
 					param=param + "&rqst_usr_chk=Y";
 			}
 			var url=rqstDtlPgmNo + '_POP.do' + param;
 			ComOpenPopup(url,  1200, 700,"rtnSheet2Popup", "0,0", true);
 		}
 	}
 	function rtnSheet2Popup(rtnVal){
 		if(selectedProcTpCd == 'R' && rtnVal == 'Y') {
 			doActionIBSheet(sheetObjects[0], document.form, SEARCH);
 		}
 	}
 	
	function sheet1_OnClick(sheetObj, Row, Col, CellX, CellY, CellW, CellH) {
	 	var colSaveNm=sheetObj.ColSaveName(Col);
		if(colSaveNm == prefix+"rmk") {
			ComShowMemoPad(sheetObj);
		}
		var authTpCd=sheetObj.GetCellValue(Row, prefix+"auth_tp_cd");
//		if(authTpCd == 'R') {
//			ComBtnDisable("btn_Approval");
//			ComBtnDisable("btn_Reject");
//		}else{
//			ComBtnEnable("btn_Approval");
//			ComBtnEnable("btn_Reject");
//		}
	}
	function sheet2_OnClick(sheetObj, Row, Col, CellX, CellY, CellW, CellH) {
	 	var colSaveNm=sheetObj.ColSaveName(Col);
		if(colSaveNm == prefix2+"rmk") {
			if(sheetObj.GetCellValue(Row, prefix2+'rmk') == '') return;
			//corr_rmk 셀을 더블클릭했을때 MemoPad를 표시한다.(MemoPad 편집가능)
			ComShowMemoPad(sheetObj, Row, Col, true);
		}
	}
	/*
	 * Grid에서 말풍선 처리
	 */
	function sheet1_OnMouseMove(sheetObj, Button, Shift, X, Y){
		with(sheetObj){
			Row=MouseRow();
			Col=MouseCol();
			if (Row > 0) {
				var ttText='';
				var colSaveNm=ColSaveName(Col);
				if(colSaveNm == prefix+'rmk') {	// Remark 전체내용을 보여줌
					var corrRmk=GetCellValue(Row, prefix+'rmk');
					if(corrRmk == '') return;
					ttText=corrRmk;
				}
//no support[check again]CLT 				MouseToolTipText=ttText;
			} else {
//no support[check again]CLT 				MouseToolTipText="";
			}
		}
	}
	/*
	 * Grid에서 말풍선 처리
	 */
	function sheet2_OnMouseMove(sheetObj, Button, Shift, X, Y){
		with(sheetObj){
			Row=MouseRow();
			Col=MouseCol();
			if (Row > 0) {
				var ttText='';
				var colSaveNm=ColSaveName(Col);
				if(colSaveNm == prefix2+'rmk') {	// Remark 전체내용을 보여줌
					var corrRmk=GetCellValue(Row, prefix2+'rmk');
					if(corrRmk == '') return;
					ttText=corrRmk;
				}
//no support[check again]CLT 				MouseToolTipText=ttText;
			} else {
//no support[check again]CLT 				MouseToolTipText="";
			}
		}
	}
	function getCOM_ENS_091(aryPopupData, Row, Col) {
		var sheetObj=sheetObjects[0];
		var formObj=document.form;
		if ( aryPopupData.length > 0 ) {
			sheetObj.SetCellValue(Row,prefix+"ofc_cd",aryPopupData[0][3]);
			sheetObj.SetCellValue(Row,prefix+"usr_id",aryPopupData[0][4]);
			sheetObj.SetCellValue(Row,prefix+"usr_nm",aryPopupData[0][5]);
		}
	}
	function getCOM_ENS_071(aryPopupData, Row, Col) {
        var sheetObj=sheetObjects[0];
		var formObj=document.form;
		if ( aryPopupData.length > 0 ) {
			sheetObj.SetCellValue(Row,prefix+"ofc_cd",aryPopupData[0][1]);
		}
	}
   /**
     * 모든 콤보 박스 조회
     * 공통 부분 완성되면 추가 작업 요
     */
	function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
		switch (sAction) {
			case SEARCH01: // load page 시
				var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", "f_cmd=" + SEARCH01);
	     		var arrXml=sXml.split("|$$|");
				if (arrXml.length > 0) {
					ComXml2ComboItem(arrXml[0], mst_dat_subj_cd, "cd", "cd_desc");
				}
				break;
     	}
	}
	// Sheet관련 프로세스 처리
	function doActionIBSheet(sheetObj, formObj, sAction, flag) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case SEARCH: //조회
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=SEARCH;
				sheetObj.SetWaitImageVisible(0);
	        	ComOpenWait(true);
	        	var sParam=FormQueryString(formObj);
	        	sParam += '&mdaa_chk=' + G_MDAA_CHK;
	    		var prefixArr=new Array(prefix, prefix2);
	    		var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam + "&" + ComGetPrefixParam(prefixArr));
	    		var rtnValue=sXml.split("|$$|");
	    		ComOpenWait(false);
	    		var sav=ComGetEtcData(rtnValue[0], "TRANS_RESULT_KEY");
	    		if(sav != "S" ) {
	    			//ComSetObjValue(formObj.auth_tp_cd, "");
	        		return;
	    		}
	    		sheetObj.LoadSearchData(rtnValue[0],{Sync:1} );
	    		sheetObjects[1].LoadSearchData(rtnValue[1],{Sync:1} );
				break;
			case SEARCH02: // MDAA Checking
				var param='f_cmd=' + SEARCH02;
				var xmlStr=sheetObj.GetSearchData("BCM_CCD_2002GS.do", param);
				var chkVal=ComGetEtcData(xmlStr, "MDAA_CHK");
				// global var setting
				G_MDAA_CHK=chkVal;
				break;		
				
		    case SEARCH06: // Country Code checking
		        if (validateForm(sheetObj, formObj, sAction)){
		            formObj.f_cmd.value=SEARCH06;
		            ComOpenWait(true);
		            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", FormQueryString(formObj));
		            var result=ComGetEtcData(sXml, "result");
		            if(result==""){
		                ComShowCodeMessage("COM130402", "Country Code");
		                formObj.cnt_cd.value="";
		                formObj.cnt_cd.focus();
		            }
		            ComOpenWait(false);
		        }
		        break;
		        
		    case SEARCH07:      //Control Office check
		        if(validateForm(sheetObj,formObj,sAction)){
		            ComOpenWait(true);
		            formObj.f_cmd.value=SEARCH07;
		            var sParam=FormQueryString(formObj);
		            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		            var result=ComGetEtcData(sXml, "result");
		            if(result==""){
		                ComShowCodeMessage("COM130402", "Reqeust Office");
		                formObj.ofc_cd.value="";
		            }
		            ComOpenWait(false);
		        }
		    break;	
		    
		    case SEARCH08:      //Admin Office check
		        if(validateForm(sheetObj,formObj,sAction)){
		            ComOpenWait(true);
		            formObj.f_cmd.value=SEARCH08;
		            var sParam=FormQueryString(formObj);
		            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
		            var result=ComGetEtcData(sXml, "result");
		            if(result==""){
		                ComShowCodeMessage("COM130402", "Admin Office");
		                formObj.adm_ofc_cd.value="";
		            }
		            ComOpenWait(false);
		        }
		    break;				    
		        
			case MULTI01: // approve
			case MULTI02: // reject
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}

				if(sAction == MULTI01) {
		            formObj.f_cmd.value=SEARCH05;
		        	var sParam_ = FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix + "ibflag");
		            var sXml = sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam_); // check Legacy Code(SAP ID)
		            var sav = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		            
		            if(sav == "F") { // Legacy Code(SAP ID) is not unique
		                ComShowCodeMessage("CCD00045");
		                break;
		            }
				}
				
				formObj.f_cmd.value=sAction;
				formObj.proc_tp_cd.value=(sAction == MULTI01) ? 'A' : 'R';
				var msg=(sAction == MULTI01) ? 'approve' : 'reject';
		        if(ComShowConfirm(ComGetMsg("CCD00032", msg))) {
		        	var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
		        	var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
         			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
         			var approvedRqst = ComGetEtcData(sXml, "approved_request");
         			if(result != "F"){
         				if(approvedRqst != "" && approvedRqst != null){
         					ComShowCodeMessage("CCD00046", approvedRqst);
         				}else{
         					if(sAction == MULTI01)
             					ComShowCodeMessage("CCD00026");
             				else
             					ComShowCodeMessage("CCD00028");
         				}
         				doActionIBSheet(sheetObj, formObj, SEARCH);
         			}
         			else{
         				ComShowCodeMessage("COM130103", "Data");
         			}
     			}
		        break;
			case REMOVE:
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				formObj.f_cmd.value=REMOVE;
		        var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(false, true, prefix2+"ibflag");
		        if(ComShowConfirm(ComGetMsg("CCD00023","delete"))) {
         			//ComOpenWait(true);
		        	var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
         			//ComOpenWait(false);
         			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
         			if(result != "F"){
         				ComShowCodeMessage("CCD00036");
         				doActionIBSheet(sheetObjects[0], formObj, SEARCH);
         			}else{
//         				sheetObj.LoadSaveXml(sXml);
         				ComShowCodeMessage("COM130103", "Data");
         			}
     			}
		        break;     
			case IBCLEAR:      //초기화
				ComResetAll();
				ComSetDisplay('btn_Approval', false);
				ComSetDisplay('btn_Reject', false);
				ComSetDisplay('btn_Delete', false);
				break;
		}	
	}
	/**
	 * Request List 그리드 데이터 조회후 처리
	 */
	function sheet1_OnSearchEnd(sheetObj, errMsg){
		 if(errMsg != '') {	// 저장 오류 발생
			 return;
		 }
		 var formObj=document.form;
		 var fCmd=formObj.f_cmd.value;
		 if(fCmd != SEARCH) return;
		 // Approval/Reject 버튼 보임/숨김 처리
		 var showFlag=false;
		 var cellBackColor="#FFFF00";
		 for(var i = sheetObj.HeaderRows(); i <= sheetObj.SearchRows(); i++) {
			 if(sheetObj.GetCellValue(i, prefix+"apro_usr_id") != '') {
				sheetObj.SetRowBackColor(i,cellBackColor);
			}
			 var authTpCd=sheetObj.GetCellValue(i, prefix+"auth_tp_cd");
			if(authTpCd != 'R') {
				showFlag=true;
				sheetObj.SetCellEditable(i, prefix+"chk", 1);
			}else{
				sheetObj.SetCellEditable(i, prefix+"chk", 0);
			}
		 }
		 if(G_MDAA_CHK == 'Y') showFlag=true;
		 ComSetDisplay('btn_Approval', showFlag);
		 ComSetDisplay('btn_Reject', showFlag);
		 
		 if(sheetObj.SearchRows() > 0){
			 sheet1_OnClick(sheetObj, 1, 1);
		 }
		 
   }
	/**
	 * Completion List 그리드 데이터 조회후 처리
	 */
	function sheet2_OnSearchEnd(sheetObj, errMsg){
		 if(errMsg != '') {	// 저장 오류 발생
			 //alert(errMsg);
			 return;
		 }
		 var formObj=document.form;
		 var fCmd=formObj.f_cmd.value;
		 if(fCmd != SEARCH) return;
		 // Del/Re-Open 버튼 보임/숨김 처리
		 var showFlag=false; 
		 var cellFontColor="#FF0000";
		 var cellBackColor="#FFFF00";
		 for(var i=sheetObj.GetTopRow(); i <= sheetObj.SearchRows(); i++) {
			 var authTpCd=sheetObj.GetCellValue(i, prefix2+"auth_tp_cd");
			if(authTpCd != 'A') {
				showFlag=true;
			}
			if(sheetObj.GetCellValue(i, prefix2+"proc_tp_cd") == 'R') {
				sheetObj.SetRowBackColor(i,cellBackColor);
				sheetObj.SetRowFontColor(i,cellFontColor);
			}
			
			if(authTpCd == 'R'){
				if(sheetObj.GetCellValue(i, prefix2+"proc_tp_cd") == 'R'){
					sheetObj.SetCellEditable(i, prefix2+"chk", 1);
				}else{
					sheetObj.SetCellEditable(i, prefix2+"chk", 0);
				}
			}
		 }
		ComSetDisplay('btn_Delete', showFlag);
  }
	/**
	 * 팝업에서 check 선택시 부모창으로 값을 전달. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {String}
	 *            value sheetObj의 입력값
	 */
	function chkCallPopupOK(sheetObj) {
		var formObj=document.form;
		var calllFunc;
		var rArray=null; // 행데이터를 담고 있는 배열
		// 단일선택(Radio) 또는 다중선택(CheckBox) 일 때..
		rArray=chkGetLocalCheckedRows(sheetObj);
		if(rArray == null) {
			ComShowCodeMessage("COM12114", "row");
			return;
		}
		calllFunc=formObj.calllFunc.value;
		opener.eval(calllFunc)(rArray);
		ComClosePopup(); 
	}
	//===================================================================================
	//UI Object Event Handler
	// ===================================================================================
	/**
	 * Carrier Code Pop up에서 읽기. <br>
	 * 
	 * @param {arry}
	 *            aryPopupData
	 * @return 없음
	 * @see
	 * @author 조원주
	 * @version 2010.02.17
	 */ 
	function setCallBack0B2(aryPopupData) {
		var form=document.form;
		form.usr_id.value=aryPopupData[0][4];
	}
	 /**
	 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		var lvFrmDate = formObj.fm_rqst_dt.value;
	    		var lvToDate = formObj.to_rqst_dt.value;
	    		if(lvFrmDate == "" || lvToDate == "") { 
	    			ComShowCodeMessage("COM130403", "Request Date");
	    			return false;
	    		}
	    		if (ComGetDaysBetween(lvFrmDate, lvToDate) < 0) {
	    			ComShowCodeMessage('COM12133', 'To date','From date','greater');
	    			formObj.to_rqst_dt.focus();
	    			return false;
	    		} else if (ComGetDaysBetween(lvFrmDate, lvToDate) > 30) {
	    			ComShowCodeMessage("COM132001", "Date", "30 days");
	    			formObj.to_rqst_dt.focus();
	    			return false;
	    		}
	    		break;
	    	case MULTI01: // Approval
	    	case MULTI02: // Reject
	    		if(sheetObj.CheckedRows(prefix+"chk") == 0) {
         			ComShowCodeMessage('COM12113', 'the row');
         			return false;
         		}
         		var chkRows=sheetObj.FindCheckedRow(prefix+"chk").split("|");
         		if(G_MDAA_CHK != 'Y') {
	         		for(var i=0; i < chkRows.length; i++) {
	         			var authTpCd=sheetObj.GetCellValue(chkRows[i], prefix+"auth_tp_cd");
	     				if(authTpCd == 'R') {
	     					ComShowCodeMessage('COM132201', 'Authority Type');
	     					sheetObj.SetSelectRow(chkRows[i]);
	     					return false;
	     				}
	         		}
         		}
         		if(sAction == MULTI02) {
         			for(var i=0; i < chkRows.length; i++) {
         				var rejecRmk=sheetObj.GetCellValue(chkRows[i], prefix+"rmk");
         				if(rejecRmk == '') {
         					ComShowCodeMessage('CCD00027');
         					sheetObj.SelectCell(chkRows[i], prefix+"rmk");
         					return false;
         				}
             		}
         		}
	            break;
		    case REMOVE: // Delete
	    		if(sheetObj.CheckedRows(prefix2+"chk") == 0) {
	    			ComShowCodeMessage('COM12113', 'the row');
         			return false;
         		}
         		var chkRows=sheetObj.FindCheckedRow(prefix2+"chk").split("|");
         		for(var i=0; i < chkRows.length; i++) {
         			// Reject Status 만 가능
         			var procTpCd=sheetObj.GetCellValue(chkRows[i], prefix2+"proc_tp_cd");
         			if(procTpCd != 'R') {
         				ComShowCodeMessage('COM132201', 'Status(only Reject)');
     					sheetObj.SetSelectRow(chkRows[i]);
     					return false;
     				}
         			if(G_MDAA_CHK != 'Y') {
         				var authTpCd=sheetObj.GetCellValue(chkRows[i], prefix2+"auth_tp_cd");
	     				if(authTpCd == 'A') { // Approval
	     					ComShowCodeMessage('COM132201', 'Authority Type');
	     					sheetObj.SetSelectRow(chkRows[i]);
	     					return false;
	     				}
         			}
         		}
	            break;
		 }
	    return true;
	}
	
	function getCOM_ENS_0M1_cnt_cd(rowArray) {    	
   		var formObj=document.form;
   		var colArray=rowArray[0];	
   		formObj.cnt_cd.value=colArray[1];			 
    }	
	
	function ofcCodeHelp(rowArray) {
	    var formObj=document.form;
	    var colArray=rowArray[0];   
	    formObj.ofc_cd.value=colArray[1];
	}	
	
	function ofcCodeHelpAdm(rowArray) {
	    var formObj=document.form;
	    var colArray=rowArray[0];   
	    formObj.adm_ofc_cd.value=colArray[1];
	}		
	/* 개발자 작업  끝 */
