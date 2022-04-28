/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailEAIDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 4. 6.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.integration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.clt.framework.component.exception.CheckUtilsException;
import com.clt.framework.component.javamail.MailerAppException;
import com.clt.framework.component.javamail.SingleMailAttachedFile;
import com.clt.framework.component.javamail.TemplateMail;
import com.clt.framework.component.util.io.FileUtils;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.framework.table.ComRptDsgnXptInfoVO;
import com.clt.syscommon.common.mail.vo.MailCustomVO;

/**
 * It's MailEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 4. 6.
 */
public class MailEAIDAO extends EAIDAOSupport{

	/**
	 * It sends a mail.
	 * @author Jeong-Hoon, KIM
	 * @param mailCustomVO
	 * @return
	 * @throws MailerAppException 
	 */
	public String doMail(MailCustomVO mailCustomVO) throws MailerAppException {
		try {
			return doTemplateMail(mailCustomVO);
		} catch (CheckUtilsException e) {
			throw new MailerAppException(e);
		} catch (DAOException e) {
			throw new MailerAppException(e);
		}
	}

	/**
	 * This method sends a Template mail.
	 * @author Jeong-Hoon, KIM
	 * @param mailCustomVO
	 * @return
	 * @throws MailerAppException 
	 * @throws CheckUtilsException 
	 * @throws DAOException 
	 */
	private String doTemplateMail(MailCustomVO mailCustomVO) throws MailerAppException, CheckUtilsException, DAOException {
		TemplateMail mail = new TemplateMail();

		mail.setAttachedFile(fileAttach(mailCustomVO.getFileKey(),mailCustomVO.getReportFileKeys()));
		mail.setComRptDsgnXptInfoVOs(reportAttach(mailCustomVO));
		mail.setBccRcvrEml(mailCustomVO.getBlindCarbonCopy());
		mail.setCcRcvrEml(mailCustomVO.getCarbonCopy());
		mail.setFrom(mailCustomVO.getFrom(), mailCustomVO.getFromName());
		mail.setSubject(mailCustomVO.getSubject());
		mail.setRecipient(mailCustomVO.getRecipient());
		mail.setHtmlContent(mailCustomVO.getContent());
		mail.setSmtpIp(mailCustomVO.getSmtp());
		mail.setOfficeCode(mailCustomVO.getOfficeCode());
		if(mailCustomVO.getGroupwareMail()){
			mail.setGroupwareMail();
		}
		
		//Template 설정.
		if(mailCustomVO.getTemplate() != null && !"".equals(mailCustomVO.getTemplate())){
			mail.setHtmlTemplate(mailCustomVO.getTemplate());
			
			//Set Arguments
			String argument = mailCustomVO.getArgument();
			String[] argumentTemplates = argument.split(",");
			for(String argumentTemplate:argumentTemplates){
				String[] argumentSet = argumentTemplate.split(";");
				if(argumentSet.length != 2){
					throw new IllegalArgumentException();
				}
				mail.setArg(argumentSet[0], argumentSet[1]);
			}
		}
		
		return mail.send();
	}

	/**
	 * This method sets files of report.
	 * @author Jeong-Hoon, KIM
	 * @param mailCustomVO
	 * @return Collection<ComRptDsgnXptInfoVO>
	 */
	private Collection<ComRptDsgnXptInfoVO> reportAttach(MailCustomVO mailCustomVO) {
		List<String> tmplateMrds = mailCustomVO.getTemplateMrd();
		List<String> tmplateArguments = mailCustomVO.getTemplateMrdArguments();
		List<String> exportFileNames = mailCustomVO.getRdExportFileName();
		List<String> exportFileTypes = mailCustomVO.getRdExportFileType();
		Collection<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs = new ArrayList<ComRptDsgnXptInfoVO>();
		for(int i=0;i<tmplateMrds.size();i++){
			ComRptDsgnXptInfoVO comRptDsgnXptInfoVO = new ComRptDsgnXptInfoVO();
			comRptDsgnXptInfoVO.setRdTmpltNm(FileUtils.filename(tmplateMrds.get(i)));
			comRptDsgnXptInfoVO.setRdParaCtnt(tmplateArguments.get(i));
			comRptDsgnXptInfoVO.setXptFileNm(exportFileNames.get(i));
			comRptDsgnXptInfoVO.setXptFileTpCd(exportFileTypes.get(i));
			comRptDsgnXptInfoVO.setCreUsrId(mailCustomVO.getCreUsrId());
			comRptDsgnXptInfoVO.setUpdUsrId(mailCustomVO.getCreUsrId());
			comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO);
		}
		return comRptDsgnXptInfoVOs;
	}

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param fileLocation 
	 * @param fileKey
	 * @return
	 */
	private List<SingleMailAttachedFile> fileAttach(String fileKeys, String[] reportFileKeys) {
		List<SingleMailAttachedFile> list = new ArrayList<SingleMailAttachedFile>();
		
		if(fileKeys != null && !"".equals(fileKeys.trim())){
			String[] arrFileKeys = fileKeys.split(";");
			for(String fileKey : arrFileKeys){
				SingleMailAttachedFile attachedFile = new SingleMailAttachedFile();
				attachedFile.setFileKey(fileKey);
				list.add(attachedFile);
			}
		}
		return list;
	}
}
