/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : something.js
*@FileTitle  : Some Title 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/


    /** Date 구분자 **/
    var DATE_SEPARATOR = "-";
    /** 대표번호 구분자 **/
    var NO_Separator = "-";


    /**
     * 문자열 또는 입력 받은 HTML태그(Object)의 문자열의 길이가 특정 길이(len)와 같은지,다른지를 체크한다. <br>
     * 한글의 경우 1바이트로 처리하므로, 1바이트 이상 처리가 필요한경우 {@link #ComChkLenByByte} 함수를 참고한다. <br>
     * len 인자를 설정하지 않고 첫번째 인자가 HTML태그(Object)인 경우 태그의 maxLength 속성으로 값을 가져온다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComChkLen("가나다라");      //결과 : -1
     *     ret = ComChkLen("가나다라", 10);  //결과 : 1
     *     ret = ComChkLen("가나다라", 3);   //결과 : 0
     *     ret = ComChkLen("가나다라", 4);   //결과 : 2
     *     ret = ComChkLen(txtName)          //결과 : 0, &lt;input type="text" name="txtName" value="한진해운" utflength="3"&gt;인 경우
     *     ret = ComChkLen(txtName,4)        //결과 : 2, &lt;input type="text" name="txtName" value="한진해운" utflength="3"&gt;인 경우
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {number}        len   선택,비교할 길이, default=maxLength 속성으로 값
     * @returns   number <br>
     *            -1 : 인자가 올바르지 않아 에러 발생<br>
     *            0  : 길이 초과<br>
     *            1  : 길이 이내<br>
     *            2  : 길이 동일<br>
     * @see #ComChkLenByByte
     * @see #ComGetLenByByte
     */
    function ComChkLen(obj, len) {
        try {
            var sVal = obj;
            var iLen = len;

            //첫번째 인자가 문자열이 아니라 HTML태그(Object)인 경우
            if (isControl(obj)){
              sVal = obj.value;
              //len인자값이 없는 경우 HTML태그(Object)인 경우 태그의 maxLength 속성으로 값을 가져오기
              if (len==undefined || len==null || len <= 0) iLen = obj.maxLength;
            }
            //길이에 따른 리턴값
            if (iLen==undefined || iLen==null || iLen <= 0) return -1;
            if      (sVal.length == iLen)   return 2;
            else if (sVal.length < iLen)    return 1;
            return 0;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 문자열 또는 입력 받은 HTML태그(Object)의 문자열의 길이가 특정 길이(len)와 같은지,다른지를 체크한다. <br>
     * 한글의 경우 3바이트로 처리하므로, 1바이트 처리가 필요한경우 {@link #ComChkLen} 함수를 참고한다. <br>
     * len 인자를 설정하지 않고 첫번째 인자가 HTML태그(Object)인 경우 태그의 maxLength 속성으로 값을 가져온다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComChkLenByByte("가나다라");      //결과 : -1
     *     ret = ComChkLenByByte("가나다라", 10);  //결과 : 1
     *     ret = ComChkLenByByte("가나다라", 3);   //결과 : 0
     *     ret = ComChkLenByByte("가나다라", 12);  //결과 : 2
     *     ret = ComChkLenByByte(txtName)          //결과 : 0, &lt;input type="text" name="txtName" value="한진해운" maxLength="3"&gt;인 경우
     *     ret = ComChkLenByByte(txtName,12)       //결과 : 2, &lt;input type="text" name="txtName" value="한진해운" maxLength="3"&gt;인 경우
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {number}        len   선택,비교할 길이, default=maxLength 속성으로 값
     * @returns   number <br>
     *            -1 : 인자가 올바르지 않아 에러 발생<br>
     *            0  : 길이 초과<br>
     *            1  : 길이 이내<br>
     *            2  : 길이 동일<br>
     * @see #ComChkLen
     * @see #ComGetLenByByte
     */
    function ComChkLenByByte(obj, len) {
        try {
            var sVal = obj;
            var iLen = len;

            //첫번째 인자가 문자열이 아니라 HTML태그(Object)인 경우
            if (isControl(obj)){
              sVal = obj.value;
              //len인자값이 없는 경우 HTML태그(Object)인 경우 태그의 maxLength 속성으로 값을 가져오기
              if (len==undefined || len==null || len <= 0) iLen = obj.maxLength;
            }
            if (iLen==undefined || iLen==null || iLen <= 0) return -1;

            var iValLen = ComGetLenByByte(sVal);

            if (iValLen == iLen) return 2;
            else if (iValLen < iLen) return 1;
            return 0;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 인자가 Object인경우 true를 반환하고, 아닌 경우 false를 반환한다.  <br>
     * 이 함수는 이파일(CoCommon.js)에서만 사용하기 위한 목적으로 만들졌다.
     */
    function isControl(obj) {
        return (obj !=null && typeof(obj)=="object");
    }

    /**
     * 인자가 Object인경우 Object.value를 반환하고, 아닌 경우 인자 자체를 반환한다. <br>
     * 이 함수는 이파일(CoCommon.js)에서만 사용하기 위한 목적으로 만들졌다.
     */
    function getArgValue(obj) {
    	if( obj == undefined) return "";
//    	if( obj.value == -1) return "";
        if (isControl(obj))
            return obj.value;
        else
            return obj
    }

    /**
     * 날짜 문자열을 인자로 받아서 new Date()로 년월일을 설정하여 반환한다. 인자가 날짜형태가 아니면 null을 반환한다. <br>
     * 이 함수는 이파일(CoCommon.js)에서만 사용하기 위한 목적으로 만들졌다.
     */
    function getDateObj(sDate) {
        try {
	        sDate = sDate.replace(/\/|\-|\.|\:|\ /g,"");  //날짜구분자,시간구분자,스페이스 없애기
	        
		    var arr = ComNumberArray(7);
	        var iLen = sDate.length;
	        
	        if (iLen>=4) arr[0]  = sDate.substr(0,4);		//year
	    	if (iLen>=6) arr[1]  = sDate.substr(4,2)-1;		//month
	    	if (iLen>=8) arr[2]  = sDate.substr(6,2);		//day
	    	
	        if (iLen>=10) arr[3] = sDate.substr(8,2);		//hours
	        if (iLen>=12) arr[4] = sDate.substr(10,2);		//minutes
	        if (iLen>=14) arr[5] = sDate.substr(12,2);		//seconds
	        if (iLen<=17) arr[6] = sDate.substr(14);		//hour
	        
	        return new Date(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]);
	        
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 인자값의 문자열의 길이를 리턴한다. Utf-8의 한글의 경우 3Byte로 계산한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetLenByByte("가나다라");      //결과 : 12
     *     ret = ComGetLenByByte("1234가나다라");  //결과 : 16
     *     ret = ComGetLenByByte("abcd가나다라");  //결과 : 16
     *     ret = ComGetLenByByte(txtName);         //결과 : 12, txtName="한진해운"인 경우
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @return number, 문자열의 길이
     * @see #ComChkLen
     * @see #ComChkLenByByte
     * @see String#lengthByte
     */
    function ComGetLenByByte(obj)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sValue = getArgValue(obj);

            var byteLength = 0;
            for (var inx = 0; inx < sValue.length; inx++) {
                var oneChar = escape(sValue.charAt(inx));
                if      ( oneChar.length == 1 )         { byteLength ++;  }
                else if (oneChar.indexOf("%u") != -1)   { byteLength += 3;} //utf-8 기준으로 한글은 3Byte 처리함
                else if (oneChar.indexOf("%") != -1)    { byteLength += oneChar.length/3; }
            } // end for
            return byteLength;
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 인자값 NULL 또는 공백인지 여부를 리턴한다. 공백 Trim 없이 문자열 그대로 확인한다.
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : Null 또는 공백<br>
     *          false : 문자열 내용 있음
     * @see #ComIsEmpty
     */
    function ComIsNull(obj) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            return (sVal == null || sVal == "");
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 인자값에 스페이스 이외의 의미있는 값이 있는지 여부를 리턴한다. <br>
     * 문자열에 포함된 모든 스페이스문자를 제거한 후 값을 확인한다.
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : 공백<br>
     *          false : 공백이외의 문자 있음
     * @see #ComIsNull
     */
    function ComIsEmpty(obj) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            return (ComTrimAll(sVal)=="");
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 인자값의 왼쪽에 있는 스페이스 문자 또는 sChar값의 문자를 제거한 후 나머지 문자열을 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComLtrim("      121323  "); //결과 : "121323  "
     *     ret = ComLtrim("0012132300","0"); //결과 : "12132300"
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {string}        sChar 선택,제거할 문자열, default=" "
     * @return  string, 왼쪽에 있는 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see #ComTrimAll
     * @see #ComRtrim
     * @see #ComTrim
     * @see String#ltrim
     */
    function ComLtrim(obj, sChar)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            if (typeof(sVal)!="string") return "";
            if (sChar==undefined || sChar==null) sChar = " ";
            var i = 0;
            while (sVal.substring(i,i+1) == sChar) { i++; }
            return sVal.substring(i);
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 인자값의 오른쪽에 있는 스페이스 문자 또는 sChar값의 문자를 제거한 후 나머지 문자열을 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComRtrim("  121323      "); //결과 : "  121323"
     *     ret = ComRtrim("0012132300","0"); //결과 : "00121323"
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {string}        sChar 선택,제거할 문자열, default=" "
     * @return  string, 오른쪽에 있는 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see #ComTrimAll
     * @see #ComLtrim
     * @see #ComTrim
     * @see String#rtrim
     */
    function ComRtrim(obj, sChar)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            if (typeof(sVal)!="string") return "";
            if (sChar==undefined || sChar==null) sChar = " ";
            var i = sVal.length - 1;
            while (i >= 0 && sVal.substring(i,i+1) == sChar) {i--;}
            return sVal.substring(0,i+1);
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 인자값의 양쪽에 있는 스페이스 문자 또는 sChar값의 문자를 제거한 후 나머지 문자열을 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComTrim("   121323    "); //결과 : "121323"
     *     ret = ComTrim("*121323*", "*"); //결과 : "121323"
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {string}        sChar 선택,제거할 문자열, default=" "
     * @return  string, 양쪽에 있는 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see #ComTrimAll
     * @see #ComLtrim
     * @see #ComRtrim
     * @see String#trim
     */
    function ComTrim(obj, sChar)
    {
        try {
            return(ComLtrim(ComRtrim(obj, sChar), sChar));
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 문자열에 포함된 모든 스페이스 문자 또는 sChar값의 문자를 제거한 나머지 문자열을 리턴한다. <br>
     * sChar 인자를 여러개 설정할수 있으므로 이 함수의 2번째 이후 모든 인자값은 제거할 문자로 처리한다. <br>
     * 예를 들어 "-"와 "*"를 각자 제거하고자 한다면 다음과 같이 설정한다. <br>
     * ret = ComTrimAll("*2008-10-11*", "-", "*") <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComTrimAll("   12  13  23  ");                      //결과 : "121323", 스페이스 문자 제거
     *     ret = ComTrimAll("*12*13*23*", "*");                      //결과 : "121323", "*" 문자 제거
     *     ret = ComTrimAll("*-/-abcd/가나다라*-/-", "*", "/", "-"); //결과 : "abcd가나다라", "*", "/", "-" 문자 제거
     *     ret = ComTrimAll("20081011-1234   ", "-", " ")            //결과 : "200810111234" "-"," " 문자 제거
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {string}        sChar    선택,제거할 문자열, default=" "
     * @param {string}        sChar2   선택,sChar와 같이 제거할 문자열로 원하는 만큼 설정할수 있다.
     * @return string, 모든 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see #ComLtrim
     * @see #ComRtrim
     * @see #ComTrim
     * @see #ComReplaceStr
     * @see String#trimAll
     */
    function ComTrimAll(obj, sChar) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            if (typeof(sVal)!="string") return "";

            if (sChar==undefined || sChar==null) {
                //제거할 문자 설정이 없는 경우 스페이스를 제거한다.
                return sVal.replace(/ /gi,"");
            } else {
                //제거할 문자가 여러개 인 경우 처리
                var args = ComTrimAll.arguments;

                for(var idx=1; idx<args.length; idx++) {
                    sVal =  ComReplaceStr(sVal, args[idx], "");
                }
                return sVal;
            }
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 문자열(sVal)에 포함된 특정문자열(sFind)을 다른문자열(sReplace)로 변경하여 문자열로 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComReplaceStr("2008-01-01", "-", "")        // 결과 : "20080101"
     *     ret = ComReplaceStr("123,567,890", ",", "")       // 결과 : "123567890"
     *     ret = ComReplaceStr("2008-*-01-*-01", "-*-", "")  // 결과 : "20080101"
     *     ret = ComReplaceStr("2008-*-01-*-01", "-*-", "*") // 결과 : "2008*01*01"
     * </pre>
     * @param {string,object} obj       필수,문자열 또는 HTML태그(Object)
     * @param {string}        sFind     필수,찾을 기준 문자열
     * @param {string}        sReplace  선택,변경할 문자열, default=""
     * @return String, 특정문자열(sFind)을 다른문자열(sReplace)로 변경한 결과 문자열
     * @see #ComTrimAll
     * @see String#replaceStr
     */
    function ComReplaceStr(obj, sFind, sReplace)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            if (typeof(sVal)!="string") return sVal;
            if (sVal.indexOf(sFind)==-1) return sVal;
            if (sReplace==undefined || sReplace==null) sReplace = "";

            //sFind문자열을 기준으로 배열로 나눈다.
            var stemp = sVal.split(sFind);
            //나눠진 배열을 sReplace문자열을 기준으로 합친다.
            return stemp.join(sReplace);
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 문자열에 특정 문자(chars)가 포함되었는지 여부를 확인한다. 특정 문자를 허용하지 않으려 할 때 사용한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     if (ccs_containsChars(form.txtName,"!,*&^%$#&#64;~;"))  alert("이름 필드에는 특수 문자를 사용할 수 없습니다.");
     *     ret = ComIsContainsChars("-1234.123", "-,.")     // 결과 : true
     *     ret = ComIsContainsChars("123,000", ".")         // 결과 : false
     *     ret = ComIsContainsChars(txtName, "!,*&%$#&#64;~; ") // 결과 : true, txtName="한진 해운"인 경우
     * </pre>
     * @param {string,object} obj       필수,문자열 또는 HTML태그(Object)
     * @param {string}        chars     필수,찾을 기준 문자열
     * @returns bool<br>
     *          true  - 특정 문자가 포함된 경우<br>
     *          false - 특정 문자가 포함되지 않은 경우
     * @see #ComIsContainsCharsOnly
     */
    function ComIsContainsChars(obj,chars) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            for (var inx = 0; inx < sVal.length; inx++) {
               if (chars.indexOf(sVal.charAt(inx)) != -1) {
                   return true;
               } // end if
            } // end for
            return false;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 문자열에 특정 문자(chars)만으로 되어있는지 여부를 확인한다. 특정 문자만을 허용하려 할때 사용한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     if (!ComIsContainsCharsOnly(form.txtBlood,"ABO")) { alert("혈액형 필드에는 A,B,O 문자만 사용할 수 있습니다.");}
     *     ret = ComIsContainsCharsOnly("2008-10-18", "1234567890-")    // 결과 : true
     *     ret = ComIsContainsCharsOnly("2008- 1-18", "1234567890-")    // 결과 : false
     *     ret = ComIsContainsCharsOnly("-100,000.12", "1234567890-,.") // 결과 : true
     *     ret = ComIsContainsCharsOnly(txtName, "한진해운") );         // 결과 : true, txtName="한진해운"인 경우
     * </pre>
     * @param {string,object} obj       필수,문자열 또는 HTML태그(Object)
     * @param {string}        chars     필수,찾을 기준 문자열
     * @returns bool<br>
     *          true  - 특정 문자만으로 구성된 경우<br>
     *          false - 특정 문자 이외의 문자가 포함된 경우
     * @see #ComIsContainsChars
     */
    function ComIsContainsCharsOnly(obj,chars) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            for (var inx = 0; inx < sVal.length; inx++) {
               if (chars.indexOf(sVal.charAt(inx)) == -1) {
                   return false;
               } // end if
            } // end for
            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 문자열에 한글이 포함된지 여부를 확인한다. 한글이 하나라도 있으면 true를 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsKorean("1234한글")  // 결과 : true
     *     ret = ComIsKorean("abcd한글")  // 결과 : true
     *     ret = ComIsKorean("1234abcd")  // 결과 : false
     *     ret = ComIsKorean(txtName)     // 결과 : true, txtName="한진해운"인 경우
     * </pre>
     * @param {string,object} obj       필수,문자열 또는 HTML태그(Object)
     * @returns bool<br>
     *          true-한글인 경우
     *          false-한글이 아닌 경우
     * @see #ComIsAlphabet
     */
    function ComIsKorean(obj)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);
            
            if (sVal=="") return false;
            
            var sBit = '';
            var iLen = 0;
            for(var i=0;i<sVal.length;i++) {
                sBit = sVal.charAt(i);
                if(escape( sBit ).length > 4) return true;
            }
            return false;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력값이 알파벳인지 여부를 확인한다. sFlag 인자는 다음과 같이 설정한다.<br>
     * sFlag="u" : 문자열이 모두 알파벳 대문자 인지 여부를 확인한다.<br>
     * sFlag="l" : 문자열이 모두 알파벳 소문자 인지 여부를 확인한다.<br>
     * sFlag="n" : 문자열이 알파벳과 숫자로만 구성된지 여부를 확인한다.<br>
     * sFlag=""  : 문자열이 모두 알파벳인지 여부를 확인한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsAlphabet("abcABC")       // 결과 : true
     *     ret = ComIsAlphabet("abcdef", "l")  // 결과 : true
     *     ret = ComIsAlphabet("ABCDEF", "u")  // 결과 : true
     *     ret = ComIsAlphabet("abc123", "n")  // 결과 : true
     *     ret = ComIsAlphabet("abc123")       // 결과 : false
     *     ret = ComIsAlphabet(txtName)        // 결과 : false, txtName="한진해운"인 경우
     * </pre>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @param {string}        sFlag 선택,결과선택인자, default=""
     * @returns bool<br>
     *          true-알파벳일 경우<br>
     *          false-알파벳이 아닐 경우
     * @see #ComIsKorean
     */
    function ComIsAlphabet(obj, sFlag) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            if (sVal=="") return false;

            var re;
            if (sFlag==undefined || sFlag==null) sFlag = "";
            switch (sFlag.toLowerCase())
            {
                case "u":   //only upper
                    re = /[^A-Z]/;
                    break;
                case "l":   //only lower
                    re = /[^a-z]/;
                    break;
                case "un":   //only upper
                	re = /[^A-Z|0-9|]/;
                	break;
                case "ln":   //only lower
                	re = /[^a-z|0-9|]/;
                	break;
                case "n":   //alpha number
                    re = /[^a-z|A-Z|0-9|]/;
                    break;
                default:    //alphabet
                    re = /[^a-z|A-Z]/;
                    break;
            }
            return !re.test(sVal)
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력된 문자열이 숫자와 이외의문자(sSubChar)로만 구성되었는지 여부를 확인한다. <br>
     * sSubChar는 예를 들어 다음과 같이 구성된다.<br>
     * sSubChar="-" : 숫자에서 부호 또는  날짜구분자<br>
     * sSubChar="," : 숫자에서 천단위 구분자<br>
     * sSubChar="." : 숫자에서 소숫점 구분자<br>
     * sSubChar="/" : 날짜구분자<br>
     * sSubChar="-.," : Money형태에서 사용되는 구분자 <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsNumber("1234")               // 결과 : true
     *     ret = ComIsNumber("-1234", "-")         // 결과 : true
     *     ret = ComIsNumber("2008-10-11", "-")    // 결과 : true
     *     ret = ComIsNumber("1,234", ",")         // 결과 : true
     *     ret = ComIsNumber("1234.11", ".")       // 결과 : true
     *     ret = ComIsNumber("2008/10/11", "/")    // 결과 : true
     *     ret = ComIsNumber("-1,234.11", "-.,")   // 결과 : true
     *     ret = ComIsNumber("-1,234.11")          // 결과 : false
     *     ret = ComIsNumber(txtTot)               // 결과 : false, txtTot="1234,999" 인 경우
     * </pre>
     * @param {string,object} obj      필수,문자열 또는 HTML태그(Object)
     * @param {string}        sSubChar 선택,숫자 이외에 가능한 문자, default=""
     * @returns bool<br>
     *          true-숫자와 이외의문자(sSubChar)로만 구성된 경우<br>
     *          false-허용된 문자 이외의 문자가 포함된 경우
     * @see #ComAddComma
     * @see #ComAddComma2
     * @see #ComIsMoneyNumber
     */
    function ComIsNumber(obj, sSubChar) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sValue = getArgValue(obj);

            if (sValue=="") return false;
            if (sSubChar==undefined || sSubChar==null) sSubChar = "";
            
            //숫자만 체크하는 경우
            if (sSubChar == "") return (/^[0-9]+$/).test(sValue);
            
            var chars = "0123456789";
            return ComIsContainsCharsOnly(obj,chars+sSubChar);

        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 입력된 문자열이 금액,퍼센트,정수,실수 등 숫자형값인지 여부를 확인하여 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ComIsMoneyNumber("")                             //결과 :  false
     *     ComIsMoneyNumber("1234.56")                      //결과 :  true
     *     ComIsMoneyNumber("1234.56", false)               //결과 :  false
     *     ComIsMoneyNumber("1,234.56")                     //결과 :  false
     *     ComIsMoneyNumber("1,234.56", true,true)          //결과 :  true
     *     ComIsMoneyNumber("-1234.56")                     //결과 :  true
     *     ComIsMoneyNumber("-1234.56", true, true, true)   //결과 :  true
     *     ComIsMoneyNumber("-1234.", true, true, true)     //결과 :  false
     *     ComIsMoneyNumber("2009-09-09", true, true, true) //결과 :  false
     *     ComIsMoneyNumber("-2009-09", true, true, true)   //결과 :  false
     *     ComIsMoneyNumber("2009.09.09", true, true, true) //결과 :  false
     *     ComIsMoneyNumber("2009,,0909", true, true, true) //결과 :  false
     * </pre>
     * @param {string,object} obj      필수,문자열 또는 HTML태그(Object)
     * @param {bool}          bPoint   선택,소숫점 포함 여부, default=true
     * @param {bool}          bComma   선택,천단위 구분자 포함 여부, default=false
     * @param {bool}          bSign    선택,부호 포함 여부, default=true
     * @returns bool<br>
     *          true-숫자형인 경우<br>
     *          false-숫자형이 아닌 경우
     * @see #ComIsNumber
     */
    function ComIsMoneyNumber(obj, bPoint, bComma, bSign) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sValue = getArgValue(obj);

            if (sValue=="") return false;

            if (bPoint==undefined || bPoint==null) bPoint = true;
            if (bComma==undefined || bComma==null) bComma = false;
            if (bSign==undefined  || bSign==null)  bSign = true;
            
            var sSubChar = "";
            
            //소숫점을 사용할수 있는데, 맨 앞에 있거나 맨마지막에 있거나  여러개 있으면 에러
            if (bPoint) {
            	if (isNaN(parseFloat(sValue))) return false; 
            	var arrVal = sValue.split(".");

            	switch (arrVal.length){
            		case 1: break;
            		case 2:
            			//소숫점윗자리에 부호 사용가능이면 부호를 일단 지우고 확인한다.
			            if (bSign && arrVal[0].charAt(0) == "-") arrVal[0] = arrVal[0].substr(1);
			            
		            	//소숫점 아랫자리 체크 - 소숫점 아랫자리는 소숫점,천단위구분,Sign이 있으면 안되고, 숫자만 있어야 함
		            	var decimalVal = arrVal[1].ltrim("0"); //0.02처럼 아랫자리는 0으로 시작할수 있으므로 trim하여 비교
		            	if (arrVal[1] == decimalVal || (arrVal[1] != decimalVal && decimalVal !="")) {
		            		if(!ComIsMoneyNumber(decimalVal, false, false, false)) return false;
		            	}
		            	break;
            		default :
            			return false;
            	}
            	
            	//소숫점 윗자리 체크
    			if (!ComIsMoneyNumber(arrVal[0], false, bComma, bSign)) return false;
    			
            	return true;
            } 
            
            //천단위 구분자을 사용할수 있는데, 맨 앞에 있거나 맨마지막에 있거나  연속2개 이상 있으면 에러
            if (bComma) {
                if (sValue.charAt(0) == "," || sValue.indexOf(",,") >= 0 || sValue.charAt(sValue.length-1) == ",") return false;
                sValue = sValue.trimAll(",");
            }

            //Sign을 사용할수 있는데, 맨 앞에 없거나 여러개 있으면 에러
            if (bSign)  {
                if (sValue.lastIndexOf ("-") > 0) return false;
                if (sValue == "-0") return false;
                sValue = sValue.trimAll("-");
            }
            
            //맨앞에 "0"으로 시작하는 숫자인 경우 에러 예)-0, 00, 01234, -01234
            if (sValue != "0" && sValue.ltrim("0") != sValue) return false;

            return sValue.isNumber();
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력값이 이메일을 구성할 수 있는 문자들로 구성되어 있는지 여부를 확인한다. <br>
     * 단순한 이메일 입력포맷을 확인한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsEmailAddr("khlee&#64;ibleaders.co.kr") // 결과 : true
     *     ret = ComIsEmailAddr("&#64;ibleaders.co.kr")      // 결과 : false
     *     ret = ComIsEmailAddr("khlee&#64;")                // 결과 : false
     *     ret = ComIsEmailAddr(txtEmail)                // 결과 : false,  txtEmail="한진해운"인 경우
     * </pre>

     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @returns bool<br>
     *          true-이메일 가능 문자로 구성된 경우<br>
     *          false-허용된 문자 이외의 문자가 포함된 경우
     */
    function ComIsEmailAddr(obj, delimiter, max) {
    	var varDelimi = /;|,/;
    	var varMax = 99999;
        if(delimiter != undefined)
                varDelimi = delimiter;    
        if(max != undefined)
                varMax = max;
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);
            
            //Modified to RFC-5322 format (2018.06.01)
            //var format =  /^\s*[\w\~\-\.\']+\@[\w\~\-]+(\.[\w\~\-]+)+\s*$/g;
            var format = /^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])+$/i;
            
            var emails = sVal.split(varDelimi).filter(function(x){return x;});
            if(emails.length>varMax){
            	return false;
            }
            for(var idx in emails) {
            	if(!format.test(emails[idx].trim())) return false;
            }
            
            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력값에 천단위 구분자(",")를 포함해서 값을 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComAddComma("1000")     // 결과 : "1,000"
     *     ret = ComAddComma("-1000")    // 결과 : "-1,000"
     *     ret = ComAddComma("-1,000.12")// 결과 : "-1,000.12"
     *     ret = ComAddComma(txtName)    // 결과 : "123,456,789", txtName="123456789"인 경우
     * </pre>
     * @param {string,number,object} obj 필수,문자열 또는 숫자형 또는 HTML태그(Object)
     * @return string,천단위 구분자가 포함된 문자열
     * @see #ComAddComma2
     * @see #ComGetMaskedValue
     */
    function ComAddComma(obj){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            sVal = String(sVal);
        	var arrVal = sVal.split(".");
        	//소숫점 이하 숫자는 천단위구분을 찍지 않는다.
        	switch (arrVal.length){
	    		case 1: 
	    			sVal = ComAddCommaRun(arrVal[0]);
	    			break;
	    		case 2:
	    			sVal = ComAddCommaRun(arrVal[0])+"."+arrVal[1];
	            	break;
	    		default :
	    			return false;
	    	}
        	return  sVal;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력값에 천단위 구분자(",")를 포함해서 값을 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComAddCommaRun("1000.10001")     // 결과 : "1,000.10,001"
     * </pre>
     * @param {string,number,object} obj 필수,문자열 또는 숫자형 또는 HTML태그(Object)
     * @return string,천단위 구분자가 포함된 문자열
     * @see #ComAddComma
     * @see #ComGetMaskedValue
     */
    function ComAddCommaRun(sVal){
        try {
            if (sVal==null || ComTrim(sVal)=='' || !ComIsNumber(sVal,"-,.")) return '';

            var re = /(-?\d+)(\d{3})/;
            while (re.test(sVal)) {
                sVal = sVal.replace(re, "$1,$2");
            }
            return  sVal;
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 문자열을 숫자포멧에 맞게 변경하여 리턴한다. 숫자포멧으로 설정할수 있는 값은 다음과 같다. <br>
     * sFormat="#,###"    : 천단위구분만 하는것으로 {@link #ComAddComma} 함수와 동일하다. <br>
     * sFormat="#,###.0"  : 천단위구분과 소숫점한자리를 표시한다. <br>
     * sFormat="#,###.00" : 천단위구분과 소숫점두자리를 표시한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComAddComma2("1000", "#,###")        //결과 : "1,000"
     *     ret = ComAddComma2("1000", "#,###.0")      //결과 : "1,000.0"
     *     ret = ComAddComma2("1000", "#,###.00")     //결과 : "1,000.00"
     *     ret = ComAddComma2("1000.1", "#,###")      //결과 : "1,000.1"
     *     ret = ComAddComma2("1000.1", "#,###.0")    //결과 : "1,000.1"
     *     ret = ComAddComma2("1000.1", "#,###.00")   //결과 : "1,000.1"
     *     ret = ComAddComma2("-1,000.12", "#,###.0") //결과 : "-1,000.12"
     * </pre>
     * @param {string,object}   obj      필수,숫자문자열 또는 HTML태그(Object)
     * @param {string}          sFormat  숫자 포멧
     * @returns string, 숫자포멧이 설정된 문자열<br>
     *          "":sVal인자의 값이 잘못된 경우 공백("")을 리턴한다.
     * @see #ComAddComma
     * @see #ComGetMaskedValue
     */
     function ComAddComma2(obj,sFormat)
     {
         try {
             //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
             var sVal = getArgValue(obj);

             switch(sFormat)
             {
                 case "#,###" :
                         return ComAddComma(sVal);
                 case "#,###.0" :
                         p = sVal.split(".");
                         p[0] = ComAddComma(p[0]);
                         if      (p.length == 1) return p[0]+".0";
                         else if (p.length == 2) return p[0]+"."+p[1];
                         else return "";
                 case "#,###.00" :
                         p = sVal.split(".");
                         p[0] = ComAddComma(p[0]);
                         if      (p.length == 1) return p[0]+".00";
                         else if (p.length == 2) {
                         	if(p[1].length == 1)
                         		return p[0]+"."+p[1]+"0";
                         	else
                         		return p[0]+"."+p[1];
                         }
                         else return "";
             }
         } catch(err) { ComFuncErrMsg(err.message); }
     }


    /**
     * 문자열을 10진수로 변환하여 리턴한다.
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @return number,문자열을 10진수로 변환한 값
     * @see String#parseInt
     */
    function ComParseInt(obj) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            return parseInt(sVal, 10);
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 입력된 문자열이 날짜 Format인지 여부를 확인한다. 문자열 내의 날짜구분자("/", "-", ".")는 제거되고 비교한다.<br>
     * sFlag 설정값을 다음과 같다.<br>
     * sFlag="ymd" : "yyyy-mm-dd"(년월일) 포멧인 경우<br>
     * sFlag="ym"  : "yyyy-mm"   (년월)   포멧인 경우<br>
     * sFlag="yw"  : "yyyy-ww"   (년주)   포멧인 경우<br>
     * sFlag=없음  : 기본적으로 설정하지 않으면 "년월일"로 인식한다. <br>
     * 년은 1900년 이상이어야 하고, 월은 1월~12월이어야 한다. 일은 1일~31일이어야하고, 주는 1주~53주 이어야 한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsDate("20081011")      // 결과 : true
     *     ret = ComIsDate("2008-10-11")    // 결과 : true
     *     ret = ComIsDate("2008/10/11")    // 결과 : true
     *     ret = ComIsDate("2008.10.11")    // 결과 : true
     *     ret = ComIsDate("2008- 1- 1")    // 결과 : false
     *     ret = ComIsDate("2008-11", "ym") // 결과 : true
     *     ret = ComIsDate("2008- 1", "ym") // 결과 : false
     *     ret = ComIsDate(txtDate)         // 결과 : true, txtDate="2010-08-20"인 경우
     * </pre>
     * @param {string,object} obj   필수,날짜 문자열 또는 HTML태그(Object)
     * @param {string}        sFlag 선택,날짜 포멧 구분, default="ymd"
     * @returns bool <br>
     *          true  : 날짜 포멧에 맞는 경우<br>
     *          false : 날짜 포멧에 맞지 않는 경우
     * @see #ComIsDay
     * @see #ComIsDay2
     * @see #ComIsMonth
     * @see #ComIsWeek
     * @see #ComGetNowInfo
     * @see #ComGetLastDay
     * @see #ComIsTime
     * @see #ComIsDateTime
     */
    function ComIsDate(obj, sFlag) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            //날짜구분자로 사용될수 있는는 "/", "-", "."를 제거되고 비교한다.
            sVal = sVal.replace(/\/|\-|\./g,"");

            if (!ComIsNumber(sVal)) return false;
            if (sFlag==undefined || sFlag==null) sFlag = "ymd";

            var year, month, day, week;

            switch(sFlag.toLowerCase()) {
                case "ym":  //년월
                    if (sVal.length != 6) return false;
                    year  = sVal.substring(0,4);
                    month = sVal.substring(4,6);
                    if ((ComParseInt(year)<1900)  || !ComIsMonth( month )) return false;
                    break;
                case "yw":  //년주
                    if (sVal.length != 6) return false;
                    year = sVal.substring(0,4);
                    week = sVal.substring(4,6);
                    if ((ComParseInt(year)<1900)  || !ComIsWeek(week)) return false;
                    break;
                case "yyyy":  //년
                    if (sVal.length != 4) return false;
                    year = sVal;  
                    if ((ComParseInt(year)<1900)) return false;
                    break;
                case "mdy":   //월일년
	                if (sVal.length != 8) return false;
	                month = sVal.substring(0,2);
	                day   = sVal.substring(2,4);
	                year  = sVal.substring(4,8);
	                if((ComParseInt(year) < 1900)  || !ComIsMonth( month ) || !ComIsDay( year,month ,day)) return false;
	                break;
                default:   //년월일
                    if (sVal.length != 8) return false;
                    year  = sVal.substring(0,4);
                    month = sVal.substring(4,6);
                    day   = sVal.substring(6,8);
                    if((ComParseInt(year) < 1900)  || !ComIsMonth( month ) || !ComIsDay( year,month ,day)) return false;
            } 

            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력된 문자열이 시간 Format인지 여부를 확인한다. 문자열 내의 시간구분자(":")는 제거되고 비교한다.<br>
     * sFlag 설정값을 다음과 같다.<br>
     * sFlag="hms" : "hh:mm:ss" 포멧인 경우<br>
     * sFlag="hm"  : "hh:mm" 포멧인 경우<br>
     * sFlag=없음  : 기본적으로 설정하지 않으면 "hms"로 인식한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsTime("231011")      // 결과 : true
     *     ret = ComIsTime("23:10:11")    // 결과 : true
     *     ret = ComIsTime("23:44:60")    // 결과 : false
     *     ret = ComIsTime("23:46", "hm") // 결과 : true
     *     ret = ComIsTime(txtTime)       // 결과 : true, txtTime="01:00:00"인 경우
     * </pre>
     * @param {string,object} obj   필수,시간 문자열 또는 HTML태그(Object)
     * @param {string}        sFlag 선택,시간 포멧 구분, default="hms"
     * @returns bool <br>
     *          true  : 시간 포멧에 맞는 경우<br>
     *          false : 시간 포멧에 맞지 않는 경우
     * @see #ComIsDate
     * @see #ComIsDateTime
     * @see #ComGetNowInfo
     */
    function ComIsTime(obj, sFlag) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            //시간구분자로 사용될수 있는 ":"를 제거되고 비교한다.
            sVal = ComReplaceStr(sVal, ":");

            if (!ComIsNumber(sVal)) return false;
            if (sFlag==undefined || sFlag==null) sFlag = "hms";

            var hh, mm, ss;

            switch(sFlag.toLowerCase()) {
                case "hm":  //시분
                    if (sVal.length != 4) return false;
                    ss  = 0;
                    break;
                default:   //시분
                    if (sVal.length != 6) return false;
                    ss = ComParseInt(sVal.substr(4,2));
            }
            hh = ComParseInt(sVal.substr(0,2));
            mm = ComParseInt(sVal.substr(2,2));

            if (hh <0 || hh > 23) return false;
            if (mm <0 || mm > 59) return false;
            if (ss <0 || ss > 59) return false;

            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력된 문자열이 날짜와 시간 합성Format인지 여부를 확인한다. <br>
     * sFlagDate 설정값을 다음과 같다.<br>
     * sFlagDate="ymd" : "yyyy-mm-dd" 포멧인 경우<br>
     * sFlagDate="ym"  : "yyyy-mm" 포멧인 경우<br>
     * sFlagDate=없음  : 기본적으로 설정하지 않으면 "ymd"로 인식한다. <br>
     * <br>
     * sFlagTime 설정값을 다음과 같다.<br>
     * sFlagTime="hms" : "hh:mm:ss" 포멧인 경우<br>
     * sFlagTime="hm"  : "hh:mm" 포멧인 경우<br>
     * sFlagTime=없음  : 기본적으로 설정하지 않으면 "hms"로 인식한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsDateTime("20081011 101010")             //결과 : true
     *     ret = ComIsDateTime("2008-10-11 10:10:10")         //결과 : true
     *     ret = ComIsDateTime("2008-10-11 55:10:10")         //결과 : false
     *     ret = ComIsDateTime("2008-10-32 10:10:10")         //결과 : false
     *     ret = ComIsDateTime("2008/10/11 10:10:10")         //결과 : true
     *     ret = ComIsDateTime("2008.10.11 10:10:10")         //결과 : true
     *     ret = ComIsDateTime("2008-10-11 15:10", "", "hm")  //결과 : true
     *     ret = ComIsDateTime("2008-11 10:10:10", "ym")      //결과 : false
     *     ret = ComIsDateTime("2008-11 10:10",    "ym", "hm")//결과 : false
     *     ret = ComIsDateTime("2008- 1 10:10",    "ym", "hm")//결과 : false
     *     ret = ComIsDateTime(frmMain.txtName)               //결과 : true  , frmMain.txtName=20090909 20:10:09"인 경우
     * </pre>
     * @param {string,object} obj       필수,날짜 문자열 또는 HTML태그(Object)
     * @param {string}        sFlagDate 선택,날짜 포멧 구분, default="ymd"
     * @param {string}        sFlagTime 선택,시간 포멧 구분, default="hms"
     * @returns bool <br>
     *          true  : 날짜시간 포멧에 맞는 경우<br>
     *          false : 날짜시간 포멧에 맞지 않는 경우
     * @see #ComIsDate
     * @see #ComIsTime
     */
    function ComIsDateTime(obj, sFlagDate, sFlagTime) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            sVal = ComTrim(sVal);
            if (sFlagDate==undefined || sFlagDate==null) sFlagDate = "ymd";
            if (sFlagTime==undefined || sFlagTime==null) sFlagTime = "hms";

			if (sVal.indexOf(" ")>=0) {
	            //날짜와 시간으로 분리하기
	            var aryDateTime = sVal.split(" ");
	            if (aryDateTime.length != 2) return false;
	        } else {
	        	//공백 구분자로 날짜와 시간이 분리되지 않았다면 마스크구분자 없이 "yyyymmddhhmmss"형태라고 인식하여 다음을 처리한다.
	        	var iLen1 = (sFlagDate=="ymd")?8:6;
	        	var iLen2 = (sFlagTime=="hms")?6:4;
	        	if (sVal.length<iLen1+iLen2) return false;
	        	
	        	var aryDateTime = new Array(2);
	        	aryDateTime[0] = sVal.substr(0, iLen1);
	        	aryDateTime[1] = sVal.substr(iLen1, iLen2);	        	
	        }

            if(!ComIsDate(aryDateTime[0], sFlagDate) || !ComIsTime(aryDateTime[1], sFlagTime)) return false;

            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

     /**
      * 입력된 문자열이 ymdhms, ymdhm 포멧의 경우 정상 Format인지 여부를 확인한다. <br>
      * <br><b>Example :</b>
      * <pre>
      *     ret = ComIsDateTime2("20081011 101010", )          //결과 : true
      *     ret = ComIsDateTime2("2008-10-41 10:10:10")        //결과 : false
      *     ret = ComIsDateTime2("2008-10-11 15:10", "ymdhm")  //결과 : true
      * </pre>
      * @param {string,object} obj       필수,날짜 문자열 또는 HTML태그(Object)
      * @param {string}        sFormat   선택,날짜 포멧 구분, default="ymdhms"
       * @returns bool <br>
      *          true  : 날짜시간 포멧에 맞는 경우<br>
      *          false : 날짜시간 포멧에 맞지 않는 경우
      * @see #ComIsDate
      * @see #ComIsTime
      */
     function ComIsDateTime2(obj,sFormat) {
         if (sFormat==undefined || sFormat==null) sFormat = "ymdhms";
         //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
         var sText = getArgValue(obj);
         sText = ComTrimAll(sText, "-", ":", " ");
         year  = sText.substring(0,4);
         month = sText.substring(4,6);
         day   = sText.substring(6,8);
         if(!ComIsDay( year,month ,day)) return false;
         var reDate = null;
         if(sFormat == "ymdhms" && sText.length == 14)
        	 reDate = /(?:19|20\d{2})(?:0[1-9]|1[0-2])(?:0[1-9]|[12][0-9]|3[01])(?:0[0-9]|1[0-9]|2[0-4])(?:[0-5]\d{1})(?:[0-5]\d{1})/;
         else if(sFormat == "ymdhm" && sText.length == 12)
        	 reDate = /(?:19|20\d{2})(?:0[1-9]|1[0-2])(?:0[1-9]|[12][0-9]|3[01])(?:0[0-9]|1[0-9]|2[0-4])(?:[0-5]\d{1})/;
         else return false;
         return reDate.test(sText);
     }

    /**
     * 두 날짜 사이의 기간이 유효한지 체크한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComChkPeriod("20080909", "20080908") // 결과 = 0
     *     ret = ComChkPeriod("20080909", "20080909") // 결과 = 2
     *     ret = ComChkPeriod("20080909", "20080910") // 결과 = 1
     *     ret = ComChkPeriod("20080909", "2008")     // 결과 = -1
     *     if(ComChkPeriod("20080911", "20080910") < 1) alert("기간이 정확하지 않습니다.")
     * </pre>
     * @param {string,object} fromDate   필수,시작일자 문자열 또는 HTML태그(Object)
     * @param {string,object} toDate     필수,종료일자 문자열 또는 HTML태그(Object)
     * @returns number <br>
     *            -1 : 인자가 올바르지 않아 에러 발생<br>
     *            0  : fromDate > toDate<br>
     *            1  : fromDate < toDate<br>
     *            2  : fromDate = toDate<br>
     */
     function ComChkPeriod(fromDate, toDate){
        try {
            //인자가 문자열 또는 HTML태그(Object)인 경우 처리
            fromDate = getArgValue(fromDate);
            toDate   = getArgValue(toDate);
            
            var iDays = ComGetDaysBetween(fromDate, toDate);
            if (isNaN(iDays))   return -1;
            else if (iDays==0)  return 2;
            else if (iDays<0)   return 0;

            return 1;
        } catch(err) { ComFuncErrMsg(err.message); }
     }


    /**
     * 입력된 문자열이 월로 가능한지 확인한다. 월의 범위는 1월~12월까지 가능하다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsMonth("01") //결과 : true
     *     ret = ComIsMonth(11)   //결과 : true
     *     ret = ComIsMonth("gg") //결과 : false
     * </pre>
     * @param {string,object} sMonth   필수,월문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : 월로 사용 가능한 경우<br>
     *          false : 월로 사용 불가능한 경우
     * @see #ComIsDate
     * @see #ComIsDay
     * @see #ComIsDay2
     */
    function ComIsMonth(sMonth) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sMonth = getArgValue(sMonth);

            if (sMonth.length > 2) return false;
            month = ComParseInt(sMonth);
            return ((month > 0) && (month <= 12))
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 년,월,일을 인자로 받아 해당 "일"이 일로 가능한지 확인한다. 일의 범위는 년월에 따라 다르지만 대략 1일~31일까지 가능하다.<br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsDay("2008", "11", "30")  //결과 : true
     *     ret = ComIsDay("2008", "11", "31")  //결과 : false
     *     ret = ComIsDay("year", "mon", "31") //결과 : false
     * </pre>
     * @param {string} sYear   필수,년 문자열
     * @param {string} sMonth  필수,월 문자열
     * @param {string} sDay    필수,일 문자열
     * @returns bool <br>
     *          true  : 일로 사용 가능한 경우<br>
     *          false : 일로 사용 불가능한 경우
     * @see #ComIsDate
     * @see #ComIsMonth
     * @see #ComIsDay2
     * @see #ComGetLastDay
     */
    function ComIsDay(sYear, sMonth, sDay) {
        try {
            if (sDay.length > 2) return false;
            year  = ComParseInt(sYear);
            month = ComParseInt(sMonth);
            day   = ComParseInt(sDay);
            return ((day > 0) && (day <= ComGetLastDay(year, month)));
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 년,월,일에 관계없이 인자로받은 일자가 일로 가능한지 여부를 확인한다. 일의 범위는 1일~31일까지 가능하다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsDay2(31)   //결과 : true
     *     ret = ComIsDay2(1)    //결과 : true
     *     ret = ComIsDay2("01") //결과 : true
     *     ret = ComIsDay2("가") //결과 : false
     * </pre>
     * @param {string,object} sDay   필수,일문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : 일로 사용 가능한 경우<br>
     *          false : 일로 사용 불가능한 경우
     * @see #ComIsDate
     * @see #ComIsMonth
     * @see #ComIsDay
     * @see #ComGetLastDay
     */
    function ComIsDay2(sDay) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sDay = getArgValue(sDay);

            if (sDay.length > 2) return false;
            day = ComParseInt(sDay);
            return ((day > 0) && (day < 32));
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 입력된 문자열이 주(Week)로 가능한지 확인한다. Week의 범위는 1주~53주까지 가능하다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsWeek("01") //결과 : true
     *     ret = ComIsWeek(11)   //결과 : true
     *     ret = ComIsWeek("54") //결과 : false
     * </pre>
     * @param {string,object} sWeek   필수,Week 문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : Week로 사용 가능한 경우<br>
     *          false : Week로 사용 불가능한 경우
     * @see #ComIsDate
     * @see #ComIsDay
     * @see #ComIsDay2
     */
    function ComIsWeek(sWeek) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sWeek = getArgValue(sWeek);

            if (sWeek.length > 2) return false;
            week = ComParseInt(sWeek);
            return ((week >= 0) && (week < 54))
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 년,월을 인자로 받아 해당 년월의 마지막 일자를 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetLastDay(2008, 2)  //결과 : 29
     *     ret = ComGetLastDay(2008, 11) //결과 : 30
     *     ret = ComGetLastDay(2008, 12) //결과 : 31
     *     ret = ComGetLastDay(2008, 13) //결과 : 0
     * </pre>

     * @param {number} iYear   년
     * @param {number} iMonth  월
     * @returns number, 해당 년,월의 마지막 일자<br>
     *          0 : 인자값 월이 1월~12월 사이가 아닌 경우
     * @see #ComIsDay
     * @see #ComIsDay2
     */
    function ComGetLastDay(iYear, iMonth) {
        try {
            if (!ComIsMonth(iMonth)) return 0;

            switch(iMonth){
                case 2:
                    if ((iYear%4==0) && ((iYear/4)%200!=0))   return 29;
                    else    return 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 두 날짜 사이의 일수를 반환한다. 일수는 sToDate - sFromDate로 계산되며, 둘중 하나라도 날짜포멧이 아닌 경우 결과는 "NaN"으로 리턴된다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetDaysBetween("2008-10-11", "2008-10-11") //결과 : 0
     *     ret = ComGetDaysBetween("2008-10-11", "2008-10-01") //결과 : -10
     *     ret = ComGetDaysBetween("2008-10-11", "2008-11-11") //결과 : 31
     *     ret = ComGetDaysBetween("날짜아님", "2008-10-11")   //결과 : NaN
     *     ret = ComGetDaysBetween(txtDate, "2008-10-11")      //결과 : 366, txtDate="2007-10-11"인 경우
     * </pre>
     * @param {string,object} sFromDate   필수,시작일자 문자열 또는 HTML태그(Object)
     * @param {string,object} sToDate     필수,종료일자 문자열 또는 HTML태그(Object)
     * @returns number,두 날짜 사이의 일수<br>
     *          NaN : 두 인자 중 날짜가 아닌것이 하나라도 있어서 연산이 불가능한 경우
     * @see #ComGetDaysToToday
     */
    function ComGetDaysBetween(sFromDate, sToDate) {
        try {
            //문자열 또는 HTML태그(Object)인 경우 처리
            var sFromDate = getArgValue(sFromDate);
            var sToDate   = getArgValue(sToDate);
            
            //if(sFromDate.length != sToDate.length) return NaN;	//khlee:길이 비교하지 않도록 변경함

            var iFromTime = getDateObj(sFromDate);
            var iToTime   = getDateObj(sToDate);
			
    		//return Math.floor( (iToTime - iFromTime) / (60*60*24*1000) );
            return Math.round( (iToTime - iFromTime) / (60*60*24*1000) );
    		
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * PC에 설정된 오늘날짜와 인자값의 날짜 사이의 일수를 리턴한다. 인자값의 날짜가 오늘 이후의 일자에 대해서는 음수값을 반환한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetDaysToToday("2008-10-11") //결과 : 30 , 오늘날짜 : 2008-11-10
     *     ret = ComGetDaysToToday("2008-11-20") //결과 : -10, 오늘날짜 : 2008-11-10
     *     ret = ComGetDaysToToday("날짜아님")   //결과 : NaN, 오늘날짜 : 2008-11-10
     *     ret = ComGetDaysToToday(txtDate)      //결과 : 0  , 오늘날짜 : 2008-11-10, txtDate="20081110"인 경우
     * </pre>
     * @param {string,object} obj   필수,기준일자 문자열 또는 HTML태그(Object)
     * @returns number, PC에 설정된 오늘날짜와 인자값의 날짜 사이의 일수<br>
     *          NaN : 인자가 날짜가 아니여서 연산이 불가능한 경우
     * @see #ComGetDaysBetween
     * @see #ComGetNowInfo
     */
    function ComGetDaysToToday(obj) {
        try {
            //문자열 또는 HTML태그(Object)인 경우 처리
            var sFromDate = getArgValue(obj);

            var iFromTime = getDateObj(sFromDate);
            var iToTime   = new Date();

            return Math.floor( (iToTime - iFromTime) / (60*60*24*1000) );
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 해당날짜에서 년수 또는 월수 또는 일수의 숫자만큼 더하여 날짜를 계산하여 문자열로 리턴한다. <br>
     * sFlag 인자는 다음과 같이 설정한다. <br>
     * sFlag="Y" : 년도 연산<br>
     * sFlag="M" : 월 연산<br>
     * sFlag="D" : 일 연산<br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetDateAdd(null, "D", -6)                //결과 : "2008-11-04", 오늘날짜 : 2008-11-10
     *     ret = ComGetDateAdd(null, "M", -6)                //결과 : "2008-05-10", 오늘날짜 : 2008-11-10
     *     ret = ComGetDateAdd(null, "Y", -6)                //결과 : "2002-11-10", 오늘날짜 : 2008-11-10
     *     ret = ComGetDateAdd("날짜아님", "Y", -6)          //결과 : "" , 오늘날짜 : 2008-11-10
     *     ret = ComGetDateAdd("2008-01-01", "D", 365, "")   //결과 : "20081231"
     * </pre>
     * @param {string} sDate   선택,기준 날짜 문자열; null이면 PC의 현재날짜 기준으로 계산된다. default=null(PC의 현재날짜)
     * @param {string} sFlag   필수,연산할 구분자로 "Y","M","D" 중 택1
     * @param {number} iVal    필수,연산할 값
     * @param {string} sDelim  선택,결과에 사용할 날짜구분자, default="-"
     * @param {bool}   isFull  1900년대경우 4자리 년도 사용여부, default=true
     * @return string, 날짜 문자열
     */
     function ComGetDateAdd(sDate, sFlag, iVal, sDelim, isFull){
         try {
             if (sDelim==null || sDelim==undefined) sDelim = "-";
             if (isFull==null || isFull==undefined) isFull = true;

             if (sDate==null || sDate==undefined) {
                 sDate = new Date();
             } else {
                 //문자열 또는 HTML태그(Object)인 경우 처리
                 sDate = getArgValue(sDate);

                 sDate = getDateObj(sDate);
                 if(isNaN(sDate.getYear())) return "";
             }

             var yy = null;
             if(isFull)
             	yy = sDate.getFullYear();
             else
             	yy = sDate.getYear();
             var mm = sDate.getMonth();
             var dd = sDate.getDate();
             iVal = ComParseInt(iVal);	//인자가 문자열로 들어온 경우 에러 발생함

             switch(sFlag.toLowerCase()) {
                 case "y":   yy += iVal;    break;
                 case "m":   mm += iVal;    break;
                 case "d":   dd += iVal;    break;
             }

             date = new Date(yy,mm,dd);
             if(isFull)
             	yy = date.getFullYear();
             else
             	yy = date.getYear();
             mm = date.getMonth() + 1;
             dd = date.getDate();

             return yy + sDelim + ComLpad(mm,2,"0") + sDelim + ComLpad(dd,2,"0");
         } catch(err) { ComFuncErrMsg(err.message); }
     }

     
    /**
     * 인자로 받은 문자열(sVal)의 총길이가 두번째 인자 iLen만큼 되도록 오른쪽 빈자리에 padStr를 붙여서 문자열로 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComRpad("1",   2, "0") //결과 : "10"
     *     ret = ComRpad("123", 5, "0") //결과 : "12300"
     * </pre>
     * @param {string,object} obj       필수,문자열 또는 HTML태그(Object)
     * @param {number}        iLen      필수,리턴할 총 문자열 길이
     * @param {string}        padStr    필수,붙일 문자열
     * @return string
     * @see #ComLpad
     * @see String#rpad
     */
    function ComRpad(obj, iLen, padStr){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            var retStr = "";
            var padCnt = Number(iLen) - String(sVal).length;
            if (ComIsNumber(padCnt) && padCnt>0) retStr = new Array(padCnt+1).join(padStr);
            return sVal+retStr;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 인자로 받은 문자열(sVal)의 총길이가 두번째 인자 iLen만큼 되도록 왼쪽 빈자리에 padStr를 붙여서 문자열로 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComLpad("1",   2, "0") //결과 : "01"
     *     ret = ComLpad("123", 5, "0") //결과 : "00123"
     * </pre>
     * @param {string,object} obj      필수,문자열 또는 HTML태그(Object)
     * @param {number}        iLen     필수,리턴할 총 문자열 길이
     * @param {string}        padStr   필수,붙일 문자열
     * @return string
     * @see #ComRpad
     * @see String#lpad
     */
    function ComLpad(obj, iLen, padStr){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            var retStr = "";
            var padCnt = Number(iLen) - String(sVal).length;
            if (ComIsNumber(padCnt) && padCnt>0) retStr = new Array(padCnt+1).join(padStr);
            return retStr+sVal;
        } catch(err) { ComFuncErrMsg(err.message); }
    }



    /**
     * 문자열이 올바른 주민등록번호인지 여부를 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsJuminNo("770101-1234561")  //결과 : false
     *     ret = ComIsJuminNo("770101-1234562")  //결과 : true
     * </pre>
     * @param {string,object} obj   필수,주민등록번호 문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : 주민등록번호가 올바른 경우<br>
     *          false : 주민등록번호가 잘못된 경우<br>
     * @see #ComIsSaupjaNo
     */
    function ComIsJuminNo(obj) {
        try {
            //문자열 또는 HTML태그(Object)인 경우 처리
            var sResNo = getArgValue(obj);

            sResNo = ComTrimAll(sResNo, "-", " ");

            if(sResNo.length != 13 || !ComIsNumber(sResNo)) return false;

            var a = new Array(6)
            var b = new Array(7)
            var tot=0
            var c=0

            var sJumin0 = sResNo.substr(0,6);
            var sJumin1 = sResNo.substr(6);

            if (!ComIsDate("19" + sJumin0)) return false;

            for(var i=1;i<7;i++)
            {
                a[i]=sJumin0.charAt(i-1);
                b[i]=sJumin1.charAt(i-1);

                if(i<3)
                    c=Number(b[i])*(i+7);
                else
                    c=Number(b[i])*((i+9)%10);

                tot = tot + Number(a[i])*(i+1) + c;
            } // end for

            b[7]=sJumin1.substring(6,7);

            if(Number(b[7]) != ((11-(tot%11))%10)) return false;
            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }




    /**
     * 문자열이 올바른 사업자등록번호인지 여부를 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComIsSaupjaNo("123-45-67891")    //결과 : true
     *     ret = ComIsSaupjaNo("123-45-67892")    //결과 : false
     * </pre>
     * @param {string,object} obj   필수,주민등록번호 문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : 사업자등록번호가 올바른 경우<br>
     *          false : 사업자등록번호가 잘못된 경우<br>
     * @see #ComIsJuminNo
     */
    function ComIsSaupjaNo(obj)
    {
        try {
            //문자열 또는 HTML태그(Object)인 경우 처리
            var sCorpNo = getArgValue(obj);

            sCorpNo = ComTrimAll(sCorpNo, "-", " ");

            if(sCorpNo.length != 10 || !ComIsNumber(sCorpNo)) return false;

            var chkRule = "137137135";
            var step1, step2, step3, step4, step5, step6, step7;

            step1 = 0;

            for (var i=0; i<7; i++){
                step1 = step1 + (sCorpNo.charAt(i) * chkRule.charAt(i));
            } // end for

            step2 = step1 % 10;
            step3 = (sCorpNo.charAt(7) * chkRule.charAt(7)) % 10;
            step4 = sCorpNo.charAt(8) * chkRule.charAt(8);
            step5 = Math.round(step4 / 10 - 0.5);
            step6 = step4 - (step5 * 10);
            step7 = (10 - ((step2 + step3 + step5 + step6) % 10)) % 10;

            if (sCorpNo.charAt(9) != step7) return false;

            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * PC에 설정된 오늘 날짜와 현재 시간에서 sFormat 설정에 따라 원하는 정보를 확인한다. <br>
     * sFormat 인자는 다음과 같이 설정한다.<br>
     * sFormat="yy"  : PC에 설정된 오늘 날짜의 "년도"를 확인한다.<br>
     * sFormat="mm"  : PC에 설정된 오늘 날짜의 "월"를 확인한다.<br>
     * sFormat="dd"  : PC에 설정된 오늘 날짜의 "일"를 확인한다.<br>
     * sFormat="hh"  : PC에 설정된 현재 시간의 "시"를 확인한다.<br>
     * sFormat="mi"  : PC에 설정된 현재 시간의 "분"를 확인한다.<br>
     * sFormat="ss"  : PC에 설정된 현재 시간의 "초"를 확인한다.<br>
     * sFormat="ymd" : PC에 설정된 오늘 날짜를 "yyyy-mm-dd"형태로 확인한다. 날짜구분자는 sDelim인자 참고<br>
     * sFormat="ym"  : PC에 설정된 오늘 날짜를 "yyyy-mm"형태로 확인한다. 날짜구분자는 sDelim인자 참고<br>
     * sFormat="hms" : PC에 설정된 현재 시간을 "hh:mm:ss"형태로 확인한다. 시간구분자는 sDelim인자 참고<br>
     * sFormat="hm"  : PC에 설정된 현재 시간을 "hh:mm"형태로 확인한다. 시간구분자는 sDelim인자 참고<br>
     * sFormat=그외  : ""을 리턴한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComGetNowInfo()           //결과 : 2008-11-10
     *     ret = ComGetNowInfo("yy" )      //결과 : 2008
     *     ret = ComGetNowInfo("mm" )      //결과 : 11
     *     ret = ComGetNowInfo("dd" )      //결과 : 10
     *     ret = ComGetNowInfo("hh" )      //결과 : 19
     *     ret = ComGetNowInfo("mi" )      //결과 : 15
     *     ret = ComGetNowInfo("ss" )      //결과 : 31
     *     ret = ComGetNowInfo("ymd")      //결과 : 2008-11-10
     *     ret = ComGetNowInfo("ym" )      //결과 : 2008-11
     *     ret = ComGetNowInfo("hms")      //결과 : 19:15:31
     *     ret = ComGetNowInfo("hm" )      //결과 : 19:15
     *     ret = ComGetNowInfo("ymd", "/") //결과 : 2008/11/10
     * </pre>
     * @param {string} sFormat  선택, 결과선택인자, default="ymd"
     * @param {string} sDelim   선택, 날짜구분자(default="-") 또는 시간구분자(default=":"), default=sFormat 인자값에따라 자동 설정
     * @return  string,PC에 설정된 오늘 날짜 또는 현재 시간
     * @see #ComIsDate
     * @see #ComIsTime
     * @see #ComGetDaysToToday
     */
    function ComGetNowInfo(sFormat, sDelim)
    {
        try {
            var sToday    = new Date();
            var result;
            if (sFormat==undefined || sFormat==null || sFormat=="") sFormat = "ymd";
            switch(sFormat.toLowerCase()){
                case "yy":
                    result = sToday.getFullYear();  break;
                case "mm":
                    result = sToday.getMonth()+1;   break;
                case "dd":
                    result = sToday.getDate();      break;
                case "hh":
                    result = sToday.getHours();     break;
                case "mi":
                    result = sToday.getMinutes();   break;
                case "ss":
                    result = sToday.getSeconds();   break;
                case "ymd":
                    sDelim = getFormatDelim(sFormat, sDelim);
                    year    = sToday.getFullYear();
                    month   = sToday.getMonth()+1;
                    day     = sToday.getDate();
                    result  =  year + sDelim + ComLpad(month,2,"0") + sDelim + ComLpad(day,2,"0");
                    break;
                case "ym":
                    sDelim = getFormatDelim(sFormat, sDelim);
                    year    = sToday.getFullYear();
                    month   = sToday.getMonth()+1;
                    result  =  year + sDelim + ComLpad(month,2,"0");
                    break;
                case "hms":
                    sDelim = getFormatDelim(sFormat, sDelim);
                    h   = sToday.getHours();
                    m   = sToday.getMinutes();
                    s   = sToday.getSeconds()
                    result  =  ComLpad(h,2,"0") + sDelim + ComLpad(m,2,"0") + sDelim + ComLpad(s,2,"0");
                    break;
                case "hm":
                    sDelim = getFormatDelim(sFormat, sDelim);
                    h   = sToday.getHours();
                    m   = sToday.getMinutes();
                    result  =  ComLpad(h,2,"0") + sDelim + ComLpad(m,2,"0");
                    break;
                case "mdy":
                    sDelim = getFormatDelim(sFormat, sDelim);
                    year    = sToday.getFullYear();
                    month   = sToday.getMonth()+1;
                    day     = sToday.getDate();
                    result  =  ComLpad(month,2,"0") + sDelim + ComLpad(day,2,"0")  + sDelim +  year;
                    break;
                default :
                    result = "";
            }
            return result.toString();
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 만으로된 나이를 계산하여 리턴한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComFullAges("1977-11-11") //결과 : 30, 현재날짜="2008-11-10"인 경우
     *     ret = ComFullAges("1977-11-10") //결과 : 31, 현재날짜="2008-11-10"인 경우
     * </pre>
     * @param {string,object} obj   필수,년월일 형태의 생년월일 문자열 또는 HTML태그(Object)
     * @return  number, 만나이
     */
    function ComFullAges(obj)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sDate = getArgValue(obj);

            var sDate = sDate.replace(/\/|\-|\./g,"");  //날짜구분자 없애기
            if (!ComIsDate(sDate)) return;

            yy1 = ComParseInt(sDate.substr(0,4));
            mm1 = ComParseInt(sDate.substr(4,2));
            dd1 = ComParseInt(sDate.substr(6,2));

            yy2 = ComParseInt(ComGetNowInfo("yy"));
            mm2 = ComParseInt(ComGetNowInfo("mm"));
            dd2 = ComParseInt(ComGetNowInfo("dd"));

            yourage = yy2 - yy1;
            if (mm2 < mm1 || (mm2 == mm1 && dd2 < dd1)) yourage--;

            return yourage;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 자바스크립트 배열변수의 각 Item을 특정글자(sDelim)로 Join하여 하나의 문자열로 리턴한다. <br>
     * 예를 들어 param[0]="01", param[1]="02", param[2]="02", param[3]="03"이고, Join 구분자(sDelim)가 "|"인 경우 "01|02|03|04" 문자열을 리턴한다. <br>
     * 인자로 받은 배열변수가 배열이 아니거나 null인 경우 공백("")을 리턴한다.<br>
     * <br><b>Example : </b>
     * <pre>
     *     param[0] = "txtName=한진&rdoCity=02"  //예제를 위한 배열
     *     param[1] = "sltCity=03&chkYn=Y"
     *     ret=ComGetAryJoin(param, "&")        //결과 : "txtName=한진&rdoCity=02&sltCity=03&chkYn=Y"
     * </pre>
     * @param {string} aryData  필수,자바스크립트 배열변수
     * @param {string} sDelim   필수,연결 구분자
     * @returns string,배열변수의 각 Item을 특정글자(sDelim)로 Join한 문자열<br>
     *          "",인자로 받은 배열변수가 배열이 아닌 경우
     */
    function ComGetAryJoin(aryData, sDelim){
        try {
            if (aryData.constructor==Array) {
                return  aryData.join(sDelim);
            } else {
                return  "";
            }
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 특정값을 특정 소숫점 자리만큼 반올림한 값을 리턴한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComRound( 1234.5555 ) //결과 : 1234.56
     *     ret = ComRound( 1234.12, 1) //결과 : 1234.1
     *     ret = ComRound( 1234.15, 1) //결과 : 1234.2
     *     ret = ComRound(-1234.15, 1) //결과 : -1234.1
     * </pre>
     * @param {number,object} obj   필수,대상 숫자값 또는 HTML태그(Object)
     * @param {number}        pos   선택,소숫점 아랫자리 개수, default=2
     * @returns number,대상 숫자를 소숫점 자리만큼 반올림한 수
     */
    function ComRound(obj, pos) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var num = getArgValue(obj);

            if (pos==undefined || pos==null ) pos = 2;

            var posV = Math.pow(10, pos)
            return Math.round(num*posV)/posV
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 숫자값의 소수점 n이하 절사하고 리턴한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComTrunc( 1234.5555 ) //결과 : 1234.55
     *     ret = ComTrunc( 1234.12, 1) //결과 : 1234.1
     *     ret = ComTrunc( 1234.15, 1) //결과 : 1234.1
     *     ret = ComTrunc(-1234.15, 1) //결과 : -1234.1
     * </pre>
     * @param {number,object} obj   필수,대상 숫자값 또는 HTML태그(Object)
     * @param {number}        pos   선택,소숫점 아랫자리 개수, default=2
     * @returns number
     */
    function ComTrunc(obj, pos) {
        try {
        	if(obj == null) return;
            var num = getArgValue(obj); 
            if (pos==undefined || pos==null ) pos = 2; 
            num = num * 1; 
            pos = pos * 1; 
            var num = num.toString().match(eval("/^.*\\.\\d{"+pos+"}/"))|| num ;
            if (pos  == 0)
            	num =  parseInt(num);
            else
            	num = parseFloat(num);
            return num; 
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 숫자값의 소수점 이하 자리수를 리턴한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComPointCountLength(3.55); //결과: 2
     *     ret = ComPointCountLength("3.55"); //결과: 2
     *     ret = ComPointCountLength(-3.55); //결과: 2
     *     ret = ComPointCountLength("-3.55"); //결과: 2
     * </pre>
     * @param {number} float 또는 String으로 표현된 float 값, 필수
     * @returns number
     */
    function ComPointCountLength(num){
    	var num = getArgValue(num);
    	var pointCount =0;
    	num = num.toString();
    	if(num.indexOf(".") != -1){
    		returnValue = num.split(".");
    		pointCount =returnValue[1].length;
    	}else{
    		pointCount = null;
    	}
    	return pointCount;
    }
    
    /**
     * 인자값이 Validation에 맞는 값인지 확인하고, 포멧에 맞게 구분자를 포함한 문자열을 반환한다. <br>
     * Validation에 맞지 않는 경우 함수의 결과는 ""을 리턴한다. <br>
     * sFormat 인자값은 다음 중 선택하여 설정한다. <br>
     * sFormat="ymd"    : 년월일 형태인 "yyyy-mm-dd" 포멧인 경우<br>
     * sFormat="ym"     : 년월   형태인 "yyyy-mm" 포멧인 경우<br>
     * sFormat="yw"     : 년주   형태인 "yyyy-ww" 포멧인 경우<br>
     * sFormat="hms"    : 시분초 형태인 "hh:mm:ss" 포멧인 경우<br>
     * sFormat="hm"     : 시분   형태인 "hh:mm" 포멧인 경우<br>
     * sFormat="int"    : 정수   형태인 "#,###" 포멧인 경우, {@link #ComAddComma} 함수와 동일하다<br>
     * sFormat="float"  : 실수   형태인 "#,###.##" 포멧인 경우, {@link #ComAddComma} 함수와 동일하다<br>
     * sFormat="jumin"  : 주민등록번호   형태인 "######-#######" 포멧인 경우<br>
     * sFormat="saupja" : 사업자등록번호 형태인 "###-##-#####" 포멧인 경우<br>
     * sFormat="han"    : 한글+숫자 입력 가능<br>
     * sFormat="eng"    : 영문+숫자 입력 가능<br>
     * sFormat="engup"  : 영문대문자<br>
     * sFormat="engdn"  : 영문소문자<br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetMaskedValue("20080909", "ymd")         //결과 : "2008-09-09"
     *     ret = ComGetMaskedValue("200809",   "ym")          //결과 : "2008-09"
     *     ret = ComGetMaskedValue("201059",   "hms")         //결과 : "20:10:59"
     *     ret = ComGetMaskedValue("2010",     "hm")          //결과 : "20:10"
     *     ret = ComGetMaskedValue("12345678", "int")         //결과 : "12,345,678"
     *     ret = ComGetMaskedValue("123456.78", "float")      //결과 : "123,456.78"
     *     ret = ComGetMaskedValue("7701011234561", "jumin")  //결과 : "", 주민등록번호가 올바르지 않아서 ""을 리턴했음
     *     ret = ComGetMaskedValue("7701011234562", "jumin")  //결과 : "770101-1234562"
     *     ret = ComGetMaskedValue("1234567891",    "saupja") //결과 : "123-45-67891"
     *     ret = ComGetMaskedValue("가나다라", "han")         //결과 : "가나다라"
     *     ret = ComGetMaskedValue("abcd", "eng")             //결과 : "abcd"
     *     ret = ComGetMaskedValue("abcd", "engup")           //결과 : "ABCD"
     *     ret = ComGetMaskedValue("ABCD", "engdn")           //결과 : "abcd"
     * </pre>
     * @param {string, object} obj      필수,문자열 또는 HTML태그(Object)
     * @param {string}        sFormat   필수,포멧구분 문자열
     * @param {string}        sDelim    선택,포멧구분, default=sFormat 인자값에 따라 결정
     * @returns string  -Format에 맞게 Mask가 포함된 문자열<br>
     *          공백("")-포멧에 맞지않는값이거나, 인자값이 올바르지 않는 경우<br>
     * @see #ComAddComma
     * @see #ComAddComma2
     * @see #ComGetUnMaskedValue
     */    
    function ComGetMaskedValue(obj, sFormat, sDelim) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = String(getArgValue(obj));

            if (ComIsEmpty(sVal)) return "";

            var sRegExp         = "";
            var sReplaceText    = "";
            var sResultVal      = "";

            var sDelim = getFormatDelim(sFormat, sDelim);

            switch(sFormat) {
                case "ymd":     //yyyy-mm-dd
                    sVal = ComTrimAll(sVal, "-", "/", ".");
                    if (!ComIsDate(sVal)) break;
                    var re      = new RegExp('([0-9][0-9][0-9][0-9])([0-9][0-9])([0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2' + sDelim + '$3');
                    break;
                case "ymdhms":     //yyyy-mm-dd hh:mm:ss
	                sVal = ComTrimAll(sVal, "-", ":"," ");
	                if (!ComIsDateTime2(sVal,sFormat)) break;
	                var re      = new RegExp('([0-9][0-9][0-9][0-9])([0-9][0-9])([0-9][0-9])([0-9][0-9])([0-9][0-9])([0-9][0-9])');
	                sResultVal  = sVal.replace(re,'$1' + sDelim + '$2' + sDelim + '$3'+' '+'$4' + ':' + '$5' + ':' + '$6');
	                break;
                case "ymdhm":     //yyyy-mm-dd hh:mm
	                sVal = ComTrimAll(sVal, "-", ":"," ");
	                if (!ComIsDateTime2(sVal,sFormat)) break;
	                var re      = new RegExp('([0-9][0-9][0-9][0-9])([0-9][0-9])([0-9][0-9])([0-9][0-9])([0-9][0-9])');
	                sResultVal  = sVal.replace(re,'$1' + sDelim + '$2' + sDelim + '$3'+' '+'$4' + ':' + '$5');
	                break;
                case "mdy":     //mm-dd-yyyy
                    sVal = ComTrimAll(sVal, "-", "/", ".");
                    if (!ComIsDate(sVal,sFormat)) break;
                    var re      = new RegExp('([0-9][0-9])([0-9][0-9])([0-9][0-9][0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2' + sDelim + '$3');
                    break;
                case "ym":      //yyyy-mm
                case "yw":      //yyyy-ww
                    sVal = ComTrimAll(sVal, "-", "/", ".");
                    if (!ComIsDate(sVal, sFormat)) break;
                    var re      = new RegExp('([0-9][0-9][0-9][0-9])([0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2');
                    break;   
				case "yyyy":
					if (!ComIsDate(sVal,"yyyy")) break;
                    sResultVal = sVal;  
					break;	   
                case "hms":     //hh:mm:ss
                    sVal = ComTrimAll(sVal, ":");
                    if (!ComIsTime(sVal)) break;
                    var re      = new RegExp('([0-9][0-9])([0-9][0-9])([0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2' + sDelim + '$3');
                    break;
                case "hm":      //hh:mm
                    sVal = ComTrimAll(sVal, ":");
                    if (!ComIsTime(sVal, "hm")) break;
                    var re      = new RegExp('([0-9][0-9])([0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2');
                    break;
                case "int":     //정수
                    if (!ComIsMoneyNumber(sVal, false, true, true)) break;
                    sResultVal  = ComAddComma(sVal);
                    break;
                case "float":     //실수
                case "singledfloat":     //실수
                    if (!ComIsMoneyNumber(sVal, true, true, true)) break;
                    sResultVal  = ComAddComma(sVal);
                    break;
                case "jumin":   //######-#######
                    sVal = ComTrimAll(sVal, "-");
                    if (!ComIsNumber(sVal) || !ComIsJuminNo(sVal)) break;
                    var re      = new RegExp('([0-9][0-9][0-9][0-9][0-9][0-9])([0-9][0-9][0-9][0-9][0-9][0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2');
                    break;
                case "saupja":  //###-##-#####
                    sVal = ComTrimAll(sVal, "-");
                    if (!ComIsNumber(sVal) || !ComIsSaupjaNo(sVal)) break;
                    var re      = new RegExp('([0-9][0-9][0-9])([0-9][0-9])([0-9][0-9][0-9][0-9][0-9])');
                    sResultVal  = sVal.replace(re,'$1' + sDelim + '$2' + sDelim + '$3');
                    break;
                case "num":
                case "han": 
                case "eng":
                    sResultVal = sVal;  break;
                case "engup":
                case "enguponly":
                    sResultVal = sVal.toUpperCase();    break;
                case "engdn":
                    sResultVal = sVal.toLowerCase();    break;
                case "excepthan":
                	re = new RegExp("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]", "gi");
                    sResultVal=sVal.replace(re, '').toUpperCase();
//                	sResultVal = sVal.replace(/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/gi, '').toUpperCase(); break;
                default :
                    return "";
            }

            return sResultVal;
        } catch(err) { ComFuncErrMsg(err.message); }
    } 

    /**
     * 인자값에 포멧구분자를 제거한 문자열을 리턴한다. <br>
     * sFormat 인자값은 다음 중 선택하여 설정한다. <br>
     * sFormat="ymd"    : 년월일 형태인 "yyyy-mm-dd" 포멧인 경우<br>
     * sFormat="ym"     : 년월 형태인 "yyyy-mm" 포멧인 경우<br>
     * sFormat="yw"     : 년주   형태인 "yyyy-ww" 포멧인 경우<br>
     * sFormat="hms"    : 시분초 형태인 "hh:mm:ss" 포멧인 경우<br>
     * sFormat="hm"     : 시분 형태인 "hh:mm" 포멧인 경우<br>
     * sFormat="jumin"  : 주민등록번호 형태인 "######-#######" 포멧인 경우<br>
     * sFormat="saupja" : 사업자등록번호 형태인 "###-##-#####" 포멧인 경우<br>
     * sFormat="int"    : 정수 형태인 "#,###" 포멧인 경우<br>
     * sFormat="float"  : 실수 형태인 "#,###.##" 포멧인 경우<br>
     * sFormat="han"    : 키보드 자동 한글 모드, 한글+숫자 입력 가능<br>
     * sFormat="eng"    : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
     * sFormat="engup"  : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
     * sFormat="engdn"  : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetUnMaskedValue("2008-09-09"       )       //결과 : "", 인자값이 올바르지 않아서 ""이 리턴됨
     *     ret = ComGetUnMaskedValue("2008-09-09", "ymd")       //결과 : "20080909"
     *     ret = ComGetUnMaskedValue("2008-09",    "ym")        //결과 : "200809"
     *     ret = ComGetUnMaskedValue("20:10:59",   "hms")       //결과 : "201059"
     *     ret = ComGetUnMaskedValue("20:10",      "hm")        //결과 : "2010"
     *     ret = ComGetUnMaskedValue("12,345,678", "int")       //결과 : "12345678"
     *     ret = ComGetUnMaskedValue("770101-1234562", "jumin") //결과 : "7701011234562"
     *     ret = ComGetUnMaskedValue("123-45-67891",   "saupja")//결과 : "1234567891"
     *     ret = ComGetUnMaskedValue("가나다라", "han")         //결과 : 가나다라"
     *     ret = ComGetUnMaskedValue("abcd", "eng")             //결과 : "abcd"
     *     ret = ComGetUnMaskedValue("ABCD", "engup")           //결과 : "ABCD"
     *     ret = ComGetUnMaskedValue("abcd", "engdn")           //결과 : "abcd"
     * </pre>
     * @param {object} obj     필수,문자열 또는 HTML태그(Object)
     * @param {string} sFormat 필수,포멧구분
     * @param {string} sDelim  선택,포멧구분, default=sFormat 인자값에 따라 결정
     * @returns string-인자값에 포멧구분자과 스페이스문자열을 제거(trim)한 문자열 <br>
     *          공백""-인자값이 올바르지 않은 경우  <br>
     * @see #ComGetMaskedValue
     */
    function ComGetUnMaskedValue(obj,sFormat,sDelim)
    {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sVal = getArgValue(obj);

            //마스크 구분자가 없는 경우 처리
            sDelim = getFormatDelim(sFormat, sDelim);
            if (sDelim==undefined || sDelim==null || sDelim=="") return "";
            if (sFormat == "ymdhms") sVal = ComTrimAll(sVal, " ", "-", ":");
            return ComTrimAll(sVal,sDelim);
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 구분자 인자를 받아서 구분자에 값이 없으면 포멧에 맞는 마스크 구분자 문자열을 리턴한다.
     * sDelim이 있는 경우 : 인자로 받은 sDelim을 반환한다. <br>
     * sDelim이 없는 경우 : sFormat인자를 읽어서 해당하는 마스크구분자를 반환한다.<br>
     * 이 함수는 이파일(CoCommon.js)과 CoFormControl.js에서만 사용하기 위한 목적으로 만들졌다.
     */
    function getFormatDelim(sFormat, sDelim){
        try {
            if (sDelim==undefined || sDelim==null || sDelim=="") {
                switch(sFormat) {
                    case "ymd":
                    case "ymdhms":
                    case "ymdhm":
                    case "ym":
                    case "yw":
                    case "mdy":
                        sDelim=DATE_SEPARATOR;
                        break;
                    case "hms":     //hh:mm:ss
                    case "hm":      //hh:mm
                        sDelim=":";     break;
                    case "jumin":
                    case "saupja":
                        sDelim="-";     break;
                    case "int":
                    case "float":
                    case "singledfloat":
                        sDelim=",";     break;
                    case "han": //다음5가지는 마스크구분자가 없으므로 임의로 다음을 설정한다.
                    case "eng":
                    case "enguponly":
                    case "engup": 
                    case "engdn":
                    case "yyyy":
                    case "num":
                    case "excepthan":
                        sDelim="|!|";     break;
                }
            }

            return sDelim;
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    /**
     * 인자값이 0이면 ""을 리턴하고, 0이 아니면 인자값 자체를 리턴한다. <br>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @returns string <br>
     *          ""     : 인자값=0인 경우<br>
     *          인자값 : 인자값!=0인 경우
     * @see #ComNullToZero
     * @see String#zeroToNull
     */
    function ComZeroToNull(obj) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sValue = getArgValue(obj);

            return sValue == 0 ? "" : sValue;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 인자값이 ""이면 0을 리턴하고, ""이 아니면 인자값 자체를 리턴한다. <br>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @returns string <br>
     *          "0"    : 인자값=""인 경우<br>
     *          인자값 : 인자값!=""인 경우
     * @see #ComZeroToNull
     * @see String#nullToZero
     */
    function ComNullToZero(obj) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var sValue = getArgValue(obj);

            return sValue == "" ? 0 : sValue;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 분기문자열을 받아서 해당분기의 월을 리턴한다. <br>
     * 분기문자열은 "14", "24, "34", "44"로 설정한다. bFormat인자가 true이면 2자리의 월을 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ret = ComGetQuarterToMonth("14")       //결과 : 1
     *     ret = ComGetQuarterToMonth("24")       //결과 : 4
     *     ret = ComGetQuarterToMonth("34")       //결과 : 7
     *     ret = ComGetQuarterToMonth("44")       //결과 : 10
     *     ret = ComGetQuarterToMonth("14", true) //결과 : 01
     * </pre>
     * @param {string,object} qtr       필수,분기문자열 또는 HTML태그(Object)
     * @param {bool}          bFormat   선택,월2자리여부, default=false
     * @returns string <br>
     */
    function ComGetQuarterToMonth(qtr,bFormat){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            qtr = getArgValue(qtr);

            if( qtr == undefined || qtr.length != 2){
                return "";
            }
            qtr = qtr.substring(0,1);
            var  month = ((qtr-1) * 3 )+1;
            if(bFormat) month=ComLpad(month, 2, "0");
            return month;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 인자로 받은 문자열 중 HTML에서 특수문자를 변환문자로 바꿔서 결과를 리턴한다. <br>
     * @param {string,object} obj   필수,문자열 또는 HTML태그(Object)
     * @returns string <br>
     */
    function ComToHtml(obj){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var str = getArgValue(obj);

            str = str.replace(/&/g,'@amp;');
            str = str.replace(/</g,'@lt;');
            str = str.replace(/>/g,'@gt;');
            str = str.replace(/,/g,'@#44;');
            str = str.replace(/\"/g,'@quot;');
            str = str.replace(/\'/g,'@acute;');
            str = str.replace(/\n/g,'@ffd;');
            str = str.replace(/\r/g,'@cgrtn;');
            return str;
        } catch(err) { ComFuncErrMsg(err.message); }
    }


    var ComFunc;
    /**
     * 자바스크립트 함수명을 문자열로 인자로 받아서 해당함수의 존재여부를 리턴하고, 전역변수인 ComFunc변수에 확인한 함수를 Clon 한다. <br>
     * 따라서 ComFunc변수는 function으로 설정되므로 확인한 함수를 실행하려면 ComFunc()로 바로 실행할 수 있다. 함수에 인자가 있다면 ComFunc(인자)로 호출한다.<br>
     * <br><b>Example :</b>
     * <pre>
     *   //setColor 함수의 존재여부 확인 후 setColor 함수를 실행한다.
     *   if(ComFuncCheck("setColor")) ComFunc();
     *
     *   //makeJob 함수의 존재여부 확인 후 makeJob("name", 150) 함수를 실행한다.
     *   if(ComFuncCheck("makeJob")) ComFunc("name", 150);
     * </pre>
     * @param {string} funcname      필수,함수이름 문자열
     * @returns bool, 함수의 존재여부 <br>
     *          true  : 함수가 존재하는 경우<br>
     *          false : 함수가 존재하지 않는 경우
     */
    function ComFuncCheck(funcname) {
      try{
        ComFunc = eval(funcname);
      }catch(e){
        return false;
      }
      return true;
    }


    /**
     * 숫자 0으로 초기화 된 1차원 배열을 생성하여 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     aryNum = ComNumberArray(4);
     * </pre>
     * @param {number} iSize 필수,배열 크기
     * @return Array
     */
    function ComNumberArray(iSize)
    {
        try {
            var aryResult = new Array();

            for (var i=0; i <iSize; i++) {
                aryResult[i] = 0;
            }

            return aryResult;
        } catch(err) { ComFuncErrMsg(err.message); }
    }

    /**
     * 인자값의 문자열의 길이를 리턴한다. Utf-8의 한글의 경우 3Byte로 계산한다. <br>
     * {@link CoCommon#ComGetLenByByte}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "가나다라";
     *     ret = str.lengthByte();      //결과 : 12
     *     ret = ComGetLenByByte(str);  //결과 : 12
     * </pre>
     * @return number, 문자열의 길이
     * @see CoCommon#ComGetLenByByte
     */
    String.prototype.lengthByte = function()            { return ComGetLenByByte(this.toString());}

    /**
     * 인자로 받은 문자열(sVal)의 총길이가 두번째 인자 iLen만큼 되도록 왼쪽 빈자리에 padStr를 붙여서 문자열로 리턴한다. <br>
     * {@link CoCommon#ComLpad}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "123";
     *     ret = str.lpad(5, "0");      //결과 : "00123"
     *     ret = ComLpad(str, 5, "0")   //결과 : "00123"
     * </pre>
     * @param {number}        iLen     필수,리턴할 총 문자열 길이
     * @param {string}        padStr   필수,붙일 문자열
     * @return string
     * @see CoCommon#ComLpad
     * @see #rpad
     */
    String.prototype.lpad       = function(iLen, padStr){ return ComLpad(this.toString(), iLen, padStr);}

    /**
     * 인자로 받은 문자열(sVal)의 총길이가 두번째 인자 iLen만큼 되도록 오른쪽 빈자리에 padStr를 붙여서 문자열로 리턴한다. <br>
     * {@link CoCommon#ComRpad}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "123";
     *     ret = str.rpad(5, "0");      //결과 : "12300"
     *     ret = ComRpad(str, 5, "0")   //결과 : "12300"
     * </pre>
     * @param {number}        iLen      필수,리턴할 총 문자열 길이
     * @param {string}        padStr    필수,붙일 문자열
     * @return string
     * @see CoCommon#ComRpad
     * @see #lpad
     */
    String.prototype.rpad       = function(iLen, padStr){ return ComRpad(this.toString(), iLen, padStr);}

    /**
     * 인자값의 왼쪽에 있는 스페이스 문자 또는 sChar값의 문자를 제거한 후 나머지 문자열을 리턴한다. <br>
     * {@link CoCommon#ComLtrim}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "      121323  ";
     *     ret = str.ltrim();       //결과 : "121323  "
     *     var str = "0012132300";
     *     ret = str.ltrim("0");    //결과 : "12132300"
     *     ret = ComLtrim(str, "0") //결과 : "12132300"
     * </pre>
     * @param {string}        sChar 선택,제거할 문자열, default=" "
     * @return  string, 왼쪽에 있는 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see CoCommon#ComLtrim
     * @see #rtrim
     * @see #trim
     * @see #trimAll
     */
    String.prototype.ltrim      = function(sChar)       { return ComLtrim(this.toString(), sChar);}

    /**
     * 인자값의 오른쪽에 있는 스페이스 문자 또는 sChar값의 문자를 제거한 후 나머지 문자열을 리턴한다. <br>
     * {@link CoCommon#ComRtrim}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "      121323  ";
     *     ret = str.rtrim();       //결과 : "      121323"
     *     var str = "0012132300";
     *     ret = str.rtrim("0");    //결과 : "00121323"
     *     ret = ComRtrim(str, "0") //결과 : "00121323"
     * </pre>
     * @param {string}        sChar 선택,제거할 문자열, default=" "
     * @return  string, 오른쪽에 있는 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see CoCommon#ComRtrim
     * @see #ltrim
     * @see #trim
     * @see #trimAll
     */
    String.prototype.rtrim      = function(sChar)       { return ComRtrim(this.toString(), sChar);}

    /**
     * 인자값의 양쪽에 있는 스페이스 문자 또는 sChar값의 문자를 제거한 후 나머지 문자열을 리턴한다. <br>
     * {@link CoCommon#ComTrim}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "      121323  ";
     *     ret = str.trim();        //결과 : "121323"
     *     var str = "0012132300";
     *     ret = str.trim("0");     //결과 : "121323"
     *     ret = ComTrim(str, "0")  //결과 : "121323"
     * </pre>
     * @param {string}        sChar 선택,제거할 문자열, default=" "
     * @return  string, 양쪽에 있는 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see CoCommon#ComTrim
     * @see #ltrim
     * @see #rtrim
     * @see #trimAll
     */
    String.prototype.trim       = function(sChar)       { return ComTrim(this.toString(), sChar);}

    /**
     * 문자열에 포함된 모든 스페이스 문자 또는 sChar값의 문자를 제거한 나머지 문자열을 리턴한다. <br>
     * sChar 인자를 여러개 설정할수 있으므로 이 함수의 2번째 이후 모든 인자값은 제거할 문자로 처리한다. <br>
     * 예를 들어 "-"와 "*"를 각자 제거하고자 한다면 다음과 같이 설정한다. <br>
     * ret = str.trimAll("-", "*") <br>
     * {@link CoCommon#ComTrimAll}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "   12  13  23  ";
     *     ret = str.trimAll();         //결과 : "121323"
     *     var str = "*12*13*23*";
     *     ret = str.trimAll("*");      //결과 : "121323"
     *     var str = "*-/-abcd/가나다라*-/-";
     *     ret = str.trimAll("*", "/", "-");    //결과 : "abcd가나다라"
     *     ret = ComTrimAll(str, "*", "/", "-") //결과 : "abcd가나다라"
     * </pre>
     * @param {string}        sChar    선택,제거할 문자열, default=" "
     * @param {string}        sChar2   선택,sChar와 같이 제거할 문자열로 원하는 만큼 설정할수 있다.
     * @return string, 모든 스페이스 문자 또는 sChar값을 제거한 나머지 문자열
     * @see CoCommon#ComTrimAll
     * @see #ltrim
     * @see #rtrim
     * @see #trim
     */
    String.prototype.trimAll    = function(sChar){
        var args = arguments;
        var sVal = this.toString();
        
        //인자가 하나도 없는 경우
        if (args.length==0) return ComTrimAll(sVal, sChar);

        //trim할 글자가 여러개 인 경우
        for(var idx=0; idx<args.length; idx++) {
            sVal =  ComReplaceStr(sVal, args[idx], "");
        }
        return sVal;
    }

    /**
     * 인자값이 ""이면 0을 리턴하고, ""이 아니면 인자값 자체를 리턴한다. <br>
     * {@link CoCommon#ComNullToZero}함수와 동일하게 동작한다. <br>
     * @returns string <br>
     *          "0"    : 인자값=""인 경우<br>
     *          인자값 : 인자값!=""인 경우
     * @see CoCommon#ComNullToZero
     * @see #zeroToNull
     */
    String.prototype.nullToZero = function()            { return ComNullToZero(this.toString());}

    /**
     * 인자값이 0이면 ""을 리턴하고, 0이 아니면 인자값 자체를 리턴한다. <br>
     * {@link CoCommon#ComZeroToNull}함수와 동일하게 동작한다. <br>
     * @returns string <br>
     *          ""     : 인자값=0인 경우<br>
     *          인자값 : 인자값!=0인 경우
     * @see CoCommon#ComZeroToNull
     * @see #nullToZero
     */
    String.prototype.zeroToNull = function()            { return ComZeroToNull(this.toString());}

    /**
     * 문자열을 10진수로 변환하여 리턴한다.
     * {@link CoCommon#ComParseInt}함수와 동일하게 동작한다. <br>
     * @return number,문자열을 10진수로 변환한 값
     */
    String.prototype.parseInt   = function()            { return ComParseInt(this.toString());}

    /**
     * 문자열(sVal)에 포함된 특정문자열(sFind)을 다른문자열(sReplace)로 변경하여 문자열로 리턴한다. <br>
     * {@link CoCommon#ComReplaceStr}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "2008-*-01-*-01";
     *     ret = str.replaceStr("-*-", "*");        //결과 : "2008*01*01"
     *     ret = ComReplaceStr(str, "-*-", "*")     //결과 : "2008*01*01"
     * </pre>
     * @param {string}        sFind     필수,찾을 기준 문자열
     * @param {string}        sRep      선택,변경할 문자열, default=""
     * @return String, 특정문자열(sFind)을 다른문자열(sRep)로 변경한 결과 문자열
     * @see CoCommon#ComReplaceStr
     */
    String.prototype.replaceStr = function(sFind, sRep) { return ComReplaceStr(this.toString(),sFind, sRep);}
    
    
    /**
     * 입력된 문자열이 숫자와 이외의문자(sSubChar)로만 구성되었는지 여부를 확인한다. <br>
     * {@link CoCommon#ComIsNumber}함수와 동일하게 동작한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var str = "1234"
     *     ret = str.isNumber();        //결과 : true
     *     ret = ComIsNumber("1234")    //결과 : true
     * </pre>
     * @param {string}        sSubChar 선택,숫자 이외에 가능한 문자, default=""
     * @returns bool<br>
     *          true-숫자와 이외의문자(sSubChar)로만 구성된 경우<br>
     *          false-허용된 문자 이외의 문자가 포함된 경우
     * @see CoCommon#ComIsNumber
     */
    String.prototype.isNumber = function(sSubChar) 		{ return ComIsNumber(this.toString(), sSubChar); }