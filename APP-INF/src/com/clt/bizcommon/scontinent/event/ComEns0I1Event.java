/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0I1Event.java
*@FileTitle : SubContinent
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-16
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-16 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.scontinent.event;

import com.clt.bizcommon.scontinent.vo.SearchSubContinentListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0I1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0I1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0I1Event extends EventSupport {
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchSubContinentListVO	searchSubContinentListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchSubContinentListVO[] sSearchSubContinentListVOs = null;

    private int iPage = 0;
    
	/**
	 * Constructor<br>
	 */
	public ComEns0I1Event() {}
	
	/**
	 * Constructor<br>
	 * @param int iPage
	 */
	public ComEns0I1Event(int iPage) {
		this.iPage = iPage;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns0I1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0I1Event";
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
	 * @return the searchSubContinentListVO
	 */
	public SearchSubContinentListVO getSearchSubContinentListVO() {
		return searchSubContinentListVO;
	}

	/**
	 * @param searchSubContinentListVO the searchSubContinentListVO to set
	 */
	public void setSearchSubContinentListVO(
			SearchSubContinentListVO searchSubContinentListVO) {
		this.searchSubContinentListVO = searchSubContinentListVO;
	}

	/**
	 * @return the sSearchSubContinentListVOs
	 */
	public SearchSubContinentListVO[] getSSearchSubContinentListVOs() {
		SearchSubContinentListVO[] rtnVOs = null;
		if (this.sSearchSubContinentListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(sSearchSubContinentListVOs, sSearchSubContinentListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchSubContinentListVOs the sSearchSubContinentListVOs to set
	 */
	public void setSSearchSubContinentListVOs(SearchSubContinentListVO[] searchSubContinentListVOs){
		if(searchSubContinentListVOs != null){
			SearchSubContinentListVO[] tmpVOs = java.util.Arrays.copyOf(searchSubContinentListVOs, searchSubContinentListVOs.length);
			this.sSearchSubContinentListVOs = tmpVOs;
		}
	}

}
