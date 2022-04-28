<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : loginTobe.jsp
*@FileTitle  : OPUS_CNTR login page 
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>
<%@page import="com.clt.utilitybox.utility.CheckUtilities"%>
<%@page import="com.clt.framework.component.util.StringUtil"%>
<%@page import="com.clt.framework.component.util.CheckUtils"%>
<%@page import="org.apache.log4j.Logger"%>
<%@page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@page import="com.clt.framework.support.view.signon.SignOnUserAccount"%>
<%@ page import="com.clt.syscommon.common.util.UserRoleUtil"%>
<%@ page import="com.clt.framework.component.util.JSPUtil" %>
<%@taglib uri="/WEB-INF/com_main.tld" prefix="mainpage"%>
<%
	SignOnUserAccount account = (SignOnUserAccount) session.getAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT);
	if(account == null){
		account = new SignOnUserAccount();
	}
	String changeOffice = request.getParameter("usr_chg_ofc_cd");
	String message    = request.getParameter("FORM_MESSAGE");
	if(( message!=null )&&( message.length()>0 )){
		if(message.contains("'")) {
			message = message.replaceAll("'","");
		}

		out.println("<script>alert('" + message + "');</script>\n");

		}
	if(changeOffice!=null && !CheckUtils.isNullAndNullString(account.getUsr_id())){
		account.setOfc_cd(changeOffice);
		session.setAttribute(CommonWebKeys.SIGN_ON_USER_ACCOUNT, account);
		Logger.getRootLogger().info(">> Change User Office ; " + account.getOfc_cd() );
	}	
	
	// add 2015.01.19.
	String passChangeYN = StringUtil.xssFilter(request.getParameter("PASS_CHANGE_YN"));
	
	if(CheckUtilities.isNullAndNullString(passChangeYN)){
		passChangeYN = "";
	}else{
		passChangeYN = passChangeYN.substring(0, 1);
	}
	out.print(passChangeYN);
	
    String cookieUserId="";
    String cookieUserName="";
    Cookie[] cookies = request.getCookies();
    
    if (cookies != null) {
        for (int loop = 0; loop < cookies.length; loop++) {
            if (cookies[loop].getName().equals("bp_signon")) {
                 cookieUserId=cookies[loop].getValue();
            }
            if (cookies[loop].getName().equals("bp_signon_user_name")) {
                 cookieUserName=cookies[loop].getValue();
            }
        }
    }
    
    boolean adminAuth = false;
    if (!CheckUtils.isNullAndNullString(account.getUsr_id())) { 
    	String adminFlag = (new UserRoleUtil()).getUserAdminFlag(account.getUsr_id());
    	if ( account.getUsr_auth_tp_cd().equals("A") ) adminAuth = true;
    	else if ( account.getUsr_auth_tp_cd().equals("E") ) adminAuth = true;
    	else if ( account.getUsr_auth_tp_cd().equals("S") ) {
    		if ( adminFlag.equals("Y") ) adminAuth = true;
    		else adminAuth = false;
    	} else adminAuth = false;
    }
