/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : CcdCommonDBDAOSearchOfficeList.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.01.26
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2015.01.26 김성욱
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

public class CcdCommonDBDAOSearchOfficeList implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * office code 조회한다.
	  * </pre>
	  */
	public CcdCommonDBDAOSearchOfficeList(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration").append("\n"); 
		query.append("FileName : CcdCommonDBDAOSearchOfficeList").append("\n"); 
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
		query.append("SELECT OFC_CD CD , OFC_CD CD_DESC" ).append("\n"); 
		query.append(" FROM MDM_ORGANIZATION" ).append("\n"); 
		query.append(" WHERE OFC_KND_CD IN ('1', '2') AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append(" ORDER BY OFC_KND_CD DESC" ).append("\n"); 

	}
}