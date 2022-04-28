/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MenuDAOMnuCfgExcelRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.04
*@LastModifier : 
*@LastVersion : 1.0
* 2009.12.04 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MenuDAOMnuCfgExcelRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * query for Excel download
	  * </pre>
	  */
	public MenuDAOMnuCfgExcelRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("select substr(regexp_substr(scbp, '#[^#",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.menu.integration").append("\n"); 
		query.append("FileName : MenuDAOMnuCfgExcelRSQL").append("\n"); 
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
		query.append("select substr(regexp_substr(scbp, '#[^#]*', 1, 1),2) as lvl1," ).append("\n"); 
		query.append("substr(regexp_substr(scbp, '#[^#]*', 1, 2),2) as lvl2," ).append("\n"); 
		query.append("substr(regexp_substr(scbp, '#[^#]*', 1, 3),2) as lvl3," ).append("\n"); 
		query.append("substr(regexp_substr(scbp, '#[^#]*', 1, 4),2) as lvl4," ).append("\n"); 
		query.append("substr(regexp_substr(scbp, '#[^#]*', 1, 5),2) as lvl5," ).append("\n"); 
		query.append("substr(regexp_substr(scbp, '#[^#]*', 1, 6),2) as lvl6," ).append("\n"); 
		query.append("a.pgm_no, a.pgm_desc, a.pgm_url" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("select sys_connect_by_path(B.PGM_NM, '#') scbp" ).append("\n"); 
		query.append(", b.pgm_no, b.pgm_url, b.pgm_desc" ).append("\n"); 
		query.append("FROM  COM_MNU_CFG A, COM_PROGRAM B" ).append("\n"); 
		query.append("WHERE A.CHD_PGM_NO = B.PGM_NO" ).append("\n"); 
		query.append("START WITH A.PRNT_PGM_NO = '000_000_M000'" ).append("\n"); 
		query.append("CONNECT BY PRIOR A.CHD_PGM_NO = A.PRNT_PGM_NO" ).append("\n"); 
		query.append("ORDER SIBLINGS BY a.DP_SEQ" ).append("\n"); 
		query.append(") a" ).append("\n"); 

	}
}