/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCsrParmRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.13
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.13 함대성
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

public class ConsultationSlipRequestMgtDBDAOCsrParmRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCsrParmRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCsrParmRSQL").append("\n"); 
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
		query.append("SELECT  '' ofc_cd" ).append("\n"); 
		query.append(",'' inv_sub_sys_cd" ).append("\n"); 
		query.append(",'' inv_ofc_cd" ).append("\n"); 
		query.append(",'' cnt_cd" ).append("\n"); 
		query.append(",'' asanogb" ).append("\n"); 
		query.append(",'' pay_group_cd" ).append("\n"); 
		query.append(",'' csr_amt" ).append("\n"); 
		query.append(",'' iss_dt" ).append("\n"); 
		query.append(",'' rcv_dt" ).append("\n"); 
		query.append(",'' gen_pay_term_cd" ).append("\n"); 
		query.append(",'' temp_payment_due_dt" ).append("\n"); 
		query.append(",'' pay_term_tp_cd" ).append("\n"); 
		query.append(",'' ap_ofc_cd" ).append("\n"); 
		query.append(",'' usr_eml" ).append("\n"); 
		query.append(",'' usr_nm" ).append("\n"); 
		query.append(",'' cre_usr_id" ).append("\n"); 
		query.append(",'' csr_tp_cd" ).append("\n"); 
		query.append(",'' evi_gb" ).append("\n"); 
		query.append(",'' inv_knt" ).append("\n"); 
		query.append(",'' inv_cfm_dt" ).append("\n"); 
		query.append(",'' pso_trns_slp_ctnt" ).append("\n"); 
		query.append(",'' tax_naid_flg" ).append("\n"); 
		query.append(",'' finance_flg" ).append("\n"); 
		query.append(",'' fa_flg" ).append("\n"); 
		query.append(",'' tax_type" ).append("\n"); 
		query.append(",'' tax_nsl_flg" ).append("\n"); 
		query.append(",'' evi_inv_dt" ).append("\n"); 
		query.append(",'' evi_comp_no" ).append("\n"); 
		query.append(",'' evi_total_net_amt" ).append("\n"); 
		query.append(",'' evi_tax_no2" ).append("\n"); 
		query.append(",'' evi_total_tax_amt" ).append("\n"); 
		query.append(",'' evi_ctnt1" ).append("\n"); 
		query.append(",'' evi_ctnt2" ).append("\n"); 
		query.append(",'' evi_ctnt3" ).append("\n"); 
		query.append(",'' evi_ctnt4" ).append("\n"); 
		query.append(",'' evi_ctnt5" ).append("\n"); 
		query.append(",'' evi_ctnt6" ).append("\n"); 
		query.append(",'' evi_ctnt7" ).append("\n"); 
		query.append(",'' evi_ctnt8" ).append("\n"); 
		query.append(",'' evi_ctnt9" ).append("\n"); 
		query.append(",'' evi_ctnt10" ).append("\n"); 
		query.append(",'' evi_ctnt11" ).append("\n"); 
		query.append(",'' evi_ctnt12" ).append("\n"); 
		query.append(",'' evi_tax_no" ).append("\n"); 
		query.append(",'' evi_tax_code" ).append("\n"); 
		query.append(",'' s_tax_naid_flg" ).append("\n"); 
		query.append(",'' s_finance_flg" ).append("\n"); 
		query.append(",'' s_fa_flg" ).append("\n"); 
		query.append(",'' s_tax_type" ).append("\n"); 
		query.append(",'' s_tax_nsl_flg" ).append("\n"); 
		query.append(",'' s_evi_inv_dt" ).append("\n"); 
		query.append(",'' s_evi_comp_no" ).append("\n"); 
		query.append(",'' s_evi_total_net_amt" ).append("\n"); 
		query.append(",'' s_evi_tax_no2" ).append("\n"); 
		query.append(",'' s_evi_total_tax_amt" ).append("\n"); 
		query.append(",'' s_evi_ctnt1" ).append("\n"); 
		query.append(",'' s_evi_ctnt2" ).append("\n"); 
		query.append(",'' s_evi_ctnt3" ).append("\n"); 
		query.append(",'' s_evi_ctnt4" ).append("\n"); 
		query.append(",'' s_evi_ctnt5" ).append("\n"); 
		query.append(",'' s_evi_ctnt6" ).append("\n"); 
		query.append(",'' s_evi_ctnt7" ).append("\n"); 
		query.append(",'' s_evi_ctnt8" ).append("\n"); 
		query.append(",'' s_evi_ctnt9" ).append("\n"); 
		query.append(",'' s_evi_ctnt10" ).append("\n"); 
		query.append(",'' s_evi_ctnt11" ).append("\n"); 
		query.append(",'' s_evi_ctnt12" ).append("\n"); 
		query.append(",'' s_evi_tax_no" ).append("\n"); 
		query.append(",'' s_evi_tax_code" ).append("\n"); 
		query.append(",'' ttl_lss_div_cd" ).append("\n"); 
		query.append(",'' inv_rgst_no" ).append("\n"); 
		query.append(",'' eviInputFlg" ).append("\n"); 
		query.append(",'' s_eviInputFlg" ).append("\n"); 
		query.append(",'' apopen" ).append("\n"); 
		query.append(",'' com_mrdPath" ).append("\n"); 
		query.append(",'' com_mrdArguments" ).append("\n"); 
		query.append(",'' asa_no_s" ).append("\n"); 
		query.append(",'' aproSeqKey" ).append("\n"); 
		query.append(",'' key" ).append("\n"); 
		query.append(",'' cost_ofc_cd" ).append("\n"); 
		query.append(",'' vndr_seq" ).append("\n"); 
		query.append(",'' cnt_inv" ).append("\n"); 
		query.append(",'' curr_cd" ).append("\n"); 
		query.append(",'' total_amt" ).append("\n"); 
		query.append(",'' max_iss_dt" ).append("\n"); 
		query.append(",'' max_rcv_dt" ).append("\n"); 
		query.append(",'' gen_pay_term_desc" ).append("\n"); 
		query.append(",'' payment_due_dt" ).append("\n"); 
		query.append(",'' apro_step" ).append("\n"); 
		query.append(",'' csr_no" ).append("\n"); 
		query.append(",'' if_status" ).append("\n"); 
		query.append(",'' attr_ctnt8" ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 

	}
}