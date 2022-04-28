<%
/*=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : FNS_INV_0034_pre.jsp
*@FileTitle  : 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/08/05
=========================================================*/
%>
<%

String viewFlag = request.getParameter("view_flag");
String title = "";
if (viewFlag.equals("I")) { 
	title = "Invoice Issue Preview";
} else if (viewFlag.equals("L")) {
	title = "Letter Wording Entry Preview";
} else if (viewFlag.equals("S")) {
	//0036 page pop
	title = "Invoice Issue Preview";	
}

%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" >
var rdObjects=new Array();
var rdCnt=0;


  document.onclick = processButtonClick;
  
function setupPage(){  
    initRdConfig(rdObjects[0]);
    window.setTimeout("invPreview(rdObjects[0])", 1000);	 
   // invPreview(rdObjects[0]);   
} 

function initRdConfig(rdObject){
    
		//var hideItem = ["hwp","ppt","doc","xls"];
		//viewer.hideToolbarItem(hideItem);

		var date=new Date();   
		var months=["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];
        var dd=date.getDate() > 10 ? date.getDate() : "0"+date.getDate();
        var mm=date.getMonth();
        var yy=date.getYear();       
		var fileName="COM INV_"+dd+months[mm]+yy;

		//Rdviewer.SetSaveDialog ("C:\\", fileName, 5);
		
}   	
function invPreview(rdObject) {
    var Rdviewer=rdObject;
    var opener = window.dialogArguments;
    if(!opener)opener=window.opener; 
	var rdFiles=opener.document.form.com_mrdPath.value; 
	var rdParam=opener.document.form.com_mrdArguments.value;	
	var appendReport = [];
	
	var arrStr=rdFiles.split("|");	
	var arrStr2=rdParam.split("|");
	
	if (arrStr.length > 1 ) {
		for (var i=0; i < arrStr.length-1;i++ ) {	
			appendReport.push({mrdPath:RD_path + "apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/" + arrStr[i],mrdParam:RDServer + arrStr2[i] + "/rpagenuminit [1] /riprnmargin /rwait "});			
		}
		viewer.openFile(appendReport, {timeout:3000});
	} else {
		var arrStr=rdFiles;	
		var arrStr2=rdParam;
		
		appendReport.push({mrdPath:RD_path + "apps/opus/fns/inv/accountreceivableinvoicemgt/invoiceissue/report/" + arrStr,mrdParam:RDServer + arrStr2 + "/rpagenuminit [1] /riprnmargin /rwait "});
		viewer.openFile(appendReport, {timeout:3000});
	}
}	
function FNS_INV_0036_02_prev() {
	this.processButtonClick=processButtonClick;		
}
function processButtonClick(){
	var formObject=document.form;
	try {
		var srcName=ComGetEvent("name");
		if(ComGetBtnDisable(srcName)) return false;
        switch(srcName) {
            case "btn_paperissue":
                var opener = window.dialogArguments;
                if(!opener)opener=window.opener;          	
                opener.getPreviewIssue();
			    ComClosePopup(); 
            break;
            case "btn_close":
			ComClosePopup();

            break;
        } // end switch
	}catch(e) {
		if( e == "[object Error]") {
			ComShowMessage(OBJECT_ERROR);
		} else {
			ComShowMessage(e.message);
		}
	}
}

	
</script>
    

<form name="form">
	<div class="layer_popup_contents">
	<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
	   <!-- page_title(S) -->
		<h2 class="page_title"><span><%=title%></span></h2>
		<!-- page_title(E) -->
		<!-- opus_design_btn(S) -->
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_paperissue" 	id="btn_paperissue">Issue</button><!--
			--><button type="button" class="btn_normal" name="btn_close" id="btn_close">Close</button><!--
		--></div>
		<!-- opus_design_btn(E) -->
		<!-- page_location(S) -->
		<div class="location">
			<span id="navigation"></span>
		</div>
		<!-- page_location(E) -->
	</div>
	<!-- page_title_area(E) -->
	</div>
	
	<!-- opus_design_grid(S) -->	
	<div class="opus_design_RD" >
				<script type="text/javascript">rdViewerObject();</script>
	</div>
	<!-- opus_design_grid(E) -->
</div>

</form>			

