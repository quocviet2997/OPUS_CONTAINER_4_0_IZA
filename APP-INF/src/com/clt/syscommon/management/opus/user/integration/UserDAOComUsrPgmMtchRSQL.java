/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : UserDAOComUsrPgmMtchRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.26
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.26 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserDAOComUsrPgmMtchRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Inquiry the program that the user can use.
	  * </pre>
	  */
	public UserDAOComUsrPgmMtchRSQL(){
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
		params.put("login_usr_id",new String[]{arrTmp[0],arrTmp[1]});

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

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserDAOComUsrPgmMtchRSQL").append("\n"); 
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
		query.append("#if(${pgm_no} != '')" ).append("\n"); 
		query.append("SELECT DECODE(z.pgm_no, NULL, decode(Y.add_flg, null, '0', 'Y', '1'), decode(Y.add_flg, null, '1', 'N', '0')) checkbox,    " ).append("\n"); 
		query.append("			 X.pgm_no,                                                 " ).append("\n"); 
		query.append("			 X.pgm_nm," ).append("\n"); 
		query.append("			 Y.add_flg," ).append("\n"); 
		query.append("			 DECODE(Y.PGM_NO,NULL,'0','1') user_flg," ).append("\n"); 
		query.append("			 DECODE(z.PGM_NO,NULL,'0','1') role_flg," ).append("\n"); 
		query.append("			 DECODE(super.PGM_NO,NULL,'0','1') super_flg" ).append("\n"); 
		query.append("FROM 	(SELECT distinct Aa.pgm_no, Aa.pgm_nm                                         " ).append("\n"); 
		query.append("			  		FROM COM_PROGRAM Aa,                                        " ).append("\n"); 
		query.append("			  			(SELECT *                                              " ).append("\n"); 
		query.append("			  			 FROM COM_MNU_CFG     " ).append("\n"); 
		query.append("						 WHERE MNU_CFG_CD= '002'                                   " ).append("\n"); 
		query.append("			  			 CONNECT BY PRIOR chd_pgm_no = prnt_pgm_no             " ).append("\n"); 
		query.append("			  			 START WITH PRNT_PGM_NO = @[pgm_no] ) Bb" ).append("\n"); 
		query.append("			  			WHERE Aa.PGM_NO = Bb.CHD_PGM_NO " ).append("\n"); 
		query.append("						AND Aa.PGM_MNU_DIV_CD='02'                            " ).append("\n"); 
		query.append("			  		) X,    " ).append("\n"); 
		query.append("          com_usr_pgm_mtch Y,                                       " ).append("\n"); 
		query.append("	(select distinct b.pgm_no" ).append("\n"); 
		query.append("	from com_usr_role_mtch a, com_pgm_role b, com_ofc_pgm_mtch c" ).append("\n"); 
		query.append("	where a.usr_id = @[usr_id]" ).append("\n"); 
		query.append("	and c.ofc_cd = @[ofc_cd]" ).append("\n"); 
		query.append("	and a.usr_role_cd = b.usr_role_cd" ).append("\n"); 
		query.append("	and b.pgm_no = c.pgm_no) z," ).append("\n"); 
		query.append("	(select distinct e.pgm_no" ).append("\n"); 
		query.append("	from com_usr_role_adm_mtch d, com_pgm_role e" ).append("\n"); 
		query.append("	where d.usr_id = @[login_usr_id]" ).append("\n"); 
		query.append("	and d.usr_role_cd = e.usr_role_cd) super " ).append("\n"); 
		query.append("WHERE X.PGM_NO = Y.PGM_NO(+)    " ).append("\n"); 
		query.append("and x.pgm_no = z.pgm_no(+)" ).append("\n"); 
		query.append("and x.pgm_no = super.pgm_no(+)" ).append("\n"); 
		query.append("AND Y.usr_id(+) = @[usr_id]" ).append("\n"); 
		query.append("ORDER BY X.PGM_NO                                          " ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("SELECT DECODE(z.pgm_no, NULL, decode(Y.add_flg, null, '0', 'Y', '1'), decode(Y.add_flg, null, '1', 'N', '0')) checkbox," ).append("\n"); 
		query.append("			 X.pgm_no,                                                 " ).append("\n"); 
		query.append("			 X.pgm_nm," ).append("\n"); 
		query.append("			 Y.add_flg," ).append("\n"); 
		query.append("			 DECODE(Y.PGM_NO,NULL,'0','1') user_flg," ).append("\n"); 
		query.append("			 DECODE(z.PGM_NO,NULL,'0','1') role_flg," ).append("\n"); 
		query.append("			 DECODE(super.PGM_NO,NULL,'0','1') super_flg" ).append("\n"); 
		query.append("FROM COM_PROGRAM  X,                                            " ).append("\n"); 
		query.append("          com_usr_pgm_mtch Y,                                       " ).append("\n"); 
		query.append("	(select distinct b.pgm_no" ).append("\n"); 
		query.append("	from com_usr_role_mtch a, com_pgm_role b, com_ofc_pgm_mtch c" ).append("\n"); 
		query.append("	where a.usr_id = @[usr_id]" ).append("\n"); 
		query.append("	and c.ofc_cd = @[ofc_cd]" ).append("\n"); 
		query.append("	and a.usr_role_cd = b.usr_role_cd" ).append("\n"); 
		query.append("	and b.pgm_no = c.pgm_no) z," ).append("\n"); 
		query.append("	(select distinct e.pgm_no" ).append("\n"); 
		query.append("	from com_usr_role_adm_mtch d, com_pgm_role e" ).append("\n"); 
		query.append("	where d.usr_id = @[login_usr_id]" ).append("\n"); 
		query.append("	and d.usr_role_cd = e.usr_role_cd) super " ).append("\n"); 
		query.append("WHERE X.PGM_NO = Y.PGM_NO(+)    " ).append("\n"); 
		query.append("and x.pgm_no = z.pgm_no(+)" ).append("\n"); 
		query.append("and x.pgm_no = super.pgm_no(+)" ).append("\n"); 
		query.append("AND Y.usr_id(+) = @[usr_id]" ).append("\n"); 
		query.append("AND X.PGM_MNU_DIV_CD='02' " ).append("\n"); 
		query.append("ORDER BY X.PGM_NO" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}