var sheetObjects=new Array();
var sheetCnt=0;
var colCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var iPageNo = 1;
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var gCurRow = 0;
var prefix = "";
var arrPrefix = new Array("t1sheet1_", "t2sheet1_", "t3sheet1_", "t4sheet1_", "tpszsheet_", "voidsheet_");
var iSheetHeight = "200";
var gSheetGap = 35;

var defaultTpszXml = "";
defaultTpszXml += "<SHEET>";
defaultTpszXml += "<DATA COLORDER='t1sheet1_ibflag|t1sheet1_pagerows|t1sheet1_ppt_cd|t1sheet1_line_seq|t1sheet1_src_tpsz|t1sheet1_tgt_normal_tpsz|t1sheet1_tgt_rad_tpsz|t1sheet1_tgt_empty_tpsz|t1sheet1_lane|t1sheet1_teu_cnt|t1sheet1_or_yn|t1sheet1_ol_yn|t1sheet1_oh_yn|t1sheet1_void_cnt|t1sheet1_option_a|t1sheet1_option_b|t1sheet1_del_flg|t1sheet1_slan_cd|t1sheet1_cre_usr_id|t1sheet1_dft_tpsz_group|t1sheet1_dft_tpsz|t1sheet1_dft_teu_cnt|t1sheet1_dft_rf_plug_flg|' COLSEPARATOR='☜☞' TOTAL='23'>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞1☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞20☜☞1☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞2☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞20FR☜☞1☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞3☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞20RF☜☞1☜☞Y]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞4☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞5☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40FR☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞6☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40RF☜☞2☜☞Y]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞7☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40RH☜☞2☜☞Y]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞8☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40HC☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞9☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞45☜☞3☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞10☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞20OD☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞11☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞20OT☜☞1☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞12☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40OT☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞13☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞F☜☞40OD☜☞4☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞14☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞20☜☞1☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞15☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞20FR☜☞1☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞16☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞40☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞17☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞40FR☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞18☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞40HC☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞19☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞45☜☞3☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞20☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞20OD☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞21☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞20OT☜☞1☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞22☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞40OT☜☞2☜☞N]]></TR>";
defaultTpszXml += "	<TR><![CDATA[☜☞☜☞DEFAULT TPSZ☜☞23☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞☜☞E☜☞40OD☜☞4☜☞N]]></TR>";
defaultTpszXml += "</DATA>";
defaultTpszXml += "</SHEET>";

var defaultVoidXml = "";
defaultVoidXml += "<SHEET>";
defaultVoidXml += "<DATA COLORDER='voidsheet_ibflag|voidsheet_pagerows|voidsheet_ppt_cd|voidsheet_slan_cd|voidsheet_line_seq|voidsheet_or_yn|voidsheet_ol_yn|voidsheet_oh_yn|voidsheet_void_cnt|' COLSEPARATOR='☜☞' TOTAL='8'>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞1☜☞N☜☞N☜☞N☜☞0]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞2☜☞N☜☞N☜☞Y☜☞1]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞3☜☞N☜☞Y☜☞N☜☞1]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞4☜☞N☜☞Y☜☞Y☜☞3]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞5☜☞Y☜☞N☜☞N☜☞1]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞6☜☞Y☜☞N☜☞Y☜☞3]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞7☜☞Y☜☞Y☜☞N☜☞2]]></TR>";
defaultVoidXml += "	<TR><![CDATA[☜☞☜☞VOID CONVERSION☜☞☜☞8☜☞Y☜☞Y☜☞Y☜☞5]]></TR>";
defaultVoidXml += "</DATA>";
defaultVoidXml += "</SHEET>";

var gDftLadenComboCode="";
var gDftEmptyComboCode="";

document.onclick=processButtonClick;

