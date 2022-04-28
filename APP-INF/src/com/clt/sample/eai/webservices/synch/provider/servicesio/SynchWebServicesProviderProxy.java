/* =========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SynchWebServicesProviderProxy.java
*@FileTitle : Synch WebServices Provider Proxy
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2009-05-25 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.eai.webservices.synch.provider.servicesio;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.apache.log4j.Logger;

import weblogic.jws.WLHttpTransport;

import com.clt.bizcommon.BizCommonSC;
import com.clt.bizcommon.commodity.basic.CommodityBC;
import com.clt.bizcommon.commodity.basic.CommodityBCImpl;
import com.clt.bizcommon.commodity.event.ComEns011Event;
import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.sample.eai.webservices.synch.provider.servicesio.SampleVO;


/**
 * It's ReportDesignerStatusUpdateProxy.java
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
@WebService(name="SynchWebServicesProviderProxyPortType", serviceName="SynchWebServicesProviderProxy",
        targetNamespace="http://www.clt.com/integration/alps")

@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,
         use=SOAPBinding.Use.LITERAL,
         parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)

@WLHttpTransport(contextPath="/opuscntr/webservices", serviceUri="/SynchWebServicesProviderProxy",
             portName="SynchWebServicesProviderProxyPort")
             
public class SynchWebServicesProviderProxy 
{
	
	protected transient Logger log = Logger.getLogger(this.getClass().getName());
	
	/**
	 *  WebServices providing Example (return commodity name by code) ! 
	 * @param cmdt_cd : code of commodity 
	 * @return SampleVO
	 * @throws Exception
	 */
	@WebMethod()
	public SampleVO SynchWebServicesSample( String cmdt_cd )
			throws Exception
	{

		DBRowSet dbRowSet = null;
		BizCommonSC bizComSC = new BizCommonSC();
		
		
		// ========= Validation Parameters for WebServices ========= 
		if( cmdt_cd == null || cmdt_cd.equals("") )
		{
			throw new EventException("Parameter is not valided !");
		}else if( cmdt_cd.length() < 6 )
		{
			throw new EventException("Parameter is too short !");
		}
		// ========= Validation Parameters for WebServices ========= 


		// ========= Command Add ===============
		FormCommand f = new FormCommand();
		f.setCommand(FormCommand.SEARCH);
		// ========= Command Add ===============

		ComEns011Event event = new ComEns011Event(cmdt_cd, "", "", "", 0);
        event.setFormCommand(f);
        
        /**
         * SC를 호출한다. 
         */
        EventResponse eventResponse = bizComSC.perform(event);
       
        dbRowSet = eventResponse.getRs();
          
          
        // ======== setting VO from RowSet ========== 
        SampleVO vo = new SampleVO();
        if(dbRowSet.next())
        {
        	vo.setCmdtCd(dbRowSet.getString("cmdt_cd"));
        	vo.setCmdtNm(dbRowSet.getString("cmdt_nm"));
        	vo.setRepCmdtCd(dbRowSet.getString("rep_cmdt_cd"));
        	vo.setRepImdgLvlCd(dbRowSet.getString("rep_imdg_lvl_cd"));
        }
        // ======== setting VO from RowSet ========== 

        
        return vo;
      }

}
