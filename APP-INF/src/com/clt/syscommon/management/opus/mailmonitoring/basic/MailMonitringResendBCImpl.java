/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitringResendBCImpl.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 21.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.integration.ComEmlSndDAO;
import com.clt.syscommon.management.opus.mailmonitoring.integration.MailMonitoringEAIDAO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.AtchFileVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.CtntVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.RptDsgnXptInfoVO;

/**
 * MailMonitringResendBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 21.
 */
public class MailMonitringResendBCImpl extends BasicCommandSupport implements MailMonitringResendBC {

	/**
	 * 
	 * resend
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws EventException String
	 */
	public String resend(String emlSndNo) throws EventException {
		try{
			ComEmlSndInfoVO comEmlSndInfoVO = getEmlSndInfoVO(emlSndNo);
			CtntVO ctntVO = getEmlSndCtntVO(emlSndNo);
			List<AtchFileVO> atchFileVOs = getAtchFileVOs(emlSndNo);
			List<RptDsgnXptInfoVO> rptDsgnXptInfoVOs = getRptDsgnXptInfoVO(emlSndNo);
			
			MailMonitoringEAIDAO mailMonitoringEAIDAO = new MailMonitoringEAIDAO();
			return mailMonitoringEAIDAO.sendMail(comEmlSndInfoVO, ctntVO, atchFileVOs, rptDsgnXptInfoVOs);
		}catch (Exception e) {
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Data"}).getMessage(), e);
		}
	}

	/**
	 * 
	 * getRptDsgnXptInfoVO
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException List<RptDsgnXptInfoVO>
	 */
	private List<RptDsgnXptInfoVO> getRptDsgnXptInfoVO(String emlSndNo) throws DAOException {
		ComEmlSndDAO comEmlSndDAO = new ComEmlSndDAO();
		return comEmlSndDAO.getRptDsgnXptInfoVO(emlSndNo);
	}

	/**
	 * 
	 * getAtchFileVOs
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException List<AtchFileVO>
	 */
	private List<AtchFileVO> getAtchFileVOs(String emlSndNo) throws DAOException {
		ComEmlSndDAO comEmlSndDAO = new ComEmlSndDAO();
		return comEmlSndDAO.getAtchFileVOs(emlSndNo);
	}

	/**
	 * 
	 * getEmlSndCtntVO
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException CtntVO
	 */
	private CtntVO getEmlSndCtntVO(String emlSndNo) throws DAOException {
		ComEmlSndDAO comEmlSndDAO = new ComEmlSndDAO();
		return comEmlSndDAO.getEmlSndCtntVO(emlSndNo);
	}

	/**
	 * 
	 * getEmlSndInfoVO
	 * @author Jeong-Hoon, KIM
	 * @param emlSndNo
	 * @return
	 * @throws DAOException InfoVO
	 */
	private ComEmlSndInfoVO getEmlSndInfoVO(String emlSndNo) throws DAOException {
		ComEmlSndDAO comEmlSndDAO = new ComEmlSndDAO();
		return comEmlSndDAO.getComEmlSndInfo(emlSndNo);
	}

}

