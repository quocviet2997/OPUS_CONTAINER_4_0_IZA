/*=========================================================
* Copyright(c) 2006 CyberLogitec
* @FileName : CommodityDBDAO.java
* @FileTitle : Commodity정보조회(공통 Popup)
* Open Issues :
* Change history :
* @LastModifyDate : 2006-08-03
* @LastModifier : sungseok, choi
* @LastVersion : 1.0
* 2006-08-03 sungseok, choi
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.util;

//import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;

import com.clt.bizcommon.approval.integration.ApprovalDBDAO;
//import com.clt.bizcommon.approval.integration.ApprovalDBDAOCheckOfficeCodeRSQL;
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.framework.component.message.ErrorHandler;
//import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.integration.DAOException;
//import com.clt.framework.support.db.ISQLTemplate;
//import com.clt.framework.support.db.SQLExecuter;
import com.clt.syscommon.common.table.ComAproCsrDtlVO;
import com.clt.syscommon.common.table.ComAproRqstHdrVO;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;

/**
 * ApprovalUtil <br>
 * Process ApprovalUtil <br>
 * 
 * @author sungseok, choi
 * @see 
 * @since J2EE 1.4
 */
public class ApprovalUtil {
	/**
     *  log 객체 
     */
    protected transient org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(this.getClass().getName());
    
