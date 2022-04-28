/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AccesshistoryEvent.java
*@FileTitle : AccessHistory
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.01
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2010.02.01 김경범
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.superuser.event;

import java.util.Arrays;
import java.util.HashMap;

import com.clt.framework.support.layer.event.EventSupport;
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

public class SuperUserEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	private HashMap<String, String> param = null;
	
	private SuperUserVO[] vos = null;

	public SuperUserEvent(){
		param = new HashMap<String, String>();
	}
	
	public void setParam(String key, String value){
		param.put(key, value);
	}
	
	public HashMap<String, String> getParam() {
		return param;
	}

	public void setVos(SuperUserVO[] vos) {
		if(vos != null){
			SuperUserVO[] tmpVOs = Arrays.copyOf(vos, vos.length);
			this.vos  = tmpVOs;
		}
	}

	public SuperUserVO[] getVos() {
		SuperUserVO[] rtnVOs = null;
		if (this.vos != null) {
			rtnVOs = Arrays.copyOf(vos, vos.length);
		}
		return rtnVOs;
	}
	
}