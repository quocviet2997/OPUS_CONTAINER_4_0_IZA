/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOModifyActivityUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.12.28
*@LastModifier : 
*@LastVersion : 1.0
* 2015.12.28 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOModifyActivityUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Activity Date / Place 수정
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOModifyActivityUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("line_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOModifyActivityUSQL").append("\n"); 
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
		query.append("UPDATE AP_INV_DTRB" ).append("\n"); 
		query.append("#if (${act_dt} == 'ISSUE DATE') " ).append("\n"); 
		query.append("SET ATTR_CTNT11 = TO_CHAR(TO_DATE(ATTR_CTNT2,'YYYY/MM/DD HH24:MI:SS'),'YYYYMMDD')" ).append("\n"); 
		query.append("#elseif (${act_dt} == 'INVOICE DATE') " ).append("\n"); 
		query.append("SET ATTR_CTNT11 = TO_CHAR(TO_DATE(ATTR_CTNT2,'YYYY/MM/DD HH24:MI:SS'),'YYYYMMDD')" ).append("\n"); 
		query.append("#elseif (${act_dt} == 'REPAIR DATE')" ).append("\n"); 
		query.append("SET ATTR_CTNT11 = DECODE(ATTR_CTNT11,NULL,(SELECT GL_DT FROM AP_INV_HDR A WHERE A.CSR_NO = @[csr_no]),ATTR_CTNT11)" ).append("\n"); 
		query.append("#elseif (${act_dt} == 'GL DATE')" ).append("\n"); 
		query.append("SET ATTR_CTNT11 = (SELECT GL_DT FROM AP_INV_HDR A WHERE A.CSR_NO = @[csr_no])" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("SET ATTR_CTNT11 = (SELECT GL_DT FROM AP_INV_HDR A WHERE A.CSR_NO = @[csr_no])" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${act_plc} == 'COST OFFICE')" ).append("\n"); 
		query.append("   ,ATTR_CTNT12 = (SELECT DISTINCT COST_OFC_CD FROM AP_PAY_INV A WHERE A.CSR_NO = @[csr_no])" ).append("\n"); 
		query.append("#elseif (${act_plc} == 'REPAIR YARD')" ).append("\n"); 
		query.append("   ,ATTR_CTNT12 = DECODE(ATTR_CTNT12,NULL,(SELECT DISTINCT INV_OFC_CD FROM AP_PAY_INV A WHERE A.CSR_NO = @[csr_no]),ATTR_CTNT12)" ).append("\n"); 
		query.append("#elseif (${act_plc} == 'OFFICE')" ).append("\n"); 
		query.append("   ,ATTR_CTNT12 = (SELECT DISTINCT INV_OFC_CD FROM AP_PAY_INV A WHERE A.CSR_NO = @[csr_no])" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("WHERE CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("  AND LINE_SEQ = @[line_seq]" ).append("\n"); 

	}
}