/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOSearchINFtoAPRSQLRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.10
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.10 함대성
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

public class ConsultationSlipRequestMgtDBDAOSearchINFtoAPRSQLRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOSearchINFtoAPRSQLRSQL(){
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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOSearchINFtoAPRSQLRSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("@[pgm_no]			                                    																			  AP_PGM_NO," ).append("\n"); 
		query.append("ROWNUM + SUBSTR(TO_CHAR(sysdate, 'YYYYMMDDHH24MISS'), 9,11)  												  				  INV_SEQ," ).append("\n"); 
		query.append("(SELECT COUNT(CSR_NO) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no]) 								  									  TTL_ROW_KNT," ).append("\n"); 
		query.append("ROWNUM                               																						  ROW_KNT," ).append("\n"); 
		query.append("A.CSR_NO                             																						  HDR_CSR_NO," ).append("\n"); 
		query.append("A.CSR_TP_CD                          																						  HDR_CSR_TP_CD," ).append("\n"); 
		query.append("A.INV_DT                             																						  HDR_INV_DT," ).append("\n"); 
		query.append("A.INV_TERM_DT                        																						  HDR_INV_TERM_DT," ).append("\n"); 
		query.append("A.GL_DT                              																						  HDR_GL_DT," ).append("\n"); 
		query.append("A.VNDR_NO                            																						  HDR_VNDR_NO," ).append("\n"); 
		query.append("A.CSR_AMT                            																						  HDR_CSR_AMT," ).append("\n"); 
		query.append("A.PAY_AMT                            																						  HDR_PAY_AMT," ).append("\n"); 
		query.append("A.PAY_DT                             																						  HDR_PAY_DT," ).append("\n"); 
		query.append("A.CSR_CURR_CD                        																						  HDR_CSR_CURR_CD," ).append("\n"); 
		query.append("A.VNDR_TERM_NM                       																						  HDR_VNDR_TERM_NM," ).append("\n"); 
		query.append("A.INV_DESC                           																						  HDR_INV_DESC," ).append("\n"); 
		query.append("A.ATTR_CATE_NM                       																						  HDR_ATTR_CATE_NM," ).append("\n"); 
		query.append("A.ATTR_CTNT1                         																						  HDR_ATTR_CTNT1," ).append("\n"); 
		query.append("A.ATTR_CTNT2                         																						  HDR_ATTR_CTNT2," ).append("\n"); 
		query.append("A.ATTR_CTNT3                         																						  HDR_ATTR_CTNT3," ).append("\n"); 
		query.append("A.ATTR_CTNT4                         																						  HDR_ATTR_CTNT4," ).append("\n"); 
		query.append("A.ATTR_CTNT5                         																						  HDR_ATTR_CTNT5," ).append("\n"); 
		query.append("A.ATTR_CTNT6                         																						  HDR_ATTR_CTNT6," ).append("\n"); 
		query.append("A.ATTR_CTNT7                         																						  HDR_ATTR_CTNT7," ).append("\n"); 
		query.append("A.ATTR_CTNT8                         									  													  HDR_ATTR_CTNT8," ).append("\n"); 
		query.append("A.ATTR_CTNT9                         																						  HDR_ATTR_CTNT9," ).append("\n"); 
		query.append("A.ATTR_CTNT10                        																						  HDR_ATTR_CTNT10," ).append("\n"); 
		query.append("A.ATTR_CTNT11                        																						  HDR_ATTR_CTNT11," ).append("\n"); 
		query.append("A.ATTR_CTNT12                        																						  HDR_ATTR_CTNT12," ).append("\n"); 
		query.append("A.ATTR_CTNT13                        																						  HDR_ATTR_CTNT13," ).append("\n"); 
		query.append("A.ATTR_CTNT14                        																						  HDR_ATTR_CTNT14," ).append("\n"); 
		query.append("A.ATTR_CTNT15                        																						  HDR_ATTR_CTNT15," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT1                     																						  HDR_GLO_ATTR_CTNT1," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT2                     																						  HDR_GLO_ATTR_CTNT2," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT3                     																						  HDR_GLO_ATTR_CTNT3," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT4                     																						  HDR_GLO_ATTR_CTNT4," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT5                     																						  HDR_GLO_ATTR_CTNT5," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT6                     																						  HDR_GLO_ATTR_CTNT6," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT7                     																						  HDR_GLO_ATTR_CTNT7," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT8                     																						  HDR_GLO_ATTR_CTNT8," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT9                     																						  HDR_GLO_ATTR_CTNT9," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT10                    																						  HDR_GLO_ATTR_CTNT10," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT11                    																						  HDR_GLO_ATTR_CTNT11," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT12                    																						  HDR_GLO_ATTR_CTNT12," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT13                    																						  HDR_GLO_ATTR_CTNT13," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT14                    																						  HDR_GLO_ATTR_CTNT14," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT15                    																						  HDR_GLO_ATTR_CTNT15," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT16                    																						  HDR_GLO_ATTR_CTNT16," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT17                    																						  HDR_GLO_ATTR_CTNT17," ).append("\n"); 
		query.append("A.GLO_ATTR_CTNT18                    																						  HDR_GLO_ATTR_CTNT18," ).append("\n"); 
		query.append("A.SRC_CTNT                           																						  HDR_SRC_CTNT," ).append("\n"); 
		query.append("A.PAY_MZD_LU_CD                      																						  HDR_PAY_MZD_LU_CD," ).append("\n"); 
		query.append("A.PAY_GRP_LU_CD                      																						  HDR_PAY_GRP_LU_CD," ).append("\n"); 
		query.append("A.COA_CO_CD                          																						  HDR_COA_CO_CD," ).append("\n"); 
		query.append("A.COA_RGN_CD                         																						  HDR_COA_RGN_CD," ).append("\n"); 
		query.append("A.COA_CTR_CD                         																						  HDR_COA_CTR_CD," ).append("\n"); 
		query.append("A.COA_ACCT_CD                        																						  HDR_COA_ACCT_CD," ).append("\n"); 
		query.append("A.COA_VVD_CD                         																						  HDR_COA_VVD_CD," ).append("\n"); 
		query.append("A.COA_INTER_CO_CD                    																						  HDR_COA_INTER_CO_CD," ).append("\n"); 
		query.append("A.COA_FTU_N1ST_CD                    																						  HDR_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("A.COA_FTU_N2ND_CD                    																						  HDR_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("A.PPD_NO                             																						  HDR_PPD_NO," ).append("\n"); 
		query.append("A.PPD_DTRB_NO                        																						  HDR_PPD_DTRB_NO," ).append("\n"); 
		query.append("A.PPD_APLY_AMT                       																						  HDR_PPD_APLY_AMT," ).append("\n"); 
		query.append("A.PPD_GL_DT                          																						  HDR_PPD_GL_DT," ).append("\n"); 
		query.append("A.APRO_FLG                           																						  HDR_APRO_FLG," ).append("\n"); 
		query.append("A.TAX_DECL_FLG                       																						  HDR_TAX_DECL_FLG," ).append("\n"); 
		query.append("A.ERR_CSR_NO                         																						  HDR_ERR_CSR_NO," ).append("\n"); 
		query.append("A.IF_FLG                             																						  HDR_IF_FLG," ).append("\n"); 
		query.append("A.IF_DT                              																						  HDR_IF_DT," ).append("\n"); 
		query.append("A.IF_ERR_RSN                         																						  HDR_IF_ERR_RSN," ).append("\n"); 
		query.append("A.PPAY_APLY_FLG                      																						  HDR_PPAY_APLY_FLG," ).append("\n"); 
		query.append("A.TJ_OFC_CD                          																						  HDR_TJ_OFC_CD," ).append("\n"); 
		query.append("A.ACT_XCH_RT                         																						  HDR_ACT_XCH_RT," ).append("\n"); 
		query.append("A.IMP_ERR_FLG                        																						  HDR_IMP_ERR_FLG," ).append("\n"); 
		query.append("A.RCV_ERR_FLG                        																						  HDR_RCV_ERR_FLG," ).append("\n"); 
		query.append("A.TAX_CURR_XCH_FLG                   																						  HDR_TAX_CURR_XCH_FLG," ).append("\n"); 
		query.append("A.USR_EML                            																						  HDR_USR_EML," ).append("\n"); 
		query.append("A.IMP_ERR_RSN                        																						  HDR_IMP_ERR_RSN," ).append("\n"); 
		query.append("A.RCV_ERR_RSN                        																						  HDR_RCV_ERR_RSN," ).append("\n"); 
		query.append("A.FTU_USE_CTNT1                      																						  HDR_FTU_USE_CTNT1," ).append("\n"); 
		query.append("A.FTU_USE_CTNT2                      																						  HDR_FTU_USE_CTNT2," ).append("\n"); 
		query.append("A.FTU_USE_CTNT3                      																						  HDR_FTU_USE_CTNT3," ).append("\n"); 
		query.append("A.FTU_USE_CTNT4                      																						  HDR_FTU_USE_CTNT4," ).append("\n"); 
		query.append("A.FTU_USE_CTNT5                      																						  HDR_FTU_USE_CTNT5," ).append("\n"); 
		query.append("B.CSR_NO                             																						  CSR_NO," ).append("\n"); 
		query.append("B.LINE_SEQ                           																						  LINE_SEQ," ).append("\n"); 
		query.append("B.LINE_NO                            																						  LINE_NO," ).append("\n"); 
		query.append("B.LINE_TP_LU_CD                      																						  LINE_TP_LU_CD," ).append("\n"); 
		query.append("B.INV_AMT                            																						  INV_AMT," ).append("\n"); 
		query.append("B.INV_DESC                           																						  INV_DESC," ).append("\n"); 
		query.append("B.INV_TAX_CD                         																						  INV_TAX_CD," ).append("\n"); 
		query.append("B.DTRB_COA_CO_CD                     																						  DTRB_COA_CO_CD," ).append("\n"); 
		query.append("B.DTRB_COA_RGN_CD                    																						  DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("B.DTRB_COA_CTR_CD                    																						  DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("B.DTRB_COA_ACCT_CD                   																						  DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("B.DTRB_COA_VVD_CD                    																						  DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("B.DTRB_COA_INTER_CO_CD               																						  DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("B.DTRB_COA_FTU_N1ST_CD               																						  DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("B.DTRB_COA_FTU_N2ND_CD               																						  DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("B.ATTR_CATE_NM                       																						  ATTR_CATE_NM," ).append("\n"); 
		query.append("B.ATTR_CTNT1                         																						  ATTR_CTNT1," ).append("\n"); 
		query.append("B.ATTR_CTNT2                         																						  ATTR_CTNT2," ).append("\n"); 
		query.append("B.ATTR_CTNT3                         																						  ATTR_CTNT3," ).append("\n"); 
		query.append("B.ATTR_CTNT4                         																						  ATTR_CTNT4," ).append("\n"); 
		query.append("B.ATTR_CTNT5                         																						  ATTR_CTNT5," ).append("\n"); 
		query.append("B.ATTR_CTNT6                         																						  ATTR_CTNT6," ).append("\n"); 
		query.append("B.ATTR_CTNT7                         																						  ATTR_CTNT7," ).append("\n"); 
		query.append("B.ATTR_CTNT8                         																						  ATTR_CTNT8," ).append("\n"); 
		query.append("B.ATTR_CTNT9                         																						  ATTR_CTNT9," ).append("\n"); 
		query.append("B.ATTR_CTNT10                        																						  ATTR_CTNT10," ).append("\n"); 
		query.append("B.ATTR_CTNT11                        																						  ATTR_CTNT11," ).append("\n"); 
		query.append("B.ATTR_CTNT12                        																						  ATTR_CTNT12," ).append("\n"); 
		query.append("B.ATTR_CTNT13                        																						  ATTR_CTNT13," ).append("\n"); 
		query.append("B.ATTR_CTNT14                        																						  ATTR_CTNT14," ).append("\n"); 
		query.append("B.ATTR_CTNT15                        																						  ATTR_CTNT15," ).append("\n"); 
		query.append("B.BKG_NO                             																						  BKG_NO," ).append("\n"); 
		query.append("B.CNTR_TPSZ_CD                       																						  CNTR_TPSZ_CD," ).append("\n"); 
		query.append("B.ACT_VVD_CD                         																						  ACT_VVD_CD," ).append("\n"); 
		query.append("B.PLN_SCTR_DIV_CD                    																						  PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("B.SO_CRR_CD                          																						  SO_CRR_CD," ).append("\n"); 
		query.append("B.YD_CD                              																						  YD_CD," ).append("\n"); 
		query.append("B.FTU_USE_CTNT1                      																						  FTU_USE_CTNT1," ).append("\n"); 
		query.append("B.FTU_USE_CTNT2                      																						  FTU_USE_CTNT2," ).append("\n"); 
		query.append("B.FTU_USE_CTNT3                      																						  FTU_USE_CTNT3," ).append("\n"); 
		query.append("B.FTU_USE_CTNT4                      																						  FTU_USE_CTNT4," ).append("\n"); 
		query.append("B.FTU_USE_CTNT5                      																						  FTU_USE_CTNT5," ).append("\n"); 
		query.append("'N'                                  																						  SND_FLG," ).append("\n"); 
		query.append("NVL(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]), SYSDATE) 																		  CRE_DT," ).append("\n"); 
		query.append("A.CRE_USR_ID                         																						  CRE_USR_ID," ).append("\n"); 
		query.append("NVL(GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]), SYSDATE)                         												  EAI_EVNT_DT" ).append("\n"); 
		query.append("FROM AP_INV_HDR A, AP_INV_DTRB B" ).append("\n"); 
		query.append("WHERE A.CSR_NO = @[csr_no] AND  A.CSR_NO = B.CSR_NO" ).append("\n"); 

	}
}