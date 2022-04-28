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
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO	codeMgmtVO
	 * @return List<CodeMgmtVO>
	 * @exception EventException
	 */
	public List<CodeMgmtVO> CodeMgmtVO(CodeMgmtVO codeMgmtVO) throws EventException;

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO	codeMgmtVO
	 * @return List<CodeMgmtVO>
	 * @exception EventException
	 */
	public List<CodeMgmtDtlVO> CodeMgmtDtlVO(CodeMgmtDtlVO codeMgmtDtlVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO[] codeMgmtVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void CodeMgmtVO(CodeMgmtVO[] codeMgmtVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CodeMgmtVO[] codeMgmtVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void CodeMgmtDtlVO(CodeMgmtDtlVO[] codeMgmtDtlVO,SignOnUserAccount account) throws EventException;
}