<%--
=========================================================
*Copyright(c) 2014 CyberLogitec. All Rights Reserved.
*@FileName   : passwordChange.jsp
*@FileTitle  : OPUS_CNTR login Password Change
*@author     : CLT
*@version    : 1.0
*@since      : 2014/04/08
=========================================================
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.clt.framework.component.util.JSPUtil"%>
<%@ page import="com.clt.framework.component.util.DateTime"%>
<%@ page import="com.clt.framework.component.message.ErrorHandler"%>
<%@ page import="com.clt.framework.core.layer.event.GeneralEventResponse"%>
<%@ page import="com.clt.framework.support.controller.html.CommonWebKeys"%>
<%@ page import="com.clt.syscommon.management.opus.user.event.UserManagementEvent"%>
<%@ page import="org.apache.log4j.Logger" %>

<%
	UserManagementEvent  event = null;              //PDTO(Data Transfer Object including Parameters)
    Exception serverException   = null;         //Error from server
    GeneralEventResponse generalEventResponse = null; 
        
    String strErrMsg = "";
    String userMessage = "";    
    String successFlag = "";
    
    Logger log = Logger.getLogger("com.clt.apps.opus.bcm.ccd.commoncode.account");

    String user_id = "";
    
    try {
    
    	
        event 				= (UserManagementEvent)		request.getAttribute("Event");
        serverException	 	= (Exception)				request.getAttribute(CommonWebKeys.EXCEPTION_OBJECT);
        generalEventResponse 		= (GeneralEventResponse) 	request.getAttribute("EventResponse");

        
        if (serverException != null) 
            strErrMsg = new ErrorHandler(serverException).loadPopupMessage();
        
        if (generalEventResponse != null)  
        	userMessage = generalEventResponse.getETCData("userMessage");
                
        
    	if( request.getParameter("user_id") !=null )
		user_id = request.getParameter("user_id");
	
    }catch(Exception e) {
        out.println(e.toString());
    }

    
	
%>	
<html lang="en" class="pop_html">
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<!-- Mobile meta tag(S) -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<meta name="format-detection" content="telephone=no" />
<!-- Mobile meta tag(E) -->
<link rel="shortcut icon" href="/opuscntr/img/favicon.ico" type="image/x-icon" />
<title>Login : OPUS Container</title>

