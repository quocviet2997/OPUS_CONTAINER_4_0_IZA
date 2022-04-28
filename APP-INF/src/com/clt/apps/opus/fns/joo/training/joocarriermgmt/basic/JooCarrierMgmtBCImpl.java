/*=========================================================
*Copyright(c) 2019 CyberLogitec
*@FileName : JooCarrierMgmtBCImpl.java
*@FileTitle : Joo Carrier Management
*Open Issues :
*Change history :
*@LastModifyDate : 2019.03.26
*@LastModifier : Tu.Nguyen
*@LastVersion : 1.0
* 2019.03.26 Tu.Nguyen
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.fns.joo.training.joocarriermgmt.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.fns.joo.training.joocarriermgmt.integration.JooCarrierMgmtDBDAO;
import com.clt.apps.opus.fns.joo.training.joocarriermgmt.vo.JooCarrierVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;

/**
 * ALPS-Training Business Logic Command Interface<br>
 * - ALPS-Training에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Tu.Nguyen
 * @since J2EE 1.6
 */
public class JooCarrierMgmtBCImpl extends BasicCommandSupport implements JooCarrierMgmtBC {

	// Database Access Object
	private transient JooCarrierMgmtDBDAO dbDao = null;

	/**
	 * JooCarrierMgmtBCImpl 객체 생성<br>
	 * JooCarrierMgmtDBDAO를 생성한다.<br>
	 */
	public JooCarrierMgmtBCImpl() {
		dbDao = new JooCarrierMgmtDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param JooCarrierVO jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	public List<JooCarrierVO> searchJooCarrierList(JooCarrierVO jooCarrierVO) throws EventException {
		try {
			return dbDao.searchJooCarrierList(jooCarrierVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param JooCarrierVO[] jooCarrierVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void manageJooCarrier(JooCarrierVO[] jooCarrierVO, SignOnUserAccount account) throws EventException{
		try {
			List<JooCarrierVO> insertVoList = new ArrayList<JooCarrierVO>();
			List<JooCarrierVO> updateVoList = new ArrayList<JooCarrierVO>();
			List<JooCarrierVO> deleteVoList = new ArrayList<JooCarrierVO>();
			List<JooCarrierVO> list = null;
			for ( int i=0; i<jooCarrierVO .length; i++ ) {
				//validation
				if ( jooCarrierVO[i].getIbflag().equals("I") || jooCarrierVO[i].getIbflag().equals("U")){
					//check mandatory
					if(jooCarrierVO[i].getJoCrrCd().isEmpty() || jooCarrierVO[i].getRlaneCd().isEmpty()
							|| jooCarrierVO[i].getVndrSeq().isEmpty() || jooCarrierVO[i].getCustCntCd().isEmpty()
							|| jooCarrierVO[i].getCustSeq().isEmpty()){
						throw new EventException(new ErrorHandler("JOO00000").getMessage());
					}
					//check duplicate
					if(jooCarrierVO[i].getIbflag().equals("I")){
						list = searchJooCarrierList(jooCarrierVO[i]);
						if(null != list && list.size() > 0){
							throw new EventException(new ErrorHandler("JOO00161").getMessage());
						}
					}
				}
				if ( jooCarrierVO[i].getIbflag().equals("I")){
					jooCarrierVO[i].setCreUsrId(account.getUsr_id());
					jooCarrierVO[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(jooCarrierVO[i]);
				} else if ( jooCarrierVO[i].getIbflag().equals("U")){
					jooCarrierVO[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(jooCarrierVO[i]);
				} else if ( jooCarrierVO[i].getIbflag().equals("D")){
					deleteVoList.add(jooCarrierVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addmanageJooCarrierS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifymanageJooCarrierS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removemanageJooCarrierS(deleteVoList);
			}
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * this mothed for searching RLane Code list, it's used dropdown list
	 * 
	 * @param JooCarrierVO jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	@Override
	public List<JooCarrierVO> searchRLaneCd(JooCarrierVO jooCarrierVO) throws EventException {
		try {
			return dbDao.searchRLaneCd(jooCarrierVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * this mothed for searching Carrier Code list, it's used dropdownlist
	 * 
	 * @param JooCarrierVO jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	@Override
	public List<JooCarrierVO> searchCrrCd(JooCarrierVO jooCarrierVO) throws EventException {
		try {
			return dbDao.searchCrrCd(jooCarrierVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	/**
	 * this mothed for searching vendor Code list, it's used checking invalid data
	 * 
	 * @param JooCarrierVO jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	@Override
	public List<JooCarrierVO> searchVndrCd(JooCarrierVO jooCarrierVO) throws EventException {
		try {
			return dbDao.searchVndrCd(jooCarrierVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	/**
	 * this mothed for searching customer Code list, it's used checking invalid data
	 * 
	 * @param JooCarrierVO jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	@Override
	public List<JooCarrierVO> searchCusCd(JooCarrierVO jooCarrierVO) throws EventException {
		try {
			return dbDao.searchCusCd(jooCarrierVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	/**
	 * this mothed for searching trade Code list, it's used checking invalid data
	 * 
	 * @param JooCarrierVO jooCarrierVO
	 * @return List<JooCarrierVO>
	 * @exception EventException
	 */
	@Override
	public List<JooCarrierVO> searchTrdCd(JooCarrierVO jooCarrierVO) throws EventException {
		try {
			return dbDao.searchTrdCd(jooCarrierVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
}