function processButtonClick(){
	/**********/
	var sheetObj=getCurrentSheet();
	/*******************************************************/
	var formObject=document.form;
	try {
		var srcObj=window.event.srcElement;
		var srcName=ComGetEvent("name");
		prefix = sheetObj.id+"_";
		switch(srcName) {
	        case "btn_Retrieve":
	        	doActionIBSheet(sheetObj,document.form,IBSEARCH);
	            break;
	        case "btn_DownExcel":
        		var data = [];	    			

    			if(sheetObjects[0].RowCount() >= 0){
     				data.push(sheetObjects[0].Down2Excel({DownCols:"2|3|4|5|6", DebugMode:1, HiddenColumn:1, Merge:1, AutoSizeColumn: 0, SheetName:"Default TP/SZ"}));
    			}    			
    			if(sheetObjects[1].RowCount() >= 0){
     				data.push(sheetObjects[1].Down2Excel({DownCols:"2|3|4|5|6", DebugMode:1, HiddenColumn:1, Merge:1, AutoSizeColumn: 0, SheetName:"TP/SZ Conversion"}));
    			}
    			if(sheetObjects[2].RowCount() >= 0){
     				data.push(sheetObjects[2].Down2Excel({DownCols:"2|3|4|5", DebugMode:1, HiddenColumn:1, Merge:1, AutoSizeColumn: 0, SheetName:"TEU Conversion"}));
    			}
    			if(sheetObjects[3].RowCount() >= 0){
     				data.push(sheetObjects[3].Down2Excel({DownCols:"2|3|4|5|6|7", DebugMode:1, HiddenColumn:1, Merge:1, AutoSizeColumn: 0, SheetName:"Void Conversion"}));
    			}
    			
    			Grids["g_down2ExcelBuffer"] = data.join("\x03");
    			
    			sheetObjects[0].Down2ExcelBuffer(false);
	            
	            //sheet1.Down2Excel( {DownCols: makeHiddenSkipCol(sheet1), SheetDesign:1,Merge:1 });
	            break;
	        case "btn_New":
                doActionIBSheet(sheetObj,formObject,IBRESET); 
	        	break;
    	 	case "btn_Save":
    	 		doActionIBSheet(sheetObj,formObject,IBSAVE);
 				break;
			case "btn1_pop_lane":
                ComOpenPopup("/opuscntr/COM_ENS_081.do", 820, 460, "getCOM_ENS_081", "1,0,1,1,1", true);
			break;
 			
 			//Default TP/SZ Tab
			case "btn_t1Add":
				setDefaultTpszAdd(sheetObj);
				//sheetObj.DataInsert(-1);
				//createSeq(sheetObj, prefix+"line_seq");
				break;
			case "btn_t1Ins":
				//sheetObj.DataInsert();
				//createSeq(sheetObj, prefix+"line_seq");				
				break;
			case "btn_t1Del":
				setDefaultTpszDel(sheetObj);
				//setDefaultTpszDelRow(sheetObj);				
				break;
				
 			
 			// TP/SZ Tab
			case "btn_t2Add":
				sheetObj.DataInsert(-1);
				createSeq(sheetObj, prefix+"line_seq");
				break;
			case "btn_t2Ins":
				sheetObj.DataInsert();
				createSeq(sheetObj, prefix+"line_seq");				
				break;
			case "btn_t2Del":
				setTpszDelRow(sheetObj);				
				break;
				
			// TEU Tab
			case "btn_t3Add":
				//1 Row를 Insert 하고 입력된 slan_cd 를 체크 후에 Default Hidden tpsz Sheet Row 만큼 생성한다.
				sheetObj.DataInsert(-1);
				//createSeq(sheetObj, prefix+"line_seq");
				break;
			case "btn_t3Del":
				//체크된 slan_cd 을 모두 찾아서 그룹으로 Delete 한다.
				setTeuDelLane(sheetObj);
				//JooRowHideDelete(sheetObj, prefix+"del_chk");
				//createSeq(sheetObj, prefix+"line_seq");
				break;
				
			// Void Tab
			case "btn_t4Add": //Add Lane
				//1 Row를 Insert 하고 입력된 slan_cd 를 체크 후에 Default Hidden Void Sheet Row 만큼 생성한다.
				sheetObj.DataInsert(-1);
				break;
			case "btn_t4Del": //Del Lane
				//체크된 slan_cd 을 모두 찾아서 그룹으로 Delete 한다.
				setVoidDelLane(sheetObj);
				break;
				
			case "btn_Close":
				comPopupOK();
				//ComClosePopup(); 
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
 * Returning activated sheet
 * @return sheetObj
 */
function getCurrentSheet(){
	var sheetObj=null;
	if(beforetab == 0){
		sheetObj=sheetObjects[0];
	}else if(beforetab == 1){
		sheetObj=sheetObjects[1];
	}else if(beforetab == 2){
		sheetObj=sheetObjects[2];
	}else{
		sheetObj=sheetObjects[3];
	}
	
	return sheetObj;
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
	for(var k=0;k<tabObjects.length;k++){
        initTab(tabObjects[k],k+1);
        tabObjects[k].SetSelectedIndex(0);
    }
	//tabObjects[0].SetSelectedIndex(0);
    for(var i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        //sheetObjects[i].SetWaitImageVisible(0);
        ComEndConfigSheet(sheetObjects[i]);
    }
    
    
    initControl();
    doActionIBSheet(sheetObjects[1],document.form,IBSEARCH);
    
}
 /**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
    var form=document.form;
/*    axon_event.addListenerForm('change', 'obj_change', form);
    
    $(document.form.vsl_cd).on('blur', function(){
		obj_change();
	});*/
    sheetObjects[0].LoadSearchData(defaultTpszXml);
    sheetObjects[5].LoadSearchData(defaultVoidXml);
}
/**
 * registering IBTab Object as list
 * adding process for list in case of needing batch processing with other items
 * defining list on the top of source
 */
function setTabObject(tab_obj){
    tabObjects[tabCnt++]=tab_obj;
}
/**
 * initializing Tab
 * setting Tab items
 */
function initTab(tabObj , tabNo) {
     switch(tabNo) {
         case 1:
            with (tabObj) {
                var cnt=0 ;
                InsertItem( "Format Setup" , "");
                InsertItem( "TP/SZ" , "");
                InsertItem( "TEU" 	, "");
                InsertItem( "Void" 	, "");
            }
         break;
     }
}
/**
 * Event when clicking Tab
 * activating selected tab items
 */
function tab1_OnChange(tabObj , nItem)
{
	sheetObjects[nItem].RenderSheet(0);
	
	var objs=document.all.item("tabLayer");
	objs[nItem].style.display="inline";
	objs[beforetab].style.display="none";
	//--------------- important --------------------------//
	objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
	//------------------------------------------------------//
	beforetab=nItem;
	
	if(beforetab == 1){//TP/SZ Tab Selected
		setDefaultTpszCombo(sheetObjects[0]);//Default TP/SZ Data 기준으로 Combo Item 생성.
	}else if (beforetab == 2) {//TEU Tab Selected
		setDefaultTpszCombo(sheetObjects[0]);
		setMakeTeuTpsz();
    }
	
	resizeSheet();
	sheetObjects[nItem].RenderSheet(1);
}

/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj,sheetNo) {
    var cnt=0;
    var formObj=document.form;
    var sheetID=sheetObj.id;
	var prefix=sheetID + "_";
    
    switch(sheetNo) {
		case 1:
			with (sheetObj) {
				
			    var HeadTitle  ="|Sel|Seq.|Laden/Empty|Default\nTP/SZ|Default\nTEU|Defalut\nRF Plug";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:50,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"CheckBox", Hidden:1,   Width:50,  Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
			              {Type:"Text",     Hidden:0, 	Width:50,  Align:"Center",	ColMerge:0,   SaveName:prefix+"line_seq"			,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Combo",    Hidden:0,  	Width:100, Align:"Center", 	ColMerge:0,   SaveName:prefix+"dft_tpsz_group"		,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0,	EditLen:1 },
			              {Type:"Text",     Hidden:0,  	Width:100, Align:"Center", 	ColMerge:0,   SaveName:prefix+"dft_tpsz"			,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0,	EditLen:5 },
			              {Type:"Float",    Hidden:0,  	Width:70,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"dft_teu_cnt"			,KeyField:0,   CalcLogic:"",   Format:"Float" 	,	PointCount:2,   UpdateEdit:1,   InsertEdit:1,	EditLen:8, DefaultValue:"1" },
			              {Type:"Combo",    Hidden:0,  	Width:70,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"dft_rf_plug_flg"		,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:1,   InsertEdit:1,	EditLen:1, DefaultValue:"N" }];
			     
			    InitColumns(cols);
		
			    //SetCountFormat("[SELECTDATAROW / TOTALROWS]");

				SetColProperty(0, prefix+"dft_tpsz_group"	, {ComboText:"|Laden|Empty", ComboCode:"|F|E"} );
			    SetColProperty(0, prefix+"dft_rf_plug_flg" 	, {ComboText:"|Yes|No", ComboCode:"|Y|N"} );
			    SetColProperty(0, prefix+"dft_tpsz" 		, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    
			    //SetSheetHeight(iSheetHeight);
			    
			    SetEditable(true);
			    //ComResizeSheet(sheetObj);
			}
			break;
		case 2:
			with (sheetObj) {
				
			    var HeadTitle  ="|Sel|Seq.|TP/SZ in\nBay Plan|Full|Full|Empty";
			    var HeadTitle1 ="|Sel|Seq.|TP/SZ in\nBay Plan|Normal|if RAD|Empty";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"}, { Text:HeadTitle1, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:50,  Align:"Center",  ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"CheckBox", Hidden:0,   Width:50,  Align:"Center",  ColMerge:0,   SaveName:prefix+"del_chk" },
			              {Type:"Text",     Hidden:1, 	Width:50,  Align:"Center",	ColMerge:0,   SaveName:prefix+"line_seq"		,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:70,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"src_tpsz"		,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:1,	EditLen:4 },
			              {Type:"Combo",    Hidden:0,  	Width:70,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"tgt_normal_tpsz"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:1,   InsertEdit:1,	EditLen:5 },
			              {Type:"Combo",    Hidden:0,  	Width:70,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"tgt_rad_tpsz"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:1,   InsertEdit:1,	EditLen:5 },
			              {Type:"Combo",    Hidden:0,  	Width:70,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"tgt_empty_tpsz"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:1,   InsertEdit:1,	EditLen:10 }];
			     
			    InitColumns(cols);
		
			    //SetCountFormat("[SELECTDATAROW / TOTALROWS]");
			    SetColProperty(0, prefix+"src_tpsz" 		, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    //SetColProperty(0, prefix+"tgt_normal_tpsz" 	, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    //SetColProperty(0, prefix+"tgt_rad_tpsz" 	, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    //SetColProperty(0, prefix+"tgt_empty_tpsz" 	, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    
			    //SetSheetHeight(iSheetHeight);
			    
			    SetEditable(true);
			    //ComResizeSheet(sheetObj);
			    
			    
			}
			break;
		case 3:
			with (sheetObj) {

		    	var HeadTitle  ="|Sel|Lane|Seq.|TP/SZ|TEU";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:50,   Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"CheckBox", Hidden:0,   Width:50,   Align:"Center",     ColMerge:0,   SaveName:prefix+"del_chk" },
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"slan_cd"			,KeyField:0,   CalcLogic:"",   Format:"" 			,	PointCount:0,   UpdateEdit:0,   InsertEdit:1,   EditLen:3 },
			              {Type:"Text",     Hidden:1, 	Width:50,   Align:"Center",		ColMerge:0,   SaveName:prefix+"line_seq"		,KeyField:0,   CalcLogic:"",   Format:"" 			,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Combo",    Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"tgt_normal_tpsz"	,KeyField:0,   CalcLogic:"",   Format:"" 		    ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Float",    Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"teu_cnt"			,KeyField:0,   CalcLogic:"",   Format:"Float" ,	PointCount:2,   UpdateEdit:1,   InsertEdit:1,	EditLen:13 }];
 
			    InitColumns(cols);  
		
			    SetColProperty(0, prefix+"slan_cd" 			, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    //SetColProperty(0, prefix+"tgt_normal_tpsz" 	, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    SetEditable(true);
			    SetSheetHeight(150); 
			}
			break;
		case 4:
			with (sheetObj) {
				
			    var HeadTitle  ="|Sel|Lane|Seq.|OR|OL|OH|VOID";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:50,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"CheckBox", Hidden:0,   Width:50,   Align:"Center",     ColMerge:0,   SaveName:prefix+"del_chk" },
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"slan_cd"	,KeyField:0,   CalcLogic:"",   Format:"" ,  PointCount:0,   UpdateEdit:0,   InsertEdit:1,	EditLen:3 },
			              {Type:"Text",     Hidden:1, 	Width:50,   Align:"Center",		ColMerge:0,   SaveName:prefix+"line_seq",KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"or_yn"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"ol_yn"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"oh_yn"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Int",      Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"void_cnt",KeyField:0,   CalcLogic:"",   Format:"NullInteger" ,	PointCount:0,   UpdateEdit:1,   InsertEdit:1,	EditLen:10 }];
			     
			    InitColumns(cols); 
		
			    SetColProperty(0, prefix+"slan_cd"	, {AcceptKeys:"E|[0123456789]" , InputCaseSensitive:1});
			    SetColProperty(0, prefix+"or_yn" 	, {AcceptKeys:"E" , InputCaseSensitive:1});
			    SetColProperty(0, prefix+"ol_yn" 	, {AcceptKeys:"E" , InputCaseSensitive:1});
			    SetColProperty(0, prefix+"oh_yn" 	, {AcceptKeys:"E" , InputCaseSensitive:1});
			    SetEditable(true);
			    SetSheetHeight(150);
			}
			break;
		case 5:
			with (sheetObj) {
				
			    var HeadTitle  ="|Seq.|TP/SZ";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:0, ColMove:1, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"}];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:0, 	Width:50,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"Seq",      Hidden:0, 	Width:50,    Align:"Center",	ColMerge:0,   SaveName:prefix+"line_seq"},
			              {Type:"Text",     Hidden:0,  	Width:70,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"tgt_normal_tpsz"}];
			     
			    InitColumns(cols);
			    SetEditable(false);
			    SetSheetHeight(150);
			}
			break;
		case 6:
			with (sheetObj) {
				
			    var HeadTitle  ="|Sel|Lane|Seq.|OR|OL|OH|VOID";
			    
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:5, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:0, ColMove:0, HeaderCheck:1, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:50,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"CheckBox", Hidden:0,   Width:50,   Align:"Center",     ColMerge:0,   SaveName:prefix+"del_chk" },
			              {Type:"Text",     Hidden:0,  	Width:50,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"slan_cd"	,KeyField:0,   CalcLogic:"",   Format:"" ,	EditLen:3 },
			              {Type:"Text",     Hidden:0, 	Width:50,   Align:"Center",		ColMerge:0,   SaveName:prefix+"line_seq",KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			              {Type:"Text",     Hidden:0,  	Width:50,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"or_yn"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"ol_yn"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"oh_yn"	,KeyField:0,   CalcLogic:"",   Format:"" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0},
			              {Type:"Int",      Hidden:0,  	Width:50,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"void_cnt",KeyField:0,   CalcLogic:"",   Format:"NullInteger" ,	PointCount:0,   UpdateEdit:0,   InsertEdit:0}];
			     
			    InitColumns(cols);
			    SetEditable(false);
			    SetSheetHeight(150);
			}
			break;
			
    }
 }
 
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    var prefix=sheetObj.id+"_";
    switch(sAction) {
        case    IBSEARCH:      //retrieve
            if( !validateForm(sheetObj,formObj,sAction) ){return;}
            formObj.f_cmd.value=SEARCH;
        	var aryPrefix = new Array("t1sheet1_", "t2sheet1_", "t3sheet1_", "t4sheet1_", "tpszsheet_"); // prefix
            var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
			sheetObj.SetWaitImageVisible(1);
			ComOpenWait(true);
			iPageNo = 1;
			var sXml=sheetObj.GetSearchData("FNS_JOO_0086GS.do", sParam);
			var arrXml = sXml.split("|$$|");
			for ( var inx = 0; inx < arrXml.length; inx++) { 
				sheetObjects[inx].LoadSearchData(arrXml[(inx)], { Sync : 1 });
			}
			
            break; 
		case IBRESET:
			initSearchReset(sheetObj);
			break;
		case IBROWSEARCH:
			formObj.f_cmd.value=SEARCH07;
			var code=formObj.slan_cd.value;
            var param=FormQueryString(formObj)+"&code="+code;
            var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
            var rowCnt=ComGetTotalRows( sXml );
            if(rowCnt <= 0){
            	ComShowCodeMessage("JOO00203");
				sheetObj.SetCellValue(gCurRow, prefix+"slan_cd","",0);
            }			
			break;
		case IBSEARCH_ASYNC01:
			formObj.f_cmd.value=SEARCH07;
			var code=formObj.slan_cd.value;
            var param=FormQueryString(formObj)+"&code="+code;
            var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
            var rowCnt=ComGetTotalRows( sXml );
            if(rowCnt <= 0){
            	ComShowCodeMessage("JOO00203");
            	formObject.slan_cd.value = "";
            	ComSetFocus(formObject.slan_cd);
				return false;
            }			
			break;
		case IBSAVE:
			if(!validateForm(sheetObj,formObj,sAction))  return true;
			formObj.f_cmd.value=MULTI;
			var SaveStr=ComGetSaveString(sheetObjects, true, true);
			if (SaveStr == ""){
				ComShowCodeMessage('JOO00036');
				return;
			}
			if (!ComShowCodeConfirm('JOO00046')){
				return;
			}
			
			sheetObj.SetWaitImageVisible(0);
			ComOpenWait(true);
			//3.Binding Form Data in QueryString
			var sParam = SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(arrPrefix);
			
			ComOpenWait(true);
			//4. Sending request to server, and get response
			var sXml=sheetObj.GetSaveData("FNS_JOO_0086GS.do", sParam);
			var arrXml = sXml.split("|$$|");
			if (ComGetEtcData(arrXml[0], "TRANS_RESULT_KEY") == "S"){
				ComShowCodeMessage("COM130102", "Data");				

				for ( var inx = 0; inx < arrXml.length; inx++) { 
					sheetObjects[inx].LoadSearchData(arrXml[(inx)], { Sync : 1 });
				}
			}
			ComOpenWait(false);
			
			break;
    }
}


