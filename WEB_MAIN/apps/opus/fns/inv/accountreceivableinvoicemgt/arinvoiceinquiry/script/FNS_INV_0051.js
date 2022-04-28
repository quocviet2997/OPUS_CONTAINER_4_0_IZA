/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FNS_INV_0051.js
*@FileTitle : Customer Preferable Report -Item Select
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.12 박성용
* 1.0 Creation
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/

/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author 
     */
    
   	/* 개발자 작업	*/


	 // 공통전역변수
	
	 var sheetObjects = new Array();
	 var sheetCnt = 0;
//	 var arrChg ="";
	//IBMultiCombo
		var comboObjects = new Array();
		var combo1 = null;
		var comboCnt = 0;
		var prefix="";
		var prefix2="sheet2_";
	 
	 // 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	 document.onclick = processButtonClick;

	 /** 
	 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  없음  
	 * @return 없음
	 * @see #
	 * @author 한동훈
	 * @version 2009.10.19
	 */
     function processButtonClick(){
          /***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
 		         var sheetObject1 = sheetObjects[0];
          /*******************************************************/
          var formObject = document.form;

     	try {
     		var srcName = ComGetEvent("name");


            switch(srcName) {            
 							case "btn_select":
 								if(sheetObjects[1].RowCount() > 0){
 									
	 								if(!itemChk()) return; 
	 								    var chgFlg = fnc_chg();
	 								    //alert("fnc_chg:"+chgFlg);
	 								    callParent();
 								}
 							break;
 							
 							case "btn_new":
 								sheetObjects[0].RemoveAll();
 								sheetObjects[1].RemoveAll();
 								sheetObjects[2].RemoveAll();
 								
 								doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
 								rpt_tmplt_nm.SetSelectText("");
 					 			ComSetFocus(rpt_tmplt_nm);	 					 			
 								//ComResetAll();
 								 document.form.rpt_auth_id[0].checked = true;
 								 document.form.rpt_auth_id[1].checked = false;
 								 document.form.rpt_auth_id[2].checked = false;
 								 document.form.rpt_auth_id[3].checked = false;
 								 document.form.tmplt_auth_id.value  = "OFC";
 								 document.form.tmplt_ofc_cd.value = document.form.ofc_cd_s.value;
 				     					 			
 							break;
 							
 							case "btn_retrieve":
 								doActionIBSheet(sheetObjects[1],document.form,IBSEARCH);
 								
 							break;
 							
 							case "btn_save":
 								doActionIBSheet(sheetObjects[1],document.form,IBSAVE);
 								//ComBtnEnable("btn_select");
 							break;
 							
 							case "btn_delete":
 								doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC20);

 								sheetObjects[1].RemoveAll();
 								sheetObjects[2].RemoveAll();
 							break;
 							
 							case "btn_add":
 								fnc_add();
 	 						break;
 	 							
 							case "btn_del":
 								fnc_del();
 	 						break;	
 							
 							case "btns_up":
 		     					fnc_up(sheetObjects[1]);
 		     					break;
 		     					
 		     				case "btns_down":
 		     					fnc_down(sheetObjects[1]);
 		     					break;

 		     				case "btn_close": //달력버튼   	                
 		     					window.close();
 		     				
 		   				break; 	
 		     				
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
      * IBSheet Object를 sheetObjects 배열로 등록 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj IBSheet Object
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function setSheetObject(sheet_obj){

        sheetObjects[sheetCnt++] = sheet_obj;

     }

     /** 
   	 * 페이지에 생성된 IBCombo Object를 comboObjects 배열에 등록 <br>
   	 * <br><b>Example :</b>
   	 * <pre>
   	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
   	 * 배열은 소스 상단에 정의
   	 * </pre>
   	 * @param {IBMultiCombo} combo_obj    IBMultiCombo Object
   	 * @return 없음
   	 * @see #
   	 * @author 한동훈
   	 * @version 2009.10.19
   	 */
   	function setComboObject(combo_obj){
   		comboObjects[comboCnt++] = combo_obj;
   	}

     /** 
      * body 태그의 onLoad 이벤트핸들러 구현 <br>
      * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다. <br> 
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function loadPage() {

    	 sheet_charge = sheetObjects[2]; 
    	 //ComBtnDisable("btn_select");
         for(i=0;i<sheetObjects.length;i++){

         //khlee-시작 환경 설정 함수 이름 변경
             ComConfigSheet (sheetObjects[i] );

             initSheet(sheetObjects[i],i+1);
         //khlee-마지막 환경 설정 함수 추가
             ComEndConfigSheet(sheetObjects[i]);
         }
       //IBMultiCombo초기화
   		for(var k=0; k<comboObjects.length; k++){
   			initCombo(comboObjects[k],k+1);
   		}
 			
   		setInit();
     }

     /** 
    	 * OnLoadFinish 이벤트 발생시 호출되는 function <br>
    	 * <br><b>Example :</b>
    	 * <pre>
    	 * </pre>
         * @param {ibsheet} sheetObj 필수 IBSheet Object        
         * @return 없음
         * @see #
         * @author 한동훈
         * @version 2009.10.19
         */  	
    	function setInit(){
   
    		sheetObjects[0].SetWaitImageVisible(0); 
    		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02); 			
 			ComSetFocus(rpt_tmplt_nm);
 			
 			if(document.form.pop_yn.value == "Y"){
 				
 				var code = rpt_tmplt_nm.FindItem(document.form.tmpltNm.value, 0);
 				
 				//document.form.rpt_tmplt_nm.Enable = false;
 				rpt_tmplt_nm.SetSelectCode(document.form.tmpltNm.value);
 				document.form.select_tmplt.value = rpt_tmplt_nm.GetText(code,0); 
 				document.form.tmplt_ofc_cd.value = rpt_tmplt_nm.GetText(code,1); 
 				document.form.tmplt_auth_id.value  = rpt_tmplt_nm.GetText(code,2); 

 			}else {
    			 document.form.tmplt_ofc_cd.value = document.form.ofc_cd_s.value;
				 document.form.rpt_auth_id[0].checked = true;
				 document.form.rpt_auth_id[1].checked = false;
				 document.form.rpt_auth_id[2].checked = false;
				 document.form.rpt_auth_id[3].checked = false;
				 document.form.tmplt_auth_id.value  = "OFC";
 			}
 			sheetObjects[0].SetWaitImageVisible(1);
    	}
     
    	/** 
	 * 업무 자바스크립트 OnKeyPress 이벤트 처리 (키보드가 눌릴 때)<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param 없음
	 * @return 없음
	 * @see #
	 * @author 한동훈
      	 * @version 2009.10.19
	 */
	function obj_keypress(){
	    switch(event.srcElement.dataformat){
	        case "float":
	            //숫자+"."입력하기
	            ComKeyOnlyNumber(event.srcElement, ".");
	            break;
	        case "ymd":
	            //숫자+"-"입력하기
	        	ComKeyOnlyNumber(event.srcElement);
	            break;
	        case "eng":
	            //영문만 입력하기, 영문+숫자 -> ComKeyOnlyAlphabet('num');
	            ComKeyOnlyAlphabet();
	            break;
	        case "engdn":
	            //영문 소문자만 입력하기, 영문소+숫자 -> ComKeyOnlyAlphabet('lowernum');
	            ComKeyOnlyAlphabet('lower');
	            break;
	        case "engup":
	            //영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum');
	            ComKeyOnlyAlphabet('upper');
	            break;
	        case "num":
	        	//숫자만입력하기(정수,날짜,시간)
	            ComKeyOnlyNumber('num');
	            break;
	        case "uppernum":
	        	//영문대+숫자 
	        	ComKeyOnlyAlphabet('uppernum');
	            break;
	        default:
	            //영문 대문자만 입력하기, 영문대+숫자 -> ComKeyOnlyAlphabet('uppernum');
	            ComKeyOnlyAlphabet('upper');
	    }
	}
    	
     /** 
   	 * 콤보 초기설정값<br>
   	 * <br><b>Example :</b>
   	 * <pre>
   	 * 
   	 * </pre>
   	 * @param {IBMultiCombo} comboObj  comboObj
   	 * @return 없음
   	 * @see #
   	 * @author 박정진
   	 * @version 2009.10.19
   	 */
     	function initCombo(comboObj, comboNo) {
   		switch (comboObj.id) {
   			case "rpt_tmplt_nm":
   				with (comboObj) {
   					//ValidChar(2,1);
   					SetMaxLength(30);
   				}
   				break;   			
   			}
     	}
     
     /** 
      * Sheet 기본 설정 및 초기화 <br>
      * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다. <br>
      * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다. <br> 
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param {IBSheet} sheetObj : 시트오브젝트
      * @param {int} sheetNo : 시트오브젝트 태그의 아이디에 붙인 일련번호  
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function initSheet(sheetObj,sheetNo) {

         var cnt = 0;

         switch(sheetNo) {
              case 1:      //sheet1 init
                 with (sheetObj) {

            	  	var HeadTitle1="|Sel.|Seq.|Item Group|Header|dp_seq|rpt_itm_id|mst_itm_id|n2nd_mst_itm_id|used_item";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
					var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);
					
					var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"Status" },
					             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:"SelChk" },
					             {Type:"Seq",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:"SEQ",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:180,   Align:"Left",  ColMerge:0,   SaveName:"itm_grp_nm",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
					             {Type:"Text",      Hidden:0,  Width:200,  Align:"Left",  ColMerge:0,   SaveName:"rpt_itm_nm",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"dp_seq",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"rpt_itm_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"mst_itm_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"n2nd_mst_itm_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"used_item",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1 } ];
					             
					InitColumns(cols);
					//SetCountPosition(0);
					SetEditable(1);
					//SetSheetHeight(170);
					resizeSheet();

                }
                 break;
                 
              case 2:      //sheet1 init
                  with (sheetObj) {

            	  	var HeadTitle1="|Sel.|Seq.|Header|Change Header|rpt_tmplt_nm|rpt_itm_id|rpt_auth_id|mst_itm_id|ofc";
					var headCount=ComCountHeadTitle(HeadTitle1);
					SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
					var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
					var headers = [ { Text:HeadTitle1, Align:"Center"} ];
					InitHeaders(headers, info);
					
					var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix + "ibflag" },
					             {Type:"CheckBox",  Hidden:0, Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix + "SelChk" },
					             {Type:"Text",      Hidden:0,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix + "itm_seq",               KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:240,   Align:"Left",  ColMerge:0,   SaveName:prefix + "rpt_itm_nm",              KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
					             {Type:"Text",      Hidden:0,  Width:190,  Align:"Left",  ColMerge:0,   SaveName:prefix + "usr_def_nm",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix + "rpt_tmplt_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix + "rpt_itm_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix + "rpt_auth_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:150,   Align:"Center",  ColMerge:0,   SaveName:prefix + "mst_itm_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
					             {Type:"Text",      Hidden:1,  Width:50,   Align:"Center",  ColMerge:0,   SaveName:prefix + "ar_ofc_cd",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 } ];
					             
					InitColumns(cols);
					//SetCountPosition(0);
					SetEditable(1);
					//SetSheetHeight(170);
					resizeSheet();

                 }
                  break;
      		case 3:      //Charge init
    		with (sheetObj) {            	
    	
      			var HeadTitle1=" |dp_seq|CHG_CD|CPRT_CHG_GRP_FLG|Ofc|Tmplate|rpt_itm_id|CPRT_TP_CTNT|CPRT_VAL_CTNT|creid|credt";
				var headCount=ComCountHeadTitle(HeadTitle1);
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
				var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
				var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				InitHeaders(headers, info);
				
				var prefix2="";
				var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"ibflag" },
				             {Type:"Text",  	Hidden:0, Width:40,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"dp_seq",               KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"chg_cd",               KeyField:1,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:1, EditLen:3 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:1,   SaveName:prefix2+"cprt_chg_grp_flg",      KeyField:1,   CalcLogic:"",   Format:"" },
				             {Type:"Text",      Hidden:0,  Width:80,  Align:"Center",  ColMerge:0,   SaveName:prefix2+"ar_ofc_cd",              KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"rpt_tmplt_nm",          KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"rpt_itm_id",      KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"cprt_tp_ctnt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"cprt_val_ctnt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"cre_usr_id",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
				             {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:prefix2+"cre_dt",         KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 } ];
				             
				InitColumns(cols);
				SetCountPosition(0);
				SetEditable(1);
				SetSheetHeight(100);
                
    		}
    		break;

            case 4:      //sheet3 init
            with (sheetObj) {
            	
            	var HeadTitle1="rpt_tmplt_nm|ar_ofc_cd|rpt_auth_id";
				var headCount=ComCountHeadTitle(HeadTitle1);
				SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );
				var info    = { Sort:1, ColMove:1, HeaderCheck:1, ColResize:1 };
				var headers = [ { Text:HeadTitle1, Align:"Center"} ];
				InitHeaders(headers, info);
				
            	var cols = [ {Type:"Text",  	Hidden:0, Width:180,   Align:"Center",  ColMerge:0,   SaveName:"rpt_tmplt_nm" },
				             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"ar_ofc_cd" },
				             {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"rpt_auth_id" } ];
				             
            	InitColumns(cols);
				SetCountPosition(0);
				SetEditable(1);
				SetSheetHeight(100);             
				             
           }
            break;

         }
     }

     /** 
      * 조회 저장등 서버 기능을 호출하는 doActionIBSheet <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : 시트오브젝트  
      * @param  {object} formObj : 폼 오브젝트
      * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function doActionIBSheet(sheetObj,formObj,sAction) {
         sheetObj.ShowDebugMsg = false;
         switch(sAction) {
         	case IBSEARCH_ASYNC01:      //조회
				//sheetObjects[1].RemoveAll();
				formObj.f_cmd.value = SEARCH01;	
				var sXml = sheetObj.GetSearchData("FNS_INV_0051GS.do", FormQueryString(formObj)+"&rpt_tmplt_nm2="+rpt_tmplt_nm.GetSelectText());
				
				var arrXml = sXml.split("|$$|");
				var tmpleName = ComGetEtcData(arrXml[0],"tmpleName");
				if(tmpleName != "" && tmpleName != "null"){          											
					ComShowCodeMessage("INV00044");
					ComSetFocus(rpt_tmplt_nm);
					return false;
				}	
			break;
         	case IBSEARCH_ASYNC02:      //조회	
         		//sheetObjects[0].RemoveAll();
				//sheetObjects[1].RemoveAll();
				formObj.f_cmd.value = SEARCH02;					
				var sXml = sheetObj.GetSearchData("FNS_INV_0051GS.do", FormQueryString(formObj));
				
				var arrXml = sXml.split("|$$|");
				sheetObjects[0].LoadSearchData(arrXml[0], {Sync:1});
				if (1<arrXml.length) {
    				//ComInvXml2ComboItem(arrXml[1], comboObjects[0], "rpt_tmplt_nm", "ar_ofc_cd", "rpt_auth_id");
    				ComInvXml2ComboItem(arrXml[1], comboObjects[0], "rpt_tmplt_nm", "ar_ofc_cd", "rpt_auth_id");

//					var tmplt = ComGetEtcData(arrXml[0],"tmplt");
//					var arrStr = tmplt.split("|");
//					MakeComboObject2(formObj.rpt_tmplt_nm, tmplt);
//    				alert("template_name_tmp"+formObj.template_name_tmp.value);
//    				alert("template_name"+formObj.rpt_tmplt_nm.text);
					var template_name_tmp = formObj.template_name_tmp.value;
					if(template_name_tmp != ""){
						rpt_tmplt_nm.SetSelectText(template_name_tmp);
					}
				}
               if (sheetObjects[1].RowCount()> 0){
            	   formObj.retrieve_yn.value = "Y";
               }
			break;
			case IBSEARCH:      //조회
				if(validateForm(sheetObj,formObj,sAction) == false) return false; 
				sheetObjects[1].RemoveAll();
				sheetObjects[2].RemoveAll();
				formObj.f_cmd.value = SEARCH;
			
//				var sXml = sheetObj.GetSearchXml("FNS_INV_0051GS.do", FormQueryString(formObj)+ "&" + ComGetPrefixParam("sheet1_"));
				var sXml = sheetObj.GetSearchData("FNS_INV_0051GS.do", FormQueryString(formObj));	
   				
				var arrXml = sXml.split("|$$|");

//				arrChg = arrXml[1];
				sheetObjects[1].LoadSearchData(arrXml[0], {Sync:1});
				sheetObjects[2].LoadSearchData(arrXml[1], {Sync:1});
				
				//조회시 선택된 항목에 대해 used_item = Y 로 세팅
				for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
					sheetObjects[0].SetCellValue(j,"used_item","N");
				}
				for (var i=1; i<=sheetObjects[1].RowCount(); i++) {

					var r_rpt_itm_nm = sheetObjects[1].GetCellValue(i,"rpt_itm_nm");
					for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
						var l_rpt_itm_nm = sheetObjects[0].GetCellValue(j,"rpt_itm_nm");
						if(r_rpt_itm_nm == l_rpt_itm_nm){
							sheetObjects[0].SetCellValue(j,"used_item","Y");
							continue;
						}
					}
				}
				

				var display_option = sheetObjects[1].GetCellValue(1,"rpt_auth_id");
				if(display_option == "OFC"){
					formObj.rpt_auth_id[0].checked = true;
				}else if(display_option == "RHQ"){
					formObj.rpt_auth_id[1].checked = true;
				}else if(display_option == "ONLY"){
					formObj.rpt_auth_id[2].checked = true;
				}else if(display_option == "ALL"){
					formObj.rpt_auth_id[3].checked = true;
				}
				
				formObj.retrieve_yn.value = "Y";
			
			break;
			
			case IBSAVE:        //저장
				//TEMPLATE NAME 중복체크 시작
				//alert(formObj.rpt_tmplt_nm.Code);
				//if(formObj.rpt_tmplt_nm.Code == ""){
			
			//alert("formObj.retrieve_yn.value="+formObj.retrieve_yn.value);
			
			 //sheetObjects[1].cellValue(selRow,"rpt_tmplt_nm") = document.form.rpt_tmplt_nm.text;
			 for (var j=1; j<=sheetObjects[1].RowCount(); j++) {
   		         sheetObjects[1].SetCellValue(j,"rpt_tmplt_nm",rpt_tmplt_nm.GetSelectText(),0);
	         }
			 for (var j=1; j<=sheetObjects[2].RowCount(); j++) {
   		         sheetObjects[2].SetCellValue(j,"rpt_tmplt_nm",rpt_tmplt_nm.GetSelectText(),0);
	         }
			
			
				if(formObj.retrieve_yn.value != "Y"){
					formObj.f_cmd.value = SEARCH01;	
					//var tmplText = formObj.rpt_tmplt_nm.text.split("-");
					var sXml = sheetObj.GetSearchData("FNS_INV_0051GS.do", FormQueryString(formObj)+"&rpt_tmplt_nm2="+rpt_tmplt_nm.GetSelectText());
					
					var arrXml = sXml.split("|$$|");
					var tmpleName = ComGetEtcData(arrXml[0],"tmpleName");
					if(tmpleName != "" && tmpleName != "null"){          											
						ComShowCodeMessage("INV00044");
						ComSetFocus(rpt_tmplt_nm);
						return false;
					}	
				}	
			//TEMPLATE NAME 중복체크 끝
			//INV143  Charge break-down by S/C (RFA) 가 없을때는 Charge code 내용을 삭제함.
               var chgRow = sheetObj.FindText("rpt_itm_id", "INV143");  
               if (chgRow == -1 || sheetObjects[1].GetCellValue(chgRow,"ibflag") == "D"){   
            	   //initSheet(sheetObjects[2],3);
            	   sheetObjects[2].RemoveAll();
               }
				
				
				if(!validateForm(sheetObj,formObj,sAction)) return;				
				if(sheetObjects[1].RowCount() == 0){
					ComShowCodeMessage("INV00110");
					return false;
				}
				formObj.f_cmd.value = MULTI;
					
				var sParam = ComGetSaveString(sheetObjects);				
				if (sheetObj.IsDataModified && sParam == "") return; 
				formObj.template_name_tmp.value = rpt_tmplt_nm.GetSelectText();
 //               sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam("sheet1_");
				
                
        		var sParam = FormQueryString(formObj);					
    			var sParam1 = sheetObjects[1].GetSaveString(true); 				   
    			var sParam2 = sheetObjects[2].GetSaveString(true); 
    			
                
    			if (sParam1 == "") {				
    				return; 
    			} else {
    				sParam1 = ComSetPrifix(sParam1, "sheet1_");
    				sParam = sParam + "&" + sParam1;
    			}
    	
    			if (sParam2 == "") {	
    				//alert("sParam2 null!");
    				sParam = sParam + "&" + "";
    				//return; 
    			} else {
    				sParam2 = ComSetPrifix(sParam2, "sheet2_");
    				sParam = sParam + "&" + sParam2;
    			}	
                
                
				var SaveXml = sheetObj.GetSaveData("FNS_INV_0051GS.do", sParam );
				sheetObj.LoadSaveData(SaveXml);
				doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC02);
				doActionIBSheet(sheetObjects[1],document.form,IBSEARCH);

				
			break;
			
			case IBSEARCH_ASYNC20:        // DELETE 저장
				if(!validateForm(sheetObj,formObj,sAction)) return;
				formObj.f_cmd.value = MULTI01;

				var sParam = ComGetSaveString(sheetObjects);
				
                sParam += "&" + FormQueryString(formObj);
				
                var SaveXml = sheetObj.GetSaveData("FNS_INV_0051GS.do", sParam );
				sheetObj.LoadSaveData(SaveXml);
				if (SaveXml.indexOf(">OK<") > -1){
					doActionIBSheet(sheetObjects[0], document.form, IBSEARCH_ASYNC02);
		 			ComSetFocus(rpt_tmplt_nm);	
				}
			break;
			
			case IBINSERT:      // 입력
			break;

         }
     }
     
     /** 
      * Display Option 선택에 따라 template에 대한 권한을 세팅한다. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {object} obj : Display Option에 따른 폼 오브젝트
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function fncRptAuthId(obj){
    	 var rptAhthId = obj.value;
    //	 alert("RptAuthId==="+rptAhthId+"count : "+ sheetObjects[1].RowCount);
    	 document.form.tmplt_auth_id.value = rptAhthId;
    	     	 for (var j=1; j<=sheetObjects[1].RowCount(); j++) {
       		         sheetObjects[1].SetCellValue(j,"rpt_auth_id",rptAhthId,0);
    	         }
  	 
    	 //doActionIBSheet(sheetObjects[0],document.form,IBSEARCH_ASYNC02);
     }
     
     /** 
      * Template Name 변경시 해당 아이템을 조회한다. <br>
      * 기존 Template Name 선택시 Template 항목을 조회, 신규 Template Name 입력시 중복여부 체크
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param {IBMultiCombo} comboObj
      * @param {String} oldIndex
      * @param {String} oldText
      * @param {String} oldCode
      * @param {String} newIndex
      * @param {String} newText
      * @param {String} newCode
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function rpt_tmplt_nm_OnChange(comboObj, oldIndex, oldText, oldCode, newIndex, newText, newCode){
    	 
    	 sheetObjects[1].RemoveAll();
    	 sheetObjects[2].RemoveAll();
    	 
    	 if(newIndex == "" || newIndex == null || newIndex == -1){
    		//alert("Index_Code");
    		 if(newText != ""){
   
    			 //alert(comboObj+"||"+Index_Code+"||"+Text+"||"+Code); 
	    		 //var upperText = comboObj.Text.toUpperCase();
	    		 //var itemindex = comboObj.FindIndex ( upperText, 0);
    			 var ofc_cd_s = document.form.ofc_cd_s.value;
    			 var auth_id = document.form.tmplt_auth_id.value;

     			 document.form.select_tmplt.value = newText;
    			 document.form.tmplt_ofc_cd.value = ofc_cd_s;
     			 
	    		 //comboObj.InsertItem(0,Text,Text);
     			 if (auth_id !=""){
     				comboObj.InsertItem(3, newText+"|"+ofc_cd_s+"|"+auth_id, newText);
     			 }else{
    			 comboObj.InsertItem(3, newText+"|"+ofc_cd_s+"|OFC", newText);
     			 }
     			 comboObj.SetSelectCode(newText);
  		
	    		 //comboObj.InsertItem(0,upperText,upperText);
	    		 //comboObj.Text2 = upperText;
 	    		 //doActionIBSheet(sheetObjects[1],document.form,IBSEARCH_ASYNC01);
	    		 for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
	    			 sheetObjects[0].SetCellValue(j,"used_item","N");
	    		 }	    		 
	    		 //comboObj.Text2 = upperText;
    		 }	 
    	}else{
    		 // doActionIBSheet(sheetObjects[1],document.form,IBSEARCH);
    	
    	 document.form.retrieve_yn.value = "N";
    	 // sheetObjects[1].RemoveAll();
    	 // sheetObjects[2].RemoveAll();

    	 var code = rpt_tmplt_nm.FindItem(newCode, 0);
    	 
    	 document.form.select_tmplt.value = rpt_tmplt_nm.GetText(code,0);
		 document.form.tmplt_ofc_cd.value = rpt_tmplt_nm.GetText(code,1);
		 var select_auth = rpt_tmplt_nm.GetText(code,2);
		     document.form.tmplt_auth_id.value  = select_auth;

	 
		 if (select_auth=="OFC")
		    {
			 document.form.rpt_auth_id[0].checked = true;
			 document.form.rpt_auth_id[1].checked = false;
			 document.form.rpt_auth_id[2].checked = false;
			 document.form.rpt_auth_id[3].checked = false;
		 }else if (select_auth=="RHQ")
		 {
			 document.form.rpt_auth_id[0].checked = false;
			 document.form.rpt_auth_id[1].checked = true;
			 document.form.rpt_auth_id[2].checked = false;
			 document.form.rpt_auth_id[3].checked = false; 
		 }else if (select_auth=="ONLY")
		 {
			 document.form.rpt_auth_id[0].checked = false;
			 document.form.rpt_auth_id[1].checked = false;
			 document.form.rpt_auth_id[2].checked = true;
			 document.form.rpt_auth_id[3].checked = false; 
		 }else if (select_auth=="ALL")
		 {
			 document.form.rpt_auth_id[0].checked = false;
			 document.form.rpt_auth_id[1].checked = false;
			 document.form.rpt_auth_id[2].checked = false;
			 document.form.rpt_auth_id[3].checked = true; 
		 }
     }	 
 
   }
     /** 
      * [Add]버튼 클릭시 From -> To 항목으로 이동. <br>
      * 선택한 항목에 대해 중복여부 체크 및 값 세팅. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function fnc_add(){
    	 if (rpt_tmplt_nm.GetSelectText() == ""){
			ComShowCodeMessage('INV00004');
			ComSetFocus(rpt_tmplt_nm);
			return false;
		 }    	
    	 if (sheetObjects[0].CheckedRows("SelChk") == 0) {
			ComShowMessage(msgs["INV00025"]);
			return false;
		 }
    	
   //******  mst_itm_id, n2nd_mst_itm_id 체크  ***********************//
    	 for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
    		 if(sheetObjects[0].GetCellText(i,"SelChk") == "1"){
    			
	    		var mst_itm_id = sheetObjects[0].GetCellValue(i,"mst_itm_id");
	 			var n2nd_mst_itm_id = sheetObjects[0].GetCellValue(i,"n2nd_mst_itm_id");
	 			var mst_itm_id_chk = "N";
	 			var n2nd_mst_itm_id_chk = "N";

	 			if(mst_itm_id != "" || n2nd_mst_itm_id != ""){

	 				for (var j=1; j<=sheetObjects[1].RowCount(); j++) {
						var rpt_itm_id = sheetObjects[1].GetCellValue(j,"rpt_itm_id");
						if(mst_itm_id == rpt_itm_id){
							mst_itm_id_chk = "Y";
						}
						if(n2nd_mst_itm_id == rpt_itm_id){
							n2nd_mst_itm_id_chk = "Y";
						}
					}

	 				var mst_row = "";
	 				var n2nd_mst_row = "";
	 				for (var k=1; k<=sheetObjects[0].RowCount(); k++) {
	 					if(mst_itm_id == sheetObjects[0].GetCellValue(k,"rpt_itm_id")){
	 						mst_row = k;
	 					}
	 					if(n2nd_mst_itm_id == sheetObjects[0].GetCellValue(k,"rpt_itm_id")){
	 						n2nd_mst_row = k;
	 					}
	 				}
	 				//alert(mst_itm_id+"::"+n2nd_mst_itm_id);
	 				//alert(mst_row+"::"+n2nd_mst_row);
	 				if(mst_itm_id_chk == "N"){
	 					if(mst_row != ""){
	 						sheetObjects[0].SetCellText(mst_row,"SelChk","1");
	 					}
					}
	 				if(n2nd_mst_itm_id_chk == "N"){
	 					if(n2nd_mst_row != ""){
	 						sheetObjects[0].SetCellText(n2nd_mst_row,"SelChk","1");
	 					}
					}
	 			}
	 			
    		 }	
    	 }
