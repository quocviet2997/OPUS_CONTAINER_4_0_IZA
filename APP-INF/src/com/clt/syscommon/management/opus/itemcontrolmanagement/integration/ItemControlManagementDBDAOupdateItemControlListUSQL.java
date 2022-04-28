/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : ItemControlManagementDBDAOupdateItemControlListUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2013.07.12
*@LastModifier : 
*@LastVersion : 1.0
* 2013.07.12 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.itemcontrolmanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ItemControlManagementDBDAOupdateItemControlListUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * updateItemControlList
	  * </pre>
	  */
	public ItemControlManagementDBDAOupdateItemControlListUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_itm_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("key_pgm_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ctrl_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("itm_dp_nm",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("itm_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("upd_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("aply_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("set_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("key_pgm_itm_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("key_pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.itemcontrolmanagement.integration").append("\n"); 
		query.append("FileName : ItemControlManagementDBDAOupdateItemControlListUSQL").append("\n"); 
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
		query.append("UPDATE COM_UI_ITM_CTRL_STUP" ).append("\n"); 
		query.append("SET 	PGM_SUB_SYS_CD  = @[pgm_sub_sys_cd]" ).append("\n"); 
		query.append("	    , PGM_NO        = @[pgm_no]" ).append("\n"); 
		query.append("	    , PGM_ITM_ID    = @[pgm_itm_id]" ).append("\n"); 
		query.append("		, CTRL_TP_CD  	= @[ctrl_tp_cd]" ).append("\n"); 
		query.append("        , ITM_DP_NM 	= @[itm_dp_nm]" ).append("\n"); 
		query.append("        , SET_TP_CD 	= @[set_tp_cd]" ).append("\n"); 
		query.append("		, APLY_FLG		= @[aply_flg]" ).append("\n"); 
		query.append("        , ITM_DESC  	= @[itm_desc]" ).append("\n"); 
		query.append("        , UPD_USR_ID	= @[upd_usr_id]" ).append("\n"); 
		query.append("        , UPD_DT    	= SYSDATE" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("WHERE CO_ID = COM_CONSTANTMGR_PKG.COM_getCompanyCode_FNC()" ).append("\n"); 
		query.append("AND PGM_SUB_SYS_CD    = @[key_pgm_sub_sys_cd]" ).append("\n"); 
		query.append("AND PGM_NO              = @[key_pgm_no]" ).append("\n"); 
		query.append("AND PGM_ITM_ID          = @[key_pgm_itm_id]" ).append("\n"); 

	}
}