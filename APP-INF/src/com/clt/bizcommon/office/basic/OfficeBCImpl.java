/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeBCImpl.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.office.basic;

import java.util.List;

import com.clt.bizcommon.office.integration.OfficeDBDAO;
import com.clt.bizcommon.office.vo.SearchOfficeListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyunsu, Ryu
 * @see COM_ENS_071EventResponse,OfficeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class OfficeBCImpl   extends BasicCommandSupport implements OfficeBC {

    // Database Access Object
    private transient OfficeDBDAO dbDao=null;

    /**
     * OfficeBCImpl 객체 생성<br>
     * OfficeDBDAO를 생성한다.<br>
     */
    public OfficeBCImpl(){
        dbDao = new OfficeDBDAO();
    }

	/**
	 * 조회 이벤트 처리<br>
	 * @param locCd
	 * @param ofcLev
	 * @param ofcPtsCd
	 * @param ofcCd
	 * @param ofcNm
	 * @param calltype
	 * @param iPage
	 * @param ofcAddr
	 * @return List<SearchOfficeListVO>
	 * @throws EventException
	 */
    public List<SearchOfficeListVO> searchOfficeList(String locCd, String ofcLev, String ofcPtsCd, String ofcCd, String ofcNm, String calltype, int iPage, String ofcAddr) throws EventException {
        try {
			return dbDao.searchOfficeList(locCd, ofcLev, ofcPtsCd, ofcCd, ofcNm, calltype, iPage, ofcAddr);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }

    }
    
    /**
	 * 조회 이벤트 처리<br>
	 * @param locCd
	 * @param ofcLev
	 * @param ofcPtsCd
	 * @param ofcCd
	 * @param ofcNm
	 * @param calltype
	 * @param iPage
	 * @param ofcAddr
	 * @param mdmYN
	 * @param deltFlg
	 * @return List<SearchOfficeListVO>
	 * @throws EventException
	 */
    public List<SearchOfficeListVO> searchOfficeList(String locCd, String ofcLev, String ofcPtsCd, String ofcCd, String ofcNm, String calltype, int iPage, String ofcAddr, String mdmYN, String deltFlg) throws EventException {
    	try {
    		return dbDao.searchOfficeList(locCd, ofcLev, ofcPtsCd, ofcCd, ofcNm, calltype, iPage, ofcAddr, mdmYN, deltFlg);
    	} catch (DAOException de) {
    		log.error("err "+de.toString(),de);
    		throw new EventException(de.getMessage());
    	}catch(Exception ex){
    		log.error("err "+ex.toString(),ex);
    		throw new EventException(ex.getMessage());
    	}
    	
    }



    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Office업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}