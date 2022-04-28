/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0112.js
*@FileTitle : EDI 310 Invoicing
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.25 박성용 
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
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function processButtonClick(){
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObj = sheetObjects[0];
		/*******************************************************/
		var formObj = document.form;
	
		try {
			var srcName = ComGetEvent("name");
		
			switch(srcName) {
			
				case "btns_calendar1": //달력버튼
					var cal = new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObj.sa_from_dt, 'yyyy-MM-dd');
	            break;
	            
				case "btns_calendar2": //달력버튼
					var cal = new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObj.sa_to_dt, 'yyyy-MM-dd');
	            break;
			
				case "btns_multiscrfano": //M SC/RFA No
					openMultipleinquiry("SCRFA", "SC/RFA No", formObj.sc_rfa_no.value);
				break;
				
				case "btns_multicust": //M Customer
					openMultipleinquiry("CUST", "Customer", formObj.cust_cd.value);
				break;
				
				case "btn_retrieve":
					doActionIBSheet(sheetObj,formObj,IBSEARCH);
				break;
			
				case "btn_new":
					removeAll(formObj);
				break;
			
				case "btn_prepare":
					//doActionIBSheet(sheetObj,formObj,IBINSERT);
				break;
				
				case "btn_edi":
					document.form.btn_edi.disabled=true;
					doActionIBSheet(sheetObj,formObj,IBSAVE);
					document.form.btn_edi.disabled=false;
				break;
				
				case "btn_excel":
					if(sheetObj.RowCount() < 1){//no data
	                    ComShowCodeMessage("COM132501");
	                }else{
	                    sheetObj.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1 });
	                }
                break;
	              
				case "btns_cust":
					var cust_cnt_cd="";
					var cust_seq="";
					var classId="FNS_INV_0086";
					var param='?cust_cnt_cd='+cust_cnt_cd+'&cust_seq='+cust_seq+'&pop_yn=Y&classId='+classId;
					ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 390, 'getFNS_INV_0086', '0,0', false, false);
				break;
					
				
			} // end switch
		} catch(e) {
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
	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	 * 배열은 소스 상단에 정의
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.10.05
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
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++] = combo_obj;
	}
	
    /** 
     * body 태그의 onLoad 이벤트핸들러 구현 <br>
     * <br><b>Example :</b>
	 * <pre>
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 * </pre>
	 * @param 없음
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function loadPage() {
		var formObj = document.form;
		
		for(i=0;i<sheetObjects.length;i++){
			//khlee-시작 환경 설정 함수 이름 변경
			ComConfigSheet (sheetObjects[i] );
			
			initSheet(sheetObjects[i],i+1);
			
			//khlee-마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
		}
		
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		
		initControl();
		
		doActionIBSheet(sheetObjects[0],formObj,IBSEARCH_ASYNC01); 	
		
		//버튼 초기화
		ComBtnDisable("btn_edi");
		
		formObj.sc_rfa_no.focus();
	}

	/** 
	 * 시트 초기설정값, 헤더 정의<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
	 * </pre>
	 * @param sheetObj 시트오브젝트
	 * @param sheetNo 시트오브젝트 태그의 아이디에 붙인 일련번호
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt = 0;
		var sheetID = sheetObj.id;
		switch(sheetID) {
		
			case "sheet1":
				with (sheetObj) {
				
					var HeadTitle1="||Sel|Invoice No|B/L No|bl_seq|BKG No|Container No|Office|Source|rev_tp_src_cd|act_cust_cnt_cd|act_cust_seq|Customer Code|Customer Name|vsl_cd|skd_voy_no|skd_dir_cd|Trunk VVD|Scope|Lane|S/A Date|Bound|POR|POL|POD|DEL|sc_no|rfa_no|bdr_ind_flg|Invoice Date|Local CUR|Invoice AMT|Send Status|Send Date|edi_tp_cd|Charge Seq|Charge Code|Charge CUR|Per Type|trf_rt_amt|rat_as_cntr_qty|Charge AMT|edi_hdr_seq|ar_if_no|cnmv_cyc_no";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:2, Page:10000, DataRowMerge:0, FrozenCol:10 } );
					var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);
					var cols = [ {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"merge_chk",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Status",    Hidden:1,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
					             {Type:"CheckBox",  Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"sel_chk" },
					             {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:1,   SaveName:"inv_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:105,  Align:"Center",  ColMerge:1,   SaveName:"bl_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"bl_seq",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:105,  Align:"Center",  ColMerge:1,   SaveName:"bkg_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:1,   SaveName:"cntr_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"source_cd",       	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_src_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"cust_cd",        	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",  	ColMerge:1,   SaveName:"cust_nm",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd",        	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"trnk_vvd_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"slan_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"por_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"del_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"sc_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"rfa_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"bdr_ind_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"inv_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"inv_ttl_locl_amt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"edi_snd_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:1,   SaveName:"edi_snd_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"edi_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"chg_seq",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"chg_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"per_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"trf_rt_amt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"rat_as_cntr_qty",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Float",     Hidden:0,  Width:95,   Align:"Right",  	ColMerge:0,   SaveName:"chg_amt",             KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:3,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"edi_hdr_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"cnmv_cyc_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             ];
					InitColumns(cols);
					//SetCountPosition(0);
					SetEditable(1);
					SetColProperty("sail_arr_dt", {Format:"Ymd"} );
					SetColProperty("inv_dt", {Format:"Ymd"} );
					//SetSheetHeight(170);
					resizeSheet();

				}
			break;			
		}
	}
	
	
	/** 
	 * onLoad 이벤트핸들러시 호출 오브젝트에 대한 이벤트<br>
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
	function initControl() {
		var formObj = document.form;
		
		//Axon 이벤트 처리1. 이벤트catch(개발자변경)
		axon_event.addListenerForm ('blur', 'obj_deactivate', formObj);

	}

	function initCombo(comboObj, comboNo) {
	    switch (comboObj.options.id) {
	        case "chg_cd":
	            with (comboObj) {
	                SetMultiSelect(1);
	                SetColAlign(0, "left");
	                SetMultiSeparator(",");
	                SetDropHeight(190);
	                SetSelectText("All");
	                //SetItemCheck(" ",true);
	                //SetSelectCode("");
	            }
	        break;
	    }
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
					
					doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC02);
				} else {
					formObj.cust_nm.value = '';		
				}
			break;
			
		}
	}
	 
	/** 
	 * 조회 저장등 서버 기능을 호출하는 doActionIBSheet<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param  {IBSheet} sheetObj : 시트오브젝트  
	 * @param  {object} formObj : 폼 오브젝트
	 * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
	 * @param  {int} Row : sheet에서 현재 마우스로 선택되어 있는 Row
	 * @param  {int} Col : sheet에서 현재 마우스로 선택되어 있는 Col
	 * @param  {String}Val : sheet에서 현재 마우스로 선택되어 있는 Row,Col 의 value값
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg = false;
		switch(sAction) {
			case IBSEARCH_ASYNC01: // 화면 로딩시 AR_OFFICE_LIST 조회
			
			ComOpenWait(true);
			
			formObj.f_cmd.value = SEARCH02;
			var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			
			var sStr = ComGetEtcData(sXml,"ar_ofc_cd");
			var arrStr = sStr.split("|");
			
			MakeComboObject(inv_ofc_cd, arrStr);
		
			var arrStr2 = "";
			var ofc_cd = "";
		
			for(i=1;i<arrStr.length;i++){
				arrStr2 = arrStr[i].split("^");
				if(arrStr2[1]==arrStr2[3]){
					ofc_cd = arrStr2[1];
				}
			}
			
			inv_ofc_cd.SetSelectText(ofc_cd, false);	
			formObj.ar_ofc_cd.value = ofc_cd;
			
			formObj.f_cmd.value = SEARCH01;
			var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			
			var sStr = ComGetEtcData(sXml,"svc_scp_cd1");
			var arrStr = sStr.split("|");
			
			MakeComboObject2(svc_scp_cd, arrStr);
			svc_scp_cd.SetSelectText("All");
			
			formObj.f_cmd.value = SEARCH13;
			var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
			
			var sStr = ComGetEtcData(sXml,"chg_cd");
			var arrStr = sStr.split("|");
			
			MakeComboObject2(chg_cd, arrStr);
			chg_cd.SetSelectText("All");
			
			ComOpenWait(false);
			
			break;
			
			case IBSEARCH_ASYNC02:	//Search Customer Info
				formObj.f_cmd.value = SEARCH03;
				
				var CustCntCd = formObj.cust_cnt_cd.value;
				var CustSeq = formObj.cust_seq.value;
				if(CustSeq != ""){
					var sXml = sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+CustCntCd+"&cust_seq="+CustSeq);	
		
					if(CoInvShowXmlMessage(sXml) != "") {
						formObj.cust_nm.value = "";
						
						ComAlertFocus(formObj.cust_cd, CoInvShowXmlMessage(sXml));
					} else {
						var cust_eng_nm = ComGetEtcData(sXml,"cust_eng_nm");
						var cust_nm = ComGetEtcData(sXml,"cust_nm");
						
						formObj.cust_nm.value = cust_eng_nm;							
					}
				}
			break;
				
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value = SEARCH;
					ComOpenWait(true);
					
	                setTimeout(function(){	
						var sXml = sheetObj.GetSearchData("FNS_INV_0112GS.do", FormQueryString(formObj));
						
						var arrXml = sXml.split("|$$|");
						
						if (sXml.indexOf("ERROR") < 1){
							if ( arrXml[0] != null){
								sheetObj.LoadSearchData(arrXml[0],{Sync:1});
								if(sheetObjects[0].RowCount()==0){
									ComShowCodeMessage("COM130401");
									formObj.sc_rfa_no.select();
								}
							}
						}else{
							showErrorMsg(sXml);
							ComOpenWait(false);
							return;
						}
	                },100);
				}
			break;
			
			case IBSAVE:        //저장
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value = MULTI;
					
					var iCheckRow = sheetObj.FindCheckedRow("sel_chk");
										
					if (iCheckRow== "") {
						ComShowCodeMessage("INV00025");
						return;
					}
					
					var sParam = sheetObj.GetSaveString(false);
					if (sParam == "") {
						return;
					}
					
					ComOpenWait(true);
					
						var sXml = sheetObj.GetSaveData("FNS_INV_0112GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sParam,"sheet1_") );
						
						if (sXml.indexOf("ERROR") < 1){
							var excludeBLNO = ComGetEtcData(sXml, "excludeBLNO");
							if(excludeBLNO == "") {
								ComShowCodeMessage("INV00051");
							} else {
								ComShowCodeMessage("INV00158", excludeBLNO);  
								ComOpenWait(false);
								return;
							}
						}
						else {
							ComShowCodeMessage("INV00053");
							ComOpenWait(false);
							return;
						}
						
					ComBtnDisable("btn_edi");
					doActionIBSheet(sheetObj,formObj,IBSEARCH);
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
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function validateForm(sheetObj,formObj,sAction){
		switch(sAction) {
			case IBSEARCH:      //조회
				
				if(formObj.sc_rfa_no.value == "" && formObj.cust_cd.value == "") {
					ComShowCodeMessage("INV00004");
					formObj.sc_rfa_no.focus();
					return false;
				}
				if(inv_ofc_cd.GetSelectText() == "") {
					ComShowCodeMessage("INV00004");
					ComSetFocus(inv_ofc_cd);
					return false;
				}
		
			break;
							
			case IBSAVE:      //저장
				with(formObj){
					
					if(sheetObj.RowCount() == 0) {
						ComShowCodeMessage("INV00091");
						return false;
					}
				}
			break;
			
		}
		return true;
	}
	
	/** 
	 * 화면 초기화<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {object} formObj  
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.10.05
	 */
	function removeAll(formObj) {
		
		var ofc_cd = inv_ofc_cd.GetSelectText();
		
		sheetObjects[0].RemoveAll();
		formObj.reset();
		inv_ofc_cd.SetSelectText(ofc_cd, false);
		svc_scp_cd.SetSelectText("All");
		chg_cd.SetSelectText("All");
		//버튼 초기화
		ComBtnDisable("btn_edi");
		
		formObj.sc_rfa_no.focus();
	}

    /** 
	 * OnLoadFinish 이벤트 발생시 호출되는 function <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {ibsheet} sheetObj 필수 IBSheet Object        
     * @return 없음
     * @see #
     * @author 박정진
     * @version 2009.10.05
     */
	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
        with (sheetObj) {
            if (RowCount()> 0) {
                ReDraw=false;
                for (var i=HeaderRows(); i<=LastRow(); i++) {
                    // inv_no가 null 일때 컬럼 편집 비활성화
                	if (GetCellValue(i, "inv_no") == "") {
                        SetCellEditable(i, "sel_chk",0);
                    }
                }
                ReDraw=true;
            }
        }
		ComOpenWait(false);
    	if(sheetObj.RowCount() > 0) ComBtnEnable("btn_edi");	
    	
	}
	 
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		var formObj=document.form;
		
		if(sheetObj.ColSaveName(Col) == "sel_chk") {
			var mergeKey1 = sheetObj.GetCellValue(Row, "merge_chk");
			for(var i = Row + 1; i <= sheetObj.RowCount(); i++){
				var mergeKey2 = sheetObj.GetCellValue(i, "merge_chk");
				if(mergeKey1 == mergeKey2) sheetObj.SetCellValue(i, Col, Value, 0);
			}
		}
	}
	
	/**
	 * 콤보 생성<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    MakeComboObject(formObj.ar_ofc_cd, arrStr);
	 * </pre>
	 * @param object cmbObj
	 * @param String arrStr
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */
	function MakeComboObject(cmbObj, arrStr) {
		for (var i = 1; i < arrStr.length;i++ ) {
			var arrStr2 = arrStr[i].split("^");
			var ofc_cd = arrStr2[1];
			cmbObj.InsertItem(i-1, ofc_cd, arrStr[i]);			 
		}
	
		cmbObj.SetDropHeight(190);
	}     
	
	function MakeComboObject2(cmbObj, arrStr) {
		cmbObj.InsertItem(0, "All", "");	
		for (var i = 1; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i, arrStr[i], arrStr[i]);			 
		}
	
		cmbObj.SetDropHeight(190);
	}    
	
	/** 
	 * call method when select event on popup(FNS_INV_0086)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none
	 * @see #
	 * @author Park sung yong
	 * @version 2014.03.24
	 */
	function getFNS_INV_0086(rowArray) {
		var colArray=rowArray[0];
		var formObj=document.form;
		formObj.cust_cd.value=colArray[8] + ComLpad(colArray[9], 6, '0');
		formObj.cust_nm.value = colArray[4];
	}
		 		 
	/**
	 * 콤보박스 ar_ofc_cd 데이터 변경시 실행되는 function<br>
	 * 해당 office값 세팅<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   inv_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
     * @param {IBMultiCombo} comboObj
     * @param {String} oldIndex
     * @param {String} oldText
     * @param {String} oldCode
     * @param {String} newIndex
     * @param {String} newText
     * @param {String} newCode
	 * @author Choi Do Soon
	 * @version 2009.10.06
	 */	
	function inv_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
		sheetObjects[0].RemoveAll();
		document.form.reset();
		comboObj.SetSelectText(newText);
		svc_scp_cd.SetSelectText("All");
		chg_cd.SetSelectText("All");
		document.form.ar_ofc_cd.value = newText;
		
		ComBtnDisable("btn_edi");
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
		
		if( obj == "SCRFA" ) {
			formObject.sc_rfa_no.value=reObj;
		} else if( obj == "CUST" ) {
			formObject.cust_cd.value=reObj;
		}
	}
	
	var selComboIndex, selComboCode;

	function chg_cd_OnSelect(comboObj ,index, text , code) {
		selComboIndex = index;
		selComboCode = code;
	}

	function chg_cd_OnChange(comboObj) {
	    ComSetMultiCombo(comboObj, selComboIndex, selComboCode);
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0],70);
	}
	/* 개발자 작업  끝 */