/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : scheduleDBDAO.java
 *@FileTitle : schedule
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2008.12.23
 *@LastModifier : 정인선
 *@LastVersion : 1.0
 * 2008.12.23 정인선
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.schedule.integration;

import java.sql.SQLException;
import java.util.HashMap;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.ISQLTemplate;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.DBDAOSupport;
import com.clt.syscommon.management.opus.schedule.event.ScheduleLogEvent;

/**
 * NIS2010-schedule Business Logic Basic Command implementation<br>
 * - NIS2010-schedule에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author In Sun Jung
 * @see scheduleBCImpl 참조
 * @since J2EE 1.4
 */
public class ScheduleDBDAO extends DBDAOSupport {

	/**
	 * getDirectExecuteJobID<br>
	 * 
	 * @param String jobName
	 * @return String
	 * @Exception DAOException
	 */
	public String getDirectExecuteJobID(String jobName) throws DAOException {
		String runNum = null;
		DBRowSet rs = null;

		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("job_name", jobName);

		try {
			rs = new SQLExecuter("AutoSys").executeQuery((ISQLTemplate) new ScheduleDAODirectRunNumRSQL(), param, null);
			if ( rs.next() ) runNum = rs.getString("run_num");
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

		return runNum;
	}

	/**
	 * getReserveExecuteJobID<br>
	 * 
	 * @param String jobName
	 * @return String
	 * @Exception DAOException
	 */
	public String getReserveExecuteJobID(String jobName) throws DAOException {
		String eventTimeGmt = null;
		String joid = null;
		DBRowSet rs = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("job_name", jobName);

		try {
			while ( true ) {
				rs = new SQLExecuter("AutoSys").executeQuery((ISQLTemplate) new ScheduleDAOReserveEOIDRSQL(), param, null);
				if (rs.next()) {
					joid = rs.getString("joid");
					eventTimeGmt = rs.getString("event_time_gmt");
					break;
				}
				else Thread.sleep(2000);
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

		return joid+"-"+eventTimeGmt;
	}

	/**
	 * schedule log 의 데이타 모델에 해당되는 값을 불러온다.<br>
	 * 
	 * @param ScheduleLogEvent event
	 * @return DBRowSet
	 * @exception DAOException
	 * @exception Exception
	 */
	public DBRowSet searchscheduleLogList(ScheduleLogEvent event) throws DAOException, Exception {
		DBRowSet dbRowset = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("skd_id", event.getSkd_id());
		param.put("skd_tp_cd", event.getSkd_tp_cd());
		param.put("pgm_no", event.getPgm_no());
		param.put("jb_sts_cd", event.getSts_cd());
		param.put("from_dt", event.getFrom_dt());
		param.put("to_dt", event.getTo_dt());
		param.put("machine", event.getMachine());

		try {
			HashMap<String, Object> velParam = new HashMap<String, Object>();
			velParam.put("skd_id", event.getSkd_id());
			velParam.put("skd_tp_cd", event.getSkd_tp_cd());
			velParam.put("pgm_no", event.getPgm_no());
			velParam.put("jb_sts_cd", event.getSts_cd());
			velParam.put("from_dt", event.getFrom_dt());
			velParam.put("to_dt", event.getTo_dt());
			velParam.put("machine", event.getMachine());

			dbRowset = new SQLExecuter("AutoSys").executeQuery((ISQLTemplate) new ScheduleLogDAOComScheduleLogRSQL(), param, velParam);
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

		return dbRowset;    
	} 

	/**
	 * getJobStatus<br>
	 * 
	 * @param String jobName
	 * @return String
	 * @Exception DAOException
	 */
	public int getJobStatus(String jobName) throws DAOException {
		int status = 0;
		DBRowSet rs = null;
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("job_name", jobName);

		try {
			rs = new SQLExecuter("AutoSys").executeQuery((ISQLTemplate) new ScheduleDAOJobStatusRSQL(), param, null);
			if (rs.next()) status = rs.getInt("status");
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}

		return status;
	}
	
	/**
	 * getJobRunsInfo<br>
	 * 
	 * @param String id
	 * @param String jobName
	 * @return HashMap<String,String>
	 * @Exception DAOException
	 */
	public HashMap<String,String> getJobRunsInfo(String id, String jobName) throws DAOException {
		DBRowSet dbRowset = null;

		HashMap<String, String> param = new HashMap<String, String>();
		param.put("id", id);
		param.put("job_name", jobName);

		try {
			dbRowset = new SQLExecuter("AutoSys").executeQuery((ISQLTemplate) new ScheduleDAOJobRunInfoRSQL(), param, null);
			if(dbRowset.next()){
				String endtime = dbRowset.getString("endtime");
				param.put("status", dbRowset.getString("status"));
				param.put("startime", dbRowset.getString("startime"));
				param.put("endtime", (endtime.startsWith("1970")?"":endtime));
			} else {
				param.put("status", "0");
				param.put("startime", null);
				param.put("endtime", null);
					
			}
		} catch (SQLException se) {
			log.error(se.getMessage(), se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
		
		return param;
	}

}
