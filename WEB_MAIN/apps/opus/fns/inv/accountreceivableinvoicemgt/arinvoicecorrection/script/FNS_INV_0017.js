/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0017.js
*@FileTitle  : Invoice Customer Correction by Date
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/05
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
//  common global valiables
var sheetObjects=new Array();
var sheetCnt=0;
// define button click event handler */
document.onclick=processButtonClick;
/** 
 *  event handler branch proecss by button name <br>
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
    var sheetObject2=sheetObjects[1];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_retrieve":
                doActionIBSheet(sheetObject1,document.form,IBSEARCH);   
                break;
            case "btn_new":
                ComBtnEnable("btn_save");
                sheetObject1.RemoveAll();
                sheetObject2.RemoveAll();
                ComResetAll();
                formObject.act_cust_cnt_cd.readOnly=false;
                formObject.act_cust_seq.readOnly=false;
                document.all.act_cust_cnt_cd.style.color="#606060";
                document.all.act_cust_seq.style.color="#606060";
                document.all.act_cust_cnt_cd.style.fontWeight="normal";
                document.all.act_cust_seq.style.fontWeight="normal";
                doActionIBSheet(sheetObject1,document.form,IBSEARCH_ASYNC01);       
                fn_act_cust_chg();  
                form.bl_inv_if_dt.focus();
				checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
                break; 
            case "btn_save":
            	if (ComShowCodeConfirm("COM130504")) {   
            		doActionIBSheet(sheetObject1,document.form,IBSAVE);
            	} else {
            		break;
            	}
                break; 
            case "btn_actcust":
                var param='?pgmNo=FNS_INV_0013&cust_cnt_cd='+formObject.act_cust_cnt_cd.value+'&cust_seq='+formObject.act_cust_seq.value+'&pop_yn=Y';
                var Row=1;
                var Col=1;
                ComOpenPopup('/opuscntr/FNS_INV_0013.do'+param, 900, 700, '', '0,0', false, false, "", "", 0);
                break; 
            case "btn_custNm":
                param='?pgmNo=FNS_INV_0086&cust_seq='+formObject.act_cust_seq.value+'&cust_cnt_cd='+formObject.act_cust_cnt_cd.value;
                ComOpenPopup('/opuscntr/FNS_INV_0086.do' + param, 900, 450, 'getFNS_INV_0086_1', '1,0', false, false, Row, Col, 0);
                break; 
            case "btns_calendar": // calandar button
                var cal=new ComCalendar();
                cal.select(formObject.bl_inv_if_dt, 'yyyy-MM-dd');
                break;
            case "btn_next":
                if(sheetObject1.RowCount()>0&&sheetObject1.GetSelectRow()<sheetObject1.RowCount()){
                    sheetObject1.SelectCell(sheetObject1.GetSelectRow()+1,1);
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'chg_flg')=='Y'){
                        document.all.act_cust_cnt_cd.style.color="red";
                        document.all.act_cust_seq.style.color="red";
                        document.all.act_cust_cnt_cd.style.fontWeight="bold";
                        document.all.act_cust_seq.style.fontWeight="bold";
                    }else{
                        document.all.act_cust_cnt_cd.style.color="#606060";
                        document.all.act_cust_seq.style.color="#606060";
                        document.all.act_cust_cnt_cd.style.fontWeight="normal";
                        document.all.act_cust_seq.style.fontWeight="normal";
                    }
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'save_flg')=='Y'){
                        ComBtnDisable("btn_save");
                        sheetObject2.SetEditable(0);
                        formObject.act_cust_cnt_cd.readOnly=true;
                        formObject.act_cust_seq.readOnly=true;
                        document.all.btn_custNm.style.visibility="hidden";
                    }else{
                        ComBtnEnable("btn_save");
                        sheetObject2.SetEditable(1);
                        formObject.act_cust_cnt_cd.readOnly=false;
                        formObject.act_cust_seq.readOnly=false;
                        document.all.btn_custNm.style.visibility="visible";
                    }
                }
                break;
            case "btn_back":
                if(sheetObject1.RowCount()>0&&sheetObject1.GetSelectRow()>1){
                    sheetObject1.SelectCell(sheetObject1.GetSelectRow()-1,1);
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'chg_flg')=='Y'){
                        document.all.act_cust_cnt_cd.style.color="red";
                        document.all.act_cust_seq.style.color="red";
                        document.all.act_cust_cnt_cd.style.fontWeight="bold";
                        document.all.act_cust_seq.style.fontWeight="bold";
                    }else{
                        document.all.act_cust_cnt_cd.style.color="#606060";
                        document.all.act_cust_seq.style.color="#606060";
                        document.all.act_cust_cnt_cd.style.fontWeight="normal";
                        document.all.act_cust_seq.style.fontWeight="normal";
                    }
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'save_flg')=='Y'){
                        ComBtnDisable("btn_save");
                        sheetObject2.SetEditable(0);
                        formObject.act_cust_cnt_cd.readOnly=true;
                        formObject.act_cust_seq.readOnly=true;
                        document.all.btn_custNm.style.visibility="hidden";
                    }else{
                        ComBtnEnable("btn_save");
                        sheetObject2.SetEditable(1);
                        formObject.act_cust_cnt_cd.readOnly=false;
                        formObject.act_cust_seq.readOnly=false;
                        document.all.btn_custNm.style.visibility="visible";
                    }
                }
                break;
            case "btn_back_1":
                if(sheetObject1.RowCount()>0&&sheetObject1.GetSelectRow()>1){
                    sheetObject1.SelectCell(1,1);
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'chg_flg')=='Y'){
                        document.all.act_cust_cnt_cd.style.color="red";
                        document.all.act_cust_seq.style.color="red";
                        document.all.act_cust_cnt_cd.style.fontWeight="bold";
                        document.all.act_cust_seq.style.fontWeight="bold";
                    }else{
                        document.all.act_cust_cnt_cd.style.color="#606060";
                        document.all.act_cust_seq.style.color="#606060";
                        document.all.act_cust_cnt_cd.style.fontWeight="normal";
                        document.all.act_cust_seq.style.fontWeight="normal";
                    }
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'save_flg')=='Y'){
                        ComBtnDisable("btn_save");
                        sheetObject2.SetEditable(0);
                        formObject.act_cust_cnt_cd.readOnly=true;
                        formObject.act_cust_seq.readOnly=true;
                        document.all.btn_custNm.style.visibility="hidden";
                    }else{
                        ComBtnEnable("btn_save");
                        sheetObject2.SetEditable(1);
                        formObject.act_cust_cnt_cd.readOnly=false;
                        formObject.act_cust_seq.readOnly=false;
                        document.all.btn_custNm.style.visibility="visible";
                    }
                }
                break;
            case "btn_next_1":
                if(sheetObject1.RowCount()>0&&sheetObject1.GetSelectRow()<sheetObject1.RowCount()){
                    sheetObject1.SelectCell(sheetObject1.RowCount(),1);
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'chg_flg')=='Y'){
                        document.all.act_cust_cnt_cd.style.color="red";
                        document.all.act_cust_seq.style.color="red";
                        document.all.act_cust_cnt_cd.style.fontWeight="bold";
                        document.all.act_cust_seq.style.fontWeight="bold";
                    }else{
                        document.all.act_cust_cnt_cd.style.color="#606060";
                        document.all.act_cust_seq.style.color="#606060";
                        document.all.act_cust_cnt_cd.style.fontWeight="normal";
                        document.all.act_cust_seq.style.fontWeight="normal";
                    }
                    if(sheetObject1.GetCellValue(sheetObject1.GetSelectRow(),'save_flg')=='Y'){
                        ComBtnDisable("btn_save");
                        sheetObject2.SetEditable(0);
                        formObject.act_cust_cnt_cd.readOnly=true;
                        formObject.act_cust_seq.readOnly=true;
                        document.all.btn_custNm.style.visibility="hidden";
                    }else{
                        ComBtnEnable("btn_save");
                        sheetObject2.SetEditable(1);
                        formObject.act_cust_cnt_cd.readOnly=false;
                        formObject.act_cust_seq.readOnly=false;
                        document.all.btn_custNm.style.visibility="visible";
                    }
                }
                break;
            case "btns_port": //port retrieve button
                var loc_cd_val=formObject.port_cd.value;
                var loc_port_ind_val="1";
                var dispaly="1,0,1,1,1,1,1,1,1,1,1,1";
                var classId="COM_ENS_051";
                var param='?loc_cd='+loc_cd_val+'&classId='+classId;
                ComOpenPopup('/opuscntr/COM_ENS_051.do' + param, 1050, 500, 'getCOM_ENS_051_1', dispaly);
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
 * add IBSheet Object array <br>
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
 *  define onLoad event handler<br> 
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
    doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC01);        
    form.bl_inv_if_dt.focus();
	checkTaxCountry();  // Whether or not the invoice tax country (2017.12.08)
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
    switch(sheetNo) {
        case 1:      //sheet1 init
            with(sheetObj){
                var HeadTitle="|act_cust_cnt_cd|act_cust_seq|cust_lgl_eng_nm|vvd|svc_scp_cd|por_cd|pol_cd|pod_cd|del_cd|bl_src_no|ar_if_no|bkg_no|shpr_cust_cnt_cd|shpr_cust_seq|shpr_cust_nm|shpr_cust_addr|fwdr_cust_cnt_cd|fwdr_cust_seq|fwdr_cust_nm|fwdr_cust_addr|bl_inv_if_dt|cust_nm|inv_rmk|sail_arr_dt|io_bnd_cd|ofc_cd|gl_eff_dt|bl_inv_cfm_dt|chg_flg|save_flg|sail_dt";
                
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_cnt_cd",   KeyField:1 },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"act_cust_seq",      KeyField:1 },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cust_lgl_eng_nm" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"vvd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"svc_scp_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"por_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"pod_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"del_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"bl_src_no" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"ar_if_no" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"bkg_no" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_cnt_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_seq" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_nm" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"shpr_cust_addr" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_cnt_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_seq" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_nm" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"fwdr_cust_addr" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_if_dt" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cust_nm" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"inv_rmk" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sail_arr_dt" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"io_bnd_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"ar_ofc_cd" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"gl_eff_dt" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"bl_inv_cfm_dt" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"chg_flg" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"save_flg" },
                            {Type:"Text",     Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"sail_dt" } ];
                                           
                InitColumns(cols);
                SetSheetHeight(260);
                SetEditable(1);
                //SetWaitImageVisible(0);
                SetVisible(0);
            }

        break;
        case 2:      //container
            with(sheetObj){
                var HeadTitle="|Sel.|Cust. Code|Cust. Name|Address|Zip Code|Credit Office";
                
                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
                            {Type:"Radio",     Hidden:0, Width:40,   Align:"Center",  ColMerge:1,   SaveName:"sel" },
                            {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:1,   SaveName:"cust_cd",          KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:300,  Align:"Left",    ColMerge:1,   SaveName:"cust_lgl_eng_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:550,  Align:"Left",    ColMerge:1,   SaveName:"addr",             KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"zip_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:"cr_clt_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                                           
                InitColumns(cols);
                
                SetEditable(1);
                SetEditableColorDiff(0);
//                SetSheetHeight(220);
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
        case IBSEARCH_ASYNC01: // AR_OFFICE_LIST retrieve
            ComOpenWait(true);
            //formObj.f_cmd.value=SEARCH02;
            formObj.f_cmd.value=SEARCH17;
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
                    formObj.ofc.value=ar_ofc_cd_str;
                    document.form.ofc_cd.value=document.form.ofc.value;   
                    formObj.act_cust_cnt_cd.value=arrStr2[10];
                    formObj.act_cust_seq.value=arrStr2[11];
                }
            }
            ar_ofc_cd.SetSelectText(ar_ofc_cd_str);
//            ar_ofc_cd.text=ar_ofc_cd_str;   
            InvOpenWait(false, true);
            break;
        case IBSEARCH:      //retrieve
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.old_act_cust_cnt_cd.value=formObj.act_cust_cnt_cd.value;
                formObj.old_act_cust_seq.value=formObj.act_cust_seq.value;
                document.all.act_cust_cnt_cd.style.color="#606060";
                document.all.act_cust_seq.style.color="#606060";
                document.all.act_cust_cnt_cd.style.fontWeight="normal";
                document.all.act_cust_seq.style.fontWeight="normal";
                formObj.f_cmd.value=SEARCH;
                
                sheetObj.DoSearch("FNS_INV_0017GS.do", FormQueryString(formObj));
                
//                var fm_yard_value=ComSearchEtcData(sheetObj, "FNS_INV_0017GS.do",FormQueryString(formObj), 'nod');
//       			var sXml=sheetObj.GetSearchData("FNS_INV_0017GS.do",FormQueryString(formObj));       
//       			var arrXml=sXml.split("|$$|");
//                sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
//                var sXml=sheetObj.GetSearchData("FNS_INV_0017GS.do" , FormQueryString(formObj));
//				var arrXml=sXml.split("|$$|");
//					sheetObjects[0].LoadSearchData(sXml);
                
//                if (sXml.indexOf("ERROR") < 1){
//                	alert(1);
//                    if ( arrXml[0] != null){
//                    	alert(2);
//                        sheetObjects[0].LoadSearchData(arrXml[0],{Sync:1} );
//                        alert(3);
//                        if(sheetObjects[0].RowCount()==0){
//                            ComShowCodeMessage("COM130401");
//                            formObj.bl_inv_if_dt.select();
//                            ComOpenWait(false);
//                        }
//                    }
//                }
//                ComOpenWait(false);
            }
            break;
        case IBSEARCH_ASYNC02:      //retrieve
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH01;
            if (formObj.frm_cust_nm.value!=""){
                sheetObj.DoSearch("FNS_INV_0017GS.do", FormQueryString(formObj) );
            }else{
                sheetObjects[1].RemoveAll();
            }
            InvOpenWait(false, true);
        break;
        case IBSAVE:        //save
        if(validateForm(sheetObj,formObj,sAction)){
            formObj.f_cmd.value=MULTI;
            
            for(i=1;i<=sheetObj.RowCount();i++){
                if(sheetObj.GetCellValue(i,"ibflag")=="U"){
                    sheetObj.SetCellValue(i,"save_flg","Y",0);
                }
            }
            ComBtnDisable("btn_save");
            sheetObjects[1].SetEditable(0);
            formObj.act_cust_cnt_cd.readOnly=true;
            formObj.act_cust_seq.readOnly=true;
            document.all.btn_custNm.style.visibility="hidden";
            
            InvOpenWait(true, true);  
			setTimeout( function () {				
				//sheetObj.DoSave("FNS_INV_0017GS.do", FormQueryString(formObj)+ "&" + ComSetPrifix(sheetObjects[0].GetSaveString(),"sheet1_"));		
				sheetObj.DoSave("FNS_INV_0017GS.do", {Param:FormQueryString(formObj)+ "&" + ComSetPrifix(sheetObjects[0].GetSaveString(),"sheet1_"),Quest:"false", Sync:1} );
			    InvOpenWait(false, true);
			} , 100);
            
        }   
        break;
		case IBSEARCH_ASYNC10: // Tax country retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];
			formObj.f_cmd.value=SEARCH04;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0017GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
			formObj.tax_cnt_flg.value=sStr;
			break;
    }
}
/**
 * function called when select sheet1 cell   <br>
 * <br><b>Example : </b>
 * <pre>
 *   sheet1_OnSelectCell(sheetObjects[0],1, 1, 2, 1);
 * </pre>
 * @param object sheetObj
 * @param number OldRow
 * @param number OldCol
 * @param number NewRow
 * @param number NewCol
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 
function sheet1_OnSearchEnd(sheetObj, Code, Msg) { 
    InvOpenWait(false,true);	
	if (sheetObj.RowCount()<= 0) {
		ComShowCodeMessage("COM130401"); //msgs["CNI00013"]="There is no data to search.";
	}
}

function sheet1_OnSelectCell(sheetObj,OldRow, OldCol, NewRow, NewCol){
// 왜 하는지 몰라 주석처리함    sheetObjects[1].removeAll(); 
    IBS_CopyRowToForm(sheetObjects[0],document.form, NewRow,"frm_") ;
    form.cust_lgl_eng_nm.value=sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),"cust_lgl_eng_nm");
    if(sheetObj.RowCount()>0){
        form.act_cust_cnt_cd.value=form.frm_act_cust_cnt_cd.value;
        form.act_cust_seq.value=ComLpad(form.frm_act_cust_seq.value.trim(), 6, "0");
    }
    cntSheetStat(sheetObj);
    if(sheetObj.RowCount()>0){
        doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC02);    
    }
}
/**
 * function called when sheet2 data change  <br>
 * <br><b>Example : </b>
 * <pre>
 *   sheet2_OnChange(sheetObjects[0],1, 1,'1');
 * </pre>
 * @param object sheetObj
 * @param number Row
 * @param number Col
 * @param string Value
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 
function sheet2_OnChange(sheetObj,Row,Col,Value){
    if(sheetObj.ColSaveName(Col) == "sel"&&Value==1){
        document.form.act_cust_cnt_cd.value=sheetObj.GetCellValue(Row,"cust_cd").substring(0,2);
        document.form.act_cust_seq.value=sheetObj.GetCellValue(Row,"cust_cd").substring(2,8);
        document.all.act_cust_cnt_cd.style.color="red";
        document.all.act_cust_seq.style.color="red";
        fn_act_cust_chg();
        sheetObj.SetCellValue(Row,"chg_flg","Y",0);
    }
}
/**
 * function called when ar_ofc_cd change  <br>
 * 해당 office act_cust_cnt_cd,act_cust_seq 세팅<br>
 * <br><b>Example : </b>
 * <pre>
 *   ar_ofc_cd_OnChange(obj,oldindex, oldtext, oldcode , newindex, newtext , newcode);
 * </pre>
 * @param object comboObj
 * @param string value
 * @param string text
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 

function ar_ofc_cd_OnChange(obj,oldindex, oldtext, oldcode , newindex, newtext , newcode){ 
    sheetObjects[0].RemoveAll();
    sheetObjects[1].RemoveAll();
    document.all.act_cust_cnt_cd.style.color="#606060";
    document.all.act_cust_seq.style.color="#606060";
    document.all.act_cust_cnt_cd.style.fontWeight="normal";
    document.all.act_cust_seq.style.fontWeight="normal";
    arrStr=newcode.split("^");
    document.form.act_cust_cnt_cd.value=arrStr[10];
    document.form.act_cust_seq.value=arrStr[11];
    document.form.ofc.value=arrStr[1];
    fn_act_cust_chg();      

    checkTaxCountry();
}
/**
 * page number setting<br>
 * <br><b>Example : </b>
 * <pre>
 *   cntSheetStat(sheetObjects[0]);
 * </pre>
 * @param object sheetObj
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 
function cntSheetStat(sheetObj){
    document.form.cur_cnt.value=sheetObj.GetSelectRow();
    document.form.all_cnt.value=sheetObj.RowCount();
}
/**
 * function called when form inv_rmk change <br>
 * <br><b>Example : </b>
 * <pre>
 *   fn_inv_rmk_chg('비고');
 * </pre>
 * @param string val
 * @author Choi Do Soon
 * @version 2009.10.06
 */ 
