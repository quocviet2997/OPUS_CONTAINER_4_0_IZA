/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : fns_inv_0110.js
*@FileTitle : (DXBBB) INV B/L List
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier :
*@LastVersion : 1.0
=========================================================*/

    /**
     * @extends 
     * @class fns_inv_0110 : fns_inv_0110 Defining business script.
     */
    function fns_inv_0110() {
    	this.processButtonClick		= tprocessButtonClick;
    	this.setSheetObject 		= setSheetObject;
    	this.loadPage 				= loadPage;
    	this.initSheet 				= initSheet;
    	this.doActionIBSheet 		= doActionIBSheet;
    	this.validateForm 			= validateForm;
    	this.sheet1_OnLoadFinish	= sheet1_OnLoadFinish;
    }
    
   	

    // Common variables.

    var sheetObjects = new Array();
    var sheetCnt = 0;

    // Defining button events. */
    document.onclick = processButtonClick;

    /**
	 * Handling button event.<br>
	 * 
	 * @return none.
	 */
    function processButtonClick(){
    	/***** Setting each tab's sheet variable. *****/
    	var sheetObject1 = sheetObjects[0];

    	/*******************************************************/
    	var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

            switch(srcName) {
            	case "btn_paperissue":
	            	doActionIBSheet(sheetObject1,formObject,IBSAVE);
	            	window.close();
            		break; 
                                         
            	case "btn_close":
            		window.close();
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
     * Register IBSheet object on array.<br>
     * <br>
     * Array define top on source.<br>
     *
     * @param {object} sheet_obj
     * @return none.
     */
    function setSheetObject(sheet_obj){
    	sheetObjects[sheetCnt++] = sheet_obj;
    }

    /**
     * Initialize sheets.<br>
     * Coding event handler for body tag's OnLoad.<br>
     * After complete on load, add pre-function.<br>
     *
     * @return none.
     */
    function loadPage() {
         for(i=0;i<sheetObjects.length;i++){
        	 
             ComConfigSheet (sheetObjects[i] );

             initSheet(sheetObjects[i],i+1);
             
             ComEndConfigSheet(sheetObjects[i]);

//             sheetObjects[i].ExtendLastCol = false;
         }
    }

    /**
     * Initialize sheet. Define header.<br>
     * param : sheetObj ==> sheet object, sheetNo ==> sheet object <br>
     * Initialize moudle by sheet count.<br>
     * 
     * @param {object} sheetObj
     * @param {int} sheetNo
     * @return none.
     * @see #loadPage
     */
    function initSheet(sheetObj,sheetNo) {
    	var cnt = 0;

    	switch(sheetNo) {
    		case 1:      //sheet1 init
    			with (sheetObj) {
    				WaitImageVisible = false;
    			
    				// Setting height.
                    style.height = 240;
                    // Setting total width.
                    SheetWidth = mainTable.clientWidth;

                    // Setting host information [Required][HostIp, Port, PagePath].
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    // Merge kind [Option][Default msNone].
                    MergeSheet = msAll;

                    // Edit kind [Option][Default false].
                    Editable = true;

                    // Setting row information [Required][HEADROWS, DATAROWS, VIEWROWS, ONEPAGEROWS=100].
                    InitRowInfo( 1, 1, 3, 100);

                    // Setting functions for header.
                    InitHeadMode(false, true, true, true, false, false)

                    var HeadTitle = "INV|VVD|Cust Code|B/L No.|CHRG CODE|Cur.|Amount|Ex.Rate|LCL Amount|io_bnd_cd|port_cd|svc_scp_cd|inv_split_cd|usd_xch_rt|inv_iss_tp_cd|ar_if_no|ar_ofc_cd";
                    var headCount = ComCountHeadTitle(HeadTitle);

                    // Setting column information [Required][COLS, FROZENCOL, LEFTHEADCOLS=0, FROZENMOVE=false].
                    InitColumnInfo(headCount, 0, 0, true);

                    // Setting header's row information [Required][ROW, HEADTEXT, ROWMERGE=false, HIDDEN=false].
                    InitHeadRow(0, HeadTitle, true);

                    // Attributes    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++, dtData,  		30,   	daRight,  	true,   "inv_no",    		false,  "",     dfNone,  		0,  false,  false);
                    InitDataProperty(0, cnt++, dtData,    		90,   	daCenter,  	true,  	"vvd",   			false,  "",     dfNone,      	0,  false,  false);
                    InitDataProperty(0, cnt++, dtData,    		90,   	daCenter,  	true,  	"cust_cd",   		false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtData,  		100,  	daCenter,   true,   "bl_src_no",   		false,	"",		dfNone,   		0,	false,	false);
 					InitDataProperty(0, cnt++, dtData,    		100,   	daCenter,  	false,  "chg_cd",   		false,  "",     dfNone,      	0,  false,  false);
                    InitDataProperty(0, cnt++, dtData,    		90,   	daCenter,  	false,  "curr_cd",   		false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtData,  		90,   	daRight,  	false,  "chg_amt",    		false,  "",     dfNullFloat,  	2,  false,  false);
 					InitDataProperty(0, cnt++, dtData,  		90,   	daRight,  	false,  "inv_xch_rt",    	false,  "",     dfNullFloat,  	6,  false,  false);
 					InitDataProperty(0, cnt++, dtData,  		90,   	daRight,  	false,  "lcl_amt",    		false,  "",     dfFloat,  		2,  false,  false);

 					//----------------------------------------------------------------------
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "io_bnd_cd",   		false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "port_cd",   		false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "svc_scp_cd",   	false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "inv_split_cd",   	false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "usd_xch_rt",   	false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "inv_iss_tp_cd",   	false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "ar_if_no",   		false,  "",     dfNone,      	0,  false,  false);
 					InitDataProperty(0, cnt++, dtHidden,   		100,   	daCenter,  	false,  "ar_ofc_cd",   		false,  "",     dfNone,      	0,  false,  false);
 					//----------------------------------------------------------------------
 					
 					WordWrap = true;
 					CountFormat = "[0]";
    			}
                break;
    	}
    }

    /** Process function for sheet.<br>
     * 
     * @param {object} sheetObj
     * @param {object} formObj
     * @param {int} sAction
     * @return none.
     * @see #processButtonClick
     */
    function doActionIBSheet(sheetObj,formObj,sAction) {
    	sheetObj.ShowDebugMsg = false;
    	switch(sAction) {
    		case IBSEARCH:      //retrieve
				formObj.f_cmd.value = SEARCH;
				sheetObj.DoSearch("FNS_INV_0110GS.do", FormQueryString(formObj));
    			break;

    		case IBSAVE:        //save
			    opener.getFnsInv0110();
    			break;

    		case IBINSERT:      //input
    			break;
    	}
    }

    /**
     * Validating input values.<br>
     *
     * @param {object} sheetObj
     * @param {object} formObj
     * @param {int} sAction
     * @return bool;
     */
    function validateForm(sheetObj,formObj,sAction){
    	return true;
    }
     
    /**
     * Coding event for OnLoadFinish.<br>
     * 
     * @param {object} sheetObj
     * @return none.
     */
    function sheet1_OnLoadFinish(sheetObj) {
    	doActionIBSheet(sheetObj,document.form,IBSEARCH);
    	if(sheetObj.RowCount == 0) {
    		ComBtnDisable("btn_paperissue");
    	} else {
    		ComBtnEnable("btn_paperissue");
    	}
    	
    	var cnt = 0;
    	var b_blNo = "";
    	var a_blNo = "";
    	for(var i=1; i<=sheetObj.RowCount; i++) {
    		b_blNo = sheetObj.CellValue(i, "bl_src_no");
    		a_blNo = sheetObj.CellValue(i-1, "bl_src_no");
    		if(b_blNo != " ") {
    			if(b_blNo != a_blNo){
    				cnt++;
    			}	
    		}
    	}
    	sheetObj.CountFormat = "[" + cnt + "]"; 
    }
     
    /**
     * Coding event for Sheet1's OnSearchEnd.<br>
     */
    function sheet1_OnSearchEnd(sheetObj, errMsg) {
    	for(var i=1; i<=sheetObj.LastRow; i++) {
    		var invTotal = sheetObj.CellValue(i, "vvd");
    		if(invTotal == "INV TOTAL") {
    			sheetObj.SetRowBackColor(i,"#C7C7C7");
//    			sheetObj.RowMerge(i) = true;
    			sheetObj.SetCellFont("FontBold", i, "vvd", 1);
    			sheetObj.SetCellFont("FontBold", i, "cust_cd", 1);
    			sheetObj.SetCellFont("FontBold", i, "bl_src_no", 1);
    			sheetObj.SetCellFont("FontBold", i, "chg_cd", 1);
    			sheetObj.SetCellFont("FontBold", i, "curr_cd", 1);
    			sheetObj.SetCellFont("FontBold", i, "chg_amt", 1);
    			sheetObj.SetCellFont("FontBold", i, "inv_xch_rt", 1);
    			sheetObj.SetCellFont("FontBold", i, "lcl_amt", 1);
    		}
     	}
    }
