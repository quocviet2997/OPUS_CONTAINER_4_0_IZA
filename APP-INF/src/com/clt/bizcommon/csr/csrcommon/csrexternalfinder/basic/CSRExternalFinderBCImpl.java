/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CSRExternalFinderBCImpl.java
*@FileTitle : Common Util
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.csrcommon.csrexternalfinder.basic;

import java.util.ArrayList;
import java.util.List;
 
import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.integration.CSRExternalFinderDBDAO;
import com.clt.bizcommon.csr.csrcommon.csrexternalfinder.vo.SpCsrVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ApPayInvDtlVO;
import com.clt.syscommon.common.table.ApPayInvVO;
/**
 * NIS2010-SCGCommon Business Logic Basic Command implementation<br>
 * - Handling the business logic about NIS2010-SCGCommon<br>
 *
 * @author 
 * @see SCG_COM_EventResponse,SCGExternalFinderBC
 * @since J2EE 1.6
 */
public class CSRExternalFinderBCImpl extends BasicCommandSupport implements CSRExternalFinderBC {

	// Database Access Object
	private transient CSRExternalFinderDBDAO dbDao = null;

	/**
	 * Constructor<br>
	 * Creating CSRExternalFinderDBDAO<br>
	 */
	public CSRExternalFinderBCImpl() {
		dbDao = new CSRExternalFinderDBDAO();
	}
	
