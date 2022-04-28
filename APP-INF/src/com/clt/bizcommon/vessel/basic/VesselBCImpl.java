/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VesselBCImpl.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel.basic;

import java.util.List;

import com.clt.bizcommon.vessel.integration.VesselDBDAO;
import com.clt.bizcommon.vessel.vo.SearchVesselLIstVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author sangyool pak
 * @see COM_ENS_0A1EventResponse,VesselBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class VesselBCImpl   extends BasicCommandSupport implements VesselBC {

    // Database Access Object
    private transient VesselDBDAO dbDao=null;

    /**
     * VesselBCImpl 객체 생성<br>
     * VesselDBDAO를 생성한다.<br>
     */
    public VesselBCImpl(){
        dbDao = new VesselDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Vessel화면에 대한 조회 이벤트 처리<br>
     * @param String vslCd
     * @param String vslEngNm
     * @param String carCd
     * @param int iPage
     * @param String callSgnNo
     * @param String lloydNo
     * @return List<SearchVesselLIstVO>
     * @exception EventException
     */
    public List<SearchVesselLIstVO> searchVesselList(String vslCd, String vslEngNm, String carCd, int iPage , String callSgnNo, String lloydNo) throws EventException {
        try {
			return dbDao.searchVesselList(vslCd, vslEngNm, carCd, iPage , callSgnNo, lloydNo);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e2) {
			log.error("err "+e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
    }
    
    /**
     * Vessel List 조회<br>
     * @param String vslCd
     * @param String vslEngNm
     * @param String carCd
     * @param int iPage
     * @param String callSgnNo
     * @param String lloydNo
     * @param String mdmYN
     * @param String deltFlg
     * @param String fdrDiv_cd
     * @return List<SearchVesselLIstVO>
     * @throws EventException
     */
    public List<SearchVesselLIstVO> searchVesselList(String vslCd, String vslEngNm, String carCd, int iPage , String callSgnNo, String lloydNo, String mdmYN, String deltFlg, String fdrDiv_cd) throws EventException {
    	try {
    		return dbDao.searchVesselList(vslCd, vslEngNm, carCd, iPage , callSgnNo, lloydNo, mdmYN, deltFlg , fdrDiv_cd);
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
     * Vessel업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}