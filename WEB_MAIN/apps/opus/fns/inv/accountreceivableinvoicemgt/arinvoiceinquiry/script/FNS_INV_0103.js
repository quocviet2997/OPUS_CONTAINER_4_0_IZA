/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0103.js
*@FileTitle : CPR Download History Inquiry
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.13 박성용
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
     * @author 한진해운
     */
    
   	/* 개발자 작업	*/


	 // 공통전역변수
	 var sheetObjects = new Array();
	 var sheetCnt = 0;
	
	//IBMultiCombo
		var comboObjects = new Array();
		var combo1 = null;
		var comboCnt = 0;
	 
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
                 case "btn1_Retrieve":
                	 doActionIBSheet(sheetObject1,formObject,IBSEARCH);
                 break; 

 				case "btn1_New":
 					ComResetAll();		
 					cust_rpt_id_arr.RemoveAll();
                 break;

 				case "btn1_Down_Excel":
 					if(sheetObject1.RowCount() < 1){//no data
 						ComShowCodeMessage("COM132501");
		            }else{
		                sheetObject1.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
		            }
                 break;

 				case "btn_close":
 					window.close();
                 break;
                 
 				case "btns_report": //report id 조회버튼
 					var v_cust_rpt_id = formObject.cust_rpt_id.value;
 					var classId = "FNS_INV_0104";
 					var param = '?cust_rpt_id='+v_cust_rpt_id+'&pop_yn=Y&classId='+classId;
 			
 					//ComOpenPopup('/opuscntr/FNS_INV_0104.do' + param, 700, 460, 'getFNS_INV_0104', '0,0,1,1,1', false, false,0,0,0,"104pop");
 					ComOpenPopup('/opuscntr/FNS_INV_0104.do' + param, 700, 460, 'getFNS_INV_0104', '0,1', true, false);
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
    	 * 페이지에 생성된 IBCombo Object를 comboObjects 배열에 등록 <br>
    	 * <br><b>Example :</b>
    	 * <pre>
    	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
    	 * 배열은 소스 상단에 정의
    	 * </pre>
    	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
    	 * @return 없음
    	 * @see #
    	 * @author 한동훈
    	 * @version 2009.10.19
    	 */
    	function setComboObject(combo_obj){
    		comboObjects[comboCnt++] = combo_obj;
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
       //IBMultiCombo초기화
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
    		
        ComSetFocus(cust_rpt_id_arr);
     }
     
     /** 
    	 * 콤보 초기설정값<br>
    	 * <br><b>Example :</b>
    	 * <pre>
    	 * 
    	 * </pre>
    	 * @param {IBMultiCombo} comboObj  comboObj
    	 * @return 없음
    	 * @see #
    	 * @author 박정진
    	 * @version 2009.10.19
    	 */
      	function initCombo(comboObj, comboNo) {
    		switch (comboObj.id) {
    			case "cust_rpt_id_arr":
    				with (comboObj) {
    					ValidChar(2,1);
    					SetMaxLength(30);
    				}
    				break;   			
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
 					
            	  	var HeadTitle1="|Report ID|Creation Date|B/L No.|POR|POL|POD|DEL|Trunk VVD|S/C No.|RFA No.|PPD(USD TTL)|CCT(USD TTL)|3RD(USD TTL)";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
					var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);
            	  
					var cols = [ {Type:"Status",    Hidden:1, Width:0,   Align:"Center",  ColMerge:1,   SaveName:"ib" },
					             {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:1,   SaveName:"cust_rpt_id",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"cre_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"por_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"del_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"trnk_vvd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"sc_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"rfa_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Float",      Hidden:0,  Width:100,   Align:"Right",  ColMerge:1,   SaveName:"ppd_usd_ttl_amt",        KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Float",      Hidden:0,  Width:100,   Align:"Right",  ColMerge:1,   SaveName:"clt_usd_ttl_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Float",      Hidden:0, Width:100,   Align:"Right",  ColMerge:1,   SaveName:"n3rd_payr_usd_ttl_amt",              KeyField:0,   CalcLogic:"",   Format:"NullFloat",            PointCount:2,   UpdateEdit:0,   InsertEdit:0 } ];
					             
					InitColumns(cols);
					//SetCountPosition(0);
					SetEditable(1);
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
     function doActionIBSheet(sheetObj,formObj,sAction) {
         sheetObj.ShowDebugMsg = false;
         switch(sAction) {
 			case IBSEARCH:      //조회
 				if(validateForm(sheetObj,formObj,sAction) == false) return false;  
 				//cust_rpt_id_text();
 				formObj.f_cmd.value = SEARCH;					
				var sXml = sheetObj.GetSearchData("FNS_INV_0103GS.do" , FormQueryString(formObj));
				var arrXml = sXml.split("|$$|");
				
				sheetObjects[0].LoadSearchData(arrXml[0], {Sync:1});
				
 			break;

 			case IBSAVE:        //저장
           		if(validateForm(sheetObj,formObj,sAction))
                   alert (" Save .. ");
 			break;

 			case IBINSERT:      // 입력

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
			case IBSEARCH: //조회
				if (cust_rpt_id_arr.GetSelectText() == ""){					
					ComShowCodeMessage('INV00004');
					ComSetFocus(cust_rpt_id_arr);
					return false;
				}							
			break;
	 	 }
	 	 return true;
     }
     
     /** 
      * Report ID 변경시 해당 아이템을 대문자로 변경한다. <br>
      * 신규 Report ID 입력시 대문자변경
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
     function cust_rpt_id_arr_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	 if(newText != ""){
    		 //var upperText = newText.toUpperCase();
    		 var itemindex = comboObj.FindItem ( newText, 0);
    		 if(itemindex==-1){
    			 var cust_rpt_id = document.form.cust_rpt_id.value;
    			 if(comboObj.GetItemCount() == 0){
    				 document.form.cust_rpt_id.value = newText;
    			 }else{
    				 document.form.cust_rpt_id.value = cust_rpt_id + "','"+newText;
    			 }
    			 comboObj.InsertItem(0,newText,newText);  
    			 comboObj.SetSelectCode(newText);
    		 }
    		 //comboObj.Text2 = upperText;
    	 }
     }
     
     /** 
      * 조회시 Report ID 에 있는 값을 text로 변경하여 조회한다. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function cust_rpt_id_text(){
    	 var cmbObj = document.form.cust_rpt_id_arr;
    	 for(var i=1;i<=cmbObj.GetCount(); i++){
    		 //var itemindex = comboObj.FindIndex ( , i);
    		 //alert(cmbObj.GetText(i,1));
    	 }
    	 alert(cmbObj.Index);
    	 alert(cmbObj.GetText("TEST",0));
    	 alert(cmbObj.GetText(1,1));
    	 alert(cmbObj.GetText(0,1));
    	 alert(cmbObj.GetText(1,0));
    	 alert(cmbObj.GetText(2,1));
    	 alert(cmbObj.GetText(0,1));
    	 alert(cmbObj.GetText(2,0));
    	 
     }
     
     /** 
      * 팝업창(FNS_INV_0104)에서 선택 이벤트 처리시 부모창으로 call하는 함수 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {array} rowArray : 팝업창에서 부모창으로 보내는 값  
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
    function getFNS_INV_0104(rowArray) {    	
    	var cmbObj = cust_rpt_id_arr;
    	cmbObj.RemoveAll();
    	
    	document.form.cust_rpt_id.value = "";
 		var cust_rpt_id = "";
 		
    	for(var i=0;i<rowArray.length; i++){
    		var colArray = rowArray[i];
    		//alert(colArray);
    		cmbObj.InsertItem(i, colArray[3], colArray[3]);
    		if(i==0){
    			//cmbObj.Text2 = colArray[3];
    			cmbObj.SetSelectCode(colArray[3]);
    		}
    		if(rowArray.length == 1){
    			cust_rpt_id = colArray[3];
    		}else{
	    		if(i==0){
	    			cust_rpt_id += colArray[3]+"',";
	    		}else if(i==rowArray.length-1){
	    			cust_rpt_id += "'"+colArray[3];
	    		}else{
	    			cust_rpt_id += "'"+colArray[3]+"',";
	    		}
    		}
    	}
    	if(cust_rpt_id != ""){
    		document.form.cust_rpt_id.value = cust_rpt_id;
    	}
    	
 	}
    /*
     function getFNS_INV_0104(rowArray) {
    	var targetE = document.form.cust_rpt_id_arr; 		
 		removeCombo(targetE);

 		document.form.cust_rpt_id.value = "";
 		var cust_rpt_id = "";

    	for(var i=0;i<rowArray.length; i++){
    		var colArray = rowArray[i];
    		//alert(colArray[3]);
    		addOption(colArray[3],colArray[3], targetE);
    		if(rowArray.length == 1){
    			cust_rpt_id = colArray[3];
    		}else{
	    		if(i==0){
	    			cust_rpt_id += colArray[3]+"',";
	    		}else if(i==rowArray.length-1){
	    			cust_rpt_id += "'"+colArray[3];
	    		}else{
	    			cust_rpt_id += "'"+colArray[3]+"',";
	    		}
    		}	
    	}
    	if(cust_rpt_id != ""){
    		document.form.cust_rpt_id.value = cust_rpt_id;
    	}
 	}
     */
    
    /** 
     * 해당 콤보박스에 값을 세팅함. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {String} text : 콤보박스의 text 값
     * @param  {String} value : 콤보박스의 value 값
     * @param  {object} e : 콤보박스의 오브젝트 값
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
    function addOption(text,value, e){
 	    var o = new Option(text,value);
 	    try{
 	        e.add(o);
 	    }catch(ee){
 	        e.add(o, null);
 	    }
 	}
     
    /** 
     * 해당 콤보박스에 값을 모두 삭제함. <br>
     * <br><b>Example :</b>
     * <pre>
     * </pre>
     * @param  {object} e : 콤보박스의 오브젝트 값
     * @return 없음
     * @see #
     * @author 한동훈
     * @version 2009.10.19
     */
     function removeCombo(e){   
 	    for(var i = 0, limit = e.options.length; i < limit; ++i){
 	       e.remove(0);
 	    }
 	}
     
     function resizeSheet(){
 		ComResizeSheet(sheetObjects[0]);
 	}
	/* 개발자 작업  끝 */