function fn_inv_rmk_chg(val){
    if(sheetObjects[0].GetSelectRow()>0){
        sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"inv_rmk",val);
    }
}
/**
 * function called when Pop up(FNS_INV_0086) UI open<br>
 * <br><b>Example : </b>
 * <pre>
 *    getFNS_INV_0086_1(rowArray, 1, 1);
 * </pre>
 * @param String rowArray
 * @param number row
 * @param number col
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function getFNS_INV_0086_1(rowArray, row, col) {         
    var colArray=rowArray[0];   
    document.form.act_cust_cnt_cd.value=colArray[8];
    document.form.act_cust_seq.value=ComLpad(colArray[9], 6, '0');
    fn_act_cust_chg();
}
/**
 * create combo<br>
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
 * function called when act_cust_cnt_cd, act_cust_seq change<br>
 * <br><b>Example : </b>
 * <pre>
 *    fn_act_cust_chg();
 * </pre>
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function fn_act_cust_chg(){
    if(document.form.act_cust_seq.value!=''){
    	document.form.act_cust_seq.value=ComLpad(document.form.act_cust_seq.value.trim(), 6, "0");
    }
    document.form.cust_cnt_cd.value=document.form.act_cust_cnt_cd.value;
    document.form.cust_seq.value=document.form.act_cust_seq.value;
    document.form.ofc_cd.value=document.form.ofc.value;
    document.form.f_cmd.value=SEARCH03;
    var cust_nm="";
    if ((form.cust_cnt_cd.value.trim() != "" )&&(form.cust_seq.value.trim() != "")&&(form.cust_seq.value.trim() != "000000")){
        var sXml=sheetObjects[0].GetSearchData("INVCommonGS.do", FormQueryString(document.form));
        cust_nm=ComGetEtcData(sXml,"cust_eng_nm");
        if (cust_nm == undefined) {
            form.act_cust_cnt_cd.value="";
            form.cust_lgl_eng_nm.value="";
            form.act_cust_seq.value="";
            ComShowCodeMessage("INV00008");
            form.act_cust_cnt_cd.focus();
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_cnt_cd",form.act_cust_cnt_cd.value);
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_seq",form.act_cust_seq.value);
            if(sheetObjects[0].GetSelectRow()>0&&sheetObjects[0].RowCount()>0){
                document.all.act_cust_cnt_cd.style.color="#606060";
                document.all.act_cust_seq.style.color="#606060";
                document.all.act_cust_cnt_cd.style.fontWeight="normal";
                document.all.act_cust_seq.style.fontWeight="normal";
            }
            return false;                     
        } 
        delt_flg=ComGetEtcData(sXml,"delt_flg");
        if(delt_flg=='Y'){
            form.act_cust_cnt_cd.value="";
            form.cust_lgl_eng_nm.value="";
            form.act_cust_seq.value="";
            form.cust_seq.value="";
            ComShowCodeMessage("INV00060");
            form.act_cust_cnt_cd.focus();
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_cnt_cd",form.act_cust_cnt_cd.value);
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_seq",form.act_cust_seq.value);
            if(sheetObjects[0].GetSelectRow()>0&&sheetObjects[0].RowCount()>0){
                document.all.act_cust_cnt_cd.style.color="#606060";
                document.all.act_cust_seq.style.color="#606060";
                document.all.act_cust_cnt_cd.style.fontWeight="normal";
                document.all.act_cust_seq.style.fontWeight="normal";
            }
            return false;
        }
        form.cust_lgl_eng_nm.value=cust_nm;
        if(sheetObjects[0].GetSelectRow()>0&&sheetObjects[0].RowCount()>0){
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_cnt_cd",form.act_cust_cnt_cd.value);
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_seq",form.act_cust_seq.value);
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"cust_lgl_eng_nm",cust_nm);
            document.all.act_cust_cnt_cd.style.color="red";
            document.all.act_cust_seq.style.color="red";
            document.all.act_cust_cnt_cd.style.fontWeight="bold";
            document.all.act_cust_seq.style.fontWeight="bold";
            sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"chg_flg","Y",0);
        }else{
            document.all.act_cust_cnt_cd.style.color="#606060";
            document.all.act_cust_seq.style.color="#606060";
            document.all.act_cust_cnt_cd.style.fontWeight="normal";
            document.all.act_cust_seq.style.fontWeight="normal";
        }
        if(sheetObjects[0].GetSelectRow()>0&&sheetObjects[0].RowCount()>0){
            if(sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_cnt_cd")==form.old_act_cust_cnt_cd.value
            &&ComLpad(sheetObjects[0].GetCellValue(sheetObjects[0].GetSelectRow(),"act_cust_seq"),6,"0")==ComLpad(form.old_act_cust_seq.value,6,"0")){
                sheetObjects[0].SetRowStatus(sheetObjects[0].GetSelectRow(),"R");
                ComShowCodeMessage("INV00031");
                document.all.act_cust_cnt_cd.style.color="#606060";
                document.all.act_cust_seq.style.color="#606060";
                document.all.act_cust_cnt_cd.style.fontWeight="normal";
                document.all.act_cust_seq.style.fontWeight="normal";                    
                form.act_cust_cnt_cd.focus();
            }
        }
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
 * @author Choi Do Soon
 * @version 2009.11.16
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch(sAction) {
        case IBSEARCH:        //retrieve                
        if( document.form.bl_inv_if_dt.value.trim() == "" || document.form.ofc_cd.value.trim() == "" ) {
            ComShowCodeMessage("INV00004");
            document.form.bl_inv_if_dt.focus();
            return false;
        } 
        if( document.form.act_cust_cnt_cd.value.trim() == "" || document.form.act_cust_seq.value.trim() == "" ) {
            ComShowCodeMessage("INV00004");
            document.form.act_cust_cnt_cd.focus();
            return false;
        } 
        break;
        case IBSAVE:        //save
        
        if(sheetObj.RowCount() < 1) {
        	ComShowCodeMessage("INV00091");
        	return false;
        }	
        	
        for(i=1;i<=sheetObj.RowCount();i++){
            if(sheetObj.GetCellValue(i,"ibflag")=="U"){
                if(sheetObj.GetCellValue(i,"act_cust_cnt_cd")==form.old_act_cust_cnt_cd.value
                &&ComLpad(sheetObj.GetCellValue(i,"act_cust_seq"),6,"0")==ComLpad(form.old_act_cust_seq.value,6,"0")){
                    ComShowCodeMessage("INV00031");
                    sheetObj.SetRowStatus(i,"R");
                    return false;
                }
                if(sheetObj.GetCellValue(i,"act_cust_cnt_cd")==''||sheetObj.GetCellValue(i,"act_cust_seq")==''){
                    ComShowCodeMessage("INV00004");
                    return false;
                }
            }
        }
        break;
        }
    }     
    return true;    
}
/**
 * setting popup (FNS_INV_0013) data : act_cust_cnt_cd,act_cust_seq <br>
 * <br><b>Example : </b>
 * <pre>
 *   getPopData(rowArray);
 * </pre>
 * @param String rowArray
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function getPopData(rowArray){
    var colArray=rowArray[0];   
    document.form.act_cust_cnt_cd.value=colArray[1];
    document.form.act_cust_seq.value=colArray[2];
}
/**
 * masked value setting<br>
 * <br><b>Example : </b>
 * <pre>
 *   fn_ComGetMaskedValue('2009-01-01');
 * </pre>
 * @param String value
 * @author Choi Do Soon
 * @version 2009.10.06
 */
