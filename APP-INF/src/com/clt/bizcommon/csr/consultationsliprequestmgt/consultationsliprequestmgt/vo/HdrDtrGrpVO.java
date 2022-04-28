package com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo;

import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.DtrbListVO;
import com.clt.bizcommon.csr.consultationsliprequestmgt.consultationsliprequestmgt.vo.HdrVO;

import java.util.ArrayList;
import java.util.List; 

public class HdrDtrGrpVO {
	private HdrVO    hdrVOs    = null;
	private List<DtrbListVO> dtrbListVOs = null;
	
	public HdrDtrGrpVO(){
		hdrVOs    = new HdrVO();
		dtrbListVOs = new ArrayList<DtrbListVO>();
	}

	/**
	 * @return the hdrVOs
	 */
	public HdrVO getHdrVOs() {
		return hdrVOs;
	}

	/**
	 * @param hdrVOs the hdrVOs to set
	 */
	public void setHdrVOs(HdrVO hdrVOs) {
		this.hdrVOs = hdrVOs;
	}

	/**
	 * @return the dtrbListVOs
	 */
	public List<DtrbListVO> getDtrbListVOs() {
		return dtrbListVOs;
	}

	/**
	 * @param dtrbListVOs the dtrbListVOs to set
	 */
	public void setDtrbListVOs(List<DtrbListVO> dtrbListVOs) {
		this.dtrbListVOs = dtrbListVOs;
	}

 
}
