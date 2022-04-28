/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : UserDAOMdmOrganizationRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.20
*@LastModifier : 
*@LastVersion : 1.0
* 2012.02.20 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class UserDAOMdmOrganizationRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select organization
	  * </pre>
	  */
	public UserDAOMdmOrganizationRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("rhq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.user.integration").append("\n"); 
		query.append("FileName : UserDAOMdmOrganizationRSQL").append("\n"); 
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
		query.append("#if(${ar_ofc_cd} == '')" ).append("\n"); 
		query.append("SELECT                                                               " ).append("\n"); 
		query.append("#foreach($usercol in ${allcols})" ).append("\n"); 
		query.append("	$usercol," ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("	'' dummycol" ).append("\n"); 
		query.append("FROM mdm_organization                                                " ).append("\n"); 
		query.append("WHERE DELT_FLG = 'N'" ).append("\n"); 
		query.append("#if(${rhq} != '')" ).append("\n"); 
		query.append("and AR_HD_QTR_OFC_CD = @[rhq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("CONNECT BY PRIOR ofc_cd = prnt_ofc_cd                                " ).append("\n"); 
		query.append("START WITH prnt_ofc_cd IS NULL" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("select level, ofc_cd , ofc_eng_nm, OFC_LOCL_NM  AS ofc_krn_nm, '' prnt_ofc_cd" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("select ar_ofc_cd" ).append("\n"); 
		query.append("from mdm_organization" ).append("\n"); 
		query.append("group by ar_ofc_cd" ).append("\n"); 
		query.append(") a, mdm_organization b" ).append("\n"); 
		query.append("where a.ar_ofc_cd = b.ofc_cd" ).append("\n"); 
		query.append("and b.DELT_FLG = 'N'" ).append("\n"); 
		query.append("#if(${rhq} != '')" ).append("\n"); 
		query.append("and b.AR_HD_QTR_OFC_CD = @[rhq]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("connect by b.ofc_cd = null" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}