/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ProgramDAOOfficeMappingCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.07.25
*@LastModifier : 
*@LastVersion : 1.0
* 2018.07.25 
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

public class ProgramDAOOfficeMappingCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * program office mapping insert all
	  * </pre>
	  */
	public ProgramDAOOfficeMappingCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.program.integration").append("\n"); 
		query.append("FileName : ProgramDAOOfficeMappingCSQL").append("\n"); 
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
		query.append("INSERT INTO COM_OFC_PGM_MTCH (" ).append("\n"); 
		query.append("OFC_CD, PGM_NO, CRE_USR_ID, CRE_DT, UPD_USR_ID, UPD_DT " ).append("\n"); 
		query.append(") " ).append("\n"); 
		query.append("SELECT OFC_CD, @[pgm_no] PGM_NO, 'SYSTEM' CRE_USR_ID, SYSDATE CRE_DT, 'SYSTEM' UPD_USR_ID, SYSDATE UPD_DT" ).append("\n"); 
		query.append("FROM MDM_ORGANIZATION                                                 " ).append("\n"); 
		query.append("WHERE DELT_FLG = 'N'                                                  " ).append("\n"); 
		query.append("CONNECT BY PRIOR OFC_CD = PRNT_OFC_CD                                 " ).append("\n"); 
		query.append("START WITH PRNT_OFC_CD IS NULL" ).append("\n"); 

	}
}