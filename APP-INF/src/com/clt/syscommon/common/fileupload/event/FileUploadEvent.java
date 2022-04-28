/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : FileUploadEvent.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Apr 20, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.fileupload.event;

import java.util.List;
import java.util.Map;

import com.clt.framework.support.layer.event.EventSupport;

/**
 * It's FileUploadEvent.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Apr 20, 2009
 */
public class FileUploadEvent extends EventSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8560110092423367410L;
	private List<String> keys;
	private String moduleId;
	private Map<String, String> virusResults;

	/**
	 * This method gets keys 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public List<String> getKeys(){
		return this.keys;
	}
	
	/**
	 * This method sets keys 
	 * @author Jeong-Hoon, KIM
	 * @param keys
	 */
	public void setKeys(List<String> keys) {
		this.keys = keys;
	}

	/**
	 * This method sets a moduleId 
	 * @author Jeong-Hoon, KIM
	 * @param parameter
	 */
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
	/**
	 * This method gets a moduleId. 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	public String getModuleId(){
		return this.moduleId;
	}

	/**
	 * It's a setter of virusResults.
	 * @param virusResults the virusResults to set
	 */
	public void setVirusResults(Map<String, String> virusResults) {
		this.virusResults = virusResults;
	}

	/**
	 * It's a getter of virusResults.
	 * @return the virusResults
	 */
	public Map<String, String> getVirusResults() {
		return virusResults;
	}

}