/*    	     	
    	 // INV130, INV131, INV095, INV107, INV127, INV128, INV129  - INV096 와 같이 선택되어야함(<--일부 item변경. 2011.03.25)
         // INV131, INV107, INV127, INV128, INV129  - INV096(charge code) 와 같이 선택되어야함(2011.03.25)
    	 // INV132, INV133, INV134, INV135, INV136, INV137, INV138, INV139  - INV096 와 같이 선택 되면 안됨(<--item변경. 2011.03.25)
         // INV143 와 INV096 와 같이 선택 되면 안됨( 2011.03.25)
  
    	 var mstChgYn = "N";
    	 var notChgYn = "N";
    	 var INV096Yn = "N";
    	 var rownum = 0;
    	 var tot_curr = "N";  //INV102 TOT BL curr
    	 var cntr_curr = "N"; //INV106 INV107 CNTR curr
    	 var chg_curr = "N";  //INV128 INV129 INV131 Charge curr
       	 var tot_curr_r  = 0;  //INV103 TOT BL curr
    	 var cntr_curr_r = 0;  //INV126 INV107 CNTR curr
    	 var chg_curr_r  = 0;  //INV127 Charge curr
 
    	 var inv131num = 0;
    	 var inv107num = 0;
    	 var inv127num = 0;
    	 var inv128num = 0;
    	 var inv129num = 0;
    	 var inv143num = 0; 
    	 
    	 for (var i=1; i<=sheetObjects[0].RowCount(); i++) {
    		 var rpt_itm_id = sheetObjects[0].GetCellValue(i,"rpt_itm_id");
			 var used_item = sheetObjects[0].GetCellValue(i,"used_item");
    		 if(sheetObjects[0].GetCellText(i,"SelChk") == "1"){    			 
    			 if(rpt_itm_id == "INV096" ||rpt_itm_id == "INV131" ||rpt_itm_id == "INV107" ||rpt_itm_id == "INV127" ||rpt_itm_id == "INV128" ||rpt_itm_id == "INV129"){
    				 mstChgYn = "Y";
    			 }
         		 if(rpt_itm_id == "INV143"){
    				 notChgYn = "Y";
    				 tot_curr = "Y";
    			 }
         		 if(rpt_itm_id == "INV102"){
         			 tot_curr = "Y";
    			 }        		 
        		 if(rpt_itm_id == "INV106"||rpt_itm_id == "INV107"){
        			 cntr_curr = "Y";
     			 } 
         		 if(rpt_itm_id == "INV128"||rpt_itm_id == "INV129"||rpt_itm_id == "INV131"){
         		  	 chg_curr = "Y";
     			 } 
    		 }
			 if(rpt_itm_id == "INV096"){ 
				 if(used_item == "Y"){
					 INV096Yn = "Y";					 
				 }
				 rownum = i;
			 }
			 if(rpt_itm_id == "INV103") tot_curr_r = i;
			 if(rpt_itm_id == "INV126") cntr_curr_r = i;
			 if(rpt_itm_id == "INV127") chg_curr_r = i;
		
			
			 if(rpt_itm_id == "INV131") inv131num = i;
			 if(rpt_itm_id == "INV107") inv107num = i;
			 if(rpt_itm_id == "INV127") inv127num = i;
			 if(rpt_itm_id == "INV128") inv128num = i;
			 if(rpt_itm_id == "INV129") inv129num = i;
			 
			 if(rpt_itm_id == "INV143") inv143num = i;
    	 }
    	 
    	 if(mstChgYn == "Y" && INV096Yn != "Y"){
    		 sheetObjects[0].SetCellText(rownum,"SelChk","1");
    	 }
    	 if(notChgYn == "Y" && INV096Yn == "Y"){
      		// ComShowCodeMessage('INV00139');
    		 sheetObjects[0].SetCellText(rownum,"SelChk","0");
    	 } 
    	 
    	 if(tot_curr == "Y" ){
    		 sheetObjects[0].SetCellText(tot_curr_r,"SelChk","1");
    	 }
    	 if(cntr_curr == "Y" ){
    		 sheetObjects[0].SetCellText(cntr_curr_r,"SelChk","1");
    	 }
    	 if(chg_curr == "Y" ){
    		 sheetObjects[0].SetCellText(chg_curr_r,"SelChk","1");
    	 }

    	 //INV130~INV129 , INV132 ~INV139 을 같이 선택했을 경우, INV096Yn가 있으면 INV132 ~INV139을 삭제하고, INV096Yn가 없으면, INV130 ~INV129 삭제한다.
		 if(INV096Yn == "Y" || sheetObjects[0].GetCellText(rownum,"SelChk") == "1"){
			 sheetObjects[0].SetCellText(inv143num,"SelChk","0");
			 
			 var sheet1_item1_yn = "N";
			 var sheet1_item2_yn = "N";
			 for (var k=1; k<=sheetObjects[1].RowCount(); k++) {
    			 var sheet1_rpt_itm_id = sheetObjects[1].GetCellValue(k,"rpt_itm_id");
    			 var ib_flag = "R"
    			 ib_flag = sheetObjects[1].GetCellValue(k,"ibflag");
    			
  			    if(sheet1_rpt_itm_id == "INV143") sheetObjects[1].SetCellText(k,"SelChk","1");
  			   
    	   		if(sheet1_rpt_itm_id == "INV143" && ib_flag != "D"){
    				 sheet1_item1_yn = "Y";
    			 }
    			 if(sheet1_rpt_itm_id == "INV131" || sheet1_rpt_itm_id == "INV107" || sheet1_rpt_itm_id == "INV127" || sheet1_rpt_itm_id == "INV128" || sheet1_rpt_itm_id == "INV129"){
  			
    				if (ib_flag != "D" ){
    				 sheet1_item2_yn = "Y";
    				}
    			 }
    		 }
			 
			 //INV130~INV129 , INV132 ~INV139 을 같이 선택했을 경우 메지시를 보여준다.
			 if(mstChgYn == "Y" && notChgYn == "Y"){
				 ComShowCodeMessage('INV00127');
				 return;
			 }else if(mstChgYn == "Y" && sheet1_item1_yn == "Y"){
				  ComShowCodeMessage('INV00138');
				 return;
			 }else if(notChgYn == "Y" && sheet1_item2_yn == "Y"){
				  ComShowCodeMessage('INV00139');
				 return;
			 }
			 
			  // if (sheetObjects[1].CheckedRows("SelChk") != 0) {
			  //	 fnc_del();
			  // }
		 }else{
			

			 sheetObjects[0].SetCellText(inv131num,"SelChk","0");
			 sheetObjects[0].SetCellText(inv107num,"SelChk","0");
			 sheetObjects[0].SetCellText(inv127num,"SelChk","0");
			 sheetObjects[0].SetCellText(inv128num,"SelChk","0");
			 sheetObjects[0].SetCellText(inv129num,"SelChk","0");
			 var sheet1_item1_yn = "N";
			 var sheet1_item2_yn = "N";
			 for (var k=1; k<=sheetObjects[1].RowCount(); k++) {
    			 var sheet1_rpt_itm_id = sheetObjects[1].GetCellValue(k,"rpt_itm_id");
    			 var ib_flag = "R"
        			 ib_flag = sheetObjects[1].GetCellValue(k,"ibflag");
    			 if(sheet1_rpt_itm_id == "INV131") sheetObjects[1].SetCellText(k,"SelChk","1");
    			 if(sheet1_rpt_itm_id == "INV107") sheetObjects[1].SetCellText(k,"SelChk","1");
    			 if(sheet1_rpt_itm_id == "INV127") sheetObjects[1].SetCellText(k,"SelChk","1");
    			 if(sheet1_rpt_itm_id == "INV128") sheetObjects[1].SetCellText(k,"SelChk","1");
    			 if(sheet1_rpt_itm_id == "INV129") sheetObjects[1].SetCellText(k,"SelChk","1");
        		 if(sheet1_rpt_itm_id == "INV143"){
	                 sheet1_item1_yn = "Y";
    			 }
        		 if(sheet1_rpt_itm_id == "INV131" || sheet1_rpt_itm_id == "INV107" || sheet1_rpt_itm_id == "INV127" || sheet1_rpt_itm_id == "INV128" || sheet1_rpt_itm_id == "INV129"){
        			 if (ib_flag != "D" ){
    				     sheet1_item2_yn = "Y";
        			 }
    			 }
    		 }

			 //INV130~INV129 , INV132 ~INV139 을 같이 선택했을 경우 메지시를 보여준다.			 
			 if(mstChgYn == "Y" && notChgYn == "Y"){
				 ComShowCodeMessage('INV00127');
				 return;
			 }else if(mstChgYn == "Y" && sheet1_item1_yn == "Y"){
				 ComShowCodeMessage('INV00138');
				 return;
			 }else if(notChgYn == "Y" && sheet1_item2_yn == "Y"){
				 ComShowCodeMessage('INV00139');
				 return;
			 }
			 
			// if (sheetObjects[1].CheckedRows("SelChk") != 0) {
			//	 fnc_del();
			// }
		 }    		 
 */   	 
    	 //sheetObjects[0]에서 sheetObjects[1]로 복사
    	 var initNum = 1;  
    	 var chg_flg ="N" 
    	 for (var i=1; i<=sheetObjects[0].RowCount(); i++) {    		 
    		 if(sheetObjects[0].GetCellText(i,"SelChk") == "1"){
    			     		 
    			if(sheetObjects[0].GetCellValue(i,"used_item") == "Y"){

    				 for (var k=1; k<=sheetObjects[1].RowCount(); k++) {
    					 /*
    					 if(sheetObjects[1].CellValue(k,"ibflag") != "D"){
    						 sheetObjects[1].cellValue(k,"itm_seq") = initNum++;
    					 } */   					 
    		    	 }
    				 //return false;
    			 }else{
	    			/*
	    			var mst_itm_id = sheetObjects[0].cellValue(i,"mst_itm_id");
	    			var n2nd_mst_itm_id = sheetObjects[0].cellValue(i,"n2nd_mst_itm_id");
	    			//fncItmChk(mst_itm_id);
	
	    			var mst_itm_id_chk = "0";
	    			if(mst_itm_id != ""){
	    				for (var j=1; j<=sheetObjects[1].RowCount; j++) {
	    					var rpt_itm_id = sheetObjects[1].cellValue(j,"rpt_itm_id");
	    					if(mst_itm_id == rpt_itm_id){
	    						mst_itm_id_chk = "1";
	    					}
	    				}
	
	    				if(mst_itm_id_chk == "0"){
	    					alert("select [Container No] first");
	    					return false;
	    				}    				
	    			}    
	    			*/
	
	
	    			 var totRow = sheetObjects[1].RowCount();
		    		 var selRow = sheetObjects[1].GetSelectRow();
		    		
		    		 if(totRow == "0"){
		    			 selRow = selRow;
		    		 }else{
		    			 //selRow = selRow+1;
		    			 selRow = selRow;
		    		 }
		    		 selRow = sheetObjects[1].DataInsert();
		    	   	 sheetObjects[1].SetCellValue(selRow,"rpt_tmplt_nm",rpt_tmplt_nm.GetSelectText());
		    		 sheetObjects[1].SetCellValue(selRow,"rpt_itm_nm",sheetObjects[0].GetCellValue(i,"rpt_itm_nm"));
		    		 sheetObjects[1].SetCellValue(selRow,"usr_def_nm",sheetObjects[0].GetCellValue(i,"rpt_itm_nm"));
		    		 sheetObjects[1].SetCellValue(selRow,"rpt_itm_id",sheetObjects[0].GetCellValue(i,"rpt_itm_id"));
		    		 
		    		 var rpt_auth_id = "";
		    		 if(document.form.rpt_auth_id[0].checked==true) rpt_auth_id = document.form.rpt_auth_id[0].value;
		    		 if(document.form.rpt_auth_id[1].checked==true) rpt_auth_id = document.form.rpt_auth_id[1].value;
		    		 if(document.form.rpt_auth_id[2].checked==true) rpt_auth_id = document.form.rpt_auth_id[2].value;
		    		 if(document.form.rpt_auth_id[3].checked==true) rpt_auth_id = document.form.rpt_auth_id[3].value;
		    		 
		    		 sheetObjects[1].SetCellValue(selRow,"rpt_auth_id",rpt_auth_id);	    		 
		    		 sheetObjects[0].SetCellValue(i,"used_item","Y");
		    		 sheetObjects[0].SetCellText(i,"SelChk","0");
		    		 sheetObjects[1].SetCellValue(selRow,"mst_itm_id",sheetObjects[0].GetCellValue(i,"mst_itm_id"));
		    		 sheetObjects[1].SetCellValue(selRow,"ar_ofc_cd",document.form.tmplt_ofc_cd.value);	  
		    		 
		       		 if (sheetObjects[0].GetCellValue(i,"rpt_itm_id") =="INV143"){
		    			 chg_flg ="Y"
		    		 }
		    		 
    			 }
    		 }    		 
    	 }
    	 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    		 if(sheetObjects[1].GetCellValue(i,"ibflag") != "D"){
    			 sheetObjects[1].SetCellValue(i,"itm_seq",initNum++);
    		 }
    	 }
        // Charge break-down by S/C (RFA) Charge 입력창 Open 
         if (chg_flg =="Y"){
         	 //ComOpenPopup('/opuscntr/FNS_INV_0118.do?pagetype=E', 435, 380, '', '0,0', false, null, null, null, null, "CHARGE");
        	 ComOpenPopup('/opuscntr/FNS_INV_0118.do?pagetype=E', 440, 410, '', '0,1', true, false);
        }
     //   return chg_flg;

     }
     
     /** 
      * [Delete]버튼 클릭시 To 항목에서 삭제. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function fnc_del(){
    	 if (sheetObjects[1].CheckedRows("SelChk") == 0) {
 			ComShowMessage(msgs["INV00025"]);
 			return false;
 		 }
    	 
    	 /*
    	 // INV069,096 삭제가 체크되었는지 확인
    	 var inv069Yn = "N";
    	 var inv096Yn = "N";
    	 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    		 if(sheetObjects[1].GetCellText(i,"SelChk") == "1"){
    			 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
    			 if(selRowVal == "INV069"){
    				 inv069Yn = "Y";
    			 }
    			 if(selRowVal == "INV096"){
    				 inv096Yn = "Y";
    			 }
    		 }
    	 }
    	// INV069 삭제시 INVMST_ITM_ID, N2ND_MST_ITM_ID 체크
    	 if(inv069Yn == "Y"){
    		 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    			 if(sheetObjects[1].GetCellValue(i,"ibflag") != "D"){
    				 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
    				 var mst_itm_id = "";
    				 var n2nd_mst_itm_id = "";
    				 for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
    					 if(selRowVal == sheetObjects[0].GetCellValue(j,"rpt_itm_id")){
    						 mst_itm_id = sheetObjects[0].GetCellValue(j,"mst_itm_id");
    						 n2nd_mst_itm_id = sheetObjects[0].GetCellValue(j,"n2nd_mst_itm_id");
    						 if(mst_itm_id == "INV069" || n2nd_mst_itm_id == "INV069"){    							 
    							 ComShowCodeMessage("INV00128","[CNTR No]");

    							 return false;
    						 }    						 
    					 }
    				 }    				 
    			 }
    		 }
    	 }
    	// INV096 삭제시 INVMST_ITM_ID, N2ND_MST_ITM_ID 체크
    	 if(inv096Yn == "Y"){
    		 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    			 if(sheetObjects[1].GetCellValue(i,"ibflag") != "D"){
    				 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
    				 var mst_itm_id = "";
    				 var n2nd_mst_itm_id = "";
    				 for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
    					 if(selRowVal == sheetObjects[0].GetCellValue(j,"rpt_itm_id")){
    						 mst_itm_id = sheetObjects[0].GetCellValue(j,"mst_itm_id");
    						 n2nd_mst_itm_id = sheetObjects[0].GetCellValue(j,"n2nd_mst_itm_id");    						 
    						 if(mst_itm_id == "INV096" || n2nd_mst_itm_id == "INV096"){
    							 ComShowCodeMessage("INV00128","[CNTR Per Charge Type-Vertical Style]");
    							 return false;
    						 }
    					 }
    				 }    				 
    			 }
    		 }
    	 }
    	 
    	 // INV096 삭제시  INV130, INV131, INV095, INV107, INV127, INV128, INV129 삭제함
    	 if(inv096Yn == "Y"){
    		 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    			 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
    			 if(selRowVal == "INV130" || selRowVal == "INV131" || selRowVal == "INV095" || selRowVal == "INV107" || selRowVal == "INV127" || selRowVal == "INV129"){
    				 sheetObjects[1].SetCellText(i,"SelChk","1");
    			 }
    		 }
    	 }    	     	     	 
    	 */
    	 
    	 // DELETE 된 항목은 ITEM(FROM)의  used_item을 N으로 세팅함
    	 var k = 1;
    	 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {    		 
    		 if(sheetObjects[1].GetCellText(i,"SelChk") == "1"){
	    		 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_nm");
		    	 for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
		    		 //alert(selRowVal+"||"+sheetObjects[0].cellValue(j,"rpt_itm_nm"));
		    		 if(selRowVal == sheetObjects[0].GetCellValue(j,"rpt_itm_nm")){
		    			 sheetObjects[0].SetCellValue(j,"used_item","N");
		    		 }
		    	 }
		    	 //sheetObjects[1].RowDelete(i, false);		    	 
    		 }else{
    			 sheetObjects[1].SetCellValue(i,"itm_seq",k++);
    		 }
    	 }
    	 ComRowHideDelete(sheetObjects[1], "SelChk");
     }
     
     /** 
      * To 항목에서 [위로]버튼 클릭시 To 항목에서 위로 이동. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : 시트오브젝트  
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function fnc_up(sheetObj){    	 
    	 Row = sheetObj.GetSelectRow();
    	 Row2 = sheetObj.GetSelectRow();
    	 var returnValue = "";
    	 if (sheetObjects[1].RowCount() > 0){
    		 if (Row > 1){    			 
    			 var ibflag = "";
    			 for (var i=sheetObjects[1].RowCount(); i>=1; i--) {
    				 if(Row > i){
    					 ibflag = sheetObj.GetCellValue(i,"ibflag")
    					 if(ibflag != "D"){
    						 returnValue = "Y";
    					 }
    				 }    				 
    			 }
    			 if(returnValue != "Y"){
    				 return false;
    			 }
    			 
    			 for (var i=sheetObjects[1].RowCount(); i>=1; i--) {
    				 if(Row > i){
    					 ibflag = sheetObj.GetCellValue(i,"ibflag")
    					 if(ibflag != "D"){
    						 Row2 = i+1;
    						 break;
    					 }
    				 }    				 
    			 }
    			 
    			 tempUpIbFlag  		= sheetObj.GetCellValue(Row2-1,"ibflag");
    			 tempUpSelChk  		= sheetObj.GetCellValue(Row2-1,"SelChk");
    			 tempUpItmSeq   	= sheetObj.GetCellValue(Row2-1,"itm_seq");
    			 tempUpRptItmNm		= sheetObj.GetCellValue(Row2-1,"rpt_itm_nm");
    			 tempUpUsrDefNm		= sheetObj.GetCellValue(Row2-1,"usr_def_nm");
    			 tempUpRptItmId		= sheetObj.GetCellValue(Row2-1,"rpt_itm_id");
    			 tempUpMstItmId		= sheetObj.GetCellValue(Row2-1,"mst_itm_id");    			 

    			 tempNowIbFlag 		= sheetObj.GetCellValue(Row,"ibflag");
    			 tempNowSelChk 		= sheetObj.GetCellValue(Row,"SelChk");
    			 tempNowItmSeq  	= sheetObj.GetCellValue(Row,"itm_seq");
    			 tempNowRptItmNm	= sheetObj.GetCellValue(Row,"rpt_itm_nm");
    			 tempNowUsrDefNm	= sheetObj.GetCellValue(Row,"usr_def_nm");
    			 tempNowRptItmId	= sheetObj.GetCellValue(Row,"rpt_itm_id");
    			 tempNowMstItmId	= sheetObj.GetCellValue(Row,"mst_itm_id");
    			 
    			 sheetObj.SetCellValue(Row2-1,"ibflag",tempNowIbFlag);
    			 sheetObj.SetCellValue(Row2-1,"SelChk",tempNowSelChk);
    			 //sheetObj.CellValue(Row-1,"itm_seq") 	= tempNowItmSeq;
    			 sheetObj.SetCellValue(Row2-1,"rpt_itm_nm",tempNowRptItmNm);
    			 sheetObj.SetCellValue(Row2-1,"usr_def_nm",tempNowUsrDefNm);
    			 sheetObj.SetCellValue(Row2-1,"rpt_itm_id",tempNowRptItmId);
    			 sheetObj.SetCellValue(Row2-1,"mst_itm_id",tempNowMstItmId);
    			 
    			 sheetObj.SetCellValue(Row,"ibflag",tempUpIbFlag);
    			 sheetObj.SetCellValue(Row,"SelChk",tempUpSelChk);
    			 //sheetObj.CellValue(Row,"itm_seq") 		= tempUpItmSeq;
    			 sheetObj.SetCellValue(Row,"rpt_itm_nm",tempUpRptItmNm);
    			 sheetObj.SetCellValue(Row,"usr_def_nm",tempUpUsrDefNm);
    			 sheetObj.SetCellValue(Row,"rpt_itm_id",tempUpRptItmId);
    			 sheetObj.SetCellValue(Row,"mst_itm_id",tempUpMstItmId);
    			 
    			 sheetObj.SelectCell(Row2-1, "SelChk"); 
    		 }
    	 }
     }
     
     /** 
      * To 항목에서 [아래로]버튼 클릭시 To 항목에서 아래로 이동. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : 시트오브젝트  
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function fnc_down(sheetObj){
    	 Row = sheetObj.GetSelectRow();
    	 Row2 = sheetObj.GetSelectRow();
    	 var returnValue = "";
    	 if (sheetObjects[1].RowCount() > 0){
    		 if (Row < sheetObj.RowCount()){
    			 var ibflag = "";    	
    			 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    				 if(i > Row){    					 
    					 ibflag = sheetObj.GetCellValue(i,"ibflag");
    					 if(ibflag != "D"){
    						 returnValue = "Y";
    					 }
    				 }	 
    			 }
    			 if(returnValue != "Y"){
    				 return false;
    			 }
    			 
    			 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    				 if(i > Row){    					 
    					 ibflag = sheetObj.GetCellValue(i,"ibflag");
    					 if(ibflag != "D"){
    						 Row2 = i-1;
    						 returnValue = "Y";
    						 break;
    					 }
    				 }    				 
    			 }
    			 
    			 tempDwIbFlag  		= sheetObj.GetCellValue(Row2+1,"ibflag");
    			 tempDwSelChk  		= sheetObj.GetCellValue(Row2+1,"SelChk");
    			 tempDwItmSeq   	= sheetObj.GetCellValue(Row2+1,"itm_seq");
    			 tempDwRptItmNm		= sheetObj.GetCellValue(Row2+1,"rpt_itm_nm");
    			 tempDwUsrDefNm		= sheetObj.GetCellValue(Row2+1,"usr_def_nm");
    			 tempDwRptItmId		= sheetObj.GetCellValue(Row2+1,"rpt_itm_id");
    			 tempDwMstItmId		= sheetObj.GetCellValue(Row2+1,"mst_itm_id");
				          				   
    			 tempNowIbFlag 		= sheetObj.GetCellValue(Row,"ibflag");
    			 tempNowSelChk 		= sheetObj.GetCellValue(Row,"SelChk");
    			 tempNowItmSeq  	= sheetObj.GetCellValue(Row,"itm_seq");
    			 tempNowRptItmNm	= sheetObj.GetCellValue(Row,"rpt_itm_nm");
    			 tempNowUsrDefNm	= sheetObj.GetCellValue(Row,"usr_def_nm");
    			 tempNowRptItmId	= sheetObj.GetCellValue(Row,"rpt_itm_id");
    			 tempNowMstItmId	= sheetObj.GetCellValue(Row,"mst_itm_id");
    			 
    			 sheetObj.SetCellValue(Row2+1,"ibflag",tempNowIbFlag);
    			 sheetObj.SetCellValue(Row2+1,"SelChk",tempNowSelChk);
    			 //sheetObj.CellValue(Row+1,"itm_seq") 	= tempNowItmSeq;
    			 sheetObj.SetCellValue(Row2+1,"rpt_itm_nm",tempNowRptItmNm);
    			 sheetObj.SetCellValue(Row2+1,"usr_def_nm",tempNowUsrDefNm);
    			 sheetObj.SetCellValue(Row2+1,"rpt_itm_id",tempNowRptItmId);
    			 sheetObj.SetCellValue(Row2+1,"mst_itm_id",tempNowMstItmId);
    			 
    			 sheetObj.SetCellValue(Row,"ibflag",tempDwIbFlag);
    			 sheetObj.SetCellValue(Row,"SelChk",tempDwSelChk);
    			 //sheetObj.CellValue(Row,"itm_seq") 		= tempDwItmSeq;
    			 sheetObj.SetCellValue(Row,"rpt_itm_nm",tempDwRptItmNm);
    			 sheetObj.SetCellValue(Row,"usr_def_nm",tempDwUsrDefNm);
    			 sheetObj.SetCellValue(Row,"rpt_itm_id",tempDwRptItmId);
    			 sheetObj.SetCellValue(Row,"mst_itm_id",tempDwMstItmId);
    			 
    			 sheetObj.SelectCell(Row2+1, "SelChk");
    		 }
    	 }
     }
     
     /** 
      * 화면 폼입력값에 대한 유효성검증 프로세스 처리하는 validateForm <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {IBSheet} sheetObj : 시트오브젝트  
      * @param  {object} formObj : 폼 오브젝트
      * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
      * @return true, false
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function validateForm(sheetObj,formObj,sAction){
    	 switch (sAction) {
			case IBSEARCH: //조회
				if (rpt_tmplt_nm.GetSelectText() == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(rpt_tmplt_nm);
					return false;
				}
			break;
			case IBSEARCH_ASYNC20: //조회
				if (rpt_tmplt_nm.GetSelectText() == ""){
					ComShowCodeMessage('INV00004');
					ComSetFocus(rpt_tmplt_nm);
					return false;
				}
				if(!ComShowCodeConfirm("INV00028")) return;
			break;
			case IBSAVE: //저장
				if(!itemChk()) return;		
			break;
    	 }
    	 return true;
     }
     
     /** 
      * combo List에 데이타를 세팅하는 함수 <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {object} cmbObj : 폼 오브젝트
      * @param  {String} arrStr : | 구분자로 구분되는 스트링 문자
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */     
   /*  function MakeComboObject2(cmbObj, arrStr) {
 		cmbObj.RemoveAll();
 		var formObj = document.form;
     	var officeCntCd = formObj.rpt_tmplt_nm.value;

 		//콤보항목설정[ROW, COL, COMBO-TEXT, COMBO-CODE, DEFAULT-TEXT]
     	 		
     	sText = "\t\t "+replaceAll(arrStr,"▶","\t");

     	var comboVal = "";
     	var comboTxt = sText;
     	var arrStr2 = arrStr.split("|");
     	

     	for (var i = 0; i < arrStr2.length;i++ ) {
     		var tmplName = arrStr2[i].split("▶");
  		
     		if(tmplName[0] != ""){
     			comboVal = comboVal+"|"+tmplName[0]; 
     		}
     	}	
		cmbObj.SetColAlign("left|left|left");
		cmbObj.SetColWidth("100|70|70");

 		var arrTxt = comboTxt.split("|");
 		var arrVal = comboVal.split("|");

 		cmbObj.InsertItem(0,"","");
 		for (var i = 0; i < arrTxt.length;i++ ) {
 			
			var arrTxt2 = arrTxt[i].split("\t");
			cmbObj.InsertItem(i+1, arrTxt2[0]+"|"+arrTxt2[1]+"|"+arrTxt2[2], arrVal[i]);

 		}
 		//cmbObj.BackColor = "#CCFFFD";
		formObj.rpt_tmplt_nm.Code2 = document.form.tmpltNm.value;

 	}*/
     /*
     function MakeComboObject2_11(cmbObj, arrStr) {
   		cmbObj.RemoveAll();
  		for (var i = 0; i < arrStr.length;i++ ) {
  			//if(arrStr[i] != ""){
  			var tmplName = arrStr[i].split("-");
  			var tmplName = arrStr[i];
  			cmbObj.InsertItem(i, arrStr[i], tmplName.replace(' - ','\t'));
  			//}
  		}
     		cmbObj.DropHeight = 190;
      }
      */
     /** 
      * 문자에 대해 특정 문자열을 다른 문자열로 치환<br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  {String} strTemp : 치환 대상 문자
      * @param  {String} strValue1 : 대상문자에서 치환할 문자
      * @param  {String} strValue2 : 다른 문자열로 치환할 문자
      * @return {String} 중국어 금액
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function replaceAll(strTemp, strValue1, strValue2){
   	  while(1){
   	    if( strTemp.indexOf(strValue1) != -1 ){
   	       strTemp = strTemp.replace(strValue1, strValue2);
   	    }else{
   	       break;
   	    }   
   	  }
   	   return strTemp;   	 
   	}
     
     /** 
      * 저장 및 [select] 버튼 클릭시 To 항목에서 필수로 선택되어야 할 값을 체크함. <br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return 없음
      * @see #
      * @author 한동훈
      * @version 2009.10.19
      */
     function itemChk(){
    	 /*
    	 //INVMST_ITM_ID, N2ND_MST_ITM_ID 체크(INV069,INV096)
    	 var inv069Yn = "N";
    	 var inv096Yn = "N";
    	 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    		 if(sheetObjects[1].GetCellValue(i,"ibflag") != "D"){
    			 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
    			 if(selRowVal == "INV069"){
    				 inv069Yn = "Y";
    			 }
    			 if(selRowVal == "INV096"){
    				 inv096Yn = "Y";
    			 }
    		 }
    	 }
    	 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
			 if(sheetObjects[1].GetCellValue(i,"ibflag") != "D"){
				 var selRowVal = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
				 var mst_itm_id = "";
				 var n2nd_mst_itm_id = "";
				 for (var j=1; j<=sheetObjects[0].RowCount(); j++) {
					 if(selRowVal == sheetObjects[0].GetCellValue(j,"rpt_itm_id")){
						 mst_itm_id = sheetObjects[0].GetCellValue(j,"mst_itm_id");
						 n2nd_mst_itm_id = sheetObjects[0].GetCellValue(j,"n2nd_mst_itm_id");
						 if(mst_itm_id == "INV069" || n2nd_mst_itm_id == "INV069"){
							 if(inv069Yn == "N"){
								 ComShowCodeMessage("INV00128","[CNTR No]");
								 return false;
							 }
						 }
						 if(mst_itm_id == "INV096" || n2nd_mst_itm_id == "INV096"){
							 if(inv096Yn == "N"){
								 ComShowCodeMessage("INV00128","[CNTR Per Charge Type-Vertical Style]");
								 return false;
							 }	 
						 }
					 }
				 }    				 
			 }
		 }
		 */
    	 /*
    	 for (var i=1; i<=sheetObjects[1].RowCount; i++) {
    		 var mst_itm_id_yn = "N";
    		 var mst_itm_id = sheetObjects[1].CellValue(i,"mst_itm_id");
    		 if(mst_itm_id != ""){
    			 for (var j=1; j<=sheetObjects[1].RowCount; j++) {
    				 var rpt_itm_id = sheetObjects[1].CellValue(j,"rpt_itm_id");
    				 if(rpt_itm_id == mst_itm_id){
    					 mst_itm_id_yn = "Y";
    				 }
    			 }
    			 var rpt_itm_nm = "";
    			 var seq = "";
    			 for (var j=1; j<=sheetObjects[0].RowCount; j++) {
    				 var rpt_itm_id = sheetObjects[0].CellValue(j,"rpt_itm_id");
    				 if(rpt_itm_id == mst_itm_id){
    					 rpt_itm_nm = sheetObjects[0].CellValue(j,"rpt_itm_nm");
    					 seq = sheetObjects[0].CellValue(j,"SEQ");
    				 }
    			 }
    			 if(mst_itm_id_yn == "N"){
    				 ComShowCodeMessage("INV00128",seq+" > "+rpt_itm_nm);
    				 return false;
    			 }
    		 }
    	 }
    	 */
    	 /*
    	 // B/L No or BKG No중 하나는 선택(INV001, INV002)
    	 var item_value = "";
    	 var inv001Yn = "N";
    	 var inv002Yn = "N";
    	 for (var i=1; i<=sheetObjects[1].RowCount(); i++) {
    		 if(sheetObjects[1].GetCellValue(i,"ibflag") != "D"){
    			 item_value = sheetObjects[1].GetCellValue(i,"rpt_itm_id");
    			 if(item_value == "INV001"){
    				 inv001Yn = "Y";
    			 }
    			 if(item_value == "INV002"){
    				 inv002Yn = "Y";
    			 }
    		 }
    	 }    	 
    	 if(inv001Yn == "N" && inv002Yn == "N"){
    		 ComShowCodeMessage("INV00041","BKG NO OR B/L NO");
    		 return false;
    	 }
    	 */
		return true;
     }
