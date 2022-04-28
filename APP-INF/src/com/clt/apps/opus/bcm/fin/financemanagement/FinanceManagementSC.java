/*=========================================================
 *Copyright(c) 2011 CyberLogitec
 *@FileName : FinanceManagementSC.java
 *@FileTitle : FinanceManagement
 *Open Issues :
 *Change history :
 *@LastModifyDate : 
 *@LastModifier : 
 *@LastVersion : 1.0
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement;

import java.util.List;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.basic.FinanceCreationBC;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.basic.FinanceCreationBCImpl;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0001Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0002Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0003Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0004Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0005Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0006Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0007Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.BcmFin0011Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.ComCom1001Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.ComCom1002Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.ComCom1003Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event.ComCom1004Event;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlCtrErpVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlErrVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlEstmRevVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.GlFmcEntVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.RevenueMonthVvdVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchApPeriodListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArFincDirConvListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArMasterRevenueVvdListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchArRouteRankListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchEstmVvdCreationFlagVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchGlEstimateRevenueVvdListVO;
import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.SearchGlMonthlyExchangeRateListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.GlDlyXchRtVO;

/**
 * Handling the business transaction - OPUS_CNTR-FinanceManagement Business Logic ServiceCommand - OPUS_CNTR-FinanceManagement
 * 
 * @author
 * @see FinanceCreationBC, FinanceCreationBCImpl, FinanceCreationDBDAO
 * @since J2EE 1.6
 */

public class FinanceManagementSC extends ServiceCommandSupport {

	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Preceding the process for the business scenario of SetupManagement system<br>
	 * Creating the related objects of SetupCreation<br>
	 */
	public void doStart() {
		try {
			account = getSignOnUserAccount();
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
		}
	}

	/**
	 * Closing the business scenario of SetupManagement system<br>
	 * Clearing the related objects of SetupCreation<br>
	 */
	public void doEnd() {
		log.debug("FinanceManagementSC Ends");
	}

