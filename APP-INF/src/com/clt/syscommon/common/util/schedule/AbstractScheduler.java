/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : TIS
*@FileName       : DirectScheduler.java
*@FileTitle      	 : 
*@Author           : Kyung-bum, Kim
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 1. 7.
*@LastModifier   : Kyung-bum, Kim
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.util.schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.List;

import org.apache.log4j.Logger;

import com.clt.framework.core.layer.integration.DAOException;

/**
 * 
 * AbstractScheduler.java
 * @author Kyung-bum, Kim
 * @see 
 * @since J2SE 1.6
 * 2016. 1. 7.
 */
public abstract class AbstractScheduler {

	private Logger log = Logger.getLogger(this.getClass());

	/**
	 * 
	 * directExecuteJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	public abstract String directExecuteJob(String pgmNo)
			throws InterruptedException, IOException;
	
	/**
	 * 
	 * directExecuteJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @param parameter
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	public abstract String directExecuteJob(String pgmNo, String parameter)
			throws InterruptedException, IOException;

	/**
	 * 
	 * reserveExecuteJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @param reserveTime
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException String
	 */
	public abstract String reserveExecuteJob(String pgmNo, String reserveTime)
			throws InterruptedException, IOException, ParseException;
	/**
	 * 
	 * reserveExecuteJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @param reserveTime
	 * @param parameter
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws ParseException String
	 */
	public abstract String reserveExecuteJob(String pgmNo, String reserveTime,
			String parameter) throws InterruptedException, IOException,
			ParseException;
	/**
	 * 
	 * cancelJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @return
	 * @throws InterruptedException
	 * @throws IOException boolean
	 */
	public abstract boolean cancelJob(String pgmNo)
			throws InterruptedException, IOException;

	/**
	 * 
	 * isRunning
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @return
	 * @throws DAOException boolean
	 */
	public abstract boolean isRunning(String pgmNo) throws DAOException;

	/**
	 * 
	 * getJobStatus
	 * @author Kyung-bum, Kim
	 * @param id
	 * @param pgmNo
	 * @return int
	 */
	public abstract int getJobStatus(String id, String pgmNo);

	/**
	 * 
	 * getJobStartTime
	 * @author Kyung-bum, Kim
	 * @param id
	 * @param pgmNo
	 * @return String
	 */
	public abstract String getJobStartTime(String id, String pgmNo);

	/**
	 * 
	 * getJobEndTime
	 * @author Kyung-bum, Kim
	 * @param id
	 * @param pgmNo
	 * @return String
	 */
	public abstract String getJobEndTime(String id, String pgmNo);

	/**
	 * 
	 * executeShellCommand
	 * @author Kyung-bum, Kim
	 * @param command
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	protected String executeShellCommand(List<String> command)
			throws InterruptedException, IOException {
		ProcessBuilder processBuilder = new ProcessBuilder(command);
		Process process = processBuilder.start();
		InputStream inputStream = process.getInputStream();
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(inputStream));

		try {
			process.waitFor();
			StringBuilder stringBuilder = new StringBuilder();

			if (bufferedReader.ready()) {
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					stringBuilder.append(line);
				}
			}
			return stringBuilder.toString();
		} catch (InterruptedException e) {
			log.error(e.getMessage());
			throw e;
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}

			if (inputStream != null) {
				inputStream.close();
			}
		}
	}

}
