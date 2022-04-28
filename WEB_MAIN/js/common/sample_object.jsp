<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- OPUSCNTR -->
    <SCRIPT LANGUAGE="javascript" SRC="CoAxon.js" TYPE="text/javascript"></SCRIPT>

    <SCRIPT LANGUAGE="javascript" SRC="CoCommon.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="CoFormControl.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="CoMessage.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="CoPopup.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="CoCalendar.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="CoObject.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="IBSheetInfo.js" TYPE="text/javascript"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="CoWait.js" TYPE="text/javascript"></SCRIPT>
<!-- body 시작 -->

<script language="javascript">

  var bToggle = true;
    function loadPage(){
        txtEvent.value = '';

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

        ComConfigSheet(form.sheet1);
        initSheet1();
        ComEndConfigSheet(form.sheet1);

        ComConfigSheet(form.sheet2);
        initSheet2();
        ComEndConfigSheet(form.sheet2);
    }

    function initSheet1() {
        with(form.sheet1) {
            // 높이 설정
            style.height = 160; //GetSheetHeight(5);

            //Host정보 설정[필수][HostIp, Port, PagePath]
            if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

            //전체Merge 종류 [선택, Default msNone]
            MergeSheet = msNone;

           //전체Edit 허용 여부 [선택, Default false]
            Editable = true;

            //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
            InitRowInfo( 1, 1, 10, 100);

            var HeadTitle = "Status|CHK|CNTR No.|TY/SZ|MATL|PUC|PUCredit|Min O/H Days|Free Days|DII Fee|Old /New|M/Date|Manufacturer";

            //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
            InitColumnInfo(ComCountHeadTitle(HeadTitle), 0, 0, true);

            // 해더에서 처리할 수 있는 각종 기능을 설정한다
            //InitHeadMode(true, true, false, true, false,false)

            //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
            InitHeadRow(0, HeadTitle, true);

            var cnt=0;
            //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
            InitDataProperty(0, cnt++, dtHiddenStatus,  0,    daCenter,  true,  "Status");
            InitDataProperty(0, cnt++, dtCheckBox,      0,    daCenter,  true,  "hiddencheck");
            InitDataProperty(0, cnt++, dtData,          100,  daCenter,  false, "CntrNo",   true,	"",			dfNone,		0,			false,		false);
            InitDataProperty(0, cnt++, dtCombo,         50,   daCenter,  false, "TySz");
            InitDataProperty(0, cnt++, dtCombo,         50,   daCenter,  false, "Matl");
            InitDataProperty(0, cnt++, dtData,          80,   daCenter,  false, "Puc");
            InitDataProperty(0, cnt++, dtData,          80,   daCenter,  false, "PUCredit");
            InitDataProperty(0, cnt++, dtData,          80,   daCenter,  false, "MinOHDays", false, "",           dfInteger);
            InitDataProperty(0, cnt++, dtData,          60,   daCenter,  false, "FreeDays",  false, "",           dfInteger);
            InitDataProperty(0, cnt++, dtData,          50,   daCenter,  false, "DIIFree",   false, "",           dfInteger);
            InitDataProperty(0, cnt++, dtCombo,         60,   daCenter,  false, "OldNew");
            InitDataProperty(0, cnt++, dtPopup,         100,  daCenter,  false, "MDate",     false, "",           dfDateYmd);
            InitDataProperty(0, cnt++, dtCombo,         90,   daCenter,  false, "Manufacturer");

            InitDataCombo(0, "TySz", "D|R|P|2|4|5|D2", "D|R|P|2|4|5|D2");
            InitDataCombo(0, "Matl", "SS|SU|AL", "SS|SU|AL");
            InitDataCombo(0, "OldNew", "Old|New", "Old|New");
            InitDataCombo(0, "Manufacturer", "Jindo", "Jindo");

            PopupImage  =  "/opuscntr/img/btns_calendar.gif";
            ShowButtonImage = 2;

            DoSearch("sample_object_data.xml");
        }
    }

    function initSheet2() {
        with(form.sheet2) {
            // 높이 설정
            style.height = 160; //GetSheetHeight(5);

            //Host정보 설정[필수][HostIp, Port, PagePath]
            if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

            //전체Merge 종류 [선택, Default msNone]
            MergeSheet = msNone;

           //전체Edit 허용 여부 [선택, Default false]
            Editable = true;

            //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
            InitRowInfo( 1, 1, 10, 100);

            var HeadTitle = "Status|CHK|CNTR No.|TY/SZ|MATL|PUC|PUCredit|Min O/H Days|Free Days|DII Fee|Old /New";

            //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
            InitColumnInfo(ComCountHeadTitle(HeadTitle), 0, 0, true);

            // 해더에서 처리할 수 있는 각종 기능을 설정한다
            //InitHeadMode(true, true, false, true, false,false)

            //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
            InitHeadRow(0, HeadTitle, true);
            var cnt=0;
            //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
            InitDataProperty(0, cnt++, dtHiddenStatus,  0,    daCenter,  true,  "Status");
            InitDataProperty(0, cnt++, dtCheckBox,      0,    daCenter,  true,  "hiddencheck");
            InitDataProperty(0, cnt++, dtData,          100,  daCenter,  false, "CntrNo",   true);
            InitDataProperty(0, cnt++, dtCombo,         50,   daCenter,  false, "TySz");
            InitDataProperty(0, cnt++, dtCombo,         50,   daCenter,  false, "Matl");
            InitDataProperty(0, cnt++, dtData,          80,   daCenter,  false, "Puc");
            InitDataProperty(0, cnt++, dtData,          80,   daCenter,  false, "PUCredit");
            InitDataProperty(0, cnt++, dtData,          80,   daCenter,  false, "MinOHDays", false, "",           dfInteger);
            InitDataProperty(0, cnt++, dtData,          60,   daCenter,  false, "FreeDays",  false, "",           dfInteger);
            InitDataProperty(0, cnt++, dtData,          50,   daCenter,  false, "DIIFree",   false, "",           dfInteger);
            InitDataProperty(0, cnt++, dtCombo,         60,   daCenter,  false, "OldNew");

            InitDataCombo(0, "TySz", "D|R|P|2|4|5|D2", "D|R|P|2|4|5|D2");
            InitDataCombo(0, "Matl", "SS|SU|AL", "SS|SU|AL");
            InitDataCombo(0, "OldNew", "Old|New", "Old|New");
        }
    }

    var zoomFlag = "open"
    var btnObj = null;
    function func_test(sName) {
        txtEvent.value = "";
        if (document.activeElement.type=="button") {
	        //현재 눌린 버튼 색상 설정 & 이전 눌린 버튼 색상 회복
	        if (btnObj!=null) btnObj.style.backgroundColor = "";
	        btnObj = document.activeElement;
	        if (btnObj!=null) btnObj.style.backgroundColor = "#ff00ff";
	    }

        if (ComFuncCheck(sName)) {
            MsgAdd('=======================================================');
            MsgAdd("Syntax : " + ComFunc.toString().split("\n")[0]);
            MsgAdd('=======================================================');

            helpurl.href = "http://opus.cyberlogitec.com/jsdoc/CoObject.html#" + sName;
            helpurl.innerText = sName + " 도움말";
        } else {
            MsgAdd('================[ ' + sName + ' ]==================');
        }

        switch(sName) {
            case "ComGetSheetObjectTag":
                MsgAdd(sName + '("sheet1")          ==> \n'   + ComGetSheetObjectTag("sheet1"));
                break;
            case "ComEtcDataToForm":
                MsgAdd(sName + '(form, form.sheet1)                 ==> '   + ComEtcDataToForm(form, form.sheet1));
                MsgAdd(sName + '(form, form.sheet1, "txt")          ==> '   + ComEtcDataToForm(form, form.sheet1, "txt"));
                break;
            case "ComEtcDataToForm2":
                MsgAdd(sName + '(form, form.sheet1)                 ==> '   + ComEtcDataToForm2(form, form.sheet1));
                MsgAdd(sName + '(form, form.sheet1, "txt")           ==> '   + ComEtcDataToForm2(form, form.sheet1, "txt"));
                break;
            case ">>":
                ComOpenWait(true);
                var sTime = new Date();
                ComSheet2SheetCheck(form.sheet1, form.sheet2, "hiddencheck");
                var eTime = new Date();
                MsgAdd('ComSheet2SheetCheck(form.sheet1, form.sheet2, "hiddencheck")          ==> '   + (eTime-sTime)/1000);
                ComOpenWait(false);
                break;
            case "<<":
                ComOpenWait(true);
                var sTime = new Date();
                ComSheet2SheetCheck(form.sheet2, form.sheet1, "hiddencheck");
                var eTime = new Date();
                MsgAdd('ComSheet2SheetCheck(form.sheet2, form.sheet1, "hiddencheck")          ==> '   + (eTime-sTime)/1000);
                ComOpenWait(false);
                break;
            case ">>(방식2)":
                var sTime = new Date();
                var sXml = ComMakeSearchXml(form.sheet1, false, "hiddencheck","CntrNo|TySz|Matl|Puc|PUCredit|MinOHDays|FreeDays|DIIFree|OldNew", true)
                form.sheet2.LoadSearchXml(sXml, true);
                var eTime = new Date();
                MsgAdd(sName + '(ComMakeSearchXml + LoadSearchXml)  ==> '   + (eTime-sTime)/1000);
                break;
            case "<<(방식2)":
                var sTime = new Date();
                var sXml = ComMakeSearchXml(form.sheet2, false, "hiddencheck","CntrNo|TySz|Matl|Puc|PUCredit|MinOHDays|FreeDays|DIIFree|OldNew", true)
                form.sheet1.LoadSearchXml(sXml, true);
                var eTime = new Date();
                MsgAdd(sName + '(ComMakeSearchXml + LoadSearchXml)  ==> '   + (eTime-sTime)/1000);
                break;
            case "ComGetSheetViewRows":
                if (zoomFlag=="open") {
                    iRows = ComGetSheetViewRows(form.sheet1,"MIN",0);
                    zoomFlag = "close";
                } else {
                    iRows = ComGetSheetViewRows(form.sheet1,"MAX",1);
                    zoomFlag = "open";
                }
                alert(zoomFlag + " = " + iRows);
                form.sheet1.style.height = form.sheet1.GetSheetHeight(iRows);

                break;
            case "ComGetEtcData":
                var xmlStr = form.sheet1.GetSearchXml("sample_object_data.xml");
                MsgAdd(sName + '(xmlStr, "txtName")          ==> '   + ComGetEtcData(xmlStr, "txtName"));
                MsgAdd(sName + '(xmlStr, "sltCity")          ==> '   + ComGetEtcData(xmlStr, "sltCity"));
                MsgAdd(sName + '(xmlStr, "rdoCity")          ==> '   + ComGetEtcData(xmlStr, "rdoCity"));
                MsgAdd(sName + '(xmlStr, "chkYn")            ==> '   + ComGetEtcData(xmlStr, "chkYn") );
                MsgAdd(sName + '(xmlStr, "sltCityMulti")     ==> '   + ComGetEtcData(xmlStr, "sltCityMulti") );
                MsgAdd(sName + '(xmlStr, "noName")           ==> '   + ComGetEtcData(xmlStr, "noName") );
                break;
            case "ComMakeSearchXml":
                MsgAdd(sName + '(form.sheet1, false, "hiddencheck","CntrNo|TySz|MinOHDays|OldNew")   ==> \n'   + ComMakeSearchXml(form.sheet1, false, "hiddencheck","CntrNo|TySz|MinOHDays|OldNew"));
                MsgAdd('=======================================================');
                MsgAdd(sName + '(form.sheet1, true)   ==> \n'   + ComMakeSearchXml(form.sheet1, true));
                break;
            case "ComIsModifiedSheets":
                var sheetObjects = new Array(form.sheet1, form.sheet2);
                MsgAdd(sName + '(sheetObjects) ==> '   + ComIsModifiedSheets(sheetObjects) );
                break;
            case "ComSheetFiltering":
                ComSheetFiltering(form.sheet1);
                break;
            case "ComCalendarGrid for div":
                form.sheet1.LeftCol = form.sheet1.SaveNameCol("MDate");//날짜 컬럼이 눈에 보이도록 함

                var cal = new ComCalendarGrid();
                cal.select2(form.txtCalDate, form.sheet1, -1, "MDate", 'yyyy-MM-dd');
                break;
            case "ComGetHiddenCols":
                MsgAdd(sName + '(form.sheet1) ==> '   + ComGetHiddenCols(form.sheet1) );
                break;
            case "ComGetSaveNameParam":
                MsgAdd(sName + '(form.sheet1) ==> '   + ComGetSaveNameParam(form.sheet1) );
                MsgAdd(sName + '(form.sheet2) ==> '   + ComGetSaveNameParam(form.sheet2) );

                var sheetObjects = new Array(form.sheet1, form.sheet2);
                MsgAdd(sName + '(sheetObjects)   ==> '   + ComGetSaveNameParam(sheetObjects) );
            	break;
            case "ComGetPrefixParam":
                MsgAdd(sName + '("hir_") 	==> '   + ComGetPrefixParam("hir_") );

                var aryPrefix = new Array("hir_", "pay_", "otr_");
                MsgAdd(sName + '(aryPrefix)	==> '   + ComGetPrefixParam(aryPrefix) );
                MsgAdd('\n\n// var aryPrefix = new Array("hir_", "pay_", "otr_");');
            	break;
            case "ComGetSaveString":
                MsgAdd(sName + '(form.sheet1) ==> '   + ComGetSaveString(form.sheet1) );
                MsgAdd(sName + '(form.sheet2) ==> '   + ComGetSaveString(form.sheet2) );

                var sheetObjects = new Array(form.sheet1, form.sheet2);
                MsgAdd(sName + '(sheetObjects)   ==> '   + ComGetSaveString(sheetObjects) );
                
            	break;
            case "ComShowMemoPad":
            	MsgAdd("IBSheet1의 CNTR NO. 셀을 클릭하세요!!");
            	MsgAdd("ComShowMemoPad(sheetObj, [row=SelectRow], [col=SelectCol], [bReadOnly=false], [iWidth=200], [iHeight=200])");
            	break;
            	
           	case "ComRowHideDelete":
                MsgAdd(sName + '(form.sheet1, "hiddencheck") ==> '   + ComRowHideDelete(form.sheet1, "hiddencheck") );
           		break;
        }
        MsgAdd('=======================================================');
    }

    function MsgAdd(sMsg)
    {
        //메시지 표시
        txtEvent.value = txtEvent.value + sMsg + "\n";

        //스크롤 처리, 반드시 아래 줄을 둬야함.. 이상함..
        txtEvent.scrollTop = txtEvent.scrollHeight - txtEvent.clientHeight ;
    }

    function sheet1_OnPopupClick(sheetObj, row,col){
        if (sheetObj.ColSaveName(col) != "MDate") return;
        var cal = new ComCalendarGrid("myCal");
        cal.select(sheetObj, row, col, 'yyyy-MM-dd');
    }
    
    function sheet1_OnClick(sheetObj, row, col){
        if (sheetObj.ColSaveName(col) != "CntrNo") return;
        
    	func_test("ComShowMemoPad");
        //ComShowMemoPad(sheetObj, [row=SelectRow], [col=SelectCol], [bReadOnly=false], [iWidth=200], [iHeight=200])        
        if (row % 2 == 0) 
    		ComShowMemoPad(sheetObj);//짝수줄 편집가능
    	else
    		ComShowMemoPad(sheetObj, null, null, true, 200, 100);	//홀수줄 편집불가능
    }