	/**
	 * Calling the method by the event and the form command of OPUS_CNTR-SetupManagement system <br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		EventResponse eventResponse = null;

		if (e.getEventName().equalsIgnoreCase("BcmFin0001Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchApPeriodList(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageApPeriod(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
				eventResponse = manageOpenNextMonthApPeriod(e);
			} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchMaxApPeriodList(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0002Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchArFincDirConvList(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageArFinDirConv(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0003Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchArMasterRevenueVvdList(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageArMasterRevenueVvd(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0004Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchArRouteRankList(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageArRouteRank(e);
			}  else if (e.getFormCommand().isCommand(FormCommand.INIT)){
				eventResponse = searchComboCdList0004(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0005Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchGlEstimateRevenueVvdList(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageGlEstimateRevenueVvd(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0006Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchGlMonthlyExchangeRateList(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageGlMonthlyExchangeRate(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("ComCom1001Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchCenterCode(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageCenterCode(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("ComCom1002Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchErrorVvd(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageErrorVvd(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("ComCom1003Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchEstRvvdCode(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageEstRvvdCode(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.COMMAND01)) {
                eventResponse = manageEstmRevVVDInfo(e);    
			} else if (e.getFormCommand().isCommand(FormCommand.REPLY)) {
				eventResponse = searchEstmVvdCreationFlag(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("ComCom1004Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchEstFmcCode(e);
			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageEstFmcCode(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0007Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchGlDailyExchangeRateList(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageGlDailyExchangeRate(e);
			}
		} else if (e.getEventName().equalsIgnoreCase("BcmFin0011Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchRevenueVvdMonth(e);

			} else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = manageRevenueVvdMonth(e);
			}
		} 

		return eventResponse;
	}

	/**
	 * Retrieving the list of AP period.
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchApPeriodList(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		BcmFin0001Event event = (BcmFin0001Event) e;
		FinanceCreationBC command = new FinanceCreationBCImpl();
		try {
			List<SearchApPeriodListVO> searchApPeriodListVO = command
					.searchApPeriodList(event.getEffYrmon(), event.getSysDivCd().trim(), event.getOfcCd(), event.getArApDivCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(searchApPeriodListVO);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Saving the data of AP period(inserting, updating and deleting)
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse manageApPeriod(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0001Event event = (BcmFin0001Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			SearchApPeriodListVO[] searchApPeriodListVOs = event.getSearchApPeriodListVOS();

			String usrId = account.getUsr_id();

			begin();
			command.manageApPeriod(searchApPeriodListVOs, usrId);
            //불필요 삭제   
			//eventResponse = (GeneralEventResponse) searchApPeriodList(e);

			//eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * Retrieving the list of AR Finance Direction Conversion.
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchArFincDirConvList(Event e) throws EventException {
		BcmFin0002Event event = (BcmFin0002Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			List<SearchArFincDirConvListVO> searchArFincDirConvListVO = command.searchArFincDirConvList(event.getSlanCd(), event.getRlaneCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();

			eventResponse.setRsVoList(searchArFincDirConvListVO);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Saving the data of AR Finance Direction Conversion.
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse manageArFinDirConv(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0002Event event = (BcmFin0002Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			SearchArFincDirConvListVO[] searchArFincDirConvListVOs = event.getSearchArFincDirConvListVOs();

			begin();
			command.manageArFincDirConv(searchArFincDirConvListVOs, account.getUsr_id());

			eventResponse = (GeneralEventResponse) searchArFincDirConvList(e);

			eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * Inserting the data of AR Master Revenue VVD
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse manageArMasterRevenueVvd(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0003Event event = (BcmFin0003Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			SearchArMasterRevenueVvdListVO[] searchArMasterRevenueVvdListVOs = event.getSearchArMasterRevenueVvdListVOs();

			begin();
			command.manageArMasterRevenueVvd(searchArMasterRevenueVvdListVOs, account.getUsr_id());

			eventResponse = (GeneralEventResponse) searchArMasterRevenueVvdList(e);

			eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * Retrieving the list of AR Master Revenue VVD
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchArMasterRevenueVvdList(Event e) throws EventException {
		BcmFin0003Event event = (BcmFin0003Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			List<SearchArMasterRevenueVvdListVO> searchArMasterRevenueVvdListVO = command.searchArMasterRevenueVvdList(event.getRevYrmon(), event.getVslCd(),
					event.getVvd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();

			eventResponse.setRsVoList(searchArMasterRevenueVvdListVO);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Saving the data of AR Route Rank<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse manageArRouteRank(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0004Event event = (BcmFin0004Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			SearchArRouteRankListVO[] searchArRouteRankListVOs = event.getSearchArRouteRankListVOs();

			begin();
			command.manageArRouteRank(searchArRouteRankListVOs, account.getUsr_id());

			eventResponse = (GeneralEventResponse) searchArRouteRankList(e);

			// eventResponse.setUserMessage((String) new ErrorHandler("FIN00001",new String[]{}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * Retrieving the list of AR Route Rank<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchArRouteRankList(Event e) throws EventException {
		BcmFin0004Event event = (BcmFin0004Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			List<SearchArRouteRankListVO> searchArRouteRankListVO = command.searchArRouteRankList(event.getSlanCd(), event.getRlaneCd(), event.getDeltFlg());

			GeneralEventResponse eventResponse = new GeneralEventResponse();

			eventResponse.setRsVoList(searchArRouteRankListVO);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Save the data of GL ESTIMATE REVENUE VVD<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse manageGlEstimateRevenueVvd(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0005Event event = (BcmFin0005Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			SearchGlEstimateRevenueVvdListVO[] searchGlEstimateRevenueVvdListVOs = event.getSearchGlEstimateRevenueVvdListVOs();

			begin();
			command.manageGlEstimateRevenueVvd(searchGlEstimateRevenueVvdListVOs, account.getUsr_id());

			eventResponse = (GeneralEventResponse) searchGlEstimateRevenueVvdList(e);

			eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * Retrieving the data of GL ESTIMATE REVENUE VVD
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchGlEstimateRevenueVvdList(Event e) throws EventException {
		BcmFin0005Event e5 = (BcmFin0005Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			List<SearchGlEstimateRevenueVvdListVO> listVo = command.searchGlEstimateRevenueVvdList(e5.getExeYrmon(), e5.getRevYrmon(), e5.getVslCd(), e5.getRevDirCd(),
					e5.getEstmVvdTpCd(), e5.getEstmIocDivCd(), e5.getVvd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();

			eventResponse.setRsVoList(listVo);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * Saving the data of GL MONTHLY EXCHNAGE RATE<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse manageGlMonthlyExchangeRate(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0006Event event = (BcmFin0006Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			SearchGlMonthlyExchangeRateListVO[] searchGlMonthlyExchangeRateListVOs = event.getSearchGlMonthlyExchangeRateListVOs();

			begin();
			command.manageGlMonthlyExchangeRate(searchGlMonthlyExchangeRateListVOs, account.getUsr_id());

			eventResponse = (GeneralEventResponse) searchGlMonthlyExchangeRateList(e);

			eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * Retrieving the list of GL MONTHLY EXCHNAGE RATE
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchGlMonthlyExchangeRateList(Event e) throws EventException {
		BcmFin0006Event e6 = (BcmFin0006Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			List<SearchGlMonthlyExchangeRateListVO> listVo = command.searchGlMonthlyExchangeRateList(e6.getAcctXchRtYrmon(), e6.getCurrCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();

			eventResponse.setRsVoList(listVo);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	/**
	 * COM_COM_1001 : CENTER CODE ENTRY<br>
	 * CENTER CODE info Count.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchCenterCode(Event e) throws EventException {
		try {
			FinanceCreationBC command = new FinanceCreationBCImpl();
			ComCom1001Event event = (ComCom1001Event) e;

			List<GlCtrErpVO> list = command.searchCenterCode(event.getGlCtrErpVO());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse;
		} catch (EventException ex) {
			throw ex;
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}

	/**
	 * COM_COM_1001 : CENTER CODE ENTRY<br>
	 * CENTER CODE 정보를 수정 합니다<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse manageCenterCode(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FinanceCreationBC command = new FinanceCreationBCImpl();
		ComCom1001Event event = (ComCom1001Event) e;
		try {
			begin();
			command.manageCenterCode(event.getGlCtrErpVOs(), account);
			commit();
		} catch (EventException ex) {
			rollback();
			throw ex;
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * COM_COM_1002 : Error VVD ENTRY<br>
	 * Error VVD info Count.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchErrorVvd(Event e) throws EventException {
		try {
			FinanceCreationBC command = new FinanceCreationBCImpl();
			ComCom1002Event event = (ComCom1002Event) e;

			List<GlErrVvdVO> list = command.searchErrorVvd(event.getGlErrVvdVO());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse;
		} catch (EventException ex) {
			throw ex;
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}

	/**
	 * COM_COM_1002 : Error VVD ENTRY<br>
	 * Error VVD 정보를 수정 합니다<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse manageErrorVvd(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FinanceCreationBC command = new FinanceCreationBCImpl();
		ComCom1002Event event = (ComCom1002Event) e;
		try {
			begin();
			command.manageErrorVvd(event.getGlErrVvdVOs());
			commit();
		} catch (EventException ex) {
			rollback();
			throw ex;
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse searchEstRvvdCode(Event e) throws EventException {
		try {
			FinanceCreationBC command = new FinanceCreationBCImpl();
			ComCom1003Event event = (ComCom1003Event) e;

			List<GlEstmRevVvdVO> list = command.searchEstRvvdCode(event.getGlEstmRevVvdVO());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse;
		} catch (EventException ex) {
			throw ex;
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}

	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse manageEstRvvdCode(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FinanceCreationBC command = new FinanceCreationBCImpl();
		ComCom1003Event event = (ComCom1003Event) e;
		try {
			begin();
			command.manageEstRvvdCode(event.getGlEstmRevVvdVOs(), account);
			commit();
		} catch (EventException ex) {
			rollback();
			throw ex;
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
		return eventResponse;
	}

	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse searchEstFmcCode(Event e) throws EventException {
		try {
			FinanceCreationBC command = new FinanceCreationBCImpl();
			ComCom1004Event event = (ComCom1004Event) e;

			List<GlFmcEntVO> list = command.searchEstFmcCode(event.getGlFmcEntVO());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse;
		} catch (EventException ex) {
			throw ex;
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}

	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse manageEstFmcCode(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FinanceCreationBC command = new FinanceCreationBCImpl();
		ComCom1004Event event = (ComCom1004Event) e;
		try {
			begin();
			command.manageEstFmcCode(event.getGlFmcEntVOs(), account);
			commit();
		} catch (EventException ex) {
			rollback();
			throw ex;
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
		return eventResponse;
	}
	

	
	/**
	 * Open the data of Next Month AP period(inserting)
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse manageOpenNextMonthApPeriod(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {

			String usrId = account.getUsr_id();

			begin();
			command.manageOpenNextMonthApPeriod(usrId);

			eventResponse = (GeneralEventResponse) searchApPeriodList(e);

			eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
			commit();
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}
	
	/**
	 * Retrieving the list of Max AP period.
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchMaxApPeriodList(Event e) throws EventException {
		FinanceCreationBC command = new FinanceCreationBCImpl();
		try {
			SearchApPeriodListVO searchApPeriodListVO = command.searchMaxApPeriodList();

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setETCData("max_month", searchApPeriodListVO.getEffYrmon());

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Retrieving the list of GL Daily EXCHNAGE RATE
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchGlDailyExchangeRateList(Event e) throws EventException {
		BcmFin0007Event e7 = (BcmFin0007Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			List<GlDlyXchRtVO> listVo = command.searchGlDailyExchangeRateList(e7.getsAcctXchRtFmDt(), e7.getsAcctXchRtToDt(), e7.getsFmCurrCd(), e7.getsToCurrCd());

			GeneralEventResponse eventResponse = new GeneralEventResponse();

			eventResponse.setRsVoList(listVo);

			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Saving the data of GL Daily EXCHNAGE RATE<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse manageGlDailyExchangeRate(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();

		BcmFin0007Event event = (BcmFin0007Event) e;

		FinanceCreationBC command = new FinanceCreationBCImpl();

		try {
			GlDlyXchRtVO[] glDlyXchRtVOs = event.getGlDlyXchRtVOs();
			
			eventResponse = (GeneralEventResponse) command.chkGlDailyExchangeRateList(glDlyXchRtVOs);
			
			if( eventResponse.getETCData("curr_row") == null || "".equals(eventResponse.getETCData("curr_row"))){
				begin();
				command.manageGlDailyExchangeRate(glDlyXchRtVOs, account.getUsr_id());

				eventResponse = (GeneralEventResponse) searchGlDailyExchangeRateList(e);

				eventResponse.setUserMessage((String) new ErrorHandler("FIN00001", new String[] {}).getUserMessage());
				commit();
			}
		} catch (EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}
	
	/**
	 * Search Revenue VVD Month<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchRevenueVvdMonth(Event e) throws EventException {
		BcmFin0011Event e11 = (BcmFin0011Event) e;
		FinanceCreationBC command = new FinanceCreationBCImpl();
		try {
			List<RevenueMonthVvdVO> listVo1 = command.searchRevenueVvdMonth(e11.getTarYrmon(), BcmFin0011Event.getPreMonth());
			List<RevenueMonthVvdVO> listVo2 = command.searchRevenueVvdMonth(e11.getTarYrmon(), BcmFin0011Event.getThisMonth());

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(listVo1);
			eventResponse.setRsVoList(listVo2);
			
			return eventResponse;
		} catch (EventException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}
	
	/**
	 * Manage Revenue VVD Month
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse manageRevenueVvdMonth(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FinanceCreationBC command = new FinanceCreationBCImpl();
		BcmFin0011Event e11 = (BcmFin0011Event) e;
		String[] arrChgMsg = new String[1];
		try {
			
			String SCOPeriod = command.checkSCOPeriodIsOpened(e11.getRevenueMonthVvdVOs()[0].getRevYrmon());
			if (SCOPeriod != null && Integer.parseInt(SCOPeriod) > 0) {
				begin();
				command.manageRevenueVvdMonth(e11.getRevenueMonthVvdVOs(), account);
				commit();
			} else {
				arrChgMsg[0] = e11.getRevenueMonthVvdVOs()[0].getRevYrmon().substring(0, 7);
				throw new EventException(new ErrorHandler("SAC00001", arrChgMsg).getMessage());
			}
		} catch (EventException ex) {
			rollback();
			throw ex;
		} catch (Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
		return eventResponse;
	}
	
	/**
	 * ComCom1003Event management event process<br>
	 * BKGBDRLOG management<br>
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
 	 */
	private EventResponse manageEstmRevVVDInfo(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FinanceCreationBC command = new FinanceCreationBCImpl();
		ComCom1003Event event = (ComCom1003Event)e;
		try {
			//GlEstmRevVvdVO glestmRevVvdVO = new GlEstmRevVvdVO();

			begin();
			
			/*
			glestmRevVvdVO = command.manageEstmRevVVDInfo(event.getGlEstmRevVvdVO(), account.getUsr_id());
			 
			if(glestmRevVvdVO.getPoResult().equals("E"))
			{
				rollback();
				throw new EventException(new ErrorHandler(glestmRevVvdVO.getPoErrMsg()).getMessage());
			} 
			eventResponse.setUserMessage(glestmRevVvdVO.getPoErrMsg());
			*/
			
			//Batch Job Execution
			command.estmRevVvdBatch(event.getGlEstmRevVvdVO(), account.getUsr_id());	
			
			commit();
			
		} catch(EventException ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw ex;
		} catch(Exception ex) {
			rollback();
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("COM12240").getMessage(), ex);
		}
		
