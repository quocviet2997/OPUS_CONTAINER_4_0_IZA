/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_01.js
*@FileTitle  : Invoice Issue
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/13
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
 // common global valiables
 var tabObjects=new Array(); 
 var tabCnt=0 ;
 var beforetab=1;
 var sheetObjects=new Array();
 var sheetCnt=0;
 //var rdObjects=new Array();
 //var rdCnt=0;
 var timer=null;
 var comboObjects=new Array();
 var appendReport = [];

 // define button click event handler */
 document.onclick=processButtonClick;
 
 var cfmFlg = ""; //2018-04-30	
 var mmFlg = ""; //2018-04-30	
 
 
 /**
  * event handler branch process by button name<br>
  * <br><b>Example :</b>
  * <pre>
  *     processButtonClick()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
function processButtonClick(){
    var sheetObject1=sheetObjects[0];
    //var sheetObject2=sheetObjects[1];
    /*******************************************************/
    var formObject=document.form;
    try {
        var srcName=ComGetEvent("name");            
        switch(srcName) { 
            case "btn_paperissue": 

            	document.form.btn_goto.disabled=true;
            	document.form.btn_paperissue.disabled=true;
                
				setTimeout( function () {
	                if(validateForm(sheetObjects[0],formObject)){                	
	                    formObject.email_flag.value="N";
	                    chkCustInfo();
	                    //doActionIBSheet(sheetObjects[0],formObject,IBINSERT);
	                } else {
	                    return;
	                }
				} , 500);
                
                break;
            case "btn_new":
                initField();
                setRevType();
                ComBtnEnable("btn_goto");
                ComBtnEnable("btn_paperissue");
				cfmFlg = ""; //2018-04-30	
				mmFlg = ""; //2018-04-30	
                break;
            case "btn_Close":
                ComClosePopup(); 
                break;    
            case "btn_goto":   

            	document.form.btn_goto.disabled=true;
            	document.form.btn_paperissue.disabled=true;
            	
				setTimeout( function () {
					if(formObject.f_inv.value != "" & formObject.t_inv.value != ""){
	                    var ar_ofc_cd_str=formObject.ar_ofc_cd2.value;
	                    var invMltBlIssFlg=formObject.inv_mlt_bl_iss_flg.value;
						//2014.10.16 INV Form logic change by IY Cho
						var otsSmryCd = formObject.ots_smry_cd.value;
						var officeCntCd = formObject.office_cnt_cd.value;
						var taxCntFlg = formObject.tax_cnt_flg.value;
						//alert("kkk=="+"FNS_INV_0034_02.do?issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd+"&taxCntFlg="+taxCntFlg);
	                    ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd, "pop", 1010, 750);
	                }else{

	                	if(validateForm(sheetObjects[0],formObject) == false) return false;  
	                		 var ar_ofc_cd_str=formObject.ar_ofc_cd2.value;
	                            formObject.email_flag.value="Y";

	                            chkCustInfo();

	                            //doActionIBSheet(sheetObjects[0],formObject,IBINSERT);
	                            var state=formObject.state.value;  
	                            var r_invs=formObject.inv_nos.value;  
	                            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
	                            setOfcOtherInfo(arrStr2);
	                }					
				} , 500);

                break; 
//*********** JHJ 2017.06  start!  *************  
            case "btn_check":   //*********** JHJ 2017.06
            	var ar_ofc_cd_str=formObject.ar_ofc_cd2.value; 
   
            	if(validateFormPopup(sheetObjects[0],formObject) == false) return false;  
         	
            	param = "arOfcCd="+ar_ofc_cd_str
            		+"&vvd="+formObject.vvd.value+"&port="+formObject.port.value+"&scope="+formObject.scp.value
            		+"&custCntCd="+formObject.cust_cnt_cd.value+"&custSeq="+formObject.cust_seq.value
            		+"&toDate="+formObject.to_date.value+"&bound="+formObject.bnd.value;
            	ComOpenWindowCenter("FNS_INV_0034_03.do?"+param, "pop", 850, 400, true);
                
                break;   
            case "btns_calendar1": 
                var cal=new ComCalendar();
                cal.select(formObject.to_date, 'yyyy-MM-dd');
            break;
//*********** JHJ 2017.06  end!  *************      
                
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
 * RD File open <br>
 * <br><b>Example :</b>
 * <pre>
 *     rdOpen(Rdviewer, inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn)
 * </pre>
 * @param {rdviewer} rdObject Rdviewer Object
 * @param {String} inv_no Invoice number
 * @param {String} line_num Description lile number 
 * @param {String} user_nm user name
 * @param {String} ofc_cd office code
 * @param {String} logo logo name
 * @param {String} vvd vvd
 * @param {String} port_cd port code
 * @param {String} attach letter wording  attach flag
 * @param {String} paperYn print, email flag
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function rdOpen(inv_no, line_num, user_nm, ofc_cd, logo, vvd, port_cd, attach, paperYn){
	var formObj = document.form;
	var rdFile = "";
	var issue_type = "";
	var ots_smry_cd = formObj.ots_smry_cd.value;
	var inv_mlt_bl_iss_flg = formObj.inv_mlt_bl_iss_flg.value;
	var iss_grp_tp_cd = formObj.iss_grp_tp_cd.value;
	var office_cnt_cd = formObj.office_cnt_cd.value;
	var tax_cnt_flg = formObj.tax_cnt_flg.value;
	var grp_inv_flg = formObj.grp_inv_flg.value;

	
	//2014.10.16 INV Form logic change by IY Cho
	if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg == "N"){
		rdFile = "FNS_INV_0001.mrd";
	}else{
		if(iss_grp_tp_cd == "C"){
			rdFile = "FNS_INV_0003.mrd";
		}else if(iss_grp_tp_cd == "V"){
			rdFile = "FNS_INV_0002.mrd";
		}
	}
	
	if(office_cnt_cd == "BR"){
		if(ots_smry_cd == "INV" || inv_mlt_bl_iss_flg == "N"){
			rdFile = "FNS_INV_0005.mrd";
		}else{
			if(iss_grp_tp_cd == "C"){
				rdFile = "FNS_INV_0004.mrd";
			}else if(iss_grp_tp_cd == "V"){
				rdFile = "FNS_INV_0006.mrd";
			}
		}
//	}else if(office_cnt_cd == "FR"){
//		rdFile = "FNS_INV_0522.mrd";
	}else if(office_cnt_cd == "IN"){
		if(grp_inv_flg == "Y"){
			rdFile = "FNS_INV_0516.mrd";
		}else{
			if(inv_no.length > 9){
				rdFile = "FNS_INV_0515.mrd";
			}else{
				rdFile = "FNS_INV_0514.mrd";
			}
		}

	}else if(office_cnt_cd == "TH"){
		rdFile = "FNS_INV_0540.mrd";
	}else if(office_cnt_cd == "VN"){
		rdFile = "FNS_INV_0531_SINGLE.mrd";
	}else if(office_cnt_cd == "KR"){
		//rdFile = "FNS_INV_0104.mrd";
		if(formObj.ar_ofc_cd2.value == 'PUSBB'){
			rdFile = "FNS_INV_0104.mrd";
		}
	}

//*********** JHJ 2018.01  START!  *************      
	if(tax_cnt_flg =="Y"){
		
		if(office_cnt_cd == "CI" ){
			//alert("Ivory Coast!!!-DE");
			rdFile = "FNS_INV_0101.mrd";
		} else if(office_cnt_cd == "MM" ){
			rdFile = "FNS_INV_0001.mrd";
		} else {
			rdFile = "FNS_INV_0102.mrd";
		}
		
		if(office_cnt_cd == "AE" ){	
			rdFile = "FNS_INV_0103.mrd";
			if(cfmFlg == "" ) {  //2018-04-30	
				if(ComShowCodeConfirm("INV00180")) {   //YES
					mmFlg = "Y";
				} else {						
					mmFlg = "";
				}
				cfmFlg = "Y";
			} 			
		}	
		
	}
//*********** JHJ 2018.01  END!  *************     	

	rdParam = "/rv frm1_inv_no["+inv_no+"] frm1_logo["+logo+"] frm1_login_nm ["+user_nm+"] frm1_ofc_cd ["+ofc_cd+"] frm1_line_num ["+line_num+"] frm1_vsl_cd["+vvd.substr(0,4)+"] frm1_skd_voy_no["+vvd.substr(4,4)+"] frm1_skd_dir_cd["+vvd.substr(8,1)+"] frm1_port_cd ["+port_cd+"] frm1_att_gb ["+attach+"] frm1_paper_yn ["+paperYn+"] frm1_issue_type["+issue_type+"] frm1_att_gb2[N] frm1_cust_cnt_cd[] frm1_cust_seq[] frm1_mm_flg["+mmFlg+"]";

	var rdUrl="apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/"; 
    //Rdviewer.FileOpen(RD_path + rdUrl + rdFile, RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait");
	appendReport.push({mrdPath:RD_path + rdUrl + rdFile, mrdParam: RDServer + rdParam + "/rpagenuminit [1] /riprnmargin /rwait"});
}
/**
 * add IBSheet Object array <br>
 * <br><b>Example :</b>
 * <pre>
 *     setSheetObject(sheetObj)
 * </pre>
 * @param {ibsheet} sheetObj 필수 IBSheet Object
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function setSheetObject(sheetObj){
    sheetObjects[sheetCnt++]=sheetObj;
}
/**
 * define onLoad event handler <br>
 * <br><b>Example :</b>
 * <pre>
 *     loadPage()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function loadPage() {
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }
    
    //init IBMultiCombo
    for(var k=0; k<comboObjects.length; k++){
        initCombo(comboObjects[k],k+1);
    }

    initControl();
    doActionIBSheet(sheetObjects[0], document.form, "IBSEARCH_ASYNC30");
    //initRdConfig(rdObjects[0]);
    sheet1OnLoadFinish(sheetObjects[0]);
    if(document.form.office_cnt_cd.value=="TH"){
        rev_type.InsertItem(0, "FRT", "F");
        rev_type.InsertItem(1, "MRI", "M");
        rev_type.SetSelectText("FRT");
    }else{
        rev_type.InsertItem(0, "All", "");
        rev_type.InsertItem(1, "FRT", "F");
        rev_type.InsertItem(2, "MRI", "M");
        rev_type.SetSelectText("All");
    }    
    
/* JHJ 2017-06 start! */
    setDate();
    document.form.btn_check.disabled=true;
    document.form.to_date.readOnly=true;
    document.form.to_date.className="input2";
    ComShowObject(document.form.btns_calendar1,false);

	doActionIBSheet(sheetObjects[0], document.form,IBSEARCH_ASYNC02);

	cfmFlg = ""; //2018-04-30	
	mmFlg = ""; //2018-04-30	
