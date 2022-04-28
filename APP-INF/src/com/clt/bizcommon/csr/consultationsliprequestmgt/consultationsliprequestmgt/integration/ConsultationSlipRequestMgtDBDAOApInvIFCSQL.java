/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOApInvIFCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.28
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.08.28 함대성
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

public class ConsultationSlipRequestMgtDBDAOApInvIFCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOApInvIFCSQL(){
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
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOApInvIFCSQL").append("\n"); 
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
		query.append("INSERT INTO AP_INV_IF (" ).append("\n"); 
		query.append("AP_PGM_NO," ).append("\n"); 
		query.append("INV_SEQ," ).append("\n"); 
		query.append("TTL_ROW_KNT," ).append("\n"); 
		query.append("ROW_KNT," ).append("\n"); 
		query.append("HDR_CSR_NO," ).append("\n"); 
		query.append("HDR_CSR_TP_CD," ).append("\n"); 
		query.append("HDR_INV_DT," ).append("\n"); 
		query.append("HDR_INV_TERM_DT," ).append("\n"); 
		query.append("HDR_GL_DT," ).append("\n"); 
		query.append("HDR_VNDR_NO," ).append("\n"); 
		query.append("HDR_CSR_AMT," ).append("\n"); 
		query.append("HDR_PAY_AMT," ).append("\n"); 
		query.append("HDR_PAY_DT," ).append("\n"); 
		query.append("HDR_CSR_CURR_CD," ).append("\n"); 
		query.append("HDR_VNDR_TERM_NM," ).append("\n"); 
		query.append("HDR_INV_DESC," ).append("\n"); 
		query.append("HDR_ATTR_CATE_NM," ).append("\n"); 
		query.append("HDR_ATTR_CTNT1," ).append("\n"); 
		query.append("HDR_ATTR_CTNT2," ).append("\n"); 
		query.append("HDR_ATTR_CTNT3," ).append("\n"); 
		query.append("HDR_ATTR_CTNT4," ).append("\n"); 
		query.append("HDR_ATTR_CTNT5," ).append("\n"); 
		query.append("HDR_ATTR_CTNT6," ).append("\n"); 
		query.append("HDR_ATTR_CTNT7," ).append("\n"); 
		query.append("HDR_ATTR_CTNT8," ).append("\n"); 
		query.append("HDR_ATTR_CTNT9," ).append("\n"); 
		query.append("HDR_ATTR_CTNT10," ).append("\n"); 
		query.append("HDR_ATTR_CTNT11," ).append("\n"); 
		query.append("HDR_ATTR_CTNT12," ).append("\n"); 
		query.append("HDR_ATTR_CTNT13," ).append("\n"); 
		query.append("HDR_ATTR_CTNT14," ).append("\n"); 
		query.append("HDR_ATTR_CTNT15," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT1," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT2," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT3," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT4," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT5," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT6," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT7," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT8," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT9," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT10," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT11," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT12," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT13," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT14," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT15," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT16," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT17," ).append("\n"); 
		query.append("HDR_GLO_ATTR_CTNT18," ).append("\n"); 
		query.append("HDR_SRC_CTNT," ).append("\n"); 
		query.append("HDR_PAY_MZD_LU_CD," ).append("\n"); 
		query.append("HDR_PAY_GRP_LU_CD," ).append("\n"); 
		query.append("HDR_COA_CO_CD," ).append("\n"); 
		query.append("HDR_COA_RGN_CD," ).append("\n"); 
		query.append("HDR_COA_CTR_CD," ).append("\n"); 
		query.append("HDR_COA_ACCT_CD," ).append("\n"); 
		query.append("HDR_COA_VVD_CD," ).append("\n"); 
		query.append("HDR_COA_INTER_CO_CD," ).append("\n"); 
		query.append("HDR_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("HDR_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("HDR_PPD_NO," ).append("\n"); 
		query.append("HDR_PPD_DTRB_NO," ).append("\n"); 
		query.append("HDR_PPD_APLY_AMT," ).append("\n"); 
		query.append("HDR_PPD_GL_DT," ).append("\n"); 
		query.append("HDR_APRO_FLG," ).append("\n"); 
		query.append("HDR_TAX_DECL_FLG," ).append("\n"); 
		query.append("HDR_ERR_CSR_NO," ).append("\n"); 
		query.append("HDR_IF_FLG," ).append("\n"); 
		query.append("HDR_IF_DT," ).append("\n"); 
		query.append("HDR_IF_ERR_RSN," ).append("\n"); 
		query.append("HDR_PPAY_APLY_FLG," ).append("\n"); 
		query.append("HDR_TJ_OFC_CD," ).append("\n"); 
		query.append("HDR_ACT_XCH_RT," ).append("\n"); 
		query.append("HDR_IMP_ERR_FLG," ).append("\n"); 
		query.append("HDR_RCV_ERR_FLG," ).append("\n"); 
		query.append("HDR_TAX_CURR_XCH_FLG," ).append("\n"); 
		query.append("HDR_USR_EML," ).append("\n"); 
		query.append("HDR_IMP_ERR_RSN," ).append("\n"); 
		query.append("HDR_RCV_ERR_RSN," ).append("\n"); 
		query.append("HDR_FTU_USE_CTNT1," ).append("\n"); 
		query.append("HDR_FTU_USE_CTNT2," ).append("\n"); 
		query.append("HDR_FTU_USE_CTNT3," ).append("\n"); 
		query.append("HDR_FTU_USE_CTNT4," ).append("\n"); 
		query.append("HDR_FTU_USE_CTNT5," ).append("\n"); 
		query.append("CSR_NO," ).append("\n"); 
		query.append("LINE_SEQ," ).append("\n"); 
		query.append("LINE_NO," ).append("\n"); 
		query.append("LINE_TP_LU_CD," ).append("\n"); 
		query.append("INV_AMT," ).append("\n"); 
		query.append("INV_DESC," ).append("\n"); 
		query.append("INV_TAX_CD," ).append("\n"); 
		query.append("DTRB_COA_CO_CD," ).append("\n"); 
		query.append("DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("ATTR_CATE_NM," ).append("\n"); 
		query.append("ATTR_CTNT1," ).append("\n"); 
		query.append("ATTR_CTNT2," ).append("\n"); 
		query.append("ATTR_CTNT3," ).append("\n"); 
		query.append("ATTR_CTNT4," ).append("\n"); 
		query.append("ATTR_CTNT5," ).append("\n"); 
		query.append("ATTR_CTNT6," ).append("\n"); 
		query.append("ATTR_CTNT7," ).append("\n"); 
		query.append("ATTR_CTNT8," ).append("\n"); 
		query.append("ATTR_CTNT9," ).append("\n"); 
		query.append("ATTR_CTNT10," ).append("\n"); 
		query.append("ATTR_CTNT11," ).append("\n"); 
		query.append("ATTR_CTNT12," ).append("\n"); 
		query.append("ATTR_CTNT13," ).append("\n"); 
		query.append("ATTR_CTNT14," ).append("\n"); 
		query.append("ATTR_CTNT15," ).append("\n"); 
		query.append("BKG_NO," ).append("\n"); 
		query.append("CNTR_TPSZ_CD," ).append("\n"); 
		query.append("ACT_VVD_CD," ).append("\n"); 
		query.append("PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("SO_CRR_CD," ).append("\n"); 
		query.append("YD_CD," ).append("\n"); 
		query.append("FTU_USE_CTNT1," ).append("\n"); 
		query.append("FTU_USE_CTNT2," ).append("\n"); 
		query.append("FTU_USE_CTNT3," ).append("\n"); 
		query.append("FTU_USE_CTNT4," ).append("\n"); 
		query.append("FTU_USE_CTNT5," ).append("\n"); 
		query.append("SND_FLG," ).append("\n"); 
		query.append("CRE_DT," ).append("\n"); 
		query.append("CRE_USR_ID," ).append("\n"); 
		query.append("EAI_EVNT_DT" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("@[pgm_no]                                    ," ).append("\n"); 
		query.append("ROWNUM + (SELECT NVL(MAX(INV_SEQ),0) FROM AP_INV_IF WHERE AP_PGM_NO = @[pgm_no]) ," ).append("\n"); 
		query.append("(SELECT COUNT(CSR_NO) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no]) ," ).append("\n"); 
		query.append("ROWNUM                               ," ).append("\n"); 
		query.append("A.CSR_NO                             ," ).append("\n"); 
		query.append("A.CSR_TP_CD                          ," ).append("\n"); 
		query.append("A.INV_DT                             ," ).append("\n"); 
		query.append("A.INV_TERM_DT                        ," ).append("\n"); 
		query.append("A.GL_DT                              ," ).append("\n"); 
		query.append("A.VNDR_NO                            ," ).append("\n"); 
		query.append("A.CSR_AMT                            ," ).append("\n"); 
		query.append("A.PAY_AMT                            ," ).append("\n"); 
		query.append("A.PAY_DT                             ," ).append("\n"); 
		query.append("A.CSR_CURR_CD                        ," ).append("\n"); 
		query.append("A.VNDR_TERM_NM                       ," ).append("\n"); 
		query.append("A.INV_DESC                           ," ).append("\n"); 
		query.append("A.ATTR_CATE_NM                       ," ).append("\n"); 
		query.append("A.ATTR_CTNT1                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT2                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT3                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT4                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT5                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT6                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT7                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT8                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT9                         ," ).append("\n"); 
		query.append("A.ATTR_CTNT10                        ," ).append("\n"); 
		query.append("A.ATTR_CTNT11                        ," ).append("\n"); 
		query.append("A.ATTR_CTNT12                        ," ).append("\n"); 
		query.append("A.ATTR_CTNT13                        ," ).append("\n"); 
		query.append("A.ATTR_CTNT14                        ," ).append("\n"); 
		query.append("A.ATTR_CTNT15                        ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT1                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT2                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT3                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT4                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT5                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT6                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT7                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT8                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT9                     ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT10                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT11                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT12                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT13                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT14                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT15                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT16                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT17                    ," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT18                    ," ).append("\n"); 
		query.append("A.SRC_CTNT                           ," ).append("\n"); 
		query.append("A.PAY_MZD_LU_CD                      ," ).append("\n"); 
		query.append("A.PAY_GRP_LU_CD                      ," ).append("\n"); 
		query.append("A.COA_CO_CD                          ," ).append("\n"); 
		query.append("A.COA_RGN_CD                         ," ).append("\n"); 
		query.append("A.COA_CTR_CD                         ," ).append("\n"); 
		query.append("A.COA_ACCT_CD                        ," ).append("\n"); 
		query.append("A.COA_VVD_CD                         ," ).append("\n"); 
		query.append("A.COA_INTER_CO_CD                    ," ).append("\n"); 
		query.append("A.COA_FTU_N1ST_CD                    ," ).append("\n"); 
		query.append("A.COA_FTU_N2ND_CD                    ," ).append("\n"); 
		query.append("A.PPD_NO                             ," ).append("\n"); 
		query.append("A.PPD_DTRB_NO                        ," ).append("\n"); 
		query.append("A.PPD_APLY_AMT                       ," ).append("\n"); 
		query.append("A.PPD_GL_DT                          ," ).append("\n"); 
		query.append("A.APRO_FLG                           ," ).append("\n"); 
		query.append("A.TAX_DECL_FLG                       ," ).append("\n"); 
		query.append("A.ERR_CSR_NO                         ," ).append("\n"); 
		query.append("A.IF_FLG                             ," ).append("\n"); 
		query.append("A.IF_DT                              ," ).append("\n"); 
		query.append("A.IF_ERR_RSN                         ," ).append("\n"); 
		query.append("A.PPAY_APLY_FLG                      ," ).append("\n"); 
		query.append("A.TJ_OFC_CD                          ," ).append("\n"); 
		query.append("A.ACT_XCH_RT                         ," ).append("\n"); 
		query.append("A.IMP_ERR_FLG                        ," ).append("\n"); 
		query.append("A.RCV_ERR_FLG                        ," ).append("\n"); 
		query.append("A.TAX_CURR_XCH_FLG                   ," ).append("\n"); 
		query.append("A.USR_EML                            ," ).append("\n"); 
		query.append("A.IMP_ERR_RSN                        ," ).append("\n"); 
		query.append("A.RCV_ERR_RSN                        ," ).append("\n"); 
		query.append("A.FTU_USE_CTNT1                      ," ).append("\n"); 
		query.append("A.FTU_USE_CTNT2                      ," ).append("\n"); 
		query.append("A.FTU_USE_CTNT3                      ," ).append("\n"); 
		query.append("A.FTU_USE_CTNT4                      ," ).append("\n"); 
		query.append("A.FTU_USE_CTNT5                      ," ).append("\n"); 
		query.append("B.CSR_NO                             ," ).append("\n"); 
		query.append("B.LINE_SEQ                           ," ).append("\n"); 
		query.append("B.LINE_NO                            ," ).append("\n"); 
		query.append("B.LINE_TP_LU_CD                      ," ).append("\n"); 
		query.append("B.INV_AMT                            ," ).append("\n"); 
		query.append("B.INV_DESC                           ," ).append("\n"); 
		query.append("B.INV_TAX_CD                         ," ).append("\n"); 
		query.append("B.DTRB_COA_CO_CD                     ," ).append("\n"); 
		query.append("B.DTRB_COA_RGN_CD                    ," ).append("\n"); 
		query.append("B.DTRB_COA_CTR_CD                    ," ).append("\n"); 
		query.append("B.DTRB_COA_ACCT_CD                   ," ).append("\n"); 
		query.append("B.DTRB_COA_VVD_CD                    ," ).append("\n"); 
		query.append("B.DTRB_COA_INTER_CO_CD               ," ).append("\n"); 
		query.append("B.DTRB_COA_FTU_N1ST_CD               ," ).append("\n"); 
		query.append("B.DTRB_COA_FTU_N2ND_CD               ," ).append("\n"); 
		query.append("B.ATTR_CATE_NM                       ," ).append("\n"); 
		query.append("B.ATTR_CTNT1                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT2                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT3                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT4                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT5                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT6                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT7                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT8                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT9                         ," ).append("\n"); 
		query.append("B.ATTR_CTNT10                        ," ).append("\n"); 
		query.append("B.ATTR_CTNT11                        ," ).append("\n"); 
		query.append("B.ATTR_CTNT12                        ," ).append("\n"); 
		query.append("B.ATTR_CTNT13                        ," ).append("\n"); 
		query.append("B.ATTR_CTNT14                        ," ).append("\n"); 
		query.append("B.ATTR_CTNT15                        ," ).append("\n"); 
		query.append("B.BKG_NO                             ," ).append("\n"); 
		query.append("B.CNTR_TPSZ_CD                       ," ).append("\n"); 
		query.append("B.ACT_VVD_CD                         ," ).append("\n"); 
		query.append("B.PLN_SCTR_DIV_CD                    ," ).append("\n"); 
		query.append("B.SO_CRR_CD                          ," ).append("\n"); 
		query.append("B.YD_CD                              ," ).append("\n"); 
		query.append("B.FTU_USE_CTNT1                      ," ).append("\n"); 
		query.append("B.FTU_USE_CTNT2                      ," ).append("\n"); 
		query.append("B.FTU_USE_CTNT3                      ," ).append("\n"); 
		query.append("B.FTU_USE_CTNT4                      ," ).append("\n"); 
		query.append("B.FTU_USE_CTNT5                      ," ).append("\n"); 
		query.append("'N'                                  ," ).append("\n"); 
		query.append("NVL(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]), SYSDATE) ," ).append("\n"); 
		query.append("A.CRE_USR_ID                         ," ).append("\n"); 
		query.append("NVL(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]), SYSDATE)" ).append("\n"); 
		query.append("FROM AP_INV_HDR A, AP_INV_DTRB B" ).append("\n"); 
		query.append("WHERE A.CSR_NO = @[csr_no] AND  A.CSR_NO = B.CSR_NO" ).append("\n"); 

	}
}