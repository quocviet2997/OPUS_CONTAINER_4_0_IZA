/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MailDBDAOComEmlSndInfoVORSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.06
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2010.01.06 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.mail.mail.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MailDBDAOComEmlSndInfoVORSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  *    
	  * </pre>
	  */
	public MailDBDAOComEmlSndInfoVORSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.sample.mail.mail.integration").append("\n"); 
		query.append("FileName : MailDBDAOComEmlSndInfoVORSQL").append("\n"); 
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
		query.append("SELECT" ).append("\n"); 
		query.append("EML_SND_NO" ).append("\n"); 
		query.append(",	RD_SUB_SYS_CD" ).append("\n"); 
		query.append(",	BAT_FLG" ).append("\n"); 
		query.append(",	EML_TIT_NM" ).append("\n"); 
		query.append(",	EML_PROC_STS_CD" ).append("\n"); 
		query.append(",	SNDR_NM" ).append("\n"); 
		query.append(",	SNDR_EML" ).append("\n"); 
		query.append(",	TO_EML_CTNT" ).append("\n"); 
		query.append(",	SMTP_IP" ).append("\n"); 
		query.append(",	EML_DT" ).append("\n"); 
		query.append(",	EML_ERR_MSG" ).append("\n"); 
		query.append(",	DELT_FLG" ).append("\n"); 
		query.append(",	THD_ID" ).append("\n"); 
		query.append(",	CC_EML_CTNT" ).append("\n"); 
		query.append(",	BCC_EML_CTNT" ).append("\n"); 
		query.append(",	RPT_MRG_FLG" ).append("\n"); 
		query.append(",	RPT_MRG_FILE_NM" ).append("\n"); 
		query.append(",	RPT_SPLIT_CAPA" ).append("\n"); 
		query.append(",	RPT_SPLIT_QTY" ).append("\n"); 
		query.append(",	EML_SPLIT_CAPA" ).append("\n"); 
		query.append(",	CRE_USR_ID" ).append("\n"); 
		query.append(",	CRE_DT" ).append("\n"); 
		query.append(",	UPD_USR_ID" ).append("\n"); 
		query.append(",	UPD_DT" ).append("\n"); 
		query.append("FROM COM_EML_SND_INFO" ).append("\n"); 
		query.append("where rownum < 10" ).append("\n"); 

	}
}