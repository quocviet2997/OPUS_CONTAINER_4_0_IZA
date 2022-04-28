/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BookmarkmanagementEvent.java
*@FileTitle : BookMark Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.09
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.09 정인선
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.bookmark.event;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComBookmarkVO;


/**
 * Bookmarkmanagement 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BookmarkmanagementHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung_InSun
 * @see BookmarkManagementHTMLAction 참조
 * @since J2EE 1.4
 */

public class BookmarkManagementEvent extends EventSupport {

	/** com_user Table  Value Object */
	private ComBookmarkVO combookmark = null;
	
	/** com_users Multi Action을 위한 Collection */
	private ComBookmarkVO[] combookmarks = null;

	/**
	 * BookmarkManagementEvent 객체 생성<br>
	 */
	public BookmarkManagementEvent(){}

	/**
	 * BookmarkManagementEvent 객체 생성<br>
	 * @param combookmark ComBookmark 북마크 객체
	 */
	public BookmarkManagementEvent(ComBookmarkVO combookmark) {
		this.combookmark = combookmark;
    }

	/**
	 * BookmarkManagementEvent 객체 생성<br>
	 * @param combookmark ComBookmark 북마크 객체
	 * @param combookmarks Collection<ComBookmark> 북마크 객체 리스트 
	 */
	public BookmarkManagementEvent(ComBookmarkVO combookmark, ComBookmarkVO[] combookmarks) {
		this.combookmark = combookmark;
		this.combookmarks = combookmarks;
    }

	/**
	 * 즐겨찾기 VO객체를 반환한다.<br>
	 * @return ComBookmark
	 */
	public ComBookmarkVO getComBookmark(){
		return combookmark;
	}

	/**
	 * 즐겨찾기 VO객체 리스트를 반환한다.<br>
	 * @return Collection<ComBookmark>
	 */
	public ComBookmarkVO[] getComBookmarkS(){
		ComBookmarkVO[] rtnVOs = null;
		if (this.combookmarks != null) {
			rtnVOs = Arrays.copyOf(combookmarks, combookmarks.length);
		}
		return rtnVOs;
	}
	
	public void setComBookmarkS(ComBookmarkVO[] combookmarks) {
		if(combookmarks != null){
			ComBookmarkVO[] tmpVOs = Arrays.copyOf(combookmarks, combookmarks.length);
			this.combookmarks  = tmpVOs;
		}
	}

	

}
