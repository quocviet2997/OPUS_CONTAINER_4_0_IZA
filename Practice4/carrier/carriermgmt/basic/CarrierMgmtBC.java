/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtBC.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.basic;

import java.util.List;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;

/**
 * ALPS-Carrier Business Logic Command Interface<br>
 * - ALPS-Carrier에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */

public interface CarrierMgmtBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CarrierListVO	carrierListVO
	 * @return List<CarrierListVO>
	 * @exception EventException
	 */
	public List<CarrierListVO> CarrierListVO(CarrierListVO carrierListVO) throws EventException;
	

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CarrierListVO	carrierListVO
	 * @return List<CarrierListVO>
	 * @exception EventException
	 */
	public List<CarrierListVO> searchCarrierCode(CarrierListVO carrierListVO) throws EventException;
	

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CarrierListVO	carrierListVO
	 * @return List<CarrierListVO>
	 * @exception EventException
	 */
	public List<CarrierListVO> searchRLaneCode(CarrierListVO carrierListVO) throws EventException;
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param CarrierListVO[] carrierListVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void CarrierListVO(CarrierListVO[] carrierListVO,SignOnUserAccount account) throws EventException;
}