/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CodeManagementBC.java
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

import java.util.List;
import com.clt.framework.core.layer.event.EventException;
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

public interface CodeManagementBC {

	/**
	 * search a list of CodeMgmtVO base on input conditions.<br>
	 * 
	 * @param codeMgmtVO a instance to save information of UI input conditions.
	 * @return a list of CodeMgmtVO
	 * @exception EventException
	 */
	public List<CodeMgmtVO> searchCodeMgmt(CodeMgmtVO codeMgmtVO) throws EventException;

	/**
	 * search a list of CodeMgmtDtlVO base on input conditions.
	 * 
	 * @param codeMgmtDtlVO a instance to save information of UI input conditions.
	 * @return List<CodeMgmtDtlVO>
	 * @exception EventException
	 */
	public List<CodeMgmtDtlVO> searchCodeMgmtDtl(CodeMgmtDtlVO codeMgmtDtlVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO[] codeMgmtVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void modifyCodeMgmt(CodeMgmtVO[] codeMgmtVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO[] codeMgmtVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void modifyCodeMgmtDtl(CodeMgmtDtlVO[] codeMgmtDtlVO,SignOnUserAccount account) throws EventException;
	
	public boolean checkDuplicateCodeId(CodeMgmtVO codeMgmtVO) throws EventException;
	
	public boolean checkDuplicateCodeVal(CodeMgmtDtlVO codeMgmtDtlVO) throws EventException;
}