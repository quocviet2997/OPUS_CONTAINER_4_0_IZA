/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0D1Event.java
*@FileTitle : Surcharge
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.tax.event;

import com.clt.bizcommon.tax.vo.ComTaxVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0D1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0D1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEnsT01Event extends EventSupport {

	private static final long serialVersionUID = 1L;

	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComTaxVO comTaxVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private ComTaxVO[] comTaxVOs = null;
	
	public ComEnsT01Event(){}
	
	public void setComTaxVO(ComTaxVO comTaxVO){
		this. comTaxVO = comTaxVO;
	}

	public void setComTaxVOS(ComTaxVO[] comTaxVOs){
		if (comTaxVOs != null) {
			ComTaxVO[] tmpVOs = new ComTaxVO[comTaxVOs.length];
			System.arraycopy(comTaxVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.comTaxVOs = tmpVOs;
		}
	}

	public ComTaxVO getComTaxVO(){
		return comTaxVO;
	}

	public ComTaxVO[] getComTaxVOS(){
		ComTaxVO[] tmpVOs = null;
		if (this.comTaxVOs != null) {
			tmpVOs = new ComTaxVO[comTaxVOs.length];
			System.arraycopy(comTaxVOs, 0, tmpVOs, 0, tmpVOs.length);
		}
		return tmpVOs;
	}
}
