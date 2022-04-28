/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MessagesDAOMessageUSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.23 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.messages.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class MessagesDAOMessageUSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * keep flag / delete flag / recieve time 
	  * update query
	  * </pre>
	  */
	public MessagesDAOMessageUSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("usr_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("msg_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.common.messages.integration").append("\n"); 
		query.append("FileName : MessagesDAOMessageUSQL").append("\n"); 
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
		query.append("#if(${div} == 'SND')" ).append("\n"); 
		query.append("update com_msg_snd set" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${div} == 'RCV')" ).append("\n"); 
		query.append("update com_msg_rcv set" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if(${kep_flg} == 'OK')" ).append("\n"); 
		query.append("kep_flg = 'Y'," ).append("\n"); 
		query.append("#elseif(${rcv_dt} == 'OK')" ).append("\n"); 
		query.append("rcv_dt = sysdate," ).append("\n"); 
		query.append("#elseif(${delt_flg} == 'OK')" ).append("\n"); 
		query.append("delt_flg = 'Y'," ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("upd_usr_id = @[usr_id]," ).append("\n"); 
		query.append("upd_dt = sysdate" ).append("\n"); 
		query.append("where	msg_id = @[msg_id]" ).append("\n"); 
		query.append("#if(${div} == 'RCV' && ${usr_id} != '')" ).append("\n"); 
		query.append("and rcvr_usr_id = @[usr_id]" ).append("\n"); 
		query.append("#end" ).append("\n"); 

	}
}