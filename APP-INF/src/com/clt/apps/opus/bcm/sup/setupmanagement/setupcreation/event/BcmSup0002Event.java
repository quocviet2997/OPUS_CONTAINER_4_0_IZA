/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0002Event.java
*@FileTitle : EDI GROUP CUSTOMER
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.22
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.22 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupCustomerListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0002 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0002HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0002HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0002Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Group Code */
	private String grpCd = "";
	
	/** Company Division Code */
	private String coDivCd = "";
	
	/** SC or RFA Number */
	private String scNo = "";
	
	/** Cargo Trace Service Flag */
	private String cgoTrcSvcFlg = "";
	
	/** customer code */
	private String custCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchGroupCustomerListVO searchGroupCustomerListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchGroupCustomerListVO[] searchGroupCustomerListVOs = null;
	
	
	public BcmSup0002Event(){}
	
	public void setSearchGroupCustomerListVO(SearchGroupCustomerListVO searchGroupCustomerListVO){
		this.searchGroupCustomerListVO = searchGroupCustomerListVO;
	}
	
	public SearchGroupCustomerListVO getSearchGroupCustomerListVO(){
		return searchGroupCustomerListVO;
	}

	public void setSearchGroupCustomerListVOS(SearchGroupCustomerListVO[] searchGroupCustomerListVOs){
		if(searchGroupCustomerListVOs != null){
			SearchGroupCustomerListVO[] tmpVOs = Arrays.copyOf(searchGroupCustomerListVOs, searchGroupCustomerListVOs.length);
			this.searchGroupCustomerListVOs = tmpVOs;
		}
	}

	public SearchGroupCustomerListVO[] getSearchGroupCustomerListVOS(){
		SearchGroupCustomerListVO[] rtnVOs = null;
		if (this.searchGroupCustomerListVOs != null) {
			rtnVOs = Arrays.copyOf(searchGroupCustomerListVOs, searchGroupCustomerListVOs.length);
		}
		return rtnVOs;
	}

	public void setGrpCd(String grpCd) {
		this.grpCd = grpCd;
	}
	
	public String getGrpCd() {
		return grpCd;
	}

	public void setCoDivCd(String coDivCd) {
		this.coDivCd = coDivCd;
	}
	
	public String getCoDivCd() {
		return coDivCd;
	}
	
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	public String getScNo() {
		return scNo;
	}
	
	public void setCgoTrcSvcFlg(String cgoTrcSvcFlg) {
		this.cgoTrcSvcFlg = cgoTrcSvcFlg;
	}
	
	public String getCgoTrcSvcFlg() {
		return cgoTrcSvcFlg;
	}
	
	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}
	
	public String getCustCd() {
		return custCd;
	}	

}
