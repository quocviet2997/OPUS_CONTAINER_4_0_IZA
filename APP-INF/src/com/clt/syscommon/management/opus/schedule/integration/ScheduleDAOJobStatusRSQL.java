/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScheduleDAOJobStatusRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.30
*@LastModifier : 
*@LastVersion : 1.0
* 2009.10.30 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.schedule.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author 
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ScheduleDAOJobStatusRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * autosys job status query
	  * </pre>
	  */
	public ScheduleDAOJobStatusRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("job_name",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.schedule.integration ").append("\n"); 
		query.append("FileName : ScheduleDAOJobStatusRSQL").append("\n"); 
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
		query.append("select status" ).append("\n"); 
		query.append("from ujo_job_status a, ujo_job b" ).append("\n"); 
		query.append("where a.joid = b.joid" ).append("\n"); 
		query.append("and b.job_name=@[job_name]" ).append("\n"); 

	}
}