/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   FNS_JOO_0081.js
*@FileTitle  : Booking Inquiry 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/****************************************************************************************
 Event code : INIT=0; ADD=1; SEARCH=2; SEARCHLIST=3;
              MODIFY=4; REMOVE=5; REMOVELIST=6 MULTI=7
              OTHER CASE : COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/**
 * @extends 
 * @class FNS_JOO_0081 : business script for FNS_JOO_0081
 */
//common global variable
var sheetObjects=new Array();
var sheetCnt=0;
var colCnt=0;
var comboObjects=new Array();
var comboCnt=0;
// Event handler processing by button click event */
document.onclick=processButtonClick;
// Event handler processing by button name */
function processButtonClick(){

	var sheetObject1=sheetObjects[0];
    var formObject=document.form;
    try {
	    var srcName=ComGetEvent("name");
	    switch(srcName) {
	    	case "btn_Retrieve":
	    		doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
	            break;
	    	case "btn_DownExcel":
	    		doActionIBSheet(sheet1,document.form,IBDOWNEXCEL);
	    		//sheet1.Down2Excel( {DownCols: makeHiddenSkipCol(sheet1), SheetDesign:1,Merge:1 });
	            break;
	    } // end switch
    }catch(e) {
        if( e == "[object Error]") {
            ComShowMessage(OBJECT_ERROR);
        } else {
            ComShowMessage(e);
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
/**
 * initializing sheet
 * implementing onLoad event handler in body tag
 * adding first-served functions after loading screen.
 */
function loadPage() {
    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        sheetObjects[i].SetWaitImageVisible(0);
        ComEndConfigSheet(sheetObjects[i]);
    }
    // initializing IBMultiCombo
    for(var k=0; k<comboObjects.length; k++){
        initCombo(comboObjects[k], k + 1);
    }
    initControl();
    document.form.vvd.focus();
}
 /**
 * loading HTML Control event <br>
 * {@link #loadPage} function call this. so IBSheet Object is initialized. <br>
 * @param {ibsheet} sheetObj    IBSheet Object
 * @param {int}     sheetNo     sequence number in sheetObjects array
 **/
function initControl() {
    var formObject=document.form;
    axon_event.addListenerForm  ('keydown' , 'ComKeyEnter',  formObject);
    axon_event.addListenerForm  ('blur'   , 'fnObjKeyUp', formObject );
    //axon_event.addListenerForm  ('keypress', 'fnObjKeyPress', formObject );
}
/**
 * setting sheet initial values and header
 * param : sheetObj, sheetNo
 * adding case as numbers of counting sheets
 */
function initSheet(sheetObj,sheetNo, colCnt , sXmlTitle) {
    var cnt=0;
    var formObj=document.form;
    switch(sheetNo) {
        case 1:      // sheet1 init
            with(sheetObj){
                  // if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);
                  if(colCnt == undefined){
                        var HeadTitle1="|LDG PORT|LDG PORT|";
                        var headCount=ComCountHeadTitle(HeadTitle1);

                        SetConfig( { SearchMode:2, Page:20, MergeSheet:5 ,FrozenCol:3, DataRowMerge:1 } );

                        var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                        var headers = [ { Text:HeadTitle1, Align:"Center"} ];
                        InitHeaders(headers, info);

                        var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
                         {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                         {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"type",    KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
                         
                        InitColumns(cols);
                        //SetSheetHeight(520);
                        resizeSheet();
                        return;
                  }
                  var HeadTitle1="|LDG PORT|LDG PORT|";
                  var HeadTitle2="|LDG PORT|LDG PORT|";
                  var HeadTitle3="|LDG PORT|LDG PORT|";
                  var fixTitlePerOne="20_qty|40_qty|hc_qty|45_qty";
                  var addFixTitle="ac_ttl_20_qty|ac_ttl_40_qty|ac_ttl_hc_qty|ac_ttl_45_qty|ac_teu|ac_mt_teu|ttl_20_qty|ttl_40_qty|ttl_hc_qty|ttl_45_qty|teu|obd|teu_bak|mt_20_cnt|mt_40_cnt|mt_hc_cnt|mt_45_cnt|mt_type_teu|mt_teu";

                  HeadTitle1 += fnSetTitle( "head1", sXmlTitle);
                  HeadTitle2 += fnSetTitle( "head2", sXmlTitle);
                  HeadTitle3 += fnSetTitle( "head3", sXmlTitle);

                  SetConfig( { SearchMode:2, Page:100, FrozenCol:3,  MergeSheet:7 ,DataRowMerge:0 } );

                  var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
                  var headers = [ { Text:HeadTitle1, Align:"Center"},
                          { Text:HeadTitle2, Align:"Center"},
                          { Text:HeadTitle3, Align:"Center"} ];
                  InitHeaders(headers, info);

                  var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:1,   SaveName:"Status",         Wrap:1 },
                   {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:1,   SaveName:"pol_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 },
                   {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"type",           KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 } ];
                  
                   var CalcuLogic20 = "";
                   var CalcuLogic40 = "";
                   var CalcuLogichc = "";
                   var CalcuLogic45 = "";
                   
                   
                  
                 for (var i=0; i<colCnt; i++) {
                	 for(var j=0;j<fixTitlePerOne.split("|").length;j++ ){
                		 	var aFixTitlePerOne = fixTitlePerOne.split("|");
                		 	var polCdTitle =  "pod"+(i+1)+"_"+aFixTitlePerOne[j] ;
                		 	cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:polCdTitle,       KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:0,   InsertEdit:1,   Wrap:1 });
                	 }
                	 if(i<colCnt-1){
		                  CalcuLogic20 += "|pod"+(i+1)+"_20_qty|+";
		                  CalcuLogic40 += "|pod"+(i+1)+"_40_qty|+";
		                  CalcuLogichc += "|pod"+(i+1)+"_hc_qty|+";
		                  CalcuLogic45 += "|pod"+(i+1)+"_45_qty|+";
                	 }else{
		                  CalcuLogic20 += "|pod"+(i+1)+"_20_qty|";
		                  CalcuLogic40 += "|pod"+(i+1)+"_40_qty|";
		                  CalcuLogichc += "|pod"+(i+1)+"_hc_qty|";
		                  CalcuLogic45 += "|pod"+(i+1)+"_45_qty|";
                	 }
                 }
                 
                   var  ratehc  = formObj.ratehc.value;
                   var  rate45  = formObj.rate45.value;

                   
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ac_ttl_20_qty",  KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ac_ttl_40_qty",  KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ac_ttl_hc_qty",  KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ac_ttl_45_qty",  KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  
                  var CalcuLogicAcTeu = "|ac_ttl_20_qty|+|ac_ttl_40_qty|*2+|ac_ttl_hc_qty|*"+ratehc+"+|ac_ttl_45_qty|*"+rate45;
                  cols.push({Type:"Int",       Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ac_teu",         KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ac_mt_teu",      KeyField:0,   CalcLogic:CalcuLogicAcTeu,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ttl_20_qty",     KeyField:0,   CalcLogic:CalcuLogic20,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ttl_40_qty",     KeyField:0,   CalcLogic:CalcuLogic40,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ttl_hc_qty",     KeyField:0,   CalcLogic:CalcuLogichc,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ttl_45_qty",     KeyField:0,   CalcLogic:CalcuLogic45,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  
                  var CalcuLogicTeu = "|ttl_20_qty|+|ttl_40_qty|*2+|ttl_hc_qty|*"+ratehc+"+|ttl_45_qty|*"+rate45;
                  cols.push({Type:"Int",       Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"teu",            KeyField:0,   CalcLogic:"",   Format:"NullInteger", PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"obd",            KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mt_20_cnt",      KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mt_40_cnt",      KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mt_hc_cnt",      KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mt_45_cnt",      KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  
                  var CalcuLogicMt = "|mt_20_cnt|+|mt_40_cnt|*2+|mt_hc_cnt|*"+ratehc+"+|mt_45_cnt|*"+rate45;
                  cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mt_type_teu",    KeyField:0,   CalcLogic:CalcuLogicMt,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  cols.push({Type:"Int",       Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"mt_teu",         KeyField:0,   CalcLogic:"",   Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
                  
                  cols.push({Type:"Int",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"teu_bak",        KeyField:0,   CalcLogic:CalcuLogicTeu,Format:"Integer",     PointCount:0,   UpdateEdit:1,   InsertEdit:1,   Wrap:1 });
       
                  InitColumns(cols);
                  SetMergeCell(0, 1, 3, 2);
                  SetMergeCell(1,  SaveNameCol( "ac_teu" ) 	, 2, 1);
                  SetMergeCell(1,  SaveNameCol( "teu" ) 	, 2, 1);
                  SetMergeCell(0,  SaveNameCol( "mt_teu" ) 	, 3, 1);
        }
              break;
    }
 }
function searchData(){
	 var sheetObj = sheetObjects[0];
 	 var formObj = document.form
	 formObj.f_cmd.value=SEARCHLIST01;
     var param=FormQueryString(formObj);
     var sXml=sheetObj.GetSearchData("FNS_JOO_0081GS.do", param , {Sync:1});

     var aXml=sXml.split("|$$|");
      colCnt=ComGetTotalRows( aXml[0] );
     ComOpenWait(false);
     var TRANS_RESULT_KEY=ComGetEtcData(aXml[0], "TRANS_RESULT_KEY");
     if(TRANS_RESULT_KEY!="S"){
         sheetObj.LoadSearchData(aXml[0],{Sync:1} );
         return;
     }
     if(colCnt == "0" ){
     	sheetObj = sheetObj.Reset();
     	sheetObjects[0] = sheetObj;
        initSheet(sheetObj, 1 );
        sheetObj.LoadSearchData(aXml[0],{Sync:1} );
        return;
     }
     sheetObj = sheetObj.Reset();
     sheetObjects[0] = sheetObj;
     ComOpenWait(true);
     initSheet(sheetObj, 1, colCnt.parseInt(),  aXml[0]);
     sheetObj.LoadSearchData(aXml[1],{Sync:1} );
     
     sheetObj.RenderSheet(0);
     
     fnMerge(colCnt);      
     fnCalcTotal(colCnt);
     
     sheetObj.RenderSheet(1);
     
     ComOpenWait(false);
}
// handling sheet process
function doActionIBSheet(sheetObj,formObj,sAction) {
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
        case    IBSEARCH:      //retrieve
            if( !validateForm(sheetObj,formObj,sAction) ){return;}
            ComOpenWait(true);
            setTimeout("searchData();", 100);
            
           
            break; 
        case    IBDOWNEXCEL : //EXCEL DOWNLOAD
            /*Title 엑셀 다운. */
            var paramObj=new Object();
            paramObj.cols=30;
            ComOpenWait(true);
            var title="VSL/VO : "+formObj.vvd.value;
            var RateHC="HC Rate : "+formObj.ratehc.value;
            var Rate45="45 Rate : "+formObj.rate45.value;
            paramObj.title=title+"     "+RateHC+"    "+Rate45;
            var url=ComJooGetPgmTitle( sheetObj, paramObj);
            sheetObj.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObj), SheetDesign:1,Merge:1, Xml:sheet1.GetSearchData(url)});
            ComOpenWait(false);
            break;
        case    IBSEARCH_ASYNC01 : //VSL_VO CODE KEYUP EVENT

            formObj.f_cmd.value=SEARCH14;
            var code=formObj.vvd.value;
            var param=FormQueryString(formObj)+"&code="+code;
            var sXml=sheetObj.GetSearchData("JOOCommonGS.do", param);
            var rowCnt=ComGetTotalRows( sXml );
            	if( rowCnt == "0"){
                	sheetObj.RemoveAll();
                	ComShowCodeMessage("JOO00117", "VSL/VO");
                	
            	return;
            }else{
            //var objRetBtn = document.getElementById("btn_retrieve");
            //objRetBtn.fireEvent("onclick");
            }
            break;
    }
}
function fnMerge(colCnt){
	var sheetObj = sheetObjects[0];
	//Color 처리.
	var col_teu 			= sheetObj.SaveNameCol( "teu" );
    var col_mt_teu 			= sheetObj.SaveNameCol( "mt_teu" );
    var col_ac_ttl_20_qty 	= sheetObj.SaveNameCol( "ac_ttl_20_qty" );
    var col_ac_mt_teu 		= sheetObj.SaveNameCol( "ac_mt_teu" );
    var col_ac_ttl_20_qty 	= sheetObj.SaveNameCol( "ac_ttl_20_qty" );
    var col_ac_teu 			= sheetObj.SaveNameCol( "ac_teu" );

    var bgColor=true;
    var iHeaderRows = sheetObj.HeaderRows();
    var iLastRow = sheetObj.LastRow();
    
    for(var idx=iHeaderRows;idx <= iLastRow;true ){
    	if(sheetObj.GetCellValue(idx,"pol_cd").indexOf("TOTAL") > -1  ){
    		sheetObj.SetRowBackColor(idx+0,"#FCDCEE");
    		sheetObj.SetRowBackColor(idx+1,"#FCDCEE");
    		sheetObj.SetRowBackColor(idx+2,"#FCDCEE");
    		sheetObj.SetRowBackColor(idx+3,"#FCDCEE");
            idx+=4;
            if(sheetObj.GetCellValue(idx,"pol_cd" ) == "TEU"  ){
            	sheetObj.SetRowBackColor(idx+0,"#FAC9E4");
                idx+=1;
            }
            continue;
        }
        if( bgColor  ){
        	sheetObj.SetRowBackColor(idx+0,"#FEFA91");
        	sheetObj.SetRowBackColor(idx+1,"#FEFA91");
        	sheetObj.SetRowBackColor(idx+2,"#FEFA91");
        	sheetObj.SetRowBackColor(idx+3,"#FEFA91");
            idx+=4;
            bgColor=false;
            continue;
        }else{
            bgColor=true;
            idx+=4;
        }
    }
    /* handling TEU set
     *  1. Data 세로 처리하면서,, Data 가로 TEU도 같이 처리.
     */
    var teuIndx=0;
    //ObjId.SetMergeCell(Row, Col, Rows, Cols, Refresh)
    for(var i=iHeaderRows;i <= iLastRow; i++ ){
    	var teusum		=0;
    	var acteusum	=0;
    	var topidx		=i;
    	var cntrsizecnt	=4;  //"20'|40'|HC|45" (4)COLUMN
    	var cntrtypecnt	=4;  //D, RF, AK, Q  (4)LINE
    	var wtotalteucnt=5;  //WTOTAL(4) + TEU(1) LINE
    	var roopCnt		=4;
    	var est1stcount	=wtotalteucnt+cntrtypecnt;  // (9) Line
     
        if(sheetObj.GetCellValue( i,"pol_cd" ).search( "TOTAL" ) > -1  ){
        	sheetObj.SetMergeCell( topidx ,  col_teu			, 5, (col_mt_teu - col_teu + 1)				, 0 ); //Data 가로 TEU->맨 우측.
        	sheetObj.SetMergeCell( topidx ,  col_ac_ttl_20_qty 	, 5, (col_ac_mt_teu - col_ac_ttl_20_qty + 1), 0 ); //AC Data 가로  TEU
        }else if(sheetObj.GetCellValue(   topidx,"pol_cd" ) == "TEU"  ){
        	teuIndx=topidx; 
        	continue;                    	 
        }else{  //우측 TEU,  추가요건  : MT TEU와 같이처리
        	
        	//Accumulative Total calculating  -> QUERY에서 SETTING
            for(var j=0;j< cntrtypecnt;j++){
            	sheetObj.SetCellValue( topidx+j, "ac_ttl_20_qty" ,sheetObj.GetCellValue( topidx+j, "ttl_20_qty" ), 0);
            	sheetObj.SetCellValue( topidx+j, "ac_ttl_40_qty" ,sheetObj.GetCellValue( topidx+j, "ttl_40_qty" ), 0);
            	sheetObj.SetCellValue( topidx+j, "ac_ttl_hc_qty" ,sheetObj.GetCellValue( topidx+j, "ttl_hc_qty" ), 0);
            	sheetObj.SetCellValue( topidx+j, "ac_ttl_45_qty" ,sheetObj.GetCellValue( topidx+j, "ttl_45_qty" ), 0);
            }
            
            //Accumulative Qty total = pre qty total + current qty total - pre pol/matching pod discharge qty
            if(topidx >= iHeaderRows && teuIndx == 0){   // West Accumulative Qty
            	if (topidx == iHeaderRows){
            		cntrtypecnt=0;
                }else{
                	cntrtypecnt=4;
                }
                
            	fnCalcMethod(topidx, roopCnt, cntrtypecnt, "pod"+ComParseInt((topidx/cntrsizecnt)+1));    //cntrtypecnt="D, RF, AK, Q"
            } else if(topidx == teuIndx+1) {   // EAST 1'ST POL Accumulative Qty
            	fnCalcMethod(topidx, roopCnt, est1stcount, "pod"+ComParseInt(((topidx-wtotalteucnt)/cntrsizecnt)+1));    //cntrtypecnt="D, RF, AK, Q"
            } else if(topidx > teuIndx+4) {    // EAST 2'nd POL Accumulative Qty below
            	fnCalcMethod(topidx, roopCnt, cntrtypecnt, "pod"+ComParseInt(((topidx-wtotalteucnt)/cntrsizecnt)+1));    //cntrtypecnt="D, RF, AK, Q"
            }
            
            //세로  TEU merge  처리.
            teusum += eval( sheetObj.GetCellValue(topidx  ,"teu_bak" ) );
            teusum += eval( sheetObj.GetCellValue(topidx+1,"teu_bak" )  );
            teusum += eval( sheetObj.GetCellValue(topidx+2,"teu_bak" ) );
            teusum += eval( sheetObj.GetCellValue(topidx+3,"teu_bak" ) );
            
            sheetObj.SetMergeCell( topidx 	,  col_teu , 4, 1);
            sheetObj.SetCellValue( topidx	, "teu" ,teusum, 0);
            sheetObj.SetCellFont("FontBold"	, topidx,"teu",1);
            
            //세로 Data EMPTY 머지 처리.
            var emptysum=0;
            emptysum += eval( sheetObj.GetCellValue(topidx  ,"mt_type_teu" ) );
            emptysum += eval( sheetObj.GetCellValue(topidx+1,"mt_type_teu" ) );
            emptysum += eval( sheetObj.GetCellValue(topidx+2,"mt_type_teu" ) );
            emptysum += eval( sheetObj.GetCellValue(topidx+3,"mt_type_teu" ) );
            
            sheetObj.SetMergeCell( topidx ,  col_mt_teu , 4, 1, 0);
            sheetObj.SetCellValue( topidx, "mt_teu" ,emptysum, 0);
            sheetObj.SetCellFont("FontBold", topidx,"mt_teu",1);
            
            //Accumulative Data 세로 TEU 머지 처리.
            /*
            SetCellValue( topidx,   "ac_teu" ,GetCellValue( topidx,  "ac_mt_teu" ));
            SetCellValue( topidx+1, "ac_teu" ,GetCellValue( topidx+1,"ac_mt_teu" ));
            SetCellValue( topidx+2, "ac_teu" ,GetCellValue( topidx+2,"ac_mt_teu" ));
            SetCellValue( topidx+3, "ac_teu" ,GetCellValue( topidx+3,"ac_mt_teu" ));
            */
            /*
            acteusum += eval( GetCellValue(topidx  ,"ac_teu" ) );
            acteusum += eval( GetCellValue(topidx+1,"ac_teu" ) );
            acteusum += eval( GetCellValue(topidx+2,"ac_teu" ) );
            acteusum += eval( GetCellValue(topidx+3,"ac_teu" ) );
            */
            acteusum += parseFloat( sheetObj.GetCellValue(topidx  ,"ac_mt_teu" ) );
            acteusum += parseFloat( sheetObj.GetCellValue(topidx+1,"ac_mt_teu" ) );
            acteusum += parseFloat( sheetObj.GetCellValue(topidx+2,"ac_mt_teu" ) );
            acteusum += parseFloat( sheetObj.GetCellValue(topidx+3,"ac_mt_teu" ) );
    
            sheetObj.SetMergeCell( topidx ,  col_ac_teu , 4, 1, 0);
            sheetObj.SetCellValue( topidx, "ac_teu" ,acteusum, 0);
            sheetObj.SetCellFont("FontBold", topidx,"ac_teu",1);
        }
        i+=3;                     
    }
}

function fnCalcMethod(topidx, roopCnt, calcMinus, calcLogic) {
	var sheetObj = sheetObjects[0];

    var rowsSaveName=["_20_qty", "_40_qty", "_hc_qty", "_45_qty"];
	for(var j=0; j<roopCnt; j++){
        var currRow=topidx+j;    
        
        for (var k=0; k<rowsSaveName.length; k++) {  
        	var preQtyTotal=0
        	if (calcMinus == 0){
        		preQtyTotal=0;
        	}else{
        		preQtyTotal=ComParseInt(sheetObj.GetCellValue(currRow - calcMinus, "ac_ttl" + rowsSaveName[k]));
        	}
        	var currentQtyTotal=ComParseInt(sheetObj.GetCellValue(currRow, "ttl" + rowsSaveName[k]));
            var podDischargeQty=0;
            var currentTypeQty=0;
            
            if (j ==3){ //Q Type
            	var podCol=sheetObj.SaveNameCol(calcLogic + rowsSaveName[k]) ;
                var endCol=sheetObj.SaveNameCol( "ac_ttl" + rowsSaveName[k]) ;
                var ttlQty=ComParseInt(sheetObj.GetCellValue(currRow, "ttl" + rowsSaveName[k]));
            	
                for(var c=podCol;c< endCol;c=c+roopCnt){  // Q 수량 재정의	 
            		var podQty=0;
            		if (sheetObj.GetCellValue(currRow , c) != "" && ComParseInt(sheetObj.GetCellValue(currRow, c))>0 ){
            			podQty=ComParseInt(sheetObj.GetCellValue(currRow, c));
	                }   
            		if ( ttlQty > 0  ){	                    			
            			sheetObj.SetCellValue(currRow, c,ttlQty - podQty, 0);
            			ttlQty=ttlQty - podQty;
            		}
                }	                    	
            }
            
            var tmpCurrentCellValue = sheetObj.GetCellValue(currRow, calcLogic + rowsSaveName[k]);
            
            if (tmpCurrentCellValue != "" && ComParseInt(tmpCurrentCellValue)>0 ){
            	currentTypeQty=ComParseInt(tmpCurrentCellValue);
            }  
            
            for (var z=currRow;  z > 2; z=z-roopCnt){
            	var polNm=ComTrimAll(sheetObj.GetCellValue(z,"pol_cd"));
            	if (polNm =="WTOTAL" || polNm =="ETOTAL" || polNm =="TEU"){                        		
            		z=z-5                        		
            	} 
            	
            	var tmpCellValue2 = sheetObj.GetCellValue(z, calcLogic + rowsSaveName[k]);
            	if (z < topidx && tmpCellValue2 != "" && ComParseInt(tmpCellValue2)>0 ){
            		var tmp_tot=ComParseInt(tmpCellValue2);
            		podDischargeQty=podDischargeQty+tmp_tot;
            	}  
            }
            
            if (j ==3){ //Q Type	                    	
            	var CalcuLogicAcTeu="|ac_ttl_20_qty|+|ac_ttl_40_qty|*2+|ac_ttl_hc_qty|*2+|ac_ttl_45_qty|*2";
            	var CalcuLogicTeu="|ttl_20_qty|+|ttl_40_qty|*2+|ttl_hc_qty|*2+|ttl_45_qty|*2";
            	
            	sheetObj.SetCellValue(currRow, "ac_ttl" + rowsSaveName[k], podDischargeQty + currentTypeQty, 0);
            	sheetObj.InitCellProperty(currRow,"ttl" + rowsSaveName[k],{ Type:"Int",Align:"Center"} );
            	
            	sheetObj.SetCellValue(currRow, "ttl" + rowsSaveName[k],currentTypeQty, 0);
            	sheetObj.InitCellProperty(currRow,"ac_teu",{ Type:"Int",Align:"Center"} );
            	sheetObj.InitCellProperty(currRow,"teu",{ Type:"Int",Align:"Center"} );
            }else{
            	sheetObj.SetCellValue(currRow, "ac_ttl" + rowsSaveName[k],preQtyTotal + currentQtyTotal - podDischargeQty, 0);
            }
        }
    }
}

//Q Type의 Total값 계산
function fnCalcTotal(colCnt) { 
	var formObj=document.form;
	var sheetObj = sheetObjects[0];

	var wRow=sheetObj.FindText("pol_cd", "WTOTAL", 0, 0);
	var eRow=sheetObj.FindText("pol_cd", "ETOTAL", 0, 0);
	var rowCnt=sheetObj.RowCount();
	var podCol=sheetObj.SaveNameCol("pod1_20_qty") ;
    var endCol=sheetObj.SaveNameCol("ac_ttl_20_qty") ;
    var ratehc=formObj.ratehc.value;
    var rate45=formObj.rate45.value;
    //alert(wRow+":"+eRow)   
    //alert(wRow+":"+eRow+":"+podCol+":"+endCol)
	for(var c=podCol;c< endCol;c++){	// Q 수량 재정의	  
        var totwQty=0;
        var toteQty=0;
		for (var i=6; i < rowCnt; i=i+4){  
			var podQty=0;
			var polNm=ComTrimAll(sheetObj.GetCellValue(i,"pol_cd"));
        	if (polNm =="WTOTAL" || polNm =="ETOTAL" || polNm =="TEU"){                        		
        		i=i+5                        		
        	}
        	
        	var tmpPodQty = sheetObj.GetCellValue(i , c);
        	if (tmpPodQty != "" && ComParseInt(tmpPodQty)>0 ){
        		podQty=ComParseInt(tmpPodQty);
            }
    		if (i< wRow){
    			totwQty=totwQty +podQty;
    		}else if(i > wRow+4 && i < eRow){
    			toteQty=toteQty +podQty;
    		}
		} 
		if (wRow >0){
			var wtot1=sheetObj.GetCellValue(wRow, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow, c));
			var wtot2=sheetObj.GetCellValue(wRow+1, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow+1, c));
			var wtot3=sheetObj.GetCellValue(wRow+2, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow+2, c));
			var wtot4=totwQty;
			var wteu=0;
			
			var tmpCellValue = sheetObj.GetCellValue(2,c);
			if(tmpCellValue.indexOf("40") > -1  ){
				wteu=ComParseInt((wtot1+wtot2+wtot3+wtot4) *2);
			}else if (tmpCellValue.indexOf("HC") > -1  ){
				wteu=ComParseInt((wtot1+wtot2+wtot3)*ratehc+(wtot4*2));
			}else if (tmpCellValue.indexOf("45") > -1  ){
				wteu=ComParseInt((wtot1+wtot2+wtot3)*rate45+(wtot4*2));
			}else{  //20
				wteu=ComParseInt(wtot1+wtot2+wtot3+wtot4);
			 }
			sheetObj.SetCellValue(wRow+3,c,totwQty==0?"":totwQty, 0);
			sheetObj.SetCellValue(wRow+4,c,wteu, 0);
		}
		///////////eTotal 계산
		if (eRow >0){
			var etot1=sheetObj.GetCellValue(eRow, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow, c));
			var etot2=sheetObj.GetCellValue(eRow+1, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow+1, c));
			var etot3=sheetObj.GetCellValue(eRow+2, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow+2, c));
			var etot4=toteQty;
			var eteu=0;
			
			var tmpCellValue = sheetObj.GetCellValue(2,c);
			if(tmpCellValue.indexOf("40") > -1  ){
				eteu=ComParseInt((etot1+etot2+etot3+etot4) *2);
			}else if (tmpCellValue.indexOf("HC") > -1  ){
				eteu=ComParseInt((etot1+etot2+etot3)*ratehc+(etot4*2));
			}else if (tmpCellValue.indexOf("45") > -1  ){
				eteu=ComParseInt((etot1+etot2+etot3)*rate45+(etot4*2));
			}else{  //20
				eteu=ComParseInt(etot1+etot2+etot3+etot4);
			}
			sheetObj.SetCellValue(eRow+3,c,toteQty==0?"":toteQty, 0);
			sheetObj.SetCellValue(eRow+4,c,eteu, 0);
		}
	}
	
	//////////////////////GTotal
	var ttlCol=sheetObj.SaveNameCol( "ttl_20_qty") ;
	var ttlWteu=0;
	var ttlEteu=0;
	for(var c=ttlCol;c< ttlCol+4;c++){	  
        var totwQty=0;
        var toteQty=0;
        
        ///////////////wTotal 계산
        if (wRow >0){
        	var wtot1=sheetObj.GetCellValue(wRow, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow, c));
        	var wtot2=sheetObj.GetCellValue(wRow+1, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow+1, c));
        	var wtot3=sheetObj.GetCellValue(wRow+2, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow+2, c));
        	var wtot4=sheetObj.GetCellValue(wRow+3, c)==""?0:ComParseInt(sheetObj.GetCellValue(wRow+3, c));;
			var wteu=0;
			
			var tmpCellValue = sheetObj.GetCellValue(2,c);
			if(tmpCellValue.indexOf("40") > -1  ){
				wteu=ComParseInt((wtot1+wtot2+wtot3+wtot4) *2);
			}else if (tmpCellValue.indexOf("HC") > -1  ){
				wteu=ComParseInt((wtot1+wtot2+wtot3)*ratehc+(wtot4*2));
			}else if (tmpCellValue.indexOf("45") > -1  ){
				wteu=ComParseInt((wtot1+wtot2+wtot3)*rate45+(wtot4*2));
			}else{  //20
				wteu=ComParseInt(wtot1+wtot2+wtot3+wtot4);
			}
			sheetObj.InitCellProperty(wRow+4,c,{ Type:"Int",Align:"Center"} );
			sheetObj.SetCellValue(wRow+4,c,wteu, 0);
			ttlWteu=ttlWteu+wteu;
        }
		///////////eTotal 계산
		if (eRow>0){
			var etot1=sheetObj.GetCellValue(eRow, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow, c));
			var etot2=sheetObj.GetCellValue(eRow+1, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow+1, c));
			var etot3=sheetObj.GetCellValue(eRow+2, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow+2, c));
			var etot4=sheetObj.GetCellValue(eRow+3, c)==""?0:ComParseInt(sheetObj.GetCellValue(eRow+3, c));
			var eteu=0;    			

			var tmpCellValue = sheetObj.GetCellValue(2,c);
			if(tmpCellValue.indexOf("40") > -1  ){
				eteu=ComParseInt((etot1+etot2+etot3+etot4) *2);
			}else if (tmpCellValue.indexOf("HC") > -1  ){
				eteu=ComParseInt((etot1+etot2+etot3)*ratehc+(etot4*2));
			}else if (tmpCellValue.indexOf("45") > -1  ){
				eteu=ComParseInt((etot1+etot2+etot3)*rate45+(etot4*2));
			}else{  //20
				eteu=ComParseInt(etot1+etot2+etot3+etot4);
			}
			sheetObj.InitCellProperty(eRow+4, c, { Type:"Int",Align:"Center"} );
			sheetObj.SetCellValue(eRow+4, c, eteu, 0);
			ttlEteu=ttlEteu+eteu;
		}
	}
	
	if (wRow>0) sheetObj.SetCellValue(wRow+4,ttlCol,ttlWteu, 0);
	if (eRow>0) sheetObj.SetCellValue(eRow+4,ttlCol,ttlEteu, 0);
	
    for (var t=0; t<2; t++){
    	var teuRow=0;
    	//alert(wRow+":"+eRow+":"+teuRow)
    	if (t==0){//wTotal
    		if (wRow < 0){
    			teuRow=0;
    		}else{
    			teuRow=wRow+4;
    		}
    	}else{ //eTotal
    		if (eRow < 0){
    			teuRow=0;
    		}else{
    			teuRow=eRow+4;
    		}
    	}
    	
    	// colCnt + 1(TTL건도 처리 위해 )
        for(var j=0;j< colCnt;j++){// colCnt + 1
        	if (teuRow == 0){
        		break;                		
    		}
            var sv20_qty="pod"+(j+1)+"_20_qty";
            var sv20_qtyValue=sheetObj.GetCellValue(teuRow,sv20_qty);
            var sv40_qty="pod"+(j+1)+"_40_qty";
            var sv40_qtyValue=sheetObj.GetCellValue(teuRow,sv40_qty);
            var svhc_qty="pod"+(j+1)+"_hc_qty";
            var svhc_qtyValue=sheetObj.GetCellValue(teuRow,svhc_qty);
            var sv45_qty="pod"+(j+1)+"_45_qty";
            var sv45_qtyValue=sheetObj.GetCellValue(teuRow,sv45_qty);
            var teu=  (sv20_qtyValue==""?0:eval(sv20_qtyValue)  )+
                      (sv40_qtyValue==""?0:eval(sv40_qtyValue)  )+
                      (svhc_qtyValue==""?0:eval(svhc_qtyValue)  )+
                      (sv45_qtyValue==""?0:eval(sv45_qtyValue)  );
            
            var col_sv20_qyt = sheetObj.SaveNameCol( sv20_qty );
            
            sheetObj.SetMergeCell( teuRow , col_sv20_qyt	, 1, 4, 0);//가로  Dis Port 당. TEU 셀병합.
            sheetObj.SetMergeCell( teuRow , ttlCol 			, 1, 4, 0);
            sheetObj.SetCellValue( teuRow , sv20_qty , teu , 0);
            sheetObj.SetCellFont("FontBold", teuRow,sv20_qty,1);
            sheetObj.SetCellFont("FontBold", teuRow,ttlCol,1);
        }
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
     var obj=event.srcElement;
     var formObj=document.form;
     switch(ComGetEvent("name")){
            case 'vvd':
                  ComKeyOnlyAlphabet( "uppernum" );
                  if( sheetObjects[0].RowCount()> 0 ){
                     sheetObjects[0].RemoveAll();
                  }
                  break;
            case 'ratehc':
                ComKeyOnlyNumber(obj, ".");
                if( sheetObjects[0].RowCount()> 0 ){
                    sheetObjects[0].RemoveAll();
                 }
                  break;
            case 'rate45':
                ComKeyOnlyNumber(obj, ".");
                if( sheetObjects[0].RowCount()> 0 ){
                    sheetObjects[0].RemoveAll();
                 }
                 break;
     }
 }
 function fnObjKeyUp(){

     var formObj=document.form;
     switch (ComGetEvent("name")){
            case 'vvd':
                  var maxlength=ComGetEvent("maxlength");
                  if( ComGetEvent("value").length == eval(maxlength) ){
                      doActionIBSheet(sheetObjects[0], formObj, IBSEARCH_ASYNC01);
                  }
                  break;
     }
 }
