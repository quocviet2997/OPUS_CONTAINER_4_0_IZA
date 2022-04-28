/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienDBDAOSinhVienVOCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.25
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.25 
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

public class SinhVienDBDAOSinhVienVOCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public SinhVienDBDAOSinhVienVOCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("hocphi",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("tuoi",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ten",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.NUMERIC + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sv_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ngaynhaphoc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("khoahoc",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.sinhvien.sinhvien.integration").append("\n"); 
		query.append("FileName : SinhVienDBDAOSinhVienVOCSQL").append("\n"); 
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
		query.append("INSERT INTO SINHVIEN (" ).append("\n"); 
		query.append("	NGAYNHAPHOC" ).append("\n"); 
		query.append(",	HOCPHI" ).append("\n"); 
		query.append(",	KHOAHOC" ).append("\n"); 
		query.append(",	TUOI" ).append("\n"); 
		query.append(",	TEN" ).append("\n"); 
		query.append(",	SV_ID" ).append("\n"); 
		query.append(") VALUES( " ).append("\n"); 
		query.append(",	TO_DATE(@[ngaynhaphoc],'YYYY-MM-DD')" ).append("\n"); 
		query.append(",	@[hocphi]" ).append("\n"); 
		query.append(",	@[khoahoc]" ).append("\n"); 
		query.append(",	@[tuoi]" ).append("\n"); 
		query.append(",	@[ten]" ).append("\n"); 
		query.append(",	@[sv_id]" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}