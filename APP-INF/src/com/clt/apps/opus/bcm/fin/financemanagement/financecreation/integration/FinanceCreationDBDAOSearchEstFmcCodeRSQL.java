/*=========================================================
 *Copyright(c) 2012 CyberLogitec
 *@FileName : FinanceCreationDBDAOSearchEstFmcCodeRSQL.java
 *@FileTitle : 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2012.04.18
 *@LastModifier : 이은섭
 *@LastVersion : 1.0
 * 2012.04.18 이은섭
 * 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 * 
 * @author EUN-SUP LEE
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinanceCreationDBDAOSearchEstFmcCodeRSQL implements ISQLTemplate {

	private StringBuffer query = new StringBuffer();

	Logger log = Logger.getLogger(this.getClass());

	/** Parameters definition in params/param elements */
	private HashMap<String, String[]> params = null;

	/**
	 * <pre>
	 * .
	 * </pre>
	 */
	public FinanceCreationDBDAOSearchEstFmcCodeRSQL() {
		setQuery();
		params = new HashMap<String, String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("gl_misc_n2nd_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("gl_misc_n3rd_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("gl_misc_n1st_cd", new String[] { arrTmp[0], arrTmp[1] });

		query.append("/*").append("\n");
		query.append("Path : com.clt.apps.opus.bcm.ccd.commoncode.service.integration").append("\n");
		query.append("FileName : ServiceDBDAOSearchEstFmcCodeRSQL").append("\n");
		query.append("*/").append("\n");
	}

	public String getSQL() {
		return query.toString();
	}

	public HashMap<String, String[]> getParams() {
		return params;
	}

	/**
	 * Query 생성
	 */
	public void setQuery() {
		query.append("SELECT GL_MISC_N1ST_CD,").append("\n");
		query.append("       GL_MISC_N2ND_CD,").append("\n");
		query.append("       GL_MISC_N3RD_CD,").append("\n");
		query.append("       ENT_NM,").append("\n");
		query.append("       ENT_ABBR_NM,").append("\n");
		query.append("       DELT_FLG,").append("\n");
		query.append("       CRE_DT,").append("\n");
		query.append("       UPD_USR_ID,").append("\n");
		query.append("       UPD_DT,").append("\n");
		query.append("       EAI_EVNT_DT").append("\n");
		query.append("  FROM GL_FMC_ENT").append("\n");
		query.append("	WHERE 1=1").append("\n");
		query.append("#if (${gl_misc_n1st_cd} != '') ").append("\n");
		query.append("		AND   GL_MISC_N1ST_CD    = @[gl_misc_n1st_cd]").append("\n");
		query.append("#end").append("\n");
		query.append("#if (${gl_misc_n2nd_cd} != '') ").append("\n");
		query.append("		AND   GL_MISC_N2ND_CD    = @[gl_misc_n2nd_cd]").append("\n");
		query.append("#end").append("\n");
		query.append("#if (${gl_misc_n3rd_cd} != '') ").append("\n");
		query.append("		AND   GL_MISC_N3RD_CD    = @[gl_misc_n3rd_cd]").append("\n");
		query.append("#end").append("\n");

	}
}