/*=========================================================
 *Copyright(c) 2006 CyberLogitec
 *@FileName : ReceiveQueueAR_FINC_DIR_CONVImpl.java
 *@FileTitle : ENIS Interface 연동 
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2007-03-05
 *@LastModifier : Jung-Hyung,Kim
 *@LastVersion : 1.0
 * 2007-03-05 Jung-Hyung,Kim
 * 1.0 최초 생성
 =========================================================*/
package com.clt.bizcommon.erpcom.jms.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.apache.xmlbeans.XmlObject;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic.ConsultationSlipRequestMgtBCImpl;
import com.clt.bizcommon.erpcom.jms.integration.ReceiveQueueDBDAO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.irep.enis.FNS008R003Document;
import com.clt.irep.enis.FNS008R003Document.FNS008R003;
import com.clt.irep.enis.FNS008R003Document.FNS008R003.DataArea;
import com.clt.irep.enis.FNS008R003Document.FNS008R003.DataArea.ROWSET;
import com.clt.irep.enis.FNS008R003Document.FNS008R003.DataArea.ROWSET.ROW;
import com.clt.irep.erp.FNS0100002Document;
import com.clt.irep.erp.FNS0100002Document.FNS0100002;
import com.clt.syscommon.common.table.AP_INV_IF;

/**
 * XML 메시지를 parsing 하고 DBDAO에게 넘겨준다.
 * @author Jung-Hyung,Kim
 * @see ReceiveQueueBC, ReceiveQueueDBDAO 참조
 * @since J2EE 1.4
 */
public class ReceiveQueueBCImpl extends BasicCommandSupport	implements ReceiveQueueBC {
	private transient ReceiveQueueDBDAO dbDao = null;

	/**
	 * 생성자
	 */
	public ReceiveQueueBCImpl() {
		dbDao = new ReceiveQueueDBDAO();
	}

	/**
	 * FNS008R003Document parse
	 * @param XmlObject xmlObject 인터페이스 결과를 담고 있는 XmlObject 객체
	 * @return Collection xml을 파싱하여 얻은 인터페이스 결과를 담은 Collection 객체
	 */
	public Collection receiveFNS008R003(XmlObject xmlObject) {
		FNS008R003Document doc = (FNS008R003Document) xmlObject;
		FNS008R003 sync = doc.getFNS008R003();
		DataArea data = sync.getDataArea();
		ROWSET rowset = data.getROWSET();
		ROW[] row = rowset.getROWArray();

		AP_INV_IF model = null;
		Collection models = new ArrayList();

		for (int i=0; row!=null && i<row.length; i++) {
			model = new AP_INV_IF();
			model.setAp_pgm_no(row[i].getPGMID());
			//model.setXXXXX(row[i].getOPCD());
			//model.setXXXXX(row[i].getOPIND());
			model.setHdr_csr_no(row[i].getCSRNUMBER());
			model.setHdr_if_dt(row[i].getINTERFACEDATE());
			model.setHdr_if_flg(row[i].getSTATUS());
			model.setHdr_if_err_rsn(row[i].getERRORREASON());
			//CANCEL DATE 추가되어 사용(cxl_dt = ATTRIBUTE1)
			model.setCxl_dt(row[i].getATTRIBUTE1());		//Cancel date : 이호진 getATTRIBUTE1 로 사용함 (20090710)
			//model.setXXXXX(row[i].getATTRIBUTE2());
			//model.setXXXXX(row[i].getATTRIBUTE3());
			//model.setXXXXX(row[i].getATTRIBUTE4());
			//model.setXXXXX(row[i].getATTRIBUTE5());
			
			models.add(row[i].getOPCD());
			models.add(row[i].getOPIND());
			models.add(model);
		}
		return models;
	}
	/**
	 * status, div에 따라 DBDAO의 메서드를 호출하고, 각 모듈별로 분기하여 후행작업을 실행한다.
	 * @param Collection models 인터페이스 결과를 담은 Collection 객체
	 */
	public void ctrlFNS008R003First(Collection models) throws EventException {
		AP_INV_IF model = null;
		int i=1;
		String sts = "";	//등록,수정,삭제 구분자
		String div = "";	//인터페이스결과,ERP접수결과 구분자
		String rtnPgmId = "";	//리턴받은 AP_PGM_ID

		try {
			Iterator itr = models.iterator();
			while(itr.hasNext()){
				if(i%3==1){
					sts = (String)itr.next();
				}else if(i%3==2){
					div = (String)itr.next();
				}else{
					model = (AP_INV_IF)itr.next();
		
					if(sts.equals("U")){
						log.debug("<<<<< STATUS : " + sts + " >>>>>");
						log.debug("<<<<< RESULT : " + div + " >>>>>");
							
						////인터페이스결과 공통 처리
						rtnPgmId = dbDao.modifyFNS008R003(div, model);						
						
					}else{
						log.debug("<<<<< STATUS : " + sts + " >>>>>");
						log.debug("<<<<< RESULT : " + div + " >>>>>");
					}//if(sts.equals("U")){
					
				}//if(i%3==1){
				i++;
			}//while (itr.hasNext()) {
				
		}catch(DAOException de){
			if(model != null) {
				log.error("ctrlFNS008R003First Error CSR_NO : " + model.getCsr_no());
			}
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}catch(Exception ex){
			if(model != null) {
				log.error("ctrlFNS008R003First Error CSR_NO : " + model.getCsr_no());
			}
			log.error("err " + ex.toString(), ex);
			throw new EventException(ex.getMessage());
		}
	}
	
