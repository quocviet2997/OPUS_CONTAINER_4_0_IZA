/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : SubContinentBCImpl.java
*@FileTitle : SubContinent
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-16
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-16 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.scontinent.basic;

import java.util.List;

import com.clt.bizcommon.scontinent.integration.SubContinentDBDAO;
import com.clt.bizcommon.scontinent.vo.SearchSubContinentListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0I1EventResponse,scontinentBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class SubContinentBCImpl   extends BasicCommandSupport implements SubContinentBC {

	// Database Access Object
	private transient SubContinentDBDAO dbDao=null;

	/**
	 * scontinentBCImpl 객체 생성<br>
	 * scontinentDBDAO를 생성한다.<br>
	 */
	public SubContinentBCImpl(){
		dbDao = new SubContinentDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * scontinent화면에 대한 조회 이벤트 처리<br>
	 * @param SearchSubContinentListVO searchSubContinentListVO
	 * @param int iPage
	 * @return List<SearchSubContinentListVO>
	 * @exception EventException
	 */
	public List<SearchSubContinentListVO> searchSubContinentList(SearchSubContinentListVO searchSubContinentListVO, int iPage) throws EventException {
        int cnt = 0;
        List<SearchSubContinentListVO> list = null;
        
        try {
        	cnt    = dbDao.totalContinent(searchSubContinentListVO);
        	list = dbDao.searchSubContinentList(searchSubContinentListVO, iPage);
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
	 * scontinent업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}