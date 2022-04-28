/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ExceldownloadEvent.java
*@FileTitle : ExcelDownload
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.22
*@LastModifier : 김정훈
*@LastVersion : 1.0
* 2009.09.22 김정훈
* 1.0 Creation
=========================================================*/
package com.clt.sample.file.exceldownload.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.framework.table.ComUpldFileVO;


/**
 * ExcelDownload 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  ExcelDownloadHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Jeong-Hoon, Kim
 * @see ExcelDownloadHTMLAction 참조
 * @since J2EE 1.6
 */

public class ExceldownloadEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	private ComUpldFileVO comUpldFile = null;
	
	/** Table Value Object Multi Data 처리 */
	private ComUpldFileVO[] comUpldFiles = null;

	public ExceldownloadEvent(){}
	
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