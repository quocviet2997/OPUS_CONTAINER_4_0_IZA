/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgDoVO.java
*@FileTitle : BkgDoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.18
*@LastModifier : 임진영
*@LastVersion : 1.0
* 2009.09.18 임진영 
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
 * @author 임진영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgDoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgDoVO> models = new ArrayList<BkgDoVO>();
	
	/* Column Info */
	private String idaDoVtyDt = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String idaDoDmdtPayTpCd = null;
	/* Column Info */
	private String vnCgoDeCd = null;
	/* Column Info */
	private String rcvrPhnNo = null;
	/* Column Info */
	private String hblNo = null;
	/* Column Info */
	private String doPrnRmk = null;
	/* Column Info */
	private String rcvrBizNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String custPrnFlg = null;
	/* Column Info */
	private String doNoSplit = null;
	/* Column Info */
	private String rcvrFaxNo = null;
	/* Column Info */
	private String selfTrnsFlg = null;
	/* Column Info */
	private String rcvrCoNm = null;
	/* Column Info */
	private String rlseSeq = null;
	/* Column Info */
	private String picNm = null;
	/* Column Info */
	private String rcvrCneeNm = null;
	/* Column Info */
	private String jpDoSndStsCd = null;
	/* Column Info */
	private String doNo = null;
	/* Column Info */
	private String rcvrEml = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cgorRmk = null;
	/* Column Info */
	private String jpDoId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgDoVO() {}

	public BkgDoVO(String ibflag, String pagerows, String bkgNo, String rlseSeq, String doNo, String doNoSplit, String custPrnFlg, String selfTrnsFlg, String hblNo, String rcvrCoNm, String rcvrPhnNo, String picNm, String rcvrEml, String rcvrFaxNo, String rcvrBizNo, String rcvrCneeNm, String idaDoDmdtPayTpCd, String idaDoVtyDt, String doPrnRmk, String cgorRmk, String vnCgoDeCd, String jpDoSndStsCd, String creUsrId, String creDt, String updUsrId, String updDt, String jpDoId) {
		this.idaDoVtyDt = idaDoVtyDt;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.idaDoDmdtPayTpCd = idaDoDmdtPayTpCd;
		this.vnCgoDeCd = vnCgoDeCd;
		this.rcvrPhnNo = rcvrPhnNo;
		this.hblNo = hblNo;
		this.doPrnRmk = doPrnRmk;
		this.rcvrBizNo = rcvrBizNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.custPrnFlg = custPrnFlg;
		this.doNoSplit = doNoSplit;
		this.rcvrFaxNo = rcvrFaxNo;
		this.selfTrnsFlg = selfTrnsFlg;
		this.rcvrCoNm = rcvrCoNm;
		this.rlseSeq = rlseSeq;
		this.picNm = picNm;
		this.rcvrCneeNm = rcvrCneeNm;
		this.jpDoSndStsCd = jpDoSndStsCd;
		this.doNo = doNo;
		this.rcvrEml = rcvrEml;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.cgorRmk = cgorRmk;
		this.jpDoId = jpDoId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ida_do_vty_dt", getIdaDoVtyDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ida_do_dmdt_pay_tp_cd", getIdaDoDmdtPayTpCd());
		this.hashColumns.put("vn_cgo_de_cd", getVnCgoDeCd());
		this.hashColumns.put("rcvr_phn_no", getRcvrPhnNo());
		this.hashColumns.put("hbl_no", getHblNo());
		this.hashColumns.put("do_prn_rmk", getDoPrnRmk());
		this.hashColumns.put("rcvr_biz_no", getRcvrBizNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cust_prn_flg", getCustPrnFlg());
		this.hashColumns.put("do_no_split", getDoNoSplit());
		this.hashColumns.put("rcvr_fax_no", getRcvrFaxNo());
		this.hashColumns.put("self_trns_flg", getSelfTrnsFlg());
		this.hashColumns.put("rcvr_co_nm", getRcvrCoNm());
		this.hashColumns.put("rlse_seq", getRlseSeq());
		this.hashColumns.put("pic_nm", getPicNm());
		this.hashColumns.put("rcvr_cnee_nm", getRcvrCneeNm());
		this.hashColumns.put("jp_do_snd_sts_cd", getJpDoSndStsCd());
		this.hashColumns.put("do_no", getDoNo());
		this.hashColumns.put("rcvr_eml", getRcvrEml());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cgor_rmk", getCgorRmk());
		this.hashColumns.put("jp_do_id", getJpDoId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ida_do_vty_dt", "idaDoVtyDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ida_do_dmdt_pay_tp_cd", "idaDoDmdtPayTpCd");
		this.hashFields.put("vn_cgo_de_cd", "vnCgoDeCd");
		this.hashFields.put("rcvr_phn_no", "rcvrPhnNo");
		this.hashFields.put("hbl_no", "hblNo");
		this.hashFields.put("do_prn_rmk", "doPrnRmk");
		this.hashFields.put("rcvr_biz_no", "rcvrBizNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cust_prn_flg", "custPrnFlg");
		this.hashFields.put("do_no_split", "doNoSplit");
		this.hashFields.put("rcvr_fax_no", "rcvrFaxNo");
		this.hashFields.put("self_trns_flg", "selfTrnsFlg");
		this.hashFields.put("rcvr_co_nm", "rcvrCoNm");
		this.hashFields.put("rlse_seq", "rlseSeq");
		this.hashFields.put("pic_nm", "picNm");
		this.hashFields.put("rcvr_cnee_nm", "rcvrCneeNm");
		this.hashFields.put("jp_do_snd_sts_cd", "jpDoSndStsCd");
		this.hashFields.put("do_no", "doNo");
		this.hashFields.put("rcvr_eml", "rcvrEml");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cgor_rmk", "cgorRmk");
		this.hashFields.put("jp_do_id", "jpDoId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return idaDoVtyDt
	 */
	public String getIdaDoVtyDt() {
		return this.idaDoVtyDt;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return idaDoDmdtPayTpCd
	 */
	public String getIdaDoDmdtPayTpCd() {
		return this.idaDoDmdtPayTpCd;
	}
	
	/**
	 * Column Info
	 * @return vnCgoDeCd
	 */
	public String getVnCgoDeCd() {
		return this.vnCgoDeCd;
	}
	
	/**
	 * Column Info
	 * @return rcvrPhnNo
	 */
	public String getRcvrPhnNo() {
		return this.rcvrPhnNo;
	}
	
	/**
	 * Column Info
	 * @return hblNo
	 */
	public String getHblNo() {
		return this.hblNo;
	}
	
	/**
	 * Column Info
	 * @return doPrnRmk
	 */
	public String getDoPrnRmk() {
		return this.doPrnRmk;
	}
	
	/**
	 * Column Info
	 * @return rcvrBizNo
	 */
	public String getRcvrBizNo() {
		return this.rcvrBizNo;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return custPrnFlg
	 */
	public String getCustPrnFlg() {
		return this.custPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return doNoSplit
	 */
	public String getDoNoSplit() {
		return this.doNoSplit;
	}
	
	/**
	 * Column Info
	 * @return rcvrFaxNo
	 */
	public String getRcvrFaxNo() {
		return this.rcvrFaxNo;
	}
	
	/**
	 * Column Info
	 * @return selfTrnsFlg
	 */
	public String getSelfTrnsFlg() {
		return this.selfTrnsFlg;
	}
	
	/**
	 * Column Info
	 * @return rcvrCoNm
	 */
	public String getRcvrCoNm() {
		return this.rcvrCoNm;
	}
	
	/**
	 * Column Info
	 * @return rlseSeq
	 */
	public String getRlseSeq() {
		return this.rlseSeq;
	}
	
	/**
	 * Column Info
	 * @return picNm
	 */
	public String getPicNm() {
		return this.picNm;
	}
	
	/**
	 * Column Info
	 * @return rcvrCneeNm
	 */
	public String getRcvrCneeNm() {
		return this.rcvrCneeNm;
	}
	
	/**
	 * Column Info
	 * @return jpDoSndStsCd
	 */
	public String getJpDoSndStsCd() {
		return this.jpDoSndStsCd;
	}
	
	/**
	 * Column Info
	 * @return doNo
	 */
	public String getDoNo() {
		return this.doNo;
	}
	
	/**
	 * Column Info
	 * @return rcvrEml
	 */
	public String getRcvrEml() {
		return this.rcvrEml;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return cgorRmk
	 */
	public String getCgorRmk() {
		return this.cgorRmk;
	}
	
	/**
	 * Column Info
	 * @return jpDoId
	 */
	public String getJpDoId() {
		return this.jpDoId;
	}
	

	/**
	 * Column Info
	 * @param idaDoVtyDt
	 */
	public void setIdaDoVtyDt(String idaDoVtyDt) {
		this.idaDoVtyDt = idaDoVtyDt;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param idaDoDmdtPayTpCd
	 */
	public void setIdaDoDmdtPayTpCd(String idaDoDmdtPayTpCd) {
		this.idaDoDmdtPayTpCd = idaDoDmdtPayTpCd;
	}
	
	/**
	 * Column Info
	 * @param vnCgoDeCd
	 */
	public void setVnCgoDeCd(String vnCgoDeCd) {
		this.vnCgoDeCd = vnCgoDeCd;
	}
	
	/**
	 * Column Info
	 * @param rcvrPhnNo
	 */
	public void setRcvrPhnNo(String rcvrPhnNo) {
		this.rcvrPhnNo = rcvrPhnNo;
	}
	
	/**
	 * Column Info
	 * @param hblNo
	 */
	public void setHblNo(String hblNo) {
		this.hblNo = hblNo;
	}
	
	/**
	 * Column Info
	 * @param doPrnRmk
	 */
	public void setDoPrnRmk(String doPrnRmk) {
		this.doPrnRmk = doPrnRmk;
	}
	
	/**
	 * Column Info
	 * @param rcvrBizNo
	 */
	public void setRcvrBizNo(String rcvrBizNo) {
		this.rcvrBizNo = rcvrBizNo;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param custPrnFlg
	 */
	public void setCustPrnFlg(String custPrnFlg) {
		this.custPrnFlg = custPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param doNoSplit
	 */
	public void setDoNoSplit(String doNoSplit) {
		this.doNoSplit = doNoSplit;
	}
	
	/**
	 * Column Info
	 * @param rcvrFaxNo
	 */
	public void setRcvrFaxNo(String rcvrFaxNo) {
		this.rcvrFaxNo = rcvrFaxNo;
	}
	
	/**
	 * Column Info
	 * @param selfTrnsFlg
	 */
	public void setSelfTrnsFlg(String selfTrnsFlg) {
		this.selfTrnsFlg = selfTrnsFlg;
	}
	
	/**
	 * Column Info
	 * @param rcvrCoNm
	 */
	public void setRcvrCoNm(String rcvrCoNm) {
		this.rcvrCoNm = rcvrCoNm;
	}
	
	/**
	 * Column Info
	 * @param rlseSeq
	 */
	public void setRlseSeq(String rlseSeq) {
		this.rlseSeq = rlseSeq;
	}
	
	/**
	 * Column Info
	 * @param picNm
	 */
	public void setPicNm(String picNm) {
		this.picNm = picNm;
	}
	
	/**
	 * Column Info
	 * @param rcvrCneeNm
	 */
	public void setRcvrCneeNm(String rcvrCneeNm) {
		this.rcvrCneeNm = rcvrCneeNm;
	}
	
	/**
	 * Column Info
	 * @param jpDoSndStsCd
	 */
	public void setJpDoSndStsCd(String jpDoSndStsCd) {
		this.jpDoSndStsCd = jpDoSndStsCd;
	}
	
	/**
	 * Column Info
	 * @param doNo
	 */
	public void setDoNo(String doNo) {
		this.doNo = doNo;
	}
	
	/**
	 * Column Info
	 * @param rcvrEml
	 */
	public void setRcvrEml(String rcvrEml) {
		this.rcvrEml = rcvrEml;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param cgorRmk
	 */
	public void setCgorRmk(String cgorRmk) {
		this.cgorRmk = cgorRmk;
	}
	
	/**
	 * Column Info
	 * @param jpDoId
	 */
	public void setJpDoId(String jpDoId) {
		this.jpDoId = jpDoId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setIdaDoVtyDt(JSPUtil.getParameter(request, "ida_do_vty_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setIdaDoDmdtPayTpCd(JSPUtil.getParameter(request, "ida_do_dmdt_pay_tp_cd", ""));
		setVnCgoDeCd(JSPUtil.getParameter(request, "vn_cgo_de_cd", ""));
		setRcvrPhnNo(JSPUtil.getParameter(request, "rcvr_phn_no", ""));
		setHblNo(JSPUtil.getParameter(request, "hbl_no", ""));
		setDoPrnRmk(JSPUtil.getParameter(request, "do_prn_rmk", ""));
		setRcvrBizNo(JSPUtil.getParameter(request, "rcvr_biz_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCustPrnFlg(JSPUtil.getParameter(request, "cust_prn_flg", ""));
		setDoNoSplit(JSPUtil.getParameter(request, "do_no_split", ""));
		setRcvrFaxNo(JSPUtil.getParameter(request, "rcvr_fax_no", ""));
		setSelfTrnsFlg(JSPUtil.getParameter(request, "self_trns_flg", ""));
		setRcvrCoNm(JSPUtil.getParameter(request, "rcvr_co_nm", ""));
		setRlseSeq(JSPUtil.getParameter(request, "rlse_seq", ""));
		setPicNm(JSPUtil.getParameter(request, "pic_nm", ""));
		setRcvrCneeNm(JSPUtil.getParameter(request, "rcvr_cnee_nm", ""));
		setJpDoSndStsCd(JSPUtil.getParameter(request, "jp_do_snd_sts_cd", ""));
		setDoNo(JSPUtil.getParameter(request, "do_no", ""));
		setRcvrEml(JSPUtil.getParameter(request, "rcvr_eml", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCgorRmk(JSPUtil.getParameter(request, "cgor_rmk", ""));
		setJpDoId(JSPUtil.getParameter(request, "jp_do_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgDoVO[]
	 */
	public BkgDoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgDoVO[]
	 */
	public BkgDoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgDoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] idaDoVtyDt = (JSPUtil.getParameter(request, prefix	+ "ida_do_vty_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] idaDoDmdtPayTpCd = (JSPUtil.getParameter(request, prefix	+ "ida_do_dmdt_pay_tp_cd", length));
			String[] vnCgoDeCd = (JSPUtil.getParameter(request, prefix	+ "vn_cgo_de_cd", length));
			String[] rcvrPhnNo = (JSPUtil.getParameter(request, prefix	+ "rcvr_phn_no", length));
			String[] hblNo = (JSPUtil.getParameter(request, prefix	+ "hbl_no", length));
			String[] doPrnRmk = (JSPUtil.getParameter(request, prefix	+ "do_prn_rmk", length));
			String[] rcvrBizNo = (JSPUtil.getParameter(request, prefix	+ "rcvr_biz_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] custPrnFlg = (JSPUtil.getParameter(request, prefix	+ "cust_prn_flg", length));
			String[] doNoSplit = (JSPUtil.getParameter(request, prefix	+ "do_no_split", length));
			String[] rcvrFaxNo = (JSPUtil.getParameter(request, prefix	+ "rcvr_fax_no", length));
			String[] selfTrnsFlg = (JSPUtil.getParameter(request, prefix	+ "self_trns_flg", length));
			String[] rcvrCoNm = (JSPUtil.getParameter(request, prefix	+ "rcvr_co_nm", length));
			String[] rlseSeq = (JSPUtil.getParameter(request, prefix	+ "rlse_seq", length));
			String[] picNm = (JSPUtil.getParameter(request, prefix	+ "pic_nm", length));
			String[] rcvrCneeNm = (JSPUtil.getParameter(request, prefix	+ "rcvr_cnee_nm", length));
			String[] jpDoSndStsCd = (JSPUtil.getParameter(request, prefix	+ "jp_do_snd_sts_cd", length));
			String[] doNo = (JSPUtil.getParameter(request, prefix	+ "do_no", length));
			String[] rcvrEml = (JSPUtil.getParameter(request, prefix	+ "rcvr_eml", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cgorRmk = (JSPUtil.getParameter(request, prefix	+ "cgor_rmk", length));
			String[] jpDoId = (JSPUtil.getParameter(request, prefix	+ "jp_do_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgDoVO();
				if (idaDoVtyDt[i] != null)
					model.setIdaDoVtyDt(idaDoVtyDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (idaDoDmdtPayTpCd[i] != null)
					model.setIdaDoDmdtPayTpCd(idaDoDmdtPayTpCd[i]);
				if (vnCgoDeCd[i] != null)
					model.setVnCgoDeCd(vnCgoDeCd[i]);
				if (rcvrPhnNo[i] != null)
					model.setRcvrPhnNo(rcvrPhnNo[i]);
				if (hblNo[i] != null)
					model.setHblNo(hblNo[i]);
				if (doPrnRmk[i] != null)
					model.setDoPrnRmk(doPrnRmk[i]);
				if (rcvrBizNo[i] != null)
					model.setRcvrBizNo(rcvrBizNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (custPrnFlg[i] != null)
					model.setCustPrnFlg(custPrnFlg[i]);
				if (doNoSplit[i] != null)
					model.setDoNoSplit(doNoSplit[i]);
				if (rcvrFaxNo[i] != null)
					model.setRcvrFaxNo(rcvrFaxNo[i]);
				if (selfTrnsFlg[i] != null)
					model.setSelfTrnsFlg(selfTrnsFlg[i]);
				if (rcvrCoNm[i] != null)
					model.setRcvrCoNm(rcvrCoNm[i]);
				if (rlseSeq[i] != null)
					model.setRlseSeq(rlseSeq[i]);
				if (picNm[i] != null)
					model.setPicNm(picNm[i]);
				if (rcvrCneeNm[i] != null)
					model.setRcvrCneeNm(rcvrCneeNm[i]);
				if (jpDoSndStsCd[i] != null)
					model.setJpDoSndStsCd(jpDoSndStsCd[i]);
				if (doNo[i] != null)
					model.setDoNo(doNo[i]);
				if (rcvrEml[i] != null)
					model.setRcvrEml(rcvrEml[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cgorRmk[i] != null)
					model.setCgorRmk(cgorRmk[i]);
				if (jpDoId[i] != null)
					model.setJpDoId(jpDoId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgDoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgDoVO[]
	 */
	public BkgDoVO[] getBkgDoVOs(){
		BkgDoVO[] vos = (BkgDoVO[])models.toArray(new BkgDoVO[models.size()]);
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
		this.idaDoVtyDt = this.idaDoVtyDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.idaDoDmdtPayTpCd = this.idaDoDmdtPayTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vnCgoDeCd = this.vnCgoDeCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrPhnNo = this.rcvrPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblNo = this.hblNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doPrnRmk = this.doPrnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrBizNo = this.rcvrBizNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custPrnFlg = this.custPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNoSplit = this.doNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrFaxNo = this.rcvrFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.selfTrnsFlg = this.selfTrnsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrCoNm = this.rcvrCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlseSeq = this.rlseSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.picNm = this.picNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrCneeNm = this.rcvrCneeNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jpDoSndStsCd = this.jpDoSndStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNo = this.doNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrEml = this.rcvrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgorRmk = this.cgorRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jpDoId = this.jpDoId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
