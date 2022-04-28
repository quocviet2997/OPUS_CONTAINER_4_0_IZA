/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0003Event.java
*@FileTitle : EDI GROUP CARGO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.23
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.23 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupCargoListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0003 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0003HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0003HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0003Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Group Code */
	private String grpCd = "";
	
	/** Company Division Code */
	private String coDivCd = "";
	
	/** Standard Status Code */
	private String stndStsCd = "";
	
	/** cust Code */
	private String custCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchGroupCargoListVO searchGroupCargoListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchGroupCargoListVO[] searchGroupCargoListVOs = null;
	
	
	public BcmSup0003Event(){}
	
	public void setSearchGroupCargoListVO(SearchGroupCargoListVO searchGroupCargoListVO){
		this.searchGroupCargoListVO = searchGroupCargoListVO;
	}
	
	public SearchGroupCargoListVO getSearchGroupCargoListVO(){
		return searchGroupCargoListVO;
	}

	public void setSearchGroupCargoListVOS(SearchGroupCargoListVO[] searchGroupCargoListVOs){
		if(searchGroupCargoListVOs != null){
			SearchGroupCargoListVO[] tmpVOs = Arrays.copyOf(searchGroupCargoListVOs, searchGroupCargoListVOs.length);
			this.searchGroupCargoListVOs = tmpVOs;
		}
	}

	public SearchGroupCargoListVO[] getSearchGroupCargoListVOS(){
		SearchGroupCargoListVO[] rtnVOs = null;
		if (this.searchGroupCargoListVOs != null) {
			rtnVOs = Arrays.copyOf(searchGroupCargoListVOs, searchGroupCargoListVOs.length);
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
	
	public void setStndStsCd(String stndStsCd) {
		this.stndStsCd = stndStsCd;
	}
	
	public String getStndStsCd() {
		return stndStsCd;
	}
	
	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}
	
	public String getCustCd() {
		return custCd;
	}	

}
