/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsAdvRsltVO.java
*@FileTitle : BkgCstmsAdvRsltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.04
*@LastModifier : 이수빈
*@LastVersion : 1.0
* 2009.05.04 이수빈 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이수빈
 * @since J2EE 1.5
 */

public class BkgCstmsAdvRsltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvRsltVO> models = new ArrayList<BkgCstmsAdvRsltVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String arrDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dspoCreDt = null;
	/* Column Info */
	private String blNoChk = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String amsLocCd = null;
	/* Column Info */
	private String ibdRefNo = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String cstmsBatNo = null;
	/* Column Info */
	private String cstmsClrCd = null;
	/* Column Info */
	private String blNoTp = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String cstmsSeq = null;
	/* Column Info */
	private String blNvoccTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rcvLocCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String crrBatNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String dspoCd = null;
	/* Column Info */
	private String entrTpNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String ibdTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cstmsRmk1 = null;
	/* Column Info */
	private String cstmsRmk3 = null;
	/* Column Info */
	private String rsndFlg = null;
	/* Column Info */
	private String cstmsRmk2 = null;
	/* Column Info */
	private String entrNo = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvRsltVO() {}

	public BkgCstmsAdvRsltVO(String ibflag, String pagerows, String cntCd, String blNo, String blNoTp, String blNoChk, String cstmsSeq, String ibdTpCd, String dspoCd, String cntrQty, String entrTpNo, String entrNo, String arrDt, String cstmsRmk1, String cstmsRmk2, String cstmsRmk3, String amsLocCd, String rcvLocCd, String ibdRefNo, String vslCd, String skdVoyNo, String skdDirCd, String blNvoccTpCd, String cstmsBatNo, String dspoCreDt, String rsndFlg, String crrBatNo, String creUsrId, String creDt, String updUsrId, String updDt, String cstmsClrCd) {
		this.vslCd = vslCd;
		this.arrDt = arrDt;
		this.creDt = creDt;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.dspoCreDt = dspoCreDt;
		this.blNoChk = blNoChk;
		this.ibflag = ibflag;
		this.amsLocCd = amsLocCd;
		this.ibdRefNo = ibdRefNo;
		this.cntCd = cntCd;
		this.cstmsBatNo = cstmsBatNo;
		this.blNoTp = blNoTp;
		this.cntrQty = cntrQty;
		this.cstmsSeq = cstmsSeq;
		this.blNvoccTpCd = blNvoccTpCd;
		this.updUsrId = updUsrId;
		this.rcvLocCd = rcvLocCd;
		this.updDt = updDt;
		this.crrBatNo = crrBatNo;
		this.skdVoyNo = skdVoyNo;
		this.dspoCd = dspoCd;
		this.entrTpNo = entrTpNo;
		this.skdDirCd = skdDirCd;
		this.ibdTpCd = ibdTpCd;
		this.creUsrId = creUsrId;
		this.cstmsRmk1 = cstmsRmk1;
		this.cstmsRmk3 = cstmsRmk3;
		this.rsndFlg = rsndFlg;
		this.cstmsRmk2 = cstmsRmk2;
		this.cstmsClrCd = cstmsClrCd;
		this.entrNo = entrNo;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("arr_dt", getArrDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dspo_cre_dt", getDspoCreDt());
		this.hashColumns.put("bl_no_chk", getBlNoChk());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ams_loc_cd", getAmsLocCd());
		this.hashColumns.put("ibd_ref_no", getIbdRefNo());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("cstms_bat_no", getCstmsBatNo());
		this.hashColumns.put("bl_no_tp", getBlNoTp());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("cstms_seq", getCstmsSeq());
		this.hashColumns.put("bl_nvocc_tp_cd", getBlNvoccTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rcv_loc_cd", getRcvLocCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("crr_bat_no", getCrrBatNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("dspo_cd", getDspoCd());
		this.hashColumns.put("entr_tp_no", getEntrTpNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("ibd_tp_cd", getIbdTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cstms_rmk1", getCstmsRmk1());
		this.hashColumns.put("cstms_rmk3", getCstmsRmk3());
		this.hashColumns.put("rsnd_flg", getRsndFlg());
		this.hashColumns.put("cstms_rmk2", getCstmsRmk2());
		this.hashColumns.put("cstms_clr_cd", getCstmsClrCd());
		this.hashColumns.put("entr_no", getEntrNo());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("arr_dt", "arrDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dspo_cre_dt", "dspoCreDt");
		this.hashFields.put("bl_no_chk", "blNoChk");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ams_loc_cd", "amsLocCd");
		this.hashFields.put("ibd_ref_no", "ibdRefNo");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("cstms_bat_no", "cstmsBatNo");
		this.hashFields.put("bl_no_tp", "blNoTp");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("cstms_seq", "cstmsSeq");
		this.hashFields.put("bl_nvocc_tp_cd", "blNvoccTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rcv_loc_cd", "rcvLocCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("crr_bat_no", "crrBatNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("dspo_cd", "dspoCd");
		this.hashFields.put("entr_tp_no", "entrTpNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("ibd_tp_cd", "ibdTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cstms_rmk1", "cstmsRmk1");
		this.hashFields.put("cstms_rmk3", "cstmsRmk3");
		this.hashFields.put("rsnd_flg", "rsndFlg");
		this.hashFields.put("cstms_rmk2", "cstmsRmk2");
		this.hashFields.put("cstms_clr_cd", "cstmsClrCd");
		this.hashFields.put("entr_no", "entrNo");
		return this.hashFields;
	}
	
	public String getVslCd() {
		return this.vslCd;
	}
	public String getArrDt() {
		return this.arrDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getBlNo() {
		return this.blNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getDspoCreDt() {
		return this.dspoCreDt;
	}
	public String getBlNoChk() {
		return this.blNoChk;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getAmsLocCd() {
		return this.amsLocCd;
	}
	public String getIbdRefNo() {
		return this.ibdRefNo;
	}
	public String getCntCd() {
		return this.cntCd;
	}
	public String getCstmsBatNo() {
		return this.cstmsBatNo;
	}
	public String getBlNoTp() {
		return this.blNoTp;
	}
	public String getCntrQty() {
		return this.cntrQty;
	}
	public String getCstmsSeq() {
		return this.cstmsSeq;
	}
	public String getBlNvoccTpCd() {
		return this.blNvoccTpCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getRcvLocCd() {
		return this.rcvLocCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCrrBatNo() {
		return this.crrBatNo;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getDspoCd() {
		return this.dspoCd;
	}
	public String getEntrTpNo() {
		return this.entrTpNo;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getIbdTpCd() {
		return this.ibdTpCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getCstmsRmk1() {
		return this.cstmsRmk1;
	}
	public String getCstmsRmk3() {
		return this.cstmsRmk3;
	}
	public String getRsndFlg() {
		return this.rsndFlg;
	}
	public String getCstmsRmk2() {
		return this.cstmsRmk2;
	}

	public String getCstmsClrCd() {
		return this.cstmsClrCd;
	}
	
	public String getEntrNo() {
		return this.entrNo;
	}

	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setArrDt(String arrDt) {
		this.arrDt = arrDt;
		//this.arrDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setBlNo(String blNo) {
		this.blNo = blNo;
		//this.blNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setDspoCreDt(String dspoCreDt) {
		this.dspoCreDt = dspoCreDt;
		//this.dspoCreDt=true;
	}
	public void setBlNoChk(String blNoChk) {
		this.blNoChk = blNoChk;
		//this.blNoChk=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setAmsLocCd(String amsLocCd) {
		this.amsLocCd = amsLocCd;
		//this.amsLocCd=true;
	}
	public void setIbdRefNo(String ibdRefNo) {
		this.ibdRefNo = ibdRefNo;
		//this.ibdRefNo=true;
	}
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
		//this.cntCd=true;
	}
	public void setCstmsBatNo(String cstmsBatNo) {
		this.cstmsBatNo = cstmsBatNo;
		//this.cstmsBatNo=true;
	}
	public void setBlNoTp(String blNoTp) {
		this.blNoTp = blNoTp;
		//this.blNoTp=true;
	}
	public void setCntrQty(String cntrQty) {
		this.cntrQty = cntrQty;
		//this.cntrQty=true;
	}
	public void setCstmsSeq(String cstmsSeq) {
		this.cstmsSeq = cstmsSeq;
		//this.cstmsSeq=true;
	}
	public void setBlNvoccTpCd(String blNvoccTpCd) {
		this.blNvoccTpCd = blNvoccTpCd;
		//this.blNvoccTpCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setRcvLocCd(String rcvLocCd) {
		this.rcvLocCd = rcvLocCd;
		//this.rcvLocCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCrrBatNo(String crrBatNo) {
		this.crrBatNo = crrBatNo;
		//this.crrBatNo=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setDspoCd(String dspoCd) {
		this.dspoCd = dspoCd;
		//this.dspoCd=true;
	}
	public void setEntrTpNo(String entrTpNo) {
		this.entrTpNo = entrTpNo;
		//this.entrTpNo=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setIbdTpCd(String ibdTpCd) {
		this.ibdTpCd = ibdTpCd;
		//this.ibdTpCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setCstmsRmk1(String cstmsRmk1) {
		this.cstmsRmk1 = cstmsRmk1;
		//this.cstmsRmk1=true;
	}
	public void setCstmsRmk3(String cstmsRmk3) {
		this.cstmsRmk3 = cstmsRmk3;
		//this.cstmsRmk3=true;
	}
	public void setRsndFlg(String rsndFlg) {
		this.rsndFlg = rsndFlg;
		//this.rsndFlg=true;
	}
	public void setCstmsRmk2(String cstmsRmk2) {
		this.cstmsRmk2 = cstmsRmk2;
		//this.cstmsRmk2=true;
	}

	public void setCstmsClrCd(String cstmsClrCd) {
		this.cstmsClrCd = cstmsClrCd;
		//this.cstmsRmk2=true;
	}

	public void setEntrNo(String entrNo) {
		this.entrNo = entrNo;
		//this.entrNo=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setArrDt(JSPUtil.getParameter(request, "arr_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDspoCreDt(JSPUtil.getParameter(request, "dspo_cre_dt", ""));
		setBlNoChk(JSPUtil.getParameter(request, "bl_no_chk", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAmsLocCd(JSPUtil.getParameter(request, "ams_loc_cd", ""));
		setIbdRefNo(JSPUtil.getParameter(request, "ibd_ref_no", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setCstmsBatNo(JSPUtil.getParameter(request, "cstms_bat_no", ""));
		setBlNoTp(JSPUtil.getParameter(request, "bl_no_tp", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setCstmsSeq(JSPUtil.getParameter(request, "cstms_seq", ""));
		setBlNvoccTpCd(JSPUtil.getParameter(request, "bl_nvocc_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRcvLocCd(JSPUtil.getParameter(request, "rcv_loc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCrrBatNo(JSPUtil.getParameter(request, "crr_bat_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setDspoCd(JSPUtil.getParameter(request, "dspo_cd", ""));
		setEntrTpNo(JSPUtil.getParameter(request, "entr_tp_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setIbdTpCd(JSPUtil.getParameter(request, "ibd_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCstmsRmk1(JSPUtil.getParameter(request, "cstms_rmk1", ""));
		setCstmsRmk3(JSPUtil.getParameter(request, "cstms_rmk3", ""));
		setRsndFlg(JSPUtil.getParameter(request, "rsnd_flg", ""));
		setCstmsRmk2(JSPUtil.getParameter(request, "cstms_rmk2", ""));
		setCstmsClrCd(JSPUtil.getParameter(request, "cstms_clr_cd", ""));
		setEntrNo(JSPUtil.getParameter(request, "entr_no", ""));
	}

	public BkgCstmsAdvRsltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsAdvRsltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvRsltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] arrDt = (JSPUtil.getParameter(request, prefix	+ "arr_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] dspoCreDt = (JSPUtil.getParameter(request, prefix	+ "dspo_cre_dt".trim(), length));
			String[] blNoChk = (JSPUtil.getParameter(request, prefix	+ "bl_no_chk".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] amsLocCd = (JSPUtil.getParameter(request, prefix	+ "ams_loc_cd".trim(), length));
			String[] ibdRefNo = (JSPUtil.getParameter(request, prefix	+ "ibd_ref_no".trim(), length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd".trim(), length));
			String[] cstmsBatNo = (JSPUtil.getParameter(request, prefix	+ "cstms_bat_no".trim(), length));
			String[] blNoTp = (JSPUtil.getParameter(request, prefix	+ "bl_no_tp".trim(), length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty".trim(), length));
			String[] cstmsSeq = (JSPUtil.getParameter(request, prefix	+ "cstms_seq".trim(), length));
			String[] blNvoccTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_nvocc_tp_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] rcvLocCd = (JSPUtil.getParameter(request, prefix	+ "rcv_loc_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] crrBatNo = (JSPUtil.getParameter(request, prefix	+ "crr_bat_no".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] dspoCd = (JSPUtil.getParameter(request, prefix	+ "dspo_cd".trim(), length));
			String[] entrTpNo = (JSPUtil.getParameter(request, prefix	+ "entr_tp_no".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] ibdTpCd = (JSPUtil.getParameter(request, prefix	+ "ibd_tp_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] cstmsRmk1 = (JSPUtil.getParameter(request, prefix	+ "cstms_rmk1".trim(), length));
			String[] cstmsRmk3 = (JSPUtil.getParameter(request, prefix	+ "cstms_rmk3".trim(), length));
			String[] rsndFlg = (JSPUtil.getParameter(request, prefix	+ "rsnd_flg".trim(), length));
			String[] cstmsRmk2 = (JSPUtil.getParameter(request, prefix	+ "cstms_rmk2".trim(), length));
			String[] cstmsClrCd = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_cd".trim(), length));
			String[] entrNo = (JSPUtil.getParameter(request, prefix	+ "entr_no".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvRsltVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (arrDt[i] != null)
					model.setArrDt(arrDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dspoCreDt[i] != null)
					model.setDspoCreDt(dspoCreDt[i]);
				if (blNoChk[i] != null)
					model.setBlNoChk(blNoChk[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (amsLocCd[i] != null)
					model.setAmsLocCd(amsLocCd[i]);
				if (ibdRefNo[i] != null)
					model.setIbdRefNo(ibdRefNo[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (cstmsBatNo[i] != null)
					model.setCstmsBatNo(cstmsBatNo[i]);
				if (blNoTp[i] != null)
					model.setBlNoTp(blNoTp[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (cstmsSeq[i] != null)
					model.setCstmsSeq(cstmsSeq[i]);
				if (blNvoccTpCd[i] != null)
					model.setBlNvoccTpCd(blNvoccTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rcvLocCd[i] != null)
					model.setRcvLocCd(rcvLocCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (crrBatNo[i] != null)
					model.setCrrBatNo(crrBatNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (dspoCd[i] != null)
					model.setDspoCd(dspoCd[i]);
				if (entrTpNo[i] != null)
					model.setEntrTpNo(entrTpNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (ibdTpCd[i] != null)
					model.setIbdTpCd(ibdTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cstmsRmk1[i] != null)
					model.setCstmsRmk1(cstmsRmk1[i]);
				if (cstmsRmk3[i] != null)
					model.setCstmsRmk3(cstmsRmk3[i]);
				if (rsndFlg[i] != null)
					model.setRsndFlg(rsndFlg[i]);
				if (cstmsRmk2[i] != null)
					model.setCstmsRmk2(cstmsRmk2[i]);
				if (cstmsClrCd[i] != null)
					model.setCstmsClrCd(cstmsClrCd[i]);
				if (entrNo[i] != null)
					model.setEntrNo(entrNo[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBkgCstmsAdvRsltVOs();
	}

	public BkgCstmsAdvRsltVO[] getBkgCstmsAdvRsltVOs(){
		BkgCstmsAdvRsltVO[] vos = (BkgCstmsAdvRsltVO[])models.toArray(new BkgCstmsAdvRsltVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDt = this.arrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dspoCreDt = this.dspoCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoChk = this.blNoChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsLocCd = this.amsLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdRefNo = this.ibdRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsBatNo = this.cstmsBatNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNoTp = this.blNoTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsSeq = this.cstmsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNvoccTpCd = this.blNvoccTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvLocCd = this.rcvLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrBatNo = this.crrBatNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dspoCd = this.dspoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entrTpNo = this.entrTpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTpCd = this.ibdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsRmk1 = this.cstmsRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsRmk3 = this.cstmsRmk3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rsndFlg = this.rsndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsRmk2 = this.cstmsRmk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrCd = this.cstmsClrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.entrNo = this.entrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
