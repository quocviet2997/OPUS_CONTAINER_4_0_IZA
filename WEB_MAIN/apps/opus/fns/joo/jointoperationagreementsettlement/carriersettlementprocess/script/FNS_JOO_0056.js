/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0056.js
 *@FileTitle: RDR Download by Lane
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
 * @class FNS_JOO_0056 : business script for FNS_JOO_0056
 */
    function FNS_JOO_0056() {
    	this.processButtonClick=tprocessButtonClick;
    	this.setSheetObject=setSheetObject;
    	this.loadPage=loadPage;
    	this.initSheet=initSheet;
    	this.initControl=initControl;
    	this.doActionIBSheet=doActionIBSheet;
    	this.setTabObject=setTabObject;
    	this.validateForm=validateForm;
    }
// common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var comboObjects=new Array();
var comboCnt=0;
 // Event handler processing by button click event */
 document.onclick=processButtonClick;
 // Event handler processing by button name */
    function processButtonClick() {
        /***** setting sheet object *****/
        var sheetObj=sheetObjects[0];
        /*******************************************************/
        var frmObj=document.form;
        try {
            var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
            switch(srcName) {
                case "btns_calendar_from": //calendar
                    var cal=new ComCalendar();
                    cal.select(frmObj.pre_fr, 'yyyy-MM-dd');
                    break;
                case "btns_calendar_to": //calendar
                    var cal=new ComCalendar();
                    cal.select(frmObj.pre_to, 'yyyy-MM-dd');
                    break;
                case "btn_retrieve":
                    doActionIBSheet(sheetObj, frmObj, IBSEARCH);
                    break;
                case "btn_save":
                    doActionIBSheet(sheetObj, frmObj, IBSAVE);    // save
                    break;
                case "btn_downexcel":
                    // sheetObject1.Down2Excel(-1);
                	if(sheetObj.RowCount() < 1){//no data
		          		 ComShowCodeMessage("COM132501");
		  	       	}else{        	       			  
//			  	       	var paramObj=new Object();
//	                    paramObj.cols=10;
//	                    var url=ComJooGetPgmTitle(sheetObj, paramObj);
//	                    sheetObj.Down2Excel({ HiddenColumn:{HiddenColumn:-1}});
		  	       		sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
		  	       	}	
                    break;
            } // end switch
        } catch(e) {
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
      * param : combo_obj
      * adding process for list in case of needing batch processing with other items
      * defining list on the top of source
      */
      function setComboObject(combo_obj) {
         comboObjects[comboCnt++]=combo_obj;
      }
      function sheet1_OnLoadFinish(sheetObj) {
          doActionIBSheet(sheetObjects[0],document.form, IBCLEAR);
//          document.form.rlane_cd.focus();
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
         // initializing IBMultiCombo
         for(var k=0; k<comboObjects.length; k++){
             initCombo(comboObjects[k], k + 1);
         }
         initControl();
         sheet1_OnLoadFinish(sheet1);
     }
      /**
       * loading HTML Control event <br>
       * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
       * @param {ibsheet} sheetObj    IBSheet Object
       * @param {int}     sheetNo     sequence number in sheetObjects array
       **/
      function initControl() {
          var formObject=document.form;
          axon_event.addListenerForm  ('change'  , 'fnObjChange', formObject );
          axon_event.addListenerFormat('deactivate',  'fnDeactivate',  formObject);
          axon_event.addListenerFormat('activate'  ,  'fnActivate',  formObject);
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
	                 var HeadTitle2="|V.V.D|Port|ETD|Carrier|Allocation|Allocation|Slot Release|Slot Release|Slot Release|Adjusted Allcation|Adjusted Allcation|Actual Used|Actual Used|Over Used|Over Used|ShortLeg-Remark|ShortLeg-Remark|ShortLeg-Remark|20'HC|20'HC|40'HC|40'HC|45'|45'|RF|RF|EMPTY\nTEU|EMPTY\nWT|Remark|RemarkCont" +
	                 "|vsl_cd|voy_no|dir_cd|region|JO_RF|JO_RF|JO_VOID";
	                 var HeadTitle3="|V.V.D|Port|ETD|Carrier|TEU|WT|TEU|WT|R/Option|TEU|WT|TEU|WT|TEU|WT|TEU|WT|WT-TEU|Loaded|BSA|Loaded|BSA|Loaded|BSA|O|I|EMPTY\nTEU|EMPTY\nWT|Remark|RemarkCont" +
	                 "|vsl_cd|voy_no|dir_cd|region|OCN|IPT|TEU";
	                 var headCount=ComCountHeadTitle(HeadTitle2);
	                 SetConfig( { SearchMode:0, MergeSheet:7, Page:20, DataRowMerge:0, FrozenCol: 5 } );
	                 var info    = { Sort:0, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle2, Align:"Center"},
	                             { Text:HeadTitle3, Align:"Center"} ];
	                 InitHeaders(headers, info);
	
	                 var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"ibflag" },
	                        {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd",                       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"port_cd",                   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:0,  Width:130,  Align:"Center",  ColMerge:1,   SaveName:"vps_etd_dt",                KeyField:0,   CalcLogic:"",   Format:"YmdHms",      PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"opr_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"alc_alloc",                 KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"alc_wgt",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"swap_slot",                 KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"swap_wgt",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Combo",     Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName:"jo_slt_rlse_cd",            KeyField:0,   CalcLogic:"",   Format:"",             PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"adjust_teu",                KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"adjust_wt",                 KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"act_slot",                  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"act_wgt",                   KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"over_slot",                 KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"over_wgt",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:1,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"jo_shrt_leg_rmk_teu_qty",   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Float",     Hidden:1,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"jo_shrt_leg_rmk_wgt",       KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:1,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"jo_shrt_leg_rmk_diff_qty",  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"load_20",                   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"bsa_hc20",                  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"load_40",                   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"bsa_hc40",                  KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"load_45",                   KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"bsa_45",                    KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"r_o",                       KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"r_i",                       KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Int",       Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"empty_teu",                 KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:60,   Align:"Right",   ColMerge:1,   SaveName:"empty_wt",                  KeyField:0,   CalcLogic:"",   Format:"Float",       PointCount:2,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:0, Width:58,   Align:"Center",  ColMerge:1,   SaveName:"remark",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:58,   Align:"Center",  ColMerge:1,   SaveName:"remark_cont",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"vsl_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"voy_no",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"dir_cd",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Center",  ColMerge:1,   SaveName:"region",                    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Right",   ColMerge:0,   SaveName:"jo_rf_ocn_qty",             KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Right",   ColMerge:0,   SaveName:"jo_rf_ipt_qty",             KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:0 },
	                        {Type:"Text",      Hidden:1, Width:50,   Align:"Right",   ColMerge:0,   SaveName:"jo_void_teu_qty",           KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:0 } ];
	                  
	                 InitColumns(cols);
	                 SetEditable(1);
//	                 SetSheetHeight(500);
	                 resizeSheet();
	                 SetEditableColorDiff(0);
	                 SetColProperty("jo_slt_rlse_cd", {ComboText:"Purchase|Release|Compensation", ComboCode:"P|R|C"} );
	                 SetShowButtonImage(4);
	                 SetRowHeight(0,20);
	                 SetRowHeight(1,20);
	                 SetDataLinkMouse("vvd",1);
                 }
             break;
         }
     }
    // handling sheet process
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
            case IBSEARCH:      //retrieve
                if (validateForm(sheetObj,formObj,sAction)) {
                    formObj.f_cmd.value=SEARCHLIST01;
                     sheetObj.DoSearch("FNS_JOO_0056GS.do", FormQueryString(formObj));
                    sheetObj.SetColFontUnderline("vvd",1);
                }
                break;
            case IBSAVE:      //save
                if (!sheetObj.IsDataModified()) {
                    ComShowCodeMessage("JOO00036");
                } else {
                    if (validateForm(sheetObj,formObj,sAction)) {
                        if (ComShowCodeConfirm("JOO00046")) {
                            formObj.f_cmd.value=MULTI;
                            sheetObj.DoSave("FNS_JOO_0056GS.do", FormQueryString(formObj), -1, false);
                        }
                    }
                }
                break;
            case IBCLEAR:
                var param="";
                var sXml="";
                //Region Combo Search.
                formObj.f_cmd.value=SEARCH01;
                param=FormQueryString(formObj);
                sXml=sheetObj.GetSearchData("FNS_JOO_0056GS.do", param);
                ComXml2ComboItem(sXml, joRgnCdCombo, "code", "name");
                
                //Carrier Combo Search.
                formObj.f_cmd.value=SEARCHLIST03;
                param=FormQueryString(formObj);
                sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                var comboCodeList=ComGetEtcData(sXml, "comboCode").split("^#^");
                var comboTextList=ComGetEtcData(sXml, "comboText").split("^#^");
                oprCdCombo.RemoveAll();
                oprCdCombo.InsertItem(-1, "[ALL]", "");
                for (var w=0; w<comboCodeList.length-1; w++) {
                    oprCdCombo.InsertItem(-1, comboTextList[w], comboCodeList[w]);
                }
                oprCdCombo.SetSelectIndex(0,false);
                break;
            case IBSEARCH_ASYNC01:
                var code=formObj.rlane_cd.value;
                formObj.f_cmd.value=SEARCH07;
                var param=FormQueryString(formObj)+"&code="+code;
                 var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                var sTotal=ComGetTotalRows(sXml);
                if (sTotal == "0") {
                    ComShowCodeMessage("JOO00110");
                    formObj.rlane_cd.value='';
//                    formObj.rlane_cd.focus();
                } else {
                    formObj.rlane_cd.value=code;
//                    formObj.joRgnCdCombo.focus();
                }
                break;
        }
    }
    /**
     * retrieving after saving <br>
     * @param {ibsheet} Event       event after saving IBSheet
     */
    function sheet1_OnSaveEnd(sheetObj, ErrMsg) {
        if (ErrMsg == "") {
            ComShowCodeMessage("JOO00160");
            doActionIBSheet(sheetObj, document.form, IBSEARCH);
        }
    }
    /**
     * Sheet1 OnChange event
     */
    function sheet1_OnChange(sheetObj, Row, Col, Value) {
        if (sheetObj.ColSaveName(Col) == "jo_slt_rlse_cd") {
            Joo0056CalcuLogic(sheetObj, Row);
        }
    }
    /**
     * setting Combo basic info
     * @param comboObj
     * @param comboIndex Number
     */
    function initCombo(comboObj, comboNo ) {
        switch(comboObj.options.id) {
            case "joRgnCdCombo":
                comboObj.SetMultiSelect(1);
                comboObj.SetDropHeight(200);
                break;
            case "oprCdCombo":
                comboObj.SetMultiSelect(1);
                comboObj.SetDropHeight(200);
                break;
        }
    }
    /**
     * joRgnCdCombo MultiSelection OnCheckClick event
     *  - MultiCombo(MultiSelection) MultiSelection OnCheckClick event
     *  - setting "('A', 'B', 'C')" for using IN statement
     */
    function joRgnCdCombo_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
        var formObject=document.form
        if (comboObj.GetSelectText()== null || comboObj.GetSelectText()== "") {
            formObject.region.value="";
        } else {
            formObject.region.value=("'" + ComReplaceStr(comboObj.GetSelectCode(), ",", "', '") + "'");
        }
    }
    /**
     * oprCdCombo MultiSelection OnCheckClick event
     *  - MultiCombo(MultiSelection) MultiSelection OnCheckClick event
     *  - unckecking other item in case of selecting 'ALL'
     *  - setting "('A', 'B', 'C')" for using IN statement
     */
    
    function oprCdCombo_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
        var formObject=document.form
        if (comboObj.GetSelectText()== null || comboObj.GetSelectText()== "") {
            comboObj.SetItemCheck(0,1);
            formObject.opr_cd.value="";
        } else {
            if (newIndex == 0) {
                for(var i=1; i<comboObj.GetItemCount(); i++) {
                    comboObj.SetItemCheck(i,0);
                }
                formObject.opr_cd.value="";
            } else {
                comboObj.SetItemCheck(0,0);
                formObject.opr_cd.value=("'" + ComReplaceStr(comboObj.GetSelectCode(), ",", "', '") + "'");
            }
        }
    }
      /**
       * Period NAVI event
       * @param void
       * @return void
       */
       function fnDocClick(){
           var obj=ComGetEvent();
           var formObj=document.form;
           fnDeactivate();
           switch(ComGetEvent("name")){
               case "srch_rlane_cd"://after retrieving Lane popup
                    var lane_cd=formObj.rlane_cd.value;
                    var param="?mode=svc&lane_cd="+lane_cd;
                    ComOpenPopup('/opuscntr/COM_ENS_081.do' + param, 820, 460, 'getCOM_ENS_081_1', '1,0,1,1,1,1,1,1');
                    break;
           }
       }
       function getCOM_ENS_081_1(aryPopupData){
           with(document.form){
                 rlane_cd.value=aryPopupData[0][3];
           }
       }
    /**
     *  KeyPress Event of form Element.
     */