	/**
	 * status, div에 따라 DBDAO의 메서드를 호출하고, 각 모듈별로 분기하여 후행작업을 실행한다.
	 * @param Collection models 인터페이스 결과를 담은 Collection 객체
	 */
	public void ctrlFNS008R003Second(Collection models) throws EventException {
log.error("======================== start bcimpl.ctrlFNS008R003Second =============");

		AP_INV_IF model = null;
		int i=1;
		String sts = "";	//등록,수정,삭제 구분자
		String div = "";	//인터페이스결과,ERP접수결과 구분자
		String rtnPgmId = "";	//리턴받은 AP_PGM_ID

		try {
			Iterator itr = models.iterator();
			while(itr.hasNext()){
				if(i%3==1){
					sts = (String)itr.next();
				}else if(i%3==2){
					div = (String)itr.next();
				}else{
					model = (AP_INV_IF)itr.next();
					
					if(sts.equals("U")){
						log.debug("<<<<< STATUS : " + sts + " >>>>>");
						log.debug("<<<<< RESULT : " + div + " >>>>>");
							
						////인터페이스결과 공통 처리
						rtnPgmId = dbDao.getPgmId(div, model) == null ? "":dbDao.getPgmId(div, model);
						/*
						if(rtnPgmId != null && rtnPgmId.length() >= 6){
							pgmFlag = rtnPgmId.substring(3,6);
						}else{
							pgmFlag = ""; 
						}*/
						/*
						 * TES : SO_TERMINAL
						 * TRS : SO_TRANS
						 * CSR : SO_M&R, EQ, SO_LEASE, SO_PORT, SO_CHASSIS, SO_MGSET
						 */
						
						////인터페이스결과 모듈별 처리
						if(rtnPgmId.equals("SO_TERMINAL")){                              
							log.debug("<<<<< TES >>>>>");
							                                                                                                        
//							if(model.getHdr_if_flg().equals("Y")){          
//								CARIssueTransferSlipManageBCImpl tesCsr = new CARIssueTransferSlipManageBCImpl();
//								tesCsr.approvalAfterTPB(model.getHdr_csr_no());
//							} else if(!"I".equals(div)){                    
//						        CARIssueTransferSlipManageBCImpl tesCsr = new CARIssueTransferSlipManageBCImpl();
//						        tesCsr.approvalRejectLEA(model.getHdr_csr_no());        
//						    }
              
						}else if(rtnPgmId.equals("SO_TRANS")){                        
							log.debug("<<<<< TRS >>>>>");                   
							//TO-DO
//							if("I".equals(div) && model.getHdr_if_flg().equals("Y")){
//								CSRIssueTransferSlipManageBCImpl trsCsr = new CSRIssueTransferSlipManageBCImpl();
//								trsCsr.approvalSuccess(model.getHdr_csr_no());
//							} else if(!"I".equals(div)) {                   
//								CSRIssueTransferSlipManageBCImpl trsCsr = new CSRIssueTransferSlipManageBCImpl();
//								trsCsr.approvalReject(model.getHdr_csr_no());
//							}                                               
							                                                
						}else if(rtnPgmId.equals("BROKERAGE") || rtnPgmId.equals("COMMISSION")){                        
							log.debug("<<<<< AGT >>>>>");                   
							//TO-DO                     
						}else if(rtnPgmId.equals("SO_M&R") || rtnPgmId.equals("EQ") || rtnPgmId.equals("SO_LEASE") || rtnPgmId.equals("SO_PORT") || rtnPgmId.equals("SO_CHASSIS") || rtnPgmId.equals("SO_MGSET") || rtnPgmId.equals("SO_CCC")){
							log.debug("<<<<< CSR >>>>>");
	
							if("I".equals(div) && model.getHdr_if_flg().equals("Y")){
								ConsultationSlipRequestMgtBCImpl comCsr = new ConsultationSlipRequestMgtBCImpl();
								comCsr.approvalSrCSR(model.getHdr_csr_no(), "1");
							}else if(!"I".equals(div)) {
								ConsultationSlipRequestMgtBCImpl comCsr = new ConsultationSlipRequestMgtBCImpl();
								comCsr.approvalSrCSR(model.getHdr_csr_no(), "2");
							}
						}
						
					}else{
						log.debug("<<<<< STATUS : " + sts + " >>>>>");
						log.debug("<<<<< RESULT : " + div + " >>>>>");
					}//if(sts.equals("U")){
					
				}//if(i%3==1){
				i++;
			}//while (itr.hasNext()) {
				
		}catch(DAOException de){
			if(model != null) {
				log.error("ctrlFNS008R003Second Error CSR_NO : " + model.getCsr_no());
			}
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}catch(Exception ex){
			if(model != null) {
				log.error("ctrlFNS008R003Second Error CSR_NO : " + model.getCsr_no());
			}
			log.error("err " + ex.toString(), ex);
			throw new EventException(ex.getMessage());
		}
	}
	
