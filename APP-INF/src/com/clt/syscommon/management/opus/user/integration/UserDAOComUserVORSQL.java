/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : UserDAOComUserVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.07.18
*@LastModifier : 
*@LastVersion : 1.0
* 2018.07.18 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserDAOComUserVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select user information   
	  * </pre>
	  */
	public UserDAOComUserVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("use_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_auth_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("usr_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("s_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("RHQ",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserDAOComUserVORSQL").append("\n"); 
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
		query.append("#if (${auth_cd} != 'R')" ).append("\n"); 
		query.append("SELECT                  " ).append("\n"); 
		query.append("   a.usr_id            , " ).append("\n"); 
		query.append("   '' AS usr_pwd             , " ).append("\n"); 
		query.append("   usr_nm              , " ).append("\n"); 
		query.append("   usr_locl_nm         , " ).append("\n"); 
		query.append("   a.ofc_cd            , " ).append("\n"); 
		query.append("   nvl(lst_lgin_ofc_cd,'') cng_ofc_cd       ," ).append("\n"); 
		query.append("   NVL(usr_auth_tp_cd,'R') usr_auth_tp_cd           , " ).append("\n"); 
		query.append("   NVL(a.use_flg,'Y') use_flg       ,                   " ).append("\n"); 
		query.append("   a.mphn_no             , " ).append("\n"); 
		query.append("   DECODE(B.USR_ID,NULL,'X',0,'X','O') role_assign  , " ).append("\n"); 
		query.append("   DECODE(D.USR_ID,NULL,'X',0,'X','O') super_role_assign  , " ).append("\n"); 
		query.append("   DECODE(c.usr_id,NULL,'X',0,'X','O') pgm_assign, " ).append("\n"); 
		query.append("   xtn_phn_no          , " ).append("\n"); 
		query.append("   usr_eml             , " ).append("\n"); 
		query.append("   jb_eng_nm           , " ).append("\n"); 
		query.append("   psn_eng_nm          , " ).append("\n"); 
		query.append("   grd_eng_nm          , " ).append("\n"); 
		query.append("   cnt_cd              , " ).append("\n"); 
		query.append("   lang_tp_cd          , " ).append("\n"); 
		query.append("   gmt_tmzn_cd         , " ).append("\n"); 
		query.append("   cnt_dt_fmt_cd       , " ).append("\n"); 
		query.append("   cnt_no_fmt_cd       , " ).append("\n"); 
		query.append("   fax_no," ).append("\n"); 
		query.append("   dflt_eml," ).append("\n"); 
		query.append("   e.srep_cd," ).append("\n"); 
		query.append("   a.cre_usr_id        , " ).append("\n"); 
		query.append("   TO_CHAR(a.cre_dt,'YYYYMMDD') cre_dt             ,  " ).append("\n"); 
		query.append("   a.upd_usr_id          ,                            " ).append("\n"); 
		query.append("   TO_CHAR(a.upd_dt,'YYYYMMDD') upd_dt  ,     " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("   TO_CHAR(a.usr_lck_dt,'YYYYMMDDHH24MISS') usr_lck_dt," ).append("\n"); 
		query.append("   TO_CHAR(a.usr_pwd_cre_dt,'YYYYMMDDHH24MISS') usr_pwd_cre_dt," ).append("\n"); 
		query.append("   a.usr_lgin_fald_knt   usr_lgin_fald_knt      " ).append("\n"); 
		query.append(" FROM com_user a,        " ).append("\n"); 
		query.append("      (SELECT DISTINCT USR_ID FROM COM_USR_ROLE_MTCH) B," ).append("\n"); 
		query.append("      (SELECT DISTINCT USR_ID FROM COM_USR_PGM_MTCH) C," ).append("\n"); 
		query.append("      (SELECT DISTINCT USR_ID FROM COM_USR_ROLE_ADM_MTCH) D," ).append("\n"); 
		query.append("      mdm_sls_rep e," ).append("\n"); 
		query.append("      mdm_organization f" ).append("\n"); 
		query.append(" WHERE A.USR_ID = B.USR_ID(+)" ).append("\n"); 
		query.append(" AND a.usr_id = c.usr_id(+)" ).append("\n"); 
		query.append(" AND a.usr_id = d.usr_id(+)" ).append("\n"); 
		query.append(" AND a.usr_id = e.empe_cd(+)" ).append("\n"); 
		query.append(" AND a.ofc_cd = f.ofc_cd" ).append("\n"); 
		query.append(" AND e.DELT_FLG(+) = 'N'" ).append("\n"); 
		query.append("#if(${auth_cd} == 'S' && ${RHQ} != 'SINHO')" ).append("\n"); 
		query.append(" AND f.ar_hd_qtr_ofc_cd = @[RHQ]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${usr_id} != '')" ).append("\n"); 
		query.append(" AND upper(a.usr_id) LIKE '%'||upper(@[usr_id])||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${ofc_cd} != '')" ).append("\n"); 
		query.append(" AND f.ofc_cd = @[ofc_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${use_flg} != '')" ).append("\n"); 
		query.append(" AND NVL(a.use_flg,'Y') = @[use_flg]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${id_div} != '')" ).append("\n"); 
		query.append("#if(${id_div} == 'GID')" ).append("\n"); 
		query.append(" AND a.cre_usr_id = 'IAM'" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append(" AND a.cre_usr_id <> 'IAM'" ).append("\n"); 
		query.append("#end " ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${usr_nm} != '')" ).append("\n"); 
		query.append(" AND (upper(a.usr_locl_nm) LIKE '%'||upper(@[usr_nm])||'%' OR upper(a.usr_nm) LIKE '%'||upper(@[usr_nm])||'%' )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${usr_auth_tp_cd} != '')" ).append("\n"); 
		query.append("#if (${usr_auth_tp_cd} == 'R')" ).append("\n"); 
		query.append("	AND (a.usr_auth_tp_cd = @[usr_auth_tp_cd] OR a.usr_auth_tp_cd IS NULL)" ).append("\n"); 
		query.append("#elseif(${usr_auth_tp_cd} != '')" ).append("\n"); 
		query.append("	AND (a.usr_auth_tp_cd = @[usr_auth_tp_cd] )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(" AND a.use_flg <> 'X'" ).append("\n"); 
		query.append("ORDER BY a.usr_id" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("SELECT                  " ).append("\n"); 
		query.append("   a.usr_id            , " ).append("\n"); 
		query.append("   '' AS usr_pwd             , " ).append("\n"); 
		query.append("   usr_nm              , " ).append("\n"); 
		query.append("   usr_locl_nm         , " ).append("\n"); 
		query.append("   a.ofc_cd            , " ).append("\n"); 
		query.append("   nvl(lst_lgin_ofc_cd,'') cng_ofc_cd       ," ).append("\n"); 
		query.append("   NVL(usr_auth_tp_cd,'R') usr_auth_tp_cd           , " ).append("\n"); 
		query.append("   NVL(a.use_flg,'Y') use_flg       ,                   " ).append("\n"); 
		query.append("   a.mphn_no             , " ).append("\n"); 
		query.append("   DECODE(B.USR_ID,NULL,'X',0,'X','O') role_assign  , " ).append("\n"); 
		query.append("   DECODE(D.USR_ID,NULL,'X',0,'X','O') super_role_assign  , " ).append("\n"); 
		query.append("   DECODE(C.usr_id,NULL,'X',0,'X','O') pgm_assign, " ).append("\n"); 
		query.append("   xtn_phn_no          , " ).append("\n"); 
		query.append("   usr_eml             , " ).append("\n"); 
		query.append("   jb_eng_nm           , " ).append("\n"); 
		query.append("   psn_eng_nm          , " ).append("\n"); 
		query.append("   grd_eng_nm          , " ).append("\n"); 
		query.append("   cnt_cd              , " ).append("\n"); 
		query.append("   lang_tp_cd          , " ).append("\n"); 
		query.append("   gmt_tmzn_cd         , " ).append("\n"); 
		query.append("   cnt_dt_fmt_cd       , " ).append("\n"); 
		query.append("   cnt_no_fmt_cd       , " ).append("\n"); 
		query.append("   fax_no," ).append("\n"); 
		query.append("   dflt_eml," ).append("\n"); 
		query.append("   e.srep_cd," ).append("\n"); 
		query.append("   a.cre_usr_id        , " ).append("\n"); 
		query.append("   TO_CHAR(a.cre_dt,'YYYYMMDD') cre_dt             ,  " ).append("\n"); 
		query.append("   a.upd_usr_id          ,                            " ).append("\n"); 
		query.append("   TO_CHAR(a.upd_dt,'YYYYMMDD') upd_dt                " ).append("\n"); 
		query.append(" FROM COM_USER A,								                        " ).append("\n"); 
		query.append("      (SELECT DISTINCT USR_ID FROM COM_USR_ROLE_MTCH) B," ).append("\n"); 
		query.append("      (SELECT DISTINCT USR_ID FROM COM_USR_PGM_MTCH) C," ).append("\n"); 
		query.append("      (SELECT DISTINCT USR_ID FROM COM_USR_ROLE_ADM_MTCH) D," ).append("\n"); 
		query.append("      mdm_sls_rep e" ).append("\n"); 
		query.append(" WHERE A.USR_ID = B.USR_ID(+)" ).append("\n"); 
		query.append(" AND a.usr_id = c.usr_id(+)" ).append("\n"); 
		query.append(" AND a.usr_id = d.usr_id(+)" ).append("\n"); 
		query.append(" AND a.usr_id = e.empe_cd(+)" ).append("\n"); 
		query.append(" AND a.usr_id = @[s_usr_id]" ).append("\n"); 
		query.append(" AND e.DELT_FLG(+) = 'N'" ).append("\n"); 
		query.append(" AND a.use_flg <> 'X'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}