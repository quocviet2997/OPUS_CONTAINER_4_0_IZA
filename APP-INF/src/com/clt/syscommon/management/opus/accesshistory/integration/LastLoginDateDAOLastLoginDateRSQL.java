/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : LastLoginDateDAOLastLoginDateRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.06.10
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.06.10 김경범
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

public class LastLoginDateDAOLastLoginDateRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * last login date select
	  * </pre>
	  */
	public LastLoginDateDAOLastLoginDateRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("use_flg",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("FileName : LastLoginDateDAOLastLoginDateRSQL").append("\n"); 
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
		query.append("select a.usr_id, a.usr_nm, a.use_flg, b.AR_HD_QTR_OFC_CD rhq, b.ofc_cd" ).append("\n"); 
		query.append(", to_char(max(c.acss_tms), 'yyyy-mm-dd hh24:mi:ss') acss_tms" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append(", c.pgm_no, d.pgm_nm" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("from com_user a, mdm_organization b, com_acss_his_smry c" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append(", com_program d" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("where a.usr_id = c.usr_id" ).append("\n"); 
		query.append("and c.ofc_cd = b.ofc_cd" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append("and c.pgm_no = d.pgm_no" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${usr_id} != '') " ).append("\n"); 
		query.append("and a.usr_id like '%'||@[usr_id]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${ofc_cd} != '') " ).append("\n"); 
		query.append("and c.ofc_cd like '%'||@[ofc_cd]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rhq} != '') " ).append("\n"); 
		query.append("and b.AR_HD_QTR_OFC_CD = @[rhq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${use_flg} != '') " ).append("\n"); 
		query.append("and a.use_flg = @[use_flg]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append("#if (${pgm_no_comma} == '-1')" ).append("\n"); 
		query.append("and d.pgm_no like '%'||@[pgm_no]||'%'" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("and d.pgm_no in ('${pgm_no}')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${to_dt} != '') " ).append("\n"); 
		query.append("and to_char(c.acss_tms, 'yyyy-mm-ddhh24mi') between @[from_dt]||'0000' and @[to_dt]||'2359'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("group by a.usr_id, a.usr_nm, a.use_flg, b.AR_HD_QTR_OFC_CD, b.ofc_cd" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append(", c.pgm_no, d.pgm_nm" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("order by 6 desc" ).append("\n"); 
		query.append("#if (${pgm_no} != '') " ).append("\n"); 
		query.append(", 7 asc" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}