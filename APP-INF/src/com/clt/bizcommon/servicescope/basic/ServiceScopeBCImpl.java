/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ServiceScopeBCImpl.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.servicescope.basic;

import java.sql.SQLException;
import java.util.List;

import com.clt.bizcommon.servicescope.integration.ServiceScopeDBDAO;
import com.clt.bizcommon.servicescope.vo.SearchServiceScopeListVO;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0L1EventResponse,ServiceScopeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ServiceScopeBCImpl   extends BasicCommandSupport implements ServiceScopeBC {

	// Database Access Object
	private transient ServiceScopeDBDAO dbDao=null;

	/**
	 * ServiceScopeBCImpl 객체 생성<br>
	 * ServiceScopeDBDAO를 생성한다.<br>
	 */
	public ServiceScopeBCImpl(){
		dbDao = new ServiceScopeDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * ServiceScope화면에 대한 조회 이벤트 처리<br>
	 * @param SearchServiceScopeListVO searchServiceScopeListVO
	 * @param int iPage
	 * @return List<SearchServiceScopeListVO>
	 * @exception EventException
	 */
	public List<SearchServiceScopeListVO> searchServiceScopeList(SearchServiceScopeListVO searchServiceScopeListVO, int iPage) throws EventException {
        int cnt = 0;
        List<SearchServiceScopeListVO> list = null;
        
        try {
        	cnt    = dbDao.totalServiceScope(searchServiceScopeListVO);
            list   = dbDao.searchServiceScopeList(searchServiceScopeListVO, iPage);
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
	 * ServiceScope업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}