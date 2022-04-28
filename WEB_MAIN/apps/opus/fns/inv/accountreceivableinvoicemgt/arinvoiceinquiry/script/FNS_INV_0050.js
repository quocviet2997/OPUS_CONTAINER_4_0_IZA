/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0050.js
*@FileTitle : Customer Preferable Report
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.11 박성용
* 1.0 Creation
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
     * @class FNS_INV_0050 : FNS_INV_0050 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    
   	/* 개발자 작업	*/


	 // 공통전역변수
	
	 var sheetObjects = new Array();
	 var sheetCnt = 0;	 
	
	 // 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	 document.onclick = processButtonClick;

	 /** 
	 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  없음  
	 * @return 없음
	 * @see #
	 * @author 한동훈 
	 * @version 2009.10.19
	 */
     function processButtonClick(){
          /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
 		         var sheetObject1 = sheetObjects[0];
          /*******************************************************/
 		       
          var formObject = document.form;

     	try {
     		var srcName = ComGetEvent("name");
     		
   		
            switch(srcName) {

 							case "btn_retrieve":

 								doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
 								
 							break;
 							
 							case "btn_new":
 								ComResetAll();
 								pageReset(sheetObjects[2], formObject);
 								document.form.cust_cnt_cd.value="";
 								document.form.cust_seq.value ="";
 								//ComBtnEnable("btn_save");
 								document.form.save_yn.value="N";
 								document.form.bl_nos.value ="";
 								doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01);
 								ComSetFocus(rpt_tmplt_nm);
 									
 							break;
 							
 							case "btn_downExcel":
 								if(sheetObject1.RowCount() < 1){//no data
 				                    ComShowCodeMessage("COM132501");
 				                }else{
 				                    sheetObject1.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
 				                }
 			                break;
 							
 							case "btn_report":
 								var v_cust_rpt_id = formObject.cust_rpt_id.value;
 			 					
 			 					var classId = "FNS_INV_0103";
 			 					var param = '?cust_rpt_id='+v_cust_rpt_id+'&pop_yn=Y&classId='+classId;
 			 			
 			 					ComOpenPopup('/opuscntr/FNS_INV_0103.do' + param, 1280, 800, 'getFNS_INV_0103', '1,0,1,1,1', false, false);
 							break;
 							
 							case "btn_template":
 								//var v_rpt_tmplt_nm = formObject.rpt_tmplt_nm.text; 
 								var v_rpt_tmplt_nm = formObject.select_tmplt.value; 
 								var v_tmplt_ofc_cd = formObject.tmplt_ofc_cd.value;
 								
 								var noType ="";
 								var noVal  ="";
 								if (formObject.sc_no.value!="" ){
 								     noType ="S";
 								     noVal = formObject.sc_no.value;
 								}else if(formObject.rfa_no.value!=""){
 								     noType = "R";
 								     noVal = formObject.rfa_no.value;
 								}
 	 								
 			 					var classId = "FNS_INV_0051";
 			 					var param = '?rpt_tmplt_nm='+v_rpt_tmplt_nm+'&tmplt_ofc_cd='+v_tmplt_ofc_cd+'&noType='+noType+'&noVal='+noVal+'&pop_yn=Y&classId='+classId;
 			 			
 			 					ComOpenPopup('/opuscntr/FNS_INV_0051.do' + param, 1280, 800, 'getFNS_INV_0051', '1,0,1,1,1', false, false);
 			 					
 							break;
 							
 							case "btn_preview": 
 								
 								var strBkgNo = "";
 								var strBlNo = "";
 								if (sheetObjects[0].CheckedRows("SelChk") == 0) {
 									ComShowMessage(msgs["INV00025"]);
 									return false;
 								}
 								for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
 									if(sheetObjects[0].GetCellText(i,"SelChk") == "1"){
 										strBkgNo = sheetObjects[0].GetCellValue(i,"inv001").toString();
 										strBlNo = sheetObjects[0].GetCellValue(i,"inv002");
 										break;
 									}
 								}
 								
 								if(strBkgNo == "" || strBkgNo == "-1"){
 									formObject.bl_no.value = strBlNo;
 									doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC03);
 									strBkgNo = formObject.bkg_no.value;
 								}
 								
 								if(strBkgNo == "" || strBkgNo == undefined){    		
 						    		ComShowCodeMessage('INV00041'," BKG No is blank.");
 						    		return false;
 						    	}else{ 								
 						    		rdOpen(formObject, strBkgNo)
 						    	}	
 							break;
 							
 							case "btn_save":
 								doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
 							break;
 							
 							case "btns_cust":
 								var cust_cnt_cd="";
 								var cust_seq="";
 								var classId="FNS_INV_0086";
 								var param='?cust_cnt_cd='+cust_cnt_cd+'&cust_seq='+cust_seq+'&pop_yn=Y&classId='+classId;
 								ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 390, 'getFNS_INV_0086', '0,0', false, false);
 							break;
 			 				
 							case "btns_from_dt":
 			   	                var cal = new ComCalendar();
 			   	                cal.setDisplayType('date');
 			   	                cal.select(formObject.from_date, 'yyyy-MM-dd');
 			   	            break;
 			   	            
 							case "btns_to_dt":
 			   	                var cal = new ComCalendar();
 			   	                cal.setDisplayType('date');
 			   	                cal.select(formObject.to_date, 'yyyy-MM-dd');
 			   	            break;
 							case "btn_input_bl_no": // B/L No.
 								openMultipleinquiry("BLNO", "B/L No", formObject.input_bl_no.value);
 							break;
 							
 							case "btns_multicust": //M Customer 
 								openMultipleinquiry("CUST", "Customer", formObject.cust_cd.value); 
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
      * IBSheet Object를 sheetObjects 배열로 등록 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj IBSheet Object
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function setSheetObject(sheet_obj){

       // sheetObjects[sheetCnt++] = sheet_obj;
    	  if (sheet_obj.id =="sheet1"){
    		  sheetCnt = 0;
    	  }else if(sheet_obj.id =="sheet2") {
    		  sheetCnt = 1;
    	  }
    	  else {
    		  sheetCnt = 2;
    	  }
       sheetObjects[sheetCnt] = sheet_obj;
 
     }

     /** 
      * body 태그의 onLoad 이벤트핸들러 구현 <br>
      * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다. <br> 
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function loadPage() {

         for(i=0;i<sheetObjects.length;i++){
        	
         //khlee-시작 환경 설정 함수 이름 변경
             ComConfigSheet (sheetObjects[i] );

             initSheet(sheetObjects[i],i+1);
         //khlee-마지막 환경 설정 함수 추가
             ComEndConfigSheet(sheetObjects[i]);
         }
         
         //setBlSheet();
         
         initControl();
         
         document.form.save_yn.value="N";
         doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01);
 		 ComSetFocus(rpt_tmplt_nm);	
 		 
     }
 	
     /** 
      * Sheet 기본 설정 및 초기화 <br>
      * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다. <br>
      * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다. <br> 
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param {IBSheet} sheetObj : 시트오브젝트
      * @param {int} sheetNo : 시트오브젝트 태그의 아이디에 붙인 일련번호  
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
	
     function initSheet(sheetObj,sheetNo) {

        var cnt = 0;
         
     	var sheetID = sheetObj.id;
     	
         switch(sheetNo) {
              case 1:      // mainsheet1 init
 
                 with (sheetObj) {
            	  	
	            	  var HeadTitle = "|sel|bkg";
	                     
	                  if(sheetObjects[1].RowCount() > 0){    
	                 	 HeadTitle = "|Sel|rpt_tmplt_nm";
	
	                     for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
	                    	 HeadTitle = HeadTitle+"|"+sheetObjects[1].GetCellValue(i,"usr_def_nm"); 
	                     }
	                     
	                     HeadTitle = HeadTitle;          
	                  }    
                  
	                  var headCount=ComCountHeadTitle(HeadTitle);
	                  SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1, FrozenCol:5 } );
	                  var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
					  var headers = [ { Text:HeadTitle, Align:"Center"} ];
					  InitHeaders(headers, info);
            	
					  var cols = [];
			  
					  cols[cnt++] = {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" };
					  cols[cnt++] = {Type:"Radio",     Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"SelChk" };
					  cols[cnt++] = {Type:"Text",      Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"bkg",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }; 
					 
 	                  var col_nm = ""; 	     
 	                  
 	                  if(sheetObjects[1].RowCount() > 0){
 	                	  cnt = 0;
 	                	  cols[cnt++] = {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" };
 	                	  cols[cnt++] = {Type:"Radio",  Hidden:0, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"SelChk" };
 	                	  cols[cnt++] = {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"rpt_tmplt_nm",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 };
 	                	  //cols[cnt++] = {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"frt_term_cd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 };
 	                  
 	                	  for (var i=1; i<=sheetObjects[1].RowCount(); i++) { 
	 	                	  col_nm = sheetObjects[1].GetCellValue(i,"rpt_itm_id").toLowerCase();
	 	                	//Date/Time일때,Rate일때,cell width 넓힘,나머지
	 	                	 if(col_nm == 'inv047' || col_nm == 'inv048' || col_nm == 'inv049' || col_nm == 'inv050' || col_nm == 'inv051' ||
	 	                		col_nm == 'inv052' || col_nm == 'inv053' || col_nm == 'inv054' || col_nm == 'inv055' || col_nm == 'inv056' ||
	 	                		col_nm == 'inv057' || col_nm == 'inv058' || col_nm == 'inv059' || col_nm == 'inv060' || col_nm == 'inv061' ||
	 	                		col_nm == 'inv064' || col_nm == 'inv065' || col_nm == 'inv066' || col_nm == 'inv067' || col_nm == 'inv080' || col_nm == 'inv081' ||
	 	                		col_nm == 'inv120' || col_nm == 'inv142' || col_nm == 'inv144' || col_nm == 'inv218' || col_nm == 'inv219' ||
	 	                		col_nm == 'inv220' || col_nm == 'inv221' || col_nm == 'inv222' || col_nm == 'inv223' || col_nm == 'inv224' ||
	 	                		col_nm == 'inv225'){
	 	                		cols[cnt++] = {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"Ymd",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 };
	 	                	}else if(col_nm == 'chg001' || col_nm == 'chg002' || col_nm == 'chg003' || col_nm == 'chg004' || col_nm == 'chg005' || col_nm == 'chg999' ||
	 	                			 col_nm == 'inv102' || col_nm == 'inv112' || col_nm == 'inv129' || col_nm == 'inv131' ||
	 	                			 col_nm == 'inv141' || col_nm == 'inv212' || col_nm == 'inv238' || col_nm == 'inv239' || col_nm == 'inv240' || col_nm == 'inv241' ||
	 	                			 col_nm == 'inv250' || col_nm == 'inv251' || col_nm == 'inv252'){
	 	                		cols[cnt++] = {Type:"Float",      Hidden:0,  Width:120,   Align:"Right",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 }; 	                		
	 	                	}else if(col_nm == 'inv106' || col_nm == 'inv107'){
	 	                		cols[cnt++] = {Type:"Float",      Hidden:0,  Width:120,   Align:"Right",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:3,   UpdateEdit:0,   InsertEdit:0 };	
	 	                	}else if(col_nm == 'inv111' || col_nm == 'inv245' || col_nm == 'inv246' || col_nm == 'inv247'){
	 	                		cols[cnt++] = {Type:"Float",      Hidden:0,  Width:120,   Align:"Right",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:6,   UpdateEdit:0,   InsertEdit:0 };
	 	                	}else if(col_nm == 'inv005' || col_nm == 'inv007' || col_nm == 'inv009' || col_nm == 'inv015' || col_nm == 'inv017' ||
	 	                			 col_nm == 'inv019' || col_nm == 'inv021' || col_nm == 'inv023' || col_nm == 'inv026' || col_nm == 'inv028' ||
	 	                			 col_nm == 'inv031' || col_nm == 'inv036' || col_nm == 'inv040' || col_nm == 'inv044' || col_nm == 'inv063' ||
	 	                			 col_nm == 'inv076' || col_nm == 'inv078' || col_nm == 'inv079' || col_nm == 'inv114' || col_nm == 'inv115' ||
	 	                			 col_nm == 'inv147' || col_nm == 'inv148' || col_nm == 'inv149' || col_nm == 'inv150' || col_nm == 'inv151' ||
	 	                			 col_nm == 'inv205' || col_nm == 'inv210' || col_nm == 'inv211' || col_nm == 'inv214' || col_nm == 'inv215' || 
	 	                			 col_nm == 'inv216' || col_nm == 'inv226' || col_nm == 'inv228' || col_nm == 'inv236' || col_nm == 'inv243'){
	 	                		cols[cnt++] = {Type:"Text",      Hidden:0,  Width:250,   Align:"Left",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 };
	 	                	}else if(col_nm == 'inv004' || col_nm == 'inv006' || col_nm == 'inv008' || col_nm == 'inv068' || col_nm == 'inv074' ||
	 	                			 col_nm == 'inv075' || col_nm == 'inv077' || col_nm == 'inv108' || col_nm == 'inv109' || col_nm == 'inv128' ||
	 	                			 col_nm == 'inv253'){
	 	                		cols[cnt++] = {Type:"Text",      Hidden:0,  Width:250,   Align:"Right",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 };
	 	                	}else{
	 	                		cols[cnt++] = {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:0,   SaveName:col_nm,               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 };
	 	                	}
 	                	 }
 	                  } 	
 	                   
 	                InitColumns(cols);
 					//SetCountPosition(0);
 					SetEditable(1);
 					resizeSheet();
					  	                
                }
            
                 break;
                 
              case 2:     
                  with (sheetObj) {

            	  	  var HeadTitle = "|Seq.|Header|Change Header|rpt_tmplt_nm|rpt_itm_id|rpt_auth_id";
            	  	  var headCount=ComCountHeadTitle(HeadTitle);
            	  	  SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
            	  	  var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            	  	  var headers = [ { Text:HeadTitle, Align:"Center"} ];
            	  	  InitHeaders(headers, info);
                      
            	  	  var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },					             
					             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"itm_seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:"rpt_itm_nm",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"usr_def_nm",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:"rpt_tmplt_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:"rpt_itm_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:"rpt_auth_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
            	  	  
	            	  InitColumns(cols);
					  SetCountPosition(0);
					  SetEditable(1);
					  SetSheetHeight(100);
            	  	               
                 }
                  break; 
                  
              case 3:      //sheet3 init
             
              with (sheetObj) {

            	  var HeadTitle = " |bl_no|bl_combo";
        	  	  var headCount=ComCountHeadTitle(HeadTitle);
        	  	  SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
        	  	  var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
        	  	  var headers = [ { Text:HeadTitle, Align:"Center"} ];
        	  	  InitHeaders(headers, info);
                  
        	  	  var cols = [ {Type:"Status",    Hidden:1, Width:80,   Align:"Left",  ColMerge:1,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:12 },					             
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Left",  ColMerge:1,   SaveName:"bl_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:13 },
				             {Type:"Text",      Hidden:1,  Width:0,   Align:"Left",  ColMerge:1,   SaveName:"bl_combo",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
        	  	  
            	  InitColumns(cols);
				  SetCountPosition(0);
				  SetEditable(1);
				  SetSheetHeight(133);
				  SetSheetWidth(123);
				  SetColProperty(0 ,"bl_no" , {AcceptKeys:"E|N", InputCaseSensitive:1});
				  
      		}
             
              break; 
         }
     }

     /** 
      * 조회 저장등 서버 기능을 호출하는 doActionIBSheet <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : 시트오브젝트  
      * @param  {object} formObj : 폼 오브젝트
      * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
      * @param  {int} Row : sheet에서 현재 마우스로 선택되어 있는 Row
      * @param  {int} Col : sheet에서 현재 마우스로 선택되어 있는 Col
      * @param  {String}Val : sheet에서 현재 마우스로 선택되어 있는 Row,Col 의 value값
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function doActionIBSheet(sheetObj,formObj,sAction) {
         sheetObj.ShowDebugMsg = false;
         switch(sAction) {
	         case IBSEARCH_ASYNC01:      //조회	
	      		sheetObjects[0].RemoveAll();
				//sheetObjects[1].RemoveAll();
				formObj.f_cmd.value = SEARCH01;
				var sXml = sheetObj.GetSearchData("FNS_INV_0050GS.do", FormQueryString(formObj));
				
				var arrXml = sXml.split("|$$|");
				var tmplt = ComGetEtcData(arrXml[0],"tmplt");
				var arrStr = tmplt.split("|");
				
				MakeComboObject2(rpt_tmplt_nm, arrStr);
				//rpt_tmplt_nm_text.value = arrStr[0];
				
				break;
				case IBSEARCH_ASYNC02:      //조회
				//alert("IBSEARCH_ASYNC02------");
					if(validateForm(sheetObj,formObj,sAction) == false) return false; 
					sheetObjects[1].RemoveAll();
					formObj.f_cmd.value = SEARCH02;
					
					var sXml = sheetObj.GetSearchData("FNS_INV_0050GS.do", FormQueryString(formObj)+ "&" + ComGetPrefixParam(""));
					
					var arrXml = sXml.split("|$$|");
					sheetObjects[1].LoadSearchData(arrXml[0], {Sync:1});
					
					//sheetObjects[1] 헤더 세팅
					
					sheetObjects[0] = sheetObjects[0].Reset();
					initSheet(sheetObjects[0],1);
					
					//groupby_gb 세팅
					var col_nm = "";
					var cntr_no_yn = "N";
					var chg_cd_yn = "N";
					for (var i=1; i<=sheetObjects[1].RowCount(); i++) { 
						col_nm = sheetObjects[1].GetCellValue(i,"rpt_itm_id").toLowerCase();
						if(col_nm == "inv069"){
							cntr_no_yn = "Y";
						}
						if(col_nm == "inv096"){
							chg_cd_yn = "Y";
						}
					}
					
					formObj.cntr_no_yn.value = cntr_no_yn;
					formObj.chg_cd_yn.value = chg_cd_yn;
				break;	
				case IBSEARCH_ASYNC03:
					formObj.f_cmd.value = SEARCH03;					
					var sXml = sheetObj.GetSearchData("FNS_INV_0050GS.do", FormQueryString(formObj)+ "&" + ComGetPrefixParam(""));
					
					var sStr = ComGetEtcData(sXml,"bkgNo");					
					formObj.bkg_no.value = sStr;
				break;
				
				case IBSEARCH_ASYNC04:	//Search Customer Info
					formObj.f_cmd.value = SEARCH03;
					
					var CustCntCd = formObj.cust_cnt_cd.value;
					var CustSeq = formObj.cust_seq.value;
					if(CustSeq != ""){
						var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+CustCntCd+"&cust_seq="+CustSeq);	
			
						if(CoInvShowXmlMessage(sXml) != "") {
							formObj.cust_nm.value = "";
							//formObj.cust_seq.value = "";
							//formObj.cust_cnt_cd.value = "";
							
							ComAlertFocus(formObj.cust_nm, CoInvShowXmlMessage(sXml));
							//formObj.cust_nm.focus();
						} else {
							var cust_eng_nm = ComGetEtcData(sXml,"cust_eng_nm");
							var cust_nm = ComGetEtcData(sXml,"cust_nm");
							
							formObj.cust_nm.value = cust_eng_nm;							
						}
					}
				break;
				case IBSEARCH:      //조회
				
				    var bl_nos = "";
				    var blList = formObj.input_bl_no.value;
				    
				    if(blList != "") {
				    	var blArr = blList.split(",");
				    	for(var i = 0; i < blArr.length; i++){
				    		if(i == blArr.length - 1) bl_nos = bl_nos + "'" + blArr[i] + "'";
				    		else bl_nos = bl_nos + "'" + blArr[i] + "',"
				    	}
				    }
				    
				    /*
				    for (var i = 0; i < sheetObjects[2].RowCount(); i++) {
				    	 if (sheetObjects[2].GetCellValue(i+1, "bl_no") != ""){
				   			bl_nos = bl_nos + "'"+ sheetObjects[2].GetCellValue(i+1, "bl_no") + "',";
				    		}
				     } 			    
				    if (bl_nos != ""){
				    	bl_nos = bl_nos + "''";
				    } 
				    
				    if( bl_nos == "" && formObj.input_bl_no.value !=""){
				    	bl_nos = "'"+formObj.input_bl_no.value+ "'";
				    }
				    */
				    
				    formObj.bl_nos.value = bl_nos;
				    sheetObjects[0] = sheetObjects[0].Reset();
			    	initSheet(sheetObjects[0],1);
		
				    				
					if(validateForm(sheetObj,formObj,sAction) == false) return false; 
					sheetObjects[0].RemoveAll();
					
					if(formObj.cust_cnt_cd.value == "" || formObj.cust_seq.value == ""){
						//ComBtnDisable("btn_save"); 
						formObj.save_yn.value="N";
					}else{
						//ComBtnEnable("btn_save");
						formObj.save_yn.value="Y";
					}
					var rpt_itm_id = "";
					var rpt_itm_id_all = "";
					for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
						rpt_itm_id = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
						rpt_itm_id_all = rpt_itm_id_all +"|"+rpt_itm_id;
						formObj.cTmplItem.value = rpt_itm_id_all;
												
						//var str = eval("formObj."+rpt_itm_id);
						//str.value = "Y";
					}
					
	
				 					
					formObj.f_cmd.value = SEARCH;					
					var sXml = sheetObj.GetSearchData("FNS_INV_0050GS.do", FormQueryString(formObj)+ "&" + ComGetPrefixParam(""));
					
					var arrXml = sXml.split("|$$|");

					sheetObjects[0].LoadSearchData(arrXml[0], {Sync:1});
