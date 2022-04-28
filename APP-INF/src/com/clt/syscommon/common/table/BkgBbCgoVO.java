/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgBbCgoVO.java
*@FileTitle : BkgBbCgoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.19
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2009.06.19 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgBbCgoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgBbCgoVO> models = new ArrayList<BkgBbCgoVO>();
	
	/* Column Info */
	private String rqstUsrId = null;
	/* Column Info */
	private String slngPntFlg = null;
	/* Column Info */
	private String scrDngCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bbDcgoSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String spclCgoAproCd = null;
	/* Column Info */
	private String dimWdt = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String dimLen = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String stwgInstrDesc = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String gravCtrDesc = null;
	/* Column Info */
	private String cgoWgt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String pckDtlDesc = null;
	/* Column Info */
	private String cgoLodgMzdCd = null;
	/* Column Info */
	private String netWgt = null;
	/* Column Info */
	private String dimHgt = null;
	/* Column Info */
	private String bbCntrPrnFlg = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String spclRqstDesc = null;
	/* Column Info */
	private String bbCgoSeq = null;
	/* Column Info */
	private String grsWgt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgBbCgoVO() {}

	public BkgBbCgoVO(String ibflag, String pagerows, String bkgNo, String bbCgoSeq, String rcvTermCd, String deTermCd, String pckQty, String pckTpCd, String grsWgt, String netWgt, String wgtUtCd, String dimLen, String dimWdt, String dimHgt, String cgoWgt, String stwgInstrDesc, String bbDcgoSeq, String cmdtCd, String slngPntFlg, String gravCtrDesc, String pckDtlDesc, String cgoLodgMzdCd, String scrDngCtnt, String spclRqstDesc, String bbCntrPrnFlg, String diffRmk, String rqstDt, String rqstUsrId, String spclCgoAproCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.rqstUsrId = rqstUsrId;
		this.slngPntFlg = slngPntFlg;
		this.scrDngCtnt = scrDngCtnt;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.bbDcgoSeq = bbDcgoSeq;
		this.ibflag = ibflag;
		this.spclCgoAproCd = spclCgoAproCd;
		this.dimWdt = dimWdt;
		this.cmdtCd = cmdtCd;
		this.dimLen = dimLen;
		this.wgtUtCd = wgtUtCd;
		this.pckQty = pckQty;
		this.stwgInstrDesc = stwgInstrDesc;
		this.rcvTermCd = rcvTermCd;
		this.pckTpCd = pckTpCd;
		this.updUsrId = updUsrId;
		this.gravCtrDesc = gravCtrDesc;
		this.cgoWgt = cgoWgt;
		this.updDt = updDt;
		this.rqstDt = rqstDt;
		this.pckDtlDesc = pckDtlDesc;
		this.cgoLodgMzdCd = cgoLodgMzdCd;
		this.netWgt = netWgt;
		this.dimHgt = dimHgt;
		this.bbCntrPrnFlg = bbCntrPrnFlg;
		this.deTermCd = deTermCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.diffRmk = diffRmk;
		this.spclRqstDesc = spclRqstDesc;
		this.bbCgoSeq = bbCgoSeq;
		this.grsWgt = grsWgt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rqst_usr_id", getRqstUsrId());
		this.hashColumns.put("slng_pnt_flg", getSlngPntFlg());
		this.hashColumns.put("scr_dng_ctnt", getScrDngCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bb_dcgo_seq", getBbDcgoSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("spcl_cgo_apro_cd", getSpclCgoAproCd());
		this.hashColumns.put("dim_wdt", getDimWdt());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("dim_len", getDimLen());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("stwg_instr_desc", getStwgInstrDesc());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("grav_ctr_desc", getGravCtrDesc());
		this.hashColumns.put("cgo_wgt", getCgoWgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("pck_dtl_desc", getPckDtlDesc());
		this.hashColumns.put("cgo_lodg_mzd_cd", getCgoLodgMzdCd());
		this.hashColumns.put("net_wgt", getNetWgt());
		this.hashColumns.put("dim_hgt", getDimHgt());
		this.hashColumns.put("bb_cntr_prn_flg", getBbCntrPrnFlg());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("spcl_rqst_desc", getSpclRqstDesc());
		this.hashColumns.put("bb_cgo_seq", getBbCgoSeq());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rqst_usr_id", "rqstUsrId");
		this.hashFields.put("slng_pnt_flg", "slngPntFlg");
		this.hashFields.put("scr_dng_ctnt", "scrDngCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bb_dcgo_seq", "bbDcgoSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("spcl_cgo_apro_cd", "spclCgoAproCd");
		this.hashFields.put("dim_wdt", "dimWdt");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("dim_len", "dimLen");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("stwg_instr_desc", "stwgInstrDesc");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("grav_ctr_desc", "gravCtrDesc");
		this.hashFields.put("cgo_wgt", "cgoWgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("pck_dtl_desc", "pckDtlDesc");
		this.hashFields.put("cgo_lodg_mzd_cd", "cgoLodgMzdCd");
		this.hashFields.put("net_wgt", "netWgt");
		this.hashFields.put("dim_hgt", "dimHgt");
		this.hashFields.put("bb_cntr_prn_flg", "bbCntrPrnFlg");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("spcl_rqst_desc", "spclRqstDesc");
		this.hashFields.put("bb_cgo_seq", "bbCgoSeq");
		this.hashFields.put("grs_wgt", "grsWgt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rqstUsrId
	 */
	public String getRqstUsrId() {
		return this.rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @return slngPntFlg
	 */
	public String getSlngPntFlg() {
		return this.slngPntFlg;
	}
	
	/**
	 * Column Info
	 * @return scrDngCtnt
	 */
	public String getScrDngCtnt() {
		return this.scrDngCtnt;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return bbDcgoSeq
	 */
	public String getBbDcgoSeq() {
		return this.bbDcgoSeq;
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
	 * @return spclCgoAproCd
	 */
	public String getSpclCgoAproCd() {
		return this.spclCgoAproCd;
	}
	
	/**
	 * Column Info
	 * @return dimWdt
	 */
	public String getDimWdt() {
		return this.dimWdt;
	}
	
	/**
	 * Column Info
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	
	/**
	 * Column Info
	 * @return dimLen
	 */
	public String getDimLen() {
		return this.dimLen;
	}
	
	/**
	 * Column Info
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return pckQty
	 */
	public String getPckQty() {
		return this.pckQty;
	}
	
	/**
	 * Column Info
	 * @return stwgInstrDesc
	 */
	public String getStwgInstrDesc() {
		return this.stwgInstrDesc;
	}
	
	/**
	 * Column Info
	 * @return rcvTermCd
	 */
	public String getRcvTermCd() {
		return this.rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
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
	 * @return gravCtrDesc
	 */
	public String getGravCtrDesc() {
		return this.gravCtrDesc;
	}
	
	/**
	 * Column Info
	 * @return cgoWgt
	 */
	public String getCgoWgt() {
		return this.cgoWgt;
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
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
	}
	
	/**
	 * Column Info
	 * @return pckDtlDesc
	 */
	public String getPckDtlDesc() {
		return this.pckDtlDesc;
	}
	
	/**
	 * Column Info
	 * @return cgoLodgMzdCd
	 */
	public String getCgoLodgMzdCd() {
		return this.cgoLodgMzdCd;
	}
	
	/**
	 * Column Info
	 * @return netWgt
	 */
	public String getNetWgt() {
		return this.netWgt;
	}
	
	/**
	 * Column Info
	 * @return dimHgt
	 */
	public String getDimHgt() {
		return this.dimHgt;
	}
	
	/**
	 * Column Info
	 * @return bbCntrPrnFlg
	 */
	public String getBbCntrPrnFlg() {
		return this.bbCntrPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return spclRqstDesc
	 */
	public String getSpclRqstDesc() {
		return this.spclRqstDesc;
	}
	
	/**
	 * Column Info
	 * @return bbCgoSeq
	 */
	public String getBbCgoSeq() {
		return this.bbCgoSeq;
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
	 * @param rqstUsrId
	 */
	public void setRqstUsrId(String rqstUsrId) {
		this.rqstUsrId = rqstUsrId;
	}
	
	/**
	 * Column Info
	 * @param slngPntFlg
	 */
	public void setSlngPntFlg(String slngPntFlg) {
		this.slngPntFlg = slngPntFlg;
	}
	
	/**
	 * Column Info
	 * @param scrDngCtnt
	 */
	public void setScrDngCtnt(String scrDngCtnt) {
		this.scrDngCtnt = scrDngCtnt;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param bbDcgoSeq
	 */
	public void setBbDcgoSeq(String bbDcgoSeq) {
		this.bbDcgoSeq = bbDcgoSeq;
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
	 * @param spclCgoAproCd
	 */
	public void setSpclCgoAproCd(String spclCgoAproCd) {
		this.spclCgoAproCd = spclCgoAproCd;
	}
	
	/**
	 * Column Info
	 * @param dimWdt
	 */
	public void setDimWdt(String dimWdt) {
		this.dimWdt = dimWdt;
	}
	
	/**
	 * Column Info
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
	}
	
	/**
	 * Column Info
	 * @param dimLen
	 */
	public void setDimLen(String dimLen) {
		this.dimLen = dimLen;
	}
	
	/**
	 * Column Info
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param pckQty
	 */
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
	}
	
	/**
	 * Column Info
	 * @param stwgInstrDesc
	 */
	public void setStwgInstrDesc(String stwgInstrDesc) {
		this.stwgInstrDesc = stwgInstrDesc;
	}
	
	/**
	 * Column Info
	 * @param rcvTermCd
	 */
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
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
	 * @param gravCtrDesc
	 */
	public void setGravCtrDesc(String gravCtrDesc) {
		this.gravCtrDesc = gravCtrDesc;
	}
	
	/**
	 * Column Info
	 * @param cgoWgt
	 */
	public void setCgoWgt(String cgoWgt) {
		this.cgoWgt = cgoWgt;
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
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
	}
	
	/**
	 * Column Info
	 * @param pckDtlDesc
	 */
	public void setPckDtlDesc(String pckDtlDesc) {
		this.pckDtlDesc = pckDtlDesc;
	}
	
	/**
	 * Column Info
	 * @param cgoLodgMzdCd
	 */
	public void setCgoLodgMzdCd(String cgoLodgMzdCd) {
		this.cgoLodgMzdCd = cgoLodgMzdCd;
	}
	
	/**
	 * Column Info
	 * @param netWgt
	 */
	public void setNetWgt(String netWgt) {
		this.netWgt = netWgt;
	}
	
	/**
	 * Column Info
	 * @param dimHgt
	 */
	public void setDimHgt(String dimHgt) {
		this.dimHgt = dimHgt;
	}
	
	/**
	 * Column Info
	 * @param bbCntrPrnFlg
	 */
	public void setBbCntrPrnFlg(String bbCntrPrnFlg) {
		this.bbCntrPrnFlg = bbCntrPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param spclRqstDesc
	 */
	public void setSpclRqstDesc(String spclRqstDesc) {
		this.spclRqstDesc = spclRqstDesc;
	}
	
	/**
	 * Column Info
	 * @param bbCgoSeq
	 */
	public void setBbCgoSeq(String bbCgoSeq) {
		this.bbCgoSeq = bbCgoSeq;
	}
	
	/**
	 * Column Info
	 * @param grsWgt
	 */
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRqstUsrId(JSPUtil.getParameter(request, "rqst_usr_id", ""));
		setSlngPntFlg(JSPUtil.getParameter(request, "slng_pnt_flg", ""));
		setScrDngCtnt(JSPUtil.getParameter(request, "scr_dng_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBbDcgoSeq(JSPUtil.getParameter(request, "bb_dcgo_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSpclCgoAproCd(JSPUtil.getParameter(request, "spcl_cgo_apro_cd", ""));
		setDimWdt(JSPUtil.getParameter(request, "dim_wdt", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setDimLen(JSPUtil.getParameter(request, "dim_len", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setStwgInstrDesc(JSPUtil.getParameter(request, "stwg_instr_desc", ""));
		setRcvTermCd(JSPUtil.getParameter(request, "rcv_term_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setGravCtrDesc(JSPUtil.getParameter(request, "grav_ctr_desc", ""));
		setCgoWgt(JSPUtil.getParameter(request, "cgo_wgt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRqstDt(JSPUtil.getParameter(request, "rqst_dt", ""));
		setPckDtlDesc(JSPUtil.getParameter(request, "pck_dtl_desc", ""));
		setCgoLodgMzdCd(JSPUtil.getParameter(request, "cgo_lodg_mzd_cd", ""));
		setNetWgt(JSPUtil.getParameter(request, "net_wgt", ""));
		setDimHgt(JSPUtil.getParameter(request, "dim_hgt", ""));
		setBbCntrPrnFlg(JSPUtil.getParameter(request, "bb_cntr_prn_flg", ""));
		setDeTermCd(JSPUtil.getParameter(request, "de_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setSpclRqstDesc(JSPUtil.getParameter(request, "spcl_rqst_desc", ""));
		setBbCgoSeq(JSPUtil.getParameter(request, "bb_cgo_seq", ""));
		setGrsWgt(JSPUtil.getParameter(request, "grs_wgt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgBbCgoVO[]
	 */
	public BkgBbCgoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgBbCgoVO[]
	 */
	public BkgBbCgoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgBbCgoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rqstUsrId = (JSPUtil.getParameter(request, prefix	+ "rqst_usr_id", length));
			String[] slngPntFlg = (JSPUtil.getParameter(request, prefix	+ "slng_pnt_flg", length));
			String[] scrDngCtnt = (JSPUtil.getParameter(request, prefix	+ "scr_dng_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bbDcgoSeq = (JSPUtil.getParameter(request, prefix	+ "bb_dcgo_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] spclCgoAproCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_apro_cd", length));
			String[] dimWdt = (JSPUtil.getParameter(request, prefix	+ "dim_wdt", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] dimLen = (JSPUtil.getParameter(request, prefix	+ "dim_len", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] stwgInstrDesc = (JSPUtil.getParameter(request, prefix	+ "stwg_instr_desc", length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] gravCtrDesc = (JSPUtil.getParameter(request, prefix	+ "grav_ctr_desc", length));
			String[] cgoWgt = (JSPUtil.getParameter(request, prefix	+ "cgo_wgt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt", length));
			String[] pckDtlDesc = (JSPUtil.getParameter(request, prefix	+ "pck_dtl_desc", length));
			String[] cgoLodgMzdCd = (JSPUtil.getParameter(request, prefix	+ "cgo_lodg_mzd_cd", length));
			String[] netWgt = (JSPUtil.getParameter(request, prefix	+ "net_wgt", length));
			String[] dimHgt = (JSPUtil.getParameter(request, prefix	+ "dim_hgt", length));
			String[] bbCntrPrnFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cntr_prn_flg", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] spclRqstDesc = (JSPUtil.getParameter(request, prefix	+ "spcl_rqst_desc", length));
			String[] bbCgoSeq = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_seq", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgBbCgoVO();
				if (rqstUsrId[i] != null)
					model.setRqstUsrId(rqstUsrId[i]);
				if (slngPntFlg[i] != null)
					model.setSlngPntFlg(slngPntFlg[i]);
				if (scrDngCtnt[i] != null)
					model.setScrDngCtnt(scrDngCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bbDcgoSeq[i] != null)
					model.setBbDcgoSeq(bbDcgoSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (spclCgoAproCd[i] != null)
					model.setSpclCgoAproCd(spclCgoAproCd[i]);
				if (dimWdt[i] != null)
					model.setDimWdt(dimWdt[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (dimLen[i] != null)
					model.setDimLen(dimLen[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (stwgInstrDesc[i] != null)
					model.setStwgInstrDesc(stwgInstrDesc[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (gravCtrDesc[i] != null)
					model.setGravCtrDesc(gravCtrDesc[i]);
				if (cgoWgt[i] != null)
					model.setCgoWgt(cgoWgt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (pckDtlDesc[i] != null)
					model.setPckDtlDesc(pckDtlDesc[i]);
				if (cgoLodgMzdCd[i] != null)
					model.setCgoLodgMzdCd(cgoLodgMzdCd[i]);
				if (netWgt[i] != null)
					model.setNetWgt(netWgt[i]);
				if (dimHgt[i] != null)
					model.setDimHgt(dimHgt[i]);
				if (bbCntrPrnFlg[i] != null)
					model.setBbCntrPrnFlg(bbCntrPrnFlg[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (spclRqstDesc[i] != null)
					model.setSpclRqstDesc(spclRqstDesc[i]);
				if (bbCgoSeq[i] != null)
					model.setBbCgoSeq(bbCgoSeq[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgBbCgoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgBbCgoVO[]
	 */
	public BkgBbCgoVO[] getBkgBbCgoVOs(){
		BkgBbCgoVO[] vos = (BkgBbCgoVO[])models.toArray(new BkgBbCgoVO[models.size()]);
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
		this.rqstUsrId = this.rqstUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slngPntFlg = this.slngPntFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scrDngCtnt = this.scrDngCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbDcgoSeq = this.bbDcgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoAproCd = this.spclCgoAproCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dimWdt = this.dimWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dimLen = this.dimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stwgInstrDesc = this.stwgInstrDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gravCtrDesc = this.gravCtrDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoWgt = this.cgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckDtlDesc = this.pckDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoLodgMzdCd = this.cgoLodgMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWgt = this.netWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dimHgt = this.dimHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCntrPrnFlg = this.bbCntrPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclRqstDesc = this.spclRqstDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoSeq = this.bbCgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
