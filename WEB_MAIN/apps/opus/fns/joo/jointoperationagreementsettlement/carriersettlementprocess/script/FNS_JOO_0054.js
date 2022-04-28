/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0054.jsp
 *@FileTitle: TDR Creation Inquiry
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/19
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class fns_joo_0054 : business script for fns_joo_0054
 */
function fns_joo_0054() {
	this.processButtonClick=tprocessButtonClick;
	this.setSheetObject=setSheetObject;
	this.loadPage=loadPage;
	this.initSheet=initSheet;
	this.initControl=initControl;
	this.doActionIBSheet=doActionIBSheet;
	this.setTabObject=setTabObject;
	this.validateForm=validateForm;
}
//common global variable
var sheetObjects=new Array();
var sheetCnt=0;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
    function processButtonClick(){
         /***** setting sheet object *****/
		         var sheetObject1=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
				switch(srcName) {
					case "btn_retrieve":
						doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
					break;
					case "btnCalFr":
						var cal=new ComCalendar();
						cal.select(form.from_dt, 'yyyy-MM-dd');
						break;
					case "btnCalTo":
						var cal=new ComCalendar();
						cal.select(form.to_dt, 'yyyy-MM-dd');
						break;
					case "btn1_pop_lane":
	                     ComOpenPopup("/opuscntr/COM_ENS_081.do", 820, 460, "getCOM_ENS_081", "1,0,1,1,1");
					break;		
					case "btn_downexcel":
						if(sheetObject1.RowCount() < 1){//no data
			          		 ComShowCodeMessage("COM132501");
			  	       	}else{        	       			  
			  	       		sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
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
     * registering IBSheet Object as list
     * adding process for list in case of needing batch processing with other items
     * defining list on the top of source
     */
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    /**
     * initializing sheet
     * implementing onLoad event handler in body tag
     * adding first-served functions after loading screen.
     */
    function loadPage() {
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet (sheetObjects[i] );
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
        }
        initControl();
		//	doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
    }
     /**
      * loading HTML Control event <br>
      * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
      * @param {ibsheet} sheetObj    IBSheet Object
      * @param {int}     sheetNo     sequence number in sheetObjects array
      **/
     function initControl() {
     	//** Date Separator **/
     	DATE_SEPARATOR="-";
     	var form=document.form;
         //handling Axon event. event catch
    	axon_event.addListenerFormat('blur', 'obj_deactivate',  form); 	//- handling code when OnBeforeDeactivate(blur) event
    	//axon_event.addListenerFormat('focus',   'obj_activate',    form);            //- handling code when OnBeforeActivate event in case of existing dataformat property
       // axon_event.addListenerFormat('keypress'        , 'obj_keypress'  , 	form); 	//- handling code when onkeypress event in case of existing dataformat property
        //axon_event.addListenerFormat('keyup'           , 'form_keyup'    ,  form);    
     	//axon_event.addListener  ('blur'  , 'from_dt_onblur', 'from_dt');//- getting name after inputting customer code
        //axon_event.addListener  ('blur'  , 'to_dt_onblur', 'to_dt');//- getting name after inputting customer code
        //axon_event.addListener  ('keyup', 'slan_cd_keyup', 'slan_cd');	
      }
     //handling Axon event 2
     function obj_deactivate(){
         ComChkObjValid(event.srcElement);
     }
     function obj_activate(){
         ComClearSeparator(event.srcElement);
     }
 	 function obj_keypress(){
		switch(event.srcElement.dataformat){
		    case "ymd":
		        //only numbers,  "."
		        ComKeyOnlyNumber(event.srcElement, "-"); 
		    break;
		    case "engup":
		         ComKeyOnlyAlphabet('upper');
		    break;
		    case "uppernum":
		    	ComKeyOnlyAlphabet('uppernum');
		    	break;
		}
	 }   
     //retrieving in case of changing stl_yr 
     function from_dt_onblur(){
     	var formObject=document.form;
		if (formObject.from_dt.value ==null || formObject.from_dt.value ==""){
			ComShowCodeMessage('JOO00116','from date');
			ComSetFocus(formObject.from_dt);
			return false;
		}
     }   
     //retrieving in case of changing stl_yr 
     function to_dt_onblur(){
     	//alert("e_stl_yrmon_onblur");
     	var formObject=document.form;
		if (formObject.to_dt.value ==null || formObject.to_dt.value ==""){
			ComShowCodeMessage('JOO00116','to date');
			ComSetFocus(formObject.to_dt);
			return false;
		}	
	}
     function slan_cd_keyup(){
 	    var formObject=document.form;
 	    if (formObject.slan_cd.value.length == 3){
 	    	 //alert("slan_cd_keyup");
 	    	setSlanCdYn();
 		}
 	}
     /*
     * retrieving lane code status in case of inputting lane code by popup <br>
     */
     function setSlanCdYn(){
    	 var formObj=document.form;
    	 formObj.f_cmd.value=SEARCHLIST01;
    	 var prefix="sheet1_";
    	 //alert(formObj.slan_cd.value);
     	 var sXml=sheetObjects[0].GetSearchData("FNS_JOO_0054GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
     	 if(ComGetEtcData(sXml,"vslSlanCd") == ""){
				 ComShowCodeMessage('JOO00110');
				 formObj.slan_cd.value="";
				 ComSetFocus(formObj.slan_cd);
				 return;
 	     }else{
 	    	formObj.slan_cd.value=ComGetEtcData(sXml,"vslSlanCd");
 	     }
     }  
	 function getCOM_ENS_081(rowArray) {
	     var colArray=rowArray[0];
	     document.all.slan_cd.value=colArray[3];
	  }   
  /**
     * setting sheet initial values and header
     * param : sheetObj, sheetNo
     * adding case as numbers of counting sheets
     */
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      // sheet1 init
                with (sheetObj) {                
	                var HeadTitle1="|Lane|V.V.D|V.V.D|V.V.D|Seq.|Port|ETD|Change Status|Creation DT|Slot Used|Upload\nStatus";
	                var headCount=ComCountHeadTitle(HeadTitle1);
	                //(headCount, 0, 0, true);
	                var prefix="sheet1_";
	
	                SetConfig( { SearchMode:2, MergeSheet:7, Page:20, DataRowMerge:0 } );
	
	                var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                var headers = [ { Text:HeadTitle1, Align:"Center"} ];
	                InitHeaders(headers, info);
	                var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
		                       {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slan_cd",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:65,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vsl_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_voy_no",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:20,   Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_dir_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix+"clpt_seq",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:0,   SaveName:prefix+"vps_port_cd",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix+"vps_etd_dt",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix+"skd_cng_sts_cd", KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:160,  Align:"Center",  ColMerge:0,   SaveName:prefix+"update_time",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"slot_used",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
		                       {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix+"pagerows",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];	                 
	                InitColumns(cols);
	                SetEditable(0);
	                SetColProperty(prefix+"vps_etd_dt", {Format:"####-##-## ##:##"} );
	                SetColProperty(prefix+"update_time", {Format:"####-##-## ##:##"} );
//	                SetSheetHeight(520);
	                resizeSheet();
			    }
                break;
        }
    }
  // handling sheet process
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBSEARCH:      //retrieve
	             if (validateForm(sheetObj, formObj, sAction)){
	                 if ( sheetObj.id == "sheet1"){
	     				 formObj.f_cmd.value=SEARCH;
	     				 var prefix="sheet1_";	//prefix characters array
 		    			var sXml=sheetObj.GetSearchData("FNS_JOO_0054GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix));
		    			sheetObjects[0].LoadSearchData(sXml,{Sync:1} );
	                 }
	             }
			break;
			case IBSAVE:        //save	
				break;	
			case IBINSERT:      // insert
				break;
		}
    }
    /**
     * handling process for input validation
     */
     function validateForm(sheetObj,formObj,sAction){
 		sheetObj.ShowDebugMsg(false);
 		var formObject=document.form;
 		var prefix="sheet1_";
       var from_dt=formObject.from_dt.value;
       var to_dt=formObject.to_dt.value;
 		switch (sAction) {
			   case IBSEARCH: //retrieve
				    if (formObject.slan_cd.value ==null || formObject.slan_cd.value ==""){
					    //ComShowCodeMessage('TOT00054');
					    ComShowCodeMessage('JOO00116','Lane code');
					    ComSetFocus(formObject.slan_cd);
					    return false;
				    }
					if (formObject.from_dt.value ==null || formObject.from_dt.value ==""){
						ComShowCodeMessage('JOO00116','From date');
  						ComSetFocus(formObject.from_dt);
  						return false;
  					}
					if (formObject.to_dt.value ==null || formObject.to_dt.value ==""){
						ComShowCodeMessage('JOO00116','To date');
  						ComSetFocus(formObject.to_dt);
  						return false;
  					}			   
					var frDt=ComReplaceStr(formObject.from_dt,"-","");
					var toDt=ComReplaceStr(formObject.to_dt,"-","");
					if (ComGetDaysBetween(frDt, toDt) < 0){
						ComShowCodeMessage("JOO00078");
						ComSetFocus(formObject.to_dt);
						return false;
					}
				break;
			   case IBSAVE:   //save
			   break;
 			default:
 				break;
 		}
 		return true;
  }
     
     function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0]);
    }     
