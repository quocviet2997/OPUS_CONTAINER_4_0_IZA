/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : ItemControlManagementDBDAOsearchUiSetUpInfoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.12
*@LastModifier : 
*@LastVersion : 1.0
* 2013.07.12 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.itemcontrolmanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ItemControlManagementDBDAOsearchUiSetUpInfoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * searchUiSetUpInfo
	  * </pre>
	  */
	public ItemControlManagementDBDAOsearchUiSetUpInfoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.itemcontrolmanagement.integration").append("\n"); 
		query.append("FileName : ItemControlManagementDBDAOsearchUiSetUpInfoRSQL").append("\n"); 
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
		query.append("SELECT PGM_SUB_SYS_CD, PGM_NO, PGM_ITM_ID, CTRL_TP_CD, ITM_DP_NM, SET_TP_CD" ).append("\n"); 
		query.append("     , ITM_DESC, CRE_USR_ID, TO_CHAR(CRE_DT, 'YYYY/MM/DD HH24:MI:SS') CRE_DT, UPD_USR_ID, TO_CHAR(UPD_DT, 'YYYY/MM/DD HH24:MI:SS') UPD_DT  " ).append("\n"); 
		query.append("FROM COM_UI_ITM_CTRL_STUP" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("AND CO_ID = COM_CONSTANTMGR_PKG.COM_getCompanyCode_FNC()" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${pgm_sub_sys_cd} != '') " ).append("\n"); 
		query.append("AND PGM_SUB_SYS_CD = @[pgm_sub_sys_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append("AND PGM_NO = @[pgm_no]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("AND SET_TP_CD IN ('D', 'H', 'Y')" ).append("\n"); 
		query.append("AND APLY_FLG = 'Y'" ).append("\n"); 

	}
}