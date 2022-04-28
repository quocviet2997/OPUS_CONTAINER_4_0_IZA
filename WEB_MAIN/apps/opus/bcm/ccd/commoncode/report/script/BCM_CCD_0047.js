/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0047.js
*@FileTitle  : Zone report
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0;  [조회]SEARCH=1; 
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author
     */
    /**
     * @extends 
     * @class BCM_CCD_0047 : BCM_CCD_0047 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    function BCM_CCD_0047() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
// 공통전역변수
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var prefix="sheet1_";
// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;

    // 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
        var formObj=document.form;
        try {
            var srcName=ComGetEvent("name");
            switch(srcName) {
	            case "btn_DownExcel":
					doActionIBSheet(sheetObjects[0],formObj,SEARCH);
					break;
	            case "btn_new":
	            	doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
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
     * IBSheet Object를 배열로 등록
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
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
        //페이지 로드시 선처리 기능을 호출한다.
        var formObj=document.form;
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
    }
    /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {
    	var cnt=0;
        with(sheetObj){
		           
	          var HeadTitle="|Zone Code|Name|Cargo Handling Time(Hours)|Transit Time(Hours)|Rep.CY|Distance(Zone to Rep CY)|Unit|Delete Flag";
	
	          SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:0 } );
	
	          var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	          var headers = [ { Text:HeadTitle, Align:"Center"} ];
	          InitHeaders(headers, info);
	
	          var cols = [ {Type:"Status",    Hidden:1, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
	                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",ColMerge:0,   SaveName:"zn_cd",            KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"zn_nm",            KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"cgo_hndl_tm_hrs",  KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:170,  Align:"Left",  ColMerge:0,   SaveName:"tztm_hrs",         KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"rep_yd_cd",        KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"lnk_dist",         KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",  ColMerge:0,   SaveName:"dist_ut_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
	                 {Type:"Text",      Hidden:0,  Width:120,  Align:"Left",  ColMerge:0,   SaveName:"delt_flg",         KeyField:0,   CalcLogic:"",   Format:"" } ];
	           
	          InitColumns(cols);		
	          SetEditable(1);
	          SetVisible(false);
        }
    }
    // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	switch(sAction) {
    	case SEARCH:				//조회
    		formObj.f_cmd.value=SEARCH01;
    		sheetObj.SetWaitImageVisible(0);
    	    var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
    	    var sXml=sheetObj.GetSearchData("BCM_CCD_0047GS.do" , sParam);
			if( ComGetEtcData(sXml, "cnt") > 0 ){
				if(ComShowCodeConfirm("CCD00011", ComGetEtcData(sXml, "cnt"))){
					ComOpenWait(true);
//							formObj.f_cmd.value=SEARCH;
//							var sParam=FormQueryString(formObj);
//							var sXml=sheetObj.GetSearchData("BCM_CCD_0047GS.do", sParam);
//							if(sXml.length>0){
//								sheetObj.LoadSearchData(sXml,{Sync:1} );
//								sheetObj.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
//			    			}
					formObj.f_cmd.value = SEARCH;
    				formObj.target = "_self"
    				formObj.action = "BCM_CCD_0047DL.do?"+ FormQueryString(formObj);
    				formObj.submit();
	    			ComOpenWait(false);					
				}
			}else{
				ComShowCodeMessage("CCD00002");
			}
    		break;
    	case IBCLEAR:
    		formObj.reset();
    		sheetObj.RemoveAll();
        	sheetObj.RemoveEtcData();
    		break;
    	}
    }

    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj, formObj, sAction) {
    	switch (sAction) {
	    	case SEARCH:
	    		break;  		 
	    	return true;
        }
     }
	function initControl() {
		var formObj=document.form;
//		axon_event.addListenerForm('focus', 'obj_focus', form);
		axon_event.addListenerForm('change', 'obj_change', form); 		// - form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onchange 이벤트에 코드 처리
//		axon_event.addListenerForm('keypress', 'obj_keypress', form); 	// - form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress 이벤트에 코드 처리
//		axon_event.addListenerForm('keyup', 'obj_keyup', form); 		// - form 전체 컨트롤 중 dataformat 속성이 있는 모든  컨트롤의 onkeyup 이벤트에 코드 처리
//		axon_event.addListenerForm('keydown', 'obj_keydown', form); 	// - form 전체 컨트롤 onkeydown 이벤트에 코드 처리
		axon_event.addListenerForm('keydown', 'ComKeyEnter', form);
		axon_event.addListenerForm("propertychange", "obj_propertychange", formObj);
	}