/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : CSRExternalFinderDBDAOSearchApInvAmtChkRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.07.14
*@LastModifier : 
*@LastVersion : 1.0
* 2016.07.14 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.csrcommon.csrexternalfinder.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CSRExternalFinderDBDAOSearchApInvAmtChkRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 비교할 INV_AMT 와 Currency에따른 소수점 적용된 INV_AMT 비교 체크
	  * </pre>
	  */
	public CSRExternalFinderDBDAOSearchApInvAmtChkRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_net_amt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("inv_rgst_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.csrcommon.csrexternalfinder.integration").append("\n"); 
		query.append("FileName : CSRExternalFinderDBDAOSearchApInvAmtChkRSQL").append("\n"); 
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
		query.append("SELECT ROUND((@[inv_net_amt] - A.INV_AMT), 2) AS AMTCHK, A.INV_NET_AMT, A.INV_AMT											  			  	" ).append("\n"); 
		query.append("  FROM                                                                                                             	" ).append("\n"); 
		query.append("       (                                                                                                            	" ).append("\n"); 
		query.append("       SELECT  ROUND(NVL(A.INV_NET_AMT, 0), NVL((SELECT MC.DP_PRCS_KNT FROM MDM_CURRENCY MC WHERE MC.CURR_CD = A.INV_CURR_CD AND ROWNUM = 1), 0)) AS INV_NET_AMT" ).append("\n"); 
		query.append("              ,ROUND(NVL(SUM(B.INV_AMT), 0), NVL((SELECT MC.DP_PRCS_KNT FROM MDM_CURRENCY MC WHERE MC.CURR_CD = A.INV_CURR_CD AND ROWNUM = 1), 0)) AS INV_AMT" ).append("\n"); 
		query.append("         FROM  AP_PAY_INV A                                                                                         	" ).append("\n"); 
		query.append("              ,AP_PAY_INV_DTL B                                                                                    	" ).append("\n"); 
		query.append("        WHERE  A.INV_RGST_NO = B.INV_RGST_NO                                                                        	" ).append("\n"); 
		query.append("          AND  A.INV_RGST_NO = @[inv_rgst_no]                                                                    				  	" ).append("\n"); 
		query.append("        GROUP  BY NVL(A.INV_NET_AMT, 0), A.INV_CURR_CD                  																	" ).append("\n"); 
		query.append("       )A" ).append("\n"); 

	}
}