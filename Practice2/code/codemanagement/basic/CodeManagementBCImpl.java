/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CodeManagementBCImpl.java
*@FileTitle : Practice 02
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.22
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.22 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.training02.codemanagement.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.esm.clv.training02.codemanagement.integration.CodeManagementDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtDtlVO;

/**
 * ALPS-Training02 Business Logic Command Interface<br>
 * - ALPS-interface to business logic for Training02<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */
public class CodeManagementBCImpl extends BasicCommandSupport implements CodeManagementBC {

	// Database Access Object
	private transient CodeManagementDBDAO dbDao = null;

	/**
	 * Constructor of CodeManagementBCImpl.<br>
	 * 
	 */
	public CodeManagementBCImpl() {
		dbDao = new CodeManagementDBDAO();
	}
	
	/**
	 * search a list of CodeMgmtVO base on input conditions.<br>
	 * 
	 * @param codeMgmtVO a instance to save information of UI input conditions.
	 * @return a list of CodeMgmtVO
	 * @exception EventException
	 */
	public List<CodeMgmtVO> searchCodeMgmt(CodeMgmtVO codeMgmtVO) throws EventException {
		try {
			return dbDao.searchCodeMgmt(codeMgmtVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}

	 /**
		 * search a list of CodeMgmtDtlVO base on input conditions.
		 * 
		 * @param codeMgmtDtlVO a instance to save information of UI input conditions.
		 * @return List<CodeMgmtDtlVO>
		 * @exception EventException
		 */
	public List<CodeMgmtDtlVO> searchCodeMgmtDtl(CodeMgmtDtlVO codeMgmtDtlVO) throws EventException {
		try {
			return dbDao.searchCodeMgmtDtl(codeMgmtDtlVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
	/**
	 * [modifyCodeMgmt] 	to save modified CodeMgmtVO the change in database.<br>
	 * 
	 * @param CodeMgmtVO[]		codeMgmtVO
	 * @param SignOnUserAccount	account
	 * @exception EventException
	 */
	public void modifyCodeMgmt(CodeMgmtVO[] codeMgmtVO, SignOnUserAccount account) throws EventException{
		try {
			List<CodeMgmtVO> insertVoList = new ArrayList<CodeMgmtVO>();
			List<CodeMgmtVO> updateVoList = new ArrayList<CodeMgmtVO>();
			List<CodeMgmtVO> deleteVoList = new ArrayList<CodeMgmtVO>();
			
			for ( int i=0; i<codeMgmtVO .length; i++ ) {
				if ( codeMgmtVO[i].getIbflag().equals("I")){
					codeMgmtVO[i].setCreUsrId(account.getUsr_id());
					if(!checkDuplicateCodeId(codeMgmtVO[i]))
						insertVoList.add(codeMgmtVO[i]);
					else
						throw new DAOException(new ErrorHandler("ERR00002").getMessage());
				} else if ( codeMgmtVO[i].getIbflag().equals("U")){
					codeMgmtVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(codeMgmtVO[i]);
				} else if ( codeMgmtVO[i].getIbflag().equals("D")){
					deleteVoList.add(codeMgmtVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addCodeMgmtVOS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifyCodeMgmtVOS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removeCodeMgmtVOS(deleteVoList);
			}
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * [modifyCodeMgmtDtl] 	to save modified CodeMgmtDtlVO the change in database.<br>
	 * 
	 * @param CodeMgmtDtlVO[]	codeMgmtDtlVO
	 * @param SignOnUserAccount	account
	 * @exception EventException
	 */
	public void modifyCodeMgmtDtl(CodeMgmtDtlVO[] codeMgmtDtlVO, SignOnUserAccount account) throws EventException{
		try {
			List<CodeMgmtDtlVO> insertVoList = new ArrayList<CodeMgmtDtlVO>();
			List<CodeMgmtDtlVO> updateVoList = new ArrayList<CodeMgmtDtlVO>();
			List<CodeMgmtDtlVO> deleteVoList = new ArrayList<CodeMgmtDtlVO>();
			for ( int i=0; i<codeMgmtDtlVO .length; i++ ) {
				if ( codeMgmtDtlVO[i].getIbflag().equals("I")){
					codeMgmtDtlVO[i].setCreUsrId(account.getUsr_id());
					insertVoList.add(codeMgmtDtlVO[i]);
					if(!checkDuplicateCodeVal(codeMgmtDtlVO[i]))
						insertVoList.add(codeMgmtDtlVO[i]);
					else
						throw new DAOException(new ErrorHandler("ERR20002").getMessage());
				} else if ( codeMgmtDtlVO[i].getIbflag().equals("U")){
					codeMgmtDtlVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(codeMgmtDtlVO[i]);
				} else if ( codeMgmtDtlVO[i].getIbflag().equals("D")){
					deleteVoList.add(codeMgmtDtlVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addCodeMgmtDtlVOS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifyCodeMgmtDtlVOS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removeCodeMgmtDtlVOS(deleteVoList);
			}
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * [checkDuplicateCodeId] check whether Code Id is exist in table.<br>
	 * 
	 * @param CodeMgmtVO	codeMgmtVO
	 * @return boolean
	 * @exception EventException
	 */
	public boolean checkDuplicateCodeId(CodeMgmtVO codeMgmtVO) throws EventException{
		try{
			CodeMgmtVO codeId = new CodeMgmtVO();
			codeId.setIntgCdId(codeMgmtVO.getIntgCdId());
			List<CodeMgmtVO> listCodeMsg = dbDao.searchCodeMgmt(codeId);
			if(listCodeMsg.size() == 0)
				return false;
			return true;
		} catch(DAOException ex) {
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * [checkDuplicateCodeVal] 	check whether Code Val is exist in table.<br>
	 * 
	 * @param CodeMgmtDtlVO	codeMgmtDtlVO
	 * @return boolean
	 * @exception EventException
	 */
	public boolean checkDuplicateCodeVal(CodeMgmtDtlVO codeMgmtDtlVO) throws EventException{
		try{
			CodeMgmtDtlVO codeVal = new CodeMgmtDtlVO();
			codeVal.setIntgCdId(codeMgmtDtlVO.getIntgCdValCtnt());
			codeVal.setIntgCdValCtnt(codeMgmtDtlVO.getIntgCdValCtnt());
			List<CodeMgmtDtlVO> listCodeMsg = dbDao.searchCodeMgmtDtl(codeVal);
			if(listCodeMsg.size() == 0)
				return false;
			return true;
		} catch(DAOException ex) {
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
}

