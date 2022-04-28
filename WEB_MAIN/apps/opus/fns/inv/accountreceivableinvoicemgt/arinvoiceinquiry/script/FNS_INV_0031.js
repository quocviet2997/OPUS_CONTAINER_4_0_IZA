/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0031.js
*@FileTitle  : Invoice Inquiry by Date & VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/02
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
// common global valiables
var sheetObjects=new Array();
var sheetCnt=0;
//IBMultiCombo
var comboObjects=new Array();
var combo1=null;
var comboCnt=0;
// define button click event handler */
document.onclick=processButtonClick;
/** 
 * event handler branch proecss by button name<br>
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
    //try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_retrive":
                doActionIBSheet(sheetObject1,formObject,IBSEARCH);
            break;
            case "btn_new":
                removeAll(formObject);
            break;
            case "btn_downExcel":
                if(sheetObject1.RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObject1.Down2Excel({KeyFieldMark:false,DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1 });
                }
            break;
            case "btns_calendar1": 
                var cal=new ComCalendar();
                cal.setDisplayType('date');
                cal.select(formObject.from_date, 'yyyy-MM-dd');
            break;
            case "btns_calendar2": 
                var cal=new ComCalendar();
                cal.setDisplayType('date');
                cal.select(formObject.to_date, 'yyyy-MM-dd');
            break;
            case "btns_cust1": //CUST information retrieve button
                var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
                var v_act_cust_seq=formObject.act_cust_seq.value;
                var classId="FNS_INV_0013";
                var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_seq='+v_act_cust_seq+'&pop_yn=Y&classId='+classId;
                ComOpenPopup('/opuscntr/FNS_INV_0013.do' + param, 1000, 680, 'getFNS_INV_0013', '1,0,1,1,1', false, false);
            break;
            case "btns_cust2": //CUST quick search retrieve button 
                var v_act_cust_cnt_cd=formObject.act_cust_cnt_cd.value;
//                var v_cust_nm=sheetObject1.UrlEncoding(formObject.cust_nm.value);
                var v_cust_nm=formObject.cust_nm.value;
                var classId="FNS_INV_0086";
                var param='?cust_cnt_cd='+v_act_cust_cnt_cd+'&cust_lgl_eng_nm='+v_cust_nm+'&pop_yn=Y&classId='+classId+"&cust_lgl_eng_nm="+v_cust_nm+"&cust_seq="+formObject.act_cust_seq.value;
                ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086', '1,0', false, false);
            break;
            case "btns_port": //port retrieve button
                var loc_cd_val=formObject.port.value;
                var loc_port_ind_val="1";
                var dispaly="1,0,1,1,1,1,1,1,1,1,1,1";
                var classId="COM_ENS_051";
                var param='?loc_cd='+loc_cd_val+'&classId='+classId;
                ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 1100, 550, 'getCOM_ENS_051_1', dispaly);
            break;
            case "btns_SCP": //SCP retrieve button
                var v_svc_scp_cd=formObject.scope.value;
                var classId="COM_ENS_0L1";
                var param='?svc_scp_cd='+v_svc_scp_cd+'&classId='+classId;
                ComOpenPopup('/opuscntr/COM_ENS_0L1.do' + param, 700, 455, 'getCOM_ENS_0L1_1', '1,0,1,1,1', true);
            break;
        } // end switch
    //} catch(e) {
    //    if( e == "[object Error]") {
   //         ComShowMessage(OBJECT_ERROR);
     //   } else {
    //        ComShowMessage(e.message);
   //     }
  //  }
}
/** 
 * add IBSheet Object array  <br>
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
 * define onLoad event handler<br> 
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
        initSheet(sheetObjects[i],i+1,'G');
        ComEndConfigSheet(sheetObjects[i]);
    }
    //init IBMultiCombo
    for(var k=0; k<comboObjects.length; k++){
        initCombo(comboObjects[k],k+1);
    }
    var formObj=document.form;
    doActionIBSheet(sheet1, formObj, IBSEARCH_ASYNC10);
    initControl();
    date_option_OnChange('G');
    formObj.from_date.focus();
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
function initSheet(sheetObj,sheetNo,headType) {
    var formObject=document.form;
    var cnt=0;
    var dpPrcsKntLocal=formObject.dp_prcs_knt_local.value;
    var dpPrcsKnt=formObject.dp_prcs_knt.value;
    var setDpPrcsKnt="";
    if (Number(dpPrcsKntLocal) > Number(dpPrcsKnt)) {
        setDpPrcsKnt=dpPrcsKntLocal;
    }
    else {
        setDpPrcsKnt=dpPrcsKnt;
    }
    switch(sheetNo) {
        case 1:      //sheet1 init
            with(sheetObj){
            if (setDpPrcsKnt > 0) {
                var HeadTitle="";
                if (headType == "G") {
                HeadTitle="|Seq|Good Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
                }
                else if(headType == "I"){
                HeadTitle="|Seq|I/F Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
                }
                else {
                HeadTitle="|Seq|Eff. Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
                }
                var headCount=ComCountHeadTitle(HeadTitle);
                (headCount, 0, 0, true);
                
                SetConfig( { SearchMode:2, FrozenCol:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                            {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
                            {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"good_date",    KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"type",         KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"sail_arr_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"pol_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"pod_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"customer",     KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:145,  Align:"Left",    ColMerge:0,   SaveName:"cust_nm",      KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",     KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
                            {Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"lcl_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:setDpPrcsKnt },
                            {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_no",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"grp_inv_no",   KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"cust_agmt_no", KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"" }];
                                                       
                InitColumns(cols);
                
                SetEditable(0);
                SetCountPosition(0);
                SetWaitImageVisible(0);
                FrozenCols=2;
//                SetSheetHeight(380);
				resizeSheet();
            }
            else {
                var HeadTitle="";
                if (headType == "G") {
                HeadTitle="|Seq|Good Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID|OSCAR OTS Status";
                }
                else if(headType == "I"){
                HeadTitle="|Seq|I/F Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID|OSCAR OTS Status";
                }
                else {
                HeadTitle="|Seq|Eff. Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID|OSCAR OTS Status";
                }
                var headCount=ComCountHeadTitle(HeadTitle);
                (headCount, 0, 0, true);
                
                SetConfig( { SearchMode:2, FrozenCol:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                            {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
                            {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"good_date",    KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"type",         KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"sail_arr_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd" },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"pol_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"pod_cd",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"customer",     KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:145,  Align:"Left",    ColMerge:0,   SaveName:"cust_nm",      KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",    KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",     KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 },
                            {Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"lcl_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2 },
                            {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_no",       KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:120,  Align:"Center",  ColMerge:0,   SaveName:"grp_inv_no",   KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:140,  Align:"Center",  ColMerge:0,   SaveName:"cust_agmt_no", KeyField:0,   CalcLogic:"",   Format:"" },
                            {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"" }];
                                                       
                InitColumns(cols);
                
                SetEditable(0);
                SetCountPosition(0);
                SetWaitImageVisible(0);
                FrozenCols=2;
//                SetSheetHeight(380);
				resizeSheet();

            }
            }

        break;
    }
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
        case "ar_ofc_cd":
            with (comboObj) {
                SetColAlign(0, "left");
//                SetColWidth(0, "50");
                //SetTitle("Office Code");
                SetMultiSelect(0);
                SetUseAutoComplete(1);
                SetDropHeight(200);
                SetMaxLength(6);
            }
        break;
        case "issue_flag":
            with (comboObj) {
                InsertItem(0, "ALL",        "A");
                InsertItem(1, "Issue",      "Y");
                InsertItem(2, "Not Issue",  "N");
                Code="A";
                SetMultiSelect(0);
                //LineColor = "#ffffff";
                SetColAlign(0, "left");
                SetMultiSeparator(",");
                SetDropHeight(190);
                SetSelectCode("A");
            }
        break;
        case "rev_tp_cd":
            with (comboObj) {
                InsertItem(0, "ALL",    "A");
                InsertItem(1, "B/L",    "B");
                InsertItem(2, "C/A",    "C");
                InsertItem(3, "MRI",    "M");
                //Code = "A";
                SetMultiSelect(1);
                //LineColor = "#ffffff";
                SetColAlign(0, "left");
                SetMultiSeparator(",");
                SetDropHeight(190);
                //CheckCode("A")=true;
            }
        break;
        case "inv_clr_flg":
            with (comboObj) {
                InsertItem(0, "N",    "N");
                InsertItem(1, "Y",    "Y");
                //SetMultiSelect(0);
                //LineColor = "#ffffff";
                SetColAlign(0, "left");
                SetMultiSeparator(",");
                SetDropHeight(190);
                SetSelectCode("N");
            }
        break;
        case "bound":
            with (comboObj) {
                InsertItem(0, "ALL",    "A");
                InsertItem(1, "O/B",    "O");
                InsertItem(2, "I/B",    "I");
                SetMultiSelect(0);
                //LineColor = "#ffffff";
                SetColAlign(0, "left");
                SetMultiSeparator(",");
                SetDropHeight(190);
                SetSelectCode("A");
            }
        break;
        case "rev_src_cd":
            with (comboObj) {
                InsertItem(0, "ALL",    " ");
                SetMultiSelect(1);
                SetColAlign(0, "left");
                SetMultiSeparator(",");
                SetDropHeight(190);
                SetSelectText("ALL");
                //SetItemCheck(" ",true);
                //SetSelectCode("");
            }
        break;
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
    //Axon 이벤트 처리1. 이벤트catch(개발자변경)
    //axon_event.addListenerFormat ('keypress', 'obj_keypress', formObj);
    axon_event.addListenerFormat ('focus', 'obj_activate', formObj);
    axon_event.addListenerForm ('blur', 'obj_deactivate', formObj);
    axon_event.addListenerForm ('focusout', 'obj_focusout', formObj);
    //axon_event.addListenerForm ('keyup', 'obj_keyup', formObj);
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
    switch(ComGetEvent("dataformat")){
        case "float":
            //number+"."
            ComKeyOnlyNumber(ComGetEvent(), "."); 
        break;
        case "int":
            //number only 
            ComKeyOnlyNumber(ComGetEvent()); 
        break;
        case "engup":
            switch(ComGetEvent("name")){
                case "act_cust_cnt_cd": 
                    //upper case only                       
                    ComKeyOnlyAlphabet('upper'); 
                break;
                case "act_cust_seq":                        
                    // number only
                    ComKeyOnlyNumber(ComGetEvent());
                break;
                case "vvd":
                    //upper case +number
                    ComKeyOnlyAlphabet('uppernum');
                break;
                case "scope":
                    //upper case only                       
                    ComKeyOnlyAlphabet('upper'); 
                break;
                case "port":
                    //upper case only                       
                    ComKeyOnlyAlphabet('upper'); 
                break;
            }
        break;
        case "num":
            //number only
            ComKeyOnlyNumber('num');
        break;
        default:
            //number only
            ComKeyOnlyNumber(ComGetEvent());
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
    switch(ComGetEvent("name")){
        case "from_date": 
            ComClearSeparator (ComGetEvent());
        break;
        case "to_date":
            ComClearSeparator (ComGetEvent());
        break;
        default:
            ComClearSeparator (ComGetEvent());
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
    switch(ComGetEvent("name")){
        case "from_date":
        	ComAddSeparator(form.from_date, "ymd");
            ComChkObjValid(ComGetEvent());
        break;
        case "to_date":
        	ComAddSeparator(form.to_date, "ymd");
            ComChkObjValid(ComGetEvent());
        break;
        case "act_cust_seq":                
        	
            if (formObject.act_cust_cnt_cd.value != '' && formObject.act_cust_seq.value != '') {
                var valueCustSeq=formObject.act_cust_seq.value;
                formObject.act_cust_seq.value=ComLpad(valueCustSeq,6,"0");
                doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);
            }
            else {
                formObject.cust_nm.value='';
            }
        break;
        default:
            //Validation
            ComChkObjValid(ComGetEvent());
        break;
    }
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
            }
            if(formObject.act_cust_cnt_cd.value == '' || formObject.act_cust_seq.value == ''){
            	formObject.cust_nm.value = '';
            }
        case "act_cust_cnt_cd":
            if(formObject.act_cust_cnt_cd.value == '' || formObject.act_cust_seq.value == ''){
            	formObject.cust_nm.value = '';
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
    var formObject=document.form;
    switch (ComGetEvent("name")) {
        case "from_date":
            var fromDt=ComReplaceStr(ComGetEvent("value"),"-","");
            if (fromDt.length == 8) {
                formObject.to_date.focus();
            }
        break;
        case "date_blank":
            var dateOption=formObject.date_option.value;
            var dtBlank=ComGetEvent("value");
            if (dtBlank == 'blank') {
                if (dateOption == 'I') {
                    formObject.good_flag.focus();
                }
                else {
                    //ar_ofc_cd.focus();
                }
            }
        break;
        case "act_cust_cnt_cd":
            var actCustCntCd=ComReplaceStr(ComGetEvent("value"),"-","");
            if (actCustCntCd.length == 2) {
                formObject.act_cust_seq.focus();
            }
        break;
    }
}
/** 
 * doActionIBSheet<br>
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
function doActionIBSheet(sheetObj,formObj,sAction, CondParam, PageNo) {
    var rtnStr="Delay Time \n"; 
    //try{ 
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)) {
                formObj.f_cmd.value=SEARCH;
                var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
                formObj.office.value=arrStr2[1];
                var dateOption=formObj.date_option.value;
                sheetObjects[0].RemoveAll();
               // ComOpenWait(true);
                formObj.bl_count.value="";
                formObj.usd_total.value="";
                formObj.lcl_total.value="";
                if (formObj.grp_inv_chk.checked) formObj.grp_inv_flg.value = "Y";
                else formObj.grp_inv_flg.value = "N";

                var sXml=sheetObj.GetSearchData("FNS_INV_0031GS.do", FormQueryString(formObj));
                // setting digits
                formObj.dp_prcs_knt_local.value=ComGetEtcData(sXml,"dp_prcs_knt_local");
                formObj.dp_prcs_knt.value=ComGetEtcData(sXml,"dp_prcs_knt");
                var blCount=ComGetEtcData(sXml, "bl_count");
                if (blCount != undefined) {
                    formObj.bl_count.value=ComAddComma(blCount);
                }
                else {
                    formObj.bl_count.value="0";
                }
                var usdTotal=ComGetEtcData(sXml, "usd_total");
                if (usdTotal != undefined) {
                    formObj.usd_total.value=InvMakeNumberFormat(usdTotal, 2); 
                }
                else {
                    formObj.usd_total.value="0";
                }
                var lclTotal=ComGetEtcData(sXml, "lcl_total");
                if (lclTotal != undefined) {
                    formObj.lcl_total.value=InvMakeNumberFormat(lclTotal, formObj.dp_prcs_knt_local.value); 
                }
                else {
                    formObj.lcl_total.value="0";
                }

               // var sheetObj_reset =sheetObjects[0];
                //sheetObjects[0] = sheetObj_reset.Reset();

                //initSheet(sheetObjects[0], 1, dateOption);
                changeHeader(sheetObjects[0], 1, dateOption);
                sheetObj.LoadSearchData(sXml,{Sync:1} );
            }
        break;
        case IBSEARCH_ASYNC10: //AR Office retrieve
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
            formObj.office.value=arrStr2[1];
            formObj.f_cmd.value=SEARCH03;
            var actCustCntCd=formObj.act_cust_cnt_cd.value;
            var actCustSeq=formObj.act_cust_seq.value;
            var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj)+"&cust_cnt_cd="+actCustCntCd+"&cust_seq="+actCustSeq);
            if(CoInvShowXmlMessage(sXml) != "") {
                formObj.cust_seq.value="";
                formObj.cust_nm.value="";
                ComAlertFocus(formObj.cust_seq, CoInvShowXmlMessage(sXml));
            } else {
                var cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
                var delt_flg=ComGetEtcData(sXml,"delt_flg");
                if (cust_nm != undefined && delt_flg != undefined) {
                    formObj.cust_nm.value=cust_nm;
                } else {
                    formObj.cust_seq.value="";
                    formObj.cust_nm.value="";
                }
            }
        break;
    }
   // }catch(e){
   //     alert(rtnStr);
   // } 
}

function changeHeader(sheetObj,sheetNo,headType){
    var formObject=document.form;
    var dpPrcsKntLocal=formObject.dp_prcs_knt_local.value;
    var dpPrcsKnt=formObject.dp_prcs_knt.value;
    var setDpPrcsKnt="";
    if (Number(dpPrcsKntLocal) > Number(dpPrcsKnt)) {
        setDpPrcsKnt=dpPrcsKntLocal;
    }
    else {
        setDpPrcsKnt=dpPrcsKnt;
    }
	 switch(sheetNo) {
     case 1:      //sheet1 init
         with(sheetObj){
         if (setDpPrcsKnt > 0) {
             if (headType == "G") {
            	 HeadTitle="|Seq|Good Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
             }
             else if(headType == "I"){
            	 HeadTitle="|Seq|I/F Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
             }
             else {
            	 HeadTitle="|Seq|Eff. Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
             }
         }  else {
             if (headType == "G") {
            	 HeadTitle="|Seq|Good Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
             }
             else if(headType == "I"){
            	 HeadTitle="|Seq|I/F Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
             }
             else {
            	 HeadTitle="|Seq|Eff. Date|Office|Bound|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|Invoice No.|Group Invoice No.|Credit Agreement No|User ID";
             }
         }

         break;
     	}
	 }
	var headertitleArr = HeadTitle.split("|");
	 for( idx= 0 ; idx < headertitleArr.length-1 ; idx++){
		sheetObj.SetCellValue(0 , idx , headertitleArr[idx] , 0); 
	 }
	
}
function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    ComOpenWait(false);
}

function textarea_write(msg){
    document.form.SEARCH_LOG.value=document.form.SEARCH_LOG.value+"\n"+msg;
}
/**
 * cell click event <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {ibsheet} Row         sheetObj의 선택된 Row
 * @param {ibsheet} Col         sheetObj의 선택된 Col
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 **/
function sheet1_OnDblClick(sheetObj, Row, Col) {
    var formObj=document.form;
    if (Col == '17') {
        ComUserPopup(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "upd_usr_id"));
    }
    else {
        var type=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "type"), " ", "");
        var blSrcNo=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "bl_src_no"), " ", "");
        var arIfNo=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ar_if_no"), " ", "");
        var arOfcCd=ar_ofc_cd.GetSelectText();
        var classId="";
        var param="";
        if (type.substring(0,1) == 'M') {
            if (type == 'MTH') {
                classId="FNS_INV_0022";
                param='?pgmNo=FNS_INV_0022&ar_if_no='+arIfNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId;
                ComOpenWindow('/opuscntr/FNS_INV_0022.do' + param, 'FNS_INV_0022', 'width=1250,height=650');
            }
            else if (type == 'MTM') {
                classId="FNS_INV_0071";
                param='?pgmNo=FNS_INV_0071-01&ar_if_no='+arIfNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId;
                ComOpenWindow('/opuscntr/FNS_INV_0071.do' + param, 'FNS_INV_0071', 'width=1200,height=650');
            }
            else {
                classId="FNS_INV_0011";
                param='?pgmNo=FNS_INV_0011-01&ar_if_no='+arIfNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId;
                ComOpenWindow('/opuscntr/FNS_INV_0011.do' + param, 'FNS_INV_0011', 'width=1200,height=650');
            }
        }
        else {
            classId="FNS_INV_0016";
            param='?pgmNo=FNS_INV_0016-01&bl_src_no='+blSrcNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId;
            ComOpenWindow('/opuscntr/FNS_INV_0016.do' + param, 'FNS_INV_0016', 'width=1200,height=650');
        }
    }
}
/**
 * setting attribute ebable/disable follow retrieve condition<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param   none  
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function date_option_OnChange(value) {
    var formObj=document.form;
    if (value == "G") {
        formObj.good_flag.className="input2";
        formObj.good_flag.value="Y";
        formObj.good_flag.disabled=true;
    }
    else {
        formObj.good_flag.className="input1";
        formObj.good_flag.value="";
        formObj.good_flag.disabled=false;
    }
}
/**
 * function called when  OnMouseMove event <br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param {ibsheet} sheetObj
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */ 
function sheet1_OnMouseMove(sheetObj, Button, Shift, X, Y){
    var Row=sheetObj.MouseRow();
    var Col=sheetObj.MouseCol();
    //make bubble help 
    var sText=sheetObj.GetCellText(Row,Col);
    if(sText != "") {
//no support[check again]CLT            sheetObj.MouseToolTipText=sText;
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
 * @author 박정진
 * @version 2009.05.04
 */
function validateForm(sheetObj,formObj,sAction){
     var arOfcCd=ar_ofc_cd.GetSelectText();

     with(formObj){
         var nextDate="";
         if(((from_date.value == "") && (to_date.value == "")) && (vvd.value == "")) {                   
             ComShowCodeMessage("INV00004");
             from_date.focus();
             return false;
         }
         // ofc_cd is 'ALL' then 10
         if (arOfcCd == 'All') {
             nextDate=ComGetDateAdd(from_date.value, "D", 10);
         }
         //else i month
         else {
             nextDate=ComGetDateAdd(from_date.value, "M", 1);
         }
         if (to_date.value >= nextDate) {
             ComShowCodeMessage("INV00043");
             to_date.focus();
             return false;
         }
         if(rev_tp_cd.text == "") {
             ComShowCodeMessage("INV00004");
             rev_tp_cd.focus();
             return false;
         }
     }
     return true;
}
/** 
 * init UI<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {object} formObj  
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function removeAll(formObj) {
    formObj.reset();
    issue_flag.SetSelectCode("A");
   // rev_tp_cd.SetSelectCode("A");
    bound.SetSelectCode("A");
    inv_clr_flg.SetSelectCode("N");
    sheetObjects[0].RemoveAll();
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC10);
    formObj.from_date.focus();
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
        var ar_ofc_cd_str=arrStr2[1];
        cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);
    }
    cmbObj.InsertItem(0, "ALL", "ALL^");
}
/** 
 * init UI when ar_ofc_cd changed<br>
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
 * @version 2009.12.01
 */
function ar_ofc_cd_OnChange(ar_ofc_cd, oldindex, oldtext, oldcode , newindex, newtext , newcode) {
    var formObject=document.form;
    var expensInfo1=newcode.split("^");
    ComSetObjValue(formObject.office,expensInfo1[1]);
    
}
/** 
 * change select value when rev_tp_cd changed.<br>
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
function rev_tp_cd_OnCheckClick(comboObj, s_index, s_code) {
    if (s_code == "A") {
        if ((comboObj.GetSelectCode()).indexOf("A") >= 0) {
            comboObj.SetSelectCode("B", false);
            comboObj.SetSelectCode("C", false);
            comboObj.SetSelectCode("M", false);
        
//            comboObj.CheckCode("B")=false;
//            comboObj.CheckCode("C")=false;
//            comboObj.CheckCode("M")=false;
        
        }
    } else {
        if ((comboObj.GetSelectCode()).indexOf("A") >= 0) {
            comboObj.SetSelectCode("A", false);
            
//            comboObj.CheckCode("A")=false;
            
        }
    }
}
/** 
 * handling popup (FNS_INV_0013) <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {array} rowArray  
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function getFNS_INV_0013() {
}
/** 
 * handling popup (COM_ENS_051_1)<br>
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
 * handling popup (COM_ENS_0L1_1)<br>
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
    document.all.scope.value=colArray[3];
}
/** 
 * handling popup (FNS_INV_0086)<br>
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
  * setting Rev Source value when Rev Type changed<br>
  * <br><b>Example :</b>
  * <pre>
  * </pre>
  * @param  {object} thisObj 
  * @return none
  * @see #
  * @author 한동훈
  * @version 2009.10.19
  */
 function doChange(thisObj){
    var val=thisObj.options[thisObj.selectedIndex].value;
    var targetE=rev_src_cd;
    targetE.RemoveAll();
    targetE.SetMultiSelect(1);
    targetE.SetColAlign(0, "left");
    targetE.SetMultiSeparator(",");
    targetE.SetDropHeight(190);
    targetE.InsertItem(0, "ALL",        "");
    if(val == 'B'){
        targetE.InsertItem(1, "BBL",    "BL");
        targetE.InsertItem(2, "BCS",    "CS");
        targetE.InsertItem(3, "BCC",    "CC");      
    }else if(val == 'C'){
        targetE.InsertItem(1, "CCA",    "CA");
        targetE.InsertItem(2, "CCC",    "CC");
    }else if(val == 'M'){
        targetE.InsertItem(1, "MIV",    "IV");
        targetE.InsertItem(2, "MIC",    "IC");
        targetE.InsertItem(3, "MDM",    "DM");
        targetE.InsertItem(4, "MDT",    "DT");
        targetE.InsertItem(5, "MRD",    "RD");
        targetE.InsertItem(6, "MTH",    "TH");
        targetE.InsertItem(7, "MTP",    "TP");
        targetE.InsertItem(8, "MLS",    "LS");
        targetE.InsertItem(9, "MOC",    "OC");
        targetE.InsertItem(10,"MOS",    "OS");
    }
    targetE.SetSelectText("ALL");
}
  /** 
 * change select value when rev_src_cd changed.<br>
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
/*function rev_src_cd_OnCheckClick(comboObj, s_index, s_code) {
    //alert(comboObj+":"+s_index+":"+s_code);
    if(s_code == ""){
        if(comboObj.GetItemCheck("") == true){
            comboObj.SetItemCheck("BL",false);
            comboObj.SetItemCheck("CS",false);
            comboObj.SetItemCheck("CC",false);
            comboObj.SetItemCheck("CA",false);
            comboObj.SetItemCheck("CC",false);
            comboObj.SetItemCheck("IV",false);
            comboObj.SetItemCheck("IC",false);
            comboObj.SetItemCheck("CT",false);
            comboObj.SetItemCheck("OC",false);
            comboObj.SetItemCheck("EQ",false);
            comboObj.SetItemCheck("TS",false);
            comboObj.SetItemCheck("DM",false);
            comboObj.SetItemCheck("DT",false);
            comboObj.SetItemCheck("RD",false);
            comboObj.SetItemCheck("TH",false);
            comboObj.SetItemCheck("TP",false);
            comboObj.SetItemCheck("TM",false);
            comboObj.SetItemCheck("TN",false);
            comboObj.SetItemCheck("WC",false);
            comboObj.SetItemCheck("LS",false);
            comboObj.SetItemCheck("DO",false);
        }
    }else{
        comboObj.SetItemCheck("",false);
    }
}*/

var selComboIndex, selComboCode;

function rev_src_cd_OnSelect(comboObj ,index, text , code) {
	selComboIndex = index;
	selComboCode = code;
}

function rev_src_cd_OnChange(comboObj) {
    ComSetMultiCombo(comboObj, selComboIndex, selComboCode);
}

/** 
* delete combobox value. <br>
* <br><b>Example :</b>
* <pre>
* </pre>
* @param  {object} e 
* @return none
* @see #
* @author 한동훈
* @version 2009.10.19
*/
function removeCombo(e){
    for(var i=0, limit=e.options.length; i < limit - 1; ++i){
        e.remove(1);
    }
}
/** 
  * setting combobox value. <br>
  * <br><b>Example :</b>
  * <pre>
  * </pre>
  * @param  {String} text 
  * @param  {String} value
  * @param  {object} e
  * @return none
  * @see #
  * @author 한동훈
  * @version 2009.10.19
  */
 function addOption(text,value, e){
    var o=new Option(text,value);
    try{
        e.add(o);
    }catch(ee){
        e.add(o, null);
    }
}
 
 function resizeSheet(){
		ComResizeSheet(sheetObjects[0],100);
}
