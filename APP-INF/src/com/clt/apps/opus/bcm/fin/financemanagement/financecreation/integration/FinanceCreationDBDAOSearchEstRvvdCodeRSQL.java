/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchEstRvvdCodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.05.02
*@LastModifier : 
*@LastVersion : 1.0
* 2016.05.02 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAOSearchEstRvvdCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * GL_ESTM_REV_VVD
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchEstRvvdCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vvd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rev_yrmon",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("exe_yrmon",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchEstRvvdCodeRSQL").append("\n"); 
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
		query.append("SELECT EXE_YRMON," ).append("\n"); 
		query.append("       REV_YRMON," ).append("\n"); 
		query.append("       VSL_CD," ).append("\n"); 
		query.append("       SKD_VOY_NO," ).append("\n"); 
		query.append("       SKD_DIR_CD," ).append("\n"); 
		query.append("       REV_DIR_CD," ).append("\n"); 
		query.append("       ESTM_VVD_TP_CD," ).append("\n"); 
		query.append("       ESTM_IOC_DIV_CD," ).append("\n"); 
		query.append("       ESTM_VVD_HDR_ID," ).append("\n"); 
		query.append("       ESTM_BC_DIV_CD," ).append("\n"); 
		query.append("       VST_DT," ).append("\n"); 
		query.append("       VED_DT," ).append("\n"); 
		query.append("       RLANE_CD," ).append("\n"); 
		query.append("       LINE_NO," ).append("\n"); 
		query.append("       CRE_DT," ).append("\n"); 
		query.append("       CRE_USR_ID," ).append("\n"); 
		query.append("       UPD_DT," ).append("\n"); 
		query.append("       UPD_USR_ID" ).append("\n"); 
		query.append("       ,NVL(IF_FLG, 'N') AS IF_FLG" ).append("\n"); 
		query.append("  FROM GL_ESTM_REV_VVD" ).append("\n"); 
		query.append("	WHERE " ).append("\n"); 
		query.append("		1=1" ).append("\n"); 
		query.append("       AND ESTM_BC_DIV_CD = 'C'" ).append("\n"); 
		query.append("       AND ESTM_VVD_TP_CD = 'RV'" ).append("\n"); 
		query.append("#if (${exe_yrmon} != '') " ).append("\n"); 
		query.append("		AND   	EXE_YRMON	= @[exe_yrmon]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rev_yrmon} != '') " ).append("\n"); 
		query.append("		AND  	REV_YRMON	= @[rev_yrmon]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${vsl_cd} != '') " ).append("\n"); 
		query.append("		AND   	VSL_CD    	= @[vsl_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${vvd} != '')" ).append("\n"); 
		query.append("		AND		VSL_CD||SKD_VOY_NO||SKD_DIR_CD||REV_DIR_CD LIKE @[vvd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}