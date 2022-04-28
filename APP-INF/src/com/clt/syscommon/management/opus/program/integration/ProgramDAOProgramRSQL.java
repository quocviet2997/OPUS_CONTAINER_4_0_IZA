/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ProgramDAOProgramRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.21 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.program.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ProgramDAOProgramRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select program list information
	  * </pre>
	  */
	public ProgramDAOProgramRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_mnu_div_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.program.integration").append("\n"); 
		query.append("FileName : ProgramDAOProgramRSQL").append("\n"); 
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
		query.append("SELECT " ).append("\n"); 
		query.append("A.pgm_no, " ).append("\n"); 
		query.append("A.pgm_nm, " ).append("\n"); 
		query.append("A.pgm_desc, " ).append("\n"); 
		query.append("A.pgm_url," ).append("\n"); 
		query.append("DECODE(B.PGM_NO,NULL,'X',0,'X','O') ROLES, " ).append("\n"); 
		query.append("DECODE(C.PGM_NO,NULL,'X',0,'X','O') OFCS, " ).append("\n"); 
		query.append("A.pgm_mnu_div_cd, " ).append("\n"); 
		query.append("A.pgm_tp_cd, " ).append("\n"); 
		query.append("A.pgm_sts_cd, " ).append("\n"); 
		query.append("A.dev_nm," ).append("\n"); 
		query.append("to_char(dev_dt, 'yyyymmdd') dev_dt, " ).append("\n"); 
		query.append("A.popup_flg, " ).append("\n"); 
		query.append("A.use_flg" ).append("\n"); 
		query.append("FROM com_program A, (SELECT DISTINCT C1.PGM_NO PGM_NO FROM COM_PGM_ROLE C1) B," ).append("\n"); 
		query.append("(SELECT DISTINCT C1.PGM_NO PGM_NO FROM COM_OFC_PGM_MTCH C1) C" ).append("\n"); 
		query.append("WHERE A.PGM_NO = B.PGM_NO(+)" ).append("\n"); 
		query.append("AND A.PGM_NO = C.PGM_NO(+)" ).append("\n"); 
		query.append("#if (${pgm_tp_cd} != '') " ).append("\n"); 
		query.append("and	A.pgm_tp_cd = @[pgm_tp_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_mnu_div_cd} != '') " ).append("\n"); 
		query.append("and	A.pgm_mnu_div_cd = @[pgm_mnu_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append("and	A.pgm_no like '%'|| @[pgm_no] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_nm} != '') " ).append("\n"); 
		query.append("and	UPPER(A.pgm_nm) like '%'|| UPPER(@[pgm_nm]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}