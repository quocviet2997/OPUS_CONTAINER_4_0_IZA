/*=========================================================
*Copyright(c) 2006 CyberLogitec
*@FileName : VesselBC.java
*@FileTitle : Vessel조회(공통 Popup)
*Open Issues :
*Change history :
*@LastModifyDate : 2006-08-02
*@LastModifier : sangyool pak
*@LastVersion : 1.0
* 2006-08-02 sangyool pak
* 1.0 최초 생성
=========================================================*/
package com.clt.bizcommon.vessel.basic;

import java.util.List;

import com.clt.bizcommon.vessel.vo.SearchVesselLIstVO;
import com.clt.framework.core.layer.event.EventException;

/**
 * ENIS-BIZCOMMON Business Logic Command Interface<br>
 * - ENIS-BIZCOMMON에 대한 비지니스 로직에 대한 인터페이스<br>
 *
 * @author sangyool pak
 * @see ComEns0A1EventResponse 참조
 * @since J2EE 1.4
 */
public interface VesselBC  {

    /**
     * Vessel List 조회<br>
     * @param String vslCd
     * @param String vslEngNm
     * @param String carCd
     * @param int iPage
     * @param String callSgnNo
     * @param String lloydNo
     * @return List<SearchVesselLIstVO>
     * @throws EventException
     */
    public List<SearchVesselLIstVO> searchVesselList(String vslCd, String vslEngNm, String carCd, int iPage , String callSgnNo, String lloydNo) throws EventException;

    /**
     * Vessel List 조회<br>
     * @param String vsl_cd
     * @param String vsl_eng_nm
     * @param String car_cd
     * @param int iPage
     * @param String call_sgn_no
     * @param String lloyd_no
     * @param String mdmYN
     * @param String deltFlg
     * @param String fdrDiv_cd
     * @return List<SearchVesselLIstVO>
     * @throws EventException
     */
	public List searchVesselList(String vsl_cd, String vsl_eng_nm, String car_cd, int iPage, String call_sgn_no, String lloyd_no, String mdmYN, String deltFlg, String fdrDiv_cd)throws EventException;

}