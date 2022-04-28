/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadSC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 20, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload;

import java.util.List;

import com.clt.framework.component.util.StringUtil;
import com.clt.framework.core.config.SiteConfigFactory;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.syscommon.common.fileupload.basic.FileUploadBC;
import com.clt.syscommon.common.fileupload.basic.FileUploadBCImpl;
import com.clt.syscommon.common.fileupload.event.FileUploadEvent;
import com.clt.syscommon.common.fileupload.event.FileUploadPopupEvent;

/**
 * It's FileUploadSC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 20, 2009
 */
public class FileUploadSC extends ServiceCommandSupport{

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param event
	 * @return EventResponse
	 * @throws EventException
	 */
	public EventResponse perform(Event event) throws EventException {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		try{
			if(event.getEventName().equalsIgnoreCase("FileUploadEvent")){
				begin();
				FileUploadEvent fileUploadEvent = (FileUploadEvent)event;
				
				List<String> keys = fileUploadEvent.getKeys();
				eventResponse.setETCData("KEYS", StringUtil.attachStringWithDelimeter(keys,";"));	
				eventResponse.setCustomData("VirusResults", fileUploadEvent.getVirusResults());
				FileUploadBC fileUploadBC = new FileUploadBCImpl();
				fileUploadBC.moveUploadFile(keys, fileUploadEvent.getModuleId());
				commit();
				return eventResponse;
			} else if(event.getEventName().equalsIgnoreCase("FileUploadPopupEvent")){
				FileUploadPopupEvent fileUploadPopupEvent = (FileUploadPopupEvent)event;
				eventResponse.setCustomData("ModuleMetaData", fileUploadPopupEvent.getModuleMetaData());
				eventResponse.setCustomData("ComFileMaxCount", SiteConfigFactory.get("COM.FILE.MAX.COUNT"));
				return eventResponse;
			}
			return null;
		}catch(Exception e){
			throw new EventException("fileupload Error", e);
		}
	}
}
