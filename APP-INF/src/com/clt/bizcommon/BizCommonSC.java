/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : BizCommonSC.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clt.bizcommon.account.basic.AccountBC;
import com.clt.bizcommon.account.basic.AccountBCImpl;
import com.clt.bizcommon.account.event.ComEnsN11Event;
import com.clt.bizcommon.activity.basic.ActivityBC;
import com.clt.bizcommon.activity.basic.ActivityBCImpl;
import com.clt.bizcommon.activity.event.ComCom0009Event;
import com.clt.bizcommon.activity.vo.SearchMdmActivityVO;
import com.clt.bizcommon.approval.basic.ApprovalBC;
import com.clt.bizcommon.approval.basic.ApprovalBCImpl;
import com.clt.bizcommon.approval.event.ComEns0T1Event;
import com.clt.bizcommon.approval.event.ComEns0U1Event;
import com.clt.bizcommon.approval.event.ComEns0U2Event;
import com.clt.bizcommon.approval.event.ComEns0W1Event;
import com.clt.bizcommon.approval.event.ComEns0Y1Event;
import com.clt.bizcommon.approval.vo.ApprovalCsrVO;
import com.clt.bizcommon.approval.vo.ApprovalDeptVO;
import com.clt.bizcommon.approval.vo.ApprovalRouteVO;
import com.clt.bizcommon.approval.vo.ApprovalStaffVO;
import com.clt.bizcommon.approval.vo.ApprovalStepVO;
import com.clt.bizcommon.approval.vo.SearchApprovalVO;
import com.clt.bizcommon.approval.vo.UnApprovalCsrVO;
import com.clt.bizcommon.calendar.basic.CalendarBC;
import com.clt.bizcommon.calendar.basic.CalendarBCImpl;
import com.clt.bizcommon.carrier.basic.CarrierBC;
import com.clt.bizcommon.carrier.basic.CarrierBCImpl;
import com.clt.bizcommon.carrier.event.ComEns0N1Event;
import com.clt.bizcommon.carrier.vo.CarrierListVO;
import com.clt.bizcommon.charge.basic.ChargeBC;
import com.clt.bizcommon.charge.basic.ChargeBCImpl;
import com.clt.bizcommon.charge.event.ComCom0001Event;
import com.clt.bizcommon.charge.vo.ChargeListVO;
import com.clt.bizcommon.charge.vo.RepChargeVO;
import com.clt.bizcommon.cntrsize.basic.CntrSizeBC;
import com.clt.bizcommon.cntrsize.basic.CntrSizeBCImpl;
import com.clt.bizcommon.cntrsize.event.ComCom0003Event;
import com.clt.bizcommon.cntrsize.vo.MdmCntrSzListVO;
import com.clt.bizcommon.cntrtpsz.basic.CntrTpSzBC;
import com.clt.bizcommon.cntrtpsz.basic.CntrTpSzBCImpl;
import com.clt.bizcommon.cntrtype.basic.CntrTypeBC;
import com.clt.bizcommon.cntrtype.basic.CntrTypeBCImpl;
import com.clt.bizcommon.cntrtype.event.ComCom0002Event;
import com.clt.bizcommon.cntrtype.vo.MdmCntrTpListVO;
import com.clt.bizcommon.commodity.basic.CommodityBC;
import com.clt.bizcommon.commodity.basic.CommodityBCImpl;
import com.clt.bizcommon.commodity.event.ComEns011Event;
import com.clt.bizcommon.commodity.event.ComEns012Event;
import com.clt.bizcommon.commodity.vo.SearchCmdtCdRepCmdtCdVO;
import com.clt.bizcommon.continent.basic.ContinentBC;
import com.clt.bizcommon.continent.basic.ContinentBCImpl;
import com.clt.bizcommon.continent.event.ComEns0H1Event;
import com.clt.bizcommon.continent.vo.SearchContinentListVO;
import com.clt.bizcommon.contractno.basic.ContractNoBC;
import com.clt.bizcommon.contractno.basic.ContractNoBCImpl;
import com.clt.bizcommon.contractno.event.ComEns021Event;
import com.clt.bizcommon.country.basic.CountryBC;
import com.clt.bizcommon.country.basic.CountryBCImpl;
import com.clt.bizcommon.country.event.ComEns0M1Event;
import com.clt.bizcommon.country.vo.CountryListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic.ConsultationSlipRequestMgtBC;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.basic.ConsultationSlipRequestMgtBCImpl;
import com.clt.bizcommon.currency.basic.CurrencyBC;
import com.clt.bizcommon.currency.basic.CurrencyBCImpl;
import com.clt.bizcommon.currency.event.ComEnsN13Event;
import com.clt.bizcommon.custgroup.basic.CustGroupBC;
import com.clt.bizcommon.custgroup.basic.CustGroupBCImpl;
import com.clt.bizcommon.custgroup.event.ComCom0006Event;
import com.clt.bizcommon.customer.basic.CustomerBC;
import com.clt.bizcommon.customer.basic.CustomerBCImpl;
import com.clt.bizcommon.customer.event.ComEns041Event;
import com.clt.bizcommon.daylightsavingtime.basic.DaylightSavingTimeBC;
import com.clt.bizcommon.daylightsavingtime.basic.DaylightSavingTimeBCImpl;
import com.clt.bizcommon.daylightsavingtime.event.ComCom0005Event;
import com.clt.bizcommon.daylightsavingtime.vo.DaylightSavingTimeListVO;
import com.clt.bizcommon.eqorgchart.basic.EQOrgChartBC;
import com.clt.bizcommon.eqorgchart.basic.EQOrgChartBCImpl;
import com.clt.bizcommon.eqorgchart.event.ComEns0O1Event;
import com.clt.bizcommon.eqorgchart.vo.EQQrgChartListVO;
import com.clt.bizcommon.exrate.monthly.basic.MonthlyRateBC;
import com.clt.bizcommon.exrate.monthly.basic.MonthlyRateBCImpl;
import com.clt.bizcommon.exrate.vvd.basic.VVDRateBC;
import com.clt.bizcommon.exrate.vvd.basic.VVDRateBCImpl;
import com.clt.bizcommon.exrate.vvd.event.ComEns0F1Event;
import com.clt.bizcommon.exrate.vvd.vo.VVDListVO;
import com.clt.bizcommon.lane.basic.LaneBC;
import com.clt.bizcommon.lane.basic.LaneBCImpl;
import com.clt.bizcommon.lane.event.ComEns081Event;
import com.clt.bizcommon.lane.vo.SearchLaneListVO;
import com.clt.bizcommon.leasingcompanyyard.basic.LeasingCompanyYardBC;
import com.clt.bizcommon.leasingcompanyyard.basic.LeasingCompanyYardBCImpl;
import com.clt.bizcommon.leasingcompanyyard.event.ComCom0004Event;
import com.clt.bizcommon.leasingcompanyyard.vo.SearchLeasingCompanyYardListVO;
import com.clt.bizcommon.location.basic.LocationBC;
import com.clt.bizcommon.location.basic.LocationBCImpl;
import com.clt.bizcommon.location.event.ComEns051Event;
import com.clt.bizcommon.location.vo.SearchLocationDetailVO;
import com.clt.bizcommon.logicsserviceprovider.basic.LogicsServiceProviderBC;
import com.clt.bizcommon.logicsserviceprovider.basic.LogicsServiceProviderBCImpl;
import com.clt.bizcommon.logicsserviceprovider.event.UiCtm0435Event;
import com.clt.bizcommon.logicsserviceprovider.vo.RMdmVenderVO;
import com.clt.bizcommon.movement.basic.MovementBC;
import com.clt.bizcommon.movement.basic.MovementBCImpl;
import com.clt.bizcommon.movement.event.ComCom0010Event;
import com.clt.bizcommon.node.basic.NodeBC;
import com.clt.bizcommon.node.basic.NodeBCImpl;
import com.clt.bizcommon.node.event.ComEns061Event;
import com.clt.bizcommon.node.vo.SearchNodeYardListVO;
import com.clt.bizcommon.node.vo.SearchNodeZoneListVO;
import com.clt.bizcommon.office.basic.OfficeBC;
import com.clt.bizcommon.office.basic.OfficeBCImpl;
import com.clt.bizcommon.office.event.ComEns071Event;
import com.clt.bizcommon.packagetype.basic.PackageTypeBC;
import com.clt.bizcommon.packagetype.basic.PackageTypeBCImpl;
import com.clt.bizcommon.packagetype.event.UiBkg0696Event;
import com.clt.bizcommon.packagetype.vo.PackageTypeVO;
import com.clt.bizcommon.pertype.basic.PerTypeBC;
import com.clt.bizcommon.pertype.basic.PerTypeBCImpl;
import com.clt.bizcommon.pertype.event.UiPri4002Event;
import com.clt.bizcommon.region.basic.RegionBC;
import com.clt.bizcommon.region.basic.RegionBCImpl;
import com.clt.bizcommon.region.event.ComEns0J1Event;
import com.clt.bizcommon.region.vo.SearchRegionListVO;
import com.clt.bizcommon.repcommodity.basic.RepCommodityBC;
import com.clt.bizcommon.repcommodity.basic.RepCommodityBCImpl;
import com.clt.bizcommon.repcommodity.event.ComEns0K1Event;
import com.clt.bizcommon.repcommodity.vo.SearchRepCommodityListVO;
import com.clt.bizcommon.revenuelane.basic.RevenueLaneBC;
import com.clt.bizcommon.revenuelane.basic.RevenueLaneBCImpl;
import com.clt.bizcommon.revenuelane.event.ComCom0011Event;
import com.clt.bizcommon.revenuelane.vo.SearchRevenueLaneListVO;
import com.clt.bizcommon.revenuevvd.basic.RevenuevvdBC;
import com.clt.bizcommon.revenuevvd.basic.RevenuevvdBCImpl;
import com.clt.bizcommon.revenuevvd.event.UiComEnsN12Event;
import com.clt.bizcommon.salesrep.basic.SalesRepBC;
import com.clt.bizcommon.salesrep.basic.SalesRepBCImpl;
import com.clt.bizcommon.salesrep.event.ComCom0008Event;
import com.clt.bizcommon.salesrep.vo.SalesRepListVO;
import com.clt.bizcommon.scontinent.basic.SubContinentBC;
import com.clt.bizcommon.scontinent.basic.SubContinentBCImpl;
import com.clt.bizcommon.scontinent.event.ComEns0I1Event;
import com.clt.bizcommon.scontinent.vo.SearchSubContinentListVO;
import com.clt.bizcommon.serviceprovider.basic.ServiceProviderBC;
import com.clt.bizcommon.serviceprovider.basic.ServiceProviderBCImpl;
import com.clt.bizcommon.serviceprovider.event.ComEns0C1Event;
import com.clt.bizcommon.serviceprovider.vo.SpListVO;
import com.clt.bizcommon.servicescope.basic.ServiceScopeBC;
import com.clt.bizcommon.servicescope.basic.ServiceScopeBCImpl;
import com.clt.bizcommon.servicescope.event.ComEns0L1Event;
import com.clt.bizcommon.servicescope.vo.SearchServiceScopeListVO;
import com.clt.bizcommon.staff.basic.StaffBC;
import com.clt.bizcommon.staff.basic.StaffBCImpl;
import com.clt.bizcommon.staff.event.ComEns091Event;
import com.clt.bizcommon.state.basic.StateBC;
import com.clt.bizcommon.state.basic.StateBCImpl;
import com.clt.bizcommon.subtrade.basic.SubtradeBC;
import com.clt.bizcommon.subtrade.basic.SubtradeBCImpl;
import com.clt.bizcommon.subtrade.event.ComCom0013Event;
import com.clt.bizcommon.subtrade.vo.SearchSubtradeListVO;
import com.clt.bizcommon.tax.basic.TaxBC;
import com.clt.bizcommon.tax.basic.TaxBCImpl;
import com.clt.bizcommon.tax.event.ComEnsT01Event;
import com.clt.bizcommon.tax.vo.ComTaxVO;
import com.clt.bizcommon.trade.basic.TradeBC;
import com.clt.bizcommon.trade.basic.TradeBCImpl;
import com.clt.bizcommon.trade.event.ComCom0012Event;
import com.clt.bizcommon.trade.vo.SearchTradeListVO;
import com.clt.bizcommon.vendorcode.basic.VendorCodeBC;
import com.clt.bizcommon.vendorcode.basic.VendorCodeBCImpl;
import com.clt.bizcommon.vendorcode.event.ComCom0007Event;
import com.clt.bizcommon.vendorcode.vo.SearchVendorCodeVO;
import com.clt.bizcommon.vessel.basic.VesselBC;
import com.clt.bizcommon.vessel.basic.VesselBCImpl;
import com.clt.bizcommon.vessel.event.ComEns0A1Event;
import com.clt.bizcommon.vessel_skd.basic.VesselSKDBC;
import com.clt.bizcommon.vessel_skd.basic.VesselSKDBCImpl;
import com.clt.bizcommon.vvd.basic.VvdBC;
import com.clt.bizcommon.vvd.basic.VvdBCImpl;
import com.clt.bizcommon.vvd.event.ComEns0B2Event;
import com.clt.bizcommon.vvdchart.basic.VVDChartBC;
import com.clt.bizcommon.vvdchart.basic.VVDChartBCImpl;
import com.clt.bizcommon.vvdchart.event.ComEns0P1Event;
import com.clt.bizcommon.vvdchart.vo.VVDChartListVO;
import com.clt.framework.component.backend.support.BackEndJobException;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ArMstRevVvdVO;
import com.clt.syscommon.common.table.MdmAccountVO;
import com.clt.syscommon.common.table.MdmCurrencyVO;
import com.clt.syscommon.common.table.MdmMvmtStsVO;
import com.clt.syscommon.common.table.PriRatUtVO;


