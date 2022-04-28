/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : SetupCreationDBDAOSearchGroupListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.08.08
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2016.08.08 김성욱
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

public class SetupCreationDBDAOSearchGroupListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.02.17 정윤태 EDI GROUP 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchGroupListVORSQL(){
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
		params.put("edi_grp_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_trd_prnr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("co_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchGroupListVORSQL").append("\n"); 
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
		query.append("SELECT  EDI_GRP_CD" ).append("\n"); 
		query.append("       ,CO_DIV_CD" ).append("\n"); 
		query.append("       ,EDI_GRP_DESC" ).append("\n"); 
		query.append("       ,CUST_TRD_PRNR_ID" ).append("\n"); 
		query.append("       ,PROV_TRD_PRNR_ID" ).append("\n"); 
		query.append("       ,DELT_FLG" ).append("\n"); 
		query.append("       ,'' AS CRE_USR_ID" ).append("\n"); 
		query.append("	   ,'' AS UPD_USR_ID" ).append("\n"); 
		query.append("  FROM EDI_GROUP" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${grp_cd} != '')" ).append("\n"); 
		query.append("   AND EDI_GRP_CD = @[grp_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${co_div_cd} != '')" ).append("\n"); 
		query.append("   AND CO_DIV_CD = @[co_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${edi_grp_desc} != '')" ).append("\n"); 
		query.append("   AND UPPER(EDI_GRP_DESC) LIKE UPPER(@[edi_grp_desc]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${cust_trd_prnr_id} != '')" ).append("\n"); 
		query.append("   AND UPPER(CUST_TRD_PRNR_ID) LIKE UPPER(@[cust_trd_prnr_id]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}