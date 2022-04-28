/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ContractNoDBDAOTotalContractNoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.24
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.24 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.contractno.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ContractNoDBDAOTotalContractNoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 총갯수
	  * </pre>
	  */
	public ContractNoDBDAOTotalContractNoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cust_lgl_eng_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edate",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ctrt_cust_sls_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cont_tp",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sdate",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.contractno.integration").append("\n"); 
		query.append("FileName : ContractNoDBDAOTotalContractNoRSQL").append("\n"); 
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
		query.append("WITH CTRT AS" ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("SELECT  HD.SC_NO                ," ).append("\n"); 
		query.append("        MN.AMDT_SEQ             ," ).append("\n"); 
		query.append("        MC.CUST_LGL_ENG_NM      ," ).append("\n"); 
		query.append("        SR.OFC_CD               ," ).append("\n"); 
		query.append("        CP.CTRT_CUST_SLS_OFC_CD ," ).append("\n"); 
		query.append("        TO_CHAR(DR.CTRT_EFF_DT,'yyyy-mm-dd')CTRT_EFF_DT ," ).append("\n"); 
		query.append("        TO_CHAR(DR.CTRT_EXP_DT,'yyyy-mm-dd')CTRT_EXP_DT ," ).append("\n"); 
		query.append("		MC.DELT_FLG" ).append("\n"); 
		query.append("FROM    PRI_SP_HDR      HD  ," ).append("\n"); 
		query.append("        PRI_SP_MN       MN  ," ).append("\n"); 
		query.append("        PRI_SP_CTRT_PTY CP  ," ).append("\n"); 
		query.append("        PRI_SP_DUR      DR  ," ).append("\n"); 
		query.append("        MDM_CUSTOMER    MC  ," ).append("\n"); 
		query.append("        MDM_SLS_REP     SR" ).append("\n"); 
		query.append("WHERE   MN.PROP_NO              = HD.PROP_NO" ).append("\n"); 
		query.append("AND     MN.PROP_STS_CD          = 'F'" ).append("\n"); 
		query.append("AND     CP.PROP_NO              = MN.PROP_NO" ).append("\n"); 
		query.append("AND     CP.AMDT_SEQ             = MN.AMDT_SEQ" ).append("\n"); 
		query.append("AND     CP.PRC_CTRT_PTY_TP_CD   = 'C'" ).append("\n"); 
		query.append("AND     DR.PROP_NO              = MN.PROP_NO" ).append("\n"); 
		query.append("AND     DR.AMDT_SEQ             = MN.AMDT_SEQ" ).append("\n"); 
		query.append("AND     MC.CUST_CNT_CD          = CP.CUST_CNT_CD" ).append("\n"); 
		query.append("AND     MC.CUST_SEQ             = CP.CUST_SEQ" ).append("\n"); 
		query.append("AND     SR.SREP_CD              = CP.CTRT_CUST_SREP_CD" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT  COUNT(*)" ).append("\n"); 
		query.append("FROM    CTRT    A" ).append("\n"); 
		query.append("WHERE   NOT EXISTS ( SELECT 'X' FROM CTRT B WHERE B.SC_NO = A.SC_NO AND B.AMDT_SEQ > A.AMDT_SEQ )" ).append("\n"); 
		query.append("#if (${cont_tp} != '')" ).append("\n"); 
		query.append("	#if(${sc_seq_no} == 'B')" ).append("\n"); 
		query.append("		AND SC_NO LIKE '%' || @[cont_tp] || '%'" ).append("\n"); 
		query.append("	#else" ).append("\n"); 
		query.append("		AND SC_NO LIKE @[cont_tp] || '%'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${custnm} != '')" ).append("\n"); 
		query.append("		AND upper(CUST_LGL_ENG_NM) LIKE '%' || upper(@[cust_lgl_eng_nm]) || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if(${sdate} != '' && ${edate} != '')" ).append("\n"); 
		query.append("		AND A.CTRT_EFF_DT BETWEEN TO_DATE(@[sdate],'YYYY-MM-DD') AND TO_DATE(@[edate],'YYYY-MM-DD')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if(${ofc_cd} != '')" ).append("\n"); 
		query.append("		AND OFC_CD LIKE @[ofc_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if(${ctrt_cust_sls_ofc_cd} != '')" ).append("\n"); 
		query.append("		AND CTRT_CUST_SLS_OFC_CD LIKE @[ctrt_cust_sls_ofc_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#else " ).append("\n"); 
		query.append("		AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}