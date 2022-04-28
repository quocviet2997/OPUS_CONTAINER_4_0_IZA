/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : div_Default.js
*@FileTitle  : Default div sample page
*@author     : CLT
*@version    : 1.0
*@since      : 2015/01/22
=========================================================*/

function loadPage() {
	initRdConfig();
}

function initRdConfig(){
	viewer.openFile(RDServerIP + "/sample/rd/mrdSample/sample.mrd","/rdata [123@abdcde]");
} 