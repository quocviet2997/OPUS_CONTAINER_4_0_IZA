/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : MqInboundMonitoringDAOSendingSearchRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.03.12
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2015.03.12 Jeong-Hoon, KIM
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.mqinboundmonitoring.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, KIM
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MqInboundMonitoringDAOSendingSearchRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * It gets data if you want to get Sending Data.
	  * </pre>
	  */
	public MqInboundMonitoringDAOSendingSearchRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("msg_tj_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_sndr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ref_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("msg_qu_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_msg_tp_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.mqinboundmonitoring.integration").append("\n"); 
		query.append("FileName : MqInboundMonitoringDAOSendingSearchRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
	
	public String getSQL(){
		return query.toString();
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}

	/**
	 * Query 생성
	 */
	public void setQuery(){
		query.append("SELECT * FROM COM_IB_MSG_INFO " ).append("\n"); 
		query.append("WHERE MSG_TJ_DT BETWEEN TO_DATE(@[msg_tj_dt]||'000000','YYYY-MM-DDHH24MISS') AND TO_DATE(@[msg_tj_dt]||'235959','YYYY-MM-DDHH24MISS')" ).append("\n"); 
		query.append("#if (${msg_proc_sts_cd} != '')" ).append("\n"); 
		query.append("AND (MSG_PROC_STS_CD <> 4 AND MSG_PROC_STS_CD <> 5 AND MSG_PROC_STS_CD <> 6)" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${sub_sys_cd} != '')" ).append("\n"); 
		query.append("AND SUB_SYS_CD = @[sub_sys_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${ref_no} != '')" ).append("\n"); 
		query.append("AND REF_NO LIKE @[ref_no]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${edi_msg_tp_id} != '')" ).append("\n"); 
		query.append("AND EDI_MSG_TP_ID LIKE @[edi_msg_tp_id]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${edi_sndr_id} != '')" ).append("\n"); 
		query.append("AND EDI_SNDR_ID LIKE @[edi_sndr_id]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${msg_qu_nm} != '')" ).append("\n"); 
		query.append("AND MSG_QU_NM LIKE @[msg_qu_nm]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("AND ROWNUM < 5001" ).append("\n"); 
		query.append("ORDER BY msg_tj_dt DESC" ).append("\n"); 

	}
}