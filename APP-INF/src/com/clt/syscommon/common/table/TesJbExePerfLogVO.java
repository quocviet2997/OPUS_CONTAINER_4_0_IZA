/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesJbExePerfLogVO.java
*@FileTitle : TesJbExePerfLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.09.25 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesJbExePerfLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesJbExePerfLogVO> models = new ArrayList<TesJbExePerfLogVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tmlAgmtOfcCtyCd = null;
	/* Column Info */
	private String exeFmDt = null;
	/* Column Info */
	private String exeUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String funcDivCd = null;
	/* Column Info */
	private String jbParaCtnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String perfRmk = null;
	/* Column Info */
	private String exeRowKnt = null;
	/* Column Info */
	private String tmlAgmtVerNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String exeStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pgmUrl = null;
	/* Column Info */
	private String exePerfLogSeq = null;
	/* Column Info */
	private String tmlAgmtSeq = null;
	/* Column Info */
	private String jbTpCd = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String exeToDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invOfcCd = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesJbExePerfLogVO() {}

	public TesJbExePerfLogVO(String ibflag, String pagerows, String exePerfLogSeq, String jbTpCd, String invOfcCd, String exeUsrId, String pgmUrl, String funcDivCd, String tmlSoOfcCtyCd, String tmlSoSeq, String tmlAgmtOfcCtyCd, String tmlAgmtSeq, String tmlAgmtVerNo, String exeStsCd, String exeFmDt, String exeToDt, String exeRowKnt, String jbParaCtnt, String perfRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
		this.exeFmDt = exeFmDt;
		this.exeUsrId = exeUsrId;
		this.creDt = creDt;
		this.funcDivCd = funcDivCd;
		this.jbParaCtnt = jbParaCtnt;
		this.pagerows = pagerows;
		this.perfRmk = perfRmk;
		this.exeRowKnt = exeRowKnt;
		this.tmlAgmtVerNo = tmlAgmtVerNo;
		this.creUsrId = creUsrId;
		this.exeStsCd = exeStsCd;
		this.ibflag = ibflag;
		this.pgmUrl = pgmUrl;
		this.exePerfLogSeq = exePerfLogSeq;
		this.tmlAgmtSeq = tmlAgmtSeq;
		this.jbTpCd = jbTpCd;
		this.tmlSoSeq = tmlSoSeq;
		this.exeToDt = exeToDt;
		this.updUsrId = updUsrId;
		this.invOfcCd = invOfcCd;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tml_agmt_ofc_cty_cd", getTmlAgmtOfcCtyCd());
		this.hashColumns.put("exe_fm_dt", getExeFmDt());
		this.hashColumns.put("exe_usr_id", getExeUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("func_div_cd", getFuncDivCd());
		this.hashColumns.put("jb_para_ctnt", getJbParaCtnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("perf_rmk", getPerfRmk());
		this.hashColumns.put("exe_row_knt", getExeRowKnt());
		this.hashColumns.put("tml_agmt_ver_no", getTmlAgmtVerNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("exe_sts_cd", getExeStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pgm_url", getPgmUrl());
		this.hashColumns.put("exe_perf_log_seq", getExePerfLogSeq());
		this.hashColumns.put("tml_agmt_seq", getTmlAgmtSeq());
		this.hashColumns.put("jb_tp_cd", getJbTpCd());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("exe_to_dt", getExeToDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tml_agmt_ofc_cty_cd", "tmlAgmtOfcCtyCd");
		this.hashFields.put("exe_fm_dt", "exeFmDt");
		this.hashFields.put("exe_usr_id", "exeUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("func_div_cd", "funcDivCd");
		this.hashFields.put("jb_para_ctnt", "jbParaCtnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("perf_rmk", "perfRmk");
		this.hashFields.put("exe_row_knt", "exeRowKnt");
		this.hashFields.put("tml_agmt_ver_no", "tmlAgmtVerNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("exe_sts_cd", "exeStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pgm_url", "pgmUrl");
		this.hashFields.put("exe_perf_log_seq", "exePerfLogSeq");
		this.hashFields.put("tml_agmt_seq", "tmlAgmtSeq");
		this.hashFields.put("jb_tp_cd", "jbTpCd");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("exe_to_dt", "exeToDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
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
	 * @return tmlAgmtOfcCtyCd
	 */
	public String getTmlAgmtOfcCtyCd() {
		return this.tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return exeFmDt
	 */
	public String getExeFmDt() {
		return this.exeFmDt;
	}
	
	/**
	 * Column Info
	 * @return exeUsrId
	 */
	public String getExeUsrId() {
		return this.exeUsrId;
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
	 * @return funcDivCd
	 */
	public String getFuncDivCd() {
		return this.funcDivCd;
	}
	
	/**
	 * Column Info
	 * @return jbParaCtnt
	 */
	public String getJbParaCtnt() {
		return this.jbParaCtnt;
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
	 * @return perfRmk
	 */
	public String getPerfRmk() {
		return this.perfRmk;
	}
	
	/**
	 * Column Info
	 * @return exeRowKnt
	 */
	public String getExeRowKnt() {
		return this.exeRowKnt;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtVerNo
	 */
	public String getTmlAgmtVerNo() {
		return this.tmlAgmtVerNo;
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
	 * @return exeStsCd
	 */
	public String getExeStsCd() {
		return this.exeStsCd;
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
	 * @return pgmUrl
	 */
	public String getPgmUrl() {
		return this.pgmUrl;
	}
	
	/**
	 * Column Info
	 * @return exePerfLogSeq
	 */
	public String getExePerfLogSeq() {
		return this.exePerfLogSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtSeq
	 */
	public String getTmlAgmtSeq() {
		return this.tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return jbTpCd
	 */
	public String getJbTpCd() {
		return this.jbTpCd;
	}
	
	/**
	 * Column Info
	 * @return tmlSoSeq
	 */
	public String getTmlSoSeq() {
		return this.tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @return exeToDt
	 */
	public String getExeToDt() {
		return this.exeToDt;
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
	 * @return invOfcCd
	 */
	public String getInvOfcCd() {
		return this.invOfcCd;
	}
	
	/**
	 * Column Info
	 * @return tmlSoOfcCtyCd
	 */
	public String getTmlSoOfcCtyCd() {
		return this.tmlSoOfcCtyCd;
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
	 * @param tmlAgmtOfcCtyCd
	 */
	public void setTmlAgmtOfcCtyCd(String tmlAgmtOfcCtyCd) {
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param exeFmDt
	 */
	public void setExeFmDt(String exeFmDt) {
		this.exeFmDt = exeFmDt;
	}
	
	/**
	 * Column Info
	 * @param exeUsrId
	 */
	public void setExeUsrId(String exeUsrId) {
		this.exeUsrId = exeUsrId;
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
	 * @param funcDivCd
	 */
	public void setFuncDivCd(String funcDivCd) {
		this.funcDivCd = funcDivCd;
	}
	
	/**
	 * Column Info
	 * @param jbParaCtnt
	 */
	public void setJbParaCtnt(String jbParaCtnt) {
		this.jbParaCtnt = jbParaCtnt;
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
	 * @param perfRmk
	 */
	public void setPerfRmk(String perfRmk) {
		this.perfRmk = perfRmk;
	}
	
	/**
	 * Column Info
	 * @param exeRowKnt
	 */
	public void setExeRowKnt(String exeRowKnt) {
		this.exeRowKnt = exeRowKnt;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtVerNo
	 */
	public void setTmlAgmtVerNo(String tmlAgmtVerNo) {
		this.tmlAgmtVerNo = tmlAgmtVerNo;
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
	 * @param exeStsCd
	 */
	public void setExeStsCd(String exeStsCd) {
		this.exeStsCd = exeStsCd;
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
	 * @param pgmUrl
	 */
	public void setPgmUrl(String pgmUrl) {
		this.pgmUrl = pgmUrl;
	}
	
	/**
	 * Column Info
	 * @param exePerfLogSeq
	 */
	public void setExePerfLogSeq(String exePerfLogSeq) {
		this.exePerfLogSeq = exePerfLogSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtSeq
	 */
	public void setTmlAgmtSeq(String tmlAgmtSeq) {
		this.tmlAgmtSeq = tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param jbTpCd
	 */
	public void setJbTpCd(String jbTpCd) {
		this.jbTpCd = jbTpCd;
	}
	
	/**
	 * Column Info
	 * @param tmlSoSeq
	 */
	public void setTmlSoSeq(String tmlSoSeq) {
		this.tmlSoSeq = tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @param exeToDt
	 */
	public void setExeToDt(String exeToDt) {
		this.exeToDt = exeToDt;
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
	 * @param invOfcCd
	 */
	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
	}
	
	/**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
	public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTmlAgmtOfcCtyCd(JSPUtil.getParameter(request, "tml_agmt_ofc_cty_cd", ""));
		setExeFmDt(JSPUtil.getParameter(request, "exe_fm_dt", ""));
		setExeUsrId(JSPUtil.getParameter(request, "exe_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFuncDivCd(JSPUtil.getParameter(request, "func_div_cd", ""));
		setJbParaCtnt(JSPUtil.getParameter(request, "jb_para_ctnt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPerfRmk(JSPUtil.getParameter(request, "perf_rmk", ""));
		setExeRowKnt(JSPUtil.getParameter(request, "exe_row_knt", ""));
		setTmlAgmtVerNo(JSPUtil.getParameter(request, "tml_agmt_ver_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setExeStsCd(JSPUtil.getParameter(request, "exe_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPgmUrl(JSPUtil.getParameter(request, "pgm_url", ""));
		setExePerfLogSeq(JSPUtil.getParameter(request, "exe_perf_log_seq", ""));
		setTmlAgmtSeq(JSPUtil.getParameter(request, "tml_agmt_seq", ""));
		setJbTpCd(JSPUtil.getParameter(request, "jb_tp_cd", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, "tml_so_seq", ""));
		setExeToDt(JSPUtil.getParameter(request, "exe_to_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setInvOfcCd(JSPUtil.getParameter(request, "inv_ofc_cd", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, "tml_so_ofc_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesJbExePerfLogVO[]
	 */
	public TesJbExePerfLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesJbExePerfLogVO[]
	 */
	public TesJbExePerfLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesJbExePerfLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tmlAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ofc_cty_cd", length));
			String[] exeFmDt = (JSPUtil.getParameter(request, prefix	+ "exe_fm_dt", length));
			String[] exeUsrId = (JSPUtil.getParameter(request, prefix	+ "exe_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] funcDivCd = (JSPUtil.getParameter(request, prefix	+ "func_div_cd", length));
			String[] jbParaCtnt = (JSPUtil.getParameter(request, prefix	+ "jb_para_ctnt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] perfRmk = (JSPUtil.getParameter(request, prefix	+ "perf_rmk", length));
			String[] exeRowKnt = (JSPUtil.getParameter(request, prefix	+ "exe_row_knt", length));
			String[] tmlAgmtVerNo = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ver_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] exeStsCd = (JSPUtil.getParameter(request, prefix	+ "exe_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pgmUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_url", length));
			String[] exePerfLogSeq = (JSPUtil.getParameter(request, prefix	+ "exe_perf_log_seq", length));
			String[] tmlAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_seq", length));
			String[] jbTpCd = (JSPUtil.getParameter(request, prefix	+ "jb_tp_cd", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] exeToDt = (JSPUtil.getParameter(request, prefix	+ "exe_to_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesJbExePerfLogVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tmlAgmtOfcCtyCd[i] != null)
					model.setTmlAgmtOfcCtyCd(tmlAgmtOfcCtyCd[i]);
				if (exeFmDt[i] != null)
					model.setExeFmDt(exeFmDt[i]);
				if (exeUsrId[i] != null)
					model.setExeUsrId(exeUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (funcDivCd[i] != null)
					model.setFuncDivCd(funcDivCd[i]);
				if (jbParaCtnt[i] != null)
					model.setJbParaCtnt(jbParaCtnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (perfRmk[i] != null)
					model.setPerfRmk(perfRmk[i]);
				if (exeRowKnt[i] != null)
					model.setExeRowKnt(exeRowKnt[i]);
				if (tmlAgmtVerNo[i] != null)
					model.setTmlAgmtVerNo(tmlAgmtVerNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (exeStsCd[i] != null)
					model.setExeStsCd(exeStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pgmUrl[i] != null)
					model.setPgmUrl(pgmUrl[i]);
				if (exePerfLogSeq[i] != null)
					model.setExePerfLogSeq(exePerfLogSeq[i]);
				if (tmlAgmtSeq[i] != null)
					model.setTmlAgmtSeq(tmlAgmtSeq[i]);
				if (jbTpCd[i] != null)
					model.setJbTpCd(jbTpCd[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (exeToDt[i] != null)
					model.setExeToDt(exeToDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesJbExePerfLogVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesJbExePerfLogVO[]
	 */
	public TesJbExePerfLogVO[] getTesJbExePerfLogVOs(){
		TesJbExePerfLogVO[] vos = (TesJbExePerfLogVO[])models.toArray(new TesJbExePerfLogVO[models.size()]);
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
		this.tmlAgmtOfcCtyCd = this.tmlAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeFmDt = this.exeFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeUsrId = this.exeUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.funcDivCd = this.funcDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbParaCtnt = this.jbParaCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.perfRmk = this.perfRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeRowKnt = this.exeRowKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtVerNo = this.tmlAgmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeStsCd = this.exeStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmUrl = this.pgmUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exePerfLogSeq = this.exePerfLogSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtSeq = this.tmlAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbTpCd = this.jbTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeToDt = this.exeToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
