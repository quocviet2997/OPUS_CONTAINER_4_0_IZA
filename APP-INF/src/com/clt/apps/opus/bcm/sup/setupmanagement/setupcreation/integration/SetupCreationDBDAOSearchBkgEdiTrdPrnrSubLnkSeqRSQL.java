/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkSeqRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.04
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.04 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkSeqRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * 2011.03.07 정윤태 EDI TRADE PARTNER SUB LINK SEQUENCE(MAX+1) 정보를 가져온다.
	  * </pre>
	  */
	public SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkSeqRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.integration ").append("\n"); 
		query.append("FileName : SetupCreationDBDAOSearchBkgEdiTrdPrnrSubLnkSeqRSQL").append("\n"); 
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
		query.append("SELECT NVL(MAX(TRD_PRNR_SUB_LNK_SEQ),0) + 1 TRD_PRNR_SUB_LNK_SEQ" ).append("\n"); 
		query.append("  FROM BKG_EDI_TRD_PRNR_SUB_LNK" ).append("\n"); 

	}
}