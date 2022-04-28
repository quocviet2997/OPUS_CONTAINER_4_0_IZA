/**
===============================================================================
프로그램  명  : 업무 관련 공통 함수 정의 Script
프로그램개요  : 
작   성   자  : jungyoontae
작   성   일  : 2009-01-05
===============================================================================
수정자/수정일 : 이경희/2009-01-19
수정사유/내역 : ComGetCntrNoFull, ComGetCntrChkDgt, ComGetCntrNoFullMulti, ComIsCustomer 함수를 CoCommon에서 CoBiz로 옮김
===============================================================================
*/
    /*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
    /**
     * @fileoverview 업무에서 공통으로 사용하는 업무 관련 자바스크립트파일로 업무 관련 함수가 정의되어 있다.
     * @author 한진해운
     */
    /**
     * @class CoBiz : 업무 처리 관련 함수가 정의되어 있다.
     */
    function CoBiz() {
        this.ComGrpMailHtmlLoad=ComGrpMailHtmlLoad;
        this.ComGrpMailGetHtml=ComGrpMailGetHtml;
        this.ComGrpMailMakeXML=ComGrpMailMakeXML;
        this.ComGrpMailOpenWindow=ComGrpMailOpenWindow;
        this.ComGrpMailCreateDiv=ComGrpMailCreateDiv;
        this.ComRDFaxSend=ComRDFaxSend;
        this.ComGetCntrNoFull=ComGetCntrNoFull;
        this.ComGetCntrChkDgt=ComGetCntrChkDgt;
        this.ComGetCntrNoFullMulti=ComGetCntrNoFullMulti;
        this.ComIsCustomer=ComIsCustomer;
        this.ComBtnEnable=ComBtnEnable;
        this.ComBtnDisable=ComBtnDisable;
        this.ComIsBtnEnable=ComIsBtnEnable;
        this.ComSetDisplay=ComSetDisplay;
        this.ComColFontName=ComColFontName;
        this.ComSheetRowSwitch=ComSheetRowSwitch;
    }
    /*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/
    /**
     * RD Fax 보내기 위한 공통 화면을 Open한다. <br>
     * <br><b>Example :</b>
     * <pre>
     *     ComRDFaxSend();	//RD Fax를 보내기 위한 공통 화면을 Open한다
     * <pre>
     * @return 없음
     */
    function ComRDFaxSend() {
    	ComOpenPopup('RDFaxSend.do', 470, 300, 'RDFaxSend', '1,0,1,1,1,1,1,1');
    }
    /**
     * 컨테이너번호를 인자로받아서 Check Digit 계산하고 컨테이너번호와 Check Digit를 문자열로 연결하여 리턴한다. <br>
     * 컨테이너번호가 올바르지 않아서 Check Digit 계산이 불가능한 경우 인자로 받은 컨테이너번호를 그대로 리턴한다. <br>
     * Check Digit의 계산은 {@link #ComGetCntrChkDgt}함수를 이용한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComGetCntrNoFull("1234567890") //결과 : "12345678905"
     *     ret = ComGetCntrNoFull("1112223334") //결과 : "11122233342"
     *     ret = ComGetCntrNoFull("4445556667") //결과 : "44455566672"
     *     ret = ComGetCntrNoFull("8889990001") //결과 : "88899900015"
     * </pre>
     * @param {string,object} cntrNo   필수,컨테이너번호 문자열 또는 HTML태그(Object)
     * @returns string,컨테이너번호와 Check Digit를 연결한 문자열
     * @see #ComGetCntrNoFullMulti
     * @see #ComGetCntrChkDgt
     */
    function ComGetCntrNoFull(cntrNo){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            cntrNo=getArgValue(cntrNo);
            if (cntrNo.length != 10) return cntrNo;
            cntrNo=cntrNo.toUpperCase();
            var checkDigit=ComGetCntrChkDgt(cntrNo);
            if (isNaN(checkDigit)) return cntrNo;
            return cntrNo+checkDigit;
        } catch(err) { ComFuncErrMsg(err.message); }
    }
    /**
     * 컨테이너번호를 인자로 받아서 Check Digit계산하여 리턴한다. <br>
     * Check Digit 계산이 불가능한 경우 NaN을 리턴한다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComGetCntrChkDgt("1234567890") //결과 : "5"
     *     ret = ComGetCntrChkDgt("1112223334") //결과 : "2"
     *     ret = ComGetCntrChkDgt("4445556667") //결과 : "2"
     *     ret = ComGetCntrChkDgt("8889990001") //결과 : "5"
     * </pre>
     * @param {string,object} cntrNo   필수,컨테이너번호 문자열 또는 HTML태그(Object)
     * @returns string,Check Digit문자열
     * @see #ComGetCntrNoFull
     */
    function ComGetCntrChkDgt(cntrNo){
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            cntrNo=getArgValue(cntrNo);
            var strMap=new Array(10,12,13,14,15,16,17,18,19,20,21,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38);
            var iProductValue=0;
            var sum=0;
            for(var i=0;i<10;i++){
                var str=cntrNo.charAt(i)
                var num=new Number(str);
                if (isNaN(num)){
                    var idx=new Number(str.charCodeAt(0)-65) ;
                    num=strMap[idx];
                }
                iProductValue=num* Math.pow(2, i);
                sum=sum + iProductValue;
            }
            var mod=sum % 11;
            if (mod == 10) mod=0;
            return mod;
        } catch(err) { ComFuncErrMsg(err.message); }
    }
    /**
     * 여러개 컨테이너번호를 ","로 연결한 문자열을 받아서 각 컨테이너번호의 Check Digit를 계산하여 컨테이너번호와 Check Digit를 연결한 문자열을 다시 ","로 묶어서 리턴한다. <br>
     * {@link #ComGetCntrNoFull}함수를 이용하여 컨테이너번호와 Check Digit를 연결한 문자열을 가져온다. <br>
     * <br><b>Example : </b>
     * <pre>
     *     ret = ComGetCntrNoFullMulti("1234567890,1112223334,4445556667") //결과 :"12345678905,11122233342,44455566672"
     * </pre>
     * @param {string} cntrList  필수,컨테이너번호 문자열
     * @returns string,컨테이너번호와 Check Digit를 연결한 문자열
     * @see #ComGetCntrNoFull
     */
    function ComGetCntrNoFullMulti(cntrList){
        try {
            if(cntrList == undefined || cntrList == '') return cntrList;
            var cntrArray=cntrList.split(',');
            var newCntrList='';
            for(var i=0; i<cntrArray.length; i++){
                cntrArray[i]=ComGetCntrNoFull(cntrArray[i]);
            }
            return cntrArray.join(",");
        } catch(err) { ComFuncErrMsg(err.message); }
    }
    /**
     * 인자값이 Customer포멧에 맞는지 여부를 리턴한다. <br>
     * Customer포멧은 다음과 같다. <br>
     * cust_cnt_cd(앞2자리영문) + cust_seq(나머지자리숫자) <br>
     * @param {string,object} obj   필수,Customer문자열 또는 HTML태그(Object)
     * @returns bool <br>
     *          true  : Customer 포멧에 맞는 경우<br>
     *          false : Customer 포멧에 맞지 않는 경우
    */
    function ComIsCustomer(obj) {
        try {
            //첫번째 인자가 문자열 또는 HTML태그(Object)인 경우 처리
            var str=getArgValue(obj);
            var cust_cnt_cd=str.substr(0, 2);
            var cust_seq=str.substr(2);
            if( cust_cnt_cd.length <= 0 || !ComIsAlphabet(cust_cnt_cd) ||
                cust_seq.length <= 0    || !isNumber2(cust_seq))
            {
                return false;
            }
            return true;
        } catch(err) { ComFuncErrMsg(err.message); }
    }
     /**
	  * 버튼의 스타일을 Enable 상태로 한다.  <br>
	  * <br><b>Example : </b>
	 * <pre>
	 *    ComBtnEnable("btn_add") //btn_add 버튼 Enable
	 * </pre>
	 * @param {string} name   필수, 버튼 name 문자열
	 * @returns 없슴
	 * @see #ComBtnDisable
     */
     function ComBtnEnable(name) {
     	var obj = ComGetObject(name);
    	ComEnableObject(obj, true);
     }
      /**
       	* 버튼의 스타일을 Disable 상태로 한다.  <br>
        * <br><b>Example : </b>
 	     * <pre>
 	     *    ComBtnDisable("btn_add") //btn_add 버튼 Disable
 	     * </pre>
 	     * @param {string} name   필수, 버튼 name 문자열
		 * @returns 없슴
		 * @see #ComBtnEnable
      */
    function ComBtnDisable(name){
    	var obj = ComGetObject(name);
    	ComEnableObject(obj, false);
     }
	/** 
	* 버튼의 스타일이 Enable일때 true, Disabled일때 false를 반환한다. <br> 
    * <br><b>Example : </b>
	* <pre> 
	*    ComIsBtnEnable("btn_add") //btn_add 버튼 true or false
	* </pre> 
	* @param {string} name 필수, 버튼 name 문자열 
	* @returns 스타일이 Enable일때 true, Disabled일때 false를 반환 
	* @see #ComBtnEnable 
	* @see #ComBtnDisable 
	*/ 
	function ComIsBtnEnable(name){ 
	  	var obj = document.getElementById(name);
		if(obj == null || obj == "null") return false;	
	    
		if( obj.type == "button"){
			return !obj.disabled;
		}
		return true; 
	} 
	/** 
	* div, table, tr, td 영역별로 보이거나 보이지 않게 지정한다. <br> 
	* 페이지 내에서 지정된 id 는 유일해야 정상 동작함<br> 
    * <br><b>Example : </b>
	* <pre> 
	*    ComSetDisplay("search", false); 
	*      -->  &lt;table id="search"> ......&lt;/table> 영역이 숨겨진다.
	*      
	*    ComSetDisplay("search1", true);  
	*      -->  &lt;tr id="search1"> ......&lt;/tr> 영역이 보여진다.
	*      
	*    ComSetDisplay("search2");  
	*      -->  &lt;td id="search2"> ......&lt;/td> 영역이 숨겨진다.
	* </pre> 
	* @param {string}objId 필수, 태그의 id 값
	* @param {bool} flag 선택, default : false
	* @returns 없슴
	*/ 
	function ComSetDisplay(objId,flag) {
		var obj=document.getElementById(objId);
		if(flag)
			obj.style.display="Inline";
		else
			obj.style.display="none";
	}
	/** 
	* sheet 컬럼별로 Font를 변경한다. <br> 
    * <br><b>Example : </b>
	* <pre> 
	*     ComColFontName(sheetObj, "2|3|4" ); 
	*     ComColFontName(sheetObj, "2|3|4" , "Tahoma"); 
	* </pre> 
	* @param {sheet}   sheetObj 	필수, 태그의 id 값
	* @param {String}  cols  		필수, 폰트 변경이 필요한 컬럼 index 또는 savename
	* @param {String}  fontName  	선택, 변경하고 싶은 폰트명 default:Courier New
	* @returns 없슴
	*/ 
	function ComColFontName(sheetObj,cols,fontName) {
        if (fontName == undefined  || fontName == null) fontName="Courier New";
        var colNames=cols.split("|");
		for(var i=0 ; i < colNames.length  ; i++){
			sheetObj.SetCellFont("FontName", sheetObj.HeaderRows(), colNames[i], sheetObj.LastRow(), colNames[i],fontName);
		}
	}
	/** 
	* sheet Row의 위치를 변경한다.<br> 
    * <br><b>Example : </b>
	* <pre> 
	*     ComSheetRowSwitch(sheetObj, "chk" ); 
	* </pre> 
	* @param {sheet}   sheetObj 	필수, 태그의 id 값
	* @param {String}  cols  		필수, 위치 변경을 위한 체크필드의 index 또는 SaveName
	* @returns 없슴
	*/ 
    function ComSheetRowSwitch(sheetObj, chkCol){
		sheetObj.RenderSheet(0);
		sheetObj.SetWaitImageVisible(0);
		var Cols=ComGetSaveNameParam(sheetObj).replace(/COLORDER0=/i, "");
		var chkrows=ComTrim(sheetObj.FindCheckedRow(chkCol),"|");
		var chkrow=chkrows.split("|");
		if(chkrow.length == 2){
			var sXml=new Array("","");
			for(var i=1; i > -1 ; i--){
				sheetObj.CheckAll(chkCol,0,1);
				sheetObj.SetCellValue(chkrow[i],chkCol,1);
				sXml[i]=ComMakeSearchXml(sheetObj, false, chkCol, Cols, true);
			}
			sheetObj.LoadSearchData(sXml[1],{Append:1 , Sync:1} );
			sheetObj.LoadSearchData(sXml[0],{Append:1 , Sync:1} );
		}
		sheetObj.RenderSheet(1);
		sheetObj.SetWaitImageVisible(1);
    }
	/** 
	* Item Control Management 화면에 셋팅된 정보를 기준으로 화면 ITEM Control <br> 
	* <br> 
    * <br><b>Example : </b>
	* <pre> 
	*    ComSetUIItem(sheetObjects[0],document.form, "BKG", "ESM_BKG_1106"); 
	* </pre> 
	* @param {sheetObj} sheetObj
	* @param {formObj} formObj
	* @param {module} 프로그램 모듈
	* @param {pgmNo} program no
	* @returns 없슴
	*/ 
	function ComSetUIItem(sheetObj,formObj, module, pgmNo) {
		var sParam="";
		sParam="f_cmd="+SEARCH40+"&pgm_sub_sys_cd=" + module+ "&pgm_no=" + pgmNo
 		var sXml=sheetObj.GetSearchData("ADM_SYS_0011GS.do", sParam);
		var retXml=ComXml2ComboString(sXml, "pgm_itm_id", "set_tp_cd");
		if(retXml == null || retXml == undefined) {
			return false;
		}
		var pgTtmId=retXml[0].split("|");
		var setTpCd=retXml[1].split("|");
//		alert("comboXml[0] : " + retXml[0]);
//		alert("comboXml[1] : " + retXml[1]);
//		alert("pgTtmId : " + pgTtmId.length);
		var funSkipName="";
		for(var i=0; i <pgTtmId.length; i++)  {
			var inp;
			if("D" == setTpCd[i]) {
				if(document.getElementById(pgTtmId[i]) != null  && document.getElementById(pgTtmId[i]) != undefined) {
					document.getElementById(pgTtmId[i]).style.color="";
				}
				ComBtnDisable(pgTtmId[i]);
			} else if("H" == setTpCd[i]) {
				if(document.getElementById(pgTtmId[i]) != null  && document.getElementById(pgTtmId[i]) != undefined) {
					ComSetDisplay(pgTtmId[i], false);
				}
			} else if("Y" == setTpCd[i]) { 
				funSkipName="skip_flag_fun_" + pgTtmId[i];
				var len=formObj.elements.length;
				for (var i=0; i<len; i++) {
					if (formObj.elements[i] && formObj.elements[i].name) {
						if (funSkipName == formObj.elements[i].name) {
							formObj.elements[i--].removeNode(true);
						}
					}
				}
				inp=document.createElement("input");
				inp.type="hidden";
				inp.name=funSkipName;
				inp.id=funSkipName;
//				alert("skip_flag_fun_" + itemName);
				inp.value="Y";
				formObj.appendChild(inp);
			} 
		}
	}

	/**
	 * InnerText User
	 *  @param obj  form.object
	 *  @param setText  text
	 */
	function setInnerText(obj , setText){
		 var myText = (obj.innerText || obj.textContent);
		 myText= setText;
	}
	
	function getInnerText(obj){
		 return $("#"+obj.id).text();
	}
	