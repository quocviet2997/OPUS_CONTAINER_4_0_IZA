<%@ page import="com.clt.bizcommon.approval.util.ApprovalUtil"%>
<%@ page import="com.clt.syscommon.common.table.*"%>

<%
	try {
		ApprovalUtil util = new ApprovalUtil();
		
		// COM_APRO_RQST_HDR
		COM_APRO_RQST_HDR header = new COM_APRO_RQST_HDR();
		header.setSub_sys_cd("AGT");
		header.setApro_knd_cd("CSR");		
		header.setRqst_ofc_cd("SELHO");
		header.setRqst_ofc_nm("");
		header.setRqst_usr_jb_tit_nm("");
		header.setRqst_usr_id("system1");
		header.setRqst_usr_nm("관리자");
		header.setCre_usr_id("system1");
		
		// COM_APRO_RQST_ROUT
		String apro_step = com.clt.bizcommon.approval.util.ApprovalUtil.getApprovalRoute("SELHO", "AGT");
		//String apro_step = request.getParameter("apro_step");
		COM_APRO_RQST_ROUT[] route = util.convertApprovalRoute(apro_step);
		
		// COM_APRO_CSR_DTL
		COM_APRO_CSR_DTL csr = new COM_APRO_CSR_DTL();
		csr.setCsr_no("121212");
		csr.setCost_ofc_cd("SELHO");
		csr.setInv_knt("10");
		csr.setVndr_seq("00202");
		csr.setPay_due_dt("20070311");
		csr.setCurr_cd("AEA");
		csr.setApro_ttl_amt("12000");
		csr.setCre_usr_id("system1");
		
		// 결재 등록
		util.saveCsrApro(header, route, csr);
		
	} catch(Exception e) {
		out.println(e.getMessage());
	}
%>
<br>
Approval Request Completed...