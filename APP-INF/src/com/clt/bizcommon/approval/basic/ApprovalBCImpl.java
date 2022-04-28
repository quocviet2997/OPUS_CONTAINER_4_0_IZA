/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : StaffBCImpl.java
*@FileTitle : VVD
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-31
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-31 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.approval.basic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.clt.bizcommon.approval.integration.ApprovalDBDAO;
import com.clt.bizcommon.approval.util.ApprovalUtil;
import com.clt.bizcommon.approval.vo.ApPayInvVO;
import com.clt.bizcommon.approval.vo.ApprovalCsrAmountLimitVO;
import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalDeptVO;
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.bizcommon.approval.vo.ApprovalStepVO;
import com.clt.bizcommon.approval.vo.SearchApprovalVO;
import com.clt.bizcommon.approval.vo.UnApprovalCsrVO;
import com.clt.framework.component.backend.core.BackEndJobManager;
import com.clt.framework.component.backend.support.BackEndJobException;
import com.clt.framework.component.backend.support.BackEndJobMetaDataSelector;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;

/**
 * eNIS-BIZCOMMON Business Logic Basic Command implementation<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author Hyung Choon_Roh
 * @see COM_ENS_0T1EventResponse,StaffBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class ApprovalBCImpl extends BasicCommandSupport implements ApprovalBC {

	// Database Access Object
	private transient ApprovalDBDAO dbDao=null;
	/**
	 * StaffBCImpl 객체 생성<br>
	 * StaffDBDAO를 생성한다.<br>
	 */
	public ApprovalBCImpl(){
		dbDao = new ApprovalDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Staff 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
     * @return List<ApprovalStaffVO>
     * @throws EventException
	 */
	public List<ApprovalStaffVO> searchStaffList(ApprovalStaffVO approvalStaffVO) throws EventException {
		try {
        	return dbDao.searchStaffList(approvalStaffVO);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Staff List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Staff List"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Organization 화면에 대한 조회 이벤트 처리<br>
	 * 
     * @param ApprovalStaffVO approvalStaffVO
     * @param SignOnUserAccount account
	 * @return List<ApprovalDeptVO>
	 * @exception EventException
	 */
	public List<ApprovalDeptVO> searchDeptList(ApprovalStaffVO approvalStaffVO, SignOnUserAccount account) throws EventException {
        try {
        	approvalStaffVO.setOfcCd(account.getOfc_cd());
        	return dbDao.searchDeptList(approvalStaffVO);
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Dept List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Dept List"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Route화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
     * @return List<ApprovalRouteVO>
     * @throws EventException
	 */
	public List<ApprovalRouteVO> searchApprovalRouteList(ApprovalStaffVO approvalStaffVO) throws EventException {
		ApprovalRouteVO approvalRouteVO = null;
		try {
			//Route의 Sequence를 조회합니다.
			String aproRoutSeq = dbDao.searchApprovalRouteSeq(approvalStaffVO);
			
			approvalRouteVO = new ApprovalRouteVO();
			approvalRouteVO.setAproRoutSeq(aproRoutSeq);
			
			return dbDao.searchApprovalRouteList(approvalRouteVO);            
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Route List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Route List"}).getMessage(), ex);
		}
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param ApprovalRouteVO[] approvalRouteVOs
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void saveApprovalRoute(ApprovalStaffVO approvalStaffVO, ApprovalRouteVO[] approvalRouteVOs, SignOnUserAccount account) throws EventException {
		ApprovalRouteVO approvalRouteVO = null;
		try {
        	approvalStaffVO.setUsrId(account.getUsr_id());
        	//모듈과 오피스로 기본결재라인헤더의 Sequence를 조회합니다.
        	String aproRoutSeq = dbDao.searchApprovalRouteSeq(approvalStaffVO);
        	
        	if (!"".equals(aproRoutSeq)) {
	        	approvalRouteVO = new ApprovalRouteVO();
				approvalRouteVO.setAproRoutSeq(aproRoutSeq);
				approvalRouteVO.setUsrId(account.getUsr_id());   
				//기본결재라인 헤더의 업데이트 이력입니다
	        	dbDao.modifyApprovalRoute(approvalRouteVO);
	        	//기본결재라인 디테일의 승인권자정보를 삭제한다
	        	dbDao.removeApprovalRoute(approvalRouteVO);
        	} else {
        		//기본결재라인 헤더의 Sequence를 MAX(+1)로 생성합니다
        		aproRoutSeq = dbDao.createApprovalRouteSeq();
        		//기본결재라인 헤더 정보를 생성한다
        		dbDao.addApprovalRoute(aproRoutSeq, approvalStaffVO);
        	}
        	
        	List<ApprovalRouteVO> insertVoList = new ArrayList<ApprovalRouteVO>();
        	if (approvalRouteVOs != null) {
        		for ( int i=0; i<approvalRouteVOs.length; i++ ) {
        			approvalRouteVOs[i].setAproRoutSeq(aproRoutSeq);
        			approvalRouteVOs[i].setUsrId(account.getUsr_id());
        			insertVoList.add(approvalRouteVOs[i]);
        		}
        	}
        	if (insertVoList.size() > 0) {
        		//기본결재라인 디테일의 승인권자 정보를 생성한다 
        		dbDao.addApprovalRouteDetail(insertVoList);
        		
        		
        		/** BEGIN [SR0006110] rout의 입력날짜와 dflt결재 정보의 입력날짜와 비교하여, 완전 미결 CSR 결재자 변경  (FLT와 JOO 제외)  **/
        		String sub_sys_id = approvalStaffVO.getSubSysCd();
        		if (sub_sys_id !=null && !sub_sys_id.trim().equals("FLT") && !sub_sys_id.trim().equals("JOO")) {
        			String apro_evnt_desc = dbDao.searchAproEvntDesc();
            		if (apro_evnt_desc != null && !apro_evnt_desc.trim().equals("")) {
                		List<UnApprovalCsrVO> incmplUnapprdCsrListVOs = dbDao.searchCompletelyUnapprovedCSRList(approvalStaffVO,"N",apro_evnt_desc);
                		if (incmplUnapprdCsrListVOs != null && incmplUnapprdCsrListVOs.size() > 0) {
            				dbDao.insertAproRqstRoutHis(incmplUnapprdCsrListVOs);
                			dbDao.deleteCurrentApproversForUnapprovedCsr(incmplUnapprdCsrListVOs);
                			dbDao.insertNewApproversForUnapprovedCsr(incmplUnapprdCsrListVOs);
                			// 1st approved rout -> unapproved + hdr의 crnt_apro_seq 1로 update하기 
                			dbDao.updateN1stApprovedRoutToUnapproved(incmplUnapprdCsrListVOs);
            				dbDao.updateCurrentApprovalSeqForUnapprovedCsr(incmplUnapprdCsrListVOs);
                		}
            		}
        		}
        		/** END [SR0006110] **/
        		
        	}
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Save Approval Route"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Save Approval Route"}).getMessage(), ex);
		}
	}

	/**
	 * 미결 csr 조회
	 * @param approvalStaffVO
	 * @return String
	 * @throws EventException
	 */
//	public String searchUnapprovedCsrList(ApprovalStaffVO approvalStaffVO) throws EventException {
//
//		String retval = null;
//		
//		try {
////			String apro_evnt_desc = dbDao.searchAproEvntDesc();
////    		List<UnApprovalCsrVO> incmplUnapprdCsrListVOs = dbDao.searchCompletelyUnapprovedCSRList(approvalStaffVO,"N",apro_evnt_desc);
////    		if (incmplUnapprdCsrListVOs != null && incmplUnapprdCsrListVOs.size() > 0){
////    			log.error("\n incmplUnapprdCsrListVOs.size() : " + incmplUnapprdCsrListVOs.size() + "<<<<\n");
////    			retval = Integer.toString(incmplUnapprdCsrListVOs.size());
////    		}
////		} catch (DAOException ex) {
////            log.error("err " + ex.toString(), ex);
////            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Unapproved CSR"}).getMessage(), ex);
//        } catch (Exception ex) {
//            log.error("err " + ex.toString(), ex);
//            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Unapproved CSR"}).getMessage(), ex);
//		}
//		
//		return retval;
//	}

	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route Request 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
     * @throws EventException
	 */
	public void saveApprovalRouteReq(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException {
		String	aproRqstNo	 = "";
		
		try {
			if(approvalCsrVO != null) {
				approvalCsrVO.setUsrId(account.getUsr_id());
				approvalCsrVO.setUsrNm(account.getUsr_nm());
				approvalCsrVO.setOfcCd(account.getOfc_cd());
				
				//결재요청헤더의 시컨스 찾기
				aproRqstNo = dbDao.searchAproRqstNo(approvalCsrVO);
				approvalCsrVO.setAproRqstNo(aproRqstNo);
				//결재요청헤더의 정보를 처음결재상신 상태로 업데이트 합니다
				dbDao.modifyApprovalReqHdr(approvalCsrVO);
				
				ApprovalUtil util = new ApprovalUtil();
				//결재요청디테일에 저장할 apro_step 정보를 저장하기위한 셋팅을 한다.
	        	ComAproRqstRoutVO[] route = util.convertApprovalRoute(approvalCsrVO.getAproStep());
	        	List<ComAproRqstRoutVO> insertVoList = new ArrayList<ComAproRqstRoutVO>();
	        	if(route != null) {
	        		for ( int i=0; i<route.length; i++ ) {
	        			route[i].setCreUsrId(account.getUsr_id());
	        			route[i].setUpdUsrId(account.getUsr_id());
	        			route[i].setAproRqstNo(aproRqstNo);
	        			insertVoList.add(route[i]);
	        		}
	        	}
	        	if (insertVoList.size() > 0) {
	        		//기존 결재요청디테일 결재권자 삭제
		            dbDao.removeApprovalReqRoute(approvalCsrVO);
		            //결재요청디테일 결재권자 입력 
		            dbDao.addApprovalReqRoute(insertVoList);
	        	}
	        	
	        	//AP_INV_HDR(CSR ERP AP Interface 테이블) ATTR_CTNT1(결제자정보) UPDATE 
	        	dbDao.modifyApInvHdr(approvalCsrVO);
			}
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Save Approval Route Request"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Save Approval Route Request"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 부서모듈 사용자별 기본결재라인(COM_APRO_ROUT_DFLT_DTL) 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<SearchApprovalVO>
	 * @exception EventException
	 */
	public List<SearchApprovalVO> searchApproval(ApprovalStaffVO approvalStaffVO) throws EventException {
        try {
            if(approvalStaffVO.getCsrNo() != null && !"".equals(approvalStaffVO.getCsrNo())) {
            	return dbDao.searchApprovalByCsrNo(approvalStaffVO);
        	} else {
        		//Route의 Sequence를 조회합니다.
        		String aproRoutSeq = dbDao.searchApprovalRouteSeq(approvalStaffVO);
        		approvalStaffVO.setAproRoutSeq(aproRoutSeq);
        		return dbDao.searchApprovalByAproRouteSeq(approvalStaffVO);
        	}
        } catch (DAOException de) {
            log.error("err "+de.toString(),de);
            throw new EventException(de.getMessage());
        }
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Csr화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param SignOnUserAccount account
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchApprovalCsrList(ApprovalStaffVO approvalStaffVO, SignOnUserAccount account) throws EventException {
		DBRowSet rowSet = null; // DB ResultSet for sending data
		try {
			approvalStaffVO.setUsrId(account.getUsr_id());
			approvalStaffVO.setOfcCd(account.getOfc_cd());
			
			rowSet = dbDao.searchApprovalCsrList(approvalStaffVO);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVo(rowSet);
			return eventResponse;
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 현 결재자 정보를 조회한다<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return ComAproRqstRoutVO
     * @throws EventException
	 */
	public ComAproRqstRoutVO searchApprovalCurCsrRoute(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
			return dbDao.searchApprovalCurCsrRoute(approvalCsrVO);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Current CSR Route"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Current CSR Route"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 최종 결재 여부를 체크한다 - 최종 결재시에만 CSR AP전송  <br>
	 * @param ApprovalCsrVO approvalCsrVO
     * @return boolean
     * @throws EventException
	 */
	public boolean searchLastApprovalRoute(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
        	return dbDao.searchLastApprovalRoute(approvalCsrVO);
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Last Approval Route"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Last Approval Route"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 기결재 완료 여부 파악 - 중복 결재 피하기 위함<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return boolean
     * @throws EventException
	 */
	public boolean searchApprovalCompletion(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
			return dbDao.searchApprovalCompletion(approvalCsrVO);
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Completion"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Completion"}).getMessage(), ex);
		}
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Confirm Approval 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
	 * @return String
     * @throws EventException
	 */
	public String confirmApproval(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException {
		String titleName   = account.getUsr_nm();	//title_name - 결재자 본인
		String usrId = account.getUsr_id();
		String usrNm = account.getUsr_locl_nm();
		String csrNo	   = approvalCsrVO.getCsrNo();
		String subSysCd = approvalCsrVO.getSubSysCd();	//분기처리용
		String newGlDt	   = "";
		String errMsg = "";
		
		boolean bComplete = false;
		
//		AGNCommApprovalBC agtCommand = new AGNCommApprovalBCImpl();
//    	CARIssueTransferSlipManageBC tesCommand = new CARIssueTransferSlipManageBCImpl();
//		CSRIssueTransferSlipManageBC trsCommand = new CSRIssueTransferSlipManageBCImpl();

        try { 
        	//결재요청 테이블의 해당 결재권자 결재상태를 완료처리한다
        	dbDao.modifyConfirmRqstRout(approvalCsrVO, usrId, usrNm);
        	//결재요청 테이블의 결재권자 모두의 결재상태를 체크하여 더이상 결재할 데이타가 없다면 결재요청헤더 테이블의 결재상태를 '완료'로 업데이트한다
        	bComplete = dbDao.searchApprovalCompleteCount(approvalCsrVO);
        	if(bComplete) {
        		//결재요청 테이블의 결재권자가 모두 결재를 하였다면 결재요청헤더 테이블의 결재상태를 완료로 업데이트한다
        		dbDao.modifyConfirmRqstHdrC(approvalCsrVO);
        	} else {
        		//결재요청 테이블의 결재권자가 모두 결재를 하지 않았다면 결재요청헤더 테이블의 결재상태를 진행으로 업데이트한다
        		dbDao.modifyConfirmRqstHdrP(approvalCsrVO);
        	}

        	//GL_DT 의 실시간 데이타를 구해온다
			ApPayInvVO gldtModel = dbDao.checkUpdateRevVVD(approvalCsrVO);
			newGlDt  = gldtModel.getNewGlDt();
			if (!isValidDate(newGlDt)) {
				errMsg = new ErrorHandler("COM12203", new String[]{"G/L Date"}).getUserMessage();
				//throw new EventException(new ErrorHandler("COM12203", new String[]{"G/L Date"}).getMessage());
			}
			
			if(bComplete) {
				// 최종 승인자 정보 및 GL_DT 정보를 CSR ERP AP Interface 테이블로 업데이트한다
				dbDao.modifyApprovalStep(titleName, csrNo, newGlDt);
				//CSR 모듈 분기처리
				if(subSysCd.equals("MNR")  || subSysCd.equals("TLL") || subSysCd.equals("LSE") || subSysCd.equals("PSO") || subSysCd.equals("CHS") || subSysCd.equals("MGS") || subSysCd.equals("CNI")){
					List<ApPayInvVO> soModels = dbDao.searchSO(approvalCsrVO);
					// CSR관리 테이블(AP_PAY_INV) 의 상태를 P(A/P Interfaced) 로 업데이트 한다
					dbDao.modifyStsCdPayInv(soModels);
				//TRS INV 테이블 업데이트
				}else if(subSysCd.equals("TRS")){
//					trsCommand.trsUpdateCSRSTSFlag("C", csrNo);
				//TES INV 테이블 업데이트
				}else if(subSysCd.equals("TES")){
//					tesCommand.tesUpdateCSRSTSFlag("C", csrNo);
				//ACM INV 테이블 업데이트
				}else if(subSysCd.equals("ACM")){
//					agtCommand.acmUpdateCSRSTSFlag("C", csrNo);
				}
			}
			
			return errMsg;
            
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler(ex).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Confirm Approval"}).getMessage(), ex);
		}
        

	}
	
	/**
	 * Confirm Approval<br>
	 * isValidDate Valid<br> * 
	 * @author ORKIM
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	*/	
	private boolean isValidDate(String inputeDate) {
		
		if (inputeDate != null && !inputeDate.equals("") && inputeDate.length() == 8) {
			int yy = Integer.parseInt(inputeDate.substring(0,4));
			int mm = Integer.parseInt(inputeDate.substring(4,6));
			int dd = Integer.parseInt(inputeDate.substring(6,8));
			
			GregorianCalendar cal = new GregorianCalendar();
		    cal.set(yy, mm, dd);
		    try {
		    	cal.getTime();
		    } catch (IllegalArgumentException e) {
		    	log.error(e.getMessage());
		    	return false;
		    } 
		    return true;

		} else {
			return false;
		}
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route Reject 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
     * @throws EventException
	 */
	public void rejectApproval(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException {
		String subSysCd = "";
		String csrNo	   = approvalCsrVO.getCsrNo();
		String usrId = account.getUsr_id();
		String usrNm = account.getUsr_locl_nm();
		
//		AGNCommApprovalBC agtCommand = new AGNCommApprovalBCImpl();
//    	CARIssueTransferSlipManageBC tesCommand = new CARIssueTransferSlipManageBCImpl();
//		CSRIssueTransferSlipManageBC trsCommand = new CSRIssueTransferSlipManageBCImpl();
		
		try {
			//결재요청 결재권자 테이블의 해당 결재권자 결재상태를 반려처리한다
			dbDao.modifyRejectAproRqstRout(approvalCsrVO, usrId, usrNm);
			//결재요청헤더 테이블의 결재상태를 반려처리한다
			dbDao.modifyRejectAproRqstHdr(approvalCsrVO);
			
			subSysCd = approvalCsrVO.getSubSysCd();
			if(subSysCd.equals("MNR") || subSysCd.equals("TLL") || subSysCd.equals("LSE") || subSysCd.equals("PSO") || subSysCd.equals("CHS") || subSysCd.equals("MGS") || subSysCd.equals("CNI")){
				//승인권자가 Reject 할 경우 CSR관리 테이블(AP_PAY_INV)의 INVOICE 진행상태를 반려로 업데이트한다
				dbDao.modifyRejectApPayInv(approvalCsrVO);
			}else if(subSysCd.equals("TRS")){
//				trsCommand.trsUpdateCSRSTSFlag("R", csrNo);
			}else if(subSysCd.equals("TES")){
//				tesCommand.tesUpdateCSRSTSFlag("R", csrNo);
			}else if(subSysCd.equals("ACM")){
//				agtCommand.acmUpdateCSRSTSFlag("R", csrNo);
			}
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Reject"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Reject"}).getMessage(), ex);
		}
	}
	
	/**
     * COM_CSR_0008 View Approval Step 버튼 -> COM_ENS_0W1 팝업 조회 이벤트 처리<br>
     * Approval Step 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return List<ApprovalStepVO>
     * @throws EventException
	 */
	public List<ApprovalStepVO> searchApprovalStepList(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
			return dbDao.searchApprovalStepList(approvalCsrVO);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Step List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Step List"}).getMessage(), ex);
		}
	}
	
    /**
     * BackEndJob의 수행결과를 조회한다.
     * @param String key
     * @return String
     * @throws EventException
     */
	public String searchBakEndJobStatus(String key) throws EventException {
		DBRowSet rowSet;
		try {
			rowSet = new BackEndJobMetaDataSelector(key).getDbRowset();
			rowSet.next();
			Thread.sleep(1000);
			
			return (String) rowSet.getObject("jb_sts_flg");
		} catch (BackEndJobException ex) {
			throw new EventException(new ErrorHandler("COM12203", new String[]{"Search BackendJob Status"}).getMessage(), ex);
		} catch (SQLException ex) {
			throw new EventException(new ErrorHandler("COM12203", new String[]{"Search BackendJob Status"}).getMessage(), ex);
		} catch (InterruptedException ex) {
			throw new EventException(new ErrorHandler("COM12203", new String[]{"Search BackendJob Status"}).getMessage(), ex);
		} catch(Exception ex){
			throw new EventException(new ErrorHandler("COM12203", new String[]{"Search BackendJob Status"}).getMessage(), ex);
		}
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Confirm Approval Remark 수정 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @exception EventException	
	 */
	public void confirmApprovalRemark(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
			dbDao.confirmApprovalRemark(approvalCsrVO);
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12208", new String[]{"Confirm Approval Remark"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12208", new String[]{"Confirm Approval Remark"}).getMessage(), ex);
		}
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Confirm Approval Result Remark 수정 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @exception EventException	
	 */
	public void confirmApprovalResultRemark(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
			dbDao.confirmApprovalResultRemark(approvalCsrVO);
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12208", new String[]{"Confirm Approval Remark"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12208", new String[]{"Confirm Approval Remark"}).getMessage(), ex);
		}
	}
	
	/**
	 * cancelApproval<br>
	 *
	 * @param String csr_no
	 * @exception EventException
	 */	
	public void cancelApproval(String csr_no) throws EventException {
		try {
			dbDao.cancelApproval(csr_no);
		} catch (DAOException e) {
            log.error("err "+e.toString(),e);
            throw new EventException(e.getMessage());
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * A/R HEAD QUARTER OFFICE CODE를 조회한다..<br>
	 * 
	 * @author ds ham
	 * @return List<String>
	 * @exception EventException
	 */
	public List<String> searchARRHQOfficeList() throws EventException {
		try {
			
			return dbDao.searchARRHQOfficeList();
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * OFFICE CODE를 조회한다..<br>
	 * 
	 * @author ds ham
	 * @param String rhqOfcCd
	 * @return List<String>
	 * @exception EventException
	 */
	public List<String> searchSelOfficeList(String rhqOfcCd) throws EventException {
		try {
			
			return dbDao.searchSelOfficeList(rhqOfcCd);
			
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * CSR의 결재권자가 미승인된 내역을 조회한다.<br>
	 * 
	 * @param UnApprovalCsrVO unApprovalCsrVO
     * @return List<UnApprovalCsrVO>
     * @throws EventException
	 */
	public List<UnApprovalCsrVO> searchUnApprovalCsrList(UnApprovalCsrVO unApprovalCsrVO) throws EventException {
		try {
        	return dbDao.searchUnApprovalCsrList(unApprovalCsrVO);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
		}
	}
	
	/**
	 * OFC_CD로 RHQ_OFC_CD를 조회한다.<br>
	 *
	 * @param String ofcCd
	 * @return String
	 * @throws EventException
	 */
	public String searchRhqOfcCdByOfcCd(String ofcCd) throws EventException {
		try {
			return dbDao.searchRhqOfcCdByOfcCd(ofcCd);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search RHQ Office Code"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search RHQ Office Code"}).getMessage(), ex);
		}
	}
	
	/**
	 * manageCSRApprovalBackEndJob BackEndJob process
	 * 
	 * @author ORKIM
	 * @param ApprovalCsrVO[] approvalCsrVOs
	 * @param SignOnUserAccount account
	 * @return ApprovalCsrVO[]
	 * @exception EventException
	 */
	public String manageCSRApprovalBackEndJob(ApprovalCsrVO[] approvalCsrVOs, SignOnUserAccount account) throws EventException {
		ApprovalBackEndJob approvalBackEndJob = new ApprovalBackEndJob();
		BackEndJobManager backEndJobManager = new BackEndJobManager();

		try {
			approvalBackEndJob.setApprovalCsrVOs(approvalCsrVOs);
			approvalBackEndJob.setAccount(account);

			return backEndJobManager.execute(approvalBackEndJob, account.getUsr_id(), "manageCSRApprovalBackEndJob");
		 } catch (Exception ex) {
			throw new EventException(new ErrorHandler("COM12203", new String[]{"manageCSRApprovalBackEndJob BackEndJob"}).getMessage(),ex);
		}
	}
	
	
	
	/**
	 * modifyConfirmRqstHdrC
	 * 
	 * @author ORKIM
	 * @param ApprovalCsrVO approvalCsrVO
	 * @exception EventException
	 */
	public void modifyConfirmRqstHdrC(ApprovalCsrVO approvalCsrVO) throws EventException {
		try {
			dbDao.modifyConfirmRqstHdrC(approvalCsrVO);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"modifyConfirmRqstHdrC"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"modifyConfirmRqstHdrC"}).getMessage(), ex);
		}
	}
	
	/**
	 * modifyConfirmRqstRout
	 * 
	 * @author ORKIM
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param String usrId
	 * @param String usrNm
	 * @exception EventException
	 */
	public void modifyConfirmRqstRout(ApprovalCsrVO approvalCsrVO, String usrId, String usrNm) throws EventException {
		try {
			dbDao.modifyConfirmRqstRout(approvalCsrVO, usrId, usrNm);
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"modifyConfirmRqstHdrC"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"modifyConfirmRqstHdrC"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * HEAD QUARTER OFFICE CODE LIST를 조회한다..<br>
	 * 
	 * @return List<String>
	 * @exception EventException
	 */
	public List<String> searchRHQOfficeList() throws EventException {
		try {
			return dbDao.searchRHQOfficeList();
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * HEAD QUARTER OFFICE CODE를 조회한다..<br>
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String searchRHQOffice(String ofcCd) throws EventException {
		try {
			return dbDao.searchRHQOffice(ofcCd);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getUserMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * Approval Inquiry화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param String[] searchCondOfc
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchApprovalList(ApprovalStaffVO approvalStaffVO, String[] searchCondOfc) throws EventException {
		DBRowSet rowSet = null; // DB ResultSet for sending data
		try {
			rowSet = dbDao.searchApprovalList(approvalStaffVO, searchCondOfc);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVo(rowSet);
			return eventResponse;
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 중복 결재 Check<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
     * @return String
     * @throws EventException
	 */
	public String checkApprovalDuplication(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException {
		try {
			return dbDao.checkApprovalDuplication(approvalCsrVO, account);
        } catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Completion"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval Completion"}).getMessage(), ex);
		}
	}
	
	/**
	 * validateOffice
	 * @param String ofcCd
	 * @return String
	 * @throws EventException
	 */
	public String validateOffice(String ofcCd) throws EventException {
		String resultCount;
		try {
			resultCount = dbDao.checkOfficeCode(ofcCd);
		} catch (DAOException e) {
			log.error("err " + e.toString(), e);
			throw new EventException(e.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		return resultCount;
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * CSR amount limitation setup 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrAmountLimitVO vo
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchCsrAmountLimitList(ApprovalCsrAmountLimitVO vo) throws EventException {
		DBRowSet rowSet = null; // DB ResultSet for sending data
		try {
			rowSet = dbDao.searchCsrAmountLimitList(vo);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVo(rowSet);
			return eventResponse;
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
		}
	}
	
	/**
	 * Save event process<br>
	 * Invoice Item & Account Matrix List - Save event process<br>
	 * 
	 * @param ApprovalCsrAmountLimitVO[] vos
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void multiCsrAmountLimitList(ApprovalCsrAmountLimitVO[] vos, SignOnUserAccount account) throws EventException {
		List<ApprovalCsrAmountLimitVO> insertVoList = new ArrayList<ApprovalCsrAmountLimitVO>();
		List<ApprovalCsrAmountLimitVO> updateVoList = new ArrayList<ApprovalCsrAmountLimitVO>();
		List<ApprovalCsrAmountLimitVO> historyVoList = new ArrayList<ApprovalCsrAmountLimitVO>();
		try{
			for(int i=0;i<vos.length;i++) {
				ApprovalCsrAmountLimitVO vo = vos[i];
				if("U".equals(vo.getIbflag())) {
					vo.setLoginUsrId(account.getUsr_id());
					if("".equals(vo.getAproRoutSeq())) {
						String aproRoutSeq = dbDao.createApprovalRouteSeq();
		        		vo.setAproRoutSeq(aproRoutSeq);
		        		insertVoList.add(vo);
					} else {
						updateVoList.add(vo);
					}
					historyVoList.add(vo);
				}
			}
			// COM_APRO_ROUT_DFLT insert
			if(insertVoList.size() > 0) {
				dbDao.createCsrAmountLimitList(insertVoList);
			}
			// COM_APRO_ROUT_DFLT update
			if(updateVoList.size() > 0) {
				dbDao.modifyCsrAmountLimitList(updateVoList);
			}
			// History
			if(historyVoList.size() > 0) {
				dbDao.createCsrAmountLimitHistoryList(historyVoList);
			}
		} catch (DAOException de) {
			//log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		} catch (EventException ex) {
			throw ex;
		} catch (Exception de) {
			//log.error("err " + de.toString(), de);
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Data"}).getMessage(), de);
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * CSR amount limitation setup history화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrAmountLimitVO vo
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchCsrAmountLimitHistoryList(ApprovalCsrAmountLimitVO vo) throws EventException {
		DBRowSet rowSet = null; // DB ResultSet for sending data
		try {
			rowSet = dbDao.searchCsrAmountLimitHistoryList(vo);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVo(rowSet);
			return eventResponse;
		} catch (DAOException ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval CSR List"}).getMessage(), ex);
		}
	}
}
