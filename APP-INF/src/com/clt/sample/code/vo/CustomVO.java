/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CustomVO.java
*@FileTitle : Common code inquiry sample Custom ValueObject
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.25
*@LastModifier : Seungyol Lee
*@LastVersion : 1.0
* 2009.05.25 Seungyol Lee
* 1.0 최초 생성
=========================================================*/
package com.clt.sample.code.vo;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.clt.framework.component.util.code.CodeInfo;
import com.clt.syscommon.common.table.ComProgramVO;
import com.clt.syscommon.common.table.ComUserVO;

/**
 * Common code inquiry sample Custom ValueObject
 * Inquiry common code list
 *
 * @author Seungyol Lee
 * @see 
 * @since J2EE 1.4
 */
public class CustomVO  {
	private Collection<CodeInfo> codelist1 = null;
	private Collection<CodeInfo> codelist2 = null;
	
	private String usrMsg = null;
	private List<ComUserVO> voList1 = null;
	private List<ComProgramVO> voList2 = null;
	private Map<String, String> etcData = null;
	private Map<String, Object> customData = null;
	
	public void setCodelist1(Collection<CodeInfo> codelist1) {
		this.codelist1 = codelist1;
	}
	public Collection<CodeInfo> getCodelist1() {
		return codelist1;
	}
	public void setCodelist2(Collection<CodeInfo> codelist2) {
		this.codelist2 = codelist2;
	}
	public Collection<CodeInfo> getCodelist2() {
		return codelist2;
	}
	public void setUsrMsg(String usrMsg) {
		this.usrMsg = usrMsg;
	}
	public String getUsrMsg() {
		return usrMsg;
	}
	public void setVoList1(List<ComUserVO> voList1) {
		this.voList1 = voList1;
	}
	public List<ComUserVO> getVoList1() {
		return voList1;
	}
	public void setEtcData(Map<String, String> etcData) {
		this.etcData = etcData;
	}
	public Map<String, String> getEtcData() {
		return etcData;
	}
	public void setCustomData(Map<String, Object> customData) {
		this.customData = customData;
	}
	public Map<String, Object> getCustomData() {
		return customData;
	}
	public void setVoList2(List<ComProgramVO> voList2) {
		this.voList2 = voList2;
	}
	public List<ComProgramVO> getVoList2() {
		return voList2;
	}
	
}
