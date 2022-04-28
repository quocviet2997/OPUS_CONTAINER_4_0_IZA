/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0014.js
*@FileTitle  : Rejected CSR Cancellation
*@author     : CLT
*@version    : 1.0
*@since      : 2014/09/03
=========================================================*/
/****************************************************************************************
  Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
					MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
					OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
    /**
     * @extends 
     * @class COM_CSR_0014 : business script for COM_CSR_0014
     */
    function COM_CSR_0014() {
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
	var sheetObjects=new Array();
	var sheetCnt=0;
	var Mincount=0;
	var opener_obj=window.dialogArguments;
	/* Event handler processing by button click event */
	document.onclick=processButtonClick;
	/* Event handler processing by button name */
    function processButtonClick(){
         var sheetObject=sheetObjects[0];
         var formObject=document.form;
        try {
            var srcName=ComGetEvent("name");
            switch(srcName) {
                case "btng_save":
					if (sheetObjects[0].RowCount()== 0){
						showErrMessage(getMsg('CSR40056')); 
					}
					doActionIBSheet(sheetObject,formObject,IBSAVE);
                break;
				case "btn_close":
					ComClosePopup(); 
				break;
            } // end switch
        }catch(e) {
            if( e == "[object Error]") {
                showErrMessage(getMsg('CSR21025')); //ComShowMessage(OBJECT_ERROR);
            } else {
                ComShowMessage(e.message);
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
    function loadPage() {
     	for (i=0; i < sheetObjects.length; i++) {
     		ComConfigSheet(sheetObjects[i]);
     		initSheet(sheetObjects[i], i + 1);
     		ComEndConfigSheet(sheetObjects[i]);
     	}
		var formObj=document.form;
		csr_isNumD(formObj.due_dt,"Y"); 
		//formObj.csr_amt.value = csr_chkAmtFmt(formObj.csr_amt.value);
		if(!isNull2(csr_no)){
			doActionIBSheet(sheetObjects[0],formObj,IBSEARCH);
        } else {
			showErrMessage(getMsg('CSR40015','CSR No.'));
		}
	}
   /**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets 
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        var pnt=0;
        var currCd=document.form.csr_curr_cd.value;
        if(currCd == "KRW" || currCd == "JPY" ){
        	pnt=0;
        }else{
        	pnt=2;
        }
        switch(sheetNo) {
            case 1:      //sheet1 init
                with(sheetObj){
                //no support[check again]CLT style.height=GetSheetHeight(11);
          
              var HeadTitle="|SEQ|Incorrect\nOnes|Invoice No.|Net Amount|Tax Amount|W.H.T.|Total Amount|Issue Date|Receive Date|Confirm Date" ;

              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

              var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
              var headers = [ { Text:HeadTitle, Align:"Center"} ];
              InitHeaders(headers, info);

              var cols = [ {Type:"Status",    Hidden:1, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"ibflag",               KeyField:0,   CalcLogic:"" },
                     {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",                     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                     {Type:"CheckBox",  Hidden:0, Width:60,   Align:"Center",  ColMerge:0,   SaveName:"chk",                  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                     {Type:"Text",      Hidden:0,  Width:110,  Align:"Left",    ColMerge:0,   SaveName:"inv_no",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
	            if(pnt == 0){	//KRW, TWD, JPY
	              cols.push({Type:"Int",       Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"ttl_inv_amt",          KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		              cols.push({Type:"Int",       Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"vat_amt",              KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		              cols.push({Type:"Int",       Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"whld_tax_amt",         KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		              cols.push({Type:"Int",       Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"total_amt",            KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
		              }else{	//USD..
		              cols.push({Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"ttl_inv_amt",          KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
		              cols.push({Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"vat_amt",              KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
		              cols.push({Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"whld_tax_amt",         KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
		              cols.push({Type:"Float",     Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"total_amt",            KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 });
		         }
              cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"iss_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
              cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"rcv_dt",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
              cols.push({Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"inv_cfm_dt",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
              cols.push({Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"aft_act_flg",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
              cols.push({Type:"Text",      Hidden:1, Width:100,  Align:"Center",  ColMerge:0,   SaveName:"inv_rgst_no",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
              cols.push({Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"tml_inv_rjct_sts_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
              cols.push({Type:"Text",      Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"inv_sts_cd",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 });
         
              InitColumns(cols);

              SetEditable(1);
              SetCountFormat("[SELECTDATAROW / ROWCOUNT]");
              SetSheetHeight(250);
              }


                break;
        }
    }
    // Handling the process about the sheet
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:      //Retrieving
                if (!validateForm(sheetObj,formObj,sAction)){
			        return false;
			    }
			    formObj.f_cmd.value=SEARCHLIST;
			    //sheetObj.DoSearch4Post("COM_CSR_0014GS.do", FormQueryString(formObj));
 			    sheetObj.DoSearch("COM_CSR_0014GS.do", FormQueryString(formObj) );
			    break;
			case IBSAVE:        //Saving
                if (!validateForm(sheetObj,formObj,sAction)){
			        return false;
			    }
				formObj.f_cmd.value=MULTI;
				var param=sheetObj.GetSaveString(true);
 				var sXml=sheetObj.GetSaveData("COM_CSR_0014GS.do", param+'&'+FormQueryString(formObj));
 				sheetObj.LoadSaveData(sXml,true);
                break;
        }
    }
	function sheet1_OnClick(sheet1, Row,Col,Value){
		if (sheet1.ColSaveName(Col) == 'inv_no'){
//			showErrMessage(' cell value:' + sheet1.CellValue(Row,'chk') );
		}
	}
    function sheet1_OnSearchEnd(sheet1, ErrMsg) {
    	var sheetObj=sheetObjects[0];
    	for(var i=0; i<sheetObj.RowCount(); i++) {
    		if(sheetObj.GetCellValue(i + 1, "tml_inv_rjct_sts_cd") == "Y") {
                sheetObj.SetCellEditable(i + 1, "chk",0);
            }
        }
    	var pre_curr_cd=document.form.csr_curr_cd.value;
    	if(pre_curr_cd=="KRW" || pre_curr_cd=="JPY" || pre_curr_cd=="TWD"){
    		document.form.csr_amt.value=ComAddComma(document.form.csr_amt.value);
    	}else{
    		document.form.csr_amt.value=csr_chkAmtFmt(document.form.csr_amt.value);
    	}
    }
	function sheet1_OnSaveEnd(sheet1, ErrMsg){
		if (sheet1.RowCount()> 0){
			for (var i=sheet1.HeaderRows(); i<(sheet1.HeaderRows()+ sheet1.RowCount()); i++){
				if (sheet1.GetCellValue(i,'aft_act_flg')!=undefined && sheet1.GetCellValue(i,'aft_act_flg')=='N'){
					opener_obj.retrieve();
					ComClosePopup(); 
					break;
				}
			}
		}
	}
   /**
     * Handling the process for the input validation
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(iPage)) {
//
//                return false;
//            }
        }
        return true;
    }
    /**
     * The event about clicking Minimize button
     */
    function Minimize(nItem)
    {
        var objs=document.all.item("showMin");
        if ( nItem == "1" )
        {
            objs.style.display="none";
            //no support[check again]CLT sheetObjects[0].style.height=sheetObjects[0].GetSheetHeight(20);
            sheetObjects[0].focus();
            //no support[check again]CLT sheetObjects[0].ViewRows=20;
        }
        else
        {
            objs.style.display="inline";
            //no support[check again]CLT sheetObjects[0].style.height=sheetObjects[0].GetSheetHeight(10);
            sheetObjects[0].focus();
            //no support[check again]CLT sheetObjects[0].ViewRows=10;
        }
    }
