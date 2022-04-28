/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriScgPrfVO.java
*@FileTitle : PriScgPrfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 김재연
*@LastVersion : 1.0
* 2009.07.28 김재연 
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
 * @author 김재연
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PriScgPrfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriScgPrfVO> models = new ArrayList<PriScgPrfVO>();
	
	/* Column Info */
	private String podUseFlg = null;
	/* Column Info */
	private String porUseFlg = null;
	/* Column Info */
	private String ioGaUseFlg = null;
	/* Column Info */
	private String socUseFlg = null;
	/* Column Info */
	private String imdgClssUseFlg = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chgCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String usaSvcModUseFlg = null;
	/* Column Info */
	private String griCmdtUseFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rcvDeTermUseFlg = null;
	/* Column Info */
	private String slanUseFlg = null;
	/* Column Info */
	private String tmlUseFlg = null;
	/* Column Info */
	private String polUseFlg = null;
	/* Column Info */
	private String cgoWgtUseFlg = null;
	/* Column Info */
	private String tsPortUseFlg = null;
	/* Column Info */
	private String hngrBarUseFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fltPctTpCd = null;
	/* Column Info */
	private String delUseFlg = null;
	/* Column Info */
	private String cmdtUseFlg = null;
	/* Column Info */
	private String trnsModUseFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dirCallUseFlg = null;
	/* Column Info */
	private String subTrdUseFlg = null;
	/* Column Info */
	private String pctBseCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriScgPrfVO() {}

	public PriScgPrfVO(String ibflag, String pagerows, String svcScpCd, String chgCd, String fltPctTpCd, String pctBseCd, String subTrdUseFlg, String slanUseFlg, String porUseFlg, String polUseFlg, String podUseFlg, String delUseFlg, String imdgClssUseFlg, String tsPortUseFlg, String tmlUseFlg, String trnsModUseFlg, String usaSvcModUseFlg, String rcvDeTermUseFlg, String hngrBarUseFlg, String dirCallUseFlg, String cgoWgtUseFlg, String cmdtUseFlg, String griCmdtUseFlg, String socUseFlg, String ioGaUseFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.podUseFlg = podUseFlg;
		this.porUseFlg = porUseFlg;
		this.ioGaUseFlg = ioGaUseFlg;
		this.socUseFlg = socUseFlg;
		this.imdgClssUseFlg = imdgClssUseFlg;
		this.svcScpCd = svcScpCd;
		this.creDt = creDt;
		this.chgCd = chgCd;
		this.pagerows = pagerows;
		this.usaSvcModUseFlg = usaSvcModUseFlg;
		this.griCmdtUseFlg = griCmdtUseFlg;
		this.ibflag = ibflag;
		this.rcvDeTermUseFlg = rcvDeTermUseFlg;
		this.slanUseFlg = slanUseFlg;
		this.tmlUseFlg = tmlUseFlg;
		this.polUseFlg = polUseFlg;
		this.cgoWgtUseFlg = cgoWgtUseFlg;
		this.tsPortUseFlg = tsPortUseFlg;
		this.hngrBarUseFlg = hngrBarUseFlg;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.fltPctTpCd = fltPctTpCd;
		this.delUseFlg = delUseFlg;
		this.cmdtUseFlg = cmdtUseFlg;
		this.trnsModUseFlg = trnsModUseFlg;
		this.creUsrId = creUsrId;
		this.dirCallUseFlg = dirCallUseFlg;
		this.subTrdUseFlg = subTrdUseFlg;
		this.pctBseCd = pctBseCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pod_use_flg", getPodUseFlg());
		this.hashColumns.put("por_use_flg", getPorUseFlg());
		this.hashColumns.put("io_ga_use_flg", getIoGaUseFlg());
		this.hashColumns.put("soc_use_flg", getSocUseFlg());
		this.hashColumns.put("imdg_clss_use_flg", getImdgClssUseFlg());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("usa_svc_mod_use_flg", getUsaSvcModUseFlg());
		this.hashColumns.put("gri_cmdt_use_flg", getGriCmdtUseFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rcv_de_term_use_flg", getRcvDeTermUseFlg());
		this.hashColumns.put("slan_use_flg", getSlanUseFlg());
		this.hashColumns.put("tml_use_flg", getTmlUseFlg());
		this.hashColumns.put("pol_use_flg", getPolUseFlg());
		this.hashColumns.put("cgo_wgt_use_flg", getCgoWgtUseFlg());
		this.hashColumns.put("ts_port_use_flg", getTsPortUseFlg());
		this.hashColumns.put("hngr_bar_use_flg", getHngrBarUseFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("flt_pct_tp_cd", getFltPctTpCd());
		this.hashColumns.put("del_use_flg", getDelUseFlg());
		this.hashColumns.put("cmdt_use_flg", getCmdtUseFlg());
		this.hashColumns.put("trns_mod_use_flg", getTrnsModUseFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dir_call_use_flg", getDirCallUseFlg());
		this.hashColumns.put("sub_trd_use_flg", getSubTrdUseFlg());
		this.hashColumns.put("pct_bse_cd", getPctBseCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pod_use_flg", "podUseFlg");
		this.hashFields.put("por_use_flg", "porUseFlg");
		this.hashFields.put("io_ga_use_flg", "ioGaUseFlg");
		this.hashFields.put("soc_use_flg", "socUseFlg");
		this.hashFields.put("imdg_clss_use_flg", "imdgClssUseFlg");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("usa_svc_mod_use_flg", "usaSvcModUseFlg");
		this.hashFields.put("gri_cmdt_use_flg", "griCmdtUseFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rcv_de_term_use_flg", "rcvDeTermUseFlg");
		this.hashFields.put("slan_use_flg", "slanUseFlg");
		this.hashFields.put("tml_use_flg", "tmlUseFlg");
		this.hashFields.put("pol_use_flg", "polUseFlg");
		this.hashFields.put("cgo_wgt_use_flg", "cgoWgtUseFlg");
		this.hashFields.put("ts_port_use_flg", "tsPortUseFlg");
		this.hashFields.put("hngr_bar_use_flg", "hngrBarUseFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("flt_pct_tp_cd", "fltPctTpCd");
		this.hashFields.put("del_use_flg", "delUseFlg");
		this.hashFields.put("cmdt_use_flg", "cmdtUseFlg");
		this.hashFields.put("trns_mod_use_flg", "trnsModUseFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dir_call_use_flg", "dirCallUseFlg");
		this.hashFields.put("sub_trd_use_flg", "subTrdUseFlg");
		this.hashFields.put("pct_bse_cd", "pctBseCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return podUseFlg
	 */
	public String getPodUseFlg() {
		return this.podUseFlg;
	}
	
	/**
	 * Column Info
	 * @return porUseFlg
	 */
	public String getPorUseFlg() {
		return this.porUseFlg;
	}
	
	/**
	 * Column Info
	 * @return ioGaUseFlg
	 */
	public String getIoGaUseFlg() {
		return this.ioGaUseFlg;
	}
	
	/**
	 * Column Info
	 * @return socUseFlg
	 */
	public String getSocUseFlg() {
		return this.socUseFlg;
	}
	
	/**
	 * Column Info
	 * @return imdgClssUseFlg
	 */
	public String getImdgClssUseFlg() {
		return this.imdgClssUseFlg;
	}
	
	/**
	 * Column Info
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
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
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
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
	 * @return usaSvcModUseFlg
	 */
	public String getUsaSvcModUseFlg() {
		return this.usaSvcModUseFlg;
	}
	
	/**
	 * Column Info
	 * @return griCmdtUseFlg
	 */
	public String getGriCmdtUseFlg() {
		return this.griCmdtUseFlg;
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
	 * @return rcvDeTermUseFlg
	 */
	public String getRcvDeTermUseFlg() {
		return this.rcvDeTermUseFlg;
	}
	
	/**
	 * Column Info
	 * @return slanUseFlg
	 */
	public String getSlanUseFlg() {
		return this.slanUseFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlUseFlg
	 */
	public String getTmlUseFlg() {
		return this.tmlUseFlg;
	}
	
	/**
	 * Column Info
	 * @return polUseFlg
	 */
	public String getPolUseFlg() {
		return this.polUseFlg;
	}
	
	/**
	 * Column Info
	 * @return cgoWgtUseFlg
	 */
	public String getCgoWgtUseFlg() {
		return this.cgoWgtUseFlg;
	}
	
	/**
	 * Column Info
	 * @return tsPortUseFlg
	 */
	public String getTsPortUseFlg() {
		return this.tsPortUseFlg;
	}
	
	/**
	 * Column Info
	 * @return hngrBarUseFlg
	 */
	public String getHngrBarUseFlg() {
		return this.hngrBarUseFlg;
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
	 * @return fltPctTpCd
	 */
	public String getFltPctTpCd() {
		return this.fltPctTpCd;
	}
	
	/**
	 * Column Info
	 * @return delUseFlg
	 */
	public String getDelUseFlg() {
		return this.delUseFlg;
	}
	
	/**
	 * Column Info
	 * @return cmdtUseFlg
	 */
	public String getCmdtUseFlg() {
		return this.cmdtUseFlg;
	}
	
	/**
	 * Column Info
	 * @return trnsModUseFlg
	 */
	public String getTrnsModUseFlg() {
		return this.trnsModUseFlg;
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
	 * @return dirCallUseFlg
	 */
	public String getDirCallUseFlg() {
		return this.dirCallUseFlg;
	}
	
	/**
	 * Column Info
	 * @return subTrdUseFlg
	 */
	public String getSubTrdUseFlg() {
		return this.subTrdUseFlg;
	}
	
	/**
	 * Column Info
	 * @return pctBseCd
	 */
	public String getPctBseCd() {
		return this.pctBseCd;
	}
	

	/**
	 * Column Info
	 * @param podUseFlg
	 */
	public void setPodUseFlg(String podUseFlg) {
		this.podUseFlg = podUseFlg;
	}
	
	/**
	 * Column Info
	 * @param porUseFlg
	 */
	public void setPorUseFlg(String porUseFlg) {
		this.porUseFlg = porUseFlg;
	}
	
	/**
	 * Column Info
	 * @param ioGaUseFlg
	 */
	public void setIoGaUseFlg(String ioGaUseFlg) {
		this.ioGaUseFlg = ioGaUseFlg;
	}
	
	/**
	 * Column Info
	 * @param socUseFlg
	 */
	public void setSocUseFlg(String socUseFlg) {
		this.socUseFlg = socUseFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgClssUseFlg
	 */
	public void setImdgClssUseFlg(String imdgClssUseFlg) {
		this.imdgClssUseFlg = imdgClssUseFlg;
	}
	
	/**
	 * Column Info
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
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
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
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
	 * @param usaSvcModUseFlg
	 */
	public void setUsaSvcModUseFlg(String usaSvcModUseFlg) {
		this.usaSvcModUseFlg = usaSvcModUseFlg;
	}
	
	/**
	 * Column Info
	 * @param griCmdtUseFlg
	 */
	public void setGriCmdtUseFlg(String griCmdtUseFlg) {
		this.griCmdtUseFlg = griCmdtUseFlg;
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
	 * @param rcvDeTermUseFlg
	 */
	public void setRcvDeTermUseFlg(String rcvDeTermUseFlg) {
		this.rcvDeTermUseFlg = rcvDeTermUseFlg;
	}
	
	/**
	 * Column Info
	 * @param slanUseFlg
	 */
	public void setSlanUseFlg(String slanUseFlg) {
		this.slanUseFlg = slanUseFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlUseFlg
	 */
	public void setTmlUseFlg(String tmlUseFlg) {
		this.tmlUseFlg = tmlUseFlg;
	}
	
	/**
	 * Column Info
	 * @param polUseFlg
	 */
	public void setPolUseFlg(String polUseFlg) {
		this.polUseFlg = polUseFlg;
	}
	
	/**
	 * Column Info
	 * @param cgoWgtUseFlg
	 */
	public void setCgoWgtUseFlg(String cgoWgtUseFlg) {
		this.cgoWgtUseFlg = cgoWgtUseFlg;
	}
	
	/**
	 * Column Info
	 * @param tsPortUseFlg
	 */
	public void setTsPortUseFlg(String tsPortUseFlg) {
		this.tsPortUseFlg = tsPortUseFlg;
	}
	
	/**
	 * Column Info
	 * @param hngrBarUseFlg
	 */
	public void setHngrBarUseFlg(String hngrBarUseFlg) {
		this.hngrBarUseFlg = hngrBarUseFlg;
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
	 * @param fltPctTpCd
	 */
	public void setFltPctTpCd(String fltPctTpCd) {
		this.fltPctTpCd = fltPctTpCd;
	}
	
	/**
	 * Column Info
	 * @param delUseFlg
	 */
	public void setDelUseFlg(String delUseFlg) {
		this.delUseFlg = delUseFlg;
	}
	
	/**
	 * Column Info
	 * @param cmdtUseFlg
	 */
	public void setCmdtUseFlg(String cmdtUseFlg) {
		this.cmdtUseFlg = cmdtUseFlg;
	}
	
	/**
	 * Column Info
	 * @param trnsModUseFlg
	 */
	public void setTrnsModUseFlg(String trnsModUseFlg) {
		this.trnsModUseFlg = trnsModUseFlg;
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
	 * @param dirCallUseFlg
	 */
	public void setDirCallUseFlg(String dirCallUseFlg) {
		this.dirCallUseFlg = dirCallUseFlg;
	}
	
	/**
	 * Column Info
	 * @param subTrdUseFlg
	 */
	public void setSubTrdUseFlg(String subTrdUseFlg) {
		this.subTrdUseFlg = subTrdUseFlg;
	}
	
	/**
	 * Column Info
	 * @param pctBseCd
	 */
	public void setPctBseCd(String pctBseCd) {
		this.pctBseCd = pctBseCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPodUseFlg(JSPUtil.getParameter(request, "pod_use_flg", ""));
		setPorUseFlg(JSPUtil.getParameter(request, "por_use_flg", ""));
		setIoGaUseFlg(JSPUtil.getParameter(request, "io_ga_use_flg", ""));
		setSocUseFlg(JSPUtil.getParameter(request, "soc_use_flg", ""));
		setImdgClssUseFlg(JSPUtil.getParameter(request, "imdg_clss_use_flg", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setUsaSvcModUseFlg(JSPUtil.getParameter(request, "usa_svc_mod_use_flg", ""));
		setGriCmdtUseFlg(JSPUtil.getParameter(request, "gri_cmdt_use_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRcvDeTermUseFlg(JSPUtil.getParameter(request, "rcv_de_term_use_flg", ""));
		setSlanUseFlg(JSPUtil.getParameter(request, "slan_use_flg", ""));
		setTmlUseFlg(JSPUtil.getParameter(request, "tml_use_flg", ""));
		setPolUseFlg(JSPUtil.getParameter(request, "pol_use_flg", ""));
		setCgoWgtUseFlg(JSPUtil.getParameter(request, "cgo_wgt_use_flg", ""));
		setTsPortUseFlg(JSPUtil.getParameter(request, "ts_port_use_flg", ""));
		setHngrBarUseFlg(JSPUtil.getParameter(request, "hngr_bar_use_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFltPctTpCd(JSPUtil.getParameter(request, "flt_pct_tp_cd", ""));
		setDelUseFlg(JSPUtil.getParameter(request, "del_use_flg", ""));
		setCmdtUseFlg(JSPUtil.getParameter(request, "cmdt_use_flg", ""));
		setTrnsModUseFlg(JSPUtil.getParameter(request, "trns_mod_use_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDirCallUseFlg(JSPUtil.getParameter(request, "dir_call_use_flg", ""));
		setSubTrdUseFlg(JSPUtil.getParameter(request, "sub_trd_use_flg", ""));
		setPctBseCd(JSPUtil.getParameter(request, "pct_bse_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PriScgPrfVO[]
	 */
	public PriScgPrfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriScgPrfVO[]
	 */
	public PriScgPrfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriScgPrfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] podUseFlg = (JSPUtil.getParameter(request, prefix	+ "pod_use_flg", length));
			String[] porUseFlg = (JSPUtil.getParameter(request, prefix	+ "por_use_flg", length));
			String[] ioGaUseFlg = (JSPUtil.getParameter(request, prefix	+ "io_ga_use_flg", length));
			String[] socUseFlg = (JSPUtil.getParameter(request, prefix	+ "soc_use_flg", length));
			String[] imdgClssUseFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_use_flg", length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] usaSvcModUseFlg = (JSPUtil.getParameter(request, prefix	+ "usa_svc_mod_use_flg", length));
			String[] griCmdtUseFlg = (JSPUtil.getParameter(request, prefix	+ "gri_cmdt_use_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rcvDeTermUseFlg = (JSPUtil.getParameter(request, prefix	+ "rcv_de_term_use_flg", length));
			String[] slanUseFlg = (JSPUtil.getParameter(request, prefix	+ "slan_use_flg", length));
			String[] tmlUseFlg = (JSPUtil.getParameter(request, prefix	+ "tml_use_flg", length));
			String[] polUseFlg = (JSPUtil.getParameter(request, prefix	+ "pol_use_flg", length));
			String[] cgoWgtUseFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_wgt_use_flg", length));
			String[] tsPortUseFlg = (JSPUtil.getParameter(request, prefix	+ "ts_port_use_flg", length));
			String[] hngrBarUseFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_bar_use_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fltPctTpCd = (JSPUtil.getParameter(request, prefix	+ "flt_pct_tp_cd", length));
			String[] delUseFlg = (JSPUtil.getParameter(request, prefix	+ "del_use_flg", length));
			String[] cmdtUseFlg = (JSPUtil.getParameter(request, prefix	+ "cmdt_use_flg", length));
			String[] trnsModUseFlg = (JSPUtil.getParameter(request, prefix	+ "trns_mod_use_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] dirCallUseFlg = (JSPUtil.getParameter(request, prefix	+ "dir_call_use_flg", length));
			String[] subTrdUseFlg = (JSPUtil.getParameter(request, prefix	+ "sub_trd_use_flg", length));
			String[] pctBseCd = (JSPUtil.getParameter(request, prefix	+ "pct_bse_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new PriScgPrfVO();
				if (podUseFlg[i] != null)
					model.setPodUseFlg(podUseFlg[i]);
				if (porUseFlg[i] != null)
					model.setPorUseFlg(porUseFlg[i]);
				if (ioGaUseFlg[i] != null)
					model.setIoGaUseFlg(ioGaUseFlg[i]);
				if (socUseFlg[i] != null)
					model.setSocUseFlg(socUseFlg[i]);
				if (imdgClssUseFlg[i] != null)
					model.setImdgClssUseFlg(imdgClssUseFlg[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (usaSvcModUseFlg[i] != null)
					model.setUsaSvcModUseFlg(usaSvcModUseFlg[i]);
				if (griCmdtUseFlg[i] != null)
					model.setGriCmdtUseFlg(griCmdtUseFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rcvDeTermUseFlg[i] != null)
					model.setRcvDeTermUseFlg(rcvDeTermUseFlg[i]);
				if (slanUseFlg[i] != null)
					model.setSlanUseFlg(slanUseFlg[i]);
				if (tmlUseFlg[i] != null)
					model.setTmlUseFlg(tmlUseFlg[i]);
				if (polUseFlg[i] != null)
					model.setPolUseFlg(polUseFlg[i]);
				if (cgoWgtUseFlg[i] != null)
					model.setCgoWgtUseFlg(cgoWgtUseFlg[i]);
				if (tsPortUseFlg[i] != null)
					model.setTsPortUseFlg(tsPortUseFlg[i]);
				if (hngrBarUseFlg[i] != null)
					model.setHngrBarUseFlg(hngrBarUseFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fltPctTpCd[i] != null)
					model.setFltPctTpCd(fltPctTpCd[i]);
				if (delUseFlg[i] != null)
					model.setDelUseFlg(delUseFlg[i]);
				if (cmdtUseFlg[i] != null)
					model.setCmdtUseFlg(cmdtUseFlg[i]);
				if (trnsModUseFlg[i] != null)
					model.setTrnsModUseFlg(trnsModUseFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dirCallUseFlg[i] != null)
					model.setDirCallUseFlg(dirCallUseFlg[i]);
				if (subTrdUseFlg[i] != null)
					model.setSubTrdUseFlg(subTrdUseFlg[i]);
				if (pctBseCd[i] != null)
					model.setPctBseCd(pctBseCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriScgPrfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PriScgPrfVO[]
	 */
	public PriScgPrfVO[] getPriScgPrfVOs(){
		PriScgPrfVO[] vos = (PriScgPrfVO[])models.toArray(new PriScgPrfVO[models.size()]);
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
		this.podUseFlg = this.podUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porUseFlg = this.porUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioGaUseFlg = this.ioGaUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socUseFlg = this.socUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssUseFlg = this.imdgClssUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaSvcModUseFlg = this.usaSvcModUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.griCmdtUseFlg = this.griCmdtUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDeTermUseFlg = this.rcvDeTermUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanUseFlg = this.slanUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlUseFlg = this.tmlUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polUseFlg = this.polUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoWgtUseFlg = this.cgoWgtUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsPortUseFlg = this.tsPortUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrBarUseFlg = this.hngrBarUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltPctTpCd = this.fltPctTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delUseFlg = this.delUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtUseFlg = this.cmdtUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnsModUseFlg = this.trnsModUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCallUseFlg = this.dirCallUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdUseFlg = this.subTrdUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctBseCd = this.pctBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
