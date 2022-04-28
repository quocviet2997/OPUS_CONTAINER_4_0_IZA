/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SubtradeBC.java
*@FileTitle : Subtrade
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.subtrade.basic;

import java.util.List;
import com.clt.bizcommon.subtrade.vo.SearchSubtradeListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * @author Shin Ja Young
 * @see ComCom0012EventResponse 참조
 * @since J2EE 1.4
 */

public interface SubtradeBC  {

	/**
	 * 조회 이벤트 처리<br>
	 * Trade 화면에 대한 조회 이벤트 처리<br>
	 * @param SearchSubtradeListVO searchSubtradeListVO
	 * @param String mdm_yn
	 * @param String delt_flg
	 * @return List<SearchSubtradeListVO>
	 * @exception EventException
	 */
	public List<SearchSubtradeListVO> searchSubtradeList(SearchSubtradeListVO searchSubtradeListVO, String mdm_yn, String delt_flg ) throws EventException;

}