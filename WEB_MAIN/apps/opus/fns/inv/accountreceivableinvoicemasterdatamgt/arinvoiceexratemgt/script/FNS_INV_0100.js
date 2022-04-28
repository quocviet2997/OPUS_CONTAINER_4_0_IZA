/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0100.js
*@FileTitle  : VVD Ex.Rate Creation by S/A Date
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/10
=========================================================*/
	/**
	 * @extends 
	 * @class fns_inv_0100 : fns_inv_0100 Defining business script.
	 */

	// Common variables.
	var sheetObjects=new Array();
	var comboObjects=new Array();
	var sheetCnt=0;
	var ROWMARK="|";
	var FIELDMARK="=";
	var retrieveFlg=0;  
	var comboCnt=0;
	// Defining button events. */
	document.onclick=processButtonClick;
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
		var sheetObject2=sheetObjects[1];
		var sheetObject3=sheetObjects[2];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			 if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) {
				case "btn2_Row_Add":
					if (retrieveFlg == 1) {
						var idx=sheetObject1.DataInsert(-1);
						if(formObject.svr_id.value!="EUR"){		 					
							sheetObject1.SetCellValue(idx,"io_bnd_cd",form.bnd_cd.value);
							if(form.bnd_cd.value=='O'){
								sheetObject1.SetCellValue(idx,"etda_cd","ETD");
							}else if(form.bnd_cd.value=='I'){
								sheetObject1.SetCellValue(idx,"etda_cd","ETA");
							}
						}else{
							sheetObject1.SetCellValue(idx,"io_bnd_cd","");
							sheetObject1.SetCellValue(idx,"svc_scp_cd","");
							sheetObject1.SetCellValue(idx,"vps_port_cd","");
						}
					}
					break; 
				case "btn2_Row_Copy":
					if (retrieveFlg == 1) {
						var idx=sheetObject1.DataCopy();
						if(formObject.svr_id.value!="EUR"){		 
							sheetObject1.SetCellValue(idx,"io_bnd_cd",form.bnd_cd.value);
						}
					}
					break;
				case "btn2_Delete":
					if (retrieveFlg == 1) {	
						var sRow=sheetObject1.FindCheckedRow("DelChk");
						if (sRow == "") {
							ComShowCodeMessage("COM12189");
							return 0;
						}
						var arrRow=sRow.split("|");
						for (var idx=arrRow.length-1; idx>=0; idx--){
							var row=arrRow[idx];
							sheetObject1.RowDelete(row,false);
						}
					}
					break;
				case "btn3_Row_Add":
					if (retrieveFlg == 1) {
						var idx=sheetObject2.DataInsert(-1);
						sheetObjects[1].SetCellValue(idx,"xch_rt_rvs_flg",form.xch_rt_rvs_flg.value,0);
						sheetObjects[1].SetCellValue(idx,"locl_curr_cd",form.locl_curr_cd.value,0);
						sheetObjects[1].SetCellValue(idx,"ar_ofc_cd",ar_ofc_cd.GetSelectText(),0);
						sheetObjects[1].SetCellValue(idx,"xch_rt_tp_cd","V",0);
					}
					break; 
				case "btn3_Row_Copy":
					if (retrieveFlg == 1) {
						var idx=sheetObject2.DataCopy();
						sheetObjects[1].SetCellValue(idx,"xch_rt_tp_cd","V",0);
					}
					break;
				case "btn3_Delete":
					if (retrieveFlg == 1) {
						var sRow=sheetObject2.FindCheckedRow("DelChk");
						if (sRow == "") {
							ComShowCodeMessage("COM12189");
							return 0;
						}
						var arrRow=sRow.split("|");
						for (var idx=arrRow.length-1; idx>=0; idx--){
							var row=arrRow[idx];
							sheetObject2.RowDelete(row,false);
						}
					}
					break;
				case "btn1_Retrieve":
					retrieveFlg=1;
					doActionIBSheet(sheetObject1,document.form,IBSEARCH);
					break; 
				case "btn1_New":
					retrieveFlg == 0;
					doActionIBSheet(sheetObject1,document.form,IBCLEAR);
					break;
				case "btn1_Save":
					if (retrieveFlg == 1) {	
						doActionIBSheet(sheetObject1,document.form,IBSAVE);
					}
					break;
				case "btns_calendar": // Calendar button.
					var cal=new ComCalendar();
					cal.select(formObject.etd_dt_fm, 'yyyy-MM-dd');
					break;
				case "btns_calendar2": // Calendar button.
					var cal=new ComCalendar();
					cal.select(formObject.etd_dt_to, 'yyyy-MM-dd');
					break;	
				case "btn_downexcel":
					if(sheetObject3.RowCount() < 1){//no data
						ComShowCodeMessage("COM132501");
					}else{
						ComOpenWait(true);
						sheetObject3.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject3), SheetDesign:1,Merge:1 });
						ComOpenWait(false);
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
		initControl();
		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01); 	
		ComBtnDisable("btn_downexcel");
		ComBtnDisable("btn_print");
		resizeSheet();
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
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){		       
				      var HeadTitle1="|Sel.|VVD|Seq.|Scope|Port|Bound|ETA/D|ETA/D|USD to LCL|VSL SKD|Ex.Rate";
				      var headCount=ComCountHeadTitle(HeadTitle1);
				      (headCount, 0, 0, true);
				      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
				      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				      InitHeaders(headers, info);
				      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
				             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"DelChk",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:35,   Align:"Center",  ColMerge:1,   SaveName:"clpt_seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Combo",     Hidden:0, Width:65,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"vps_port_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:30,   Align:"Center",  ColMerge:1,   SaveName:"etda_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"etda_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Popup",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"vsl_pop",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Popup",     Hidden:0, Width:60,   Align:"Center",  ColMerge:1,   SaveName:"exRate_pop",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
				       
				      InitColumns(cols);
				      SetEditable(1);
				      //SetSheetHeight(410);
				      SetWaitImageVisible(0);
				      SetColProperty("svc_scp_cd", {ComboText:"AEW|TPW", ComboCode:"AEW|TPW"} );
				      SetColProperty("vps_port_cd", {ComboText:"DEHAM|NLRTM|GBFXT|USOAK", ComboCode:"DEHAM|NLRTM|GBFXT|USOAK"} );
				      SetColProperty("io_bnd_cd", {ComboText:"I|O", ComboCode:"I|O"} );
				      InitComboNoMatchText(true);
				      SetShowButtonImage(1);
				      resizeSheet();
		      }
			    break;
			case 2:      //sheet1 init
			    with(sheetObj){		        
				      var HeadTitle1="|Sel.|Cur.|Ex. Rate|Inverse|Inverse Rate||||||";
				      var headCount=ComCountHeadTitle(HeadTitle1);
				      (headCount, 0, 0, true);
				      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
				      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				      InitHeaders(headers, info);
				      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
				             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
				             {Type:"ComboEdit", Hidden:0, Width:70,   Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cds",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
				             {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rts",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_rvs_flg",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"ivs_xch_rts",     KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd" },
				             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"ivs_xch_rt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"locl_curr_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:1, Width:80,   Align:"Right",   ColMerge:1,   SaveName:"ar_ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"xch_rt_tp_cd" } ];
				       
				      InitColumns(cols);
				      SetEditable(1);
				      //SetSheetHeight(410);
				      SetWaitImageVisible(0);
				      SetColProperty("chg_curr_cds", {ComboText:"|USD|GBP|DKK|CHF", ComboCode:"|USD|GBP|DKK|CHF"} );
				      resizeSheet();
			}
			    break;	
			case 3:      //sheet1 init
			    with(sheetObj){		       
				      var HeadTitle1="|VVD|VVD|VVD|Port|Scope|Bound|Cur.|Locl Cur.|Ex.Rate|Ex.Rate Type";
				      var headCount=ComCountHeadTitle(HeadTitle1);
				      (headCount, 0, 0, true);
				      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
				      var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				      InitHeaders(headers, info);
				      var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd",        KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"skd_voy_no",    KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"skd_dir_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"port_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"io_bnd_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"chg_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"locl_curr_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Right",   ColMerge:1,   SaveName:"inv_xch_rt",    KeyField:0,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"xch_rt_tp_cd",  KeyField:0,   CalcLogic:"",   Format:"" } ];
				       
				      InitColumns(cols);
				      SetEditable(1);
				      SetVisible(false);
				      SetWaitImageVisible(0);
				      resizeSheet();
		    }
			break;	
		}
	}
	/** 
	 * Coding retrieve, save... <br>
	 * <br><b>Example :</b>
	 * <pre>2
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
		switch(sAction) {
			case IBSEARCH_ASYNC01: // Retrieve AR_OFFICE_LIST.
			ComOpenWait(true);
			var ret=ComGetNowInfo("ymd" )      
			formObj.etd_dt_fm.value=ret;
			formObj.etd_dt_to.value=ret;
			formObj.f_cmd.value=SEARCH01;
			var sXml=sheetObj.GetSearchData("FNS_INV_0100GS.do", FormQueryString(formObj),{Sync:1});
			//===========office list =======================//
			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
			
			var arrStr=sStr.split("|");
			MakeComboObject2(ar_ofc_cd, arrStr);
			var arrStr2="";
			var ar_ofc = "";
			for(i=1;i<arrStr.length;i++){
				arrStr2=arrStr[i].split("^");
				if(arrStr2[1] == arrStr2[3]){
					ar_ofc = arrStr2[1];
				  //ar_ofc_cd.text=ar_ofc_cd;
				  //	ar_ofc_cd.SetItemCheck(ar_ofc, true);
					ar_ofc_cd.SetItemCheck(i-1, true);
					
					formObj.ofc_cd.value=ar_ofc;
					formObj.svr_id.value=arrStr2[7];
					formObj.locl_curr_cd.value=arrStr2[4];
					formObj.xch_rt_rvs_flg.value=arrStr2[8];
					formObj.org_ofc_cd.value=ar_ofc;
					formObj.org_curr_cd.value=arrStr2[4];
				}
			}
			
			//====== currInfo combo list ====================//
			var comboValues=ComGetEtcData(sXml, "currInfo");	
			addCellComboItem(sheetObjects[1],comboValues,"chg_curr_cds",false);						
			//====== currInfo combo list ====================//
			if(formObj.svr_id.value=="EUR"){
				svc_scp_cd.SetEnable(0);
				vps_port_cd.SetEnable(0);
				$('#bnd_ctnt1').hide();
				$('#bnd_ctnt2').hide();
				$('#tri_ctnt1').show();
				$('#tri_ctnt2').show();
                var cols = [ {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                             {Type:"Combo",     Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                             {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"vps_port_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                             {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ]; 
                sheetObjects[0].InitColumns(cols);
			}else{	
				$('#tri_ctnt1').hide();
				$('#tri_ctnt2').hide();
				$('#bnd_ctnt1').show();
				$('#bnd_ctnt2').show();
			}	
			ComOpenWait(false);
			break;    
			case IBSEARCH:      //retrieve
			ComOpenWait(true);
			sheetObjects[1].RemoveAll();
			form.etd_dt2_fm.value=ComReplaceStr(form.etd_dt_fm.value,"-","");
			form.etd_dt2_to.value=ComReplaceStr(form.etd_dt_to.value,"-","");
			
			if(form.svr_id.value=='EUR'){
				if(formObj.tri_yn.value=="Y"){
					formObj.f_cmd.value=SEARCH03;
				}else{
					formObj.f_cmd.value=SEARCH04;
				}
			}else{
				if(formObj.bnd_cd.value=="T"){
					formObj.f_cmd.value=SEARCH03;
				}else{
					formObj.f_cmd.value=SEARCH02;
				}
			}
			sheetObj.DoSearch("FNS_INV_0100GS.do",FormQueryString(formObj),{Sync:2} );
			ComOpenWait(false);
			break;
			case IBSAVE:        //save
				if(validateForm(sheetObj,formObj,sAction)) return;
				var iCheckRow=sheetObjects[0].FindCheckedRow("DelChk");
				var iCheckRow2=sheetObjects[1].FindCheckedRow("DelChk");
				if (iCheckRow== "") {
					ComShowCodeMessage("INV00025");
					return false;
				}
				if (iCheckRow2== "") {
					ComShowCodeMessage("INV00025");
					return false;
				}
				ComOpenWait(true);
				formObj.f_cmd.value=MULTI;
				var sXml=sheetObj.GetSaveData("FNS_INV_0100GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sheetObjects[0].GetSaveString(false,true,"DelChk"),"sheet1_") + "&" + ComSetPrifix(sheetObjects[1].GetSaveString(false,true,"DelChk"),"sheet2_"));
				sheetObjects[2].LoadSaveData(sXml);
				ComBtnEnable("btn_downexcel");
				ComBtnEnable("btn_print");
				ComOpenWait(false);
			break;
			case IBINSERT:      // input
			break;
			case IBCLEAR: //NEW
				var ret=ComGetNowInfo("ymd" )      
				formObj.etd_dt_fm.value=ret;
				formObj.etd_dt_to.value=ret;
				sheetObjects[0].RemoveAll();
				sheetObjects[1].RemoveAll();
				//ar_ofc_cd.SetSelectText(form.org_ofc_cd.value);
				form.locl_curr_cd.value=form.org_curr_cd.value;
				if(form.svr_id.value!='EUR'){
					form.bnd_cd.value="O";
				}else{
					form.tri_yn.value="N";
				}
				//svc_scp_cd.text="ALL";
				svc_scp_cd.SetItemCheck("ALL", true);
				//vps_port_cd.text="ALL";
				vps_port_cd.SetItemCheck("ALL", true);
				
				ComBtnDisable("btn_downexcel");
				ComBtnDisable("btn_print");
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
		with(formObj){
			switch(sAction) {
				case IBSEARCH:        //retrieve
				break;
				case IBSAVE:        //save
				if (sheetObjects[0].RowCount()< 0) {
					ComShowCodeMessage("INV00001");
					return true;
				} else {
					for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
						if(sheetObjects[0].GetCellValue(i,"DelChk")=="1"){
							if (sheetObjects[0].GetCellText(i,"vvd_cd").trim() == ""){
								ComShowCodeMessage("INV00007",i+" Line");
								return true;
							}
							if (sheetObjects[0].GetCellText(i,"inv_xch_rt").trim() != ""&&sheetObjects[0].GetCellText(i,"inv_xch_rt").trim() != "0"){
								if (!ComShowCodeConfirm("INV00126")){
									return true;
								}else{
									return false;
								}
							}
							if(form.svr_id.value!='EUR'){
								if (sheetObjects[0].GetCellText(i,"svc_scp_cd").trim() == ""){
									ComShowCodeMessage("INV00006",i+" Line");
									return true;
								}else{
									sheetObjects[0].SetCellValue(i,"svc_scp_cd",sheetObjects[0].GetCellText(i,"svc_scp_cd").trim());
								}
								if (sheetObjects[0].GetCellText(i,"vps_port_cd").trim() == ""){
									ComShowCodeMessage("INV00007",i+" Line");
									return true;
								}else{
									sheetObjects[0].SetCellValue(i,"vps_port_cd",sheetObjects[0].GetCellText(i,"vps_port_cd").trim());
								}
								if (sheetObjects[0].GetCellText(i,"io_bnd_cd").trim() == ""){
									ComShowCodeMessage("INV00004",i+" Line");
									return true;
								}
							}
						}
					}
				}	
				if (sheetObjects[1].RowCount()< 0) {
					ComShowCodeMessage("INV00001");
					return true;
				} else {
					for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
						if(sheetObjects[1].GetCellValue(i,"DelChk")=="1"){
							if (sheetObjects[1].GetCellText(i,"chg_curr_cds").trim() == ""){
								ComShowCodeMessage("INV00004",i+" Line");
								return true;
							}
							if (sheetObjects[1].GetCellText(i,"inv_xch_rts").trim() == ""){
								ComShowCodeMessage("INV00004",i+" Line");
								return true;
							}
						}
					}
				}
				break;
			}
		}
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
		
		ar_ofc_cd.SetDropHeight(190);
		for (var i=1; i < arrStr.length;i++ ) {
			var arrStr2=arrStr[i].split("^");
			var arOfcValue=arrStr2[1];
			ar_ofc_cd.InsertItem(i-1, arOfcValue, arrStr[i]);
		}
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
		var arrStr2;
		comboValues="|"+" "+comboValues;
		if (colName == 'chg_curr_cds') {
			if (comboValues != undefined) {
				comboItems=comboValues.split(ROWMARK);
				for (var i=1 ; i < comboItems.length ; i++) {
					arrStr2=comboItems[i].split("^");
					comboItem=comboItems[i].split(FIELDMARK);
					if ((comboItem[0] != "")&&(comboItem[0] != form.locl_curr_cd.value)) {
						comboTxt += arrStr2[0];
						comboVal += arrStr2[0]+"^"+ arrStr2[1];
					}
					if (i < comboItems.length-1) {
						comboTxt += ROWMARK;
						comboVal += ROWMARK;
					}				
				}
			}
		} else {
			if (comboValues != undefined) {
				comboItems=comboValues.split(ROWMARK);
				for (var i=2 ; i < comboItems.length ; i++) {
					comboItem=comboItems[i].split(FIELDMARK);
					if ((comboItem[0] != "")&&(comboItem[0] != form.locl_curr_cd.value)) {
						comboTxt += comboItem[0];
						comboVal += comboItem[0];
					}
					if (i < comboItems.length-1) {
						comboTxt += ROWMARK;
						comboVal += ROWMARK;
					}
				}
			}
		}	
		if (isCellCombo) {
			sheetObj.CellComboItem(sRow,colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
		else {
			sheetObj.SetColProperty(colName, {ComboText:comboTxt, ComboCode:comboVal} );
		}
	}
	/**
	 * When input a Vps Port CD, setting values.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     vps_port_cd_OnBlur(form.ar_ofc_cd);
	 * </pre>
	 * @param object cmbObj
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function vps_port_cd_OnBlur(comboObj){
		if(comboObj.GetSelectText()!=''){
			upperText=comboObj.GetSelectText().toUpperCase();
			var itemindex=comboObj.FindItem( upperText, 0);
			if(itemindex==-1){
				comboObj.SetSelectText("ALL",false);
			}else{
				comboObj.SetSelectText(upperText,false);
			}
		}
	}
	/**
	 * When change a currency, description<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *     sheet2_OnChange(sheetObjects[0],1,1,'USD');
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number col
	 * @param string sValue
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet2_OnChange(sheetObj,Row,col,sValue){
		if(sheetObj.ColSaveName(col) == "chg_curr_cds")
		{
			var chgCurr=sheetObj.GetCellValue(Row,"chg_curr_cds").split("^");
			var chgCurrCd=chgCurr[0];
			var chgCurNm=chgCurr[1];
			if(chgCurr!="" && chgCurNm==undefined){
				ComShowCodeMessage("INV00041","Currency");
				sheetObj.SetCellValue(Row,"chg_curr_cds","");
				sheetObj.SelectCell(Row,"chg_curr_cds");
				return;
			}
			sheetObj.SetCellText(Row,"chg_curr_cd" ,chgCurrCd);
			sheetObj.SetCellText(Row,"curr_nm" ,chgCurNm);
		}
		if (sheetObj.ColSaveName(col) == "inv_xch_rts") {
			if(sheetObj.GetCellValue(Row,"inv_xch_rts")==""){
				sheetObj.SetCellValue(Row,"inv_xch_rts","");
				sheetObj.SetCellValue(Row,"inv_xch_rt","");
				sheetObj.SetCellValue(Row,"ivs_xch_rts","");
				sheetObj.SetCellValue(Row,"ivs_xch_rt","");
			}
			document.form.f_cmd.value=SEARCH04;
			var effDt=ComGetNowInfo("ym" )  ;
			document.form.eff_dt.value=ComReplaceStr(effDt,"-",""); 
			document.form.curr_cd.value=sheetObj.GetCellValue(Row,"chg_curr_cd");
			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(document.form));
			var usd_locl_xch_rt=ComGetEtcData(sXml,"usd_locl_xch_rt");
			var sValue="";
			var ivs_rate="";
			var valRate="";
			if(usd_locl_xch_rt ==""){
				ComShowCodeMessage("INV00001");
				sheetObj.SetCellValue(Row,"inv_xch_rts",sheetObj.GetCellValue(Row,"inv_xch_rt"));
				sheetObj.SetCellValue(Row,"ivs_xch_rts",sheetObj.GetCellValue(Row,"ivs_xch_rt"));
				sheetObj.SelectCell(Row,"inv_xch_rts");
				return;
			}else {
				sValue=sheetObj.GetCellValue(Row,"inv_xch_rts");
				valRate=sValue/usd_locl_xch_rt;
				ivs_rate=1/sValue;
				ivs_rate=InvRound(ivs_rate, 4);
				if((valRate > 1.5) ||((valRate < 0.5))) {
					ComShowCodeMessage("INV00016");
					sheetObj.SetCellValue(Row,"inv_xch_rts",sheetObj.GetCellValue(Row,"inv_xch_rt"));
					sheetObj.SetCellValue(Row,"ivs_xch_rts",sheetObj.GetCellValue(Row,"ivs_xch_rt"));
					sheetObj.SelectCell(Row,"inv_xch_rts");
					return;
				}
				//}	 					
			}
			sheetObj.SetCellValue(Row,"ivs_xch_rts",ivs_rate);
			sheetObj.SetCellValue(Row,"inv_xch_rt",sValue);
			sheetObj.SetCellValue(Row,"ivs_xch_rt",ivs_rate);
			//}
		}
	}	
	/**
	 * When change a af_ofc_cd data, execute function.<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
	 * </pre>
	 * @param {IBMultiCombo} comboObj
	 * @param {String} oldIndex
	 * @param {String} oldText
	 * @param {String} oldCode
	 * @param {String} newIndex
	 * @param {String} newText
	 * @param {String} newCode
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */		 
	function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode)  {
		var arrStr=comboObj.GetSelectCode().split("^");
		document.form.ar_ofc_cd2.value=arrStr[1];
		document.form.ofc_cd.value=arrStr[1];
		document.form.locl_curr_cd.value=arrStr[4];
		document.form.svr_id.value=arrStr[7];
		form.xch_rt_rvs_flg.value=arrStr[8];
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		//if(document.form.svr_id.value!="EUR"){
			vps_port_cd.RemoveAll();
			document.form.f_cmd.value=SEARCH01;
			var sXml=sheetObjects[0].GetSearchData("FNS_INV_0100GS.do", FormQueryString(document.form));
			var portStr=ComGetEtcData(sXml,"portList");
	
			var arrPortStr=portStr.split("|");
			MakeComboObject(vps_port_cd, arrPortStr);
			//vps_port_cd.text="ALL";   
			vps_port_cd.SetItemCheck("ALL", true);
			//====== port combo list ====================//
			addCellComboItem(sheetObjects[0],portStr,"vps_port_cd",false);	
			svc_scp_cd.RemoveAll();
			//================== scope list ===============//
			if(document.form.svr_id.value =='KOR'){
				var scpStr="ALL|OTH"
			}else{
				var scpStr=ComGetEtcData(sXml,"svc_scp_cd");
			}
			var arrScpStr=scpStr.split("|");
			MakeComboObject(svc_scp_cd, arrScpStr);
			//svc_scp_cd.text="ALL";
			svc_scp_cd.SetItemCheck("ALL", true);
			//================== scope list ===============//
			//====== scope combo list ====================//
			addCellComboItem(sheetObjects[0],scpStr,"svc_scp_cd",false);						
			//====== scope combo list ====================//
		//}
	}
	/**
	 * When selection option, setting form's disable<br>
	 * Setting office.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   fn_option('V');
	 * </pre>
	 * @param string value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	 /*
   	function fn_option(value){
		if (value=="V") {
			form.vvd_cd.disabled=false ;
			form.etd_dt.disabled=true;
			form.vvd_cd.className="input";				
			form.etd_dt.className="input2";
			form.etd_dt.value="";
		} else {
			form.vvd_cd.disabled=true ;				
			form.etd_dt.disabled=false;
			form.vvd_cd.className="input2";
			form.etd_dt.className="input1";
			form.etd_dt.value=ComGetNowInfo("ymd", "-");
			form.vvd_cd.value="" ;
		}
		retrieveFlg == 0;
		form.etd_dt.value=ComGetNowInfo("ymd" ) ;
    	sheetObjects[0].RemoveAll();
    	sheetObjects[1].RemoveAll();
    	form.vvd_cd.value="";
    	form.ar_ofc_cd.SetSelectText(form.org_ofc_cd.value);
    	form.locl_curr_cd.value=form.org_curr_cd.value;
    	form.bnd_cd.value="O";
        form.svc_scp_cd.text="ALL";
        form.vps_port_cd.text="ALL";
     }
	 */
	/**
	 * etd_dt Setting masked value, After validating date.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *   fn_ComGetMaskedValue('20090101');
	 * </pre>
	 * @param String value
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function fn_ComGetMaskedValue(value) {
		var value=form.etd_dt_fm.value;
		value=ComReplaceStr(value,"-","");
		if (value=="") return;
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
		var days=ComGetLastDay(value.substring(0,4), value.substring(4,6));
		if (value.substring(6,8) > days) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(6,8) == 00) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		var ret=ComGetMaskedValue(value, "ymd")  ;     
		form.etd_dt_fm.value=ret;
	}
	
	function fn_ComGetMaskedValue_to(value) {
		var value=form.etd_dt_to.value;
		value=ComReplaceStr(value,"-","");
		if (value=="") return;
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
		var days=ComGetLastDay(value.substring(0,4), value.substring(4,6));
		if (value.substring(6,8) > days) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		if (value.substring(6,8) == 00) {
			ComShowCodeMessage("INV00024");
			return;
		} 
		var ret=ComGetMaskedValue(value, "ymd")  ;     
		form.etd_dt_to.value=ret;
	}
	/**
	 * Coding event for OnPopup.<br>
	 * <br><b>Example : </b>
	 * <pre>
	 *    sheet1_OnPopupClick(SheetObjects[0], 1,1);
	 * </pre>
	 * @param object sheetObj
	 * @param number Row
	 * @param number Col
	 * @author Choi Do Soon
	 * @version 2009.10.08
	 */
	function sheet1_OnPopupClick(sheetObj, Row,Col){
		var formObject=document.form;
		var param="";
		if (sheetObj.ColSaveName(Col) == "vsl_pop") {
			var vvdCd=sheetObj.GetCellValue(Row,"vvd_cd");
			var vsl_cd=vvdCd.substring(0,4);
			var skd_voy_no=vvdCd.substring(4,8);
			var skd_dir_cd=vvdCd.substring(8,9);
			param="pop_mode=Y&vsl_cd="+vsl_cd+"&skd_voy_no="+skd_voy_no+"&skd_dir_cd="+skd_dir_cd;
			ComOpenPopup('/opuscntr/VOP_VSK_0019_POP.do?pgmNo=VOP_VSK_0019&'+param, 1000, 630, '', '0,0'); 
		} else if (sheetObj.ColSaveName(Col) == "exRate_pop") {
			var vvvCd=sheetObj.GetCellValue(Row,"vvd_cd");
			var loclCurrCd=document.form.locl_curr_cd.value;
			var ioBndCd=sheetObj.GetCellValue(Row,"io_bnd_cd");
			param='vvvcd='+vvvCd+'&locl_curr_cd='+loclCurrCd+'&io_bnd_cd='+ioBndCd;
			ComOpenPopup('/opuscntr/FNS_INV_0006.do?pgmNo=FNS_INV_0006&'+param, 1300, 650, '', '0,0');    	
		}
	}
	function changeTriYn(){
		sheetObjects[0].RemoveAll();
		sheetObjects[1].RemoveAll();
		if(document.form.tri_yn.value=="Y"){
			var cols = [ {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"vps_port_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
			             {Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
 		
		}else{
            var cols = [ {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
						{Type:"Combo",     Hidden:0, Width:55,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
						{Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"vps_port_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
						{Type:"Combo",     Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];             
            sheetObjects[0].InitColumns(cols); 					
		}
	}
	function MakeComboObject(cmbObj, arrStr) {
		// Initialize IBMultiCombo.
		for (var i=0; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i, arrStr[i], arrStr[i]);
		}
		cmbObj.SetDropHeight(190);
	}
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
	function initControl() {
		// Axon event process. Event catch.
		//axon_event.addListenerFormat('keypress',       'obj_keypress',    form); // When entering keyboard.
	}
	/**KEY Event<br>
	 * @author Choi Do Soon
	 * @version 2009.11.10
	 */
//	function obj_keypress(){
//		switch(event.srcElement.dataformat){
//			case "float":
//				// Only number or '.'.
//				ComKeyOnlyNumber(event.srcElement, ".");
//				break;
//			case "ymd":
//				// Only number or '-'.
//				ComKeyOnlyNumber(event.srcElement);
//				break;
//			case "eng":
//				// Only Alphabet or number.
//				ComKeyOnlyAlphabet();
//				break;
//			case "engdn":
//				// Only lower case.
//				ComKeyOnlyAlphabet('lower');
//				break;
//			case "engup":
//				// Only upper case.
//				ComKeyOnlyAlphabet('upper');
//				break;
//			case "num":
//				// Only number(integer, date, time).
//				ComKeyOnlyNumber('num');
//				break;
//			case "uppernum":
//				// Only upper case or number. 
//				ComKeyOnlyAlphabet('uppernum');
//				break;
//			default:
//				// Only upper case.
//				ComKeyOnlyAlphabet('upper');
//		}
//	}
	/**
	 * Coding event for OnSearchEnd.<br>
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
		var rowCnt=sheetObj.RowCount();
		for(var i=1; i <= rowCnt ; i++){
			if(sheetObj.GetCellValue(i,'inv_xch_rt')!=''&&sheetObj.GetCellValue(i,'inv_xch_rt')!='0'){
//no support[check again]CLT 				sheetObj.SetCellBackColor(i,'inv_xch_rt',sheetObj.WebColor("FFFF00"));
			}
		}
		sheetObj.SelectCell(0,0,false);
	}
	
	function resizeSheet(){
		ComResizeSheet(sheetObjects[0]);
		ComResizeSheet(sheetObjects[1]);
		ComResizeSheet(sheetObjects[2], 120);
	}	
	
