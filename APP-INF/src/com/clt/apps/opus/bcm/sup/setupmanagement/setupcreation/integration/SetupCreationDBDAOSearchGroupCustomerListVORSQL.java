/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : SetupCreationDBDAOSearchGroupCustomerListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2017.11.07
*@LastModifier : 
*@LastVersion : 1.0
* 2017.11.07 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOSearchGroupCustomerListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.02.22 정윤태 EDI GROUP CUSTOMER 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchGroupCustomerListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cgo_trc_svc_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sc_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("co_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchGroupCustomerListVORSQL").append("\n"); 
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
		query.append("SELECT  SCE.EDI_GRP_CD EDI_GRP_CD" ).append("\n"); 
		query.append("       ,SCE.CO_DIV_CD CO_DIV_CD" ).append("\n"); 
		query.append("       ,SCE.CUST_CNT_CD CUST_CNT_CD" ).append("\n"); 
		query.append("       --,DECODE(SCE.CUST_SEQ,0,'',LPAD(SCE.CUST_SEQ,6,'0')) CUST_SEQ" ).append("\n"); 
		query.append("       ,DECODE(SCE.CUST_SEQ,0,'',SCE.CUST_SEQ) CUST_SEQ" ).append("\n"); 
		query.append("       ,SCE.SC_NO SC_NO" ).append("\n"); 
		query.append("       ,SCE.SC_EFF_ST_DT SC_EFF_ST_DT" ).append("\n"); 
		query.append("       ,SCE.SC_EFF_END_DT SC_EFF_END_DT" ).append("\n"); 
		query.append("       ,SCE.IB_SVC_FLG IB_SVC_FLG" ).append("\n"); 
		query.append("       ,SCE.CGO_TRC_SVC_FLG CGO_TRC_SVC_FLG" ).append("\n"); 
		query.append("       ,SCE.BKG_CTRT_DIV_CD BKG_CTRT_DIV_CD" ).append("\n"); 
		query.append("       ,SCE.BKG_CUST_TP_DESC CUST_ROLE" ).append("\n"); 
		query.append("       ,BKG.ESVC_BL_TP_CD ESVC_BL_TP_CD" ).append("\n"); 
		query.append("       ,BKG.BKG_CFM_FLG BKG_CFM_FLG" ).append("\n"); 
		query.append("       ,BKG.BKG_CFM_AUTO_FLG BKG_CFM_AUTO_FLG" ).append("\n"); 
		query.append("       ,BKG.BL_DRFT_AUTO_FLG BL_DRFT_AUTO_FLG" ).append("\n"); 
		query.append("       ,BKG.BL_DRFT_FLG BL_DRFT_FLG" ).append("\n"); 
		query.append("       ,BKG.AN_FLG AN_FLG" ).append("\n"); 
		query.append("       ,BKG.CRE_USR_ID CRE_USR_ID" ).append("\n"); 
		query.append("       ,BKG.UPD_USR_ID UPD_USR_ID" ).append("\n"); 
		query.append("       ,BKG.VT_CUST_OFC_CD VT_CUST_OFC_CD" ).append("\n"); 
		query.append("  FROM EDI_GRP_CUST SCE," ).append("\n"); 
		query.append("       BKG_EDI_GRP_CUST BKG" ).append("\n"); 
		query.append(" WHERE SCE.EDI_GRP_CD = BKG.ESVC_GRP_CD" ).append("\n"); 
		query.append("   AND SUBSTR(SCE.CO_DIV_CD,1,1) = BKG.CO_CD" ).append("\n"); 
		query.append("   AND SCE.CUST_CNT_CD = BKG.CNT_CD" ).append("\n"); 
		query.append("   AND SCE.CUST_SEQ = BKG.CUST_SEQ" ).append("\n"); 
		query.append("   AND SCE.SC_NO = BKG.SC_NO" ).append("\n"); 
		query.append("#if (${grp_cd} != '')" ).append("\n"); 
		query.append("   AND SCE.EDI_GRP_CD LIKE '%' || @[grp_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${co_div_cd} != '')" ).append("\n"); 
		query.append("   AND SCE.CO_DIV_CD = @[co_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${sc_no} != '')" ).append("\n"); 
		query.append("   AND SCE.SC_NO = @[sc_no]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${cgo_trc_svc_flg} != '')" ).append("\n"); 
		query.append("   AND SCE.CGO_TRC_SVC_FLG = @[cgo_trc_svc_flg]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${cust_cd} != '')" ).append("\n"); 
		query.append("   AND SCE.CUST_CNT_CD||SCE.CUST_SEQ = @[cust_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}