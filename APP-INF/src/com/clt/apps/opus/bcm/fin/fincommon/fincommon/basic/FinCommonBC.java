/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinCommonBC.java
*@FileTitle : FinCommonBC
*Open Issues :
*Change history :
*@LastModifyDate : 2015.04.27
*@LastModifier : seungjoon Lee
*@LastVersion : 1.0
* 2014.03.14
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.fincommon.fincommon.basic;

import java.util.Collection;
import java.util.List;

import com.clt.apps.opus.bcm.fin.fincommon.fincommon.vo.CheckInvoiceNoVO;
import com.clt.framework.component.util.code.CodeInfo;
import com.clt.framework.core.layer.event.EventException;

/**
 * OPUS-FIN FinCommonBC Business Logic Command Interface<br>
 *
 * @author SJLEE
 * @see FINCommonSC 
 * @since J2EE 1.6
 */	
public interface FinCommonBC {
	
	/**
	 * Checking the AR Finance Direction Conversion Slan
	 * 
	 * @param String slanCd
	 * @return String
	 * @exception EventException
	 */
	public String checkServiceLaneCode(String slanCd) throws EventException;

	/**
	 * Checking the AR Finance Direction Conversion Sconti
	 * 
	 * @param String scontiCd
	 * @return String
	 * @exception EventException
	 */
	public String checkPolSubContiCode(String scontiCd) throws EventException;

	/**
	 * Checking the AR Finance Direction Conversion Rlane
	 * 
	 * @param String rlaneCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRevenueLaneCode(String rlaneCd) throws EventException;
	
	/**
	 * Checking the AR Master Revenue VVD Vessel Code
	 * 
	 * @param String vslCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVesselCode(String vslCd) throws EventException;
	
	/**
	 * Checking the AR Master Revenue VVD Revenue Port Code
	 * 
	 * @param String revPortCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRevenuePortCode(String revPortCd) throws EventException;	
	
	/**
	 * Checking the Currency Code
	 * @param String currCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCurrencyCode(String currCd) throws EventException;
	
	/**
	 * Getting the common code to make the combo box.<br>
	 * 
	 * @param String[] cdId
	 * @param int[] sortKey
	 * @return List<Collection<CodeInfo>>
	 * @exception EventException
	 */
	public List<Collection<CodeInfo>> searchComboList(String[] cdId, int[] sortKey) throws EventException ;
	
	/**
	 * Checking AR Master Revenue VVD
	 * @param String vvd
	 * @return String
	 * @exception EventException
	 */
	public String checkArMasterRevenueVvd(String vvd) throws EventException;
	
	/**
	 * Checking The Invoice No.
	 * @param CheckInvoiceNoVO checkInvoiceNoVO
	 * @return List<CheckInvoiceNoVO>
	 * @exception EventException
	 */
	public List<CheckInvoiceNoVO> checkInvoiceNo(CheckInvoiceNoVO checkInvoiceNoVO) throws EventException;
	
	/**
	 * Search Functional Currency code
	 * @return String
	 * @exception EventException
	 */
	public String searchFunctionalCurrency() throws EventException;
}