/**
 * ENIS-BIZCOMMON Business Logic ServiceCommand<br>
 * - ENIS-BIZCOMMON에 1대한 비지니스 트랜잭션을 처리한다.<br>
 * 
 * @author sangyool pak
 * @see COM_ENS_0A1EventResponse,VesselDBDAO 참조
 * @since J2EE 1.4
 */
public class BizCommonSC extends ServiceCommandSupport {
	// Login User Information
    private SignOnUserAccount account = null;

    /**
     * BIZCOMMON 업무 시나리오 선행작업<br>
     * Vessel업무 시나리오 호출시 관련 내부객체 생성<br>
     */
    public void doStart() {
        try {
            // 일단 comment --> 로그인 체크 부분
            account=getSignOnUserAccount();            
        } catch (Exception e) {
            log.error("BizCommonSC 선행 작업 시 오류 " + e.toString(), e);
        }
    }

    /**
     * BIZCOMMON 업무 시나리오 마감작업<br>
     * Vessel업무 시나리오 종료시 관련 내부객체 해제<br>
     */
    public void doEnd() {
        // command.doEnd();
        log.debug("BizCommonSC 종료");
    }

    /**
     * 각 이벤트에 해당하는 업무 시나리오 수행<br>
     * ENIS-BIZCOMMON 업무에서 발생하는 모든 이벤트의 분기처리<br>
     * 
     * @param e Event
     * @return response EventResponse
     * @exception EventException
     */
    public EventResponse perform(Event e) throws EventException {
        // RDTO(Data Transfer Object including Parameters)
        EventResponse eventResponse = null;
        
        /*
         * BizCommonSC에 사용법
         * 1. 각각의 업무에 를 통합하는 SC로써 각 업무에 대한 로직은 아래와 같이 작성한다.
         * 2. BC에 대한 각 업무단 BC를 참조하여야 한다. 
         * */
        
        // 1. Commodity(ComEns011Event)
        if (e.getEventName().equalsIgnoreCase("ComEns011Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
            	eventResponse = searchCommodityList(e);
            }
        }
        // 1. Commodity(ComEns012Event)
        if (e.getEventName().equalsIgnoreCase("ComEns012Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
            	eventResponse = searchCmdtCdRepCmdtCd(e);
            }
        }
        
        // 2. Contract(ComEns021Event)
        if (e.getEventName().equalsIgnoreCase("ComEns021Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchContractNoList(e);
            }else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
                eventResponse = searchContractNoExcelList(e);
            }
        }   
        
        // 3. Customer(ComEns041Event)
        if (e.getEventName().equalsIgnoreCase("ComEns041Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchCustomerList(e);
            } 
        }
        
        // 4. CustGroup(ComCom0006Event)
        if (e.getEventName().equalsIgnoreCase("ComCom0006Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchCustGroupList(e);
            } 
        }
        
        // 5. Location(COM_ENS_051)
        if (e.getEventName().equalsIgnoreCase("ComEns051Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchLocationList(e);
            }else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
            	eventResponse = searchLocationDetail(e);
            }else if(e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
            	eventResponse = searchRccLccCd(e);
            }
        }
        
        // 6. Node(COM_ENS_061)
        if (e.getEventName().equalsIgnoreCase("COM_ENS_061Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchNodeList(e);
            } 
        }
        
        // 7. Office(COM_ENS_071)
        if (e.getEventName().equalsIgnoreCase("ComEns071Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchOfficeList(e);
            }
        }
        
        // 8. Lane(COM_ENS_081)
        if (e.getEventName().equalsIgnoreCase("ComEns081Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchLaneList(e);
            } 
        }
        
        // 9.Vessel(COM_ENS_0A1)
        if (e.getEventName().equalsIgnoreCase("ComEns0A1Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchVesselList(e);
            }
            eventResponse = searchVesselList(e);
        }
        
        // 10. Vessel SKD 01(COM_ENS_0B1)
        if (e.getEventName().equalsIgnoreCase("ComEns0B1Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchVesselSKDList(e);
            } 
        }        
        
        // 12. Vessel SKD 02(COM_ENS_0B2)
        if (e.getEventName().equalsIgnoreCase("ComEns0B2Event")) {
            if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
                eventResponse = searchVvdList(e);
            } 
        } 

        // 12. Service Provider(COM_ENS_0C1)
        if (e.getEventName().equalsIgnoreCase("ComEns0C1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
              eventResponse = searchServiceProviderList(e);
        	} 
        }
        
        // 13. EQ Organization Chart(COM_ENS_0O1)
        if (e.getEventName().equalsIgnoreCase("ComEns0O1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchEQOrgChartList(e);
        	} 
        }
        
        // 14. Service Scope(COM_ENS_0L1)
        if (e.getEventName().equalsIgnoreCase("ComEns0L1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchServiceScopeList(e);
        	} 
        }
        
        // 15. Country(COM_ENS_0M1)
        if (e.getEventName().equalsIgnoreCase("ComEns0M1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchCountryList(e);
        	} 
        }
        
        // 16. Continent(COM_ENS_0H1)
        if (e.getEventName().equalsIgnoreCase("ComEns0H1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchContinentList(e);
        	} 
        }
        
        // 17. Sub Continent(COM_ENS_0I1)
        if (e.getEventName().equalsIgnoreCase("ComEns0I1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchSubContinentList(e);
        	} 
        }
        
        // 18. Region(COM_ENS_0J1)
        if (e.getEventName().equalsIgnoreCase("ComEns0J1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchRegionList(e);
        	} 
        }
        
        // 19. Rep Commodity(COM_ENS_0K1)
        if (e.getEventName().equalsIgnoreCase("ComEns0K1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchRepCommodityList(e);
        	} 
        }
        
        // 20. Carrier(COM_ENS_0N1)
        if (e.getEventName().equalsIgnoreCase("ComEns0N1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchCarrierList(e);
        	}
        }
        
        // 21. Container Type Size(COM_ENS_0G1)
        if (e.getEventName().equalsIgnoreCase("ComEns0G1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchCntrTpSzList(e);
        	} 
        }
        
        // 22. VVD Chart(COM_ENS_0P1)
        if (e.getEventName().equalsIgnoreCase("ComEns0P1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchVVDChartList(e);
        	} 
        }
        
        // 22. Monthly Exchange Rate(COM_ENS_0E1)
        if (e.getEventName().equalsIgnoreCase("COM_ENS_0E1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchMonthlyRateList(e);
        	} 
        }
        
        // 23. Vvd Exchange Rate(COM_ENS_0F1)
        if (e.getEventName().equalsIgnoreCase("ComEns0F1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchVvdRateList(e);
        	} 
        }
        
        // 24. Staff 조회(COM_ENS_091)
        if (e.getEventName().equalsIgnoreCase("ComEns091Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchStaffList(e);
        	}
            if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
                eventResponse = searchDeptList(e);
            }
        }
        
        // 25. 국가별 Local Calendar 조회(COM_ENS_0S1)
        if (e.getEventName().equalsIgnoreCase("ComEns0S1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
        		eventResponse = searchCntHolidayList(e);
        	} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) { // SAVE 버튼 클릭시
				eventResponse = modifyCntHoliday(e);
        	}
        }
        
        // 26. State별 Local Calendar 조회(COM_ENS_0S2)
        if (e.getEventName().equalsIgnoreCase("COM_ENS_0S2Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
        		eventResponse = searchSteHolidayList(e);
        	} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) { // SAVE 버튼 클릭시
				eventResponse = modifySteHoliday(e);
        	}
        }
        
        // 27. Location별 Local Calendar 조회(COM_ENS_0S3)
        if (e.getEventName().equalsIgnoreCase("COM_ENS_0S3Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
        		eventResponse = searchLocHolidayList(e);
        	} else if(e.getFormCommand().isCommand(FormCommand.MULTI)) { // SAVE 버튼 클릭시
				eventResponse = modifyLocHoliday(e);
        	}
        }
        
        // 28. Country별(by Month) Calendar 조회(COM_ENS_0S3)
        if (e.getEventName().equalsIgnoreCase("COM_ENS_0S4Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
        		eventResponse = searchMonthlyHolidayList(e);
        	}
        }
        
        // 29. State 조회(COM_ENS_0V1)
        if (e.getEventName().equalsIgnoreCase("COM_ENS_0X1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchStateList(e);
        	}
        }
        
        // 30. Approval Route Manager 팝업(COM_ENS_0T1) - approval
        if (e.getEventName().equalsIgnoreCase("ComEns0T1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchApprovalStaffList(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
                eventResponse = searchApprovalDeptList(e);
            } else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
                eventResponse = searchApprovalRouteList(e);
            } else if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
            	// Save as Default 버튼 클릭시 - Approval Route Manager 팝업의  기본결재라인 수정
				eventResponse = saveApprovalRoute(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
        		// OK 버튼 클릭시 - Approval Route Manager 팝업의  결재요청 라우트 수정
				eventResponse = saveApprovalRouteReq(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.SEARCH03)) {
				eventResponse = searchApproval(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.SEARCH04)) {
        		eventResponse = validateOffice(e);
//        	} else if (e.getFormCommand().isCommand(FormCommand.SEARCH05)) {
//        		eventResponse = searchUnapprovedCsr(e);
        	}
        }
        
        // 31. Approval 조회(COM_ENS_0U1) - approval
        if (e.getEventName().equalsIgnoreCase("ComEns0U1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
        		eventResponse = searchApprovalCsrList(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.MULTI01)) {
        		eventResponse = confirmApproval(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.MULTI02)) {
        		eventResponse = rejectApproval(e);
        	}
			/* BackEndJob 상태조회 */
			else if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST02)) {
				eventResponse = searchAccrualBackEndJobStatus(e);
			}
        	/* BackEndJob 상태조회 후 ERROR MSG UPDATE */
			else if (e.getFormCommand().isCommand(FormCommand.COMMAND01)) {
				eventResponse = manageApprovalError(e);
			}
        	
        }
        
        // 32. UnApproved 조회(COM_ENS_0Y1) - approval
        if (e.getEventName().equalsIgnoreCase("ComEns0Y1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCHLIST)) {
        		eventResponse = searchUnApprovalCsrList(e);
        	}else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				eventResponse = searchARRHQOfficeList(e);
			}else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
				eventResponse = searchSelOfficeList(e);
			}
        	
        }
        
        // 33. Approval Step 조회(COM_ENS_0W1) - approval
        if (e.getEventName().equalsIgnoreCase("ComEns0W1Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchApprovalStepList(e);
        	}
        }

        // 34. Per Type 조회(UI_PRI_4002)
		if(e.getEventName().equalsIgnoreCase("UiPri4002Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchPertypeList(e);
			}
		}

        // 35. Account Code 조회(COM_ENS_N11) Suk Jun Kim 2009.04.22
        if (e.getEventName().equalsIgnoreCase("ComEnsN11Event")) {
        	log.debug("ComEnsN11Event");
        	log.debug("e.getFormCommand() : "+Integer.toString(e.getFormCommand().getCommand()));
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		log.debug("Command.SEARCH");
        		eventResponse = searchAccountList(e);
        	}
        }

        // 36. Currency Code 조회(COM_ENS_N13) Eui-su Park 2009.04.22
        if (e.getEventName().equalsIgnoreCase("ComEnsN13Event")) {
        	log.debug("ComEnsN13Event");
        	log.debug("e.getFormCommand() : "+Integer.toString(e.getFormCommand().getCommand()));
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		log.debug("Command.SEARCH");
        		eventResponse = searchCurrencyList(e);
        	}
        }

        // 37. PackageType 조회(COM_BKG_0696) Ji Seok Woo 2009.04.24
        if (e.getEventName().equalsIgnoreCase("UiBkg0696Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		log.debug("Command.SEARCH");
        		eventResponse = searchPackageTypeList(e);
        	}
        }

        // 38. LogicsServiceProvider 조회(UI_CTM_0435) Ji Seok Woo 2009.04.24
		if (e.getEventName().equalsIgnoreCase("UiCtm0435Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchLogicsServiceProvider(e);
			}
		}
		
		//Revenue VVD 
		if (e.getEventName().equalsIgnoreCase("UiComEnsN12Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchRevenueVVDList(e);
			}
		}
		
		// Movement Status Code 조회(COM_COM_0010) KIM JONG OCK 2012.02.20 
        if (e.getEventName().equalsIgnoreCase("ComCom0010Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchMovementStatusList(e);
        		//searchAccountList(e);Movement Status
        	}
        }
        
     // Activity Code 조회(COM_COM_0009) Sangbo La 2012.02.20 
        if (e.getEventName().equalsIgnoreCase("ComCom0009Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchActivityList(e);
        		//searchAccountList(e);Movement Status
        	}
        }
        
        // Trade 조회(COM_COM_0012) jayoung Shin 2012.02.21 
        if (e.getEventName().equalsIgnoreCase("ComCom0012Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchTradeList(e);
        	}
        }
        
        // Trade 조회(COM_COM_0013) jayoung Shin 2012.02.22 
        if (e.getEventName().equalsIgnoreCase("ComCom0013Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchSubtradeList(e);
        	}
        }
        
        // Charge (COM_COM_0001) Junbum Lee 2012.02.22
        if (e.getEventName().equalsIgnoreCase("ComCom0001Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
				return searchRepChgCd(e);
        	}else if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchChargeList(e);
        	}
        }
        
        // DST Code Pop-up (COM_COM_0005) Junbum Lee 2012.02.22
        if (e.getEventName().equalsIgnoreCase("ComCom0005Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchDaylightSavingTimeList(e);
        	}
        }
        
        // ComCom0002Event
        if (e.getEventName().equalsIgnoreCase("ComCom0002Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchMdmCntrTpList(e);
        	}
        }		
			
        // ComCom0003Event
        if (e.getEventName().equalsIgnoreCase("ComCom0003Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchMdmCntrSzList(e);
        	}
        }        
        
		//Leasing Company yard 조회(COM_COM_0004) KIM MIN SOO 2012.02.21 
		if (e.getEventName().equalsIgnoreCase("ComCom0004Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchLeasingCompanyYardList(e);
			}
		}
		
		 // Revenue Lane Code 조회(ComCom0011Event)
       if (e.getEventName().equalsIgnoreCase("ComCom0011Event")) {
           if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
               eventResponse = searchRevenueLaneList(e);
           } 
       }
       
        // Sales Rep.(COM_COM_0008)
        if (e.getEventName().equalsIgnoreCase("ComCom0008Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchSalesRepList(e);
        	} 
        }
        
		//Vendor Code Pop-up
		if (e.getEventName().equalsIgnoreCase("ComCom0007Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchVendorCode(e);
			}
		}		
        
		//Tax Pop-up : 2017.05.31
		if (e.getEventName().equalsIgnoreCase("ComEnsT01Event")) {
			if (e.getFormCommand().isCommand(FormCommand.SEARCH)) { 
				eventResponse = searchIndiaCountryFlagInfoForOffice(e);//Login Office에 대한 India Country Flag 조회.
			}
			else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) { 
				eventResponse = searchIndiaTaxInfo(e);//Vendor Code의 India Tax 정보 조회.
			}
			else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) { 
				eventResponse = searchIndiaTaxFlagInfo(e);//Login Office && Vendor Code의 India Tax flag 조회.
			}
		}
		
        // Approval 조회(COM_ENS_0U2) - approval
        if (e.getEventName().equalsIgnoreCase("ComEns0U2Event")) {
        	if (e.getFormCommand().isCommand(FormCommand.SEARCH)) {
        		eventResponse = searchApprovalList(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.SEARCH01)) {
        		eventResponse = searchRHQOfficeList(e);
        	} else if (e.getFormCommand().isCommand(FormCommand.SEARCH02)) {
        		eventResponse = searchSelOfficeList(e);
        	}
        }
        
        return eventResponse;
    }
    
