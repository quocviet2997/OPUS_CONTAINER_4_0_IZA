/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.04.06
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2015.04.06 김성욱
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

public class SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.03.07 정윤태 EDI TRADE PARTNER SUB LINK 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnr_sub_lnk_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnr_sub_lnk_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnr_port_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkListVORSQL").append("\n"); 
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
		query.append("SELECT  TRD_PRNR_SUB_LNK_SEQ" ).append("\n"); 
		query.append("       ,PRNR_SUB_LNK_DIV_CD" ).append("\n"); 
		query.append("       ,PRNR_SUB_LNK_CD" ).append("\n"); 
		query.append("       ,SNDR_TRD_PRNR_ID" ).append("\n"); 
		query.append("       ,RCVR_TRD_PRNR_ID" ).append("\n"); 
		query.append("       ,PRNR_PORT_CD" ).append("\n"); 
		query.append("       ,EDI_SND_FLG" ).append("\n"); 
		query.append("       ,'' AS CRE_USR_ID" ).append("\n"); 
		query.append("	   ,'' AS UPD_USR_ID" ).append("\n"); 
		query.append("  FROM BKG_EDI_TRD_PRNR_SUB_LNK" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("   AND PRNR_SUB_LNK_DIV_CD = @[prnr_sub_lnk_div_cd]" ).append("\n"); 
		query.append("#if (${prnr_sub_lnk_cd} != '')" ).append("\n"); 
		query.append("   AND PRNR_SUB_LNK_CD = @[prnr_sub_lnk_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${prnr_port_cd} != '')" ).append("\n"); 
		query.append("   AND PRNR_PORT_CD LIKE @[prnr_port_cd]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(" ORDER BY TRD_PRNR_SUB_LNK_SEQ ASC" ).append("\n"); 

	}
}