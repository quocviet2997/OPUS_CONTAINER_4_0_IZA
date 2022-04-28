/*=========================================================
 *Copyright(c) 2012 CyberLogitec
 *@FileName : FinanceCreationDBDAORemoveEstRvvdCodeDSQL.java
 *@FileTitle : 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2012.04.17
 *@LastModifier : 이은섭
 *@LastVersion : 1.0
 * 2012.04.17 이은섭
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

public class FinanceCreationDBDAORemoveEstRvvdCodeDSQL implements ISQLTemplate {

	private StringBuffer query = new StringBuffer();

	Logger log = Logger.getLogger(this.getClass());

	/** Parameters definition in params/param elements */
	private HashMap<String, String[]> params = null;

	/**
	 * <pre>
	 * Remove GL_ESTM_REV_VVD
	 * </pre>
	 */
	public FinanceCreationDBDAORemoveEstRvvdCodeDSQL() {
		setQuery();
		params = new HashMap<String, String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("rev_yrmon", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("skd_dir_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("rev_dir_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("skd_voy_no", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("estm_ioc_div_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("exe_yrmon", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("vsl_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("estm_vvd_tp_cd", new String[] { arrTmp[0], arrTmp[1] });

		query.append("/*").append("\n");
		query.append("Path : com.clt.apps.opus.bcm.ccd.commoncode.service.integration ").append("\n");
		query.append("FileName : ServiceDBDAORemoveEstRvvdCodeDSQL").append("\n");
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
		query.append("DELETE FROM GL_ESTM_REV_VVD").append("\n");
		query.append(" WHERE EXE_YRMON 	= @[exe_yrmon]").append("\n");
		query.append("   AND REV_YRMON 	= @[rev_yrmon]").append("\n");
		query.append("   AND VSL_CD 		= @[vsl_cd]").append("\n");
		query.append("   AND SKD_VOY_NO 	= @[skd_voy_no]").append("\n");
		query.append("   AND SKD_DIR_CD 	= @[skd_dir_cd]").append("\n");
		query.append("   AND REV_DIR_CD 	= @[rev_dir_cd]").append("\n");
		query.append("   AND ESTM_VVD_TP_CD = @[estm_vvd_tp_cd]").append("\n");
		query.append("   AND ESTM_IOC_DIV_CD = @[estm_ioc_div_cd]").append("\n");

	}
}