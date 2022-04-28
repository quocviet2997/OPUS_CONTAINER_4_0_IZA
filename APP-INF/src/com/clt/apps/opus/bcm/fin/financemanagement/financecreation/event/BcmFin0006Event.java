/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmFin0006Event.java
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

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchGlMonthlyExchangeRateListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0006 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0006HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0006HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0006Event extends EventSupport{
	private static final long serialVersionUID = 1L;
	
	private String acctXchRtYrmon;
	
	private String acctXchRtLvl;
	
	private String currCd;
	
	private SearchGlMonthlyExchangeRateListVO searchGlMonthlyExchangeRateListVO;
	
	private SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs;
	
	public String getAcctXchRtYrmon() {
		return acctXchRtYrmon;
	}
	
	public void setAcctXchRtYrmon(String acctXchRtYrmon) {
		this.acctXchRtYrmon = acctXchRtYrmon;
	}
	
	public String getAcctXchRtLvl() {
		return acctXchRtLvl;
	}
	
	public void setAcctXchRtLvl(String acctXchRtLvl) {
		this.acctXchRtLvl = acctXchRtLvl;
	}
	
	public String getCurrCd() {
		return currCd;
	}
	
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	public SearchGlMonthlyExchangeRateListVO getSearchGlMonthlyExchangeRateListVO() {
		return searchGlMonthlyExchangeRateListVO;
	}
	
	public void setSearchGlMonthlyExchangeRateListVO(SearchGlMonthlyExchangeRateListVO searchGlMonthlyExchangeRateListVO) {
		this.searchGlMonthlyExchangeRateListVO = searchGlMonthlyExchangeRateListVO;
	}
	
	public SearchGlMonthlyExchangeRateListVO[] getSearchGlMonthlyExchangeRateListVOs() {
		//return searchGlMonthlyExchangeRateListVOs;
		SearchGlMonthlyExchangeRateListVO[] rtnVOs = null;
		if(this.searchGlMonthlyExchangeRateListVOs != null) {
			rtnVOs = new SearchGlMonthlyExchangeRateListVO[searchGlMonthlyExchangeRateListVOs.length];
			System.arraycopy(searchGlMonthlyExchangeRateListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchGlMonthlyExchangeRateListVOs(SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs) {
		//this.searchGlMonthlyExchangeRateListVOs = searchGlMonthlyExchangeRateListVOs;
		if(searchGlMonthlyExchangeRateListVOs != null) {
			SearchGlMonthlyExchangeRateListVO[] tmpVOs = new SearchGlMonthlyExchangeRateListVO[searchGlMonthlyExchangeRateListVOs.length];
			System.arraycopy(searchGlMonthlyExchangeRateListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchGlMonthlyExchangeRateListVOs = tmpVOs;
		}
	}
}