/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SampleVO.java
*@FileTitle : Sample VO
*Open Issues :
*Change history :
*@LastModifyDate : 2009-05-25
*@LastModifier : Hyunsu, Ryu
*@LastVersion : 1.0
* 2009-05-25 Hyunsu, Ryu
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.eai.webservices.synch.provider.servicesio;

/**
 * It's SampleVO.java
 * @author Hyunsu, Ryu
 * @see 
 * @since J2EE 1.6
 * May 25, 2009
 */
public class SampleVO {
	
	String cmdtNm = "";
	String repCmdtCd = "";
	String repImdgLvlCd = "";

	
	String cmdtCd = "";
	/**
	 * @return the cmdtCd
	 */
	public String getCmdtCd() {
		return cmdtCd;
	}
	/**
	 * @param cmdtCd the cmdtCd to set
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	/**
	 * @return the cmdtNm
	 */
	public String getCmdtNm() {
		return cmdtNm;
	}
	/**
	 * @param cmdtNm the cmdtNm to set
	 */
	public void setCmdtNm(String cmdtNm) {
		this.cmdtNm = cmdtNm;
	}
	/**
	 * @return the repCmdtCd
	 */
	public String getRepCmdtCd() {
		return repCmdtCd;
	}
	/**
	 * @param repCmdtCd the repCmdtCd to set
	 */
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
	}
	/**
	 * @return the repImdgLvlCd
	 */
	public String getRepImdgLvlCd() {
		return repImdgLvlCd;
	}
	/**
	 * @param repImdgLvlCd the repImdgLvlCd to set
	 */
	public void setRepImdgLvlCd(String repImdgLvlCd) {
		this.repImdgLvlCd = repImdgLvlCd;
	}
}
