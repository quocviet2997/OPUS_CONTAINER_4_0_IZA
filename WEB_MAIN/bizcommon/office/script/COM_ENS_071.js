/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName : COM_ENS_071.js
*@FileTitle :  Office 조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/05/16
=========================================================*/
var ipageNo=1 ;
var sheetObjects=new Array();
var sheetCnt=0;
var selectVal;
var mainPage;
document.onclick=processButtonClick;
    function processButtonClick(){
         /***** ?? ??? 2? ??? ??? ?? ???? ???? ??? *****/
    	
         var sheetObject=sheetObjects[0];
         /*******************************************************/
         var formObject=document.form;
    	try {
    		var srcName=ComGetEvent("name");
            switch(srcName) {
        	    case "btn_Retrieve":
    	            doActionIBSheet(sheetObject,formObject,IBSEARCH);
        	        break;
        	    case "btn_New":
    	            sheetObject.RemoveAll();
    	            formObject.reset();
        	        break;
                case "btn_Close":
                	ComClosePopup();
        	        break;
        	    case "btn_OK":        	    	
        	        var selrow=sheetObject.GetSelectRow();
        	        // -1 event cancel
    		        if ( selrow > 0 )
    		        {
    					 comPopupOK();      
    		        }
    		        else
    		       	{
    	               	ComClosePopup();
    	            }
        	        break;
        	    case "btn2_Down_Excel":
        	    	 if(sheetObject.RowCount() < 1){
    	    			ComShowCodeMessage("COM132501");
    	    		}else{
    	    			sheetObject.Down2Excel( {DownCols: makeHiddenSkipCol(sheetObject), SheetDesign:1,Merge:1 });
    	    		}         	    	
        	        break;
            } // end switch
    }catch(e) {
	    	 /*
		        자바 스크립트 에러가 발생할시 오동작이 납니다. 고객에게 이 경우 아래의 메세지가 뿌려지게 해야합니다.
		        물론 화면에서 다음의 메세지를 보시면 무조건 '자바스크립트 에러구나'라고 확인하실수 가 있습니다.
	        */
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
    	}
    }
    /**
     * IBSheet Object? ??? ??
     */
    function setSheetObject(sheet_obj){
       sheetObjects[sheetCnt++]=sheet_obj;
    }
    
     function loadPage(mainpage) {
    	mainPage=mainpage;
        for(i=0;i<sheetObjects.length;i++){
            ComConfigSheet(sheetObjects[i]);
            initSheet(sheetObjects[i],i+1);
            ComEndConfigSheet(sheetObjects[i]);
            doActionIBSheet(sheetObjects[i],document.form,IBSEARCH);
        }
		initControl();
//		if(window.dialogArguments.document.form.mnr_disp_trf_grp_cd!=undefined)
//		{
//			var formObject = document.form;
//			Text=window.dialogArguments.document.form.mnr_disp_trf_grp_cd.value;
//			if(Text=="RHQ")
//			{
//				formObject.ofc_lev.value="2";
//				formObject.ofc_lev.disabled=true;
//			}
//			else if(Text != "RHQ")
//			{
//				formObject.ofc_lev.length=0;
//				var selOptions=[["1","SHQ"],
//					           ["3","GOF"],
//					           ["4","SOF"],
//					           ["5","LOF"],		
//					           ["6","AGT"]]
//				formObject.ofc_lev.length=selOptions.length;
//				for(var i=0;i<selOptions.length;i++)
//				{
//					formObject.ofc_lev.options[i].value=selOptions[i][0];
//					formObject.ofc_lev.options[i].text=selOptions[i][1];
//				}
//				formObject.ofc_lev.value="1";
//				formObject.ofc_lev.Disabled=false;
//			}
//
//		}
		 var sheetObject=sheetObjects[0];
	     var formObject=document.form;
    }
     
    function initControl() {
    	var formObject=document.form;
        //Axon 이벤트 처리1. 이벤트catch(개발자변경)
        axon_event.addListenerFormat('keypress', 'keypressFormat', formObject);
        axon_event.addListener ('keydown', 'ComKeyEnter', 'form');
    }
    
    //업무 자바스크립트 OnKeyPress 이벤트 처리
    function keypressFormat() {
    	obj=event.srcElement;
  	    if(obj.dataformat == null) return;
  	    window.defaultStatus=obj.dataformat;
  	    switch(ComGetEvent("name")) {
  	        case "ofc_pts_cd":
  	        	ComKeyOnlyAlphabet('upper');
  	            break;
  	        case "ofc_cd":
  	        	ComKeyOnlyAlphabet('upper');
  	            break;
  	        case "loc_cd":
  	        	ComKeyOnlyAlphabet('upper');
	            break;
  	        case "ofc_nm":
  	        	//ComKeyOnlyAlphabet('uppernum');
  	        	break;
  	    }
    }
    
    function initSheet(sheetObj,sheetNo) {
        var cnt=0;
        switch(sheetNo) {
            case 1:      //IBSheet1 init
                with(sheetObj){
                
              var HeadTitle;
              if(mainPage == undefined){
              HeadTitle="| |Seq.|Office|Office Name|Office Type|Location|Address" ;
              }else{
              HeadTitle="Seq.|Office|Office Name|Office Type|Location|Address" ;
              }
              var mdmYN=document.form.mdm_yn.value;
              if(mdmYN.replace(/\s/g,"") != ""){
            	  HeadTitle += "|Parent Office|Status";
              }else{
            	  HeadTitle += "|Parent Office";
              }
              var headCount=ComCountHeadTitle(HeadTitle);
              
              SetConfig( { SearchMode:2, MergeSheet:5, Page:20, FrozenCol:0, DataRowMerge:1 } );

              var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
              var headers = [ { Text:HeadTitle, Align:"Center"} ];
              InitHeaders(headers, info);
              
              if(mainPage == undefined){
        	     var cols = [ {Type:"Radio",     Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"radio",        KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
                           {Type:"CheckBox",  Hidden:0, Width:20,   Align:"Center",  ColMerge:0,   SaveName:"checkbox",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
        	               {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:55,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:0,   SaveName:"ofc_eng_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ofc_knd_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"loc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:300,  Align:"Left",    ColMerge:0,   SaveName:"ofc_addr",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
                           {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"prnt_ofc_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
                          
                    if(mdmYN.replace(/\s/g,"") != ""){
                          	cols.push({Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
                          }
               
                    InitColumns(cols);

                    SetCountFormat("[SELECTDATAROW / TOTALROWS]");
                    SetSheetHeight(300);
                    //resizeSheet();
              } else {
	              var cols = [ {Type:"Seq",       Hidden:0, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"ofc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:250,  Align:"Left",    ColMerge:0,   SaveName:"ofc_eng_nm",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"ofc_knd_cd",   KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:70,   Align:"Center",  ColMerge:0,   SaveName:"loc_cd",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:300,  Align:"Left",    ColMerge:0,   SaveName:"ofc_addr",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
	                     {Type:"Text",      Hidden:0,  Width:90,   Align:"Center",  ColMerge:0,   SaveName:"prnt_ofc_cd",  KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
	                    
	              if(mdmYN.replace(/\s/g,"") != ""){
	                    	cols.push({Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"delt_flg",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 });
	                    }
	         
	              InitColumns(cols);
	
	              SetCountFormat("[SELECTDATAROW / TOTALROWS]");
	              SetSheetHeight(400);
	              //resizeSheet();
	              }
              }
                break;
        }
    }
    
    /*function resizeSheet(){
   	         ComResizeSheet(sheetObjects[0]);
    }*/
    function doActionIBSheet(sheetObj,formObj,sAction, a, PageNo) {
        sheetObj.ShowDebugMsg(false);
        switch(sAction) {
           case IBSEARCH:        //??
                if(validateForm(sheetObj,formObj,sAction))
                formObj.f_cmd.value=SEARCH;                
                selectVal=FormQueryString(formObj);
                iPageNo = 1;
                sheetObj.DoSearch("COM_ENS_071GS.do", selectVal );
           break;
           case IBSEARCHAPPEND:  // ??? ??
                formObj.f_cmd.value=SEARCHLIST;              
                 sheetObj.DoSearch("COM_ENS_071GS.do", selectVal+"&"+ "iPage=" + PageNo,{Append:true} );
           break;
        }
    }
//method change[check again]CLT     function sheet1_OnScrollNext(sheet,CondParam, PageNo, OnePageRows) {
       // TODO:sheet? ???? ??? ? ????? doActionIBSheet ??? ?? ??????.
       //doActionIBSheet(sheetObjects[0], document.form, IBSEARCHAPPEND, true, PageNo);
    //} 
    
    var iPageNo = 1;
    function sheet1_OnVScroll(sheetObj, vpos, oldvpos, isTop, isBottom) {
        if (!isBottom || sheetObj.RowCount() >= sheetObj.GetTotalRows()) return;
        doActionIBSheet(sheetObj, document.form, IBSEARCHAPPEND, true, ++iPageNo);
    }
    
   /**
     * ?? ????? ?? ????? ???? ??
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