/* JHJ 2017-06 end! */
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
                SetColWidth(0, "50");
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
 * sheet1_OnLoadFinish event <br>
 * <br><b>Example :</b>
 * <pre>
 *     sheet1_OnLoadFinish(sheetObj);
 * </pre>
 * @param {ibsheet} sheetObj 
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function sheet1OnLoadFinish(sheetObj) {
     for(var i=0; i<40; i++){
         sheetObj.DataInsert(-1);
     }
     sheetObj.SelectCell(1,0,false);
     doActionIBSheet(sheetObjects[0],document.form,IBSEARCH); 
//   var ar_ofc_cd=document.form.ar_ofc_cd.text
 }
 /**
  * inti RD Object <br>
  * <br><b>Example :</b>
  * <pre>
  *     initRdConfig(rdObject)
  * </pre>
  * @param {rdviewer} rdObject Rdviewer Object
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function initRdConfig(rdObject){
     var Rdviewer=rdObject;
     //Rdviewer.SetSheetHeight(0);
     Rdviewer.style.width=0;
     Rdviewer.AutoAdjust=true;
     Rdviewer.ViewShowMode(0);
     //Rdviewer.SetBackgroundColor(128,128,128);
     Rdviewer.SetPageLineColor(128,128,128);
     Rdviewer.ApplyLicense("0.0.0.0"); 
 }
 /**
  * init Office Combo <br>
  * <br><b>Example :</b>
  * <pre>
  *     MakeComboObject(cmbObj, arrStr);
  * </pre>
  * @param {ibCombo} cmbObj
  * @param {String} combo list stirng
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function MakeComboObject(cmbObj, arrStr) {
    cmbObj.RemoveAll();
    for (var i=1; i < arrStr.length;i++ ) {
        var arrStr2=arrStr[i].split("^");
        var ar_ofc_cd_str=arrStr2[1];
        cmbObj.InsertItem(i-1, ar_ofc_cd_str, arrStr[i]);
    }
    cmbObj.SetBackColor("#CCFFFD");
    cmbObj.SetDropHeight(190);
 }     
 
 
 /**
  * Office change event <br>
  * <br><b>Example :</b>
  * <pre>
  *     ar_ofc_cd_OnChange(comboObj,code ,oldindex, oldtext, oldcode , newindex, newtext , newcode);
  * </pre>
  * @param {IBMultiCombo} comboObj
  * @param {String} oldIndex
  * @param {String} oldText
  * @param {String} oldCode
  * @param {String} newIndex
  * @param {String} newText
  * @param {String} newCode
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function ar_ofc_cd_OnChange(comboObj,code ,oldindex, oldtext, oldcode , newindex, newtext , newcode) {
	var formObj = document.form;
	
	getCopyCnt();
    var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
    setOfcOtherInfo(arrStr2);

    setRevType();
    
    //inv_curr_cd setting
    inv_curr_cd.RemoveAll();
    var lclCurr = formObj.locl_curr_cd.value;
    var altnCurr = formObj.altn_curr_div_cd.value;
    
    inv_curr_cd.InsertItem(0, lclCurr, lclCurr);
    if(lclCurr != altnCurr && altnCurr != "" && altnCurr != "LCL" ) { 
    	inv_curr_cd.InsertItem(1, altnCurr, altnCurr);
    	inv_curr_cd.SetSelectText(lclCurr);
    } else {
    	inv_curr_cd.SetSelectText(lclCurr);
    	
    }
    
    if(document.form.office_cnt_cd.value=="IN"){ // India
    	ComShowObject(ComGetObject("d_group"), true);
    } else {
    	ComShowObject(ComGetObject("d_group"), false);
    }
    
	doActionIBSheet(sheetObjects[0], formObj,IBSEARCH_ASYNC02);
    
 }
 /**
  * retrieve Number of copy invoice <br>
  * <br><b>Example :</b>
  * <pre>
  *     getCopyCnt();
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function getCopyCnt() {
    var sheetObject=sheetObjects[0];
    var formObject=document.form;           
    doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC10);   
 }
 /**
  * onfocusout evevnt<br>
  * <br><b>Example :</b>
  * <pre>
  *    getCustNm()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function getCustNm() {
    var sheetObject=sheetObjects[0];
    var formObject=document.form;
    doActionIBSheet(sheetObject,formObject,IBSEARCH_ASYNC20);                   
 } 
 /**
  * OnKeyUp event <br>
  * <br><b>Example :</b>
  * <pre>
  *    objKeyup()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function objKeyup() {
    var formObject=document.form;
   switch (ComGetEvent("name")) {
    case "cust_cnt_cd":
        initInvNO();
        var v_cust_cnt_cd=formObject.cust_cnt_cd.value;
        if (v_cust_cnt_cd.length == 2) {
            formObject.cust_seq.focus();                
        }
    break;          
    case "bnd":
        initInvNO();            
    break;
    case "ar_ofc_cd":
        initInvNO();            
    break;
    case "vvd":
        initInvNO();            
    break;
    case "scp":
        initInvNO();            
    break;
    case "port":
        initInvNO();            
    break;
    case "cust_cnt_cd":
        initInvNO();            
    break;
    case "cust_seq":
        initInvNO();            
    break;
    case "rev_type":
        initInvNO();            
    break;      
   }    
}     
 function initInvNO(){
    var formObj=document.form;
        formObj.f_inv.value="";
        formObj.t_inv.value="";
        formObj.tot_inv_cnt.value="";
 }
 /**
  * open Customer Information Inquiry UI <br>
  * <br><b>Example :</b>
  * <pre>
  *     openFnsInv0013()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function openFnsInv0013() {    
    var formObject=document.form;
    if(formObject.cust_cnt_cd.value != "" && formObject.cust_seq.value != "") {
        var param='?cust_cnt_cd='+formObject.cust_cnt_cd.value+'&cust_seq='+formObject.cust_seq.value+'&pop_yn=Y';
        ComOpenPopup('/opuscntr/FNS_INV_0013.do' + param, 1000, 680, 'getPopData', '0,0', false, false, "", "", 0);    
    }
 }
 /**
  * open Quick Customer Search UI <br>
  * <br><b>Example :</b>
  * <pre>
  *     openFnsInv0086()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function openFnsInv0086() {
    var classId="FNS_INV_0086";
    ComOpenPopup('/opuscntr/FNS_INV_0086.do', 900, 400, 'getFnsInv0086', '1,0', false, false);
 }    
 /**
  * function called Quick Customer Search popup <br>
  * <br><b>Example :</b>
  * <pre>
  *     getFnsInv0086()
  * </pre>
  * @param rowArray
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function getFnsInv0086(rowArray) {
     var colArray=rowArray[0];
     var formObject=document.form;
     formObject.cust_cnt_cd.value=colArray[8];
     formObject.cust_seq.value=ComLpad(colArray[9], 6, '0');
     formObject.cust_nm.value=colArray[4];
 }    
 
 /**
  * VVD click <br>
  * <br><b>Example :</b>
  * <pre>
  *     clickVvd()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function clickVvd() {
     var formObj=document.form;
     if (formObj.chk_vvd.checked) {
         formObj.vvd.readOnly=false;
         formObj.scp.readOnly=false;
         formObj.port.readOnly=false;
         formObj.vvd.className="input1";
         formObj.scp.className="input";
         formObj.port.className="input";
         formObj.btn_check.disabled=false;
         formObj.to_date.readOnly=false;
         formObj.to_date.className="input1";
         ComShowObject(document.form.btns_calendar1,true);
         formObj.chk_grp_inv.disabled = false;
         //if (formObj.chk_blno.checked) {
        //	 formObj.chk_blno.checked = false;
        //	 clickBlno();
         //}
         //formObj.chk_blno.disabled = true;
/* JHJ 2017-06 end! */
     } else {
         formObj.vvd.readOnly=true;
         formObj.scp.readOnly=true;
         formObj.port.readOnly=true;             
         formObj.vvd.value="";
         formObj.scp.value="";
         formObj.port.value="";
         formObj.vvd.className="input2";
         formObj.scp.className="input2";
         formObj.port.className="input2";
/* JHJ 2017-06 start! */ 
         if (formObj.chk_cust.checked) {
             //formObj.btn_check.disabled=false;
             //formObj.chk_grp_inv.disabled = false;
             //formObj.to_date.readOnly=false;
             //formObj.to_date.className="input1";
             //ComShowObject(document.form.btns_calendar1,true);
         } else {
             formObj.btn_check.disabled=true; 
             formObj.chk_grp_inv.checked = false;
             formObj.chk_grp_inv.disabled = true;
             change_group_invoice();
             formObj.to_date.readOnly=true;
             formObj.to_date.className="input2";
             ComShowObject(document.form.btns_calendar1,false);
             //formObj.chk_blno.disabled = false;             
         }
/* JHJ 2017-06 end! */
     }
     formObj.f_inv.value="";
     formObj.t_inv.value="";
     formObj.tot_inv_cnt.value="";         
 }
 /**
  * Customer click <br>
  * <br><b>Example :</b>
  * <pre>
  *     clickCust()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function clickCust() {
     var formObj=document.form;
     if (formObj.chk_cust.checked) {
    	 // Cust Code
         formObj.cust_cnt_cd.readOnly=false;
         formObj.cust_seq.readOnly=false;
         formObj.cust_cnt_cd.className="input1";
         formObj.cust_seq.className="input1";
         formObj.popup1.disabled=false;
         formObj.popup2.disabled=false;
         formObj.btn_check.disabled=false;
         formObj.to_date.readOnly=false;
         formObj.to_date.className="input1";
         ComShowObject(document.form.btns_calendar1,true);
         // Port
         formObj.port.className="input";
         formObj.port.readOnly=false;
         // Group Invoice
         formObj.chk_grp_inv.disabled = false;
         //if (formObj.chk_blno.checked) {
        //	 formObj.chk_blno.checked = false;
        //	 clickBlno();
        // }
        // formObj.chk_blno.disabled = true;
         
     } else {
         formObj.cust_cnt_cd.readOnly=true;
         formObj.cust_seq.readOnly=true;
         formObj.cust_cnt_cd.value="";
         formObj.cust_seq.value="";
         formObj.cust_nm.value="";
         formObj.cust_rgst_no.value="";
         formObj.cr_curr_cd.value="";
         formObj.cr_amt.value="";
         formObj.phn_no.value="";
         formObj.fax_no.value="";
         formObj.cntc_pson_nm.value="";
         formObj.cust_cnt_cd.className="input2";
         formObj.cust_seq.className="input2";
         formObj.popup1.disabled=true;
         formObj.popup2.disabled=true;

         if (formObj.chk_vvd.checked) {
             //formObj.btn_check.disabled=false;
             //formObj.chk_grp_inv.disabled = false;
             //formObj.to_date.readOnly=false;
             //formObj.to_date.className="input1";
             //ComShowObject(document.form.btns_calendar1,true);
         } else {
             formObj.btn_check.disabled=true; 
             formObj.chk_grp_inv.checked = false;
             formObj.chk_grp_inv.disabled = true;
             change_group_invoice();
             formObj.to_date.readOnly=true;
             formObj.to_date.className="input2";
             ComShowObject(document.form.btns_calendar1,false);
             //formObj.chk_blno.disabled = false;
             formObj.port.className="input2";
             formObj.port.readOnly=true;
             formObj.port.value = "";
         }
     }
     
     formObj.f_inv.value="";
     formObj.t_inv.value="";
     formObj.tot_inv_cnt.value="";
 }
 /**
  * B/L No click <br>
  * <br><b>Example :</b>
  * <pre>
  *     clickCust()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */ 
 function clickBlno() {
	 
     var formObj=document.form;
     var sheetObj=sheetObjects[0];
     if (formObj.chk_blno.checked) {
         sheetObjects[0].RemoveAll();
         for(var i=0; i<40; i++){
             sheetObjects[0].DataInsert(-1);
         }
         setColor(sheetObj, "E");            
         sheetObj.SetEditable(1);
         sheetObjects[0].SelectCell(1,0);
         formObj.bnd.disabled=true;
         formObj.bnd.selectedIndex=0;
     } else {
    	 sheetObjects[0].RemoveAll();
         for(var i=0; i<40; i++){
             sheetObjects[0].DataInsert(-1);
         }
         setColor(sheetObj, "D");
         sheetObj.SetEditable(0);
         sheetObjects[0].SelectCell(1,0);
         formObj.bnd.disabled=false;
         ComSetFocus(formObj.chk_blno);
         sheetObjects[0].SelectCell(0,0,false);
     }
     formObj.f_inv.value="";
     formObj.t_inv.value="";
     formObj.tot_inv_cnt.value="";
 }

 /**
  * change sheet color <br>
  * <br><b>Example :</b>
  * <pre>
  *     setColor(sheetObj, key);
  * </pre>
  * @param {ibsheet} sheetObj 
  * @param {String} key  
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */       
 function setColor(sheetObj, key){
     for (var i=1; i<=sheetObj.RowCount(); i++) {
         for (var j=0; j<5; j++) {
             if (key == "E") {                  
                 sheetObj.SetCellBackColor(i,j,"#FFFFFF");
             } else {
                 sheetObj.SetCellBackColor(i,j,"#E8E7EC");
             }                          
         }                  
     }            
 } 
 /**
  * handling sheet value change event <br>
  * <br><b>Example :</b>
  * <pre>
  *     sheet1_OnChange(sheetObj,Row,Col,Value);
  * </pre>
  * @param {ibsheet} sheetObj 
  * @param {int} Row 
  * @param {int} Col 
  * @param {String} value 
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */   
 function sheet1_OnChange(sheetObj,Row,Col,Value){
     //blNoValChk(sheetObj,Row,Col,Value);
    form.f_inv.value="";
    form.t_inv.value="";
    form.tot_inv_cnt.value="";    
    sheetObj.SetCellValue(Row,Col,Value.toUpperCase(),0);
/* JHJ 2017-06 start! */
    //blNoDupChk(sheetObj,Value, Row, Col);
/* JHJ 2017-06 end! */
//    var lvobj=doSepRemove(obj.value.toUpperCase(), " ");
 }
 /**
  * chekc duplicate B/L no. <br>
  * <br><b>Example :</b>
  * <pre>
  *     blNoDupChk(sheetObj,Value);
  * </pre>
  * @param {ibsheet} sheetObj 
  * @param {String} value 
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */     
 function blNoDupChk(sheetObj,Value, Row, Col){
     var cnt=0;
     for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
         for (var j=0; j<5; j++) {
            if (Value != "" && sheetObj.GetCellValue(i, j) != "" &&  Value == sheetObj.GetCellValue(i, j)  ) {
                 cnt++;
                 if (cnt > 1) {
                     ComShowCodeMessage("INV00017");
                     sheetObj.SetCellValue(i, j,"",0);
                     return;
                 }
             }                              
         }                  
     }
 }     
 /**
  * check B/L no. <br>
  * <br><b>Example :</b>
  * <pre>
  *     blNoValChk(sheetObj,Row,Col,Value);
  * </pre>
  * @param {ibsheet} sheetObj
  * @param {int} Row 
  * @param {int} Col 
  * @param {String} value 
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */  
 function blNoValChk(sheetObj,Row,Col,Value){
     if(Value != "") {               
         var v_bl_no=Value;
         var sum=0;
         var v1=0;
         if(v_bl_no.length < 6) {
             ComShowCodeMessage("INV00003");
             sheetObj.SetCellValue(Row,Col,"");
             return false;
         } else if(v_bl_no.length == 12){
             for(var i=0; i < v_bl_no.length - 1; i++){
                 if(v_bl_no.charAt(i) >= 0 && v_bl_no.charAt(i) <= 9){
                     sum=sum + parseInt(v_bl_no.charAt(i));
                 } else {
                     if(v_bl_no.charAt(i).charCodeAt(0) >= "A".charCodeAt(0) && v_bl_no.charAt(i).charCodeAt(0) <= "Z".charCodeAt(0)){
                         v1=v_bl_no.charAt(i).charCodeAt(0) - 64;
                         if(String(v1).length != 1){
                             v1=parseInt(String(v1).charAt(0)) + parseInt(String(v1).charAt(1));   
                         }
                         sum=sum + v1;                           
                     } else {
                         ComShowCodeMessage("INV00002");
                         sheetObj.SetCellValue(Row,Col,"");
                         return false;
                     }                   
                 }               
             } // for      
             var bl_ck=v_bl_no.charAt(11);
             var bl_rtn=sum % 7; 
             if(parseInt(bl_ck) != bl_rtn && parseInt(bl_ck) != bl_rtn + 1 ){
                 ComShowCodeMessage("INV00001");
                 sheetObj.SetCellValue(Row,Col,"");
                 return false;           
             }               
         }
     }
 }     
 /**
  * OnKeyPress event Catch <br>
  * <br><b>Example :</b>
  * <pre>
  *    initControl()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function initControl() {
     axon_event.addListenerFormat ('keypress', 'objKeypress', document.form);
     axon_event.addListenerFormat ('beforeactivate', 'objActivate', document.form);
     axon_event.addListenerForm ('beforedeactivate', 'objDeactivate', document.form);
     axon_event.addListenerForm ('keyup', 'objKeyup', document.form); 
     axon_event.addListenerForm ('focusout', 'obj_focusout', document.form);
     axon_event.addListenerForm ('change', 'obj_change', document.form);
 }

/**
 * OnChange Event
 */
