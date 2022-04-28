/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : RevenueVvdDBDAOArMstRevVvdVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 박광석
*@LastVersion : 1.0
* 2010.07.05 박광석
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.revenuevvd.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Prak Kwang Seok
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class RevenueVvdDBDAOArMstRevVvdVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Revenue VVD Inquiry QUERY   
	  * </pre>
	  */
	public RevenueVvdDBDAOArMstRevVvdVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.revenuevvd.integration").append("\n"); 
		query.append("FileName : RevenueVvdDBDAOArMstRevVvdVORSQL").append("\n"); 
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
		query.append("SELECT VSL_CD || SKD_VOY_NO || SKD_DIR_CD as VSL_CD," ).append("\n"); 
		query.append("	   REV_YRMON" ).append("\n"); 
		query.append("FROM   AR_MST_REV_VVD" ).append("\n"); 
		query.append("WHERE  1 = 1 " ).append("\n"); 
		query.append("#if (${vsl_cd} != '') " ).append("\n"); 
		query.append("and vsl_cd like upper(@[vsl_cd]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}