/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0004Event.java
*@FileTitle : EDI CARGO STANDARD STATUS
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.18
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.18 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCargoStandardStatusListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0004HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0004HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0004Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Standard Status Code */
	private String stndStsCd = "";
	
	/** Company Division Code */
	private String coDivCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchCargoStandardStatusListVO searchCargoStandardStatusListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchCargoStandardStatusListVO[] searchCargoStandardStatusListVOs = null;
	
	
	public BcmSup0004Event(){}
	
	public void setSearchCargoStandardStatusListVO(SearchCargoStandardStatusListVO searchCargoStandardStatusListVO){
		this.searchCargoStandardStatusListVO = searchCargoStandardStatusListVO;
	}
	
	public SearchCargoStandardStatusListVO getSearchCargoStandardStatusListVO(){
		return searchCargoStandardStatusListVO;
	}

	public void setSearchCargoStandardStatusListVOS(SearchCargoStandardStatusListVO[] searchCargoStandardStatusListVOs){
		if(searchCargoStandardStatusListVOs != null){
			SearchCargoStandardStatusListVO[] tmpVOs = Arrays.copyOf(searchCargoStandardStatusListVOs, searchCargoStandardStatusListVOs.length);
			this.searchCargoStandardStatusListVOs = tmpVOs;
		}
	}

	public SearchCargoStandardStatusListVO[] getSearchCargoStandardStatusListVOS(){
		SearchCargoStandardStatusListVO[] rtnVOs = null;
		if (this.searchCargoStandardStatusListVOs != null) {
			rtnVOs = Arrays.copyOf(searchCargoStandardStatusListVOs, searchCargoStandardStatusListVOs.length);
		}
		return rtnVOs;
	}

	public void setStndStsCd(String stndStsCd) {
		this.stndStsCd = stndStsCd;
	}
	
	public String getStndStsCd() {
		return stndStsCd;
	}

	public void setCoDivCd(String coDivCd) {
		this.coDivCd = coDivCd;
	}
	
	public String getCoDivCd() {
		return coDivCd;
	}

}