//approval-[--------------------------------------------------------------------------------------------------------------
    /**
     * 승인자 리스트 조회 이벤트 처리<br>
     * Approval Staff 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchApprovalStaffList(Event e) throws EventException { 
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0T1Event event = (ComEns0T1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
    	try{
    		List<ApprovalStaffVO> approvalStaffVOs = command.searchStaffList(event.getApprovalStaffVO());
    		eventResponse.setRsVoList(approvalStaffVOs);
		}catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Staff List"}).getMessage(), ex);
		}
        
		return eventResponse;
    }
    
    /**
     * 부서 리스트 조회 이벤트 처리<br>
     * Approval Dept 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchApprovalDeptList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0T1Event event = (ComEns0T1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
        try {
        	List<ApprovalDeptVO>  approvalDeptVOs = command.searchDeptList(event.getApprovalStaffVO(), account);
        	eventResponse.setRsVoList(approvalDeptVOs);
        }catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Department List"}).getMessage(), ex);
		}
        
        return eventResponse; 
    }
    
    /**
     * 결제라인 리스트 조회 이벤트 처리<br>
     * Approval Route 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchApprovalRouteList(Event e) throws EventException { 
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0T1Event event = (ComEns0T1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
    	try {
        	List<ApprovalRouteVO>  approvalRouteVOs = command.searchApprovalRouteList(event.getApprovalStaffVO());
        	eventResponse.setRsVoList(approvalRouteVOs);
        }catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Route List"}).getMessage(), ex);
		}

        return eventResponse;
    }
    
    /**
     * 부분 미결 CSR 조회
     * @param e
     * @return EventResponse
     * @throws EventException
     */
