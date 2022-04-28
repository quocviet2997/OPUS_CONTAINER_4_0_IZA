/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmSup0005Event.java
*@FileTitle : EDI SETUP LOGISTICS
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.07
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.07 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.event;

import java.util.Arrays;

import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiPrnrPortLaneListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiSubLnkMsgListVO;
import com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo.SearchBkgEdiTrdPrnrSubLnkListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_SUP_0005 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_SUP_0005HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_SUP_0005HTMLAction 참조
 * @since J2EE 1.6
 */

public class BcmSup0005Event extends EventSupport {
	
private static final long serialVersionUID = 1L;
	
	/** Partner Sub Link Division Code */
	private String subLnkDivCd = "";
	
	/** Partner Sub Link Code */
	private String subLnkCd = "";
	
	/** Partner Port Code */
	private String portCd = "";
	
	/** Partner Sub Link Sequence */
	private String trdPrnrSubLnkSeq = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchBkgEdiTrdPrnrSubLnkListVO searchBkgEdiTrdPrnrSubLnkListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchBkgEdiTrdPrnrSubLnkListVO[] searchBkgEdiTrdPrnrSubLnkListVOs = null;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchBkgEdiSubLnkMsgListVO searchBkgEdiSubLnkMsgListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchBkgEdiSubLnkMsgListVO[] searchBkgEdiSubLnkMsgListVOs = null;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchBkgEdiPrnrPortLaneListVO searchBkgEdiPrnrPortLaneListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchBkgEdiPrnrPortLaneListVO[] searchBkgEdiPrnrPortLaneListVOs = null;
	
	
	public BcmSup0005Event(){}
	
	public void setSearchBkgEdiTrdPrnrSubLnkListVO(SearchBkgEdiTrdPrnrSubLnkListVO searchBkgEdiTrdPrnrSubLnkListVO){
		this.searchBkgEdiTrdPrnrSubLnkListVO = searchBkgEdiTrdPrnrSubLnkListVO;
	}
	
	public SearchBkgEdiTrdPrnrSubLnkListVO getSearchBkgEdiTrdPrnrSubLnkListVO(){
		return searchBkgEdiTrdPrnrSubLnkListVO;
	}

	public void setSearchBkgEdiTrdPrnrSubLnkListVOS(SearchBkgEdiTrdPrnrSubLnkListVO[] searchBkgEdiTrdPrnrSubLnkListVOs){
		if(searchBkgEdiTrdPrnrSubLnkListVOs != null){
			SearchBkgEdiTrdPrnrSubLnkListVO[] tmpVOs = Arrays.copyOf(searchBkgEdiTrdPrnrSubLnkListVOs, searchBkgEdiTrdPrnrSubLnkListVOs.length);
			this.searchBkgEdiTrdPrnrSubLnkListVOs = tmpVOs;
		}
	}

	public SearchBkgEdiTrdPrnrSubLnkListVO[] getSearchBkgEdiTrdPrnrSubLnkListVOS(){
		SearchBkgEdiTrdPrnrSubLnkListVO[] rtnVOs = null;
		if (this.searchBkgEdiTrdPrnrSubLnkListVOs != null) {
			rtnVOs = Arrays.copyOf(searchBkgEdiTrdPrnrSubLnkListVOs, searchBkgEdiTrdPrnrSubLnkListVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchBkgEdiSubLnkMsgListVO(SearchBkgEdiSubLnkMsgListVO searchBkgEdiSubLnkMsgListVO){
		this.searchBkgEdiSubLnkMsgListVO = searchBkgEdiSubLnkMsgListVO;
	}
	
	public SearchBkgEdiSubLnkMsgListVO getSearchBkgEdiSubLnkMsgListVO(){
		return searchBkgEdiSubLnkMsgListVO;
	}
	
	public void setSearchBkgEdiSubLnkMsgListVOS(SearchBkgEdiSubLnkMsgListVO[] searchBkgEdiSubLnkMsgListVOs){
		if(searchBkgEdiSubLnkMsgListVOs != null){
			SearchBkgEdiSubLnkMsgListVO[] tmpVOs = Arrays.copyOf(searchBkgEdiSubLnkMsgListVOs, searchBkgEdiSubLnkMsgListVOs.length);
			this.searchBkgEdiSubLnkMsgListVOs = tmpVOs;
		}
	}

	public SearchBkgEdiSubLnkMsgListVO[] getSearchBkgEdiSubLnkMsgListVOS(){
		SearchBkgEdiSubLnkMsgListVO[] rtnVOs = null;
		if (this.searchBkgEdiSubLnkMsgListVOs != null) {
			rtnVOs = Arrays.copyOf(searchBkgEdiSubLnkMsgListVOs, searchBkgEdiSubLnkMsgListVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchBkgEdiPrnrPortLaneListVO(SearchBkgEdiPrnrPortLaneListVO searchBkgEdiPrnrPortLaneListVO){
		this.searchBkgEdiPrnrPortLaneListVO = searchBkgEdiPrnrPortLaneListVO;
	}
	
	public SearchBkgEdiPrnrPortLaneListVO getSearchBkgEdiPrnrPortLaneListVO(){
		return searchBkgEdiPrnrPortLaneListVO;
	}
	
	public void setSearchBkgEdiPrnrPortLaneListVOS(SearchBkgEdiPrnrPortLaneListVO[] searchBkgEdiPrnrPortLaneListVOs){
		if(searchBkgEdiPrnrPortLaneListVOs != null){
			SearchBkgEdiPrnrPortLaneListVO[] tmpVOs = Arrays.copyOf(searchBkgEdiPrnrPortLaneListVOs, searchBkgEdiPrnrPortLaneListVOs.length);
			this.searchBkgEdiPrnrPortLaneListVOs = tmpVOs;
		}
	}

	public SearchBkgEdiPrnrPortLaneListVO[] getSearchBkgEdiPrnrPortLaneListVOS(){
		SearchBkgEdiPrnrPortLaneListVO[] rtnVOs = null;
		if (this.searchBkgEdiPrnrPortLaneListVOs != null) {
			rtnVOs = Arrays.copyOf(searchBkgEdiPrnrPortLaneListVOs, searchBkgEdiPrnrPortLaneListVOs.length);
		}
		return rtnVOs;
	}

	public void setSubLnkDivCd(String subLnkDivCd) {
		this.subLnkDivCd = subLnkDivCd;
	}
	
	public String getSubLnkDivCd() {
		return subLnkDivCd;
	}

	public void setSubLnkCd(String subLnkCd) {
		this.subLnkCd = subLnkCd;
	}
	
	public String getSubLnkCd() {
		return subLnkCd;
	}
	
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	public String getPortCd() {
		return portCd;
	}
	
	public void setTrdPrnrSubLnkSeq(String trdPrnrSubLnkSeq) {
		this.trdPrnrSubLnkSeq = trdPrnrSubLnkSeq;
	}
	
	public String getTrdPrnrSubLnkSeq() {
		return trdPrnrSubLnkSeq;
	}

}