%>
<html lang="en" style="overflow:hidden">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <!-- Mobile meta tag(S) -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no, target-densityDpi=medium-dpi">
    <meta name="format-detection" content="telephone=no" />
    <!-- Mobile meta tag(E) -->
    <link rel="shortcut icon" href="/opuscntr/img/favicon.ico" type="image/x-icon" />
    <title>Login : OPUS Container</title>
    <link rel="stylesheet" type="text/css" href="style/css/theme_default.css" />
    <script src="style/js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        function setup(){
        	with(document.login_form)
        	{
				eval("j_username").value="<%=cookieUserId%>";
				if ("<%=cookieUserId%>".length>0) {
				    eval("j_password").focus();
				    $("#j_username").addClass("val_ready");
				} else {
				    eval("j_username").focus();
				    $("#j_username").removeClass("val_ready");
			    }
			}
			<%
				if(!CheckUtils.isNullAndNullString(account.getUsr_id())){
					out.print("$(\"#logout_form\").css(\"display\",\"block\");\n");
					out.print("$(\"#login_form\").css(\"display\",\"none\");\n");
				} else{
					out.print("$(\"#login_form\").css(\"display\",\"block\");\n");
                    out.print("$(\"#logout_form\").css(\"display\",\"none\");\n");
				}
			%>
						
			// add 2015.01.19.
			var passChangeYN ='<%=passChangeYN%>';		
			 if( passChangeYN == 'Y'){
				 openPasswordChange(); 
			 }
        }

		function changeOffice(obj){
			alert("If office code is changed, related tabs will be closed.");
			localStorage.setItem("storage",obj.value);
		 	document.forms[1].action="MainPage.do";
		 	document.forms[1].usr_chg_ofc_cd.value = obj.value;
		 	document.forms[1].submit();
		}
		function onStorageEvent(storageEvent){
			var chkMsg = storageEvent.newValue;
			if(chkMsg.lastIndexOf("logout") == 0) {
				window.location.href='/opuscntr/SignOff.do';
			}
		}
		
		window.addEventListener('storage', onStorageEvent, false);
		
		
		function submitForm() {
			if(event.keyCode == 13) {
				with(document.login_form)
			    {
					if(document.all("j_username").value.length <= 0){
						document.all("j_username").focus();
				        alert("Enter ID !");
				        return false;
				    }
					else if(document.all("j_password").value.length <= 0){
				    	document.all("j_password").focus();
				        alert("Enter Password !");
				        return false;
				    }
				submit();
			    }
			}
			else {
				return false;
			}
		}
		
		function submitFormClick() {
			with(document.login_form)
		    {
				if(document.all("j_username").value.length <= 0){
					document.all("j_username").focus();
			        alert("Enter ID !");
			        return false;
			    }
				else if(document.all("j_password").value.length <= 0){
			    	document.all("j_password").focus();
			        alert("Enter Password !");
			        return false;
			    }
		     submit();
		    }
		}
		
		
		function openPasswordChange() {		
			 var formObj=document.login_form;
			 var sUrl="/opuscntr/PasswordChange.do?user_id=" + formObj.j_username.value  ;
			 var myWindow = window.open(sUrl, "PasswordChange", "width=805, height=500");
		}
		
		
	</script>
    <script>
    // UI / Design Scirpt(Publisher)
     $(function(){
     	
         //2depth link value
         setTimeout(function(){
             $(".login_div_form > span input").each(function(){
                 if($(this).val() != "" && $(this).val() != null){
                     $(this).addClass("val_ready");
                 } else {
                     $(this).removeClass("val_ready");
                 }
             });
         },10);
     	
         
         $(".login_form > span input").bind("focusout",function(event){
             if($(this).hasClass("val_ready") && $(this).val() != "" && $(this).val() != null){
                 return;
             }
             
             //password autocomplete 
             if(event.type == "keyup" && event.keyCode == 13){
                 setTimeout(function(){
                     $(".login_div_form > span input").each(function(){
                         if($(this).val() != "" && $(this).val() != null){
                             $(this).addClass("val_ready");
                         } else {
                             $(this).removeClass("val_ready");
                         }
                     });
                 },10);
             }
             
             if($(this).val() != "" && $(this).val() != null){
                 $(this).addClass("val_ready");
             } else {
                 $(this).removeClass("val_ready");
             }
         });
     	
         
     	
         // GNB one depth LI numbering (design issue)
         for(i = 2; i <= $(".login_gnb > li").length; i++ ) {
             $(".login_gnb > li:eq("+ (i-1) +")").addClass("login_gnb_0" + i);
         }
		         
		   // LOGIN CONTENTS
		   $(".login_gnb > li").click(function(){
		       
		   	if ($(".login_form").css("display") == "none") {
		
		   		// Added : li hover(design) class
		   		$(this).addClass("now").siblings("li").removeClass("now");
		
		   		$(".login_contents_wrap").stop().fadeIn();
		   		
		           // contents slide 
		           $(".login_contents_wrap > ul").stop().animate({
		               left:parseInt("-"+ ($(".login_contents_wrap").outerWidth()+38) * $(this).index())
		           },100);
		       }
		   });
		   
		
		   // 2depth contents hidden
		   $(document).click(function(event){
	             if($(event.target).parents(".login_wrap").length == 0 || event.target.tagName == "A") {
	                 $(".login_contents_wrap").stop().fadeOut();
	                 $(".login_gnb > li.now").removeClass("now");
	             }
		   });
		   
		   
		   // LOGOUT
		   $(".btn_logout_default").click(function(event){
		       event.preventDefault();
		       $(".logout_div").hide(); 
		       $(".login_div").fadeIn(200);
		       
		       // GNB contents DIV hide
		       $(".login_gnb > li")
		       .siblings("li").animate({ marginLeft:0,marginRight:4 },400)
		       .children("div").animate({  
		           width:0,
		           padding:0
		       },200);
		   });
     });
    </script>
