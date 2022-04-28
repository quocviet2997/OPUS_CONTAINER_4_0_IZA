/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : something.js
*@FileTitle  : Some Title 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
/* for Firefox */
if( navigator.userAgent.indexOf('Firefox') >= 0 ) {
	var eventNames = ["mousedown", "mouseover", "mouseout", "keyup",
	                            "mousemove", "mousedrag", "click", "dblclick",
	                            "keydown", "keypress", "keyup", "change" ]; 

	for( var i = 0 ; i < eventNames.length; i++ ) {
		window.addEventListener( eventNames[i], function(e) {
			window.event = e;
		}, true );
	}
}

/** sourceIndex 
 * @target  FireFox, Safari, Chrome
 */
//if(document.documentElement.sourceIndex == "undefined" || document.documentElement.sourceIndex ==  undefined){
try{
    HTMLElement.prototype.__defineGetter__("sourceIndex", (function(indexOf){
        return function sourceIndex(){
            return indexOf.call(this.ownerDocument.getElementsByTagName("*"), this);
        };
    })(Array.prototype.indexOf));
;
} catch (e){}
//}
/*----------------- Color delcear ****************/
var COLOR_THEME_PINK = ["#b9c8ed"];
var COLOR_THEME_PINK_SUM = ["#4e72da"];
var COLOR_THEME_BLUE = ["#8fd8ef"];
var COLOR_THEME_BLUE_SUM = ["#12abdc"];
var COLOR_THEME_DIFF_1 = ["#F5E1D1"];
var COLOR_THEME_DIFF_2 = ["#FFFFA0"];
var COLOR_THEME_SUB_SUM = ["#E8FFC6"];

var COLOR_PINK = "#b9c8ed";
var COLOR_PINK_SUM = "#4e72da";
var COLOR_BLUE = "#8fd8ef";
var COLOR_BLUE_SUM = "#12abdc";
var COLOR_DIFF_1 = "#F5E1D1";
var COLOR_DIFF_2 = "#FFFFA0";
var COLOR_SUB_SUM = "#E8FFC6";
var BTN_BLUE = "#0100ff";
var BTN_GREEN = "#1ddb16";
var BTN_RED = "#ff0000";

/*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/
/** FOMR CONTROL - form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값 */
var INIT        = 0;
var ADD         = 1;
var SEARCH      = 2;
var SEARCHLIST  = 3;
var MODIFY      = 4;
var REMOVE      = 5;
var REMOVELIST  = 6;
var MULTI       = 7;
var PRINT       = 8;
var REPLY       = 9;

/** FOMR CONTROL - DEFAULT COMMAND 01 ~ 20 */
var COMMAND01 = 11;
var COMMAND02 = 12;
var COMMAND03 = 13;
var COMMAND04 = 14;
var COMMAND05 = 15;
var COMMAND06 = 16;
var COMMAND07 = 17;
var COMMAND08 = 18;
var COMMAND09 = 19;
var COMMAND10 = 20;
var COMMAND11 = 21;
var COMMAND12 = 22;
var COMMAND13 = 23;
var COMMAND14 = 24;
var COMMAND15 = 25;
var COMMAND16 = 26;
var COMMAND17 = 27;
var COMMAND18 = 28;
var COMMAND19 = 29;
var COMMAND20 = 30;
var COMMAND21 = 31;
var COMMAND22 = 32;
var COMMAND23 = 33;
var COMMAND24 = 34;
var COMMAND25 = 35;
var COMMAND26 = 36;
var COMMAND27 = 37;
var COMMAND28 = 38;
var COMMAND29 = 39;
var COMMAND30 = 40;
var COMMAND31 = 41;
var COMMAND32 = 42;
var COMMAND33 = 43;
var COMMAND34 = 44;
var COMMAND35 = 45;
var COMMAND36 = 46;
var COMMAND37 = 47;
var COMMAND38 = 48;
var COMMAND39 = 49;
var COMMAND40 = 50;
var COMMAND41 = 51;
var COMMAND42 = 52;
var COMMAND43 = 53;
var COMMAND44 = 54;
var COMMAND45 = 55;
var COMMAND46 = 56;
var COMMAND47 = 57;
var COMMAND48 = 58;
var COMMAND49 = 59;
var COMMAND50 = 60;
var COMMAND51 = 61;
var COMMAND52 = 62;
var COMMAND53 = 63;
var COMMAND54 = 64;
var COMMAND55 = 65;
var COMMAND56 = 66;
var COMMAND57 = 67;
var COMMAND58 = 68;
var COMMAND59 = 69;
var COMMAND60 = 70;

/*================================
 * 설계자의 요청에 의한 상수 추가
 * SEARCH01 ~ 20
 * MODIFY01~20
 * REMOVE01~20
 * MULTI01~20
 * 상수의 int 값으로는 101 ~ 180 까지 사용하기로 함
 =================================*/

var SEARCH01 = 101;
var SEARCH02 = 102;
var SEARCH03 = 103;
var SEARCH04 = 104;
var SEARCH05 = 105;
var SEARCH06 = 106;
var SEARCH07 = 107;
var SEARCH08 = 108;
var SEARCH09 = 109;
var SEARCH10 = 110;
var SEARCH11 = 111;
var SEARCH12 = 112;
var SEARCH13 = 113;
var SEARCH14 = 114;
var SEARCH15 = 115;
var SEARCH16 = 116;
var SEARCH17 = 117;
var SEARCH18 = 118;
var SEARCH19 = 119;
var SEARCH20 = 120;

var SEARCH21 = 201;
var SEARCH22 = 202;
var SEARCH23 = 203;
var SEARCH24 = 204;
var SEARCH25 = 205;
var SEARCH26 = 206;
var SEARCH27 = 207;
var SEARCH28 = 208;
var SEARCH29 = 209;
var SEARCH30 = 210;
var SEARCH31 = 211;
var SEARCH32 = 212;
var SEARCH33 = 213;
var SEARCH34 = 214;
var SEARCH35 = 215;
var SEARCH36 = 216;
var SEARCH37 = 217;
var SEARCH38 = 218;
var SEARCH39 = 219;
var SEARCH40 = 220;

var SEARCHLIST01 = 121;
var SEARCHLIST02 = 122;
var SEARCHLIST03 = 123;
var SEARCHLIST04 = 124;
var SEARCHLIST05 = 125;
var SEARCHLIST06 = 126;
var SEARCHLIST07 = 127;
var SEARCHLIST08 = 128;
var SEARCHLIST09 = 129;
var SEARCHLIST10 = 130;
var SEARCHLIST11 = 131;
var SEARCHLIST12 = 132;
var SEARCHLIST13 = 133;
var SEARCHLIST14 = 134;
var SEARCHLIST15 = 135;
var SEARCHLIST16 = 136;
var SEARCHLIST17 = 137;
var SEARCHLIST18 = 138;
var SEARCHLIST19 = 139;
var SEARCHLIST20 = 140;

var MODIFY01 = 141;
var MODIFY02 = 142;
var MODIFY03 = 143;
var MODIFY04 = 144;
var MODIFY05 = 145;
var MODIFY06 = 146;
var MODIFY07 = 147;
var MODIFY08 = 148;
var MODIFY09 = 149;
var MODIFY10 = 150;
var MODIFY11 = 151;
var MODIFY12 = 152;
var MODIFY13 = 153;
var MODIFY14 = 154;
var MODIFY15 = 155;
var MODIFY16 = 156;
var MODIFY17 = 157;
var MODIFY18 = 158;
var MODIFY19 = 159;
var MODIFY20 = 160;


var REMOVE01 = 161;
var REMOVE02 = 162;
var REMOVE03 = 163;
var REMOVE04 = 164;
var REMOVE05 = 165;
var REMOVE06 = 166;
var REMOVE07 = 167;
var REMOVE08 = 168;
var REMOVE09 = 169;
var REMOVE10 = 170;
var REMOVE11 = 171;
var REMOVE12 = 172;
var REMOVE13 = 173;
var REMOVE14 = 174;
var REMOVE15 = 175;
var REMOVE16 = 176;
var REMOVE17 = 177;
var REMOVE18 = 178;
var REMOVE19 = 179;
var REMOVE20 = 180;

var MULTI01 = 181;
var MULTI02 = 182;
var MULTI03 = 183;
var MULTI04 = 184;
var MULTI05 = 185;
var MULTI06 = 186;
var MULTI07 = 187;
var MULTI08 = 188;
var MULTI09 = 189;
var MULTI10 = 190;
var MULTI11 = 191;
var MULTI12 = 192;
var MULTI13 = 193;
var MULTI14 = 194;
var MULTI15 = 195;
var MULTI16 = 196;
var MULTI17 = 197;
var MULTI18 = 198;
var MULTI19 = 199;
var MULTI20 = 200;

var CofieldFlag = false;
var pastEventNum = 0;
var pastEventObj = null;

/**
 * 메세지를 알리는 메세지박스 표시 후 지정된 HTML태그(Object)로 focus를 옮긴다. <br>
 * HTML태그(Object)가 input type="text"인 경우 focus 설정과 함께 글자를 블록으로 select설정 까지 처리한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComAlertFocus(txtDate,           ComGetMsg('COM12130','Period','First Element'));
 *     ComAlertFocus(formObj.fm_prd_dt, "From Date is Later than To Date");
 * </pre>
 * @param {object} obj     필수,메시지 표시 후 focus를 가질 HTML태그(Object)
 * @param {string} message 필수,메세지박스에 보여질 메세지
 * @return 없음
 * @see #ComSetFocus
 * @see #ComSetNextFocus
 */
