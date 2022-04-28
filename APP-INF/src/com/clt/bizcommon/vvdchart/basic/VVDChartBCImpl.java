/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VVDChartBCImpl.java
*@FileTitle : VVDChart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-19
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-19 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvdchart.basic;

import java.util.List;

import com.clt.bizcommon.vvdchart.integration.VVDChartDBDAO;
import com.clt.bizcommon.vvdchart.vo.VVDChartListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/** 
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0P1EventResponse,VVDChartBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class VVDChartBCImpl   extends BasicCommandSupport implements VVDChartBC {

	// Database Access Object
	private transient VVDChartDBDAO dbDao=null;

	/**
	 * VVDChartBCImpl 객체 생성<br>
	 * VVDChartDBDAO를 생성한다.<br>
	 */
	public VVDChartBCImpl(){
		dbDao = new VVDChartDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * VVDChart화면에 대한 조회 이벤트 처리<br>
	 * @param String scnr_id
	 * @param String depth
	 * @param String chkDepth
	 * @return List<VVDChartListVO>
	 * @exception EventException
	 */
	public List<VVDChartListVO> searchVVDChartList(String scnr_id, String depth, String chkDepth) throws EventException {
		List<VVDChartListVO> list = null;
        try {
        	list = dbDao.searchVVDChartList(scnr_id, depth, chkDepth);
            return list;
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}
	
	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * VVDChart업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}