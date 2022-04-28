/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MuonSachBC.java
*@FileTitle : Muon Sach
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.muonsach.muonsach.basic;

import java.util.List;
import com.clt.framework.core.layer.event.EventException;
import com.clt.apps.opus.dou.muonsach.muonsach.vo.MuonSachVO;

/**
 * ALPS-Muonsach Business Logic Command Interface<br>
 * - ALPS-Muonsach에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author Vi Nguyen
 * @since J2EE 1.6
 */

public interface MuonSachBC {

	/**
	 * [비즈니스대상]을 [행위] 합니다.<br>
	 * 
	 * @param MuonSachVO	muonSachVO
	 * @return List<MuonSachVO>
	 * @exception EventException
	 */
	public List<MuonSachVO> searchMuonSach(MuonSachVO muonSachVO) throws EventException;
}