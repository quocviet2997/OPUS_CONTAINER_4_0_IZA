/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0006Event.java
*@FileTitle : EDI YARD
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.14
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.14 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchYardListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0006 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0006HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0006HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0006Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Yard Code */
	private String yardCode = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchYardListVO searchYardListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchYardListVO[] searchYardListVOs = null;
	
	
	public BcmSup0006Event(){}
	
	public void setSearchYardListVO(SearchYardListVO searchYardListVO){
		this.searchYardListVO = searchYardListVO;
	}
	
	public SearchYardListVO getSearchYardListVO(){
		return searchYardListVO;
	}

	public void setSearchYardListVOS(SearchYardListVO[] searchYardListVOs){
		if(searchYardListVOs != null){
			SearchYardListVO[] tmpVOs = Arrays.copyOf(searchYardListVOs, searchYardListVOs.length);
			this.searchYardListVOs = tmpVOs;
		}
	}

	public SearchYardListVO[] getSearchYardListVOS(){
		SearchYardListVO[] rtnVOs = null;
		if (this.searchYardListVOs != null) {
			rtnVOs = Arrays.copyOf(searchYardListVOs, searchYardListVOs.length);
		}
		return rtnVOs;
	}

	public void setYardCode(String yardCode) {
		this.yardCode = yardCode;
	}
	
	public String getYardCode() {
		return yardCode;
	}

}
