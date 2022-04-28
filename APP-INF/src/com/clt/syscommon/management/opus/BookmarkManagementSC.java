/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkManagementSC.java
*@FileTitle : BookMark Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.09
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009.01.09 Seungyol Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus;

import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.event.Event;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.event.EventResponse;
import com.clt.framework.core.layer.event.GeneralEventResponse;
import com.clt.framework.support.controller.html.FormCommand;
import com.clt.framework.support.layer.service.ServiceCommandSupport;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComBookmarkVO;
import com.clt.syscommon.management.opus.bookmark.basic.BookmarkManagementBC;
import com.clt.syscommon.management.opus.bookmark.basic.BookmarkManagementBCImpl;
import com.clt.syscommon.management.opus.bookmark.event.BookmarkManagementEvent;
import com.clt.syscommon.management.opus.bookmark.vo.BookmarkListVO;

/**
 * NIS2010-Bookmark Business Logic ServiceCommand
 * - NIS2010-Bookmark에 대한 비지니스 트랜잭션을 처리한다.
 *
 * @author Seungyol Lee
 * @see BookmarkManagementBC, BookmarkManagementBCImpl
 * @since J2EE 1.4
 */
public class BookmarkManagementSC extends ServiceCommandSupport {
	// Login User Information
	private SignOnUserAccount account = null;

	/**
	 * Bookmark system 업무 시나리오 선행작업<br>
	 * Bookmarkmanagement업무 시나리오 호출시 관련 내부객체 생성<br>
	 */
	public void doStart() {
		try {
			// 일단 comment --> 로그인 체크 부분
			account = getSignOnUserAccount();
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
	}

	/**
	 * Bookmark system 업무 시나리오 마감작업<br>
	 * Bookmarkmanagement업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		log.debug("BookmarkSC 종료");
	}

	/**
	 * 각 이벤트에 해당하는 업무 시나리오 수행<br>
	 * NIS2010-Bookmark system 업무에서 발생하는 모든 이벤트의 분기처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	public EventResponse perform(Event e) throws EventException {
		// RDTO(Data Transfer Object including Parameters)
		EventResponse eventResponse = null;
		log.debug("JSPUtil.getKST="+JSPUtil.getKST("yyyy-MM-dd"));

//		CodeUtil util =   CodeUtil.getInstance();
//		log.debug(util.getCodeSelect("", 1));
//		log.debug(util.getCodeSelect("CD00651", 1));

		//Combo 생성용 샘플 
//		log.debug(JSPUtil.getIBCodeCombo("tagname","","CD00613",1,""));
//		log.debug(JSPUtil.getCodeCombo("tagname", "", "", "CD00613", 1, ""));
		
		/*		다건의 코드리스트 조회하는 샘플 
		List codes = new ArrayList();
		codes.add(new String[]{"CD00126",CodeUtil.SORT_BY_KEY});
		codes.add(new String[]{"CD00673",CodeUtil.SORT_BY_NAME});
		codes.add(new String[]{"CD00169",CodeUtil.SORT_BY_DPSEQ});
		
		Map<String, Collection> multiList = CodeUtil.getInstance().getMultiCodeSelect(codes);
		
		Collection<CodeInfo> code1 = multiList.get("CD00126");
		Collection<CodeInfo> code2 = multiList.get("CD00673");
		Collection<CodeInfo> code3 = multiList.get("CD00169");
		
		CodeInfo[] codeInfo1 = code1.toArray(new CodeInfo[code1.size()]);
		CodeInfo[] codeInfo2 = code2.toArray(new CodeInfo[code2.size()]);
		CodeInfo[] codeInfo3 = code3.toArray(new CodeInfo[code3.size()]);
		
		for(int i=0;i<codeInfo1.length;i++){
			log.debug("Code1:" + codeInfo1[i].getCode() + ",Name:" + codeInfo1[i].getName());
		}

		for(int i=0;i<codeInfo2.length;i++){
			log.debug("Code2:" + codeInfo2[i].getCode() + ",Name:" + codeInfo2[i].getName());
		}

		for(int i=0;i<codeInfo3.length;i++){
			log.debug("Code3:" + codeInfo3[i].getCode() + ",Name:" + codeInfo3[i].getName());
		}
		*/
		
		// SC가 여러 이벤트를 처리하는 경우 사용해야 할 부분
		if (e.getEventName().equalsIgnoreCase("BookmarkManagementEvent")) {
			if (e.getFormCommand().isCommand(FormCommand.MULTI)) {
				eventResponse = multiBookmark(e);
			}else if(e.getFormCommand().isCommand(FormCommand.SEARCH)) {
				eventResponse = searchBookmark();
			}else if(e.getFormCommand().isCommand(FormCommand.SEARCH01)){
				eventResponse  = searchBookmarkFolders(e);
			}else if(e.getFormCommand().isCommand(FormCommand.ADD)){
				eventResponse  = createBookmark(e);
			}else if(e.getFormCommand().isCommand(FormCommand.REMOVE)){
				eventResponse  = removeBookmark(e);
			}

		}
		return eventResponse;
	}
	
