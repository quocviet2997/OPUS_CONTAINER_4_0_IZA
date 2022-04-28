/*
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : BCM_CCD_0056.js
*@FileTitle  : B/L Rider
*@author     : CLT
*@version    : 1.0
*@since      : 2014/06/24
=========================================================
*/
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
/**
 * @extends 
 * @class BCM_CCD_0056 : BCM_CCD_0056 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
 */

	/* 개발자 작업	*/
	// 공통전역변수
	var sheetObjects=new Array();
	var uploadObjects=new Array();
	var uploadCnt=0;
	var sheetCnt=0;
	var iframeW=190;
	var iframeH=100;
	var prefix="sheet1_";
	var _debug=false;
	// 버튼클릭이벤트를 받아 처리하는 이벤트핸들러 정의 */
	document.onclick=processButtonClick;
	/**
	 * 시트 초기설정값, 헤더 정의
	 * param : sheetObj ==> 시트오브젝트, sheetNo ==> 시트오브젝트 태그의 아이디에 붙인 일련번호
	 * 시트가 다수일 경우 시트 수만큼 case를 추가하여 시트 초기화모듈을 구성한다
	 */
	function initSheet(sheetObj, sheetNo) {
		var cnt=0;
		switch (sheetNo) 	{
		case 1: //sheet1 init
		    with(sheetObj){
		    var HeadTitle="Sel.|File Name|File Size|||||";
			      var headCount=ComCountHeadTitle(HeadTitle);
			      SetConfig( { SearchMode:2, MergeSheet:5, Page:20, DataRowMerge:1 } );
			      var info    = { Sort:1, ColMove:1, HeaderCheck:0, ColResize:1 };
			      var headers = [ { Text:HeadTitle, Align:"Center"} ];
			      InitHeaders(headers, info);
			      var cols = [ {Type:"CheckBox",  Hidden:0, 	Width:40,   Align:"Center",  ColMerge:1,   SaveName:prefix+"del_chk",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:1,   InsertEdit:1 },
			             {Type:"PopupEdit", Hidden:0,  	Width:240,  Align:"Left",    ColMerge:0,   SaveName:prefix+"file_nm",       KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      	Hidden:0,  	Width:80,   Align:"Right",  ColMerge:0,   SaveName:prefix+"file_size",     KeyField:0,   CalcLogic:"",   Format:"",            PointCount:0,   UpdateEdit:0,   InsertEdit:0 },
			             {Type:"Text",      Hidden:1, 	Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"img_seq" }, 
			             {Type:"Text",      Hidden:1, 	Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"file_path" },
			             {Type:"Text",      Hidden:1, 	Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"file_sav_id" },
			             {Type:"Text",      Hidden:1, 	Width:0,    Align:"Center",  ColMerge:1,   SaveName:prefix+"serial_no" },
			             {Type:"Status",    Hidden:1, Width:20,    Align:"Center",  ColMerge:1,   SaveName:"ibflag" }];
			      
			      InitColumns(cols);
			      SetEditable(1);
			      SetShowButtonImage(2);
			      SetFocusEditMode(0);
			      resizeSheet();
		      }
			break;
		}
	}
	
	function resizeSheet(){
   	         ComResizeSheet(sheetObjects[0],65);
   }
	// 버튼 네임으로 구분하여 프로세스를 분기처리하는 이벤트핸들러 */
	function processButtonClick() {
		/***** 탭당 시트가 2개 이상인 경우엔 추가 시트변수 지정하여 사용한 *****/
		var sheetObject1=sheetObjects[0];
		/*******************************************************/
		var formObject=document.form;
		try {
			var srcName=ComGetEvent("name");
			if(ComGetBtnDisable(srcName)) return false;
			switch (srcName) {
			case "btn_delete":
				//serialNo로 delete row 선택
				if(upload1.GetList().length!=0){
					var del_chked_arr =sheetObject1.FindCheckedRow(prefix+"del_chk").split("|");
					if(del_chked_arr.length>0){
						for(var i =0; i<del_chked_arr.length;i++){
							// only for newly added but not saved file
							if(sheetObject1.GetCellValue(del_chked_arr[i],prefix+"serial_no")!= null
									&& sheetObject1.GetCellValue(del_chked_arr[i],prefix+"serial_no")!= ""){ 
								upload1.RemoveOneFile(sheetObject1.GetCellValue(del_chked_arr[i],prefix+"serial_no"));
							}
						}
					}
				}
				doActionIBSheet(sheetObject1, formObject, IBDELETE);
				break;
			case "btn_save":
				doActionIBSheet(sheetObject1, formObject, IBSAVE);
				break;
			case "btn_close":
				var rtnObject=new Object(); 
				var Row=sheetObj.GetSelectRow();
				if(Row < 1){
					rtnObject.certi_flg= "N"			
				}else{
					rtnObject.certi_flg= "Y"			
				}
				ComPopUpReturnValue(rtnObject);
//				ComClosePopup(); 
				break;
			} // end switch
		} catch (ex) {
			if (ex == "[object Error]") {
				bkg_error_alert('processButtonClick', ex);
				ComShowMessage(OBJECT_ERROR);
			} else {
				alert(ex);
			}
		}
	}
	/**
	 * Sheet 기본 설정 및 초기화
	 * body 태그의 onLoad 이벤트핸들러 구현
	 * 화면을 브라우저에서 로딩한 후에 선처리해야 하는 기능을 추가한다
	 */
	function loadPage() {
		var formObj=document.form;
		for (i=0; i < sheetObjects.length; i++) {
			//khlee-시작 환경 설정 함수 이름 변경
			ComConfigSheet(sheetObjects[i]);
			initSheet(sheetObjects[i], i + 1);
			//khlee-마지막 환경 설정 함수 추가
			ComEndConfigSheet(sheetObjects[i]);
		}
		initUpload();
		// 최초 조회시작 
		doActionIBSheet(sheetObjects[0], document.form, IBSEARCH);
	}
	
	function initUpload(){
    	upload1.Initialize({
			SaveUrl:"/opuscntr/BCM_CCD_0056GS.do",
			ShowButtonArea: true,
			ShowInfoArea: false,
			ExtraForm:'upLoadForm',
			AddSaveButton: function(ibup){
				
			},
			AfterSaveStatus : function(result) {
				var code = result.code;
				
				if(document.upLoadForm){
					document.body.removeChild(document.upLoadForm);
				}
				
	      		if( code == 0) {
	      			var sXml = (new XMLSerializer()).serializeToString(result.xmlData);
	      			sXml = convert2ibsheet7(sXml);
	      			if (sXml.length > 0){
	      				document.form.file_sav_id.value = ComGetEtcData(sXml, "file_sav_id");
	      				ComShowMessage(ComGetMsg("BKG06071"));
	      				sheet1.LoadSaveData(sXml);
	      			}
	 				var files = result.files;
	                for( var i = 0; i < files.length; i++) {
//	                    files[i].DeleteFromList();
	                	ComUploadRemoveFile(upload1, "", true);
	                }
	      		}else {
					ComShowMessage(result.msg);
				}
			},			
			BeforeSaveStatus : function(result) {
			   return true;
			},
			AfterAddFile : function(result) {
				//if (typeof file_nm == "undefined" || file_nm == "File Name" || (file_nm != "" && _insert)) {
				//	sheetObj.DataInsert(-1, 0);//File Add인 경우 New Row 생성
				//}
				doActionIBSheet(sheetObjects[0], document.form, IBINSERT);  
				
                var files = result.files;
                var fileName=files[files.length-1].GetFileName();
                var row = sheet1.GetSelectRow();
                var formObj = document.form;
				
                for( var i = 0; i < files.length; i++) {
                	if(sheet1.GetCellValue(sheet1.GetSelectRow(), prefix+"file_nm") == files[i].GetFileName()){
                		files[i].DeleteFromList();
                	}
                }
                var files = upload1.GetList();
                var fileName=files[files.length-1].GetFileName();
                var serialNo = files[files.length-1].GetSerialNo();
                var row = sheet1.GetSelectRow();
				
                for( var i = 0; i < files.length; i++) {
                	console.log(sheet1.GetCellValue(sheet1.GetSelectRow(), prefix+"file_sav_id") + ">>" + files[i].GetSerialNo());
                	if(sheet1.GetCellValue(sheet1.GetSelectRow(), prefix+"file_sav_id") == files[i].GetSerialNo()){
                		upload1.RemoveOneFile(files[i].GetSerialNo());
                	}
                }
                
                sheet1.SetCellValue(row, prefix + "file_path",fileName,0);
                sheet1.SetCellValue(row, prefix+"serial_no",serialNo,0);
    			sheet1.SetCellValue(row, prefix + "file_nm",fileName,0);
    			sheet1.SetCellFontUnderline(row, prefix+"file_nm",1);
    			
			},
			BeforeAddFile : function(result){
//				if(sheet1.GetSelectRow() == -1) return false;
				return true;
			},
			AfterOnload : function() {
		          upload1.SetCustomAddButtonAsID('btn_upload');
			}
		});
    }
	
	function sheet1_OnMouseMove(){
	    	var row     = sheet1.MouseRow(),
	        col     = sheet1.MouseCol(),
	        info    = null;
	             
	        if (row > 0 &&col == 2) {
	        	prow = row;
	        	info = sheet1.GetCellElement(row, col, 1);
	        	upload1.SetFileUploadElement(info);
	        } 

	    }
	/**
	 * Sheet 조회완료 후 이벤트 발생
	 */
	function sheet1_OnSearchEnd(sheetObj, ErrMsg) {
		with (sheetObj) {
			SetColFontUnderline(prefix + "file_nm",1);
			SetDataLinkMouse(prefix + "file_nm",1);
			SetDataLinkMouse(prefix + "multiPopup",1);
		}
		
		if (sheetObj.RowCount()> 0) {
			document.form.btn_upload.disabled = true;
		}else{
			document.form.btn_upload.disabled = false;
		}
	}
	/**
	 * Sheet 저장완료 후 이벤트 발생
	 */
	function sheet1_OnSaveEnd(sheetObj, ErrMsg) {
		var rtnObject=new Object(); 
		if(document.form.cust_cd.value == ""){
			rtnObject.file_sav_id = document.form.file_sav_id.value;
			rtnObject.certi_flg= "Y";
		}else{
			doActionIBSheet(sheetObj, document.form, IBSEARCH); //파일링크를 위해 재조회
			var Row=sheetObj.GetSelectRow();
			if(Row < 1){
				rtnObject.certi_flg= "N"			
			}else{
				rtnObject.certi_flg= "Y"			
			}
		}
		ComPopUpReturnValue(rtnObject);
	}
	/**
	 * 파일 다운받기 <br>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {ibsheet} Row     	sheetObj의 선택된 Row
	 * @param {ibsheet} Col     	sheetObj의 선택된 Col
	 * @param {String} 	Value     	파일명
	 **/
	function sheet1_OnClick(sheetObj, Row, Col, Value) {
		
		if (Col != 1) return;
		if (sheetObj.ColSaveName(Col) == prefix + "file_nm") {
			//파일명이 없거나, 신규생성Row이거나, 파일을 새로 선택했을 경우 파일선택창을 띄운다.
			if (sheetObj.GetCellText(Row, prefix + "file_nm") == "" || sheetObj.GetRowStatus(Row) == "I") {
				selectFile(sheetObj, Row, Col, false);
				return;
			}
			// 파일이 존재시 다운로드 받는다.
			var key_id=sheetObj.GetCellValue(Row, prefix + "file_sav_id");
			var exist=fnSaveFileExist(key_id , sheetObj);
			// 서버에 파일존재유무확인 
			if(eval(exist)){
				hiddenFrame.location.href="/opuscntr/FileDownload?key=" + key_id;
			}else{
				ComShowMessage(ComGetMsg("BKG08127"));
			}
		}
	}
	 /**
	  * 파일존재유무판단  
	  * file_id 번호로 file_path_url 확인후 파일존재확인 함수 
	  * param :file_id
	  * return :boolean
	  */
	 function fnSaveFileExist(file_id,sheetObj) {
	 	var formObj=document.form;
	 	var param="&f_cmd=" + COMMAND08 + "&input_text=" + file_id;
	  	var sXml=sheetObj.GetSearchData("ESM_Booking_UtilGS.do", param);
	 	var output_text=ComGetEtcData(sXml, "output_text");
	 	return output_text;
	 }
	/**
	 * Sheet관련 프로세스 처리 <br>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {String} 	formObj   
	 * @param {String} 	sAction   
	 * @return {없음}
	 **/
	function doActionIBSheet(sheetObj, formObj, sAction) {
		sheetObj.ShowDebugMsg(false);
		var aryPrefix=new Array("sheet1_");
		switch (sAction) {
		case IBSEARCH: //조회
			if (!validateForm(sheetObj, formObj, sAction))
				return;
			//1.조회전 파라미터를 입력하거나 선택된 값으로 설정해준다.	
			ComSetObjValue(formObj.f_cmd, SEARCH);
			formObj.cust_cnt_cd.value = formObj.cust_cd.value.substr(0,2);
			formObj.cust_seq.value = formObj.cust_cd.value.substr(2,6);
			//2.조회조건으로 조회실행
			var sXml=sheetObj.GetSearchData("BCM_CCD_0056GS.do", FormQueryString(formObj) + "&" + ComGetPrefixParam('sheet1_'));
			//3.조회후 결과처리
			sheetObj.LoadSearchData(sXml,{Sync:1} );
			//4.값 존재시 처리 
			if (sheetObj.RowCount()> 0) {
				for ( var row=1; row <= sheetObj.LastRow(); row++) {
					//size 변경하기 
					var size=getSize(sheetObj.GetCellValue(row, prefix + "file_size"));
					sheetObj.SetCellValue(row, prefix + "file_size",size);
					sheetObj.SetRowStatus(row,'R');
				}
			}
			break;
		case IBSAVE: //저장
			if (!validateForm(sheetObj, formObj, sAction))
				return;
			//1.IBSheet 데이터 QueryString으로 묶기
			var sParam=ComGetSaveString(sheetObj);
			if (sParam == "")
				return;
			//0.IBUpload에 파일 추가하기
//			var upObj=uploadObjects[0];
//			upObj.Files=""; //-먼저기존파일을 모두 지운후 추가함
//			var paramFile1=setFileUpload(sheetObj, prefix);
			ComSetObjValue(formObj.f_cmd, MULTI);
			if (upload1.GetList().length == 0) {
				/*******파일이 없는 경우 IBSheet 이용하기********/
				//3.Form 데이터 QueryString으로 묶기
				sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix);
				//4. 서버에 request전달하고, reponse 받기
				var sXml=sheetObj.GetSaveData("BCM_CCD_0056GS.do", sParam);
				if (sXml.length > 0)
					sheetObj.LoadSaveData(sXml);
				
			} else {
				/*******파일이 있는 경우 IBUpload 이용하기********/
				sParam += "&" + FormQueryString(formObj)+"&" + ComGetPrefixParam(prefix);
		        paramToForm(sParam);
		        upload1.SaveStatus();
		        
//				upload1.RemoveFile();
		       

			}
			break;
		case COMMAND01: // 입력
			var sParam=ComGetSaveString(sheetObj);
			//0.IBUpload에 파일 추가하기
			var upObj=uploadObjects[0];
//			upObj.Files=""; //-먼저기존파일을 모두 지운후 추가함
//			var paramFile1=setFileUpload(sheetObj, prefix);
			ComSetObjValue(formObj.f_cmd, MULTI);
			if (upload1.GetList().length == 0) {
				/*******파일이 없는 경우 IBSheet 이용하기********/
				//3.Form 데이터 QueryString으로 묶기
				sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix);
				//4. 서버에 request전달하고, reponse 받기
				var sXml=sheetObj.GetSaveData("BCM_CCD_0056GS.do", sParam);
				if (sXml.length > 0)
					sheetObj.LoadSaveData(sXml);
			} else {
				/*******파일이 있는 경우 IBUpload 이용하기********/
				//3.Form 데이터 QueryString으로 묶기
				sParam += "&" + FormQueryString(formObj) + "&" + ComGetPrefixParam(prefix);
				paramToForm(sParam);
 				upload1.SaveStatus();
			}
			break;
		case IBINSERT: // 입력
