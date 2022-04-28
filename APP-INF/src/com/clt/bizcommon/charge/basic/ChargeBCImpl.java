/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ChargeBCImpl.java
*@FileTitle : Charge
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-20
*@LastModifier : JunBum Lee
*@LastVersion : 1.0
* 202-02-20 JunBum Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.charge.basic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.clt.bizcommon.charge.integration.ChargeDBDAO;
import com.clt.bizcommon.charge.vo.ChargeListVO;
import com.clt.bizcommon.charge.vo.RepChargeVO;
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
 * @see COM_ENS_0N1EventResponse,ChargeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ChargeBCImpl   extends BasicCommandSupport implements ChargeBC {

	// Database Access Object
	private transient ChargeDBDAO dbDao=null;

	/**
	 * ChargeBCImpl 객체 생성<br>
	 * ChargeDBDAO를 생성한다.<br>
	 */
	public ChargeBCImpl(){
		dbDao = new ChargeDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Charge화면에 대한 조회 이벤트 처리<br>
	 * @param ChargeListVO chargeListVO
	 * @param int iPage
	 * @return List<ChargeListVO>
	 * @exception EventException
	 */
	public List<ChargeListVO> searchChargeList(ChargeListVO chargeListVO, int iPage) throws EventException {
        int cnt = 0;
        List<ChargeListVO> list = null;
        
        try {
        	cnt    = dbDao.totalCharge(chargeListVO);
        	list   = dbDao.searchChargeList(chargeListVO, iPage);
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
	 * 조회 이벤트 처리<br>
	 * Rep.Charge화면에 대한 조회 이벤트 처리<br>
	 * @return List<RepChargeVO>
	 * @exception EventException
	 */
	public List<RepChargeVO> searchRepChgCd() throws EventException {
        try {
			return dbDao.searchRepChgCd();
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
	 * Charge업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}