/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoSelectRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.11
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.05.11 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author HAM DAE SUNG
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoSelectRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoSelectRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOCreateApInvDTRBASANoSelectRSQL").append("\n"); 
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
		query.append("select a.line_seq," ).append("\n"); 
		query.append("b.line_no," ).append("\n"); 
		query.append("c.inv_no," ).append("\n"); 
		query.append("c.iss_dt," ).append("\n"); 
		query.append("c.loc_cd," ).append("\n"); 
		query.append("d.total_amt," ).append("\n"); 
		query.append("'' acct_cd," ).append("\n"); 
		query.append("'' csr_no" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("select nvl(max(line_seq), 0)+1 line_seq" ).append("\n"); 
		query.append("from ap_inv_dtrb" ).append("\n"); 
		query.append("where csr_no = @[csr_no]) a," ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("select nvl(max(line_no), 0)+1 line_no" ).append("\n"); 
		query.append("from ap_inv_dtrb" ).append("\n"); 
		query.append("where csr_no = @[csr_no]) b," ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("select a.attr_ctnt1 inv_no," ).append("\n"); 
		query.append("max(b.attr_ctnt2) iss_dt," ).append("\n"); 
		query.append("substr(yd_cd, 1, 5) loc_cd" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("select max(attr_ctnt1) attr_ctnt1" ).append("\n"); 
		query.append("from ap_inv_dtrb" ).append("\n"); 
		query.append("where csr_no = @[csr_no]) a," ).append("\n"); 
		query.append("ap_inv_dtrb b" ).append("\n"); 
		query.append("where b.csr_no = @[csr_no]" ).append("\n"); 
		query.append("and a.attr_ctnt1 = b.attr_ctnt1" ).append("\n"); 
		query.append("group by yd_cd, a.attr_ctnt1) c," ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("select -sum(inv_amt) total_amt" ).append("\n"); 
		query.append("from ap_inv_dtrb" ).append("\n"); 
		query.append("where csr_no = @[csr_no]) d" ).append("\n"); 

	}
}