/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0J1Event.java
*@FileTitle : Region
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-16
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-16 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.region.event;

import com.clt.bizcommon.region.vo.SearchRegionListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_ENS_0J1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0J1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0J1Event extends EventSupport {
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchRegionListVO	searchRegionListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchRegionListVO[] searchRegionListVOs = null;
	
    private int iPage = 0;
    
	/**
	 * Constructor<br>
	 */
	public ComEns0J1Event(){}

	/**
	 * Constructor<br>
	 * @param iPage
	 */
	public ComEns0J1Event(int iPage) {
		this.iPage = iPage;
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
		return "ComEns0J1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0J1Event";
	}

	/**
	 * @return the searchRegionListVO
	 */
	public SearchRegionListVO getSearchRegionListVO() {
		return searchRegionListVO;
	}

	/**
	 * @param searchRegionListVO the searchRegionListVO to set
	 */
	public void setSearchRegionListVO(SearchRegionListVO searchRegionListVO) {
		this.searchRegionListVO = searchRegionListVO;
	}

	/**
	 * @return the searchRegionListVOs
	 */
	public SearchRegionListVO[] getSearchRegionListVOs() {
		SearchRegionListVO[] rtnVOs = null;
		if (this.searchRegionListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchRegionListVOs, searchRegionListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchRegionListVOs the searchRegionListVOs to set
	 */
	public void setSearchRegionListVOs(SearchRegionListVO[] searchRegionListVOs){
		if(searchRegionListVOs != null){
			SearchRegionListVO[] tmpVOs = java.util.Arrays.copyOf(searchRegionListVOs, searchRegionListVOs.length);
			this.searchRegionListVOs = tmpVOs;
		}
	}

}
