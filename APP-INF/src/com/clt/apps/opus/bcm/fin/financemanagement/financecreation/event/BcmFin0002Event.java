/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : BcmFin0002Event.java
*@FileTitle : AR Finance Direction Conversion
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2011.03.10 정윤태
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArFincDirConvListVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0002 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0002HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0002HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0002Event  extends EventSupport{
	
	private static final long serialVersionUID = 1L;
	
	/** Slane Code */
	private String slanCd = "";
	
	/** Revenue Lane Direction code */
	private String rlaneCd = "";
	
	/** Sconti code */
	private String scontiCd = "";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchArFincDirConvListVO searchArFincDirConvListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private SearchArFincDirConvListVO[] searchArFincDirConvListVOs = null;
	
	public String getScontiCd() {
		return scontiCd;
	}
	
	public void setScontiCd(String scontiCd) {
		this.scontiCd = scontiCd;
	}
	
	public String getRlaneCd() {
		return rlaneCd;
	}
	
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	public String getSlanCd() {
		return slanCd;
	}
	
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}

	public SearchArFincDirConvListVO getSearchArFincDirConvListVO() {
		return searchArFincDirConvListVO;
	}
	
	public void setSearchArFincDirConvListVO(SearchArFincDirConvListVO searchArFincDirConvListVO) {
		this.searchArFincDirConvListVO = searchArFincDirConvListVO;
	}
	
	public SearchArFincDirConvListVO[] getSearchArFincDirConvListVOs() {
		//return searchArFincDirConvListVOs;
		SearchArFincDirConvListVO[] rtnVOs = null;
		if(this.searchArFincDirConvListVOs != null) {
			rtnVOs = new SearchArFincDirConvListVO[searchArFincDirConvListVOs.length];
			System.arraycopy(searchArFincDirConvListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	public void setSearchArFincDirConvListVOs(SearchArFincDirConvListVO[] searchArFincDirConvListVOs) {
		//this.searchArFincDirConvListVOs = searchArFincDirConvListVOs;
		if(searchArFincDirConvListVOs != null) {
			SearchArFincDirConvListVO[] tmpVOs = new SearchArFincDirConvListVO[searchArFincDirConvListVOs.length];
			System.arraycopy(searchArFincDirConvListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchArFincDirConvListVOs = tmpVOs;
		}
	}
}
