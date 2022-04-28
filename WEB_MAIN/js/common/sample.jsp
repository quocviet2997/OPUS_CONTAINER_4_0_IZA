<%@ page contentType="text/html;charset=UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<!-- NIS2010 -->
<script LANGUAGE="javascript" SRC="CoAxon.js"></script>

<script LANGUAGE="javascript" SRC="CoCommon.js"></script>
<script LANGUAGE="javascript" SRC="CoFormControl.js"></script>
<script LANGUAGE="javascript" SRC="CoMessage.js"></script>
<script LANGUAGE="javascript" SRC="CoPopup.js"></script>
<script LANGUAGE="javascript" SRC="CoCalendar.js"></script>
<script LANGUAGE="javascript" SRC="CoObject.js"></script>
<script LANGUAGE="javascript" SRC="IBSheetInfo.js"></script>
<script LANGUAGE="javascript" SRC="CoWait.js"></script>
<script LANGUAGE="javascript" SRC="CoBiz.js"></script>
<!-- NIS2010 -->

<script LANGUAGE="javascript" SRC="sample.js"></script>
</head>

<!-- body 시작 -->
<body onload="loadPage();" onkeydown="if(event.keyCode==8 && event.srcElement.readOnly)return false;//Backspace키를 눌렀을때 처리">
  <!--form name="form" onkeydown="ComKeyEnter()"-->
  <form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd">
  <table bgcolor="#e0e0e0" width="980">
    <tr>
        <td>
          <b>[HTML 오브젝트]</b><br>
          txtName : <input type="text" name="txtName" value="한진해운" maxlength="3" required>
          btn_Retrieve : <img src="/opuscntr/img/btns_search.gif" name="btn_Retrieve" onClick="alert(this.name)">
          sltCity : <select name="sltCity" required >
                        <option value="">선택</option>
                        <option value="01">서울</option>
                        <option value="02">대전</option>
                        <option value="03">대구</option>
                        <option value="04" selected>부산</option>
                    </select>
          rdoCity : <input type="radio" name="rdoCity" class="trans" value="01" required>서울
                    <input type="radio" name="rdoCity" class="trans" value="02">대전
                    <input type="radio" name="rdoCity" class="trans" value="03">대구
                    <input type="radio" name="rdoCity" class="trans" value="04">부산
          chkYn :<input type="checkbox" name="chkYn" value="Y" required caption="체크박스">
          <br>

            (1)년월일         	: <input type="text" name="txtDate1" dataformat="ymd"    caption="년월일"        maxlength="8" size="10"  value="2008-09-09"><img src="/opuscntr/img/btns_calendar.gif" align="absmiddle" style="cursor:hand" onClick="func_test('calendarPopup1')">
            (2)년월           	: <input type="text" name="txtDate2" dataformat="ym"     caption="년월"          maxlength="6" size="8"   value="2008-09"><img src="/opuscntr/img/btns_calendar.gif" align="absmiddle" style="cursor:hand" onClick="func_test('calendarPopup2')">
            (3)기간          	: <input type="text" name="txtsDate" dataformat="ymd"    caption="시작일"        maxlength="8"  size="10"  cofield="txteDate" value="2008-09-09">
                              	~ <input type="text" name="txteDate" dataformat="ymd"    caption="종료일"        maxlength="8"  size="10"  cofield="txtsDate"><img src="/opuscntr/img/btns_calendar.gif" align="absmiddle" style="cursor:hand" onClick="func_test('calendarPopupFromTo1')">
            <br>
            (4)시분초         	: <input type="text" name="txtTime1" dataformat="hms"    caption="시분초"        maxlength="6" size="10"  value="23:10:11">
            (5)시분초         	: <input type="text" name="txtTime2" dataformat="hm"     caption="시분초"        maxlength="4" size="5"   value="23:10">
            (6)주민등록번호   	: <input type="text" name="txtJumin" dataformat="jumin"  caption="주민등록번호"  maxlength="13" size="14" value="770101-1234562">
            (7)사업자번호     	: <input type="text" name="txtSaup"  dataformat="saupja" caption="사업자번호"    maxlength="10" size="14" value="123-45-67891">
            <br>
            (8)한글           	: <input type="text" name="txthan"   dataformat="han"    caption="한글"          maxlength="10" size="10" value="한진해운">
            (9)영문           	: <input type="text" name="txtEng"   dataformat="eng"    caption="영문"          maxlength="10" size="10" value="abcd">
            (10)영문대문자    	: <input type="text" name="txtEngUp" dataformat="engup"  caption="영문대문자"    maxlength="10" size="10" value="abcd">
            (11)영문소문자    	: <input type="text" name="txtEngDn" dataformat="engdn"  caption="영문소문자"    maxlength="10" size="10" value="ABCD">
            <br>
            (12)영문대문자&숫자	: <input type="text" name="txtEngUp2" dataformat="engup"  caption="영대문자숫자" maxlength="10" size="8" value="abcd">
            (13)영문소문자&숫자	: <input type="text" name="txtEngDn2" dataformat="engdn"  caption="영소문자숫자" maxlength="10" size="8" value="ABCD">
            (14)정수           	: <input type="text" name="txtInt"   dataformat="int"    caption="정수"          maxlength="8"  size="8" value="123,456" >
            (15)실수num(7,3)   	: <input type="text" name="txtFloat2"  dataformat="float" caption="실수(최대최소)"          maxlength="8"  size="7"   pointcount="3" >
            <br>
            (16)정수(최대100, 최소0)  			: <input type="text" name="txtInt2"    dataformat="int"   caption="정수(최대최소)"     maxlength="3"  size="3"   minnum="0" maxnum="100" >
            (17)실수(num(7,3) 최대100.2 최소0) 	: <input type="text" name="txtFloat2"  dataformat="float" caption="실수(최대최소)"     maxlength="8"  size="7"   pointcount="3" minnum="0" maxnum="100.2">
            (18)MultiCombo    	: <script language="javascript">ComComboObject('combo1');</script>
        </td>
        <td>
          sltCityMulti :<br>
            <select name="sltCityMulti" multiple size="4">
                <option value="01">서울</option>
                <option value="02">대전</option>
                <option value="03">대구</option>
                <option value="04" selected>부산</option>
            </select>
        </td>
    </tr>
  </table>
  </form>


  <script language="javascript">ComTabObject('tab1', null, 980);</script>
  <table id="tabLayer" bgcolor="#efefef" width="980">
    <tr>
        <td>
          <!--[CoCommon]-->
            * 날짜관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsDate" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsDateTime" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsTime" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsMonth" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsWeek" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsDay" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsDay2" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComChkPeriod" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetDateAdd" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetDaysBetween" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetDaysToToday" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetLastDay" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetNowInfo" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetQuarterToMonth" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComFullAges" >

            <br>* 문자열 관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComLtrim" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComRtrim" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComTrim" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComTrimAll" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComReplaceStr" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComChkLen" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComChkLenByByte" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetLenByByte" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComLpad" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComRpad" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComNullToZero" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComZeroToNull" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComToHtml" >
        </td>
    </tr>
  </table>



  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoCommon2-->
            * 문자열 Validation &amp; Format 관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsNull" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsEmpty" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsKorean" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsAlphabet" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsEmailAddr" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsJuminNo" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsSaupjaNo" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsContainsChars" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsContainsCharsOnly" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetMaskedValue" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetUnMaskedValue" >

            <br>* 숫자 관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsNumber" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsMoneyNumber" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComParseInt" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComRound" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComTrunc" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComAddComma" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComAddComma2" >

            <br>* 기타<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComNumberArray" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetAryJoin" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComFuncCheck" >

        </td>
    </tr>
  </table>

  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoFormControl-->
            *이벤트 관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComAddSeparator" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComClearSeparator" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComKeyOnlyAlphabet" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComKeyOnlyNumber" >

            <br>*Validation 관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComChkRequired" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComChkValid" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComChkObjValid" >

            <br>*기능 관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetObjValue" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComSetObjValue" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetObjText" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComAddComboItem" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComClearCombo" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComEnableObject" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComEnableManyObjects" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComClearObject" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComClearManyObjects" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowObject" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowManyObjects" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComAlertFocus" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComSetFocus" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComSetNextFocus" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComKeyEnter" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComResetAll" >

            <br>*쿠키관련<br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComClearCookie" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetCookie" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComSetCookie" >
        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoMessage-->
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowConfirm" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowMessage" >
            <br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowCodeConfirm" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowCodeMessage" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetMsg" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComSetMsg" >
        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoPopup-->
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComOpenWindow" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComOpenWindowCenter" >
            <br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComOpenPopup" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComOpenPopupWithTarget" >
        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoWait-->
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComOpenWait" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComOpenWaitCallFunc" >
        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980"  style="display:none">
    <tr>
        <td>
          <!--CoCalendar-->
            날짜 : <input type="text" name="txtCalDate" size="29" readonly >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComCalendar" >
            <br>
            기간 : <input type="text" name="txtStartDate" size="10" readonly>
               ~   <input type="text" name="txtEndDate" size="10" readonly>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComCalendarFromTo" >
            <br>
            옵션 :
            <select name="sltType" onChange="changeDisplayType(this.value)">
                <option value="date">    setDisplayType("date")</option>
                <option value="week-end">setDisplayType("week-end")</option>
                <option value="month">   setDisplayType("month")</option>
                <option value="quarter"> setDisplayType("quarter")</option>
                <option value="year">    setDisplayType("year")</option>
            </select>
            <select name="sltFormat">
                <option value="yyyy-MM-dd">yyyy-MM-dd</option>
                <option value="yyyy-MMM-dd">yyyy-MMM-dd</option>
                <option value="yy-MM-dd">yy-MM-dd</option>
                <option value="yy-MMM-dd">yy-MMM-dd</option>
                <option value="MM-dd-yyyy">MM-dd-yyyy</option>
                <option value="yyyy-MM">yyyy-MM</option>
                <option value="MMM-yyyy">MMM-yyyy</option>
                <option value="yyyy">yyyy</option>
                <option value="yy">yy</option>
            </select>

        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoAxon-->
            * AXON Logger(디버깅 Layer) : Ctrl + Shift + Alt + D키를 누르면 표시됩니다. ESC키를 누르면 닫힙니다.<br><br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComDebug" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComDebugFunction" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComLog" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="Axon" >
        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--String-->
            <input type="button" style="width:190" onclick="func_test(this.value)" value="lengthByte" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="lpad" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="rpad" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ltrim" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="rtrim" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="trim" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="trimAll" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="nullToZero" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="zeroToNull" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="parseInt" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="replaceStr" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="isNumber" >
        </td>
    </tr>
  </table>
  <table id="tabLayer" bgcolor="#efefef" width="980" style="display:none">
    <tr>
        <td>
          <!--CoBiz-->
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetCntrChkDgt" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetCntrNoFull" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetCntrNoFullMulti" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsCustomer" >
        </td>
    </tr>
  </table>

  <textarea name="txtEvent" rows="8" cols="110" wrap="off" style="width:980; background-color:beige;"></textarea><br>
  <a href="sample_object.jsp">sample_object.jsp</a>,
  <a target="opuscntrhelp" href="http://opuscntr.cyberlogitec.com/jsdoc/index.html">도움말 전체</a>,
  <a target="opuscntrhelpsub" href="http://opuscntr.cyberlogitec.com/jsdoc/index.html" id="helpurl">함수도움말</a>

</body>
</html>