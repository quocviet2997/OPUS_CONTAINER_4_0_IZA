/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : CoCcd.js
*@FileTitle  : CCD 공통 자바스크립트
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
 
/**
* IBMulti Combo Item Setting
* param : comboObj ==> Combo Object  
* param : arrStrNm ==> Combo Item Name Array
* param : arrStrCd ==> Combo Item Code Array
*/

	if(msgs == undefined){
		msgs = new Array();
	}
msgs['CCD00001'] = 'Mandatory field is missing.  Please enter [{?msg1}].';
msgs['CCD00002'] = 'There is no data.';
msgs['CCD00003'] = 'When Activity Type is \'T\', [{?msg1}] can not be blank.';
msgs['CCD00004'] = 'Duplicate data exist in [{?msg1}], Please check it again.';
msgs['CCD00005'] = '[{?msg1}] should be later than [{?msg2}]';
msgs['CCD00006'] = 'This data alreay exists';
msgs['CCD00007'] = 'It is not an e-mail address format. Please check it again.';
msgs['CCD00008'] = 'There should be one Primary Check Flag.';
msgs['CCD00009'] = 'Customer Code has only one Primary Flag.';
msgs['CCD00010'] = 'Selected [{?msg1}] does not match Type Size Code.';
msgs['CCD00011'] = "Data count:[{?msg1}] \nDo you want to down excel?";
msgs['CCD00012'] = "Do you want to delete data?";
msgs['CCD00013'] = 'The location of "{?msg1}" is not defined in location table. Please check location code.';
msgs['CCD00014'] = 'The Code already exist in lease company yard master codes. Please check again.';
msgs['CCD00015'] = 'SCC is not found! If you want to update EQ SCC, please advise MDA administrator.';
msgs['CCD00016'] = 'This code is using in other EQ location hierarchy.\nPlease check this again in the EQ location hierarchy.';
msgs['CCD00017'] = 'This code is using as SCC code of specific Location code(s).\nIf you want to delete this SCC code, SCC of the Location code(s) should be changed first.\nPlease check this again in the Location  area.';
msgs['CCD00018'] = 'This code is using as SCC code of specific Yard code(s).\nIf you want to delete this SCC code, SCC of the Yard code(s) should be changed first.\nPlease check this again in the Yard  area.';
msgs['CCD00019'] = 'There is no data to save.';
msgs['CCD00020'] = 'As SCC code is aleady exist, data was saved partially. Please check this again.';
msgs['CCD00021'] = 'SCC code is aleady exist. Please check this again.';
msgs['CCD00022'] = 'Character and Port flag is unmatched. Please check again.';
msgs['CCD00023'] = 'Do you want to {?msg1}?';
msgs['CCD00024'] = 'The Code already exist in yard master codes. Please check again.';
msgs['CCD00025'] = 'Region is not defined. Please enter Region code.';
msgs['CCD00026'] = 'Request was approved.';
msgs['CCD00027'] = 'Please input \"Reject reason\" into comments.';
msgs['CCD00028'] = 'Your reject message was transmitted.';
msgs['CCD00029'] = 'Do you want to really {?msg1}?';
msgs['CCD00030'] = 'Do you want to request Code Creation to Master Data Steward?';
msgs['CCD00031'] = 'Your request was transmitted!';
msgs['CCD00032'] = 'Do you want to {?msg1}?';
msgs['CCD00033'] = "{?msg1} doesn't exist.";
msgs['CCD00034'] = "{?msg1} doesn't exist. Do you want to create this code?";
msgs['CCD00035'] = "Do you want to request Code Creation to Master Data Steward?";
msgs['CCD00036'] = 'Rejected request was deleted.';
msgs['CCD00037'] = 'This data is waiting approval.';
msgs['CCD00038'] = 'Please input {?msg1}.';
msgs['CCD00039'] = 'Customer Code format is incorrect (Alphabet 2 digit + Numeric 1 digit over).';
msgs['CCD00040'] = 'There is no credit information of this customer.';
msgs['CCD00041'] = 'SCC is not found. If you want to update EQ SCC, please register SCC first.';
msgs['CCD00042'] = 'SCC is missing! If you want to update Yard Code, please go to Location and enter EQ SCC.';
msgs['CCD00043'] = 'At least 1 item among {?msg1} is needed';
msgs['CCD00044'] = 'Vessel Code must be 4 digit code';
msgs['CCD00045'] = 'Legacy Code(SAP ID) is not unique.';
msgs['CCD00046'] = 'Check process status, Request has been approved. Request No.: {?msg1}';
msgs['CCD00047'] = 'There is a restriction on typing address when selected control office is in Japan.';
msgs['CCD00048'] = 'It is deleted data, so change the delete flag first.';
msgs['CCD00049'] = 'VIP Code must be 3 digit code';
msgs['CCD00050'] = 'Existing Customer Code [{?msg1}] under {?msg2} hierarchy will be automatically converted to {?msg3}';
msgs['CCD00051'] = '{?msg1} Customer cannot be converted to {?msg2} Customer because on change, there will be no {?msg3} Customer designated.';
msgs['CCD00052'] = 'It is Dummy Customer Code.';
msgs['CCD00053'] = 'Please check Include/Exclude'; 
msgs['CCD00054'] = 'Changing Global Level customer\'s Group ID will dissolve the affiliated customers into \'Individual Level\'. Do you still want to proceed?';
msgs['CCD00055'] = 'FMC File Status does not match with Tariff, please check Pricing Tariff Code page.';
msgs['CCD00056'] = 'System blocked. Because the customer associate with Group ID under Global hierarchy.'	;
msgs['CCD00057'] = 'System blocked. Because the customer associate with Group ID under Country hierarchy.';
msgs['CCD00058'] = 'Region: {?msg1} in Service Scope Limit is only used in {?msg2}.';
msgs['CCD00059'] = 'Region does not exist in Service Scope Limit';
msgs['CCD00060'] = 'Group Customer Code must be start with 2 digit code \'G-\'.';
msgs['CCD00061'] = 'Group Customer Code format is incorrect.';
msgs['CCD00062'] = 'Country code does not match with the first 2 digits of Location code.';
msgs['CCD00063'] = 'NVO Keyword should be shorter than 50 letters';
msgs['CCD00064'] = 'This is already mapped';
msgs['CCD00065'] = 'Mot No is duplicated';
msgs['CCD00066'] = 'This is not auto mapping item';
msgs['CCD00067'] = 'When Customer Type is Non-BCO,  MOT information is mandatory';
msgs['CCD00068'] = 'When Customer Type is BCO and Location is CN, Certificate is mandatory';
msgs['CCD00069'] = 'Attachment is complete';
msgs['CCD00070'] = 'Some active yard code exist on this location, if you want to delete this location code, please delete yard code first';
msgs['CCD00071'] = 'This customer code is already registered as a to-be code of [{?msg1}]. A customer registered as a to-be customer can not have \'To-Be Customer Code\'.' // CR0010136
msgs['CCD00072'] = '[{?msg1}] format is incorrect (Alphabet 2 digit + Numeric 1 digit over).';
msgs['CCD00073'] = 'To-be customer Code is equal to Customer code. Please enter another Code';
msgs['CCD00074'] = 'Please use TO-BE Customer [{?msg1}] instead of [{?msg2}]';  
msgs['CCD00075'] = '{?msg1} must be longer than {?msg2} characters long.';
msgs['CCD00076'] = 'Please select {?msg1}';
msgs['CCD00077'] = 'Location Code: {?msg1} has a active yard. Please delete yard first.';
msgs['CCD00078'] = 'Location: {?msg1} doesn\'t have SCC Code. Please assign SCC first before {?msg2}' ;
msgs['CCD00079'] = 'It is already a deleted credit customer. Would you like to change the status first for this customer?' ;
msgs['CCD00080'] = 'No credit agreement for this customer, do you want to create a new credit agreement?' ;
msgs['CCD00081'] = "only less than {?msg1} -month periods allowed";
msgs['CCD00082'] = "{?msg1} and {?msg2} are same.";
msgs['CCD00083'] = "Please input {?msg1} first.";
msgs['CCD00084'] = "Deleting existingi data is not allowed.";
msgs['CCD00085'] = "Upper hierachy loaded automatically.";
msgs['CCD00086'] = "Related other data is shown and changed automatically.";
	
