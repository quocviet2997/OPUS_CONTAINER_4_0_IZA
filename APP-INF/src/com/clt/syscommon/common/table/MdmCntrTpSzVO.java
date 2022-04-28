/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : MdmCntrTpSzVO.java
*@FileTitle : MdmCntrTpSzVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.23
*@LastModifier : 김준호
*@LastVersion : 1.0
* 2010.02.23 김준호 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 김준호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmCntrTpSzVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmCntrTpSzVO> models = new ArrayList<MdmCntrTpSzVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrTpszIsoCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String cntrSzCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String modiCntrTpszCd = null;
	/* Column Info */
	private String aciacDivCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String eaiIfId = null;
	/* Column Info */
	private String cntrTpszLodgCapa = null;
	/* Column Info */
	private String cntrTpszLodgWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rptDpSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrTpszDesc = null;
	/* Column Info */
	private String cntrTpszRmk = null;
	/* Column Info */
	private String cntrTpCd = null;
	/* Column Info */
	private String cntrTpszTareWgt = null;
	/* Column Info */
	private String cntrTpszGrpCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntrTpszPsaCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmCntrTpSzVO() {}

	public MdmCntrTpSzVO(String ibflag, String pagerows, String cntrTpszCd, String cntrSzCd, String cntrTpCd, String cntrTpszLodgWgt, String cntrTpszLodgCapa, String cntrTpszTareWgt, String cntrTpszDesc, String cntrTpszRmk, String cntrTpszPsaCd, String cntrTpszIsoCd, String modiCntrTpszCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId, String cntrTpszGrpCd, String rptDpSeq, String aciacDivCd) {
		this.updDt = updDt;
		this.cntrTpszIsoCd = cntrTpszIsoCd;
		this.deltFlg = deltFlg;
		this.cntrSzCd = cntrSzCd;
		this.creDt = creDt;
		this.modiCntrTpszCd = modiCntrTpszCd;
		this.aciacDivCd = aciacDivCd;
		this.eaiEvntDt = eaiEvntDt;
		this.eaiIfId = eaiIfId;
		this.cntrTpszLodgCapa = cntrTpszLodgCapa;
		this.cntrTpszLodgWgt = cntrTpszLodgWgt;
		this.pagerows = pagerows;
		this.rptDpSeq = rptDpSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cntrTpszDesc = cntrTpszDesc;
		this.cntrTpszRmk = cntrTpszRmk;
		this.cntrTpCd = cntrTpCd;
		this.cntrTpszTareWgt = cntrTpszTareWgt;
		this.cntrTpszGrpCd = cntrTpszGrpCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cntrTpszPsaCd = cntrTpszPsaCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_tpsz_iso_cd", getCntrTpszIsoCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cntr_sz_cd", getCntrSzCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("modi_cntr_tpsz_cd", getModiCntrTpszCd());
		this.hashColumns.put("aciac_div_cd", getAciacDivCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		this.hashColumns.put("cntr_tpsz_lodg_capa", getCntrTpszLodgCapa());
		this.hashColumns.put("cntr_tpsz_lodg_wgt", getCntrTpszLodgWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rpt_dp_seq", getRptDpSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_tpsz_desc", getCntrTpszDesc());
		this.hashColumns.put("cntr_tpsz_rmk", getCntrTpszRmk());
		this.hashColumns.put("cntr_tp_cd", getCntrTpCd());
		this.hashColumns.put("cntr_tpsz_tare_wgt", getCntrTpszTareWgt());
		this.hashColumns.put("cntr_tpsz_grp_cd", getCntrTpszGrpCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cntr_tpsz_psa_cd", getCntrTpszPsaCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_tpsz_iso_cd", "cntrTpszIsoCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cntr_sz_cd", "cntrSzCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("modi_cntr_tpsz_cd", "modiCntrTpszCd");
		this.hashFields.put("aciac_div_cd", "aciacDivCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("eai_if_id", "eaiIfId");
		this.hashFields.put("cntr_tpsz_lodg_capa", "cntrTpszLodgCapa");
		this.hashFields.put("cntr_tpsz_lodg_wgt", "cntrTpszLodgWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rpt_dp_seq", "rptDpSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_desc", "cntrTpszDesc");
		this.hashFields.put("cntr_tpsz_rmk", "cntrTpszRmk");
		this.hashFields.put("cntr_tp_cd", "cntrTpCd");
		this.hashFields.put("cntr_tpsz_tare_wgt", "cntrTpszTareWgt");
		this.hashFields.put("cntr_tpsz_grp_cd", "cntrTpszGrpCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cntr_tpsz_psa_cd", "cntrTpszPsaCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return cntrTpszIsoCd
	 */
	public String getCntrTpszIsoCd() {
		return this.cntrTpszIsoCd;
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
	 * @return cntrSzCd
	 */
	public String getCntrSzCd() {
		return this.cntrSzCd;
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
	 * @return modiCntrTpszCd
	 */
	public String getModiCntrTpszCd() {
		return this.modiCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return aciacDivCd
	 */
	public String getAciacDivCd() {
		return this.aciacDivCd;
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
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszLodgCapa
	 */
	public String getCntrTpszLodgCapa() {
		return this.cntrTpszLodgCapa;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszLodgWgt
	 */
	public String getCntrTpszLodgWgt() {
		return this.cntrTpszLodgWgt;
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
	 * @return rptDpSeq
	 */
	public String getRptDpSeq() {
		return this.rptDpSeq;
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
	 * @return cntrTpszDesc
	 */
	public String getCntrTpszDesc() {
		return this.cntrTpszDesc;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszRmk
	 */
	public String getCntrTpszRmk() {
		return this.cntrTpszRmk;
	}
	
	/**
	 * Column Info
	 * @return cntrTpCd
	 */
	public String getCntrTpCd() {
		return this.cntrTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszTareWgt
	 */
	public String getCntrTpszTareWgt() {
		return this.cntrTpszTareWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszGrpCd
	 */
	public String getCntrTpszGrpCd() {
		return this.cntrTpszGrpCd;
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
	 * @return cntrTpszPsaCd
	 */
	public String getCntrTpszPsaCd() {
		return this.cntrTpszPsaCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszIsoCd
	 */
	public void setCntrTpszIsoCd(String cntrTpszIsoCd) {
		this.cntrTpszIsoCd = cntrTpszIsoCd;
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
	 * @param cntrSzCd
	 */
	public void setCntrSzCd(String cntrSzCd) {
		this.cntrSzCd = cntrSzCd;
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
	 * @param modiCntrTpszCd
	 */
	public void setModiCntrTpszCd(String modiCntrTpszCd) {
		this.modiCntrTpszCd = modiCntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param aciacDivCd
	 */
	public void setAciacDivCd(String aciacDivCd) {
		this.aciacDivCd = aciacDivCd;
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
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszLodgCapa
	 */
	public void setCntrTpszLodgCapa(String cntrTpszLodgCapa) {
		this.cntrTpszLodgCapa = cntrTpszLodgCapa;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszLodgWgt
	 */
	public void setCntrTpszLodgWgt(String cntrTpszLodgWgt) {
		this.cntrTpszLodgWgt = cntrTpszLodgWgt;
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
	 * @param rptDpSeq
	 */
	public void setRptDpSeq(String rptDpSeq) {
		this.rptDpSeq = rptDpSeq;
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
	 * @param cntrTpszDesc
	 */
	public void setCntrTpszDesc(String cntrTpszDesc) {
		this.cntrTpszDesc = cntrTpszDesc;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszRmk
	 */
	public void setCntrTpszRmk(String cntrTpszRmk) {
		this.cntrTpszRmk = cntrTpszRmk;
	}
	
	/**
	 * Column Info
	 * @param cntrTpCd
	 */
	public void setCntrTpCd(String cntrTpCd) {
		this.cntrTpCd = cntrTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszTareWgt
	 */
	public void setCntrTpszTareWgt(String cntrTpszTareWgt) {
		this.cntrTpszTareWgt = cntrTpszTareWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszGrpCd
	 */
	public void setCntrTpszGrpCd(String cntrTpszGrpCd) {
		this.cntrTpszGrpCd = cntrTpszGrpCd;
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
	 * @param cntrTpszPsaCd
	 */
	public void setCntrTpszPsaCd(String cntrTpszPsaCd) {
		this.cntrTpszPsaCd = cntrTpszPsaCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCntrTpszIsoCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_iso_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCntrSzCd(JSPUtil.getParameter(request, prefix + "cntr_sz_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setModiCntrTpszCd(JSPUtil.getParameter(request, prefix + "modi_cntr_tpsz_cd", ""));
		setAciacDivCd(JSPUtil.getParameter(request, prefix + "aciac_div_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, prefix + "eai_evnt_dt", ""));
		setEaiIfId(JSPUtil.getParameter(request, prefix + "eai_if_id", ""));
		setCntrTpszLodgCapa(JSPUtil.getParameter(request, prefix + "cntr_tpsz_lodg_capa", ""));
		setCntrTpszLodgWgt(JSPUtil.getParameter(request, prefix + "cntr_tpsz_lodg_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setRptDpSeq(JSPUtil.getParameter(request, prefix + "rpt_dp_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCntrTpszDesc(JSPUtil.getParameter(request, prefix + "cntr_tpsz_desc", ""));
		setCntrTpszRmk(JSPUtil.getParameter(request, prefix + "cntr_tpsz_rmk", ""));
		setCntrTpCd(JSPUtil.getParameter(request, prefix + "cntr_tp_cd", ""));
		setCntrTpszTareWgt(JSPUtil.getParameter(request, prefix + "cntr_tpsz_tare_wgt", ""));
		setCntrTpszGrpCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_grp_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setCntrTpszPsaCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_psa_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmCntrTpSzVO[]
	 */
	public MdmCntrTpSzVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmCntrTpSzVO[]
	 */
	public MdmCntrTpSzVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCntrTpSzVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cntrTpszIsoCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_iso_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] cntrSzCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] modiCntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "modi_cntr_tpsz_cd", length));
			String[] aciacDivCd = (JSPUtil.getParameter(request, prefix	+ "aciac_div_cd", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] eaiIfId = (JSPUtil.getParameter(request, prefix	+ "eai_if_id", length));
			String[] cntrTpszLodgCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_lodg_capa", length));
			String[] cntrTpszLodgWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_lodg_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rptDpSeq = (JSPUtil.getParameter(request, prefix	+ "rpt_dp_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrTpszDesc = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_desc", length));
			String[] cntrTpszRmk = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_rmk", length));
			String[] cntrTpCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tp_cd", length));
			String[] cntrTpszTareWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_tare_wgt", length));
			String[] cntrTpszGrpCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_grp_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntrTpszPsaCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_psa_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCntrTpSzVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrTpszIsoCd[i] != null)
					model.setCntrTpszIsoCd(cntrTpszIsoCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (cntrSzCd[i] != null)
					model.setCntrSzCd(cntrSzCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (modiCntrTpszCd[i] != null)
					model.setModiCntrTpszCd(modiCntrTpszCd[i]);
				if (aciacDivCd[i] != null)
					model.setAciacDivCd(aciacDivCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				if (cntrTpszLodgCapa[i] != null)
					model.setCntrTpszLodgCapa(cntrTpszLodgCapa[i]);
				if (cntrTpszLodgWgt[i] != null)
					model.setCntrTpszLodgWgt(cntrTpszLodgWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rptDpSeq[i] != null)
					model.setRptDpSeq(rptDpSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrTpszDesc[i] != null)
					model.setCntrTpszDesc(cntrTpszDesc[i]);
				if (cntrTpszRmk[i] != null)
					model.setCntrTpszRmk(cntrTpszRmk[i]);
				if (cntrTpCd[i] != null)
					model.setCntrTpCd(cntrTpCd[i]);
				if (cntrTpszTareWgt[i] != null)
					model.setCntrTpszTareWgt(cntrTpszTareWgt[i]);
				if (cntrTpszGrpCd[i] != null)
					model.setCntrTpszGrpCd(cntrTpszGrpCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntrTpszPsaCd[i] != null)
					model.setCntrTpszPsaCd(cntrTpszPsaCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmCntrTpSzVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmCntrTpSzVO[]
	 */
	public MdmCntrTpSzVO[] getMdmCntrTpSzVOs(){
		MdmCntrTpSzVO[] vos = (MdmCntrTpSzVO[])models.toArray(new MdmCntrTpSzVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszIsoCd = this.cntrTpszIsoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzCd = this.cntrSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiCntrTpszCd = this.modiCntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aciacDivCd = this.aciacDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszLodgCapa = this.cntrTpszLodgCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszLodgWgt = this.cntrTpszLodgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptDpSeq = this.rptDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszDesc = this.cntrTpszDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszRmk = this.cntrTpszRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpCd = this.cntrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszTareWgt = this.cntrTpszTareWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszGrpCd = this.cntrTpszGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszPsaCd = this.cntrTpszPsaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
