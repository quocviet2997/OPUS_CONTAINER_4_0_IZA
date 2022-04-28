/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName :FNS_INV_0120.js
*@FileTitle : India GST Rate Creation
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2017.04.19 HYUN HWA KIM
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
      * IBSheet Object를 sheetObjects 배열로 등록 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj IBSheet Object
      * @return 없음
      * @see #
      * @author
      * @version 
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
      * @author 
      * @version 
      */
     function loadPage() {
    	  for(i=0;i<sheetObjects.length;i++){
  			ComConfigSheet (sheetObjects[i] );
  			initSheet(sheetObjects[i],i+1);
  			ComEndConfigSheet(sheetObjects[i]);
  		}
    	ComBtnDisable("btn_RowAdd");
		ComBtnDisable("btn_Delete");
    	  document.form.cnt_cd.value = "IN";
      }
     
	 /** 
	 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  없음  
	 * @return 없음
	 * @see #
	 * @author 
	 * @version 
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
            case "btns_calendar1": 
                var cal=new ComCalendar();
                cal.setDisplayType('date');
                cal.select(formObject.f_date, 'yyyy-MM-dd');
            break;
            case "btns_calendar2": 
                var cal=new ComCalendar();
                cal.setDisplayType('date');
                cal.select(formObject.t_date, 'yyyy-MM-dd');
            break;
			case "btn_retrive":
				doActionIBSheet(sheetObject,formObject,IBSEARCH);
				break;
			case "btn_new":
				formObject.f_date.value="";
				formObject.t_date.value="";
				formObject.ste_cd.value="";
				formObject.io_bnd_cd.value="";
				formObject.delt_flg.value="N";
				sheetObject.RemoveAll();
		    	ComBtnDisable("btn_RowAdd");
				ComBtnDisable("btn_Delete");
				break;
			case "btn_Save":
           	 	doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
                break;
			case "btn_downExcel": 	
				if(sheetObject.RowCount() < 1){//no data						
					ComShowCodeMessage("COM132501");
				}else{
					sheetObject.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1 });
				}				
				break;
			case "btn_RowAdd":
				var idx = sheetObject.DataInsert(-1);
				sheetObject.SetCellValue(idx,"cnt_cd",document.form.cnt_cd.value);
				sheetObject.SetCellValue(idx,"ofc_cd",document.form.log_ofc_cd.value);
				sheetObject.SetCellValue(idx,"delt_flg","N");
                break;
             case "btn_Delete":
            	 if(!validateForm(sheetObjects[0],formObject,IBDELETE)) {
     				return false;
     			 }
            	ComRowHideDelete(sheetObjects[0], "DelChk");
            	break;
             case "btn_Retrieve":
            	doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
                break;
             case "btn_search":
            	 openFnsInv0121();
            	break;
			} // end switch
		} catch(e) {
			if( e == "[object Error]") {
				ComShowMessage(OBJECT_ERROR);
			} else {
				ComShowMessage(e.message);
			}
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
// 	 			if (sheetObj.CheckedRows("DelChk") == 0) {
// 	 				ComShowMessage(msgs["INV00025"]);
// 	 				return false;
// 	 			} else if (sheetObj.CheckedRows("DelChk") > 0) {
// 	 				if(!ComShowCodeConfirm("INV00028")) return;
// 	 			}
 	 			break;
  			case IBSEARCH:
  				if((formObj.f_date.value == "") || (formObj.t_date.value == "")) {                   
  		             ComShowCodeMessage("INV00004");
  		           formObj.f_date.focus();
  		             return false;
  		         }
  				break;
  			case IBSAVE:
  				
  				break;
  				
     	}
          return true;
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
	 * @author 김현화
      	 * @version 2011.03.04
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
 
//    function obj_focusout() {
//    	
//    	 
//    	var formObject = document.form;
//		switch(ComGetEvent("name")){
//			case "cprt_val_ctnt":
//				  //alert("obj_focusout");
//				 doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC01);
//    		break;
//	
//	    }
//	}
//  
     
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
      * @author 김현화
      * @version 2011.03.04
      */
     function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
		case 1:      //t1sheet1 init
		    with(sheetObj){			        
			      var HeadTitle="|Sel|Seq.|TS|CNT|OFC|LCL.State|State|Service Accounting|Bound|Tax Kind|Rate|From date|To date|Del.|Last Update Date";
		
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      
		
			      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
			             {Type:"DummyCheck", Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
			             {Type:"Seq",        Hidden:0,  Width:47,   Align:"Center",  ColMerge:1,   SaveName:"SEQ",             KeyField:0,   CalcLogic:"",   Format:"" },
			             {Type:"Text",       Hidden:1,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"tax_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   },
			             {Type:"Text",       Hidden:1,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"cnt_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:2, InputCaseSensitive:1},
			             {Type:"Text",       Hidden:1,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"ofc_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:6, InputCaseSensitive:1},
			             {Type:"Text",       Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"locl_ste_cd",     KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3, InputCaseSensitive:1},
			             {Type:"Text",       Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"ste_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			             {Type:"Text",       Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"locl_chg_grp_cd", KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:8, InputCaseSensitive:1, AcceptKeys:"E|N" },
			             {Type:"Combo",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",       KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"tax_chg_cd",      KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3, InputCaseSensitive:1, AcceptKeys:"E|N" },
			             {Type:"Text",       Hidden:0,  Width:200,  Align:"Right",   ColMerge:1,   SaveName:"tax_rt",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:4,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",       Hidden:0,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"eff_st_dt",       KeyField:1,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",       Hidden:1,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"eff_end_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"delt_flg",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",       Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"" } ];
			       
			      InitColumns(cols);		
			      SetEditable(1);
			      SetColProperty("io_bnd_cd", {ComboText:"I|O", ComboCode:"I|O"} );
			      SetColProperty("delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
			      SetColProperty("tax_chg_cd", {ComboText:"VIP|VIQ|VIR", ComboCode:"VIP|VIQ|VIR"} );
			      SetWaitImageVisible(0);
			      SetSheetHeight(460);
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
      * @return 없음
      * @see #
      * @author 
      * @version 
      */
 	function doActionIBSheet(sheetObj,formObj,sAction) {
		var formObject=document.form
		switch(sAction) {
		case IBSEARCH:      //retrieve
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH;				
			}else{
				break;
			}
			ComOpenWait(true);
			var sXml=sheetObj.GetSearchData("FNS_INV_0120GS.do", FormQueryString(formObj));
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			ComBtnEnable("btn_RowAdd");
			ComBtnEnable("btn_Delete");
			for (var i = 1; i < sheetObj.RowCount()+1; i++){
	     		if ( sheetObj.GetRowHidden(i) == false &&
	     			 sheetObj.GetCellValue(i,"delt_flg") == "Y"){
	     			sheetObj.SetCellEditable(i,"delt_flg",0);
	     		}
			}
			ComOpenWait(false);
			break;		
			
		case IBSAVE:        //save
			if(!validateForm(sheetObj,formObj,sAction)) {
				return;
			}
		   	if(sheetObj.RowCount()== 0) {
		   		return;
		   	}
			ComOpenWait(true);
			formObj.f_cmd.value=MULTI;	
			
			sheetObj.DoSave("FNS_INV_0120GS.do",FormQueryString(formObj)+ "&"+ ComSetPrifix(sheetObj.GetSaveString(),"sheet1_"),-1,false);
			
			 ComOpenWait(false);
			break;
		case IBINSERT:      // input
			break;
		}
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
         */
     	function sheet_OnChange(sheetObj, Row, Col){
      		var Val = sheetObj.GetCellText(Row,Col);
      		sheet_OnChange_event(sheetObj,Row,Col, Val);
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
         * @author 김현화
         * @version 2011.03.08
         */
     	function sheet_OnChange_event(sheetObj,Row,Col, Val){
     		if(sheetObj.GetCellEditable(Row, Col) == 0) return;
     		if(Val == "") return;
     		var tmpVal = Val.replace(/-/gi , "");
     		if (sheetObj.ColSaveName(Col) == "eff_st_dt") {
     			var ste_cd = sheetObj.GetCellValue(Row, "ste_cd");
     			var locl_ste_cd = sheetObj.GetCellValue(Row, "locl_ste_cd");
     			var locl_chg_grp_cd = sheetObj.GetCellValue(Row, "locl_chg_grp_cd");
     			var io_bnd_cd = sheetObj.GetCellValue(Row, "io_bnd_cd");
     			var tax_chg_cd = sheetObj.GetCellValue(Row, "tax_chg_cd");
     			var tmp_ste_cd = "";
     			var tmp_locl_ste_cd = "";
     			var tmp_locl_chg_grp_cd = "";
     			var tmp_io_bnd_cd = "";
     			var tmp_tax_chg_cd = "";
     			var tmp_eff_st_dt = "";
     			
    			for (var i = 1; i < sheetObj.RowCount()+1; i++){
 	     			if ( sheetObj.GetRowHidden(i) == false ){
 	     				if (Row == i) {
     					   continue;
     				    }
     	     			tmp_ste_cd = sheetObj.GetCellValue(i, "ste_cd");
     	     			tmp_locl_ste_cd = sheetObj.GetCellValue(i, "locl_ste_cd");
     	     			tmp_locl_chg_grp_cd = sheetObj.GetCellValue(i, "locl_chg_grp_cd");
     	     			tmp_io_bnd_cd = sheetObj.GetCellValue(i, "io_bnd_cd");
     	     			tmp_tax_chg_cd = sheetObj.GetCellValue(i, "tax_chg_cd");
     	     			tmp_eff_st_dt = sheetObj.GetCellValue(i, "eff_st_dt");
     	     			if (ste_cd == tmp_ste_cd &&
     	     				tmp_locl_ste_cd == tmp_locl_ste_cd &&
     	     				locl_chg_grp_cd == tmp_locl_chg_grp_cd &&
     	     				io_bnd_cd == tmp_io_bnd_cd &&
     	     				tax_chg_cd == tmp_tax_chg_cd) {
     	     				if (tmpVal == tmp_eff_st_dt || tmpVal < tmp_eff_st_dt) {
     	     					sheetObj.SetCellText(Row, "eff_st_dt","");
     	   			        	ComShowCodeMessage('INV00052');
     	     					return false;
     	     				}
     	     			}
     			   }
    			}
     		}

     	}
     	
//		ComBtnEnable("btn_cancel");
//		ComBtnDisable("btn_cancel");

//    
//     	/** 
//          * sheet상에서 데이타를 받아 sheet의 콤보박스에 세팅. <br>
//          * curr_cd : currency code 세팅
//          * <br><b>Example :</b>
//          * <pre>
//          * </pre>
//          * @param  {IBSheet} sheetObj : 시트오브젝트  
//          * @param  {String} comboValues : 세팅할 값
//          * @param  {String} colName : sheet에서 세팅할 컬럼
//          * @return (boolean) isCellCombo : CellComboItem, InitDataCombo
//          * @see #
//          * @author 한동훈
//          * @version 2009.10.19
//          */		
//     	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
//     		var sRow = sheetObj.GetSelectRow();
//     		var comboTxt = "";
//     		var comboVal = "";
//     		var comboItems;
//     		var comboItem;
//     		var ROWMARK = "|";
//     		var FIELDMARK = "=";
//
//     		comboValues = "|"+" "+comboValues;
//     		if (comboValues != undefined) {
//     			comboItems = comboValues.split(ROWMARK);
//     			for (var i = 1 ; i < comboItems.length ; i++) {
//     				comboItem = comboItems[i].split(FIELDMARK);
//     				if (comboItem[0] != "") {
//     					comboTxt += comboItem[0];
//     					comboVal += comboItem[0];
//     				}
//     				if (i < comboItems.length-1) {
//     					comboTxt += ROWMARK;
//     					comboVal += ROWMARK;
//     				}				
//     			}
//     		}
//     		
//     		var info = {ComboCode:comboVal,ComboText:comboTxt};
//     		
//     		if (isCellCombo) {
//     			sheetObj.SetColProperty(sRow,colName,info);
//     		}
//     		else {
//     			sheetObj.SetColProperty(0,colName,info);
//     		}
//     		
//     	}
     	
    	function openFnsInv0121() {
    		//ComOpenPopup('/opuscntr/FNS_INV_0121.do?sel_option='+selOption+'&iss_ofc_cd='+issOfcCd, 800, 475, 'getFnsInv0121', '1,0,1', false, false, Row, Col,0);
    		 ComOpenWindowCenter('/opuscntr/FNS_INV_0121.do?', 'Charge by Service Account Code', 755, 500);
    	}       	
       	 
       	 
         
	/* 개발자 작업  끝 */