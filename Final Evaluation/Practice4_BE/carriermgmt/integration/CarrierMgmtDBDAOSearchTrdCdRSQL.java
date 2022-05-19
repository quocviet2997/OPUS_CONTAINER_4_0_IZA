/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtDBDAOSearchTrdCdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.17
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.05.17 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Viet Tran
 * @see DAO
 * @since J2EE 1.6
 */

public class CarrierMgmtDBDAOSearchTrdCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Search TrdCd
	  * </pre>
	  */
	public CarrierMgmtDBDAOSearchTrdCdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("trd_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.esm.clv.carrier.carriermgmt.integration").append("\n"); 
		query.append("FileName : CarrierMgmtDBDAOSearchTrdCdRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
	
	public String getSQL(){
		return query.toString();
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}

	/**
	 * Query
	 */
	public void setQuery(){
		query.append("SELECT TRD_CD" ).append("\n"); 
		query.append("FROM MDM_TRADE" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("AND TRD_CD = @[trd_cd]" ).append("\n"); 

	}
}
