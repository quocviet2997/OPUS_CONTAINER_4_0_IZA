/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0007Event.java
*@FileTitle : CUSTOMER SCHEDULE EDI SETUP
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.16
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.16 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchCustomerScheduleListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0007 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0007HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0007HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0007Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** EDI Setup Id */
	private String stupId = "";
	
	/** EDI Message Name */
	private String msgNm = "";
	
	/** EDI Service Type Name */
	private String svcTpNm = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchCustomerScheduleListVO searchCustomerScheduleListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchCustomerScheduleListVO[] searchCustomerScheduleListVOs = null;
	
	
	public BcmSup0007Event(){}
	
	public void setSearchCustomerScheduleListVO(SearchCustomerScheduleListVO searchCustomerScheduleListVO){
		this.searchCustomerScheduleListVO = searchCustomerScheduleListVO;
	}
	
	public SearchCustomerScheduleListVO getSearchCustomerScheduleListVO(){
		return searchCustomerScheduleListVO;
	}

	public void setSearchCustomerScheduleListVOS(SearchCustomerScheduleListVO[] searchCustomerScheduleListVOs){
		if(searchCustomerScheduleListVOs != null){
			SearchCustomerScheduleListVO[] tmpVOs = Arrays.copyOf(searchCustomerScheduleListVOs, searchCustomerScheduleListVOs.length);
			this.searchCustomerScheduleListVOs = tmpVOs;
		}
	}

	public SearchCustomerScheduleListVO[] getSearchCustomerScheduleListVOS(){
		SearchCustomerScheduleListVO[] rtnVOs = null;
		if (this.searchCustomerScheduleListVOs != null) {
			rtnVOs = Arrays.copyOf(searchCustomerScheduleListVOs, searchCustomerScheduleListVOs.length);
		}
		return rtnVOs;
	}

	public void setStupId(String stupId) {
		this.stupId = stupId;
	}
	
	public String getStupId() {
		return stupId;
	}
	
	public void setMsgNm(String msgNm) {
		this.msgNm = msgNm;
	}
	
	public String getMsgNm() {
		return msgNm;
	}
	
	public void setSvcTpNm(String svcTpNm) {
		this.svcTpNm = svcTpNm;
	}
	
	public String getSvcTpNm() {
		return svcTpNm;
	}

}
