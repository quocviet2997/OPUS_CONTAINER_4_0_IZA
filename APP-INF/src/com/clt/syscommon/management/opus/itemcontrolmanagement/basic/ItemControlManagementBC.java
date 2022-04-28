/*=========================================================
 *Copyright(c) 2008 CyberLogitec
 *@FileName : ItemControlManagementDBDAO.java
 *@FileTitle : Item Control Management
 *Open Issues :
 *Change history :
 *@LastModifyDate : 2013.06.28
 *@LastModifier : 경종윤
 *@LastVersion : 1.0
 * 2013.06.28 경종윤 
 * 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.itemcontrolmanagement.basic;

import java.util.HashMap;
import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.management.opus.itemcontrolmanagement.vo.ItemControlManagementVO;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;


/**
 * NIS2010-SuperUsermanagement Business Logic Command Interface<br>
 * - NIS2010-SuperUsermanagement에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author KyungBum Kim
 * @see SuperUsermanagementEventResponse 참조
 * @since J2EE 1.4
 */

public interface ItemControlManagementBC {

	/**
	 * 조회 이벤트 처리<br>
	 * 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @return String[]
	 * @exception EventException
	 */
	public String[] searchSubSystemList() throws EventException ;
	
	/**
	 * 조회 이벤트 처리<br>
	 * Item Control Mangement 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ItemControlManagementVO itemControlManagementVO
	 * @return List<ItemControlManagementVO>
	 * @exception EventException
	 */
	public List<ItemControlManagementVO> searchItemControlList(ItemControlManagementVO itemControlManagementVO) throws EventException;
	/**
	 * 조회 이벤트 처리<br>
	 * Item Control Mangement 화면에 대한 조회 이벤트 처리<br>
	 * 
	 * @param ItemControlManagementVO itemControlManagementVO
	 * @return List<ItemControlManagementVO>
	 * @exception EventException
	 */
	public List<ItemControlManagementVO> searchUiSetUpInfo(ItemControlManagementVO itemControlManagementVO) throws EventException;
	/**
	 * 
	 * manageItemControlList
	 * @author KyungBum Kim
	 * @param vos
	 * @param account
	 * @throws EventException void
	 */
	public void manageItemControlList(ItemControlManagementVO[] vos, SignOnUserAccount account) throws EventException;
}