function getCheckDuplication(sheetObj, chkValue, flag){
	var sheetID=sheetObj.id;
	var prefix = sheetID + "_";
	var iDup = 0;
	switch(sheetID){
		case "t1sheet1":
			//체크 데이타를 포함하기 때문에 1보다 크면 Dup
			//flag : F : Laden , E : Empty
			for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow() ; i++){
				var tmpDftTpszGroup 	= sheetObj.GetCellValue(i, prefix+"dft_tpsz_group");
				var tmpDftTpsz 			= sheetObj.GetCellValue(i, prefix+"dft_tpsz");
				if(flag == tmpDftTpszGroup && tmpDftTpsz == chkValue && (sheetObj.GetRowHidden(i) == false)){
					iDup++;
				}
			}
			if(iDup > 1){
				return true;
			}
			break;
		case "t2sheet1":
			break;
		case "t3sheet1":
			//체크 데이타를 포함하지 않기 때문에 0 보다 크면 Dup
			for(var j = sheetObj.HeaderRows() ; j <= sheetObj.LastRow(); j++){
				var tmpChkSlanCd 		= sheetObj.GetCellValue(j, prefix+"slan_cd");
				var tmpTgtNormalTpsz 	= sheetObj.GetCellValue(j, prefix+"tgt_normal_tpsz");
				
				if(flag == tmpChkSlanCd && chkValue == tmpTgtNormalTpsz  && (sheetObj.GetRowHidden(j) == false)){
					iDup++;
				}
			}
			if(iDup > 0){
				return true;
			}
			break;
		case "t4sheet1":
			break;
	}
	
	return false;
	
	/*if(iDup > 1){
		return true;
	}else{
		return false;
	}*/
}

