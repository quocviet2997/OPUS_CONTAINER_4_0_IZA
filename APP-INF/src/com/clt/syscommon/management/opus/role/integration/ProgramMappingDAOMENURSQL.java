/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ProgramMappingDAOMENURSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 
*@LastVersion : 1.0
* 2009.06.04 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.role.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ProgramMappingDAOMENURSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * inquiry menu
	  * </pre>
	  */
	public ProgramMappingDAOMENURSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnt_pgm_no",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("SELECT" ).append("\n"); 
		query.append("level," ).append("\n"); 
		query.append("chd_pgm_no pgm_no," ).append("\n"); 
		query.append("pgm_nm" ).append("\n"); 
		query.append("FROM (SELECT a.mnu_cfg_cd,a.prnt_pgm_no,a.chd_pgm_no,a.pgm_lvl_val,a.dp_seq" ).append("\n"); 
		query.append(",b.pgm_no,b.pgm_nm,b.pgm_url,b.pgm_lvl_div_cd" ).append("\n"); 
		query.append("FROM com_mnu_cfg a, com_program b" ).append("\n"); 
		query.append("WHERE a.chd_pgm_no = b.pgm_no(+)" ).append("\n"); 
		query.append("AND b.pgm_tp_cd(+) = '00'" ).append("\n"); 
		query.append("AND A.MNU_CFG_CD= '002'" ).append("\n"); 
		query.append("AND b.use_flg(+) = 'Y')" ).append("\n"); 
		query.append("CONNECT BY PRIOR chd_pgm_no = prnt_pgm_no" ).append("\n"); 
		query.append("START WITH PRNT_PGM_NO = @[prnt_pgm_no] AND MNU_CFG_CD= '002'" ).append("\n"); 
		query.append("ORDER SIBLINGS BY dp_seq" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.nis2010.role.integration").append("\n"); 
		query.append("FileName : ProgramMappingDAOMENURSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}