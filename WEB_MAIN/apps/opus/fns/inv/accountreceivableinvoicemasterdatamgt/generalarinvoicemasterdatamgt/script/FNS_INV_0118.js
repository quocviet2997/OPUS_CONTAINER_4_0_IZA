/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName :FNS_INV_0118.js
*@FileTitle : Charge Code Set-Up per Customer
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
      * IBSheet Object를 sheetObjects 배열로 등록 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj IBSheet Object
      * @return 없음
      * @see #
      * @author 김현화
      * @version 2011.03.04
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
      * @author 김현화
      * @version 2011.03.04
      */
     function loadPage() {
    	  
  		for(i=0;i<sheetObjects.length;i++){
  			ComConfigSheet (sheetObjects[i] );
  			initSheet(sheetObjects[i],i+1);
  			ComEndConfigSheet(sheetObjects[i]);
  		}
  		
        axon_event.addListenerForm ('focusout', 'obj_focusout', document.form);
  
  		var row_cnt = parent.sheet_charge.RowCount();
  		var row = 0;
  		var col = 0;
  		var j=0;
  		var cprt_tp ="";
  	    var sheetObj2 = parent.sheet_charge;
 
  		document.form.tmpltNm.value = parent.document.form.select_tmplt.value;
  	    document.form.tmplt_ofc_cd.value = parent.document.form.tmplt_ofc_cd.value;
  	    document.form.tmplt_auth_id.value = parent.document.form.tmplt_auth_id.value;
  	    
  	    doActionIBSheet(sheetObjects[0],document.form, IBCLEAR); 
  	  
		for (var i = 1; i < row_cnt+1; i++){
			
	     	//var cprt_chg_grp_flg = sheetObj2.cellvalue(i,"cprt_chg_grp_flg")
 	     	sheetObjects[0].DataInsert(-1);
	     	sheetObjects[0].SetCellValue(i, "ar_ofc_cd",sheetObj2.GetCellValue(i,"ar_ofc_cd"),0);
	     	sheetObjects[0].SetCellValue(i, "rpt_tmplt_nm",sheetObj2.GetCellValue(i,"rpt_tmplt_nm"),0);
		    sheetObjects[0].SetCellValue(i, "chg_cd",sheetObj2.GetCellValue(i,"chg_cd"),0);
		    sheetObjects[0].SetCellValue(i, "cprt_chg_grp_flg",sheetObj2.GetCellValue(i,"cprt_chg_grp_flg"),0);
		    sheetObjects[0].SetCellValue(i, "cprt_tp_ctnt",sheetObj2.GetCellValue(i,"cprt_tp_ctnt"),0);
		    sheetObjects[0].SetCellValue(i, "cprt_val_ctnt",sheetObj2.GetCellValue(i,"cprt_val_ctnt"),0);
		    sheetObjects[0].SetCellValue(i, "dp_seq",sheetObj2.GetCellValue(i,"dp_seq"),0);
		    sheetObjects[0].SetCellValue(i, "rpt_itm_id",sheetObj2.GetCellValue(i,"rpt_itm_id"),0);
		    sheetObjects[0].SetCellValue(i, "cre_usr_id",sheetObj2.GetCellValue(i,"cre_usr_id"),0);
		    sheetObjects[0].SetCellValue(i, "cre_dt",sheetObj2.GetCellValue(i,"cre_dt"),0);
		    
 
  	     }
//  	   sheetObjects[0].LoadSearchXml(arrChg, false);
//  	   var  row_cnt = sheetObjects[0].RowCount;

  	    //S/C, RFA 에 따라  Number Combo 구성함.
  	    if (row_cnt > 0){
		        cprt_tp =  sheetObjects[0].GetCellValue(1,"cprt_tp_ctnt");
		        document.form.cprt_tp_ctnt.value = cprt_tp;
		        MakeComboObject(sheetObjects[0], cprt_val_ctnt, cprt_tp);
  	        }
  	      
      }
     
	 /** 
	 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  없음  
	 * @return 없음
	 * @see #
	 * @author 김현화
	 * @version 2011.03.04
	 */
	function processButtonClick(){
			/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
			var sheetObject1 = sheetObjects[0];
			var sheetObject2 = sheetObjects[1];
		
			/*******************************************************/
			var formObject = document.form;
		
			try {
				var srcName = ComGetEvent("name");
		
				switch(srcName) {
		
				case "btn_ok":
					closeCharge();
					//comPopupOK();
					break;
		
				case "btn_close":
					//window.close();
					ComClosePopup(); 
					break; 
		
				case "btn_add":	
					var Cnt = sheetObject1.RowCount();
					var vcnt = 0;
					//var add_seq = "";
					
					if (cprt_val_ctnt_text.value ==""){
						ComShowCodeMessage('INV00004');
						ComSetFocus(cprt_val_ctnt);
						return false;
					}

					for (var i = 1; i < Cnt+1; i++){
					     if (sheetObject1.GetRowHidden(i)){
					    	 vcnt = vcnt; 
					     }else{
					    	 vcnt = vcnt+1;  
					    	 //add_seq = sheetObject1.GetCellValue(i,"SEQ");
					    	 //alert("Rowi--"+i+"=="+dp_seq)
					     }
					}       
					if (vcnt < 5) {
						 var add_row = sheetObject1.DataInsert(-1);

					}

					sheetObject1.SetCellValue(add_row, "ar_ofc_cd",document.form.tmplt_ofc_cd.value,0);
					sheetObject1.SetCellValue(add_row, "rpt_tmplt_nm",document.form.tmpltNm.value,0);
					sheetObject1.SetCellValue(add_row, "cprt_tp_ctnt",formObject.cprt_tp_ctnt.value,0);
					sheetObject1.SetCellValue(add_row, "cprt_val_ctnt",cprt_val_ctnt_text.value,0);
					sheetObject1.SetCellValue(add_row, "rpt_itm_id","INV143",0);			
					break;
				case "btn_del":		
					
					var Cnt = sheetObject1.RowCount();
					for (var i = 1; i < Cnt+1; i++){
	
						if(sheetObject1.GetCellValue(i, "SelChk") == 1 ){
							sheetObject1.RowDelete(i, false);
							i = i - 1;
							Cnt = Cnt - 1;
	
						}
					}

					break;
				case "btn_insert":	
					var Cnt = sheetObject1.RowCount();
					var vcnt = 0;
					
					if (cprt_val_ctnt_text.value ==""){
						ComShowCodeMessage('INV00004');
						ComSetFocus(cprt_val_ctnt);
						return false;
					}
					for (var i = 1; i < Cnt+1; i++){
					     if (sheetObject1.GetRowHidden(i)){
					    	 vcnt = vcnt; 
					     }else{
					    	 vcnt = vcnt+1;  
					     }
					}       

					if (vcnt < 5) {
						 var ins_row =  sheetObject1.DataInsert();
					}	
	
					sheetObject1.SetCellValue(ins_row, "ar_ofc_cd",document.form.tmplt_ofc_cd.value,0);
			     	sheetObject1.SetCellValue(ins_row, "rpt_tmplt_nm",document.form.tmpltNm.value,0);
				    sheetObject1.SetCellValue(ins_row, "cprt_tp_ctnt",formObject.cprt_tp_ctnt.value,0);
				    sheetObject1.SetCellValue(ins_row, "cprt_val_ctnt",cprt_val_ctnt_text.value,0);
				    sheetObject1.SetCellValue(ins_row, "rpt_itm_id","INV143",0);						
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
//  				if (ComIsNull(formObj.sc_no2) && ComIsNull(formObj.rfa_no2)) {
// 	         		ComShowCodeMessage('INV00004');
//     				ComSetFocus(form.sc_no2);
// 	 				return false;
// 	 			}
//  				/*
//  				if (formObj.sc_no2.value == "" || formObj.rfa_no2.value =="") {
// 	         		ComShowCodeMessage('INV00004');
//     				ComSetFocus(form.sc_no2);
// 	 				return false;
// 	 			}*/
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
    	
    	 
    	var formObject = document.form;
		switch(ComGetEvent("name")){
			case "cprt_val_ctnt":
				  //alert("obj_focusout");
				 doActionIBSheet(sheetObjects[0],formObject,IBSEARCH_ASYNC01);
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
      * @author 김현화
      * @version 2011.03.04
      */
     function initSheet(sheetObj,sheetNo) {
    	  
         var cnt = 0;

         switch(sheetNo) {
              case 1:      //sheet1 init
                 with (sheetObj) {

            		var HeadTitle1="|Sel.|Seq.|Charge Code|REP.Chg|AR_OFC_CD|RPT_TMPLT_NM|RPT_ITM_ID|CPRT_TP_CTNT|CPRT_VAL_CTNT|creid|credt|Seq.";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
					var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);
					
					var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
					             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"SelChk" },
					             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"dp_seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Combo",      Hidden:0,  Width:140,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",             KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, EditLen:3 },
					             {Type:"Combo",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:1,   SaveName:"cprt_chg_grp_flg",    KeyField:1,   CalcLogic:"",   Format:"", ComboText:"N|Y", ComboCode:"N|Y" },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rpt_tmplt_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rpt_itm_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cprt_tp_ctnt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cprt_val_ctnt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cre_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Seq",      Hidden:1,  Width:0,   Align:"Center",  ColMerge:0,   SaveName:"SEQ",        			  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 } ];
					             
					InitColumns(cols);
					SetCountPosition(0);
					SetSheetHeight(220);           
					 
					var v_pagetype = document.form.pagetype.value;
         			
					if (v_pagetype == "E") {
         				SetEditable(1);
         			}else{
         				SetEditable(0);
         			}
					
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
      * @author 김현화
      * @version 2011.03.04
      */
     function doActionIBSheet(sheetObj,formObj,sAction, Row, Col, Val) {
    	sheetObj.ShowDebugMsg = false;
		switch(sAction) {
	
		case IBCLEAR://조회
	
   		    formObj.f_cmd.value = SEARCH13;
		    var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
		    
			var chg_cd = ComGetEtcData(sXml, "chg_cd");	
			
			addCellComboItem(sheetObj,chg_cd,"chg_cd",false);
    
		    break;  
		
		case IBROWSEARCH:   // sheet filter
		
		     for ( var i = 1; i <= sheetObj.RowCount(); i++) {
	             if (sheetObj.GetCellValue(i, "chg_cd") == "" ||sheetObj.GetCellValue(i, "cprt_chg_grp_flg") == "" ){
	         	 	ComShowCodeMessage('INV00004');
	    	        return false;
                  }
		      }
	 
	    	 for ( var i = 1; i <= sheetObj.RowCount(); i++) {
		    	   var cprt_tp_ctnt = sheetObj.GetCellValue(i, "cprt_tp_ctnt");
		    	   var cprt_tp_h = formObj.cprt_tp_ctnt.value ;
		    	   var cprt_val_ctnt = sheetObj.GetCellValue(i, "cprt_val_ctnt");
			       var cprt_val_h = cprt_val_ctnt_text.value ;
			
			//alert("IBROWSEARCH -"+cprt_tp_ctnt+"-"+cprt_tp_h+"%%%"+cprt_val_ctnt+"-"+cprt_val_h);
			     if (cprt_tp_ctnt== cprt_tp_h && cprt_val_ctnt == cprt_val_h){
                     sheetObj.SetRowHidden(i,0);
			     }else{
				     sheetObj.SetRowHidden(i,1);
			     }
	         }
	      break;
	      
		case IBSEARCH_ASYNC01:      // S/C RFA 조회	
		     var cprt_tp_h  = formObj.cprt_tp_ctnt.value;
		     var cprt_tp_text  = "";
		     var cprt_val_h = cprt_val_ctnt_text.value;
		
	    	if(cprt_val_h != ""){
			   if (cprt_tp_h=="S"){
				   formObj.sc_no.value  = cprt_val_h;
				   cprt_tp_text  = "S/C No";
				   formObj.rfa_no.value = "X";
			   }else{
			       formObj.sc_no.value  = "X";
			       cprt_tp_text  = "RFA No";
				   formObj.rfa_no.value = cprt_val_h;	     
			   }

			   formObj.f_cmd.value = SEARCH01;					
			   var sXml = sheetObj.GetSearchData("FNS_INV_0102GS.do", FormQueryString(formObj));
			
			   var arrXml = sXml.split("|$$|");
			   var dataVal = ComGetEtcData(arrXml[0],"customerName");
	
			 if(dataVal == ""){          											
				ComShowCodeMessage("INV00041","["+cprt_tp_text+"]");
				cprt_val_ctnt_text.value ="";
				ComSetFocus(cprt_val_ctnt);
				return;
			 }
		 }	
        break;
        
		case IBSEARCH_ASYNC02:      //조회	
		     //alert("IBSEARCH_ASYNC02");   
        
		if(Val != ""){
			formObj.f_cmd.value = COMMAND01;
			formObj.code.value = Value;
			var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));				
		
			var dataVal = ComGetEtcData(sXml,"code_desc");
			
			if(dataVal == ""){
				ComShowCodeMessage("INV00041","["+Val+"]");	
				sheetObj.SelectCell(Row, Col);
			}
		}
		 break;
        
 		}
      }
      
      /** 
       * combo List에 데이타를 세팅하는 함수 <br>
       * <br><b>Example :</b>
       * <pre>
       * </pre>
       * @param  {object} sheetObj : sheet 오브젝트
       * @param  {object} cmbObj : 폼 오브젝트
       * @param  {String} cprt_tp : 처리구분자
       * @return 없음
       * @see #
       * @author 김현화
       * @version 2011.03.08
       */     
       function MakeComboObject(sheetObj, cmbObj, cprt_tp) {

  		    var row_cnt = sheetObj.RowCount();	
   		    var j = 0;
   		    var cprt_tp_ctnt = "";
   		    var cprt_val_ctnt = "";
   			var comboVal = "";
   			var comboVal2 = "";
    	    cmbObj.RemoveAll();
    	    
  	     	for (var i = 1; i < row_cnt+1; i++){
    			 cprt_tp_ctnt = sheetObj.GetCellValue(i, "cprt_tp_ctnt");
	     	     comboVal = sheetObj.GetCellValue(i, "cprt_val_ctnt");
		     	
	         	if (cprt_tp == cprt_tp_ctnt && comboVal != comboVal2 ){
	     	        cmbObj.InsertItem(j, comboVal, comboVal); 
	     	        if(j==0){
	     	        	cprt_val_ctnt = sheetObj.GetCellValue(i, "cprt_val_ctnt");	
	     	         }
	     	         j = j+1 ;
	     	         comboVal2 = comboVal;
 	     	      }
  		    }
  	     	cmbObj.SetSelectCode(cprt_val_ctnt);
    		//cmbObj.text  = cprt_val_ctnt;
    		//cmbObj.value = cprt_val_ctnt;
			doActionIBSheet(sheetObj, document.form, IBROWSEARCH);
  	   }  
       
       /** 
        * cprt_tp_ctnt 변경시 Combo 재구성 및 sheet 재구성. <br>
        * <br><b>Example :</b>
        * <pre>
        * </pre>
        * @param  {String} value : 선택한cprt_tp_ctnt의 value 값
        * @return 없음
        * @see #
        * @author 김현화
        * @version 2011.03.08
        */       
      
       function cprt_tp_ctnt_OnChange(value){
      
   	        if (sheetObjects[0].RowCount() > 0 ){
   		        MakeComboObject(sheetObjects[0], cprt_val_ctnt, value);
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
         * @see #
         * @author 김현화
         * @version 2011.03.08
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
          * @author 김현화
          * @version 2011.03.08
          */
      	function sheet1_OnChange_event(sheetObj,Row,Col, Val){
      		if(sheetObj.GetCellEditable(Row, Col) == 0) return; 
      		if (sheetObj.ColSaveName(Col) == "chg_cd") {
		        var cprt_tp =  document.form.cprt_tp_ctnt.value;
		        var cprt_val = cprt_val_ctnt_text.value;
		        
     			for (var i = 1; i < sheetObj.RowCount()+1; i++){
      				
      			   if ( sheetObj.GetRowHidden(i) == false ){
      				   
      	  		       var tp = sheetObj.GetCellValue(i, "cprt_tp_ctnt");
     			       var no= sheetObj.GetCellValue(i, "cprt_val_ctnt");
     			     
     			       if (cprt_tp == tp && cprt_val == no && Row!= i ){
     			          var v_chg = sheetObj.GetCellValue(i, "chg_cd");
    			          if (Val == v_chg){
    			        	  ComShowCodeMessage('INV00052');
    			        	  sheetObj.SetCellValue(Row, "chg_cd","",0);
    			        	  return false;
      			          }
      			       }
      			   }
     			}
      		}

//      			document.form.cd.value = Val;
//       			doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02, Row, Col, Val);
//     

      	}
         
        
	   /** 
	    * cprt_val_ctnt 변경시 sheet 재구성. <br>
	    * <br><b>Example :</b>
	    * <pre>
	    * </pre>
      	* @param 없음
	    * @return 없음
	    * @see #
	    * @author 김현화
	    * @version 2011.03.08
	    */       
      
       function cprt_val_ctnt_OnChange(){
    	   var value = cprt_val_ctnt_text.value;
           var itemindex = cprt_val_ctnt.FindItem ( value, 0); 
	        //	alert("itemindex"+itemindex);
             if (itemindex == -1 ) {
            	 doActionIBSheet(sheetObjects[0],document.form, IBSEARCH_ASYNC01);
            	 if (cprt_val_ctnt_text.value !="") {
               	    cprt_val_ctnt.InsertItem(-1, value, value); 
               	    cprt_val_ctnt.SetSelectCode(value);
            	 } 
             }

  	        if (sheetObjects[0].RowCount() > 0 ){
  	        	doActionIBSheet(sheetObjects[0],document.form, IBROWSEARCH);
   	        }else{
   	           //  doActionIBSheet(sheetObjects[0],document.form, IBSEARCH_ASYNC01);
      	    }
      	}
 
       	/**
       	 * OK 버튼 클릭시 parent 화면으로 Charge 정보 전달 <br>
       	 * <br><b>Example :</b>
       	 * <pre>
       	 *     closeCharge()
       	 * </pre>
       	 * @param 없음
       	 * @return 없음
       	 * @author 김현화
       	 * @version 2011.03.10
       	 */
       	function closeCharge() {
       		var row_cnt = sheetObjects[0].RowCount();
   
       		var row = 0;
       		var seq_num = 1;
       		var tp1 ="";
       		var no1 ="";
       		var tp2 ="";
       		var no2 ="";
       		var org_cnt = 0;
     		
       		for (var i = 1; i < row_cnt+1; i++){
     				 var v_chg = sheetObjects[0].GetCellValue(i, "chg_cd");
     				if (v_chg == "" ) {
     					ComShowCodeMessage('INV00004');
     					return false;
     				}
     		}
       		
       		parent.sheet_charge.RemoveAll()
       		/* DP SEQ Setting  */
     		for (var i = 1; i < row_cnt+1; i++){
     		         tp1 = sheetObjects[0].GetCellValue(i, "cprt_tp_ctnt");
     			     no1 = sheetObjects[0].GetCellValue(i, "cprt_val_ctnt");
     			     
     			if ((tp1 != tp2 && no1 != no2)||(tp1 == tp2 && no1 != no2)) {
     				seq_num = 1;
     		        sheetObjects[0].SetCellValue(i,"dp_seq",seq_num);
     		        seq_num = seq_num +1;
     	      		tp2 = tp1;
     	       		no2 = no1;
     			}else if (tp1 == tp2 && no1 == no2) {
     				 sheetObjects[0].SetCellValue(i,"dp_seq",seq_num);
     				 seq_num = seq_num +1;
      	      		 tp2 = tp1;
     	       		 no2 = no1;
     			}
     		}	
        		
     		for (var i = 1; i < row_cnt+1; i++){
        			var v_chg = sheetObjects[0].GetCellValue(i, "chg_cd");
        			//alert("v_chg"+v_chg);
        			/* Parent sheet Setting */

       					parent.sheet_charge.DataInsert(-1);
       					row++;

       					parent.sheet_charge.SetCellValue(row, "ar_ofc_cd",sheetObjects[0].GetCellValue(i,"ar_ofc_cd"));
       					parent.sheet_charge.SetCellValue(row,"rpt_tmplt_nm",sheetObjects[0].GetCellValue(i,"rpt_tmplt_nm"));
       					parent.sheet_charge.SetCellValue(row, "chg_cd",sheetObjects[0].GetCellValue(i,"chg_cd"));
       					parent.sheet_charge.SetCellValue(row,"cprt_chg_grp_flg",sheetObjects[0].GetCellValue(i,"cprt_chg_grp_flg"));
       					parent.sheet_charge.SetCellValue(row,"cprt_tp_ctnt",sheetObjects[0].GetCellValue(i,"cprt_tp_ctnt"));
       					parent.sheet_charge.SetCellValue(row,"cprt_val_ctnt",sheetObjects[0].GetCellValue(i,"cprt_val_ctnt"));
       					parent.sheet_charge.SetCellValue(row,"dp_seq",sheetObjects[0].GetCellValue(i,"dp_seq"));
       					parent.sheet_charge.SetCellValue(row,"rpt_itm_id",sheetObjects[0].GetCellValue(i,"rpt_itm_id"));
       					parent.sheet_charge.SetCellValue(row,"cre_usr_id",sheetObjects[0].GetCellValue(i,"cre_usr_id"));
       					parent.sheet_charge.SetCellValue(row,"cre_dt",sheetObjects[0].GetCellValue(i,"cre_dt"));
       					
       					
       		}
     		
      		//comPopupOK();
       		//window.close();
     		ComClosePopup(); 
     	
       	}        
    
     	/** 
          * sheet상에서 데이타를 받아 sheet의 콤보박스에 세팅. <br>
          * curr_cd : currency code 세팅
          * <br><b>Example :</b>
          * <pre>
          * </pre>
          * @param  {IBSheet} sheetObj : 시트오브젝트  
          * @param  {String} comboValues : 세팅할 값
          * @param  {String} colName : sheet에서 세팅할 컬럼
          * @return (boolean) isCellCombo : CellComboItem, InitDataCombo
          * @see #
          * @author 한동훈
          * @version 2009.10.19
          */		
     	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
     		var sRow = sheetObj.GetSelectRow();
     		var comboTxt = "";
     		var comboVal = "";
     		var comboItems;
     		var comboItem;
     		var ROWMARK = "|";
     		var FIELDMARK = "=";

     		comboValues = "|"+" "+comboValues;
     		if (comboValues != undefined) {
     			comboItems = comboValues.split(ROWMARK);
     			for (var i = 1 ; i < comboItems.length ; i++) {
     				comboItem = comboItems[i].split(FIELDMARK);
     				if (comboItem[0] != "") {
     					comboTxt += comboItem[0];
     					comboVal += comboItem[0];
     				}
     				if (i < comboItems.length-1) {
     					comboTxt += ROWMARK;
     					comboVal += ROWMARK;
     				}				
     			}
     		}
     		
     		var info = {ComboCode:comboVal,ComboText:comboTxt};
     		
     		if (isCellCombo) {
     			sheetObj.SetColProperty(sRow,colName,info);
     		}
     		else {
     			sheetObj.SetColProperty(0,colName,info);
     		}
     		
     	}      	 
       	 
       	 
         
	/* 개발자 작업  끝 */