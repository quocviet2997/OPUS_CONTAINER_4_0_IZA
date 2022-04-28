/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonCfmQtaOfcAddVO.java
*@FileTitle : SaqMonCfmQtaOfcAddVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonCfmQtaOfcAddVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonCfmQtaOfcAddVO> models = new ArrayList<SaqMonCfmQtaOfcAddVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String qtaTgtCd = null;
	/* Column Info */
	private String custGrpId = null;
	/* Column Info */
	private String rhqCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String addTpCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mqtaRlseVerNo = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String rgnOfcCd = null;
	/* Column Info */
	private String aqCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String subTrdCd = null;

	/* Column Info 추가(ESM_SAQ_0167)*/
	private String bseMon           = null;
	private String bseWk            = null;
	private String iocCd            = null;
	private String vvdSeq           = null;
	private String lstLodgPortEtdDt = null;
	private String bsaCapa          = null;
	private String newRlaneCd       = null;
	private String tempQtaTgtCd     = null;
	private String tempRlaneCd      = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonCfmQtaOfcAddVO() {}

	public SaqMonCfmQtaOfcAddVO(String ibflag, String pagerows, String mqtaRlseVerNo, String bseYr, String bseQtrCd, String qtaTgtCd, String trdCd, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String rgnOfcCd, String custGrpId, String subTrdCd, String rhqCd, String aqCd, String addTpCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.qtaTgtCd = qtaTgtCd;
		this.custGrpId = custGrpId;
		this.rhqCd = rhqCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.skdVoyNo = skdVoyNo;
		this.bseYr = bseYr;
		this.rlaneCd = rlaneCd;
		this.addTpCd = addTpCd;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.mqtaRlseVerNo = mqtaRlseVerNo;
		this.bseQtrCd = bseQtrCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.dirCd = dirCd;
		this.rgnOfcCd = rgnOfcCd;
		this.aqCd = aqCd;
		this.updUsrId = updUsrId;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("qta_tgt_cd", getQtaTgtCd());
		this.hashColumns.put("cust_grp_id", getCustGrpId());
		this.hashColumns.put("rhq_cd", getRhqCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("add_tp_cd", getAddTpCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mqta_rlse_ver_no", getMqtaRlseVerNo());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("rgn_ofc_cd", getRgnOfcCd());
		this.hashColumns.put("aq_cd", getAqCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("bse_mon", getBseMon());
		this.hashColumns.put("bse_wk", getBseWk());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("vvd_seq", getVvdSeq());
		this.hashColumns.put("lst_lodg_port_etd_dt", getLstLodgPortEtdDt());
		this.hashColumns.put("bsa_capa", getBsaCapa());
		this.hashColumns.put("temp_qta_tgt_cd", getTempQtaTgtCd());
		this.hashColumns.put("temp_rlane_cd", getTempRlaneCd());
		this.hashColumns.put("new_rlane_cd", getNewRlaneCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("qta_tgt_cd", "qtaTgtCd");
		this.hashFields.put("cust_grp_id", "custGrpId");
		this.hashFields.put("rhq_cd", "rhqCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("add_tp_cd", "addTpCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mqta_rlse_ver_no", "mqtaRlseVerNo");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("rgn_ofc_cd", "rgnOfcCd");
		this.hashFields.put("aq_cd", "aqCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("bse_mon", "bseMon");
		this.hashFields.put("bse_wk", "bseWk");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("vvd_seq", "vvdSeq");
		this.hashFields.put("lst_lodg_port_etd_dt", "lstLodgPortEtdDt");
		this.hashFields.put("bsa_capa", "bsaCapa");
		this.hashFields.put("qta_tgt_cd", "qtaTgtcd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return qtaTgtCd
	 */
	public String getQtaTgtCd() {
		return this.qtaTgtCd;
	}
	
	/**
	 * Column Info
	 * @return custGrpId
	 */
	public String getCustGrpId() {
		return this.custGrpId;
	}
	
	/**
	 * Column Info
	 * @return rhqCd
	 */
	public String getRhqCd() {
		return this.rhqCd;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return addTpCd
	 */
	public String getAddTpCd() {
		return this.addTpCd;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return mqtaRlseVerNo
	 */
	public String getMqtaRlseVerNo() {
		return this.mqtaRlseVerNo;
	}
	
	/**
	 * Column Info
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return rgnOfcCd
	 */
	public String getRgnOfcCd() {
		return this.rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return aqCd
	 */
	public String getAqCd() {
		return this.aqCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	

	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param qtaTgtCd
	 */
	public void setQtaTgtCd(String qtaTgtCd) {
		this.qtaTgtCd = qtaTgtCd;
	}
	
	/**
	 * Column Info
	 * @param custGrpId
	 */
	public void setCustGrpId(String custGrpId) {
		this.custGrpId = custGrpId;
	}
	
	/**
	 * Column Info
	 * @param rhqCd
	 */
	public void setRhqCd(String rhqCd) {
		this.rhqCd = rhqCd;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param addTpCd
	 */
	public void setAddTpCd(String addTpCd) {
		this.addTpCd = addTpCd;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param mqtaRlseVerNo
	 */
	public void setMqtaRlseVerNo(String mqtaRlseVerNo) {
		this.mqtaRlseVerNo = mqtaRlseVerNo;
	}
	
	/**
	 * Column Info
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param rgnOfcCd
	 */
	public void setRgnOfcCd(String rgnOfcCd) {
		this.rgnOfcCd = rgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param aqCd
	 */
	public void setAqCd(String aqCd) {
		this.aqCd = aqCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	public String getBseMon() {
		return bseMon;
	}

	public void setBseMon(String bseMon) {
		this.bseMon = bseMon;
	}

	public String getBseWk() {
		return bseWk;
	}

	public void setBseWk(String bseWk) {
		this.bseWk = bseWk;
	}

	public String getIocCd() {
		return iocCd;
	}

	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
	}

	public String getVvdSeq() {
		return vvdSeq;
	}

	public void setVvdSeq(String vvdSeq) {
		this.vvdSeq = vvdSeq;
	}

	public String getLstLodgPortEtdDt() {
		return lstLodgPortEtdDt;
	}

	public void setLstLodgPortEtdDt(String lstLodgPortEtdDt) {
		this.lstLodgPortEtdDt = lstLodgPortEtdDt;
	}

	public String getBsaCapa() {
		return bsaCapa;
	}

	public void setBsaCapa(String bsaCapa) {
		this.bsaCapa = bsaCapa;
	}

	public String getNewRlaneCd() {
		return newRlaneCd;
	}

	public void setNewRlaneCd(String newRlaneCd) {
		this.newRlaneCd = newRlaneCd;
	}

	public String getTempQtaTgtCd() {
		return tempQtaTgtCd;
	}

	public void setTempQtaTgtCd(String tempQtaTgtCd) {
		this.tempQtaTgtCd = tempQtaTgtCd;
	}

	public String getTempRlaneCd() {
		return tempRlaneCd;
	}

	public void setTempRlaneCd(String tempRlaneCd) {
		this.tempRlaneCd = tempRlaneCd;
	}
	

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setQtaTgtCd(JSPUtil.getParameter(request, "qta_tgt_cd", ""));
		setCustGrpId(JSPUtil.getParameter(request, "cust_grp_id", ""));
		setRhqCd(JSPUtil.getParameter(request, "rhq_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setAddTpCd(JSPUtil.getParameter(request, "add_tp_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMqtaRlseVerNo(JSPUtil.getParameter(request, "mqta_rlse_ver_no", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setRgnOfcCd(JSPUtil.getParameter(request, "rgn_ofc_cd", ""));
		setAqCd(JSPUtil.getParameter(request, "aq_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonCfmQtaOfcAddVO[]
	 */
	public SaqMonCfmQtaOfcAddVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonCfmQtaOfcAddVO[]
	 */
	public SaqMonCfmQtaOfcAddVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonCfmQtaOfcAddVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] qtaTgtCd = (JSPUtil.getParameter(request, prefix	+ "qta_tgt_cd", length));
			String[] custGrpId = (JSPUtil.getParameter(request, prefix	+ "cust_grp_id", length));
			String[] rhqCd = (JSPUtil.getParameter(request, prefix	+ "rhq_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] addTpCd = (JSPUtil.getParameter(request, prefix	+ "add_tp_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mqtaRlseVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_rlse_ver_no", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] rgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "rgn_ofc_cd", length));
			String[] aqCd = (JSPUtil.getParameter(request, prefix	+ "aq_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonCfmQtaOfcAddVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (qtaTgtCd[i] != null)
					model.setQtaTgtCd(qtaTgtCd[i]);
				if (custGrpId[i] != null)
					model.setCustGrpId(custGrpId[i]);
				if (rhqCd[i] != null)
					model.setRhqCd(rhqCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (addTpCd[i] != null)
					model.setAddTpCd(addTpCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mqtaRlseVerNo[i] != null)
					model.setMqtaRlseVerNo(mqtaRlseVerNo[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (rgnOfcCd[i] != null)
					model.setRgnOfcCd(rgnOfcCd[i]);
				if (aqCd[i] != null)
					model.setAqCd(aqCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonCfmQtaOfcAddVOs();
	}
	
	/**
	 * Lane/Office 추가 (ESM_SAQ_167)에 사용한 Parameter 로 재구성.   
	 * @param request
	 * @param prefix
	 * @return SaqMonCfmQtaOfcAddVO[]
	 */
//	public SaqMonCfmQtaOfcAddVO[] fromRequestGrid(HttpServletRequest request, QuotaConditionVO conVo) {
//		SaqMonCfmQtaOfcAddVO model = null;
//		
//		String[] tmp = request.getParameterValues("ibflag");
//  		if(tmp == null)
//   			return null;
//
//  		int length = request.getParameterValues("ibflag").length;
//		
//		try {
//			String[] ibflag           = (JSPUtil.getParameter(request, "ibflag".trim()              , length));
//			String[] deltFlg          = (JSPUtil.getParameter(request, "delt_flg".trim()            , length));
//			String[] trdCd            = (JSPUtil.getParameter(request, "trd_cd".trim()              , length));
//			String[] vslCd            = (JSPUtil.getParameter(request, "vsl_cd".trim()              , length));
//			String[] skdVoyNo         = (JSPUtil.getParameter(request, "skd_voy_no".trim()          , length));
//			String[] skdDirCd         = (JSPUtil.getParameter(request, "skd_dir_cd".trim()          , length));
//			String[] rgnOfcCd         = (JSPUtil.getParameter(request, "rgn_ofc_cd".trim()          , length));
//			String[] dirCd            = (JSPUtil.getParameter(request, "dir_cd".trim()              , length));
//			String[] subTrdCd         = (JSPUtil.getParameter(request, "sub_trd_cd".trim()          , length));
//			String[] rlaneCd          = (JSPUtil.getParameter(request, "rlane_cd".trim()            , length));
//			String[] newRlaneCd       = (JSPUtil.getParameter(request, "new_rlane_cd".trim()        , length));
//			String[] rhqCd            = (JSPUtil.getParameter(request, "rhq_cd".trim()              , length));
//			String[] aqCd             = (JSPUtil.getParameter(request, "aq_cd".trim()               , length));
//			String[] addTpCd          = (JSPUtil.getParameter(request, "add_tp_cd".trim()           , length));
//			String[] bseMon           = (JSPUtil.getParameter(request, "mon".trim()                 , length));
//			String[] bseWk            = (JSPUtil.getParameter(request, "week".trim()                , length));
//			String[] iocCd            = (JSPUtil.getParameter(request, "ioc_cd".trim()              , length));
//			String[] vvdSeq           = (JSPUtil.getParameter(request, "vvd_seq".trim()             , length));
//			String[] lstLodgPortEtdDt = (JSPUtil.getParameter(request, "lst_lodg_port_etd_dt".trim(), length));
//			String[] bsaCapa          = (JSPUtil.getParameter(request, "bsa_capa".trim()            , length));
//			String[] mqtaRlseVerNo    = (JSPUtil.getParameter(request, "mqta_rlse_ver_no".trim()    , length));
//			String[] bseYr            = (JSPUtil.getParameter(request, "bse_yr".trim()              , length));
//			String[] bseQtrCd         = (JSPUtil.getParameter(request, "bse_qtr_cd".trim()          , length));
//			String[] qtaTgtcd         = (JSPUtil.getParameter(request, "qta_tgt_cd".trim()          , length));
//			String[] updUsrId         = (JSPUtil.getParameter(request, "upd_usr_id".trim()          , length));
//			String[] creUsrId         = (JSPUtil.getParameter(request, "cre_usr_id".trim()          , length));
//			
//			for (int i = 0; i < length; i++) {
//				model = new SaqMonCfmQtaOfcAddVO();
//				if (ibflag[i] != null)
//					model.setIbflag(ibflag[i]);
//				if (mqtaRlseVerNo[i] != null)
//					model.setMqtaRlseVerNo(conVo.getMqtaRlseVerNo()); //변수
//				if (bseYr[i] != null)
//					model.setBseYr(conVo.getBse_yr()); //변수
//				if (bseQtrCd[i] != null)
//					model.setBseQtrCd(conVo.getBseQtrCd()); //변수
//				if (qtaTgtcd[i] != null)
//					model.setQtaTgtCd(conVo.getQtaTgtCd()); //변수
//				if (deltFlg[i] != null)
//					model.setDeltFlg(deltFlg[i]);
//				if (trdCd[i] != null)
//					model.setTrdCd(trdCd[i]);
//				if (vslCd[i] != null)
//					model.setVslCd(vslCd[i]);
//				if (skdVoyNo[i] != null)
//					model.setSkdVoyNo(skdVoyNo[i]);
//				if (skdDirCd[i] != null)
//					model.setSkdDirCd(skdDirCd[i]);
//				if (rgnOfcCd[i] != null)
//					model.setRgnOfcCd(rgnOfcCd[i]);
//				if (dirCd[i] != null)
//					model.setDirCd(dirCd[i]);
//				if (subTrdCd[i] != null)
//					model.setSubTrdCd(subTrdCd[i]);
//				if (rlaneCd[i] != null)
//					model.setRlaneCd(rlaneCd[i]);
//				if (newRlaneCd[i] != null)
//					model.setNewRlaneCd(newRlaneCd[i]);
//				if (rhqCd[i] != null)
//					model.setRhqCd(rhqCd[i]);
//				if (aqCd[i] != null)
//					model.setAqCd(aqCd[i]);
//				if (addTpCd[i] != null)
//					model.setAddTpCd(addTpCd[i].substring(0,1));
//				if (bseMon[i] != null)
//					model.setBseMon(bseMon[i]);
//				if (bseWk[i] != null)
//					model.setBseWk(bseWk[i]);
//				if (iocCd[i] != null)
//					model.setIocCd(iocCd[i]);
//				if (vvdSeq[i] != null)
//					model.setVvdSeq(vvdSeq[i]);
//				if (lstLodgPortEtdDt[i] != null)
//					model.setLstLodgPortEtdDt(lstLodgPortEtdDt[i]);
//				if (bsaCapa[i] != null)
//					model.setBsaCapa(bsaCapa[i]);
//				if (updUsrId[i] != null)
//					model.setUpdUsrId(updUsrId[i]);
//				if (creUsrId[i] != null)
//					model.setCreUsrId(creUsrId[i]);
//				models.add(model);
//			}
//			
//		} catch (Exception e) {
//			return null;
//		}
//		return getSaqMonCfmQtaOfcAddVOs();
//	}

	/**
	 * VO 배열을 반환
	 * @return SaqMonCfmQtaOfcAddVO[]
	 */
	public SaqMonCfmQtaOfcAddVO[] getSaqMonCfmQtaOfcAddVOs(){
		SaqMonCfmQtaOfcAddVO[] vos = (SaqMonCfmQtaOfcAddVO[])models.toArray(new SaqMonCfmQtaOfcAddVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtaTgtCd = this.qtaTgtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custGrpId = this.custGrpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhqCd = this.rhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addTpCd = this.addTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaRlseVerNo = this.mqtaRlseVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnOfcCd = this.rgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aqCd = this.aqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
