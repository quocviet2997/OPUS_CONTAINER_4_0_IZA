/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : EQOrgChartBCImpl.java
*@FileTitle : EQ Organization Chart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-11
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-11 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.eqorgchart.basic;

import java.util.List;

import com.clt.bizcommon.eqorgchart.integration.EQOrgChartDBDAO;
import com.clt.bizcommon.eqorgchart.vo.EQQrgChartListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0O1EventResponse,EQOrgChartBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class EQOrgChartBCImpl   extends BasicCommandSupport implements EQOrgChartBC {

	// Database Access Object
	private transient EQOrgChartDBDAO dbDao=null;

	/**
	 * EQOrgChartBCImpl 객체 생성<br>
	 * EQOrgChartDBDAO를 생성한다.<br>
	 */
	public EQOrgChartBCImpl(){
		dbDao = new EQOrgChartDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * EQOrgChart화면에 대한 조회 이벤트 처리<br>
	 * @param String depth
	 * @param String chkDepth
	 * @param String sccFlag
	 * @return List<EQQrgChartListVO>
	 * @exception EventException
	 */
	public List<EQQrgChartListVO> searchEQOrgChartList(String depth, String chkDepth, String sccFlag) throws EventException {
		List<EQQrgChartListVO> list = null;
		int cnt = 0;
        
        try {
        	cnt    = dbDao.totalEQOrgChartList(depth, chkDepth, sccFlag);
        	list   = dbDao.searchEQOrgChartList(depth, chkDepth, sccFlag);
            
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
	 * EQOrgChart업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}