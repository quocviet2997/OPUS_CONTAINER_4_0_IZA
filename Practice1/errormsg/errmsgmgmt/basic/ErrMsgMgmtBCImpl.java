/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : ErrMsgMgmtBCImpl.java
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.16 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.basic;

import java.util.ArrayList;
import java.util.List;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.integration.ErrMsgMgmtDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * ALPS-DouTraining Business Logic Command Interface<br>
 * - ALPS-DouTraining에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */
public class ErrMsgMgmtBCImpl extends BasicCommandSupport implements ErrMsgMgmtBC {

	// Database Access Object
		// transient:??
	private transient ErrMsgMgmtDBDAO dbDao = null;

	/**
	 * ErrMsgMgmtBCImpl constructor function<br>
	 * constructor ErrMsgMgmtDBDAO<br>
	 */
	public ErrMsgMgmtBCImpl() {
		dbDao = new ErrMsgMgmtDBDAO();
	}
	
	/**
	 * [searchErrMsg] 	get a list of ErrMsgVO.<br>
	 * 
	 * @param ErrMsgVO 	errMsgVO
	 * @return List<ErrMsgVO>
	 * @exception EventException
	 */
	public List<ErrMsgVO> searchErrMsg(ErrMsgVO errMsgVO) throws EventException {
		try {
			// get a list of ErrMsgVO
			return dbDao.searchErrMsg(errMsgVO);
		} catch(DAOException ex) {
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
	/**
	 * [modifyErrMsg] modify ErrMsgVOs to save the change in database.<br>
	 * 
	 * @param ErrMsgVO[] errMsgVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void modifyErrMsg(ErrMsgVO[] errMsgVO, SignOnUserAccount account) throws EventException{
		try {
			// List ErrMsgVO for insert
			List<ErrMsgVO> insertVoList = new ArrayList<ErrMsgVO>();
			// List ErrMsgVO for update
			List<ErrMsgVO> updateVoList = new ArrayList<ErrMsgVO>();
			// List ErrMsgVO for delete
			List<ErrMsgVO> deleteVoList = new ArrayList<ErrMsgVO>();
			
			for ( int i=0; i<errMsgVO .length; i++ ) {
				// if Ibflag is
					// D. Add that ErrMsgVO to deleteVoList
					// U. Add that ErrMsgVO to updateVoList
					// I. Add that ErrMsgVO to insertVoList
				if ( errMsgVO[i].getIbflag().equals("D")){
					deleteVoList.add(errMsgVO[i]);
				}else if ( errMsgVO[i].getIbflag().equals("U")){
					errMsgVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(errMsgVO[i]);
				}else if ( errMsgVO[i].getIbflag().equals("I")){
					errMsgVO[i].setCreUsrId(account.getUsr_id());
					if(!checkDuplicateMsgCode(errMsgVO[i].getErrMsgCd())){
						insertVoList.add(errMsgVO[i]);
					}
					else{
						throw new DAOException(new ErrorHandler("ERR00001").getMessage());
					}
				}
			}
			
			if ( deleteVoList.size() > 0 ) {
				// remove ErrMsgVOs in deleteVoList on table in database
				dbDao.removeErrMsgVOS(deleteVoList);
			}
			
			if ( insertVoList.size() > 0 ) {
				// insert ErrMsgVOs in insertVoList on table in database
				dbDao.addErrMsgVOS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				// update ErrMsgVOs in updateVoList on table in database
				dbDao.modifyErrMsgVOS(updateVoList);
			}
			
			
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * [checkDuplicateMsgCode] check whether error message code is exist in table.<br>
	 * 
	 * @param String errMsgVO
	 * @exception EventException
	 */
	public boolean checkDuplicateMsgCode(String errMsg) throws EventException{
		try{
			ErrMsgVO errMsgVO = new ErrMsgVO();
			errMsgVO.setErrMsgCd(errMsg);
			List<ErrMsgVO> listErrMsg = dbDao.searchErrMsg(errMsgVO);
			if(listErrMsg.size() == 0)
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