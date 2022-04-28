/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ValueManageBC.java
*@FileTitle : OPUS Constants Manager
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.10
*@LastModifier : �〓���
*@LastVersion : 1.0
* 2011.02.10 �〓���
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.bcm.sup.valuemanage.basic;

import java.util.List;

import com.clt.apps.opus.bcm.sup.valuemanage.vo.GroupOfficeListVO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupConstantListVO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupModuleVO;
import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.common.table.MdmOfcGrpVO;

/**
 * OPUS Constants Business Logic Command Interface<br>
 *
 * @author 
 * @see ValueManageBCImpl 참조
 * @since J2EE 1.6
 */
public interface ValueManageBC {

	/**
	 *  PerCodeList 瑜�議고쉶�⑸땲��<br>
	 *  Per Type 肄붾뱶,紐낆묶 瑜�議고쉶�⑸땲��<br>
	 * 
	 * @param MdmOfcGrpVO mdmOfcGrpVO
	 * @return List<GroupOfficeListVO>
	 * @exception EventException
	 */
	public List<GroupOfficeListVO> searchGroupOfficeList(MdmOfcGrpVO mdmOfcGrpVO) throws EventException ;
	
	/**
	 *  �곸닔 愿�━ �뚯씠釉�com_stup_cons���댁슜��議고쉶�⑸땲��br>
	 * 
	 * 
	 * @return List<SetupConstantListVO>
	 * @exception EventException
	 */
	public List<SetupConstantListVO> searchSetupConstantCodeList( ) throws EventException ;	
	/**
	 * 모듈 사용 정보 조회<br>
	 * 
	 * @return List<SetupConstantListVO>
	 * @exception EventException
	 */
	public List<SetupModuleVO> searchSetupModuleList( ) throws EventException ;	
}
