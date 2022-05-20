/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : MrmCusPopupEvent.java
*@FileTitle : Customer List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.20
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.customercd.event;

import com.clt.framework.core.controller.html.HTMLActionException;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CustomerListVO;


/**
 * DOU_TRAINING_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - Created from DOU_TRAINING_0004HTMLAction<br>
 * - Used as PDTO delivered to ServiceCommand Layer<br>
 *
 * @author Viet Tran
 * @see MRM_CUS_POPUPHTMLAction
 * @since J2EE 1.6
 */

public class MrmCusPopupEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object search condition and single event processing */
	CustomerListVO customerListVO = null;
	
	/** Value Object of cust_cnt_cd */
    String cust_cnt_cd = "";
    
    /** Value Object of cust_seq */
    String cust_seq = "";
    
	public MrmCusPopupEvent(){}
	
	/**
	 * Get value of cust_cnt_cd<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public String getCustCntCd() {
		return cust_cnt_cd;
	}

	/**
	 * Set value for cust_seq<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public void setCustCntCd(String cust_cnt_cd) {
		this.cust_cnt_cd = cust_cnt_cd;
	}

	/**
	 * Get value of cust_seq<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public String getCustSeq() {
		return cust_seq;
	}

	/**
	 * Set value for cust_seq<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public void setCustSeq(String cust_seq) {
		this.cust_seq = cust_seq;
	}
	
	/**
	 * Set a carrierListVO object to CarrierListVO field in DouTraining0004Event<br>
	 * 
	 * @param carrierListVO a carrierListVO object
	 */
	public void setCustomerListVO(CustomerListVO customerListVO){
		this. customerListVO = customerListVO;
	}

	/**
	 * Get a carrierListVO object from DouTraining0004Event<br>
	 * 
	 * @return CarrierListVO[].
	 */
	public CustomerListVO getCustomerListVO(){
		return customerListVO;
	}
}