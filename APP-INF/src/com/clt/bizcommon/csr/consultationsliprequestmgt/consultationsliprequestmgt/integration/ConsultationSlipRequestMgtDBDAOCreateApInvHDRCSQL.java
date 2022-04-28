/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCreateApInvHDRCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.08.17
*@LastModifier : 
*@LastVersion : 1.0
* 2018.08.17 
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

public class ConsultationSlipRequestMgtDBDAOCreateApInvHDRCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCreateApInvHDRCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt7",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt6",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("imp_err_rsn",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("evi_ctnt9",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt8",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ppay_aply_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("coa_ftu_n1st_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_amt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("payment_due_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt1",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("if_err_rsn",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt3",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pay_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("coa_vvd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt10",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt2",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt11",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt5",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt12",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt4",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("tax_curr_xch_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_rgst_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ftu_use_ctnt1",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_inv_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ftu_use_ctnt2",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ftu_use_ctnt3",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ftu_use_ctnt4",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_eml",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ftu_use_ctnt5",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("coa_co_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt15",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ppd_dtrb_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt14",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ppd_gl_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt13",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt12",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("coa_ftu_n2nd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt11",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ppd_aply_amt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt10",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pay_grp_lu_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt16",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("evi_ctnt15",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt14",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt13",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt18",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("evi_ctnt17",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("tax_decl_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rcv_err_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ap_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rcv_err_rsn",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt1",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt2",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("attr_ctnt3",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt4",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pay_amt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt6",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt5",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("src_ctnt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt8",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt7",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_ctnt9",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("if_dt",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("imp_err_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("if_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("attr_cate_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("act_xch_rt",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("ppd_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_term_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCreateApInvHDRCSQL").append("\n"); 
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
		query.append("insert into AP_INV_HDR (" ).append("\n"); 
		query.append(" csr_no                                            ," ).append("\n"); 
		query.append(" csr_tp_cd                                         ," ).append("\n"); 
		query.append(" inv_dt                                            ," ).append("\n"); 
		query.append(" inv_term_dt                                       ," ).append("\n"); 
		query.append(" gl_dt                                             ," ).append("\n"); 
		query.append(" vndr_no                                           ," ).append("\n"); 
		query.append(" csr_amt                                           ," ).append("\n"); 
		query.append(" pay_amt                                           ," ).append("\n"); 
		query.append(" pay_dt                                            ," ).append("\n"); 
		query.append(" csr_curr_cd                                       ," ).append("\n"); 
		query.append(" vndr_term_nm                                      ," ).append("\n"); 
		query.append(" inv_desc                                          ," ).append("\n"); 
		query.append(" attr_cate_nm                                      ," ).append("\n"); 
		query.append(" attr_ctnt1                                        ," ).append("\n"); 
		query.append(" attr_ctnt2                                        ," ).append("\n"); 
		query.append(" attr_ctnt3                                        ," ).append("\n"); 
		query.append(" attr_ctnt4                                        ," ).append("\n"); 
		query.append(" attr_ctnt5                                        ," ).append("\n"); 
		query.append(" attr_ctnt6                                        ," ).append("\n"); 
		query.append(" attr_ctnt7                                        ," ).append("\n"); 
		query.append(" attr_ctnt8                                        ," ).append("\n"); 
		query.append(" attr_ctnt9                                        ," ).append("\n"); 
		query.append(" attr_ctnt10                                       ," ).append("\n"); 
		query.append(" attr_ctnt11                                       ," ).append("\n"); 
		query.append(" attr_ctnt12                                       ," ).append("\n"); 
		query.append(" attr_ctnt13                                       ," ).append("\n"); 
		query.append(" attr_ctnt14                                       ," ).append("\n"); 
		query.append(" attr_ctnt15                                       ," ).append("\n"); 
		query.append(" glo_attr_ctnt1                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt2                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt3                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt4                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt5                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt6                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt7                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt8                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt9                                    ," ).append("\n"); 
		query.append(" glo_attr_ctnt10                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt11                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt12                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt13                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt14                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt15                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt16                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt17                                   ," ).append("\n"); 
		query.append(" glo_attr_ctnt18                                   ," ).append("\n"); 
		query.append(" src_ctnt                                          ," ).append("\n"); 
		query.append(" pay_mzd_lu_cd                                     ," ).append("\n"); 
		query.append(" pay_grp_lu_cd                                     ," ).append("\n"); 
		query.append(" coa_co_cd                                         ," ).append("\n"); 
		query.append(" coa_rgn_cd                                        ," ).append("\n"); 
		query.append(" coa_ctr_cd                                        ," ).append("\n"); 
		query.append(" coa_acct_cd                                       ," ).append("\n"); 
		query.append(" coa_vvd_cd                                        ," ).append("\n"); 
		query.append(" coa_inter_co_cd                                   ," ).append("\n"); 
		query.append(" coa_ftu_n1st_cd                                   ," ).append("\n"); 
		query.append(" coa_ftu_n2nd_cd                                   ," ).append("\n"); 
		query.append(" ppd_no                                            ," ).append("\n"); 
		query.append(" ppd_dtrb_no                                       ," ).append("\n"); 
		query.append(" ppd_aply_amt                                      ," ).append("\n"); 
		query.append(" ppd_gl_dt                                         ," ).append("\n"); 
		query.append(" apro_flg                                          ," ).append("\n"); 
		query.append(" tax_decl_flg                                      ," ).append("\n"); 
		query.append(" err_csr_no                                        ," ).append("\n"); 
		query.append(" if_flg                                            ," ).append("\n"); 
		query.append(" if_dt                                             ," ).append("\n"); 
		query.append(" if_err_rsn                                        ," ).append("\n"); 
		query.append(" ppay_aply_flg                                     ," ).append("\n"); 
		query.append(" tj_ofc_cd                                         ," ).append("\n"); 
		query.append(" act_xch_rt                                        ," ).append("\n"); 
		query.append(" imp_err_flg                                       ," ).append("\n"); 
		query.append(" rcv_err_flg                                       ," ).append("\n"); 
		query.append(" tax_curr_xch_flg                                  ," ).append("\n"); 
		query.append(" usr_eml                                           ," ).append("\n"); 
		query.append(" imp_err_rsn                                       ," ).append("\n"); 
		query.append(" rcv_err_rsn                                       ," ).append("\n"); 
		query.append(" ftu_use_ctnt1                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt2                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt3                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt4                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt5                                     ," ).append("\n"); 
		query.append(" cre_dt                                            ," ).append("\n"); 
		query.append(" cre_usr_id                                        ," ).append("\n"); 
		query.append(" eai_evnt_dt" ).append("\n"); 
		query.append("  ) values (" ).append("\n"); 
		query.append(" @[csr_no]                                         ," ).append("\n"); 
		query.append(" @[csr_tp_cd]                                      ," ).append("\n"); 
		query.append(" @[inv_dt]                                         ," ).append("\n"); 
		query.append(" @[payment_due_dt]        						   ," ).append("\n"); 
		query.append(" (SELECT  DECODE(A.STS" ).append("\n"); 
		query.append("                ,'O',@[evi_inv_dt]" ).append("\n"); 
		query.append("                ,'C',B.DT" ).append("\n"); 
		query.append("                ,'N',NULL, '01', NULL," ).append("\n"); 
		query.append("                 DECODE(A.STS" ).append("\n"); 
		query.append("                ,'O',@[evi_inv_dt]" ).append("\n"); 
		query.append("                ,'C',B.DT" ).append("\n"); 
		query.append("                ,'N',NULL)" ).append("\n"); 
		query.append("                )" ).append("\n"); 
		query.append("	  FROM   (SELECT NVL((SELECT CASE WHEN SUM(DECODE(CLZ_STS_CD,'O',1,0)) > 0 THEN 'O' ELSE 'C' END STS" ).append("\n"); 
		query.append("	          FROM   AP_PERIOD" ).append("\n"); 
		query.append("	          WHERE  SYS_DIV_CD = '15'" ).append("\n"); 
		query.append("	          AND    EFF_YRMON  = SUBSTR(@[evi_inv_dt],1,6)" ).append("\n"); 
		query.append("	          AND    OFC_CD IN ( @[ap_ofc_cd],(SELECT M.AR_HD_QTR_OFC_CD FROM MDM_ORGANIZATION M WHERE M.OFC_CD = @[ap_ofc_cd]" ).append("\n"); 
		query.append("																  )" ).append("\n"); 
		query.append("															)" ).append("\n"); 
		query.append("	          AND    AR_AP_DIV_CD = 'P'),'C') STS FROM DUAL) A," ).append("\n"); 
		query.append("	         (SELECT MIN(EFF_YRMON)||'01' DT" ).append("\n"); 
		query.append("	          FROM   AP_PERIOD" ).append("\n"); 
		query.append("	          WHERE  SYS_DIV_CD = '15'" ).append("\n"); 
		query.append("	          AND    EFF_YRMON >= SUBSTR(@[evi_inv_dt],1,6)" ).append("\n"); 
		query.append("	          AND    AR_AP_DIV_CD = 'P'" ).append("\n"); 
		query.append("	          AND    OFC_CD IN (@[ap_ofc_cd], (SELECT M.AR_HD_QTR_OFC_CD FROM MDM_ORGANIZATION M WHERE M.OFC_CD = @[ap_ofc_cd]" ).append("\n"); 
		query.append("																)" ).append("\n"); 
		query.append("														  )" ).append("\n"); 
		query.append("	          AND    CLZ_STS_CD = 'O') B )," ).append("\n"); 
		query.append(" @[vndr_seq]	                                            ," ).append("\n"); 
		query.append(" @[csr_amt]                                                			," ).append("\n"); 
		query.append(" @[pay_amt]                                                 ," ).append("\n"); 
		query.append(" @[pay_dt]                                                 ," ).append("\n"); 
		query.append(" @[csr_curr_cd]                                                 ," ).append("\n"); 
		query.append(" @[vndr_term_nm]," ).append("\n"); 
		query.append("#if (${ttl_lss_div_cd} == 'PO' || ${ttl_lss_div_cd} == 'PL' || ${pso_trns_slp_ctnt} == 'AR')" ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("    SELECT INV_RMK" ).append("\n"); 
		query.append("    FROM   AP_PAY_INV" ).append("\n"); 
		query.append("    WHERE  inv_rgst_no = @[inv_rgst_no]" ).append("\n"); 
		query.append("      AND  ROWNUM = 1" ).append("\n"); 
		query.append(" )" ).append("\n"); 
		query.append("#else " ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("    SELECT VNDR_LGL_ENG_NM" ).append("\n"); 
		query.append("    FROM   MDM_VENDOR" ).append("\n"); 
		query.append("    WHERE  VNDR_SEQ = @[vndr_seq]    " ).append("\n"); 
		query.append(" )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(", " ).append("\n"); 
		query.append(" @[attr_cate_nm]                                               ," ).append("\n"); 
		query.append(" @[attr_ctnt1]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt2]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt3]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt4]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt5]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt6]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt7]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt8]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt9]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt10]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt11]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt12]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt13]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt14]                                                 ," ).append("\n"); 
		query.append(" @[attr_ctnt15]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt1]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt2]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt3]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt4]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt5]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt6]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt7]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt8]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt9]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt10]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt11]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt12]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt13]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt14]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt15]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt16]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt17]                                                 ," ).append("\n"); 
		query.append(" @[evi_ctnt18]                                                 ," ).append("\n"); 
		query.append(" @[src_ctnt]                                                 , " ).append("\n"); 
		query.append("(SELECT PAY_MZD_CD" ).append("\n"); 
		query.append("  FROM MDM_VENDOR" ).append("\n"); 
		query.append(" WHERE VNDR_SEQ = @[vndr_seq]),  " ).append("\n"); 
		query.append(" @[pay_grp_lu_cd]                                                 , " ).append("\n"); 
		query.append(" @[coa_co_cd]                                                 ," ).append("\n"); 
		query.append(" (SELECT finc_rgn_cd FROM MDM_ORGANIZATION WHERE ofc_cd = @[cost_ofc_cd] AND NVL(delt_flg,'N') = 'N') ," ).append("\n"); 
		query.append(" (SELECT ap_ctr_cd FROM MDM_ORGANIZATION WHERE ofc_cd = @[cost_ofc_cd] AND NVL(delt_flg,'N') = 'N')   ," ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${pso_trns_slp_ctnt} == 'GO')" ).append("\n"); 
		query.append(" DECODE( (SELECT ACCT_CD" ).append("\n"); 
		query.append(" 			FROM AP_PAY_INV_DTL" ).append("\n"); 
		query.append(" 		   WHERE INV_RGST_NO = @[inv_rgst_no]" ).append("\n"); 
		query.append("             AND ROWNUM = 1" ).append("\n"); 
		query.append("	      ), (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   				FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append("  			   WHERE ROWNUM = 1" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = 'AGT_ACCT_RCV')" ).append("\n"); 
		query.append("		   , (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   				FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append("  			   WHERE ROWNUM = 1" ).append("\n"); 
		query.append("    			 AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = 'TRD_PAY_OPER')" ).append("\n"); 
		query.append("		   , (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   				FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append(" 			   WHERE ROWNUM = 1" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = 'TRD_PAY_GEN_OH')" ).append("\n"); 
		query.append("	   )," ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append(" DECODE(@[src_ctnt],'SO_CCC'" ).append("\n"); 
		query.append("		,(SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   				FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append(" 			   WHERE ROWNUM = 1" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = 'TRD_PAY_GEN_OH')" ).append("\n"); 
		query.append("		,(SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   				FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append("  			   WHERE ROWNUM = 1" ).append("\n"); 
		query.append("    			 AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("   				 AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("   				 AND D.HRD_CDG_ID = 'TRD_PAY_OPER'))," ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append(" @[coa_vvd_cd]                                                 ," ).append("\n"); 
		query.append(" (SELECT nvl(SUBS_CO_CD,'00') FROM mdm_vendor WHERE vndr_seq = @[vndr_seq] )	                     ," ).append("\n"); 
		query.append(" @[coa_ftu_n1st_cd]                     ," ).append("\n"); 
		query.append(" @[coa_ftu_n2nd_cd]                     ," ).append("\n"); 
		query.append(" CASE " ).append("\n"); 
		query.append(" WHEN @[src_ctnt] = 'SO_PORT' THEN " ).append("\n"); 
		query.append("    NVL((SELECT PPD_NO" ).append("\n"); 
		query.append("    FROM AP_PAY_INV" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND INV_SUB_SYS_CD = 'PSO'" ).append("\n"); 
		query.append("    AND INV_RGST_NO = @[inv_rgst_no]" ).append("\n"); 
		query.append("    AND PPD_NO IS NOT NULL" ).append("\n"); 
		query.append("    AND ROWNUM = 1),@[ppd_no])" ).append("\n"); 
		query.append(" ELSE @[ppd_no]" ).append("\n"); 
		query.append(" END, " ).append("\n"); 
		query.append(" CASE " ).append("\n"); 
		query.append(" WHEN @[src_ctnt] = 'SO_PORT' THEN " ).append("\n"); 
		query.append("    NVL((SELECT PPD_DTRB_NO" ).append("\n"); 
		query.append("    FROM AP_PAY_INV" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND INV_SUB_SYS_CD = 'PSO'" ).append("\n"); 
		query.append("    AND INV_RGST_NO = @[inv_rgst_no]" ).append("\n"); 
		query.append("    AND PPD_DTRB_NO IS NOT NULL" ).append("\n"); 
		query.append("    AND ROWNUM = 1),@[ppd_dtrb_no])" ).append("\n"); 
		query.append(" ELSE @[ppd_dtrb_no]" ).append("\n"); 
		query.append(" END, " ).append("\n"); 
		query.append(" TO_NUMBER(" ).append("\n"); 
		query.append(" CASE " ).append("\n"); 
		query.append(" WHEN @[src_ctnt] = 'SO_PORT' THEN " ).append("\n"); 
		query.append("    NVL((SELECT PPD_APLY_AMT" ).append("\n"); 
		query.append("    FROM AP_PAY_INV" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND INV_SUB_SYS_CD = 'PSO'" ).append("\n"); 
		query.append("    AND INV_RGST_NO = @[inv_rgst_no]" ).append("\n"); 
		query.append("    AND PPD_APLY_AMT IS NOT NULL" ).append("\n"); 
		query.append("    AND ROWNUM = 1),TO_NUMBER(@[ppd_aply_amt]))" ).append("\n"); 
		query.append(" ELSE TO_NUMBER(@[ppd_aply_amt])" ).append("\n"); 
		query.append(" END), " ).append("\n"); 
		query.append(" CASE " ).append("\n"); 
		query.append(" WHEN @[src_ctnt] = 'SO_PORT' THEN " ).append("\n"); 
		query.append("    NVL((SELECT PPD_GL_DT" ).append("\n"); 
		query.append("    FROM AP_PAY_INV" ).append("\n"); 
		query.append("    WHERE 1=1" ).append("\n"); 
		query.append("    AND INV_SUB_SYS_CD = 'PSO'" ).append("\n"); 
		query.append("    AND INV_RGST_NO = @[inv_rgst_no]" ).append("\n"); 
		query.append("    AND PPD_GL_DT IS NOT NULL" ).append("\n"); 
		query.append("    AND ROWNUM = 1),@[ppd_gl_dt])" ).append("\n"); 
		query.append(" ELSE @[ppd_gl_dt]" ).append("\n"); 
		query.append(" END, " ).append("\n"); 
		query.append(" @[apro_flg]                            ," ).append("\n"); 
		query.append(" @[tax_decl_flg]                        ," ).append("\n"); 
		query.append(" ''                          			," ).append("\n"); 
		query.append(" @[if_flg]                              ," ).append("\n"); 
		query.append(" @[if_dt]                               ," ).append("\n"); 
		query.append(" @[if_err_rsn]                          ," ).append("\n"); 
		query.append(" @[ppay_aply_flg]                       ," ).append("\n"); 
		query.append(" @[ap_ofc_cd]                           ," ).append("\n"); 
		query.append(" @[act_xch_rt]                          ," ).append("\n"); 
		query.append(" @[imp_err_flg]                         ," ).append("\n"); 
		query.append(" @[rcv_err_flg]                         ," ).append("\n"); 
		query.append(" @[tax_curr_xch_flg]                    ," ).append("\n"); 
		query.append(" @[usr_eml]                             ," ).append("\n"); 
		query.append(" @[imp_err_rsn]                         ," ).append("\n"); 
		query.append(" @[rcv_err_rsn]                         ," ).append("\n"); 
		query.append(" @[ftu_use_ctnt1]                       ," ).append("\n"); 
		query.append(" @[ftu_use_ctnt2]                       ," ).append("\n"); 
		query.append(" @[ftu_use_ctnt3]                       ," ).append("\n"); 
		query.append(" @[ftu_use_ctnt4]                       ," ).append("\n"); 
		query.append(" @[ftu_use_ctnt5]                       ," ).append("\n"); 
		query.append(" GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])              ," ).append("\n"); 
		query.append(" @[cre_usr_id]		                                             ," ).append("\n"); 
		query.append(" GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])" ).append("\n"); 
		query.append(" )" ).append("\n"); 

	}
}