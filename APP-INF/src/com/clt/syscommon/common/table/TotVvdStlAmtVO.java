/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TotVvdStlAmtVO.java
*@FileTitle : TotVvdStlAmtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.25
*@LastModifier : 장창수
*@LastVersion : 1.0
* 2009.08.25 장창수 
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
 * @author 장창수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TotVvdStlAmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TotVvdStlAmtVO> models = new ArrayList<TotVvdStlAmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslDzndCapa = null;
	/* Column Info */
	private String fmVvdStlDt = null;
	/* Column Info */
	private String tongStlBatJbSeq = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String stlYrmon = null;
	/* Column Info */
	private String usgRt = null;
	/* Column Info */
	private String toVvdStlDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String actBsaCapa = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tongFletTpCd = null;
	/* Column Info */
	private String bsaCapa = null;
	/* Column Info */
	private String voyDys = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String nrtWgt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String nrtTongTaxAmt = null;
	/* Column Info */
	private String ldbCapaQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String chtrBsaCapa = null;
	/* Column Info */
	private String tongTaxAmt = null;
	/* Column Info */
	private String perTonRev = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TotVvdStlAmtVO() {}

	public TotVvdStlAmtVO(String ibflag, String pagerows, String stlYrmon, String tongStlBatJbSeq, String vslCd, String ldbCapaQty, String bsaCapa, String actBsaCapa, String vslDzndCapa, String chtrBsaCapa, String usgRt, String fmVvdStlDt, String toVvdStlDt, String nrtWgt, String perTonRev, String tongFletTpCd, String voyDys, String tongTaxAmt, String nrtTongTaxAmt, String creDt, String creUsrId, String updDt, String updUsrId) {
		this.updDt = updDt;
		this.vslDzndCapa = vslDzndCapa;
		this.fmVvdStlDt = fmVvdStlDt;
		this.tongStlBatJbSeq = tongStlBatJbSeq;
		this.vslCd = vslCd;
		this.stlYrmon = stlYrmon;
		this.usgRt = usgRt;
		this.toVvdStlDt = toVvdStlDt;
		this.creDt = creDt;
		this.actBsaCapa = actBsaCapa;
		this.pagerows = pagerows;
		this.tongFletTpCd = tongFletTpCd;
		this.bsaCapa = bsaCapa;
		this.voyDys = voyDys;
		this.creUsrId = creUsrId;
		this.nrtWgt = nrtWgt;
		this.ibflag = ibflag;
		this.nrtTongTaxAmt = nrtTongTaxAmt;
		this.ldbCapaQty = ldbCapaQty;
		this.updUsrId = updUsrId;
		this.chtrBsaCapa = chtrBsaCapa;
		this.tongTaxAmt = tongTaxAmt;
		this.perTonRev = perTonRev;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_dznd_capa", getVslDzndCapa());
		this.hashColumns.put("fm_vvd_stl_dt", getFmVvdStlDt());
		this.hashColumns.put("tong_stl_bat_jb_seq", getTongStlBatJbSeq());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("stl_yrmon", getStlYrmon());
		this.hashColumns.put("usg_rt", getUsgRt());
		this.hashColumns.put("to_vvd_stl_dt", getToVvdStlDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("act_bsa_capa", getActBsaCapa());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tong_flet_tp_cd", getTongFletTpCd());
		this.hashColumns.put("bsa_capa", getBsaCapa());
		this.hashColumns.put("voy_dys", getVoyDys());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("nrt_wgt", getNrtWgt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("nrt_tong_tax_amt", getNrtTongTaxAmt());
		this.hashColumns.put("ldb_capa_qty", getLdbCapaQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("chtr_bsa_capa", getChtrBsaCapa());
		this.hashColumns.put("tong_tax_amt", getTongTaxAmt());
		this.hashColumns.put("per_ton_rev", getPerTonRev());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_dznd_capa", "vslDzndCapa");
		this.hashFields.put("fm_vvd_stl_dt", "fmVvdStlDt");
		this.hashFields.put("tong_stl_bat_jb_seq", "tongStlBatJbSeq");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("stl_yrmon", "stlYrmon");
		this.hashFields.put("usg_rt", "usgRt");
		this.hashFields.put("to_vvd_stl_dt", "toVvdStlDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("act_bsa_capa", "actBsaCapa");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tong_flet_tp_cd", "tongFletTpCd");
		this.hashFields.put("bsa_capa", "bsaCapa");
		this.hashFields.put("voy_dys", "voyDys");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("nrt_wgt", "nrtWgt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("nrt_tong_tax_amt", "nrtTongTaxAmt");
		this.hashFields.put("ldb_capa_qty", "ldbCapaQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("chtr_bsa_capa", "chtrBsaCapa");
		this.hashFields.put("tong_tax_amt", "tongTaxAmt");
		this.hashFields.put("per_ton_rev", "perTonRev");
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
	 * @return vslDzndCapa
	 */
	public String getVslDzndCapa() {
		return this.vslDzndCapa;
	}
	
	/**
	 * Column Info
	 * @return fmVvdStlDt
	 */
	public String getFmVvdStlDt() {
		return this.fmVvdStlDt;
	}
	
	/**
	 * Column Info
	 * @return tongStlBatJbSeq
	 */
	public String getTongStlBatJbSeq() {
		return this.tongStlBatJbSeq;
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
	 * @return stlYrmon
	 */
	public String getStlYrmon() {
		return this.stlYrmon;
	}
	
	/**
	 * Column Info
	 * @return usgRt
	 */
	public String getUsgRt() {
		return this.usgRt;
	}
	
	/**
	 * Column Info
	 * @return toVvdStlDt
	 */
	public String getToVvdStlDt() {
		return this.toVvdStlDt;
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
	 * @return actBsaCapa
	 */
	public String getActBsaCapa() {
		return this.actBsaCapa;
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
	 * @return tongFletTpCd
	 */
	public String getTongFletTpCd() {
		return this.tongFletTpCd;
	}
	
	/**
	 * Column Info
	 * @return bsaCapa
	 */
	public String getBsaCapa() {
		return this.bsaCapa;
	}
	
	/**
	 * Column Info
	 * @return voyDys
	 */
	public String getVoyDys() {
		return this.voyDys;
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
	 * @return nrtWgt
	 */
	public String getNrtWgt() {
		return this.nrtWgt;
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
	 * @return nrtTongTaxAmt
	 */
	public String getNrtTongTaxAmt() {
		return this.nrtTongTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return ldbCapaQty
	 */
	public String getLdbCapaQty() {
		return this.ldbCapaQty;
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
	 * @return chtrBsaCapa
	 */
	public String getChtrBsaCapa() {
		return this.chtrBsaCapa;
	}
	
	/**
	 * Column Info
	 * @return tongTaxAmt
	 */
	public String getTongTaxAmt() {
		return this.tongTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return perTonRev
	 */
	public String getPerTonRev() {
		return this.perTonRev;
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
	 * @param vslDzndCapa
	 */
	public void setVslDzndCapa(String vslDzndCapa) {
		this.vslDzndCapa = vslDzndCapa;
	}
	
	/**
	 * Column Info
	 * @param fmVvdStlDt
	 */
	public void setFmVvdStlDt(String fmVvdStlDt) {
		this.fmVvdStlDt = fmVvdStlDt;
	}
	
	/**
	 * Column Info
	 * @param tongStlBatJbSeq
	 */
	public void setTongStlBatJbSeq(String tongStlBatJbSeq) {
		this.tongStlBatJbSeq = tongStlBatJbSeq;
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
	 * @param stlYrmon
	 */
	public void setStlYrmon(String stlYrmon) {
		this.stlYrmon = stlYrmon;
	}
	
	/**
	 * Column Info
	 * @param usgRt
	 */
	public void setUsgRt(String usgRt) {
		this.usgRt = usgRt;
	}
	
	/**
	 * Column Info
	 * @param toVvdStlDt
	 */
	public void setToVvdStlDt(String toVvdStlDt) {
		this.toVvdStlDt = toVvdStlDt;
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
	 * @param actBsaCapa
	 */
	public void setActBsaCapa(String actBsaCapa) {
		this.actBsaCapa = actBsaCapa;
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
	 * @param tongFletTpCd
	 */
	public void setTongFletTpCd(String tongFletTpCd) {
		this.tongFletTpCd = tongFletTpCd;
	}
	
	/**
	 * Column Info
	 * @param bsaCapa
	 */
	public void setBsaCapa(String bsaCapa) {
		this.bsaCapa = bsaCapa;
	}
	
	/**
	 * Column Info
	 * @param voyDys
	 */
	public void setVoyDys(String voyDys) {
		this.voyDys = voyDys;
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
	 * @param nrtWgt
	 */
	public void setNrtWgt(String nrtWgt) {
		this.nrtWgt = nrtWgt;
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
	 * @param nrtTongTaxAmt
	 */
	public void setNrtTongTaxAmt(String nrtTongTaxAmt) {
		this.nrtTongTaxAmt = nrtTongTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param ldbCapaQty
	 */
	public void setLdbCapaQty(String ldbCapaQty) {
		this.ldbCapaQty = ldbCapaQty;
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
	 * @param chtrBsaCapa
	 */
	public void setChtrBsaCapa(String chtrBsaCapa) {
		this.chtrBsaCapa = chtrBsaCapa;
	}
	
	/**
	 * Column Info
	 * @param tongTaxAmt
	 */
	public void setTongTaxAmt(String tongTaxAmt) {
		this.tongTaxAmt = tongTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param perTonRev
	 */
	public void setPerTonRev(String perTonRev) {
		this.perTonRev = perTonRev;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslDzndCapa(JSPUtil.getParameter(request, "vsl_dznd_capa", ""));
		setFmVvdStlDt(JSPUtil.getParameter(request, "fm_vvd_stl_dt", ""));
		setTongStlBatJbSeq(JSPUtil.getParameter(request, "tong_stl_bat_jb_seq", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setStlYrmon(JSPUtil.getParameter(request, "stl_yrmon", ""));
		setUsgRt(JSPUtil.getParameter(request, "usg_rt", ""));
		setToVvdStlDt(JSPUtil.getParameter(request, "to_vvd_stl_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setActBsaCapa(JSPUtil.getParameter(request, "act_bsa_capa", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTongFletTpCd(JSPUtil.getParameter(request, "tong_flet_tp_cd", ""));
		setBsaCapa(JSPUtil.getParameter(request, "bsa_capa", ""));
		setVoyDys(JSPUtil.getParameter(request, "voy_dys", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setNrtWgt(JSPUtil.getParameter(request, "nrt_wgt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setNrtTongTaxAmt(JSPUtil.getParameter(request, "nrt_tong_tax_amt", ""));
		setLdbCapaQty(JSPUtil.getParameter(request, "ldb_capa_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setChtrBsaCapa(JSPUtil.getParameter(request, "chtr_bsa_capa", ""));
		setTongTaxAmt(JSPUtil.getParameter(request, "tong_tax_amt", ""));
		setPerTonRev(JSPUtil.getParameter(request, "per_ton_rev", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TotVvdStlAmtVO[]
	 */
	public TotVvdStlAmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TotVvdStlAmtVO[]
	 */
	public TotVvdStlAmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TotVvdStlAmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslDzndCapa = (JSPUtil.getParameter(request, prefix	+ "vsl_dznd_capa", length));
			String[] fmVvdStlDt = (JSPUtil.getParameter(request, prefix	+ "fm_vvd_stl_dt", length));
			String[] tongStlBatJbSeq = (JSPUtil.getParameter(request, prefix	+ "tong_stl_bat_jb_seq", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] stlYrmon = (JSPUtil.getParameter(request, prefix	+ "stl_yrmon", length));
			String[] usgRt = (JSPUtil.getParameter(request, prefix	+ "usg_rt", length));
			String[] toVvdStlDt = (JSPUtil.getParameter(request, prefix	+ "to_vvd_stl_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] actBsaCapa = (JSPUtil.getParameter(request, prefix	+ "act_bsa_capa", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] tongFletTpCd = (JSPUtil.getParameter(request, prefix	+ "tong_flet_tp_cd", length));
			String[] bsaCapa = (JSPUtil.getParameter(request, prefix	+ "bsa_capa", length));
			String[] voyDys = (JSPUtil.getParameter(request, prefix	+ "voy_dys", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] nrtWgt = (JSPUtil.getParameter(request, prefix	+ "nrt_wgt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] nrtTongTaxAmt = (JSPUtil.getParameter(request, prefix	+ "nrt_tong_tax_amt", length));
			String[] ldbCapaQty = (JSPUtil.getParameter(request, prefix	+ "ldb_capa_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] chtrBsaCapa = (JSPUtil.getParameter(request, prefix	+ "chtr_bsa_capa", length));
			String[] tongTaxAmt = (JSPUtil.getParameter(request, prefix	+ "tong_tax_amt", length));
			String[] perTonRev = (JSPUtil.getParameter(request, prefix	+ "per_ton_rev", length));
			
			for (int i = 0; i < length; i++) {
				model = new TotVvdStlAmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslDzndCapa[i] != null)
					model.setVslDzndCapa(vslDzndCapa[i]);
				if (fmVvdStlDt[i] != null)
					model.setFmVvdStlDt(fmVvdStlDt[i]);
				if (tongStlBatJbSeq[i] != null)
					model.setTongStlBatJbSeq(tongStlBatJbSeq[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (stlYrmon[i] != null)
					model.setStlYrmon(stlYrmon[i]);
				if (usgRt[i] != null)
					model.setUsgRt(usgRt[i]);
				if (toVvdStlDt[i] != null)
					model.setToVvdStlDt(toVvdStlDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (actBsaCapa[i] != null)
					model.setActBsaCapa(actBsaCapa[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tongFletTpCd[i] != null)
					model.setTongFletTpCd(tongFletTpCd[i]);
				if (bsaCapa[i] != null)
					model.setBsaCapa(bsaCapa[i]);
				if (voyDys[i] != null)
					model.setVoyDys(voyDys[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (nrtWgt[i] != null)
					model.setNrtWgt(nrtWgt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (nrtTongTaxAmt[i] != null)
					model.setNrtTongTaxAmt(nrtTongTaxAmt[i]);
				if (ldbCapaQty[i] != null)
					model.setLdbCapaQty(ldbCapaQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (chtrBsaCapa[i] != null)
					model.setChtrBsaCapa(chtrBsaCapa[i]);
				if (tongTaxAmt[i] != null)
					model.setTongTaxAmt(tongTaxAmt[i]);
				if (perTonRev[i] != null)
					model.setPerTonRev(perTonRev[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTotVvdStlAmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TotVvdStlAmtVO[]
	 */
	public TotVvdStlAmtVO[] getTotVvdStlAmtVOs(){
		TotVvdStlAmtVO[] vos = (TotVvdStlAmtVO[])models.toArray(new TotVvdStlAmtVO[models.size()]);
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
		this.vslDzndCapa = this.vslDzndCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmVvdStlDt = this.fmVvdStlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tongStlBatJbSeq = this.tongStlBatJbSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlYrmon = this.stlYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usgRt = this.usgRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toVvdStlDt = this.toVvdStlDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBsaCapa = this.actBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tongFletTpCd = this.tongFletTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaCapa = this.bsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voyDys = this.voyDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrtWgt = this.nrtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrtTongTaxAmt = this.nrtTongTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ldbCapaQty = this.ldbCapaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chtrBsaCapa = this.chtrBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tongTaxAmt = this.tongTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.perTonRev = this.perTonRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
