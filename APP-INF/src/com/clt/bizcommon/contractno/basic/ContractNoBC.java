/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : ContractNoBC.java
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

import com.clt.bizcommon.contractno.vo.SearchContractNoListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author sangyool pak
 * @see ComEns021EventResponse 참조
 * @since J2EE 1.4
 */
public interface ContractNoBC  {

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
     * @return List<SearchContractNoListVO>
     * @exception EventException
     */
    public List<SearchContractNoListVO> searchContractNoList(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofcCd,String  ctrtCustSlsOfcCd) throws EventException;
    
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
     * @param String deltFlgs
     * @return List<SearchContractNoListVO>
     * @exception EventException
     */
    public List<SearchContractNoListVO> searchContractNoList(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofcCd,String  ctrtCustSlsOfcCd, String mdmYN, String deltFlgs) throws EventException;
    
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
     * @param String deltFlgs
     * @return List<SearchContractNoListVO>
     * @exception EventException
     */
    public List<SearchContractNoListVO> searchContractNoExcelList(String contTp, String contNo, String custNm, String sdate, String edate, int iPage, String ofcCd,String  ctrtCustSlsOfcCd, String mdmYN, String deltFlgs) throws EventException;
}