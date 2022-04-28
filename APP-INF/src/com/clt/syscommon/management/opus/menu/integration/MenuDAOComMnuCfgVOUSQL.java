/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ${FILE_NAME}.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.05
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.05 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.integration;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author KyungBum Kim
 * @see 
 * @since J2EE 1.4
 */

public class MenuDAOComMnuCfgVOUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * update menu   
	  * </pre>
	  */
	public MenuDAOComMnuCfgVOUSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("chd_pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_lvl_val",new String[]{arrTmp[0],arrTmp[1]});

		tmp = "12,N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("mnu_cfg_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("prnt_pgm_no",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("update com_mnu_cfg SET" ).append("\n"); 
		query.append("pgm_lvl_val        = @[pgm_lvl_val]," ).append("\n"); 
		query.append("dp_seq             = @[dp_seq]," ).append("\n"); 
		query.append("upd_dt             = sysdate," ).append("\n"); 
		query.append("upd_usr_id		= @[upd_usr_id]" ).append("\n"); 
		query.append("where mnu_cfg_cd = @[mnu_cfg_cd]" ).append("\n"); 
		query.append("and   prnt_pgm_no = @[prnt_pgm_no]" ).append("\n"); 
		query.append("and   chd_pgm_no = @[chd_pgm_no]" ).append("\n"); 

	}
}