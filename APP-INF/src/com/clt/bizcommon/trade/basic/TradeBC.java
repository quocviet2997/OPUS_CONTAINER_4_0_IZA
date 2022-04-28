/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : TradeBC.java
*@FileTitle : Trade
*Open Issues :
*Change history :
*@LastModifyDate : 2012-02-22
*@LastModifier : Shin Ja Young
*@LastVersion : 1.0
* 2012-02-21 Shin Ja Young
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.trade.basic;

import java.util.List;
import com.clt.bizcommon.trade.vo.SearchTradeListVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * @author Shin Ja Young
 * @see ComCom0012EventResponse 참조
 * @since J2EE 1.4
 */

public interface TradeBC  {

	/**
	 * 조회 이벤트 처리<br>
	 * Trade 화면에 대한 조회 이벤트 처리<br>
	 * @param SearchTradeListVO searchTradeListVO
	 * @param String mdm_yn
	 * @param String delt_flg
	 * @return List<SearchTradeListVO>
	 * @exception EventException
	 */
	public List<SearchTradeListVO> searchTradeList(SearchTradeListVO searchTradeListVO, String mdm_yn, String delt_flg ) throws EventException;

}