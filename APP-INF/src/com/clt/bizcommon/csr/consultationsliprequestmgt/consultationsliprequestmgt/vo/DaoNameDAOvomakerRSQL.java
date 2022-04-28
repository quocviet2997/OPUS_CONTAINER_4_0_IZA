/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : DaoNameDAOvomakerRSQL.java
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

public class DaoNameDAOvomakerRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * vo maker
	  * </pre>
	  */
	public DaoNameDAOvomakerRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo ").append("\n"); 
		query.append("FileName : DaoNameDAOvomakerRSQL").append("\n"); 
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
		query.append("--//ApPayInvDtlVO" ).append("\n"); 
		query.append("select " ).append("\n"); 
		query.append("'' vsl_cd          " ).append("\n"); 
		query.append(", '' delt_flg        " ).append("\n"); 
		query.append(", '' so_seq          " ).append("\n"); 
		query.append(", '' cre_dt          " ).append("\n"); 
		query.append(", '' inv_rgst_seq    " ).append("\n"); 
		query.append(", '' rev_dir_cd      " ).append("\n"); 
		query.append(", '' so_20ft_qty     " ).append("\n"); 
		query.append(", '' acct_cd         " ).append("\n"); 
		query.append(", '' cntr_tpsz_cd    " ).append("\n"); 
		query.append(", '' so_40ft_qty     " ).append("\n"); 
		query.append(", '' inv_amt         " ).append("\n"); 
		query.append(", '' port_cd         " ).append("\n"); 
		query.append(", '' upd_usr_id      " ).append("\n"); 
		query.append(", '' inv_rgst_no     " ).append("\n"); 
		query.append(", '' upd_dt          " ).append("\n"); 
		query.append(", '' so_ofc_cty_cd   " ).append("\n"); 
		query.append(", '' skd_voy_no      " ).append("\n"); 
		query.append(", '' skd_dir_cd      " ).append("\n"); 
		query.append(", '' so_teu_qty      " ).append("\n"); 
		query.append(", '' so_ut_qty       " ).append("\n"); 
		query.append(", '' cre_usr_id      " ).append("\n"); 
		query.append(", '' slan_cd         " ).append("\n"); 
		query.append(", '' yd_cd           " ).append("\n"); 
		query.append(", '' lgs_cost_cd     " ).append("\n"); 
		query.append(", '' act_vvd_cd      " ).append("\n"); 
		query.append(", '' inv_desc        " ).append("\n"); 
		query.append(", '' act_plc         " ).append("\n"); 
		query.append(", '' act_dt          " ).append("\n"); 
		query.append(", '' stl_key_no      " ).append("\n"); 
		query.append(", '' ownr_vndr_seq" ).append("\n"); 
		query.append("from dual" ).append("\n"); 

	}
}