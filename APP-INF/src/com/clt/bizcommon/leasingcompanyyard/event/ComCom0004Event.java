/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_CCD_0004Event.java
*@FileTitle : LeasingCompanyYard
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-16
*@LastModifier : Kim Min Soo
*@LastVersion : 1.0
* 2006-10-16 Kim Min Soo
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.leasingcompanyyard.event;

import com.clt.bizcommon.leasingcompanyyard.vo.SearchLeasingCompanyYardListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_COM_0004 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_COM_0004HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0004Event extends EventSupport {
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchLeasingCompanyYardListVO	searchLeasingCompanyYardListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchLeasingCompanyYardListVO[] searchLeasingCompanyYardListVOs = null;
	
    private String mdmYn  = null;
    private String deltFlg  = null;
    private int iPage = 0;
    
	/**
	 * Constructor<br>
	 */
	public ComCom0004Event(){}

    /**
     * Constructor<br>
     * @param mdmYn
     * @param deltFlg
     * @param iPage
     */
    public ComCom0004Event(String mdmYn, String deltFlg, int iPage) {
    	this.mdmYn     	= mdmYn;
    	this.deltFlg     	= deltFlg;
    	this.iPage      	= iPage;
    }
    
	/**
	 * Constructor<br>
	 * @param iPage
	 */
	public ComCom0004Event(int iPage) {
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
		return "ComCom0004Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComCom0004Event";
	}

	/**
	 * @return the searchLeasingCompanyYardListVO
	 */
	public SearchLeasingCompanyYardListVO getSearchLeasingCompanyYardListVO() {
		return searchLeasingCompanyYardListVO;
	}

	/**
	 * @param searchLeasingCompanyYardListVO the searchLeasingCompanyYardListVO to set
	 */
	public void setSearchLeasingCompanyYardListVO(SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO) {
		this.searchLeasingCompanyYardListVO = searchLeasingCompanyYardListVO;
	}

	/**
	 * @return the searchLeasingCompanyYardListVOs
	 */
	public SearchLeasingCompanyYardListVO[] getSearchLeasingCompanyYardListVOs() {
		SearchLeasingCompanyYardListVO[] rtnVOs = null;
		if (this.searchLeasingCompanyYardListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchLeasingCompanyYardListVOs, searchLeasingCompanyYardListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchLeasingCompanyYardListVOs the searchLeasingCompanyYardListVOs to set
	 */
	public void setSearchLeasingCompanyYardListVOs(SearchLeasingCompanyYardListVO[] searchLeasingCompanyYardListVOs){
		if(searchLeasingCompanyYardListVOs != null){
			SearchLeasingCompanyYardListVO[] tmpVOs = java.util.Arrays.copyOf(searchLeasingCompanyYardListVOs, searchLeasingCompanyYardListVOs.length);
			this.searchLeasingCompanyYardListVOs = tmpVOs;
		}
	}

}
