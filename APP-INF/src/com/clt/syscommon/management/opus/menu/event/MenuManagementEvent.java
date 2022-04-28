/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MenuManagementEvent.java
*@FileTitle : Menu Management
*Open Issues :
*Change history :
*@LastModifyDate : 2009.03.04
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.03.04 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.menu.event;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComMnuCfgVO;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.management.opus.faxmanagement.vo.FaxMgmtCondVO;
import com.clt.syscommon.management.opus.itemcontrolmanagement.vo.ItemControlManagementVO;


/**
 * MenuManagement 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  MenuManagementHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author KyungBum Kim
 * @see MenuManagementHTMLAction 참조
 * @since J2EE 1.4
 */

public class MenuManagementEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> voMap = new HashMap<String, Object>();
	
	/** com_user Table  Value Object */
	private ComMnuCfgVO commnucfgvo = null;
	private ComProgramVO comprogramvo = null;
	
	/** com_users Multi Action을 위한 Collection */
	private ComMnuCfgVO[] commnucfgvos = null;

	public MenuManagementEvent(){}
	
	public void setComMnuCfgVO(ComMnuCfgVO commnucfgvo){
		this. commnucfgvo = commnucfgvo;
	}

	public void setComProgramVO(ComProgramVO comprogramvo){
		this. comprogramvo = comprogramvo;
	}

	public void setComMnuCfgVOS(ComMnuCfgVO[] commnucfgvos){
		if(commnucfgvos != null){
			ComMnuCfgVO[] tmpVOs = Arrays.copyOf(commnucfgvos, commnucfgvos.length);
			this.commnucfgvos  = tmpVOs;
		}
	}


	public ComMnuCfgVO getComMnuCfgVO(){
		return commnucfgvo;
	}

	public ComProgramVO getComProgramVO(){
		return comprogramvo;
	}

	public ComMnuCfgVO[] getComMnuCfgVOS(){
		ComMnuCfgVO[] rtnVOs = null;
		if (this.commnucfgvos != null) {
			rtnVOs = Arrays.copyOf(commnucfgvos, commnucfgvos.length);
		}
		return rtnVOs;
	}

	public void setVO(String key, Object vo){
		voMap.put(key, vo);
	}
	
	public Object getVO(String key){
		return voMap.get(key);
	}
}