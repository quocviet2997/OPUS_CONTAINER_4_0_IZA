/*=========================================================
*	Copyright(c) 2006 CyberLogitec
*	@FileName 			: ServiceProviderBCImpl.java
*	@FileTitle 			: ServiceProvider정보조회(공통 Popup)
*	Open Issues			:
*	Change history		:
*	@LastModifyDate 	: 2006-08-07
*	@LastModifier 		: sungseok, choi
*	@LastVersion 		: 1.0
*	2006-08-07 sungseok, choi
*	1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.serviceprovider.basic;

import java.sql.SQLException;
import java.util.List;

import com.clt.bizcommon.serviceprovider.integration.ServiceProviderDBDAO;
import com.clt.bizcommon.serviceprovider.vo.SpListVO;
import com.clt.bizcommon.staff.vo.SearchStaffListVO;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 *	ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 *	ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 *  
 *	@author 	sungseok, choi
 *	@see 		COM_ENS_0C1EventResponse,ServiceProviderBC 각 DAO 클래스 참조
 *	@since 		J2EE 1.4
 */
public class ServiceProviderBCImpl   extends BasicCommandSupport implements ServiceProviderBC {

    //	Database Access Object
    private transient ServiceProviderDBDAO dbDao=null;

    /**
     *	ServiceProviderBCImpl 객체 생성<br>
     *	ServiceProviderDBDAO를 생성한다.<br>
     */
    public ServiceProviderBCImpl(){
        dbDao = new ServiceProviderDBDAO();
    }

    /**
     *	조회 이벤트 처리<br>
     *	ServiceProvider화면에 대한 조회 이벤트 처리<br>
     * @param SpListVO spListVO
	 * @param int iPage
     * @return List<SpListVO>
     *	@exception EventException
     */
    public List<SpListVO> searchServiceProviderList(SpListVO spListVO, int iPage) throws EventException {
    	//	데이터 전송을 위해 DB ResultSet을 구현한 객체
    	//DBRowSet rowSet=null; 
    	List<SpListVO> list = null;
        int cnt  = 0; 
        
        try {
        	cnt    = dbDao.totalServiceProvider(spListVO);
            list   = dbDao.searchServiceProviderList(spListVO, iPage);
            
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
     *	BIZCOMMON 업무 시나리오 마감작업<br>
     *	ServiceProvider업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}