function obj_change() {
    switch(ComGetEvent("name")){
    case "chk_grp_inv":
    	change_group_invoice();
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
     switch(ComGetEvent("name")){
         case "cust_seq":
             var formObject=document.form;    
             var v_tmp="";
             if (formObject.cust_seq.value.length != 0 && formObject.cust_seq.value.length < 6) {
                 for(i=0; i < 6 - formObject.cust_seq.value.length; i++){
                     v_tmp=v_tmp + "0";
                 }
                 document.form.cust_seq.value=v_tmp+document.form.cust_seq.value;
             }    
         break;
     }
 }
 
 
 /**
  * OnKeyPress event Catch <br>
  * <br><b>Example :</b>
  * <pre>
  *    objKeypress()
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function objKeypress() {
    switch(ComGetEvent("dataformat")){
        case "float":
            // number+"."
            ComKeyOnlyNumber(ComGetEvent(), "."); break;
        break;
        case "int":
            // number only
            ComKeyOnlyNumber(ComGetEvent()); break;
        break;    
        case "engup":
            //upper case only                       
            //ComKeyOnlyAlphabet('upper'); break;       
            switch(ComGetEvent("name")){
                case "vvd":                     
                    //upper case+number only
                    ComKeyOnlyAlphabet('uppernum'); break;      
                default:
                    //upper case only                       
                    ComKeyOnlyAlphabet('upper'); break;                     
            }
         break;              
         default:
            // number only
            ComKeyOnlyNumber(ComGetEvent());
         break;
    }
 }  
/**
 * OnBeforeActivate event<br>
 * <br><b>Example :</b>
 * <pre>
 *    objDeactivate()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function objActivate() {
    ComClearSeparator (ComGetEvent());
}
/**
 * Onbeforedeactivate event <br>
 * <br><b>Example :</b>
 * <pre>
 *    objDeactivate()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */
function objDeactivate(){
    switch(ComGetEvent("name")){
        case "cust_seq":                
            var formObject=document.form;    
            var v_tmp="";
            if (formObject.cust_seq.value.length != 0 && formObject.cust_seq.value.length < 6) {
                for(i=0; i < 6 - formObject.cust_seq.value.length; i++){
                    v_tmp=v_tmp + "0";
                }
                document.form.cust_seq.value=v_tmp+document.form.cust_seq.value;
            }                               
            break;       
        default:
            //Validation 
            ComChkObjValid(ComGetEvent());
        break;
    }
} 
/**
 * init field when New button click <br>
 * <br><b>Example :</b>
 * <pre>
 *     initField()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function initField() {
    var formObj=document.form;
    with(formObj){
        chk_vvd.checked=false;
        chk_cust.checked=false;
        chk_grp_inv.checked = false;
        chk_blno.checked=true;
        chk_vvd.disabled=false;
        chk_cust.disabled=false;
        chk_grp_inv.disabled = true;
        chk_blno.disabled=false;
        bnd.value="A";
        vvd.value="";
        scp.value="";
        port.value="";
        vvd.readOnly=true;
        scp.readOnly=true;
        port.readOnly=true;
        vvd.className="input2";
        scp.className="input2";
        port.className="input2";            
        cust_cnt_cd.value="";
        cust_seq.value="";
        cust_nm.value="";
        cust_rgst_no.value="";
        cr_curr_cd.value="";
        cr_amt.value="";
        phn_no.value="";
        fax_no.value="";
        cntc_pson_nm.value="";
        cust_cnt_cd.readOnly=true;
        cust_seq.readOnly=true;
        cust_cnt_cd.className="input2";
        cust_seq.className="input2";
        f_inv.value="";
        t_inv.value="";
        tot_inv_cnt.value="";
        copy_cnt.value="";
        ar_ofc_cd2.value="";
        if_user_id.value="";        
    }
    sheetObjects[0].RemoveAll();
    for(var i=0; i<40; i++){
        sheetObjects[0].DataInsert(-1);
    }               
    sheetObjects[0].SetEditable(1);
    sheetObjects[0].SelectCell(1,0);
    ComBtnEnable("btn_paperissue");
    ComBtnEnable("btn_goto");
      
    sheetObjects[1].RemoveAll();
    doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    getCopyCnt();
    
    /* JHJ 2017-06 start! */
    setDate();
    /* JHJ 2017-06 end! */
}
/**
 * inv_dup_flg :  wnen rev_type is 'Y' enable otherwise disable<br>
 * <br><b>Example :</b>
 * <pre>
 *     openEmail()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function setRevType(){
    var formObj=document.form;
    var inv_dup_flg=formObj.inv_dup_flg.value;
	/* 2014.06.26
	if(inv_dup_flg == "Y"){
		formObj.rev_type.disabled = false;
		formObj.rev_type.selectedIndex = 0;
	}else{
		formObj.rev_type.disabled = true;
		formObj.rev_type.selectedIndex = 0;
	}
	*/
}
/**
 * open Invoice Issue (Email) UI <br>
 * <br><b>Example :</b>
 * <pre>
 *     openEmail()
 * </pre>
 * @param none
 * @return none
 * @author 정휘택
 * @version 2009.10.20
 */ 
