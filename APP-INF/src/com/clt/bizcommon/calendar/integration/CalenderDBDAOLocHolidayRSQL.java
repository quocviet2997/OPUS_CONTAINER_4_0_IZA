/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CalenderDBDAOLocHolidayRSQL.java
*@FileTitle : TEST
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.22
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.05.22 정인선
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.calendar.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jung In Sun
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CalenderDBDAOLocHolidayRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * LocHoliday 조회
	  * </pre>
	  */
	public CalenderDBDAOLocHolidayRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ste_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("hol_to_dt",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("hol_fm_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
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
		query.append("SELECT cnt_cd," ).append("\n"); 
		query.append("cnt_nm," ).append("\n"); 
		query.append("ste_cd," ).append("\n"); 
		query.append("ste_nm," ).append("\n"); 
		query.append("loc_cd," ).append("\n"); 
		query.append("loc_nm," ).append("\n"); 
		query.append("hol_fm_dt," ).append("\n"); 
		query.append("hol_fm_dt_dy," ).append("\n"); 
		query.append("hol_to_dt," ).append("\n"); 
		query.append("hol_to_dt_dy," ).append("\n"); 
		query.append("hol_nm," ).append("\n"); 
		query.append("hol_id," ).append("\n"); 
		query.append("hol_knd_cd" ).append("\n"); 
		query.append("FROM (SELECT ROW_NUMBER() OVER (ORDER BY A.hol_id ASC) no," ).append("\n"); 
		query.append("A.cnt_cd," ).append("\n"); 
		query.append("B.cnt_nm," ).append("\n"); 
		query.append("'' ste_cd," ).append("\n"); 
		query.append("'' ste_nm," ).append("\n"); 
		query.append("'' loc_cd," ).append("\n"); 
		query.append("'' loc_nm," ).append("\n"); 
		query.append("A.hol_fm_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_fm_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_fm_dt_dy," ).append("\n"); 
		query.append("A.hol_to_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_to_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_to_dt_dy," ).append("\n"); 
		query.append("A.hol_nm, A.hol_id, A.HOL_KND_CD" ).append("\n"); 
		query.append("FROM PRD_HOLIDAY A,  MDM_COUNTRY B" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND A.CNT_CD = B.CNT_CD" ).append("\n"); 
		query.append("AND A.HOL_KND_CD = 'C'" ).append("\n"); 
		query.append("AND nvl(A.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("AND not Exists(select hol_id from prd_hol_delt where hol_id = A.hol_id and cnt_cd = A.cnt_cd and loc_cd = @[loc_cd])" ).append("\n"); 
		query.append("#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("AND A.cnt_cd = @[cnt_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${hol_fm_dt} != '' && ${hol_to_dt} != '')" ).append("\n"); 
		query.append("AND ( A.hol_fm_dt between @[hol_fm_dt] AND @[hol_to_dt] OR A.hol_to_dt between @[hol_fm_dt] AND @[hol_to_dt] )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("union" ).append("\n"); 
		query.append("SELECT ROW_NUMBER() OVER (ORDER BY A.hol_id ASC) no," ).append("\n"); 
		query.append("A.cnt_cd," ).append("\n"); 
		query.append("C.cnt_nm," ).append("\n"); 
		query.append("A.ste_cd," ).append("\n"); 
		query.append("B.ste_nm," ).append("\n"); 
		query.append("'' loc_cd," ).append("\n"); 
		query.append("'' loc_nm," ).append("\n"); 
		query.append("A.hol_fm_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_fm_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_fm_dt_dy," ).append("\n"); 
		query.append("A.hol_to_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_to_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_to_dt_dy," ).append("\n"); 
		query.append("A.hol_nm, A.hol_id, A.HOL_KND_CD" ).append("\n"); 
		query.append("FROM PRD_HOLIDAY A, MDM_STATE B, MDM_COUNTRY C" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND A.CNT_CD = B.CNT_CD(+)" ).append("\n"); 
		query.append("AND A.CNT_CD = C.CNT_CD" ).append("\n"); 
		query.append("AND A.STE_CD = B.STE_CD(+)" ).append("\n"); 
		query.append("AND A.HOL_KND_CD = 'S'" ).append("\n"); 
		query.append("AND nvl(A.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("AND not Exists(select hol_id from prd_hol_delt where hol_id = A.hol_id and cnt_cd = A.cnt_cd and loc_cd = @[loc_cd])" ).append("\n"); 
		query.append("AND A.ste_cd = (select ste_cd from mdm_location where loc_cd = @[loc_cd])" ).append("\n"); 
		query.append("#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("AND A.cnt_cd = @[cnt_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${ste_cd} != '')" ).append("\n"); 
		query.append("AND A.ste_cd = @[ste_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${hol_fm_dt} != '' && ${hol_to_dt} != '')" ).append("\n"); 
		query.append("AND ( A.hol_fm_dt between @[hol_fm_dt] AND @[hol_to_dt] OR A.hol_to_dt between @[hol_fm_dt] AND @[hol_to_dt] )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("union" ).append("\n"); 
		query.append("SELECT ROW_NUMBER() OVER (ORDER BY A.hol_id ASC) no," ).append("\n"); 
		query.append("A.cnt_cd," ).append("\n"); 
		query.append("C.cnt_nm," ).append("\n"); 
		query.append("A.ste_cd," ).append("\n"); 
		query.append("B.ste_nm," ).append("\n"); 
		query.append("A.loc_cd," ).append("\n"); 
		query.append("D.loc_nm," ).append("\n"); 
		query.append("A.hol_fm_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_fm_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_fm_dt_dy," ).append("\n"); 
		query.append("A.hol_to_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_to_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_to_dt_dy," ).append("\n"); 
		query.append("A.hol_nm, A.hol_id, A.HOL_KND_CD" ).append("\n"); 
		query.append("FROM PRD_HOLIDAY A, MDM_STATE B, MDM_COUNTRY C, MDM_LOCATION D" ).append("\n"); 
		query.append("WHERE 1 = 1" ).append("\n"); 
		query.append("AND A.CNT_CD = B.CNT_CD(+)" ).append("\n"); 
		query.append("AND A.STE_CD = B.STE_CD(+)" ).append("\n"); 
		query.append("AND A.CNT_CD = C.CNT_CD" ).append("\n"); 
		query.append("AND A.LOC_CD = D.LOC_CD" ).append("\n"); 
		query.append("AND A.HOL_KND_CD = 'L'" ).append("\n"); 
		query.append("AND nvl(A.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("AND A.cnt_cd = @[cnt_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${ste_cd} != '')" ).append("\n"); 
		query.append("AND A.ste_cd = @[ste_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${loc_cd} != '')" ).append("\n"); 
		query.append("AND A.loc_cd = @[loc_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${hol_fm_dt} != '' && ${hol_to_dt} != '')" ).append("\n"); 
		query.append("AND ( A.hol_fm_dt between @[hol_fm_dt] AND @[hol_to_dt] OR A.hol_to_dt between @[hol_fm_dt] AND @[hol_to_dt] )" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(") a" ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("ORDER BY hol_fm_dt ASC" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.calendar.integration").append("\n"); 
		query.append("FileName : CalenderDBDAOLocHolidayRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}