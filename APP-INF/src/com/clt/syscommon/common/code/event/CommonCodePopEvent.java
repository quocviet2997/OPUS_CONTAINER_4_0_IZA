/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : CommonCodePopEvent.java
*@FileTitle : 공통코드검색
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-08
*@LastModifier : HOESOO_JANG
*@LastVersion : 1.0
* 2006-09-08 HOESOO_JANG
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.common.code.event;


import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.COM_INTG_CD_DTL;



/**
 * CommonCodePop 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - CommonCodePopHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author HOESOO_JANG
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class CommonCodePopEvent extends EventSupport {

	/** com_intg_cd_dtl Table  Value Object */
	private COM_INTG_CD_DTL comIntgCdDtl = null;

	/** com_intg_cd_dtls Multi Action을 위한 Collection */
	private Collection comIntgCdDtls = null;

	/**
	 * 생성자
	 */
	public CommonCodePopEvent(){}

	/**
	 * @param com_intg_cd_dtl
	 */
	public CommonCodePopEvent(COM_INTG_CD_DTL com_intg_cd_dtl) {
		this.comIntgCdDtl = com_intg_cd_dtl;
	}

	/**
	 * @param com_intg_cd_dtl
	 * @param com_intg_cd_dtls
	 */
	public CommonCodePopEvent(COM_INTG_CD_DTL com_intg_cd_dtl, Collection com_intg_cd_dtls) {
		this.comIntgCdDtl = com_intg_cd_dtl;
		this.comIntgCdDtls = com_intg_cd_dtls;
	}

	/**
	 * @return com_intg_cd_dtl
	 */
	public COM_INTG_CD_DTL getCOM_INTG_CD_DTL(){
		return comIntgCdDtl;
	}

	/**
	 * @return com_intg_cd_dtls
	 */
	public Collection getCOM_INTG_CD_DTLS(){
		return comIntgCdDtls;
	}

	/** (non-Javadoc)
	 * @see com.clt.framework.support.layer.event.EventSupport#getEventName()
	 */
	public String getEventName() {
		return "CommonCodePopEvent";
	}

	/** (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "CommonCodePopEvent";
	}

}