function getDefaultTpszTeu(tpsz){
	var teuCnt = "";
	//flag : F : Laden , E : Empty
	for (var i=sheetObjects[0].HeaderRows(); i <= sheetObjects[0].LastRow() ; i++){
		var tmpDftTpszGroup 	= sheetObjects[0].GetCellValue(i, arrPrefix[0]+"dft_tpsz_group");
		var tmpDftTpsz 			= sheetObjects[0].GetCellValue(i, arrPrefix[0]+"dft_tpsz");
		var tmpDftTeuCnt		= sheetObjects[0].GetCellValue(i, arrPrefix[0]+"dft_teu_cnt");
		if("F" == tmpDftTpszGroup && tpsz == tmpDftTpsz && sheetObjects[0].GetRowStatus(i) != "D"){
			teuCnt = tmpDftTeuCnt;
			break;
		}
	}
	
	return teuCnt;
}

function setDefaultTpszCombo(sheetObj){
	gDftLadenComboCode = "|";
	gDftEmptyComboCode = "|";
	
	for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow() ; i++){
		var tmpDftTpszGroup 	= sheetObj.GetCellValue(i, arrPrefix[0]+"dft_tpsz_group");
		var tmpDftTpsz 			= sheetObj.GetCellValue(i, arrPrefix[0]+"dft_tpsz");
		if(sheetObj.GetRowHidden(i) == false){
			if("F" == tmpDftTpszGroup){
				gDftLadenComboCode += tmpDftTpsz +"|";
			}else if("E" == tmpDftTpszGroup){
				gDftEmptyComboCode += tmpDftTpsz +"|";
			}
		}
	}
	
	if(!ComIsEmpty(gDftLadenComboCode))  gDftLadenComboCode = gDftLadenComboCode.substring(0, gDftLadenComboCode.length -1);
	if(!ComIsEmpty(gDftEmptyComboCode))  gDftEmptyComboCode = gDftEmptyComboCode.substring(0, gDftEmptyComboCode.length -1);
	
	//TP/SZ Tab Combo Item Set : Normal(Laden), if RAD(Laden), Empty(Empty)
	sheetObjects[1].SetColProperty(0, arrPrefix[1]+"tgt_normal_tpsz"	, {ComboText:gDftLadenComboCode, ComboCode:gDftLadenComboCode} );
	sheetObjects[1].SetColProperty(0, arrPrefix[1]+"tgt_rad_tpsz"		, {ComboText:gDftLadenComboCode, ComboCode:gDftLadenComboCode} );
	sheetObjects[1].SetColProperty(0, arrPrefix[1]+"tgt_empty_tpsz"		, {ComboText:gDftEmptyComboCode, ComboCode:gDftEmptyComboCode} );
		
	//TEU Tab Combo Item Set : TP/SZ(Laden)
	setTpszCombo(sheetObjects[4]);
	//sheetObjects[2].SetColProperty(0, arrPrefix[2]+"tgt_normal_tpsz"	, {ComboText:gDftLadenComboCode, ComboCode:gDftLadenComboCode} );
}

var gTpszComboCode = "";
function setTpszCombo(sheetObj){
	gTpszComboCode = "|";
	for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow() ; i++){
		var tmpTgtNormalTpsz	= sheetObj.GetCellValue(i, arrPrefix[4]+"tgt_normal_tpsz");
		if(sheetObj.GetRowHidden(i) == false){
			gTpszComboCode += tmpTgtNormalTpsz +"|";
		}
	}
	
	if(!ComIsEmpty(gTpszComboCode))  gTpszComboCode = gTpszComboCode.substring(0, gTpszComboCode.length -1);
	sheetObjects[2].SetColProperty(0, arrPrefix[2]+"tgt_normal_tpsz"	, {ComboText:gTpszComboCode, ComboCode:gTpszComboCode} );	
}

function t1sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var prefix = sheetObj.id+"_";
	setDefaultTpszCombo(sheetObj);
	ComOpenWait(false);
}
function t1sheet1_OnChange(sheetObj,Row,Col,Value, OldValue, RaiseFlag) {
	var prefix 	= sheetObj.id+"_"; 
	var sName	= sheetObj.ColSaveName(Col);
	var formObj	= document.form;
	
	switch(sName){
		case prefix+"dft_tpsz":
			/*
			if(ComIsEmpty(Value)){
				ComShowCodeMessage("JOO00116","Default TP/SZ");
				return;
			}
			//입력된 Value에 Dup 이 존재하는지 체크
			var flag = sheetObj.GetCellValue(Row, prefix+"dft_tpsz_group");
			if(getCheckDuplication(sheetObj, Value, flag)){
				//Dup 존재
				ComShowCodeMessage("JOO00205","Format Setup TP/SZ("+Value+")");
				
				sheetObj.SetCellValue(Row, prefix +"dft_tpsz", "", 0);
				return;
			}else{
				//Dup 미존재, 
				setDefaultTpszCombo(sheetObj); // Combo Item을 새로 추가한다.
			}
			*/
			break;
		case prefix+"dft_teu_cnt":
			break;
	}
}

function t2sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var prefix = sheetObj.id+"_"; 
}
function t2sheet1_OnChange(sheetObj,Row,Col,Value, OldValue, RaiseFlag) {
	var prefix 	= sheetObj.id+"_"; 
	var sName	= sheetObj.ColSaveName(Col);
	var formObj	= document.form;
	
	switch(sName){
		case prefix+"tgt_normal_tpsz":
			//현재 Col 에 데이타가 존재 하는지 체크.	
			var tmpTgtNormalTpsz = sheetObj.GetCellValue(Row, prefix+"tgt_normal_tpsz");		
			if(!ComIsEmpty(tmpTgtNormalTpsz)){
				setHiddenTpszAddRow(tmpTgtNormalTpsz, OldValue);
			}else{
				ComShowCodeMessage("JOO00116","Normal");
				return;
			}
			break;
		case prefix+"tgt_rad_tpsz":
			var tmpTgtRadTpsz = sheetObj.GetCellValue(Row, prefix+"tgt_rad_tpsz");
			var iExistCnt = 0;
			if(!ComIsEmpty(tmpTgtRadTpsz)){
				//normal tpsz 에 존재하는지 체크. 존재 하지 않으면 초기화 
				for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow() ; i++){
					var tmpTgtNormalTpsz = sheetObj.GetCellValue(i, prefix +"tgt_normal_tpsz");
					if(tmpTgtRadTpsz == tmpTgtNormalTpsz && "" != tmpTgtNormalTpsz && (sheetObj.GetRowHidden(i) == false)){
						iExistCnt++;
					}
				}
				
				if(iExistCnt <= 0){
					ComShowCodeMessage("JOO00204","TP/SZ in Bay Plan");
					sheetObj.SetCellValue(Row, prefix +"tgt_rad_tpsz", "", 0);
				}
			}
			break;
	}
}

