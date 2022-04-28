/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0008Event.java
*@FileTitle : CUSTOMER SCHEDULE EDI SETUP
*Open Issues :
*Change history :
*@LastModifyDate : 2016.02.24
*@LastModifier : S.W. KIM
*@LastVersion : 1.0
* 2016.02.24 S.W. KIM
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.CargoStatusForCustomerVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0008 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0008HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Sung Wook Kim
 * @see BCM_SUP_0008HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0008Event extends EventSupport {
	
private static final long serialVersionUID = 1L;

	/** Original EDI Status Code */
	private String orgEdiStsCd = "";
	
	/** Pre EDI Group Code */
	private String preEdiGrpCd = "";
	
	/** Post EDI Group Code */
	private String pstEdiGrpCd = "";
	
	/** EDI Standard Status Code for input validation */
	private String ediStndStsCd = "";
	
	/** EDI Group Code for input validation */
	private String ediGrpCd = "";
	
	/** Corporation Division Code for input validation */
	private String coDivCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private CargoStatusForCustomerVO cargoStatusForCustomerVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private CargoStatusForCustomerVO[] cargoStatusForCustomerVOs = null;
	
	
	public BcmSup0008Event(){}
	
	public void setCargoStatusForCustomerVO(CargoStatusForCustomerVO cargoStatusForCustomerVO){
		this.cargoStatusForCustomerVO = cargoStatusForCustomerVO;
	}
	
	public CargoStatusForCustomerVO getCargoStatusForCustomerVO(){
		return cargoStatusForCustomerVO;
	}

	public void setCargoStatusForCustomerVOS(CargoStatusForCustomerVO[] cargoStatusForCustomerVOs){
		if(cargoStatusForCustomerVOs != null){
			CargoStatusForCustomerVO[] tmpVOs = Arrays.copyOf(cargoStatusForCustomerVOs, cargoStatusForCustomerVOs.length);
			this.cargoStatusForCustomerVOs = tmpVOs;
		}
	}

	public CargoStatusForCustomerVO[] getCargoStatusForCustomerVOS(){
		CargoStatusForCustomerVO[] rtnVOs = null;
		if (this.cargoStatusForCustomerVOs != null) {
			rtnVOs = Arrays.copyOf(cargoStatusForCustomerVOs, cargoStatusForCustomerVOs.length);
		}
		return rtnVOs;
	}

	public String getOrgEdiStsCd() {
		return orgEdiStsCd;
	}

	public void setOrgEdiStsCd(String orgEdiStsCd) {
		this.orgEdiStsCd = orgEdiStsCd;
	}

	public String getPreEdiGrpCd() {
		return preEdiGrpCd;
	}

	public void setPreEdiGrpCd(String preEdiGrpCd) {
		this.preEdiGrpCd = preEdiGrpCd;
	}

	public String getPstEdiGrpCd() {
		return pstEdiGrpCd;
	}

	public void setPstEdiGrpCd(String pstEdiGrpCd) {
		this.pstEdiGrpCd = pstEdiGrpCd;
	}

	public String getEdiStndStsCd() {
		return ediStndStsCd;
	}

	public void setEdiStndStsCd(String ediStndStsCd) {
		this.ediStndStsCd = ediStndStsCd;
	}

	public String getEdiGrpCd() {
		return ediGrpCd;
	}

	public void setEdiGrpCd(String ediGrpCd) {
		this.ediGrpCd = ediGrpCd;
	}

	public String getCoDivCd() {
		return coDivCd;
	}

	public void setCoDivCd(String coDivCd) {
		this.coDivCd = coDivCd;
	}
}
