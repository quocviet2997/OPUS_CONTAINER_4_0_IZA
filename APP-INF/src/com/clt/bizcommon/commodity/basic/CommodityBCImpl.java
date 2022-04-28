/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : CommodityBCImpl.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.commodity.basic;

import java.util.List;

import com.clt.bizcommon.commodity.integration.CommodityDBDAO;
import com.clt.bizcommon.commodity.vo.SearchCmdtCdRepCmdtCdVO;
import com.clt.bizcommon.commodity.vo.SearchCommodityListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @date		2006.08.03
 * @author 		sungseok, choi
 * @see 		COM_ENS_011EventResponse,CommodityBC 각 DAO 클래스 참조
 * @since 		J2EE 1.4
 */
public class CommodityBCImpl   extends BasicCommandSupport implements CommodityBC {
    /**
     * Add Title	: Database Access Object 
     * Add Date		: 2006.08.03
     * Add Author	: sungseok, choi
     * @return		
     */
    private transient CommodityDBDAO dbDao=null;

    /**
     * Add Title	: CommodityBCImpl Object Creation
     * 				: CommodityDBDAO Creation 
     * Add Date		: 2006.08.03
     * Add Author	: sungseok, choi
     * @return		
     */
    public CommodityBCImpl(){
        dbDao = new CommodityDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Vessel화면에 대한 조회 이벤트 처리<br>
     * searchCommodityList
     * @param String cmdtCd
     * @param String repCmdtCd
     * @param String repImdgLvlCd
     * @param String cmdtNm
     * @param int iPage
     * @return List<SearchCommodityListVO>
     * @throws EventException
     */
    public List<SearchCommodityListVO> searchCommodityList(String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage) throws EventException {
        /**
         * Add Title	: Database ResultSet Object Creation of Data Transport 
         * Add Date		: 2006.08.03
         * Add Author	: sungseok, choi
         * @return		: 
         */
        
        try {
			return dbDao.searchCommodityList(cmdtCd, repCmdtCd, repImdgLvlCd, cmdtNm, iPage);
        } catch (DAOException de) {
            log.error("err " + de.toString(),de);
            throw new EventException(de.getMessage());
		} catch (Exception e2) {
			log.error("err " + e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
    }
    /**
     * 조회 이벤트 처리<br>
     * Vessel화면에 대한 조회 이벤트 처리<br>
     * searchCommodityList
     * @param String cmdtCd
     * @param String repCmdtCd
     * @param String repImdgLvlCd
     * @param String cmdtNm
     * @param int iPage
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchCommodityListVO>
     * @throws EventException
     */
    public List<SearchCommodityListVO> searchCommodityList(String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage, String mdmYN, String deltFlg) throws EventException {
    	
    	try {
    		return dbDao.searchCommodityList(cmdtCd, repCmdtCd, repImdgLvlCd, cmdtNm, iPage, mdmYN, deltFlg );
    	} catch (DAOException de) {
    		log.error("err " + de.toString(),de);
    		throw new EventException(de.getMessage());
    	} catch (Exception e2) {
    		log.error("err " + e2.toString(),e2);
    		throw new EventException(e2.getMessage());
    	}
    }

    
	/**
	 * Commodity Code를 입력하기 위해 Code를 검색(COM_ENS_012)  <br>
	 *  
	 * @param SearchCmdtCdRepCmdtCdVO   vo
	 * @return List<SearchCmdtCdRepCmdtCdVO>
	 * @exception EventException
	 */
	public List<SearchCmdtCdRepCmdtCdVO> searchCmdtCdRepCmdtCd(SearchCmdtCdRepCmdtCdVO vo) throws EventException {
		try {
			return dbDao.searchCmdtCdRepCmdtCd(vo);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(),ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(),ex);
		}
	}
	
	/**
	 * Commodity Code를 존재 유무 검색 위해 Code를 검색(Com_Ens_012)  <br>
	 *  
	 * @param MoreInfoVO   MoreInfoVO
	 * @return List<MoreInfoVO>
	 * @exception EventException
	 */
	/*public List<MoreInfoVO> checkCmdtCd(MoreInfoVO moreInfoVO) throws EventException {
		try {
			return dbDao.checkCmdtCd(moreInfoVO);
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(),ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(),ex);
		}
	}*/
	
	
    /**
     * Add Title	: BIZCOMMON 업무 시나리오 마감작업
     * 				: Commodity 업무 시나리오 종료 시 관련 내부 객체 해제 
     * Add Date		: 2006.08.03
     * Add Author	: sungseok, choi
     */
    public void doEnd() {
        dbDao = null;
    }
    
}