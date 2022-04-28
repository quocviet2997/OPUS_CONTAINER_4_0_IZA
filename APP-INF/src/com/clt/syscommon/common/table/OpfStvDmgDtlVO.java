/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfStvDmgDtlVO.java
*@FileTitle : OpfStvDmgDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.18
*@LastModifier : 장석현
*@LastVersion : 1.0
* 2009.11.18 장석현 
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
 * @author 장석현
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class OpfStvDmgDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfStvDmgDtlVO> models = new ArrayList<OpfStvDmgDtlVO>();
	
	/* Column Info */
	private String stvDmgDocAtchKnt = null;
	/* Column Info */
	private String stvDmgPictAtchFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stvDmgLocDesc = null;
	/* Column Info */
	private String stvDmgDocAtchFlg = null;
	/* Column Info */
	private String stvDmgRespbCd = null;
	/* Column Info */
	private String fmTmLssDt = null;
	/* Column Info */
	private String stvDmgRespbPtyKwnFlg = null;
	/* Column Info */
	private String stvDmgPictAtchKnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrDmgFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String reqSkdVoyNo = null;
	/* Column Info */
	private String reqPortCd = null;
	/* Column Info */
	private String stvDmgRespbDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stvDmgQttnRsnDesc = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String stvDmgRmk = null;
	/* Column Info */
	private String stvDmgReqCateCd = null;
	/* Column Info */
	private String stvDmgRptAtchFlg = null;
	/* Column Info */
	private String stvDmgPrtCateCd = null;
	/* Column Info */
	private String stvDmgQttnCd = null;
	/* Column Info */
	private String stvDmgRptAtchKnt = null;
	/* Column Info */
	private String cgoDmgFlg = null;
	/* Column Info */
	private String toTmLssDt = null;
	/* Column Info */
	private String dmgEmlSndNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String stvDmgTpCd = null;
	/* Column Info */
	private String reqSkdDirCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String reqEtaDt = null;
	/* Column Info */
	private String stvDmgPrtCd = null;
	/* Column Info */
	private String stvDmgNo = null;
	/* Column Info */
	private String reqVslCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfStvDmgDtlVO() {}

	public OpfStvDmgDtlVO(String ibflag, String pagerows, String stvDmgNo, String stvDmgPrtCateCd, String stvDmgPrtCd, String stvDmgTpCd, String stvDmgLocDesc, String stvDmgRptAtchFlg, String stvDmgPictAtchFlg, String stvDmgDocAtchFlg, String cntrDmgFlg, String cgoDmgFlg, String cntrNo, String fmTmLssDt, String toTmLssDt, String stvDmgRmk, String stvDmgReqCateCd, String reqVslCd, String reqSkdVoyNo, String reqSkdDirCd, String reqPortCd, String reqEtaDt, String stvDmgQttnCd, String stvDmgQttnRsnDesc, String stvDmgRespbPtyKwnFlg, String stvDmgRespbCd, String stvDmgRespbDesc, String dmgEmlSndNo, String creUsrId, String creDt, String updUsrId, String updDt, String stvDmgRptAtchKnt, String stvDmgPictAtchKnt, String stvDmgDocAtchKnt) {
		this.stvDmgDocAtchKnt = stvDmgDocAtchKnt;
		this.stvDmgPictAtchFlg = stvDmgPictAtchFlg;
		this.creDt = creDt;
		this.stvDmgLocDesc = stvDmgLocDesc;
		this.stvDmgDocAtchFlg = stvDmgDocAtchFlg;
		this.stvDmgRespbCd = stvDmgRespbCd;
		this.fmTmLssDt = fmTmLssDt;
		this.stvDmgRespbPtyKwnFlg = stvDmgRespbPtyKwnFlg;
		this.stvDmgPictAtchKnt = stvDmgPictAtchKnt;
		this.pagerows = pagerows;
		this.cntrDmgFlg = cntrDmgFlg;
		this.ibflag = ibflag;
		this.reqSkdVoyNo = reqSkdVoyNo;
		this.reqPortCd = reqPortCd;
		this.stvDmgRespbDesc = stvDmgRespbDesc;
		this.updUsrId = updUsrId;
		this.stvDmgQttnRsnDesc = stvDmgQttnRsnDesc;
		this.updDt = updDt;
		this.stvDmgRmk = stvDmgRmk;
		this.stvDmgReqCateCd = stvDmgReqCateCd;
		this.stvDmgRptAtchFlg = stvDmgRptAtchFlg;
		this.stvDmgPrtCateCd = stvDmgPrtCateCd;
		this.stvDmgQttnCd = stvDmgQttnCd;
		this.stvDmgRptAtchKnt = stvDmgRptAtchKnt;
		this.cgoDmgFlg = cgoDmgFlg;
		this.toTmLssDt = toTmLssDt;
		this.dmgEmlSndNo = dmgEmlSndNo;
		this.creUsrId = creUsrId;
		this.stvDmgTpCd = stvDmgTpCd;
		this.reqSkdDirCd = reqSkdDirCd;
		this.cntrNo = cntrNo;
		this.reqEtaDt = reqEtaDt;
		this.stvDmgPrtCd = stvDmgPrtCd;
		this.stvDmgNo = stvDmgNo;
		this.reqVslCd = reqVslCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("stv_dmg_doc_atch_knt", getStvDmgDocAtchKnt());
		this.hashColumns.put("stv_dmg_pict_atch_flg", getStvDmgPictAtchFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stv_dmg_loc_desc", getStvDmgLocDesc());
		this.hashColumns.put("stv_dmg_doc_atch_flg", getStvDmgDocAtchFlg());
		this.hashColumns.put("stv_dmg_respb_cd", getStvDmgRespbCd());
		this.hashColumns.put("fm_tm_lss_dt", getFmTmLssDt());
		this.hashColumns.put("stv_dmg_respb_pty_kwn_flg", getStvDmgRespbPtyKwnFlg());
		this.hashColumns.put("stv_dmg_pict_atch_knt", getStvDmgPictAtchKnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_dmg_flg", getCntrDmgFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("req_skd_voy_no", getReqSkdVoyNo());
		this.hashColumns.put("req_port_cd", getReqPortCd());
		this.hashColumns.put("stv_dmg_respb_desc", getStvDmgRespbDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stv_dmg_qttn_rsn_desc", getStvDmgQttnRsnDesc());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("stv_dmg_rmk", getStvDmgRmk());
		this.hashColumns.put("stv_dmg_req_cate_cd", getStvDmgReqCateCd());
		this.hashColumns.put("stv_dmg_rpt_atch_flg", getStvDmgRptAtchFlg());
		this.hashColumns.put("stv_dmg_prt_cate_cd", getStvDmgPrtCateCd());
		this.hashColumns.put("stv_dmg_qttn_cd", getStvDmgQttnCd());
		this.hashColumns.put("stv_dmg_rpt_atch_knt", getStvDmgRptAtchKnt());
		this.hashColumns.put("cgo_dmg_flg", getCgoDmgFlg());
		this.hashColumns.put("to_tm_lss_dt", getToTmLssDt());
		this.hashColumns.put("dmg_eml_snd_no", getDmgEmlSndNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("stv_dmg_tp_cd", getStvDmgTpCd());
		this.hashColumns.put("req_skd_dir_cd", getReqSkdDirCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("req_eta_dt", getReqEtaDt());
		this.hashColumns.put("stv_dmg_prt_cd", getStvDmgPrtCd());
		this.hashColumns.put("stv_dmg_no", getStvDmgNo());
		this.hashColumns.put("req_vsl_cd", getReqVslCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("stv_dmg_doc_atch_knt", "stvDmgDocAtchKnt");
		this.hashFields.put("stv_dmg_pict_atch_flg", "stvDmgPictAtchFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stv_dmg_loc_desc", "stvDmgLocDesc");
		this.hashFields.put("stv_dmg_doc_atch_flg", "stvDmgDocAtchFlg");
		this.hashFields.put("stv_dmg_respb_cd", "stvDmgRespbCd");
		this.hashFields.put("fm_tm_lss_dt", "fmTmLssDt");
		this.hashFields.put("stv_dmg_respb_pty_kwn_flg", "stvDmgRespbPtyKwnFlg");
		this.hashFields.put("stv_dmg_pict_atch_knt", "stvDmgPictAtchKnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_dmg_flg", "cntrDmgFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("req_skd_voy_no", "reqSkdVoyNo");
		this.hashFields.put("req_port_cd", "reqPortCd");
		this.hashFields.put("stv_dmg_respb_desc", "stvDmgRespbDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stv_dmg_qttn_rsn_desc", "stvDmgQttnRsnDesc");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("stv_dmg_rmk", "stvDmgRmk");
		this.hashFields.put("stv_dmg_req_cate_cd", "stvDmgReqCateCd");
		this.hashFields.put("stv_dmg_rpt_atch_flg", "stvDmgRptAtchFlg");
		this.hashFields.put("stv_dmg_prt_cate_cd", "stvDmgPrtCateCd");
		this.hashFields.put("stv_dmg_qttn_cd", "stvDmgQttnCd");
		this.hashFields.put("stv_dmg_rpt_atch_knt", "stvDmgRptAtchKnt");
		this.hashFields.put("cgo_dmg_flg", "cgoDmgFlg");
		this.hashFields.put("to_tm_lss_dt", "toTmLssDt");
		this.hashFields.put("dmg_eml_snd_no", "dmgEmlSndNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("stv_dmg_tp_cd", "stvDmgTpCd");
		this.hashFields.put("req_skd_dir_cd", "reqSkdDirCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("req_eta_dt", "reqEtaDt");
		this.hashFields.put("stv_dmg_prt_cd", "stvDmgPrtCd");
		this.hashFields.put("stv_dmg_no", "stvDmgNo");
		this.hashFields.put("req_vsl_cd", "reqVslCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return stvDmgDocAtchKnt
	 */
	public String getStvDmgDocAtchKnt() {
		return this.stvDmgDocAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return stvDmgPictAtchFlg
	 */
	public String getStvDmgPictAtchFlg() {
		return this.stvDmgPictAtchFlg;
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
	 * @return stvDmgLocDesc
	 */
	public String getStvDmgLocDesc() {
		return this.stvDmgLocDesc;
	}
	
	/**
	 * Column Info
	 * @return stvDmgDocAtchFlg
	 */
	public String getStvDmgDocAtchFlg() {
		return this.stvDmgDocAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRespbCd
	 */
	public String getStvDmgRespbCd() {
		return this.stvDmgRespbCd;
	}
	
	/**
	 * Column Info
	 * @return fmTmLssDt
	 */
	public String getFmTmLssDt() {
		return this.fmTmLssDt;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRespbPtyKwnFlg
	 */
	public String getStvDmgRespbPtyKwnFlg() {
		return this.stvDmgRespbPtyKwnFlg;
	}
	
	/**
	 * Column Info
	 * @return stvDmgPictAtchKnt
	 */
	public String getStvDmgPictAtchKnt() {
		return this.stvDmgPictAtchKnt;
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
	 * @return cntrDmgFlg
	 */
	public String getCntrDmgFlg() {
		return this.cntrDmgFlg;
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
	 * @return reqSkdVoyNo
	 */
	public String getReqSkdVoyNo() {
		return this.reqSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return reqPortCd
	 */
	public String getReqPortCd() {
		return this.reqPortCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRespbDesc
	 */
	public String getStvDmgRespbDesc() {
		return this.stvDmgRespbDesc;
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
	 * @return stvDmgQttnRsnDesc
	 */
	public String getStvDmgQttnRsnDesc() {
		return this.stvDmgQttnRsnDesc;
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
	 * @return stvDmgRmk
	 */
	public String getStvDmgRmk() {
		return this.stvDmgRmk;
	}
	
	/**
	 * Column Info
	 * @return stvDmgReqCateCd
	 */
	public String getStvDmgReqCateCd() {
		return this.stvDmgReqCateCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRptAtchFlg
	 */
	public String getStvDmgRptAtchFlg() {
		return this.stvDmgRptAtchFlg;
	}
	
	/**
	 * Column Info
	 * @return stvDmgPrtCateCd
	 */
	public String getStvDmgPrtCateCd() {
		return this.stvDmgPrtCateCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgQttnCd
	 */
	public String getStvDmgQttnCd() {
		return this.stvDmgQttnCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRptAtchKnt
	 */
	public String getStvDmgRptAtchKnt() {
		return this.stvDmgRptAtchKnt;
	}
	
	/**
	 * Column Info
	 * @return cgoDmgFlg
	 */
	public String getCgoDmgFlg() {
		return this.cgoDmgFlg;
	}
	
	/**
	 * Column Info
	 * @return toTmLssDt
	 */
	public String getToTmLssDt() {
		return this.toTmLssDt;
	}
	
	/**
	 * Column Info
	 * @return dmgEmlSndNo
	 */
	public String getDmgEmlSndNo() {
		return this.dmgEmlSndNo;
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
	 * @return stvDmgTpCd
	 */
	public String getStvDmgTpCd() {
		return this.stvDmgTpCd;
	}
	
	/**
	 * Column Info
	 * @return reqSkdDirCd
	 */
	public String getReqSkdDirCd() {
		return this.reqSkdDirCd;
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
	 * @return reqEtaDt
	 */
	public String getReqEtaDt() {
		return this.reqEtaDt;
	}
	
	/**
	 * Column Info
	 * @return stvDmgPrtCd
	 */
	public String getStvDmgPrtCd() {
		return this.stvDmgPrtCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgNo
	 */
	public String getStvDmgNo() {
		return this.stvDmgNo;
	}
	
	/**
	 * Column Info
	 * @return reqVslCd
	 */
	public String getReqVslCd() {
		return this.reqVslCd;
	}
	

	/**
	 * Column Info
	 * @param stvDmgDocAtchKnt
	 */
	public void setStvDmgDocAtchKnt(String stvDmgDocAtchKnt) {
		this.stvDmgDocAtchKnt = stvDmgDocAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param stvDmgPictAtchFlg
	 */
	public void setStvDmgPictAtchFlg(String stvDmgPictAtchFlg) {
		this.stvDmgPictAtchFlg = stvDmgPictAtchFlg;
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
	 * @param stvDmgLocDesc
	 */
	public void setStvDmgLocDesc(String stvDmgLocDesc) {
		this.stvDmgLocDesc = stvDmgLocDesc;
	}
	
	/**
	 * Column Info
	 * @param stvDmgDocAtchFlg
	 */
	public void setStvDmgDocAtchFlg(String stvDmgDocAtchFlg) {
		this.stvDmgDocAtchFlg = stvDmgDocAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRespbCd
	 */
	public void setStvDmgRespbCd(String stvDmgRespbCd) {
		this.stvDmgRespbCd = stvDmgRespbCd;
	}
	
	/**
	 * Column Info
	 * @param fmTmLssDt
	 */
	public void setFmTmLssDt(String fmTmLssDt) {
		this.fmTmLssDt = fmTmLssDt;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRespbPtyKwnFlg
	 */
	public void setStvDmgRespbPtyKwnFlg(String stvDmgRespbPtyKwnFlg) {
		this.stvDmgRespbPtyKwnFlg = stvDmgRespbPtyKwnFlg;
	}
	
	/**
	 * Column Info
	 * @param stvDmgPictAtchKnt
	 */
	public void setStvDmgPictAtchKnt(String stvDmgPictAtchKnt) {
		this.stvDmgPictAtchKnt = stvDmgPictAtchKnt;
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
	 * @param cntrDmgFlg
	 */
	public void setCntrDmgFlg(String cntrDmgFlg) {
		this.cntrDmgFlg = cntrDmgFlg;
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
	 * @param reqSkdVoyNo
	 */
	public void setReqSkdVoyNo(String reqSkdVoyNo) {
		this.reqSkdVoyNo = reqSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param reqPortCd
	 */
	public void setReqPortCd(String reqPortCd) {
		this.reqPortCd = reqPortCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRespbDesc
	 */
	public void setStvDmgRespbDesc(String stvDmgRespbDesc) {
		this.stvDmgRespbDesc = stvDmgRespbDesc;
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
	 * @param stvDmgQttnRsnDesc
	 */
	public void setStvDmgQttnRsnDesc(String stvDmgQttnRsnDesc) {
		this.stvDmgQttnRsnDesc = stvDmgQttnRsnDesc;
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
	 * @param stvDmgRmk
	 */
	public void setStvDmgRmk(String stvDmgRmk) {
		this.stvDmgRmk = stvDmgRmk;
	}
	
	/**
	 * Column Info
	 * @param stvDmgReqCateCd
	 */
	public void setStvDmgReqCateCd(String stvDmgReqCateCd) {
		this.stvDmgReqCateCd = stvDmgReqCateCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRptAtchFlg
	 */
	public void setStvDmgRptAtchFlg(String stvDmgRptAtchFlg) {
		this.stvDmgRptAtchFlg = stvDmgRptAtchFlg;
	}
	
	/**
	 * Column Info
	 * @param stvDmgPrtCateCd
	 */
	public void setStvDmgPrtCateCd(String stvDmgPrtCateCd) {
		this.stvDmgPrtCateCd = stvDmgPrtCateCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgQttnCd
	 */
	public void setStvDmgQttnCd(String stvDmgQttnCd) {
		this.stvDmgQttnCd = stvDmgQttnCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRptAtchKnt
	 */
	public void setStvDmgRptAtchKnt(String stvDmgRptAtchKnt) {
		this.stvDmgRptAtchKnt = stvDmgRptAtchKnt;
	}
	
	/**
	 * Column Info
	 * @param cgoDmgFlg
	 */
	public void setCgoDmgFlg(String cgoDmgFlg) {
		this.cgoDmgFlg = cgoDmgFlg;
	}
	
	/**
	 * Column Info
	 * @param toTmLssDt
	 */
	public void setToTmLssDt(String toTmLssDt) {
		this.toTmLssDt = toTmLssDt;
	}
	
	/**
	 * Column Info
	 * @param dmgEmlSndNo
	 */
	public void setDmgEmlSndNo(String dmgEmlSndNo) {
		this.dmgEmlSndNo = dmgEmlSndNo;
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
	 * @param stvDmgTpCd
	 */
	public void setStvDmgTpCd(String stvDmgTpCd) {
		this.stvDmgTpCd = stvDmgTpCd;
	}
	
	/**
	 * Column Info
	 * @param reqSkdDirCd
	 */
	public void setReqSkdDirCd(String reqSkdDirCd) {
		this.reqSkdDirCd = reqSkdDirCd;
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
	 * @param reqEtaDt
	 */
	public void setReqEtaDt(String reqEtaDt) {
		this.reqEtaDt = reqEtaDt;
	}
	
	/**
	 * Column Info
	 * @param stvDmgPrtCd
	 */
	public void setStvDmgPrtCd(String stvDmgPrtCd) {
		this.stvDmgPrtCd = stvDmgPrtCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgNo
	 */
	public void setStvDmgNo(String stvDmgNo) {
		this.stvDmgNo = stvDmgNo;
	}
	
	/**
	 * Column Info
	 * @param reqVslCd
	 */
	public void setReqVslCd(String reqVslCd) {
		this.reqVslCd = reqVslCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setStvDmgDocAtchKnt(JSPUtil.getParameter(request, "stv_dmg_doc_atch_knt", ""));
		setStvDmgPictAtchFlg(JSPUtil.getParameter(request, "stv_dmg_pict_atch_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStvDmgLocDesc(JSPUtil.getParameter(request, "stv_dmg_loc_desc", ""));
		setStvDmgDocAtchFlg(JSPUtil.getParameter(request, "stv_dmg_doc_atch_flg", ""));
		setStvDmgRespbCd(JSPUtil.getParameter(request, "stv_dmg_respb_cd", ""));
		setFmTmLssDt(JSPUtil.getParameter(request, "fm_tm_lss_dt", ""));
		setStvDmgRespbPtyKwnFlg(JSPUtil.getParameter(request, "stv_dmg_respb_pty_kwn_flg", ""));
		setStvDmgPictAtchKnt(JSPUtil.getParameter(request, "stv_dmg_pict_atch_knt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrDmgFlg(JSPUtil.getParameter(request, "cntr_dmg_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setReqSkdVoyNo(JSPUtil.getParameter(request, "req_skd_voy_no", ""));
		setReqPortCd(JSPUtil.getParameter(request, "req_port_cd", ""));
		setStvDmgRespbDesc(JSPUtil.getParameter(request, "stv_dmg_respb_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStvDmgQttnRsnDesc(JSPUtil.getParameter(request, "stv_dmg_qttn_rsn_desc", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setStvDmgRmk(JSPUtil.getParameter(request, "stv_dmg_rmk", ""));
		setStvDmgReqCateCd(JSPUtil.getParameter(request, "stv_dmg_req_cate_cd", ""));
		setStvDmgRptAtchFlg(JSPUtil.getParameter(request, "stv_dmg_rpt_atch_flg", ""));
		setStvDmgPrtCateCd(JSPUtil.getParameter(request, "stv_dmg_prt_cate_cd", ""));
		setStvDmgQttnCd(JSPUtil.getParameter(request, "stv_dmg_qttn_cd", ""));
		setStvDmgRptAtchKnt(JSPUtil.getParameter(request, "stv_dmg_rpt_atch_knt", ""));
		setCgoDmgFlg(JSPUtil.getParameter(request, "cgo_dmg_flg", ""));
		setToTmLssDt(JSPUtil.getParameter(request, "to_tm_lss_dt", ""));
		setDmgEmlSndNo(JSPUtil.getParameter(request, "dmg_eml_snd_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setStvDmgTpCd(JSPUtil.getParameter(request, "stv_dmg_tp_cd", ""));
		setReqSkdDirCd(JSPUtil.getParameter(request, "req_skd_dir_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setReqEtaDt(JSPUtil.getParameter(request, "req_eta_dt", ""));
		setStvDmgPrtCd(JSPUtil.getParameter(request, "stv_dmg_prt_cd", ""));
		setStvDmgNo(JSPUtil.getParameter(request, "stv_dmg_no", ""));
		setReqVslCd(JSPUtil.getParameter(request, "req_vsl_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfStvDmgDtlVO[]
	 */
	public OpfStvDmgDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfStvDmgDtlVO[]
	 */
	public OpfStvDmgDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfStvDmgDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] stvDmgDocAtchKnt = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_doc_atch_knt", length));
			String[] stvDmgPictAtchFlg = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_pict_atch_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stvDmgLocDesc = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_loc_desc", length));
			String[] stvDmgDocAtchFlg = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_doc_atch_flg", length));
			String[] stvDmgRespbCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_respb_cd", length));
			String[] fmTmLssDt = (JSPUtil.getParameter(request, prefix	+ "fm_tm_lss_dt", length));
			String[] stvDmgRespbPtyKwnFlg = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_respb_pty_kwn_flg", length));
			String[] stvDmgPictAtchKnt = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_pict_atch_knt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cntrDmgFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_dmg_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] reqSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "req_skd_voy_no", length));
			String[] reqPortCd = (JSPUtil.getParameter(request, prefix	+ "req_port_cd", length));
			String[] stvDmgRespbDesc = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_respb_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stvDmgQttnRsnDesc = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_qttn_rsn_desc", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] stvDmgRmk = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_rmk", length));
			String[] stvDmgReqCateCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_req_cate_cd", length));
			String[] stvDmgRptAtchFlg = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_rpt_atch_flg", length));
			String[] stvDmgPrtCateCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_prt_cate_cd", length));
			String[] stvDmgQttnCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_qttn_cd", length));
			String[] stvDmgRptAtchKnt = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_rpt_atch_knt", length));
			String[] cgoDmgFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_dmg_flg", length));
			String[] toTmLssDt = (JSPUtil.getParameter(request, prefix	+ "to_tm_lss_dt", length));
			String[] dmgEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "dmg_eml_snd_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] stvDmgTpCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_tp_cd", length));
			String[] reqSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "req_skd_dir_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] reqEtaDt = (JSPUtil.getParameter(request, prefix	+ "req_eta_dt", length));
			String[] stvDmgPrtCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_prt_cd", length));
			String[] stvDmgNo = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_no", length));
			String[] reqVslCd = (JSPUtil.getParameter(request, prefix	+ "req_vsl_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfStvDmgDtlVO();
				if (stvDmgDocAtchKnt[i] != null)
					model.setStvDmgDocAtchKnt(stvDmgDocAtchKnt[i]);
				if (stvDmgPictAtchFlg[i] != null)
					model.setStvDmgPictAtchFlg(stvDmgPictAtchFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stvDmgLocDesc[i] != null)
					model.setStvDmgLocDesc(stvDmgLocDesc[i]);
				if (stvDmgDocAtchFlg[i] != null)
					model.setStvDmgDocAtchFlg(stvDmgDocAtchFlg[i]);
				if (stvDmgRespbCd[i] != null)
					model.setStvDmgRespbCd(stvDmgRespbCd[i]);
				if (fmTmLssDt[i] != null)
					model.setFmTmLssDt(fmTmLssDt[i]);
				if (stvDmgRespbPtyKwnFlg[i] != null)
					model.setStvDmgRespbPtyKwnFlg(stvDmgRespbPtyKwnFlg[i]);
				if (stvDmgPictAtchKnt[i] != null)
					model.setStvDmgPictAtchKnt(stvDmgPictAtchKnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrDmgFlg[i] != null)
					model.setCntrDmgFlg(cntrDmgFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (reqSkdVoyNo[i] != null)
					model.setReqSkdVoyNo(reqSkdVoyNo[i]);
				if (reqPortCd[i] != null)
					model.setReqPortCd(reqPortCd[i]);
				if (stvDmgRespbDesc[i] != null)
					model.setStvDmgRespbDesc(stvDmgRespbDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stvDmgQttnRsnDesc[i] != null)
					model.setStvDmgQttnRsnDesc(stvDmgQttnRsnDesc[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (stvDmgRmk[i] != null)
					model.setStvDmgRmk(stvDmgRmk[i]);
				if (stvDmgReqCateCd[i] != null)
					model.setStvDmgReqCateCd(stvDmgReqCateCd[i]);
				if (stvDmgRptAtchFlg[i] != null)
					model.setStvDmgRptAtchFlg(stvDmgRptAtchFlg[i]);
				if (stvDmgPrtCateCd[i] != null)
					model.setStvDmgPrtCateCd(stvDmgPrtCateCd[i]);
				if (stvDmgQttnCd[i] != null)
					model.setStvDmgQttnCd(stvDmgQttnCd[i]);
				if (stvDmgRptAtchKnt[i] != null)
					model.setStvDmgRptAtchKnt(stvDmgRptAtchKnt[i]);
				if (cgoDmgFlg[i] != null)
					model.setCgoDmgFlg(cgoDmgFlg[i]);
				if (toTmLssDt[i] != null)
					model.setToTmLssDt(toTmLssDt[i]);
				if (dmgEmlSndNo[i] != null)
					model.setDmgEmlSndNo(dmgEmlSndNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (stvDmgTpCd[i] != null)
					model.setStvDmgTpCd(stvDmgTpCd[i]);
				if (reqSkdDirCd[i] != null)
					model.setReqSkdDirCd(reqSkdDirCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (reqEtaDt[i] != null)
					model.setReqEtaDt(reqEtaDt[i]);
				if (stvDmgPrtCd[i] != null)
					model.setStvDmgPrtCd(stvDmgPrtCd[i]);
				if (stvDmgNo[i] != null)
					model.setStvDmgNo(stvDmgNo[i]);
				if (reqVslCd[i] != null)
					model.setReqVslCd(reqVslCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfStvDmgDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfStvDmgDtlVO[]
	 */
	public OpfStvDmgDtlVO[] getOpfStvDmgDtlVOs(){
		OpfStvDmgDtlVO[] vos = (OpfStvDmgDtlVO[])models.toArray(new OpfStvDmgDtlVO[models.size()]);
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
		this.stvDmgDocAtchKnt = this.stvDmgDocAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgPictAtchFlg = this.stvDmgPictAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgLocDesc = this.stvDmgLocDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgDocAtchFlg = this.stvDmgDocAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRespbCd = this.stvDmgRespbCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTmLssDt = this.fmTmLssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRespbPtyKwnFlg = this.stvDmgRespbPtyKwnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgPictAtchKnt = this.stvDmgPictAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDmgFlg = this.cntrDmgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.reqSkdVoyNo = this.reqSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.reqPortCd = this.reqPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRespbDesc = this.stvDmgRespbDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgQttnRsnDesc = this.stvDmgQttnRsnDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRmk = this.stvDmgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgReqCateCd = this.stvDmgReqCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRptAtchFlg = this.stvDmgRptAtchFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgPrtCateCd = this.stvDmgPrtCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgQttnCd = this.stvDmgQttnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRptAtchKnt = this.stvDmgRptAtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoDmgFlg = this.cgoDmgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTmLssDt = this.toTmLssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmgEmlSndNo = this.dmgEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgTpCd = this.stvDmgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.reqSkdDirCd = this.reqSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.reqEtaDt = this.reqEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgPrtCd = this.stvDmgPrtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgNo = this.stvDmgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.reqVslCd = this.reqVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
