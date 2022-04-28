/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesTmlSoRvisListVO.java
*@FileTitle : TesTmlSoRvisListVO
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

public class TesTmlSoRvisListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlSoRvisListVO> models = new ArrayList<TesTmlSoRvisListVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String cuzCntrNo = null;
	/* Column Info */
	private String invGateInDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rvisIndFlg = null;
	/* Column Info */
	private String calcCostGrpCd = null;
	/* Column Info */
	private String tmlInvTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rvisRmk = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rhndRsnCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tmlSoDtlSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rvisGateOutFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String tmlSoRvisListSeq = null;
	/* Column Info */
	private String invGateOutDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cntrStyCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String rvisGateInFlg = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;
	/* Column Info */
	private String tmlRvisTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesTmlSoRvisListVO() {}

	public TesTmlSoRvisListVO(String ibflag, String pagerows, String tmlSoOfcCtyCd, String tmlSoSeq, String tmlSoDtlSeq, String tmlSoRvisListSeq, String tmlInvTpCd, String calcCostGrpCd, String tmlRvisTpCd, String lgsCostCd, String rvisIndFlg, String rvisGateInFlg, String rvisGateOutFlg, String invGateInDt, String invGateOutDt, String cntrNo, String cntrTpszCd, String cntrStyCd, String bkgNo, String vslCd, String skdVoyNo, String skdDirCd, String cuzCntrNo, String rhndRsnCd, String rvisRmk, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt) {
		this.vslCd = vslCd;
		this.cuzCntrNo = cuzCntrNo;
		this.invGateInDt = invGateInDt;
		this.creDt = creDt;
		this.rvisIndFlg = rvisIndFlg;
		this.calcCostGrpCd = calcCostGrpCd;
		this.tmlInvTpCd = tmlInvTpCd;
		this.pagerows = pagerows;
		this.rvisRmk = rvisRmk;
		this.ibflag = ibflag;
		this.rhndRsnCd = rhndRsnCd;
		this.cntrTpszCd = cntrTpszCd;
		this.updUsrId = updUsrId;
		this.tmlSoDtlSeq = tmlSoDtlSeq;
		this.updDt = updDt;
		this.loclCreDt = loclCreDt;
		this.skdVoyNo = skdVoyNo;
		this.rvisGateOutFlg = rvisGateOutFlg;
		this.skdDirCd = skdDirCd;
		this.tmlSoRvisListSeq = tmlSoRvisListSeq;
		this.invGateOutDt = invGateOutDt;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.cntrStyCd = cntrStyCd;
		this.cntrNo = cntrNo;
		this.lgsCostCd = lgsCostCd;
		this.rvisGateInFlg = rvisGateInFlg;
		this.tmlSoSeq = tmlSoSeq;
		this.loclUpdDt = loclUpdDt;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
		this.tmlRvisTpCd = tmlRvisTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cuz_cntr_no", getCuzCntrNo());
		this.hashColumns.put("inv_gate_in_dt", getInvGateInDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rvis_ind_flg", getRvisIndFlg());
		this.hashColumns.put("calc_cost_grp_cd", getCalcCostGrpCd());
		this.hashColumns.put("tml_inv_tp_cd", getTmlInvTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rvis_rmk", getRvisRmk());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rhnd_rsn_cd", getRhndRsnCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tml_so_dtl_seq", getTmlSoDtlSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rvis_gate_out_flg", getRvisGateOutFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("tml_so_rvis_list_seq", getTmlSoRvisListSeq());
		this.hashColumns.put("inv_gate_out_dt", getInvGateOutDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cntr_sty_cd", getCntrStyCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("rvis_gate_in_flg", getRvisGateInFlg());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		this.hashColumns.put("tml_rvis_tp_cd", getTmlRvisTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cuz_cntr_no", "cuzCntrNo");
		this.hashFields.put("inv_gate_in_dt", "invGateInDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rvis_ind_flg", "rvisIndFlg");
		this.hashFields.put("calc_cost_grp_cd", "calcCostGrpCd");
		this.hashFields.put("tml_inv_tp_cd", "tmlInvTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rvis_rmk", "rvisRmk");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rhnd_rsn_cd", "rhndRsnCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tml_so_dtl_seq", "tmlSoDtlSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rvis_gate_out_flg", "rvisGateOutFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("tml_so_rvis_list_seq", "tmlSoRvisListSeq");
		this.hashFields.put("inv_gate_out_dt", "invGateOutDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cntr_sty_cd", "cntrStyCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("rvis_gate_in_flg", "rvisGateInFlg");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
		this.hashFields.put("tml_rvis_tp_cd", "tmlRvisTpCd");
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
	 * @return cuzCntrNo
	 */
	public String getCuzCntrNo() {
		return this.cuzCntrNo;
	}
	
	/**
	 * Column Info
	 * @return invGateInDt
	 */
	public String getInvGateInDt() {
		return this.invGateInDt;
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
	 * @return rvisIndFlg
	 */
	public String getRvisIndFlg() {
		return this.rvisIndFlg;
	}
	
	/**
	 * Column Info
	 * @return calcCostGrpCd
	 */
	public String getCalcCostGrpCd() {
		return this.calcCostGrpCd;
	}
	
	/**
	 * Column Info
	 * @return tmlInvTpCd
	 */
	public String getTmlInvTpCd() {
		return this.tmlInvTpCd;
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
	 * @return rvisRmk
	 */
	public String getRvisRmk() {
		return this.rvisRmk;
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
	 * @return rhndRsnCd
	 */
	public String getRhndRsnCd() {
		return this.rhndRsnCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return tmlSoDtlSeq
	 */
	public String getTmlSoDtlSeq() {
		return this.tmlSoDtlSeq;
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
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
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
	 * @return rvisGateOutFlg
	 */
	public String getRvisGateOutFlg() {
		return this.rvisGateOutFlg;
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
	 * @return tmlSoRvisListSeq
	 */
	public String getTmlSoRvisListSeq() {
		return this.tmlSoRvisListSeq;
	}
	
	/**
	 * Column Info
	 * @return invGateOutDt
	 */
	public String getInvGateOutDt() {
		return this.invGateOutDt;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return cntrStyCd
	 */
	public String getCntrStyCd() {
		return this.cntrStyCd;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return rvisGateInFlg
	 */
	public String getRvisGateInFlg() {
		return this.rvisGateInFlg;
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
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
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
	 * @return tmlRvisTpCd
	 */
	public String getTmlRvisTpCd() {
		return this.tmlRvisTpCd;
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
	 * @param cuzCntrNo
	 */
	public void setCuzCntrNo(String cuzCntrNo) {
		this.cuzCntrNo = cuzCntrNo;
	}
	
	/**
	 * Column Info
	 * @param invGateInDt
	 */
	public void setInvGateInDt(String invGateInDt) {
		this.invGateInDt = invGateInDt;
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
	 * @param rvisIndFlg
	 */
	public void setRvisIndFlg(String rvisIndFlg) {
		this.rvisIndFlg = rvisIndFlg;
	}
	
	/**
	 * Column Info
	 * @param calcCostGrpCd
	 */
	public void setCalcCostGrpCd(String calcCostGrpCd) {
		this.calcCostGrpCd = calcCostGrpCd;
	}
	
	/**
	 * Column Info
	 * @param tmlInvTpCd
	 */
	public void setTmlInvTpCd(String tmlInvTpCd) {
		this.tmlInvTpCd = tmlInvTpCd;
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
	 * @param rvisRmk
	 */
	public void setRvisRmk(String rvisRmk) {
		this.rvisRmk = rvisRmk;
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
	 * @param rhndRsnCd
	 */
	public void setRhndRsnCd(String rhndRsnCd) {
		this.rhndRsnCd = rhndRsnCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param tmlSoDtlSeq
	 */
	public void setTmlSoDtlSeq(String tmlSoDtlSeq) {
		this.tmlSoDtlSeq = tmlSoDtlSeq;
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
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
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
	 * @param rvisGateOutFlg
	 */
	public void setRvisGateOutFlg(String rvisGateOutFlg) {
		this.rvisGateOutFlg = rvisGateOutFlg;
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
	 * @param tmlSoRvisListSeq
	 */
	public void setTmlSoRvisListSeq(String tmlSoRvisListSeq) {
		this.tmlSoRvisListSeq = tmlSoRvisListSeq;
	}
	
	/**
	 * Column Info
	 * @param invGateOutDt
	 */
	public void setInvGateOutDt(String invGateOutDt) {
		this.invGateOutDt = invGateOutDt;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param cntrStyCd
	 */
	public void setCntrStyCd(String cntrStyCd) {
		this.cntrStyCd = cntrStyCd;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param rvisGateInFlg
	 */
	public void setRvisGateInFlg(String rvisGateInFlg) {
		this.rvisGateInFlg = rvisGateInFlg;
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
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
	}
	
	/**
	 * Column Info
	 * @param tmlSoOfcCtyCd
	 */
	public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param tmlRvisTpCd
	 */
	public void setTmlRvisTpCd(String tmlRvisTpCd) {
		this.tmlRvisTpCd = tmlRvisTpCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCuzCntrNo(JSPUtil.getParameter(request, "cuz_cntr_no", ""));
		setInvGateInDt(JSPUtil.getParameter(request, "inv_gate_in_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRvisIndFlg(JSPUtil.getParameter(request, "rvis_ind_flg", ""));
		setCalcCostGrpCd(JSPUtil.getParameter(request, "calc_cost_grp_cd", ""));
		setTmlInvTpCd(JSPUtil.getParameter(request, "tml_inv_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRvisRmk(JSPUtil.getParameter(request, "rvis_rmk", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRhndRsnCd(JSPUtil.getParameter(request, "rhnd_rsn_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTmlSoDtlSeq(JSPUtil.getParameter(request, "tml_so_dtl_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setRvisGateOutFlg(JSPUtil.getParameter(request, "rvis_gate_out_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setTmlSoRvisListSeq(JSPUtil.getParameter(request, "tml_so_rvis_list_seq", ""));
		setInvGateOutDt(JSPUtil.getParameter(request, "inv_gate_out_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCntrStyCd(JSPUtil.getParameter(request, "cntr_sty_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setRvisGateInFlg(JSPUtil.getParameter(request, "rvis_gate_in_flg", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, "tml_so_seq", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, "tml_so_ofc_cty_cd", ""));
		setTmlRvisTpCd(JSPUtil.getParameter(request, "tml_rvis_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlSoRvisListVO[]
	 */
	public TesTmlSoRvisListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlSoRvisListVO[]
	 */
	public TesTmlSoRvisListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlSoRvisListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] cuzCntrNo = (JSPUtil.getParameter(request, prefix	+ "cuz_cntr_no", length));
			String[] invGateInDt = (JSPUtil.getParameter(request, prefix	+ "inv_gate_in_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rvisIndFlg = (JSPUtil.getParameter(request, prefix	+ "rvis_ind_flg", length));
			String[] calcCostGrpCd = (JSPUtil.getParameter(request, prefix	+ "calc_cost_grp_cd", length));
			String[] tmlInvTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_inv_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rvisRmk = (JSPUtil.getParameter(request, prefix	+ "rvis_rmk", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rhndRsnCd = (JSPUtil.getParameter(request, prefix	+ "rhnd_rsn_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] tmlSoDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_dtl_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rvisGateOutFlg = (JSPUtil.getParameter(request, prefix	+ "rvis_gate_out_flg", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] tmlSoRvisListSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_rvis_list_seq", length));
			String[] invGateOutDt = (JSPUtil.getParameter(request, prefix	+ "inv_gate_out_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] cntrStyCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sty_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] rvisGateInFlg = (JSPUtil.getParameter(request, prefix	+ "rvis_gate_in_flg", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			String[] tmlRvisTpCd = (JSPUtil.getParameter(request, prefix	+ "tml_rvis_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlSoRvisListVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (cuzCntrNo[i] != null)
					model.setCuzCntrNo(cuzCntrNo[i]);
				if (invGateInDt[i] != null)
					model.setInvGateInDt(invGateInDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rvisIndFlg[i] != null)
					model.setRvisIndFlg(rvisIndFlg[i]);
				if (calcCostGrpCd[i] != null)
					model.setCalcCostGrpCd(calcCostGrpCd[i]);
				if (tmlInvTpCd[i] != null)
					model.setTmlInvTpCd(tmlInvTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rvisRmk[i] != null)
					model.setRvisRmk(rvisRmk[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rhndRsnCd[i] != null)
					model.setRhndRsnCd(rhndRsnCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tmlSoDtlSeq[i] != null)
					model.setTmlSoDtlSeq(tmlSoDtlSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rvisGateOutFlg[i] != null)
					model.setRvisGateOutFlg(rvisGateOutFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (tmlSoRvisListSeq[i] != null)
					model.setTmlSoRvisListSeq(tmlSoRvisListSeq[i]);
				if (invGateOutDt[i] != null)
					model.setInvGateOutDt(invGateOutDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cntrStyCd[i] != null)
					model.setCntrStyCd(cntrStyCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (rvisGateInFlg[i] != null)
					model.setRvisGateInFlg(rvisGateInFlg[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				if (tmlRvisTpCd[i] != null)
					model.setTmlRvisTpCd(tmlRvisTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlSoRvisListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlSoRvisListVO[]
	 */
	public TesTmlSoRvisListVO[] getTesTmlSoRvisListVOs(){
		TesTmlSoRvisListVO[] vos = (TesTmlSoRvisListVO[])models.toArray(new TesTmlSoRvisListVO[models.size()]);
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
		this.cuzCntrNo = this.cuzCntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invGateInDt = this.invGateInDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisIndFlg = this.rvisIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcCostGrpCd = this.calcCostGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlInvTpCd = this.tmlInvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisRmk = this.rvisRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rhndRsnCd = this.rhndRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoDtlSeq = this.tmlSoDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisGateOutFlg = this.rvisGateOutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoRvisListSeq = this.tmlSoRvisListSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invGateOutDt = this.invGateOutDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrStyCd = this.cntrStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisGateInFlg = this.rvisGateInFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlRvisTpCd = this.tmlRvisTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
