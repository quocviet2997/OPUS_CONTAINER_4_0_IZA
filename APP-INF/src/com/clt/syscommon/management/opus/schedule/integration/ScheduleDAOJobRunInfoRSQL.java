/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : ScheduleDAOJobRunInfoRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2011.01.06
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2011.01.06 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.schedule.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author kyungbum kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ScheduleDAOJobRunInfoRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * autosys job run information query
	  * </pre>
	  */
	public ScheduleDAOJobRunInfoRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("job_name",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.schedule.integration").append("\n"); 
		query.append("FileName : ScheduleDAOJobRunInfoRSQL").append("\n"); 
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
		query.append("select status, " ).append("\n"); 
		query.append("to_char(new_time(to_date('19700101','yyyymmdd') + (startime/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss') startime, " ).append("\n"); 
		query.append("to_char(new_time(to_date('19700101','yyyymmdd') + (endtime/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss') endtime" ).append("\n"); 
		query.append("from (select b.status, b.startime, b.endtime" ).append("\n"); 
		query.append("from ujo_job a, ujo_job_runs b" ).append("\n"); 
		query.append("where a.joid = b.joid" ).append("\n"); 
		query.append("and b.run_num > substr(@[id],instr(@[id],'-')+1)" ).append("\n"); 
		query.append("and a.job_name = @[job_name]" ).append("\n"); 
		query.append("and b.status is not null" ).append("\n"); 
		query.append("order by b.run_num)" ).append("\n"); 
		query.append("where rownum = 1" ).append("\n"); 
		query.append("union all" ).append("\n"); 
		query.append("select b.status," ).append("\n"); 
		query.append("to_char(new_time(to_date('19700101','yyyymmdd') + (b.startime/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss') startime, " ).append("\n"); 
		query.append("to_char(new_time(to_date('19700101','yyyymmdd') + (b.endtime/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss') endtime" ).append("\n"); 
		query.append("from (" ).append("\n"); 
		query.append("  select b.joid, b.run_num from" ).append("\n"); 
		query.append("  (" ).append("\n"); 
		query.append("      select " ).append("\n"); 
		query.append("       joid, EVENT_TIME_GMT" ).append("\n"); 
		query.append("      from ujo_proc_event " ).append("\n"); 
		query.append("      where job_name like @[job_name]" ).append("\n"); 
		query.append("      and event_time_gmt = substr(@[id],instr(@[id],'-')+1) " ).append("\n"); 
		query.append("      and event = 108" ).append("\n"); 
		query.append("  ) a, ujo_proc_event b " ).append("\n"); 
		query.append("  where a.joid = b.joid" ).append("\n"); 
		query.append("  and to_date(to_char(new_time(to_date('19700101','yyyymmdd') + (a.EVENT_TIME_GMT/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss'), 'yyyy-mm-dd hh24:mi:ss') < b.stamp" ).append("\n"); 
		query.append("  and a.EVENT_TIME_GMT <> b.EVENT_TIME_GMT" ).append("\n"); 
		query.append("  and b.job_name like @[job_name]" ).append("\n"); 
		query.append("  and b.event = 108" ).append("\n"); 
		query.append("  order by b.run_num  " ).append("\n"); 
		query.append(")a, ujo_job_runs b" ).append("\n"); 
		query.append("where a.joid = b.joid" ).append("\n"); 
		query.append("and a.run_num = b.run_num" ).append("\n"); 

	}
}