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
package com.clt.syscommon.fileopen.basic;

import com.clt.framework.core.layer.event.EventException;

/**
*
* @author 
* @since J2EE 1.6
* @see 
*/
public interface FileOpenBC {

	/**
	 * 
	 * @param bkgNo
	 * @param seq
	 * @return
	 * @throws EventException
	 */
	public Object searchOblPrintFlg(String bkgNo, String seq) throws EventException;
	
	/**
	 * 
	 * @param bkgNo
	 * @param seq
	 * @return
	 * @throws EventException
	 */
	public int updateOblPrintFlg(String bkgNo, String seq) throws EventException;
	
}
