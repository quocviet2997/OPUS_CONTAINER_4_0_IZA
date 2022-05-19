/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtBCImpl.java
*@FileTitle : Carrier List
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.23
*@LastModifier : Viet Tran
*@LastVersion : 1.0
* 2022.03.23 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.carrier.carriermgmt.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.esm.clv.carrier.carriermgmt.integration.CarrierMgmtDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.esm.clv.carrier.carriermgmt.vo.CarrierListVO;

/**
 * ALPS-Carrier Business Logic Command Interface<br>
 * - Interface to business logic for ALPS-Carrier<br>
 *
 * @author Viet Tran
 * @since J2EE 1.6
 */
public class CarrierMgmtBCImpl extends BasicCommandSupport implements CarrierMgmtBC {

	// Database Access Object
	private transient CarrierMgmtDBDAO dbDao = null;

	/**
	 * CarrierMgmtBCImpl constructor<br>
	 * CarrierMgmtDBDAO instance constructor.<br>
	 */
	public CarrierMgmtBCImpl() {
		dbDao = new CarrierMgmtDBDAO();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchCarrierListVO(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.listCarrierListVO(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchCarrierCode(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.searchCarrierCode(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchCarrierCode2(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.searchCrrCode(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchRLaneCode(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.searchRLaneCode(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchCustCode(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.searchCustCode(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchTrdCode(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.searchTrdCode(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public List<CarrierListVO> searchVndrCode(CarrierListVO carrierListVO) throws EventException {
		try {
			return dbDao.searchVndrCode(carrierListVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void modifyCarrierListVO(CarrierListVO[] carrierListVO, SignOnUserAccount account) throws EventException{
		try {
			List<CarrierListVO> insertVoList = new ArrayList<CarrierListVO>();
			List<CarrierListVO> updateVoList = new ArrayList<CarrierListVO>();
			List<CarrierListVO> deleteVoList = new ArrayList<CarrierListVO>();
			for ( int i=0; i<carrierListVO .length; i++ ) {
				if ( carrierListVO[i].getIbflag().equals("I")){
					carrierListVO[i].setCreUsrId(account.getUsr_id());
					if(!checkDuplicateCarrierId(carrierListVO[i])){
						insertVoList.add(carrierListVO[i]);
					}
					else{
						throw new DAOException(new ErrorHandler("ERR00004").getMessage());
					}
				} else if ( carrierListVO[i].getIbflag().equals("U")){
					carrierListVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(carrierListVO[i]);
				} else if ( carrierListVO[i].getIbflag().equals("D")){
					deleteVoList.add(carrierListVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addCarrierListVOS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifyCarrierListVOS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removeCarrierListVOS(deleteVoList);
			}
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * {@inheritDoc}
	 */
	public boolean checkDuplicateCarrierId(CarrierListVO carrierListVO) throws EventException{
		try{
			String vndrSeq = carrierListVO.getVndrSeq();
			carrierListVO.setVndrSeq(null);
			List<CarrierListVO> listCarrier = dbDao.listCarrierListVO(carrierListVO);
			carrierListVO.setVndrSeq(vndrSeq);
			if(listCarrier.size() == 0)
				return false;
			return true;
		} catch(DAOException ex) {
			// throw an EventException
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
}