/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComCsr0002Event.java
*@FileTitle : CSR Creation – Detail (한국지역)
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.02
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.07.02 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event;

import java.util.Collection;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AsaNoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SearchDTRBTtlVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_CSR_0002 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_CSR_0002HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author HAM DAE SUNG
 * @see COM_CSR_0002HTMLAction 참조
 * @since J2EE 1.6
 */

public class ComCsr0002Event extends EventSupport {
 
	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApPayInvListVO apPayInvListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApPayInvListVO[] apPayInvListVOs = null;
	
	private CsrListInputVO csrListInputVO  = null;
	
	private AsaNoVO asaNoVO = null;
	
	private CsrParmVO csrParmVO = null;
	
	private PayInvVO payInvVO  = null;
	
	private PayInvVO[] payInvVOs  = null;
	
	private SearchDTRBTtlVO searchDTRBTtlVO = null;
	
	private SearchDTRBTtlVO[] searchDTRBTtlVOs = null;
	
	private Collection payInvs = null;
	
	private String invOfcCd = null;
	
	private com.clt.framework.component.rowset.DBRowSet[] autoRowSetArr01 = null;
	private com.clt.framework.component.rowset.DBRowSet[] autoRowSetArr02 = null;
	private com.clt.framework.component.rowset.DBRowSet[] manualRowSetArr01 = null;
	private com.clt.framework.component.rowset.DBRowSet[] dtrbRowSetArr = null;
	
	public ComCsr0002Event(){}
	
