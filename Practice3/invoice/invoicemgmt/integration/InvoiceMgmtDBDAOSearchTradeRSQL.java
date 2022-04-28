/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : InvoiceMgmtDBDAOSearchTradeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.04.18
*@LastModifier : 
*@LastVersion : 1.0
* 2022.04.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice.invoicemgmt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Viet Tran
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class InvoiceMgmtDBDAOSearchTradeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Search list trade
	  * </pre>
	  */
	public InvoiceMgmtDBDAOSearchTradeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rlane_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.esm.clv.invoice.invoicemgmt.integration").append("\n"); 
		query.append("FileName : InvoiceMgmtDBDAOSearchTradeRSQL").append("\n"); 
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
		query.append("SELECT DISTINCT TRD_CD " ).append("\n"); 
		query.append("FROM JOO_CARRIER " ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if (${jo_crr_cd} != '') " ).append("\n"); 
		query.append("	AND JO_CRR_CD IN (" ).append("\n"); 
		query.append("		#foreach($key IN ${invoice_list}) #if($velocityCount < $invoice_list.size()) '$key', #else '$key' #end #end" ).append("\n"); 
		query.append("	)" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${rlane_cd} != '') " ).append("\n"); 
		query.append("AND RLANE_CD = @[rlane_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}