function fn_ComGetMaskedValue(value) {
    var value=form.bl_inv_if_dt.value;
    value=ComReplaceStr(value,"-","");
    if(value!=''){
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
        form.bl_inv_if_dt.value=ret;
    }
}
/**KEY Event<br>
 * @author Choi Do Soon
 * @version 2009.11.10
 */
function initControl() {
    axon_event.addListenerFormat('keypress',       'obj_keypress',    form); //- 키보드 입력할때
    axon_event.addListenerForm ('focusout', 'obj_focusout', form);
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
        //lowercase only
        ComKeyOnlyAlphabet('lower');
        break;
    case "engup":
        //uppercase only
        ComKeyOnlyAlphabet('upper');
        break;
    case "num":
        //number only
        ComKeyOnlyNumber('num');
        break;
    case "uppernum":
        //uppercase+number 
        ComKeyOnlyAlphabet('uppernum');
        break;
    default:
        //uppercase only
        ComKeyOnlyAlphabet('upper');
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
            	formObject.cust_lgl_eng_nm.value = '';
            }
        case "act_cust_cnt_cd":
            if(formObject.act_cust_cnt_cd.value == '' || formObject.act_cust_seq.value == ''){
            	formObject.cust_lgl_eng_nm.value = '';
            }
        	
        break;
    }
}
 /** 
 * handlig Popup(COM_ENS_051_1)<br>
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
    document.all.port_cd.value=colArray[3];
}

function resizeSheet(){
	ComResizeSheet(sheetObjects[1],200);
}

/**Tax Invoice Exemption (2017-12-08)*/
function fn_tax_exp_chk(){
	 if(document.form.tax_exp_chk.checked ){
		 document.form.tax_exp_flg.value = "Y";
     }else{
  	     document.form.tax_exp_flg.value = "N"; 
     }
}
/**Check Tax Country HJ.Jeong (2017-12-08)*/
function checkTaxCountry() {

	 var sheetObject=sheetObjects[0];
	 var formObject=document.form;	 
	 doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC10);
	 if(formObject.tax_cnt_flg.value == "Y") {
		 document.getElementById('tax_cnt_area').style.display="block";
	 } else{
		 document.getElementById('tax_cnt_area').style.display="none";
	 }

	 formObject.tax_exp_chk.checked = false;
	 formObject.tax_exp_flg.value = "N";

}
