/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : ErrMsgMgmtBC.java
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

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo.ErrMsgVO;

/**
 * ALPS-Doutraining Business Logic Command Interface<br>
 * - ALPS-Doutraining에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */

public interface ErrMsgMgmtBC {

	/**
	 * [searchErrMsg] 	get a list of ErrMsgVO.<br>
	 * 
	 * @param ErrMsgVO 	errMsgVO
	 * @return List<ErrMsgVO>
	 * @exception EventException
	 */
	public List<ErrMsgVO> searchErrMsg(ErrMsgVO errMsgVO) throws EventException;
	
	/**
	 * [modifyErrMsg] modify ErrMsgVOs to save the change in database.<br>
	 * 
	 * @param ErrMsgVO[] errMsgVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void modifyErrMsg(ErrMsgVO[] errMsgVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * [checkDuplicateMsgCode] check whether error message code is exist in database.<br>
	 * 
	 * @param String errMsgVO
	 * @exception EventException
	 */
	public boolean checkDuplicateMsgCode(String errMsg) throws EventException;
}