/*========================================================
*Copyright(c) 2015 CyberLogitec
*ProcessChain    : BST
*@FileName       : MqInboundMonitoringBCImpl.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2015. 3. 12.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mqinboundmonitoring.basic;

import java.sql.SQLException;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.syscommon.management.opus.mqinboundmonitoring.integration.MqInboundMonitoringDBDAO;
import com.clt.syscommon.management.opus.mqinboundmonitoring.vo.MqInboundMonitoringSearchVO;

/**
 * MqInboundMonitoringBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2015. 3. 12.
 */
public class MqInboundMonitoringBCImpl  implements MqInboundMonitoringBC{

	/**
	 * 
	 * searchMqInboundMonitoringList
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVO
	 * @return
	 * @throws EventException List<MqInboundMonitoringSearchVO>
	 */
	public List<MqInboundMonitoringSearchVO> searchMqInboundMonitoringList(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO) throws EventException {
		MqInboundMonitoringDBDAO mqInboundMonitoringDBDAO = new MqInboundMonitoringDBDAO();		
		try {
			String msgProcStsCd = mqInboundMonitoringSearchVO.getMsgProcStsCd();
			if("Failed".equals(msgProcStsCd)){
				List<MqInboundMonitoringSearchVO> MqInboundMonitoringSearchVOs = mqInboundMonitoringDBDAO.searchMqInboundMonitoringFailedList(mqInboundMonitoringSearchVO);
				return manipulateMqInboundMonitoringSearchVOs(MqInboundMonitoringSearchVOs);
			}else if("Sending".equals(msgProcStsCd)){
				List<MqInboundMonitoringSearchVO> MqInboundMonitoringSearchVOs = mqInboundMonitoringDBDAO.searchMqInboundMonitoringSendingList(mqInboundMonitoringSearchVO);
				return manipulateMqInboundMonitoringSearchVOs(MqInboundMonitoringSearchVOs);
			}else{
				List<MqInboundMonitoringSearchVO> MqInboundMonitoringSearchVOs = mqInboundMonitoringDBDAO.searchMqInboundMonitoringList(mqInboundMonitoringSearchVO);
				return manipulateMqInboundMonitoringSearchVOs(MqInboundMonitoringSearchVOs);
			}
		} catch (Exception e) {
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Data"}).getMessage(), e);
		}
	}

	/**
	 * 
	 * manipulateMqInboundMonitoringSearchVOs
	 * @author Jeong-Hoon, KIM
	 * @param MqInboundMonitoringSearchVOs
	 * @return List<MqInboundMonitoringSearchVO>
	 */
	private List<MqInboundMonitoringSearchVO> manipulateMqInboundMonitoringSearchVOs(List<MqInboundMonitoringSearchVO> mqInboundMonitoringSearchVOs) {
		mqInboundMonitoringSearchVOs = manipulateFlatFileInformation(mqInboundMonitoringSearchVOs);
		mqInboundMonitoringSearchVOs = changeDateToString(mqInboundMonitoringSearchVOs);
		return convertStatusCharacter(mqInboundMonitoringSearchVOs);
	}

	/**
	 * 
	 * changeDateToString
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVOs
	 * @return List<MqInboundMonitoringSearchVO>
	 */
	private List<MqInboundMonitoringSearchVO> changeDateToString(List<MqInboundMonitoringSearchVO> mqInboundMonitoringSearchVOs) {
		for(MqInboundMonitoringSearchVO inboundMonitoringSearchVO:mqInboundMonitoringSearchVOs){
			String refNo = inboundMonitoringSearchVO.getRefNo();
			refNo = refNo.replaceAll(">", "}");
			inboundMonitoringSearchVO.setRefNo(refNo.trim());
			String subSysCd = inboundMonitoringSearchVO.getSubSysCd().trim();
			subSysCd= subSysCd.replaceAll(">", "}");
			inboundMonitoringSearchVO.setSubSysCd(subSysCd.trim());
			String ediMsgTpId = inboundMonitoringSearchVO.getEdiMsgTpId().trim();
			ediMsgTpId = ediMsgTpId.replaceAll(">", "}");
			inboundMonitoringSearchVO.setEdiMsgTpId(ediMsgTpId.trim());
			String ediSndrId = inboundMonitoringSearchVO.getEdiSndrId().trim();
			ediSndrId = ediSndrId.replaceAll(">", "}");
			inboundMonitoringSearchVO.setEdiSndrId(ediSndrId.trim());
		}
		return mqInboundMonitoringSearchVOs;
	}

	/**
	 * 
	 * manipulateFlatFileInformation
	 * @author Jeong-Hoon, KIM
	 * @param mqInboundMonitoringSearchVOs
	 * @return List<MqInboundMonitoringSearchVO>
	 */
	private List<MqInboundMonitoringSearchVO> manipulateFlatFileInformation(List<MqInboundMonitoringSearchVO> mqInboundMonitoringSearchVOs) {
		for(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO : mqInboundMonitoringSearchVOs){
			String msgProcStsCd = mqInboundMonitoringSearchVO.getMsgProcStsCd();
			if("4".equals(msgProcStsCd) || "6".equals(msgProcStsCd)){
				mqInboundMonitoringSearchVO.setFlatfileDownload("DOWN");
			}
		}
		return mqInboundMonitoringSearchVOs;
	}

	/**
	 * 
	 * convertStatusCharacter
	 * @author Jeong-Hoon, KIM
	 * @param MqInboundMonitoringSearchVOs
	 * @return List<MqInboundMonitoringSearchVO>
	 */
	private List<MqInboundMonitoringSearchVO> convertStatusCharacter(List<MqInboundMonitoringSearchVO> mqInboundMonitoringSearchVOs) {
		for(MqInboundMonitoringSearchVO mqInboundMonitoringSearchVO:mqInboundMonitoringSearchVOs){
			String msgProcStsCd = mqInboundMonitoringSearchVO.getMsgProcStsCd();
			if("5".equals(msgProcStsCd)){
				mqInboundMonitoringSearchVO.setMsgProcStsCd("Success");
			}else if("6".equals(msgProcStsCd) || "4".equals(msgProcStsCd)){
				mqInboundMonitoringSearchVO.setMsgProcStsCd("Failed");
			}else{
				mqInboundMonitoringSearchVO.setMsgProcStsCd("Sending");
			}
		}
		return mqInboundMonitoringSearchVOs;
	}

}

