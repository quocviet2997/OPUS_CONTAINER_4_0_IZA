/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Vessel_SKD_01BCImpl.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-07
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-07 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel_skd.basic;

import java.sql.SQLException;

import com.clt.bizcommon.vessel_skd.event.ComEns0B1EventResponse;
import com.clt.bizcommon.vessel_skd.integration.VesselSKDDBDAO;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyunsu, Ryu
 * @see COM_ENS_0B1EventResponse,Vessel_SKD_01BC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class VesselSKDBCImpl   extends BasicCommandSupport implements VesselSKDBC {

    // Database Access Object
    private transient VesselSKDDBDAO dbDao=null;

    /**
     * Vessel_SKD_01BCImpl 객체 생성<br>
     * Vessel_SKD_01DBDAO를 생성한다.<br>
     */
    public VesselSKDBCImpl(){
        dbDao = new VesselSKDDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Vessel_SKD_01화면에 대한 조회 이벤트 처리<br>
     * @param Event e
     * @return DBRowSet
     * @exception EventException
     */
    public DBRowSet searchVessel_SKDList( Event e ) throws EventException {
        DBRowSet rowSet=null; // 데이터 전송을 위해 DB ResultSet을 구현한 객체
        int cnt  = 0; 
        
        try {
        	cnt    = dbDao.totalVessel_SKD_01(e);
            rowSet = dbDao.searchVessel_SKD_01List(e);
            rowSet.setMaxRows(cnt);
			return rowSet;
        } catch (SQLException e1) {
        	log.error("err "+e1.toString(),e1);
            throw new EventException(e1.getMessage());
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
		} catch (Exception e2) {
			log.error("err "+e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
    }


    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Vessel_SKD_01업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }

}