/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0059.js
*@FileTitle  : e-mail / Auto FAX Invoice Sent Result 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
	// common global valiables
	var tabObjects=new Array();
	var tabCnt=0;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	//IBMultiCombo
	var comboObjects=new Array();
	var combo1=null;
	var comboCnt=0;
	// define button click event handler */
	document.onclick=processButtonClick;
	/** 
	 * event handler branch proecss by button name <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function processButtonClick(){
		var sheetObject1=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			switch(srcName) {
				case "btns_calendar1": 
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObject.from_dt, 'yyyy-MM-dd');
	             	break;
				case "btns_calendar2": 
					var cal=new ComCalendar();
					cal.setDisplayType('date');
	             	cal.select(formObject.to_dt, 'yyyy-MM-dd');
	             	break;
				case "btns_cust1": //CUST retrievev button
					var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
					var v_act_cust_seq=formObject.act_cust_seq.value;
					var classId="FNS_INV_0013";
					var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_seq='+v_act_cust_seq+'&pop_yn=Y&classId='+classId;
					ComOpenWindow('/opuscntr/FNS_INV_0013.do' + param, 'getFNS_INV_0013', 'width=1000,height=680');
					break;
				case "btns_cust2": //CUST retrieve button
					var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
					var v_cust_nm=formObject.cust_nm.value;
					var classId="FNS_INV_0086";
					var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_lgl_eng_nm='+v_cust_nm+'&pop_yn=Y&classId='+classId;
					ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false);
					break;
				case "btns_port": //port retrieve button
					var loc_cd_val=formObject.port.value;
					var loc_port_ind_val="1";
					var dispaly="1,0,1,1,1,1,1,1,1,1,1,1";
					var classId="COM_ENS_051";
					var param='?loc_cd='+loc_cd_val+'&classId='+classId;
					ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 1050, 530, 'getCOM_ENS_051_1', dispaly);
					break;
				case "btns_SCP": //SCP retrieve button
					var v_svc_scp_cd=formObject.svc_scp_cd.value;
					var classId="COM_ENS_0L1";
					var param='?svc_scp_cd='+v_svc_scp_cd+'&classId='+classId;
					ComOpenPopup('/opuscntr/COM_ENS_0L1.do' + param, 700, 420, 'getCOM_ENS_0L1_1', '1,0,1,1,1', true);
					break;
				case "btn_retrieve":
					doActionIBSheet(sheetObject1,formObject,IBSEARCH);
					break;
				case "btn_new":
					sheetObject1.RemoveAll();
					formObject.reset();
					doActionIBSheet(sheetObject1, formObject, IBSEARCH_ASYNC10);
					sent_by.SetSelectCode("");
					io_bnd_cd.SetSelectCode("A");
					formObject.from_dt.focus();
					break;
				case "btn_downexcel":
					if(sheetObject1.RowCount() < 1){//no data
						ComShowCodeMessage("COM132501");
					}else{
						sheetObject1.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
					}
					break;
			} // end switch
		}
		catch(e) {
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
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/** 
	 * add comboObjects array IBCombo Object<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
    /** 
	 *  define onLoad event handler<br> 
     * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function loadPage() {
		sheet1=sheetObjects[0];
		sheetCnt=sheetObjects.length ;
		// combo
		combo1=comboObjects[1];
		comboCnt=comboObjects.length;
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		initControl();
		for(var k=0; k<comboObjects.length; k++){
			initCombo(comboObjects[k],k+1);
		}
		sheet1_OnLoadFinish(sheet1);
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
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){
					var HeadTitle="Office|Sent By|Result|Bound|VVD|Port|Cust. Code|B/L No.|Invoice No.|Receiver No.|User ID|Time Requested|Time Sent";

					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );

					var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
					var headers = [ { Text:HeadTitle, Align:"Center"} ];
					InitHeaders(headers, info);

					var cols = [ {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"iss_ofc_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"sent_by",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"result",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"vvd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"port",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cust_code",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:"received_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cre_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"time_requested",  KeyField:0,   CalcLogic:"",   Format:"YmdHm",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
					             {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"time_sent",       KeyField:0,   CalcLogic:"",   Format:"YmdHm",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 } ];
		       
					InitColumns(cols);

					SetEditable(0);
//					SetColProperty("time_requested", {Format:"####-##-#### ##:##:##"} );
//					SetColProperty("time_sent", {Format:"####-##-#### ##:##"} );

//					SetSheetHeight(400);
					resizeSheet();
				}
			    break;
		}
	}
	/** 
	 * init combo <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @param comboNo 
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function initCombo(comboObj, comboNo) {
		switch(comboObj.options.id) {
			case "io_bnd_cd": 
				with (comboObj) {
					InsertItem(0, "All",    "A");
		            InsertItem(1, "I/B",    "I");
		            InsertItem(2, "O/B",    "O");
		            Code="A";
		    		SetMultiSelect(0);
		    		SetColAlign(0, "left");
		    		SetMultiSeparator(",");
		    		SetDropHeight(190);
		    		SetSelectCode("A");
				}
				break;
			case "ar_ofc_cd":
				with (comboObj) {
					SetColAlign(0, "left");
					SetColWidth(0, "75");
					SetMultiSelect(0);
					SetUseAutoComplete(1);
					SetDropHeight(200);
					SetMaxLength(6);
				}
				break;
			case "sent_by": 
				with (comboObj) {
					InsertItem(0, "All",    	"");
		            InsertItem(1, "Paper",    	"P");
		            InsertItem(2, "E-Mail",    	"E");
		            InsertItem(3, "Fax",    	"F");
		            InsertItem(4, "FTP",    	"T");
		    		SetMultiSelect(1);
		    		SetColAlign(0, "left");
		    		SetMultiSeparator(",");
		    		SetDropHeight(190);
		    		SetSelectCode("");
				}
				break;			
	    }
	}
	/** 
	 * sent_by combobox change.<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj
	 * @param {object} s_index
	 * @param {object} s_code
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.12.01
	 */

	function sent_by_OnCheckClick(comboObj, s_index, s_code) {
		if(s_code == ""){
			if(comboObj.GetItemCheck(0) == true){
				comboObj.SetItemCheck(1,false,0);
		        comboObj.SetItemCheck(2,false,0);
		        comboObj.SetItemCheck(3,false,0);
		        comboObj.SetItemCheck(4,false,0);
			}
		}else{
			comboObj.SetItemCheck(0,false,0);
		}
	}
	/** 
	 * define onLoad event handler <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function initControl() {
		var formObj=document.form;
		axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
		axon_event.addListenerFormat ('beforeactivate', 'obj_activate', formObj);
		axon_event.addListenerForm ('beforedeactivate', 'obj_deactivate', formObj);
		axon_event.addListenerForm ('keyup', 'obj_keyup', formObj);
		axon_event.addListenerForm ('focusout', 'obj_focusout', formObj);
	}
	/** 
	 * OnKeyPress event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function obj_keypress() {
		switch(event.srcElement.dataformat){
			case "float":
				//number+"."
				ComKeyOnlyNumber(event.srcElement, "."); 
			break;
			case "int":
				//number only
				ComKeyOnlyNumber(event.srcElement); 
			break;
			case "engup":
				switch(event.srcElement.name){
					case "iss_ofc_cd":
						//upper case only
						ComKeyOnlyAlphabet('upper');
					break;
					case "act_cust_cnt_cd":
						//upper case only
						ComKeyOnlyAlphabet('upper');
					break;
	    	        case "act_cust_seq":
	    	        	// number only
	        	        ComKeyOnlyNumber(event.srcElement);
					break;
					case "vvd":
						//upper case +number
						ComKeyOnlyAlphabet('uppernum');
					break;
					case "bl_src_no":
						//upper case +number
						ComKeyOnlyAlphabet('uppernum');
					break;
					case "inv_no":
						//upper case +number
						ComKeyOnlyAlphabet('uppernum');
					break;					
					case "bkg_no":
						//upper case+number
						ComKeyOnlyAlphabet('uppernum');
					break;
					case "port":
						//upper case only
						ComKeyOnlyAlphabet('upper');
					break;
	    	        case "svc_scp_cd":
	    	        	//upper case only
						ComKeyOnlyAlphabet('upper');
					break;
				}
			break;
			case "eng":
				switch(event.srcElement.name){
					case "cre_usr_id":
						//upper case only
						ComKeyOnlyAlphabet('num');
					break;
				}
			break;
	        case "num":
	        	//number only
	            ComKeyOnlyNumber('num');
            break;
			default:
				//number only
				ComKeyOnlyNumber(event.srcElement);
			break;
		}
	}
	/** 
	 * OnBeforeActivate event (on focus in)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function obj_activate() {
		var sheetObject=sheetObjects[0];
		var formObject=document.form;
		switch(event.srcElement.name){
			case "from_dt":
				ComClearSeparator (event.srcElement);
			break;
			case "to_dt":
				ComClearSeparator (event.srcElement);
			break;
			default:
				ComClearSeparator (event.srcElement);
			break;
		}
	}
	/** 
	 * Onbeforedeactivate event (on focus out)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function obj_deactivate(){
		var sheetObject=sheetObjects[0];
		var formObject=document.form;
		switch(event.srcElement.name){
			case "from_dt":
				ComChkObjValid(event.srcElement);
			break;
			case "to_dt":
				ComChkObjValid(event.srcElement);
			break;
			case "act_cust_seq":
	        	var v_tmp="";
	            if (formObject.act_cust_seq.value.length != 0 && formObject.act_cust_seq.value.length < 6) {
	            	for(i=0; i < 6 - formObject.act_cust_seq.value.length; i++){
	            		v_tmp=v_tmp + "0";
	            	}
	            	formObject.act_cust_seq.value=v_tmp+formObject.act_cust_seq.value;
	        	}
				if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value) {
					doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
				}
            break;
			default:
				//Validation 
				ComChkObjValid(event.srcElement);
			break;
        }
	}
	
	function obj_focusout() {
	    var sheetObject=sheetObjects[0];
	    var formObject=document.form;
	    var v_tmp="";
	    switch(ComGetEvent("name")){
	        case "act_cust_seq":
				if (formObject.act_cust_seq.value.length != 0 && formObject.act_cust_seq.value.length < 7) {
					for(i=0; i < 6 - formObject.act_cust_seq.value.length; i++){
						v_tmp=v_tmp + "0";
					}
					document.form.act_cust_seq.value=v_tmp+formObject.act_cust_seq.value;
				}	            	
	            if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value) {
	                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
	            }
	        break;
	    }
	}	
	/** 
	 * HTML Control KeyUp event <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param none
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function obj_keyup() {
		var formObj=document.form;
		switch (event.srcElement.name) {
			case "from_dt":
				var fmDt=ComReplaceStr(event.srcElement.value,"-","");
				if (fmDt.length == 8) {
					formObj.to_dt.focus();
				}
	 		break;
			case "act_cust_cnt_cd":
				var custCntCd=event.srcElement.value;
				if (custCntCd.length == 2) {
					formObj.act_cust_seq.focus();
				}
	 		break;
		}
	}
	/** 
	 *  doActionIBSheet<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param  {IBSheet} sheetObj  
	 * @param  {object} formObj
	 * @param  {sAction} sAction 
	 * @param  {int} Row
	 * @param  {int} Col
	 * @param  {String}Val
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
				if(validateForm(sheetObj,formObj,sAction)) {
					formObj.f_cmd.value=SEARCH;
					var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
		 			formObj.ofc_cd.value=arrStr2[1];
		 			formObj.svr_id.value=arrStr2[7];
//parameter changed[check again]CLT
		 			sheetObj.DoSearch("FNS_INV_0059GS.do", FormQueryString(formObj) );
				}
			break;
			case IBSEARCH_ASYNC10: //  AR Office retrieve
				formObj.f_cmd.value=SEARCH02;
//parameter changed[check again]CLT
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");
				MakeComboObject(ar_ofc_cd, arrStr);
				var arrStr2=arrStr[1].split("^");
				var ar_ofc_cd_val=arrStr2[3];
				ar_ofc_cd.SetSelectText(ar_ofc_cd_val);
			break;
			case IBSEARCH_ASYNC20: // customer name retrieve
				var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
				formObj.ofc_cd.value=arrStr2[1];
				formObj.f_cmd.value=SEARCH03;
				var actCustCntCd=formObj.act_cust_cnt_cd.value;
				var actCustSeq=formObj.act_cust_seq.value;
//parameter changed[check again]CLT
				var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+actCustCntCd+"&cust_seq="+actCustSeq);
				if(CoInvShowXmlMessage(sXml) != "") {
					formObj.act_cust_seq.value="";
					formObj.cust_nm.value="";
					ComAlertFocus(formObj.act_cust_seq, CoInvShowXmlMessage(sXml));
				} else {
					var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
					var delt_flg=ComGetEtcData(sXml,"delt_flg");
					if (cust_nm != undefined && delt_flg != undefined) {
						formObj.cust_nm.value=cust_nm;
					} else {
						formObj.act_cust_seq.value="";
						formObj.cust_nm.value="";
					}
				}
			break;
		}
	}
    /** 
	 * function called when OnLoadFinish event<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
     * @param {ibsheet} sheetObj         
     * @return none
     * @see #
     * @author 박정진
     * @version 2009.05.04
     */  	
	function sheet1_OnLoadFinish(sheetObj){
		var formObj=document.form;
		doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC10);
		formObj.from_dt.focus();
	}
	/**
	 * function called when OnSearchEnd <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {ibsheet} sheetObj 
	 * @param {string} ErrMsg 
     * @return none
     * @see #
     * @author 박정진
     * @version 2009.05.04
	 */ 	  	
	function sheet1_OnSearchEnd(sheetObj, Code, Msg){
		var formObject=document.form;
		var emailCnt=0;
		var faxCnt=0;
		var paperCnt=0;
		var totalCnt=0;
		var sentCnt=0;
		var sentRt=0;
		var ftpCnt=0;
		if(sheetObj.RowCount()> 0) {
			for(i = 1 ; i <= sheetObj.LastRow(); i++){
				if (sheetObj.GetCellValue(i, "sent_by") == "e-mail") {
					emailCnt ++
				}
				if (sheetObj.GetCellValue(i, "sent_by") == "FAX") {
					faxCnt ++
				}
				if (sheetObj.GetCellValue(i, "sent_by") == "FTP") {
					ftpCnt ++
				}
				if (sheetObj.GetCellValue(i, "sent_by") == "Paper") {
					paperCnt ++
				}
				if (sheetObj.GetCellValue(i, "result") == "SUCCESS") {
					sentCnt ++
				}
			}
			totalCnt=emailCnt + faxCnt + paperCnt + ftpCnt;
			if (sentCnt > 0 && totalCnt > 0) {
				sentRt=sentCnt / totalCnt * 100;
			}
		}
		formObject.eml_cnt.value=emailCnt;
		formObject.fax_cnt.value=faxCnt;
		formObject.paper_cnt.value=paperCnt;
		formObject.ftp_cnt.value=ftpCnt;
		formObject.ttl_cnt.value=totalCnt;
		formObject.snd_cnt.value=sentCnt;
		formObject.snd_rt.value=InvRound(sentRt,2);
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
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function validateForm(sheetObj,formObj,sAction){
		 switch(sAction) {
		 	case IBSEARCH:      //Retrieve
		 		with(formObj){
		 			if(bl_src_no.value == "" && inv_no.value == "" && vvd.value == "") {
			 			if(from_dt.value == "") {
			 				ComShowCodeMessage("INV00004");
			 				from_dt.focus();
							return false;
						}
						if(to_dt.value == "") {
							ComShowCodeMessage("INV00004");
							to_dt.focus();
							return false;
						}
						if (from_dt.value != "" && to_dt.value != "") {
							var nextDate=ComGetDateAdd(from_dt.value, "M", 1);
							nextDate=ComReplaceStr(nextDate,"-","");
							if (to_dt.value >= nextDate) {
								ComShowCodeMessage("INV00043");
								to_dt.focus();
								return false;
							}
						}
						
		 			}
		 			if(ar_ofc_cd.value == "") {
						ComShowCodeMessage("INV00004");
						ar_ofc_cd.focus();
						return false;
					}
				}
		 	break;
	    }
		return true;
	}
	/** 
	 * office code select box <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBMultiCombo} comboObj  
	 * @param  {Array} arrStr
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function MakeComboObject(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_cd=arrStr2[1];
			cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
		}
		var userCntCd=document.form.user_cnt_cd.value;
		if (userCntCd == 'KR') {
			cmbObj.InsertItem(0, "All", "ALL^^^^^^^KOR");
		}
		else {
			cmbObj.InsertItem(0, "All", "ALL^^^^^^^");
		}
		cmbObj.SetBackColor("#CCFFFD");
	}
	/** 
	 * init UI when ar_ofc_cd changed.<br>
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
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.10.19
	 */
    function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
    	var formObject=document.form;
    	var expensInfo1=code.split("^");
    	ComSetObjValue(formObject.ofc_cd,expensInfo1[1]);
    }
	/** 
	 * handling Popup (FNS_INV_0086)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function getFNS_INV_0086(rowArray) {
		var colArray=rowArray[0];
		var formObject=document.form;
		formObject.act_cust_cnt_cd.value=colArray[8];
		formObject.act_cust_seq.value=ComLpad(colArray[9], 6, '0');
		formObject.cust_nm.value=colArray[4];
	}
	/** 
	 * handling Popup (COM_ENS_051_1)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray  
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function getCOM_ENS_051_1(rowArray) {
		var colArray=rowArray[0];
		document.all.port.value=colArray[3];
	}
	/** 
	 * handling Popup (COM_ENS_0L1_1)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {array} rowArray   
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function getCOM_ENS_0L1_1(rowArray) {
		var colArray=rowArray[0];
		document.all.svc_scp_cd.value=colArray[3];
	}

	function resizeSheet(){
		ComResizeSheet(sheetObjects[0],100);
	}