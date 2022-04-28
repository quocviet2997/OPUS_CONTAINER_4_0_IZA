/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0M1Event.java
*@FileTitle : Country
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.country.event;

import com.clt.bizcommon.country.vo.CountryListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0M1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0M1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0M1Event extends EventSupport {

	/** Table Value Object 조회 조건 및 단건 처리  */
	private CountryListVO	countryListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private CountryListVO[] countryListVOs = null;
	
    private int iPage = 0;

	/**
	 * Constructor<br>
	 */
	public ComEns0M1Event(){}
	
	/**
	 * Constructor<br>
	 * @param iPage
	 */
	public ComEns0M1Event(int iPage) {
    	this.iPage     = iPage;
    }

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns0M1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0M1Event";
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
	 * @return the countryListVO
	 */
	public CountryListVO getCountryListVO() {
		return countryListVO;
	}

	/**
	 * @param countryListVO the countryListVO to set
	 */
	public void setCountryListVO(CountryListVO countryListVO) {
		this.countryListVO = countryListVO;
	}

	/**
	 * @return the countryListVOs
	 */
	public CountryListVO[] getCountryListVOs() {
		CountryListVO[] rtnVOs = null;
		if (this.countryListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(countryListVOs, countryListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param countryListVOs the countryListVOs to set
	 */
	public void setCountryListVOs(CountryListVO[] countryListVOs){
		if(countryListVOs != null){
			CountryListVO[] tmpVOs = java.util.Arrays.copyOf(countryListVOs, countryListVOs.length);
			this.countryListVOs = tmpVOs;
		}
	}
	
}
