/*=========================================================
*Copyright(c) 2020 CyberLogitec
*@FileName : MuonsachEvent.java
*@FileTitle : Muon Sach
*Open Issues :
*Change history :
*@LastModifyDate : 2020.03.18
*@LastModifier : 
*@LastVersion : 1.0
* 2020.03.18 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.muonsach.muonsach.event;

import com.clt.framework.support.layer.event.EventSupport;
import com.clt.apps.opus.dou.muonsach.muonsach.vo.MuonSachVO;


/**
 * MuonSach 에 대한 PDTO(Data Transfer Object including Parameters)<br>
 * -  MuonSachHTMLAction에서 작성<br>
 * - ServiceCommand Layer로 전달하는 PDTO로 사용<br>
 *
 * @author Vi Nguyen
 * @see MuonSachHTMLAction 참조
 * @since J2EE 1.6
 */

public class MuonsachEvent extends EventSupport {

	private static final long serialVersionUID = 1L;
	
	/** Table Value Object 조회 조건 및 단건 처리  */
	MuonSachVO muonSachVO = null;
	
	/** Table Value Object Multi Data 처리 */
	MuonSachVO[] muonSachVOs = null;

	public MuonsachEvent(){}
	
	public void setMuonSachVO(MuonSachVO muonSachVO){
		this. muonSachVO = muonSachVO;
	}

	public void setMuonSachVOS(MuonSachVO[] muonSachVOs){
		if (muonSachVOs != null) {
			MuonSachVO[] tmpVOs = new MuonSachVO[muonSachVOs.length];
			System.arraycopy(muonSachVOs, 0, tmpVOs, 0, tmpVOs.length);
			this.muonSachVOs = tmpVOs;
		}
	}

	public MuonSachVO getMuonSachVO(){
		return muonSachVO;
	}

	public MuonSachVO[] getMuonSachVOS(){
		MuonSachVO[] rtnVOs = null;
		if (muonSachVOs != null) {
			rtnVOs = new MuonSachVO[muonSachVOs.length];
			System.arraycopy(muonSachVOs, 0, rtnVOs, 0, rtnVOs.length);
		}
		return rtnVOs;
	}

}