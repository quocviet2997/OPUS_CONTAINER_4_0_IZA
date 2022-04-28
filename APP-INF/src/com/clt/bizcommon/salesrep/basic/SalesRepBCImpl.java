/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SalesRepBC.java
*@FileTitle : SalesRep
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : Kim Yong Jin
*@LastVersion : 1.0
* 2012-02-21 Kim Yong Jin
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.salesrep.basic;

import java.util.List;

import com.clt.bizcommon.salesrep.integration.SalesRepDBDAO;
import com.clt.bizcommon.salesrep.vo.SalesRepListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Kim Yong Jin
 * @see COM_COM_0008EventResponse,SalesRepBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class SalesRepBCImpl   extends BasicCommandSupport implements SalesRepBC {

	// Database Access Object
	private transient SalesRepDBDAO dbDao=null;

	/**
	 * SalesRepBCImpl 객체 생성<br>
	 * SalesRepDBDAO 생성한다.<br>
	 */
	public SalesRepBCImpl(){
		dbDao = new SalesRepDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Sales Rep화면에 대한 조회 이벤트 처리<br>
	 * @param SalesRepListVO salesRepListVO
	 * @return List<CountryListVO>
	 * @exception EventException
	 */
	public List<SalesRepListVO> searchSalesRepList(SalesRepListVO salesRepListVO) throws EventException {
		List<SalesRepListVO> list = null;
        int cnt = 0;
        
        try {
            list = dbDao.searchSalesRepList(salesRepListVO);
        	if(list.size()>0){
        		list.get(0).setMaxRows(cnt);
        	}
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
	 * Sales Rep업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}