/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : LocationDBDAOSearchLocationDetailRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.20
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.20 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.location.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class LocationDBDAOSearchLocationDetailRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * LocationDAOsearchLocationDetail
	  * </pre>
	  */
	public LocationDBDAOSearchLocationDetailRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.location.integration").append("\n"); 
		query.append("FileName : LocationDBDAOSearchLocationDetailRSQL").append("\n"); 
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
		query.append("	A.LOC_CD," ).append("\n"); 
		query.append("	A.LOC_NM," ).append("\n"); 
		query.append("	A.RGN_CD," ).append("\n"); 
		query.append("	C.SCC_CD," ).append("\n"); 
		query.append("	C.LCC_CD," ).append("\n"); 
		query.append("	C.ECC_CD," ).append("\n"); 
		query.append("	A.SLS_OFC_CD," ).append("\n"); 
		query.append("	A.STE_CD LOC_STATE," ).append("\n"); 
		query.append("	A.HUB_LOC_CD," ).append("\n"); 
		query.append("	A.UN_LOC_CD," ).append("\n"); 
		query.append("	A.LOC_CHR_CD," ).append("\n"); 
		query.append("	A.ZIP_CD," ).append("\n"); 
		query.append("	A.EQ_CTRL_OFC_CD," ).append("\n"); 
		query.append("	A.FINC_CTRL_OFC_CD," ).append("\n"); 
		query.append("	A.CONTI_CD||' - '||B.CONTI_NM CONTI_NM," ).append("\n"); 
		query.append("	DECODE(A.PORT_INLND_FLG,'Y','PORT','INLAND') PORT_INLND_FLG," ).append("\n"); 
		query.append("	DECODE(A.CALL_PORT_FLG,'N','NO','YES') CALL_PORT_FLG," ).append("\n"); 
		query.append("	A.REP_ZN_CD," ).append("\n"); 
		query.append("	A.HUB_LOC_CD," ).append("\n"); 
		query.append("	A.LOC_GRD_NO," ).append("\n"); 
		query.append("	DECODE(A.CML_ZN_FLG,'N','NO','YES') CML_ZN_FLG," ).append("\n"); 
		query.append("	A.LOC_AMS_PORT_CD," ).append("\n"); 
		query.append("	A.GMT_HRS," ).append("\n"); 
		query.append("	A.CSTMS_CD," ).append("\n"); 
		query.append("	D.SCONTI_CD," ).append("\n"); 
		query.append("	B.CONTI_NM COUNTRY," ).append("\n"); 
		query.append("	A.LOC_LAT PORT_LAT," ).append("\n"); 
		query.append("	A.LOC_LON PORT_LON" ).append("\n"); 
		query.append("FROM MDM_LOCATION A, MDM_CONTINENT B, MDM_EQ_ORZ_CHT C, MDM_SUBCONTINENT D" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND A.CONTI_CD = B.CONTI_CD" ).append("\n"); 
		query.append("AND A.SCC_CD = C.SCC_CD(+)" ).append("\n"); 
		query.append("AND A.CONTI_CD = D.CONTI_CD" ).append("\n"); 
		query.append("AND A.SCONTI_CD = D.SCONTI_CD" ).append("\n"); 
		query.append("AND A.LOC_CD = @[loc_cd]" ).append("\n"); 

	}
}