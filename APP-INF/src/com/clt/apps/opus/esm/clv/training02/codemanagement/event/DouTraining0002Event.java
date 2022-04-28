/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : DouTraining0002Event.java
*@FileTitle : Practice 02
*Open Issues :
*Change history :
*@LastModifyDate : 2022.03.22
*@LastModifier : 
*@LastVersion : 1.0
* 2022.03.22 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.training02.codemanagement.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtVO;
import com.clt.apps.opus.esm.clv.training02.codemanagement.vo.CodeMgmtDtlVO;


/**
 * DOU_TRAINING_0002 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  DOU_TRAINING_0002HTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Viet Tran
 * @see DOU_TRAINING_0002HTMLAction 참조
 * @since J2EE 1.6
 */

public class DouTraining0002Event extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	CodeMgmtVO codeMgmtVO = null;
	CodeMgmtDtlVO codeMgmtDtlVO = null;
	
	/** Table Value Object Multi Data 처리 */
	CodeMgmtVO[] codeMgmtVOs = null;
	CodeMgmtDtlVO[] codeMgmtDtlVOs = null;

	public DouTraining0002Event(){}
	
	public void setCodeMgmtVO(CodeMgmtVO codeMgmtVO){
		this. codeMgmtVO = codeMgmtVO;
	}

	public void setCodeMgmtVOS(CodeMgmtVO[] codeMgmtVOs){
		this. codeMgmtVOs = codeMgmtVOs;
	}

	public CodeMgmtVO getCodeMgmtVO(){
		return codeMgmtVO;
	}

	public CodeMgmtVO[] getCodeMgmtVOS(){
		return codeMgmtVOs;
	}

	public void setCodeMgmtDtlVO(CodeMgmtDtlVO codeMgmtDtlVO){
		this. codeMgmtDtlVO = codeMgmtDtlVO;
	}

	public void setCodeMgmtDtlVOS(CodeMgmtDtlVO[] codeMgmtDtlVOs){
		this. codeMgmtDtlVOs = codeMgmtDtlVOs;
	}

	public CodeMgmtDtlVO getCodeMgmtDtlVO(){
		return codeMgmtDtlVO;
	}

	public CodeMgmtDtlVO[] getCodeMgmtDtlVOS(){
		return codeMgmtDtlVOs;
	}
	
}