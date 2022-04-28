/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhVienBCImpl.java
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.sinhvien.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.apps.opus.dou.sinhvien.sinhvien.integration.SinhVienDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.apps.opus.dou.sinhvien.sinhvien.vo.SinhVienVO;

/**
 * ALPS-SinhVien Business Logic Command Interface<br>
 * - ALPS-SinhVien에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Vi Nguyen
 * @since J2EE 1.6
 */
public class SinhVienBCImpl extends BasicCommandSupport implements SinhVienBC {

	// Database Access Object
	private transient SinhVienDBDAO dbDao = null;

	/**
	 * SinhVienBCImpl 객체 생성<br>
	 * SinhVienDBDAO를 생성한다.<br>
	 */
	public SinhVienBCImpl() {
		dbDao = new SinhVienDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO sinhVienVO
	 * @return List<SinhVienVO>
	 * @exception EventException
	 * @throws DAOException 
	 */
	public List<SinhVienVO> searchSinhVien(SinhVienVO sinhVienVO) throws EventException, DAOException {
		try {
			return dbDao.searchSinhVien(sinhVienVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param SinhVienVO[] sinhVienVO
	 * @param account SignOnUserAccount
	 * @exception EventException
	 */
	public void manageSinhVien(SinhVienVO[] sinhVienVO, SignOnUserAccount account) throws EventException{
		try {
			List<SinhVienVO> insertVoList = new ArrayList<SinhVienVO>();
			List<SinhVienVO> updateVoList = new ArrayList<SinhVienVO>();
			List<SinhVienVO> deleteVoList = new ArrayList<SinhVienVO>();
			for ( int i=0; i < sinhVienVO.length; i++ ) {
				if ( sinhVienVO[i].getIbflag().equals("I")){
					insertVoList.add(sinhVienVO[i]);
				} else if ( sinhVienVO[i].getIbflag().equals("U")){
					updateVoList.add(sinhVienVO[i]);
				} else if ( sinhVienVO[i].getIbflag().equals("D")){
					deleteVoList.add(sinhVienVO[i]);
				}
			}
			
			if ( insertVoList.size() > 0 ) {
				dbDao.addmanageSinhVienS(insertVoList);
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifymanageSinhVienS(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removemanageSinhVienS(deleteVoList);
			}
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	public List<SinhVienVO> searchKhoaHoc() throws DAOException, EventException {
		try {
			return dbDao.searchKhoaHoc();
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
	public List<SinhVienVO> searchKhoaHocDetails() throws DAOException, EventException {
		try {
			return dbDao.searchKhoaHocDetails();
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
	}
	
}