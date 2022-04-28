/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ${FILE_NAME}.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.13
*@LastModifier : 이승열
*@LastVersion : 1.0
* 2009.01.13 이승열
* 1.0 ���� ��
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

public class BookmarkManagementDAOComBookmarkDSQL implements ISQLTemplate{
	private final String sql="delete from com_bookmark \n" + 
 "where	usr_id = @[usr_id] \n" + 
 "and	pgm_no = @[pgm_no] \n" + 
 "";
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * delete bookmark
	  * </pre>
	  */
	public BookmarkManagementDAOComBookmarkDSQL(){

		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
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
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

	}
	
	public String getSQL(){
		return sql;
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}
	
}
