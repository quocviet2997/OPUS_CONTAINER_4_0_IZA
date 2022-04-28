/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0102.js
*@FileTitle : Code Conversion for CPR
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.14 박성용
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
                 case "btn2_Row_Add":
                	 if(ComIsEmpty(formObject.sc_no2.value) && ComIsEmpty(formObject.rfa_no2.value)) return;
                	 doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
                 break; 

 				case "btn2_Row_Delete": 					
 					if(!validateForm(sheetObjects[0],formObject,IBDELETE)) {
        				return false;
        			}
 					ComRowHideDelete(sheetObjects[0], "DelChk");
                 break;

 				case "btn1_Retrieve":
 					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
                 break; 

 				case "btn1_New":
 					ComResetAll();
                 break;

 				case "btn1_Save":
 					doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
                 break;
    
 				case "btn1_Down_Excel": 	
 					if(sheetObject1.RowCount() < 1){//no data
 						ComShowCodeMessage("COM132501");
		            }else{
		                sheetObject1.Down2Excel({KeyFieldMark:false,DownCols:"|co_cd_ctnt|cust_conv_cd_ctnt|cd_rmk", SheetDesign:1,Merge:1 });
		            }
                 break; 

 				case "btn1_Load_Excel":
 					sheetObject1.LoadExcel({Mode:"HeaderSkip", Append:1, ColumnMapping:"|||1|2|3" });
 					//sheetObject1.LoadExcel({Mode:"NoHeader", Append:1, ColumnMapping:"1=>co_cd_ctnt|2=>cust_conv_cd_ctnt|3=>cd_rmk" });
 					//sheetObjects[0].LoadExcel();
 					//sheetObjects[0].LoadExcel(0, 1, "", "-1", "-1", "", true, false, "1=>co_cd_ctnt|2=>cust_conv_cd_ctnt|3=>cd_rmk");
 					//copy_end(sheetObjects[0],formObject)
                 break;

 				case "btn1_Copy_to_New":
 					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC05);
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
        sheetObjects[sheetCnt++] = sheet_obj;
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
         ComSetFocus(document.form.sc_no2);
         initControl();
         axon_event.addListenerForm ('focusout', 'obj_focusout', document.form);
         axon_event.addListenerForm ('keyup', 'obj_keyup', document.form);
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
	    //Axon 이벤트 처리1. 이벤트catch(개발자변경)
	    //axon_event.addListenerFormat('keypress',       'obj_keypress',    form); //- 키보드 입력할때
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
         switch(sheetObj.id) {
              case "sheet1":      //sheet1 init
                 with (sheetObj) {
            	  
            	  	var HeadTitle1="|Sel|Seq.|Company Code|Customer's Code|Remark(s)|sc_no|rfa_no|cprt_conv_tp_cd";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
					var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);
            	  
					var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
					             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
					             {Type:"Seq",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:0,  Width:300,   Align:"Center",  ColMerge:1,   SaveName:"co_cd_ctnt",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:20 },
					             {Type:"Text",      Hidden:0,  Width:300,  Align:"Center",  ColMerge:1,   SaveName:"cust_conv_cd_ctnt", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:20 },
					             {Type:"Text",      Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"cd_rmk",         	 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:100 },
					             {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"sc_no",      		KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"rfa_no",         	KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"cprt_conv_tp_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
					             
					InitColumns(cols);
					//SetCountPosition(0);
					SetEditable(1);
					SetColProperty(0 ,"co_cd_ctnt" , {AcceptKeys:"E|N", InputCaseSensitive:1});
					SetColProperty(0 ,"cust_conv_cd_ctnt" , {AcceptKeys:"E|N", InputCaseSensitive:1});
					//SetSheetHeight(170);
					resizeSheet();

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
     function doActionIBSheet(sheetObj,formObj,sAction, Row, Col, Val) {
         sheetObj.ShowDebugMsg = false;
         switch(sAction) {         
         	case IBSEARCH_ASYNC01:      //조회		         		
				var Val = formObj.sc_no2.value;
				if(Val != ""){
					formObj.sc_no.value = Val;
					formObj.rfa_no.value = "X";
					formObj.f_cmd.value = SEARCH01;					
					var sXml = sheetObj.GetSearchData("FNS_INV_0102GS.do", FormQueryString(formObj));
					
					var arrXml = sXml.split("|$$|");
					var dataVal = ComGetEtcData(arrXml[0],"customerName");
					
					if(dataVal == ""){          											
						ComShowCodeMessage("INV00041","["+Val+"]");
						formObj.sc_nm.value = "";
						formObj.sc_no2.value = "";
						ComSetFocus(formObj.sc_no2);
						return;
					}else{
						formObj.sc_nm.value = dataVal;
						doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
					}
				}	
            break; 
         	case IBSEARCH_ASYNC02:      //조회	
         		var Val = formObj.rfa_no2.value;
				if(Val != ""){
					formObj.rfa_no.value = Val;
					formObj.sc_no.value = "X";
					formObj.f_cmd.value = SEARCH01;					
					var sXml = sheetObj.GetSearchData("FNS_INV_0102GS.do", FormQueryString(formObj));
					
					var arrXml = sXml.split("|$$|");
					var dataVal = ComGetEtcData(arrXml[0],"customerName");
					
					if(dataVal == ""){          											
						ComShowCodeMessage("INV00041","["+Val+"]");
						formObj.rfa_nm.value = "";
						formObj.rfa_no2.value = ""; 
						ComSetFocus(formObj.rfa_no2);						
					}else{
						formObj.rfa_nm.value = dataVal;
						doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
					}
				}
            break;
         	case IBSEARCH_ASYNC04:      //조회	
         		var Val = formObj.copy_text.value;
				if(Val != ""){					
					formObj.f_cmd.value = SEARCH03;					
					var sXml = sheetObj.GetSearchData("FNS_INV_0102GS.do", FormQueryString(formObj));
					
					var arrXml = sXml.split("|$$|");
					var dataVal = ComGetEtcData(arrXml[0],"customerName");
					
					if(dataVal == ""){
						ComShowCodeMessage("INV00041","["+Val+"]");
						formObj.copy_text.value = "";
						ComSetFocus(formObj.copy_text);						
					}else{

					}
				}
            break;
 			case IBSEARCH:      //조회
 				if(validateForm(sheetObj,formObj,sAction) == false) return false;
				formObj.f_cmd.value = SEARCH;
				
				formObj.sc_no.value = formObj.sc_no2.value;
				formObj.rfa_no.value = formObj.rfa_no2.value;
				
				if(formObj.sc_no.value == "") formObj.sc_no.value = "X";
				if(formObj.rfa_no.value == "") formObj.rfa_no.value = "X";
				
				sheetObj.DoSearch("FNS_INV_0102GS.do", FormQueryString(formObj), {Sync:2});								
				
				for (var i=1; i<=sheetObj.RowCount(); i++) {
					sheetObj.SetCellEditable(i,'co_cd_ctnt', 0);
				}
				
 			break;
 			case IBSEARCH_ASYNC03:      //조회	
				if(Val != ""){
					formObj.f_cmd.value = SEARCH02;
					var sXml = sheetObj.GetSearchData("FNS_INV_0102GS.do", FormQueryString(formObj));
					
					var arrXml = sXml.split("|$$|");
					var dataVal = ComGetEtcData(arrXml[0],"coCode");
					if(dataVal == ""){
						ComShowCodeMessage("INV00041","["+Val+"]");	
						sheetObj.SelectCell(Row, Col);
					}
				}
            break;   
 			case IBSAVE:        //저장
 				if(!validateForm(sheetObj,formObj,sAction)) return;
				if(sheetObj.RowCount() == 0) return;
				formObj.f_cmd.value = MULTI;
				//var result = sheetObj.DoSave("FNS_INV_0020GS.do", FormQueryString(formObj));
				//return;
				var sParam = ComGetSaveString(sheetObjects);
				if (sParam == "") return; 

                sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
				var SaveXml = sheetObj.GetSaveData("FNS_INV_0102GS.do", sParam );
				sheetObj.LoadSaveData(SaveXml);
				if (SaveXml.indexOf(">OK<") > -1){
					for (var i=1; i<=sheetObj.RowCount(); i++) {
						sheetObj.SetCellEditable(i,'co_cd_ctnt',0);
					}
				}
 			break;

 			case IBINSERT:      // 입력
 				var sheetIdx = sheetObj.DataInsert(-1);
				sheetObj.SetCellText(sheetIdx,"sc_no",formObj.sc_no.value);
				sheetObj.SetCellText(sheetIdx,"rfa_no",formObj.rfa_no.value);
				sheetObj.SetCellText(sheetIdx,"cprt_conv_tp_cd",formObj.cdTp.value);
 			break;
 			case IBSEARCH_ASYNC05:      // 복사
 				if(!validateForm(sheetObj,formObj,sAction)) return;
 				if(sheetObj.RowCount() == 0) return; 				
 				
				var sParam = ComGetSaveString(sheetObjects);
				if (sheetObj.IsDataModified && sParam == "") return; 
				
				formObj.f_cmd.value = MULTI01;
				
				var copy_sc_no = formObj.copy_text.value;
				var copy_rfa_no = formObj.copy_text.value;
				if(formObj.copy_gb[0].checked != true){
					copy_sc_no = "X";
				}
				if(formObj.copy_gb[1].checked != true){
					copy_rfa_no = "X";
				}
				
				for (var i=1; i<=sheetObj.RowCount(); i++) {
					sheetObj.SetCellText(i,"sc_no",copy_sc_no);
					sheetObj.SetCellText(i,"rfa_no",copy_rfa_no);
					sheetObj.SetCellText(i,"cprt_conv_tp_cd",formObj.cdTp.value);
				}				
				
                //sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
				//var SaveXml = sheetObj.GetSaveXml("FNS_INV_0102GS.do", sParam );
				var params = FormQueryString(formObj);	
				params = params + "&" + ComSetPrifix(sheetObj.GetSaveString(false, true, "DelChk"),"sheet1_");
				var SaveXml = sheetObj.GetSaveData("FNS_INV_0102GS.do", params );
				sheetObj.LoadSaveData(SaveXml);
				if (SaveXml.indexOf(">OK<") > -1){
					doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
					formObj.copy_text.value = "";
				}
 	 		break;
         }
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
 			case IBDELETE:
	 			if (sheetObj.CheckedRows("DelChk") == 0) {
	 				ComShowMessage(msgs["INV00025"]);
	 				return false;
	 			} else if (sheetObj.CheckedRows("DelChk") > 0) {
	 				if(!ComShowCodeConfirm("INV00028")) return;
	 			}
	 			break;
 			case IBSEARCH:
 				if (ComIsNull(formObj.sc_no2) && ComIsNull(formObj.rfa_no2)) {
	         		ComShowCodeMessage('INV00004');
    				ComSetFocus(form.sc_no2);
	 				return false;
	 			}
 				/*
 				if (formObj.sc_no2.value == "" || formObj.rfa_no2.value =="") {
	         		ComShowCodeMessage('INV00004');
    				ComSetFocus(form.sc_no2);
	 				return false;
	 			}*/
 				break;
 			case IBSAVE:
 				
 				break;
 				
     	}
         return true;
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
 			case "sc_no2":
 				doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC01);
 			break;
 			case "rfa_no2":
 				doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC02);
 			break;
 			case "copy_text": 			
 				doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC04);
 				/*
 				if(formObject.copy_gb[0].checked == true){
 					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC04);
 				}
 				if(formObject.copy_gb[1].checked == true){
 					doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC05);
 				}*/
 			break; 			
 	    }
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
 		var sheetObject = sheetObjects[0];
 		var formObject = document.form;
 		switch(ComGetEvent("name")){
 			case "sc_no2":
 				if(formObject.sc_no2.value == "") {
 					formObject.sc_nm.value = "";
 				}
 			break;
 			case "rfa_no2":
 				if(formObject.rfa_no2.value == "") {
 					formObject.rfa_nm.value = "";
 				}
 			break;
 		}	
	}
 	
     /** 
      * 업무 자바스크립트 OnChange 이벤트 처리 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {object} obj : 폼 오브젝트
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */ 
 	function text_onChange(obj){
 		/*
 		var formObject = document.form;
 		switch(obj.name){
 			case "sc_no2":
				doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC01);
			break;
			case "rfa_no2":
				doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC02);
			break;
			case "copy_text":
				
			break; 			
	    }
	    */
 	}
 	
 	function cdTp_onChange(){
 		if(!ComIsEmpty(document.form.sc_no2.value) || !ComIsEmpty(document.form.rfa_no2.value)) {
 			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
 		}
 	}
 	
 	/** 
     * 업무 자바스크립트 Sheet의 OnSelectCell 이벤트 처리 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : 시트오브젝트  
     * @param  {int} OldRow : 포커스가 이동하기 전에 위치해 있는 sheet의 Row
     * @param  {int} OldCol : 포커스가 이동하기 전에 위치해 있는 sheet의 Col
     * @param  {int} NewRow : 포커스가 이동한 후에 위치해 있는 sheet의 Row
     * @param  {int} NewCol : 포커스가 이동한 후에 위치해 있는 sheet의 Col
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
 	function sheet1_OnSelectCell(sheetObj, OldRow, OldCol, NewRow, NewCol){
  		var Val = sheetObj.GetCellText(OldRow,OldCol);
  		sheet1_OnChange_event(sheetObj,OldRow,OldCol, Val);
  	}  
 	
 	/** 
     * 업무 자바스크립트 Sheet의 OnChange 이벤트 처리 <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : 시트오브젝트 
     * @param  {int} Row : 포커스가 위치해 있는 sheet의 Row
     * @param  {int} Col : 포커스가 위치해 있는 sheet의 Col 
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
 	function sheet1_OnChange(sheetObj, Row, Col){
  		var Val = sheetObj.GetCellText(Row,Col);
		sheet1_OnChange_event(sheetObj,Row,Col, Val);
  	}
 	
 	/** 
     * 업무 자바스크립트 Sheet의 OnChange 이벤트에서 호출하는 함수<br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : 시트오브젝트 
     * @param  {int} Row : 포커스가 위치해 있는 sheet의 Row
     * @param  {int} Col : 포커스가 위치해 있는 sheet의 Col 
     * @param  {int} Val : 포커스가 위치해 있는 sheet의 Row,Col의 value값
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
 	function sheet1_OnChange_event(sheetObj,Row,Col, Val){
 		if(sheetObj.GetCellEditable(Row, Col) == 0) return; 
 		if (sheetObj.ColSaveName(Col) == "co_cd_ctnt") {
 			document.form.cd.value = Val;
  			doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC03, Row, Col, Val);
  		}
 	}
    
 	/** 
     * excel load 후, 기본 값 세팅<br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {IBSheet} sheetObj : 시트오브젝트 
     * @param  {object} formObj : 폼 오브젝트
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
 	function sheet1_OnLoadExcel(sheetObj, result, code, msg){
 		if(isExceedMaxRow(msg))return; 
 		var sheetObj = sheetObjects[0];
 		var formObj = document.form;
 		
 		for (var i=1; i<=sheetObj.RowCount(); i++) {
 			sheetObj.SetCellText(i,"sc_no",formObj.sc_no.value);
			sheetObj.SetCellText(i,"rfa_no",formObj.rfa_no.value);
			sheetObj.SetCellText(i,"cprt_conv_tp_cd",formObj.cdTp.value);
		}
 	}
 	
 	function resizeSheet(){
		ComResizeSheet(sheetObjects[0],70);
 	}
	/* 개발자 작업  끝 */