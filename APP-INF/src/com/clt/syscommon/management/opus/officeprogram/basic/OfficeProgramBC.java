/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : OfficeBC.java
*@FileTitle : Office 조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2006-08-02 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.officeprogram.basic;

import java.util.List;

import com.clt.framework.component.rowset.DBRowSet;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.support.view.signon.SignOnUserAccount;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.management.opus.officeprogram.vo.OfficeProgramListVO;
import com.clt.syscommon.management.opus.officeprogram.vo.SearchComOfcPgmMtchVO;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyunsu, Ryu
 * @see COM_ENS_071EventResponse 참조
 * @since J2EE 1.4
 */
public interface OfficeProgramBC  {
    /**
     * Office 조회 
     * @param SearchComOfcPgmMtchVO searchComOfcPgmMtchVO
     * @return List<OfficeProgramListVO>
     * @throws EventException
     */
	public  List<OfficeProgramListVO> searchOfficeProgramList(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws EventException;
	
    /**
     * Office별 상위 메뉴아래 하위 메뉴리스트를 조회한다.<br>
     * @param pgmNoForm	String 상위메뉴번호
     * @param ofcCd			String 오피스 코드 
     * @return DBRowSet
     * @exception EventException
     */
	public DBRowSet searchSubmenuList(String pgmNoForm, String ofcCd) throws EventException;

//	public DBRowSet searchPivotData(SearchComOfcPgmMtchVO searchComOfcPgmMtchVO) throws EventException;
	
    /**
     * Office별 메뉴리스트를 저장한다.<br>
     * @param models	ComOfcPgmMtchVO[] Office별 메뉴리스트 정보 
     * @param SignOnUserAccount account
     * @exception EventException
     */
	public void multiOfficeProgram(ComOfcPgmMtchVO[] models, SignOnUserAccount account) throws EventException;
}