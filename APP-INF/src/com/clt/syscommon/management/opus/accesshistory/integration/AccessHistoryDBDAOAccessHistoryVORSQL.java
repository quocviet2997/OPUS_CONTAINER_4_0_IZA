/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccessHistoryDBDAOAccessHistoryVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.06.24
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.06.24 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.accesshistory.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class AccessHistoryDBDAOAccessHistoryVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public AccessHistoryDBDAOAccessHistoryVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("to_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("from_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rhq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.accesshistory.integration").append("\n"); 
		query.append("FileName : AccessHistoryDBDAOAccessHistoryVORSQL").append("\n"); 
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
		query.append("select a.lvl" ).append("\n"); 
		query.append(", a.lvl hlvl" ).append("\n"); 
		query.append(", a.pgm_no" ).append("\n"); 
		query.append(", a.pgm_nm" ).append("\n"); 
		query.append(", b.cnt_total" ).append("\n"); 
		query.append(", b.cnt_load" ).append("\n"); 
		query.append(", b.cnt_cud" ).append("\n"); 
		query.append(", b.cnt_rrr" ).append("\n"); 
		query.append(", b.cnt_etc" ).append("\n"); 
		query.append("#if (${rhq} != '') " ).append("\n"); 
		query.append(", @[rhq] rhq" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append(", '' rhq" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${ofc_cd} != '') " ).append("\n"); 
		query.append(", @[ofc_cd] ofc_cd" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append(", '' ofc_cd" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${usr_id} != '') " ).append("\n"); 
		query.append(", @[usr_id] usr_id" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append(", '' usr_id" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("#if (${pgm_no} == '') " ).append("\n"); 
		query.append("select level lvl" ).append("\n"); 
		query.append("	, a.prnt_pgm_no" ).append("\n"); 
		query.append("    , b.pgm_no, b.pgm_nm" ).append("\n"); 
		query.append("FROM  COM_MNU_CFG A, COM_PROGRAM B" ).append("\n"); 
		query.append("WHERE A.CHD_PGM_NO = B.PGM_NO" ).append("\n"); 
		query.append("START WITH A.PRNT_PGM_NO = '000_000_M000'" ).append("\n"); 
		query.append("CONNECT BY PRIOR A.CHD_PGM_NO = A.PRNT_PGM_NO" ).append("\n"); 
		query.append("ORDER SIBLINGS BY a.DP_SEQ" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("select 1 lvl, pgm_no, pgm_nm" ).append("\n"); 
		query.append("from com_program" ).append("\n"); 
		query.append("#if (${pgm_no_comma} == '-1')" ).append("\n"); 
		query.append("where pgm_no like '%'||@[pgm_no]||'%'" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("where pgm_no in ('${pgm_no}')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("order by pgm_no" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(") a," ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("SELECT a.pgm_no" ).append("\n"); 
		query.append(",sum(ACSS_TTL_KNT) cnt_total" ).append("\n"); 
		query.append(",sum(ACSS_LOD_KNT) cnt_load" ).append("\n"); 
		query.append(",0 cnt_etc " ).append("\n"); 
		query.append(",sum(ACSS_MODI_KNT) cnt_cud " ).append("\n"); 
		query.append(",sum(ACSS_SRCH_KNT) + sum(ACSS_ETC_KNT) cnt_rrr" ).append("\n"); 
		query.append("#if (${rhq} != '') " ).append("\n"); 
		query.append("from com_acss_his_smry a, mdm_organization b" ).append("\n"); 
		query.append("where a.ofc_cd = b.ofc_cd" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("from com_acss_his_smry a where 1=1" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append("#if (${pgm_no_comma} == '-1')" ).append("\n"); 
		query.append("and pgm_no like '%'||@[pgm_no]||'%'" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("and pgm_no in ('${pgm_no}')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${usr_id} != '') " ).append("\n"); 
		query.append("and a.usr_id like '%'||@[usr_id]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${ofc_cd} != '') " ).append("\n"); 
		query.append("and a.ofc_cd like @[ofc_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rhq} != '') " ).append("\n"); 
		query.append("and b.AR_HD_QTR_OFC_CD = @[rhq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("and a.acss_tms between to_timestamp(@[from_dt]||'00:00.000000', 'yyyy-mm-ddhh24mi:ss.ff') and to_timestamp(@[to_dt]||'59:59.999000', 'yyyy-mm-ddhh24mi:ss.ff')" ).append("\n"); 
		query.append("GROUP BY a.pgm_no" ).append("\n"); 
		query.append(") b" ).append("\n"); 
		query.append("where b.pgm_no (+) = a.pgm_no" ).append("\n"); 

	}
}