function t3sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var prefix = sheetObj.id+"_";
}
function t3sheet1_OnChange(sheetObj,Row,Col,Value) {
	var prefix 	= sheetObj.id+"_"; 
	var sName	= sheetObj.ColSaveName(Col);
	var formObj	= document.form;
	
	switch(sName){
		case prefix+"slan_cd":
			//현재 Col 에 데이타가 존재 하는지 체크.
			var tmpSlanCd=sheetObj.GetCellValue(Row, prefix+"slan_cd");
			if (tmpSlanCd.length == 3){	
				setCheckLane(sheetObj, Row, Col, tmpSlanCd, 2);
			}else{
				ComShowCodeMessage("JOO00203");
				return false;
			}
			break;
	}
}
function t4sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var prefix = sheetObj.id+"_";
}
function t4sheet1_OnChange(sheetObj,Row,Col,Value) {
	var prefix 	= sheetObj.id+"_"; 
	var sName	= sheetObj.ColSaveName(Col);
	var formObj	= document.form;
	
	switch(sName){
		case prefix+"slan_cd":
			//현재 Col 에 데이타가 존재 하는지 체크.
			var tmpSlanCd=sheetObj.GetCellValue(Row, prefix+"slan_cd");
			if (tmpSlanCd.length == 3){	
				setCheckLane(sheetObj, Row, Col, tmpSlanCd, 3);
			}else{
				ComShowCodeMessage("JOO00203");
				return false;
			}
			break;
	}
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch ( sAction ){
             case IBSEARCH :
            	 if (!ComChkValid(formObj)) return false;
                 break;
             case IBSAVE :
            	 var prefix0 = sheetObjects[0].id+"_";
            	 var prefix1 = sheetObjects[1].id+"_";
            	 var prefix2 = sheetObjects[2].id+"_";
            	 var prefix3 = sheetObjects[3].id+"_";
            	 
            	 if(sheetObjects[0].LastRow() == sheetObjects[0].RowCount("D")){
            		 ComShowCodeMessage('JOO00036');
        			 return false;
            	 }

            	 //TP/SZ Check
            	 for(var i=sheetObjects[0].HeaderRows(); i <= sheetObjects[0].LastRow(); i++){
            		//
            		 if(sheetObjects[0].GetRowStatus(i) == "D") continue;
            		 
            		 var dftTpszGroup 	= sheetObjects[0].GetCellValue(i, prefix0+"dft_tpsz_group");
            		 var dftTpsz		= sheetObjects[0].GetCellValue(i, prefix0+"dft_tpsz");
            		 var dftTeuCnt		= sheetObjects[0].GetCellValue(i, prefix0+"dft_teu_cnt")+"";//ComIsEmpty 는 String 만 비교하므로 String 변환.
            		 if(ComIsEmpty(dftTpszGroup)){
            			 ComShowCodeMessage('COM130403', " [Format Setup Tab : Laden/Empty]");
            			 return false;
            		 }            		 
            		 if(ComIsEmpty(dftTpsz)){
            			 ComShowCodeMessage('COM130403', " [Format Setup Tab : Default TP/SZ]");
            			 return false;
            		 }            		 
            		 if(ComIsEmpty(dftTeuCnt)){
            			 ComShowCodeMessage('COM130403', " [Format Setup Tab : Default TEU]");
            			 return false;
            		 }
            	 }
            	 
            	 
            	 var iDupRow = sheetObjects[0].ColValueDup("t1sheet1_dft_tpsz_group|t1sheet1_dft_tpsz",{"IncludeDelRow":0})
            	 if( iDupRow != -1){
            		 ComShowCodeMessage("JOO00059", "Laden/Empty & Default TP/SZ");
            		 return false;
            	 }
            	 
            	 //TP/SZ Check
            	 for(var i=sheetObjects[1].HeaderRows(); i <= sheetObjects[1].LastRow(); i++){
            		//
            		 if(sheetObjects[1].GetRowStatus(i) == "D") continue;
            		 
            		 var tgtNormalTpsz 	= sheetObjects[1].GetCellValue(i, prefix1+"tgt_normal_tpsz");
            		 var srcTpsz		= sheetObjects[1].GetCellValue(i, prefix1+"src_tpsz");
            		 if(ComIsEmpty(srcTpsz)){
            			 ComShowCodeMessage('COM130403', " [TP/SZ Tab : TP/SZ in Bay Plan]");
            			 return false;
            		 }            		 
            		 if(ComIsEmpty(tgtNormalTpsz)){
            			 ComShowCodeMessage('COM130403', " [TP/SZ Tab : Normal]");
            			 return false;
            		 }
            	 }
            	 
            	 //TEU Check.
            	 for(var i=sheetObjects[2].HeaderRows(); i <= sheetObjects[2].LastRow(); i++){
            		 //
            		 if(sheetObjects[2].GetRowStatus(i) == "D") continue;
            		 
            		 var slanCd 		= sheetObjects[2].GetCellValue(i, prefix2+"slan_cd");
            		 var tgtNormalTpsz	= sheetObjects[2].GetCellValue(i, prefix2+"tgt_normal_tpsz");
            		 if(ComIsEmpty(slanCd)){
            			 ComShowCodeMessage('COM130403', " [TEU Tab : Lane]");
            			 return false;
            		 }            		 
            		 if(ComIsEmpty(tgtNormalTpsz)){
            			 ComShowCodeMessage('COM130403', " [TEU Tab : TP/SZ]");
            			 return false;
            		 }
            	 }
            	 
            	 //Void Check.
            	 for(var i=sheetObjects[3].HeaderRows(); i <= sheetObjects[3].LastRow(); i++){
            		 if(sheetObjects[3].GetRowStatus(i) == "D") continue;
            		 
            		 //or_yn ol_yn oh_yn
            		 var slanCd 		= sheetObjects[3].GetCellValue(i, prefix3+"slan_cd");
            		 var orYn			= sheetObjects[3].GetCellValue(i, prefix3+"or_yn");
            		 var olYn			= sheetObjects[3].GetCellValue(i, prefix3+"ol_yn");
            		 var ohYn			= sheetObjects[3].GetCellValue(i, prefix3+"oh_yn");
            		 if(ComIsEmpty(slanCd)){
            			 ComShowCodeMessage('COM130403', " [Void Tab : Lane]");
            			 return false;
            		 }            		 
            		 if(ComIsEmpty(orYn)){
            			 ComShowCodeMessage('COM130403', " [Void Tab : OR]");
            			 return false;
            		 }           		 
            		 if(ComIsEmpty(olYn)){
            			 ComShowCodeMessage('COM130403', " [Void Tab : OL]");
            			 return false;
            		 }           		 
            		 if(ComIsEmpty(ohYn)){
            			 ComShowCodeMessage('COM130403', " [Void Tab : OH]");
            			 return false;
            		 }
            	 }
            	 break;
        }
    }
    return true;
}

function initSearchReset(sheetObj) {
	ComResetAll();
	for (i=0; i<sheetObjects.length; i++){
        sheetObjects[i].RemoveAll();
    }
	
}
/**
 *  Creating seq when Deleting
 */
function createSeq(sheetObj, colName){
	 var k=0;
	 for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
		 if(sheetObj.GetRowStatus(i) != "D"){
			 k++;
			 sheetObj.SetCellValue(i, colName,k,0);
		 }
	 }
	 sheetObj.RenderSheet(1);
}
/**
 * Create TEU seq When Deleting and Add.
 * @param sheetObj
 * @param colName
 */
