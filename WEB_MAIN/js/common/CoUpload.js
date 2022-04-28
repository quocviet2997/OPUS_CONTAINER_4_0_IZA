/**
===============================================================================
프로그램  명  : 파일업로드 처리 관련 공통 함수 정의 Script
프로그램개요  : 파일 업로드 전송 함수 정의
작   성   자  : 김정훈
작   성   일  : 2009-04
===============================================================================
수정자/수정일 : 
수정사유/내역 : 
===============================================================================
*/
	/**
     * @fileoverview fileupload 관련 함수가 정의되어 있다.
     * @author 한진해운
	 */
	function openUpload(subSysCd, flag){
		if(flag == undefined){
			return window.showModalDialog("/opuscntr/FileUploadPopup.do?subSysCd="+subSysCd,"uploadPopup","dialogWidth:533px;dialogHeight:350px;status:no");
		} else{
			return window.showModalDialog("/opuscntr/FileUploadPopup.do?subSysCd="+subSysCd+"&flag="+flag,"uploadPopup","dialogWidth:533px;dialogHeight:350px;status:no");
		}
	}
