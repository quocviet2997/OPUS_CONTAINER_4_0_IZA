/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ValueManageBCImpl.java
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

import com.clt.apps.opus.bcm.sup.valuemanage.integration.ValueManageDBDAO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.GroupOfficeListVO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupConstantListVO;
import com.clt.apps.opus.bcm.sup.valuemanage.vo.SetupModuleVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.syscommon.common.table.MdmOfcGrpVO;
/**
 * OPUS Constants Business Logic Command Interface<br>
 * - OPUS Constants����븳 鍮꾩��덉뒪 濡쒖쭅����븳 �명꽣�섏씠��br>
 *
 * @author Min Seok Song
 * @see ValueManageBC 媛�DAO �대옒��李몄“
 * @since J2EE 1.6
 */
public class ValueManageBCImpl extends BasicCommandSupport implements ValueManageBC {
	
	// Database Access Object
	private transient ValueManageDBDAO dbDao = null;

	/**
	 * ValueManageBCImpl 媛앹껜 �앹꽦<br>
	 * ValueManageDBDAO瑜��앹꽦�쒕떎.<br>
	 */
	public ValueManageBCImpl() {
		dbDao = new ValueManageDBDAO();
	}
	
	/**
	 *  PerCodeList 瑜�議고쉶�⑸땲��<br>
	 *  Per Type 肄붾뱶,紐낆묶 瑜�議고쉶�⑸땲��<br>
	 * 
	 * @param MdmOfcGrpVO mdmOfcGrpVO
	 * @return List<GroupOfficeListVO>
	 * @exception EventException
	 */
	public List<GroupOfficeListVO> searchGroupOfficeList(MdmOfcGrpVO mdmOfcGrpVO) throws EventException {
		try {
			return dbDao.searchGroupOfficeList(mdmOfcGrpVO);
        } catch (DAOException ex) {
            throw new EventException(new ErrorHandler("PRI00340", new String[]{}).getMessage(), ex);
        } catch (Exception ex) {
            throw new EventException(new ErrorHandler("PRI00340", new String[]{}).getMessage(), ex);
        }
	}		

	/**
	 *  �곸닔 愿�━ �뚯씠釉�com_stup_cons���댁슜��議고쉶�⑸땲��br>
	 * 
	 * 
	 * @return List<SetupConstantListVO>
	 * @exception EventException
	 */
	public List<SetupConstantListVO> searchSetupConstantCodeList( ) throws EventException {
		try {
			return dbDao.searchSetupConstantCodeList();
        } catch (DAOException ex) {
            throw new EventException(new ErrorHandler("PRI00340", new String[]{}).getMessage(), ex);
        } catch (Exception ex) {
            throw new EventException(new ErrorHandler("PRI00340", new String[]{}).getMessage(), ex);
        }
	}
	
	/**
	 * 모듈 사용 정보 조회<br>
	 * 
	 * @return List<SetupConstantListVO>
	 * @exception EventException
	 */
	public List<SetupModuleVO> searchSetupModuleList( ) throws EventException {
		try {
			return dbDao.searchSetupModuleList();
        } catch (DAOException ex) {
            throw new EventException(new ErrorHandler("PRI00340", new String[]{}).getMessage(), ex);
        } catch (Exception ex) {
            throw new EventException(new ErrorHandler("PRI00340", new String[]{}).getMessage(), ex);
        }
	}
	
	
}
