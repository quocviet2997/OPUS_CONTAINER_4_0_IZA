/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : ApprovalDBDAOcheckValidBankAcctFlgRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2018.01.22
*@LastModifier : 
*@LastVersion : 1.0
* 2018.01.22 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOcheckValidBankAcctFlgRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ApprovalDBDAO checkValidBankAcctFlg mzd
	  * </pre>
	  */
	public ApprovalDBDAOcheckValidBankAcctFlgRSQL(){
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
		query.append("Path : com.clt.bizcommon.approval.integration ").append("\n"); 
		query.append("FileName : ApprovalDBDAOcheckValidBankAcctFlgRSQL").append("\n"); 
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
		query.append("SELECT " ).append("\n"); 
		query.append("COM_CSR_GET_BANK_ACCT_FLG_FNC(@[csr_no]) valid_bank_acct_flg" ).append("\n"); 
		query.append("FROM DUAL" ).append("\n"); 

	}
}