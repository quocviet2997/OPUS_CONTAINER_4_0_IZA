/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SuperUserDAOSubSystemRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.06.01
*@LastModifier : 
*@LastVersion : 1.0
* 2010.06.01 
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

public class SuperUserDAOSubSystemRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * sub system code query
	  * </pre>
	  */
	public SuperUserDAOSubSystemRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.superuser.integration").append("\n"); 
		query.append("FileName : SuperUserDAOSubSystemRSQL").append("\n"); 
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
		query.append("select distinct substr(chd_pgm_no,5,3) sub_sys_cd" ).append("\n"); 
		query.append("from com_mnu_cfg" ).append("\n"); 
		query.append("where chd_pgm_no not like 'COM%'" ).append("\n"); 
		query.append("and chd_pgm_no not like '%000%'" ).append("\n"); 
		query.append("start with prnt_pgm_no = '000_000_M000'" ).append("\n"); 
		query.append("connect by prior chd_pgm_no = prnt_pgm_no" ).append("\n"); 
		query.append("and level = 2" ).append("\n"); 

	}
}