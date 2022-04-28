/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrEqRepoPlnVO.java
*@FileTitle : EqrEqRepoPlnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 채창호
*@LastVersion : 1.0
* 2009.07.28 채창호 
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
 * @author 채창호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrEqRepoPlnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrEqRepoPlnVO> models = new ArrayList<EqrEqRepoPlnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String engRunCmplFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String engRunEndYrwk = null;
	/* Column Info */
	private String engRunStYrwk = null;
	/* Column Info */
	private String inclOffhFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String repoPlnId = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String inclOnhFlg = null;
	/* Column Info */
	private String repoPlnAutoGenFlg = null;
	/* Column Info */
	private String engRunInfeasFlg = null;
	/* Column Info */
	private String simPlnSnsCd = null;
	/* Column Info */
	private String repoPlnDtrbFlg = null;
	/* Column Info */
	private String simPlnId = null;
	/* Column Info */
	private String inclCntrTpszCtnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String simPlnSnsObjCd = null;
	/* Column Info */
	private String repoPlnRmk = null;
	/* Column Info */
	private String status = null;
	/* Column Info */
	private String repoPlnLst = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrEqRepoPlnVO() {}

	public EqrEqRepoPlnVO(String ibflag, String pagerows, String repoPlnId, String scnrId, String inclOnhFlg, String inclOffhFlg, String repoPlnAutoGenFlg, String repoPlnDtrbFlg, String simPlnId, String inclCntrTpszCtnt, String engRunCmplFlg, String repoPlnRmk, String deltFlg, String simPlnSnsCd, String simPlnSnsObjCd, String engRunStYrwk, String engRunEndYrwk, String engRunInfeasFlg, String creUsrId, String creDt, String updUsrId, String updDt, String repoPlnLst) {
		this.updDt = updDt;
		this.scnrId = scnrId;
		this.deltFlg = deltFlg;
		this.engRunCmplFlg = engRunCmplFlg;
		this.creDt = creDt;
		this.engRunEndYrwk = engRunEndYrwk;
		this.engRunStYrwk = engRunStYrwk;
		this.inclOffhFlg = inclOffhFlg;
		this.pagerows = pagerows;
		this.repoPlnId = repoPlnId;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.inclOnhFlg = inclOnhFlg;
		this.repoPlnAutoGenFlg = repoPlnAutoGenFlg;
		this.engRunInfeasFlg = engRunInfeasFlg;
		this.simPlnSnsCd = simPlnSnsCd;
		this.repoPlnDtrbFlg = repoPlnDtrbFlg;
		this.simPlnId = simPlnId;
		this.inclCntrTpszCtnt = inclCntrTpszCtnt;
		this.updUsrId = updUsrId;
		this.simPlnSnsObjCd = simPlnSnsObjCd;
		this.repoPlnRmk = repoPlnRmk;
		this.repoPlnLst = repoPlnLst;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("eng_run_cmpl_flg", getEngRunCmplFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eng_run_end_yrwk", getEngRunEndYrwk());
		this.hashColumns.put("eng_run_st_yrwk", getEngRunStYrwk());
		this.hashColumns.put("incl_offh_flg", getInclOffhFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("repo_pln_id", getRepoPlnId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("incl_onh_flg", getInclOnhFlg());
		this.hashColumns.put("repo_pln_auto_gen_flg", getRepoPlnAutoGenFlg());
		this.hashColumns.put("eng_run_infeas_flg", getEngRunInfeasFlg());
		this.hashColumns.put("sim_pln_sns_cd", getSimPlnSnsCd());
		this.hashColumns.put("repo_pln_dtrb_flg", getRepoPlnDtrbFlg());
		this.hashColumns.put("sim_pln_id", getSimPlnId());
		this.hashColumns.put("incl_cntr_tpsz_ctnt", getInclCntrTpszCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sim_pln_sns_obj_cd", getSimPlnSnsObjCd());
		this.hashColumns.put("repo_pln_rmk", getRepoPlnRmk());
		this.hashColumns.put("status", getStatus());
		this.hashColumns.put("repo_pln_lst", getRepoPlnLst());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("eng_run_cmpl_flg", "engRunCmplFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eng_run_end_yrwk", "engRunEndYrwk");
		this.hashFields.put("eng_run_st_yrwk", "engRunStYrwk");
		this.hashFields.put("incl_offh_flg", "inclOffhFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("repo_pln_id", "repoPlnId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("incl_onh_flg", "inclOnhFlg");
		this.hashFields.put("repo_pln_auto_gen_flg", "repoPlnAutoGenFlg");
		this.hashFields.put("eng_run_infeas_flg", "engRunInfeasFlg");
		this.hashFields.put("sim_pln_sns_cd", "simPlnSnsCd");
		this.hashFields.put("repo_pln_dtrb_flg", "repoPlnDtrbFlg");
		this.hashFields.put("sim_pln_id", "simPlnId");
		this.hashFields.put("incl_cntr_tpsz_ctnt", "inclCntrTpszCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sim_pln_sns_obj_cd", "simPlnSnsObjCd");
		this.hashFields.put("repo_pln_rmk", "repoPlnRmk");
		this.hashFields.put("status", "status");
		this.hashFields.put("repo_pln_lst", "repoPlnLst");
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
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
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
	 * @return engRunCmplFlg
	 */
	public String getEngRunCmplFlg() {
		return this.engRunCmplFlg;
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
	 * @return engRunEndYrwk
	 */
	public String getEngRunEndYrwk() {
		return this.engRunEndYrwk;
	}
	
	/**
	 * Column Info
	 * @return engRunStYrwk
	 */
	public String getEngRunStYrwk() {
		return this.engRunStYrwk;
	}
	
	/**
	 * Column Info
	 * @return inclOffhFlg
	 */
	public String getInclOffhFlg() {
		return this.inclOffhFlg;
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
	 * @return repoPlnId
	 */
	public String getRepoPlnId() {
		return this.repoPlnId;
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
	 * @return inclOnhFlg
	 */
	public String getInclOnhFlg() {
		return this.inclOnhFlg;
	}
	
	/**
	 * Column Info
	 * @return repoPlnAutoGenFlg
	 */
	public String getRepoPlnAutoGenFlg() {
		return this.repoPlnAutoGenFlg;
	}
	
	/**
	 * Column Info
	 * @return engRunInfeasFlg
	 */
	public String getEngRunInfeasFlg() {
		return this.engRunInfeasFlg;
	}
	
	/**
	 * Column Info
	 * @return simPlnSnsCd
	 */
	public String getSimPlnSnsCd() {
		return this.simPlnSnsCd;
	}
	
	/**
	 * Column Info
	 * @return repoPlnDtrbFlg
	 */
	public String getRepoPlnDtrbFlg() {
		return this.repoPlnDtrbFlg;
	}
	
	/**
	 * Column Info
	 * @return simPlnId
	 */
	public String getSimPlnId() {
		return this.simPlnId;
	}
	
	/**
	 * Column Info
	 * @return inclCntrTpszCtnt
	 */
	public String getInclCntrTpszCtnt() {
		return this.inclCntrTpszCtnt;
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
	 * @return simPlnSnsObjCd
	 */
	public String getSimPlnSnsObjCd() {
		return this.simPlnSnsObjCd;
	}
	
	/**
	 * Column Info
	 * @return repoPlnRmk
	 */
	public String getRepoPlnRmk() {
		return this.repoPlnRmk;
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
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
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
	 * @param engRunCmplFlg
	 */
	public void setEngRunCmplFlg(String engRunCmplFlg) {
		this.engRunCmplFlg = engRunCmplFlg;
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
	 * @param engRunEndYrwk
	 */
	public void setEngRunEndYrwk(String engRunEndYrwk) {
		this.engRunEndYrwk = engRunEndYrwk;
	}
	
	/**
	 * Column Info
	 * @param engRunStYrwk
	 */
	public void setEngRunStYrwk(String engRunStYrwk) {
		this.engRunStYrwk = engRunStYrwk;
	}
	
	/**
	 * Column Info
	 * @param inclOffhFlg
	 */
	public void setInclOffhFlg(String inclOffhFlg) {
		this.inclOffhFlg = inclOffhFlg;
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
	 * @param repoPlnId
	 */
	public void setRepoPlnId(String repoPlnId) {
		this.repoPlnId = repoPlnId;
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
	 * @param inclOnhFlg
	 */
	public void setInclOnhFlg(String inclOnhFlg) {
		this.inclOnhFlg = inclOnhFlg;
	}
	
	/**
	 * Column Info
	 * @param repoPlnAutoGenFlg
	 */
	public void setRepoPlnAutoGenFlg(String repoPlnAutoGenFlg) {
		this.repoPlnAutoGenFlg = repoPlnAutoGenFlg;
	}
	
	/**
	 * Column Info
	 * @param engRunInfeasFlg
	 */
	public void setEngRunInfeasFlg(String engRunInfeasFlg) {
		this.engRunInfeasFlg = engRunInfeasFlg;
	}
	
	/**
	 * Column Info
	 * @param simPlnSnsCd
	 */
	public void setSimPlnSnsCd(String simPlnSnsCd) {
		this.simPlnSnsCd = simPlnSnsCd;
	}
	
	/**
	 * Column Info
	 * @param repoPlnDtrbFlg
	 */
	public void setRepoPlnDtrbFlg(String repoPlnDtrbFlg) {
		this.repoPlnDtrbFlg = repoPlnDtrbFlg;
	}
	
	/**
	 * Column Info
	 * @param simPlnId
	 */
	public void setSimPlnId(String simPlnId) {
		this.simPlnId = simPlnId;
	}
	
	/**
	 * Column Info
	 * @param inclCntrTpszCtnt
	 */
	public void setInclCntrTpszCtnt(String inclCntrTpszCtnt) {
		this.inclCntrTpszCtnt = inclCntrTpszCtnt;
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
	 * @param simPlnSnsObjCd
	 */
	public void setSimPlnSnsObjCd(String simPlnSnsObjCd) {
		this.simPlnSnsObjCd = simPlnSnsObjCd;
	}
	
	/**
	 * Column Info
	 * @param repoPlnRmk
	 */
	public void setRepoPlnRmk(String repoPlnRmk) {
		this.repoPlnRmk = repoPlnRmk;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getRepoPlnLst() {
		return repoPlnLst;
	}

	public void setRepoPlnLst(String repoPlnLst) {
		this.repoPlnLst = repoPlnLst;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setEngRunCmplFlg(JSPUtil.getParameter(request, "eng_run_cmpl_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEngRunEndYrwk(JSPUtil.getParameter(request, "eng_run_end_yrwk", ""));
		setEngRunStYrwk(JSPUtil.getParameter(request, "eng_run_st_yrwk", ""));
		setInclOffhFlg(JSPUtil.getParameter(request, "incl_offh_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRepoPlnId(JSPUtil.getParameter(request, "repo_pln_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setInclOnhFlg(JSPUtil.getParameter(request, "incl_onh_flg", ""));
		setRepoPlnAutoGenFlg(JSPUtil.getParameter(request, "repo_pln_auto_gen_flg", ""));
		setEngRunInfeasFlg(JSPUtil.getParameter(request, "eng_run_infeas_flg", ""));
		setSimPlnSnsCd(JSPUtil.getParameter(request, "sim_pln_sns_cd", ""));
		setRepoPlnDtrbFlg(JSPUtil.getParameter(request, "repo_pln_dtrb_flg", ""));
		setSimPlnId(JSPUtil.getParameter(request, "sim_pln_id", ""));
		setInclCntrTpszCtnt(JSPUtil.getParameter(request, "incl_cntr_tpsz_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSimPlnSnsObjCd(JSPUtil.getParameter(request, "sim_pln_sns_obj_cd", ""));
		setRepoPlnRmk(JSPUtil.getParameter(request, "repo_pln_rmk", ""));
		setRepoPlnLst(JSPUtil.getParameter(request, "repo_pln_lst", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrEqRepoPlnVO[]
	 */
	public EqrEqRepoPlnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrEqRepoPlnVO[]
	 */
	public EqrEqRepoPlnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrEqRepoPlnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] engRunCmplFlg = (JSPUtil.getParameter(request, prefix	+ "eng_run_cmpl_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] engRunEndYrwk = (JSPUtil.getParameter(request, prefix	+ "eng_run_end_yrwk", length));
			String[] engRunStYrwk = (JSPUtil.getParameter(request, prefix	+ "eng_run_st_yrwk", length));
			String[] inclOffhFlg = (JSPUtil.getParameter(request, prefix	+ "incl_offh_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] repoPlnId = (JSPUtil.getParameter(request, prefix	+ "repo_pln_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] inclOnhFlg = (JSPUtil.getParameter(request, prefix	+ "incl_onh_flg", length));
			String[] repoPlnAutoGenFlg = (JSPUtil.getParameter(request, prefix	+ "repo_pln_auto_gen_flg", length));
			String[] engRunInfeasFlg = (JSPUtil.getParameter(request, prefix	+ "eng_run_infeas_flg", length));
			String[] simPlnSnsCd = (JSPUtil.getParameter(request, prefix	+ "sim_pln_sns_cd", length));
			String[] repoPlnDtrbFlg = (JSPUtil.getParameter(request, prefix	+ "repo_pln_dtrb_flg", length));
			String[] simPlnId = (JSPUtil.getParameter(request, prefix	+ "sim_pln_id", length));
			String[] inclCntrTpszCtnt = (JSPUtil.getParameter(request, prefix	+ "incl_cntr_tpsz_ctnt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] simPlnSnsObjCd = (JSPUtil.getParameter(request, prefix	+ "sim_pln_sns_obj_cd", length));
			String[] repoPlnRmk = (JSPUtil.getParameter(request, prefix	+ "repo_pln_rmk", length));
			String[] repoPlnLst = (JSPUtil.getParameter(request, prefix	+ "repo_pln_lst", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrEqRepoPlnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (engRunCmplFlg[i] != null)
					model.setEngRunCmplFlg(engRunCmplFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (engRunEndYrwk[i] != null)
					model.setEngRunEndYrwk(engRunEndYrwk[i]);
				if (engRunStYrwk[i] != null)
					model.setEngRunStYrwk(engRunStYrwk[i]);
				if (inclOffhFlg[i] != null)
					model.setInclOffhFlg(inclOffhFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (repoPlnId[i] != null)
					model.setRepoPlnId(repoPlnId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (inclOnhFlg[i] != null)
					model.setInclOnhFlg(inclOnhFlg[i]);
				if (repoPlnAutoGenFlg[i] != null)
					model.setRepoPlnAutoGenFlg(repoPlnAutoGenFlg[i]);
				if (engRunInfeasFlg[i] != null)
					model.setEngRunInfeasFlg(engRunInfeasFlg[i]);
				if (simPlnSnsCd[i] != null)
					model.setSimPlnSnsCd(simPlnSnsCd[i]);
				if (repoPlnDtrbFlg[i] != null)
					model.setRepoPlnDtrbFlg(repoPlnDtrbFlg[i]);
				if (simPlnId[i] != null)
					model.setSimPlnId(simPlnId[i]);
				if (inclCntrTpszCtnt[i] != null)
					model.setInclCntrTpszCtnt(inclCntrTpszCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (simPlnSnsObjCd[i] != null)
					model.setSimPlnSnsObjCd(simPlnSnsObjCd[i]);
				if (repoPlnRmk[i] != null)
					model.setRepoPlnRmk(repoPlnRmk[i]);
				if (repoPlnLst[i] != null)
					model.setRepoPlnLst(repoPlnLst[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrEqRepoPlnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrEqRepoPlnVO[]
	 */
	public EqrEqRepoPlnVO[] getEqrEqRepoPlnVOs(){
		EqrEqRepoPlnVO[] vos = (EqrEqRepoPlnVO[])models.toArray(new EqrEqRepoPlnVO[models.size()]);
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
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engRunCmplFlg = this.engRunCmplFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engRunEndYrwk = this.engRunEndYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engRunStYrwk = this.engRunStYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inclOffhFlg = this.inclOffhFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnId = this.repoPlnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inclOnhFlg = this.inclOnhFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnAutoGenFlg = this.repoPlnAutoGenFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engRunInfeasFlg = this.engRunInfeasFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simPlnSnsCd = this.simPlnSnsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnDtrbFlg = this.repoPlnDtrbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simPlnId = this.simPlnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inclCntrTpszCtnt = this.inclCntrTpszCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simPlnSnsObjCd = this.simPlnSnsObjCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnRmk = this.repoPlnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnLst = this.repoPlnLst .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
