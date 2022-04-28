/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FaxManagementDBDAOupdateFaxProcStsCdByResendUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.12.08
*@LastModifier : 
*@LastVersion : 1.0
* 2014.12.08 
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

public class FaxManagementDBDAOupdateFaxProcStsCdByResendUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * updateFaxProcStsCdByResend
	  * </pre>
	  */
	public FaxManagementDBDAOupdateFaxProcStsCdByResendUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("fax_snd_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.faxmanagement.integration").append("\n"); 
		query.append("FileName : FaxManagementDBDAOupdateFaxProcStsCdByResendUSQL").append("\n"); 
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
		query.append("UPDATE  COM_FAX_SND_INFO SET" ).append("\n"); 
		query.append("   FAX_PROC_STS_CD ='1'" ).append("\n"); 
		query.append("  , XPT_ERR_MSG = null" ).append("\n"); 
		query.append("  , UPD_USR_ID =  @[upd_usr_id]" ).append("\n"); 
		query.append("  , UPD_DT = sysdate" ).append("\n"); 
		query.append("  , XPT_RSLT_CD = NULL" ).append("\n"); 
		query.append("WHERE FAX_SND_NO = @[fax_snd_no]" ).append("\n"); 

	}
}