var sheetObjects=new Array();
var sheetCnt=0;
var colCnt=0;
var comboObjects=new Array();
var comboCnt=0;
var iPageNo = 1;
var tabObjects=new Array();
var tabCnt=0 ;
var beforetab=1;
var tabLoad=new Array();
tabLoad[0]=0;
tabLoad[1]=0;
var glbFormDataTab1=null;
var glbFormDataTab2=null;
var gLadenTpSzHeadTitle="";
var gEmptyTpSzHeadTitle="";
var gColWidth = 50;
var gRowHeight = 15;

document.onclick=processButtonClick;

function processButtonClick(){
	/**********/
	var sheetObj=getCurrentSheet();
	/*******************************************************/
	var formObject=document.form;
	try {
		var srcObj=window.event.srcElement;
		var srcName=ComGetEvent("name");
		if (!ComIsBtnEnable(srcName)) return;             //버튼 상태를 확인을 합니다.
		switch(srcName) {
	        case "btn_Retrieve":
	        	doActionIBSheet(sheetObj,document.form,IBSEARCH);
	            break;
	        case "btn_DownExcel":
	        	doActionIBSheet(sheetObjects[0],document.form,IBDOWNEXCEL);
	        	/*
	        	if(beforetab == 0){
	        		doActionIBSheet(sheetObjects[0],document.form,IBDOWNEXCEL);
	        	}else{
	        		sheetObjects[1].Down2ExcelBuffer(true);
					
	        		if(sheetObjects[1].RowCount() >= 0){
	     				sheetObjects[1].Down2Excel({SheetDesign:1, DebugMode:1, HiddenColumn:1, Merge:1, ExcelRowHeight: 20, AutoSizeColumn: 1, SheetName:"ROB From Previous Voyage"});
	    			}
	        		if(sheetObjects[2].RowCount() >= 0){
	     				sheetObjects[2].Down2Excel({SheetDesign:1, DebugMode:1, HiddenColumn:1, Merge:1, ExcelRowHeight: 20, AutoSizeColumn: 1, SheetName:"Operation Summary Report"});
	    			}
		            sheetObjects[1].Down2ExcelBuffer(false);	        		
	        	}*/
	            
	            //sheet1.Down2Excel( {DownCols: makeHiddenSkipCol(sheet1), SheetDesign:1,Merge:1 });
	            break;
	        case "btn_vvd_search":
				var vslCd=formObject.vsl_cd.value;
	        	var sUrl="";
	        	if(vslCd == ""){
	        		sUrl="/opuscntr/VOP_VSK_0219.do?vsl_cd=" + vslCd;
	        		ComOpenPopup(sUrl, 460, 500, "getVslCdData", "0,0", true);
	        	}else{
	        		sUrl="/opuscntr/VOP_VSK_0230.do?ctrl_cd=NORL&vsl_cd="+vslCd;
	        		ComOpenPopup(sUrl, 340, 420, "getVvdData", "0,0", true);
	        	}
				break;
	        case "btn_pre_vvd_search":
				var preVslCd=formObject.pre_vsl_cd.value;
	        	var sUrl="";
	        	if(preVslCd == ""){
	        		sUrl="/opuscntr/VOP_VSK_0219.do?vsl_cd=" + preVslCd;
	        		ComOpenPopup(sUrl, 460, 500, "getPreVslCdData", "0,0", true);
	        	}else{
	        		sUrl="/opuscntr/VOP_VSK_0230.do?ctrl_cd=NORL&vsl_cd="+preVslCd;
	        		ComOpenPopup(sUrl, 340, 420, "getPreVvdData", "0,0", true);
	        	}
				break; 
	        case "btn_carrier_cd":
	        	var sUrl="";
	        	sUrl="/opuscntr/VOP_VSK_0252.do?code_type=CD0XXXX&code_value="+formObject.slan_cd.value;
				ComOpenPopup(sUrl, 500, 420, "returnCrrCdHelp", "0,0", true);
				break;
	        case "btn_New":
                doActionIBSheet(sheetObj,formObject,IBRESET); 
	        	break;
	        case "btn_Conversion":
	        	//var sUrl="/opuscntr/FNS_JOO_0086.do";
				//ComOpenPopup(sUrl, 860, 700, "setConversion", "0,0", false);
				ComOpenPopup("FNS_JOO_0086.do", 860, 700,"setConversion", "0,0", true, false, 0, 0, 0, "FNS_JOO_0086");
				break;
	        case "btn_Option":
	        	//var sUrl="/opuscntr/FNS_JOO_0087.do";
				//ComOpenPopup(sUrl, 860, 700, "setOption", "0,0", false);
				ComOpenPopup("FNS_JOO_0087.do", 860, 700,"setOption", "0,0", true, false, 0, 0, 0, "FNS_JOO_0087");
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
	}else{
		sheetObj=sheetObjects[1];
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
function loadPage(ladenTpSzNm, emptyTpSzNm) {
	gLadenTpSzHeadTitle = ladenTpSzNm;
	gEmptyTpSzHeadTitle = emptyTpSzNm;
	
	document.form.laden_tpsz_datas.value = gLadenTpSzHeadTitle;
	document.form.empty_tpsz_datas.value = gEmptyTpSzHeadTitle;
	
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        sheetObjects[i].SetWaitImageVisible(0);
        ComEndConfigSheet(sheetObjects[i]);
    }
    for(k=0;k<tabObjects.length;k++){
        initTab(tabObjects[k],k+1);
        tabObjects[k].SetSelectedIndex(0);
    }
    
    initControl();
    
    resizeSheet();
    
    initConditionObject("C");
    //document.form.vsl_cd.focus();
}
 /**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
    var form=document.form;
    axon_event.addListenerForm('change', 'obj_change', form);
    
    $(document.form.vsl_cd).on('blur', function(){
		obj_change();
	});
}
function obj_change(){
	var formObj=document.form;
    var sheetObj=sheetObjects[0];
	try {
		var srcName=ComGetEvent("name");
        switch(srcName) {
            case "vsl_cd":
            	codeChangedRemove(sheetObj, formObj);
            	if(isCheckVslCd(sheetObj, formObj)){
            		formObj.voy_no.focus();
            	}else{
            		formObj.vsl_cd.focus();
            	}
            	break;
            case "voy_no":
            	if("" != formObj.voy_no.value && beforetab == 1){
            		getPreviousVvdAndLastPort();
            	}
            	break;
            case "dir_cd":
            	if(beforetab==0) return;
            	if(beforetab == 1){
            		getPreviousVvdAndLastPort();
            	}
            	
            	break;
        } // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowCodeMessage('VSK00011');
		} else {
			ComShowMessage(e.message);
		}
	}
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
                InsertItem( "Container List" , "");
                InsertItem( "Standard Format" , "");
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
	var objs=document.all.item("tabLayer");
	objs[nItem].style.display="Inline";
	objs[beforetab].style.display="none";
	//--------------- important --------------------------//
	objs[beforetab].style.zIndex=objs[nItem].style.zIndex -1 ;
	//------------------------------------------------------//
	beforetab=nItem;
	
	if (beforetab == 0) {
		initConditionObject("C");
		
		//ComBtnDisable("btn_Conversion"); 
		//ComBtnDisable("btn_Option");		
	}else{
		initConditionObject("S");
		
		//ComBtnEnable("btn_Conversion"); 
		//ComBtnEnable("btn_Option");
	}
	
	resizeSheet();
   	
   	//setConditionControl(nItem);
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
	
	var arrLadenTpSz=gLadenTpSzHeadTitle.split("|");
    var arrEmptyTpSz=gEmptyTpSzHeadTitle.split("|");
    var ladenLoopCnt = arrLadenTpSz.length;
    var emptyLoopCnt = arrEmptyTpSz.length;
    
    switch(sheetNo) {
		case 1:
			with (sheetObj) {
				
			    var HeadTitle  ="|Seq.|Lane|VSL|Voy.|Act Dep. Date|Leg|Load Call|Disch Call|POL|POD|";
			        HeadTitle +="Line|Container No.|Original Position|TP/SZ|Wt Tons|Sts|TEUs|Warning|IMO|Tmp(C)|";
			        HeadTitle +="O/R(cm)|O/L(cm)|O/H(cm)|COD Port|Disch ATD";
			    var headCount=ComCountHeadTitle(HeadTitle);
			    
			    SetConfig( { SearchMode:2, MergeSheet:2, Page:100, DataRowMerge:0 } );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			    var headers = [ { Text:HeadTitle, Align:"Center"} ];
			    InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:0,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"Status" },
			              {Type:"Seq",      Hidden:0, 	Width:50,   Align:"Center",		ColMerge:0,   SaveName:prefix+"seq" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"slan_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"vsl_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"voy_no",        KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"act_dep_atd_dt",KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,  	Align:"Center", 	ColMerge:0,   SaveName:prefix+"dir_cd",        KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"load_call",     KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"disch_call",    KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:70,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"pol",           KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:70,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"pod",           KeyField:0,   CalcLogic:"",   Format:"" },
			                                                                                                   
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:0,   SaveName:prefix+"opr_cd",       	KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"id",            KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center", 	ColMerge:0,   SaveName:prefix+"ori_position",  KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:65,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"sztp",         	KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",  	Hidden:0, 	Width:65,   Align:"Center",  	ColMerge:0,   SaveName:prefix+"weight",       	KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",  	Hidden:0, 	Width:50,   Align:"Center",  	ColMerge:0,   SaveName:prefix+"fe",        	KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",  	Hidden:0, 	Width:50,   Align:"Center",  	ColMerge:0,   SaveName:prefix+"teus",       	KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:100,  Align:"Center",   	ColMerge:0,   SaveName:prefix+"warning",     	KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:80,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"imo",           KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:65,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"temp",          KeyField:0,   CalcLogic:"",   Format:"" },
			                                                                                                   
			              {Type:"Float",    Hidden:0,  	Width:65,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"ovs",           KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Float",    Hidden:0,  	Width:65,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"ovp",           KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Float",    Hidden:0,  	Width:65,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"ovh",           KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Float",    Hidden:0,  	Width:65,   Align:"Center",   	ColMerge:0,   SaveName:prefix+"cod",           KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Center",   	ColMerge:0,   SaveName:prefix+"disch_atd_dt",  KeyField:0,   CalcLogic:"",   Format:"" }];
			     
			    InitColumns(cols);
		
			    SetEditable(0);
			    SetCountFormat("[SELECTDATAROW / TOTALROWS]");
			    //SetColProperty("act_dep_atd_dt", {Format:"####-##-## ##:##"} );
			    //SetColProperty("disch_atd", {Format:"####-##-## ##:##"} );
			    SetSheetHeight(302);
			    //resizeSheet();
			}
			break;
		case 2:
			with (sheetObj) {
				var HeadTitle1  ="|Seq.|Voy./Dir|Consortium Voy.|Consortium Voy.|Port|Sq#|Type";
			    var HeadTitle2  ="|Seq.|Voy./Dir|I/B|O/B|Port|Sq#|Type";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	HeadTitle1 += "|Laden";
			    }
			    //void
				HeadTitle1 += "|Laden";
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	HeadTitle1+= "|Empty";
			    }
			    HeadTitle1 += "|Wgt";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrLadenTpSz[i];
			    }
			    //void
				HeadTitle2 += "|Void\n(T)";
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrEmptyTpSz[i];
			    }			    
		    	HeadTitle2+= "|Wgt";
		    	/*
			    var HeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle1 +="Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|";//12개
			        HeadTitle1 +="Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|";//12개
			        HeadTitle1 +="Wgt";
			    var HeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="Wgt";
			    */
			    var headCount=ComCountHeadTitle(HeadTitle1);
			    var headCnt=HeadTitle2.split("|").length;
			    
			    SetConfig( { SearchMode:2, FrozenCol:8, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"},{ Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:0,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"Seq",      Hidden:0, 	Width:50,   Align:"Center",		ColMerge:1,   SaveName:prefix+"seq" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"skd_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"ib_cssm_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"ob_cssm_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"vps_port_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"clpt_ind_seq",        KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Left", 	    ColMerge:1,   SaveName:prefix+"type",			KeyField:0,   CalcLogic:"",   Format:"" }]
			    
			    for(var i=1 ; i <= ladenLoopCnt ; i++){
			    	cols.push({Type:"AutoSum",       Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"f_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			    	               	 	
                }
			    //void
			    cols.push({Type:"AutoSum",       Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"void_qty",       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			    for(var i=1 ; i <= emptyLoopCnt ; i++){
               	 	cols.push({Type:"AutoSum",       Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                }
			    
			    cols.push({Type:"AutoSum",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"weight",       KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:1,   InsertEdit:1 });
			    InitColumns(cols);
		
			    SetEditable(0);
			    SetHeaderRowHeight(gRowHeight);
			    SetDataRowHeight(gRowHeight);
			    SetSheetHeight(150);
			    SetCountPosition();
			    //resizeSheet();
			}
			break;
		case 3:
			with (sheetObj) {
				var HeadTitle1  ="|Seq.|Voy./Dir|Consortium Voy.|Consortium Voy.|Port|Sq#|Type";
			    var HeadTitle2  ="|Seq.|Voy./Dir|I/B|O/B|Port|Sq#|Type";
			    var HeadTitle3  ="|Seq.|Voy./Dir|I/B|O/B|Port|Sq#|Type";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	HeadTitle1 += "|Laden";
			    }
			    HeadTitle1 += "|Laden";//void
				
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	HeadTitle1+= "|Empty";
			    }
			    HeadTitle1 += "|Wgt";
			    HeadTitle1 += "|Summary by Port|Summary by Port|Summary by Port|Summary by Port|Summary by Port|Summary by Port|Summary by Port";//7
			    HeadTitle1 += "|Allocation|Allocation";//2
			    HeadTitle1 += "|Buy&Sell|Buy&Sell";//2
			    HeadTitle1 += "|Excess|Excess|Excess|Excess|Excess";//5
			    HeadTitle1 += "|Price|Price";//2
			    HeadTitle1 += "|Amount|Amount";//2
			    HeadTitle1 += "|OptionA|OptionB";//2
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrLadenTpSz[i];
			    }			    
				HeadTitle2 += "|Void\n(T)";//void
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrEmptyTpSz[i];
			    }
			    HeadTitle2 += "|Wgt";
		    	HeadTitle2 += "|Total\nTEU|Ldn\nTEU|Ety\nTEU|Wgt\n(Ton)|Wgt\n/TEU|TEU by\nWgt|RF\nPlug";//7
			    HeadTitle2 += "|Slot|RF";//2
			    HeadTitle2 += "|Slot|RF";//2
			    HeadTitle2 += "|TEU|TEU|TEU|DWT|DWT";//5
			    HeadTitle2 += "|Slot|Plug";//2
			    HeadTitle2 += "|Buy+\nExcess Slots|Used\nPlugs";//2
			    HeadTitle2 += "|OptionA|OptionB";//2
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	  HeadTitle3 += "|"+arrLadenTpSz[i];
			    }			    
				HeadTitle3 += "|Void\n(T)";//void
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	  HeadTitle3 += "|"+arrEmptyTpSz[i];
			    }
			    HeadTitle3 += "|Wgt";
		    	HeadTitle3 += "|Total\nTEU|Ldn\nTEU|Ety\nTEU|Wgt\n(Ton)|Wgt\n/TEU|TEU by\nWgt|RF\nPlug";//7
		    	HeadTitle3 += "|Slot|RF";//2
		    	HeadTitle3 += "|Slot|RF";//2
		    	HeadTitle3 += "|Total|Laden|Empty|TEU|RF";//5
		    	HeadTitle3 += "|Slot|Plug";//2
		    	HeadTitle3 += "|Buy+\nExcess Slots|Used\nPlugs";//2
			    HeadTitle3 += "|OptionA|OptionB";//2
		    	/*
			    var HeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle1 +="Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|";//12개
			        HeadTitle1 +="Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|";//12개
			        HeadTitle1 +="Wgt";
			    var HeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="Wgt";
			    */    
			    var headCount=ComCountHeadTitle(HeadTitle1);
			    var headCnt=HeadTitle2.split("|").length;
			    
			    SetConfig( { SearchMode:0, FrozenCol:8, MergeSheet:7, Page:20 , DataRowMerge:0 ,PrevColumnMergeMode:0} );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"},{ Text:HeadTitle2, Align:"Center"},{ Text:HeadTitle3, Align:"Center"}  ];
                InitHeaders(headers, info);

			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:0,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"Int",      Hidden:0, 	Width:50,   Align:"Center",		ColMerge:1,   SaveName:prefix+"ord" ,   UpdateEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"skd_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" ,   UpdateEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"ib_cssm_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" ,   UpdateEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"ob_cssm_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" ,   UpdateEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"vps_port_cd",	KeyField:0,   CalcLogic:"",   Format:"" ,   UpdateEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"clpt_ind_seq",   KeyField:0,   CalcLogic:"",   Format:"" ,   UpdateEdit:0},
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Left", 	    ColMerge:0,   SaveName:prefix+"type",			KeyField:0,   CalcLogic:"",   Format:"" ,   UpdateEdit:0}]
			    
			    for(var i=1 ; i <= ladenLoopCnt ; i++){
			    	cols.push({Type:"Int",       Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:0,   SaveName:prefix+"f_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                }
			    //void
			    cols.push({Type:"Int",       Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:0,   SaveName:prefix+"void_qty",       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
			    for(var i=1 ; i <= emptyLoopCnt ; i++){
               	 	cols.push({Type:"Int",       Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:0,   SaveName:prefix+"e_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                }
			    
			    cols.push({Type:"Float",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:prefix+"weight",       KeyField:0,   CalcLogic:"",   Format:"NullFloat",  UpdateEdit:0,   InsertEdit:1 });
			    

			    //ADD Summary by Port - 7
			    cols.push({Type:"Float", 	Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_total_teu",     	KeyField:0,   CalcLogic:"",   Format:"Float", 	UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_ldn_teu",       	KeyField:0,   CalcLogic:"",   Format:"Float", 	UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_ety_teu",       	KeyField:0,   CalcLogic:"",   Format:"Float", 	UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_wgt_ton",       	KeyField:0,   CalcLogic:"",   Format:"Float", 	UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_wgt_teu",       	KeyField:0,   CalcLogic:"",   Format:"Float",   UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_teu_by_wgt",    	KeyField:0,   CalcLogic:"",   Format:"Float",   UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"sum_rf_plug",       	KeyField:0,   CalcLogic:"",   Format:"Float", 	UpdateEdit:0,   InsertEdit:1 });
			    //Add Allocation -2
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"alloc_slot",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"alloc_rf",       		KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    //Add Buy&Sell - 2
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bs_slot",       		KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"bs_rf",       		KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 });
			    //Add Excess - 5
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"exc_teu_total",     	KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"exc_teu_ldn",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"exc_teu_ety",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"exc_dwt_teu",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"exc_dwt_rf",       	KeyField:0,   CalcLogic:"",   Format:"NullFloat", UpdateEdit:0,   InsertEdit:1 });
			    //Add Price -2
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"pri_slot",       		KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 });
			    cols.push({Type:"Float",    Hidden:0,  Width:gColWidth,   Align:"Right",   ColMerge:1,   SaveName:prefix+"pri_plug",       		KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:1,   InsertEdit:1,   EditLen:12 });
			    //Add Amount -2
			    cols.push({Type:"Float",    Hidden:0,  Width:100,   Align:"Right",   ColMerge:1,   SaveName:prefix+"amt_buy_exc_slots", KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Float",    Hidden:0,  Width:100,   Align:"Right",   ColMerge:1,   SaveName:prefix+"amt_used_plugs",    KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:2,   UpdateEdit:0,   InsertEdit:1 });
			    
			    cols.push({Type:"Text",    Hidden:1,  Width:100,   Align:"Center",   ColMerge:1,   SaveName:prefix+"option_a",    KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
			    cols.push({Type:"Text",    Hidden:1,  Width:100,   Align:"Center",   ColMerge:1,   SaveName:prefix+"option_b",    KeyField:0,   CalcLogic:"",   Format:"", PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
			    
			    InitColumns(cols);

			    SetEditable(1);
			    SetDataRowHeight(gRowHeight);
			    SetDataRowHeight(gRowHeight);
			    SetSheetHeight(380);

			    SetCountPosition();
			    //resizeSheet();
			}
			break;
		/*
		case 4:
			with (sheetObj) {
				var HeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type";
			    var HeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	HeadTitle1 += "|Laden";
			    }
			    //void
				HeadTitle1 += "|Laden";
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	HeadTitle1+= "|Empty";
			    }
			    HeadTitle1 += "|Wgt";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrLadenTpSz[i];
			    }
			    //void
				HeadTitle2 += "|Void";
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrEmptyTpSz[i];
			    }			    
		    	HeadTitle2+= "|Wgt";
				
			    var HeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle1 +="Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|";//12개
			        HeadTitle1 +="Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|";//12개
			        HeadTitle1 +="Wgt";
			    var HeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="Wgt";
			        
			    var headCount=ComCountHeadTitle(HeadTitle1);
			    
			    SetConfig( { SearchMode:2, FrozenCol:7, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"},{ Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:0,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"Seq",      Hidden:0, 	Width:50,   Align:"Center",		ColMerge:1,   SaveName:prefix+"seq" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"skd_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"skd_dir_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"vps_port_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"clpt_ind_seq",        KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Left", 	    ColMerge:1,   SaveName:prefix+"type",			KeyField:0,   CalcLogic:"",   Format:"" }]
			    
			    for(var i=1 ; i <= ladenLoopCnt ; i++){
		    		cols.push({Type:"AutoSum",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"f_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                }
			    //void
			    cols.push({Type:"AutoSum",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"void_qty",       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			    for(var i=1 ; i <= emptyLoopCnt ; i++){
               	 	cols.push({Type:"AutoSum",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                }
			    
			    cols.push({Type:"AutoSum",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"weight",       KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			    InitColumns(cols);
		
			    SetEditable(0);
			    SetSheetHeight(150);
			    SetCountPosition();
			    //resizeSheet();
			}
			break;
		case 5:
			with (sheetObj) {
				var HeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type";
			    var HeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	HeadTitle1 += "|Laden";
			    }
			    //void
				HeadTitle1 += "|Laden";
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	HeadTitle1+= "|Empty";
			    }
			    HeadTitle1 += "|Wgt";
			    
			    for ( var i=0; i < ladenLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrLadenTpSz[i];
			    }
			    //void
				HeadTitle2 += "|Void";
			    for ( var i=0; i < emptyLoopCnt; i++) {
			    	  HeadTitle2 += "|"+arrEmptyTpSz[i];
			    }			    
		    	HeadTitle2+= "|Wgt";
				
			    var HeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle1 +="Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|Laden|";//12개
			        HeadTitle1 +="Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|Empty|";//12개
			        HeadTitle1 +="Wgt";
			    var HeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type|";
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="20'|20RF|40'|40FR|40RF|40RH|40HC|45'|20OD|20OT|40OT|40OD|";//12개
			        HeadTitle2 +="Wgt";
			        
			    var headCount=ComCountHeadTitle(HeadTitle1);
			    
			    SetConfig( { SearchMode:2, FrozenCol:7, MergeSheet:5, Page:20, DataRowMerge:1 } );
		
			    var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                var headers = [ { Text:HeadTitle1, Align:"Center"},{ Text:HeadTitle2, Align:"Center"} ];
                InitHeaders(headers, info);
		
			    var cols = [ 
			              {Type:"Status",   Hidden:1, 	Width:0,    Align:"Center",  	ColMerge:1,   SaveName:prefix+"ibflag" },
			              {Type:"Seq",      Hidden:0, 	Width:50,   Align:"Center",		ColMerge:1,   SaveName:prefix+"seq" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"skd_voy_no",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"skd_dir_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"vps_port_cd",		KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:50,   Align:"Center", 	ColMerge:1,   SaveName:prefix+"clpt_ind_seq",        KeyField:0,   CalcLogic:"",   Format:"" },
			              {Type:"Text",     Hidden:0,  	Width:110,  Align:"Left", 	    ColMerge:1,   SaveName:prefix+"type",			KeyField:0,   CalcLogic:"",   Format:"" }]
			    
			    for(var i=1 ; i <= ladenLoopCnt ; i++){
		    		cols.push({Type:"Int",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"f_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                }
			    //void
			    cols.push({Type:"Int",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"void_qty",       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			    for(var i=1 ; i <= emptyLoopCnt ; i++){
               	 	cols.push({Type:"Int",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"e_qty"+i,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
                }
			    
			    cols.push({Type:"Float",       Hidden:0,  Width:70,   Align:"Right",   ColMerge:1,   SaveName:prefix+"weight",       KeyField:0,   CalcLogic:"",   Format:"NullFloat", PointCount:0,   UpdateEdit:1,   InsertEdit:1 });
			    InitColumns(cols);
		
			    SetEditable(0);
			    SetSheetHeight(150);
			    SetCountPosition();
			    //resizeSheet();
			}
			break;
			*/
    }
 }
 
function doActionIBSheet(sheetObj,formObj,sAction, CondParam, PageNo) {
    sheetObj.ShowDebugMsg(false);
    var sheetID=sheetObj.id;
    switch(sAction) {
        case    IBSEARCH:      //retrieve
            if( !validateForm(sheetObj,formObj,sAction) ){return;}
            if ( sheetID == "t1sheet1"){
	            formObj.f_cmd.value=SEARCH;
	            var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam(sheetID+"_");
				sheetObj.SetWaitImageVisible(1);
				ComOpenWait(true);
				iPageNo = 1;
				var sXml=sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
				sheetObj.LoadSearchData(sXml,{Sync:1} );
				//sheetObj.DoSearch("FNS_JOO_0084GS.do", FormQueryString(formObj));
				ComOpenWait(false);
            }else if ( sheetID == "t2sheet1"){
                //2016.09.02 Backendjob으로 변경.
                ComSetObjValue(formObj.backendjob_key, "");
                formObj.f_cmd.value=SEARCH07;
                var aryPrefix = new Array("t2sheet1_", "t2sheet2_"); // prefix
                var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
                var sXml=sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
                
                var key = ComGetEtcData(sXml, "KEY");
                if (0 < key.length) {
                    ComSetObjValue(formObj.backendjob_key, key);
                    ComOpenWait(true);
                    sheetObj.RequestTimeOut = 600;  //10분
                    intervalId = setInterval("doActionStandardResult();",3000);
                }
                
                /*
            	formObj.f_cmd.value=SEARCH03;
            	//var aryPrefix = new Array("t2sheet1_", "t2sheet2_", "t2sheet3_"); // prefix
            	var aryPrefix = new Array("t2sheet1_", "t2sheet2_"); // prefix
	            var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
				sheetObj.SetWaitImageVisible(1);
				ComOpenWait(true);
				iPageNo = 1;
				var sXml=sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
				var arrXml = sXml.split("|$$|");
				for ( var inx = 1; inx <= arrXml.length; inx++) { 
					sheetObjects[inx].LoadSearchData(arrXml[(inx-1)], { Sync : 1 });
				}
				
				//sheetObj.LoadSearchData(sXml,{Sync:1} );
				//sheetObj.DoSearch("FNS_JOO_0084GS.do", FormQueryString(formObj));
				ComOpenWait(false);
				*/
            }
            break; 
            
        case    IBDOWNEXCEL : //EXCEL DOWNLOAD 
    		ComSetObjValue(formObj.backendjob_key, "");       	
        	if(beforetab == 0){
        		if( !validateForm(sheetObj,formObj,sAction) ){return;}
            	formObj.f_cmd.value = SEARCH01;
            	formObj.excel_flg.value = "Y";
    			var sXml = sheetObj.GetSearchData("FNS_JOO_0084GS.do", FormQueryString(formObj)+ "&" + ComGetPrefixParam(sheetID+"_"));
    			var key = ComGetEtcData(sXml, "KEY");
    			if (0 < key.length) {
    				ComSetObjValue(formObj.backendjob_key, key);
    				ComOpenWait(true);
    				sheetObj.RequestTimeOut = 600;  //10분
    				intervalId = setInterval("doActionCntrExcelResult();",3000);
    			}
        	}else{
        		if(sheetObjects[1].RowCount() == 0 && sheetObjects[2].RowCount() == 0 ){
        			ComShowCodeMessage('JOO00143');
        			return;
        		}
        		/*
        		//2015.06.08 Modify
        		sheetObjects[1].Down2ExcelBuffer(true);
        		if(sheetObjects[1].RowCount() >= 0){
     				sheetObjects[1].Down2Excel({SheetDesign:1, DebugMode:1, HiddenColumn:1, Merge:1, ExcelRowHeight: 20, AutoSizeColumn: 1, SheetName:"ROB From Previous Voyage"});
    			}
        		if(sheetObjects[2].RowCount() >= 0){
     				sheetObjects[2].Down2Excel({SheetDesign:1, DebugMode:1, HiddenColumn:1, Merge:1, ExcelRowHeight: 20, AutoSizeColumn: 1, SheetName:"Operation Summary Report"});
    			}
	            sheetObjects[1].Down2ExcelBuffer(false);
	            */
        		formObj.f_cmd.value=SEARCH05;
        		var arrPrefix = new Array("t2sheet1_", "t2sheet2_"); // prefix
	            var arrSheets1 = new Array(sheetObjects[1], sheetObjects[2]);
	            
	            var SaveStr=ComGetSaveString(arrSheets1, true, true);
				var sParam = SaveStr + "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(arrPrefix);
				
        		var sXml = sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
    			var key = ComGetEtcData(sXml, "KEY");
    			if (0 < key.length) {
    				ComSetObjValue(formObj.backendjob_key, key);
    				ComOpenWait(true);
    				sheetObj.RequestTimeOut = 600;  //10분
    				intervalId = setInterval("doActionStandardExcelResult();",3000);
    			}
				//formObj.target="_top";
	            //formObj.action="FNS_JOO_0084_01DL.do?"+sParam;
    		    //formObj.submit();
        	}
            break;
    	case 	IBSEARCHAPPEND: //sheet scroll retrieve
    		if(sheetObj.id == "t1sheet1") {
    			formObj.f_cmd.value=SEARCH;
    			sheetObj.SetWaitImageVisible(0);
    			ComOpenWait(true);
    			sheetObj.DoSearch("FNS_JOO_0084GS.do", CondParam+ "&" + ComGetPrefixParam(sheetID+"_") + "&iPage="+ PageNo,{Append:true} );
    			ComOpenWait(false);
    			sheetObj.SetWaitImageVisible(1);
				
    		}
    		break;
		case 	IBSEARCH_ASYNC01:		//VSL_CD Check
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH01;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("VOP_VSK_0019GS.do", sParam);
				return sXml;
			}
			break;
		case IBRESET:
			initSearchReset(sheetObj);
			break;
		case IBSEARCH_ASYNC02: //Previous Voyage
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH04;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
				
				var pre_vsl_cd = ComGetEtcData(sXml, "pre_vsl_cd");
				var pre_voy_no = ComGetEtcData(sXml, "pre_voy_no");
				var pre_dir_cd = ComGetEtcData(sXml, "pre_dir_cd");
				var lst_clpt_ind_seq = ComGetEtcData(sXml, "lst_clpt_ind_seq");
				var lst_port = ComGetEtcData(sXml, "lst_port");
				
				formObj.pre_vsl_cd.value = pre_vsl_cd;
				formObj.pre_voy_no.value = pre_voy_no;
				formObj.pre_dir_cd.value = pre_dir_cd;
				formObj.lst_port.value = lst_port;	
				formObj.lst_clpt_ind_seq.value = lst_clpt_ind_seq;			
				//return sXml;
			}
			break;
			
		case IBSEARCH_ASYNC03: //Conversion Table 변경시 Standard Format Sheet Title 재조회.
			if(validateForm(sheetObj,formObj,sAction)){
				formObj.f_cmd.value=SEARCH06;
				var sParam=FormQueryString(formObj);
				var sXml=sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
				
				var tmpLadenTpSzNm = ComGetEtcData(sXml, "ladenTpSzNm");
				var tmpEmptyTpSzNm = ComGetEtcData(sXml, "emptyTpSzNm");
				
				gLadenTpSzHeadTitle = tmpLadenTpSzNm;
				gEmptyTpSzHeadTitle = tmpEmptyTpSzNm;
				
				document.form.laden_tpsz_datas.value = gLadenTpSzHeadTitle;
				document.form.empty_tpsz_datas.value = gEmptyTpSzHeadTitle;
				
				
				 for(var i=1; i<sheetObjects.length; i++){
					 sheetObjects[i] = sheetObjects[i].Reset();
					 ComConfigSheet (sheetObjects[i] );
					 initSheet(sheetObjects[i],i+1);
					 sheetObjects[i].SetWaitImageVisible(0);
					 ComEndConfigSheet(sheetObjects[i]);
				 }				
			}
			break;
        case    IBSEARCH_ASYNC04:       //Standard Format Backendjob Result
            sheetObj.SetWaitImageVisible(1);
            
            formObj.f_cmd.value=SEARCH08;
            var aryPrefix = new Array("t2sheet1_", "t2sheet2_"); // prefix
            var sParam=FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix);
            
            
            var sXml=sheetObj.GetSearchData("FNS_JOO_0084GS.do", sParam);
            var arrXml = sXml.split("|$$|");
            for ( var inx = 1; inx <= arrXml.length; inx++) { 
                sheetObjects[inx].LoadSearchData(arrXml[(inx-1)], { Sync : 1 });
            }
            ComOpenWait(false);
            
            break;
    }
}



/**
 * BackEndJob : retrieve<br>
 * 
 * @param sheetObj
 */
function doActionCntrExcelResult() {
	var sheetObj = sheetObjects[0];
	var sXml = sheetObj.GetSearchData("FNS_JOO_0084GS.do?f_cmd="+SEARCH02+"&backendjob_key="+ComGetObjValue(document.form.backendjob_key));
	var sJbStsFlg = ComGetEtcData(sXml, "jb_sts_flg");
	if (!ComIsNotErrMessage(sheetObj, sXml)) {
		clearInterval(intervalId);
		ComOpenWait(false);
		return;
	}
	if ("SUCCESS"==sJbStsFlg) {
		clearInterval(intervalId);
		getCntrExcelBackEndJobLoadFile();
	} else if ("FAIL"==sJbStsFlg) {
		clearInterval(intervalId);
		ComOpenWait(false);
		ComShowMessage(ComGetSelectSingleNode(sXml,"MESSAGE"));
	}
}

function getCntrExcelBackEndJobLoadFile() {
	document.form.f_cmd.value = COMMAND01;
	document.form.action = "FNS_JOO_0084DL.do";
	document.form.submit();
	ComOpenWait(false);
}

function doActionStandardExcelResult() {
	var sheetObj = sheetObjects[1];
	var sXml = sheetObj.GetSearchData("FNS_JOO_0084GS.do?f_cmd="+SEARCH02+"&backendjob_key="+ComGetObjValue(document.form.backendjob_key));
	var sJbStsFlg = ComGetEtcData(sXml, "jb_sts_flg");
	if (!ComIsNotErrMessage(sheetObj, sXml)) {
		clearInterval(intervalId);
		ComOpenWait(false);
		return;
	}
	if ("SUCCESS"==sJbStsFlg) {
		clearInterval(intervalId);
		getStandardExcelBackEndJobLoadFile();
	} else if ("FAIL"==sJbStsFlg) {
		clearInterval(intervalId);
		ComOpenWait(false);
		ComShowMessage(ComGetSelectSingleNode(sXml,"MESSAGE"));
	}
}

function getStandardExcelBackEndJobLoadFile() {
	document.form.f_cmd.value = COMMAND02;
	document.form.action = "FNS_JOO_0084_01DL.do";
	document.form.submit();
	ComOpenWait(false);
}

function doActionStandardResult() {
    var sheetObj = sheetObjects[1];
    var sXml = sheetObj.GetSearchData("FNS_JOO_0084GS.do?f_cmd="+SEARCH02+"&backendjob_key="+ComGetObjValue(document.form.backendjob_key));
    var sJbStsFlg = ComGetEtcData(sXml, "jb_sts_flg");
    if (!ComIsNotErrMessage(sheetObj, sXml)) {
        clearInterval(intervalId);
        ComOpenWait(false);
        return;
    }
    if ("SUCCESS"==sJbStsFlg) {
        clearInterval(intervalId);
        doActionIBSheet(sheetObj, document.form, IBSEARCH_ASYNC04); 
    } else if ("FAIL"==sJbStsFlg) {
        clearInterval(intervalId);
        ComOpenWait(false);
        ComShowMessage(ComGetSelectSingleNode(sXml,"MESSAGE"));
    }
}

function t1sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
    if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
    doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, FormQueryString(document.form), ++iPageNo);
}
function t2sheet1_OnSearchEnd(sheetObj, ErrMsg) {
	var prefix = "t2sheet1_"; 
	//sheetObj.SetSumText(0,prefix+"rlane_cd","TOTAL");
	//UI개선(201408 민정호)
    //sheetObj.ShowSubSum([{StdCol:prefix+"rlane_cd", SumCols:"8|12"}]);
	//Row 강제머지할 셀의 Row Index
    //Col 강제머지할 셀의 Column Index 
    //Rows 강제머지할 셀의 Row 개수
   	//Cols 강제머지할 셀의 Col 개수
	sheetObj.SetSumText(0,prefix+"type","TOTAL");
   	sheetObj.SetMergeCell(sheetObj.LastRow(), 0, 1, 6);
}
/**
 * EXcess 수식
 * TEU : Total
 *  >ROUND(IF(AG21-AN21>0,AG21-AN21,0),0)
 *  >Summary by Port(Total TEU) - Allocation(Slot) > 0 일때 Round(Summary by Port(Total TEU) - Allocation(Slot),0)
 * TEU : Laden
 *  Summary by Port(Total TEU) - Allocation(Slot) > 0 일때 Round(Summary by Port(Total TEU) - Allocation(Slot),0) - 
 *  Summary by Port(Ety TEU) < (Summary by Port(Total TEU) - Allocation(Slot)) ? Summary by Port(Ety TEU) : (Summary by Port(Total TEU) - Allocation(Slot))
 * TEU : Empty
 *  >ROUND(IF(AI21<AR21,AI21,AR21),0)
 *  >Summary by Port(Ety TEU) < (Summary by Port(Total TEU) - Allocation(Slot)) ? Summary by Port(Ety TEU) : (Summary by Port(Total TEU) - Allocation(Slot))
 * 
 * 
 * @param sheetObj
 * @param ErrMsg
 */
function t2sheet2_OnSearchEnd(sheetObj, ErrMsg) {
	//var prefix = "t2sheet2_";
	var prefix=sheetObj.id + "_"; 
	
	for(var i=sheetObj.HeaderRows(); i<=sheetObj.LastRow(); i++){
		/*sheetObj.SetCellEditable(i, prefix+"bs_slot"		, 1);
		sheetObj.SetCellEditable(i, prefix+"bs_rf"			, 1);
		sheetObj.SetCellEditable(i, prefix+"pri_slot"		, 1);
		sheetObj.SetCellEditable(i, prefix+"pri_plug"		, 1);
		*/
		sheetObj.SetColBackColor(prefix+"bs_slot"			,"#FFFF00");
		sheetObj.SetColBackColor(prefix+"bs_rf"				,"#FFFF00");
		sheetObj.SetColBackColor(prefix+"pri_slot"			,"#FFFF00");
		sheetObj.SetColBackColor(prefix+"pri_plug"			,"#FFFF00");
	
		
		var optiona 		= sheetObj.GetCellValue(i, prefix+"option_a");
		var sumRfPlug		= Number(sheetObj.GetCellValue(i, prefix+"sum_rf_plug"));
		var bsSlot 			= Number(sheetObj.GetCellValue(i, prefix+"bs_slot"));
		var bsRf 			= Number(sheetObj.GetCellValue(i, prefix+"bs_rf"));
		var excTeuTotal 	= Number(sheetObj.GetCellValue(i, prefix+"exc_teu_total"));
		var excTeuLdn 		= Number(sheetObj.GetCellValue(i, prefix+"exc_teu_ldn"));
		var excTeuEty 		= Number(sheetObj.GetCellValue(i, prefix+"exc_teu_ety"));
		var excDwtTeu 		= Number(sheetObj.GetCellValue(i, prefix+"exc_dwt_teu"));
		var excDwtRf 		= Number(sheetObj.GetCellValue(i, prefix+"exc_dwt_rf"));
		var priSlot 		= Number(sheetObj.GetCellValue(i, prefix+"pri_slot"));
		var priPlug 		= Number(sheetObj.GetCellValue(i, prefix+"pri_plug"));
		
		//Amount Buy+Excess Slots : amt_buy_exc_slots
		var tmpAmtBuyExcSlots = 0;
		//Excess TEU(Total) > Excess DWT(TEU)
		if(excTeuTotal > excDwtTeu) {
			//Excess TEU(Laden) * Price(Slot) + Excess TEU(Empty) * (Price(Slot)/2)
			tmpAmtBuyExcSlots = excTeuLdn * priSlot + excTeuEty * (priSlot/2);
		}else{
			//AU21*AW21 : Excess DWT(TEU) * Price(Slot)
			tmpAmtBuyExcSlots = excDwtTeu * priSlot;
		}
		//AP21*AW21 : Buy&Sell(Slot) * Price(Slot)
		tmpAmtUsedPlugs = tmpAmtUsedPlugs + (bsSlot * priSlot);
		tmpAmtUsedPlugs = getOptionAValue(optiona, tmpAmtBuyExcSlots);
		sheetObj.SetCellValue(i, prefix+"amt_buy_exc_slots", tmpAmtBuyExcSlots, 0);
		
		//Used Plugs : amt_used_plugs
		var tmpAmtUsedPlugs = 0;
		tmpAmtUsedPlugs = (sumRfPlug + excDwtRf + bsRf) * priPlug;
		tmpAmtUsedPlugs = getOptionAValue(optiona, tmpAmtUsedPlugs);
		sheetObj.SetCellValue(i, prefix+"amt_used_plugs", tmpAmtUsedPlugs, 0);
	}
	
}

function getOptionAValue(optiona, val){
	var val = Number(val);
	switch(optiona){
		case "OPTION1":
			return Math.ceil(val * 10) / 10;
			break;
		case "OPTION2":
		 	return ComRound(val, 2);
			break;
		case "OPTION3":
		 	return ComTrunc(val, 1);
			break;
		case "OPTION4":
		 	return ComTrunc(val, 2);
			break;
		default :
		 	return ComRound(val, 1);
			break;
	}
}
/**
 * 
 * @param sheetObj
 * @param Row
 * @param Col
 * @param Value
 * @param OldValue
 * @param RaiseFlag
 */
function t2sheet2_OnChange(sheetObj,Row,Col,Value, OldValue, RaiseFlag) {
	var prefix 	= sheetObj.id+"_"; 
	var sName	= sheetObj.ColSaveName(Col);
	var formObj	= document.form;
	//TODO 수식에 맞추어서 처리하도록 재정립해야 한다.
	
	//이전 값과 입력 값이 같으면 Skip.
	if(Value == OldValue) return;
	
	switch(sName){
		case prefix+"bs_slot":
		case prefix+"bs_rf":
		case prefix+"pri_slot":
		case prefix+"pri_plug":
			var bsSlot 			= Number(sheetObj.GetCellValue(Row, prefix+"bs_slot"));
			var bsRf 			= Number(sheetObj.GetCellValue(Row, prefix+"bs_rf"));
			var priSlot 		= Number(sheetObj.GetCellValue(Row, prefix+"pri_slot"));
			var priPlug 		= Number(sheetObj.GetCellValue(Row, prefix+"pri_plug"));
						
			var optiona 		= sheetObj.GetCellValue(Row, prefix+"option_a");
			var sumRfPlug		= Number(sheetObj.GetCellValue(Row, prefix+"sum_rf_plug"));
			var excTeuTotal 	= Number(sheetObj.GetCellValue(Row, prefix+"exc_teu_total"));
			var excTeuLdn 		= Number(sheetObj.GetCellValue(Row, prefix+"exc_teu_ldn"));
			var excTeuEty 		= Number(sheetObj.GetCellValue(Row, prefix+"exc_teu_ety"));
			var excDwtTeu 		= Number(sheetObj.GetCellValue(Row, prefix+"exc_dwt_teu"));
			var excDwtRf 		= Number(sheetObj.GetCellValue(Row, prefix+"exc_dwt_rf"));
			var allocSlot 		= Number(sheetObj.GetCellValue(Row, prefix+"alloc_slot"));
			var allocRf 		= Number(sheetObj.GetCellValue(Row, prefix+"alloc_rf"));
			var bsSlot 			= Number(sheetObj.GetCellValue(Row, prefix+"bs_slot"));
			var bsRf 			= Number(sheetObj.GetCellValue(Row, prefix+"bs_rf"));
			var priSlot 		= Number(sheetObj.GetCellValue(Row, prefix+"pri_slot"));
			var priPlug 		= Number(sheetObj.GetCellValue(Row, prefix+"pri_plug"));
			
						
		    //Excess DWT RF 재계산. : IF(AM21-AO21-AQ21>0,AM21-AO21-AQ21,0)
			var tmpExcDwtRf = 0;
			//AM21-AO21-AQ21>0 : Summary by Port(RF Plug) - Allocation(RF) - Buy&Sell(RF) > 0
			tmpExcDwtRf = sumRfPlug - allocRf - bsRf;
			if(tmpExcDwtRf > 0){
				sheetObj.SetCellValue(Row, prefix+"exc_dwt_rf", tmpExcDwtRf, 0);
				excDwtRf = tmpExcDwtRf;
			}else{
				sheetObj.SetCellValue(Row, prefix+"exc_dwt_rf", "0", 0);
				excDwtRf = 0;
			}
			
			//Buy+Excess Slots : (IF(AR21>AU21,AS21*AW21+AT21*(AW21/2),AU21*AW21))+(AP21*AW21)
			var tmpAmtBuyExcSlots = 0;
			//Excess TEU(Total) > Excess DWT(TEU)
			if(excTeuTotal > excDwtTeu) {
				//AS21*AW21+AT21*(AW21/2) : Excess TEU(Laden) * Price(Slot) + Excess TEU(Empty) * (Price(Slot)/2)
				tmpAmtBuyExcSlots = excTeuLdn * priSlot + excTeuEty * (priSlot/2);
			}else{
				//AU21*AW21 : Excess DWT(TEU) * Price(Slot)
				tmpAmtBuyExcSlots = excDwtTeu * priSlot;
			}
			//AP21*AW21 : Buy&Sell(Slot) * Price(Slot)
			tmpAmtBuyExcSlots = tmpAmtBuyExcSlots + (bsSlot * priSlot);
			tmpAmtBuyExcSlots = getOptionAValue(optiona, tmpAmtBuyExcSlots);
			sheetObj.SetCellValue(Row, prefix+"amt_buy_exc_slots", tmpAmtBuyExcSlots, 0);
			
			//Used Plugs 재계산. (Summary by Port(RF Plug) + Buy&Sell(RF) + DWT(RF)) * Price(Plug)
			var tmpAmtUsedPlugs = 0;
			tmpAmtUsedPlugs = (sumRfPlug  +  bsRf + excDwtRf) * priPlug;
			tmpAmtUsedPlugs = getOptionAValue(optiona, tmpAmtUsedPlugs);
			sheetObj.SetCellValue(Row, prefix+"amt_used_plugs", tmpAmtUsedPlugs, 0);
			
			break;
	}
}
function t2sheet3_OnSearchEnd(sheetObj, ErrMsg) {
	var prefix = "t2sheet3_"; 
	//sheetObj.SetSumText(0,prefix+"rlane_cd","TOTAL");
	//UI개선(201408 민정호)
    //sheetObj.ShowSubSum([{StdCol:prefix+"rlane_cd", SumCols:"8|12"}]);
	sheetObj.SetSumText(0,prefix+"type","TOTAL");
   	sheetObj.SetMergeCell(sheetObj.LastRow(), 0, 1, 6);
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch ( sAction ){
             case IBSEARCH :
            	 if (!ComChkValid(formObj)) return false;
                 if(ComIsNull(vsl_cd.value)){
                	 ComShowCodeMessage('JOO00116', "Vessel Code");
                	 vsl_cd.focus();
                	 return false;
                 } else if(ComIsNull(voy_no.value)){
                	 ComShowCodeMessage('JOO00116', "Voyage No");
                	 voy_no.focus();
                	 return false;
                 }
                 /*else if(ComIsNull(dir_cd.value)){
                	 ComShowCodeMessage('VSK00027', "Direction Code");
                	 dir_cd.focus();
                	 return false;
                 }*/
                 
                 if(beforetab == 1){
                	 if(ComIsNull(slan_cd.value)){
                    	 ComShowCodeMessage('JOO00116', "Carrier");
                    	 voy_no.focus();
                    	 return false;
                     }
                	 
                	 return true;
                	 if(ComIsNull(pre_vsl_cd.value)){
                    	 ComShowCodeMessage('JOO00116', "Previous Vessel Code");
                    	 pre_vsl_cd.focus();
                    	 return false;
                     } else if(ComIsNull(pre_voy_no.value)){
                    	 ComShowCodeMessage('JOO00116', "Previous Voyage No.");
                    	 pre_voy_no.focus();
                    	 return false;
                     } else if(ComIsNull(pre_dir_cd.value)){
                    	 ComShowCodeMessage('VSK00027', "Previous Direction Code");
                    	 pre_dir_cd.focus();
                    	 return false;
                     } else if(ComIsNull(lst_port.value)){
                    	 ComShowCodeMessage('VSK00027', "Last Port");
                    	 lst_port.focus();
                    	 return false;
                     } else if(ComIsNull(lst_clpt_ind_seq.value)){
                    	 ComShowCodeMessage('VSK00027', "Last Port Clpt Ind Seq.");
                    	 lst_clpt_ind_seq.focus();
                    	 return false;
                     }
                 }
                 break;
             case IBSEARCH_ASYNC02:
            	 if (!ComChkValid(formObj)) return false;
                 if(ComIsNull(vsl_cd.value)){
                	 ComShowCodeMessage('JOO00116', "Vessel Code");
                	 vsl_cd.focus();
                	 return false;
                 } else if(ComIsNull(voy_no.value)){
                	 ComShowCodeMessage('JOO00116', "Voyage No.");
                	 voy_no.focus();
                	 return false;
                 }
            	 break;
        }
    }
    return true;
}
/**
 * Checking Vessel Code is exist in MDM_VSL_CNTR
 * 
 * @param sheetObj
 * @param formObj
 * @return
 */
function isCheckVslCd(sheetObj, formObj){
	if(formObj.vsl_cd.value == null || formObj.vsl_cd.value == undefined || formObj.vsl_cd.value == "") return false;
	var sXml=doActionIBSheet(sheetObj, formObj, IBSEARCH_ASYNC01);
	var chkVslCd=ComGetEtcData(sXml, "vsl_chk");
	if(chkVslCd == "Y"){
		return true;
	}else{
		sheetObj.LoadSearchData(sXml,{Sync:1} );
		formObj.vsl_cd.value="";
		return false;
	}
}
function codeChangedRemove(sheetObj, formObj){
	formObj.voy_no.value="";
	formObj.dir_cd.value="";
	formObj.slan_cd.value="";
	
	//sheetObj.RemoveAll();
}
function getPreviousVvdAndLastPort(){
	var sheetObj = sheetObjects[0];
	doActionIBSheet(sheetObj, document.form, IBSEARCH_ASYNC02);
}
function initSearchReset(sheetObj) {
	ComResetAll();
	for (i=0; i<sheetObjects.length; i++){
        sheetObjects[i].RemoveAll();
    }
	
	if (beforetab == 0) {
		initConditionObject("C");
	}else{
		initConditionObject("S");
	}
	
}
function getVslCdData(obj){
	
	if(obj){
		var rtnDatas=obj[0];
		if(rtnDatas){
			if(rtnDatas.length > 0){
				document.form.vsl_cd.value=rtnDatas[1];
			}
		}
	}
}
function getVvdData(obj){
	if(obj){
		var rtnDatas=obj[0];
		if(rtnDatas){
			if(rtnDatas.length > 0){
				document.form.voy_no.value=rtnDatas[2];
				//document.form.dir_cd.value=rtnDatas[3];
				
            	if("" != document.form.voy_no.value && beforetab == 1){
            		getPreviousVvdAndLastPort();
            	}
			}
		}
	}
}
function getPreVslCdData(obj){	
	if(obj){
		var rtnDatas=obj[0];
		if(rtnDatas){
			if(rtnDatas.length > 0){
				document.form.pre_vsl_cd.value=rtnDatas[1];
			}
		}
	}
}
function getPreVvdData(obj){
	if(obj){
		var rtnDatas=obj[0];
		if(rtnDatas){
			if(rtnDatas.length > 0){
				document.form.pre_voy_no.value=rtnDatas[2];
				document.form.pre_dir_cd.value=rtnDatas[3];
			}
		}
	}
}

/**
 * Setting Carrier Code
 * @param sCrrCd
 * @return
 */
function returnCrrCdHelp(sCrrCd){
	var formObj=document.form;
	if(sCrrCd != null && sCrrCd != undefined && sCrrCd != ""){
		formObj.slan_cd.value=sCrrCd;
	}else{
		formObj.slan_cd.value="";
	}
	formObj.slan_cd.value=formObj.slan_cd.value.substring(0,3);
}

function initConditionObject(flag){
	var formObj = document.form;
	//formObj.voy_no.value="";
	//formObj.dir_cd.value="";
	//formObj.slan_cd.value="";
	
	//formObj.pre_vsl_cd.value = "";
	//formObj.pre_voy_no.value = "";
	//formObj.pre_dir_cd.value = "";
	//formObj.lst_port.value = "";
	//formObj.lst_clpt_ind_seq.value="";
	
	if("C" == flag){//Container List Tab 설정시.
		formObj.dir_cd.className="input1";
		formObj.pre_vsl_cd.className="input";
		formObj.pre_voy_no.className="input";
		formObj.pre_dir_cd.className="input";
		formObj.lst_port.className="input";
		formObj.lst_clpt_ind_seq.className="input";
		formObj.slan_cd.className="input";
		
		formObj.dir_cd.readOnly=false;
		formObj.pre_vsl_cd.readOnly=true;
		formObj.pre_voy_no.readOnly=true;
		formObj.pre_dir_cd.readOnly=true;
		formObj.lst_port.readOnly=true;
		formObj.lst_clpt_ind_seq.readOnly=true;
		
		sheetObjects[1].RemoveAll();
		sheetObjects[2].RemoveAll();
		sheetObjects[3].RemoveAll();
		
		ComBtnDisable("btn_pre_vvd_search");
		
	}else if("S" == flag){//Standard Format Tab 설정시.
		formObj.dir_cd.value="";
		
		formObj.dir_cd.className="input";
		formObj.pre_vsl_cd.className="input";
		formObj.pre_voy_no.className="input";
		formObj.pre_dir_cd.className="input";
		formObj.lst_port.className="input";
		formObj.lst_clpt_ind_seq.className="input";
		formObj.slan_cd.className="input1";

		formObj.dir_cd.readOnly=true;
		formObj.pre_vsl_cd.readOnly=false;
		formObj.pre_voy_no.readOnly=false;
		formObj.pre_dir_cd.readOnly=false;
		formObj.lst_port.readOnly=false;
		formObj.lst_clpt_ind_seq.readOnly=false;
		
		sheetObjects[0].RemoveAll();
		
		ComBtnEnable("btn_pre_vvd_search");
	}
}

function makeExcelSheet(){
	excelSheetObj = sheetObjects[4];
	var iStartRow = 0;
	var arrLadenTpSz=gLadenTpSzHeadTitle.split("|");
    var arrEmptyTpSz=gEmptyTpSzHeadTitle.split("|");
    var arrSheetTitleNm = new Array("ROB From Previous Voyage","Operation Summary Report","ROB to next Voyage");
    
    var ladenLoopCnt = arrLadenTpSz.length;
    var emptyLoopCnt = arrEmptyTpSz.length;
    var ladenTitle = "";
    var emptyTitle = "";
    
    for ( var i=0; i < ladenLoopCnt; i++) {
    	ladenTitle += "|Laden";
    }
    for ( var i=0; i < emptyLoopCnt; i++) {
    	emptyTitle+= "|Empty";
    }
    
	//ROB from previous Voyage Grid.
	//0,1 row : title, 그외 : Data 
    var preHeadTitle1  ="|Seq.|Voy|Leg|Port|Sq#|Type" + ladenTitle + emptyTitle + "|Wgt";
	var preHeadTitle2  ="|Seq.|Voy|Leg|Port|Sq#|Type" + gLadenTpSzHeadTitle + gEmptyTpSzHeadTitle + "|Wgt";
	var arrPreHeadNm1 =  preHeadTitle1.split("|");
	var arrPreHeadNm2 =  preHeadTitle2.split("|");

	//excelSheetObj.RenderSheet(0);	
	//ComConfigSheet (excelSheetObj);
    //initSheet(excelSheetObj,5);       
    //ComEndConfigSheet(excelSheetObj);
     
	with(excelSheetObj){	
		//DataInsert(-1);//title
		//DataInsert(-1);//head title1
		//DataInsert(-1);//head title2
		
		for(var i=2; i <= sheetObjects[1].LastRow() ; i++){
			DataInsert(-1);//head title2
		}
		
		//SetCellValue(0, 0, arrSheetTitleNm[0],0);
		/*for ( var i=0; i < arrPreHeadNm1.length; i++) {
			 SetCellValue(1, i, arrPreHeadNm1[i]);
		}
		for ( var i=0; i < arrPreHeadNm2.length; i++) {
			 SetCellValue(2, i, arrPreHeadNm2[i]);
		}*/
		
		for(var idxRow = 2; idxRow <= sheetObjects[1].LastRow(); idxRow++){
			for(var idxCol = 0; idxCol <= sheetObjects[1].LastCol(); idxCol++){
				var val = sheetObjects[1].GetCellValue(idxRow, idxCol);
				SetCellValue(idxRow, idxCol, val, 0); 
			}
		}
		
	}
	//excelSheetObj.RenderSheet(1);
	//excelSheetObj.Down2Excel({ SheetDesign:1, HiddenColumn:1,Merge:1});	
	
}

function setConversion(){
	doActionIBSheet(sheetObjects[2],document.form,IBSEARCH_ASYNC03);
}

function resizeSheet(){
	if(beforetab == 0){
		ComResizeSheet(sheetObjects[0]);
	}else{
		ComResizeSheet(sheetObjects[2]);
	}
}
        