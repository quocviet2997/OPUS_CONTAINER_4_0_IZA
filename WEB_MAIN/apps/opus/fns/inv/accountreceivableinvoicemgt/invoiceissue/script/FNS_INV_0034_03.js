/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_03.js
*@FileTitle  : Invoice Inquiry for Issue check
*@author     : CLT
*@version    : 1.0
*@since      : 2017/06/16
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [retrieve]SEARCH=2; [리스트retrieve]SEARCHLIST=3;
                    [수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
                    기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
// common global valiables
var sheetObjects=new Array();
var sheetCnt=0;
//IBMultiCombo
var comboObjects=new Array();
var combo1=null;
var comboCnt=0;
// define button click event handler */
document.onclick=processButtonClick;
/** 
 * event handler branch proecss by button name<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  none  
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function processButtonClick(){

	/***** Setting each tab's sheet variable. *****/
    var sheetObject1=sheetObjects[0];
	var sheetID=sheetObject1.id;
    var prefix=sheetID + "_";
    /*******************************************************/
    var formObject=document.form;

        var srcName=ComGetEvent("name");
        switch(srcName) {
            case "btn_retrive":

                doActionIBSheet(sheetObject1,formObject,IBSEARCH);
                break;
            
			//case "btn_del":
			//	ComRowHideDelete(sheetObjects[0], "SelChk");
			//	break;
				
			case "btn_save":
				var blNos = "";
				var blCnt = 0;
				
				var v1 = 0;
				var v2 = 0;				
				
				var opener_obj=window.dialogArguments;
				if (!opener_obj)  opener_obj=window.opener;  
				if (!opener_obj) opener_obj=parent;
				
			    //opener_obj.sheetObjects[0].RemoveAll();

				

				for(var i=1; i<=opener_obj.sheetObjects[0].RowCount();i++){
					for(var j=0; j<5;j++){				
						opener_obj.sheetObjects[0].SetCellValue(i,j,"");
					}
				}
				//opener_obj.document.form.inv_bl_nos.value = "";
			    
				var blSrcNo = "";
				var prevBlSrcNo = "";
				for (var i=1; i<=sheetObjects[0].RowCount(); i++) {

		    		 if(sheetObjects[0].GetCellText(i,"SelChk") == "1"){
		    			    blSrcNo = sheetObjects[0].GetCellText(i,"bl_src_no");

		    			    if(blSrcNo != prevBlSrcNo){
		    			    	blNos = blNos + "'"+ sheetObjects[0].GetCellText(i,"bl_src_no") + "',";
		    			    	blCnt = blCnt + 1;

		    			    	v1 = Math.floor(blCnt/5+1);
		    			    	v2 = blCnt%5;
                            
		    			    	if(v2 == 0) { 
		    			    		v2 = 5;
		    			    		v1 = v1-1;
		    			    	}                            
		    			    	v2=v2-1;
		    			    	//alert("v1 : " + v1 + ", v2 : "+v2);
                            
                            
		    			    	opener_obj.sheetObjects[0].SetCellValue(v1,v2,sheetObjects[0].GetCellText(i,"bl_src_no"));
							
		    			    	prevBlSrcNo = blSrcNo;
		    			    }
		    			    
		    		 }

		             /*
						if (sheetObjects[0].GetRowStatus(i)  != "D") {

							blNos = blNos + "'"+ sheetObjects[0].GetCellText(i,"bl_src_no") + "',";
							blCnt = blCnt + 1;
						} 
					*/
				}
				ComClosePopup(); 
				
	    		//alert(blCnt%5);
	    		/*
				if(blCnt > 0) {
					opener_obj.document.form.inv_bl_nos.value = blNos;
					//opener_obj.document.form.bl_cnt_pop.value = blCnt;

	
				} else {
					alert("Please select an invoice item.");
				}
				*/

				
				break;
				
			case "btn_downexcel":
				if(sheetObject1.RowCount() < 1){//no data	
					ComShowCodeMessage("COM132501");
				}else{	
					sheetObject1.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject1), SheetDesign:1,Merge:1,KeyFieldMark:0 });
				}
				
				break;				
            case "btn_close":
            	ComClosePopup(); 
                break;  
        } // end switch

}
/** 
 * add IBSheet Object array  <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj IBSheet Object
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function setSheetObject(sheet_obj){
    sheetObjects[sheetCnt++]=sheet_obj;
}
/** 
 * add comboObjects array IBCombo Object<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function setComboObject(combo_obj){
    comboObjects[comboCnt++]=combo_obj;
}
/** 
 * define onLoad event handler<br> 
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param none
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function loadPage() {

    sheet1=sheetObjects[0];
    sheetCnt=sheetObjects.length ;    
    // combo
    combo1=comboObjects[1];
    comboCnt=comboObjects.length;

    for(i=0;i<sheetObjects.length;i++){
        ComConfigSheet (sheetObjects[i] );
        initSheet(sheetObjects[i],i+1);
        ComEndConfigSheet(sheetObjects[i]);
    }

    var formObj=document.form;
    
    doActionIBSheet(sheet1, formObj, IBSEARCH);
    
	var opener_obj=window.dialogArguments;
	if (!opener_obj)  opener_obj=window.opener;  
	if (!opener_obj) opener_obj=parent; 
	//alert(opener_obj.sheetObjects[0].RowCount());
    for (var i=0; i < opener_obj.sheetObjects[0].RowCount(); i++) {
        for (var j=0; j < 5; j++) {
        	if (opener_obj.sheetObjects[0].GetCellValue(i+1, j) != ""){
        		for(var k=0; k < sheetObjects[0].RowCount(); k++) {

        			if(sheetObjects[0].GetCellValue(k+1, "bl_src_no") ==  opener_obj.sheetObjects[0].GetCellValue(i+1, j)){

        				sheetObjects[0].SetCellValue(k+1, "SelChk",1);
        			}
        		}
        		
            }
        }
    }

}
/** 
 * initializing sheet, define header<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param sheetObj
 * @param sheetNo
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function initSheet(sheetObj,sheetNo) {
    var formObject=document.form;
    var cnt=0;

    switch(sheetNo) {
        case 1:      //sheet1 init
            with(sheetObj){

                var HeadTitle="";

                HeadTitle="||Seq|Good Date|Office|Bound|Cr.Term|Type|VVD|S/A Date|POL|POD|Cust Code|Cust Name|B/L No|I/F No|Ex. Rate|Local Amount|User ID";

                var headCount=ComCountHeadTitle(HeadTitle);
                (headCount, 0, 0, true);
                
                SetConfig( { SearchMode:2, FrozenCol:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
                
                var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
                var headers = [ { Text:HeadTitle, Align:"Center"} ];
                InitHeaders(headers, info);
                
                var cols = [{Type:"Status",    Hidden:1, Width:0,    Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
				            {Type:"CheckBox",  Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"SelChk", UpdateEdit:1,   InsertEdit:1 },
                            {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq" },
                            {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"good_date",    KeyField:0,   CalcLogic:"",   Format:"Ymd",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd",    KeyField:0,   CalcLogic:"",   Format:"", UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"io_bnd_cd",    KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"cr_term_dys",  KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"type",         KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"vvd",          KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Date",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"sail_arr_dt",  KeyField:0,   CalcLogic:"",   Format:"Ymd",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"pol_cd",       KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"pod_cd",       KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:75,   Align:"Center",  ColMerge:0,   SaveName:"customer",     KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:145,  Align:"Left",    ColMerge:0,   SaveName:"cust_nm",      KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:95,   Align:"Center",  ColMerge:0,   SaveName:"bl_src_no",    KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",     KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 },
                            {Type:"Float",     Hidden:0,  Width:90,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",UpdateEdit:0,   InsertEdit:0},
                            {Type:"Float",     Hidden:0,  Width:110,  Align:"Right",   ColMerge:0,   SaveName:"lcl_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",UpdateEdit:0,   InsertEdit:0},
                            {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"upd_usr_id",   KeyField:0,   CalcLogic:"",   Format:"",UpdateEdit:0,   InsertEdit:0 } ];
                                                       
                InitColumns(cols);
                
                SetEditable(1);
                SetCountPosition(0);
                SetWaitImageVisible(0);
                FrozenCols=2;
                SetSheetHeight(300);
//				resizeSheet();

            }

        break;
    }
}


/** 
 * doActionIBSheet<br>
 * <br><b>Example :</b>
 * <pre>
 * 
 * </pre>
 * @param  {IBSheet} sheetObj   
 * @param  {object} formObj 
 * @param  {sAction} sAction
 * @param  {int} Row 
 * @param  {int} Col 
 * @param  {String}Val 
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function doActionIBSheet(sheetObj,formObj,sAction) {
    var rtnStr="Delay Time \n"; 
    sheetObj.ShowDebugMsg(false);
    switch(sAction) {
        case IBSEARCH:      //retrieve

            if (validateForm(sheetObj,formObj) == false) {
            	ComClosePopup();
            	return;
            }

            formObj.f_cmd.value=SEARCH;

            //var arrStr2=ar_ofc_cd.GetSelectCode().split("^");
            //formObj.office.value=arrStr2[1];
            formObj.office.value=formObj.user_ofc_cd.value;
 
            var sXml=sheetObj.GetSearchData("FNS_INV_0034_03GS.do", FormQueryString(formObj));

            initSheet(sheetObjects[0], 1);
            sheetObj.LoadSearchData(sXml,{Sync:1} );
            
        break;        

    }

}


function sheet1_OnSearchEnd(sheetObj, Code, Msg, StCode, StMsg) { 
    ComOpenWait(false);
}

/** 
 * validateForm <br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {IBSheet} sheetObj   
 * @param  {object} formObj 
 * @param  {sAction} sAction
 * @return true, false
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
/*
function validateForm(sheetObj,formObj,sAction){
     var arOfcCd=ar_ofc_cd.GetSelectText();
     alert("33");
     with(formObj){

    	 if (to_date.value >= nextDate) {
             ComShowCodeMessage("INV00043");
             to_date.focus();
             return false;
         }
         if(rev_tp_cd.text == "") {
             ComShowCodeMessage("INV00004");
             rev_tp_cd.focus();
             return false;        
         }
     }

     return true;
}
*/
     
