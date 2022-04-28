<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : opusMainTobe.jsp
*@FileTitle  : Default Main page 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/24
=========================================================
--%>
<%@page import="com.clt.framework.user.history.ComRctMnuAcssHis"%>
<%@page import="java.util.List"%>
<%@page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<script  type="text/javascript"> 
	function loading_st(){ 
		ComOpenWait(true);
	} 
	function loading_ed(){
		ComOpenWait(false);
	} 
	
	loading_st(); 
	startCheck();
	window.onload = loading_ed; 	
</script> 
    <!-- page_title_area(S) -->
    <div class="page_title_area clear">
       <h2 class="page_title main_page_title">Container Carrier Information Management Solution</h2>
    </div>
    <!-- page_title_area(E) -->
    <!-- main_contents(S) -->
    <div class="main_contents">
        <!-- main_history_wrap(S)  -->
        <div class="main_history_wrap">
	        <h3 class="main_title_recently">Recently viewed</h3> 
            <span class="img_main_recently"><img src="style/images/theme_default/main_history.png" alt="Recently viewed pages" /></span>
	        
	        <!-- main_history(S) -->
	        <ul class="main_history">
		        <%
				GeneralEventResponse eventResponse = (GeneralEventResponse) request.getAttribute("EventResponse");
		        List<ComRctMnuAcssHis> comRctMnuAcssHiss = (List<ComRctMnuAcssHis>)eventResponse.getCustomData("comRctMnuAcssHiss");
		        int count = 0;
		        for(ComRctMnuAcssHis comRctMnuAcssHis: comRctMnuAcssHiss){
		        	if(count < 3){
		        		out.print("<li class=\"history_recent\">");
		        	} else{
		        		out.print("<li>");
		        	}
		        	count++;
		        	out.print("<a href=\""+comRctMnuAcssHis.getPgmFullUrl()+"\" target=\"_blank\">");
		        	out.print("<strong>"+comRctMnuAcssHis.getPgmNo()+"</strong>");
		        	out.print("<span>"+comRctMnuAcssHis.getPgmNm()+"</span>");
		        	out.print("</a>");
		        	out.print("</li>");
		        }
		        %>
	        </ul>
	        <!-- main_history(E) -->
            <div class="copyright">COPYRIGHT(C) 2014 CYBERLOGITEC CO. LTD. ALL RIGHTS RESERVED.</div>	        
        </div>
        <!-- main_history_wrap(E)  -->
        <script>
        $(".wrap").css("min-width","0");
        </script>
    </div>
    <!-- main_contents(E) -->