/**
 * IBSheet의 GetSearchXml함수를 통해 가져온 XML 데이터를 <br>
 * 문자열형태로 반환한다.(&quot;|&quot;로 연결된 문자열)<br>
 * <b>Example :</b>
 * 
 * <pre>
 * var sXml = mySheet.GetSearchXml(&quot;aaa.do&quot;); // 조회결과 35건.
 * var arrData = ComXmlString(xmlStr, nm);
 * 
 * </pre>
 * 
 * @param {string} xmlStr 필수, IBSheet를 통해 받아온 xml 문자열.
 * @param {string} Text컬럼명.
 * @return array   Code연결 문자열과 Text연결 문자열이 담긴 배열.
  * @author 박성수
  * @version 2009.04.22
 */
function _ComGetValueForCombo(obj) {
	if (Object.prototype.toString.call(obj) === '[object Array]') {
	  var str = obj[0];
	  return str;
	  }
	  return obj;
  }    


function ComXmlString(xmlStr, codeCol) {
	var rtnArr=new Array();
	if (xmlStr == null || xmlStr == "") {
		return rtnArr;
	}
	if (codeCol == null || codeCol == "") {
		return rtnArr;
	}
	try {
		 var xmlDoc = ComGetXmlDoc(xmlStr);
	     if (xmlDoc == null) return;
	     var xmlRoot = xmlDoc.documentElement;
		if (xmlRoot == null) {
			return rtnArr;
		}
		var dataNode=xmlRoot.getElementsByTagName("DATA").item(0);
//		if (dataNode == null || dataNode.attributes.length < 3) {
		if (dataNode == null) {
			return rtnArr;
		}
		var col=dataNode.getAttribute("COLORDER");
		if(col == null || col =="" || col == "null" ){
			return rtnArr;
		}
		var colArr=col.split("|");
		var sep=dataNode.getAttribute("COLSEPARATOR");
		var total=dataNode.getAttribute("TOTAL");
		var dataChildNodes=dataNode.childNodes;
		if (dataChildNodes == null) {
			return rtnArr;
		}
		var colListIdx=Array();
		for ( var i=0; i < colArr.length; i++) {
			if (colArr[i] == codeCol) {
				colListIdx[0]=i;
			}
		}
		var sCode="";
		for ( var i=0; i < dataChildNodes.length; i++) {
			if (dataChildNodes[i].nodeType != 1) {
				continue;
			}
			var arrData=dataChildNodes[i].firstChild.nodeValue.split(sep);
			sCode += arrData[colListIdx[0]];
			if (i != dataChildNodes.length - 1) {
				sCode += "|";
			}
		}

		if(sCode.length > 0 &&  sCode.slice(-1) == "|"){
			sCode = sCode.substring(0,sCode.length-1)
		}
		rtnArr.push(sCode);
	} catch (err) {
		ComFuncErrMsg(err.message);
	}
	return _ComGetValueForCombo(rtnArr);
}
/**
 * DATE 값이 변경 되었을 때 값의 유효성을 체크
 */
