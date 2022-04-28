/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SalesRepBC.java
*@FileTitle : SalesRep
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-21
*@LastModifier : Kim Yong Jin
*@LastVersion : 1.0
* 2012-02-21 Kim Yong Jin
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.salesrep.event;

import com.clt.bizcommon.salesrep.vo.SalesRepListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_COM_0008 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_COM_0008HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Kim Yong Jin
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0008Event extends EventSupport {

	/** Table Value Object 조회 조건 및 단건 처리  */
	private SalesRepListVO	salesRepListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SalesRepListVO[] salesRepListVOs = null;
	
	/**
	 * Constructor<br>
	 */
	public ComCom0008Event(){}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComCom0008Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComCom0008Event";
	}

	/**
	 * @return the salesRepListVO
	 */
	public SalesRepListVO getSalesRepListVO() {
		return salesRepListVO;
	}

	/**
	 * @param salesRepListVO the salesRepListVO to set
	 */
	public void setSalesRepListVO(SalesRepListVO salesRepListVO) {
		this.salesRepListVO = salesRepListVO;
	}

	/**
	 * @return the salesRepListVOs
	 */
	public SalesRepListVO[] getSalesRepListVOs() {
		SalesRepListVO[] rtnVOs = null;
		if (this.salesRepListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(salesRepListVOs, salesRepListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param salesRepListVOs the salesRepListVOs to set
	 */
	public void setSalesRepListVOs(SalesRepListVO[] salesRepListVOs){
		if(salesRepListVOs != null){
			SalesRepListVO[] tmpVOs = java.util.Arrays.copyOf(salesRepListVOs, salesRepListVOs.length);
			this.salesRepListVOs = tmpVOs;
		}
	}
	
}
