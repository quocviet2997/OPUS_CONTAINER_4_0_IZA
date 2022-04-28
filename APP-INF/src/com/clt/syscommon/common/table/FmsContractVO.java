/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsContractVO.java
*@FileTitle : FmsContractVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.06
*@LastModifier : 
*@LastVersion : 1.0
* 2009.02.06  
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 
 * @since J2EE 1.5
 */

public class FmsContractVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsContractVO> models = new ArrayList<FmsContractVO>();
	
	/* Column Inpo */
	private String vslDzndCapa = null;
	/* Column Inpo */
	private String vslCd = null;
	/* Column Inpo */
	private String acmmRtAmt = null;
	/* Column Inpo */
	private String deltFlg = null;
	/* Column Inpo */
	private String fletCtrtTpCd = null;
	/* Column Inpo */
	private String doilBodOutPrc = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String foilBodOutPrc = null;
	/* Column Inpo */
	private String fletBrogRtAmt = null;
	/* Column Inpo */
	private String shpSpdQty = null;
	/* Column Inpo */
	private String rdeRngCtnt = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String nrtWgt = null;
	/* Column Inpo */
	private String vslBldDt = null;
	/* Column Inpo */
	private String foilBorOutPrc = null;
	/* Column Inpo */
	private String effDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String doilBorOutPrc = null;
	/* Column Inpo */
	private String ddwtCgoCapaQty = null;
	/* Column Inpo */
	private String actDoilBorQty = null;
	/* Column Inpo */
	private String cpDt = null;
	/* Column Inpo */
	private String expDt = null;
	/* Column Inpo */
	private String vslCntCd = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String custCntCd = null;
	/* Column Inpo */
	private String actFoilBorQty = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String rdeNtcCtnt = null;
	/* Column Inpo */
	private String actDoilBodQty = null;
	/* Column Inpo */
	private String custSeq = null;
	/* Column Inpo */
	private String fletOlayCommRtAmt = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String oaRsvAmt = null;
	/* Column Inpo */
	private String bse14tonVslCapa = null;
	/* Column Inpo */
	private String grFlg = null;
	/* Column Inpo */
	private String chtrPrdOptCtnt = null;
	/* Column Inpo */
	private String vndrSeq = null;
	/* Column Inpo */
	private String fletCtrtFactCd = null;
	/* Column Inpo */
	private String actFoilBodQty = null;
	/* Column Inpo */
	private String rfCntrPlgQty = null;
	/* Column Inpo */
	private String oaRsvCurrCd = null;
	/* Column Inpo */
	private String grsWgt = null;
	/* Column Inpo */
	private String declFlg = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsContractVO() {}

	public FmsContractVO(String ibflag, String pagerows, String fletCtrtNo, String vslCd, String fletCtrtTpCd, String vndrSeq, String custCntCd, String custSeq, String vslCntCd, String fletCtrtFactCd, String cpDt, String effDt, String expDt, String declFlg, String acmmRtAmt, String fletBrogRtAmt, String fletOlayCommRtAmt, String oaRsvAmt, String oaRsvCurrCd, String actFoilBodQty, String actDoilBodQty, String actFoilBorQty, String actDoilBorQty, String foilBodOutPrc, String doilBodOutPrc, String foilBorOutPrc, String doilBorOutPrc, String vslBldDt, String vslDzndCapa, String bse14tonVslCapa, String ddwtCgoCapaQty, String grsWgt, String nrtWgt, String chtrPrdOptCtnt, String rdeRngCtnt, String rdeNtcCtnt, String rfCntrPlgQty, String grFlg, String shpSpdQty, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslDzndCapa = vslDzndCapa;
		this.vslCd = vslCd;
		this.acmmRtAmt = acmmRtAmt;
		this.deltFlg = deltFlg;
		this.fletCtrtTpCd = fletCtrtTpCd;
		this.doilBodOutPrc = doilBodOutPrc;
		this.creDt = creDt;
		this.foilBodOutPrc = foilBodOutPrc;
		this.fletBrogRtAmt = fletBrogRtAmt;
		this.shpSpdQty = shpSpdQty;
		this.rdeRngCtnt = rdeRngCtnt;
		this.fletCtrtNo = fletCtrtNo;
		this.pagerows = pagerows;
		this.nrtWgt = nrtWgt;
		this.vslBldDt = vslBldDt;
		this.foilBorOutPrc = foilBorOutPrc;
		this.effDt = effDt;
		this.ibflag = ibflag;
		this.doilBorOutPrc = doilBorOutPrc;
		this.ddwtCgoCapaQty = ddwtCgoCapaQty;
		this.actDoilBorQty = actDoilBorQty;
		this.cpDt = cpDt;
		this.expDt = expDt;
		this.vslCntCd = vslCntCd;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.actFoilBorQty = actFoilBorQty;
		this.updDt = updDt;
		this.rdeNtcCtnt = rdeNtcCtnt;
		this.actDoilBodQty = actDoilBodQty;
		this.custSeq = custSeq;
		this.fletOlayCommRtAmt = fletOlayCommRtAmt;
		this.creUsrId = creUsrId;
		this.oaRsvAmt = oaRsvAmt;
		this.bse14tonVslCapa = bse14tonVslCapa;
		this.grFlg = grFlg;
		this.chtrPrdOptCtnt = chtrPrdOptCtnt;
		this.vndrSeq = vndrSeq;
		this.fletCtrtFactCd = fletCtrtFactCd;
		this.actFoilBodQty = actFoilBodQty;
		this.rfCntrPlgQty = rfCntrPlgQty;
		this.oaRsvCurrCd = oaRsvCurrCd;
		this.grsWgt = grsWgt;
		this.declFlg = declFlg;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_dznd_capa", getVslDzndCapa());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("acmm_rt_amt", getAcmmRtAmt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("flet_ctrt_tp_cd", getFletCtrtTpCd());
		this.hashColumns.put("doil_bod_out_prc", getDoilBodOutPrc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("foil_bod_out_prc", getFoilBodOutPrc());
		this.hashColumns.put("flet_brog_rt_amt", getFletBrogRtAmt());
		this.hashColumns.put("shp_spd_qty", getShpSpdQty());
		this.hashColumns.put("rde_rng_ctnt", getRdeRngCtnt());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("nrt_wgt", getNrtWgt());
		this.hashColumns.put("vsl_bld_dt", getVslBldDt());
		this.hashColumns.put("foil_bor_out_prc", getFoilBorOutPrc());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("doil_bor_out_prc", getDoilBorOutPrc());
		this.hashColumns.put("ddwt_cgo_capa_qty", getDdwtCgoCapaQty());
		this.hashColumns.put("act_doil_bor_qty", getActDoilBorQty());
		this.hashColumns.put("cp_dt", getCpDt());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("vsl_cnt_cd", getVslCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("act_foil_bor_qty", getActFoilBorQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rde_ntc_ctnt", getRdeNtcCtnt());
		this.hashColumns.put("act_doil_bod_qty", getActDoilBodQty());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("flet_olay_comm_rt_amt", getFletOlayCommRtAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("oa_rsv_amt", getOaRsvAmt());
		this.hashColumns.put("bse_14ton_vsl_capa", getBse14tonVslCapa());
		this.hashColumns.put("gr_flg", getGrFlg());
		this.hashColumns.put("chtr_prd_opt_ctnt", getChtrPrdOptCtnt());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("flet_ctrt_fact_cd", getFletCtrtFactCd());
		this.hashColumns.put("act_foil_bod_qty", getActFoilBodQty());
		this.hashColumns.put("rf_cntr_plg_qty", getRfCntrPlgQty());
		this.hashColumns.put("oa_rsv_curr_cd", getOaRsvCurrCd());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("decl_flg", getDeclFlg());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_dznd_capa", "vslDzndCapa");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("acmm_rt_amt", "acmmRtAmt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("flet_ctrt_tp_cd", "fletCtrtTpCd");
		this.hashFields.put("doil_bod_out_prc", "doilBodOutPrc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("foil_bod_out_prc", "foilBodOutPrc");
		this.hashFields.put("flet_brog_rt_amt", "fletBrogRtAmt");
		this.hashFields.put("shp_spd_qty", "shpSpdQty");
		this.hashFields.put("rde_rng_ctnt", "rdeRngCtnt");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("nrt_wgt", "nrtWgt");
		this.hashFields.put("vsl_bld_dt", "vslBldDt");
		this.hashFields.put("foil_bor_out_prc", "foilBorOutPrc");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("doil_bor_out_prc", "doilBorOutPrc");
		this.hashFields.put("ddwt_cgo_capa_qty", "ddwtCgoCapaQty");
		this.hashFields.put("act_doil_bor_qty", "actDoilBorQty");
		this.hashFields.put("cp_dt", "cpDt");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("vsl_cnt_cd", "vslCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("act_foil_bor_qty", "actFoilBorQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rde_ntc_ctnt", "rdeNtcCtnt");
		this.hashFields.put("act_doil_bod_qty", "actDoilBodQty");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("flet_olay_comm_rt_amt", "fletOlayCommRtAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("oa_rsv_amt", "oaRsvAmt");
		this.hashFields.put("bse_14ton_vsl_capa", "bse14tonVslCapa");
		this.hashFields.put("gr_flg", "grFlg");
		this.hashFields.put("chtr_prd_opt_ctnt", "chtrPrdOptCtnt");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("flet_ctrt_fact_cd", "fletCtrtFactCd");
		this.hashFields.put("act_foil_bod_qty", "actFoilBodQty");
		this.hashFields.put("rf_cntr_plg_qty", "rfCntrPlgQty");
		this.hashFields.put("oa_rsv_curr_cd", "oaRsvCurrCd");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("decl_flg", "declFlg");
		return this.hashFields;
	}
	
	public String getVslDzndCapa() {
		return this.vslDzndCapa;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getAcmmRtAmt() {
		return this.acmmRtAmt;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getFletCtrtTpCd() {
		return this.fletCtrtTpCd;
	}
	public String getDoilBodOutPrc() {
		return this.doilBodOutPrc;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getFoilBodOutPrc() {
		return this.foilBodOutPrc;
	}
	public String getFletBrogRtAmt() {
		return this.fletBrogRtAmt;
	}
	public String getShpSpdQty() {
		return this.shpSpdQty;
	}
	public String getRdeRngCtnt() {
		return this.rdeRngCtnt;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getNrtWgt() {
		return this.nrtWgt;
	}
	public String getVslBldDt() {
		return this.vslBldDt;
	}
	public String getFoilBorOutPrc() {
		return this.foilBorOutPrc;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getDoilBorOutPrc() {
		return this.doilBorOutPrc;
	}
	public String getDdwtCgoCapaQty() {
		return this.ddwtCgoCapaQty;
	}
	public String getActDoilBorQty() {
		return this.actDoilBorQty;
	}
	public String getCpDt() {
		return this.cpDt;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getVslCntCd() {
		return this.vslCntCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCustCntCd() {
		return this.custCntCd;
	}
	public String getActFoilBorQty() {
		return this.actFoilBorQty;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getRdeNtcCtnt() {
		return this.rdeNtcCtnt;
	}
	public String getActDoilBodQty() {
		return this.actDoilBodQty;
	}
	public String getCustSeq() {
		return this.custSeq;
	}
	public String getFletOlayCommRtAmt() {
		return this.fletOlayCommRtAmt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getOaRsvAmt() {
		return this.oaRsvAmt;
	}
	public String getBse14tonVslCapa() {
		return this.bse14tonVslCapa;
	}
	public String getGrFlg() {
		return this.grFlg;
	}
	public String getChtrPrdOptCtnt() {
		return this.chtrPrdOptCtnt;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getFletCtrtFactCd() {
		return this.fletCtrtFactCd;
	}
	public String getActFoilBodQty() {
		return this.actFoilBodQty;
	}
	public String getRfCntrPlgQty() {
		return this.rfCntrPlgQty;
	}
	public String getOaRsvCurrCd() {
		return this.oaRsvCurrCd;
	}
	public String getGrsWgt() {
		return this.grsWgt;
	}
	public String getDeclFlg() {
		return this.declFlg;
	}

	public void setVslDzndCapa(String vslDzndCapa) {
		this.vslDzndCapa = vslDzndCapa;
		//this.vslDzndCapa=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setAcmmRtAmt(String acmmRtAmt) {
		this.acmmRtAmt = acmmRtAmt;
		//this.acmmRtAmt=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setFletCtrtTpCd(String fletCtrtTpCd) {
		this.fletCtrtTpCd = fletCtrtTpCd;
		//this.fletCtrtTpCd=true;
	}
	public void setDoilBodOutPrc(String doilBodOutPrc) {
		this.doilBodOutPrc = doilBodOutPrc;
		//this.doilBodOutPrc=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setFoilBodOutPrc(String foilBodOutPrc) {
		this.foilBodOutPrc = foilBodOutPrc;
		//this.foilBodOutPrc=true;
	}
	public void setFletBrogRtAmt(String fletBrogRtAmt) {
		this.fletBrogRtAmt = fletBrogRtAmt;
		//this.fletBrogRtAmt=true;
	}
	public void setShpSpdQty(String shpSpdQty) {
		this.shpSpdQty = shpSpdQty;
		//this.shpSpdQty=true;
	}
	public void setRdeRngCtnt(String rdeRngCtnt) {
		this.rdeRngCtnt = rdeRngCtnt;
		//this.rdeRngCtnt=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setNrtWgt(String nrtWgt) {
		this.nrtWgt = nrtWgt;
		//this.nrtWgt=true;
	}
	public void setVslBldDt(String vslBldDt) {
		this.vslBldDt = vslBldDt;
		//this.vslBldDt=true;
	}
	public void setFoilBorOutPrc(String foilBorOutPrc) {
		this.foilBorOutPrc = foilBorOutPrc;
		//this.foilBorOutPrc=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setDoilBorOutPrc(String doilBorOutPrc) {
		this.doilBorOutPrc = doilBorOutPrc;
		//this.doilBorOutPrc=true;
	}
	public void setDdwtCgoCapaQty(String ddwtCgoCapaQty) {
		this.ddwtCgoCapaQty = ddwtCgoCapaQty;
		//this.ddwtCgoCapaQty=true;
	}
	public void setActDoilBorQty(String actDoilBorQty) {
		this.actDoilBorQty = actDoilBorQty;
		//this.actDoilBorQty=true;
	}
	public void setCpDt(String cpDt) {
		this.cpDt = cpDt;
		//this.cpDt=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setVslCntCd(String vslCntCd) {
		this.vslCntCd = vslCntCd;
		//this.vslCntCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
		//this.custCntCd=true;
	}
	public void setActFoilBorQty(String actFoilBorQty) {
		this.actFoilBorQty = actFoilBorQty;
		//this.actFoilBorQty=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setRdeNtcCtnt(String rdeNtcCtnt) {
		this.rdeNtcCtnt = rdeNtcCtnt;
		//this.rdeNtcCtnt=true;
	}
	public void setActDoilBodQty(String actDoilBodQty) {
		this.actDoilBodQty = actDoilBodQty;
		//this.actDoilBodQty=true;
	}
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
		//this.custSeq=true;
	}
	public void setFletOlayCommRtAmt(String fletOlayCommRtAmt) {
		this.fletOlayCommRtAmt = fletOlayCommRtAmt;
		//this.fletOlayCommRtAmt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setOaRsvAmt(String oaRsvAmt) {
		this.oaRsvAmt = oaRsvAmt;
		//this.oaRsvAmt=true;
	}
	public void setBse14tonVslCapa(String bse14tonVslCapa) {
		this.bse14tonVslCapa = bse14tonVslCapa;
		//this.bse14tonVslCapa=true;
	}
	public void setGrFlg(String grFlg) {
		this.grFlg = grFlg;
		//this.grFlg=true;
	}
	public void setChtrPrdOptCtnt(String chtrPrdOptCtnt) {
		this.chtrPrdOptCtnt = chtrPrdOptCtnt;
		//this.chtrPrdOptCtnt=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setFletCtrtFactCd(String fletCtrtFactCd) {
		this.fletCtrtFactCd = fletCtrtFactCd;
		//this.fletCtrtFactCd=true;
	}
	public void setActFoilBodQty(String actFoilBodQty) {
		this.actFoilBodQty = actFoilBodQty;
		//this.actFoilBodQty=true;
	}
	public void setRfCntrPlgQty(String rfCntrPlgQty) {
		this.rfCntrPlgQty = rfCntrPlgQty;
		//this.rfCntrPlgQty=true;
	}
	public void setOaRsvCurrCd(String oaRsvCurrCd) {
		this.oaRsvCurrCd = oaRsvCurrCd;
		//this.oaRsvCurrCd=true;
	}
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
		//this.grsWgt=true;
	}
	public void setDeclFlg(String declFlg) {
		this.declFlg = declFlg;
		//this.declFlg=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setVslDzndCapa(JSPUtil.getParameter(request, "vsl_dznd_capa", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setAcmmRtAmt(JSPUtil.getParameter(request, "acmm_rt_amt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setFletCtrtTpCd(JSPUtil.getParameter(request, "flet_ctrt_tp_cd", ""));
		setDoilBodOutPrc(JSPUtil.getParameter(request, "doil_bod_out_prc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setFoilBodOutPrc(JSPUtil.getParameter(request, "foil_bod_out_prc", ""));
		setFletBrogRtAmt(JSPUtil.getParameter(request, "flet_brog_rt_amt", ""));
		setShpSpdQty(JSPUtil.getParameter(request, "shp_spd_qty", ""));
		setRdeRngCtnt(JSPUtil.getParameter(request, "rde_rng_ctnt", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setNrtWgt(JSPUtil.getParameter(request, "nrt_wgt", ""));
		setVslBldDt(JSPUtil.getParameter(request, "vsl_bld_dt", ""));
		setFoilBorOutPrc(JSPUtil.getParameter(request, "foil_bor_out_prc", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDoilBorOutPrc(JSPUtil.getParameter(request, "doil_bor_out_prc", ""));
		setDdwtCgoCapaQty(JSPUtil.getParameter(request, "ddwt_cgo_capa_qty", ""));
		setActDoilBorQty(JSPUtil.getParameter(request, "act_doil_bor_qty", ""));
		setCpDt(JSPUtil.getParameter(request, "cp_dt", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setVslCntCd(JSPUtil.getParameter(request, "vsl_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setActFoilBorQty(JSPUtil.getParameter(request, "act_foil_bor_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRdeNtcCtnt(JSPUtil.getParameter(request, "rde_ntc_ctnt", ""));
		setActDoilBodQty(JSPUtil.getParameter(request, "act_doil_bod_qty", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setFletOlayCommRtAmt(JSPUtil.getParameter(request, "flet_olay_comm_rt_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setOaRsvAmt(JSPUtil.getParameter(request, "oa_rsv_amt", ""));
		setBse14tonVslCapa(JSPUtil.getParameter(request, "bse_14ton_vsl_capa", ""));
		setGrFlg(JSPUtil.getParameter(request, "gr_flg", ""));
		setChtrPrdOptCtnt(JSPUtil.getParameter(request, "chtr_prd_opt_ctnt", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setFletCtrtFactCd(JSPUtil.getParameter(request, "flet_ctrt_fact_cd", ""));
		setActFoilBodQty(JSPUtil.getParameter(request, "act_foil_bod_qty", ""));
		setRfCntrPlgQty(JSPUtil.getParameter(request, "rf_cntr_plg_qty", ""));
		setOaRsvCurrCd(JSPUtil.getParameter(request, "oa_rsv_curr_cd", ""));
		setGrsWgt(JSPUtil.getParameter(request, "grs_wgt", ""));
		setDeclFlg(JSPUtil.getParameter(request, "decl_flg", ""));
	}

	public FmsContractVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public FmsContractVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsContractVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslDzndCapa = (JSPUtil.getParameter(request, prefix	+ "vsl_dznd_capa".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] acmmRtAmt = (JSPUtil.getParameter(request, prefix	+ "acmm_rt_amt".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] fletCtrtTpCd = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_tp_cd".trim(), length));
			String[] doilBodOutPrc = (JSPUtil.getParameter(request, prefix	+ "doil_bod_out_prc".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] foilBodOutPrc = (JSPUtil.getParameter(request, prefix	+ "foil_bod_out_prc".trim(), length));
			String[] fletBrogRtAmt = (JSPUtil.getParameter(request, prefix	+ "flet_brog_rt_amt".trim(), length));
			String[] shpSpdQty = (JSPUtil.getParameter(request, prefix	+ "shp_spd_qty".trim(), length));
			String[] rdeRngCtnt = (JSPUtil.getParameter(request, prefix	+ "rde_rng_ctnt".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] nrtWgt = (JSPUtil.getParameter(request, prefix	+ "nrt_wgt".trim(), length));
			String[] vslBldDt = (JSPUtil.getParameter(request, prefix	+ "vsl_bld_dt".trim(), length));
			String[] foilBorOutPrc = (JSPUtil.getParameter(request, prefix	+ "foil_bor_out_prc".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] doilBorOutPrc = (JSPUtil.getParameter(request, prefix	+ "doil_bor_out_prc".trim(), length));
			String[] ddwtCgoCapaQty = (JSPUtil.getParameter(request, prefix	+ "ddwt_cgo_capa_qty".trim(), length));
			String[] actDoilBorQty = (JSPUtil.getParameter(request, prefix	+ "act_doil_bor_qty".trim(), length));
			String[] cpDt = (JSPUtil.getParameter(request, prefix	+ "cp_dt".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] vslCntCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cnt_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd".trim(), length));
			String[] actFoilBorQty = (JSPUtil.getParameter(request, prefix	+ "act_foil_bor_qty".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] rdeNtcCtnt = (JSPUtil.getParameter(request, prefix	+ "rde_ntc_ctnt".trim(), length));
			String[] actDoilBodQty = (JSPUtil.getParameter(request, prefix	+ "act_doil_bod_qty".trim(), length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq".trim(), length));
			String[] fletOlayCommRtAmt = (JSPUtil.getParameter(request, prefix	+ "flet_olay_comm_rt_amt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] oaRsvAmt = (JSPUtil.getParameter(request, prefix	+ "oa_rsv_amt".trim(), length));
			String[] bse14tonVslCapa = (JSPUtil.getParameter(request, prefix	+ "bse_14ton_vsl_capa".trim(), length));
			String[] grFlg = (JSPUtil.getParameter(request, prefix	+ "gr_flg".trim(), length));
			String[] chtrPrdOptCtnt = (JSPUtil.getParameter(request, prefix	+ "chtr_prd_opt_ctnt".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] fletCtrtFactCd = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_fact_cd".trim(), length));
			String[] actFoilBodQty = (JSPUtil.getParameter(request, prefix	+ "act_foil_bod_qty".trim(), length));
			String[] rfCntrPlgQty = (JSPUtil.getParameter(request, prefix	+ "rf_cntr_plg_qty".trim(), length));
			String[] oaRsvCurrCd = (JSPUtil.getParameter(request, prefix	+ "oa_rsv_curr_cd".trim(), length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt".trim(), length));
			String[] declFlg = (JSPUtil.getParameter(request, prefix	+ "decl_flg".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsContractVO();
				if (vslDzndCapa[i] != null)
					model.setVslDzndCapa(vslDzndCapa[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (acmmRtAmt[i] != null)
					model.setAcmmRtAmt(acmmRtAmt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (fletCtrtTpCd[i] != null)
					model.setFletCtrtTpCd(fletCtrtTpCd[i]);
				if (doilBodOutPrc[i] != null)
					model.setDoilBodOutPrc(doilBodOutPrc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (foilBodOutPrc[i] != null)
					model.setFoilBodOutPrc(foilBodOutPrc[i]);
				if (fletBrogRtAmt[i] != null)
					model.setFletBrogRtAmt(fletBrogRtAmt[i]);
				if (shpSpdQty[i] != null)
					model.setShpSpdQty(shpSpdQty[i]);
				if (rdeRngCtnt[i] != null)
					model.setRdeRngCtnt(rdeRngCtnt[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (nrtWgt[i] != null)
					model.setNrtWgt(nrtWgt[i]);
				if (vslBldDt[i] != null)
					model.setVslBldDt(vslBldDt[i]);
				if (foilBorOutPrc[i] != null)
					model.setFoilBorOutPrc(foilBorOutPrc[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (doilBorOutPrc[i] != null)
					model.setDoilBorOutPrc(doilBorOutPrc[i]);
				if (ddwtCgoCapaQty[i] != null)
					model.setDdwtCgoCapaQty(ddwtCgoCapaQty[i]);
				if (actDoilBorQty[i] != null)
					model.setActDoilBorQty(actDoilBorQty[i]);
				if (cpDt[i] != null)
					model.setCpDt(cpDt[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (vslCntCd[i] != null)
					model.setVslCntCd(vslCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (actFoilBorQty[i] != null)
					model.setActFoilBorQty(actFoilBorQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rdeNtcCtnt[i] != null)
					model.setRdeNtcCtnt(rdeNtcCtnt[i]);
				if (actDoilBodQty[i] != null)
					model.setActDoilBodQty(actDoilBodQty[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (fletOlayCommRtAmt[i] != null)
					model.setFletOlayCommRtAmt(fletOlayCommRtAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (oaRsvAmt[i] != null)
					model.setOaRsvAmt(oaRsvAmt[i]);
				if (bse14tonVslCapa[i] != null)
					model.setBse14tonVslCapa(bse14tonVslCapa[i]);
				if (grFlg[i] != null)
					model.setGrFlg(grFlg[i]);
				if (chtrPrdOptCtnt[i] != null)
					model.setChtrPrdOptCtnt(chtrPrdOptCtnt[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (fletCtrtFactCd[i] != null)
					model.setFletCtrtFactCd(fletCtrtFactCd[i]);
				if (actFoilBodQty[i] != null)
					model.setActFoilBodQty(actFoilBodQty[i]);
				if (rfCntrPlgQty[i] != null)
					model.setRfCntrPlgQty(rfCntrPlgQty[i]);
				if (oaRsvCurrCd[i] != null)
					model.setOaRsvCurrCd(oaRsvCurrCd[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (declFlg[i] != null)
					model.setDeclFlg(declFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getFmsContractVOs();
	}

	public FmsContractVO[] getFmsContractVOs(){
		FmsContractVO[] vos = (FmsContractVO[])models.toArray(new FmsContractVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}

}
