/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailSendEAIDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : May 22, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
/**
 * 
 */
package com.clt.sample.mail.mail.integration;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import m2soft.rdsystem.server.core.rddbagent.util.serverexport.ExportInfo;

import com.clt.framework.component.exception.CheckUtilsException;
import com.clt.framework.component.javamail.Mail;
import com.clt.framework.component.javamail.MailGroup;
import com.clt.framework.component.javamail.MailerAppException;
import com.clt.framework.component.javamail.SingleMailAttachedFile;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.framework.table.ComRptDsgnXptInfoVO;

/** It's MailSendEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * May 22, 2009
 */
public class MailSendEAIDAO extends EAIDAOSupport{

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param email 
	 * @param string 
	 * @param  
	 * @throws MailerAppException 
	 * @throws CheckUtilsException 
	 * @throws SQLException 
	 * @throws DAOException 
	 * @throws IOException 
	 */
	public void doMail(int cnt, String attachFilekey, String email ) throws MailerAppException, DAOException, SQLException, CheckUtilsException, IOException {
		//mail1 start
		Mail mail = new Mail();
		mail.setFrom("sysmail@ebstorm.com");
		mail.setSubject("제목1"); 
		mail.setRecipient("coolguy@cyberlogitec.com");
		mail.setTextContent("내용1");
		List<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs = new ArrayList<ComRptDsgnXptInfoVO>();
		
		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO2 = new ComRptDsgnXptInfoVO();
		comRptDsgnXptInfoVO2.setCreUsrId("2008601");
		comRptDsgnXptInfoVO2.setUpdUsrId("2008601");
		comRptDsgnXptInfoVO2.setRdTmpltNm("TEST.mrd");
		comRptDsgnXptInfoVO2.setXptFileTpCd(ExportInfo.FTYPE_PDF);
		comRptDsgnXptInfoVO2.setXptFileNm("Test12.pdf");
		comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO2);
		
		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO3 = new ComRptDsgnXptInfoVO();
		comRptDsgnXptInfoVO3.setCreUsrId("2008601");
		comRptDsgnXptInfoVO3.setUpdUsrId("2008601");
		comRptDsgnXptInfoVO3.setRdTmpltNm("TEST.mrd");
		comRptDsgnXptInfoVO3.setXptFileTpCd(ExportInfo.FTYPE_PDF);
		comRptDsgnXptInfoVO3.setXptFileNm("Test11.pdf");
		comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO3);		
		
		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO4 = new ComRptDsgnXptInfoVO();
		comRptDsgnXptInfoVO4.setCreUsrId("2008601");
		comRptDsgnXptInfoVO4.setUpdUsrId("2008601");
		comRptDsgnXptInfoVO4.setRdTmpltNm("TEST.mrd");
		comRptDsgnXptInfoVO4.setXptFileTpCd(ExportInfo.FTYPE_PDF);
		comRptDsgnXptInfoVO4.setXptFileNm("Test10.pdf");
		comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO4);
		
		Mail mail1 = new Mail();
		mail1.setFrom("sysmail@ebstorm.com");
		mail1.setSubject("제목2"); 
		mail1.setRecipient("coolguy@cyberlogitec.com");
		mail1.setTextContent("내용2");
		mail1.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOs);
		
		List<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs2 = new ArrayList<ComRptDsgnXptInfoVO>();
		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO22 = new ComRptDsgnXptInfoVO();
		comRptDsgnXptInfoVO22.setCreUsrId("2008601");
		comRptDsgnXptInfoVO22.setUpdUsrId("2008601");
		comRptDsgnXptInfoVO22.setRdTmpltNm("TEST.mrd");
		comRptDsgnXptInfoVO22.setXptFileTpCd(ExportInfo.FTYPE_PDF);
		comRptDsgnXptInfoVO22.setXptFileNm("Test12.pdf");
		comRptDsgnXptInfoVOs2.add(comRptDsgnXptInfoVO22);		
		
		Mail mail2 = new Mail();
		mail2.setFrom("sysmail@ebstorm.com");
		mail2.setSubject("제목3"); 
		mail2.setRecipient("devkjh@gmail.com");
		mail2.setTextContent("내용3");
		mail2.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOs2);
		
		//mail group1 start
		MailGroup mailGroup = new MailGroup();
		mailGroup.addMail(mail);
		mailGroup.addMail(mail1);		
		mailGroup.addMail(mail2);		
		mailGroup.setEmlCtnt(new StringBuilder("Mail Body Hello"));
		mailGroup.setFrom("nhc123@cyberlogitec.com");
		mailGroup.setSubject("Group Mail Test");
		mailGroup.setTextContent("test Content");
		mailGroup.setOfficeCode("SELSC");
		
		mailGroup.sendMailGroupMergeAndSplit("A.pdf", 1000000);
//		
//		

