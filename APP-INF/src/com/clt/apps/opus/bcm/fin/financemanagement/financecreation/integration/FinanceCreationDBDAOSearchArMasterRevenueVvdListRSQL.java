/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : FinanceCreationDBDAOSearchArMasterRevenueVvdListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.12.23
*@LastModifier : 
*@LastVersion : 1.0
* 2015.12.23 
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

public class FinanceCreationDBDAOSearchArMasterRevenueVvdListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * AR_MST_REV_VVD table에서 
	  * vsl_cd, vvd, rev-yrmon의 조건으로 검색을 실행
	  * </pre>
	  */
	public FinanceCreationDBDAOSearchArMasterRevenueVvdListRSQL(){
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
		params.put("vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration").append("\n"); 
		query.append("FileName : FinanceCreationDBDAOSearchArMasterRevenueVvdListRSQL").append("\n"); 
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
		query.append("VSL_CD" ).append("\n"); 
		query.append(", SKD_VOY_NO" ).append("\n"); 
		query.append(", SKD_DIR_CD" ).append("\n"); 
		query.append(", RLANE_DIR_CD" ).append("\n"); 
		query.append(", VSL_CD H_VSL_CD" ).append("\n"); 
		query.append(", SKD_VOY_NO H_SKD_VOY_NO" ).append("\n"); 
		query.append(", SKD_DIR_CD H_SKD_DIR_CD" ).append("\n"); 
		query.append(", RLANE_DIR_CD H_RLANE_DIR_CD" ).append("\n"); 
		query.append(", VOY_TP_CD" ).append("\n"); 
		query.append(", SLAN_CD" ).append("\n"); 
		query.append(", PORT_CHK_FLG" ).append("\n"); 
		query.append(", REV_PORT_CD" ).append("\n"); 
		query.append(", LOD_QTY" ).append("\n"); 
		query.append(", REV_YRMON" ).append("\n"); 
		query.append(", COM_VVD_FLG" ).append("\n"); 
		query.append(", VVD_COM_LVL" ).append("\n"); 
		query.append(", RLANE_CD" ).append("\n"); 
		query.append(", DELT_FLG" ).append("\n"); 
		query.append(", UPD_USR_ID" ).append("\n"); 
		query.append(", CRE_USR_ID" ).append("\n"); 
		query.append("FROM AR_MST_REV_VVD" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${vsl_cd} != '')" ).append("\n"); 
		query.append("AND VSL_CD = @[vsl_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${vvd} != '')" ).append("\n"); 
		query.append("AND VSL_CD||SKD_VOY_NO||SKD_DIR_CD||RLANE_DIR_CD LIKE @[vvd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rev_yrmon} != '')" ).append("\n"); 
		query.append("AND REV_YRMON = @[rev_yrmon]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}