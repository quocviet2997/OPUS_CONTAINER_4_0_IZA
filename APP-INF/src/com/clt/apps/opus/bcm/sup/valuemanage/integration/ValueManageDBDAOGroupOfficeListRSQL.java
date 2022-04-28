/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ValueManageDBDAOGroupOfficeListRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.16
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2011.02.16 송민석
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author SONG Min Seok
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ValueManageDBDAOGroupOfficeListRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * mdm_ofc_grp, mdm_ofc_grp_mapg 테이블 조회
	  * </pre>
	  */
	public ValueManageDBDAOGroupOfficeListRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_grp_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.valuemanage.integration").append("\n"); 
		query.append("FileName : ValueManageDBDAOGroupOfficeListRSQL").append("\n"); 
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
		query.append("SELECT ofc_grp_id, sub_sys_cd, ofc_cd" ).append("\n"); 
		query.append("from mdm_ofc_grp_mapg" ).append("\n"); 
		query.append("where ofc_grp_id = @[ofc_grp_id]" ).append("\n"); 
		query.append("and sub_sys_cd = @[sub_sys_cd]" ).append("\n"); 

	}
}