/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : CodeManagementBCImpl.java
 *@FileTitle : 공통코드관리
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2006-09-07
 *@LastModifier : SeongWook Kim
 *@LastVersion : 1.0
 * 2006-09-07 SeongWook Kim
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.codemanagement.basic;

import java.util.ArrayList;
import java.util.List;

import com.bluecast.util.DuplicateKeyException;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.codemanagement.integration.CodeManagementDBDAO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtDtlVO;
import com.clt.syscommon.management.opus.codemanagement.vo.CodeMgmtMstVO;

/**
 * edm-edm Business Logic Basic Command implementation<br>
 * - edm-edm에 대한 비지니스 로직을 처리한다.<br>
 * 
 * @author SeongWook Kim
 * @see CodeManagementBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class CodeManagementBCImpl extends BasicCommandSupport implements CodeManagementBC {

	// Database Access Object
	private transient CodeManagementDBDAO dbDao = null;

	/**
	 * CodeManagementBCImpl 객체 생성<br>
	 * CodeManagementDBDAO를 생성한다.<br>
	 */
	public CodeManagementBCImpl() {
		dbDao = new CodeManagementDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * CodeManagement화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchAPPCodeList(Event e) throws EventException {
		try {
			return dbDao.searchAPPCodeList(e);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String[]
	 * @exception EventException
	 */
	public String[] searchSubSystemCodeList() throws EventException {

		try {
			return dbDao.searchSubSystemCodeList();
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String
	 * @exception EventException
	 */
	public String searchMaxIntgCdId() throws EventException {
		
		try {
			return dbDao.searchMaxIntgCdId();
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}

	/**
	 * 조회 이벤트 처리<br>
	 * CodeManagement화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return DBRowSet
	 * @exception EventException
	 */
	public DBRowSet searchAPPCodeDetailList(Event e) throws EventException {
		try {
			return dbDao.searchAPPCodeDetailList(e);
		} catch (DAOException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}

	/**
	 * 
	 * multiCodeMgmtMst
	 * @author 김성욱
	 * @param codeMgmtMstVOs
	 * @param account
	 * @throws EventException void
	 */
	public void multiCodeMgmtMst(CodeMgmtMstVO[] codeMgmtMstVOs, SignOnUserAccount account) throws EventException {
		String errFlg = "";
		String dupFlg = "";
//		GeneralCodeMgtBC command = new GeneralCodeMgtBCImpl();
		
		try {
			List<CodeMgmtMstVO> insertVoList = new ArrayList<CodeMgmtMstVO>();
			List<CodeMgmtMstVO> updateVoList = new ArrayList<CodeMgmtMstVO>();
			List<CodeMgmtMstVO> deleteVoList = new ArrayList<CodeMgmtMstVO>();

			for ( int i=0; i<codeMgmtMstVOs .length; i++ ) {
				if ( codeMgmtMstVOs[i].getIbflag().equals("I")){
					codeMgmtMstVOs[i].setCreUsrId(account.getUsr_id());
					codeMgmtMstVOs[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(codeMgmtMstVOs[i]);
				} else if ( codeMgmtMstVOs[i].getIbflag().equals("U")){
					codeMgmtMstVOs[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(codeMgmtMstVOs[i]);
				} else if ( codeMgmtMstVOs[i].getIbflag().equals("D")){
					deleteVoList.add(codeMgmtMstVOs[i]);
				}				
			} 

			if ( insertVoList.size() > 0 ) {
				//Checking Duplication
				for( int idx=0; idx<insertVoList.size(); idx++ ){
					dupFlg = dbDao.searchDupChkCodeMgmtMst(insertVoList.get(idx));
					if( "Y".equals(dupFlg) ){
						errFlg = "Y";
					}
				}
				if( !"Y".equals(errFlg) ){
					dbDao.addAPPCodeList(insertVoList);
//					command.manageIntgCdToMnrBasic(insertVoList);
				} else{
					throw new DuplicateKeyException(new ErrorHandler("COM12115",new String[]{"Master Code"}).getMessage());
				}
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifyCodeMgmtMst(updateVoList);
//				command.manageIntgCdToMnrBasic(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removeCodeMgmtMst(deleteVoList);
//				command.manageIntgCdToMnrBasic(deleteVoList);
			}
			
		} catch(DuplicateKeyException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12115",new String[]{"Master Code"}).getMessage());
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}
	
	/**
	 * 
	 * multiCodeMgmtDtl
	 * @author 김성욱
	 * @param codeMgmtDtlVOs
	 * @param account
	 * @throws EventException void
	 */
	public void multiCodeMgmtDtl(CodeMgmtDtlVO[] codeMgmtDtlVOs, SignOnUserAccount account) throws EventException {
		String errFlg = "";
		String dupFlg = "";
//		GeneralCodeMgtBC command = new GeneralCodeMgtBCImpl();
		
		try {
			List<CodeMgmtDtlVO> insertVoList = new ArrayList<CodeMgmtDtlVO>();
			List<CodeMgmtDtlVO> updateVoList = new ArrayList<CodeMgmtDtlVO>();
			List<CodeMgmtDtlVO> deleteVoList = new ArrayList<CodeMgmtDtlVO>();

			for ( int i=0; i<codeMgmtDtlVOs .length; i++ ) {
				if ( codeMgmtDtlVOs[i].getIbflag().equals("I")){
					codeMgmtDtlVOs[i].setCreUsrId(account.getUsr_id());
					codeMgmtDtlVOs[i].setUpdUsrId(account.getUsr_id());
					insertVoList.add(codeMgmtDtlVOs[i]);
				} else if ( codeMgmtDtlVOs[i].getIbflag().equals("U")){
					codeMgmtDtlVOs[i].setUpdUsrId(account.getUsr_id());
					updateVoList.add(codeMgmtDtlVOs[i]);
				} else if ( codeMgmtDtlVOs[i].getIbflag().equals("D")){
					deleteVoList.add(codeMgmtDtlVOs[i]);
				}				
			} 

			if ( insertVoList.size() > 0 ) {
				//Checking Duplication
				for( int idx=0; idx<insertVoList.size(); idx++ ){
					dupFlg = dbDao.searchDupChkCodeMgmtDtl(insertVoList.get(idx));
					if( "Y".equals(dupFlg) ){
						errFlg = "Y";
					}
				}
				if( !"Y".equals(errFlg) ){
					dbDao.addAPPCodeDetailList(insertVoList);
//					command.manageIntgDtlCdToMnrBasic(insertVoList);
				} else{
					throw new DuplicateKeyException(new ErrorHandler("COM12115",new String[]{"Detail Code"}).getMessage());
				}
			}
			
			if ( updateVoList.size() > 0 ) {
				dbDao.modifyCodeMgmtDtl(updateVoList);
//				command.manageIntgDtlCdToMnrBasic(updateVoList);
			}
			
			if ( deleteVoList.size() > 0 ) {
				dbDao.removeCodeMgmtDtl(deleteVoList);
//				command.manageIntgDtlCdToMnrBasic(deleteVoList);
			}
			
		} catch(DuplicateKeyException de) {
			log.error("err " + de.toString(), de);
			throw new EventException(new ErrorHandler("COM12115",new String[]{"Detail Code"}).getMessage());
		} catch(DAOException ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240",new String[]{}).getMessage(), ex);
		}
	}

	/**
	 * edm 업무 시나리오 마감작업<br>
	 * CodeManagement업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}