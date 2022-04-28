/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ChargeDBDAORepChargeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.04.03
*@LastModifier : 
*@LastVersion : 1.0
* 2012.04.03 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.charge.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ChargeDBDAORepChargeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Charge의 모든 목록을 가져온다.
	  * </pre>
	  */
	public ChargeDBDAORepChargeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.charge.integration").append("\n"); 
		query.append("FileName : ChargeDBDAORepChargeListRSQL").append("\n"); 
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
		query.append("SELECT REP_CHG_CD" ).append("\n"); 
		query.append("  FROM MDM_REP_CHG" ).append("\n"); 
		query.append(" WHERE DELT_FLG <> 'Y'" ).append("\n"); 

	}
}