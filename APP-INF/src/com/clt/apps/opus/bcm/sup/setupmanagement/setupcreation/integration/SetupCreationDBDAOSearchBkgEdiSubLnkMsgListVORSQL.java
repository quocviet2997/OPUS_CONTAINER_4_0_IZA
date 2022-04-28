/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : SetupCreationDBDAOSearchBkgEdiSubLnkMsgListVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2015.10.14
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2015.10.14 김성욱
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

public class SetupCreationDBDAOSearchBkgEdiSubLnkMsgListVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.03.07 정윤태 BKG EDI SUB LNK MSG 정보를 조회한다
	  * </pre>
	  */
	public SetupCreationDBDAOSearchBkgEdiSubLnkMsgListVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("trd_prnr_sub_lnk_seq",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchBkgEdiSubLnkMsgListVORSQL").append("\n"); 
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
		query.append("SELECT  TRD_PRNR_SUB_LNK_SEQ" ).append("\n"); 
		query.append("       ,EDI_MSG_TP_ID" ).append("\n"); 
		query.append("       ,EDI_MSG_IND_CD1" ).append("\n"); 
		query.append("       ,EDI_MSG_IND_CD2" ).append("\n"); 
		query.append("       ,EDI_MSG_IND_CD3" ).append("\n"); 
		query.append("       ,EDI_MSG_IND_CD4" ).append("\n"); 
		query.append("       ,EDI_MSG_IND_CD5" ).append("\n"); 
		query.append("       ,EDI_MSG_IND_CD" ).append("\n"); 
		query.append("       ,MSG_TP_DESC" ).append("\n"); 
		query.append("       ,'' AS CRE_USR_ID" ).append("\n"); 
		query.append("	   ,'' AS UPD_USR_ID" ).append("\n"); 
		query.append("  FROM (" ).append("\n"); 
		query.append("        SELECT  TRD_PRNR_SUB_LNK_SEQ" ).append("\n"); 
		query.append("               ,EDI_MSG_TP_ID" ).append("\n"); 
		query.append("               ,DECODE(EDI_MSG_IND_CD,'51',MSG_TP_DESC,NULL) EDI_MSG_IND_CD1" ).append("\n"); 
		query.append("               ,DECODE(EDI_MSG_IND_CD,'53',MSG_TP_DESC,NULL) EDI_MSG_IND_CD2" ).append("\n"); 
		query.append("               --,DECODE(EDI_MSG_IND_CD,'4',MSG_TP_DESC,NULL)  EDI_MSG_IND_CD3" ).append("\n"); 
		query.append("               ,DECODE(EDI_MSG_TP_ID,'TDC315', MSG_TP_DESC, NULL)  EDI_MSG_IND_CD3" ).append("\n"); 
		query.append("               --,CASE WHEN EDI_MSG_IND_CD != '4' AND MSG_TP_DESC = '1' THEN" ).append("\n"); 
		query.append("			   ,EDI_MSG_IND_CD EDI_MSG_IND_CD4" ).append("\n"); 
		query.append("               ,DECODE(EDI_MSG_IND_CD,'52',MSG_TP_DESC,NULL)  EDI_MSG_IND_CD5" ).append("\n"); 
		query.append("               ,EDI_MSG_IND_CD" ).append("\n"); 
		query.append("               ,MSG_TP_DESC" ).append("\n"); 
		query.append("               ,DECODE(EDI_MSG_IND_CD,'51',1,'53',2,'4',3,4) SORT_KEY" ).append("\n"); 
		query.append("          FROM BKG_EDI_SUB_LNK_MSG" ).append("\n"); 
		query.append("         WHERE TRD_PRNR_SUB_LNK_SEQ = @[trd_prnr_sub_lnk_seq]" ).append("\n"); 
		query.append("       )" ).append("\n"); 

	}
}