	/**
	 * Checking the vendor
	 * @param String vndrSeq
	 * @return SpCsrVO
	 * @exception EventException
	 */
	public SpCsrVO checkVendor(String vndrSeq) throws EventException {
		try { 
			List<SpCsrVO> spCsrVOLst = null;
			SpCsrVO spCsrVO = new SpCsrVO();
			
			spCsrVOLst = dbDao.checkVendor(vndrSeq);
			
			if(spCsrVOLst.size() > 0){   
				spCsrVO.setVndrSeq(spCsrVOLst.get(0).getVndrSeq());
				spCsrVO.setVndrLglEngNm(spCsrVOLst.get(0).getVndrLglEngNm());
				spCsrVO.setVndrSeqExisting(spCsrVOLst.get(0).getVndrSeqExisting());
			}
			return spCsrVO;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
 			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err "+ex.toString(),ex);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the locale date by the office code.
	 * @param String ofcCd
	 * @return SpCsrVO
	 * @exception EventException
	 */
	public SpCsrVO getDBdate(String ofcCd) throws EventException {
		try { 
			List<SpCsrVO> spCsrVOLst = null;
			SpCsrVO spCsrVO = new SpCsrVO();
			
			spCsrVOLst = dbDao.getDBdate(ofcCd);
			
			if(spCsrVOLst.size() > 0){   
				spCsrVO.setCurrDate(spCsrVOLst.get(0).getCurrDate());
			}
			return spCsrVO;
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
 			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err "+ex.toString(),ex);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the MDM country code.
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String getMDMCntCd(String ofcCd) throws EventException {
		
		try {
			return dbDao.getMDMCntCd(ofcCd);
		} catch (DAOException de) {
			log.error("err "+de.toString(),de);
 			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err "+ex.toString(),ex);
			throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
	}

	/**
	 * Saving the list in AP_PAY_INV and AP_PAY_INV_DTL table.
	 * @param ApPayInvVO apPayInvVO
	 * @param ApPayInvDtlVO[] apPayInvDtlVOs
	 * @param SignOnUserAccount signOnUserAccount
	 * @return String
	 * @exception EventException
	 */
	public String createApPayInvInfo(ApPayInvVO apPayInvVO, ApPayInvDtlVO[] apPayInvDtlVOs, SignOnUserAccount signOnUserAccount) throws EventException {
		String invRgstNo = "";
		String vndrSeq   = "";
		String ttlLssDivCd = "";
		String invIssDt  = "";
		String mdfChk    = "";
		try {
			//Creation or Update ID 
			String usrIdStr = (String)signOnUserAccount.getUsr_id();
			String invOfcCd = apPayInvVO.getInvOfcCd();
			//Inserting the date to AP_PAY_INV table.
			apPayInvVO.setCreUsrId(usrIdStr);
			apPayInvVO.setUpdUsrId(usrIdStr);
			invRgstNo = apPayInvVO.getInvRgstNo() != null ? apPayInvVO.getInvRgstNo() : "";
			invIssDt  = apPayInvVO.getInvIssDt()  != null ? apPayInvVO.getInvIssDt()  : "";
			//Checking the vendor
			vndrSeq   = apPayInvVO.getVndrSeq()   != null ? apPayInvVO.getVndrSeq()   : "";
			
			// 1. Inserting or Updating data to AP_PAY_INV table - Saving it after converting from ROUND(amount,0) if the current code is KRW or JPY 
			if(invRgstNo.equals("")){ //Creation
				//Checking null in inv_iss_dt - if null, the error msg code is : CSR00082
				if(invIssDt.equals("")){
					log.error("\n\n Wrong inv_iss_dt null--------------------- \n\n");
					throw new DAOException((new ErrorHandler("CSR00082").getMessage()));
				}
				//Checking null in vndr_seq  - if null, the error msg code is CSR00093.
				if(vndrSeq.equals("")){
					log.error("\n\n Wrong vndr_seq null--------------------- \n\n");
					throw new DAOException((new ErrorHandler("CSR00093").getMessage()));
				}
				
				//Retrieving invRgstNo
				invRgstNo = dbDao.srchInvRgstNo(apPayInvVO);
				apPayInvVO.setInvRgstNo(invRgstNo);
				
				//Checking the duplicated INV_NO
				dbDao.searchInvNOChk(apPayInvVO);
				
				dbDao.addApPayInv(apPayInvVO);
				
				mdfChk = "N";	//Insert logic
			}else{
				mdfChk = "Y";	//Update logic
				//Checking the error msg after checking the status. 
				dbDao.searchStsChk(apPayInvVO);
				//updating
				dbDao.modifyApPayInv(apPayInvVO);
			}
			
			//Retrieving the AP_PAY_INV_DTL list.
			List<ApPayInvDtlVO> insertVoList = new ArrayList<ApPayInvDtlVO>();
			List<ApPayInvDtlVO> updateVoList = new ArrayList<ApPayInvDtlVO>();	
			for(int i = 0; i < apPayInvDtlVOs.length; i++ ) {
				if(apPayInvDtlVOs[i].getIbflag().equals("I")) {
					apPayInvDtlVOs[i].setCreUsrId(usrIdStr);
					apPayInvDtlVOs[i].setUpdUsrId(usrIdStr);
					apPayInvDtlVOs[i].setInvRgstNo(invRgstNo);
					apPayInvDtlVOs[i].setCreDt(invOfcCd);
					
					insertVoList.add(apPayInvDtlVOs[i]);
				}else if(apPayInvDtlVOs[i].getIbflag().equals("U")) {
					apPayInvDtlVOs[i].setUpdUsrId(usrIdStr);
					apPayInvDtlVOs[i].setInvRgstNo(invRgstNo);
					apPayInvDtlVOs[i].setCreDt(invOfcCd);
					
					updateVoList.add(apPayInvDtlVOs[i]);
				}
			}
			if(insertVoList.size() > 0) {
				dbDao.addApPayInvDtl(insertVoList);
				
				apPayInvVO.setInvOfcCd(invOfcCd);
				// Occurring error if the amount of INV_NET_AMT in AP_PAY_INV table is not same as the amount of INV_AMT in AP_PAY_INV_DTL table - Comparing it after converting from ROUND(amount,0) if the current code is KRW or JPY 
	 			dbDao.searchApInvAmtChk(apPayInvVO);
	 			
	 			ttlLssDivCd = apPayInvVO.getTtlLssDivCd() != null ? apPayInvVO.getTtlLssDivCd() : "";
	 			
	 			//Comparing the amount of AP_PAY_INV with the amount of AP_PAY_INV(except for PL, PO) 
	 			if(!(ttlLssDivCd.equals("PL") || ttlLssDivCd.equals("PO"))){
	 				dbDao.searchApInvVsAmtChk(apPayInvVO);
	 			}
			}else{	//there is no data to insert in AP_PAY_INV_DTL table.
				if(mdfChk.equals("N")){	//Insert logic 
					throw new DAOException((new ErrorHandler("CSR00009", new String[]{"Invoice Detail"})).getMessage());
				}
			}
			if(updateVoList.size() > 0) {	//delete flag
				dbDao.modifyApPayInvDtl(updateVoList);
			}
			
		} catch(DAOException de) {
			log.error("err " + de.getMessage(), de);
			throw new EventException(de.getMessage());
			//throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), de);
		} catch (Exception ex) {
			log.error("err " + ex.getMessage(), ex);
			throw new EventException(ex.getMessage());
			//throw new EventException(new ErrorHandler("CSR00010", new String[]{" "}).getMessage(), ex);
		}
		return invRgstNo;
	}
	 
}