/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_COM_0009.jsp
*@FileTitle  : Activity Code Pop-up
*@author     : CLT
*@version    : 1.0
*@since      : 2014/07/31
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
     * @class COM_COM_0009 : COM_COM_0009 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
   	/* 개발자 작업	*/
    // 공통전역변수
    var sheetObjects=new Array();
    var sheetCnt=0;
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
     		if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) 
			{
				case "btn_Retrieve":
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
				break;
				case "btn_select":
					doActionIBSheet(sheetObjects[0],document.form,COMMAND01);
				break;
				case "btn_DownExcel":
 					sheetObject1.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
 					break;
				case "btn_New":
					sheetObject1.RemoveAll();
					formObject.reset();
 					break;
				case "btn_close":
					ComClosePopup(); 
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
		 doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
     }
  	function obj_keypress(){
  	    obj=event.srcElement;
  	    if(obj.dataformat == null) return;
  	    window.defaultStatus=obj.dataformat;
  	    switch(obj.dataformat) {
  	        case "engup":
  	            ComKeyOnlyAlphabet('upper');
  	            break;
  	      case "engNum":
  	    	  	ComKeyOnlyAlphabet('uppernum', "45|46|47|40|41|32|39|44|38|64");
	            break;
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
            	    with(sheetObj){
                 {
			               
			               var HeadTitle1="||Code|Name";
			             
			               var mdmYN=document.form.mdm_yn.value;
			               if(mdmYN.replace(/\s/g,"") != ""){
			               HeadTitle1 += "|Status||";
			               }else{
			               HeadTitle1 += "||";
			               }
			               var headCount=ComCountHeadTitle(HeadTitle1);
			               if(mdmYN.replace(/\s/g,"") != ""){
			               (headCount, 0, 0, true);
			               }else{
			               (headCount, 0, 0, true);
			               }
			
			               SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			
			               var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			               var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			               InitHeaders(headers, info);
			
			               var cols = [ {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                      {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                      {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"act_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			                      {Type:"Text",      Hidden:0,  Width:330,  Align:"Left",    ColMerge:1,   SaveName:"act_nm",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
			                     if(mdmYN.replace(/\s/g,"") != ""){
			               cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			               }
			               cols.push({Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"pagerows",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			               cols.push({Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" });
			          
			               InitColumns(cols);
			
			               SetEditable(1);
			               SetSheetHeight(250);
                     }


				break;
 		} // end switch
     }
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
 					sheetObj.DoSearch("COM_COM_0009GS.do", FormQueryString(formObj) );
				}
			break;
			case COMMAND01:     // select 버튼 클릭시 처리
		        var selrow=sheetObj.GetSelectRow();
		        if ( selrow > 0 )
		        {
					 comPopupOK();      // 호출자에게 매개변수값 전달.
		        }
			break;
         }
      }
     /**
      * 그리드에서 더블클릭했을 때의 처리 : 선택한 값을 부모창으로 리턴하고, 팝업창을 닫는다.
      * 호출하는곳에서 ComOpenPopupWithTarget() 함수를 이용하여 code 값을 받으세요.
      */
     function sheet1_OnDblClick(sheetObj, row, col, value) 
     {
    	 comPopupOK();      // 호출자에게 매개변수값 전달.
     }
     /**
      * 참조
      * ComOpenPopup('/opuscntr/COM_COM_0009.do?mdm_yn=Y', 670, 420, 'getCurr_cd', "1,0,1,1,1,1,1", true);
      */
	/* 개발자 작업  끝 */
