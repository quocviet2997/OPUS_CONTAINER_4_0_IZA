/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : SuperUserDAOSuperUserRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.21 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.superuser.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SuperUserDAOSuperUserRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Super user list query
	  * </pre>
	  */
	public SuperUserDAOSuperUserRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("admin",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_nm",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rhq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.superuser.integration").append("\n"); 
		query.append("FileName : SuperUserDAOSuperUserRSQL").append("\n"); 
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
		query.append("select a.usr_id, a.usr_locl_nm, a.usr_nm," ).append("\n"); 
		query.append("b.ar_hd_qtr_ofc_cd rhq, b.ofc_cd," ).append("\n"); 
		query.append("a.xtn_phn_no, a.usr_eml," ).append("\n"); 
		query.append("#if (${opt} == 'D') " ).append("\n"); 
		query.append("c.pgm_no, c.pgm_nm," ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("'' pgm_no, '' pgm_nm," ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("d.pgm_no module, d.add_flg admin, d.cre_dt" ).append("\n"); 
		query.append("from com_user a, mdm_organization b," ).append("\n"); 
		query.append("#if (${opt} == 'D') " ).append("\n"); 
		query.append("com_program c," ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("com_usr_pgm_mtch d" ).append("\n"); 
		query.append("where a.ofc_cd = b.ofc_cd" ).append("\n"); 
		query.append("and a.usr_id = d.usr_id" ).append("\n"); 
		query.append("and length(d.pgm_no) = 3" ).append("\n"); 
		query.append("#if (${opt} == 'D') " ).append("\n"); 
		query.append("and d.pgm_no = substr(c.pgm_no,5,3)" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${usr_id} != '') " ).append("\n"); 
		query.append("and a.usr_id like '%'||@[usr_id]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${usr_nm} != '')" ).append("\n"); 
		query.append(" AND (UPPER(A.USR_LOCL_NM) LIKE '%'||UPPER(@[usr_nm])||'%' OR UPPER(A.USR_NM) LIKE '%'||UPPER(@[usr_nm])||'%' )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${ofc_cd} != '') " ).append("\n"); 
		query.append("and b.ofc_cd like @[ofc_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rhq} != '') " ).append("\n"); 
		query.append("and b.AR_HD_QTR_OFC_CD = @[rhq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${opt} == 'D') " ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append("and c.pgm_no like '%'||@[pgm_no]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_nm} != '') " ).append("\n"); 
		query.append("and UPPER(c.pgm_nm) like '%'||UPPER(@[pgm_nm])||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${module} != '') " ).append("\n"); 
		query.append("and d.pgm_no in ('${module}')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${admin} != '') " ).append("\n"); 
		query.append("and d.add_flg = @[admin]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}