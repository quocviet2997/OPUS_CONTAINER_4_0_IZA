/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DouTraining0004Event.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;


/**
 * DOU_TRAINING_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  DOU_TRAINING_0004HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Viet Tran
 * @see DOU_TRAINING_0004HTMLAction 참조
 * @since J2EE 1.6
 */

public class DouTraining0004Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object search condition and single event processing */
	CarrierListVO carrierListVO = null;
	
	/** Process Table Value Object Multi Data */
	CarrierListVO[] carrierListVOs = null;

	public DouTraining0004Event(){}
	
	public void setCarrierListVO(CarrierListVO carrierListVO){
		this. carrierListVO = carrierListVO;
	}

	public void setCarrierListVOS(CarrierListVO[] carrierListVOs){
		this. carrierListVOs = carrierListVOs;
	}

	public CarrierListVO getCarrierListVO(){
		return carrierListVO;
	}

	public CarrierListVO[] getCarrierListVOS(){
		return carrierListVOs;
	}

}