function fnSetTitle(headType, sXmlTitle){
    var rtrTitle="";
    var cntTitleCnt=ComGetTotalRows(  sXmlTitle );
    
    var fixTitlePerOne="20'|40'|HC|45";
    for(var i=0;i<cntTitleCnt;i++){
        for(var j=0;j<fixTitlePerOne.split("|").length;j++ ){
            switch (headType) {
                 case "head1":
                      rtrTitle += "DISCH. PORT"+"|";
                      break;
                 case "head3":
                      var  ctType=fixTitlePerOne.split("|");
                      rtrTitle += ctType[j] +"|";
                      break;
            } // end switch
        }
    }// end For
    
    
  
    switch (headType) {
         case "head2":
              var  pol_cd=ComJooGetRowValue(sXmlTitle,"pol_cd");
              for( var k = 0 ; k < pol_cd.length ; k++){
                  if(pol_cd[k] != undefined && pol_cd[k] != "" && pol_cd[k] != "undefined"){
                      for(var j=0;j<fixTitlePerOne.split("|").length;j++ ){
                    	  rtrTitle += pol_cd[k]+"|";
                      }
                  }
            	  
              }
              /*if(pol_cd != "undefined" && pol_cd !=""){
            	  rtrTitle += pol_cd+"|";
              }*/
              break;
    } // end switch
    
    
    
    /*title Tail */
    var tailTitle="TEU|OBD||EMPTY";
    for(var j=0;j<fixTitlePerOne.split("|").length;j++ ){
        switch (headType) {
            case "head1":
                 rtrTitle += "Accumulative TOTAL|";
                 if(j == fixTitlePerOne.split("|").length-1 ){
                     rtrTitle += "Accumulative TOTAL|EMPTY|";//   EMPTY=MT_TEU
                 }
                 break;
            case "head2":
                 rtrTitle += "TTL|";
                 if(j == fixTitlePerOne.split("|").length-1 ){
                     rtrTitle+="TEU|EMPTY|";
                 }
                 break;
            case "head3":
                 var  ctType=fixTitlePerOne.split("|");
                 rtrTitle += ctType[j] +"|";
                 if(j == fixTitlePerOne.split("|").length-1 ){
                     rtrTitle+="TEU|EMPTY|";
                 }
                 break;
        } // end switch
    }
    for(var j=0;j<fixTitlePerOne.split("|").length;j++ ){
        switch (headType) {
            case "head1":
                 rtrTitle += "G TOTAL"+"|";
                 if(j == fixTitlePerOne.split("|").length-1 ){
                     rtrTitle += "G TOTAL"+"|"+"G TOTAL|MT_20|MT_40|MT_HC|MT_45|MT_TYPE_CNT|EMPTY";//   EMPTY=MT_TEU
                 }
                 break;
            case "head2":
                 rtrTitle += "TTL|";
                 if(j == fixTitlePerOne.split("|").length-1 ){
                     rtrTitle+="TEU"+"|"+"OBD"+"|MT_20|MT_40|MT_HC|MT_45|MT_TYPE_CNT|EMPTY";
                 }
                 break;
            case "head3":
                 var  ctType=fixTitlePerOne.split("|");
                 rtrTitle += ctType[j] +"|";
                 if(j == fixTitlePerOne.split("|").length-1 ){
                     rtrTitle+="TEU"+"|"+"OBD"+"|MT_20|MT_40|MT_HC|MT_45|MT_TYPE_CNT|EMPTY";
                 }
                 break;
        } // end switch
    }
    return rtrTitle;
}
/**
 * handling process for input validation
 */
function validateForm(sheetObj,formObj,sAction){
    with(formObj){
        switch ( sAction ){
             case IBSEARCH :
                  if (!ComChkValid(formObj)) return false;
        }
    }
    return true;
}

function resizeSheet(){
    ComResizeSheet(sheetObjects[0]);
}
        