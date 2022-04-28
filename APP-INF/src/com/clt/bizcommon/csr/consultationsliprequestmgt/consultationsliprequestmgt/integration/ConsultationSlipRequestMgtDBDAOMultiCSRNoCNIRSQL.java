/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOMultiCSRNoCNIRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.11
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.03.11 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOMultiCSRNoCNIRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOMultiCSRNoCNIRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOMultiCSRNoCNIRSQL").append("\n"); 
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
		query.append("SELECT '05'" ).append("\n"); 
		query.append("||DECODE(" ).append("\n"); 
		query.append("(SELECT D.ACCT_CD" ).append("\n"); 
		query.append("FROM   AP_PAY_INV H" ).append("\n"); 
		query.append(", AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("WHERE  H.INV_NO          = @[inv_no]   --:inv_no" ).append("\n"); 
		query.append("AND H.VNDR_SEQ        = @[vndr_seq] --:vndr_seq" ).append("\n"); 
		query.append("AND H.DELT_FLG        = 'N'" ).append("\n"); 
		query.append("AND H.INV_SUB_SYS_CD  = 'CNI'" ).append("\n"); 
		query.append("AND H.INV_RGST_NO     = D.INV_RGST_NO" ).append("\n"); 
		query.append("AND D.DELT_FLG        = 'N')" ).append("\n"); 
		query.append(", '113321', 'P', @[csr_tp_cd])" ).append("\n"); 
		query.append("||" ).append("\n"); 
		query.append("(SELECT AP_OFC_CD" ).append("\n"); 
		query.append("FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("WHERE   OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("||" ).append("\n"); 
		query.append("(SELECT TO_CHAR(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]),'YYMMDD')" ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("||" ).append("\n"); 
		query.append("(SELECT LPAD(NVL(MAX(SUBSTR(csr_no,16,20)),0)+1,5, '0')" ).append("\n"); 
		query.append("FROM ap_csr_no" ).append("\n"); 
		query.append("WHERE SUBSTR(csr_no,1,LENGTH(csr_no)-5) =" ).append("\n"); 
		query.append("'05'" ).append("\n"); 
		query.append("||DECODE(" ).append("\n"); 
		query.append("(SELECT D.ACCT_CD" ).append("\n"); 
		query.append("FROM   AP_PAY_INV H" ).append("\n"); 
		query.append(", AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("WHERE  H.INV_NO          = @[inv_no]   --:inv_no" ).append("\n"); 
		query.append("AND H.VNDR_SEQ        = @[vndr_seq] --:vndr_seq" ).append("\n"); 
		query.append("AND H.DELT_FLG        = 'N'" ).append("\n"); 
		query.append("AND H.INV_SUB_SYS_CD  = 'CNI'" ).append("\n"); 
		query.append("AND H.INV_RGST_NO     = D.INV_RGST_NO" ).append("\n"); 
		query.append("AND D.DELT_FLG        = 'N')" ).append("\n"); 
		query.append(", '113321', 'P', @[csr_tp_cd])" ).append("\n"); 
		query.append("||" ).append("\n"); 
		query.append("(SELECT AP_OFC_CD" ).append("\n"); 
		query.append("FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("WHERE   OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("||" ).append("\n"); 
		query.append("(SELECT TO_CHAR(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]),'YYMMDD')" ).append("\n"); 
		query.append("FROM    DUAL" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append(") csr_no" ).append("\n"); 
		query.append("FROM   DUAL" ).append("\n"); 

	}
}