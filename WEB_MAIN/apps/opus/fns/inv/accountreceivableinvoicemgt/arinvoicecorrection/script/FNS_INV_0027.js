/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0027.js
*@FileTitle  : Ex Rate Update by Date or VVD
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
// Global variables.
var sheetObjects=new Array();
var sheetCnt=0;
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
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function processButtonClick(){
    /***** Setting each tab's sheet variable. *****/
    var sheetObject1=sheetObjects[0];   
    var sheetObject2=sheetObjects[1];   
    var sheetObject3=sheetObjects[2];   
    var sheetObject4=sheetObjects[3];   
    var sheetObject5=sheetObjects[4];   
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");    
        switch(srcName) {
        case "btn_run":
            doActionIBSheet(sheetObject1,formObject,IBSAVE);
            break;
        case "btn_new":
            formObject.fm_if_dt.value="";
            formObject.to_if_dt.value="";
            formObject.io_bnd_cd.value="";
            formObject.tot_cnt.value="";
            formObject.good_cnt.value="";
            formObject.no_good_cnt.value="";
            formObject.run_opt[0].checked=true;             
            chkOption("N");
            formObject.inv_cust_cnt_cd.value="";
            formObject.inv_cust_seq.value="";
            formObject.fm_if_dt.focus();
            break;  
        case "btns_calendar1": // Calendar button.
        var cal=new ComCalendar();
        cal.select(formObject.fm_if_dt, 'yyyy-MM-dd');
        break;
        case "btns_calendar2": // Calendar button.
        var cal=new ComCalendar();
        cal.select(formObject.to_if_dt, 'yyyy-MM-dd');
        break;
        case "btn_invcust":
            var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.inv_cust_cnt_cd.value+'&cust_seq='+formObject.inv_cust_seq.value+'&pop_yn=Y';
            var Row=1;
            var Col=1;
            ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 920, 700, '', '0,0', false, false, "", "", 0);
            break; 
        case "btn_custNm":
            param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.inv_cust_seq.value+'&cust_cnt_cd='+formObject.inv_cust_cnt_cd.value;
            ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086_1', '1,0', false, false, Row, Col, 0);
            break;
        case "btn_downexcel":
            ComOpenWait(true);
            if(sheetObject5.RowCount() < 1){//no data
                ComShowCodeMessage("COM132501");
            }else{
                sheetObject5.Down2Excel({DownCols: makeHiddenSkipCol(sheetObject5), SheetDesign:1,Merge:1 });
            }
            ComOpenWait(false);
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
    ComShowObject(document.form.btn_invcust,false);
    ComShowObject(document.form.btn_custNm,false);
    ComBtnDisable("btn_downexcel");
    document.form.fm_if_dt.focus();
    sheet1OnLoadFinish(sheetObjects[0]);
    sheet3OnLoadFinish(sheetObjects[2]);
}
/** 
 * Coding event for OnLoadFinish.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {ibsheet} sheetObj required IBSheet Object        
 * @return none.
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */     
function sheet1OnLoadFinish(sheetObj) {
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.SetCellValue(1,1,'1');
    sheetObj.SetCellValue(2,1,'3');
    sheetObj.SetCellValue(3,1,'5');
    sheetObj.SetCellValue(4,1,'7');
    sheetObj.SetCellValue(5,1,'9');
    sheetObj.SetCellValue(1,3,'2');
    sheetObj.SetCellValue(2,3,'4');
    sheetObj.SetCellValue(3,3,'6');
    sheetObj.SetCellValue(4,3,'8');
    sheetObj.SetCellValue(5,3,'10');
    sheetObj.SetRowEditable(1,0);
    sheetObj.SetRowEditable(2,0);
    sheetObj.SetRowEditable(3,0);
    sheetObj.SetRowEditable(4,0);
    sheetObj.SetRowEditable(5,0);
}
/** 
 * Coding event for OnLoadFinish.<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {ibsheet} sheetObj required IBSheet Object        
 * @return none.
 * @see #
 * @author Choi Do Soon
 * @version 2009.11.16
 */     
