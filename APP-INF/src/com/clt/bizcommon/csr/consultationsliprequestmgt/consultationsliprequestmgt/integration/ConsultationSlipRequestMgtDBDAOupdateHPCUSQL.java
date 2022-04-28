/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOupdateHPCUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.11.11
*@LastModifier : 
*@LastVersion : 1.0
* 2010.11.11 
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

public class ConsultationSlipRequestMgtDBDAOupdateHPCUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * updateHPC
	  * R4J 관련 CSR 프로그램 수정 ( DBDAO에 SQL문을 삭제하기 위함 )
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOupdateHPCUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOupdateHPCUSQL").append("\n"); 
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
		query.append("UPDATE AP_PAY_INV" ).append("\n"); 
		query.append("#if ( ${mode} == '1')" ).append("\n"); 
		query.append("SET AP_IF_DT = SYSDATE, INV_STS_CD = 'P'" ).append("\n"); 
		query.append("#else if ( ${mode} == '2')" ).append("\n"); 
		query.append("SET AP_CXL_DT = SYSDATE, INV_STS_CD = 'J'" ).append("\n"); 
		query.append("#else if ( ${mode} == '3')" ).append("\n"); 
		query.append("SET AP_PAY_DT = SYSDATE, INV_STS_CD = 'D'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("WHERE CSR_NO = @[csr_no]" ).append("\n"); 

	}
}