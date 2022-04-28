/* 
========================================================= 
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0052.js
*@FileTitle  : customer 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/11/11
========================================================= 
*/  
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
               MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
               OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/** Common global variable */
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var create_cust_cd='';
var init_delt_flg = "N";
var loadChk = "";

var popupcheck = 'N';

/** Event handler processing by button click event */
document.onclick=processButtonClick;
/** Event handler processing by button name */
function processButtonClick() {
    /*****Case more than two additional sheets tab sheet is used to specify a variable *****/
    var sheetObject=sheetObjects[0];
    var sheetObject1=sheetObjects[1];
    var sheetObject2=sheetObjects[2];
    /** **************************************************** */
    var formObj=document.form;
    try {
        var srcName=ComGetEvent("name");
        if(srcName != null && srcName.indexOf('btn_com') != -1) {
            if(window.event.srcElement.style.cursor == "default") return;
        }
        switch (srcName) {
        case "btn_Retrieve":
            if(formObj.rqst_no.value != '' && formObj.cust_cd.value == '')
                doActionIBSheet(sheetObjects[0], formObj, SEARCH12);
            else
                doActionIBSheet(sheetObjects[0], formObj, SEARCH);
            break;
        case "btn_Save":  
            doActionIBSheet(sheetObjects[0],formObj,MULTI); 
            break;
        case "btn_Close":
        	ComClosePopup(); 
            break;
        case "btn_Request":
            doActionIBSheet(sheetObjects[0],formObj,MULTI03); 
            break;
        case "btn_New":
        	init();
            break;  
        case "btn_CheckDup":
            var param="rqst_no=" + ComGetObjValue(formObj.rqst_no);
            param=param + "&cust_cnt_cd=" + formObj.cust_cnt_cd.value+" &cust_nm=" + formObj.cust_lgl_eng_nm.value+"&loc_cd=" 
                          + formObj.loc_cd.value+" &cust_rgst_no=" + formObj.cust_rgst_no.value;
            var rtn=ComOpenPopup('/opuscntr/BCM_CCD_1035.do?' + param, 860, 470, '', '0,0', true); 
            break;
        case "btn_com_ens_041":
            if(formObj.creflag.value != "Y"){
               var param="";
               param=param + "&" + "cust_seq=" + form.cust_seq.value+"&mdm_yn="+ formObj.mdm_yn.value;
               ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 780, 470, 'setCallBack0B2', '1,0,1,1,1,1,1,1', true);
            }
            break;
        case "btn_com_ens1_041":
           var param="";
           param=param + "&" + "cust_seq=" + form.cnsd_cust_seq.value+"&mdm_yn="+ formObj.mdm_yn.value;
           ComOpenPopup('/opuscntr/COM_ENS_041.do?' + param, 768, 450, 'setCallBack0B2Cnsd', '1,0,1,1,1,1,1,1', true);
            break;
        case "btn_com_ens_0M1":
            var param="";
            param=param + "&" + "cust_cnt_cd=" + form.cust_cnt_cd.value;
            ComOpenPopup('/opuscntr/COM_ENS_0M1.do?' + param, 780, 470, 'setCallBack0B5', '1,0,1,1,1,1,1,1', true);
            break;
         case "btn_com_ens_051":
            var param="";
            param=param + "&" + "loc_cd=" + form.loc_cd.value;
            ComOpenPopup('/opuscntr/COM_ENS_051.do?' + param, 780, 470, 'setCallBack0B1', '1,0,1,1,1,1,1,1', true);
            break;
         case "btn_com_ens_071":
            var param="";
            param=param + "&" + "ofc_cd=" + form.ofc_cd.value;
            ComOpenPopup('/opuscntr/COM_ENS_071.do?' + param, 780, 470, 'setCallBack0B3', '1,0,1,1,1,1,1,1', true);
            break;
         case "btn_com_ens_0C1":
            var param="";
            param=param + "&" + "vndr_seq=" + form.vndr_seq.value;
            ComOpenPopup('/opuscntr/COM_ENS_0C1.do?' + param, 780, 470, 'setCallBack0B4', '1,0,1,1,1,1,1,1', true);
            break;
         case "btn_com_ens_n13":
            var param="";
            param=param + "&" + "curr_cd=" + form.capi_curr_cd.value;
            ComOpenPopup('/opuscntr/COM_ENS_N13.do?' + param, 780, 470, 'setCallBack0B6', '1,0,1,1,1,1,1,1', true);
            break;
        case "btn_com_com_0006":
            var param="";                     
            param=param + "cust_grp_id=" + form.cust_grp_id.value+"&mdm_yn="+ form.mdm_yn.value;              
            ComOpenPopup('/opuscntr/COM_COM_0006.do?' + param, 780, 420, 'setCustGrpId', '1,0,1,1,1,1,1,1', true);              
            break;
         case "btn_com_ens_0G1":
            var param="";
            ComOpenPopup('/opuscntr/COM_ENS_0G1.do', 600, 430, 'setCallBack0B9', "1,0,1", true);
            break;
         case "btn_opn_dt_cal": //Calendar
            var cal=new ComCalendar();                
            cal.select(document.form.key_acct_st_eff_dt, 'yyyy-MM-dd');
            break; 
         case "btn_clz_dt_cal": //Calendar
            var cal=new ComCalendar();                
            cal.select(document.form.key_acct_end_eff_dt, 'yyyy-MM-dd');
            break;
         case "btn_opn_dt_cal_1": //Calendar
            var cal=new ComCalendar();                
            cal.select(document.form.fndt_dt, 'yyyy-MM-dd');
            break; 
         case "btn_opn_dt_cal_2": //Calendar
            var cal=new ComCalendar();                
            cal.select(document.form.nvocc_bd_st_eff_dt, 'yyyy-MM-dd');
            break;
         case "btn_opn_dt_cal_3": //Calendar
            var cal=new ComCalendar();                
            cal.select(document.form.nvocc_bd_end_eff_dt, 'yyyy-MM-dd');
            break; 
         case "btn_opn_dt_cal_4": //Calendar
            var cal=new ComCalendar();                
            cal.select(document.form.sls_delt_eff_dt, 'yyyy-MM-dd');
            break; 
         case "btn_Create":
             ComResetAll(); /** addr & cntc pnt **/
             doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
            cust_grp_hrchy_cd.SetSelectCode("I", false);  // ó�� �ڵ� ��� Customer Hierarchy�� Individual�� Setting
            cust_grp_hrchy_cd.SetEnable(0);               // Individual Setting ��, ��Ȱ��ȭ ó��
            cust_div_cd.SetEnable(true);                  // Dummy �ڵ� ��ȸ�� Individual Group Column ��ȸ �Ұ� 
            nmd_cust_flg.SetEnable(true); // SR0044402 Only When click Create btn, nmd_cust_flg selection is enabled.  
            formObj.creflag.value="Y";
            formObj.saveflag.value="N";
		    formObj.cntr_div_flg.value="Y";
            formObj.cust_cd.readOnly=true;
            formObj.lgcy_cd.readOnly=true;
            ComEnableObject(formObj.crm_if_flg, true);
            formObj.cust_cd.style.backgroundColor="#bebebe";
            ComBtnDisable("btn_Create");
            ComBtnEnable("btn_Save");
            ComEnableObject(formObj.btn_com_ens_041, false);
            formObj.sez_desc.disabled = true;
            sheetObjects[1].SetColProperty(0, "ste_cd", {KeyField:"0"});
            break;
         /** addr **/
         case "btn_add2":
//             if (formObj.creflag.value == "Y" && sheetObject1.RowCount()>=1){
//                 return;
//             }
             var newRow=setDataInsert(sheetObject1, 1);
             break;
         case "btn_del2":
             doActionIBSheet2(sheetObjects[1],formObj,IBDELETE);
             break;
         /** cntc_pnt **/
         case "btn_add3":
//             if (formObj.creflag.value == "Y" && sheetObjects[2].RowCount()>=1){
//                 return;
//             }
             doActionIBSheet3(sheetObjects[2],formObj,IBINSERT);            
             break;
         case "btn_del3":
             doActionIBSheet3(sheetObjects[2],formObj,IBDELETE);    
             break;
         case "btn_srep_search":
				if(window.event.srcElement.style.cursor == "default") return;
         	var v1=formObj.mdm_yn.value;
         	var sUrl="/opuscntr/COM_COM_0008.do?srep_cd=" + formObj.srep_cd.value + "&mdm_yn="+v1 + "&delt_flg=N";
             var rVal=ComOpenPopup(sUrl, 780, 420, "setSrepCd", "1,0,1", true);            	
 			break;
         case "btns_calendar1":
         	//calendar button
         	 var cal=new ComCalendar();
              cal.select(formObj.mot_eff_dt,'yyyy-MM-dd');
              break;
         case "btns_calendar2":               
             var cal=new ComCalendar();
             cal.select(formObj.mot_exp_dt,'yyyy-MM-dd');
             break;
         case "btn_upload":               
//        	 doActionIBSheet(sheetObjects[0],formObj,COMMAND01);
        	 ComOpenPopup("BCM_CCD_0056.do?cust_cd=" + formObj.cust_cd.value +"&rqst_no=" + formObj.rqst_no.value +"&certi_sav_id=" + formObj.certi_sav_id.value , 580, 520, "getReturnVal", "1,0", true);
        	 break;
        }
    } catch (e) {
        if (e == "[object Error]") {
            ComShowCodeMessage("COM12111");
        } else {
            ComShowMessage(e.message);
        }
    }
}

function getReturnVal(rtnVal){
	var formObj=document.form;
	if (rtnVal.file_sav_id != null) { 
		formObj.certi_flg.value = rtnVal.certi_flg;
		formObj.certi_sav_id.value = rtnVal.file_sav_id;
	}
}

function setSrepCd(rowArray) {
	//var sheetObj=sheetObjects[0];
    //var formObj=document.form;
   	var colArray=rowArray[0];
   	document.form.srep_cd.value=colArray[2];
	//doActionIBSheet(sheetObjects[0],formObj,SEARCH02);
}

//===================================================================================
//UI Object Event Handler
// ===================================================================================    
/**
 * registering IBSheet Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setSheetObject(sheet_obj) {
    sheetObjects[sheetCnt++]=sheet_obj;
}
/**
 * registering IBCombo Object as list
 * adding process for list in case of needing batch processing with other items 
 * defining list on the top of source
 */
function setComboObject(combo_obj){      
    comboObjects[comboCnt++]=combo_obj;  
} 
/**
  * setting sheet initial values and header
  * param : sheetObj, sheetNo
  * adding case as numbers of counting sheets
  */
