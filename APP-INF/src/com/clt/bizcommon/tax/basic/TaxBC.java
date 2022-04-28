/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeBC.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.tax.basic;

import java.util.List;

import com.clt.bizcommon.tax.vo.ComTaxVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * Tax-BIZCOMMON Business Logic Command Interface<br>
 * - Tax-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyunsu, Ryu
 * @see COM_ENS_T01Event 참조
 * @since J2EE 1.4
 */
public interface TaxBC  {

	/**
     * Office Code에 대한 India Country 여부 Flag 조회.
     * 
     * @param ofcCd
     * @return String : India Country 여부(India- Y, 그외 N)
     * @throws EventException
     */
    public String searchIndiaCountryFlagInfoForOffice(String ofcCd) throws EventException;
    
    /**
     * Office Code에 대한 Country Code 조회.
     * 
     * @param ofcCd
     * @return String : Office Code의 Country Code
     * @throws EventException
     */
    public String searchCountryCodeInfoForOffice(String ofcCd) throws EventException;
    
    /**
     * Office Code에 대한 India Country 정보 조회.
     * 
     * @param ofcCd
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchCountryInfoForOffice(String ofcCd) throws EventException;
    
    /**
     * Office에 대한 Country 정보 조회.
     * 조건 : ComTaxVO
     * 
     * @param comTaxVO
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchCountryInfoForOffice(ComTaxVO comTaxVO) throws EventException;
    
    /**
     * India Tax 정보 조회.
     * - 조건 : vndrSeq
     * - MDM_VENDOR
     * 
     * @param vndrSeq
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchIndiaTaxInfo(String vndrSeq) throws EventException;
    
    /**
     * India Tax 정보 조회.
     * - 조건 : ComTaxVO
     * - MDM_VENDOR
     * 
     * @param comTaxVO
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchIndiaTaxInfo(ComTaxVO comTaxVO) throws EventException;
    
    /**
     * MDM_VENDR에서 India Tax Vendor SAC 조회.<br>
     * - 조건 : ComTaxVO
     * - MDM_VENDOR
     * 
     * @param comTaxVO
     * @return List<ComTaxVO>
     * @throws EventException
     */
    public List<ComTaxVO> searchIndiaTaxVendorSacList(ComTaxVO comTaxVO) throws EventException;
}
