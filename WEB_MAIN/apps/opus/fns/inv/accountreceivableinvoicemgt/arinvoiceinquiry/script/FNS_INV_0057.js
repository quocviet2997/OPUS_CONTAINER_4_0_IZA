/*=========================================================
.*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0057.js
*@FileTitle  : Invoice Not Issued Inquiry by Customer
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================*/
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
//IBMultiCombo
var comboObjects=new Array();
var combo1=null;
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
 * @author 
 * @version 2009.07.23
 */
function processButtonClick(){
    /***** Setting each tab's sheet variable. *****/
    var sheetObject=sheetObjects[0];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_retrieve":
                doActionIBSheet(sheetObject,formObject,IBSEARCH);
            break;
            case "btn_new":
                removeAll(formObject);
            break;
            case "btn_downexcel":
            	if(sheetObject.RowCount() < 1){
            		ComShowCodeMessage("COM132501");
            	}else{
            		sheetObject.Down2Excel({DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1});

            	}
            break;
            case "btns_calendar": // Calendar button.
                var cal=new ComCalendar();
                cal.setDisplayType('date');
                cal.select(formObject.as_of_date, 'yyyy-MM-dd');
            break;
            case "btns_cust1": // CUST retrieve button.
                var v_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
                var v_cust_seq=formObject.act_cust_seq.value;
                var classId="FNS_INV_0013";
                var param='?cust_cnt_cd='+v_cust_cnt_cd+'&cust_seq='+v_cust_seq+'&pop_yn=Y&classId='+classId;
                ComOpenPopup('/opuscntr/FNS_INV_0013.do' + param, 950, 680, 'getFNS_INV_0013', '1,0,1,1,1', false, false);
            break;
            case "btns_cust2": // CUST retrieve button.
                var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
//                var v_cust_nm=sheetObject.UrlEncoding(formObject.cust_nm.value);
            	var v_cust_nm=formObject.cust_nm.value;
                var classId="FNS_INV_0086";
                var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_lgl_eng_nm='+v_cust_nm+'&pop_yn=Y&classId='+classId;
                ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false);
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
 * Register IBSheet object on sheetObjects array. <br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * Array define top on source.
 * </pre>
 * @param  {IBSheet} sheetObj IBSheet Object
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function setSheetObject(sheet_obj){
    sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * Register IBCombo object on array. <br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * Array define top on source.
 * </pre>
 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function setComboObject(combo_obj){
    comboObjects[comboCnt++]=combo_obj;
}
/** 
 * Coding event handler for body tag's OnLoad. <br>
 * <br><b>Example :</b>
 * <pre>
 * After complete on load, add pre-function.
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function loadPage() {
    var formObject=document.form;
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    // Initialize IBMultiCombo.
    for(var k=0; k<comboObjects.length; k++){
        initCombo(comboObjects[k],k+1);
    }
    sheet1OnLoadFinish(sheetObjects[0])
}
/** 
 * Initialize sheet. Define header.<br>
 * <br><b>Example :</b>
 * <pre>
 * Initialize moudle by sheet count.
 * </pre>
 * @param sheetObj sheet object
 * @param sheetNo sheet object 
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function initSheet(sheetObj,sheetNo) {
    var formObject = document.form;
    var cnt = 0;
    
    var dpPrcsKnt=formObject.dp_prcs_knt.value;
    switch(sheetNo) {
        case 1:      //t1sheet1 init
        if (dpPrcsKnt > 0) {
            with(sheetObj){
                var HeadTitle=" |Office|Bound|Type|VVD|S/A Date|POL|POD|B/L No|I/F No|TEU|FEU|LCL Amount|Ex. Rate(USD:LCL)|Due Date|Overdue";
                var headCount=ComCountHeadTitle(HeadTitle);
                
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
//    	        SetConfig( { SearchMode:2, FrozenCol:5, MergeSheet:7, Page:20, DataRowMerge:0 } );

                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                            {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"type",         KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Date",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"sail_arr_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"pol_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"pod_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",     KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Int",       Hidden:0,  Width:45,   Align:"Right",   ColMerge:0,   SaveName:"bkg_teu_qty",  KeyField:0,   CalcLogic:"",   Format:"Integer" },
                            {Type:"Int",       Hidden:0,  Width:45,   Align:"Right",   ColMerge:0,   SaveName:"bkg_feu_qty",  KeyField:0,   CalcLogic:"",   Format:"Integer" },
                            {Type:"AutoSum",   Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName:"inv_lcl",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKnt },
                            {Type:"Float",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"usd_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
                            {Type:"Date",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"due_dt",       KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"over",         KeyField:0,   CalcLogic:"",   Format:"Integer" } ];
                                                   
                InitColumns(cols);
                
                SetEditable(0);
                SetSheetHeight(450);
                sheetObj.ShowSubSum([{StdCol:"io_bnd_cd", SumCols:"12", Sort:0, CaptionCol:2,CaptionText:"Total"}]);
                resizeSheet();
            }
            break;
        }
        else {
            with(sheetObj){
                var HeadTitle=" |Office|Bound|Type|VVD|S/A Date|POL|POD|B/L No|I/F No|TEU|FEU|LCL Amount|Ex. Rate(USD:LCL)|Due Date|Overdue";
                var headCount=ComCountHeadTitle(HeadTitle);
                
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
//    	        SetConfig( { SearchMode:2, FrozenCol:5, MergeSheet:7, Page:20, DataRowMerge:0 } );

                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                            {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"type",         KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Date",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"sail_arr_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"pol_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"pod_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",     KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Int",       Hidden:0,  Width:45,   Align:"Right",   ColMerge:0,   SaveName:"bkg_teu_qty",  KeyField:0,   CalcLogic:"",   Format:"Integer" },
                            {Type:"Int",       Hidden:0,  Width:45,   Align:"Right",   ColMerge:0,   SaveName:"bkg_feu_qty",  KeyField:0,   CalcLogic:"",   Format:"Integer" },
                            {Type:"AutoSum",   Hidden:0, Width:120,  Align:"Right",   ColMerge:0,   SaveName:"inv_lcl",      KeyField:0,   CalcLogic:"",   Format:"Integer" },
                            {Type:"Float",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"usd_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
                            {Type:"Date",      Hidden:0,  Width:110,   Align:"Center",  ColMerge:0,   SaveName:"due_dt",       KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"over",         KeyField:0,   CalcLogic:"",   Format:"Integer" } ];
                                                   
                    InitColumns(cols);
                    
                    SetEditable(0);
                    SetSheetHeight(450);
                    sheetObj.ShowSubSum([{StdCol:"io_bnd_cd", SumCols:"12", Sort:0,  CaptionCol:2,CaptionText:"Total"}]);
                    resizeSheet();
            }
            break;
        }
    }
}
/** 
 * Initialize combo.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param {IBMultiCombo} comboObj  comboObj
 * @param comboNo combo object. 
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function initCombo(comboObj, comboNo) {
    switch(comboObj.options.id) {
        case "amount_option": 
            with (comboObj) {
                InsertItem(0, "All",    "A");
                InsertItem(1, "Plus",   "P");
                InsertItem(2, "Minus",  "M");
                Code="A";
                SetColAlign(0, "left");
                SetColWidth(0, "76");
                //SetTitle("Office Code");
                SetMultiSelect(0);
                SetUseAutoComplete(0);
                SetDropHeight(200);
                SetMaxLength(6);
                amount_option.SetSelectText("All");
            }
        break;
        case "ar_ofc_cd":
            with (comboObj) {
                SetColAlign(0, "left");
                SetColWidth(0, "76");
                //SetTitle("Office Code");
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetDropHeight(200);
                SetMaxLength(6);
            }
            break;
    }
}
/** 
 * Coding event for OnLoad.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function initControl() {
	var formObj=document.form;
    // Axon event process. Event catch.
    //axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
    axon_event.addListenerFormat ('beforeactivate', 'obj_activate', formObj);
    //axon_event.addListenerForm ('keyup', 'obj_keyup', form);
    axon_event.addListenerForm ('beforedeactivate', 'obj_deactivate', formObj);
    axon_event.addListenerForm ('focusout', 'obj_focusout', formObj);
}

/** 
 * OnFocusOut event(on focus out)<br>
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
function obj_focusout() {
    var sheetObject=sheetObjects[0];
    var formObject=document.form;
    var v_tmp="";
    switch(ComGetEvent("name")){
        case "act_cust_seq":
			if (formObject.act_cust_seq.value.length != 0 && formObject.act_cust_seq.value.length < 6) {
				for(i=0; i < 6 - formObject.act_cust_seq.value.length; i++){
					v_tmp=v_tmp + "0";
				}
				formObject.act_cust_seq.value=v_tmp+formObject.act_cust_seq.value;
			}	            	
            if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value) {
                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
            }else{
            	formObject.cust_nm.value="";
            }
        break;
    }
}

/** 
 * Coding event for OnKeyPress.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function obj_keypress() {
    switch(ComGetEvent("dataformat")){
        case "float":
            // Only number or '.'.
            ComKeyOnlyNumber(ComGetEvent(), "."); 
        break;
        case "int":
            switch(ComGetEvent("name")){
                case "from_over_due":   
                    // Only number.
                    ComKeyOnlyNumber(ComGetEvent(), "-");
                break;
                case "to_over_due": 
                    // Only number.
                    ComKeyOnlyNumber(ComGetEvent(), "-");
                break;
                default:
                    // Only number.
                    ComKeyOnlyNumber(ComGetEvent());
                break;
            }
        break;
        case "engup":
            switch(ComGetEvent("name")){
                case "act_cust_cnt_cd": 
                    // Only upper case.                     
                    ComKeyOnlyAlphabet('upper'); 
                break;
            }
        break;
        case "num":
            // Only number(integer, date, time).
            ComKeyOnlyNumber('num');
        break;
        default:
            // Only number.
            ComKeyOnlyNumber(ComGetEvent());
        break;
    }
}
/** 
 * Coding event for OnBeForeActivate.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function obj_activate() {
    // Removing mask separator.
    ComClearSeparator(ComGetEvent());
}
/** 
 * Coding event for OnKeyUp.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function obj_keyup() {
    var formObject=document.form;
    switch (ComGetEvent("name")) {
        case "act_cust_cnt_cd":
            var custCntCd=ComGetEvent("value");
            if (custCntCd.length == 2) {
                formObject.act_cust_seq.focus();
            }
        break;
    }
}
/** 
 * Coding event for Onbeforedeactivate.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function obj_deactivate(){
    var sheetObject=sheetObjects[0];
    var formObject=document.form;
    switch(ComGetEvent("name")){
        case "act_cust_seq":
            if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value != '') {
                var valueCustSeq=formObject.act_cust_seq.value;
                formObject.act_cust_seq.value=ComLpad(valueCustSeq,6,"0");
                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
            }
        break;
        case "as_of_date":
        	ComAddSeparator(form.as_of_date, "ymd");
            ComChkObjValid(ComGetEvent());
        break;
        default:
            ComChkObjValid(ComGetEvent());
        break;

    }
}
/** 
 * Coding retrieve, save...<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object.  
 * @param  {object} formObj : Form object.
 * @param  {sAction} sAction : f_cmd.
 * @param  {int} Row : Selected row.
 * @param  {int} Col : Selected column.
 * @param  {String}Val : Selected row, column value
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)) {
                var sheetObjR = sheetObj.Reset();
                sheetObjects[0] = sheetObjR;
                formObj.f_cmd.value=SEARCH;
                var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
                formObj.ofc_cd.value=arrStr2[1];
                var sXml=sheetObjR.GetSearchData("FNS_INV_0057GS.do", FormQueryString(formObj));
                // Set number of decimal places
                formObj.dp_prcs_knt.value=ComGetEtcData(sXml,"dp_prcs_knt");
                // Setting CRDT limit.
                formObj.cr_amt.value=ComAddComma(ComGetEtcData(sXml,"cr_amt"));
                // Setting O/B term.
                formObj.ob_cr_term_dys.value=ComAddComma(ComGetEtcData(sXml, "ob_cr_term_dys"));
                // Setting I/B term.
                formObj.ib_cr_term_dys.value=ComAddComma(ComGetEtcData(sXml, "ib_cr_term_dys"));
                initSheet(sheetObjR,1);
                
                sheetObjR.SetSumText(0,1, "Grand Total");
//                sheetObjR.SetSumText(1,2, "Total");
//                sheetObjR.MessageText("Sum")="Grand Total";
//                sheetObjR.MessageText("SubSum")="Total";
                sheetObjR.LoadSearchData(sXml,{Sync:1} );
            }
        break;
        case IBSEARCH_ASYNC10: // Retrieving AR office.
            formObj.f_cmd.value=SEARCH02;
            var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
            var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
            var arrStr=sStr.split("|");
            MakeComboObject(ar_ofc_cd, arrStr);
            var arrStr2=arrStr[1].split("^");
            var ar_ofc_cd_str=arrStr2[3];
            ar_ofc_cd.SetSelectText(ar_ofc_cd_str);
            
        break;
        case IBSEARCH_ASYNC20: // customer name retrieve
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            formObj.ofc_cd.value=arrStr2[1];
            formObj.f_cmd.value=SEARCH03;
            var actCustCntCd=formObj.act_cust_cnt_cd.value;
            var actCustSeq=formObj.act_cust_seq.value;
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
 * Validating input value. <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object.  
 * @param  {object} formObj : Form object.
 * @param  {sAction} sAction : f_cmd.
 * @return true, false
 * @see #
 * @author 
 * @version 2009.07.23
 */
function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
        case IBSEARCH:      //retrieve
            with(formObj){
                if(act_cust_cnt_cd.value == "") {
                    ComShowCodeMessage("INV00004");
                    act_cust_cnt_cd.focus();
                    return false;
                }
                if(act_cust_seq.value == "") {
                    ComShowCodeMessage("INV00004");
                    act_cust_cnt_cd.focus();
                    return false;
                }
                
                
                if(comboObjects[0].GetSelectText() == "") {
                    ComShowCodeMessage("INV00004");
                    //ar_ofc_cd.focus();
                    return false;
                }
                if(from_over_due.value == "") {
                    ComShowCodeMessage("INV00004");
                    from_over_due.focus();
                    return false;
                }
                if(to_over_due.value == "") {
                    ComShowCodeMessage("INV00004");
                    to_over_due.focus();
                    return false;
                }
                if(as_of_date.value == "") {
                    ComShowCodeMessage("INV00004");
                    act_cust_cnt_cd.focus();
                    return false;
                }
            }
        break;
    }
    return true;
}
/** 
 * Coding evnet for OnLoadFinish.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {ibsheet} sheetObj IBSheet Object        
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */     
function sheet1OnLoadFinish(sheetObj){
    var formObj=document.form;
    initControl();
    doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC10);
    setDefaultDateValue(formObj);
    formObj.act_cust_cnt_cd.focus();
}
/** 
 * Coding evnet for OnSearchEnd.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {ibsheet} sheetObj required IBSheet Object
 * @param {object} ErrMsg        
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
//    var arOfcCd=ar_ofc_cd.GetSelectText();
//    if (arOfcCd != 'All') {
//        sheetObj.ShowSubSum([{StdCol:"io_bnd_cd", SumCols:"12", Sort:1,  CaptionCol:2,CaptionText:"Total"}]);
//    }
//    else {
//        sheetObj.ShowSubSum([{StdCol:1, SumCols:"12", Sort:false, ShowCumulate:false, CaptionCol:1}]);
//    }
}
/** 
 * Initialize screen.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {object} formObj  
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function removeAll(formObj) {
    formObj.reset();
    sheetObjects[0].RemoveAll();
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
    setDefaultDateValue(formObj);
    formObj.act_cust_cnt_cd.focus();
}
/** 
 * office code select box <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {IBMultiCombo} comboObj  
 * @param  {Array} arrStr
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function MakeComboObject(cmbObj, arrStr) {

    cmbObj.RemoveAll();
    for (var i=1; i < arrStr.length;i++ ) {
        var arrStr2=arrStr[i].split("^");
        var ar_ofc_cd=arrStr2[1];
        cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
    }
    cmbObj.InsertItem(0, "All", "ALL^");
}
/** 
 * ar_ofc_cd If combo box's value changed, initialize screen.<br>
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
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
    var formObject=document.form;
    var expensInfo1=newCode.split("^");
    ComSetObjValue(formObject.ofc_cd,expensInfo1[1]);
}
/** 
 * Initialize date condition's values.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param   formObj  
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function setDefaultDateValue(formObj) {
    today=new Date();
    var year=today.getFullYear();
    var mon=today.getMonth()+1;
    var sday=today.getDate();
    formObj.as_of_date.value=year+"-"+ComLpad(mon,2,"0")+"-"+ComLpad(sday,2,"0");
    amount_option.SetSelectText("All");
}
/** 
 * If event completed, call parent window. <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {array} rowArray   
 * @return none.
 * @see #
 * @author 
 * @version 2009.07.23
 */
function getFNS_INV_0086(rowArray) {
    var colArray=rowArray[0];
    var formObject=document.form;
    formObject.act_cust_cnt_cd.value=colArray[8];
    formObject.act_cust_seq.value=ComLpad(colArray[9], 6, '0');
    formObject.cust_nm.value=colArray[4];
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0],70);
}
