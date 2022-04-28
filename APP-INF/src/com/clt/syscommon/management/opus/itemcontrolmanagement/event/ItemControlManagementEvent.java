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
package com.clt.syscommon.management.opus.itemcontrolmanagement.event;

import java.util.Arrays;
import java.util.HashMap;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.management.opus.itemcontrolmanagement.vo.ItemControlManagementVO;
import com.clt.syscommon.management.opus.superuser.vo.SuperUserVO;


/**
 * AccessHistory 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  AccessHistoryHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author kyungbum kim
 * @see AccessHistoryHTMLAction 참조
 * @since J2EE 1.6
 */

public class ItemControlManagementEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	private HashMap<String, String> param = null;
	
	private ItemControlManagementVO  itemControlManagementVO = null;
			
	private ItemControlManagementVO[] itemControlManagementVOs = null;

	/**
	 * @return the param
	 */
	public HashMap<String, String> getParam() {
		return param;
	}

	/**
	 * @param param the param to set
	 */
	public void setParam(HashMap<String, String> param) {
		this.param = param;
	}

	/**
	 * @return the itemControlManagementVO
	 */
	public ItemControlManagementVO getItemControlManagementVO() {
		return itemControlManagementVO;
	}

	/**
	 * @param itemControlManagementVO the itemControlManagementVO to set
	 */
	public void setItemControlManagementVO(
			ItemControlManagementVO itemControlManagementVO) {
		this.itemControlManagementVO = itemControlManagementVO;
	}

	/**
	 * @return the itemControlManagementVOs
	 */
	public ItemControlManagementVO[] getItemControlManagementVOs() {
		ItemControlManagementVO[] rtnVOs = null;
		if (this.itemControlManagementVOs != null) {
			rtnVOs = Arrays.copyOf(itemControlManagementVOs, itemControlManagementVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param itemControlManagementVOs the itemControlManagementVOs to set
	 */
	public void setItemControlManagementVOs(
			ItemControlManagementVO[] itemControlManagementVOs) {
		if(itemControlManagementVOs != null){
			ItemControlManagementVO[] tmpVOs = Arrays.copyOf(itemControlManagementVOs, itemControlManagementVOs.length);
			this.itemControlManagementVOs  = tmpVOs;
		}
	}


	
}