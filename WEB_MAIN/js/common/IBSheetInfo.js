/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : IBSheetInfo.js
*@FileTitle  : 업무 공통용 js
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================*/
    /*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/

    /* 페이지의 파일명을 제외한 기본 위치 url
     * 예를 들어 http://211.41.15.40:9001/Sample_IBSheet/sheet/me.html이 현재페이지 이면
     * page_path 값은 "/Sample_IBSheet/sheet/" 이다
    **/
    var page_path = location.pathname;
    page_path = page_path.substr(0,page_path.lastIndexOf("/")+1);
    //모달로 열었을때는 처음에 "/"로 시작하지 않을수 있음
    if (page_path.charAt(0) != "/") page_path = "/" + page_path;

    /* MergeSheet 속성에 설정 값 */
    msNone            = 0;      // 머지 없음
    msAll             = 1;      // 전부 머지 가능
    msPrevColumnMerge = 2;      // 앞 컬럼이 머지 된 경우 해당 행 안에서 머지 가능
    msHeaderOnly      = 5;      // 해더만 머지

    /* InitDataProperty 함수에 DataType 인자에 설정 하는 값 */
    dtNull            = -1;     // 없음
    dtData            = 0;      // 일반 데이터
    dtStatus          = 1;      // 트랜잭션 상태
    dtDelCheck        = 2;      // 삭제 체크 박스
    dtDelCheckEx      = 3;      // 삭제 체크 박스 + 실제 지움
    dtCheckBox        = 4;      // 선택 체크 박스
    dtHidden          = 5;      // 숨겨진 데이터
    dtCombo           = 6;      // 콤보 형 데이터
    dtComboEdit       = 7;      // 콤보 형 데이터 + Edit가능
    dtPopup           = 8;      // 팝업 버튼 형 데이터 + OnPopup 이벤트 발생 + 값에 대한 포멧기능무시
    dtPopupEdit       = 9;      // 팝업 버튼 형 데이터 + OnPopup 이벤트 발생 + Edit 가능 + 값에 대한 포멧기능무시
    dtFileUp          = 10;     // 파일 업로드 형 데이터
    dtResult          = 11;     // 트랜잭션 결과
    dtAutoSum         = 12;     // 자동 계산 컬럼
    dtAutoSumEx       = 13;     // 자동 계산 + 삭제된 행 계산 제외
    dtAutoAvg         = 14;     // 자동 평균 컬럼
    dtAutoAvgEx       = 15;     // 자동 평균 + 삭제된 행 계산 제외
    dtImage           = 16;     // 이미지 형
    dtSeq             = 17;     // 시퀀스
    dtPassword        = 18;     // 패스워드
    dtHiddenStatus    = 19;     // dtStatus + 숨겨짐
    dtImageText       = 20;     // 이미지 + 텍스트
    dtDataSeq         = 21;     // 데이터 순번
    dtPopupFormat     = 22;     // 팝업 버튼 형 데이터 + OnPopup 이벤트 발생 + 값에대한포멧기능사용
    dtPopupEditFormat = 23;     // 팝업 버튼 형 데이터 + OnPopup 이벤트 발생 + Edit 가능  + 값에 대한 포멧기능사용
    dtDummyCheck      = 24;     // Dummy 체크박스
    dtRadioCheck      = 25;     // Dummy 체크박스


    /* InitDataProperty 함수에 DataAlign 인자에 설정 하는 값 */
    daNull            = -1;     // 없음
    daLeft            = 0;      // 좌측 가운데 정렬
    daCenter          = 1;      // 가운데 가운데 정렬
    daRight           = 2;      // 우측 가운데 정렬
    daLeftTop         = 3;      // 좌측 상단 정렬
    daLeftBottom      = 4;      // 좌측 하단 정렬
    daCenterTop       = 5;      // 가운데 상단 정렬
    daCenterBottom    = 6;      // 가운데 바닥 정렬
    daRightTop        = 7;      // 우측 상단 정렬
    daRightBottom     = 8;      // 우측 바닥 정렬


    /*InitDataProperty 함수에 DataFormat 인자에 설정 하는 값 */
    dfNull            = -1;     // 없음
    dfNone            = 0;      // 포멧 없음
    dfDateYmd         = 1;      // 날짜-년월일 YYYY.MM.DD
    dfDateYm          = 2;      // 날짜-년월 YYYY.MM
    dfDateMd          = 3;      // 날짜-월일 MM.DD
    dfTimeHms         = 4;      // 시간-시분초 HH:MM:SS
    dfTimeHm          = 5;      // 시간-시분 HH:MM
    dfIdNo            = 6;      // 주민등록번호
    dfSaupNo          = 7;      // 사업자 번호
    dfCardNo          = 8;      // 카드 번호
    dfPostNo          = 9;      // 우편번호
    dfInteger         = 10;     // 정수(Default 0)
    dfFloat           = 11;     // 실수(Default 0.0)
    dfNullInteger     = 12;     // 정수(Default null)
    dfNullFloat       = 13;     // 실수(Default null)
    dfNumber          = 14;     // 숫자
    dfHanKey          = 15;     // 한글 입력 모드
    dfEngKey          = 16;     // 영문 입력 모드
    dfEngUpKey        = 17;     // 영문 대문자 입력 모드
    dfEngDnKey        = 18;     // 영문 소문자 입력 모드
    dfUserFormat      = 19;     // 사용자 설정형 포멧
    dfUserFormat2     = 20;     // 사용자 설정형 포멧, 마스크 구분자가 2개인 경우
    dfFloatOrg        = 21;     // AM3107 FloatOrg 추가함 (합계시 소실 없음)
    dfNullFloatOrg    = 22;     // AM3107 NullFloatOrg 추가함 (합계시 소실 없음)

    /*GetDataProperty 함수에서 DataPropertyChoice 인자에 설정 하는 값 */
    dpDataType        = 0;      // 데이터 타입
    dpDataAlign       = 1;      // 데이터 정렬
    dpDataFormat      = 2;      // 데이터 포멧
    dpSaveName        = 3;      // 저장 변수명
    dpKeyField        = 4;      // 필수 입력 여부
    dpCalcuLogic      = 5;      // 계산 공식
    dpPointCount      = 6;      // 소숫점 이하 자리 개수
    dpUpdateEdit      = 7;      // 수정 가능 여부
    dpInsertEdit      = 8;      // 입력 가능 여부
    dpEditLen         = 9;      // 입력 길이
    dpFullInput       = 10;     // 전체 입력 여부
    dpColumnSort      = 11;     // 소트 가능 여부
    dpVisAllCheck     = 12;     // 전체 CheckBox 여부
    dpSaveStatus      = 13;     // 저장 상태 코드
    dpFormatFix       = 14;     // 포멧 고정 여부
    dpValidType       = 15;     // Validation Type
    dpValidChar       = 16;     // Validation Char

    poDefault         = 0;      // 페이지에 설정된 값 그대로
    poPortrait        = 1;      // 세로 페이지
    poLandscape       = 2;      // 가로 페이지

    /* SelectionMode 속성에 설정하는 값 */
    smSelectionFree   = 0;      // 자유 선택 모드
    smSelectionRow    = 1;      // 행단위 선택 모드
    smSelectionCol    = 2;      // 컬럼단위 선택 모드
    smSelectionList   = 3;      // 행단위 랜덤 선택 모드

    /* BasicImeMode 속성에 설정하는 값 */
    imeAuto           = 0;      // 마지막 상태를 그대로 사용
    imeHan            = 1;      // 기본 상태를 한글 입력 상태로 함
    imeEng            = 2;      // 기본 상태를 영문 입력 상태로 함

    /* GridLine 속성에 설정하는 값 */
    glNone            = 0;      // 선없음
    glFlat            = 1;      // 기본선
    glFlatHorz        = 4;      // 평면가로선만 있고, 세로선은 없음
    glFlatVert        = 8;      // 평면세로선만 있고, 가로선은 없음


    /* InitDataValid 함수에서 ValidType 인자에 설정하는 값 - 2.4.0.0 */
    vtNone            = 0;      // 자동으로 처리
    vtCharOnly        = 1;      // ValidChart에 설정된 글자만 처리
    vtNumericOnly     = 2;      // 숫자만 입력
    vtEngOnly         = 3;      // 영문만 입력
    vtHanOnly         = 4;      // 한글만 입력
    vtNumericOther    = 5;      // 숫자+기타글자
    vtEngOther        = 6;      // 영문+기타글자
    vtHanOther        = 7;      // 한글+기타글자
    vtExceptChar      = 8;      // ValidChart에 설정된 글자만 빼고 모두 입력
    vtEngUpOnly       = 9;      // 영문대문자만 입력, 키보드 입력시 소문자를 입력해도 자동 대문자로 표시
    vtEngDnOnly       = 10;     // 영문소문자만 입력, 키보드 입력시 대문자로 입력해도 자동 소문자로 표시
    vtEngUpOther      = 11;     // 영문대문자+기타글자, 키보드 입력시 소문자를 입력해도 자동 대문자로 표시
    vtEngDnOther      = 12;     // 영문소문자+기타글자, 키보드 입력시 대문자로 입력해도 자동 소문자로 표시

    /* FocusStyle 속성에 설정하는 값 - 2.4.0.0 */
    fsNone            = 0;      // 모양 없음
    fsLight           = 1;      // 점선 모양 (기본모양)
    fsHeavy           = 2;      // 굵은 회색 테두리 모양
    fsSolid           = 3;      // SelectBackColor 색상의 실선
    fsRaised          = 4;      // 입체적으로 나온 모양
    fsInset           = 5;      // 안으로 들어간 모양

    /**
     * 에러메시지를 표시한다. IBS_ShowErrMsg 대신 이 함수를 사용해야 한다.
     * @param   : sMsg      - 메시지
     * @return  : 없음
     * @version : 3.4.0.50
     * @sample
     *  IBS_ShowErrMsg("에러가 발생했습니다.");
     */
    function IBS_ShowErrMsg(sMsg) {
        return alert("[IBSheetInfo.js]\n" + sMsg);
    }
    /**
     * Form오브젝트 안에 있는 컨트롤을 QueryString으로 구성한다. 이때, 한글은 인코딩하지 않는다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var sCondParam=FormQueryString(document.frmSearch); //결과:"txtname=이경희&rdoYn=1&sltMoney=원화";
     * </pre>
     * @param {form} form Form 오브젝트
     * @param {bool} bRemoveSep dataformat이 설정된 값인 경우 구분자를 빼고 값을 가져와서 QueryString에서 사용한다.
     * @return string
     * @version 1.0.0.0
     * @see #FormQueryStringEnc
     */
    function FormQueryString(form, bRemoveSep) {

    	if (typeof form != "object" ) {
            IBS_ShowErrMsg("Parameter of FormQueryString is not FORM tag.");
            return "";
        }
    	if (bRemoveSep == undefined) bRemoveSep = false;


        var name = new Array(form.elements.length);
        var value = new Array(form.elements.length);
        var j = 0;
        var plain_text = "";

        //사용가능한 컨트롤을 배열로 생성한다.
        len = form.elements.length;
        for (i = 0; i < len; i++) {
            var prev_j = j;
            switch (form.elements[i].type) {
                case undefined:
                case "button":
                case "reset":
                case "submit":
                    break;
                case "radio":
                case "checkbox":
                    if (form.elements[i].checked == true) {
                        name[j] = IBS_getName(form.elements[i]);
                        value[j] = form.elements[i].value;
                        j++;
                    }
                    break;
                case "select-one":
                    name[j] = IBS_getName(form.elements[i]);
                    var ind = form.elements[i].selectedIndex;
                    if (ind >= 0) {

                        value[j] = form.elements[i].options[ind].value;

                    } else {
                        value[j] = "";
                    }
                    j++;
                    break;
                case "select-multiple":
                    name[j] = IBS_getName(form.elements[i]);
                    var llen = form.elements[i].length;
                    var increased = 0;
                    for (k = 0; k < llen; k++) {
                        if (form.elements[i].options[k].selected) {
                            name[j] = IBS_getName(form.elements[i]);
                            value[j] = form.elements[i].options[k].value;

                            j++;
                            increased++;
                        }
                    }
                    if (increased > 0) {
                        j--;
                    } else {
                        value[j] = "";
                    }
                    j++;
                    break;
                default:
                    name[j] = IBS_getName(form.elements[i]);
                    value[j] = form.elements[i].value;
                    if (bRemoveSep && getDataFormat(form.elements[i])!="")value[j] = ComTrimAll(value[j]," ", "-", ":",  ","); 
                    j++;
            }

         
        }
        

        for (i = 0; i < j; i++) {
            // if (name[i] != '') plain_text += name[i]+ "=" + value[i] + "&";
        	//mig-name은 제외하고 value만 인코딩한다. IE와 crom에서 동일하게 사용할수 있다.
            if (name[i] != '') plain_text += name[i]+ "=" + encodeURIComponent(value[i]) + "&";
        }

      //마지막에 &를 없애기 위함
      if (plain_text != "")
        plain_text = plain_text.substr(0, plain_text.length -1);
        return plain_text;
    }

    /**
     * Form오브젝트 안에 있는 컨트롤을 QueryString으로 구성한다. 이때, 한글은 인코딩한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var sCondParam=FormQueryStringEnc(document.frmSearch, mySheet1);
     *     원본:"txtname=이경희&rdoYn=1&sltMoney=원화";
     *     결과:"txtname=%C0%CC%B0%E6%C8%F1&rdoYn=1&sltMoney=%BF%F8%C8%AD";                //UTF16인 경우
     *     결과:"txtname=%EC%9D%B4%EA%B2%BD%ED%9D%AC&rdoYn=1&sltMoney=%EC%9B%90%ED%99%94"; //UTF8인 경우
     * </pre>
     * @param {form}    form     필수,Form 오브젝트
     * @param {ibsheet} sheet    필수,한글을 인코딩할 Sheet의 Object id
     * @return string
     * @version 1.0.0.0
     * @see #FormQueryString
     */
    function FormQueryStringEnc(form, sheet) {
    	 if (typeof form != "object" ) {
    	        IBS_ShowErrMsg("Parameter of FormQueryStringEnc is not FORM tag.");
    	        return "";
    	    }


    	  

    	    var name = new Array(form.elements.length);
    	    var value = new Array(form.elements.length);
    	    var j = 0;
    	    var plain_text = "";

    	    //사용가능한 컨트롤을 배열로 생성한다.
    	    len = form.elements.length;
    	    for (i = 0; i < len; i++) {
    	        var prev_j = j;
    	        switch (form.elements[i].type) {
    	            case "button":
    	            case "reset":
    	            case "submit":
    	                break;
    	            case "radio":
    	            case "checkbox":
    	                if (form.elements[i].checked == true) {
    	                    name[j] = IBS_getName(form.elements[i]);
    	                    value[j] = form.elements[i].value;
    	                    j++;
    	                }
    	                break;
    	            case "select-one":
    	                name[j] = IBS_getName(form.elements[i]);
    	                var ind = form.elements[i].selectedIndex;
    	                if (ind >= 0) {

    	                    value[j] = form.elements[i].options[ind].value;

    	                } else {
    	                    value[j] = "";
    	                }
    	                j++;
    	                break;
    	            case "select-multiple":
    	                name[j] = IBS_getName(form.elements[i]);
    	                var llen = form.elements[i].length;
    	                var increased = 0;
    	                for (k = 0; k < llen; k++) {
    	                    if (form.elements[i].options[k].selected) {
    	                        name[j] = IBS_getName(form.elements[i]);

    	                        value[j] = form.elements[i].options[k].value;

    	                        j++;
    	                        increased++;
    	                    }
    	                }
    	                if (increased > 0) {
    	                    j--;
    	                } else {
    	                    value[j] = "";
    	                }
    	                j++;
    	                break;
    	            default:

    	                name[j] = IBS_getName(form.elements[i]);
    	                value[j] = form.elements[i].value;
    	                j++;
    	        }

    	       
    	    }
	    for (i = 0; i < j; i++) {
	        if (name[i] != '') plain_text += encodeURIComponent(name[i]) + "=" + encodeURIComponent(value[i]) + "&";
	    }

	    //마지막에 &를 없애기 위함
	    if (plain_text != "") plain_text = plain_text.substr(0, plain_text.length - 1);

	    return plain_text;
    }

    /**
     * Form오브젝트 안에 있는 컨트롤을 QueryString으로 구성한다. 이때, 한글은 인코딩하지 않는다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     var sCondParam=FormQueryStringOrg(document.frmSearch); //결과:"txtname=이경희&rdoYn=1&sltMoney=원화";
     * </pre>
     * @param {form} form Form 오브젝트
     * @return string
     * @version 1.0.0.0
     * @see #FormQueryStringEnc
     */
	function FormQueryStringOrg(form) {
		if (typeof form != "object" ) {
	        IBS_ShowErrMsg("Parameter of FormQueryString is not FORM tag.");
	        return "";
	    }

	   

	    var name = new Array(form.elements.length);
	    var value = new Array(form.elements.length);
	    var j = 0;
	    var plain_text = "";

	    //사용가능한 컨트롤을 배열로 생성한다.
	    len = form.elements.length;
	    for (i = 0; i < len; i++) {
	        var prev_j = j;
	        switch (form.elements[i].type) {
	            case undefined:
	            case "button":
	            case "reset":
	            case "submit":
	                break;
	            case "radio":
	            case "checkbox":
	                if (form.elements[i].checked == true) {
	                    name[j] = IBS_getName(form.elements[i]);
	                    value[j] = form.elements[i].value;
	                    j++;
	                }
	                break;
	            case "select-one":
	                name[j] = IBS_getName(form.elements[i]);
	                var ind = form.elements[i].selectedIndex;
	                if (ind >= 0) {

	                    value[j] = form.elements[i].options[ind].value;

	                } else {
	                    value[j] = "";
	                }
	                j++;
	                break;
	            case "select-multiple":
	                name[j] = IBS_getName(form.elements[i]);
	                var llen = form.elements[i].length;
	                var increased = 0;
	                for (k = 0; k < llen; k++) {
	                    if (form.elements[i].options[k].selected) {
	                        name[j] = IBS_getName(form.elements[i]);
	                        value[j] = form.elements[i].options[k].value;

	                        j++;
	                        increased++;
	                    }
	                }
	                if (increased > 0) {
	                    j--;
	                } else {
	                    value[j] = "";
	                }
	                j++;
	                break;
	            default:
	                name[j] = IBS_getName(form.elements[i]);
	                value[j] = form.elements[i].value;
	                j++;
	        }


	    }
	    //QueryString을 조합한다.
	    for (i = 0; i < j; i++) {
	        if (name[i] != '') plain_text += name[i] + "=" + value[i] + "&";
	    }

	    //마지막에 &를 없애기 위함
	    if (plain_text != "") plain_text = plain_text.substr(0, plain_text.length - 1);

	    return plain_text;
}

	function IBS_getName(obj) {
	    if (obj.name != "") {
	        return obj.name;
	    } else if (obj.id != "") {
	        return obj.id;
	    } else {
	        return "";
	    }
	}

	
    /**
     * 2개 Sheet에서 행을 이동하는데 특정 컬럼(chkCol)이 체크된 행만 이동한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     IBS_Sheet2SheetCheck(mySheet1, mySheet2, 2);     //mySheet1의 2컬럼이 체크된 행만 mySheet2로 이동한다.
     *     IBS_Sheet2SheetCheck(mySheet1, mySheet2, "chk"); //mySheet1의 SaveName="chk"인 컬럼이 체크된 행만 mySheet2로 이동한다.
     * </pre>
     * @param {ibsheet}     fromSheet 이동 원본 Sheet의 Object id
     * @param {ibsheet}     toSheet   이동 대상 Sheet의 Object id
     * @param {int,string}  chkCol    체크박스 컬럼의 인덱스 또는 SaveName
     * @return 없음
     * @version 2.4.0.0
     * @see #IBS_Sheet2SheetStatus
     */
	function IBS_Sheet2SheetCheck(fromSheet, toSheet, chkCol)  {
		  //함수 인자 유효성 확인
		  if ((!fromSheet) || (!fromSheet.IBSheetVersion)) 
		    return alert("fromSheet parameter in IBS_Sheet2SheetCheck is not IBSheet.");
		  else if ((!toSheet) || (!toSheet.IBSheetVersion))
		    return alert("toSheet parameter in IBS_Sheet2SheetCheck is not IBSheet.");
		  else if (chkCol < 0 || chkCol > fromSheet.LastCol())
		    return alert("chkCol parameter in IBS_Sheet2SheetCheck is out of range.");
		  //데이터 행의 개수 확인
		  var toRow = toSheet.RowCount();

		    fromSheet.RenderSheet(0);
			toSheet.RenderSheet(0);
		  //원본에서 역순으로 Check 된 데이터를 확인하여 이동
		  for (ir = fromSheet.LastRow(); ir>= fromSheet.HeaderRows(); ir--) {
		    //Check 되지 않은 경우 건너뜀
		    if (fromSheet.GetCellValue(ir, chkCol) == '0') continue;
		    //데이터 행 추가
		    toRow = toSheet.DataInsert(toRow);
		    //데이터 옮기기
		    for (ic = 0; ic<=fromSheet.LastCol(); ic++) {
		      //체크 컬럼은 빼고 옮김
		      if (ic == chkCol) continue;
		      toSheet.SetCellValue(toRow,ic,fromSheet.GetCellValue(ir,ic));
		    }
		    //원본에서 지움
		    fromSheet.RowDelete(ir, false);
		    toRow--;
		  }
			toSheet.RenderSheet(1);
		    fromSheet.RenderSheet(1);
		}
	


    /**
     * 2개 Sheet에서 행을 이동하는데 특정 트랜잭션 상태(sStatus)의 행만 이동한다. <br>
     * 트랜잭션 상태 코드는 조회("R"), 입력("I"), 수정("U"), 삭제("D")로 나눠지며, 이동해야할 트랜잭션상태코드를 "|"로 연결하여 조합한다. <br>
     * 예를 들어 다음 샘플을 참고한다.
     * <br><b>Example :</b>
     * <pre>
     *     IBS_Sheet2SheetStatus(mySheet1, mySheet2, "U");  //mySheet1에서 트랜잭션상태가 "수정"인 행만 mySheet2로 이동한다.
     *     IBS_Sheet2SheetStatus(mySheet1, mySheet2, "U|D");//mySheet1에서 트랜잭션상태가 "수정" 또는 "삭제"인 행만 mySheet2로 이동한다.
     * </pre>
     * @param {ibsheet}     fromSheet 이동 원본 Sheet의 Object id
     * @param {ibsheet}     toSheet   이동 대상 Sheet의 Object id
     * @param {string}      sStatus   트랜잭션상태코드
     * @return 없음
     * @version 2.4.0.0
     * @see #IBS_Sheet2SheetCheck
     */
	function IBS_Sheet2SheetStatus(fromSheet, toSheet, sStatus)  {
		  //함수 인자 유효성 확인
		  if ((!fromSheet) || (!fromSheet.IBSheetVersion))
		    return alert("fromSheet parameter of IBS_Sheet2SheetStatus is not IBSheet.");
		  else if ((!toSheet) || (!toSheet.IBSheetVersion))
		    return alert("toSheet parameter of IBS_Sheet2SheetStatus is not IBSheet.");
		  //데이터 행의 개수 확인
		  var fromRow = 0;
		  var sRow = fromSheet.FindStatusRow(sStatus);
		  if ( sRow == "" ) return;
		  var arrRow = sRow.split(";");
		  var rowXml = "";
		  var allXml="<?xml version='1.0'  ?><SHEET>  <DATA>";
		  //원본에서 역순으로 특정 상태의 행을 이동한다.
		  for (ir=0; ir < arrRow.length; ir++) {
		    fromRow = arrRow[ir];
		    //옮길 데이터를 xml로 구성한다.
		    rowXml="<TR>";
		    for (ic = 0; ic<=fromSheet.LastCol(); ic++) {
		      rowXml += "<TD>" + fromSheet.GetCellValue(fromRow,ic) + "</TD>";
		    }
		    rowXml += "</TR>";
		    allXml += rowXml;
		  }
		  //원본에서 역순으로 특정 상태의 행을 이동한다.
		  for (ir = arrRow.length-1; ir >=0 ; ir--) {
		    fromRow = arrRow[ir];
		    //원본에서 지움
		    fromSheet.RowDelete(fromRow, false);
		  }
		  allXml += "</DATA></SHEET>";
		//파라메타변경[확인요망]:   
			toSheet.LoadSearchData(allXml, true);
		}
	

    /**
     * Sheet의 모든 행을 조회XML 문자열로 구성하여 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     sXml = IBS_GetDataSearchXml(mySheet);
     * </pre>
     * @param {ibsheet} sheet_obj  Sheet의 Object id
     * @return string
     * @version 2.4.0.0
     */
	function IBS_GetDataSearchXml(sheet_obj)  {
		  //함수 인자 유효성 확인
		  if ((!sheet_obj) || (!sheet_obj.IBSheetVersion)){
		    alert("sheet_obj of IBS_GetDataSearchXml is not IBSheet.");
		    return "";
		  }
		  var rowXml = "";
		  var allXml="<?xml version='1.0'  ?>\n<SHEET>\n  <DATA TOTAL='"+ sheet_obj.TotalRows +"'>\n";

		  for (ir = sheet_obj.HeaderRows(); ir <= sheet_obj.LastRow(); ir++) {
		    rowXml="    <TR>";
		    for (ic = 0; ic<= sheet_obj.LastCol(); ic++) {
		      //셀의 값을 변수에 저장한다.
		      var sValue = String(sheet_obj.GetCellValue(ir,ic));
		      //특수문자(&, <, >)가 포함된 경우만 CDATA로 감싼다
		      if (sValue.indexOf("&") > -1 || sValue.indexOf("<") > -1 || sValue.indexOf(">") > -1) {
		        sValue="<![CDATA[" + sValue + "]]>";
		      }
		      //XML을 만든다.
		      rowXml += "<TD>" + sValue + "</TD>";
		    }
		    rowXml += "</TR>\n";
		    allXml += rowXml;
		  }
		  allXml += "  </DATA>\n</SHEET>";
		  return allXml;
		}

    /**
     * 각 컬럼의 Alias인 SaveName을 특정 구분자(delim)으로 조합하여 리턴한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     sXml = IBS_ConcatSaveName(mySheet,"|");
     * </pre>
     * @param {ibsheet}     sheet  Sheet의 Object id
     * @param {string}      delim  문자열연결 구분자
     * @return string
     * @version 2.4.0.0
     */
    function IBS_ConcatSaveName(sheet, delim)
    {
      if (delim == null) delim = "|";
      
      var savenames = new Array();
      for ( var n = 0; n <= sheet.LastCol(); n++ )
      {
        savenames[n] = sheet.GetCellProperty(0, n, "SaveName");
      }
      return savenames.join(delim);
    }

    /**
     * Sheet에 존재하는 EtcData의 값을 폼의 객체에 채운다. 주로 조회 함수 사용후 이 함수를 사용한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     IBS_EtcDataToForm(document.frmData, mySheet);
     * </pre>
     * @param {form}    form     필수,Form 오브젝트
     * @param {ibsheet} ibsheet  필수,Sheet의 Object id
     * @return string
     * @version 2.4.0.0
     */
    function IBS_EtcDataToForm(form,ibsheet){
    	  if (typeof form != "object" ) {
    	    return alert("parameter of IBS_GetEtcDataToForm is not FORM tag.");
    	  }  else if ((!ibsheet) || (!ibsheet.IBSheetVersion)) {
    	    return alert("ibsheet parameter of IBS_GetEtcDataToForm is not IBSheet tag.");
    	  }
    	  //form을 리셋한다.
    	  form.reset();
    	  var j = 0;
    	  //사용가능한 컨트롤을 배열로 생성한다.
    	  len = form.elements.length;
    	  for (i=0; i < len; i++) {
    	      var xvalue = ibsheet.GetEtcData(form.elements[i].name);
    	      if ( xvalue == undefined)  continue;
    	      switch (form.elements[i].type) {
    	        case "button":
    	        case "reset":
    	        case "submit":
    	          break;
    	        case "radio":
    	          var eRadio = document.all[form.elements[i].name];
    	          var idx = 0;
    	          for(var k=0; k < eRadio.length; k++) {
    	            if (eRadio[k].value == xvalue) {
    	              idx = k;
    	              break;
    	            }
    	          }
    	          eRadio[idx].checked = true;
    	          break;
    	        case "checkbox":
    	          form.elements[i].checked = xvalue;
    	          break;
    	        case "select-one":
    	            var eOpt = form.elements[i].options;
    	            var idx = 0;
    	            if(eOpt != null && eOpt.length != null && eOpt.length >= 1) {
    	              var opt_len = eOpt.length;
    	              for(var k=0; k < opt_len; k++) {
    	                if(eOpt[k].value == xvalue) {
    	                  idx = k;
    	                  break;
    	                }
    	              }
    	            }
    	            form.elements[i].selectedIndex = idx;
    	            break;
    	          case "select-multiple":  //선택될 값이 '|' 를 구분자로 입력되어있다고 가정한다.
    	            var eOpt = form.elements[i].options;
    	            var idx = 0;
    	            if(eOpt != null && eOpt.length != null && eOpt.length >= 1) {
    	              var opt_len = eOpt.length;
    	              var tvalue = xvalue.split("|");
    	              var tval_len = tvalue.length;
    	              for(var k=0; k < opt_len; k++) {
    	                for(var m=0; m < tval_len;m++){
    	                  if(eOpt[k].value==tvalue[m])  eOpt[k].selected = true;
    	                }
    	              }
    	            }
    	            break;
    	          default :
    	             form.elements[i].value = xvalue;
    	        }//switch
    	  }//for
    	}

    /**
     * 이 함수는 대량의 데이터를 조회시 조회속도를 개선하기 위해서 Sax를 이용한 조회 함수이다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     IBS_DoSearchSax(mySheet,"EES_EQR_060.xml",FormQueryString(formObj));
     * </pre>
     * @param   {ibsheet} sheetobj      필수,IBSheet Object ID
     * @param   {string}  PageUrl       필수,조회 처리할 페이지 파일 이름
     * @param   {string}  CondParam     선택,조회조건 QueryString
     * @param   {string}  PageParam     선택,페이지 조건 QueryString
     * @param   {bool}    IsAppend      선택,조회된 내용을 이어서 쓸지 여부
     * @param   {number}  AppendRow     선택,IsAppend 인자가 true인 경우 이어쓸 행의 Row Index
     * @return  bool, 조회 완료 여부
     * @version 3.1.0.0
     */
    function IBS_DoSearchSax(sheetobj, PageUrl, CondParam, PageParam, UsePost, IsAppend, AppendRow) 
    {
      //함수의 인자 유효성 확인
      if  ((!sheetobj) || (!sheetobj.IBSheetVersion)){
        return alert("sheetobj parameter of IBS_SpeedDoSearch is not IBSheet tag.");
      }
      
      if (CondParam == "undefined") CondParam = "";
      if (PageParam == "undefined") PageParam = "";
      if (UsePost   == "undefined") UsePost = false;
      if (IsAppend == "undefined")  IsAppend = false;
      if (AppendRow == "undefined") AppendRow = -1;
      //MassOfSearch=1인 경우 Sax를 사용하지 않고, DoSearch를 그대로 이용한다.
      //if (sheetobj.MassOfSearch==1) {
        //지원안함[확인요망]: if (UsePost){
    //파라메타변경[확인요망]:       return sheetobj.DoSearch("PageUrl","CondParam&PageParam",{Append:IsAppend} );
        //}else{
    //함수변경[확인요망]:       
    		return sheetobj.DoSearch(PageUrl ,CondParam+"&"+PageParam,{Append:IsAppend} );
        //}
      //}
      //1. 서버를 연결하여 조회결과를 XML로 가져온다.
    //지원안함[확인요망]: //파라메타변경[확인요망]:   var s_Xml = sheetobj.GetSearchData(PageUrl, CondParam, PageParam, UsePost);
      //2. 가져온 조회XML에서 SAX가 파싱할수 없는 특수문자를 제거한다.
      //s_Xml = s_Xml.replace(/[\u0000-\u0008\u000B-\u000C\u000E-\u001F\uD800-\uDB7F\uDB80-\uDBFF\uDC00-\uDFFF\uFFFE\uFFFF]/g, " ");
      //3. 특수문자가 걸러진 XML을 파싱하여 Sheet로 로드한다.
      //지원안함[확인요망]: return sheetobj.LoadSearchXml4Sax(s_Xml, IsAppend, AppendRow);  
    } 

    

    /**
     * Sheet의 특정행의 값을 Form의 각 컨트롤에 값을 복사한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     IBS_CopyRowToForm(mySheet, document.mainForm);
     *     IBS_CopyRowToForm(mySheet, document.mainForm, mySheet.SelectedRow);
     *     IBS_CopyRowToForm(mySheet, document.mainForm, 1, "str_");
     *
     *     &lt;script for="mySheet" event="OnSelectCell(or,oc,nr,nc)"&gt;
     *       if(nr &lt; HeaderRows || nr &gt; LastRow||RowCount  == 0) return mainForm.reset();
     *       if(or==nr) return;
     *
     *       IBS_CopyRowToForm(mySheet, mainForm);
     *     &lt;/script&gt;
     * </pre>
     * @param   {ibsheet} sheetobj  필수,IBSheet Object ID
     * @param   {form}    formobj   필수,html의 Form 오브젝트 Name
     * @param   {int}     row       선택,IBSheet의 복사할 행번호, 인자를 설정하지 않으면 현재 선택된 행이 됨
     * @param   {string}  prefix    선택,Form 안에 있는 컨트롤의 이름앞에 붙는 문자열, 예)"obj_CardNo"이면 이인자는 "obj_"임, 인자를 설정하지 않으면 "frm_"가 기본임
     * @return  없음
     * @version 3.4.0.50
     * @see #IBS_CopyFormToRow
     */
    function IBS_CopyRowToForm(sheetobj, formobj, row, prefix){
    //함수의 인자 유효성 확인-시작
    	if ((!sheetobj) || (!sheetobj.IBSheetVersion)){
    		return alert("sheetobj parameter of IBS_CopyRowToForm is not IBSheet tag.");
    	} else if (formobj==null || typeof formobj != "object") {
    		return IBS_ShowErrMsg("formobj parameter of IBS_Sheetformobj is not FORM tag.");
    	} else if (row!=null && (isNaN(row) || row < 0 || row > sheetobj.LastRow())) {
    		return  ;
    	}
    	//함수의 인자 유효성 확인-종료
    	//HTML컨트롤의 name 앞에 붙는 글자
    	if (prefix == null || prefix=="") prefix="frm_";
    	if (row == null) row=sheetobj.GetSelectRow();
    	//Sheet의 컬럼개수만큼 찾아서 HTML의 Form 각 Control에 값을 설정한다.
    	//컬럼개수만큼 루프 실행
    	for(var col=0;col<=sheetobj.LastCol();col++){
    		//컬럼의 별명을 문자열로 가져온다.
    		var col_alias=sheetobj.ColSaveName(col)
    		if (col_alias=="") continue;
    		var sheetvalue=sheetobj.GetCellValue(row,col);
    		//폼에 있는 해당 이름의 컨트롤을 가져온다.예)"frm_CardNo"
    		var frmchild=formobj.elements[prefix +col_alias];
    		//폼에 해당하는 이름의 컨트롤이 없는 경우는 계속 진행한다.
    		if(frmchild==null || frmchild == undefined) continue;
    		var sType=frmchild.type;
    		//radio의 경우 frmchild가 배열형태가 되므로, frmchild.type으로는 타입을 알수 없다.
    		if (sType==undefined && frmchild.length>0) sType=frmchild[0].type;
    		//타입별로 값을 설정한다.
    		switch(sType) {
    			case "button":
    			case "reset":
    			case "submit":
    				break;
    			case "radio":
    				for (idx=0; idx<frmchild.length; idx++) {
    					if(frmchild[idx].value == sheetvalue) {
    						frmchild[idx].checked=true;
    						break;
    					}
    				}
    				break;
    			case "checkbox":
    				if(sheetvalue =="Y" || sheetvalue == 1){
    					frmchild.checked=true;
    				}else {
    					frmchild.checked=false;
    				}
    				
    				break;
    			default :
    				frmchild.value=sheetvalue;
    		}//end of switch\
    		
    		// Luc Duong fixes case: If sType equals "radio" and frmchild is an array then frmchild there is no function getAttribute
    		var attrIbcb = frmchild.length ? frmchild.length > 0 ? frmchild[0].getAttribute("ibcb-delegate") : "false" : "false";
//    		if(frmchild.getAttribute("ibcb-delegate") == "true"){
   			if(attrIbcb == "true"){
    			eval(frmchild.id).SetSelectCode(sheetvalue);
    		}
    	}//end of for(col)
    }

 /**
     * Form의 각 컨트롤에 값을 Sheet의 특정행의 각 컬럼에 복사한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     IBS_CopyFormToRow(document.mainForm, mySheet);
     *     IBS_CopyFormToRow(document.mainForm, mySheet, mySheet.SelectRow);
     *     IBS_CopyFormToRow(document.mainForm, mySheet, 1, "str_");
     * </pre>
     * @param   {form}    formobj   필수,html의 Form 오브젝트 Name
     * @param   {ibsheet} sheetobj  필수,IBSheet Object ID
     * @param   {int}     row       선택,IBSheet의 붙여넣을 행번호, 인자를 설정하지 않으면 현재 선택된 행이 됨
     * @param   {string}  prefix    선택,Form 안에 있는 컨트롤의 이름앞에 붙는 접두사 문자열, 예)"obj_CardNo"이면 이인자는 "obj_"임, 인자를 설정하지 않으면 "frm_"가 기본임
     * @return  없음
     * @version 3.4.0.50
     * @see #IBS_CopyRowToForm
     */
    function IBS_CopyFormToRow(formobj, sheetobj, row, prefix){
        //함수의 인자 유효성 확인-시작
    	if ((!sheetobj) || (!sheetobj.IBSheetVersion)){
            return alert("sheetobj parameter of IBS_CopyFormToRow is not IBSheet tag.");
       }else if (formobj==null || typeof formobj != "object") {
          return IBS_ShowErrMsg("formobj parameter of IBS_CopyFormToRow is not FORM tag.");
        }else if (row!=null && (isNaN(row) || row < 0 || row > sheetobj.LastRow()+1)) {
          return  ;
        }
        //HTML컨트롤의 name 앞에 붙는 글자
        if (prefix == null || prefix=="") prefix="frm_";
        if (row == null) row=sheetobj.GetSelectRow();
        sheetobj.RenderSheet(0);
        //Sheet의 컬럼개수만큼 찾아서 HTML의 Form 각 Control에 값을 설정한다.
        //컬럼개수만큼 루프 실행
        for(var col=0;col<=sheetobj.LastCol();col++){
          //컬럼의 별명을 문자열로 가져온다.
          var col_alias=sheetobj.ColSaveName(col)
          if (col_alias=="") continue;
          //폼에 있는 해당 이름의 컨트롤을 가져온다.예)"frm_CardNo"
          var frmchild=formobj.elements[prefix +col_alias];
          //폼에 해당하는 이름의 컨트롤이 없는 경우는 계속 진행한다.
          if(frmchild==null || frmchild == undefined) continue;

          var sType=frmchild.type;
          var sValue;
          //radio의 경우 frmchild가 배열형태가 되므로, frmchild.type으로는 타입을 알수 없다.
          if (sType==undefined && frmchild.length>0) sType=frmchild[0].type;
          //타입별로 값을 설정한다.
          switch(sType) {
            case undefined:
            case "button":
            case "reset":
            case "submit":
              break;
            case "radio":
              for (idx=0; idx<frmchild.length; idx++) {
               if(frmchild[idx].checked) {
                  sValue=frmchild[idx].value;
                  break;
                }
              }
              break;
            case "checkbox":
              sValue=(frmchild.checked)?1:0;
              break;
            default :
              sValue=frmchild.value;
          }//end of switch
          sheetobj.SetCellValue(row,col,sValue,0);
        }//end of for(col)
        sheetobj.RenderSheet(1);
      }

	/**
	 * 시트의 콤보중 컬럼이 여러개 일때 선택된 값중 원하는 컬럼의 값을 리턴한다.
     * <br><b>Example :</b>
     * <pre>
     *     ComGetComboText(sheetObj, row, col,1);
     * </pre>
	 * 
	 * @param {ibsheet}     sheetObj  필수, IBSheet Object ID
	 * @param {int}  		row       필수, 대상 Col index
	 * @param {int}         col       필수, 대상 Row index
	 * @param {int}         ishowcol  선택, . default=0
	 * @return 없슴
	 */
    function ComGetComboText(sheetObj, Row, Col, iGetCol) {

	    if (iGetCol==undefined || iGetCol==null) iGetCol = 0;
	
		var sText = sheetObj.GetComboInfo(Row,Col,"Text");
	  	var idx   = sheetObj.GetComboInfo(Row,Col, "SelectedIndex");
	  	var arrText = sText.split("|");
	    var values = arrText[idx].split("\t");
	    return values[iGetCol];
	
    }
	 
    /**
     * IBSheet의 콤보 컬럼에 데이터를 setting한다. <br>
     * <b>Example :</b>
     * <pre>
     *     ComSetIBCombo(sheetObj,sXml,"rcv_de_term_cd",false,1);
     * </pre>
     *
     * @param {string} sheetObj 필수
     * @param {string} sXml 필수, Combo에 채울 데이터(IBSheet를 통해 받아온 xml 문자열.)
     * @param {string} title 필수, Combo field명(IBSheet SaveName).
     * @param {string} iBlank 선택, Combo의 첫번째로우를 블랭크로 설정
     * @param {string} sCol 선택, 멀티콤보일경우 콤보를 선택하면 콤보에 보여질 순서설정(0:코드 or 1:description)
     * @param {string} dCode 선택, 신규 "입력" 상태일 때 기본으로 선택되어야 할 Item에 대한 Code값
     * @param {string} dText 선택, 신규 "입력" 상태일 때 기본으로 선택되어야 할 Item에 대한 Text값
	 * @param {string} bFlag multicombo 용 XML 파일을 Sheet 내에서 Combo 형태로 사용할 경우, Text 에 Code+"\t"+Text 형태로 만들어 사용할 수 있게 해 줌	      
     * (코드|디스크립션 형태가 아닐 경우는 0으로 설정해야함)
     * @return 없슴
     * @author 공백진
     * @version 2009.04.30
     */
    function ComSetIBCombo(sheetObj, sXml, title, iBlank, sCol, dCode, dText, bFlag){
        var showCol=0;
        if (bFlag == undefined || bFlag == ""){
            bFlag=false;
        }
        if (sCol != undefined && sCol !=""){
            showCol=sCol;
        }
        if (iBlank == undefined || iBlank == ""){
            iBlank=false;
        }
        var arrData=ComXml2ComboString(sXml, "cd", "nm");
        if (bFlag == true && arrData != null){
            var arrCode=arrData[0].split("|");
            var arrName=arrData[1].split("|");
            var conData="";
            for(i=0; i < arrName.length;i++){
                if(i==0){
                    arrName[i]=arrCode[i]+"\t"+arrName[i];
                }else{
                    arrName[i]="|"+arrCode[i]+"\t"+arrName[i];
                }
                conData=conData.concat(arrName[i]);
            }
            arrData[1]=conData;
        }
        if(iBlank){
            arrData[0]=" |" + arrData[0];
            arrData[1]=" |" + arrData[1];
        }
        if (arrData != null){
        	if(dCode != undefined && dCode !=""){
        		sheetObj.SetColProperty(title, {ComboText:arrData[1] , ComboCode:arrData[0] , DefaultValue:dCode});
        	} else {
        		sheetObj.SetColProperty(title, {ComboText:arrData[1] , ComboCode:arrData[0]});
        	}
        }
    }
    	
 
	 
	/*
	* function명 : IBS_SaveGridSetting()
	* 기능
	*  - Sheet 세팅 저장 (Cookie, DB)
	*    : Column 배열순서, Column 정렬 옵션(ASC/DESC), Column Size
	*    : Cookie => UserData => DB 방식으로 변경
	*    : IFrame 방식 / Ajax / behavior:url(#default#download) 중 택일
	*      (표준에 맞는가, 속도는 어떤 방식이 제일 빠른가) => behavior를 이용하는 것이 무난할 것으로 보임
	*    : Framework을 타게 할 것인가? (.do / .screen) => 속도면에서는 떨어짐
	*/
    function IBS_SaveGridSetting(usr_id, scrn_id, sheetObj, bMsgOut) {
		try {
			if(bMsgOut != null && !bMsgOut) {
				IBS_bMsgOut=bMsgOut;
			} else {
				IBS_bMsgOut=true;
			}
			var sh_id=sheetObj.id;
			var hdr_desc="";
			var colSeq="";
			var colSize="";
			var colOrder="";
			// 1. Column 배열 순서
			with(sheetObj) {
				for(var i=0; i<=LastCol(); i++) {
					if(i == 0)
						colSeq += ColSaveName(i);
					else
						colSeq += "|" + ColSaveName(i);
				}
			}
			// 2. Column Size
			with(sheetObj) {
				for(var i=0; i<=LastCol(); i++) {
					if(i == 0)
						colSize += GetColWidth(i);
					else
						colSize += "|" + GetColWidth(i);
				}
			}
			hdr_desc=colSeq + "||" + colSize	
			sendIBHeaderRequest("SAVE", usr_id, scrn_id, sh_id, hdr_desc)		
		} catch(e) {
		}
	}

    

	/*
	 * function명 : IBS_RestoreGridSetting()
	 * 기능
	 *  - Cookie/DB에 저장된 IBSheet 세팅 적용
	 *    : Column 배열순서, Column 정렬 옵션(ASC/DESC), Column Size
	 *    : Cookie => UserData => DB 방식으로 변경
	 */
	 function IBS_RestoreGridSetting(usr_id, scrn_id, sheetObj, bMsgOut) {
		try {
			
			// 결과 Message 출력 여부 세팅
			if(bMsgOut != null && !bMsgOut) {
				IBS_bMsgOut = bMsgOut;
			} else {
				IBS_bMsgOut = true;
			}
			
			var sh_id = sheetObj.id;
			sendIBHeaderRequest("SEARCH", usr_id, scrn_id, sh_id);

		} catch(e) {
			
		}
	}
	
	/*
	 * function명 : IBS_DelGridSetting()
	 * 기능
	 *  - Cookie/DB에 저장된 IBSheet 세팅 삭제
	 *    : Column 배열순서, Column 정렬 옵션(ASC/DESC), Column Size
	 */
	 function IBS_DelGridSetting(usr_id, scrn_id, sheetObj, bMsgOut) {
		try {
			// 결과 Message 출력 여부 세팅
			if(bMsgOut != null && !bMsgOut) {
				IBS_bMsgOut = bMsgOut;
			} else {
				IBS_bMsgOut = true;
			}
			
			var sh_id = sheetObj.id;
			
			sendIBHeaderRequest("DEL", usr_id, scrn_id, sh_id)

		} catch(e) {
			
		}
	}
	 
	function sendIBHeaderRequest(mode, usr_id, scrn_id, sh_id, hdr_desc) {
		var userIframe = document.all.ibs_udataIframe;
		var userFrm = document.all.ibs_udataFrm;
		var userInputMode = document.all.ibs_udataMode;
		var userInputUsrId = document.all.ibs_udataUsrId;
		var userInputScrnId = document.all.ibs_udataScrnId;
		var userInputShId = document.all.ibs_udataShId;
		var userInputHdrDesc = document.all.ibs_udataHdrDesc;
		var userInputMsgOut = document.all.ibs_udataMsgOut;
			
		if(!userIframe) {
			userIframe = document.createElement("<iframe name='ibs_udataIframe' id='ibs_udataIframe' style='display:none'></iframe>");
			userFrm = document.createElement("<form name='ibs_udataFrm' method='post'></form>");
			userInputMode = document.createElement("<input type='hidden' name='ibs_udataMode'>");
			userInputUsrId = document.createElement("<input type='hidden' name='ibs_udataUsrId'>");
			userInputScrnId = document.createElement("<input type='hidden' name='ibs_udataScrnId'>");
			userInputShId = document.createElement("<input type='hidden' name='ibs_udataShId'>");
			userInputHdrDesc = document.createElement("<input type='hidden' name='ibs_udataHdrDesc'>");
			userInputMsgOut = document.createElement("<input type='hidden' name='ibs_udataMsgOut'>");
			
			userFrm.appendChild(userInputMode);
			userFrm.appendChild(userInputUsrId);
			userFrm.appendChild(userInputScrnId);
			userFrm.appendChild(userInputShId);
			userFrm.appendChild(userInputHdrDesc);
			userFrm.appendChild(userInputMsgOut);
			
			document.body.appendChild(userIframe);
			document.body.appendChild(userFrm);
		} 
		userInputMode.value = mode;
		userInputUsrId.value = usr_id;
		userInputScrnId.value = scrn_id;
		userInputShId.value = sh_id;
		userInputHdrDesc.value = hdr_desc;
		userInputMsgOut.value = IBS_bMsgOut;
		
		userFrm.target = "ibs_udataIframe";
		userFrm.action = "/opuscntr/syscommon/common/ibsheet/IBS_common.jsp";
		userFrm.submit();
	}
	
