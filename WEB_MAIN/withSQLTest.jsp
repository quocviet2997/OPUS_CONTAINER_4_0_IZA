<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0//EN">
<HTML>
	
	<HEAD>
		<META HTTP-EQUIV="Content-Type" CONTENT="text/html;CHARSET=euc-kr">
		<META NAME="GENERATOR" Content="WebGain VisualCafe">
		<TITLE>untitled</TITLE>
	</HEAD>
	<%@ page import=" java.sql.* ,javax.naming.*,javax.sql.DataSource"%>
	<%@ page import=" java.io.ByteArrayOutputStream"%>
	<%@ page import=" java.io.PrintStream"%>
	<%@ page import=" java.sql.Connection;"%>
	
	
	
	<%!
	String getStackTraceAsString(Exception e)
	{
		// Dump the stack trace to a buffered stream, then return it's contents
		// as a String. This is useful for printing the stack to 'out'.
		ByteArrayOutputStream ostr = new ByteArrayOutputStream();
		e.printStackTrace(new PrintStream(ostr));
		return(ostr.toString());
	}
	
	Connection getConnection() {
		String drv = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS = (PROTOCOL = TCP)(HOST = 203.246.130.168)(PORT = 1521))(ADDRESS = (PROTOCOL = TCP)(HOST = 203.246.130.170)(PORT = 1521))(LOAD_BALANCE = YES) (CONNECT_DATA = (SERVER = DEDICATED)(SERVICE_NAME = NIS2010T)))";
		try {
			Class.forName(drv);
			return DriverManager.getConnection(url, "NISDEV", "NISDEV");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	%>
	<BODY>
		<%    
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sqlQuery = "WITH PARAM \n"+
		"AS ( \n"+
			"	SELECT \n"+
			"	'20090101' PERIOD_STDT \n"+
			"	,'20091231' PERIOD_EDDT \n"+
			"	,'H'  COMPANY \n"+
			"	,null LOC_CD \n"+
			"	,null LOC_TP \n"+
			"	,null VNDR_SEQ \n"+
			"	,'HHO' AGMT_CTY_CD \n"+
			"	,null AGMT_SEQ \n"+
			"	FROM   DUAL \n"+
			"	) \n"+
			"	, XXX AS ( \n"+
			"	SELECT \n"+
			"	RCC , \n"+
			"	REF_NO , \n"+
			"	( \n"+
			"	D2 + \n"+
			"	D4 + \n"+
			"	D5 + \n"+
			"	D7 + \n"+
			"	R2 + \n"+
			"	R5 + \n"+
			"	O2 + \n"+
			"	S2 + \n"+
			"	O4 + \n"+
			"	S4 + \n"+
			"	F2 + \n"+
			"	A2 + \n"+
			"	F4 + \n"+
			"	A4 + \n"+
			"	F5 + \n"+
			"	P2 + \n"+
			"	P4 \n"+
			"	) DIV_TOTAL , \n"+
			"	D2 , \n"+
			"	D4 , \n"+
			"	D5 , \n"+
			"	D7 , \n"+
			"	R2 , \n"+
			"	R5 , \n"+
			"	O2 , \n"+
			"	S2 , \n"+
			"	O4 , \n"+
			"	S4 , \n"+
			"	F2 , \n"+
			"	A2 , \n"+
			"	F4 , \n"+
			"	A4 , \n"+
			"	F5 , \n"+
			"	P2 , \n"+
			"	P4 , \n"+
			"	AGMT_CTY_CD, \n"+
			"	AGMT_SEQ, \n"+
			"	DECODE( AGMT_CTY_CD , 'ZZ' , 'Total' ,  AGMT_CTY_CD || LTRIM(TO_CHAR(AGMT_SEQ , '000000'))) AGMT_NO \n"+
			"	FROM ( \n"+
				"SELECT \n"+
			"	AA RCC , \n"+
			"	DECODE(MUL_NO, 1, 'Total', REF_NO) REF_NO, \n"+
			"	DECODE(MUL_NO, 1, 'ZZ', BB) AGMT_CTY_CD, \n"+
			"	SUM(DECODE(DD, 'D2', EE, 0)) D2 , \n"+
			"	SUM(DECODE(DD, 'D4', EE, 0)) D4 , \n"+
			"	SUM(DECODE(DD, 'D5', EE, 0)) D5 , \n"+
			"	SUM(DECODE(DD, 'D7', EE, 0)) D7 , \n"+
			"	SUM(DECODE(DD, 'R2', EE, 0)) R2 , \n"+
			"	SUM(DECODE(DD, 'R5', EE, 0)) R5 , \n"+
			"	SUM(DECODE(DD, 'O2', EE, 0)) O2 , \n"+
			"	SUM(DECODE(DD, 'S2', EE, 0)) S2 , \n"+
			"	SUM(DECODE(DD, 'O4', EE, 0)) O4 , \n"+
			"	SUM(DECODE(DD, 'S4', EE, 0)) S4 , \n"+
			"	SUM(DECODE(DD, 'F2', EE, 0)) F2 , \n"+
			"	SUM(DECODE(DD, 'A2', EE, 0)) A2 , \n"+
			"	SUM(DECODE(DD, 'F4', EE, 0)) F4 , \n"+
			"	SUM(DECODE(DD, 'A4', EE, 0)) A4 , \n"+
			"	SUM(DECODE(DD, 'F5', EE, 0)) F5 , \n"+
			"	SUM(DECODE(DD, 'P2', EE, 0)) P2 , \n"+
			"	SUM(DECODE(DD, 'P4', EE, 0)) P4 , \n"+
			"	DECODE(MUL_NO, 1, 0, CC) AGMT_SEQ \n"+
			"	FROM ( \n"+
			"	SELECT \n"+
			"	C.RCC_CD AA , \n"+
			"	C.AGMT_CTY_CD BB, \n"+
			"	C.AGMT_SEQ CC, \n"+
			"	A.CNTR_TPSZ_CD DD, \n"+
			"	COUNT(C.CNTR_NO) EE, \n"+
			"	D.REF_NO \n"+
			"	FROM MST_CONTAINER A, \n"+
			"	MDM_CNTR_TP_SZ B, \n"+
			"	MST_CNTR_STS_HIS C, \n"+
			"	LSE_AGREEMENT D , \n"+
			"	PARAM P \n"+
			"	WHERE A.CNTR_TPSZ_CD = B.CNTR_TPSZ_CD \n"+
			"	AND A.CNTR_NO = C.CNTR_NO \n"+
			"	AND C.CNTR_STS_EVNT_DT BETWEEN TO_DATE(P.PERIOD_STDT, 'YYYYMMDD') AND TO_DATE(P.PERIOD_EDDT, 'YYYYMMDD') \n"+
			"	AND C.AGMT_CTY_CD = D.AGMT_CTY_CD \n"+
			"	AND C.AGMT_SEQ    = D.AGMT_SEQ \n"+
			"	--AND A.ONH_YD_CD <> 'KRSEL1H' \n"+
			"	AND A.HJS_CRE_FLG = 'N' \n"+
			"	AND SUBSTR(NVL(C.CNTR_STS_RMK, ' '), 1, 6) <> 'SELLOE' \n"+
			"	AND C.CNTR_LSTM_CNG_FLG = 'N' \n"+
			"	AND C.CNTR_STS_CD IN ('LSI','DII','OWN') \n"+
			"	AND C.AGMT_SEQ <> 999990 \n"+
			"	AND A.CNTR_USE_CO_CD = P.COMPANY \n"+
			"	GROUP BY C.AGMT_CTY_CD, C.AGMT_SEQ, A.CNTR_TPSZ_CD, D.REF_NO, \n"+
			"	C.RCC_CD \n"+
			"	), \n"+
			"	( \n"+
			"	SELECT 1 MUL_NO \n"+
			"	FROM DUAL \n"+
			"	UNION ALL \n"+
			"	SELECT 2 MUL_NO \n"+
			"	FROM DUAL) \n"+
			"	GROUP BY AA, DECODE(MUL_NO, 1, 'ZZ', BB), DECODE(MUL_NO, 1, 0, CC), DECODE(MUL_NO, 1, 'Total', REF_NO) ) \n"+
			"	ORDER BY RCC, AGMT_CTY_CD, AGMT_SEQ ) \n"+
			"	SELECT \n"+
			"	RCC , \n"+
			"	REF_NO , \n"+
			"	DIV_TOTAL , \n"+
			"	D2 , \n"+
			"	D4 , \n"+
			"	D5 , \n"+
			"	D7 , \n"+
			"	R2 , \n"+
			"	R5 , \n"+
			"	O2 , \n"+
			"	S2 , \n"+
			"	O4 , \n"+
			"	S4 , \n"+
			"	F2 , \n"+
			"	A2 , \n"+
			"	F4 , \n"+
			"	A4 , \n"+
			"	F5 , \n"+
			"	P2 , \n"+
			"	P4 , \n"+
			"	AGMT_CTY_CD, \n"+
			"	AGMT_SEQ, \n"+
			"	AGMT_NO \n"+
			"	FROM XXX \n"+
			"	UNION ALL \n"+
			"	SELECT \n"+
			"	'G.TTL' RCC , \n"+
			"	NULL REF_NO , \n"+
			"	SUM(DIV_TOTAL) DIV_TOTAL , \n"+
			"	SUM(D2) D2 , \n"+
			"	SUM(D4) D4 , \n"+
			"	SUM(D5) D5 , \n"+
			"	SUM(D7) D7 , \n"+
			"	SUM(R2) R2 , \n"+
			"	SUM(R5) R5 , \n"+
			"	SUM(O2) O2 , \n"+
			"	SUM(S2) S2 , \n"+
			"	SUM(O4) O4 , \n"+
			"	SUM(S4) S4 , \n"+
			"	SUM(F2) F2 , \n"+
			"	SUM(A2) A2 , \n"+
			"	SUM(F4) F4 , \n"+
			"	SUM(A4) A4 , \n"+
			"	SUM(F5) F5 , \n"+
			"	SUM(P2) P2 , \n"+
			"	SUM(P4) P4 , \n"+
			"	'ZZ' AGMT_CTY_CD, \n"+
			"	0 AGMT_SEQ, \n"+
			"	NULL AGMT_NO \n"+
			"	FROM XXX \n"+
			"	WHERE REF_NO = 'Total' \n";
		//out.print(sqlQuery + "\n");
		try{
			InitialContext initCtx = new InitialContext();
			DataSource ds = (DataSource)initCtx.lookup("jdbc/NIS2010");
			conn = ds.getConnection();
			//conn = getConnection();
			stmt = conn.prepareStatement(sqlQuery);
			rs = stmt.executeQuery();
			int i = 1;
			while (rs.next()) {
				out.println("row count "+ i + "=== "+ rs.getObject(1)   + "<br>");
				out.println("row count "+ i + "=== "+ rs.getObject(2)  + "<br>" );
				out.println("row count "+ i + "=== "+ rs.getObject(3)  + "<br>" );
				out.println("row count "+ i + "=== "+ rs.getObject(4)   + "<br>");
				out.println("row count "+ i + "=== "+ rs.getObject(5)   + "<br>");
				out.println("row count "+ i + "=== "+ rs.getObject(6)  + "<br>" );
				out.println("row count "+ i + "=== "+ rs.getObject(7)   + "<br>");
				out.println("row count "+ i + "=== "+ rs.getObject(8)  + "<br>" );
				out.println("row count "+ i + "=== "+ rs.getObject(9)  + "<br>" );
				out.println("row count "+ i + "=== "+ rs.getObject(10)  + "<br>");
				i++;
			}
			ResultSetMetaData rsmd = rs.getMetaData();
			int numCols = rsmd.getColumnCount();

			System.out.println("row count is " + numCols );
			
		}catch (Exception e){
					%>
					
					<p>
					<b>There was an error executing or processing the query:
					</b>
					<br>
					Exception: <%= e %>
					<pre><%= getStackTraceAsString(e) %></pre>
					
					<%
			} 
			finally
			{
				try
				{
					rs.close();
					stmt.close();
					conn.close();
				}
				catch (Exception e)
				{
					out.print("<b>There was an error closing the database connection</b>");
					out.print("<br>Exception: " +e);
					out.print("<br><pre>"+getStackTraceAsString(e)+"</pre>");
				}
			}
		%>
		
		
	</BODY>	
</HTML>
