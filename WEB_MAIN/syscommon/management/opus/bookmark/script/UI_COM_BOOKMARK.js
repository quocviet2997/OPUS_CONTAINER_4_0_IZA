
// 공통전역변수
var curTab = 1;
var beforetab = 0;
var sheetObjects = new Array();
var sheetCnt = 0;


// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
document.onclick = processButtonClick;

// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
    function processButtonClick(){
         /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
  		var sheetObject1  = sheetObjects[0];   
         /*******************************************************/
  		var formObject = document.form;

    	try {
    		var srcName = window.event.srcElement.getAttribute("name");

				switch(srcName) {
				case "btn_folderadd":
					doActionIBSheet(sheetObjects[0],document.form,IBINSERT);
					break;
				
					case "btn_retrieve":
						doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
						break;

					case "btn_move":
						
						var curRow = sheetObjects[0].SelectRow;
						
						if(sheetObjects[0].cellText(curRow,"pgm_nm")==''){
							return;
						}
						
						formObject.f_cmd.value = SEARCH01;
						formObject.sel_pgm_no.value = sheetObjects[0].cellText(curRow,"pgm_no");
						formObject.sel_dp_nm.value = sheetObjects[0].cellText(curRow,"dp_nm");
						formObject.sel_prnt_pgm_no.value = sheetObjects[0].cellText(curRow,"prnt_pgm_no");
						
						var tmp =window.showModalDialog("MOVEBOOKMARK.do?" + FormQueryString(formObject), window, "scroll:no;status:no;help:no;dialogWidth:500px;dialogHeight:255px");
						
						var tmpArr = tmp.split("|"); 
						sheetObjects[0].CellValue2(curRow,"prnt_pgm_no")= tmpArr[0];
						
						var folderLoc = -1;
						for(ii=1;ii <= sheetObjects[0].rowCount;ii++){
							if(sheetObjects[0].cellText(ii,"pgm_no")== tmpArr[0]){
								folderLoc = ii;
								var dpSeq = 0;
								var isMoved = false;
								for(jj=ii+1;jj<= sheetObjects[0].rowCount;jj++){
									if(sheetObjects[0].CellText(jj,"prnt_pgm_no")!=tmpArr[0]){
										sheetObjects[0].CellValue2(curRow,"dp_seq")= ++dpSeq;
										sheetObjects[0].DataMove(jj);
										isMoved = true;
										break;
									}else{
										dpSeq = sheetObjects[0].cellText(jj,"dp_seq");
									}// end if
								}// for
								
								if(!isMoved){
									sheetObjects[0].CellValue2(curRow,"dp_seq")= ++dpSeq;
									sheetObjects[0].DataMove(sheetObjects[0].rowCount+1);
								}
								break;
							}
						}
						break;

					case "btn_delete":
						ComRowHideDelete(sheetObjects[0],"del_chk");
						break;
					
					case "btn_oderup":
						orderUp();
						break; 
					
					case "btn_oderdown":
						orderDown();
					break;					

					case "btn_save":
						doActionIBSheet(sheetObjects[0],document.form,IBSAVE);
					break;

					case "btn_close":
						window.close();
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
    
    	function orderUp(){

     		var curRow = sheetObjects[0].SelectRow;
     		var selRowPgmNo = sheetObjects[0].CellValue(curRow,"pgm_no"); // 이동할 pgm_no
     		
     		if(sheetObjects[0].CellValue(curRow,"fol_flg") == "Y"){ // 폴더인지 프로그램인지 체크 null이면 폴더
     			for ( var int = curRow; int > 1; int--) {
	     			if(sheetObjects[0].CellValue(int-1,"fol_flg") == "Y"){ // 상위 data가 폴더인지를 체크한다.
	     				//폴더이면 상위 pgm_no 가져옴 
	     				var topPgmNo = sheetObjects[0].CellValue(int-1,"pgm_no");
	     				sheetObjects[0].CellValue(int-1,"pgm_no") = selRowPgmNo; // 상위폴더 pgm_no = selectRow pgm_no 입력한다
	     				sheetObjects[0].CellValue(curRow,"pgm_no") = topPgmNo;	// selectRow pgm_no  = 상위폴더 pgm_no 입력한
	     				for ( var num = 1; num <= sheetObjects[0].RowCount; num++) {
	     					//루프를 돌면서 변경된 prnt_pgm_no 업데이트 한다.
							if(sheetObjects[0].CellValue(num,"prnt_pgm_no") == selRowPgmNo){
								sheetObjects[0].CellValue(num,"prnt_pgm_no") = topPgmNo;
							}else if(sheetObjects[0].CellValue(num,"prnt_pgm_no") == topPgmNo){
								sheetObjects[0].CellValue(num,"prnt_pgm_no") = selRowPgmNo;
							}
						}
	     				break;
	     			}
				}
	    	}
     		var tmpPgmNm = sheetObjects[0].CellValue(curRow,"pgm_nm");
     		if(curRow > 1 && curRow <= sheetObjects[0].RowCount){
     			//program name 값이 있으면 bookmark이고, 값이 없으면 Folder이다. 
     			if(tmpPgmNm!=''){
     				childOrderUp();     				
     			}else{
     				folderOrderUp();
     			}//end if
     		}//end if
    	}//end function 

    	function folderOrderUp(){
     		var curRow = sheetObjects[0].SelectRow;
     		var rowCnt = sheetObjects[0].RowCount;
     		
 					//위 쪽에 폴더가 있는지 여부를 찾고 있으면, 위 쪽 폴더와 dp_seq값을 바꾼다.
     		for(var i= curRow-1; i >= 1;i--){
     			if(sheetObjects[0].CellValue(i,"pgm_nm")==''){
     				var tmpDpSeq = sheetObjects[0].CellValue(i,"dp_seq");
     				sheetObjects[0].CellValue2(i,"dp_seq")= sheetObjects[0].CellValue(curRow,"dp_seq");
     				sheetObjects[0].CellValue2(curRow,"dp_seq") = tmpDpSeq;

     				sheetObjects[0].DataMove(i);
     				break;
     			}//end if 
     		}//end for
    	}// end function

    	function childOrderUp(){
    		var curRow = sheetObjects[0].SelectRow;
    		if(curRow>1 && curRow <= sheetObjects[0].RowCount){
    			//Folder간에는 이동이 안됨.
    			if(sheetObjects[0].CellValue(curRow-1,"pgm_nm")==''){
    				return;
    			}//폴더 안에 존재하는 data
    			else if(sheetObjects[0].CellValue(curRow,"prnt_pgm_no")!=''){
    				var tmpDpSeq = sheetObjects[0].CellValue(curRow-1,"dp_seq");
        			sheetObjects[0].CellValue(curRow-1,"dp_seq")= sheetObjects[0].CellValue(sheetObjects[0].SelectRow,"dp_seq");
        			sheetObjects[0].CellValue(sheetObjects[0].SelectRow,"dp_seq") = tmpDpSeq;
        			sheetObjects[0].DataMove(curRow-1);   
    			}//상위  DATA가 prnt_pgm_no 있으면.. 실행 폴더안에 들어있는 경우
    			else if(sheetObjects[0].CellValue(curRow-1,"prnt_pgm_no")!=''){
    				for ( var int = curRow-1; int > 0; int--) {
    					if(sheetObjects[0].CellValue(int,"prnt_pgm_no") == ''){
    						curRow = int+1;
    						break;
    					}
					}
    				var tmpDpSeq = sheetObjects[0].CellValue(curRow-1,"dp_seq");
        			sheetObjects[0].CellValue(curRow-1,"dp_seq")= sheetObjects[0].CellValue(sheetObjects[0].SelectRow,"dp_seq");
        			sheetObjects[0].CellValue(sheetObjects[0].SelectRow,"dp_seq") = tmpDpSeq;
        			sheetObjects[0].DataMove(curRow-1);   
    			}else{
    				var tmpDpSeq = sheetObjects[0].CellValue(curRow-1,"dp_seq");
        			sheetObjects[0].CellValue(curRow-1,"dp_seq")= sheetObjects[0].CellValue(sheetObjects[0].SelectRow,"dp_seq");
        			sheetObjects[0].CellValue(sheetObjects[0].SelectRow,"dp_seq") = tmpDpSeq;
        			sheetObjects[0].DataMove(curRow-1);   
    			}
    		}
    	}


    	function folderOrderDown(){
     		var curRow = sheetObjects[0].SelectRow;
     		var rowCnt = sheetObjects[0].RowCount;
     		var isNextFolderFound = false; 
     		var isNextFolderLoc = -1;
     		var isNextNextFolderFound = false; 
     		var isNextNextFolderLoc = -1;
     		
     		if(curRow >= 1 && curRow < rowCnt){
     					
     					//아래쪽에 폴더가 있는지 여부를 찾고 있으면, 아래쪽 폴더와 dp_seq값을 바꾼다.
     			for(var i= curRow+1; i <= rowCnt;i++){
     				if(sheetObjects[0].CellValue(i,"pgm_nm")==''){
     					
     					var tmpDpSeq = sheetObjects[0].CellValue(i,"dp_seq");
     					sheetObjects[0].CellValue(i,"dp_seq")= sheetObjects[0].CellValue(curRow,"dp_seq");
     					sheetObjects[0].CellValue(curRow,"dp_seq") = tmpDpSeq;
     					isNextFolderFound = true;
     					isNextFolderLoc = i;
     					break;
     				}//end if
     			}//end for
     	
     					//아래에 폴더가 있으면 
     			if(isNextFolderFound==true){
     							//아래 폴더 위치가 마지막 행이면  아래아래폴더를 찾을 필요없다. 
     					if(isNextFolderLoc==rowCnt){
     						sheetObjects[0].DataMove(rowCnt+1);
     					}else{
     						for(var j=isNextFolderLoc+1;j<= rowCnt; j++){
     							if(sheetObjects[0].CellValue(j,"pgm_nm")==''){
     								isNextNextFolderFound = true;
     								isNextNextFolderLoc = j;
     								break;
     							}//end if
     						}//end for
     						if(isNextNextFolderFound==true){
     							sheetObjects[0].DataMove(isNextNextFolderLoc);
     						}else{
     							sheetObjects[0].DataMove(rowCnt+1);
     						}//end if
     					}//end if
    					}// end if
     			}//end if : LINE 95
    		}

    	function childOrderDown(){
    		
     		var curRow = sheetObjects[0].SelectRow;
     		if(sheetObjects[0].RowCount == curRow || 
     				sheetObjects[0].CellValue(curRow,"fol_flg")=='Y' || 
     				sheetObjects[0].CellValue(curRow+1,"fol_flg")=='Y'){
     			
				return;
				
			}
     	
     		var selectDpSeq = sheetObjects[0].CellValue(curRow,"dp_seq");
     		var lowDpSeq = sheetObjects[0].CellValue(curRow+1,"dp_seq");
			sheetObjects[0].CellValue(curRow,"dp_seq")= lowDpSeq;
			sheetObjects[0].CellValue(curRow+1,"dp_seq") = selectDpSeq;
			sheetObjects[0].DataMove(curRow+2);    	
     		
     		
//     		if(curRow >= 1 && curRow < sheetObjects[0].RowCount){
//     			//Folder간에는 이동이 안됨.
//	    			if(sheetObjects[0].CellValue(curRow+1,"pgm_nm")==''){
//	    				return;
//	    				}
//
//	    			var tmpDpSeq = sheetObjects[0].CellValue(curRow+1,"dp_seq");
//	    			sheetObjects[0].CellValue(curRow+1,"dp_seq")= sheetObjects[0].CellValue(curRow,"dp_seq");
//	    			sheetObjects[0].CellValue(curRow,"dp_seq") = tmpDpSeq;
//	    			sheetObjects[0].DataMove(curRow+2);    			
//     				}
    	}

    	function orderDown(){

     		var curRow = sheetObjects[0].SelectRow;
     		var selRowPgmNo = sheetObjects[0].CellValue(curRow,"pgm_no"); // 이동할 pgm_no
     		var tmpPgmNm = sheetObjects[0].CellValue(curRow,"pgm_nm");

     		if(sheetObjects[0].CellValue(curRow,"fol_flg") == "Y"){ // 폴더인지 프로그램인지 체크 null이면 폴더
     			for ( var int = curRow+1; int > 1; int++) {
	     			if(sheetObjects[0].CellValue(int,"fol_flg") == "Y"){ // 상위 data가 폴더인지를 체크한다.
	     				//폴더이면 상위 pgm_no 가져옴 
	     				var topPgmNo = sheetObjects[0].CellValue(int,"pgm_no");
	     				sheetObjects[0].CellValue(int,"pgm_no") = selRowPgmNo; // 상위폴더 pgm_no = selectRow pgm_no 입력한다
	     				sheetObjects[0].CellValue(curRow,"pgm_no") = topPgmNo;	// selectRow pgm_no  = 상위폴더 pgm_no 입력한
	     				for ( var num = 1; num <= sheetObjects[0].RowCount; num++) {
	     					//루프를 돌면서 변경된 prnt_pgm_no 업데이트 한다.
							if(sheetObjects[0].CellValue(num,"prnt_pgm_no") == selRowPgmNo){
								sheetObjects[0].CellValue(num,"prnt_pgm_no") = topPgmNo;
							}else if(sheetObjects[0].CellValue(num,"prnt_pgm_no") == topPgmNo){
								sheetObjects[0].CellValue(num,"prnt_pgm_no") = selRowPgmNo;
							}
						}
	     				break;
	     			}
				}
	    	}

     		if(curRow >= 1 && curRow < sheetObjects[0].RowCount){
     			//program name 값이 있으면 bookmark이고, 값이 없으면 Folder이다. 
     			if(tmpPgmNm!=''){
     				childOrderDown();     				
     			}else{
     				folderOrderDown();
     			}//end if
     		}//end if
    	}//end function
    	
    /**
     * IBSheet Object를 배열로 등록
     * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
     * 배열은 소스 상단에 정의
     */
    function setSheetObject(sheet_obj){

       sheetObjects[sheetCnt++] = sheet_obj;

    }

    /**
     * Sheet 기본 설정 및 초기화
     * body 태그의 onLoad 이벤트핸들러 구현
     * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
     */
		function loadPage() {
			for(i=0;i<sheetObjects.length;i++){
				ComConfigSheet(sheetObjects[i]);
				initSheet(sheetObjects[i],i+1);
				ComEndConfigSheet(sheetObjects[i]);
			}
			doActionIBSheet(sheetObjects[0],document.form,IBSEARCH);
		}


  /**
     * 시트 초기설정값, 헤더 정의
     * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
     * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
     */
    function initSheet(sheetObj,sheetNo) {

    	
      var cnt = 0;
				var sheetID = sheetObj.id;

        switch(sheetID) {

            case "sheet1":
					with (sheetObj) {
                    // 높이 설정
                    style.height = 225;
                    //전체 너비 설정
                    SheetWidth = mainTable.clientWidth;

                    //Host정보 설정[필수][HostIp, Port, PagePath]
                    if (location.hostname != "") InitHostInfo(location.hostname, location.port, page_path);

                    //전체Merge 종류 [선택, Default msNone]
                    MergeSheet = msNone;

                   //전체Edit 허용 여부 [선택, Default false]
                    Editable = true;

                    //행정보설정[필수][HEADROWS,DATAROWS,VIEWROWS,ONEPAGEROWS=100]
                    InitRowInfo(1, 1, 3, 100);

					var HeadTitle1 = "|Sel|level|Order|Bookmark Name|Program Name|Program No|||";
					var headCount = ComCountHeadTitle(HeadTitle1);

                    //컬럼정보설정[필수][COLS,FROZENCOL,LEFTHEADCOLS=0,FROZENMOVE=false]
                    InitColumnInfo(headCount, 0, 0, true);

                    // 해더에서 처리할 수 있는 각종 기능을 설정한다
                    InitHeadMode(true, true, false, true, false,false);

                    //해더행정보[필수][ROW,HEADTEXT,ROWMERGE=false, HIDDEN=false]
                    InitHeadRow(0, HeadTitle1, true);
                    
                    //데이터속성    [ROW, COL,  DATATYPE,   WIDTH, 	DATAALIGN, COLMERGE, SAVENAME,  KEYFIELD, CALCULOGIC, DATAFORMAT, POINTCOUNT, UPDATEEDIT, INSERTEDIT, EDITLEN, FULLINPUT, SORTENABLE, TOOLTIP, ALLCHECK, SAVESTATUS, FORMATFIX]
                    InitDataProperty(0, cnt++ , dtHiddenStatus,			30,		daCenter,		true,		"ibflag");
                    InitDataProperty(0, cnt++ , dtRadioCheck,			30,		daCenter,		true,		"del_chk",				false,		"",						dfNone,				0,		true,		true);
                    InitDataProperty(0, cnt++ , dtData,							45,		daCenter,		true,		"level",						false,		"",						dfNone,				0,		true,		true);
                    InitDataProperty(0, cnt++ , dtHidden,						45,		daCenter,		true,		"dp_seq",					false,		"",						dfNone,				0,		true,		true);
                    InitDataProperty(0, cnt++ , dtData,							170,	daLeft,			true,		"dp_nm",					false,		"",						dfNone,				0,		true,		true);
                    InitDataProperty(0, cnt++ , dtData,							100,	daLeft,			true,		"pgm_nm",				false,		"",						dfNone,				0,		false,		false);
                    InitDataProperty(0, cnt++ , dtData,							95,		daLeft,			true,		"pgm_no",				false,		"",						dfNone,				0,		false,		false);
                    InitDataProperty(0, cnt++ , dtHidden,						1,			daLeft,			true,		"usr_id",					false,		"",						dfNone,				0,		false,		false);
                    InitDataProperty(0, cnt++ , dtHidden,						1,			daLeft,			true,		"prnt_pgm_no",		false,		"",						dfNone,				0,		true,		true);
                    InitDataProperty(0, cnt++ , dtHidden,						0,			daLeft,			true,		"fol_flg",					false,		"",						dfNone,				0,		true,		true);
                    
                    InitTreeInfo(2, "level",0,false);
    				NodeClosePicture = "/opuscntr/img/folder.gif";
                    NodeOpenPicture = "/opuscntr/img/folder_s.gif";
                    CountPosition = 0;										
							}
							break;

							
				}
    }

  // Sheet관련 프로세스 처리
    function doActionIBSheet(sheetObj,formObj,sAction) {
        sheetObj.ShowDebugMsg = false;
        switch(sAction) {

						case IBSEARCH:      //조회
							formObj.f_cmd.value = SEARCH;
							
		        var aryPrefix = new Array("", "prefix2", "prefix3","prefix4","prefix5","prefix6","prefix7");	//prefix 문자열 배열	
						  ret = ComGetPrefixParam(aryPrefix);	//결과 : 여러개 조합한 결과 "<font color="red">IBPREFIX</font>=hir_&<font color="red">IBPREFIX</font>=pay_&<font color="red">IBPREFIX</font>=otr_"
							var sXml = sheetObj.GetSearchXml("BOOKMARKGS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
							var arrXml = sXml.split("|$$|");
							if(arrXml.length>0) sheetObj.LoadSearchXml(arrXml[0]);
							
							break;
						
						case IBSAVE:        //저장
							if(!validateForm(sheetObj,formObj,sAction)) {
								return false;
							}
							formObj.f_cmd.value = MULTI;
//							sheetObj.DoSave("BOOKMARKGS.do", FormQueryString(formObj));

							var SaveStr = sheetObj.GetSaveString(false);
							
		       var aryPrefix = new Array("", "prefix2", "prefix3","prefix4","prefix5","prefix6","prefix7");	//prefix 문자열 배열	
						 ret = ComGetPrefixParam(aryPrefix);	//결과 : 여러개 조합한 결과 "<font color="red">IBPREFIX</font>=hir_&<font color="red">IBPREFIX</font>=pay_&<font color="red">IBPREFIX</font>=otr_"
							var sXml = sheetObj.GetSaveXml("BOOKMARKGS.do",SaveStr + "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(aryPrefix));
							var arrXml = sXml.split("|$$|");
							if(arrXml.length>0) sheetObj.LoadSearchXml(arrXml[0]);
						
							break;
						case IBINSERT:      // 입력
							sheetObj.DataInsert(-1);
							
							
							break;
					
        			}
    		}
  


    /**
     * 화면 폼입력값에 대한 유효성검증 프로세스 처리
     */
    function validateForm(sheetObj,formObj,sAction){
        with(formObj){
        	        }
       return true;
         }
    
 // 조회 함수를 이용하여 조회가 완료되고 발생하는 Event
//    function sheet1_OnSearchEnd(sheetObj, ErrMsg){
//    	var count = sheetObj.RowCount ;
//    	for ( var row = 0; row <= count; row++) {
//    		if(sheetObj.CellValue(row, "fol_flg") == "N"){
//    			sheetObj.RowHidden(row) = true;
//    		}
//		}
//    }
   