function openEmail() {
   var ar_ofc_cd=document.form.ar_ofc_cd2.value;
   var invMltBlIssFlg=document.form.inv_mlt_bl_iss_flg.value;
	//2014.10.16 INV Form logic change by IY Cho
	var otsSmryCd = document.form.ots_smry_cd.value;
	var officeCntCd = document.form.office_cnt_cd.value;
	var taxCntFlg = document.form.tax_cnt_flg.value;
	var param = "issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd+"&taxCntFlg="+taxCntFlg;
	//alert(param);
    //ComOpenWindowCenter("FNS_INV_0034_02.do?issueGubn=I&invMltBlIssFlg="+invMltBlIssFlg+"&otsSmryCd="+otsSmryCd+"&officeCntCd="+officeCntCd, "pop", 1010, 700);
	ComOpenWindowCenter("FNS_INV_0034_02.do?"+param, "pop", 1010, 700, true);
}
/**
 * initializing sheet, define header<br>
 * <br><b>Example :</b>
 * <pre>
 *     initSheet(sheetObj, 0)
 * </pre>
 * @param {ibsheet} sheetObj
 * @param {int} sheetNo  
 * @return none 
 * @author 정휘택
 * @version 2009.10.20     
 */  
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
	var sheetID=sheetObj.id;
	var prefix=sheetID + "_";
	
    switch(sheetID) {
        case "sheet1":      
            with(sheetObj){
                var HeadTitle="1|2|3|4|5";

                SetConfig( { SearchMode:2, MergeSheet:0, Page:20, FrozenCol:0, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"1",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12  },
                            {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"2",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12   },
                            {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"3",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12   },
                            {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"4",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12   },
                            {Type:"Text",      Hidden:0,  Width:230,  Align:"Center",  ColMerge:0,   SaveName:"5",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   EditLen:12  }];
                                              
                InitColumns(cols);
 
                SetWaitImageVisible(0);
                SetEditable(1);
                SetRowHidden(0, 1);

                SetColProperty(0 ,0 , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0 ,1 , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0 ,2 , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0 ,3 , {AcceptKeys:"E|N" , InputCaseSensitive:1});
                SetColProperty(0 ,4 , {AcceptKeys:"E|N" , InputCaseSensitive:1});

                SetSheetHeight(240);                
                SetSheetWidth(1200);
            }

        break;

        case "sheet2":           // sheet2 init 발행대상 Customer List
		    with(sheetObj){		
/* JHJ 2017-06 start! */
		      var HeadTitle1="|ACT_CUST_CNT_CD|ACT_CUST_SEQ|DEFAULT_INVOICE_CURRENCY|BL_SRC_NO|TARGET_YN|INV_DT_YN|Cr.Term";
/* JHJ 2017-06 end! */
		      var headCount=ComCountHeadTitle(HeadTitle1) ;
		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
		      var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		      InitHeaders(headers, info);
		      var cols = [ {Type:"Status",    Hidden:1,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"ibflag" },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"act_cust_cnt_cd",          KeyField:0,   CalcLogic:"",   Format:"",	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"act_cust_seq",             KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:200,  Align:"Center",  ColMerge:0,   SaveName:prefix+"dflt_inv_curr_div_cd",	    KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"bl_src_no",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"target_yn",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
/* JHJ 2017-06 start! */
			               {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"inv_dt_yn",               	KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
              			   {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:prefix+"cr_term_dys",              KeyField:0,   CalcLogic:"",   Format:"",    PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];

/* JHJ 2017-06 end! */
			               
			  InitColumns(cols);
			  SetEditable(1);
			  SetSheetHeight(100);
	      }


		   break;  
     }
 }
 /**
  * doActionIBSheet <br>
  * <br><b>Example :</b>
  * <pre>
  *     doActionIBSheet(sheetObj, document.form, IBSEARCH)
  * </pre>
  * @param {ibsheet} sheetObj
  * @param {form} formObj 
  * @param {int} sAction 
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function doActionIBSheet(sheetObj,formObj,sAction) {
	 
     sheetObj.ShowDebugMsg(false);
     var sheetID=sheetObj.id;
	 var prefix=sheetID + "_";
	 
     switch(sAction) {
        case IBSEARCH:
            formObj.f_cmd.value=SEARCH;
            var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
//            var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
//            var arrStr=sStr.split("|");
//            MakeComboObject(ar_ofc_cd, arrStr);
//            var arrStr2=arrStr[1].split("^");
//            var ar_ofc_cd_str=arrStr2[3];
            formObj.copy_cnt.value=ComGetEtcData(sXml,"copy_cnt");              
//            ar_ofc_cd.SetSelectText(ar_ofc_cd_str);
            var sStr=ComGetEtcData(sXml,"inv_prn_dvc_nm");
            formObj.print_nm.value=sStr;
            var arrStr3=ar_ofc_cd.GetSelectCode().split("^");
            setOfcOtherInfo(arrStr3);

            break;    
        case IBSEARCH_ASYNC10: // retrieve Number of copy invoice 
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            setOfcOtherInfo(arrStr2);

            formObj.f_cmd.value=SEARCH;
            var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
            formObj.copy_cnt.value=ComGetEtcData(sXml,"copy_cnt");
            break;
            
		case "IBSEARCH_ASYNC30": //retrieve AR Office 
 			//formObj.f_cmd.value=SEARCH02; 	 			
 			formObj.f_cmd.value=SEARCH17; 	 	
 			var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
 			var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
 			var arrStr=sStr.split("|");
 			var arrStr2=arrStr[1].split("^");
 			var office_cnt_cd="";
 			//office
 			MakeComboObject(ar_ofc_cd, arrStr);
 			//2015.01.30 Retrieve Country of office by IY Cho
 			for (var i=1; i < arrStr.length; i++) {
 				var arrStr3=arrStr[i].split("^");
	 			if (arrStr3[1] == arrStr3[3]) {
	 				office_cnt_cd=arrStr3[6].substring(0,2);
	 				formObj.office_cnt_cd.value = office_cnt_cd;
	 			}
 			}
 			var ar_ofc_cd_text=arrStr2[3];
			ar_ofc_cd.SetSelectText(ar_ofc_cd_text);
		break;            
        case IBSEARCH_ASYNC20: // retrieve customer name 
            if (formObj.cust_cnt_cd.value != "" && formObj.cust_seq.value != ""){
                var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
                setOfcOtherInfo(arrStr2);

                formObj.f_cmd.value=SEARCH03;
                var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
                var cust_nm=ComGetEtcData(sXml,"cust_eng_nm"); 
                if (cust_nm != undefined) {
                    formObj.cust_nm.value=cust_nm;
                } else {
                    formObj.cust_nm.value="";
                }       
                var cust_rgst_no=ComGetEtcData(sXml,"cust_rgst_no");    
                if (cust_rgst_no != undefined) {
                    formObj.cust_rgst_no.value=cust_rgst_no;
                } else {
                    formObj.cust_rgst_no.value="";
                }
                var cr_curr_cd=ComGetEtcData(sXml,"cr_curr_cd");    
                if (cr_curr_cd != undefined) {
                    formObj.cr_curr_cd.value=cr_curr_cd;
                } else {
                    formObj.cr_curr_cd.value="";
                }
                var cr_amt=ComGetEtcData(sXml,"cr_amt");    
                if (cr_amt != undefined) {
                    formObj.cr_amt.value=cr_amt;
                } else {
                    formObj.cr_amt.value="";
                }
                var cntc_pson_nm=ComGetEtcData(sXml,"cntc_pson_nm");    
                if (cntc_pson_nm != undefined) {
                    formObj.cntc_pson_nm.value=cntc_pson_nm;
                } else {
                    formObj.cntc_pson_nm.value="";
                }
                var bnd=formObj.bnd.value;
                if (bnd == "I") {
                    var phn_no=ComGetEtcData(sXml,"ib_phn_no");    
                    if (phn_no != undefined) {
                        formObj.phn_no.value=phn_no;
                    } else {
                        formObj.phn_no.value="";
                    }
                    var fax_no=ComGetEtcData(sXml,"ib_fax_no");    
                    if (fax_no != undefined) {
                        formObj.fax_no.value=fax_no;
                    } else {
                        formObj.fax_no.value="";
                    }                       
                } else {
                    var phn_no=ComGetEtcData(sXml,"ob_phn_no");    
                    if (phn_no != undefined) {
                        formObj.phn_no.value=phn_no;
                    } else {
                        formObj.phn_no.value="";
                    }
                    var fax_no=ComGetEtcData(sXml,"ob_fax_no");    
                    if (fax_no != undefined) {
                        formObj.fax_no.value=fax_no;
                    } else {
                        formObj.fax_no.value="";
                    }           
                }                   
            }
            break; 
        case IBSEARCH_ASYNC01: //retrieve Target Issue Customer List
        	var bl_nos="";
            for (var i=0; i < sheetObjects[0].RowCount(); i++) {
                for (var j=0; j < 5; j++) {
                	if (sheetObjects[0].GetCellValue(i+1, j) != ""){
                		bl_nos=bl_nos + "'"+ sheetObjects[0].GetCellValue(i+1, j) + "',";
                    }
                }
            }   
/* JHJ 2017-06 start! */   
            
            //alert(formObj.inv_iss_tp_cd.value);
            //alert(formObj.inv_mlt_bl_iss_flg.value);
            if(formObj.inv_iss_tp_cd.value == "S" && formObj.inv_mlt_bl_iss_flg.value == "Y" ){
            	formObj.ofc_chk_flg.value = "Y";
            } else {
            	formObj.ofc_chk_flg.value = "N";
            }

            
//            var inv_bl_nos = formObj.inv_bl_nos.value;
//            if(inv_bl_nos != "") {
//                bl_nos=bl_nos + inv_bl_nos;  //for due-date 산정을 위한 대상건 bl no.
                //formObj.inv_bl_nos.value = inv_bl_nos + "''";  
//            } 

/* JHJ 2017-06 end! */   
            
            if (bl_nos != ""){
                bl_nos=bl_nos + "''";
            } 
            
            formObj.bl_nos.value=bl_nos;

            //formObj.f_cmd.value=SEARCH08; 	 			
			//var aXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));			
 			//var aStr=ComGetEtcData(aXml,"cust_exist_flg");

 			//if ( aStr == "N") {
 			//	ComShowMessage("This BL customer has been deleted. Please check again.");
			//	return;
 			//} else {
 				formObj.f_cmd.value=SEARCH05; 	 			
 				var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));			
 				sheetObj.LoadSearchData(sXml,{Sync:1} );
 			//}
			break;	
            
        case IBSAVE:        //save
            break;
        case IBINSERT:      //insert
            var bl_nos="";
            for (var i=0; i < sheetObjects[0].RowCount(); i++) {
                for (var j=0; j < 5; j++) {
                	if (sheetObj.GetCellValue(i+1, j) != ""){
                		bl_nos=bl_nos + "'"+ sheetObj.GetCellValue(i+1, j) + "',";
                    }
                }
            }    
