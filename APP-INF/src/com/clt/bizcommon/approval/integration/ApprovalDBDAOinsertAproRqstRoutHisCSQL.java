/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : ApprovalDBDAOinsertAproRqstRoutHisCSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2019.01.18
*@LastModifier : 
*@LastVersion : 1.0
* 2019.01.18 
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOinsertAproRqstRoutHisCSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * ApprovalDBDAO insertAproRqstRoutHis CSQL
	  * </pre>
	  */
	public ApprovalDBDAOinsertAproRqstRoutHisCSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_evnt_desc",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("sub_sys_cd",new String[]{arrTmp[0],arrTmp[1]});

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
		params.put("cre_usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("apro_rqst_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration").append("\n"); 
		query.append("FileName : ApprovalDBDAOinsertAproRqstRoutHisCSQL").append("\n"); 
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
		query.append("INSERT INTO COM_APRO_RQST_ROUT_HIS (" ).append("\n"); 
		query.append("APRO_ROUT_HIS_SEQ, CSR_NO" ).append("\n"); 
		query.append(", SUB_SYS_CD, DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append(", APRO_RQST_NO, APRO_RQST_SEQ, DP_SEQ, APRO_USR_ID, APSTS_CD, APRO_DT" ).append("\n"); 
		query.append(", APRO_EVNT_DESC, APRO_RMK" ).append("\n"); 
		query.append(", DELT_FLG, CRE_USR_ID, CRE_DT, UPD_USR_ID, UPD_DT" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("SELECT " ).append("\n"); 
		query.append("COM_APRO_RQST_ROUT_HIS_SEQ.NEXTVAL APRO_ROUT_HIS_SEQ, CD.CSR_NO" ).append("\n"); 
		query.append(", RH.SUB_SYS_CD, RH.DFLT_APRO_OFC_CD" ).append("\n"); 
		query.append(", RH.APRO_RQST_NO, RR.APRO_RQST_SEQ, RR.DP_SEQ, RR.APRO_USR_ID, RR.APSTS_CD, RR.APRO_DT" ).append("\n"); 
		query.append(", @[apro_evnt_desc] APRO_EVNT_DESC, (SELECT '[DFLT_CURR_AMT:'||D.CSR_CURR_CD||'-'||D.CSR_AMT||']' FROM COM_APRO_ROUT_DFLT D WHERE D.SUB_SYS_CD = @[sub_sys_cd] AND D.OFC_CD = @[ofc_cd] AND ROWNUM = 1) APRO_RMK" ).append("\n"); 
		query.append(", RR.DELT_FLG, RR.CRE_USR_ID, RR.CRE_DT, @[cre_usr_id], RR.UPD_DT" ).append("\n"); 
		query.append("FROM COM_APRO_CSR_DTL CD, COM_APRO_RQST_HDR RH, COM_APRO_RQST_ROUT RR" ).append("\n"); 
		query.append("WHERE 1=1" ).append("\n"); 
		query.append("AND CD.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("AND CD.APRO_RQST_NO = @[apro_rqst_no]" ).append("\n"); 
		query.append("AND CD.APRO_RQST_NO = RH.APRO_RQST_NO" ).append("\n"); 
		query.append("AND RH.APRO_RQST_NO = RR.APRO_RQST_NO" ).append("\n"); 

	}
}