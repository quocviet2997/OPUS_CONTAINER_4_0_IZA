/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : SetupCreationDBDAOSearchCargoStatusForCustomerListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.16
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2016.03.16 김성욱
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

public class SetupCreationDBDAOSearchCargoStatusForCustomerListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Cargo Tracking Info.(Non physical event for customer) 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchCargoStatusForCustomerListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pst_edi_grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pre_edi_grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("org_edi_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchCargoStatusForCustomerListRSQL").append("\n"); 
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
		query.append("SELECT   ORG_EDI_STS_CD" ).append("\n"); 
		query.append("		,EDI_STS_SEQ" ).append("\n"); 
		query.append("		,EDI_PRE_STS_CD" ).append("\n"); 
		query.append("		,EDI_PRE_SAV_FLG" ).append("\n"); 
		query.append("		,PRE_EDI_GRP_CD" ).append("\n"); 
		query.append("		,EDI_PST_STS_CD" ).append("\n"); 
		query.append("		,EDI_PST_SAV_FLG" ).append("\n"); 
		query.append("		,PST_EDI_GRP_CD" ).append("\n"); 
		query.append("		,EDI_RMK1" ).append("\n"); 
		query.append("		,EDI_RMK2" ).append("\n"); 
		query.append("		,CRE_USR_ID" ).append("\n"); 
		query.append("		,CRE_DT" ).append("\n"); 
		query.append("		,UPD_USR_ID" ).append("\n"); 
		query.append("		,UPD_DT" ).append("\n"); 
		query.append("		,EDW_UPD_DT" ).append("\n"); 
		query.append("  FROM SCE_EDI_MNG_STS" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${org_edi_sts_cd} != '')" ).append("\n"); 
		query.append("   AND ORG_EDI_STS_CD = @[org_edi_sts_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${pre_edi_grp_cd} != '')" ).append("\n"); 
		query.append("   AND PRE_EDI_GRP_CD = @[pre_edi_grp_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${pst_edi_grp_cd} != '')" ).append("\n"); 
		query.append("   AND PST_EDI_GRP_CD = @[pst_edi_grp_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(" ORDER BY ORG_EDI_STS_CD, EDI_STS_SEQ" ).append("\n"); 

	}
}