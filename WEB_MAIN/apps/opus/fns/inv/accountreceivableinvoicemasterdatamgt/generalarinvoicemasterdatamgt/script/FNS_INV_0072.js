/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0072.js
*@FileTitle  : Cut-off VVD Entry for New A/R Office
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/30
=========================================================*/
// Common variables.
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
* @version 2009.10.19
*/
function processButtonClick(){
     /***** Setting each tab's sheet variable. *****/
     var sheetObject1=sheetObjects[0];
     /*******************************************************/
     var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
       switch(srcName) {
            case "btn_RowAdd":
                doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
                break;
            case "btn_RowCopy":
                var index=sheetObjects[0].DataCopy();
                rowCopy(index, true);
                break;
            case "btn_Delete":
                if(!validateForm(sheetObjects[0],formObject,IBDELETE)) {
                    return false;
                }
                ComRowHideDelete(sheetObjects[0], "DelChk");
                break;
            case "btn_Retrieve":
                doActionIBSheet(sheetObjects[0],formObject,IBSEARCH);
                break;
            case "btn_Save":
                doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
                break;
            case "btn_New":
                ComResetAll();
                doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
                break;
            case "btn_DownExcel":
                if(sheetObjects[0].RowCount() < 1){//no data
                    ComShowCodeMessage("COM132501");
                }else{
                    sheetObjects[0].Down2Excel({KeyFieldMark :false,HiddenColumn:0,TreeLevel:false,DownCols:"2|3|4|5|6|7|8|9|10|14|15",AutoSizeColumn:true});
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
 * @author 
 * @version 2009.10.19
 */
function setSheetObject(sheet_obj){
   sheetObjects[sheetCnt++]=sheet_obj;
}

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
 * @author 
 * @version 2009.10.19
 */
function loadPage() {
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    // Initialize IBMultiCombo.
    for(var k=0; k<comboObjects.length; k++){
        initCombo(comboObjects[k],k+1);
    }
    sheet1OnLoadFinish(sheetObjects[0]);
}
/** 
* Coding event for OnLoadFinish.<br>
* <br><b>Example :</b>
* <pre>
* </pre>
  * @param {ibsheet} sheetObj required IBSheet Object        
  * @return none.
  * @see #
  * @author 
  * @version 2009.10.19
  */    
function sheet1OnLoadFinish(sheetObj){
    sheetObjects[0].SetWaitImageVisible(0);
    doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC10);
    ComSetFocus(old_ar_ofc_cd2);
    sheetObjects[0].SetWaitImageVisible(1);
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
    switch (comboObj.id) {
        case "old_ar_ofc_cd2":
            with (comboObj) {
                SetMaxLength(6);
            }
            break;
        case "new_ar_ofc_cd2":
            with (comboObj) {
                SetMaxLength(6);
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
 * @author 
 * @version 2009.10.19
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var sheetID=sheetObj.id;
    switch(sheetID) {
         case "sheet1":
            with(sheetObj){
                var HeadTitle1="|Sel|Basis Date|Bound|Lane|Port|VVD|Date|Description|User ID|Updated Date|vsl_cd|skd_voy_no|skd_dir_cd|Old ArOfcCd|New ArOfcCd";
                var headCount=ComCountHeadTitle(HeadTitle1);
                var rowCnt=0;
                
                SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:00,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
                            {Type:"DummyCheck", Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"DelChk" },
                            {Type:"Combo",     Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:"cut_off_aply_dt_tp_cd",  KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"S/ADate|I/FDate", ComboCode:"S|I" },
                            {Type:"Combo",     Hidden:0, Width:100,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",              KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1, ComboText:"O/B|I/B", ComboCode:"O|I" },
                            {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"slan_cd",                KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3 },
                            {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"port_cd",                KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:5 },
                            {Type:"Text",      Hidden:0,  Width:130,   Align:"Center",  ColMerge:0,   SaveName:"vvd_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:9 },
                            {Type:"PopupEdit", Hidden:0, Width:130,  Align:"Center",  ColMerge:0,   SaveName:"aply_dt",                KeyField:1,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                            {Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:0,   SaveName:"ofc_rmk",                KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:100 },
                            {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",  ColMerge:0,   SaveName:"upd_dt",                 KeyField:0,   CalcLogic:"",   Format:"Ymd",         PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"vsl_cd",                 KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
                            {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"skd_voy_no",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
                            {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"skd_dir_cd",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
                            {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"old_ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 },
                            {Type:"Text",      Hidden:1, Width:70,   Align:"Center",  ColMerge:0,   SaveName:"new_ar_ofc_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0 } ];

                InitColumns(cols);                
                SetEditable(1);
                SetColProperty(0 ,"slan_cd"   , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0 ,"port_cd"   , {AcceptKeys:"E"   , InputCaseSensitive:1});
                SetColProperty(0 ,"vvd_cd"    , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                //PopupImage="img/btns_calendar.gif";
                SetShowButtonImage(2);
//                SetSheetHeight(450);
                resizeSheet();
            }
            break;
    }
}
/** 
 * Coding retrieve, save... <br>
 * <br><b>Example :</b>
 * <pre>
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
function doActionIBSheet(sheetObj,formObj,sAction, Row, Col, Val) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
           case IBSEARCH_ASYNC10: //CreditCustomer Office retrieve
                var cmbObj=old_ar_ofc_cd2;
                var cmbObj2=new_ar_ofc_cd2;
                formObj.f_cmd.value=SEARCH04;
                var sXml=sheetObj.GetSearchData("FNS_INV_0072GS.do", FormQueryString(formObj));
                var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
                var arrStr=sStr.split("|");
                MakeComboObject_OfcCd2(cmbObj, arrStr, "N");
                MakeComboObject_OfcCd2(cmbObj2, arrStr, "N");
                var arrStr2=arrStr[1].split("^");
                var ar_ofc_cd=arrStr2[1];
                cmbObj.SetDropHeight(190);
                cmbObj2.SetDropHeight(190);
            break;
          case IBSEARCH:      //retrieve
           if(!validateForm(sheetObj,formObj,sAction)) return;
            if (sheetObj.id == "sheet1") {                      
                formObj.f_cmd.value=SEARCH;
                    formObj.old_ar_ofc_cd.value=old_ar_ofc_cd2.GetSelectText();
                    formObj.new_ar_ofc_cd.value=new_ar_ofc_cd2.GetSelectText();
                    sheetObj.DoSearch("FNS_INV_0072GS.do", FormQueryString(formObj) );
            }
            for (var i=1; i<=sheetObj.RowCount(); i++) {
                rowCopy(i, false);
            }
                break;
          case IBSAVE:        //save
            if(!validateForm(sheetObj,formObj,sAction)) return;
            if(sheetObj.RowCount()== 0) return;
            formObj.f_cmd.value=MULTI;                  
            var sParam=ComGetSaveString(sheetObjects);
            if (sheetObj.IsDataModified()&& sParam == "") return;
                sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
                var SaveXml=sheetObj.GetSaveData("FNS_INV_0072GS.do", sParam );
                sheetObj.LoadSaveData(SaveXml);
            if (SaveXml.indexOf(">OK<") > -1){
                for (var i=1; i<=sheetObj.RowCount(); i++) {
                    rowCopy(i, false);
                }
                doActionIBSheet(sheetObj,formObj,IBSEARCH);
            }
            break;
            case IBINSERT:      // input
                if(!validateForm(sheetObj,formObj,sAction)) return;
                var sheetIdx=sheetObj.DataInsert(-1);
                sheetObj.SetCellValue(sheetIdx,"old_ar_ofc_cd",old_ar_ofc_cd2.GetSelectText(),0);
                sheetObj.SetCellValue(sheetIdx,"new_ar_ofc_cd",new_ar_ofc_cd2.GetSelectText(),0);
                BasesDate_change(sheetObj,sheetIdx,Col,"S");
                break;
            case IBSEARCH_ASYNC01:      //retrieve  
                if(Val != ""){
                    formObj.f_cmd.value=SEARCH01;                   
                    var sXml=sheetObj.GetSearchData("FNS_INV_0072GS.do", FormQueryString(formObj));
                    var arrXml=sXml.split("|$$|");
                    var dataVal=ComGetEtcData(arrXml[0],"dataVal");
                    if(dataVal == ""){                                              
                        ComShowCodeMessage("INV00041","["+Val+"]");
                        //alert(Row+"----"+Col);
                        var selCol=sheetObj.GetSelectCol()
                        sheetObj.SelectCell(Row, Col);
                    }                       
                }
                break; 
            case IBSEARCH_ASYNC02:      //retrieve      
                if(Val != ""){
                    formObj.f_cmd.value=SEARCH02;                   
                    var sXml=sheetObj.GetSearchData("FNS_INV_0072GS.do", FormQueryString(formObj));
                    var arrXml=sXml.split("|$$|");
                    var dataVal=ComGetEtcData(arrXml[0],"dataVal");
                    if(dataVal == ""){
                        ComShowCodeMessage("INV00041","["+Val+"]");
                        sheetObj.SelectCell(Row, Col);
                    }
                }
                break; 
            case IBSEARCH_ASYNC03:      //retrieve  
                if(Val != ""){                      
                    formObj.f_cmd.value=SEARCH03;                   
                    var sXml=sheetObj.GetSearchData("FNS_INV_0072GS.do", FormQueryString(formObj));
                    var arrXml=sXml.split("|$$|");
                    var dataVal=ComGetEtcData(arrXml[0],"dataVal");                     
                    if(dataVal == ""){
                        ComShowCodeMessage("INV00041","["+Val+"]");
                        sheetObj.SelectCell(Row, Col);
                    }else{
                        var saDate=ComGetEtcData(arrXml[0],"saDate");
                        sheetObj.SetCellValue(Row, 'aply_dt',saDate);
                        if(saDate == ""){
                            ComShowCodeMessage("INV00011");
                            sheetObj.SelectCell(Row, 'aply_dt');
                        }
                    }   
                }   
                break;      
    }
}     
/** 
 * Setting attribute to editable. <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {int} sheetIdx   
 * @param  {boolean} state 
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function rowCopy(sheetIdx, state){
    sheetObjects[0].SetCellEditable(sheetIdx,'io_bnd_cd',state);
    sheetObjects[0].SetCellEditable(sheetIdx,'slan_cd',state);
    sheetObjects[0].SetCellEditable(sheetIdx,'port_cd',state);
    sheetObjects[0].SetCellEditable(sheetIdx,'vvd_cd',state);
    sheetObjects[0].SetCellEditable(sheetIdx,'cut_off_aply_dt_tp_cd',state);
    sheetObjects[0].SetCellEditable(sheetIdx,'aply_dt',state);
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
    case IBSEARCH:
            if (old_ar_ofc_cd2.GetSelectText() == "") {
                ComShowCodeMessage('INV00004');
                ComSetFocus(old_ar_ofc_cd2);
                return false;
            }
            if (new_ar_ofc_cd2.GetSelectText() == "") {
                ComShowCodeMessage('INV00004');
                ComSetFocus(new_ar_ofc_cd2);
                return false;
            }
            break;
    case IBSAVE:
        if (old_ar_ofc_cd2.GetSelectText() == "") {
                ComShowCodeMessage('INV00004');
            ComSetFocus(old_ar_ofc_cd2);
                return false;
            }
            if (new_ar_ofc_cd2.GetSelectText() == "") {
                ComShowCodeMessage('INV00004');
            ComSetFocus(new_ar_ofc_cd2);
                return false;
            }
        if (old_ar_ofc_cd2.GetSelectText() == new_ar_ofc_cd2.GetSelectText()){
            ComShowCodeMessage('INV00058');
            ComSetFocus(old_ar_ofc_cd2);
                return false;
        }               
            break;  
    case IBINSERT:
        if (old_ar_ofc_cd2.GetSelectText() == "") {
            ComShowCodeMessage('INV00004');
            ComSetFocus(old_ar_ofc_cd2);
            return false;
        }
        if (new_ar_ofc_cd2.GetSelectText() == "") {
            ComShowCodeMessage('INV00004');
            ComSetFocus(new_ar_ofc_cd2);
            return false;
        }
        if (old_ar_ofc_cd2.GetSelectText() == new_ar_ofc_cd2.GetSelectText()){
            ComShowCodeMessage('INV00058');
            ComSetFocus(old_ar_ofc_cd2);
            return false;
        }               
            break;
    case IBDELETE:
        if (sheetObj.CheckedRows("DelChk") == 0) {
            ComShowMessage(msgs["INV00025"]);
            return false;
        } else if (sheetObj.CheckedRows("DelChk") > 0) {
            if(!ComShowCodeConfirm("INV00028")) return;
        }
        break;
 }
    return true;
}
/** 
 * Coding event for OnChange<br>
 *  
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
function old_ar_ofc_cd2_OnChange(comboObj, OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
    var formObject = old_ar_ofc_cd2;
    var ar_ofc_cd2 = old_ar_ofc_cd2.GetSelectText();
    if(ar_ofc_cd2 != ""){
        old_ar_ofc_cd2.SetSelectText(ar_ofc_cd2.toUpperCase()); 
        if(!ar_ofc_cd_chk(old_ar_ofc_cd2)){
            //ComSetFocus(old_ar_ofc_cd2);
            //old_ar_ofc_cd2.focus();
            old_ar_ofc_cd2.SetSelectText("");
            return;
        }
    }
}
/** 
 * Coding event for OnChange.<br> 
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
function new_ar_ofc_cd2_OnChange(comboObj,OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
    var formObject = new_ar_ofc_cd2;
    var ar_ofc_cd2 = new_ar_ofc_cd2.GetSelectText();
    if(ar_ofc_cd2 != ""){
        new_ar_ofc_cd2.SetSelectText(ar_ofc_cd2.toUpperCase()); 

        if(!ar_ofc_cd_chk(new_ar_ofc_cd2)){
            //ComSetFocus(formObject);
            //formObject.focus();
            new_ar_ofc_cd2.SetSelectText("");
            return;
        }
    }
}
/** 
 * Coding event for validate.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {object} obj : form object.
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */ 
function ar_ofc_cd_chk(obj){
    var formObject=document.form;
    var ar_ofc_cd_all=formObject.ar_ofc_cd_all.value;
    var arrStrChg = ar_ofc_cd_all.split("|");
    var arrStrChg_gb="N";
    for (var i=1; i < arrStrChg.length;i++ ) {
        if(arrStrChg[i] == obj.GetSelectText()){
            arrStrChg_gb="Y";
        }
    }
    if(arrStrChg_gb == "N"){
        ComShowCodeMessage('INV00041',"["+obj.GetSelectText()+"]");
        return false;
    }
    return true;
}
/** 
 * Opening popup.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object.  
 * @param  {int} Row : Selected row.
 * @param  {int} Col : Selected column.
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function sheet1_OnPopupClick(sheetObj, Row,Col)
{
    var formObject=document.form;
    var param="";
    if (sheetObj.ColSaveName(Col) == "aply_dt") {
        var cal=new ComCalendarGrid("myCal");
        cal.select(sheetObj, Row, Col, 'yyyy-MM-dd');
    }
}   
/** 
 * Coding event for OnSelectCell<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object.  
 * @param  {int} OldRow
 * @param  {int} OldCol
 * @param  {int} NewRow
 * @param  {int} NewCol
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function sheet1_OnSelectCell(sheetObj,OldRow, OldCol, NewRow, NewCol){
    var Val=sheetObj.GetCellText(OldRow,OldCol);
    sheet1_OnChange_event(sheetObj,OldRow,OldCol, Val);
}  
/** 
 * Coding event for OnChange.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object. 
 * @param  {int} Row
 * @param  {int} Col 
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function sheet1_OnChange(sheetObj, Row, Col){
    var Val=sheetObj.GetCellText(Row,Col);
        sheet1_OnChange_event(sheetObj,Row,Col, Val);
}
/** 
 * Coding event for OnChange.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object. 
 * @param  {int} Row 
 * @param  {int} Col  
 * @param  {int} Val 
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function sheet1_OnChange_event(sheetObj,Row,Col, Val){          
    if(sheetObj.GetCellEditable(Row, Col) == false) return;
    if(Val == "" || Val == "Lane"|| Val == "Port" || Val == "VVD") return;
    var formObject=document.form;
    var cut_off_aply_dt_tp_cd=sheetObj.GetCellValue(Row,"cut_off_aply_dt_tp_cd");
    if (sheetObj.ColSaveName(Col) == "cut_off_aply_dt_tp_cd") {
        BasesDate_change(sheetObj,Row,Col,cut_off_aply_dt_tp_cd);
    }
    if(sheetObj.GetCellValue(Row,"cut_off_aply_dt_tp_cd") == "I"){
        return;
    }
    if (sheetObj.ColSaveName(Col) == "slan_cd") {
        formObject.slan_cd.value=sheetObj.GetCellValue(Row,"slan_cd");
        formObject.f_cmd.value=SEARCH01;
        doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC01, Row, Col, Val);
    }
    if (sheetObj.ColSaveName(Col) == "port_cd") {
        if(Val != "ALL"){
            formObject.port_cd.value=sheetObj.GetCellValue(Row,"port_cd");
            doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02, Row, Col, Val);
        }
    }
    if (sheetObj.ColSaveName(Col) == "vvd_cd") {
        sheetObj.SetCellValue(Row,"vsl_cd",Val.substring(0,4),0);
        sheetObj.SetCellValue(Row,"skd_voy_no",Val.substring(4,8),0);
        sheetObj.SetCellValue(Row,"skd_dir_cd",Val.substring(8,9),0);
        formObject.vsl_cd.value=sheetObj.GetCellValue(Row,"vsl_cd");
        formObject.skd_voy_no.value=sheetObj.GetCellValue(Row,"skd_voy_no");
        formObject.skd_dir_cd.value=sheetObj.GetCellValue(Row,"skd_dir_cd");
        formObject.io_bnd_cd.value=sheetObj.GetCellValue(Row,"io_bnd_cd");
        doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC03, Row, Col, Val);
    }       
}
/** 
 * Coding event for OnChange.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj : Sheet object. 
 * @param  {int} Row 
 * @param  {int} Col  
 * @param  {int} Val 
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function BasesDate_change(sheetObj,Row,Col,Val){
    if(Val == "S"){
        sheetObj.SetColProperty("io_bnd_cd", {ComboText:"O/B|I/B", ComboCode:"O|I"} );
        sheetObj.SetCellValue(Row,"io_bnd_cd","O");
        sheetObj.SetCellValue(Row,"slan_cd","");
        sheetObj.SetCellValue(Row,"port_cd","");
        sheetObj.SetCellValue(Row,"vvd_cd","");
        sheetObjects[0].SetCellEditable(Row,'io_bnd_cd',1);
        sheetObjects[0].SetCellEditable(Row,'slan_cd',1);
        sheetObjects[0].SetCellEditable(Row,'port_cd',1);
        sheetObjects[0].SetCellEditable(Row,'vvd_cd',1);
    }else{
        sheetObj.SetColProperty("io_bnd_cd", {ComboText:"All|O/B|I/B", ComboCode:"A|O|I"} );
        sheetObj.SetCellValue(Row,"io_bnd_cd","A");
        sheetObj.SetCellValue(Row,"slan_cd","ALL");
        sheetObj.SetCellValue(Row,"port_cd","ALL");
        sheetObj.SetCellValue(Row,"vvd_cd","ALL");
        sheetObjects[0].SetCellEditable(Row,'io_bnd_cd',0);
        sheetObjects[0].SetCellEditable(Row,'slan_cd',0);
        sheetObjects[0].SetCellEditable(Row,'port_cd',0);
        sheetObjects[0].SetCellEditable(Row,'vvd_cd',0);
    }
}
/** 
 * Add data on combo box.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {object} cmbObj 
 * @param  {String} arrStr 
 * @param  {String} allYn 
 * @return none.
 * @see #
 * @author 
 * @version 2009.10.19
 */
function MakeComboObject_OfcCd2(cmbObj, arrStr, allYn) {
    var ar_ofc_cd_all="";
    for (var i=1; i < arrStr.length;i++ ) {
        var arrStr2=arrStr[i].split("^");
        var ar_ofc_cd=arrStr2[0];
        var delt_flg=arrStr2[2];
        cmbObj.InsertItem(i-1, ar_ofc_cd+"|"+delt_flg, arrStr[i]);
        ar_ofc_cd_all=ar_ofc_cd_all +"|"+ ar_ofc_cd;
    }
    document.form.ar_ofc_cd_all.value=ar_ofc_cd_all;
    if(allYn=='Y'){
        cmbObj.InsertItem(0, "ALL", "ALL^ALL");
    }
    cmbObj.SetColFontColor(1,"Red");
    cmbObj.SetColWidth(0, "80");
    cmbObj.SetColWidth(1, "20");
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[0]);
}
