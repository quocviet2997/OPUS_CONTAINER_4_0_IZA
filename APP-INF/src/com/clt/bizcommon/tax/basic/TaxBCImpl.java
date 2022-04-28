/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeBCImpl.java
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

import com.clt.bizcommon.tax.integration.TaxDBDAO;
import com.clt.bizcommon.tax.vo.ComTaxVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;


/**
 * Tax-BIZCOMMON Business Logic Basic Command implementation<br>
 * - Tax-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyunsu, Ryu
 * @see TaxBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class TaxBCImpl   extends BasicCommandSupport implements TaxBC {

    // Database Access Object
    private transient TaxDBDAO dbDao=null;

    /**
     * TaxBCImpl 객체 생성<br>
     * TaxDBDAO 생성한다.<br>
     */
    public TaxBCImpl(){
        dbDao = new TaxDBDAO();
    }
    
    /**
     * Office Code에 대한 India Country 여부 Flag 조회.
     * 
     * @param ofcCd
     * @return String : India Country 여부(India- Y, 그외 N)
     * @throws EventException
     */
    public String searchIndiaCountryFlagInfoForOffice(String ofcCd) throws EventException {
    	String rtnStr = "N";
    	try {
    		ComTaxVO comTaxVO = new ComTaxVO();
    		comTaxVO.setOfcCd(ofcCd);
    		
    		ComTaxVO resultVo = this.searchCountryInfoForOffice(comTaxVO);
    		
    		if(null != resultVo){
    			rtnStr = "".equals(resultVo.getInCntFlg())? "N" : resultVo.getInCntFlg();
    		}
    		
        } catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    	
    	return rtnStr;
    }
    
    /**
     * Office Code에 대한 Country Code 조회.
     * 
     * @param ofcCd
     * @return String : Office Code의 Country Code
     * @throws EventException
     */
    public String searchCountryCodeInfoForOffice(String ofcCd) throws EventException {
    	String rtnStr = "";
    	try {
    		ComTaxVO comTaxVO = new ComTaxVO();
    		comTaxVO.setOfcCd(ofcCd);
    		
    		ComTaxVO resultVo = this.searchCountryInfoForOffice(comTaxVO);
    		
    		if(null != resultVo && !("").equals(resultVo.getCntCd())){
    			rtnStr = resultVo.getCntCd();
    		}
    		
        } catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    	
    	return rtnStr;
    }
    
    /**
     * Office Code에 대한 India Country 정보 조회.
     * 
     * @param ofcCd
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchCountryInfoForOffice(String ofcCd) throws EventException {
    	try {
    		ComTaxVO comTaxVO = new ComTaxVO();
    		comTaxVO.setOfcCd(ofcCd);
    		
			return this.searchCountryInfoForOffice(comTaxVO);
        } catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }
    
    /**
     * Office에 대한 Country 정보 조회.
     * 조건 : ComTaxVO
     * 
     * @param comTaxVO
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchCountryInfoForOffice(ComTaxVO comTaxVO) throws EventException {
    	try {
			return dbDao.searchCountryInfoForOffice(comTaxVO);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }
    
    /**
     * India Tax 정보 조회.
     * - 조건 : vndrSeq
     * - MDM_VENDOR
     * 
     * @param vndrSeq
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchIndiaTaxInfo(String vndrSeq) throws EventException {
    	try {
    		ComTaxVO comTaxVO = new ComTaxVO();
    		comTaxVO.setVndrSeq(vndrSeq);
    		
			return this.searchIndiaTaxInfo(comTaxVO);
        } catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }
    
    /**
     * India Tax 정보 조회.
     * - 조건 : ComTaxVO
     * - MDM_VENDOR
     * 
     * @param comTaxVO
     * @return ComTaxVO
     * @throws EventException
     */
    public ComTaxVO searchIndiaTaxInfo(ComTaxVO comTaxVO) throws EventException {
    	try {
			return dbDao.searchIndiaTaxInfo(comTaxVO);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }
    
    /**
     * MDM_VENDR에서 India Tax Vendor SAC 조회.<br>
     * - 조건 : ComTaxVO
     * - MDM_VENDOR
     * 
     * @param comTaxVO
     * @return List<ComTaxVO>
     * @throws EventException
     */
    public List<ComTaxVO> searchIndiaTaxVendorSacList(ComTaxVO comTaxVO) throws EventException {
    	try {
			return dbDao.searchIndiaTaxVendorSacList(comTaxVO);
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }catch(Exception ex){
            log.error("err "+ex.toString(),ex);
            throw new EventException(ex.getMessage());
        }
    }

    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Office업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        dbDao = null;
    }
}