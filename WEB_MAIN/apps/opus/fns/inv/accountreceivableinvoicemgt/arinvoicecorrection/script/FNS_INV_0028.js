/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0028.js
*@FileTitle  : Invoice Data Manual Interface
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
//common global variables
var sheetObjects=new Array();
var sheetCnt=0;
//define button click event handler */
document.onclick=processButtonClick;
/** 
 * event handler branch process by button name <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  none  
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function processButtonClick(){
    var sheetObject1=sheetObjects[0];   
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
        case "btn_retrieve":
            doActionIBSheet(sheetObject1,formObject,IBSEARCH);
            break;
        case "btn_execute":
            formObject.man_div_ind.value="I";
            if(sheetObject1.RowCount()<1||sheetObject1.CheckedRows('chk')<1 ){
                ComShowCodeMessage("COM12189");
                return;
            }
            doActionIBSheet(sheetObject1,formObject,IBSAVE);
            break;
        case "btn_ifbkg":
            if(sheetObject1.RowCount()>0&&sheetObject1.CheckedRows('chk')>0 ){
                formObject.man_div_ind.value="I";
                formObject.bkg_no.value="";
                formObject.vvd.value="";
                formObject.pol.value="";
                formObject.pod.value="";
            } else {
                formObject.man_div_ind.value="M";
                if(formObject.bkg_no.value==""&&formObject.vvd.value==""){
                    ComShowCodeMessage("INV00004");
                    formObject.bkg_no.focus();
                    return;
                }
                if(formObject.vvd.value!=""&&formObject.vvd.value.length!=9){
                    ComShowCodeMessage("INV00004");
                    formObject.vvd.focus();
                    return;
                }
                if(formObject.vvd.value!=""){
                    if(formObject.pol.value==""){
                        ComShowCodeMessage("INV00004");
                        formObject.pol.focus();
                        return;
                    }
                    if(formObject.pod.value==""){
                        ComShowCodeMessage("INV00004");
                        formObject.pod.focus();
                        return;
                    }
                }
            }
            doActionIBSheet(sheetObject1,formObject,IBSAVE);
            break;
        case "btn_erp":
            formObject.man_div_ind.value="T";
            doActionIBSheet(sheetObject1,formObject,IBSAVE);
            break;
        case "btn_erpU":
            formObject.man_div_ind.value="U";
            doActionIBSheet(sheetObject1,formObject,IBSAVE);
            break;
        case "btn_cancel":
            formObject.man_div_ind.value="C";
            doActionIBSheet(sheetObject1,formObject,IBSAVE);
            break;
        case "btn_otherif":
            doActionIBSheet(sheetObject1,formObject,IBSEARCH_ASYNC10);
        break;
        case "btn_new":
            formObject.fm_if_dt.value="";
            formObject.to_if_dt.value="";
            formObject.trnk_vvd.value="";
            formObject.bl_src_no.value="";
            formObject.pol.value="";
            formObject.pod.value="";
            formObject.bkg_no.value="";
            formObject.vvd.value="";
            sheetObjects[0].RemoveAll();
            formObject.fm_if_dt.focus();
            break;  
        case "btns_calendar1": 
            var cal=new ComCalendar();
            cal.select(formObject.fm_if_dt, 'yyyy-MM-dd');
        break;
        case "btns_calendar2": 
            var cal=new ComCalendar();
            cal.select(formObject.to_if_dt, 'yyyy-MM-dd');
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
 *  add IBSheet Object to sheetObjects array <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj IBSheet Object
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function setSheetObject(sheet_obj){
    sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * define onLoad event handler<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  none
 * @return none
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
    document.form.fm_if_dt.focus();
}
/** 
 * initializing sheet, define header<br> 
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {IBSheet} sheetObj 
 * @param {int} sheetNo  
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var sheetID=sheetObj.id;
    switch(sheetID) {
    case "sheet1":
        with(sheetObj){
            var HeadTitle="|Sel.|PPD Office|CCT Office|Trunk VVD|B/L No|BKG No|I/F Date|POL|POD|Status|Err Rsn|bkg_no|bkg_seq";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"chk",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                        {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"ppd_ofc",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cct_ofc",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"trnk_vvd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 },
                        {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"bkg_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"src_if_dt",      KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"inv_ar_if_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 },
                        {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:1,   SaveName:"ar_if_err_rsn",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 },
                        {Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:1,   SaveName:"bkg_seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:9 } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetEditableColorDiff(0);
            SetWaitImageVisible(0);
            SetWaitTimeOut(1000);
//            SetSheetHeight(380);
            resizeSheet();
            
        }

        break;      
    }
}
/** 
 * doActionIBSheet <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj   
 * @param  {object} formObj
 * @param  {sAction} sAction
 * @return none
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
    case IBSAVE:        //save              
    if(validateForm(sheetObj,formObj,sAction)){
        ComOpenWait(true);
        formObj.f_cmd.value=MULTI;
        var sXml=sheetObj.GetSaveData("FNS_INV_0028GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sheetObj.GetSaveString(false,true,"chk"),"sheet1_"));
        sheetObj.LoadSaveData(sXml);
        ComOpenWait(false);
    }
    break;  
    case IBSEARCH:      //retrieve
    if(validateForm(sheetObj,formObj,sAction)){ 
        ComOpenWait(true);
        formObj.f_cmd.value=SEARCH01;
        sheetObj.DoSearch("FNS_INV_0028GS.do", FormQueryString(formObj) );
    }
    break;
    case IBSEARCH_ASYNC10:      //manage other i/f  
        formObj.f_cmd.value=MULTI;
        var sXml=sheetObj.GetSearchData("FNS_INV_0083GS.do", FormQueryString(formObj));
        var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
        var arIfNo=ComGetEtcData(sXml,"ar_if_no");
        alert("AR_IF_NO : "+arIfNo);
    break;
    }
}

function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    ComOpenWait(false);
}

function sheet1_OnSaveEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    ComOpenWait(false);
    if(Code == 0){
//        ComShowCodeMessage("COM132601");
    }
}

/** 
 * svalidateForm <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj  
 * @param  {object} formObj
 * @param  {sAction} sAction 
 * @return true, false
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch(sAction) {
        case IBSEARCH:          
            if(formObj.fm_if_dt.value==""&&formObj.to_if_dt.value==""&&formObj.trnk_vvd.value==""&&formObj.bl_src_no.value==""){
                ComShowCodeMessage("INV00004");
                formObj.fm_if_dt.focus();
                return;
            }
            if(ComGetDaysBetween(formObj.fm_if_dt.value,formObj.to_if_dt.value)>30){
                ComShowCodeMessage("INV00043");
                formObj.to_if_dt.focus();
                return;
            }
            if(formObj.fm_if_dt.value>formObj.to_if_dt.value){
                ComShowCodeMessage("INV00024");
                formObj.to_if_dt.focus();
                return;
            }
            break;
        }
    }     
    return true;
}
/**
 * validate and set masked value whenfm_if_dt,to_if_dt change<br>
 * <br><b>Example : </b>
 * <pre>
 *   fn_ComGetMaskedValue('fm_if_dt');
 * </pre>
 * @param String elNm
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function fn_ComGetMaskedValue(elNm) {
    var formObj;
    if (elNm == "fm_if_dt") {
        formObj=form.fm_if_dt;
    } else {
        formObj=form.to_if_dt;
    }
    var value=formObj.value;
    if(value=="") return;
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
    if(elNm == "fm_if_dt"){
        if(form.to_if_dt.value==""){
            form.to_if_dt.value=ret;
        }
        form.to_if_dt.select(); 
    }
}
/**
 * focus in selected tab's to_dt after check fm_dt digits<br>
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
        if(form.to_if_dt.value==""){
            form.to_if_dt.value=ComTrimAll(value," ", "-", ":");
        }
        form.to_if_dt.select(); 
    }
}
/**
 * check BackEndJob Status until '3'.<br>
 *
 * @return none
 * @see #doActionIBSheet
 */
