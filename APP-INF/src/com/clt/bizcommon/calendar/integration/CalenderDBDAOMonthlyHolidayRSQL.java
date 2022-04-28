/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CalenderDBDAOMonthlyHolidayRSQL.java
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

public class CalenderDBDAOMonthlyHolidayRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * MonthlyHoliday 조회
	  * </pre>
	  */
	public CalenderDBDAOMonthlyHolidayRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
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
		params.put("year",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("SELECT cnt_nm," ).append("\n"); 
		query.append("month," ).append("\n"); 
		query.append("frday," ).append("\n"); 
		query.append("today," ).append("\n"); 
		query.append("hol_nm," ).append("\n"); 
		query.append("monthly_seq" ).append("\n"); 
		query.append("FROM (	SELECT ROW_NUMBER() OVER (ORDER BY monthly_seq ASC) no," ).append("\n"); 
		query.append("cnt_nm," ).append("\n"); 
		query.append("month," ).append("\n"); 
		query.append("frday," ).append("\n"); 
		query.append("today," ).append("\n"); 
		query.append("hol_nm," ).append("\n"); 
		query.append("monthly_seq" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("#foreach( $key in ${counts})" ).append("\n"); 
		query.append("SELECT rownum monthly_seq," ).append("\n"); 
		query.append("B.cnt_nm," ).append("\n"); 
		query.append("SUBSTR(A.hol_fm_dt, 5, 2) month," ).append("\n"); 
		query.append("substr(A.hol_fm_dt, 7, 2) frday," ).append("\n"); 
		query.append("substr(A.hol_to_dt, 7, 2) today," ).append("\n"); 
		query.append("A.hol_nm" ).append("\n"); 
		query.append("FROM prd_holiday A, mdm_country B" ).append("\n"); 
		query.append("WHERE A.cnt_cd = B.cnt_cd" ).append("\n"); 
		query.append("AND A.hol_knd_cd = 'C'" ).append("\n"); 
		query.append("AND SUBSTR(A.hol_fm_dt, 5, 2) = $key" ).append("\n"); 
		query.append("AND NVL(A.delt_flg, 'N') <> 'Y'" ).append("\n"); 
		query.append("#if(${cnt_cd} != '')" ).append("\n"); 
		query.append("AND A.cnt_cd = @[cnt_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${year} != '')" ).append("\n"); 
		query.append("AND substr(A.hol_fm_dt, 0, 4) = @[year]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if($key != '12')" ).append("\n"); 
		query.append("UNION" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY monthly_seq ASC, month ASC" ).append("\n"); 
		query.append(") ) a" ).append("\n"); 
		query.append("WHERE no BETWEEN @[startpart] AND @[endpart]" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.calendar.integration").append("\n"); 
		query.append("FileName : CalenderDBDAOMonthlyHolidayRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}