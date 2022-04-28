/*========================================================
*Copyright(c) 2009 CyberLogitec
*ProcessChain    : NPI
*@FileName       : ExcelDataBC.java
*@FileTitle      : NIS2010
*Open Issues     :
*Change history  :
*@LastModifyDate : Sep 22, 2009
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.sample.file.exceldownload.basic;

import java.util.List;

/**
 * It's ExcelDataBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2EE 1.5
 * Sep 22, 2009
 */
public interface ExcelDataBC {

	/**
	 * This method 
	 * @author Jeong-Hoon, KIM
	 * @return
	 */
	List<?> getVOs();

	String[] getTitle();

	String[] getColumns();

}