/** 
 * init UI<br>
 * <br><b>Example :</b>
 * <pre>
 * </pre>
 * @param  {object} formObj  
 * @return none
 * @see #
 * @author 박정진
 * @version 2009.05.04
 */
function deleteData(formObj) {
    formObj.reset();
    issue_flag.SetSelectCode("A");
   // rev_tp_cd.SetSelectCode("A");
    bound.SetSelectCode("A");
    inv_clr_flg.SetSelectCode("N");
    sheetObjects[0].RemoveAll();
    doActionIBSheet(sheetObjects[0], formObj, IBSEARCH);
    formObj.from_date.focus();
}


/**
 * onclick event
 * @param sheetObj
 * @param row
 * @param col
 * @param val
 */
function sheet1_OnChange(sheetObj, row, col, val) {
	
	var blSrcNo = "";
	var flag = sheetObj.GetCellText(row,"SelChk");
	
	blSrcNo = sheetObj.GetCellValue(row, "bl_src_no");
	
    for (var iRow=1;iRow<=sheetObj.LastRow();iRow++){
    	if(sheetObj.GetCellValue(iRow, "bl_src_no") == blSrcNo ){
    		sheetObj.SetCellValue(iRow, "SelChk", flag, 0);    
    	}
    }
		
}

/**
 * validateForm<br>
 * <br><b>Example :</b>
 * <pre>
 *     validateForm(sheetObj, document.form, IBSEARCH)
 * </pre>
 * @param {ibsheet} sheetObj 필수 IBSheet Object
 * @param {form} formObj 필수 html form object
 * @param {int} sAction 필수 프로세스 플래그 상수
 * @return boolean
 * @author 정휘택
 * @version 2009.10.20
 */
function validateForm(sheetObj,formObj) {
    with(formObj){
   
    	if ( (formObj.user_ofc_cd.value == "") && // Office
    		 (formObj.to_date.value == "")  // Date
    		) 
    	{
            ComShowCodeMessage("INV00004");
            return false;
        }
    	
    	if ( (formObj.vvd.value == "") && // VVD
    		 ( (formObj.act_cust_cnt_cd.value == "") && (formObj.act_cust_seq.value == "") ) // Cust Code
    		) 
    	{
            ComShowCodeMessage("INV00004");
            return false;
        }
    }
}    