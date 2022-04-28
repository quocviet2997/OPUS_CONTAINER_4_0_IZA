/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_COM_0005Event.java
*@FileTitle : Charge
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-20
*@LastModifier : JunBum Lee
*@LastVersion : 1.0
* 2012-02-20 JunBum Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.daylightsavingtime.event;

import com.clt.bizcommon.daylightsavingtime.vo.DaylightSavingTimeListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0N1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0N1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0005Event extends EventSupport {

	/** Table Value Object 조회 조건 및 단건 처리  */
	private DaylightSavingTimeListVO	daylightSavingTimeListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private DaylightSavingTimeListVO[] daylightSavingTimeListVOs = null;
	
    private int iPage = 0;

	/**
	 * Constructor<br>
	 */
	public ComCom0005Event(){}

	/**
	 * Constructor<br>
	 * @param int iPage
	 */
	public ComCom0005Event(int iPage) {
		this.iPage = iPage;
    }
	
	/**
	 * Page No 반환<br>
	 * @return
	 */
	public int getIPage() {
		return iPage;
	}

	/**
	 * Page No 세팅<br>
	 * @param page
	 */
	public void setIPage(int page) {
		iPage = page;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComCom0005Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComCom0005Event";
	}

	/**
	 * @return the daylightSavingTimeListVO
	 */
	public DaylightSavingTimeListVO getDaylightSavingTimeListVO() {
		return daylightSavingTimeListVO;
	}

	/**
	 * @param daylightSavingTimeListVO the daylightSavingTimeListVO to set
	 */
	public void setDaylightSavingTimeListVO(DaylightSavingTimeListVO daylightSavingTimeListVO) {
		this.daylightSavingTimeListVO = daylightSavingTimeListVO;
	}

	/**
	 * @return the daylightSavingTimeListVOs
	 */
	public DaylightSavingTimeListVO[] getDaylightSavingTimeListVOs() {
		DaylightSavingTimeListVO[] rtnVOs = null;
		if (this.daylightSavingTimeListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(daylightSavingTimeListVOs, daylightSavingTimeListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param daylightSavingTimeListVOs the daylightSavingTimeListVOs to set
	 */
	public void setDaylightSavingTimeListVOs(DaylightSavingTimeListVO[] daylightSavingTimeListVOs){
		if(daylightSavingTimeListVOs != null){
			DaylightSavingTimeListVO[] tmpVOs = java.util.Arrays.copyOf(daylightSavingTimeListVOs, daylightSavingTimeListVOs.length);
			this.daylightSavingTimeListVOs = tmpVOs;
		}
	}

}
