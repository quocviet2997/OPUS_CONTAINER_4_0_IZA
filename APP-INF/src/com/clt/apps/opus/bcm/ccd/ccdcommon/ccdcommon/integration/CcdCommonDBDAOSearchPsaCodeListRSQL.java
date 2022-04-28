/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : CcdCommonDBDAOSearchPsaCodeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.04.01
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2015.04.01 김성욱
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Sung-Wook Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CcdCommonDBDAOSearchPsaCodeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * PSA Code List 를 조회한다.
	  * </pre>
	  */
	public CcdCommonDBDAOSearchPsaCodeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration").append("\n"); 
		query.append("FileName : CcdCommonDBDAOSearchPsaCodeListRSQL").append("\n"); 
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
		query.append("SELECT ISO_CNTR_TPSZ_CD AS CD" ).append("\n"); 
		query.append("     , ISO_CNTR_TPSZ_NM AS CD_DESC" ).append("\n"); 
		query.append("  FROM MST_ISO_CNTR_TP_SZ" ).append("\n"); 

	}
}