function loadPage() {
    for (i=0; i < sheetObjects.length; i++) {
        ComConfigSheet(sheetObjects[i]);
        initSheet(sheetObjects[i], i + 1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    for (i=0; i < comboObjects.length; i++) {
        initCombo(comboObjects[i], comboObjects[i].options.id);
    }
    // MultiCombo�ʱ�ȭ
	for ( var k = 1; k < comboObjects.length - 1; k++) {
		initCombo(comboObjects[k], k);
		//initCombo(comboObjects[k], comboObjects[k].options.id);
	}
	
	initControl();
	cust_grp_hrchy_cd.SetSelectCode("I", false);
	
    var formObj=document.form;
    var sheetObj=sheetObjects[0];
    initControl();
    formObj.creflag.value="N";
    formObj.saveflag.value="N";
    formObj.edi_if_flg.value = "N";
    doActionIBCombo(sheetObj, formObj, SEARCH01);
    doActionIBSheet(sheetObj, formObj, IBCLEAR);
    // auth_tp_cd retrieve
    doActionIBSheet(sheetObj, formObj, SEARCH01);

    var authTpCd=G_AHTU_TP_CD;
    var rqstNo=formObj.rqst_no.value;
    if(G_MDAA_CHK == 'Y')
        ComEnableObject(formObj.delt_flg, true); 
    else
        ComEnableObject(formObj.delt_flg, false);
    // If the Process Status screen call, in the Detail PopUp
    if(rqstNo != '') {
        ComSetDisplay('btn_Close', true);
        var procTpCd=formObj.proc_tp_cd.value;
        var custCd=formObj.cust_cd.value;
        var rqstUsrChk=formObj.rqst_usr_chk.value;
        // AuthType not Request, ProcessType is Open, 'CheckDup' button display
        if(authTpCd != 'R' && procTpCd == 'O') {
            ComSetDisplay('btn_CheckDup', true);
        }
        var objEnableFlag=false; 
        // Process Type is 'Reject' and AuthType is not 'Approval'(possible modifications and ReOpen)
        if(procTpCd == 'R' &&  ( ((authTpCd == 'R' || authTpCd == 'S')) || G_MDAA_CHK == 'Y') ) {
            ComSetDisplay('btn_Request', true);
            ComGetObject("btn_Request").style.setProperty("color", "#FF0000", "important");
            ComSetDisplay('btn_Retrieve', true);
            ComSetDisplay('btn_Save', true);
            doActionIBSheet(sheetObj, formObj, SEARCH12);
            objEnableFlag=true;
        } else if(procTpCd == 'A' && custCd != '') {
            formObj.cust_cnt_cd.value=custCd.substring(0, 2);
            formObj.cust_seq.value=custCd.substring(2);
            doActionIBSheet(sheetObj, formObj, SEARCH);
        } else {
            doActionIBSheet(sheetObj, formObj, SEARCH12);
        }
        if(objEnableFlag) {
            with(formObj) {
                ComEnableManyObjects(false, cust_cd, btn_com_ens_041);
            }
        } else {    
            // That Element inactive processing
            with(formObj) {
                ComEnableManyObjects(false, cust_cd, btn_com_ens_041, btn_com_ens1_041, btn_com_ens_051, btn_com_ens_071, 
                                            btn_com_ens_0C1, btn_com_ens_n13, btn_srep_search);
            }
        }
        showIndiaInfo(); // Display india info if Customer Country Code is IN(India)
    } else {
        ComSetDisplay('btn_Retrieve', true);
        // MDM Authority is not Approval('A') or MDDA
        if( authTpCd == 'R' || authTpCd == 'S' || G_MDAA_CHK == 'Y') {
            ComSetDisplay('btn_Create', true);
            ComSetDisplay('btn_New', true);
            ComSetDisplay('btn_Save', true);
        } else {
            //General User if you do not have MDM Authority
            ComSetDisplay('btn_New', true);
        }
    }
    /** addr & cntc_pnt **/
    if(G_MDAA_CHK == 'Y' || G_AHTU_TP_CD == 'R' || G_AHTU_TP_CD == 'S') {
        ComSetDisplay('btn_row_add2', true);
        ComSetDisplay('btn_row_delete2', true);
        ComSetDisplay('btn_row_add3', true);
        ComSetDisplay('btn_row_delete3', true);
    } else {
        ComSetDisplay('btn_row_add2', false);
        ComSetDisplay('btn_row_delete2', false);
        ComSetDisplay('btn_row_add3', false);
        ComSetDisplay('btn_row_delete3', false);
    }    
}

/**
 * Control of the event is dynamically loaded.. <br>
 * {@link #loadPage}Function calls this function initializes the IBSheet Object. <br>
 * 
 * @param {ibsheet}  sheetObj IBSheet Object
 * @param {int} SheetObjects sequence number in the array
 */
function initControl() {
    var formObject=document.form;
    //Axon Event handling
    //form
    axon_event.addListenerForm('change', 'obj_change', formObject);
    axon_event.addListenerForm('keyup',       'obj_keypress',    formObject); 
    axon_event.addListener ('keydown', 'ComKeyEnter', 'cust_cd');
    ComClearSeparator (formObject.cust_cd,"eng"); //Only English 
    ComClearSeparator (document.form.cust_cnt_cd,"eng"); //Only English 
    ComClearSeparator (document.form.cust_lgl_eng_nm,"eng");
    ComClearSeparator (document.form.crr_cd,"eng"); //English only 
    ComClearSeparator (document.form.crr_nm,"eng"); //English only
}
/**
 * setting Combo text and value
 * param : comboObj, comboNo
 * adding case as numbers of counting combos
 */
function initCombo(comboObj, comboId) {
    with (comboObj) {
        switch (comboId) {
	        case "nbs_clss_cd1":
	        case "nbs_clss_cd2":
	        //case "nbs_clss_cd3":
	        case "nbs_clss_cd":
	            with (comboObj) {
		            SetColAlign(0, "left");
		            SetColAlign(1, "left");
		            SetColWidth(0, "20");
		            SetColWidth(1, "120");
		            SetDropHeight(200);
		        }
	    	break;
	
	        case "indiv_corp_div_cd":
	        case "cntr_cust_tp_cd":
	        case "cust_div_cd":
	        case "inv_edi_lvl_cd":
	            with (comboObj) {
		            SetColAlign(0, "left");
		            SetColAlign(1, "left");
		            SetColWidth(0, "20");
		            SetColWidth(1, "100");
		            SetDropHeight(200);
		        }
	        	break;
	        case "pay_rqst_ltr_fmt_cd":
	        case "dflt_inv_curr_div_cd":
	        case "indus_desc":
	            with (comboObj) {
		            SetColAlign(0, "left");
		            SetColAlign(1, "left");
		            SetColWidth(0, "40");
		            SetColWidth(1, "90");
		            SetDropHeight(200);
		        }
	        	break;
	        //Customer Hierarchy �ʱ� ������	
	        case "cust_grp_hrchy_cd": 
	    		comboObj.SetColAlign(0, "left");
	    		comboObj.SetColAlign(1, "left");
	    		comboObj.SetColWidth(0, "20");
	    		comboObj.SetColWidth(1, "100");
	    		comboObj.InsertItem(0,"G|GLOBAL","G");
	    		comboObj.InsertItem(1,"R|REGIONAL","R");
	    		comboObj.InsertItem(2,"C|COUNTRY","C");
	    		comboObj.InsertItem(3,"I|INDIVIDUAL","I");
	    		break; 	
	        case "nmd_cust_flg": 
	        	comboObj.SetColAlign(0, "left");
	        	comboObj.SetColAlign(1, "left");
	        	comboObj.SetColWidth(0, "80");
	        	comboObj.SetColWidth(1, "80");
	        	comboObj.InsertItem(0,"N|N","N");
	        	comboObj.InsertItem(1,"Y|Y","Y");
	        	break; 	
	       
        }
    }
}


/**
* The initial setting sheet, Header definition
* param : sheetObj ==> sheet object, sheetNo ==> Sheet object ID of the tag attached to the serial number
* If the number of seats a case by adding the number of sheets sheets should initialize the module configuration
*/
function initSheet(sheetObj, sheetNo) {
    var cnt=0;
    var sheetId=sheetObj.id;
    switch (sheetId) {
    case "sheet1":
        with(sheetObj){
			var HeadTitle1="ibflag|Del|Seq.|||||||||||||||||||||||||||||||||||||";
			var headCount=ComCountHeadTitle(HeadTitle1);
			var prefix="sheet1_";
			
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
			
			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			InitHeaders(headers, info);
			
			var cols = [ {Type:"Status",   Hidden:0,  Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_cnt_cd" },
			             {Type:"Text",     Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cust_seq" } ];
			
			InitColumns(cols);
			
			SetEditable(1);
			SetWaitImageVisible(0);
			SetSheetHeight(110);
        }

        break;
    case "sheet2":
        with(sheetObj){
    		var HeadTitle1="|Del|Seq.|Primary Flag|Address Type|Customer Name|Address|Country|City|State|Zip Code|Contact Email|Contact Person|Local Address1|Local Address2|Local Address3|Local Address4|Remark|Delete Flag|Create User|Create Date/Time|Last Update User|Last Update Date/Time||";
    		var headCount=ComCountHeadTitle(HeadTitle1);
    		var prefix="";

    		SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

    		var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
    		var headers = [ { Text:HeadTitle1, Align:"Center"} ];
    		InitHeaders(headers, info);

    		var cols = [ {Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
    		             {Type:"CheckBox",  Hidden:0, Width:25,   Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
    		             {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"Seq" },
    		             {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"prmry_chk_flg", KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1    },
    		             {Type:"Combo",     Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"addr_tp_cd",    KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50   },
    		             {Type:"Text",      Hidden:0, Width:330,  Align:"Left",    ColMerge:0,   SaveName:prefix+"bzet_nm",       KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50   },
    		             {Type:"Text",      Hidden:0, Width:550,  Align:"Left",    ColMerge:0,   SaveName:prefix+"bzet_addr",     KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:200  },
    		             {Type:"PopupEdit", Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cnt_cd",        KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:2    },
    		             {Type:"Text",      Hidden:0, Width:60,   Align:"Left",    ColMerge:0,   SaveName:prefix+"cty_nm",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50   },
    		             {Type:"PopupEdit", Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ste_cd",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:3    },
    		             {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"zip_cd",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:10   },
    		             {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cntc_eml",      KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50   },
    		             {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cntc_pson_nm",  KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50   },
    		             {Type:"Text",      Hidden:0, Width:140,  Align:"Left",    ColMerge:0,   SaveName:prefix+"locl_addr1",    KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30   },
    		             {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"locl_addr2",    KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30   },
    		             {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"locl_addr3",    KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30   },
    		             {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"locl_addr4",    KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:30   },
    		             {Type:"Text",      Hidden:0, Width:120,  Align:"Left",    ColMerge:0,   SaveName:prefix+"bzet_rmk",      KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1000 },
    		             {Type:"Combo",     Hidden:0, Width:70,   Align:"Center",  ColMerge:0,   SaveName:prefix+"delt_flg",      KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1    },
    		             {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
    		             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"addr_seq",      KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1    },
    		             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd",   KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
    		             {Type:"Text",      Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",      KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 }];

    		InitColumns(cols);

    	    SetEditable(1);
            SetColHidden("check",1);
            
	      	SetColProperty(0, prefix+ "addr_tp_cd", {ComboText:'|'+addr_tp_cdText, ComboCode:'|'+addr_tp_cdCode} );
	    	SetColProperty(0, prefix+ "prmry_chk_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	    	SetColProperty(0, prefix+ "delt_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	    	
	    	SetColProperty(0 ,prefix+ "ste_cd" , {AcceptKeys:"E" , InputCaseSensitive:1});
	    	SetColProperty(0 ,prefix+ "cnt_cd" , {AcceptKeys:"E" , InputCaseSensitive:1});
	    	SetColProperty(0 ,prefix+ "bzet_nm", {AcceptKeys:"E|N|[.-/,() &]"});
	    	//SetColProperty(0 ,prefix+ "cntc_eml", {AcceptKeys:"E|N|[@.-/,() &]"});
	    	SetColProperty(0 ,prefix+ "cntc_pson_nm", {AcceptKeys:"E|N|[.-/,() &]"});
	    	SetColProperty(0 ,prefix+ "locl_addr1", {AcceptKeys:"E|N|[.-/,() &]"});
	    	SetColProperty(0 ,prefix+ "locl_addr2", {AcceptKeys:"E|N|[.-/,() &]"});
	    	SetColProperty(0 ,prefix+ "locl_addr3", {AcceptKeys:"E|N|[.-/,() &]"});
	    	SetColProperty(0 ,prefix+ "locl_addr4", {AcceptKeys:"E|N|[.-/,() &]"});
	    	SetColProperty(0 ,prefix+ "bzet_rmk", {AcceptKeys:"E|N|[.-/,() &]"});
	    	
//	    	SetShowButtonImage(2);
	    	SetSheetHeight(222);
    	}
        break;
    case "sheet3":
        with(sheetObj){
//			var HeadTitle1="|Del|Seq.|Pic NM|E-Mail|IP|URL|International\nPhone No.|Phone No.|International\nFax No.|Fax No.|||";
    		var HeadTitle1="|Del|Seq.|Primary Flag|Payment Request\nLetter|E-Mail|IP|URL|International\nPhone No.|Phone No.|International\nFax No.|Fax No.|Create User|Create Date/Time|Last Update User|Last Update Date/Time||";	//@@2014-12-02���׼���
			var headCount=ComCountHeadTitle(HeadTitle1);
			var prefix="";

			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

			var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			var headers = [ { Text:HeadTitle1, Align:"Center"} ];
			InitHeaders(headers, info);
			
			var cols = [ {Type:"Status",     Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			             {Type:"DummyCheck", Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"DelChk" },
			             {Type:"Seq",        Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"Seq" },
    		             {Type:"Combo",      Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"prmry_chk_flg",      KeyField:1,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1    },
    		             {Type:"Combo",      Hidden:0, Width:120,  Align:"Center",  ColMerge:0,   SaveName:prefix+"pay_rqst_ltr_flg",   KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1    },
//						 {Type:"Text",       Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"pic_nm",             KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },	//@@2014-12-02���׼���
			             {Type:"Text",       Hidden:0, Width:150,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cust_eml" ,          KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",       Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_ip",            KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
			             {Type:"Text",       Hidden:0, Width:250,  Align:"Left",    ColMerge:0,   SaveName:prefix+"cust_url",           KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:50 },
			             {Type:"Text",       Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"intl_phn_no",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4 },
			             {Type:"Text",       Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"phn_no",             KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
			             {Type:"Text",       Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"intl_fax_no",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:4 },
			             {Type:"Text",       Hidden:0, Width:100,  Align:"Center",  ColMerge:0,   SaveName:prefix+"fax_no",             KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:20 },
			             {Type:"Text",      Hidden:0, Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"cre_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Text",      Hidden:0, Width:100,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_usr_id",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
                         {Type:"Date",      Hidden:0, Width:150,  Align:"Center",  ColMerge:1,   SaveName:prefix+"upd_dt",  KeyField:0,   CalcLogic:"",   Format:"YmdHms",            PointCount:0,   UpdateEdit:0,   InsertEdit:0, },
			             {Type:"Text",       Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cntc_pnt_seq",  KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:1 },
			             {Type:"Text",       Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_cnt_cd",        KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"Text",       Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix+"cust_seq",           KeyField:0,   CalcLogic:"",   Format:"",   PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
			
			InitColumns(cols);
			
			SetEditable(1);
            SetColHidden("check",1);
	    	//SetColProperty(0 ,prefix+ "cust_eml", {AcceptKeys:"E|N|[@.-/,() &]"});
	    	SetColProperty(0, prefix+ "prmry_chk_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
	    	SetColProperty(0, prefix+ "pay_rqst_ltr_flg", {ComboText:"N|Y", ComboCode:"N|Y"} );
            SetColProperty(0 ,prefix+ "cust_ip" , {AcceptKeys:"N|[.]"});
	    	SetColProperty(0 ,prefix+ "cust_url", {AcceptKeys:"E|N|[.@_-: &/?=]"});
            SetColProperty(0 ,prefix+ "intl_phn_no" , {AcceptKeys:"N|[-]"});
            SetColProperty(0 ,prefix+ "phn_no" , {AcceptKeys:"N|[-]"});
            SetColProperty(0 ,prefix+ "intl_fax_no" , {AcceptKeys:"N|[-]"});
            SetColProperty(0 ,prefix+ "fax_no" , {AcceptKeys:"N|[-]"});
            SetSheetHeight(222);
    	}
        break;
        
    case "sheet4":     //Customer Hierarchy Type      
		with(sheetObj){
			var HeadTitle="|case_id|cust_cd|old_cd|new_cd|chng_tp|old_nm|new_nm";
			SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
			
			var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			var headers = [ { Text:HeadTitle, Align:"Center"} ];
			InitHeaders(headers, info);
			
			var cols = [{Type:"Status",   Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_ibflag" }, 
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_case_id" },
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_cust_cd" },
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_old_cd"  },
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_new_cd"  },
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_chng_tp" },
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_old_nm"  },
			            {Type:"Text",     Hidden:0,  Width:0,   Align:"Center",  ColMerge:1,   SaveName:"grp_new_nm"  } 
			           ];
			InitColumns(cols);
		}
        break;
    }
}
/**
 * setDataInsert call .<br>
 * DELT FLG setting 'N' 
 * @param sheetObj, sNo
 */
function setDataInsert(sheetObj, sNo) {
    var formObj=document.form;
    switch (sNo) {
    case 1:
        var prefix="";
        var nRow=sheetObj.DataInsert(-1);
        sheetObj.SetCellValue(nRow, prefix + "delt_flg",'N');
        break;
    }
    return nRow;
}

/**
 * All the combo box query
 */
function doActionIBCombo(sheetObj,formObj,sAction,sComboObj,sComboAction,sComboKey){
    switch (sAction) {
        case SEARCH01: // load page
        	var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", "f_cmd=" + SEARCH01);
        	var arrXml=sXml.split("|$$|");
            if (arrXml.length > 0) {
                ComXml2ComboItem(arrXml[0], indiv_corp_div_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[1], cntr_cust_tp_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[2], nbs_clss_cd1, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[3], nbs_clss_cd2, "cd", "cd|cd_desc");
                //ComXml2ComboItem(arrXml[4], nbs_clss_cd3, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[4], vbs_clss_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[5], finc_sts_lvl_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[6], cust_div_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[7], sprs_pay_ltr_flg, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[8], pay_rqst_ltr_fmt_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[9], inv_edi_lvl_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[10], dflt_inv_curr_div_cd, "cd", "cd|cd_desc");
                ComXml2ComboItem(arrXml[11], indus_desc, "cd", "cd|cd_desc");

                cust_div_cd.DeleteItem(0);
//                cust_div_cd.DeleteItem(0);
                sprs_pay_ltr_flg.SetSelectCode("N");
                pay_rqst_ltr_fmt_cd.SetSelectCode("PDF");
                inv_edi_lvl_cd.SetSelectCode("B");
                dflt_inv_curr_div_cd.SetSelectCode("");
            }
        break;
    }
}
// Sheet processing-related processes
function doActionIBSheet(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    switch (sAction) {
        case SEARCH: //retrieve
            if(!validateForm(sheetObj,formObj,sAction)) {
                return false;
            }
            
            formObj.f_cmd.value=SEARCH;
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.hr_chk.value = "N";
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
            var arrXml=sXml.split("|$$|");
            var sav=ComGetEtcData(arrXml[0], "TRANS_RESULT_KEY");
            if(sav != "S" ){
                ComOpenWait(false);
                return;
            }
            if(ComXmlString(arrXml[0], "delt_flg") == null || ComXmlString(arrXml[0], "delt_flg") == ""){
                ComOpenWait(false);
                formObj.cust_cd.readOnly=true;        //Content viewed when entering input data, so this change keys disabled to prevent
                formObj.cust_cd.focus();
                return;
            }
            
            showIndiaInfo(); // Display india info if Customer Country Code is IN(India)
            formObj.ibflag.value="U";                          //After the query is not entered for the queried data is to be modified
            formObj.cust_lgl_eng_nm.value=ComXmlString(arrXml[0], "cust_lgl_eng_nm");
            formObj.cust_locl_lang_nm.value=ComXmlString(arrXml[0], "cust_locl_lang_nm");
            formObj.bzet_addr.value=ComXmlString(arrXml[0], "bzet_addr");
            formObj.cust_abbr_nm.value=ComXmlString(arrXml[0], "cust_abbr_nm");
            formObj.cust_rgst_no.value=ComXmlString(arrXml[0], "cust_rgst_no");
            formObj.loc_cd.value=ComXmlString(arrXml[0], "loc_cd");
            formObj.ofc_cd.value=ComXmlString(arrXml[0], "ofc_cd");
            formObj.srep_cd.value=ComXmlString(arrXml[0], "srep_cd");
            indiv_corp_div_cd.SetSelectCode(ComXmlString(arrXml[0], "indiv_corp_div_cd"));
    		formObj.cntr_div_flg.value=ComXmlString(arrXml[0], "cntr_div_flg");
            cntr_cust_tp_cd.SetSelectCode(ComXmlString(arrXml[0], "cntr_cust_tp_cd"));
            cust_grp_hrchy_cd.SetSelectCode(ComXmlString(arrXml[0], "cust_grp_hrchy_cd")); 
            formObj.org_cust_grp_hrchy_cd.value = ComXmlString(arrXml[0], "cust_grp_hrchy_cd");
            cust_div_cd.SetSelectCode(ComXmlString(arrXml[0], "cust_div_cd"));
            nbs_clss_cd1.SetSelectCode(ComXmlString(arrXml[0], "nbs_clss_cd1"));
            nbs_clss_cd2.SetSelectCode(ComXmlString(arrXml[0], "nbs_clss_cd2"));
            formObj.nbs_clss_cd3.value=ComXmlString(arrXml[0], "nbs_clss_cd3");
            vbs_clss_cd.SetSelectCode(ComXmlString(arrXml[0], "vbs_clss_cd"));
            formObj.vndr_seq.value=ComXmlString(arrXml[0], "vndr_seq");
            formObj.cust_grp_id.value=ComXmlString(arrXml[0], "cust_grp_id");
            formObj.org_cust_grp_id.value = ComXmlString(arrXml[0], "cust_grp_id");
            formObj.mlt_trd_acct_flg.value=ComXmlString(arrXml[0], "mlt_trd_acct_flg");
            nmd_cust_flg.SetSelectCode(ComXmlString(arrXml[0], "nmd_cust_flg"));
//            if(ComXmlString(arrXml[0], "nmd_cust_flg") == "Y"){ // SR0044402 : when retrieving always disabled, except when create.
            	nmd_cust_flg.SetEnable(false);
//            }
            
            formObj.key_acct_flg.value=ComXmlString(arrXml[0], "key_acct_flg");
            formObj.key_acct_st_eff_dt.value=ComXmlString(arrXml[0], "key_acct_st_eff_dt");
            formObj.key_acct_end_eff_dt.value=ComXmlString(arrXml[0], "key_acct_end_eff_dt");
            formObj.fndt_dt.value=ComXmlString(arrXml[0], "fndt_dt");
            finc_sts_lvl_cd.SetSelectCode(ComXmlString(arrXml[0], "finc_sts_lvl_cd"));
            formObj.empe_knt.value=ComXmlString(arrXml[0], "empe_knt");
            formObj.indus_desc.value=ComXmlString(arrXml[0], "indus_desc");
            formObj.crnt_vol_knt.value=ComXmlString(arrXml[0], "crnt_vol_knt");
            formObj.lstk_flg.value=ComXmlString(arrXml[0], "lstk_flg");
            formObj.cts_no.value=ComXmlString(arrXml[0], "cts_no");
            formObj.capi_curr_cd.value=ComXmlString(arrXml[0], "capi_curr_cd");
            formObj.capi_amt.value=ComXmlString(arrXml[0], "capi_amt");
            formObj.cust_rmk.value=ComXmlString(arrXml[0], "cust_rmk");
            formObj.nvocc_co_scac_cd.value=ComXmlString(arrXml[0], "nvocc_co_scac_cd");
            formObj.nvocc_lic_no.value=ComXmlString(arrXml[0], "nvocc_lic_no");
            formObj.nvocc_bd_no.value=ComXmlString(arrXml[0], "nvocc_bd_no");
            formObj.nvocc_bd_amt.value=ComXmlString(arrXml[0], "nvocc_bd_amt");
            formObj.nvocc_bd_st_eff_dt.value=ComXmlString(arrXml[0], "nvocc_bd_st_eff_dt");
            formObj.nvocc_bd_end_eff_dt.value=ComXmlString(arrXml[0], "nvocc_bd_end_eff_dt");
            formObj.frt_fwrd_fmc_no.value=ComXmlString(arrXml[0], "frt_fwrd_fmc_no");
            formObj.delt_flg.value=ComXmlString(arrXml[0], "delt_flg");
            if (formObj.delt_flg.value == "Y") { // SR0044603
            	formObj.modi_cust_cd2.readOnly=true;
            } else {
            	formObj.modi_cust_cd2.readOnly=false;
            }
            formObj.sls_delt_eff_dt.value=ComXmlString(arrXml[0], "sls_delt_eff_dt");
            formObj.addr_tp_cd.value=ComXmlString(arrXml[0], "addr_tp_cd");
            formObj.addr_seq.value=ComXmlString(arrXml[0], "addr_seq");
            formObj.fndt_dt.value=ComGetMaskedValue(formObj.fndt_dt.value, "ymd") ;
            formObj.nvocc_bd_st_eff_dt.value=ComGetMaskedValue(formObj.nvocc_bd_st_eff_dt.value, "ymd") ;
            formObj.nvocc_bd_end_eff_dt.value=ComGetMaskedValue(formObj.nvocc_bd_end_eff_dt.value, "ymd") ;
            formObj.sls_delt_eff_dt.value=ComGetMaskedValue(formObj.sls_delt_eff_dt.value, "ymd") ;
            //formObj.modi_cust_cd.value=ComXmlString(arrXml[0], "modi_cust_cd");
            formObj.modi_cust_cd2.value=ComXmlString(arrXml[0], "modi_cust_cd2");
            formObj.old_modi_cust_cd.value=ComXmlString(arrXml[0], "modi_cust_cd2");
            formObj.edi_if_flg.value = "N";
            formObj.cnsd_cust_cnt_cd.value=ComXmlString(arrXml[0], "cnsd_cust_cnt_cd");
            formObj.cnsd_cust_seq.value=ComXmlString(arrXml[0], "cnsd_cust_seq");
            sprs_pay_ltr_flg.SetSelectCode(ComXmlString(arrXml[0], "sprs_pay_ltr_flg"));
            pay_rqst_ltr_fmt_cd.SetSelectCode(ComXmlString(arrXml[0], "pay_rqst_ltr_fmt_cd"));
            inv_edi_lvl_cd.SetSelectCode(ComXmlString(arrXml[0], "inv_edi_lvl_cd"));
            dflt_inv_curr_div_cd.SetSelectCode(ComXmlString(arrXml[0], "dflt_inv_curr_div_cd"));
            formObj.rail_road_prio_flg.value=ComXmlString(arrXml[0], "rail_road_prio_flg");
            formObj.crm_if_flg.value=ComXmlString(arrXml[0], "crm_if_flg");
            indus_desc.SetSelectCode(ComXmlString(arrXml[0], "indus_desc"));
            formObj.cre_usr_id.value=ComXmlString(arrXml[0], "cre_usr_id");
            formObj.cre_dt.value=ComXmlString(arrXml[0], "cre_dt");
            formObj.upd_usr_id.value=ComXmlString(arrXml[0], "upd_usr_id");
            formObj.upd_dt.value=ComXmlString(arrXml[0], "upd_dt");
            formObj.sprt_eml_inv_flg.value=ComXmlString(arrXml[0], "sprt_eml_inv_flg");
//            formObj.ida_gst_no.value = ComXmlString(arrXml[0], "ida_gst_no");
            formObj.edi_inv_no_req_flg.value=ComXmlString(arrXml[0], "edi_inv_no_req_flg");
            formObj.ida_gst_no.value = ComXmlString(arrXml[0], "ida_gst_no");
            formObj.sez_flg.value = ComXmlString(arrXml[0], "sez_flg");
            if (formObj.sez_flg.value == "Y") {
            	formObj.sez_desc.disabled = false;
            } else {
            	formObj.sez_desc.disabled = true;
            } 
            
            formObj.sez_desc.value = ComXmlString(arrXml[0], "sez_desc");
            formObj.lgcy_cd.value = ComXmlString(arrXml[0], "lgcy_cd");
            formObj.mot_no.value = ComXmlString(arrXml[0], "mot_no");
            formObj.mot_eff_dt.value = ComXmlString(arrXml[0], "mot_eff_dt");
            formObj.mot_exp_dt.value = ComXmlString(arrXml[0], "mot_exp_dt");
            formObj.certi_flg.value = ComXmlString(arrXml[0], "certi_flg");
            
//            if(formObj.cust_cd.value != ""){
//            	formObj.btn_upload.disabled = false; 
//            }
            
            formObj.f_cmd.value=SEARCH02;
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            
            // Customer Hierarchy Type �߰��� �� ����. EsmSam0902Event
            var sParam1=FormQueryString(formObj);
            var sXml1=sheetObj.GetSearchData("ESM_SAM_0902GS.do", sParam1);
    		ComOpenWait(false);
            
            // Customer Hierarchy Type
            if (ComGetEtcData(sXml1, "G") == undefined) {
    			formObj.glob_ct.value = '0';
    			
    		} else {
    			formObj.glob_ct.value = ComGetEtcData(sXml1, "G");
    		}
            if (ComGetEtcData(sXml1, "R") == undefined) {
    			formObj.rlob_ct.value = '0';
    			
    		} else {
    			formObj.rlob_ct.value = ComGetEtcData(sXml1, "R");
    		}
    		if (ComGetEtcData(sXml1, "C") == undefined) {
    			formObj.cnt_ct.value = '0';
    		} else {
    			formObj.cnt_ct.value = ComGetEtcData(sXml1, "C");
    		}
    		if (ComGetEtcData(sXml1, "I") == undefined) {
    			formObj.indiv_ct.value = '0';
    		} else {
    			formObj.indiv_ct.value = ComGetEtcData(sXml1, "I");
    		}
            
            init_delt_flg = ComXmlString(arrXml[0], "delt_flg");
            
            if(formObj.rail_road_prio_flg.value == "Y"){
            	formObj.rail_road_prio_flg.checked = true;
            }else{
            	formObj.rail_road_prio_flg.checked = false;
            }
            //alert(formObj.crm_if_flg.value);
            //2018.01.26.MIS Customer I/F Flag Column 추가
            if(formObj.crm_if_flg.value == "Y"){
            	formObj.crm_if_flg.checked = true;
            }else{
            	formObj.crm_if_flg.checked = false;
            }

            if(formObj.cust_grp_id.value != "") { 
            	ComEnableObject(formObj.crm_if_flg, false);
            }else{
            	ComEnableObject(formObj.crm_if_flg, true);
            }
            
            // SR0044402 if named customer flag is "Y", always disabled 
            if (formObj.nmd_cust_flg.value == "Y") {
            	ComEnableObject(formObj.crm_if_flg, false);
            }
            
            if(formObj.cnsd_cust_cnt_cd.value != "") {
	            var custlpad="";
	            if (formObj.cnsd_cust_seq.value.length <6 ){
	                for(i=1; i <= 6- formObj.cnsd_cust_seq.value.length; i++){
	                     custlpad=custlpad+"0" ;
	                }
	            }
	            formObj.cnsd_cust_cd.value=formObj.cnsd_cust_cnt_cd.value+custlpad+formObj.cnsd_cust_seq.value ;
            }else{
            	formObj.cnsd_cust_cd.value="";
            }
	
            formObj.cust_seq.readOnly=true;       //Modifying the contents of a query for the update, so that cases can not change the key values ??to disable
            formObj.cust_cnt_cd.readOnly=true;
            /* addr */
            sheetObjects[1].LoadSaveData(arrXml[1]);
            /* cntc pnt */
            sheetObjects[2].LoadSaveData(arrXml[2]);
            ComOpenWait(false);

            //Customer Hierarchy Type
    		tabCustCd = formObj.cust_cd.value;
            if (tabCustCd.length > 0  && "TB,ZZ,XX".indexOf(tabCustCd.substr(0, 2)) > -1) {
    		    ComShowCodeMessage("CCD00052");
    		    formObj.reset(); // 2018.02.21 Dummy Code 조회시 Reset
    		    cust_grp_hrchy_cd.SetSelectCode("I", false);
    		    cust_grp_hrchy_cd.SetEnable(false);
    		    cust_div_cd.SetEnable(false);
    		}
            
            //Customer Hierarchy ��Ȱ��ȭ(Group Code�� �� �ݿ�
            
            if (formObj.cust_grp_id.value == "") {
            	cust_grp_hrchy_cd.SetSelectCode("I", false);
    		    cust_grp_hrchy_cd.SetEnable(false);
            } 
            break;
        case SEARCH01: // MDM AUTH_TP_CD query
            var sParam='f_cmd=' + SEARCH02 + '&mst_dat_subj_cd=CUST';
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            // global var sestting
            G_MDAA_CHK=ComGetEtcData(sXml, "MDAA_CHK");
            G_AHTU_TP_CD=ComGetEtcData(sXml, "AUTH_TP_CD");
            break;
        case SEARCH12:  
            formObj.f_cmd.value=SEARCH12;
            sheetObj.SetWaitImageVisible(0);
            ComOpenWait(true);
            formObj.hr_chk.value = "N";
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
            var arrXml=sXml.split("|$$|");
            var sav=ComGetEtcData(arrXml[0], "TRANS_RESULT_KEY");
            if(sav != "S" ){
                return;
            }
            sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
            // Sheet that exist in the Form object is filled with the value of EtcData.
            ComEtcDataToForm(formObj, sheetObj);
            
            if(ComGetEtcData(arrXml[0], "rail_road_prio_flg") == "Y"){
            	formObj.rail_road_prio_flg.value = "Y";
            	formObj.rail_road_prio_flg.checked = true;
            }else{
            	formObj.rail_road_prio_flg.value = "N";
            	formObj.rail_road_prio_flg.checked = false;
            }

//            if(formObj.cust_grp_id.value != "") { 
//            	formObj.crm_if_flg.checked.disabled = true;
//            	ComEnableObject(formObj.crm_if_flg, false);
            	
            //2018.01.26.MIS Customer I/F Flag Column 추가
	            if(ComGetEtcData(arrXml[0], "crm_if_flg") == "Y"){
	            	formObj.crm_if_flg.value = "Y";
	            	formObj.crm_if_flg.checked = true;
	            }else{
	            	formObj.crm_if_flg.value = "N";
	            	formObj.crm_if_flg.checked = false;
	            }
            
//            }
            
            if(formObj.cnsd_cust_cnt_cd.value != "") {
	            var custlpad="";
	            if (formObj.cnsd_cust_seq.value.length <6 ){
	                for(i=1; i <= 6- formObj.cnsd_cust_seq.value.length; i++){
	                     custlpad=custlpad+"0" ;
	                }
	            }
	            formObj.cnsd_cust_cd.value=formObj.cnsd_cust_cnt_cd.value+custlpad+formObj.cnsd_cust_seq.value ;
            }else{
            	formObj.cnsd_cust_cd.value="";
            }
            
            
            // 2018.01.29. Request 이후 Legacy Customer Code, MOT Number, MOT Effective Date, MOT Expire Date 값에 null 로 들어가는 
            // 현상에 대한 처리 로직 추가
            if(formObj.lgcy_cd.value == "null")  {
            	formObj.lgcy_cd.value = "";
            }
            
            if(formObj.mot_no.value == "null")  {
            	formObj.mot_no.value = "";
            }
            
            if(formObj.mot_eff_dt.value == "null")  {
            	formObj.mot_eff_dt.value = "";
            }
            
            if(formObj.mot_exp_dt.value == "null")  {
            	formObj.mot_exp_dt.value = "";
            }
           
            
            /* addr */
            sheetObjects[1].LoadSaveData(arrXml[0]);
            /* cntc pnt */
            sheetObjects[2].LoadSaveData(arrXml[1]);
            ComOpenWait(false);
            break;
        case SEARCH13: // MDM AUTH_TP_CD ��ȸ
            var sParam='f_cmd=' + SEARCH04 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no);
            var sXml=sheetObj.GetSearchData("BCM_CCD_2002GS.do", sParam);
            break;
        case MULTI:        //����
            if(!validateForm(sheetObj,formObj,sAction)) {
                return false;
            }
            
            var confMsg;
            var saveMsg;
            if( formObj.creflag.value == "Y" && formObj.cust_cd.value == "" && formObj.rqst_no.value == "") { // MDM Request CREATE
                // check Legacy Code(SAP ID)
                formObj.f_cmd.value=SEARCH13;
                var sXml = sheetObj.GetSearchData("BCM_CCD_0035GS.do", FormQueryString(formObj));
                var sav = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                if(nmd_cust_flg.GetSelectCode() == "Y"){
                	document.form.cust_cnt_cd.value = "AA";
                } else {
                	document.form.cust_cnt_cd.value = document.form.loc_cd.value.substr(0,2);
                }
                if(sav == "F") { // Legacy Code(SAP ID) is not unique
                    ComShowCodeMessage("CCD00045");
                } else {
            		var param="";
            		param=param + "&cust_cnt_cd=" + form.cust_cnt_cd.value+" &cust_nm=" + encodeURIComponent(form.cust_lgl_eng_nm.value)+"&loc_cd=" 
            		+ form.loc_cd.value+" &cust_rgst_no=" + form.cust_rgst_no.value;
            		ComOpenPopup('/opuscntr/BCM_CCD_1035.do?' + param, 860, 470, "getBCM_CCD_1035_saveflag", '0,0', true);
                }
//            } else if(formObj.rqst_no.value != "") { // SAVE on Process Status POPUP
//                confMsg=ComGetMsg('CCD00023', 'save');
//                saveMsg=ComGetMsg("COM130102", "Data");
//                setSave(confMsg,saveMsg);
            } else { // �? �ڵ� ������ MODIFY master OR request(SAVE on Process Status POPUP)
                // check Legacy Code(SAP ID)
                formObj.f_cmd.value=SEARCH13;
//                alert(document.form.hr_chk.value);
//                return;
                var sXml = sheetObj.GetSearchData("BCM_CCD_0035GS.do", FormQueryString(formObj));
                var sav = ComGetEtcData(sXml, "TRANS_RESULT_KEY");
                
                if(sav == "F") { // Legacy Code(SAP ID) is not unique
                    ComShowCodeMessage("CCD00045");
                } else {
                    confMsg=ComGetMsg('CCD00023', 'save');
                    saveMsg=ComGetMsg("COM130102", "Data");
                    setSave(confMsg,saveMsg);
                }
            }
            			
            break;
        case MULTI03:   // Request
            if (!ComShowCodeConfirm("CCD00030")) {
                return;
            }
            var sParam='f_cmd=' + MULTI03 + '&rqst_no=' + ComGetObjValue(formObj.rqst_no) + '&proc_tp_cd=O';
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
        case IBCLEAR:      //Initialization
            formObj.ibflag.value="I";
            formObj.cust_seq.readOnly=false;
            formObj.reset();
            indiv_corp_div_cd.SetSelectCode("");
    		formObj.cntr_div_flg.value="";
            cntr_cust_tp_cd.SetSelectCode("");
            nbs_clss_cd1.SetSelectCode("");
            nbs_clss_cd2.SetSelectCode("");
            //nbs_clss_cd3.SetSelectCode("");
            vbs_clss_cd.SetSelectCode("");
            finc_sts_lvl_cd.SetSelectCode("");
            sprs_pay_ltr_flg.SetSelectCode("N");
            pay_rqst_ltr_fmt_cd.SetSelectCode("PDF");
            inv_edi_lvl_cd.SetSelectCode("B");
            dflt_inv_curr_div_cd.SetSelectCode("");
            cust_div_cd.SetSelectCode("");
            indus_desc.SetSelectCode("");
            init_delt_flg = "N";
            ComSetFocus(document.form.cust_cnt_cd); 
            formObj.cust_grp_id.disabled = true;
    		setClassName(formObj.cust_grp_id, "input");
    		formObj.cnsd_cust_cnt_cd.value = "";
    		formObj.cnsd_cust_seq.value = "";
    		formObj.sheet_cust_cnt_cd.value = "";
    		ComEnableObject(formObj.btn_com_com_0006, false);
    		formObj.btn_upload.disabled = false; 
        break;
        case SEARCH02:      //Customer Country Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH02;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Customer Country Code");
                    formObj.cust_cnt_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH03:      //Location Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH03;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Location Code");
                    formObj.loc_cd.value="";
                }
                showIndiaInfo();
                ComOpenWait(false);
            }
        break;
        case SEARCH04:      //Office Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH04;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Admin. Officd Code");
                    formObj.ofc_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH05:      //Vendor Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH05;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Vendor Code");
                    formObj.vndr_seq.value="";
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH06:      //Capital Currency Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH06;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Capital Currency Code");
                    formObj.capi_curr_cd.value="";
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH09:      //Customer Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH09;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                
                if(result=="" ){
                    ComShowCodeMessage("COM130402", "Customer Code");
                    formObj.cust_cnt_cd.value="";
                    formObj.cust_seq.value="";
                    formObj.cust_cd.value="";
                    document.form.cust_cd.focus();
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH10:      //Sales Rep Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH10;
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Sales Rep Code");
                    formObj.srep_cd.value="";
                    document.form.srep_cd.focus();
                }
                ComOpenWait(false);
            }
        break;
        case SEARCH11:      //Group Customer Code check
            if(validateForm(sheetObj,formObj,sAction)){
                ComOpenWait(true);
                formObj.f_cmd.value=SEARCH11;
                formObj.cust_cnt_cd.value=formObj.cust_cd.value.substring(0, 2);
                
                var sParam=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
                var result=ComGetEtcData(sXml, "result");
                if(result==""){
                    ComShowCodeMessage("COM130402", "Group Customer Code");
                    formObj.cust_grp_id.value="";
                    document.form.cust_grp_id.focus();
                    ComOpenWait(false);  // Group ID �� �������� ������ �� �޼����� �ѷ��ְ�, Customer Hierarchy �� ���� ������ ���� ����
                    return;
                } else { 
                	
                	if(formObj.cust_cnt_cd.value != "") { // �ڵ� ���� �ƴҶ� ����Ǵ� ����
                		
        			    //cust group id�� country code�� G,C,I ���� ��������
                	    if (ComGetEtcData(sXml, "glob_ct") == "0" || ComGetEtcData(sXml, "glob_ct") == "G") {	//Gloabl�� �������� Global�� ����
                		    cust_grp_hrchy_cd.SetSelectCode("G", false);
                	    } else if (ComGetEtcData(sXml, "cnt_ct") == "0"){		//Global�� ������ �ش� ������ Country�� ������ 'C'               		
                		    cust_grp_hrchy_cd.SetSelectCode("C", false);  
                	    } else {
                		    cust_grp_hrchy_cd.SetSelectCode("I", false);                		
                	    }   
                	
                   }
                }
                
                ComOpenWait(false);
                //Amending Global Hierarchy Customer Vs. Does not have any Hierarchy
                //Global Hierarchy �� ���� �ѷ����� �޼��� �� �׿� �� hierarchy �ʱ�ȭ
                var orgCustHrCd = ComGetObjValue(formObj.org_cust_grp_hrchy_cd);
                
                if (orgCustHrCd == "G" && (formObj.cust_grp_id.value != formObj.org_cust_grp_id.value)) {
//                if(orgCustHrCd == "G" && (ComGetEtcData(sXml, "glob_ct") == "0" || ComGetEtcData(sXml, "glob_ct") == "G")) {
//                	ComShowCodeMessage("CCD00054");  
                	if(!ComShowCodeConfirm("CCD00054")) { // Customer Hierarchy �� ������ �˷��ְ�, Yes, No ���ÿ� �� Logic ����
                		formObj.cust_grp_id.value = formObj.org_cust_grp_id.value;
                		cust_grp_hrchy_cd.SetSelectCode(orgCustHrCd, "cust_grp_hrchy_cd");
                	}
                	formObj.hr_chk.value = "C";
                	return;
                }
            }
        break;
	    case IBSEARCH: //Retrieve
	        ComOpenWait(true);
	        if( formObj.rqst_no.value == ''){
	            formObj.f_cmd.value=SEARCH;
	        }else{
	            formObj.f_cmd.value=SEARCH01;
	        }
	        
	        var sParam=FormQueryString(formObj);
	        var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
	        var crr_nm=ComXmlString(sXml, "crr_nm");
	        if(crr_nm == ""){
	            if(!ComShowConfirm(ComGetMsg("CCD00034", "Carrier Code"))){
	                doActionIBSheet(sheetObj, formObj, IBCLEAR);
	            }
	        }
	        ComOpenWait(false);
        break;
        case SEARCH14:      // Payment Request Letter Consolidated Customer ID Check
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH09;
            var sParam="f_cmd=" + SEARCH09 + "&cust_cnt_cd=" + formObj.cnsd_cust_cd.value.substr(0,2) + "&cust_seq=" + formObj.cnsd_cust_cd.value.substr(2,6);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            ;
            if(result=="" ){
                ComShowCodeMessage("COM130402", "Payment Request Letter Consolidated Customer ID");
                formObj.cnsd_cust_cnt_cd.value="";
                formObj.cnsd_cust_seq.value="";
                formObj.cnsd_cust_cd.value="";
                document.form.cnsd_cust_cd.focus();
            }
            ComOpenWait(false);
        break;
        
        
        case SEARCH20: // Customer Hierarchy Validation Retrieve
    		if (!validateForm(sheetObj, formObj, sAction)) {
    			return;
    		}
    		sheetObj.SetWaitImageVisible(0);
    		formObj.f_cmd.value = SEARCH20;
    		var orgCustGrpHrchyCd = ComGetObjValue(formObj.org_cust_grp_hrchy_cd);
    		var newCustGrpHrchyCd = ComGetObjValue(formObj.cust_grp_hrchy_cd);
    		ComSetObjValue(formObj.chng_tp, orgCustGrpHrchyCd + "2" + newCustGrpHrchyCd);
    		var sXml = sheetObj.GetSearchData("BCM_CCD_0035GS.do", FormQueryString(formObj));
    		sheetObj.LoadSearchData(sXml,{Sync:1});
    		if (ComGetEtcData(sXml, "CUST_CD") != "" && ComGetEtcData(sXml, "CUST_CD") != undefined) {
    			var newCdNm = "'" + ComGetEtcData(sXml, "NEW_CD") + "'(" +  ComGetEtcData(sXml, "NEW_NM") + ")";
    			if (!ComShowConfirm(ComGetMsg("CCD00050", ComGetEtcData(sXml, "CUST_CD"), ComGetEtcData(sXml, "OLD_NM"), newCdNm))) {
    				sheetObj.RemoveAll();
    				cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			}
    		}	
    		break;
       	
        case SEARCH21:      // Payment Request Letter Consolidated Customer ID Check
            var sParam="f_cmd=" + SEARCH21 + "&lgcy_cd=" + formObj.lgcy_cd.value;
            if(formObj.lgcy_cd.readOnly == false){
            	var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
            	var custCd=ComGetEtcData(sXml, "cust_cd");
            	if(custCd == "" || custCd == null){
            		ComShowCodeMessage("CCD00002");
            		return false;
            	}
            	formObj.cust_cd.value = custCd;
            }
        break;
        case SEARCH22: // CR0010136
        	ComOpenWait(true);
            formObj.f_cmd.value=SEARCH22;
            var sParam=FormQueryString(formObj);
        	var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
        	var custCds=ComGetEtcData(sXml, "cust_cd");
        	if(!ComIsNull(custCds)){
        		ComOpenWait(false);
        		ComShowCodeMessage("CCD00071",custCds);
        		formObj.modi_cust_cd2.value = "";
        		document.form.modi_cust_cd2.focus();
        		return false;
        	}
        	ComOpenWait(false);
        break;
        case SEARCH23: //To-Be Customer Code check
            ComOpenWait(true);
            formObj.f_cmd.value=SEARCH23;
            var sParam=FormQueryString(formObj);
            var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
            var result=ComGetEtcData(sXml, "result");
            
            if(result=="" ){
            	ComOpenWait(false);
            	ComShowCodeMessage("COM130402", "Customer Code");
                formObj.modi_cust_cd2.value = "";
        		return false;
            }
            ComOpenWait(false);
        break;
    	case COMMAND01: // Open
				sheetObj.LoadExcel({ Mode:"HeaderMatch"}); //,WorkSheetNo:"1",StartRow:"-1",EndRow:"-1",WorkSheetName:"",Append:false,ColumnMapping:""});
			if (sheetObj.RowCount()> 0) {
			} 
         	break;  
        
    }   
}
function doActionIBSheet2(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    var prefix_sheet2="";
    switch (sAction) {
    case IBDELETE:      // delete           
        for(i=1; i <=sheetObj.RowCount(); i++){
			if(sheetObj.GetCellValue(i,prefix_sheet2+'DelChk')=="1") {
				if(sheetObj.GetCellValue(i,prefix_sheet2+'addr_tp_cd')=="1" && sheetObj.GetCellValue(i,prefix_sheet2+'prmry_chk_flg')=="Y"){
                    sheetObj.SetCellValue(i,prefix_sheet2+'DelChk',"0");
                }                       
            }
        }

        ComRowHideDelete(sheetObj,prefix_sheet2+'DelChk', false);
        break;
    }
}
function doActionIBSheet3(sheetObj, formObj, sAction) {
    sheetObj.ShowDebugMsg(false);
    var prefix_sheet3="";
    switch (sAction) {
        case IBINSERT:      // insert
            var sheetIdx=sheetObj.DataInsert(-1);
            //sheetObj.SetCellBackColor(sheetIdx,prefix_sheet3+"phn_no","#FFCCFF");
            break;
        case IBDELETE:      // delete        
            for(i=1; i <=sheetObj.RowCount(); i++){
    			if(sheetObj.GetCellValue(i,prefix_sheet3+'DelChk')=="1") {
    				if(sheetObj.GetCellValue(i,prefix_sheet3+'Seq')=="1"){
                        sheetObj.SetCellValue(i,prefix_sheet3+'DelChk',"0");
                    }
                }
            }

            ComRowHideDelete(sheetObj, prefix_sheet3+"DelChk", false);
            break;
    }   
}
/**
 * Checkbox in the pop-up when you pass a value to parent window. <br>
 * @param {ibsheet} sheetObj IBSheet Object
 * @param {String} value sheetObj input value
 */
function chkCallPopupOK(sheetObj) {
    var formObj=document.form;
    var calllFunc;
    var rArray=null;
    rArray=chkGetLocalCheckedRows(sheetObj);
    if(rArray == null) {
        ComShowCodeMessage("COM12114", "row");
        return;
    }
    calllFunc=formObj.calllFunc.value;
    opener.eval(calllFunc)(rArray);
  ComClosePopup(); 
}
//===================================================================================
//UI Object Event Handler
// ===================================================================================
/**
 * Carrier Code Pop up to read from. <br>
 */ 
function setCallBack0B2(aryPopupData) {
    var form=document.form;
    form.cust_seq.value=aryPopupData[0][3].substring(2,8);
    form.cust_cnt_cd.value=aryPopupData[0][3].substring(0,2);
    form.cust_cd.value=aryPopupData[0][3];
    popupcheck = 'Y';
    doActionIBSheet(sheetObjects[0], form, SEARCH);
    popupcheck = 'N';
    form.cust_cd.readOnly=true;
    form.lgcy_cd.readOnly=true;
}
function setCallBack0B2Cnsd(aryPopupData) {
    var form=document.form;
    form.cnsd_cust_seq.value=aryPopupData[0][3].substring(2,8);
    form.cnsd_cust_cnt_cd.value=aryPopupData[0][3].substring(0,2);
    form.cnsd_cust_cd.value=aryPopupData[0][3];
    form.cust_cd.readOnly=true;
    form.lgcy_cd.readOnly=true;
}
function setCallBack0B1(aryPopupData) {
    var form=document.form;
    form.loc_cd.value=aryPopupData[0][3];
    if(form.creflag.value == "Y"){
       form.cust_cnt_cd.value=form.loc_cd.value.substr(0,2);
       showIndiaInfo(); // Display india info if Customer Country Code is IN(India)
     }
} 
function setCallBack0B3(aryPopupData) {
    var form=document.form;
    form.ofc_cd.value=aryPopupData[0][3];
}
function setCallBack0B4(aryPopupData) {
    var form=document.form;
    form.vndr_seq.value=aryPopupData[0][2];
}
function setCallBack0B5(aryPopupData) {
    var form=document.form;
    form.cust_cnt_cd.value=aryPopupData[0][3];
}
function setCallBack0B6(aryPopupData) {
    var form=document.form;
    form.capi_curr_cd.value=aryPopupData[0][2];
}
function setCustGrpId(aryPopupData){
   var form=document.form;
   document.form.cust_grp_id.focus();
   form.cust_grp_id.value=aryPopupData[0][2];
   document.form.cust_cd.focus();
   
}
 /**
 * handling process for input validation
 */
function validateForm(sheetObj, formObj, sAction) {
     switch (sAction) {
        case SEARCH:
            if( ComIsNull(formObj.rqst_no) && ComIsNull(formObj.cust_cd)  && ComIsNull(formObj.lgcy_cd) ){
                ComShowCodeMessage("CCD00001", "Customer Code");
                document.form.cust_cd.focus();
                return false;
            }
            break;
        case SEARCH08:
            if(formObj.loc_cd.value == "" || formObj.loc_cd.value == null){
                ComShowCodeMessage("CCD00001", "Location Code");
                document.form.loc_cd.focus();
                return false;
            }
            break;
        case MULTI:
        	
        	if(formObj.delt_flg.value != "Y" || init_delt_flg != "Y"){
        		if(formObj.creflag.value == "N" && formObj.rqst_no.value == ''){
                    if(formObj.cust_cd.value == "" || formObj.cust_cd.value == null){
                        ComShowCodeMessage("CCD00001", "Customer Code");
                        document.form.cust_cd.focus();
                        return false;
                    }
                }
                if(formObj.cust_lgl_eng_nm.value == "" || formObj.cust_lgl_eng_nm.value == null){
                    ComShowCodeMessage("CCD00001", "Legal English Name");
                    document.form.cust_lgl_eng_nm.focus();
                    return false;
                }
                
                if(nmd_cust_flg.GetSelectCode() == "N" || nmd_cust_flg.GetSelectCode() == "" || nmd_cust_flg.GetSelectCode() == null){ // Named Customer 가 아닐때만 validation check.
                	if(formObj.loc_cd.value == "" || formObj.loc_cd.value == null){
                		ComShowCodeMessage("CCD00001", "Location Code");
                		document.form.loc_cd.focus();
                		return false;
                	}
                	if(formObj.ofc_cd.value == "" || formObj.ofc_cd.value == null){
                		ComShowCodeMessage("CCD00001", "Admin. Office");
                		document.form.ofc_cd.focus();
                		return false;
                	}
                	if(formObj.srep_cd.value == "" || formObj.srep_cd.value == null){
                		ComShowCodeMessage("CCD00001", "Sales Rep. Code");
                		document.form.srep_cd.focus();
                		return false;
                	}
                	if(cntr_cust_tp_cd.GetSelectCode()== "" ||cntr_cust_tp_cd.GetSelectCode()== " " || cntr_cust_tp_cd.GetSelectCode()== null|| cntr_cust_tp_cd.GetSelectText()== ""){
                		ComShowCodeMessage("CCD00001", "Container Customer Type");
                		cntr_cust_tp_cd.Focus();
                		return false;
                	}
                	if(cust_div_cd.GetSelectCode()== "" || cust_div_cd.GetSelectCode()== null|| cust_div_cd.GetSelectText()== ""){
                		ComShowCodeMessage("CCD00001", "Individual/Group");
                		cust_div_cd.Focus();
                		return false;
                	}else if (cust_div_cd.GetSelectCode() == "G") {
                		if(formObj.cust_grp_id.value == "" || formObj.cust_grp_id.value == null) {
                			ComShowCodeMessage("CCD00001", "Group Customer if Group is selected in Individual/Group field");
                			document.form.cust_grp_id.focus();
                			return false;
                		}
                	} 
                }
                
              //2018.01.26.MIS Customer I/F Flag Column 추가
              
                	if(formObj.crm_if_flg.checked){
                    	formObj.crm_if_flg.value = "Y";
                    }else{
                    	formObj.crm_if_flg.value = "N";
                    }

            	   
//                if(formObj.modi_cust_cd.value == "" || formObj.modi_cust_cd.value == null){
//                    ComShowCodeMessage("CCD00001", "Legacy Code");
//                    document.form.modi_cust_cd.focus();
//                    return false;
//                }
                
                if(formObj.key_acct_st_eff_dt.value != ""){
                    //Check the date format is correct for input
                    if(!checkDateValue(formObj.key_acct_st_eff_dt)){
                        formObj.key_acct_st_eff_dt.value="";
                        formObj.key_acct_st_eff_dt.focus();
                        return false;
                    }
                }
                if(formObj.key_acct_end_eff_dt.value != ""){
                    //Check the date format is correct for input
                    if(!checkDateValue(formObj.key_acct_end_eff_dt)){
                        formObj.key_acct_end_eff_dt.value="";
                        formObj.key_acct_end_eff_dt.focus();
                        return false;
                    }
                }
                if(formObj.fndt_dt.value != ""){
                    //Check the date format is correct for input
                    if(!checkDateValue(formObj.fndt_dt)){
                        formObj.fndt_dt.value="";
                        formObj.fndt_dt.focus();
                        return false;
                    }
                }
                if(formObj.nvocc_bd_st_eff_dt.value != ""){
                    //Check the date format is correct for input
                    if(!checkDateValue(formObj.nvocc_bd_st_eff_dt)){
                        formObj.nvocc_bd_st_eff_dt.value="";
                        formObj.nvocc_bd_st_eff_dt.focus();
                        return false;
                    }
                }
                if(formObj.nvocc_bd_end_eff_dt.value != ""){
                    //Check the date format is correct for input
                    if(!checkDateValue(formObj.nvocc_bd_end_eff_dt)){
                        formObj.nvocc_bd_end_eff_dt.value="";
                        formObj.nvocc_bd_end_eff_dt.focus();
                        return false;
                    }
                }
                if(formObj.sls_delt_eff_dt.value != ""){
                    //Check the date format is correct for input
                    if(!checkDateValue(formObj.sls_delt_eff_dt)){
                        formObj.sls_delt_eff_dt.value="";
                        formObj.sls_delt_eff_dt.focus();
                        return false;
                    }
                }
                if((formObj.key_acct_st_eff_dt.value != "") && (formObj.key_acct_end_eff_dt.value != "")){
                    if(ComGetDaysBetween(formObj.key_acct_st_eff_dt, formObj.key_acct_end_eff_dt) < 0){
                        ComShowCodeMessage("CCD00005", "Key Account Expire Date", "Key Account Effective Date");
                        formObj.key_acct_st_eff_dt.value="";
                        formObj.key_acct_end_eff_dt.value="";
                        formObj.key_acct_st_eff_dt.focus();
                        return false;
                    }
                }
                if((formObj.nvocc_bd_st_eff_dt.value != "") && (formObj.nvocc_bd_end_eff_dt.value != "")){
                    if(ComGetDaysBetween(formObj.nvocc_bd_st_eff_dt, formObj.nvocc_bd_end_eff_dt) < 0){
                        ComShowCodeMessage("CCD00005", "Bond Expire Date", "Bond Effective Date");
                        formObj.nvocc_bd_st_eff_dt.value="";
                        formObj.nvocc_bd_end_eff_dt.value="";
                        formObj.nvocc_bd_st_eff_dt.focus();
                        return false;
                    }
                }
                
                if(formObj.rail_road_prio_flg.checked){
                	formObj.rail_road_prio_flg.value = "Y";
                }else{
                	formObj.rail_road_prio_flg.value = "N";
                }
                
                //addr-b
                sheetObj=sheetObjects[1]; //addr
                var prefix=""; //"sheet1_";
                for (i=1;i<=sheetObj.LastRow();i++){
    				if(sheetObj.GetCellValue(i, prefix+"addr_tp_cd") =="1" && sheetObj.GetCellValue(i, prefix+"prmry_chk_flg") == "Y"){
    					if(sheetObj.GetCellValue(i,prefix+"ibflag")=="I"||sheetObj.GetCellValue(i,prefix+"ibflag")=="U"){
    						if(sheetObj.GetCellValue(i,prefix+"bzet_nm") == ""){
                                ComShowCodeMessage("CCD00001", "Customer Name if Address Type is 'Main Address' and Primary Flag is 'Y'");
                                sheetObj.SelectCell(i, prefix+"bzet_nm", true, '');
                                return ;
                            }
                        }
                    }
    				if(sheetObj.GetCellValue(i,prefix+"bzet_addr") == ""){
                        ComShowCodeMessage("CCD00001", "Address");
                        sheetObj.SelectCell(i, 'bzet_addr', 0);
                        return ;
                    }
    				if(sheetObj.GetCellValue(i,prefix+"cnt_cd") == ""){
                        ComShowCodeMessage("CCD00001", "Country");
                        sheetObj.SelectCell(i, 'cnt_cd', 0);
                        return ;
                    }
                }
                var cnt = 0;
                var cntPrimary = 0;
                var flgChkCnt = 0; 
                for(i = 1; i <= sheetObj.LastRow(); i++){
                	if("U" == sheetObj.GetCellValue(i, prefix+"ibflag") || "I" == sheetObj.GetCellValue(i, prefix+"ibflag") || "D" == sheetObj.GetCellValue(i, prefix+"ibflag")){
                        cnt++;
                    }
                	if(sheetObj.GetCellValue(i, prefix+"prmry_chk_flg")=="Y"){
                        cntPrimary++;
                    }
                	
                	if(ComIsEmpty(sheetObj.GetCellValue(i, prefix+"prmry_chk_flg"))){
                		flgChkCnt++;     
                	}
                	
                }
                //SHEET CUD �� �ְ� CUD �� ������ ������/  mandatory �� üũ��.
                if(cnt > 0 && !(sheetObj.GetSaveString(false, true, prefix+"ibflag"))){
//                      ComGetMsg("CCD00019","ADDRESS");
                    return false;
                }
                
                //primary flag 가 null 인 경우 확인 후 메시지
                if(flgChkCnt != 0){
                	ComShowCodeMessage("COM12114", "Primary Flag of Customer Address.");
                    return false;
                }
                
                // prmry_chk_flg �� 1���� ���� 
                if(cntPrimary > 1 ){
                    sheetObj.SelectCell(1, "prmry_chk_flg", 0);
                    ComShowMessage('Address primary flag only one.');
                    return false;
                }
                var rowCnt = sheetObj.RowCount("I") + sheetObj.RowCount("R") + sheetObj.RowCount("U");
                if(cntPrimary == 0 && rowCnt > 0){
                    sheetObj.SelectCell(1, "prmry_chk_flg", 0);
                    ComShowCodeMessage("CCD00008");
                    return false;
                }
                // cntc_pnt-b
                sheetObj = sheetObjects[2]; //addr
                cnt = 0;
                cntPrimary = 0;
                flgChkCnt = 0;
                var doubleChkCnt = 0;
                var valChkCnt = 0;               
                for(i = 1; i <= sheetObj.LastRow(); i++){
                	if("U" == sheetObj.GetCellValue(i, prefix+"ibflag") || "I" == sheetObj.GetCellValue(i, prefix+"ibflag") || "D" == sheetObj.GetCellValue(i, prefix+"ibflag")){
                        cnt++;
                    }
    				if(ComIsEmpty(sheetObj.GetCellValue(i, prefix+"cust_eml"))
    				&& ComIsEmpty(sheetObj.GetCellValue(i, prefix+"cust_ip"))
    				&& ComIsEmpty(sheetObj.GetCellValue(i, prefix+"cust_url"))
    				&& ComIsEmpty(sheetObj.GetCellValue(i, prefix+"intl_phn_no"))
    				&& ComIsEmpty(sheetObj.GetCellValue(i, prefix+"phn_no"))
    				&& ComIsEmpty(sheetObj.GetCellValue(i, prefix+"intl_fax_no"))
    				&& ComIsEmpty(sheetObj.GetCellValue(i, prefix+"fax_no"))){
    					valChkCnt++;
                    }
                	if(sheetObj.GetCellValue(i, prefix+"prmry_chk_flg")=="Y"){
                        cntPrimary++;
                    	if(sheetObj.GetCellValue(i, prefix+"pay_rqst_ltr_flg")=="Y"){
                    		doubleChkCnt++;
                        }
                    }
                	
                	if(ComIsEmpty(sheetObj.GetCellValue(i, prefix+"prmry_chk_flg"))){
                		flgChkCnt++;     
                	}
                }
                if(cnt > 0 && !(sheetObj.GetSaveString(false, true, prefix+"ibflag"))){
                    return false;
                }

                //primary flag 가 null 인 경우 확인 후 메시지
                if(flgChkCnt != 0){
                	ComShowCodeMessage("COM12114", "Primary Flag of Customer Contact Point.");
                    return false;
                }
                
                // cntc_pnt-e
                //SHEET �� ����,��, ���� �� ������ ��� ����� ROW�� ������ �޼���
                if ((cnt > 0) && (valChkCnt != 0) ){
                    ComShowCodeMessage("CCD00043", "Email, IP, URL, Phone No, Fax No");
                    return false;
                }
                // prmry_chk_flg �� 1���� ���� 
                if(cntPrimary > 1 ){
                    sheetObj.SelectCell(1, "prmry_chk_flg", 0);
                    ComShowMessage('Contact Point primary flag only one.');
                    return false;
                }
                rowCnt = sheetObj.RowCount("I") + sheetObj.RowCount("R") + sheetObj.RowCount("U") ;
                if(cntPrimary == 0 && rowCnt > 0){
                    sheetObj.SelectCell(1, "prmry_chk_flg", 0);
                    ComShowCodeMessage("CCD00008");
                    return false;
                }
                // prmry_chk_flg�� pay_rqst_ltr_flg �ߺ�üũ �Ұ� 
                if(doubleChkCnt > 0 ){
                    sheetObj.SelectCell(1, "prmry_chk_flg", 0);
                    ComShowMessage("Contact Point for Payment Request Letter should be primary flag 'N'.");
                    return false;
                }
                
         
               if(formObj.modi_cust_cd2.value != formObj.old_modi_cust_cd.value){
            	   formObj.edi_if_flg.value = "Y";
               }else{
            	   formObj.edi_if_flg.value = "N";
               }
               
               // MOT VALIDATION 추가
               if(formObj.loc_cd.value.substr(0,2) == "CN"){
            	   if(cntr_cust_tp_cd.GetSelectCode() == "N" && (formObj.mot_no.value == "" || formObj.mot_eff_dt.value == "" || formObj.mot_exp_dt.value == "")){
            		   ComShowCodeMessage("CCD00067");
//            		   return false; // Soft stop 으로 로직 변경
            	   }else if(cntr_cust_tp_cd.GetSelectCode() == "B") {
            		   // BCO 일때 NVO KEYWord 확인
            		   formObj.f_cmd.value=SEARCH15;
        			   var sParam=FormQueryString(formObj);
        			   var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
        			   var result=ComGetEtcData(sXml, "result");
        			   
            		   if(formObj.cust_cd.value == "" && result=="Y" && formObj.certi_sav_id.value == ""){
            			   ComShowCodeMessage("CCD00068");
//            			   return false;
            		   }else if(formObj.cust_cd.value != ""){
            			   if(result=="Y" && formObj.certi_flg.value == "N"){
            				   ComShowCodeMessage("CCD00068");
//            				   return false;
            			   }
            		   }
            	   }
               }
        	}else{
        		ComShowCodeMessage("CCD00048");
    	 		return false;
        	}

           break;
        
         
        case SEARCH20: // Retrieve for Customer Hierarchy Validation 
    		var orgCustGrpHrchyCd = ComGetObjValue(formObj.org_cust_grp_hrchy_cd);
    		var newCustGrpHrchyCd = ComGetObjValue(formObj.cust_grp_hrchy_cd);
    		var indivCnt = parseInt(ComGetObjValue(formObj.indiv_ct));
    		var rlop = document.form.rlob_ct.value;
    		
    		if (orgCustGrpHrchyCd == newCustGrpHrchyCd) {
    			return false;
    		}
    		
    		if (orgCustGrpHrchyCd == "G") {
    			ComShowCodeMessage("CCD00051", "Global", (newCustGrpHrchyCd == "C" ? "Country" : "Individual"), "Global");
    			cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			return false;
    		} else if (orgCustGrpHrchyCd == "C" && newCustGrpHrchyCd == "I" && indivCnt == 0) {
    			ComShowCodeMessage("CCD00051", "Country", "Individual", "Country");
    			cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			return false;
    		} else if (orgCustGrpHrchyCd == "C" && newCustGrpHrchyCd == "R" && indivCnt == 0) {
    			ComShowCodeMessage("CCD00051", "Country", "Regional", "Country");
    			cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			return false;
    		} else if (orgCustGrpHrchyCd == "C" && newCustGrpHrchyCd == "G" && indivCnt == 0) {
    			ComShowCodeMessage("CCD00051", "Country", "Global", "Country");
    			cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			return false;
    		} else if (orgCustGrpHrchyCd == "C" && newCustGrpHrchyCd == "R" && rlop == 1) {
    			ComShowCodeMessage("CCD00051", "Country", "Regional", "Country");
    			cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			return false;
    		} else if (orgCustGrpHrchyCd == "I" && newCustGrpHrchyCd == "R" && rlop == 1) {
    			ComShowCodeMessage("CCD00051", "Individual", "Regional", "Individual");
    			cust_grp_hrchy_cd.SetSelectCode(orgCustGrpHrchyCd, false);
    			return false;
    		}
    		break;
        	
           
        }
        return true;
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
            case "cust_cd":
            case "lgcy_cd":
            	if (srcName == "lgcy_cd" && formObject.lgcy_cd.value != ""){
            		doActionIBSheet(sheetObjects[0],formObject,SEARCH21); 
            	}
                if(formObject.cust_cd.value.length>2){           
                	loadChk = "N";
                    formObject.cust_cnt_cd.value=formObject.cust_cd.value.substr(0,2);
                    formObject.cust_seq.value=formObject.cust_cd.value.substr(2,6);
                    if(formObject.cust_seq.value.match(/[^0-9]{1}/)){
                          ComShowCodeMessage("CCD00039", "Customer Code");
                          formObject.cust_cd.value='';
                          return false;
                    }  
                    var custlpad="";
                    if (formObject.cust_seq.value.length <6 ){
                        for(i=1; i <= 6- formObject.cust_seq.value.length; i++){
                             custlpad=custlpad+"0" ;
                        }
                        formObject.cust_cd.value=formObject.cust_cnt_cd.value+custlpad+formObject.cust_seq.value ;
                    }
                    doActionIBSheet(sheetObject1, formObject, SEARCH09);
                    if(formObject.cust_cd.value.length==0) {
                        document.form.cust_cd.focus();
                    } else{
                        formObject.ibflag.value="U";
                        formObject.cust_cd.readOnly=true;     
                        formObject.lgcy_cd.readOnly=true;     
                        document.form.cust_lgl_eng_nm.focus();
                        doActionIBSheet(sheetObject1, formObject, SEARCH);
                	loadChk = "";
                    }
                }
            break;
            case "modi_cust_cd2":
            	// validate modi_cust_cd2 
            	var modi_cnt = "";
            	var modi_seq = "";
            	if(formObject.modi_cust_cd2.value.length>2){
                    modi_cnt = formObject.modi_cust_cd2.value.substr(0,2);
                    modi_seq = formObject.modi_cust_cd2.value.substr(2,6);
                    if(modi_cnt.match(/[^A-Z]{1}/)){
                    	ComShowCodeMessage("CCD00072", "To-Be Customer Code");
						formObject.modi_cust_cd2.value='';
						formObject.modi_cust_cd2.focus();
						return false;
                    }
                    if(modi_seq.match(/[^0-9]{1}/)){
                    	ComShowCodeMessage("CCD00072", "To-Be Customer Code");
						formObject.modi_cust_cd2.value='';
						formObject.modi_cust_cd2.focus();
						return false;
                    }
                    var custlpad="";
                    if (modi_seq.length <6 ){
                        for(i=1; i <= 6- modi_seq.length; i++){
                             custlpad=custlpad+"0";
                        }
                        formObject.modi_cust_cd2.value = modi_cnt + custlpad + modi_seq;
                    }
                    if(formObject.modi_cust_cd2.value.length == 0 || formObject.modi_cust_cd2.value.length > 8){
                    	ComShowCodeMessage("CCD00072", "To-Be Customer Code");
                    	formObject.modi_cust_cd2.value="";
                    	formObject.modi_cust_cd2.focus();
                    	return false;
                    }
                    if (formObject.modi_cust_cd2.value == formObject.cust_cd.value) {
                    	ComShowCodeMessage("CCD00073");
                    	formObject.modi_cust_cd2.value="";
                    	formObject.modi_cust_cd2.focus();
                    	return false;
                    }
                } else{
                	if (formObject.modi_cust_cd2.value.length > 0) {
	                	ComShowCodeMessage("CCD00072", "To-Be Customer Code");
	                    formObject.modi_cust_cd2.value="";
	                    formObject.modi_cust_cd2.focus();
                	}
                	return false;
                }
            	
            	// check whether valid customer code or not
            	doActionIBSheet(sheetObjects[1], formObject, SEARCH23);
            	
            	if (formObject.modi_cust_cd2.value.length == 0) {
            		formObject.modi_cust_cd2.focus();
            	} else{
            		// customer code가 다른 to-be customer code로 사용됐는지 조사 
	            	doActionIBSheet(sheetObjects[1], formObject, SEARCH22);
            	}
            break;
            case "loc_cd":
                if(formObject.loc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH03);
                    if(formObject.loc_cd.value.length==0) {
                        document.form.loc_cd.focus();
                    } else{
                    	document.form.ofc_cd.focus();
                    }
                    if(formObject.creflag.value == "Y"){
                        formObject.cust_cnt_cd.value=formObject.loc_cd.value.substr(0,2);
                        showIndiaInfo(); // Display india info if Customer Country Code is IN(India)
                    }
                }
//                //KR CUSTOMER �϶� �ʼ� üũ  ---> ��ƿ����� �ʿ�������, NYK ������ �ʿ� ��� �����̹Ƿ� �ּ�ó��
//                if(formObject.cust_cnt_cd.value=='KR'){
//                    setClassName(formObject.cust_locl_lang_nm, "input1");
//                    setClassName(formObject.srep_cd, "input");
//                }else {
//                    setClassName(formObject.cust_locl_lang_nm, "input");
//                    setClassName(formObject.srep_cd, "input1");
//                }                       
            break;
            case "ofc_cd":
                if(formObject.ofc_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH04);
                    if(formObject.ofc_cd.value.length==0){
                        document.form.ofc_cd.focus();
                        }else{
                            document.form.srep_cd.focus();
                        }
                }
            break;
            case "vndr_seq":
                if(formObject.vndr_seq.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH05);
                    if(formObject.vndr_seq.value.length==0){
                        document.form.vndr_seq.focus();
                        }else{
                            document.form.cust_grp_id.focus();
                        }
                }
            break;
            case "capi_curr_cd":
                if(formObject.capi_curr_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH06);
                    if(formObject.capi_curr_cd.value.length==0){
                        document.form.capi_curr_cd.focus();
                        }else{
                            document.form.capi_amt.focus();
                        }
                } 
            break;
            case "srep_cd":
                if(formObject.srep_cd.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH10);
                    if(formObject.srep_cd.value.length==0){
                        document.form.srep_cd.focus();
                        }else{
                            indiv_corp_div_cd.Focus();
                        }
                }
            break;
            
            case "cust_grp_id":
                if(formObject.cust_grp_id.value.length>0){
                    doActionIBSheet(sheetObject1, formObject, SEARCH11);
                    cust_grp_hrchy_cd.SetEnable(true);
                    document.form.mlt_trd_acct_flg.focus();
                }
                
              //2018.01.26.MIS Customer I/F Flag Column 추가
                if (formObject.cust_grp_id.value == "") {
                	ComEnableObject(formObject.crm_if_flg, true);
                }
                
            break;
            case "cnsd_cust_cd":
                if(formObject.cnsd_cust_cd.value.length>2){
                    if(formObject.cnsd_cust_seq.value.match(/[^0-9]{1}/)){
                          ComShowCodeMessage("CCD00039", "Payment Request Letter Consolidated Customer ID");
                          formObject.cnsd_cust_cd.value='';
                          return false;
                    }
                    formObject.cnsd_cust_cnt_cd.value=formObject.cnsd_cust_cd.value.substr(0,2);
                    formObject.cnsd_cust_seq.value=formObject.cnsd_cust_cd.value.substr(2,6);
                    var custlpad="";
                    if (formObject.cnsd_cust_seq.value.length <6 ){
                        for(i=1; i <= 6- formObject.cnsd_cust_seq.value.length; i++){
                             custlpad=custlpad+"0";
                        }
                        formObject.cnsd_cust_cd.value=formObject.cnsd_cust_cnt_cd.value+custlpad+formObject.cnsd_cust_seq.value;
                    }
                    doActionIBSheet(sheetObject1, formObject, SEARCH14);
                    if(formObject.cnsd_cust_cd.value.length==0){
                        document.form.cnsd_cust_cd.focus();
                    }
                } else{
                    formObject.cnsd_cust_cnt_cd.value="";
                    formObject.cnsd_cust_seq.value="";
                }
            break;
            case "delt_flg":
                if(formObject.delt_flg.value == "Y") {
                    if(!ComShowCodeConfirm("COM130301", "data")) formObject.delt_flg.value="N";
                }
            break;
            case "key_acct_flg":
            	if(formObject.key_acct_flg.value == "Y"){
            		formObject.key_acct_st_eff_dt.disabled = false;
            		formObject.key_acct_end_eff_dt.disabled = false;
            	}else{
            		formObject.key_acct_st_eff_dt.disabled = true;
            		formObject.key_acct_end_eff_dt.disabled = true;
            	}
            break;
            case "sez_flg":
            	if(formObject.sez_flg.value == "Y") {
            		formObject.sez_desc.disabled = false;
            	} else {
            		formObject.sez_desc.disabled = true;
            		formObject.sez_desc.value = "";
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
* HTML Object OnKeyPress event handling
*/
function obj_keypress(event) {
    obj=event.srcElement;
    keyValidation(obj);
    var formObj=document.form;
    var eleObj=window.event.srcElement;
    var srcName=eleObj.getAttribute("name");
    switch(srcName) {
        case "key_acct_st_eff_dt":                        
            checkDateForm(formObj.key_acct_st_eff_dt);
        break;
        case "key_acct_end_eff_dt":                   
            checkDateForm(formObj.key_acct_end_eff_dt);
        break;
        case "nvocc_bd_st_eff_dt":                    
            checkDateForm(formObj.nvocc_bd_st_eff_dt);
        break;
        case "nvocc_bd_end_eff_dt":                   
            checkDateForm(formObj.nvocc_bd_end_eff_dt);
        break;
        case "sls_delt_eff_dt":                   
            checkDateForm(formObj.sls_delt_eff_dt);
        break;
        case "fndt_dt":           
            checkDateForm(formObj.fndt_dt);
        break;
        case "srep_cd":
            if(formObj.srep_cd.value.length==5){
                doActionIBSheet(sheetObjects[1], formObj, SEARCH10);
                if(formObj.srep_cd.value.length==0){
                    document.form.srep_cd.focus();
                    }else{
                        indiv_corp_div_cd.Focus();
                    }
            }
        break;
    }
}
function ComCcdSetPrefix(sStr, sPrefix){
    if (sStr == null || sStr == "" || sPrefix == null || sPrefix == "") {
        return sStr;
    }
    var regexp=RegExp(/&/g);
    sStr=sPrefix + sStr.replace(regexp, "&" + sPrefix);
    return sStr;
}
function getSaveString(params){
    var saveString=null;
    if (params == null) {
        saveString="";
    } else {
        saveString=params.join("&");
    }
    return saveString;
}     
function sheet1_OnSearchEnd(sheetObj){
    for (var i=1; i<=sheetObjects[1].RowCount(); i++){
        sheetObjects[1].SetCellValue(i,'ibflag','R',0);
    }
    for (var i=1; i<=sheetObjects[2].RowCount(); i++){
        sheetObjects[2].SetCellValue(i,'ibflag','R',0);
    }
}
function sheet1_OnSaveEnd(sheetObj){
    for (var i=1; i<=sheetObjects[1].RowCount(); i++){
        sheetObjects[1].SetCellValue(i,'ibflag','R',0);
    }
    for (var i=1; i<=sheetObjects[2].RowCount(); i++){
        sheetObjects[2].SetCellValue(i,'ibflag','R',0);
    }
}
function sheet2_OnPopupClick(sheetObj,Row,Col)
{
    var formObj=document.form;
    var param="";
    var prefix="";
    if (sheetObj.ColSaveName(Col) == prefix+"cnt_cd") {
        param=param + "&" + "cnt_cd=";
        //+sheetObj.CellValue(Row,Col);
        ComOpenPopup('/opuscntr/COM_ENS_0M1.do?' + param, 780, 470, 'getCOM_ENS_0M1', '1,0,1,1,1,1,1,1', true, Col, Row);
    }else if (sheetObj.ColSaveName(Col) == prefix+"ste_cd") {
        param=param + "&" + "ste_cd=";
        //+sheetObj.CellValue(Row,Col);
        ComOpenPopup('/opuscntr/COM_ENS_0X1.do?' + param, 780, 470, 'getCOM_ENS_0X1', '1,0,1,1,1,1,1,1', true, Col,Row);
    }
}

function sheet2_OnChange(sheetObj, row, col, value) {
	var formObj = document.form;
	if (sheetObj.ColSaveName(col) == "cnt_cd"){
		formObj.sheet_cust_cnt_cd.value = value;
//		doActionIBSheet(sheetObjects[0],formObj,SEARCH15);
		formObj.f_cmd.value=SEARCH14;
        var sParam=FormQueryString(formObj);
        var sXml=sheetObj.GetSearchData("BCM_CCD_0035GS.do", sParam);
        var result=ComGetEtcData(sXml, "result");
        if(result==""){
            ComShowCodeMessage("COM130402", "Customer Country Code");
            sheetObj.SetCellValue(row, col, "", 0);
            sheetObj.SelectCell(row, col, 1);
        }
	}
}

function getCOM_ENS_0M1(aryPopupData, Row, Col) {
    var sheetObj=sheetObjects[1];
    var formObj=document.form;
    var prefix="";
    if ( aryPopupData.length > 0 ) {
        sheetObj.SetCellValue(Row,prefix+"cnt_cd",aryPopupData[0][3]);
    }
}
function getCOM_ENS_0X1(aryPopupData, Row, Col) {
    var sheetObj=sheetObjects[1];
    var formObj=document.form;
    var prefix="";
    if ( aryPopupData.length > 0 ) {
        sheetObj.SetCellValue(Row,prefix+"ste_cd",aryPopupData[0][3]);
    }
}
function setClassName(obj, val) {
    obj.className=val;
}

function sheet2_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
//	 if(formObj.cust_cd.value != ""){
//     	formObj.btn_upload.disabled = false; 
//     }
    ComOpenWait(false);
}
function sheet2_OnSaveEnd(sheetObj){
    for (var i=1; i<=sheetObjects[1].RowCount(); i++){
        sheetObjects[1].SetCellValue(i,'ibflag','R',0);
		sheetObjects[1].SetCellEditable(i, "addr_tp_cd", false);
    }
//    var formObj=document.form;
//    alert(formObj.rqst_no.value + " , " + formObj.cust_cd.value);
//	if(formObj.rqst_no.value == '' && formObj.cust_cd.value != '') {
//        for(i=1; i <=sheetObjects[1].RowCount(); i++){
//        	alert(sheetObjects[1].GetRowStatus(i));
//        	if( sheetObjects[1].GetRowStatus(i) == "R"){
//        		sheetObjects[1].SetCellEditable(i, "addr_tp_cd", false);
//        	}
//        }
//	}
}

function sheet3_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) {
    ComOpenWait(false);
}

/**
 * When Save, Call Function 
*/
 function setSave(confMsg, saveMsg) {
	var formObj   = document.form;
	var sheetObj  = sheetObjects[0];
	if (formObj.cust_seq.value == "" && formObj.saveflag.value == "N") return;	
	if(nmd_cust_flg.GetSelectCode() != "Y"){
		if (!confirm(confMsg)) {
			formObj.saveflag.value="N";
			return false;
		}
	}
		
	if( formObj.creflag.value == "N" && formObj.cust_seq.value != "" && formObj.rqst_no.value == ''){
		formObj.f_cmd.value=MULTI;
        var params=new Array();
        params[0]=ComCcdSetPrefix(sheetObjects[1].GetSaveString(true,true),"sheet2_");
        params[1]=ComCcdSetPrefix(sheetObjects[2].GetSaveString(true,true),"sheet3_");
        params[2]=sheetObjects[3].GetSaveString(true,true);  //Customer Hierarchy Type
        
        
        var sParam=FormQueryString(formObj)+ "&" + getSaveString(params);
        var sXml=sheetObj.GetSaveData("BCM_CCD_0035GS.do", sParam);
        var arrXml=sXml.split("|$$|");
        var sav=ComGetEtcData(arrXml[0], "TRANS_RESULT_KEY");
		if(sav == "S"  ){
			ComShowCodeMessage("COM130102", "Data");
			doActionIBSheet(sheetObjects[0], document.form, SEARCH);
		}else{
			ComShowCodeMessage("COM130103", "Data");
		}
	} else {
		formObj.f_cmd.value=MULTI01;
		if(nmd_cust_flg.GetSelectCode() == "Y"){
			formObj.cust_cnt_cd.value = "AA";
		}else{
			formObj.cust_cnt_cd.value = formObj.loc_cd.value.substr(0,2);
		}
        var params=new Array();
        params[0]=ComCcdSetPrefix(sheetObjects[1].GetSaveString(true,true),"sheet2_");
        params[1]=ComCcdSetPrefix(sheetObjects[2].GetSaveString(true,true),"sheet3_");
        var sParam=FormQueryString(formObj) + "&" + getSaveString(params);
        var sXml=sheetObj.GetSaveData("BCM_CCD_0035GS.do", sParam);
        var sav=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		if(sav == "S"  ){
			var rqstNo=ComGetEtcData(sXml, "RQST_NO");
			ComSetObjValue(formObj.rqst_no, rqstNo);
			doActionIBSheet(sheetObj, formObj, SEARCH12);
		} else {
			showErrorMsg(sXml);
			//ComShowCodeMessage("COM130103", "Data");
		}
		
		if(formObj.creflag.value == "Y"){
			ComBtnDisable("btn_Save");
		}
	}
}

/**
 * Call Back Function  
 */
function getBCM_CCD_1035_saveflag(saveFlag) {
	var formObj   = document.form;
	    var confMsg;
	var saveMsg;
	formObj.saveflag.value=saveFlag;	
	confMsg=ComGetMsg("CCD00030");
	saveMsg=ComGetMsg("CCD00031");
	if(nmd_cust_flg.GetSelectCode() == "Y"){
		ComOpenWait(true);
		setTimeout(function(){
			autoApprove();
		},1000);
	}else{
		setSave(confMsg, saveMsg );
		ComShowCodeMessage("CCD00031", "Data");
	}
}

function cust_div_cd_OnChange(OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
	var formObj = document.form;
//	alert("CODE:"+cust_div_cd.GetSelectCode());
//	alert("CHK:"+loadChk);
//	if (loadChk != "N") {
		if(cust_div_cd.GetSelectCode() == "G"){
			formObj.cust_grp_id.disabled = false;
		formObj.cust_grp_id.value = "";
			setClassName(formObj.cust_grp_id, "input1");
			ComEnableObject(formObj.btn_com_com_0006, true);
		}else{
				
			formObj.cust_grp_id.disabled = true;
			formObj.cust_grp_id.value='';   // 2017.06.22. Group Customer ��Ȱ��ȭ
			setClassName(formObj.cust_grp_id, "input");
			ComEnableObject(formObj.btn_com_com_0006, false);
		}
		
		    // Customer Hierarchy �� Individual/Group�� �� Alert Message Popup, �׸��� ��ȸ, Group Id ��ȸ
	       if(cust_div_cd.GetSelectCode() == "I" &&  ComGetObjValue(formObj.cust_grp_hrchy_cd) == "G") {
			   ComShowCodeMessage("CCD00056");
			   cust_div_cd.SetSelectCode("G", false);
			   doActionIBSheet(sheetObjects[0], document.form, SEARCH);
			   formObj.cust_grp_id.disabled = false;
			   setClassName(formObj.cust_grp_id, "input1");
			   ComEnableObject(formObj.btn_com_com_0006, true);
			   return;
			   
		   } else if (cust_div_cd.GetSelectCode() == "I" &&  ComGetObjValue(formObj.cust_grp_hrchy_cd) == "C") {
			   ComShowCodeMessage("CCD00057");
			   cust_div_cd.SetSelectCode("G", false);
			   doActionIBSheet(sheetObjects[0], document.form, SEARCH);
			   formObj.cust_grp_id.disabled = false;
			   setClassName(formObj.cust_grp_id, "input1");
			   ComEnableObject(formObj.btn_com_com_0006, true);
			   return;
			   
		   }
//	}
}

function nmd_cust_flg_OnChange(OldIndex, OldText, OldCode, NewIndex, NewText, NewCode){
	var formObj = document.form;
	
	if(nmd_cust_flg.GetSelectCode() == "Y"){
		setClassName(formObj.loc_cd, "input");
		setClassName(formObj.ofc_cd, "input");
		setClassName(formObj.srep_cd, "input");
		cntr_cust_tp_cd.SetBackColor("#FFFFFF");
		cust_grp_hrchy_cd.SetBackColor("#FFFFFF");
		cust_div_cd.SetBackColor("#FFFFFF");
		cust_grp_hrchy_cd.SetEnable(0);  
		cust_div_cd.SetEnable(false);
		ComEnableObject(formObj.crm_if_flg, false);
	}else{
		setClassName(formObj.loc_cd, "input1");
		setClassName(formObj.ofc_cd, "input1");
		setClassName(formObj.srep_cd, "input1");
		cntr_cust_tp_cd.SetBackColor("#D4F4FA");
		cust_grp_hrchy_cd.SetBackColor("#D4F4FA");
		cust_div_cd.SetBackColor("#D4F4FA");
		cust_grp_hrchy_cd.SetEnable(1);  
		cust_div_cd.SetEnable(true);
		ComEnableObject(formObj.crm_if_flg, true);
	}
}

// customer hierarchy Type 
function cust_grp_hrchy_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
	//console.log("test");
	sheetObjects[3].RemoveAll();
	
	if(popupcheck == 'Y') {
		return;
	}
	
	var custGrpId = ComGetObjValue(document.form.cust_grp_id);
	if (custGrpId == "") {
		return;
	}
	
	doActionIBSheet(sheetObjects[3], document.form, SEARCH20);
	
}

/**
 * Display india info(GST No, Customer in SEZ, SEZ details) if Customer Country Code is IN(India)
 */
function showIndiaInfo() {
	var formObject = document.form;
	if (formObject.cust_cnt_cd.value == "IN") {
    	sheetObjects[1].SetColProperty(0, "ste_cd", {KeyField:"1"});
    } else {
    	sheetObjects[1].SetColProperty(0, "ste_cd", {KeyField:"0"});
    }
} 

function sheet1_OnLoadExcel(sheetObj, result, code, msg){
	if(isExceedMaxRow(msg))return;
	document.form.certi_flg.value = "Y";
//	document.form.btn_upload.style.background = "#FF0000";
//	 if(formObj.cust_cd.value != ""){
//     	formObj.btn_upload.disabled = false; 
//     }
	ComShowCodeMessage("CCD00069");
}

function autoApprove(){
	var formObj = document.form;
    var confMsg;
	var saveMsg;
	var sheetObj = sheetObjects[0];
	formObj.saveflag.value = "Y";	
	confMsg=ComGetMsg("CCD00030");
	saveMsg=ComGetMsg("CCD00031");
	
	setSave(confMsg, saveMsg );
	
	//Approve
	
	formObj.f_cmd.value = MULTI04;
	formObj.proc_tp_cd.value = "A";
	formObj.rqst_usr_id.value = formObj.cre_usr_id.value;
	
	var sParam = FormQueryString(formObj);
	var sXml=sheetObj.GetSaveData("BCM_CCD_2002GS.do", sParam);
		var result=ComGetEtcData(sXml, "TRANS_RESULT_KEY");
		var approvedRqst = ComGetEtcData(sXml, "approved_request");
		if(result != "F"){
			if(approvedRqst != "" && approvedRqst != null){
				ComShowCodeMessage("CCD00046", approvedRqst);
			}else{
				ComOpenWait(false);
				ComShowCodeMessage("CCD00026");
				init();
				var custSeq=ComGetEtcData(sXml, "cust_seq");
				formObj.cust_cnt_cd.value= "AA";
				formObj.cust_seq.value= custSeq;
				formObj.cust_cd.value= "AA" + custSeq ;
				doActionIBSheet(sheetObjects[0], formObj, SEARCH);
			}
		}
		else{
			ComShowCodeMessage("COM130103", "Data");
		}
}

function init(){
	var formObj = document.form;
	formObj.cust_cd.style.backgroundColor="#cdffff";
    ComResetAll();
    doActionIBSheet(sheetObjects[0],formObj,IBCLEAR);
    cust_grp_hrchy_cd.SetEnable(1);  // Customer Hierarchy �� ���� Ȱ��ȭ (Creation ���� ��Ȱ�� ó���� ���� Ȱ��ȭ)
    cust_div_cd.SetEnable(true);     // Dummy �ڵ� ��ȸ�� Individual Group Column ��ȸ �Ұ� 
    formObj.creflag.value="N";
    formObj.saveflag.value="N";
    formObj.cust_seq.value = "";
    formObj.rqst_no.value = "";
    formObj.cust_cd.readOnly=false;
    formObj.lgcy_cd.readOnly=false;
    formObj.modi_cust_cd2.readOnly=false;
    formObj.old_modi_cust_cd.value = "";
    formObj.edi_if_flg.value = "N";
    formObj.sprt_eml_inv_flg.value = "N";
    formObj.certi_sav_id.value = "";
    formObj.certi_flg.value = "";
    setClassName(formObj.cust_locl_lang_nm, "input");
    setClassName(formObj.srep_cd, "input1");
    setClassName(formObj.ofc_cd, "input1");
    setClassName(formObj.loc_cd, "input1");
    cntr_cust_tp_cd.SetEnable(true);
    nmd_cust_flg.SetEnable(true);
    sheetObjects[1].SetColProperty(0, "ste_cd", {KeyField:"0"});
    formObj.sez_desc.disabled = true;
    ComEnableObject(formObj.crm_if_flg, true);
    ComBtnEnable("btn_Create");
    ComEnableObject(formObj.btn_com_ens_041, true);
    ComBtnEnable("btn_del");
    ComBtnEnable("btn_Save");
    formObj.btn_upload.disabled = false;
}