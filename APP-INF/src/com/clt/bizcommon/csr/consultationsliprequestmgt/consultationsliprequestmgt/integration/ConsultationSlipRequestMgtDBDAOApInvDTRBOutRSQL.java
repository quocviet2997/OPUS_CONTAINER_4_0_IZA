/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOApInvDTRBOutRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.30
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.30 
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

public class ConsultationSlipRequestMgtDBDAOApInvDTRBOutRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOApInvDTRBOutRSQL(){
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
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_use_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOApInvDTRBOutRSQL").append("\n"); 
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
		query.append("SELECT LINE_SEQ," ).append("\n"); 
		query.append("       ROWNUM LINE_NO," ).append("\n"); 
		query.append("       LINE_TP_LU_CD," ).append("\n"); 
		query.append("       CSR_AMT," ).append("\n"); 
		query.append("       INV_DESC," ).append("\n"); 
		query.append("       INV_TAX_CD," ).append("\n"); 
		query.append("       DTRB_COA_CO_CD," ).append("\n"); 
		query.append("       DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("       DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("       DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("       DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("       DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("       DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("       DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("       ATTR_CATE_NM," ).append("\n"); 
		query.append("       ATTR_CTNT1," ).append("\n"); 
		query.append("       ATTR_CTNT2," ).append("\n"); 
		query.append("       ATTR_CTNT3," ).append("\n"); 
		query.append("       ATTR_CTNT4," ).append("\n"); 
		query.append("       ATTR_CTNT5," ).append("\n"); 
		query.append("       SAC_TRUNK_VVD_RLANE_FNC(BKG_NO) ATTR_CTNT6," ).append("\n"); 
		query.append("       SAC_TRUNK_VVD_TRD_FNC(BKG_NO) ATTR_CTNT7," ).append("\n"); 
		query.append("       ATTR_CTNT8," ).append("\n"); 
		query.append("       ATTR_CTNT9," ).append("\n"); 
		query.append("       --SAC_TRUNK_VVD_SUB_TRD_FNC(BKG_NO) ATTR_CTNT10," ).append("\n"); 
		query.append("        CASE " ).append("\n"); 
		query.append("        WHEN BKG_NO IS NOT NULL" ).append("\n"); 
		query.append("        THEN SAC_TRUNK_VVD_SUB_TRD_FNC(BKG_NO)" ).append("\n"); 
		query.append("        WHEN ACT_VVD_CD IS NOT NULL" ).append("\n"); 
		query.append("        THEN SAC_NO_BKG_SUB_TRD_FNC(ATTR_CTNT14,(SELECT AP_OFC_CD FROM MDM_ORGANIZATION WHERE OFC_CD = @[ofc_cd] AND ROWNUM = 1),SUBSTR(ACT_VVD_CD,-1))" ).append("\n"); 
		query.append("        END ATTR_CTNT10, " ).append("\n"); 
		query.append("       ATTR_CTNT11," ).append("\n"); 
		query.append("       ATTR_CTNT12," ).append("\n"); 
		query.append("       --SAC_TRUNK_VVD_DOMI_FLG_FNC(BKG_NO) ATTR_CTNT13," ).append("\n"); 
		query.append("        CASE " ).append("\n"); 
		query.append("        WHEN BKG_NO IS NOT NULL" ).append("\n"); 
		query.append("        THEN SAC_TRUNK_VVD_DOMI_FLG_FNC(BKG_NO)" ).append("\n"); 
		query.append("        WHEN ACT_VVD_CD IS NOT NULL" ).append("\n"); 
		query.append("        THEN SAC_NO_BKG_DOMI_FLG_FNC(ATTR_CTNT14,(SELECT AP_OFC_CD FROM MDM_ORGANIZATION WHERE OFC_CD = @[ofc_cd] AND ROWNUM = 1),SUBSTR(ACT_VVD_CD,-1))" ).append("\n"); 
		query.append("        END ATTR_CTNT13, " ).append("\n"); 
		query.append("       ATTR_CTNT14," ).append("\n"); 
		query.append("       ATTR_CTNT15," ).append("\n"); 
		query.append("       BKG_NO," ).append("\n"); 
		query.append("       CNTR_TPSZ_CD," ).append("\n"); 
		query.append("       ACT_VVD_CD," ).append("\n"); 
		query.append("       PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("       SO_CRR_CD," ).append("\n"); 
		query.append("       YD_CD," ).append("\n"); 
		query.append("       FTU_USE_CTNT1," ).append("\n"); 
		query.append("       FTU_USE_CTNT2," ).append("\n"); 
		query.append("       FTU_USE_CTNT3," ).append("\n"); 
		query.append("       FTU_USE_CTNT4," ).append("\n"); 
		query.append("       FTU_USE_CNTR5," ).append("\n"); 
		query.append("       TO_CHAR(CRE_DT, 'YYYY/MM/DD HH24:MI:SS') CRE_DT," ).append("\n"); 
		query.append("       CRE_USR_ID," ).append("\n"); 
		query.append("       EAI_EVNT_DT" ).append("\n"); 
		query.append("       , STL_KEY_NO" ).append("\n"); 
		query.append("       , OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("FROM   ( SELECT @[line_seq] LINE_SEQ," ).append("\n"); 
		query.append("                'ITEM' LINE_TP_LU_CD," ).append("\n"); 
		query.append("                DECODE(INV_CURR_CD," ).append("\n"); 
		query.append("                       'JPY',ROUND(SUM(INV_AMT))," ).append("\n"); 
		query.append("                             ROUND(SUM(INV_AMT),2)) CSR_AMT," ).append("\n"); 
		query.append("                INV_DESC," ).append("\n"); 
		query.append("                NULL INV_TAX_CD," ).append("\n"); 
		query.append("                '01' DTRB_COA_CO_CD," ).append("\n"); 
		query.append("                DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("                DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("                DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("                DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("                DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("                '000000' DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("                '000000' DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("                ATTR_CATE_NM," ).append("\n"); 
		query.append("                ATTR_CTNT1," ).append("\n"); 
		query.append("                ATTR_CTNT2," ).append("\n"); 
		query.append("                ATTR_CTNT3," ).append("\n"); 
		query.append("                NULL ATTR_CTNT4," ).append("\n"); 
		query.append("                NULL ATTR_CTNT5," ).append("\n"); 
		query.append("                NULL ATTR_CTNT6," ).append("\n"); 
		query.append("                NULL ATTR_CTNT7," ).append("\n"); 
		query.append("                ATTR_CTNT8," ).append("\n"); 
		query.append("                ATTR_CTNT9," ).append("\n"); 
		query.append("                NULL ATTR_CTNT10," ).append("\n"); 
		query.append("                ATTR_CTNT11," ).append("\n"); 
		query.append("                ATTR_CTNT12," ).append("\n"); 
		query.append("                NULL ATTR_CTNT13," ).append("\n"); 
		query.append("                ATTR_CTNT14," ).append("\n"); 
		query.append("                TO_CHAR(SYSDATE, 'YYYY/MM/DD') ATTR_CTNT15," ).append("\n"); 
		query.append("                NULL BKG_NO," ).append("\n"); 
		query.append("                CNTR_TPSZ_CD," ).append("\n"); 
		query.append("                ACT_VVD_CD," ).append("\n"); 
		query.append("                PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("                SO_CRR_CD," ).append("\n"); 
		query.append("                YD_CD," ).append("\n"); 
		query.append("                FTU_USE_CTNT1," ).append("\n"); 
		query.append("                FTU_USE_CTNT2," ).append("\n"); 
		query.append("                NULL FTU_USE_CTNT3," ).append("\n"); 
		query.append("                NULL FTU_USE_CTNT4," ).append("\n"); 
		query.append("                NULL FTU_USE_CNTR5," ).append("\n"); 
		query.append("                GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]) CRE_DT," ).append("\n"); 
		query.append("                @[cre_usr_id] CRE_USR_ID," ).append("\n"); 
		query.append("                NULL EAI_EVNT_DT" ).append("\n"); 
		query.append("                , STL_KEY_NO" ).append("\n"); 
		query.append("                , OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("         FROM   ( SELECT DECODE(H.INV_SUB_SYS_CD,'TLL',NVL(D.VSL_CD||D.SKD_VOY_NO||D.SKD_DIR_CD" ).append("\n"); 
		query.append("                                                           ||D.REV_DIR_CD, '0000000000')," ).append("\n"); 
		query.append("                           ( SELECT ACCT_ENG_NM" ).append("\n"); 
		query.append("                             FROM   MDM_ACCOUNT" ).append("\n"); 
		query.append("                             WHERE  ACCT_CD = DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("												   ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER')" ).append("\n"); 
		query.append("												   ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','LEGY_SYS_CLEARING')" ).append("\n"); 
		query.append("												   ,D.ACCT_CD) ) )   INV_DESC," ).append("\n"); 
		query.append("                         D.INV_AMT                                                                INV_AMT," ).append("\n"); 
		query.append("                         ( SELECT FINC_RGN_CD" ).append("\n"); 
		query.append("                           FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                           WHERE  OFC_CD = H.COST_OFC_CD )                                        DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("                         ( SELECT AP_CTR_CD" ).append("\n"); 
		query.append("                           FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                           WHERE  OFC_CD = H.COST_OFC_CD )                                        DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER')" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','LEGY_SYS_CLEARING')" ).append("\n"); 
		query.append("							  ,D.ACCT_CD)														  DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("                         DECODE(DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("									 ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER')" ).append("\n"); 
		query.append("									 ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','LEGY_SYS_CLEARING')" ).append("\n"); 
		query.append("									 ,D.ACCT_CD)" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','LEGY_SYS_CLEARING'),'0000000000'" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','BANK_CMMS'),'0000000000'" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','UNADJT_SUSPS_DBT_EQ'),'0000000000'" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','UNADJT_SUSPS_DBT_CG'),'0000000000'," ).append("\n"); 
		query.append("                                NVL(D.VSL_CD" ).append("\n"); 
		query.append("                                    ||D.SKD_VOY_NO" ).append("\n"); 
		query.append("                                    ||D.SKD_DIR_CD" ).append("\n"); 
		query.append("                                    ||D.REV_DIR_CD, '0000000000'))                                DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("                         ( SELECT NVL(SUBS_CO_CD,'00')" ).append("\n"); 
		query.append("                           FROM   MDM_VENDOR" ).append("\n"); 
		query.append("                           WHERE  VNDR_SEQ = H.VNDR_SEQ )                                         DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER')" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','LEGY_SYS_CLEARING')" ).append("\n"); 
		query.append("							  ,D.ACCT_CD)                             					          ATTR_CATE_NM," ).append("\n"); 
		query.append("                         H.INV_NO                                                                 ATTR_CTNT1," ).append("\n"); 
		query.append("                         TO_CHAR(H.INV_ISS_DT,'YYYY/MM/DD HH24:MI:SS')                            ATTR_CTNT2," ).append("\n"); 
		query.append("                         NVL(D.PORT_CD, ( SELECT LOC_CD" ).append("\n"); 
		query.append("												    								FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("												   								 WHERE OFC_CD = H.COST_OFC_CD ))         							  ATTR_CTNT3," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','UNADJT_SUSPS_DBT_EQ'),H.INV_RMK,NULL)                                ATTR_CTNT8," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','UNADJT_SUSPS_DBT_EQ'),H.INV_NO,NULL)                                 ATTR_CTNT9," ).append("\n"); 
		query.append("                         D.ACT_DT                                                                 ATTR_CTNT11,--ACTIVITY DATE" ).append("\n"); 
		query.append("                         D.ACT_PLC                                                                ATTR_CTNT12,--ACTIVITY PLACE" ).append("\n"); 
		query.append("                         NVL(D.SLAN_CD, (SELECT SLAN_CD FROM AR_MST_REV_VVD WHERE VSL_CD = D.VSL_CD " ).append("\n"); 
		query.append("                                         AND SKD_VOY_NO = D.SKD_VOY_NO AND SKD_DIR_CD = D.SKD_DIR_CD" ).append("\n"); 
		query.append("                                         AND RLANE_DIR_CD = D.REV_DIR_CD))                        ATTR_CTNT14,--SERVICE LANE" ).append("\n"); 
		query.append("                         D.CNTR_TPSZ_CD                                                           CNTR_TPSZ_CD," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER'),NULL" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','LEGY_SYS_CLEARING'),NULL" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','BANK_CMMS'),NULL" ).append("\n"); 
		query.append("							  ,D.ACT_VVD_CD) ACT_VVD_CD," ).append("\n"); 
		query.append("                         'C'                                                                      PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("                         NULL                                                                     SO_CRR_CD," ).append("\n"); 
		query.append("                         D.YD_CD                                                                  YD_CD," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER'),NULL,D.LGS_COST_CD)                            FTU_USE_CTNT1," ).append("\n"); 
		query.append("                         DECODE(D.ACCT_CD" ).append("\n"); 
		query.append("							  ,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','ACCT_RCV_JNT_OPER'),NULL" ).append("\n"); 
		query.append("							  ,DECODE(H.INV_SUB_SYS_CD,'PSO',NULL" ).append("\n"); 
		query.append("							  ,TO_CHAR(D.SO_20FT_QTY+D.SO_40FT_QTY+D.SO_TEU_QTY+D.SO_UT_QTY)))   FTU_USE_CTNT2," ).append("\n"); 
		query.append("                         H.INV_CURR_CD                                                           INV_CURR_CD" ).append("\n"); 
		query.append("                         , D.STL_KEY_NO" ).append("\n"); 
		query.append("                         , D.OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("                  FROM   AP_PAY_INV H, AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("                  WHERE  H.INV_NO      = @[inv_no]" ).append("\n"); 
		query.append("                  AND    H.VNDR_SEQ    = @[vndr_seq]" ).append("\n"); 
		query.append("                  AND    H.DELT_FLG    = 'N'" ).append("\n"); 
		query.append("                  AND    H.INV_RGST_NO = D.INV_RGST_NO" ).append("\n"); 
		query.append("                  AND    D.DELT_FLG = 'N' )" ).append("\n"); 
		query.append("         GROUP BY @[line_seq]," ).append("\n"); 
		query.append("                  INV_DESC," ).append("\n"); 
		query.append("                  INV_CURR_CD," ).append("\n"); 
		query.append("                  DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("                  DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("                  DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("                  DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("                  DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("                  ATTR_CATE_NM," ).append("\n"); 
		query.append("                  ATTR_CTNT1," ).append("\n"); 
		query.append("                  ATTR_CTNT2," ).append("\n"); 
		query.append("                  ATTR_CTNT3," ).append("\n"); 
		query.append("                  ATTR_CTNT8," ).append("\n"); 
		query.append("                  ATTR_CTNT9," ).append("\n"); 
		query.append("                  ATTR_CTNT11," ).append("\n"); 
		query.append("                  ATTR_CTNT12," ).append("\n"); 
		query.append("                  ATTR_CTNT14," ).append("\n"); 
		query.append("                  TO_CHAR(SYSDATE, 'YYYY/MM/DD')," ).append("\n"); 
		query.append("                  CNTR_TPSZ_CD," ).append("\n"); 
		query.append("                  ACT_VVD_CD," ).append("\n"); 
		query.append("                  PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("                  SO_CRR_CD," ).append("\n"); 
		query.append("                  YD_CD," ).append("\n"); 
		query.append("                  FTU_USE_CTNT1," ).append("\n"); 
		query.append("                  FTU_USE_CTNT2," ).append("\n"); 
		query.append("                  GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])," ).append("\n"); 
		query.append("                  @[cre_usr_id]" ).append("\n"); 
		query.append("                  , STL_KEY_NO" ).append("\n"); 
		query.append("                  , OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("       UNION ALL" ).append("\n"); 
		query.append("       " ).append("\n"); 
		query.append("       SELECT DISTINCT" ).append("\n"); 
		query.append("              @[line_seq]                                 LINE_SEQ," ).append("\n"); 
		query.append("              ( SELECT DECODE(FINC_RGN_CD," ).append("\n"); 
		query.append("                              '11','TAX'," ).append("\n"); 
		query.append("                              'ITEM')" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD )             LINE_TP_LU_CD," ).append("\n"); 
		query.append("              DECODE(H.INV_CURR_CD," ).append("\n"); 
		query.append("                    'JPY',ROUND(NVL(H.INV_VAT_AMT,0))," ).append("\n"); 
		query.append("                    ROUND(NVL(INV_VAT_AMT,0),2))            CSR_AMT," ).append("\n"); 
		query.append("              H.INV_NO                                      INV_DESC," ).append("\n"); 
		query.append("              ( SELECT DECODE(FINC_RGN_CD," ).append("\n"); 
		query.append("                              '11',(SELECT SLD.LU_CD" ).append("\n"); 
		query.append("                                      FROM SCO_LU_DTL SLD" ).append("\n"); 
		query.append("                                     WHERE SLD.LU_TP_CD = 'AP TAX CODE' AND SLD.ATTR_CTNT2 = 'Y' AND SLD.ENBL_FLG = 'Y' AND ROWNUM = 1 )," ).append("\n"); 
		query.append("                              '')" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD )             INV_TAX_CD," ).append("\n"); 
		query.append("              '01'                                          DTRB_COA_CO_CD," ).append("\n"); 
		query.append("              ( SELECT FINC_RGN_CD" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD )             DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("              ( SELECT AP_CTR_CD" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD )             DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("              ( SELECT DECODE(FINC_RGN_CD,'11'" ).append("\n"); 
		query.append("							,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','PREPAID_VAT_HQ')" ).append("\n"); 
		query.append("							,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','PREPAID_VAT_BRNCH'))" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD )             DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("              '0000000000' DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("              ( SELECT NVL(SUBS_CO_CD,'00')" ).append("\n"); 
		query.append("                FROM    MDM_VENDOR" ).append("\n"); 
		query.append("                WHERE   VNDR_SEQ = H.VNDR_SEQ )              DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("              '000000'                                       DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("              '000000'                                       DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("              ( SELECT DECODE(FINC_RGN_CD,'11'" ).append("\n"); 
		query.append("							,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','PREPAID_VAT_HQ')" ).append("\n"); 
		query.append("							,COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','PREPAID_VAT_BRNCH'))" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD )              ATTR_CATE_NM," ).append("\n"); 
		query.append("              H.INV_NO                                       ATTR_CTNT1," ).append("\n"); 
		query.append("              TO_CHAR(H.INV_ISS_DT,'YYYY/MM/DD HH24:MI:SS')  ATTR_CTNT2," ).append("\n"); 
		query.append("              NVL(D.PORT_CD, ( SELECT LOC_CD" ).append("\n"); 
		query.append("						    								 FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("						   								  WHERE OFC_CD = H.COST_OFC_CD ))   ATTR_CTNT3," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT4," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT5," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT6," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT7," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT8," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT9," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT10," ).append("\n"); 
		query.append("              D.ACT_DT                                       ATTR_CTNT11,--ACTIVITY DATE" ).append("\n"); 
		query.append("              D.ACT_PLC                                      ATTR_CTNT12,--ACTIVITY PLACE" ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT13," ).append("\n"); 
		query.append("              D.SLAN_CD                                      ATTR_CTNT14,--SERVICE LANE" ).append("\n"); 
		query.append("              TO_CHAR(SYSDATE, 'YYYY/MM/DD')                 ATTR_CTNT15," ).append("\n"); 
		query.append("              NULL                                           BKG_NO," ).append("\n"); 
		query.append("              NULL                                           CNTR_TPSZ_CD," ).append("\n"); 
		query.append("              NULL                                           ACT_VVD_CD," ).append("\n"); 
		query.append("              'C'                                            PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("              NULL                                           SO_CRR_CD," ).append("\n"); 
		query.append("              (SELECT  C.YD_CD FROM AP_PAY_INV_DTL C " ).append("\n"); 
		query.append("              WHERE H.INV_NO =@[inv_no] AND C.INV_RGST_NO = H.INV_RGST_NO AND ROWNUM = 1)  YD_CD," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT1," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT2," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT3," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT4," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CNTR5," ).append("\n"); 
		query.append("              GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]) CRE_DT," ).append("\n"); 
		query.append("              @[cre_usr_id]                                  CRE_USR_ID," ).append("\n"); 
		query.append("              NULL                                           EAI_EVNT_DT" ).append("\n"); 
		query.append("              , D.STL_KEY_NO" ).append("\n"); 
		query.append("              , D.OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("       FROM   AP_PAY_INV H, AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("       WHERE  H.INV_NO      = @[inv_no]" ).append("\n"); 
		query.append("       AND    H.VNDR_SEQ    = @[vndr_seq]" ).append("\n"); 
		query.append("       AND    H.DELT_FLG    = 'N'" ).append("\n"); 
		query.append("       AND    H.INV_RGST_NO = D.INV_RGST_NO(+)" ).append("\n"); 
		query.append("       AND    D.DELT_FLG(+) = 'N'" ).append("\n"); 
		query.append("       AND    NVL(H.INV_SUB_SYS_CD,'N') <> 'TLL'" ).append("\n"); 
		query.append("       AND    NVL(H.INV_VAT_AMT,0) <> 0" ).append("\n"); 
		query.append("       AND    ROWNUM = 1" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("       UNION ALL" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("       SELECT DISTINCT" ).append("\n"); 
		query.append("              @[line_seq]                                  LINE_SEQ," ).append("\n"); 
		query.append("              'ITEM'                                         LINE_TP_LU_CD," ).append("\n"); 
		query.append("              DECODE(H.INV_CURR_CD," ).append("\n"); 
		query.append("                     'JPY',ROUND(-NVL(H.WHLD_TAX_AMT,0))," ).append("\n"); 
		query.append("                     ROUND(-NVL(H.WHLD_TAX_AMT,0),2))        CSR_AMT," ).append("\n"); 
		query.append("              'WITHHOLDING TAX'                              INV_DESC," ).append("\n"); 
		query.append("              NULL                                           INV_TAX_CD," ).append("\n"); 
		query.append("              '01'                                           DTRB_COA_CO_CD," ).append("\n"); 
		query.append("              ( SELECT FINC_RGN_CD" ).append("\n"); 
		query.append("                FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE   OFC_CD = H.COST_OFC_CD )             DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("              ( SELECT AP_CTR_CD" ).append("\n"); 
		query.append("                FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE   OFC_CD = H.COST_OFC_CD )             DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("              --COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','OTH_TAX_RCV') DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("              ( SELECT DECODE(FINC_RGN_CD," ).append("\n"); 
		query.append("                              '11',(SELECT SLD.LU_CD" ).append("\n"); 
		query.append("                                     FROM SCO_LU_HDR SLH, SCO_LU_DTL SLD" ).append("\n"); 
		query.append("                                    WHERE SLH.LU_TP_CD = SLD.LU_TP_CD" ).append("\n"); 
		query.append("                                        AND SLH.LU_TP_CD = 'AP TAX ACCOUNT'" ).append("\n"); 
		query.append("                                        AND NVL(SLD.ENBL_FLG, 'Y') = 'Y'" ).append("\n"); 
		query.append("                                        AND SLD.ATTR_CTNT1 = 'WITHHOLDING HQ'" ).append("\n"); 
		query.append("                                        AND NVL(SLD.LU_ST_DT, SYSDATE) >= SYSDATE" ).append("\n"); 
		query.append("                                        AND SLH.LU_APPL_CD = 'SAP'" ).append("\n"); 
		query.append("                                        AND ROWNUM = 1)," ).append("\n"); 
		query.append("                                    (SELECT SLD.LU_CD" ).append("\n"); 
		query.append("                                     FROM SCO_LU_HDR SLH, SCO_LU_DTL SLD" ).append("\n"); 
		query.append("                                    WHERE SLH.LU_TP_CD = SLD.LU_TP_CD" ).append("\n"); 
		query.append("                                        AND SLH.LU_TP_CD = 'AP TAX ACCOUNT'" ).append("\n"); 
		query.append("                                        AND NVL(SLD.ENBL_FLG, 'Y') = 'Y'" ).append("\n"); 
		query.append("                                        AND SLD.ATTR_CTNT1 = 'WITHHOLDING'" ).append("\n"); 
		query.append("                                        AND NVL(SLD.LU_ST_DT, SYSDATE) >= SYSDATE" ).append("\n"); 
		query.append("                                        AND SLH.LU_APPL_CD = 'SAP'" ).append("\n"); 
		query.append("                                        AND ROWNUM = 1))" ).append("\n"); 
		query.append("                FROM   MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE  OFC_CD = H.COST_OFC_CD ) DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("              '0000000000' DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("              ( SELECT NVL(SUBS_CO_CD,'00')" ).append("\n"); 
		query.append("                FROM    MDM_VENDOR" ).append("\n"); 
		query.append("                WHERE   VNDR_SEQ = H.VNDR_SEQ )              DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("              '000000'                                       DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("              '000000'                                       DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("              COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','OTH_TAX_RCV') ATTR_CATE_NM," ).append("\n"); 
		query.append("              H.INV_NO                                       ATTR_CTNT1," ).append("\n"); 
		query.append("              TO_CHAR(H.INV_ISS_DT,'YYYY/MM/DD HH24:MI:SS')  ATTR_CTNT2," ).append("\n"); 
		query.append("              NVL(D.PORT_CD, ( SELECT LOC_CD" ).append("\n"); 
		query.append("						    								 FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("						   								  WHERE OFC_CD = H.COST_OFC_CD ))   ATTR_CTNT3," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT4," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT5," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT6," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT7," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT8," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT9," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT10," ).append("\n"); 
		query.append("              D.ACT_DT                                       ATTR_CTNT11,--ACTIVITY DATE" ).append("\n"); 
		query.append("              D.ACT_PLC                                      ATTR_CTNT12,--ACTIVITY PLACE" ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT13," ).append("\n"); 
		query.append("              D.SLAN_CD                                      ATTR_CTNT14,--SERVICE LANE" ).append("\n"); 
		query.append("              TO_CHAR(SYSDATE, 'YYYY/MM/DD')                 ATTR_CTNT15," ).append("\n"); 
		query.append("              NULL                                           BKG_NO," ).append("\n"); 
		query.append("              NULL                                           CNTR_TPSZ_CD," ).append("\n"); 
		query.append("              NULL                                           ACT_VVD_CD," ).append("\n"); 
		query.append("              'C'                                            PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("              NULL                                           SO_CRR_CD," ).append("\n"); 
		query.append("              (SELECT  C.YD_CD FROM AP_PAY_INV_DTL C " ).append("\n"); 
		query.append("              WHERE H.INV_NO =@[inv_no] AND C.INV_RGST_NO = H.INV_RGST_NO AND ROWNUM = 1)  YD_CD," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT1," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT2," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT3," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT4," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CNTR5," ).append("\n"); 
		query.append("              GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]) CRE_DT," ).append("\n"); 
		query.append("              @[cre_use_id]                                CRE_USR_ID," ).append("\n"); 
		query.append("              NULL                                           EAI_EVNT_DT" ).append("\n"); 
		query.append("              , D.STL_KEY_NO" ).append("\n"); 
		query.append("              , D.OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("       FROM   AP_PAY_INV H, AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("       WHERE  H.INV_NO      = @[inv_no]  " ).append("\n"); 
		query.append("       AND    H.VNDR_SEQ    = @[vndr_seq]" ).append("\n"); 
		query.append("       AND    H.DELT_FLG    = 'N'" ).append("\n"); 
		query.append("       AND    H.INV_RGST_NO = D.INV_RGST_NO(+)" ).append("\n"); 
		query.append("       AND    D.DELT_FLG(+) = 'N'" ).append("\n"); 
		query.append("       AND    NVL(H.INV_SUB_SYS_CD,'N') <> 'TLL'" ).append("\n"); 
		query.append("       AND    NVL(H.WHLD_TAX_AMT,0) <> 0" ).append("\n"); 
		query.append("       AND    ROWNUM = 1" ).append("\n"); 
		query.append("       " ).append("\n"); 
		query.append("       UNION ALL" ).append("\n"); 
		query.append("       " ).append("\n"); 
		query.append("       SELECT DISTINCT " ).append("\n"); 
		query.append("              @[line_seq]                                  LINE_SEQ," ).append("\n"); 
		query.append("              'MISCELLANEOUS'                                LINE_TP_LU_CD," ).append("\n"); 
		query.append("              DECODE(H.INV_CURR_CD," ).append("\n"); 
		query.append("                     'JPY',ROUND(-NVL(D.INV_AMT,0))," ).append("\n"); 
		query.append("                     ROUND(-NVL(D.INV_AMT,0),2))             CSR_AMT," ).append("\n"); 
		query.append("              NULL                                           INV_DESC," ).append("\n"); 
		query.append("              NULL                                           INV_TAX_CD," ).append("\n"); 
		query.append("              '01'                                           DTRB_COA_CO_CD," ).append("\n"); 
		query.append("              ( SELECT FINC_RGN_CD" ).append("\n"); 
		query.append("                FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE   OFC_CD = H.COST_OFC_CD )             DTRB_COA_RGN_CD," ).append("\n"); 
		query.append("              ( SELECT AP_CTR_CD" ).append("\n"); 
		query.append("                FROM    MDM_ORGANIZATION" ).append("\n"); 
		query.append("                WHERE   OFC_CD = H.COST_OFC_CD )             DTRB_COA_CTR_CD," ).append("\n"); 
		query.append("              COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','CLEARING_AR_FA_RTIR') DTRB_COA_ACCT_CD," ).append("\n"); 
		query.append("              '0000000000' DTRB_COA_VVD_CD," ).append("\n"); 
		query.append("              ( SELECT NVL(SUBS_CO_CD,'00')" ).append("\n"); 
		query.append("                FROM    MDM_VENDOR" ).append("\n"); 
		query.append("                WHERE   VNDR_SEQ = H.VNDR_SEQ )              DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("              '000000'                                       DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("              '000000'                                       DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("              COM_CSR_GET_ACCT_HRD_CDG_FNC('CSR','CLEARING_AR_FA_RTIR') ATTR_CATE_NM," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT1," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT2," ).append("\n"); 
		query.append("              NVL(D.PORT_CD, ( SELECT LOC_CD" ).append("\n"); 
		query.append("						    							 	 FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append("						   								  WHERE OFC_CD = H.COST_OFC_CD ))   ATTR_CTNT3," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT4," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT5," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT6," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT7," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT8," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT9," ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT10," ).append("\n"); 
		query.append("              D.ACT_DT                                       ATTR_CTNT11,--ACTIVITY DATE" ).append("\n"); 
		query.append("              D.ACT_PLC                                      ATTR_CTNT12,--ACTIVITY PLACE" ).append("\n"); 
		query.append("              NULL                                           ATTR_CTNT13," ).append("\n"); 
		query.append("              D.SLAN_CD                                      ATTR_CTNT14,--SERVICE LANE" ).append("\n"); 
		query.append("              TO_CHAR(SYSDATE, 'YYYY/MM/DD')                ATTR_CTNT15," ).append("\n"); 
		query.append("              NULL                                           BKG_NO," ).append("\n"); 
		query.append("              NULL                                           CNTR_TPSZ_CD," ).append("\n"); 
		query.append("              NULL                                           ACT_VVD_CD," ).append("\n"); 
		query.append("              'C'                                            PLN_SCTR_DIV_CD," ).append("\n"); 
		query.append("              NULL                                           SO_CRR_CD," ).append("\n"); 
		query.append("              NULL                                           YD_CD," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT1," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT2," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT3," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CTNT4," ).append("\n"); 
		query.append("              NULL                                           FTU_USE_CNTR5," ).append("\n"); 
		query.append("              GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd]) CRE_DT," ).append("\n"); 
		query.append("              @[cre_use_id]                                CRE_USR_ID," ).append("\n"); 
		query.append("              NULL                                           EAI_EVNT_DT" ).append("\n"); 
		query.append("              , D.STL_KEY_NO" ).append("\n"); 
		query.append("              , D.OWNR_VNDR_SEQ" ).append("\n"); 
		query.append("       FROM   AP_PAY_INV H, AP_PAY_INV_DTL D" ).append("\n"); 
		query.append("       WHERE  H.INV_NO      = @[inv_no]  " ).append("\n"); 
		query.append("       AND    H.VNDR_SEQ    = @[vndr_seq]" ).append("\n"); 
		query.append("       AND    H.DELT_FLG    = 'N'" ).append("\n"); 
		query.append("       AND    H.INV_RGST_NO = D.INV_RGST_NO" ).append("\n"); 
		query.append("       AND    D.DELT_FLG    = 'N'" ).append("\n"); 
		query.append("       AND    NVL(H.INV_SUB_SYS_CD,'N') = 'TLL'" ).append("\n"); 
		query.append("       AND    NVL(H.TTL_LSS_DIV_CD,'N') IN ('PO','GO')" ).append("\n"); 
		query.append(" )" ).append("\n"); 

	}
}