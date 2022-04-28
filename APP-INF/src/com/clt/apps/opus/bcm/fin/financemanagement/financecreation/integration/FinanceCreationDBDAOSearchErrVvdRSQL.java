/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchErrVvdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.05.10
*@LastModifier : 장영석
*@LastVersion : 1.0
* 2012.05.10 장영석
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author jang-yeong-seok
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAOSearchErrVvdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Error Vvd조회
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchErrVvdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("err_vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchErrVvdRSQL").append("\n"); 
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
		query.append("SELECT ERR_VSL_CD" ).append("\n"); 
		query.append("     , ERR_SKD_VOY_NO" ).append("\n"); 
		query.append("     , ERR_SKD_DIR_CD" ).append("\n"); 
		query.append("     , ERR_REV_DIR_CD" ).append("\n"); 
		query.append("     , CORR_VSL_CD" ).append("\n"); 
		query.append("     , CORR_SKD_VOY_NO" ).append("\n"); 
		query.append("     , CORR_SKD_DIR_CD" ).append("\n"); 
		query.append("     , CORR_REV_DIR_CD" ).append("\n"); 
		query.append("     , AVAL_FLG" ).append("\n"); 
		query.append("     , CRE_DT" ).append("\n"); 
		query.append("     , UPD_DT     " ).append("\n"); 
		query.append("	 , ERR_VSL_CD||LPAD(ERR_SKD_VOY_NO,4,0)||ERR_SKD_DIR_CD||ERR_REV_DIR_CD AS ERR_VVD" ).append("\n"); 
		query.append("	 , CORR_VSL_CD||LPAD(CORR_SKD_VOY_NO,4,0)||CORR_SKD_DIR_CD||CORR_REV_DIR_CD AS CORR_VVD" ).append("\n"); 
		query.append("  FROM GL_ERR_VVD" ).append("\n"); 
		query.append(" WHERE" ).append("\n"); 
		query.append("	1=1" ).append("\n"); 
		query.append("#if (${err_vsl_cd} != '')" ).append("\n"); 
		query.append("   AND ERR_VSL_CD = @[err_vsl_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}