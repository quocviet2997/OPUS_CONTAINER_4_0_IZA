/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CntrSizeBCImpl.java
*@FileTitle :CntrSize
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrsize.basic;

import java.util.ArrayList;
import java.util.List;


import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.bizcommon.cntrsize.integration.CntrSizeDBDAO;
import com.clt.bizcommon.cntrsize.vo.MdmCntrSzListVO;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0N1EventResponse,CntrSizeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CntrSizeBCImpl   extends BasicCommandSupport implements CntrSizeBC {

	// Database Access Object
	private transient CntrSizeDBDAO dbDao=null;

	/**
	 * CntrSizeBCImpl 객체 생성<br>
	 * CntrSizeDBDAO를 생성한다.<br>
	 */
	public CntrSizeBCImpl(){
		dbDao = new CntrSizeDBDAO();
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Container Size Code Pop-up화면에 대한 조회 이벤트 처리<br>
	 * @param MdmCntrSzListVO mdmCntrSzListVO
	 * @return List<MdmCntrSzListVO>
	 * @exception EventException
	 */
	public List<MdmCntrSzListVO> searchMdmCntrSzList(MdmCntrSzListVO mdmCntrSzListVO) throws EventException {
        List<MdmCntrSzListVO> list = null;
        
        try {
        	list   = dbDao.searchMdmCntrSzList(mdmCntrSzListVO);
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
	 * CntrSize업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}