		return eventResponse;
	}

	/**
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 */
	private EventResponse searchEstmVvdCreationFlag(Event e) throws EventException {
		try {
			FinanceCreationBC command = new FinanceCreationBCImpl();
			ComCom1003Event event = (ComCom1003Event) e;

			SearchEstmVvdCreationFlagVO flgVO = command.searchEstmVvdCreationFlag(event.getGlEstmRevVvdVO());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setETCData("btnBlckFlg", flgVO.getButtonBlockFlag());
			
			return eventResponse;
		} catch (EventException ex) {
			throw ex;
		} catch (Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CGM20032").getMessage(), ex);
		}
	}

	/**
	 * BCM_FIN_0004 : Common code Handling the inquiry event<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @throws EventException
	 * @exception EventException
	 */
	private EventResponse searchComboCdList0004(Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
//		CommonBC commonBC = new CommonBCImpl();
//		try {
//			if (e.getFormCommand().isCommand(FormCommand.INIT)) {
//				String array[][] = {
//					{"svcLane", "", " "},	// Trade
//					{"revLane", "", " "}
////					{"rLane", "", "All"},
////					{"CD00593", "000020: :All", "All"},
////					{"CD00206", "000020: :All", "All"}
//				};
//				eventResponse = commonBC.getMakeCodeSelectList(eventResponse, array);
//			}
//		} catch(EventException ex) {
//			log.error("err " + ex.toString(), ex);
//			throw new EventException(new ErrorHandler(ex).getMessage());
//		} catch(Exception ex) {
//			log.error("err " + ex.toString(), ex);
//			throw new EventException(new ErrorHandler(ex).getMessage());
//		}	
		return eventResponse;
	}
}
