/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MuonSachDBDAOMuonSachVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.muonsach.muonsach.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Vi Nguyen
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MuonSachDBDAOMuonSachVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public MuonSachDBDAOMuonSachVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.muonsach.muonsach.integration").append("\n"); 
		query.append("FileName : MuonSachDBDAOMuonSachVORSQL").append("\n"); 
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
		query.append("	STT" ).append("\n"); 
		query.append(",	NGAY" ).append("\n"); 
		query.append(",	SOTIEN" ).append("\n"); 
		query.append(",	SINHVIEN_ID" ).append("\n"); 
		query.append("FROM MUONSACH" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("#if (${sinhvien_id} != '' && ${sinhvien_id}) " ).append("\n"); 
		query.append("AND SINHVIEN_ID IN (" ).append("\n"); 
		query.append("	#foreach($key IN ${obj_list_no}) #if($velocityCount < $obj_list_no.size()) '$key', #else '$key' #end #end" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY SINHVIEN_ID" ).append("\n"); 

	}
}