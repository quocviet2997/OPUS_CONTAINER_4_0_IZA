/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MenuDAOComMnuCfgVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.14
*@LastModifier : 
*@LastVersion : 1.0
* 2010.01.14 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MenuDAOComMnuCfgVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select menu list   
	  * </pre>
	  */
	public MenuDAOComMnuCfgVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("mnu_cfg_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.menu.integration").append("\n"); 
		query.append("FileName : MenuDAOComMnuCfgVORSQL").append("\n"); 
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
		query.append("SELECT level,chd_pgm_no,pgm_nm,dp_seq,mnu_cfg_cd,prnt_pgm_no,pgm_url," ).append("\n"); 
		query.append("#if (${acss_lvl} == 'N')" ).append("\n"); 
		query.append("'0000000' access_lvl" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("(select /*+ USE_nl(a) */ decode(sum(decode(ofc_knd_cd, '1', 1, 0)), 0, '0', '1') ||" ).append("\n"); 
		query.append("decode(sum(decode(ofc_knd_cd, '2', 1, 0)), 0, '0', '1') ||" ).append("\n"); 
		query.append("decode(sum(decode(ofc_knd_cd, '3', 1, 0)), 0, '0', '1') ||" ).append("\n"); 
		query.append("decode(sum(decode(ofc_knd_cd, '4', 1, 0)), 0, '0', '1') ||" ).append("\n"); 
		query.append("decode(sum(decode(ofc_knd_cd, '5', 1, 0)), 0, '0', '1') ||" ).append("\n"); 
		query.append("decode(sum(decode(ofc_knd_cd, '6', 1, 0)), 0, '0', '1') ||" ).append("\n"); 
		query.append("decode(sum(decode(ofc_knd_cd, '9', 1, 0)), 0, '0', '1')" ).append("\n"); 
		query.append("from com_ofc_pgm_mtch a, mdm_organization b" ).append("\n"); 
		query.append("where a.ofc_cd = b.ofc_cd" ).append("\n"); 
		query.append("and a.pgm_no = x.pgm_no)  access_lvl" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("FROM (SELECT a.mnu_cfg_cd,a.prnt_pgm_no,a.chd_pgm_no,a.pgm_lvl_val,a.dp_seq" ).append("\n"); 
		query.append(",b.pgm_no,b.pgm_nm,b.pgm_url,b.pgm_lvl_div_cd" ).append("\n"); 
		query.append("FROM com_mnu_cfg a, com_program b" ).append("\n"); 
		query.append("WHERE a.mnu_cfg_cd = @[mnu_cfg_cd]" ).append("\n"); 
		query.append("AND a.chd_pgm_no = b.pgm_no(+)" ).append("\n"); 
		query.append("AND b.pgm_tp_cd(+) = '00'" ).append("\n"); 
		query.append("AND b.use_flg(+) = 'Y') x" ).append("\n"); 
		query.append("WHERE mnu_cfg_cd = @[mnu_cfg_cd]" ).append("\n"); 
		query.append("CONNECT BY PRIOR chd_pgm_no = prnt_pgm_no" ).append("\n"); 
		query.append("START WITH prnt_pgm_no = @[pgm_no]" ).append("\n"); 
		query.append("ORDER SIBLINGS BY dp_seq" ).append("\n"); 

	}
}