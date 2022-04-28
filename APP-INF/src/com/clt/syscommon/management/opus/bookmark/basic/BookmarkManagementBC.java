/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkManagementBC.java
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

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.ComBookmarkVO;
import com.clt.syscommon.management.opus.bookmark.vo.BookmarkListVO;

import java.util.List;

/**
 * NIS2010-Bookmark Business Logic Command Interface<br>
 * - NIS2010-Bookmark에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jung_InSun
 * @see BookmarkmanagementEventResponse 참조
 * @since J2EE 1.4
 */

public interface BookmarkManagementBC {
	/**
	 * 즐겨찾기 조회 이벤트 처리<br>
	 *  BookMark Management에 대한 조회 이벤트 처리<br>
	 * 
	 * @param usrId String 사용자 ID
	 * @return List<BookmarkListVO> 즐겨찾기 리스트
	 * @exception EventException
	 */
	public List<BookmarkListVO> searchBookmark(String usrId) throws EventException;
	
	/**
	 * 즐겨찾기 저장 이벤트 처리<br>
	 * BookMark Management에 대한 멀티 이벤트 처리<br>
	 * 
	 * @param String usrId		Event에 담겨진  Form의 변경된 VO객체들의 List
	 * @param ComBookmarkVO[] bookmarks
	 * @return List<BookmarkListVO> 즐겨찾기 리스트 
	 * @exception EventException
	 */
	public List<BookmarkListVO> multiBookmark(String usrId, ComBookmarkVO[] bookmarks) throws EventException;
	/**
	 * 즐겨찾기폴더 리스트 조회 <br>
	 * 
	 * @param String usrId		사용자 ID
	 * @return List<BookmarkListVO> 즐겨찾기폴더 리스트 
	 * @exception EventException
	 */			
	public List<BookmarkListVO> searchBookmarkFolders(String usrId) throws EventException;
	/**
	 * 즐겨찾기 생성 처리<br>
	 * 
	 * @param ComBookmarkVO bookmark		즐겨찾기 정보 
	 * @exception EventException
	 */		
	public void createBookmark(ComBookmarkVO bookmark) throws EventException;
	/**
	 * 즐겨찾기 삭제 처리<br>
	 * 
	 * @param ComBookmarkVO bookmark		즐겨찾기 정보 
	 * @exception 
	 */		
	public void removeBookmark(ComBookmarkVO bookmark) throws EventException;
}
