/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : COM_SAMPLE_RD_WITH_FILE.js
*@FileTitle : COM_SAMPLE_RD_WITH_FILE
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.19
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.08.19 김정훈
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
     * @author 한진해운
     */

    /**
     * @extends 
     * @class COM_SAMPLE_RD_WITH_FILE : COM_SAMPLE_RD_WITH_FILE 생성을 위한 화면에서 사용하는 업무 스크립트를 정의한다.
     */
    function COM_SAMPLE_RD_WITH_FILE() {
    	this.processButtonClick		= tprocessButtonClick;
    	this.setSheetObject 		= setSheetObject;
    	this.loadPage 				= loadPage;
    	this.initSheet 				= initSheet;
    	this.initControl            = initControl;
    	this.doActionIBSheet 		= doActionIBSheet;
    	this.setTabObject 			= setTabObject;
    	this.validateForm 			= validateForm;
    }
    
   	/* 개발자 작업	*/
    function loadPage(){
    	document.form.f_cmd.value = COMMAND01;
    }

	/* 개발자 작업  끝 */