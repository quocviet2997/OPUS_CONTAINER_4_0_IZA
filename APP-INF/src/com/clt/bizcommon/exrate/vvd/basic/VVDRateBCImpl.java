/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : MonthlyBCImpl.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.vvd.basic;

import java.util.List;

import com.clt.bizcommon.exrate.vvd.integration.VVDRateDBDAO;
import com.clt.bizcommon.exrate.vvd.vo.VVDListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;



/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0E1EventResponse,MonthlyBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class VVDRateBCImpl   extends BasicCommandSupport implements VVDRateBC {

	// Database Access Object
	private transient VVDRateDBDAO dbDao=null;

	/**
	 * MonthlyBCImpl 객체 생성<br>
	 * MonthlyDBDAO를 생성한다.<br>
	 */
	public VVDRateBCImpl(){
		dbDao = new VVDRateDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Monthly화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param VVDListVO vvdListVO
	 * @param int iPage
	 * @return List<VVDListVO>
	 * @exception EventException
	 */
	public List<VVDListVO> searchVVDRateList(VVDListVO vvdListVO, int iPage) throws EventException {
        int cnt = 0;
        List<VVDListVO> list = null;
        try {
        	cnt    = dbDao.totalVVDRate(vvdListVO);
        	list   = dbDao.searchVVDRateList(vvdListVO, iPage);
        	if(list.size()>0){
        		list.get(0).setMaxRows(cnt);
        	}
			return list;
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
	 * Monthly업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}