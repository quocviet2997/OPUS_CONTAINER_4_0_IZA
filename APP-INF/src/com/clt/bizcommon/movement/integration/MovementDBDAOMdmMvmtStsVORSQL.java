/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : MovementDBDAOMdmMvmtStsVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.03.28
*@LastModifier : 
*@LastVersion : 1.0
* 2012.03.28 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.movement.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MovementDBDAOMdmMvmtStsVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * MdmMvmtStsVO
	  * </pre>
	  */
	public MovementDBDAOMdmMvmtStsVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("mvmt_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("delt_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("mvmt_sts_nm",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.movement.integration").append("\n"); 
		query.append("FileName : MovementDBDAOMdmMvmtStsVORSQL").append("\n"); 
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
		query.append("SELECT mvmt_sts_cd" ).append("\n"); 
		query.append("     , mvmt_sts_nm" ).append("\n"); 
		query.append("     , io_bnd_cd" ).append("\n"); 
		query.append("     ,(CASE " ).append("\n"); 
		query.append("         WHEN 'Y' = delt_flg THEN 'Delete' " ).append("\n"); 
		query.append("         ELSE 'Active' " ).append("\n"); 
		query.append("       END) AS delt_flg" ).append("\n"); 
		query.append("FROM mdm_mvmt_sts" ).append("\n"); 
		query.append("WHERE mvmt_sts_cd LIKE @[mvmt_sts_cd]||'%'" ).append("\n"); 
		query.append("AND UPPER(mvmt_sts_nm) LIKE '%'||@[mvmt_sts_nm]||'%'" ).append("\n"); 
		query.append("#if (${mdm_yn} != '')" ).append("\n"); 
		query.append("	#if (${delt_flg} == 'Y') " ).append("\n"); 
		query.append("		AND delt_flg = @[delt_flg]" ).append("\n"); 
		query.append("	#elseif (${delt_flg} == 'ALL') " ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("	#else" ).append("\n"); 
		query.append("		AND delt_flg <> 'Y'" ).append("\n"); 
		query.append("	#end" ).append("\n"); 
		query.append("" ).append("\n"); 
		query.append("#else	" ).append("\n"); 
		query.append("	AND delt_flg <> 'Y'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("ORDER BY mvmt_sts_cd" ).append("\n"); 

	}
}