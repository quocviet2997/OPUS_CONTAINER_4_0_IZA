/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : StaffBC.java
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

import java.util.List;

import com.clt.bizcommon.approval.vo.ApprovalCsrAmountLimitVO;
import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalDeptVO;
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.bizcommon.approval.vo.ApprovalStepVO;
import com.clt.bizcommon.approval.vo.SearchApprovalVO;
import com.clt.bizcommon.approval.vo.UnApprovalCsrVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComAproRqstRoutVO;

/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0T1EventResponse 참조
 * @since J2EE 1.4
 */
public interface ApprovalBC  {

	/**
	 * 미결 csr 조회
	 * @param approvalStaffVO
	 * @return String
	 * @throws EventException
	 */
//	public String searchUnapprovedCsrList(ApprovalStaffVO approvalStaffVO) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Staff화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
     * @return List<ApprovalStaffVO
     * @throws EventException
	 */
	public List<ApprovalStaffVO> searchStaffList(ApprovalStaffVO approvalStaffVO) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Organization 화면에 대한 조회 이벤트 처리<br>
	 * 
     * @param ApprovalStaffVO approvalStaffVO
     * @param SignOnUserAccount account
	 * @return List<ApprovalDeptVO>
	 * @exception EventException
	 */
	public List<ApprovalDeptVO> searchDeptList(ApprovalStaffVO approvalStaffVO, SignOnUserAccount account) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Route화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<ApprovalRouteVO>
	 * @exception EventException
	 */
	public List<ApprovalRouteVO> searchApprovalRouteList(ApprovalStaffVO approvalStaffVO) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param ApprovalRouteVO[] approvalRouteVOs
	 * @param SignOnUserAccount account
	 * @exception EventException
	 */
	public void saveApprovalRoute(ApprovalStaffVO approvalStaffVO, ApprovalRouteVO[] approvalRouteVOs, SignOnUserAccount account) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route Request 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
     * @throws EventException
	 */
	public void saveApprovalRouteReq(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * 부서모듈 사용자별 기본결재라인(COM_APRO_ROUT_DFLT_DTL) 목록을 조회합니다.<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @return List<SearchApprovalVO>
	 * @exception EventException
	 */
	public List<SearchApprovalVO> searchApproval(ApprovalStaffVO approvalStaffVO) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Csr화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param SignOnUserAccount account
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchApprovalCsrList(ApprovalStaffVO approvalStaffVO, SignOnUserAccount account) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 *현 결재자 정보를 조회한다<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return ComAproRqstRoutVO
     * @throws EventException
	 */
	public ComAproRqstRoutVO searchApprovalCurCsrRoute(ApprovalCsrVO approvalCsrVO) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * 최종 결재 여부를 체크한다 - 최종 결재시에만 CSR AP전송  <br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return boolean
     * @throws EventException
	 */
	public boolean searchLastApprovalRoute(ApprovalCsrVO approvalCsrVO) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * 기결재 완료 여부 파악 - 중복 결재 피하기 위함<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return boolean
     * @throws EventException
	 */
	public boolean searchApprovalCompletion(ApprovalCsrVO approvalCsrVO) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Confirm Approval 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
	 * @return String
     * @throws EventException
	 */
	public String confirmApproval(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route Reject 저장 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
     * @throws EventException
	 */
	public void rejectApproval(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException;	
	
	/**
     * COM_CSR_0008 View Approval Step 버튼 -> COM_ENS_0W1 팝업 조회 이벤트 처리<br>
     * Approval Step 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
     * @return List<ApprovalStepVO>
     * @throws EventException
	 */
	public List<ApprovalStepVO> searchApprovalStepList(ApprovalCsrVO approvalCsrVO) throws EventException;
		
	/**
     * BackEndJob의 수행결과를 조회한다.
     * @param String key
     * @return String
     * @throws EventException
     */
	public String searchBakEndJobStatus(String key) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Confirm Approval Remark 수정 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @exception EventException
	 */
	public void confirmApprovalRemark(ApprovalCsrVO approvalCsrVO) throws EventException;
	
	/**
	 * 저장 이벤트 처리<br>
	 * Confirm Approval Result Remark 수정 이벤트 처리<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @exception EventException
	 */
	public void confirmApprovalResultRemark(ApprovalCsrVO approvalCsrVO) throws EventException;
	
	/**
	 * It is running a event that cancels a approval.
	 * 
	 * @param String csr_no
	 * @exception EventException
	 * 2008. 08. 29
	 */
	public void cancelApproval(String csr_no) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * A/R HEAD QUARTER OFFICE CODE를 조회한다.<br>
	 * 
	 * @author ds ham
	 * @return List<String>
	 * @exception EventException
	 */
	public List<String> searchARRHQOfficeList() throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * OFFICE CODE를 조회한다.<br>
	 * 
	 * @param String rhqOfcCd
	 * @return List<String>
	 * @exception EventException
	 */
	public List<String> searchSelOfficeList(String rhqOfcCd) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * CSR의 결재권자가 미승인된 내역을 조회한다.<br>
	 * 
	 * @param UnApprovalCsrVO unApprovalCsrVO
     * @return List<UnApprovalCsrVO>
     * @throws EventException
	 */
	public List<UnApprovalCsrVO> searchUnApprovalCsrList(UnApprovalCsrVO unApprovalCsrVO) throws EventException;
	
	/**
	 * OFC_CD로 RHQ_OFC_CD를 조회 합니다.<br>
	 *
	 * @param String ofcCd
	 * @return String
	 * @throws EventException
	 */
	public String searchRhqOfcCdByOfcCd(String ofcCd) throws EventException;
	
	/**
	 * manageCSRApprovalBackEndJob BackEndJob process
	 * 
	 * @author ORKIM
	 * @param ApprovalCsrVO[] approvalCsrVOs
	 * @param SignOnUserAccount account
	 * @return ApprovalCsrVO[]
	 * @exception EventException
	 */
	public String manageCSRApprovalBackEndJob(ApprovalCsrVO[] approvalCsrVOs, SignOnUserAccount account) throws EventException;
	
	/**
	 * modifyConfirmRqstHdrC
	 * 
	 * @author ORKIM
	 * @param ApprovalCsrVO approvalCsrVO
	 * @exception EventException
	 */
	public void modifyConfirmRqstHdrC(ApprovalCsrVO approvalCsrVO) throws EventException;	
	
	/**
	 * modifyConfirmRqstRout
	 * 
	 * @author ORKIM
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param String usrId
	 * @param String usrNm
	 * @exception EventException
	 */
	public void modifyConfirmRqstRout(ApprovalCsrVO approvalCsrVO, String usrId, String usrNm) throws EventException;	
	
	/**
	 * 조회 이벤트 처리<br>
	 * HEAD QUARTER OFFICE CODE LIST를 조회한다.<br>
	 * 
	 * @return List<String>
	 * @exception EventException
	 */
	public List<String> searchRHQOfficeList() throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * HEAD QUARTER OFFICE CODE를 조회한다.<br>
	 * @param String ofcCd
	 * @return String
	 * @exception EventException
	 */
	public String searchRHQOffice(String ofcCd) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Approval Inquiry화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ApprovalStaffVO approvalStaffVO
	 * @param String[] searchCondOfc
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchApprovalList(ApprovalStaffVO approvalStaffVO, String[] searchCondOfc) throws EventException;
	
	/**
	 * 조회 이벤트 처리<br>
	 * 중복 결재 Check<br>
	 * 
	 * @param ApprovalCsrVO approvalCsrVO
	 * @param SignOnUserAccount account
     * @return String
     * @throws EventException
	 */
	public String checkApprovalDuplication(ApprovalCsrVO approvalCsrVO, SignOnUserAccount account) throws EventException;
	
	/**
	 * validateOffice
	 * @param String ofcCd
	 * @return String
	 * @throws EventException
	 */
	public String validateOffice(String ofcCd) throws EventException;
	
	/**
	 * CSR amount limitation - Search
	 * 
	 * @param ApprovalCsrAmountLimitVO vo
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchCsrAmountLimitList(ApprovalCsrAmountLimitVO vo) throws EventException;
	
	/**
	 * CSR amount limitation - Save
	 * @param ApprovalCsrAmountLimitVO[] vos
	 * @param SignOnUserAccount account
	 * @throws EventException
	 */
	public void multiCsrAmountLimitList(ApprovalCsrAmountLimitVO[] vos, SignOnUserAccount account) throws EventException;
	
	/**
	 * CSR amount limitation history- Search
	 * 
	 * @param ApprovalCsrAmountLimitVO vo
     * @return EventResponse
     * @throws EventException
	 */
	public EventResponse searchCsrAmountLimitHistoryList(ApprovalCsrAmountLimitVO vo) throws EventException;
}
