/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_071Event.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.officeprogram.event;

import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.management.opus.officeprogram.vo.SearchComOfcPgmMtchVO;


/**
 * COM_ENS_071 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_071HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyunsu, Ryu
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */public class OfficeProgramEvent extends EventSupport {

    /**
     * Constructor<br>
     */
    public OfficeProgramEvent(){}
    
    public void setSearchComOfcPgmMtchVO(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) {
		this.searchComOfcPgmMtchVO = searchComOfcPgmMtchVO;
	}

	public SearchComOfcPgmMtchVO getSearchComOfcPgmMtchVO() {
		return searchComOfcPgmMtchVO;
	}

	private SearchComOfcPgmMtchVO searchComOfcPgmMtchVO =null;

}