//	private EventResponse searchUnapprovedCsr(Event e) throws EventException { 
//		GeneralEventResponse eventResponse = new GeneralEventResponse();
//    	ComEns0T1Event event = (ComEns0T1Event)e;
//    	ApprovalBC command = new ApprovalBCImpl();
//    	String retval = null;
//    	
//    	try {
////			retval = command.searchUnapprovedCsrList(event.getApprovalStaffVO());
//			log.error("\n\n searchUnapprovedCsr : " + retval + "\n\n");
//			eventResponse.setETCData("unapro_csr",retval);
////		}catch(EventException ex){
////			rollback();
////			throw ex;
//        } catch (Exception ex) {
//            log.error("err " + ex.toString(), ex);
//            rollback();
//            throw new EventException(new ErrorHandler("COM12192", new String[]{"Approval Route"}).getMessage(), ex);
//		}
//        
//		return eventResponse;
//	}

    /**
	 * 저장 이벤트 처리<br>
	 * Approval Route 화면에 대한 저장 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	*/
	private EventResponse saveApprovalRoute(Event e) throws EventException { 
		GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0T1Event event = (ComEns0T1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
    	try{
			begin();
			command.saveApprovalRoute(event.getApprovalStaffVO(), event.getApprovalRouteVOS(), account);
			commit();
			
 			List<SearchApprovalVO>  searchApprovalVOs = command.searchApproval(event.getApprovalStaffVO());
        	eventResponse.setRsVoList(searchApprovalVOs);
			eventResponse.setUserMessage(new ErrorHandler("COM12191", new String[]{"Data"}).getUserMessage());
		}catch(EventException ex){
			rollback();
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            rollback();
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Approval Route"}).getMessage(), ex);
		}
        
		return eventResponse;
	}
	
	/**
	 * 저장 이벤트 처리<br>
	 * Approval Route 화면에 대한 저장 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	*/
	private EventResponse saveApprovalRouteReq(Event e) throws EventException { 
		GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0T1Event event = (ComEns0T1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
    	try{
			begin();
			command.saveApprovalRouteReq(event.getApprovalCsrVO(), account);
			eventResponse.setUserMessage(new ErrorHandler("COM12191", new String[]{"Data"}).getUserMessage());
			commit();			
		}catch(EventException ex){
			rollback();
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            rollback();
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Approval Route"}).getMessage(), ex);
		}
        
		return eventResponse;
	}
	
	/**
     * 조회 이벤트 처리<br>
     * 부서모듈 사용자별 기본결재라인(COM_APRO_ROUT_DFLT_DTL) 목록을 조회합니다.<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
	private EventResponse searchApproval(Event e) throws EventException { 
		GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0T1Event event = (ComEns0T1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
		try {
			List<SearchApprovalVO>  searchApprovalVOs = command.searchApproval(event.getApprovalStaffVO());
        	eventResponse.setRsVoList(searchApprovalVOs);			
		} catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Search Approval List"}).getMessage(), ex);
		}
		
		return eventResponse; 
	}
    
    /**
     * 조회 이벤트 처리<br>
     * Approval CSR 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchApprovalCsrList(Event e) throws EventException {
    	EventResponse eventResponse = null;
    	ComEns0U1Event event = (ComEns0U1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
        try {
        	eventResponse = command.searchApprovalCsrList(event.getApprovalStaffVO(), account);
        } catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Csr List"}).getMessage(), ex);
		}
        
        return eventResponse;
    }
    
    /**
	 * 저장 이벤트 처리 <br>
	 * Approval Confirm 저장 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	*/
	private EventResponse confirmApproval(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = new GeneralEventResponse();
		ComEns0U1Event event = (ComEns0U1Event)e;
		ApprovalBC command = new ApprovalBCImpl();
		ApprovalCsrVO[] approvalCsrVOs = null;
		
		try{
			
			approvalCsrVOs = event.getApprovalCsrVOS();
			
			begin();
			String backEndJobKey = command.manageCSRApprovalBackEndJob(approvalCsrVOs, account);
			commit();
			
			log.debug("confirmApproval's backEndJobKey::::" +  backEndJobKey);
			eventResponse.setETCData("BackEndJobKey", backEndJobKey);
		
		}catch(EventException ex){
			rollback();
			throw new EventException(new ErrorHandler("COM12192", new String[]{"Confirm Approval"}).getMessage(), ex);
	    } catch (Exception ex) {
	        rollback();
	        throw new EventException(new ErrorHandler("COM12192", new String[]{"Confirm Approval"}).getMessage(), ex);
		}
		return eventResponse;
	}
    
	
    /**
	 * Approve 실행 후 에러 발생 시 에러 메세지 및 status 처리 <br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	*/
	private EventResponse manageApprovalError(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = new GeneralEventResponse();
//		ComEns0U1Event event = (ComEns0U1Event)e;
//		
//		ApprovalBC command = new ApprovalBCImpl();
//		ConsultationSlipRequestMgtBC csrCommand = new ConsultationSlipRequestMgtBCImpl();
//		AccountPayableInvoiceBC sapCommand = new AccountPayableInvoiceBCImpl();
//			
//		ApprovalCsrVO approvalCsrVO = null;
//		
//		try{
//			
//			approvalCsrVO = event.getApprovalCsrVO();
//			if (!approvalCsrVO.getCsrNo().equals(sapCommand.searchCSRNoDupChk(approvalCsrVO.getCsrNo()))) {
//				begin();
//				csrCommand.manageSoInvoiceInterfaceResult(approvalCsrVO.getCsrNo(), approvalCsrVO.getAproRmk()); 
//				command.modifyConfirmRqstRout(approvalCsrVO, account.getUsr_id(),account.getUsr_locl_nm());
//				command.modifyConfirmRqstHdrC(approvalCsrVO);
//				commit();
//				eventResponse.setETCData("csr_no", approvalCsrVO.getCsrNo());
//				eventResponse.setETCData("err_msg", approvalCsrVO.getAproRmk());
//			} else {
//				eventResponse.setETCData("csr_no", "");
//				eventResponse.setETCData("err_msg", "");
//			}
//			
//		
//		}catch(EventException ex){
//			rollback();
//			throw new EventException(new ErrorHandler("COM12192", new String[]{"manageApprovalError"}).getMessage(), ex);
//	    } catch (Exception ex) {
//	        rollback();
//	        throw new EventException(new ErrorHandler("COM12192", new String[]{"manageApprovalError"}).getMessage(), ex);
//		}
		return eventResponse;
	}
	
// 2017.08.03 comment start(not used)
//    /**
//	 * 저장 이벤트 처리<br>
//	 * Approval Confirm 화면에 대한 저장 이벤트 처리<br>
//	 * 
//	 * @param Event e
//	 * @return EventResponse
//	 * @exception EventException
//	*/
//	public EventResponse confirmApprovalRemoteServer(Event e) throws EventException {
//		GeneralEventResponse eventResponse = new GeneralEventResponse();
//    	ComEns0U1Event event = (ComEns0U1Event)e;
//    	ApprovalBC command = new ApprovalBCImpl();
//    	
//    	//비동기 CSR
////		AGTAuditBC agtCommand = new AGTAuditBCImpl();
////		CARIssueTransferSlipManageBC tesCommand = new CARIssueTransferSlipManageBCImpl();
//// 		CSRIssueTransferSlipManageBC trsCommand = new CSRIssueTransferSlipManageBCImpl();
//		ConsultationSlipRequestMgtBC csrCommand = new ConsultationSlipRequestMgtBCImpl();
//		
//		ApprovalCsrVO[] approvalCsrVOs = null;
//    	ApprovalCsrVO approvalCsrVO = null;
//		
//		try{			
//			approvalCsrVOs = event.getApprovalCsrVOS();
//			if(approvalCsrVOs != null) {
//				String module = "";
//				String csrNo  = "";
//        		for (int i=0; i<approvalCsrVOs.length; i++) {
//        			//결재 선택 건 체크 (ibflag = 'U')
//        			if("U".equals(approvalCsrVOs[i].getIbflag())) {
//        				begin();
//        				//1) Approval화면에서 선택한 결재대상 기본정보
//        				approvalCsrVO = approvalCsrVOs[i];
//        				
//    	    			//2) 결재요청헤더의 결재상태 완료 여부 파악 - 완료된 건 중복 결재 피하기 위함
//    	    			boolean bAppComplete = command.searchApprovalCompletion(approvalCsrVO, e.getSignOnUserAccount());
//    	    			if(!bAppComplete) {
//	        				//3) 현 결재자 정보를 조회한다 - Web Service 연동 싱크
//	            			ComAproRqstRoutVO rout = command.searchApprovalCurCsrRoute(approvalCsrVO);
//	            			
//	            			//4) 최종 결재 여부를 체크한다 - 최종 결재시에만 CSR AP전송 
//	    	    			boolean bComplete = command.searchLastApprovalRoute(approvalCsrVO); 
//	    	    			
//	    	    			//5) 결재
//	    	    			//5-1) 결재 Update 수행 (Header & Route 정보)
//	    	    			command.confirmApproval(approvalCsrVO, e.getSignOnUserAccount());
//	    	    			//5-2) CSR 결재완료시, 각 모듈별 Update 수행 (TES/TRS/AGT/CSR)
//	    	    			if(bComplete) {    	
//	    	    				module = approvalCsrVO.getSubSysCd();
//	    	    				csrNo  = approvalCsrVO.getCsrNo();
//	//    	    				if("TRS".equals(module)) {
//	//    	    					trsCommand.approvalRequestAccount2("C", csrNo, rout);
//	//    	    				} else if("TES".equals(module)) {
//	//    	    					tesCommand.approvalRequestAccount2("C", csrNo, rout);
//	//    	    				}if("AGT".equals(module)){
//	//    	    					agtCommand.transferAgentActualINFtoAP2("C", csrNo, rout);
//	//    	    				}/* else if("MNR".equals(module) || "TLL".equals(module) || "LSE".equals(module) || "PSO".equals(module) || "CHS".equals(module) || "MGS".equals(module)) {
//	//    	    					csrCommand.approvalRequestAccount2("C", approvalCsrVO.getCsrNo(), rout);
//	//    	    				}*/
//	    	    			}
//	    	    			
//	    	    			// 7) CSR 결재완료시, ERP Interface 수행
//	    	    			FNS0080003Document[] docReq = null;
//	    	    			if(bComplete) {
//	    	    				String ofcCd = event.getSignOnUserAccount().getOfc_cd();
//	    	    				
//	//    	    				if("AGT".equals(module)) {
//	//    	    					docReq = agtCommand.transferAgentActualINFtoAP1("C", csrNo, rout);
//	//    	    				} else if("TES".equals(module)) {
//	//    	    					docReq = tesCommand.approvalRequestAccount1("C", csrNo, rout);
//	//    	    				} else if("TRS".equals(module)) {
//	//    	    					docReq = trsCommand.approvalRequestAccount1("C", csrNo, rout);	
//	//    	    				} else 
//	    	    					if("MNR".equals(module) || "TLL".equals(module) || "LSE".equals(module) || "PSO".equals(module) || "CHS".equals(module) || "MGS".equals(module) || "CNI".equals(module)) {
//	    	    					//AP I/F 수행할 CSR 데이타를 웹서비스를 위한 표준규격(XML Schema) 을 적용한 XML문서로 변환
//	    	    					docReq = csrCommand.approvalRequestAccount1("C", csrNo, ofcCd, rout);
//	    	    				}
//	    	    				
//		    					//invoice 정산내역을 ERP AP로 인터페이스한다.
//			    				transferInvToERP(docReq, approvalCsrVO); 
//	    	    				//BIZ스레드처리후 Exception 없다면 비동기(Biz) 커밋 :: Approval 결재 처리    	    				
//	    	    			}
//    	    			}
//    	    			commit();
//        			}
//        		}
//			}
//		}catch(EventException ex){
//			rollback();
//			throw ex;
//        } catch (Exception ex) {
//            log.error("err " + ex.toString(), ex);
//            rollback();
//            throw new EventException(new ErrorHandler("COM12192", new String[]{"Confirm Approval"}).getMessage(), ex);
//		}
//        
//    	return eventResponse;		
//	}
	
//    /**
//	 * 저장 이벤트 처리<br>   2014-06-24 KIMOKRYE
//	 * Approval Confirm 화면에 대한 저장 이벤트 처리<br>
//	 * 
//	 * @param Event e
//	 * @return EventResponse
//	 * @exception EventException
//	*/
//	public EventResponse confirmApprovalStmSap(Event e) throws EventException {
//		EventResponse eventResponse = new GeneralEventResponse();
//    	ComEns0U1Event event = (ComEns0U1Event)e;
//    	ApprovalBC command = new ApprovalBCImpl();
//    	
////		ConsultationSlipRequestMgtBC csrCommand = new ConsultationSlipRequestMgtBCImpl();
//		
//		ApprovalCsrVO[] approvalCsrVOs = null;
//    	ApprovalCsrVO approvalCsrVO = null;
//    	
////    	boolean bComplete = false;
//		
//		try{			
//			approvalCsrVOs = event.getApprovalCsrVOS();
//			if(approvalCsrVOs != null) {
//        		for (int i=0; i<approvalCsrVOs.length; i++) {
//        			//결재 선택 건 체크 (ibflag = 'U')
//        			if("U".equals(approvalCsrVOs[i].getIbflag())) {
//        				begin();
//        				//1) Approval화면에서 선택한 결재대상 기본정보
//        				approvalCsrVO = approvalCsrVOs[i];
//        				
//        				//2) 결재요청헤더의 결재상태 완료 여부 파악 - 완료된 건 중복 결재 피하기 위함
//    	    			String appComplete = command.searchApprovalCompletion(approvalCsrVO, e.getSignOnUserAccount());
//    	    			if("Y".equals(appComplete)) {
//	            			//3) 최종 결재 여부를 체크한다 - 최종 결재시에만 CSR AP전송 
//    	    				boolean bComplete = command.searchLastApprovalRoute(approvalCsrVO); 
//	
//	    	    			//4) 결재
//	    	    			//4-1) 결재 Update 수행 (Header & Route 정보)
//	    	    			String errMsg = command.confirmApproval(approvalCsrVO, e.getSignOnUserAccount());
//	    	    			
//	    	    			
//	    	    			if (errMsg != null && errMsg.equals("")) { 
//	    	    				//SAP Interface 수행
//	    	    				eventResponse = transferInvToStmSap(approvalCsrVO);
//	    	    			} else {
//	    	    				//rollback();
//	    	    				eventResponse.setETCData("SUCCESS_FLG", "FAIL");	 
//	    	    				eventResponse.setETCData("RESULT_MSG", errMsg);
//	    	    				eventResponse.setUserMessage(new ErrorHandler("XXXXXXXXX").getUserMessage());
//	    	    				throw new EventException(errMsg); 
//	    	    				
//	    	    			}
//	    	    			
//	    	    			
//    	    			}
//    	    			commit();
//        			}
//        		}
//			}
//		}catch(EventException ex){
//			rollback();
//			//throw ex;
//			throw new EventException(new ErrorHandler(ex).getMessage()); 
//        } catch (Exception ex) {
//            log.error("err " + ex.toString(), ex);
//            rollback();
//            throw new EventException(new ErrorHandler("COM12192", new String[]{"Confirm Approval"}).getMessage(), ex);
//		}
//		
//       
//    	return eventResponse;		
//	}	
// 2017.08.03 comment end(not used)
	
    /**
     * 조회 이벤트 처리<br>
     * Approval CSR 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     * @author DS HAM
     */
    private EventResponse searchUnApprovalCsrList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0Y1Event event = (ComEns0Y1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	
        try {
        	List<UnApprovalCsrVO>  unApprovalCsrVOs = command.searchUnApprovalCsrList(event.getUnApprovalCsrVO());
        	eventResponse.setRsVoList(unApprovalCsrVOs);
        } catch(EventException ex){
					throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"UnApproval Csr List"}).getMessage(), ex);
		}
        
        return eventResponse;
    }
    
	/**
	 * COM_ENS_0Y1 : Open<br>
	 * A/R HEAD QUARTER OFFICE CODE를 조회한다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 * @author DS HAM
	 */
	private EventResponse searchARRHQOfficeList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ApprovalBC command = new ApprovalBCImpl();
    	ComEns0Y1Event event = (ComEns0Y1Event)e;
			try {
				//String ofcCd = event.getSignOnUserAccount().getRhq_ofc_cd();
				//OFC_CD로 RHQ_OFC_CD를 조회 (2010-07-27 추가)
				String ofcCd = command.searchRhqOfcCdByOfcCd(event.getSignOnUserAccount().getOfc_cd());
				
				List<String> list = command.searchARRHQOfficeList();
				String arHdQtrOfcInfo = "";
				
				if(ofcCd.equals("SELHO")){	//본사직원인 경우 조회한 ar_hd_qtr_ofc_cd 정보 모두를 가져온다
				
					if (list.size() > 0) {
						StringBuffer tmp = new StringBuffer();
						for (int i = 0; i < list.size(); i++) {
//							arHdQtrOfcInfo = arHdQtrOfcInfo + "|" + list.get(i);
							tmp.append("|");
							tmp.append(list.get(i));
						}
						arHdQtrOfcInfo = tmp.toString();
						
						eventResponse.setETCData("ar_hd_qtr_ofc_cd", arHdQtrOfcInfo);
					} else {
						eventResponse.setUserMessage(new ErrorHandler("COM12198").getUserMessage());
					}
					
				}else{	//본사직원이 아닌 경우 조회한 본인의 ar_hd_qtr_ofc_cd 정보를 가져온다 
					eventResponse.setETCData("ar_hd_qtr_ofc_cd", "|" + ofcCd);
				}
				return eventResponse;
			} catch (EventException ex) {
				rollback();
				throw ex;
			} catch (Exception ex) {
				rollback();
				throw new EventException(new ErrorHandler("COM12203").getMessage(), ex);
			}
	}
	
	/**
	 * COM_ENS_0Y1 : Open<br>
	 * OFFICE CODE를 조회한다.<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 * @author DS HAM
	 */
	private EventResponse searchSelOfficeList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ApprovalBC command = new ApprovalBCImpl();
    	String arHdQtrOfcCd = "";
			try {
				if(e.getEventName().equals("ComEns0Y1Event")) {
					ComEns0Y1Event event = (ComEns0Y1Event)e;
					UnApprovalCsrVO infoVO = event.getUnApprovalCsrVO();
					arHdQtrOfcCd = infoVO.getArHdQtrOfcCd();
				} else if(e.getEventName().equals("ComEns0U2Event")) {
					ComEns0U2Event event = (ComEns0U2Event)e;
					arHdQtrOfcCd = event.getArHdQtrOfcCd();
				}
				
				List<String> list = command.searchSelOfficeList(arHdQtrOfcCd);
	            eventResponse.setRsVoList(list);
				return eventResponse;
			} catch (EventException ex) {
				rollback();
				throw ex;
			} catch (Exception ex) {
				rollback();
				throw new EventException(new ErrorHandler("COM12203").getMessage(), ex);
			}
	}
	
	/**
	 * 저장 이벤트 처리 <br>
	 * Approval Reject 저장 이벤트 처리<br>
	 * 
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	*/
	private EventResponse rejectApproval(Event e) throws EventException { 
		EventResponse eventResponse = null;
    	ComEns0U1Event event = (ComEns0U1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
    	ApprovalCsrVO[] approvalCsrVOs = null;
    	ApprovalCsrVO approvalCsrVO = null;
    	
    	try{
			begin();
			approvalCsrVOs = event.getApprovalCsrVOS();
			if(approvalCsrVOs != null) {
        		for (int i=0; i<approvalCsrVOs.length; i++) {
        			//결재 선택 건 체크 (ibflag = 'U')
        			if("U".equals(approvalCsrVOs[i].getIbflag())) {
        				//1) 처리할 건에 대한 기본정보
        				approvalCsrVO = approvalCsrVOs[i];

        				String sAppDup = command.checkApprovalDuplication(approvalCsrVO, account); //[2019-03-05] CSR의 approve할때 결재상태 확인하는 작업들을 그대로 적용함
        				if (sAppDup!=null && "Y".equals(sAppDup)) {
	    					boolean bAppComplete = command.searchApprovalCompletion(approvalCsrVO);
	    					if(bAppComplete) {
	    						throw new EventException((new ErrorHandler("CSR00084", new String[]{approvalCsrVO.getCsrNo()}).getMessage()));
	    					}
                			//2) 결재 정보 Update
                			command.rejectApproval(approvalCsrVO, e.getSignOnUserAccount());
        				}
        			}
        		}
			}
			commit();	
			
			eventResponse = command.searchApprovalCsrList(event.getApprovalStaffVO(), account);
		}catch(EventException ex){
			rollback();
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            rollback();
            throw new EventException(new ErrorHandler("COM12192", new String[]{"Reject Approval"}).getMessage(), ex);
		}
        
		return eventResponse;
	}
	
	/**
     * COM_ENS_0U1 : BackEndJob 상태, 에러 조회 <br>
     * 
     * @param Event e
     * @return EventResponse
     * @throws BackEndJobException
     */
	private EventResponse searchAccrualBackEndJobStatus(Event e) throws EventException { 
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		ConsultationSlipRequestMgtBC command = new ConsultationSlipRequestMgtBCImpl();
		
		String key = (String)e.getAttribute("key");
		String statusNerr = command.searchBakEndJobStatus(key);
		
		eventResponse.setETCData("jb_sts_flg", statusNerr.substring(0,1));
		eventResponse.setETCData("jb_usr_err_msg", statusNerr.substring(1));
		
		return eventResponse;
	}
	
	/**
     * COM_CSR_0008 View Approval Step 버튼 -> COM_ENS_0W1 팝업 조회 이벤트 처리<br>
     * Approval Step 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2007.03.22
     */
    private EventResponse searchApprovalStepList(Event e) throws EventException { //--
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns0W1Event event = (ComEns0W1Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
        try {
        	if(!"".equals(event.getApprovalCsrVO().getAproRqstNo())) {
	        	List<ApprovalStepVO>  resultVOs = command.searchApprovalStepList(event.getApprovalCsrVO());
	        	eventResponse.setRsVoList(resultVOs);
        	} else {
        		throw new EventException(new ErrorHandler("COM12111").getMessage());
        	}
        }catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Step List"}).getMessage(), ex);
		}
        
        return eventResponse;
    }
//approval-]--------------------------------------------------------------------------------------------------------------
    
	/**
	 * 조회 이벤트 처리<br>
	 * LogicsServiceProvider의 event에 대한 특정 리스트 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchLogicsServiceProvider(Event e) throws EventException {
		try{
			// PDTO(Data Transfer Object including Parameters)
			UiCtm0435Event event = (UiCtm0435Event)e;
			LogicsServiceProviderBC command = new LogicsServiceProviderBCImpl();
			List<RMdmVenderVO> list = command.searchLogicsServiceProvider(event.getRMdmVenderVO());
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(list);
			return eventResponse;
		} catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
	}

	 /**
     * 조회 이벤트 처리<br>
     * Commodity 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author sungseok, choi
     * @date 2006.08.03
     */
    private EventResponse searchCommodityList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        
        try {
        	ComEns011Event event = (ComEns011Event)e;
        	// CommodityBC command = new CommodityBCImpl() 추가
            CommodityBC command = new CommodityBCImpl();
           // String cmdtCd, String repCmdtCd, String repImdgLvlCd, String cmdtNm, int iPage
            /*
             * 20120206 added by JUN SUNG, KIM
             *  mdm data type 관련 주석 처리함.
             */
//            eventResponse.setRsVoList(command.searchCommodityList(event.getCmdtCd(),event.getRepCmdtCd(),event.getRepImdgLvlCd(),event.getCmdtNm(),event.getIPage()));
            eventResponse.setRsVoList(command.searchCommodityList(event.getCmdtCd(),event.getRepCmdtCd(),event.getRepImdgLvlCd(),event.getCmdtNm(),event.getIPage() ,event.getMdmYN(), event.getDeltFlg() ));
            
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
       * 조회 이벤트 처리<br>
     * Commodity Code화면에 대한 조회 이벤트 처리<br>
     * @param e Event
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchCmdtCdRepCmdtCd (Event e) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns012Event event = (ComEns012Event)e;
    	CommodityBC command = null;
    	List<SearchCmdtCdRepCmdtCdVO> list = null;
		try {
			command = new CommodityBCImpl();
			list = command.searchCmdtCdRepCmdtCd(event.getSearchCmdtCdRepCmdtCdVO());
			eventResponse.setRsVoList(list);
		} catch(EventException ex) {
			throw new EventException(ex.getMessage(), ex);
	    } catch (Exception ex) {
	        throw new EventException(new ErrorHandler("COM12240").getMessage(), ex);
		}
		return eventResponse;
    }
    
    
    
    /**
     * 조회 이벤트 처리<br>
     * Contract No 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchContractNoList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns021Event event = (ComEns021Event)e;
        try {
        	ContractNoBC command = new ContractNoBCImpl();
            eventResponse.setRsVoList(command.searchContractNoList(event.getContTp(),event.getContNo(),event.getCustNm(),event.getSdate(),event.getEdate(),event.getIPage(),event.getOfc_cd(),event.getCtrt_cust_sls_ofc_cd(), event.getMdmYN(), event.getDeltFlg()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Contract No 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchContractNoExcelList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns021Event event = (ComEns021Event)e;
        try {
        	ContractNoBC command = new ContractNoBCImpl();
            eventResponse.setRsVoList(command.searchContractNoExcelList(event.getContTp(),event.getContNo(),event.getCustNm(),event.getSdate(),event.getEdate(),event.getIPage(),event.getOfc_cd(),event.getCtrt_cust_sls_ofc_cd(), event.getMdmYN(), event.getDeltFlg()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * ServiceProvider 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author sungseok, choi
     * @date 2006.08.07
     */
    private EventResponse searchCustomerList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns041Event event = (ComEns041Event)e;
        try {
        	CustomerBC command = new CustomerBCImpl();
        	// custCd, custNm, ofcCd, iPage, include, cust
        	eventResponse.setRsVoList(command.searchCustomerList(event.getCustCd(),event.getCustNm(),event.getOfcCd(),event.getIPage(),event.getInclude(),event.getCust(), event.getMdmYN(), event.getDeltFlg(), event.getLocCd(), event.getCreditFlg() , event.getLgcyCd(),event.getLgcyNm(),event.getCtrtSrcCd(), event.getNmdCustFlg()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Location 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchLocationList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns051Event event = (ComEns051Event)e;
        try {
            LocationBC command = new LocationBCImpl();
            //eventResponse.setRsVoList(command.searchLocationList(event.getLocCd(),event.getLocNm(),event.getUnLocIndCd(),event.getCntCd(),event.getLocEqOfc(),event.getSelect(),event.getRccCd(),event.getLccCd(),event.getLocState(),event.getIPage(), event.getMdmYN(), event.getDeltFlg()));
            // scc flag 관련 searchLocationList() 에 sccFlg 추가.
            eventResponse.setRsVoList(command.searchLocationList(event.getLocCd(),event.getLocNm(),event.getUnLocIndCd(),event.getCntCd(),event.getLocEqOfc(),event.getSelect(),event.getRccCd(),event.getLccCd(),event.getLocState(),event.getIPage(), event.getMdmYN(), event.getDeltFlg(), event.getSccFlg()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /** Location Detail <br>
     * Location 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchLocationDetail(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns051Event event = (ComEns051Event)e;
        Map<String, String> etcData = new HashMap<String, String>();
        try {
            LocationBC command = new LocationBCImpl();
            List<SearchLocationDetailVO> list = command.searchLocationDetail(event);
            
            if(list.size() > 0){
         	   SearchLocationDetailVO vo = list.get(0);
         	   etcData.put("loc_cd", vo.getLocCd());
            		etcData.put("loc_nm", vo.getLocNm());
            		etcData.put("un_loc_cd", vo.getUnLocCd());
            		etcData.put("rgn_cd", vo.getRgnCd());
            		etcData.put("loc_state", vo.getLocState());
            		etcData.put("scc_cd", vo.getSccCd());
            		etcData.put("lcc_cd", vo.getLccCd());
            		etcData.put("ecc_cd", vo.getEccCd());
            		etcData.put("sls_ofc_cd", vo.getSlsOfcCd());
            		etcData.put("finc_ctrl_ofc_cd", vo.getFincCtrlOfcCd());
            		etcData.put("eq_ctrl_ofc_cd", vo.getEqCtrlOfcCd());
            		etcData.put("zip_cd", vo.getZipCd());
            		if(vo.getContiNm().trim().length() > 1){
            			etcData.put("conti_nm", vo.getContiNm());
            		}else{
            			etcData.put("conti_nm", "");
            		}
            		etcData.put("port_inlnd_flg", vo.getPortInlndFlg());
            		etcData.put("call_port_flg", vo.getCallPortFlg());
            		etcData.put("loc_locl_lang_nm", vo.getLocLoclLangNm());
            		etcData.put("mty_pkup_yd_cd", vo.getMtyPkUpYdCd());
            		etcData.put("rep_zn_cd", vo.getRepZnCd());
            	
            		etcData.put("hub_loc_cd", vo.getHubLocCd());
            		etcData.put("loc_grd_no", vo.getLocGrdNo());
            		etcData.put("cml_zn_flg", vo.getCmlZnFlg());
            		etcData.put("loc_ams_port_cd", vo.getLocAmsPortCd());
            		etcData.put("gmt_hrs", vo.getGmtHrs());
            		etcData.put("cstms_cd", vo.getCstmsCd());
            		etcData.put("sconti_cd", vo.getScontiCd());
            		etcData.put("country", vo.getCountry());
            		etcData.put("port_lat", vo.getPortLat());
            		etcData.put("port_lon", vo.getPortLon());
            	
            }  
            eventResponse.setETCData(etcData);
        } catch(EventException ex) {
 			throw ex;
 		} catch(Exception ex) {
 			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
 		}
        return eventResponse;
    }
    
    /**
	 * RCC_CD, LCC_CD <br>
	 *
	 * @param Event e
	 * @return EventResponse
	 * @exception EventException
	 */
	private EventResponse searchRccLccCd(Event e) throws EventException {
		// PDTO(Data Transfer Object including Parameters)
		LocationBC command = new LocationBCImpl();
		
//		CommonRsVO commonRsVO = command.searchRccLccCd((String)e.getAttribute("loc_grp_cd"),(String)e.getAttribute("loc_cd"));
//		GeneralEventResponse eventResponse = new GeneralEventResponse();
//		eventResponse.setRs(commonRsVO.getDbRowset());
		return null;				
	}
    
    /**
     * 조회 이벤트 처리<br>
     * Node 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchNodeList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns061Event event = (ComEns061Event)e;
        try {
            NodeBC command = new NodeBCImpl();
            List<Object> obj = command.searchNodeList(event.getCnt_cd(),event.getLoc_cd(),event.getOfc_cd(),event.getNode_cd(),event.getNode_nm(),event.getMode(),event.getMode_only(),event.getScc_cd(),event.getIPage(), event.getMdmYN(), event.getDeltFlg());
            if(event.getMode().equals("yard")){
            	List<SearchNodeYardListVO> list = (List<SearchNodeYardListVO>) obj.get(0);
            	eventResponse.setRsVoList(list);
			}else{
				List<SearchNodeZoneListVO> list = (List<SearchNodeZoneListVO>) obj.get(0);
            	eventResponse.setRsVoList(list);
			}
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Office 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchOfficeList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns071Event event = (ComEns071Event)e;
        try {
        	OfficeBC command = new OfficeBCImpl();
        	//locCd, ofcLev, ofcPtsCd, ofcCd, ofcNm, calltype, iPage, ofcAddr, mdmYN, deltFlg
            eventResponse.setRsVoList(command.searchOfficeList(event.getLoc_cd(),event.getOfc_lev(),event.getOfc_pts_cd(),event.getOfc_cd(),event.getOfc_nm(),event.getCallType(),event.getIPage(),event.getOfc_addr(), event.getMdmYN(), event.getDeltFlg()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Node 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchLaneList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ComEns081Event event = (ComEns081Event)e;
        try {
            LaneBC command = new LaneBCImpl();
            List<SearchLaneListVO> list = command.searchLaneList(event.getTrade_cd(),event.getSub_tradeCd(),event.getSvc_tp(),event.getLane_cd(),event.getLane_nm(),event.getMode(),event.getIPage(), event.getMdmYN(), event.getDeltFlg());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }

    /**
     * 조회 이벤트 처리<br>
     * Vessel 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchVesselList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns0A1Event event = (ComEns0A1Event)e;
        try {
            VesselBC command = new VesselBCImpl();
            //vslCd, vslEngNm, carCd, iPage , callSgnNo, lloydNo
            eventResponse.setRsVoList(command.searchVesselList(event.getVsl_cd(),event.getVsl_eng_nm(),event.getCar_cd(),event.getIPage(),event.getCall_sgn_no(),event.getLloyd_no(), event.getMdmYN(), event.getDeltFlg(), event.getFdrDiv_cd()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }     
    
    /**
     * 조회 이벤트 처리<br>
     * Vessel SKD 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchVesselSKDList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        
        try {
            VesselSKDBC command = new VesselSKDBCImpl();
            eventResponse.setRs(command.searchVessel_SKDList(e));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    

    
    /**
     * 조회 이벤트 처리<br>
     * Vessel SKD 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     */
    private EventResponse searchVvdList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns0B2Event event = (ComEns0B2Event)e;
        try {
            VvdBC command = new VvdBCImpl();
            //etDeta, sdDate, edDate, vvdCd, locCd, laneCd, oper, iPage
            eventResponse.setRsVoList(command.searchVvdList(event.getEtdeta(),event.getSdate(),event.getEdate(),event.getVvd_cd(),event.getLoc_cd(),event.getLane_cd(),event.getOper(),event.getIPage()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * ServiceProvider 화면에 대한 조회 이벤트 처리<br>     
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author sungseok, choi
     * @date 2006.08.07
     */
    private EventResponse searchServiceProviderList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<SpListVO> list = new ArrayList<SpListVO>();
			SpListVO   vo = null;
			ComEns0C1Event event = (ComEns0C1Event)e; ;
//			if(e.getEventName().equalsIgnoreCase("ComEns0C1Event")){
			vo = event.getSpListVO();
//			}
        	
            ServiceProviderBC command = new ServiceProviderBCImpl();
            list =command.searchServiceProviderList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * EQ Organization Chart 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchEQOrgChartList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
        List<EQQrgChartListVO> list = new ArrayList<EQQrgChartListVO>();
        try {
        	ComEns0O1Event event=(ComEns0O1Event)e;
            EQOrgChartBC command = new EQOrgChartBCImpl();
            
            String depth = event.getDepth();
            String chkDepth = event.getChkDepth();
            String sccFlag = event.getSccFlag();
            
            list = command.searchEQOrgChartList(depth, chkDepth, sccFlag);
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Service Scope 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchServiceScopeList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<SearchServiceScopeListVO> list = new ArrayList<SearchServiceScopeListVO>();
			SearchServiceScopeListVO   vo = null;
			ComEns0L1Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComEns0L1Event")){
				event = (ComEns0L1Event)e; 
				vo = event.getSearchServiceScopeListVO();
//			}
        	
			ServiceScopeBC command = new ServiceScopeBCImpl();
            list =command.searchServiceScopeList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Country 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchCountryList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<CountryListVO> list = new ArrayList<CountryListVO>();
			CountryListVO   vo = null;
			ComEns0M1Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComEns0M1Event")){
				event = (ComEns0M1Event)e; 
				vo = event.getCountryListVO();
//			}
        	
			CountryBC command = new CountryBCImpl();
            list =command.searchCountryList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Continent 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchContinentList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        
        try {
			List<SearchContinentListVO> list = new ArrayList<SearchContinentListVO>();
			SearchContinentListVO vo = null;
			ComEns0H1Event event = null;
			event = (ComEns0H1Event)e;
			vo = event.getSearchContinentCodeInquiryListVO();
			ContinentBC command = new ContinentBCImpl();
			
			list = command.searchContinentList(vo);
			
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Sub Continent 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh     
     * @date 2006.08.07
     */
    private EventResponse searchSubContinentList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<SearchSubContinentListVO> list = new ArrayList<SearchSubContinentListVO>();
			SearchSubContinentListVO   vo = null;
			ComEns0I1Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComEns0I1Event")){
				event = (ComEns0I1Event)e; 
				vo = event.getSearchSubContinentListVO();
//			}
        	
			SubContinentBC command = new SubContinentBCImpl();
            list =command.searchSubContinentList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
            
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Region 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchRegionList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<SearchRegionListVO> list = new ArrayList<SearchRegionListVO>();
			SearchRegionListVO   vo = null;
			ComEns0J1Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComEns0J1Event")){
				event = (ComEns0J1Event)e; 
				vo = event.getSearchRegionListVO();
//			}
        	
			RegionBC command = new RegionBCImpl();
            list =command.searchRegionList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Continent 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchRepCommodityList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComEns0K1Event event = (ComEns0K1Event)e;
        try {
			List<SearchRepCommodityListVO> list = new ArrayList<SearchRepCommodityListVO>();
			SearchRepCommodityListVO   vo = null;
			if(e.getEventName().equalsIgnoreCase("ComEns0K1Event")){
				event = (ComEns0K1Event)e; 
				vo = event.getSearchRepCommodityListVO();
			}
        	
			RepCommodityBC command = new RepCommodityBCImpl();
            list =command.searchRepCommodityList(vo);
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Carrier 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchCarrierList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<CarrierListVO> list = new ArrayList<CarrierListVO>();
			CarrierListVO   vo = null;
			ComEns0N1Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComEns0N1Event")){
				event = (ComEns0N1Event)e; 
				vo = event.getCarrierListVO();
//			}
        	
			CarrierBC command = new CarrierBCImpl();
            list =command.searchCarrierList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    
    /**
     * 조회 이벤트 처리<br>
     * Container Type Size 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchCntrTpSzList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	CntrTpSzBC command = new CntrTpSzBCImpl();
            eventResponse = command.searchCntrTpSzList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * VVD Chart 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchVVDChartList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
            List<VVDChartListVO> list = new ArrayList<VVDChartListVO>();
            ComEns0P1Event event = (ComEns0P1Event)e;
            VVDChartBC command = new VVDChartBCImpl();
            list =command.searchVVDChartList(event.getScnr_id(), event.getDepth(), event.getChkDepth()); 
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * VVD Chart 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchMonthlyRateList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	MonthlyRateBC command = new MonthlyRateBCImpl();
            eventResponse = command.searchMonthlyRateList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * VVD Chart 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchVvdRateList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<VVDListVO> list = new ArrayList<VVDListVO>();
			VVDListVO   vo = null;
			ComEns0F1Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComEns0F1Event")){
				event = (ComEns0F1Event)e; 
				vo = event.getVvdListVO();
//			}
        	
			VVDRateBC command = new VVDRateBCImpl();
            list =command.searchVVDRateList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Staff 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchStaffList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
    	GeneralEventResponse response = new GeneralEventResponse();
        try {
        	StaffBC command = new StaffBCImpl();
        	ComEns091Event event = (ComEns091Event)e;
        	response.setRsVoList(command.searchStaffList(event.getOfc_cd(),event.getUser_cd(),event.getUser_nm()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return response;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Staff 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchDeptList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
    	GeneralEventResponse response = new GeneralEventResponse();
        ComEns091Event event = (ComEns091Event)e; 
        try {
        	StaffBC command = new StaffBCImpl();
        	response.setRsVoList(command.searchDeptList(event.getSignOnUserAccount().getOfc_cd()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return response;
    }
       
    /**
     * 조회 이벤트 처리<br>
     * Local Calendar 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchCntHolidayList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	CalendarBC command = new CalendarBCImpl();
            eventResponse = command.searchCntHolidayList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
	 * Forecasted Vessel Residual Capacity 저장 <br>
	 * Forecasted Vessel Residual Capacity 저장 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	*/
	private EventResponse modifyCntHoliday(Event e) throws EventException {
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;           
		try {
			CalendarBC command = new CalendarBCImpl();
			eventResponse = command.modifyCntHoliday(e);
		} catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
		return eventResponse;
	}
	
//	/**
//	 * 설명 : AP I/F 수행 <br>
//	 * CSR AP 관련 공통 메소드입니다 2009-11-18 HDS
//	 * @throws EventException 
//	*/
//	private void transferInvToERP(FNS0080003Document[] docReq, ApprovalCsrVO approvalCsrVO) throws EventException {
//		SendQueueBC apInvCommand = new SendQueueBCImpl();
//		ApprovalBC command = new ApprovalBCImpl();
//		try {
//			apInvCommand.transferInvToERP(docReq, this.account);
//		} catch(EventException ex) {
//			rollback();
//			command.confirmApprovalRemark(approvalCsrVO);
//			throw ex;
//		} catch(Exception ex) {
//			rollback();
//			command.confirmApprovalRemark(approvalCsrVO);
//			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
//		}
//	}
	
//	/**
//	 * 설명 : STM SAP I/F 수행 <br>
//	 * CSR AP 관련 공통 메소드입니다 2014-06-24 KIMOKRYE
//	 * @throws EventException 
//	*/
//	private EventResponse transferInvToStmSap(ApprovalCsrVO approvalCsrVO) throws EventException {
//		ApprovalBC command = new ApprovalBCImpl();
//		
//		EventResponse apEventResponse = new GeneralEventResponse();
//		
//		AccountPayableInvoiceSC invSC = new AccountPayableInvoiceSC();
//		try {
//			apEventResponse = invSC.manageSapIfValidateImportCheck("S/O_BIZ", approvalCsrVO.getCsrNo(), account.getUsr_id());
//		} catch(EventException ex) {
//			rollback();
//			String result_msg = ex.getMessage();
//			/*Map<String, String> mapVO = new HashMap<String, String>();
//			mapVO = apEventResponse.getETCData();
//			String success_flg = mapVO.get("SUCCESS_FLG");
//			String result_msg = mapVO.get("RESULT_MSG");
//			//log.debug("result_msg:::::" + result_msg); */
//			
//			String[] err_msg=result_msg.split("<\\|\\|>");
//
//			if(err_msg != null && err_msg.length > 2) {
//				approvalCsrVO.setAproRmk(err_msg[err_msg.length-2]);
//			} else { 
//				approvalCsrVO.setAproRmk(result_msg);
//			}
//			
//			command.confirmApprovalResultRemark(approvalCsrVO);
//			//command.confirmApprovalRemark(approvalCsrVO);
//			throw ex;
//		} catch(Exception ex) {
//			rollback();
//			command.confirmApprovalRemark(approvalCsrVO);
//			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
//		}
//		
//		return apEventResponse;
//	}	
	
	/**
     * 조회 이벤트 처리<br>
     * Local Calendar 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchSteHolidayList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	CalendarBC command = new CalendarBCImpl();
            eventResponse = command.searchSteHolidayList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
	 * Forecasted Vessel Residual Capacity 저장 <br>
	 * Forecasted Vessel Residual Capacity 저장 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	*/
	private EventResponse modifySteHoliday(Event e) throws EventException {
		
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;           
		
		try {
			CalendarBC command = new CalendarBCImpl();
			eventResponse = command.modifySteHoliday(e);
			return (eventResponse); 
		} catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
	}
	
	/**
     * 조회 이벤트 처리<br>
     * Local Calendar 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchLocHolidayList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	CalendarBC command = new CalendarBCImpl();
            eventResponse = command.searchLocHolidayList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
	 * Forecasted Vessel Residual Capacity 저장 <br>
	 * Forecasted Vessel Residual Capacity 저장 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	*/
	private EventResponse modifyLocHoliday(Event e) throws EventException {
		
		// 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		EventResponse eventResponse = null;           
		
		try {
			CalendarBC command = new CalendarBCImpl();
			eventResponse = command.modifyLocHoliday(e);
			return (eventResponse); 
		} catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
	}
	
	/**
     * 조회 이벤트 처리<br>
     * Local Calendar 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchMonthlyHolidayList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	CalendarBC command = new CalendarBCImpl();
            eventResponse = command.searchMonthlyHolidayList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Local Calendar 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author HyungChoon Roh
     * @date 2006.08.07
     */
    private EventResponse searchStateList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        EventResponse eventResponse = null;
        try {
        	StateBC command = new StateBCImpl();
            eventResponse = command.searchStateList(e);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
        return eventResponse;
    }

    
    /**
     * 조회 이벤트 처리<br>
     * Per Type 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author Prak Kwang Seok
     * @date 2009.04.20
     */
    private EventResponse searchPertypeList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
			// PDTO(Data Transfer Object including Parameters)
    		UiPri4002Event event = (UiPri4002Event)e;
			PerTypeBC command = new PerTypeBCImpl();
			List<PriRatUtVO> list = command.searchPertypeList(event.getPretypevo());
			eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
		return eventResponse;
	}
    


    /**
     * AccountList 조회 이벤트 처리
     * Account Code 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author Suk Jun Kim
     * @date 2007.04.22
     */
    private EventResponse searchAccountList(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
	    	ComEnsN11Event event = (ComEnsN11Event)e;
	    	AccountBC command = new AccountBCImpl();
	    	List<MdmAccountVO> list = command.searchAccountList(event.getMdmAccountVO());
	    	
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }

    /**
     * CurrencyList 조회 이벤트 처리
     * Currency Code 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author Eui-su Park
     * @date 2007.04.22
     */
    private EventResponse searchCurrencyList(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
	    	ComEnsN13Event event = (ComEnsN13Event)e;
	    	CurrencyBC command = new CurrencyBCImpl();
	    	List<MdmCurrencyVO> list = command.searchCurrencyList(event.getMdmCurrencyVO());
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }

    /**
     * PackageType 조회 이벤트 처리
     * PackageType 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author Ji Seok Woo
     * @date 2009.04.24
     */
    private EventResponse searchPackageTypeList(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		UiBkg0696Event event = (UiBkg0696Event)e;
	    	PackageTypeBC command = new PackageTypeBCImpl();
	    	List<PackageTypeVO> list = command.searchPackageTypeList(event.getPackageTypeVO());
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * 
     * @param e
     * @return
     * @throws EventException
     */
    private EventResponse searchRevenueVVDList(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
	    	UiComEnsN12Event event = (UiComEnsN12Event)e;
	    	RevenuevvdBC command = new RevenuevvdBCImpl();
	    	List<ArMstRevVvdVO> list = command.searchRevenueVVDList(event.getArMstRevVvdVO());
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }

    /**
     * searchMovementStatusList 조회 이벤트 처리
     * Movement Status Code 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author KIM JONG OCK
     * @date 2012.02.20
     */
    private EventResponse searchMovementStatusList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		ComCom0010Event event = (ComCom0010Event)e;
    		MovementBC command = new MovementBCImpl();
	    	List<MdmMvmtStsVO> list = command.searchMovementList(event.getMdmMovementVO());
	    	
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * searchTradeList 조회 이벤트 처리
     * Trade List 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author jayoung Shin
     * @date 2012.02.21
     */
    private EventResponse searchTradeList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		ComCom0012Event event = (ComCom0012Event)e;
    		TradeBC command = new TradeBCImpl();
	    	List<SearchTradeListVO> list = command.searchTradeList(event.getSearchTradeListVO(),event.getMdmYn(), event.getDeltFlg() );
	    	
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * searchSubtradeList 조회 이벤트 처리
     * Subtrade List 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author jayoung Shin
     * @date 2012.02.22
     */
    private EventResponse searchSubtradeList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		ComCom0013Event event = (ComCom0013Event)e;
    		SubtradeBC command = new SubtradeBCImpl();
	    	List<SearchSubtradeListVO> list = command.searchSubtradeList(event.getSearchSubtradeListVO(),event.getMdmYn(), event.getDeltFlg() );
	    	
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * searchMdmCntrTpList 조회 이벤트 처리<br>
     * Container Type Code Pop-up  팝업 조회처리 <br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author JungHo Min
     * @date 2012.02.14
     */
    private EventResponse searchMdmCntrTpList(Event e) throws EventException {
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<MdmCntrTpListVO> list = new ArrayList<MdmCntrTpListVO>();
			MdmCntrTpListVO   vo = null;
			ComCom0002Event event = null;
			if(e.getEventName().equalsIgnoreCase("ComCom0002Event")){
				event = (ComCom0002Event)e; 
				vo = event.getMdmCntrTpListVO();
			}
        	
			CntrTypeBC command = new CntrTypeBCImpl();
            list =command.searchMdmCntrTpList(vo);
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    } 
    
    /**
     * searchMdmCntrSzList 조회 이벤트 처리<br>
     * Container Type Size Pop-up  팝업 조회처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author JungHo Min
     * @date 2012.02.14
     */
    private EventResponse searchMdmCntrSzList(Event e) throws EventException {
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<MdmCntrSzListVO> list = new ArrayList<MdmCntrSzListVO>();
			MdmCntrSzListVO   vo = null;
			ComCom0003Event event = null;
			if(e.getEventName().equalsIgnoreCase("ComCom0003Event")){
				event = (ComCom0003Event)e; 
				vo = event.getMdmCntrSzListVO();
			}
        	
			CntrSizeBC command = new CntrSizeBCImpl();
            list = command.searchMdmCntrSzList(vo);
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }     
    
    /**
     * searchLeasingCompanyYardList 조회 이벤트 처리
     * Leasing Company Yard 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author KIM MIN SOO
     * @date 2012.02.21
     */
    private EventResponse searchLeasingCompanyYardList(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		ComCom0004Event event = (ComCom0004Event)e;
    		LeasingCompanyYardBC command = new LeasingCompanyYardBCImpl();
	    	List<SearchLeasingCompanyYardListVO> list = command.searchLeasingCompanyYardList(event.getSearchLeasingCompanyYardListVO());
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * searchRevenueLaneList 조회 이벤트 처리
     * zone code 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author SEO SEOK JIN
     * @date 2012.02.21
     */
    private EventResponse searchRevenueLaneList(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
	    	ComCom0011Event event = (ComCom0011Event)e;
	    	RevenueLaneBC command = new RevenueLaneBCImpl();
	    	String rlaneCd = event.getRlaneCd();
	    	String rlaneNm = event.getRlaneNm();
	    	String status  =  event.getStatus();
	    	String mdmYn   =  event.getMdmYn();
	    	if(!mdmYn.equals("Y")){ //구분값이  Y이면  Active상태만 구해오기 Delfalg값이 Y이가 아닌값
	    		status ="A";
	    	}
	    	
	    	List<SearchRevenueLaneListVO> list = command.searchRevenueLaneList(rlaneCd,rlaneNm,status);
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Sales Rep. 화면에 대한 조회 이벤트 처리<br>
     * @param e  
     * @return response EventResponse
     * @exception EventException
     * @author Kim Yong Jin
     * @date 2012.02.20
     */
    private EventResponse searchSalesRepList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<SalesRepListVO> list = new ArrayList<SalesRepListVO>();
			SalesRepListVO   vo = null;
			ComCom0008Event event = null;
			if(e.getEventName().equalsIgnoreCase("ComCom0008Event")){
				event = (ComCom0008Event)e; 
				vo = event.getSalesRepListVO();
			}
        	
			SalesRepBC command = new SalesRepBCImpl();
            list =command.searchSalesRepList(vo);
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    /**
     * 조회 이벤트 처리<br>
     * Charge 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author JunBum Lee
     * @date 2012.02.20
     */
    private EventResponse searchChargeList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<ChargeListVO> list = new ArrayList<ChargeListVO>();
			ChargeListVO  vo = null;
			ComCom0001Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComCom0001Event")){
				event = (ComCom0001Event)e; 
				vo = event.getChargeListVO();
//			}
        	
			ChargeBC command = new ChargeBCImpl();
            list =command.searchChargeList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Charge 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author JunBum Lee
     * @date 2012.04.03
     */
	private EventResponse searchRepChgCd(Event e) throws EventException {

		// 반환 객체 생성
		GeneralEventResponse eventResponse = new GeneralEventResponse();	
		try{
		
			// BC 객체 생성
			ChargeBC command = new ChargeBCImpl();
			// Area List 09
			List<RepChargeVO> repChargeVos = command.searchRepChgCd();
				
			StringBuffer comboList = new StringBuffer("");
			for(int i=0; i<repChargeVos.size(); i++){
				RepChargeVO repChargeVO = (RepChargeVO)repChargeVos.get(i);
				String code = repChargeVO.getRepChgCd();
				comboList.append("|" + code);
			}
			eventResponse.setETCData("repChgCd", comboList.toString());

		} catch(EventException ex) {
			log.error("err " + ex.toString(), ex);
			throw ex;
		} catch(Exception ex) {
			log.error("err " + ex.toString(), ex);
			throw new EventException(new ErrorHandler("CNI99999").getMessage(), ex);
		}
		
		return eventResponse;
	}
    
    /**
     * 조회 이벤트 처리<br>
     * Daylight Saving Time 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author JunBum Lee
     * @date 2012.02.20
     */
    private EventResponse searchDaylightSavingTimeList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        try {
			List<DaylightSavingTimeListVO> list = new ArrayList<DaylightSavingTimeListVO>();
			DaylightSavingTimeListVO  vo = null;
			ComCom0005Event event = null;
//			if(e.getEventName().equalsIgnoreCase("ComCom0005Event")){
				event = (ComCom0005Event)e; 
				vo = event.getDaylightSavingTimeListVO();
//			}
        	
			DaylightSavingTimeBC command = new DaylightSavingTimeBCImpl();
            list =command.searchDaylightSavingTimeList(vo, event.getIPage());
            eventResponse.setRsVoList(list);
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }   
    
    /**
     * VENDOR Code POPUP (COM_COM_0007) 
     * 조건에 따른 Vendor 조회
     * @param Event e
     * @return EventResponse eventResponse
     * @throws EventException
     * @author Jong-ho Kim
     * @date 2012.02.20
     */
    private EventResponse searchVendorCode(Event e) throws EventException {
	  // AccountList
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
	    	ComCom0007Event event = (ComCom0007Event)e;
	    	VendorCodeBC command = new VendorCodeBCImpl();
	    	List<SearchVendorCodeVO> list = command.searchVendorCode(event.getSearchVendorCodeVO(), event.getIPage());
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * ServiceProvider 화면에 대한 조회 이벤트 처리<br>
     * @param e 
     * @return response EventResponse
     * @exception EventException
     * @author sungho park
     * @date 2012.02.21
     */
    private EventResponse searchCustGroupList(Event e) throws EventException {
        // 사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
        GeneralEventResponse eventResponse = new GeneralEventResponse();
        ComCom0006Event event = (ComCom0006Event)e;
        try {
        	CustGroupBC command = new CustGroupBCImpl();
        	// custGrpId, custGrpNm, ofcCd, iPage, include, deltFlg
            eventResponse.setRsVoList(command.searchCustGroupList(event.getCustGrpId(),event.getCustGrpNm(),event.getOfcCd(),event.getIPage(),event.getMdmYn(),event.getDeltFlg(), event.getCustGrpAbbrNm()));
        } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * searchActivityList 조회 이벤트 처리
     * Activity Code 팝업 조회처리
     * @param e
     * @return
     * @throws EventException
     * @author Sangbo La
     * @date 2012.02.20
     */
    private EventResponse searchActivityList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		ComCom0009Event event = (ComCom0009Event)e;
    		ActivityBC command = new ActivityBCImpl();
	    	List<SearchMdmActivityVO> list = command.searchActivityList(event.getSearchMdmActivityVO());
	    	
	    	eventResponse.setRsVoList(list);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * 조회 이벤트 처리<br>
     * RHQ.Office List조회
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchRHQOfficeList(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ApprovalBC command = new ApprovalBCImpl();
//    	ComEns0U2Event event = (ComEns0U2Event)e;
		try {
			List<String> list = command.searchRHQOfficeList();
			String arHdQtrOfcInfo = "";
			if (list.size() > 0) {
				StringBuffer tmp = new StringBuffer();
				for (int i = 0; i < list.size(); i++) {
					tmp.append("|");
					tmp.append(list.get(i));
				}
				arHdQtrOfcInfo = tmp.toString();
				
				eventResponse.setETCData("rhq", arHdQtrOfcInfo);
				String rhqOfcCd = command.searchRHQOffice(account.getOfc_cd());
				eventResponse.setETCData("rhq_ofc_cd", rhqOfcCd);
			} else {
				eventResponse.setUserMessage(new ErrorHandler("COM12198").getUserMessage());
			}
			return eventResponse;
		} catch (EventException ex) {
			rollback();
			throw ex;
		} catch (Exception ex) {
			rollback();
			throw new EventException(new ErrorHandler("COM12203").getMessage(), ex);
		}
    }
    
    /**
     * 조회 이벤트 처리<br>
     * Approval Inquiry 화면에 대한 조회 이벤트 처리<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse searchApprovalList(Event e) throws EventException {
    	EventResponse eventResponse = null;
    	ComEns0U2Event event = (ComEns0U2Event)e;
    	ApprovalBC command = new ApprovalBCImpl();
        try {
        	String[] searchCondOfc = {"", ""};
        	searchCondOfc[0] = event.getCOfcCd();
        	searchCondOfc[1] = event.getAOfcCd();
        	ApprovalStaffVO approvalStaffVO = event.getApprovalStaffVO();
        	approvalStaffVO.setUsrId(account.getUsr_id());
        	eventResponse = command.searchApprovalList(approvalStaffVO, searchCondOfc);
        } catch(EventException ex){
			throw ex;
        } catch (Exception ex) {
            log.error("err " + ex.toString(), ex);
            throw new EventException(new ErrorHandler("COM12203", new String[]{"Approval Csr List"}).getMessage(), ex);
		}
        return eventResponse;
    }
    
    /**
     * office code validate check<br>
     * 
     * @param Event e
     * @return EventResponse
     * @exception EventException
     */
    private EventResponse validateOffice(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	ApprovalBC command = new ApprovalBCImpl();
    	ComEns0T1Event event = (ComEns0T1Event)e;
		try {
			ApprovalStaffVO staff = event.getApprovalStaffVO();
			String count = command.validateOffice(staff.getOfcCd());
			eventResponse.setETCData("count", count);
			return eventResponse;
		} catch (EventException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler("COM12203").getMessage(), ex);
		}
    }
    
    /**
     * 2017.05.31
     * Login Office에 대한 India Country Flag 조회 이벤트 처리
     * 각 업무단에서 조회처리
     * 
     * @param e
     * @return
     * @throws EventException
     */
    private EventResponse searchIndiaCountryFlagInfoForOffice(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	String cntInFlg = "N";
    	String ofcCd = "";
    	try{
    		ComEnsT01Event event = (ComEnsT01Event)e;
    		TaxBC command = new TaxBCImpl();
    		
    		ComTaxVO comTaxVO = event.getComTaxVO();
    		ofcCd = "".equals(comTaxVO.getOfcCd()) ? account.getOfc_cd() : comTaxVO.getOfcCd();
    		
    		cntInFlg = command.searchIndiaCountryFlagInfoForOffice(ofcCd);	    	
	    	
	    	eventResponse.setETCData("IN_CNT_FLG", cntInFlg);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * 2017.05.31
     * Vendor에 해당하는 India Tax 정보 조회 이벤트 처리
     * India Tax 팝업 조회처리
     * 
     * @param e
     * @return
     * @throws EventException
     */
    private EventResponse searchIndiaTaxInfo(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    	try{
    		ComEnsT01Event event = (ComEnsT01Event)e;
    		TaxBC command = new TaxBCImpl();
    		ComTaxVO condTaxVO = event.getComTaxVO();

    		String ofcCd = "".equals(condTaxVO.getOfcCd()) ? account.getOfc_cd() : condTaxVO.getOfcCd();

   			condTaxVO.setOfcCd(ofcCd);
	    	ComTaxVO comTaxVO = command.searchIndiaTaxInfo(condTaxVO);
	    	if(null == comTaxVO){
	    		comTaxVO = new ComTaxVO();
	    	}
	    	eventResponse.setRsVo(comTaxVO); //Vendor master 정보.
	    	
	    	List<ComTaxVO> sacList = new ArrayList<ComTaxVO>();
	    	sacList = command.searchIndiaTaxVendorSacList(condTaxVO);
	    	
	    	if(null != sacList && sacList.size() > 0){
	    		eventResponse.setRsVoList(sacList);
	    	}else{
	    		sacList = new ArrayList<ComTaxVO>();
	    		sacList.add(comTaxVO); //Vendor SAC 가 존재 하지 않을때 Vendor Master의 SAC 를 사용한다.
	    		eventResponse.setRsVoList(sacList);
	    	}
	    	
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
    
    /**
     * 2017.05.31
     * Login Office && Vendor에 해당하는 India Tax Flag 조회 이벤트 처리
     * 
     * @param e
     * @return
     * @throws EventException
     */
    private EventResponse searchIndiaTaxFlagInfo(Event e) throws EventException {
    	GeneralEventResponse eventResponse = new GeneralEventResponse();
    			
		String cntInFlg = "N"; //Login Office India Country 여부.
    	String inVndrFlg = "N"; //Vendor India 여부
    	String ofcCd = "";
    	try{
    		ComEnsT01Event event = (ComEnsT01Event)e;
    		TaxBC command = new TaxBCImpl();
    		
    		ComTaxVO condTaxVO = event.getComTaxVO();
    		
    		ofcCd = "".equals(condTaxVO.getOfcCd()) ? account.getOfc_cd() : condTaxVO.getOfcCd();
    		
    		condTaxVO.setOfcCd(ofcCd);
    		
    		//Vendor 의 TAX  정보(Office의 India country 여부 포함).
	    	ComTaxVO taxVO = command.searchIndiaTaxInfo(condTaxVO);
	    	
	    	if(null != taxVO){
	    		//Login Office가 India 이면 Y로 리턴.
	    		if(!("").equals(taxVO.getInCntFlg())){
	    			cntInFlg = taxVO.getInCntFlg();	    			
	    		}
	    		//India Vendor가 존재 하면 Y로 리턴.
	    		if(!("").equals(taxVO.getVndrSeq())){
	    			inVndrFlg = "Y";
	    		}
	    	}
	    	eventResponse.setETCData("IN_CNT_FLG", cntInFlg);
	    	eventResponse.setETCData("IN_VNDR_FLG", inVndrFlg);
	    } catch(EventException ex) {
			throw ex;
		} catch(Exception ex) {
			throw new EventException(new ErrorHandler(ex.getMessage()).getMessage(), ex);
		}
    	return eventResponse;
    }
}
