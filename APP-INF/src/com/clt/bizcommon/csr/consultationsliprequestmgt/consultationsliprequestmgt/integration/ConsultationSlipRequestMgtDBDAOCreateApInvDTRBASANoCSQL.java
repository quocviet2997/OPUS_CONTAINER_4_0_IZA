/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoCSQL.java
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

public class ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoCSQL(){
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
		params.put("iss_dt",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("cre_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("inv_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("total_amt",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoCSQL").append("\n"); 
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
		query.append("insert into AP_INV_DTRB (" ).append("\n"); 
		query.append(" csr_no                                            ," ).append("\n"); 
		query.append(" line_seq                                          ," ).append("\n"); 
		query.append(" line_no                                           ," ).append("\n"); 
		query.append(" line_tp_lu_cd                                     ," ).append("\n"); 
		query.append(" inv_amt                                           ," ).append("\n"); 
		query.append(" inv_desc                                          ," ).append("\n"); 
		query.append(" inv_tax_cd                                        ," ).append("\n"); 
		query.append(" dtrb_coa_co_cd                                    ," ).append("\n"); 
		query.append(" dtrb_coa_rgn_cd                                   ," ).append("\n"); 
		query.append(" dtrb_coa_ctr_cd                                   ," ).append("\n"); 
		query.append(" dtrb_coa_acct_cd                                  ," ).append("\n"); 
		query.append(" dtrb_coa_vvd_cd                                   ," ).append("\n"); 
		query.append(" dtrb_coa_inter_co_cd                              ," ).append("\n"); 
		query.append(" dtrb_coa_ftu_n1st_cd                              ," ).append("\n"); 
		query.append(" dtrb_coa_ftu_n2nd_cd                              ," ).append("\n"); 
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
		query.append(" bkg_no                                            ," ).append("\n"); 
		query.append(" cntr_tpsz_cd                                      ," ).append("\n"); 
		query.append(" act_vvd_cd                                        ," ).append("\n"); 
		query.append(" pln_sctr_div_cd                                   ," ).append("\n"); 
		query.append(" so_crr_cd                                         ," ).append("\n"); 
		query.append(" yd_cd                                             ," ).append("\n"); 
		query.append(" ftu_use_ctnt1                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt2                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt3                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt4                                     ," ).append("\n"); 
		query.append(" ftu_use_ctnt5                                     ," ).append("\n"); 
		query.append(" cre_dt                                            ," ).append("\n"); 
		query.append(" cre_usr_id                                        ," ).append("\n"); 
		query.append(" eai_evnt_dt" ).append("\n"); 
		query.append("  ) values (" ).append("\n"); 
		query.append(" @[csr_no]                                              ," ).append("\n"); 
		query.append(" @[line_seq]                                            ," ).append("\n"); 
		query.append(" @[line_no]                                             ," ).append("\n"); 
		query.append(" DECODE(@[cre_tp_cd], 'P', 'MISCELLANEOUS', 'ITEM') ," ).append("\n"); 
		query.append(" @[total_amt]                                           ," ).append("\n"); 
		query.append(" (SELECT acct_eng_nm FROM mdm_account " ).append("\n"); 
		query.append("  WHERE acct_cd = (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append("  WHERE ROWNUM = 1" ).append("\n"); 
		query.append("    AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("    AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("    AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("    AND D.HRD_CDG_ID = 'LEGY_SYS_CLEARING'))," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" '01'                                               ," ).append("\n"); 
		query.append(" (SELECT finc_rgn_cd FROM MDM_ORGANIZATION WHERE ofc_cd = @[cost_ofc_cd] AND NVL(delt_flg,'N') = 'N')," ).append("\n"); 
		query.append(" (SELECT ap_ctr_cd FROM MDM_ORGANIZATION WHERE ofc_cd = @[cost_ofc_cd] AND NVL(delt_flg,'N') = 'N')," ).append("\n"); 
		query.append(" (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append("  WHERE ROWNUM = 1" ).append("\n"); 
		query.append("    AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("    AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("    AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("    AND D.HRD_CDG_ID = 'LEGY_SYS_CLEARING')," ).append("\n"); 
		query.append(" '0000000000'                                               ," ).append("\n"); 
		query.append(" (SELECT NVL(subs_co_cd, '00') FROM mdm_vendor WHERE vndr_seq = @[vndr_seq])," ).append("\n"); 
		query.append(" '000000'                                                  ," ).append("\n"); 
		query.append(" '000000'                                                  ," ).append("\n"); 
		query.append(" (SELECT C.ATTR_CTNT1" ).append("\n"); 
		query.append("   FROM COM_ACCT_HRD_CDG_DESC D, COM_ACCT_HRD_CDG_CTNT C" ).append("\n"); 
		query.append("  WHERE ROWNUM = 1" ).append("\n"); 
		query.append("    AND D.SRC_MDL_CD = C.SRC_MDL_CD" ).append("\n"); 
		query.append("    AND D.HRD_CDG_ID = C.HRD_CDG_ID" ).append("\n"); 
		query.append("    AND D.SRC_MDL_CD = 'CSR'" ).append("\n"); 
		query.append("    AND D.HRD_CDG_ID = 'LEGY_SYS_CLEARING')," ).append("\n"); 
		query.append(" @[inv_no]                                                 ," ).append("\n"); 
		query.append(" @[iss_dt]                                                 ," ).append("\n"); 
		query.append(" NVL(NVL(@[loc_cd], (SELECT MAX(ATTR_CTNT3) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ATTR_CTNT3 IS NOT NULL)), (SELECT LOC_CD FROM MDM_ORGANIZATION WHERE OFC_CD = @[cost_ofc_cd])), " ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" NVL((SELECT ASA_PRD_TO_DT FROM SAR_ASA_MST WHERE ASA_NO = (SELECT ATTR_CTNT2 FROM AP_INV_HDR WHERE CSR_NO = @[csr_no])), SUBSTR(REPLACE(@[iss_dt], '/', ''), 1, 8))," ).append("\n"); 
		query.append(" NVL((SELECT MAX(ATTR_CTNT12) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ATTR_CTNT12 IS NOT NULL), @[cost_ofc_cd])," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" NVL((SELECT MAX(ATTR_CTNT14) FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ATTR_CTNT14 IS NOT NULL), 'CNT')," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" 'O'                                                ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" ''                                                 ," ).append("\n"); 
		query.append(" GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])       ," ).append("\n"); 
		query.append(" @[cre_usr_id]                                      ," ).append("\n"); 
		query.append(" GLOBALDATE_PKG.TIME_LOCAL_OFC_FNC(@[ofc_cd])" ).append("\n"); 
		query.append(" )" ).append("\n"); 

	}
}