/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : VVDRateDAOVVDListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.05.04
*@LastModifier : 
*@LastVersion : 1.0
* 2016.05.04 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.exrate.vvd.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class VVDRateDAOVVDListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * vvd rate list
	  * </pre>
	  */
	public VVDRateDAOVVDListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("io_bnd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("port_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("chg_curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("startpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("locl_curr_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("svc_scp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vsl_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.exrate.vvd.integration").append("\n"); 
		query.append("FileName : VVDRateDAOVVDListRSQL").append("\n"); 
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
		query.append("SELECT VVD_CD," ).append("\n"); 
		query.append("	PORT_CD," ).append("\n"); 
		query.append("	IO_BND_CD," ).append("\n"); 
		query.append("	SVC_SCP_CD," ).append("\n"); 
		query.append("	AR_OFC_CD," ).append("\n"); 
		query.append("	LOCL_CURR_CD," ).append("\n"); 
		query.append("	CHG_CURR_CD," ).append("\n"); 
		query.append("	INV_XCH_RT," ).append("\n"); 
		query.append("	IVS_XCH_RT" ).append("\n"); 
		query.append("FROM (	SELECT ROWNUM NO," ).append("\n"); 
		query.append("			VSL_CD||SKD_VOY_NO||SKD_DIR_CD VVD_CD," ).append("\n"); 
		query.append("  			PORT_CD," ).append("\n"); 
		query.append("  			DECODE(IO_BND_CD, 'O' , 'O/B', 'I', 'I/B') IO_BND_CD," ).append("\n"); 
		query.append("  			SVC_SCP_CD," ).append("\n"); 
		query.append("  			AR_OFC_CD," ).append("\n"); 
		query.append("  			LOCL_CURR_CD," ).append("\n"); 
		query.append("  			CHG_CURR_CD," ).append("\n"); 
		query.append("  			INV_XCH_RT," ).append("\n"); 
		query.append("  			IVS_XCH_RT" ).append("\n"); 
		query.append("  		FROM INV_VVD_XCH_RT" ).append("\n"); 
		query.append("        WHERE 1=1" ).append("\n"); 
		query.append("		#if(${vsl_cd} != '')" ).append("\n"); 
		query.append("		AND VSL_CD = SUBSTR(@[vsl_cd],0,4)" ).append("\n"); 
		query.append("        AND SKD_VOY_NO = SUBSTR(@[vsl_cd],5,4)" ).append("\n"); 
		query.append("        AND SKD_DIR_CD = SUBSTR(@[vsl_cd],9,1) " ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if(${port_cd} != '')" ).append("\n"); 
		query.append("			#if(${where} == 'port_cd')" ).append("\n"); 
		query.append("			AND PORT_CD = @[port_cd] " ).append("\n"); 
		query.append("			#else" ).append("\n"); 
		query.append("			AND PORT_CD = @[port_cd] " ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if(${chg_curr_cd} != '')" ).append("\n"); 
		query.append("		  #if(${chg_curr_cd} == 'ALL')	" ).append("\n"); 
		query.append("          #else" ).append("\n"); 
		query.append("           #if(${where} == 'chg_curr_cd')" ).append("\n"); 
		query.append("			AND CHG_CURR_CD = @[chg_curr_cd]" ).append("\n"); 
		query.append("			#else" ).append("\n"); 
		query.append("			AND CHG_CURR_CD = @[chg_curr_cd]" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("          #end" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if(${locl_curr_cd} != '')" ).append("\n"); 
		query.append("         #if(${locl_curr_cd} == 'ALL')" ).append("\n"); 
		query.append("         #else" ).append("\n"); 
		query.append("			#if(${where} == 'chg_curr_cd')" ).append("\n"); 
		query.append("			AND LOCL_CURR_CD = @[locl_curr_cd]" ).append("\n"); 
		query.append("			#else" ).append("\n"); 
		query.append("			AND LOCL_CURR_CD = @[locl_curr_cd]" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("         #end" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if(${svc_scp_cd} != '')" ).append("\n"); 
		query.append("			#if(${where} == 'svc_scp_cd')" ).append("\n"); 
		query.append("			AND SVC_SCP_CD = @[svc_scp_cd]" ).append("\n"); 
		query.append("			#else" ).append("\n"); 
		query.append("			AND SVC_SCP_CD = @[svc_scp_cd]" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("		#if(${io_bnd_cd} != '')" ).append("\n"); 
		query.append("			#if(${where} == 'io_bnd_cd')" ).append("\n"); 
		query.append("			AND IO_BND_CD = @[io_bnd_cd]" ).append("\n"); 
		query.append("			#else" ).append("\n"); 
		query.append("			AND IO_BND_CD = @[io_bnd_cd]" ).append("\n"); 
		query.append("			#end" ).append("\n"); 
		query.append("		#end" ).append("\n"); 
		query.append("  	) A" ).append("\n"); 
		query.append("WHERE NO BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("AND ROWNUM <= 50" ).append("\n"); 

	}
}