/******
//		List<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs = new ArrayList<ComRptDsgnXptInfoVO>();
//		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO2 = new ComRptDsgnXptInfoVO();
//		comRptDsgnXptInfoVO2.setCreUsrId("2008601");
//		comRptDsgnXptInfoVO2.setUpdUsrId("2008601");
//		comRptDsgnXptInfoVO2.setRdTmpltNm("TEST.mrd");
//		comRptDsgnXptInfoVO2.setXptFileTpCd(ExportInfo.FTYPE_PDF);
//		comRptDsgnXptInfoVO2.setXptFileNm(cnt+"Test12.pdf");
//		comRptDsgnXptInfoVOs.add(comRptDsgnXptInfoVO2);		
//		
//       // Case 1 Attach File Group send
//		Mail mail = new Mail();
//		mail.setFrom("sysmail@ebstorm.com");
//		mail.setSubject("MNR W/O Notice_(PUS5000148)_2010.02.21 13:45:22"); 
//		mail.setRecipient(email);
//		mail.setTextContent("");
//		mail.setRptMrgFlg("Y");
//		mail.setRptSplitCapa("100000");
//		mail.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOs);
//		mail.send();
//		return mail;
 ***/
		
		



		//mail group2 start
//		MailGroup mailGroup2 = new MailGroup();
//		mailGroup2.addMail(mail2);
//		
//		mailGroup2.setEmlCtnt(new StringBuilder("Mail Body Hello1"));
//		mailGroup2.setFrom("nhc123@cyberlogitec.com");
//		mailGroup2.setSubject("Group Mail Test1");
//		mailGroup2.sendMailGroupMergeAndSplit("B.pdf", 1000000);
//		
//		List<SingleMailAttachedFile> list2 = new ArrayList<SingleMailAttachedFile>();
//		SingleMailAttachedFile attachedFile2 = new SingleMailAttachedFile();
//		attachedFile2.setFileLocation("/a_upload/FILE/COM/2010010600003558.doc");
//		list2.add(attachedFile2);
//		mail.addAttachedFile(list2);		
//		mail.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOs);
//		mail.sendSplitPageEmlCapa(2, 100000);
//		mail.sendSplitPage(2);
//		mail.sendSplit(100000);
//		mail.sendSplit();
//		mail.sendMergeSplitPageEmlCapa("반가워요5.pdf", 1, 90000);
//		mail.sendMergeAndSplitPageAndEmlCapa("반가워요4.pdf", 3);
//		mail.sendMergeAndSplitPage("반가워요3.pdf", 2);
//		mail.sendMergeAndSplit("반가워요2.pdf", 90000);
//		mail.sendMergeAndSplit("반가워요.pdf");
//		mail.sendMerge("안녕하세요.pdf");
//		mail.send();
//		String sndNo = mail.sendMergePdfSplitQty("HelloMergePdf.pdf", 2);
//		String sndNo = mail.sendMergePdfSplitQtyEmlCapa("HelloMergePdf.pdf", "2", "100000");		
//		String sndNo = mail.sendPdfSplitQtyEmlCapa("2", "110000");		
//		String sndNo = mail.sendPdfSplitQty("2");
//		String sndNo = mail.sendMergeAndSplitCapa("MailMergeHi.pdf", "90000");
//		String sndNo = mail.sendSplitCapa("90000");
		//mail1 end
		
//		//mail2 start
//		 Mail mail2 = new Mail();
//		 mail2.setRecipient("gimjh0@naver.com;coolguy@cyberlogitec.com");
//		mail2.setSubject("제목2"); 
//		mail2.setTextContent("내용2");
//		
//		List<SingleMailAttachedFile> list = new ArrayList<SingleMailAttachedFile>();
//		SingleMailAttachedFile attachedFile = new SingleMailAttachedFile();
//		attachedFile.setFileKey("lrdeko_2010010621513918.xls");
//		list.add(attachedFile);
//		mail2.setAttachedFile(list);
//		
//
//		List<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOs1 = new ArrayList<ComRptDsgnXptInfoVO>();
//		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO5 = new ComRptDsgnXptInfoVO();
//		comRptDsgnXptInfoVO5.setCreUsrId("2008601");
//		comRptDsgnXptInfoVO5.setUpdUsrId("2008601");
//		comRptDsgnXptInfoVO5.setRdTmpltNm("TEST.mrd");
//		comRptDsgnXptInfoVO5.setXptFileTpCd(ExportInfo.FTYPE_PDF);
//		comRptDsgnXptInfoVO5.setXptFileNm("Test20.pdf");
//		comRptDsgnXptInfoVOs1.add(comRptDsgnXptInfoVO5);
//				
//		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO6 = new ComRptDsgnXptInfoVO();
//		comRptDsgnXptInfoVO6.setCreUsrId("2008601");
//		comRptDsgnXptInfoVO6.setUpdUsrId("2008601");
//		comRptDsgnXptInfoVO6.setRdTmpltNm("TEST.mrd");
//		comRptDsgnXptInfoVO6.setXptFileTpCd(ExportInfo.FTYPE_PDF);
//		comRptDsgnXptInfoVO6.setXptFileNm("Test12.pdf");
//		comRptDsgnXptInfoVOs1.add(comRptDsgnXptInfoVO6);
//		
//		mail2.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOs1);
////		mail2 end
//
//		//mail3 start
//		Mail mail3 = new Mail();
//		mail3.setSubject("메일3");
//		mail3.setTextContent("내용3");
//		mail3.setFrom("coolguy@cyberlogitec.com");
//		mail3.setRecipient("devkjh@gmail.com");
//
//		
//		List<SingleMailAttachedFile> list3 = new ArrayList<SingleMailAttachedFile>();
//		SingleMailAttachedFile attachedFile3 = new SingleMailAttachedFile();
//		attachedFile3.setFileKey("thdsqw_20100106215220389.ppt");
//		list3.add(attachedFile3);
//		mail3.setAttachedFile(list3);
//		//mail3 end
//		
//		

		
		
		//Template
		//mail1 start
