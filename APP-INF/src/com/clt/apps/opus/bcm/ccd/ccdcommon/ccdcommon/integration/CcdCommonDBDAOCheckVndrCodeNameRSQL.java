/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CcdCommonDBDAOCheckVndrCodeNameRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2012.04.09
*@LastModifier : 
*@LastVersion : 1.0
* 2012.04.09 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CcdCommonDBDAOCheckVndrCodeNameRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Vender Code, Name 을 조회합니다.
	  * </pre>
	  */
	public CcdCommonDBDAOCheckVndrCodeNameRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("vndr_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration ").append("\n"); 
		query.append("FileName : CcdCommonDBDAOCheckVndrCodeNameRSQL").append("\n"); 
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
		query.append("SELECT  VNDR_SEQ VNDR_CD  " ).append("\n"); 
		query.append("       ,VNDR_LGL_ENG_NM VNDR_CD" ).append("\n"); 
		query.append("  FROM  MDM_VENDOR " ).append("\n"); 
		query.append(" WHERE  1=1 " ).append("\n"); 
		query.append("   AND  VNDR_SEQ = @[vndr_cd]" ).append("\n"); 
		query.append("   AND  DELT_FLG ='N'" ).append("\n"); 

	}
}