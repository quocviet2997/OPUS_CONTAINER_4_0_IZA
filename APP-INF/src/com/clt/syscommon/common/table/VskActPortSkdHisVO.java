/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskActPortSkdHisVO.java
*@FileTitle : VskActPortSkdHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 정진우
*@LastVersion : 1.0
* 2009.07.23 정진우 
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
 * @author 정진우
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskActPortSkdHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskActPortSkdHisVO> models = new ArrayList<VskActPortSkdHisVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cngSeq = null;
	/* Column Info */
	private String actAtdInpUsrId = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String actBrthDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String actAtbInpDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String actArrDt = null;
	/* Column Info */
	private String actAtbInpUsrId = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String actAtdInpDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* Column Info */
	private String actAtaInpDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String actDepDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String actAtaInpUsrId = null;
	/* Column Info */
	private String updUsrId = null;

	/* Column Info */
	private String hisCreRsnCd = null;
	
	/* Column Info */
	private String lstEtaDt = null;
	/* Column Info */
	private String lstEtbDt = null;
	/* Column Info */
	private String lstEtdDt = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskActPortSkdHisVO() {}

	public VskActPortSkdHisVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String vpsPortCd, String clptIndSeq, String cngSeq, String actArrDt, String actAtaInpUsrId, String actAtaInpDt, String actBrthDt, String actAtbInpUsrId, String actAtbInpDt, String actDepDt, String actAtdInpDt, String actAtdInpUsrId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.cngSeq = cngSeq;
		this.actAtdInpUsrId = actAtdInpUsrId;
		this.vslCd = vslCd;
		this.actBrthDt = actBrthDt;
		this.creDt = creDt;
		this.actAtbInpDt = actAtbInpDt;
		this.skdVoyNo = skdVoyNo;
		this.actArrDt = actArrDt;
		this.actAtbInpUsrId = actAtbInpUsrId;
		this.skdDirCd = skdDirCd;
		this.actAtdInpDt = actAtdInpDt;
		this.pagerows = pagerows;
		this.vpsPortCd = vpsPortCd;
		this.actAtaInpDt = actAtaInpDt;
		this.creUsrId = creUsrId;
		this.actDepDt = actDepDt;
		this.ibflag = ibflag;
		this.clptIndSeq = clptIndSeq;
		this.actAtaInpUsrId = actAtaInpUsrId;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cng_seq", getCngSeq());
		this.hashColumns.put("act_atd_inp_usr_id", getActAtdInpUsrId());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("act_brth_dt", getActBrthDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("act_atb_inp_dt", getActAtbInpDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("act_arr_dt", getActArrDt());
		this.hashColumns.put("act_atb_inp_usr_id", getActAtbInpUsrId());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("act_atd_inp_dt", getActAtdInpDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("act_ata_inp_dt", getActAtaInpDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("act_dep_dt", getActDepDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("act_ata_inp_usr_id", getActAtaInpUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		
		this.hashColumns.put("his_cre_rsn_cd", getHisCreRsnCd());
		this.hashColumns.put("lst_eta_dt"	 , getLstEtaDt());
		this.hashColumns.put("lst_etb_dt"	 , getLstEtbDt());
		this.hashColumns.put("lst_etd_dt"	 , getLstEtdDt());
		
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cng_seq", "cngSeq");
		this.hashFields.put("act_atd_inp_usr_id", "actAtdInpUsrId");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("act_brth_dt", "actBrthDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("act_atb_inp_dt", "actAtbInpDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("act_arr_dt", "actArrDt");
		this.hashFields.put("act_atb_inp_usr_id", "actAtbInpUsrId");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("act_atd_inp_dt", "actAtdInpDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("act_ata_inp_dt", "actAtaInpDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("act_dep_dt", "actDepDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("act_ata_inp_usr_id", "actAtaInpUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		
		this.hashFields.put("his_cre_rsn_cd", "hisCreRsnCd");
		this.hashFields.put("lst_eta_dt"	, "lstEtaDt");
		this.hashFields.put("lst_etb_dt"	, "lstEtbDt");
		this.hashFields.put("lst_etd_dt"	, "lstEtdDt");
		
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
	 * @return cngSeq
	 */
	public String getCngSeq() {
		return this.cngSeq;
	}
	
	/**
	 * Column Info
	 * @return actAtdInpUsrId
	 */
	public String getActAtdInpUsrId() {
		return this.actAtdInpUsrId;
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
	 * @return actBrthDt
	 */
	public String getActBrthDt() {
		return this.actBrthDt;
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
	 * @return actAtbInpDt
	 */
	public String getActAtbInpDt() {
		return this.actAtbInpDt;
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
	 * @return actArrDt
	 */
	public String getActArrDt() {
		return this.actArrDt;
	}
	
	/**
	 * Column Info
	 * @return actAtbInpUsrId
	 */
	public String getActAtbInpUsrId() {
		return this.actAtbInpUsrId;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return actAtdInpDt
	 */
	public String getActAtdInpDt() {
		return this.actAtdInpDt;
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
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @return actAtaInpDt
	 */
	public String getActAtaInpDt() {
		return this.actAtaInpDt;
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
	 * @return actDepDt
	 */
	public String getActDepDt() {
		return this.actDepDt;
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
	 * @return clptIndSeq
	 */
	public String getClptIndSeq() {
		return this.clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @return actAtaInpUsrId
	 */
	public String getActAtaInpUsrId() {
		return this.actAtaInpUsrId;
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
	 * @return hisCreRsnCd
	 */
	public String getHisCreRsnCd() {
		return this.hisCreRsnCd;
	}
	
	/**
	 * Column Info
	 * @return lstEtaDt
	 */
	public String getLstEtaDt() {
		return this.lstEtaDt;
	}
	/**
	 * Column Info
	 * @return lstEtbDt
	 */
	public String getLstEtbDt() {
		return this.lstEtbDt;
	}
	/**
	 * Column Info
	 * @return lstEtdDt
	 */
	public String getLstEtdDt() {
		return this.lstEtdDt;
	}
	

	
	
	/**
	 * Column Info
	 * @param lstEtaDt
	 */
	public void setLstEtaDt(String lstEtaDt) {
		this.lstEtaDt = lstEtaDt;
	}
	/**
	 * Column Info
	 * @param lstEtbDt
	 */
	public void setLstEtbDt(String lstEtbDt) {
		this.lstEtbDt = lstEtbDt;
	}
	/**
	 * Column Info
	 * @param lstEtdDt
	 */
	public void setLstEtdDt(String lstEtdDt) {
		this.lstEtdDt = lstEtdDt;
	}
	
	/**
	 * Column Info
	 * @param hisCreRsnCd
	 */
	public void setHisCreRsnCd(String hisCreRsnCd) {
		this.hisCreRsnCd = hisCreRsnCd;
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
	 * @param cngSeq
	 */
	public void setCngSeq(String cngSeq) {
		this.cngSeq = cngSeq;
	}
	
	/**
	 * Column Info
	 * @param actAtdInpUsrId
	 */
	public void setActAtdInpUsrId(String actAtdInpUsrId) {
		this.actAtdInpUsrId = actAtdInpUsrId;
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
	 * @param actBrthDt
	 */
	public void setActBrthDt(String actBrthDt) {
		this.actBrthDt = actBrthDt;
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
	 * @param actAtbInpDt
	 */
	public void setActAtbInpDt(String actAtbInpDt) {
		this.actAtbInpDt = actAtbInpDt;
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
	 * @param actArrDt
	 */
	public void setActArrDt(String actArrDt) {
		this.actArrDt = actArrDt;
	}
	
	/**
	 * Column Info
	 * @param actAtbInpUsrId
	 */
	public void setActAtbInpUsrId(String actAtbInpUsrId) {
		this.actAtbInpUsrId = actAtbInpUsrId;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param actAtdInpDt
	 */
	public void setActAtdInpDt(String actAtdInpDt) {
		this.actAtdInpDt = actAtdInpDt;
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
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd) {
		this.vpsPortCd = vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @param actAtaInpDt
	 */
	public void setActAtaInpDt(String actAtaInpDt) {
		this.actAtaInpDt = actAtaInpDt;
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
	 * @param actDepDt
	 */
	public void setActDepDt(String actDepDt) {
		this.actDepDt = actDepDt;
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
	 * @param clptIndSeq
	 */
	public void setClptIndSeq(String clptIndSeq) {
		this.clptIndSeq = clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @param actAtaInpUsrId
	 */
	public void setActAtaInpUsrId(String actAtaInpUsrId) {
		this.actAtaInpUsrId = actAtaInpUsrId;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCngSeq(JSPUtil.getParameter(request, "cng_seq", ""));
		setActAtdInpUsrId(JSPUtil.getParameter(request, "act_atd_inp_usr_id", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setActBrthDt(JSPUtil.getParameter(request, "act_brth_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setActAtbInpDt(JSPUtil.getParameter(request, "act_atb_inp_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setActArrDt(JSPUtil.getParameter(request, "act_arr_dt", ""));
		setActAtbInpUsrId(JSPUtil.getParameter(request, "act_atb_inp_usr_id", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setActAtdInpDt(JSPUtil.getParameter(request, "act_atd_inp_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setVpsPortCd(JSPUtil.getParameter(request, "vps_port_cd", ""));
		setActAtaInpDt(JSPUtil.getParameter(request, "act_ata_inp_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setActDepDt(JSPUtil.getParameter(request, "act_dep_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
		setActAtaInpUsrId(JSPUtil.getParameter(request, "act_ata_inp_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		
		setLstEtaDt(JSPUtil.getParameter(request, "lst_eta_dt", ""));
		setLstEtbDt(JSPUtil.getParameter(request, "lst_etb_dt", ""));
		setLstEtdDt(JSPUtil.getParameter(request, "lst_etd_dt", ""));
		
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskActPortSkdHisVO[]
	 */
	public VskActPortSkdHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskActPortSkdHisVO[]
	 */
	public VskActPortSkdHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskActPortSkdHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cngSeq = (JSPUtil.getParameter(request, prefix	+ "cng_seq", length));
			String[] actAtdInpUsrId = (JSPUtil.getParameter(request, prefix	+ "act_atd_inp_usr_id", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] actBrthDt = (JSPUtil.getParameter(request, prefix	+ "act_brth_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] actAtbInpDt = (JSPUtil.getParameter(request, prefix	+ "act_atb_inp_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] actArrDt = (JSPUtil.getParameter(request, prefix	+ "act_arr_dt", length));
			String[] actAtbInpUsrId = (JSPUtil.getParameter(request, prefix	+ "act_atb_inp_usr_id", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] actAtdInpDt = (JSPUtil.getParameter(request, prefix	+ "act_atd_inp_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] actAtaInpDt = (JSPUtil.getParameter(request, prefix	+ "act_ata_inp_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] actDepDt = (JSPUtil.getParameter(request, prefix	+ "act_dep_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] actAtaInpUsrId = (JSPUtil.getParameter(request, prefix	+ "act_ata_inp_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			String[] lstEtaDt = (JSPUtil.getParameter(request, prefix	+ "lst_eta_dt", length));
			String[] lstEtbDt = (JSPUtil.getParameter(request, prefix	+ "lst_etb_dt", length));
			String[] lstEtdDt = (JSPUtil.getParameter(request, prefix	+ "lst_etd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskActPortSkdHisVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cngSeq[i] != null)
					model.setCngSeq(cngSeq[i]);
				if (actAtdInpUsrId[i] != null)
					model.setActAtdInpUsrId(actAtdInpUsrId[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (actBrthDt[i] != null)
					model.setActBrthDt(actBrthDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (actAtbInpDt[i] != null)
					model.setActAtbInpDt(actAtbInpDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (actArrDt[i] != null)
					model.setActArrDt(actArrDt[i]);
				if (actAtbInpUsrId[i] != null)
					model.setActAtbInpUsrId(actAtbInpUsrId[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (actAtdInpDt[i] != null)
					model.setActAtdInpDt(actAtdInpDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (actAtaInpDt[i] != null)
					model.setActAtaInpDt(actAtaInpDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (actDepDt[i] != null)
					model.setActDepDt(actDepDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (actAtaInpUsrId[i] != null)
					model.setActAtaInpUsrId(actAtaInpUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				
				if (lstEtaDt[i] != null)
					model.setLstEtaDt(lstEtaDt[i]);
				if (lstEtbDt[i] != null)
					model.setLstEtbDt(lstEtbDt[i]);
				if (lstEtdDt[i] != null)
					model.setLstEtdDt(lstEtdDt[i]);
				
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskActPortSkdHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskActPortSkdHisVO[]
	 */
	public VskActPortSkdHisVO[] getVskActPortSkdHisVOs(){
		VskActPortSkdHisVO[] vos = (VskActPortSkdHisVO[])models.toArray(new VskActPortSkdHisVO[models.size()]);
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
		this.cngSeq = this.cngSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtdInpUsrId = this.actAtdInpUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBrthDt = this.actBrthDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtbInpDt = this.actAtbInpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actArrDt = this.actArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtbInpUsrId = this.actAtbInpUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtdInpDt = this.actAtdInpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtaInpDt = this.actAtaInpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actDepDt = this.actDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actAtaInpUsrId = this.actAtaInpUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
