/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MdmActivityVO.java
*@FileTitle : MdmActivityVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 김인수
*@LastVersion : 1.0
* 2010.07.05 김인수 
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
 * @author 김인수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmActivityVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmActivityVO> models = new ArrayList<MdmActivityVO>();
	
	/* Column Info */
	private String bzcVisFlg = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiIfId = null;
	/* Column Info */
	private String actDesc = null;
	/* Column Info */
	private String actStsMapgCd = null;
	/* Column Info */
	private String trspModCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String updAvalFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String actFlg = null;
	/* Column Info */
	private String actNm = null;
	/* Column Info */
	private String vndrEvTolHrs = null;
	/* Column Info */
	private String vndrEvSvcCateCd = null;
	/* Column Info */
	private String actStndEdiStsCd = null;
	/* Column Info */
	private String bndVskdSeqCd = null;
	/* Column Info */
	private String copSkdLgcNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String actCd = null;
	/* Column Info */
	private String orgDestCd = null;
	/* Column Info */
	private String actRcvTpCd = null;
	/* Column Info */
	private String custVisFlg = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String actTpCd = null;
	/* Column Info */
	private String copSkdLgcTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String actOpTpCd = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String estmStndEdiStsCd = null;
	/* Column Info */
	private String nodTpCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmActivityVO() {}

	public MdmActivityVO(String ibflag, String pagerows, String actCd, String actNm, String actDesc, String actTpCd, String fullMtyCd, String bndVskdSeqCd, String nodTpCd, String actOpTpCd, String trspModCd, String orgDestCd, String actFlg, String actStsMapgCd, String actStndEdiStsCd, String estmStndEdiStsCd, String bzcVisFlg, String custVisFlg, String actRcvTpCd, String copSkdLgcNo, String copSkdLgcTpCd, String updAvalFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String eaiEvntDt, String vndrEvTolHrs, String vndrEvSvcCateCd, String eaiIfId) {
		this.bzcVisFlg = bzcVisFlg;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.eaiIfId = eaiIfId;
		this.actDesc = actDesc;
		this.actStsMapgCd = actStsMapgCd;
		this.trspModCd = trspModCd;
		this.pagerows = pagerows;
		this.updAvalFlg = updAvalFlg;
		this.ibflag = ibflag;
		this.actFlg = actFlg;
		this.actNm = actNm;
		this.vndrEvTolHrs = vndrEvTolHrs;
		this.vndrEvSvcCateCd = vndrEvSvcCateCd;
		this.actStndEdiStsCd = actStndEdiStsCd;
		this.bndVskdSeqCd = bndVskdSeqCd;
		this.copSkdLgcNo = copSkdLgcNo;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.actCd = actCd;
		this.orgDestCd = orgDestCd;
		this.actRcvTpCd = actRcvTpCd;
		this.custVisFlg = custVisFlg;
		this.eaiEvntDt = eaiEvntDt;
		this.actTpCd = actTpCd;
		this.copSkdLgcTpCd = copSkdLgcTpCd;
		this.creUsrId = creUsrId;
		this.actOpTpCd = actOpTpCd;
		this.fullMtyCd = fullMtyCd;
		this.estmStndEdiStsCd = estmStndEdiStsCd;
		this.nodTpCd = nodTpCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bzc_vis_flg", getBzcVisFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		this.hashColumns.put("act_desc", getActDesc());
		this.hashColumns.put("act_sts_mapg_cd", getActStsMapgCd());
		this.hashColumns.put("trsp_mod_cd", getTrspModCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("upd_aval_flg", getUpdAvalFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("act_flg", getActFlg());
		this.hashColumns.put("act_nm", getActNm());
		this.hashColumns.put("vndr_ev_tol_hrs", getVndrEvTolHrs());
		this.hashColumns.put("vndr_ev_svc_cate_cd", getVndrEvSvcCateCd());
		this.hashColumns.put("act_stnd_edi_sts_cd", getActStndEdiStsCd());
		this.hashColumns.put("bnd_vskd_seq_cd", getBndVskdSeqCd());
		this.hashColumns.put("cop_skd_lgc_no", getCopSkdLgcNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("act_cd", getActCd());
		this.hashColumns.put("org_dest_cd", getOrgDestCd());
		this.hashColumns.put("act_rcv_tp_cd", getActRcvTpCd());
		this.hashColumns.put("cust_vis_flg", getCustVisFlg());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("act_tp_cd", getActTpCd());
		this.hashColumns.put("cop_skd_lgc_tp_cd", getCopSkdLgcTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("act_op_tp_cd", getActOpTpCd());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("estm_stnd_edi_sts_cd", getEstmStndEdiStsCd());
		this.hashColumns.put("nod_tp_cd", getNodTpCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bzc_vis_flg", "bzcVisFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_if_id", "eaiIfId");
		this.hashFields.put("act_desc", "actDesc");
		this.hashFields.put("act_sts_mapg_cd", "actStsMapgCd");
		this.hashFields.put("trsp_mod_cd", "trspModCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("upd_aval_flg", "updAvalFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("act_flg", "actFlg");
		this.hashFields.put("act_nm", "actNm");
		this.hashFields.put("vndr_ev_tol_hrs", "vndrEvTolHrs");
		this.hashFields.put("vndr_ev_svc_cate_cd", "vndrEvSvcCateCd");
		this.hashFields.put("act_stnd_edi_sts_cd", "actStndEdiStsCd");
		this.hashFields.put("bnd_vskd_seq_cd", "bndVskdSeqCd");
		this.hashFields.put("cop_skd_lgc_no", "copSkdLgcNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("act_cd", "actCd");
		this.hashFields.put("org_dest_cd", "orgDestCd");
		this.hashFields.put("act_rcv_tp_cd", "actRcvTpCd");
		this.hashFields.put("cust_vis_flg", "custVisFlg");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("act_tp_cd", "actTpCd");
		this.hashFields.put("cop_skd_lgc_tp_cd", "copSkdLgcTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("act_op_tp_cd", "actOpTpCd");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("estm_stnd_edi_sts_cd", "estmStndEdiStsCd");
		this.hashFields.put("nod_tp_cd", "nodTpCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return bzcVisFlg
	 */
	public String getBzcVisFlg() {
		return this.bzcVisFlg;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	
	/**
	 * Column Info
	 * @return actDesc
	 */
	public String getActDesc() {
		return this.actDesc;
	}
	
	/**
	 * Column Info
	 * @return actStsMapgCd
	 */
	public String getActStsMapgCd() {
		return this.actStsMapgCd;
	}
	
	/**
	 * Column Info
	 * @return trspModCd
	 */
	public String getTrspModCd() {
		return this.trspModCd;
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
	 * @return updAvalFlg
	 */
	public String getUpdAvalFlg() {
		return this.updAvalFlg;
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
	 * @return actFlg
	 */
	public String getActFlg() {
		return this.actFlg;
	}
	
	/**
	 * Column Info
	 * @return actNm
	 */
	public String getActNm() {
		return this.actNm;
	}
	
	/**
	 * Column Info
	 * @return vndrEvTolHrs
	 */
	public String getVndrEvTolHrs() {
		return this.vndrEvTolHrs;
	}
	
	/**
	 * Column Info
	 * @return vndrEvSvcCateCd
	 */
	public String getVndrEvSvcCateCd() {
		return this.vndrEvSvcCateCd;
	}
	
	/**
	 * Column Info
	 * @return actStndEdiStsCd
	 */
	public String getActStndEdiStsCd() {
		return this.actStndEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @return bndVskdSeqCd
	 */
	public String getBndVskdSeqCd() {
		return this.bndVskdSeqCd;
	}
	
	/**
	 * Column Info
	 * @return copSkdLgcNo
	 */
	public String getCopSkdLgcNo() {
		return this.copSkdLgcNo;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return actCd
	 */
	public String getActCd() {
		return this.actCd;
	}
	
	/**
	 * Column Info
	 * @return orgDestCd
	 */
	public String getOrgDestCd() {
		return this.orgDestCd;
	}
	
	/**
	 * Column Info
	 * @return actRcvTpCd
	 */
	public String getActRcvTpCd() {
		return this.actRcvTpCd;
	}
	
	/**
	 * Column Info
	 * @return custVisFlg
	 */
	public String getCustVisFlg() {
		return this.custVisFlg;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return actTpCd
	 */
	public String getActTpCd() {
		return this.actTpCd;
	}
	
	/**
	 * Column Info
	 * @return copSkdLgcTpCd
	 */
	public String getCopSkdLgcTpCd() {
		return this.copSkdLgcTpCd;
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
	 * @return actOpTpCd
	 */
	public String getActOpTpCd() {
		return this.actOpTpCd;
	}
	
	/**
	 * Column Info
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return estmStndEdiStsCd
	 */
	public String getEstmStndEdiStsCd() {
		return this.estmStndEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @return nodTpCd
	 */
	public String getNodTpCd() {
		return this.nodTpCd;
	}
	

	/**
	 * Column Info
	 * @param bzcVisFlg
	 */
	public void setBzcVisFlg(String bzcVisFlg) {
		this.bzcVisFlg = bzcVisFlg;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Column Info
	 * @param actDesc
	 */
	public void setActDesc(String actDesc) {
		this.actDesc = actDesc;
	}
	
	/**
	 * Column Info
	 * @param actStsMapgCd
	 */
	public void setActStsMapgCd(String actStsMapgCd) {
		this.actStsMapgCd = actStsMapgCd;
	}
	
	/**
	 * Column Info
	 * @param trspModCd
	 */
	public void setTrspModCd(String trspModCd) {
		this.trspModCd = trspModCd;
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
	 * @param updAvalFlg
	 */
	public void setUpdAvalFlg(String updAvalFlg) {
		this.updAvalFlg = updAvalFlg;
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
	 * @param actFlg
	 */
	public void setActFlg(String actFlg) {
		this.actFlg = actFlg;
	}
	
	/**
	 * Column Info
	 * @param actNm
	 */
	public void setActNm(String actNm) {
		this.actNm = actNm;
	}
	
	/**
	 * Column Info
	 * @param vndrEvTolHrs
	 */
	public void setVndrEvTolHrs(String vndrEvTolHrs) {
		this.vndrEvTolHrs = vndrEvTolHrs;
	}
	
	/**
	 * Column Info
	 * @param vndrEvSvcCateCd
	 */
	public void setVndrEvSvcCateCd(String vndrEvSvcCateCd) {
		this.vndrEvSvcCateCd = vndrEvSvcCateCd;
	}
	
	/**
	 * Column Info
	 * @param actStndEdiStsCd
	 */
	public void setActStndEdiStsCd(String actStndEdiStsCd) {
		this.actStndEdiStsCd = actStndEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @param bndVskdSeqCd
	 */
	public void setBndVskdSeqCd(String bndVskdSeqCd) {
		this.bndVskdSeqCd = bndVskdSeqCd;
	}
	
	/**
	 * Column Info
	 * @param copSkdLgcNo
	 */
	public void setCopSkdLgcNo(String copSkdLgcNo) {
		this.copSkdLgcNo = copSkdLgcNo;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param actCd
	 */
	public void setActCd(String actCd) {
		this.actCd = actCd;
	}
	
	/**
	 * Column Info
	 * @param orgDestCd
	 */
	public void setOrgDestCd(String orgDestCd) {
		this.orgDestCd = orgDestCd;
	}
	
	/**
	 * Column Info
	 * @param actRcvTpCd
	 */
	public void setActRcvTpCd(String actRcvTpCd) {
		this.actRcvTpCd = actRcvTpCd;
	}
	
	/**
	 * Column Info
	 * @param custVisFlg
	 */
	public void setCustVisFlg(String custVisFlg) {
		this.custVisFlg = custVisFlg;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param actTpCd
	 */
	public void setActTpCd(String actTpCd) {
		this.actTpCd = actTpCd;
	}
	
	/**
	 * Column Info
	 * @param copSkdLgcTpCd
	 */
	public void setCopSkdLgcTpCd(String copSkdLgcTpCd) {
		this.copSkdLgcTpCd = copSkdLgcTpCd;
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
	 * @param actOpTpCd
	 */
	public void setActOpTpCd(String actOpTpCd) {
		this.actOpTpCd = actOpTpCd;
	}
	
	/**
	 * Column Info
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param estmStndEdiStsCd
	 */
	public void setEstmStndEdiStsCd(String estmStndEdiStsCd) {
		this.estmStndEdiStsCd = estmStndEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @param nodTpCd
	 */
	public void setNodTpCd(String nodTpCd) {
		this.nodTpCd = nodTpCd;
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
		setBzcVisFlg(JSPUtil.getParameter(request, prefix + "bzc_vis_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEaiIfId(JSPUtil.getParameter(request, prefix + "eai_if_id", ""));
		setActDesc(JSPUtil.getParameter(request, prefix + "act_desc", ""));
		setActStsMapgCd(JSPUtil.getParameter(request, prefix + "act_sts_mapg_cd", ""));
		setTrspModCd(JSPUtil.getParameter(request, prefix + "trsp_mod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setUpdAvalFlg(JSPUtil.getParameter(request, prefix + "upd_aval_flg", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setActFlg(JSPUtil.getParameter(request, prefix + "act_flg", ""));
		setActNm(JSPUtil.getParameter(request, prefix + "act_nm", ""));
		setVndrEvTolHrs(JSPUtil.getParameter(request, prefix + "vndr_ev_tol_hrs", ""));
		setVndrEvSvcCateCd(JSPUtil.getParameter(request, prefix + "vndr_ev_svc_cate_cd", ""));
		setActStndEdiStsCd(JSPUtil.getParameter(request, prefix + "act_stnd_edi_sts_cd", ""));
		setBndVskdSeqCd(JSPUtil.getParameter(request, prefix + "bnd_vskd_seq_cd", ""));
		setCopSkdLgcNo(JSPUtil.getParameter(request, prefix + "cop_skd_lgc_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setActCd(JSPUtil.getParameter(request, prefix + "act_cd", ""));
		setOrgDestCd(JSPUtil.getParameter(request, prefix + "org_dest_cd", ""));
		setActRcvTpCd(JSPUtil.getParameter(request, prefix + "act_rcv_tp_cd", ""));
		setCustVisFlg(JSPUtil.getParameter(request, prefix + "cust_vis_flg", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, prefix + "eai_evnt_dt", ""));
		setActTpCd(JSPUtil.getParameter(request, prefix + "act_tp_cd", ""));
		setCopSkdLgcTpCd(JSPUtil.getParameter(request, prefix + "cop_skd_lgc_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setActOpTpCd(JSPUtil.getParameter(request, prefix + "act_op_tp_cd", ""));
		setFullMtyCd(JSPUtil.getParameter(request, prefix + "full_mty_cd", ""));
		setEstmStndEdiStsCd(JSPUtil.getParameter(request, prefix + "estm_stnd_edi_sts_cd", ""));
		setNodTpCd(JSPUtil.getParameter(request, prefix + "nod_tp_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmActivityVO[]
	 */
	public MdmActivityVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmActivityVO[]
	 */
	public MdmActivityVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmActivityVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bzcVisFlg = (JSPUtil.getParameter(request, prefix	+ "bzc_vis_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] eaiIfId = (JSPUtil.getParameter(request, prefix	+ "eai_if_id", length));
			String[] actDesc = (JSPUtil.getParameter(request, prefix	+ "act_desc", length));
			String[] actStsMapgCd = (JSPUtil.getParameter(request, prefix	+ "act_sts_mapg_cd", length));
			String[] trspModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_mod_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] updAvalFlg = (JSPUtil.getParameter(request, prefix	+ "upd_aval_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] actFlg = (JSPUtil.getParameter(request, prefix	+ "act_flg", length));
			String[] actNm = (JSPUtil.getParameter(request, prefix	+ "act_nm", length));
			String[] vndrEvTolHrs = (JSPUtil.getParameter(request, prefix	+ "vndr_ev_tol_hrs", length));
			String[] vndrEvSvcCateCd = (JSPUtil.getParameter(request, prefix	+ "vndr_ev_svc_cate_cd", length));
			String[] actStndEdiStsCd = (JSPUtil.getParameter(request, prefix	+ "act_stnd_edi_sts_cd", length));
			String[] bndVskdSeqCd = (JSPUtil.getParameter(request, prefix	+ "bnd_vskd_seq_cd", length));
			String[] copSkdLgcNo = (JSPUtil.getParameter(request, prefix	+ "cop_skd_lgc_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] actCd = (JSPUtil.getParameter(request, prefix	+ "act_cd", length));
			String[] orgDestCd = (JSPUtil.getParameter(request, prefix	+ "org_dest_cd", length));
			String[] actRcvTpCd = (JSPUtil.getParameter(request, prefix	+ "act_rcv_tp_cd", length));
			String[] custVisFlg = (JSPUtil.getParameter(request, prefix	+ "cust_vis_flg", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] actTpCd = (JSPUtil.getParameter(request, prefix	+ "act_tp_cd", length));
			String[] copSkdLgcTpCd = (JSPUtil.getParameter(request, prefix	+ "cop_skd_lgc_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] actOpTpCd = (JSPUtil.getParameter(request, prefix	+ "act_op_tp_cd", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] estmStndEdiStsCd = (JSPUtil.getParameter(request, prefix	+ "estm_stnd_edi_sts_cd", length));
			String[] nodTpCd = (JSPUtil.getParameter(request, prefix	+ "nod_tp_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmActivityVO();
				if (bzcVisFlg[i] != null)
					model.setBzcVisFlg(bzcVisFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				if (actDesc[i] != null)
					model.setActDesc(actDesc[i]);
				if (actStsMapgCd[i] != null)
					model.setActStsMapgCd(actStsMapgCd[i]);
				if (trspModCd[i] != null)
					model.setTrspModCd(trspModCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (updAvalFlg[i] != null)
					model.setUpdAvalFlg(updAvalFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (actFlg[i] != null)
					model.setActFlg(actFlg[i]);
				if (actNm[i] != null)
					model.setActNm(actNm[i]);
				if (vndrEvTolHrs[i] != null)
					model.setVndrEvTolHrs(vndrEvTolHrs[i]);
				if (vndrEvSvcCateCd[i] != null)
					model.setVndrEvSvcCateCd(vndrEvSvcCateCd[i]);
				if (actStndEdiStsCd[i] != null)
					model.setActStndEdiStsCd(actStndEdiStsCd[i]);
				if (bndVskdSeqCd[i] != null)
					model.setBndVskdSeqCd(bndVskdSeqCd[i]);
				if (copSkdLgcNo[i] != null)
					model.setCopSkdLgcNo(copSkdLgcNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (actCd[i] != null)
					model.setActCd(actCd[i]);
				if (orgDestCd[i] != null)
					model.setOrgDestCd(orgDestCd[i]);
				if (actRcvTpCd[i] != null)
					model.setActRcvTpCd(actRcvTpCd[i]);
				if (custVisFlg[i] != null)
					model.setCustVisFlg(custVisFlg[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (actTpCd[i] != null)
					model.setActTpCd(actTpCd[i]);
				if (copSkdLgcTpCd[i] != null)
					model.setCopSkdLgcTpCd(copSkdLgcTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (actOpTpCd[i] != null)
					model.setActOpTpCd(actOpTpCd[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (estmStndEdiStsCd[i] != null)
					model.setEstmStndEdiStsCd(estmStndEdiStsCd[i]);
				if (nodTpCd[i] != null)
					model.setNodTpCd(nodTpCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmActivityVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmActivityVO[]
	 */
	public MdmActivityVO[] getMdmActivityVOs(){
		MdmActivityVO[] vos = (MdmActivityVO[])models.toArray(new MdmActivityVO[models.size()]);
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
		this.bzcVisFlg = this.bzcVisFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actDesc = this.actDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actStsMapgCd = this.actStsMapgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModCd = this.trspModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updAvalFlg = this.updAvalFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actFlg = this.actFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actNm = this.actNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrEvTolHrs = this.vndrEvTolHrs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrEvSvcCateCd = this.vndrEvSvcCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actStndEdiStsCd = this.actStndEdiStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bndVskdSeqCd = this.bndVskdSeqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copSkdLgcNo = this.copSkdLgcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCd = this.actCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgDestCd = this.orgDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actRcvTpCd = this.actRcvTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custVisFlg = this.custVisFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actTpCd = this.actTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copSkdLgcTpCd = this.copSkdLgcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actOpTpCd = this.actOpTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmStndEdiStsCd = this.estmStndEdiStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodTpCd = this.nodTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
