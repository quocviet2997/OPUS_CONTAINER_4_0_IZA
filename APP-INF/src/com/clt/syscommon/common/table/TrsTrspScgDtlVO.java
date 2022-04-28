/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : TrsTrspScgDtlVO.java
*@FileTitle : TrsTrspScgDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.11
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2010.03.11 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspScgDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspScgDtlVO> models = new ArrayList<TrsTrspScgDtlVO>();
	
	/* Column Info */
	private String invLftgKnt = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String inspRfPtiCstmsTpCd = null;
	/* Column Info */
	private String invDryRunRlblPtyTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n3ptyDesc = null;
	/* Column Info */
	private String n3ptyOfcCd = null;
	/* Column Info */
	private String wtHrs = null;
	/* Column Info */
	private String lftgCuzDesc = null;
	/* Column Info */
	private String otrRmk = null;
	/* Column Info */
	private String invObBkgNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String incrtDt = null;
	/* Column Info */
	private String n3ptyVndrSeq = null;
	/* Column Info */
	private String invChssMgstTpszCd = null;
	/* Column Info */
	private String invWtHrs = null;
	/* Column Info */
	private String invFumgCostTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String hjlNo = null;
	/* Column Info */
	private String stopLocNodCd = null;
	/* Column Info */
	private String invIncrtDt = null;
	/* Column Info */
	private String invLftgCuzDesc = null;
	/* Column Info */
	private String incurDt = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String grsWgt = null;
	/* Column Info */
	private String mgstTpszCd = null;
	/* Column Info */
	private String invSclStopPlcNodCd = null;
	/* Column Info */
	private String n3ptyAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String lftgKnt = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String invMgstTpszCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String stoDys = null;
	/* Column Info */
	private String invStoDys = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String fneCuzDesc = null;
	/* Column Info */
	private String obBkgNo = null;
	/* Column Info */
	private String invGrsWgt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String invIncurDt = null;
	/* Column Info */
	private String invInspRfPtiCstmsTpCd = null;
	/* Column Info */
	private String dryRunRlblPtyTpCd = null;
	/* Column Info */
	private String invOtrRmk = null;
	/* Column Info */
	private String sclStopPlcNodCd = null;
	/* Column Info */
	private String chssMgstTpszCd = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String n3ptyBilFlg = null;
	/* Column Info */
	private String invScgAmt = null;
	/* Column Info */
	private String fumgCostTpCd = null;
	/* Column Info */
	private String invStopLocNodCd = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String scgAmt = null;
	/* Column Info */
	private String invChssNo = null;
	/* Column Info */
	private String invFneCuzDesc = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspScgDtlVO() {}

	public TrsTrspScgDtlVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String lgsCostCd, String scgAmt, String chssMgstTpszCd, String dryRunRlblPtyTpCd, String fneCuzDesc, String fumgCostTpCd, String mgstTpszCd, String inspRfPtiCstmsTpCd, String lftgKnt, String lftgCuzDesc, String stopLocNodCd, String grsWgt, String incrtDt, String sclStopPlcNodCd, String obBkgNo, String otrRmk, String invScgAmt, String invChssMgstTpszCd, String invDryRunRlblPtyTpCd, String invFneCuzDesc, String invFumgCostTpCd, String invMgstTpszCd, String invInspRfPtiCstmsTpCd, String invLftgKnt, String invLftgCuzDesc, String invStopLocNodCd, String invGrsWgt, String invIncrtDt, String invSclStopPlcNodCd, String invObBkgNo, String invOtrRmk, String n3ptyBilFlg, String custCntCd, String custSeq, String n3ptyVndrSeq, String n3ptyOfcCd, String n3ptyAmt, String n3ptyDesc, String creOfcCd, String hjlNo, String stoDys, String wtHrs, String invStoDys, String invWtHrs, String loclCreDt, String loclUpdDt, String incurDt, String chssNo, String creUsrId, String creDt, String updUsrId, String updDt, String invIncurDt, String invChssNo) {
		this.invLftgKnt = invLftgKnt;
		this.chssNo = chssNo;
		this.trspSoSeq = trspSoSeq;
		this.inspRfPtiCstmsTpCd = inspRfPtiCstmsTpCd;
		this.invDryRunRlblPtyTpCd = invDryRunRlblPtyTpCd;
		this.pagerows = pagerows;
		this.n3ptyDesc = n3ptyDesc;
		this.n3ptyOfcCd = n3ptyOfcCd;
		this.wtHrs = wtHrs;
		this.lftgCuzDesc = lftgCuzDesc;
		this.otrRmk = otrRmk;
		this.invObBkgNo = invObBkgNo;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.incrtDt = incrtDt;
		this.n3ptyVndrSeq = n3ptyVndrSeq;
		this.invChssMgstTpszCd = invChssMgstTpszCd;
		this.invWtHrs = invWtHrs;
		this.invFumgCostTpCd = invFumgCostTpCd;
		this.creUsrId = creUsrId;
		this.hjlNo = hjlNo;
		this.stopLocNodCd = stopLocNodCd;
		this.invIncrtDt = invIncrtDt;
		this.invLftgCuzDesc = invLftgCuzDesc;
		this.incurDt = incurDt;
		this.loclUpdDt = loclUpdDt;
		this.grsWgt = grsWgt;
		this.mgstTpszCd = mgstTpszCd;
		this.invSclStopPlcNodCd = invSclStopPlcNodCd;
		this.n3ptyAmt = n3ptyAmt;
		this.creDt = creDt;
		this.lftgKnt = lftgKnt;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.invMgstTpszCd = invMgstTpszCd;
		this.ibflag = ibflag;
		this.stoDys = stoDys;
		this.invStoDys = invStoDys;
		this.creOfcCd = creOfcCd;
		this.fneCuzDesc = fneCuzDesc;
		this.obBkgNo = obBkgNo;
		this.invGrsWgt = invGrsWgt;
		this.updDt = updDt;
		this.invIncurDt = invIncurDt;
		this.invInspRfPtiCstmsTpCd = invInspRfPtiCstmsTpCd;
		this.dryRunRlblPtyTpCd = dryRunRlblPtyTpCd;
		this.invOtrRmk = invOtrRmk;
		this.sclStopPlcNodCd = sclStopPlcNodCd;
		this.chssMgstTpszCd = chssMgstTpszCd;
		this.loclCreDt = loclCreDt;
		this.custSeq = custSeq;
		this.n3ptyBilFlg = n3ptyBilFlg;
		this.invScgAmt = invScgAmt;
		this.fumgCostTpCd = fumgCostTpCd;
		this.invStopLocNodCd = invStopLocNodCd;
		this.lgsCostCd = lgsCostCd;
		this.scgAmt = scgAmt;
		this.invChssNo = invChssNo;
		this.invFneCuzDesc = invFneCuzDesc;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("inv_lftg_knt", getInvLftgKnt());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("insp_rf_pti_cstms_tp_cd", getInspRfPtiCstmsTpCd());
		this.hashColumns.put("inv_dry_run_rlbl_pty_tp_cd", getInvDryRunRlblPtyTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n3pty_desc", getN3ptyDesc());
		this.hashColumns.put("n3pty_ofc_cd", getN3ptyOfcCd());
		this.hashColumns.put("wt_hrs", getWtHrs());
		this.hashColumns.put("lftg_cuz_desc", getLftgCuzDesc());
		this.hashColumns.put("otr_rmk", getOtrRmk());
		this.hashColumns.put("inv_ob_bkg_no", getInvObBkgNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("incrt_dt", getIncrtDt());
		this.hashColumns.put("n3pty_vndr_seq", getN3ptyVndrSeq());
		this.hashColumns.put("inv_chss_mgst_tpsz_cd", getInvChssMgstTpszCd());
		this.hashColumns.put("inv_wt_hrs", getInvWtHrs());
		this.hashColumns.put("inv_fumg_cost_tp_cd", getInvFumgCostTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hjl_no", getHjlNo());
		this.hashColumns.put("stop_loc_nod_cd", getStopLocNodCd());
		this.hashColumns.put("inv_incrt_dt", getInvIncrtDt());
		this.hashColumns.put("inv_lftg_cuz_desc", getInvLftgCuzDesc());
		this.hashColumns.put("incur_dt", getIncurDt());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("mgst_tpsz_cd", getMgstTpszCd());
		this.hashColumns.put("inv_scl_stop_plc_nod_cd", getInvSclStopPlcNodCd());
		this.hashColumns.put("n3pty_amt", getN3ptyAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("lftg_knt", getLftgKnt());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("inv_mgst_tpsz_cd", getInvMgstTpszCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sto_dys", getStoDys());
		this.hashColumns.put("inv_sto_dys", getInvStoDys());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("fne_cuz_desc", getFneCuzDesc());
		this.hashColumns.put("ob_bkg_no", getObBkgNo());
		this.hashColumns.put("inv_grs_wgt", getInvGrsWgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("inv_incur_dt", getInvIncurDt());
		this.hashColumns.put("inv_insp_rf_pti_cstms_tp_cd", getInvInspRfPtiCstmsTpCd());
		this.hashColumns.put("dry_run_rlbl_pty_tp_cd", getDryRunRlblPtyTpCd());
		this.hashColumns.put("inv_otr_rmk", getInvOtrRmk());
		this.hashColumns.put("scl_stop_plc_nod_cd", getSclStopPlcNodCd());
		this.hashColumns.put("chss_mgst_tpsz_cd", getChssMgstTpszCd());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("n3pty_bil_flg", getN3ptyBilFlg());
		this.hashColumns.put("inv_scg_amt", getInvScgAmt());
		this.hashColumns.put("fumg_cost_tp_cd", getFumgCostTpCd());
		this.hashColumns.put("inv_stop_loc_nod_cd", getInvStopLocNodCd());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("scg_amt", getScgAmt());
		this.hashColumns.put("inv_chss_no", getInvChssNo());
		this.hashColumns.put("inv_fne_cuz_desc", getInvFneCuzDesc());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("inv_lftg_knt", "invLftgKnt");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("insp_rf_pti_cstms_tp_cd", "inspRfPtiCstmsTpCd");
		this.hashFields.put("inv_dry_run_rlbl_pty_tp_cd", "invDryRunRlblPtyTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n3pty_desc", "n3ptyDesc");
		this.hashFields.put("n3pty_ofc_cd", "n3ptyOfcCd");
		this.hashFields.put("wt_hrs", "wtHrs");
		this.hashFields.put("lftg_cuz_desc", "lftgCuzDesc");
		this.hashFields.put("otr_rmk", "otrRmk");
		this.hashFields.put("inv_ob_bkg_no", "invObBkgNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("incrt_dt", "incrtDt");
		this.hashFields.put("n3pty_vndr_seq", "n3ptyVndrSeq");
		this.hashFields.put("inv_chss_mgst_tpsz_cd", "invChssMgstTpszCd");
		this.hashFields.put("inv_wt_hrs", "invWtHrs");
		this.hashFields.put("inv_fumg_cost_tp_cd", "invFumgCostTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hjl_no", "hjlNo");
		this.hashFields.put("stop_loc_nod_cd", "stopLocNodCd");
		this.hashFields.put("inv_incrt_dt", "invIncrtDt");
		this.hashFields.put("inv_lftg_cuz_desc", "invLftgCuzDesc");
		this.hashFields.put("incur_dt", "incurDt");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("mgst_tpsz_cd", "mgstTpszCd");
		this.hashFields.put("inv_scl_stop_plc_nod_cd", "invSclStopPlcNodCd");
		this.hashFields.put("n3pty_amt", "n3ptyAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("lftg_knt", "lftgKnt");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("inv_mgst_tpsz_cd", "invMgstTpszCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sto_dys", "stoDys");
		this.hashFields.put("inv_sto_dys", "invStoDys");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("fne_cuz_desc", "fneCuzDesc");
		this.hashFields.put("ob_bkg_no", "obBkgNo");
		this.hashFields.put("inv_grs_wgt", "invGrsWgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("inv_incur_dt", "invIncurDt");
		this.hashFields.put("inv_insp_rf_pti_cstms_tp_cd", "invInspRfPtiCstmsTpCd");
		this.hashFields.put("dry_run_rlbl_pty_tp_cd", "dryRunRlblPtyTpCd");
		this.hashFields.put("inv_otr_rmk", "invOtrRmk");
		this.hashFields.put("scl_stop_plc_nod_cd", "sclStopPlcNodCd");
		this.hashFields.put("chss_mgst_tpsz_cd", "chssMgstTpszCd");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("n3pty_bil_flg", "n3ptyBilFlg");
		this.hashFields.put("inv_scg_amt", "invScgAmt");
		this.hashFields.put("fumg_cost_tp_cd", "fumgCostTpCd");
		this.hashFields.put("inv_stop_loc_nod_cd", "invStopLocNodCd");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("scg_amt", "scgAmt");
		this.hashFields.put("inv_chss_no", "invChssNo");
		this.hashFields.put("inv_fne_cuz_desc", "invFneCuzDesc");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return invLftgKnt
	 */
	public String getInvLftgKnt() {
		return this.invLftgKnt;
	}
	
	/**
	 * Column Info
	 * @return chssNo
	 */
	public String getChssNo() {
		return this.chssNo;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @return inspRfPtiCstmsTpCd
	 */
	public String getInspRfPtiCstmsTpCd() {
		return this.inspRfPtiCstmsTpCd;
	}
	
	/**
	 * Column Info
	 * @return invDryRunRlblPtyTpCd
	 */
	public String getInvDryRunRlblPtyTpCd() {
		return this.invDryRunRlblPtyTpCd;
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
	 * @return n3ptyDesc
	 */
	public String getN3ptyDesc() {
		return this.n3ptyDesc;
	}
	
	/**
	 * Column Info
	 * @return n3ptyOfcCd
	 */
	public String getN3ptyOfcCd() {
		return this.n3ptyOfcCd;
	}
	
	/**
	 * Column Info
	 * @return wtHrs
	 */
	public String getWtHrs() {
		return this.wtHrs;
	}
	
	/**
	 * Column Info
	 * @return lftgCuzDesc
	 */
	public String getLftgCuzDesc() {
		return this.lftgCuzDesc;
	}
	
	/**
	 * Column Info
	 * @return otrRmk
	 */
	public String getOtrRmk() {
		return this.otrRmk;
	}
	
	/**
	 * Column Info
	 * @return invObBkgNo
	 */
	public String getInvObBkgNo() {
		return this.invObBkgNo;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return incrtDt
	 */
	public String getIncrtDt() {
		return this.incrtDt;
	}
	
	/**
	 * Column Info
	 * @return n3ptyVndrSeq
	 */
	public String getN3ptyVndrSeq() {
		return this.n3ptyVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return invChssMgstTpszCd
	 */
	public String getInvChssMgstTpszCd() {
		return this.invChssMgstTpszCd;
	}
	
	/**
	 * Column Info
	 * @return invWtHrs
	 */
	public String getInvWtHrs() {
		return this.invWtHrs;
	}
	
	/**
	 * Column Info
	 * @return invFumgCostTpCd
	 */
	public String getInvFumgCostTpCd() {
		return this.invFumgCostTpCd;
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
	 * @return hjlNo
	 */
	public String getHjlNo() {
		return this.hjlNo;
	}
	
	/**
	 * Column Info
	 * @return stopLocNodCd
	 */
	public String getStopLocNodCd() {
		return this.stopLocNodCd;
	}
	
	/**
	 * Column Info
	 * @return invIncrtDt
	 */
	public String getInvIncrtDt() {
		return this.invIncrtDt;
	}
	
	/**
	 * Column Info
	 * @return invLftgCuzDesc
	 */
	public String getInvLftgCuzDesc() {
		return this.invLftgCuzDesc;
	}
	
	/**
	 * Column Info
	 * @return incurDt
	 */
	public String getIncurDt() {
		return this.incurDt;
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
	 * @return grsWgt
	 */
	public String getGrsWgt() {
		return this.grsWgt;
	}
	
	/**
	 * Column Info
	 * @return mgstTpszCd
	 */
	public String getMgstTpszCd() {
		return this.mgstTpszCd;
	}
	
	/**
	 * Column Info
	 * @return invSclStopPlcNodCd
	 */
	public String getInvSclStopPlcNodCd() {
		return this.invSclStopPlcNodCd;
	}
	
	/**
	 * Column Info
	 * @return n3ptyAmt
	 */
	public String getN3ptyAmt() {
		return this.n3ptyAmt;
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
	 * @return lftgKnt
	 */
	public String getLftgKnt() {
		return this.lftgKnt;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return invMgstTpszCd
	 */
	public String getInvMgstTpszCd() {
		return this.invMgstTpszCd;
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
	 * @return stoDys
	 */
	public String getStoDys() {
		return this.stoDys;
	}
	
	/**
	 * Column Info
	 * @return invStoDys
	 */
	public String getInvStoDys() {
		return this.invStoDys;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return fneCuzDesc
	 */
	public String getFneCuzDesc() {
		return this.fneCuzDesc;
	}
	
	/**
	 * Column Info
	 * @return obBkgNo
	 */
	public String getObBkgNo() {
		return this.obBkgNo;
	}
	
	/**
	 * Column Info
	 * @return invGrsWgt
	 */
	public String getInvGrsWgt() {
		return this.invGrsWgt;
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
	 * @return invIncurDt
	 */
	public String getInvIncurDt() {
		return this.invIncurDt;
	}
	
	/**
	 * Column Info
	 * @return invInspRfPtiCstmsTpCd
	 */
	public String getInvInspRfPtiCstmsTpCd() {
		return this.invInspRfPtiCstmsTpCd;
	}
	
	/**
	 * Column Info
	 * @return dryRunRlblPtyTpCd
	 */
	public String getDryRunRlblPtyTpCd() {
		return this.dryRunRlblPtyTpCd;
	}
	
	/**
	 * Column Info
	 * @return invOtrRmk
	 */
	public String getInvOtrRmk() {
		return this.invOtrRmk;
	}
	
	/**
	 * Column Info
	 * @return sclStopPlcNodCd
	 */
	public String getSclStopPlcNodCd() {
		return this.sclStopPlcNodCd;
	}
	
	/**
	 * Column Info
	 * @return chssMgstTpszCd
	 */
	public String getChssMgstTpszCd() {
		return this.chssMgstTpszCd;
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
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return n3ptyBilFlg
	 */
	public String getN3ptyBilFlg() {
		return this.n3ptyBilFlg;
	}
	
	/**
	 * Column Info
	 * @return invScgAmt
	 */
	public String getInvScgAmt() {
		return this.invScgAmt;
	}
	
	/**
	 * Column Info
	 * @return fumgCostTpCd
	 */
	public String getFumgCostTpCd() {
		return this.fumgCostTpCd;
	}
	
	/**
	 * Column Info
	 * @return invStopLocNodCd
	 */
	public String getInvStopLocNodCd() {
		return this.invStopLocNodCd;
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
	 * @return scgAmt
	 */
	public String getScgAmt() {
		return this.scgAmt;
	}
	
	/**
	 * Column Info
	 * @return invChssNo
	 */
	public String getInvChssNo() {
		return this.invChssNo;
	}
	
	/**
	 * Column Info
	 * @return invFneCuzDesc
	 */
	public String getInvFneCuzDesc() {
		return this.invFneCuzDesc;
	}
	

	/**
	 * Column Info
	 * @param invLftgKnt
	 */
	public void setInvLftgKnt(String invLftgKnt) {
		this.invLftgKnt = invLftgKnt;
	}
	
	/**
	 * Column Info
	 * @param chssNo
	 */
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @param inspRfPtiCstmsTpCd
	 */
	public void setInspRfPtiCstmsTpCd(String inspRfPtiCstmsTpCd) {
		this.inspRfPtiCstmsTpCd = inspRfPtiCstmsTpCd;
	}
	
	/**
	 * Column Info
	 * @param invDryRunRlblPtyTpCd
	 */
	public void setInvDryRunRlblPtyTpCd(String invDryRunRlblPtyTpCd) {
		this.invDryRunRlblPtyTpCd = invDryRunRlblPtyTpCd;
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
	 * @param n3ptyDesc
	 */
	public void setN3ptyDesc(String n3ptyDesc) {
		this.n3ptyDesc = n3ptyDesc;
	}
	
	/**
	 * Column Info
	 * @param n3ptyOfcCd
	 */
	public void setN3ptyOfcCd(String n3ptyOfcCd) {
		this.n3ptyOfcCd = n3ptyOfcCd;
	}
	
	/**
	 * Column Info
	 * @param wtHrs
	 */
	public void setWtHrs(String wtHrs) {
		this.wtHrs = wtHrs;
	}
	
	/**
	 * Column Info
	 * @param lftgCuzDesc
	 */
	public void setLftgCuzDesc(String lftgCuzDesc) {
		this.lftgCuzDesc = lftgCuzDesc;
	}
	
	/**
	 * Column Info
	 * @param otrRmk
	 */
	public void setOtrRmk(String otrRmk) {
		this.otrRmk = otrRmk;
	}
	
	/**
	 * Column Info
	 * @param invObBkgNo
	 */
	public void setInvObBkgNo(String invObBkgNo) {
		this.invObBkgNo = invObBkgNo;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param incrtDt
	 */
	public void setIncrtDt(String incrtDt) {
		this.incrtDt = incrtDt;
	}
	
	/**
	 * Column Info
	 * @param n3ptyVndrSeq
	 */
	public void setN3ptyVndrSeq(String n3ptyVndrSeq) {
		this.n3ptyVndrSeq = n3ptyVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param invChssMgstTpszCd
	 */
	public void setInvChssMgstTpszCd(String invChssMgstTpszCd) {
		this.invChssMgstTpszCd = invChssMgstTpszCd;
	}
	
	/**
	 * Column Info
	 * @param invWtHrs
	 */
	public void setInvWtHrs(String invWtHrs) {
		this.invWtHrs = invWtHrs;
	}
	
	/**
	 * Column Info
	 * @param invFumgCostTpCd
	 */
	public void setInvFumgCostTpCd(String invFumgCostTpCd) {
		this.invFumgCostTpCd = invFumgCostTpCd;
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
	 * @param hjlNo
	 */
	public void setHjlNo(String hjlNo) {
		this.hjlNo = hjlNo;
	}
	
	/**
	 * Column Info
	 * @param stopLocNodCd
	 */
	public void setStopLocNodCd(String stopLocNodCd) {
		this.stopLocNodCd = stopLocNodCd;
	}
	
	/**
	 * Column Info
	 * @param invIncrtDt
	 */
	public void setInvIncrtDt(String invIncrtDt) {
		this.invIncrtDt = invIncrtDt;
	}
	
	/**
	 * Column Info
	 * @param invLftgCuzDesc
	 */
	public void setInvLftgCuzDesc(String invLftgCuzDesc) {
		this.invLftgCuzDesc = invLftgCuzDesc;
	}
	
	/**
	 * Column Info
	 * @param incurDt
	 */
	public void setIncurDt(String incurDt) {
		this.incurDt = incurDt;
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
	 * @param grsWgt
	 */
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
	}
	
	/**
	 * Column Info
	 * @param mgstTpszCd
	 */
	public void setMgstTpszCd(String mgstTpszCd) {
		this.mgstTpszCd = mgstTpszCd;
	}
	
	/**
	 * Column Info
	 * @param invSclStopPlcNodCd
	 */
	public void setInvSclStopPlcNodCd(String invSclStopPlcNodCd) {
		this.invSclStopPlcNodCd = invSclStopPlcNodCd;
	}
	
	/**
	 * Column Info
	 * @param n3ptyAmt
	 */
	public void setN3ptyAmt(String n3ptyAmt) {
		this.n3ptyAmt = n3ptyAmt;
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
	 * @param lftgKnt
	 */
	public void setLftgKnt(String lftgKnt) {
		this.lftgKnt = lftgKnt;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param invMgstTpszCd
	 */
	public void setInvMgstTpszCd(String invMgstTpszCd) {
		this.invMgstTpszCd = invMgstTpszCd;
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
	 * @param stoDys
	 */
	public void setStoDys(String stoDys) {
		this.stoDys = stoDys;
	}
	
	/**
	 * Column Info
	 * @param invStoDys
	 */
	public void setInvStoDys(String invStoDys) {
		this.invStoDys = invStoDys;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param fneCuzDesc
	 */
	public void setFneCuzDesc(String fneCuzDesc) {
		this.fneCuzDesc = fneCuzDesc;
	}
	
	/**
	 * Column Info
	 * @param obBkgNo
	 */
	public void setObBkgNo(String obBkgNo) {
		this.obBkgNo = obBkgNo;
	}
	
	/**
	 * Column Info
	 * @param invGrsWgt
	 */
	public void setInvGrsWgt(String invGrsWgt) {
		this.invGrsWgt = invGrsWgt;
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
	 * @param invIncurDt
	 */
	public void setInvIncurDt(String invIncurDt) {
		this.invIncurDt = invIncurDt;
	}
	
	/**
	 * Column Info
	 * @param invInspRfPtiCstmsTpCd
	 */
	public void setInvInspRfPtiCstmsTpCd(String invInspRfPtiCstmsTpCd) {
		this.invInspRfPtiCstmsTpCd = invInspRfPtiCstmsTpCd;
	}
	
	/**
	 * Column Info
	 * @param dryRunRlblPtyTpCd
	 */
	public void setDryRunRlblPtyTpCd(String dryRunRlblPtyTpCd) {
		this.dryRunRlblPtyTpCd = dryRunRlblPtyTpCd;
	}
	
	/**
	 * Column Info
	 * @param invOtrRmk
	 */
	public void setInvOtrRmk(String invOtrRmk) {
		this.invOtrRmk = invOtrRmk;
	}
	
	/**
	 * Column Info
	 * @param sclStopPlcNodCd
	 */
	public void setSclStopPlcNodCd(String sclStopPlcNodCd) {
		this.sclStopPlcNodCd = sclStopPlcNodCd;
	}
	
	/**
	 * Column Info
	 * @param chssMgstTpszCd
	 */
	public void setChssMgstTpszCd(String chssMgstTpszCd) {
		this.chssMgstTpszCd = chssMgstTpszCd;
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
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param n3ptyBilFlg
	 */
	public void setN3ptyBilFlg(String n3ptyBilFlg) {
		this.n3ptyBilFlg = n3ptyBilFlg;
	}
	
	/**
	 * Column Info
	 * @param invScgAmt
	 */
	public void setInvScgAmt(String invScgAmt) {
		this.invScgAmt = invScgAmt;
	}
	
	/**
	 * Column Info
	 * @param fumgCostTpCd
	 */
	public void setFumgCostTpCd(String fumgCostTpCd) {
		this.fumgCostTpCd = fumgCostTpCd;
	}
	
	/**
	 * Column Info
	 * @param invStopLocNodCd
	 */
	public void setInvStopLocNodCd(String invStopLocNodCd) {
		this.invStopLocNodCd = invStopLocNodCd;
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
	 * @param scgAmt
	 */
	public void setScgAmt(String scgAmt) {
		this.scgAmt = scgAmt;
	}
	
	/**
	 * Column Info
	 * @param invChssNo
	 */
	public void setInvChssNo(String invChssNo) {
		this.invChssNo = invChssNo;
	}
	
	/**
	 * Column Info
	 * @param invFneCuzDesc
	 */
	public void setInvFneCuzDesc(String invFneCuzDesc) {
		this.invFneCuzDesc = invFneCuzDesc;
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
		setInvLftgKnt(JSPUtil.getParameter(request, prefix + "inv_lftg_knt", ""));
		setChssNo(JSPUtil.getParameter(request, prefix + "chss_no", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setInspRfPtiCstmsTpCd(JSPUtil.getParameter(request, prefix + "insp_rf_pti_cstms_tp_cd", ""));
		setInvDryRunRlblPtyTpCd(JSPUtil.getParameter(request, prefix + "inv_dry_run_rlbl_pty_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setN3ptyDesc(JSPUtil.getParameter(request, prefix + "n3pty_desc", ""));
		setN3ptyOfcCd(JSPUtil.getParameter(request, prefix + "n3pty_ofc_cd", ""));
		setWtHrs(JSPUtil.getParameter(request, prefix + "wt_hrs", ""));
		setLftgCuzDesc(JSPUtil.getParameter(request, prefix + "lftg_cuz_desc", ""));
		setOtrRmk(JSPUtil.getParameter(request, prefix + "otr_rmk", ""));
		setInvObBkgNo(JSPUtil.getParameter(request, prefix + "inv_ob_bkg_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
		setIncrtDt(JSPUtil.getParameter(request, prefix + "incrt_dt", ""));
		setN3ptyVndrSeq(JSPUtil.getParameter(request, prefix + "n3pty_vndr_seq", ""));
		setInvChssMgstTpszCd(JSPUtil.getParameter(request, prefix + "inv_chss_mgst_tpsz_cd", ""));
		setInvWtHrs(JSPUtil.getParameter(request, prefix + "inv_wt_hrs", ""));
		setInvFumgCostTpCd(JSPUtil.getParameter(request, prefix + "inv_fumg_cost_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setHjlNo(JSPUtil.getParameter(request, prefix + "hjl_no", ""));
		setStopLocNodCd(JSPUtil.getParameter(request, prefix + "stop_loc_nod_cd", ""));
		setInvIncrtDt(JSPUtil.getParameter(request, prefix + "inv_incrt_dt", ""));
		setInvLftgCuzDesc(JSPUtil.getParameter(request, prefix + "inv_lftg_cuz_desc", ""));
		setIncurDt(JSPUtil.getParameter(request, prefix + "incur_dt", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, prefix + "locl_upd_dt", ""));
		setGrsWgt(JSPUtil.getParameter(request, prefix + "grs_wgt", ""));
		setMgstTpszCd(JSPUtil.getParameter(request, prefix + "mgst_tpsz_cd", ""));
		setInvSclStopPlcNodCd(JSPUtil.getParameter(request, prefix + "inv_scl_stop_plc_nod_cd", ""));
		setN3ptyAmt(JSPUtil.getParameter(request, prefix + "n3pty_amt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setLftgKnt(JSPUtil.getParameter(request, prefix + "lftg_knt", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setInvMgstTpszCd(JSPUtil.getParameter(request, prefix + "inv_mgst_tpsz_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setStoDys(JSPUtil.getParameter(request, prefix + "sto_dys", ""));
		setInvStoDys(JSPUtil.getParameter(request, prefix + "inv_sto_dys", ""));
		setCreOfcCd(JSPUtil.getParameter(request, prefix + "cre_ofc_cd", ""));
		setFneCuzDesc(JSPUtil.getParameter(request, prefix + "fne_cuz_desc", ""));
		setObBkgNo(JSPUtil.getParameter(request, prefix + "ob_bkg_no", ""));
		setInvGrsWgt(JSPUtil.getParameter(request, prefix + "inv_grs_wgt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setInvIncurDt(JSPUtil.getParameter(request, prefix + "inv_incur_dt", ""));
		setInvInspRfPtiCstmsTpCd(JSPUtil.getParameter(request, prefix + "inv_insp_rf_pti_cstms_tp_cd", ""));
		setDryRunRlblPtyTpCd(JSPUtil.getParameter(request, prefix + "dry_run_rlbl_pty_tp_cd", ""));
		setInvOtrRmk(JSPUtil.getParameter(request, prefix + "inv_otr_rmk", ""));
		setSclStopPlcNodCd(JSPUtil.getParameter(request, prefix + "scl_stop_plc_nod_cd", ""));
		setChssMgstTpszCd(JSPUtil.getParameter(request, prefix + "chss_mgst_tpsz_cd", ""));
		setLoclCreDt(JSPUtil.getParameter(request, prefix + "locl_cre_dt", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setN3ptyBilFlg(JSPUtil.getParameter(request, prefix + "n3pty_bil_flg", ""));
		setInvScgAmt(JSPUtil.getParameter(request, prefix + "inv_scg_amt", ""));
		setFumgCostTpCd(JSPUtil.getParameter(request, prefix + "fumg_cost_tp_cd", ""));
		setInvStopLocNodCd(JSPUtil.getParameter(request, prefix + "inv_stop_loc_nod_cd", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setScgAmt(JSPUtil.getParameter(request, prefix + "scg_amt", ""));
		setInvChssNo(JSPUtil.getParameter(request, prefix + "inv_chss_no", ""));
		setInvFneCuzDesc(JSPUtil.getParameter(request, prefix + "inv_fne_cuz_desc", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspScgDtlVO[]
	 */
	public TrsTrspScgDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspScgDtlVO[]
	 */
	public TrsTrspScgDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspScgDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] invLftgKnt = (JSPUtil.getParameter(request, prefix	+ "inv_lftg_knt", length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] inspRfPtiCstmsTpCd = (JSPUtil.getParameter(request, prefix	+ "insp_rf_pti_cstms_tp_cd", length));
			String[] invDryRunRlblPtyTpCd = (JSPUtil.getParameter(request, prefix	+ "inv_dry_run_rlbl_pty_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] n3ptyDesc = (JSPUtil.getParameter(request, prefix	+ "n3pty_desc", length));
			String[] n3ptyOfcCd = (JSPUtil.getParameter(request, prefix	+ "n3pty_ofc_cd", length));
			String[] wtHrs = (JSPUtil.getParameter(request, prefix	+ "wt_hrs", length));
			String[] lftgCuzDesc = (JSPUtil.getParameter(request, prefix	+ "lftg_cuz_desc", length));
			String[] otrRmk = (JSPUtil.getParameter(request, prefix	+ "otr_rmk", length));
			String[] invObBkgNo = (JSPUtil.getParameter(request, prefix	+ "inv_ob_bkg_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] incrtDt = (JSPUtil.getParameter(request, prefix	+ "incrt_dt", length));
			String[] n3ptyVndrSeq = (JSPUtil.getParameter(request, prefix	+ "n3pty_vndr_seq", length));
			String[] invChssMgstTpszCd = (JSPUtil.getParameter(request, prefix	+ "inv_chss_mgst_tpsz_cd", length));
			String[] invWtHrs = (JSPUtil.getParameter(request, prefix	+ "inv_wt_hrs", length));
			String[] invFumgCostTpCd = (JSPUtil.getParameter(request, prefix	+ "inv_fumg_cost_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] hjlNo = (JSPUtil.getParameter(request, prefix	+ "hjl_no", length));
			String[] stopLocNodCd = (JSPUtil.getParameter(request, prefix	+ "stop_loc_nod_cd", length));
			String[] invIncrtDt = (JSPUtil.getParameter(request, prefix	+ "inv_incrt_dt", length));
			String[] invLftgCuzDesc = (JSPUtil.getParameter(request, prefix	+ "inv_lftg_cuz_desc", length));
			String[] incurDt = (JSPUtil.getParameter(request, prefix	+ "incur_dt", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			String[] mgstTpszCd = (JSPUtil.getParameter(request, prefix	+ "mgst_tpsz_cd", length));
			String[] invSclStopPlcNodCd = (JSPUtil.getParameter(request, prefix	+ "inv_scl_stop_plc_nod_cd", length));
			String[] n3ptyAmt = (JSPUtil.getParameter(request, prefix	+ "n3pty_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] lftgKnt = (JSPUtil.getParameter(request, prefix	+ "lftg_knt", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] invMgstTpszCd = (JSPUtil.getParameter(request, prefix	+ "inv_mgst_tpsz_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] stoDys = (JSPUtil.getParameter(request, prefix	+ "sto_dys", length));
			String[] invStoDys = (JSPUtil.getParameter(request, prefix	+ "inv_sto_dys", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] fneCuzDesc = (JSPUtil.getParameter(request, prefix	+ "fne_cuz_desc", length));
			String[] obBkgNo = (JSPUtil.getParameter(request, prefix	+ "ob_bkg_no", length));
			String[] invGrsWgt = (JSPUtil.getParameter(request, prefix	+ "inv_grs_wgt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] invIncurDt = (JSPUtil.getParameter(request, prefix	+ "inv_incur_dt", length));
			String[] invInspRfPtiCstmsTpCd = (JSPUtil.getParameter(request, prefix	+ "inv_insp_rf_pti_cstms_tp_cd", length));
			String[] dryRunRlblPtyTpCd = (JSPUtil.getParameter(request, prefix	+ "dry_run_rlbl_pty_tp_cd", length));
			String[] invOtrRmk = (JSPUtil.getParameter(request, prefix	+ "inv_otr_rmk", length));
			String[] sclStopPlcNodCd = (JSPUtil.getParameter(request, prefix	+ "scl_stop_plc_nod_cd", length));
			String[] chssMgstTpszCd = (JSPUtil.getParameter(request, prefix	+ "chss_mgst_tpsz_cd", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] n3ptyBilFlg = (JSPUtil.getParameter(request, prefix	+ "n3pty_bil_flg", length));
			String[] invScgAmt = (JSPUtil.getParameter(request, prefix	+ "inv_scg_amt", length));
			String[] fumgCostTpCd = (JSPUtil.getParameter(request, prefix	+ "fumg_cost_tp_cd", length));
			String[] invStopLocNodCd = (JSPUtil.getParameter(request, prefix	+ "inv_stop_loc_nod_cd", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] scgAmt = (JSPUtil.getParameter(request, prefix	+ "scg_amt", length));
			String[] invChssNo = (JSPUtil.getParameter(request, prefix	+ "inv_chss_no", length));
			String[] invFneCuzDesc = (JSPUtil.getParameter(request, prefix	+ "inv_fne_cuz_desc", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspScgDtlVO();
				if (invLftgKnt[i] != null)
					model.setInvLftgKnt(invLftgKnt[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (inspRfPtiCstmsTpCd[i] != null)
					model.setInspRfPtiCstmsTpCd(inspRfPtiCstmsTpCd[i]);
				if (invDryRunRlblPtyTpCd[i] != null)
					model.setInvDryRunRlblPtyTpCd(invDryRunRlblPtyTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n3ptyDesc[i] != null)
					model.setN3ptyDesc(n3ptyDesc[i]);
				if (n3ptyOfcCd[i] != null)
					model.setN3ptyOfcCd(n3ptyOfcCd[i]);
				if (wtHrs[i] != null)
					model.setWtHrs(wtHrs[i]);
				if (lftgCuzDesc[i] != null)
					model.setLftgCuzDesc(lftgCuzDesc[i]);
				if (otrRmk[i] != null)
					model.setOtrRmk(otrRmk[i]);
				if (invObBkgNo[i] != null)
					model.setInvObBkgNo(invObBkgNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (incrtDt[i] != null)
					model.setIncrtDt(incrtDt[i]);
				if (n3ptyVndrSeq[i] != null)
					model.setN3ptyVndrSeq(n3ptyVndrSeq[i]);
				if (invChssMgstTpszCd[i] != null)
					model.setInvChssMgstTpszCd(invChssMgstTpszCd[i]);
				if (invWtHrs[i] != null)
					model.setInvWtHrs(invWtHrs[i]);
				if (invFumgCostTpCd[i] != null)
					model.setInvFumgCostTpCd(invFumgCostTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hjlNo[i] != null)
					model.setHjlNo(hjlNo[i]);
				if (stopLocNodCd[i] != null)
					model.setStopLocNodCd(stopLocNodCd[i]);
				if (invIncrtDt[i] != null)
					model.setInvIncrtDt(invIncrtDt[i]);
				if (invLftgCuzDesc[i] != null)
					model.setInvLftgCuzDesc(invLftgCuzDesc[i]);
				if (incurDt[i] != null)
					model.setIncurDt(incurDt[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (mgstTpszCd[i] != null)
					model.setMgstTpszCd(mgstTpszCd[i]);
				if (invSclStopPlcNodCd[i] != null)
					model.setInvSclStopPlcNodCd(invSclStopPlcNodCd[i]);
				if (n3ptyAmt[i] != null)
					model.setN3ptyAmt(n3ptyAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (lftgKnt[i] != null)
					model.setLftgKnt(lftgKnt[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (invMgstTpszCd[i] != null)
					model.setInvMgstTpszCd(invMgstTpszCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (stoDys[i] != null)
					model.setStoDys(stoDys[i]);
				if (invStoDys[i] != null)
					model.setInvStoDys(invStoDys[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (fneCuzDesc[i] != null)
					model.setFneCuzDesc(fneCuzDesc[i]);
				if (obBkgNo[i] != null)
					model.setObBkgNo(obBkgNo[i]);
				if (invGrsWgt[i] != null)
					model.setInvGrsWgt(invGrsWgt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (invIncurDt[i] != null)
					model.setInvIncurDt(invIncurDt[i]);
				if (invInspRfPtiCstmsTpCd[i] != null)
					model.setInvInspRfPtiCstmsTpCd(invInspRfPtiCstmsTpCd[i]);
				if (dryRunRlblPtyTpCd[i] != null)
					model.setDryRunRlblPtyTpCd(dryRunRlblPtyTpCd[i]);
				if (invOtrRmk[i] != null)
					model.setInvOtrRmk(invOtrRmk[i]);
				if (sclStopPlcNodCd[i] != null)
					model.setSclStopPlcNodCd(sclStopPlcNodCd[i]);
				if (chssMgstTpszCd[i] != null)
					model.setChssMgstTpszCd(chssMgstTpszCd[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (n3ptyBilFlg[i] != null)
					model.setN3ptyBilFlg(n3ptyBilFlg[i]);
				if (invScgAmt[i] != null)
					model.setInvScgAmt(invScgAmt[i]);
				if (fumgCostTpCd[i] != null)
					model.setFumgCostTpCd(fumgCostTpCd[i]);
				if (invStopLocNodCd[i] != null)
					model.setInvStopLocNodCd(invStopLocNodCd[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (scgAmt[i] != null)
					model.setScgAmt(scgAmt[i]);
				if (invChssNo[i] != null)
					model.setInvChssNo(invChssNo[i]);
				if (invFneCuzDesc[i] != null)
					model.setInvFneCuzDesc(invFneCuzDesc[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspScgDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspScgDtlVO[]
	 */
	public TrsTrspScgDtlVO[] getTrsTrspScgDtlVOs(){
		TrsTrspScgDtlVO[] vos = (TrsTrspScgDtlVO[])models.toArray(new TrsTrspScgDtlVO[models.size()]);
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
		this.invLftgKnt = this.invLftgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inspRfPtiCstmsTpCd = this.inspRfPtiCstmsTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invDryRunRlblPtyTpCd = this.invDryRunRlblPtyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyDesc = this.n3ptyDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyOfcCd = this.n3ptyOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wtHrs = this.wtHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lftgCuzDesc = this.lftgCuzDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrRmk = this.otrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invObBkgNo = this.invObBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incrtDt = this.incrtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyVndrSeq = this.n3ptyVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invChssMgstTpszCd = this.invChssMgstTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invWtHrs = this.invWtHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invFumgCostTpCd = this.invFumgCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlNo = this.hjlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stopLocNodCd = this.stopLocNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIncrtDt = this.invIncrtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invLftgCuzDesc = this.invLftgCuzDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.incurDt = this.incurDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstTpszCd = this.mgstTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invSclStopPlcNodCd = this.invSclStopPlcNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyAmt = this.n3ptyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lftgKnt = this.lftgKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invMgstTpszCd = this.invMgstTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoDys = this.stoDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStoDys = this.invStoDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fneCuzDesc = this.fneCuzDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obBkgNo = this.obBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invGrsWgt = this.invGrsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invIncurDt = this.invIncurDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invInspRfPtiCstmsTpCd = this.invInspRfPtiCstmsTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dryRunRlblPtyTpCd = this.dryRunRlblPtyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOtrRmk = this.invOtrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sclStopPlcNodCd = this.sclStopPlcNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssMgstTpszCd = this.chssMgstTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3ptyBilFlg = this.n3ptyBilFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invScgAmt = this.invScgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fumgCostTpCd = this.fumgCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invStopLocNodCd = this.invStopLocNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scgAmt = this.scgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invChssNo = this.invChssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invFneCuzDesc = this.invFneCuzDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
