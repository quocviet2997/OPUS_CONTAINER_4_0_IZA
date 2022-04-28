/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RepCommodityBCImpl.java
*@FileTitle : RepCommodity
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.repcommodity.basic;

import java.sql.SQLException;
import java.util.List;

import com.clt.bizcommon.repcommodity.integration.RepCommodityDBDAO;
import com.clt.bizcommon.repcommodity.vo.SearchRepCommodityListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0K1EventResponse,RepCommodityBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class RepCommodityBCImpl   extends BasicCommandSupport implements RepCommodityBC {

	// Database Access Object
	private transient RepCommodityDBDAO dbDao=null;

	/**
	 * RepCommodityBCImpl 객체 생성<br>
	 * RepCommodityDBDAO를 생성한다.<br>
	 */
	public RepCommodityBCImpl(){
		dbDao = new RepCommodityDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * RepCommodity화면에 대한 조회 이벤트 처리<br>
	 * @param SearchRepCommodityListVO searchRepCommodityListVO
	 * @return List<SearchRepCommodityListVO>
	 * @exception EventException
	 */
	public List<SearchRepCommodityListVO> searchRepCommodityList(SearchRepCommodityListVO searchRepCommodityListVO) throws EventException {
        int cnt = 0;
        List<SearchRepCommodityListVO> list = null;
        
        try {
        	cnt    = dbDao.totalRepCommodity(searchRepCommodityListVO);
        	list   = dbDao.searchRepCommodityList(searchRepCommodityListVO);
        	if(list.size()>0){
        		list.get(0).setMaxRows(cnt);
        	}
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e) {
			log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
		}
		return list;
	}
	
	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * RepCommodity업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}