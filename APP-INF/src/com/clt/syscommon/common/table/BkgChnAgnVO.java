/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgChnAgnVO.java
*@FileTitle : BkgChnAgnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.08
*@LastModifier : 박성진
*@LastVersion : 1.0
* 2009.12.08 박성진 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 박성진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgChnAgnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgChnAgnVO> models = new ArrayList<BkgChnAgnVO>();
	
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String agnEml = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String agnVndrCdSeq = null;
	/* Column Info */
	private String bkgBlckFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String oldChnAgnCd = null;
	/* Column Info */
	private String chnAgnCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String dirPayOfcCd = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String fincOfcChnBkgAgnCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String autoEmlFlg = null;
	/* Column Info */
	private String autoDpChkFlg = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String agnNm = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String fincOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgChnAgnVO() {}

	public BkgChnAgnVO(String ibflag, String pagerows, String updDt, String vndrCntCd, String autoEmlFlg, String creDt, String autoDpChkFlg, String agnEml, String custSeq, String arOfcCd, String ofcCd, String creUsrId, String diffRmk, String agnNm, String vndrSeq, String chnAgnCd, String fincOfcCd, String updUsrId, String dirPayOfcCd, String custCntCd, String deltFlg, String fincOfcChnBkgAgnCd, String agnVndrCdSeq, String oldChnAgnCd, String bkgBlckFlg) {
		this.vndrCntCd = vndrCntCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.agnEml = agnEml;
		this.pagerows = pagerows;
		this.agnVndrCdSeq = agnVndrCdSeq;
		this.bkgBlckFlg = bkgBlckFlg;
		this.ibflag = ibflag;
		this.oldChnAgnCd = oldChnAgnCd;
		this.chnAgnCd = chnAgnCd;
		this.updUsrId = updUsrId;
		this.dirPayOfcCd = dirPayOfcCd;
		this.custCntCd = custCntCd;
		this.fincOfcChnBkgAgnCd = fincOfcChnBkgAgnCd;
		this.updDt = updDt;
		this.autoEmlFlg = autoEmlFlg;
		this.autoDpChkFlg = autoDpChkFlg;
		this.custSeq = custSeq;
		this.arOfcCd = arOfcCd;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.agnNm = agnNm;
		this.vndrSeq = vndrSeq;
		this.fincOfcCd = fincOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("agn_eml", getAgnEml());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("agn_vndr_cd_seq", getAgnVndrCdSeq());
		this.hashColumns.put("bkg_blck_flg", getBkgBlckFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("old_chn_agn_cd", getOldChnAgnCd());
		this.hashColumns.put("chn_agn_cd", getChnAgnCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dir_pay_ofc_cd", getDirPayOfcCd());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("finc_ofc_chn_bkg_agn_cd", getFincOfcChnBkgAgnCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("auto_eml_flg", getAutoEmlFlg());
		this.hashColumns.put("auto_dp_chk_flg", getAutoDpChkFlg());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("agn_nm", getAgnNm());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("finc_ofc_cd", getFincOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("agn_eml", "agnEml");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("agn_vndr_cd_seq", "agnVndrCdSeq");
		this.hashFields.put("bkg_blck_flg", "bkgBlckFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("old_chn_agn_cd", "oldChnAgnCd");
		this.hashFields.put("chn_agn_cd", "chnAgnCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dir_pay_ofc_cd", "dirPayOfcCd");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("finc_ofc_chn_bkg_agn_cd", "fincOfcChnBkgAgnCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("auto_eml_flg", "autoEmlFlg");
		this.hashFields.put("auto_dp_chk_flg", "autoDpChkFlg");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("agn_nm", "agnNm");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("finc_ofc_cd", "fincOfcCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
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
	 * @return agnEml
	 */
	public String getAgnEml() {
		return this.agnEml;
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
	 * @return agnVndrCdSeq
	 */
	public String getAgnVndrCdSeq() {
		return this.agnVndrCdSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgBlckFlg
	 */
	public String getBkgBlckFlg() {
		return this.bkgBlckFlg;
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
	 * @return oldChnAgnCd
	 */
	public String getOldChnAgnCd() {
		return this.oldChnAgnCd;
	}
	
	/**
	 * Column Info
	 * @return chnAgnCd
	 */
	public String getChnAgnCd() {
		return this.chnAgnCd;
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
	 * @return dirPayOfcCd
	 */
	public String getDirPayOfcCd() {
		return this.dirPayOfcCd;
	}
	
	/**
	 * Column Info
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return fincOfcChnBkgAgnCd
	 */
	public String getFincOfcChnBkgAgnCd() {
		return this.fincOfcChnBkgAgnCd;
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
	 * @return autoEmlFlg
	 */
	public String getAutoEmlFlg() {
		return this.autoEmlFlg;
	}
	
	/**
	 * Column Info
	 * @return autoDpChkFlg
	 */
	public String getAutoDpChkFlg() {
		return this.autoDpChkFlg;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return arOfcCd
	 */
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return agnNm
	 */
	public String getAgnNm() {
		return this.agnNm;
	}
	
	/**
	 * Column Info
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return fincOfcCd
	 */
	public String getFincOfcCd() {
		return this.fincOfcCd;
	}
	

	/**
	 * Column Info
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
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
	 * @param agnEml
	 */
	public void setAgnEml(String agnEml) {
		this.agnEml = agnEml;
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
	 * @param agnVndrCdSeq
	 */
	public void setAgnVndrCdSeq(String agnVndrCdSeq) {
		this.agnVndrCdSeq = agnVndrCdSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgBlckFlg
	 */
	public void setBkgBlckFlg(String bkgBlckFlg) {
		this.bkgBlckFlg = bkgBlckFlg;
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
	 * @param oldChnAgnCd
	 */
	public void setOldChnAgnCd(String oldChnAgnCd) {
		this.oldChnAgnCd = oldChnAgnCd;
	}
	
	/**
	 * Column Info
	 * @param chnAgnCd
	 */
	public void setChnAgnCd(String chnAgnCd) {
		this.chnAgnCd = chnAgnCd;
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
	 * @param dirPayOfcCd
	 */
	public void setDirPayOfcCd(String dirPayOfcCd) {
		this.dirPayOfcCd = dirPayOfcCd;
	}
	
	/**
	 * Column Info
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param fincOfcChnBkgAgnCd
	 */
	public void setFincOfcChnBkgAgnCd(String fincOfcChnBkgAgnCd) {
		this.fincOfcChnBkgAgnCd = fincOfcChnBkgAgnCd;
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
	 * @param autoEmlFlg
	 */
	public void setAutoEmlFlg(String autoEmlFlg) {
		this.autoEmlFlg = autoEmlFlg;
	}
	
	/**
	 * Column Info
	 * @param autoDpChkFlg
	 */
	public void setAutoDpChkFlg(String autoDpChkFlg) {
		this.autoDpChkFlg = autoDpChkFlg;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param arOfcCd
	 */
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param agnNm
	 */
	public void setAgnNm(String agnNm) {
		this.agnNm = agnNm;
	}
	
	/**
	 * Column Info
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param fincOfcCd
	 */
	public void setFincOfcCd(String fincOfcCd) {
		this.fincOfcCd = fincOfcCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAgnEml(JSPUtil.getParameter(request, "agn_eml", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAgnVndrCdSeq(JSPUtil.getParameter(request, "agn_vndr_cd_seq", ""));
		setBkgBlckFlg(JSPUtil.getParameter(request, "bkg_blck_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOldChnAgnCd(JSPUtil.getParameter(request, "old_chn_agn_cd", ""));
		setChnAgnCd(JSPUtil.getParameter(request, "chn_agn_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDirPayOfcCd(JSPUtil.getParameter(request, "dir_pay_ofc_cd", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setFincOfcChnBkgAgnCd(JSPUtil.getParameter(request, "finc_ofc_chn_bkg_agn_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAutoEmlFlg(JSPUtil.getParameter(request, "auto_eml_flg", ""));
		setAutoDpChkFlg(JSPUtil.getParameter(request, "auto_dp_chk_flg", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setAgnNm(JSPUtil.getParameter(request, "agn_nm", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setFincOfcCd(JSPUtil.getParameter(request, "finc_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgChnAgnVO[]
	 */
	public BkgChnAgnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgChnAgnVO[]
	 */
	public BkgChnAgnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgChnAgnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] agnEml = (JSPUtil.getParameter(request, prefix	+ "agn_eml", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] agnVndrCdSeq = (JSPUtil.getParameter(request, prefix	+ "agn_vndr_cd_seq", length));
			String[] bkgBlckFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_blck_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] oldChnAgnCd = (JSPUtil.getParameter(request, prefix	+ "old_chn_agn_cd", length));
			String[] chnAgnCd = (JSPUtil.getParameter(request, prefix	+ "chn_agn_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] dirPayOfcCd = (JSPUtil.getParameter(request, prefix	+ "dir_pay_ofc_cd", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] fincOfcChnBkgAgnCd = (JSPUtil.getParameter(request, prefix	+ "finc_ofc_chn_bkg_agn_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] autoEmlFlg = (JSPUtil.getParameter(request, prefix	+ "auto_eml_flg", length));
			String[] autoDpChkFlg = (JSPUtil.getParameter(request, prefix	+ "auto_dp_chk_flg", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] agnNm = (JSPUtil.getParameter(request, prefix	+ "agn_nm", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] fincOfcCd = (JSPUtil.getParameter(request, prefix	+ "finc_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgChnAgnVO();
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (agnEml[i] != null)
					model.setAgnEml(agnEml[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (agnVndrCdSeq[i] != null)
					model.setAgnVndrCdSeq(agnVndrCdSeq[i]);
				if (bkgBlckFlg[i] != null)
					model.setBkgBlckFlg(bkgBlckFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (oldChnAgnCd[i] != null)
					model.setOldChnAgnCd(oldChnAgnCd[i]);
				if (chnAgnCd[i] != null)
					model.setChnAgnCd(chnAgnCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (dirPayOfcCd[i] != null)
					model.setDirPayOfcCd(dirPayOfcCd[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (fincOfcChnBkgAgnCd[i] != null)
					model.setFincOfcChnBkgAgnCd(fincOfcChnBkgAgnCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (autoEmlFlg[i] != null)
					model.setAutoEmlFlg(autoEmlFlg[i]);
				if (autoDpChkFlg[i] != null)
					model.setAutoDpChkFlg(autoDpChkFlg[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (agnNm[i] != null)
					model.setAgnNm(agnNm[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (fincOfcCd[i] != null)
					model.setFincOfcCd(fincOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgChnAgnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgChnAgnVO[]
	 */
	public BkgChnAgnVO[] getBkgChnAgnVOs(){
		BkgChnAgnVO[] vos = (BkgChnAgnVO[])models.toArray(new BkgChnAgnVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnEml = this.agnEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnVndrCdSeq = this.agnVndrCdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgBlckFlg = this.bkgBlckFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldChnAgnCd = this.oldChnAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chnAgnCd = this.chnAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirPayOfcCd = this.dirPayOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincOfcChnBkgAgnCd = this.fincOfcChnBkgAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoEmlFlg = this.autoEmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoDpChkFlg = this.autoDpChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnNm = this.agnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincOfcCd = this.fincOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
