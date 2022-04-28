/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BackEndJobSampleDAOMdmVandorRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.03
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.07.03 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.backendjob.workonremotelongtxserver.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Jeong-Hoon, Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class BackEndJobSampleDAOMdmVandorRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * MDM VANDOR  테이블의 값을 가져온다.
	  * </pre>
	  */
	public BackEndJobSampleDAOMdmVandorRSQL(){
		setQuery();
		
		params = new HashMap<String,String[]>();
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
		query.append("select" ).append("\n"); 
		query.append("*" ).append("\n"); 
		query.append("from mdm_vendor" ).append("\n"); 

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.sample.backendjob.integration").append("\n"); 
		query.append("FileName : BackEndJobSampleDAOMdmVandorRSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
}