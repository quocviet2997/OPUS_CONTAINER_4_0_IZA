/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaVvdHirVO.java
*@FileTitle : CoaVvdHirVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaVvdHirVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaVvdHirVO> models = new ArrayList<CoaVvdHirVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String tsUcAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cmmtBseCostAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String coAmt = null;
	/* Column Info */
	private String n4thCoAmt = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String n4thNtwkCostAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String n4thAsgnAmt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n4thHjsSlsAmt = null;
	/* Column Info */
	private String n1stAsgnAmt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String tsCtrbBseCostAmt = null;
	/* Column Info */
	private String ntwkHirCostAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String tsAsgnAmt = null;
	/* Column Info */
	private String iptAsgnAmt = null;
	/* Column Info */
	private String hjsSlsAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaVvdHirVO() {}

	public CoaVvdHirVO(String ibflag, String pagerows, String trdCd, String rlaneCd, String iocCd, String vslCd, String skdVoyNo, String dirCd, String stndCostCd, String ntwkHirCostAmt, String tsUcAmt, String hjsSlsAmt, String coAmt, String n1stAsgnAmt, String tsAsgnAmt, String iptAsgnAmt, String tsCtrbBseCostAmt, String cmmtBseCostAmt, String creUsrId, String creDt, String updUsrId, String updDt, String n4thNtwkCostAmt, String n4thHjsSlsAmt, String n4thCoAmt, String n4thAsgnAmt) {
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.tsUcAmt = tsUcAmt;
		this.pagerows = pagerows;
		this.cmmtBseCostAmt = cmmtBseCostAmt;
		this.ibflag = ibflag;
		this.coAmt = coAmt;
		this.n4thCoAmt = n4thCoAmt;
		this.dirCd = dirCd;
		this.n4thNtwkCostAmt = n4thNtwkCostAmt;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
		this.n4thAsgnAmt = n4thAsgnAmt;
		this.iocCd = iocCd;
		this.updDt = updDt;
		this.n4thHjsSlsAmt = n4thHjsSlsAmt;
		this.n1stAsgnAmt = n1stAsgnAmt;
		this.skdVoyNo = skdVoyNo;
		this.tsCtrbBseCostAmt = tsCtrbBseCostAmt;
		this.ntwkHirCostAmt = ntwkHirCostAmt;
		this.creUsrId = creUsrId;
		this.tsAsgnAmt = tsAsgnAmt;
		this.iptAsgnAmt = iptAsgnAmt;
		this.hjsSlsAmt = hjsSlsAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("ts_uc_amt", getTsUcAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cmmt_bse_cost_amt", getCmmtBseCostAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("co_amt", getCoAmt());
		this.hashColumns.put("n4th_co_amt", getN4thCoAmt());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("n4th_ntwk_cost_amt", getN4thNtwkCostAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("n4th_asgn_amt", getN4thAsgnAmt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n4th_hjs_sls_amt", getN4thHjsSlsAmt());
		this.hashColumns.put("n1st_asgn_amt", getN1stAsgnAmt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("ts_ctrb_bse_cost_amt", getTsCtrbBseCostAmt());
		this.hashColumns.put("ntwk_hir_cost_amt", getNtwkHirCostAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ts_asgn_amt", getTsAsgnAmt());
		this.hashColumns.put("ipt_asgn_amt", getIptAsgnAmt());
		this.hashColumns.put("hjs_sls_amt", getHjsSlsAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("ts_uc_amt", "tsUcAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cmmt_bse_cost_amt", "cmmtBseCostAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("co_amt", "coAmt");
		this.hashFields.put("n4th_co_amt", "n4thCoAmt");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("n4th_ntwk_cost_amt", "n4thNtwkCostAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("n4th_asgn_amt", "n4thAsgnAmt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n4th_hjs_sls_amt", "n4thHjsSlsAmt");
		this.hashFields.put("n1st_asgn_amt", "n1stAsgnAmt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("ts_ctrb_bse_cost_amt", "tsCtrbBseCostAmt");
		this.hashFields.put("ntwk_hir_cost_amt", "ntwkHirCostAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ts_asgn_amt", "tsAsgnAmt");
		this.hashFields.put("ipt_asgn_amt", "iptAsgnAmt");
		this.hashFields.put("hjs_sls_amt", "hjsSlsAmt");
		return this.hashFields;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return tsUcAmt
	 */
	public String getTsUcAmt() {
		return this.tsUcAmt;
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
	 * @return cmmtBseCostAmt
	 */
	public String getCmmtBseCostAmt() {
		return this.cmmtBseCostAmt;
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
	 * @return coAmt
	 */
	public String getCoAmt() {
		return this.coAmt;
	}
	
	/**
	 * Column Info
	 * @return n4thCoAmt
	 */
	public String getN4thCoAmt() {
		return this.n4thCoAmt;
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
	 * @return n4thNtwkCostAmt
	 */
	public String getN4thNtwkCostAmt() {
		return this.n4thNtwkCostAmt;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
	}
	
	/**
	 * Column Info
	 * @return n4thAsgnAmt
	 */
	public String getN4thAsgnAmt() {
		return this.n4thAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
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
	 * @return n4thHjsSlsAmt
	 */
	public String getN4thHjsSlsAmt() {
		return this.n4thHjsSlsAmt;
	}
	
	/**
	 * Column Info
	 * @return n1stAsgnAmt
	 */
	public String getN1stAsgnAmt() {
		return this.n1stAsgnAmt;
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
	 * @return tsCtrbBseCostAmt
	 */
	public String getTsCtrbBseCostAmt() {
		return this.tsCtrbBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @return ntwkHirCostAmt
	 */
	public String getNtwkHirCostAmt() {
		return this.ntwkHirCostAmt;
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
	 * @return tsAsgnAmt
	 */
	public String getTsAsgnAmt() {
		return this.tsAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @return iptAsgnAmt
	 */
	public String getIptAsgnAmt() {
		return this.iptAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @return hjsSlsAmt
	 */
	public String getHjsSlsAmt() {
		return this.hjsSlsAmt;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param tsUcAmt
	 */
	public void setTsUcAmt(String tsUcAmt) {
		this.tsUcAmt = tsUcAmt;
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
	 * @param cmmtBseCostAmt
	 */
	public void setCmmtBseCostAmt(String cmmtBseCostAmt) {
		this.cmmtBseCostAmt = cmmtBseCostAmt;
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
	 * @param coAmt
	 */
	public void setCoAmt(String coAmt) {
		this.coAmt = coAmt;
	}
	
	/**
	 * Column Info
	 * @param n4thCoAmt
	 */
	public void setN4thCoAmt(String n4thCoAmt) {
		this.n4thCoAmt = n4thCoAmt;
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
	 * @param n4thNtwkCostAmt
	 */
	public void setN4thNtwkCostAmt(String n4thNtwkCostAmt) {
		this.n4thNtwkCostAmt = n4thNtwkCostAmt;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * Column Info
	 * @param n4thAsgnAmt
	 */
	public void setN4thAsgnAmt(String n4thAsgnAmt) {
		this.n4thAsgnAmt = n4thAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
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
	 * @param n4thHjsSlsAmt
	 */
	public void setN4thHjsSlsAmt(String n4thHjsSlsAmt) {
		this.n4thHjsSlsAmt = n4thHjsSlsAmt;
	}
	
	/**
	 * Column Info
	 * @param n1stAsgnAmt
	 */
	public void setN1stAsgnAmt(String n1stAsgnAmt) {
		this.n1stAsgnAmt = n1stAsgnAmt;
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
	 * @param tsCtrbBseCostAmt
	 */
	public void setTsCtrbBseCostAmt(String tsCtrbBseCostAmt) {
		this.tsCtrbBseCostAmt = tsCtrbBseCostAmt;
	}
	
	/**
	 * Column Info
	 * @param ntwkHirCostAmt
	 */
	public void setNtwkHirCostAmt(String ntwkHirCostAmt) {
		this.ntwkHirCostAmt = ntwkHirCostAmt;
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
	 * @param tsAsgnAmt
	 */
	public void setTsAsgnAmt(String tsAsgnAmt) {
		this.tsAsgnAmt = tsAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @param iptAsgnAmt
	 */
	public void setIptAsgnAmt(String iptAsgnAmt) {
		this.iptAsgnAmt = iptAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @param hjsSlsAmt
	 */
	public void setHjsSlsAmt(String hjsSlsAmt) {
		this.hjsSlsAmt = hjsSlsAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setTsUcAmt(JSPUtil.getParameter(request, "ts_uc_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCmmtBseCostAmt(JSPUtil.getParameter(request, "cmmt_bse_cost_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCoAmt(JSPUtil.getParameter(request, "co_amt", ""));
		setN4thCoAmt(JSPUtil.getParameter(request, "n4th_co_amt", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setN4thNtwkCostAmt(JSPUtil.getParameter(request, "n4th_ntwk_cost_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setN4thAsgnAmt(JSPUtil.getParameter(request, "n4th_asgn_amt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setN4thHjsSlsAmt(JSPUtil.getParameter(request, "n4th_hjs_sls_amt", ""));
		setN1stAsgnAmt(JSPUtil.getParameter(request, "n1st_asgn_amt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setTsCtrbBseCostAmt(JSPUtil.getParameter(request, "ts_ctrb_bse_cost_amt", ""));
		setNtwkHirCostAmt(JSPUtil.getParameter(request, "ntwk_hir_cost_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTsAsgnAmt(JSPUtil.getParameter(request, "ts_asgn_amt", ""));
		setIptAsgnAmt(JSPUtil.getParameter(request, "ipt_asgn_amt", ""));
		setHjsSlsAmt(JSPUtil.getParameter(request, "hjs_sls_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaVvdHirVO[]
	 */
	public CoaVvdHirVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaVvdHirVO[]
	 */
	public CoaVvdHirVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaVvdHirVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] tsUcAmt = (JSPUtil.getParameter(request, prefix	+ "ts_uc_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cmmtBseCostAmt = (JSPUtil.getParameter(request, prefix	+ "cmmt_bse_cost_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] coAmt = (JSPUtil.getParameter(request, prefix	+ "co_amt", length));
			String[] n4thCoAmt = (JSPUtil.getParameter(request, prefix	+ "n4th_co_amt", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] n4thNtwkCostAmt = (JSPUtil.getParameter(request, prefix	+ "n4th_ntwk_cost_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] n4thAsgnAmt = (JSPUtil.getParameter(request, prefix	+ "n4th_asgn_amt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] n4thHjsSlsAmt = (JSPUtil.getParameter(request, prefix	+ "n4th_hjs_sls_amt", length));
			String[] n1stAsgnAmt = (JSPUtil.getParameter(request, prefix	+ "n1st_asgn_amt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] tsCtrbBseCostAmt = (JSPUtil.getParameter(request, prefix	+ "ts_ctrb_bse_cost_amt", length));
			String[] ntwkHirCostAmt = (JSPUtil.getParameter(request, prefix	+ "ntwk_hir_cost_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] tsAsgnAmt = (JSPUtil.getParameter(request, prefix	+ "ts_asgn_amt", length));
			String[] iptAsgnAmt = (JSPUtil.getParameter(request, prefix	+ "ipt_asgn_amt", length));
			String[] hjsSlsAmt = (JSPUtil.getParameter(request, prefix	+ "hjs_sls_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaVvdHirVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (tsUcAmt[i] != null)
					model.setTsUcAmt(tsUcAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cmmtBseCostAmt[i] != null)
					model.setCmmtBseCostAmt(cmmtBseCostAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (coAmt[i] != null)
					model.setCoAmt(coAmt[i]);
				if (n4thCoAmt[i] != null)
					model.setN4thCoAmt(n4thCoAmt[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (n4thNtwkCostAmt[i] != null)
					model.setN4thNtwkCostAmt(n4thNtwkCostAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (n4thAsgnAmt[i] != null)
					model.setN4thAsgnAmt(n4thAsgnAmt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n4thHjsSlsAmt[i] != null)
					model.setN4thHjsSlsAmt(n4thHjsSlsAmt[i]);
				if (n1stAsgnAmt[i] != null)
					model.setN1stAsgnAmt(n1stAsgnAmt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (tsCtrbBseCostAmt[i] != null)
					model.setTsCtrbBseCostAmt(tsCtrbBseCostAmt[i]);
				if (ntwkHirCostAmt[i] != null)
					model.setNtwkHirCostAmt(ntwkHirCostAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (tsAsgnAmt[i] != null)
					model.setTsAsgnAmt(tsAsgnAmt[i]);
				if (iptAsgnAmt[i] != null)
					model.setIptAsgnAmt(iptAsgnAmt[i]);
				if (hjsSlsAmt[i] != null)
					model.setHjsSlsAmt(hjsSlsAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaVvdHirVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaVvdHirVO[]
	 */
	public CoaVvdHirVO[] getCoaVvdHirVOs(){
		CoaVvdHirVO[] vos = (CoaVvdHirVO[])models.toArray(new CoaVvdHirVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsUcAmt = this.tsUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmmtBseCostAmt = this.cmmtBseCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coAmt = this.coAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thCoAmt = this.n4thCoAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thNtwkCostAmt = this.n4thNtwkCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thAsgnAmt = this.n4thAsgnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n4thHjsSlsAmt = this.n4thHjsSlsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stAsgnAmt = this.n1stAsgnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsCtrbBseCostAmt = this.tsCtrbBseCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntwkHirCostAmt = this.ntwkHirCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsAsgnAmt = this.tsAsgnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iptAsgnAmt = this.iptAsgnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsSlsAmt = this.hjsSlsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
