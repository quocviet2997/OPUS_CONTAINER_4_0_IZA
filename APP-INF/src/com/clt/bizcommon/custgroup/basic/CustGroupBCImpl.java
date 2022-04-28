/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : CustGroupBCImpl.java
*@FileTitle : CustGroup
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : sungho park
*@LastVersion : 1.0
* 2012-02-21 sungho park
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.custgroup.basic;

import java.util.List;

import com.clt.bizcommon.custgroup.integration.CustGroupDBDAO;
import com.clt.bizcommon.custgroup.vo.SearchCustGroupVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author sungho park
 * @see COM_COM_006EventResponse,CustGroupBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CustGroupBCImpl   extends BasicCommandSupport implements CustGroupBC {

    // Database Access Object
    private transient CustGroupDBDAO dbDao=null;

    /**
     * CustGroupBCImpl 객체 생성<br>
     * CustGroupDBDAO를 생성한다.<br>
     */
    public CustGroupBCImpl(){
        dbDao = new CustGroupDBDAO();
    }


	/**
	 * CustGroup List 조회<br>
	 * @param String custGrpId
	 * @param String custGrpNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String mdmYn
	 * @param String deltFlg
	 * @param String custGrpAbbrNm
	 * @return List<SearchCustGroupVO>
	 * @throws EventException
	 */
    public List<SearchCustGroupVO> searchCustGroupList(String custGrpId, String custGrpNm, String ofcCd, int iPage, String mdmYn, String deltFlg, String custGrpAbbrNm) throws EventException {
        try {
			return  dbDao.searchCustGroupList(custGrpId, custGrpNm, ofcCd, iPage, mdmYn, deltFlg, custGrpAbbrNm);
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
     * Customer업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}