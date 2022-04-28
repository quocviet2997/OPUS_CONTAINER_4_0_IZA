/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : JooCarrierMgmtBC.java
*@FileTitle : Joo Carrier Management
*Open Issues :
*Change history :
*@LastModifyDate : 2019.03.26
*@LastModifier : Tu.Nguyen
*@LastVersion : 1.0
* 2019.03.26 Tu.Nguyen
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.fns.joo.training.joocarriermgmt.basic;

import java.util.List;

import com.clt.apps.opus.fns.joo.training.joocarriermgmt.vo.JooCarrierVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * ALPS-Training Business Logic Command Interface<br>
 * - ALPS-Training에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Tu.Nguyen
 * @since J2EE 1.6
 */

public interface JooCarrierMgmtBC {

	/**
	 * This method for searching Joo Carrier list when click retrieve button
	 * 
	 * @param JooCarrierVO	jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchJooCarrierList(JooCarrierVO jooCarrierVO) throws EventException;
	
	/**
	 * This method for searching RD Lane Code list for dropdown list
	 * 
	 * @param JooCarrierVO	jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchRLaneCd(JooCarrierVO jooCarrierVO) throws EventException;
	
	/**
	 * This method for searching Carrier Code list for dropdown list
	 * 
	 * @param JooCarrierVO	jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchCrrCd(JooCarrierVO jooCarrierVO) throws EventException;
	
	/**
	 * This method for managing such as insert, update, delete JOO Carrier
	 * 
	 * @param JooCarrierVO[] jooCarrierVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void manageJooCarrier(JooCarrierVO[] jooCarrierVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * search vendor code for validation check
	 * 
	 * @param JooCarrierVO	jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchVndrCd(JooCarrierVO jooCarrierVO) throws EventException;
	
	/**
	 * search customer code for validation check
	 * 
	 * @param JooCarrierVO	jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchCusCd(JooCarrierVO jooCarrierVO) throws EventException;
	
	/**
	 * search customer code for validation check
	 * 
	 * @param JooCarrierVO	jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchTrdCd(JooCarrierVO jooCarrierVO) throws EventException;
}