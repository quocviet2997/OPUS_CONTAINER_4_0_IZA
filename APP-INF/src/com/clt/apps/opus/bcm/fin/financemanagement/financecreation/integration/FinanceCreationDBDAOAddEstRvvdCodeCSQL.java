/*=========================================================
 *Copyright(c) 2012 CyberLogitec
 *@FileName : FinanceCreationDBDAOAddEstRvvdCodeCSQL.java
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

public class FinanceCreationDBDAOAddEstRvvdCodeCSQL implements ISQLTemplate {

	private StringBuffer query = new StringBuffer();

	Logger log = Logger.getLogger(this.getClass());

	/** Parameters definition in params/param elements */
	private HashMap<String, String[]> params = null;

	/**
	 * <pre>
	 * Create GL_ESTM_REV_VVD
	 * </pre>
	 */
	public FinanceCreationDBDAOAddEstRvvdCodeCSQL() {
		setQuery();
		params = new HashMap<String, String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("line_no", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("rlane_cd", new String[] { arrTmp[0], arrTmp[1] });

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
		params.put("vst_dt", new String[] { arrTmp[0], arrTmp[1] });

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
		params.put("estm_vvd_hdr_id", new String[] { arrTmp[0], arrTmp[1] });

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
		params.put("upd_usr_id", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("estm_bc_div_cd", new String[] { arrTmp[0], arrTmp[1] });

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		params.put("ved_dt", new String[] { arrTmp[0], arrTmp[1] });

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
		params.put("cre_usr_id", new String[] { arrTmp[0], arrTmp[1] });

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
		params.put("estm_vvd_tp_cd", new String[] { arrTmp[0], arrTmp[1] });

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
		params.put("exe_yrmon", new String[] { arrTmp[0], arrTmp[1] });

		query.append("/*").append("\n");
		query.append("Path : com.clt.apps.opus.bcm.ccd.commoncode.service.integration").append("\n");
		query.append("FileName : ServiceDBDAOAddEstRvvdCodeCSQL").append("\n");
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
		query.append("MERGE INTO GL_ESTM_REV_VVD A").append("\n");
		query.append("USING DUAL").append("\n");
		query.append("ON (").append("\n");
		query.append("		A.EXE_YRMON 		= @[exe_yrmon] ").append("\n");
		query.append("	AND A.REV_YRMON 		= @[rev_yrmon] ").append("\n");
		query.append("	AND A.VSL_CD 			= @[vsl_cd] ").append("\n");
		query.append("	AND A.SKD_VOY_NO 		= @[skd_voy_no] ").append("\n");
		query.append("	AND A.SKD_DIR_CD 		= @[skd_dir_cd] ").append("\n");
		query.append("	AND A.REV_DIR_CD 		= @[rev_dir_cd] ").append("\n");
		query.append("	AND A.ESTM_VVD_TP_CD 	= @[estm_vvd_tp_cd] ").append("\n");
		query.append("	AND A.ESTM_IOC_DIV_CD 	= @[estm_ioc_div_cd]").append("\n");
		query.append(")").append("\n");
		query.append("WHEN MATCHED THEN").append("\n");
		query.append("  UPDATE").append("\n");
		query.append("     SET ESTM_VVD_HDR_ID = @[estm_vvd_hdr_id],").append("\n");
		query.append("         ESTM_BC_DIV_CD  = @[estm_bc_div_cd],").append("\n");
		query.append("         VST_DT          = @[vst_dt],").append("\n");
		query.append("         VED_DT          = @[ved_dt],").append("\n");
		query.append("         RLANE_CD        = @[rlane_cd],").append("\n");
		query.append("         LINE_NO         = @[line_no],").append("\n");
		query.append("         UPD_DT          = SYSDATE,").append("\n");
		query.append("         UPD_USR_ID      = @[upd_usr_id]").append("\n");
		query.append("   WHERE EXE_YRMON 		= @[exe_yrmon]").append("\n");
		query.append("     AND REV_YRMON 		= @[rev_yrmon]").append("\n");
		query.append("     AND VSL_CD 		= @[vsl_cd]").append("\n");
		query.append("     AND SKD_VOY_NO 	= @[skd_voy_no]").append("\n");
		query.append("     AND SKD_DIR_CD 	= @[skd_dir_cd]").append("\n");
		query.append("     AND REV_DIR_CD 	= @[rev_dir_cd]").append("\n");
		query.append("     AND ESTM_VVD_TP_CD = @[estm_vvd_tp_cd]").append("\n");
		query.append("     AND ESTM_IOC_DIV_CD = @[estm_ioc_div_cd]").append("\n");
		query.append("WHEN NOT MATCHED THEN").append("\n");
		query.append("  INSERT").append("\n");
		query.append("    (EXE_YRMON,").append("\n");
		query.append("     REV_YRMON,").append("\n");
		query.append("     VSL_CD,").append("\n");
		query.append("     SKD_VOY_NO,").append("\n");
		query.append("     SKD_DIR_CD,").append("\n");
		query.append("     REV_DIR_CD,").append("\n");
		query.append("     ESTM_VVD_TP_CD,").append("\n");
		query.append("     ESTM_IOC_DIV_CD,").append("\n");
		query.append("     ESTM_VVD_HDR_ID,").append("\n");
		query.append("     ESTM_BC_DIV_CD,").append("\n");
		query.append("     VST_DT,").append("\n");
		query.append("     VED_DT,").append("\n");
		query.append("     RLANE_CD,").append("\n");
		query.append("     LINE_NO,").append("\n");
		query.append("     CRE_DT,").append("\n");
		query.append("     CRE_USR_ID,").append("\n");
		query.append("     UPD_DT,").append("\n");
		query.append("     UPD_USR_ID)").append("\n");
		query.append("  VALUES").append("\n");
		query.append("    (@[exe_yrmon],").append("\n");
		query.append("     @[rev_yrmon],").append("\n");
		query.append("     @[vsl_cd],").append("\n");
		query.append("     @[skd_voy_no],").append("\n");
		query.append("     @[skd_dir_cd],").append("\n");
		query.append("     @[rev_dir_cd],").append("\n");
		query.append("     @[estm_vvd_tp_cd],").append("\n");
		query.append("     @[estm_ioc_div_cd],").append("\n");
		query.append("     @[estm_vvd_hdr_id],").append("\n");
		query.append("     @[estm_bc_div_cd],").append("\n");
		query.append("     @[vst_dt],").append("\n");
		query.append("     @[ved_dt],").append("\n");
		query.append("     @[rlane_cd],").append("\n");
		query.append("     @[line_no],").append("\n");
		query.append("     SYSDATE,").append("\n");
		query.append("     @[cre_usr_id],").append("\n");
		query.append("     SYSDATE,").append("\n");
		query.append("     @[upd_usr_id]").append("\n");
		query.append(")").append("\n");

	}
}