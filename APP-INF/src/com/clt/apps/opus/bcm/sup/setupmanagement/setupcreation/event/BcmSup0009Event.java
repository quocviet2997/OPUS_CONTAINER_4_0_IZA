/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0009Event.java
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

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.CargoStatusForUSReleaseVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0009 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0009HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Sung Wook Kim
 * @see BCM_SUP_0009HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0009Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** EDI Original Status Code */
	private String ediOrgStsCd = "";
	
	/** EDI Standard Status Code for input validation */
	private String ediStndStsCd = "";
	
	/** EDI Group Code for input validation */
	private String ediGrpCd = "";
	
	/** Corporation Division Code for input validation */
	private String coDivCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private CargoStatusForUSReleaseVO cargoStatusForUSReleaseVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private CargoStatusForUSReleaseVO[] cargoStatusForUSReleaseVOs = null;
	
	
	public BcmSup0009Event(){}
	
	public void setCargoStatusForUSReleaseVO(CargoStatusForUSReleaseVO cargoStatusForUSReleaseVO){
		this.cargoStatusForUSReleaseVO = cargoStatusForUSReleaseVO;
	}
	
	public CargoStatusForUSReleaseVO getCargoStatusForUSReleaseVO(){
		return cargoStatusForUSReleaseVO;
	}

	public void setCargoStatusForUSReleaseVOS(CargoStatusForUSReleaseVO[] cargoStatusForUSReleaseVOs){
		if(cargoStatusForUSReleaseVOs != null){
			CargoStatusForUSReleaseVO[] tmpVOs = Arrays.copyOf(cargoStatusForUSReleaseVOs, cargoStatusForUSReleaseVOs.length);
			this.cargoStatusForUSReleaseVOs = tmpVOs;
		}
	}

	public CargoStatusForUSReleaseVO[] getCargoStatusForUSReleaseVOS(){
		CargoStatusForUSReleaseVO[] rtnVOs = null;
		if (this.cargoStatusForUSReleaseVOs != null) {
			rtnVOs = Arrays.copyOf(cargoStatusForUSReleaseVOs, cargoStatusForUSReleaseVOs.length);
		}
		return rtnVOs;
	}

	public String getEdiOrgStsCd() {
		return ediOrgStsCd;
	}

	public void setEdiOrgStsCd(String ediOrgStsCd) {
		this.ediOrgStsCd = ediOrgStsCd;
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
