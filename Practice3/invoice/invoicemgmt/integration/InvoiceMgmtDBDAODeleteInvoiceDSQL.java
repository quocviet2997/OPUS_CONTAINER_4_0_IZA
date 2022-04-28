/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : InvoiceMgmtDBDAODeleteInvoiceDSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.04.04
*@LastModifier : 
*@LastVersion : 1.0
* 2022.04.04 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.invoice.invoicemgmt.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Viet Tran
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class InvoiceMgmtDBDAODeleteInvoiceDSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Delete an existed invoice
	  * </pre>
	  */
	public InvoiceMgmtDBDAODeleteInvoiceDSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.esm.clv.invoice.invoicemgmt.integration ").append("\n"); 
		query.append("FileName : InvoiceMgmtDBDAODeleteInvoiceDSQL").append("\n"); 
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
		
	}
}