/* JHJ 2017-06 start! */       
            //var inv_bl_nos = formObj.inv_bl_nos.value;
            //if(inv_bl_nos != "") {
            //    bl_nos=bl_nos + inv_bl_nos;  //for due-date 산정을 위한 대상건 bl no.
            //} 
/* JHJ 2017-06 end! */   
            if (bl_nos != ""){
                bl_nos=bl_nos + "''";
            } 
            
            formObj.bl_nos.value=bl_nos;
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            setOfcOtherInfo(arrStr2);
            
            formObj.f_cmd.value=MULTI;
            
            var sParam1=ComGetSaveString(sheetObjects[1], true, true);
			if(sParam1 == "" ){
				ComShowCodeMessage("INV00097");
				ComBtnEnable("btn_goto");
				ComBtnEnable("btn_paperissue");
				  
				return;
			}
			
			// Group Invoice 여부
			if (formObj.chk_grp_inv.checked) {
				formObj.grp_inv_flg.value = "Y";
			} else {
				formObj.grp_inv_flg.value = "";
			}
            
			var sParam = sParam1 +"&" +FormQueryString(formObj);
			
            var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", sParam, {Sync:1});
            
            var arrXml=sXml.split("|$$|");
           // sheetObj.LoadSearchData(arrXml[0],{Sync:1} );
            var backEndJobKey=ComGetEtcData(arrXml[0], "BackEndJobKey");
                if(backEndJobKey.length > 0) {
                    formObj.backendjob_key.value=backEndJobKey;
                    sheetObj.SetWaitImageVisible(0);
                    ComOpenWait(true);
                    sheetObj.SetWaitTimeOut(10000);
                    timer=setInterval(getBackEndJobStatus, 3000);
                }
            break;
		case IBSEARCH_ASYNC02: // Tax country retrieve
			var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
			formObj.ar_ofc_cd2.value=arrStr2[1];			
			formObj.f_cmd.value=SEARCH07;
	 		var sXml=sheetObj.GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(formObj));
			var sStr=ComGetEtcData(sXml,"tax_cnt_flg");
			formObj.tax_cnt_flg.value=sStr;
			break;			

     }
 }
 /**
  * check status until '3'  (BackEndJob)<br>
  * <br><b>Example :</b>
  * <pre>
  *     getBackEndJobStatus();
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */      
 function getBackEndJobStatus() {
    form.f_cmd.value=SEARCH02;
	var sXml=sheetObjects[0].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(form));
    var arrXml=sXml.split("|$$|");
    var jobState=ComGetEtcData(arrXml[0], "jb_sts_flg")
    if(jobState == "3") {
        clearInterval(timer);
        getBackEndJobLoadFile();
        ComOpenWait(false);
    } else if(jobState == "4") {
        clearInterval(timer);
        // BackEndJob fail
        //ComShowCodeMessage("INV00136");
        //ComOpenWait(false);
        // BackEndJob was failed
 		var jbUsrErrMsg=getBackEndJobErrMsg( ComGetEtcData(sXml, "jb_usr_err_msg") ) ;
 		if (jbUsrErrMsg != undefined && jbUsrErrMsg != ''){
 			if (jbUsrErrMsg.indexOf("ORA-30006") > -1){
 				ComShowCodeMessage("INV00173");
 		 		ComBtnEnable("btn_goto");
 		        ComBtnEnable("btn_paperissue");
 			} else {
	 			var msgArray = jbUsrErrMsg.split("|");
	 			if(msgArray[0] == "GOTOSPLIT") {
	 				location.href="FNS_INV_0018.do?pid=FNS_INV_M003&MENU=Y&pgmNo=FNS_INV_0018&parentPgmNo=FNS_INV_M001&main_page=true&mainMenuLinkFlag=true&menuflag=true&mainPage=true&iss_to_split_flg=Y&ar_if_no=" + msgArray[1] + "&inv_delt_div_cd=" + msgArray[2];
	 			} else { 
	 				ComShowMessage(jbUsrErrMsg);
	 				ComBtnEnable("btn_goto");
	                ComBtnEnable("btn_paperissue");
	                  
	 			}
 			}
 		} else
 		ComShowCodeMessage("INV00136");
 		ComBtnEnable("btn_goto");
        ComBtnEnable("btn_paperissue");
          
 		ComOpenWait(false);
    } else if(jobState == "5") {
        clearInterval(timer);
        // already read BackEndJob result file.
        ComShowCodeMessage("INV00090");
        ComOpenWait(false);
    }
 }
 
