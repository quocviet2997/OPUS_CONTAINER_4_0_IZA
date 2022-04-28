<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : COM_ENS_0C1.jsp
*@FileTitle  : ServiceProvider정보조회(공통 Popup)
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.bizcommon.serviceprovider.event.ComEns0C1Event"%>
<%@ page import="com.clt.bizcommon.serviceprovider.vo.SpListVO"%>
<%
	ComEns0C1Event  event = null;                //PDTO(Data Transfer Object including Parameters)
	SpListVO	spListVO = new SpListVO(); 
    Exception serverException   = null;            //서버에서 발생한 에러
    String strErrMsg = "";                                 //에러메세지
    int rowCount     = 0;                                  //DB ResultSet 리스트의 건수
    
    String usr_ofc_cd = "";
    String main_page = "";
    
    String mdm_yn = JSPUtil.getParameter(request, "mdm_yn".trim(), "");
	String delt_flg = JSPUtil.getParameter(request, "delt_flg".trim(), "");	
    
    try {
    	SignOnUserAccount account=(SignOnUserAccount)session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
        //userId=account.getSawonNo();
        //userAuth=account.getAuth(); 
        usr_ofc_cd = account.getOfc_cd();
    	
        event = (ComEns0C1Event)request.getAttribute("Event");
        main_page = JSPUtil.getParameter(request, "main_page".trim(), "");
		
        if (serverException != null) {
			strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
		}
    }catch(Exception e) {
        out.println(e.toString());
    }
%>

<script language="javascript">
    function setupPage(){
        var errMessage = "<%=strErrMsg%>";
        if (errMessage.length >= 1) {
            showErrMessage(errMessage);
        } // end if
        // InitTab();
        loadPage();
    }
</script>

<!-- 
showErrMessage를 써주지 않으면 에러 발생시 처리가 불가합니다.
그리고 지금은 showErrMessage()으로 되어있지만 추후에 고객님이 변덕을 일으켜서 웹페이지를 호출하라고 할경우를 
대비해서 직접 showErrMessage() 하지 마시고 꼭 showErrMessage를 써주십시오. 한방에 바꾸게요. 표준을 안따르면 나중에 후회합니다.  
-->

<form name="form" onkeyup="ComKeyEnter('lengthnextfocus');">
<input type="hidden" name="f_cmd">
<!-- mdm data type 에 따른 select box display 구분자-->
<input type="hidden" name="mdm_yn" value="<%=mdm_yn%>">

<div class="layer_popup_title">
	<!-- page_title_area(S) -->
	<div class="page_title_area clear">
		<h2 class="page_title"><span>Service Provider Inquiry</span></h2>
		<div class="opus_design_btn">
			<button type="button" class="btn_accent" name="btn_retrieve" id="btn_retrieve">Retrieve</button><!--
			 --><button type="button" class="btn_normal" name="btn_new"      id="btn_new">New</button><!--
			 --><button type="button" class="btn_normal" name="btn_ok"		 id="btn_ok">OK</button><!--
			 --><button type="button" class="btn_normal" name="btn_close"	 id="btn_close">Close</button>
		</div>
	</div>
</div>
<div class="layer_popup_contents">

	<div class="wrap_search">
		<!-- opus_design_inquiry(S) -->
		<div class="opus_design_inquiry">
			<table> 
				<tbody>
					<tr>
						<th width="70px">Country</th>
						<td width="70px"><input type="text" name="cnt_cd" maxlength="2" style="width:50px;ime-mode:disabled" dataformat="enguponly"></td>
						<th width="100px">Control Office</th>
						<td width="110px"><input type="text" name="ofc_cd" style="width:50px;ime-mode:disabled" maxlength=6 dataformat="enguponly"></td>
						<th width="70px">S/P Type</th>
						<td width="100px">
							<input type="radio" name="p_sp_type" value="Y" id="rdo1"><label for="rdo1">Logistics</label>
							<input type="radio" name="p_sp_type" value="" id="rdo2" checked="checked"><label for="rdo2">All</label>
						</td>
						<th width="50px">
<%						if (!"".equals(mdm_yn) && mdm_yn.length() > 0) { %>
							Status
<%						} %>          
						</th>
						<td width="*">
<%						if (!"".equals(mdm_yn) && mdm_yn.length() > 0) { %>
							<select style="width:85px;" name="delt_flg">
								<option value="ALL" <% if("ALL".equals(delt_flg)){ %> selected="selected" <%} %>>ALL</option>
								<option value="N" <% if("N".equals(delt_flg) || "".equals(delt_flg)){ %> selected="selected" <%} %>>Active</option>
								<option value="Y" <% if("Y".equals(delt_flg)){ %> selected="selected" <%} %>>Delete</option>
							</select>
<%						} %>
						</td>
					</tr>
					<tr>
						<th>Service Provider Code</th>
						<td><input type="text" name="vndr_cd" id="vndr_cd" style="width:50px;ime-mode:disabled" maxlength="6"></td>
						<th>Service Provider Name</th>
						<td><input type="text" name="vndr_nm_eng" id="vndr_nm_eng" style="width:100px;ime-mode:disabled" dataformat="excepthan"></td>
						<th>Parent Code</th>
						<td colspan=3><input type="text" name="pts_vndr_cd" id="pts_vndr_cd" style="width:50px;ime-mode:disabled" maxlength="6" dataformat="num"></td>
					</tr>
					<tr>
						<th>SCAC</th>
						<td><input type="text" style="width:80px;text-align:center;" class="input" dataformat="engup" id="modi_vndr_cd" name="modi_vndr_cd" maxlength="30"></td>		
					</tr>
				</tbody>
			</table>
		</div>
	<!-- opus_design_inquiry(E) -->
	</div>

	<div class="wrap_result">
		<!-- opus_design_grid(S) -->
		<div class="opus_design_grid">
			<script>ComSheetObject('sheet1');</script>
		</div>
		<!-- opus_design_grid(E) -->
	</div>
</div>
<SCRIPT LANGUAGE="javascript">
<!--
	/* 
		ibSheet 를 제외한 폼 입력값(?) 유저가 입력한 정보를 event를 통해서 다시 넘겨받아 화면에 뿌려주는 부분입니다. 
	*/
	with(document.form)
	{
		<%
		if(event != null){ 
			SpListVO vo = event.getSpListVO();
			
			String cnt_cd = "";
			String ofc_cd = "";
			
			String vndr_cd = "";
			String vndr_nm_eng = "";
			String pts_vndr_cd = "";
			
			if(vo != null){
			   cnt_cd   = vo.getCntCd();
			   ofc_cd  = vo.getOfcCd();
			   vndr_cd = vo.getVndrCd();
			   vndr_nm_eng = vo.getVndrNmEng();
			   pts_vndr_cd = vo.getPtsVndrCd();
				
			}
		%>
		eval("cnt_cd" ).value = "<%=cnt_cd%>";
		eval("ofc_cd" ).value = "<%=ofc_cd%>";
		eval("vndr_cd" ).value = "<%=vndr_cd%>";
		eval("vndr_nm_eng" ).value = "<%=vndr_nm_eng %>";
		eval("pts_vndr_cd" ).value = "<%=pts_vndr_cd%>";
		<% } %>
	}
-->
</SCRIPT>

</form>
