/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : MailSendBCImpl.java
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
package com.clt.sample.mail.mail.basic;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.exception.CheckUtilsException;
import com.clt.framework.component.javamail.Mail;
import com.clt.framework.component.javamail.MailGroup;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.sample.mail.mail.integration.MailSendEAIDAO;

/**
 *  It's MailSendBCImpl.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * May 22, 2009
 */
public class MailSendBCImpl implements MailSendBC{

	/**
	 * MailSend 의 BC
	 * @throws CheckUtilsException 
	 * @throws SQLException 
	 * @throws DAOException 
	 * @throws IOException 
	 */
	@Override
	public void doMail() throws Exception {
		MailSendEAIDAO mailSendEAIDAO = new MailSendEAIDAO();
		
		mailSendEAIDAO.doMail(0, "jjkvnc_20100221175633226.xls", "coolguy@cyberlogitec.com");
		
//		List<String> list = new ArrayList<String>();
//		list.add("ahsbqj_20100112104549225.txt");
//		list.add("pskcce_2010011814021036.exe");
//		list.add("yucmdm_20100106114958015.doc");
//		
//
//		List<String> list2 = new ArrayList<String>();
//		list2.add("coolguy@cyberlogitec.com");
//		list2.add("gimjh0@naver.com;coolguy@cyberlogitec.com");
//		list2.add("coolguy@cyberlogitec.com");
		
//		List<Mail> mails = new ArrayList<Mail>();
//		for(int i=0;i<3;i++){
//			mails.add(mailSendEAIDAO.doMail(i, list.get(i), list2.get(i)));
//		}
		

		//mail group1 start
//		for(int i=0;i<2;i++){
//			MailGroup mailGroup = new MailGroup();
//			mailGroup.setEmlCtnt(new StringBuilder("Mail Body Hello1"));
//			mailGroup.setFrom("nhc123@cyberlogitec.com");
//			mailGroup.setSubject("Group Mail Test1");
//	
//			mailGroup.addMail(mails.get(i));
//			
//			mailGroup.sendMailGroupMergeAndSplit("A.pdf", 1000000);
//		}
		
//		//mail group1 start
//		MailGroup mailGroup = new MailGroup();
//		mailGroup.setEmlCtnt(new StringBuilder("Mail Body Hello1"));
//		mailGroup.setFrom("nhc123@cyberlogitec.com");
//		mailGroup.setSubject("Group Mail Test1");
//
//		mailGroup.addMail(mails.get(0));
//		mailGroup.addMail(mails.get(1));
//		
//		mailGroup.sendMailGroupMergeAndSplit("A.pdf", 1000000);
//		
//		//mail group2 start
//		MailGroup mailGroup2 = new MailGroup();
//		mailGroup2.setEmlCtnt(new StringBuilder("Mail Body Hello2"));
//		mailGroup2.setFrom("nhc123@cyberlogitec.com");
//		mailGroup2.setSubject("Group Mail Test2");
//
//		mailGroup2.addMail(mails.get(2));
//		mailGroup2.sendMailGroupMergeAndSplit("A.pdf", 1000000);
	}

}
