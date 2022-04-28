/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ChargeDBDAOChargeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.04.04
*@LastModifier : 
*@LastVersion : 1.0
* 2012.04.04 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.charge.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ChargeDBDAOChargeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Charge의 모든 목록을 가져온다.
	  * </pre>
	  */
	public ChargeDBDAOChargeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("chg_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rep_chg_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.NUMERIC + ",N";
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
		params.put("chg_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("endpart",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.charge.integration").append("\n"); 
		query.append("FileName : ChargeDBDAOChargeListRSQL").append("\n"); 
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
		query.append("SELECT CHG_CD" ).append("\n"); 
		query.append("      ,CHG_NM AS CHG_FULL_NM" ).append("\n"); 
		query.append("      ,''     AS CHG_NM" ).append("\n"); 
		query.append("      ,REP_CHG_CD" ).append("\n"); 
		query.append("      ,''     AS MDM_YN" ).append("\n"); 
		query.append("      , DECODE(DELT_FLG,'Y','Delete','Active') AS DELT_FLG" ).append("\n"); 
		query.append("  FROM (" ).append("\n"); 
		query.append("	    SELECT ROW_NUMBER() OVER (ORDER BY CHG_CD ASC) AS NO" ).append("\n"); 
		query.append("              ,CHG_CD" ).append("\n"); 
		query.append("              ,CHG_NM" ).append("\n"); 
		query.append("              ,REP_CHG_CD" ).append("\n"); 
		query.append("              ,DELT_FLG" ).append("\n"); 
		query.append("	      FROM MDM_CHARGE" ).append("\n"); 
		query.append("	     WHERE 1 = 1   " ).append("\n"); 
		query.append("	     #if (${chg_cd} != '')" ).append("\n"); 
		query.append("		   AND CHG_CD like @[chg_cd] || '%'" ).append("\n"); 
		query.append("	     #end    " ).append("\n"); 
		query.append("	     #if (${chg_nm} != '')      " ).append("\n"); 
		query.append("		   AND CHG_NM like '%' || @[chg_nm] || '%'" ).append("\n"); 
		query.append("	     #end" ).append("\n"); 
		query.append("	     #if (${rep_chg_cd} != '')      " ).append("\n"); 
		query.append("		   AND REP_CHG_CD = @[rep_chg_cd]" ).append("\n"); 
		query.append("	     #end" ).append("\n"); 
		query.append("	     #if (${mdm_yn} != '')" ).append("\n"); 
		query.append("		    #if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		       AND DELT_FLG = @[delt_flg]" ).append("\n"); 
		query.append("		    #elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("		    #else " ).append("\n"); 
		query.append("		       AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("		    #end" ).append("\n"); 
		query.append("	     #else	" ).append("\n"); 
		query.append("		   AND DELT_FLG <> 'Y'" ).append("\n"); 
		query.append("	     #end" ).append("\n"); 
		query.append("       ) " ).append("\n"); 
		query.append("WHERE NO BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 

	}
}