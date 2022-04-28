/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0001Event.java
*@FileTitle : EDI CROUP
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.17
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.02.17 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchGroupListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0001 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0001HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0001HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0001Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Group Code */
	private String grpCd = "";
	
	/** Company Division Code */
	private String coDivCd = "";
	
	/** EDI Group Description */
	private String ediGrpDesc = "";
	
	/** Customer TRD PRNR ID */
	private String custTrdPrnrId = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchGroupListVO searchGroupListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchGroupListVO[] searchGroupListVOs = null;
	
	
	public BcmSup0001Event(){}
	
	public void setSearchGroupListVO(SearchGroupListVO searchGroupListVO){
		this.searchGroupListVO = searchGroupListVO;
	}
	
	public SearchGroupListVO getSearchGroupListVO(){
		return searchGroupListVO;
	}

	public void setSearchGroupListVOS(SearchGroupListVO[] searchGroupListVOs){
		if(searchGroupListVOs != null){
			SearchGroupListVO[] tmpVOs = Arrays.copyOf(searchGroupListVOs, searchGroupListVOs.length);
			this.searchGroupListVOs = tmpVOs;
		}
	}

	public SearchGroupListVO[] getSearchGroupListVOS(){
		SearchGroupListVO[] rtnVOs = null;
		if (this.searchGroupListVOs != null) {
			rtnVOs = Arrays.copyOf(searchGroupListVOs, searchGroupListVOs.length);
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

	public String getEdiGrpDesc() {
		return ediGrpDesc;
	}

	public void setEdiGrpDesc(String ediGrpDesc) {
		this.ediGrpDesc = ediGrpDesc;
	}

	public String getCustTrdPrnrId() {
		return custTrdPrnrId;
	}

	public void setCustTrdPrnrId(String custTrdPrnrId) {
		this.custTrdPrnrId = custTrdPrnrId;
	}

}
