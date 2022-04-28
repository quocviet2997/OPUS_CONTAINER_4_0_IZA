/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationDBDAOSearchYardListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.07
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.07 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOSearchYardListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.03.14 정윤태 EDI YARD 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchYardListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("yd_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchYardListVORSQL").append("\n"); 
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
		query.append("SELECT  YD_CD" ).append("\n"); 
		query.append("       ,DECODE(BKG_YD_TP_CD, 'I', NULL, BKG_YD_TP_CD) BKG_YD_TP_CD" ).append("\n"); 
		query.append("       ,PORT_CD" ).append("\n"); 
		query.append("       ,EDI_RCV_ID" ).append("\n"); 
		query.append("       ,SLAN_CD1" ).append("\n"); 
		query.append("       ,SLAN_CD2" ).append("\n"); 
		query.append("       ,SLAN_CD3" ).append("\n"); 
		query.append("       ,SLAN_CD4" ).append("\n"); 
		query.append("       ,SLAN_CD5" ).append("\n"); 
		query.append("       ,SLAN_CD6" ).append("\n"); 
		query.append("       ,SLAN_CD7" ).append("\n"); 
		query.append("       ,SLAN_CD8" ).append("\n"); 
		query.append("       ,SLAN_CD9" ).append("\n"); 
		query.append("       ,SLAN_CD10" ).append("\n"); 
		query.append("       ,BKG_AUTO_EDI_FLG" ).append("\n"); 
		query.append("       ,MTY_RLSE_EDI_FLG" ).append("\n"); 
		query.append("       ,EDI_SND_ID" ).append("\n"); 
		query.append("       ,DECODE(FULL_RLSE_EDI_CD, '0', NULL, FULL_RLSE_EDI_CD) FULL_RLSE_EDI_CD" ).append("\n"); 
		query.append("       ,BKG_MNL_EDI_FLG" ).append("\n"); 
		query.append("       ,PRE_TS_FLG" ).append("\n"); 
		query.append("       ,PST_TS_FLG" ).append("\n"); 
		query.append("       ,PST_TS_ACK_FLG" ).append("\n"); 
		query.append("       ,CRE_USR_ID" ).append("\n"); 
		query.append("       ,UPD_USR_ID" ).append("\n"); 
		query.append("  FROM BKG_EDI_YD" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${yd_cd} != '')" ).append("\n"); 
		query.append("   AND YD_CD = @[yd_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}