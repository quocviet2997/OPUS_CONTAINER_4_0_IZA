/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : TIS
*@FileName       : ThemeHTMLAction.java
*@FileTitle      	 : 
*@Author           : Kyung-bum, Kim
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 1. 7.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.util.schedule.autosys;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.common.util.schedule.AbstractScheduler;
import com.clt.syscommon.common.util.schedule.autosys.integration.AutosysScheduleDBDAOSQL;
import com.clt.utilitybox.utility.CheckUtilities;
/**
 * 
 * AutosysScheduler.java
 * @author Kyung-bum, Kim
 * @see 
 * @since J2SE 1.6
 * 2016. 1. 7.
 */
public class AutosysScheduler extends AbstractScheduler {

	private final Logger log = Logger.getLogger(this.getClass());

	private String prefix = SiteConfigFactory
			.getWhenNullThrowException("COM.BATCH.AUTOSYS.PREFIX");
	private String scriptPath = SiteConfigFactory
			.getWhenNullThrowException("COM.BATCH.AUTOSYS.SCRIPT.PATH");

	/**
	 * 
	 * directExecuteJob
	 * @author Jeong-Hoon, KIM
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
	 * @author Jeong-Hoon, KIM
	 * @param pgmNo
	 * @param parameter
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	public String directExecuteJob(String pgmNo, String parameter)
			throws InterruptedException, IOException {
		String msg;
		String saltedPgmNo = prefix + pgmNo;

		log.debug("param------->"+pgmNo+"|"+parameter);
		if (!CheckUtilities.isNullAndNullString(parameter)) {
			List<String> setParamCommand = generateCommand("setparam.sh",
					saltedPgmNo, parameter);
			log.debug("setParamCommand------->"+setParamCommand);
			msg = executeShellCommand(setParamCommand);
			log.debug(msg);
		}

		List<String> startJobCommand = generateCommand("startjob.sh",
				saltedPgmNo);
		msg = executeShellCommand(startJobCommand);
		log.debug(msg);

		return "Call Success";
	}

	/**
	 * 
	 * reserveExecuteJob
	 * @author Jeong-Hoon, KIM
	 * @param pgmNo
	 * @param reserveTime
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException String
	 */
	public String reserveExecuteJob(String pgmNo, String reserveTime)
			throws InterruptedException, IOException, ParseException {
		return reserveExecuteJob(pgmNo, reserveTime, null);
	}

	/**
	 * 
	 * reserveExecuteJob
	 * @author Jeong-Hoon, KIM
	 * @param pgmNo
	 * @param reserveTime
	 * @param parameter
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException String
	 */
	public String reserveExecuteJob(String pgmNo, String reserveTime,
			String parameter) throws InterruptedException, IOException,
			ParseException {
		String msg;
		String saltedPgmNo = prefix + pgmNo;

		if (parameter != null) {
			List<String> setParamCommand = generateCommand("setparam.sh",
					saltedPgmNo, parameter);
			msg = executeShellCommand(setParamCommand);
			log.debug(msg);
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		Date date = dateFormat.parse(reserveTime);

		SimpleDateFormat autosysFormat = new SimpleDateFormat(
				"MM/dd/yyyy HH:mm");
		String reserveTimeInAutosys = autosysFormat.format(date);

		List<String> reserveJobCommand = generateCommand("reservejob.sh",
				saltedPgmNo, reserveTimeInAutosys);
		msg = executeShellCommand(reserveJobCommand);
		log.debug(msg);

		return "Call Success";
	}

	/**
	 * 
	 * cancelJob
	 * @author Jeong-Hoon, KIM
	 * @param pgmNo
	 * @return
	 * @throws InterruptedException
	 * @throws IOException boolean
	 */
	public boolean cancelJob(String pgmNo) throws InterruptedException,
			IOException {
		String saltedPgmNo = prefix + pgmNo;
		List<String> cancelJobCommand = generateCommand("canceljob.sh",
				saltedPgmNo);
		String msg = executeShellCommand(cancelJobCommand);
		log.debug(msg);

		return (msg.indexOf("eoid:") > 0) ? true : false;
	}

	/**
	 * 
	 * isRunning
	 * @author Jeong-Hoon, KIM
	 * @param pgmNo
	 * @return
	 * @throws DAOException boolean
	 */
	public boolean isRunning(String pgmNo) throws DAOException {
		int status = new AutosysScheduleDBDAOSQL().getJobStatus(prefix + pgmNo);
		
		return (status == 1 || status == 3) ? true : false;
	}

	/**
	 * 
	 * getJobStatus
	 * @author Jeong-Hoon, KIM
	 * @param id
	 * @param pgmNo
	 * @return int
	 */
	public int getJobStatus(String id, String pgmNo) {
		// TODO Auto-generated method stub
		int status = 0;
		try {
			status = new AutosysScheduleDBDAOSQL().getJobStatus(prefix + pgmNo);
		} catch (DAOException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage(), e);
		}	
		return status;
	}

	/**
	 * 
	 * getJobStartTime
	 * @author Jeong-Hoon, KIM
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
	 * @author Jeong-Hoon, KIM
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
	 * @author Jeong-Hoon, KIM
	 * @param executable
	 * @param parameters
	 * @return List<String>
	 */
	private List<String> generateCommand(String executable, String... parameters) {
		List<String> command = new ArrayList<String>();

		String fullScriptPath = scriptPath;
		String fileSeparator = getFileSeparator();
		if (!scriptPath.endsWith(fileSeparator)) {
			fullScriptPath += fileSeparator;
		}
		fullScriptPath += executable;

		command.add(fullScriptPath);

		for (String parameter : parameters) {
			command.add(parameter);
		}

		return command;
	}

	/**
	 * 
	 * getFileSeparator
	 * @author Jeong-Hoon, KIM
	 * @return String
	 */
	private String getFileSeparator() {
		String fileSeparator = System.getProperty("file.separator");
		if(fileSeparator != null){
			return fileSeparator;
		} else{
			return "/";
		}
	}

}
