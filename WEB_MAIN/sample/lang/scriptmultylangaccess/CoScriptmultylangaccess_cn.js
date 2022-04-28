/**
* IBMulti Combo Item Setting
* param : comboObj ==> Combo Object  
* param : arrStrNm ==> Combo Item Name Array
* param : arrStrCd ==> Combo Item Code Array
*/

msgs['CCD00001'] = '有毛病的  情報 多國語  测试.';
msgs['CCD00002'] = '无法知道渠道的情报';
msgs['CCD00003'] = 'When Activity Type is \'T\', [{?msg1}] can not be blank.';
msgs['CCD00004'] = 'Duplicate data exist in [{?msg1}], Please check it again.';
msgs['CCD00005'] = '[{?msg1}] should be later than [{?msg2}]';
msgs['CCD00006'] = 'This data alreay exists';
msgs['CCD00007'] = 'It is not an e-mail address format. Please check it again.';
msgs['CCD00008'] = 'There should be one Primary Check Flag.';
msgs['CCD00009'] = 'Customer Code has only one Primary Flag.';
msgs['CCD00010'] = 'Selected [{?msg1}] does not match Type Size Code.';
msgs['CCD00010'] = 'Selected [{?msg1}] does not match Type Size Code.';

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

function ComXmlString(xmlStr, codeCol) {
	var rtnArr = new Array();
	
	if (xmlStr == null || xmlStr == "") {
		return rtnArr;
	}
	
	if (codeCol == null || codeCol == "") {
		return rtnArr;
	}

	try {
		var xmlDoc = new ActiveXObject("Microsoft.XMLDOM");
		xmlDoc.loadXML(xmlStr);

		var xmlRoot = xmlDoc.documentElement;
		if (xmlRoot == null) {
			return rtnArr;
		}

		var dataNode = xmlRoot.getElementsByTagName("DATA").item(0);
		if (dataNode == null || dataNode.attributes.length < 3) {
			return rtnArr;
		}

		var col = dataNode.getAttribute("COLORDER");
		var colArr = col.split("|");
		var sep = dataNode.getAttribute("COLSEPARATOR");
		var total = dataNode.getAttribute("TOTAL");

		var dataChildNodes = dataNode.childNodes;
		if (dataChildNodes == null) {
			return rtnArr;
		}
		
		var colListIdx = Array();
		for ( var i = 0; i < colArr.length; i++) {
			if (colArr[i] == codeCol) {
				colListIdx[0] = i;
			}
		}
		
		var sCode = "";
		for ( var i = 0; i < dataChildNodes.length; i++) {
			if (dataChildNodes[i].nodeType != 1) {
				continue;
			}
			var arrData = dataChildNodes[i].firstChild.nodeValue.split(sep);
			
			sCode += arrData[colListIdx[0]];
			
			if (i != dataChildNodes.length - 1) {
				sCode += "|";
			}
		}
		rtnArr.push(sCode);
	} catch (err) {
		ComFuncErrMsg(err.message);
	}

	return rtnArr;
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
	var srcValue = obj.value;
 	if (srcValue.length == 4) {
 		obj.value = srcValue.substring(0,4) + "-"
 	}
 	if (srcValue.length == 7) {
 		obj.value = srcValue.substring(0,7) + "-"
 	}
}

/**
 * 키보드로 입력되는 값 제어
 * @param obj
 */
function keyValidation(obj){
	
	var keyValue = event.keyCode ? event.keyCode : event.which ? event.which : event.charCode;
	
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
	        ComKeyOnlyNumber(event.srcElement, ".");
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
     		ComKeyOnlyNumber(event.srcElement, "-");
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