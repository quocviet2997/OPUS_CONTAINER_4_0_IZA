/**=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0113.js
*@FileTitle  : APC EDI
*@author     : CLT
*@version    : 1.0
*@since      : 2014/12/14
=========================================================**/

/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    var sheetObjects=new Array();
    var sheetCnt=0;
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	document.onclick=processButtonClick;
	/** 
	 * event handler branch process by button name <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @version 2009.10.20
	 */
	function processButtonClick(){
		var sheetObj1=sheetObjects[0];
		/*******************************************************/
		var formObj=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btn_retrieve":
					doActionIBSheet(sheetObj1,formObj,IBSEARCH);
				break;
				
				case "btn_new":					
					sheetObj1.RemoveAll();
					initSheet(sheetObj1,1);
					formObj.reset(); 
					ComBtnDisable("btn_edi");
					ComBtnEnable("btn_retrieve");
					formObj.edi_fg.value = "N" ;
					
				break;
				
				case "btn_edi": 
					ComBtnDisable("btn_edi");
					ComBtnDisable("btn_retrieve");
					
				 if(formObj.edi_fg.value == "N"){
					 formObj.edi_fg.value = "Y" ;
					 doActionIBSheet(sheetObj1,formObj,IBSAVE);
				  }
					/*if(formObj.gubun.value == "S"){
						doActionIBSheet(sheetObj1,formObj,IBSAVE);
					//Non Shipment Invoice
					} else {
						if(ComShowCodeConfirm("INV00139") == 1) {
							doActionIBSheet(sheetObj1,formObj,COMMAND01);
	                    }
					}*/	
				break; 
				
				case "pop_vsl_cd":  
					   var url="CPS_CNI_0306.do";
				       var winName="CPS_CNI_0306"; 
				       var popupWin=ComOpenWindowCenter("/opuscntr/CPS_CNI_0306.do", "setVslCd", 800, 435, false, "no");		
					   //var reqWin=openWinCenter(url,winName,800,435);	
			           break;
			           
				case "btn_excel":
					if(sheetObj1.RowCount() < 1){//no data 
	                    ComShowCodeMessage("COM132501");
	                }else{ 
	                	sheetObj1.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObj1), SheetDesign:1,Merge:1 });
	                }
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
	 * add IBSheet Object array <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none
	 * @see #
	 * @version 2009.04.27
	 */ 
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * add comboObjects array IBCombo Object <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @see #
	 * @version 2009.04.27
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
    /** 
     * define onLoad event handler<br>
     * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @version 2009.04.27
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		//IBMultiCombo초기화
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		initControl(); 
		form.vvd_cd.focus();
	}
	/** 
	 * initializing sheet, define header<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param sheetObj 
	 * @param sheetNo 
	 * @return none
	 * @see #
	 * @version 2009.04.27
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt = 0;
		var sheetID = sheetObj.id;
		switch(sheetID) {
		
			case "sheet1":
				with (sheetObj) {
				var HeadTitle1="||Sel|edi_hdr_seq|I/F No|B/L No|BKG No|Invoice No|Office|rev_tp_src_cd|act_cust_cnt_cd|act_cust_seq|Customer Code|Customer Name|vsl_cd|skd_voy_no|skd_dir_cd|VVD|Scope|Lane|S/A Date|Bound|POR|POL|POD|DEL|sc_no|rfa_no|Invoice Date|Local CUR|Invoice AMT|Send Status|Send Date|edi_tp_cd|Charge Seq|Charge Code|Charge CUR|Per Type|Charge AMT|||||||";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:2, Page:10000, DataRowMerge:0, FrozenCol:10 } );
					var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ]; 
					InitHeaders(headers, info);  
					var cols = [ {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"merge_chk",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Status",    Hidden:1,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
					             {Type:"CheckBox",  Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"selchk" },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"edi_hdr_seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"bl_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"inv_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"rev_tp_src_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"cust_cd",        	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:200,   Align:"Left",  ColMerge:1,   SaveName:"cust_nm",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd",        	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"vvd",         	  	  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"slan_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Combo",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"por_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"del_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"sc_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"rfa_no",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"inv_dt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"locl_curr_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"inv_ttl_locl_amt",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"edi_snd_flg",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:1,   SaveName:"edi_snd_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }, 
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"edi_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:1,   SaveName:"chg_seq",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"chg_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"curr_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"per_tp_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Right",  ColMerge:1,   SaveName:"chg_amt",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"trf_rt_amt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"rat_as_cntr_qty",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"tva_flg",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"cust_cr_flg",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"pay_cond",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"chg_ref_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:1,  Width:95,   Align:"Center",  ColMerge:1,   SaveName:"inv_delt_div_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 }
					             ];
					InitColumns(cols); 
					//SetCountPosition(0);
					SetEditable(1);
					SetColProperty("sail_arr_dt", {Format:"Ymd"} );
					SetColProperty("inv_dt", {Format:"Ymd"} ); 
					SetColProperty("io_bnd_cd", {ComboText:"O/B|I/B", ComboCode:"O|I"} );   
					SetSelectionMode(0); 
					//SetSheetHeight(170);
					resizeSheet(); 

				} 
			break;			
		}
	}
	
	
	/**
	* input Vessel Code/Name
	* @param {arry} aryPopupData   sheetObjects[0]  sheetIdx
	*/
	function setVvdCd(vvdVo){ 
		document.form.vvd_cd.value=vvdVo.vvd_cd; 
		document.form.vsl_eng_nm.value=vvdVo.vsl_eng_nm;
	}
	
	/** 
	 * init combo box<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.04.27
	 */
	/*function initCombo(comboObj, comboNo) {
		switch (comboObj.id) {
			case "ar_ofc_cd":
				with (comboObj) {
					SetColAlign(0, "left");
					SetColWidth(0, "50");
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					SetDropHeight(200);
					SetMaxLength(6);
				}
				break;
			case "acct_cd":
				with (comboObj) {
					SetMultiSelect(0);
					SetDropHeight(200);
				}
				break;
		}
	}*/
    /**
		 * registering initial event 
	 **/
	function initControl() {
		var formObj=document.form;
		//axon_event.addListenerFormat('beforedeactivate', 'obj_blur'    , formObj); 	//- handling code when OnBeforeDeactivate(blur) event
		//axon_event.addListenerFormat('beforeactivate'  , 'obj_focus'   , formObj);  //- handling code when OnBeforeActivate event in case of existing dataformat property
		axon_event.addListenerFormat('change'          , 'obj_onchange', formObj); 
	} 
	
	/*function obj_focus(){
	    ComClearSeparator(ComGetEvent());
	}
	*/
	function obj_onchange(){
		var formObj=document.form;
		var sheetObject=sheetObjects[0];
		switch(ComGetEvent("name")){
			case "vvd_cd": 
				if (formObj.vvd_cd.value != '' && formObj.vvd_cd.value.substring(0,4) != 'CFDR') {
					doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC02);
				}
				break;
		}
	}
	
	/** 
	 * validateForm <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj  
	 * @param  {object} formObj 
	 * @param  {sAction} sAction 
	 * @return true, false
	 * @see #
	 * @version 2009.04.27
	 */
	function validateForm(sheetObj,formObj,sAction){
    	switch(sAction) {
			case IBSEARCH_ASYNC02:      //Retrieve
			    //CHLS0049E 
				if (form.vvd_cd.value.trim() != "" && form.vvd_cd.value.trim().length < 9) {
					ComShowCodeMessage("INV00005");       
					form.vvd_cd.value = ""; 
					form.vsl_eng_nm.value = "";
					form.vvd_cd.focus(); 
					return false;     
				}  
			break;
			 	
			case IBSEARCH:      //조회
				if(form.vvd_cd.value == "") {
					ComShowCodeMessage("INV00005");
					ComSetFocus(form.vvd_cd);  
					//form.vvd_cd.focus();
					return false;
				} 
			break;
			
			case IBSAVE:
				var iCheckRow = sheetObj.FindCheckedRow("selchk");
				if (iCheckRow== "") {
					ComShowCodeMessage("INV00025");
					formObj.edi_fg.value = "N" ;
					ComBtnEnable("btn_edi");
					ComBtnEnable("btn_retrieve");
					return false;
				}
				
				formObj.f_cmd.value=SEARCH02; 
				var sParam = sheetObj.GetSaveString(false, true, "selchk");				
				if (sParam == "") {
					return false;
				}				
	 			var sXml=sheetObj.GetSearchData("FNS_INV_0113GS.do", FormQueryString(formObj) + "&" + ComSetPrifix(sParam,"sheet1_"));
	 			var sendFlg=ComGetEtcData(sXml,"send_flag");
	 			if (sendFlg== "Y") {
	 				ComShowCodeMessage("INV00175");
	 				ComBtnEnable("btn_retrieve");
	 				return false;
	 			}
	 		
			break;
			
    	}
		return true;
	}
	
	// handling sheet process Sheet관련 프로세스 처리
	function doActionIBSheet(sheetObj, formObj, sAction) {
		switch (sAction) {
			case IBSEARCH_ASYNC02:	//Search VVD Info
				if (!validateForm(sheetObj, formObj, sAction)){return;} 
				formObj.f_cmd.value=COMMAND03; 
	 			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
	 			var vslEngNm = ComGetEtcData(sXml, "vsl_name") 
	 			
	 			if(vslEngNm != null && vslEngNm.length > 0){ 
	 				formObj.vsl_eng_nm.value = vslEngNm;  
	 			} else {
	 				ComShowCodeMessage("INV00005");
	 				form.vvd_cd.value = ""; 
					form.vsl_eng_nm.value = ""; 
					form.vvd_cd.focus();  
	 			}
				break;
				
			case IBSEARCH:      //조회 
				if(validateForm(sheetObj,formObj,sAction)) {
					ComOpenWait(true); 
					formObj.f_cmd.value = SEARCH;  
					var sXml = sheetObj.GetSearchData("FNS_INV_0113GS.do", FormQueryString(formObj));
					sheetObj.LoadSearchData(sXml,{Sync:1});  
					ComOpenWait(false); 
				}
				break;
			
			case IBSAVE:        //저장
				ComOpenWait(true);	
				if(validateForm(sheetObj,formObj,sAction)) {
 
					formObj.f_cmd.value = MULTI;
					
//					var iCheckRow = sheetObj.FindCheckedRow("selchk");
//					if (iCheckRow== "") {
//						ComShowCodeMessage("INV00025");
//						return;
//					}
//					
					var sParam = sheetObj.GetSaveString(false, true, "selchk");
					if (sParam == "") {
						return;
					}
		
					var sXml = sheetObj.GetSaveData("FNS_INV_0113GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sParam,"sheet1_") );
					
					if (sXml.indexOf("ERROR") < 1){
						ComShowCodeMessage("INV00051");
					}
					else {
						ComShowCodeMessage("INV00053");
					}
					//ComBtnDisable("btn_edi");
					doActionIBSheet(sheetObj,formObj,IBSEARCH);  
					ComOpenWait(false);
				}else{
					ComOpenWait(false);
				}
			break;
			
		}
	}
	
	function change_event_radio1(){ 
		sheetObjects[0].RemoveAll();
	}

	function change_event_radio2(){
		sheetObjects[0].RemoveAll();
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
		
    	var no_send = "X" ;
    	   
    	for(var i = sheetObj.HeaderRows(); i <= sheetObj.LastRow(); i++) {   
    		var sendflg = sheetObj.GetCellValue(i, "edi_snd_flg");
			if(sendflg == "Y") { 
				sheetObj.SetCellEditable(i,"selchk",0);  
			} else {
				no_send = "N"  ;
			}
    	 }
    	 if(no_send == "N" ){
			document.form.edi_fg.value = "N" ;
		    if(sheetObj.RowCount() > 0) ComBtnEnable("btn_edi");
		 }else{
			 ComBtnDisable("btn_edi"); 
		 }
	}
	   
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		var formObj=document.form;
		
		if(sheetObj.ColSaveName(Col) == "selchk") {
			var mergeKey1 = sheetObj.GetCellValue(Row, "merge_chk");
			for(var i = Row + 1; i <= sheetObj.RowCount(); i++){
				var mergeKey2 = sheetObj.GetCellValue(i, "merge_chk");
				if(mergeKey1 == mergeKey2) sheetObj.SetCellValue(i, Col, Value, 0);
			}
		}
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
	}
	