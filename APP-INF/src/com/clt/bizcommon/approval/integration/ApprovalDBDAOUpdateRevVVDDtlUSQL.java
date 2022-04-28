/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ApprovalDBDAOUpdateRevVVDDtlUSQL.java
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

public class ApprovalDBDAOUpdateRevVVDDtlUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * VVD를 갱신합니다
	  * </pre>
	  */
	public ApprovalDBDAOUpdateRevVVDDtlUSQL(){
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
		query.append("FileName : ApprovalDBDAOUpdateRevVVDDtlUSQL").append("\n"); 
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
		query.append("UPDATE AP_PAY_INV_DTL" ).append("\n"); 
		query.append("SET SKD_VOY_NO = (" ).append("\n"); 
		query.append("SELECT SUBSTR(@[new_gl_dt],3,4) NEW_SKD_VOY_NO" ).append("\n"); 
		query.append("FROM AP_PAY_INV     H" ).append("\n"); 
		query.append(", AP_PAY_INV_DTL D" ).append("\n"); 
		query.append(", AP_INV_HDR     A" ).append("\n"); 
		query.append("WHERE H.CSR_NO         = @[csr_no]" ).append("\n"); 
		query.append("AND H.INV_RGST_NO    = D.INV_RGST_NO" ).append("\n"); 
		query.append("AND H.CSR_NO         = A.CSR_NO" ).append("\n"); 
		query.append("AND D.VSL_CD         = 'CNTC'" ).append("\n"); 
		query.append("AND NVL(H.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND NVL(D.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND NVL(A.IF_FLG,'N')<>'E'" ).append("\n"); 
		query.append("AND NVL(A.RCV_ERR_FLG,'N')<>'E'" ).append("\n"); 
		query.append("AND SKD_VOY_NO     <> SUBSTR(@[new_gl_dt],3,4)" ).append("\n"); 
		query.append("AND ROWNUM = 1" ).append("\n"); 
		query.append(")" ).append("\n"); 
		query.append("WHERE INV_RGST_NO = (" ).append("\n"); 
		query.append("SELECT D.INV_RGST_NO" ).append("\n"); 
		query.append("FROM AP_PAY_INV     H" ).append("\n"); 
		query.append(", AP_PAY_INV_DTL D" ).append("\n"); 
		query.append(", AP_INV_HDR     A" ).append("\n"); 
		query.append("WHERE H.CSR_NO         = @[csr_no]" ).append("\n"); 
		query.append("AND H.INV_RGST_NO    = D.INV_RGST_NO" ).append("\n"); 
		query.append("AND H.CSR_NO         = A.CSR_NO" ).append("\n"); 
		query.append("AND D.VSL_CD         = 'CNTC'" ).append("\n"); 
		query.append("AND NVL(H.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND NVL(D.DELT_FLG,'N') <> 'Y'" ).append("\n"); 
		query.append("AND NVL(A.IF_FLG,'N')   <>'E'" ).append("\n"); 
		query.append("AND NVL(A.RCV_ERR_FLG,'N')<>'E'" ).append("\n"); 
		query.append("AND SKD_VOY_NO     <> SUBSTR(@[new_gl_dt],3,4)" ).append("\n"); 
		query.append("AND ROWNUM = 1" ).append("\n"); 
		query.append(")" ).append("\n"); 

	}
}