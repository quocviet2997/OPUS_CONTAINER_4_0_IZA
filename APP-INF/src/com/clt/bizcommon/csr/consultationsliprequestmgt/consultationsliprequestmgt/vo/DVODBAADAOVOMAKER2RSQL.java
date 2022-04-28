/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : DVODBAADAOVOMAKER2RSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.04
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.04 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class DVODBAADAOVOMAKER2RSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * VO MAKER2
	  * </pre>
	  */
	public DVODBAADAOVOMAKER2RSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo ").append("\n"); 
		query.append("FileName : DVODBAADAOVOMAKER2RSQL").append("\n"); 
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
		query.append("--SearchDTRBTtlVO" ).append("\n"); 
		query.append("SELECT " ).append("\n"); 
		query.append("'' line_seq                       " ).append("\n"); 
		query.append(", '' attr_ctnt10                    " ).append("\n"); 
		query.append(", '' cre_dt                         " ).append("\n"); 
		query.append(", '' ftu_use_cntr5                  " ).append("\n"); 
		query.append(", '' attr_ctnt14                    " ).append("\n"); 
		query.append(", '' attr_ctnt9                     " ).append("\n"); 
		query.append(", '' attr_ctnt13                    " ).append("\n"); 
		query.append(", '' attr_ctnt8                     " ).append("\n"); 
		query.append(", '' attr_ctnt12                    " ).append("\n"); 
		query.append(", '' attr_ctnt11                    " ).append("\n"); 
		query.append(", '' attr_ctnt15                    " ).append("\n"); 
		query.append(", '' dtrb_coa_inter_co_cd           " ).append("\n"); 
		query.append(", '' attr_ctnt1                     " ).append("\n"); 
		query.append(", '' inv_desc                       " ).append("\n"); 
		query.append(", '' attr_ctnt2                     " ).append("\n"); 
		query.append(", '' attr_ctnt3                     " ).append("\n"); 
		query.append(", '' attr_ctnt4                     " ).append("\n"); 
		query.append(", '' attr_ctnt5                     " ).append("\n"); 
		query.append(", '' attr_ctnt6                     " ).append("\n"); 
		query.append(", '' cntr_tpsz_cd                   " ).append("\n"); 
		query.append(", '' attr_ctnt7                     " ).append("\n"); 
		query.append(", '' ftu_use_ctnt2                  " ).append("\n"); 
		query.append(", '' ftu_use_ctnt1                  " ).append("\n"); 
		query.append(", '' line_tp_lu_cd                  " ).append("\n"); 
		query.append(", '' attr_cate_nm                   " ).append("\n"); 
		query.append(", '' ftu_use_ctnt4                  " ).append("\n"); 
		query.append(", '' ftu_use_ctnt3                  " ).append("\n"); 
		query.append(", '' dtrb_coa_acct_cd               " ).append("\n"); 
		query.append(", '' dtrb_coa_ftu_n1st_cd           " ).append("\n"); 
		query.append(", '' dtrb_coa_co_cd                 " ).append("\n"); 
		query.append(", '' so_crr_cd                      " ).append("\n"); 
		query.append(", '' dtrb_coa_ctr_cd                " ).append("\n"); 
		query.append(", '' inv_tax_cd                     " ).append("\n"); 
		query.append(", '' pln_sctr_div_cd                " ).append("\n"); 
		query.append(", '' line_no                        " ).append("\n"); 
		query.append(", '' eai_evnt_dt                    " ).append("\n"); 
		query.append(", '' cre_usr_id                     " ).append("\n"); 
		query.append(", '' bkg_no                         " ).append("\n"); 
		query.append(", '' yd_cd                          " ).append("\n"); 
		query.append(", '' dtrb_coa_vvd_cd                " ).append("\n"); 
		query.append(", '' csr_amt                        " ).append("\n"); 
		query.append(", '' act_vvd_cd                     " ).append("\n"); 
		query.append(", '' dtrb_coa_ftu_n2nd_cd           " ).append("\n"); 
		query.append(", '' dtrb_coa_rgn_cd                " ).append("\n"); 
		query.append(", '' stl_key_no   " ).append("\n"); 
		query.append(", '' ownr_vndr_seq" ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 

	}
}