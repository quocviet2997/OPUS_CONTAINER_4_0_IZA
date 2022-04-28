// 공통전역변수
var comboObjects = new Array();
var comboCnt = 0 ;



// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){

         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/

         /*******************************************************/
         var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");


            switch(srcName) {

        	    case "btn_retrieve":

        	        break;

                case "btns_calendar1":
        	         var cal = new calendarPopup();
            		 cal.select(formObject.sdate, 'sdate', 'yyyy-MM-dd');
        	        break;

        	    case "btns_calendar2":
                    var cal = new calendarPopup();
            		 cal.select(formObject.edate, 'edate', 'yyyy-MM-dd');
        	        break;

            } // end switch
    	}catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e);
    		}
    	}
    }



    /**
     * Object 기본 설정 및 초기화
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
    function loadPage2() {

        for(p=0;p< comboObjects.length;p++){
            initCombo (comboObjects[p],p+1);
        }
    }


    /**
     * IBCombo Object를 배열로 등록
    * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setComboObject(combo_obj){
        comboObjects[comboCnt++] = combo_obj;
    }


    /**
     * Tab 기본 설정
     * 탭의 항목을 설정한다.
     */
    function initCombo (comboObj, comboNo) {
        var cnt  = 0 ;
        switch(comboNo) {
            case 1:
               with (comboObj) {

    	       //SetColAlign("left|left");
               //SetColWidth("40|60");
               
    	       MultiSelect = true;
    	       MaxSelect = 2 ;
    	       InsertItem(cnt ++, "01|All", "01");
    	       InsertItem(cnt ++, "02|Cope", "02");
    	       InsertItem(cnt ++, "03|Handymax", "03");
    	       InsertItem(cnt ++, "04|Panamax", "04");

               Code = "01";
    	    }
               break;
         }
    }

    function biz_OnBlur(comObj)
    {
        var finded = comObj.FindIndex(comObj.Text() , 0);
        comObj.Code = finded;
        document.all.targetTxt.value = comObj.GetText(finded , 1);

        switch (finded)
        {
            case "01":
                comboObjects[1].Code = "01|02";
            break;
            case "02":
                comboObjects[1].Code = "02|03";
            break;
            case "03":
                comboObjects[1].Code = "03|04";
            break;
            case "04":
                comboObjects[1].Code = "04|01";
            break;
        }
    }

    function biz_OnChange(comObj,index,text)
    {
        document.all.targetTxt.value = comObj.GetText(index , 1);

        switch (comObj.Code)
        {
            case "01":
                comboObjects[1].Code = "01|02";
            break;
            case "02":
                comboObjects[1].Code = "02|03";
            break;
            case "03":
                comboObjects[1].Code = "03|04";
            break;
            case "04":
                comboObjects[1].Code = "04|01";
            break;
        }

    }
    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
//            if (!isNumber(formObj.iPage)) {
//                return false;
//            }
        }

        return true;
    }
