/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesIrrHdrVO.java
*@FileTitle : TesIrrHdrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.20
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.11.20 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesIrrHdrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesIrrHdrVO> models = new ArrayList<TesIrrHdrVO>();
	
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String irrCxlWoFlg = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String irrPrvtRmk = null;
	/* Column Info */
	private String irrTtlAmt = null;
	/* Column Info */
	private String bkgStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String irrLateDisFlg = null;
	/* Column Info */
	private String irrStfErrFlg = null;
	/* Column Info */
	private String irrLackOfFlwFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String gnteNo = null;
	/* Column Info */
	private String irrOtrFlg = null;
	/* Column Info */
	private String opCostSptgIcrzFlg = null;
	/* Column Info */
	private String irrNo = null;
	/* Column Info */
	private String gnteTpCd = null;
	/* Column Info */
	private String opCostMnrFlg = null;
	/* Column Info */
	private String opCostTriAxlFlg = null;
	/* Column Info */
	private String opCostOcpFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String opCostTnkOrdFlg = null;
	/* Column Info */
	private String opCostXtraFtFlg = null;
	/* Column Info */
	private String irrEqShtgFlg = null;
	/* Column Info */
	private String opCostOtrTmlChssFlg = null;
	/* Column Info */
	private String irrRsnRmk = null;
	/* Column Info */
	private String opCostTeamTrkgFlg = null;
	/* Column Info */
	private String irrTpCd = null;
	/* Column Info */
	private String irrSysErrFlg = null;
	/* Column Info */
	private String irrChssShtgFlg = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String respbPtyNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesIrrHdrVO() {}

	public TesIrrHdrVO(String ibflag, String pagerows, String irrNo, String gnteNo, String ofcCd, String gnteTpCd, String currCd, String irrTpCd, String bkgStsCd, String irrRsnRmk, String irrPrvtRmk, String irrTtlAmt, String irrStfErrFlg, String irrSysErrFlg, String irrChssShtgFlg, String irrOtrFlg, String irrLateDisFlg, String irrLackOfFlwFlg, String irrCxlWoFlg, String irrEqShtgFlg, String opCostOcpFlg, String opCostTnkOrdFlg, String opCostTeamTrkgFlg, String opCostXtraFtFlg, String opCostSptgIcrzFlg, String opCostOtrTmlChssFlg, String opCostMnrFlg, String opCostTriAxlFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String respbPtyNm) {
		this.currCd = currCd;
		this.irrCxlWoFlg = irrCxlWoFlg;
		this.deltFlg = deltFlg;
		this.irrPrvtRmk = irrPrvtRmk;
		this.irrTtlAmt = irrTtlAmt;
		this.bkgStsCd = bkgStsCd;
		this.creDt = creDt;
		this.irrLateDisFlg = irrLateDisFlg;
		this.irrStfErrFlg = irrStfErrFlg;
		this.irrLackOfFlwFlg = irrLackOfFlwFlg;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.gnteNo = gnteNo;
		this.irrOtrFlg = irrOtrFlg;
		this.opCostSptgIcrzFlg = opCostSptgIcrzFlg;
		this.irrNo = irrNo;
		this.gnteTpCd = gnteTpCd;
		this.opCostMnrFlg = opCostMnrFlg;
		this.opCostTriAxlFlg = opCostTriAxlFlg;
		this.opCostOcpFlg = opCostOcpFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.opCostTnkOrdFlg = opCostTnkOrdFlg;
		this.opCostXtraFtFlg = opCostXtraFtFlg;
		this.irrEqShtgFlg = irrEqShtgFlg;
		this.opCostOtrTmlChssFlg = opCostOtrTmlChssFlg;
		this.irrRsnRmk = irrRsnRmk;
		this.opCostTeamTrkgFlg = opCostTeamTrkgFlg;
		this.irrTpCd = irrTpCd;
		this.irrSysErrFlg = irrSysErrFlg;
		this.irrChssShtgFlg = irrChssShtgFlg;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.respbPtyNm = respbPtyNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("irr_cxl_wo_flg", getIrrCxlWoFlg());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("irr_prvt_rmk", getIrrPrvtRmk());
		this.hashColumns.put("irr_ttl_amt", getIrrTtlAmt());
		this.hashColumns.put("bkg_sts_cd", getBkgStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("irr_late_dis_flg", getIrrLateDisFlg());
		this.hashColumns.put("irr_stf_err_flg", getIrrStfErrFlg());
		this.hashColumns.put("irr_lack_of_flw_flg", getIrrLackOfFlwFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("gnte_no", getGnteNo());
		this.hashColumns.put("irr_otr_flg", getIrrOtrFlg());
		this.hashColumns.put("op_cost_sptg_icrz_flg", getOpCostSptgIcrzFlg());
		this.hashColumns.put("irr_no", getIrrNo());
		this.hashColumns.put("gnte_tp_cd", getGnteTpCd());
		this.hashColumns.put("op_cost_mnr_flg", getOpCostMnrFlg());
		this.hashColumns.put("op_cost_tri_axl_flg", getOpCostTriAxlFlg());
		this.hashColumns.put("op_cost_ocp_flg", getOpCostOcpFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("op_cost_tnk_ord_flg", getOpCostTnkOrdFlg());
		this.hashColumns.put("op_cost_xtra_ft_flg", getOpCostXtraFtFlg());
		this.hashColumns.put("irr_eq_shtg_flg", getIrrEqShtgFlg());
		this.hashColumns.put("op_cost_otr_tml_chss_flg", getOpCostOtrTmlChssFlg());
		this.hashColumns.put("irr_rsn_rmk", getIrrRsnRmk());
		this.hashColumns.put("op_cost_team_trkg_flg", getOpCostTeamTrkgFlg());
		this.hashColumns.put("irr_tp_cd", getIrrTpCd());
		this.hashColumns.put("irr_sys_err_flg", getIrrSysErrFlg());
		this.hashColumns.put("irr_chss_shtg_flg", getIrrChssShtgFlg());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("respb_pty_nm", getRespbPtyNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("irr_cxl_wo_flg", "irrCxlWoFlg");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("irr_prvt_rmk", "irrPrvtRmk");
		this.hashFields.put("irr_ttl_amt", "irrTtlAmt");
		this.hashFields.put("bkg_sts_cd", "bkgStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("irr_late_dis_flg", "irrLateDisFlg");
		this.hashFields.put("irr_stf_err_flg", "irrStfErrFlg");
		this.hashFields.put("irr_lack_of_flw_flg", "irrLackOfFlwFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("gnte_no", "gnteNo");
		this.hashFields.put("irr_otr_flg", "irrOtrFlg");
		this.hashFields.put("op_cost_sptg_icrz_flg", "opCostSptgIcrzFlg");
		this.hashFields.put("irr_no", "irrNo");
		this.hashFields.put("gnte_tp_cd", "gnteTpCd");
		this.hashFields.put("op_cost_mnr_flg", "opCostMnrFlg");
		this.hashFields.put("op_cost_tri_axl_flg", "opCostTriAxlFlg");
		this.hashFields.put("op_cost_ocp_flg", "opCostOcpFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("op_cost_tnk_ord_flg", "opCostTnkOrdFlg");
		this.hashFields.put("op_cost_xtra_ft_flg", "opCostXtraFtFlg");
		this.hashFields.put("irr_eq_shtg_flg", "irrEqShtgFlg");
		this.hashFields.put("op_cost_otr_tml_chss_flg", "opCostOtrTmlChssFlg");
		this.hashFields.put("irr_rsn_rmk", "irrRsnRmk");
		this.hashFields.put("op_cost_team_trkg_flg", "opCostTeamTrkgFlg");
		this.hashFields.put("irr_tp_cd", "irrTpCd");
		this.hashFields.put("irr_sys_err_flg", "irrSysErrFlg");
		this.hashFields.put("irr_chss_shtg_flg", "irrChssShtgFlg");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("respb_pty_nm", "respbPtyNm");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return irrCxlWoFlg
	 */
	public String getIrrCxlWoFlg() {
		return this.irrCxlWoFlg;
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
	 * @return irrPrvtRmk
	 */
	public String getIrrPrvtRmk() {
		return this.irrPrvtRmk;
	}
	
	/**
	 * Column Info
	 * @return irrTtlAmt
	 */
	public String getIrrTtlAmt() {
		return this.irrTtlAmt;
	}
	
	/**
	 * Column Info
	 * @return bkgStsCd
	 */
	public String getBkgStsCd() {
		return this.bkgStsCd;
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
	 * @return irrLateDisFlg
	 */
	public String getIrrLateDisFlg() {
		return this.irrLateDisFlg;
	}
	
	/**
	 * Column Info
	 * @return irrStfErrFlg
	 */
	public String getIrrStfErrFlg() {
		return this.irrStfErrFlg;
	}
	
	/**
	 * Column Info
	 * @return irrLackOfFlwFlg
	 */
	public String getIrrLackOfFlwFlg() {
		return this.irrLackOfFlwFlg;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return gnteNo
	 */
	public String getGnteNo() {
		return this.gnteNo;
	}
	
	/**
	 * Column Info
	 * @return irrOtrFlg
	 */
	public String getIrrOtrFlg() {
		return this.irrOtrFlg;
	}
	
	/**
	 * Column Info
	 * @return opCostSptgIcrzFlg
	 */
	public String getOpCostSptgIcrzFlg() {
		return this.opCostSptgIcrzFlg;
	}
	
	/**
	 * Column Info
	 * @return irrNo
	 */
	public String getIrrNo() {
		return this.irrNo;
	}
	
	/**
	 * Column Info
	 * @return gnteTpCd
	 */
	public String getGnteTpCd() {
		return this.gnteTpCd;
	}
	
	/**
	 * Column Info
	 * @return opCostMnrFlg
	 */
	public String getOpCostMnrFlg() {
		return this.opCostMnrFlg;
	}
	
	/**
	 * Column Info
	 * @return opCostTriAxlFlg
	 */
	public String getOpCostTriAxlFlg() {
		return this.opCostTriAxlFlg;
	}
	
	/**
	 * Column Info
	 * @return opCostOcpFlg
	 */
	public String getOpCostOcpFlg() {
		return this.opCostOcpFlg;
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
	 * @return opCostTnkOrdFlg
	 */
	public String getOpCostTnkOrdFlg() {
		return this.opCostTnkOrdFlg;
	}
	
	/**
	 * Column Info
	 * @return opCostXtraFtFlg
	 */
	public String getOpCostXtraFtFlg() {
		return this.opCostXtraFtFlg;
	}
	
	/**
	 * Column Info
	 * @return irrEqShtgFlg
	 */
	public String getIrrEqShtgFlg() {
		return this.irrEqShtgFlg;
	}
	
	/**
	 * Column Info
	 * @return opCostOtrTmlChssFlg
	 */
	public String getOpCostOtrTmlChssFlg() {
		return this.opCostOtrTmlChssFlg;
	}
	
	/**
	 * Column Info
	 * @return irrRsnRmk
	 */
	public String getIrrRsnRmk() {
		return this.irrRsnRmk;
	}
	
	/**
	 * Column Info
	 * @return opCostTeamTrkgFlg
	 */
	public String getOpCostTeamTrkgFlg() {
		return this.opCostTeamTrkgFlg;
	}
	
	/**
	 * Column Info
	 * @return irrTpCd
	 */
	public String getIrrTpCd() {
		return this.irrTpCd;
	}
	
	/**
	 * Column Info
	 * @return irrSysErrFlg
	 */
	public String getIrrSysErrFlg() {
		return this.irrSysErrFlg;
	}
	
	/**
	 * Column Info
	 * @return irrChssShtgFlg
	 */
	public String getIrrChssShtgFlg() {
		return this.irrChssShtgFlg;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return respbPtyNm
	 */
	public String getRespbPtyNm() {
		return this.respbPtyNm;
	}
	

	/**
	 * Column Info
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param irrCxlWoFlg
	 */
	public void setIrrCxlWoFlg(String irrCxlWoFlg) {
		this.irrCxlWoFlg = irrCxlWoFlg;
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
	 * @param irrPrvtRmk
	 */
	public void setIrrPrvtRmk(String irrPrvtRmk) {
		this.irrPrvtRmk = irrPrvtRmk;
	}
	
	/**
	 * Column Info
	 * @param irrTtlAmt
	 */
	public void setIrrTtlAmt(String irrTtlAmt) {
		this.irrTtlAmt = irrTtlAmt;
	}
	
	/**
	 * Column Info
	 * @param bkgStsCd
	 */
	public void setBkgStsCd(String bkgStsCd) {
		this.bkgStsCd = bkgStsCd;
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
	 * @param irrLateDisFlg
	 */
	public void setIrrLateDisFlg(String irrLateDisFlg) {
		this.irrLateDisFlg = irrLateDisFlg;
	}
	
	/**
	 * Column Info
	 * @param irrStfErrFlg
	 */
	public void setIrrStfErrFlg(String irrStfErrFlg) {
		this.irrStfErrFlg = irrStfErrFlg;
	}
	
	/**
	 * Column Info
	 * @param irrLackOfFlwFlg
	 */
	public void setIrrLackOfFlwFlg(String irrLackOfFlwFlg) {
		this.irrLackOfFlwFlg = irrLackOfFlwFlg;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param gnteNo
	 */
	public void setGnteNo(String gnteNo) {
		this.gnteNo = gnteNo;
	}
	
	/**
	 * Column Info
	 * @param irrOtrFlg
	 */
	public void setIrrOtrFlg(String irrOtrFlg) {
		this.irrOtrFlg = irrOtrFlg;
	}
	
	/**
	 * Column Info
	 * @param opCostSptgIcrzFlg
	 */
	public void setOpCostSptgIcrzFlg(String opCostSptgIcrzFlg) {
		this.opCostSptgIcrzFlg = opCostSptgIcrzFlg;
	}
	
	/**
	 * Column Info
	 * @param irrNo
	 */
	public void setIrrNo(String irrNo) {
		this.irrNo = irrNo;
	}
	
	/**
	 * Column Info
	 * @param gnteTpCd
	 */
	public void setGnteTpCd(String gnteTpCd) {
		this.gnteTpCd = gnteTpCd;
	}
	
	/**
	 * Column Info
	 * @param opCostMnrFlg
	 */
	public void setOpCostMnrFlg(String opCostMnrFlg) {
		this.opCostMnrFlg = opCostMnrFlg;
	}
	
	/**
	 * Column Info
	 * @param opCostTriAxlFlg
	 */
	public void setOpCostTriAxlFlg(String opCostTriAxlFlg) {
		this.opCostTriAxlFlg = opCostTriAxlFlg;
	}
	
	/**
	 * Column Info
	 * @param opCostOcpFlg
	 */
	public void setOpCostOcpFlg(String opCostOcpFlg) {
		this.opCostOcpFlg = opCostOcpFlg;
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
	 * @param opCostTnkOrdFlg
	 */
	public void setOpCostTnkOrdFlg(String opCostTnkOrdFlg) {
		this.opCostTnkOrdFlg = opCostTnkOrdFlg;
	}
	
	/**
	 * Column Info
	 * @param opCostXtraFtFlg
	 */
	public void setOpCostXtraFtFlg(String opCostXtraFtFlg) {
		this.opCostXtraFtFlg = opCostXtraFtFlg;
	}
	
	/**
	 * Column Info
	 * @param irrEqShtgFlg
	 */
	public void setIrrEqShtgFlg(String irrEqShtgFlg) {
		this.irrEqShtgFlg = irrEqShtgFlg;
	}
	
	/**
	 * Column Info
	 * @param opCostOtrTmlChssFlg
	 */
	public void setOpCostOtrTmlChssFlg(String opCostOtrTmlChssFlg) {
		this.opCostOtrTmlChssFlg = opCostOtrTmlChssFlg;
	}
	
	/**
	 * Column Info
	 * @param irrRsnRmk
	 */
	public void setIrrRsnRmk(String irrRsnRmk) {
		this.irrRsnRmk = irrRsnRmk;
	}
	
	/**
	 * Column Info
	 * @param opCostTeamTrkgFlg
	 */
	public void setOpCostTeamTrkgFlg(String opCostTeamTrkgFlg) {
		this.opCostTeamTrkgFlg = opCostTeamTrkgFlg;
	}
	
	/**
	 * Column Info
	 * @param irrTpCd
	 */
	public void setIrrTpCd(String irrTpCd) {
		this.irrTpCd = irrTpCd;
	}
	
	/**
	 * Column Info
	 * @param irrSysErrFlg
	 */
	public void setIrrSysErrFlg(String irrSysErrFlg) {
		this.irrSysErrFlg = irrSysErrFlg;
	}
	
	/**
	 * Column Info
	 * @param irrChssShtgFlg
	 */
	public void setIrrChssShtgFlg(String irrChssShtgFlg) {
		this.irrChssShtgFlg = irrChssShtgFlg;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param respbPtyNm
	 */
	public void setRespbPtyNm(String respbPtyNm) {
		this.respbPtyNm = respbPtyNm;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCurrCd(JSPUtil.getParameter(request, "curr_cd", ""));
		setIrrCxlWoFlg(JSPUtil.getParameter(request, "irr_cxl_wo_flg", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setIrrPrvtRmk(JSPUtil.getParameter(request, "irr_prvt_rmk", ""));
		setIrrTtlAmt(JSPUtil.getParameter(request, "irr_ttl_amt", ""));
		setBkgStsCd(JSPUtil.getParameter(request, "bkg_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setIrrLateDisFlg(JSPUtil.getParameter(request, "irr_late_dis_flg", ""));
		setIrrStfErrFlg(JSPUtil.getParameter(request, "irr_stf_err_flg", ""));
		setIrrLackOfFlwFlg(JSPUtil.getParameter(request, "irr_lack_of_flw_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setGnteNo(JSPUtil.getParameter(request, "gnte_no", ""));
		setIrrOtrFlg(JSPUtil.getParameter(request, "irr_otr_flg", ""));
		setOpCostSptgIcrzFlg(JSPUtil.getParameter(request, "op_cost_sptg_icrz_flg", ""));
		setIrrNo(JSPUtil.getParameter(request, "irr_no", ""));
		setGnteTpCd(JSPUtil.getParameter(request, "gnte_tp_cd", ""));
		setOpCostMnrFlg(JSPUtil.getParameter(request, "op_cost_mnr_flg", ""));
		setOpCostTriAxlFlg(JSPUtil.getParameter(request, "op_cost_tri_axl_flg", ""));
		setOpCostOcpFlg(JSPUtil.getParameter(request, "op_cost_ocp_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOpCostTnkOrdFlg(JSPUtil.getParameter(request, "op_cost_tnk_ord_flg", ""));
		setOpCostXtraFtFlg(JSPUtil.getParameter(request, "op_cost_xtra_ft_flg", ""));
		setIrrEqShtgFlg(JSPUtil.getParameter(request, "irr_eq_shtg_flg", ""));
		setOpCostOtrTmlChssFlg(JSPUtil.getParameter(request, "op_cost_otr_tml_chss_flg", ""));
		setIrrRsnRmk(JSPUtil.getParameter(request, "irr_rsn_rmk", ""));
		setOpCostTeamTrkgFlg(JSPUtil.getParameter(request, "op_cost_team_trkg_flg", ""));
		setIrrTpCd(JSPUtil.getParameter(request, "irr_tp_cd", ""));
		setIrrSysErrFlg(JSPUtil.getParameter(request, "irr_sys_err_flg", ""));
		setIrrChssShtgFlg(JSPUtil.getParameter(request, "irr_chss_shtg_flg", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRespbPtyNm(JSPUtil.getParameter(request, "respb_pty_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesIrrHdrVO[]
	 */
	public TesIrrHdrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesIrrHdrVO[]
	 */
	public TesIrrHdrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesIrrHdrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] irrCxlWoFlg = (JSPUtil.getParameter(request, prefix	+ "irr_cxl_wo_flg", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] irrPrvtRmk = (JSPUtil.getParameter(request, prefix	+ "irr_prvt_rmk", length));
			String[] irrTtlAmt = (JSPUtil.getParameter(request, prefix	+ "irr_ttl_amt", length));
			String[] bkgStsCd = (JSPUtil.getParameter(request, prefix	+ "bkg_sts_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] irrLateDisFlg = (JSPUtil.getParameter(request, prefix	+ "irr_late_dis_flg", length));
			String[] irrStfErrFlg = (JSPUtil.getParameter(request, prefix	+ "irr_stf_err_flg", length));
			String[] irrLackOfFlwFlg = (JSPUtil.getParameter(request, prefix	+ "irr_lack_of_flw_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] gnteNo = (JSPUtil.getParameter(request, prefix	+ "gnte_no", length));
			String[] irrOtrFlg = (JSPUtil.getParameter(request, prefix	+ "irr_otr_flg", length));
			String[] opCostSptgIcrzFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_sptg_icrz_flg", length));
			String[] irrNo = (JSPUtil.getParameter(request, prefix	+ "irr_no", length));
			String[] gnteTpCd = (JSPUtil.getParameter(request, prefix	+ "gnte_tp_cd", length));
			String[] opCostMnrFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_mnr_flg", length));
			String[] opCostTriAxlFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_tri_axl_flg", length));
			String[] opCostOcpFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_ocp_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] opCostTnkOrdFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_tnk_ord_flg", length));
			String[] opCostXtraFtFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_xtra_ft_flg", length));
			String[] irrEqShtgFlg = (JSPUtil.getParameter(request, prefix	+ "irr_eq_shtg_flg", length));
			String[] opCostOtrTmlChssFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_otr_tml_chss_flg", length));
			String[] irrRsnRmk = (JSPUtil.getParameter(request, prefix	+ "irr_rsn_rmk", length));
			String[] opCostTeamTrkgFlg = (JSPUtil.getParameter(request, prefix	+ "op_cost_team_trkg_flg", length));
			String[] irrTpCd = (JSPUtil.getParameter(request, prefix	+ "irr_tp_cd", length));
			String[] irrSysErrFlg = (JSPUtil.getParameter(request, prefix	+ "irr_sys_err_flg", length));
			String[] irrChssShtgFlg = (JSPUtil.getParameter(request, prefix	+ "irr_chss_shtg_flg", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] respbPtyNm = (JSPUtil.getParameter(request, prefix	+ "respb_pty_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesIrrHdrVO();
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (irrCxlWoFlg[i] != null)
					model.setIrrCxlWoFlg(irrCxlWoFlg[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (irrPrvtRmk[i] != null)
					model.setIrrPrvtRmk(irrPrvtRmk[i]);
				if (irrTtlAmt[i] != null)
					model.setIrrTtlAmt(irrTtlAmt[i]);
				if (bkgStsCd[i] != null)
					model.setBkgStsCd(bkgStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (irrLateDisFlg[i] != null)
					model.setIrrLateDisFlg(irrLateDisFlg[i]);
				if (irrStfErrFlg[i] != null)
					model.setIrrStfErrFlg(irrStfErrFlg[i]);
				if (irrLackOfFlwFlg[i] != null)
					model.setIrrLackOfFlwFlg(irrLackOfFlwFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (gnteNo[i] != null)
					model.setGnteNo(gnteNo[i]);
				if (irrOtrFlg[i] != null)
					model.setIrrOtrFlg(irrOtrFlg[i]);
				if (opCostSptgIcrzFlg[i] != null)
					model.setOpCostSptgIcrzFlg(opCostSptgIcrzFlg[i]);
				if (irrNo[i] != null)
					model.setIrrNo(irrNo[i]);
				if (gnteTpCd[i] != null)
					model.setGnteTpCd(gnteTpCd[i]);
				if (opCostMnrFlg[i] != null)
					model.setOpCostMnrFlg(opCostMnrFlg[i]);
				if (opCostTriAxlFlg[i] != null)
					model.setOpCostTriAxlFlg(opCostTriAxlFlg[i]);
				if (opCostOcpFlg[i] != null)
					model.setOpCostOcpFlg(opCostOcpFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (opCostTnkOrdFlg[i] != null)
					model.setOpCostTnkOrdFlg(opCostTnkOrdFlg[i]);
				if (opCostXtraFtFlg[i] != null)
					model.setOpCostXtraFtFlg(opCostXtraFtFlg[i]);
				if (irrEqShtgFlg[i] != null)
					model.setIrrEqShtgFlg(irrEqShtgFlg[i]);
				if (opCostOtrTmlChssFlg[i] != null)
					model.setOpCostOtrTmlChssFlg(opCostOtrTmlChssFlg[i]);
				if (irrRsnRmk[i] != null)
					model.setIrrRsnRmk(irrRsnRmk[i]);
				if (opCostTeamTrkgFlg[i] != null)
					model.setOpCostTeamTrkgFlg(opCostTeamTrkgFlg[i]);
				if (irrTpCd[i] != null)
					model.setIrrTpCd(irrTpCd[i]);
				if (irrSysErrFlg[i] != null)
					model.setIrrSysErrFlg(irrSysErrFlg[i]);
				if (irrChssShtgFlg[i] != null)
					model.setIrrChssShtgFlg(irrChssShtgFlg[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (respbPtyNm[i] != null)
					model.setRespbPtyNm(respbPtyNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesIrrHdrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesIrrHdrVO[]
	 */
	public TesIrrHdrVO[] getTesIrrHdrVOs(){
		TesIrrHdrVO[] vos = (TesIrrHdrVO[])models.toArray(new TesIrrHdrVO[models.size()]);
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
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrCxlWoFlg = this.irrCxlWoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrPrvtRmk = this.irrPrvtRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrTtlAmt = this.irrTtlAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgStsCd = this.bkgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrLateDisFlg = this.irrLateDisFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrStfErrFlg = this.irrStfErrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrLackOfFlwFlg = this.irrLackOfFlwFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnteNo = this.gnteNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrOtrFlg = this.irrOtrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostSptgIcrzFlg = this.opCostSptgIcrzFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrNo = this.irrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnteTpCd = this.gnteTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostMnrFlg = this.opCostMnrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostTriAxlFlg = this.opCostTriAxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostOcpFlg = this.opCostOcpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostTnkOrdFlg = this.opCostTnkOrdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostXtraFtFlg = this.opCostXtraFtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrEqShtgFlg = this.irrEqShtgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostOtrTmlChssFlg = this.opCostOtrTmlChssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrRsnRmk = this.irrRsnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opCostTeamTrkgFlg = this.opCostTeamTrkgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrTpCd = this.irrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrSysErrFlg = this.irrSysErrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.irrChssShtgFlg = this.irrChssShtgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.respbPtyNm = this.respbPtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