function makeHiddenSkipCol(sobj){
    var lc = sobj.LastCol();
    var rtnStr = "";
    for(var i=0;i<=lc;i++){
    	if( ! ( 1==sobj.GetColHidden(i) || sobj.GetCellProperty(0,i,"Type") == "CheckBox" || sobj.GetCellProperty(0,i,"Type") == "DummyCheck" 
    		|| sobj.GetCellProperty(0,i,"Type") == "Radio"||  sobj.GetCellProperty(0,i,"Type") == "Status" 
    		||  sobj.GetCellProperty(0,i,"Type") =="DelCheck" )){
    		rtnStr += "|"+ i;
    	}
    }
    return rtnStr.substring(1);
}

//============== LEFT Header ==========================//
function InitHeadColumn(header,obj){
	
	if(header == ""){
		//alert(leftHeaderMsg);
		return
	}
	if(!header[0].Text){
		//alert(leftHeaderMsg);
		return
	}

	var backColor = obj.GetHeaderBackColor();
	var fontColor = obj.GetHeaderFontColor();

	for(var k=0;k<header.length;k++){      //td 2
		obj.SetColBackColor(k,backColor);
		obj.SetColFontColor(k,fontColor);
		obj.SetColEditable(k, 0);
	}
	
		var xml = "<SHEET><DATA>";
		var len = header[0].Text.split("|"); // left title split |  array  5

		for(var i=0;i<len.length;i++){       // left tiele count loop  5
			xml +="<TR>";                         // tr 5
			for(var j=0;j<header.length;j++){      //td 2
				var headText = header[j].Text.split("|");
				xml += "<TD><![CDATA["+headText[i]+"]]></TD>";
			}
			xml +="</TR>";
		}
	xml += "</DATA></SHEET>";
	obj.LoadSearchData(xml);
			
}

