/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : Vessel_SKD_02BCImpl.java
*@FileTitle : Vessel SKD조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-11 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvd.basic;

import java.util.List;

import com.clt.bizcommon.vvd.integration.VvdDBDAO;
import com.clt.bizcommon.vvd.vo.SearchVvdListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyunsu, Ryu
 * @see COM_ENS_0B2EventResponse,Vessel_SKD_02BC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class VvdBCImpl   extends BasicCommandSupport implements VvdBC {

    // Database Access Object
    private transient VvdDBDAO dbDao=null;

    /**
     * Vessel_SKD_02BCImpl 객체 생성<br>
     * Vessel_SKD_02DBDAO를 생성한다.<br> 
     */
    public VvdBCImpl(){
        dbDao = new VvdDBDAO();
    }


    
	/**
	 * 
	 * VVD 조회 <br>
	 * @param etDeta
	 * @param sdDate
	 * @param edDate
	 * @param vvdCd
	 * @param locCd
	 * @param laneCd
	 * @param oper
	 * @param iPage
	 * @return
	 * @throws EventException
	 */
    public List<SearchVvdListVO> searchVvdList(String etDeta, String sdDate, String edDate, String vvdCd, String locCd, String laneCd, String oper, int iPage) throws EventException {
        try {
			return dbDao.searchVvdList(etDeta, sdDate, edDate, vvdCd, locCd, laneCd, oper, iPage);
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
     * Vessel_SKD_02업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}