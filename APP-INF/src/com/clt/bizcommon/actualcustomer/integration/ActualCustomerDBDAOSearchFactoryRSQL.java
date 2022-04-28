/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ActualCustomerDBDAOSearchFactoryRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.05.11 정인선
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.actualcustomer.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jung In Sun
 * @see DAO 참조
 * @since J2EE 1.4
 */

public class ActualCustomerDBDAOSearchFactoryRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Factory 조회
	  * </pre>
	  */
	public ActualCustomerDBDAOSearchFactoryRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("SELECT BZET_NM," ).append("\n"); 
		query.append("CNTC_PSON_NM," ).append("\n"); 
		query.append("BZET_ADDR," ).append("\n"); 
		query.append("ZIP_CD," ).append("\n"); 
		query.append("CNTC_EML," ).append("\n"); 
		query.append("BZET_RMK," ).append("\n"); 
		query.append("CUST_CD" ).append("\n"); 
		query.append("FROM (	SELECT ROW_NUMBER() OVER (ORDER BY cust_cnt_cd||cust_seq ASC) no," ).append("\n"); 
		query.append("cust_cnt_cd||cust_seq CUST_CD," ).append("\n"); 
		query.append("BZET_NM," ).append("\n"); 
		query.append("CNTC_PSON_NM," ).append("\n"); 
		query.append("BZET_ADDR," ).append("\n"); 
		query.append("ZIP_CD," ).append("\n"); 
		query.append("CNTC_EML," ).append("\n"); 
		query.append("BZET_RMK" ).append("\n"); 
		query.append("FROM mdm_cust_addr" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("#if (${cust_cd} != '')" ).append("\n"); 
		query.append("AND cust_cnt_cd||cust_seq = @[cust_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("AND NVL(DELT_FLG, 'N') <> 'Y'" ).append("\n"); 
		query.append(") a" ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.actualcustomer.integration").append("\n"); 
		query.append("FileName : ActualCustomerDBDAOSearchFactoryRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}