<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.net.URLDecoder"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>
<%@page import="org.apache.log4j.Logger" %>
<%@page import="m2soft.ers.invoker.http.ReportingServerInvoker"%>
<%@page import="m2soft.ers.invoker.InvokerException"%>
<%!static Logger logger = Logger.getLogger("DIRECT_REPORT_LOGGER");%>
<%
	String mrdPath = request.getParameter("mrd_path");
	String mrdParam = request.getParameter("mrd_param");
	String serviceUrl = request.getParameter("service_url");
	String exportType = "pdf";
	String fileName = "report";
	String fileExtension = ".pdf";
	
	ReportingServerInvoker invoker = new ReportingServerInvoker(serviceUrl);
	
	invoker.setCharacterEncoding("utf-8");
    invoker.setReconnectionCount(3);
	invoker.setConnectTimeout(5);
	invoker.setReadTimeout(1800);
	invoker.addParameter("opcode", "500");
	invoker.addParameter("mrd_path", mrdPath);
	invoker.addParameter("mrd_param", mrdParam);
	invoker.addParameter("export_type", exportType);
	invoker.addParameter("protocol", "file");

	InputStream inStream = null;
	OutputStream outStream = null;
	
	Random random = new Random();
	String ProcessID = String.valueOf(random.nextInt());
	
	logger.info("===========================================================================================================");
	logger.info("(PID: "+ProcessID+") DIRECT REPORT START");
	logger.info("client_ip : " + request.getRemoteAddr());
	logger.info("mrd_path : " + mrdPath);
	logger.info("mrd_param : " + mrdParam);
	logger.info("===========================================================================================================");
	
	try {
		inStream = invoker.invokeAndGetStream();
		outStream = response.getOutputStream();
		response.setContentType("application/octet-stream;");
		response.setHeader("Content-Disposition","attachment; filename=\""+fileName+"\"");
		response.setCharacterEncoding("utf-8");
		byte[] buffer = new byte[4096];
	    int bytesRead = -1;
	    while ((bytesRead = inStream.read(buffer)) != -1) {
	        outStream.write(buffer, 0, bytesRead);
	    }
	} catch(InvokerException ie) {
		response.sendError(500, ie.getErrorCode());
		logger.info("===========================================================================================================");
		logger.info("(PID: "+ProcessID+") DIRECT REPORT FAIL");
		logger.info("===========================================================================================================");
	} catch(Exception ex) {
		response.sendError(500, ex.getMessage());
		logger.info("===========================================================================================================");
		logger.info("(PID: "+ProcessID+") DIRECT REPORT FAIL");
		logger.info("===========================================================================================================");
	} finally {
		try {
			inStream.close();
		    outStream.close();
			invoker.disconnect();
			logger.info("===========================================================================================================");
			logger.info("(PID: "+ProcessID+") DIRECT REPORT SUCCESS");
			logger.info("===========================================================================================================");
		} catch(Exception ex) {
			response.sendError(500, ex.getMessage());
			logger.info("===========================================================================================================");
			logger.info("(PID: "+ProcessID+") DIRECT REPORT FAIL");
			logger.info("===========================================================================================================");
		}
	}
%>