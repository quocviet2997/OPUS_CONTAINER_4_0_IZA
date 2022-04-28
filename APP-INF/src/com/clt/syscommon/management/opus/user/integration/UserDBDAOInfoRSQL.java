/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : UserDBDAOInfoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.20
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.20 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserDBDAOInfoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * user 정보를 조회
	  * </pre>
	  */
	public UserDBDAOInfoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserDBDAOInfoRSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("	A.USR_ID" ).append("\n"); 
		query.append(",	A.USR_NM" ).append("\n"); 
		query.append(",	A.USR_EML" ).append("\n"); 
		query.append(",	A.FAX_NO" ).append("\n"); 
		query.append(",	A.USE_FLG" ).append("\n"); 
		query.append(",	A.USR_AUTH_TP_CD" ).append("\n"); 
		query.append(",	A.USR_LOCL_NM" ).append("\n"); 
		query.append(",	A.XTN_PHN_NO" ).append("\n"); 
		query.append(",	DECODE(A.CRE_USR_ID, 'IAM', 'GID', 'LID') DIV" ).append("\n"); 
		query.append(",	A.OFC_CD" ).append("\n"); 
		query.append(",	B.OFC_LOCL_NM AS OFC_KRN_NM" ).append("\n"); 
		query.append(",	B.AR_HD_QTR_OFC_CD RHQ" ).append("\n"); 
		query.append(",	D.SREP_CD" ).append("\n"); 
		query.append("FROM COM_USER A, MDM_ORGANIZATION B, MDM_SLS_REP D " ).append("\n"); 
		query.append("WHERE	A.USR_ID = @[usr_id]" ).append("\n"); 
		query.append("AND A.OFC_CD = B.OFC_CD(+) " ).append("\n"); 
		query.append("AND B.DELT_FLG(+) = 'N'" ).append("\n"); 
		query.append("AND A.USR_ID = D.EMPE_CD(+)" ).append("\n"); 

	}
}