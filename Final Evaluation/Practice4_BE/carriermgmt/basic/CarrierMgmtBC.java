/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtBC.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.20
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CustomerListVO;

/**
 * ALPS-Carrier Business Logic Command Interface<br>
 * - Interface to business logic for ALPS-Carrier<br>
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
	 * @param carrierListVO a CarrierListVO object.
	 * @return a list of CarrierCode records.
	 * @exception EventException
	 */
	public List<CarrierListVO> searchCarrierCode(CarrierListVO carrierListVO) throws EventException;

	/**
	 * Present a list of RLaneCode records.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object.
	 * @return a list of RLaneCode records.
	 * @exception EventException
	 */
	public List<CarrierListVO> searchRLaneCode(CarrierListVO carrierListVO) throws EventException;
	
	/**
	 * Present a list of CustCode records.<br>
	 * 
	 * @param customerListVO a CarrierListVO object.
	 * @return a list of CustCode records.
	 * @exception EventException
	 */
	public List<CustomerListVO> searchCustCode(CustomerListVO customerListVO) throws EventException;
	
	/**
	 * Execute changes of carrier list from UI to server.<br>
	 * 
	 * @param carrierListVO a list of CarrierListVO objects.
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void modifyCarrierListVO(CarrierListVO[] carrierListVO,SignOnUserAccount account) throws EventException;
	
	/**
	 * Check whether Carrier Code and RLane Code is duplicated.<br>
	 * 
	 * @param carrierListVO a CarrierListVO object.
	 * @return boolean
	 * @exception EventException
	 */
	public boolean checkDuplicateCarrier(CarrierListVO carrierListVO) throws EventException;
}