/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SubtradeBCImpl.java
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
import com.clt.bizcommon.subtrade.integration.SubtradeDBDAO;
import com.clt.bizcommon.subtrade.vo.SearchSubtradeListVO;
import com.clt.framework.component.message.ErrorHandler;
import com.clt.framework.core.layer.event.EventException;
import com.clt.framework.core.layer.integration.DAOException;
import com.clt.framework.support.layer.basic.BasicCommandSupport;

/**
 * @author Shin Ja Young
 * @see COM_COM_0013EventResponse,TradeBC 각 DAO 클래스 참조
 * @since J2EE 1.4
 */
public class SubtradeBCImpl   extends BasicCommandSupport implements SubtradeBC {

	// Database Access Object
	private transient SubtradeDBDAO dbDao=null;

	/**
	 * SubtradeBCImpl 객체 생성<br>
	 * SubtradeDBDAO를 생성한다.<br>
	 */
	public SubtradeBCImpl(){
		dbDao = new SubtradeDBDAO();
	}

	/**
	 * 조회 이벤트 처리<br>
	 * Subtrade 화면에 대한 조회 이벤트 처리<br>
	 * @param SearchSubtradeListVO searchSubtradeListVO
	 * @param String mdm_yn
	 * @param String delt_flg
	 * @return List<SearchSubtradeListVO>
	 * @exception EventException
	 */
	public List<SearchSubtradeListVO> searchSubtradeList(SearchSubtradeListVO searchSubtradeListVO, String mdm_yn, String delt_flg) throws EventException {
		
        List<SearchSubtradeListVO> list = null;
        
		try {
			list   = dbDao.searchSubtradeList(searchSubtradeListVO, mdm_yn, delt_flg);
		} catch (DAOException ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		} catch (Exception ex) {
			throw new EventException(new ErrorHandler(ex).getMessage());
		}
		return list;
	}

	/**
	 * BIZCOMMON 업무 시나리오 마감작업<br>
	 * Trade 업무 시나리오 종료시 관련 내부객체 해제<br>
	 */
	public void doEnd() {
		dbDao = null;
	}
}