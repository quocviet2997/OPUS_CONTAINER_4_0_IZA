/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FileManagementDBDAOComUpldFileVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.08 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.file.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.4
 */

public class FileManagementDBDAOComUpldFileVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *   WAS에 올라간 File에 대한 정보를 가져온다.
	  * </pre>
	  */
	public FileManagementDBDAOComUpldFileVORSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = "12,n";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("file_sav_id",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("SELECT" ).append("\n"); 
		query.append("file_sav_id" ).append("\n"); 
		query.append(",	file_upld_nm" ).append("\n"); 
		query.append(",	file_sz_capa" ).append("\n"); 
		query.append(",	file_path_url" ).append("\n"); 
		query.append(",	pgm_sub_sys_cd" ).append("\n"); 
		query.append(",	delt_flg" ).append("\n"); 
		query.append(",	cre_usr_id" ).append("\n"); 
		query.append("FROM com_upld_file" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.nis2010.management.file.filemanagement.integration").append("\n"); 
		query.append("FileName : FileManagementDBDAOComUpldFileVORSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}