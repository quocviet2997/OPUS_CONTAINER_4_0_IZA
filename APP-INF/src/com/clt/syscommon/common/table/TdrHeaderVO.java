/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TdrHeaderVO.java
*@FileTitle : TdrHeaderVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.09
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.09  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TdrHeaderVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TdrHeaderVO> models = new ArrayList<TdrHeaderVO>();
	
	/* Column Info */
	private String con = null;
	/* Column Info */
	private String eta = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String berth = null;
	/* Column Info */
	private String sulphurDoDep = null;
	/* Column Info */
	private String dwtDep = null;
	/* Column Info */
	private String remark = null;
	/* Column Info */
	private String draftAftArr = null;
	/* Column Info */
	private String anchorArr = null;
	/* Column Info */
	private String supplySulphurFo = null;
	/* Column Info */
	private String tmlCd = null;
	/* Column Info */
	private String info = null;
	/* Column Info */
	private String grossTml = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String netGc = null;
	/* Column Info */
	private String bunkerFwDep = null;
	/* Column Info */
	private String tdrUser = null;
	/* Column Info */
	private String robDoDep = null;
	/* Column Info */
	private String nextPort = null;
	/* Column Info */
	private String tugArr = null;
	/* Column Info */
	private String nisDate = null;
	/* Column Info */
	private String updateTime = null;
	/* Column Info */
	private String displDep = null;
	/* Column Info */
	private String grossWork = null;
	/* Column Info */
	private String bunkerFoArr = null;
	/* Column Info */
	private String ballastArr = null;
	/* Column Info */
	private String grossGang = null;
	/* Column Info */
	private String bunkerDoDep = null;
	/* Column Info */
	private String etaCanal = null;
	/* Column Info */
	private String displArr = null;
	/* Column Info */
	private String bunkerFwArr = null;
	/* Column Info */
	private String sulphurFoArr = null;
	/* Column Info */
	private String commence = null;
	/* Column Info */
	private String anchorDep = null;
	/* Column Info */
	private String netGang = null;
	/* Column Info */
	private String hatch = null;
	/* Column Info */
	private String ballastDep = null;
	/* Column Info */
	private String updateUser = null;
	/* Column Info */
	private String mvs = null;
	/* Column Info */
	private String bunkerDoArr = null;
	/* Column Info */
	private String robFoDep = null;
	/* Column Info */
	private String grossGc = null;
	/* Column Info */
	private String bunkerFoDep = null;
	/* Column Info */
	private String supplySulphurDo = null;
	/* Column Info */
	private String pilotArr = null;
	/* Column Info */
	private String pilotDep = null;
	/* Column Info */
	private String netWork = null;
	/* Column Info */
	private String updateSys = null;
	/* Column Info */
	private String draftAftDep = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String callInd = null;
	/* Column Info */
	private String tugDep = null;
	/* Column Info */
	private String nextCanalDt = null;
	/* Column Info */
	private String complete = null;
	/* Column Info */
	private String netTml = null;
	/* Column Info */
	private String nextCanal = null;
	/* Column Info */
	private String gmDep = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String draftFwdDep = null;
	/* Column Info */
	private String voyNo = null;
	/* Column Info */
	private String tdrDate = null;
	/* Column Info */
	private String robFwArr = null;
	/* Column Info */
	private String sulphurFoDep = null;
	/* Column Info */
	private String robDoArr = null;
	/* Column Info */
	private String unberth = null;
	/* Column Info */
	private String draftFwdArr = null;
	/* Column Info */
	private String nextPortDt = null;
	/* Column Info */
	private String loseHr = null;
	/* Column Info */
	private String robFoArr = null;
	/* Column Info */
	private String gmArr = null;
	/* Column Info */
	private String dwtArr = null;
	/* Column Info */
	private String sulphurDoArr = null;
	/* Column Info */
	private String robFwDep = null;
	/* Column Info */
	private String plnCrnNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TdrHeaderVO() {}

	public TdrHeaderVO(String ibflag, String pagerows, String vslCd, String voyNo, String dirCd, String portCd, String callInd, String tmlCd, String tdrDate, String tdrUser, String nisDate, String commence, String complete, String grossWork, String netWork, String loseHr, String grossGang, String netGang, String mvs, String netTml, String grossTml, String netGc, String grossGc, String remark, String hatch, String con, String pilotArr, String pilotDep, String anchorArr, String anchorDep, String berth, String unberth, String draftFwdArr, String draftFwdDep, String draftAftArr, String draftAftDep, String ballastArr, String ballastDep, String robFoArr, String robFoDep, String robDoArr, String robDoDep, String robFwArr, String robFwDep, String bunkerFoArr, String bunkerFoDep, String bunkerDoArr, String bunkerDoDep, String bunkerFwArr, String bunkerFwDep, String dwtArr, String dwtDep, String displArr, String displDep, String gmArr, String gmDep, String tugArr, String tugDep, String eta, String etaCanal, String info, String updateUser, String updateTime, String sulphurFoArr, String sulphurFoDep, String sulphurDoArr, String sulphurDoDep, String supplySulphurFo, String supplySulphurDo, String updateSys, String nextPort, String nextPortDt, String nextCanal, String nextCanalDt, String plnCrnNo) {
		this.con = con;
		this.eta = eta;
		this.vslCd = vslCd;
		this.berth = berth;
		this.sulphurDoDep = sulphurDoDep;
		this.dwtDep = dwtDep;
		this.remark = remark;
		this.draftAftArr = draftAftArr;
		this.anchorArr = anchorArr;
		this.supplySulphurFo = supplySulphurFo;
		this.tmlCd = tmlCd;
		this.info = info;
		this.grossTml = grossTml;
		this.pagerows = pagerows;
		this.netGc = netGc;
		this.bunkerFwDep = bunkerFwDep;
		this.tdrUser = tdrUser;
		this.robDoDep = robDoDep;
		this.nextPort = nextPort;
		this.tugArr = tugArr;
		this.nisDate = nisDate;
		this.updateTime = updateTime;
		this.displDep = displDep;
		this.grossWork = grossWork;
		this.bunkerFoArr = bunkerFoArr;
		this.ballastArr = ballastArr;
		this.grossGang = grossGang;
		this.bunkerDoDep = bunkerDoDep;
		this.etaCanal = etaCanal;
		this.displArr = displArr;
		this.bunkerFwArr = bunkerFwArr;
		this.sulphurFoArr = sulphurFoArr;
		this.commence = commence;
		this.anchorDep = anchorDep;
		this.netGang = netGang;
		this.hatch = hatch;
		this.ballastDep = ballastDep;
		this.updateUser = updateUser;
		this.mvs = mvs;
		this.bunkerDoArr = bunkerDoArr;
		this.robFoDep = robFoDep;
		this.grossGc = grossGc;
		this.bunkerFoDep = bunkerFoDep;
		this.supplySulphurDo = supplySulphurDo;
		this.pilotArr = pilotArr;
		this.pilotDep = pilotDep;
		this.netWork = netWork;
		this.updateSys = updateSys;
		this.draftAftDep = draftAftDep;
		this.ibflag = ibflag;
		this.callInd = callInd;
		this.tugDep = tugDep;
		this.nextCanalDt = nextCanalDt;
		this.complete = complete;
		this.netTml = netTml;
		this.nextCanal = nextCanal;
		this.gmDep = gmDep;
		this.dirCd = dirCd;
		this.portCd = portCd;
		this.draftFwdDep = draftFwdDep;
		this.voyNo = voyNo;
		this.tdrDate = tdrDate;
		this.robFwArr = robFwArr;
		this.sulphurFoDep = sulphurFoDep;
		this.robDoArr = robDoArr;
		this.unberth = unberth;
		this.draftFwdArr = draftFwdArr;
		this.nextPortDt = nextPortDt;
		this.loseHr = loseHr;
		this.robFoArr = robFoArr;
		this.gmArr = gmArr;
		this.dwtArr = dwtArr;
		this.sulphurDoArr = sulphurDoArr;
		this.robFwDep = robFwDep;
		this.plnCrnNo = plnCrnNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("con", getCon());
		this.hashColumns.put("eta", getEta());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("berth", getBerth());
		this.hashColumns.put("sulphur_do_dep", getSulphurDoDep());
		this.hashColumns.put("dwt_dep", getDwtDep());
		this.hashColumns.put("remark", getRemark());
		this.hashColumns.put("draft_aft_arr", getDraftAftArr());
		this.hashColumns.put("anchor_arr", getAnchorArr());
		this.hashColumns.put("supply_sulphur_fo", getSupplySulphurFo());
		this.hashColumns.put("tml_cd", getTmlCd());
		this.hashColumns.put("info", getInfo());
		this.hashColumns.put("gross_tml", getGrossTml());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("net_gc", getNetGc());
		this.hashColumns.put("bunker_fw_dep", getBunkerFwDep());
		this.hashColumns.put("tdr_user", getTdrUser());
		this.hashColumns.put("rob_do_dep", getRobDoDep());
		this.hashColumns.put("next_port", getNextPort());
		this.hashColumns.put("tug_arr", getTugArr());
		this.hashColumns.put("nis_date", getNisDate());
		this.hashColumns.put("update_time", getUpdateTime());
		this.hashColumns.put("displ_dep", getDisplDep());
		this.hashColumns.put("gross_work", getGrossWork());
		this.hashColumns.put("bunker_fo_arr", getBunkerFoArr());
		this.hashColumns.put("ballast_arr", getBallastArr());
		this.hashColumns.put("gross_gang", getGrossGang());
		this.hashColumns.put("bunker_do_dep", getBunkerDoDep());
		this.hashColumns.put("eta_canal", getEtaCanal());
		this.hashColumns.put("displ_arr", getDisplArr());
		this.hashColumns.put("bunker_fw_arr", getBunkerFwArr());
		this.hashColumns.put("sulphur_fo_arr", getSulphurFoArr());
		this.hashColumns.put("commence", getCommence());
		this.hashColumns.put("anchor_dep", getAnchorDep());
		this.hashColumns.put("net_gang", getNetGang());
		this.hashColumns.put("hatch", getHatch());
		this.hashColumns.put("ballast_dep", getBallastDep());
		this.hashColumns.put("update_user", getUpdateUser());
		this.hashColumns.put("mvs", getMvs());
		this.hashColumns.put("bunker_do_arr", getBunkerDoArr());
		this.hashColumns.put("rob_fo_dep", getRobFoDep());
		this.hashColumns.put("gross_gc", getGrossGc());
		this.hashColumns.put("bunker_fo_dep", getBunkerFoDep());
		this.hashColumns.put("supply_sulphur_do", getSupplySulphurDo());
		this.hashColumns.put("pilot_arr", getPilotArr());
		this.hashColumns.put("pilot_dep", getPilotDep());
		this.hashColumns.put("net_work", getNetWork());
		this.hashColumns.put("update_sys", getUpdateSys());
		this.hashColumns.put("draft_aft_dep", getDraftAftDep());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("call_ind", getCallInd());
		this.hashColumns.put("tug_dep", getTugDep());
		this.hashColumns.put("next_canal_dt", getNextCanalDt());
		this.hashColumns.put("complete", getComplete());
		this.hashColumns.put("net_tml", getNetTml());
		this.hashColumns.put("next_canal", getNextCanal());
		this.hashColumns.put("gm_dep", getGmDep());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("draft_fwd_dep", getDraftFwdDep());
		this.hashColumns.put("voy_no", getVoyNo());
		this.hashColumns.put("tdr_date", getTdrDate());
		this.hashColumns.put("rob_fw_arr", getRobFwArr());
		this.hashColumns.put("sulphur_fo_dep", getSulphurFoDep());
		this.hashColumns.put("rob_do_arr", getRobDoArr());
		this.hashColumns.put("unberth", getUnberth());
		this.hashColumns.put("draft_fwd_arr", getDraftFwdArr());
		this.hashColumns.put("next_port_dt", getNextPortDt());
		this.hashColumns.put("lose_hr", getLoseHr());
		this.hashColumns.put("rob_fo_arr", getRobFoArr());
		this.hashColumns.put("gm_arr", getGmArr());
		this.hashColumns.put("dwt_arr", getDwtArr());
		this.hashColumns.put("sulphur_do_arr", getSulphurDoArr());
		this.hashColumns.put("rob_fw_dep", getRobFwDep());
		this.hashColumns.put("pln_crn_no", getPlnCrnNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("con", "con");
		this.hashFields.put("eta", "eta");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("berth", "berth");
		this.hashFields.put("sulphur_do_dep", "sulphurDoDep");
		this.hashFields.put("dwt_dep", "dwtDep");
		this.hashFields.put("remark", "remark");
		this.hashFields.put("draft_aft_arr", "draftAftArr");
		this.hashFields.put("anchor_arr", "anchorArr");
		this.hashFields.put("supply_sulphur_fo", "supplySulphurFo");
		this.hashFields.put("tml_cd", "tmlCd");
		this.hashFields.put("info", "info");
		this.hashFields.put("gross_tml", "grossTml");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("net_gc", "netGc");
		this.hashFields.put("bunker_fw_dep", "bunkerFwDep");
		this.hashFields.put("tdr_user", "tdrUser");
		this.hashFields.put("rob_do_dep", "robDoDep");
		this.hashFields.put("next_port", "nextPort");
		this.hashFields.put("tug_arr", "tugArr");
		this.hashFields.put("nis_date", "nisDate");
		this.hashFields.put("update_time", "updateTime");
		this.hashFields.put("displ_dep", "displDep");
		this.hashFields.put("gross_work", "grossWork");
		this.hashFields.put("bunker_fo_arr", "bunkerFoArr");
		this.hashFields.put("ballast_arr", "ballastArr");
		this.hashFields.put("gross_gang", "grossGang");
		this.hashFields.put("bunker_do_dep", "bunkerDoDep");
		this.hashFields.put("eta_canal", "etaCanal");
		this.hashFields.put("displ_arr", "displArr");
		this.hashFields.put("bunker_fw_arr", "bunkerFwArr");
		this.hashFields.put("sulphur_fo_arr", "sulphurFoArr");
		this.hashFields.put("commence", "commence");
		this.hashFields.put("anchor_dep", "anchorDep");
		this.hashFields.put("net_gang", "netGang");
		this.hashFields.put("hatch", "hatch");
		this.hashFields.put("ballast_dep", "ballastDep");
		this.hashFields.put("update_user", "updateUser");
		this.hashFields.put("mvs", "mvs");
		this.hashFields.put("bunker_do_arr", "bunkerDoArr");
		this.hashFields.put("rob_fo_dep", "robFoDep");
		this.hashFields.put("gross_gc", "grossGc");
		this.hashFields.put("bunker_fo_dep", "bunkerFoDep");
		this.hashFields.put("supply_sulphur_do", "supplySulphurDo");
		this.hashFields.put("pilot_arr", "pilotArr");
		this.hashFields.put("pilot_dep", "pilotDep");
		this.hashFields.put("net_work", "netWork");
		this.hashFields.put("update_sys", "updateSys");
		this.hashFields.put("draft_aft_dep", "draftAftDep");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("call_ind", "callInd");
		this.hashFields.put("tug_dep", "tugDep");
		this.hashFields.put("next_canal_dt", "nextCanalDt");
		this.hashFields.put("complete", "complete");
		this.hashFields.put("net_tml", "netTml");
		this.hashFields.put("next_canal", "nextCanal");
		this.hashFields.put("gm_dep", "gmDep");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("draft_fwd_dep", "draftFwdDep");
		this.hashFields.put("voy_no", "voyNo");
		this.hashFields.put("tdr_date", "tdrDate");
		this.hashFields.put("rob_fw_arr", "robFwArr");
		this.hashFields.put("sulphur_fo_dep", "sulphurFoDep");
		this.hashFields.put("rob_do_arr", "robDoArr");
		this.hashFields.put("unberth", "unberth");
		this.hashFields.put("draft_fwd_arr", "draftFwdArr");
		this.hashFields.put("next_port_dt", "nextPortDt");
		this.hashFields.put("lose_hr", "loseHr");
		this.hashFields.put("rob_fo_arr", "robFoArr");
		this.hashFields.put("gm_arr", "gmArr");
		this.hashFields.put("dwt_arr", "dwtArr");
		this.hashFields.put("sulphur_do_arr", "sulphurDoArr");
		this.hashFields.put("rob_fw_dep", "robFwDep");
		this.hashFields.put("pln_crn_no", "plnCrnNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return con
	 */
	public String getCon() {
		return this.con;
	}
	
	/**
	 * Column Info
	 * @return eta
	 */
	public String getEta() {
		return this.eta;
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
	 * @return berth
	 */
	public String getBerth() {
		return this.berth;
	}
	
	/**
	 * Column Info
	 * @return sulphurDoDep
	 */
	public String getSulphurDoDep() {
		return this.sulphurDoDep;
	}
	
	/**
	 * Column Info
	 * @return dwtDep
	 */
	public String getDwtDep() {
		return this.dwtDep;
	}
	
	/**
	 * Column Info
	 * @return remark
	 */
	public String getRemark() {
		return this.remark;
	}
	
	/**
	 * Column Info
	 * @return draftAftArr
	 */
	public String getDraftAftArr() {
		return this.draftAftArr;
	}
	
	/**
	 * Column Info
	 * @return anchorArr
	 */
	public String getAnchorArr() {
		return this.anchorArr;
	}
	
	/**
	 * Column Info
	 * @return supplySulphurFo
	 */
	public String getSupplySulphurFo() {
		return this.supplySulphurFo;
	}
	
	/**
	 * Column Info
	 * @return tmlCd
	 */
	public String getTmlCd() {
		return this.tmlCd;
	}
	
	/**
	 * Column Info
	 * @return info
	 */
	public String getInfo() {
		return this.info;
	}
	
	/**
	 * Column Info
	 * @return grossTml
	 */
	public String getGrossTml() {
		return this.grossTml;
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
	 * @return netGc
	 */
	public String getNetGc() {
		return this.netGc;
	}
	
	/**
	 * Column Info
	 * @return bunkerFwDep
	 */
	public String getBunkerFwDep() {
		return this.bunkerFwDep;
	}
	
	/**
	 * Column Info
	 * @return tdrUser
	 */
	public String getTdrUser() {
		return this.tdrUser;
	}
	
	/**
	 * Column Info
	 * @return robDoDep
	 */
	public String getRobDoDep() {
		return this.robDoDep;
	}
	
	/**
	 * Column Info
	 * @return nextPort
	 */
	public String getNextPort() {
		return this.nextPort;
	}
	
	/**
	 * Column Info
	 * @return tugArr
	 */
	public String getTugArr() {
		return this.tugArr;
	}
	
	/**
	 * Column Info
	 * @return nisDate
	 */
	public String getNisDate() {
		return this.nisDate;
	}
	
	/**
	 * Column Info
	 * @return updateTime
	 */
	public String getUpdateTime() {
		return this.updateTime;
	}
	
	/**
	 * Column Info
	 * @return displDep
	 */
	public String getDisplDep() {
		return this.displDep;
	}
	
	/**
	 * Column Info
	 * @return grossWork
	 */
	public String getGrossWork() {
		return this.grossWork;
	}
	
	/**
	 * Column Info
	 * @return bunkerFoArr
	 */
	public String getBunkerFoArr() {
		return this.bunkerFoArr;
	}
	
	/**
	 * Column Info
	 * @return ballastArr
	 */
	public String getBallastArr() {
		return this.ballastArr;
	}
	
	/**
	 * Column Info
	 * @return grossGang
	 */
	public String getGrossGang() {
		return this.grossGang;
	}
	
	/**
	 * Column Info
	 * @return bunkerDoDep
	 */
	public String getBunkerDoDep() {
		return this.bunkerDoDep;
	}
	
	/**
	 * Column Info
	 * @return etaCanal
	 */
	public String getEtaCanal() {
		return this.etaCanal;
	}
	
	/**
	 * Column Info
	 * @return displArr
	 */
	public String getDisplArr() {
		return this.displArr;
	}
	
	/**
	 * Column Info
	 * @return bunkerFwArr
	 */
	public String getBunkerFwArr() {
		return this.bunkerFwArr;
	}
	
	/**
	 * Column Info
	 * @return sulphurFoArr
	 */
	public String getSulphurFoArr() {
		return this.sulphurFoArr;
	}
	
	/**
	 * Column Info
	 * @return commence
	 */
	public String getCommence() {
		return this.commence;
	}
	
	/**
	 * Column Info
	 * @return anchorDep
	 */
	public String getAnchorDep() {
		return this.anchorDep;
	}
	
	/**
	 * Column Info
	 * @return netGang
	 */
	public String getNetGang() {
		return this.netGang;
	}
	
	/**
	 * Column Info
	 * @return hatch
	 */
	public String getHatch() {
		return this.hatch;
	}
	
	/**
	 * Column Info
	 * @return ballastDep
	 */
	public String getBallastDep() {
		return this.ballastDep;
	}
	
	/**
	 * Column Info
	 * @return updateUser
	 */
	public String getUpdateUser() {
		return this.updateUser;
	}
	
	/**
	 * Column Info
	 * @return mvs
	 */
	public String getMvs() {
		return this.mvs;
	}
	
	/**
	 * Column Info
	 * @return bunkerDoArr
	 */
	public String getBunkerDoArr() {
		return this.bunkerDoArr;
	}
	
	/**
	 * Column Info
	 * @return robFoDep
	 */
	public String getRobFoDep() {
		return this.robFoDep;
	}
	
	/**
	 * Column Info
	 * @return grossGc
	 */
	public String getGrossGc() {
		return this.grossGc;
	}
	
	/**
	 * Column Info
	 * @return bunkerFoDep
	 */
	public String getBunkerFoDep() {
		return this.bunkerFoDep;
	}
	
	/**
	 * Column Info
	 * @return supplySulphurDo
	 */
	public String getSupplySulphurDo() {
		return this.supplySulphurDo;
	}
	
	/**
	 * Column Info
	 * @return pilotArr
	 */
	public String getPilotArr() {
		return this.pilotArr;
	}
	
	/**
	 * Column Info
	 * @return pilotDep
	 */
	public String getPilotDep() {
		return this.pilotDep;
	}
	
	/**
	 * Column Info
	 * @return netWork
	 */
	public String getNetWork() {
		return this.netWork;
	}
	
	/**
	 * Column Info
	 * @return updateSys
	 */
	public String getUpdateSys() {
		return this.updateSys;
	}
	
	/**
	 * Column Info
	 * @return draftAftDep
	 */
	public String getDraftAftDep() {
		return this.draftAftDep;
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
	 * @return callInd
	 */
	public String getCallInd() {
		return this.callInd;
	}
	
	/**
	 * Column Info
	 * @return tugDep
	 */
	public String getTugDep() {
		return this.tugDep;
	}
	
	/**
	 * Column Info
	 * @return nextCanalDt
	 */
	public String getNextCanalDt() {
		return this.nextCanalDt;
	}
	
	/**
	 * Column Info
	 * @return complete
	 */
	public String getComplete() {
		return this.complete;
	}
	
	/**
	 * Column Info
	 * @return netTml
	 */
	public String getNetTml() {
		return this.netTml;
	}
	
	/**
	 * Column Info
	 * @return nextCanal
	 */
	public String getNextCanal() {
		return this.nextCanal;
	}
	
	/**
	 * Column Info
	 * @return gmDep
	 */
	public String getGmDep() {
		return this.gmDep;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
	}
	
	/**
	 * Column Info
	 * @return draftFwdDep
	 */
	public String getDraftFwdDep() {
		return this.draftFwdDep;
	}
	
	/**
	 * Column Info
	 * @return voyNo
	 */
	public String getVoyNo() {
		return this.voyNo;
	}
	
	/**
	 * Column Info
	 * @return tdrDate
	 */
	public String getTdrDate() {
		return this.tdrDate;
	}
	
	/**
	 * Column Info
	 * @return robFwArr
	 */
	public String getRobFwArr() {
		return this.robFwArr;
	}
	
	/**
	 * Column Info
	 * @return sulphurFoDep
	 */
	public String getSulphurFoDep() {
		return this.sulphurFoDep;
	}
	
	/**
	 * Column Info
	 * @return robDoArr
	 */
	public String getRobDoArr() {
		return this.robDoArr;
	}
	
	/**
	 * Column Info
	 * @return unberth
	 */
	public String getUnberth() {
		return this.unberth;
	}
	
	/**
	 * Column Info
	 * @return draftFwdArr
	 */
	public String getDraftFwdArr() {
		return this.draftFwdArr;
	}
	
	/**
	 * Column Info
	 * @return nextPortDt
	 */
	public String getNextPortDt() {
		return this.nextPortDt;
	}
	
	/**
	 * Column Info
	 * @return loseHr
	 */
	public String getLoseHr() {
		return this.loseHr;
	}
	
	/**
	 * Column Info
	 * @return robFoArr
	 */
	public String getRobFoArr() {
		return this.robFoArr;
	}
	
	/**
	 * Column Info
	 * @return gmArr
	 */
	public String getGmArr() {
		return this.gmArr;
	}
	
	/**
	 * Column Info
	 * @return dwtArr
	 */
	public String getDwtArr() {
		return this.dwtArr;
	}
	
	/**
	 * Column Info
	 * @return sulphurDoArr
	 */
	public String getSulphurDoArr() {
		return this.sulphurDoArr;
	}
	
	/**
	 * Column Info
	 * @return robFwDep
	 */
	public String getRobFwDep() {
		return this.robFwDep;
	}
	
	/**
	 * Column Info
	 * @return plnCrnNo
	 */
	public String getPlnCrnNo() {
		return this.plnCrnNo;
	}
	
	/**
	 * Column Info
	 * @param con
	 */
	public void setCon(String con) {
		this.con = con;
	}
	
	/**
	 * Column Info
	 * @param eta
	 */
	public void setEta(String eta) {
		this.eta = eta;
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
	 * @param berth
	 */
	public void setBerth(String berth) {
		this.berth = berth;
	}
	
	/**
	 * Column Info
	 * @param sulphurDoDep
	 */
	public void setSulphurDoDep(String sulphurDoDep) {
		this.sulphurDoDep = sulphurDoDep;
	}
	
	/**
	 * Column Info
	 * @param dwtDep
	 */
	public void setDwtDep(String dwtDep) {
		this.dwtDep = dwtDep;
	}
	
	/**
	 * Column Info
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * Column Info
	 * @param draftAftArr
	 */
	public void setDraftAftArr(String draftAftArr) {
		this.draftAftArr = draftAftArr;
	}
	
	/**
	 * Column Info
	 * @param anchorArr
	 */
	public void setAnchorArr(String anchorArr) {
		this.anchorArr = anchorArr;
	}
	
	/**
	 * Column Info
	 * @param supplySulphurFo
	 */
	public void setSupplySulphurFo(String supplySulphurFo) {
		this.supplySulphurFo = supplySulphurFo;
	}
	
	/**
	 * Column Info
	 * @param tmlCd
	 */
	public void setTmlCd(String tmlCd) {
		this.tmlCd = tmlCd;
	}
	
	/**
	 * Column Info
	 * @param info
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
	/**
	 * Column Info
	 * @param grossTml
	 */
	public void setGrossTml(String grossTml) {
		this.grossTml = grossTml;
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
	 * @param netGc
	 */
	public void setNetGc(String netGc) {
		this.netGc = netGc;
	}
	
	/**
	 * Column Info
	 * @param bunkerFwDep
	 */
	public void setBunkerFwDep(String bunkerFwDep) {
		this.bunkerFwDep = bunkerFwDep;
	}
	
	/**
	 * Column Info
	 * @param tdrUser
	 */
	public void setTdrUser(String tdrUser) {
		this.tdrUser = tdrUser;
	}
	
	/**
	 * Column Info
	 * @param robDoDep
	 */
	public void setRobDoDep(String robDoDep) {
		this.robDoDep = robDoDep;
	}
	
	/**
	 * Column Info
	 * @param nextPort
	 */
	public void setNextPort(String nextPort) {
		this.nextPort = nextPort;
	}
	
	/**
	 * Column Info
	 * @param tugArr
	 */
	public void setTugArr(String tugArr) {
		this.tugArr = tugArr;
	}
	
	/**
	 * Column Info
	 * @param nisDate
	 */
	public void setNisDate(String nisDate) {
		this.nisDate = nisDate;
	}
	
	/**
	 * Column Info
	 * @param updateTime
	 */
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
	/**
	 * Column Info
	 * @param displDep
	 */
	public void setDisplDep(String displDep) {
		this.displDep = displDep;
	}
	
	/**
	 * Column Info
	 * @param grossWork
	 */
	public void setGrossWork(String grossWork) {
		this.grossWork = grossWork;
	}
	
	/**
	 * Column Info
	 * @param bunkerFoArr
	 */
	public void setBunkerFoArr(String bunkerFoArr) {
		this.bunkerFoArr = bunkerFoArr;
	}
	
	/**
	 * Column Info
	 * @param ballastArr
	 */
	public void setBallastArr(String ballastArr) {
		this.ballastArr = ballastArr;
	}
	
	/**
	 * Column Info
	 * @param grossGang
	 */
	public void setGrossGang(String grossGang) {
		this.grossGang = grossGang;
	}
	
	/**
	 * Column Info
	 * @param bunkerDoDep
	 */
	public void setBunkerDoDep(String bunkerDoDep) {
		this.bunkerDoDep = bunkerDoDep;
	}
	
	/**
	 * Column Info
	 * @param etaCanal
	 */
	public void setEtaCanal(String etaCanal) {
		this.etaCanal = etaCanal;
	}
	
	/**
	 * Column Info
	 * @param displArr
	 */
	public void setDisplArr(String displArr) {
		this.displArr = displArr;
	}
	
	/**
	 * Column Info
	 * @param bunkerFwArr
	 */
	public void setBunkerFwArr(String bunkerFwArr) {
		this.bunkerFwArr = bunkerFwArr;
	}
	
	/**
	 * Column Info
	 * @param sulphurFoArr
	 */
	public void setSulphurFoArr(String sulphurFoArr) {
		this.sulphurFoArr = sulphurFoArr;
	}
	
	/**
	 * Column Info
	 * @param commence
	 */
	public void setCommence(String commence) {
		this.commence = commence;
	}
	
	/**
	 * Column Info
	 * @param anchorDep
	 */
	public void setAnchorDep(String anchorDep) {
		this.anchorDep = anchorDep;
	}
	
	/**
	 * Column Info
	 * @param netGang
	 */
	public void setNetGang(String netGang) {
		this.netGang = netGang;
	}
	
	/**
	 * Column Info
	 * @param hatch
	 */
	public void setHatch(String hatch) {
		this.hatch = hatch;
	}
	
	/**
	 * Column Info
	 * @param ballastDep
	 */
	public void setBallastDep(String ballastDep) {
		this.ballastDep = ballastDep;
	}
	
	/**
	 * Column Info
	 * @param updateUser
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	/**
	 * Column Info
	 * @param mvs
	 */
	public void setMvs(String mvs) {
		this.mvs = mvs;
	}
	
	/**
	 * Column Info
	 * @param bunkerDoArr
	 */
	public void setBunkerDoArr(String bunkerDoArr) {
		this.bunkerDoArr = bunkerDoArr;
	}
	
	/**
	 * Column Info
	 * @param robFoDep
	 */
	public void setRobFoDep(String robFoDep) {
		this.robFoDep = robFoDep;
	}
	
	/**
	 * Column Info
	 * @param grossGc
	 */
	public void setGrossGc(String grossGc) {
		this.grossGc = grossGc;
	}
	
	/**
	 * Column Info
	 * @param bunkerFoDep
	 */
	public void setBunkerFoDep(String bunkerFoDep) {
		this.bunkerFoDep = bunkerFoDep;
	}
	
	/**
	 * Column Info
	 * @param supplySulphurDo
	 */
	public void setSupplySulphurDo(String supplySulphurDo) {
		this.supplySulphurDo = supplySulphurDo;
	}
	
	/**
	 * Column Info
	 * @param pilotArr
	 */
	public void setPilotArr(String pilotArr) {
		this.pilotArr = pilotArr;
	}
	
	/**
	 * Column Info
	 * @param pilotDep
	 */
	public void setPilotDep(String pilotDep) {
		this.pilotDep = pilotDep;
	}
	
	/**
	 * Column Info
	 * @param netWork
	 */
	public void setNetWork(String netWork) {
		this.netWork = netWork;
	}
	
	/**
	 * Column Info
	 * @param updateSys
	 */
	public void setUpdateSys(String updateSys) {
		this.updateSys = updateSys;
	}
	
	/**
	 * Column Info
	 * @param draftAftDep
	 */
	public void setDraftAftDep(String draftAftDep) {
		this.draftAftDep = draftAftDep;
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
	 * @param callInd
	 */
	public void setCallInd(String callInd) {
		this.callInd = callInd;
	}
	
	/**
	 * Column Info
	 * @param tugDep
	 */
	public void setTugDep(String tugDep) {
		this.tugDep = tugDep;
	}
	
	/**
	 * Column Info
	 * @param nextCanalDt
	 */
	public void setNextCanalDt(String nextCanalDt) {
		this.nextCanalDt = nextCanalDt;
	}
	
	/**
	 * Column Info
	 * @param complete
	 */
	public void setComplete(String complete) {
		this.complete = complete;
	}
	
	/**
	 * Column Info
	 * @param netTml
	 */
	public void setNetTml(String netTml) {
		this.netTml = netTml;
	}
	
	/**
	 * Column Info
	 * @param nextCanal
	 */
	public void setNextCanal(String nextCanal) {
		this.nextCanal = nextCanal;
	}
	
	/**
	 * Column Info
	 * @param gmDep
	 */
	public void setGmDep(String gmDep) {
		this.gmDep = gmDep;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	/**
	 * Column Info
	 * @param draftFwdDep
	 */
	public void setDraftFwdDep(String draftFwdDep) {
		this.draftFwdDep = draftFwdDep;
	}
	
	/**
	 * Column Info
	 * @param voyNo
	 */
	public void setVoyNo(String voyNo) {
		this.voyNo = voyNo;
	}
	
	/**
	 * Column Info
	 * @param tdrDate
	 */
	public void setTdrDate(String tdrDate) {
		this.tdrDate = tdrDate;
	}
	
	/**
	 * Column Info
	 * @param robFwArr
	 */
	public void setRobFwArr(String robFwArr) {
		this.robFwArr = robFwArr;
	}
	
	/**
	 * Column Info
	 * @param sulphurFoDep
	 */
	public void setSulphurFoDep(String sulphurFoDep) {
		this.sulphurFoDep = sulphurFoDep;
	}
	
	/**
	 * Column Info
	 * @param robDoArr
	 */
	public void setRobDoArr(String robDoArr) {
		this.robDoArr = robDoArr;
	}
	
	/**
	 * Column Info
	 * @param unberth
	 */
	public void setUnberth(String unberth) {
		this.unberth = unberth;
	}
	
	/**
	 * Column Info
	 * @param draftFwdArr
	 */
	public void setDraftFwdArr(String draftFwdArr) {
		this.draftFwdArr = draftFwdArr;
	}
	
	/**
	 * Column Info
	 * @param nextPortDt
	 */
	public void setNextPortDt(String nextPortDt) {
		this.nextPortDt = nextPortDt;
	}
	
	/**
	 * Column Info
	 * @param loseHr
	 */
	public void setLoseHr(String loseHr) {
		this.loseHr = loseHr;
	}
	
	/**
	 * Column Info
	 * @param robFoArr
	 */
	public void setRobFoArr(String robFoArr) {
		this.robFoArr = robFoArr;
	}
	
	/**
	 * Column Info
	 * @param gmArr
	 */
	public void setGmArr(String gmArr) {
		this.gmArr = gmArr;
	}
	
	/**
	 * Column Info
	 * @param dwtArr
	 */
	public void setDwtArr(String dwtArr) {
		this.dwtArr = dwtArr;
	}
	
	/**
	 * Column Info
	 * @param sulphurDoArr
	 */
	public void setSulphurDoArr(String sulphurDoArr) {
		this.sulphurDoArr = sulphurDoArr;
	}
	
	/**
	 * Column Info
	 * @param robFwDep
	 */
	public void setRobFwDep(String robFwDep) {
		this.robFwDep = robFwDep;
	}
	
	/**
	 * Column Info
	 * @param plnCrnNo
	 */
	public void setPlnCrnNo(String plnCrnNo) {
		this.plnCrnNo = plnCrnNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCon(JSPUtil.getParameter(request, "con", ""));
		setEta(JSPUtil.getParameter(request, "eta", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setBerth(JSPUtil.getParameter(request, "berth", ""));
		setSulphurDoDep(JSPUtil.getParameter(request, "sulphur_do_dep", ""));
		setDwtDep(JSPUtil.getParameter(request, "dwt_dep", ""));
		setRemark(JSPUtil.getParameter(request, "remark", ""));
		setDraftAftArr(JSPUtil.getParameter(request, "draft_aft_arr", ""));
		setAnchorArr(JSPUtil.getParameter(request, "anchor_arr", ""));
		setSupplySulphurFo(JSPUtil.getParameter(request, "supply_sulphur_fo", ""));
		setTmlCd(JSPUtil.getParameter(request, "tml_cd", ""));
		setInfo(JSPUtil.getParameter(request, "info", ""));
		setGrossTml(JSPUtil.getParameter(request, "gross_tml", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setNetGc(JSPUtil.getParameter(request, "net_gc", ""));
		setBunkerFwDep(JSPUtil.getParameter(request, "bunker_fw_dep", ""));
		setTdrUser(JSPUtil.getParameter(request, "tdr_user", ""));
		setRobDoDep(JSPUtil.getParameter(request, "rob_do_dep", ""));
		setNextPort(JSPUtil.getParameter(request, "next_port", ""));
		setTugArr(JSPUtil.getParameter(request, "tug_arr", ""));
		setNisDate(JSPUtil.getParameter(request, "nis_date", ""));
		setUpdateTime(JSPUtil.getParameter(request, "update_time", ""));
		setDisplDep(JSPUtil.getParameter(request, "displ_dep", ""));
		setGrossWork(JSPUtil.getParameter(request, "gross_work", ""));
		setBunkerFoArr(JSPUtil.getParameter(request, "bunker_fo_arr", ""));
		setBallastArr(JSPUtil.getParameter(request, "ballast_arr", ""));
		setGrossGang(JSPUtil.getParameter(request, "gross_gang", ""));
		setBunkerDoDep(JSPUtil.getParameter(request, "bunker_do_dep", ""));
		setEtaCanal(JSPUtil.getParameter(request, "eta_canal", ""));
		setDisplArr(JSPUtil.getParameter(request, "displ_arr", ""));
		setBunkerFwArr(JSPUtil.getParameter(request, "bunker_fw_arr", ""));
		setSulphurFoArr(JSPUtil.getParameter(request, "sulphur_fo_arr", ""));
		setCommence(JSPUtil.getParameter(request, "commence", ""));
		setAnchorDep(JSPUtil.getParameter(request, "anchor_dep", ""));
		setNetGang(JSPUtil.getParameter(request, "net_gang", ""));
		setHatch(JSPUtil.getParameter(request, "hatch", ""));
		setBallastDep(JSPUtil.getParameter(request, "ballast_dep", ""));
		setUpdateUser(JSPUtil.getParameter(request, "update_user", ""));
		setMvs(JSPUtil.getParameter(request, "mvs", ""));
		setBunkerDoArr(JSPUtil.getParameter(request, "bunker_do_arr", ""));
		setRobFoDep(JSPUtil.getParameter(request, "rob_fo_dep", ""));
		setGrossGc(JSPUtil.getParameter(request, "gross_gc", ""));
		setBunkerFoDep(JSPUtil.getParameter(request, "bunker_fo_dep", ""));
		setSupplySulphurDo(JSPUtil.getParameter(request, "supply_sulphur_do", ""));
		setPilotArr(JSPUtil.getParameter(request, "pilot_arr", ""));
		setPilotDep(JSPUtil.getParameter(request, "pilot_dep", ""));
		setNetWork(JSPUtil.getParameter(request, "net_work", ""));
		setUpdateSys(JSPUtil.getParameter(request, "update_sys", ""));
		setDraftAftDep(JSPUtil.getParameter(request, "draft_aft_dep", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCallInd(JSPUtil.getParameter(request, "call_ind", ""));
		setTugDep(JSPUtil.getParameter(request, "tug_dep", ""));
		setNextCanalDt(JSPUtil.getParameter(request, "next_canal_dt", ""));
		setComplete(JSPUtil.getParameter(request, "complete", ""));
		setNetTml(JSPUtil.getParameter(request, "net_tml", ""));
		setNextCanal(JSPUtil.getParameter(request, "next_canal", ""));
		setGmDep(JSPUtil.getParameter(request, "gm_dep", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setDraftFwdDep(JSPUtil.getParameter(request, "draft_fwd_dep", ""));
		setVoyNo(JSPUtil.getParameter(request, "voy_no", ""));
		setTdrDate(JSPUtil.getParameter(request, "tdr_date", ""));
		setRobFwArr(JSPUtil.getParameter(request, "rob_fw_arr", ""));
		setSulphurFoDep(JSPUtil.getParameter(request, "sulphur_fo_dep", ""));
		setRobDoArr(JSPUtil.getParameter(request, "rob_do_arr", ""));
		setUnberth(JSPUtil.getParameter(request, "unberth", ""));
		setDraftFwdArr(JSPUtil.getParameter(request, "draft_fwd_arr", ""));
		setNextPortDt(JSPUtil.getParameter(request, "next_port_dt", ""));
		setLoseHr(JSPUtil.getParameter(request, "lose_hr", ""));
		setRobFoArr(JSPUtil.getParameter(request, "rob_fo_arr", ""));
		setGmArr(JSPUtil.getParameter(request, "gm_arr", ""));
		setDwtArr(JSPUtil.getParameter(request, "dwt_arr", ""));
		setSulphurDoArr(JSPUtil.getParameter(request, "sulphur_do_arr", ""));
		setRobFwDep(JSPUtil.getParameter(request, "rob_fw_dep", ""));
		setPlnCrnNo(JSPUtil.getParameter(request, "pln_crn_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TdrHeaderVO[]
	 */
	public TdrHeaderVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TdrHeaderVO[]
	 */
	public TdrHeaderVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TdrHeaderVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] con = (JSPUtil.getParameter(request, prefix	+ "con", length));
			String[] eta = (JSPUtil.getParameter(request, prefix	+ "eta", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] berth = (JSPUtil.getParameter(request, prefix	+ "berth", length));
			String[] sulphurDoDep = (JSPUtil.getParameter(request, prefix	+ "sulphur_do_dep", length));
			String[] dwtDep = (JSPUtil.getParameter(request, prefix	+ "dwt_dep", length));
			String[] remark = (JSPUtil.getParameter(request, prefix	+ "remark", length));
			String[] draftAftArr = (JSPUtil.getParameter(request, prefix	+ "draft_aft_arr", length));
			String[] anchorArr = (JSPUtil.getParameter(request, prefix	+ "anchor_arr", length));
			String[] supplySulphurFo = (JSPUtil.getParameter(request, prefix	+ "supply_sulphur_fo", length));
			String[] tmlCd = (JSPUtil.getParameter(request, prefix	+ "tml_cd", length));
			String[] info = (JSPUtil.getParameter(request, prefix	+ "info", length));
			String[] grossTml = (JSPUtil.getParameter(request, prefix	+ "gross_tml", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] netGc = (JSPUtil.getParameter(request, prefix	+ "net_gc", length));
			String[] bunkerFwDep = (JSPUtil.getParameter(request, prefix	+ "bunker_fw_dep", length));
			String[] tdrUser = (JSPUtil.getParameter(request, prefix	+ "tdr_user", length));
			String[] robDoDep = (JSPUtil.getParameter(request, prefix	+ "rob_do_dep", length));
			String[] nextPort = (JSPUtil.getParameter(request, prefix	+ "next_port", length));
			String[] tugArr = (JSPUtil.getParameter(request, prefix	+ "tug_arr", length));
			String[] nisDate = (JSPUtil.getParameter(request, prefix	+ "nis_date", length));
			String[] updateTime = (JSPUtil.getParameter(request, prefix	+ "update_time", length));
			String[] displDep = (JSPUtil.getParameter(request, prefix	+ "displ_dep", length));
			String[] grossWork = (JSPUtil.getParameter(request, prefix	+ "gross_work", length));
			String[] bunkerFoArr = (JSPUtil.getParameter(request, prefix	+ "bunker_fo_arr", length));
			String[] ballastArr = (JSPUtil.getParameter(request, prefix	+ "ballast_arr", length));
			String[] grossGang = (JSPUtil.getParameter(request, prefix	+ "gross_gang", length));
			String[] bunkerDoDep = (JSPUtil.getParameter(request, prefix	+ "bunker_do_dep", length));
			String[] etaCanal = (JSPUtil.getParameter(request, prefix	+ "eta_canal", length));
			String[] displArr = (JSPUtil.getParameter(request, prefix	+ "displ_arr", length));
			String[] bunkerFwArr = (JSPUtil.getParameter(request, prefix	+ "bunker_fw_arr", length));
			String[] sulphurFoArr = (JSPUtil.getParameter(request, prefix	+ "sulphur_fo_arr", length));
			String[] commence = (JSPUtil.getParameter(request, prefix	+ "commence", length));
			String[] anchorDep = (JSPUtil.getParameter(request, prefix	+ "anchor_dep", length));
			String[] netGang = (JSPUtil.getParameter(request, prefix	+ "net_gang", length));
			String[] hatch = (JSPUtil.getParameter(request, prefix	+ "hatch", length));
			String[] ballastDep = (JSPUtil.getParameter(request, prefix	+ "ballast_dep", length));
			String[] updateUser = (JSPUtil.getParameter(request, prefix	+ "update_user", length));
			String[] mvs = (JSPUtil.getParameter(request, prefix	+ "mvs", length));
			String[] bunkerDoArr = (JSPUtil.getParameter(request, prefix	+ "bunker_do_arr", length));
			String[] robFoDep = (JSPUtil.getParameter(request, prefix	+ "rob_fo_dep", length));
			String[] grossGc = (JSPUtil.getParameter(request, prefix	+ "gross_gc", length));
			String[] bunkerFoDep = (JSPUtil.getParameter(request, prefix	+ "bunker_fo_dep", length));
			String[] supplySulphurDo = (JSPUtil.getParameter(request, prefix	+ "supply_sulphur_do", length));
			String[] pilotArr = (JSPUtil.getParameter(request, prefix	+ "pilot_arr", length));
			String[] pilotDep = (JSPUtil.getParameter(request, prefix	+ "pilot_dep", length));
			String[] netWork = (JSPUtil.getParameter(request, prefix	+ "net_work", length));
			String[] updateSys = (JSPUtil.getParameter(request, prefix	+ "update_sys", length));
			String[] draftAftDep = (JSPUtil.getParameter(request, prefix	+ "draft_aft_dep", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] callInd = (JSPUtil.getParameter(request, prefix	+ "call_ind", length));
			String[] tugDep = (JSPUtil.getParameter(request, prefix	+ "tug_dep", length));
			String[] nextCanalDt = (JSPUtil.getParameter(request, prefix	+ "next_canal_dt", length));
			String[] complete = (JSPUtil.getParameter(request, prefix	+ "complete", length));
			String[] netTml = (JSPUtil.getParameter(request, prefix	+ "net_tml", length));
			String[] nextCanal = (JSPUtil.getParameter(request, prefix	+ "next_canal", length));
			String[] gmDep = (JSPUtil.getParameter(request, prefix	+ "gm_dep", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] draftFwdDep = (JSPUtil.getParameter(request, prefix	+ "draft_fwd_dep", length));
			String[] voyNo = (JSPUtil.getParameter(request, prefix	+ "voy_no", length));
			String[] tdrDate = (JSPUtil.getParameter(request, prefix	+ "tdr_date", length));
			String[] robFwArr = (JSPUtil.getParameter(request, prefix	+ "rob_fw_arr", length));
			String[] sulphurFoDep = (JSPUtil.getParameter(request, prefix	+ "sulphur_fo_dep", length));
			String[] robDoArr = (JSPUtil.getParameter(request, prefix	+ "rob_do_arr", length));
			String[] unberth = (JSPUtil.getParameter(request, prefix	+ "unberth", length));
			String[] draftFwdArr = (JSPUtil.getParameter(request, prefix	+ "draft_fwd_arr", length));
			String[] nextPortDt = (JSPUtil.getParameter(request, prefix	+ "next_port_dt", length));
			String[] loseHr = (JSPUtil.getParameter(request, prefix	+ "lose_hr", length));
			String[] robFoArr = (JSPUtil.getParameter(request, prefix	+ "rob_fo_arr", length));
			String[] gmArr = (JSPUtil.getParameter(request, prefix	+ "gm_arr", length));
			String[] dwtArr = (JSPUtil.getParameter(request, prefix	+ "dwt_arr", length));
			String[] sulphurDoArr = (JSPUtil.getParameter(request, prefix	+ "sulphur_do_arr", length));
			String[] robFwDep = (JSPUtil.getParameter(request, prefix	+ "rob_fw_dep", length));
			String[] plnCrnNo = (JSPUtil.getParameter(request, prefix	+ "pln_crn_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new TdrHeaderVO();
				if (con[i] != null)
					model.setCon(con[i]);
				if (eta[i] != null)
					model.setEta(eta[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (berth[i] != null)
					model.setBerth(berth[i]);
				if (sulphurDoDep[i] != null)
					model.setSulphurDoDep(sulphurDoDep[i]);
				if (dwtDep[i] != null)
					model.setDwtDep(dwtDep[i]);
				if (remark[i] != null)
					model.setRemark(remark[i]);
				if (draftAftArr[i] != null)
					model.setDraftAftArr(draftAftArr[i]);
				if (anchorArr[i] != null)
					model.setAnchorArr(anchorArr[i]);
				if (supplySulphurFo[i] != null)
					model.setSupplySulphurFo(supplySulphurFo[i]);
				if (tmlCd[i] != null)
					model.setTmlCd(tmlCd[i]);
				if (info[i] != null)
					model.setInfo(info[i]);
				if (grossTml[i] != null)
					model.setGrossTml(grossTml[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (netGc[i] != null)
					model.setNetGc(netGc[i]);
				if (bunkerFwDep[i] != null)
					model.setBunkerFwDep(bunkerFwDep[i]);
				if (tdrUser[i] != null)
					model.setTdrUser(tdrUser[i]);
				if (robDoDep[i] != null)
					model.setRobDoDep(robDoDep[i]);
				if (nextPort[i] != null)
					model.setNextPort(nextPort[i]);
				if (tugArr[i] != null)
					model.setTugArr(tugArr[i]);
				if (nisDate[i] != null)
					model.setNisDate(nisDate[i]);
				if (updateTime[i] != null)
					model.setUpdateTime(updateTime[i]);
				if (displDep[i] != null)
					model.setDisplDep(displDep[i]);
				if (grossWork[i] != null)
					model.setGrossWork(grossWork[i]);
				if (bunkerFoArr[i] != null)
					model.setBunkerFoArr(bunkerFoArr[i]);
				if (ballastArr[i] != null)
					model.setBallastArr(ballastArr[i]);
				if (grossGang[i] != null)
					model.setGrossGang(grossGang[i]);
				if (bunkerDoDep[i] != null)
					model.setBunkerDoDep(bunkerDoDep[i]);
				if (etaCanal[i] != null)
					model.setEtaCanal(etaCanal[i]);
				if (displArr[i] != null)
					model.setDisplArr(displArr[i]);
				if (bunkerFwArr[i] != null)
					model.setBunkerFwArr(bunkerFwArr[i]);
				if (sulphurFoArr[i] != null)
					model.setSulphurFoArr(sulphurFoArr[i]);
				if (commence[i] != null)
					model.setCommence(commence[i]);
				if (anchorDep[i] != null)
					model.setAnchorDep(anchorDep[i]);
				if (netGang[i] != null)
					model.setNetGang(netGang[i]);
				if (hatch[i] != null)
					model.setHatch(hatch[i]);
				if (ballastDep[i] != null)
					model.setBallastDep(ballastDep[i]);
				if (updateUser[i] != null)
					model.setUpdateUser(updateUser[i]);
				if (mvs[i] != null)
					model.setMvs(mvs[i]);
				if (bunkerDoArr[i] != null)
					model.setBunkerDoArr(bunkerDoArr[i]);
				if (robFoDep[i] != null)
					model.setRobFoDep(robFoDep[i]);
				if (grossGc[i] != null)
					model.setGrossGc(grossGc[i]);
				if (bunkerFoDep[i] != null)
					model.setBunkerFoDep(bunkerFoDep[i]);
				if (supplySulphurDo[i] != null)
					model.setSupplySulphurDo(supplySulphurDo[i]);
				if (pilotArr[i] != null)
					model.setPilotArr(pilotArr[i]);
				if (pilotDep[i] != null)
					model.setPilotDep(pilotDep[i]);
				if (netWork[i] != null)
					model.setNetWork(netWork[i]);
				if (updateSys[i] != null)
					model.setUpdateSys(updateSys[i]);
				if (draftAftDep[i] != null)
					model.setDraftAftDep(draftAftDep[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (callInd[i] != null)
					model.setCallInd(callInd[i]);
				if (tugDep[i] != null)
					model.setTugDep(tugDep[i]);
				if (nextCanalDt[i] != null)
					model.setNextCanalDt(nextCanalDt[i]);
				if (complete[i] != null)
					model.setComplete(complete[i]);
				if (netTml[i] != null)
					model.setNetTml(netTml[i]);
				if (nextCanal[i] != null)
					model.setNextCanal(nextCanal[i]);
				if (gmDep[i] != null)
					model.setGmDep(gmDep[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (draftFwdDep[i] != null)
					model.setDraftFwdDep(draftFwdDep[i]);
				if (voyNo[i] != null)
					model.setVoyNo(voyNo[i]);
				if (tdrDate[i] != null)
					model.setTdrDate(tdrDate[i]);
				if (robFwArr[i] != null)
					model.setRobFwArr(robFwArr[i]);
				if (sulphurFoDep[i] != null)
					model.setSulphurFoDep(sulphurFoDep[i]);
				if (robDoArr[i] != null)
					model.setRobDoArr(robDoArr[i]);
				if (unberth[i] != null)
					model.setUnberth(unberth[i]);
				if (draftFwdArr[i] != null)
					model.setDraftFwdArr(draftFwdArr[i]);
				if (nextPortDt[i] != null)
					model.setNextPortDt(nextPortDt[i]);
				if (loseHr[i] != null)
					model.setLoseHr(loseHr[i]);
				if (robFoArr[i] != null)
					model.setRobFoArr(robFoArr[i]);
				if (gmArr[i] != null)
					model.setGmArr(gmArr[i]);
				if (dwtArr[i] != null)
					model.setDwtArr(dwtArr[i]);
				if (sulphurDoArr[i] != null)
					model.setSulphurDoArr(sulphurDoArr[i]);
				if (robFwDep[i] != null)
					model.setRobFwDep(robFwDep[i]);
				if (plnCrnNo[i] != null)
					model.setPlnCrnNo(plnCrnNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTdrHeaderVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TdrHeaderVO[]
	 */
	public TdrHeaderVO[] getTdrHeaderVOs(){
		TdrHeaderVO[] vos = (TdrHeaderVO[])models.toArray(new TdrHeaderVO[models.size()]);
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
		this.con = this.con .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eta = this.eta .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.berth = this.berth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sulphurDoDep = this.sulphurDoDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwtDep = this.dwtDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.remark = this.remark .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.draftAftArr = this.draftAftArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anchorArr = this.anchorArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.supplySulphurFo = this.supplySulphurFo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlCd = this.tmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.info = this.info .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossTml = this.grossTml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netGc = this.netGc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bunkerFwDep = this.bunkerFwDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tdrUser = this.tdrUser .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.robDoDep = this.robDoDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nextPort = this.nextPort .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tugArr = this.tugArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nisDate = this.nisDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateTime = this.updateTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.displDep = this.displDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossWork = this.grossWork .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bunkerFoArr = this.bunkerFoArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ballastArr = this.ballastArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossGang = this.grossGang .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bunkerDoDep = this.bunkerDoDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaCanal = this.etaCanal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.displArr = this.displArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bunkerFwArr = this.bunkerFwArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sulphurFoArr = this.sulphurFoArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commence = this.commence .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anchorDep = this.anchorDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netGang = this.netGang .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hatch = this.hatch .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ballastDep = this.ballastDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateUser = this.updateUser .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvs = this.mvs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bunkerDoArr = this.bunkerDoArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.robFoDep = this.robFoDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossGc = this.grossGc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bunkerFoDep = this.bunkerFoDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.supplySulphurDo = this.supplySulphurDo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pilotArr = this.pilotArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pilotDep = this.pilotDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWork = this.netWork .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateSys = this.updateSys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.draftAftDep = this.draftAftDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callInd = this.callInd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tugDep = this.tugDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nextCanalDt = this.nextCanalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.complete = this.complete .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netTml = this.netTml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nextCanal = this.nextCanal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmDep = this.gmDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.draftFwdDep = this.draftFwdDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voyNo = this.voyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tdrDate = this.tdrDate .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.robFwArr = this.robFwArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sulphurFoDep = this.sulphurFoDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.robDoArr = this.robDoArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unberth = this.unberth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.draftFwdArr = this.draftFwdArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nextPortDt = this.nextPortDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loseHr = this.loseHr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.robFoArr = this.robFoArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gmArr = this.gmArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwtArr = this.dwtArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sulphurDoArr = this.sulphurDoArr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.robFwDep = this.robFwDep .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnCrnNo = this.plnCrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
