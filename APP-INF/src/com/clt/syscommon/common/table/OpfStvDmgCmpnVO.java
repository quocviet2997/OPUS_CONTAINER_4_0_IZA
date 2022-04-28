/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfStvDmgCmpnVO.java
*@FileTitle : OpfStvDmgCmpnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.08
*@LastModifier : 이선영
*@LastVersion : 1.0
* 2009.06.08 이선영 
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
 * @author 이선영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class OpfStvDmgCmpnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfStvDmgCmpnVO> models = new ArrayList<OpfStvDmgCmpnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String clmHndlUsrId = null;
	/* Column Info */
	private String stvDmgCmpnDt = null;
	/* Column Info */
	private String cmpnRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stvDmgRespbPtyPicNm = null;
	/* Column Info */
	private String cmpnCostUsdAmt = null;
	/* Column Info */
	private String stvDmgCmpnProcStsCd = null;
	/* Column Info */
	private String stvDmgRespbPtyCoNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cmpnCostLoclAmt = null;
	/* Column Info */
	private String cmpnEmlSndNo = null;
	/* Column Info */
	private String clmHndlOfcCd = null;
	/* Column Info */
	private String cmpnCurrCd = null;
	/* Column Info */
	private String cmpnAcctNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stvDmgNo = null;
	/* Column Info */
	private String stvDmgRespbPtyPicTitNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfStvDmgCmpnVO() {}

	public OpfStvDmgCmpnVO(String ibflag, String pagerows, String stvDmgNo, String stvDmgCmpnProcStsCd, String clmHndlOfcCd, String clmHndlUsrId, String stvDmgRespbPtyCoNm, String stvDmgRespbPtyPicNm, String stvDmgRespbPtyPicTitNm, String stvDmgCmpnDt, String cmpnCurrCd, String cmpnCostLoclAmt, String cmpnCostUsdAmt, String cmpnAcctNo, String cmpnEmlSndNo, String cmpnRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.clmHndlUsrId = clmHndlUsrId;
		this.stvDmgCmpnDt = stvDmgCmpnDt;
		this.cmpnRmk = cmpnRmk;
		this.creDt = creDt;
		this.stvDmgRespbPtyPicNm = stvDmgRespbPtyPicNm;
		this.cmpnCostUsdAmt = cmpnCostUsdAmt;
		this.stvDmgCmpnProcStsCd = stvDmgCmpnProcStsCd;
		this.stvDmgRespbPtyCoNm = stvDmgRespbPtyCoNm;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cmpnCostLoclAmt = cmpnCostLoclAmt;
		this.cmpnEmlSndNo = cmpnEmlSndNo;
		this.clmHndlOfcCd = clmHndlOfcCd;
		this.cmpnCurrCd = cmpnCurrCd;
		this.cmpnAcctNo = cmpnAcctNo;
		this.updUsrId = updUsrId;
		this.stvDmgNo = stvDmgNo;
		this.stvDmgRespbPtyPicTitNm = stvDmgRespbPtyPicTitNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("clm_hndl_usr_id", getClmHndlUsrId());
		this.hashColumns.put("stv_dmg_cmpn_dt", getStvDmgCmpnDt());
		this.hashColumns.put("cmpn_rmk", getCmpnRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stv_dmg_respb_pty_pic_nm", getStvDmgRespbPtyPicNm());
		this.hashColumns.put("cmpn_cost_usd_amt", getCmpnCostUsdAmt());
		this.hashColumns.put("stv_dmg_cmpn_proc_sts_cd", getStvDmgCmpnProcStsCd());
		this.hashColumns.put("stv_dmg_respb_pty_co_nm", getStvDmgRespbPtyCoNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cmpn_cost_locl_amt", getCmpnCostLoclAmt());
		this.hashColumns.put("cmpn_eml_snd_no", getCmpnEmlSndNo());
		this.hashColumns.put("clm_hndl_ofc_cd", getClmHndlOfcCd());
		this.hashColumns.put("cmpn_curr_cd", getCmpnCurrCd());
		this.hashColumns.put("cmpn_acct_no", getCmpnAcctNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stv_dmg_no", getStvDmgNo());
		this.hashColumns.put("stv_dmg_respb_pty_pic_tit_nm", getStvDmgRespbPtyPicTitNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("clm_hndl_usr_id", "clmHndlUsrId");
		this.hashFields.put("stv_dmg_cmpn_dt", "stvDmgCmpnDt");
		this.hashFields.put("cmpn_rmk", "cmpnRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stv_dmg_respb_pty_pic_nm", "stvDmgRespbPtyPicNm");
		this.hashFields.put("cmpn_cost_usd_amt", "cmpnCostUsdAmt");
		this.hashFields.put("stv_dmg_cmpn_proc_sts_cd", "stvDmgCmpnProcStsCd");
		this.hashFields.put("stv_dmg_respb_pty_co_nm", "stvDmgRespbPtyCoNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cmpn_cost_locl_amt", "cmpnCostLoclAmt");
		this.hashFields.put("cmpn_eml_snd_no", "cmpnEmlSndNo");
		this.hashFields.put("clm_hndl_ofc_cd", "clmHndlOfcCd");
		this.hashFields.put("cmpn_curr_cd", "cmpnCurrCd");
		this.hashFields.put("cmpn_acct_no", "cmpnAcctNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stv_dmg_no", "stvDmgNo");
		this.hashFields.put("stv_dmg_respb_pty_pic_tit_nm", "stvDmgRespbPtyPicTitNm");
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
	 * @return clmHndlUsrId
	 */
	public String getClmHndlUsrId() {
		return this.clmHndlUsrId;
	}
	
	/**
	 * Column Info
	 * @return stvDmgCmpnDt
	 */
	public String getStvDmgCmpnDt() {
		return this.stvDmgCmpnDt;
	}
	
	/**
	 * Column Info
	 * @return cmpnRmk
	 */
	public String getCmpnRmk() {
		return this.cmpnRmk;
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
	 * @return stvDmgRespbPtyPicNm
	 */
	public String getStvDmgRespbPtyPicNm() {
		return this.stvDmgRespbPtyPicNm;
	}
	
	/**
	 * Column Info
	 * @return cmpnCostUsdAmt
	 */
	public String getCmpnCostUsdAmt() {
		return this.cmpnCostUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return stvDmgCmpnProcStsCd
	 */
	public String getStvDmgCmpnProcStsCd() {
		return this.stvDmgCmpnProcStsCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRespbPtyCoNm
	 */
	public String getStvDmgRespbPtyCoNm() {
		return this.stvDmgRespbPtyCoNm;
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
	 * @return cmpnCostLoclAmt
	 */
	public String getCmpnCostLoclAmt() {
		return this.cmpnCostLoclAmt;
	}
	
	/**
	 * Column Info
	 * @return cmpnEmlSndNo
	 */
	public String getCmpnEmlSndNo() {
		return this.cmpnEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return clmHndlOfcCd
	 */
	public String getClmHndlOfcCd() {
		return this.clmHndlOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cmpnCurrCd
	 */
	public String getCmpnCurrCd() {
		return this.cmpnCurrCd;
	}
	
	/**
	 * Column Info
	 * @return cmpnAcctNo
	 */
	public String getCmpnAcctNo() {
		return this.cmpnAcctNo;
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
	 * @return stvDmgNo
	 */
	public String getStvDmgNo() {
		return this.stvDmgNo;
	}
	
	/**
	 * Column Info
	 * @return stvDmgRespbPtyPicTitNm
	 */
	public String getStvDmgRespbPtyPicTitNm() {
		return this.stvDmgRespbPtyPicTitNm;
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
	 * @param clmHndlUsrId
	 */
	public void setClmHndlUsrId(String clmHndlUsrId) {
		this.clmHndlUsrId = clmHndlUsrId;
	}
	
	/**
	 * Column Info
	 * @param stvDmgCmpnDt
	 */
	public void setStvDmgCmpnDt(String stvDmgCmpnDt) {
		this.stvDmgCmpnDt = stvDmgCmpnDt;
	}
	
	/**
	 * Column Info
	 * @param cmpnRmk
	 */
	public void setCmpnRmk(String cmpnRmk) {
		this.cmpnRmk = cmpnRmk;
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
	 * @param stvDmgRespbPtyPicNm
	 */
	public void setStvDmgRespbPtyPicNm(String stvDmgRespbPtyPicNm) {
		this.stvDmgRespbPtyPicNm = stvDmgRespbPtyPicNm;
	}
	
	/**
	 * Column Info
	 * @param cmpnCostUsdAmt
	 */
	public void setCmpnCostUsdAmt(String cmpnCostUsdAmt) {
		this.cmpnCostUsdAmt = cmpnCostUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param stvDmgCmpnProcStsCd
	 */
	public void setStvDmgCmpnProcStsCd(String stvDmgCmpnProcStsCd) {
		this.stvDmgCmpnProcStsCd = stvDmgCmpnProcStsCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRespbPtyCoNm
	 */
	public void setStvDmgRespbPtyCoNm(String stvDmgRespbPtyCoNm) {
		this.stvDmgRespbPtyCoNm = stvDmgRespbPtyCoNm;
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
	 * @param cmpnCostLoclAmt
	 */
	public void setCmpnCostLoclAmt(String cmpnCostLoclAmt) {
		this.cmpnCostLoclAmt = cmpnCostLoclAmt;
	}
	
	/**
	 * Column Info
	 * @param cmpnEmlSndNo
	 */
	public void setCmpnEmlSndNo(String cmpnEmlSndNo) {
		this.cmpnEmlSndNo = cmpnEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param clmHndlOfcCd
	 */
	public void setClmHndlOfcCd(String clmHndlOfcCd) {
		this.clmHndlOfcCd = clmHndlOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cmpnCurrCd
	 */
	public void setCmpnCurrCd(String cmpnCurrCd) {
		this.cmpnCurrCd = cmpnCurrCd;
	}
	
	/**
	 * Column Info
	 * @param cmpnAcctNo
	 */
	public void setCmpnAcctNo(String cmpnAcctNo) {
		this.cmpnAcctNo = cmpnAcctNo;
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
	 * @param stvDmgNo
	 */
	public void setStvDmgNo(String stvDmgNo) {
		this.stvDmgNo = stvDmgNo;
	}
	
	/**
	 * Column Info
	 * @param stvDmgRespbPtyPicTitNm
	 */
	public void setStvDmgRespbPtyPicTitNm(String stvDmgRespbPtyPicTitNm) {
		this.stvDmgRespbPtyPicTitNm = stvDmgRespbPtyPicTitNm;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setClmHndlUsrId(JSPUtil.getParameter(request, "clm_hndl_usr_id", ""));
		setStvDmgCmpnDt(JSPUtil.getParameter(request, "stv_dmg_cmpn_dt", ""));
		setCmpnRmk(JSPUtil.getParameter(request, "cmpn_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStvDmgRespbPtyPicNm(JSPUtil.getParameter(request, "stv_dmg_respb_pty_pic_nm", ""));
		setCmpnCostUsdAmt(JSPUtil.getParameter(request, "cmpn_cost_usd_amt", ""));
		setStvDmgCmpnProcStsCd(JSPUtil.getParameter(request, "stv_dmg_cmpn_proc_sts_cd", ""));
		setStvDmgRespbPtyCoNm(JSPUtil.getParameter(request, "stv_dmg_respb_pty_co_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCmpnCostLoclAmt(JSPUtil.getParameter(request, "cmpn_cost_locl_amt", ""));
		setCmpnEmlSndNo(JSPUtil.getParameter(request, "cmpn_eml_snd_no", ""));
		setClmHndlOfcCd(JSPUtil.getParameter(request, "clm_hndl_ofc_cd", ""));
		setCmpnCurrCd(JSPUtil.getParameter(request, "cmpn_curr_cd", ""));
		setCmpnAcctNo(JSPUtil.getParameter(request, "cmpn_acct_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStvDmgNo(JSPUtil.getParameter(request, "stv_dmg_no", ""));
		setStvDmgRespbPtyPicTitNm(JSPUtil.getParameter(request, "stv_dmg_respb_pty_pic_tit_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfStvDmgCmpnVO[]
	 */
	public OpfStvDmgCmpnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfStvDmgCmpnVO[]
	 */
	public OpfStvDmgCmpnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfStvDmgCmpnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] clmHndlUsrId = (JSPUtil.getParameter(request, prefix	+ "clm_hndl_usr_id".trim(), length));
			String[] stvDmgCmpnDt = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_cmpn_dt".trim(), length));
			String[] cmpnRmk = (JSPUtil.getParameter(request, prefix	+ "cmpn_rmk".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] stvDmgRespbPtyPicNm = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_respb_pty_pic_nm".trim(), length));
			String[] cmpnCostUsdAmt = (JSPUtil.getParameter(request, prefix	+ "cmpn_cost_usd_amt".trim(), length));
			String[] stvDmgCmpnProcStsCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_cmpn_proc_sts_cd".trim(), length));
			String[] stvDmgRespbPtyCoNm = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_respb_pty_co_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cmpnCostLoclAmt = (JSPUtil.getParameter(request, prefix	+ "cmpn_cost_locl_amt".trim(), length));
			String[] cmpnEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "cmpn_eml_snd_no".trim(), length));
			String[] clmHndlOfcCd = (JSPUtil.getParameter(request, prefix	+ "clm_hndl_ofc_cd".trim(), length));
			String[] cmpnCurrCd = (JSPUtil.getParameter(request, prefix	+ "cmpn_curr_cd".trim(), length));
			String[] cmpnAcctNo = (JSPUtil.getParameter(request, prefix	+ "cmpn_acct_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] stvDmgNo = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_no".trim(), length));
			String[] stvDmgRespbPtyPicTitNm = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_respb_pty_pic_tit_nm".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfStvDmgCmpnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (clmHndlUsrId[i] != null)
					model.setClmHndlUsrId(clmHndlUsrId[i]);
				if (stvDmgCmpnDt[i] != null)
					model.setStvDmgCmpnDt(stvDmgCmpnDt[i]);
				if (cmpnRmk[i] != null)
					model.setCmpnRmk(cmpnRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stvDmgRespbPtyPicNm[i] != null)
					model.setStvDmgRespbPtyPicNm(stvDmgRespbPtyPicNm[i]);
				if (cmpnCostUsdAmt[i] != null)
					model.setCmpnCostUsdAmt(cmpnCostUsdAmt[i]);
				if (stvDmgCmpnProcStsCd[i] != null)
					model.setStvDmgCmpnProcStsCd(stvDmgCmpnProcStsCd[i]);
				if (stvDmgRespbPtyCoNm[i] != null)
					model.setStvDmgRespbPtyCoNm(stvDmgRespbPtyCoNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cmpnCostLoclAmt[i] != null)
					model.setCmpnCostLoclAmt(cmpnCostLoclAmt[i]);
				if (cmpnEmlSndNo[i] != null)
					model.setCmpnEmlSndNo(cmpnEmlSndNo[i]);
				if (clmHndlOfcCd[i] != null)
					model.setClmHndlOfcCd(clmHndlOfcCd[i]);
				if (cmpnCurrCd[i] != null)
					model.setCmpnCurrCd(cmpnCurrCd[i]);
				if (cmpnAcctNo[i] != null)
					model.setCmpnAcctNo(cmpnAcctNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stvDmgNo[i] != null)
					model.setStvDmgNo(stvDmgNo[i]);
				if (stvDmgRespbPtyPicTitNm[i] != null)
					model.setStvDmgRespbPtyPicTitNm(stvDmgRespbPtyPicTitNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfStvDmgCmpnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfStvDmgCmpnVO[]
	 */
	public OpfStvDmgCmpnVO[] getOpfStvDmgCmpnVOs(){
		OpfStvDmgCmpnVO[] vos = (OpfStvDmgCmpnVO[])models.toArray(new OpfStvDmgCmpnVO[models.size()]);
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
		this.clmHndlUsrId = this.clmHndlUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgCmpnDt = this.stvDmgCmpnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmpnRmk = this.cmpnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRespbPtyPicNm = this.stvDmgRespbPtyPicNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmpnCostUsdAmt = this.cmpnCostUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgCmpnProcStsCd = this.stvDmgCmpnProcStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRespbPtyCoNm = this.stvDmgRespbPtyCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmpnCostLoclAmt = this.cmpnCostLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmpnEmlSndNo = this.cmpnEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clmHndlOfcCd = this.clmHndlOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmpnCurrCd = this.cmpnCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmpnAcctNo = this.cmpnAcctNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgNo = this.stvDmgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgRespbPtyPicTitNm = this.stvDmgRespbPtyPicTitNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
