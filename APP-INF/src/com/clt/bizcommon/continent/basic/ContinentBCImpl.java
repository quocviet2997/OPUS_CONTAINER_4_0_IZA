/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContinentBCImpl.java
*@FileTitle : Service Scope
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-13
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-13 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.continent.basic;

import java.util.List;

import com.clt.bizcommon.continent.integration.ContinentDBDAO;
import com.clt.bizcommon.continent.vo.SearchContinentListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0H1EventResponse,ContinentBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ContinentBCImpl   extends BasicCommandSupport implements ContinentBC {

	// Database Access Object
	private transient ContinentDBDAO dbDao=null;

	/**
	 * ContinentBCImpl 객체 생성<br>
	 * ContinentDBDAO를 생성한다.<br>
	 */
	public ContinentBCImpl(){
		dbDao = new ContinentDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Continent화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return List<SearchContinentListVO>
	 * @exception EventException
	 */
	public List<SearchContinentListVO> searchContinentList() throws EventException {
		List<SearchContinentListVO> list = null;
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalContinent();
        	list   = dbDao.searchContinentList();
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
	 * 조회 이벤트 처리<br>
	 * Continent화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param SearchContinentListVO vo
	 * @return List<SearchContinentListVO>
	 * @exception EventException
	 */
	public List<SearchContinentListVO> searchContinentList( SearchContinentListVO vo) throws EventException {
		List<SearchContinentListVO> list = null;
        int cnt = 0;
        
        try {
        	cnt    = dbDao.totalContinent(vo);
        	list   = dbDao.searchContinentList(vo);
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
	 * Continent업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}

}