function createLaneSeq(sheetObj, colName, prefix){
	//slan_cd 로 sort
	sheetObj.ColumnSort(prefix+"slan_cd");
	/*
	var arrSlanCd = new Array();
	var tmpSlanCd = "";
	var idx = 0;
	for(var i = sheetObj.HeaderRows() ; i <= sheetObj.LastRow(); i++){
		var tmpChkSlanCd = sheetObj.GetCellValue(i, prefix+"slan_cd");
		if(tmpSlanCd != tmpChkSlanCd && sheetObj.GetRowStatus(i) != "D"){
			arrSlanCd[idx] = tmpChkSlanCd;
			tmpSlanCd = tmpChkSlanCd;
			idx++;
		}
	}

	var k=0;
	for (var idx=0; idx < arrSlanCd.length; idx++){	
		for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
			var tmpSlanCd = sheetObj.GetCellValue(i, prefix +"slan_cd");
			 if(arrSlanCd[idx] == tmpSlanCd && sheetObj.GetRowStatus(i) != "D"){
				 k++;
				 sheetObj.SetCellValue(i, colName,k,0);
			 }
		 }
	}*/
	var k=0;
	for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
		if(sheetObj.GetRowStatus(i) != "D"){
			k++;
			sheetObj.SetCellValue(i, colName,k,0);
		}
	}
	sheetObj.RenderSheet(1);
}

function getCOM_ENS_081(rowArray) {
    var colArray=rowArray[0];
    document.all.slan_cd.value=colArray[3];
}
function slan_cd_keyup(){
    var formObject=document.form;
    if (formObject.slan_cd.value.length == 3){
        doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC01);
	}
}
/**
 * TP/SZ Row Add, TP/SZ Row Ins
 * @param sheetObj
 * @param Row
 */
function setHiddenTpszAddRow(Value, OldValue){	
	var prefix = sheetObj.id +"_";
	//Add 한 normal_tpsz 가 Default tpsz 에 존재시 상태가 D 이면 'R' 로 변경, 존재 하지 않을시 Row Add.
	
	//default tpszsheet 상태값 D로 변경.
	var iExistCnt = 0;
	for (var i=sheetObjects[4].HeaderRows(); i <= sheetObjects[4].LastRow() ; i++){
		var tmpDftTgtNormalTpsz = sheetObjects[4].GetCellValue(i, arrPrefix[4] +"tgt_normal_tpsz");
		
		if(!ComIsEmpty(tmpDftTgtNormalTpsz)){
			//존재 여부 판단.
			if(Value == tmpDftTgtNormalTpsz && "" != tmpDftTgtNormalTpsz){
				//삭제 했던 데이타이면 R 로 변경
				if(sheetObjects[4].GetRowStatus(i) == "D"){
					sheetObjects[4].SetCellValue(i, arrPrefix[4]+"ibflag", 	"R", 0);
				}
				
				iExistCnt++;
			}
			
			//기존 데이타를 수정한 경우 상태를 D로 변경 한다.
			if(!ComIsEmpty(OldValue) && OldValue == tmpDftTgtNormalTpsz){
				sheetObjects[4].SetCellValue(i, arrPrefix[4]+"ibflag", 	"D", 0);
			}
		}
		
	}
	
	//존재하지 않으면 Add
	if(iExistCnt <= 0){
		var iLastLineSeq = sheetObjects[4].GetCellValue(sheetObjects[4].LastRow(), arrPrefix[4]+"line_seq");
		if("" == iLastLineSeq){
			iLastLineSeq = "1";
		}else{
			iLastLineSeq = parseInt(iLastLineSeq) + 1;
		}
		var iRow = sheetObjects[4].DataInsert(-1);
		sheetObjects[4].SetCellValue(iRow, arrPrefix[4]+"ibflag", "I", 0);
		sheetObjects[4].SetCellValue(iRow, arrPrefix[4]+"line_seq", iLastLineSeq, 0);
		sheetObjects[4].SetCellValue(iRow, arrPrefix[4]+"tgt_normal_tpsz", Value, 0);
	}
	
}
/**
 * TP/SZ Row Del
 * @param sheetObj
 */
function setTpszDelRow(sheetObj){
	var prefix = sheetObj.id + "_";
	//1. TP/SZ Delete 체크된 Data를 구한다.
	var sCheckedRow=sheetObj.FindCheckedRow(1);

	var arrRow=sCheckedRow.split("|"); //result : "1|3|5|"
	
	var arrTgtNormalTpsz = new Array();
	
	for (var idx=0; idx < arrRow.length; idx++){
		var tmpTgtNormalTpsz = sheetObj.GetCellValue(arrRow[idx], prefix +"tgt_normal_tpsz");
		arrTgtNormalTpsz[idx] = tmpTgtNormalTpsz;
	}
	
	//Sheet Delete Action.
	JooRowHideDelete(sheetObj, prefix+"del_chk");
	createSeq(sheetObj, prefix+"line_seq");	

	//2. TP/SZ 에 Delete 한 Normal tpsz가 D 상태가 아닌 데이타가 존재 하면 유지
	//   존재 하지 않으면 ifRAD Data 초기화, tpszsheet 에 데이타 상태 D로 변경한다.
	for (var idx=0; idx < arrTgtNormalTpsz.length; idx++){
		
		if("" == arrTgtNormalTpsz[idx]) continue;
		
		var iEqCnt = 0;
		for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow() ; i++){
			var tmpTgtNormalTpsz = sheetObj.GetCellValue(i, prefix +"tgt_normal_tpsz");
			var tmpStatus = sheetObj.GetCellValue(i, prefix +"ibflag");
			if(arrTgtNormalTpsz[idx] == tmpTgtNormalTpsz && "D" != tmpStatus){
				iEqCnt++;
			}
		}
		
		//Delete 한 tpsz 가 존재 하지 않으므로 ifRAD/tpszsheet 삭제.
		if(iEqCnt <= 0){
			//ifRAD 초기화.
			for (var i=sheetObj.HeaderRows(); i <= sheetObj.LastRow() ; i++){
				var tmpTgtRadTpsz = sheetObj.GetCellValue(i, prefix +"tgt_rad_tpsz");
				if(arrTgtNormalTpsz[idx] == tmpTgtRadTpsz && "" != tmpTgtRadTpsz){
					sheetObj.SetCellValue(i, prefix +"tgt_rad_tpsz", "", 0);
				}
			}
			
			//default tpszsheet 상태값 D로 변경.
			for (var i=sheetObjects[4].HeaderRows(); i <= sheetObjects[4].LastRow() ; i++){
				var tmpTgtNormalTpsz = sheetObjects[4].GetCellValue(i, arrPrefix[4]+"tgt_normal_tpsz");
				if(arrTgtNormalTpsz[idx] == tmpTgtNormalTpsz && "" != tmpTgtNormalTpsz){
					sheetObjects[4].SetCellValue(i, arrPrefix[4]+"ibflag", 	"D", 0);
				}
			}
		}
	}
	
	//TEU TAB 삭제 데이타의 데이타 초기화. tgt_normal_tpsz
	setMakeTeuTpsz();
}

/*
 * Default TP/SZ Delete
 * 1. Row Del 시 Row Data Delete.
 * 2. TP/SZ Tab 1번에서 삭제한 TP/SZ 삭제처리(Normal,if RAD, Empty)
 * 3. TEU Tab 1번에서 삭제한 TP/SZ 삭제처리(TP/SZ)
 */
