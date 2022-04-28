/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : FinanceCreationDBDAOAddErrVvdCSQL.java
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

public class FinanceCreationDBDAOAddErrVvdCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Create GL_ERR_VVD
	  * </pre>
	  */
	public FinanceCreationDBDAOAddErrVvdCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("err_vvd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("aval_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("corr_vvd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOAddErrVvdCSQL").append("\n"); 
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
		query.append("INSERT INTO GL_ERR_VVD" ).append("\n"); 
		query.append("           (ERR_VSL_CD" ).append("\n"); 
		query.append("           ,ERR_SKD_VOY_NO" ).append("\n"); 
		query.append("           ,ERR_SKD_DIR_CD" ).append("\n"); 
		query.append("           ,ERR_REV_DIR_CD" ).append("\n"); 
		query.append("           ,CORR_VSL_CD" ).append("\n"); 
		query.append("		   ,CORR_SKD_VOY_NO" ).append("\n"); 
		query.append("		   ,CORR_SKD_DIR_CD" ).append("\n"); 
		query.append("		   ,CORR_REV_DIR_CD" ).append("\n"); 
		query.append("           ,AVAL_FLG" ).append("\n"); 
		query.append("           ,CRE_DT" ).append("\n"); 
		query.append("           ,UPD_DT" ).append("\n"); 
		query.append("           )" ).append("\n"); 
		query.append("VALUES (SUBSTR(@[err_vvd],1,4)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[err_vvd],5,4)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[err_vvd],9,1)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[err_vvd],10,1)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[corr_vvd],1,4)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[corr_vvd],5,4)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[corr_vvd],9,1)" ).append("\n"); 
		query.append("	   ,SUBSTR(@[corr_vvd],10,1)" ).append("\n"); 
		query.append("	   ,@[aval_flg]" ).append("\n"); 
		query.append("       ,SYSDATE" ).append("\n"); 
		query.append("       ,SYSDATE" ).append("\n"); 
		query.append("	)" ).append("\n"); 

	}
}