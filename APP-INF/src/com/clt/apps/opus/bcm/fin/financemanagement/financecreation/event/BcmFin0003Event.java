/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmFin0003Event.java
*@FileTitle : AR Master Revenue VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.10 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArMasterRevenueVvdListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0003 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0003HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0003HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0003Event  extends EventSupport{
	
	private static final long serialVersionUID = 1L;
	
	/** Revenue Year Month */
	private String revYrmon = "";
	
	/** Vessel code */
	private String vslCd = "";
	
	/** Rlane Dir Code */
	private String vvd = "";
	
	/** Slane Code */
	private String slanCd = "";
	
	/** Revenue Port Code */
	private String revPortCd = "";
	
	/** Rlane code */
	private String rlaneCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchArMasterRevenueVvdListVO searchArMasterRevenueVvdListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs = null;
	
	public SearchArMasterRevenueVvdListVO getSearchArMasterRevenueVvdListVO() {
		return searchArMasterRevenueVvdListVO;
	}
	
	public void setSearchArMasterRevenueVvdListVO(
			SearchArMasterRevenueVvdListVO searchArMasterRevenueVvdListVO) {
		this.searchArMasterRevenueVvdListVO = searchArMasterRevenueVvdListVO;
	}
	
	public SearchArMasterRevenueVvdListVO[] getSearchArMasterRevenueVvdListVOs() {
		//return searchArMasterRevenueVvdListVOs;
		SearchArMasterRevenueVvdListVO[] rtnVOs = null;
		if(this.searchArMasterRevenueVvdListVOs != null) {
			rtnVOs = new SearchArMasterRevenueVvdListVO[searchArMasterRevenueVvdListVOs.length];
			System.arraycopy(searchArMasterRevenueVvdListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchArMasterRevenueVvdListVOs(
			SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs) {
		//this.searchArMasterRevenueVvdListVOs = searchArMasterRevenueVvdListVOs;
		if(searchArMasterRevenueVvdListVOs != null) {
			SearchArMasterRevenueVvdListVO[] tmpVOs = new SearchArMasterRevenueVvdListVO[searchArMasterRevenueVvdListVOs.length];
			System.arraycopy(searchArMasterRevenueVvdListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchArMasterRevenueVvdListVOs = tmpVOs;
		}
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
	
	public String getVvd() {
		return vvd;
	}
	
	public void setVvd(String vvd) {
		this.vvd = vvd;
	}
	
	public String getSlanCd() {
		return slanCd;
	}
	
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	public String getRevPortCd() {
		return revPortCd;
	}
	
	public void setRevPortCd(String revPortCd) {
		this.revPortCd = revPortCd;
	}
	
	public String getRlaneCd() {
		return rlaneCd;
	}
	
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
}
