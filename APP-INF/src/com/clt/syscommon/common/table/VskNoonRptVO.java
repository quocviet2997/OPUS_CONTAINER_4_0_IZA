/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : VskNoonRptVO.java
*@FileTitle : VskNoonRptVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.01
*@LastModifier : 정명훈
*@LastVersion : 1.0
* 2009.09.01 정명훈 
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
 * @author 정명훈
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskNoonRptVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskNoonRptVO> models = new ArrayList<VskNoonRptVO>();
	
	/* Column Info */
	private String nxtPortEtaDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String foilCsmWgt = null;
	/* Column Info */
	private String actGdt = null;
	/* Column Info */
	private String noonRptDt = null;
	/* Column Info */
	private String crntActSpd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rmnAvgSpd = null;
	/* Column Info */
	private String nxtPortCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sailHrmnt = null;
	/* Column Info */
	private String portLon = null;
	/* Column Info */
	private String wndSclNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String crntActRpmPwr = null;
	/* Column Info */
	private String visRngNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lodIndQty = null;
	/* Column Info */
	private String slpRt = null;
	/* Column Info */
	private String crsNo = null;
	/* Column Info */
	private String doilCsmWgt = null;
	/* Column Info */
	private String portLat = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String wndDirCtnt = null;
	/* Column Info */
	private String rmnDist = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String engMlDist = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String nvgtDist = null;
	/* Column Info */
	private String ocnCrntCtnt = null;
	/* Column Info */
	private String seaSteNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskNoonRptVO() {}

	public VskNoonRptVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String noonRptDt, String nxtPortCd, String nxtPortEtaDt, String actGdt, String portLat, String portLon, String sailHrmnt, String nvgtDist, String engMlDist, String wndDirCtnt, String wndSclNo, String ocnCrntCtnt, String seaSteNo, String visRngNo, String crntActSpd, String crntActRpmPwr, String slpRt, String rmnDist, String rmnAvgSpd, String foilCsmWgt, String doilCsmWgt, String crsNo, String lodIndQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.nxtPortEtaDt = nxtPortEtaDt;
		this.vslCd = vslCd;
		this.foilCsmWgt = foilCsmWgt;
		this.actGdt = actGdt;
		this.noonRptDt = noonRptDt;
		this.crntActSpd = crntActSpd;
		this.creDt = creDt;
		this.rmnAvgSpd = rmnAvgSpd;
		this.nxtPortCd = nxtPortCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.sailHrmnt = sailHrmnt;
		this.portLon = portLon;
		this.wndSclNo = wndSclNo;
		this.updUsrId = updUsrId;
		this.crntActRpmPwr = crntActRpmPwr;
		this.visRngNo = visRngNo;
		this.updDt = updDt;
		this.lodIndQty = lodIndQty;
		this.slpRt = slpRt;
		this.crsNo = crsNo;
		this.doilCsmWgt = doilCsmWgt;
		this.portLat = portLat;
		this.skdVoyNo = skdVoyNo;
		this.wndDirCtnt = wndDirCtnt;
		this.rmnDist = rmnDist;
		this.skdDirCd = skdDirCd;
		this.engMlDist = engMlDist;
		this.creUsrId = creUsrId;
		this.nvgtDist = nvgtDist;
		this.ocnCrntCtnt = ocnCrntCtnt;
		this.seaSteNo = seaSteNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("nxt_port_eta_dt", getNxtPortEtaDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("foil_csm_wgt", getFoilCsmWgt());
		this.hashColumns.put("act_gdt", getActGdt());
		this.hashColumns.put("noon_rpt_dt", getNoonRptDt());
		this.hashColumns.put("crnt_act_spd", getCrntActSpd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rmn_avg_spd", getRmnAvgSpd());
		this.hashColumns.put("nxt_port_cd", getNxtPortCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sail_hrmnt", getSailHrmnt());
		this.hashColumns.put("port_lon", getPortLon());
		this.hashColumns.put("wnd_scl_no", getWndSclNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("crnt_act_rpm_pwr", getCrntActRpmPwr());
		this.hashColumns.put("vis_rng_no", getVisRngNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lod_ind_qty", getLodIndQty());
		this.hashColumns.put("slp_rt", getSlpRt());
		this.hashColumns.put("crs_no", getCrsNo());
		this.hashColumns.put("doil_csm_wgt", getDoilCsmWgt());
		this.hashColumns.put("port_lat", getPortLat());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("wnd_dir_ctnt", getWndDirCtnt());
		this.hashColumns.put("rmn_dist", getRmnDist());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("eng_ml_dist", getEngMlDist());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("nvgt_dist", getNvgtDist());
		this.hashColumns.put("ocn_crnt_ctnt", getOcnCrntCtnt());
		this.hashColumns.put("sea_ste_no", getSeaSteNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("nxt_port_eta_dt", "nxtPortEtaDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("foil_csm_wgt", "foilCsmWgt");
		this.hashFields.put("act_gdt", "actGdt");
		this.hashFields.put("noon_rpt_dt", "noonRptDt");
		this.hashFields.put("crnt_act_spd", "crntActSpd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rmn_avg_spd", "rmnAvgSpd");
		this.hashFields.put("nxt_port_cd", "nxtPortCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sail_hrmnt", "sailHrmnt");
		this.hashFields.put("port_lon", "portLon");
		this.hashFields.put("wnd_scl_no", "wndSclNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("crnt_act_rpm_pwr", "crntActRpmPwr");
		this.hashFields.put("vis_rng_no", "visRngNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lod_ind_qty", "lodIndQty");
		this.hashFields.put("slp_rt", "slpRt");
		this.hashFields.put("crs_no", "crsNo");
		this.hashFields.put("doil_csm_wgt", "doilCsmWgt");
		this.hashFields.put("port_lat", "portLat");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("wnd_dir_ctnt", "wndDirCtnt");
		this.hashFields.put("rmn_dist", "rmnDist");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("eng_ml_dist", "engMlDist");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("nvgt_dist", "nvgtDist");
		this.hashFields.put("ocn_crnt_ctnt", "ocnCrntCtnt");
		this.hashFields.put("sea_ste_no", "seaSteNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return nxtPortEtaDt
	 */
	public String getNxtPortEtaDt() {
		return this.nxtPortEtaDt;
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
	 * @return foilCsmWgt
	 */
	public String getFoilCsmWgt() {
		return this.foilCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return actGdt
	 */
	public String getActGdt() {
		return this.actGdt;
	}
	
	/**
	 * Column Info
	 * @return noonRptDt
	 */
	public String getNoonRptDt() {
		return this.noonRptDt;
	}
	
	/**
	 * Column Info
	 * @return crntActSpd
	 */
	public String getCrntActSpd() {
		return this.crntActSpd;
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
	 * @return rmnAvgSpd
	 */
	public String getRmnAvgSpd() {
		return this.rmnAvgSpd;
	}
	
	/**
	 * Column Info
	 * @return nxtPortCd
	 */
	public String getNxtPortCd() {
		return this.nxtPortCd;
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
	 * @return sailHrmnt
	 */
	public String getSailHrmnt() {
		return this.sailHrmnt;
	}
	
	/**
	 * Column Info
	 * @return portLon
	 */
	public String getPortLon() {
		return this.portLon;
	}
	
	/**
	 * Column Info
	 * @return wndSclNo
	 */
	public String getWndSclNo() {
		return this.wndSclNo;
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
	 * @return crntActRpmPwr
	 */
	public String getCrntActRpmPwr() {
		return this.crntActRpmPwr;
	}
	
	/**
	 * Column Info
	 * @return visRngNo
	 */
	public String getVisRngNo() {
		return this.visRngNo;
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
	 * @return lodIndQty
	 */
	public String getLodIndQty() {
		return this.lodIndQty;
	}
	
	/**
	 * Column Info
	 * @return slpRt
	 */
	public String getSlpRt() {
		return this.slpRt;
	}
	
	/**
	 * Column Info
	 * @return crsNo
	 */
	public String getCrsNo() {
		return this.crsNo;
	}
	
	/**
	 * Column Info
	 * @return doilCsmWgt
	 */
	public String getDoilCsmWgt() {
		return this.doilCsmWgt;
	}
	
	/**
	 * Column Info
	 * @return portLat
	 */
	public String getPortLat() {
		return this.portLat;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return wndDirCtnt
	 */
	public String getWndDirCtnt() {
		return this.wndDirCtnt;
	}
	
	/**
	 * Column Info
	 * @return rmnDist
	 */
	public String getRmnDist() {
		return this.rmnDist;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return engMlDist
	 */
	public String getEngMlDist() {
		return this.engMlDist;
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
	 * @return nvgtDist
	 */
	public String getNvgtDist() {
		return this.nvgtDist;
	}
	
	/**
	 * Column Info
	 * @return ocnCrntCtnt
	 */
	public String getOcnCrntCtnt() {
		return this.ocnCrntCtnt;
	}
	
	/**
	 * Column Info
	 * @return seaSteNo
	 */
	public String getSeaSteNo() {
		return this.seaSteNo;
	}
	

	/**
	 * Column Info
	 * @param nxtPortEtaDt
	 */
	public void setNxtPortEtaDt(String nxtPortEtaDt) {
		this.nxtPortEtaDt = nxtPortEtaDt;
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
	 * @param foilCsmWgt
	 */
	public void setFoilCsmWgt(String foilCsmWgt) {
		this.foilCsmWgt = foilCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param actGdt
	 */
	public void setActGdt(String actGdt) {
		this.actGdt = actGdt;
	}
	
	/**
	 * Column Info
	 * @param noonRptDt
	 */
	public void setNoonRptDt(String noonRptDt) {
		this.noonRptDt = noonRptDt;
	}
	
	/**
	 * Column Info
	 * @param crntActSpd
	 */
	public void setCrntActSpd(String crntActSpd) {
		this.crntActSpd = crntActSpd;
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
	 * @param rmnAvgSpd
	 */
	public void setRmnAvgSpd(String rmnAvgSpd) {
		this.rmnAvgSpd = rmnAvgSpd;
	}
	
	/**
	 * Column Info
	 * @param nxtPortCd
	 */
	public void setNxtPortCd(String nxtPortCd) {
		this.nxtPortCd = nxtPortCd;
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
	 * @param sailHrmnt
	 */
	public void setSailHrmnt(String sailHrmnt) {
		this.sailHrmnt = sailHrmnt;
	}
	
	/**
	 * Column Info
	 * @param portLon
	 */
	public void setPortLon(String portLon) {
		this.portLon = portLon;
	}
	
	/**
	 * Column Info
	 * @param wndSclNo
	 */
	public void setWndSclNo(String wndSclNo) {
		this.wndSclNo = wndSclNo;
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
	 * @param crntActRpmPwr
	 */
	public void setCrntActRpmPwr(String crntActRpmPwr) {
		this.crntActRpmPwr = crntActRpmPwr;
	}
	
	/**
	 * Column Info
	 * @param visRngNo
	 */
	public void setVisRngNo(String visRngNo) {
		this.visRngNo = visRngNo;
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
	 * @param lodIndQty
	 */
	public void setLodIndQty(String lodIndQty) {
		this.lodIndQty = lodIndQty;
	}
	
	/**
	 * Column Info
	 * @param slpRt
	 */
	public void setSlpRt(String slpRt) {
		this.slpRt = slpRt;
	}
	
	/**
	 * Column Info
	 * @param crsNo
	 */
	public void setCrsNo(String crsNo) {
		this.crsNo = crsNo;
	}
	
	/**
	 * Column Info
	 * @param doilCsmWgt
	 */
	public void setDoilCsmWgt(String doilCsmWgt) {
		this.doilCsmWgt = doilCsmWgt;
	}
	
	/**
	 * Column Info
	 * @param portLat
	 */
	public void setPortLat(String portLat) {
		this.portLat = portLat;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param wndDirCtnt
	 */
	public void setWndDirCtnt(String wndDirCtnt) {
		this.wndDirCtnt = wndDirCtnt;
	}
	
	/**
	 * Column Info
	 * @param rmnDist
	 */
	public void setRmnDist(String rmnDist) {
		this.rmnDist = rmnDist;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param engMlDist
	 */
	public void setEngMlDist(String engMlDist) {
		this.engMlDist = engMlDist;
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
	 * @param nvgtDist
	 */
	public void setNvgtDist(String nvgtDist) {
		this.nvgtDist = nvgtDist;
	}
	
	/**
	 * Column Info
	 * @param ocnCrntCtnt
	 */
	public void setOcnCrntCtnt(String ocnCrntCtnt) {
		this.ocnCrntCtnt = ocnCrntCtnt;
	}
	
	/**
	 * Column Info
	 * @param seaSteNo
	 */
	public void setSeaSteNo(String seaSteNo) {
		this.seaSteNo = seaSteNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setNxtPortEtaDt(JSPUtil.getParameter(request, "nxt_port_eta_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setFoilCsmWgt(JSPUtil.getParameter(request, "foil_csm_wgt", ""));
		setActGdt(JSPUtil.getParameter(request, "act_gdt", ""));
		setNoonRptDt(JSPUtil.getParameter(request, "noon_rpt_dt", ""));
		setCrntActSpd(JSPUtil.getParameter(request, "crnt_act_spd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRmnAvgSpd(JSPUtil.getParameter(request, "rmn_avg_spd", ""));
		setNxtPortCd(JSPUtil.getParameter(request, "nxt_port_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSailHrmnt(JSPUtil.getParameter(request, "sail_hrmnt", ""));
		setPortLon(JSPUtil.getParameter(request, "port_lon", ""));
		setWndSclNo(JSPUtil.getParameter(request, "wnd_scl_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCrntActRpmPwr(JSPUtil.getParameter(request, "crnt_act_rpm_pwr", ""));
		setVisRngNo(JSPUtil.getParameter(request, "vis_rng_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setLodIndQty(JSPUtil.getParameter(request, "lod_ind_qty", ""));
		setSlpRt(JSPUtil.getParameter(request, "slp_rt", ""));
		setCrsNo(JSPUtil.getParameter(request, "crs_no", ""));
		setDoilCsmWgt(JSPUtil.getParameter(request, "doil_csm_wgt", ""));
		setPortLat(JSPUtil.getParameter(request, "port_lat", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setWndDirCtnt(JSPUtil.getParameter(request, "wnd_dir_ctnt", ""));
		setRmnDist(JSPUtil.getParameter(request, "rmn_dist", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setEngMlDist(JSPUtil.getParameter(request, "eng_ml_dist", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setNvgtDist(JSPUtil.getParameter(request, "nvgt_dist", ""));
		setOcnCrntCtnt(JSPUtil.getParameter(request, "ocn_crnt_ctnt", ""));
		setSeaSteNo(JSPUtil.getParameter(request, "sea_ste_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskNoonRptVO[]
	 */
	public VskNoonRptVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskNoonRptVO[]
	 */
	public VskNoonRptVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskNoonRptVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] nxtPortEtaDt = (JSPUtil.getParameter(request, prefix	+ "nxt_port_eta_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] foilCsmWgt = (JSPUtil.getParameter(request, prefix	+ "foil_csm_wgt", length));
			String[] actGdt = (JSPUtil.getParameter(request, prefix	+ "act_gdt", length));
			String[] noonRptDt = (JSPUtil.getParameter(request, prefix	+ "noon_rpt_dt", length));
			String[] crntActSpd = (JSPUtil.getParameter(request, prefix	+ "crnt_act_spd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rmnAvgSpd = (JSPUtil.getParameter(request, prefix	+ "rmn_avg_spd", length));
			String[] nxtPortCd = (JSPUtil.getParameter(request, prefix	+ "nxt_port_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sailHrmnt = (JSPUtil.getParameter(request, prefix	+ "sail_hrmnt", length));
			String[] portLon = (JSPUtil.getParameter(request, prefix	+ "port_lon", length));
			String[] wndSclNo = (JSPUtil.getParameter(request, prefix	+ "wnd_scl_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] crntActRpmPwr = (JSPUtil.getParameter(request, prefix	+ "crnt_act_rpm_pwr", length));
			String[] visRngNo = (JSPUtil.getParameter(request, prefix	+ "vis_rng_no", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lodIndQty = (JSPUtil.getParameter(request, prefix	+ "lod_ind_qty", length));
			String[] slpRt = (JSPUtil.getParameter(request, prefix	+ "slp_rt", length));
			String[] crsNo = (JSPUtil.getParameter(request, prefix	+ "crs_no", length));
			String[] doilCsmWgt = (JSPUtil.getParameter(request, prefix	+ "doil_csm_wgt", length));
			String[] portLat = (JSPUtil.getParameter(request, prefix	+ "port_lat", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] wndDirCtnt = (JSPUtil.getParameter(request, prefix	+ "wnd_dir_ctnt", length));
			String[] rmnDist = (JSPUtil.getParameter(request, prefix	+ "rmn_dist", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] engMlDist = (JSPUtil.getParameter(request, prefix	+ "eng_ml_dist", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] nvgtDist = (JSPUtil.getParameter(request, prefix	+ "nvgt_dist", length));
			String[] ocnCrntCtnt = (JSPUtil.getParameter(request, prefix	+ "ocn_crnt_ctnt", length));
			String[] seaSteNo = (JSPUtil.getParameter(request, prefix	+ "sea_ste_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskNoonRptVO();
				if (nxtPortEtaDt[i] != null)
					model.setNxtPortEtaDt(nxtPortEtaDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (foilCsmWgt[i] != null)
					model.setFoilCsmWgt(foilCsmWgt[i]);
				if (actGdt[i] != null)
					model.setActGdt(actGdt[i]);
				if (noonRptDt[i] != null)
					model.setNoonRptDt(noonRptDt[i]);
				if (crntActSpd[i] != null)
					model.setCrntActSpd(crntActSpd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rmnAvgSpd[i] != null)
					model.setRmnAvgSpd(rmnAvgSpd[i]);
				if (nxtPortCd[i] != null)
					model.setNxtPortCd(nxtPortCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sailHrmnt[i] != null)
					model.setSailHrmnt(sailHrmnt[i]);
				if (portLon[i] != null)
					model.setPortLon(portLon[i]);
				if (wndSclNo[i] != null)
					model.setWndSclNo(wndSclNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (crntActRpmPwr[i] != null)
					model.setCrntActRpmPwr(crntActRpmPwr[i]);
				if (visRngNo[i] != null)
					model.setVisRngNo(visRngNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lodIndQty[i] != null)
					model.setLodIndQty(lodIndQty[i]);
				if (slpRt[i] != null)
					model.setSlpRt(slpRt[i]);
				if (crsNo[i] != null)
					model.setCrsNo(crsNo[i]);
				if (doilCsmWgt[i] != null)
					model.setDoilCsmWgt(doilCsmWgt[i]);
				if (portLat[i] != null)
					model.setPortLat(portLat[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (wndDirCtnt[i] != null)
					model.setWndDirCtnt(wndDirCtnt[i]);
				if (rmnDist[i] != null)
					model.setRmnDist(rmnDist[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (engMlDist[i] != null)
					model.setEngMlDist(engMlDist[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (nvgtDist[i] != null)
					model.setNvgtDist(nvgtDist[i]);
				if (ocnCrntCtnt[i] != null)
					model.setOcnCrntCtnt(ocnCrntCtnt[i]);
				if (seaSteNo[i] != null)
					model.setSeaSteNo(seaSteNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskNoonRptVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskNoonRptVO[]
	 */
	public VskNoonRptVO[] getVskNoonRptVOs(){
		VskNoonRptVO[] vos = (VskNoonRptVO[])models.toArray(new VskNoonRptVO[models.size()]);
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
		this.nxtPortEtaDt = this.nxtPortEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.foilCsmWgt = this.foilCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actGdt = this.actGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noonRptDt = this.noonRptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntActSpd = this.crntActSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnAvgSpd = this.rmnAvgSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtPortCd = this.nxtPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailHrmnt = this.sailHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portLon = this.portLon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wndSclNo = this.wndSclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntActRpmPwr = this.crntActRpmPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.visRngNo = this.visRngNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodIndQty = this.lodIndQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slpRt = this.slpRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crsNo = this.crsNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doilCsmWgt = this.doilCsmWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portLat = this.portLat .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wndDirCtnt = this.wndDirCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnDist = this.rmnDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.engMlDist = this.engMlDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nvgtDist = this.nvgtDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ocnCrntCtnt = this.ocnCrntCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaSteNo = this.seaSteNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
