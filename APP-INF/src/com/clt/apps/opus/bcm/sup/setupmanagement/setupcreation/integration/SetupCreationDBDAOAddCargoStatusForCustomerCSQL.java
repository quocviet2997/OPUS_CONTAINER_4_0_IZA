/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : SetupCreationDBDAOAddCargoStatusForCustomerCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.02
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2016.03.02 김성욱
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

public class SetupCreationDBDAOAddCargoStatusForCustomerCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * Cargo Tracking Info.(Non physical event for customer) 정보를 신규 입력한다
	  * </pre>
	  */
	public SetupCreationDBDAOAddCargoStatusForCustomerCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pst_edi_grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_rmk1",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_rmk2",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_pst_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_pre_sav_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pre_edi_grp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("edi_pre_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("edi_pst_sav_flg",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("org_edi_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOAddCargoStatusForCustomerCSQL").append("\n"); 
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
		query.append("INSERT INTO SCE_EDI_MNG_STS (" ).append("\n"); 
		query.append("	 ORG_EDI_STS_CD" ).append("\n"); 
		query.append("	,EDI_STS_SEQ" ).append("\n"); 
		query.append("	,EDI_PRE_STS_CD" ).append("\n"); 
		query.append("	,EDI_PRE_SAV_FLG" ).append("\n"); 
		query.append("	,PRE_EDI_GRP_CD" ).append("\n"); 
		query.append("	,EDI_PST_STS_CD" ).append("\n"); 
		query.append("	,EDI_PST_SAV_FLG" ).append("\n"); 
		query.append("	,PST_EDI_GRP_CD" ).append("\n"); 
		query.append("	,EDI_RMK1" ).append("\n"); 
		query.append("	,EDI_RMK2" ).append("\n"); 
		query.append("	,CRE_USR_ID" ).append("\n"); 
		query.append("	,CRE_DT" ).append("\n"); 
		query.append("	,UPD_USR_ID" ).append("\n"); 
		query.append("	,UPD_DT" ).append("\n"); 
		query.append(") VALUES (" ).append("\n"); 
		query.append("     @[org_edi_sts_cd]" ).append("\n"); 
		query.append("    ,(SELECT NVL(MAX(EDI_STS_SEQ), 0) + 1" ).append("\n"); 
		query.append("		FROM SCE_EDI_MNG_STS" ).append("\n"); 
		query.append("	   WHERE ORG_EDI_STS_CD = @[org_edi_sts_cd]" ).append("\n"); 
		query.append("     )" ).append("\n"); 
		query.append("    ,@[edi_pre_sts_cd]" ).append("\n"); 
		query.append("    ,@[edi_pre_sav_flg]" ).append("\n"); 
		query.append("    ,@[pre_edi_grp_cd]" ).append("\n"); 
		query.append("    ,@[edi_pst_sts_cd]" ).append("\n"); 
		query.append("    ,@[edi_pst_sav_flg]" ).append("\n"); 
		query.append("    ,@[pst_edi_grp_cd]" ).append("\n"); 
		query.append("    ,@[edi_rmk1]" ).append("\n"); 
		query.append("    ,@[edi_rmk2]" ).append("\n"); 
		query.append("    ,@[cre_usr_id]" ).append("\n"); 
		query.append("    ,SYSDATE" ).append("\n"); 
		query.append("    ,@[upd_usr_id]" ).append("\n"); 
		query.append("    ,SYSDATE" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}