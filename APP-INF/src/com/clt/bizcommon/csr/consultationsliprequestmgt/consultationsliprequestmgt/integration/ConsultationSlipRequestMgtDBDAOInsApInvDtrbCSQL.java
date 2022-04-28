/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOInsApInvDtrbCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.04
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.04 
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

public class ConsultationSlipRequestMgtDBDAOInsApInvDtrbCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOInsApInvDtrbCSQL(){
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
		params.put("dtrb_coa_rgn_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dtrb_coa_ftu_n1st_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pln_sctr_div_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("inv_tax_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("attr_ctnt6",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("line_tp_lu_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("bkg_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("yd_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("inv_desc",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("eai_evnt_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("act_vvd_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("dtrb_coa_ctr_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("attr_ctnt15",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dtrb_coa_vvd_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("attr_ctnt13",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cntr_tpsz_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("attr_ctnt11",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("so_crr_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("dtrb_coa_co_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dtrb_coa_inter_co_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ftu_use_cntr5",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ownr_vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("stl_key_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dtrb_coa_ftu_n2nd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOInsApInvDtrbCSQL").append("\n"); 
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
		query.append("INSERT" ).append("\n"); 
		query.append("INTO   AP_INV_DTRB" ).append("\n"); 
		query.append("       (" ).append("\n"); 
		query.append("              CSR_NO              ," ).append("\n"); 
		query.append("              LINE_SEQ            ," ).append("\n"); 
		query.append("              LINE_NO             ," ).append("\n"); 
		query.append("              LINE_TP_LU_CD       ," ).append("\n"); 
		query.append("              INV_AMT             ," ).append("\n"); 
		query.append("              INV_DESC            ," ).append("\n"); 
		query.append("              INV_TAX_CD          ," ).append("\n"); 
		query.append("              DTRB_COA_CO_CD      ," ).append("\n"); 
		query.append("              DTRB_COA_RGN_CD     ," ).append("\n"); 
		query.append("              DTRB_COA_CTR_CD     ," ).append("\n"); 
		query.append("              DTRB_COA_ACCT_CD    ," ).append("\n"); 
		query.append("              DTRB_COA_VVD_CD     ," ).append("\n"); 
		query.append("              DTRB_COA_INTER_CO_CD," ).append("\n"); 
		query.append("              DTRB_COA_FTU_N1ST_CD," ).append("\n"); 
		query.append("              DTRB_COA_FTU_N2ND_CD," ).append("\n"); 
		query.append("              ATTR_CATE_NM        ," ).append("\n"); 
		query.append("              ATTR_CTNT1          ," ).append("\n"); 
		query.append("              ATTR_CTNT2          ," ).append("\n"); 
		query.append("              ATTR_CTNT3          ," ).append("\n"); 
		query.append("              ATTR_CTNT4          ," ).append("\n"); 
		query.append("              ATTR_CTNT5          ," ).append("\n"); 
		query.append("              ATTR_CTNT6          ," ).append("\n"); 
		query.append("              ATTR_CTNT7          ," ).append("\n"); 
		query.append("              ATTR_CTNT8          ," ).append("\n"); 
		query.append("              ATTR_CTNT9          ," ).append("\n"); 
		query.append("              ATTR_CTNT10         ," ).append("\n"); 
		query.append("              ATTR_CTNT11         ," ).append("\n"); 
		query.append("              ATTR_CTNT12         ," ).append("\n"); 
		query.append("              ATTR_CTNT13         ," ).append("\n"); 
		query.append("              ATTR_CTNT14         ," ).append("\n"); 
		query.append("              ATTR_CTNT15         ," ).append("\n"); 
		query.append("              BKG_NO              ," ).append("\n"); 
		query.append("              CNTR_TPSZ_CD        ," ).append("\n"); 
		query.append("              ACT_VVD_CD          ," ).append("\n"); 
		query.append("              PLN_SCTR_DIV_CD     ," ).append("\n"); 
		query.append("              SO_CRR_CD           ," ).append("\n"); 
		query.append("              YD_CD               ," ).append("\n"); 
		query.append("              FTU_USE_CTNT1       ," ).append("\n"); 
		query.append("              FTU_USE_CTNT2       ," ).append("\n"); 
		query.append("              FTU_USE_CTNT3       ," ).append("\n"); 
		query.append("              FTU_USE_CTNT4       ," ).append("\n"); 
		query.append("              FTU_USE_CTNT5       ," ).append("\n"); 
		query.append("              CRE_DT              ," ).append("\n"); 
		query.append("              CRE_USR_ID          ," ).append("\n"); 
		query.append("              EAI_EVNT_DT         ," ).append("\n"); 
		query.append("              STL_KEY_NO          ," ).append("\n"); 
		query.append("              OWNR_VNDR_SEQ                     " ).append("\n"); 
		query.append("       )" ).append("\n"); 
		query.append("       VALUES" ).append("\n"); 
		query.append("       (" ).append("\n"); 
		query.append("              @[csr_no]                                                 ," ).append("\n"); 
		query.append("              @[line_seq]                                               ," ).append("\n"); 
		query.append("              @[line_no]                                                ," ).append("\n"); 
		query.append("              @[line_tp_lu_cd]                                          ," ).append("\n"); 
		query.append("              @[csr_amt]                                                ," ).append("\n"); 
		query.append("              @[inv_desc]                                               ," ).append("\n"); 
		query.append("              @[inv_tax_cd]                                             ," ).append("\n"); 
		query.append("              @[dtrb_coa_co_cd]                                         ," ).append("\n"); 
		query.append("              @[dtrb_coa_rgn_cd]                                        ," ).append("\n"); 
		query.append("              @[dtrb_coa_ctr_cd]                                        ," ).append("\n"); 
		query.append("              @[dtrb_coa_acct_cd]                                       ," ).append("\n"); 
		query.append("              @[dtrb_coa_vvd_cd]                                        ," ).append("\n"); 
		query.append("              @[dtrb_coa_inter_co_cd]                                   ," ).append("\n"); 
		query.append("              @[dtrb_coa_ftu_n1st_cd]                                   ," ).append("\n"); 
		query.append("              @[dtrb_coa_ftu_n2nd_cd]                                   ," ).append("\n"); 
		query.append("              @[attr_cate_nm]                                           ," ).append("\n"); 
		query.append("              @[attr_ctnt1]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt2]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt3]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt4]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt5]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt6]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt7]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt8]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt9]                                             ," ).append("\n"); 
		query.append("              @[attr_ctnt10]                                            ," ).append("\n"); 
		query.append("              @[attr_ctnt11]                                            ," ).append("\n"); 
		query.append("              @[attr_ctnt12]                                            ," ).append("\n"); 
		query.append("              @[attr_ctnt13]                                            ," ).append("\n"); 
		query.append("              @[attr_ctnt14]                                            ," ).append("\n"); 
		query.append("              @[attr_ctnt15]                                            ," ).append("\n"); 
		query.append("              @[bkg_no]                                                 ," ).append("\n"); 
		query.append("              @[cntr_tpsz_cd]                                           ," ).append("\n"); 
		query.append("              @[act_vvd_cd]                                             ," ).append("\n"); 
		query.append("              @[pln_sctr_div_cd]                                        ," ).append("\n"); 
		query.append("              @[so_crr_cd]                                              ," ).append("\n"); 
		query.append("              @[yd_cd]                                                  ," ).append("\n"); 
		query.append("              @[ftu_use_ctnt1]                                          ," ).append("\n"); 
		query.append("              @[ftu_use_ctnt2]                                          ," ).append("\n"); 
		query.append("              @[ftu_use_ctnt3]                                          ," ).append("\n"); 
		query.append("              @[ftu_use_ctnt4]                                          ," ).append("\n"); 
		query.append("              @[ftu_use_cntr5]                                          ," ).append("\n"); 
		query.append("              GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])				," ).append("\n"); 
		query.append("              @[cre_usr_id]                                             ," ).append("\n"); 
		query.append("              @[eai_evnt_dt]                                            ," ).append("\n"); 
		query.append("              @[stl_key_no]                                             ," ).append("\n"); 
		query.append("              @[ownr_vndr_seq]" ).append("\n"); 
		query.append("       )" ).append("\n"); 

	}
}