/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : OfficeManagementDBDAOOfficListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.20
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.20 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.officemanagement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class OfficeManagementDBDAOOfficListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public OfficeManagementDBDAOOfficListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.officemanagement.integration").append("\n"); 
		query.append("FileName : OfficeManagementDBDAOOfficListVORSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("	(select count(ofc_cd) from  com_ofc_pgm_mtch where ofc_cd = a.ofc_cd and pgm_no = @[pgm_no]) check_val,                                                       " ).append("\n"); 
		query.append("	level," ).append("\n"); 
		query.append("	ofc_cd," ).append("\n"); 
		query.append("	ofc_eng_nm," ).append("\n"); 
		query.append("	OFC_LOCL_NM  AS ofc_krn_nm," ).append("\n"); 
		query.append("	prnt_ofc_cd," ).append("\n"); 
		query.append("	ofc_knd_cd," ).append("\n"); 
		query.append("    rep_cust_cnt_cd," ).append("\n"); 
		query.append("    ar_ofc_cd," ).append("\n"); 
		query.append("	'' dummycol" ).append("\n"); 
		query.append("FROM mdm_organization a                                            " ).append("\n"); 
		query.append("WHERE DELT_FLG = 'N'                                                 " ).append("\n"); 
		query.append("CONNECT BY PRIOR ofc_cd = prnt_ofc_cd                                " ).append("\n"); 
		query.append("START WITH prnt_ofc_cd IS NULL" ).append("\n"); 

	}
}