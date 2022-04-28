/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0L1Event.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.servicescope.event;

import com.clt.bizcommon.servicescope.vo.SearchServiceScopeListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0L1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0L1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0L1Event extends EventSupport {
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchServiceScopeListVO	searchServiceScopeListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchServiceScopeListVO[] searchServiceScopeListVOs = null;
	
    private int iPage = 0;

	/**
	 * Constructor<br>
	 */
	public ComEns0L1Event(){}

	/**
	 * 
	 * @param int iPage
	 */
	public ComEns0L1Event(int iPage) {
    	this.iPage     = iPage;
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
		return "ComEns0L1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0L1Event";
	}

	/**
	 * @return the searchServiceScopeListVO
	 */
	public SearchServiceScopeListVO getSearchServiceScopeListVO() {
		return searchServiceScopeListVO;
	}

	/**
	 * @param searchServiceScopeListVO the searchServiceScopeListVO to set
	 */
	public void setSearchServiceScopeListVO(
			SearchServiceScopeListVO searchServiceScopeListVO) {
		this.searchServiceScopeListVO = searchServiceScopeListVO;
	}

	/**
	 * @return the searchServiceScopeListVOs
	 */
	public SearchServiceScopeListVO[] getSearchServiceScopeListVOs() {
		SearchServiceScopeListVO[] rtnVOs = null;
		if (this.searchServiceScopeListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchServiceScopeListVOs, searchServiceScopeListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchServiceScopeListVOs the searchServiceScopeListVOs to set
	 */
	public void setSearchServiceScopeListVOs(SearchServiceScopeListVO[] searchServiceScopeListVOs){
		if(searchServiceScopeListVOs != null){
			SearchServiceScopeListVO[] tmpVOs = java.util.Arrays.copyOf(searchServiceScopeListVOs, searchServiceScopeListVOs.length);
			this.searchServiceScopeListVOs = tmpVOs;
		}
	}

}
