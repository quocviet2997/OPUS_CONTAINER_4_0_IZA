/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CargoRlseMailSendVO.java
*@FileTitle : CargoRlseMailSendVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 손윤석
*@LastVersion : 1.0
* 2009.07.28 손윤석 
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.common.table;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.clt.framework.component.common.AbstractValueObject;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 손윤석
 * @since J2EE 1.5
 * @see ESM_BKG_0272HTMLAction
 */

public class BkgListForFullReleaseVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
//	private Collection<FullCntrRlseOrderMailSendVO> models = new ArrayList<FullCntrRlseOrderMailSendVO>();

	private BkgFullCgoRlseOrdVO fullCntrRlseOrderListVO = null;
//	private FullCntrRlseOrderMailSendVO cargoRlseMailSendVO = null;
	
	public BkgListForFullReleaseVO(){
	}

	
	@Override
	public HashMap<String, String> getColumnValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, String> getFieldNames() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @return the fullCntrRlseOrderListVO
	 */
	public BkgFullCgoRlseOrdVO getFullCntrRlseOrderListVO() {
		return fullCntrRlseOrderListVO;
	}


	/**
	 * @param fullCntrRlseOrderListVO the fullCntrRlseOrderListVO to set
	 */
	public void setFullCntrRlseOrderListVO(
			BkgFullCgoRlseOrdVO fullCntrRlseOrderListVO) {
		this.fullCntrRlseOrderListVO = fullCntrRlseOrderListVO;
	}


	/**
	 * @return the cargoRlseMailSendVO
	 */
//	public FullCntrRlseOrderMailSendVO getCargoRlseMailSendVO() {
//		return cargoRlseMailSendVO;
//	}


	/**
	 * @param cargoRlseMailSendVO the cargoRlseMailSendVO to set
	 */
//	public void setCargoRlseMailSendVO(FullCntrRlseOrderMailSendVO cargoRlseMailSendVO) {
//		this.cargoRlseMailSendVO = cargoRlseMailSendVO;
//	}
	
	
}