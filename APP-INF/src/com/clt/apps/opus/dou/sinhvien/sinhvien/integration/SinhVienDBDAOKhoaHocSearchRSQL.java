/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienDBDAOKhoaHocSearchRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.sinhvien.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Vi Nguyen
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SinhVienDBDAOKhoaHocSearchRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * test
	  * </pre>
	  */
	public SinhVienDBDAOKhoaHocSearchRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.sinhvien.sinhvien.integration ").append("\n"); 
		query.append("FileName : SinhVienDBDAOKhoaHocSearchRSQL").append("\n"); 
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
		query.append("SELECT khoahoc," ).append("\n"); 
		query.append("count(sv_id) AS soLuong," ).append("\n"); 
		query.append("sum(hocphi) AS tongHocPhi" ).append("\n"); 
		query.append("FROM SinhVien" ).append("\n"); 
		query.append("GROUP BY khoahoc " ).append("\n"); 
		query.append("ORDER BY khoahoc" ).append("\n"); 

	}
}