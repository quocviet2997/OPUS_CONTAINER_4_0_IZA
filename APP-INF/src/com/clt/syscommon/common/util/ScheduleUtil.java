/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : ScheduleUtil.java
 *@FileTitle : ScheduleUtil
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2009.06.30
 *@LastModifier : 김경범
 *@LastVersion : 1.0
 * 2009.06.30 김경범
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.text.ParseException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.log4j.Logger;

import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.common.util.schedule.AbstractScheduler;

/**
 * ScheduleUtil AutoSys 연동
 * 
 * @author desis
 * @see ScheduleDAO
 * @since J2EE 1.4
 */
public class ScheduleUtil {

	private Logger log = Logger.getLogger(this.getClass());
	//String prefix = "T_";
	
	private AbstractScheduler scheduler;
	//private String directBatchJobExecuteShell = SiteConfigFactory.getWhenNullThrowException("COM.DIRECT.BATCH.EXECUTE.SHELL");
	
	/**
	 * 생성자
	 * @throws Exception 
	 */
	public ScheduleUtil() {		
		instantiateScheduler();
	}
	
	private void instantiateScheduler() {
		try {
			String schedulerClass = SiteConfigFactory.getWhenNullThrowException("COM.BATCH.SCHEDULER.CLASSNAME");
			
			Class<?> clazz = Class.forName(schedulerClass);
			Constructor<?> constructor = clazz.getConstructor();
			
			scheduler = (AbstractScheduler) constructor.newInstance();
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new IllegalArgumentException(e);
		}
	}
	
	
	public AbstractScheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(AbstractScheduler scheduler) {
		this.scheduler = scheduler;
	}

	/**
	 * 업무시스템에서 직접 작업을 실행하기 위한 메소드
	 * 
	 * @param pgmNo 프로그램 번호
	 * @return String Autosys Run Number
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws DAOException 
	 */
	public String directExecuteJob(String pgmNo) throws IOException, InterruptedException, DAOException {
		return scheduler.directExecuteJob(pgmNo);
	}

	/**
	 * 업무시스템에서 직접 작업을 파라미터와 함께 실행하기 위한 메소드
	 * 
	 * @param pgmNo 프로그램 번호
	 * @param parameter 작업에 전달될 값
	 * @return String Autosys Run Number
	 * @throws IOException 
	 * @throws InterruptedException 
	 * @throws DAOException 
	 */
	public String directExecuteJob(String pgmNo, String parameter) throws IOException, InterruptedException, DAOException {
		log.debug(pgmNo);
		log.debug(parameter);
		log.debug(scheduler.getClass().getName());
		return scheduler.directExecuteJob(pgmNo, parameter);
	}

	/**
	 * 업무시스템에서 직접 작업을 스케쥴러에 예약하기 위한 메소드
	 * 
	 * @param pgmNo 프로그램 번호
	 * @param reserveTime 작업 예약 시간 yyyymmddhh24mi
	 * @return String Autosys Event ID
	 * @throws ParseException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws DAOException 
	 */
	public String reserveExecuteJob(String pgmNo, String reserveTime) throws ParseException, IOException, InterruptedException, DAOException {
		return scheduler.reserveExecuteJob(pgmNo, reserveTime);
	}

	/**
	 * 업무시스템에서 직접 작업을 스케쥴러에 예약하기 위한 메소드
	 * 
	 * @param pgmNo 프로그램 번호
	 * @param reserveTime 작업 예약 시간 yyyymmddhh24mi
	 * @param parameter 작업에 전달될 값
	 * @return String Autosys Event ID
	 * @throws ParseException 
	 * @throws InterruptedException 
	 * @throws IOException 
	 * @throws DAOException 
	 */
	public String reserveExecuteJob(String pgmNo, String reserveTime, String parameter) throws ParseException, IOException, InterruptedException, DAOException {
		return scheduler.reserveExecuteJob(pgmNo, reserveTime, parameter);
	}

	/**
	 * 업무시스템에서 등록한 작업을 스케쥴링 상태를 조회하기 위한 메소드
	 * status 0 <NULL> 알수없음 
	 * status 1 RUNNING 수행중 
	 * status 3 STARTING 시작(시스템) 
	 * status 4 SUCCESS 성공 
	 * status 5 FAILURE 실패 
	 * status 6 TERMINATED 강제종료 
	 * status 7 ON_ICE 논리삭제 
	 * status 8 INACTIVE 실행대기
	 * status 9 ACTIVATED 활성화(시스템) 
	 * status 10 RESTART 시작시에러 
	 * status 11 ON_HOLD 일시정지 
	 * status 12 QUE_WAIT 로드밸런싱 대기
	 * 
	 * @param id
	 * @param pgmNo
	 * @return status
	 * @throws NumberFormatException 
	 * @throws DAOException 
	 */
	public int getJobStatus(String id, String pgmNo) throws NumberFormatException, DAOException {
		return scheduler.getJobStatus(id, pgmNo);
	}
	
