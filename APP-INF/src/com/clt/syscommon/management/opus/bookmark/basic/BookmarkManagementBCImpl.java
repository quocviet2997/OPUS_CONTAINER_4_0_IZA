/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkManagementBCImpl.java
*@FileTitle : BookMark Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.09
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009.01.09 Seungyol Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.bookmark.basic;

import java.util.ArrayList;
import java.util.List;

import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.table.ComBookmarkVO;
import com.clt.syscommon.management.opus.bookmark.integration.BookmarkManagementDBDAO;
import com.clt.syscommon.management.opus.bookmark.vo.BookmarkListVO;


/**
 * NIS2010-Bookmark Business Logic Basic Command implementation<br>
 * - NIS2010-Bookmark에 대한 비지니스 로직을 처리한다.<br>
 *
 * @author Seungyol Lee
 * @see BookmarkManagementBC  및 각 DAO 클래스 참조
 * @since J2EE 1.4
 */

public class BookmarkManagementBCImpl extends BasicCommandSupport implements BookmarkManagementBC {

	// Database Access Object
	private transient BookmarkManagementDBDAO dbDao = null;

	/**
	 * BookmarkManagementBCImpl 객체 생성<br>
	 * BookmarkManagementDBDAO를 생성한다.<br>
	 */
	public BookmarkManagementBCImpl() {
		dbDao = new BookmarkManagementDBDAO();
	}
	/**
	 * 즐겨찾기 조회 이벤트 처리<br>
	 *  BookMark Management에 대한 조회 이벤트 처리<br>
	 * 
	 * @param String usrId 사용자 ID
	 * @return List<BookmarkListVO> 즐겨찾기 리스트 
	 * @exception EventException
	 */
	public List<BookmarkListVO> searchBookmark(String usrId) throws EventException {
		try {
			List<BookmarkListVO> searchComUsrRoleVOs = dbDao.searchBookmark(usrId);			
			List<BookmarkListVO> returnComUsrRoleVos = checkRole(usrId, searchComUsrRoleVOs);
			return returnComUsrRoleVos;
		} catch (Exception ex) {
			log.error(ex.getMessage(),ex);
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
	}
	
	/**
	 * 
	 * checkRole
	 * @author Jeong-Hoon, KIM
	 * @param usrId
	 * @param searchComUsrRoleVOs
	 * @return
	 * @throws DAOException List<BookmarkListVO>
	 */
	private List<BookmarkListVO> checkRole(String usrId, List<BookmarkListVO> searchComUsrRoleVOs) throws DAOException {
		List<BookmarkListVO> returnComUsrRoleVos = new ArrayList<BookmarkListVO>();
		
		for(BookmarkListVO searchComUsrRoleVO : searchComUsrRoleVOs){
			String pgmNo = searchComUsrRoleVO.getPgmNo();
			String checkCount = dbDao.checkRole(pgmNo, usrId);
			if(!"0".equals(checkCount)){
				returnComUsrRoleVos.add(searchComUsrRoleVO);
			}
		}
		return returnComUsrRoleVos;
	}


	/**
	 * 즐겨찾기 저장 이벤트 처리<br>
	 * BookMark Management에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param String usrId		Event에 담겨진  Form의 변경된 VO객체들의 List
	 * @param ComBookmarkVO[] bookmarks
	 * @return List<BookmarkListVO> 즐겨찾기 리스트 
	 * @exception EventException
	 */
	public List<BookmarkListVO> multiBookmark(String usrId,ComBookmarkVO[] bookmarks) throws EventException {
		try {
			List<ComBookmarkVO> insComBookmarkVOs =new ArrayList<ComBookmarkVO>();
			List<ComBookmarkVO> updComBookmarkVOs =new ArrayList<ComBookmarkVO>();
			List<ComBookmarkVO> delComBookmarkVOs =new ArrayList<ComBookmarkVO>();

			int cnt = bookmarks.length;
			
			for(int i=0;i<cnt; i++){
				if (bookmarks[i].getIbflag().equals("I")) {
					insComBookmarkVOs.add(bookmarks[i]);
				}else if (bookmarks[i].getIbflag().equals("U")) {
					updComBookmarkVOs.add(bookmarks[i]);
				} else if (bookmarks[i].getIbflag().equals("D")) {
					delComBookmarkVOs.add(bookmarks[i]);
				}
			}
			if(insComBookmarkVOs.size()>0){
				for (int i = 0; i < insComBookmarkVOs.size(); i++) {
					dbDao.addBookmarks(insComBookmarkVOs.get(i));
				}
			}
			if(updComBookmarkVOs.size()>0){
				dbDao.modifyBookmarks(updComBookmarkVOs);	
			}
			if(delComBookmarkVOs.size()>0){
				dbDao.removeBookmarks(delComBookmarkVOs);	
			}

			List<BookmarkListVO> bookmarkListVO = dbDao.searchBookmark(usrId);
			return bookmarkListVO;

		} catch (DAOException de) {
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
	/**
	 * 즐겨찾기폴더 리스트 조회 <br>
	 * 
	 * @param String usrId		사용자 ID
	 * @return List<BookmarkListVO> 즐겨찾기폴더 리스트 
	 * @exception EventException
	 */		
	public List<BookmarkListVO> searchBookmarkFolders(String usrId) throws EventException{
		List<BookmarkListVO> voList = null;
		try{
			voList = dbDao.searchBookmarkFolderList(usrId);
		} catch (DAOException de) {
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
		
		return voList;
	}

	/**
	 * 즐겨찾기 생성 처리<br>
	 * 
	 * @param ComBookmarkVO bookmark		즐겨찾기 정보 
	 * @exception EventException
	 */	
	public void createBookmark(ComBookmarkVO bookmark)	throws EventException {
		try {
//			if(bookmark.getPrntPgmNo().equals("")){
//				if(bookmark.getPgmNo().equals("")){
//					dbDao.addDefaultFolder(bookmark.getUsrId(),bookmark.getPgmNo(),bookmark.getDpNm());
//				}
//				dbDao.addBookmark(bookmark.getUsrId(),bookmark.getPgmNo(),bookmark.getDpNm(),"");
//			}else{
				dbDao.addBookmark(bookmark.getUsrId(),bookmark.getPgmNo(),bookmark.getDpNm(),bookmark.getPrntPgmNo());
//			}
		} catch (DAOException de) {
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}
	}
	
	/**
	 * 즐겨찾기 삭제 처리<br>
	 * 
	 * @param ComBookmarkVO bookmark		즐겨찾기 정보 
	 * @exception 
	 */	
	public void removeBookmark(ComBookmarkVO bookmark) throws EventException {
		try {
			dbDao.removeBookmark(bookmark.getUsrId(),bookmark.getPgmNo());
		} catch (DAOException de) {
			throw new EventException(de.getMessage());
		} catch (Exception de) {
			log.error("err " + de.toString(), de);
			throw new EventException(de.getMessage());
		}	
	}
}
