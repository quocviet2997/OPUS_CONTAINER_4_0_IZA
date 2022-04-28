<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form name="form" action="/opuscntr/fax_send.do">

<div class="layer_popup_title">
	<div class="page_title_area clear">
		<h2 class="page_title"><span>FAX</span></h2>
		
		<div class="opus_design_btn">
			<button type="button" class="btn_normal" onclick="form.submit()">Fire</button>
		</div>
	</div>
</div>

<div class="layer_popup_contents">
	<div class="wrap_result">
		<div class="opus_design_inquiry wFit">
<br><hr size=5 noshade>
Module
<br>
<input type="text" size="200" name="rd_appl_cd" value="COM">
<br><hr size=5 noshade>
MRD
<br>
<input type="text" size="200" name="rpt_file_nm" value="clt.mrd">
<br><hr size=5 noshade>
BatchFlag
<br>
<input type="text" size="200" name="batch_flag" value="N">
<br><hr size=5 noshade>
Title
<br>
<input type="text" size="200" name="fax_tit_nm" value="Fax Title">
<br><hr size=5 noshade>
MRD Parameter
<br>
<input type="text" size="200" name="para_info_ctnt" value="/rp [X]">
<br><hr size=5 noshade>
Fax Name & Number
<br>
<input type="text" size="200" name="rcvr_info_ctnt" value="LEE;81345408046">
<br><hr size=5 noshade>
Office Code
<br>
<input type="text" size="200" name="ofc_cd" value="HKGBB">
<br><hr size=5 noshade>
Creat User
<br>
<input type="text" size="200" name="cre_usr_id" value="CLTSAADM">
<br><hr size=5 noshade>
		</div>
	</div>
</div>
</form>