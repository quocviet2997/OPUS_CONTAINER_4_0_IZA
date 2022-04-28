/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchEstmVvdCreationFlagRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.30
*@LastModifier : 
*@LastVersion : 1.0
* 2016.03.30 
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

public class FinanceCreationDBDAOSearchEstmVvdCreationFlagRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 월별로 G/L Estimation VVD Creation 가능 여부를 조회한다.
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchEstmVvdCreationFlagRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("exe_yrmon",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchEstmVvdCreationFlagRSQL").append("\n"); 
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
		query.append("SELECT  XX.ACCL_YRMON" ).append("\n"); 
		query.append("    ,   CASE" ).append("\n"); 
		query.append("            WHEN XX.ACCL_YRMON > @[exe_yrmon] THEN" ).append("\n"); 
		query.append("                'Y'" ).append("\n"); 
		query.append("            ELSE" ).append("\n"); 
		query.append("                'N'" ).append("\n"); 
		query.append("        END AS BUTTON_BLOCK_FLAG" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("   SELECT  DENSE_RANK() OVER(PARTITION BY X.WRK_DT ORDER BY X.WRK_SEQ DESC) LST_SEQ" ).append("\n"); 
		query.append("             ,   X.*" ).append("\n"); 
		query.append("   FROM    SAC_ACCL_PRD X" ).append("\n"); 
		query.append(") XX" ).append("\n"); 
		query.append("WHERE   1 = 1" ).append("\n"); 
		query.append("   AND   WRK_DT = TO_CHAR(SYSDATE, 'YYYYMMDD')" ).append("\n"); 
		query.append("   AND   XX.LST_SEQ = 1" ).append("\n"); 
		query.append("   AND   ROWNUM < 2" ).append("\n"); 

	}
}