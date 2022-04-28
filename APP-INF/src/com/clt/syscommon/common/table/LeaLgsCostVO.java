/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : LeaLgsCostVO.java
*@FileTitle : LeaLgsCostVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.06
*@LastModifier : 전재홍
*@LastVersion : 1.0
* 2009.08.06 전재홍 
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
 * @author 전재홍
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class LeaLgsCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<LeaLgsCostVO> models = new ArrayList<LeaLgsCostVO>();
	
	/* Column Info */
	private String acctNm = null;
	/* Column Info */
	private String repAcctCd = null;
	/* Column Info */
	private String lgsCostAbbrNm = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String acclLgcTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String otrCrrRepAcctCd = null;
	/* Column Info */
	private String otrCrrAcctNm = null;
	/* Column Info */
	private String otrCrrAcctCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String costSrcSysCd = null;
	/* Column Info */
	private String otrCrrAcclAutoCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String interPrcCd = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String subCostTpCd = null;
	/* Column Info */
	private String lgsCostRmk = null;
	/* Column Info */
	private String thrpRtFlg = null;
	/* Column Info */
	private String lgsCostFullNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String acclFlg = null;
	/* Column Info */
	private String oputSeq = null;
	/* Column Info */
	private String acclAutoCd = null;
	/* Column Info */
	private String estmCostFlg = null;
	/* Column Info */
	private String interPrcAcctCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public LeaLgsCostVO() {}

	public LeaLgsCostVO(String ibflag, String pagerows, String coaCostSrcCd, String subCostTpCd, String lgsCostFullNm, String lgsCostAbbrNm, String repAcctCd, String acctCd, String acctNm, String interPrcCd, String interPrcAcctCd, String acclAutoCd, String otrCrrRepAcctCd, String otrCrrAcctCd, String otrCrrAcctNm, String otrCrrAcclAutoCd, String acclFlg, String acclLgcTpCd, String estmCostFlg, String thrpRtFlg, String costSrcSysCd, String oputSeq, String lgsCostRmk, String deltFlg, String creDt, String updDt) {
		this.acctNm = acctNm;
		this.repAcctCd = repAcctCd;
		this.lgsCostAbbrNm = lgsCostAbbrNm;
		this.coaCostSrcCd = coaCostSrcCd;
		this.deltFlg = deltFlg;
		this.acclLgcTpCd = acclLgcTpCd;
		this.creDt = creDt;
		this.otrCrrRepAcctCd = otrCrrRepAcctCd;
		this.otrCrrAcctNm = otrCrrAcctNm;
		this.otrCrrAcctCd = otrCrrAcctCd;
		this.pagerows = pagerows;
		this.costSrcSysCd = costSrcSysCd;
		this.otrCrrAcclAutoCd = otrCrrAcclAutoCd;
		this.ibflag = ibflag;
		this.interPrcCd = interPrcCd;
		this.acctCd = acctCd;
		this.subCostTpCd = subCostTpCd;
		this.lgsCostRmk = lgsCostRmk;
		this.thrpRtFlg = thrpRtFlg;
		this.lgsCostFullNm = lgsCostFullNm;
		this.updDt = updDt;
		this.acclFlg = acclFlg;
		this.oputSeq = oputSeq;
		this.acclAutoCd = acclAutoCd;
		this.estmCostFlg = estmCostFlg;
		this.interPrcAcctCd = interPrcAcctCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("acct_nm", getAcctNm());
		this.hashColumns.put("rep_acct_cd", getRepAcctCd());
		this.hashColumns.put("lgs_cost_abbr_nm", getLgsCostAbbrNm());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("accl_lgc_tp_cd", getAcclLgcTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("otr_crr_rep_acct_cd", getOtrCrrRepAcctCd());
		this.hashColumns.put("otr_crr_acct_nm", getOtrCrrAcctNm());
		this.hashColumns.put("otr_crr_acct_cd", getOtrCrrAcctCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cost_src_sys_cd", getCostSrcSysCd());
		this.hashColumns.put("otr_crr_accl_auto_cd", getOtrCrrAcclAutoCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("inter_prc_cd", getInterPrcCd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("sub_cost_tp_cd", getSubCostTpCd());
		this.hashColumns.put("lgs_cost_rmk", getLgsCostRmk());
		this.hashColumns.put("thrp_rt_flg", getThrpRtFlg());
		this.hashColumns.put("lgs_cost_full_nm", getLgsCostFullNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("accl_flg", getAcclFlg());
		this.hashColumns.put("oput_seq", getOputSeq());
		this.hashColumns.put("accl_auto_cd", getAcclAutoCd());
		this.hashColumns.put("estm_cost_flg", getEstmCostFlg());
		this.hashColumns.put("inter_prc_acct_cd", getInterPrcAcctCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("acct_nm", "acctNm");
		this.hashFields.put("rep_acct_cd", "repAcctCd");
		this.hashFields.put("lgs_cost_abbr_nm", "lgsCostAbbrNm");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("accl_lgc_tp_cd", "acclLgcTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("otr_crr_rep_acct_cd", "otrCrrRepAcctCd");
		this.hashFields.put("otr_crr_acct_nm", "otrCrrAcctNm");
		this.hashFields.put("otr_crr_acct_cd", "otrCrrAcctCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cost_src_sys_cd", "costSrcSysCd");
		this.hashFields.put("otr_crr_accl_auto_cd", "otrCrrAcclAutoCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("inter_prc_cd", "interPrcCd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("sub_cost_tp_cd", "subCostTpCd");
		this.hashFields.put("lgs_cost_rmk", "lgsCostRmk");
		this.hashFields.put("thrp_rt_flg", "thrpRtFlg");
		this.hashFields.put("lgs_cost_full_nm", "lgsCostFullNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("accl_flg", "acclFlg");
		this.hashFields.put("oput_seq", "oputSeq");
		this.hashFields.put("accl_auto_cd", "acclAutoCd");
		this.hashFields.put("estm_cost_flg", "estmCostFlg");
		this.hashFields.put("inter_prc_acct_cd", "interPrcAcctCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return acctNm
	 */
	public String getAcctNm() {
		return this.acctNm;
	}
	
	/**
	 * Column Info
	 * @return repAcctCd
	 */
	public String getRepAcctCd() {
		return this.repAcctCd;
	}
	
	/**
	 * Column Info
	 * @return lgsCostAbbrNm
	 */
	public String getLgsCostAbbrNm() {
		return this.lgsCostAbbrNm;
	}
	
	/**
	 * Column Info
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
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
	 * @return acclLgcTpCd
	 */
	public String getAcclLgcTpCd() {
		return this.acclLgcTpCd;
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
	 * @return otrCrrRepAcctCd
	 */
	public String getOtrCrrRepAcctCd() {
		return this.otrCrrRepAcctCd;
	}
	
	/**
	 * Column Info
	 * @return otrCrrAcctNm
	 */
	public String getOtrCrrAcctNm() {
		return this.otrCrrAcctNm;
	}
	
	/**
	 * Column Info
	 * @return otrCrrAcctCd
	 */
	public String getOtrCrrAcctCd() {
		return this.otrCrrAcctCd;
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
	 * @return costSrcSysCd
	 */
	public String getCostSrcSysCd() {
		return this.costSrcSysCd;
	}
	
	/**
	 * Column Info
	 * @return otrCrrAcclAutoCd
	 */
	public String getOtrCrrAcclAutoCd() {
		return this.otrCrrAcclAutoCd;
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
	 * @return interPrcCd
	 */
	public String getInterPrcCd() {
		return this.interPrcCd;
	}
	
	/**
	 * Column Info
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return subCostTpCd
	 */
	public String getSubCostTpCd() {
		return this.subCostTpCd;
	}
	
	/**
	 * Column Info
	 * @return lgsCostRmk
	 */
	public String getLgsCostRmk() {
		return this.lgsCostRmk;
	}
	
	/**
	 * Column Info
	 * @return thrpRtFlg
	 */
	public String getThrpRtFlg() {
		return this.thrpRtFlg;
	}
	
	/**
	 * Column Info
	 * @return lgsCostFullNm
	 */
	public String getLgsCostFullNm() {
		return this.lgsCostFullNm;
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
	 * @return acclFlg
	 */
	public String getAcclFlg() {
		return this.acclFlg;
	}
	
	/**
	 * Column Info
	 * @return oputSeq
	 */
	public String getOputSeq() {
		return this.oputSeq;
	}
	
	/**
	 * Column Info
	 * @return acclAutoCd
	 */
	public String getAcclAutoCd() {
		return this.acclAutoCd;
	}
	
	/**
	 * Column Info
	 * @return estmCostFlg
	 */
	public String getEstmCostFlg() {
		return this.estmCostFlg;
	}
	
	/**
	 * Column Info
	 * @return interPrcAcctCd
	 */
	public String getInterPrcAcctCd() {
		return this.interPrcAcctCd;
	}
	

	/**
	 * Column Info
	 * @param acctNm
	 */
	public void setAcctNm(String acctNm) {
		this.acctNm = acctNm;
	}
	
	/**
	 * Column Info
	 * @param repAcctCd
	 */
	public void setRepAcctCd(String repAcctCd) {
		this.repAcctCd = repAcctCd;
	}
	
	/**
	 * Column Info
	 * @param lgsCostAbbrNm
	 */
	public void setLgsCostAbbrNm(String lgsCostAbbrNm) {
		this.lgsCostAbbrNm = lgsCostAbbrNm;
	}
	
	/**
	 * Column Info
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
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
	 * @param acclLgcTpCd
	 */
	public void setAcclLgcTpCd(String acclLgcTpCd) {
		this.acclLgcTpCd = acclLgcTpCd;
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
	 * @param otrCrrRepAcctCd
	 */
	public void setOtrCrrRepAcctCd(String otrCrrRepAcctCd) {
		this.otrCrrRepAcctCd = otrCrrRepAcctCd;
	}
	
	/**
	 * Column Info
	 * @param otrCrrAcctNm
	 */
	public void setOtrCrrAcctNm(String otrCrrAcctNm) {
		this.otrCrrAcctNm = otrCrrAcctNm;
	}
	
	/**
	 * Column Info
	 * @param otrCrrAcctCd
	 */
	public void setOtrCrrAcctCd(String otrCrrAcctCd) {
		this.otrCrrAcctCd = otrCrrAcctCd;
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
	 * @param costSrcSysCd
	 */
	public void setCostSrcSysCd(String costSrcSysCd) {
		this.costSrcSysCd = costSrcSysCd;
	}
	
	/**
	 * Column Info
	 * @param otrCrrAcclAutoCd
	 */
	public void setOtrCrrAcclAutoCd(String otrCrrAcclAutoCd) {
		this.otrCrrAcclAutoCd = otrCrrAcclAutoCd;
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
	 * @param interPrcCd
	 */
	public void setInterPrcCd(String interPrcCd) {
		this.interPrcCd = interPrcCd;
	}
	
	/**
	 * Column Info
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param subCostTpCd
	 */
	public void setSubCostTpCd(String subCostTpCd) {
		this.subCostTpCd = subCostTpCd;
	}
	
	/**
	 * Column Info
	 * @param lgsCostRmk
	 */
	public void setLgsCostRmk(String lgsCostRmk) {
		this.lgsCostRmk = lgsCostRmk;
	}
	
	/**
	 * Column Info
	 * @param thrpRtFlg
	 */
	public void setThrpRtFlg(String thrpRtFlg) {
		this.thrpRtFlg = thrpRtFlg;
	}
	
	/**
	 * Column Info
	 * @param lgsCostFullNm
	 */
	public void setLgsCostFullNm(String lgsCostFullNm) {
		this.lgsCostFullNm = lgsCostFullNm;
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
	 * @param acclFlg
	 */
	public void setAcclFlg(String acclFlg) {
		this.acclFlg = acclFlg;
	}
	
	/**
	 * Column Info
	 * @param oputSeq
	 */
	public void setOputSeq(String oputSeq) {
		this.oputSeq = oputSeq;
	}
	
	/**
	 * Column Info
	 * @param acclAutoCd
	 */
	public void setAcclAutoCd(String acclAutoCd) {
		this.acclAutoCd = acclAutoCd;
	}
	
	/**
	 * Column Info
	 * @param estmCostFlg
	 */
	public void setEstmCostFlg(String estmCostFlg) {
		this.estmCostFlg = estmCostFlg;
	}
	
	/**
	 * Column Info
	 * @param interPrcAcctCd
	 */
	public void setInterPrcAcctCd(String interPrcAcctCd) {
		this.interPrcAcctCd = interPrcAcctCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setAcctNm(JSPUtil.getParameter(request, "acct_nm", ""));
		setRepAcctCd(JSPUtil.getParameter(request, "rep_acct_cd", ""));
		setLgsCostAbbrNm(JSPUtil.getParameter(request, "lgs_cost_abbr_nm", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setAcclLgcTpCd(JSPUtil.getParameter(request, "accl_lgc_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setOtrCrrRepAcctCd(JSPUtil.getParameter(request, "otr_crr_rep_acct_cd", ""));
		setOtrCrrAcctNm(JSPUtil.getParameter(request, "otr_crr_acct_nm", ""));
		setOtrCrrAcctCd(JSPUtil.getParameter(request, "otr_crr_acct_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCostSrcSysCd(JSPUtil.getParameter(request, "cost_src_sys_cd", ""));
		setOtrCrrAcclAutoCd(JSPUtil.getParameter(request, "otr_crr_accl_auto_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInterPrcCd(JSPUtil.getParameter(request, "inter_prc_cd", ""));
		setAcctCd(JSPUtil.getParameter(request, "acct_cd", ""));
		setSubCostTpCd(JSPUtil.getParameter(request, "sub_cost_tp_cd", ""));
		setLgsCostRmk(JSPUtil.getParameter(request, "lgs_cost_rmk", ""));
		setThrpRtFlg(JSPUtil.getParameter(request, "thrp_rt_flg", ""));
		setLgsCostFullNm(JSPUtil.getParameter(request, "lgs_cost_full_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAcclFlg(JSPUtil.getParameter(request, "accl_flg", ""));
		setOputSeq(JSPUtil.getParameter(request, "oput_seq", ""));
		setAcclAutoCd(JSPUtil.getParameter(request, "accl_auto_cd", ""));
		setEstmCostFlg(JSPUtil.getParameter(request, "estm_cost_flg", ""));
		setInterPrcAcctCd(JSPUtil.getParameter(request, "inter_prc_acct_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return LeaLgsCostVO[]
	 */
	public LeaLgsCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return LeaLgsCostVO[]
	 */
	public LeaLgsCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		LeaLgsCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] acctNm = (JSPUtil.getParameter(request, prefix	+ "acct_nm", length));
			String[] repAcctCd = (JSPUtil.getParameter(request, prefix	+ "rep_acct_cd", length));
			String[] lgsCostAbbrNm = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_abbr_nm", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] acclLgcTpCd = (JSPUtil.getParameter(request, prefix	+ "accl_lgc_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] otrCrrRepAcctCd = (JSPUtil.getParameter(request, prefix	+ "otr_crr_rep_acct_cd", length));
			String[] otrCrrAcctNm = (JSPUtil.getParameter(request, prefix	+ "otr_crr_acct_nm", length));
			String[] otrCrrAcctCd = (JSPUtil.getParameter(request, prefix	+ "otr_crr_acct_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] costSrcSysCd = (JSPUtil.getParameter(request, prefix	+ "cost_src_sys_cd", length));
			String[] otrCrrAcclAutoCd = (JSPUtil.getParameter(request, prefix	+ "otr_crr_accl_auto_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] interPrcCd = (JSPUtil.getParameter(request, prefix	+ "inter_prc_cd", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] subCostTpCd = (JSPUtil.getParameter(request, prefix	+ "sub_cost_tp_cd", length));
			String[] lgsCostRmk = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_rmk", length));
			String[] thrpRtFlg = (JSPUtil.getParameter(request, prefix	+ "thrp_rt_flg", length));
			String[] lgsCostFullNm = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_full_nm", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] acclFlg = (JSPUtil.getParameter(request, prefix	+ "accl_flg", length));
			String[] oputSeq = (JSPUtil.getParameter(request, prefix	+ "oput_seq", length));
			String[] acclAutoCd = (JSPUtil.getParameter(request, prefix	+ "accl_auto_cd", length));
			String[] estmCostFlg = (JSPUtil.getParameter(request, prefix	+ "estm_cost_flg", length));
			String[] interPrcAcctCd = (JSPUtil.getParameter(request, prefix	+ "inter_prc_acct_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new LeaLgsCostVO();
				if (acctNm[i] != null)
					model.setAcctNm(acctNm[i]);
				if (repAcctCd[i] != null)
					model.setRepAcctCd(repAcctCd[i]);
				if (lgsCostAbbrNm[i] != null)
					model.setLgsCostAbbrNm(lgsCostAbbrNm[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (acclLgcTpCd[i] != null)
					model.setAcclLgcTpCd(acclLgcTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (otrCrrRepAcctCd[i] != null)
					model.setOtrCrrRepAcctCd(otrCrrRepAcctCd[i]);
				if (otrCrrAcctNm[i] != null)
					model.setOtrCrrAcctNm(otrCrrAcctNm[i]);
				if (otrCrrAcctCd[i] != null)
					model.setOtrCrrAcctCd(otrCrrAcctCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (costSrcSysCd[i] != null)
					model.setCostSrcSysCd(costSrcSysCd[i]);
				if (otrCrrAcclAutoCd[i] != null)
					model.setOtrCrrAcclAutoCd(otrCrrAcclAutoCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (interPrcCd[i] != null)
					model.setInterPrcCd(interPrcCd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (subCostTpCd[i] != null)
					model.setSubCostTpCd(subCostTpCd[i]);
				if (lgsCostRmk[i] != null)
					model.setLgsCostRmk(lgsCostRmk[i]);
				if (thrpRtFlg[i] != null)
					model.setThrpRtFlg(thrpRtFlg[i]);
				if (lgsCostFullNm[i] != null)
					model.setLgsCostFullNm(lgsCostFullNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (acclFlg[i] != null)
					model.setAcclFlg(acclFlg[i]);
				if (oputSeq[i] != null)
					model.setOputSeq(oputSeq[i]);
				if (acclAutoCd[i] != null)
					model.setAcclAutoCd(acclAutoCd[i]);
				if (estmCostFlg[i] != null)
					model.setEstmCostFlg(estmCostFlg[i]);
				if (interPrcAcctCd[i] != null)
					model.setInterPrcAcctCd(interPrcAcctCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getLeaLgsCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return LeaLgsCostVO[]
	 */
	public LeaLgsCostVO[] getLeaLgsCostVOs(){
		LeaLgsCostVO[] vos = (LeaLgsCostVO[])models.toArray(new LeaLgsCostVO[models.size()]);
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
		this.acctNm = this.acctNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repAcctCd = this.repAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostAbbrNm = this.lgsCostAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclLgcTpCd = this.acclLgcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCrrRepAcctCd = this.otrCrrRepAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCrrAcctNm = this.otrCrrAcctNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCrrAcctCd = this.otrCrrAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costSrcSysCd = this.costSrcSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrCrrAcclAutoCd = this.otrCrrAcclAutoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interPrcCd = this.interPrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subCostTpCd = this.subCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostRmk = this.lgsCostRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thrpRtFlg = this.thrpRtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostFullNm = this.lgsCostFullNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclFlg = this.acclFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oputSeq = this.oputSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclAutoCd = this.acclAutoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCostFlg = this.estmCostFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interPrcAcctCd = this.interPrcAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
