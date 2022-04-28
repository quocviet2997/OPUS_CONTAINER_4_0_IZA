package com.clt.syscommon.common.util.schedule.autosys.integration;

import java.util.HashMap;

import org.apache.log4j.Logger;

import com.clt.framework.support.db.ISQLTemplate;

public class AutosysScheduleDAOJobStatusRSQL implements ISQLTemplate {
	
	private final Logger log = Logger.getLogger(getClass());
	
	private StringBuffer query = new StringBuffer();
	
	private HashMap<String, String[]> params = null;

	public AutosysScheduleDAOJobStatusRSQL() {
		setQuery();
		params = new HashMap<String, String[]>();
		
		String tmp = null;
		String[] arrTmp = null;
		
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		
		if (arrTmp.length != 2) {
			throw new IllegalArgumentException();
		}
		
		params.put("job_name", new String[]{arrTmp[0], arrTmp[1]});
		
		query.append("/*").append("\n");
		query.append("Path : com.clt.syscommon.common.util.schedule.autosys.integration ").append("\n");
		query.append("FileName : AutosysScheduleDAOJobStatusRSQL").append("\n");
		query.append("*/").append("\n");
	}
	
	@Override
	public HashMap<String, String[]> getParams() {
		return params;
	}

	@Override
	public String getSQL() {
		return query.toString();
	}
	
	public void setQuery() {
		query.append("select status ").append("\n");
		query.append("from ujo_job_status ").append("\n");
		query.append("where joid = (select joid ").append("\n");
		query.append("from ujo_job ").append("\n");
		query.append("where job_name = @[job_name])").append("\n");
	}

}
