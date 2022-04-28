/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CarrierBCImpl.java
*@FileTitle : Carrier
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.carrier.basic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.bizcommon.carrier.integration.CarrierDBDAO;
import com.clt.bizcommon.carrier.vo.CarrierListVO;
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
 * @see COM_ENS_0N1EventResponse,CarrierBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CarrierBCImpl   extends BasicCommandSupport implements CarrierBC {

	// Database Access Object
	private transient CarrierDBDAO dbDao=null;

	/**
	 * CarrierBCImpl 객체 생성<br>
	 * CarrierDBDAO를 생성한다.<br>
	 */
	public CarrierBCImpl(){
		dbDao = new CarrierDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Carrier화면에 대한 조회 이벤트 처리<br>
	 * @param CarrierListVO carrierListVO
	 * @param int iPage
	 * @return List<CarrierListVO>
	 * @exception EventException
	 */
	public List<CarrierListVO> searchCarrierList(CarrierListVO carrierListVO, int iPage) throws EventException {
        int cnt = 0;
        List<CarrierListVO> list = null;
        
        try {
        	cnt    = dbDao.totalCarrier(carrierListVO);
        	list   = dbDao.searchCarrierList(carrierListVO, iPage);
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
	 * @param Event e
	 * @return ArrayList<String>
	 */
	public ArrayList<String> setDefaultComboData(Event e) throws EventException {
		ArrayList<String> code = new ArrayList<String>();
        try {
        	code.add(dbDao.searchContinentCode(e));
        	code.add(dbDao.searchSubContinentCode(e));
			return code;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}
	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * Carrier업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}