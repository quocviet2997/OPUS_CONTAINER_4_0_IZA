/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : CcdCommonBCImpl.java
*@FileTitle : Office Access Group
*Open Issues :
*Change history : 
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion :
=========================================================*/
package com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.basic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.integration.CcdCommonDBDAO;
import com.clt.apps.opus.bcm.ccd.ccdcommon.ccdcommon.vo.ComboListVO;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.db.RowSetUtil;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * CcdCommon Business Logic Command Interface<br>
 * An interface to the business logic for CcdCommon<br>
 *
 * @author 
 * @see CcdCommonBC each DAO class reference
 * @since J2EE 1.4 
 */ 
public class CcdCommonBCImpl extends BasicCommandSupport implements CcdCommonBC {

	// Database Access Object
	private transient CcdCommonDBDAO dbDao = null;

	/**
	 * CcdCommonBCImpl object creation<br> 
	 * Generate CcdCommonDBDAO.<br>
	 */
	public CcdCommonBCImpl() {
		dbDao = new CcdCommonDBDAO();
	}
	 
	/**
	 * Account Code checking.<br>
	 * 
	 * @param String acctCd
	 * @return String
	 * @exception EventException
	 */
	public String checkAcctCode(String acctCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkAcctCode(acctCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Customer Code checking.<br>
	 * 
	 * @param String custCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCustCode(String custCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkCustCode(custCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Country Code checking.<br>
	 * 
	 * @param String cntCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCntCode(String cntCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkCntCode(cntCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Currency Code checking.<br>
	 * 
	 * @param String currCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCurrCode(String currCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkCurrCode(currCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Group Commodity Code checking.<br>
	 * 
	 * @param String grpCmdt
	 * @return String
	 * @exception EventException
	 */
	public String checkGrpCmdt(String grpCmdt) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkGrpCmdt(grpCmdt);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Location Code checking.<br>
	 * 
	 * @param String locCd
	 * @return String
	 * @exception EventException
	 */
	public String checkLocCode(String locCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkLocCode(locCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Office Code checking.<br>
	 * 
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String checkOfcCode(String ofcCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        String check1 = "";
        try {
            rowSet=dbDao.checkOfcCode(ofcCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            		check1 = rowSet.getString(2);
            	}
            }
            return check+","+check1;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Repository Commodity Code checking.<br>
	 * 
	 * @param String repCmdt
	 * @return String
	 * @exception EventException
	 */
	public String checkRepCmdt(String repCmdt) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkRepCmdt(repCmdt);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Region Code checking.<br>
	 * 
	 * @param String rgnCd
	 * @return String
	 * @exception EventException
	 */
	public String checkRgnCode(String rgnCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkRgnCode(rgnCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Sales Repository Code checking.<br>
	 * 
	 * @param String slsRepCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSlsRepCode(String slsRepCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkSlsRepCode(slsRepCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * State Code checking.<br>
	 * 
	 * @param String stateCd
	 * @return String
	 * @exception EventException
	 */
	public String checkStateCode(String stateCd) throws EventException{
//		DBRowSet rowSet = null;
//        String check = "";
//        
//        try {
//            rowSet=dbDao.checkStateCode(stateCd);
//            if(rowSet!=null) {
//            	while(rowSet.next()){
//            		check = rowSet.getString(1);
//            	}
//            }
//            return check;
//            
//        } catch (DAOException de) {
//            log.error("err "+de.toString(),de);
//            throw new EventException(de.getMessage());
//        } catch (Exception e){
//            log.error("err "+e.toString(),e);
//            throw new EventException(e.getMessage());
//        }
		return checkStateCode(stateCd, null);
	}
	
	/**
	 * State Code checking.<br>
	 * 
	 * @param String stateCd
	 * @param String cntCd
	 * @return String
	 * @exception EventException
	 */
	public String checkStateCode(String stateCd, String cntCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkStateCode(stateCd, cntCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1) + "," + rowSet.getString(2);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Sub Continent Code checking.<br>
	 * 
	 * @param String scontiCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSubConti(String scontiCd) throws EventException{
		DBRowSet rowSet = null;	
        String check = "";
        
        try {
            rowSet=dbDao.checkSubConti(scontiCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Sub Trade Code checking.<br>
	 * 
	 * @param String strdCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSubTrdCode(String strdCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkSubTrdCode(strdCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Trade Code checking.<br>
	 * 
	 * @param String trdCd
	 * @return String
	 * @exception EventException
	 */
	public String checkTrdCode (String trdCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkTrdCode(trdCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Vessel Service Lane Code checking.<br>
	 * 
	 * @param String slanCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVslSlanCode(String slanCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkVslSlanCode(slanCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Vender Code checking.<br>
	 * 
	 * @param String vndrCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVndrCode(String vndrCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkVndrCode(vndrCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Vendor Code Name checking.<br>
	 * 
	 * @param String vndrCd
	 * @return String
	 * @exception EventException
	 */
	public String checkVndrCodeName(String vndrCd) throws EventException {
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkVndrCodeName(vndrCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1) + "|&&|" + rowSet.getString(2);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Yard Code checking.<br>
	 * 
	 * @param String ydCd
	 * @return String
	 * @exception EventException
	 */
	public String checkYardCode(String ydCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkYardCode(ydCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Zone Code checking.<br>
	 * 
	 * @param String znCd
	 * @return String
	 * @exception EventException
	 */
	public String checkZoneCode (String znCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkZoneCode(znCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Carrier Code checking.<br>
	 * 
	 * @param String crrCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCrrCode (String crrCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkCrrCode(crrCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}	
	
	/**
	 * Group Customer Code checking.<br>
	 * 
	 * @param String grpCustCd
	 * @return String
	 * @exception EventException
	 */
	public String checkGrpCustCode (String grpCustCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkGrpCustCode(grpCustCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	  /**
     * 1. function : return default combo,ibsheet codelist  <p>
     * 
     * @param codeItem      	
     * @return List<ComboListVO>
     * @throws EventException
     */
	public List<ComboListVO> searchCodeList(String codeItem) throws EventException {
		List<ComboListVO> list = new ArrayList<ComboListVO>();
    	DBRowSet dRs = null;
	        try {
	        	if(codeItem.equalsIgnoreCase("Conti")){				    	 // 1. Continent code List
	        		dRs = dbDao.searchContiCode();
	        	}else if(codeItem.equalsIgnoreCase("GrpCmdt")){				 // 2. Group Commodity List
	        		dRs = dbDao.searchGrpCmdtList();
	        	}else if(codeItem.equalsIgnoreCase("RepCmdt")){				 // 3. Repository Commodity List
	        		dRs = dbDao.searchRepCmdtList();
	        	}else if(codeItem.equalsIgnoreCase("RepChg")){				 // 4. Rep. Charge Code List
	        		dRs = dbDao.searchRepChgCode();
	        	}else if(codeItem.equalsIgnoreCase("SubTrade")){			 // 5. Sub Trade Code List
	        		dRs = dbDao.searchSubTradeCode();
	        	}else if(codeItem.equalsIgnoreCase("Trade")){				 // 6. Trade Code List
	        		dRs = dbDao.searchTradeCode();
	        	}else if(codeItem.equalsIgnoreCase("CntrSize")){			 // 7. Container Size Code List
	        		dRs = dbDao.searchCntrSize();
	        	}else if(codeItem.equalsIgnoreCase("CntrType")){	     	 // 8. Container Type Code List
	        		dRs = dbDao.searchCntrType();
	        	}else if(codeItem.equalsIgnoreCase("CntrTpSz")){	     	 // 9. Container Type/Size Code List
	        		dRs = dbDao.searchCntrTypeSize();
	        	}else if(codeItem.equalsIgnoreCase("Package")){	     	 	 // 10. Package Code List
	        		dRs = dbDao.searchPackage();
	        	}else if(codeItem.equalsIgnoreCase("Office")){	     	 	 // 11. Office Code List
		        	dRs = dbDao.searchOffice();
	        	}else if(codeItem.equalsIgnoreCase("Rcc")){	     	 	 	 // 12. RCC Code List
		        	dRs = dbDao.searchRccCode();
	        	}else if(codeItem.equalsIgnoreCase("PsaCode")){	     	 	 // 15. PSA Code List
		        	dRs = dbDao.searchPsaCode();
	        	}else if("TBL".equalsIgnoreCase(codeItem)){	     	 	 	 // 13. MDA History Table List 
		        	dRs = dbDao.searchTblCode();
	        	}else if("COL".equalsIgnoreCase(codeItem.substring(0,3))){	 // 14. MDA History Column List
	        		String tblStr = codeItem.substring(3);
		        	dRs = dbDao.searchColCode(tblStr);
	        	}else{
        	    //common code
        	    	Collection codeList2 = null; 
        	    	codeList2 = com.clt.framework.component.util.code.CodeUtil.getInstance().getCodeSelect(codeItem,0);
        	    	Iterator iterator = codeList2.iterator();	        		
	                 
	        		com.clt.framework.component.util.code.CodeInfo codeModel2 = null;
	    			while (iterator.hasNext()) {
	    				codeModel2 = (com.clt.framework.component.util.code.CodeInfo) iterator.next();
	    				if (codeModel2 != null){
	    					ComboListVO vo = new ComboListVO();
		    				vo.setCd(codeModel2.getCode());
		    				vo.setCdDesc(codeModel2.getName());
		    				vo.setCdEtc("");
		    				list.add(vo);
	    				}
	    			}
	        	}
	        	
	        	if (dRs != null){
	        		list = (List) RowSetUtil.rowSetToVOs(dRs, ComboListVO.class);
	        	}
	        } catch(SQLException se){
	            log.error("SQLException : " +se.getMessage());
	            throw new EventException("SQLException : " + se.getMessage());
	        } catch (DAOException de) {
	            log.error("DAOException : " +de.getMessage());
	            throw new EventException("DAOException : " + de.getMessage());
	        } catch(Exception ex){
	        	log.error("Exception : " +ex.getMessage());
	        	throw new EventException("Exception : " + ex.getMessage());
	        }
	        return list;  
   }

    /**
     * funcion : return default combo,ibsheet codelist<p>
     * 
     * @param GeneralEventResponse eventResponse
     * @param String[][] array
     * @return GeneralEventResponse
     * <br><b>Example : </b>
	 * <pre>
	 *     String array[][] = {{"trade","",""}};
	 *     eventResponse = CodeUtil.getMakeCodeSelectList(eventResponse,array);
	 * </pre>
     * @throws EventException
     */
    public GeneralEventResponse searchCommonCodeList(GeneralEventResponse eventResponse,String[][] array) throws EventException {
    	List<ComboListVO> list = new ArrayList<ComboListVO>();
    	ComboListVO combovo = new ComboListVO();
 	    
 	    try {
	    	for(int i=0 ; i< array.length ; i++) {
	    		list = searchCodeList((array[i][0]).toString());
	    		if ("All".equals(array[i][2])){
	    			combovo.setCd("ALL");
	    	 	    combovo.setCdDesc("ALL");
	    	 	    combovo.setCdEtc("ALL");
	    			list.add(0,combovo);
	    		}else if ("Blank".equals(array[i][2])){
	    			combovo.setCd(" ");
	    	 	    combovo.setCdDesc(" ");
	    	 	    combovo.setCdEtc(" ");
	    			list.add(0,combovo);
	    		}
	    		eventResponse.setRsVoList(list);
	    	}
 	   } catch(Exception ex){
 		   log.error("Exception : " +ex.getMessage());
 		   throw new EventException("Exception : " + ex.getMessage());
       }
 	   return eventResponse;
	}
    
	/**
	 * Vender Country Code  retrieve.<br>
	 * 
	 * @param String vndrCd
	 * @return String
	 * @exception EventException
	 */
	public String searchVndrCntCode(String vndrCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.searchVndrCntCode(vndrCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Lease Company Yard Code checking.<br>
	 * 
	 * @param String ydCd
	 * @return String
	 * @exception EventException
	 */
	public String checkLseCoYdCode(String ydCd) throws EventException{
		DBRowSet rowSet = null;
        String check = "";
        
        try {
            rowSet=dbDao.checkLseCoYdCode(ydCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * EQ SCC Cod checking<br>
	 * 
	 * @param String sccCd
	 * @return String
	 * @exception EventException
	 */
	public String checkSccCode(String sccCd) throws EventException {
		DBRowSet rowSet = null;
		String check = "";
		
		try {
			rowSet=dbDao.checkSccCode(sccCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		check = rowSet.getString(1);
            	}
            }
            return check;
		}catch (DAOException de) {
			log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}

	/**
	 * Group Customer Code checking.<br>
	 * 
	 * @param String grpCustCd
	 * @param String getCustCntCd
	 * @return String
	 * @exception EventException
	 */
	public String checkCntResult (String grpCustCd, String getCustCntCd) throws EventException{
		DBRowSet rowSet = null;
        String globCt = "";
        
        try {
            rowSet=dbDao.checkCntResult(grpCustCd, getCustCntCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		globCt = rowSet.getString(1);
            	}
            } else {
            	globCt = "G";
            }
            
            return globCt;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
	
	/**
	 * Check whether Active Yard Code exists<br>
	 * 
	 * @param String locCd
	 * @return String
	 * @exception EventException
	 */
	public String checkActiveYardCode (String locCd) throws EventException{
		DBRowSet rowSet = null;
        String sccCd = "";
        
        try {
            rowSet=dbDao.checkActiveYardCode(locCd);
            if(rowSet!=null) {
            	while(rowSet.next()){
            		sccCd = rowSet.getString(1);
            	}
            } else {
            	sccCd = "";
            }
            
            return sccCd;
            
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        } catch (Exception e){
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
        }
	}
}