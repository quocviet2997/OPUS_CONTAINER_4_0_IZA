/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienDBDAOSinhVienVODSQL.java
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.sinhvien.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Vi Nguyen
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SinhVienDBDAOSinhVienVODSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public SinhVienDBDAOSinhVienVODSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sv_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.sinhvien.sinhvien.integration").append("\n"); 
		query.append("FileName : SinhVienDBDAOSinhVienVODSQL").append("\n"); 
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
		query.append("DELETE FROM SINHVIEN" ).append("\n"); 
		query.append("WHERE	SV_ID = @[sv_id]" ).append("\n"); 

	}
}