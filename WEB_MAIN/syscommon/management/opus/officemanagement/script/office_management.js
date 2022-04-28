/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : office_management.js
*@FileTitle  : office_management
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/30
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
   	/* 개발자 작업	*/
    var sheetObjects=new Array();
    var sheetCnt=0;
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
			    	case "btn_DownExcel":
			    		doActionIBSheet(sheetObject,formObject,IBDOWNEXCEL);
			    		break;
            	    case "btn_save":
        	    		doActionIBSheet(sheetObject,formObject,IBSAVE);
        	    		//ComClosePopup(); 
            	        break;
            	    case "btn_close":
            	    	ComClosePopup(); 
            	    	break;
            		case "btn_ofc_cd":
            			ComOpenPopup('/opuscntr/viewOrg.do?arOfcCd=Y', 700, 520, "getArOfcCd", "0,1,1,1,1,1", true);
            			break;
            		case "btn_cnt_cd":
            			ComOpenPopup('/opuscntr/COM_ENS_0M1.do', 635, 510, "getCntCd", "0,1,1,1,1,1", true);
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
          for(i=0;i<sheetObjects.length;i++){
              ComConfigSheet(sheetObjects[i]);
              initSheet(sheetObjects[i],i+1);
              ComEndConfigSheet(sheetObjects[i]);
          }
          doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
        }
       /**
         * 시트 초기설정값, 헤더 정의
         * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
         * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
         */
        function initSheet(sheetObj,sheetNo) {
            var cnt=0;
            sheetObj.SetWaitImageVisible(0);
            switch(sheetNo) {
                 case 1:      //IBSheet1 init
                     with(sheetObj){
	                  var HeadTitle="|Office|English Office Name|Local Office Name|Level|County|AR OFC|";
	
	                  SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0 } );
	
	                  var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
	                  var headers = [ { Text:HeadTitle, Align:"Center"} ];
	                  InitHeaders(headers, info);
	
	                  var cols = [ {Type:"CheckBox",  Hidden:0, Width:35,   Align:"Center",  ColMerge:0,   SaveName:"check_val" },
	                      {Type:"Text",      Hidden:0,  Width:140,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, TreeCol:1 ,  LevelSaveName:"level"},
	                      {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"ofc_eng_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                      {Type:"Text",      Hidden:0,  Width:130,  Align:"Left",    ColMerge:0,   SaveName:"ofc_krn_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                      {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ofc_knd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, ComboText:"SHO|RHQ|GOF|SOF|LOF|AGT|OTH", ComboCode:"1|2|3|4|5|6|9"},
	                      {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"rep_cust_cnt_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                      {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                      {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" } ];
	                   
		                  InitColumns(cols);
//		                  SetSheetHeight(380);
		                  resizeSheet();
	                  }
                 break;
            }
        }
        
        function resizeSheet(){
          	 ComResizeSheet(sheetObjects[0]);
          }
      // Sheet관련 프로세스 처리
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg(false);
            ComOpenWait(true);
            switch(sAction) {
               case IBSEARCH:      //조회
                  	formObj.f_cmd.value=SEARCH;
                   	sheetObj.DoSearch("Office_ManagementGS.do", FormQueryString(formObj) );
                  	break;
                case IBSAVE:        //저장
                	formObj.f_cmd.value=MULTI;
                	sheetObj.DoSave("Office_ManagementGS.do", FormQueryString(formObj),"ibflag",false);
                	break;
                case IBDOWNEXCEL:	//엑셀다운로드
                	if(sheetObj.RowCount() < 1){
                		ComShowCodeMessage("COM132501");
                	}else{
                		sheetObj.Down2Excel({ HiddenColumn:1,CheckBoxOnValue:"Y",CheckBoxOffValue:"N"});
                	}
    				break;
            }
            ComOpenWait(false);
        }
       /**
         * 화면 폼입력값에 대한 유효성검증 프로세스 처리
         */
        function validateForm(sheetObj,formObj,sAction){
            with(formObj){
//                if (!isNumber(iPage)) {
    //
//                    return false;
//                }
            }
            return true;
        }
        
        /**
         * sheet1_OnSaveEnd
         */
        function sheet1_OnSaveEnd(sheetObj, code, msg, stCode, stMsg){
        	if(msg == null || msg == ""){
        		ComClosePopup(); 
              }
        }

         /**
          * access level code auto check
          * @param code access level
          * @param checked boolean
          * @return
          */
         function chkBox(code, checked) {
        	var boxes=document.getElementsByTagName("input");
        	var sheetCheck;
        	if(checked == true){
        		sheetCheck=1;
        		}
        	else{
        		sheetCheck=0;
        	}
        	if ( code == 'A' ) {
     			for ( var i=0 ; i < boxes.length-1 ; i++ ) {
     				if ( boxes[i].getAttribute("type") == "checkbox" ) boxes[i].checked=checked;
     			}
     			sheetObjects[0].CheckAll('check_val', sheetCheck);
     		} else if ( code == 'Z' ) {
     			var strCountryCd=document.all.countryCd.value;
     			var strArOfcCd=document.all.arOfcCd.value;
     			for ( var idx=1; idx <= sheetObjects[0].RowCount(); idx++) {
     				if ( sheetObjects[0].GetCellValue(idx,'rep_cust_cnt_cd') != "" && strCountryCd.indexOf(sheetObjects[0].GetCellValue(idx,'rep_cust_cnt_cd')) > -1 )
     					sheetObjects[0].SetCellValue(idx,'check_val',checked);
     				if ( sheetObjects[0].GetCellValue(idx,'ar_ofc_cd') != "" && strArOfcCd.indexOf(sheetObjects[0].GetCellValue(idx,'ar_ofc_cd')) > -1 )
     					sheetObjects[0].SetCellValue(idx,'check_val',checked);
     			}
     		} else {
	        	for ( var idx=1; idx <= sheetObjects[0].RowCount(); idx++) {
	        		if(sheetObjects[0].GetCellValue(idx,'ofc_knd_cd') == code){
						sheetObjects[0].SetCellValue(idx,'check_val',checked);
					}
				}
     		}
         }
         function getCntCd(rowArray) {
     		var gubun=',';
     		var val='';
     		for(var i=0; i<rowArray.length; i++)
     		{
     			if(i == rowArray.length-1) gubun='';
     			colArray=rowArray[i];
     			val += colArray[3] + gubun;
     		}
     		document.all.countryCd.value=val;
     	}
         function getArOfcCd(rowArray) {
     		var gubun=',';
     		var val='';
     		for(var i=0; i<rowArray.length; i++)
     		{
     			if(i == rowArray.length-1) gubun='';
     			colArray=rowArray[i];
     			val += colArray[3] + gubun;
     		}
     		document.all.arOfcCd.value=val;
     	}
	/* 개발자 작업  끝 */