function InitHeadColumnSync(header,obj){
	
	if(header == ""){
		//alert(leftHeaderMsg);
		return
	}
	if(!header[0].Text){
		//alert(leftHeaderMsg);
		return
	}

	var backColor = obj.GetHeaderBackColor();
	var fontColor = obj.GetHeaderFontColor();

	for(var k=0;k<header.length;k++){      //td 2
		obj.SetColBackColor(k,backColor);
		obj.SetColFontColor(k,fontColor);
		obj.SetColEditable(k, 0);
	}
	
		var xml = "<SHEET><DATA>";
		var len = header[0].Text.split("|"); // left title split |  array  5

		for(var i=0;i<len.length;i++){       // left tiele count loop  5
			xml +="<TR>";                         // tr 5
			for(var j=0;j<header.length;j++){      //td 2
				var headText = header[j].Text.split("|");
				xml += "<TD><![CDATA["+headText[i]+"]]></TD>";
			}
			xml +="</TR>";
		}
	xml += "</DATA></SHEET>";
	obj.LoadSearchData(xml , {Sync:1});
			
}

function InitHeadText(header,obj){
	
	obj.RenderSheet(0);
	var backColor = obj.GetHeaderBackColor();
	var fontColor = obj.GetHeaderFontColor();
	var startRow = obj.HeaderRows();
	var status = FindStatusCol(obj);

	for(var i=0;i<header.length;i++){
		var headText = header[i].Text.split("|");
		for(var j=0;j<headText.length;j++){
			obj.SetCellText(j+startRow,i,headText[j]);
			obj.SetCellValue(j+startRow,status,"R");

		}
		obj.SetColBackColor(i,backColor);
		obj.SetColFontColor(i,fontColor);
		obj.SetColEditable(i, 0);

		
		var info = {Align:header[i].Align };

		//obj.SetColProperty(0, i, info);
	}
	
	obj.RenderSheet(1);
	
}

