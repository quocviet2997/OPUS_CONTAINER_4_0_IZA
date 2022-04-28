/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : SetupCreationDBDAOCheckEdiGroupCodeRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.03
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2016.03.03 김성욱
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Sung-Wook Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOCheckEdiGroupCodeRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * EDI GROUP에 Edi Group Code가 존재하는지 체크한다
	  * </pre>
	  */
	public SetupCreationDBDAOCheckEdiGroupCodeRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("co_div_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOCheckEdiGroupCodeRSQL").append("\n"); 
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
		query.append("SELECT EDI_GRP_CD" ).append("\n"); 
		query.append("  FROM EDI_GROUP" ).append("\n"); 
		query.append(" WHERE EDI_GRP_CD = @[edi_grp_cd]" ).append("\n"); 
		query.append("#if(${co_div_cd} != '')" ).append("\n"); 
		query.append("   AND CO_DIV_CD = @[co_div_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("   AND DELT_FLG = 'N'" ).append("\n"); 
		query.append("   AND ROWNUM = 1" ).append("\n"); 

	}
}