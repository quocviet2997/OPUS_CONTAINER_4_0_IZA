/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : FnsDou0004Event.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.event;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;


/**
 * DOU_TRAINING_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - Created from DOU_TRAINING_0004HTMLAction<br>
 * - Used as PDTO delivered to ServiceCommand Layer<br>
 *
 * @author Viet Tran
 * @see FNS_DOU_0004HTMLAction
 * @since J2EE 1.6
 */

public class FnsDou0004Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object search condition and single event processing */
	CarrierListVO carrierListVO = null;
	
	/** Process Table Value Object Multi Data */
	CarrierListVO[] carrierListVOs = null;

	/**
	 * Constructor of FnsDou0004Even<br>
	 */
	public FnsDou0004Event(){}
	
	/**
	 * Set a carrierListVO object to CarrierListVO field in DouTraining0004Event<br>
	 * 
	 * @param carrierListVO a carrierListVO object
	 */
	public void setCarrierListVO(CarrierListVO carrierListVO){
		this. carrierListVO = carrierListVO;
	}

	/**
	 * Set a list of carrierListVO object to CarrierListVOS field in DouTraining0004Event<br>
	 * 
	 * @param carrierListVOs a list of carrierListVO object
	 */
	public void setCarrierListVOS(CarrierListVO[] carrierListVOs){
		this. carrierListVOs = carrierListVOs;
	}

	/**
	 * Get a carrierListVO object from DouTraining0004Event<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public CarrierListVO getCarrierListVO(){
		return carrierListVO;
	}

	/**
	 * Get list of carrierListVO object from DouTraining0004Event<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public CarrierListVO[] getCarrierListVOS(){
		return carrierListVOs;
	}

}