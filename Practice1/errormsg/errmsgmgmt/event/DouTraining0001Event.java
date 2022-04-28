/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DouTraining0001Event.java
*@FileTitle : Error Message Management
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.16
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.16 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo.ErrMsgVO;


/**
 * DOU_TRAINING_0001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  DOU_TRAINING_0001HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Viet Tran
 * @see DOU_TRAINING_0001HTMLAction 참조
 * @since J2EE 1.6
 */

public class DouTraining0001Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object inquiry condition and single case processing */
	ErrMsgVO errMsgVO = null;
	
	/** Table Value Object Multi Data processing */
	ErrMsgVO[] errMsgVOs = null;

	public DouTraining0001Event(){}
	
	public void setErrMsgVO(ErrMsgVO errMsgVO){
		this. errMsgVO = errMsgVO;
	}

	public void setErrMsgVOS(ErrMsgVO[] errMsgVOs){
		this. errMsgVOs = errMsgVOs;
	}

	public ErrMsgVO getErrMsgVO(){
		return errMsgVO;
	}

	public ErrMsgVO[] getErrMsgVOS(){
		return errMsgVOs;
	}

}