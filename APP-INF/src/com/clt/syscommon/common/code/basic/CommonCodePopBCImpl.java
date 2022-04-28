/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePopBCImpl.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.code.basic;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.code.event.CommonCodePopEvent;
import com.clt.syscommon.common.code.event.CommonCodePopEventResponse;
import com.clt.syscommon.common.code.integration.CommonCodePopDBDAOSQL;
import com.clt.syscommon.common.table.COM_INTG_CD_DTL;



/**
 * NIS-System Common Business Logic Basic Command implementation<br>
 * - NIS-System Common에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author HOESOO_JANG
 * @see CommonCodePopEventResponse,CommonCodePopBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CommonCodePopBCImpl   extends BasicCommandSupport implements CommonCodePopBC {

	// Database Access Object
	private transient CommonCodePopDBDAOSQL dbDao=null;

	/**
	 * CommonCodePopBCImpl 객체 생성<br>
	 * CommonCodePopDBDAOSQL를 생성한다.<br>
	 */
	public CommonCodePopBCImpl(){
		dbDao = new CommonCodePopDBDAOSQL();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * CommonCodePop화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param e CommonCodePopEvent
	 * @return EventResponse CommonCodePopEventResponse
	 * @exception EventException
	 */
	public EventResponse searchCommonCodePop(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		CommonCodePopEvent event=(CommonCodePopEvent)e;
		
		// 데이터 전송을 위해 DB ResultSet을 구현한 객체
		DBRowSet rowSet=null;
		
		try {
			rowSet=dbDao.searchCommonCodePop(event.getCOM_INTG_CD_DTL());
			return new CommonCodePopEventResponse(rowSet,"SUCCESS");
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * System Common 업무 시나리오 마감작업<br>
	 * CommonCodePop업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}