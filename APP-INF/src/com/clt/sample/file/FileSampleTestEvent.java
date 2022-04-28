/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : System Common
*@FileName       : FileUploadEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : 2009. 1. 5.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.file;

import java.util.List;

import com.clt.framework.support.layer.event.EventSupport;

/**
 * It's FileUploadEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * 2009. 1. 9.
 */
public class FileSampleTestEvent extends EventSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7922394985350573789L;
	private List<?> keys;

	/**
	 * For Test
	 * @author Jeong-Hoon, KIM
	 * @param keys
	 */
	public void setKeys(List<?> keys) {
		this.keys = keys;
	}
	
	public List<?> getKeys(){
		return this.keys;
	}

}
