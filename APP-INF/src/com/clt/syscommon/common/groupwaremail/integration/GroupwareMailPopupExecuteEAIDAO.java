/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : GroupwareMailPopupExecuteEAIDAO.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : May 26, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
/**
 * 
 */
package com.clt.syscommon.common.groupwaremail.integration;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.xmlbeans.XmlException;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.config.SubSystemConfigFactory;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.SQLExecuter;
import com.clt.framework.support.layer.integration.EAIDAOSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.irep.com.COM0010001Document;
import com.clt.irep.com.EAIHeaderType;
import com.clt.irep.com.COM0010001Document.COM0010001;
import com.clt.irep.com.COM0010001Document.COM0010001.DataArea;
import com.clt.irep.com.COM0010001Document.COM0010001.DataArea.GetMailEpInfo;
import com.clt.irep.com.COM0010001Document.COM0010001.DataArea.GetMailEpInfoResponse;
import com.jf.transfer.TransferEAI;
import com.jf.transfer.eai.exception.EAIException;
import com.jf.transfer.ws.AxDocClient;

/** It's GroupwareMailPopupExecuteEAIDAO.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * May 26, 2009
 */
public class GroupwareMailPopupExecuteEAIDAO extends EAIDAOSupport {

	/**
	 * This method opens a popup of groupware's mail.
	 * @author Jeong-Hoon, KIM
	 * @param gwSubject
	 * @param gwContents
	 * @param account
	 * @return
	 * @throws DAOException 
	 */
	public String popGroupwareWindow(String gwSubject, String gwContents,
			SignOnUserAccount account) throws DAOException {
		TransferEAI transferEAI = new AxDocClient(SiteConfigFactory.getWhenNullThrowException("COM.COM001_0001.WSDL"), this.getClass());
			
		String returnMessage;
		try {
			returnMessage = webserviceRequest(gwSubject, gwContents, transferEAI, account);
		} catch (SQLException e) {
			log.error("["+e.getClass().getName()+"]"+e.getMessage());
			throw new DAOException("["+e.getClass().getName()+"]"+e.getMessage());
		} catch (Exception e) {
			log.error("["+e.getClass().getName()+"]"+e.getMessage());
			throw new DAOException("["+e.getClass().getName()+"]"+e.getMessage());
		}		
		String returnValue = webserviceResponse(transferEAI, returnMessage);		

		log.info("[GetMailEpInfoResult Response]"+returnValue);
		return returnValue;
	}

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param gwSubject
	 * @param gwSubject2
	 * @param transferEAI
	 * @param account
	 * @return
	 * @throws Exception 
	 */
	private String webserviceRequest(String gwSubject, String gwContents,
			TransferEAI transferEAI, SignOnUserAccount account)  throws Exception {
		
			COM0010001Document document = COM0010001Document.Factory.newInstance();
			COM0010001 com0010001 = COM0010001.Factory.newInstance();

			String dateTime = "COM001_0001" + (new SimpleDateFormat("yyyyMMddHHmmss")).format(new Date());
			//Set Header
			EAIHeaderType headerType = com0010001.addNewEAIHeader();
			headerType.setInstanceId(dateTime);

			COM0010001.DataArea dataArea = com0010001.addNewDataArea();		
			
			GetMailEpInfo[] getMailEpInfos = new GetMailEpInfo[1];
			GetMailEpInfo epInfo = dataArea.addNewGetMailEpInfo();

			boolean ssoEnableFlag = new Boolean(SiteConfigFactory.getWhenNullThrowException("COM.CLT.SSO.ENABLED"));
			if((SubSystemConfigFactory.get("COM.IAM.NAME").equals(account.getCre_usr_id()) ? true : false)
					&& ssoEnableFlag){
				ssoGroupwarePopup(account, epInfo);
			} else if(!ssoEnableFlag){
				epInfo.setUserID("2008601");
				epInfo.setGlobalUserId("2008601");
			} else{
				log.error("Please Check your status of SSO. Values IAM[" + SubSystemConfigFactory.get("COM.IAM.NAME") + "] account[" + account.getCre_usr_id() + "] ssoEnableFlag[" + ssoEnableFlag);
				throw new Exception("Please Check your status of SSO. Values IAM[" + SubSystemConfigFactory.get("COM.IAM.NAME") + "] account[" + account.getCre_usr_id() + "] ssoEnableFlag[" + ssoEnableFlag);
			}
			
			epInfo.setFormDistinct("MAIL_EP_1");
			epInfo.setSystemDocumentID(getSystemDocumentId());
			epInfo.setSystemName(SiteConfigFactory.getWhenNullThrowException("COM.CLT.SYSTEM.TYPE"));
			epInfo.setXmldom("<?xml version='1.0' encoding = 'UTF-8' ?><ROOT><SUBJECT>" +
								gwSubject +
								"</SUBJECT><BODY><CONTENTS><![CDATA[" +
								gwContents +
								"]]></CONTENTS></BODY></ROOT>");
			
			getMailEpInfos[0] = epInfo;
			dataArea.setGetMailEpInfoArray(getMailEpInfos);
			com0010001.setDataArea(dataArea);
			document.setCOM0010001(com0010001);
			
			transferEAI.setMessage(document.toString());
			String returnMessage = "";
			try {
				returnMessage = transferEAI.commit("GroupwareMailPopup");
			} catch (EAIException e) {
				transferEAI.rollback(e);
				log.error(e.getMessage(),e);			
				throw new DAOException("["+e.getClass().getName()+"]"+e.getMessage());
			} catch (Exception e){
				transferEAI.rollback(e);
				log.error(e.getMessage(),e);
				throw new DAOException("["+e.getClass().getName()+"]"+e.getMessage());
			}
			return returnMessage;
	}

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @param account
	 * @param epInfo
	 * @throws SQLException
	 * @throws DAOException
	 */
	private void ssoGroupwarePopup(SignOnUserAccount account, GetMailEpInfo epInfo) throws SQLException, DAOException {
		if (new GroupwareMailPopupExecuteEAIDAO().getGroupwareUserId(account.getUsr_id()) == null ? false : true) {
			epInfo.setUserID(getGroupwareUserId(account.getUsr_id()));
			epInfo.setGlobalUserId(account.getUsr_id());
		} else {
			throw new DAOException("Check your Id that regists in SSO."+"["+account.getUsr_id()+"]"+"["+account.getCre_usr_id()+"]");
		}
	}

