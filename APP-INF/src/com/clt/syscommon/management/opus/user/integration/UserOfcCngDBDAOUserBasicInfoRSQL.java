/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : UserOfcCngDBDAOUserBasicInfoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.12
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.04.12 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserOfcCngDBDAOUserBasicInfoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 조회
	  * </pre>
	  */
	public UserOfcCngDBDAOUserBasicInfoRSQL(){
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
		query.append("FileName : UserOfcCngDBDAOUserBasicInfoRSQL").append("\n"); 
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
		query.append("	usr_id," ).append("\n"); 
		query.append("	usr_nm," ).append("\n"); 
		query.append("	usr_locl_nm," ).append("\n"); 
		query.append("	ofc_cd," ).append("\n"); 
		query.append("	'' cng_ofc_cd," ).append("\n"); 
		query.append("	'' rhq," ).append("\n"); 
		query.append("	to_char(sysdate,'YYYY-MM-DD') cng_ofc_fm_dt" ).append("\n"); 
		query.append("from COM_USER                                 " ).append("\n"); 
		query.append("where usr_id = @[usr_id]" ).append("\n"); 
		query.append("and use_flg = 'Y'" ).append("\n"); 

	}
}