function FindStatusCol(obj){
	for(var i=0;i<=obj.LastCol();i++){
		var type = obj.GetCellProperty(0,i,"Type");
		if(type == "Status" ){
			return i;
			break;
		}
	}
	
	return -1;
}

function changeHeaderRow(sheetObj , row , title){

	var arrTitle = title.split("|");
	for( var idx=0 ; idx < arrTitle.length ; idx++){
		if( idx <= sheetObj.LastCol()){
			sheetObj.InitCellProperty (row, idx, {Type:"Text"} );
			sheetObj.SetCellText(row , idx , String(arrTitle[idx])+" " , 0);
		}
	}
}
//============== LEFT Header ==========================//

function copySheetToSheet(sheetObj, sheetObj2){
	var str = sheetObj.GetRangeValue(sheetObj.HeaderRows(), 0, sheetObj.LastRow(), sheetObj.LastCol());
	var strarr = str.split("^");
	for(var i=0; i<strarr.length;i++){
		if((sheetObj.HeaderRows()+i) > sheetObj2.LastRow()){
			var row = sheetObj2.DataInsert();
			sheetObj2.SetRangeValue(strarr[i], row, 0, row, sheetObj2.LastCol());
		}else{
			sheetObj2.SetRangeValue(strarr[i], sheetObj.HeaderRows()+i, 0, sheetObj.HeaderRows()+i, sheetObj2.LastCol());
		}
	}
}

