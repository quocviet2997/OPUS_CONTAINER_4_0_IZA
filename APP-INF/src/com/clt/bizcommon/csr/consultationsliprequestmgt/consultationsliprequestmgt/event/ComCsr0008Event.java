/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComCsr0008Event.java
*@FileTitle : CSR Interface Status
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.16
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2009.07.16 함대성
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event;

import java.util.Collection;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AsaNoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.IfCsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.PayInvVO;
import com.clt.framework.support.layer.event.EventSupport;


/**
 * COM_CSR_0008 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  COM_CSR_0008HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author HAM DAE SUNG
 * @see COM_CSR_0008HTMLAction 참조
 * @since J2EE 1.6
 */

public class ComCsr0008Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	private IfCsrListInputVO ifCsrListInputVO = null;
	
	private IfCsrListInputVO[] ifCsrListInputVOs = null;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ApPayInvListVO apPayInvListVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ApPayInvListVO[] apPayInvListVOs = null;
	
	private CsrListInputVO csrListInputVO  = null;
	
	private AsaNoVO asaNoVO = null;
	
	private PayInvVO payInvVO  = null;
	
	private Collection payInvs = null;
	
	private CsrParmVO csrParmVO = null;
	
	private com.clt.framework.component.rowset.DBRowSet[] autoRowSetArr01 = null;
	private com.clt.framework.component.rowset.DBRowSet[] autoRowSetArr02 = null;
	private com.clt.framework.component.rowset.DBRowSet[] manualRowSetArr01 = null;
	private com.clt.framework.component.rowset.DBRowSet[] dtrbRowSetArr = null;
	
	public ComCsr0008Event(){}
	
	/**
	 * @param PayInvVO payInvVO
	 * @param Collection payInvs
	 * @param CsrParmVO csrParm
	 */
	public ComCsr0008Event(PayInvVO payInvVO, Collection payInvs, CsrParmVO csrParm) {
		this.payInvVO = payInvVO;
		this.payInvs = payInvs;
		this.csrParmVO = csrParm;
    }
	
	/**
	 * @param ApPayInvListVO apPayInvListVO
	 */
	public void setApPayInvListVO(ApPayInvListVO apPayInvListVO){
		this. apPayInvListVO = apPayInvListVO;
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
		return "ComCsr0008Event";
	}

	public String toString() {
		return "ComCsr0008Event";
	}
	
	/**
	 * @return the ifCsrListInputVO
	 */
	public IfCsrListInputVO getIfCsrListInputVO() {
		return ifCsrListInputVO;
	}

	/**
	 * @param ifCsrListInputVO the ifCsrListInputVO to set
	 */
	public void setIfCsrListInputVO(IfCsrListInputVO ifCsrListInputVO) {
		this.ifCsrListInputVO = ifCsrListInputVO;
	}

	/**
	 * @return the ifCsrListInputVOs
	 */
	public IfCsrListInputVO[] getIfCsrListInputVOs() {
		IfCsrListInputVO[] rtnVOs = null;
		if (this.ifCsrListInputVOs != null) {
			rtnVOs = new IfCsrListInputVO[ifCsrListInputVOs.length];
			System.arraycopy(ifCsrListInputVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param ifCsrListInputVOs the ifCsrListInputVOs to set
	 */
	public void setIfCsrListInputVOS(IfCsrListInputVO[] ifCsrListInputVOs) {
		if (ifCsrListInputVOs != null) {
			IfCsrListInputVO[] tmpVOs = new IfCsrListInputVO[ifCsrListInputVOs.length];
			System.arraycopy(ifCsrListInputVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.ifCsrListInputVOs = tmpVOs;
		}
	}
	
}