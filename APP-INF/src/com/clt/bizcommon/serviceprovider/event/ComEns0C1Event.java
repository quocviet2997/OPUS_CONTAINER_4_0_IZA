/*=========================================================
*	Copyright(c) 2006 CyberLogitec
*	@FileName 			: COM_ENS_0C1Event.java
*	@FileTitle 			: ServiceProvider정보조회(공통 Popup)
*	Open Issues 		:
*	Change history 		:
*	@LastModifyDate 	: 2006-08-18
*	@LastModifier 		: sungseok, choi
*	@LastVersion 		: 1.0
*	2006-08-07 sungseok, choi
*	1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.serviceprovider.event;

import com.clt.bizcommon.serviceprovider.vo.SpListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;


/**
 *	COM_ENS_0C1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 *  COM_ENS_0C1HTMLAction에서 작성<br>
 *  ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 *	@author 	sungseok, choi
 *	@see 		HTMLAction 참조
 *	@since 		J2EE 1.4
 */public class ComEns0C1Event extends EventSupport {
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SpListVO	spListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SpListVO[] spListVOs = null;

	/**
     * Add Object	: Page Count 
     * Add Date		: 2006.08.07
     * Add Author	: sungseok, choi
     */    	
	private int iPage = 0;
	
	/**
	 * Constructor<br>
	 */
	public ComEns0C1Event(){}    
    
    /**
     * @param int iPage
     */
    public ComEns0C1Event(int iPage) {
        this.iPage      = iPage;
    }

    /**
     * Event 명을 반환<br>
     * @return String
     */
    public String getEventName() {
        return "ComEns0C1Event";
    }

    /**
     * Class 명을 반환<br>
     * @return String
     */
    public String toString() {
        return "ComEns0C1Event";
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
	 * @return the spListVO
	 */
	public SpListVO getSpListVO() {
		return spListVO;
	}

	/**
	 * @param spListVO the spListVO to set
	 */
	public void setSpListVO(SpListVO spListVO) {
		this.spListVO = spListVO;
	}

	/**
	 * @return the spListVOs
	 */
	public SpListVO[] getSpListVOs() {
		SpListVO[] rtnVOs = null;
		if (this.spListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(spListVOs, spListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param spListVOs the spListVOs to set
	 */
	public void setSpListVOs(SpListVO[] spListVOs){
		if(spListVOs != null){
			SpListVO[] tmpVOs = java.util.Arrays.copyOf(spListVOs, spListVOs.length);
			this.spListVOs = tmpVOs;
		}
	}

}