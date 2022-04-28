/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : CopyAuthorityDAOOfcChgCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.04.08
*@LastModifier : Jeong-Hoon, KIM
*@LastVersion : 1.0
* 2015.04.08 Jeong-Hoon, KIM
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.copyauthority.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, KIM
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CopyAuthorityDAOOfcChgCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * office change information copy
	  * </pre>
	  */
	public CopyAuthorityDAOOfcChgCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("from_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("to_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.copyauthority.integration").append("\n"); 
		query.append("FileName : CopyAuthorityDAOOfcChgCSQL").append("\n"); 
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
		query.append("#if (${opt} == 'add') " ).append("\n"); 
		query.append("insert into com_usr_ofc_cng (USR_ID, CNG_OFC_CD, CNG_OFC_FM_DT, CNG_OFC_TO_DT, RQST_CTNT, CRE_USR_ID, CRE_DT, UPD_USR_ID, UPD_DT)" ).append("\n"); 
		query.append("select a.usr_id, a.cng_ofc_cd, b.cng_ofc_fm_dt, b.cng_ofc_to_dt, b.rqst_ctnt, 'authcopy', sysdate, 'authcopy', sysdate" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("select @[to_usr_id] usr_id, cng_ofc_cd from com_usr_ofc_cng where usr_id = @[from_usr_id]" ).append("\n"); 
		query.append("minus" ).append("\n"); 
		query.append("select @[to_usr_id] usr_id, cng_ofc_cd from com_usr_ofc_cng where usr_id = @[to_usr_id]" ).append("\n"); 
		query.append(") a, com_usr_ofc_cng b" ).append("\n"); 
		query.append("where b.usr_id = @[from_usr_id] and a.cng_ofc_cd = b.cng_ofc_cd" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("insert into com_usr_ofc_cng (USR_ID, CNG_OFC_CD, CNG_OFC_FM_DT, CNG_OFC_TO_DT, RQST_CTNT, CRE_USR_ID, CRE_DT, UPD_USR_ID, UPD_DT)" ).append("\n"); 
		query.append("select @[to_usr_id], cng_ofc_cd, cng_ofc_fm_dt, cng_ofc_to_dt, rqst_ctnt, 'authcopy', sysdate, 'authcopy', sysdate" ).append("\n"); 
		query.append("from com_usr_ofc_cng" ).append("\n"); 
		query.append("where usr_id = @[from_usr_id]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}