	/**
	 * 업무시스템에서 등록한 작업을 스케쥴링 상태를 조회하기 위한 메소드
	 * - Biz Transaction 과 분리하여 처리되도록 별도 Thread 로 분기 처리함 (동일 Transaction 으로 처리 시, XA 에러 방지 목적)
	 * 
	 * @param id
	 * @param pgmNo
	 * @return status
	 * @throws NumberFormatException 
	 * @throws DAOException 
	 */
	public int getJobStatusInIsolatedTrx(final String id, final String pgmNo) throws Exception {
		int iRtn = 0;
		
		try {
			ExecutorService es = Executors.newSingleThreadExecutor();
		    Future<Integer> result = es.submit(new Callable<Integer>() {
		        public Integer call() throws Exception {
		            return scheduler.getJobStatus(id, pgmNo);
		        }
		    });
		    es.shutdown();
		    iRtn = result.get();
		} catch(Exception e) {
			log.error("[ScheduleUtil.getJobStatusInIsolatedTrx] Error : " + e.getMessage());
			throw e;
		}
		return iRtn;
	}

	/**
	 * 작업의 시작 시간을 확인하는 함수
	 * 
	 * @param id
	 * @param pgmNo
	 * @return String yyyy-mm-dd hh24:mi:ss 포맷의 문자열
	 * @throws DAOException 
	 */
	public String getJobStartTime(String id, String pgmNo) throws DAOException {
		return scheduler.getJobStartTime(id, pgmNo);
	}

	/**
	 * 작업의 종료 시간을 확인하는 함수
	 * 
	 * @param id
	 * @param pgmNo
	 * @return String yyyy-mm-dd hh24:mi:ss 포맷의 문자열
	 * @throws DAOException 
	 */
	public String getJobEndTime(String id, String pgmNo) throws DAOException {
		return scheduler.getJobEndTime(id, pgmNo);
	}

	/**
	 * 작업을 취소하는 함수
	 * 
	 * @param pgmNo 프로그램 번호
	 * @return boolean true:성공 false:실패
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public boolean cancelJob(String pgmNo) throws IOException, InterruptedException {
		return scheduler.cancelJob(pgmNo);
	}

	/**
	 * 특정 모듈에서 프로그램 번호로 현재 스케쥴러에서 구동되고 있는지 확인하는 함수
	 * 
	 * @param pgmNo 프로그램 번호
	 * @return boolean true:동작중 false:없음
	 * @throws DAOException 
	 */
	public boolean isRunning(String pgmNo) throws DAOException {
		return scheduler.isRunning(pgmNo);
	}
	
	/**
	 * 특정 모듈에서 프로그램 번호로 현재 스케쥴러에서 구동되고 있는지 확인하는 함수
	 * - Biz Transaction 과 분리하여 처리되도록 별도 Thread 로 분기 처리함 (동일 Transaction 으로 처리 시, XA 에러 방지 목적)
	 * 
	 * @param pgmNo 프로그램 번호
	 * @return boolean true:동작중  false:없음
	 * @throws DAOException 
	 */
	public boolean isRunningInIsolatedTrx(final String pgmNo) throws Exception {
		boolean bRtn = false;
		
		try {
			ExecutorService es = Executors.newSingleThreadExecutor();
		    Future<Boolean> result = es.submit(new Callable<Boolean>() {
		        public Boolean call() throws Exception {
		            return scheduler.isRunning(pgmNo);
		        }
		    });
		    es.shutdown();
		    bRtn = result.get();
		    
		    // Create a file object
		    File file = new File(SiteConfigFactory.getWhenNullThrowException("COM.FILE.UPLOAD.BATCH") + pgmNo);
		    // Check if the file exists or not 
		    boolean isExists = file.exists(); 
		    // Check running with two conditions
		    bRtn = bRtn || isExists;

		} catch(Exception e) {
			log.error("[ScheduleUtil.isRunningInIsolatedTrx] Error : " + e.getMessage());
			throw e;
		}
		return bRtn;
	}
}