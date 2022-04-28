/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_1035.js
*@FileTitle  : customer
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;

var custTypeName = "";
var custTypeValue = "";

/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         var sheetObject=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
                case "btn_Close":
                	ComClosePopup(); 
        	        break;
        	    case "btn_OK":
 //       	    	comPopupOK();
        	    	ComPopUpReturnValue("Y");
        	    	ComClosePopup(); 
        	        break;
           	    case "btn_Check":
           	     doActionIBSheet(sheetObject,formObject,IBSEARCH);
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
    function initControl() {
    	var formObject=document.form;
        //Axon 이벤트 처리1. 이벤트catch(개발자변경)
        axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
        axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
    }
  //업무 자바스크립트 OnKeyPress 이벤트 처리
    
    /**
     * IBSheet Object를 배열로 등록
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * Sheet 기본 설정 및 초기화
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
    function loadPage() {
    	doActionIBCombo(sheetObjects[0], document.form, SEARCH01);
    	for (i=0; i < sheetObjects.length; i++) {
 			ComConfigSheet(sheetObjects[i]);
 			initSheet(sheetObjects[i], i + 1);
 			ComEndConfigSheet(sheetObjects[i]);
 		}
        initControl();
        if(ComGetObjValue(document.form.rqst_no) == '') {
        	ComSetDisplay('btn_OK', true);
        	//ComSetDisplay('btn_OK_Line', true);
        }
        doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
        if (document.form.cust_cnt_cd.value == "AA") {
        	document.form.cust_cnt_cd.value ="";
        }
    }
   /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with (sheetObj) {
                var HeadTitle="Seq.|Code|Name|Address|Location|Tax Payer ID|Office|Customer Type" ;
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Text",      Hidden:0,  Width:180,  Align:"Left",    ColMerge:0,   SaveName:"cust_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"bzet_addr",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"loc_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cust_rgst_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                       {Type:"Combo",     Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"cntr_cust_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }
	                       ];
                InitColumns(cols);
                SetEditable(1);
                SetSheetHeight(220);
                SetColProperty("cntr_cust_tp_cd", {ComboText: custTypeName, ComboCode: custTypeValue});
               }
                break;
        }
    }
    
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey) {
		switch (sAction) {
			case SEARCH01: // load page 시
				var sXml=sheetObj.GetSearchData("BCM_CCD_1035GS.do", "f_cmd=" + SEARCH01);
				var rtnValue=sXml.split("|$$|");
				for(var i=0; i<rtnValue.length; i++){
					var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
					var cdName=comboXml[0];
					var cdValue=comboXml[1];
				}
				custTypeName = cdName;
				custTypeValue = cdValue;
				break;
		}
   	}
    
//    function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
//       // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.zz
//       doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
//    } 
  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //조회
                if(validateForm(sheetObj,formObj,sAction)) {
                	 formObj.f_cmd.value=SEARCH;
                     selectVal=FormQueryString(formObj);
                     var sXml=sheetObj.GetSearchData("BCM_CCD_1035GS.do", selectVal);
                     sheetObjects[0].LoadSearchData(sXml,{Sync:1} );
                }else{
                	return true;
                }
           break;
//           case IBSEARCHAPPEND:  // 페이징 조회
//           
//                formObj.f_cmd.value = SEARCH;         
//                sheetObj.DoSearch4Post("BCM_CCD_1035GS.do", selectVal, "iPage=" + PageNo, true);  
//           break;
        }
    }
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
    	switch(sAction) {
    		case IBSEARCH :
//    			if (ComIsNull(formObj.cust_nm.value) && ComIsNull(formObj.cust_cnt_cd.value) && ComIsNull(formObj.loc_cd.value)) {
//    				ComShowCodeMessage("CCD00043", "Name, Country, Location");
//    				formObj.cust_nm.focus();
//                    return false;
//    			}
//    			if (ComIsNull(formObj.cust_cnt_cd.value) && ComIsNull(formObj.loc_cd.value)) {
    				if (ComTrimAll(formObj.cust_nm.value).length < 3) {
	    				ComShowCodeMessage("CCD00075", "Name", "3");
	    				formObj.cust_nm.focus();
	    				return false;
    				}
//    			}
    			break;
    	}
        return true;
    }
    
    function comPopupOK() {
//    	if(!opener){
//		  opener=window;
//    	}
    	//@@2014-12-02버그수정 
	   	var opener = window.dialogArguments;
		if (!opener) opener = window.opener;
		if (!opener) opener = parent;
		
		var formObject=document.form;
//    	opener.document.form.saveflag.value="Y";
    	opener.document.all[formObject.saveflag.value].value = "Y";
    	ComClosePopup(); 
     }
