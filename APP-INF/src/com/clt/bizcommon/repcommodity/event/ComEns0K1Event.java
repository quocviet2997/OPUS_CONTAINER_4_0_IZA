/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0K1Event.java
*@FileTitle : RepCommodity
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.repcommodity.event;

import com.clt.bizcommon.repcommodity.vo.SearchRepCommodityListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0K1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0K1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0K1Event extends EventSupport {
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchRepCommodityListVO	searchRepCommodityListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchRepCommodityListVO[] searchRepCommodityListVOs = null;
	
	/**
	 * Constructor<br>
	 */
	public ComEns0K1Event(){}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns0K1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0K1Event";
	}

	/**
	 * @return the searchRepCommodityListVO
	 */
	public SearchRepCommodityListVO getSearchRepCommodityListVO() {
		return searchRepCommodityListVO;
	}

	/**
	 * @param searchRepCommodityListVO the searchRepCommodityListVO to set
	 */
	public void setSearchRepCommodityListVO(
			SearchRepCommodityListVO searchRepCommodityListVO) {
		this.searchRepCommodityListVO = searchRepCommodityListVO;
	}

	/**
	 * @return the searchRepCommodityListVOs
	 */
	public SearchRepCommodityListVO[] getSearchRepCommodityListVOs() {
		SearchRepCommodityListVO[] rtnVOs = null;
		if (this.searchRepCommodityListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchRepCommodityListVOs, searchRepCommodityListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchRepCommodityListVOs the searchRepCommodityListVOs to set
	 */
	public void setSearchRepCommodityListVOs(SearchRepCommodityListVO[] searchRepCommodityListVOs){
		if(searchRepCommodityListVOs != null){
			SearchRepCommodityListVO[] tmpVOs = java.util.Arrays.copyOf(searchRepCommodityListVOs, searchRepCommodityListVOs.length);
			this.searchRepCommodityListVOs = tmpVOs;
		}
	}

}
