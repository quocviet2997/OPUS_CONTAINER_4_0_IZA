/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CSRExternalFinderBC.java
*@FileTitle : Common Utility
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.csrcommon.csrexternalfinder.basic;

import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.vo.SpCsrVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ApPayInvDtlVO;
import com.clt.syscommon.common.table.ApPayInvVO;


/**
 * NIS2010-Scgcommon Business Logic Command Interface<br>
 * -The interface of the business logic about NIS2010-Scgcommon<br>
 *
 * @author 
 * @see Scg_com_EventResponse
 * @since J2EE 1.6
 */
public interface CSRExternalFinderBC {

	/**
	 * Checking the vendor
	 * @param String vndrSeq
	 * @return SpCsrVO
	 * @exception EventException
	 */
	public SpCsrVO checkVendor(String vndrSeq) throws EventException;
	
	/**
	 * Retrieving the locale date by the office code.
	 * @param String ofcCd
	 * @return SpCsrVO
	 * @exception EventException
	 */
	public SpCsrVO getDBdate(String ofcCd) throws EventException;
	
	/**
	 * Retrieving the MDM country code.
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String getMDMCntCd(String ofcCd) throws EventException;
	
	/**
	 * Saving the list in AP_PAY_INV and AP_PAY_INV_DTL table.
	 * @param ApPayInvVO apPayInvVO
	 * @param ApPayInvDtlVO[] apPayInvDtlVOs
	 * @param SignOnUserAccount signOnUserAccount
	 * @return String
	 * @exception EventException
	 */
	public String createApPayInvInfo(ApPayInvVO apPayInvVO, ApPayInvDtlVO[] apPayInvDtlVOs, SignOnUserAccount signOnUserAccount) throws EventException;

 
}