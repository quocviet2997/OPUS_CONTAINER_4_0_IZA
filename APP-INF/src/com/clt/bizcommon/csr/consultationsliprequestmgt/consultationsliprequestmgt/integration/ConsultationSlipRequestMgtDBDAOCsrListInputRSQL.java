/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCsrListInputRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.16
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.16 
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

public class ConsultationSlipRequestMgtDBDAOCsrListInputRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCsrListInputRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cost_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("inv_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pso_trns_slp_ctnt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_cfm_dt",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCsrListInputRSQL").append("\n"); 
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
		query.append("SELECT  INV_RGST_NO" ).append("\n"); 
		query.append("		, INV_NO" ).append("\n"); 
		query.append("        , INV_NET_AMT" ).append("\n"); 
		query.append("        , INV_VAT_AMT" ).append("\n"); 
		query.append("      	, WHLD_TAX_AMT" ).append("\n"); 
		query.append("      	, INV_TTL_AMT" ).append("\n"); 
		query.append("		, ISS_DT " ).append("\n"); 
		query.append("		, RCV_DT " ).append("\n"); 
		query.append("		, INV_CFM_DT " ).append("\n"); 
		query.append("		, INV_OFC_CD" ).append("\n"); 
		query.append("		, VNDR_SEQ" ).append("\n"); 
		query.append("		, INV_CURR_CD" ).append("\n"); 
		query.append("		, TTL_LSS_DIV_CD" ).append("\n"); 
		query.append("		, VNDR_TERM_NM" ).append("\n"); 
		query.append("		, COST_OFC_CD" ).append("\n"); 
		query.append("		, INV_STS_CD" ).append("\n"); 
		query.append("		, INV_RJCT_STS_CD" ).append("\n"); 
		query.append("		, INV_SUB_SYS_CD" ).append("\n"); 
		query.append("		, PSO_TRNS_SLP_CTNT" ).append("\n"); 
		query.append("        , PAY_DUE_DT" ).append("\n"); 
		query.append("        , PPAY_APLY_FLG" ).append("\n"); 
		query.append("        , DECODE(NVL(PPAY_APLY_FLG,'N'),'N',PPD_NO,'') PPD_NO" ).append("\n"); 
		query.append("  FROM" ).append("\n"); 
		query.append("      (" ).append("\n"); 
		query.append("					SELECT A.INV_RGST_NO" ).append("\n"); 
		query.append("					, A.INV_NO" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.INV_NET_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.INV_NET_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(A.INV_NET_AMT,0),2)) INV_NET_AMT" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.INV_VAT_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.INV_VAT_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(INV_VAT_AMT,0),2)) INV_VAT_AMT" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.WHLD_TAX_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.WHLD_TAX_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(A.WHLD_TAX_AMT,0),2)) WHLD_TAX_AMT" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.INV_TTL_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.INV_TTL_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(A.INV_TTL_AMT,0),2)) INV_TTL_AMT" ).append("\n"); 
		query.append("					,TO_CHAR(A.INV_ISS_DT, 'YYYY-MM-DD') ISS_DT " ).append("\n"); 
		query.append("					,TO_CHAR(A.INV_RCV_DT, 'YYYY-MM-DD') RCV_DT " ).append("\n"); 
		query.append("					,TO_CHAR(A.INV_CFM_DT, 'YYYY-MM-DD') INV_CFM_DT " ).append("\n"); 
		query.append("					, A.INV_OFC_CD" ).append("\n"); 
		query.append("					, A.VNDR_SEQ" ).append("\n"); 
		query.append("					, A.INV_CURR_CD" ).append("\n"); 
		query.append("					, A.TTL_LSS_DIV_CD" ).append("\n"); 
		query.append("					, A.VNDR_TERM_NM" ).append("\n"); 
		query.append("					, '' COST_OFC_CD" ).append("\n"); 
		query.append("					, '' INV_STS_CD" ).append("\n"); 
		query.append("					, '' INV_RJCT_STS_CD" ).append("\n"); 
		query.append("					, '' INV_SUB_SYS_CD" ).append("\n"); 
		query.append("					, A.PSO_TRNS_SLP_CTNT" ).append("\n"); 
		query.append("                    , TO_CHAR(A.PAY_DUE_DT, 'YYYY-MM-DD') PAY_DUE_DT" ).append("\n"); 
		query.append("                    , NVL((SELECT DECODE(SIGN(SUM(DECODE(B.PPAY_APLY_FLG,'Y',1,0))),1,'Y','N')" ).append("\n"); 
		query.append("                           FROM PSO_CHARGE B " ).append("\n"); 
		query.append("                           WHERE B.INV_RGST_NO = A.INV_RGST_NO),'N') PPAY_APLY_FLG" ).append("\n"); 
		query.append("                    , A.PPD_NO   " ).append("\n"); 
		query.append("					FROM  AP_PAY_INV A  " ).append("\n"); 
		query.append("					WHERE A.COST_OFC_CD        = @[cost_ofc_cd]" ).append("\n"); 
		query.append("					AND A.INV_OFC_CD           = @[inv_ofc_cd]" ).append("\n"); 
		query.append("					AND A.VNDR_SEQ             = @[vndr_seq]" ).append("\n"); 
		query.append("					AND A.INV_CURR_CD          = @[inv_curr_cd]" ).append("\n"); 
		query.append("					#if (${pso_trns_slp_ctnt} != '') " ).append("\n"); 
		query.append("					AND PSO_TRNS_SLP_CTNT = @[pso_trns_slp_ctnt]" ).append("\n"); 
		query.append("					#else" ).append("\n"); 
		query.append("					AND PSO_TRNS_SLP_CTNT IS NULL" ).append("\n"); 
		query.append("					#end" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					#if (${inv_sub_sys_cd} != 'MNR') " ).append("\n"); 
		query.append("					AND A.INV_SUB_SYS_CD 	   = @[inv_sub_sys_cd]" ).append("\n"); 
		query.append("					#else " ).append("\n"); 
		query.append("					AND A.INV_SUB_SYS_CD 	   IN ('MNR', 'TLL')" ).append("\n"); 
		query.append("					#end" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					AND A.INV_STS_CD           IN ('C', 'X') " ).append("\n"); 
		query.append("					AND NVL(A.DELT_FLG,'N')    <> 'Y' " ).append("\n"); 
		query.append("					#if (${inv_cfm_dt} != '') " ).append("\n"); 
		query.append("						  AND TO_CHAR(A.INV_CFM_DT,'YYYY-MM-DD') = @[inv_cfm_dt]" ).append("\n"); 
		query.append("					#end" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					MINUS" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					SELECT A.INV_RGST_NO" ).append("\n"); 
		query.append("					, A.INV_NO" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.INV_NET_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.INV_NET_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(A.INV_NET_AMT,0),2)) INV_NET_AMT" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.INV_VAT_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.INV_VAT_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(INV_VAT_AMT,0),2)) INV_VAT_AMT" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.WHLD_TAX_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.WHLD_TAX_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(A.WHLD_TAX_AMT,0),2)) WHLD_TAX_AMT" ).append("\n"); 
		query.append("					     , DECODE(A.INV_CURR_CD" ).append("\n"); 
		query.append("					            , 'KRW', ROUND(NVL(A.INV_TTL_AMT,0),0)" ).append("\n"); 
		query.append("					            , 'JPY', ROUND(NVL(A.INV_TTL_AMT,0),0)" ).append("\n"); 
		query.append("					            ,ROUND(NVL(A.INV_TTL_AMT,0),2)) INV_TTL_AMT" ).append("\n"); 
		query.append("					,TO_CHAR(A.INV_ISS_DT, 'YYYY-MM-DD') ISS_DT " ).append("\n"); 
		query.append("					,TO_CHAR(A.INV_RCV_DT, 'YYYY-MM-DD') RCV_DT " ).append("\n"); 
		query.append("					,TO_CHAR(A.INV_CFM_DT, 'YYYY-MM-DD') INV_CFM_DT " ).append("\n"); 
		query.append("					, A.INV_OFC_CD" ).append("\n"); 
		query.append("					, A.VNDR_SEQ" ).append("\n"); 
		query.append("					, A.INV_CURR_CD" ).append("\n"); 
		query.append("					, A.TTL_LSS_DIV_CD" ).append("\n"); 
		query.append("					, A.VNDR_TERM_NM" ).append("\n"); 
		query.append("					, '' COST_OFC_CD" ).append("\n"); 
		query.append("					, '' INV_STS_CD" ).append("\n"); 
		query.append("					, '' INV_RJCT_STS_CD" ).append("\n"); 
		query.append("					, '' INV_SUB_SYS_CD" ).append("\n"); 
		query.append("					, A.PSO_TRNS_SLP_CTNT" ).append("\n"); 
		query.append("                    , TO_CHAR(A.PAY_DUE_DT, 'YYYY-MM-DD') PAY_DUE_DT" ).append("\n"); 
		query.append("                    , NVL((SELECT DECODE(SIGN(SUM(DECODE(B.PPAY_APLY_FLG,'Y',1,0))),1,'Y','N')" ).append("\n"); 
		query.append("                           FROM PSO_CHARGE B " ).append("\n"); 
		query.append("                           WHERE B.INV_RGST_NO = A.INV_RGST_NO),'N') PPAY_APLY_FLG                    " ).append("\n"); 
		query.append("                    , A.PPD_NO   " ).append("\n"); 
		query.append("					FROM  AP_PAY_INV A, AP_INV_HDR B" ).append("\n"); 
		query.append("					WHERE A.COST_OFC_CD        = @[cost_ofc_cd]" ).append("\n"); 
		query.append("					AND A.INV_OFC_CD           = @[inv_ofc_cd]" ).append("\n"); 
		query.append("					AND A.VNDR_SEQ             = @[vndr_seq]" ).append("\n"); 
		query.append("                    AND A.INV_CURR_CD          = @[inv_curr_cd]" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					#if (${pso_trns_slp_ctnt} != '') " ).append("\n"); 
		query.append("					AND PSO_TRNS_SLP_CTNT = @[pso_trns_slp_ctnt]" ).append("\n"); 
		query.append("					#else" ).append("\n"); 
		query.append("					AND PSO_TRNS_SLP_CTNT IS NULL" ).append("\n"); 
		query.append("					#end" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					#if (${inv_sub_sys_cd} != 'MNR') " ).append("\n"); 
		query.append("					AND A.INV_SUB_SYS_CD 	   = @[inv_sub_sys_cd]" ).append("\n"); 
		query.append("					#else " ).append("\n"); 
		query.append("					AND A.INV_SUB_SYS_CD 	   IN ('MNR', 'TLL')" ).append("\n"); 
		query.append("					#end" ).append("\n"); 
		query.append("					" ).append("\n"); 
		query.append("					AND A.INV_STS_CD           IN ('C', 'X') " ).append("\n"); 
		query.append("					AND NVL(A.DELT_FLG,'N')    <> 'Y' " ).append("\n"); 
		query.append("					#if (${inv_cfm_dt} != '') " ).append("\n"); 
		query.append("						  AND TO_CHAR(A.INV_CFM_DT,'YYYY-MM-DD') = @[inv_cfm_dt]" ).append("\n"); 
		query.append("					#end" ).append("\n"); 
		query.append("					  AND A.CSR_NO = B.CSR_NO" ).append("\n"); 
		query.append("					  AND B.IF_ERR_RSN = 'Sending...'" ).append("\n"); 
		query.append("			)A" ).append("\n"); 

	}
}