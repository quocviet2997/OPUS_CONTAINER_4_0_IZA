/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CntrTypeBC.java
*@FileTitle : CntrType
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-15
*@LastModifier : 민정호
*@LastVersion : 1.0
* 2012-02-15 민정호
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.cntrtype.basic;

import java.util.List;
import com.clt.framework.core.layer.event.EventException;
import com.clt.bizcommon.cntrtype.vo.MdmCntrTpListVO;


/**
 * eNIS-BIZCOMMON Business Logic Command Interface<br>
 * - eNIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Hyung Choon_Roh
 * @see ComEns0N1EventResponse 참조
 * @since J2EE 1.4
 */
public interface CntrTypeBC  {
	
	/**
	 * 조회 이벤트 처리<br>
	 * Container Type Code Pop-up화면에 대한 조회 이벤트 처리<br>
	 * @param MdmCntrTpListVO mdmCntrTpListVO
	 * @return List<MdmCntrTpListVO>
	 * @exception EventException
	 */
	public List<MdmCntrTpListVO> searchMdmCntrTpList(MdmCntrTpListVO mdmCntrTpListVO) throws EventException;
	


}