/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : VendorCodeBCImpl.java
*@FileTitle : Vendor Code Pop-up
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.22
*@LastModifier : 김종호
*@LastVersion : 1.0
* 2012.02.22 김종호
* 1.0 Creation
=========================================================*/
package com.clt.bizcommon.vendorcode.basic;

import java.util.List;
import com.clt.bizcommon.vendorcode.integration.VendorCodeDBDAO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;
import com.clt.bizcommon.vendorcode.vo.SearchVendorCodeVO;

/**
 * ALPS-BizCommon Business Logic Command Interface<br>
 * - ALPS-BizCommon에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Jong-Ho Kim
 * @see COM_COM_0007EventResponse,VendorCodeBC 각 DAO 클래스 참조
 * @since J2EE 1.6
 */
public class VendorCodeBCImpl extends BasicCommandSupport implements VendorCodeBC {

	// Database Access Object
	private transient VendorCodeDBDAO dbDao = null;

	/**
	 * VendorCodeBCImpl 객체 생성<br>
	 * VendorCodeDBDAO를 생성한다.<br>
	 */
	public VendorCodeBCImpl() {
		dbDao = new VendorCodeDBDAO();
	}

	/**
	 * [COM_COM_0007]을 [SEARCH] 합니다.<br>
	 * 
	 * @param SearchVendorCodeVO searchVendorCodeVO
	 * @param int iPage
	 * @return List<SearchVendorCodeVO>
	 * @exception EventException
	 */
	public List<SearchVendorCodeVO> searchVendorCode(SearchVendorCodeVO searchVendorCodeVO, int iPage) throws EventException {
		try {
			return dbDao.searchVendorCode(searchVendorCodeVO, iPage);
		} catch(DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage(),ex);
		}
		
	}
	
}