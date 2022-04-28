/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CustomerBCImpl.java
*@FileTitle : Customer
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-09
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-09 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.customer.basic;

import java.util.List;

import com.clt.bizcommon.customer.integration.CustomerDBDAO;
import com.clt.bizcommon.customer.vo.SearchCustomerVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author sangyool pak
 * @see COM_ENS_041EventResponse,CustomerBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CustomerBCImpl   extends BasicCommandSupport implements CustomerBC {

    // Database Access Object
    private transient CustomerDBDAO dbDao=null;

    /**
     * CustomerBCImpl 객체 생성<br>
     * CustomerDBDAO를 생성한다.<br>
     */
    public CustomerBCImpl(){
        dbDao = new CustomerDBDAO();
    }


	/**
	 * Customer List 조회<br>
	 * @param String custCd
	 * @param String custNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String include
	 * @param String cust
	 * @param String lgcyCd
	 * @param String lgcyNm
	 * @param String ctrtSrcCd
	 * @param String nmdCustFlg
	 * @return List<SearchCustomerVO>
	 * @throws EventException
	 */
    public List<SearchCustomerVO> searchCustomerList(String custCd, String custNm, String ofcCd, int iPage, String include, String cust, String lgcyCd, String lgcyNm, String ctrtSrcCd, String nmdCustFlg) throws EventException {
        try {
			return  dbDao.searchCustomerList(custCd, custNm, ofcCd, iPage, include, cust, lgcyCd, lgcyNm, ctrtSrcCd, nmdCustFlg);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
		} catch (Exception e2) {
			log.error("err "+e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
    }
    
    /**
	 * Customer List 조회<br>
	 * @param String custCd
	 * @param String custNm
	 * @param String ofcCd
	 * @param int iPage
	 * @param String include
	 * @param String cust
	 * @param String mdmYN
	 * @param String deltFlg
	 * @param String locCd
	 * @param String creditFlg
	 * @param String lgcyCd
	 * @param String lgcyNm
	 * @param String ctrtSrcCd
	 * @param String nmdCustFlg
	 * @return List<SearchCustomerVO>
	 * @throws EventException
	 */
    public List<SearchCustomerVO> searchCustomerList(String custCd, String custNm, String ofcCd, int iPage, String include, String cust , String mdmYN, String deltFlg, String locCd, String creditFlg, String lgcyCd, String lgcyNm, String ctrtSrcCd, String nmdCustFlg) throws EventException {
    	try {
    		return  dbDao.searchCustomerList(custCd, custNm, ofcCd, iPage, include, cust, mdmYN, deltFlg, locCd, creditFlg, lgcyCd, lgcyNm, ctrtSrcCd, nmdCustFlg);
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