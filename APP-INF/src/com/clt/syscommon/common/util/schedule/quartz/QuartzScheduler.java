/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : TIS
*@FileName       : DirectScheduler.java
*@FileTitle      	 : 
*@Author           : Kwang-Yong, KUK
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 1. 7.
*@LastModifier   : Kwang-Yong, KUK
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.util.schedule.quartz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.syscommon.common.util.schedule.AbstractScheduler;

/**
 * 
 * QuartzScheduler.java
 * @author Kwang-Yong, KUK
 * @see 
 * @since J2SE 1.6
 * 2016. 1. 7.
 */
public class QuartzScheduler extends AbstractScheduler{

	private final Logger log = Logger.getLogger(this.getClass());

	private String scriptPath = SiteConfigFactory
			.getWhenNullThrowException("COM.BATCH.QUARTZ.EXECUTE.SHELL");

	/**
	 * 
	 * directExecuteJob
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	public String directExecuteJob(String pgmNo) throws InterruptedException,
			IOException {
		return directExecuteJob(pgmNo, null);
	}

	/**
	 * 
	 * directExecuteJob
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @param parameter
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	public String directExecuteJob(String pgmNo, String parameter)
			throws InterruptedException, IOException {

		List<String> command = generateCommand(pgmNo, parameter);
		String msg = executeShellCommand(command);
		
		log.debug(msg);

		return "Call Success";
	}

	/**
	 * 
	 * reserveExecuteJob
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @param reserveTime
	 * @return String
	 */
	public String reserveExecuteJob(String pgmNo, String reserveTime) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * reserveExecuteJob
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @param reserveTime
	 * @param parameter
	 * @return String
	 */
	public String reserveExecuteJob(String pgmNo, String reserveTime,
			String parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * cancelJob
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @return boolean
	 */
	public boolean cancelJob(String pgmNo) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * isRunning
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @return boolean
	 */
	public boolean isRunning(String pgmNo) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * getJobStatus
	 * @author Kwang-Yong, KUK
	 * @param id
	 * @param pgmNo
	 * @return int
	 */
	public int getJobStatus(String id, String pgmNo) {
		// TODO Auto-generated method stub
		return 4;
	}

	/**
	 * 
	 * getJobStartTime
	 * @author Kwang-Yong, KUK
	 * @param id
	 * @param pgmNo
	 * @return String
	 */
	public String getJobStartTime(String id, String pgmNo) {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * 
	 * getJobEndTime
	 * @author Kwang-Yong, KUK
	 * @param id
	 * @param pgmNo
	 * @return String
	 */
	public String getJobEndTime(String id, String pgmNo) {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * 
	 * generateCommand
	 * @author Kwang-Yong, KUK
	 * @param pgmNo
	 * @param parameter
	 * @return List<String>
	 */
	private List<String> generateCommand(String pgmNo, String parameter) {
		List<String> command = new ArrayList<String>();

		String fullScriptPath = scriptPath;

		command.add(fullScriptPath);
		command.add(pgmNo);

		if (parameter != null) {
			command.add(parameter);
		}

		return command;
	}

}
