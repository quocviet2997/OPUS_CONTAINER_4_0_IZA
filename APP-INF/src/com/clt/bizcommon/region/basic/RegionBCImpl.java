/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : RegionBCImpl.java
*@FileTitle : Region
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-16
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-16 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.region.basic;

import java.util.List;

import com.clt.bizcommon.region.integration.RegionDBDAO;
import com.clt.bizcommon.region.vo.SearchRegionListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0J1EventResponse,RegionBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class RegionBCImpl   extends BasicCommandSupport implements RegionBC {

	// Database Access Object
	private transient RegionDBDAO dbDao=null;

	/**
	 * RegionBCImpl 객체 생성<br>
	 * RegionDBDAO를 생성한다.<br>
	 */
	public RegionBCImpl(){
		dbDao = new RegionDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Region화면에 대한 조회 이벤트 처리<br>
	 * @param SearchRegionListVO searchRegionListVO
	 * @param int iPage
	 * @return List<SearchRegionListVO>
	 * @exception EventException
	 */
	public List<SearchRegionListVO> searchRegionList(SearchRegionListVO searchRegionListVO, int iPage) throws EventException {
        int cnt = 0;
        List<SearchRegionListVO> list = null;
        
        try {
        	cnt    = dbDao.totalRegion(searchRegionListVO);
        	list   = dbDao.searchRegionList(searchRegionListVO, iPage);
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
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * Region업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}