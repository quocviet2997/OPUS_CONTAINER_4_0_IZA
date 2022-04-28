/*========================================================
*Copyright(c) 2014 CyberLogitec
*ProcessChain    : BST
*@FileName       : ThemeOneBC.java
*@FileTitle      	 : 
*@Author           : Jeong-Hoon, KIM
*Open Issues     :
*Change history  :
*@LastModifyDate : 2014. 4. 16.
*@LastModifier   : Jeong-Hoon, KIM
*@LastVersion    : 1.0
=========================================================*/
package com.clt.syscommon.common.theme.basic;

import com.clt.framework.core.layer.event.EventException;

/**
 * ThemeOneBC.java
 * @author Jeong-Hoon, KIM
 * @see 
 * @since J2SE 1.6
 * 2014. 4. 16.
 */
public interface ThemeBC {

	void updateThemeOne(String userId) throws EventException;

	void updateThemeTwo(String userId) throws EventException;

}

