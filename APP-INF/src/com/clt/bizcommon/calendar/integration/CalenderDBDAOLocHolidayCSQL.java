/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CalenderDBDAOLocHolidayCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.07
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.05.07 정인선
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

public class CalenderDBDAOLocHolidayCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * LocHoliday insert
	  * </pre>
	  */
	public CalenderDBDAOLocHolidayCSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ste_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("hol_to_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("hol_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("hol_fm_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("hol_knd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("hol_id",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("insert into prd_holiday (" ).append("\n"); 
		query.append("hol_id," ).append("\n"); 
		query.append("hol_nm," ).append("\n"); 
		query.append("hol_knd_cd," ).append("\n"); 
		query.append("cnt_cd," ).append("\n"); 
		query.append("ste_cd," ).append("\n"); 
		query.append("loc_cd," ).append("\n"); 
		query.append("hol_fm_dt," ).append("\n"); 
		query.append("hol_to_dt," ).append("\n"); 
		query.append("delt_flg," ).append("\n"); 
		query.append("cre_usr_id," ).append("\n"); 
		query.append("cre_dt" ).append("\n"); 
		query.append(") values(" ).append("\n"); 
		query.append("(@[hol_id]||LPAD(prd_netnode_hol_seq1.nextval, 5, '0')," ).append("\n"); 
		query.append("@[hol_nm]," ).append("\n"); 
		query.append("@[hol_knd_cd]," ).append("\n"); 
		query.append("@[cnt_cd]," ).append("\n"); 
		query.append("@[ste_cd]," ).append("\n"); 
		query.append("@[loc_cd]," ).append("\n"); 
		query.append("@[hol_fm_dt]," ).append("\n"); 
		query.append("@[hol_to_dt]," ).append("\n"); 
		query.append("'N'," ).append("\n"); 
		query.append("@[cre_usr_id]," ).append("\n"); 
		query.append("SYSDATE" ).append("\n"); 
		query.append(")" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.calendar.integration").append("\n"); 
		query.append("FileName : CalenderDBDAOLocHolidayCSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}