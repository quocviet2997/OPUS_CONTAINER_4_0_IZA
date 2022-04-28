/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : FinCommonBCImpl.java
*@FileTitle : FinCommonBCImpl
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier :
*@LastVersion : 1.0
* 2014.03.14
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.fin.fincommon.fincommon.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.clt.apps.opus.bcm.fin.fincommon.fincommon.integration.FinCommonDBDAO;
import com.clt.apps.opus.bcm.fin.fincommon.fincommon.vo.CheckInvoiceNoVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.code.CodeInfo;
import com.clt.framework.component.util.code.CodeUtil;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * OPUS-FIN FinCommonBC Business Logic Command Interface<br>
 *
 * @author SJLEE
 * @see FINCommonSC 
 * @since J2EE 1.6
 */	
public class FinCommonBCImpl extends BasicCommandSupport implements FinCommonBC{
	private FinCommonDBDAO dbDao = null;
	/**
	 * The constructor of this class<br>
	 * Creating FinCommonDBDAO class<br>
	 */
	public FinCommonBCImpl(){
		dbDao = new FinCommonDBDAO();
	}
	/**
	 * Checking the AR Finance Direction Conversion Sconti
	 * 
	 * @param String scontiCd
	 * @return String
	 * @exception EventException
	 */
	public String checkPolSubContiCode(String scontiCd) throws EventException {
		try {
			return dbDao.checkPolSubcontiCode(scontiCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the AR Finance Direction Conversion Rlane
	 * 
	 * @param String rlaneCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRevenueLaneCode(String rlaneCd) throws EventException {
		try {
			return dbDao.checkRevenueLaneCode(rlaneCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the AR Finance Direction Conversion Slan
	 * 
	 * @param String slanCd
	 * @return String
	 * @exception EventException
	 */
	public String checkServiceLaneCode(String slanCd) throws EventException {
		try {
			return dbDao.checkServiceLaneCode(slanCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}

	/**
	 * Checking the AR Master Revenue VVD Revenue Port Code
	 * 
	 * @param String revPortCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRevenuePortCode(String revPortCd) throws EventException {
		try {
			return dbDao.checkRevenuePortCode(revPortCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the AR Master Revenue VVD Vessel Code
	 * 
	 * @param String vslCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVesselCode(String vslCd) throws EventException {
		try {
			return dbDao.checkVesselCode(vslCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking the Currency Code
	 * @param String currCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCurrencyCode(String currCd) throws EventException {
		try {
			return dbDao.checkCurrencyCode(currCd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking AR Master Revenue VVD
	 * @param String vvd
	 * @return String
	 * @exception EventException
	 */
	public String checkArMasterRevenueVvd(String vvd) throws EventException {
		try {
			return dbDao.checkArMasterRevenueVvd(vvd);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Checking The Invoice No.
	 * @param CheckInvoiceNoVO checkInvoiceNoVO
	 * @return List<CheckInvoiceNoVO>
	 * @exception EventException
	 */
	public List<CheckInvoiceNoVO> checkInvoiceNo(CheckInvoiceNoVO checkInvoiceNoVO) throws EventException {
		
		List<CheckInvoiceNoVO> list = null;
		
		try {
			 list = dbDao.checkInvoiceNo(checkInvoiceNoVO);
		} catch (DAOException de) {
			log.error("err " + de.getMessage(), de);
			throw new EventException(de.getMessage());
			//throw new EventException(new ErrorHandler("CSR10005",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(ex.getMessage());
			//throw new EventException(new ErrorHandler("CSR10005",new String[]{}).getMessage(), ex);
		}
		
		return list;
	}
	
	
	/**
	 * Getting the common code to make the combo box.<br>
	 * 
	 * @param String[] cdId
	 * @param int[] sortKey
	 * @return List<Collection<CodeInfo>>
	 * @exception EventException
	 */
	@SuppressWarnings("unchecked")
	public List<Collection<CodeInfo>> searchComboList(String[] cdId, int[] sortKey) throws EventException {
		
		try {
			Collection<CodeInfo> codeInfoVO = null;
			List<Collection<CodeInfo>> codeInfoList = new ArrayList<Collection<CodeInfo>>();
			
			for(int i = 0; i < cdId.length; i++) {
				codeInfoVO = CodeUtil.getInstance().getCodeSelect(cdId[i], sortKey[i]);
				codeInfoList.add(i, codeInfoVO);
			}
			
			return codeInfoList;
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("FIN00009",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * Search Functional Currency code
	 * @return String
	 * @exception EventException
	 */
	public String searchFunctionalCurrency() throws EventException {
		try {
			return dbDao.searchFunctionalCurrency();
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
}
