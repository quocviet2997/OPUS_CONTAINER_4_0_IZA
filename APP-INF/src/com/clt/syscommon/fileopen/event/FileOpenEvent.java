/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : 
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2016.06.01
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2016.06.01 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.fileopen.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.syscommon.fileopen.vo.FileOpenVO;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public class FileOpenEvent extends EventSupport {
	
	private static final long serialVersionUID = 1L;

	public FileOpenEvent(){}
	
	private FileOpenVO fileOpen = null;

	public FileOpenVO getFileOpen() {
		return fileOpen;
	}

	public void setFileOpen(FileOpenVO fileOpen) {
		this.fileOpen = fileOpen;
	}
}
