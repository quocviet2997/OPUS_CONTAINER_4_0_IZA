/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_061.js
*@FileTitle  : Node 조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
                 [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/* 공통전역변수 */
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
var mainPage;
var sheetMode;

/* 업무별전역변수는 아래 부분에 추가 선언하여 사용한다. */
/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */    
function processButtonClick(){
    /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
    var sheetObject=sheetObjects[0];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName = ComGetEvent("name");
        /***********************************************************************************************************
            이미지 클릭 이벤트 처리, popup도 역시 이곳에서 함
            공통코드: CoFormControl.js 에 정의 되어있습니다. 이 변수를 통하여 ServiceCommand에서 분기 합니다.        
         **********************************************************************************************************/
        switch(srcName) {
            case "btn_retrieve":
                // 하단 그리드 Display 항목이, Yard/Zone 구분에 따라 틀리므로, loadPage() 를 호출한다.  \
                sheetObject.RemoveAll();
                doActionIBSheet(sheetObject,formObject,IBSEARCH);
                break;
            case "btn_new":
                sheetObject.RemoveAll();
                formObject.reset();
                break;
            case "btn_close":
                ComClosePopup();
                break;
            case "btn_ok":
    	    	if (sheetObject.GetColHidden("radio") == 0) {
    	    		var checkedCount = sheetObject.CheckedRows("radio");
    	    		if (checkedCount == 0) {
    	    			ComShowCodeMessage("COM12113", "Yard Code");
						return;
    	    		}
    	    	} else if (sheetObject.GetColHidden("checkbox") == 0) {
    	    		var checkedCount = sheetObject.CheckedRows("checkbox");
    	    		if (checkedCount == 0) {
    	    			ComShowCodeMessage("COM12113", "Yard Code");
						return;
    	    		}
    	    	}
    	    	comPopupOK();
                break;
            case "btn2_downexcel":
                
                if(sheetObject.RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                	 var params = { DownCols:makeHiddenPriSkipCol(sheetObject),HiddenColumn:true,Merge:true,TreeLevel:false} ;
                     sheetObj.Down2Excel(params);
                    //sheetObject.Down2Excel({ HiddenColumn:-1,Merge:false,TreeLevel:false});
                }
                
                break;
        } // end switch
    }catch(e) {            
        /*
                자바 스크립트 에러가 발생할시 오동작이 납니다. 고객에게 이 경우 아래의 메세지가 뿌려지게 해야합니다.
                물론 화면에서 다음의 메세지를 보시면 무조건 '자바스크립트 에러구나'라고 확인하실수 가 있습니다.
        */
        if( e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        } else {
            ComShowMessage(e);
        }
    }
}
    /**
     * IBSheet Object를 배열로 등록
     * comSheetObject(id)에서 호출한다
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){
        sheetObjects[sheetCnt++]=sheet_obj;
        initControl();
    }
    /**
     * Sheet 기본 설정 및 초기화 
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
     function loadPage(sMain, sDisplay) {
        if (sheetMode!=undefined && sheetMode==document.form.modeVal.value) return;
        //ibmig-yard와 zone으로 바뀔때 IBSheet의 초기화를 reset하기 위함
        if (sheetMode!=undefined) {
            sheetObjects[0] = sheetObjects[0].Reset();
            sheetObj = sheetObjects[0];
        }
        sheetMode=document.form.modeVal.value;
        mainPage=sMain;
        
        if (sMain=="") mainPage=undefined;
        
        for(i=0;i<sheetObjects.length;i++){        	
            //khlee-시작 환경 설정 함수 이름 변경
            ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            //khlee-마지막 환경 설정 함수 추가
            ComEndConfigSheet(sheetObjects[i]);
        }
        var DisplayArr = sDisplay.split(",");
        
        for(var i=0 ; i < DisplayArr.length ; i++ ){
        	if( DisplayArr[i] == "0") {
        		sheetObjects[0].SetColHidden(i, true);
        	}        	
        }        
        // 초기화면에서 조회내용을 보기 위한 소스 추후 삭제
//        var sheetObject = sheetObjects[0];
//        var formObject = document.form;        
//          doActionIBSheet(sheetObject,formObject,IBSEARCH);
        initControl();
    }
     function initControl() {
        var formObject=document.form;
         //Axon 이벤트 처리1. 이벤트catch(개발자변경)
         axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
         axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
     }
     //업무 자바스크립트 OnKeyPress 이벤트 처리
     function keypressFormat() {
        switch(ComGetEvent("dataformat")) {
            case "engup":
                ComKeyOnlyAlphabet('uppernum','32');
                break;
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
                with(sheetObj){
                    var HeadTitle="";
                    var mdmYN=document.form.mdm_yn.value;
                    
                    if(sheetMode == "yard") {
                        if(mainPage == undefined){                    	
                            HeadTitle="||Seq.|Node Code|Node Name|Ctrl Office|MAT|CY|CFS|R/R|PY|Type|Customs No";
                        }else{
                            HeadTitle="SEQ|Node Code|Node Name|Ctrl Office|MAT|CY|CFS|R/R|PY|TYPE|Customs No";
                        }
                        if(mdmYN.replace(/\s/g,"") != ""){
                            HeadTitle += "|vndr_cnt_cd|loc_cd|Status";
                        }else{
                            HeadTitle += "|vndr_cnt_cd|loc_cd";
                        }
                    } else if (sheetMode == "zone"){
                    	if(mainPage == undefined){                    	
                            HeadTitle="||SEQ|Node Code|Node Name|Ctrl Office";
                        }else{
                            HeadTitle="SEQ|Node Code|Node Name|Ctrl Office";
                        }
                        if(mdmYN.replace(/\s/g,"") != ""){
                            HeadTitle += "|vndr_cnt_cd|loc_cd|Status";
                        }else{
                            HeadTitle += "|vndr_cnt_cd|loc_cd";
                        }
                    }
                    else {
                        if(mainPage == undefined){                    	
                            HeadTitle="||SEQ|Node Code|Node Name|Ctrl Office|Postal Code|District|Street|Address";
                        }else{
                            HeadTitle="SEQ|Node Code|Node Name|Ctrl Office|Postal Code|District|Street|Address";
                        }
                        if(mdmYN.replace(/\s/g,"") != ""){
                            HeadTitle += "|vndr_cnt_cd|loc_cd|Status";
                        }else{
                            HeadTitle += "|vndr_cnt_cd|loc_cd";
                        }
                    }
                    
                    SetConfig( { SearchMode:2, MergeSheet:5, Page:50, FrozenCol:0, DataRowMerge:1 } );
                    
                    var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                    var headers = [ { Text:HeadTitle, Align:"Center"} ];
                    InitHeaders(headers, info);
                    
                    var cols;
                    if(mainPage==undefined){
                        cols = [ {Type:"Radio",     Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"radio",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                                {Type:"CheckBox",  Hidden:0,  Width:30,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                                {Type:"Seq",       Hidden:0,  Width:35,   Align:"Center",  ColMerge:0,   SaveName:"",                         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }
                                ];
                    }else{
                        cols = [{Type:"Seq",       Hidden:0,  Width:35,   Align:"Center",  ColMerge:0,   SaveName:"",                         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 }
                                ];
                    }
                    
                    if(sheetMode == "yard") {
                        cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"yd_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:180,  Align:"Left",    ColMerge:0,   SaveName:"yd_nm",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"yd_fcty_tp_mrn_tml_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ToolTipText:"Marine terminal"});
                        cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"yd_fcty_tp_cy_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ToolTipText:"Container yard" });
                        cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"yd_fcty_tp_cfs_flg",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ToolTipText:"Container Freight Station" });
                        cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"yd_fcty_tp_rail_rmp_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ToolTipText:"Rail Ramp" });
                        cols.push({Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"yd_fcty_tp_psdo_yd_flg",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, ToolTipText:"Paeudo" });
                        cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"yd_tp_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"yd_cstms_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                    } 
                    else if(sheetMode == "zone"){
                    	cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"zn_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"zn_nm",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                    }
                    else {
                        cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"zn_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"zn_nm",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"zip_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"dstr_nm",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:70,   Align:"Left",    ColMerge:0,   SaveName:"strt_nm",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                        cols.push({Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"address",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                    }
                    
                    cols.push({Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"cnt_cd" });
                    cols.push({Type:"Text",      Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"loc_cd" });
                    if(mdmYN.replace(/\s/g,"") != ""){
                        cols.push({Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                    }
                    InitColumns(cols);
                    
                    //SetImageList(0,"/opuscntr/img/opus/ico_round.gif");
                    SetCountFormat("[SELECTDATAROW / TOTALROWS]");                                        
                    SetWaitImageVisible(false);
                    SetSheetHeight(ComGetSheetHeight(sheetObj, 11));
                }
                break;           
        }
    }   

    //var iPageNo = 1;

    function sheet_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {         
        if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
        // TODO:sheet에 해당하는 객체와 폼 오브젝트를 doActionIBSheet 함수에 보내 주어야합니다.
        doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
     }
    
    /* Sheet관련 프로세스 처리 */
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        //sheetObj.ShowDebugMsg = false;        
        switch(sAction) {
           case IBSEARCH:      //조회
                if(!validateForm(formObj,sAction))return;
                iPageNo=1;
                formObj.f_cmd.value=SEARCH;    
                selectVal=FormQueryString(formObj);
                //ComOpenWait(true);
                sheetObj.DoSearch("COM_ENS_061GS.do",selectVal );
                //var info = {PageParam:"iPage", Param:selectVal};
                //sheetObj.DoSearchPaging("COM_ENS_061GS.do",info );
                break;
           case IBSEARCHAPPEND:  // 페이징 조회            
                //formObj.f_cmd.value=SEARCHLIST; 
                //ComOpenWait(true);              
                formObj.f_cmd.value=SEARCH;         
                //selectVal=FormQueryString(formObj);
                sheetObj.DoSearch("COM_ENS_061GS.do", selectVal+"&iPage="+PageNo, {Append:true});
           break;
        }
    }

    function sheet_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
        ComOpenWait(false);
    }
    
    function sheet_OnSort(sheetObj ,Col, SortArrow){
    	sheetObj.ReNumberSeq();   
    }
    
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(formObj,sAction){
         with(formObj){
             if(formObj.node_nm.value.length == 1) {
               ComShowMessage("Node Name must be 2 characters");
               return false;
             }
          }
          return true;
    }
    
    //EXCELDOWNLOAD SEQ 제거
    function makeHiddenPriSkipCol(sobj){
        var lc = sobj.LastCol();
        var rtnStr = "";
        for(var i=0;i<=lc;i++){
           if( ! ( 1==sobj.GetColHidden(i) || sobj.GetCellProperty(0,i,"Type") == "CheckBox" || sobj.GetCellProperty(0,i,"Type") == "DummyCheck" 
              || sobj.GetCellProperty(0,i,"Type") == "Radio"||  sobj.GetCellProperty(0,i,"Type") == "Status" 
              ||  sobj.GetCellProperty(0,i,"Type") =="DelCheck" || sobj.GetCellProperty(0,i,"Type") =="Seq")){
              rtnStr += "|"+ i;
           }
        }
        return rtnStr.substring(1);
    }
