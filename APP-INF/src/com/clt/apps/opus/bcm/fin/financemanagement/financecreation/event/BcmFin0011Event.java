/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : BcmFin0011Event.java
*@FileTitle : Revenue Month per Common & Charter VVD
*Open Issues :
*Change history :
*@LastModifyDate : 
*@LastModifier : 
*@LastVersion : 1.0
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.event;

import com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo.RevenueMonthVvdVO;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * BCM_FIN_0011 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  BCM_FIN_0011HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jung Yoon Tae
 * @see BCM_FIN_0011HTMLAction 참조
 * @since J2EE 1.6
 */
public class BcmFin0011Event extends EventSupport{
	private static final long serialVersionUID = 1L;
	
	private String tarYrmon;
	
	private final static String PRE_MONTH = "pre";
	private final static String THIS_MONTH = "this";
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private RevenueMonthVvdVO revenueMonthVvdVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private RevenueMonthVvdVO[] revenueMonthVvdVOs = null;

	public String getTarYrmon() {
		return tarYrmon;
	}

	public void setTarYrmon(String tarYrmon) {
		this.tarYrmon = tarYrmon;
	}

	public RevenueMonthVvdVO getRevenueMonthVvdVO() {
		return revenueMonthVvdVO;
	}

	public void setRevenueMonthVvdVO(
			RevenueMonthVvdVO revenueMonthVvdVO) {
		this.revenueMonthVvdVO = revenueMonthVvdVO;
	}

	public RevenueMonthVvdVO[] getRevenueMonthVvdVOs() {
		//return revenueMonthVvdVOs;
		RevenueMonthVvdVO[] rtnVOs = null;
		if(this.revenueMonthVvdVOs != null) {
			rtnVOs = new RevenueMonthVvdVO[revenueMonthVvdVOs.length];
			System.arraycopy(revenueMonthVvdVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

	public void setRevenueMonthVvdVOs(
			RevenueMonthVvdVO[] revenueMonthVvdVOs) {
		//this.revenueMonthVvdVOs = revenueMonthVvdVOs;
		if(revenueMonthVvdVOs != null) {
			RevenueMonthVvdVO[] tmpVOs = new RevenueMonthVvdVO[revenueMonthVvdVOs.length];
			System.arraycopy(revenueMonthVvdVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.revenueMonthVvdVOs = tmpVOs;
		}
	}

	public static String getPreMonth() {
		return PRE_MONTH;
	}

	public static String getThisMonth() {
		return THIS_MONTH;
	}

	
}