/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OfficeProgramDAOSearchComOfcPgmMtchRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.04
*@LastModifier : 
*@LastVersion : 1.0
* 2009.06.04 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.officeprogram.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class OfficeProgramDAOSearchComOfcPgmMtchRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * select office list
	  * </pre>
	  */
	public OfficeProgramDAOSearchComOfcPgmMtchRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("loc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_knd_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("prnt_ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("ofc_nm",new String[]{arrTmp[0],arrTmp[1]});

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
		query.append("SELECT ofc_cd," ).append("\n"); 
		query.append("ofc_eng_nm," ).append("\n"); 
		query.append("DECODE( OFC_KND_CD, 1, 'SHQ', 2, 'RHQ', 3, 'GOF', 4, 'SOF', 5, 'LOF', 6, 'AGT', '' ) ofc_knd_cd," ).append("\n"); 
		query.append("loc_cd," ).append("\n"); 
		query.append("pgm_assign" ).append("\n"); 
		query.append("FROM (" ).append("\n"); 
		query.append("SELECT" ).append("\n"); 
		query.append("aa.ofc_cd," ).append("\n"); 
		query.append("aa.ofc_eng_nm," ).append("\n"); 
		query.append("aa.ofc_knd_cd," ).append("\n"); 
		query.append("aa.loc_cd," ).append("\n"); 
		query.append("decode(bb.ofc_cd,null,'X','O') pgm_assign" ).append("\n"); 
		query.append("FROM MDM_ORGANIZATION aa, (select ofc_cd, COUNT(*)  from com_ofc_pgm_mtch GROUP BY OFC_CD) bb" ).append("\n"); 
		query.append("WHERE aa.ofc_cd = bb.ofc_cd(+)" ).append("\n"); 
		query.append("#if(${loc_cd}!='')" ).append("\n"); 
		query.append("and aa.loc_cd like '%' || @[loc_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${ofc_knd_cd}!='')" ).append("\n"); 
		query.append("and aa.ofc_knd_cd like '%' || @[ofc_knd_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${prnt_ofc_cd}!='')" ).append("\n"); 
		query.append("and aa.prnt_ofc_cd like '%' || @[prnt_ofc_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${ofc_cd}!='')" ).append("\n"); 
		query.append("and aa.ofc_cd like '%' || @[ofc_cd] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${ofc_nm}!='')" ).append("\n"); 
		query.append("and aa.ofc_eng_nm like '%' || @[ofc_nm] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("and delt_flg = 'N'" ).append("\n"); 
		query.append(") a" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.nis2010.management.officeprogram.integration").append("\n"); 
		query.append("FileName : OfficeProgramDAOSearchComOfcPgmMtchRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}