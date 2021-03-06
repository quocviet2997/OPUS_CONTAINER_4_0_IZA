/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtDBDAOSearchCustCdRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.20
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.05.20 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Viet Tran
 * @see CarrierMgmtDBDAO
 * @since J2EE 1.6
 */

public class CarrierMgmtDBDAOSearchCustCdRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Search CustCd
	  * </pre>
	  */
	public CarrierMgmtDBDAOSearchCustCdRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.esm.clv.carrier.carriermgmt.integration").append("\n"); 
		query.append("FileName : CarrierMgmtDBDAOSearchCustCdRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
	
	public String getSQL(){
		return query.toString();
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}

	/**
	 * Query Generation
	 */
	public void setQuery(){
		query.append("SELECT CUST_CNT_CD, CUST_SEQ, CUST_LGL_ENG_NM" ).append("\n"); 
		query.append("FROM MDM_CUSTOMER" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("#if(${cust_cnt_cd} != '')" ).append("\n"); 
		query.append("AND CUST_CNT_CD = @[cust_cnt_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${cust_seq} != '')" ).append("\n"); 
		query.append("AND CUST_SEQ = @[cust_seq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}