	/**
	 * ApprovalUtil 객체 생성<br>
	 */
	public ApprovalUtil() { }
	
	
	/**
	 * 생성된 CSR의 VNDR_NO에 해당하는 MDM정보에서 PAYMENT METHOD 유형에 따라 BANK ACCT FLG의 유효성 확인
	 * @param csrNo
	 * @throws DAOException
	 */
	public void checkValidBankAcctFlg(String csrNo) throws DAOException {
		ApprovalDBDAO dbDao = new ApprovalDBDAO();
		String retval = null;
		String[] retvals = null;
		
//		AccountPayableInvoiceBC apCommand = new AccountPayableInvoiceBCImpl();
		
		try {
			retval = dbDao.checkValidBankAcctFlg(csrNo);
			if (retval!=null){
				retvals = retval.split("\\|");
				if (retvals!=null && retvals.length==3){
					 if (!(retvals[0]!=null && retvals[0].trim().equals("Y"))){
						 throw new DAOException(new ErrorHandler("SAP00057", new String[]{JSPUtil.getNull(retvals[2])}).getMessage());	//In case of [$s] Payment method, Vendor must have Bank account flag. Please use other vendor.	 
					 }
				} else {
					throw new DAOException("[EXCEPTION] "+JSPUtil.getNull(csrNo)+" : checkValidBankAcctFlg() - RETURN MESSAGE EXCEPTION!!!");	
				}
			} else {
				throw new DAOException("[EXCEPTION] "+JSPUtil.getNull(csrNo)+" : checkValidBankAcctFlg() - NOT RETURN MESSAGE!!!");
			}
			
			log.debug("checkValidBankAcctFlg호출!!!!!!!!!!!!!!!시작");
			///////////////////아래 추가(AccountPayableInvoiceSC에서 필요한 부분 거의 그대로 복사함)			
//			SapInvoiceInterfaceHeaderVO headerVo = null;		
			
//			String ifRequestSeq = apCommand.searchInvoiceInterfaceReqNumCheck(); //Interface Request 에 대한 Sequence Value 임시 변수에 저장
//			headerVo = apCommand.searchSoInvoiceInterfaceHeader(csrNo, "CSRUtil");
//			
//			SapCommonVO appaymentMethodInfo = apCommand.searchInvoiceInterfaceApPaymentMethodCodeCheck(headerVo.getApPayMzdLuCd());
			
			// ASA 처럼 Invoice amount가 0인 경우 Payment Method가 X인 경우 처리 가능, 그외의 경우 처리 불가
//			 if(JSPUtil.getNull(headerVo.getApPayMzdLuCd()).equals("X") && JSPUtil.getNull(appaymentMethodInfo.getValue0()).equals("X") && !JSPUtil.getNull(headerVo.getInvAmt()).equals("0") ) {
//				 throw new DAOException(new ErrorHandler("SAP00060", new String[]{}).getUserMessage()); //Supplier Code has no Payment Method. Please kindly check.
//			 }
//			 
//			 if(JSPUtil.getNull(appaymentMethodInfo.getValue0()).equals("A") || JSPUtil.getNull(appaymentMethodInfo.getValue0()).equals("R")) { //N사의 N이 ONE에서는 A로 변경
//				// ACH Payment 인 경우 Local Currency 와 동일한 Currency를 사용해야 한다.
//				// R에도 적용 SR0001225 - 2018.01.18
//				String localCurrCd = JSPUtil.getNull(apCommand.searchInvoiceInterfaceLocalCurrencyofACHPaymentMethodCheck(headerVo.getVndrNo(), headerVo.getInvCurrCd(), headerVo.getLiabCoaAcctNo()));
//				if(!headerVo.getInvCurrCd().equals(localCurrCd)) {
//					throw new DAOException(new ErrorHandler("SAP00058", new String[]{appaymentMethodInfo.getValue1()}).getUserMessage()); //Case of [$s] Payment method, Curr of CSR and Local Curr must have same. Please use same Curr.
//				}
//			 }
			 log.debug("checkValidBankAcctFlg호출!!!!!!!!!!!!!!!끝");
			 ///////////////////
			 
		} catch(DAOException se) {
			log.error(se.getMessage(),se);
			throw new DAOException(new ErrorHandler(se).getMessage());
		} catch(Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new DAOException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * CSR 결재요청 정보 생성 - N사에서 OFFICE별 단일 결재를 위해서만 사용했던 METHOD로 앞으로는 사용하지 않을 예정
	 * @param ComAproRqstHdrVO header
	 * @param ComAproRqstRoutVO route
	 * @param ComAproCsrDtlVO csr
	 * @throws Exception 
	 */
	public void saveCsrApro(ComAproRqstHdrVO header, ComAproRqstRoutVO route, ComAproCsrDtlVO csr) throws Exception {
		
		ApprovalDBDAO dbDao = new ApprovalDBDAO();
		
		try {
			header.setCrntAproSeq("1");			
			String newAproNo = dbDao.searchNewAproRqstNo();
			header.setAproRqstNo(newAproNo);
			//결재요청 헤더 정보를 생성합니다.
			dbDao.addApprovalHeader(header);
			
			route.setAproRqstNo(header.getAproRqstNo());
			route.setCreUsrId(header.getCreUsrId());

			//결재요청 결재권자 정보를 생성합니다.
			dbDao.addApprovalRoute(route);
			csr.setAproRqstNo(header.getAproRqstNo());
			//결재요청 CSR상세내용 테이블 생성 
			dbDao.addApprovalCsr(csr);
		} catch(DAOException de) {
			throw new Exception(de.getMessage());
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	/**
	 * CSR 결재요청 정보 생성
	 * @param header
	 * @param route
	 * @param csr
	 * @throws Exception
	 */
	public void saveCsrApro(ComAproRqstHdrVO header, ComAproRqstRoutVO[] route, ComAproCsrDtlVO csr) throws Exception {
		
		ApprovalDBDAO dbDao = new ApprovalDBDAO();
		String apro_dflt_rout_seq = null;
		String apro_dflt_ofc      = null;
		
		try {
			header.setCrntAproSeq("1");			
			String newAproNo = dbDao.searchNewAproRqstNo();
			header.setAproRqstNo(newAproNo);
			
			List<ComAproRqstRoutVO> insertRoutList = new ArrayList<ComAproRqstRoutVO>();
			if (route != null) {
				for (int i = 0; i < route.length; i++) {
					if (i == 0){
						apro_dflt_ofc      = route[i].getDfltAproOfcCd();
						apro_dflt_rout_seq = route[i].getAproRoutSeq();
					}
					route[i].setAproRqstNo(header.getAproRqstNo());
					route[i].setCreUsrId(header.getCreUsrId());
					insertRoutList.add(route[i]);
				}
			}
			header.setDfltAproOfcCd(apro_dflt_ofc);		
			header.setAproRoutSeq(apro_dflt_rout_seq);
			dbDao.addApprovalHeader(header);
			dbDao.addApprovalRoute(insertRoutList);
			csr.setAproRqstNo(header.getAproRqstNo());
			dbDao.addApprovalCsr(csr);
		} catch(DAOException de) {
			throw new Exception(de.getMessage());
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @param header
	 * @param route
	 * @param csr
	 * @throws Exception
	 */
//	public void saveCsrApro(ComAproRqstHdrVO header, List<ComAproRqstRoutVO> route, ComAproCsrDtlVO csr) throws Exception {
//		
//		ApprovalDBDAO dbDao = new ApprovalDBDAO();
//		
//		try {
//			header.setCrntAproSeq("1");			
//			String newAproNo = dbDao.searchNewAproRqstNo();
//			header.setAproRqstNo(newAproNo);
//			dbDao.addApprovalHeader(header);
//			
//			for (int i = 0; route != null && i < route.size(); i++) {
//				route.get(i).setAproRqstNo(header.getAproRqstNo());
//				route.get(i).setCreUsrId(header.getCreUsrId());
//			}
//			
//			//결재요청 결재권자 정보를 생성합니다.
//			dbDao.addApprovalRoute(route);
//			csr.setAproRqstNo(header.getAproRqstNo());
//			//결재요청 CSR상세내용 테이블 생성 
//			dbDao.addApprovalCsr(csr);
//		} catch(DAOException de) {
//			throw new Exception(de.getMessage());
//		} catch(Exception e) {
//			throw new Exception(e.getMessage());
//		}
//	}
	
	/**
	 * 결재요청디테일에 저장할 apro_step 정보를 저장하기위한 셋팅을 한다.
	 * @param String apro_step
	 * @return ComAproRqstRoutVO[]
	 * @throws Exception
	 */
	public ComAproRqstRoutVO[] convertApprovalRoute(String apro_step) throws Exception {
		
		ComAproRqstRoutVO[] route = null;
		
		try {
			if(apro_step != null && !apro_step.equals("")) {
				String[] arr_apro_step = apro_step.split(" - ");
				
				route = new ComAproRqstRoutVO[arr_apro_step.length];
				for(int i=0; i<arr_apro_step.length; i++) {
					String[] arr_unit_apro_step = arr_apro_step[i].split("/");
					
					route[i] = new ComAproRqstRoutVO();
					route[i].setAproRqstSeq(arr_unit_apro_step[0]);
					route[i].setAproUsrId(arr_unit_apro_step[1]);
					route[i].setAproUsrNm(arr_unit_apro_step[2]);
					route[i].setAproOfcCd(arr_unit_apro_step[3]);
					
					if(arr_unit_apro_step.length == 5)
						route[i].setAproUsrJbTitNm(arr_unit_apro_step[4]);
				}
			}
			
		} catch(Exception e) {
			log.error(e.getMessage(),e);
			throw new Exception(e.getMessage());
		}
		return route;
	}
	
	/**
	 * 기설정된 module별/office별 default결재권자 목록을 가져온다.(List로)
	 * @param ofc_cd
	 * @param sub_sys_cd
	 * @return List<ApprovalRouteVO>
	 * @throws Exception
	 */
//	public static List<ComAproRqstRoutVO> getApprovalRouteList(String ofc_cd, String sub_sys_cd) throws Exception {
//		
//		ApprovalStaffVO approvalStaffVO =  new ApprovalStaffVO();
//		ApprovalDBDAO dbDao = new ApprovalDBDAO();
//		List<ComAproRqstRoutVO> rtnList = null;
//		List<ApprovalRouteVO> list = null;
//		
//		try {
//			approvalStaffVO.setOfcCd(ofc_cd);
//			approvalStaffVO.setSubSysCd(sub_sys_cd);
//			list = dbDao.searchApprovalRouteUtilList2(approvalStaffVO);
//			
//			
//			
//			
//		} catch(DAOException de) {
//			throw new Exception(de.getMessage());
//		} catch(Exception e) {
//			throw new Exception(e.getMessage());
//		}
//		
//		return rtnList;
//	}
	
	/**
	 * 기설정된 module별/office별 default결재권자 목록을 가져온다.(배열로)
	 * @param ofc_cd
	 * @param sub_sys_cd
	 * @return ComAproRqstRoutVO[]
	 * @throws Exception
	 */
	public static ComAproRqstRoutVO[] getApprovalRoutes(String ofc_cd, String sub_sys_cd) throws Exception {
		return getApprovalRoutes(ofc_cd, sub_sys_cd, "");
	}
	
	/**
	 * 기설정된 module별/office별 default결재권자 목록을 가져온다.(배열로):csr_no
	 * @param ofc_cd
	 * @param sub_sys_cd
	 * @param csr_no
	 * @return ComAproRqstRoutVO[]
	 * @throws Exception
	 */
	public static ComAproRqstRoutVO[] getApprovalRoutes(String ofc_cd, String sub_sys_cd, String csr_no) throws Exception {

		ApprovalDBDAO dbDao = new ApprovalDBDAO();

		ComAproRqstRoutVO[] route = null;
		ApprovalStaffVO approvalStaffVO =  new ApprovalStaffVO();
		List<ApprovalRouteVO> list = null;
		
		try {
			approvalStaffVO.setOfcCd(ofc_cd);
			approvalStaffVO.setSubSysCd(sub_sys_cd);
			approvalStaffVO.setCsrNo(csr_no);
			
			list = dbDao.searchApprovalRouteUtilList2(approvalStaffVO);
			
			if (list!=null && list.size()>0){
				route = new ComAproRqstRoutVO[list.size()];
				for (int i=0; i < list.size(); i++){
					if (list.get(i)!=null){
						route[i] = new ComAproRqstRoutVO();
						route[i].setDfltAproOfcCd(ofc_cd);
						route[i].setAproRoutSeq(list.get(i).getAproRoutSeq());
						route[i].setAproRqstSeq(list.get(i).getAproSeq());
						route[i].setDpSeq(list.get(i).getDpSeq());
						route[i].setAproUsrId(list.get(i).getAproUsrId());
						route[i].setAproUsrNm(list.get(i).getAproUsrNm());
						route[i].setAproOfcCd(list.get(i).getAproOfcCd());
						route[i].setAproUsrJbTitNm(list.get(i).getAproUsrJbTitNm());
					}
				}
			}
		} catch(DAOException de) {
			throw new Exception(de.getMessage());
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return route;
	}
	
	/**
	 * 기설정된 module별/office별 default결재권자 목록을 가져온다.(단일 문자열로) - N사용
	 * @param ofc_cd
	 * @param sub_sys_cd
	 * @return String
	 * @throws Exception 
	 */
	public static String getApprovalRoute(String ofc_cd, String sub_sys_cd) throws Exception {
		
		ApprovalStaffVO approvalStaffVO =  new ApprovalStaffVO();
		ApprovalRouteVO approvalRouteVO = new ApprovalRouteVO();;
		
		StringBuffer sRtn = new StringBuffer();		
		ApprovalDBDAO dbDao = new ApprovalDBDAO();
		
		List<ApprovalRouteVO> list = null;
		
		try {
			approvalStaffVO.setOfcCd(ofc_cd);
			approvalStaffVO.setSubSysCd(sub_sys_cd);
			
			String aproRoutSeq = dbDao.searchApprovalRouteSeq(approvalStaffVO);
			
			if(!"".equals(aproRoutSeq)) {
				approvalRouteVO.setAproRoutSeq(aproRoutSeq);
			}
			list = dbDao.searchApprovalRouteUtilList(approvalRouteVO);
			
			for(int i=0; i < list.size(); i++){
				if(i != 0) {
					sRtn.append(" - ");
				}
				
				approvalRouteVO = list.get(i);
				
				sRtn.append(approvalRouteVO.getAproSeq());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproUsrId());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproUsrNm());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproOfcCd());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproUsrJbTitNm());
			}
			
		} catch(DAOException de) {
			throw new Exception(de.getMessage());
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return sRtn.toString();
	}
	
	/**
	 * 
	 * @param String ofc_cd
	 * @param String sub_sys_cd
	 * @return String
	 * @throws Exception
	 */
	public static String getApprovalRoute1(String ofc_cd, String sub_sys_cd) throws Exception {
		ApprovalStaffVO approvalStaffVO = new ApprovalStaffVO();
		ApprovalRouteVO approvalRouteVO = new ApprovalRouteVO();;
		
		StringBuffer sRtn = new StringBuffer();		
		ApprovalDBDAO dbDao = new ApprovalDBDAO();
		
		List<ApprovalRouteVO> list = null;
		
		try {
			approvalStaffVO.setOfcCd(ofc_cd);
			approvalStaffVO.setSubSysCd(sub_sys_cd);
			
			String aproRoutSeq = dbDao.searchApprovalRouteSeq(approvalStaffVO);
			
			if(!"".equals(aproRoutSeq)) {
				approvalRouteVO.setAproRoutSeq(aproRoutSeq);
			}
			list = dbDao.searchApprovalRouteUtilList(approvalRouteVO);
			
			for(int i=0; i < list.size(); i++){
				approvalRouteVO = list.get(i);
				
				if(approvalRouteVO.getAproUsrJbTitNm().equals("")){
					sRtn.append("");
				}else{
					sRtn.append(approvalRouteVO.getAproUsrJbTitNm());
					sRtn.append("/");
				}
				sRtn.append(approvalRouteVO.getAproUsrNm());
				break;
			}
		} catch(DAOException de) {
			throw new Exception(de.getMessage());
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return sRtn.toString();
	}
	
	
	/**
	 * CSR번호로 ApprovalStep을 조회한다.
	 * @param String csrNo
	 * @return String
	 * @throws Exception
	 */
	public static String getApprovalRouteByCsrNo(String csrNo) throws Exception {
		
		ApprovalRouteVO approvalRouteVO = new ApprovalRouteVO();;
		
		StringBuffer sRtn = new StringBuffer();		
		ApprovalDBDAO dbDao = new ApprovalDBDAO();
		
		List<ApprovalRouteVO> list = null;
		
		try {
			list = dbDao.searchApprovalRouteListByCsrNo(csrNo);
			
			for(int i=0; i < list.size(); i++){
				if(i != 0) {
					sRtn.append(" - ");
				}
				
				approvalRouteVO = list.get(i);
				
				sRtn.append(approvalRouteVO.getAproSeq());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproUsrId());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproUsrNm());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproOfcCd());
				sRtn.append("/");
				sRtn.append(approvalRouteVO.getAproUsrJbTitNm());
			}
			
		} catch(DAOException de) {
			throw new Exception(de.getMessage());
		} catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return sRtn.toString();
	}
	
}
