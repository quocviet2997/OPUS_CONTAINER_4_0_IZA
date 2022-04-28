/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : FNS_JOO_0057.js
 *@FileTitle: RDR Download by VVD
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
 * @class FNS_JOO_0057 : business script for FNS_JOO_0057
 */

 // common global variable
 var sheetObjects=new Array();
 var sheetCnt=0;
 var comboObjects=new Array();
 var comboCnt=0;
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
			if(ComGetBtnDisable(srcName)) return false;
             switch(srcName) {
                 case "btn_Retrieve":
                      doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
                      break;
                 case "btn_downexcel":
                      //sheetObject1.Down2Excel({ HiddenColumn:1,Merge:1});
                	 if(sheetObject1.RowCount() < 1){//no data
		          		 ComShowCodeMessage("COM132501");
		  	       	}else{        	       			  
//			  	       	 var paramObj=new Object();
//	                     paramObj.cols=10;
//	                     var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);
//	                       sheetObjects[0].Down2Excel({ HiddenColumn:{HiddenColumn:-1}});
	                       sheetObjects[0].Down2Excel( {DownCols: makeHiddenSkipCol(sheetObjects[0]), SheetDesign:1,Merge:1 });
		  	       	}	
                	
//                      var paramObj=new Object();
//                      paramObj.cols=10;
//                      var url=ComJooGetPgmTitle(sheetObjects[0], paramObj);
//                       sheetObjects[0].Down2Excel({ HiddenColumn:-1,Merge:true,URL:"url"});
                      break;
                 case "btns_calendar_from": //달력버튼
                     var cal=new ComCalendar();
                     cal.select(formObject.pre_fr, 'yyyy-MM-dd');
                     break;
                case "btns_calendar_to": //달력버튼
                     var cal=new ComCalendar();
                     cal.select(formObject.pre_to, 'yyyy-MM-dd');
                     break;
                case "srch_rlane_cd":
                    var lane_cd=document.form.rlane_cd.value;
                    var param="?mode=svc&lane_cd="+lane_cd;
                    ComOpenPopup('/opuscntr/COM_ENS_081.do' + param, 820, 460, 'getCOM_ENS_081_1', '1,0,1,1,1,1,1,1');
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
         document.form.rlane_cd.focus();
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
          axon_event.addListenerForm  ('keydown', 'ComKeyEnter',  formObject);
          axon_event.addListenerForm  ('keydown', "fnOnKeyDown",  formObject);
          axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );
          axon_event.addListenerForm  ('change'  , 'fnObjChange', formObject );
          axon_event.addListenerForm  ('keyup'   , "fnObjKeyUp",  formObject);
//          axon_event.addListener      ('click',   'fnDocClick', "btn_pre_from_back"       );
//          axon_event.addListener      ('click',   'fnDocClick', "btn_pre_from_next"       );
//          axon_event.addListener      ('click',   'fnDocClick', "btn_pre_to_back"       );
//          axon_event.addListener      ('click',   'fnDocClick', "btn_pre_to_next"       );
//          axon_event.addListener      ('click',   'fnDocClick', "srch_rlane_cd"             );
          axon_event.addListenerFormat('deactivate',  'fnDeactivate',  formObject);
          axon_event.addListenerFormat('activate',  'fnActivate',  formObject);
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
	                 var HeadTitle2="|V.V.D|Port|ETD|Carrier|Allocation|Allocation|Actual Used|Actual Used|Over Used|Over Used|20'|20'|40'|40'|20'HC|20'HC|40'HC|40'HC|45'|45'|AK|AK|RF Loading|RF Loading|ROB RF|ROB RF|DG|DG|EMPTY|EMPTY|Source";
	                 var HeadTitle3="|V.V.D|Port|ETD|Carrier|TEU|WT|TEU|WT|TEU|WT|Full|Empty|Full|Empty|Full|Empty|Full|Empty|Full|Empty|UNIT|VOID|20'|40'|20'|40'|20'|40'|TEU|WEIGHT|Source";
	                 var headCount=ComCountHeadTitle(HeadTitle2);
	                 SetConfig( { SearchMode:0, MergeSheet:7, Page:20, DataRowMerge:0 } );
	                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
	                 var headers = [ { Text:HeadTitle2, Align:"Center"},
	                         { Text:HeadTitle3, Align:"Center"} ];
	                 InitHeaders(headers, info);
	
	                 var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Status" },
				                  {Type:"Text",      Hidden:0,  Width:100,  Align:"Center",  ColMerge:1,   SaveName:"vvd",             KeyField:0,   CalcLogic:"",   Format:"" },
				                  {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"vps_port_cd",     KeyField:0,   CalcLogic:"",   Format:"" },
				                  {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:1,   SaveName:"vps_etd_dt",      KeyField:0,   CalcLogic:"",   Format:"" },
				                  {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"opr_cd",          KeyField:0,   CalcLogic:"",   Format:"" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"all_teu",         KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"all_wgt",         KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"grand_ttl_slot",  KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"grand_ttl_wgt",   KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"over_slot",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"over_wgt",        KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"full_20",         KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"mt_20",           KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"full_40",         KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"mt_40",           KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"hc_ld_20",        KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"hc_bsa_20",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"hc_ld_40",        KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"hc_bsa_40",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"hc_ld_45",        KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"hc_bsa_45",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"ak_unit",         KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"ak_void",         KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"rf_20_qty",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"rf_40_qty",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"rob_rf_20_qty",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"rob_rf_40_qty",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"dg_20_qty",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"dg_40_qty",       KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:0,   SaveName:"mt_teu",          KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Float",     Hidden:0,  Width:60,   Align:"Right",   ColMerge:1,   SaveName:"mt_wt",           KeyField:0,   CalcLogic:"",   Format:"Float" },
				                  {Type:"Text",      Hidden:0,  Width:60,   Align:"Center",  ColMerge:1,   SaveName:"source",          KeyField:0,   CalcLogic:"",   Format:"" } ];
	                  
	                 InitColumns(cols);
	                 SetEditable(0);
