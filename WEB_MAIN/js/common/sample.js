	var bToggle = true;
	
	function loadPage(){
	    txtEvent.value = '';
	
	    //탭초기화
	    tab1.InsertTab(-1, "CoCommon", true);
	    tab1.InsertTab(-1, "CoCommon2", true);
	    tab1.InsertTab(-1, "CoFormControl", true);
	    tab1.InsertTab(-1, "CoMessage", true);
	    tab1.InsertTab(-1, "CoPopup", true);
	    tab1.InsertTab(-1, "CoWait", true);
	    tab1.InsertTab(-1, "CoCalendar", true);
	    tab1.InsertTab(-1, "CoAxon", true);
	    tab1.InsertTab(-1, "String", true);
	    tab1.InsertTab(-1, "CoBiz", true);
	
	    //멀티콤보초기화
	    with (form.combo1) {
	        var i=0;
	        MultiSelect = true;
	        InsertItem(i++, "서울", "01");
	        InsertItem(i++, "대전", "02");
	        InsertItem(i++, "대구", "03");
	        InsertItem(i++, "부산", "04");
	        Code="04";
	    }
	
	    //Axon 이벤트 처리1. 이벤트catch
	    axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form, "rdoCity"); //- form 전체 컨트롤 중 rdoCity를 제외한 모든 컨트롤의 OnBeforeDeactivate이벤트에 코드 처리
	    axon_event.addListenerFormat('beforeactivate',   'obj_activate',    form);            //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 OnBeforeActivate이벤트에 코드 처리
	    axon_event.addListenerFormat('keypress',         'obj_keypress', 	form);            //- form 전체 컨트롤 중 dataformat 속성이 있는 모든 컨트롤의 onkeypress이벤트에 코드 처리
	}
	
	//Axon 이벤트 처리2. 이벤트처리함수
	function obj_deactivate(){
	    ComChkObjValid(event.srcElement);
	}
	
	function obj_activate(){
	    ComClearSeparator(event.srcElement);
	}
	
	function obj_keypress(){
	    obj = event.srcElement;
	    if(obj.dataformat == null) return;
	    window.defaultStatus = obj.dataformat;
	
	    switch(obj.dataformat) {
	        case "ymd":
	        case "ym":
	        case "hms":
	        case "hm":
	        case "jumin":
	        case "saupja":
	            ComKeyOnlyNumber(obj);
	            break;
	        case "int":
	            if(obj.name=="txtInt") ComKeyOnlyNumber(obj, "-")
	            else ComKeyOnlyNumber(obj);
	            break;
	        case "float":
	            ComKeyOnlyNumber(obj, "-.");
	            break;
	        case "eng":
	            ComKeyOnlyAlphabet(); break;
	        case "engup":
	            if(obj.name=="txtEngUp2") ComKeyOnlyAlphabet('uppernum')
	            else ComKeyOnlyAlphabet('upper');
	            break;
	        case "engdn":
	            if(obj.name=="txtEngDn2") ComKeyOnlyAlphabet('lowernum')
	            else ComKeyOnlyAlphabet('lower');
	            break;
	    }
	}
	
	var beforetab = 0;
	function tab1_OnChange(obj,tabIndex) {
	    if (tabIndex==beforetab) return;
	    var objs = document.all.item("tabLayer");
	
	    objs[tabIndex].style.display = "Inline";
	    objs[beforetab].style.display = "none";
	
	    beforetab= tabIndex;
	}
	
	var btnObj = null;
	function func_test(sName, bHideLogic) {
	
	    if (btnObj != document.activeElement && document.activeElement.tagName == "INPUT") {
	        //현재 눌린 버튼 색상 설정 & 이전 눌린 버튼 색상 회복
	        if (btnObj!=null) btnObj.style.backgroundColor = "";
	        btnObj = document.activeElement;
	        if (btnObj!=null) btnObj.style.backgroundColor = "#ff00ff";
	    }
	
	
	    if (!bHideLogic) txtEvent.value = "";
	
	    if (tab1.TabText(tab1.selectedIndex)=="String") {
	        helpurl.href = "http://opuscntr.cyberlogitec.com/jsdoc/" + tab1.TabText(tab1.selectedIndex) +".html#" + sName;
	        helpurl.innerText = sName + " 도움말";
	        MsgAdd('================[ ' + sName + ' ]==================');
	    }else if (ComFuncCheck(sName)) {
	        MsgAdd('=======================================================');
	        MsgAdd("Syntax : " + ComFunc.toString().split("\n")[0]);
	        MsgAdd('=======================================================');
	
	        if (!bHideLogic) {
	            if (tab1.TabText(tab1.selectedIndex)=="CoCommon2") {
	                helpurl.href = "http://opuscntr.cyberlogitec.com/jsdoc/" + tab1.TabText(tab1.selectedIndex-1) +".html#" + sName;
	            } else {
	                helpurl.href = "http://opuscntr.cyberlogitec.com/jsdoc/" + tab1.TabText(tab1.selectedIndex) +".html#" + sName;
	            }
	
	            helpurl.innerText = sName + " 도움말";
	        }
	    } else {
	        MsgAdd('================[ ' + sName + ' ]==================');
	    }
	
	    switch(sName) {
	        case "ComChkLen":
	            MsgAdd(sName + '("가나다라")            ==> '   + ComChkLen("가나다라"));
	            MsgAdd(sName + '("가나다라", 10)        ==> '   + ComChkLen("가나다라", 10));
	            MsgAdd(sName + '(form.txtName)       ==> '   + ComChkLen(form.txtName) +     '  //txtName.maxlength=' + form.txtName.maxlength);
	            MsgAdd(sName + '(form.txtName,4)     ==> '   + ComChkLen(form.txtName,4)+    '  //txtName.maxlength=' + form.txtName.maxlength);
	            break;
	        case "ComChkLenByByte":
	            MsgAdd(sName + '("가나다라")            ==> '   + ComChkLenByByte("가나다라"));
	            MsgAdd(sName + '("가나다라", 14)        ==> '   + ComChkLenByByte("가나다라", 14));
	            MsgAdd(sName + '(form.txtName)       ==> '   + ComChkLenByByte(form.txtName) +   '   //txtName.maxlength=' + form.txtName.maxlength);
	            MsgAdd(sName + '(form.txtName,12)    ==> '   + ComChkLenByByte(form.txtName,12) + '   //txtName.maxlength=' + form.txtName.maxlength);
	            break;
	        case "ComGetLenByByte":
	            MsgAdd(sName + '("가나다라")            ==> '   + ComGetLenByByte("가나다라"));
	            MsgAdd(sName + '("1234가나다라")        ==> '   + ComGetLenByByte("1234가나다라"));
	            MsgAdd(sName + '("abcd가나다라")        ==> '   + ComGetLenByByte("abcd가나다라"));
	            MsgAdd(sName + '(form.txtName)       ==> '   + ComGetLenByByte(form.txtName));
	            break;
	        case "ComIsNull":
	            MsgAdd(sName + '("")                    ==> '   + ComIsNull(""));
	            MsgAdd(sName + '("  가나다라 ")         ==> '   + ComIsNull("  가나다라 "));
	            MsgAdd(sName + '("  1234 가나다라  ")   ==> '   + ComIsNull("  1234 가나다라  "));
	            MsgAdd(sName + '("    ")                ==> '   + ComIsNull("    "));
	            MsgAdd(sName + '(null)                  ==> '   + ComIsNull(null));
	            MsgAdd(sName + '(form.txtName)       ==> '   + ComIsNull(form.txtName));
	            break;
	        case "ComIsEmpty":
	            MsgAdd(sName + '("")                    ==> '   + ComIsEmpty(""));
	            MsgAdd(sName + '("  가나다라 ")         ==> '   + ComIsEmpty("  가나다라 "));
	            MsgAdd(sName + '("  1234 가나다라  ")   ==> '   + ComIsEmpty("  1234 가나다라  "));
	            MsgAdd(sName + '("    ")                ==> '   + ComIsEmpty("    "));
	            MsgAdd(sName + '(null)                  ==> '   + ComIsEmpty(null));
	            MsgAdd(sName + '(form.txtName)       ==> '   + ComIsEmpty(form.txtName));
	            break;
	        case "ComLtrim":
	            MsgAdd(sName + '("  가나다라 ")         ==> ['  + ComLtrim("  가나다라 ")+ "]");
	            MsgAdd(sName + '("  1234 가나다라  ")       ==> ['  + ComLtrim("  1234 가나다라  ")+ "]");
	            MsgAdd(sName + '("    ")                ==> ['  + ComLtrim("    ")+ "]");
	            MsgAdd(sName + '(null)                  ==> ['  + ComLtrim(null)+ "]");
	            MsgAdd(sName + '("***가나다라*", "*")   ==> ['  + ComLtrim("***가나다라*", "*")+ "]");
	            break;
	        case "ComRtrim":
	            MsgAdd(sName + '("  가나다라 ")         ==> ['  + ComRtrim("  가나다라 ")+ "]");
	            MsgAdd(sName + '("  1234 가나다라  ")       ==> ['  + ComRtrim("  1234 가나다라  ")+ "]");
	            MsgAdd(sName + '("    ")                ==> ['  + ComRtrim("    ")+ "]");
	            MsgAdd(sName + '(null)                  ==> ['  + ComRtrim(null)+ "]");
	            MsgAdd(sName + '("***가나다라*", "*")   ==> ['  + ComRtrim("***가나다라*", "*")+ "]");
	            break;
	        case "ComTrim":
	            MsgAdd(sName + '("  가나다라 ")         ==> ['  + ComTrim("  가나다라 ")+ "]");
	            MsgAdd(sName + '("  1234 가나다라  ")       ==> ['  + ComTrim("  1234 가나다라  ")+ "]");
	            MsgAdd(sName + '("    ")                ==> ['  + ComTrim("    ")+ "]");
	            MsgAdd(sName + '(null)                  ==> ['  + ComTrim(null)+ "]");
	            MsgAdd(sName + '("***가나다라*", "*")   ==> ['  + ComTrim("***가나다라*", "*")+ "]");
	            break;
	        case "ComTrimAll":
	            MsgAdd(sName + '("  가나다라 ")         ==> ['  + ComTrimAll("  가나다라 ")+ "]");
	            MsgAdd(sName + '("  1234 가나다라  ")       ==> ['  + ComTrimAll("  1234 가나다라  ")+ "]");
	            MsgAdd(sName + '("    ")                ==> ['  + ComTrimAll("    ")+ "]");
	            MsgAdd(sName + '(null)                  ==> ['  + ComTrimAll(null)+ "]");
	            MsgAdd(sName + '("***가나다라*", "*")   ==> ['  + ComTrimAll("***가나다라*", "*")+ "]");
	            MsgAdd(sName + '("*-/-abcd/가나다라*-/-", "*", "/", "-")        ==> [' + ComTrimAll("*-/-abcd/가나다라*-/-", "*", "/", "-")+ "]");
	            MsgAdd(sName + '("20081011-1234   ", "-", " ")              ==> [' + ComTrimAll("20081011-1234   ", "-", " ")+ "]");
	            MsgAdd(sName + '("-1,234.11", "-", ".", ",")==> ' + ComTrimAll("-1,234.11", "-", ".", ","));
	            break;
	        case "ComReplaceStr":
	            MsgAdd(sName + '("2008-01-01", "-", "")         ==> ' + ComReplaceStr("2008-01-01", "-", "")       );
	            MsgAdd(sName + '("123,567,890", ",", "")        ==> ' + ComReplaceStr("123,567,890", ",", "")      );
	            MsgAdd(sName + '("2008/*/01/*/01", "/*/", "")   ==> ' + ComReplaceStr("2008/*/01/*/01", "/*/", "") );
	            MsgAdd(sName + '("2008/*/01/*/01", "/*/", "*")  ==> ' + ComReplaceStr("2008/*/01/*/01", "/*/", "*"));
	            break;
	        case "ComIsContainsChars":
	            MsgAdd(sName + '("-1234.123", "-,.")                ==> ' + ComIsContainsChars("-1234.123", "-,.")       );
	            MsgAdd(sName + '("이 경희", "!,*&^%$#@~; ")         ==> ' + ComIsContainsChars("이 경희", "!,*&^%$#@~; "));
	            MsgAdd(sName + '("123,000", ".")                    ==> ' + ComIsContainsChars("123,000", ".")           );
	            MsgAdd(sName + '(form.txtName, "!,*&^%$#@~; ")   ==> ' + ComIsContainsChars(form.txtName, "!,*&^%$#@~; "));
	            break;
	        case "ComIsContainsCharsOnly":
	            MsgAdd(sName + '("B", "ABO")                        ==> ' + ComIsContainsCharsOnly("B", "ABO")                     );
	            MsgAdd(sName + '("2008-10-18", "1234567890-")       ==> ' + ComIsContainsCharsOnly("2008-10-18", "1234567890-")    );
	            MsgAdd(sName + '("2008- 1-18", "1234567890-")       ==> ' + ComIsContainsCharsOnly("2008- 1-18", "1234567890-")    );
	            MsgAdd(sName + '("-100,000.12", "1234567890-,.")    ==> ' + ComIsContainsCharsOnly("-100,000.12", "1234567890-,.") );
	            MsgAdd(sName + '(form.txtName, "한진해운")       ==> ' + ComIsContainsCharsOnly(form.txtName, "한진해운") );
	            break;
	        case "ComIsKorean":
	            MsgAdd(sName + '("")                ==> ' + ComIsKorean(""));
	            MsgAdd(sName + '("1234한글")        ==> ' + ComIsKorean("1234한글"));
	            MsgAdd(sName + '("abcd한글")        ==> ' + ComIsKorean("abcd한글"));
	            MsgAdd(sName + '("1234abcd")        ==> ' + ComIsKorean("1234abcd"));
	            MsgAdd(sName + '(form.txtName)   ==> ' + ComIsKorean(form.txtName)   );
	            break;
	        case "ComIsAlphabet":
	            MsgAdd(sName + '("")                ==> ' + ComIsAlphabet(""));
	            MsgAdd(sName + '("abcABC")          ==> ' + ComIsAlphabet("abcABC")     );
	            MsgAdd(sName + '("abcdef", "l")     ==> ' + ComIsAlphabet("abcdef", "l"));
	            MsgAdd(sName + '("ABCDEF", "u")     ==> ' + ComIsAlphabet("ABCDEF", "u"));
	            MsgAdd(sName + '("abc123", "n")     ==> ' + ComIsAlphabet("abc123", "n"));
	            MsgAdd(sName + '("abc123")          ==> ' + ComIsAlphabet("abc123")     );
	            MsgAdd(sName + '(form.txtName)   ==> ' + ComIsAlphabet(form.txtName)      );
	            break;
	        case "ComIsNumber":
	            MsgAdd(sName + '("")                ==> ' + ComIsNumber("")            );
	            MsgAdd(sName + '("0")               ==> ' + ComIsNumber("0")            );
	            MsgAdd(sName + '("1234")            ==> ' + ComIsNumber("1234")            );
	            MsgAdd(sName + '("-1234", "-")      ==> ' + ComIsNumber("-1234", "-")      );
	            MsgAdd(sName + '("2008-10-11", "-") ==> ' + ComIsNumber("2008-10-11", "-") );
	            MsgAdd(sName + '("1,234", ",")      ==> ' + ComIsNumber("1,234", ",")      );
	            MsgAdd(sName + '("1234.11", ".")    ==> ' + ComIsNumber("1234.11", ".")    );
	            MsgAdd(sName + '("2008/10/11", "/") ==> ' + ComIsNumber("2008/10/11", "/") );
	            MsgAdd(sName + '("-1,234.11", "-.,")==> ' + ComIsNumber("-1,234.11", "-.,"));
	            MsgAdd(sName + '("-1,234.11")       ==> ' + ComIsNumber("-1,234.11")       );
	            MsgAdd(sName + '(form.txtName)   ==> ' + ComIsNumber(form.txtName)      );
	            break;
	        case "ComIsMoneyNumber":
	            MsgAdd(sName + '("")                            	==> ' + ComIsMoneyNumber("") 							);
	            MsgAdd(sName + '("1234.56")                     	==> ' + ComIsMoneyNumber("1234.56")                     );
	            MsgAdd(sName + '("1234.56", false)              	==> ' + ComIsMoneyNumber("1234.56", false)              );
	            MsgAdd(sName + '("1,234.56")                    	==> ' + ComIsMoneyNumber("1,234.56")                    );
	            MsgAdd(sName + '("1,234.56", true,true)         	==> ' + ComIsMoneyNumber("1,234.56", true,true)         );
	            MsgAdd(sName + '("-1234.56")                    	==> ' + ComIsMoneyNumber("-1234.56")                    );
	            MsgAdd(sName + '("-1234.56", true, true, true)  	==> ' + ComIsMoneyNumber("-1234.56", true, true, true)  );
	            MsgAdd(sName + '("-1234.", true, true, true)  	    ==> ' + ComIsMoneyNumber("-1234.", true, true, true)    );
	            MsgAdd(sName + '("2009-09-09", true, true, true)	==> ' + ComIsMoneyNumber("2009-09-09", true, true, true));
	            MsgAdd(sName + '("-2009-09", true, true, true)	    ==> ' + ComIsMoneyNumber("-2009-09", true, true, true)  );
	            MsgAdd(sName + '("2009.09.09", true, true, true)	==> ' + ComIsMoneyNumber("2009.09.09", true, true, true));
	            MsgAdd(sName + '("2009,,0909", true, true, true)	==> ' + ComIsMoneyNumber("2009,,0909", true, true, true));
	            break;
	        case "ComIsEmailAddr":
	            MsgAdd(sName + '("")                      ==> ' + ComIsEmailAddr("")            );
	            MsgAdd(sName + '("khlee@ibleaders.co.kr") ==> ' + ComIsEmailAddr("khlee@ibleaders.co.kr"));
	            MsgAdd(sName + '("@ibleaders.co.kr")      ==> ' + ComIsEmailAddr("@ibleaders.co.kr")     );
	            MsgAdd(sName + '("khlee@")                ==> ' + ComIsEmailAddr("khlee@")               );
	            MsgAdd(sName + '(form.txtName)         ==> ' + ComIsEmailAddr(form.txtName)      );
	            break;
	
	        case "ComAddComma":
	            MsgAdd(sName + '("1000")      ==> ' + ComAddComma("1000")      );
	            MsgAdd(sName + '("-1000")     ==> ' + ComAddComma("-1000")     );
	            MsgAdd(sName + '("-1,000.12") ==> ' + ComAddComma("-1,000.12") );
	            MsgAdd(sName + '(form.txtName)     ==> ' + ComAddComma(form.txtName)     );
	            break;
	        case "ComParseInt":
	            MsgAdd(sName + '("1000")      ==> ' + ComParseInt("1000")      );
	            MsgAdd(sName + '("1000.12")   ==> ' + ComParseInt("1000.12")      );
	            MsgAdd(sName + '("-1000")     ==> ' + ComParseInt("-1000")     );
	            MsgAdd(sName + '("-1,000")    ==> ' + ComParseInt("-1,000") );
	            MsgAdd(sName + '("-1,000.12") ==> ' + ComParseInt("-1,000.12") );
	            break;
	        case "ComIsDate":
	            MsgAdd(sName + '("")                   ==> ' + ComIsDate("")   );
	            MsgAdd(sName + '("20081011")           ==> ' + ComIsDate("20081011")   );
	            MsgAdd(sName + '("2008-10-11")         ==> ' + ComIsDate("2008-10-11")   );
	            MsgAdd(sName + '("2008-10-32")         ==> ' + ComIsDate("2008-10-32")   );
	            MsgAdd(sName + '("2008/10/11")         ==> ' + ComIsDate("2008/10/11")   );
	            MsgAdd(sName + '("2008.10.11")         ==> ' + ComIsDate("2008.10.11")   );
	            MsgAdd(sName + '("2008- 1- 1")         ==> ' + ComIsDate("2008- 1- 1")   );
	            MsgAdd(sName + '("2008-11", "ym")      ==> ' + ComIsDate("2008-11", "ym"));
	            MsgAdd(sName + '("2008- 1", "ym")      ==> ' + ComIsDate("2008- 1", "ym"));
	            MsgAdd(sName + '(form.txtName)      ==> ' + ComIsDate(form.txtName)         );
	            break;
	        case "ComIsTime":
	            MsgAdd(sName + '("")            ==> ' + ComIsTime("")   );
	            MsgAdd(sName + '("231011")      ==> ' + ComIsTime("231011")   );
	            MsgAdd(sName + '("23:10:11")    ==> ' + ComIsTime("23:10:11")   );
	            MsgAdd(sName + '("23:44:60")    ==> ' + ComIsTime("23:44:60")   );
	            MsgAdd(sName + '("23:46", "hm") ==> ' + ComIsTime("23:46", "hm"));
	            MsgAdd(sName + '(form.txtName)       ==> ' + ComIsTime(form.txtName)      );
	            break;
	        case "ComIsDateTime":
	            MsgAdd(sName + '("")                            ==> ' + ComIsDateTime("")   );
	            MsgAdd(sName + '("20081011 101010")             ==> ' + ComIsDateTime("20081011 101010")   );
	            MsgAdd(sName + '("2008-10-11 10:10:10")         ==> ' + ComIsDateTime("2008-10-11 10:10:10")   );
	            MsgAdd(sName + '("2008-10-11 55:10:10")         ==> ' + ComIsDateTime("2008-10-11 55:10:10")   );
	            MsgAdd(sName + '("2008-10-32 10:10:10")         ==> ' + ComIsDateTime("2008-10-32 10:10:10")   );
	            MsgAdd(sName + '("2008/10/11 10:10:10")         ==> ' + ComIsDateTime("2008/10/11 10:10:10")   );
	            MsgAdd(sName + '("2008.10.11 10:10:10")         ==> ' + ComIsDateTime("2008.10.11 10:10:10")   );
	            MsgAdd(sName + '("2008-10-11 15:10", "", "hm")  ==> ' + ComIsDateTime("2008-10-11 15:10", "", "hm")   );
	            MsgAdd(sName + '("2008-11 10:10:10", "ym")      ==> ' + ComIsDateTime("2008-11 10:10:10", "ym"));
	            MsgAdd(sName + '("2008-11 10:10",    "ym", "hm")==> ' + ComIsDateTime("2008-11 10:10", "ym", "hm"));
	            MsgAdd(sName + '("2008- 1 10:10",    "ym", "hm")==> ' + ComIsDateTime("2008- 1 10:10", "ym", "hm"));
	            MsgAdd(sName + '("20081011101010")              ==> ' + ComIsDateTime("20081011101010")   );
	            MsgAdd(sName + '(form.txtName)               ==> ' + ComIsDateTime(form.txtName)         );
	            break;
	        case "ComIsMonth":
	            MsgAdd(sName + '("")   ==> ' + ComIsMonth(""));
	            MsgAdd(sName + '("01") ==> ' + ComIsMonth("01"));
	            MsgAdd(sName + '(11)   ==> ' + ComIsMonth(11)  );
	            MsgAdd(sName + '("gg") ==> ' + ComIsMonth("gg"));
	            break;
	        case "ComIsWeek":
	            MsgAdd(sName + '("")    ==> ' + ComIsWeek(""));
	            MsgAdd(sName + '("01")  ==> ' + ComIsWeek("01"));
	            MsgAdd(sName + '(53)    ==> ' + ComIsWeek(53)  );
	            MsgAdd(sName + '(54)    ==> ' + ComIsWeek(54));
	            break;
	        case "ComIsDay":
	            MsgAdd(sName + '("2008", "11", "")    ==> ' + ComIsDay("2008", "11", ""));
	            MsgAdd(sName + '("2008", "11", "30")  ==> ' + ComIsDay("2008", "11", "30"));
	            MsgAdd(sName + '("2008", "11", "31")  ==> ' + ComIsDay("2008", "11", "31"));
	            MsgAdd(sName + '("year", "mon", "31") ==> ' + ComIsDay("year", "mon", "31")  );
	            break;
	        case "ComIsDay2":
	            MsgAdd(sName + '("")    ==> ' + ComIsDay2("")  );
	            MsgAdd(sName + '(31)    ==> ' + ComIsDay2(31)  );
	            MsgAdd(sName + '(1)     ==> ' + ComIsDay2(1)   );
	            MsgAdd(sName + '("01")  ==> ' + ComIsDay2("01"));
	            MsgAdd(sName + '("가")  ==> ' + ComIsDay2("가"));
	            break;
	        case "ComGetLastDay":
	            MsgAdd(sName + '(2008, 2)  ==> ' + ComGetLastDay(2008, 2) );
	            MsgAdd(sName + '(2008, 11) ==> ' + ComGetLastDay(2008, 11));
	            MsgAdd(sName + '(2008, 12) ==> ' + ComGetLastDay(2008, 12));
	            MsgAdd(sName + '(2008, 13) ==> ' + ComGetLastDay(2008, 13));
	            break;
	        case "ComGetDaysBetween":
	            MsgAdd(sName + '("2008-10-11", "2008-10-11")    ==> ' + ComGetDaysBetween("2008-10-11", "2008-10-11")   );
	            MsgAdd(sName + '("2008-10-11", "2008-10-01")    ==> ' + ComGetDaysBetween("2008-10-11", "2008-10-01")   );
	            MsgAdd(sName + '("2008-10-11", "2008-11-11")    ==> ' + ComGetDaysBetween("2008-10-11", "2008-11-11")   );
	            MsgAdd(sName + '("20080909 112233", "20080909 112234") ==> ' + ComGetDaysBetween("20080909 112233", "20080909 112234"));
	            MsgAdd(sName + '("20080909112233", "20080910112234")   ==> ' + ComGetDaysBetween("20080909112233", "20080910112234"));
	            MsgAdd(sName + '(form.txtName, "2008-10-11") ==> ' + ComGetDaysBetween(form.txtName, "2008-10-11")        );
	            break;
	        case "ComGetDaysToToday":
	            MsgAdd(sName + '("2008-10-11")      ==> ' + ComGetDaysToToday("2008-10-11"));
	            MsgAdd(sName + '("2008-11-20")      ==> ' + ComGetDaysToToday("2008-11-20"));
	            MsgAdd(sName + '("2008-11-32")      ==> ' + ComGetDaysToToday("2008-11-32"));
	            MsgAdd(sName + '("20081011 112233") ==> ' + ComGetDaysToToday("20081011 112233"));
	            MsgAdd(sName + '("200810119 1122")   ==> ' + ComGetDaysToToday("20081011 1122"));
	            MsgAdd(sName + '("날짜아님")        ==> ' + ComGetDaysToToday("날짜아님"));
	            MsgAdd(sName + '(form.txtName)   ==> ' + ComGetDaysToToday(form.txtName));
	            break;
	        case "ComGetDateAdd":
	            MsgAdd(sName + '(null, "D", -6)    ==> ' + ComGetDateAdd(null, "D", -6));
	            MsgAdd(sName + '(null, "M", -6)    ==> ' + ComGetDateAdd(null, "M", -6));
	            MsgAdd(sName + '(null, "Y", -6)    ==> ' + ComGetDateAdd(null, "Y", -6));
	            MsgAdd(sName + '("날짜아님", "Y", -6)       ==> ' + ComGetDateAdd("날짜아님", "Y", -6));
	            MsgAdd(sName + '("2008-01-01", "D", 365)    ==> ' + ComGetDateAdd("2008-01-01", "D", 365) );
	            break;
	        case "ComIsJuminNo":
	            MsgAdd(sName + '("")                ==> ' + ComIsJuminNo(""));
	            MsgAdd(sName + '("770101-1234561")  ==> ' + ComIsJuminNo("770101-1234561"));
	            MsgAdd(sName + '("770101-1234562")  ==> ' + ComIsJuminNo("770101-1234562"));
	            break;
	        case "ComIsSaupjaNo":
	            MsgAdd(sName + '("")                ==> ' + ComIsSaupjaNo(""));
	            MsgAdd(sName + '("123-45-67891")    ==> ' + ComIsSaupjaNo("123-45-67891"));
	            MsgAdd(sName + '("123-45-67892")    ==> ' + ComIsSaupjaNo("123-45-67892"));
	            break;
	        case "ComLpad":
	            MsgAdd(sName + '("1", 2, "0")       ==> ' + ComLpad("1", 2, "0"));
	            MsgAdd(sName + '("123", 5, "0")     ==> ' + ComLpad("123", 5, "0"));
	            MsgAdd(sName + '("123", 2, "0")     ==> ' + ComLpad("123", 2, "0"));
	            break;
	        case "ComRpad":
	            MsgAdd(sName + '("1", 2, "0")       ==> ' + ComRpad("1", 2, "0"));
	            MsgAdd(sName + '("123", 5, "0")     ==> ' + ComRpad("123", 5, "0"));
	            MsgAdd(sName + '("123", 2, "0")     ==> ' + ComRpad("123", 2, "0"));
	            break;
	        case "ComGetNowInfo":
	            MsgAdd(sName + '()      ==> ' + ComGetNowInfo()     );
	            MsgAdd(sName + '("yy" ) ==> ' + ComGetNowInfo("yy" ));
	            MsgAdd(sName + '("mm" ) ==> ' + ComGetNowInfo("mm" ));
	            MsgAdd(sName + '("dd" ) ==> ' + ComGetNowInfo("dd" ));
	            MsgAdd(sName + '("hh" ) ==> ' + ComGetNowInfo("hh" ));
	            MsgAdd(sName + '("mi" ) ==> ' + ComGetNowInfo("mi" ));
	            MsgAdd(sName + '("ss" ) ==> ' + ComGetNowInfo("ss" ));
	            MsgAdd(sName + '("ymd") ==> ' + ComGetNowInfo("ymd"));
	            MsgAdd(sName + '("ym" ) ==> ' + ComGetNowInfo("ym" ));
	            MsgAdd(sName + '("hms") ==> ' + ComGetNowInfo("hms"));
	            MsgAdd(sName + '("hm" ) ==> ' + ComGetNowInfo("hm" ));
	            MsgAdd(sName + '("ymd", "/") ==> ' + ComGetNowInfo("ymd", "/"));
	            break;
	        case "ComFullAges":
	            MsgAdd(sName + '("1977-01-01") ==> ' + ComFullAges("1977-01-01"));
	            MsgAdd(sName + '("1977-12-31") ==> ' + ComFullAges("1977-12-31"));
	            break;
	        case "ComAddComma2":
	            MsgAdd(sName + '("1000", "#,###")        ==> ' + ComAddComma2("1000", "#,###")      );
	            MsgAdd(sName + '("1000", "#,###.0")      ==> ' + ComAddComma2("1000", "#,###.0")     );
	            MsgAdd(sName + '("1000", "#,###.00")     ==> ' + ComAddComma2("1000", "#,###.00")     );
	            MsgAdd(sName + '("1000.1", "#,###")      ==> ' + ComAddComma2("1000.1", "#,###")      );
	            MsgAdd(sName + '("1000.1", "#,###.0")    ==> ' + ComAddComma2("1000.1", "#,###.0")     );
	            MsgAdd(sName + '("1000.1", "#,###.00")   ==> ' + ComAddComma2("1000.1", "#,###.00")     );
	            MsgAdd(sName + '("-1,000.12", "#,###.0") ==> ' + ComAddComma2("-1,000.12", "#,###.0") );
	            break;
	        case "ComNumberArray":
	            MsgAdd(sName + '(5) ==> {' + ComNumberArray(5) + '}');
	        	break;
	        case "ComGetAryJoin":
	            var param2 = "";
	            var param = new Array();
	            param[0] = "txtName=한진&rdoCity=02"  //예제를 위한 배열
	            param[1] = "sltCity=03&chkYn=Y"
	
	            MsgAdd(sName + '(param, "&") ==> ' + ComGetAryJoin(param, "&") );
	            MsgAdd(sName + '(param2,"&") ==> ' + ComGetAryJoin(param2, "&") );
	
	            break;
	        case "ComAlertFocus":
	            MsgAdd(sName + '(form.txtDate1, "메시지 표시 후 form.txtDate1 으로 포커스를 옮기고 글자를 모두 Select합니다.")        ==> ' + ComAlertFocus(form.txtName, "메시지 표시 후 form.txtDate1 으로 포커스를 옮기고 글자를 모두 Select합니다.")      );
	            break;
	        case "ComSetFocus":
	            MsgAdd(sName + '(form.txtDate1)        ==> ' + ComSetFocus(form.txtDate1)      );
	            break;
	        case "ComSetNextFocus":
	            MsgAdd(sName + '(form.txtDate1)  ==> ' + ComSetNextFocus(form.txtDate1)      );
	            break;
	        case "ComKeyEnter":
	            MsgAdd('<form name="form" onKeyDown="' + sName + '() ">');
	            MsgAdd('<form name="form" onKeyDown="' + sName + '("nextfocus") ">');
	            MsgAdd('<form name="form" onKeyUp="' + sName + '("lengthnextfocus") ">');
	            MsgAdd('<form name="form" onKeyDown="' + sName + '("Function명문자열") ">');
	            break;
	        case "ComEnableObject":
	            bToggle = !bToggle;
	            MsgAdd(sName + '(form.txtName, ' + bToggle + ')        ==> ' + ComEnableObject(form.txtName, bToggle)      );
	            MsgAdd(sName + '(form.btn_Retrieve,' + bToggle + ')    ==> ' + ComEnableObject(form.btn_Retrieve, bToggle)      );
	            MsgAdd(sName + '(form.sltCity, ' + bToggle + ')        ==> ' + ComEnableObject(form.sltCity, bToggle)      );
	            MsgAdd(sName + '(txtEvent, ' + bToggle + ')               ==> ' + ComEnableObject(txtEvent, bToggle)      );
	
	            break;
	        case "ComEnableManyObjects":
	            bToggle = !bToggle;
	            MsgAdd(sName + '(' + bToggle + ', form.txtName, form.btn_Retrieve,form.sltCity,txtEvent))        ==> ' + ComEnableManyObjects(bToggle, form.txtName, form.btn_Retrieve, form.sltCity,txtEvent)      );
	            break;
	        case "ComShowObject":
	            bToggle = !bToggle;
	            MsgAdd(sName + '(form.txtName, ' + bToggle + ')        ==> ' + ComShowObject(form.txtName, bToggle)      );
	            MsgAdd(sName + '(form.btn_Retrieve,' + bToggle + ')    ==> ' + ComShowObject(form.btn_Retrieve, bToggle)      );
	            MsgAdd(sName + '(form.sltCity, ' + bToggle + ')        ==> ' + ComShowObject(form.sltCity, bToggle)      );
	            break;
	        case "ComShowManyObjects":
	            bToggle = !bToggle;
	            MsgAdd(sName + '(' + bToggle + ', form.txtName, form.btn_Retrieve,form.sltCity))        ==> ' + ComShowManyObjects(bToggle, form.txtName, form.btn_Retrieve, form.sltCity)      );
	            break;
	        case "ComClearObject":
	            MsgAdd(sName + '(form.txtName)        ==> ' + ComClearObject(form.txtName)      );
	            MsgAdd(sName + '(form.btn_Retrieve)   ==> ' + ComClearObject(form.btn_Retrieve)     );
	            MsgAdd(sName + '(form.sltCity)        ==> ' + ComClearObject(form.sltCity)      );
	            break;
	        case "ComClearManyObjects":
	            MsgAdd(sName + '(form.txtName, form.btn_Retrieve,form.sltCity))        ==> ' + ComClearManyObjects(form.txtName, form.btn_Retrieve, form.sltCity)      );
	            break;
	        case "ComAddSeparator":
	            MsgAdd(sName + '(form.txtDate1, "ymd" ) ==> ' + ComAddSeparator(form.txtDate1, "ymd" ));
	            break;
	        case "ComClearSeparator":
	            MsgAdd(sName + '(form.txtDate1, "ymd" ) ==> ' + ComClearSeparator(form.txtDate1, "ymd" ));
	            break;
	        case "ComClearCombo":
	            ComClearCombo(form.sltCity);
	            break;
	        case "ComAddComboItem":
	            MsgAdd(sName + '(form.sltCity, "서울", "01") ==> ' + ComAddComboItem(form.sltCity, "서울", "01"));
	            MsgAdd(sName + '(form.sltCity, "대전", "02") ==> ' + ComAddComboItem(form.sltCity, "대전", "02"));
	            MsgAdd(sName + '(form.sltCity, "대구", "03") ==> ' + ComAddComboItem(form.sltCity, "대구", "03"));
	            MsgAdd(sName + '(form.sltCity, "부산", "04") ==> ' + ComAddComboItem(form.sltCity, "부산", "04"));
	            break;
	        case "ComShowConfirm"    :
	            MsgAdd(sName + '("정말 삭제하시겠습니까?")      ==> ' + ComShowConfirm("정말 삭제하시겠습니까?"));
	            MsgAdd(sName + '("Do you really want to exit?") ==> ' + ComShowConfirm("Do you really want to exit?"));
	            break;
	        case "ComShowMessage"    :
	            MsgAdd(sName + '("입력값이 올바르지 않습니다.") ==> ' + ComShowMessage("입력값이 올바르지 않습니다."));
	            break;
	        case "ComShowCodeConfirm":
	            MsgAdd(sName + '("COM12112")                ==> ' + ComShowCodeConfirm("COM12112"));
	            MsgAdd(sName + '("COM12147", "매출내역")    ==> ' + ComShowCodeConfirm("COM12147", "매출내역"));
	            break;
	        case "ComShowCodeMessage":
	            MsgAdd(sName + '("COM12111")                ==> ' + ComShowCodeMessage("COM12111"));
	            MsgAdd(sName + '("COM12114", "선택여부")    ==> ' + ComShowCodeMessage("COM12114", "선택여부"));
	            break;
	        case "ComGetMsg"         :
	            MsgAdd(sName + '("COM12112")              ==> ' + ComGetMsg("COM12112"));
	            MsgAdd(sName + '("COM12115", "이름")      ==> ' + ComGetMsg("COM12115", "이름"));
	            break;
	        case "ComSetMsg"         :
	            MsgAdd(sName + '("COM12000", "{?msg1}더하기 {?msg2}는 {?msg3}입니다.") ==> ' + ComSetMsg("COM12000", "{?msg1}더하기 {?msg2}는 {?msg3}입니다."));
	            MsgAdd('ComGetMsg("COM12000", 1, 2, 3)                                 ==> ' + ComGetMsg("COM12000", 1, 2, 3));
	            break;
	        case "ComGetObjValue":
	            MsgAdd(sName + '(form.txtName)         ==> ' + ComGetObjValue(form.txtName));
	            MsgAdd(sName + '(form.btn_Retrieve)    ==> ' + ComGetObjValue(form.btn_Retrieve));
	            MsgAdd(sName + '(form.sltCity)         ==> ' + ComGetObjValue(form.sltCity));
	            MsgAdd(sName + '(form.rdoCity)         ==> ' + ComGetObjValue(form.rdoCity));
	            MsgAdd(sName + '(form.chkYn)           ==> ' + ComGetObjValue(form.chkYn)  );
	            MsgAdd(sName + '(form.sltCityMulti)    ==> ' + ComGetObjValue(form.sltCityMulti)  );
	            MsgAdd(sName + '(form.combo1)          ==> ' + ComGetObjValue(form.combo1)  );
	
	            break;
	        case "ComSetObjValue":
	            MsgAdd(sName + '(form.txtName, "한진")       ==> ' + ComSetObjValue(form.txtName, "한진")        );
	            MsgAdd(sName + '(form.sltCity, "02")         ==> ' + ComSetObjValue(form.sltCity, "02")          );
	            MsgAdd(sName + '(form.rdoCity, "02")         ==> ' + ComSetObjValue(form.rdoCity, "02")          );
	            MsgAdd(sName + '(form.chkYn, "Y")            ==> ' + ComSetObjValue(form.chkYn, "Y")             );
	            MsgAdd(sName + '(form.sltCityMulti, "01|03") ==> ' + ComSetObjValue(form.sltCityMulti, "01|03")  );
	            MsgAdd(sName + '(form.combo1, "02")          ==> ' + ComSetObjValue(form.combo1, "02")           );
	
	            break;
	        case "ComGetObjText":
	            MsgAdd(sName + '(form.txtName)         ==> ' + ComGetObjText(form.txtName));
	            MsgAdd(sName + '(form.btn_Retrieve)    ==> ' + ComGetObjText(form.btn_Retrieve));
	            MsgAdd(sName + '(form.sltCity)         ==> ' + ComGetObjText(form.sltCity));
	            MsgAdd(sName + '(form.rdoCity)         ==> ' + ComGetObjText(form.rdoCity));
	            MsgAdd(sName + '(form.chkYn)           ==> ' + ComGetObjText(form.chkYn)  );
	            MsgAdd(sName + '(form.sltCityMulti)    ==> ' + ComGetObjText(form.sltCityMulti)  );
	            MsgAdd(sName + '(form.combo1)          ==> ' + ComGetObjText(form.combo1)  );
	            break;
	        case "ComChkRequired":
	            MsgAdd(sName + '(form)         ==> ' + ComChkRequired(form));
	            break;
	        case "ComResetAll":
	            MsgAdd(sName + '()         ==> ' + ComResetAll());
	            break;
	        case "ComRound":
	            MsgAdd(sName + '( 1234.5555 ) ==> ' + ComRound(1234.5555) );
	            MsgAdd(sName + '( 1234.12, 1) ==> ' + ComRound(1234.12, 1));
	            MsgAdd(sName + '( 1234.15, 1) ==> ' + ComRound(1234.15, 1));
	            MsgAdd(sName + '(-1234.15, 1) ==> ' + ComRound(-1234.15,1));
	            break;
	        case "ComTrunc":
	            MsgAdd(sName + '( 1234.5555 ) ==> ' + ComTrunc(1234.5555) );
	            MsgAdd(sName + '( 1234.12, 1) ==> ' + ComTrunc(1234.12, 1));
	            MsgAdd(sName + '( 1234.15, 1) ==> ' + ComTrunc(1234.15, 1));
	            MsgAdd(sName + '(-1234.15, 1) ==> ' + ComTrunc(-1234.15,1));
	            MsgAdd(sName + '(1234.15, 0)  ==> ' + ComTrunc(1234.15,0));
	            MsgAdd(sName + '(-1234.15, 0) ==> ' + ComTrunc(-1234.15,0));
	            MsgAdd(sName + '(1234.15, -2)  ==> ' + ComTrunc(1234.15,-2));
	            break;
	        case "ComGetCntrNoFull":
	            MsgAdd(sName + '("1234567890") ==> ' + ComGetCntrNoFull("1234567890"));
	            MsgAdd(sName + '("1112223334") ==> ' + ComGetCntrNoFull("1112223334"));
	            MsgAdd(sName + '("4445556667") ==> ' + ComGetCntrNoFull("4445556667"));
	            MsgAdd(sName + '("8889990001") ==> ' + ComGetCntrNoFull("8889990001"));
	            break;
	        case "ComGetCntrChkDgt":
	            MsgAdd(sName + '("1234567890") ==> ' + ComGetCntrChkDgt("1234567890"));
	            MsgAdd(sName + '("1112223334") ==> ' + ComGetCntrChkDgt("1112223334"));
	            MsgAdd(sName + '("4445556667") ==> ' + ComGetCntrChkDgt("4445556667"));
	            MsgAdd(sName + '("8889990001") ==> ' + ComGetCntrChkDgt("8889990001"));
	            break;
	        case "ComGetCntrNoFullMulti":
	            MsgAdd(sName + '("1234567890,1112223334,4445556667,8889990001") ==> ' + ComGetCntrNoFullMulti("1234567890,1112223334,4445556667,8889990001"));
	            break;
	        case "ComChkPeriod":
	            MsgAdd(sName + '("20080909", "20080908") ==> ' + ComChkPeriod("20080909", "20080908"));
	            MsgAdd(sName + '("20080909", "20080909") ==> ' + ComChkPeriod("20080909", "20080909"));
	            MsgAdd(sName + '("20080909", "20080910") ==> ' + ComChkPeriod("20080909", "20080910"));
	            MsgAdd(sName + '("20080909", "2008")     ==> ' + ComChkPeriod("20080909", "2008"));
	            MsgAdd(sName + '("20080909 112233", "20080909 112234") ==> ' + ComChkPeriod("20080909 112233", "20080909 112234"));
	            MsgAdd(sName + '("20080909112233", "20080910112234")   ==> ' + ComChkPeriod("20080909112233", "20080910112234"));
	            break;
	        case "ComGetMaskedValue":
	            MsgAdd(sName + '("20080909", "ymd")         ==> ' + ComGetMaskedValue("20080909", "ymd")        );
	            MsgAdd(sName + '("200809",   "ym")          ==> ' + ComGetMaskedValue("200809",   "ym")         );
	            MsgAdd(sName + '("201059",   "hms")         ==> ' + ComGetMaskedValue("201059",   "hms")        );
	            MsgAdd(sName + '("2010",     "hm")          ==> ' + ComGetMaskedValue("2010",     "hm")         );
	            MsgAdd(sName + '("12345678", "int")         ==> ' + ComGetMaskedValue("12345678", "int")        );
	            MsgAdd(sName + '("12345678.123", "float")   ==> ' + ComGetMaskedValue("12345678.123", "float")  );
	            MsgAdd(sName + '("7701011234561", "jumin")  ==> ' + ComGetMaskedValue("7701011234561", "jumin") );
	            MsgAdd(sName + '("7701011234562", "jumin")  ==> ' + ComGetMaskedValue("7701011234562", "jumin") );
	            MsgAdd(sName + '("1234567891",    "saupja") ==> ' + ComGetMaskedValue("1234567891",    "saupja"));
	            MsgAdd(sName + '("가나다라", "han")         ==> ' + ComGetMaskedValue("가나다라", "han")        );
	            MsgAdd(sName + '("abcd", "eng")             ==> ' + ComGetMaskedValue("abcd", "eng")            );
	            MsgAdd(sName + '("abcd", "engup")           ==> ' + ComGetMaskedValue("abcd", "engup")          );
	            MsgAdd(sName + '("ABCD", "engdn")           ==> ' + ComGetMaskedValue("ABCD", "engdn")          );
	            break;
	
	        case "ComGetUnMaskedValue":
	            MsgAdd(sName + '("2008-09-09"       )       ==> ' + ComGetUnMaskedValue("2008-09-09"       )        );
	            MsgAdd(sName + '("2008-09-09", "ymd")       ==> ' + ComGetUnMaskedValue("2008-09-09", "ymd")        );
	            MsgAdd(sName + '("2008-09",    "ym")        ==> ' + ComGetUnMaskedValue("2008-09",    "ym")         );
	            MsgAdd(sName + '("20:10:59",   "hms")       ==> ' + ComGetUnMaskedValue("20:10:59",   "hms")        );
	            MsgAdd(sName + '("20:10",      "hm")        ==> ' + ComGetUnMaskedValue("20:10",      "hm")         );
	            MsgAdd(sName + '("12,345,678", "int")       ==> ' + ComGetUnMaskedValue("12,345,678", "int")        );
	            MsgAdd(sName + '("12,345,678.123", "float") ==> ' + ComGetUnMaskedValue("12,345,678.123", "float")  );
	            MsgAdd(sName + '("770101-1234562", "jumin") ==> ' + ComGetUnMaskedValue("770101-1234562", "jumin")  );
	            MsgAdd(sName + '("123-45-67891",   "saupja")==> ' + ComGetUnMaskedValue("123-45-67891",   "saupja") );
	            MsgAdd(sName + '("가나다라", "han")         ==> ' + ComGetUnMaskedValue("가나다라", "han")          );
	            MsgAdd(sName + '("abcd", "eng")             ==> ' + ComGetUnMaskedValue("abcd", "eng")              );
	            MsgAdd(sName + '("ABCD", "engup")           ==> ' + ComGetUnMaskedValue("ABCD", "engup")            );
	            MsgAdd(sName + '("abcd", "engdn")           ==> ' + ComGetUnMaskedValue("abcd", "engdn")            );
	            break;
	        case "ComGetQuarterToMonth":
	            MsgAdd(sName + '("14")       ==> ' + ComGetQuarterToMonth("14"));
	            MsgAdd(sName + '("24")       ==> ' + ComGetQuarterToMonth("24"));
	            MsgAdd(sName + '("34")       ==> ' + ComGetQuarterToMonth("34"));
	            MsgAdd(sName + '("44")       ==> ' + ComGetQuarterToMonth("44"));
	            MsgAdd(sName + '("14", true) ==> ' + ComGetQuarterToMonth("14", true));
	            break;
	        case "ComOpenWait":
	            MsgAdd(sName + '(true) ==> ' + ComOpenWait(true));
	            MsgAdd('tempAction() ==> ' + tempAction());
	            MsgAdd('tempAction() ==> ' + tempAction());
	            MsgAdd(sName + '(false) ==> ' + ComOpenWait(false));
	            break;
	        case "ComOpenWaitCallFunc":
	            MsgAdd(sName + '("tempAction") ==> ' + ComOpenWaitCallFunc("tempAction"));
	            break;
	        case "ComOpenWindow":
	            MsgAdd("1.Modal로 열기");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", "myWin", "dialogWidth:383px; dialogHeight:161px", true) ==> ' + ComOpenWindow("/opuscntr/img/waiting.gif", "myWin", "dialogWidth:383px; dialogHeight:161px",true));
	            MsgAdd("2.Modaless로 열기");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", "myWin", "toolbar=no,location=no,status=no,menubar=no,scrollbars=auto,resizable=no,alwaysRaised,dependent,titlebar=no,width=383,height=161") ==> '
	            + ComOpenWindow("/opuscntr/img/waiting.gif", "myWin", "toolbar=no,location=no,status=no,menubar=no,scrollbars=auto,resizable=no,alwaysRaised,dependent,titlebar=no,width=383,height=161"));
	            break;
	        case "ComOpenWindowCenter":
	            MsgAdd("1.Modal로 열기");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", "myWin", 343,121, true) ==> ' + ComOpenWindowCenter("/opuscntr/img/waiting.gif", "myWin", 383,161,true));
	            MsgAdd("2.Modaless로 열기");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", "myWin", 343,121) 		==> ' + ComOpenWindowCenter("/opuscntr/img/waiting.gif", "myWin", 383,161));
	            break;
	        case "ComOpenPopup":
	            MsgAdd("1.에러만들기");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", 800, 400, "popupFinish", "1,1,1,1,1,1,1,1")       ==> ' + ComOpenPopup("/opuscntr/img/waiting.gif", 800, 400, "popupFinish", "1,1,1,1,1,1,1,1"));
	            MsgAdd("2.Modal로 열기 - 팝업이 닫히면서 popupFinish 함수가 호출되어야 함");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", 800, 400, "popupFinish", "1,0,1,1,1,1,1,1", true) ==> ' + ComOpenPopup("/opuscntr/img/waiting.gif", 800, 400, "popupFinish", "1,0,1,1,1,1,1,1", true));
	            MsgAdd("3.Modaless로 열기- 팝업이 닫히면서 popupFinish 함수가 호출되어야 함");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", 800, 400, "popupFinish", "1,0,1,1,1,1,1,1")       ==> ' + ComOpenPopup("/opuscntr/img/waiting.gif", 800, 400, "popupFinish", "1,0,1,1,1,1,1,1"));
	            break;
	        case "ComOpenPopupWithTarget":
	            MsgAdd("1.에러만들기");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", 400, 200, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "1,1", false) ==> ' + ComOpenPopupWithTarget("/opuscntr/img/waiting.gif", 400, 200, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "1,1", false));
	            MsgAdd("2.Modal로 열기 - 팝업이 닫히면서 opener.sltStatus=loc_dpth_cd, opener.txtLocation=loc_cd 설정해야 한다.");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", 400, 200, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "0,1", true)  ==> ' + ComOpenPopupWithTarget("/opuscntr/img/waiting.gif", 400, 200, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "0,1", true));
	            MsgAdd("3.Modaless로 열기- 팝업이 닫히면서 opener.sltStatus=loc_dpth_cd, opener.txtLocation=loc_cd 설정해야 한다.");
	            MsgAdd(sName + '("/opuscntr/img/waiting.gif", 400, 200, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "0,1", false) ==> ' + ComOpenPopupWithTarget("/opuscntr/img/waiting.gif", 400, 200, "loc_dpth_cd:sltStatus|loc_cd:txtLocation", "0,1", false));
	            break;
	        case "ComChkValid":
	            MsgAdd(sName + '(form) ==> ' + ComChkValid(form));
	            break;
	        case "ComChkObjValid":
	            MsgAdd(sName + '(form.txtName) ==> ' + ComChkObjValid(form.txtName));
	            break;
	        case "calendarPopup1":
	            var cal = new ComCalendar();
	            cal.select(form.txtDate1, "yyyy-MM-dd");
	            break;
	        case "calendarPopup2":
	            var cal = new ComCalendar();
	            cal.setDisplayType('month');
	            cal.select(form.txtDate2, "yyyy-MM");
	            break;
	        case "calendarPopupFromTo1":
	            var cal = new ComCalendarFromTo();
//	            var cal = new ComCalendarFromTo('novalidaterform');
	            cal.select(form.txtsDate,  form.txteDate,  'yyyy-MM-dd');
	            break;
	        case "ComCalendar":
	            MsgAdd("var cal = new ComCalendar();");
	            if (sltType.value != "date") MsgAdd("cal.setDisplayType('"+sltType.value+"');");
	            MsgAdd("cal.select(txtCalDate, '"+sltFormat.value+"');");

	            var cal = new ComCalendar();	            
	            cal.setDisplayType(sltType.value);
	            cal.select(txtCalDate, sltFormat.value);
	            break;
	        case "ComCalendarFromTo":
	            MsgAdd("var cal = new ComCalendarFromTo();");
	            MsgAdd("cal.select(txtStartDate, txtEndDate, sltFormat.value);");
	            var cal = new ComCalendarFromTo();
	            cal.select(txtStartDate, txtEndDate, sltFormat.value);
	            break;
	        case "ComLog":
	        	ConSole.show = true;
	            for (var i=0; i<10; i++) {
	                MsgAdd(sName + '("뭐라고 뜰까?"' + i +') ==> ' + ComLog("뭐라고 뜰까?" + i));
	            }
	            break;
	        case "ComDebug":
	            for (var i=0; i<10; i++) {
	                MsgAdd(sName + '("뭐라고 뜰까?"' + i +') ==> ' + ComDebug("뭐라고 뜰까?" + i));
	            }
	            break;
	        case "ComDebugFunction":
	            MsgAdd(sName + '(arguments) ==> ' + ComDebugFunction(arguments));
	            break;
	        case "Axon":
                var sScript = "function initControl() { "
                            + "\n    axon_event.addListenerForm  ('beforedeactivate', 'obj_deactivate',  form);     //- 포커스 나갈때 "
                            + "\n    axon_event.addListenerFormat('beforeactivate',   'obj_activate',    form);     //- 포커스 들어갈때 "
                            + "\n    axon_event.addListenerFormat('keypress',         'obj_keypress',    form);     //- 키보드 입력할때 "
                            + "\n} "
                            + "\n "
                            + "\nfunction obj_activate(){ "
                            + "\n    //마스크구분자 없애기 "
                            + "\n    ComClearSeparator(event.srcElement); "
                            + "\n} "
                            + "\n "
                            + "\nfunction obj_deactivate(){ "
                            + "\n    //Validation 전체 체크(길이,format,최대,최소 등등) "
                            + "\n    ComChkObjValid(event.srcElement); "
                            + "\n} "
                            + "\n "
                            + "\nfunction obj_keypress(){ "
                            + "\n    switch(event.srcElement.dataformat){ "
                            + "\n        case 'float': "
                            + "\n            //숫자+'.'입력하기 "
                            + "\n            ComKeyOnlyNumber(event.srcElement, '.'); "
                            + "\n            break; "
                            + "\n        case 'eng': "
                            + "\n            //영문만 입력하기, 영문+숫자 -> ComKeyOnlyAlphabet('num'); "
                            + "\n            ComKeyOnlyAlphabet(); "
                            + "\n            break; "
                            + "\n        case 'engdn': "
                            + "\n            //영문 소문자만 입력하기, 영문소+숫자 -> ComKeyOnlyAlphabet('lowernum'); "
                            + "\n            ComKeyOnlyAlphabet('lower'); "
                            + "\n            break; "
                            + "\n        case 'engup': "
                            + "\n            //영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum'); "
                            + "\n            ComKeyOnlyAlphabet('upper'); "
                            + "\n            break; "
                            + "\n        default: "
                            + "\n            //숫자만입력하기(정수,날짜,시간) "
                            + "\n            ComKeyOnlyNumber(event.srcElement); "
                            + "\n    } "
                            + "\n} "
				MsgAdd(sScript);
				

	            break;
	        case "lengthByte":
	            MsgAdd('"가나다라".' + sName +'()          ==> '   + "가나다라".lengthByte());
	            MsgAdd('"1234가나다라".' + sName +'()      ==> '   + "1234가나다라".lengthByte());
	            MsgAdd('"abcd가나다라".' + sName +'()      ==> '   + "abcd가나다라".lengthByte());
	            break;
	        case "lpad":
	            MsgAdd('"1".' + sName + '(2, "0")              ==> ' + "1".lpad(2, "0"));
	            MsgAdd('"123".' + sName + '(5, "0")            ==> ' + "123".lpad(5, "0"));
	            MsgAdd('"123".' + sName + '(2, "0")            ==> ' + "123".lpad(2, "0"));
	            break;
	        case "rpad":
	            MsgAdd('"1".' + sName + '(2, "0")              ==> ' + "1".rpad(2, "0"));
	            MsgAdd('"123".' + sName + '(5, "0")            ==> ' + "123".rpad(5, "0"));
	            MsgAdd('"123".' + sName + '(2, "0")            ==> ' + "123".rpad(2, "0"));
	            break;
	        case "ltrim":
	            MsgAdd('"  가나다라 ".' + sName +'()            ==> ['  + "  가나다라 ".ltrim()+ "]");
	            MsgAdd('"  1234 가나다라  ".' + sName +'()      ==> ['  + "  1234 가나다라  ".ltrim()+ "]");
	            MsgAdd('"    ".' + sName +'()                   ==> ['  + "    ".ltrim()+ "]");
	            MsgAdd('"***가나다라*".' + sName +'(*")         ==> ['  + "***가나다라*".ltrim("*")+ "]");
	            break;
	        case "rtrim":
	            MsgAdd('"  가나다라 ".' + sName +'()            ==> ['  + "  가나다라 ".rtrim()+ "]");
	            MsgAdd('"  1234 가나다라  ".' + sName +'()      ==> ['  + "  1234 가나다라  ".rtrim()+ "]");
	            MsgAdd('"    ".' + sName +'()                   ==> ['  + "    ".rtrim()+ "]");
	            MsgAdd('"***가나다라*".' + sName +'(*")         ==> ['  + "***가나다라*".rtrim("*")+ "]");
	            break;
	        case "trim":
	            MsgAdd('"  가나다라 ".' + sName +'()            ==> ['  + "  가나다라 ".trim()+ "]");
	            MsgAdd('"  1234 가나다라  ".' + sName +'()      ==> ['  + "  1234 가나다라  ".trim()+ "]");
	            MsgAdd('"    ".' + sName +'()                   ==> ['  + "    ".trim()+ "]");
	            MsgAdd('"***가나다라*".' + sName +'(*")         ==> ['  + "***가나다라*".trim("*")+ "]");
	            break;
	        case "trimAll":
	            MsgAdd('"  가나다라 ".' + sName +'()            ==> ['  + "  가나다라 ".trimAll()+ "]");
	            MsgAdd('"  1234 가나다라  ".' + sName +'()      ==> ['  + "  1234 가나다라  ".trimAll()+ "]");
	            MsgAdd('"    ".' + sName +'()                   ==> ['  + "    ".trimAll()+ "]");
	            MsgAdd('"***가나다라*".' + sName +'(*")         ==> ['  + "***가나다라*".trimAll("*")+ "]");
	            MsgAdd('"*-/-abcd/가나다라*-/-".' + sName +'("*", "/", "-")     ==> [' + "*-/-abcd/가나다라*-/-".trimAll("*", "/", "-")+ "]");
	            MsgAdd('"20081011-1234   ".' + sName +'("-", " ")               ==> [' + "20081011-1234   ".trimAll("-", " ")+ "]");
	            break;
	        case "nullToZero":
	            MsgAdd('"".' + sName +'()       ==> ['   + "".nullToZero()+ "]");
	            MsgAdd('"   ".' + sName +'()    ==> ['   + "   ".nullToZero()+ "]");
	            MsgAdd('"123".' + sName +'()    ==> ['   + "123".nullToZero()+ "]");
	            break;
	        case "zeroToNull":
	            MsgAdd('"0".' + sName +'()      ==> ['   + "0".zeroToNull()+ "]");
	            MsgAdd('"123".' + sName +'()    ==> ['   + "123".zeroToNull()+ "]");
	            break;
	        case "parseInt":
	            MsgAdd('"1000".' + sName +'()      ==> ' + "1000".parseInt()      );
	            MsgAdd('"1000.12".' + sName +'()   ==> ' + "1000.12".parseInt()      );
	            MsgAdd('"-1000".' + sName +'()     ==> ' + "-1000".parseInt()     );
	            MsgAdd('"-1,000".' + sName +'()    ==> ' + "-1,000".parseInt() );
	            MsgAdd('"-1,000.12".' + sName +'() ==> ' + "-1,000.12".parseInt() );
	            break;
	        case "replaceStr":
	            MsgAdd('"2008-01-01".' + sName +'("-")              ==> ' + "2008-01-01".replaceStr("-")       );
	            MsgAdd('"123,567,890".' + sName +'(",")             ==> ' + "123,567,890".replaceStr(",")      );
	            MsgAdd('"2008/*/01/*/01".' + sName +'( "/*/")       ==> ' + "2008/*/01/*/01".replaceStr("/*/") );
	            MsgAdd('"2008/*/01/*/01".' + sName +'( "/*/", "*")  ==> ' + "2008/*/01/*/01".replaceStr("/*/", "*"));
	            break;
	        case "isNumber":
	            MsgAdd('"".isNumber()                   ==> ' + "".isNumber()                    );
	            MsgAdd('"0".isNumber()                  ==> ' + "0".isNumber()                   );
	            MsgAdd('"1234".isNumber()               ==> ' + "1234".isNumber()                );
	            MsgAdd('"-1234".isNumber("-")           ==> ' + "-1234".isNumber("-")            );
	            MsgAdd('"2008-10-11".isNumber("-")      ==> ' + "2008-10-11".isNumber("-")       );
	            MsgAdd('"1,234".isNumber(",")           ==> ' + "1,234".isNumber(",")            );
	            MsgAdd('"1234.11".isNumber(".")         ==> ' + "1234.11".isNumber(".")          );
	            MsgAdd('"2008/10/11".isNumber("/")      ==> ' + "2008/10/11".isNumber("/")       );
	            MsgAdd('"-1,234.11".isNumber("-.,")     ==> ' + "-1,234.11".isNumber("-.,")      );
	            MsgAdd('"-1,234.11".isNumber()          ==> ' + "-1,234.11".isNumber()           );
	            MsgAdd('form.txtName.value.isNumber()==> ' + form.txtName.value.isNumber() );
	            break;
	    }
	
	    MsgAdd('=======================================================');
	}
	
	function MsgAdd(sMsg)
	{
	    //메시지 표시
	    txtEvent.value = txtEvent.value + sMsg + "\n";
	
	    //스크롤 처리, 반드시 아래 줄을 둬야함.. 이상함..
	    //txtEvent.scrollTop = txtEvent.scrollHeight - txtEvent.clientHeight ;
	}
	
	
	function tempAction(){
	    var aryfunc = new Array("ComChkLen","ComChkLenByByte","ComGetLenByByte","ComIsNull","ComIsEmpty","ComLtrim","ComRtrim","ComTrim","ComTrimAll","ComReplaceStr", "ComIsContainsChars", "ComIsContainsCharsOnly");
	    for (i=0; i<aryfunc.length; i++) {
	        func_test(aryfunc[i], true);
	    }
	}
	
	function popupFinish() {
	    alert("opener창의 popupFinish 함수가 호출되었습니다.");
	}

	function changeDisplayType(sType) {
		switch(sType) {
			case "year":
				ComSetObjValue(sltFormat, "yyyy");
				break;
			case "month":
				ComSetObjValue(sltFormat, "yyyy-MM");
				break;
			case "date":
			case "week-end":
				ComSetObjValue(sltFormat, "yyyy-MM-dd");
				break;
				
		}
	}