	private EventResponse searchBookmarkFolders(Event e) throws EventException{
		try {
			BookmarkManagementEvent event =(BookmarkManagementEvent)e; 
			String usrId = account.getUsr_id();
			BookmarkManagementBC command = new BookmarkManagementBCImpl();
			List<BookmarkListVO> voList = command.searchBookmarkFolders(usrId);

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(voList);
			eventResponse.setCustomData("sel_pgm_no",event.getAttribute("sel_pgm_no"));
			eventResponse.setCustomData("sel_dp_nm",event.getAttribute("sel_dp_nm"));
			eventResponse.setCustomData("sel_prnt_pgm_no",event.getAttribute("sel_prnt_pgm_no"));
			
			log.debug("**searchBookmarkFolders : sel_prnt_pgm_no=" + eventResponse.getCustomData("sel_prnt_pgm_no"));
			
			return eventResponse;

			
		} catch (EventException de) {
			throw new EventException(new ErrorHandler(de).getMessage());
		}
		
	}
	/**
	 * 조회 이벤트 처리<br>
	 * BookmarkManagementEvent에   대한 조회 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse searchBookmark() throws EventException {
		
		try {
			String usrId = account.getUsr_id();
			/*log.debug("account.getFax_no()="+account.getFax_no());
			log.debug("account.getRhq_ofc_cd()="+account.getRhq_ofc_cd());
			log.debug("account.getXtn_phn_no()="+account.getXtn_phn_no());
			log.debug("account.getMphn_no()="+account.getMphn_no());*/
			
			BookmarkManagementBC command = new BookmarkManagementBCImpl();

//			Map<String, Object> responseData =null;
			List<BookmarkListVO> bookmarksList = command.searchBookmark(usrId);
//
//			DBRowSet rs1 = command.searchBookmark1(usrId);
//			DBRowSet rs2 = command.searchBookmark1(usrId);
//			DBRowSet rs3 = command.searchBookmark1(usrId);
//			DBRowSet rs4 = command.searchBookmark1(usrId);
//			List rsList = new ArrayList();
//			rsList.add(rs1);
//			rsList.add(rs2);
//
//			List rsList1 = new ArrayList();
//			rsList1.add(rs3);
//			rsList1.add(rs4);

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(bookmarksList);
//			eventResponse.setRsList(rsList);
//			eventResponse.setRsVoList((List)responseData.get("volist1"));
//			eventResponse.setRsList(rsList1);
//			eventResponse.setUserMessage(new ErrorHandler("COM0001").getUserMessage());
//			MailSender sender =new MailSender();
//			ComEmlSndInfoVO comEmlSndInfoVO = new ComEmlSndInfoVO();
//			comEmlSndInfoVO.setSndrEml("test email");
//			comEmlSndInfoVO.setRcvrEml("seungyol@korea.com");
//			comEmlSndInfoVO.setEmlTitNm("EMAIL TITLE");
//			comEmlSndInfoVO.setEmlCtnt("test ctnt");
//			comEmlSndInfoVO.setEmlSndNo("1236842304158COM");
//			
//			sender.send(comEmlSndInfoVO);
			return eventResponse;

			
		} catch (EventException de) {
			throw new EventException(new ErrorHandler(de).getMessage());
		}
	}
	

	/**
	 * 멀티 이벤트 처리<br>
	 * BookmarkManagementEvent에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param e Event
	 * @return response EventResponse
	 * @exception EventException
	 */
	private EventResponse multiBookmark(Event e) throws EventException {
		//사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		BookmarkManagementEvent event = (BookmarkManagementEvent)e;
		String usrId = account.getUsr_id();
		
		try {
			ComBookmarkVO[] bookmarks = event.getComBookmarkS();
			if(bookmarks==null || bookmarks.length==0){
				throw new RuntimeException("There is no bookmark to save!");
			}
			
			begin();
			BookmarkManagementBC command = new BookmarkManagementBCImpl();

			List<BookmarkListVO> bookmarkListVO = command.multiBookmark(usrId,bookmarks);

			GeneralEventResponse eventResponse = new GeneralEventResponse();
			
			eventResponse.setRsVoList(bookmarkListVO);
			commit();
			return eventResponse;
		} catch (EventException de) {
			rollback();
			throw new EventException(new ErrorHandler(de).getMessage());
		}
	}

	private EventResponse createBookmark(Event e) throws EventException {
		//사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		BookmarkManagementEvent event = (BookmarkManagementEvent)e;
		
		try {
			ComBookmarkVO[] bookmarks = event.getComBookmarkS();
			if(bookmarks==null || bookmarks.length==0){
				throw new RuntimeException("There is no bookmark to save!");
			}
			
			begin();
			BookmarkManagementBC command = new BookmarkManagementBCImpl();

			command.createBookmark(bookmarks[0]);
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			commit();
			return eventResponse;
		} catch (EventException de) {
			rollback();
			throw new EventException(new ErrorHandler(de).getMessage());
		}
	}

	private EventResponse removeBookmark(Event e) throws EventException {
		//사용자 요청의 결과(DB Result Set, 객체, 값 등)을 담은 객체
		BookmarkManagementEvent event = (BookmarkManagementEvent)e;
		String usrId = account.getUsr_id();
		
		try {
			ComBookmarkVO[] bookmarks = event.getComBookmarkS();
			if(bookmarks==null || bookmarks.length==0){
				throw new RuntimeException("There is no bookmark to save!");
			}
			
			begin();
			BookmarkManagementBC command = new BookmarkManagementBCImpl();

			List<BookmarkListVO> bookmarkListVO = command.multiBookmark(usrId,bookmarks);
			GeneralEventResponse eventResponse = new GeneralEventResponse();
			eventResponse.setRsVoList(bookmarkListVO);
			commit();
			return eventResponse;
		} catch (EventException de) {
			rollback();
			throw new EventException(new ErrorHandler(de).getMessage());
		}
	}

}
