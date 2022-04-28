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
 * - ALPS-Training02에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */
public class CodeManagementBCImpl extends BasicCommandSupport implements CodeManagementBC {

	// Database Access Object
	private transient CodeManagementDBDAO dbDao = null;

	/**
	 * CodeManagementBCImpl 객체 생성<br>
	 * CodeManagementDBDAO를 생성한다.<br>
	 */
	public CodeManagementBCImpl() {
		dbDao = new CodeManagementDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO codeMgmtVO
	 * @return List<CodeMgmtVO>
	 * @exception EventException
	 */
	public List<CodeMgmtVO> CodeMgmtVO(CodeMgmtVO codeMgmtVO) throws EventException {
		try {
			return dbDao.CodeMgmtVO(codeMgmtVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO codeMgmtVO
	 * @return List<CodeMgmtVO>
	 * @exception EventException
	 */
	public List<CodeMgmtDtlVO> CodeMgmtDtlVO(CodeMgmtDtlVO codeMgmtDtlVO) throws EventException {
		try {
			return dbDao.CodeMgmtDtlVO(codeMgmtDtlVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO[] codeMgmtVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void CodeMgmtVO(CodeMgmtVO[] codeMgmtVO, SignOnUserAccount account) throws EventException{
		try {
			List<CodeMgmtVO> insertVoList = new ArrayList<CodeMgmtVO>();
			List<CodeMgmtVO> updateVoList = new ArrayList<CodeMgmtVO>();
			List<CodeMgmtVO> deleteVoList = new ArrayList<CodeMgmtVO>();
			for ( int i=0; i<codeMgmtVO .length; i++ ) {
				if ( codeMgmtVO[i].getIbflag().equals("I")){
					codeMgmtVO[i].setCreUsrId(account.getUsr_id());
					insertVoList.add(codeMgmtVO[i]);
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
	
	public void CodeMgmtDtlVO(CodeMgmtDtlVO[] codeMgmtDtlVO, SignOnUserAccount account) throws EventException{
		try {
			List<CodeMgmtDtlVO> insertVoList = new ArrayList<CodeMgmtDtlVO>();
			List<CodeMgmtDtlVO> updateVoList = new ArrayList<CodeMgmtDtlVO>();
			List<CodeMgmtDtlVO> deleteVoList = new ArrayList<CodeMgmtDtlVO>();
			for ( int i=0; i<codeMgmtDtlVO .length; i++ ) {
				if ( codeMgmtDtlVO[i].getIbflag().equals("I")){
					codeMgmtDtlVO[i].setCreUsrId(account.getUsr_id());
					insertVoList.add(codeMgmtDtlVO[i]);
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
}