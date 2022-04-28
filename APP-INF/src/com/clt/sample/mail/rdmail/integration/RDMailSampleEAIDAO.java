/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : RDMailSampleEAIDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 27, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.mail.rdmail.integration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import m2soft.rdsystem.server.core.rddbagent.util.serverexport.ExportInfo;

import com.clt.framework.component.javamail.SingleMailAttachedFile;
import com.clt.framework.component.javamail.TemplateMail;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.framework.table.ComRptDsgnXptInfoVO;
import com.clt.sample.mail.rdmail.event.RDMailSampleEvent;

/**
 * It's RDMailSampleEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 27, 2009
 */
public class RDMailSampleEAIDAO extends EAIDAOSupport{

	/**
	 * This method sends RDMails.
	 * 절대로 Event 를 이용해서 값을 세팅 하지말고 VO를 사용하세요 
	 * @author Jeong-Hoon, KIM
	 * @param ev
	 * @return
	 */
	public String send(Event ev) {
		RDMailSampleEvent rdMailSampleEvent = (RDMailSampleEvent)ev;
		// 절대로 Event 를 이용해서 값을 세팅 하지말고 VO를 사용하세요 
		List<SingleMailAttachedFile> fileList = new ArrayList<SingleMailAttachedFile>();
		
		if(rdMailSampleEvent.getEmlFileKey1() != null && !"".equals(rdMailSampleEvent.getEmlFileKey1().trim())){
			SingleMailAttachedFile attatchedFile = new SingleMailAttachedFile();
			attatchedFile.setFileKey(rdMailSampleEvent.getEmlFileKey1());
			fileList.add(attatchedFile);
		}

		if(rdMailSampleEvent.getEmlFileKey2() != null && !"".equals(rdMailSampleEvent.getEmlFileKey2().trim())){
			SingleMailAttachedFile attatchedFile1 = new SingleMailAttachedFile();
			attatchedFile1.setFileKey(rdMailSampleEvent.getEmlFileKey2());
			fileList.add(attatchedFile1);
		}
		
		if(rdMailSampleEvent.getSubSysCd() != null && !"".equals(rdMailSampleEvent.getSubSysCd().trim())){
			try {				
				TemplateMail mail = new TemplateMail();
//				mail.setArg("name", "김정훈");
//				mail.setArg("message", "템플릿 예제");
				mail.setAttachedFile(fileList);
				mail.setBatFlg("N");
				mail.setTextContent(rdMailSampleEvent.getContent());
				mail.setFrom(rdMailSampleEvent.getSenderUsrEml(), rdMailSampleEvent.getSenderUsrNm());
				mail.setRdSubSysCd(rdMailSampleEvent.getSubSysCd());
				mail.setRecipient(rdMailSampleEvent.getReceiverEml());

				mail.setSubject(rdMailSampleEvent.getTitle());
//				mail.setTemplate("Test.html");
				Collection<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs = new ArrayList<ComRptDsgnXptInfoVO>();
				ComRptDsgnXptInfoVO comRptDsgnXptInfoVO = new ComRptDsgnXptInfoVO();
				comRptDsgnXptInfoVO.setCreUsrId(rdMailSampleEvent.getSenderUsrId());
				comRptDsgnXptInfoVO.setRdTmpltNm(rdMailSampleEvent.getTmplMrd());
				comRptDsgnXptInfoVO.setXptFileNm(rdMailSampleEvent.getXptFileNm());
				comRptDsgnXptInfoVO.setUpdUsrId(rdMailSampleEvent.getSenderUsrId());
				comRptDsgnXptInfoVO.setXptFileTpCd(ExportInfo.FTYPE_PDF);
				comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO);
				mail.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOs);
				mail.send();
			} catch (Exception e) {
				log.error(e.getMessage());
			}
		}
		return null;
	}

}
