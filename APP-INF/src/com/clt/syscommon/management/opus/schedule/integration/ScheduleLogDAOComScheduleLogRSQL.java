/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : ScheduleLogDAOComScheduleLogRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2010.10.18
*@LastModifier : 김국희
*@LastVersion : 1.0
* 2010.10.18 김국희
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.schedule.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Kukhee Kim
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class ScheduleLogDAOComScheduleLogRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * schedule log
	  * </pre>
	  */
	public ScheduleLogDAOComScheduleLogRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("skd_id",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("to_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("skd_tp_cd",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("from_dt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("pgm_no",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("jb_sts_cd",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.syscommon.management.opus.schedule.integration").append("\n"); 
		query.append("FileName : ScheduleLogDAOComScheduleLogRSQL").append("\n"); 
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
		query.append("select" ).append("\n"); 
		query.append("a.run_num log_id," ).append("\n"); 
		query.append("a.joid skd_id," ).append("\n"); 
		query.append("b.description skd_tp_cd," ).append("\n"); 
		query.append("b.job_name pgm_no," ).append("\n"); 
		query.append("to_char(new_time(to_date('19700101','yyyymmdd') + (a.startime/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss') st_tm," ).append("\n"); 
		query.append("decode(a.endtime, 0, '', to_char(new_time(to_date('19700101','yyyymmdd') + (a.endtime/60/60/24), 'YST', 'GMT'), 'yyyy-mm-dd hh24:mi:ss')) end_tm," ).append("\n"); 
		query.append("decode(a.endtime, 0, 'pid:'||(select pid from ujo_proc_event where run_num=a.run_num and joid = a.joid and status=1 and pid>0), " ).append("\n"); 
		query.append("floor(a.runtime/3600)||':'||to_char(to_date(mod(a.runtime,3600),'sssss'),'mi:ss')) elapsed_time," ).append("\n"); 
		query.append("a.status sts_cd," ).append("\n"); 
		query.append("'out' out," ).append("\n"); 
		query.append("'err' err," ).append("\n"); 
		query.append("a.std_out_file," ).append("\n"); 
		query.append("a.std_err_file," ).append("\n"); 
		query.append("a.machine" ).append("\n"); 
		query.append("from ujo_job_runs a, ujo_job b" ).append("\n"); 
		query.append("where a.joid = b.joid" ).append("\n"); 
		query.append("#if (${machine}=='T') " ).append("\n"); 
		query.append("and a.machine = 'ktx6600b'" ).append("\n"); 
		query.append("#else" ).append("\n"); 
		query.append("and a.machine in ('kox6600b','kox6600c','kox6600d','kox6600e')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("and a.status is not null" ).append("\n"); 
		query.append("#if (${skd_id}!='') " ).append("\n"); 
		query.append("and a.joid = @[skd_id]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${jb_sts_cd}!='')" ).append("\n"); 
		query.append("and a.status = @[jb_sts_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${pgm_no}!='')" ).append("\n"); 
		query.append("and b.job_name like '%'||@[pgm_no] || '%'" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${skd_tp_cd}!='')" ).append("\n"); 
		query.append("and b.description = @[skd_tp_cd]" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("#if (${to_dt}!='')" ).append("\n"); 
		query.append("and new_time(to_date('1970010100','yyyymmddhh24') + (a.startime/60/60/24), 'YST', 'GMT') between to_date(@[from_dt]||'00', 'yyyy-mm-ddhh24mi') and to_date(@[to_dt]||'59', 'yyyy-mm-ddhh24mi')" ).append("\n"); 
		query.append("#end" ).append("\n"); 
		query.append("order by st_tm desc" ).append("\n"); 

	}
}