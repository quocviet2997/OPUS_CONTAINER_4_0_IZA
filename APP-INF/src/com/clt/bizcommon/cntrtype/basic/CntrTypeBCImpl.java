/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CntrTypeBCImpl.java
*@FileTitle : CntrType
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-17
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-17 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrtype.basic;

import java.util.List;

import com.clt.bizcommon.cntrtype.integration.CntrTypeDBDAO;
import com.clt.bizcommon.cntrtype.vo.MdmCntrTpListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0N1EventResponse,CntrTypeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CntrTypeBCImpl   extends BasicCommandSupport implements CntrTypeBC {

	// Database Access Object
	private transient CntrTypeDBDAO dbDao=null;

	/**
	 * CntrTypeBCImpl 객체 생성<br>
	 * CntrTypeDBDAO를 생성한다.<br>
	 */
	public CntrTypeBCImpl(){
		dbDao = new CntrTypeDBDAO();
	}
		
	/**
	 * 조회 이벤트 처리<br>
	 * Container Type Code Pop-up화면에 대한 조회 이벤트 처리<br>
	 * @param MdmCntrTpListVO mdmCntrTpListVO
	 * @return List<MdmCntrTpListVO> 
	 * @exception EventException
	 */
	public List<MdmCntrTpListVO> searchMdmCntrTpList(MdmCntrTpListVO mdmCntrTpListVO) throws EventException {
        List<MdmCntrTpListVO> list = null;
        
        try {
        	list   = dbDao.searchMdmCntrTpList(mdmCntrTpListVO);
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
	 * CntrType업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}