function setDefaultTpszDelRow(sheetObj){
	//1. TP/SZ Delete 체크된 Data를 구한다.
	var sCheckedRow=sheetObj.FindCheckedRow(1);

	var arrRow=sCheckedRow.split("|"); //result : "1|3|5|"
	
	var arrDftTpsz 			= new Array();
	var arrDftTpszGroup 	= new Array();
	
	for (var idx=0; idx < arrRow.length; idx++){
		var tmpDftTpsz 			= sheetObj.GetCellValue(arrRow[idx], arrPrefix[0] +"dft_tpsz");
		var tmpDftTpszGroup 	= sheetObj.GetCellValue(arrRow[idx], arrPrefix[0] +"dft_tpsz_group");
		
		arrDftTpsz[idx] 		= tmpDftTpsz;
		arrDftTpszGroup[idx] 	= tmpDftTpszGroup;
	}
	
	//Default TP/SZ Sheet Delete Action.
	JooRowHideDelete(sheetObj	, arrPrefix[0]+"del_chk");
	createSeq(sheetObj			, arrPrefix[0]+"line_seq");
	
	//Combo Item 재생성.
	setDefaultTpszCombo(sheetObj);
	
	
	for (var idx=0; idx < arrDftTpsz.length; idx++){
		
		if(ComIsEmpty(arrDftTpsz[idx])) continue;
		
		//tgt_normal_tpsz tgt_rad_tpsz tgt_empty_tpsz 
		//TP/SZ Tab 기존에 있는 데이타 초기화.
		for (var i=sheetObjects[1].HeaderRows(); i <= sheetObjects[1].LastRow() ; i++){
			var tgtNormalTpsz 	= sheetObjects[1].GetCellValue(i, arrPrefix[1] +"tgt_normal_tpsz");
			var tgtRadTpsz 		= sheetObjects[1].GetCellValue(i, arrPrefix[1] +"tgt_rad_tpsz");
			var tgtEmptyTpsz 	= sheetObjects[1].GetCellValue(i, arrPrefix[1] +"tgt_empty_tpsz");
			
			if("F" == arrDftTpszGroup[idx] ){
				if(arrDftTpsz[idx] == tgtNormalTpsz){
					sheetObjects[1].SetCellValue(i, arrPrefix[1] +"tgt_normal_tpsz"	, "", 0);
				}else if(arrDftTpsz[idx] == tgtRadTpsz){
					sheetObjects[1].SetCellValue(i, arrPrefix[1] +"tgt_rad_tpsz"	, "", 0);
				}
			}else if("E" == arrDftTpszGroup[idx] && arrDftTpsz[idx] == tgtEmptyTpsz){
				sheetObjects[1].SetCellValue(i, arrPrefix[1] +"tgt_empty_tpsz"	, "", 0);
			}
		}
		
		//TEU TAB 삭제 데이타의 데이타 초기화. tgt_normal_tpsz
		setMakeTeuTpsz();

	}
	
}

/**
 * TEU Tab Onchage Selected
 */
function setMakeTeuTpsz(){
	var tpszSheetObj 	= sheetObjects[4];
	var teuSheetObj 	= sheetObjects[2];
//	Tu.Nguyen 20190422 (S) - modify for preformance
	var tpszSheetObjModified = [];
	var tpszSheetObjDel = [];
	var idx = 0;
	var idx1 = 0;
	
	//This Loop for preaparing data
	for(var i = tpszSheetObj.HeaderRows() ; i <= tpszSheetObj.LastRow(); i++){
		if(tpszSheetObj.GetRowStatus(i) == "D"){
			tpszSheetObjDel[idx++] = tpszSheetObj.GetCellValue(i, arrPrefix[4]+"tgt_normal_tpsz");
		}else{
			tpszSheetObjModified[idx1++] = tpszSheetObj.GetCellValue(i, arrPrefix[4]+"tgt_normal_tpsz");
		}
	}
	
	var arrSlanCd = new Array();
	var tmpSlanCd = "";
	var idx = 0;
	
	var mapSlandCd = {};
	
	//this LOOP for modifing data on tab TEU based on Tpsz tab after user modify
	for (var j=teuSheetObj.LastRow(); j >= teuSheetObj.HeaderRows(); j--){
		var tmpTgtNormalTpsz = teuSheetObj.GetCellValue(j, arrPrefix[2] +"tgt_normal_tpsz");
		
		//IF Tpsize is not existed or is deleted on Tpsize tab ==> THEN delete in TEU Tab
		if(tpszSheetObjModified.indexOf(tmpTgtNormalTpsz) < 0 || tpszSheetObjDel.indexOf(tmpTgtNormalTpsz) >= 0){		
			teuSheetObj.SetCellValue(j, arrPrefix[2]+"del_chk",0,0);
			teuSheetObj.SetRowHidden(j,1);
			teuSheetObj.SetRowStatus(j,"D");
		}
		
		//This for preparing data, We create an object like MAP object for easier checking
		if(teuSheetObj.GetRowStatus(j) != -1 && teuSheetObj.GetRowStatus(j) != "D" && tpszSheetObjModified.length > 0){
			var tmpChkSlanCd = teuSheetObj.GetCellValue(j, arrPrefix[2]+"slan_cd");

			if(!mapSlandCd[tmpChkSlanCd]){
				mapSlandCd[tmpChkSlanCd] = [tmpTgtNormalTpsz];
			}else{
				arrSlanCd = mapSlandCd[tmpChkSlanCd];
				if(arrSlanCd.indexOf(tmpTgtNormalTpsz) < 0){
					arrSlanCd[arrSlanCd.length] = tmpTgtNormalTpsz;
				}
			}
		}
		
	}
	
	if(tpszSheetObjModified.length > 0){
		for(var slan in mapSlandCd){//We loop each Sevice Lane on TEU TAB for checking missing tpsize
			var arrTpsz = mapSlandCd[slan];
			for(var i = 0; i < tpszSheetObjModified.length; i++){
				if(arrTpsz.indexOf(tpszSheetObjModified[i]) < 0){
					var iRow = teuSheetObj.DataInsert(-1);
					teuSheetObj.SetCellValue(iRow, arrPrefix[2]+"slan_cd"			, slan		, 0);
					teuSheetObj.SetCellValue(iRow, arrPrefix[2]+"line_seq"			, 1			, 0);
					teuSheetObj.SetCellValue(iRow, arrPrefix[2]+"tgt_normal_tpsz"	, tpszSheetObjModified[i]	, 0);
					teuSheetObj.SetCellValue(iRow, arrPrefix[2]+"teu_cnt"			, getDefaultTpszTeu(tpszSheetObjModified[i]) , 0);
				}
			}
		}
	}
//	Tu.Nguyen 20190422 (E)
	createLaneSeq(teuSheetObj, arrPrefix[2]+"line_seq", arrPrefix[2]);
}
/**
 * TEU Add Lane
 * @param sheetObj
 * @param slanCd
 */
function setTeuAddLane(sheetObj, slanCd){
	sheetObj.RenderSheet(0);
	
	var prefix = sheetObj.id + "_";
	//2.Default Void Hidden Sheet 데이타를 카피한다.
	//var iLoopRow 	= sheetObjects[4].LastRow() - sheetObjects[4].HeaderRows();
	var iLoopRow 	= sheetObjects[4].RowCount();
	var iDelRow 	= sheetObjects[4].RowCount("D");
	
	if(iLoopRow == iDelRow) return;
	
	var iInCnt = 1;
	for(var i = sheetObjects[4].HeaderRows() ; i <= sheetObjects[4].LastRow(); i++){
		if(sheetObjects[4].GetRowStatus(i) != "D"){
			//첫번째는 이미 Row를 생성 했기 때문에 skip
			if(iInCnt > sheetObjects[4].HeaderRows()){
				sheetObj.DataInsert(-1);
			}
			var iRow = sheetObj.LastRow();
			var tmpTatNormalTpsz = sheetObjects[4].GetCellValue(i,arrPrefix[4]+"tgt_normal_tpsz");
			sheetObj.SetCellValue(iRow, prefix+"slan_cd", 			slanCd, 0);
			sheetObj.SetCellValue(iRow, prefix+"line_seq", 			iInCnt, 0);
			sheetObj.SetCellValue(iRow, prefix+"tgt_normal_tpsz", 	tmpTatNormalTpsz, 0);
			sheetObj.SetCellValue(iRow, prefix+"teu_cnt", 			getDefaultTpszTeu(tmpTatNormalTpsz), 0);
			
			sheetObj.SetCellEditable(iRow, prefix+"slan_cd", 0);
			iInCnt++;
		}
	}
	
	createLaneSeq(sheetObj, prefix+"line_seq", prefix);
	//sheetObj.RenderSheet(1);
}
/**
 * TEU Del Lane
 * @param sheetObj
 */