	/**This method 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	private String getSystemDocumentId() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String currentTime = dateFormat.format(new Date());
		String systemDocumentId = SiteConfigFactory.getWhenNullThrowException("COM.CLT.SYSTEM.TYPE")+"_"+currentTime+new Random().nextInt(1000);
		return systemDocumentId;
	}

	/**This method gets a groupware user Id
	 * @author Jeong-Hoon, KIM
	 * @param cre_usr_id
	 * @return
	 * @throws DAOException 
	 * @throws SQLException 
	 */
	public String getGroupwareUserId(String userId) throws SQLException, DAOException {
		Map<String, String> mapParam = new HashMap<String, String>();
		mapParam.put("usr_id", userId);
		DBRowSet rowSet = new SQLExecuter("SysComDB").executeQuery(new GroupwareMailPopupExecuteDAOGroupwareIdRSQL(), mapParam, null);
		rowSet.next();
		String returnValue = rowSet.getString("EP_ID");
		return returnValue;
	}

	/**This method parse a return Message of groupware mail.
	 * @author Jeong-Hoon, KIM
	 * @param transferEAI
	 * @param returnMessage
	 * @throws DAOException 
	 */
	private String webserviceResponse(TransferEAI transferEAI,
			String returnMessage) throws DAOException {
		GetMailEpInfoResponse epInfoResponse = GetMailEpInfoResponse.Factory.newInstance();
		epInfoResponse.setGetMailEpInfoResult(returnMessage);
		COM0010001Document documentResponse = null;
		String returnValue = "";
		try {
			documentResponse = COM0010001Document.Factory.parse(epInfoResponse.getGetMailEpInfoResult());
			COM0010001 com0010001Response = documentResponse.getCOM0010001();
			DataArea dataAreaReponse = com0010001Response.getDataArea();
			GetMailEpInfoResponse[] epInfoResponseInResponse = dataAreaReponse.getGetMailEpInfoResponseArray();
			returnValue = epInfoResponseInResponse[0].getGetMailEpInfoResult();
		} catch (XmlException e) {
			transferEAI.rollback(e);
			log.error(e.getMessage(),e);
			throw new DAOException("["+e.getClass().getName()+"]"+e.getMessage());
		} catch (Exception e){
			transferEAI.rollback(e);
			log.error(e.getMessage(),e);
			throw new DAOException("["+e.getClass().getName()+"]"+e.getMessage());
		}
		return returnValue;
	}
}
