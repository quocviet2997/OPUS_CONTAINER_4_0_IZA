/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0N1Event.java
*@FileTitle : Carrier
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.carrier.event;

import com.clt.bizcommon.carrier.vo.CarrierListVO;
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
public class ComEns0N1Event extends EventSupport {

	/** Table Value Object 조회 조건 및 단건 처리  */
	private CarrierListVO	carrierListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private CarrierListVO[] carrierListVOs = null;
	
    private int iPage = 0;

	/**
	 * Constructor<br>
	 */
	public ComEns0N1Event(){}

	/**
	 * Constructor<br>
	 * @param int iPage
	 */
	public ComEns0N1Event(int iPage) {
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
		return "ComEns0N1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0N1Event";
	}

	/**
	 * @return the carrierListVO
	 */
	public CarrierListVO getCarrierListVO() {
		return carrierListVO;
	}

	/**
	 * @param carrierListVO the carrierListVO to set
	 */
	public void setCarrierListVO(CarrierListVO carrierListVO) {
		this.carrierListVO = carrierListVO;
	}

	/**
	 * @return the carrierListVOs
	 */
	public CarrierListVO[] getCarrierListVOs() {
		CarrierListVO[] rtnVOs = null;
		if (this.carrierListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(carrierListVOs, carrierListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param carrierListVOs the carrierListVOs to set
	 */
	public void setCarrierListVOs(CarrierListVO[] carrierListVOs){
		if(carrierListVOs != null){
			CarrierListVO[] tmpVOs = java.util.Arrays.copyOf(carrierListVOs, carrierListVOs.length);
			this.carrierListVOs = tmpVOs;
		}
	}

}
