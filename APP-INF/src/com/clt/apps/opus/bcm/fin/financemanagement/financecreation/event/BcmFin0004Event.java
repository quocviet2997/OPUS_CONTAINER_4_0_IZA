/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmFin0004Event.java
*@FileTitle : AR Route Rank
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.10 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArRouteRankListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0004HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0004HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0004Event  extends EventSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String slanCd = null;
	
	private String rlaneCd = null;
	
	private String deltFlg = null;
	
	private SearchArRouteRankListVO searchArRouteRankListVO = null;
	
	private SearchArRouteRankListVO[] searchArRouteRankListVOs = null;
	
	public String getSlanCd() {
		return slanCd;
	}
	
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	public String getRlaneCd() {
		return rlaneCd;
	}
	
	public String getDeltFlg() {
		return deltFlg;
	}
	
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	public SearchArRouteRankListVO getSearchArRouteRankListVO() {
		return searchArRouteRankListVO;
	}
	
	public void setSearchArRouteRankListVO(SearchArRouteRankListVO searchArRouteRankListVO) {
		this.searchArRouteRankListVO = searchArRouteRankListVO;
	}
	
	public SearchArRouteRankListVO[] getSearchArRouteRankListVOs() {
		//return searchArRouteRankListVOs;
		SearchArRouteRankListVO[] rtnVOs = null;
		if(this.searchArRouteRankListVOs != null) {
			rtnVOs = new SearchArRouteRankListVO[searchArRouteRankListVOs.length];
			System.arraycopy(searchArRouteRankListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchArRouteRankListVOs(SearchArRouteRankListVO[] searchArRouteRankListVOs) {
		//this.searchArRouteRankListVOs = searchArRouteRankListVOs;
		if(searchArRouteRankListVOs != null) {
			SearchArRouteRankListVO[] tmpVOs = new SearchArRouteRankListVO[searchArRouteRankListVOs.length];
			System.arraycopy(searchArRouteRankListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchArRouteRankListVOs = tmpVOs;
		}
	}
	
}
