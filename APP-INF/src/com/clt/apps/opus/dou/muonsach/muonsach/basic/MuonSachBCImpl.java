/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MuonSachBCImpl.java
*@FileTitle : Muon Sach
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.muonsach.muonsach.basic;

import java.util.ArrayList;
import java.util.List;
import com.clt.apps.opus.dou.muonsach.muonsach.integration.MuonSachDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.apps.opus.dou.muonsach.muonsach.vo.MuonSachVO;

/**
 * ALPS-MuonSach Business Logic Command Interface<br>
 * - ALPS-MuonSach에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Vi Nguyen
 * @since J2EE 1.6
 */
public class MuonSachBCImpl extends BasicCommandSupport implements MuonSachBC {

	// Database Access Object
	private transient MuonSachDBDAO dbDao = null;

	/**
	 * MuonSachBCImpl 객체 생성<br>
	 * MuonSachDBDAO를 생성한다.<br>
	 */
	public MuonSachBCImpl() {
		dbDao = new MuonSachDBDAO();
	}
	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param MuonSachVO muonSachVO
	 * @return List<MuonSachVO>
	 * @exception EventException
	 */
	public List<MuonSachVO> searchMuonSach(MuonSachVO muonSachVO) throws EventException {
		try {
			return dbDao.searchMuonSach(muonSachVO);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
}