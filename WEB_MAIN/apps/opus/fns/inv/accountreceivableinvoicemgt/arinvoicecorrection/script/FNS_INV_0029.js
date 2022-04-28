/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0029.js
*@FileTitle  : Manual System Clear
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
// Global variables.
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var sheetObjects=new Array();
var sheetCnt=0;
//IBMultiCombo
var comboObjects=new Array();
var comboCnt=0;
//Defining button events. */
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
 * @version 2009.10.20
 */
function processButtonClick(){
    /***** Setting each tab's sheet variable. *****/
    var sheetObject1=sheetObjects[0];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_execute":
                doActionIBSheet(sheetObjects[0], document.form, IBSAVE);
            break;
            case "btn_save":
                doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01);
            break;
            case "btn_new":
                ar_ofc_cd.RemoveAll();
                removeAll(document.form);                   
            break;
            case "btns_cust1": // CUST retrieve button.
                var v_act_cust_cnt_cd=formObject.cust_cnt_cd.value;
                var v_act_cust_seq=formObject.cust_seq.value;
                var classId="FNS_INV_0013";
                var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_seq='+v_act_cust_seq+'&pop_yn=Y&classId='+classId;
                ComOpenWindow('/opuscntr/FNS_INV_0013.do' + param, 'getFNS_INV_0013', 'width=900,height=650');
            break;
            case "btns_cust2": // CUST retrieve button.
                var v_act_cust_cnt_cd=formObject.cust_cnt_cd.value;
                var v_cust_nm=formObject.cust_nm.value;
                var classId="FNS_INV_0086";
                var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_lgl_eng_nm='+v_cust_nm+'&pop_yn=Y&classId='+classId;
               // ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '0,1,1,1,1', false, false);
				var Row=1;
				var Col=1;
				//param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.cust_seq.value+'&cust_cnt_cd='+formObject.cust_cnt_cd.value;
				ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false, Row, Col, 0);

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
 * @version 2009.10.19
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
 * @version 2009.10.19
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
 * @version 2009.10.19
 */
