/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationDBDAOSearchCustomerScheduleListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.11
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.11 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOSearchCustomerScheduleListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.03.16 정윤태 CUSTOMER SCHEDULE EDI SETUP 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchCustomerScheduleListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_msg_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_svc_tp_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_stup_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration ").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchCustomerScheduleListVORSQL").append("\n"); 
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
		query.append("SELECT  EDI_STUP_ID" ).append("\n"); 
		query.append("       ,CUST_TRD_PRNR_ID" ).append("\n"); 
		query.append("       ,EDI_SNDR_ID" ).append("\n"); 
		query.append("       ,EDI_MSG_NM" ).append("\n"); 
		query.append("       ,EDI_SVC_TP_NM" ).append("\n"); 
		query.append("       ,WRK_RSRC_NM" ).append("\n"); 
		query.append("       ,SND_FM_DYS" ).append("\n"); 
		query.append("       ,SND_TO_DYS" ).append("\n"); 
		query.append("       ,PRE_DMY_SKD_FLG" ).append("\n"); 
		query.append("       ,PST_DMY_SKD_FLG" ).append("\n"); 
		query.append("       ,USE_FLG" ).append("\n"); 
		query.append("       ,'' CRE_USR_ID" ).append("\n"); 
		query.append("       ,'' UPD_USR_ID " ).append("\n"); 
		query.append("  FROM VSK_CUST_SKD_EDI_SET" ).append("\n"); 
		query.append(" WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${edi_stup_id} != '')" ).append("\n"); 
		query.append("   AND EDI_STUP_ID = @[edi_stup_id]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${edi_msg_nm} != '')" ).append("\n"); 
		query.append("   AND EDI_MSG_NM = @[edi_msg_nm]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${edi_svc_tp_nm} != '')" ).append("\n"); 
		query.append("   AND EDI_SVC_TP_NM = @[edi_svc_tp_nm]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}