//get jb_usr_err_msg
function getBackEndJobErrMsg(params) {
	var ary=params.split('<||>');
	return ary[ary.length-1];
}
	
 /**
  * retrieve BackEndJob result <br>
  * <br><b>Example :</b>
  * <pre>
  *     getBackEndJobLoadFile();
  * </pre>
  * @param none
  * @return none
  * @author 정휘택
  * @version 2009.10.20
  */
 function getBackEndJobLoadFile() {
	document.form.f_cmd.value=SEARCH03;
    var sXml=sheetObjects[0].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(document.form));
    var arrXml=sXml.split("|$$|");
    if(arrXml.length > 0) {

    	document.form.backendjob_key.value="";
        var sStr=ComGetEtcData(sXml,"inv_nos");
        var sStr2=sStr.split("&");
        var arrStr=sStr2[0].split("|");
        if (arrStr.length > 1) {
        	document.form.invoice_nos.value=arrStr; // new India Invoice 2017.07.01
        	document.form.f_inv.value=arrStr[0]; 
        	document.form.t_inv.value=arrStr[arrStr.length - 2];
        	document.form.tot_inv_cnt.value=ComAddComma2(arrStr.length - 1, "#,###");
        }           
        var state=ComGetEtcData(sXml,ComWebKey.Trans_Result_Key); 
        var r_invs=arrStr[0];  
        if (r_invs == "") {
            ComShowCodeMessage("INV00097");
            document.form.f_inv.value="";
            document.form.t_inv.value="";
            document.form.tot_inv_cnt.value="";
            return false;
        }
        if (state == "S" && r_invs != "") {                         
            var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            setOfcOtherInfo(arrStr2);
                   
            var v_f_inv=document.form.f_inv.value;
            var v_t_inv=document.form.t_inv.value;
            var arrStr3=sStr2[0].split("|");
            var v_copy_cnt=document.form.copy_cnt.value;  
            if (document.form.email_flag.value == "N") {
                //rdObjects[0].SetAppendReport(0);
                for(var i=0; i<arrStr3.length -1; i++){
                    rdOpen(arrStr3[i], 15, document.form.user_nm.value, document.form.ar_ofc_cd2.value, "ORIGINAL", "", "", "N", "Y");
                    //rdObjects[0].SetAppendReport(1);
                    for(var j=0; j<v_copy_cnt; j++) {                       
                        rdOpen(arrStr3[i], 15, document.form.user_nm.value, document.form.ar_ofc_cd2.value, "COPY", "", "", "N", "Y");
                    }
                }                   
                //rdObjects[0].SetAppendReport(0); 
                //setting print
                 //var print_nm=document.form.print_nm.value;
                 //if(print_nm != ""){
                     //rdObjects[0].SetPrintInfo (print_nm, 1, 1, 4);
                 //}
                //rdObjects[0].CMPrint(); //print start
                
                //viewer.openFile(appendReport, {timeout:3000});
				//viewer.print({isServerSide:true}); // Starting printer.
                directReportDownload(appendReport);
				appendReport = [];
            } else {
                openEmail();
            }
            ComBtnDisable("btn_paperissue");
            sheetObjects[0].SetEditable(0);
			cfmFlg = ""; //2018-04-30	
			mmFlg = ""; //2018-04-30	
        } 
    }
 }
 /**
  * validateForm<br>
  * <br><b>Example :</b>
  * <pre>
  *     validateForm(sheetObj, document.form, IBSEARCH)
  * </pre>
  * @param {ibsheet} sheetObj 필수 IBSheet Object
  * @param {form} formObj 필수 html form object
  * @param {int} sAction 필수 프로세스 플래그 상수
  * @return boolean
  * @author 정휘택
  * @version 2009.10.20
  */
 function validateForm(sheetObj,formObj){
     with(formObj){    
    	 if (formObj.inv_curr_cd.value == "") {
    		 ComShowCodeMessage("INV00004");
             formObj.inv_curr_cd.focus();
             ComBtnEnable("btn_goto");
             ComBtnEnable("btn_paperissue");
               
             return false;
         }
    	 
    	 if (!(formObj.chk_vvd.checked || formObj.chk_cust.checked || formObj.chk_blno.checked )) {
             ComShowCodeMessage("INV00004");

             ComBtnEnable("btn_goto");
             ComBtnEnable("btn_paperissue");
               
             return false;
         }
         if (formObj.chk_vvd.checked) {

             if (formObj.vvd.value == "") {
                 ComShowCodeMessage("INV00004");
                 ComBtnEnable("btn_goto");
                 ComBtnEnable("btn_paperissue");
                   
                 formObj.vvd.focus();
                 
                 return false;
             }
         }
         if (formObj.chk_cust.checked) {
             if (formObj.cust_cnt_cd.value == "") {
                 ComShowCodeMessage("INV00004");
                 ComBtnEnable("btn_goto");
                 ComBtnEnable("btn_paperissue");
                   
                 formObj.cust_cnt_cd.focus();
                 return false;
             }
             if (formObj.cust_seq.value == "") {
                 ComShowCodeMessage("INV00004");
                 ComBtnEnable("btn_goto");
                 ComBtnEnable("btn_paperissue");
                   
                 formObj.cust_seq.focus();
                 return false;
             }
         }
         
         if (formObj.chk_blno.checked || formObj.chk_grp_inv.checked) {
            var cnt=0;
            for (var i=0; i < sheetObj.RowCount(); i++) {
                for (var j=0; j < 5; j++) {
                    if(sheetObj.GetCellValue(i+1, j) != "") {
                        cnt++;
                    }
                }
            }
            if (cnt == 0) {
                ComShowCodeMessage("INV00004");   
                ComBtnEnable("btn_goto");
                ComBtnEnable("btn_paperissue");
                  
                sheetObj.SelectCell(1,0);
                return false;
            } 
            
            if (cnt == 1 && formObj.chk_grp_inv.checked) {
                ComShowMessage("Please input more than one BL for Group Invoice");   
                ComBtnEnable("btn_goto");
                ComBtnEnable("btn_paperissue");
                return false;
            }
         }     
         
         if (formObj.chk_grp_inv.checked) {
        	 if (formObj.bnd.value != "I" && formObj.bnd.value != "O") {
        		 ComShowMessage("Please select Bound for Group Invoice");   
                 ComBtnEnable("btn_goto");
                 ComBtnEnable("btn_paperissue");
                 formObj.bnd.focus();
                 return false;
        	 }
         }
     }
     return true;
 }
 
 

 
 
 /**
  * function called when DXBBB and ISSUE OK in popup(FNS_INV_0110) <br>
  * <br><b>Example :</b>
  * @param
  * @return
  * @author 정휘택
  * @version 2009.10.20
  */
