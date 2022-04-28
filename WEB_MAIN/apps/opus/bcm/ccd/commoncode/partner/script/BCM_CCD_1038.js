/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_1038.js
*@FileTitle  : CUST PFMC DUP_CHECK GRP_POPUP
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/04
=========================================================*/
   	/* 개발자 작업	*/
    // 공통전역변수
    var sheetObjects=new Array();
    var sheetCnt=0;
    var comboObjects=new Array();
    var comboCnt=0;    
    // 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
    document.onclick=processButtonClick;
    // 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
     function processButtonClick()
     {
        /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
        var sheetObject1=sheetObjects[0];   
        /*******************************************************/
        var formObject=document.form;
     	try {
     		var srcName=ComGetEvent("name");
			switch(srcName) 
			{
				case "btn_chk_dupl":
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
				break;
				case "btn_crt":
					doActionIBSheet(sheetObjects[0],document.form,COMMAND01);
				break;
				case "btn_close":
					doActionIBSheet(sheetObjects[0],document.form,COMMAND02);
				break;
 			} // end switch
     	}catch(e) {
     		if( e == "[object Error]") 
     		{
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
     function setSheetObject(sheet_obj)
     {
        sheetObjects[sheetCnt++]=sheet_obj;
     }
      /** 
       * IBCombo Object를 배열로 등록
       * param : combo_obj ==> 콤보오브젝트
       * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
       * 배열은 소스 상단에 정의
       */ 
      function setComboObject(combo_obj) {  
      	comboObjects[comboCnt++]=combo_obj;  
      }      
     /**
      * Sheet 기본 설정 및 초기화
      * body 태그의 onLoad 이벤트핸들러 구현
      * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
      */
     function loadPage() 
     {
         for(i=0;i<sheetObjects.length;i++)
         {
             ComConfigSheet(sheetObjects[i]);
             initSheet(sheetObjects[i],i+1);
             ComEndConfigSheet(sheetObjects[i]);
         }
//     	 axon_event.addListenerFormat('keypress', 'obj_keypress', form); //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress이벤트에 코드 처리
//         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
//         document.form.cust_grp_nm.value = opener.getCustGrpNm();
		 doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
		 if(ComGetObjValue(document.form.rqst_no) == '') {
        	ComSetDisplay('btn_crt', true);
        }
     }
   /**
      * 시트 초기설정값, 헤더 정의
      * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
      * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
      */
     function initSheet(sheetObj,sheetNo) 
     {
         var cnt=0;
	   	 var sheetID=sheetObj.id;
         switch(sheetID) 
         {
             case "sheet1" :
 				with (sheetObj) 
 				{
                 var HeadTitle1="Seq||Code|Name|Contrl Office|Sales Rep.";
                 var headCount=ComCountHeadTitle(HeadTitle1);
                 SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                 var headers = [ { Text:HeadTitle1, Align:"Center"} ];
                 InitHeaders(headers, info);
                 var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                  {Type:"Text",      Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                  {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:"cust_grp_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                  {Type:"Text",      Hidden:0,  Width:380,  Align:"Left",    ColMerge:0,   SaveName:"cust_grp_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                  {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                  {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"srep_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
                 InitColumns(cols);
                 SetEditable(0);
                 SetSheetHeight(250);
				}
				break;
 		} // end switch
     }
    // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) 
    {
         sheetObj.ShowDebugMsg(false);
         switch(sAction) 
         {
			case IBSEARCH:      //조회
				if (sheetObj.id == "sheet1")
				{
					formObj.f_cmd.value=SEARCH;
					sheetObj.DoSearch("BCM_CCD_1038GS.do", FormQueryString(formObj) );
				}
			break;
			case COMMAND01:     // ok 버튼 클릭시 처리
				if (!ComShowCodeConfirm("CCD00030")) {
				    return;
				}
				opener = window.dialogArguments;
				if(!opener)
					opener=parent;		
				opener.saveCustGrp();							
				ComClosePopup(); 
			case COMMAND02:     // close 버튼 클릭시 처리					
				ComClosePopup(); 
			break;
         }
      }   
	/* 개발자 작업  끝 */
