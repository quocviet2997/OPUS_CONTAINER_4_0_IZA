/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOModifyDescUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.18
*@LastModifier : 
*@LastVersion : 1.0
* 2017.07.18 
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

public class ConsultationSlipRequestMgtDBDAOModifyDescUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * 2010.10.18 김영철 [CHM-201006348-01] CSR 전표 Remark 보완 - INV_DESC 추가
	  * * 2010.10.18 김영철 [CHM-201006951-01] [VOP-PSO] 전도금 CSR내 detail 항목에 VVD 표기 요청건
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOModifyDescUSQL(){
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
		params.put("line_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dtrb_coa_acct_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOModifyDescUSQL").append("\n"); 
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
		query.append("   SET INV_DESC = INV_DESC || ( SELECT DECODE(NVL(B.INV_DESC, ''), '', '', '('||B.INV_DESC||')')" ).append("\n"); 
		query.append("								  FROM AP_PAY_INV A, AP_PAY_INV_DTL B" ).append("\n"); 
		query.append("							     WHERE A.INV_RGST_NO = B.INV_RGST_NO" ).append("\n"); 
		query.append("								   AND (A.VNDR_SEQ, A.INV_NO, B.ACCT_CD, B.INV_AMT, B.LGS_COST_CD, B.ACT_VVD_CD) IN (SELECT A.VNDR_NO, B.ATTR_CTNT1, B.DTRB_COA_ACCT_CD,B.INV_AMT, B.FTU_USE_CTNT1, B.ACT_VVD_CD" ).append("\n"); 
		query.append("								                                    FROM AP_INV_HDR A, AP_INV_DTRB B " ).append("\n"); 
		query.append("								  			                       WHERE A.CSR_NO = B.CSR_NO " ).append("\n"); 
		query.append("								  			                         AND A.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("								  			                         AND B.LINE_SEQ = @[line_seq]" ).append("\n"); 
		query.append("								  			                         AND B.LINE_NO = @[line_no] )" ).append("\n"); 
		query.append("								   AND DECODE(@[dtrb_coa_acct_cd]" ).append("\n"); 
		query.append("											 ,(SELECT C.ATTR_CTNT1 ACCT_CD " ).append("\n"); 
		query.append("												FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C " ).append("\n"); 
		query.append("											   WHERE ROWNUM=1 " ).append("\n"); 
		query.append("								  				 AND D.SRC_MDL_CD = C.SRC_MDL_CD " ).append("\n"); 
		query.append("								 				 AND D.HRD_CDG_ID = C.HRD_CDG_ID " ).append("\n"); 
		query.append("								 				 AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("								 				 AND D.HRD_CDG_ID = 'AGT_ACCT_RCV')" ).append("\n"); 
		query.append("											, A.PSO_TRNS_SLP_CTNT" ).append("\n"); 
		query.append("											, 'GO') = 'GO'" ).append("\n"); 
		query.append("								   AND A.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("								   AND B.DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("							  )" ).append("\n"); 
		query.append(" WHERE CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("   AND LINE_SEQ = @[line_seq]" ).append("\n"); 
		query.append("   AND LINE_NO = @[line_no]" ).append("\n"); 

	}
}