</script>
</head>

<body onload="loadPage()" onkeydown="if(event.keyCode==8 && event.srcElement.readOnly)return false;">

  <table id="tabLayer" bgcolor="#efefef" width="980">
    <tr>
        <td>
          <b>[CoObject]</b><br>
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetSheetObjectTag" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComEtcDataToForm" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComEtcDataToForm2" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetEtcData" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetSheetViewRows" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComMakeSearchXml" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComIsModifiedSheets" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetHiddenCols" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetSaveNameParam" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetPrefixParam" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComGetSaveString" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComShowMemoPad" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComRowHideDelete" >
            <input type="button" style="width:190" onclick="func_test(this.value)" value="ComSheetFiltering" >
        </td>
    </tr>
  </table>

  <form name="form">
  <table bgcolor="#e0e0e0" width="980">
    <tr>
        <td>
          <b>[HTML 오브젝트]</b><br>
          txtName : <input type="text" name="txtName" value="한진해운" maxlength="3" required> /
          btnSave : <img style="border:0px; cursor:hand;" src="/opuscntr/img/enis/button/btn_save.gif" width="66" height="20" border="0" name="btnSave"> /
          sltCity : <select name="sltCity" required>
                        <option value="01">서울</option>
                        <option value="02">대전</option>
                        <option value="03">대구</option>
                        <option value="04" selected>부산</option>
                    </select>
          rdoCity : <input type="radio" name="rdoCity" value="01" required>서울
                    <input type="radio" name="rdoCity" value="02">대전
                    <input type="radio" name="rdoCity" value="03">대구
                    <input type="radio" name="rdoCity" value="04">부산
          <br>
          chkYn :<input type="checkbox" name="chkYn" value="Y" required caption="checkbox chkYn">
          MultiCombo    : <script language="javascript">ComComboObject('combo1');</script>
            날짜 : <input type="text" name="txtCalDate" size="10" readonly >
            <input type="button" style="width:190" onclick="func_test(this.value,true)" value="ComCalendarGrid for div" >

        </td>
        <td>
          sltCityMulti :<br>
            <select name="sltCityMulti" multiple size="3">
                <option value="01">서울</option>
                <option value="02">대전</option>
                <option value="03">대구</option>
                <option value="04" selected>부산</option>
            </select>
        </td>
    </tr>
  </table>
  <table bgcolor="#e0e0e0" width="980">
    <tr width="100%" height="100">
        <td width="45%">
          <b>[IBSheet1]</b>
            <script language="javascript">ComSheetObject('sheet1');</script>
        </td>
        <td align="center">
            <input type="button" style="width:150" onclick="func_test(this.value)" value=">>" >
            <input type="button" style="width:150" onclick="func_test(this.value)" value="<<" >
            <br>
            <input type="button" style="width:150" onclick="func_test(this.value)" value=">>(방식2)" >
            <input type="button" style="width:150" onclick="func_test(this.value)" value="<<(방식2)" >
        </td>
        <td width="45%">
          <b>[IBSheet2]</b>
            <script language="javascript">ComSheetObject('sheet2');</script>
        </td>
    </tr>
    <tr>
    	<td colspan="3">* [IBSheet1]의 CNTR No. 컬럼의 데이터셀 클릭해보기! 홀수행 짝수행 다름!(MemoPad)</td>
    </tr>
  </table>
  
  </form>

  <textarea name="txtEvent" rows="8" cols="110" wrap="off" style="width:980; background-color:beige;"></textarea><br>
  <a href="sample.jsp">sample.jsp</a>,
  <a target="opuscntrhelp" href="http://opus.cyberlogitec.com/jsdoc/index.html">도움말 전체</a>,
  <a target="opuscntrhelpsub" href="http://opus.cyberlogitec.com/jsdoc/index.html" id="helpurl">함수도움말</a>

</body>
</html>