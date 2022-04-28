/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DctionaryBC.java
*@FileTitle : Dctionary
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.07
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.12.07 정인선
* 1.0 Creation
=========================================================*/
package com.clt.syscommon.management.opus.dctionary.basic;

import java.util.List;

import com.clt.framework.core.layer.event.EventException;
import com.clt.syscommon.management.opus.dctionary.vo.DctionaryVO;

/**
 * ALPS-Dctionary Business Logic Command Interface<br>
 * - ALPS-Dctionary 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Sun JungIn
 * @see Dctionary-EventResponse 참조
 * @since J2EE 1.6
 */
public interface DctionaryBC {
	
	/**
	 * 	searchDctionary
	 * @param String abbreviation
	 * @return List<DctionaryVO>
	 * @throws EventException
	 */
	public List<DctionaryVO> searchDctionary(String abbreviation) throws EventException;

}
