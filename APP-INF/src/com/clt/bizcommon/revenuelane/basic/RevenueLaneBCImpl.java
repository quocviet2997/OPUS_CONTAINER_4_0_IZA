/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RevenueLaneBCImpl.java
*@FileTitle : ZONE CODE 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier :SEOK JIN
*@LastVersion : 1.0
* 2012-02-21 SEOK JIN
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.revenuelane.basic;

import java.util.List;

import com.clt.bizcommon.revenuelane.integration.RevenueLaneDBDAO;
import com.clt.bizcommon.revenuelane.vo.SearchRevenueLaneListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon
 * @see COM_ENS_081EventResponse,LaneBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class RevenueLaneBCImpl   extends BasicCommandSupport implements RevenueLaneBC {

    // Database Access Object
    private transient RevenueLaneDBDAO dbDao=null;

    /**
     * RevenueLaneBCImpl 객체 생성<br>
     * RevenueLaneDBDAO를 생성한다.<br>
     */
    public RevenueLaneBCImpl(){
        dbDao = new RevenueLaneDBDAO();
    }

    /**
     * RevenueLane List 조회<br>
     * @param rlaneCd
     * @param rlaneNm
     * @param status
     * @return List<SearchRevenueLaneListVO>
     * @throws EventException
     */
    public List<SearchRevenueLaneListVO> searchRevenueLaneList(String rlaneCd, String rlaneNm, String status) throws EventException {
        try {
			return dbDao.searchRevenueLaneList(rlaneCd, rlaneNm, status);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
    }
    
    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * RevenueLane업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}