function sheet3OnLoadFinish(sheetObj) {
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.DataInsert(-1);
    sheetObj.SetCellValue(1,1,'1');
    sheetObj.SetCellValue(2,1,'3');
    sheetObj.SetCellValue(3,1,'5');
    sheetObj.SetCellValue(4,1,'7');
    sheetObj.SetCellValue(5,1,'9');
    sheetObj.SetCellValue(1,3,'2');
    sheetObj.SetCellValue(2,3,'4');
    sheetObj.SetCellValue(3,3,'6');
    sheetObj.SetCellValue(4,3,'8');
    sheetObj.SetCellValue(5,3,'10');
    sheetObj.SetRowEditable(1,0);
    sheetObj.SetRowEditable(2,0);
    sheetObj.SetRowEditable(3,0);
    sheetObj.SetRowEditable(4,0);
    sheetObj.SetRowEditable(5,0);
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
    switch(sheetID) {
    case "sheet1":
        with(sheetObj){
            var HeadTitle="|seq|vvd|seq2|vvd2";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"vvd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:9 },
                        {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"seq2",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"vvd2",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:9 } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetCountPosition(0);
            SetWaitImageVisible(0);
            SetRowHidden(0, 1);
            SetColProperty(0 ,"vvd"  , {AcceptKeys:"E|N" , InputCaseSensitive:1});
            SetColProperty(0 ,"vvd2" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
            SetWaitTimeOut(1000);
            SetSheetHeight(132);
            SetSheetWidth(300);
        }

        break;
    case "sheet2":
        with(sheetObj){
            var HeadTitle="|seq|vvd";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"seq",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"vvd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:9 } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetCountPosition(0);
            SetWaitImageVisible(0);
            SetColProperty(0 ,"vvd"  , {AcceptKeys:"E|N" , InputCaseSensitive:1});
            SetWaitTimeOut(1000);
            SetVisible(0);
            SetSheetWidth(300);
        }

        break;  
    case "sheet3":
        with(sheetObj){
            var HeadTitle="|seq|bl_src_no|seq2|bl_src_no2";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"seq",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:1,   SaveName:"seq2",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no2",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetCountPosition(0);
            SetWaitImageVisible(0);
            SetRowHidden(0, 1);
            SetColProperty(0 ,"bl_src_no"  , {AcceptKeys:"E|N" , InputCaseSensitive:1});
            SetColProperty(0 ,"bl_src_no2" , {AcceptKeys:"E|N" , InputCaseSensitive:1});
            SetWaitTimeOut(1000);
            SetSheetHeight(132);
            SetSheetWidth(300);
        }

        break;
    case "sheet4":
        with(sheetObj){
            var HeadTitle="|seq|bl_src_no";
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
            var headers = [ { Text:HeadTitle, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Seq",       Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"seq",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetCountPosition(0);
            SetWaitImageVisible(0);
            SetColProperty(0 ,"bl_src_no"  , {AcceptKeys:"E|N" , InputCaseSensitive:1});
            SetWaitTimeOut(1000);
            SetVisible(0);
        }
        break;  
    case "sheet5":
        with(sheetObj){
            var HeadTitle1="|AR IF NO|BL NO|BKG NO|ACT CUST CNT CD|ACT CUST SEQ|AR OFC CODE|VVD|POR|POL|POD|DEL|SVC SCOPE|SAILING DATE|SA DATE|USD EXCHG RATE|INV TOTAL LOCAL AMOUNT"
            var headCount=ComCountHeadTitle(HeadTitle1);
            
            SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
            
            var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
            var headers = [ { Text:HeadTitle1, Align:"Center"} ];
            InitHeaders(headers, info);
            
            var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0,   EditLen:0 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"vvd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"por_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"del_cd",            KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"sail_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"usd_xch_rt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 },
                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"inv_ttl_locl_amt",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 } ];
                                           
            InitColumns(cols);
            
            SetEditable(1);
            SetWaitImageVisible(0);
            SetWaitTimeOut(1000);
            SetVisible(0);
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
        formObj.f_cmd.value=SEARCH02;
        var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
        var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
        var arrStr=sStr.split("|");
        MakeComboObject2(ar_ofc_cd, arrStr);
        var arrStr2="";
        var ar_ofc_cd_str="";
        for(i=1;i<arrStr.length;i++){
            arrStr2=arrStr[i].split("^");
            if(arrStr2[1]==arrStr2[3]){
                ar_ofc_cd_str=arrStr2[1];
                ar_ofc_cd.SetSelectText(ar_ofc_cd_str);
                formObj.ofc.value=ar_ofc_cd_str;
                form.ofc_cd.value=form.ofc.value;   
            }
        }
        ComOpenWait(false);
    break;  
    case IBSAVE:        //save
        var row_cnt=sheetObjects[0].RowCount();
        var row=0;
        var v_vvd="";
        sheetObjects[1].RemoveAll();
        for (var i=0; i < row_cnt; i++){
            for (var j=1; j < 3; j++){                      
                v_vvd=sheetObjects[0].GetCellValue(i+1, j*2);
                if (v_vvd != "") {
                    sheetObjects[1].DataInsert(-1);
                    row++;
                    sheetObjects[1].SetCellValue(row, 2,sheetObjects[0].GetCellValue(i+1, j*2));
                }                       
            }                   
        }
        var bl_row_cnt=sheetObjects[2].RowCount();
        var bl_row=0;
        var v_bl_src_no="";
        sheetObjects[3].RemoveAll();
        for (var i=0; i < bl_row_cnt; i++){
            for (var j=1; j < 3; j++){                      
                v_bl_src_no=sheetObjects[2].GetCellValue(i+1, j*2);
                if (v_bl_src_no != "") {
                    sheetObjects[3].DataInsert(-1);
                    bl_row++;
                    sheetObjects[3].SetCellValue(bl_row, 2,sheetObjects[2].GetCellValue(i+1, j*2));
                }                       
            }                   
        }
        if(validateForm(sheetObj,formObj,sAction)){
            formObj.f_cmd.value=SEARCH01;
            var sXml=sheetObj.GetSaveData("FNS_INV_0027GS.do",FormQueryString(formObj) + "&" + ComSetPrifix(sheetObjects[1].GetSaveString(false,true,"vvd"),"sheet1_")+ "&" + ComSetPrifix(sheetObjects[3].GetSaveString(false,true,"bl_src_no"),"sheet2_"));
            
			// batch 가 running 상태일 경우, message 호출
			var batStsCd = ComGetEtcData(sXml, "batStsCd");
			if (!ComIsNull(batStsCd)) {
				if(batStsCd == "R"){
					//There is other {?msg1} execution in progress. Please try again after a few minutes.
					ComShowCodeMessage("INV00174", "Ex.rate change");		
					return;					
				}
			}
            
            var backEndJobKey=ComGetEtcData(sXml, "BackEndJobKey")
            if(backEndJobKey.length > 0) {
                inputReadOnly(2);
                formObj.backendjob_key.value=backEndJobKey;
                sheetObj.SetWaitImageVisible(0);
                ComOpenWait(true);
                sheetObj.SetWaitTimeOut(10000);
                timer=setInterval(getBackEndJobStatus, 3000);
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
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch(sAction) {
        case IBSAVE:        //save
        if(formObj.run_opt[0].checked==true){
            if(formObj.fm_if_dt.value==""||formObj.to_if_dt.value==""){
                ComShowCodeMessage("INV00004");
                formObj.fm_if_dt.focus();
                return;
            }
            if(ComGetDaysBetween(formObj.fm_if_dt.value,formObj.to_if_dt.value)>14){
                ComShowCodeMessage("INV00043");
                formObj.to_if_dt.focus();
                return;
            }
        }else if(formObj.run_opt[1].checked==true){
            valCnt=0;
            for(i=1;i<sheetObjects[1].RowCount()+1;i++){
                if(sheetObjects[1].GetCellValue(i,"vvd")!="") valCnt=valCnt+1;
            }
            if(valCnt==0){
                ComShowCodeMessage("INV00004");
                sheetObjects[0].SelectCell(1,"vvd");
                return;
            }
            dupRow=sheetObjects[1].ColValueDup("vvd");
            if(dupRow!="-1" && sheetObjects[1].GetCellValue(dupRow,"vvd")!=""){
                ComShowCodeMessage("INV00052");
                fndRow=sheetObjects[0].FindText("vvd",sheetObjects[1].GetCellValue(dupRow,"vvd"));
                fndRow2=sheetObjects[0].FindText("vvd2",sheetObjects[1].GetCellValue(dupRow,"vvd"));
                if(fndRow!='-1'){
                    sheetObjects[0].SelectCell(fndRow,"vvd");
                }
                if(fndRow2!='-1'){
                    sheetObjects[0].SelectCell(fndRow2,"vvd2");
                }
                return;
            }
        }else if(formObj.run_opt[2].checked==true){
            if(formObj.fm_if_dt.value==""||formObj.to_if_dt.value==""){
                ComShowCodeMessage("INV00004");
                formObj.fm_if_dt.focus();
                return;
            }
            if(ComGetDaysBetween(formObj.fm_if_dt.value,formObj.to_if_dt.value)>14){
                ComShowCodeMessage("INV00043");
                formObj.to_if_dt.focus();
                return;
            }
            if(formObj.inv_cust_cnt_cd.value==""||formObj.inv_cust_seq.value==""){
                ComShowCodeMessage("INV00004");
                formObj.inv_cust_cnt_cd.focus();
                return;
            }
        }else{
            valCnt=0;
            for(i=1;i<sheetObjects[3].RowCount()+1;i++){
                if(sheetObjects[3].GetCellValue(i,"bl_src_no")!="") valCnt=valCnt+1;
            }
            if(valCnt==0){
                ComShowCodeMessage("INV00004");
                sheetObjects[2].SelectCell(1,"bl_src_no");
                return;
            }
            dupRow=sheetObjects[3].ColValueDup("bl_src_no");
            if(dupRow!="-1" && sheetObjects[3].GetCellValue(dupRow,"bl_src_no")!=""){
                ComShowCodeMessage("INV00052");
                fndRow=sheetObjects[2].FindText("bl_src_no",sheetObjects[3].GetCellValue(dupRow,"bl_src_no"));
                fndRow2=sheetObjects[2].FindText("bl_src_no2",sheetObjects[3].GetCellValue(dupRow,"bl_src_no"));
                if(fndRow!='-1'){
                    sheetObjects[2].SelectCell(fndRow,"bl_src_no");
                }
                if(fndRow2!='-1'){
                    sheetObjects[2].SelectCell(fndRow2,"bl_src_no2");
                }
                return;
            }
        }
        break;
        }
    }     
    return true;
}
/**
 * Creating row.<br>
 * <br><b>Example : </b>
 * <pre>
 *   sheet1_OnKeyDown(sheetObjects[0],1, 1,'1');
 * </pre>
 * @param object sheetObj
 * @param number Row
 * @param number Col
 * @param number KeyCode
 * @param boolean Shift
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function sheet1_OnKeyDown(sheetObj, Row, Col, KeyCode, Shift) {
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
 * @version 2009.10.06
 */
function MakeComboObject2(cmbObj, arrStr) {
    for (var i=1; i < arrStr.length;i++ ) {
        var arrStr2=arrStr[i].split("^");
        var ar_ofc_cd_str=arrStr2[1];
        cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);            
    }
    cmbObj.SetDropHeight(190);
}   
/**
 * When change a af_ofc_cd data, execute function.<br>
 * Setting office<br>
 * <br><b>Example : </b>
 * <pre>
 *   ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode);
 * </pre>
 * @param object comboObj
 * @param string value
 * @param string text
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 
function ar_ofc_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){ 
    arrStr=newCode.split("^");
    document.form.ofc.value=arrStr[1];
    document.form.ofc_cd.value=arrStr[1];
    document.form.office_cnt_cd.value = arrStr[6].substring(0,2);
}
/**
 * fm_if_dt,to_if_dt Setting masked value, After validating date.<br>
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
 * Radio button selection in case, setting screen.<br>
 * <br><b>Example : </b>
 * <pre>
 *   chkOption('N');
 * </pre>
 * @param String checkedVal
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function chkOption(checkedVal){
    if(checkedVal=="N"){
        sheetObjects[0].RemoveAll();
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].SetCellValue(1,1,'1');
        sheetObjects[0].SetCellValue(2,1,'3');
        sheetObjects[0].SetCellValue(3,1,'5');
        sheetObjects[0].SetCellValue(4,1,'7');
        sheetObjects[0].SetCellValue(5,1,'9');
        sheetObjects[0].SetCellValue(1,3,'2');
        sheetObjects[0].SetCellValue(2,3,'4');
        sheetObjects[0].SetCellValue(3,3,'6');
        sheetObjects[0].SetCellValue(4,3,'8');
        sheetObjects[0].SetCellValue(5,3,'10');
        sheetObjects[0].SetRowEditable(1,0);
        sheetObjects[0].SetRowEditable(2,0);
        sheetObjects[0].SetRowEditable(3,0);
        sheetObjects[0].SetRowEditable(4,0);
        sheetObjects[0].SetRowEditable(5,0);
//        sheetObjects[0].Editable=false;
        sheetObjects[0].SetEditable(0);
        sheetObjects[2].RemoveAll();
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].SetCellValue(1,1,'1');
        sheetObjects[2].SetCellValue(2,1,'3');
        sheetObjects[2].SetCellValue(3,1,'5');
        sheetObjects[2].SetCellValue(4,1,'7');
        sheetObjects[2].SetCellValue(5,1,'9');
        sheetObjects[2].SetCellValue(1,3,'2');
        sheetObjects[2].SetCellValue(2,3,'4');
        sheetObjects[2].SetCellValue(3,3,'6');
        sheetObjects[2].SetCellValue(4,3,'8');
        sheetObjects[2].SetCellValue(5,3,'10');
        sheetObjects[2].SetRowEditable(1,0);
        sheetObjects[2].SetRowEditable(2,0);
        sheetObjects[2].SetRowEditable(3,0);
        sheetObjects[2].SetRowEditable(4,0);
        sheetObjects[2].SetRowEditable(5,0);
        ComShowObject(document.form.btns_calendar1,true);
        ComShowObject(document.form.btns_calendar2,true);
        document.form.fm_if_dt.disabled=false;
        document.form.to_if_dt.disabled=false;
        document.form.io_bnd_cd.disabled=true;
        document.form.fm_if_dt.className="input1";
        document.form.to_if_dt.className="input1";  
        document.form.inv_cust_cnt_cd.disabled=true;
        document.form.inv_cust_seq.disabled=true;
        document.form.inv_cust_cnt_cd.value="";
        document.form.inv_cust_seq.value="";
        document.form.cust_lgl_eng_nm.value="";
        document.form.inv_cust_cnt_cd.className="input2";
        document.form.inv_cust_seq.className="input2";
        ComShowObject(document.form.btn_invcust,false);
        ComShowObject(document.form.btn_custNm,false);
        document.all.dt_name.innerHTML="&nbsp;&nbsp;Interface Date";
        sheetObjects[4].RemoveAll();
        ComBtnDisable("btn_downexcel");
        form.tot_cnt.value="";
        form.good_cnt.value="";
        form.no_good_cnt.value="";
        sheetObjects[0].SetColBackColor(2,"#f5f5f5");
        sheetObjects[0].SetColBackColor(4,"#f5f5f5");   
        sheetObjects[2].SetColBackColor(2,"#f5f5f5");
        sheetObjects[2].SetColBackColor(4,"#f5f5f5");
    }else if(checkedVal=="V"){
        sheetObjects[2].RemoveAll();
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].SetCellValue(1,1,'1');
        sheetObjects[2].SetCellValue(2,1,'3');
        sheetObjects[2].SetCellValue(3,1,'5');
        sheetObjects[2].SetCellValue(4,1,'7');
        sheetObjects[2].SetCellValue(5,1,'9');
        sheetObjects[2].SetCellValue(1,3,'2');
        sheetObjects[2].SetCellValue(2,3,'4');
        sheetObjects[2].SetCellValue(3,3,'6');
        sheetObjects[2].SetCellValue(4,3,'8');
        sheetObjects[2].SetCellValue(5,3,'10');
        sheetObjects[2].SetRowEditable(1,0);
        sheetObjects[2].SetRowEditable(2,0);
        sheetObjects[2].SetRowEditable(3,0);
        sheetObjects[2].SetRowEditable(4,0);
        sheetObjects[2].SetRowEditable(5,0);
        sheetObjects[0].RemoveAll();
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].SetCellValue(1,1,'1');
        sheetObjects[0].SetCellValue(2,1,'3');
        sheetObjects[0].SetCellValue(3,1,'5');
        sheetObjects[0].SetCellValue(4,1,'7');
        sheetObjects[0].SetCellValue(5,1,'9');
        sheetObjects[0].SetCellValue(1,3,'2');
        sheetObjects[0].SetCellValue(2,3,'4');
        sheetObjects[0].SetCellValue(3,3,'6');
        sheetObjects[0].SetCellValue(4,3,'8');
        sheetObjects[0].SetCellValue(5,3,'10');
        sheetObjects[0].SetEditable(1);
        sheetObjects[0].SetColBackColor(2,"#CCFFFD");
        sheetObjects[0].SetColBackColor(4,"#CCFFFD");   
        sheetObjects[2].SetColBackColor(2,"#f5f5f5");
        sheetObjects[2].SetColBackColor(4,"#f5f5f5");
        ComShowObject(document.form.btns_calendar1,false);
        ComShowObject(document.form.btns_calendar2,false);
        document.form.fm_if_dt.disabled=true;
        document.form.to_if_dt.disabled=true;
        document.form.fm_if_dt.value="";
        document.form.to_if_dt.value="";
        document.form.io_bnd_cd.disabled=false;
        document.form.fm_if_dt.className="input2";
        document.form.to_if_dt.className="input2";
        document.form.inv_cust_cnt_cd.disabled=true;
        document.form.inv_cust_seq.disabled=true;
        document.form.inv_cust_cnt_cd.value="";
        document.form.inv_cust_seq.value="";
        document.form.cust_lgl_eng_nm.value="";
        document.form.inv_cust_cnt_cd.className="input2";
        document.form.inv_cust_seq.className="input2";  
        ComShowObject(document.form.btn_invcust,false);
        ComShowObject(document.form.btn_custNm,false);
        document.all.dt_name.innerHTML="&nbsp;&nbsp;Interface Date";
        sheetObjects[4].RemoveAll();
        ComBtnDisable("btn_downexcel");
        form.tot_cnt.value="";
        form.good_cnt.value="";
        form.no_good_cnt.value="";
    }else if(checkedVal=="C"){
        sheetObjects[0].RemoveAll();
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].SetCellValue(1,1,'1');
        sheetObjects[0].SetCellValue(2,1,'3');
        sheetObjects[0].SetCellValue(3,1,'5');
        sheetObjects[0].SetCellValue(4,1,'7');
        sheetObjects[0].SetCellValue(5,1,'9');
        sheetObjects[0].SetCellValue(1,3,'2');
        sheetObjects[0].SetCellValue(2,3,'4');
        sheetObjects[0].SetCellValue(3,3,'6');
        sheetObjects[0].SetCellValue(4,3,'8');
        sheetObjects[0].SetCellValue(5,3,'10');
        sheetObjects[0].SetRowEditable(1,0);
        sheetObjects[0].SetRowEditable(2,0);
        sheetObjects[0].SetRowEditable(3,0);
        sheetObjects[0].SetRowEditable(4,0);
        sheetObjects[0].SetRowEditable(5,0);
//        sheetObjects[0].Editable=false;
        sheetObjects[2].RemoveAll();
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].SetCellValue(1,1,'1');
        sheetObjects[2].SetCellValue(2,1,'3');
        sheetObjects[2].SetCellValue(3,1,'5');
        sheetObjects[2].SetCellValue(4,1,'7');
        sheetObjects[2].SetCellValue(5,1,'9');
        sheetObjects[2].SetCellValue(1,3,'2');
        sheetObjects[2].SetCellValue(2,3,'4');
        sheetObjects[2].SetCellValue(3,3,'6');
        sheetObjects[2].SetCellValue(4,3,'8');
        sheetObjects[2].SetCellValue(5,3,'10');
        sheetObjects[2].SetRowEditable(1,0);
        sheetObjects[2].SetRowEditable(2,0);
        sheetObjects[2].SetRowEditable(3,0);
        sheetObjects[2].SetRowEditable(4,0);
        sheetObjects[2].SetRowEditable(5,0);
        ComShowObject(document.form.btns_calendar1,true);
        ComShowObject(document.form.btns_calendar2,true);
        document.form.fm_if_dt.disabled=false;
        document.form.to_if_dt.disabled=false;
        document.form.io_bnd_cd.disabled=true;
        document.form.fm_if_dt.className="input1";
        document.form.to_if_dt.className="input1";  
        document.form.inv_cust_cnt_cd.disabled=false;
        document.form.inv_cust_seq.disabled=false;
        document.form.inv_cust_cnt_cd.className="input1";
        document.form.inv_cust_seq.className="input1";  
        ComShowObject(document.form.btn_invcust,true);
        ComShowObject(document.form.btn_custNm,true);
        document.all.dt_name.innerHTML="&nbsp;&nbsp;Ex.Rate Appl. Date";    
        sheetObjects[4].RemoveAll();
        ComBtnDisable("btn_downexcel");
        form.tot_cnt.value="";
        form.good_cnt.value="";
        form.no_good_cnt.value="";
        sheetObjects[0].SetColBackColor(2,"#f5f5f5");
        sheetObjects[0].SetColBackColor(4,"#f5f5f5");   
        sheetObjects[2].SetColBackColor(2,"#f5f5f5");
        sheetObjects[2].SetColBackColor(4,"#f5f5f5");
    }else{
        sheetObjects[0].RemoveAll();
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].DataInsert(-1);
        sheetObjects[0].SetCellValue(1,1,'1');
        sheetObjects[0].SetCellValue(2,1,'3');
        sheetObjects[0].SetCellValue(3,1,'5');
        sheetObjects[0].SetCellValue(4,1,'7');
        sheetObjects[0].SetCellValue(5,1,'9');
        sheetObjects[0].SetCellValue(1,3,'2');
        sheetObjects[0].SetCellValue(2,3,'4');
        sheetObjects[0].SetCellValue(3,3,'6');
        sheetObjects[0].SetCellValue(4,3,'8');
        sheetObjects[0].SetCellValue(5,3,'10');
        sheetObjects[0].SetRowEditable(1,0);
        sheetObjects[0].SetRowEditable(2,0);
        sheetObjects[0].SetRowEditable(3,0);
        sheetObjects[0].SetRowEditable(4,0);
        sheetObjects[0].SetRowEditable(5,0);
        document.form.io_bnd_cd.disabled=true;
        sheetObjects[2].RemoveAll();
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].DataInsert(-1);
        sheetObjects[2].SetCellValue(1,1,'1');
        sheetObjects[2].SetCellValue(2,1,'3');
        sheetObjects[2].SetCellValue(3,1,'5');
        sheetObjects[2].SetCellValue(4,1,'7');
        sheetObjects[2].SetCellValue(5,1,'9');
        sheetObjects[2].SetCellValue(1,3,'2');
        sheetObjects[2].SetCellValue(2,3,'4');
        sheetObjects[2].SetCellValue(3,3,'6');
        sheetObjects[2].SetCellValue(4,3,'8');
        sheetObjects[2].SetCellValue(5,3,'10');
        sheetObjects[2].SetEditable(1);
        sheetObjects[2].SetColBackColor(2,"#CCFFFD");
        sheetObjects[2].SetColBackColor(4,"#CCFFFD");
        sheetObjects[0].SetColBackColor(2,"#f5f5f5");
        sheetObjects[0].SetColBackColor(4,"#f5f5f5");
        ComShowObject(document.form.btns_calendar1,false);
        ComShowObject(document.form.btns_calendar2,false);
        document.form.fm_if_dt.disabled=true;
        document.form.to_if_dt.disabled=true;
        document.form.fm_if_dt.value="";
        document.form.to_if_dt.value="";
        document.form.fm_if_dt.className="input2";
        document.form.to_if_dt.className="input2";
        document.form.inv_cust_cnt_cd.disabled=true;
        document.form.inv_cust_seq.disabled=true;
        document.form.inv_cust_cnt_cd.value="";
        document.form.inv_cust_seq.value="";
        document.form.cust_lgl_eng_nm.value="";
        document.form.inv_cust_cnt_cd.className="input2";
        document.form.inv_cust_seq.className="input2";  
        ComShowObject(document.form.btn_invcust,false);
        ComShowObject(document.form.btn_custNm,false);
        document.all.dt_name.innerHTML="&nbsp;&nbsp;Interface Date";
        sheetObjects[4].RemoveAll();
        ComBtnDisable("btn_downexcel");
        form.tot_cnt.value="";
        form.good_cnt.value="";
        form.no_good_cnt.value="";
    }
}
/**
 * Checking cust_cnt_cd length in selected tab.<br>
 * <br><b>Example : </b>
 * <pre>
 *    checkCustLeng('DE');
 * </pre>
 * @param string value
 * @author Choi Do Soon
 * @version 2009.10.19
 */
function checkCustLeng(value){        
    if(value.length==2){
        form.inv_cust_seq.focus(); 
    }
}
/**
 * When change a inv_cust_cnt_cd and a inv_cust_seq, execute function.<br>
 * <br><b>Example : </b>
 * <pre>
 *    fn_inv_cust_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.19
 */
function fn_inv_cust_chg(){
    if(form.inv_cust_cnt_cd.value!=''&&form.inv_cust_seq.value!=''){
        form.inv_cust_seq.value=ComLpad(form.inv_cust_seq.value.trim(), 6, "0");              
        form.cust_cnt_cd.value=form.inv_cust_cnt_cd.value;
        form.cust_seq.value=form.inv_cust_seq.value;
        form.ofc_cd.value=form.ofc.value;
    }
    document.form.f_cmd.value=SEARCH03;
    var cust_nm="";
    if ((form.inv_cust_cnt_cd.value.trim() != "" )&&(form.inv_cust_seq.value.trim() != "")&&(form.inv_cust_seq.value.trim() != "000000")){
    	var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
        cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
        if (cust_nm == undefined) {
            form.cust_lgl_eng_nm.value="";
            form.inv_cust_seq.value="";
            ComShowCodeMessage("INV00008");
            form.inv_cust_cnt_cd.focus();
            return;                   
        }else{            
            form.cust_lgl_eng_nm.value=cust_nm;    
        }
    } else {
    	form.cust_lgl_eng_nm.value="";    
    }
}
/**
 * Popup (FNS_INV_0086) After process, execute function.<br>
 * <br><b>Example : </b>
 * <pre>
 *    getFNS_INV_0086_1(rowArray, 1, 1);
 * </pre>
 * @param String rowArray
 * @param number row
 * @param number col
 * @author Choi Do Soon
 * @version 2009.10.19
 */
function getFNS_INV_0086_1(rowArray, row, col) {         
    var colArray=rowArray[0];   
    document.form.inv_cust_cnt_cd.value=colArray[8];
    document.form.inv_cust_seq.value=ComLpad(colArray[9], 6, '0');
    fn_inv_cust_chg();
}
/**
 * Checking until BackEndJob's status become 3.<br>
 *
 * @return none.
 * @see #doActionIBSheet
 */
function getBackEndJobStatus() {
    form.f_cmd.value=SEARCH02;
    var sXml=sheetObjects[0].GetSearchData("FNS_INV_0027GS.do", FormQueryString(form));
    var arrXml=sXml.split("|$$|");
    var jobState=ComGetEtcData(arrXml[0], "jb_sts_flg");
    
    if(jobState == "3") {
        clearInterval(timer);
        getBackEndJobLoadFile();
        ComOpenWait(false);
        inputReadOnly(1);
    } else if(jobState == "4") {
        clearInterval(timer);
        ComShowCodeMessage("INV00089");
        ComOpenWait(false);
        inputReadOnly(1);
    } else if(jobState == "5") {
        clearInterval(timer);
        ComShowCodeMessage("INV00090");
        ComOpenWait(false);
        inputReadOnly(1);
    }
}
/**
 * After BackEndJob's complete, retrieving result.<br>
 * 
 * @return none.
 * @see #getBackEndJobStatus
 */
function getBackEndJobLoadFile() {
    form.f_cmd.value=SEARCH03;
    var sXml=sheetObjects[0].GetSearchData("FNS_INV_0027GS.do", FormQueryString(form));
    var arrXml=sXml.split("|$$|");
    if(arrXml.length > 0) {
        if ( arrXml[0] != null){
            sheetObjects[4].LoadSearchData(arrXml[0],{Sync:1} );
        }
        if(ComGetEtcData(sXml,"TRANS_RESULT_KEY")=="S"){
            if(ComGetEtcData(sXml,"tot_cnt")==0){
                form.tot_cnt.value=ComGetEtcData(sXml,"tot_cnt");
                form.good_cnt.value=ComGetEtcData(sXml,"good_cnt");
                form.no_good_cnt.value=ComGetEtcData(sXml,"no_good_cnt");   
            }else{
                form.tot_cnt.value=ComGetEtcData(sXml,"tot_cnt");
                form.good_cnt.value=ComGetEtcData(sXml,"good_cnt");
                form.no_good_cnt.value=ComGetEtcData(sXml,"no_good_cnt");   
                if(form.good_cnt.value > 0){
                    ComBtnEnable("btn_downexcel");
                }
            }
        }
        form.backendjob_key.value="";
    }
}
/**
 * Setting use object by condition.<br>
 * 
 * @param {int} flag
 * @return none.
 * @see #getBackEndJobStatus, #doActionIBSheet
 */
function inputReadOnly(flag) {
    if(flag == 1) {
        ComBtnEnable("btn_run");
        ComBtnEnable("btn_new");
    } else if(flag == 2) {
        ComBtnDisable("btn_run");
        ComBtnDisable("btn_new");           
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
        if(form.to_if_dt.value==""){
            form.to_if_dt.value=ComTrimAll(value," ", "-", ":");
        }
        form.to_if_dt.select(); 
    }
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
function obj_keypress(){
    switch(ComGetEvent("dataformat")){
    case "float":
        // Only number or '.'.
        ComKeyOnlyNumber(ComGetEvent(), ".");
        break;
    case "ymd":
        // Only number or '-'.
        ComKeyOnlyNumber(ComGetEvent());
        break;
    case "eng":
        // Only Alphabet or number.
        ComKeyOnlyAlphabet();
        break;
    case "engdn":
        // Only lower case.
        ComKeyOnlyAlphabet('lower');
        break;
    case "engup":
        // Only upper case.
        ComKeyOnlyAlphabet('upper');
        break;
    case "num":
        // Only number(integer, date, time).
        ComKeyOnlyNumber('num');
        break;
    case "uppernum":
        // Only upper case or number. 
        ComKeyOnlyAlphabet('uppernum');
        break;
    default:
        // Only upper case.
        ComKeyOnlyAlphabet('upper');
    }
} 
