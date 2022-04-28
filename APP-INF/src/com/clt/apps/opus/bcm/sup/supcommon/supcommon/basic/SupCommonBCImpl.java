/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SupCommonBCImpl.java
*@FileTitle : SUPCommon Code 
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.sup.supcommon.supcommon.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.clt.apps.opus.bcm.sup.supcommon.supcommon.integration.SupCommonDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * OPUS_CNTR-SetupManagement Business Logic Basic Command implementation<br>
 * - Handling the business logic of OPUS_CNTR-SetupManagement<br>
 *
 * @author 
 * @see SupCommonBC,SupCommonBCImpl, each DAO classes
 * @since J2EE 1.6
 */
public class SupCommonBCImpl extends BasicCommandSupport implements SupCommonBC {
	
	// Database Access Object
	private transient SupCommonDBDAO dbDao = null;

	/**
	 * The constructor of this class<br>
	 * Creating SetupCreationDBDAO class<br>
	 */
	public SupCommonBCImpl() {
		dbDao = new SupCommonDBDAO();
	}
	
	/**
	 * Retrieving Customer Country Code<br>
	 * 
	 * @param custCntCd String
	 * @param custSeq String
	 * @return String
	 * @exception EventException
	 */
	public String checkCustomerCountryCode(String custCntCd, String custSeq) throws EventException {
		try {
			return dbDao.checkCustomerCountryCode(custCntCd, custSeq);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving Continent Code<br>
	 * 
	 * @param contiDesc String
	 * @return String
	 * @exception EventException
	 */
	public String checkContinentCode(String contiDesc) throws EventException {
		try {
			List<String> lstContiDesc = new ArrayList<String>();
			
			if(contiDesc != null && !contiDesc.equals("")) {
				lstContiDesc = seperationParameter(contiDesc, ",");
			}
			
			return dbDao.checkContinentCode(lstContiDesc);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving Country Code<br>
	 * 
	 * @param cntDesc String
	 * @return String
	 * @exception EventException
	 */
	public String checkCountryCode(String cntDesc) throws EventException {
		try {
			List<String> lstCntDesc = new ArrayList<String>();
			
			if(cntDesc != null && !cntDesc.equals("")) {
				lstCntDesc = seperationParameter(cntDesc, ",");
			}
			
			return dbDao.checkCountryCode(lstCntDesc);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving Service Lane Code<br>
	 * 
	 * @param slanCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkServiceLaneCode(String slanCd) throws EventException {
		try {
			
			return dbDao.checkServiceLaneCode(slanCd);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving Port Code<br>
	 * 
	 * @param portCd String
	 * @return String
	 * @exception EventException
	 */
	public String checkPortCode(String portCd) throws EventException {
		try {
			
			return dbDao.checkPortCode(portCd);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Splitting the parameter
	 * @param String sparameter
	 * @param String sSeperate
	 * @return List<String>
	 */
	private List<String> seperationParameter(String sparameter, String sSeperate) {
		List<String> arrlist = null;
		StringTokenizer st  = null;
		int j = 0;
		
		if( !sparameter.equals("") ) {
			arrlist = new ArrayList<String>();
			st = new StringTokenizer(sparameter, sSeperate);
			while( st.hasMoreTokens() ) {
				arrlist.add(j++, st.nextToken());
			}
		}
		return arrlist;
	}
}

