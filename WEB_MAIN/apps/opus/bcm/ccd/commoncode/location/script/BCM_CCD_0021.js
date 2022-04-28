/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0021.js
*@FileTitle  : zone
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/03
=========================================================*/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
 function processButtonClick(){
     /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject1=sheetObjects[0];
       /*******************************************************/
    var formObject=document.form;
    var srcName=ComGetEvent("name");
    if(ComGetBtnDisable(srcName)) return false;
    
    try {
        var srcName=ComGetEvent("name");
          switch(srcName) {
                case "btn_Retrieve":
                    doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    break;
                case "btn_New":
                    doActionIBSheet(sheetObject1, formObject, IBCLEAR);
                    break;
                case "btn_Save":
                    doActionIBSheet(sheetObject1, formObject, IBSAVE);
                    break;
                case "btn_Close":
                    ComClosePopup(); 
                    break;
                case "btn_Request":
                    doActionIBSheet(sheetObjects[0], document.form, MULTI03); 
                    break;
                case "btns_search1":
                    var formObj=document.form;
                    var sUrl="/opuscntr/COM_ENS_061.do?mdm_yn="+formObj.mdm_yn.value+"node_cd=" + formObj.rep_yd_cd.value +"&main_page=&mode=yard&mode_only=Y";
                    var rVal=ComOpenPopup(sUrl, 800, 530, "ydCodeHelp", "0,0", true);
                    break;
                case "btns_search2":
                    var formObj=document.form;
                    var sUrl="/opuscntr/COM_ENS_061.do?node_cd=" + formObj.zn_cd.value +"&main_page=&mode=zone&mode_only=Y&mdm_yn="+ formObj.mdm_yn.value;
                    var rVal=ComOpenPopup(sUrl, 800, 530, "znCodeHelp", "0,0", true);
                    break;
                case "btn_RowAdd":
                    addRow();
                    break;
                case "btn_RowDelete":
                    deleteRow();
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
  * registering IBSheet Object as list
  * adding process for list in case of needing batch processing with other items 
  * defining list on the top of source
  */
  function setSheetObject(sheet_obj){
     sheetObjects[sheetCnt++]=sheet_obj;
  }
    /**
     * registering IBCombo Object as list
     * adding process for list in case of needing batch processing with other items 
     * defining list on the top of source
     */
   function setComboObject(combo_obj) {  
    comboObjects[comboCnt++]=combo_obj;  
   }
   /**
    * setting sheet initial values and header
    * param : sheetObj, sheetNo
    * adding case as numbers of counting sheets
    */                
  function loadPage() {
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
        }
    for(var k=0;k<comboObjects.length;k++){
        initCombo(comboObjects[k],k+1);
    }
    initControl();
    document.form.ibflag.value="I";
    doActionIBCombo(sheetObjects[0], document.form, SEARCH01);
    ComBtnDisable("btn_RowAdd");
    ComBtnDisable("btn_RowDelete");
    var formObj=document.form;
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObjects[0], formObj, SEARCH10);
    var authTpCd=G_AHTU_TP_CD;
    var rqstNo=formObj.rqst_no.value;
    if(G_MDAA_CHK == 'Y')
        ComEnableObject(formObj.delt_flg, true); 
    else
        ComEnableObject(formObj.delt_flg, false); 
    // If the Process Status screen call, in the Detail PopUp
    if(rqstNo != '') {
        doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        ComSetDisplay('btn_Close', true);
        var procTpCd=formObj.proc_tp_cd.value;
        var rqstUsrChk=formObj.rqst_usr_chk.value;
        ComEnableObject(formObj.btns_search2, false);
        // Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
        if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S') && rqstUsrChk == 'Y') || G_MDAA_CHK == 'Y') ) {
            ComSetDisplay('btn_Request', true);
            ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
            ComSetDisplay('btn_Retrieve', true);
            ComSetDisplay('btn_Save', true);
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        } else if(procTpCd == 'A') {
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
            ComEnableObject(formObj.btns_search2, false);
        } else {
            doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        }
    } else {
        ComSetDisplay('btn_Retrieve', true);
        // MDM Authority is not Approval('A') or MDDA
        if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
            ComSetDisplay('btn_New', true);
            ComSetDisplay('btn_Save', true);
        } else {
            //General User if you do not have MDM Authority
            ComSetDisplay('btn_New', true);
        }
    }
  }
  /**
   *Define an event control
   */
  function initControl() {
    var formObj=document.form;
    //axon_event.addListenerForm('focus', 'obj_focus', formObj);
//      axon_event.addListenerFormat ('keypress', 'obj_keypress', form);
//      axon_event.addListenerForm  ('change', 'obj_change', form);
//      axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form);     //- focust out "
//      ComClearSeparator (document.form.zn_cd,"eng"); //Only English 
//    ComClearSeparator (document.form.zn_nm,"eng"); //Only English
//    ComClearSeparator (document.form.cgo_hndl_tm_hrs,"eng"); //Only English
//    ComClearSeparator (document.form.rep_yd_cd,"eng"); //Only English
  }
   /**
    * The default setting Combo
    * If the number of combo a combo by adding the number of case sheets to initialize the module configuration. 
    */ 
   function initCombo(comboObj, comboNo) {
    var formObject=document.form;
    switch(comboObj.options.id) {  
        case "dist_ut_cd":      //Yard Character
            with (comboObj) { 
                SetMultiSelect(0);
                SetUseAutoComplete(1);                 
                SetColAlign(0, "left");
                SetColWidth(0, "100");
                SetDropHeight(100);
                SetMaxLength(2);
            }
        break;
    }
   }
   /**
    * The initial setting sheet, Header definition
    * param : sheetObj ==> sheet object, sheetNo ==> Sheet object ID of the tag attached to the serial number
    * If the number of seats a case by adding the number of sheets sheets should initialize the module configuration
    */
   function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        var sheetID=sheetObj.id;
        switch(sheetID) {
        case "sheet1":      //sheet1 init
            with(sheetObj){ 
                    var HeadTitle="|Del|Seq|znseq|Postal Code|District|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time";
                    var headCount=ComCountHeadTitle(HeadTitle);
                    var prefix="sheet1_";
                    
                    SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
                    
                    var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                    var headers = [ { Text:HeadTitle, Align:"Center"} ];
                    InitHeaders(headers, info);
                    
                    var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del" },
                     {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"seq" },
                     {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"zn_seq",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                     {Type:"Text",      Hidden:0,  Width:350,  Align:"Center",  ColMerge:1,   SaveName:prefix+"zip_cd",   KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10 },
                     {Type:"Text",      Hidden:0,  Width:350,  Align:"Left",    ColMerge:1,   SaveName:prefix+"dstr_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
                     {Type:"Combo",     Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"delt_flg", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:80,  Align:"Center",    ColMerge:1,   SaveName:prefix+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",    ColMerge:1,   SaveName:prefix+"cre_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",    ColMerge:1,   SaveName:prefix+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Date",      Hidden:0,  Width:150,  Align:"Center",    ColMerge:1,   SaveName:prefix+"upd_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                     {Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"flg",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
                     
                    InitColumns(cols);
                    
                    SetEditable(1);
                    SetColProperty("sheet1_delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
                    SetSheetHeight(375);                
            }
            break;
       }
   }
    /**
     * All the combo box query
     */
    function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
        switch (sAction) {
            case SEARCH01: // load page
                var sXml=sheetObj.GetSearchData("BCM_CCD_0021GS.do", "f_cmd=" + SEARCH01);
                var rtnValue=sXml.split("|$$|");
                for(var i=0; i<rtnValue.length; i++){
                    var comboXml=ComXml2ComboString(rtnValue[i], "cd_desc", "cd");
                    if(comboXml!=null){
                        var cdName=comboXml[0].split("|");
                        var cdValue=comboXml[1].split("|");
                        for (var j=0; j < cdName.length; j++) {
                            comboObjects[i].InsertItem(j, cdName[j], cdValue[j]);
                        }
                    }
                }
            break;
        }
    }
 //Sheet processing-related processes
   function doActionIBSheet(sheetObj,formObj,sAction) {
       var prefix="sheet1_";
       switch(sAction) {
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                if( formObj.rqst_no.value == ''){
                    formObj.f_cmd.value=SEARCH;
                }else{
                    formObj.f_cmd.value=SEARCH05;
                }
                var zn_cd=formObj.zn_cd.value;
                var sParam=FormQueryString(formObj);
                var prefixArr=new Array("", prefix);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0021GS.do", sParam + "&" + ComGetPrefixParam(prefixArr));              
                var rtnValue=sXml.split("|$$|");                
                var sav=ComGetEtcData(rtnValue[0], "TRANS_RESULT_KEY");
                var rqstNo=ComGetEtcData(rtnValue[0], "RQST_NO");
                ComSetObjValue(formObj.rqst_no, rqstNo);
                if(sav != "S" ){
                    return;
                }

                if(ComXmlString(rtnValue[0], "delt_flg") == null || ComXmlString(rtnValue[0], "delt_flg") == ""){
                //if(v_delt_jflg == ""){
                    formObj.reset();
                    formObj.creflag.value="Y";
                    formObj.zn_cd.value=zn_cd;
                    formObj.dist_ut_cd.text="";
                    formObj.ibflag.value="I"
                    if(G_AHTU_TP_CD=="A"){
                        ComShowCodeMessage("CCD00033", "Zone Code");
                        doActionIBSheet(sheetObj, formObj, IBCLEAR);
                    }else{
                        if(!ComShowConfirm(ComGetMsg("CCD00034", "Zone Code"))){
                            doActionIBSheet(sheetObj, formObj, IBCLEAR);
                        }
                    }
                }else{
                    formObj.creflag.value="N";
                    formObj.zn_cd.value=ComXmlString(rtnValue[0], "zn_cd");
                    formObj.zn_nm.value=ComXmlString(rtnValue[0], "zn_nm");
                    formObj.cgo_hndl_tm_hrs.value=ComXmlString(rtnValue[0], "cgo_hndl_tm_hrs");
                    formObj.tztm_hrs.value=ComXmlString(rtnValue[0], "tztm_hrs");
                    formObj.rep_yd_cd.value=ComXmlString(rtnValue[0], "rep_yd_cd");
                    formObj.lnk_dist.value=ComXmlString(rtnValue[0], "lnk_dist");                   
                    formObj.delt_flg.value=ComXmlString(rtnValue[0], "delt_flg");
                    dist_ut_cd.SetSelectCode(ComXmlString(rtnValue[0], "dist_ut_cd"));
                    formObj.ibflag.value="U";
                    formObj.zn_cd.readOnly=true;
                    sheetObj.LoadSearchData(rtnValue[1],{Sync:1} );
                    formObj.tztm_hrs.value=ComAddComma2(formObj.tztm_hrs.value ,"#,###.00");
                    formObj.lnk_dist.value=ComAddComma2(formObj.lnk_dist.value ,"#,###");
                    formObj.cre_usr_id.value=ComXmlString(rtnValue[0], "cre_usr_id");
                    formObj.cre_dt.value=ComXmlString(rtnValue[0], "cre_dt");
                    formObj.upd_usr_id.value=ComXmlString(rtnValue[0], "upd_usr_id");
                    formObj.upd_dt.value=ComXmlString(rtnValue[0], "upd_dt");
                }
                ComBtnEnable("btn_RowAdd");
                ComBtnEnable("btn_RowDelete");
            }
        break;
        case IBSAVE:
            if(validateForm(sheetObj,formObj,sAction)){
                if( formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                    formObj.f_cmd.value=MULTI;
                }else{
                    formObj.f_cmd.value=MULTI01;
                    ComEnableObject(formObj.btns_search2, false);
                }
                var sParam=FormQueryString(formObj);
                var tmpMsg="";
                if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                    tmpMsg="CCD00035";
                }else{
                    tmpMsg="COM130101";
                }
                if(ComShowCodeConfirm(tmpMsg, "Data")){
                    var sParam=FormQueryString(formObj);
                    sParam += "&" + sheetObj.GetSaveString(false, true, prefix+"ibflag");
                    var sXml=sheetObj.GetSaveData("BCM_CCD_0021GS.do", sParam);
                    var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                    if(result != "F"){
                        if(formObj.creflag.value != "N" && formObj.rqst_no.value == ''){
                            ComShowCodeMessage("CCD00031");
                        } else {
                            ComShowCodeMessage("COM130102", "Data");
                        }
                    }else{
                        ComShowCodeMessage("COM130103", "Data");
                    }
                    var rqstNo=ComGetEtcData(sXml, "RQST_NO");
                    ComSetObjValue(formObj.rqst_no, rqstNo);
                    doActionIBSheet(sheetObj, formObj, IBSEARCH);
                }
            }
        break;
        case SEARCH02:      //Rep.CY check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH02;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0021GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Rep.CY Code");
                    formObj.rep_yd_cd.value="";
                    formObj.rep_yd_cd.focus();
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH10: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=ZONE';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            // global var sestting
            G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
            G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
            break;
        case MULTI03:   // Request
            if (!ComShowCodeConfirm("CCD00030")) {
                return;
            }
        var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&rqst_ofc_cd=' + ComGetObjValue(formObj.rqst_ofc_cd) + '&proc_tp_cd=O';
            var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
            var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
            if(sav == "S"  ){
                ComShowCodeMessage("CCD00031");
                ComPopUpReturnValue("Y");
                ComClosePopup(); 
            } else {
                ComShowCodeMessage("COM130103", "Data");
            }
            break;
        case IBCLEAR:
            clearAllData(sheetObj, formObj);
            ComEnableObject(formObj.btns_search2, true);
            break;
       }
   }
   /**
    * handling process for input validation
    */
   function validateForm(sheetObj,formObj,sAction){
    switch(sAction) {
        case IBSEARCH:      //retrieve
            if( formObj.rqst_no.value == ''){
                if(formObj.zn_cd.value == ""){
                    ComShowCodeMessage("CCD00001", "Zone Code");
                    formObj.zn_cd.focus();
                    return false;
                }
            }
            break;
        case IBSAVE:        //save
            if(formObj.zn_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Zone Code");
                formObj.zn_cd.focus();
                return false;
            }else if(formObj.zn_nm.value == ""){
                ComShowCodeMessage("CCD00001", "Zone Name");
                formObj.zn_nm.focus();
                return false;
            }else if(formObj.cgo_hndl_tm_hrs.value == ""){
                ComShowCodeMessage("CCD00001", "Cargo Handling Time(Hours)");
                formObj.cgo_hndl_tm_hrs.focus();
                return false;
            }else if(formObj.tztm_hrs.value == ""){
                ComShowCodeMessage("CCD00001", "Transit Time(Hours)");
                formObj.tztm_hrs.focus();
                return false;
            }else if(formObj.rep_yd_cd.value == ""){
                ComShowCodeMessage("CCD00001", "Rep.CY");
                formObj.rep_yd_cd.focus();
                return false;
            }
            // 중복 row check
            for (var i=1; i<=sheetObj.RowCount(); i++) {
                var cd=sheetObj.GetCellValue(i,"sheet1_zip_cd");
                 if (cd ==""){
                    ComShowCodeMessage("CCD00001", "Postal Code");
                    sheetObj.SelectCell(i,3);
                    return false;
                 }
                 for (var j=1; j<=sheetObj.RowCount(); j++) {
                     var cdj=sheetObj.GetCellValue(j,"sheet1_zip_cd");
                    if (j != i && cd == cdj) {
                        ComShowCodeMessage("CCD00004", cd);
                        sheetObj.SelectCell(i,3);
                        return false;
                    }
                }
            }   
            //remove comma              
            delComma(document.form.tztm_hrs);
            delComma(document.form.lnk_dist);
            break;
    }
       return true;
   }
    function delComma(obj){
        if(!obj) return;
        obj.value=obj.value.replace(",","");
    }
    /**
     *If the data field to be the CHANGE Event
     */
    function obj_change(){
        var formObject=document.form;
        /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
        var sheetObject1=sheetObjects[0];
        /*******************************************************/
        try {
            var srcName=ComGetEvent("name");
            switch(srcName) {
                case "zn_cd":
                    if(formObject.zn_cd.value.length>0){
                        doActionIBSheet(sheetObject1, formObject, IBSEARCH);
                    }
                break;
                case "rep_yd_cd":
                    if(formObject.rep_yd_cd.value.length>0){
                        doActionIBSheet(sheetObject1, formObject, SEARCH02);
                    }
                break;
                case "delt_flg" :
                    if(formObject.delt_flg.value == "Y") {
                        if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
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
     /*
      * 
      */
     function clearAllData(sheetObj, formObj){
        formObj.reset();
        formObj.rqst_no.value="";
        formObj.dist_ut_cd.text="";
        formObj.delt_flg.value="N";
        formObj.ibflag.value="I";
        formObj.zn_cd.readOnly=false;
        sheetObjects[0].RemoveAll();
        ComBtnDisable("btn_RowAdd");
        ComBtnDisable("btn_RowDelete");
     }
     function ydCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];   
        formObj.rep_yd_cd.value=colArray[3];
     }
     function znCodeHelp(rowArray) {
        var formObj=document.form;
        var colArray=rowArray[0];        
        if(rowArray != "") {
        	formObj.zn_cd.value=colArray[3];
        } else {
        	formObj.zn_cd.value="Node Code";
        }    
        if(formObj.zn_cd.value.length>0){    	
        	doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
        }
     }
    /**
     * sheet1 add row
     */
    function addRow() {
        with (sheetObjects[0]) {
            var nowRow=GetSelectRow();
            var prefix="sheet1_";
            nowRow=DataInsert(-1);
            SetCellValue(nowRow, prefix+"delt_flg","N",0);
            SetCellValue(nowRow, prefix+"flg","Y",0);
            SetCellValue(nowRow, prefix+"zn_seq",GetCellValue(nowRow, prefix+"seq"),0);
            return true;
        }
    }
     /**
      * sheet1 delete row
      */
    function deleteRow() {
        with (sheetObjects[0]) {
            var prefix="sheet1_";
            var sRowStr=FindCheckedRow(prefix+"del");
            var arr=sRowStr.split("|");
            for (var i=0; i<arr.length; i++) {
                if (GetCellValue(arr[i], prefix+"flg") == "Y") {
                    RowDelete(arr[i]);
                }else{
                    SetRowStatus(arr[i],"D");
                    SetRowHidden(arr[i],1);
                }
            }
        }         
    }
//   function getValueForCombo(obj) {
//        if (Object.prototype.toString.call(obj) === '[object Array]') {
//            var str = obj[0];
//            return str.split('|')[0];
//        }
//        return obj;
//    }         
    function sheet1_OnSort(sheetObj ,Col, SortArrow){
    	sheetObj.ReNumberSeq();   
    }
