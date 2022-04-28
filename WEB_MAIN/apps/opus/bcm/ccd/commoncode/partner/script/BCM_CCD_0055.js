/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0055.js
*@FileTitle  : BCM_CCD_0055
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/11
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
     * @class BCM_CCD_0055 : BCM_CCD_0055 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
  
   	/* 개발자 작업	*/
	// 공통전역변수
	var sheetObjects=new Array();
	var sheetCnt=0;
	var comboObjects=new Array();
	var comboCnt=0;
	var prefix="sheet1_";
	var iPageNo = 1;
	var selectVal;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick() {
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject=sheetObjects[0];
		/** **************************************************** */
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch (srcName) {
				case "btn_retrieve":
					doActionIBSheet(sheetObjects[0], formObj, SEARCH);
					break;
				case "btn_auto":                                   
				    doActionIBSheet(sheetObjects[0],formObj,MULTI); 
					break;	
				case "btn_RowDelete":
					doActionIBSheet(sheetObjects[0],formObj,IBDELETE);
					break;
				case "btn_downexcel":
					doActionIBSheet(sheetObjects[1], formObj, IBDOWNEXCEL);
	                break;
					
			} 
		} catch (e) {
			if (e == "[object Error]") {
				ComShowCodeMessage("COM12111");
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
	function setSheetObject(sheet_obj) {
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	 /**  
	  	 * IBCombo Object를 배열로 등록
	  	 * @param	{IBMultiCombo}	combo_obj	화면에서 사용할 콤보들을 추가한다. 
	  	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	  	 * 배열은 소스 상단에 정의
	  	 */ 
	  	function setComboObject(combo_obj){	     
	      	comboObjects[comboCnt++]=combo_obj;  
	  	} 
	/**
	 * Sheet 기본 설정 및 초기화
	 * body 태그의 onLoad 이벤트핸들러 구현
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 */
	function loadPage() {
		var formObj=document.form;
		var sheetObj=sheetObjects[0];
		
		for (i=0; i < sheetObjects.length; i++) {
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		formObj.map_flg.checked = true;
		initControl();
		
		doActionIBSheet(sheetObjects[0], formObj, SEARCH);
	}
	/**
	 * 페이지에 있는 HTML Control의 이벤트를 동적으로 로드한다. <br>
	 * {@link #loadPage}함수에서 이 함수를 호출하여 IBSheet Object를 초기화 한다. <br>
	 * 
	 * @param {ibsheet}
	 *            sheetObj IBSheet Object
	 * @param {int}
	 *            sheetNo sheetObjects 배열에서 순번
	 */
	function initControl() {
		var formObject=document.form;
		//Axon 이벤트 처리1. 이벤트catch(개발자변경)
		axon_event.addListenerForm('change', 'obj_change', formObject);
//	    axon_event.addListenerFormat('keypress',       'obj_keypress',    formObject); //- 키보드 입력할때
	    axon_event.addListener ('keydown', 'ComKeyEnter', formObject);
//	    axon_event.addListener  ('keyup'  , 'obj_keyup', 'cust_cd', 'addr_tp_cd');
//	    ComClearSeparator (formObject.cust_cd,"eng"); //한글 변환 키 막기 
	}


	/**
	 * 시트 초기설정값, 헤더 정의
	 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
	 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
	 */
	function initSheet(sheetObj, sheetNo) {
		switch (sheetNo) {
		case 1:
		    with(sheetObj){			       
			      var HeadTitle1="ibflag|sel.|MOT Master|MOT Master|Customer Master|Customer Master|Customer Master|Customer Master|eff_fm_dt|eff_to_dt|mot_eff_dt|mot_exp_dt";
			      var HeadTitle2="ibflag|sel.|MOT Customer Name|MOT Number|Customer Code|Legal English Shipper Name|Customer Type|MOT Number|eff_fm_dt|eff_to_dt|mot_eff_dt|mot_exp_dt";
	              var headCount=ComCountHeadTitle(HeadTitle1);
	              SetConfig( { SearchMode:2, MergeSheet:5, Page:200, DataRowMerge:1, FrozenCol: 6 } );
	              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
	              var headers = [ { Text:HeadTitle1, Align:"Center"},
	                            { Text:HeadTitle2, Align:"Center"} ];
			      InitHeaders(headers, info);
		
			      var cols = [ 
			             {Type:"Status",     Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			             {Type:"DummyCheck", Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"chk" },
			             {Type:"Text",       Hidden:0,  Width:250,  Align:"Center",  ColMerge:0,   SaveName:"eng_nm",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",       Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"mot_no",           KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",       Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cust_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",       Hidden:0,  Width:250,  Align:"Center",  ColMerge:0,   SaveName:"cust_lgl_eng_nm",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cntr_cust_tp_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",       Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cmot_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
			             {Type:"Date",       Hidden:1,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"eff_fm_dt",  		KeyField:0,   CalcLogic:"",   Format:"Ymd",      	PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
			             {Type:"Date",       Hidden:1,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"eff_to_dt",  		KeyField:0,   CalcLogic:"",   Format:"Ymd",      	PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
			             {Type:"Date",       Hidden:1,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"mot_eff_dt",  		KeyField:0,   CalcLogic:"",   Format:"Ymd",      	PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
			             {Type:"Date",       Hidden:1,  Width:150,  Align:"Center",  ColMerge:1,   SaveName:"mot_exp_dt",  		KeyField:0,   CalcLogic:"",   Format:"Ymd",      	PointCount:0,   UpdateEdit:0,   InsertEdit:0, }];
			      
			       
			      InitColumns(cols);
			      
			      SetColProperty(0, "cntr_cust_tp_cd", {ComboText:"BCO|NON-BCO", ComboCode:"B|N"} );
		
			      SetEditable(1);
			      SetShowButtonImage(2);
//			      SetColProperty(0 ,prefix+"nvocc_kw" , {AcceptKeys:"E|N|['.-/,() &]"});
			      //SetSheetHeight(485);
			      SetCountFormat("[SELECTDATAROW / TOTALROWS]");
			      resizeSheet();
	      }
			break;
		case 2:
			with(sheetObj){			       
			if (location.hostname != "")
				var HeadTitle1="ibflag|sel.|MOT Master|MOT Master|Customer Master|Customer Master|Customer Master|Customer Master";
			var HeadTitle2="ibflag|sel.|MOT Customer Name|MOT Number|Customer Code|Legal English Shipper Name|Customer Type|MOT Number";
			var headCount=ComCountHeadTitle(HeadTitle1);
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1, FrozenCol: 6 } );
			var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"},
			                { Text:HeadTitle2, Align:"Center"} ];
			InitHeaders(headers, info);
			
			var cols = [ 
			            {Type:"Status",   Hidden:1,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
			            {Type:"DummyCheck", Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"chk" },
			            {Type:"Text",      Hidden:0,  Width:250,  Align:"Center",  ColMerge:0,   SaveName:"eng_nm",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			            {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"mot_no",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			            {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cust_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			            {Type:"Text",      Hidden:0,  Width:250,  Align:"Center",  ColMerge:0,   SaveName:"cust_lgl_eng_nm",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			            {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cntr_cust_tp_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			            {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"cmot_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, }];
			
			
			InitColumns(cols);
			
			SetEditable(1);
			SetShowButtonImage(2);
//			      SetColProperty(0 ,prefix+"nvocc_kw" , {AcceptKeys:"E|N|['.-/,() &]"});
			//SetSheetHeight(485);
			resizeSheet();
		}
			break;
		}
	}
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
	/**
     * search end event
     * @param sheetObj
     * @return
     */
    function sheet2_OnSearchEnd(sheetObj, ErrMsg){
    	 with(sheetObj){
// 			  for(i=1; i<= LastRow(); i++){
// 				  if (GetCellValue(i, prefix+"mst_dat_subj_cd") == "MDAA"){
// 						SetCellEditable(i, prefix+"auth_tp_cd",0);
// 					}
// 			  }
    	 }
 	}
    
    
    function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
        if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
        doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, ++iPageNo);
    }

//	 Sheet관련 프로세스 처리
	function doActionIBSheet(sheetObj, formObj, sAction , PageNo) {
		sheetObj.ShowDebugMsg(false);
		switch (sAction) {
			case SEARCH: //조회
				var formObject=document.form;
				if(!validateForm(sheetObj,formObj,sAction)) {
					return false;
				}
				iPageNo = 1; 
				
				formObj.f_cmd.value=SEARCH;
				formObj.pagerows.value=iPageNo;
				if(formObj.map_flg.checked == true){
					formObj.map_flg.value = "Y";
				}else{
					formObj.map_flg.value = "N";
				}
				sheetObj.DoSearch("BCM_CCD_0055GS.do", FormQueryString(formObj));
				
				break;
			case IBSEARCHAPPEND:  // 페이징 조회
	                formObj.f_cmd.value=SEARCH;        
	                formObj.pagerows.value=PageNo;
					selectVal=FormQueryString(formObj);
	                sheetObj.DoSearch("BCM_CCD_0055GS.do", selectVal,{Append:true} );
	            break;
			case MULTI:        //Auto Mapping
				if(!validateForm(sheetObj,formObj,sAction)) {
					//alert(sheetObj.GetCellValue(prefix+"ibflag"));
					return false;
				}
				formObj.f_cmd.value=MULTI;
				var sParam=FormQueryString(formObj) + "&" + sheetObj.GetSaveString(true);
		       
	        	var sXml=sheetObj.GetSaveData("BCM_CCD_0055GS.do", sParam);
     			//ComOpenWait(false);
     			var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
     			if(result != "F"){
     				ComShowCodeMessage("COM130102", "Data");
     			}else{
     				sheetObj.LoadSaveData(sXml);
     				ComShowCodeMessage("COM130103", "Data");
     			}
     			
	            doActionIBSheet(sheetObjects[0], formObj, SEARCH);
		        break;
			case IBDOWNEXCEL:
	            if (!validateForm(sheetObj, document.form, sAction)) {
	                return false;
	            }
                formObj.f_cmd.value=SEARCH;;
                sheetObj.DoSearch("BCM_CCD_0055GS.do", FormQueryString(formObj));
	            break;
		}	
	}
	function sheet1_OnSaveEnd(sheetObj, ErrMsg){
		 if(ErrMsg != '') {	// 저장 오류 발생
		 } else {
		 }
   }

	/**
	 * Calling Function in case of OnSearchEnd event <br>
	 * Downloading file with excel format
	 * Using speed option in case of exceeding 300 rows
	 * 
	 * @param {ibsheet} sheetObj Mandatory IBSheet Object
	 * @param {string} ErrMsg Mandatory ,message from server
	 * @return N/A
	 * @author 
	 * @version 2009.05.20
	 */
    function sheet2_OnSearchEnd(sheetObj, ErrMsg) {
        if (ErrMsg == "") {
        	/*
        	if (sheetObj.RowCount()> 300) {
        		sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
        	} else {
        	*/
        		sheetObj.Down2Excel({DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
        	//}
        }
    }
    
    
	 /**
	 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
	 */
	function validateForm(sheetObj, formObj, sAction) {
		 switch (sAction) {
	    	case SEARCH:
	    		break;
	    	case MULTI:
	    		for(var i = 1; i <= sheetObj.LastRow(); i++){
	    			if(sheetObj.GetCellValue(i,"chk") == "1"){
	    				var motNo = sheetObj.GetCellValue(i,"mot_no");
	    				if(motNo == ""){
	    					ComShowCodeMessage("CCD00066");
	    					return false;
	    				}
	    				if(sheetObj.GetCellValue(i,"cust_cd") == ""){
	    					ComShowCodeMessage("CCD00066");
	    					return false;
	    				}
//	    				if(sheetObj.GetCellValue(i,"eng_nm") == sheetObj.GetCellValue(i,"cust_lgl_eng_nm") && sheetObj.GetCellValue(i,"mot_no") == sheetObj.GetCellValue(i,"cmot_no")
//	    					&& sheetObj.GetCellValue(i,"eff_fm_dt") == sheetObj.GetCellValue(i,"mot_eff_dt") && sheetObj.GetCellValue(i,"eff_to_dt") == sheetObj.GetCellValue(i,"mot_exp_dt")){
//	    					 ComShowCodeMessage("CCD00064");
//	    					 return false;
//	    				}
	    				for(var j=i+1; j<=sheetObj.LastRow(); j++){	    					
	    					if(motNo == sheetObj.GetCellValue(j,"mot_no") && sheetObj.GetCellValue(j,"chk") == "1" ){
	    						ComShowCodeMessage("CCD00065");	
	    						return false;
	    					}
	    				}
	    			}
	    		}
	    		break;
		 	}
	    	return true;
	}

