/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : ConsultationSlipRequestMgtDBDAOTAXInfoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2014.11.13
*@LastModifier : 
*@LastVersion : 1.0
* 2014.11.13 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtDBDAOTAXInfoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * .
	  * </pre>
	  */
	public ConsultationSlipRequestMgtDBDAOTAXInfoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("comp_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.integration").append("\n"); 
		query.append("FileName : ConsultationSlipRequestMgtDBDAOTAXInfoRSQL").append("\n"); 
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
		query.append("SELECT NVL(DECODE(VNDR_CNT_CD,'JP',VNDR_LOCL_LANG_NM, VNDR_LGL_ENG_NM), ' ') VNDR_NM," ).append("\n"); 
		query.append("       NVL(BZCT_NM, ' ') BZCT_NM," ).append("\n"); 
		query.append("       NVL(BZTP_NM, ' ') BZTP_NM," ).append("\n"); 
		query.append("       NVL(DECODE(VNDR_CNT_CD,'JP',LOCL_LANG_ADDR, ENG_ADDR), ' ') VNDR_ADDR," ).append("\n"); 
		query.append("       NVL(VNDR_SEQ, '') VNDR_SEQ," ).append("\n"); 
		query.append("       NVL(CEO_NM, ' ') CEO_NM," ).append("\n"); 
		query.append("	   '' wkplc_nmstring," ).append("\n"); 
		query.append("	   '' tax_no3," ).append("\n"); 
		query.append("	   '' ofc_cd," ).append("\n"); 
		query.append("	   '' cre_usr_id," ).append("\n"); 
		query.append("	   '' tax_no1," ).append("\n"); 
		query.append("       '' tax_no2," ).append("\n"); 
		query.append("	   '' vndr_seq_hdr," ).append("\n"); 
		query.append("	   '' comp_no," ).append("\n"); 
		query.append("	   '' rgst_no," ).append("\n"); 
		query.append("	   '' tax_type," ).append("\n"); 
		query.append("	   '' ap_tax_nm," ).append("\n"); 
		query.append("	   '' fa_flg," ).append("\n"); 
		query.append("	   '' tax_naid_flg," ).append("\n"); 
		query.append("	   '' tax_nsl_flg," ).append("\n"); 
		query.append("       '' tax_code," ).append("\n"); 
		query.append("       '' gs_flg" ).append("\n"); 
		query.append("FROM   MDM_VENDOR" ).append("\n"); 
		query.append("WHERE  rgst_no = @[comp_no]" ).append("\n"); 
		query.append("  AND  DELT_FLG = 'N'" ).append("\n"); 

	}
}