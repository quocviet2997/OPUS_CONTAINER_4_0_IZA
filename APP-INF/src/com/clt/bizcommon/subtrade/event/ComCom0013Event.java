/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : COM_COM_0013Event.java
*@FileTitle : Subtrade
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.subtrade.event;

import com.clt.bizcommon.subtrade.vo.SearchSubtradeListVO;
import com.clt.framework.core.controller.html.HTMLAction;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * COM_COM_0013 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - COM_COM_0013HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Shin Ja Young
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class ComCom0013Event extends EventSupport {
	
	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private SearchSubtradeListVO	searchSubtradeListVO = null;
	 
	/** Table Value Object Multi Data 처리 */
	private SearchSubtradeListVO[] searchSubtradeListVOs = null;
	
    private String deltFlg = "";
    private String mdmYn = "";
    private String code = "";
    private String desc = "";

    /**
	 * Constructor<br>
	 */
	public ComCom0013Event(){}
	
	/**
	 * Delt Flag 반환<br>
	 * @return
	 */
	public String getDeltFlg() {
		return deltFlg;
	}

	/**
	 * Delt Flag 세팅<br>
	 * @param delt_flg
	 */
	public void setDeltFlg(String delt_flg) {
		deltFlg = delt_flg;
	}
	
	/**
	 * code 세팅<br>
	 * @param code
	 */
	public void setCode(String code) {
		code = code;
	}
	
	/**
	 * code 반환<br>
	 * @return
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * desc 반환<br>
	 * @return
	 */
	public String getDesc() {
		return desc;
	}
	
	/**
	 * desc 세팅<br>
	 * @param desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * MDM Flag 반환<br>
	 * @return
	 */
	public String getMdmYn() {
		return mdmYn;
	}

	/**
	 * MDM Flag 세팅<br>
	 * @param delt_flg
	 */
	public void setMdmYn(String mdm_yn) {
		mdmYn = mdm_yn;
	}
	
	/**
     * Event 명을 반환<br>
     * @return String
     */
	public String getEventName() {
		return "ComCom0013Event";
	}

	/**
     * Class 명을 반환<br>
     * @return String
     */
	public String toString() {
		return "ComCom0013Event";
	}

	/**
	 * @return the searchSubtradeListVO
	 */
	public SearchSubtradeListVO getSearchSubtradeListVO() {
		return searchSubtradeListVO;
	}

	/**
	 * @param searchSubtradeListVO the searchSubtradeListVO to set
	 */
	public void setSearchSubtradeListVO(SearchSubtradeListVO searchSubtradeListVO) {
		this.searchSubtradeListVO = searchSubtradeListVO;
	}

	/**
	 * @return the searchSubtradeListVOs
	 */
	public SearchSubtradeListVO[] getSearchSubtradeListVOs() {
		SearchSubtradeListVO[] rtnVOs = null;
		if (this.searchSubtradeListVOs != null) {
			rtnVOs = java.util.Arrays.copyOf(searchSubtradeListVOs, searchSubtradeListVOs.length);
		}
		return rtnVOs;
	}

	/**
	 * @param searchSubtradeListVOs the searchSubtradeListVOs to set
	 */
	public void setSearchSubtradeListVOs(SearchSubtradeListVO[] searchSubtradeListVOs){
		if(searchSubtradeListVOs != null){
			SearchSubtradeListVO[] tmpVOs = java.util.Arrays.copyOf(searchSubtradeListVOs, searchSubtradeListVOs.length);
			this.searchSubtradeListVOs = tmpVOs;
		}
	}

}