function ComAlertFocus(obj, message) {
	try{
		if ( message != '') ComShowMessage( message );
		//chrome52 infinite alert bug
		//obj.value = "";
		ComSetFocus(obj);
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 인자로 받은 HTML태그(Object)로 focus를 옮긴다. focus를 설정하고, 글자를 블록으로 select 한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComSetFocus(txtDate);   //결과 : txtDate 컨트롤에 포커스를 설정한다.
 * </pre>
 * @param {object} obj     필수,focus를 가질 HTML태그(Object)
 * @return 없음
 * @see #ComAlertFocus
 * @see #ComSetNextFocus
 */
function ComSetFocus(obj) {
	//obj가 ?�겨???�는 경우 focus?�정?�면 ?�러가 발생??
    try {
    	obj.focus();
       //글?��? ?�는 경우 블럭?�로 ?�택?�수 ?�도�??�다.
        if (obj.getAttribute("isContentEditable") && obj.getAttribute("value") != null && obj.value.length >=1 ) obj.select();
        
        //OnChange?�벤?��? Cancel?�여 ?�른 Object로의 ?�커???�동??막는??
		if(ComGetEvent() == obj && ComGetEvent("type")=="change") ComJsEventStop(); 
    } catch(err) {;}
}

/**
 * 인자로 받은 HTML태그(Object)의 사용 가능/불가능 상태를 변경한다. <br>
 * &lt;input type="text"&gt;와 &lt;input type="password"&gt;의 경우 readOnly속성과 backgroundColor,color를 변경하고,  <br>
 * &lt;img&gt;의 경우 disable속성과  cursor,filter를 변경한다. <br>
 * 그외 HTML태그(Object) disable속성을 변경한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComEnableObject(txtName,  true);   // 결과 : &lt;input type="text" name="txtName"&gt;을 enable 상태로 설정한다.
 *     ComEnableObject(txtName,  false);  // 결과 : &lt;input type="text" name="txtName"&gt;을 disable 상태로 설정한다.
 *     ComEnableObject(btn_save, true);   // 결과 : &lt;img name="btn_save"&gt;을 enable 상태로 설정한다.
 *     ComEnableObject(btn_save, false);  // 결과 : &lt;img name="btn_save"&gt;을 disable 상태로 설정한다.
 * </pre>
 * @param {object} obj     필수,대상 HTML태그(Object)
 * @param {bool}   bEnable 필수,사용 가능/불가능 여부를 true/false로 설정한다.
 * @return 없음
 * @see #ComEnableManyObjects
 */
function ComEnableObject(obj, bEnable)
{
    try {
    	//disabled나 readOnly 설정하기
        switch( obj.type ) {
            case "password" :
            case "text" :
            	obj.readOnly = !bEnable;
                break;
            default:
                obj.disabled = !bEnable;
        }

        //설정에 따라 css 처리하기
        switch( obj.type ) {
            case "select-one" :
            case "text" :
                if (bEnable){
                    if (obj.className=="input2_1"){	//회색바탕 - 필수입력 빨강색
                    	obj.className = "input2";	//흰색바탕 - 필수입력 빨강색
                    } else if(obj.className=="input1"){
                    	obj.className = "input1";
                    } else {
                    	obj.className = "input";    //흰색바탕
                    }
                } else {
                    if (obj.className=="input2"){	//희색바탕 - 필수입력 빨강색
                    	obj.className = "input2_1";	//흰색바탕 - 필수입 빨강??
                    } else if(obj.className=="input"){
                    	obj.className = "input";
                    } else if(obj.className=="input1"){
                    	obj.className = "input1";
                    } else{
                    	obj.className = "input2";   //회색바탕
                    }
                }
                break;

            case "textarea":
                if (bEnable){
                	obj.className = "textarea";
                } else {
                	obj.className = "textarea2";
                }
                break;

			default :
                if (obj.tagName=="IMG") {
                    if (bEnable){
                        obj.style.cursor = "hand";
                        obj.style.filter="";
                    } else {
                        obj.style.cursor = "default";
                        obj.style.filter="progid:DXImageTransform.Microsoft.BasicImage(grayScale=1)";
                    }
                }
        }

    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 인자로 받은 모든 HTML태그(Object)들의 사용 가능/불가능 상태를 변경한다. {@link #ComEnableObject}함수를 이용하여 변경한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComEnableManyObjects(true, txtName, btn_save);  //두번째 인자부터 마지막인자까지 설정된 모든컨트롤을 enable 상태로 변경한다.
 *     ComEnableManyObjects(false, txtName, btn_save); //두번째 인자부터 마지막인자까지 설정된 모든컨트롤을 disable 상태로 변경한다.
 * </pre>
 * @param {bool}   bEnable 필수,사용 가능/불가능 여부를 true/false로 설정한다.
 * @param {object} objs    필수,대상 HTML태그(Object)들로 원하는 개수만큼 여러개 설정한다.
 * @return 없음
 * @see #ComEnableObject
 */
function ComEnableManyObjects(bEnable, objs) {
    try {
        var args = arguments;

        if (args.length < 2) return;
        for(var i=1; i<args.length; i++) {
            if (args[i].tagName != undefined) ComEnableObject(args[i], bEnable);
        } // end for
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 인자로 받은 HTML태그(Object)의 obj.style.display 속성을 변경하여 화면에 표시여부를 변경시킨다. <br>
 * 주로 Tab형태 div 태그를 사용할때 이 함수를 사용한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComShowObject(txtName,  true);   // 결과 : txtName컨트롤을 show한다.
 *     ComShowObject(txtName,  false);  // 결과 : txtName컨트롤을 hide한다.
 * </pre>
 * @param {object} obj     필수,대상 HTML태그(Object)
 * @param {bool}   bShow   필수,표시여부를 true/false로 설정한다.
 * @return 없음
 * @see #ComShowManyObjects
 */
function ComShowObject(obj, bShow) {
    try {
        if (bShow) {
            obj.style.display = "";
        } else {
            obj.style.display = "none";
        }
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 인자로 받은 모든 HTML태그(Object)들의 화면에 표시여부를 변경한다. {@link #ComShowObject}함수를 이용하여 변경한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComShowManyObjects(true, txtName, btn_save);  //두번째 인자부터 마지막인자까지 설정된 모든컨트롤을 show한다.
 *     ComShowManyObjects(false, txtName, btn_save); //두번째 인자부터 마지막인자까지 설정된 모든컨트롤을 hide한다.
 * </pre>
 * @param {bool}   bShow   필수,화면에 표시여부를 true/false로 설정한다.
 * @param {object} objs    필수,대상 HTML태그(Object)들로 원하는 개수만큼 여러개 설정한다.
 * @return 없음
 * @see #ComShowObject
 */
function ComShowManyObjects(bShow, objs) {
    try {
        var args = ComShowManyObjects.arguments;

        if (args.length < 2) return;
        for(var i=1; i<args.length; i++) {
            if (args[i].tagName != undefined) ComShowObject(args[i], bShow);
        } // end for
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 인자로 받은 HTML태그(Object)의 value값을 초기화시킨다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComClearObject(txtName);   // 결과 : text태그의 값은 value=""로 설정한다.
 *     ComClearObject(sltCity);   // 결과 : select태그의 값은 첫번째Item을 선택한다.
 *     ComClearObject(chkYn);     // 결과 : checkbox태그나 radio태그의 체크를 푼다.
 * </pre>
 * @param {object} obj     필수,대상 HTML태그(Object)
 * @return 없음
 * @see #ComClearManyObjects
 */
function ComClearObject(obj) {
    try {
        switch( obj.type ) {
            case "select-one" :
                 obj.selectedIndex='0';
            case "radio" :
            case "checkbox" :
                 obj.checked=false;
                 break;
            case "text" :
            case "password" :
                 obj.value="";
                 break;
            default:
        } // end switch
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 인자로 받은 모든 HTML태그(Object)들의 value값을 초기화시킨다. {@link #ComClearObject}함수를 이용하여 변경한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComClearManyObjects(txtName, btn_save);  //두번째 인자부터 마지막인자까지 설정된 모든컨트롤들의 value값을 초기화시킨다
 * </pre>
 * @param {object} objs    필수,대상 HTML태그(Object)들로 원하는 개수만큼 여러개 설정한다.
 * @return 없음
 * @see #ComClearObject
 * @see #ComResetAll
 */
function ComClearManyObjects(objs) {
    try {
        var args = arguments;

        for(var i=0; i<args.length; i++) {
            if (args[i].tagName != undefined) ComClearObject(args[i]);
        } // end for
    } catch(err) { ComFuncErrMsg(err.message); }
}



/**
 * HTML태그(Object)의 value값이 포멧에 맞는 값인지 확인하고, 포멧에 맞게 구분자를 포함하여 value 값을 변경한다. <br>
 * sFormat 인자값은 다음 중 선택하여 설정하여, 인자를 설정하지 않으면 HTML태그(Object)의 dataformat 속성값을 가져온다. 예를 들어 다음과 같다. <br>
 * &lt;input type="text" name="txtDate" <font color="red">dataformat="ymd"</font>&gt; <br>
 * 위와같이 설정하지 않는다면 sFormat 인자값은 다음과 같이 설정한다. <br>
 * sFormat="ymd"    : 년월일 형태인 "yyyy-mm-dd" 포멧인 경우<br>
 * sFormat="ym"     : 년월 형태인 "yyyy-mm" 포멧인 경우<br>
 * sFormat="hms"    : 시분초 형태인 "hh:mm:ss" 포멧인 경우<br>
 * sFormat="hm"     : 시분 형태인 "hh:mm" 포멧인 경우<br>
 * sFormat="jumin"  : 주민등록번호 형태인 "######-#######" 포멧인 경우<br>
 * sFormat="saupja" : 사업자등록번호 형태인 "###-##-#####" 포멧인 경우<br>
 * sFormat="int"    : 정수 형태인 "#,###" 포멧인 경우<br>
 * sFormat="float"  : 실수 형태인 "#,###.###" 포멧인 경우<br>
 * sFormat="han"    : 키보드 자동 한글 모드, 한글+숫자 입력 가능<br>
 * sFormat="eng"    : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
 * sFormat="engup"  : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
 * sFormat="engdn"  : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
 * sFormat인자값도 설정되고 HTML태그(Object)의 dataformat 속성값도 있다면 sFormat인자값을 포멧으로 생각한다. <br><br>
 * 이 함수와 {@link #ComClearSeparator}함수는 HTML태그의 이벤트에서 다음과 같이 호출하여 사용할 수 있다.<br>
 * &lt;input type="text" name="txtDate" <font color="red">dataformat="ymd" OnBeforeDeactivate="ComAddSeparator(this)" OnBeforeActivate="ComClearSeparator(this)"</font> &gt; <br>
 * <br><b>Example :</b>
 * <pre>
 *     ret = ComAddSeparator(txtDate)       //결과 : txtDate.value="20081101"인 경우 txtDate.value="2008-11-01"로 변경하고, ret=true이다.
 *     &lt;input type="text" name="txtDate" dataformat="ymd" OnBeforeDeactivate="ComAddSeparator(this)" OnBeforeActivate="ComClearSeparator(this)"&gt; //html태그에 설정하는 경우
 * </pre>
 * @param {object} obj     필수,대상 HTML태그(Object)
 * @param {string} sFormat 선택,포멧구분, default=HTML태그(Object)의 dataformat 속성값
 * @returns bool <br>
 *          true  : value값이 포멧에 맞아서 value에 포멧구분자를 포함하여 value값을 변경한 경우<br>
 *          false : value=""이거나 value값이 포멧에 맞지 않아서 값변경 실패한 경우<br>
 *          undefined : sFormat 인자값이 없으면서 HTML태그에 dataformat속성값도 없는 경우<br>
 * @see #ComClearSeparator
 * @see CoCommon#ComGetMaskedValue
 */
function ComAddSeparator(obj, sFormat) {
    try {
        if (ComIsEmpty(obj)) return true;

      //sFormat인자값이 없는 경우 태그의 dataformat 속성값을 가져온다.
        sFormat = getDataFormat(obj, sFormat)
        if (sFormat=="") return true;

        var sResultVal      = ComGetMaskedValue(obj, sFormat);

        if (sResultVal=="") {
        	//?-값이맞지않는경우 sResultVal=""이 되어 obj.value=""이 됨. 이때 값을 지워버려야할지 값을지우지말고 그냥 포커스를 잃지 않고 계속포커스 상태로 두어야할지 몰겠음
            //류현수수석과 협의 하여 값을 지우지 않고 "형식이 맞지 않습니다."라는 경고 메시지 표시 후 포커스를 그대로 두기로 함
        	ComShowMessage("'" + obj.value + "' is not valid. Please enter a valid value");
        	//chrome52 infinite alert bug
            obj.value   = sResultVal;

            //포커스 나갈수 있는 경우 : 이벤트를 통해서 함수가 호출되고, 값이 공백이거나 readonly인 경우
        	var canFocusOut = (ComGetEvent() == obj && (obj.value=="" || obj.getAttribute("readOnly")==true));

        	if(!canFocusOut) {
        		//값이 정확할때 까지 포커스가 나가지 않아야 하는 경우
        		ComJsEventStop();
        		ComSetFocus(obj);
            	//obj.focus(); 
            	//obj.select(); 
            }
            return false;
        } else {
            obj.value   = sResultVal;
            return true;
        }
    } catch(err) { ComFuncErrMsg(err.message); }
    return true;
}

/**
 * HTML태그(Object)의 value값에 포멧구분자를 제거한 값으로 value값을 변경한다. <br>
 * sFormat 인자값은 다음 중 선택하여 설정하여, 인자를 설정하지 않으면 HTML태그(Object)의 dataformat 속성값을 가져온다. 예를 들어 다음과 같다. <br>
 * &lt;input type="text" name="txtDate" <font color="red">dataformat="ymd"</font>&gt; <br>
 * 위와같이 설정하지 않는다면 sFormat 인자값은 다음과 같이 설정한다. <br>
 * sFormat="ymd"    : 년월일 형태인 "yyyy-mm-dd" 포멧인 경우<br>
 * sFormat="ym"     : 년월 형태인 "yyyy-mm" 포멧인 경우<br>
 * sFormat="hms"    : 시분초 형태인 "hh:mm:ss" 포멧인 경우<br>
 * sFormat="hm"     : 시분 형태인 "hh:mm" 포멧인 경우<br>
 * sFormat="jumin"  : 주민등록번호 형태인 "######-#######" 포멧인 경우<br>
 * sFormat="saupja" : 사업자등록번호 형태인 "###-##-#####" 포멧인 경우<br>
 * sFormat="int"    : 정수 형태인 "#,###" 포멧인 경우<br>
 * sFormat="float"  : 실수 형태인 "#,###.###" 포멧인 경우<br>
 * sFormat="han"    : 키보드 자동 한글 모드, 한글+숫자 입력 가능<br>
 * sFormat="eng"    : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
 * sFormat="engup"  : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
 * sFormat="engdn"  : 키보드 자동 영문 모드, 영문+숫자 입력 가능<br>
 * sFormat인자값도 설정되고 HTML태그(Object)의 dataformat 속성값도 있다면 sFormat인자값을 포멧으로 생각한다.<br><br>
 * 이 함수와 {@link #ComAddSeparator}함수는 HTML태그의 이벤트에서 다음과 같이 호출하여 사용할 수 있다.<br>
 * &lt;input type="text" name="txtDate" <font color="red">dataformat="ymd" OnBeforeDeactivate="ComAddSeparator(this)" OnBeforeActivate="ComClearSeparator(this)"</font> &gt; <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComClearSeparator(txtDate)              //txtDate의 사용자정의 속성인 dataformat을 읽어서 다음 결과 처럼 처리함
 *                                             //결과 : txtDate.value="2008-11-01"인 경우 txtDate.value="20081101"로 변경한다.
 *     &lt;input type="text" name="txtDate" <font color="red">dataformat="ymd" OnBeforeDeactivate="ComAddSeparator(this)" OnBeforeActivate="ComClearSeparator(this)"</font>&gt; //html태그에 설정하는 경우
 *
 *     ComClearSeparator(txtDate, "ym", "/")   //결과 : txtDate.value="2008/11"인 경우 txtDate.value="200811"로 변경한다.
 *     ComClearSeparator(txtDate, "",   "-")   //결과 : sFormat이 없어도, sDelim설정만으로도 처리함
 * </pre>
 * @param {object} obj     필수,대상 HTML태그(Object)
 * @param {string} sFormat 선택,포멧구분, default=HTML태그(Object)의 dataformat 속성값
 * @param {string} sDelim  선택,포멧구분, default=sFormat 인자값에 따라 결정
 * @returns 없음 <br>
 * @see #ComAddSeparator
 * @see CoCommon#ComGetUnMaskedValue
 */
function ComClearSeparator(obj,sFormat,sDelim)
{
    try{
        if (typeof(obj) != "object" ) return;

        //sFormat인자값이 없는 경우 태그의 dataformat 속성값을 가져온다.
        sFormat = getDataFormat(obj, sFormat)

         //한영 키보드 조정 - 여기서 조정하는것보다 Tag 안쪽에 적는것이 정확함.
         //<input type="text" name="txtEng"   dataformat="eng"  style="ime-mode:disabled">
/*        switch(sFormat) {
            case "han":
                obj.style.imeMode = "active" ;
                break;
            default:
                obj.style.imeMode = "disabled" ;
                break;
        }*/

        //마스크 구분자가 없는 경우 처리
        sDelim = getFormatDelim(sFormat, sDelim);
        if (sDelim==undefined || sDelim==null || sDelim=="") return;

        if(sFormat == "ymdhms" || sFormat == "ymdhm")
        	obj.value = ComTrimAll(obj.value," ", "-", ":");
        else
        	obj.value = ComTrimAll(obj.value,sDelim);
        
        if (obj.type == 'text' && obj.value.length >=1 && obj.onfocus==null) obj.onfocus = new Function("this.select()");
    } catch(err) { ComFuncErrMsg(err.message); }
    return true;
}


function ComClearSeparatorLen(text ,sFormat)
{
	var returnValue;
    try{
    	//마스크 구분자가 없는 경우 처리
        var sDelim = getFormatDelim(sFormat, sDelim);
        if (sDelim==undefined || sDelim==null || sDelim=="") return text;

        if(sFormat == "ymdhms" || sFormat == "ymdhm")
        	returnValue = ComTrimAll(text," ", "-", ":");
        else
        	returnValue = ComTrimAll(text,sDelim);
        
    } catch(err) { ComFuncErrMsg(err.message); }
    return returnValue;
}


/**
 * HTML태그(Object)의 onKeyPress 이벤트에서 이 함수를 호출할수 있으며, 키보드로 입력되는 값을 숫자만으로 제어한다. <br>
 * 예를 들어 다음과 같이 사용한다.<br>
 *     &lt;input type="text" name="txtAmt" <font color="red">onKeyPress="ComKeyOnlyNumber(this)"</font>&gt; <br>
 * 인자로 사용되는 sSubChar 인자는 숫자이외에 부가적으로 입력할수 있는 문자를 여러개 연결하여 설정한다.<br>
 * <font color="red">주의!</font> style="ime-mode:disabled"은 반드시 설정해야 기능이 정확히 처리된다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     &lt;input type="text" name="txtAmt" onKeyPress="ComKeyOnlyNumber(this)"&gt;
 *     &lt;input type="text" name="txtAmt" onKeyPress="ComKeyOnlyNumber(this, "-")"&gt;
 *     &lt;input type="text" name="txtAmt" onKeyPress="ComKeyOnlyNumber(this, "-.,")"&gt;
 * </pre>
 * @param {object} obj      필수,대상 HTML태그(Object)
 * @param {string} sSubChar 선택,숫자이외의 부가 글자
 * @returns 없음 <br>
 * @see #ComKeyOnlyAlphabet
 */
function ComKeyOnlyNumber(obj,sSubChar)
{
    try {
        var keyValue = ComGetEvent("keycode");

        if(keyValue >= 48 && keyValue <= 57) {//?�자
        	return true;
        } else if(isForEditKey(keyValue)){						//편집에 허용된 키
        	return true;
        } else if(sSubChar != undefined && sSubChar != null && sSubChar.constructor==String && sSubChar.length > 0) {
        	//SubChar가 여러개 설정된 경우 여러개 글자 모두 처리한다.
        	for(var i=0; i<sSubChar.length; i++) {
         		if (keyValue == sSubChar.charCodeAt(i)) {
	                return true;
        		}
        	}
        	ComJsEventStop();
        	return false;
        } else {
        	ComJsEventStop();
        	return false;
        }            
    } catch(err) { ComFuncErrMsg(err.message); }
    return true;
}

/**
 * HTML태그(Object)의 onKeyPress 이벤트에서 이 함수를 호출할수 있으며, 키보드로 입력되는 값을 영문대문자 또는 영문소문자로 자동 변경 제어한다. <br>
 * 예를 들어 다음과 같이 사용한다.<br>
 *     &lt;input type="text" name="txtName" <font color="red">style="ime-mode:disabled" onKeyPress="ComKeyOnlyAlphabet('upper')"</font>&gt; <br>
 * 인자로 사용되는 sFlag 인자의 설정값은 다음과 같다. <br>
 * sFlag = "upper"      : 영문대문자만 입력할수 있고, 대문자로 자동 변환된다. <br>
 * sFlag = "lower"      : 영문소문자만 입력할수 있고, 소문자로 자동 변환된다. <br>
 * sFlag = "uppernum"   : 영문대문자와 숫자만 입력할수 있고, 대문자로 자동 변환된다. <br>
 * sFlag = "lowernum"   : 영문소문자와 숫자만 입력할수 있고, 소문자로 자동 변환된다. <br>
 * sFlag = "num"        : 영문과 숫자 입력할수 있고, 자동 변환없이 그대로 표시한다. <br>
 * sFlag = 설정안한경우 : 영문만 입력할수 있고, 자동변환없이 그대로 표시한다. <br>
 * <font color="red">주의!</font> style="ime-mode:disabled"은 반드시 설정해야 기능이 정확히 처리된다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComKeyOnlyAlphabet('lower');
 *     ComKeyOnlyAlphabet('uppernum',"32|64");    //스페이스와 @문자 입력도 입력가능
 * </pre>
 * @param {string} sFlag 선택,영문모드, default=""
 * @param {string} KeyCodes 선택,예외  키코드, default=""
 * @returns 없음 <br>
 * @see #ComKeyOnlyNumber
 */
function ComKeyOnlyAlphabet(sFlag, KeyCodes)
{
    try {
        var keyValue = ComGetEvent("keycode");
        var keyValue2 = keyValue;
        var bCanNum  = false;
        var flag = false;

        if (sFlag==undefined || sFlag==null || sFlag.constructor!=String) sFlag="";
        sFlag = sFlag.toLowerCase();
        if (KeyCodes==undefined || KeyCodes==null) flag=false;
        else{
            var KeyArray = KeyCodes.split("|");
            for(var i =0;i<KeyArray.length;i++){
            	if(KeyArray[i] == keyValue) flag = true;
            }
        }
        
        if (sFlag.length >= 3){
            if (sFlag.substr(sFlag.length-3)=="num") bCanNum=true;
            if (sFlag.length > 5) sFlag = sFlag.substr(0,5);
        }
        if(keyValue >= 97 && keyValue <= 122){                  //소문자
            if (sFlag=="upper") keyValue2 = keyValue + 65 - 97;
        } else if(keyValue >= 65 && keyValue <= 90){            //대문자
            if (sFlag=="lower") keyValue2 = keyValue + 97 - 65;
        } else if(bCanNum && keyValue >= 48 && keyValue <= 57) {//숫자
        } else if(isForEditKey(keyValue)){						//편집에 허용된 키
        } else if(flag) {									    //예외문자
        } else {
        	ComJsEventStop();
        	return false;
        }
        if (keyValue!=keyValue2){
        	event.keyCode = keyValue2;
        	event.which = keyValue2;
        	event.charCode = keyValue2;
        }
        
        return true;
    } catch(err) { ComFuncErrMsg(err.message); }
}

/*
 * 이 함수는 axon_event.addListenerFormat('keyup', 'ComEditFormating', formObj); 방식으로 호출하여 사용해야 한다.
 * <input style="ime-mode:disabled">와 같이 ime-mode를 반드시 설정할것을 권장한다. IE와 FireFox는 처리되나 Chrome와 Safari는 ime-mode가 처리되지 않지만 설정할것을 권장한다.
 * <input dataformat="">와 같이 dataformat이 있는 유형들에 편집시 자동 포멧을 지원한다.
 */

var org_value="";
var intMaxLenFlag = true;
function ComChkHanFormating(){
	// ctrl key then  kydown => keypress => keyup
	if(ComGetEvent("ctrlKey")) return true; 
	var obj = ComGetEvent();  //keydown object ( ex : input object , textarea object )

	if (obj.readOnly || obj.isDisabled) {  // readonly or disable then event stop
		if(ComGetEvent("keycode") == 8 || ComGetEvent("keycode") == 46){  // 8 backspace , 46 delete 
			ComJsEventStop();  //event stop : keypress , keyup doesnt work
		}
		return true;
	}
	
	var ogr_length = obj.value.length;   // obj length
	var sFormat = ComGetEvent("dataformat"); 
	var start = obj.selectionStart;     // marking select start
	var end = obj.selectionEnd;			// marking select end
	
	
	if("exceptengdn" == sFormat){
		return true;
	}

	//obj.style.imeMode = (sFormat=="han")?"active":"disabled" ;
	
	if(ComGetEvent("keycode") == 229 ){ // korea lang(han)
		var sOther  = ComGetEvent("otherchar");
		var sFormat = ComGetEvent("dataformat");
		var retValue = obj.value;
		var chkValue = ComMakeDataFormat (sFormat , sOther , retValue , obj);
		//console.log(chkValue);
    	if ( retValue !=  chkValue){
    		obj.value = chkValue;
    		retValue = chkValue;
    	}
    	
		ComJsEventStop();
		return false;
	}

	var srcCharValue = "";   // 마킹된 부분을 제외한 값 
	if(start != end ){
		srcCharValue = obj.value.substring(0,start) +obj.value.substring(end);  // marking (select)??부분을 ?�외??�?
	} else {
		if( ComGetEvent("keycode") == 46){  // delete keydown
			srcCharValue = obj.value.substring(0,start) +obj.value.substring(start+1); // 커서?�치?�서 ?�른�??�나 ??��			
		} else {
			srcCharValue = obj.value.substring(0,start-1) +obj.value.substring(start); 
		}
	}
	
	if ( ComGetEvent("shiftKey") && keyValue>=37 && keyValue<=40) {  // sheet and 방향??( marking 기능 ) ?�때 ?�벤???�상 ?�행
		return true;
	}

	if(ComGetEvent("keycode") == 8 || ComGetEvent("keycode") == 46){  // ??�� 백스?�이??
		
		switch(sFormat){
	        case "int":
				var retValue=srcCharValue.replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');  // 3?�리�?, 찍기
	        	if (obj.value!=retValue)  obj.value=retValue;

	    		if( ComGetEvent("keycode") == 46){ 
	    			obj.setSelectionRange(start,start);
	    		} else {
		        	if(obj.value.length == ogr_length-1){ // , 가 변?�하면서 ?�치 찾기 ( , + delete or backspace )
		    			obj.setSelectionRange(start-1,start-1);
		        	} else {
		    			obj.setSelectionRange(start-2,start-2);
		        	}
	    		}
	        	break;
	        	
	        case "singledfloat":  //숫자+".-"	for Bkg
	        case "singledFloat":  //숫자+".-"	for Bkg
	        case "float":   //#,###.###
	        case "pointnum":
	        	var retValue = srcCharValue;
	        	if (retValue.length > 1 && retValue.substring(0,1)=="-") {
	        		bSign=true;
	        		retValue = retValue.substring(1);
	        	}
	        	//여기에 break를 넣지않고 float의 기능을 그대로 사용한다.
	        	var pointCnt = ComGetEvent("pointcount");
	        	if (pointCnt== undefined) pointCnt = 0;
	        	pointCnt = ComParseInt(pointCnt);
	        	if(retValue.indexOf(".") < 0) {
	        		//소숫점 윗자리 길이 처리
	            	var iMaxLength = obj.getAttribute("maxLength");
	            	if(iMaxLength != null){
	            		iMaxLength -= pointCnt+1;
	            		if (retValue.length > iMaxLength) {
	            			retValue = retValue.substring(0, iMaxLength);
	            		}	            		
	            	}
            		if(sFormat == "pointnum"){
            			retValue=retValue.replace(/[^0-9]/gi,'');
            		} else{
            			retValue=retValue.replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            		}
	        		
	        	} else{
	        		var arr = retValue.split(".");
	        		
	        		//소숫점 윗자리 길이 처리
	            	var iMaxLength = obj.getAttribute("maxLength");
	            	if(iMaxLength != null){
	            		iMaxLength -= pointCnt+1;
	            		if (arr[0].length > iMaxLength) {
	            			arr[0] = arr[0].substring(0, iMaxLength);
	            		}	            		
	            	}
	            	
            		if(sFormat == "pointnum"){
            			arr[0] = arr[0].replace(/[^0-9]/gi,'');
            		} else {
            			arr[0] = arr[0].replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            		}
	        		arr[1] = arr[1].replace(/[^0-9]/gi,'');
	        		
	        		//소숫점이 2개이상 나오는 경우
	            	if (retValue.indexOf(".") != retValue.lastIndexOf(".")) {
	            		for(idx=2; idx<arr.length; idx++){
	            			arr[1] += arr[idx].replace(/[^0-9]/gi,'');
	            		}
	            	}
	
	
	
	            	//소숫점 아랫자리값  길이 처리
	                if (pointCnt > 0 && arr[1].length > pointCnt) {
	                	arr[1] = arr[1].substring(0, pointCnt)
	                }
	                                    
	            	retValue = arr[0] + "." + arr[1];
	        	}
	        	
	        	retValue = ((bSign)?"-":"") + retValue;
	        	
	        	
	        	if (obj.value!=retValue)  obj.value=retValue;
	        	
	    		if( ComGetEvent("keycode") == 46){ 
	    			obj.setSelectionRange(start,start);
	    		} else {
		        	if(obj.value.length == ogr_length-1){ // , 가 변동하면서 위치 찾기 ( , + delete or backspace )
		    			obj.setSelectionRange(start-1,start-1);
		        	} else {
		    			obj.setSelectionRange(start-2,start-2);
		        	}
	    		}
	        	break;
	        default:
	        	if (obj.value!=retValue){
	        		obj.value=srcCharValue;
		    		if( ComGetEvent("keycode") == 46){ 
		    			obj.setSelectionRange(start,start);
		    		} else {
		    			obj.setSelectionRange(start-1,start-1);
		    		}
	        	}
	        	break;
		}
		
		ComJsEventStop();
		return true;
	}

	//편집에 허용된 키(방향키, Backspace키 등)인 경우 포멧을 처리하지 않는다.
	if(isForEditKey(ComGetEvent("keycode"))){
		return true;
	}

	var sFormat = ComGetEvent("dataformat");
	var sOther  = ComGetEvent("otherchar");
	if (sFormat=="") return true;

	var intCount = 0 ;
	
	if(sFormat == "int"){  // dataformt 이 int 일때 , 가  maxlen  에 여향을 미치므로 maxlen 을 늘려줍니다. blur에서 다시 줄여줍니다. 
		if(intMaxLenFlag){
			//console.log("before = " + obj.getAttribute("maxLength"));
			intCount = parseInt(obj.getAttribute("maxLength")/4);
			obj.setAttribute("maxLength" , parseInt(obj.getAttribute("maxLength"))+intCount);
			//console.log("edit = " + obj.getAttribute("maxLength"));
			intMaxLenFlag = false;
		}
	}

	
	if(obj.getAttribute("maxLength") != null) {
		if (obj.value.length >= obj.getAttribute("maxLength")){
			if( start == end){
				ComJsEventStop();
				return true;
			} 
		}
	}
	
	var start = obj.selectionStart;
	var end = obj.selectionEnd;
	var assiCode = "";
	// KeyPad num 입력
	if(ComGetEvent("keycode")>=96 && ComGetEvent("keycode")<=105){
		assiCode = ComGetEvent("keycode")-48;
	} else {
		assiCode = ComGetEvent("keycode");
	}
	
	var keyValue = String.fromCharCode(assiCode);

	//console.log(keyValue + "           "+ ComGetEvent("keycode") );
	var askeyCode = getAsKeyCode(ComGetEvent("keycode"));
	if(askeyCode != ""){
		keyValue = askeyCode;
	}
	
	var retValue = keyValue;

	var iMaxLen = -1;
	var bSign = false;
	
	if (sOther==undefined) sOther = "";		

	switch(sFormat){
        case "engup":   //영문대문자 + 숫자
        	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
        	retValue=retValue.replace(re, '').toUpperCase();
        	break;
        	
        case "engdn":	//영소문자 + 숫자
        	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
        	retValue=retValue.replace(re, '').toLowerCase();
        	break;
        	
        case "eng":		//영문 + 숫자
        	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
        	retValue=retValue.replace(re, '');
        	break;
        	
        case "enguponly":   //영문대문자만 (숫자제외)
        	re = new RegExp("[^a-z" + sOther + "]", "gi");
        	retValue=retValue.replace(re, '').toUpperCase();
        	break;
        	
        case "engupetc":  // 문대문자 + 숫자 + 기호
        case "excepthan":  //한글만 제외하고 모두 입력
        	if(assiCode == 229){
        		retValue = "";
        	}
        	break;
        	
		case "ymd":		//yyyy-mm-dd 10
			retValue=retValue.replace(/[^0-9]/gi,'');
			break;    	            
        case "ym":		//yyyy-mm 7
        case "yw":		//yyyy-mm 7
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;    	            
		case "mdy":		//mm-dd-yyyy 10
			retValue=retValue.replace(/[^0-9]/gi,'');
			break;    	            
        case "yyyy":     //yyyy 4
			retValue=retValue.replace(/[^0-9]/gi,'');
			break;
        case "hms":     //hh:mm:ss 8
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;    	            
        case "hm":      //hh:mm 5
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;
        case "ymdhms":     //yyyy-mm-dd hh:mm:ss 19
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;    	            
        case "ymdhm":     //yyyy-mm-dd hh:mm 16
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;
			
        case "jumin":   //######-####### 14
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;
        case "saupja":  //###-##-##### 12
        	retValue=retValue.replace(/[^0-9]/gi,'');
			break;    	            

        case "num":	//only number
        	re = new RegExp("[^0-9" + sOther + "]", "gi");
        	retValue=retValue.replace(re, '');
        	break;
        	
        case "int":     //#,###            	
			retValue=retValue.replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
			break;
        case "pointnum":
        	retValue=retValue.replace(/[^0-9.]/gi,'');
			if(obj.value.indexOf(".") > 0 && retValue == ".") {
        		ComJsEventStop();
        	}
        	break;
        case "singledfloat":  //숫자+".-"	for Bkg
        case "singledFloat": 
        	var singledflag = false;
        	// 현재 입력한 처음 자리가 - 일 경우 패스
        	if (start == 0 && retValue=="-") {
        		return true;
        	}
        	// 현재 값이 음수일때 
        	if (obj.value.length > 1 && obj.value.substring(0,1)=="-") {
        		singledflag = true;
        	}
        	
        	if(singledflag ||obj.value.length > 0){
        		retValue=retValue.replace(/[^0-9.]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
        	} else {
        		retValue=retValue.replace(/[^0-9.]/gi,'-').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
        	}

			if(obj.value.indexOf(".") > 0 && retValue == ".") {
        		ComJsEventStop();
        	}        	
        	break;
        	//여기에 break를 넣지않고 float의 기능을 그대로 사용한다.
        case "float":   //#,###.###
        	retValue=retValue.replace(/[^0-9.]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
			if(obj.value.indexOf(".") > 0 && retValue == ".") {
        		ComJsEventStop();
        	}
        	
        	break;

	}

	if (retValue != "")  return true;
	else{
		ComJsEventStop();
	}
	
}

function ComSetOrgValue(){
	var obj = ComGetEvent();
	org_value = ComTrim(obj.value);
	//obj.setSelectionRange(0,org_value.length);
}

//blur 이벤트
function ComCheckDataFormat(){ 
	mousedownObj = ""; // mousedonw 전역변수 초기화
	var obj = ComGetEvent();
	var sFormat = ComGetEvent("dataformat");
	
	var intCount = 0 ;
	
	if(sFormat == "int"){ // dataformt 이 int 일때 , 가  maxlen  에 여향을 미치므로 maxlen 늘린것을 줄여줌
		if(!intMaxLenFlag){
			intMaxLenFlag = true;
			intCount = parseInt(obj.getAttribute("maxLength")/4);
			obj.setAttribute("maxLength" , parseInt(obj.getAttribute("maxLength"))-intCount);
			//console.log( "blur ="+obj.getAttribute("maxLength"))
		}
	} else if (sFormat == "singledfloat" || sFormat =="singledFloat"){
		obj.value = ComReplaceStr(obj.value , "-.","-") 
		if( obj.value == "-") {
			obj.value ="";
		} 
	}
		
	var obj_id = ComGetEvent("id");
	if(navigator.userAgent.indexOf("Chrome") >0 ){
		ComChkObjValid(obj, true, false, false);
	}  
	
	if(obj_id != "" && blurflag ){
		ComChkObjValid(obj, true, false, false);
		if( org_value != obj.value){
			ComFireEvent(obj , "change");
		}
	}
	blurflag = true;
}

function ComChkNextFocus(){
    try {
    	//console.log("keyup");
    	
    	var obj = ComGetEvent();
    	//obj.value = obj.value.replace(/[\???�ㅏ-?��?-??/g, '');
    	if(ComGetEvent("keycode") == 8 || ComGetEvent("keycode") == 46){
    		ComJsEventStop();
    		return true;
    	}
		// ctrl + V(v)
    	if(ComGetEvent("ctrlKey") &&  ( ComGetEvent("keycode") == 86 || ComGetEvent("keycode") == 17) ){
    		ComFireEvent(obj , "keypress");
    		//ComChkObjValid(obj, true, false, false);
    		return true;
    	}

		var sOther  = ComGetEvent("otherchar");
		var sFormat = ComGetEvent("dataformat");
		var retValue = obj.value;
		var chkValue = ComMakeDataFormat (sFormat , sOther , retValue , obj);
		//console.log(chkValue);
    	if ( retValue !=  chkValue){
    		obj.value = chkValue;
    		retValue = chkValue;
    	}
    	//편집에 허용된 키(방향키, Backspace키 등)인 경우 포멧을 처리하지 않는다.
		if(isForEditKey(ComGetEvent("keycode"))) return true;
		
    	var sFormat = ComGetEvent("dataformat");
		var retValue = obj.value;

		if(obj.getAttribute("maxLength") == null) {
			return true;
		}
		if( obj.getAttribute("nextstop") == ""){
			return true;
		} 

		if (retValue.length >= obj.getAttribute("maxLength")){
			ComSetNextFocus();
			//ComFireEvent(obj , "keyup");
		}

    } catch(err) { ComFuncErrMsg(err.message); }
    return true;
}

function ComEditFormating(){
    try {
    	//if(ComGetEvent("ctrlKey")) return true; 
        //편집에 허용된 키(방향키, Backspace키 등)인 경우 포멧을 처리하지 않는다.
		if(isForEditKey(ComGetEvent("keycode"))) return true;
    	
    	var obj = ComGetEvent();
    	
    	var ogr_length = obj.value.length;
    	var sFormat = ComGetEvent("dataformat");
    	if(ComGetEvent("keycode") == 8 || ComGetEvent("keycode") == 46){
    		ComJsEventStop();
    		return true;
    	}
    	
		if (obj.readOnly || obj.isDisabled) return true;

		var sFormat = ComGetEvent("dataformat");
		var sOther  = ComGetEvent("otherchar");
		if (sFormat=="") return true;
		
		var start = obj.selectionStart;
		var end = obj.selectionEnd;

		var keyValue = "";
		  
		if(typeof ComGetEvent("keycode") != "undefined") {
			keyValue = String.fromCharCode(ComGetEvent("keycode"));	// Ctrl+V 사용시 Ascii '0' 들어가는 문제 처리
		}

		if(start != end ){
			srcCharValue = obj.value.substring(0,start)+ keyValue +obj.value.substring(end);
			
		} else {
			srcCharValue = obj.value.substring(0,start)+ keyValue +obj.value.substring(start);
		}
		
		var retValue = srcCharValue;

		var iMaxLen = -1;
		var bSign = false;
		
		//obj.style.imeMode = (sFormat=="han")?"active":"disabled" ;
		if (sOther==undefined) sOther = "";		

		switch(sFormat){
			case "exceptengdn":
				retValue=srcCharValue.toUpperCase();
				break;
	        case "engup":  //영문대문자 + 숫자
	        	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
	        	retValue=srcCharValue.replace(re, '').toUpperCase();
	        	break;
	        	
	        case "engdn":	//영소문자 + 숫자
	        	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
	        	retValue=srcCharValue.replace(re, '').toLowerCase();
	        	break;
	        	
	        case "eng":		//영문 + 숫자
	        	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
	        	retValue=srcCharValue.replace(re, '');
	        	break;
	        	
	        case "enguponly":   //영문대문자만 (숫자제외)
	        	re = new RegExp("[^a-z" + sOther + "]", "gi");
	        	retValue=srcCharValue.replace(re, '').toUpperCase();
	        	break;

	        case "engupetc":  //영문대문자 + 숫자 + 기호
	        	re = new RegExp("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]", "gi");
	        	retValue=srcCharValue.replace(re, '').toUpperCase();
	        	break;
	        	
	        case "excepthan":  //한글만 제외하고 모두 입력
	        	re = new RegExp("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]", "gi");
	        	retValue=srcCharValue.replace(re, '');
	        	break;
	        	
			case "ymd":		//yyyy-mm-dd 10
				iMaxLen = 10;
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<4) retValue = srcCharValue;
				if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
				if (iLen<6) retValue += srcCharValue.substring(4);
				if (iLen>=6) retValue += srcCharValue.substring(4,6) + "-";
				if (iLen>6) retValue += srcCharValue.substring(6);
				break;    	            
            case "ym":		//yyyy-mm 7
            case "yw":		//yyyy-mm 7
            	iMaxLen = 7; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<4) retValue = srcCharValue;
				if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
				if (iLen>4) retValue += srcCharValue.substring(4);
				break;    	            
			case "mdy":		//mm-dd-yyyy 10
				iMaxLen = 10;
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<2) retValue = srcCharValue;
				if (iLen>=2) retValue = srcCharValue.substring(0,2) + "-";
				if (iLen<4) retValue += srcCharValue.substring(2);
				if (iLen>=4) retValue += srcCharValue.substring(2,4) + "-";
				if (iLen>4) retValue += srcCharValue.substring(4);
				break;    	            
            case "yyyy":     //yyyy 4
            	iMaxLen = 4; 
				retValue=srcCharValue.replace(/[^0-9]/gi,'');
				break;
            case "hms":     //hh:mm:ss 8
            	iMaxLen = 8; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<2) retValue = srcCharValue;
				if (iLen>=2) retValue = srcCharValue.substring(0,2) + ":";
				if (iLen<4) retValue += srcCharValue.substring(2);
				if (iLen>=4) retValue += srcCharValue.substring(2,4) + ":";
				if (iLen>4) retValue += srcCharValue.substring(4);
				break;    	            
            case "hm":      //hh:mm 5
            	iMaxLen = 5; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<2) retValue = srcCharValue;
				if (iLen>=2) retValue = srcCharValue.substring(0,2) + ":";
				if (iLen>2) retValue += srcCharValue.substring(2);
				break;
            case "ymdhms":     //yyyy-mm-dd hh:mm:ss 19
            	iMaxLen = 19; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<4) retValue = srcCharValue;
				if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
				if (iLen<6) retValue += srcCharValue.substring(4);
				if (iLen>=6) retValue += srcCharValue.substring(4,6) + "-";
				if (iLen<8) retValue += srcCharValue.substring(6);
				if (iLen>=8) retValue += srcCharValue.substring(6,8) + " ";
				if (iLen<10) retValue += srcCharValue.substring(8);
				if (iLen>=10) retValue += srcCharValue.substring(8,10) + ":";
				if (iLen<12) retValue += srcCharValue.substring(10);
				if (iLen>=12) retValue += srcCharValue.substring(10,12) + ":";				
				if (iLen>12) retValue += srcCharValue.substring(12);
				break;    	            
            case "ymdhm":     //yyyy-mm-dd hh:mm 16
            	iMaxLen = 16; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<4) retValue = srcCharValue;
				if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
				if (iLen<6) retValue += srcCharValue.substring(4);
				if (iLen>=6) retValue += srcCharValue.substring(4,6) + "-";
				if (iLen<8) retValue += srcCharValue.substring(6);
				if (iLen>=8) retValue += srcCharValue.substring(6,8) + " ";
				if (iLen<10) retValue += srcCharValue.substring(8);
				if (iLen>=10) retValue += srcCharValue.substring(8,10) + ":";
				if (iLen>10) retValue += srcCharValue.substring(10);
				break;
				
            case "jumin":   //######-####### 14
            	iMaxLen = 14; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<6) retValue = srcCharValue;
				if (iLen>=6) retValue = srcCharValue.substring(0,6) + "-";
				if (iLen>6) retValue += srcCharValue.substring(6);
				break;
            case "saupja":  //###-##-##### 12
            	iMaxLen = 12; 
				srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
				iLen = srcCharValue.length;
				if (iLen<3) retValue = srcCharValue;
				if (iLen>=3) retValue = srcCharValue.substring(0,3) + "-";
				if (iLen<5) retValue += srcCharValue.substring(3);
				if (iLen>=5) retValue += srcCharValue.substring(3,5) + "-";
				if (iLen>5) retValue += srcCharValue.substring(5);
				break;    	            

            case "num":	//only number
	        	re = new RegExp("[^0-9" + sOther + "]", "gi");
	        	retValue=srcCharValue.replace(re, '');
            	break;
            	
            case "int":     //#,###            	
				retValue=srcCharValue.replace(/[^0-9.]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            	if(retValue.indexOf(".") >= 0) {
            		//소숫점 아랫자리가 있는경우 없애기
            		retValue = retValue.split(".")[0];
            	}
				break;
            case "singledfloat":  //숫자+".-"	for Bkg
            case "singledFloat":  //숫자+".-"	for Bkg
            	if(retValue.indexOf("-.") > 0) {
            		bSign=true;
            		retValue = retValue.substring(2);
            	}  else if (retValue.length > 1 && retValue.substring(0,1)=="-") {
            		bSign=true;
            		retValue = retValue.substring(1);
            	}
            	//여기에 break를 넣지않고 float의 기능을 그대로 사용한다.
            case "pointnum":  // ####.##
            case "float":   //#,###.###
            	var pointCnt = ComGetEvent("pointcount");
            	if (pointCnt== undefined) pointCnt = 0;
            	pointCnt = ComParseInt(pointCnt);
            	if(retValue.indexOf(".") < 0) {
            		//소숫점 윗자리 길이 처리
	            	var iMaxLength = obj.getAttribute("maxLength");
	            	if(iMaxLength != null){
	            		iMaxLength -= pointCnt+1;
	            		if (retValue.length > iMaxLength) {
	            			retValue = retValue.substring(0, iMaxLength);
	            		}	            		
	            	}
	            	
            		if(sFormat == "pointnum"){
            			retValue=retValue.replace(/[^0-9]/gi,'');
            		} else {
            			retValue=retValue.replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            		}
            		
            	} else{
            		var arr = retValue.split(".");
            		//소숫점 윗자리 길이 처리
	            	var iMaxLength = obj.getAttribute("maxLength");
	            	if(iMaxLength != null){
	            		iMaxLength -= pointCnt+1;
	            		if (arr[0].length > iMaxLength) {
	            			arr[0] = arr[0].substring(0, iMaxLength);
	            		}	            		
	            	}
	            	
            		if(sFormat == "pointnum"){
            			arr[0] = arr[0].replace(/[^0-9]/gi,'');
            		} else {
            			arr[0] = arr[0].replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
            		}
            		arr[1] = arr[1].replace(/[^0-9]/gi,'');
            		
            		//소숫점이 2개이상 나오는 경우
                	if (retValue.indexOf(".") != retValue.lastIndexOf(".")) {
                		for(idx=2; idx<arr.length; idx++){
                			arr[1] += arr[idx].replace(/[^0-9]/gi,'');
                		}
                	}

                	//소숫점 아랫자리값  길이 처리
                    if (pointCnt > 0 && arr[1].length > pointCnt) {
                    	arr[1] = arr[1].substring(0, pointCnt)
                    }
                                        
                	retValue = arr[0] + "." + arr[1];
            	}
            	
            	retValue = ((bSign)?"-":"") + retValue;
            	
            	break;
		}

		
		if (iMaxLen > 0) {
			if (obj.getAttribute("maxLength")<iMaxLen) obj.setAttribute("maxLength",iMaxLen);
			if (ComChkLenByByte(retValue, iMaxLen)==0) retValue = retValue.substring(0, iMaxLen);
		}
		
		if (obj.value!=retValue)  obj.value=retValue;
		
		//obj.setSelectionRange(start+1,start+1);
		switch(sFormat){
		    case "engup":   //영문대문자 + 숫자
	        case "engdn":	//영소문자 + 숫자
	        case "eng":		//영문 + 숫자
	        case "enguponly":   //영문대문자만 (숫자제외)
	        case "engupetc":   //영문대문자 + 숫자 + 기호
	        case "excepthan":  //한글만 제외하고 모두 입력
	        case "yyyy":     //yyyy 4
	        case "num":
	        case "exceptengdn":
	        	obj.setSelectionRange(start+1,start+1);
	    		break;
	        case "int":
	        case "singledfloat":  //숫자+".-"	for Bkg
	        case "singledFloat":  //숫자+".-"	for Bkg
	        case "float":   //#,###.###
	        case "ymd":     //yyyy-mm-dd
	        case "ymdhms":     //yyyy-mm-dd hh:mm:ss
	        case "ymdhm":     //yyyy-mm-dd hh:mm
	        case "mdy":     //mm-dd-yyyy
	        case "ym":      //yyyy-mm
	        case "yw":      //yyyy-ww
	        case "yyyy":      //yyyy
	        case "hms":     //hh:mm:ss
	        case "hm":      //hh:mm
	        	if(obj.value.length > ogr_length+1){
	        		obj.setSelectionRange(start+2,start+2);
	        	} else {
	        		obj.setSelectionRange(start+1,start+1);
	        	}
	        	
	        	break;
		}
		if(obj.getAttribute("maxLength") == null) {

			ComJsEventStop();
			return true;
		}
		if (retValue.length >= obj.getAttribute("maxLength")){
			//float인 경우 "1234."인 상태로 체크할때 문자게 발생할 수 있으므로 제외함
			if (!(sFormat=="float" && retValue.substring(retValue.length-1)==".")) {
				if (ComChkObjValid(obj, true, false, false)){} 
			}
		}
    } catch(err) { ComFuncErrMsg(err.message); }
	
    ComJsEventStop();
    return true;
}


function ComMakeDataFormat(sFormat , sOther , srcCharValue , obj){
	var retValue;
	var bSign = false;
	switch(sFormat){
		case "exceptengdn":
			retValue=srcCharValue.toUpperCase();
			break;
	    case "engup":   //영문대문자 + 숫자
	    	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
	    	retValue=srcCharValue.replace(re, '').toUpperCase();
	    	break;
	    	
	    case "engdn":	//영소문자 + 숫자
	    	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
	    	retValue=srcCharValue.replace(re, '').toLowerCase();
	    	break;
	    	
	    case "eng":		//영문 + 숫자
	    	re = new RegExp("[^a-z0-9" + sOther + "]", "gi");
	    	retValue=srcCharValue.replace(re, '');
	    	break;
	    	
	    case "enguponly":   //영문대문자만 (숫자제외)
	    	re = new RegExp("[^a-z" + sOther + "]", "gi");
	    	retValue=srcCharValue.replace(re, '').toUpperCase();
	    	break;
	    	
	    case "engupetc":   //영문대문자 + 숫자 +기호
	    	re = new RegExp("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]", "gi");
	    	retValue=srcCharValue.replace(re, '').toUpperCase();
	    	break;
	    	
	    case "excepthan":  //한글만 제외하고 모두 입력
	    	re = new RegExp("[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]", "gi");
	    	retValue=srcCharValue.replace(re, '');
	    	break;
	    	
		case "ymd":		//yyyy-mm-dd 10
			iMaxLen = 10;
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<4) retValue = srcCharValue;
			if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
			if (iLen<6) retValue += srcCharValue.substring(4);
			if (iLen>=6) retValue += srcCharValue.substring(4,6) + "-";
			if (iLen>6) retValue += srcCharValue.substring(6);
			break;    	            
	    case "ym":		//yyyy-mm 7
	    case "yw":		//yyyy-mm 7
	    	iMaxLen = 7; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<4) retValue = srcCharValue;
			if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
			if (iLen>4) retValue += srcCharValue.substring(4);
			break;    	            
		case "mdy":		//mm-dd-yyyy 10
			iMaxLen = 10;
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<2) retValue = srcCharValue;
			if (iLen>=2) retValue = srcCharValue.substring(0,2) + "-";
			if (iLen<4) retValue += srcCharValue.substring(2);
			if (iLen>=4) retValue += srcCharValue.substring(2,4) + "-";
			if (iLen>4) retValue += srcCharValue.substring(4);
			break;    	            
	    case "yyyy":     //yyyy 4
	    	iMaxLen = 4; 
			retValue=srcCharValue.replace(/[^0-9]/gi,'');
			break;
	    case "hms":     //hh:mm:ss 8
	    	iMaxLen = 8; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<2) retValue = srcCharValue;
			if (iLen>=2) retValue = srcCharValue.substring(0,2) + ":";
			if (iLen<4) retValue += srcCharValue.substring(2);
			if (iLen>=4) retValue += srcCharValue.substring(2,4) + ":";
			if (iLen>4) retValue += srcCharValue.substring(4);
			break;    	            
	    case "hm":      //hh:mm 5
	    	iMaxLen = 5; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<2) retValue = srcCharValue;
			if (iLen>=2) retValue = srcCharValue.substring(0,2) + ":";
			if (iLen>2) retValue += srcCharValue.substring(2);
			break;
	    case "ymdhms":     //yyyy-mm-dd hh:mm:ss 19
	    	iMaxLen = 19; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<4) retValue = srcCharValue;
			if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
			if (iLen<6) retValue += srcCharValue.substring(4);
			if (iLen>=6) retValue += srcCharValue.substring(4,6) + "-";
			if (iLen<8) retValue += srcCharValue.substring(6);
			if (iLen>=8) retValue += srcCharValue.substring(6,8) + " ";
			if (iLen<10) retValue += srcCharValue.substring(8);
			if (iLen>=10) retValue += srcCharValue.substring(8,10) + ":";
			if (iLen<12) retValue += srcCharValue.substring(10);
			if (iLen>=12) retValue += srcCharValue.substring(10,12) + ":";				
			if (iLen>12) retValue += srcCharValue.substring(12);
			break;    	            
	    case "ymdhm":     //yyyy-mm-dd hh:mm 16
	    	iMaxLen = 16; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<4) retValue = srcCharValue;
			if (iLen>=4) retValue = srcCharValue.substring(0,4) + "-";
			if (iLen<6) retValue += srcCharValue.substring(4);
			if (iLen>=6) retValue += srcCharValue.substring(4,6) + "-";
			if (iLen<8) retValue += srcCharValue.substring(6);
			if (iLen>=8) retValue += srcCharValue.substring(6,8) + " ";
			if (iLen<10) retValue += srcCharValue.substring(8);
			if (iLen>=10) retValue += srcCharValue.substring(8,10) + ":";
			if (iLen>10) retValue += srcCharValue.substring(10);
			break;
			
	    case "jumin":   //######-####### 14
	    	iMaxLen = 14; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<6) retValue = srcCharValue;
			if (iLen>=6) retValue = srcCharValue.substring(0,6) + "-";
			if (iLen>6) retValue += srcCharValue.substring(6);
			break;
	    case "saupja":  //###-##-##### 12
	    	iMaxLen = 12; 
			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
			iLen = srcCharValue.length;
			if (iLen<3) retValue = srcCharValue;
			if (iLen>=3) retValue = srcCharValue.substring(0,3) + "-";
			if (iLen<5) retValue += srcCharValue.substring(3);
			if (iLen>=5) retValue += srcCharValue.substring(3,5) + "-";
			if (iLen>5) retValue += srcCharValue.substring(5);
			break;    	            
	
	    case "num":	//only number
	    	re = new RegExp("[^0-9" + sOther + "]", "gi");
	    	retValue=srcCharValue.replace(re, '');
	    	break;
	    	
	    case "int":     //#,###            	
			retValue=srcCharValue.replace(/[^0-9.]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
	    	if(retValue.indexOf(".") >= 0) {
	    		//소숫점 아랫자리가 있는경우 없애기
	    		retValue = retValue.split(".")[0];
	    	}
			break;
	    case "singledfloat":  //?�자+".-"	for Bkg
	    case "singledFloat":  //?�자+".-"	for Bkg
	    	if(srcCharValue.indexOf("-.") >= 0) {
        		bSign=true;
        		srcCharValue = srcCharValue.substring(2);
        	} else if (srcCharValue.length > 0 && srcCharValue.substring(0,1)=="-") {
	    		bSign=true;
	    		srcCharValue = srcCharValue.substring(1);
	    	}
	    case "pointnum":  // ####.##
	    case "float":   //#,###.###
	    	var pointCnt = ComGetEvent("pointcount");
	    	if (pointCnt== undefined) pointCnt = 0;
	    	pointCnt = ComParseInt(pointCnt);
	    	if(srcCharValue.indexOf(".") < 0) {
	    		//소숫점 윗자리 길이 처리
	        	var iMaxLength = obj.getAttribute("maxLength");
	        	if(iMaxLength != null){
	        		iMaxLength -= pointCnt+1;
	        		if (srcCharValue.length > iMaxLength) {
	        			srcCharValue = srcCharValue.substring(0, iMaxLength);
	        		}	            		
	        	}
	        	
	    		if(sFormat == "pointnum"){
	    			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'');
	    		} else {
	    			srcCharValue=srcCharValue.replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
	    		}
	    		
	    	} else{
	    		var arr = srcCharValue.split(".");
	    		//소숫점 윗자리 길이 처리
	        	var iMaxLength = obj.getAttribute("maxLength");
	        	if(iMaxLength != null){
	        		iMaxLength -= pointCnt+1;
	        		if (arr[0].length > iMaxLength) {
	        			arr[0] = arr[0].substring(0, iMaxLength);
	        		}	            		
	        	}
	        	
	    		if(sFormat == "pointnum"){
	    			arr[0] = arr[0].replace(/[^0-9]/gi,'');
	    		} else {
	    			arr[0] = arr[0].replace(/[^0-9]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
	    		}
	    		arr[1] = arr[1].replace(/[^0-9]/gi,'');
	    		
	    		//소숫점이 2개이상 나오는 경우
	        	if (srcCharValue.indexOf(".") != srcCharValue.lastIndexOf(".")) {
	        		for(idx=2; idx<arr.length; idx++){
	        			arr[1] += arr[idx].replace(/[^0-9]/gi,'');
	        		}
	        	}
	
	        	//소숫점 아랫자리값  길이 처리
	            if (pointCnt > 0 && arr[1].length > pointCnt) {
	            	arr[1] = arr[1].substring(0, pointCnt)
	            }
	                                
	            srcCharValue = arr[0] + "." + arr[1];
	    	}
	    	
	    	retValue = ((bSign)?"-":"") + srcCharValue;
	    	
	    	break;
		}
		return retValue;
	
}
function commify(n) {
	var reg = /(^[+-]?\d+)(\d{3})/;
	while (reg.test(n))
	    n = n.replace(reg, '$1' + ',' + '$2');
}
/**
 * HTML태그(Object)의 onKeyDown 이벤트에서 이 함수를 호출할수 있으며, Enter키를 눌렀을때 자동화 기능을 처리한다. <br>
 * 인자로 사용되는 sFlag 인자의 설정값은 다음과 같다. <br>
 * sFlag = 설정안한경우      : sFlag="Search"의 경우와 동일하게 처리한다.<br>
 * sFlag = "Search"          : Enter키가 누르면 조회버튼(btn_Retrieve 또는 btn_retrieve)이 눌린것처럼 처리한다.OnKeyDown에서 호출할것!<br>
 * sFlag = "NextFocus"       : Enter키를 누르면 Tab키를 누른것 처럼 다음 입력필드로 포커스를 이동한다.OnKeyDown에서 호출할것!<br>
 * sFlag = "LengthNextFocus" : 입력필드의 maxlength길이만큼 모두 입력되면 자동으로 포커스를 다음으로 이동하고, Enter키를 누르면 길이에 관계없이 Tab을 누른것처럼 옆으로 이동한다. OnKeyUp에서 호출할 것!<br>
 * sFlag = Function명문자열  : 특정Function명 문자열을 인자로 받아서 Enter키를 누르면 해당 함수를 호출한다. OnKeyDown에서 호출할 것!<br>
 * sFlag = "LengthNextFocus"는 OnKeyUp이벤트에서 호출하여야 하고, 나머지는 모두 OnKeyDown이벤트에서 호출해야 한다.<br>
 * <br><b>Example :</b>
 * <pre>
 *     &lt;form name="form" onKeyDown="ComKeyEnter()"&gt; 					//조회조건Form에서 주로 사용
 *     &lt;form name="form" onKeyDown="ComKeyEnter('NextFocus')"&gt;		//저장Form에서 주로 사용
 *     &lt;form name="form" onKeyUp="ComKeyEnter('LengthNextFocus')"&gt;	//저장Form에서 주로 사용
 * </pre>
 * @param {string} sFlag 선택,키처리 구분, default="Search"
 * @see #ComSetNextFocus
 */
function ComKeyEnter(sFlag)
{
    try {
    	var keyValue = ComGetEvent("keycode");

    	if(ComGetEvent().type == "textarea") return;
        if (sFlag==undefined || sFlag==null || sFlag.constructor!=String || sFlag.trim() == "") sFlag="search";
        
        switch(sFlag.toLowerCase()) {
        	case "search" :
        		//Enter키를 누르면 조회버튼을 눌린것 처럼 처리
        		if (keyValue != 13) return;
        		var obj = ComGetObject("btn_Retrieve");
        		if (obj.length == 0) obj = ComGetObject("btn_retrieve");
        		if (obj) $(obj).click();
        		break;
       		
        	case "nextfocus":
        		//Enter키를 누르면 Tab키를 누른것 처럼 처리
        		if (keyValue == 13)  ComSetNextFocus();
        		break;

        	case "lengthnextfocus":
        		if(ComGetEvent().className.indexOf("GMEditInput") >= 0 || ComGetEvent().className.indexOf("BLEditInput") >= 0) return true; 
        		//입력필드는 maxlength만큼 모두 입력하면 Enter키를 누르지 않아도 자동이동하고,
        		//그외의 경우 Enter키를 누르면 Tab키를 누른것 처럼 처리
		        var iMaxLen=ComGetEvent("maxLength");
		        if (iMaxLen==undefined) iMaxLen=ComGetEvent("maxlength");
		        var sValue =ComGetEvent("value");
		        var bFocusProcess = false;
		        
		        //Enter키를 눌렀을 때
		        if (keyValue == 13)  {
		        	//Enter키를 누른것이 IBSheet가 아닌 경우만 처리한다.
		        	if (!ComGetEvent().IBSheetVersion) {
			        	bFocusProcess=true;
			        }
		        //iMaxLen 속성이 없거나 Value 속성이 없는것들은 처리하지 않는다.
		        } else if(iMaxLen!=null && sValue!=null) {
		            if(iMaxLen==sValue.lengthByte()){
		                if (!isForEditKey(keyValue)) {
				            bFocusProcess=true;
		                }
		            } 
		        } 
	            
	        	//포커스를 다음 컨트롤로 옮기는 처리를 해야 하는 경우
	            if (bFocusProcess)  ComSetNextFocus();

        	default :
        		//포커스를 다음 컨트롤로 옮기는 처리를 해야 하는 경우
        	    if (keyValue==13 && ComFuncCheck(sFlag)) ComFunc();

        }
    } catch(err) { ComFuncErrMsg(err.message); }
    
    return true;
}

/*이 함수는 CoFormControl.js에서만 사용하려고 만들었음. 편집시 사용가능한 키 인자 여부를 반환한다.*/
//참고:http://cdmanii.tistory.com/153
function isForEditKey(keyValue){
	if (keyValue==32) return false	//공백은 허용 안함
    if ((keyValue>=8   && keyValue<=40)  ||  //BackSpace~아래방향키키
            (keyValue>=45  && keyValue<=46)  ||  //Insert,Delete키
            (keyValue>=91  && keyValue<=93)  ||  //기능키
            //(keyValue>=112 && keyValue<=123) ||  //F1~F12키
            (keyValue>=144 && keyValue<=145) ) {//NumLock,ScrollLock
    	return true;
    }
	return false;
}

/**
 * 인자로 받은 HTML태그(Object)의 다음 HTML태그(Object)로 포커스를 이동한다.<br>
 * 인자를 설정하지 않으면 event.srcElement를 Object로 처리한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComSetNextFocus(form.txtDate1); 	//form.txtDate1의 다음 Object인 form.txtDate2로 포커스를 이동한다.
 * </pre>
 * @param {object} obj     필수,HTML태그(Object)
 * @see #ComAlertFocus
 * @see #ComSetFocus
 * @see #ComKeyEnter
 */
function ComSetNextFocus(obj) 
{
    try {
    	if (obj==null || obj==undefined) obj = ComGetEvent();
    	if (obj==null) return;
        
		var objs   = document.all;
		var sourceIndex = getSourceIndex(obj);
		//sourceIndex속성은 obj의 document.all의 순번임
		//for (var i=obj.sourceIndex+1; i<objs.length; i++) { 
		 for (var i=sourceIndex+1; i<objs.length; i++) {
		
    		try {
    			if (objs[i].type == "hidden" ) continue;
    			//Name=null or Type=null인 것들은 거의 Editable인것이 아님
    			if (objs[i].getAttribute("name") == null ) continue;

    			//disabled이거나 readOnly일때 그 다음 컨트롤 찾기
    			if (objs[i].getAttribute("readOnly") || objs[i].getAttribute("isDisabled")) continue;
    			if (objs[i].readOnly) continue;
    			if (objs[i].disabled) continue;
    			
    			//button일 때 다음 컨트롤 찾기
    			if (objs[i].tagName.toLowerCase()=="button") continue;

    			objs[i].focus();
    			if  (! (objs[i].type == "select-one" ||  objs[i].type == "select-multiple") ){
    				objs[i].select();
    			}
    			
                break;
    		} catch(error) {;}
		}
	
    } catch(err) { ComFuncErrMsg(err.message); }
    return true;
}
function getSourceIndex(obj) {
	 var objs   = document.all;
	 //sourceIndex속성은 obj의 document.all의 순번임
	 for (var i=0; i<objs.length; i++) {
		 if(obj.getAttribute("name") == objs[i].getAttribute("name")) {
			 return i;
		 }
	 } 
}

/**
 * sFormat이 있는 경우 : sFormat을 소문자로 변환하여 반환한다. <br>
 * sFormat이 없는 경우 + Object에 dataformat 속성이 있는 경우 : dataformat 속성값을 소문자로 변환하여 반환한다. <br>
 * sFormat이 없는 경우 + Object에 dataformat 속성이 없는 경우 : "" 반환한다. <br>
 * 이 함수는 이파일(CoFormControl.js)에서만 사용하기 위한 목적으로 만들졌다.
 */
function getDataFormat(obj, sFormat){
    try {
        if (sFormat==undefined || sFormat==null || sFormat.constructor!=String || sFormat=="") {
        	var argVal = obj.getAttribute("dataformat");
            if (argVal==null) return "";
            return argVal.toLowerCase();
        }else{
            return sFormat.toLowerCase();
        }
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * &lt;select&gt;태그 Object에 있는 모든 Item을 제거한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComClearCombo(sltCity);
 * </pre>
 * @param {object} obj     필수,Select HTML태그(Object)
 * @return 없음
 * @see #ComAddComboItem
 */
function ComClearCombo(obj)
{
    try {
        if (obj == null) return;

        for (var idx = obj.length-1; idx >= 0; idx--) {
            obj.options[idx] = null;
        }
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * &lt;select&gt;태그 Object에 새로운 Item을 추가한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComAddComboItem(sltCity, "서울", "001");
 *     ComAddComboItem(sltCity, "대전", "002");
 *     ComAddComboItem(sltCity, "대구", "003");
 *     ComAddComboItem(sltCity, "부산", "004");
 * </pre>
 * @param {object} obj     필수,Select HTML태그(Object)
 * @param {string} sText   필수,Item의 표시글자
 * @param {string} sValue  필수,Item의 숨겨진 값
 * @return 없음
 * @see #ComClearCombo
 */
function ComAddComboItem(obj, sText, sValue)
{
    try {
        if (obj == null) return;

        var iLen = obj.length;
        if (iLen == 0) {
            option1 = new Option(sText, sValue, true);
        } else {
            option1 = new Option(sText, sValue);
        }
        obj.options[iLen] = option1;
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * &lt;select&gt;태그 Object에 새로운 Item을 0번째 추가한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComAddComboItem(sltCity, "서울", "001");
 *     ComAddComboItem(sltCity, "대전", "002");
 *     ComAddComboItem(sltCity, "대구", "003");
 *     ComAddComboItem(sltCity, "부산", "004");
 * </pre>
 * @param {object} obj     필수,Select HTML태그(Object)
 * @param {string} sText   필수,Item의 표시글자
 * @param {string} sValue  필수,Item의 숨겨진 값
 * @return 없음
 * @see #ComClearCombo
 */
function ComAddBeginComboItem(obj, sText, sValue)
{
    try {
        if (obj == null) return;
        $(obj).prepend("<option value='"+sValue+"'>"+sText+"</option>" );
        
    } catch(err) { ComFuncErrMsg(err.message); }
}


//var Msg_Required = "은(는) 필수입력사항 입니다.";
var Msg_Required = " is mandatory item." ;

/**
 * 폼 개체 안에 컨트롤의 필수 입력 여부를 확인한다. <br>
 * 필수 입력 여부를 확인하기 위해서는 HTML태그(Object)안에 사용자 정의 속성인 required속성과 caption속성을 설정해주어야 한다. 다음과 같이 설정한다. <br>
 *     &lt;input type="text" name="bmk_cd" <font color="red">required caption="비목코드"</font>&gt; <br>
 * &lt;input type="radio"&gt;의 경우 같은 name으로 여러개를 만든다면 첫번째 태그에만 required속성과 caption속성을 설정해준다. 예를 들어 다음과 같다. <br>
 *     &lt;input type="radio" name="rdoCity" value="01" required caption="도시"&gt;서울<br>
 *     &lt;input type="radio" name="rdoCity" value="02"&gt;대전<br>
 *     &lt;input type="radio" name="rdoCity" value="03"&gt;대구<br>
 * <br><b>Example :</b>
 * <pre>
 *     if(!ComChkRequired(document.frmMaster)) return;   //frmMaster폼안에 모든 오브젝트의 필수입력여부를 확인한다.
 * </pre>
 * @param {form} frm     필수,대상 Form 오브젝트
 * @returns bool
 *          false - 필수입력 항목에 값이 없는 경우
 *          true  - 모두 입력된 경우
 * @see #ComChkValid
 */
function ComChkRequired(frm) {

    try {
        var elems = frm.elements;

        for(var i = 0; i < elems.length; i++) {
            var elem = elems[i];

            if(elem.getAttribute("required") == null || elem.disabled) continue;

            //radio인 경우 같은이름으로 여러개 있는 경우
            if (elem.type =="radio") {
                if (elem.name == null || elem.name=="") continue;
                var eRadio = document.all[elem.name];
                //첫번째 radio만 "required"속성이 있는지 체크한다.
                if(eRadio.length>1) i += (eRadio.length-1);
                sVal = ComGetObjValue(eRadio);
            } else {
                sVal = ComGetObjValue(elem)
            }

            if (ComTrim(sVal)=="") {
                var sTitle = (elem.getAttribute("caption")==null)?elem.name:elem.getAttribute("caption");
                ComShowMessage("'" + sTitle + "' " + Msg_Required);

              //컨트롤이 숨겨져 있을수도 있으므로 에러 감싼다.
                try{ elem.focus(); } catch(ee) {;}

                return false;

            }
        } // end of for(i)
        return true;
    } catch(err) { ComFuncErrMsg(err.message); }

}

/**
 * 인자로 받은 HTML태그(Object) 오브젝트,IBMultiCombo의 value를 리턴한다. <br>
 * &lt;input type="radio"&gt;의 경우 같은이름의 여러개 Radio컨트롤 중 선택(체크)된 하나의 Radio컨트롤의 value를 반환한다. <br>
 * &lt;input type="checkbox"&gt;의 경우 체크되었을때 컨트롤의 value를 반환한다. <br>
 * &lt;select&gt;의 경우 선택된 Item의 value를 반환한다. <br>
 * &lt;select multiple&gt;의 경우 여러개 선택된 Item의 value를 "|"로 연결하여 반환한다. <br>
 * 그외의 경우 value를 반환한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ret = ComGetObjValue(txtName)         //결과 : "한진해운"
 *     ret = ComGetObjValue(sltCity)         //결과 : "04"
 *     ret = ComGetObjValue(rdoCity)         //결과 : "01"
 *     ret = ComGetObjValue(chkYn)           //결과 : "Y"
 *     ret = ComGetObjValue(sltCityMulti)    //결과 : "01|02|04" 3개 Item이 선택된 경우
 * </pre>
 * @param {object} obj    필수,HTML태그(Object) 오브젝트
 * @return string,HTML태그(Object) 오브젝트의 value
 * @see #ComGetObjText
 * @see #ComSetObjValue
 */
function ComGetObjValue(obj){
    try {
    	//아래는 HTML오브젝트

        var sType = obj.type;
        //type을 읽을수 있다는것은 Radio전체가 아니라 radio[0]... 임
        if (sType=="radio") {
            if (obj.name == null || obj.name=="") {
                if (obj.checked) return obj.value;
                else return "";
            }
            obj = document.all[obj.name];
        //Radio전체로는 obj.type으로 알수 없음.  radio[0].. 등 만 알수 있음
        }else if(obj.type == undefined && obj.length != undefined && obj[0].type == "radio") {
            sType = "radio";
        }

        switch (sType) {
            case "radio":
                if (obj.length != null) {
                    for(var i=0; i<obj.length; i++) {
                        if (obj[i].checked) return obj[i].value;
                    }
                } else {
                    if (obj.checked) return obj.value;
                }
                break;
            case "checkbox":
                if (obj.checked) return obj.value;
                break;
            case "select-one":
                if(obj.selectedIndex >= 0)  return obj[obj.selectedIndex].value;
                break;
            case "select-multiple":
                var sRet = "";
                for(var idx= 0; idx<obj.length; idx++) {
                	//선택된 모든 Item의 value를 "|"로 연결한다.
                    if (obj.options[idx].selected) sRet += "|" + obj.options[idx].value;
                }
                if (sRet == "") return "";
                return sRet.substr(1);  //맨앞의 "|"를 제거
            default:
                if (obj.value != undefined) return obj.value;
        }

        if(obj !=null && obj.Version && obj.Version()!=""){
        	return obj.GetSelectCode();
        }

    } catch(err) { ComFuncErrMsg(err.message); }

    return "";
}


/**
 * 인자로 받은 HTML태그(Object) 오브젝트,IBMultiCombo의 value를 특정값(sValue)으로 변경한다. <br>
 * &lt;select multiple&gt;의 경우 여러개 Item을 선택할 경우 sValue인자로 선택할 Item의 value를 "|"로 연결한 문자열로 설정한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *     ComSetObjValue(frmMain.txtName, "한진")       //결과 : txtName.value="한진해운"
 *     ComSetObjValue(frmMain.sltCity, "02")         //결과 : sltCity.options[idx].value="04"인 Item의 sltCity.options[idx].selected = true로 변경
 *     ComSetObjValue(frmMain.rdoCity, "02")         //결과 : rdoCity[idx]="01"인 Itemd의 rdoCity[idx].checked=true로 변경
 *     ComSetObjValue(frmMain.chkYn, "Y")            //결과 : chkYn.checked="Y"
 *     ComSetObjValue(frmMain.sltCityMulti, "01|03") //결과 : sltCityMulti.options[idx].value가 "01" 또는 "02" 또는 "04"인 Item의 selected=true로 변경
 * </pre>
 * @param {object} obj      필수,HTML태그(Object) 오브젝트
 * @param {string} sValue   필수,변경할 value
 * @param {bool}   bArgTrim 선택,sValue인자값을 스페이스제거(Trim)하여 비교할지여부, default=false
 * @return 없음
 */
function ComSetObjValue(obj, sValue, bArgTrim){
    try {
        if (bArgTrim==undefined || bArgTrim == null) bArgTrim=false;

        if (bArgTrim) sValue = ComTrim(sValue);

        var sType = obj.type;
      //type을 읽을수 있다는것은 Radio전체가 아니라 radio[0]... 임
        if (sType=="radio") {
            if (obj.name == null || obj.name=="") {
                if (obj.checked) return obj.value;
                else return "";
            }

            obj = document.all[obj.name];
          //Radio전체로는 obj.type으로 알수 없음.  radio[0].. 등 만 알수 있음
        }else if(obj.type == undefined && obj.length != undefined && obj[0].type == "radio") {
            sType = "radio";
        }
        
        switch (sType) {
            case "radio":
                if (obj.length != null) {
                    for(var i=0; i<obj.length; i++) {
                        if (obj[i].value == sValue) {
                            obj[i].checked=true;
                            break;
                        }
                    }
                } else {
                    if (obj.value == sValue) obj.checked=true;
                }
                break;
            case "checkbox":
                obj.checked = sValue;
                break;
            case "select-one":
                for (var idx = 0; idx < obj.length; idx++) {
                    if (obj[idx].value == sValue) {
                        obj[idx].selected = true;
                        break;
                    }
                }
                break;
            case "select-multiple":
                var aryValue = sValue.split("|");
                if (bArgTrim){
                    for (i=0; i<aryValue.length; i++) {
                        aryValue[i] = ComTrim(aryValue[i]);
                    }
                }

                for(var idx= 0; idx<obj.length; idx++) {
                    var bSelected = false;
                    for (i=0; i<aryValue.length; i++) {
                        if (obj[idx].value == aryValue[i])  {
                            bSelected = true;
                            break;
                        }
                    }
                    obj[idx].selected = bSelected;
                }
                break;
            default:
                if (obj.value != undefined) obj.value = sValue;
        }
        
        if(obj !=null && obj.Version && obj.Version() != "") {
        	obj.SetSelectIndex(-1);
        	obj.SetSelectCode(sValue);
        }
    } catch(err) { ComFuncErrMsg(err.message); }
}


/**
 * 인자로 받은 HTML태그(Object) 오브젝트,IBMultiCombo의 text를 리턴한다. <br>
 * &lt;select&gt;의 경우 선택된 Item의 text를 반환한다. <br>
 * &lt;select multiple&gt;의 경우 여러개 선택된 Item의 text를 "|"로 연결하여 반환한다. <br>
 * IBMultiCombo의 경우 선택된 Item의 Text를 반환한다. <br>
 * 그외 HTML태그(Object) 오브젝트인 경우 text속성이 없으므로 coc_getObjValue와 동일하게 value를 반환한다.<br>
 * <br><b>Example :</b>
 * <pre>
 *     ret = ComGetObjText(txtName)         //결과 : "한진해운"
 *     ret = ComGetObjText(sltCity)         //결과 : "부산"
 *     ret = ComGetObjText(sltCityMulti)    //결과 : "서울|대전|부산" 3개 Item이 선택된 경우
 * </pre>
 * @param {object} obj    필수,HTML태그(Object) 오브젝트
 * @return string,HTML태그(Object) 오브젝트,IBMultiCombo의 text
 */
function ComGetObjText(obj){
    try {
        //아래는 HTML오브젝트
        if(obj.classid==undefined){
            var sType = obj.type;
            //type을 읽을수 있다는것은 Radio전체가 아니라 radio[0]... 임
            if (sType=="radio") {
                if (obj.name == null || obj.name=="") {
                    if (obj.checked) return obj.value;
                    else return "";
                }
                obj = document.all[obj.name];
            //Radio전체로는 obj.type으로 알수 없음.  radio[0].. 등 만 알수 있음
            }else if(obj.type == undefined && obj.length != undefined && obj[0].type == "radio") {
                sType = "radio";
            }

            switch (sType) {
                case "select-one":
                    if(obj.selectedIndex >= 0)  return obj[obj.selectedIndex].text;
                    break;
                case "select-multiple":
                    var sRet = "";
                    for(var idx= 0; idx<obj.length; idx++) {
                    	//선택된 모든 Item의 value를 "|"로 연결한다.
                        if (obj.options[idx].selected) sRet += "|" + obj.options[idx].text;
                    }
                    if (sRet == "") return "";
                    return sRet.substr(1);  //맨앞의 "|"를 제거
                default:
                    return ComGetObjValue(obj);
            }
          //아래는 ActiveX 오브젝트
        } else {
            if(obj.classid==CLSID_IBMCOMBO) {//IBMultiCombo 경우
                return obj.Text;
            }
        }
    } catch(err) { ComFuncErrMsg(err.message); }

    return "";
}

function ComGetObj(sName){
	return $('#' + sName);
}

/**
 * 특정이름의 Cookie를 생성한다. <br>
 * @param {string} cookieName    필수,Cookie이름
 * @param {string} cookieValue   필수,Cookie값
 * @param {string} expires       필수,만기일자 Date 오브젝트
 * @return 없음
 * @see #ComGetCookie
 * @see #ComClearCookie
 */
function ComSetCookie(cookieName, cookieValue, expires) {
    try {
        document.cookie =
            escape(cookieName) + '=' + escape(cookieValue)
            + (expires ? '; expires=' + expires.toGMTString() : '')
            + '; path=/';

            /*
            + (path ? '; path=' + path : '')
            + (domain ? '; domain=' + domain : '')
            + (secure ? '; secure' : '');
            */
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * 특정이름의 Cookie의 값을 가져온다. <br>
 * @param {string} cookieName    필수,Cookie이름
 * @return string, Cookie값
 * @see #ComSetCookie
 * @see #ComClearCookie
 */
function ComGetCookie(cookieName) {
    try {
        var cookieValue = '';
        var posName = document.cookie.indexOf(escape(cookieName) + '=');
        if (posName != -1) {
            var posValue = posName + (escape(cookieName) + '=').length;
            var endPos = document.cookie.indexOf(';', posValue);
            if (endPos != -1) cookieValue = unescape(document.cookie.substring(posValue, endPos));
            else cookieValue = unescape(document.cookie.substring(posValue));
        }
    } catch(err) { ComFuncErrMsg(err.message); }

    return (cookieValue);
}

/**
 * 특정이름의 Cookie를 제거한다. <br>
 * @param {string} cookieName    필수,Cookie이름
 * @return 없음
 * @see #ComGetCookie
 * @see #ComSetCookie
 */
function ComClearCookie(cookieName) {
    try {
        var now = new Date();
        var yesterday = new Date(now.getTime() - 1000 * 60 * 60 * 24);
        ComSetCookie(cookieName, 'cookieValue', yesterday);
        ComSetCookie(cookieName, 'cookieValue', yesterday);
    } catch(err) { ComFuncErrMsg(err.message); }
}


/**
 * document 안에 있는 모든 Object의 값을 초기화한다. <br>
 * Form.reset()하고, IBSheet.RemoveAll()처리한다. IBMultiCombo의 경우 id="myCombo"이면 "initComboValue_myCombo()" 라는 <br>
 * 자바스크립트 함수가 정의되어 있다면 해당 함수를 호출하고, 해당 함수가 없다면 아무것도도 선택되지 않도록 IBMultiCombo.Code2="-1";로 설정한다. <br>
 * @return 없음
 * @see #ComClearManyObjects
 */
function ComResetAll(){

    try {
           for(var i=0; i<document.forms.length; i++){
               document.forms[i].reset();
           }

        var objs =$("[id^='DIV_']");
        for(var i = 0 ; i < objs.length ; i++){
        	var sheetname = objs[i].id.substring(4);

        	if ((!eval(sheetname)) || (!eval(sheetname).IBSheetVersion)) {
        		
        	} else { 
        		eval(sheetname).RemoveAll();
        	}
        }
        
        var objs1 = $(".MAINCTL_DIV");
        for(var i = 0 ; i < objs1.length ; i++){
        	var comboname = objs1[i].childNodes[1].id;
        	
            var funcName = "initComboValue_" + comboname;
            if (ComFuncCheck(funcName)) {
                ComFunc();
            }else{
            	eval(comboname).SetSelectCode(-1,0);
            }
        }
        
    } catch(err) { ComFuncErrMsg(err.message); }
}

/**
 * document 안에 있는 모든 hidden의 값을 초기화한다. <br>
 * @return 없음
 * @see #ComClearManyObjects
 */
function ComHiddenResetAll(){
	for(var j=0; j<document.forms.length; j++){
		for(var i=0; i<document.forms[j].elements.length; i++){
	        if (document.forms[j].elements[i].type == "hidden"){
	        	document.forms[j].elements[i].value = "";
	        }    
	    }
	}
}

/**
 * 폼 개체 안에 모든 컨트롤의 Validation을 확인한다. <br>
 * 모든 컨트롤이 아닌 특정 하나의 컨트롤을 체크하고자 한다면 {@link #ComChkObjValid} 함수를 이용한다. <br>
 * bMsg 인자가 true이면 Validation이 정확하지 않은 경우 경고 메시지를 표시한다. <br>
 * bTrim 인자가 true이면 obj.value 확인 시 값을 trim하여 validation을 확인한다. <br>
 * bMasked 인자가 true이면 Validation이 정확한 경우 Format에 맞게 Masking 한값을 obj.value에 설정한다. <br>
 * Validation을 확인하기 위해서는 각 컨트롤 태그에 maxlength속성과 사용자 정의 속성인 required, minlength, caption, dataformat, fullfill, cofield, maxnum, minnum속성을 설정해주어야 한다. 다음과 같이 설정한다. <br>
 *     &lt;input type="text" name="txtDate" <font color="red">caption="입사일" maxlength="10" dataformat="ymd" required  fullfill maxnum="100" minnum="0" cofield="" </font>&gt; <br>
 * 위와 같은 속성을 설정함으로써 이 함수는 다음과 같은 처리를 한다. <br>
 * (1) maxlength  : 입력 최대 길이 확인, UTF-8기준으로 길이를 체크하므로, 한글은 3Byte로 된다.<br>
 * (2) minlength  : 입력 최소 길이 확인, 값이 있다면 최소 길이만큼 입력해야 한다. <br>
 * (3) dataformat : 데이타 포멧으로 Validation 확인<br>
 * <pre>
 *  - "ymd"      : yyyy-mm-dd
 *  - "ym"       : yyyy-mm
 *  - "hms"      : hh:mm:ss
 *  - "hm"       : hh:mm
 *  - "saupja"   : ###-##-#####
 *  - "jumin"    : ######-#######
 *  - "int"      : #,###
 *  - "float"    : #,###.###
 *  - "eng"      : 영문만
 *  - "engup"    : 영문 대문자만
 *  - "engdn"    : 영문 소문자만
 * </pre>
 * (4) required  : 필수입력 여부 확인, 값이 ""이면 에러 메시지 표시<br>
 * (5) caption   : EndUser를 위한 메시지 처리를 위한 컨트롤 표시 title<br>
 * (6) fullfill  : maxlength속성 만큼 글자를 모두 입력해야 하는 경우, 값이 ""이면 체크 안함<br>
 * (7) pointcount: dataformat="float" 인 경우 소숫점 아랫자리 수<br>
 * (8) maxnum    : 숫자인 경우 최대값<br>
 * (9) minnum    : 숫자인 경우 최소값<br>
 * (10) cofield  : 기간인 경우 시작일과 종료일 html태그에 이 속성을 설정해야 하며, 시작일은 종료일 name을 종료일은 시작일 name을 설정한다. <br>
 * <br>
 * &lt;input type="radio"&gt;의 경우 같은 name으로 여러개를 만든다면 첫번째 태그에만 위 속성을 설정해준다. 예를 들어 다음과 같다. <br>
 *     &lt;input type="radio" name="rdoCity" value="01" required caption="도시"&gt;서울<br>
 *     &lt;input type="radio" name="rdoCity" value="02"&gt;대전<br>
 *     &lt;input type="radio" name="rdoCity" value="03"&gt;대구<br>
 * 위 속성은 필요한것만 골라서 사용한다. 굳이 모든 속성을 다 설정할 필요는 없다. 그러나 속성을 하나라도 추가 한다면 caption속성은 설정해야 메시지 처리에 가독성을 높일수 있다.<br>
 * <br><b>Example :</b>
 * <pre>
 *     if(!ComChkValid(document.frmMaster)) return;   //frmMaster폼안에 모든 오브젝트의 Validation을 확인한다.
 * </pre>
 * @param {form}   frm          필수,대상 Form 오브젝트
 * @param {bool}   bMsg         선택,각종메시지 표시 여부, default=true
 * @param {bool}   bTrim        선택,데이터 Trim후 확인할지 여부, default=true
 * @param {bool}   bMasked      선택,Validation이 정확하면 Format에 맞게 Masking한 값을 obj.value에 설정하지 여부, default=false
 * @returns bool <br>
 *          false - Validation이 정확하지 않은 경우<br>
 *          true  - Validation이 정확한 경우
 * @see #ComChkObjValid
 * @see #ComChkRequired
 */
function ComChkValid(frm, bMsg, bTrim, bMasked){
	try {
        var elems   = frm.elements;
        var oldRadio = "";
        if (bMsg==undefined || bMsg==null)          bMsg = true;
        if (bTrim==undefined || bTrim==null)        bTrim = true;
        if (bMasked==undefined || bMasked==null)    bMasked = false;
        for(var i = 0; i < elems.length; i++) {
            var elem = elems[i];
            //radio인 경우 같은 이름으로 여러개 있는 경우
            if (elem.type =="radio") {
                if (elem.name == null || elem.name=="") continue;
                var elem = document.all[elem.name];
                //첫번째 radio만 "required"속성이 있는지 체크한다. 나머지 건너뛰기
                if(oldRadio == elem.name) continue;
                else{
                    //Validation을 체크하여 false가 나오면 종료함
                    oldRadio = elem.name;
                    if (!ComChkObjValid(elem, bMsg, bTrim, bMasked)) {
                     blurflag = true;  // 추가
                     ComJsEventStop();  // 추가
                     return false;
                    }
                }
            }else {
                //Validation을 체크하여 false가 나오면 종료함
                if (!ComChkObjValid(elem, bMsg, bTrim, bMasked)){
                 blurflag = true;    // 추가
                 ComJsEventStop();  // 추가
                 return false;
                }
            }
        }
    } catch(err) { ComFuncErrMsg(err.message); }
    return true;
}


/**
 * 하나의 컨트롤의 Validation을 확인한다. <br>
 * 각 하나의 컨트롤이 아닌 Form안에 있는 전체를 체크하고자 한다면 {@link #ComChkValid} 함수를 이용한다. <br>
 * Validation을 확인하기 위해서는 maxlength 속성과 사용자 정의 속성인 required, caption, minlength, dataformat, fullfill, cofield, maxnum, minnum속성을 설정해주어야 한다. 다음과 같이 설정한다. <br>
 *     &lt;input type="text" name="txtDate" <font color="red">caption="입사일" maxlength="10" dataformat="ymd" required  fullfill maxnum="100" minnum="0" cofield="" </font>&gt; <br>
 * 위와 같은 속성을 설정함으로써 이 함수는 다음과 같은 처리를 한다. <br>
 * (1) maxlength  : 입력 최대 길이 확인, UTF-8기준으로 길이를 체크하므로, 한글은 3Byte로 된다.<br>
 * (2) minlength  : 입력 최소 길이 확인, 값이 있다면 최소 길이만큼 입력해야 한다. <br>
 * (3) dataformat : 데이타 포멧으로 Validation 확인<br>
 * <pre>
 *  - "ymd"      : yyyy-mm-dd
 *  - "ym"       : yyyy-mm
 *  - "hms"      : hh:mm:ss
 *  - "hm"       : hh:mm
 *  - "saupja"   : ###-##-#####
 *  - "jumin"    : ######-#######
 *  - "int"      : #,###
 *  - "float"    : #,###.###
 *  - "eng"      : 영문만
 *  - "engup"    : 영문 대문자만
 *  - "engdn"    : 영문 소문자만
 * </pre>
 * (4) required  : 필수입력 여부 확인, 값이 ""이면 에러 메시지 표시<br>
 * (5) caption   : EndUser를 위한 메시지 처리를 위한 컨트롤 표시 title<br>
 * (6) fullfill  : maxlength속성 만큼 글자를 모두 입력해야 하는 경우, 값이 ""이면 체크 안함<br>
 * (7) pointcount: dataformat="float" 인 경우 소숫점 아랫자리 수<br>
 * (8) maxnum    : 숫자인 경우 최대값<br>
 * (9) minnum    : 숫자인 경우 최소값<br>
 * (10) cofield  : 기간인 경우 시작일과 종료일 html태그에 이 속성을 설정해야 하며, 시작일은 종료일 name을 종료일은 시작일 name을 설정한다. <br>
 * <br>
 * &lt;input type="radio"&gt;의 경우 같은 name으로 여러개를 만든다면 첫번째 태그에만 위 속성을 설정해준다. 예를 들어 다음과 같다. <br>
 *     &lt;input type="radio" name="rdoCity" value="01" required caption="도시"&gt;서울<br>
 *     &lt;input type="radio" name="rdoCity" value="02"&gt;대전<br>
 *     &lt;input type="radio" name="rdoCity" value="03"&gt;대구<br>
 * dataformat="float"인 경우 maxLength와 pointcount를 설정한다. DB에 number(5,2)로 설정되었다면 maxLength="6"으로 소숫점을 포함하여 설정하고, pointcount="2"로 DB와 동일하게 설정한다.<br>
 * 위 속성은 필요한것만 골라서 사용한다. 굳이 모든 속성을 다 설정할 필요는 없다. 그러나 속성을 하나라도 추가 한다면 caption속성은 설정해야 메시지 처리에 가독성을 높일수 있다.<br>
 * <br><b>Example :</b>
 * <pre>
 *     if(!ComChkObjValid(frmMaster.txtName)) return;   //frmMaster폼안의 txtName 오브젝트의 Validation을 확인한다.
 * </pre>
 * @param {object} obj          필수,대상 HTML태그(Object)
 * @param {bool}   bMsg         선택,각종메시지 표시 여부, default=true
 * @param {bool}   bTrim        선택,데이터 Trim후 확인할지 여부, default=true
 * @param {bool}   bMasked      선택,Validation이 정확하면 Format에 맞게 Masking한값을 obj.value에 설정하지 여부, default=true
 * @returns bool <br>
 *          false - Validation이 정확하지 않은 경우<br>
 *          true  - Validation이 정확한 경우
 * @see #ComChkValid
 */

var blurflag = true;
function ComChkObjValid(obj, bMsg, bTrim, bMasked){

    try {
        var sTitle  = "";
        var sMsg    = "";
      //다음 배열은 순서가 중요함
        var props   = new Array("required", "dataformat", "maxLength", "minlength", "fullfill", "maxnum", "minnum", "pointcount", "cofield");

        if (bMsg==undefined || bMsg==null)            bMsg = true;
        if (bTrim==undefined || bTrim==null)          bTrim = true;
        if (bMasked==undefined || bMasked==null)      bMasked = true;

        var sFormat     = "";
        var sVal        = "";
        var maskValue   = "";
        var iMaxLen=0, iMaxVal=null, iMinVal=null;

        sVal = ComGetObjValue(obj)
        if (obj.type=="radio") {
            if (obj.name == null || obj.name=="") return true;
            //radio의 경우 radio의 첫번째 요소를 Object로 설정한다.
            var eRadio = document.all[obj.name];
            obj=eRadio[0];
        }else if(obj.type == undefined && obj.length != undefined && obj[0].type == "radio") {
        	//radio의 경우 radio의 첫번째 요소를 Object로 설정한다.
            obj = obj[0];
        }

        sTitle = (obj.getAttribute("caption")==null)?obj.name:obj.getAttribute("caption");
        if(sTitle == obj.name){
        	sTitle = (obj.getAttribute("required")==null)?obj.name:obj.getAttribute("required");
        	if(sTitle == ""){
            	sTitle = (obj.getAttribute("required")=="")?obj.name:obj.getAttribute("required");
            }
        }
        if(bTrim) sVal = ComTrim(sVal);
        maskValue = sVal;

        //체크할 속성 확인하기
        for(var j=0; j<props.length; j++){

            var attriVal = obj.getAttribute(props[j]);
             
            if (attriVal == null) continue;

            //console.log("count ="+ j + " props ="+props[j]);
            switch(props[j]) {
                case "required":    //필수 입력 확인
                    if(sVal==""){
                    	sMsg = "'" + sTitle + "' " +Msg_Required;
                    	j = 99;
                    }
                    break;
                case "dataformat":  //포멧 확인
                    sFormat = attriVal;
                    //루프를 돌다가 "dataformat"을 지나게 되면 그때부터는 마스크구분자 없는 값으로 다른 Validation(길이,min,max 등)을 확인한다.
	                if (sFormat!="") sVal = ComGetUnMaskedValue(sVal, sFormat);

                    if (sVal== "") continue;

                    //마스크값도 가져오지만 포멧Validation도 ComGetMaskedValue 함수에서 체크한다.
                    maskValue = ComGetMaskedValue(obj, sFormat);

                    if (sVal != maskValue && sFormat.indexOf("eng")>=0) obj.value = maskValue;
 
                        if (maskValue!= "") continue;
                    switch(sFormat) {
                        case "ymd":     //yyyy-mm-dd
                            sMsg = ComGetMsg('COM12134', sTitle);
                    		j=99;
                            break;   
                        case "ymdhms":     //yyyy-mm-dd hh:mm:ss
                            sMsg = ComGetMsg('COM12187', 'yyyy-mm-dd hh:mm:ss');
                     		j=99;
                            break;   
                        case "ymdhm":     //yyyy-mm-dd hh:mm
                            sMsg = ComGetMsg('COM12187', 'yyyy-mm-dd hh:mm');
                     		j=99;
                            break;   
                        case "mdy":     //mm-dd-yyyy
                            sMsg = ComGetMsg('COM12187', 'mm-dd-yyyy');
                     		j=99;
                            break;   
                        case "ym":      //yyyy-mm
                            sMsg = ComGetMsg('COM12134', sTitle);
                            sMsg = sMsg.substring(0, sMsg.length-3);
                    		j=99;
                           break;
                        case "yw":      //yyyy-ww
                            sMsg = "'" + sTitle + "' is not valid. Please enter a correct date.\n\n Format : YYYY-WW";
                        	j=99;
                            break;
                        case "yyyy":      //yyyy
                            sMsg = "'" + sTitle + "' is not valid. Please enter a correct date.\n\n Format : YYYY";
                			j=99;
                            break;
                        case "hms":     //hh:mm:ss
                            sMsg = "'" + sTitle + "' is not valid. Please enter a correct time.\n\n Format : HH:MM:SS";
                        	j=99;
                            break;
                        case "hm":      //hh:mm
                            sMsg = "'" + sTitle + "' is not valid. Please enter a correct time.\n\n Format : HH:MM";
                        	j=99;
                        	break;
                        case "int":     //?�수
                            sMsg = "'" + sTitle + "' is not valid. Please enter an correct integer format.";
                        	j=99;    
                        	break;
                        case "float":   //?�수
                            sMsg = "'" + sTitle + "' is not valid. Please enter a correct float(real type) format.";
                        	j=99;    
                        	break; 
                        case "jumin":   //######-#######
                            sMsg = "'" + sTitle + "' is not valid. Please enter correct a identification no.\n\n Format : ######-#######";
                        	j=99;
                        	break;
                        case "saupja":  //###-##-#####
                            sMsg = "'" + sTitle + "' is not valid. Please enter correct a saupja no.\n\n Format : ###-##-#####";
                        	j=99;
                        	break;
                    }
                    break;
                case "maxLength":   //입력최대길이 확인
                    if (sVal== "") continue;
                    iMaxLen = attriVal;
                    if(ComGetLenByByte(sVal) > iMaxLen){
                    	sMsg = ComGetMsg('COM12142', sTitle, attriVal);
                    	j=99;
                    }
                    break;
                case "minlength":   //입력최소길이 확인
                case "minLength":   //입력최소길이 확인
                    if (sVal== "") continue;
                    if(ComGetLenByByte(sVal) < attriVal) {
                    	sMsg = ComGetMsg('COM12143', sTitle, attriVal);
                    	j=99;
                    }
                    break;
                case "fullfill":    //전체입력 확인
                    if (sVal== "") continue;
                    if(ComGetLenByByte(sVal) != iMaxLen) {
                    	sMsg = ComGetMsg('COM12174', sTitle, iMaxLen);
                    	j=99;
                    }
                    break;
                case "maxnum":     //최대값 확인
                	iMaxVal = attriVal;
                    if (sVal== "") continue;
                    if (!ComIsMoneyNumber(sVal, true, true, true)) {
                        sMsg = ComGetMsg('COM12178');
                    	j=99;
                    } else if(!ComIsMoneyNumber(attriVal, true, false, false)) {
                        sMsg = "is not valid. Please enter an correct number format. maxnum=" + attriVal;
                    	j=99;
                    } else if (parseFloat(sVal) > parseFloat(attriVal)) {
                        sMsg = "'" + sTitle + "' have to be less than " + attriVal;
                    	j=99;
                    }
                    break;
                case "minnum":      //최소값 확인
                	iMinVal = attriVal;
                    if (sVal== "") continue;
                    if (!ComIsMoneyNumber(sVal, true, true, true)) {
                        sMsg = ComGetMsg('COM12178');
                    	j=99;
                    } else if(!ComIsMoneyNumber(attriVal, true, false, false)) {
                        sMsg = "is not valid. Please enter an correct number format. minnum=" + attriVal;
                    	j=99;
                   } else if (parseFloat(sVal) < parseFloat(attriVal)) {
                        sMsg = "'" + sTitle + "' have to be greater than " + attriVal;
                    	j=99;
                    }
                    break;
                case "pointcount":	//소숫점 아랫자리수 확인
                    if (sVal== "") continue;

                    if (!ComIsMoneyNumber(sVal, true, true, true)) {
                        sMsg = ComGetMsg('COM12178');
                    	j=99;
                    } else if(!ComIsMoneyNumber(attriVal, false, false, false)) {
                        sMsg = "is not valid. Please enter an correct number format. pointcount=" + attriVal;
                    	j=99;
                    } else {
                        var iLeftLen = iMaxLen-attriVal-1;
                    	var iNum = sVal;
                        var iPointNum = 0;
                        
                    	if(sVal.indexOf(".") >= 0) {
                        	iNum = sVal.split(".")[0];		//소숫점 윗자리값
	                        iPointNum = sVal.split(".")[1];	//소숫점 아랫자리값
                    	}
                    	
                    	if (iPointNum.length > attriVal) {
                    		//소숫점 아래 자리수가 너무 많은 경우
                            sMsg = "'" + sTitle + "' is not valid decimal point. Please enter a maximum " + attriVal + " decimal point";
                        	j=99;
                        } else if (iMaxLen<100 && iLeftLen>0) {
                        	//"iMaxLen<100" 이조건 반드시 필요함. 
                        	//maxLength속성을 설정하지 않으면 기본적으로 2147483647로 설정되므로 너무 커서 메모리 오류 발생함

                        	//iMaxVal은 "maxnum"속성을 읽어서 미리 설정된 값이고, iMinVal은 "minnum"속성을 읽어서 미리 설정된 값임
                        	//만약 두개 속성중 하나라도 없었다면 다음 코드를 통해서 체크한다.
                        	if (iMaxVal==null) iMaxVal = eval(ComLpad("9",iLeftLen,"9") + "." + ComLpad("9",attriVal,"9"));
                        	if (iMinVal==null) iMinVal = eval("-" + ComLpad("9",iLeftLen,"9") + "." + ComLpad("9",attriVal,"9"));
                        	//소숫점 윗 자리수가 너무 많거나 작은 경우 & 사용자정의속성인 maxnum과 minnum이 없는 경우
                        	if (parseFloat(iNum) > parseFloat(iMaxVal)) {
                                sMsg = "'" + sTitle + "' have to be less than " +iMaxVal;
                            	j=99;
                        	} else if(parseFloat(iNum) < parseFloat(iMinVal)) {
                                sMsg = "'" + sTitle + "' have to be greater than " +iMinVal;
                            	j=99;
	                        }
                        }
                    }
                	break;
                case "cofield":      //기간확인
                    switch(sFormat) {
                        case "ymd":     //yyyy-mm-dd
                        case "ymdhms":     //yyyy-mm-dd
                        case "ymdhm":     //yyyy-mm-dd
                        case "mdy":     //mm-dd-yyyy
                        case "ym":      //yyyy-mm
                        case "yw":      //yyyy-ww
                        case "yyyy":      //yyyy   
                        case "hms":     //hh:mm:ss
                        case "hm":      //hh:mm
                            var coObj = eval("document.all." + attriVal);
                            var coVal =  ComGetObjValue(coObj);
                            if (coVal != "" && sVal == "")          //현재Obj는 값이 없고, CoObj만 값이 있는 경우
                                obj.value = coVal;
                            else if (coVal == "" && sVal != "")     //현재Obj는 값이 있고, CoObj만 값이 없는 경우
                                coObj.value = maskValue;
                            else {  //둘다 있는 경우
                                var startDate, endDate;
                                //sourceIndex속성은 obj의 document.all의 순번임, 
                                //따라서 sourceIndex속성값이 작으면 시작일이고, 크면 종료일이다.
                                if (obj.sourceIndex < coObj.sourceIndex) {
                                	startDate=maskValue;
                                	endDate = coVal;
                                } else {
                                	startDate=coVal;
                                	endDate = maskValue;
                                }
                                
                                //기간체크
                                if (new Date(startDate) > new Date(endDate) && !CofieldFlag) {
                                	if (obj.sourceIndex < coObj.sourceIndex){
	                                	CofieldFlag = true;
	                                	sTitle2 = (coObj.getAttribute("caption")==null)?"end date":coObj.getAttribute("caption");
                                		if(sTitle=="txtsdate"){
                                			sMsg=ComGetMsg("COM12133", "'" +"start date"+ "'", "'" + sTitle2 + "'", "earlier");	
                                		}else{
                                			sMsg=ComGetMsg("COM12133", "'" +sTitle+ "'", "'" + sTitle2 + "'", "earlier"); 
                                		}
                                	} else {
	                                	CofieldFlag = false;
	                                	sTitle2 = (coObj.getAttribute("caption")==null)?"start date":coObj.getAttribute("caption");
                            			if(sTitle=="txtedate"){
                            				sMsg=ComGetMsg("COM12133", "'" + "end date"+ "'", "'" + sTitle2 + "'", "later");
                            			}else{
                            				sMsg=ComGetMsg("COM12133", "'" + sTitle+ "'", "'" + sTitle2 + "'", "later");
                            			}
                                	}
                                	j=99;
                                }else
                                	CofieldFlag = false;
                            }
                            break;
                    }
                    break;
            }

            if (sMsg!="") {
            	if(event == null){
            		if (bMsg){
            			blurflag = false;
            			ComShowMessage(sMsg);
            			//chrome52 infinite alert bug
            			if(obj.type == 'text' && obj.value.length >=1) obj.value="";
            		}
            		ComJsEventStop();
            		ComSetFocus(obj);
	                //obj.select(); 
            	}else{
            		//포커스 나갈수 있는 경우 : 이벤트를 통해서 함수가 호출되고, 값이 공백이거나 readonly인 경우
                	var canFocusOut = (ComGetEvent() == obj && (sVal=="" || obj.getAttribute("readOnly")==true));
                    if (bMsg && !canFocusOut) {
                    	blurflag = false;
                    	ComShowMessage(sMsg);
                    	//chrome52 infinite alert bug
                    	if(obj.type == 'text' && obj.value.length >=1) obj.value="";
                    }

                    //컨트롤이 숨겨져 있을수도 있으므로 에러 감싼다.
                    try{                     	
                    	if(!canFocusOut) {
                    		//값이 정확할때 까지 포커스가 나가지 않아야 하는 경우
                    		ComJsEventStop();
                    		ComSetFocus(obj);
	                    	//obj.focus(); 
	                    	//obj.select(); 
	                    }

                    } catch(ee) {;}
                }
            	
                return false;
            }
        }

        if (bMasked && sFormat != "") {
            //obj.value = ComGetMaskedValue(obj, sFormat);
        }
    } catch(err) { ComFuncErrMsg(err.message); }
    
    return true;
}

/**
* @param     : obj => 객체
* sample	: <input name="up" type="text" onblur="upper(this)"  />
* @return 	: 
* 설명		: 대문자로 만들기
**/
function upper(obj){
	str = obj.value;
	str = str.toUpperCase();
	obj.value = str;
}

/**
 * 발생한 window.event 를 멈춘다. IE/Chrome/FireFox 경우 처리<br>
 * <br><b>Example :</b>
 * <pre>
 *     ComJsEventStop();
 * </pre>
 * @return 없음
 */
function ComJsEventStop(){ 
	var pE = (window.event)?window.event:arguments[0];
	if(pE != undefined){
		if (pE.stopImmediatePropagation) pE.stopImmediatePropagation();
		if (pE.cancelBubble) pE.cancelBubble = true;
		if (pE.stopPropagation) pE.stopPropagation();
		if (pE.preventDefault) pE.preventDefault();
		if (pE.returnValue) pE.returnValue = false;
		if (pE.cancel != null) pE.cancel = true;	
	}
    return false;
}

/**
 * event가 발생한 object 또는 ojbect의 다양한 속성을 가져온다. IE/Chrome/FireFox 경우 처리<br>
 * <br><b>Example :</b>
 * <pre>
 *     ComGetEvent();
 *     ComGetEvent("name");
 *     ComGetEvent("keycode");
 *     ComGetEvent("value");
 *     ComGetEvent("dataformat");
 *     ComGetEvent("maxlength");
 * </pre>
 * @return 없음
 */
function ComGetEvent(sArgName){
	var obj = event.target || event.srcElement;
	if (sArgName==undefined || sArgName == null) return obj;
	
	switch(sArgName){
		case "type":
			return event.type;
		case "name":
			if(obj.className == "underline" && obj.parentElement.type == "button") {
				return obj.parentElement.name || obj.parentElement.id;
			}
			else {
				return obj.name || obj.id;
			}
		case "keycode":
			return event.keyCode || event.which || event.charCode;
		case "value":
			return obj.value;
		case "shiftKey":
			return event.shiftKey;
		case "ctrlKey":
			return event.ctrlKey;
		default: //ex) "dataformat", "maxlength"
			var argVal = obj.getAttribute(sArgName);
			if (argVal==null) return;
			return argVal;
	}
	return;
}

//chrome, FireFox모두 처리?�기 ?�함
function ComGetObject(sName){
	if (document.getElementById(sName)!=null) return document.getElementById(sName);
	if (document.all(sName)!=undefined) return document.all(sName);
	return $("#"+sName);
}

//for wait show/close check
var isOpenWaitWindow = false;

/**
 * 대기상태 여부와 대기이미지표시여부를 설정 변경한다. <br>
 * 특정 스크립트가 호출되는 동안 키보드나 마우스를 대기상태로 만들고자 할때 flag인자를 true로 설정하고, 이때 대기이미지까지 표시하고자 한다면 bOpenLayer인자를 true로 설정하여 이 함수를 호출한다. <br>
 * 특정 스크립트가 완료되어 키보드나 마우스를 원래상태로 하고, 대기이미지도 숨기고자 한다면 flag 인자를 false로 설정하여 이 함수를 호추한다. <br>
 * <br><b>Example :</b>
 * <pre>
 *    ComOpenWait(true);          //setBkgCargo함수와 doActionIBSheet함수가 완료될때 까지 대기상태 유지
 *    setBkgCargo();
 *    doActionIBSheet(sheetObject,formObject,COMMAND01)
 *    ComOpenWait(false);
 * </pre>
 * @param {bool}   flag         필수,키보드나 마우스를 대기상태(true)/일반상태(false)
 * @param {bool}   bOpenLayer   선택,대기이미지(Waiting) 표시 여부, default=true
 * @return 없음
 * @see #ComOpenWaitCallFunc
 */
function ComOpenWait(flag, bOpenLayer){
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
        	$(".layer_wait_bg,.layer_wait").fadeIn(100);

        	//position center
        	$(".layer_wait").css({
            	marginTop : parseInt("-" + $(".layer_wait").outerHeight()/2),
            	marginLeft : parseInt("-" + $(".layer_wait").outerWidth()/2)
        	});
        } else {
        	//close wait image
        	$(".layer_wait_bg,.layer_wait").fadeOut(100);
        }
    } catch(err) {ComFuncErrMsg(err.message); }
    return true;
}

/**
 * 첫번째 인자로 받은 특정 javascript Function을 호출하고, 그 함수가 실행되는 동안 대기이미지(Waiting)를 표시한다. <br>
 * 그 함수의 실행이 끝나면 대기이미지(Waiting)가 사라지고, 키보드나 마우스의 대기상태도 원래상태로 복원된다. <br>
 * <br><b>Example :</b>
 * <pre>
 *    ComOpenWaitCallFunc("setBkgCargo"); //setBkgCargo() 함수가 호출시작하면 대기상태로 되고, 실행완료되면 원래상태로 복원된다.
 *
 *    //아래의 3줄의 코드는 위의 1줄 코드와 동일하다.
 *    ComOpenWait(true);
 *    setBkgCargo();
 *    ComOpenWait(false);
 * </pre>
 * @param {string} sFunc        필수,호출할 Function 문장 전체
 * @param {bool}   bOpenLayer   선택,대기이미지(Waiting) 표시 여부, default=false
 * @return 없음
 * @see #ComOpenWait
 */
function ComOpenWaitCallFunc(sFunc, bOpenLayer) {
    try{
        ComOpenWait(true, bOpenLayer);
        if(typeof(sFunc) == "function") {
        	setTimeout(sFunc, 100);
            setTimeout("ComOpenWait(false);", 101);
        }
        else {
        	setTimeout(sFunc+"();ComOpenWait(false);", 100)
        }
    } catch(err) { ComFuncErrMsg(err.message); }
}

// IE button disabled => evnet not disabled 
function ComGetBtnDisable(name){
	if(name == "") return false;
	var obj = document.getElementById(name);
	
	if(obj == null || obj== undefined) return false;

	if(obj.disabled){
		return true;
	} else {
		return false;
	}
}

/**
 * 멀티콤보 클릭 이벤트 <br>
 * <b>Example :</b>
 *
 * @param comboObj	멀티콤보 오브젝트
 * @param index		멀티콤보 index
 * @param code		멀티콤보 code
 * @return
 */
function ComSetMultiCombo(comboObj, index, code) {
    var idx = parseInt(index);
    
    //All 일 경우
    if(index == 0) {
    	var count = parseInt(comboObj.GetItemCount())-1;
        if(comboObj.GetItemCheck(idx)) {           
            for(var i=count ; i > 0 ; i--) {    
                comboObj.SetItemCheck(i,true, null, null, false);
            }
        } else {
            for(var i=count ; i > 0 ; i--) {
                comboObj.SetItemCheck(i,false, null, null, false);
            }
        }
    } else {
   //All 이 아닌 경우
        var checkCnt=0;
        var count = parseInt(comboObj.GetItemCount())
        for(var i = 1 ; i <  count; i++) {
            if(comboObj.GetItemCheck(i)) {
                checkCnt++;
            }
        }
        // alert("checkCnt=="+checkCnt+"count=="+count);
        if(checkCnt == count-1) {
            // alert("0 checked")
            comboObj.SetItemCheck(0,true, null, null, false);
        }else{
            // alert("0 unchecked")
            comboObj.SetItemCheck(0,false, null, null, false);
        }
    }
}

function ComSetMultiCombo2(comboObj, index, code) {
    var idx = parseInt(index);
    
    //All 일 경우
    if(index == 0) {
    	var count = parseInt(comboObj.GetItemCount())-1;
        if(comboObj.GetItemCheck(idx)) {           
            for(var i=count ; i > 0 ; i--) {    
                comboObj.SetItemCheck(i,false, null, null, false);
            }
        } 
    } else {
   //All 이 아닌 경우
        var checkCnt=0;
        var count = parseInt(comboObj.GetItemCount())
        for(var i = 1 ; i <  count; i++) {
            if(comboObj.GetItemCheck(i)) {
                checkCnt++;
            }
        }
        // alert("checkCnt=="+checkCnt+"count=="+count);
        if(checkCnt == count-1) {
            // alert("0 checked")
            comboObj.SetItemCheck(0,true, null, null, false);
            for(var i=count ; i > 0 ; i--) {    
                comboObj.SetItemCheck(i,false, null, null, false);
            }
        }else{
            // alert("0 unchecked")
            comboObj.SetItemCheck(0,false, null, null, false);
        }
    }
}



function ComSetMultiComboHeight(comObj){
	comObj.SetDropHeight(comObj.GetItemHeight() * comObj.GetItemCount() +3);
}

function paramToForm(param){
	
	if(document.upLoadForm){
		document.body.removeChild(document.upLoadForm);
	}
	
	var cForm = document.createElement("form");
	cForm.setAttribute("id", "upLoadForm");
	cForm.setAttribute("name", "upLoadForm");
	
	var arrParam = param.split("&");
	for(var i=0; i < arrParam.length ; i++){
		var paramText = arrParam[i].split("=");
		var frmObj = document.createElement("input");
		frmObj.setAttribute("type", "hidden");
		frmObj.setAttribute("name", paramText[0]);
		frmObj.setAttribute("id", paramText[0]);
		frmObj.setAttribute("value", paramText[1]);
		cForm.appendChild(frmObj);
	}
	document.body.appendChild(cForm);
}


function ComFireEvent(obj, eventName){

    if (document.createEventObject){
        // dispatch for IE
        var event = document.createEventObject();
        obj.fireEvent('on'+eventName , event)
    }
    else{
        // dispatch for firefox + others
    	var event = document.createEvent("HTMLEvents");
    	event.initEvent(eventName,true,false)
    	obj.dispatchEvent(event);
    }
}

function ComMultiComboHeight(obj){
	obj.SetDropHeight(obj.GetItemCount() * obj.GetItemHeight());
}

function getAsKeyCode(askcode){
	var returnVal = "";
    switch( askcode ) {
    	case 48:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = ")" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;
    	case 49:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "!" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;
    	case 50:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "@" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 51:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "#" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 52:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "$" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 53:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "%" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 54:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "^" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 55:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "&" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 56:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "*" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

    	case 57:
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "(" ;
	    	} else{
	    		returnVal = "" ;
	    	}
    		break;

	    case 110 :
	    	returnVal =  "." ; 
	    	break;
	    case 111 :
	    	returnVal =  "/" ; 
	    	break;
	    case 106 :
	    	returnVal = "*" ;
	        break;
	    case 107 :
	    	returnVal = "+" ;
	        break;
	    case 109 :
	    	returnVal = "-" ;
	        break;
	    case 186 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = ":" ;
	    	} else{
	    		returnVal = ";" ;
	    	}
	    	break;
	    case 187 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "+" ;
	    	} else{
	    		returnVal = "=" ;
	    	}
	        break;
	    case 188 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "<" ;
	    	} else{
	    		returnVal = "," ;
	    	}
	        break;
	    case 189 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "_" ;
	    	} else{
	    		returnVal = "-" ;
	    	}
	        break;
	    case 190 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = ">" ;
	    	} else{
	    		returnVal = "." ;
	    	}
	        break;
	    case 191 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "?" ;
	    	} else{
	    		returnVal = "/" ;
	    	}
	        break;
	    case 192 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "~" ;
	    	} else{
	    		returnVal = "`" ;
	    	}
	        break;
	    case 219 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "{" ;
	    	} else{
	    		returnVal = "[" ;
	    	}
	        break;
	    case 220 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "|" ;
	    	} else{
	    		returnVal = "\\" ;
	    	}
	        break;
	    case 221 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "}" ;
	    	} else{
	    		returnVal = "]" ;
	    	}
	        break;
	    case 222 :
	    	if(ComGetEvent("shiftKey")){
	    		returnVal = "\"" ;
	    	} else{
	    		returnVal = "'" ;
	    	}
	        break;
	    case 32 :
	    	returnVal = " " ;
	        break;
	    default:
	    	returnVal = "";
	    	break;
    }
    return returnVal;
}

/*
 * param str : 1233423.123 or "1233423.123"  소수점 4자리 에러
 * param fix : fix point fixed number more then 3
 * return :  string
 */ 
function ComAddThreeDigitComma(str , fix){
	var gubun = true;
	var retValue = "";
	if( typeof(fix) == "number"){ 
		str = parseFloat(str).toFixed(parseInt(fix));
	}
	str = str.toString();	
	
	if(str.substring(0,1)== "-") {
		gubun = false;
	}
	retValue =  str.replace(/[^0-9.]/gi,'').replace(/\B(?=(\d{3})+(?!\d))/g, ',');
	
	if(gubun){
		return retValue;
	} else {
		return "-"+retValue;
	}
	
}

function ComGetWebColor(rgb)
{
	if( rgb == "") return "";
	rgb = rgb.match(/^rgb\((\d+),\s*(\d+),\s*(\d+)\)$/);
	function hex(x) {
		return ("0" + parseInt(x).toString(16)).slice(-2);
	}
	return "#" + hex(rgb[1]) + hex(rgb[2]) + hex(rgb[3]);
}