</head>
<body class="login_body" onload="setup()">
   <!-- login_wrap(S) -->
   <div class="login_wrap">
       <div class="copyright">COPYRIGHT(C) 2014 CYBERLOGITEC CO. LTD. ALL RIGHTS RESERVED.</div>
       <h1><img src="style/images/theme_default/login_logo.png" alt="OPUS Container:TM Container Carrier Information Management Solution" /></h1>
      
       <!-- login_gnb -->
       <ul class="login_gnb">
           <li>Sales MGMT</li>
           <li>Support &amp; Admin</li>
           <li>EQ MGMT</li>
           <li>Service MGMT</li>
           <li>Vessel OPR</li>
           <li>Biz Common</li>
           <li>Statement MGMT</li>
       </ul>
       <!-- login_gnb(E) -->
       
       
       <!-- login_form(S) -->
       <form name="login_form" id="login_form" action="j_signon_check.do" class="login_form" >
       	<input type=hidden name="j_remember_username" value="Y">
           <span><input type="text" id="j_username" name="j_username" onkeypress="submitForm();"/></span>
           <span class="pw"><input type="password" id="j_password" name="j_password" onkeypress="submitForm();"/></span>
           <button type="button" onClick="submitFormClick();" class="login_btn"><img src="style/images/theme_default/login_btn_in.png" alt="Login" /></button>
       </form>
       <!-- login_form(E) -->
       
       <!-- logout_form(S) -->
	   <%
		if(account.getUsr_id() != null && !account.getUsr_id().equals("")) {
	   %>
       <form id="logout_form" action="SignOff.do" onsubmit="return confirm('You will be logged out. Do you want to proceed?')" class="logout_form"  method="POST">
       <input type="hidden" name="usr_chg_ofc_cd" value="0">
      		<span><%=account.getUsr_nm()%></span>
			<button type="submit" class="login_btn"><img src="style/images/theme_default/login_btn_out.png" alt="Logout" /></button>
			<div class="clear" style="padding-top:18px;">
	          	<mainpage:OfficeChangeList 
					userId="<%=account.getUsr_id() %>"
					usrNm="<%=account.getUsr_nm() %>"
					ofcCd="<%= account.getOfc_cd() %>"
					styleValue=""
					classValue=""
					nameValue="s_usr_chg_ofc_cd"
					functionValue="onChange='changeOffice(this)'"
				/>
				<% if (adminAuth) { %>
				<a class="login_btn_admin" href="/opuscntr/opusMainTobe.do?parentPgmNo=ADM_000_M000" target="_blank">Administrator</a>
				<%} %>
			</div>
       </form>
	   <%
		}
	   %>
       <!-- logout_form(E) -->
           
	    <!-- login_contents_wrap(S) -->
	    <div class="login_contents_wrap">
	        <ul>
	            <li>
	                <!-- Sales management : (S) -->
	                <div class="login_contens_01">
	                    <h2>Sales Management</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_SAQ_M001" name="gnbLink_sales_00" target="_blank">Sales Quota</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_SPC_M001" name="gnbLink_sales_01" target="_blank">Space Control</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_PRI_M001" name="gnbLink_sales_02" target="_blank">Pricing</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_COA_M001" name="gnbLink_sales_03" target="_blank">CNTR BIZ PFMC Analysis</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_BSA_M001" name="gnbLink_sales_04" target="_blank">BSA</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_SAM_M001" name="gnbLink_sales_05" target="_blank">Sales Admin</a></li>
	                    </ul>
	                </div>
	                <!-- Sales management : (E) -->
	            </li>
	            <li>
	                <!-- Support &amp; Admin : (S) -->
	                <div class="login_contens_02">
	                    <h2>Support &amp; Admin</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=CPS_CNI_M001" name="gnbLink_supportAdmin_00" target="_blank">Claim &amp; Insurance</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_FLT_M001" name="gnbLink_supportAdmin_01" target="_blank">Fleet Management</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=FNS_JOO_M001" name="gnbLink_supportAdmin_02" target="_blank">Joint Operation</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_ACM_M001" name="gnbLink_supportAdmin_03" target="_blank">Agent Commission Management</a></li>
	                    </ul>
	                </div>
	                <!-- Support &amp; Admin : (E) -->
	            </li>
	            <li> 
	                <!-- Equipment Management : (S) -->
	                <div class="login_contens_03">
	                    <h2>Equipment Management</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_EQR_M001" name="gnbLink_eqMgmt_00" target="_blank">EQ Reposition</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_MST_M001" name="gnbLink_eqMgmt_01" target="_blank">CNTR Master</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_LSE_M001" name="gnbLink_eqMgmt_05" target="_blank">CNTR Lease</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CIM_M001" name="gnbLink_eqMgmt_02" target="_blank">CNTR Inventory</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_MNR_M001" name="gnbLink_eqMgmt_06" target="_blank">M&amp;R</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CGM_M001" name="gnbLink_eqMgmt_03" target="_blank">Chassis</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CGM_M019" name="gnbLink_eqMgmt_04" target="_blank">M.G Set</a></li>
	                    </ul>
	                </div>
	                <!-- Equipment Management : (E) -->
	            </li>
	            <li>                    
	                <!-- Service Management : (S) -->
	                <div class="login_contens_04">
	                    <h2>Service Management</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_BKG_M001" name="gnbLink_serviceMgmt_00" target="_blank">Booking/Documentation</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_PRD_M001" name="gnbLink_serviceMgmt_01" target="_blank">Product Catalog</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_SCE_M001" name="gnbLink_serviceMgmt_02" target="_blank">SCEM</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_TES_M001" name="gnbLink_serviceMgmt_03" target="_blank">TML INV</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_TRS_M001" name="gnbLink_serviceMgmt_04" target="_blank">Trans S/O</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=FNS_INV_M001" name="gnbLink_serviceMgmt_05" target="_blank">A/R Invoice</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_CTM_M001" name="gnbLink_serviceMgmt_06" target="_blank">CNTR Movement</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESD_TPB_M001" name="gnbLink_serviceMgmt_07" target="_blank">3rd Party Billing</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=EES_DMT_M001" name="gnbLink_serviceMgmt_08" target="_blank">Demurrage/Detention</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ESM_OCP_M001" name="gnbLink_serviceMgmt_09" target="_blank">OCPS</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=TPL_DOM_M001" name="gnbLink_serviceMgmt_10" target="_blank">Domestic</a></li>
	                    </ul>
	                </div>
	                <!-- Service Management : (E) -->
	            </li>
	            <li>
	                <!-- Vessel Operation : (S) -->
	                <div class="login_contens_05">
	                    <h2>Vessel Operation</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_OPF_M001" name="gnbLink_vesselOPR_00" target="_blank">Operation &amp; PFMC</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_PSO_M001" name="gnbLink_vesselOPR_01" target="_blank">Port Service Order</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_SCG_M001" name="gnbLink_vesselOPR_02" target="_blank">Special Cargo</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=VOP_VSK_M001" name="gnbLink_vesselOPR_03" target="_blank">Vessel Schedule</a></li>
	                    </ul>
	                </div>
	                <!-- Vessel Operation : (E) -->
	             </li>
	             <li>   
	                <!-- Biz Common : (S) -->
	                <div class="login_contens_06">
	                    <h2>BIZ Common</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=BCM_CCD_M001" name="gnbLink_bizCommon_00" target="_blank">Master Data</a></li>
	                        <!-- <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=BCM_FIN_M001" name="gnbLink_bizCommon_01" target="_blank">Finance Setup</a></li> -->
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=BCM_SUP_M001" name="gnbLink_bizCommon_02" target="_blank">EDI Setup</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=COM_SEC_M001" name="gnbLink_bizCommon_03" target="_blank">Security</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=COM_CAP_M001" name="gnbLink_bizCommon_04" target="_blank">Approval</a></li>
	                        <!-- <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=ADM_000_M000" name="gnbLink_bizCommon_05" target="_blank">Administer</a></li> -->
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=COM_FAX_M001" name="gnbLink_bizCommon_06" target="_blank">Fax Monitoring</a></li>
	                    </ul>
	                </div>
	                <!-- Biz Common : (E) -->
	            </li>                   
	            <li>
	                <!-- Statement Management : (S) -->
	                <div class="login_contens_07">
	                    <h2>Statement Management</h2>
	                    <ul>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SAP_M001" name="gnbLink_stateMgmt_00" target="_blank">Statement Account Payable</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SAR_M001" name="gnbLink_stateMgmt_01" target="_blank">Statement Account Receivable</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SAC_M001" name="gnbLink_stateMgmt_02" target="_blank">Statement Accrual</a></li>
	                        <li><a href="/opuscntr/opusMainTobe.do?parentPgmNo=STM_SCO_M001" name="gnbLink_stateMgmt_03" target="_blank">Statement Common</a></li>
	                    </ul>
	                </div>
	                <!-- Statement Management : (E) -->
	            </li>
	        </ul>
	        <span class="login_bg"></span>
	    </div>
	    <!-- login_contents_wrap(E) -->
    </div>
    <!-- login_wrap(E) -->
</body>
</html>
