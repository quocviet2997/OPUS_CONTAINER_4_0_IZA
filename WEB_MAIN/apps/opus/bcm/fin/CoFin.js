/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : CoFin.js
*@FileTitle  : SUP모듈내 공통 메시지 및 스크립트 함수를 정의한다.
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
	msgs['FIN00001']='{?msg1} is mandatory. Please enter {?msg1}.';
	msgs['FIN00002']='There is no contents to save.';
	msgs['FIN00003']='Invalid code({?msg1})';
	msgs['FIN00004']='The Same {?msg1} is existed.';
	msgs['FIN00005']='{?msg1} cannot be larger than {?msg2}.';
	msgs['FIN00006']='Data was saved successfully!';
	msgs['FIN00007']='Date value is invalid. Larger than [2000.01].';
	msgs['FIN00008']='Do you want to open {?msg1} period?';
	msgs['FIN00009']='Do you want to save?';
	msgs['FIN00010']='Do you want to create?';
	msgs['FIN00011']='Please search ahead';
	msgs['FIN00012']='Please check {?msg1}.';
	
	/**
     * ComboList를  박스를 만든다(업무용) <br>
     * Ex) CoFinGetBizCombo('GRID', document.form, sheetObj, 'CD01226', 'voy_tp_cd', 'voy_tp_nm', '1', 'SUPCommonGS.do', '','');
     * Ex) CoFinGetBizCombo('FORM', document.form, sheetObj, 'CD01226', 'voy_tp_cd', 'voy_tp_nm', '1', 'SUPCommonGS.do', '','');
     * @param {String} 	flag    	FORM/GRID 구분값
     * @param {form} 	formObj    	Form Object
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {String}  cdId   		코드 Id
     * @param {String}  comboCode   코드 값
     * @param {String}  comboText   코드 명칭
     * @param {String}  formCmd     Command 구분값
     * @param {String}  actionUrl   Action Url
     * @param {String}  msgCd   	Message 코드값
     * @param {String}  nullYn   	콤보에 Null이 들어가야 할 경우 'Y'로 넣어줌
     * @author 정윤태
 	 * @version 1.0
     **/
    function CoFinGetBizCombo(flag, formObj, sheetObj, cdId, comboCode, comboText, formCmd, actionUrl, msgCd, nullYn) {
    	if(formCmd == "1") {
    		formObj.f_cmd.value=SEARCH01;
    	} else if(formCmd == "2") {
    		formObj.f_cmd.value=SEARCH02;
    	} else if(formCmd == "3") {
    		formObj.f_cmd.value=SEARCH03;
    	} else if(formCmd == "4") {
    		formObj.f_cmd.value=SEARCH04;
    	} else if(formCmd == "5") {
    		formObj.f_cmd.value=SEARCH05;
    	} else if(formCmd == "6") {
    		formObj.f_cmd.value=SEARCH06;
    	} else if(formCmd == "7") {
    		formObj.f_cmd.value=SEARCH07;
    	} else if(formCmd == "8") {
    		formObj.f_cmd.value=SEARCH08;
    	} else if(formCmd == "9") {
    		formObj.f_cmd.value=SEARCH09;
    	} else if(formCmd == "10") {
    		formObj.f_cmd.value=SEARCH10;
    	} else if(formCmd == "11") {
    		formObj.f_cmd.value=SEARCH11;
    	} else if(formCmd == "12") {
    		formObj.f_cmd.value=SEARCH12;
    	} else if(formCmd == "13") {
    		formObj.f_cmd.value=SEARCH13;
    	} else if(formCmd == "14") {
    		formObj.f_cmd.value=SEARCH14;
    	} else if(formCmd == "15") {
    		formObj.f_cmd.value=SEARCH15;
    	} else {
    		formObj.f_cmd.value=SEARCH;
    	}
    	var param="&cd_id="+cdId
    	            +"&com_code="+comboCode 
    	            +"&com_text="+comboText;
    	var sXml=sheetObj.GetSearchData(actionUrl , FormQueryString(formObj)+param);
		var arrCode=comboCode.split(":");
		var arrText=comboText.split(":");
		var arrLen=arrCode.length;
		if (flag == 'FORM') {//Form
			for (i=0;i<arrCode.length;i++) {
				CoFinSetFormMakeCombo(formObj, ComGetEtcData(sXml, arrText[i]), ComGetEtcData(sXml, arrCode[i]), arrCode[i], msgCd, nullYn);
			}
		} else {//Grid
			for (i=0;i<arrCode.length;i++) {
				CoFinSetGridMakeCombo(sheetObj, ComGetEtcData(sXml, arrText[i]), ComGetEtcData(sXml, arrCode[i]), arrCode[i], msgCd, nullYn);
			}
		}	
    }
    /**
     * Form에 ComboList 박스를 만든다 <br>
     * @param {ibsheet} formObj    	Form Object
     * @param {String}  comboCode   Type 의 코드값
     * @param {String}  comboText   Type 의 명칭
     * @param {String}  col   		column name
     * @param {String}  msgCd   	Message 코드값
     * @param {String}  nullYn   	콤보에 Null이 들어가야 할 경우 'Y'로 넣어줌
     * @author 정윤태
 	 * @version 1.0
     **/
    function CoFinSetFormMakeCombo(formObj, comboText, comboCode, Col, msgCd, nullYn) {
		if(typeof comboCode != "undefined" && comboCode != "") {
     		var objCombo=eval("document." + formObj.name+"."+Col);
     		var arrcomboCode=comboCode.split("|");
     		var arrcomboText=comboText.split("|");
			if (nullYn == 'Y') {
	     		var objOptionItem=document.createElement("option");
				objOptionItem.text='';
				objOptionItem.value='';
				objCombo.add(objOptionItem, objCombo.length);
			}
			var arrlen=arrcomboCode.length - 1;
     		for (ii=0;ii<arrlen;ii++) {
	     		var objOptionItem=document.createElement("option");
				objOptionItem.text=arrcomboText[ii];
				objOptionItem.value=arrcomboCode[ii];
				objCombo.add(objOptionItem, objCombo.length);
			}
    	} else {
    		if(msgCd != "") {
    			ComShowCodeMessage(msgCd);
    		}
    	}
    }
    /**
     * Grid에 ComboList 박스를 만든다 <br>
     * @param {ibsheet} sheetObj    IBSheet Object
     * @param {String}  comboCode   Type 의 코드값
     * @param {String}  comboText   Type 의 명칭
     * @param {String}  col   		column name
     * @param {String}  msgCd   	Message 코드값
     * @param {String}  nullYn   	콤보에 Null이 들어가야 할 경우 'Y'로 넣어줌
     * @author 정윤태
 	 * @version 1.0
     **/
    function CoFinSetGridMakeCombo(sheetObj, comboText, comboCode, Col, msgCd, nullYn) {
		if(typeof comboCode != "undefined" && comboCode != "") {
			if (nullYn == 'Y') {
				comboText=' |' + comboText;
				comboCode='|' + comboCode;
			}
        	sheetObj.SetColProperty(Col, {ComboText:comboText.substring(0 ,comboText.length-1), ComboCode:comboCode.substring(0,comboCode.length-1)} );
    	} else {
    		if(msgCd != "") {
    			ComShowCodeMessage(msgCd);
    		}
    	}
    }
