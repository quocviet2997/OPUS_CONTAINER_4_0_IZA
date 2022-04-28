/*========================================================
*Copyright(c) 2016 CyberLogitec
*ProcessChain    : TIS
*@FileName       : MailMonitoringEAIDAO.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2016. 3. 22.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.management.opus.mailmonitoring.integration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.clt.framework.component.exception.CheckUtilsException;
import com.clt.framework.component.javamail.Mail;
import com.clt.framework.component.javamail.MailerAppException;
import com.clt.framework.component.javamail.SingleMailAttachedFile;
import com.clt.framework.component.util.object.ObjectCloner;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.framework.table.ComRptDsgnXptInfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.AtchFileVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.CtntVO;
import com.clt.framework.table.ComEmlSndInfoVO;
import com.clt.syscommon.management.opus.mailmonitoring.vo.RptDsgnXptInfoVO;

/**
 * MailMonitoringEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2016. 3. 22.
 */
public class MailMonitoringEAIDAO extends EAIDAOSupport {

	/**
	 * 
	 * sendMail
	 * @author Jeong-Hoon, KIM
	 * @param comEmlSndInfoVO
	 * @param ctntVO
	 * @param atchFileVOs
	 * @param rptDsgnXptInfoVOs
	 * @return String
	 * @throws MailerAppException 
	 * @throws DAOException 
	 * @throws CheckUtilsException 
	 */
	public String sendMail(ComEmlSndInfoVO comEmlSndInfoVO, CtntVO ctntVO, List<AtchFileVO> atchFileVOs, List<RptDsgnXptInfoVO> rptDsgnXptInfoVOs) throws MailerAppException, CheckUtilsException, DAOException {
		Mail mail = new Mail();
		mail.setAttachedFile(getAttachedFile(atchFileVOs));
		mail.setBatFlg(comEmlSndInfoVO.getBatFlg());
		mail.setBccRcvrEml(comEmlSndInfoVO.getBccEmlCtnt());
		mail.setCcRcvrEml(comEmlSndInfoVO.getCcEmlCtnt());
		mail.setComRptDsgnXptInfoVOs(getComRptDsgnXptInfoVOs(rptDsgnXptInfoVOs));
		mail.setCreUsrIds(comEmlSndInfoVO.getCreUsrId());
		mail.setEmlCtnt(new StringBuilder().append(ctntVO.getEmlCtnt()));
		mail.setEmlSplitCapa(comEmlSndInfoVO.getEmlSplitCapa());
		mail.setFrom(comEmlSndInfoVO.getSndrEml(), comEmlSndInfoVO.getSndrNm());
		mail.setRecipients(comEmlSndInfoVO.getToEmlCtnt().split(";"));
		mail.setRptMrgFileNm(comEmlSndInfoVO.getRptMrgFileNm());
		mail.setRptMrgFlg(comEmlSndInfoVO.getRptMrgFlg());
		mail.setRptSplitCapa(comEmlSndInfoVO.getRptSplitCapa());
		mail.setRptSplitQty(comEmlSndInfoVO.getRptSplitQty());
		mail.setSmtpIp(comEmlSndInfoVO.getSmtpIp());
		mail.setSubject(comEmlSndInfoVO.getEmlTitNm());		
		mail.setEmlAtchHvFileFlg(comEmlSndInfoVO.getEmlAtchHvFileFlg());
		return mail.send();
	}

	/**
	 * 
	 * getComRptDsgnXptInfoVOs
	 * @author Jeong-Hoon, KIM
	 * @param rptDsgnXptInfoVOs
	 * @return Collection<ComRptDsgnXptInfoVO>
	 */
	private Collection<ComRptDsgnXptInfoVO> getComRptDsgnXptInfoVOs(List<RptDsgnXptInfoVO> rptDsgnXptInfoVOs) {
		List<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs = new ArrayList<ComRptDsgnXptInfoVO>();
		for(RptDsgnXptInfoVO rptDsgnXptInfoVO:rptDsgnXptInfoVOs){
			ComRptDsgnXptInfoVO comRptDsgnXptInfoVO = new ComRptDsgnXptInfoVO();
			ObjectCloner.build(rptDsgnXptInfoVO, comRptDsgnXptInfoVO);
			comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO);
		}
		return comRptDsgnXptInfoVOs;
	}

	/**
	 * 
	 * getAttachedFile
	 * @author Jeong-Hoon, KIM
	 * @param atchFileVOs
	 * @return List<SingleMailAttachedFile>
	 */
	private List<SingleMailAttachedFile> getAttachedFile(List<AtchFileVO> atchFileVOs) {
		List<SingleMailAttachedFile> singleMailAttachedFiles = new ArrayList<SingleMailAttachedFile>();
		for(AtchFileVO atchFileVO:atchFileVOs){
			SingleMailAttachedFile singleMailAttachedFile = new SingleMailAttachedFile();
			singleMailAttachedFile.setFileKey(atchFileVO.getEmlAtchFileNo());
			singleMailAttachedFiles.add(singleMailAttachedFile);
		}
		return singleMailAttachedFiles;
	}

}

