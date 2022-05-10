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
	 * Present a list of Carrier records.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object contains information to search query.
	 * @return a list of Carrier records.
	 * @exception EventException
	 */
	public List<CarrierListVO> searchCarrierListVO(CarrierListVO carrierListVO) throws EventException;
	

	/**
	 * Present a list of CarrierCode records.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object contains information to search query.
	 * @return a list of CarrierCode records.
	 * @exception EventException
	 */
	public List<CarrierListVO> searchCarrierCode(CarrierListVO carrierListVO) throws EventException;
	
	/**
	 * Present a list of RLaneCode records.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object contains information to search query.
	 * @return a list of RLaneCode records.
	 * @exception EventException
	 */
	public List<CarrierListVO> searchRLaneCode(CarrierListVO carrierListVO) throws EventException;
	
	/**
	 * Execute changes of carrier list from UI to server.<br>
	 * 
	 * @param carrierListVO a list of CarrierListVO objects contain information to search query.
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void modifyCarrierListVO(CarrierListVO[] carrierListVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * Present a list of Carrier records.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object contains information to search query.
	 * @return boolean
	 * @exception EventException
	 */
	public boolean checkDuplicateCarrierId(CarrierListVO carrierListVO) throws EventException;
}