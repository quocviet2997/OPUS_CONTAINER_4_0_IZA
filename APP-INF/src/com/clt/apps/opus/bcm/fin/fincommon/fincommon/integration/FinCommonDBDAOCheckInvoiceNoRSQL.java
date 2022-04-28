/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinCommonDBDAOCheckInvoiceNoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.11.27
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.27 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class FinCommonDBDAOCheckInvoiceNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Invoice No. 입력 및 Invoice Creation시 Invoice No에 대한 Validation을 수행한다.
	  * </pre>
	  */
	public FinCommonDBDAOCheckInvoiceNoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ref_pk",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration").append("\n"); 
		query.append("FileName : FinCommonDBDAOCheckInvoiceNoRSQL").append("\n"); 
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
		query.append("SELECT   MDL_CD" ).append("\n"); 
		query.append("       , INV_NO" ).append("\n"); 
		query.append("       , VNDR_SEQ" ).append("\n"); 
		query.append("       , OFC_CD" ).append("\n"); 
		query.append("       , CUR_CD" ).append("\n"); 
		query.append("       , INV_AMT" ).append("\n"); 
		query.append("       , CSR_NO" ).append("\n"); 
		query.append("       , REF_PK" ).append("\n"); 
		query.append("  FROM AP_INV_NO_CHK_V" ).append("\n"); 
		query.append(" WHERE 1=1" ).append("\n"); 
		query.append("   AND INV_NO    = @[inv_no]" ).append("\n"); 
		query.append("   AND VNDR_SEQ  = @[vndr_seq]" ).append("\n"); 
		query.append("   AND REF_PK   != NVL (@[ref_pk], 'XXX')" ).append("\n"); 
		query.append("   AND ROWNUM    = 1" ).append("\n"); 

	}
}