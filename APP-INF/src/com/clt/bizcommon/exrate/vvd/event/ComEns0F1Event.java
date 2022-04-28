/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0E1Event.java
*@FileTitle : Monthly
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-24
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-24 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.exrate.vvd.event;

import com.clt.bizcommon.exrate.vvd.vo.VVDListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;



/**
 * COM_ENS_0F1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0F1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0F1Event extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private VVDListVO	vvdListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private VVDListVO[] vvdListVOs = null;
	
	private int iPage = 0;
		
	/**
	 * Constructor<br>
	 */
	public ComEns0F1Event(){}
	
	/**
	 * Constructor<br>
	 * @param iPage
	 */
	public ComEns0F1Event(int iPage) {
		this.iPage = iPage;
	}

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns0F1Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0F1Event";
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
	 * @return the vvdListVO
	 */
	public VVDListVO getVvdListVO() {
		return vvdListVO;
	}

	/**
	 * @param vvdListVO the vvdListVO to set
	 */
	public void setVvdListVO(VVDListVO vvdListVO) {
		this.vvdListVO = vvdListVO;
	}

	/**
	 * @return the vvdListVOs
	 */
	public VVDListVO[] getVvdListVOs() {
		VVDListVO[] rtnVOs = null;
		if (this.vvdListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(vvdListVOs, vvdListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param vvdListVOs the vvdListVOs to set
	 */
	public void setVvdListVOs(VVDListVO[] vvdListVOs) {
		if(vvdListVOs != null){
			VVDListVO[] tmpVOs = java.util.Arrays.copyOf(vvdListVOs, vvdListVOs.length);
			this.vvdListVOs = tmpVOs;
		}
	}

}