	/**
	 * FNS008R003Document parse
	 * @param XmlObject xmlObject
	 * @return Collection
	 */
	public Collection receiveFNS0100002(XmlObject xmlObject) {
		log.debug("\n BC.receiveFNS0100002() \n");
		log.debug("xmlObject=" + xmlObject);
		
		FNS0100002Document doc = (FNS0100002Document) xmlObject;
		log.debug("\nFNS0100002Document:\n"+doc.toString()+"\n");
		FNS0100002 sync = (FNS0100002) doc.getFNS0100002();
		sync.getEAIHeader();
		FNS0100002Document.FNS0100002.DataArea data = (com.clt.irep.erp.FNS0100002Document.FNS0100002.DataArea) sync.getDataArea();
		
		FNS0100002Document.FNS0100002.DataArea.ROWSET rowset = data.getROWSET();
		FNS0100002Document.FNS0100002.DataArea.ROWSET.ROW[] row = rowset.getROWArray();
		AP_INV_IF model = null;
		Collection models = new ArrayList();
		for (int i=0; row!=null && i<row.length; i++) {
			model = new AP_INV_IF();
			model.setHdr_csr_no(row[i].getINVOICENUM());
			model.setHdr_pay_amt(row[i].getAMOUNT());
			model.setHdr_pay_dt(row[i].getACCOUNTINGDATE());
			model.setHdr_ftu_use_ctnt1(row[i].getPAYCHECKNUMBER());
			model.setHdr_pay_mzd_lu_cd(row[i].getPAYMENTMETHOD()); 
			
			models.add(model);
		}
		return models;
	}

	/**
	 * AP_HDR, SO_HDR UPDATE
	 * @param Collection models
	 */
	public void ctrlFNS0100002(Collection models) {
		log.debug("\n BC.ctrlFNS0100002() ------  \n"); 
		
		AP_INV_IF model = null;
		int i=1;
		String rtnVal = "";
		log.debug("models.size"+models.size());
		Iterator itr = models.iterator();
		while (itr.hasNext()) {
			model = (AP_INV_IF)itr.next();
			log.debug("\n\n ctrlFNS0100002 MODEL:"+i+"<<<\n"+model+"\n\n");
			try {
				
				//AP_INV_IF와 AP_INV_HDR의 상태 FLG및 기타 DATA를 UPDATE한다.
				rtnVal = dbDao.modifyFNS0100002(model);
				
				if(rtnVal.equals("SO_TERMINAL")){
					log.debug("TES!!");
					//SO_HDR (CSR_NO기준으로 PAYMENT_FLG('Y'), PAYMENT_DT)'
					dbDao.modifyTESInvHdr(model);
				}else if(rtnVal.equals("BROKERAGE") || rtnVal.equals("COMMISSION")){
					log.debug("AGT!!");
				}else if(rtnVal.equals("SO_M&R") || rtnVal.equals("EQ") || rtnVal.equals("SO_LEASE") || rtnVal.equals("SO_PORT") || rtnVal.equals("SO_CHASSIS") || rtnVal.equals("SO_MGSET") || rtnVal.equals("SO_CCC")){
					dbDao.modifyCSRPayInv(model);
					log.debug("CSR!!");
				}else if(rtnVal.equals("SO_TRANS")){ 
//					CSRIssueTransferSlipManageBCImpl trsCsr = new CSRIssueTransferSlipManageBCImpl();
//					trsCsr.modifyTrsInvHdr(model);                                                  
				}
			} catch (DAOException de) {
				log.error("err " + de.toString(), de);
			}
			i++;
		}
	}
	
}
