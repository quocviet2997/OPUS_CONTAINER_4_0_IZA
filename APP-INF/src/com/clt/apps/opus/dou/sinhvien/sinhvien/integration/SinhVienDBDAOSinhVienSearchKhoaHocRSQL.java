/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienDBDAOSinhVienSearchKhoaHocRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.31
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.31 
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

public class SinhVienDBDAOSinhVienSearchKhoaHocRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * test
	  * </pre>
	  */
	public SinhVienDBDAOSinhVienSearchKhoaHocRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.sinhvien.sinhvien.integration").append("\n"); 
		query.append("FileName : SinhVienDBDAOSinhVienSearchKhoaHocRSQL").append("\n"); 
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
		query.append("SELECT " ).append("\n"); 
		query.append("	DISTINCT(khoahoc) as khoahoc" ).append("\n"); 
		query.append("FROM SINHVIEN" ).append("\n"); 
		query.append("ORDER BY khoahoc" ).append("\n"); 

	}
}