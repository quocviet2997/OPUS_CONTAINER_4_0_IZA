/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : NodeBCImpl.java
*@FileTitle : Node 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-17
*@LastModifier : Hyung Choon
*@LastVersion : 1.0
* 2006-08-17 Hyung Choon
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.node.basic;

import java.util.List;

import com.clt.bizcommon.node.integration.NodeDBDAO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * ENIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon
 * @see COM_ENS_061EventResponse,NodeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class NodeBCImpl   extends BasicCommandSupport implements NodeBC {

    // Database Access Object
    private transient NodeDBDAO dbDao=null;

    /**
     * NodeBCImpl 객체 생성<br>
     * NodeDBDAO를 생성한다.<br>
     */
    public NodeBCImpl(){
        dbDao = new NodeDBDAO();
    }

    /**
     * 조회 이벤트 처리<br>
     * Node화면에 대한 조회 이벤트 처리<br>
     * @param cntCd
     * @param locCd
     * @param ofcCd
     * @param nodeCd
     * @param nodeNm
     * @param mode
     * @param modeOnly
     * @param sccCd
     * @param iPage
     * @return List<SearchNodeListVO>
     * @throws EventException
     */
    public List<Object> searchNodeList(String cntCd, String locCd, String ofcCd, String nodeCd, String nodeNm, String mode, String modeOnly, String sccCd, int iPage) throws EventException {
        try {
			return dbDao.searchNodeList(cntCd, locCd, ofcCd, nodeCd, nodeNm, mode, modeOnly, sccCd, iPage);
        } catch (Exception de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Node화면에 대한 조회 이벤트 처리<br>
     * @param cntCd
     * @param locCd
     * @param ofcCd
     * @param nodeCd
     * @param nodeNm
     * @param mode
     * @param modeOnly
     * @param sccCd
     * @param iPage
     * @param mdmYN
     * @param deltFlg
     * @return List<SearchNodeListVO>
     * @throws EventException
     */
    public List<Object> searchNodeList(String cntCd, String locCd, String ofcCd, String nodeCd, String nodeNm, String mode, String modeOnly, String sccCd, int iPage, String mdmYN, String deltFlg) throws EventException {
    	try {
    		return dbDao.searchNodeList(cntCd, locCd, ofcCd, nodeCd, nodeNm, mode, modeOnly, sccCd, iPage, mdmYN, deltFlg);
    	} catch (Exception de) {
    		log.error("err "+de.toString(),de);
    		throw new EventException(de.getMessage());
    	}
    }

    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Node업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}