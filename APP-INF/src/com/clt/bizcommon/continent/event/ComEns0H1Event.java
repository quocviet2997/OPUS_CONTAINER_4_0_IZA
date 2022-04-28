/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0H1Event.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.continent.event;

import com.clt.bizcommon.continent.vo.SearchContinentListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0H1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0H1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0H1Event extends EventSupport {

	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchContinentListVO	searchContinentCodeInquiryListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchContinentListVO[] searchContinentCodeInquiryListVOs = null;
	
	
	/**
	 * Constructor<br>
	 */
	public ComEns0H1Event(){}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns0H1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0H1Event";
	}

	public SearchContinentListVO getSearchContinentCodeInquiryListVO() {
		return searchContinentCodeInquiryListVO;
	}

	public void setSearchContinentCodeInquiryListVO(SearchContinentListVO searchContinentCodeInquiryListVO) {
		this.searchContinentCodeInquiryListVO = searchContinentCodeInquiryListVO;
	}

	public SearchContinentListVO[] getSearchContinentCodeInquiryListVOs() {
		SearchContinentListVO[] rtnVOs = null;
		if (this.searchContinentCodeInquiryListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchContinentCodeInquiryListVOs, searchContinentCodeInquiryListVOs.length);
		}
		return rtnVOs;
	}

	public void setSearchContinentCodeInquiryListVOs(SearchContinentListVO[] searchContinentCodeInquiryListVOs){
		if(searchContinentCodeInquiryListVOs != null){
			SearchContinentListVO[] tmpVOs = java.util.Arrays.copyOf(searchContinentCodeInquiryListVOs, searchContinentCodeInquiryListVOs.length);
			this.searchContinentCodeInquiryListVOs = tmpVOs;
		}
	}

	
}
