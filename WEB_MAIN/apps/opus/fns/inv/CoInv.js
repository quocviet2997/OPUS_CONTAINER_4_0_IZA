﻿/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : CoInv.js
*@FileTitle  : Inv common 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
 
	if(msgs == undefined){
		msgs = new Array();
	}
	msgs['INV00001']='There is no Account Exchange Rate.'; 
	msgs['INV00002']='There is no Vessel Port Schedule Information.';
	msgs['INV00003']='Invalid B/L No!  Please check B/L No.';								
	msgs['INV00004']='Please check mandatory item.';
	msgs['INV00005']='VVD is invalid!  It doesn\'t exist.';
	msgs['INV00006']='Service scope doesn\'t exist.';
	msgs['INV00007']='VVD, PORT are invalid!  It doesn\'t exist in vessel schedule.';
	msgs['INV00008']='Customer code is invalid!  It doesn\'t exist.';
	msgs['INV00009']='Revenue type  is invalid!';
	msgs['INV00010']='Container count doesn\'t match.';
	msgs['INV00011']='S/A date doesn\'t exist.';
	msgs['INV00012']='Charge type is invalid!';
	msgs['INV00013']='There are missing items.';								
	msgs['INV00014']='Cannot delete this item.';
	msgs['INV00015']='G/L month was closed.  Please check.';
	msgs['INV00016']='{?msg1} Exchange rate is invalid! \n It exceeds monthly company ex. Rate by more than 50%. Please check and try again.';
	msgs['INV00017']='B/L No. is duplicated.';
	msgs['INV00018']='There is no records transmitted with that message no.';
	msgs['INV00019']='Invoice number is incorrect.';
	msgs['INV00020']='The range is incorrect.';
	msgs['INV00021']='INV No. is duplicated.';
	msgs['INV00022']='You can\'t use this Invoice type in combined invoice.(Available Type : FRT, THC, DHF)';
	msgs['INV00023']='\'Check Digit\' you entered is wrong.  Please sum up all the figures in exchange  rate again.';								
	msgs['INV00024']='The date you input is out of the range.';
	msgs['INV00025']='Nothing was selected.';
	msgs['INV00026']='Invoice can\'t be issued for that customer.';
	msgs['INV00027']='Incurred amounts are not correct with total amounts.';
	msgs['INV00028']='Do you really want to delete?';
	msgs['INV00029']='The charge is not registered.';
	msgs['INV00030']='It\'s already cancelled.';
	msgs['INV00031']='You don\'t need to save it.  Customer was not changed.';
	msgs['INV00032']='Customer was changed.  Move to next page?';
	msgs['INV00033']='Amount for split wasn\'t inputted.';								
	msgs['INV00034']='Customer is duplicated.';
	msgs['INV00035']='Master Total and Split Total amount should be same.';
	msgs['INV00036']='Split customer is office rep. customer code.';
	msgs['INV00037']='Exchange rate has been already applied to invoice.';
	msgs['INV00038']='Sales office is invalid!';
	msgs['INV00039']='VVD is invalid!';
	msgs['INV00040']='Bank Account is duplicated.';
	msgs['INV00041']='{?msg1} is not available.';
	msgs['INV00042']='Please check the period. {?msg1}/{?msg2}';
	msgs['INV00043']='Please check enterd Data. Date is out of bounds.';
	msgs['INV00044']='Template Name is duplicated.';
	msgs['INV00045']='Do you want to save this report with new report ID?  Then, Please select \'Yes\'.';
	msgs['INV00046']='You should select template name first. Please click \'Create Template\' button.';
	msgs['INV00047']='Exchange Rate already exist. Do you really want to update it ? ';
	msgs['INV00048']='For multi cust option, please retrieve first before inputting it.';
	msgs['INV00049']='Data was downloaded successfully. Do you want to open it now ?';
	msgs['INV00050']='Invalid Port!'; 
	msgs['INV00051']='Data was saved successfully!';
	msgs['INV00052']='Data is duplicated.';
	msgs['INV00053']='Failed to save data. {?msg1}';
	msgs['INV00054']='Invalid Customer!  Please check Customer Code.';
	msgs['INV00055']='{?msg1} Good Date must be required.';
	msgs['INV00056']='{?msg1} Invalid Container No!';
	msgs['INV00057']='Data was deleted successfully!';
	msgs['INV00058']='New office is same with old office.';
	msgs['INV00059']='Unable to use \'411911\' or \'411915\' or \'957112\' or \'954111\' or \'422011\' or \'710111\' with other account code(except V.A.T.).';
	msgs['INV00060']='It\'s a deleted Customer Code! Please check Customer Code.';
	msgs['INV00061']='Unable to get Charge Account List.';
	msgs['INV00062']='Unable to get Auto B/L No. Please check Office.';
	msgs['INV00063']='Mandatory field is missing. Please enter \'I/F No.\'.';
	msgs['INV00064']='DR amount doesn\'t match CR amount. Please check again.';
	msgs['INV00065']='It was transmitted successfully.\n(Successfully Sent E-mail/Fax or Printed Invoice Count : {?msg1})';
	msgs['INV00066']='Failed to send it. Please try again.';
	msgs['INV00067']='There is no data.  Please check key data {?msg1}.';
	msgs['INV00068']='Container No. is duplicated! Please check data.';
	msgs['INV00069']='Data was modified!  Do you want to clear it?';
	msgs['INV00070']='No data created in INV for this B/L No. \n Is it export(O/B) shipment? If yes,  please click \'OK\', otherwise, click \'Cancel\'.';
	msgs['INV00071']='Please input Invoice No.';
	msgs['INV00072']='Please input Charge Information.';
	msgs['INV00073']='\'Remark\' field is mandatory.';	
	msgs['INV00074']='Failed to interface. \n Please contact system administrator.';	
	msgs['INV00075']='Can not Find Information of user Office. ';	
	msgs['INV00076']='Tax amount can be adjusted : from -10  to 10.';	
	msgs['INV00077']='Please check Office : You can\'t input Exchange Rate by date.';	
	msgs['INV00078']='The limit of applicable Count : less than 100.';
	msgs['INV00079']='Please check No. of Split : Minimun Count is 2 and Maximun Count is 5.';
	msgs['INV00080']='Split is not allowed for this data. Please check data.';
	msgs['INV00081']='Security amount is not same with credit amount.';
	msgs['INV00082']='Invoice search is available for \'single\' option only. Please check.';
	msgs['INV00083']='Max charge code for 1 invoice is 5.';
	msgs['INV00084']='Amount wasn\'t inputted. Please check.';
	msgs['INV00085']='It is not entered in charge for tax invoice. Please enter it first.';
	msgs['INV00086']='Data was sent successfully!';
	msgs['INV00087']='Failed to send it.';
	msgs['INV00088']='Please Check B/L NO. Invalid B/L.';
	msgs['INV00089']='BackEndJob Failed.';
	msgs['INV00090']='Already Read Result File Of BackEndJob.';
	msgs['INV00091']='There is no data to save.';
	msgs['INV00092']='No data for system clear. Please check again.';
	msgs['INV00093']='Manual system clear is successful.';
	msgs['INV00094']='Value beyond the decimal point is not allowed for this currency. Please try again.';
	msgs['INV00095']='There is no data to search.'
	msgs['INV00096']='Please check VVD Exchange Rate or Customer code or Good status of {?msg1}.';
	msgs['INV00097']='There is no data for issue.';
	msgs['INV00098']='There is no Exchange Rate.';
	msgs['INV00099']='Please check E-mail address(Fax number) of {?msg1}.';
    msgs['INV00100']='Customer Option is mandatory for save.';
  	msgs['INV00101']='Please check your Entered Data. \n In \'IV\' type, you can only enter positive amount!';
    msgs['INV00102']='Please check your Entered Data. \n In \'IC\' type, you can only enter negative amount!';
    msgs['INV00103']='Amt is larger than BL\'s amt.';
    msgs['INV00104']='Please check E-mail address or Fax no.'	;
    msgs['INV00105']='Please check your Entered Data.\n In \'Rated As\', you can enter plus only!';
   	msgs['INV00106']='WHF only for \'WC\', \'OC\' type. Please check again.';
  	msgs['INV00107']='OTS, DTS only for \'TS\' type. Please check again.' ;
   	msgs['INV00108']='CRC only for \'EQ\' type. Please check again.';
   	msgs['INV00109']='Please Check REV SRC & CHG Type!';
   	msgs['INV00110']='There is no item for new template.';
   	msgs['INV00111']='Process Success.';
  	msgs['INV00112']='Failed to {?msg1}. Please try again.';  		
  	msgs['INV00113']='Save failed due to interface error to invoice system.';  	
  	msgs['INV00114']='This charge code is not allowed in MRI.\nPlease go to correct system and do a necessary action there.';  
  	msgs['INV00115']='Unable to get N.China Agent List.';
  	msgs['INV00116']='Please define S/C or RFA or Customer code.';
  	msgs['INV00117']='Please define VVD or Period.';
  	msgs['INV00118']='Please check your Enterd data. Local charge currency is {?msg1}.';
  	msgs['INV00119']='Can\'t found Revenue VVD or Revenue lane.';
  	msgs['INV00120']='Charge code CFR/JOP/TVA are only allowed for \'TN\' type. Please check again.';
  	msgs['INV00121']='Invalid Local VVD! \'USAC\' + YYMM + \'M\' only for \'EQ\' type.';
  	msgs['INV00122']='Can\'t find effective date. G/L Period is not open. Please contact  H/O!';
  	msgs['INV00123']='Office rep customer code is not allowed. Please change the customer code.';
  	msgs['INV00124']='You can attach only 1 document in your PC. \nAttached file will be replaced by that one you\'re going to select. Are you sure to go ahead?';
  	msgs['INV00125']='All of the invoices belonging to the period you set will be issued. Are you sure to go ahead?';
  	msgs['INV00126']='Are you sure you want to update this ex. rate?';
  	msgs['INV00127']='You may choose either Group charge amount items(OFT, BAF, PCS, Other) or relevant items of CCT/PPD Charge by CNTR(Vertical).';
  	msgs['INV00128']='Please check master item and relevant items.{?msg1}.';
  	msgs['INV00129']='Please input LPO No or selcet NONE';
  	msgs['INV00130']='Please check your Enterd data. Invalid Account code!';
  	msgs['INV00131']='Please check location code(mandatory item). You Should input more one location.';
  	msgs['INV00132']='Can\'t find Sailing Date. Please check Data.';
  	msgs['INV00133']='Location code is invalid!  It doesn\'t exist.';
  	msgs['INV00134']='Currency code is invalid! EUR is available only for local charge.';
  	msgs['INV00135']='You should select wording for this \'send by\'option. Please try again.';
  	msgs['INV00136'] = 'Invoice issue failed. Please check invoice status.';
  	msgs['INV00137'] = "Invoice currency differs from customer default currency.\n{?msg1}\nDo you want to continue?";
  	msgs['INV00138'] = "Please specify the reason for changing exchange rate date?";
  	msgs['INV00139'] = "Please specify the reason for deleting exchange rate date?";
  	msgs['INV00140'] = "Please select to see history data.";
  	msgs['INV00141'] = "Please select one data to see history data.";
  	msgs['INV00142'] = "{?msg1}Rate exceeds 30% tolerance of latest rate: {?msg2}\nYou do not have the security to overwrite the exchange rate.";
  	msgs['INV00143'] = "{?msg1}Rate exceeds 5% tolerance level of latest rate {?msg2}\nDo you want to proceed anyway?";
  	msgs['INV00144'] = "{?msg1}'s ar currency is {?msg2}.\nThis currency differs from local currency.\nYou can't select this office."; 	
  	msgs['INV00145'] = "{?msg1}'s exchange rate type is not VVD or Daily.\nYou can't select this office."; 	
  	msgs['INV00146'] = "Daily exchange rate is missing.";
  	msgs['INV00147'] = "Scope already exist for the VVD/Bound/Port.";
  	msgs['INV00148'] = "There is no selected office.\nPlease select office.";
  	msgs['INV00149'] = "You are adding data for office {?msg1}.\nDo you want to continue?";
  	msgs['INV00150'] = "Exchange rate cannot be zero.";
  	msgs['INV00151'] = "Please specify the reason for changing exchange rate.";
  	msgs['INV00152'] = "Please specify the reason for deleting exchange rate.";
  	msgs['INV00153'] = "{?msg1}Data is duplicated.";
  	msgs['INV00154'] = "Maximum resultant rows 5000.\nPlease reduce combination of no of offices/currencies";
  	msgs['INV00155'] = 'Can\'t apply \'Charge break-down by S/C (RFA)\' without S/C No or RFA No';
  	msgs['INV00156'] = "{?msg1}VVD exchange rate exists.\nIn case of deletion, please use the [VVD Ex.Rate Creation by Date] function.";
  	msgs['INV00157'] = "When OTS Summary is INV, {?msg1} cannot be Y.";
  	msgs['INV00158'] = "{?msg1}\nThese B/L's customers are not EDI customers.";
  	msgs['INV00159'] = "You can't input [{?msg1}] before GL Date: [{?msg2}]. "; 
  	msgs['INV00160'] = "Do you want to save{?msg1}?";
  	msgs['INV00161'] = "Please input remark and save in [VVD Ex.Rate Creation by Date] for {?msg1}.";
  	msgs['INV00162'] = "{?msg1}Rate exceeds 50% tolerance level of monthly rate: {?msg2}";
  	msgs['INV00163'] = "{?msg1}Rate exceeds 10% tolerance level of monthly rate: {?msg2}\nDo you want to proceed anyway?";
  	msgs['INV00164'] = "It is only possible to input one of X-charges\n ({?msg1})";
  	msgs['INV00165'] = "Service Scope is missing. \nPlease setup data at MDA - Service Scope.";
    msgs['INV00166'] = "[{?msg1}] is not Invoice No of INV module. \nPlease reissue this Invoice No in DMT, TPB, MNR or LSE module. ";
    msgs['INV00167'] = "No issued invoice exist in this B/L.";
    msgs['INV00168'] = "Rep.Customer of Office is not allowed. \nPlease use Actual Customer code.";
    msgs['INV00169'] = "Already existed BLs are not allowed in 'MOS' Revenue Type. \nPlease use 'Auto BL' button or enter BL No manually.";
    msgs['INV00170'] = "OSCAR Invoice No is allowed in Master INV field. Please check the data.";
    msgs['INV00171'] = "Master Inv field is required when Revenue Type is 'MOS'.";    
    msgs['INV00172'] = "Common VVD is not allowed for LCL VVD field. Please enter actual VVD from Vessel Schedule.";    
    msgs['INV00173'] = "Invoice issue process are running by another user. \nPlease try again later."; 
    msgs['INV00174'] = "There is other {?msg1} execution in progress. Please try again after a few minutes."; 
    msgs['INV00175'] = "Contains Data already sent by another user. \nPlease retrieve again.";
    msgs['INV00176'] = "Please check mandatory item. {?msg1}";
    msgs['INV00177'] = "No exchange rate exists in this data\'s some charge. Please update exchange rate first before invoice split.";
    msgs['INV00178'] = "Include TAX Charge data already exists. \nALL CHG can be changed to YES after deleting existed Include data.";
    msgs['INV00179'] = "Individual Dom Country already exists. \nTrade Tp can be changed to others after deleting existed data.";
	msgs['INV00180'] = "Would you like to use the exclusive tax invoice form? \n If yes,  please click \'OK\', otherwise, click \'Cancel\'. \n  - OK: Exclusive Tax Invoice form \n  - Cancel : General Invoice form";
    msgs['INV00181'] = "The EFF fm Dt inputted should be bigger than the EFF to Dt of existed Setup Data.";
    msgs['INV00182'] = "This customer's GST number is empty. \nPlease enter the GST number of {?msg1}.";
    msgs['INV00183'] = "There is no data. Please click button {?msg1}.";
    
    /**
	 * 조회한 xml데이터의 MESSAGE를 가져온다.<br>
	 * 
	 * @param {string} sXml 필수
	 * @return xml의 <MESSAGE> Node 값
	 * @version 2009.09.01
	 */
    function CoInvShowXmlMessage(xmlStr) {
    	return ComGetSelectSingleNode(xmlStr, "MESSAGE");
    }
    /** 
  	 * INVCommonGS.do 에서 off_cd 콤보박스 출력시 사용<br>
  	 * <br><b>Example :</b>
  	 * <pre>
  	 * </pre>
  	 * @param sheetObj : 그리드객체, formObj : 폼객체, cmbObj : 콤보대상객체, allYn : ALL 추가여부(Y)
  	 * @return 없음
  	 * @see #
  	 * @author 한동훈
  	 * @version 2009.10.19
  	 */
	function ComboObject_OfcCd(sheetObj, formObj, cmbObj, all, select_yn) {
		formObj.f_cmd.value=SEARCH02;
 		var sXml=sheetObj.GetSearchData("INVCommonGS.do", FormQueryString(formObj));
		var sStr=ComGetEtcData(sXml,"ar_ofc_cd");
		var arrStr=sStr.split("|");
		MakeComboObject_OfcCd(cmbObj, arrStr, all);
		var arrStr2=arrStr[1].split("^");
		var ar_ofc_cd=arrStr2[3];
		if(select_yn != "N"){
			cmbObj.text=ar_ofc_cd;
		}
        cmbObj.SetDropHeight(190);
   	 }
	//INVCommonGS.do 에서 off_cd 콤보박스 출력시 사용(cmbObj : 대상객체, arrStr : 데이타 배열, allYn : ALL 추가여부(Y)
	/** 
  	 * off_cd 콤보박스 출력시 사용-콤보박스 세팅<br>
  	 * <br><b>Example :</b>
  	 * <pre>
  	 * </pre>
  	 * @param cmbObj : 대상객체, arrStr : 데이타 배열, allYn : ALL 추가여부(Y)
  	 * @return 없음
  	 * @see #
  	 * @author 한동훈
  	 * @version 2009.10.19
  	 */
	function MakeComboObject_OfcCd(cmbObj, arrStr, allYn) {
		cmbObj.RemoveAll();
   		for (var i=1; i < arrStr.length;i++ ) {
   			var arrStr2=arrStr[i].split("^");
   			var ar_ofc_cd=arrStr2[1];
   			cmbObj.InsertItem(i-1, ar_ofc_cd, ar_ofc_cd);
   		}
   		if(allYn=='Y'){
   		cmbObj.InsertItem(0, "ALL", "ALL");
   		}
   		cmbObj.SetBackColor("#CCFFFD");
   	 }
	/** 
  	 * off_cd 콤보박스 출력시 사용-콤보박스 세팅<br>
  	 * <br><b>Example :</b>
  	 * <pre>
  	 * </pre>
  	 * @param cmbObj : 대상객체, arrStr : 데이타 배열, allYn : ALL 추가여부(Y)
  	 * @return 없음
  	 * @see #
  	 * @author 한동훈
  	 * @version 2009.10.19
  	 */
	function MakeComboObject_OfcCd_Re(cmbObj, arrStr, allYn) {
		cmbObj.RemoveAll();
   		for (var i=1; i < arrStr.length;i++ ) {
   			var arrStr2=arrStr[i].split("^");
   			var ar_ofc_cd=arrStr2[1];
   			cmbObj.InsertItem(i-1, ar_ofc_cd, arrStr[i]);
   		}
   		if(allYn=='Y'){
   		cmbObj.InsertItem(0, "ALL", "ALL^ALL");
   		}
   		cmbObj.SetBackColor("#CCFFFD");
   	 }
	
	/**
	   * IBSheet의 GetSearchXml함수를 통해 가져온 XML 데이터를 <br>
	   * IBMultiCombo의 item으로 insert 해준다.ComBkgXml2ComboItem 참조<br>
	   * <b>Example :</b>
	   *
	   * <pre> 
	   * var sXml = mySheet.GetSearchXml(&quot;aaa.do&quot;); // 조회결과 35건.
	   * var arrData = ComPriXml2ComboItem(xmlStr, combo1, &quot;cd&quot;, &quot;nm&quot;);
	   *
	   * </pre>
	   *
	   * @param {string} xmlStr 필수, IBSheet를 통해 받아온 xml 문자열.
	   * @param {object} cmbObj 필수, insert하고자 하는 IBMultiCombo Object.
	   * @param {string} codeCol 필수, Combo의 Code컬럼명.
	   * @param {string} textCol 필수, Combo의 Text컬럼명. 다수일 경우 '|' 로 연결
	   * @param {boolean} bClear 선택, Combo의 기존 내용을 Clear할지 여부(combo.RemoveAll()). 기본값=true.
	   * @return 없음.
	   * @author 김현화
	   * @version 2011.03.10
	   */	 
	 
	  function ComInvXml2ComboItem(xmlStr, cmbObj, codeCol, textCol, textCol2) {
	      if (xmlStr == null || xmlStr == "" || cmbObj == null || cmbObj == "") {
	          return;
	      }
	      if (codeCol == null || codeCol == "" || textCol == null || textCol == "") {
	          return;
	      }

	      try {
	          cmbObj.RemoveAll();

	          var xmlDoc = ComGetXmlDoc(xmlStr);
	          //xmlDoc.loadXML(xmlStr);

	          var xmlRoot = xmlDoc.documentElement;
	          if (xmlRoot == null) {
	              return;
	          }

	          var dataNode = xmlRoot.getElementsByTagName("DATA").item(0);
	          if (dataNode == null || dataNode.attributes.length < 3) {
	              return;
	          }

	          var col = dataNode.getAttribute("COLORDER");
	          var colArr = col.split("|");
	          var sep = dataNode.getAttribute("COLSEPARATOR");
	          var total = dataNode.getAttribute("TOTAL");

	          var dataChildNodes = dataNode.childNodes;
	          if (dataChildNodes == null) {
	              return;
	          }

	          var colListIdx = Array();
	          for ( var i = 0; i < colArr.length; i++) {
	              if (colArr[i] == codeCol) {
	                  colListIdx[0] = i;
	              }
	              if (colArr[i] == textCol) {
	                  colListIdx[1] = i;
	              }
	              if (colArr[i] == textCol2) {
	                  colListIdx[2] = i;
	              }
	          }

	          for ( var i = 0; i < dataChildNodes.length; i++) {
	              if (dataChildNodes[i].nodeType != 1) {
	                  continue;
	              }
	              var arrData = dataChildNodes[i].firstChild.nodeValue.split(sep);

	              var item = arrData[colListIdx[0]] + "|" + arrData[colListIdx[1]] + "|" + arrData[colListIdx[2]];
	              cmbObj.InsertItem(i, item, arrData[colListIdx[0]]);
	          }

	      } catch (err) {
	          ComFuncErrMsg(err.message);
	      }
	  }
	  
	/** 
  	 * 구분자로 연결된 string 을 in 조건에 맞는 형식으로 리턴<br>
  	 * <br><b>Example :</b>
  	 * <pre>
  	 * </pre>
  	 * @param listStr : 대상리스트 String (예: "ABC, BCD, EFG" ), separator : 구분자 
  	 * @return 없음
  	 * @see #
  	 * @author KIM OK RYE
  	 * @version 2014.12.24
  	 */	  	  
	  function MakeInQueryStr(listStr, separator) {
		  var inStr = "";
		  
		  var arrStr = listStr.split(separator);
		  
		  for(var i=0; i < arrStr.length;i++) {
			  if(arrStr[i].trim().length > 0) { 
				  inStr += "'" + arrStr[i] + "'";
				  if(i < arrStr.length-1) {
					  inStr += ",";
				  }
			  }
		  }  
		  return inStr;
	  }
	  
	  function InvXmlToArray(xmlStr) {
			var rtnArr=new Array();
			if (xmlStr == null || xmlStr == "") {
				return;
			}
			try {
		        var xmlDoc = ComGetXmlDoc(xmlStr);
		        if (xmlDoc == null) return;
		        var xmlRoot = xmlDoc.documentElement;
		        if (xmlRoot == null)  return;
	
				var dataNode=xmlRoot.getElementsByTagName("DATA").item(0);
				if (dataNode == null || dataNode.attributes.length < 3) {
					return;
				}
				var col=dataNode.getAttribute("COLORDER");
				var colArr=col.split("|");
				var sep=dataNode.getAttribute("COLSEPARATOR");
				var total=dataNode.getAttribute("TOTAL");
				var dataChildNodes=dataNode.childNodes;
				if (dataChildNodes == null) {
					return;
				}
				var retStr="";
				for ( var i=0; i < dataChildNodes.length; i++) {
					if (dataChildNodes[i].nodeType != 1) {
						continue;
					}
					var arrData=dataChildNodes[i].firstChild.nodeValue.split(sep);
					rtnArr.push(arrData);
				}
			} catch (err) {
				ComFuncErrMsg(err.message);
			}
			return rtnArr;
		} 
	  
    /**
     * IBSheet의 결과xml에 에러가 있으면 IBSheet를 통해 Alert
     *
     * @param {string} shtObj 필수, IBSheet Object
     * @param {string} xmlStr 필수, IBSheet를 통해 받아온 xml 문자열.
     * @return {Boorean}
     */
    function INVDecideErrXml(shtObj, xmlStr) {
        if (shtObj == null || shtObj == "" || xmlStr == null || xmlStr == "") return;
        if (ComGetEtcData(xmlStr, "TRANS_RESULT_KEY") == "F") {
            //shtObj.LoadSearchData(xmlStr,{Sync:1} );
            return true;    // Error일때
        } else {
            return false;
        }
    } 
    
    
    
    
    /**
     * @param {bool}   flag         필수,키보드나 마우스를 대기상태(true)/일반상태(false)
     * @param {bool}   hideYn       hide, fade 여부 
     * @return 없음
     * @see #ComOpenWaitCallFunc
     */    
    var isOpenWaitWindow = false;	//for wait show/close check
    function InvOpenWait(flag, hideYn){
        try {
            if(flag == isOpenWaitWindow ) return;
            isOpenWaitWindow = flag;
            if(flag) {
            	var waitW   = 60;
            	var waitH   = 60;
            	var waitImage = "style/images/theme_default/waiting.gif";
            	
            	var ifr = document.getElementById("waitiframe");
            	if (ifr==null){
                	$('<div class="layer_wait"> </div>').appendTo("body");
                	$('<img name="waitiframe" id="waitiframe" src="'+waitImage+ '">').appendTo(".layer_wait");            	
                	//$('<IFRAME id="waitiframe" name="waitiframe" frameBorder="0" name="iFrm" src="'+waitImage+ '"scrolling="no" width="'+waitW + '" height="' + waitH + '"></IFRAME>').appendTo(".layer_wait")
        
                	$("body").prepend("<div class='layer_wait_bg'></div>");        	
            	}

            	//open wait image
            	if(hideYn){
            		$(".layer_wait_bg,.layer_wait").show();
            	} else {
            		$(".layer_wait_bg,.layer_wait").fadeIn(100);
            	}

            	//position center
            	$(".layer_wait").css({
                	marginTop : parseInt("-" + $(".layer_wait").outerHeight()/2),
                	marginLeft : parseInt("-" + $(".layer_wait").outerWidth()/2)
            	});
            } else {
            	//close wait image
            	if(hideYn){
            		$(".layer_wait_bg,.layer_wait").hide();
            	} else {
            		$(".layer_wait_bg,.layer_wait").fadeOut(100);
            	}
            }
        } catch(err) {ComFuncErrMsg(err.message); }
        return true;
    }
    
    /**
     * 특정값을 특정 소숫점 자리만큼 반올림한 값을 리턴한다. <br>
     * 
     * @param {number,object} obj   필수,대상 숫자값 또는 HTML태그(Object)
     * @param {number}        pos   선택,소숫점 아랫자리 개수, default=2
     * @returns number,대상 숫자를 소숫점 자리만큼 반올림한 수
     */
    function InvRound(obj, pos) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var num = getArgValue(obj);
            if (pos==undefined || pos==null ) pos = 0;
            
            var val = String(num); 
       	 	if (isNaN(parseFloat(val))) return ""; 
       	 	val = parseFloat(val).toFixed(8);
       	 
       	 	return ComRound(parseFloat(val),pos);
        } catch(err) { ComFuncErrMsg(err.message); }
    } 
    
    /**
     * 
     * @param {Number} float or Int
     * @param {Int} 소수점 자리수
     * @return {String} formatting number Str
     */
	function InvMakeNumberFormat(recval,dpPrcsKnt){
		 var val = String(recval);
		 if (isNaN(parseFloat(val))) return "";   
		 val = parseFloat(val).toFixed(8);
		 recval = ComRound(parseFloat(val),2);
		 val = String(recval);
		 var numberFormat = "#,###";
		 if(ComIsNull(dpPrcsKnt)){ 
			 dpPrcsKnt = 0;
		 } 
		 if(dpPrcsKnt > 0){
			 numberFormat += '.';
		 for (var i=1; i<= dpPrcsKnt; i++){
			 numberFormat += '0';
			 }
		 }  
		 var retVal = ComAddComma2(val, numberFormat);   
		 return retVal; 
	}
	
	
    /**
     * Thailand Local Charge List
     *
     * @param {string} shtObj 필수, IBSheet Object
     * @return {string}
     * @author KIMOKRYE 
     */	
    function InvGetTHLocalChgList(sheetObj) {
    	var sXml=sheetObj.GetSearchData("STMCommonGS.do", "f_cmd=" + COMMAND01 + "&lu_appl_cd=SAR&lu_tp_cd=TH LOCAL CHARGE");
     	     	
    	var comboString=ComXml2ComboString(sXml, "lu_cd", "lu_desc");
    	return comboString[0];
    }	
    
	
    /**
     * Local Sysdate
     *
     * @param {string} shtObj 필수, IBSheet Object
     * @return {string}
     * @author KIMOKRYE 
     */	
    function InvGetLocalSysdate(sheetObj) {
    	var sXml=sheetObj.GetSearchData("STMCommonGS.do", "f_cmd=" + COMMAND08);
    	var localSysdate=ComGetEtcData(sXml,"local_time") ? "" : ComGetNowInfo("ymd" );
    	return localSysdate;
    }    
    
    /**
     * replaceAll 효과
     *
     * @param {string} str 치환할 대상, orgStr 치환할 문자, regStr 치환될 문자
     * @return {string}
     * @author KIMOKRYE 
     */	
	function InvReplaceAll(str, orgStr, repStr){
    	return str.split(orgStr).join(repStr); 
    }	    
	  