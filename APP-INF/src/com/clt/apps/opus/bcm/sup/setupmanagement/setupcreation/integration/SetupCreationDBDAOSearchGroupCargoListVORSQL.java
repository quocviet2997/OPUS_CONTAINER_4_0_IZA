/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : SetupCreationDBDAOSearchGroupCargoListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.03.24
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2017.03.24 김성욱
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Sung-Wook Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOSearchGroupCargoListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.02.23 정윤태 EDI GROUP CARGO 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchGroupCargoListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("stnd_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("co_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchGroupCargoListVORSQL").append("\n"); 
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
		query.append("SELECT  EGC.EDI_GRP_CD" ).append("\n"); 
		query.append("       ,EGC.CO_DIV_CD" ).append("\n"); 
		query.append("       ,EGC.EDI_STND_STS_CD" ).append("\n"); 
		query.append("       ,EGC.EDI_STS_SEQ" ).append("\n"); 
		query.append("       ,EGC.CUST_EDI_STS_CD" ).append("\n"); 
		query.append("       ,EGC.EDI_EVNT_CD" ).append("\n"); 
		query.append("       ,EGC.EDI_SND_FLG" ).append("\n"); 
		query.append("       ,EGC.EDI_VSL_TP_CD" ).append("\n"); 
		query.append("       ,EGC.EDI_SND_ITVAL_HRMNT" ).append("\n"); 
		query.append("       ,EGC.EDI_CNTR_SND_TP_CD" ).append("\n"); 
		query.append("       ,EGC.ORG_CONTI_DESC" ).append("\n"); 
		query.append("       ,EGC.ORG_DEST_CNT_DESC" ).append("\n"); 
		query.append("       ,EGC.DEST_CONTI_DESC" ).append("\n"); 
		query.append("       ,EGC.DEST_CNT_DESC" ).append("\n"); 
		query.append("       ,EGC.EDI_CGO_RMK" ).append("\n"); 
		query.append("       ,EGC.EDI_AUTO_SND_FLG" ).append("\n"); 
		query.append("       ,'' AS CRE_USR_ID" ).append("\n"); 
		query.append("	   ,'' AS UPD_USR_ID" ).append("\n"); 
		query.append("       ,CUST.CUST_CNT_CD" ).append("\n"); 
		query.append("       ,CUST.CUST_SEQ" ).append("\n"); 
		query.append("  FROM EDI_GRP_CGO EGC," ).append("\n"); 
		query.append("       EDI_GRP_CUST CUST" ).append("\n"); 
		query.append(" WHERE 1 =1" ).append("\n"); 
		query.append("   AND EGC.EDI_GRP_CD = CUST.EDI_GRP_CD" ).append("\n"); 
		query.append("   AND EGC.CO_DIV_CD = CUST.CO_DIV_CD" ).append("\n"); 
		query.append("#if (${grp_cd} != '')" ).append("\n"); 
		query.append("   AND EGC.EDI_GRP_CD LIKE @[grp_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${co_div_cd} != '')" ).append("\n"); 
		query.append("   AND EGC.CO_DIV_CD = @[co_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${stnd_sts_cd} != '')" ).append("\n"); 
		query.append("   AND EGC.EDI_STND_STS_CD = @[stnd_sts_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${cust_cd} != '')" ).append("\n"); 
		query.append("   AND (   CUST.CUST_CNT_CD||CUST.CUST_SEQ = @[cust_cd]" ).append("\n"); 
		query.append("        OR " ).append("\n"); 
		query.append("           CUST.SC_NO = @[cust_cd]" ).append("\n"); 
		query.append("       )" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}