//    function fnObjKeyPress() {
//        var obj=ComGetEvent();
//        var formObj=document.form;
//        var attr=obj.getAttribute("dataformat");
//        switch (attr) {
//            case 'ymd':
//                ComKeyOnlyNumber( obj );
//                break;
//            case 'engup':
//                ComKeyOnlyAlphabet( 'upper' );
//                break;
//            case 'engup':
//                ComKeyOnlyAlphabet( 'upper' );
//                break;
//            case 'uppernum':
//                ComKeyOnlyAlphabet( 'uppernum' );
//                break;
//        }
//    }
       /**
        * input validation,
        * focus out.
        */
       function fnDeactivate(){
            var obj=ComGetEvent();
            var formObj=document.form;
            var attr=obj.getAttribute("dataformat");
            switch(ComGetEvent("name")){
                case 'pre_fr':
                      ComAddSeparator(obj );
                      break;
                case 'pre_to':
                      ComAddSeparator(obj );
                      break;
                case 'rlane_cd':
                    if( obj.value == ""){return;}
                    if( !ComChkObjValid(obj  )){
                         ComSetFocus(obj);
                         return;
                    }
                    break;
            }
       }
        /**
         * <pre>
         *     input validation,
         *     on focus.
         * </pre>
         *
         * @return void
         */
        function fnActivate(){
            var obj=ComGetEvent();
            var formObj=document.form;
            var attr=obj.getAttribute("dataformat");
            switch(attr){
                case 'ymd':
                     ComClearSeparator(obj );
                     break;
            }
            ComSetFocus(obj);
        }
       /**
        *
        * <pre>
        *    Form Clear
        * </pre>
        *
        * @param
        * @return
        * @author jang kang cheol
        */
       function fnFormClear(){
           var formObj=document.form;
           ComClearObject(formObj.rlane_cd  );
           joRgnCdCombo.SetSelectCode("");
           if( sheetObjects[0].RowCount()> 0) {
               sheetObjects[0].RemoveAll();
           }
       }
    function fnObjKeyUp() {
        var formObj=document.form;
        var obj=ComGetEvent();
        switch(ComGetEvent("name")) {
            case 'joRgnCdCombo':
                if (sheetObjects[0].RowCount()> 0) {
                    sheetObjects[0].RemoveAll();
                }
                break;
            case 'rlane_cd':
                joRgnCdCombo.SetSelectCode("");
                if (sheetObjects[0].RowCount()> 0) {
                    sheetObjects[0].RemoveAll();
                }
                var maxlength=obj.getAttribute("maxlength");
                if (obj.value.length != maxlength) {
                    return;
                } else {
                    doActionIBSheet( sheetObjects[0], formObj, IBSEARCH_ASYNC01);
                }
                break;
        }
    }
     /**
      *
      * <pre>
      *    Grid click
      * </pre>
      *
      * @author jang kang cheol
      */
     function sheet1_OnClick(sheetObj, row, col){
         var formObj=document.form;
         switch( sheetObj.ColSaveName(col) ){
             case "remark":
            	 if( sheetObj.GetCellValue(row, col) != "Yes" ){ return;}
                 Joo0056ShowMemoPad(sheetObj, row, sheetObj.SaveNameCol("remark_cont"));
                 break;
             case "vvd":
            	 var vvd=sheetObj.GetCellValue(row, "vvd");
                   var vsl_cd=vvd.substring(0,4);
                   var voy_no=vvd.substring(4,8);
                   var dir_cd=vvd.substring(8,9);
                   var region=joRgnCdCombo.GetSelectCode();
                   var param="?pop_mode=Y&vsl_cd="+vsl_cd+"&voy_no="+voy_no+"&dir_cd="+dir_cd+"&region="+region;
                   ComOpenPopup('/opuscntr/VOP_OPF_0045_POP.do'+param, 1064, 700, 'popupFinish', '1,0,1,1,1,1,1,1', true);
                   //ComOpenPopup('/opuscntr/VOP_OPF_0045_POP.do'+param, 1024, 700, 'popupFinish', '1,0,1,1,1,1,1,1', true);
                   break;
         }
     }
     /**
      *
      * <pre>
      *    Grid double click
      * </pre>
      *
      * @author jang kang cheol
      */
     function sheet1_OnDblClick(sheetObj, row, col){
         var formObj=document.form;
         var savename=sheetObj.ColSaveName(col);
         var sMovePageForSaveName="alc_alloc,alc_wgt,act_slot,act_wgt,load_20,bsa_hc20,load_40,bsa_hc40,load_45,bsa_45,r_o,r_i,empty_teu,remark";
         if( sMovePageForSaveName.indexOf(savename) > -1 ){
             goOpfRdrInquiry(sheetObj, row, col, savename);
         }
     }
     /**
      *
      * <pre>
      *   Opf Rdr Inquiry popup Call
      * </pre>
      *
      * @author jang kang cheol
      */
     function goOpfRdrInquiry(sheetObj, row, col, savename){
          var formObj=document.form;
          var vvd=sheetObj.GetCellValue(row, "vvd");
          var vsl_cd=vvd.substring(0,4);
          var voy_no=vvd.substring(4,8);
          var dir_cd=vvd.substring(8,9);
          var region=joRgnCdCombo.GetSelectCode();
          var joo_init_tab=getRdrTabName(savename);
          if( joo_init_tab == ""){
             return;
          }
          var param="?pop_mode=Y&vsl_cd="+vsl_cd+"&voy_no="+voy_no+"&dir_cd="+dir_cd+"&region="+region+"&joo_init_tab="+joo_init_tab;
          ComOpenPopup('/opuscntr/VOP_OPF_0045_POP.do'+param, 1024, 700, 'popupFinish', '1,0,1,1,1,1,1,1', false);
     }
     /**
      *
      * <pre>
      *     Mapping TabName of Opf Rdr Inquiry by Grid SaveName
      * </pre>
      *
      * @param   Grid SaveName
      * @return  Opf TabName
      * @author  jang kang cheol
      */
     function getRdrTabName(SaveName){
         var OpfTabName="";
         switch ( SaveName ){
             /**********************************************
              * alc_alloc
              * alc_wgt
              *            => VSL_Alloc
              **********************************************/
               case "alc_alloc"://Allocation
                    OpfTabName="VSL_Alloc";
                    break;
               case "alc_wgt"://Allocation
                    OpfTabName="VSL_Alloc";
                    break;
              /**********************************************
               * act_slot
               * act_wgt
               * empty_teu
               *            => SlotWGT_Util
               **********************************************/
               case "act_slot"://Actual Used, Empty
                    OpfTabName="SlotWGT_Util";
                    break;
               case "act_wgt"://Actual Used, Empty
                    OpfTabName="SlotWGT_Util";
                    break;
               case "empty_teu":
                   OpfTabName="SlotWGT_Util";
                   break;
               /**********************************************
                * load_20
                * bsa_hc20
                * load_40
                * bsa_hc40
                * load_45
                * bsa_45
                *            => HC45
                **********************************************/
               case "load_20":
                    OpfTabName="HC45";
                    break;
               case "bsa_hc20":
                    OpfTabName="HC45";
                    break;
               case "load_40":
                    OpfTabName="HC45";
                    break;
               case "bsa_hc40":
                    OpfTabName="HC45";
                    break;
               case "load_45":
                    OpfTabName="HC45";
                    break;
               case "bsa_45":
                    OpfTabName="HC45";
                    break;
               case "r_o":
                    OpfTabName="RF";
                    break;
               case "r_i":
                    OpfTabName="RF";
                    break;
               case "remark":
                    OpfTabName="Remark";
                    break;
         }
         return OpfTabName;
     }
     /**
      * ReDefine ComShowMemoPad of common js
      */
    function Joo0056ShowMemoPad(sheetObj, row, col) {
        //setting default
        var iWidth=400;
        var iHeight=311;
        //setting global variable
        memoSheet=sheetObj;
        memoRow=row;
        memoCol=col;
        //checking Validation
        if (sheetObj.GetCellEditable(row, col)) {
            return ComShowMessage("[Joo0056ShowMemoPad] "+ sheetObj.id + "(" + row + "," + col + ") 셀은 편집불가능이어야 합니다.");
        }
        if (!ComIsNumber(col)) ccolol=sheetObj.SaveNameCol(col);
        //making memopad
        if (!Joo0056initMemoPad()) return;
        //calculating coordinate (AnchorPosition_getPageOffsetLeft, AnchorPosition_getPageOffsetTop function in ComCalendar.js)
        var iLeft=AnchorPosition_getPageOffsetLeft(sheetObj) + sheetObj.ColLeft(col) + 2;
        var iTop=AnchorPosition_getPageOffsetTop(sheetObj)  + sheetObj.RowTop(row) + 2;
        if (sheetObj.GetCountPosition()!= 0)  iTop += 16;
        //changing coordinate
        if (top.document != document && window.frameElement.scrolling == "no") {
            if (iTop + iHeight  > document.body.clientHeight) {
                iBottom=iTop + sheetObj.GetRowHeight(row);
                if (iBottom > document.body.clientHeight) iBottom=document.body.clientHeight;
                iTop=iBottom-iHeight;
                if (iTop <0) iTop=0
            }
            if (iLeft + iWidth  > document.body.clientWidth) {
                iLeft=document.body.clientWidth - iWidth;
                if (iLeft<0) iLeft=0;
            }
        }
        var _frameDoc=document.getElementById(MEMO_FRAME_NAME).contentWindow.document;
        _frameDoc.getElementById(MEMO_TEXT_NAME).style.backgroundColor="#E8E7EC";
        _frameDoc.getElementById(MEMO_TEXT_NAME).style.fontFamily=sheetObj.GetSheetFontName;
        _frameDoc.getElementById(MEMO_TEXT_NAME).style.fontSize=11;
        _frameDoc.getElementById(MEMO_TEXT_NAME).SetSheetHeight(iHeight - 26);
        _frameDoc.getElementById(MEMO_TEXT_NAME).value=sheetObj.GetCellText(row, col).trim();
        _frameDoc.getElementById("_memoInput1_").value=sheetObj.GetCellText(row, "jo_shrt_leg_rmk_teu_qty").trim();
        _frameDoc.getElementById("_memoInput2_").value=sheetObj.GetCellText(row, "jo_shrt_leg_rmk_wgt").trim();
        _frameDoc.getElementById("_memoInput3_").value=sheetObj.GetCellText(row, "jo_shrt_leg_rmk_diff_qty").trim();
        _frameDoc.getElementById("_memoInput4_").value=sheetObj.GetCellText(row, "jo_rf_ocn_qty").trim();
        _frameDoc.getElementById("_memoInput5_").value=sheetObj.GetCellText(row, "jo_rf_ipt_qty").trim();
        _frameDoc.getElementById("_memoInput6_").value=sheetObj.GetCellText(row, "jo_void_teu_qty").trim();
        _frameDoc.getElementById(MEMO_TEXT_NAME).readOnly=true;
        var _divMemo=document.getElementById(MEMO_DIV_NAME);
        _divMemo.style.width=iWidth;
        _divMemo.SetSheetHeight(iHeight);
        _divMemo.style.top=iTop;
        _divMemo.style.left=iLeft;
        _divMemo.style.visibility="visible";
        ComSetFocus(_frameDoc.getElementById("_memoInput1_"));
    }
    /**
     * ReDefine initMemoPad in common js
     */
    function Joo0056initMemoPad() {
        if (document.getElementById(MEMO_DIV_NAME) != null) return true;
        var _divMemo=document.createElement("<div id='" + MEMO_DIV_NAME + "' style='position:absolute; visibility:hidden'/>");
        document.body.insertBefore(_divMemo);
        var _frameMemo=document.createElement("<iframe id='" + MEMO_FRAME_NAME + "' frameborder='0' marginHeight='0' marginWidth='0' width='100%' height='100%'/>");
        _divMemo.appendChild(_frameMemo);
        var _frameDoc=_frameMemo.contentWindow.document;
        var _frameDiv=_frameDoc.createElement("<div onkeydown='if(event.keyCode==27) parent.ComHideMemoPad(true);' style='border:1.2px solid #aaa; padding:1px; background-color:#E6EFF6;'/>");
        _frameDoc.appendChild(_frameDiv);
        var _frameDiv1=_frameDoc.createElement("<span style='width:311px;'/>");
        _frameDiv.appendChild(_frameDiv1);
        _frameDiv1.appendChild(_frameDoc.createElement("<textarea id='" + MEMO_TEXT_NAME + "' style='border:#7F9DB9 1px solid; color:#4f4f4f; width:100%'/>"));
        var _frameDiv2=_frameDoc.createElement("<span style='padding:10px; width:85px;'/>");
        _frameDiv.appendChild(_frameDiv2);
        var _frameP10=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:12px; font-weight:700; color:#4f4f4f;'/>");
        _frameP10.innerHTML="ShortLeg</br>- Remark";
        _frameDiv2.appendChild(_frameP10);
        var _frameP11=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:11px; color:#4f4f4f;'/>");
        _frameP11.innerText="  ▷  TEU";
        _frameDiv2.appendChild(_frameP11);
        _frameDiv2.appendChild(_frameDoc.createElement("<input id='_memoInput1_' onkeypress='if(event.keyCode < 48 || event.keyCode > 57) return false;' maxlength='3' style='border:#7F9DB9 1px solid; font-family:Tahoma,Arial; font-size:12px; text-align:center; color:#4f4f4f; ime-mode:disabled; height:18px; width:80%'/>"));
        var _frameP12=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:11px; color:#4f4f4f;'/>");
        _frameP12.innerText="  ▷  WT";
        _frameDiv2.appendChild(_frameP12);
        _frameDiv2.appendChild(_frameDoc.createElement("<input id='_memoInput2_' onkeypress='if(event.keyCode < 48 || event.keyCode > 57) return false;' maxlength='3' style='border:#7F9DB9 1px solid; font-family:Tahoma,Arial; font-size:12px; text-align:center; color:#4f4f4f; ime-mode:disabled; height:18px; width:80%'/>"));
        var _frameP13=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:11px; color:#4f4f4f;'/>");
        _frameP13.innerText="  ▷  WT-TEU";
        _frameDiv2.appendChild(_frameP13);
        _frameDiv2.appendChild(_frameDoc.createElement("<input id='_memoInput3_' onkeypress='if(event.keyCode < 48 || event.keyCode > 57) return false;' maxlength='3' style='border:#7F9DB9 1px solid; font-family:Tahoma,Arial; font-size:12px; text-align:center; color:#4f4f4f; ime-mode:disabled; height:18px; width:80%'/>"));
        var _frameP20=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:12px; font-weight:900; color:#4f4f4f;'/>");
        _frameP20.innerText="RF";
        _frameDiv2.appendChild(_frameP20);
        var _frameP21=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:11px; color:#4f4f4f;'/>");
        _frameP21.innerText="  ▷  O";
        _frameDiv2.appendChild(_frameP21);
        _frameDiv2.appendChild(_frameDoc.createElement("<input id='_memoInput4_' onkeypress='if(event.keyCode < 48 || event.keyCode > 57) return false;' maxlength='3' style='border:#7F9DB9 1px solid; font-family:Tahoma,Arial; font-size:12px; text-align:center; color:#4f4f4f; ime-mode:disabled; height:18px; width:80%'/>"));
        var _frameP22=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:11px; color:#4f4f4f;'/>");
        _frameP22.innerText="  ▷  I";
        _frameDiv2.appendChild(_frameP22);
        _frameDiv2.appendChild(_frameDoc.createElement("<input id='_memoInput5_' onkeypress='if(event.keyCode < 48 || event.keyCode > 57) return false;' maxlength='3' style='border:#7F9DB9 1px solid; font-family:Tahoma,Arial; font-size:12px; text-align:center; color:#4f4f4f; ime-mode:disabled; height:18px; width:80%'/>"));
        var _frameP30=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:12px; font-weight:900; color:#4f4f4f;'/>");
        _frameP30.innerHTML="Void";
        _frameDiv2.appendChild(_frameP30);
        var _frameP31=_frameDoc.createElement("<div style='font-family:Tahoma,Arial; font-size:11px; color:#4f4f4f;'/>");
        _frameP31.innerText="  ▷  TEU";
        _frameDiv2.appendChild(_frameP31);
        _frameDiv2.appendChild(_frameDoc.createElement("<input id='_memoInput6_' onkeypress='if(event.keyCode < 48 || event.keyCode > 57) return false;' maxlength='3' style='border:#7F9DB9 1px solid; font-family:Tahoma,Arial; font-size:12px; text-align:center; color:#4f4f4f; ime-mode:disabled; height:18px; width:80%'/>"));
        var _centerTag=_frameDoc.createElement("<div style='height:20px; text-align:center; vertical-align:middle;'/>");
        var _button1=_frameDoc.createElement("<span id='btn_apply' style='font-family:Tahoma,Arial; font-size:12px; cursor:hand; width:40; height:18; padding:0,3,0,3; text-align:center; border:1 solid gray; background-color:#eaeaea' onclick='parent.Joo0056SetMemoValue(document.getElementById(\"" + MEMO_TEXT_NAME + "\").value," + 4000 + ");'/>");
        _button1.innerText="Apply";
        _centerTag.appendChild(_button1);
        var _button2=_frameDoc.createElement("<span id='btn_close' style='font-family:Tahoma,Arial; font-size:12px; cursor:hand; width:40; height:18; padding:0,3,0,3; text-align:center; border:1 solid gray; background-color:#eaeaea' onclick='parent.ComHideMemoPad(true)'/>");
        _button2.innerText="Close";
        _centerTag.appendChild(_button2);
        _frameDiv.appendChild(_centerTag);
        if (document.onmouseup==null || document.onmouseup.toString().indexOf("ComHideMemoPad") < 0) {
            window.popupMemoOldEventListener=document.onmouseup;
            if (window.popupMemoOldEventListener != null) {
                //alert("CoObject \n" + window.popupMemoOldEventListener.toString());
                document.onmouseup=new Function("window.popupMemoOldEventListener(); ComHideMemoPad();");
            } else {
                document.onmouseup=ComHideMemoPad;
            }
            var objs=document.getElementsByTagName("OBJECT")
            window.popupMemoOldObjEventListener=new Array(objs.length);
            for(var i=0 ; i < objs.length ; i++){
                window.popupMemoOldObjEventListener[i]=objs[i].onfocus;
                if (window.popupMemoOldObjEventListener[i] != null) {
                    objs[i].onfocus=new Function("window.popupMemoOldObjEventListener[" + i + "](); ComHideMemoPad();");
                } else {
                    objs[i].onfocus=ComHideMemoPad;
                }
            }
        }
        return true;
    }
    /**
     * ReDefine setMemoValue in common js
     */
    function Joo0056SetMemoValue(sValue, iMax) {
        try {
            if (sValue.length > iMax) {
                ComShowMessage("characters long");
                return;
            } else {
                if (memoSheet == null) return;
                var _frameDoc=document.getElementById(MEMO_FRAME_NAME).contentWindow.document;
                if (!_frameDoc.getElementById(MEMO_TEXT_NAME).readOnly) {
                    memoSheet.SetCellValue(memoRow, memoCol,sValue);
                }
                var joShrtLegRmkTeuQty=ComNullToZero(_frameDoc.getElementById("_memoInput1_").value.trim());
                var joShrtLegRmkWgt=ComNullToZero(_frameDoc.getElementById("_memoInput2_").value.trim());
                var joShrtLegRmkDiffQty=ComNullToZero(_frameDoc.getElementById("_memoInput3_").value.trim());
                var joRfOcnQty=ComNullToZero(_frameDoc.getElementById("_memoInput4_").value.trim());
                var joRfIptQty=ComNullToZero(_frameDoc.getElementById("_memoInput5_").value.trim());
                var joVoidTeuQty=ComNullToZero(_frameDoc.getElementById("_memoInput6_").value.trim());
                memoSheet.SetCellValue(memoRow, "jo_shrt_leg_rmk_teu_qty",joShrtLegRmkTeuQty);
                memoSheet.SetCellValue(memoRow, "jo_shrt_leg_rmk_wgt",joShrtLegRmkWgt);
                memoSheet.SetCellValue(memoRow, "jo_shrt_leg_rmk_diff_qty",joShrtLegRmkDiffQty);
                memoSheet.SetCellValue(memoRow, "jo_rf_ocn_qty",joRfOcnQty);
                memoSheet.SetCellValue(memoRow, "jo_rf_ipt_qty",joRfIptQty);
                memoSheet.SetCellValue(memoRow, "jo_void_teu_qty",joVoidTeuQty);
                 memoSheet.SetCellFontColor(memoRow, "remark","#FF0000");
                Joo0056CalcuLogic(memoSheet, memoRow);
                ComHideMemoPad(true);
            }
        } catch(err) {
            ComFuncErrMsg(err.message);
        }
    }
    /**
     * calculation logic after inputting values in memopad
     */
    function Joo0056CalcuLogic(sheetObj, sheetRow) {
        with (sheetObj) {
            // CellSearchValue
            var alcAlloc=Number(CellSearchValue(sheetRow, "alc_alloc"));
            var alcWgt=Number(CellSearchValue(sheetRow, "alc_wgt"));
            var swapSlot=Number(CellSearchValue(sheetRow, "swap_slot"));
            var swapWgt=Number(CellSearchValue(sheetRow, "swap_wgt"));
            var actSlot=Number(CellSearchValue(sheetRow, "act_slot"));
            var actWgt=Number(CellSearchValue(sheetRow, "act_wgt"));
            if (GetCellValue(sheetRow, "jo_slt_rlse_cd") == 'R') {
                SetCellValue(sheetRow, "adjust_teu",alcAlloc);
                SetCellValue(sheetRow, "adjust_wt",alcWgt);
                SetCellValue(sheetRow, "over_slot",actSlot - alcAlloc);
                SetCellValue(sheetRow, "over_wgt",actWgt -alcWgt);
            } else {   /* C, P, null (Default=P) */
                SetCellValue(sheetRow, "adjust_teu",alcAlloc + swapSlot);
                SetCellValue(sheetRow, "adjust_wt",alcWgt + swapWgt);
                SetCellValue(sheetRow, "over_slot",actSlot - (alcAlloc + swapSlot));
                SetCellValue(sheetRow, "over_wgt",actWgt - (alcWgt + swapWgt));
            }
			SetCellValue(sheetRow, "act_slot",Number(CellSearchValue(sheetRow, "act_slot")) + Number(GetCellValue(sheetRow, "jo_void_teu_qty")));
			SetCellValue(sheetRow, "r_o",Number(CellSearchValue(sheetRow, "r_o")) + Number(GetCellValue(sheetRow, "jo_rf_ocn_qty")));
			SetCellValue(sheetRow, "r_i",Number(CellSearchValue(sheetRow, "r_i")) + Number(GetCellValue(sheetRow, "jo_rf_ipt_qty")));
        }
    }
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         switch(sAction) {
                 case IBSEARCH:
                     if (!ComChkValid(formObj)) return false;
                     if (joRgnCdCombo.GetSelectCode()== "") {
                         ComShowCodeMessage("JOO00115", "Region");
//                         formObj.joRgnCdCombo.focus();
                         return false;
                     }
                     break;
         }
         return true;
     }

     function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0]);
     }     
