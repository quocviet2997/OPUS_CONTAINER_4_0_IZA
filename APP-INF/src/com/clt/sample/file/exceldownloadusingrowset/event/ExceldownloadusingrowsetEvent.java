/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExceldownloadusingrowsetEvent.java
*@FileTitle : ExcelDownloadUsingRowset
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.23
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.10.23 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownloadusingrowset.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.framework.table.ComUpldFileVO;


/**
 * ExcelDownloadUsingRowset 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  ExcelDownloadUsingRowsetHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see ExcelDownloadUsingRowsetHTMLAction 참조
 * @since J2EE 1.6
 */

public class ExceldownloadusingrowsetEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComUpldFileVO comUpldFile = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComUpldFileVO[] comUpldFiles = null;

	public ExceldownloadusingrowsetEvent(){}
	
	public void setComUpldFile(ComUpldFileVO comUpldFile){
		this. comUpldFile = comUpldFile;
	}

	public void setComUpldFileS(ComUpldFileVO[] comUpldFiles){
		this. comUpldFiles = comUpldFiles;
	}

	public ComUpldFileVO getComUpldFile(){
		return comUpldFile;
	}

	public ComUpldFileVO[] getComUpldFileS(){
		return comUpldFiles;
	}

}