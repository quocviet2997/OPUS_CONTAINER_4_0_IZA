/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : PriRpScpMnVO.java
*@FileTitle : PriRpScpMnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.11
*@LastModifier : 송민석
*@LastVersion : 1.0
* 2010.05.11 송민석 
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
 * @author 송민석
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriRpScpMnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriRpScpMnVO> models = new ArrayList<PriRpScpMnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String propScpSrepCd = null;
	/* Column Info */
	private String propScpStsCd = null;
	/* Column Info */
	private String prsXchRtYrmon = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrLodUtCd = null;
	/* Column Info */
	private String prsCrntCmAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String prsRtCmpbCalcFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String effDt = null;
	/* Column Info */
	private String prsPropScpMqcQty = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String prsEstmCmAmt = null;
	/* Column Info */
	private String expDt = null;
	/* Column Info */
	private String tgtMvcQty = null;
	/* Column Info */
	private String prsRmnCmAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String propScpOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriRpScpMnVO() {}

	public PriRpScpMnVO(String ibflag, String pagerows, String propNo, String amdtSeq, String svcScpCd, String effDt, String expDt, String propScpSrepCd, String propScpOfcCd, String propScpStsCd, String cntrLodUtCd, String tgtMvcQty, String prsXchRtYrmon, String prsCrntCmAmt, String prsEstmCmAmt, String prsRmnCmAmt, String prsRtCmpbCalcFlg, String creUsrId, String creDt, String updUsrId, String updDt, String prsPropScpMqcQty) {
		this.updDt = updDt;
		this.propScpSrepCd = propScpSrepCd;
		this.propScpStsCd = propScpStsCd;
		this.prsXchRtYrmon = prsXchRtYrmon;
		this.amdtSeq = amdtSeq;
		this.svcScpCd = svcScpCd;
		this.creDt = creDt;
		this.cntrLodUtCd = cntrLodUtCd;
		this.prsCrntCmAmt = prsCrntCmAmt;
		this.pagerows = pagerows;
		this.prsRtCmpbCalcFlg = prsRtCmpbCalcFlg;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.effDt = effDt;
		this.prsPropScpMqcQty = prsPropScpMqcQty;
		this.propNo = propNo;
		this.prsEstmCmAmt = prsEstmCmAmt;
		this.expDt = expDt;
		this.tgtMvcQty = tgtMvcQty;
		this.prsRmnCmAmt = prsRmnCmAmt;
		this.updUsrId = updUsrId;
		this.propScpOfcCd = propScpOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("prop_scp_srep_cd", getPropScpSrepCd());
		this.hashColumns.put("prop_scp_sts_cd", getPropScpStsCd());
		this.hashColumns.put("prs_xch_rt_yrmon", getPrsXchRtYrmon());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_lod_ut_cd", getCntrLodUtCd());
		this.hashColumns.put("prs_crnt_cm_amt", getPrsCrntCmAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prs_rt_cmpb_calc_flg", getPrsRtCmpbCalcFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("prs_prop_scp_mqc_qty", getPrsPropScpMqcQty());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("prs_estm_cm_amt", getPrsEstmCmAmt());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("tgt_mvc_qty", getTgtMvcQty());
		this.hashColumns.put("prs_rmn_cm_amt", getPrsRmnCmAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("prop_scp_ofc_cd", getPropScpOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("prop_scp_srep_cd", "propScpSrepCd");
		this.hashFields.put("prop_scp_sts_cd", "propScpStsCd");
		this.hashFields.put("prs_xch_rt_yrmon", "prsXchRtYrmon");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_lod_ut_cd", "cntrLodUtCd");
		this.hashFields.put("prs_crnt_cm_amt", "prsCrntCmAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("prs_rt_cmpb_calc_flg", "prsRtCmpbCalcFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("prs_prop_scp_mqc_qty", "prsPropScpMqcQty");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("prs_estm_cm_amt", "prsEstmCmAmt");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("tgt_mvc_qty", "tgtMvcQty");
		this.hashFields.put("prs_rmn_cm_amt", "prsRmnCmAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("prop_scp_ofc_cd", "propScpOfcCd");
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
	 * @return propScpSrepCd
	 */
	public String getPropScpSrepCd() {
		return this.propScpSrepCd;
	}
	
	/**
	 * Column Info
	 * @return propScpStsCd
	 */
	public String getPropScpStsCd() {
		return this.propScpStsCd;
	}
	
	/**
	 * Column Info
	 * @return prsXchRtYrmon
	 */
	public String getPrsXchRtYrmon() {
		return this.prsXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @return amdtSeq
	 */
	public String getAmdtSeq() {
		return this.amdtSeq;
	}
	
	/**
	 * Column Info
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
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
	 * @return cntrLodUtCd
	 */
	public String getCntrLodUtCd() {
		return this.cntrLodUtCd;
	}
	
	/**
	 * Column Info
	 * @return prsCrntCmAmt
	 */
	public String getPrsCrntCmAmt() {
		return this.prsCrntCmAmt;
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
	 * @return prsRtCmpbCalcFlg
	 */
	public String getPrsRtCmpbCalcFlg() {
		return this.prsRtCmpbCalcFlg;
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
	 * @return effDt
	 */
	public String getEffDt() {
		return this.effDt;
	}
	
	/**
	 * Column Info
	 * @return prsPropScpMqcQty
	 */
	public String getPrsPropScpMqcQty() {
		return this.prsPropScpMqcQty;
	}
	
	/**
	 * Column Info
	 * @return propNo
	 */
	public String getPropNo() {
		return this.propNo;
	}
	
	/**
	 * Column Info
	 * @return prsEstmCmAmt
	 */
	public String getPrsEstmCmAmt() {
		return this.prsEstmCmAmt;
	}
	
	/**
	 * Column Info
	 * @return expDt
	 */
	public String getExpDt() {
		return this.expDt;
	}
	
	/**
	 * Column Info
	 * @return tgtMvcQty
	 */
	public String getTgtMvcQty() {
		return this.tgtMvcQty;
	}
	
	/**
	 * Column Info
	 * @return prsRmnCmAmt
	 */
	public String getPrsRmnCmAmt() {
		return this.prsRmnCmAmt;
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
	 * @return propScpOfcCd
	 */
	public String getPropScpOfcCd() {
		return this.propScpOfcCd;
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
	 * @param propScpSrepCd
	 */
	public void setPropScpSrepCd(String propScpSrepCd) {
		this.propScpSrepCd = propScpSrepCd;
	}
	
	/**
	 * Column Info
	 * @param propScpStsCd
	 */
	public void setPropScpStsCd(String propScpStsCd) {
		this.propScpStsCd = propScpStsCd;
	}
	
	/**
	 * Column Info
	 * @param prsXchRtYrmon
	 */
	public void setPrsXchRtYrmon(String prsXchRtYrmon) {
		this.prsXchRtYrmon = prsXchRtYrmon;
	}
	
	/**
	 * Column Info
	 * @param amdtSeq
	 */
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
	}
	
	/**
	 * Column Info
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
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
	 * @param cntrLodUtCd
	 */
	public void setCntrLodUtCd(String cntrLodUtCd) {
		this.cntrLodUtCd = cntrLodUtCd;
	}
	
	/**
	 * Column Info
	 * @param prsCrntCmAmt
	 */
	public void setPrsCrntCmAmt(String prsCrntCmAmt) {
		this.prsCrntCmAmt = prsCrntCmAmt;
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
	 * @param prsRtCmpbCalcFlg
	 */
	public void setPrsRtCmpbCalcFlg(String prsRtCmpbCalcFlg) {
		this.prsRtCmpbCalcFlg = prsRtCmpbCalcFlg;
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
	 * @param effDt
	 */
	public void setEffDt(String effDt) {
		this.effDt = effDt;
	}
	
	/**
	 * Column Info
	 * @param prsPropScpMqcQty
	 */
	public void setPrsPropScpMqcQty(String prsPropScpMqcQty) {
		this.prsPropScpMqcQty = prsPropScpMqcQty;
	}
	
	/**
	 * Column Info
	 * @param propNo
	 */
	public void setPropNo(String propNo) {
		this.propNo = propNo;
	}
	
	/**
	 * Column Info
	 * @param prsEstmCmAmt
	 */
	public void setPrsEstmCmAmt(String prsEstmCmAmt) {
		this.prsEstmCmAmt = prsEstmCmAmt;
	}
	
	/**
	 * Column Info
	 * @param expDt
	 */
	public void setExpDt(String expDt) {
		this.expDt = expDt;
	}
	
	/**
	 * Column Info
	 * @param tgtMvcQty
	 */
	public void setTgtMvcQty(String tgtMvcQty) {
		this.tgtMvcQty = tgtMvcQty;
	}
	
	/**
	 * Column Info
	 * @param prsRmnCmAmt
	 */
	public void setPrsRmnCmAmt(String prsRmnCmAmt) {
		this.prsRmnCmAmt = prsRmnCmAmt;
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
	 * @param propScpOfcCd
	 */
	public void setPropScpOfcCd(String propScpOfcCd) {
		this.propScpOfcCd = propScpOfcCd;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPropScpSrepCd(JSPUtil.getParameter(request, prefix + "prop_scp_srep_cd", ""));
		setPropScpStsCd(JSPUtil.getParameter(request, prefix + "prop_scp_sts_cd", ""));
		setPrsXchRtYrmon(JSPUtil.getParameter(request, prefix + "prs_xch_rt_yrmon", ""));
		setAmdtSeq(JSPUtil.getParameter(request, prefix + "amdt_seq", ""));
		setSvcScpCd(JSPUtil.getParameter(request, prefix + "svc_scp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCntrLodUtCd(JSPUtil.getParameter(request, prefix + "cntr_lod_ut_cd", ""));
		setPrsCrntCmAmt(JSPUtil.getParameter(request, prefix + "prs_crnt_cm_amt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPrsRtCmpbCalcFlg(JSPUtil.getParameter(request, prefix + "prs_rt_cmpb_calc_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEffDt(JSPUtil.getParameter(request, prefix + "eff_dt", ""));
		setPrsPropScpMqcQty(JSPUtil.getParameter(request, prefix + "prs_prop_scp_mqc_qty", ""));
		setPropNo(JSPUtil.getParameter(request, prefix + "prop_no", ""));
		setPrsEstmCmAmt(JSPUtil.getParameter(request, prefix + "prs_estm_cm_amt", ""));
		setExpDt(JSPUtil.getParameter(request, prefix + "exp_dt", ""));
		setTgtMvcQty(JSPUtil.getParameter(request, prefix + "tgt_mvc_qty", ""));
		setPrsRmnCmAmt(JSPUtil.getParameter(request, prefix + "prs_rmn_cm_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPropScpOfcCd(JSPUtil.getParameter(request, prefix + "prop_scp_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriRpScpMnVO[]
	 */
	public PriRpScpMnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriRpScpMnVO[]
	 */
	public PriRpScpMnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriRpScpMnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] propScpSrepCd = (JSPUtil.getParameter(request, prefix	+ "prop_scp_srep_cd", length));
			String[] propScpStsCd = (JSPUtil.getParameter(request, prefix	+ "prop_scp_sts_cd", length));
			String[] prsXchRtYrmon = (JSPUtil.getParameter(request, prefix	+ "prs_xch_rt_yrmon", length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntrLodUtCd = (JSPUtil.getParameter(request, prefix	+ "cntr_lod_ut_cd", length));
			String[] prsCrntCmAmt = (JSPUtil.getParameter(request, prefix	+ "prs_crnt_cm_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] prsRtCmpbCalcFlg = (JSPUtil.getParameter(request, prefix	+ "prs_rt_cmpb_calc_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt", length));
			String[] prsPropScpMqcQty = (JSPUtil.getParameter(request, prefix	+ "prs_prop_scp_mqc_qty", length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no", length));
			String[] prsEstmCmAmt = (JSPUtil.getParameter(request, prefix	+ "prs_estm_cm_amt", length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt", length));
			String[] tgtMvcQty = (JSPUtil.getParameter(request, prefix	+ "tgt_mvc_qty", length));
			String[] prsRmnCmAmt = (JSPUtil.getParameter(request, prefix	+ "prs_rmn_cm_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] propScpOfcCd = (JSPUtil.getParameter(request, prefix	+ "prop_scp_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriRpScpMnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (propScpSrepCd[i] != null)
					model.setPropScpSrepCd(propScpSrepCd[i]);
				if (propScpStsCd[i] != null)
					model.setPropScpStsCd(propScpStsCd[i]);
				if (prsXchRtYrmon[i] != null)
					model.setPrsXchRtYrmon(prsXchRtYrmon[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrLodUtCd[i] != null)
					model.setCntrLodUtCd(cntrLodUtCd[i]);
				if (prsCrntCmAmt[i] != null)
					model.setPrsCrntCmAmt(prsCrntCmAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (prsRtCmpbCalcFlg[i] != null)
					model.setPrsRtCmpbCalcFlg(prsRtCmpbCalcFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (prsPropScpMqcQty[i] != null)
					model.setPrsPropScpMqcQty(prsPropScpMqcQty[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (prsEstmCmAmt[i] != null)
					model.setPrsEstmCmAmt(prsEstmCmAmt[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (tgtMvcQty[i] != null)
					model.setTgtMvcQty(tgtMvcQty[i]);
				if (prsRmnCmAmt[i] != null)
					model.setPrsRmnCmAmt(prsRmnCmAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (propScpOfcCd[i] != null)
					model.setPropScpOfcCd(propScpOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriRpScpMnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriRpScpMnVO[]
	 */
	public PriRpScpMnVO[] getPriRpScpMnVOs(){
		PriRpScpMnVO[] vos = (PriRpScpMnVO[])models.toArray(new PriRpScpMnVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propScpSrepCd = this.propScpSrepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propScpStsCd = this.propScpStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsXchRtYrmon = this.prsXchRtYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLodUtCd = this.cntrLodUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsCrntCmAmt = this.prsCrntCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsRtCmpbCalcFlg = this.prsRtCmpbCalcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.effDt = this.effDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsPropScpMqcQty = this.prsPropScpMqcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsEstmCmAmt = this.prsEstmCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expDt = this.expDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tgtMvcQty = this.tgtMvcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prsRmnCmAmt = this.prsRmnCmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propScpOfcCd = this.propScpOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
