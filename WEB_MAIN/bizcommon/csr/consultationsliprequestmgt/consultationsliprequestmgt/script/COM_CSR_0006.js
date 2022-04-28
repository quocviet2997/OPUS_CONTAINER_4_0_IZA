/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_CSR_0006.js
*@FileTitle  : Terminal invoice CSR Creation -Preview
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
     * @class COM_CSR_0006 : business script for COM_CSR_0006 
     */
    function COM_CSR_0006() {
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
    var comboObjects=new Array();
    var comboCnt=0 ; 
    var approvalFlg="";
    /* Event handler processing by button click event */
    document.onclick=processButtonClick;
    /* Event handler processing by button name */
        function processButtonClick(){
             var sheetObject=sheetObjects[0];
             var sheetObject1=sheetObjects[1];
             var sheetObject2=sheetObjects[2];
             var formObject=document.form; 
        	try {
        		var srcName=ComGetEvent("name");
    			switch(srcName) {
    				case "btng_close":
    					ComClosePopup(); 
    	        break;
    				case "btng_print":		
    					viewer.print({isServerSide:true}); // print by the default printer
    					break;
    				case "btng_approvalrequest":
    					if(approvalFlg==""){
    				        // getting the opener from the window object in case of modal
    						if(!opener)
    							opener=window.dialogArguments;
    						if (!opener)
    							opener=parent;
    						
    						opener.approvalrequest();
    					}
    					focus();
    					approvalFlg="Y";
    					ComClosePopup(); 
    					break;
                } // end switch
        	}catch(e) {
        		if( e == "[object Error]") {
        			showErrMessage(getMsg('CSR21025'));
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
        /**
         * initializing sheet
         * implementing onLoad event handler in body tag
         * adding first-served functions after loading screen.
         */
        function loadPage() {
    		// Activating/deactivating 'Approval Request' button
    		if (previewFlgYN!=undefined && previewFlgYN=='Y'){
    			document.all.item("btng_approvalrequest_yn")[0].style.display="inline";
    			document.all.item("btng_approvalrequest_yn")[1].style.display="none";
    		} else {
    			document.all.item("btng_approvalrequest_yn")[0].style.display="none";
    			document.all.item("btng_approvalrequest_yn")[1].style.display="inline";
    		}
         	for (i=0; i < sheetObjects.length; i++) {
         		ComConfigSheet(sheetObjects[i]);
         		initSheet(sheetObjects[i], i + 1);
         		ComEndConfigSheet(sheetObjects[i]);
         	}
           	rdOpen();	
        }
       /**
         * setting sheet initial values and header
         * param : sheetObj, sheetNo
         * adding case as numbers of counting sheets 
         */
        function initSheet(sheetObj,sheetNo) {
            var cnt=0;
            switch(sheetNo) {
                case 1:      //sheet1 init
                    with(sheetObj){
          
                  var HeadTitle="Seq.||Invoice No.|Net Amount|Tax Amount|Total Amount" ;

                  SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:1, DataRowMerge:1 } );

                  var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                  var headers = [ { Text:HeadTitle, Align:"Center"} ];
                  InitHeaders(headers, info);

                  var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                         {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",    ColMerge:0,   SaveName:"inv_no",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"ttl_inv_amt",    KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:150,  Align:"Right",   ColMerge:0,   SaveName:"vat_amt",        KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"total_amt",      KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
                         {Type:"Status",    Hidden:1, Width:1,    Align:"Right",   ColMerge:0,   SaveName:"ibflag",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
                   
                  InitColumns(cols);

                  SetEditable(1);
                  SetSheetHeight(13);
                  SetVisible(0);
                    }

                    break;    
            }
        }
      // Handling the process about the sheet
        function doActionIBSheet(sheetObj,formObj,sAction) {
            sheetObj.ShowDebugMsg(false);
            switch(sAction) {
               case IBSEARCH:      //retrieving
                   	formObj.f_cmd.value=SEARCHLIST;                  
                    //sheetObj.DoSearch4Post("COM_CSR_0006GS.do", FormQueryString(formObj));
                    break; 
               case IBCOPYROW:        //copy the row
                  sheetObj.DataCopy();
                  break; // js hint : break --> break;
            }
        }
       /**
         * Handling the process for the input validation
         */
        function validateForm(sheetObj,formObj,sAction){
            with(formObj){
//                if (!isNumber(iPage)) {
    //
//                    return false;
//                }
            }
            return true;
        }
   	  	/**
         * Handling the event in case of clicking MInimize.
         */
        function Minimize(nItem)
        {
            var objs=document.all.item("showMin");
            if ( nItem == "1" )
            {
    	    	    objs.style.display="none";
    	    	    sheetObjects[0].style.height=sheetObjects[0].GetSheetHeight(20);
    	    	    sheetObjects[0].focus();
    	    	    sheetObjects[0].ViewRows=20; 
    				}
    	    	else
    	    	{
    	    	    objs.style.display="inline";
    	    	    sheetObjects[0].style.height=sheetObjects[0].GetSheetHeight(10);
    	    	    sheetObjects[0].focus();
    	    	    sheetObjects[0].ViewRows=10;
    	    	}
        }
    	function rdOpen(){		
    			var sXml="";		
    			var i=0;
    			var j=0; 
    			var opener_obj=window.dialogArguments;	
    			if (!opener_obj)  opener_obj=window.opener;  //이 코드 추가할것
    			if (!opener_obj) opener_obj=parent; //이 코드 추가할것
    			//var opener_obj = opener;	
    			var opener_sheet_obj1=opener_obj.sheet2;
    			var opener_sheet_obj2=opener_obj.sheet3; 
    			var fromObj=new Array();
    			var rdObj=new Array();
	            fromObj[0]=document.form;                            // Putting it for sending to RD
	            rdObj[0]=opener_sheet_obj1;     
	            rdObj[1]=opener_sheet_obj2;
    			sXml="<?xml version='1.0' ?><SHEET>";
    			sheetCnt=1;
    			for(i=0;i<2;i++){
    					sheetCnt=i+1;
    					if(rdObj[i].RowCount()==0){
    							sXml  += "<SHEET"+sheetCnt+"><DATA TOTAL='0'><TR>";
    							for(j=0;j<=rdObj[i].LastCol();j++){
    									sXml +="<TD></TD>";
    							}
    							sXml +="</TR></DATA></SHEET"+sheetCnt+">";
    					}else{
    							sXml +=RD_GetDataSearchXml(rdObj[i],sheetCnt); 					
    					}			
    			}
    			sXml +="</SHEET>"; 
          if ( rdObj[0].RowCount()== "0")
          {
              errMsg=getMsg("CRS90001");
              showErrMessage(errMsg);
              return;
          }
 
    			viewer.setRData(sXml);
    			if(previewFlg =="krjp"){			
					//Real 
    				viewer.openFile(RD_path+'bizcommon/csr/consultationsliprequestmgt/consultationsliprequestmgt/report/COM_CSR_0006krjp.mrd', RDServer, {timeout:3000});
					//Local
    				//rdObjects[0].FileOpen("http://localhost:9001/opuscntr/bizcommon/csr/consultationsliprequestmgt/consultationsliprequestmgt/report/COM_CSR_0006krjp.mrd", ''); 	
    			}else{
    				//Real 
    				viewer.openFile(RD_path+'bizcommon/csr/consultationsliprequestmgt/consultationsliprequestmgt/report/COM_CSR_0006.mrd', RDServer, {timeout:3000}); 
					//Local
					//rdObjects[0].FileOpen("http://localhost:9001/opuscntr/bizcommon/csr/consultationsliprequestmgt/consultationsliprequestmgt/report/COM_CSR_0006.mrd", ''); 	
    			}
    	}
