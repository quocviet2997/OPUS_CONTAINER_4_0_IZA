/**
===============================================================================
프로그램  명  : RD관련 공통 함수 정의 Script
프로그램개요  :
작   성   자  :
작   성   일  :
===============================================================================
수정자/수정일 : 이경희/2008년 12월 08일
수정사유/내역 : 자바스크립도움말을 위한 주석 수정
===============================================================================
*/

    /*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
    /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 RD(Report Designer) 관련 공통 자바스크립트 함수가 정의되어 있다.
     * @author 한진해운
     */

    /**
     * @class CoPrint : RD(Report Designer) 관련 공통 자바스크립트 함수가 정의되어 있다.
     */
    function CoPrint() {
        this.ComRDObject          = ComRDObject;
        this.printHtml            = printHtml;
        this.getErdServerUrl      = getErdServerUrl;
        this.encode               = encode;
    }

    /*------------------여기서 부터 공통자바스크립트 함수를 정의한다.     ------------------*/

    /**
     * RD개체를 생성한다.
     * <br><b>Example :</b>
     * <pre>
     *     &lt;script language="javascript"&gt;ComRDObject('rdviewer1','100%','100%');&lt;/script&gt;
     * </pre>
     * @param {string} id     - RD오브젝트의 ID를 문자열로 설정한다.
     * @param {number} width  - RD오브젝트의 width를 문자열로 설정한다.
     * @param {number} height - RD오브젝트의 height를 문자열로 설정한다.
     * @return 없음
     */
    function ComRDObject(id,width,height){
        document.write('<OBJECT ID="'+id+'" classid="clsid:5A7B56B3-603D-4953-9909-1247D41967F8" name="'+id+'" width="'+width+'" height="'+height+'"');
        document.write(' codebase="/opuscntr/RDServer/rdviewer50u.cab#version=5,0,0,140">');
        document.write(' </OBJECT>');
        //initRDV
    }


    /* 아래부분은 삭제대상 */
    var ERD_URL        = "http://21.101.3.31:8700/acweb/newrequest/do_executereport.jsp";
    var ERD_SERVER_URL = "http://21.101.3.31:8000";
    var VOLUME         = "report";
    var USERID         = "administrator";
    var PASSWORD       = "";

    /**
     * html 을 출력할때 사용할 header와 footer를 통제하는 함수
     * @param {rd} obj   ScriptX obj
     */
    function printHtml(obj) {
        obj.printing.header = "";
        obj.printing.footer = "";
        obj.printing.portrait = true;
        obj.printing.leftMargin = 30.0;
        obj.printing.topMargin = 30.0;
        obj.printing.rightMargin = 30.0;
        obj.printing.bottomMargin = 30.0;
        obj.printing.Print(false, window);
    }



    /**
     * Erd 서버관련 URL을 반환하는 함수
     * @param {string} fileName   서버내 경로를 포함한 파일명
     */
    function getErdServerUrl(fileName) {
            var url = ERD_URL;
            //system parameter
            url = url + '?__executableName=' + fileName;
            url = url + '&serverURL=' + ERD_SERVER_URL;
            url = url + '&volume=' + VOLUME;
            url = url + '&userid=' + USERID;
            url = url + '&password=' + PASSWORD;
            return url;
    }

    /**
     * jsp 전송시에 사용할 인코딩 관련함수
     * @param  String
     * @return String
     */
    var hex = new Array(
        "%00", "%01", "%02", "%03", "%04", "%05", "%06", "%07",
        "%08", "%09", "%0a", "%0b", "%0c", "%0d", "%0e", "%0f",
        "%10", "%11", "%12", "%13", "%14", "%15", "%16", "%17",
        "%18", "%19", "%1a", "%1b", "%1c", "%1d", "%1e", "%1f",
        "%20", "%21", "%22", "%23", "%24", "%25", "%26", "%27",
        "%28", "%29", "%2a", "%2b", "%2c", "%2d", "%2e", "%2f",
        "%30", "%31", "%32", "%33", "%34", "%35", "%36", "%37",
        "%38", "%39", "%3a", "%3b", "%3c", "%3d", "%3e", "%3f",
        "%40", "%41", "%42", "%43", "%44", "%45", "%46", "%47",
        "%48", "%49", "%4a", "%4b", "%4c", "%4d", "%4e", "%4f",
        "%50", "%51", "%52", "%53", "%54", "%55", "%56", "%57",
        "%58", "%59", "%5a", "%5b", "%5c", "%5d", "%5e", "%5f",
        "%60", "%61", "%62", "%63", "%64", "%65", "%66", "%67",
        "%68", "%69", "%6a", "%6b", "%6c", "%6d", "%6e", "%6f",
        "%70", "%71", "%72", "%73", "%74", "%75", "%76", "%77",
        "%78", "%79", "%7a", "%7b", "%7c", "%7d", "%7e", "%7f",
        "%80", "%81", "%82", "%83", "%84", "%85", "%86", "%87",
        "%88", "%89", "%8a", "%8b", "%8c", "%8d", "%8e", "%8f",
        "%90", "%91", "%92", "%93", "%94", "%95", "%96", "%97",
        "%98", "%99", "%9a", "%9b", "%9c", "%9d", "%9e", "%9f",
        "%a0", "%a1", "%a2", "%a3", "%a4", "%a5", "%a6", "%a7",
        "%a8", "%a9", "%aa", "%ab", "%ac", "%ad", "%ae", "%af",
        "%b0", "%b1", "%b2", "%b3", "%b4", "%b5", "%b6", "%b7",
        "%b8", "%b9", "%ba", "%bb", "%bc", "%bd", "%be", "%bf",
        "%c0", "%c1", "%c2", "%c3", "%c4", "%c5", "%c6", "%c7",
        "%c8", "%c9", "%ca", "%cb", "%cc", "%cd", "%ce", "%cf",
        "%d0", "%d1", "%d2", "%d3", "%d4", "%d5", "%d6", "%d7",
        "%d8", "%d9", "%da", "%db", "%dc", "%dd", "%de", "%df",
        "%e0", "%e1", "%e2", "%e3", "%e4", "%e5", "%e6", "%e7",
        "%e8", "%e9", "%ea", "%eb", "%ec", "%ed", "%ee", "%ef",
        "%f0", "%f1", "%f2", "%f3", "%f4", "%f5", "%f6", "%f7",
        "%f8", "%f9", "%fa", "%fb", "%fc", "%fd", "%fe", "%ff"
    );
    function encode(s)
    {
        s = new String(s);
        var sbuf = new String("");

        var len = s.length;
        for (var i = 0; i < len; i++)
        {
            var ch = s.charAt(i);
            var chCode = s.charCodeAt(i);
            if ('A' <= ch && ch <= 'Z')
            {       // 'A'..'Z'
                sbuf+=ch;
            }
            else if ('a' <= ch && ch <= 'z')    // 'a'..'z'
            {
                sbuf+=ch;
            }
            else if ('0' <= ch && ch <= '9')    // '0'..'9'
            {
                sbuf+=ch;
            }
            else if (chCode <= 0x007f)  // other ASCII
            {
                sbuf+=hex[chCode];
            }
            else if (chCode <= 0x07FF)      // non-ASCII <= 0x7FF
            {
                sbuf+=(hex[0xc0 | (chCode >> 6)]);
                sbuf+=(hex[0x80 | (chCode & 0x3F)]);
            }
            else                    // 0x7FF < ch <= 0xFFFF
            {
                sbuf+=(hex[0xe0 | (chCode >> 12)]);
                sbuf+=(hex[0x80 | ((chCode >> 6) & 0x3F)]);
                sbuf+=(hex[0x80 | (chCode & 0x3F)]);
            }
        }
        return sbuf;
    }
