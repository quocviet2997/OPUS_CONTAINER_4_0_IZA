/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOSearchCsrCreationCheckRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.04.21
*@LastModifier : 
*@LastVersion : 1.0
* 2016.04.21 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOSearchCsrCreationCheckRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * CSR 생성할 때 사용자가 동시에 한개의 Invoice에 대해서 CSR을 생성하는 경우에 이를 체크하여 생성 불가 할 수 있도록 조회 처리
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOSearchCsrCreationCheckRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_rgst_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration ").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOSearchCsrCreationCheckRSQL").append("\n"); 
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
		query.append("SELECT  API.INV_STS_CD" ).append("\n"); 
		query.append("FROM    AP_PAY_INV API" ).append("\n"); 
		query.append("WHERE   API.INV_RGST_NO = @[inv_rgst_no]" ).append("\n"); 
		query.append("AND     NVL(API.DELT_FLG, 'N') <> 'Y'" ).append("\n"); 

	}
}