//		TemplateMail template = new TemplateMail();
//		template.setFrom("sysmail@ebstorm.com");
//		template.setSubject("제목"); 
//		template.setRecipient("sysmail@ebstorm.com;coolguy@cyberlogitec.com;devkjh@gmail.com");
////		template.set
////		mail.setCcRcvrEml("9054@nate.com");
////		mail.setBccRcvrEml("hsyoo71@cyberlogitec.com;piljae@cyberlogitec.com");
//		template.setTextContent("내용");
//		List<ComRptDsgnXptInfoVO> comRptDsgnXptInfoVOss = new ArrayList<ComRptDsgnXptInfoVO>();
//		
//		ComRptDsgnXptInfoVO comRptDsgnXptInfoVOa = new ComRptDsgnXptInfoVO();
//		comRptDsgnXptInfoVOa.setCreUsrId("2008601");
//		comRptDsgnXptInfoVOa.setUpdUsrId("2008601");
//		comRptDsgnXptInfoVOa.setRdTmpltNm("TEST6.mrd");
//		comRptDsgnXptInfoVOa.setRdParaCtnt("/rv bkg_no[('BKKZ4250001A1','KORY1025089','KORZC315127','KORY1025027','KORY1025041')] remark[test1@@test2@@test3@@test4] type[detail] usr_id[0660235]");
//		comRptDsgnXptInfoVOa.setXptFileTpCd(ExportInfo.FTYPE_PDF);
//		comRptDsgnXptInfoVOa.setXptFileNm("Test6.pdf");
//		comRptDsgnXptInfoVOss.add(comRptDsgnXptInfoVOa);
//		
//		ComRptDsgnXptInfoVO comRptDsgnXptInfoVO2s = new ComRptDsgnXptInfoVO();
//		comRptDsgnXptInfoVO2s.setCreUsrId("2008601");
//		comRptDsgnXptInfoVO2s.setUpdUsrId("2008601");
//		comRptDsgnXptInfoVO2s.setRdTmpltNm("TEST.mrd");
//		comRptDsgnXptInfoVO2s.setXptFileTpCd(ExportInfo.FTYPE_PDF);
//		comRptDsgnXptInfoVO2s.setXptFileNm("Test12.pdf");
//		comRptDsgnXptInfoVOss.add(comRptDsgnXptInfoVO2s);
		
//		List<SingleMailAttachedFile> list1 = new ArrayList<SingleMailAttachedFile>();
//		SingleMailAttachedFile attachedFile1 = new SingleMailAttachedFile();
//		attachedFile1.setFileKey("yucmdm_20100106114958015.doc");
//		list1.add(attachedFile1);
//		template.addAttachedFile(list1);
		
//		List<SingleMailAttachedFile> list2 = new ArrayList<SingleMailAttachedFile>();
//		SingleMailAttachedFile attachedFile2 = new SingleMailAttachedFile();
//		attachedFile2.setFileLocation("/a_upload/FILE/COM/2010010600003558.doc");
//		list2.add(attachedFile2);
//		mail.addAttachedFile(list2);
		
//		template.setComRptDsgnXptInfoVOs(comRptDsgnXptInfoVOss);
		
//		template.send();
//		template.send();
//		template.sendMergeAndSplit("Test.pdf", 100000);

//		mail.sendSplitPageEmlCapa(2, 100000);
//		mail.sendSplitPage(2);
//		mail.sendSplit(100000);

////		mail.sendSplit();
//		
//		//mail group start
//		MailGroup mailGroup = new MailGroup();
////		mailGroup.addMail(template);
//		mailGroup.addMail(mail);
//		mailGroup.addMail(mail1);
//		
//		mailGroup.setEmlCtnt(new StringBuilder("Mail Body Hello"));
//		mailGroup.setFrom("nhc123@cyberlogitec.com");
//		mailGroup.setSubject("Group Mail Test");
//		
//		List<List<MailGroupResultVO>> groupMailKeys = mailGroup.sendMailGroupSplit(750000);
//		
//
//		
//		MailGroup mailGroup2 = new MailGroup();
//		mailGroup2.addMail(mail2);
//		
//		mailGroup2.setEmlCtnt(new StringBuilder("Mail Body Hello1"));
//		mailGroup2.setFrom("nhc123@cyberlogitec.com");
//		mailGroup2.setSubject("Group Mail Test1");
//		mailGroup2.sendMailGroup();
////		mailGroup.addMail(mail3);
		
		
	}
}
