/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : DaoNameDAOVOVOVOVOVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.07
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.07 
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

public class DaoNameDAOVOVOVOVOVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * VOMAKER
	  * </pre>
	  */
	public DaoNameDAOVOVOVOVOVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo ").append("\n"); 
		query.append("FileName : DaoNameDAOVOVOVOVOVORSQL").append("\n"); 
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
		query.append("--// CsrListInputVO" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("'' ppay_aply_flg" ).append("\n"); 
		query.append(", '' inv_ttl_amt      " ).append("\n"); 
		query.append(", '' vndr_term_nm     " ).append("\n"); 
		query.append(", '' inv_vat_amt      " ).append("\n"); 
		query.append(", '' cost_ofc_cd      " ).append("\n"); 
		query.append(", '' pso_trns_slp_ctnt" ).append("\n"); 
		query.append(", '' inv_cfm_dt       " ).append("\n"); 
		query.append(", '' inv_net_amt      " ).append("\n"); 
		query.append(", '' inv_curr_cd      " ).append("\n"); 
		query.append(", '' whld_tax_amt     " ).append("\n"); 
		query.append(", '' inv_no           " ).append("\n"); 
		query.append(", '' iss_dt           " ).append("\n"); 
		query.append(", '' inv_rjct_sts_cd  " ).append("\n"); 
		query.append(", '' inv_sts_cd       " ).append("\n"); 
		query.append(", '' ttl_lss_div_cd   " ).append("\n"); 
		query.append(", '' pay_due_dt       " ).append("\n"); 
		query.append(", '' rcv_dt           " ).append("\n"); 
		query.append(", '' vndr_seq         " ).append("\n"); 
		query.append(", '' inv_sub_sys_cd   " ).append("\n"); 
		query.append(", '' inv_ofc_cd       " ).append("\n"); 
		query.append(", '' inv_rgst_no      " ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 

	}
}