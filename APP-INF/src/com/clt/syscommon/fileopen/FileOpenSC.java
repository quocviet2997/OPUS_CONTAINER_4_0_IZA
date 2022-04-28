/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : 
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.01
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2016.06.01 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.fileopen;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.syscommon.fileopen.basic.FileOpenBC;
import com.clt.syscommon.fileopen.basic.FileOpenBCImpl;
import com.clt.syscommon.fileopen.event.FileOpenEvent;
import com.clt.syscommon.fileopen.vo.FileOpenVO;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public class FileOpenSC extends ServiceCommandSupport {
	
	/** 
	 * EBookingConduct system task scenario finish work<br>
	 * In case of closing ESM_BKG_0228 task scenario , inner object has to be relieved <br>
	 */
	public void doEnd() {}

	/**
	 * EBookingConduct system's task scenario prework<br>
	 * in case of calling ESM_BKG_0228 task scenario, inner object creating<br>
	 */
	public void doStart() {}

	/**
     * @param e Event
     * @return response EventResponse
     * @exception EventException
     */
	@Override
	public EventResponse perform(Event e) throws EventException {
		EventResponse eventResponse = null;
		if (e.getEventName().equalsIgnoreCase("FileOpenEvent")) { 
			if (e.getFormCommand().isCommand(FormCommand.DEFAULT)) { 
				eventResponse = fileOpen(e);
			}
		}
		return eventResponse;
	}

	/**
	 * 
	 * @param e
	 * @return
	 */
	private EventResponse fileOpen(Event e) {
		GeneralEventResponse eventResponse = new GeneralEventResponse();
		FileOpenEvent event = (FileOpenEvent)e;
		FileOpenVO vo = event.getFileOpen();
		FileOpenBC command = new FileOpenBCImpl();
		String permType = vo.getPermType();
		String serid = vo.getSerId();
		String docid = vo.getDocId();
		String bkgNo = vo.getBkgNo();
		String seq = vo.getSeq();
		String authDt = vo.getAuthdt();
		String count = vo.getCount();
		String retVal = "RetVal=0&Error=is an unknown request.";
		
		if(permType != null && !permType.equals("")){
			try{
				Object oblPrnDt = command.searchOblPrintFlg(bkgNo, seq);
				
				if(permType!=null && permType.equals("Setting")){
					retVal = "RetVal=1&ServId=";
				}else if(permType!=null && permType.equals("DocPerm")){
					int diffOfDate = 0;
					if(null != authDt && !authDt.isEmpty() && !authDt.equals(""))
						diffOfDate = diffOfDate(authDt, getFormatCurrentTime("yyyyMMdd"), "yyyyMMdd");
					if(diffOfDate > 13){
						retVal = "RetVal=0&Error=Original BL that has not been printed after 14 days from the request date, would not be able to print anymore";
					}else{
						retVal = procDocPerm(serid, docid, oblPrnDt);
					}
				}else if(permType!=null && permType.equals("PrintPerm")){
					
					if(oblPrnDt == null){
		        		/* 프린트 count는 무조건 1부씩 */
		        		if(!count.equalsIgnoreCase("1")){
		        			retVal =  "RetVal=0&Error=An unexpected error occurred while processiog this B/L PDF. \n\nUser requested multiple copies for print. Only one copy of this B/L set may be printed.";
		        		}else{
		        			int result = command.updateOblPrintFlg(bkgNo, seq);
		        			if(result <= 0) retVal = "RetVal=0&Error=An unexpected error occurred while processiog this B/L PDF. \n\nThe B/L PDF has already been printed.";
		        			else retVal = "RetVal=1&ServId=" + serid + "&DocuId=" + docid + "&Perms=3&PrintFlags=0";
		        		}
		    		 }else{
		    			 retVal = "RetVal=0&Error=An unexpected error occurred while processiog this B/L PDF. \n\nThe B/L PDF has already been printed.";
		    		 }
					log.error("\nFileOpen PrintPerm : " + retVal);
				}
				eventResponse.setETCData("msg", retVal);
			}catch(Exception ex){
				eventResponse.setETCData("msg", "RetVal=0&Error=" + ex.getMessage());
				log.error(ex);
			}
		}
		return eventResponse;
	}
	
	/**
	 * 
	 * @param serid
	 * @param docid
	 * @param oblPrnDt
	 * @return
	 * @throws Exception
	 */
	private String procDocPerm(String serid, String docid, Object oblPrnDt) throws Exception {
        String code = "";
        String retVal = "";
        int perms = 0;
        int popen = 1;
        int pprnt = 4;
       try{
    	   if (serid.equals("C-ABC")) {
               code = "abcde";
               /* 프린트 하기전 */
               if (oblPrnDt == null) perms = popen + pprnt;
               
               /* 프린트 하고 난후 */
               else perms = popen;
           }
           retVal = "RetVal=1&ServId=" + serid + "&DocuId=" + docid + "&Perms=" + perms + "&Code=" + code + "&BlockScreenShot=true";
       }catch(Exception e){
    	   log.error(e);
    	   throw e;
       }
       return retVal;
    }
	
	/**
	 * 
	 * @param begin
	 * @param end
	 * @param format
	 * @return
	 * @throws Exception
	 */
	private int diffOfDate(String begin, String end, String format) throws Exception{
		SimpleDateFormat formatter = new SimpleDateFormat(format);
	    Date beginDate = formatter.parse(begin);
	    Date endDate = formatter.parse(end);
	    long diff = endDate.getTime() - beginDate.getTime();
	    long diffDays = diff / (24 * 60 * 60 * 1000);
	    return (int) diffDays;
	}
	
	/**
	 * 
	 * @param format
	 * @return
	 */
	private static String getFormatCurrentTime(String format) {
		String ymdhms = (new SimpleDateFormat(format, Locale.ENGLISH)).format(new Date());
		return ymdhms;
	}
}
