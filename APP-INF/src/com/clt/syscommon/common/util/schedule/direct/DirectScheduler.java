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
package com.clt.syscommon.common.util.schedule.direct;

import java.io.IOException;
import java.text.ParseException;

import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.common.util.schedule.AbstractScheduler;

/**
 * 
 * DirectScheduler.java
 * @author Kyung-bum, Kim
 * @see 
 * @since J2SE 1.6
 * 2016. 1. 7.
 */
public class DirectScheduler extends AbstractScheduler{

	/**
	 * 
	 * directExecuteJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @return
	 * @throws InterruptedException
	 * @throws IOException String
	 */
	public String directExecuteJob(String pgmNo) throws InterruptedException,
			IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
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
	public String directExecuteJob(String pgmNo, String parameter)
			throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		return null;
	}

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
	public String reserveExecuteJob(String pgmNo, String reserveTime)
			throws InterruptedException, IOException, ParseException {
		// TODO Auto-generated method stub
		return null;
	}

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
	public String reserveExecuteJob(String pgmNo, String reserveTime,
			String parameter) throws InterruptedException, IOException,
			ParseException {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * cancelJob
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @return
	 * @throws InterruptedException
	 * @throws IOException boolean
	 */
	public boolean cancelJob(String pgmNo) throws InterruptedException,
			IOException {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * isRunning
	 * @author Kyung-bum, Kim
	 * @param pgmNo
	 * @return
	 * @throws DAOException boolean
	 */
	public boolean isRunning(String pgmNo) throws DAOException {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * getJobStatus
	 * @author Kyung-bum, Kim
	 * @param id
	 * @param pgmNo
	 * @return int
	 */
	public int getJobStatus(String id, String pgmNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 
	 * getJobStartTime
	 * @author Kyung-bum, Kim
	 * @param id
	 * @param pgmNo
	 * @return String
	 */
	public String getJobStartTime(String id, String pgmNo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * getJobEndTime
	 * @author Kyung-bum, Kim
	 * @param id
	 * @param pgmNo
	 * @return String
	 */
	public String getJobEndTime(String id, String pgmNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
