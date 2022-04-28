/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienDBDAOSinhVienVORSQL.java
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

public class SinhVienDBDAOSinhVienVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * SELECT khoahoc,
	  * count(sv_id) AS soLuong,
	  * sum(hocphi) AS tongHocPhi
	  * FROM SinhVien
	  * GROUP BY khoahoc 
	  * ORDER BY khoahoc
	  * </pre>
	  */
	public SinhVienDBDAOSinhVienVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ten",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("tuoi",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.sinhvien.sinhvien.integration").append("\n"); 
		query.append("FileName : SinhVienDBDAOSinhVienVORSQL").append("\n"); 
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
		query.append("	SV_ID" ).append("\n"); 
		query.append(",	TEN" ).append("\n"); 
		query.append(",	TUOI" ).append("\n"); 
		query.append(",	KHOAHOC" ).append("\n"); 
		query.append(",	HOCPHI" ).append("\n"); 
		query.append(",	TO_CHAR(NGAYNHAPHOC, 'YYYY-MM-DD') AS NGAYNHAPHOC" ).append("\n"); 
		query.append("FROM SINHVIEN" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if (${ten} != '' ) " ).append("\n"); 
		query.append("AND TEN = @[ten]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${tuoi} != '' )" ).append("\n"); 
		query.append("AND	TUOI = @[tuoi]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${khoahoc} != '' && ${khoahoc}) " ).append("\n"); 
		query.append("AND KHOAHOC IN (" ).append("\n"); 
		query.append("	#foreach($key IN ${obj_list_no}) #if($velocityCount < $obj_list_no.size()) '$key', #else '$key' #end #end" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY SV_ID" ).append("\n"); 

	}
}