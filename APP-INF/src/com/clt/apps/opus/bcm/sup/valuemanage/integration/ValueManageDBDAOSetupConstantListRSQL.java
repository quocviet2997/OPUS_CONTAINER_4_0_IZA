/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ValueManageDBDAOSetupConstantListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.17
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2011.02.17 송민석
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author SONG Min Seok
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ValueManageDBDAOSetupConstantListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * com_sup_cons 테이블 조회
	  * </pre>
	  */
	public ValueManageDBDAOSetupConstantListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.valuemanage.integration").append("\n"); 
		query.append("FileName : ValueManageDBDAOSetupConstantListRSQL").append("\n"); 
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
		query.append("select CONS_CD , CONS_VAL_CTNT" ).append("\n"); 
		query.append("from COM_STUP_CONS" ).append("\n"); 

	}
}