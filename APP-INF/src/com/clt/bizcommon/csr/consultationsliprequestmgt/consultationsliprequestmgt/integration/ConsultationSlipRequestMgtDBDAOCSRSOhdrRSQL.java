/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCSRSOhdrRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.11.13
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.13 
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

public class ConsultationSlipRequestMgtDBDAOCSRSOhdrRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCSRSOhdrRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCSRSOhdrRSQL").append("\n"); 
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
		query.append("SELECT   TO_CHAR(B.VNDR_NO, '000000') VNDR_NO" ).append("\n"); 
		query.append("       , (SELECT DECODE(VNDR_CNT_CD" ).append("\n"); 
		query.append("                      ,'JP',VNDR_LOCL_LANG_NM" ).append("\n"); 
		query.append("                      ,VNDR_LGL_ENG_NM)" ).append("\n"); 
		query.append("         FROM    MDM_VENDOR" ).append("\n"); 
		query.append("         WHERE   VNDR_SEQ =B.VNDR_NO" ).append("\n"); 
		query.append("         ) INV_DESC" ).append("\n"); 
		query.append("       , COUNT(B.CSR_NO) NO_OF_INV" ).append("\n"); 
		query.append("       , B.CSR_CURR_CD" ).append("\n"); 
		query.append("       , B.CSR_AMT" ).append("\n"); 
		query.append("       , B.ATTR_CTNT2" ).append("\n"); 
		query.append("       , TO_CHAR(MAX(B.INV_ISS_DT),'YYYY-MM-DD') ISS_DT" ).append("\n"); 
		query.append("       , TO_CHAR(MAX(B.INV_RCV_DT),'YYYY-MM-DD') RCV_DT" ).append("\n"); 
		query.append("       , B.VNDR_TERM_NM" ).append("\n"); 
		query.append("       , TO_CHAR(B.DUE_DT,'YYYY-MM-DD') DUE_DT" ).append("\n"); 
		query.append("       , B.CSR_NO" ).append("\n"); 
		query.append("       , (SELECT SO_IF_CD" ).append("\n"); 
		query.append("            FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("           WHERE OFC_CD = @[ofc_cd]) SO_IF_CD" ).append("\n"); 
		query.append("	   , '' count" ).append("\n"); 
		query.append("	   , '' ap_ofc_cd" ).append("\n"); 
		query.append("	   , '' finc_rgn_cd" ).append("\n"); 
		query.append("       , '' ap_ctr_cd" ).append("\n"); 
		query.append("	   , '' attr_ctnt1" ).append("\n"); 
		query.append("	   , '' dtrb_coa_acct_cd" ).append("\n"); 
		query.append("	   , '' dtrb_coa_vvd_cd" ).append("\n"); 
		query.append("	   , '' line_no" ).append("\n"); 
		query.append("	   , '' inv_sub_sys_cd" ).append("\n"); 
		query.append("	   , '' ofc_cd" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("         ( SELECT A.CSR_NO" ).append("\n"); 
		query.append("               , A.CSR_CURR_CD" ).append("\n"); 
		query.append("               , A.CSR_AMT" ).append("\n"); 
		query.append("               , TO_DATE(A.INV_TERM_DT,'YYYY-MM-DD') DUE_DT" ).append("\n"); 
		query.append("               , A.ATTR_CTNT2" ).append("\n"); 
		query.append("               , A.IF_ERR_RSN" ).append("\n"); 
		query.append("               , A.VNDR_NO" ).append("\n"); 
		query.append("               , A.VNDR_TERM_NM" ).append("\n"); 
		query.append("               , H.INV_ISS_DT " ).append("\n"); 
		query.append("               , H.INV_RCV_DT" ).append("\n"); 
		query.append("         FROM    AP_PAY_INV H " ).append("\n"); 
		query.append("               , AP_INV_HDR A" ).append("\n"); 
		query.append("         WHERE   1                    =1 " ).append("\n"); 
		query.append("             AND H.CSR_NO             = A.CSR_NO" ).append("\n"); 
		query.append("             AND NVL(H.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("             AND A.CSR_NO             = @[csr_no]" ).append("\n"); 
		query.append("         ) B" ).append("\n"); 
		query.append("GROUP BY B.CSR_NO" ).append("\n"); 
		query.append("       , B.CSR_CURR_CD" ).append("\n"); 
		query.append("       , B.CSR_AMT" ).append("\n"); 
		query.append("       , B.DUE_DT" ).append("\n"); 
		query.append("       , B.ATTR_CTNT2" ).append("\n"); 
		query.append("       , B.IF_ERR_RSN" ).append("\n"); 
		query.append("       , B.VNDR_NO" ).append("\n"); 
		query.append("       , B.VNDR_TERM_NM" ).append("\n"); 

	}
}