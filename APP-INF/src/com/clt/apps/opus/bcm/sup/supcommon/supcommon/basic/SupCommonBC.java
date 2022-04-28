/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SupCommonBC.java
*@FileTitle : SUPCommon Code 
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier :
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.sup.supcommon.supcommon.basic;

import com.clt.framework.core.layer.event.EventException;

/**
 * OPUS_CNTR-SetupManagement Business Logic Command Interface<br>
 * - Handling the business logic of Handling the business logic ofOPUS_CNTR-SetupManagement interface<br>
 *
 * @author 
 * @see SupCommonBCImpl 참조
 * @since J2EE 1.6
 */

public interface SupCommonBC {
	
	/**
	 * Retrieving Customer Country Code
	 * 
	 * @param custCntCd String
	 * @param custSeq String
	 * @return String
	 * @exception EventException
	 */
	public String checkCustomerCountryCode(String custCntCd, String custSeq) throws EventException ;
	
	/**
	 * Retrieving Continent Code
	 * 
	 * @param contiDesc String
	 * @return String
	 * @exception EventException
	 */
	public String checkContinentCode(String contiDesc) throws EventException ;
	
	/**
	 * Retrieving Country Code
	 * 
	 * @param cntDesc String
	 * @return String
	 * @exception EventException
	 */
	public String checkCountryCode(String cntDesc) throws EventException ;
	
	/**
	 * Retrieving Service Lane Code
	 * 
	 * @param slanCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkServiceLaneCode(String slanCd) throws EventException ;
	
	/**
	 * Retrieving Port Code
	 * 
	 * @param portCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkPortCode(String portCd) throws EventException ;

}
