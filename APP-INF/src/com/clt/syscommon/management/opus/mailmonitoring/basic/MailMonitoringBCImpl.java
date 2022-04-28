/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringBCImpl.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.integration.MailMonitoringDBDAO;

/**
 * MailMonitoringBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 16.
 */
public class MailMonitoringBCImpl extends BasicCommandSupport implements MailMonitoringBC{

	/**
	 * 
	 * searchSendMailData
	 * @author Jeong-Hoon, KIM
	 * @param comEmlSndInfoVO
	 * @return
	 * @throws EventException List<ComEmlSndInfoVO>
	 */
	public List<ComEmlSndInfoVO> searchSendMailData(ComEmlSndInfoVO comEmlSndInfoVO) throws EventException {
		try{
			MailMonitoringDBDAO mailMonitoringDBDAO = new MailMonitoringDBDAO();		
			List<ComEmlSndInfoVO> comEmlSndInfoVOs = mailMonitoringDBDAO.searchSendMailData(comEmlSndInfoVO);
			comEmlSndInfoVOs = mappingStatus(comEmlSndInfoVOs);
			return comEmlSndInfoVOs;
		} catch (Exception e) {
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Data"}).getMessage(), e);
		}
	}

	/**
	 * 
	 * mappingStatus
	 * @author Jeong-Hoon, KIM
	 * @param comEmlSndInfoVOs
	 * @return List<ComEmlSndInfoVO>
	 */
	private List<ComEmlSndInfoVO> mappingStatus(List<ComEmlSndInfoVO> comEmlSndInfoVOs) {
		for(ComEmlSndInfoVO comEmlSndInfoVO : comEmlSndInfoVOs){
			String emlProcStsCd = comEmlSndInfoVO.getEmlProcStsCd();
			if("3".equals(emlProcStsCd)){
				comEmlSndInfoVO.setEmlProcStsCd("Success");
			}else if("4".equals(emlProcStsCd)){
				comEmlSndInfoVO.setEmlProcStsCd("Failure");
			}else{
				comEmlSndInfoVO.setEmlProcStsCd("Sending");
			}
		}
		return comEmlSndInfoVOs;
	}

}

