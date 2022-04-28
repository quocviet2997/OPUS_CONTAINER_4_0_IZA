/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ConsultationSlipRequestMgtSC.java
*@FileTitle : CSR Creation - Summary
*Open Issues :
*Change history :
*@LastModifyDate :
*@LastModifier : 
*@LastVersion : 1.0
=========================================================*/
package com.clt.bizcommon.csr.consultationsliprequestmgt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic.ConsultationSlipRequestMgtBC;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic.ConsultationSlipRequestMgtBCImpl;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0001Event;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0002Event;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0004Event;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0008Event;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0011Event;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.event.ComCsr0014Event;
import com.clt.framework.component.backend.support.BackEndJobException;
import com.clt.framework.component.backend.support.BackEndJobResult;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.ApPayInvListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AsaNoVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.AutoRevVVDListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOhdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CSRSOlistVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CheckAsaVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.CsrParmVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.DtrbListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrDtrGrpVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.IfCsrListInputVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.SearchDTRBTtlVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.TAXInfoVO;


/**
 * Handling the ALPS-ConsultationSlipRequestMgt Business Logic ServiceCommand - ALPS-ConsultationSlipRequestMgt
 * 
 * @author
 * @see ConsultationSlipRequestMgtDBDAO
 * @since J2EE 1.6
 */

public class ConsultationSlipRequestMgtSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount signOnUserAccount = null;

	/**
	 * Preceding the business scenario of ConsultationSlipRequestMgt system<br>
	 * Creating the related objects<br>
	 */
	public void doStart() {
		log.debug("ConsultationSlipRequestMgtSC Starts");
		try {
			signOnUserAccount = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
	}

	/**
	 * Closing the business scenario of ConsultationSlipRequestMgt system<br>
	 * Clearing the related objects.<br>
	 */
	public void doEnd() {
		log.debug("ConsultationSlipRequestMgtSC Ends");
	}

	/**
	 * Processing all branching events in ALPS-ConsultationSlipRequestMgt system<br>
	 * 
	 * @param e Event
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;

		if (e.getEventName().equalsIgnoreCase("ComCsr0001Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCsrList(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = checkAsaOffice(e);
			}
		}
		if (e.getEventName().equalsIgnoreCase("ComCsr0002Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCSRSummaryDetail(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST01)) {
				eventResponse = searchAsaNoList(e);
			}else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
				eventResponse = approvalRequest(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchPreVeiw(e);
			}
			/* retrieving status value for BackEndJob result */
			else if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
				eventResponse = searchAccrualBackEndJobStatus(e);
			}
			/* retrieving result value for BackEndJob result */
			else if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST03)) {
				try{
					eventResponse = searchAccrualBackEndJobResult(e);
				}catch(BackEndJobException ex){
					throw new EventException(ex.getMessage());
				}
			}
		}
		if (e.getEventName().equalsIgnoreCase("ComCsr0004Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchTAXInfo(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = searchApEviNo(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH03)) {
				eventResponse = searchCompNo(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST01)) {
				eventResponse = searchEviCodeList(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH04)) {
				eventResponse = searchTAXCode(e);
			}
		}
		if (e.getEventName().equalsIgnoreCase("ComCsr0008Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
				eventResponse = searchCsrIfList(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiConfirmCSR(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = cancelCSR(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = tmpSearchPreVeiw(e);
			}
		}
		if (e.getEventName().equalsIgnoreCase("ComCsr0011Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
				eventResponse = searchCSRSOlist(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST01)) {
				eventResponse = searchCSRSOhdr(e);
			}
		} 
		if (e.getEventName().equalsIgnoreCase("ComCsr0014Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
				eventResponse = searchCSRSOlist(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiRejectedCSRCancellation(e);
			}
		} 
		return eventResponse;
	}
 
	/**
	 * Retrieving the CSR list
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCsrList (Event e) throws EventException {
        try{
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
			ComCsr0001Event event = (ComCsr0001Event)e;
			ApPayInvListVO apPayInvListVO = event.getApPayInvListVO();
			
			List<ApPayInvListVO> list = command.searchCsrList (apPayInvListVO);
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse; 
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	
	/**
	 * Checking the A/P and ASA<br>
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse checkAsaOffice(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();    
		// PDTO(Data Transfer Object including Parameters)
        try{
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
			
			ComCsr0001Event event = (ComCsr0001Event)e;
			CheckAsaVO     vo = event.getCheckAsaVO(); 
			CheckAsaVO     checkAsaVO2 = null; 
			
			checkAsaVO2 = command.checkAsaOffice(vo);
			
			if(checkAsaVO2 != null){
				Map<String, String> mapVO = checkAsaVO2.getColumnValues();
				eventResponse.setETCData(mapVO);
			}
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse;
	}
	
	/**
	 * Retrieving the CSR Creation<br>
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCSRSummaryDetail (Event e) throws EventException {
        try{
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
			ComCsr0002Event event = (ComCsr0002Event)e;
			CsrListInputVO csrListInputVO = event.getCsrListInputVO();
			
			List<CsrListInputVO> list = command.searchCSRSummaryDetail (csrListInputVO);
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse; 
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Retrieving the ASA No list to make the combo box.<br>
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse searchAsaNoList(Event e) throws EventException {
		try{
			GeneralEventResponse eventResponse = new GeneralEventResponse();
//			AsaNoVO   asaNoVO = null;
			ComCsr0002Event event =null;
			if(e.getEventName().equalsIgnoreCase("ComCsr0002Event")){
				event = (ComCsr0002Event)e;
//				asaNoVO = event.getAsaNoVO();
			}
			
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
	
//			String costOfcCd 	 = asaNoVO.getCostOfcCd()==null?"":asaNoVO.getCostOfcCd(); 
			String invOfcCd 	 =  event != null?event.getInvOfcCd():""; 
			
			List<AsaNoVO> list = command.searchAsaNoList(invOfcCd);
			
			String comboList = makeComboString(list, 1);
			eventResponse.setETCData("asa_no" ,comboList);
			
			return eventResponse;
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }  
	}

	/**
	 * Retrieving the EVI Code list to make the combo box.
	 * @param Event e
	 * @return EventResponse
	 * @throws Exception 
	 */
	private EventResponse searchEviCodeList(Event e) throws EventException { 
        try{
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			TAXInfoVO   vo = null;
			if(e.getEventName().equalsIgnoreCase("ComCsr0004Event")){
				ComCsr0004Event event = (ComCsr0004Event)e;
				vo = event.getTAXInfoVO();
			}
			
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
	
			List<TAXInfoVO> list = command.searchEviCodeList();
			
			String comboList = makeComboString2(list, 1);
			eventResponse.setETCData("tax_no2" ,comboList);
			return eventResponse;
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}

	/**
	 * Load the page number COM_CSR_0004, or input the business number.<br>
	 * Retrieving the TAX information(business number, vendor code, company name, biz type, address, and representative of the company)     
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchTAXInfo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
        try{
			ComCsr0004Event event = (ComCsr0004Event)e;
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
			
			TAXInfoVO vo = event.getTAXInfoVO();
			String compNo = vo.getCompNo();
			
			vo = command.searchTAXInfo(compNo);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();    
			
			if(vo != null){
				Map<String, String> mapVO = vo.getColumnValues();
				eventResponse.setETCData(mapVO);
			}
			return eventResponse;

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Retrieving the business number.
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCompNo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
        try{
			ComCsr0004Event event = (ComCsr0004Event)e;
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
			
			TAXInfoVO vo = event.getTAXInfoVO();
			vo = command.searchCompNo(vo);
			
			GeneralEventResponse eventResponse = new GeneralEventResponse();    
			
			if(vo != null){
				Map<String, String> mapVO = vo.getColumnValues();
				eventResponse.setETCData(mapVO);
			}
			return eventResponse;
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Getting and saving the new evid_no. 
	 * @param e
	 * @return
	 * @throws EventException
	 */
	private EventResponse searchApEviNo(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComCsr0004Event event = (ComCsr0004Event)e;
		TAXInfoVO vo = event.getTAXInfoVO();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
		
		try{
			begin();
			command.searchApEviNo(vo, signOnUserAccount);
			//eventResponse.setUserMessage(new ErrorHandler("CSR10003").getUserMessage());
			commit();
			
			if(vo != null){
				Map<String, String> mapVO = vo.getColumnValues();
				mapVO.put("gs_flg", "SEARCH02");
				eventResponse.setETCData(mapVO);
			}

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse;
	} 
	
	/**
	 * Retrieving the tax code of the tax invoice. 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchTAXCode(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComCsr0004Event event = (ComCsr0004Event)e;
		TAXInfoVO vo = event.getTAXInfoVO();
		GeneralEventResponse eventResponse = new GeneralEventResponse();    
		
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
		
        try{
			
        	TAXInfoVO tAXInfoVO = command.searchTAXCode(vo);
			
			if(tAXInfoVO != null){
				Map<String, String> mapVO = tAXInfoVO.getColumnValues();
				mapVO.put("tax_code", 	tAXInfoVO.getApTaxNm());
				mapVO.put("gs_flg", "SEARCH04");
				
				eventResponse.setETCData(mapVO);
			}
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
        return eventResponse;
	}
	
	/**
	 * Implementing Approval Request button.
	 * @param Event e
	 * @return EventResponse
	 * @throws Exception 
	 */
	private EventResponse approvalRequest(Event e) throws EventException {
		log.debug("\n\n SC.approvalRequest -------------------  \n\n");
		ComCsr0002Event event = (ComCsr0002Event)e;
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		DBRowSet[] autoRevVVDList = null;
		DBRowSet[] dtrbRowSet = null;
		
		String usr_id = event.getSignOnUserAccount().getUsr_id();
		
		//VO Object for update
		List<AutoRevVVDListVO> autoRevVVDListVO 	= new ArrayList<AutoRevVVDListVO>();
		AutoRevVVDListVO autoRevVVDVO = null;
		//VO Object for IN,OUT
		List<SearchDTRBTtlVO> searchDTRBTtlList 	= new ArrayList<SearchDTRBTtlVO>();
		SearchDTRBTtlVO searchDTRBTtlVO = null;
		//Param Setting
		CsrParmVO   csrParmVO  = event.getCsrParmVO();
		//Model Setting
		Collection	payInvVOs  = event.getPayInvs();
		
		try {
			autoRevVVDList = command.getAutoRevVVDList(payInvVOs, csrParmVO);
			//event.setAutoRowSetArr01(autoRevVVDList);
			if(autoRevVVDList!=null){
				for(int j=0; j<autoRevVVDList.length; j++){
					while (autoRevVVDList[j].next()){
						autoRevVVDVO = new AutoRevVVDListVO();
						
						autoRevVVDVO.setVslCd		(autoRevVVDList[j].getString("vsl_cd"));
						autoRevVVDVO.setSkdVoyNo    (autoRevVVDList[j].getString("skd_voy_no"));
						autoRevVVDVO.setSkdDirCd    (autoRevVVDList[j].getString("skd_dir_cd"));
						autoRevVVDVO.setRevDirCd    (autoRevVVDList[j].getString("rev_dir_cd"));
						autoRevVVDVO.setInvRgstNo   (autoRevVVDList[j].getString("inv_rgst_no"));
						autoRevVVDVO.setInvRgstSeq  (autoRevVVDList[j].getString("inv_rgst_seq"));
						
						autoRevVVDListVO.add(autoRevVVDVO);
					}
				}
			}
			
			//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
			dtrbRowSet =command.searchApInvDTRBOut(event.getPayInvs(), csrParmVO);
			
			//searchDTRBTtlList Setting
			if(dtrbRowSet!=null){
				for(int j=0; j<dtrbRowSet.length; j++){
					while (dtrbRowSet[j].next()){
						searchDTRBTtlVO = new SearchDTRBTtlVO();
						
						searchDTRBTtlVO.setLineSeq			(dtrbRowSet[j].getString("line_seq"));
						searchDTRBTtlVO.setLineNo           (dtrbRowSet[j].getString("line_no"));
						searchDTRBTtlVO.setLineTpLuCd       (dtrbRowSet[j].getString("line_tp_lu_cd"));
						searchDTRBTtlVO.setCsrAmt           (dtrbRowSet[j].getString("csr_amt"));
						searchDTRBTtlVO.setInvDesc          (dtrbRowSet[j].getString("inv_desc"));
						searchDTRBTtlVO.setInvTaxCd         (dtrbRowSet[j].getString("inv_tax_cd"));
						searchDTRBTtlVO.setDtrbCoaCoCd      (dtrbRowSet[j].getString("dtrb_coa_co_cd"));
						searchDTRBTtlVO.setDtrbCoaRgnCd     (dtrbRowSet[j].getString("dtrb_coa_rgn_cd"));
						searchDTRBTtlVO.setDtrbCoaCtrCd     (dtrbRowSet[j].getString("dtrb_coa_ctr_cd"));
						searchDTRBTtlVO.setDtrbCoaAcctCd    (dtrbRowSet[j].getString("dtrb_coa_acct_cd"));
						searchDTRBTtlVO.setDtrbCoaVvdCd     (dtrbRowSet[j].getString("dtrb_coa_vvd_cd"));
						searchDTRBTtlVO.setDtrbCoaInterCoCd (dtrbRowSet[j].getString("dtrb_coa_inter_co_cd"));
						searchDTRBTtlVO.setDtrbCoaFtuN1stCd (dtrbRowSet[j].getString("dtrb_coa_ftu_n1st_cd"));
						searchDTRBTtlVO.setDtrbCoaFtuN2ndCd (dtrbRowSet[j].getString("dtrb_coa_ftu_n2nd_cd"));
						searchDTRBTtlVO.setAttrCateNm       (dtrbRowSet[j].getString("attr_cate_nm"));
						searchDTRBTtlVO.setAttrCtnt1        (dtrbRowSet[j].getString("attr_ctnt1"));
						searchDTRBTtlVO.setAttrCtnt2        (dtrbRowSet[j].getString("attr_ctnt2"));
						searchDTRBTtlVO.setAttrCtnt3        (dtrbRowSet[j].getString("attr_ctnt3"));
						searchDTRBTtlVO.setAttrCtnt4        (dtrbRowSet[j].getString("attr_ctnt4"));
						searchDTRBTtlVO.setAttrCtnt5        (dtrbRowSet[j].getString("attr_ctnt5"));
						searchDTRBTtlVO.setAttrCtnt6        (dtrbRowSet[j].getString("attr_ctnt6"));
						searchDTRBTtlVO.setAttrCtnt7        (dtrbRowSet[j].getString("attr_ctnt7"));
						searchDTRBTtlVO.setAttrCtnt8        (dtrbRowSet[j].getString("attr_ctnt8"));
						searchDTRBTtlVO.setAttrCtnt9        (dtrbRowSet[j].getString("attr_ctnt9"));
						searchDTRBTtlVO.setAttrCtnt10       (dtrbRowSet[j].getString("attr_ctnt10"));
						searchDTRBTtlVO.setAttrCtnt11       (dtrbRowSet[j].getString("attr_ctnt11"));
						searchDTRBTtlVO.setAttrCtnt12       (dtrbRowSet[j].getString("attr_ctnt12"));
						searchDTRBTtlVO.setAttrCtnt13       (dtrbRowSet[j].getString("attr_ctnt13"));
						searchDTRBTtlVO.setAttrCtnt14       (dtrbRowSet[j].getString("attr_ctnt14"));
						searchDTRBTtlVO.setAttrCtnt15       (dtrbRowSet[j].getString("attr_ctnt15"));
						searchDTRBTtlVO.setBkgNo            (dtrbRowSet[j].getString("bkg_no"));
						searchDTRBTtlVO.setCntrTpszCd       (dtrbRowSet[j].getString("cntr_tpsz_cd"));
						searchDTRBTtlVO.setActVvdCd         (dtrbRowSet[j].getString("act_vvd_cd"));
						searchDTRBTtlVO.setPlnSctrDivCd     (dtrbRowSet[j].getString("pln_sctr_div_cd"));
						searchDTRBTtlVO.setSoCrrCd          (dtrbRowSet[j].getString("so_crr_cd"));
						searchDTRBTtlVO.setYdCd             (dtrbRowSet[j].getString("yd_cd"));
						searchDTRBTtlVO.setFtuUseCtnt1      (dtrbRowSet[j].getString("ftu_use_ctnt1"));
						searchDTRBTtlVO.setFtuUseCtnt2      (dtrbRowSet[j].getString("ftu_use_ctnt2"));
						searchDTRBTtlVO.setFtuUseCtnt3      (dtrbRowSet[j].getString("ftu_use_ctnt3"));
						searchDTRBTtlVO.setFtuUseCtnt4      (dtrbRowSet[j].getString("ftu_use_ctnt4"));
						searchDTRBTtlVO.setFtuUseCntr5      (dtrbRowSet[j].getString("ftu_use_cntr5"));
						searchDTRBTtlVO.setCreDt            (dtrbRowSet[j].getString("cre_dt"));
						searchDTRBTtlVO.setCreUsrId         (dtrbRowSet[j].getString("cre_usr_id"));
						searchDTRBTtlVO.setEaiEvntDt        (dtrbRowSet[j].getString("eai_evnt_dt"));
						searchDTRBTtlVO.setStlKeyNo         (dtrbRowSet[j].getString("stl_key_no"));
						searchDTRBTtlVO.setOwnrVndrSeq      (dtrbRowSet[j].getString("ownr_vndr_seq"));
						
						searchDTRBTtlList.add(searchDTRBTtlVO);
					}
				}
			}
			
			/*******Start of the long transaction*******/
			begin();
			//autoRevVVDListVO : autoRevVVDList : VO for update, searchDTRBTtlVOList : Domestic or overseas VO, csrParmVO : Parameter VO
			String key = command.approvalRequest(event.getPayInvs(), autoRevVVDListVO, searchDTRBTtlList, csrParmVO, usr_id); 
			eventResponse.setETCData("key", key);
			commit();
			/*******End of the long transaction*******/

		} catch (EventException ex) {
//			ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
			rollback();
			throw ex;
		} catch (Exception ex) {
            rollback();
//			ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
			throw new EventException(ex.getMessage(), ex);
		}
		return eventResponse;
	}
	
    /**
     * Retrieving the status value for BackEndJob result and error messages.
     * @param Event e
     * @return EventResponse
     * @throws BackEndJobException
     */
	private EventResponse searchAccrualBackEndJobStatus(Event e) throws EventException {
		try{
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
			String key = (String)e.getAttribute("key");
			String statusNerr = command.searchBakEndJobStatus(key);
			eventResponse.setETCData("jb_sts_flg", statusNerr.substring(0,1));
			eventResponse.setETCData("jb_usr_err_msg", statusNerr.substring(1));
			return eventResponse;
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
    
	/**
	 * 
	 * Retrieving the status value for BackEndJob result - retrieving the CSR_NO.
     * @param Event e
     * @return EventResponse
	 * @throws BackEndJobException
	 * @throws EventException 
	 */
	private EventResponse searchAccrualBackEndJobResult(Event e) throws BackEndJobException {
		String key = (String)e.getAttribute("key");
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		eventResponse.setETCData("csr_no", (String)BackEndJobResult.loadFromFile(key));
		return eventResponse;
	}
	
	/**
	 * Implementing the Preview button. - Page name : COM_CSR_0002
	 * @param Event e
	 * @return EventResponse
	 * @throws Exception 
	 */
	private EventResponse searchPreVeiw(Event e) throws EventException {
		log.debug("\n\n SC.searchPreVeiw -------------------  \n\n");
		ComCsr0002Event event = (ComCsr0002Event)e;
		
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		DBRowSet[] autoRevVVDList = null;
		DBRowSet[] dtrbRowSet = null;
		
		String usr_id = event.getSignOnUserAccount().getUsr_id();
		
		//VO for update
		List<AutoRevVVDListVO> autoRevVVDListVO 	= new ArrayList<AutoRevVVDListVO>();
		AutoRevVVDListVO autoRevVVDVO = null;
		//VO for in, out
		List<SearchDTRBTtlVO> searchDTRBTtlList 	= new ArrayList<SearchDTRBTtlVO>();
		SearchDTRBTtlVO searchDTRBTtlVO = null;
		//Param Setting
		CsrParmVO   csrParmVO  = event.getCsrParmVO();
		//Model Setting
		Collection	payInvVOs  = event.getPayInvs();
		
		try {
			autoRevVVDList = command.getAutoRevVVDList(payInvVOs, csrParmVO);
			//event.setAutoRowSetArr01(autoRevVVDList);
			if(autoRevVVDList!=null){
				for(int j=0; j<autoRevVVDList.length; j++){
					while (autoRevVVDList[j].next()){
						autoRevVVDVO = new AutoRevVVDListVO();
						
						autoRevVVDVO.setVslCd		(autoRevVVDList[j].getString("vsl_cd"));
						autoRevVVDVO.setSkdVoyNo    (autoRevVVDList[j].getString("skd_voy_no"));
						autoRevVVDVO.setSkdDirCd    (autoRevVVDList[j].getString("skd_dir_cd"));
						autoRevVVDVO.setRevDirCd    (autoRevVVDList[j].getString("rev_dir_cd"));
						autoRevVVDVO.setInvRgstNo   (autoRevVVDList[j].getString("inv_rgst_no"));
						autoRevVVDVO.setInvRgstSeq  (autoRevVVDList[j].getString("inv_rgst_seq"));
						
						autoRevVVDListVO.add(autoRevVVDVO);
					}
				}
			}
			
			//2014.11.12 Delete KR, KRW hard-coding logic, TAX logic change by IY Cho
			dtrbRowSet =command.searchApInvDTRBOut(event.getPayInvs(), csrParmVO);
			
			//searchDTRBTtlList Setting
			if(dtrbRowSet!=null){
				for(int j=0; j<dtrbRowSet.length; j++){
					while (dtrbRowSet[j].next()){
						searchDTRBTtlVO = new SearchDTRBTtlVO();
						
						searchDTRBTtlVO.setLineSeq			(dtrbRowSet[j].getString("line_seq"));
						searchDTRBTtlVO.setLineNo           (dtrbRowSet[j].getString("line_no"));
						searchDTRBTtlVO.setLineTpLuCd       (dtrbRowSet[j].getString("line_tp_lu_cd"));
						searchDTRBTtlVO.setCsrAmt           (dtrbRowSet[j].getString("csr_amt"));
						searchDTRBTtlVO.setInvDesc          (dtrbRowSet[j].getString("inv_desc"));
						searchDTRBTtlVO.setInvTaxCd         (dtrbRowSet[j].getString("inv_tax_cd"));
						searchDTRBTtlVO.setDtrbCoaCoCd      (dtrbRowSet[j].getString("dtrb_coa_co_cd"));
						searchDTRBTtlVO.setDtrbCoaRgnCd     (dtrbRowSet[j].getString("dtrb_coa_rgn_cd"));
						searchDTRBTtlVO.setDtrbCoaCtrCd     (dtrbRowSet[j].getString("dtrb_coa_ctr_cd"));
						searchDTRBTtlVO.setDtrbCoaAcctCd    (dtrbRowSet[j].getString("dtrb_coa_acct_cd"));
						searchDTRBTtlVO.setDtrbCoaVvdCd     (dtrbRowSet[j].getString("dtrb_coa_vvd_cd"));
						searchDTRBTtlVO.setDtrbCoaInterCoCd (dtrbRowSet[j].getString("dtrb_coa_inter_co_cd"));
						searchDTRBTtlVO.setDtrbCoaFtuN1stCd (dtrbRowSet[j].getString("dtrb_coa_ftu_n1st_cd"));
						searchDTRBTtlVO.setDtrbCoaFtuN2ndCd (dtrbRowSet[j].getString("dtrb_coa_ftu_n2nd_cd"));
						searchDTRBTtlVO.setAttrCateNm       (dtrbRowSet[j].getString("attr_cate_nm"));
						searchDTRBTtlVO.setAttrCtnt1        (dtrbRowSet[j].getString("attr_ctnt1"));
						searchDTRBTtlVO.setAttrCtnt2        (dtrbRowSet[j].getString("attr_ctnt2"));
						searchDTRBTtlVO.setAttrCtnt3        (dtrbRowSet[j].getString("attr_ctnt3"));
						searchDTRBTtlVO.setAttrCtnt4        (dtrbRowSet[j].getString("attr_ctnt4"));
						searchDTRBTtlVO.setAttrCtnt5        (dtrbRowSet[j].getString("attr_ctnt5"));
						searchDTRBTtlVO.setAttrCtnt6        (dtrbRowSet[j].getString("attr_ctnt6"));
						searchDTRBTtlVO.setAttrCtnt7        (dtrbRowSet[j].getString("attr_ctnt7"));
						searchDTRBTtlVO.setAttrCtnt8        (dtrbRowSet[j].getString("attr_ctnt8"));
						searchDTRBTtlVO.setAttrCtnt9        (dtrbRowSet[j].getString("attr_ctnt9"));
						searchDTRBTtlVO.setAttrCtnt10       (dtrbRowSet[j].getString("attr_ctnt10"));
						searchDTRBTtlVO.setAttrCtnt11       (dtrbRowSet[j].getString("attr_ctnt11"));
						searchDTRBTtlVO.setAttrCtnt12       (dtrbRowSet[j].getString("attr_ctnt12"));
						searchDTRBTtlVO.setAttrCtnt13       (dtrbRowSet[j].getString("attr_ctnt13"));
						searchDTRBTtlVO.setAttrCtnt14       (dtrbRowSet[j].getString("attr_ctnt14"));
						searchDTRBTtlVO.setAttrCtnt15       (dtrbRowSet[j].getString("attr_ctnt15"));
						searchDTRBTtlVO.setBkgNo            (dtrbRowSet[j].getString("bkg_no"));
						searchDTRBTtlVO.setCntrTpszCd       (dtrbRowSet[j].getString("cntr_tpsz_cd"));
						searchDTRBTtlVO.setActVvdCd         (dtrbRowSet[j].getString("act_vvd_cd"));
						searchDTRBTtlVO.setPlnSctrDivCd     (dtrbRowSet[j].getString("pln_sctr_div_cd"));
						searchDTRBTtlVO.setSoCrrCd          (dtrbRowSet[j].getString("so_crr_cd"));
						searchDTRBTtlVO.setYdCd             (dtrbRowSet[j].getString("yd_cd"));
						searchDTRBTtlVO.setFtuUseCtnt1      (dtrbRowSet[j].getString("ftu_use_ctnt1"));
						searchDTRBTtlVO.setFtuUseCtnt2      (dtrbRowSet[j].getString("ftu_use_ctnt2"));
						searchDTRBTtlVO.setFtuUseCtnt3      (dtrbRowSet[j].getString("ftu_use_ctnt3"));
						searchDTRBTtlVO.setFtuUseCtnt4      (dtrbRowSet[j].getString("ftu_use_ctnt4"));
						searchDTRBTtlVO.setFtuUseCntr5      (dtrbRowSet[j].getString("ftu_use_cntr5"));
						searchDTRBTtlVO.setCreDt            (dtrbRowSet[j].getString("cre_dt"));
						searchDTRBTtlVO.setCreUsrId         (dtrbRowSet[j].getString("cre_usr_id"));
						searchDTRBTtlVO.setEaiEvntDt        (dtrbRowSet[j].getString("eai_evnt_dt"));
						searchDTRBTtlVO.setStlKeyNo         (dtrbRowSet[j].getString("stl_key_no"));
						searchDTRBTtlVO.setOwnrVndrSeq      (dtrbRowSet[j].getString("ownr_vndr_seq"));
						
						searchDTRBTtlList.add(searchDTRBTtlVO);
					}
				}
			} 

			begin();
			
			HdrDtrGrpVO grpVO = command.searchPreVeiw(event.getPayInvs(), autoRevVVDListVO, searchDTRBTtlList, csrParmVO, usr_id);
			HdrVO    hdrSet = grpVO.getHdrVOs();
			List<DtrbListVO> dtrbSet = grpVO.getDtrbListVOs();
			
			eventResponse.setRsVo(hdrSet);
			eventResponse.setRsVoList(dtrbSet);
			
			//eventResponse.setUserMessage(new ErrorHandler("CSR10003").getUserMessage());
			//commit(); 
			rollback();
			

		} catch (EventException ex) {
//			ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
			rollback();
			throw ex;
		} catch (Exception ex) {
            rollback();
//			ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
			throw new EventException(ex.getMessage(), ex);
		}
		return eventResponse;
	}
	
	/**
	 * Implementing the CSR Format button - Page name : COM_CSR_0008
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse tmpSearchPreVeiw(Event e) throws EventException {

		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ComCsr0008Event event = (ComCsr0008Event)e;

		CsrParmVO csrParmVO = event.getCsrParmVO();
		String csrNo = csrParmVO.getCsrNo();
		
		try {
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
			
			begin();
			
			HdrDtrGrpVO grpVO = command.tmpSearchPreVeiw(csrNo);
			HdrVO    hdrSet = grpVO.getHdrVOs();
			List<DtrbListVO> dtrbSet = grpVO.getDtrbListVOs();
			
			eventResponse.setRsVo(hdrSet);
			eventResponse.setRsVoList(dtrbSet);

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of the CSR I/F.
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCsrIfList (Event e) throws EventException {
        try{
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
			ComCsr0008Event event = (ComCsr0008Event)e;
			IfCsrListInputVO ifCsrListInputVO = event.getIfCsrListInputVO();
			
			List<IfCsrListInputVO> list = command.searchCsrIfList (ifCsrListInputVO);
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse; 
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}

	/**
	 * Retrieving the Invoice List 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCSRSOlist(Event e) throws EventException {
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		CSRSOlistVO vo = null;
		if (e.getEventName().equalsIgnoreCase("ComCsr0011Event")) {
			ComCsr0011Event event = (ComCsr0011Event) e;
			vo = event.getCSRSOlistVO();
		} else {
			ComCsr0014Event event = (ComCsr0014Event) e;
			vo = event.getCSRSOlistVO();
		}
		
		try {
			log.debug("\n\n SC - searchCSRSOlist() \n\n");
			List<CSRSOlistVO> list = command.searchCSRSOlist (vo);
			eventResponse.setRsVoList(list);

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse; 
	} 
	
	/**
	 * Retrieving the invoice list 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCSRSOhdr(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
        try{
			ComCsr0011Event event = (ComCsr0011Event)e;
			ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl(); 
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			CSRSOhdrVO vo = event.getCSRSOhdrVO(); 
			vo = command.searchCSRSOhdr(vo); 
			eventResponse.setRsVo(vo);
			 
			return eventResponse;
        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}
	
	/**
	 * Implementing the CSR Cancel button - Page name : COM_CSR_0008
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse multiConfirmCSR(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComCsr0008Event event = (ComCsr0008Event)e;
		IfCsrListInputVO vo = event.getIfCsrListInputVO();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		
		try{
			begin();
			command.multiConfirmCSR(vo, signOnUserAccount);
			eventResponse.setUserMessage(new ErrorHandler("CSR10003").getUserMessage());
			commit();

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse;
	}
	
	/**
	 * Saving the cancelled CSR.
	 * @param  Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse cancelCSR(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComCsr0008Event event = (ComCsr0008Event)e;
		IfCsrListInputVO vo = event.getIfCsrListInputVO();
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		
		try{
			begin();
			command.cancelCSR(vo,signOnUserAccount);
			eventResponse.setUserMessage(new ErrorHandler("CSR10003").getUserMessage());
			commit();

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse;
	}
	
	/**
	 * Saving the cancellation of A/P Rejected & Disapproved by the invoice.
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse multiRejectedCSRCancellation(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		ComCsr0014Event event = (ComCsr0014Event)e;
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		
		//Param Setting
		CsrParmVO   csrParmVO  = event.getCsrParmVO();
		//Model Setting
		Collection	payInvVOs  = event.getPayInvs();
		//chk Array
		String[] chks = event.getChks();
		//session
		String usrId = event.getSignOnUserAccount().getUsr_id();
		String ofcCd = event.getSignOnUserAccount().getOfc_cd();
		
		try{
			begin();
			command.multiRejectedCSRCancellation(payInvVOs, chks, csrParmVO, usrId, ofcCd);
			eventResponse.setUserMessage(new ErrorHandler("CSR10003").getUserMessage());
			commit();

        } catch (EventException ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
		return eventResponse;
	}
	
	/**
	 * Converting the combo to string.
	 * @param List<AsaNoVO> list
	 * @param int flg
	 * @return String
	 * @throws EventException
	 */
	private String makeComboString(List<AsaNoVO> list, int flg) throws Exception{
        try{
			String rtnVal = null;
			StringBuilder sb = new StringBuilder();
			
			Iterator iterator = (Iterator) list.iterator();
	
			while(iterator.hasNext()){
				AsaNoVO vo = (AsaNoVO)iterator.next();
				//For the General IBCombo(name, code|)
				if (flg==0){
					sb.append(vo.getName()+","+vo.getCode()+"|");
				//For IBCombo (code, code|)
				}else if (flg==1){
					sb.append(vo.getName()+","+vo.getName()+"|");
				//For the code of the IBSheet(code|)
				}else if (flg==2){ 
					sb.append(vo.getCode()+"|");
				//For the code name of the IBSheet(name|)
				}else if (flg==3){
					sb.append(vo.getName()+"|"); 
				}
			}
			rtnVal = sb.toString();
	
			if (rtnVal.length() > 0){
				rtnVal = rtnVal.substring(0,rtnVal.length()-1);
			}
			
			return rtnVal;
        } catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	}	
	
	/**
	 * Common : String for making the combo box
	 * Convert the combo box to String to make the combo box. 
	 * @param List<TAXInfoVO> list
	 * @param int flg
	 * @return String
	 * @throws EventException
	 */
	private String makeComboString2(List<TAXInfoVO> list, int flg) throws Exception{
        try{
			String rtnVal = null;
			StringBuilder sb = new StringBuilder();
			
			Iterator iterator = (Iterator) list.iterator();
	
			while(iterator.hasNext()){
				TAXInfoVO vo = (TAXInfoVO)iterator.next();
				//For the General IBCombo(name, code|)
				if (flg==0){
					sb.append(vo.getWkplcNmstring()+","+vo.getWkplcNmstring()+"|");
				//For IBCombo (code, code|)
				}else if (flg==1){
					sb.append(vo.getWkplcNmstring()+","+vo.getWkplcNmstring()+"|");
				//For the code of the IBSheet(code|)
				}else if (flg==2){
					sb.append(vo.getWkplcNmstring()+"|");
				//For the code name of the IBSheet(name|)
				}else if (flg==3){
					sb.append(vo.getWkplcNmstring()+"|"); 
				}
			}
			rtnVal = sb.toString();
	
			if (rtnVal.length() > 0){
				rtnVal = rtnVal.substring(0,rtnVal.length()-1);
			}
			
			return rtnVal;
        }catch (Exception ex) {
//            ex.printStackTrace();
        	log.error("err"+ex.toString(),ex);
            throw new EventException(ex.getMessage(), ex);
        }
	} 
}