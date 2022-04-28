/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : UserBCImpl.java
*@FileTitle : User Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.19
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.19 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.user.basic;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.CryptUtil;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.user.integration.MailSendEAIDAO;
import com.clt.syscommon.management.opus.user.integration.UserDAO;
import com.clt.syscommon.management.opus.user.vo.ComUserInfoVO;
import com.clt.syscommon.management.opus.user.vo.ComUserVO;
import com.clt.syscommon.management.opus.user.vo.ComUsrPgmMtchVO;
import com.clt.syscommon.management.opus.user.vo.UserResponseContainerVO;

/**
 * NIS2010-UserManagement Business Logic Basic Command implementation<br>
 * - NIS2010-UserManagement에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author KyungBum Kim
 * @see UserManagementEventResponse,UserBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class UserBCImpl extends BasicCommandSupport implements UserBC {

	// Database Access Object
	private transient UserDAO dbDao = null;

	// MAIL Access Object
	private transient MailSendEAIDAO mailDao = null;
		
		
	/**
	 * $UserBCImpl 객체 생성<br>
	 * UserDBDAO를 생성한다.<br>
	 */
	public UserBCImpl() {
		dbDao = new UserDAO();
		mailDao = new  MailSendEAIDAO();
	}
	/**
	 * 조회 이벤트 처리<br>
	 *  User화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ComUserVO comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO searchComUserVO(ComUserVO comuservo, SignOnUserAccount account) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		DBRowSet rowSet = null;
		UserResponseContainerVO containerVO = new UserResponseContainerVO();
		try {
			rowSet = dbDao.searchComUserVO(comuservo, account);
			if(rowSet!=null){
				List<Object> list = RowSetUtil.rowSetToVOs(rowSet, ComUserVO .class);
				
				// add 2014.10.29
				list = decryptUsrPwd(list);
				
				containerVO.setComUserVO(list.toArray(new ComUserVO[list.size()]));
				containerVO.setEtcKey1("SEARCH ETC DATA1");
				containerVO.setEtcKey2("SEARCH ETC DATA2");
				//containerVO.setUsrMessage(new ErrorHandler("SPC00001",new String[]{"Schedule Information"}).getUserMessage());
			}
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		return containerVO;
	}
	
	
	/**
	 * 
	 * decryptUsrPwd
	 * @author KyungBum Kim
	 * @param list
	 * @return
	 * @throws EventException List<Object>
	 */
	public List<Object> decryptUsrPwd(List<Object> list) throws EventException {		
		ComUserVO comUserVO  = new ComUserVO();
		if( list != null && list.size() > 0 ){
				for(Object  vo : list ){					
					comUserVO = (ComUserVO )vo;	
					decryptUserPassword(comUserVO);
					checkUserLock(comUserVO);
				}
		}		
		return list;
	}
	
	/**
	 * 
	 * checkUserLock
	 * @author Jeong-Hoon, KIM
	 * @param comUserVO void
	 */
	void checkUserLock(ComUserVO comUserVO) {
		String userLockDate = comUserVO.getUsrLckDt();
		if(userLockDate != null && userLockDate.length() > 0){
			comUserVO.setLckChk("1");
		}else{
			comUserVO.setLckChk("0");
		}
	}
	/**
	 * 
	 * decryptUserPassword
	 * @author Jeong-Hoon, KIM
	 * @param comUserVO void
	 */
	void decryptUserPassword(ComUserVO comUserVO) {
		String decryptUsrPwd;
		if(comUserVO.getUsrPwd() != null && comUserVO.getUsrPwd().length() > 0){
			decryptUsrPwd =	CryptUtil.decryptString(comUserVO.getUsrPwd() );							
			if(decryptUsrPwd !=null){
				comUserVO.setUsrPwd(decryptUsrPwd);
				comUserVO.setUsrOldPwd(decryptUsrPwd);
			}
		}
	}
	
	/**
	 * Office 리스트 조회 <br>
	 * Office 리스트를 조회한다<br>
	 * 
	 * @param SignOnUserAccount account
	 * @param String rhq
	 * @param String arOfcCd
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchMdmOrganization(SignOnUserAccount account, String rhq, String arOfcCd) throws EventException{
		DBRowSet rowSet = null;
		try {
			rowSet = dbDao.searchMdmOrganization(account, rhq, arOfcCd);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		return rowSet;
	}
	
	
	/**
	 * 조회 이벤트 처리<br>
	 * User Program 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param String usrId
	 * @param String ofcCd
	 * @param String pgmNo
	 * @param String loginUsrId
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchUserProgramMapping(String usrId, String ofcCd, String pgmNo, String loginUsrId) throws EventException{
		DBRowSet rowSet = null;
		try {
			rowSet = dbDao.searchUserProgramMapping(usrId,ofcCd,pgmNo,loginUsrId);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		return rowSet;
	}
	

	
	/**
	 * 멀티 이벤트 처리<br>
	 * user 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUserVO[] comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO multiComUserVO(ComUserVO[] comuservo, SignOnUserAccount account) throws EventException{
		UserResponseContainerVO containerVO = new UserResponseContainerVO();
		try {
			validateData(comuservo);
			dbDao.multiComUserVO(comuservo, account);
			
			// Send E-Mail
			mailDao.sendEMail(comuservo);
			
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		containerVO.setEtcKey1("SAVE ETC DATA1");
		containerVO.setEtcKey2("SAVE ETC DATA2");
		containerVO.setUsrMessage(new ErrorHandler("TOT10003").getUserMessage());
		
		return containerVO;
	}
	
	/**
	 * 
	 * validateOffice
	 * @author Jeong-Hoon, KIM
	 * @param comuservos
	 * @throws EventException void
	 */
	private void validateData(ComUserVO[] comuservos) throws EventException {
		for(ComUserVO comUserVO : comuservos){
			String toBeValidatedOffcieCode = comUserVO.getOfcCd();
			String toBeValidatedUserId = comUserVO.getUsrId();
			String resultCount;
			String usrPwd;
			try {
				resultCount = dbDao.searchMdmOrganizationOfcCd(toBeValidatedOffcieCode);
				if("0".equals(resultCount)){
					throw new EventException("This Office ["+toBeValidatedOffcieCode+"] is not correct! Please Check it again.");
				}
							
				if (comUserVO.getIbflag().length() > 0) {
					if("I".equalsIgnoreCase(comUserVO.getIbflag()) || "U".equalsIgnoreCase(comUserVO.getIbflag())){
						usrPwd = dbDao.searchUserValidation(toBeValidatedUserId);
						if("I".equalsIgnoreCase(comUserVO.getIbflag())){
							if(!"".equalsIgnoreCase(usrPwd)){
								throw new EventException("This User ["+toBeValidatedUserId+"] is already registered! Please Check it again.");
							}
						} else if ("U".equalsIgnoreCase(comUserVO.getIbflag())){
							if( !"Y".equalsIgnoreCase(comUserVO.getUsrPwdChgFlg()) ){
								comUserVO.setUsrPwd(usrPwd);
							}
							comUserVO.setUsrOldPwd(usrPwd);
						}
					}
				}
			} catch (DAOException e) {
				log.error("err " + e.toString(), e);
				throw new EventException(e.getMessage());
			} catch (Exception de) {
				log.error("err " + de.toString(), de);
				throw new EventException(de.getMessage());
			}
		}
	}
	
	/**
	 * update 이벤트 처리<br>
	 * main 화면에 대한 update 이벤트 처리<br>
	 * 
	 * @param ComUserVO comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO updateComUsrMain(ComUserVO comuservo, SignOnUserAccount account) throws EventException{
		UserResponseContainerVO containerVO = new UserResponseContainerVO();
		try {
			dbDao.updateComUsrMain(comuservo, account);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		containerVO.setEtcKey1("SAVE ETC DATA1");
		containerVO.setEtcKey2("SAVE ETC DATA2");
		containerVO.setUsrMessage(new ErrorHandler("TOT10003").getUserMessage());
		
		return containerVO;
	}
	
	/**
	 * 멀티 이벤트 처리<br>
	 * User Match 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUsrPgmMtchVO[] comUsrPgmMtchVOs
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO multiComUsrPgmMtch(ComUsrPgmMtchVO[] comUsrPgmMtchVOs, SignOnUserAccount account) throws EventException{
		UserResponseContainerVO containerVO = new UserResponseContainerVO();
		try {
			dbDao.multiComUsrPgmMtch(comUsrPgmMtchVOs, account);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		containerVO.setUsrMessage(new ErrorHandler("TOT10003").getUserMessage());
		
		return containerVO;
		
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * User Info 화면 <br>
	 * 
	 * @param String usrId
	 * @return List<ComUserInfoVO>
	 * @exception EventException
	 */
	public List<ComUserInfoVO> comUsrInfo(String usrId) throws EventException{
		try {
			return dbDao.getComUsrInfo(usrId);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	
	/**
	 * 멀티 이벤트 처리<br>
	 * user 화면에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param ComUserVO[] comuservo
	 * @param SignOnUserAccount account
	 * @return UserResponseContainerVO
	 * @exception EventException
	 */
	public UserResponseContainerVO multiComUserPassHis(ComUserVO[] comuservo, SignOnUserAccount account) throws EventException{
		UserResponseContainerVO containerVO = new UserResponseContainerVO();
		try {
			
			// Step 1. Password His 저장
			dbDao.multiComUserPassHis(comuservo, account);
			
			// Step 2. User INFO에 수정
			dbDao.modifyUserPasswordInfo(comuservo, account);
			
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		containerVO.setEtcKey1("SAVE ETC DATA1");
		containerVO.setEtcKey2("SAVE ETC DATA2");
		containerVO.setUsrMessage(new ErrorHandler("TOT10003").getUserMessage());
		
		return containerVO;
	}
	
	

	/**
	 * 조회 이벤트 처리<br>
	 * User Info 화면에 대한 이벤트 처리<br>
	 * 
	 * @param String usrId
	 * @return List<SignOnUserAccount>
	 * @exception EventException
	 */
	public List<ComUserVO> searchUserPassHis(String usrId) throws EventException{
		
		try {
			return dbDao.getComUserPassHis(usrId);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		
	}
	
	
}