function getFnsInv0110(){
    var formObject=document.form;
    formObject.email_flag.value="Y";
    doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
    var state=formObject.state.value;  
    var r_invs=formObject.inv_nos.value;  
    var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
    setOfcOtherInfo(arrStr2);

}


/**
 * setOfcOtherInfo<br>
 * <br><b>Example :</b>
 * <pre>
 *     setOfcOtherInfo(arrStr2)
 * </pre>
 * @param {arrStr2} 
 * @author CLT
 * @version 2014.11.29
 */
function setOfcOtherInfo(arrStr2) {
	var formObject=document.form;
	formObject.ar_ofc_cd2.value=arrStr2[1];
	formObject.svr_id.value=arrStr2[7];     
	formObject.ots_smry_cd.value=arrStr2[13];   
	formObject.inv_dup_flg.value=arrStr2[14]; 
	formObject.inv_mlt_bl_iss_flg.value=arrStr2[15]; 	
	formObject.locl_curr_cd.value=arrStr2[4]; 
	formObject.altn_curr_div_cd.value=arrStr2[20]; 
	formObject.office_cnt_cd.value=arrStr2[6].substring(0,2);
/* JHJ 2017-06 start! */
	formObject.inv_iss_tp_cd.value=arrStr2[21]; 
/* JHJ 2017-06 end! */
}

