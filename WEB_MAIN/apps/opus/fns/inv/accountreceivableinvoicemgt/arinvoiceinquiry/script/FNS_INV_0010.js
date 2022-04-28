/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0010.jsp
*@FileTitle  : Invoice Inquiry by B/L No (History Pop-up)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/15
=========================================================*/
/****************************************************************************************
  이벤트 구분 코드: [초기화]INIT=0; [입력]ADD=1; [조회]SEARCH=2; [리스트조회]SEARCHLIST=3;
					[수정]MODIFY=4; [삭제]REMOVE=5; [리스트삭제]REMOVELIST=6 [다중처리]MULTI=7
					기타 여분의 문자상수  COMMAND01=11; ~ COMMAND20=30;
 ***************************************************************************************/
/*------------------다음 코드는 JSDoc을 잘 만들기 위해서 추가된 코드임 ------------------*/
   /**
     * @fileoverview 업무에서 공통으로 사용하는 자바스크립트파일로 달력 관련 함수가 정의되어 있다.
     * @author Cyberlogitec
     */
    /**
     * @extends 
     * @class fns_inv_0010 : fns_inv_0010 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
   	/* 개발자 작업	*/
	//공통전역변수
	var tabObjects=new Array();
	var tabCnt=0 ;
	var beforetab=1;
	var sheetObjects=new Array();
	var sheetCnt=0;
	var opener;
	//버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	/** 
	 * 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * </pre>
	 * @param  없음  
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.06.08
	 */
	function processButtonClick(){
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject1=sheetObjects[0];
		var sheetObject2=sheetObjects[1];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			switch(srcName) {
				case "btn_sysclear":
					doActionIBSheet(sheetObject1,formObject,IBROWSEARCH);
				break; 
				case "btn_close":
					ComClosePopup(); 
				break; 
			} // end switch
		}
		catch(e) {
    		if( e == "[object Error]") {
    			ComShowMessage(OBJECT_ERROR);
    		} else {
    			ComShowMessage(e.message);
    		}
		}
     }
	/** 
	 * IBSheet Object를 sheetObjects 배열로 등록 <br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	 * 배열은 소스 상단에 정의
	 * </pre>
	 * @param  {IBSheet} sheetObj IBSheet Object
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.06.08
	 */
	function setSheetObject(sheet_obj){
		sheetObjects[sheetCnt++]=sheet_obj;
	}
    /** 
     * body 태그의 onLoad 이벤트핸들러 구현 <br>
     * <br><b>Example :</b>
	 * <pre>
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 * </pre>
	 * @param 없음
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.06.08
	 */
	function loadPage() {
		opener = window.dialogArguments;
		if (!opener) opener=window.opener; 
		if(!opener) opener = parent;
		for(i=0;i<sheetObjects.length;i++){
			//khlee-시작 환경 설정 함수 이름 변경
			ComConfigSheet (sheetObjects[i] );
			initSheet(sheetObjects[i],i+1);
			//khlee-마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
		}
		var sXml1=IBS_GetDataSearchXml(opener.t2sheet1);
		sheetObjects[0].LoadSearchData(sXml1,{Append:1 , Sync:1} );
		var sXml2=IBS_GetDataSearchXml(opener.t2sheet2);
		sheetObjects[1].LoadSearchData(sXml2,{Append:1 , Sync:1} );
	}
	/** 
	 * 시트 초기설정값, 헤더 정의<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
	 * </pre>
	 * @param sheetObj 시트오브젝트
	 * @param sheetNo 시트오브젝트 태그의 아이디에 붙인 일련번호
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.06.08
	 */
	function initSheet(sheetObj,sheetNo) {
		var cnt=0;
		var dpPrcsKnt=opener.document.form.dp_prcs_knt.value;
		var dpPrcsKntLocal=opener.document.form.dp_prcs_knt_local.value;
		
		switch(sheetNo) {
			case 1:      //sheet1 init
			    with(sheetObj){

		      var HeadTitle="Seq.|I/F No.|Loacal VVD|Act Cust|Type|I/F Date|Good Date|Invoice No.|Group Invoice No.|Cur|Amount|Ex. Rate|Local Amount|inv clr flg|arIfNo|invSplitCd";

		      SetConfig( { SearchMode:2, MergeSheet:0, Page:20, DataRowMerge:1 } );

		      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);

		      var cols = [ {Type:"Seq",       Hidden:0,  Width:35,   Align:"Center",  ColMerge:0,   SaveName:"Seq" },
			               {Type:"Text",      Hidden:0,  Width:90,  Align:"Center",  ColMerge:0,   SaveName:"ar_if_no_inv_split_cd",  KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",      Hidden:0,  Width:85,   Align:"Center",  ColMerge:0,   SaveName:"vvd",                    KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"cust_cd",                KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"rev_type",               KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"bl_inv_if_dt",           KeyField:0,   CalcLogic:"",   Format:"Ymd" },
			               {Type:"Date",      Hidden:0,  Width:80,   Align:"Center",  ColMerge:0,   SaveName:"bl_inv_cfm_dt",          KeyField:0,   CalcLogic:"",   Format:"Ymd" },
			               {Type:"Text",      Hidden:0,  Width:100,   Align:"Center",  ColMerge:0,   SaveName:"inv_no",                 KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",      Hidden:0,  Width:110,  Align:"Center",  ColMerge:0,   SaveName:"grp_inv_no",             KeyField:0,   CalcLogic:"",   Format:"" },
			               {Type:"Text",      Hidden:0,  Width:40,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",                KeyField:0,   CalcLogic:"",   Format:"" } ];
		            	if (dpPrcsKnt > 0) {
		            		cols.push({Type:"Float",     Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"chg_amt",                KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKnt });
		            	}
		            	else {
		            		cols.push({Type:"Int",       Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"chg_amt",                KeyField:0,   CalcLogic:"",   Format:"Integer" });
		            	}
		            	cols.push({Type:"Float",     Hidden:0,  Width:70,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",             KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 });
		            	if (dpPrcsKntLocal > 0) {
		            		cols.push({Type:"Float",     Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"local_total",            KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKntLocal });
		            	}
		            	else {
		            		cols.push({Type:"Int",       Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"local_total",            KeyField:0,   CalcLogic:"",   Format:"Integer" });
		            	}
		            	cols.push({Type:"Text",      Hidden:1, Width:80,   Align:"Center",  ColMerge:0,   SaveName:"inv_clr_flg",            KeyField:0,   CalcLogic:"",   Format:"" });
		            	cols.push({Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"ar_if_no",               KeyField:0,   CalcLogic:"",   Format:"" });
		            	cols.push({Type:"Text",      Hidden:1, Width:90,   Align:"Center",  ColMerge:0,   SaveName:"inv_split_cd",           KeyField:0,   CalcLogic:"",   Format:"" });
		 
		            	InitColumns(cols);
		            	SetEditable(0);
		            	SetSheetHeight(315);

		            }


			break;
			case 2:      //sheet2 init
			    with(sheetObj){
		        
		      var HeadTitle="|Curr|Amount|Ex.Rate|Local Total";
		      (ComCountHeadTitle(HeadTitle), 0, 0, true);

		      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:0 } );

		      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
		      var headers = [ { Text:HeadTitle, Align:"Center"} ];
		      InitHeaders(headers, info);

		      var cols = [ {Type:"Status",    Hidden:1, Width:30,   Align:"Center",  ColMerge:0,   SaveName:"ibflag" },
		             {Type:"Text",      Hidden:0,  Width:45,   Align:"Center",  ColMerge:0,   SaveName:"curr_cd",      KeyField:0,   CalcLogic:"",   Format:"" } ];
		            if (dpPrcsKnt > 0) {
		            	cols.push({Type:"Float",     Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKnt });
		            }
		            else {
		            	cols.push({Type:"Int",       Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"chg_amt",      KeyField:0,   CalcLogic:"",   Format:"Integer" });
		            }
		            cols.push({Type:"Float",     Hidden:0,  Width:80,   Align:"Right",   ColMerge:0,   SaveName:"inv_xch_rt",   KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:6 });
		            if (dpPrcsKntLocal > 0) {
		            	cols.push({Type:"Float",     Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"NullFloat",   PointCount:dpPrcsKntLocal });
		            }
		            else {
		            	cols.push({Type:"Int",       Hidden:0,  Width:85,   Align:"Right",   ColMerge:0,   SaveName:"local_total",  KeyField:0,   CalcLogic:"",   Format:"Integer" });
		            }
		 
		      InitColumns(cols);
		      SetEditable(0);
		      SetRowHidden(0, 1);
		      SetSheetHeight(100);
		      SetSheetWidth(320);
		            }


			break;
		}
	}
	/** 
	 * 조회 저장등 서버 기능을 호출하는 doActionIBSheet<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param  {IBSheet} sheetObj : 시트오브젝트  
	 * @param  {object} formObj : 폼 오브젝트
	 * @param  {sAction} sAction : form의 f_cmd에 설정하여 조회/저장등에 사용되는 상수값
	 * @param  {int} Row : sheet에서 현재 마우스로 선택되어 있는 Row
	 * @param  {int} Col : sheet에서 현재 마우스로 선택되어 있는 Col
	 * @param  {String}Val : sheet에서 현재 마우스로 선택되어 있는 Row,Col 의 value값
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.06.08
	 */
	function doActionIBSheet(sheetObj,formObj,sAction) {
		sheetObj.ShowDebugMsg(false);
		switch(sAction) {
			case IBROWSEARCH:   //SYS CLEAR
				for ( var i=1; i <= sheetObj.RowCount(); i++) {
					if (sheetObj.GetCellValue(i, 12) == "Y") {
						if(sheetObj.GetRowHidden(i)) {
							sheetObj.SetRowHidden(i,0);
						}
						else {
							sheetObj.SetRowHidden(i,1);
						}
					}
				}
			break;
		}
	}
	/**
	 * 셀을 클릭했을때 발생하는 이벤트<br>
	 * <br><b>Example :</b>
	 * <pre>
	 * 
	 * </pre>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {ibsheet} Row     	sheetObj의 선택된 Row
	 * @param {ibsheet} Col     	sheetObj의 선택된 Col
	 * @return 없음
	 * @see #
	 * @author 박정진
	 * @version 2009.06.08
	 **/
	function sheet1_OnDblClick(sheetObj, Row, Col) {
	   	var formObj=document.form;
	   	var arIfNo=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ar_if_no"), " ", "");
	   	var invSplitCd=ComReplaceStr(sheetObj.GetCellValue(sheetObj.GetSelectRow(), "ar_if_no"), " ", "");
		var arOfcCd=formObj.ar_ofc_cd.value;
		var classId="FNS_INV_0011";
   		var param='?pgmNo=FNS_INV_0011-01&ar_if_no='+arIfNo+'&ar_ofc_cd='+arOfcCd+'&classId='+classId+'&inv_split_cd='+invSplitCd;
		ComOpenWindow('/opuscntr/FNS_INV_0011.do' + param, 'FNS_INV_0022', 'width=1200,height=635');
	}
	
	/* 개발자 작업  끝 */
