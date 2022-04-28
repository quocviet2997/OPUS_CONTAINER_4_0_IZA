/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 22, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;

/**
 * It's FileUploadBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 22, 2009
 */
public interface FileUploadBC {

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @param moduleId
	 * @param string 
	 */
	void moveUploadFile(List<String> object, String target) throws EventException ;

}
