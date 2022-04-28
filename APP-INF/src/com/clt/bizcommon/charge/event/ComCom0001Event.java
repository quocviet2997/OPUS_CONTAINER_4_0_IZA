/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_COM_0001Event.java
*@FileTitle : Charge
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-20
*@LastModifier : JunBum Lee
*@LastVersion : 1.0
* 2012-02-20 JunBum Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.charge.event;

import com.clt.bizcommon.charge.vo.ChargeListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0N1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0N1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0001Event extends EventSupport {

	/** Table Value Object 조회 조건 및 단건 처리  */
	private ChargeListVO	chargeListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private ChargeListVO[] chargeListVOs = null;
	
    private int iPage = 0;

	/**
	 * Constructor<br>
	 */
	public ComCom0001Event(){}

	/**
	 * Constructor<br>
	 * @param int iPage
	 */
	public ComCom0001Event(int iPage) {
		this.iPage = iPage;
    }
	
	/**
	 * Page No 반환<br>
	 * @return
	 */
	public int getIPage() {
		return iPage;
	}

	/**
	 * Page No 세팅<br>
	 * @param page
	 */
	public void setIPage(int page) {
		iPage = page;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComCom0001Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComCom0001Event";
	}

	/**
	 * @return the chargeListVO
	 */
	public ChargeListVO getChargeListVO() {
		return chargeListVO;
	}

	/**
	 * @param chargeListVO the chargeListVO to set
	 */
	public void setChargeListVO(ChargeListVO chargeListVO) {
		this.chargeListVO = chargeListVO;
	}

	/**
	 * @return the chargeListVOs
	 */
	public ChargeListVO[] getChargeListVOs() {
		ChargeListVO[] rtnVOs = null;
		if (this.chargeListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(chargeListVOs, chargeListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param chargeListVOs the chargeListVOs to set
	 */
	public void setChargeListVOs(ChargeListVO[] chargeListVOs){
		if(chargeListVOs != null){
			ChargeListVO[] tmpVOs = java.util.Arrays.copyOf(chargeListVOs, chargeListVOs.length);
			this.chargeListVOs = tmpVOs;
		}
	}

}
