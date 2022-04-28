/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SupCommonDBDAOCheckContinentCodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.25
*@LastModifier : 
*@LastVersion : 1.0
* 2011.02.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.supcommon.supcommon.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SupCommonDBDAOCheckContinentCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.02.25 정윤태 MDM_CONTINENT에서 Continent Code 정보를 가져온다
	  * </pre>
	  */
	public SupCommonDBDAOCheckContinentCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.supcommon.supcommon.integration").append("\n"); 
		query.append("FileName : SupCommonDBDAOCheckContinentCodeRSQL").append("\n"); 
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
		query.append("SELECT LTRIM(MAX(SYS_CONNECT_BY_PATH(CONTI_CD, ',')),',') CONTI_CD" ).append("\n"); 
		query.append("   FROM (" ).append("\n"); 
		query.append("	     SELECT CONTI_CD, ROWNUM RNUM" ).append("\n"); 
		query.append("	       FROM MDM_CONTINENT" ).append("\n"); 
		query.append("          WHERE CONTI_CD IN (#foreach($conti_desc IN ${lst_conti_desc})" ).append("\n"); 
		query.append("								#if($lst_conti_desc.hasNext()) '$conti_desc', #else '$conti_desc' #end" ).append("\n"); 
		query.append("							 #end" ).append("\n"); 
		query.append("						    )" ).append("\n"); 
		query.append("		    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("        )" ).append("\n"); 
		query.append("  START WITH RNUM=1   " ).append("\n"); 
		query.append("CONNECT BY PRIOR RNUM = RNUM-1" ).append("\n"); 

	}
}