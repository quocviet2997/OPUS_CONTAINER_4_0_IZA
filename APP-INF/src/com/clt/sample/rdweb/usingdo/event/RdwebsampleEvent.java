/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : RdwebsampleEvent.java
*@FileTitle : RdWebSample
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.18
*@LastModifier : 
*@LastVersion : 1.0
* 2009.05.18 
* 1.0 Creation
=========================================================*/
package com.clt.sample.rdweb.usingdo.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.framework.table.ComUpldFileVO;


/**
 * RdWebSample 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  RdWebSampleHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author 
 * @see RdWebSampleHTMLAction 참조
 * @since J2EE 1.4
 */

public class RdwebsampleEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComUpldFileVO comUpldFileVO = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComUpldFileVO[] comUpldFileVOs = null;

	public RdwebsampleEvent(){}
	
	public void setComUpldFileVO(ComUpldFileVO comUpldFileVO){
		this. comUpldFileVO = comUpldFileVO;
	}

	public void setComUpldFileVOS(ComUpldFileVO[] comUpldFileVOs){
		this. comUpldFileVOs = comUpldFileVOs;
	}

	public ComUpldFileVO getComUpldFileVO(){
		return comUpldFileVO;
	}

	public ComUpldFileVO[] getComUpldFileVOS(){
		return comUpldFileVOs;
	}

}