function getBackEndJobStatus() {
    form.f_cmd.value=SEARCH02;
    var sXml=sheetObjects[0].GetSearchData("FNS_INV_0028GS.do", FormQueryString(form));
    var arrXml=sXml.split("|$$|");
    var jobState=ComGetEtcData(arrXml[0], "jb_sts_flg")
    var jobMsg=ComGetEtcData(arrXml[0], "jb_msg")
    if(jobState == "3") {
        clearInterval(timer);
        //getBackEndJobLoadFile();
        ComShowCodeMessage("INV00051");
        ComOpenWait(false);
    } else if(jobState == "4") {
        clearInterval(timer);
        // BackEndJob failed.
        ComShowCodeMessage("INV00089");
        ComOpenWait(false);
    } else if(jobState == "5") {
        clearInterval(timer);
        // already read BackEndJob result.
        ComShowCodeMessage("INV00090");
        ComOpenWait(false);             
    }
}
/**
 * retrieve BackEndJob results.<br>
 * 
 * @return none
 * @see #getBackEndJobStatus
 */
function getBackEndJobLoadFile() {
    form.f_cmd.value=SEARCH03;
    var sXml=sheetObjects[0].GetSearchData("FNS_INV_0028GS.do", FormQueryString(form));
    var arrXml=sXml.split("|$$|");
    if(arrXml.length > 0) {
        if(ComGetEtcData(sXml,"TRANS_RESULT_KEY")=="S"){
            alert(ComGetEtcData(sXml,"RESULT"));
        }
        form.backendjob_key.value="";
    }
}
/**KEY Event<br>
 * @author Choi Do Soon
 * @version 2009.11.10
 */
function initControl() {
    //axon_event.addListenerFormat('keypress',       'obj_keypress',    form); //- 키보드 입력할때
}
/**KEY Event<br>
 * @author Choi Do Soon
 * @version 2009.11.10
 */
function obj_keypress(){
    switch(ComGetEvent("dataformat")){
    case "float":
        //number+"."
        ComKeyOnlyNumber(ComGetEvent(), ".");
        break;
    case "ymd":
        //number+"-"
        ComKeyOnlyNumber(ComGetEvent());
        break;
    case "eng":
        //english only
        ComKeyOnlyAlphabet();
        break;
    case "engdn":
        //lower case only
        ComKeyOnlyAlphabet('lower');
        break;
    case "engup":
        //upper case only
        ComKeyOnlyAlphabet('upper');
        break;
    case "num":
        //number only
        ComKeyOnlyNumber('num');
        break;
    case "uppernum":
        //upper case+number 
        ComKeyOnlyAlphabet('uppernum');
        break;
    default:
        //upper case 
        ComKeyOnlyAlphabet('upper');
    }
} 

function resizeSheet(){
	ComResizeSheet(sheetObjects[0], 100);
}
