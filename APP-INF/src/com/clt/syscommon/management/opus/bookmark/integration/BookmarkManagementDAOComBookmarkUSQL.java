/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ${FILE_NAME}.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.19
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.03.19 이승열
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.bookmark.integration;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author seungyol lee
 * @see 
 * @since J2EE 1.4
 */

public class BookmarkManagementDAOComBookmarkUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * update bookmark
	  * </pre>
	  */
	public BookmarkManagementDAOComBookmarkUSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dp_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("dp_seq",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnt_pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("update com_bookmark set" ).append("\n"); 
		query.append("dp_seq = @[dp_seq]," ).append("\n"); 
		query.append("dp_nm = @[dp_nm]," ).append("\n"); 
		query.append("prnt_pgm_no = @[prnt_pgm_no]," ).append("\n"); 
		query.append("upd_usr_id = @[usr_id]," ).append("\n"); 
		query.append("upd_dt=sysdate" ).append("\n"); 
		query.append("where	usr_id = @[usr_id]" ).append("\n"); 
		query.append("and	pgm_no = @[pgm_no]" ).append("\n"); 

	}
}