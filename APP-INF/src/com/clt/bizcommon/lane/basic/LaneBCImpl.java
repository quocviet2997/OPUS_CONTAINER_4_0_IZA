/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LaneBCImpl.java
*@FileTitle : Lane 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-09 Hyung Choon
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.lane.basic;

import java.util.List;

import com.clt.bizcommon.lane.integration.LaneDBDAO;
import com.clt.bizcommon.lane.vo.SearchLaneListVO;
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
public class LaneBCImpl   extends BasicCommandSupport implements LaneBC {

    // Database Access Object
    private transient LaneDBDAO dbDao=null;

    /**
     * LaneBCImpl 객체 생성<br>
     * LaneDBDAO를 생성한다.<br>
     */
    public LaneBCImpl(){
        dbDao = new LaneDBDAO();
    }

    /**
     * Lane List 조회<br>
     * @param tradeCd
     * @param subTradeCd
     * @param svcTp
     * @param laneCd
     * @param laneNm
     * @param mode
     * @param iPage
     * @return List<SearchLaneListVO>
     * @throws EventException
     */
    public List<SearchLaneListVO> searchLaneList(String tradeCd, String subTradeCd, String svcTp, String laneCd, String laneNm, String mode, int iPage) throws EventException {
        try {
			return dbDao.searchLaneList(tradeCd, subTradeCd, svcTp, laneCd, laneNm, mode, iPage);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
    }
    
    /**
     * Lane List 조회<br>
     * @param tradeCd
     * @param subTradeCd
     * @param svcTp
     * @param laneCd
     * @param laneNm
     * @param mode
     * @param iPage
     * @param mdmYN
     * @param deltFlg
     * @return List<SearchLaneListVO>
     * @throws EventException
     */
    public List<SearchLaneListVO> searchLaneList(String tradeCd, String subTradeCd, String svcTp, String laneCd, String laneNm, String mode, int iPage, String mdmYN, String deltFlg) throws EventException {
    	try {
    		return dbDao.searchLaneList(tradeCd, subTradeCd, svcTp, laneCd, laneNm, mode, iPage, mdmYN, deltFlg);
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
     * Lane업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}