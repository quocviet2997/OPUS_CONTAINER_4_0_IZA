/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : COM_ENS_0P1Event.java
*@FileTitle : VVDChart
*Open Issues :
*Change history :
*@LastModifyDate : 2006-10-19
*@LastModifier : Hyung Choon_Roh
*@LastVersion : 1.0
* 2006-10-19 Hyung Choon_Roh
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vvdchart.event;

import com.clt.bizcommon.vvdchart.vo.VVDChartListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_ENS_0P1 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_ENS_0P1HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Hyung Choon_Roh
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComEns0P1Event extends EventSupport {
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private VVDChartListVO	vvdChartListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private VVDChartListVO[] vvdChartListVOs = null;
	
	private String scnrId = "";
	private String depth = "";
	private String chkDepth = "";
	
	/**
	 * Constructor<br>
	 * @param scnr_id
	 * @param depth
	 * @param chkDepth
	 */
	public ComEns0P1Event(String scnr_id, String depth, String chkDepth) {
		this.scnrId = scnr_id;
		this.depth = depth;
		this.chkDepth = chkDepth;
	}	

	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComEns0P1Event";
	}
	
	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComEns0P1Event";
	}

	/**
	 * Depth 반환<br>
	 * @return
	 */
	public String getDepth() {
		return depth;
	}

	/**
	 * Depth 세팅<br>
	 * @param depth
	 */
	public void setDepth(String depth) {
		this.depth = depth;
	}

	/**
	 * SCNR ID 반환<br>
	 * @return
	 */
	public String getScnr_id() {
		return scnrId;
	}

	/**
	 * SCNR ID 세팅<br>
	 * @param scnr_id
	 */
	public void setScnr_id(String scnr_id) {
		this.scnrId = scnr_id;
	}

	/**
	 * Check Depth 반환<br>
	 * @return
	 */
	public String getChkDepth() {
		return chkDepth;
	}

	/**
	 * Check Depth 세팅<br>
	 * @param chkDepth
	 */
	public void setChkDepth(String chkDepth) {
		this.chkDepth = chkDepth;
	}

	/**
	 * @return the vvdChartListVO
	 */
	public VVDChartListVO getVvdChartListVO() {
		return vvdChartListVO;
	}

	/**
	 * @param vvdChartListVO the vvdChartListVO to set
	 */
	public void setVvdChartListVO(VVDChartListVO vvdChartListVO) {
		this.vvdChartListVO = vvdChartListVO;
	}

	/**
	 * @return the vvdChartListVOs
	 */
	public VVDChartListVO[] getVvdChartListVOs() {
		VVDChartListVO[] rtnVOs = null;
		if (this.vvdChartListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(vvdChartListVOs, vvdChartListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param vvdChartListVOs the vvdChartListVOs to set
	 */
	public void setVvdChartListVOs(VVDChartListVO[] vvdChartListVOs){
		if(vvdChartListVOs != null){
			VVDChartListVO[] tmpVOs = java.util.Arrays.copyOf(vvdChartListVOs, vvdChartListVOs.length);
			this.vvdChartListVOs = tmpVOs;
		}
	}
	
}