//	                 SetSheetHeight(530);
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
                if (!validateForm(sheetObj,formObj,sAction)) {
                    return;
                }
                formObj.f_cmd.value=SEARCHLIST01;
                 sheetObj.DoSearch("FNS_JOO_0057GS.do", FormQueryString(formObj) );
                break;
            case IBCLEAR:      //
                var param="";
                var sXml="";
                var code="CD00593";
                formObj.f_cmd.value=SEARCH01;
                param=FormQueryString(formObj)+"&super_cd1="+code;
                sXml=sheetObj.GetSearchData("FNS_JOO_0057GS.do", param);
                ComXml2ComboItem(sXml, skd_dir_cd, "code", "name");
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
            case IBSEARCH_ASYNC01:      //
                var code=formObj.rlane_cd.value;
                formObj.f_cmd.value=SEARCH07;
                var param=FormQueryString(formObj)+"&code="+code;
                var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
                var sTotal=ComGetTotalRows(sXml);
                if (sTotal == "0") {
                    ComShowCodeMessage("JOO00110");
                    formObj.rlane_cd.value='';
                    rlane_cd.focus();
                } else {
                    formObj.rlane_cd.value=code;
                }
                break;
        }
    }
    /**
    * setting Combo basic info
    * @param comboObj
    * @param comboIndex Number
    */
    function initCombo(comboObj, comboNo ) {
    	var formObject=document.form;
    	var strId=comboObj.options.id;
        switch(strId) {
            case "skd_dir_cd":
                with (comboObj) {
                    SetMultiSelect(0);
                    SetUseAutoComplete(1);
                    SetColAlign(0, "left");
                    SetColWidth(0, "60");
                    SetDropHeight(200);
                    ValidChar(2,1);
                    SetMaxLength(1);
                }
                break;
            case "oprCdCombo":
                with (comboObj) {
                    SetMultiSelect(1);
                    SetDropHeight(200);
                    ValidChar(2,1);                    
                }
                break;
        }
    }
    /**
     * oprCdCombo MultiSelection OnCheckClick event
     *  - MultiCombo(MultiSelection) MultiSelection OnCheckClick event
     *  - setting "('A', 'B', 'C')" for using IN statement
     */
    /*function oprCdCombo_OnCheckClick(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
        var formObject=document.form
        if (comboObj.GetSelectText()== null || comboObj.GetSelectText()== "") {
            comboObj.SetItemCheck(0,1);
            if (formObject.opr_cd == "[object]") formObject.opr_cd.value="";
        } else {
            if (newIndex == 0) { //2018.10.19 Modify SR0014136 AOC - JOO - TDR Inquiry missing several carriers
                for(var i=1; i<comboObj.GetItemCount(); i++) {
                    comboObj.SetItemCheck(i,0);
                }
                formObject.opr_cd.value="";
            } else {
                comboObj.SetItemCheck(0,0);
                formObject.opr_cd.value=("'" + ComReplaceStr(comboObj.GetSelectCode(), ",", "', '") + "'");
            }
        }
    }*/
    //2018.10.19 Modify SR0014136 AOC - JOO - TDR Inquiry missing several carriers
    function oprCdCombo_OnCheckClick(comboObj, index, code) {
    	var formObject=document.form;
        if(index==0) {          
            var bChk=comboObj.GetItemCheck(index);
            if(bChk){
                for(var i=1 ; i < comboObj.GetItemCount() ; i++) {
                    comboObj.SetItemCheck(i,0);
                }
            }
        } else {
            //ALL 이 아닌 다른 Item 체크.
            var bChk=comboObj.GetItemCheck(index);
            if (bChk) {
                comboObj.SetItemCheck(0,0);
            }
        }
        //Combo Item이 전부 Uncheck 일때 자동으로 All 선택이 되도록 한다.
        var checkCnt=0;
        var count = parseInt(comboObj.GetItemCount());
        for(var i = 1 ; i <  count; i++) {
            if(comboObj.GetItemCheck(i)) {
                checkCnt++;
            }
        }
        if(checkCnt == 0) {
            comboObj.SetItemCheck(0,true, null, null, false);
            formObject.opr_cd.value="";
        }else{
        	formObject.opr_cd.value=("'" + ComReplaceStr(comboObj.GetSelectCode(), ",", "', '") + "'");
        }
    }
    
      /**
       * Period NAVI 
       * @param void
       * @return void
       */
       function fnDocClick(){
           var obj=ComGetEvent();
           var formObj=document.form;
           switch(ComGetEvent("name")){
               case "btn_pre_from_back":
                   if (formObj.pre_fr.value != "" ){
                       formObj.pre_fr.value=ComGetDateAdd(formObj.pre_fr.value,"D",-1);
                   }
                   fnFormClear();
                   break;
              case "btn_pre_from_next":
                   if (formObj.pre_fr.value != "" ){
                      formObj.pre_fr.value=ComGetDateAdd(formObj.pre_fr.value,"D",+1);
                   }
                   fnFormClear();
                   break;
              case "btn_pre_to_back":
                  if (formObj.pre_to.value != "" ){
                      formObj.pre_to.value=ComGetDateAdd(formObj.pre_to.value,"D",-1);
                  }
                  fnFormClear();
                  break;
              case "btn_pre_to_next":
                  if (formObj.pre_to.value != "" ){
                      formObj.pre_to.value=ComGetDateAdd(formObj.pre_to.value,"D",+1);
                  }
                  fnFormClear();
                  break;
              
           }
       }
       function getCOM_ENS_081_1(aryPopupData){
           with(document.form){
                 rlane_cd.value=aryPopupData[0][3];
           }
       }
        /**
         * <pre>
         *     KeyPress Event of form Element.
         *
         * </pre>
         * @return
         */
        function fnObjKeyPress(){
            var obj=ComGetEvent();
            var formObj=document.form;
            var attr=obj.getAttribute("dataformat");
            switch (attr){
                case  'ymd':
                      ComKeyOnlyNumber( obj );
                      break;
                case  'engup':
                      ComKeyOnlyAlphabet( 'upper' );
                      break;
                case  'uppernum':
                       ComKeyOnlyAlphabet( 'uppernum' );
                       break;
            }
        }
           /**
            * <pre>
            *     input validation,
            *     focus out.
            * </pre>
            *
            * @return void
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
           skd_dir_cd.SetSelectCode("");
           if( sheetObjects[0].RowCount()> 0) {
               sheetObjects[0].RemoveAll();
           }
       }
     function fnObjKeyUp(){
         var formObj=document.form;
         var obj=ComGetEvent();
         switch(ComGetEvent("name")){
               case  'skd_dir_cd':
                     if( sheetObjects[0].RowCount()> 0) {
                         sheetObjects[0].RemoveAll();
                     }
                     break;
               case  'rlane_cd':
                     skd_dir_cd.SetSelectCode("");
                     if( sheetObjects[0].RowCount()> 0) {
                           sheetObjects[0].RemoveAll();
                     }
                     var maxlength=obj.getAttribute("maxlength");
                     if( obj.value.length != maxlength   ){
                         return;
                     }else{
                         doActionIBSheet( sheetObjects[0], formObj, IBSEARCH_ASYNC01);
                     }
                     break;
         }
     }
     /**
      * handling process for input validation
      */
     function validateForm(sheetObj,formObj,sAction){
         switch(sAction){
                 case IBSEARCH:
                     if(!ComChkValid(  formObj )){
                         return false;
                     }
                     break;
         }
         return true;
     }

     function skd_dir_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode)
     {
      form.skd_dir_cd_text.value = skd_dir_cd.GetText(parseInt(newIndex), 0);
     }
/* 	function skd_dir_cd_OnBlur() {
    	 document.form.skd_dir_cd_text.value = skd_dir_cd.GetText(parseInt(skd_dir_cd.GetSelectIndex()), 0);
    }
*/
     
     function resizeSheet(){
    	    ComResizeSheet(sheetObjects[0], 60);
    	}
     