function setTeuDelLane(sheetObj){
	var prefix = sheetObj.id + "_";
	var sCheckedRow=sheetObj.FindCheckedRow(prefix+"del_chk");
	
	var arrRow=sCheckedRow.split("|"); //result : "1|3|5|"
	for (var idx=arrRow.length-1; idx>=0; idx--){
		var sSelSlanCd = sheetObj.GetCellValue(arrRow[idx], prefix +"slan_cd");				
		
		for (var i=sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--){
			var tmpSlanCd = sheetObj.GetCellValue(i, prefix +"slan_cd");
			//동일 slan_cd 일때 Del 체크 및 Delete.
			if(sSelSlanCd == tmpSlanCd){
				sheetObj.SetCellValue(i, prefix+"del_chk"	, 1		, 0);					
				sheetObj.SetCellValue(i, prefix+"ibflag"	, "U"	, 0);						
			}
		}
	}
	if(sCheckedRow != ""){
		//선택 Row Delete
		JooRowHideDelete(sheetObj,  prefix+"del_chk");
	}
}

/**
 * Void Add Lane
 * @param sheetObj
 * @param slanCd
 */
function setVoidAddLane(sheetObj, slanCd){
	//1.Sheet Insert 한 Lane 중복 검사 : 이미 등록된 Lane은 등록하지 않는다.
	//sheetObj.DataInsert(-1);
	sheetObj.RenderSheet(0);
	var voidsheet = sheetObjects[5];
	
	prefix = sheetObj.id + "_";
	//2.Default Void Hidden Sheet 데이타를 카피한다.
	//var iLoopRow = voidsheet.LastRow() - voidsheet.HeaderRows();
	for(var i = voidsheet.HeaderRows() ; i <= voidsheet.LastRow(); i++){
		//첫번째는 이미 Row를 생성 했기 때문에 skip
		if(i > voidsheet.HeaderRows()){
			sheetObj.DataInsert(-1);
		}
		var iRow = sheetObj.LastRow();
		sheetObj.SetCellValue(iRow, prefix+"slan_cd", 	slanCd, 0);
		sheetObj.SetCellValue(iRow, prefix+"line_seq", 	voidsheet.GetCellValue(i,arrPrefix[5]+"line_seq"), 0);
		sheetObj.SetCellValue(iRow, prefix+"or_yn", 	voidsheet.GetCellValue(i,arrPrefix[5]+"or_yn"), 0);
		sheetObj.SetCellValue(iRow, prefix+"ol_yn", 	voidsheet.GetCellValue(i,arrPrefix[5]+"ol_yn"), 0);
		sheetObj.SetCellValue(iRow, prefix+"oh_yn", 	voidsheet.GetCellValue(i,arrPrefix[5]+"oh_yn"), 0);
		sheetObj.SetCellValue(iRow, prefix+"void_cnt", 	voidsheet.GetCellValue(i,arrPrefix[5]+"void_cnt"), 0);
		sheetObj.SetCellValue(iRow, prefix+"line_seq", 	voidsheet.GetCellValue(i,arrPrefix[5]+"line_seq"), 0);
		
		sheetObj.SetCellEditable(iRow, prefix+"slan_cd", 0);

	}

	createLaneSeq(sheetObj, prefix+"line_seq", prefix);
	
	//sheetObj.RenderSheet(1);	
}
/**
 * Void Del Lane
 * @param sheetObj
 */
function setVoidDelLane(sheetObj){
	prefix = sheetObj.id + "_";
	var sCheckedRow=sheetObj.FindCheckedRow(prefix+"del_chk");
	
	var arrRow=sCheckedRow.split("|"); //result : "1|3|5|"
	for (var idx=arrRow.length-1; idx>=0; idx--){
		var sSelSlanCd = sheetObj.GetCellValue(arrRow[idx], prefix +"slan_cd");				
		
		for (var i=sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--){
			var tmpSlanCd = sheetObj.GetCellValue(i, prefix +"slan_cd");
			//동일 slan_cd 일때 Del 체크 및 Delete.
			if(sSelSlanCd == tmpSlanCd){
				sheetObj.SetCellValue(i, prefix+"del_chk"	, 1		, 0);					
				sheetObj.SetCellValue(i, prefix+"ibflag"	, "U"	, 0);					
			}
		}
	}
	//선택 Row Delete
	JooRowHideDelete(sheetObj,  prefix+"del_chk");
}

function setCheckLane(sheetObj, Row, Col, slanCd, tabIdx){
	var prefix = sheetObj.id + "_";
	var formObj = document.form;
	var iDupRow = -1;
	for (var i=sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--){
		var chkSlanCd = sheetObj.GetCellValue(i, prefix +"slan_cd");
		//동일 slan_cd 가 존재 하는지 체크.
		if(slanCd == chkSlanCd && sheetObj.GetRowStatus(i) != "D"){
			iDupRow++;				
		}
	}
	//Dup Check.
	if( iDupRow > 0){//0 은 입력된 slan_cd 이므로 1보다 크면 중복된 값이 존재하는거임..
		ComShowCodeMessage("JOO00205", slanCd);
		sheetObj.SetCellValue(Row, prefix+"slan_cd","",0);
		return false;
	}
	
	//Dup이 아닐때 제대로 된 Lane 인지 체크.
	formObj.f_cmd.value=SEARCH07;
    var param=FormQueryString(formObj)+"&code="+slanCd;
    var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
    var rowCnt=ComGetTotalRows( sXml );
    if(rowCnt <= 0){
    	ComShowCodeMessage("JOO00203");
		sheetObj.SetCellValue(Row, prefix+"slan_cd","",0);
    }else{
    	//Default Void Hidden Sheet 데이타를 카피한다.
    	if(tabIdx == 2){
    		setTeuAddLane(sheetObj, slanCd);
    	}else if(tabIdx == 3){
    		setVoidAddLane(sheetObj, slanCd);
    	}
    }
}

function setDefaultTpszAdd(sheetObj){
	sheetObj.RemoveAll();
	sheetObj.LoadSearchData(defaultTpszXml);
	//createSeq(sheetObj, prefix+"line_seq");
	
	//setDefaultTpszCombo(sheetObj);
}
//Default TP/SZ Del 은 기본 데이타가 삭제되므로 전체 탭의 Sheet를 삭제 한다.
function setDefaultTpszDel(sheetObj){		
	/*for (var i=3; i >= 0; i--){
		setDefaultTpszDelSheet(sheetObjects[i], arrPrefix[i]);
	}*/

	setDefaultTpszDelSheet(sheetObjects[0], arrPrefix[0]);
	setDefaultTpszDelSheet(sheetObjects[1], arrPrefix[1]);
	
	for (var i=sheetObjects[4].LastRow(); i >= sheetObjects[4].HeaderRows(); i--){
		sheetObjects[4].SetCellValue(i, arrPrefix[4]+"ibflag", "D", 0);
	}
	
	setMakeTeuTpsz();

	setDefaultTpszDelSheet(sheetObjects[3], arrPrefix[3]);
	//setDefaultTpszDelSheet(sheetObjects[2], arrPrefix[2]);

}
//
//var arrPrefix = new Array("t1sheet1_", "t2sheet1_", "t3sheet1_", "t4sheet1_", "tpszsheet_", "voidsheet_");
function setDefaultTpszDelSheet(sheetObj, prefix){
	for (var i=sheetObj.LastRow(); i >= sheetObj.HeaderRows(); i--){
		sheetObj.SetCellValue(i, prefix+"del_chk"	, 1		, 0);					
		sheetObj.SetCellValue(i, prefix+"ibflag"	, ""	, 0);						
	}
	
	JooRowHideDelete(sheetObj,  prefix+"del_chk");
}

function resizeSheet(){
	for (var i=0; i<sheetObjects.length; i++){
		if(i < 4){
			ComResizeSheet(sheetObjects[i], gSheetGap);
		}
    }
}
        