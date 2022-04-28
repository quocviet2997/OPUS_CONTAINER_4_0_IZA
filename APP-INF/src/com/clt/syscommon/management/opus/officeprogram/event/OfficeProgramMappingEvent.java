/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : UI_COM_SYS_010Event.java
*@FileTitle : 프로그램 매핑
*Open Issues :
*Change history :
*@LastModifyDate : 2006-09-13
*@LastModifier : SeongWook Kim
*@LastVersion : 1.0
* 2006-09-13 SeongWook Kim
* 1.0 최초 생성
=========================================================*/
package com.clt.syscommon.management.opus.officeprogram.event;

import java.util.Arrays;
import java.util.Collection;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.common.table.ComOfcPgmMtchVO;
import com.clt.syscommon.common.table.ComPgmRoleVO;



/**
 * UI_COM_SYS_010 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * - UI_COM_SYS_010HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author SeongWook Kim
 * @see HTMLAction 참조
 * @since J2EE 1.4
 */
public class OfficeProgramMappingEvent extends EventSupport {

	private ComOfcPgmMtchVO[] comOfcPgmMtchVOs = null; 
	
	/** ofc_cd 변수 (Form 객체) */
	private String ofcCd = null;

	/** ofc_nm 변수 (Form 객체) */
	private String ofcNm = null;

	private String pgmNoForm = null;
	
	/** usr_auth_tp_cd 변수 (Session 정보) */
	private String loginUserUsrAuthTpCd = null;

	/** ofc_cd 변수 (Session 정보) */
	private String loginUserOfcCd = null;

	/**
	 * 
	 */
	public OfficeProgramMappingEvent(){}
	/**
	 * @return
	 */
	public String getLogin_user_ofc_cd() {
		return loginUserOfcCd;
	}

	/**
	 * @param loginUserOfcCd
	 */
	public void setLogin_user_ofc_cd(String loginUserOfcCd) {
		this.loginUserOfcCd = loginUserOfcCd;
	}

	/**
	 * @return
	 */
	public String getLogin_user_usr_auth_tp_cd() {
		return loginUserUsrAuthTpCd;
	}

	/**
	 * @param loginUserUsrAuthTpCd
	 */
	public void setLogin_user_usr_auth_tp_cd(String loginUserUsrAuthTpCd) {
		this.loginUserUsrAuthTpCd = loginUserUsrAuthTpCd;
	}

	public void setComOfcPgmMtchVOs(ComOfcPgmMtchVO[] comOfcPgmMtchVOs) {
		if(comOfcPgmMtchVOs != null){
			ComOfcPgmMtchVO[] tmpVOs = Arrays.copyOf(comOfcPgmMtchVOs, comOfcPgmMtchVOs.length);
			this.comOfcPgmMtchVOs  = tmpVOs;
		}
	}
	public ComOfcPgmMtchVO[] getComOfcPgmMtchVOs() {
		ComOfcPgmMtchVO[] rtnVOs = null;
		if (this.comOfcPgmMtchVOs != null) {
			rtnVOs = Arrays.copyOf(comOfcPgmMtchVOs, comOfcPgmMtchVOs.length);
		}
		return rtnVOs;
	}
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	public String getOfcCd() {
		return ofcCd;
	}
	public void setOfcNm(String ofcNm) {
		this.ofcNm = ofcNm;
	}
	public String getOfcNm() {
		return ofcNm;
	}
	
	public void setPgmNoForm(String pgmNoForm) {
		this.pgmNoForm = pgmNoForm;
	}
	public String getPgmNoForm() {
		return pgmNoForm;
	}
}
