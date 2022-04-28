/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : FaxManagementDBDAOsearchFaxDataListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.21 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.faxmanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FaxManagementDBDAOsearchFaxDataListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * searchFaxDataList
	  * </pre>
	  */
	public FaxManagementDBDAOsearchFaxDataListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rd_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("fax_tit_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("fax_snd_date",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("xpt_err_msg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rd_appl_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rcvr_info_ctnt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("fax_snd_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.faxmanagement.integration").append("\n"); 
		query.append("FileName : FaxManagementDBDAOsearchFaxDataListRSQL").append("\n"); 
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
		query.append("select " ).append("\n"); 
		query.append("  FAX_SND_NO " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("--, REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 1) as  RCVR_INFO_CTNT1" ).append("\n"); 
		query.append("--, REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 2) as  RCVR_INFO_CTNT2" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append(", case when length(REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 1)) > 3" ).append("\n"); 
		query.append("         and substr( REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 1), 0, 3) = '011'" ).append("\n"); 
		query.append("     then  substr( REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 1),  4) " ).append("\n"); 
		query.append("     else  REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 1)  end as  RCVR_INFO_CTNT1" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append(", case when length(REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 2)) > 3" ).append("\n"); 
		query.append("         and substr( REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 2), 0, 3) = '011'" ).append("\n"); 
		query.append("     then  substr( REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 2),  4) " ).append("\n"); 
		query.append("     else  REGEXP_SUBSTR(RCVR_INFO_CTNT , '[^;]+', 1, 2)  end as  RCVR_INFO_CTNT2" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append(", RD_SUB_SYS_CD  " ).append("\n"); 
		query.append(", CRE_USR_ID   " ).append("\n"); 
		query.append(", OFC_CD  " ).append("\n"); 
		query.append(", substr(FAX_SND_NO,0,8 )  as FAX_SND_DATE" ).append("\n"); 
		query.append(", FAX_TIT_NM  " ).append("\n"); 
		query.append(", Decode(FAX_PROC_STS_CD, " ).append("\n"); 
		query.append("		'0', 'Sending', " ).append("\n"); 
		query.append("		'1', 'Sending'," ).append("\n"); 
		query.append("		'2', 'Sending'," ).append("\n"); 
		query.append("		'3', 'Sending'," ).append("\n"); 
		query.append("		'4', 'Failed', " ).append("\n"); 
		query.append("		'5', 'Success'," ).append("\n"); 
		query.append("		'6', 'Failed'," ).append("\n"); 
		query.append("		 'Sending' ) as FAX_PROC_STS_CD   " ).append("\n"); 
		query.append(" , Decode(FAX_PROC_STS_CD, '4', XPT_ERR_MSG, '6', FAX_ERR_MSG, '') as  XPT_ERR_MSG" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("from COM_FAX_SND_INFO" ).append("\n"); 
		query.append("where 1=1" ).append("\n"); 
		query.append("   	#if (${fax_snd_no} != '')" ).append("\n"); 
		query.append("    AND FAX_SND_NO = @[fax_snd_no]" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${rd_appl_cd} != '')" ).append("\n"); 
		query.append("    AND RD_APPL_CD  = @[rd_appl_cd]" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${rcvr_info_ctnt} != '')" ).append("\n"); 
		query.append("    AND RCVR_INFO_CTNT = @[rcvr_info_ctnt]" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${rd_sub_sys_cd} != '')" ).append("\n"); 
		query.append("    AND RD_SUB_SYS_CD = @[rd_sub_sys_cd]" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${cre_usr_id} != '')" ).append("\n"); 
		query.append("    AND CRE_USR_ID = @[cre_usr_id]" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${ofc_cd} != '')" ).append("\n"); 
		query.append("    AND OFC_CD = @[ofc_cd]" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${fax_snd_date} != '')" ).append("\n"); 
		query.append("    AND  FAX_SND_NO  like  REPLACE( @[fax_snd_date] , '-', '')||'%'" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("   	#if (${fax_tit_nm} != '')" ).append("\n"); 
		query.append("    AND UPPER(FAX_TIT_NM) like '%'||UPPER(@[fax_tit_nm])||'%'" ).append("\n"); 
		query.append("    #end " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("  	#if (${fax_proc_sts_cd} == 'Sending')" ).append("\n"); 
		query.append("			AND FAX_PROC_STS_CD IN ('0','1','2','3') " ).append("\n"); 
		query.append(" 	#end " ).append("\n"); 
		query.append("	#if (${fax_proc_sts_cd} == 'Failed')" ).append("\n"); 
		query.append("			AND FAX_PROC_STS_CD IN ('4','6') " ).append("\n"); 
		query.append(" 	#end " ).append("\n"); 
		query.append("	#if (${fax_proc_sts_cd} == 'Success')" ).append("\n"); 
		query.append("			AND FAX_PROC_STS_CD = '5' " ).append("\n"); 
		query.append(" 	#end " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("   	#if (${xpt_err_msg} != '')" ).append("\n"); 
		query.append("    AND XPT_ERR_MSG = @[xpt_err_msg]" ).append("\n"); 
		query.append("    #end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("ORDER BY  FAX_SND_NO  desc" ).append("\n"); 

	}
}