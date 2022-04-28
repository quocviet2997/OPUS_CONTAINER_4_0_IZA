/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : ComCom0007Event.java
*@FileTitle : Vendor Code Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.22
*@LastModifier : 김종호
*@LastVersion : 1.0
* 2012.02.22 김종호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vendorcode.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.bizcommon.vendorcode.vo.SearchVendorCodeVO;

/**
 * COM_COM_0007 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_COM_0007HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jong-Ho Kim
 * @see COM_COM_0007HTMLAction 참조
 * @since J2EE 1.6
 */

public class ComCom0007Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchVendorCodeVO searchVendorCodeVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchVendorCodeVO[] searchVendorCodeVOs = null;
	
    private int iPage = 0;

	public ComCom0007Event(){}

	/**
	 * Constructor<br>
	 * @param int iPage
	 */
	public ComCom0007Event(int iPage) {
		this.iPage = iPage;
    }
	
	public int getIPage() {
		return iPage;
	}

	public void setIPage(int page) {
		iPage = page;
	}
	
	public void setSearchVendorCodeVO(SearchVendorCodeVO searchVendorCodeVO){
		this. searchVendorCodeVO = searchVendorCodeVO;
	}

	public void setSearchVendorCodeVOS(SearchVendorCodeVO[] searchVendorCodeVOs){
		if(searchVendorCodeVOs != null){
			SearchVendorCodeVO[] tmpVOs = java.util.Arrays.copyOf(searchVendorCodeVOs, searchVendorCodeVOs.length);
			this.searchVendorCodeVOs = tmpVOs;
		}
	}

	public SearchVendorCodeVO getSearchVendorCodeVO(){
		return searchVendorCodeVO;
	}

	public SearchVendorCodeVO[] getSearchVendorCodeVOS(){
		SearchVendorCodeVO[] rtnVOs = null;
		if (this.searchVendorCodeVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchVendorCodeVOs, searchVendorCodeVOs.length);
		}
		return rtnVOs;
	}

}