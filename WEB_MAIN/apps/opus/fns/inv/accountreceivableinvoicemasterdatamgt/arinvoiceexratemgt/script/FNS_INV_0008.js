/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0008.jsp
*@FileTitle  : Ex. Rate Entry by Date 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
	/**
	 * @extends 
	 * @class fns_inv_0008 : fns_inv_0008 Defining business script.
	 */
	function fns_inv_0008() {
		this.processButtonClick=tprocessButtonClick;
		this.setSheetObject=setSheetObject;
		this.loadPage=loadPage;
		this.initSheet=initSheet;
		this.initControl=initControl;
		this.doActionIBSheet=doActionIBSheet;
		this.setTabObject=setTabObject;
		this.validateForm=validateForm;
	}
	// Common variables.
	var sheetObjects=new Array();
    var comboObjects=new Array();
	var sheetCnt=0;
	var comboCnt=0;
	// Defining button events. */
	document.onclick=processButtonClick;
	var ROWMARK="|";
	var FIELDMARK="=";
	
	var officeStr = "";
	var officeArr = new Array();
	var arOfficeLogin = "";
	
	/** 
	 * Handling button event. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.  
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function processButtonClick(){
		/***** Setting each tab's sheet variable. *****/
		var sheetObject1=sheetObjects[0];
		var sheetID=sheetObject1.id;
        var prefix=sheetID + "_";
        
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) {
			    case "btn_history":
			    	var chkRowCnt = sheetObjects[0].FindCheckedRow(prefix+"del_chk") == "" ? 0 : sheetObjects[0].FindCheckedRow(prefix+"del_chk").split("|").length;
			    	
			    	if (chkRowCnt == 0) {
			    		
			    		var param = "fm_dt=" + formObject.fm_dt1.value;
			    		param += "&to_dt=" + formObject.to_dt1.value;
			    		param += "&io_bnd_cd=" + formObject.io_bnd_cd.value;
			    		param += "&locl_curr_cd=" + formObject.locl_curr_cd.value;
			    		//param += "&ar_ofc_cd=" + formObject.ar_ofc_cd.value;
			    		
			    		var selOffice = getSelectAROfc();
						var arrStr = selOffice.split(",");	
						if(arrStr.length == 1 ) { 
							param += "&ar_ofc_cd=" + arrStr[0];
						}
			    		
			    		ComOpenPopup("FNS_INV_0081.do?"+param, 1000, 500, "", "0,0", true, false);
			    		
			    	} else if (chkRowCnt == 1) {
			    		var chkRow = sheetObjects[0].FindCheckedRow(prefix+"del_chk");
			    		var param = sheetObjects[0].RowSaveStr(chkRow) + "&" ;
			    		ComOpenPopup("FNS_INV_0081.do?"+param, 1000, 500, "", "0,0", true, false);
			    	} else if (chkRowCnt > 1) {
			    		ComShowCodeMessage("INV00141");   //Please select one data to see history data.
						return;			    		
			    	}
			    	break;
				case "btn_retrieve":
					sheetObjects[0].RemoveAll();
					sheetObjects[1].RemoveAll();
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
					break; 
				case "btn_new":
					sheetObjects[0].RemoveAll();
					sheetObjects[1].RemoveAll();
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01);
					break; 
				case "btn_save":
					sheetObjects[1].RemoveAll();					
					doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
					break;
				case "btn_downExcel":
					if(sheetObjects[0].RowCount() < 1){//no data
						ComShowCodeMessage("COM132501");
					}else{
						sheetObjects[0].Down2Excel({ HiddenColumn:-1,Merge:true,TreeLevel:false,DownCols:'2|3|4|6|7|8|9|10|11|12|18'});
					}
					
					break; 
				case "btn_loadExcel":
					sheetObjects[0].RemoveAll();
					sheetObjects[0].LoadExcel();
					break; 
				case "btn_add":
					doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
					break;  
				case "btn_copy":
					sheetObjects[0].DataCopy();
					break; 
				case "btn_del":
					for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
						if (sheetObjects[0].GetRowStatus(i) != "I" && sheetObjects[0].GetCellText(i,prefix+"del_chk").trim() == 1) {
							
							//삭제가능 체크
							//VVD 환율 존재여부체크
							var vvd_cnt = sheetObjects[0].GetCellText(i,prefix+"vvd_cnt");
							if (vvd_cnt != "0" ) {
								var bound = sheetObjects[0].GetCellText(i,prefix+"io_bnd_cd");
								var office = sheetObjects[0].GetCellText(i,prefix+"ar_ofc_cd");
								var chgCurr = sheetObjects[0].GetCellText(i,prefix+"chg_curr_cd");
								var msg = "Office : " + office + ", Bound : " + bound + ", Charge Curr : " + chgCurr +"\n";
								ComShowCodeMessage("INV00156", msg );
								return ;			
							}
							
							
							//Remark Check
							var orgRemark = sheetObjects[0].CellSearchValue(i,prefix+"cng_rmk").trim();
							var newRemark = sheetObjects[0].GetCellText(i,prefix+"cng_rmk").trim();
							if (sheetObjects[0].GetCellText(i,prefix+"cng_rmk").trim() == ""){
								ComShowCodeMessage("INV00151"); // Please specify the reason for changing exchange rate.
								return;
							} else if (orgRemark == newRemark) {
								ComShowCodeMessage("INV00152"); // Please specify the reason for deleting exchange rate.
								return;
							}
						}
					}					
					
					ComRowHideDelete(sheetObjects[0], prefix+"del_chk");
					break;                                         
				case "btns_calendar1": // Calendar button.
				var cal=new ComCalendar();
				cal.select(formObject.fm_dt1, 'yyyy-MM-dd');
				break;
				case "btns_calendar2": // Calendar button.
				var cal=new ComCalendar();
				cal.select(formObject.to_dt1, 'yyyy-MM-dd');
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
	 * Register IBSheet object on sheetObjects array. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	
	/**
	* 페이지에 생성된 IBCombo Object를 comboObjects 배열에 등록
	* @param {IBMultiCombo} combo_obj    IBMultiCombo Object  
	**/
	function setComboObject(combo_obj){
		comboObjects[comboCnt++]=combo_obj;
	}
	
	/** 
	 * Coding event handler for body tag's OnLoad. <br>
	 * Add  pre-process functions after loading by browser. <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  none.
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function loadPage() {
		for(i=0;i<sheetObjects.length;i++){
			ComConfigSheet (sheetObjects[i] );	
			initSheet(sheetObjects[i],i+1);
			ComEndConfigSheet(sheetObjects[i]);
		}
		
	    //init IBMultiCombo
	    for(var k=0; k<comboObjects.length; k++){
	        initCombo(comboObjects[k],k+1);
	    }
	    
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 	
	}
	
	/** 
	 * init combo<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {IBMultiCombo} comboObj  comboObj
	 * @return none
	 * @see #
	 * @author 박정진
	 * @version 2009.05.04
	 */
	function initCombo(comboObj, comboNo) {
	    switch (comboObj.options.id) {
	        case "ar_ofc_cd2":
	            with (comboObj) {
	        	 
	        	comboObj.SetColAlign(0, "left");
	        	//comboObj.SetColWidth(0, "100");
	                //SetTitle("Office Code");
	        	comboObj.SetMultiSelect(1);
	        	comboObj.SetMultiSeparator(",");
	        	comboObj.SetUseAutoComplete(1);
	        	comboObj.SetDropHeight(200);
	        	comboObj.SetMaxLength(6);
	            }
	        break;
	    }
	}	
	/** 
	 * Initialize sheets. <br>
	 * Add  pre-process functions after loading by browser. <br>
	 * Coding initial modules as sheet's count. <br> 
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param {IBSheet} sheetObj : Sheet object.
	 * @param Serial number for sheet object's ID.  
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var sheetID=sheetObj.id;
		var prefix=sheetID + "_";
		switch(sheetNo) {
		case 1:      //sheet1 init
		    with(sheetObj){       
			      var HeadTitle="|Sel.|Seq.|Office|Date|To Date|Bound|Local Curr|Charge Curr|Description|Ex. Rate|Updated By|Updated Date|xch_rt_tp_cd|cust_cnt_cd|cust_seq|ivs_xch_rt|pre_inv_xch_rt|Remark|VVD_CNT";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
			             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
			             {Type:"Seq",       Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"Seq" },
			             {Type:"Text",      Hidden:0, Width:70,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ar_ofc_cd",      UpdateEdit:0,   InsertEdit:0 },
			             {Type:"PopupEdit", Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"PopupEdit", Hidden:1, Width:110,  Align:"Center",  ColMerge:0,   SaveName:prefix+"to_dt",           KeyField:0,   CalcLogic:"|4|",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",    UpdateEdit:0, InsertEdit:0 },
			             {Type:"Combo",     Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"chg_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:140,  Align:"Left",    ColMerge:0,   SaveName:prefix+"curr_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Float",     Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"inv_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",      Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Date",      Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"xch_rt_tp_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_cnt_cd" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_seq" },
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ivs_xch_rt" },			             
			             
			             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"pre_inv_xch_rt" },
			             {Type:"Text", 		Hidden:0, Width:110,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cng_rmk",         UpdateEdit:1,   InsertEdit:1 },
			      		 {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_cnt"  } ];
			       
			      InitColumns(cols);
			      SetEditable(1);
			      //SetSheetHeight(450);
			      SetWaitImageVisible(0);
			      SetColProperty(prefix+"io_bnd_cd", {ComboText:"ALL|O/B|I/B", ComboCode:"|O|I"} );
			      InitComboNoMatchText(true);
			      
			      resizeSheet();
	      }
		break;
		case 2:      //sheet2 init
		    with(sheetObj){       
			      var HeadTitle="|Sel.|Seq.|Office|Date|To Date|Bound|Local Curr|Charge Curr|Description|Ex. Rate|Updated By|Updated Date|xch_rt_tp_cd|cust_cnt_cd|cust_seq|ivs_xch_rt|pre_inv_xch_rt|tmp_flag|latest_rate|div_rate|dup_chk|vvd_cnt|Remark";
			      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"Status",  Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
			                   {Type:"Text",    Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
			                   {Type:"Seq",     Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"Seq" },
			                   {Type:"Text",    Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:prefix+"ar_ofc_cd" },
			                   {Type:"Text",	Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:prefix+"fm_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                   {Type:"Text", 	Hidden:0, Width:110,  Align:"Center",  ColMerge:0,   SaveName:prefix+"to_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                   {Type:"Text",    Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"io_bnd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                   {Type:"Text",    Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"locl_curr_cd",    UpdateEdit:0, InsertEdit:0 },
			                   {Type:"Text",    Hidden:0, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"chg_curr_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			                   {Type:"Text",    Hidden:1, Width:140,  Align:"Left",    ColMerge:0,   SaveName:prefix+"curr_nm",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                   {Type:"Float",   Hidden:0, Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"inv_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:1,   InsertEdit:1 },
			                   {Type:"Text",    Hidden:1, Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_usr_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                   {Type:"Date",    Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:prefix+"upd_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			                   {Type:"Text",    Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"xch_rt_tp_cd" },
			                   {Type:"Text",    Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_cnt_cd" },
			                   {Type:"Text",    Hidden:0, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"cust_seq" },
			                   {Type:"Text",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"ivs_xch_rt" },			             
			                   {Type:"Text",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"pre_inv_xch_rt" },
			                   {Type:"Text",    Hidden:0, Width:50,    Align:"Center",  ColMerge:1,  SaveName:prefix+"tmp_ib_flag" },
			                   {Type:"Text",    Hidden:0, Width:100,    Align:"Center",  ColMerge:1, SaveName:prefix+"latest_rate" },
			                   {Type:"Text",    Hidden:0, Width:50,    Align:"Center",  ColMerge:1,   SaveName:prefix+"div_rate" },
			                   {Type:"Text",    Hidden:0, Width:50,    Align:"Center",  ColMerge:1,   SaveName:prefix+"dup_chk" },
			                   {Type:"Text",    Hidden:0, Width:50,    Align:"Center",  ColMerge:1,   SaveName:prefix+"vvd_cnt" },
			                   {Type:"Text", 	Hidden:0, Width:110,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cng_rmk",           KeyField:0,   CalcLogic:"",   Format:"",         PointCount:0,   UpdateEdit:1,   InsertEdit:0 } ];
			       
			      InitColumns(cols);
			      SetEditable(1);
			      SetSheetHeight(450);
			      SetWaitImageVisible(0);
		}
		break;
		}
	}
	
	function resizeSheet(){
	    ComResizeSheet(sheetObjects[0]);
	}
	
	/** 
	 * Coding retrieve, save... <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return none.
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		var sheetID=sheetObj.id;
        var prefix=sheetID + "_";

		switch(sAction) {
			case IBSEARCH_ASYNC01: // Retrieve AR_OFFICE_LIST.
				ComOpenWait(true);
				formObj.f_cmd.value=SEARCH02;
				var sXml=sheetObj.GetSearchData("FNS_INV_0008GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
				var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
				var arrStr=sStr.split("|");		
				
				officeStr = sStr;
				officeArr = arrStr;
				
				MakeComboObject2(ar_ofc_cd2, arrStr);
				var arrStr2="";
				var ar_ofc_cd="";
								
				for(var i=1;i<arrStr.length;i++){
					arrStr2=arrStr[i].split("^");
					if(  (arrStr2[1]==arrStr2[3]) && (arrStr2[12] == "V" || arrStr2[12] == "D")){
						//alert(arrStr2[1] +":::" + arrStr2[3] );
						ar_ofc_cd=arrStr2[1];
						this.arOfficeLogin = ar_ofc_cd;
						//ar_ofc_cd2.text=ar_ofc_cd;
						if(officeArr.length > 2) {
							ar_ofc_cd2.SetItemCheck(i+1, true);
						} else {
							ar_ofc_cd2.SetItemCheck(i-1, true);
						}
						formObj.ar_ofc_cd.value=ar_ofc_cd;
						formObj.ar_ofc_cd_1.value=ar_ofc_cd;
						
						setOfcOtherInfo(arrStr2);
					}
				}
				
				//inv_curr_cd setting
			    inv_curr_cd.RemoveAll();
			    var lclCurr = document.form.locl_curr_cd.value;
			    var altnCurr = document.form.altn_curr_div_cd.value;
			    
			    //alert(altnCurr);
			    
			    inv_curr_cd.InsertItem(0, lclCurr, lclCurr);
			    if(lclCurr != altnCurr && altnCurr != "" && altnCurr != "LCL" ) { 
			    	inv_curr_cd.InsertItem(1, altnCurr, altnCurr);
			    } else {
			    	inv_curr_cd.SetSelectText(lclCurr);
			    }
			    inv_curr_cd.SetSelectText(lclCurr);  //default setting
			    
				
				//====== combo list ====================//
				var comboValues=ComGetEtcData(sXml, "currInfo");	
				addCellComboItem(sheetObj,comboValues,prefix+"chg_curr_cd",false);						
				//====== combo list ====================//
				formObj.io_bnd_cd.selectedIndex = 0;
				var ret=ComGetNowInfo("ymd" );
				formObj.fm_dt1.value=ret;
				var lastDay=ComGetLastDay(ComGetNowInfo("yy" ), ComGetNowInfo("mm" ));
				formObj.to_dt1.value=ret;
				
				
				ComOpenWait(false);
			break;
			case IBSEARCH:      //retrieve
				
				formObj.f_cmd.value=SEARCH01;
				var fm_dt=formObj.fm_dt1.value.split("-");
				var to_dt=formObj.to_dt1.value.split("-");
				formObj.fm_dt.value=fm_dt[0]+fm_dt[1]+fm_dt[2];
				formObj.to_dt.value=to_dt[0]+to_dt[1]+to_dt[2];
				var xch_rt_tp_cd=formObj.xch_rt_tp_cd.value;
				if(xch_rt_tp_cd!="C" && xch_rt_tp_cd!="D"){
					xch_rt_tp_cd=formObj.xch_rt_n3rd_tp_cd.value;
				}
				formObj.xch_rt_tp_cd.value=xch_rt_tp_cd;
				formObj.multi_office_list.value=MakeInQueryStr(ar_ofc_cd2.GetSelectText(), ",");
				
				var nextDate=ComGetDateAdd(formObj.fm_dt.value, "D", 7);
		        if (formObj.to_dt1.value >= nextDate) {
		        	ComShowCodeMessage("INV00184", "7");
		        	formObj.to_dt1.focus();
		            return;
		        }
				
				/*ComOpenWait(true);
				setTimeout( function () {					
					var sXml=sheetObj.GetSearchData("FNS_INV_0008GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
					sheetObj.LoadSearchData(sXml,{Sync:1} );
					
					
					ComOpenWait(false);
				} , 100);
				*/
				ComOpenWait(true);
				sheetObj.DoSearch("FNS_INV_0008GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"), {Sync:0} );
				
			break;
			
			case SEARCH01:      //retrieve
				
				formObj.f_cmd.value=SEARCH01;
				var fm_dt=formObj.fm_dt1.value.split("-");
				var to_dt=formObj.to_dt1.value.split("-");
				formObj.fm_dt.value=fm_dt[0]+fm_dt[1]+fm_dt[2];
				formObj.to_dt.value=to_dt[0]+to_dt[1]+to_dt[2];
				var xch_rt_tp_cd=formObj.xch_rt_tp_cd.value;
				if(xch_rt_tp_cd!="C" && xch_rt_tp_cd!="D"){
					xch_rt_tp_cd=formObj.xch_rt_n3rd_tp_cd.value;
				}
				formObj.xch_rt_tp_cd.value=xch_rt_tp_cd;
				formObj.multi_office_list.value=MakeInQueryStr(ar_ofc_cd2.GetSelectText(), ",");
				
				/*var sXml=sheetObj.GetSearchData("FNS_INV_0008GS.do", FormQueryString(formObj));
				sheetObj.LoadSearchData(sXml,{Sync:1} );*/
				sheetObj.DoSearch("FNS_INV_0008GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_"), {Sync:2} );
				
				ComShowCodeMessage("INV00051");
					
			break;			

			case IBSAVE:        
				
				
				var arSelList = "";
				if (sheetObjects[0].RowCount("I") > 0 ) { 
					arSelList = getSelectAROfc(); 
					if ( arSelList != "" ) {
						if (!ComShowCodeConfirm("INV00149", arSelList)){
							return false;
						}
					} else {
						ComShowCodeMessage("INV00148");
						return false;
					}
				}
				
				var insCnt = 0;
				var prefix = sheetObjects[0].id  + "_";					
				for(var i=1; i <=sheetObjects[0].RowCount(); i++ ) {
	    			if(sheetObjects[0].GetRowStatus(i) == "I") {
	    				var bound = sheetObjects[0].GetCellText(i,prefix + "io_bnd_cd");
	    				if (bound == "") {
	    					insCnt +=2;
	    				} else {
	    					insCnt +=1;
	    				}
	    			}
				}	    				
				
				var estimateCnt = ( insCnt + sheetObjects[0].RowCount("U") + sheetObjects[0].RowCount("D") ) * arSelList.split(",").length;

				if (estimateCnt > 5000) {
					ComShowCodeMessage("INV00154");
					return false;
				}
				
				
				var time = 100;
				if( estimateCnt < 501) {
					time = 500;
				} else if(estimateCnt > 500 && estimateCnt < 1001) {
					time = 1000;
				} else if(estimateCnt > 1000 && estimateCnt < 2001) {
					time = 5000;
				} else if(estimateCnt > 2000 && estimateCnt < 3001) {
					time = 10000;
				} else if(estimateCnt > 2000 && estimateCnt < 4001) {
					time = 15000;
				} else if(estimateCnt > 3000 && estimateCnt < 5001) {
					time = 20000;
				} else if(estimateCnt > 4000 && estimateCnt < 6001) {
					time = 25000;
				} else if (estimateCnt > 5000) {
					time = 30000;
				}
				
				if(!validateForm(sheetObjects[0],formObj,sAction)) {
					return false;	
				}
				
				
				//Tmp Table Insert 후 화면에 로딩
				ComOpenWait(true);				
				setTimeout( function () {					
					formObj.f_cmd.value=MULTI01;
					//formObj.multi_office_list.value=ar_ofc_cd2.GetSelectText();
					formObj.multi_office_list.value=MakeInQueryStr(ar_ofc_cd2.GetSelectText(), ",");
					var sParam = ComGetSaveString(sheetObjects[0], true, true) + "&" +FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet2_");
					var sXml=sheetObjects[0].GetSaveData("FNS_INV_0008GS.do", sParam);
					//alert(sXml);
					sheetObjects[1].LoadSaveData(sXml,{Sync:1} );

					ComOpenWait(false);
				} , time);	
							
			
				
				//위에서 로딩된 데이타로 저장 실행
				ComOpenWait(true);
				setTimeout( function () {	
					if(!validateRate(sheetObjects[1])) {
						ComOpenWait(false);
						return;	
					}
					formObj.f_cmd.value=MULTI;
					formObj.multi_office_list.value=ar_ofc_cd2.GetSelectText();
										
					var sParam = sheetObjects[1].GetSaveString(1) + "&" +FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");  
					var sXml=sheetObjects[0].GetSaveData("FNS_INV_0008GS.do", sParam);
					sheetObjects[0].RemoveAll();
					
					//2015.06.24 VVD Ex Rate Date 가 존재하는데 VVD 환율은 존재하지 않은경우, Daily Rate 저장시 메시지 display by IY Cho
					var third_vvd=ComGetEtcData(sXml,"third_vvd");
					if(third_vvd !="" && third_vvd != null){
						ComShowCodeMessage("INV00161",third_vvd);
					}
					
					if (!INVDecideErrXml(sheetObjects[1], sXml)) {
						doActionIBSheet(sheetObjects[0],document.form,SEARCH01);  // Progress Bar 없는 ibsearch + sucess msg   SEARCH01
					} else {
						doActionIBSheet(sheetObjects[0],document.form,IBSEARCH); 
					}		
					ComOpenWait(false);
				    
				} , time);
				
				
				
			break;
			case IBINSERT:      // input
				var sheetIdx=sheetObj.DataInsert(-1);

				sheetObj.SetCellText(sheetIdx,prefix+"locl_curr_cd" ,inv_curr_cd.GetSelectText());
				
				var selOffice = ar_ofc_cd2.GetSelectCode();
				var arrStr = selOffice.split(",");	
				if(arrStr.length == 1 ) { 
					var oneOfficeArr = selOffice.split("^");
					sheetObj.SetCellText(sheetIdx,prefix+"ar_ofc_cd" ,oneOfficeArr[1]);
				}
				var loc_cd=formObj.loc_cd.value;
					sheetObj.SetColProperty(prefix+"io_bnd_cd", {ComboText:"ALL|O/B|I/B", ComboCode:"|O|I"} );

			break;

		}
	}
	/** 
	 * Validating input value. <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @param  {object} formObj : Form object.
	 * @param  {sAction} sAction : f_cmd.
	 * @return true, false
	 * @see #
	 * @author Choi Do Soon
	 * @version 2009.11.16
	 */
	function validateForm(sheetObj,formObj,sAction){
		var sheetID=sheetObj.id;
		var prefix=sheetID + "_";
		
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			
			if (sheetObj.GetRowStatus(i) == "I") {
				var arOfcCd=sheetObj.GetCellText(i,prefix+"ar_ofc_cd"); 
				var fmDt=sheetObj.GetCellText(i,prefix+"fm_dt");
				var toDt=sheetObj.GetCellText(i,prefix+"to_dt");
				var fmDt1=formObj.fm_dt1.value;
				var toDt1=formObj.to_dt1.value;
				var xchRtTpCd = sheetObj.GetCellValue(i,prefix+"xch_rt_tp_cd");
				
				//if (arOfcCd == "") {
				//	ComShowCodeMessage("INV00148");
				//	return false;
				//}
				
				if (fmDt == "") {
					ComShowCodeMessage("COM130201", "Date");
					return false;
				}
				if (toDt == "") {
					ComShowCodeMessage("COM130201", "To Date");
					return false;
				}
				if ((fmDt < fmDt1) || (fmDt > toDt1) || (toDt < fmDt1) || (toDt > toDt1) || (fmDt > toDt)) {
					ComShowCodeMessage("INV00024");
					return false;
				}
				if (sheetObj.GetCellText(i,prefix+"chg_curr_cd").trim() == ""){
					ComShowCodeMessage("COM130201", "Currency");
					return false;
				}
				/*if (sheetObj.GetCellText(i,"inv_xch_rt").trim() == ""){
					ComShowCodeMessage("COM130201", "Ex. Rate");
					return false;
				} else {
					if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellText(i,"inv_xch_rt"),",")) == 0 ) {
						return false;
					}
				}*/

			} else if (sheetObj.GetRowStatus(i) == "U") {
				/*if (sheetObj.GetCellText(i,"inv_xch_rt").trim() == ""){
					ComShowCodeMessage("INV00041");
					return false;
				} else {
					if (RateCheck(sheetObj, i, ComTrimAll(sheetObj.GetCellText(i,"inv_xch_rt"),",")) == 0 ) {
						return false;
					}
				}*/
				
				if (sheetObj.GetCellText(i,prefix+"cng_rmk").trim() == ""){
					ComShowCodeMessage("INV00151"); //Please specify the reason for changing exchange rate?
					return false;
				}
			}	
		}

		return true;
	}
	/**
	 * Setting sheet from excel upload.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnLoadExcel(sheetObjects[0]);
	 * </pre>
	 * @param object sheetObj
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnLoadExcel(sheetObj, result, code, msg){
		var sheetID=sheetObj.id;
        var prefix=sheetID + "_";
        
        if(isExceedMaxRow(msg))return; 
        
		for (var i=1; i<=sheetObj.RowCount(); i++) {
			if (sheetObj.GetRowStatus(i) == "I") {
				
				sheetObj.SetCellText(i,prefix+"locl_curr_cd" ,inv_curr_cd.GetSelectText());
				
				var selOffice = ar_ofc_cd2.GetSelectCode();
				var arrStr = selOffice.split(",");	
				if(arrStr.length == 1 ) { 
					var oneOfficeArr = selOffice.split("^");
					sheetObj.SetCellText(i,prefix+"ar_ofc_cd" ,oneOfficeArr[1]);
				}
				
				
			}
		}
	}
	/**
	 * Validating input date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1);
	 * </pre>
	 * @param object sheetObj
	 * @param number row
	 * @param number col
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnPopupClick(sheetObj, row,col){
		var sheetID=sheetObj.id;
        var prefix=sheetID + "_";
        
		if (sheetObj.ColSaveName(col) == prefix+"fm_dt") {
			var cal=new ComCalendarGrid("fm_dt");
			cal.endFunction="ComCalendar_tmpEndFunction2";
			cal.select(sheetObj, row, col, 'yyyy-MM-dd');
		}
		if (sheetObj.ColSaveName(col) == prefix+"to_dt") {
			var cal2=new ComCalendarGrid("to_dt");
			cal2.select(sheetObj, row, col, 'yyyy-MM-dd');
		}
	}
	/**
	 * After completing calendar input, execute function.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    ComCalendar_tmpEndFunction2()
	 * </pre>
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function ComCalendar_tmpEndFunction2(){
		var sheetID=sheetObjects[0].id;
        var prefix=sheetID + "_";


		sheetObjects[0].SelectCell(sheetObjects[0].GetSelectRow(), prefix+"to_dt",true,sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(), prefix+"fm_dt"));
	}
	/**
	 * Creating combo.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    MakeComboObject2(formObj.ar_ofc_cd, arrStr);
	 * </pre>
	 * @param object cmbObj
	 * @param String arrStr
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function MakeComboObject2(cmbObj, arrStr) {
		cmbObj.RemoveAll();
		var idx = 0;
		if(arrStr.length > 2) { 
			var totalLength = arrStr.length - 1 ; 
			cmbObj.InsertItem(idx, "ALL", "ALL");	
			cmbObj.InsertItem(++idx, "0/"+ totalLength, "");
			
		}
		//cmbObj.SetDropHeight(190);
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var ar_ofc_value=arrStr2[1];
			var ar_ofc_cd=arrStr2[1]+"|"+arrStr2[4]+"|"+arrStr2[5];
			ar_ofc_cd2.InsertItem(i+1, ar_ofc_value, arrStr[i]);
		}
	}      
	/**
	 * When change a af_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd2_OnChange(document.form,'HAMBB','HAMBB');
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
	function ar_ofc_cd2_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode)  {

		//alert("ar_ofc_cd2_OnChange" + newIndex);
		/*if (newIndex > 1 ) { 
			var arrStr=comboObj.GetSelectCode().split("^");
			var ar_ofc_cd=arrStr[1];
			document.form.ar_ofc_cd.value=ar_ofc_cd;
			sheetObjects[0].RemoveAll();
			
			//setOfcOtherInfo(arrStr);
		}*/
	}

	
	function ar_ofc_cd2_OnCheckClick(Code, s_index) {
		 
		// checked ALL
		var chkErrCnt = 0;
		 if (s_index == 0) {	
			 
				var checked=false;
				if (ar_ofc_cd2.GetItemCheck(s_index)) {
					checked=true;
				}
				if(checked) {
					for(var i=2; i < ar_ofc_cd2.GetItemCount(); i++) {
						var chkCurr = chkOffice(officeArr[i-1], i, "N");
						if(chkCurr) {
							ar_ofc_cd2.SetItemCheck(i,chkCurr);
						}
					}
				} else {
					for(var i=2; i < ar_ofc_cd2.GetItemCount(); i++) {
						ar_ofc_cd2.SetItemCheck(i,checked);
					}
				}
		}
		 
		//checked Count Line 
		if (s_index == 1) {		
				var checked=false;
				if (ar_ofc_cd2.GetItemCheck(s_index)) {
					ar_ofc_cd2.SetItemCheck(s_index,0);
				}				
		}  
		
		if (inv_curr_cd.GetSelectText() != "" &&  s_index > 1  && ar_ofc_cd2.GetItemCheck(s_index) ) {		
			var chkCurr = chkOffice(officeArr[s_index-1], s_index, "Y");
			if(!chkCurr) {
				ar_ofc_cd2.SetItemCheck(s_index,chkCurr);
				chkErrCnt++;
			}
		}
		settingOfficeComboCount();

	} 	
	

	function settingOfficeComboCount() {
		if (officeArr.length > 2) { 
			var totalCount = ar_ofc_cd2.GetItemCount()-2;
			var checkCnt = 0;
			for(var i=2; i < ar_ofc_cd2.GetItemCount(); i++) {
				if (ar_ofc_cd2.GetItemCheck(i)) {
					checkCnt+=1;
				}
			}
			//ar_ofc_cd2.DeleteItem(1);
			//ar_ofc_cd2.InsertItem(1,checkCnt+"/"+totalCount);
			ar_ofc_cd2.SetText(1,0, checkCnt+"/"+totalCount);
		}
	}
	
	function chkOffice(officeStr, s_index, msgFlag) {
		
		arrStr2 = officeStr.split("^");
		var localCurr = inv_curr_cd.GetSelectText();
				
		var checkOneArCurr = arrStr2[4];
		var checkOneOffice = arrStr2[1];
		var checkOneXchRtTpCd = arrStr2[12];
		var checkOneAltlCurr = arrStr2[20];
				
		//Check Local Curr 
		if(localCurr != checkOneArCurr && localCurr != checkOneAltlCurr){
			if (msgFlag == "Y") ComShowCodeMessage("INV00144",checkOneOffice, checkOneArCurr);	//{?msg1}'s ar currency is {?msg2}.\nThis currency differs from local currency.\nYou can't select this office.
			return 0;
		}
		
		//Check Ex.Rate Type
		if( "V" != checkOneXchRtTpCd && "D" != checkOneXchRtTpCd ){
			if (msgFlag == "Y") ComShowCodeMessage("INV00145",checkOneOffice);	//{?msg1}'s exchange rate type is not VVD or Daily.\nYou can't select this office.
			return 0;
		}
		
		return 1;
		
	}	
	
	
	/**
	 * When change a inv_curr_cd data, execute function.<br>
	 * Setting Local Currency.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   inv_curr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
	 * @param {IBMultiCombo} comboObj
	 * @param {String} oldIndex
	 * @param {String} oldText
	 * @param {String} oldCode
	 * @param {String} newIndex
	 * @param {String} newText
	 * @param {String} newCode
	 * @author KIM OK RYE
	 * @version 2014.12.18
	 */	
	function inv_curr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode)  {
		sheetObjects[0].RemoveAll();
		//doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 	
		var formObject=document.form;
		formObject.locl_curr_cd_1.value=inv_curr_cd.GetSelectText();
		formObject.locl_curr_cd.value=inv_curr_cd.GetSelectText();
		clearArOfcCd();
	}
	
	
	function clearArOfcCd() {
		for(var i=0; i < ar_ofc_cd2.GetItemCount(); i++) {
			ar_ofc_cd2.SetItemCheck(i,false);
		}
		
		var nIdx = ar_ofc_cd2.FindItem(arOfficeLogin, 0, true);
		if( nIdx != -1 ) ar_ofc_cd2.SetItemCheck(nIdx,true);
		
		settingOfficeComboCount();
	}	
	/**
	 * Add data in combo field.
	 */		
	function addCellComboItem(sheetObj,comboValues,colName,isCellCombo) {
		var sRow=sheetObj.GetSelectRow();
		var comboTxt="";
		var comboVal="";
		var comboItems;
		var comboItem;
		comboValues="|"+" "+comboValues;
		if (comboValues != undefined) {
			comboItems=comboValues.split(ROWMARK);
			for (var i=1 ; i < comboItems.length ; i++) {
				comboItem=comboItems[i].split(FIELDMARK);
				//if ((comboItem[0] != "")&&(comboItem[0] != form.locl_curr_cd.value)) {  
					comboTxt += comboItem[0];
					comboVal += comboItem[0];
				//}
				//if (i < comboItems.length-1&&(comboItem[0] != "")&&(comboItem[0] != form.locl_curr_cd.value)) {
					comboTxt += ROWMARK;
					comboVal += ROWMARK;
				//}				
			}
		}
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
	}
	function sheet1_OnKeyUp(sheetObj, Row, Col, KeyCode) {
		if (sheetObj.ColSaveName(Col) == "fm_dt"){
			fmDtVal=sheetObj.GetCellValue(Row, Col).replace('-','');
		}  
	}
	/**
	 * Validating input date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1,'20090901');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @param string Value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnChange(sheetObj, Row, Col, Value) {
		
		/*var sheetID=sheetObj.id;
        var prefix=sheetID + "_";
        
		if (sheetObj.ColSaveName(Col) == prefix+"fm_dt"){
			sheetObj.SetCellText(Row, prefix + "to_dt", Value);
		}*/
	}
	
	
	/** 
	 * Validating Rate <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  {IBSheet} sheetObj : Sheet object.  
	 * @return true, false
	 * @see #
	 * @author KIM OK RYE
	 * @version 2015.01.22
	 */
	function validateRate(sheetObj){
		
		var sheetID=sheetObj.id;
        var prefix=sheetID + "_";
        
        if(sheetObj.RowCount() < 1) {
        	ComShowCodeMessage("INV00091");
        	return false;
        }
        
		var dup_chk = sheetObj.FindText(prefix+"dup_chk", "DUP",0,0,0);
		if(dup_chk != -1) {
			var bound = sheetObj.GetCellText(dup_chk,prefix+"io_bnd_cd");
			var office = sheetObj.GetCellText(dup_chk,prefix+"ar_ofc_cd");
			var chgCurr = sheetObj.GetCellText(dup_chk,prefix+"chg_curr_cd");
			var msg = "Office : " + office + ", Bound : " + bound + ", Charge Curr : " + chgCurr +"\n";
			ComShowCodeMessage("INV00153", msg );
			return false;			
		}

		for (var i=1; i<=sheetObj.RowCount(); i++) {
			
			if (sheetObj.GetCellText(i,prefix+"tmp_ib_flag") == "I" || sheetObj.GetCellText(i,prefix+"tmp_ib_flag") == "U" ) {
				
				var bound = sheetObj.GetCellText(i,prefix+"io_bnd_cd");
				var office = sheetObj.GetCellText(i,prefix+"ar_ofc_cd");
				var chgCurr = sheetObj.GetCellText(i,prefix+"chg_curr_cd");
				var inputXchRt = sheetObj.GetCellText(i,prefix+"inv_xch_rt");
				var latestRate = sheetObj.GetCellText(i,prefix+"latest_rate");
				var divRate = sheetObj.GetCellText(i,prefix+"div_rate");
				
				if (  chkIORate(inputXchRt, latestRate, bound, office, chgCurr, divRate ) == 0 ) {
					return false;
				}
			} else if (sheetObj.GetCellText(i,prefix+"tmp_ib_flag") == "D" ) {
				var vvd_cnt = sheetObj.GetCellText(i,prefix+"vvd_cnt");
				if (vvd_cnt != "0" ) {
					var bound = sheetObj.GetCellText(i,prefix+"io_bnd_cd");
					var office = sheetObj.GetCellText(i,prefix+"ar_ofc_cd");
					var chgCurr = sheetObj.GetCellText(i,prefix+"chg_curr_cd");
					var msg = "Office : " + office + ", Bound : " + bound + ", Charge Curr : " + chgCurr +"\n";
					ComShowCodeMessage("INV00156", msg );
					doActionIBSheet(sheetObjects[0],document.form,IBSEARCH); 
					return false;			
				}
			}
				
		}

		return true;
	}
	
	/**
	 * Comparing input item and Accounting Rates.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   RateCheck(shhetObjects[0], 1, '0.1111');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param string Value
	 * @version 2009.10.08
	 */	
	function RateCheck(sheetObj, Row, Value) {
		
		var param = "f_cmd=" + COMMAND02 + "&from_curr_cd=" + inv_curr_cd.GetSelectText() + "&to_curr_cd=" + sheetObj.GetCellValue(Row,"chg_curr_cd") + "&ar_ofc_cd=" + sheetObj.GetCellValue(Row,"ar_ofc_cd");
		
		var sXml=sheetObj.GetSearchData("INVCommonGS.do", param );
		
		var oXchRt=ComGetEtcData(sXml,"O_INV_XCH_RT");
		var iXchRt=ComGetEtcData(sXml,"I_INV_XCH_RT");
		
		var bound = sheetObj.GetCellText(Row,"io_bnd_cd");
		var seq = sheetObj.GetCellText(Row,"Seq");
		var office = sheetObj.GetCellText(Row,"ar_ofc_cd");
		var chgCurr = sheetObj.GetCellText(Row,"chg_curr_cd");
		
		
		var chk = 1;
		
		if (bound == "") {
			chk =  chkIORate(Value, oXchRt, "O/B", office, chgCurr,Row);
			if ("1" == chk) { 
				chk = chkIORate(Value, iXchRt, "I/B", office, chgCurr,Row);
			} 
		} else if ( bound == "O") {
			chk = chkIORate(Value, oXchRt, "O/B", office, chgCurr,Row);
		} else if ( bound == "I" ) {
			chk = chkIORate(Value, iXchRt, "I/B", office, chgCurr,Row);
		}
		
		return chk;

	}
	
	/**
	 * Validation of Rate<br>
	 * @param targetVal : inputted rate
	 * @param baseVal : latest rate
	 * @param bound : Bound 
	 * @param Seq : Seq 
	 * @return 0 : 불가, 1 : OK  
	 * @author KIM OK RYE
	 * @version 2014.12.18
	 * @comment 입력된 환율과 가장 최근 날짜의 환율을 비교하여 30% 이상 차이 불가, 5%~30% 범위내 경고후 yes/no 선택후 진행여부 결정
	 *          최초 데이타 입력시 무조건 OK 
	 */		
	function chkIORate(targetVal, baseVal, bound, office, chgCurr, varRate) {
		
		
		if (baseVal == "NO_DATA" || baseVal == "0") {
			return 1;
		}
		
		var preMsg = "[Office : "+office+", Bound : "+bound+", Charge Curr : " + chgCurr +"]\n";			
		
		//var varRate = targetVal/baseVal;
		
		if((varRate > 1.3) || ((varRate < 0.7))) {   // +- 30% 초과
			var plus30Rate = InvRound ( baseVal * 1.3 , 6 ) ;
			var minus30Rate = InvRound ( baseVal * 0.7, 6 );
			ComShowCodeMessage("INV00142",preMsg, minus30Rate + "~" + plus30Rate  );  //{?msg1}Rate exceed 30% tolerance of latest rate: {?msg2}\nYou do not have the securityto overwrite the exchange rate.
			return 0;
		} else	if( ((varRate >= 1.05) && (varRate <= 1.3)) ||  ((varRate >= 0.7) && (varRate <= 0.95))    ) {  // +-  5%이상, 30% 이하
			var minus5Rate = InvRound ( baseVal * 0.95, 6 ) ;
			var plus5Rate = InvRound ( baseVal * 1.05, 6 ) ;
			
			if (ComShowCodeConfirm("INV00143", preMsg , minus5Rate + "~" +plus5Rate)) {   //{?msg1}Rate exceed 5% tolerance level of latest rate {?msg2}\nDo you want to proceed anyway?
				return 1;
			} else {
				return 0;
			}
			
		} else {
			return 1;
		}
		
	}
	
	
	/**
	 * fm_dt Setting masked value, After validating date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   fn_ComGetMaskedValue('20090101');
	 * </pre>
	 * @param String value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function fn_ComGetMaskedValue(elNm) {
		var formObj;
		if (elNm == "fm_dt1") {
			formObj=form.fm_dt1;
		} else {
			formObj=form.to_dt1;
		}
		var value=formObj.value;
		if (value=="") return;
		value=ComReplaceStr(value,"-","");
		if (value.length < 8) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(4,6) > 12) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(4,6) == 00) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(6,8) > 31) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(6,8) == 00) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		var ret=ComGetMaskedValue(value, "ymd")  ; 
		formObj.value=ret;
		if(elNm == "fm_dt1"){
			if(form.to_dt1.value==""){
				form.to_dt1.value=ret;
			}
			form.to_dt1.select(); 
		}
	}
	/**
	 * Moving focus.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    checkCustLeng('20090901');
	 * </pre>
	 * @param string value
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
	function checkFmDtLeng(value){    	  
		if(ComTrimAll(value," ", "-", ":").length==8){
			if(form.to_dt1.value==""){
				form.to_dt1.value=ComTrimAll(value," ", "-", ":");
			}
			form.to_dt1.select(); 
		}
	}
	/**
	 * Sheet Col Copy<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet1_OnSearchEnd(sheetObjects[0],'');
	 * </pre>
	 * @param object sheetObj
	 * @param string ErrMsg
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnSearchEnd(sheetObj,ErrMsg){      		
		//sheetObj.Copy2SheetCol(sheetObj,"inv_xch_rt","pre_inv_xch_rt") 
		ComOpenWait(false);
	}
	
	/**
	 * Sheet Col Copy<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet1_OnSearchEnd(sheetObjects[0],'');
	 * </pre>
	 * @param object sheetObj
	 * @param string ErrMsg
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet2_OnSaveEnd(code, msg) {
		//doActionIBSheet(sheetObjects[0],document.form,IBSEARCH); 
	}	
	
	/**
	 * setOfcOtherInfo<br>
	 * <br><b>Example :</b>
	 * <pre>
	 *     setOfcOtherInfo(arrStr2)
	 * </pre>
	 * @param {arrStr2} 
	 * @author CLT
	 * @version 2014.11.29
	 */
	function setOfcOtherInfo(arrStr2) {
		var formObject=document.form;
		
		formObject.locl_curr_cd_1.value=arrStr2[4];
		formObject.locl_curr_cd.value=arrStr2[4];
		formObject.ar_ctrl_ofc_cd.value=arrStr2[5];
		formObject.loc_cd.value=arrStr2[6].substring(0,2);
		formObject.xch_rt_tp_cd.value=arrStr2[12];
		formObject.xch_rt_n3rd_tp_cd.value=arrStr2[19];	
		formObject.altn_curr_div_cd.value=arrStr2[20]; 
	
	}	
	
	function getSelectAROfc() {
		var strArList = "";
		
		for(var i=0; i < ar_ofc_cd2.GetItemCount(); i++) {
			if (ar_ofc_cd2.GetItemCheck(i) && ar_ofc_cd2.GetText(i,0) != "ALL") {				
				strArList += ar_ofc_cd2.GetText(i,0) + ",";				
			}
		}
		if(strArList != "") strArList = strArList.substring(0,strArList.length-1);
		return strArList;
	}
