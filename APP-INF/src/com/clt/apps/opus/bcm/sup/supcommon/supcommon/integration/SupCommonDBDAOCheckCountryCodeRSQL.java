/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SupCommonDBDAOCheckCountryCodeRSQL.java
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

public class SupCommonDBDAOCheckCountryCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.02.25 정윤태 MDM_COUNTRY에서 Country Code 정보를 가져온다
	  * </pre>
	  */
	public SupCommonDBDAOCheckCountryCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.supcommon.supcommon.integration").append("\n"); 
		query.append("FileName : SupCommonDBDAOCheckCountryCodeRSQL").append("\n"); 
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
		query.append("SELECT LTRIM(MAX(SYS_CONNECT_BY_PATH(CNT_CD, ',')),',') CNT_CD" ).append("\n"); 
		query.append("   FROM (" ).append("\n"); 
		query.append("	     SELECT CNT_CD, ROWNUM RNUM" ).append("\n"); 
		query.append("	       FROM MDM_COUNTRY" ).append("\n"); 
		query.append("          WHERE CNT_CD IN (#foreach($cnt_desc IN ${lst_cnt_desc})" ).append("\n"); 
		query.append("						       #if($lst_cnt_desc.hasNext()) '$cnt_desc', #else '$cnt_desc' #end" ).append("\n"); 
		query.append("						   #end" ).append("\n"); 
		query.append("						  )" ).append("\n"); 
		query.append("		    AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("        )" ).append("\n"); 
		query.append("  START WITH RNUM=1   " ).append("\n"); 
		query.append("CONNECT BY PRIOR RNUM = RNUM-1" ).append("\n"); 

	}
}