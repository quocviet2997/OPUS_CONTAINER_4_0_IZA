/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationDBDAOSearchCargoStandardStatusListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.08
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.08 
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

public class SetupCreationDBDAOSearchCargoStandardStatusListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.02.18 정윤태 EDI CARGO STANDARD STATUS 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchCargoStandardStatusListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
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
		params.put("co_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchCargoStandardStatusListVORSQL").append("\n"); 
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
		query.append("SELECT  EDI_STND_STS_CD" ).append("\n"); 
		query.append("       ,CO_DIV_CD" ).append("\n"); 
		query.append("       ,EDI_STS_SEQ" ).append("\n"); 
		query.append("       ,EDI_STS_DESC" ).append("\n"); 
		query.append("       ,RPLN_BAT_SND_FLG" ).append("\n"); 
		query.append("       ,'' AS CRE_USR_ID" ).append("\n"); 
		query.append("	   ,'' AS UPD_USR_ID" ).append("\n"); 
		query.append("  FROM EDI_CGO_STND_STS" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${stnd_sts_cd} != '')" ).append("\n"); 
		query.append("   AND EDI_STND_STS_CD = @[stnd_sts_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${co_div_cd} != '')" ).append("\n"); 
		query.append("   AND CO_DIV_CD = @[co_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}