<!-- common js include -->
<script type="text/javascript" src="style/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="style/js/jquery-ui.js"></script>
<script type="text/javascript" src="style/js/opus_ui.js"></script>
<link rel="stylesheet" type="text/css" href="style/css/theme_default.css" />
    <script type="text/javascript">
    
    
    /**
     * 기본 설정을 처리한다. <br>
	 *
     *
     *
     **/
        function setup(){
        	
        	var formObj=document.login_form;
        	formObj.user_id.value ='<%=user_id%>';    
        	     
            var userMessage = '<%=userMessage%>';
             
             if (userMessage.length >= 1) {
                 alert(userMessage);
                 
                 if('Data was saved successfully.' == userMessage ){
                	 self.close();
                 }
             } 
             
        }
        
	 
	    /**
	     * 기본 설정을 처리한다. <br>
		 *
	     *
	     *
	     **/
        function submitForm() {
        	
			if(event.keyCode == 13) {
				with(document.login_form)
			    {
					passwordChagneSubmit();
			    }
			}
			else {
				return false;
			}
        	
		}
        
        
        
        /**
         * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
         *
         *
         *         
         **/
        function validateForm(){        
        	
        	var formObj=document.login_form;
          	
        	
    		var	usrId     = formObj.user_id.value;        	 
    		var	old_pwd   = formObj.old_pwd.value;
    		var	new_pwd_1 = formObj.new_pwd_1.value;
    		var	new_pwd_2 = formObj.new_pwd_2.value;
    			
    		var passCheckMsg =	"Password value must contains at least 1 character from 3 of the 4 character groups below. \n";
    		passCheckMsg = passCheckMsg+	  "Group 1. Upper Case (A,B,C,D,E to Z) \n";
    		passCheckMsg = passCheckMsg+	  "Group 2. Lower Case (a,b,c,d,e to z) \n";
    		passCheckMsg = passCheckMsg+	  "Group 3. Numerals (0,1,2,3,4 to 9)  \n";
    		passCheckMsg = passCheckMsg+	  "Group 4. Non alphanumeric (~ ! @ # $ % ^ & * ( ) _ + { } | : \" < > ? / . , ' ; ] [ = -)  \n";
    		passCheckMsg = passCheckMsg+	  "Please change password value and retry. ";	  
   		    		 
    		if( new_pwd_1.length < 8 ){
    		 		
    		 	 alert("Password length must be eight or more characters. \nPlease change password value and retry");  
    		 	
    		 	 document.all("new_pwd_1").focus();
    		     formObj.new_pwd_1.style.backgroundColor="#FF0000";
    					return false  ;
    		} else {
    			formObj.new_pwd_1.style.backgroundColor="";
    		}
    		
    		if( usrId == new_pwd_1 ){
    			 
    			 alert("Password value must be different from those of User ID. \nPlease change password value and retry. ");
    			 
    		     document.all("new_pwd_1").focus();
    		     formObj.new_pwd_2.style.backgroundColor="#FF0000";
   					return false  ;
   		     } else {
     			formObj.new_pwd_2.style.backgroundColor="";
     		}
    		
    	
    		 if( old_pwd == new_pwd_1 ){
    			 var msg =	      "The password in the history cannot be reused. \n";
    				 msg = msg+	  "Please change password value and retry. ";
    			 
    		 	 alert(msg);  
    		 	 document.all("new_pwd_1").focus();
    		     formObj.new_pwd_1.style.backgroundColor="#FF0000";
    					return false  ;
    		} else {
    			formObj.new_pwd_1.style.backgroundColor="";
    		}
    		
    		
    		if(   new_pwd_1 != new_pwd_2  ){
  		      alert("New Password (again) you have entered is not valid!");  
  		      document.all("new_pwd_2").focus();
  		      formObj.new_pwd_2.style.backgroundColor="#FF0000";
  		      return false  ; 
  			} else {
    			formObj.new_pwd_2.style.backgroundColor="";
    		}
    		
    		
    		if( ! checkPassword(new_pwd_1) ){
        		
      		      alert(passCheckMsg);  
      		      document.all("new_pwd_1").focus();
      		      formObj.new_pwd_1.style.backgroundColor="#FF0000";
      		    	    
      		      return false  ; 
      		} else {
    			formObj.new_pwd_1.style.backgroundColor="";
    		}
    		
    		if( ! checkPassword(new_pwd_2) ){
        	      alert(passCheckMsg);  
      		      document.all("new_pwd_2").focus();
      		      formObj.new_pwd_2.style.backgroundColor="#FF0000";
      		    	    
      		      return false  ; 
      		} else {
    			formObj.new_pwd_2.style.backgroundColor="";
    		}
        	
    		
    	    return true;
    	  
    	}
        
         /**
          * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
          *
          *
          *         
          **/
          function checkPassword(str) {
            	
          /*   
             (?mx)
             ^
             (
               (?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])                # must contain a-z, A-Z and 0-9
               |                                                # OR
               (?=.*[a-z])(?=.*[A-Z])(?=.*[!@\#$%&/=?_.,:;\\-]) # must contain a-z, A-Z and special
               |                                                # OR
               (?=.*[a-z])(?=.*[0-9])(?=.*[!@\#$%&/=?_.,:;\\-]) # must contain a-z, 0-9 and special
               |                                                # OR
               (?=.*[A-Z])(?=.*[0-9])(?=.*[!@\#$%&/=?_.,:;\\-]) # must contain A-Z, 0-9 and special
             )
             .{8,}                                              # at least 8 chars
             $
             */ 
            var returnVal = false;  
       	if(str.match(/^((?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])|(?=.*[a-z])(?=.*[A-Z])(?=.*[!@\#$%&/=?_.,:;\\~\^\(\)\^\*\+\{\}\|\'\"\<\>\]\[\--])|(?=.*[a-z])(?=.*[0-9])(?=.*[!@\#$%&/=?_.,:;\\~\^\(\)\^\*\+\{\}\|\'\"\<\>\]\[\--])|(?=.*[A-Z])(?=.*[0-9])(?=.*[!@\#$%&/=?_.,:;\\~\^\(\)\^\*\+\{\}\|\'\"\<\>\]\[\--]))[a-zA-Z0-9!@\#$%&/=?_.,:;\\~\^\(\)\^\*\+\{\}\|\'\"\<\>\]\[\--]{8,}$/)
           		  
            ) {
            	returnVal = true;
            } 
      
          return returnVal;         
          }
       
          /**
           * 화면 폼입력값에 대한 유효성검증 프로세스 처리한다. <br>
           *
           *
           *         
           **/
        function  passwordChangeSubmit (){        	
        	        	   
        	var formObj=document.login_form;
        	
        	if(document.all("user_id").value.length <= 0){
				document.all("user_id").focus();
		        alert("Enter ID !");
		        return false;
		    }
			else if(document.all("old_pwd").value.length <= 0){
		    	document.all("old_pwd").focus();
		        alert("Enter Old Password !");
		        return false;
		    }
			else if(document.all("new_pwd_1").value.length <= 0){
		    	document.all("new_pwd_1").focus();
		        alert("Enter New Password !");
		        return false;
		    }
			else if(document.all("new_pwd_2").value.length <= 0){
		    	document.all("new_pwd_2").focus();
		        alert("Enter  New Password (again)  !");
		        return false;
		    }
        	
			else if( ! validateForm()){
		    	
		        return false;
		    }
        	
			      
        	login_form.f_cmd.value="11";        
        	document.forms[0].action="PasswordChange.do";
        	document.forms[0].submit();
	   }
   
	</script>	
	
		
</head>
<body class="body_main" onload="setup();">
	<!-- page_title_area(S) -->
	<div class="layer_popup_title">
		<div class="page_title_area clear">
		    <!-- page_title(S) -->
			<!-- 타이틀 내용 동적생성 (별도 코딩 불필요) -->
			<h2 class="page_title"><span>ID / Password</span></h2>
			<!-- page_title(E) -->
			<!-- opus_design_btn(S) -->
			<div class="opus_design_btn"><!-- 
				 --><button type="button" class="btn_accent" onclick="passwordChangeSubmit();">Submit</button><!-- 
				 --><button type="button" class="btn_normal" id="btn_cancel">Cancel</button>
			</div>
			<!-- opus_design_btn(E) -->
		</div>
	</div>
	<!-- page_title_area(E) -->
	
	
	<!-- layer_popup_contents(S) -->
	<div class="layer_popup_contents passwordChange_popup">
		<div class="wrap_search mar_20 pad_20" style="border:1px solid #d2dee9;background:#e7edf3;">
			
			<!-- layout_wrap (S) -->
			<div class="layout_wrap">
			
			   <!-- layout_flex_fixed : LEFT AREA (S) -->
			   <div class="layout_flex_fixed" style="width:350px"> <!-- setting : FIXED width(350px) -->
		
					<div class="opus_design_inquiry mar_none pad_20" style="background-color:white;">

    				<form name="login_form" id="login_form">
						<table style="height:135px;">
							<tr>
								<td style="font-weight:700;">User ID</td>
								<td><input type="text" id="user_id" name="user_id" onkeypress="submitForm();" class="w100"/></td>
							</tr>
			            
							<tr>
								<td style="font-weight:700;">Old Password</td>
								<td><input type="password" id="old_pwd" name="old_pwd" onkeypress="submitForm();" class="w100"/></td>
							</tr>
			            
							<tr>
								<td style="font-weight:700;">New Password</td>
								<td><input type="password" id="new_pwd_1" name="new_pwd_1" onkeypress="submitForm();" class="w100"/></td>
							</tr>
			            
							<tr>
								<td style="font-weight:700;">New Password (again)</td>
								<td><input type="password" id="new_pwd_2" name="new_pwd_2" onkeypress="submitForm();" class="w100"/> </td>
							</tr>
						</table>	
				 	  <input type="hidden" name="f_cmd" id="f_cmd" />	
				       </form>
					</div>			
				
				</div>
				<!-- layout_flex_fixed : LEFT AREA (E) -->
				
				<!-- layout_flex_flex : RIGHT AREA (S) -->
				<div class="layout_flex_flex" style="padding-left:388px"> <!-- (fixed Width) + (padding 38px) = 388 -->
				
					<div style="display:block;">
						<h3>Password Policy</h3>
						<h3 class="title_design2" style="font-weight:normal;">Password expiration is set to 90 days.</h3>
						<h3 class="title_design2" style="font-weight:normal;">Password is locked after five consecutive failed login attempts.</h3>
						<h3 class="title_design2" style="font-weight:normal;">Password Requirement</h3>
							<h3 class="pad_left_12" style="font-weight:normal;">A. Password length must be eight or more characters.</h3>
							<h3 class="pad_left_12" style="font-weight:normal;">B. Password value must be different from those of User ID. </h3>
							<h3 class="pad_left_12" style="font-weight:normal;">C. Password history of 6 must be retained by the system and the password in the history cannot be reused.</h3>
						    <h3 class="pad_left_12" style="font-weight:normal;">D. Password value must contains at least 1 character from 3 of the 4 character groups below. </h3>
							<h3 class="pad_left_12" style="font-weight:normal;">Group 1. Upper Case (A,B,C,D,E to Z) </h3>
							<h3 class="pad_left_12" style="font-weight:normal;">Group 2. Lower Case (a,b,c,d,e to z) </h3>
							<h3 class="pad_left_12" style="font-weight:normal;">Group 3. Numerals (0,1,2,3,4 to 9) </h3>
							<h3 class="pad_left_12" style="font-weight:normal;">Group 4. Non alphanumeric (~!@#$%^&*()_+{}|:"<>?/.,';/][=-)</h3>
					</div>
					
				</div>
				<!-- layout_flex_flex : RIGHT AREA (E) -->
				
			</div>
			<!-- layout_wrap (E) -->

		</div>
	</div>
	<!-- layer_popup_contents(S) -->
       
	<script>
		$(function(){
			
			$("#btn_cancel").click(function(){
				
				window.self.close();
				
			});
			
		});
	</script>             
</body>
</html>