/**
 * setCustTargetYN<br>
 * @author CLT
 * @version 2014.11.25
 */
function setCustTargetYN() {
	var formObject=document.form;
	var sheetObj = sheetObjects[1];
	var prefix = sheetObj.id + "_";
	
	var inv_curr_cd = formObject.inv_curr_cd.value;
	
	var custInfoMsg = "";
	var dfltInvCurr = "";

/* JHJ 2017-08 start! */
//    var crTermDys = "";
//    var prevCrTermDys = "";
//
//    for (var i=1; i < sheetObj.RowCount()+1; i++) {
//    	crTermDys = sheetObj.GetCellValue(i, prefix + "cr_term_dys");
//    	//alert(crTermDys + " , " + prevCrTermDys);
//    	if(prevCrTermDys != "" && crTermDys != prevCrTermDys) {
//    		//match_yn = "N";
//    		ComShowMessage("The credit term does not match.");
//			return;
//   	}
//    	prevCrTermDys = crTermDys;
//    }  
/* JHJ 2017-08 End! */
    
	for (var i=1; i<=sheetObj.RowCount(); i++) {
		dfltInvCurr = sheetObj.GetCellValue(i, prefix + "dflt_inv_curr_div_cd");
		dfltInvCurr = (dfltInvCurr == "LCL") ? formObject.locl_curr_cd.value : dfltInvCurr;
		
		if ( inv_curr_cd != dfltInvCurr && dfltInvCurr != "" ) {
			custInfoMsg = "Customer : [" + sheetObj.GetCellValue(i, prefix + "act_cust_cnt_cd") + "-" + ComLpad(sheetObj.GetCellValue(i, prefix + "act_cust_seq"), 6, '0') + "], B/L No : [" + sheetObj.GetCellValue(i, prefix + "bl_src_no") + "]";
			
			if (ComShowCodeConfirm("INV00137", custInfoMsg)) {
				sheetObj.SetCellValue(i, prefix + "target_yn", "Y");
			} else {
				sheetObj.SetCellValue(i, prefix + "target_yn", "N");
			}
			
		} else {
			sheetObj.SetCellValue(i, prefix + "target_yn", "Y");
		}
		
	}

	doActionIBSheet(sheetObjects[0],formObject,IBINSERT);  // ISSUE 진행
	
}

/**
 * chkCustInfo<br>
 * @author CLT
 * @version 2014.11.25
 */
function chkCustInfo() {
	var formObject=document.form;
/* JHJ 2017-06 start! */
//	doActionIBSheet(sheetObjects[0], document.form, "IBSEARCH_ASYNC30");
/* JHJ 2017-06 start! */
	doActionIBSheet(sheetObjects[1],formObject,IBSEARCH_ASYNC01);	
}


function sheet2_OnSearchEnd(code, message) {

	var prefix = sheetObjects[1].id + "_";
	var bl_nos="";
	
    for (var i=1; i <= sheetObjects[1].RowCount(); i++) {
    	bl_nos=bl_nos + "'"+ sheetObjects[1].GetCellValue(i, prefix+"bl_src_no" ) + "',";
    } 
    
    //if (bl_nos != ""){
        bl_nos=bl_nos + "''";
    //} 
     
    document.form.chk_bl_nos.value = bl_nos;
    
    document.form.f_cmd.value=SEARCH06; 	 			
	var sXml=sheetObjects[1].GetSearchData("FNS_INV_0034_01GS.do", FormQueryString(document.form));
	var sStr=ComGetEtcData(sXml,"bkg_if_cnt");
	
	if(sStr != "0") {
		if(!document.form.chk_vvd.checked && 
		   !document.form.chk_cust.checked && 
		   document.form.chk_blno.checked && 
		   document.form.bl_nos.value.split(",").length == 2){
			ComShowMessage("Please wait a few minutes before trying again.\nAR I/F records are still being created for this BL.");
		}else{
			ComShowMessage("There are one or more BLs where AR I/F records are still being created.\nPlease wait and try to issue invoices after a few minutes.");
		}
		
		return;
	}

	setCustTargetYN();	

}

/* JHJ 2017-06 start! */
function setDate(){
		var today=new Date();
		var y=today.getFullYear().toString();
		var m=today.getMonth()+1;
		var d=today.getDate();
		if(m<10){
			m="0"+m;
		}
		if(d<10){
			d="0"+d;
		}
		document.form.to_date.value=y+"-"+m+"-"+d; 
}

function validateFormPopup(sheetObj,formObj){
    with(formObj){   
    	if (formObj.btn_check.disabled==true) return false;
    		
    	// VVD 필수 체크
   	 	if (formObj.chk_vvd.checked) {
	   	 	if (formObj.vvd.value == "") {
	   	 		alert("VVD is required.");
	   	 		formObj.vvd.focus();	              
	            return false;
	        }
   	 	} 
   	 	
   	 	// Customer 필수 체크
   	 	if (formObj.chk_cust.checked && (formObj.cust_cnt_cd.value == "" && formObj.cust_seq.value == "") ) {
   	 	    alert("Customer Code is required.");
   	 		formObj.cust_cnt_cd.focus();
   
            return false;
        }
   	 	
   	 	if ((formObj.chk_vvd.checked || formObj.chk_cust.checked) && formObj.to_date.value == "") {
   	 		alert("S/A Date is required.");
   	 		formObj.to_date.focus();
              
            return false;
        }
   	 	
   	 	// Group Invoice 인 경우 Bound 선택 필수
	   	if (formObj.chk_grp_inv.checked) {
	    	 if (formObj.bnd.value != "I" && formObj.bnd.value != "O") {
	    		 ComShowMessage("Please select Bound for Group Invoice");   
	             formObj.bnd.focus();
	             return false;
	    	 }
	     }
   	 	
    }
    return true;
}

/**
 * to_date Setting masked value, After validating date.<br>
 * <br><b>Example : </b>
 * <pre>
 *   fn_ComGetMaskedValue('to_date');
 * </pre>
 * @param String elNm
 * @author Hyun Jae Jeong
 * @version 2017.06.22
 */
function fn_ComGetMaskedValue(elNm) {
    var formObj;
    if (elNm == "to_date") {
        formObj=form.to_date;
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

}

/**
 * Checking cust_cnt_cd length in selected tab.<br>
 * <br><b>Example : </b>
 * <pre>
 *    checkCustLeng('DE');
 * </pre>
 * @param string value
 * @author Hyun Jae Jeong
 * @version 2017.06.22
 */
function checkCustLeng(value){        
    if(value.length==2){
        form.inv_cust_seq.focus(); 
    }
}
/* JHJ 2017-06 end! */

/**
 * Group Invoice 체크 시, Bound 선택 가능하도록 Enable 시킴 
 */
function change_group_invoice() {
	var formObj = document.form; 
	if (formObj.chk_grp_inv.checked) {
		formObj.bnd.disabled = false;
	} else {
		formObj.bnd.disabled = true;
		formObj.bnd.value = "A";
	}	
}