	/**
	 * @param PayInvVO payInvVO
	 * @param Collection payInvs
	 * @param CsrParmVO csrParm
	 */
	public ComCsr0002Event(PayInvVO payInvVO, Collection payInvs, CsrParmVO csrParm) {
		this.payInvVO = payInvVO;
		this.payInvs = payInvs;
		this.csrParmVO = csrParm;
    }
	
	
	public String getInvOfcCd() {
		return invOfcCd;
	}

	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
	}

	/**
	 * @param ApPayInvListVO apPayInvListVO
	 */
	public void setApPayInvListVOs(ApPayInvListVO[] apPayInvListVOs) {
		if (apPayInvListVOs != null) {
			ApPayInvListVO[] tmpVOs = new ApPayInvListVO[apPayInvListVOs.length];
			System.arraycopy(apPayInvListVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.apPayInvListVOs = tmpVOs;
		}
	}

	public ApPayInvListVO getApPayInvListVO(){
		return apPayInvListVO;
	}

	public ApPayInvListVO[] getApPayInvListVOS() {
		ApPayInvListVO[] rtnVOs = null;
		if (this.apPayInvListVOs != null) {
			rtnVOs = new ApPayInvListVO[apPayInvListVOs.length];
			System.arraycopy(apPayInvListVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}
	
	/**
	 * @return the csrParmVO
	 */
	public CsrParmVO getCsrParmVO() {
		return csrParmVO;
	}

	/**
	 * @param csrParmVO the csrParmVO to set
	 */
	public void setCsrParmVO(CsrParmVO csrParmVO) {
		this.csrParmVO = csrParmVO;
	}

	/**
	 * @return the payInvVOs
	 */
	public PayInvVO[] getPayInvVOs() {
		PayInvVO[] rtnVOs = null;
		if (this.payInvVOs != null) {
			rtnVOs = new PayInvVO[payInvVOs.length];
			System.arraycopy(payInvVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param payInvVOs the payInvVOs to set
	 */
	public void setPayInvVOs(PayInvVO[] payInvVOs) {
		if (payInvVOs != null) {
			PayInvVO[] tmpVOs = new PayInvVO[payInvVOs.length];
			System.arraycopy(payInvVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.payInvVOs = tmpVOs;
		}
	}

	/**
	 * @return the searchDTRBTtlVOs
	 */
	public SearchDTRBTtlVO[] getSearchDTRBTtlVOs() {
		SearchDTRBTtlVO[] rtnVOs = null;
		if (this.searchDTRBTtlVOs != null) {
			rtnVOs = new SearchDTRBTtlVO[searchDTRBTtlVOs.length];
			System.arraycopy(searchDTRBTtlVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchDTRBTtlVOs the searchDTRBTtlVOs to set
	 */
	public void setSearchDTRBTtlVOs(SearchDTRBTtlVO[] searchDTRBTtlVOs) {
		if (searchDTRBTtlVOs != null) {
			SearchDTRBTtlVO[] tmpVOs = new SearchDTRBTtlVO[searchDTRBTtlVOs.length];
			System.arraycopy(searchDTRBTtlVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.searchDTRBTtlVOs = tmpVOs;
		}
	}

	/**
	 * @return the csrListInputVO
	 */
	public CsrListInputVO getCsrListInputVO() {
		return csrListInputVO;
	}

	/**
	 * @param csrListInputVO the csrListInputVO to set
	 */
	public void setCsrListInputVO(CsrListInputVO csrListInputVO) {
		this.csrListInputVO = csrListInputVO;
	}
	
	/**
	 * @return the searchDTRBTtlVO
	 */
	public SearchDTRBTtlVO getSearchDTRBTtlVO() {
		return searchDTRBTtlVO;
	}

	/**
	 * @param searchDTRBTtlVO the searchDTRBTtlVO to set
	 */
	public void setSearchDTRBTtlVO(SearchDTRBTtlVO searchDTRBTtlVO) {
		this.searchDTRBTtlVO = searchDTRBTtlVO;
	}

	/**
	 * @return the asaNo
	 */
	public AsaNoVO getAsaNoVO() {
		return asaNoVO;
	}

	/**
	 * @param asaNo the asaNo to set
	 */
	public void setAsaNoVO(AsaNoVO asaNoVO) {
		this.asaNoVO = asaNoVO;
	}

	/**
	 * @return the autoRowSetArr01
	 */
	public com.clt.framework.component.rowset.DBRowSet[] getAutoRowSetArr01() {
		com.clt.framework.component.rowset.DBRowSet[] rtnVOs = null;
		if (this.autoRowSetArr01 != null) {
			rtnVOs = new com.clt.framework.component.rowset.DBRowSet[autoRowSetArr01.length];
			System.arraycopy(autoRowSetArr01, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param autoRowSetArr01 the autoRowSetArr01 to set
	 */
	public void setAutoRowSetArr01(com.clt.framework.component.rowset.DBRowSet[] autoRowSetArr01) {
		if (autoRowSetArr01 != null) {
			com.clt.framework.component.rowset.DBRowSet[] tmpVOs = new com.clt.framework.component.rowset.DBRowSet[autoRowSetArr01.length];
			System.arraycopy(autoRowSetArr01, 0, tmpVOs, 0, tmpVOs.length);
			this.autoRowSetArr01 = tmpVOs;
		}
	}

	/**
	 * @return the autoRowSetArr02
	 */
	public com.clt.framework.component.rowset.DBRowSet[] getAutoRowSetArr02() {
		com.clt.framework.component.rowset.DBRowSet[] rtnVOs = null;
		if (this.autoRowSetArr02 != null) {
			rtnVOs = new com.clt.framework.component.rowset.DBRowSet[autoRowSetArr02.length];
			System.arraycopy(autoRowSetArr02, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param autoRowSetArr02 the autoRowSetArr02 to set
	 */
	public void setAutoRowSetArr02(com.clt.framework.component.rowset.DBRowSet[] autoRowSetArr02) {
		if (autoRowSetArr02 != null) {
			com.clt.framework.component.rowset.DBRowSet[] tmpVOs = new com.clt.framework.component.rowset.DBRowSet[autoRowSetArr02.length];
			System.arraycopy(autoRowSetArr02, 0, tmpVOs, 0, tmpVOs.length);
			this.autoRowSetArr02 = tmpVOs;
		}
	}

	/**
	 * @return the manualRowSetArr01
	 */
	public com.clt.framework.component.rowset.DBRowSet[] getManualRowSetArr01() {
		com.clt.framework.component.rowset.DBRowSet[] rtnVOs = null;
		if (this.manualRowSetArr01 != null) {
			rtnVOs = new com.clt.framework.component.rowset.DBRowSet[manualRowSetArr01.length];
			System.arraycopy(manualRowSetArr01, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param manualRowSetArr01 the manualRowSetArr01 to set
	 */
	public void setManualRowSetArr01(com.clt.framework.component.rowset.DBRowSet[] manualRowSetArr01) {
		if (manualRowSetArr01 != null) {
			com.clt.framework.component.rowset.DBRowSet[] tmpVOs = new com.clt.framework.component.rowset.DBRowSet[manualRowSetArr01.length];
			System.arraycopy(manualRowSetArr01, 0, tmpVOs, 0, tmpVOs.length);
			this.manualRowSetArr01 = tmpVOs;
		}
	}

	/**
	 * @return the dtrbRowSetArr
	 */
	public com.clt.framework.component.rowset.DBRowSet[] getDtrbRowSetArr() {
		com.clt.framework.component.rowset.DBRowSet[] rtnVOs = null;
		if (this.dtrbRowSetArr != null) {
			rtnVOs = new com.clt.framework.component.rowset.DBRowSet[dtrbRowSetArr.length];
			System.arraycopy(dtrbRowSetArr, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param dtrbRowSetArr the dtrbRowSetArr to set
	 */
	public void setDtrbRowSetArr(com.clt.framework.component.rowset.DBRowSet[] dtrbRowSetArr) {
		if (dtrbRowSetArr != null) {
			com.clt.framework.component.rowset.DBRowSet[] tmpVOs = new com.clt.framework.component.rowset.DBRowSet[dtrbRowSetArr.length];
			System.arraycopy(dtrbRowSetArr, 0, tmpVOs, 0, tmpVOs.length);
			this.dtrbRowSetArr = tmpVOs;
		}
	}

	/**
	 * @return the payInvVO
	 */
	public PayInvVO getPayInvVO() {
		return payInvVO;
	}
 
	/**
	 * @return the payInvs
	 */
	public Collection getPayInvs() {
		return payInvs;
	} 
	
	public String getEventName() {
		return "ComCsr0002Event";
	}

	public String toString() {
		return "ComCsr0002Event";
	}

}