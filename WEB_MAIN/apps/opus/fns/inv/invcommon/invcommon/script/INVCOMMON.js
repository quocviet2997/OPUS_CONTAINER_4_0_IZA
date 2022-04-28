/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : invcommon.js
*@FileTitle : INVCommon
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier :
*@LastVersion : 1.0
=========================================================*/

    /**
     * @extends 
     * @class invcommon : invcommon Defining business script.
     */
    function invcommon() {
    	this.processButtonClick		= tprocessButtonClick;
    	this.setSheetObject 		= setSheetObject;
    	this.loadPage 				= loadPage;
    	this.initSheet 				= initSheet;
    	this.initControl            = initControl;
    	this.doActionIBSheet 		= doActionIBSheet;
    	this.setTabObject 			= setTabObject;
    	this.validateForm 			= validateForm;
    }
    
   	

	
	function initControl() {
	    // Axon event process. Event catch.
	    axon_event.addListenerFormat('keypress',       'obj_keypress',    form); // When entering keyboard.
	}
	
	
	function obj_keypress(){
//		alert('a');
//		 alert(event.keyCode);
//		 comboid_OnKeyDown(comboObj,event.keyCode,0)
	    switch(event.srcElement.dataformat){
	        case "float":
	            // Only number or '.'.
	            ComKeyOnlyNumber(event.srcElement, ".");
	            break;
	        case "ymd":
	            // Only number or '-'.
	        	ComKeyOnlyNumber(event.srcElement);
	            break;
	        case "eng":
	            // Only Alphabet or number.
	            ComKeyOnlyAlphabet();
	            break;
	        case "engdn":
	            // Only lower case.
	            ComKeyOnlyAlphabet('lower');
	            break;
	        case "engup":
	            // Only upper case.
	            ComKeyOnlyAlphabet('upper');
	            break;
	        case "num":
	        	// Only number(integer, date, time).
	            ComKeyOnlyNumber('num');
	            break;
	        case "uppernum":
	        	// Only upper case or number. 
	        	ComKeyOnlyAlphabet('uppernum');
	            break;
	        default:
	            // Only upper case.
	            ComKeyOnlyAlphabet('upper');
	    }
	}
	
	
	function MakeComboObject(cmbObj, arrStr) {
	    // Initialize IBMultiCombo.

//		cmbObj.ShowCol = 10;
		for (var i = 0; i < arrStr.length;i++ ) {
			cmbObj.InsertItem(i, arrStr[i], arrStr[i]);
		}
   		cmbObj.DropHeight = 190;

	}
	
	function ComboObject_OfcCd(sheetObj, formObj, cmbObj, all, select_yn) {
		formObj.f_cmd.value = SEARCH02;
		var sXml = sheetObj.GetSearchXml("INVCommonGS.do", FormQueryString(formObj));
		
		var sStr = ComGetEtcData(sXml,"ar_ofc_cd");
		var arrStr = sStr.split("|");
		MakeComboObject_OfcCd(cmbObj, arrStr, all);

		var arrStr2 = arrStr[1].split("^");
		var ar_ofc_cd = arrStr2[3];
		if(select_yn != "N"){
			cmbObj.text = ar_ofc_cd;
		}
        cmbObj.DropHeight = 190;
   	 }

	function MakeComboObject_OfcCd(cmbObj, arrStr, allYn) {
		cmbObj.RemoveAll(); 
   		for (var i = 1; i < arrStr.length;i++ ) {
   			var arrStr2 = arrStr[i].split("^");
   			var ar_ofc_cd = arrStr2[1];
   			cmbObj.InsertItem(i-1, ar_ofc_cd, ar_ofc_cd);
   		}
   		if(allYn=='Y'){
   		cmbObj.InsertItem(0, "ALL", "ALL");
   		}
   		cmbObj.BackColor = "#CCFFFD";
   	 }

	function MakeComboObject_OfcCd_Re(cmbObj, arrStr, allYn) {
		cmbObj.RemoveAll(); 
   		for (var i = 1; i < arrStr.length;i++ ) {
   			var arrStr2 = arrStr[i].split("^");
   			var ar_ofc_cd = arrStr2[1];
   			cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
   		}
   		if(allYn=='Y'){
   		cmbObj.InsertItem(0, "ALL", "ALL^ALL");
   		}
   		cmbObj.BackColor = "#CCFFFD";
   	 }

	 function getCountFormat(sheetObj, formObj, gubun, delNum){
		 var dis_count = "";
		 if(gubun == "search"){
			 formObj.delCount.value = "0";
			dis_count = "["+ sheetObj.SelectRow + " / " + sheetObj.RowCount +"]";
		 }else if(gubun == "delete"){
			var delCount = Number(formObj.delCount.value);
			if(delCount == "") delCount = 0;
			//var selNum = sheetObj.SelectRow-delNum - delCount;
			var selNum = 1;
			var totNum = sheetObj.RowCount-delNum - delCount;
			dis_count = "["+ selNum + " / " + totNum+"]";
			formObj.delCount.value = delNum + delCount;
		 }
		 sheetObj.CountFormat = dis_count;
	 }