function ComSetColProperty(sheetObj , col , type){
	for( i = sheetObj.HeaderRows() ; i < sheetObj.LastRow()+1 ; i++){
		sheetObj.InitCellProperty ( i , col , type);
	}
}

function sheet_dateDiff(fm_dt, to_dt , gubun){
	if(gubun == null || gubun== "" || gubun == undefined || gubun == "undefined" || gubun=="null"){
		gubun = "D";
	}
	
	if(fm_dt == "" || to_dt == ""){
		return "";
	}
	
	if(typeof(fm_dt) == "string"){
		fm_dt = new Date(fm_dt);
	}
	if(typeof(to_dt) == "string"){
		to_dt = new Date(to_dt);
	}
	
	if(gubun == "YYYY"){
		return parseInt(to_dt.getFullYear() - fm_dt.getFullYear() , 10);
	} else if ( gubun == "M"){
		return parseInt( (to_dt.getFullYear() - fm_dt.getFullYear())* 12 + ( (to_dt.getMonth()+1) - (fm_dt.getMonth()+1) ) ,10 );
	} else if ( gubun == "D"){
		return parseInt((to_dt - fm_dt)/(1000*60*60*24) , 10);
	} else if ( gubun == "H"){
		return parseInt((to_dt - fm_dt)/(1000*60*60) , 10);
	} else if ( gubun == "N"){
		return parseInt((to_dt - fm_dt)/(1000*60) , 10);
	} else if ( gubun == "S"){
		return parseInt((to_dt - fm_dt)/1000 , 10);
	}
}

