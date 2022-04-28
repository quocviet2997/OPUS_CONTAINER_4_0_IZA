/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadPopupEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 24, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload.event;

import com.clt.framework.component.util.file.ModuleMetaData;
import com.clt.framework.support.layer.event.EventSupport;

/**
 * It's FileUploadPopupEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 24, 2009
 */
public class FileUploadPopupEvent extends EventSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4661967205901439234L;
	private ModuleMetaData moduleMetaData;

	/**
	 * This method sets a ModuleMetaData 
	 * @author Jeong-Hoon, KIM
	 * @param moduleMetaData
	 */
	public void setModueMetaData(ModuleMetaData moduleMetaData) {
		this.moduleMetaData = moduleMetaData;
	}
	
	/**
	 * This method gets a ModuleMetaData 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public ModuleMetaData getModuleMetaData(){
		return this.moduleMetaData;
	}
}
