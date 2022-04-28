/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOUpdateRevVVDDtrbUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.07
*@LastModifier : 김현욱
*@LastVersion : 1.0
* 2010.07.07 김현욱
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.approval.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Kim Hyun Uk
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ApprovalDBDAOUpdateRevVVDDtrbUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * VVD를 갱신합니다
	  * </pre>
	  */
	public ApprovalDBDAOUpdateRevVVDDtrbUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("new_gl_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("csr_no",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.bizcommon.approval.integration ").append("\n"); 
		query.append("FileName : ApprovalDBDAOUpdateRevVVDDtrbUSQL").append("\n"); 
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
		query.append("UPDATE AP_INV_DTRB" ).append("\n"); 
		query.append("SET DTRB_COA_VVD_CD = (" ).append("\n"); 
		query.append("DECODE(" ).append("\n"); 
		query.append("(" ).append("\n"); 
		query.append("SELECT SUBSTR(D.DTRB_COA_VVD_CD,1,4)||SUBSTR(@[new_gl_dt],3,4)||SUBSTR(D.DTRB_COA_VVD_CD,9,2) NEW_DTRB_COA_VVD_CD" ).append("\n"); 
		query.append("FROM AP_INV_HDR  A" ).append("\n"); 
		query.append(", AP_INV_DTRB D" ).append("\n"); 
		query.append("WHERE A.CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("AND A.CSR_NO = D.CSR_NO" ).append("\n"); 
		query.append("AND NVL(A.IF_FLG,'N')     <>'E'" ).append("\n"); 
		query.append("AND NVL(A.RCV_ERR_FLG,'N')<>'E'" ).append("\n"); 
		query.append("AND A.GL_DT IS NOT NULL" ).append("\n"); 
		query.append("AND D.DTRB_COA_VVD_CD LIKE 'CNTC'||'%'" ).append("\n"); 
		query.append("AND SUBSTR(D.DTRB_COA_VVD_CD,5,4) <> SUBSTR(@[new_gl_dt],3,4)" ).append("\n"); 
		query.append("AND ROWNUM = 1" ).append("\n"); 
		query.append("), NULL, (SELECT DTRB_COA_VVD_CD FROM AP_INV_DTRB WHERE CSR_NO = @[csr_no] AND ROWNUM = 1)" ).append("\n"); 
		query.append(",(SELECT SUBSTR(D.DTRB_COA_VVD_CD,1,4)||SUBSTR(@[new_gl_dt],3,4)||SUBSTR(D.DTRB_COA_VVD_CD,9,2) NEW_DTRB_COA_VVD_CD" ).append("\n"); 
		query.append("FROM AP_INV_HDR  A" ).append("\n"); 
		query.append(", AP_INV_DTRB D" ).append("\n"); 
		query.append("WHERE  A.CSR_NO              = @[csr_no]" ).append("\n"); 
		query.append("AND  A.CSR_NO              = D.CSR_NO" ).append("\n"); 
		query.append("AND  NVL(A.IF_FLG,'N')     <>'E'" ).append("\n"); 
		query.append("AND  NVL(A.RCV_ERR_FLG,'N')<>'E'" ).append("\n"); 
		query.append("AND  A.GL_DT IS NOT NULL" ).append("\n"); 
		query.append("AND  D.DTRB_COA_VVD_CD LIKE 'CNTC'||'%'" ).append("\n"); 
		query.append("AND  SUBSTR(D.DTRB_COA_VVD_CD,5,4) <> SUBSTR(@[new_gl_dt],3,4)" ).append("\n"); 
		query.append("AND  ROWNUM = 1" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("WHERE CSR_NO = @[csr_no]" ).append("\n"); 
		query.append("AND DTRB_COA_VVD_CD LIKE 'CNTC'||'%'" ).append("\n"); 

	}
}