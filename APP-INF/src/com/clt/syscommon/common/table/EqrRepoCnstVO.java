/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrRepoCnstVO.java
*@FileTitle : EqrRepoCnstVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.24
*@LastModifier : 이행지
*@LastVersion : 1.0
* 2009.07.24 이행지 
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
 * @author 이행지
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrRepoCnstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrRepoCnstVO> models = new ArrayList<EqrRepoCnstVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fmLocGrpCd = null;
	/* Column Info */
	private String repoCnstSeq = null;
	/* Column Info */
	private String repoCnstDirCd = null;
	/* Column Info */
	private String cnstCntrTpszCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String toLocCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ruleExptFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String toLocGrpCd = null;
	/* Column Info */
	private String cnstRuleId = null;
	/* Column Info */
	private String fmLocCd = null;
	/* Column Info */
	private String eqTrspModCd = null;
	/* Column Info */
	private String repoCnstTpCd = null;
	/* Column Info */
	private String tpsztype = null;

	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrRepoCnstVO() {}

	public EqrRepoCnstVO(String ibflag, String pagerows, String cnstRuleId, String repoCnstTpCd, String fmLocGrpCd, String fmLocCd, String toLocGrpCd, String toLocCd, String eqTrspModCd, String repoCnstSeq, String cnstCntrTpszCd, String repoCnstDirCd, String ruleExptFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.fmLocGrpCd = fmLocGrpCd;
		this.repoCnstSeq = repoCnstSeq;
		this.repoCnstDirCd = repoCnstDirCd;
		this.cnstCntrTpszCd = cnstCntrTpszCd;
		this.creDt = creDt;
		this.toLocCd = toLocCd;
		this.pagerows = pagerows;
		this.ruleExptFlg = ruleExptFlg;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.toLocGrpCd = toLocGrpCd;
		this.cnstRuleId = cnstRuleId;
		this.fmLocCd = fmLocCd;
		this.eqTrspModCd = eqTrspModCd;
		this.repoCnstTpCd = repoCnstTpCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fm_loc_grp_cd", getFmLocGrpCd());
		this.hashColumns.put("repo_cnst_seq", getRepoCnstSeq());
		this.hashColumns.put("repo_cnst_dir_cd", getRepoCnstDirCd());
		this.hashColumns.put("cnst_cntr_tpsz_cd", getCnstCntrTpszCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("to_loc_cd", getToLocCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rule_expt_flg", getRuleExptFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("to_loc_grp_cd", getToLocGrpCd());
		this.hashColumns.put("cnst_rule_id", getCnstRuleId());
		this.hashColumns.put("fm_loc_cd", getFmLocCd());
		this.hashColumns.put("eq_trsp_mod_cd", getEqTrspModCd());
		this.hashColumns.put("repo_cnst_tp_cd", getRepoCnstTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fm_loc_grp_cd", "fmLocGrpCd");
		this.hashFields.put("repo_cnst_seq", "repoCnstSeq");
		this.hashFields.put("repo_cnst_dir_cd", "repoCnstDirCd");
		this.hashFields.put("cnst_cntr_tpsz_cd", "cnstCntrTpszCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("to_loc_cd", "toLocCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rule_expt_flg", "ruleExptFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("to_loc_grp_cd", "toLocGrpCd");
		this.hashFields.put("cnst_rule_id", "cnstRuleId");
		this.hashFields.put("fm_loc_cd", "fmLocCd");
		this.hashFields.put("eq_trsp_mod_cd", "eqTrspModCd");
		this.hashFields.put("repo_cnst_tp_cd", "repoCnstTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return fmLocGrpCd
	 */
	public String getFmLocGrpCd() {
		return this.fmLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @return repoCnstSeq
	 */
	public String getRepoCnstSeq() {
		return this.repoCnstSeq;
	}
	
	/**
	 * Column Info
	 * @return repoCnstDirCd
	 */
	public String getRepoCnstDirCd() {
		return this.repoCnstDirCd;
	}
	
	/**
	 * Column Info
	 * @return cnstCntrTpszCd
	 */
	public String getCnstCntrTpszCd() {
		return this.cnstCntrTpszCd;
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
	 * @return toLocCd
	 */
	public String getToLocCd() {
		return this.toLocCd;
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
	 * @return ruleExptFlg
	 */
	public String getRuleExptFlg() {
		return this.ruleExptFlg;
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
	 * @return toLocGrpCd
	 */
	public String getToLocGrpCd() {
		return this.toLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @return cnstRuleId
	 */
	public String getCnstRuleId() {
		return this.cnstRuleId;
	}
	
	/**
	 * Column Info
	 * @return fmLocCd
	 */
	public String getFmLocCd() {
		return this.fmLocCd;
	}
	
	/**
	 * Column Info
	 * @return eqTrspModCd
	 */
	public String getEqTrspModCd() {
		return this.eqTrspModCd;
	}
	
	/**
	 * Column Info
	 * @return repoCnstTpCd
	 */
	public String getRepoCnstTpCd() {
		return this.repoCnstTpCd;
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
	 * @return tpsztype
	 */
	public String getTpsztype() {
		return tpsztype;
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
	 * @param fmLocGrpCd
	 */
	public void setFmLocGrpCd(String fmLocGrpCd) {
		this.fmLocGrpCd = fmLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @param repoCnstSeq
	 */
	public void setRepoCnstSeq(String repoCnstSeq) {
		this.repoCnstSeq = repoCnstSeq;
	}
	
	/**
	 * Column Info
	 * @param repoCnstDirCd
	 */
	public void setRepoCnstDirCd(String repoCnstDirCd) {
		this.repoCnstDirCd = repoCnstDirCd;
	}
	
	/**
	 * Column Info
	 * @param cnstCntrTpszCd
	 */
	public void setCnstCntrTpszCd(String cnstCntrTpszCd) {
		this.cnstCntrTpszCd = cnstCntrTpszCd;
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
	 * @param toLocCd
	 */
	public void setToLocCd(String toLocCd) {
		this.toLocCd = toLocCd;
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
	 * @param ruleExptFlg
	 */
	public void setRuleExptFlg(String ruleExptFlg) {
		this.ruleExptFlg = ruleExptFlg;
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
	 * @param toLocGrpCd
	 */
	public void setToLocGrpCd(String toLocGrpCd) {
		this.toLocGrpCd = toLocGrpCd;
	}
	
	/**
	 * Column Info
	 * @param cnstRuleId
	 */
	public void setCnstRuleId(String cnstRuleId) {
		this.cnstRuleId = cnstRuleId;
	}
	
	/**
	 * Column Info
	 * @param fmLocCd
	 */
	public void setFmLocCd(String fmLocCd) {
		this.fmLocCd = fmLocCd;
	}
	
	/**
	 * Column Info
	 * @param eqTrspModCd
	 */
	public void setEqTrspModCd(String eqTrspModCd) {
		this.eqTrspModCd = eqTrspModCd;
	}
	
	/**
	 * Column Info
	 * @param repoCnstTpCd
	 */
	public void setRepoCnstTpCd(String repoCnstTpCd) {
		this.repoCnstTpCd = repoCnstTpCd;
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
	 * @param tpsztype
	 */
	public void setTpsztype(String tpsztype) {
		this.tpsztype = tpsztype;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFmLocGrpCd(JSPUtil.getParameter(request, "fm_loc_grp_cd", ""));
		setRepoCnstSeq(JSPUtil.getParameter(request, "repo_cnst_seq", ""));
		setRepoCnstDirCd(JSPUtil.getParameter(request, "repo_cnst_dir_cd", ""));
		setCnstCntrTpszCd(JSPUtil.getParameter(request, "cnst_cntr_tpsz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setToLocCd(JSPUtil.getParameter(request, "to_loc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRuleExptFlg(JSPUtil.getParameter(request, "rule_expt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setToLocGrpCd(JSPUtil.getParameter(request, "to_loc_grp_cd", ""));
		setCnstRuleId(JSPUtil.getParameter(request, "cnst_rule_id", ""));
		setFmLocCd(JSPUtil.getParameter(request, "fm_loc_cd", ""));
		setEqTrspModCd(JSPUtil.getParameter(request, "eq_trsp_mod_cd", ""));
		setRepoCnstTpCd(JSPUtil.getParameter(request, "repo_cnst_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrRepoCnstVO[]
	 */
	public EqrRepoCnstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrRepoCnstVO[]
	 */
	public EqrRepoCnstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrRepoCnstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fmLocGrpCd = (JSPUtil.getParameter(request, prefix	+ "fm_loc_grp_cd", length));
			String[] repoCnstSeq = (JSPUtil.getParameter(request, prefix	+ "repo_cnst_seq", length));
			String[] repoCnstDirCd = (JSPUtil.getParameter(request, prefix	+ "repo_cnst_dir_cd", length));
			String[] cnstCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cnst_cntr_tpsz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] toLocCd = (JSPUtil.getParameter(request, prefix	+ "to_loc_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ruleExptFlg = (JSPUtil.getParameter(request, prefix	+ "rule_expt_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] toLocGrpCd = (JSPUtil.getParameter(request, prefix	+ "to_loc_grp_cd", length));
			String[] cnstRuleId = (JSPUtil.getParameter(request, prefix	+ "cnst_rule_id", length));
			String[] fmLocCd = (JSPUtil.getParameter(request, prefix	+ "fm_loc_cd", length));
			String[] eqTrspModCd = (JSPUtil.getParameter(request, prefix	+ "eq_trsp_mod_cd", length));
			String[] repoCnstTpCd = (JSPUtil.getParameter(request, prefix	+ "repo_cnst_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrRepoCnstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fmLocGrpCd[i] != null)
					model.setFmLocGrpCd(fmLocGrpCd[i]);
				if (repoCnstSeq[i] != null)
					model.setRepoCnstSeq(repoCnstSeq[i]);
				if (repoCnstDirCd[i] != null)
					model.setRepoCnstDirCd(repoCnstDirCd[i]);
				if (cnstCntrTpszCd[i] != null)
					model.setCnstCntrTpszCd(cnstCntrTpszCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (toLocCd[i] != null)
					model.setToLocCd(toLocCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ruleExptFlg[i] != null)
					model.setRuleExptFlg(ruleExptFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (toLocGrpCd[i] != null)
					model.setToLocGrpCd(toLocGrpCd[i]);
				if (cnstRuleId[i] != null)
					model.setCnstRuleId(cnstRuleId[i]);
				if (fmLocCd[i] != null)
					model.setFmLocCd(fmLocCd[i]);
				if (eqTrspModCd[i] != null)
					model.setEqTrspModCd(eqTrspModCd[i]);
				if (repoCnstTpCd[i] != null)
					model.setRepoCnstTpCd(repoCnstTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrRepoCnstVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrRepoCnstVO[]
	 */
	public EqrRepoCnstVO[] fromRequestGridArrayList(HttpServletRequest request, String prefix) {
		EqrRepoCnstVO model = null;
		
		String[] arrPrefix = null;
		
		if (!(prefix.equals(""))){
			arrPrefix = prefix.split(",");
        }
		
		String[] tmp = request.getParameterValues("ibflag");
  		if(tmp == null)
   			return null;  		

  		int length		= request.getParameterValues("ibflag").length;
  		int tpsz_length	= arrPrefix.length;
  		String tpsz[][] = new String[tpsz_length][length];
  		String tpszStr	= "";
  
		try {
			for (int i=0 ; i < length ; i++){
				String[] updDt			= (JSPUtil.getParameter(request, "upd_dt",			length));
				String[] fmLocGrpCd		= (JSPUtil.getParameter(request, "fm_loc_grp_cd",	length));
				String[] repoCnstSeq	= (JSPUtil.getParameter(request, "repo_cnst_seq",	length));
				String[] repoCnstDirCd	= (JSPUtil.getParameter(request, "repo_cnst_dir_cd",length));
				String[] creDt			= (JSPUtil.getParameter(request, "cre_dt",			length));
				String[] toLocCd		= (JSPUtil.getParameter(request, "to_loc_cd",		length));
				String[] pagerows		= (JSPUtil.getParameter(request, "pagerows",		length));
				String[] ruleExptFlg	= (JSPUtil.getParameter(request, "rule_expt_flg",	length));
				String[] creUsrId		= (JSPUtil.getParameter(request, "cre_usr_id",		length));
				String[] ibflag			= (JSPUtil.getParameter(request, "ibflag",			length));
				String[] toLocGrpCd		= (JSPUtil.getParameter(request, "to_loc_grp_cd",	length));
				String[] cnstRuleId		= (JSPUtil.getParameter(request, "cnst_rule_id",	length));
				String[] fmLocCd		= (JSPUtil.getParameter(request, "fm_loc_cd",		length));
				String[] eqTrspModCd	= (JSPUtil.getParameter(request, "eq_trsp_mod_cd",	length));
				String[] repoCnstTpCd	= (JSPUtil.getParameter(request, "repo_cnst_tp_cd",	length));
				String[] updUsrId		= (JSPUtil.getParameter(request, "upd_usr_id",		length));
				tpszStr = "";
				
				for (int k=0 ; k < tpsz_length ; k++){
					String[] tpszCheck = (JSPUtil.getParameter(request, "cnst_cntr_tpsz_cd"+arrPrefix[k].toLowerCase(), length));
					tpsz[k] = tpszCheck;
				}
				
				for ( int j=0; j < tpsz_length; j++){
					if( "1".equals(tpsz[j][i]) )
						tpszStr +=   arrPrefix[j] + ",";
				}
				
				model = new EqrRepoCnstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fmLocGrpCd[i] != null)
					model.setFmLocGrpCd(fmLocGrpCd[i]);
				if (repoCnstSeq[i] != null)
					model.setRepoCnstSeq(repoCnstSeq[i]);
				if (repoCnstDirCd[i] != null)
					model.setRepoCnstDirCd(repoCnstDirCd[i]);
				if (tpszStr != null)
					model.setTpsztype(tpszStr.substring(0,tpszStr.length()-1));
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (toLocCd[i] != null)
					model.setToLocCd(toLocCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ruleExptFlg[i] != null)
					model.setRuleExptFlg(ruleExptFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (toLocGrpCd[i] != null)
					model.setToLocGrpCd(toLocGrpCd[i]);
				if (cnstRuleId[i] != null)
					model.setCnstRuleId(cnstRuleId[i]);
				if (fmLocCd[i] != null)
					model.setFmLocCd(fmLocCd[i]);
				if (eqTrspModCd[i] != null)
					model.setEqTrspModCd(eqTrspModCd[i]);
				if (repoCnstTpCd[i] != null)
					model.setRepoCnstTpCd(repoCnstTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrRepoCnstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrRepoCnstVO[]
	 */
	public EqrRepoCnstVO[] getEqrRepoCnstVOs(){
		EqrRepoCnstVO[] vos = (EqrRepoCnstVO[])models.toArray(new EqrRepoCnstVO[models.size()]);
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
		this.fmLocGrpCd = this.fmLocGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoCnstSeq = this.repoCnstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoCnstDirCd = this.repoCnstDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnstCntrTpszCd = this.cnstCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toLocCd = this.toLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ruleExptFlg = this.ruleExptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toLocGrpCd = this.toLocGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnstRuleId = this.cnstRuleId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmLocCd = this.fmLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTrspModCd = this.eqTrspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoCnstTpCd = this.repoCnstTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
