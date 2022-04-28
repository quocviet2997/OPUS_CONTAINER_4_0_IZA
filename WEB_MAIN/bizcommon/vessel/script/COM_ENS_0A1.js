/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0A1.js
*@FileTitle  : Vessel조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/20
=========================================================*/

/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
                 [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

    // 공통전역변수
    var ipageNo=1 ;
    
    var sheetObjects=new Array();
    var sheetCnt=0;
    
    var selectVal;
    var mainPage;
    
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
               case "btn_Retrieve":
                    doActionIBSheet(sheetObject,formObject,IBSEARCH);      
               break;
               case "btn_New":
                    sheetObject.RemoveAll();
                    formObject.reset();
               break;
               case "btn_Close":
                   ComClosePopup(); 
                break;
               case "btn_OK":
                    comPopupOK();
                    break;
                case "btn2_Down_Excel":
                    if(sheetObject.RowCount() < 1){//no data                        
                        ComShowCodeMessage("COM132501");
                    }else{
                        sheetObject.Down2Excel({SheetDesign:1, DownCols: makeHiddenSkipCol(sheetObject)}); 
                    }                   
                    break;
            } // end switch
        }catch(e) {
            if( e == "[object Error]") {
                ComShowMessage(OBJECT_ERROR);
            } else {
                ComShowMessage(e);
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
     * Sheet 기본 설정 및 초기화
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
     function loadPage(mainpage) {
         if(mainpage==true || mainpage==false)
             mainPage=mainpage;
         else
             mainPage="undefined";
        for(i=0;i<sheetObjects.length;i++){
        //khlee-시작 환경 설정 함수 이름 변경
           // ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
        //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
        var sXml=document.form.sXml.value;
        var State=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key);
        if(State == "S"){
            //sheetObjects[0].RenderSheet(0);
            sheetObjects[0].SetWaitImageVisible(0);
            sheetObjects[0].LoadSearchData(sXml,{Sync:1} );
            //sheetObjects[0].RenderSheet(1); 
        }
    }
     function initControl() {
        var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
        // axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
        // axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
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
                    with(sheetObj){
                      var HeadTitle;                      
                      if(mainPage == "undefined"){
                          HeadTitle="|Chk.|Seq.|Vessel Code|Vessel Name|Carrier|Net Ton|Port of Registry|Call Sign No.|LLOYD No.|Ship Age(Year)|Feeder/Trunk" ;
                      }else{
                          HeadTitle="Seq.|Vessel Code|Vessel Name|Carrier|Net Ton|Port of Registry|Call Sign No.|LLOYD No.|Ship Age(Year)|Feeder/Trunk" ;
                      }
                      var mdmYN=document.form.mdm_yn.value;
                      if(mdmYN.replace(/\s/g,"") != ""){
                          HeadTitle += "|Status";
                      }
                      var headCount=ComCountHeadTitle(HeadTitle);

                      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:0 } );

                      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                      var headers = [ { Text:HeadTitle, Align:"Center"} ];
                      InitHeaders(headers, info);
                      
                      var cols = new Array();
                      
                      if(mainPage=="undefined"){
                          cols.push({Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                          cols.push({Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                      }
                                                              
                       cols.push({Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:0,   SaveName:"vsl_eng_nm",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"crr_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Int",       Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"vsl_nrt",              KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"rgst_port_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"call_sgn_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"lloyd_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"vsl_lnch_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                       cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"intg_cd_val_dp_desc",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                      
                      if(mdmYN.replace(/\s/g,"") != ""){
                          cols.push({Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                      }
                 
                      InitColumns(cols);
                      SetEditable(1);
                  
                  SetCountFormat("[SELECTDATAROW / TOTALROWS]");
                  resizeSheet();
                }
                break;
        }
    }
    
    function resizeSheet(){
    	ComResizeSheet(sheetObjects[0]);
    }
//    function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
//       // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
//       doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
//    }   
  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction,a,PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //조회
                if(!validateForm(sheetObj,formObj,sAction)) {
                    return false;
                }
                iPageNo = 1;
                formObj.f_cmd.value=SEARCH;                
                selectVal=FormQueryString(formObj);
                sheetObj.DoSearch("COM_ENS_0A1GS.do", selectVal );
                break;
           case IBSEARCHAPPEND:  // 페이징 조회
                formObj.f_cmd.value=SEARCH;
                sheetObj.DoSearch("COM_ENS_0A1GS.do", selectVal+"&"+ "iPage=" + PageNo,{Append:true} );
           break;
        }
    }
    function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
        doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
    }  

    var iPageNo = 1;
    
    function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
        if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
        doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
    }

   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
//        with(formObj){
//                if(formObj.vsl_cd.value=="" && formObj.vsl_eng_nm.value=="" && formObj.car_cd.value=="") {
//                  ComShowMessage("You must input Vessel code or Vessel Name or Carrier");
//                  ComSetFocus(formObj.vsl_cd);
//                  return false;
//                }
//        }
        return true;
    }
