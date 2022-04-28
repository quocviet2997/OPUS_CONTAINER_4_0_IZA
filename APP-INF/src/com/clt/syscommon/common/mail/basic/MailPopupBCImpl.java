/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailPopBCImpl.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 13, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.mail.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.rdexport.ReportDesignerExporter;
import com.clt.framework.component.rdmail.dao.ComEmlSndInfoDBDAO;
import com.clt.framework.component.util.io.FileUtils;
import com.clt.framework.component.util.reportdesigner.ReportDesignerUtilities;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.table.ComRptDsgnXptInfoVO;
import com.clt.framework.table.ComUpldFileVO;
import com.clt.syscommon.common.mail.vo.MailCustomVO;


/**
 * It's MailPopBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 13, 2009
 */
public class MailPopupBCImpl implements MailPopupBC {

	/**
	 * Get Mail template contents .<br>
	 * @param template	String
	 * @return String
	 * @throws IOException
	 */	
	public String getTemplateContent(String template, String argument) throws IOException {
		String templateFile = FileUtils.fileReader(SiteConfigFactory.get("COM.CLT.JAF.MAIL.TEMPLATE.DIR"), template, argument.split(","));
		return templateFile;
	}

	/**
	 * This method exports files of reports.
	 * @author Jeong-Hoon, KIM
	 * @param mailCustomVO
	 * @return
	 * @throws Exception 
	 */
	public List<ComUpldFileVO> exportReport(MailCustomVO mailCustomVO) throws Exception{
		List<ComRptDsgnXptInfoVO> exportVOs = new ArrayList<ComRptDsgnXptInfoVO>();
		
		int index = 0;
		for(String templateMrd:mailCustomVO.getTemplateMrd()){
			ComRptDsgnXptInfoVO exportVO = new ComRptDsgnXptInfoVO();
			exportVO.setRptXptNo(ReportDesignerUtilities.getSndNo());
			exportVO.setRdApplCd(new ComEmlSndInfoDBDAO().getRdApplCd(templateMrd));
			exportVO.setRdParaCtnt(mailCustomVO.getTemplateMrdArguments().get(index));
			exportVO.setXptFileNm(mailCustomVO.getRdExportFileName().get(index));
			exportVO.setXptFileTpCd(mailCustomVO.getRdExportFileType().get(index));
			exportVOs.add(exportVO);
			index++;
		}
		ReportDesignerExporter designerExporter = new ReportDesignerExporter();
		List<ComRptDsgnXptInfoVO> identifiedComRptDsgnXptInfoVO = ReportDesignerUtilities.getReportDesignerExportVO(exportVOs);
		return designerExporter.doExports(identifiedComRptDsgnXptInfoVO, SiteConfigFactory.get("COM.CLT.RDEXP.RPT_OUTPUT_PATH.DEFAULT"));
	}

}