function checkDateValue(obj) {
	if (!ComIsDate(obj.value)) {
		ComShowCodeMessage("COM12179");
		obj.focus();
		return false;
	}
	return true;
}
/**
 * DATE 값이 변경 되었을 때 값의 유효성을 체크
 */
function checkEmailValue(obj) {
	if (!ComIsEmailAddr(obj.value)) {
		ComShowCodeMessage("CCD00007");
 		obj.focus();
 		return false;
 	}
 	return true;
}
/**
 * DATE 값이 변경 되었을 때 값의 유효성을 체크
 */
function checkDateForm(obj) {
	ComKeyOnlyNumber(obj);
	var srcValue=obj.value;
 	if (srcValue.length == 4) {
 		obj.value=srcValue.substring(0,4) + "-"
 	}
 	if (srcValue.length == 7) {
 		obj.value=srcValue.substring(0,7) + "-"
 	}
}
/**
 * 키보드로 입력되는 값 제어
 * @param obj
 */
function keyValidation(obj){
	var keyValue=ComGetEvent("keycode");
	switch(obj.dataformat){
		// 정수형 숫자
	    case "num": 
	    case "ymd":
	    case "yyyy":
	    case "hm":
	        ComKeyOnlyNumber();
	    break;
	    // 실수형 숫자
	    case "float":
	        ComKeyOnlyNumber(ComGetEvent(), ".");
	    break;
	    // 영문자
	    case "eng":
	        ComKeyOnlyAlphabet();
	    break;
	    // 영소문자
	    case "engdn":
	        ComKeyOnlyAlphabet('lower');
	    break;
	    // 영대문자
	    case "engup": 
	        ComKeyOnlyAlphabet('upper');
	    break;
	    //영대문자+숫자
	    case "uppernum": 
	    	ComKeyOnlyAlphabet('uppernum');
	    break;
	    //영문+숫자+공통특수문자(./()@&-', _)
	    case "engnum": 
	   	  	ComKeyOnlyAlphabet('num', "32|38|39|40|41|44|45|46|47|64|95");
	    break;
	    //숫자+"-" 입력가능
	    case "fax":
     	case "tel":
     		ComKeyOnlyNumber(ComGetEvent(), "-");
     	break;
     	//숫자+"-._@" 입력가능
     	case "email":
     		ComKeyOnlyAlphabet('num', "45|46|64|95");
     	break;
     	 case "engupspecial": // 영문대문자 + Space + &-,.
         ComKeyOnlyAlphabet('uppernum', "32|38|39|40|41|44|45|46|47|64|95");
         break;
     	case "engupbracket": // 영문대문자 + Space + &-,.[]
        ComKeyOnlyAlphabet('uppernum', "32|38|39|40|41|44|45|46|47|64|95|91|93");
        break;
     	//영문+숫자+공통특수문자+한글 등등
     	default:
     		if ((keyValue >= 33 && keyValue <= 37) ||(keyValue >= 42 && keyValue <= 43) || (keyValue >= 58 && keyValue <= 63) || (keyValue >= 91 && keyValue <= 94))
     		{
     			event.keyCode=false;
     		}
	    break;
	}
}

