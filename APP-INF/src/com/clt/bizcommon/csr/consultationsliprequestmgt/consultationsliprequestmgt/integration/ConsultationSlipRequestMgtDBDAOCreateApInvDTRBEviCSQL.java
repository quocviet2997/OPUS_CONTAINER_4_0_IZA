/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBEviCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.07.19
*@LastModifier : 
*@LastVersion : 1.0
* 2017.07.19 
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

public class ConsultationSlipRequestMgtDBDAOCreateApInvDTRBEviCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * R4J 관련 CSR 프로그램 수정 ( DBDAO에 SQL문을 삭제하기 위함 )
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCreateApInvDTRBEviCSQL(){
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
		params.put("user_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_tax_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBEviCSQL").append("\n"); 
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
		query.append("INSERT INTO AP_INV_DTRB (											" ).append("\n"); 
		query.append("		CSR_NO, LINE_SEQ, LINE_NO, LINE_TP_LU_CD, INV_AMT,                                                    " ).append("\n"); 
		query.append("		INV_DESC, INV_TAX_CD, DTRB_COA_CO_CD, DTRB_COA_RGN_CD, DTRB_COA_CTR_CD,                               " ).append("\n"); 
		query.append("		DTRB_COA_ACCT_CD, DTRB_COA_VVD_CD, DTRB_COA_INTER_CO_CD, DTRB_COA_FTU_N1ST_CD, DTRB_COA_FTU_N2ND_CD,  " ).append("\n"); 
		query.append("		ATTR_CATE_NM, ATTR_CTNT1, ATTR_CTNT2, ATTR_CTNT3, ATTR_CTNT4,                                         " ).append("\n"); 
		query.append("		ATTR_CTNT5, ATTR_CTNT6, ATTR_CTNT7, ATTR_CTNT8, ATTR_CTNT9,                                           " ).append("\n"); 
		query.append("		ATTR_CTNT10, ATTR_CTNT11, ATTR_CTNT12, ATTR_CTNT13, ATTR_CTNT14,                                      " ).append("\n"); 
		query.append("		ATTR_CTNT15, BKG_NO, CNTR_TPSZ_CD, ACT_VVD_CD,                                                				" ).append("\n"); 
		query.append("		PLN_SCTR_DIV_CD, SO_CRR_CD, YD_CD, FTU_USE_CTNT1, FTU_USE_CTNT2,                                      " ).append("\n"); 
		query.append("		FTU_USE_CTNT3, FTU_USE_CTNT4, FTU_USE_CTNT5, CRE_DT, CRE_USR_ID,                     " ).append("\n"); 
		query.append("		EAI_EVNT_DT)			                                                                   " ).append("\n"); 
		query.append("SELECT CSR_NO,                                                           							" ).append("\n"); 
		query.append("       ( SELECT NVL(MAX(LINE_SEQ),0)+1                                                " ).append("\n"); 
		query.append("         FROM   AP_INV_DTRB                                                           " ).append("\n"); 
		query.append("         WHERE  CSR_NO = @[csr_no] ) LINE_SEQ,                                      					" ).append("\n"); 
		query.append("       ROWNUM+                                                                        " ).append("\n"); 
		query.append("       ( SELECT NVL(MAX(LINE_NO),0)                                                   " ).append("\n"); 
		query.append("         FROM   AP_INV_DTRB                                                           " ).append("\n"); 
		query.append("         WHERE  CSR_NO = @[csr_no] ) LINE_NO,                                       					" ).append("\n"); 
		query.append("       LINE_TP_LU_CD,                                                                 " ).append("\n"); 
		query.append("       CSR_AMT,                                                                       " ).append("\n"); 
		query.append("       INV_DESC,                                                                      " ).append("\n"); 
		query.append("       INV_TAX_CD,                                                                    " ).append("\n"); 
		query.append("       DTRB_COA_CO_CD,                                                                " ).append("\n"); 
		query.append("       DTRB_COA_RGN_CD,                                                               " ).append("\n"); 
		query.append("       DTRB_COA_CTR_CD,                                                               " ).append("\n"); 
		query.append("       DTRB_COA_ACCT_CD,                                                              " ).append("\n"); 
		query.append("       DTRB_COA_VVD_CD,                                                               " ).append("\n"); 
		query.append("       DTRB_COA_INTER_CO_CD,                                                          " ).append("\n"); 
		query.append("       DTRB_COA_FTU_N1ST_CD,                                                          " ).append("\n"); 
		query.append("       DTRB_COA_FTU_N2ND_CD,                                                          " ).append("\n"); 
		query.append("       ATTR_CATE_NM,                                                                  " ).append("\n"); 
		query.append("       ATTR_CTNT1,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT2,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT3,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT4,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT5,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT6,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT7,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT8,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT9,                                                                    " ).append("\n"); 
		query.append("       ATTR_CTNT10,                                                                   " ).append("\n"); 
		query.append("       ATTR_CTNT11,                                                                   " ).append("\n"); 
		query.append("       ATTR_CTNT12,                                                                   " ).append("\n"); 
		query.append("       ATTR_CTNT13,                                                                   " ).append("\n"); 
		query.append("       ATTR_CTNT14,                                                                   " ).append("\n"); 
		query.append("       ATTR_CTNT15,                                                                   " ).append("\n"); 
		query.append("       BKG_NO,                                                                        " ).append("\n"); 
		query.append("       CNTR_TPSZ_CD,                                                                  " ).append("\n"); 
		query.append("       ACT_VVD_CD,                                                                    " ).append("\n"); 
		query.append("       PLN_SCTR_DIV_CD,                                                               " ).append("\n"); 
		query.append("       SO_CRR_CD,                                                                     " ).append("\n"); 
		query.append("       YD_CD,                                                                         " ).append("\n"); 
		query.append("       FTU_USE_CTNT1,                                                                 " ).append("\n"); 
		query.append("       FTU_USE_CTNT2,                                                                 " ).append("\n"); 
		query.append("       FTU_USE_CTNT3,                                                                 " ).append("\n"); 
		query.append("       FTU_USE_CTNT4,                                                                 " ).append("\n"); 
		query.append("       FTU_USE_CNTR5,                                                                 " ).append("\n"); 
		query.append("       CRE_DT,                                                                        " ).append("\n"); 
		query.append("       CRE_USR_ID,                                                                    " ).append("\n"); 
		query.append("       EAI_EVNT_DT                                                                    " ).append("\n"); 
		query.append("FROM   ( SELECT CSR_NO,                                                               " ).append("\n"); 
		query.append("              LINE_SEQ,                                                               " ).append("\n"); 
		query.append("              LINE_NO,                                                                " ).append("\n"); 
		query.append("              LINE_TP_LU_CD,                                                          " ).append("\n"); 
		query.append("              NVL(ROUND(SUM(CSR_AMT)),0) CSR_AMT,                                     " ).append("\n"); 
		query.append("              INV_DESC,                                                               " ).append("\n"); 
		query.append("              INV_TAX_CD,                                                             " ).append("\n"); 
		query.append("              DTRB_COA_CO_CD,                                                         " ).append("\n"); 
		query.append("              DTRB_COA_RGN_CD,                                                        " ).append("\n"); 
		query.append("              DTRB_COA_CTR_CD,                                                        " ).append("\n"); 
		query.append("              DTRB_COA_ACCT_CD,                                                       " ).append("\n"); 
		query.append("              DTRB_COA_VVD_CD,                                                        " ).append("\n"); 
		query.append("              DTRB_COA_INTER_CO_CD,                                                   " ).append("\n"); 
		query.append("              DTRB_COA_FTU_N1ST_CD,                                                   " ).append("\n"); 
		query.append("              DTRB_COA_FTU_N2ND_CD,                                                   " ).append("\n"); 
		query.append("              ATTR_CATE_NM,                                                           " ).append("\n"); 
		query.append("              MAX(ATTR_CTNT1) ATTR_CTNT1,                                             " ).append("\n"); 
		query.append("              MAX(ATTR_CTNT2) ATTR_CTNT2,                                             " ).append("\n"); 
		query.append("              ATTR_CTNT3,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT4,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT5,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT6,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT7,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT8,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT9,                                                             " ).append("\n"); 
		query.append("              ATTR_CTNT10,                                                            " ).append("\n"); 
		query.append("              ATTR_CTNT11,                                                            " ).append("\n"); 
		query.append("              ATTR_CTNT12,                                                            " ).append("\n"); 
		query.append("              ATTR_CTNT13,                                                            " ).append("\n"); 
		query.append("              ATTR_CTNT14,                                                            " ).append("\n"); 
		query.append("              ATTR_CTNT15,                                                            " ).append("\n"); 
		query.append("              BKG_NO,                                                                 " ).append("\n"); 
		query.append("              CNTR_TPSZ_CD,                                                           " ).append("\n"); 
		query.append("              ACT_VVD_CD,                                                             " ).append("\n"); 
		query.append("              PLN_SCTR_DIV_CD,                                                        " ).append("\n"); 
		query.append("              SO_CRR_CD,                                                              " ).append("\n"); 
		query.append("              YD_CD,                                                                  " ).append("\n"); 
		query.append("              FTU_USE_CTNT1,                                                          " ).append("\n"); 
		query.append("              FTU_USE_CTNT2,                                                          " ).append("\n"); 
		query.append("              FTU_USE_CTNT3,                                                          " ).append("\n"); 
		query.append("              FTU_USE_CTNT4,                                                          " ).append("\n"); 
		query.append("              FTU_USE_CNTR5,                                                          " ).append("\n"); 
		query.append("              CRE_DT,                                                                 " ).append("\n"); 
		query.append("              CRE_USR_ID,                                                             " ).append("\n"); 
		query.append("              EAI_EVNT_DT                                                             " ).append("\n"); 
		query.append("       FROM   (  SELECT DISTINCT                                                      " ).append("\n"); 
		query.append("                       @[csr_no]                        CSR_NO,                     					" ).append("\n"); 
		query.append("                       ''                                           LINE_SEQ,         " ).append("\n"); 
		query.append("                       ''                                           LINE_NO,          " ).append("\n"); 
		query.append("                       'TAX'                                        LINE_TP_LU_CD,    " ).append("\n"); 
		query.append("                       NVL(H.INV_VAT_AMT,0)                         CSR_AMT,          " ).append("\n"); 
		query.append("                       ( SELECT ACCT_ENG_NM                                           " ).append("\n"); 
		query.append("                         FROM   MDM_ACCOUNT                                           " ).append("\n"); 
		query.append("                         WHERE  ACCT_CD = (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   											 FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append(" 											WHERE ROWNUM = 1" ).append("\n"); 
		query.append("   											  AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("  											  AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("  											  AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append(" 										      AND D.HRD_CDG_ID ='PREPAID_VAT_HQ') )                INV_DESC,         " ).append("\n"); 
		query.append("                       @[inv_tax_cd]                           		INV_TAX_CD,           " ).append("\n"); 
		query.append("                       '01'                                         DTRB_COA_CO_CD,   " ).append("\n"); 
		query.append("                       ( SELECT FINC_RGN_CD                                           " ).append("\n"); 
		query.append("                         FROM   MDM_ORGANIZATION                                      " ).append("\n"); 
		query.append("                         WHERE  OFC_CD = H.COST_OFC_CD )            DTRB_COA_RGN_CD,  " ).append("\n"); 
		query.append("                       ( SELECT AP_CTR_CD                                             " ).append("\n"); 
		query.append("                         FROM   MDM_ORGANIZATION                                      " ).append("\n"); 
		query.append("                         WHERE  OFC_CD = H.COST_OFC_CD )            DTRB_COA_CTR_CD,  " ).append("\n"); 
		query.append("                       (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   						  FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append(" 						 WHERE ROWNUM = 1" ).append("\n"); 
		query.append("  						   AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   						   AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append(" 						   AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("  						   AND D.HRD_CDG_ID = 'PREPAID_VAT_HQ') DTRB_COA_ACCT_CD, " ).append("\n"); 
		query.append("                       '0000000000' DTRB_COA_VVD_CD,                                  " ).append("\n"); 
		query.append("                       ( SELECT NVL(SUBS_CO_CD,'00')                                  " ).append("\n"); 
		query.append("                         FROM   MDM_VENDOR                                            " ).append("\n"); 
		query.append("                         WHERE  VNDR_SEQ = H.VNDR_SEQ )              DTRB_COA_INTER_CO_CD, " ).append("\n"); 
		query.append("                       '000000'                                      DTRB_COA_FTU_N1ST_CD, " ).append("\n"); 
		query.append("                       '000000'                                      DTRB_COA_FTU_N2ND_CD, " ).append("\n"); 
		query.append("					   (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   						  FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append(" 						 WHERE ROWNUM = 1" ).append("\n"); 
		query.append("  						   AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   						   AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append(" 						   AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("  						   AND D.HRD_CDG_ID = 'PREPAID_VAT_HQ') ATTR_CATE_NM,         " ).append("\n"); 
		query.append("                       H.INV_NO                                      ATTR_CTNT1,           " ).append("\n"); 
		query.append("                       TO_CHAR(H.INV_ISS_DT,'YYYY/MM/DD HH24:MI:SS') ATTR_CTNT2,           " ).append("\n"); 
		query.append("                       D.PORT_CD                                     ATTR_CTNT3,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT4,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT5,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT6,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT7,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT8,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT9,           " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT10,          " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT11,          " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT12,          " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT13,          " ).append("\n"); 
		query.append("                       NULL                                          ATTR_CTNT14,          " ).append("\n"); 
		query.append("                       TO_CHAR(SYSDATE, 'YYYY/MM/DD')                ATTR_CTNT15,          " ).append("\n"); 
		query.append("                       NULL                                          BKG_NO,               " ).append("\n"); 
		query.append("                       NULL                                          CNTR_TPSZ_CD,         " ).append("\n"); 
		query.append("                       NULL                                          ACT_VVD_CD,           " ).append("\n"); 
		query.append("                       'C'                                           PLN_SCTR_DIV_CD,      " ).append("\n"); 
		query.append("                       NULL                                          SO_CRR_CD,            " ).append("\n"); 
		query.append("                       D.YD_CD                                       YD_CD,                " ).append("\n"); 
		query.append("                       NULL                                          FTU_USE_CTNT1,        " ).append("\n"); 
		query.append("                       NULL                                          FTU_USE_CTNT2,        " ).append("\n"); 
		query.append("                       NULL                                          FTU_USE_CTNT3,        " ).append("\n"); 
		query.append("                       NULL                                          FTU_USE_CTNT4,        " ).append("\n"); 
		query.append("                       NULL                                          FTU_USE_CNTR5,        " ).append("\n"); 
		query.append("                       GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])  CRE_DT,                 " ).append("\n"); 
		query.append("                       @[user_id]                          			 CRE_USR_ID,               " ).append("\n"); 
		query.append("                       ''                                            EAI_EVNT_DT           " ).append("\n"); 
		query.append("                FROM   AP_PAY_INV H, AP_PAY_INV_DTL D                                      " ).append("\n"); 
		query.append("               WHERE   H.INV_NO      IN    ( @[inv_no] )    " ).append("\n"); 
		query.append("                AND    H.VNDR_SEQ    = @[vndr_seq]                                                   " ).append("\n"); 
		query.append("                AND    H.DELT_FLG    = 'N'                                                 " ).append("\n"); 
		query.append("                AND    H.INV_RGST_NO = D.INV_RGST_NO                                       " ).append("\n"); 
		query.append("                AND    D.DELT_FLG    = 'N'                                                 " ).append("\n"); 
		query.append("                AND    NVL(H.INV_SUB_SYS_CD,'N') <> 'TLL' )                                " ).append("\n"); 
		query.append("       GROUP BY CSR_NO,                                                                    " ).append("\n"); 
		query.append("                LINE_SEQ,                                                                  " ).append("\n"); 
		query.append("                LINE_NO,                                                                   " ).append("\n"); 
		query.append("                LINE_TP_LU_CD,                                                             " ).append("\n"); 
		query.append("                INV_DESC,                                                                  " ).append("\n"); 
		query.append("                INV_TAX_CD,                                                                " ).append("\n"); 
		query.append("                DTRB_COA_CO_CD,                                                            " ).append("\n"); 
		query.append("                DTRB_COA_RGN_CD,                                                           " ).append("\n"); 
		query.append("                DTRB_COA_CTR_CD,                                                           " ).append("\n"); 
		query.append("                DTRB_COA_ACCT_CD,                                                          " ).append("\n"); 
		query.append("                DTRB_COA_VVD_CD,                                                           " ).append("\n"); 
		query.append("                DTRB_COA_INTER_CO_CD,                                                      " ).append("\n"); 
		query.append("                DTRB_COA_FTU_N1ST_CD,                                                      " ).append("\n"); 
		query.append("                DTRB_COA_FTU_N2ND_CD,                                                      " ).append("\n"); 
		query.append("                ATTR_CATE_NM,                                                              " ).append("\n"); 
		query.append("                ATTR_CTNT3,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT4,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT5,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT6,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT7,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT8,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT9,                                                                " ).append("\n"); 
		query.append("                ATTR_CTNT10,                                                               " ).append("\n"); 
		query.append("                ATTR_CTNT11,                                                               " ).append("\n"); 
		query.append("                ATTR_CTNT12,                                                               " ).append("\n"); 
		query.append("                ATTR_CTNT13,                                                               " ).append("\n"); 
		query.append("                ATTR_CTNT14,                                                               " ).append("\n"); 
		query.append("                ATTR_CTNT15,                                                               " ).append("\n"); 
		query.append("                BKG_NO,                                                                    " ).append("\n"); 
		query.append("                CNTR_TPSZ_CD,                                                              " ).append("\n"); 
		query.append("                ACT_VVD_CD,                                                                " ).append("\n"); 
		query.append("                PLN_SCTR_DIV_CD,                                                           " ).append("\n"); 
		query.append("                SO_CRR_CD,                                                                 " ).append("\n"); 
		query.append("                YD_CD,                                                                     " ).append("\n"); 
		query.append("                FTU_USE_CTNT1,                                                             " ).append("\n"); 
		query.append("                FTU_USE_CTNT2,                                                             " ).append("\n"); 
		query.append("                FTU_USE_CTNT3,                                                             " ).append("\n"); 
		query.append("                FTU_USE_CTNT4,                                                             " ).append("\n"); 
		query.append("                FTU_USE_CNTR5,                                                             " ).append("\n"); 
		query.append("                CRE_DT,                                                                    " ).append("\n"); 
		query.append("                CRE_USR_ID,                                                                " ).append("\n"); 
		query.append("                EAI_EVNT_DT )" ).append("\n"); 

	}
}