/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CalenderDBDAOCntHolidayRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.11
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.05.11 정인선
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
 * @since J2EE 1.4
 */

public class CalenderDBDAOCntHolidayRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * country의 모든 목록을 가져온다.
	  * </pre>
	  */
	public CalenderDBDAOCntHolidayRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("frdate_cnt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cnt_cd",new String[]{arrTmp[0],arrTmp[1]});

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

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("todate_cnt",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("hol_fm_dt," ).append("\n"); 
		query.append("hol_fm_dt_dy," ).append("\n"); 
		query.append("hol_to_dt," ).append("\n"); 
		query.append("hol_to_dt_dy," ).append("\n"); 
		query.append("hol_nm," ).append("\n"); 
		query.append("hol_id" ).append("\n"); 
		query.append("FROM (SELECT ROW_NUMBER() OVER (ORDER BY A.hol_id ASC) no," ).append("\n"); 
		query.append("A.cnt_cd," ).append("\n"); 
		query.append("B.cnt_nm," ).append("\n"); 
		query.append("A.hol_fm_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_fm_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_fm_dt_dy," ).append("\n"); 
		query.append("A.hol_to_dt," ).append("\n"); 
		query.append("to_char(to_date(A.hol_to_dt, 'YYYYMMDD'), 'DY', 'NLS_DATE_LANGUAGE=ENGLISH') hol_to_dt_dy," ).append("\n"); 
		query.append("A.hol_nm, A.hol_id" ).append("\n"); 
		query.append("FROM PRD_HOLIDAY A, MDM_COUNTRY B" ).append("\n"); 
		query.append("WHERE 1 = 1 AND A.CNT_CD=B.CNT_CD AND A.HOL_KND_CD='C'" ).append("\n"); 
		query.append("AND nvl(A.delt_flg,'N') <> 'Y'" ).append("\n"); 
		query.append("#if (${cnt_cd} != '')" ).append("\n"); 
		query.append("AND B.cnt_cd = @[cnt_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${frdate_cnt} != '' && ${todate_cnt} != '')" ).append("\n"); 
		query.append("AND ( A.hol_fm_dt between @[frdate_cnt] AND @[todate_cnt]" ).append("\n"); 
		query.append("OR  A.hol_to_dt between @[frdate_cnt] AND @[todate_cnt]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append(")) a" ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 
		query.append("ORDER BY hol_fm_dt ASC" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.calendar.integration").append("\n"); 
		query.append("FileName : CalenderDBDAOCntHolidayRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}