/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : UserOfcCngDBDAOSearchUserListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.03.21
*@LastModifier : 
*@LastVersion : 1.0
* 2018.03.21 
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

public class UserOfcCngDBDAOSearchUserListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * user의 모든 목록을 가져온다
	  * </pre>
	  */
	public UserOfcCngDBDAOSearchUserListRSQL(){
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

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserOfcCngDBDAOSearchUserListRSQL").append("\n"); 
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
		query.append("#if(${admin_page} == 'Y')" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("	A.USR_ID," ).append("\n"); 
		query.append("	A.USR_NM," ).append("\n"); 
		query.append("	A.USR_LOCL_NM," ).append("\n"); 
		query.append("	A.OFC_CD," ).append("\n"); 
		query.append("	B.CNG_OFC_CD," ).append("\n"); 
		query.append("	NVL(C.AR_HD_QTR_OFC_CD, B.CNG_OFC_CD) RHQ," ).append("\n"); 
		query.append("	TO_CHAR(B.CNG_OFC_FM_DT,'YYYYMMDD') CNG_OFC_FM_DT," ).append("\n"); 
		query.append("	TO_CHAR(DECODE(C.DELT_FLG,'Y',C.UPD_DT,B.CNG_OFC_TO_DT),'YYYYMMDD') CNG_OFC_TO_DT," ).append("\n"); 
		query.append("	B.RQST_CTNT," ).append("\n"); 
		query.append("	B.CRE_USR_ID," ).append("\n"); 
		query.append("	TO_CHAR(A.CRE_DT,'YYYYMMDD') CRE_DT," ).append("\n"); 
		query.append("	B.UPD_USR_ID," ).append("\n"); 
		query.append("	TO_CHAR(B.UPD_DT,'YYYYMMDD') UPD_DT," ).append("\n"); 
		query.append("	DECODE(SIGN(DECODE(C.DELT_FLG,'Y',C.UPD_DT,B.CNG_OFC_TO_DT)-SYSDATE), -1, 'Y', 'N') EXPIRE" ).append("\n"); 
		query.append("FROM COM_USER A, COM_USR_OFC_CNG B, MDM_ORGANIZATION C" ).append("\n"); 
		query.append("WHERE A.USR_ID = B.USR_ID" ).append("\n"); 
		query.append("AND B.CNG_OFC_CD = C.OFC_CD" ).append("\n"); 
		query.append("AND ('ALL' = @[usr_id] OR A.USR_ID = @[usr_id] )" ).append("\n"); 
		query.append("AND ('ALL' = @[usr_nm] OR UPPER(A.USR_NM) LIKE '%'||UPPER(@[usr_nm])||'%' )" ).append("\n"); 
		query.append("ORDER BY CNG_OFC_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("	DEFAULT_LGIN_OFC," ).append("\n"); 
		query.append("	USR_ID,        " ).append("\n"); 
		query.append("	OFC_CD," ).append("\n"); 
		query.append("	CNG_OFC_CD" ).append("\n"); 
		query.append("FROM" ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("	DECODE(A.OFC_CD, NVL(A.LST_LGIN_OFC_CD, A.OFC_CD), 1, 0) DEFAULT_LGIN_OFC," ).append("\n"); 
		query.append("	A.USR_ID USR_ID," ).append("\n"); 
		query.append("	A.OFC_CD OFC_CD," ).append("\n"); 
		query.append("	A.OFC_CD CNG_OFC_CD," ).append("\n"); 
		query.append("	'N' EXPIRE" ).append("\n"); 
		query.append("FROM COM_USER A, MDM_ORGANIZATION C		  " ).append("\n"); 
		query.append("WHERE A.OFC_CD = C.OFC_CD" ).append("\n"); 
		query.append("AND A.USR_ID = @[usr_id]" ).append("\n"); 
		query.append("UNION " ).append("\n"); 
		query.append("SELECT " ).append("\n"); 
		query.append("	DECODE(A.LST_LGIN_OFC_CD, B.CNG_OFC_CD, 1, 0) DEFAULT_LGIN_OFC," ).append("\n"); 
		query.append("	A.USR_ID USR_ID," ).append("\n"); 
		query.append("	A.OFC_CD OFC_CD,  " ).append("\n"); 
		query.append("	B.CNG_OFC_CD CNG_OFC_CD," ).append("\n"); 
		query.append("	DECODE(SIGN(DECODE(C.DELT_FLG,'Y',C.UPD_DT,B.CNG_OFC_TO_DT)-SYSDATE), -1, 'Y', 'N') EXPIRE" ).append("\n"); 
		query.append("	FROM COM_USER A, COM_USR_OFC_CNG B, MDM_ORGANIZATION C			" ).append("\n"); 
		query.append("	WHERE A.USR_ID = B.USR_ID						" ).append("\n"); 
		query.append("	AND B.CNG_OFC_CD = C.OFC_CD" ).append("\n"); 
		query.append("	AND A.USR_ID = @[usr_id]" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("WHERE EXPIRE = 'N' " ).append("\n"); 
		query.append("ORDER BY CNG_OFC_CD" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}