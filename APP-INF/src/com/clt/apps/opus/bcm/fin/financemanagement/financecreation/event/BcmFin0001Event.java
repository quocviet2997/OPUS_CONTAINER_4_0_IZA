/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmFin0001Event.java
*@FileTitle : AP PERIOD
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchApPeriodListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0001HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0001HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmFin0001Event extends EventSupport {
	
	private static final long serialVersionUID = 1L;
	
	/** System Division Code */
	private String sysDivCd = "";
	
	/** Effective Year Month */
	private String effYrmon = "";
	
	/** Office Code */
	private String ofcCd = "";
	
	/** A/R A/P Division Code */
	private String arApDivCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchApPeriodListVO searchApPeriodListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchApPeriodListVO[] searchApPeriodListVOs = null;
	
	
	public BcmFin0001Event(){}
	
	public void setSearchApPeriodListVO(SearchApPeriodListVO searchApPeriodListVO){
		this.searchApPeriodListVO = searchApPeriodListVO;
	}
	
	public SearchApPeriodListVO getSearchApPeriodListVO(){
		return searchApPeriodListVO;
	}

	public void setSearchApPeriodListVOS(SearchApPeriodListVO[] searchApPeriodListVOs){
		//this.searchApPeriodListVOs = searchApPeriodListVOs;
		if(searchApPeriodListVOs != null) {
			SearchApPeriodListVO[] tmpVOs = new SearchApPeriodListVO[searchApPeriodListVOs.length];
			System.arraycopy(searchApPeriodListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchApPeriodListVOs = tmpVOs;
		}
	}

	public SearchApPeriodListVO[] getSearchApPeriodListVOS(){
		//return searchApPeriodListVOs;
		SearchApPeriodListVO[] rtnVOs = null;
		if(this.searchApPeriodListVOs != null) {
			rtnVOs = new SearchApPeriodListVO[searchApPeriodListVOs.length];
			System.arraycopy(searchApPeriodListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setSysDivCd(String sysDivCd) {
		this.sysDivCd = sysDivCd;
	}
	
	public String getSysDivCd() {
		return sysDivCd;
	}

	public void setEffYrmon(String effYrmon) {
		this.effYrmon = effYrmon;
	}
	
	public String getEffYrmon() {
		return effYrmon;
	}
	
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	public String getOfcCd() {
		return ofcCd;
	}
	
	public void setArApDivCd(String arApDivCd) {
		this.arApDivCd = arApDivCd;
	}
	
	public String getArApDivCd() {
		return arApDivCd;
	}

}
