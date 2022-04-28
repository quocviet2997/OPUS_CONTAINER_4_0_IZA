/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ${FILE_NAME}.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.04
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.05.04 정인선
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.eqorgchart.integration;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jung In Sun
 * @see 
 * @since J2EE 1.4
 */

public class EQOrganizationDBDAOTotalListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * EQ Organization의 총 카운트를 조회한다.
	  * </pre>
	  */
	public EQOrganizationDBDAOTotalListRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
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
		query.append("select COUNT(*)" ).append("\n"); 
		query.append("from eqr_loc_lvl" ).append("\n"); 
		query.append("#if (${idepth} != '')" ).append("\n"); 
		query.append("#if (${sccFlag} != 'Y')" ).append("\n");
		query.append("where loc_dpth_cd <> 'S'" ).append("\n"); 
		query.append("#end" ).append("\n");
		query.append("#end" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.eqorgchart.integration").append("\n"); 
		query.append("FileName : EQOrganizationDBDAOTotalListRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}