function loadPage() {
    var formObj=document.form;
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    // Initialize IBMultiCombo.
    for(var k=0; k<comboObjects.length; k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
    formObj.bl_src_no.focus();
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
 * @version 2009.10.19
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var sheetID=sheetObj.id;
    switch(sheetID) {
        case "sheet1":
            with(sheetObj){
                var HeadTitle=" |OFC|VVD|S/A Date|SAILING DATE|B/L No|I/F No|C/A NO|BKG NO|CUSTOMER|REV TYPE|REV SRC|BND|POL|POD|Ex. Rate|USD CHG TOT|LCL CHG TOT|LCL_TOT_AMT|I/F DT|";
                var headCount=ComCountHeadTitle(HeadTitle);
                var prefix="sheet1_";
                
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ar_ofc_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:10 },
                            {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vvd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:11 },
                            {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"sail_arr_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:12 },
                            {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"sail_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bl_src_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"ar_if_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bkg_corr_no",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bkg_no",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"customer",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:11 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_tp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"rev_src_cd",       KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"io_bnd_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"pol_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:20 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"pod_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Float",     Hidden:0,  Width:100,  Align:"Right",   ColMerge:0,   SaveName:prefix+"inv_xch_rt",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Float",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:0,   SaveName:prefix+"usd_chg_tot",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Float",     Hidden:0,  Width:130,  Align:"Right",   ColMerge:0,   SaveName:prefix+"lcl_chg_tot",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0,   EditLen:3 },
                            {Type:"Float",     Hidden:0,  Width:130,  Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_ttl_locl_amt", KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Date",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bl_inv_if_dt",     KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"dp_prcs_knt",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                                                       
                InitColumns(cols);
                
                SetEditable(1);
                SetCountPosition(0);
                SetSheetHeight(320);
            }

        break;
    }
}
/** 
 * Initialize combo.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param {IBMultiCombo} comboObj  comboObj
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function initCombo(comboObj, comboNo) {
    switch (comboObj.options.id) {
        case "ar_ofc_cd":
            with (comboObj) {
                SetColAlign(0, "left");
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
 * @version 2009.10.19
 */
function initControl() {
    var formObj=document.form;
    // Axon event process. Event catch.
    //axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
    axon_event.addListenerForm ('focus', 'obj_activate', formObj);
    //axon_event.addListenerForm ('keyup', 'obj_keyup', formObj);
    axon_event.addListenerForm ('blur', 'obj_deactivate', formObj);
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
 * @version 2009.10.19
 */
function obj_keypress() {
    var formObj=document.form;
    switch(ComGetEvent("dataformat")){
        case "float":
            // Only number or '.'.
            ComKeyOnlyNumber(ComGetEvent(), "."); 
        break;
        case "int":
            // Only number.
            ComKeyOnlyNumber(ComGetEvent()); 
        break;
        case "engup":
            switch(ComGetEvent("name")){
                case "bl_src_no":   
                    // Only number or upper case.
                    ComKeyOnlyAlphabet('uppernum'); 
                    break;
                case "ar_if_no":    
                    // Only number or upper case.
                    ComKeyOnlyAlphabet('uppernum'); 
                    break;
                case "cust_cnt_cd": 
                    // Only upper case.                     
                    ComKeyOnlyAlphabet('upper'); 
                    break;
                case "port":    
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
            ComKeyOnlyNumber(event.srcElement);
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
 * @version 2009.10.19
 */
function obj_activate() {
    var formObj=document.form;
    // Removing mask separator.
    ComClearSeparator (ComGetEvent());
}
/** 
 * Coding event for KeyUp.<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param none.
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function obj_keyup() {
    var formObj=document.form;
    switch (ComGetEvent("name")) {
        case "cust_cnt_cd":
            var custCntCd=ComGetEvent("value");
            if (custCntCd.length == 2) {
                formObj.cust_seq.focus();
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
 * @version 2009.10.19
 */
function obj_deactivate(){
    var sheetObject=sheetObjects[0];
    var formObj=document.form;
    switch(ComGetEvent("name")){
        case "cust_seq":
            if (formObj.cust_cnt_cd.value != '' && formObj.cust_seq.value != '') {
                var valueCustSeq=formObj.cust_seq.value;
                formObj.cust_seq.value=ComLpad(valueCustSeq,6,"0");
                doActionIBSheet(sheetObject,formObj,IBSEARCH_ASYNC20);
                for(i=sheetObject.rowCount; i>0; i--){
                    if (formObj.cust_nm.value != '') {
                        sheetObject.SetCellValue(i, "cust_code",formObj.cust_cnt_cd.value+ComLpad(valueCustSeq,6,"0"),0);
                    }
                }
            }
            else {
                formObj.cust_cnt_cd.value='';
                formObj.cust_seq.value='';
                formObj.cust_nm.value='';
                for(i=sheetObject.rowCount; i>0; i--){
                    sheetObject.SetCellValue(i, "cust_code","",0);
                }
            }
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
 * @version 2009.10.19
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
        case IBSAVE:        //save
            if(validateForm(sheetObj,formObj,sAction)) {
                var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
                formObj.ofc_cd.value=arrStr2[1];
                formObj.ots_smry_cd.value=arrStr2[13];
                formObj.f_cmd.value=MULTI;
                var sParam=FormQueryString(formObj);
                sParam=sParam + "&cust_cd="+ formObj.cust_cnt_cd.value + formObj.cust_seq.value; 
                ComOpenWait(true);
                var sXml=sheetObj.GetSaveData("FNS_INV_0029GS.do", sParam );
                if (sXml.indexOf("ERROR") < 1){
                    var resultCnt=ComGetEtcData(sXml,"result_cnt");
                    sheetObj.LoadSaveData(sXml);
                    ComOpenWait(false);
                    if (resultCnt != undefined) {
                        if (resultCnt > 0) {
                            formObj.total_count.value=resultCnt;
                            ComShowCodeMessage("INV00093");
                        }
                        else {
                            formObj.total_count.value="0";
                            ComShowCodeMessage("INV00092");
                        }
                    } else {
                        formObj.total_count.value="";
                        ComShowCodeMessage("INV00053");
                    }
                }
                else {
                    ComOpenWait(false); 
                    ComShowCodeMessage("INV00053");
                }
            }
        break;
        case IBSEARCH_ASYNC01:        //save
        if(validateForm(sheetObj,formObj,sAction)) {
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            formObj.ofc_cd.value=arrStr2[1];
            formObj.ots_smry_cd.value=arrStr2[13];
            formObj.f_cmd.value=MULTI01;
            var sParam=FormQueryString(formObj);
            ComOpenWait(true);
            var sXml=sheetObj.GetSaveData("FNS_INV_0029GS.do", sParam );
            if (sXml.indexOf("ERROR") < 1){
                var resultCnt=ComGetEtcData(sXml,"result_cnt");
                sheetObj.LoadSaveData(sXml);
                ComOpenWait(false);
                if (resultCnt != undefined) {
                    if (resultCnt > 0) {
                        formObj.total_count.value=resultCnt;
                        ComShowCodeMessage("INV00093");
                    }
                    else {
                        formObj.total_count.value="0";
                        ComShowCodeMessage("INV00092");
                    }
                } else {
                    formObj.total_count.value="";
                    ComShowCodeMessage("INV00053");
                }
            }
            else {
                ComOpenWait(false); 
                ComShowCodeMessage("INV00053");
            }
        }
        break;
        case IBSEARCH_ASYNC10: // Retrieving AR office.
            formObj.f_cmd.value=SEARCH02;
            var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
            var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
            var arrStr=sStr.split("|");
            //office
            MakeComboObject(ar_ofc_cd, arrStr);
            var arrStr2=arrStr[1].split("^");
            var ar_ofc_cd_str=arrStr2[3];
            var ofcStr = "";
            var ofcStr2 = "";
            for (var i=0; i < arrStr.length; i++) {
                var sStr9=arrStr[i].split("^");
                if (sStr9[1] == ar_ofc_cd_str) {
                    ofcStr=arrStr[i]
                }
            }
            var ofcStr2=ofcStr.split("^");
            ar_ofc_cd.SetSelectText(ofcStr2[3]);
        break;
        case IBSEARCH_ASYNC20: // customer name retrieve
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            formObj.ofc_cd.value=arrStr2[1];
            formObj.f_cmd.value=SEARCH03;
            var actCustCntCd=formObj.cust_cnt_cd.value;
            var actCustSeq=formObj.cust_seq.value;
            var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+actCustCntCd+"&cust_seq="+actCustSeq);
            var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
            var delt_flg=ComGetEtcData(sXml,"delt_flg");
            if (cust_nm != undefined && delt_flg != undefined) {
                if (delt_flg == 'Y') {
                    ComShowCodeMessage("INV00060");
                    formObj.cust_cnt_cd.value="";
                    formObj.cust_seq.value="";
                    formObj.cust_nm.value="";
                    formObj.cust_cnt_cd.focus();
                    return;
                }
                formObj.cust_nm.value=cust_nm;
            } else {
            	ComShowCodeMessage("INV00054");
                formObj.cust_cnt_cd.value="";
                formObj.cust_seq.value="";
                formObj.cust_nm.value="";
                formObj.cust_cnt_cd.focus();
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
 * @version 2009.10.19
 */
function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
    case IBSAVE:      //Retrieve
        with(formObj){
            if(comboObjects[0].GetSelectText() == "") {
                ComShowCodeMessage("INV00004");
                //ar_ofc_cd.focus();
                return false;
            }
            if(bl_src_no.value == "" && vvd_cd.value == "" && (cust_cnt_cd.value == "" && cust_seq.value == "") ) {
                ComShowCodeMessage("INV00004");
                bl_src_no.focus();
                return false;
            }
        }
    break;
    case IBSEARCH_ASYNC01: 
        with(formObj){
            if(if_no1.value == "" || if_no2.value == "") {
                ComShowCodeMessage("INV00004");
                if_no1.focus();
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
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function MakeComboObject(cmbObj, arrStr) {
    var idx=0;
    for (var i=1; i < arrStr.length;i++ ) {
        var arrStr2=arrStr[i].split("^");
        var ar_ofc_cd_str=arrStr2[1];
        var ots_smry_cd=arrStr2[13];
 //       if (ots_smry_cd == 'INV' || ots_smry_cd == 'CLR') {
            cmbObj.InsertItem(idx, ar_ofc_cd_str, arrStr[i]);
            idx++;
 //       }
    }
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
 * @version 2009.10.19
 */
function removeAll(formObj) {
    formObj.reset();
    sheetObjects[0].RemoveAll();
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
    formObj.bl_src_no.focus();
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
 * @version 2009.10.19
 */
function getFNS_INV_0013() {
    var formObject=document.form;
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
 * @version 2009.10.19
 */
function getFNS_INV_0086(rowArray) {
    var colArray=rowArray[0];
    var formObject=document.form;
    formObject.cust_cnt_cd.value=colArray[8];
    formObject.cust_seq.value=ComLpad(colArray[9], 6, '0');
    formObject.cust_nm.value=colArray[4];
}
