/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmFin0005Event.java
*@FileTitle : GL Estimate Revenue VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.10 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchGlEstimateRevenueVvdListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0005 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0005HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0005HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0005Event extends EventSupport{
	private static final long serialVersionUID = 1L;
	
	private String exeYrmon = null;
	
	private String revYrmon = null;
	
	private String vslCd = null;
	
	private String skdVoyNo = null;
	
	private String skdDirCd = null;
	
	private String revDirCd = null;
	
	private String estmVvdTpCd = null;
	
	private String estmIocDivCd = null;
	
	private String estmBcDivCd = null;
	
	private String vvd = null;
	
	private SearchGlEstimateRevenueVvdListVO searchGlEstimateRevenueVvdListVO = null;
	
	private SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs = null;
	
	public String getEstmBcDivCd() {
		return estmBcDivCd;
	}
	
	public void setEstmBcDivCd(String estmBcDivCd) {
		this.estmBcDivCd = estmBcDivCd;
	}
	
	public String getEstmIocDivCd() {
		return estmIocDivCd;
	}
	
	public void setEstmIocDivCd(String estmIocDivCd) {
		this.estmIocDivCd = estmIocDivCd;
	}
	
	public String getVvd() {
		return vvd;
	}
	
	public void setVvd(String vvd) {
		this.vvd = vvd;
	}
	
	public String getExeYrmon() {
		return exeYrmon;
	}
	
	public void setExeYrmon(String exeYrmon) {
		this.exeYrmon = exeYrmon;
	}
	
	public String getRevYrmon() {
		return revYrmon;
	}
	
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
	}
	
	public String getVslCd() {
		return vslCd;
	}
	
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	public String getSkdVoyNo() {
		return skdVoyNo;
	}
	
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	public String getSkdDirCd() {
		return skdDirCd;
	}
	
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	public String getRevDirCd() {
		return revDirCd;
	}
	
	public void setRevDirCd(String revDirCd) {
		this.revDirCd = revDirCd;
	}
	
	public String getEstmVvdTpCd() {
		return estmVvdTpCd;
	}
	
	public void setEstmVvdTpCd(String estmVvdTpCd) {
		this.estmVvdTpCd = estmVvdTpCd;
	}
	
	public SearchGlEstimateRevenueVvdListVO getSearchGlEstimateRevenueVvdListVO() {
		return searchGlEstimateRevenueVvdListVO;
	}
	
	public void setSearchGlEstimateRevenueVvdListVO(
			SearchGlEstimateRevenueVvdListVO searchGlEstimateRevenueVvdListVO) {
		this.searchGlEstimateRevenueVvdListVO = searchGlEstimateRevenueVvdListVO;
	}
	
	public SearchGlEstimateRevenueVvdListVO[] getSearchGlEstimateRevenueVvdListVOs() {
		//return searchGlEstimateRevenueVvdListVOs;
		SearchGlEstimateRevenueVvdListVO[] rtnVOs = null;
		if(this.searchGlEstimateRevenueVvdListVOs != null) {
			rtnVOs = new SearchGlEstimateRevenueVvdListVO[searchGlEstimateRevenueVvdListVOs.length];
			System.arraycopy(searchGlEstimateRevenueVvdListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchGlEstimateRevenueVvdListVOs(
			SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs) {
		//this.searchGlEstimateRevenueVvdListVOs = searchGlEstimateRevenueVvdListVOs;
		if(searchGlEstimateRevenueVvdListVOs != null) {
			SearchGlEstimateRevenueVvdListVO[] tmpVOs = new SearchGlEstimateRevenueVvdListVO[searchGlEstimateRevenueVvdListVOs.length];
			System.arraycopy(searchGlEstimateRevenueVvdListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchGlEstimateRevenueVvdListVOs = tmpVOs;
		}
	}
}
