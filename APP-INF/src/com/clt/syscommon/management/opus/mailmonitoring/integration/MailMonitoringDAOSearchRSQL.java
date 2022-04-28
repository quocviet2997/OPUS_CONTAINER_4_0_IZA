/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : MailMonitoringDAOSearchRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.21 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MailMonitoringDAOSearchRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Mail Monitoring
	  * </pre>
	  */
	public MailMonitoringDAOSearchRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("bat_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("eml_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sndr_eml",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("eml_proc_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("eml_snd_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("eml_tit_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.mailmonitoring.integration").append("\n"); 
		query.append("FileName : MailMonitoringDAOSearchRSQL").append("\n"); 
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
		query.append("SELECT * FROM(" ).append("\n"); 
		query.append("SELECT * FROM COM_EML_SND_INFO " ).append("\n"); 
		query.append("WHERE EML_DT BETWEEN TO_DATE(@[eml_dt],'YYYYMMDDHH24MISS') AND TO_DATE(@[eml_dt],'YYYYMMDDHH24MISS')+1" ).append("\n"); 
		query.append("#if (${eml_snd_no} != '')" ).append("\n"); 
		query.append("AND EML_SND_NO = @[eml_snd_no]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${eml_proc_sts_cd} != '')" ).append("\n"); 
		query.append("AND EML_PROC_STS_CD = @[eml_proc_sts_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${sndr_eml} != '')" ).append("\n"); 
		query.append("AND SNDR_EML LIKE @[sndr_eml]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${eml_tit_nm} != '')" ).append("\n"); 
		query.append("AND UPPER(EML_TIT_NM) LIKE '%'||UPPER(@[eml_tit_nm])||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${bat_flg} != '')" ).append("\n"); 
		query.append("AND BAT_FLG LIKE '%'||@[bat_flg]||'%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY eml_dt DESC" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("WHERE ROWNUM < 10001" ).append("\n"); 

	}
}