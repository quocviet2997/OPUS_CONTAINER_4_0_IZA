/*=========================================================
 *Copyright(c) 2014 CyberLogitec. All Rights Reserved.
 *@FileName : fns_joo_0039.jsp
 *@FileTitle: Monthly Clearance Status by Carrier & Lane
 *@author   : CLT
 *@version  : 1.0
 *@since    : 2014/06/18
 =========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
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
      var formObj=document.form;
     try {
         var srcName=ComGetEvent("name");
		if(ComGetBtnDisable(srcName)) return false;
         switch(srcName) {
             case "btn1_Retrieve":
                 doActionIBSheet(sheetObjects[0],formObj,IBSEARCH); 
                 break;
             case "btn1_New":
                 doActionIBSheet(sheetObjects[0],formObj,IBRESET);  
                 break;
             case "btn1_Down_Excel":
                 //sheetObjects[1].Down2Excel(0, false,false,true,"","",false,false,"sheet1", true);
                  /*var rev_dir_cd_nm="";
                  if(  formObj.rev_dir_cd[0].checked == true){//0:R 
                      rev_dir_cd_nm="REVENUE";  
                  }else if(  formObj.rev_dir_cd[1].checked == true){//1:E
                      rev_dir_cd_nm="EXPENSE";
                  }
                  var strTitle="Account Month : "+formObj.acct_yrmon.value+"    Carrier : "+jo_crr_cd.GetSelectCode()+"    R/E : "+rev_dir_cd_nm;
                  sheetObjects[1].SetMergeCell(0, 1, 1, 9);
                  sheetObjects[1].SetCellValue(0,1,strTitle);
                  sheetObjects[1].SetRowHidden(0,0);
                  */
                  if(sheetObject1.RowCount() < 1){//no data
              		 ComShowCodeMessage("COM132501");
     	       	  }else{
     	       		sheetObjects[1].Down2Excel({ HiddenColumn:1 , Merge:1});
     	       		 //sheetObjects[1].Down2Excel({ HiddenColumn:-1});
     	       	  }	                    
                  //sheetObjects[1].SetRowHidden(0,1);
                 break;
             case "btn_next":
                 if (formObj.acct_yrmon.value != "" ){
                     formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",+1).substring(0,7);    
                 }
                 fnGridClear();                
                 if( jo_crr_cd.GetSelectCode()== "" ){
//                         formObj.jo_crr_cd.focus();
                 }
                 break;
            case "btn_back":
                 if (formObj.acct_yrmon.value != "" ){
                    formObj.acct_yrmon.value=ComGetDateAdd(formObj.acct_yrmon.value+"-01","M",-1).substring(0,7);    
                 }
                 fnGridClear();                   
                 if( jo_crr_cd.GetSelectCode()== "" ){
//                         formObj.jo_crr_cd.focus();
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
  * loading HTML Control event <br>
  * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
  * @param {ibsheet} sheetObj    IBSheet Object
  * @param {int}     sheetNo     sequence number in sheetObjects array
  **/
 function initControl() {
     var formObj=document.form;
     //axon_event.addListener    ('click',   'fnDocClick', "btn_back"  );         
     //axon_event.addListener    ('click',   'fnDocClick', "btn_next"  );  
     //axon_event.addListenerForm    ('keypress',   'fnObjKeyPress', formObj );     
     //axon_event.addListenerForm    ('click',     'fnObjClick'  , formObj );            
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
     doActionIBSheet(sheetObjects[sheetObjects.length - 1 ],document.form, SEARCH01);
 }
  /**
   * setting Combo basic info
   * @param comboObj 
   * @param comboIndex Number
   */
  function initCombo(comboObj, comboNo ) {
      var formObj=document.form
      switch(comboObj.options.id) {  
          case "jo_crr_cd":  
             with (comboObj) { 
                 SetMultiSelect(0);
                 SetUseAutoComplete(1);
                 SetColAlign(0, "left");
                 SetDropHeight(160);
                 ValidChar(2,1);
                 SetMaxLength(3);
              }  
              break; 
          case "trd_cd":  
              with (comboObj) { 
                  SetMultiSelect(0);
                  SetUseAutoComplete(1);
                  SetColAlign(0, "left");
                  SetDropHeight(160);
                  ValidChar(2,1);
                  SetMaxLength(3);
               }  
               break; 
      } 
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
            
             var HeadTitle="|Lane|CFM";

             SetConfig( { SearchMode:2, MergeSheet:7, Page:20, DataRowMerge:0 } );

             var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
             var headers = [ { Text:HeadTitle, Align:"Center"} ];
             InitHeaders(headers, info);

             var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		                  {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                  {Type:"CheckBox",  Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:"cfm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
              
             InitColumns(cols);
             SetEditable(1);
//               SetSheetHeight(500);
             resizeSheet();
             
         }
             break;
         case 2:      // sheet1 init
         with (sheetObj) {
            
                 var HeadTitle="ITEM|CUR.|LANE|VVD|BSA|Price|Amount|Remark|ITEM";

                 SetConfig( { SearchMode:0, MergeSheet:1, Page:20, DataRowMerge:0 } );

                 var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:0 };
                 
                 //var headers = [ { Text:HeadTitle2, Align:"Center"},
                  //         { Text:HeadTitle, Align:"Center"} ];
                 var headers = [ { Text:HeadTitle, Align:"Center"} ];
                 InitHeaders(headers, info);

                 var cols = [ {Type:"Text",      Hidden:0,  Width:150,  Align:"Left",    ColMerge:1,   SaveName:"jo_stl_itm_cd_nm",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     //{Type:"Text",      Hidden:1, Width:90,   Align:"Left",    ColMerge:0,   SaveName:"sub_sum_nm",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"locl_curr_cd",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"rlane_cd",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:120,   Align:"Center",    ColMerge:0,   SaveName:"vvd",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"bsa_qty",           KeyField:0,   CalcLogic:"",   Format:"NullFloat", 	PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Float",     Hidden:0,  Width:100,   Align:"Right",   ColMerge:0,   SaveName:"bsa_slt_prc",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Float",   	Hidden:0,  Width:120,  Align:"Right",   ColMerge:0,   SaveName:"stl_locl_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:2,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:0,  Width:300,  Align:"Left",    ColMerge:0,   SaveName:"stl_rmk",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
		                     {Type:"Text",      Hidden:1,  Width:90,   Align:"Left",    ColMerge:0,   SaveName:"jo_stl_itm_cd",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
		         
                 InitColumns(cols);
                 SetEditable(0);
//	                 SetSheetHeight(500);
                 resizeSheet();	                 
                 SetCountPosition();	
        }
         break;    
     }
 }
 
 //UI 개선 사항(201407)
function sheet2_OnSearchEnd(sheetObj, ErrMsg) {
   	//Row 강제머지할 셀의 Row Index
    //Col 강제머지할 셀의 Column Index 
    //Rows 강제머지할 셀의 Row 개수
   	//Cols 강제머지할 셀의 Col 개수
   	//ObjId.SetMergeCell(Row, Col, Rows, Cols)
	// Total 정보 셋팅..색상, 폰트 Bold
	// Total 종류 : Subtotal : EUR -> ITEM,LANE, CUR, Subtotal : 1.Other -> ITEM CUR, Total : CUR 
	
	var backColor1 = "#F7E1EC";
	var fontColor1 = "#0054FF";
	var backColor2 = "#F7E1EC";
	var fontColor2 = "#0054FF";
	var backColor3 = "#C9D5EB";
	var fontColor3 = "#0054FF";
	
	with (sheetObj) {
	   	var str = "";
		var iStartRow = HeaderRows();
		var iEndRow = LastRow();
		
		for(var i = iStartRow; i <= iEndRow; i++){
		   var jo_stl_itm_cd_nm = GetCellText(i,"jo_stl_itm_cd_nm");   // ITM 항목 읽기
		   var rlane_cd 		= GetCellText(i,"rlane_cd");   // LANE 항목 읽기
		   var vvd 				= GetCellText(i,"vvd");   // VVD 항목 읽기
		   	   
		   if("Total" == jo_stl_itm_cd_nm){
			   SetMergeCell(i,2,1,4); // 5칸 머지
			   
			   SetRowBackColor(i, backColor1);
			   SetCellFontColor(i, "jo_stl_itm_cd_nm"	, fontColor1);
			   SetCellFontColor(i, "locl_curr_cd"		, fontColor1);
			   SetCellFontColor(i, "stl_locl_amt"		, fontColor1);
			   
			   SetCellFontBold(i,"jo_stl_itm_cd_nm");
			   SetCellFontBold(i,"locl_curr_cd");
			   SetCellFontBold(i,"stl_locl_amt");
		   }else if("Total" == vvd){  //Subtotal : EUR
			   //SetCellValue(i,"locl_curr_cd","",0);
			   //SetCellValue(i,"rlane_cd","",0);
			   
			   SetMergeCell(i,4,1,2); // 5칸 머지
			   
			   SetCellBackColor(i, "vvd"			, backColor2);
			   SetCellBackColor(i, "bsa_qty"		, backColor2);
			   SetCellBackColor(i, "bsa_slt_prc"	, backColor2);
			   SetCellBackColor(i, "stl_locl_amt"	, backColor2);
			   SetCellBackColor(i, "stl_rmk"		, backColor2);
			   
			   SetCellFontColor(i, "vvd"			, fontColor2);
			   SetCellFontColor(i, "stl_locl_amt"	, fontColor2);
			   
			   SetCellFontBold(i,"vvd");
			   SetCellFontBold(i,"stl_locl_amt");
		   }else if("Total" == rlane_cd){//Subtotal : 1.Other
			   //SetCellValue(i,"locl_curr_cd","",0);
			   
			   SetMergeCell(i,3,1,3); // 5칸 머지
			   //SetMergeCell(i,2,1,4); // 5칸 머지			   

			   SetCellBackColor(i, "rlane_cd"		, backColor3);
			   SetCellBackColor(i, "vvd"			, backColor3);
			   SetCellBackColor(i, "bsa_qty"		, backColor3);
			   SetCellBackColor(i, "bsa_slt_prc"	, backColor3);
			   SetCellBackColor(i, "stl_locl_amt"	, backColor3);
			   SetCellBackColor(i, "stl_rmk"		, backColor3);
			   
			   SetCellFontColor(i, "rlane_cd"		, fontColor3);
			   SetCellFontColor(i, "stl_locl_amt"	, fontColor3);
			   
			   SetCellFontBold(i,"rlane_cd");
			   SetCellFontBold(i,"stl_locl_amt");
		   }
		   
		}
	}
}     
     
   // handling sheet process
 function doActionIBSheet(sheetObj,formObj,sAction) {
     sheetObj.ShowDebugMsg(false);
     switch(sAction) {
          case SEARCH01:      //retrieve  
               formObj.f_cmd.value=SEARCH01;            
               var param=FormQueryString(formObj);
                var sXml=sheetObj.GetSearchData("FNS_JOO_0039GS.do", param);
               ComXml2ComboItem( sXml, jo_crr_cd, "code","code" );
               break;      
          case IBSEARCH:      //retrieve
               if( !validateForm(sheetObj,formObj,sAction) ){return;}
               formObj.f_cmd.value=SEARCHLIST01;            
               var param=FormQueryString(formObj);  
                sheetObj.DoSearch("FNS_JOO_0039GS.do", param );
               if( sheetObjects[1].RowCount()> 0) {
                   sheetObjects[1].RemoveAll();
               } 
               break;
          case SEARCHLIST02:     
              formObj.f_cmd.value=SEARCHLIST02;            
              var sParam=ComGetSaveString(sheetObjects[0]);
              if( sParam == ""){ return;}
              sParam +="&"+FormQueryString(formObj);
              sheetObj.DoSearch("FNS_JOO_0039GS.do", sParam );
              //sheetObj.ShowSubSum("sub_sum_nm", "stl_locl_amt" );JO_STL_ITM_CD_NM
              //var info = [{StdCol:"jo_stl_itm_cd_nm", SumCols:"stl_locl_amt",ShowCumulate:0,Sort:0}
      	      //            ,{StdCol:"locl_curr_cd", SumCols:"stl_locl_amt",ShowCumulate:0,Sort:0, CaptionCol:2}];
      	   	  //mySheet.ShowSubSum(info);
              //sheetObj.ShowSubSum(info);
              //sheetObj.ShowSubSum([{StdCol:"jo_stl_itm_cd_nm|locl_curr_cd", SumCols:"stl_locl_amt"}]);
             // sheetObj.FitColWidth();
              break;                     
          case IBSAVE:        //save
               break;
          case IBSEARCH_ASYNC01:      //Trade Combo List
              formObj.f_cmd.value=SEARCHLIST06;            
              var super_cd1=jo_crr_cd.GetSelectText();
              var param=FormQueryString(formObj)+"&super_cd1="+super_cd1;
               var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
              ComXml2ComboItem( sXml, trd_cd, "code","code" );
              break;    
          case IBRESET:      //NEW button  
              fnBtnNew();
              break;                  
     }
 }
 /**
  * handling process for input validation
  */
 function validateForm(sheetObj,formObj,sAction){
	 switch ( sAction ) {
     case IBSEARCH:
         if (formObj.acct_yrmon.value.length == 0){
             ComShowCodeMessage('JOO00033');
             return false;
         }
         if (jo_crr_cd.GetSelectIndex() == -1){
             ComShowCodeMessage('JOO00008');
             return false;
         }
         if (trd_cd.GetSelectIndex()== -1){
             ComShowCodeMessage('JOO00009');
             return false;
         }
         break;
	 }
     return true;
 }
/************************************** Object EVENT FUNCTION ********************************************************/
 /**
  * 
  * <pre>
  *      clearing sheet2 in case of not changing Lane Code Grid
  * </pre>
  *
  * @param   
  * @return
  * @author jang kang cheol
  */
 function sheet1_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
      var formObj=document.form;
      doActionIBSheet(sheetObjects[1],formObj,SEARCHLIST02);
      if( sheetObjects[0].RowCount("U") == 0 ){
          if( sheetObjects[1].RowCount()> 0) {
              sheetObjects[1].RemoveAll();
          } 
      }
 }
/**
 * 
 * <pre>
 *     Sheet2 DblClick event
 * </pre>
 *
 * @param   sheetObj 
 * @param   Row
 * @param   Col
 * @return  void
 * @author  jang kang cheol
 */
function sheet2_OnDblClick(sheetObj, Row, Col ){
	var value=sheetObj.GetCellValue(Row,Col);
    if(value == ""){return;}
    if( sheetObj.ColSaveName(Col) == "stl_rmk"){
        ComShowMemoPad(sheetObj, Row, Col, true);
    }
}
 /**
 * Carrier Code combo OnChange event
 * @param comboObj
 * @param value
 * @param text
 * @return
 */
function jo_crr_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
    var formObj=document.form;
    if( formObj.jo_crr_cd.value != ""){
         trd_cd.RemoveAll();
         fnGridClear();            
    }
    
    trd_cd_OnFocus(comboObjects[1]);
}

 function trd_cd_OnFocus(comboObj) {
     var formObj=document.form;
     if(jo_crr_cd.GetSelectCode()==""){return;}
     if (comboObj.GetItemCount()== 0) {
         comboObj.SetEnable(0);
         doActionIBSheet(sheetObjects[ sheetObjects.length-1 ],formObj,IBSEARCH_ASYNC01);
         comboObj.SetEnable(1);
     }
 }
 /**
 * Trade Code combo OnChange event
 * @param comboObj
 * @param value
 * @param text
 * @return
 */
function trd_cd_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode) {
    var formObj=document.form;
    if( formObj.trd_cd.value != ""){
         fnGridClear();    
    }
}     
//    function sheet2_OnSearchEnd(sheetObj, ErrMsg) {
//        var formObj = document.form;
//        var TITLE_GB = "";
//
//        for(var i=2;i<sheetObj.RowCount(); i++ ){
//            var row = 0;
//            if( TITLE_GB != sheetObj.CellValue(i, "jo_stl_itm_cd") ){
//                var tmpTitle =  sheetObj.CellValue(i, "jo_stl_itm_cd_nm");
//                row = sheetObj.DataInsert(i-1);   //빈Row 만들기. 
//                if(  sheetObj.CellValue(row+1, "jo_stl_itm_cd") == "S/H"){
//                    sheetObj.CellValue(row, "sub_sum_nm")       =   sheetObj.CellValue(row+1, "sub_sum_nm");             
//                }
//                //OUS : Over Used Slot Hire  or R/F : Reefer Surcharge
//                if(  sheetObj.CellValue(row+1, "jo_stl_itm_cd") == "OUS"){
//                    sheetObj.CellValue(row, "jo_stl_itm_cd_nm") =   sheetObj.CellValue(row+1, "jo_stl_itm_cd_nm").trim().substring(0,2)+" Over Used Slot Hire";
//                    sheetObj.CellValue(row, "sub_sum_nm")       =   sheetObj.CellValue(row+1, "sub_sum_nm");
//                }else if(  sheetObj.CellValue(row+1, "jo_stl_itm_cd")== "R/F"){
//                    sheetObj.CellValue(row, "jo_stl_itm_cd_nm" ) = sheetObj.CellValue(row+1, "jo_stl_itm_cd_nm").trim().substring(0,2)+" Reefer Surcharge";
//                    //sheetObj.CellValue(row, "jo_stl_itm_cd")    =  "R/F";
//                    sheetObj.CellValue(row, "sub_sum_nm")       =   sheetObj.CellValue(row+1, "sub_sum_nm");
//                }else{
//                    sheetObj.CellValue(row, "jo_stl_itm_cd_nm") = tmpTitle;
//                }
//                TITLE_GB = sheetObj.CellValue(row+1, "jo_stl_itm_cd");                
//            }     
// 
//        }
//    }        
/**************************************USER FUNCTION *****************************************************/
/**
 * NEW button
 * @param    void
 * @return   void
 */    
 function fnBtnNew(){
     var formObj=document.form;
    jo_crr_cd.SetSelectText("",false);
   //  formObj.jo_crr_cd.Text2 = formObj.jo_crr_cd.GetIndexText(0, 0); 
    // comboObjects[0].Index2 = "0";
     trd_cd.SetSelectText("",false);
     formObj.rev_dir_cd.value="";
     formObj.acct_yrmon.value=yyyyMM; 
     fnGridClear();       
 }
 /**
  * 
  * <pre>
  *    Grid Clear
  * </pre>
  *
  * @param   void
  * @return  void
  * @author jang kang cheol
  */
function fnGridClear(){
	if( sheetObjects[0].RowCount()> 0) {
        sheetObjects[0].RemoveAll();
    }
    if( sheetObjects[1].RowCount()> 0) {
        sheetObjects[1].RemoveAll();
    }  
}


function resizeSheet(){
	for(var i=0;i<sheetObjects.length;i++){
        ComResizeSheet(sheetObjects[i]);
	}
}