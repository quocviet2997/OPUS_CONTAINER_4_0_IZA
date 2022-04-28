/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : LocationBCImpl.java
*@FileTitle : Location조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-03
*@LastModifier : HyungChoonRoh
*@LastVersion : 1.0
* 2006-08-03 HyungChoonRoh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.location.basic;

import java.util.List;

import com.clt.bizcommon.location.event.ComEns051Event;
import com.clt.bizcommon.location.integration.LocationDBDAO;
import com.clt.bizcommon.location.vo.SearchLocationDetailVO;
import com.clt.bizcommon.location.vo.SearchLocationListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author HyungChoonRoh
 * @see COM_ENS_051EventResponse,LocationBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class LocationBCImpl   extends BasicCommandSupport implements LocationBC {

    // Database Access Object
    private transient LocationDBDAO dbDao=null;

    /**
     * LocationBCImpl 객체 생성<br>
     * LocationDBDAO를 생성한다.<br>
     */
    public LocationBCImpl(){
        dbDao = new LocationDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Location화면에 대한 조회 이벤트 처리<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage) throws EventException {
        try {
			return dbDao.searchLocationList(locCd, locNm, unLocIndCd, cntCd, locEqOfc, select, rccCd, lccCd, locState, iPage);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }
    
    /**
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage, String mdmYN, String deltFlg) throws EventException {
    	try {
    		return dbDao.searchLocationList(locCd, locNm, unLocIndCd, cntCd, locEqOfc, select, rccCd, lccCd, locState, iPage, mdmYN, deltFlg);
    	} catch (DAOException de) {
    		log.error("err "+de.toString(),de);
    		throw new EventException(de.getMessage());
    	}catch(Exception ex){
    		log.error("err "+ex.toString(),ex);
    		throw new EventException(ex.getMessage());
    	}
    }
    
    /**
     * Location의 모든 목록을 가져온다.<br>
     * @param String locCd
     * @param String locNm
     * @param String unLocIndCd
     * @param String cntCd
     * @param String locEqOfc
     * @param String select
     * @param String rccCd
     * @param String lccCd
     * @param String locState
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @param String sccFlg
     * @return List<SearchLocationListVO>
     * @throws DAOException
     */
    public List<SearchLocationListVO> searchLocationList(String locCd, String locNm, String unLocIndCd, String cntCd, String locEqOfc, String select, String rccCd, String lccCd, String locState, int iPage, String mdmYN, String deltFlg, String sccFlg) throws EventException {
    	try {
    		return dbDao.searchLocationList(locCd, locNm, unLocIndCd, cntCd, locEqOfc, select, rccCd, lccCd, locState, iPage, mdmYN, deltFlg, sccFlg);
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
     * Location화면에 대한 조회 이벤트 처리<br>
     * 
     * @param locCd
     * @return List<SearchLocationDetailVO>
     * @exception EventException
     */
    public List<SearchLocationDetailVO> searchLocationDetail(String locCd) throws EventException {
        try {
			return dbDao.searchLocationDetail(locCd);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }
    
    /**
     * 
     * @param ComEns051Event event
     * @return List<SearchLocationDetailVO>
     * @Exception EventException
     */
    public List<SearchLocationDetailVO> searchLocationDetail(ComEns051Event event) throws EventException {
    	
    	try {
    		return dbDao.searchLocationDetail(event);
    	} catch (DAOException de) {
    		log.error("err "+de.toString(),de);
    		throw new EventException(de.getMessage());
    	}catch(Exception ex){
    		log.error("err "+ex.toString(),ex);
    		throw new EventException(ex.getMessage());
    	}
    }
    
    /**
	 * RCC, LCC <br>
	 * 
	 * @param String loc_grp_cd
	 * @param String loc_cd
	 * @return CommonRsVO
	 * @exception EventException
	 */	
//	public CommonRsVO searchRccLccCd(String loc_grp_cd, String loc_cd) throws EventException{
//		try {
//			return dbDao.searchRccLccCd(loc_grp_cd,  loc_cd);
//		} catch(DAOException ex) {
//			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
//		} catch (Exception ex) {
//			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
//		}
//	}
    
}