//  	/**
//  	 * Owner 팝업창에서 등록된 Template별 Charge code를 Sheet에 설정한다.<br>
//  	 *
//  	 * @param {arry} aryPopupData
//  	 * @param {int} Row
//  	 * @param {int} Col
//  	 * @param {int} sheetIdx
//  	 * @return 없음
//  	 */     
//  	function setChgcd(aryPopupData, Row, Col, sheetIdx){
//	    sheetObjects[1].CellValue2(Row, "rpt_itm_id") = aryPopupData[0][3];
//	}
  	
    /**
     * Sheet1에서 팝업을 클릭시 입력된 CHG CD 팝업창을 띄운다.<br>
     * 
     * @param {object} sheetObj
     * @param {int} Row
     * @param {int} Col
     * @return 없음
     */
    function OnPopupClick(sheetObj, Row, Col) {
    	with(sheetObj) {
 			var sName = ColSaveName(Col);
 			var param = "";
 			var classId = "";
 			
// 			if(sName == "rpt_itm_id") {
// 				classId = "FNS_INV_0118";
// 				var rpt_tmplt_nm = document.form.tmpltNm.value;
// 				
// 				param = "?loc_eq_ofc=N&loc_cd=" + locCd + "&classId=COM_ENS_051";
// 				ComOpenPopup("COM_ENS_051.do"+param, 770, 400, "setLocCd", "1,0,1,1,1,1", false, false, Row, Col, 0, "com_ens_051");
// 			} else if(sName == "agn_nm") {
// 				var custCd = sheetObj.CellValue(Row, "rep_cust_cnt_cd");
// 				var custSeq = sheetObj.CellValue(Row, "rep_cust_seq");
// 				if(custCd.length != 2 && custSeq.length != 6) {
// 					return;
// 				} else {
//	    			classId = "FNS_INV_0013";
//	    			var custCntCd = CellValue(Row, "rep_cust_cnt_cd");
//	    			var custSeq = CellValue(Row, "rep_cust_seq");
//	    			var param = "?cust_cnt_cd=" + custCntCd + "&cust_seq=" + custSeq + "&pop_yn=Y&classId=" + classId;
//	    			ComOpenPopup("FNS_INV_0013.do"+param, 900, 575, "setCustCd", "1,0,1,1,1,1", false, false, Row, Col, 0, "fns_inv_0013");
// 				}
//    		}
 		}
 	}
     /**
 	 * Charge Break-down S/C(RFA) Info. 화면 오픈 <br>
 	 * <br><b>Example :</b>
 	 * <pre>
 	 *     openCharge();
 	 * </pre>
 	 * @param 없음
 	 * @return 없음
 	 * @author 김현화
 	 * @version 2011.03.07
 	 */      
 	function openCharge() {
 	  
 		//ComOpenPopup('/opuscntr/FNS_INV_0118.do?pagetype=E', 435, 380, '', '0,0', false, null, null, null, null, "CHARGE");
 		ComOpenPopup('/opuscntr/FNS_INV_0118.do?pagetype=E', 440, 410, '', '0,1', true, false);
 	
  	}
  	 	
     /** 
      *  Charge Break-down S/C(RFA)관련 Row 생성<br>
      * <br><b>Example :</b>
      * <pre>
      * </pre>
      * @param  없음
      * @return chgFlg
      * @see #
      * @author 김현화
      * @version 2011.03.15
      */
     function fnc_chg(){ 
    
   
    	 var noType = document.form.noType.value;
    	 var noVal = document.form.noVal.value;
    	 var chgFlg ="N";
    	 var chgExist = "N";
    	 
	 		 for(var i = 1; i < sheetObjects[1].RowCount()+1; i++) {
				if(sheetObjects[1].GetCellValue(i, "ibflag") != "D" && sheetObjects[1].GetCellValue(i, "rpt_itm_id") == "INV143") {
					chgFlg ="Y";
				 }
			 } 
         if (chgFlg =="Y"){
        	   if (noVal=="" || sheetObjects[2].RowCount()==0 ){
        		   ComShowCodeMessage("INV00155");
        		   chgFlg ="N"
        		   return "N"; 
        	   }
       
		       	for(var k = 1; k < sheetObjects[2].RowCount()+1; k++) {
		       	   var rnoType = sheetObjects[2].GetCellValue(k, "cprt_tp_ctnt");
		     	   var rnoVal = sheetObjects[2].GetCellValue(k, "cprt_val_ctnt");

			       	
			          if ( rnoType == noType && rnoVal == noVal){
				    		 var addRow = sheetObjects[1].DataInsert(-1);
				    		 sheetObjects[1].SetRowHidden(addRow,1);		    	
				    		 sheetObjects[1].SetCellValue(addRow,"rpt_tmplt_nm",rpt_tmplt_nm.GetSelectText());
				    		 sheetObjects[1].SetCellValue(addRow,"rpt_itm_nm","CHG00"+sheetObjects[2].GetCellValue(k,"dp_seq"));
				    		 sheetObjects[1].SetCellValue(addRow,"usr_def_nm",sheetObjects[2].GetCellValue(k,"chg_cd"));
				    		 sheetObjects[1].SetCellValue(addRow,"rpt_itm_id","CHG00"+sheetObjects[2].GetCellValue(k,"dp_seq"));
				    		 sheetObjects[1].SetCellValue(addRow,"rpt_auth_id",document.form.tmplt_auth_id.value);
				    		 
				    		 chgExist = "Y";
			           }
		         }
  		     
		       	//if (sheetObjects[2].RowCount()> 0 && noVal!="" && rnoVal == noVal){
		       	if(chgExist == "Y") {
		          	var addRow = sheetObjects[1].DataInsert(-1);
		    		 sheetObjects[1].SetRowHidden(addRow,1);		    	
		    		 sheetObjects[1].SetCellValue(addRow ,"rpt_tmplt_nm",rpt_tmplt_nm.GetSelectText());
		    		 sheetObjects[1].SetCellValue(addRow ,"rpt_itm_nm","CHG999");
		    		 sheetObjects[1].SetCellValue(addRow,"usr_def_nm","OTHER");
		    		 sheetObjects[1].SetCellValue(addRow,"rpt_itm_id","CHG999");
		    		 sheetObjects[1].SetCellValue(addRow,"rpt_auth_id",document.form.tmplt_auth_id.value);
		       	}	 
         }    	
 		return chgFlg; 
	 }
 		
     function resizeSheet(){
 		ComResizeSheet(sheetObjects[0]);
 		ComResizeSheet(sheetObjects[1]);
 	}
	/* 개발자 작업  끝 */