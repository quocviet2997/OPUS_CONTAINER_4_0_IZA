/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0011.js
*@FileTitle  : Invoice List Inquiry
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/02
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
					MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
					OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
     * @extends 
     * @class COM_CSR_0011 : COM_CSR_0011 business script for
     */
    function COM_CSR_0011() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
	// The common global variables
    //var sXml = '';
	var sheetObjects=new Array();
	var sheetCnt=0;
	// Event handler processing by button click event */
	document.onclick=processButtonClick;
	// Event handler processing by button name */
    function processButtonClick(){
         var sheetObject=sheetObjects[0];
		 var sheetObject1=sheetObjects[1];
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
				case "btn_close":
					ComClosePopup(); 
				break;
            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			showErrMessage(getMsg('CSR23028')); 
    		}
    	}
    }
    /**
     * Registering IBSheet Object as list
     * Adding process for list in case of needing batch processing with other items
     * Defining list on the top of source
     */
     function setSheetObject(sheet_obj) {
     	sheetObjects[sheetCnt++]=sheet_obj;
     }
    /**
     * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
     */
    function loadPage() {
      	for (i=0; i < sheetObjects.length; i++) {
     		ComConfigSheet(sheetObjects[i]);
     		initSheet(sheetObjects[i], i + 1);
     		ComEndConfigSheet(sheetObjects[i]);
     	}
		var formObj=document.form;
		//csr_isNumD(formObj.due_dt,"Y"); 
		//formObj.csr_amt.value = csr_chkAmtFmt(formObj.csr_amt.value);
    	var sheetObject=sheetObjects[0];
        var sheetObject1=sheetObjects[1]; 
		if(!isNull2(csr_no)){
			doActionIBSheet1(sheetObject1,formObj,IBSEARCH);	
			doActionIBSheet(sheetObject,formObj,IBSEARCH);		
        } else {
			showErrMessage(getMsg('CSR40015','CSR No.')); 
		}
		disableObject(formObj.csr_no);		
		disableObject(formObj.vndr_no);
		disableObject(formObj.inv_desc);
		disableObject(formObj.no_of_inv[0]);
		disableObject(formObj.csr_curr_cd[0]);
		disableObject(formObj.csr_amt[0]);
		disableObject(formObj.attr_ctnt2[0]);
		disableObject(formObj.ofc_cd[0]);
		disableObject(formObj.no_of_inv[1]);
		disableObject(formObj.csr_curr_cd[1]);
		disableObject(formObj.csr_amt[1]);
		disableObject(formObj.attr_ctnt2[1]);
		disableObject(formObj.ofc_cd[1]);
		disableObject(formObj.iss_dt);
		disableObject(formObj.rcv_dt);
		disableObject(formObj.vndr_term_nm);
		disableObject(formObj.due_dt);
    }
   /**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets 
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        var pnt=0;
        var currCd=document.form.curr_cd.value;
        if(currCd == "KRW" || currCd == "JPY" ){
        	pnt=0;
        }else{
        	pnt=2;
        }
        switch(sheetNo) {
            case 1: 
                with(sheetObj){
	              var HeadTitle="|Seq.|Invoice No.|Net Amount|Tax Amount|W.H.T.|Total Amount|Issue Date|Receive Date|Confirm Date|GL Date" ;
	
	              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
	
	              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	              var headers = [ { Text:HeadTitle, Align:"Center"} ];
	              InitHeaders(headers, info);
	
	              var cols = [ {Type:"Status",    Hidden:1, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"ibflag",         KeyField:0,   CalcLogic:"" },
	                     {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                     {Type:"Text",      Hidden:0,  Width:80,   Align:"Left",    ColMerge:0,   SaveName:"inv_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	                    if(pnt == 0){	//KRW, TWD, JPY
	              cols.push({Type:"Int",       Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"ttl_inv_amt",    KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Int",       Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"vat_amt",        KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Int",       Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"whld_tax_amt",   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Int",       Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"total_amt",      KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              }else{	//USD
	              cols.push({Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"ttl_inv_amt",    KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"vat_amt",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"whld_tax_amt",   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Float",     Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"total_amt",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
	              }
	              cols.push({Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"iss_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rcv_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"inv_cfm_dt",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	              cols.push({Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"gl_dt",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
	         
	              InitColumns(cols);
	
	              SetEditable(1);
//	              SetSheetHeight(150);
	              resizeSheet();
                  }
                  break;

            case 2:
                with(sheetObj){
            		 var HeadTitle1="|CSR No.|Payment S/P|Payment S/P|I/F\nStatus|I/F Status\nUpdated Time|Error Reason|No of\n Invoice|Currency|Total\nAmount|Payment\nDue Date|ASA No." ;
		
		             SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );
		
		             var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		             var headers = [ { Text:HeadTitle1, Align:"Center"} ];
		             InitHeaders(headers, info);
		
		             var cols = [ {Type:"Status",    Hidden:1, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"ibflag",        KeyField:0,   CalcLogic:"" },
		                 {Type:"Text",      Hidden:0,  Width:150,  Align:"Center",  ColMerge:0,   SaveName:"csr_no",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"vndr_no",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:0,   SaveName:"inv_desc",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"no_of_inv",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:"csr_curr_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"csr_amt",       KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"due_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"attr_ctnt2",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:1, Width:50,   Align:"Left",    ColMerge:0,   SaveName:"iss_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:0,  Width:100,  Align:"Left",    ColMerge:0,   SaveName:"so_if_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:1, Width:50,   Align:"Left",    ColMerge:0,   SaveName:"rcv_dt",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                 {Type:"Text",      Hidden:1, Width:50,   Align:"Left",    ColMerge:0,   SaveName:"vndr_term_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
		              
		             InitColumns(cols);
		
		             SetEditable(1);
		             SetVisible(0);
		             }
                	 break;


            	
        }
    }
    // Handling the process about the sheet
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:     
           if (!validateForm(sheetObj,formObj,sAction)){
		        return false;
		    }
			formObj.f_cmd.value=SEARCHLIST;
			sheetObj.DoSearch("COM_CSR_0011GS.do", FormQueryString(formObj) );
		    break; 
        }
    }
    function doActionIBSheet1(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:     
                if (!validateForm(sheetObj,formObj,sAction)){
			        return false;
			    }
    			formObj.f_cmd.value=SEARCHLIST01;
    			sheetObj.DoSearch("COM_CSR_0011GS.do", FormQueryString(formObj) );
    			//sXml = sheetObj.GetSearchXml("COM_CSR_0011GS.do" , FormQueryString(form)); 
			    break;
        }
    }
	function sheet2_OnSearchEnd(sheet2, ErrMsg){
		if (sheet2.RowCount()> 0){
			document.form.vndr_no.value=csr_lpad(sheet2.GetCellValue(1,'vndr_no'),6,"0") ;
			document.form.inv_desc.value=sheet2.GetCellValue(1,'inv_desc');	//ComGetEtcData(sXml,"inv_desc"); //
			document.form.no_of_inv[0].value=sheet2.GetCellValue(1,'no_of_inv');
			document.form.csr_curr_cd[0].value=sheet2.GetCellValue(1,'csr_curr_cd');
			//document.form.csr_amt[0].value = ComAddComma(sheet2.CellValue(1,'csr_amt'));
			document.form.attr_ctnt2[0].value=sheet2.GetCellValue(1,'attr_ctnt2');
			document.form.no_of_inv[1].value=sheet2.GetCellValue(1,'no_of_inv');
			document.form.csr_curr_cd[1].value=sheet2.GetCellValue(1,'csr_curr_cd');
			//document.form.csr_amt[1].value = ComAddComma(sheet2.CellValue(1,'csr_amt'));
			document.form.attr_ctnt2[1].value=sheet2.GetCellValue(1,'attr_ctnt2');
			document.form.iss_dt.value=sheet2.GetCellValue(1,'iss_dt');
			document.form.rcv_dt.value=sheet2.GetCellValue(1,'rcv_dt');
			document.form.vndr_term_nm.value=sheet2.GetCellValue(1,'vndr_term_nm');
			document.form.due_dt.value=sheet2.GetCellValue(1,'due_dt');
			document.form.so_if_cd.value=sheet2.GetCellValue(1,'so_if_cd');
			//csr_isNumD(document.form.due_dt,"Y"); 
	        var pre_curr_cd=document.form.csr_curr_cd[0].value;
			if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
				document.form.csr_amt[0].value=ComAddComma(sheet2.GetCellValue(1,'csr_amt'));
				document.form.csr_amt[1].value=ComAddComma(sheet2.GetCellValue(1,'csr_amt'));
			}else{
				document.form.csr_amt[0].value=csr_chkAmtFmt(sheet2.GetCellValue(1,'csr_amt'));
				document.form.csr_amt[1].value=csr_chkAmtFmt(sheet2.GetCellValue(1,'csr_amt'));
			}
			var so_if_cd=document.form.so_if_cd.value;
	    	if(so_if_cd=="O"){	//ASA
	    		  document.all.item("srLayer")[0].style.display="inline";
	    		  document.all.item("srLayer")[1].style.display="none";  
	    	}else{
	    		  document.all.item("srLayer")[0].style.display="none";
	    		  document.all.item("srLayer")[1].style.display="inline";  
	    	}
		}
	}
    /**
     * Handling the process for the input validation
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(formObj.iPage)) {
//                return false;
//            }
        }
        return true;
    }
    
    function resizeSheet(){
        ComResizeSheet(sheetObjects[0]);
    }