//					sheetObjects[1].LoadSearchXml(arrXml[0], false);
//					initSheet(sheetObjects[0],1);
//					sheetObjects[0].LoadSearchXml(arrXml[1], false);
				break;

				case IBSAVE:        //저장
					if(!validateForm(sheetObj,formObj,sAction)) return;
					if(sheetObj.RowCount() == 0) return;
					formObj.f_cmd.value = MULTI;

					var sParam = ComGetSaveString(sheetObjects, true, true);				
					if (sheetObj.IsDataModified && sParam == "") return; 
	                sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam("");
					//sParam += "&" + FormQueryString(formObj);
					
					var SaveXml = sheetObj.GetSaveData("FNS_INV_0050GS.do", sParam );
					sheetObj.LoadSaveData(SaveXml);
					
					var arrXml = SaveXml.split("|$$|");					
					var reportId = ComGetEtcData(arrXml[0],"reportId");					
					formObj.cust_rpt_id.value = reportId;
				break;
				
				case IBINSERT:      // 입력
				break;

         }
     }

     /** 
      * 업무 자바스크립트 OnChange 이벤트 처리 <br>
      * Template Name 변경시 Template Item을 조회함
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param {IBMultiCombo} comboObj
      * @param {String} oldIndex
      * @param {String} oldText
      * @param {String} oldCode
      * @param {String} newIndex
      * @param {String} newText
      * @param {String} newCode
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */ 
     function rpt_tmplt_nm_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	  var tmp = newCode.split("▶");

    	  document.form.select_tmplt.value = tmp[0];   
    	  document.form.tmplt_ofc_cd.value = tmp[1];

     	  doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC02);
    } 


     /** 
      * 화면 폼입력값에 대한 유효성검증 프로세스 처리하는 validateForm <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : 시트오브젝트  
      * @param  {object} formObj : 폼 오브젝트
      * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
      * @return true, false
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function validateForm(sheetObj,formObj,sAction){
    	
    	 switch (sAction) {
			case IBSEARCH: //조회
				var nextDate = ComGetDateAdd(formObj.from_date.value, "M", 1);
				if (ComReplaceStr(formObj.to_date.value,"-","") >=  ComReplaceStr(nextDate,"-","")) {	
					ComShowCodeMessage("INV00042","From Date","To Date");
					formObj.to_date.focus();  
					return false;
				} 
				
				if (rpt_tmplt_nm.GetSelectText() == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(rpt_tmplt_nm);
					return false;
				}
				if(formObj.sc_no.value == "" && formObj.rfa_no.value == "" && formObj.cust_cnt_cd.value == "" && formObj.bl_nos.value == "" ){
					ComShowCodeMessage('INV00116');
					ComSetFocus(formObj.sc_no);
					return false;					
				}else{
					if(formObj.cust_cnt_cd.value != "" && formObj.cust_seq.value == ""){
						ComShowCodeMessage('INV00004');
						ComSetFocus(formObj.cust_seq);
						return false;	
					}
				}
				if(formObj.from_date.value == "" && formObj.vvd.value == "" && formObj.bl_nos.value == ""){
					ComShowCodeMessage('INV00117');
					ComSetFocus(formObj.from_date);
					return false;
				}
			break;
			case IBSEARCH_ASYNC20: //조회
				if (rpt_tmplt_nm.GetSelectText() == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(rpt_tmplt_nm);
					return false;
				}
			break;
			case IBSAVE: //저장
				if (rpt_tmplt_nm.GetSelectText() == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(rpt_tmplt_nm);
					return false;
				}
				/*				
				if(formObj.save_yn.value != "Y"){
					ComShowCodeMessage('INV00100');
					//ComSetFocus(formObj.cust_cnt_cd);
					return false;
				}				
				if(formObj.cust_gb.value == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(formObj.cust_gb);
					return false;
				}
				if(formObj.cust_cnt_cd.value == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(formObj.cust_cnt_cd);
					return false;
				}
				if(formObj.cust_seq.value == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(formObj.cust_seq);
					return false;
				}
				if(formObj.cust_lgl_eng_nm.value == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(formObj.cust_lgl_eng_nm);
					return false;
				}
				*/
				if(sheetObj.RowCount() > 0){
					if(!ComShowCodeConfirm("INV00045")) return;
				}	
			break;
			case IBSEARCH_ASYNC02:  
				//  Grid setting
				//alert("formObj.change_tmplt.value"+formObj.change_tmplt.value);
				if(formObj.change_tmplt.value == "Y"){
					formObj.change_tmplt.value = "N";
				return false;
				}
    	 }
    	 return true;
     }
     
     /** 
      * 콤보박스 출력시 데이타를 추가하기위해 사용<br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {object} cmbObj :  offc_cd 콤보박스 오브젝트
      * @param  {String} arrStr : combo list  데이타
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function MakeComboObject2(cmbObj, arrStr) {
   		cmbObj.RemoveAll();
   		cmbObj.SetColAlign(0, "left");
   		cmbObj.SetColAlign(1, "left");
		cmbObj.SetColWidth(0, "180");
		cmbObj.SetColWidth(1, "60");
  		for (var i = 0; i < arrStr.length;i++ ) {
  			if(arrStr[i] != ""){
  				var tmplName = arrStr[i].split("▶");
  				//cmbObj.InsertItem(i, arrStr[i], arrStr[i]);
   				//cmbObj.SetColAlign(0, "left|left");
  				//cmbObj.SetColWidth(0, "180|50");
   				cmbObj.InsertItem(i, tmplName[0]+'|'+tmplName[1], arrStr[i] );
  			}
  		}
     		cmbObj.SetDropHeight(190);
  	}
     
     /** 
      * 포커스 이동시 자리수 체크하여 자동으로 이동하도록 설정함 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {object} id_from : 입력되는 form object
      * @param  {object} id_to : 입력 후, 포커스 이동할 form object
      * @param  {number} maxSize : 입력되는 form object의 input value size
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */ 
	function moveNext(id_from,id_to,maxSize) {			
		var cur = document.getElementById(id_from).value;
		curSize = cur.length;
		if (curSize == maxSize) {
			document.getElementById(id_to).focus();
		}
	}
	
	
	/** 
      * onLoad 이벤트핸들러시 호출 오브젝트에 대한 이벤트 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
	function initControl() {
		var formObj = document.form;     
		axon_event.addListenerForm ('blur', 'obj_deactivate', formObj); 
		axon_event.addListenerFormat ('beforeactivate', 'obj_activate', formObj);
        axon_event.addListenerForm ('focusout', 'obj_focusout', formObj);
        axon_event.addListenerForm ('keyup', 'obj_keyup', formObj);      
	}
	
	/** 
	 * 업무 자바스크립트 Onbeforedeactivate 이벤트 처리 (포커스가 나갈 때)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param 없음
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function obj_deactivate(){ 
		var sheetObject = sheetObjects[0];
		var formObj = document.form;
		
		switch(ComGetEvent("name")){ 
			
			case "cust_cd":
				//Grid Charge 의 Cust Code 에 동일하게 넣어줌.
				if (formObj.cust_cd.value != '') {
					var custArray = formObj.cust_cd.value.split(",");
					
					formObj.cust_cnt_cd.value = custArray[0].substring(0,2);
					formObj.cust_seq.value = custArray[0].substring(2);
					
					doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC04); 
				} else {
					formObj.cust_nm.value = '';	
					formObj.cust_cnt_cd.value = '';
					formObj.cust_seq.value = '';
				}
			break;
			case "from_date":
				//입력Validation 확인 및 마스킹 처리
				ComChkObjValid(ComGetEvent());
				ComAddSeparator(form.from_date, "ymd");
			break;
			case "to_date":
				//입력Validation 확인 및 마스킹 처리
				ComChkObjValid(ComGetEvent());
				ComAddSeparator(form.to_date, "ymd");
			break;	
			
		}
	}
	
	/** 
	 * 업무 자바스크립트 OnKeyPress 이벤트 처리 (키보드가 눌릴 때)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param 없음
	 * @return 없음
	 * @see #
	 * @author 한동훈
      	 * @version 2009.10.19
	 */
	function obj_keypress(){
	    switch(event.srcElement.dataformat){
	        case "float":
	            //숫자+"."입력하기
	            ComKeyOnlyNumber(event.srcElement, ".");
	            break;
	        case "ymd":
	            //숫자+"-"입력하기
	        	ComKeyOnlyNumber(event.srcElement);
	            break;
	        case "eng":
	            //영문만 입력하기, 영문+숫자 -> ComKeyOnlyAlphabet('num');
	            ComKeyOnlyAlphabet();
	            break;
	        case "engdn":
	            //영문 소문자만 입력하기, 영문소+숫자 -> ComKeyOnlyAlphabet('lowernum');
	            ComKeyOnlyAlphabet('lower');
	            break;
	        case "engup":
	            //영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum');
	            ComKeyOnlyAlphabet('upper');
	            break;
	        case "num":
	        	//숫자만입력하기(정수,날짜,시간)
	            ComKeyOnlyNumber('num');
	            break;
	        case "uppernum":
	        	//영문대+숫자 
	        	ComKeyOnlyAlphabet('uppernum');
	            break;
	        default:
	            //영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum');
	            ComKeyOnlyAlphabet('upper');
	    }
	}
	
	/** 
     * 업무 자바스크립트 OnBeforeActivate 이벤트 처리 <br> 
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  없음
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
    function obj_activate() {
   	 //마스크 구분자 없애기
   	 ComClearSeparator (ComGetEvent());
    }
	
	/** 
     * 업무 자바스크립트 OnKeyUp 이벤트 처리 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
  	function obj_keyup() {
		var formObject = document.form;
		var evtObj = ComGetEvent();
		switch (ComGetEvent("name")) {
			case "from_date":
				var fromDt = ComReplaceStr(evtObj.value,"-","");
				
				if (fromDt.length == 8) {
					formObject.to_date.focus();
				}
	 		break;	
			case "to_date":
				var condDtTo=ComReplaceStr(ComGetEvent("name"),"-","");
				if (condDtTo.length == 8) {
					//formObject.vvd.focus();
				}
	 		break;
	 	}
	}  	  	
	
	/** 
     * 업무 자바스크립트 OnFocusOut 이벤트 처리 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */ 
  	function obj_focusout() {
  		var sheetObject = sheetObjects[0];
  		var formObject = document.form;
  		switch(ComGetEvent("name")){  			
  			case "cust_seq":
  				if(formObject.cust_seq.value != ""){
  					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC20);
  					formObject.cust_seq.value = ComLpad(formObject.cust_seq.value,6,"0");
  				}
  			break;
			
  			case "input_bl_no":
  				
  	          if (formObject.input_bl_no.value ==""){
  	        	
  	        	sheetObjects[2].SetCellValue(1,  "bl_no", "", 0);
  	        	document.form.bl_nos.value = "" ;
  	          }else{
  	        	 
  	        	document.form.bl_nos.value  = document.form.input_bl_no.value;
  	          }
  	        	  
  			break;
 		
  	    }
  	}
	  	
  	
  	/** 
     * 문자를 받아 6자리만큼 해당 문자를 채워서 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {String} str :  문자
     * @return {String} newStr :  6자리만큼 '0'을 채워서 리턴되는 문자
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */ 
  	function zeroInsert(str){
  	   	 var newStr = '';
  	   	 str = str+"";
  	   	 if(str.length < 6){
  	   	  for(var i=0;i<6-str.length;i++){
  	   	   newStr = newStr + '0'
  	   	  }
  	   	  newStr = newStr + str;
  	   	 }else{
  	   	  newStr = str;
  	   	 }
  	   	 return newStr;
  	   	}
	  	
  	/** 
     * 팝업창(FNS_INV_0086)에서 선택 이벤트 처리시 부모창으로 call하는 함수 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {array} rowArray : 팝업창에서 부모창으로 보내는 값  
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
  	function getFNS_INV_0086(rowArray) {
		var colArray=rowArray[0]; 
		var formObj=document.form;
		formObj.cust_cd.value=colArray[8] + ComLpad(colArray[9], 6, '0');
		formObj.cust_nm.value = colArray[4];
	}
	
  	/** 
     * 팝업창(FNS_INV_0051)에서 선택 이벤트 처리시 부모창으로 call하는 함수 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {array} rowArray : 팝업창에서 부모창으로 보내는 값  
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
  	function getFNS_INV_0051(rowArray,row,col,rpt_tmplt_nm_ofc){
  		sheetObjects[0].RemoveAll();
  		sheetObjects[1].RemoveAll();
  		document.form.change_tmplt.value ="Y";
  		var get_tmplt_nm = "";
  		for(var i=0;i<rowArray.length; i++){
  			var colArray = rowArray[i];
  			//alert(colArray[0]+"||"+colArray[1]+"||"+colArray[2]+"||"+colArray[3]+"||"+colArray[4]+"||"+colArray[5]+"||"+colArray[6]+"||"+colArray[7]+"||"+colArray[8]+"||"+colArray[9]);
  			
  			selRow = sheetObjects[1].DataInsert(-1);

  			sheetObjects[1].SetCellValue(selRow,"itm_seq",colArray[2]);
  			sheetObjects[1].SetCellValue(selRow,"rpt_itm_nm",colArray[3]);
  			sheetObjects[1].SetCellValue(selRow,"usr_def_nm",colArray[4]);
  			sheetObjects[1].SetCellValue(selRow,"rpt_tmplt_nm",colArray[5]);
  			sheetObjects[1].SetCellValue(selRow,"rpt_itm_id",colArray[6]);
  			sheetObjects[1].SetCellValue(selRow,"rpt_auth_id",colArray[7]);
  			//get_tmplt_nm = colArray[5];
  		}
  		get_tmplt_nm = ComReplaceStr(rpt_tmplt_nm_ofc,"|","▶");
  		//sheetObjects[1] 헤더 세팅
  		sheetObjects[0] = sheetObjects[0].Reset();
		initSheet(sheetObjects[0],1);
		if(rpt_tmplt_nm_ofc != ""){
			var itemindex = rpt_tmplt_nm.FindItem (get_tmplt_nm, 0);
			if(itemindex == -1){
				rpt_tmplt_nm.InsertItem(0, rpt_tmplt_nm_ofc, get_tmplt_nm);
			}
			//rpt_tmplt_nm_text.value = colArray[5];
			rpt_tmplt_nm.SetSelectCode(get_tmplt_nm);
			//document.form.rpt_tmplt_nm.FindIndex (colArray[5], 0);
			//alert("get rpt_tmplt_nm------"+rpt_tmplt_nm);
		}
		
		
	//	doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC02);
		
  	}
	
  	/** 
     * 업무 자바스크립트 Sheet의 OnChange 이벤트 처리 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : 시트오브젝트 
     * @param  {int} Row : 포커스가 위치해 있는 sheet의 Row
     * @param  {int} Col : 포커스가 위치해 있는 sheet의 Col 
     * @param  {int} Value : 포커스가 위치해 있는 sheet의 Row,Col 의 value값
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
    function sheet1_OnChange(sheetObj, Row, Col, Value)  {
   	 with(sheetObj){
			if(ColSaveName(Col) == "SelChk"){
				/*
				var chk_flg = "N";
				for (var i=1; i<=sheetObj.RowCount; i++) {
					if(sheetObj.cellText(i, "SelChk") == "1"){
						chk_flg = "Y";
					}
				}
				if(chk_flg == "Y"){
					for (var i=1; i<=sheetObj.RowCount; i++) {
						sheetObj.cellText(i, "SelChk") == "0";
					}
				}
				*/
			}
   	 }	
    }
  
    /** 
     * 업무 자바스크립트 BL rd 호출 이벤트 처리 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} formObject : 폼오브젝트 
     * @param  {String} strBkgNo : booking 번호
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
    function rdOpen(formObject,strBkgNo){    	
		rdUrl = "apps/opus/esm/bkg/outbounddocumentation/outboundblmgt/blissuance/report/"; 
		rdFile = "ESM_BKG_0109_OBL_A4.mrd";
		rdParam = "/rv form_bkgNo[( '" + strBkgNo + "') ]"
			  + "  form_type[7]"
		      + " form_dataOnly[N]"
		      + " form_manifest[N]"
		      + " form_usrId[" +formObject.usr_id.value+"] "
		      + " form_hiddeData[N]"
		      + " form_level[(3)]"
			  + " form_remark[]"
			  + " form_Cntr[1]"
			  + " form_path[]"
			  + " form_mainOnly[Y]"
			  + " form_CorrNo[]"
			  + " form_his_cntr[BKG_CONTAINER]"
			  + " form_his_bkg[BKG_BOOKING]"
			  + " form_his_mkd[BKG_BL_MK_DESC]"
			  + " form_his_xpt[BKG_XPT_IMP_LIC]"
			  + " form_his_bl[BKG_BL_DOC]"
			  + " isEncode[N]"
		      + " form_rqst_via_cd[]"
		      + " form_his_bl_mkd[BKG_BL_ISS]"
		      + " form_end_no[1]"
		      + " form_esig[]"
		      + " form_cpy_esig[N]"
		      + " form_knt_flg[]"
		      + " form_count[]"
			  + " /rp []"
			  + " /riprnmargin";
		formObject.com_mrdTitle.value = "Draft B/L Copies";
		formObject.com_mrdPath.value = rdUrl+rdFile;
		formObject.com_mrdArguments.value = rdParam + " /rwait";
		formObject.com_mrdBodyTitle.value="Draft B/L Copies";
		ComOpenRDPopup('resizable=yes, width=900, height=620');
    }
  	
     /**
      * B/L No. 값 설정
      */
     function setBlNo(sheetObj, param) {

     	var formObject = document.form;
     	var rect = document.getElementById("td_bl_no").getBoundingClientRect();

     	formObject.rect_top.value = formObject.rect_top.value == "" ? rect.top : formObject.rect_top.value;
     	formObject.rect_left.value = formObject.rect_left.value == "" ? rect.left : formObject.rect_left.value;

     	if (param == 1) {

     		//  sheet 활성화
     		document.getElementById("bl_input").style.display = "none";
     		document.getElementById("bl_sheet").style.display = "block";

     		//  sheet 위치설정
     		document.getElementById("bl_sheet").style.top = formObject.rect_top.value;
     		document.getElementById("bl_sheet").style.left = formObject.rect_left.value;

     		var BlNoselectRow = !ComIsEmpty(formObject.sheet_bl_no_row_chk) ? formObject.sheet_bl_no_row_chk.value : "1";

     		if (!ComIsEmpty(formObject.input_bl_no)) {
     			sheetObj.SetCellValue(BlNoselectRow,  "bl_no", formObject.input_bl_no.value, 0);
     		}
     		sheetObj.SelectCell(BlNoselectRow,  "bl_no");
     	} else if (param == 2) {
     		// input 활성화
     		document.getElementById("bl_input").style.display = "block";
     		document.getElementById("bl_sheet").style.display = "none";
     		
     		for ( var i = sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++) {
     			if (!ComIsEmpty(sheetObj.GetCellValue(i,  "bl_no"))) {
     				formObject.sheet_bl_no_row_chk.value = i;
     				formObject.input_bl_no.value = sheetObj.GetCellValue(i,  "bl_no");
     				
     				break;
     			}
     		}
     	} else if (param == 3) {
     		if (document.getElementById("bl_sheet").style.display == "block") {
     			setBlNo(sheetObj, 2);
     		}
     	}

     } 
 /**
  * 페이지 초기화
  */      
      function pageReset(sheetObj, formObject) {

    		for ( var i = sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++) {
    			sheetObj.SetCellValue(i, "bl_no", "", 0);
    		}
    		formObject.input_bl_no.value = "";
    		initSheet(sheetObj,3);
    		//setBlSheet();
    		//setBlNo(sheetObj, 2);
    		//formObject.reset();

    
    	}
  
  function sc_no_OnChange(){
	  document.form.change_tmplt.value ="N";
	  doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC02);  	
	    } 
  function rfa_no_OnChange(){
	  document.form.change_tmplt.value ="N";
	  doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC02);   	
  }  
  
  function resizeSheet(){
		ComResizeSheet(sheetObjects[0],70);
	}
     
  function setBlSheet(){
		var formObject = document.form;
		
		// row 50개 생성 후
		// input_bl_no.value 값을 초기 Row에 설정 후
		// 타이틀 제거
			
		document.getElementById("bl_sheet").style.display = "block";
		
		for ( var i = 1; i <= 50; i++) {
		    sheetObjects[2].DataInsert(-1);
		    sheetObjects[2].SetCellValue(i, "ibflag", "R");
		}
		
		sheetObjects[2].SetCellValue(1,  "bl_no", formObject.input_bl_no.value, 0);
		sheetObjects[2].SelectCell(1, "bl_no");
		sheetObjects[2].SetRowHidden(0,1);
		
		document.getElementById("bl_sheet").style.display = "none";
  }
  
  function openMultipleinquiry(obj, obj2, obj3) { 
		var param="?returnval="+obj+"&returntitle="+obj2+"&entvalues="+obj3;

		ComOpenPopup('/opuscntr/FNS_INV_0901.do' + param, 420, 415, "getFNS_INV_0901", '0,1', true);
  }
  
  function getFNS_INV_0901(rowArray, obj) {  
		var reObj="";
		var formObject=document.form;
		
		for(var i=0; i<rowArray.length; i++) {
			var colArray=rowArray[i];
			if( i == rowArray.length-1 ) {
				reObj=reObj + colArray;
			} else {
				reObj=reObj + colArray + ",";
			}
		}
		
		if( obj == "BLNO" ) {
			formObject.input_bl_no.value=reObj;
		} else if( obj == "CUST" ) { 
			formObject.cust_cd.value=reObj;
			if (formObject.cust_cd.value != '') {
				var custArray = formObject.cust_cd.value.split(",");
				 
				formObject.cust_cnt_cd.value = custArray[0].substring(0,2);
				formObject.cust_seq.value = custArray[0].substring(2);
				
				doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC04);   
			} else {
				formObject.cust_nm.value = '';		
			}
		}
	}
	/* 개발자 작업  끝 */