function ComSetSheetOuterLine(sheet , color){
	var sheetid = sheet.id;
	document.getElementById(sheetid).style.borderColor = color;
}

function ComGetSheetOuterLine(sheet){
	var sheetid = sheet.id;
	return $("#"+sheetid).css("border-color")
}


//IBSheet ActiveX용 저장 XML을 IBSheet7용 XML 형식으로 변환
function ComSetResultData(sheetObj , str) {
	if (str == "" || str == null || str == "null") {
		return false;
	}
	xml = str, xmlDoc = $.parseXML(xml), $xml = $(xmlDoc);
		
		//TR-DATA 가 있는 경우 이를 수행한다.  shkim 2014.09.27 ========================
		var trdatalen = $xml.find("TR-DATA").children().length;
		var $tr_data = trdatalen > 0 ? $xml.find("TR-DATA").children() : $xml.find("tr-data").children();
		if(trdatalen>0){


			//상태컬럼을 찾는다.
			var statuscol = "";
			for(var i=0;i<=sheetObj.LastCol();i++){
				if("Status"==sheetObj.GetCellProperty(0, i, "Type")){ statuscol = i; break;}
			}


			//수정이 일어난 행 추출			
			var rows = sheetObj.FindStatusRow("I|U|D").split(";");
			var rowcnt = 0;

			$tr_data.each(function(){
				var td = $(this).children();
				td.each(function(){
//					alert(this.tagName + ":"+   $(this).text());
					var savename = (this.tagName).substring(1);
						sheetObj.SetCellValue(rows[rowcnt] , savename , $(this).text());
				}	);
				sheetObj.SetCellValue(rows[rowcnt] , statuscol , "R");
				rowcnt++;
			});
		}
}

//Excel Upload max row check logic 
function isExceedMaxRow(msg){
	if(msg =="SYS_OverMaxRow"){
		ComShowCodeMessage("COM132901");
		return true;
	}else{
		return false;
	}
}