//			hiddenSelectForm();
			selectFile(sheetObj, sheetObj.RowCount(), '', true);
			break;
		case IBDELETE: // 삭제
			if (sheetObj.FindCheckedRow(prefix + "del_chk") != "") {
				ComRowHideDelete(sheetObj, prefix + "del_chk");
//				SetCellValue(GetSelectRow(), prefix + "ibflag","D",0);
//				sheetObjects[0].SetCellValue(sheetObjects[0].GetSelectRow(),"sheet1_ibflag","U");
				doActionIBSheet(sheetObj, document.form, COMMAND01);
			} else {
				ComShowCodeMessage("BKG00249");//"No Selected Row";
			}
			break;
		}
	}
	/**
	 * 용량계산하기  <br>
	 * @param {String} 	_val 		파일용량
	 * @param {String} 	r_value    	MB/KB계산 
	 **/
	function getSize(_val) {
		var r_value=_val;
		var _value=Math.round(_val / 1024);
		if (_value > 0) {
			r_value=_value;
			_value=Math.round(_value / 1024);
			if (_value > 0) {
				_value=_value + " MB"
			} else {
				_value=r_value + " KB"
			}
		} else {
			_value=r_value + " Bytes"
		}
		return _value;
	}
	/**
	 * IBSheet에 업로드하고자 선택한 파일들을 IBUpload로 추가한다 <br>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {String} 	prefix    	변수 구분값
	 **/
	function setFileUpload(sheetObj, prefix) {
		var sRow=sheetObj.FindStatusRow("I");
		var upObj=uploadObjects[0];
		var arrRow=sRow.split(";");
		for (idx=0; idx < arrRow.length - 1; idx++) {
			var row=arrRow[idx];
			//파일 경로 가져오기
			var sFile=sheetObj.GetCellValue(row, prefix + "file_path");
			if (sFile == "")ComShowCodeMessage("BKG00220");
			//IBUpload에 파일 추가하기
			var ret=upObj.AddFile(sFile);
		}
		var param=prefix + "file_cnt=" + (arrRow.length - 1);
		return param;
	}
	/**
	 * 화면 폼입력값에 대한 유효성검증 프로세스 처리
	 * B인경우 검사하지 않는다. 
	 */
	function validateForm(sheetObj, formObj, sAction) {
		with (formObj) {
			// 저장시 유효성검사 
			if (sAction == IBSAVE) {
				var c_row=sheetObj.LastRow();
				if (c_row == 0) {
					ComShowCodeMessage("BKG00358");//Please select data to save.
					return;
				}
				for ( var row=1; row <= c_row; row++) {
					var v_file_nm=sheetObj.GetCellValue(row, prefix + "file_nm");
					if (v_file_nm == '') {
						ComShowMessage(row + "행의 [File Name]은 필수값입니다. ");
						selectFile(sheetObj, sheetObj.RowCount(), '', false);
						return false;
					}
				}
			} else if (sAction == IBSEARCH) {
			}
		}
		return true;
	}
	/**
	 * 파일 선택하기 <br>
	 * @param {ibsheet} sheetObj    IBSheet Object
	 * @param {ibsheet} addRowFlag  sheetObj에 Row추가 여부
	 **/
	function selectFile(sheetObj, Row, Col, _insert) {
		var formObj=document.form;
		if (Col == '' || Col == '2') {
			//파일명이 없거나, 신규생성Row이거나, 파일을 새로 선택했을 경우 파일선택창을 띄운다.
			var file_nm=sheetObj.GetCellText(sheetObj.GetSelectRow(), prefix + "file_nm");
			
			if(_insert){
				//if (typeof file_nm == "undefined" || file_nm == "File Name" || (file_nm != "" && _insert)) {
					Row=sheetObj.DataInsert(-1, 0);//File Add인 경우 New Row 생성
				//}
			}else{
				var filePath=sheetObj.OpenFileDialog('Please choose target file to upload.');
				if(filePath.indexOf("\\") !=-1) {
					with(sheetObj) {
						SetCellValue(GetSelectRow(), prefix + "file_path",fileName,0);
						fileName=fileName.substr(fileName.lastIndexOf("\\") + 1);
						SetCellValue(GetSelectRow(), prefix + "file_nm",fileName,0);
					}
				}
			}
		}
	}
	/**
	 * 페이지에 생성된 IBUpload Object를 uploadObjects 배열에 등록한다. <br>
	 * @param {ibupload} uploadObj    IBUpload Object
	 **/
	function setUploadObject(uploadObj) {
		uploadObjects[uploadCnt++]=uploadObj;
	}
	/**
	 * IBSheet Object를 배열로 등록
	 * 향후 다른 항목들을 일괄처리할 필요가 있을 때 배열로 담는 프로세스를 추가할 수 있다
	 * 배열은 소스 상단에 정의
	 */
	function setSheetObject(sheet_obj) {
		sheetObjects[sheetCnt++]=sheet_obj;
	}
	/**
	 * Debug alert 
	 */
	function bkg_error_alert(msg, ex) {
		alert('[ ' + msg + ' ]=[ ' + ex.name + ' ][ ' + ex.number + ' ][ ' + ex.description + ' ]');
	}
	 /**
	 * fnExceptionMessage 
	 */
	 function fnExceptionMessage(rXml){
		 var rMsg=ComGetEtcData(rXml,"Exception")
	 	var rmsg=rMsg.split("<||>");
	 	if(rmsg[3] != undefined && rmsg[3].length > 0) {
	 		ComShowMessage(rmsg[3]);
	 	}else{
	 		sheetObjects[0].LoadSaveData(rXml);
	 	}
	 }
	/* 개발자 작업  끝 */