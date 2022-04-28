/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContractNoBCImpl.java
*@FileTitle : Contract No 조회
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-11
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-11 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.contractno.basic;

import java.util.List;

import com.clt.bizcommon.contractno.integration.ContractNoDBDAO;
import com.clt.bizcommon.contractno.vo.SearchContractNoListVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author sangyool pak
 * @see COM_ENS_021EventResponse,ContractNoBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ContractNoBCImpl   extends BasicCommandSupport implements ContractNoBC {

    // Database Access Object
    private transient ContractNoDBDAO dbDao=null;

    /**
     * ContractNoBCImpl 객체 생성<br>
     * ContractNoDBDAO를 생성한다.<br>
     */
    public ContractNoBCImpl(){
        dbDao = new ContractNoDBDAO();
    }
 
    
    /**
     * 조회 이벤트 처리<br>
     * Contract List 조회<br>
     * @param String contTp
     * @param String contNo
     * @param String custNm
     * @param String sdate
     * @param String edate
     * @param int iPage
     * @param String ofcCd
     * @param String  ctrtCustSlsOfcCd
     * @return List<SearchContractNoListVO>
     * @exception EventException
     */
    public List<SearchContractNoListVO> searchContractNoList(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofcCd,String  ctrtCustSlsOfcCd) throws EventException { 
        
        try {
			return dbDao.searchContractNoList(contTp, contNo, custNm, sdate, edate, iPage, ofcCd, ctrtCustSlsOfcCd);
        } catch (DAOException de) {
            log.error("err " + de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e2) {
        	log.error("err " + e2.toString(),e2);
            throw new EventException(e2.getMessage());
		}
    }    
    
    /**
     * Contract List 조회<br>
     * @param String contTp
     * @param String contNo
     * @param String custNm
     * @param String sdate
     * @param String edate
     * @param int iPage
     * @param String ofcCd
     * @param String  ctrtCustSlsOfcCd
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchContractNoListVO>
     * @exception EventException
     */
    public List<SearchContractNoListVO> searchContractNoList(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofcCd,String  ctrtCustSlsOfcCd , String mdmYN, String deltFlg) throws EventException { 
    	
    	try {
    		return dbDao.searchContractNoList(contTp, contNo, custNm, sdate, edate, iPage, ofcCd, ctrtCustSlsOfcCd, mdmYN, deltFlg);
    	} catch (DAOException de) {
    		log.error("err " + de.toString(),de);
    		throw new EventException(de.getMessage());
    	} catch (Exception e2) {
    		log.error("err " + e2.toString(),e2);
    		throw new EventException(e2.getMessage());
    	}
    }    
    
    /**
     * Contract List 조회<br>
     * @param String contTp
     * @param String contNo
     * @param String custNm
     * @param String sdate
     * @param String edate
     * @param int iPage
     * @param String ofcCd
     * @param String ctrtCustSlsOfcCd
     * @param String mdmYN
     * @param String deltFlg
     * @return List<SearchContractNoListVO>
     * @exception EventException
     */
    public List<SearchContractNoListVO> searchContractNoExcelList(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofcCd,String  ctrtCustSlsOfcCd, String mdmYN, String deltFlg) throws EventException{
    	try {
    		return dbDao.searchContractNoExcelList(contTp, contNo, custNm, sdate, edate, iPage, ofcCd, ctrtCustSlsOfcCd, mdmYN, deltFlg);
    	} catch (DAOException de) {
    		log.error("err " + de.toString(),de);
    		throw new EventException(de.getMessage());
    	} catch (Exception e2) {
    		log.error("err " + e2.toString(),e2);
    		throw new EventException(e2.getMessage());
    	}
    }

    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * ContractNo업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}