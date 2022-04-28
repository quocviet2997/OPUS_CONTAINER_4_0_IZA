/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LeasingCompanyYardBCImpl.java
*@FileTitle : LeasingCompanyYard
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-16
*@LastModifier : Kim Min Soo
*@LastVersion : 1.0
* 2006-10-16 Kim Min Soo
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.leasingcompanyyard.basic;

import java.util.List;

import com.clt.bizcommon.leasingcompanyyard.integration.LeasingCompanyYardDBDAO;
import com.clt.bizcommon.leasingcompanyyard.vo.SearchLeasingCompanyYardListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Kim Min Soo
 * @see COM_CCD_0004EventResponse,LeasingCompanyYardBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class LeasingCompanyYardBCImpl   extends BasicCommandSupport implements LeasingCompanyYardBC {

	// Database Access Object
	private transient LeasingCompanyYardDBDAO dbDao=null;

	/**
	 * LeasingCompanyYardBCImpl 객체 생성<br>
	 * LeasingCompanyYardDBDAO를 생성한다.<br>
	 */
	public LeasingCompanyYardBCImpl(){
		dbDao = new LeasingCompanyYardDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * LeasingCompanyYard화면에 대한 조회 이벤트 처리<br>
	 * @param SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO
	 * @return List<SearchLeasingCompanyYardListVO>
	 * @exception EventException
	 */
	public List<SearchLeasingCompanyYardListVO> searchLeasingCompanyYardList(SearchLeasingCompanyYardListVO searchLeasingCompanyYardListVO) throws EventException {
        List<SearchLeasingCompanyYardListVO> list = null;
        
        try {
        	list   = dbDao.searchLeasingCompanyYardList(searchLeasingCompanyYardListVO);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e2) {
			log.error("err "+e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
		return list;
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * LeasingCompanyYard업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}