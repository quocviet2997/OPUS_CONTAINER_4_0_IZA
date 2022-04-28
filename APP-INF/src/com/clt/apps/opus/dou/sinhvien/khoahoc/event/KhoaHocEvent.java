/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : SinhvienEvent.java
*@FileTitle : Sinh Vien
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.sinhvien.khoahoc.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.dou.sinhvien.sinhvien.vo.SinhVienVO;


/**
 * SinhVien 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  SinhVienHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Vi Nguyen
 * @see KhoaHocnHTMLAction 참조
 * @since J2EE 1.6
 */

public class KhoaHocEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	SinhVienVO sinhVienVO = null;
	
	/** Table Value Object Multi Data 처리 */
	SinhVienVO[] sinhVienVOs = null;

	public KhoaHocEvent(){}
	
	public void setSinhVienVO(SinhVienVO sinhVienVO){
		this. sinhVienVO = sinhVienVO;
	}

	public void setSinhVienVOS(SinhVienVO[] sinhVienVOs){
		if (sinhVienVOs != null) {
			SinhVienVO[] tmpVOs = new SinhVienVO[sinhVienVOs.length];
			System.arraycopy(sinhVienVOs, 0, tmpVOs, 0, tmpVOs.length);
			this. sinhVienVOs = tmpVOs;
		}
	}

	public SinhVienVO getSinhVienVO(){
		return sinhVienVO;
	}

	public SinhVienVO[] getSinhVienVOS(){
		SinhVienVO[] rtnVOs = null;
		if (sinhVienVOs != null) {
			rtnVOs = new SinhVienVO[sinhVienVOs.length];
			System.arraycopy(sinhVienVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

}