/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : CSRExternalFinderDBDAOSpCsrVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.17
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.17 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.csrcommon.csrexternalfinder.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CSRExternalFinderDBDAOSpCsrVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public CSRExternalFinderDBDAOSpCsrVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.csrcommon.csrexternalfinder.integration").append("\n"); 
		query.append("FileName : CSRExternalFinderDBDAOSpCsrVORSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("CASE" ).append("\n"); 
		query.append("WHEN COUNT(VNDR_SEQ)>0" ).append("\n"); 
		query.append("THEN 'Y'" ).append("\n"); 
		query.append("ELSE 'N'" ).append("\n"); 
		query.append("END VNDR_SEQ_EXISTING," ).append("\n"); 
		query.append("VNDR_LGL_ENG_NM," ).append("\n"); 
		query.append("'' VNDR_SEQ," ).append("\n"); 
		query.append("'' OFC_CD," ).append("\n"); 
		query.append("'' CURR_DATE," ).append("\n"); 
		query.append("'' CNT_CD" ).append("\n"); 
		query.append("FROM     MDM_VENDOR" ).append("\n"); 
		query.append("WHERE    VNDR_SEQ = @[vndr_seq]" ).append("\n"); 
		query.append("AND    NVL(DELT_FLG, 'N') = 'N'" ).append("\n"); 
		query.append("GROUP BY VNDR_LGL_ENG_NM" ).append("\n"); 

	}
}