/**
 * 날짜 From To 에대한 개월수를 초과하는지 검사하여 From + months >= To일 경우 false를 반대의 경우 True를 return 한다.
 * @param fromDate 시작일
 * @param toDate 종료일
 * @param months 검사할 최대개월수
 * @param formatStr 날짜 포멧 문자
 * @return boolean
 */
 function ComCcdMonthsBetweenCheck(fromDate, toDate, months, formatStr){
    var fmtStr="";
    if (formatStr == null || formatStr == "") {
      fmtStr="-";
    } else {
      fmtStr=formatStr;
    }
    var ufFromDate=fromDate.replace(eval("/" + fmtStr + "/gi"), "");
      var ufToDate=toDate.replace(eval("/" + fmtStr + "/gi"), "");
    var fYear=parseInt(ufFromDate.substring(0,4));
    var fMonth=ufFromDate.substring(4,5)=="0"?parseInt(ufFromDate.substring(5,6))-1:parseInt(ufFromDate.substring(4,6))-1;
    var fDay=ufFromDate.substring(6,7)=="0"?parseInt(ufFromDate.substring(7,8)):parseInt(ufFromDate.substring(6,8));
    var tYear=parseInt(ufToDate.substring(0,4));
    var tMonth=ufToDate.substring(4,5)=="0"?parseInt(ufToDate.substring(5,6))-1:parseInt(ufToDate.substring(4,6))-1;
    var tDay=ufToDate.substring(6,7)=="0"?parseInt(ufToDate.substring(7,8)):parseInt(ufToDate.substring(6,8));
    var bLastDay=false;
    var iLastDay=ComGetLastDay(fYear, fMonth +1);
    if (iLastDay == fDay) { bLastDay=true; }
    // 월처리
    for (var i=0; i< months; i++ ) {
        fMonth=fMonth + 1;
        if (fMonth > 11) {
            fYear=fYear + 1;
            fMonth=0;
        }
    }
    // 말일이면 변경된 월의 말일을 가져온다.
    if(bLastDay) {
      fDay=ComGetLastDay(tYear, tMonth +1);;
    }
    var dAddedDate=new Date("" + fYear, "" + fMonth, "" + fDay);
    var dToDate=new Date("" + tYear, "" + tMonth , "" + tDay);
    diffDay=( dAddedDate - dToDate) /(1000*3600*24);
    if ( diffDay > 0) {
      return true;
    }
    return false;
 }
