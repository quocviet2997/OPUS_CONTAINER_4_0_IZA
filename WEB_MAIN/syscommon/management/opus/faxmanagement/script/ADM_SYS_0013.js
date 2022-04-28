/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : ADM_SYS_0013.js
*@FileTitle  : FAX 관리
*@author     : CLT
*@version    : 1.0
*@since      : 2014/11/12
=========================================================*/
var sheetObjects=new Array();
var sheetCnt=0;
/* 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick=processButtonClick;
/* 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
         /*******************************************************/
         var formObject=document.form1;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
        	    case "btn_Retrieve":
    	            doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
    	            //doActionIBSheet(sheetObjects[1],formObject,IBSEARCH);
        	        break;
        	    case "btns_calendar":
        			var vCal=new ComCalendar();
        			vCal.setDisplayType("date");
        			vCal.select(formObject.faxSndDate, "yyyy-MM-dd");
        			break;
        			// Down Excel
        		case "btn1_Down_Excel":	
        			if (sheetObjects[0].RowCount()> 0 ) {
        			
        				sheetObjects[0].Down2Excel({ HiddenColumn:1,TreeLevel:false,SheetName:"ProcessingStatus"});
        			}
        			break;	
                case "btn_resend":
                  if(confirm("Do you want to Resend?")){
                    //doActionIBSheet(sheetObjects[2],formObject,IBSEARCH);
                	  if (sheetObjects[0].RowCount()> 0 ) {
                		  doActionIBSheet(sheetObjects[0],	formObject,	MODIFY01);	
                	  }                	  
                  }
        	        break;        			
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(ComGetMsg('COM12111'));
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
			ComConfigSheet (sheetObjects[i]);			 
			initSheet(sheetObjects[i], i+1);			
		}
        initControl();		
    }
    
    function initControl() {
      	var formObject=document.form1;
          //Axon 이벤트 처리1. 이벤트catch(개발자변경)
          axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
          axon_event.addListener ('keydown', 'ComKeyEnter', 'form1');
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
        		var HeadTitle="STS|Seq.|Chk|Send No|Receiver Name|Receiver Fax No|Module|Sender ID|Sender Office|Send Date|Title|Status|Status Detail" ;
                var prefix="sheet1_";
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:0 } );
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                var cols = [                  
                 {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                 {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                 {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"chk",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
          
                 {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix+"fax_snd_no", 		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rcvr_info_ctnt1",      	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:100,   Align:"Left",  ColMerge:0,   SaveName:prefix+"rcvr_info_ctnt2",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"rd_sub_sys_cd",     	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:100,   Align:"Left",  ColMerge:0,   SaveName:prefix+"cre_usr_id",   		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             
	             {Type:"Text",      Hidden:0,  Width:90,   	Align:"Center",  ColMerge:0,   SaveName:prefix+"ofc_cd",      		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:90,   	Align:"Center",  ColMerge:0,   SaveName:prefix+"fax_snd_date",    	KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:300,   Align:"Left",  ColMerge:0,   SaveName:prefix+"fax_tit_nm", 		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:70,    Align:"Center",  ColMerge:0,   SaveName:prefix+"fax_proc_sts_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	             {Type:"Text",      Hidden:0,  Width:300,   Align:"Left",  ColMerge:0,   SaveName:prefix+"xpt_err_msg",        KeyField:0,   CalcLogic:"",   Format:"",         	PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
	             ];
                        
                InitColumns(cols);            	                              	
            	SetEditable(1);
	            SetSheetHeight(400);
        	}
        	break;        	
        }
    }
    
    
    function resizeSheet(){
        ComResizeSheet(sheetObjects[1]);
    }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //조회
                if(validateForm(sheetObj,formObj,sAction)){                   
    					formObj.f_cmd.value=SEARCH01;
    					var arr1=new Array("sheet1_", "");
    		        	var sParam1=FormQueryString(formObj)+ "&" + ComGetPrefixParam(arr1);
     					var sXml1=sheetObj.GetSearchData("ADM_SYS_0013GS.do", sParam1);     					     					
    					if(sXml1.length>0){
    						sheetObj.LoadSearchData(sXml1,{Sync:1} );
    					}  
                }
                break;      
            case MODIFY01: // resend 
            	var j=sheetObj.GetSelectRow();
            	sheetObj.SetCellValue(j, "sheet1_ibflag","Resend");            	          	
            	formObj.f_cmd.value=MULTI;
                var returnVal = sheetObj.DoSave("ADM_SYS_0013GS.do", FormQueryString(formObj), -1, false);                
                if(returnVal){
                	doActionIBSheet(sheetObj,formObj,IBSEARCH);
                }                          
		 	    break; 
        }        
    }
   /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){

        }
        return true;
    }
    
    function sheet1_OnDblClick(sheetObj, Row, Col) {
    	    	
    	var errMsg = sheetObj.GetCellValue(Row, "sheet1_xpt_err_msg");
    	
    	if( Col ==12 && errMsg != ""){
    	ComShowMessage(errMsg);
    	}
    }
    
