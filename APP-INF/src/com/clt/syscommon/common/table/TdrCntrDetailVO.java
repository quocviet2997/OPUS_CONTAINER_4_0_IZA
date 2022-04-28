/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TdrCntrDetailVO.java
*@FileTitle : TdrCntrDetailVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.20
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.20  
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

public class TdrCntrDetailVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TdrCntrDetailVO> models = new ArrayList<TdrCntrDetailVO>();
	
	/* Column Info */
	private String shiftType = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String remark = null;
	/* Column Info */
	private String psaClass = null;
	/* Column Info */
	private String por = null;
	/* Column Info */
	private String dmCode = null;
	/* Column Info */
	private String dmChk = null;
	/* Column Info */
	private String fpod = null;
	/* Column Info */
	private String codRsn = null;
	/* Column Info */
	private String party = null;
	/* Column Info */
	private String prePod = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String codChk = null;
	/* Column Info */
	private String pol = null;
	/* Column Info */
	private String pod = null;
	/* Column Info */
	private String dmh = null;
	/* Column Info */
	private String hcChk = null;
	/* Column Info */
	private String updateTime = null;
	/* Column Info */
	private String status = null;
	/* Column Info */
	private String dmb = null;
	/* Column Info */
	private String width = null;
	/* Column Info */
	private String grossWork = null;
	/* Column Info */
	private String delvCd = null;
	/* Column Info */
	private String grossGang = null;
	/* Column Info */
	private String pod2 = null;
	/* Column Info */
	private String commence = null;
	/* Column Info */
	private String rfChk = null;
	/* Column Info */
	private String pageNo = null;
	/* Column Info */
	private String netGang = null;
	/* Column Info */
	private String temp = null;
	/* Column Info */
	private String crane = null;
	/* Column Info */
	private String sztp = null;
	/* Column Info */
	private String updateUser = null;
	/* Column Info */
	private String dml = null;
	/* Column Info */
	private String position = null;
	/* Column Info */
	private String weight = null;
	/* Column Info */
	private String lostHr = null;
	/* Column Info */
	private String optionChk = null;
	/* Column Info */
	private String precell = null;
	/* Column Info */
	private String imdg = null;
	/* Column Info */
	private String netWork = null;
	/* Column Info */
	private String tempChk = null;
	/* Column Info */
	private String unno = null;
	/* Column Info */
	private String ovh = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String callInd = null;
	/* Column Info */
	private String complete = null;
	/* Column Info */
	private String cargoType = null;
	/* Column Info */
	private String length = null;
	/* Column Info */
	private String ovp = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String slot = null;
	/* Column Info */
	private String shiftChk = null;
	/* Column Info */
	private String ovs = null;
	/* Column Info */
	private String voyNo = null;
	/* Column Info */
	private String ova = null;
	/* Column Info */
	private String dgChk = null;
	/* Column Info */
	private String shiftRsn = null;
	/* Column Info */
	private String ovf = null;
	/* Column Info */
	private String cntrType = null;
	/* Column Info */
	private String mishandleChk = null;
	/* Column Info */
	private String unit = null;
	/* Column Info */
	private String cntrSize = null;
	/* Column Info */
	private String commodity = null;
	/* Column Info */
	private String oprCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String account = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TdrCntrDetailVO() {}

	public TdrCntrDetailVO(String ibflag, String pagerows, String vslCd, String voyNo, String dirCd, String portCd, String callInd, String status, String cntrNo, String cntrType, String cntrSize, String cargoType, String oprCd, String por, String pol, String pod, String pod2, String fpod, String position, String delvCd, String ovf, String ova, String ovp, String ovs, String ovh, String slot, String weight, String crane, String commence, String complete, String commodity, String grossWork, String netWork, String lostHr, String grossGang, String netGang, String length, String width, String rfChk, String dgChk, String hcChk, String mishandleChk, String dmChk, String shiftChk, String codChk, String tempChk, String optionChk, String temp, String imdg, String unno, String psaClass, String pageNo, String precell, String dmCode, String shiftRsn, String account, String party, String shiftType, String prePod, String codRsn, String remark, String sztp, String updateUser, String updateTime, String dml, String dmb, String dmh, String unit) {
		this.shiftType = shiftType;
		this.vslCd = vslCd;
		this.remark = remark;
		this.psaClass = psaClass;
		this.por = por;
		this.dmCode = dmCode;
		this.dmChk = dmChk;
		this.fpod = fpod;
		this.codRsn = codRsn;
		this.party = party;
		this.prePod = prePod;
		this.pagerows = pagerows;
		this.codChk = codChk;
		this.pol = pol;
		this.pod = pod;
		this.dmh = dmh;
		this.hcChk = hcChk;
		this.updateTime = updateTime;
		this.status = status;
		this.dmb = dmb;
		this.width = width;
		this.grossWork = grossWork;
		this.delvCd = delvCd;
		this.grossGang = grossGang;
		this.pod2 = pod2;
		this.commence = commence;
		this.rfChk = rfChk;
		this.pageNo = pageNo;
		this.netGang = netGang;
		this.temp = temp;
		this.crane = crane;
		this.sztp = sztp;
		this.updateUser = updateUser;
		this.dml = dml;
		this.position = position;
		this.weight = weight;
		this.lostHr = lostHr;
		this.optionChk = optionChk;
		this.precell = precell;
		this.imdg = imdg;
		this.netWork = netWork;
		this.tempChk = tempChk;
		this.unno = unno;
		this.ovh = ovh;
		this.ibflag = ibflag;
		this.callInd = callInd;
		this.complete = complete;
		this.cargoType = cargoType;
		this.length = length;
		this.ovp = ovp;
		this.dirCd = dirCd;
		this.portCd = portCd;
		this.slot = slot;
		this.shiftChk = shiftChk;
		this.ovs = ovs;
		this.voyNo = voyNo;
		this.ova = ova;
		this.dgChk = dgChk;
		this.shiftRsn = shiftRsn;
		this.ovf = ovf;
		this.cntrType = cntrType;
		this.mishandleChk = mishandleChk;
		this.unit = unit;
		this.cntrSize = cntrSize;
		this.commodity = commodity;
		this.oprCd = oprCd;
		this.cntrNo = cntrNo;
		this.account = account;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("shift_type", getShiftType());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("remark", getRemark());
		this.hashColumns.put("psa_class", getPsaClass());
		this.hashColumns.put("por", getPor());
		this.hashColumns.put("dm_code", getDmCode());
		this.hashColumns.put("dm_chk", getDmChk());
		this.hashColumns.put("fpod", getFpod());
		this.hashColumns.put("cod_rsn", getCodRsn());
		this.hashColumns.put("party", getParty());
		this.hashColumns.put("pre_pod", getPrePod());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cod_chk", getCodChk());
		this.hashColumns.put("pol", getPol());
		this.hashColumns.put("pod", getPod());
		this.hashColumns.put("dmh", getDmh());
		this.hashColumns.put("hc_chk", getHcChk());
		this.hashColumns.put("update_time", getUpdateTime());
		this.hashColumns.put("status", getStatus());
		this.hashColumns.put("dmb", getDmb());
		this.hashColumns.put("width", getWidth());
		this.hashColumns.put("gross_work", getGrossWork());
		this.hashColumns.put("delv_cd", getDelvCd());
		this.hashColumns.put("gross_gang", getGrossGang());
		this.hashColumns.put("pod2", getPod2());
		this.hashColumns.put("commence", getCommence());
		this.hashColumns.put("rf_chk", getRfChk());
		this.hashColumns.put("page_no", getPageNo());
		this.hashColumns.put("net_gang", getNetGang());
		this.hashColumns.put("temp", getTemp());
		this.hashColumns.put("crane", getCrane());
		this.hashColumns.put("sztp", getSztp());
		this.hashColumns.put("update_user", getUpdateUser());
		this.hashColumns.put("dml", getDml());
		this.hashColumns.put("position", getPosition());
		this.hashColumns.put("weight", getWeight());
		this.hashColumns.put("lost_hr", getLostHr());
		this.hashColumns.put("option_chk", getOptionChk());
		this.hashColumns.put("precell", getPrecell());
		this.hashColumns.put("imdg", getImdg());
		this.hashColumns.put("net_work", getNetWork());
		this.hashColumns.put("temp_chk", getTempChk());
		this.hashColumns.put("unno", getUnno());
		this.hashColumns.put("ovh", getOvh());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("call_ind", getCallInd());
		this.hashColumns.put("complete", getComplete());
		this.hashColumns.put("cargo_type", getCargoType());
		this.hashColumns.put("length", getLength());
		this.hashColumns.put("ovp", getOvp());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("slot", getSlot());
		this.hashColumns.put("shift_chk", getShiftChk());
		this.hashColumns.put("ovs", getOvs());
		this.hashColumns.put("voy_no", getVoyNo());
		this.hashColumns.put("ova", getOva());
		this.hashColumns.put("dg_chk", getDgChk());
		this.hashColumns.put("shift_rsn", getShiftRsn());
		this.hashColumns.put("ovf", getOvf());
		this.hashColumns.put("cntr_type", getCntrType());
		this.hashColumns.put("mishandle_chk", getMishandleChk());
		this.hashColumns.put("unit", getUnit());
		this.hashColumns.put("cntr_size", getCntrSize());
		this.hashColumns.put("commodity", getCommodity());
		this.hashColumns.put("opr_cd", getOprCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("account", getAccount());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("shift_type", "shiftType");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("remark", "remark");
		this.hashFields.put("psa_class", "psaClass");
		this.hashFields.put("por", "por");
		this.hashFields.put("dm_code", "dmCode");
		this.hashFields.put("dm_chk", "dmChk");
		this.hashFields.put("fpod", "fpod");
		this.hashFields.put("cod_rsn", "codRsn");
		this.hashFields.put("party", "party");
		this.hashFields.put("pre_pod", "prePod");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cod_chk", "codChk");
		this.hashFields.put("pol", "pol");
		this.hashFields.put("pod", "pod");
		this.hashFields.put("dmh", "dmh");
		this.hashFields.put("hc_chk", "hcChk");
		this.hashFields.put("update_time", "updateTime");
		this.hashFields.put("status", "status");
		this.hashFields.put("dmb", "dmb");
		this.hashFields.put("width", "width");
		this.hashFields.put("gross_work", "grossWork");
		this.hashFields.put("delv_cd", "delvCd");
		this.hashFields.put("gross_gang", "grossGang");
		this.hashFields.put("pod2", "pod2");
		this.hashFields.put("commence", "commence");
		this.hashFields.put("rf_chk", "rfChk");
		this.hashFields.put("page_no", "pageNo");
		this.hashFields.put("net_gang", "netGang");
		this.hashFields.put("temp", "temp");
		this.hashFields.put("crane", "crane");
		this.hashFields.put("sztp", "sztp");
		this.hashFields.put("update_user", "updateUser");
		this.hashFields.put("dml", "dml");
		this.hashFields.put("position", "position");
		this.hashFields.put("weight", "weight");
		this.hashFields.put("lost_hr", "lostHr");
		this.hashFields.put("option_chk", "optionChk");
		this.hashFields.put("precell", "precell");
		this.hashFields.put("imdg", "imdg");
		this.hashFields.put("net_work", "netWork");
		this.hashFields.put("temp_chk", "tempChk");
		this.hashFields.put("unno", "unno");
		this.hashFields.put("ovh", "ovh");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("call_ind", "callInd");
		this.hashFields.put("complete", "complete");
		this.hashFields.put("cargo_type", "cargoType");
		this.hashFields.put("length", "length");
		this.hashFields.put("ovp", "ovp");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("slot", "slot");
		this.hashFields.put("shift_chk", "shiftChk");
		this.hashFields.put("ovs", "ovs");
		this.hashFields.put("voy_no", "voyNo");
		this.hashFields.put("ova", "ova");
		this.hashFields.put("dg_chk", "dgChk");
		this.hashFields.put("shift_rsn", "shiftRsn");
		this.hashFields.put("ovf", "ovf");
		this.hashFields.put("cntr_type", "cntrType");
		this.hashFields.put("mishandle_chk", "mishandleChk");
		this.hashFields.put("unit", "unit");
		this.hashFields.put("cntr_size", "cntrSize");
		this.hashFields.put("commodity", "commodity");
		this.hashFields.put("opr_cd", "oprCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("account", "account");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return shiftType
	 */
	public String getShiftType() {
		return this.shiftType;
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
	 * @return remark
	 */
	public String getRemark() {
		return this.remark;
	}
	
	/**
	 * Column Info
	 * @return psaClass
	 */
	public String getPsaClass() {
		return this.psaClass;
	}
	
	/**
	 * Column Info
	 * @return por
	 */
	public String getPor() {
		return this.por;
	}
	
	/**
	 * Column Info
	 * @return dmCode
	 */
	public String getDmCode() {
		return this.dmCode;
	}
	
	/**
	 * Column Info
	 * @return dmChk
	 */
	public String getDmChk() {
		return this.dmChk;
	}
	
	/**
	 * Column Info
	 * @return fpod
	 */
	public String getFpod() {
		return this.fpod;
	}
	
	/**
	 * Column Info
	 * @return codRsn
	 */
	public String getCodRsn() {
		return this.codRsn;
	}
	
	/**
	 * Column Info
	 * @return party
	 */
	public String getParty() {
		return this.party;
	}
	
	/**
	 * Column Info
	 * @return prePod
	 */
	public String getPrePod() {
		return this.prePod;
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
	 * @return codChk
	 */
	public String getCodChk() {
		return this.codChk;
	}
	
	/**
	 * Column Info
	 * @return pol
	 */
	public String getPol() {
		return this.pol;
	}
	
	/**
	 * Column Info
	 * @return pod
	 */
	public String getPod() {
		return this.pod;
	}
	
	/**
	 * Column Info
	 * @return dmh
	 */
	public String getDmh() {
		return this.dmh;
	}
	
	/**
	 * Column Info
	 * @return hcChk
	 */
	public String getHcChk() {
		return this.hcChk;
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
	 * @return status
	 */
	public String getStatus() {
		return this.status;
	}
	
	/**
	 * Column Info
	 * @return dmb
	 */
	public String getDmb() {
		return this.dmb;
	}
	
	/**
	 * Column Info
	 * @return width
	 */
	public String getWidth() {
		return this.width;
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
	 * @return delvCd
	 */
	public String getDelvCd() {
		return this.delvCd;
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
	 * @return pod2
	 */
	public String getPod2() {
		return this.pod2;
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
	 * @return rfChk
	 */
	public String getRfChk() {
		return this.rfChk;
	}
	
	/**
	 * Column Info
	 * @return pageNo
	 */
	public String getPageNo() {
		return this.pageNo;
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
	 * @return temp
	 */
	public String getTemp() {
		return this.temp;
	}
	
	/**
	 * Column Info
	 * @return crane
	 */
	public String getCrane() {
		return this.crane;
	}
	
	/**
	 * Column Info
	 * @return sztp
	 */
	public String getSztp() {
		return this.sztp;
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
	 * @return dml
	 */
	public String getDml() {
		return this.dml;
	}
	
	/**
	 * Column Info
	 * @return position
	 */
	public String getPosition() {
		return this.position;
	}
	
	/**
	 * Column Info
	 * @return weight
	 */
	public String getWeight() {
		return this.weight;
	}
	
	/**
	 * Column Info
	 * @return lostHr
	 */
	public String getLostHr() {
		return this.lostHr;
	}
	
	/**
	 * Column Info
	 * @return optionChk
	 */
	public String getOptionChk() {
		return this.optionChk;
	}
	
	/**
	 * Column Info
	 * @return precell
	 */
	public String getPrecell() {
		return this.precell;
	}
	
	/**
	 * Column Info
	 * @return imdg
	 */
	public String getImdg() {
		return this.imdg;
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
	 * @return tempChk
	 */
	public String getTempChk() {
		return this.tempChk;
	}
	
	/**
	 * Column Info
	 * @return unno
	 */
	public String getUnno() {
		return this.unno;
	}
	
	/**
	 * Column Info
	 * @return ovh
	 */
	public String getOvh() {
		return this.ovh;
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
	 * @return complete
	 */
	public String getComplete() {
		return this.complete;
	}
	
	/**
	 * Column Info
	 * @return cargoType
	 */
	public String getCargoType() {
		return this.cargoType;
	}
	
	/**
	 * Column Info
	 * @return length
	 */
	public String getLength() {
		return this.length;
	}
	
	/**
	 * Column Info
	 * @return ovp
	 */
	public String getOvp() {
		return this.ovp;
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
	 * @return slot
	 */
	public String getSlot() {
		return this.slot;
	}
	
	/**
	 * Column Info
	 * @return shiftChk
	 */
	public String getShiftChk() {
		return this.shiftChk;
	}
	
	/**
	 * Column Info
	 * @return ovs
	 */
	public String getOvs() {
		return this.ovs;
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
	 * @return ova
	 */
	public String getOva() {
		return this.ova;
	}
	
	/**
	 * Column Info
	 * @return dgChk
	 */
	public String getDgChk() {
		return this.dgChk;
	}
	
	/**
	 * Column Info
	 * @return shiftRsn
	 */
	public String getShiftRsn() {
		return this.shiftRsn;
	}
	
	/**
	 * Column Info
	 * @return ovf
	 */
	public String getOvf() {
		return this.ovf;
	}
	
	/**
	 * Column Info
	 * @return cntrType
	 */
	public String getCntrType() {
		return this.cntrType;
	}
	
	/**
	 * Column Info
	 * @return mishandleChk
	 */
	public String getMishandleChk() {
		return this.mishandleChk;
	}
	
	/**
	 * Column Info
	 * @return unit
	 */
	public String getUnit() {
		return this.unit;
	}
	
	/**
	 * Column Info
	 * @return cntrSize
	 */
	public String getCntrSize() {
		return this.cntrSize;
	}
	
	/**
	 * Column Info
	 * @return commodity
	 */
	public String getCommodity() {
		return this.commodity;
	}
	
	/**
	 * Column Info
	 * @return oprCd
	 */
	public String getOprCd() {
		return this.oprCd;
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
	 * @return account
	 */
	public String getAccount() {
		return this.account;
	}
	

	/**
	 * Column Info
	 * @param shiftType
	 */
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
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
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/**
	 * Column Info
	 * @param psaClass
	 */
	public void setPsaClass(String psaClass) {
		this.psaClass = psaClass;
	}
	
	/**
	 * Column Info
	 * @param por
	 */
	public void setPor(String por) {
		this.por = por;
	}
	
	/**
	 * Column Info
	 * @param dmCode
	 */
	public void setDmCode(String dmCode) {
		this.dmCode = dmCode;
	}
	
	/**
	 * Column Info
	 * @param dmChk
	 */
	public void setDmChk(String dmChk) {
		this.dmChk = dmChk;
	}
	
	/**
	 * Column Info
	 * @param fpod
	 */
	public void setFpod(String fpod) {
		this.fpod = fpod;
	}
	
	/**
	 * Column Info
	 * @param codRsn
	 */
	public void setCodRsn(String codRsn) {
		this.codRsn = codRsn;
	}
	
	/**
	 * Column Info
	 * @param party
	 */
	public void setParty(String party) {
		this.party = party;
	}
	
	/**
	 * Column Info
	 * @param prePod
	 */
	public void setPrePod(String prePod) {
		this.prePod = prePod;
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
	 * @param codChk
	 */
	public void setCodChk(String codChk) {
		this.codChk = codChk;
	}
	
	/**
	 * Column Info
	 * @param pol
	 */
	public void setPol(String pol) {
		this.pol = pol;
	}
	
	/**
	 * Column Info
	 * @param pod
	 */
	public void setPod(String pod) {
		this.pod = pod;
	}
	
	/**
	 * Column Info
	 * @param dmh
	 */
	public void setDmh(String dmh) {
		this.dmh = dmh;
	}
	
	/**
	 * Column Info
	 * @param hcChk
	 */
	public void setHcChk(String hcChk) {
		this.hcChk = hcChk;
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
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * Column Info
	 * @param dmb
	 */
	public void setDmb(String dmb) {
		this.dmb = dmb;
	}
	
	/**
	 * Column Info
	 * @param width
	 */
	public void setWidth(String width) {
		this.width = width;
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
	 * @param delvCd
	 */
	public void setDelvCd(String delvCd) {
		this.delvCd = delvCd;
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
	 * @param pod2
	 */
	public void setPod2(String pod2) {
		this.pod2 = pod2;
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
	 * @param rfChk
	 */
	public void setRfChk(String rfChk) {
		this.rfChk = rfChk;
	}
	
	/**
	 * Column Info
	 * @param pageNo
	 */
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
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
	 * @param temp
	 */
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	/**
	 * Column Info
	 * @param crane
	 */
	public void setCrane(String crane) {
		this.crane = crane;
	}
	
	/**
	 * Column Info
	 * @param sztp
	 */
	public void setSztp(String sztp) {
		this.sztp = sztp;
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
	 * @param dml
	 */
	public void setDml(String dml) {
		this.dml = dml;
	}
	
	/**
	 * Column Info
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	
	/**
	 * Column Info
	 * @param weight
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	/**
	 * Column Info
	 * @param lostHr
	 */
	public void setLostHr(String lostHr) {
		this.lostHr = lostHr;
	}
	
	/**
	 * Column Info
	 * @param optionChk
	 */
	public void setOptionChk(String optionChk) {
		this.optionChk = optionChk;
	}
	
	/**
	 * Column Info
	 * @param precell
	 */
	public void setPrecell(String precell) {
		this.precell = precell;
	}
	
	/**
	 * Column Info
	 * @param imdg
	 */
	public void setImdg(String imdg) {
		this.imdg = imdg;
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
	 * @param tempChk
	 */
	public void setTempChk(String tempChk) {
		this.tempChk = tempChk;
	}
	
	/**
	 * Column Info
	 * @param unno
	 */
	public void setUnno(String unno) {
		this.unno = unno;
	}
	
	/**
	 * Column Info
	 * @param ovh
	 */
	public void setOvh(String ovh) {
		this.ovh = ovh;
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
	 * @param complete
	 */
	public void setComplete(String complete) {
		this.complete = complete;
	}
	
	/**
	 * Column Info
	 * @param cargoType
	 */
	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}
	
	/**
	 * Column Info
	 * @param length
	 */
	public void setLength(String length) {
		this.length = length;
	}
	
	/**
	 * Column Info
	 * @param ovp
	 */
	public void setOvp(String ovp) {
		this.ovp = ovp;
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
	 * @param slot
	 */
	public void setSlot(String slot) {
		this.slot = slot;
	}
	
	/**
	 * Column Info
	 * @param shiftChk
	 */
	public void setShiftChk(String shiftChk) {
		this.shiftChk = shiftChk;
	}
	
	/**
	 * Column Info
	 * @param ovs
	 */
	public void setOvs(String ovs) {
		this.ovs = ovs;
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
	 * @param ova
	 */
	public void setOva(String ova) {
		this.ova = ova;
	}
	
	/**
	 * Column Info
	 * @param dgChk
	 */
	public void setDgChk(String dgChk) {
		this.dgChk = dgChk;
	}
	
	/**
	 * Column Info
	 * @param shiftRsn
	 */
	public void setShiftRsn(String shiftRsn) {
		this.shiftRsn = shiftRsn;
	}
	
	/**
	 * Column Info
	 * @param ovf
	 */
	public void setOvf(String ovf) {
		this.ovf = ovf;
	}
	
	/**
	 * Column Info
	 * @param cntrType
	 */
	public void setCntrType(String cntrType) {
		this.cntrType = cntrType;
	}
	
	/**
	 * Column Info
	 * @param mishandleChk
	 */
	public void setMishandleChk(String mishandleChk) {
		this.mishandleChk = mishandleChk;
	}
	
	/**
	 * Column Info
	 * @param unit
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	/**
	 * Column Info
	 * @param cntrSize
	 */
	public void setCntrSize(String cntrSize) {
		this.cntrSize = cntrSize;
	}
	
	/**
	 * Column Info
	 * @param commodity
	 */
	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}
	
	/**
	 * Column Info
	 * @param oprCd
	 */
	public void setOprCd(String oprCd) {
		this.oprCd = oprCd;
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
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setShiftType(JSPUtil.getParameter(request, "shift_type", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setRemark(JSPUtil.getParameter(request, "remark", ""));
		setPsaClass(JSPUtil.getParameter(request, "psa_class", ""));
		setPor(JSPUtil.getParameter(request, "por", ""));
		setDmCode(JSPUtil.getParameter(request, "dm_code", ""));
		setDmChk(JSPUtil.getParameter(request, "dm_chk", ""));
		setFpod(JSPUtil.getParameter(request, "fpod", ""));
		setCodRsn(JSPUtil.getParameter(request, "cod_rsn", ""));
		setParty(JSPUtil.getParameter(request, "party", ""));
		setPrePod(JSPUtil.getParameter(request, "pre_pod", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCodChk(JSPUtil.getParameter(request, "cod_chk", ""));
		setPol(JSPUtil.getParameter(request, "pol", ""));
		setPod(JSPUtil.getParameter(request, "pod", ""));
		setDmh(JSPUtil.getParameter(request, "dmh", ""));
		setHcChk(JSPUtil.getParameter(request, "hc_chk", ""));
		setUpdateTime(JSPUtil.getParameter(request, "update_time", ""));
		setStatus(JSPUtil.getParameter(request, "status", ""));
		setDmb(JSPUtil.getParameter(request, "dmb", ""));
		setWidth(JSPUtil.getParameter(request, "width", ""));
		setGrossWork(JSPUtil.getParameter(request, "gross_work", ""));
		setDelvCd(JSPUtil.getParameter(request, "delv_cd", ""));
		setGrossGang(JSPUtil.getParameter(request, "gross_gang", ""));
		setPod2(JSPUtil.getParameter(request, "pod2", ""));
		setCommence(JSPUtil.getParameter(request, "commence", ""));
		setRfChk(JSPUtil.getParameter(request, "rf_chk", ""));
		setPageNo(JSPUtil.getParameter(request, "page_no", ""));
		setNetGang(JSPUtil.getParameter(request, "net_gang", ""));
		setTemp(JSPUtil.getParameter(request, "temp", ""));
		setCrane(JSPUtil.getParameter(request, "crane", ""));
		setSztp(JSPUtil.getParameter(request, "sztp", ""));
		setUpdateUser(JSPUtil.getParameter(request, "update_user", ""));
		setDml(JSPUtil.getParameter(request, "dml", ""));
		setPosition(JSPUtil.getParameter(request, "position", ""));
		setWeight(JSPUtil.getParameter(request, "weight", ""));
		setLostHr(JSPUtil.getParameter(request, "lost_hr", ""));
		setOptionChk(JSPUtil.getParameter(request, "option_chk", ""));
		setPrecell(JSPUtil.getParameter(request, "precell", ""));
		setImdg(JSPUtil.getParameter(request, "imdg", ""));
		setNetWork(JSPUtil.getParameter(request, "net_work", ""));
		setTempChk(JSPUtil.getParameter(request, "temp_chk", ""));
		setUnno(JSPUtil.getParameter(request, "unno", ""));
		setOvh(JSPUtil.getParameter(request, "ovh", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCallInd(JSPUtil.getParameter(request, "call_ind", ""));
		setComplete(JSPUtil.getParameter(request, "complete", ""));
		setCargoType(JSPUtil.getParameter(request, "cargo_type", ""));
		setLength(JSPUtil.getParameter(request, "length", ""));
		setOvp(JSPUtil.getParameter(request, "ovp", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setSlot(JSPUtil.getParameter(request, "slot", ""));
		setShiftChk(JSPUtil.getParameter(request, "shift_chk", ""));
		setOvs(JSPUtil.getParameter(request, "ovs", ""));
		setVoyNo(JSPUtil.getParameter(request, "voy_no", ""));
		setOva(JSPUtil.getParameter(request, "ova", ""));
		setDgChk(JSPUtil.getParameter(request, "dg_chk", ""));
		setShiftRsn(JSPUtil.getParameter(request, "shift_rsn", ""));
		setOvf(JSPUtil.getParameter(request, "ovf", ""));
		setCntrType(JSPUtil.getParameter(request, "cntr_type", ""));
		setMishandleChk(JSPUtil.getParameter(request, "mishandle_chk", ""));
		setUnit(JSPUtil.getParameter(request, "unit", ""));
		setCntrSize(JSPUtil.getParameter(request, "cntr_size", ""));
		setCommodity(JSPUtil.getParameter(request, "commodity", ""));
		setOprCd(JSPUtil.getParameter(request, "opr_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setAccount(JSPUtil.getParameter(request, "account", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TdrCntrDetailVO[]
	 */
	public TdrCntrDetailVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TdrCntrDetailVO[]
	 */
	public TdrCntrDetailVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TdrCntrDetailVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] shiftType = (JSPUtil.getParameter(request, prefix	+ "shift_type", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] remark = (JSPUtil.getParameter(request, prefix	+ "remark", length));
			String[] psaClass = (JSPUtil.getParameter(request, prefix	+ "psa_class", length));
			String[] por = (JSPUtil.getParameter(request, prefix	+ "por", length));
			String[] dmCode = (JSPUtil.getParameter(request, prefix	+ "dm_code", length));
			String[] dmChk = (JSPUtil.getParameter(request, prefix	+ "dm_chk", length));
			String[] fpod = (JSPUtil.getParameter(request, prefix	+ "fpod", length));
			String[] codRsn = (JSPUtil.getParameter(request, prefix	+ "cod_rsn", length));
			String[] party = (JSPUtil.getParameter(request, prefix	+ "party", length));
			String[] prePod = (JSPUtil.getParameter(request, prefix	+ "pre_pod", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] codChk = (JSPUtil.getParameter(request, prefix	+ "cod_chk", length));
			String[] pol = (JSPUtil.getParameter(request, prefix	+ "pol", length));
			String[] pod = (JSPUtil.getParameter(request, prefix	+ "pod", length));
			String[] dmh = (JSPUtil.getParameter(request, prefix	+ "dmh", length));
			String[] hcChk = (JSPUtil.getParameter(request, prefix	+ "hc_chk", length));
			String[] updateTime = (JSPUtil.getParameter(request, prefix	+ "update_time", length));
			String[] status = (JSPUtil.getParameter(request, prefix	+ "status", length));
			String[] dmb = (JSPUtil.getParameter(request, prefix	+ "dmb", length));
			String[] width = (JSPUtil.getParameter(request, prefix	+ "width", length));
			String[] grossWork = (JSPUtil.getParameter(request, prefix	+ "gross_work", length));
			String[] delvCd = (JSPUtil.getParameter(request, prefix	+ "delv_cd", length));
			String[] grossGang = (JSPUtil.getParameter(request, prefix	+ "gross_gang", length));
			String[] pod2 = (JSPUtil.getParameter(request, prefix	+ "pod2", length));
			String[] commence = (JSPUtil.getParameter(request, prefix	+ "commence", length));
			String[] rfChk = (JSPUtil.getParameter(request, prefix	+ "rf_chk", length));
			String[] pageNo = (JSPUtil.getParameter(request, prefix	+ "page_no", length));
			String[] netGang = (JSPUtil.getParameter(request, prefix	+ "net_gang", length));
			String[] temp = (JSPUtil.getParameter(request, prefix	+ "temp", length));
			String[] crane = (JSPUtil.getParameter(request, prefix	+ "crane", length));
			String[] sztp = (JSPUtil.getParameter(request, prefix	+ "sztp", length));
			String[] updateUser = (JSPUtil.getParameter(request, prefix	+ "update_user", length));
			String[] dml = (JSPUtil.getParameter(request, prefix	+ "dml", length));
			String[] position = (JSPUtil.getParameter(request, prefix	+ "position", length));
			String[] weight = (JSPUtil.getParameter(request, prefix	+ "weight", length));
			String[] lostHr = (JSPUtil.getParameter(request, prefix	+ "lost_hr", length));
			String[] optionChk = (JSPUtil.getParameter(request, prefix	+ "option_chk", length));
			String[] precell = (JSPUtil.getParameter(request, prefix	+ "precell", length));
			String[] imdg = (JSPUtil.getParameter(request, prefix	+ "imdg", length));
			String[] netWork = (JSPUtil.getParameter(request, prefix	+ "net_work", length));
			String[] tempChk = (JSPUtil.getParameter(request, prefix	+ "temp_chk", length));
			String[] unno = (JSPUtil.getParameter(request, prefix	+ "unno", length));
			String[] ovh = (JSPUtil.getParameter(request, prefix	+ "ovh", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] callInd = (JSPUtil.getParameter(request, prefix	+ "call_ind", length));
			String[] complete = (JSPUtil.getParameter(request, prefix	+ "complete", length));
			String[] cargoType = (JSPUtil.getParameter(request, prefix	+ "cargo_type", length));
			//String[] length = (JSPUtil.getParameter(request, prefix	+ "length", length));
			String[] ovp = (JSPUtil.getParameter(request, prefix	+ "ovp", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] slot = (JSPUtil.getParameter(request, prefix	+ "slot", length));
			String[] shiftChk = (JSPUtil.getParameter(request, prefix	+ "shift_chk", length));
			String[] ovs = (JSPUtil.getParameter(request, prefix	+ "ovs", length));
			String[] voyNo = (JSPUtil.getParameter(request, prefix	+ "voy_no", length));
			String[] ova = (JSPUtil.getParameter(request, prefix	+ "ova", length));
			String[] dgChk = (JSPUtil.getParameter(request, prefix	+ "dg_chk", length));
			String[] shiftRsn = (JSPUtil.getParameter(request, prefix	+ "shift_rsn", length));
			String[] ovf = (JSPUtil.getParameter(request, prefix	+ "ovf", length));
			String[] cntrType = (JSPUtil.getParameter(request, prefix	+ "cntr_type", length));
			String[] mishandleChk = (JSPUtil.getParameter(request, prefix	+ "mishandle_chk", length));
			String[] unit = (JSPUtil.getParameter(request, prefix	+ "unit", length));
			String[] cntrSize = (JSPUtil.getParameter(request, prefix	+ "cntr_size", length));
			String[] commodity = (JSPUtil.getParameter(request, prefix	+ "commodity", length));
			String[] oprCd = (JSPUtil.getParameter(request, prefix	+ "opr_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] account = (JSPUtil.getParameter(request, prefix	+ "account", length));
			
			for (int i = 0; i < length; i++) {
				model = new TdrCntrDetailVO();
				if (shiftType[i] != null)
					model.setShiftType(shiftType[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (remark[i] != null)
					model.setRemark(remark[i]);
				if (psaClass[i] != null)
					model.setPsaClass(psaClass[i]);
				if (por[i] != null)
					model.setPor(por[i]);
				if (dmCode[i] != null)
					model.setDmCode(dmCode[i]);
				if (dmChk[i] != null)
					model.setDmChk(dmChk[i]);
				if (fpod[i] != null)
					model.setFpod(fpod[i]);
				if (codRsn[i] != null)
					model.setCodRsn(codRsn[i]);
				if (party[i] != null)
					model.setParty(party[i]);
				if (prePod[i] != null)
					model.setPrePod(prePod[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (codChk[i] != null)
					model.setCodChk(codChk[i]);
				if (pol[i] != null)
					model.setPol(pol[i]);
				if (pod[i] != null)
					model.setPod(pod[i]);
				if (dmh[i] != null)
					model.setDmh(dmh[i]);
				if (hcChk[i] != null)
					model.setHcChk(hcChk[i]);
				if (updateTime[i] != null)
					model.setUpdateTime(updateTime[i]);
				if (status[i] != null)
					model.setStatus(status[i]);
				if (dmb[i] != null)
					model.setDmb(dmb[i]);
				if (width[i] != null)
					model.setWidth(width[i]);
				if (grossWork[i] != null)
					model.setGrossWork(grossWork[i]);
				if (delvCd[i] != null)
					model.setDelvCd(delvCd[i]);
				if (grossGang[i] != null)
					model.setGrossGang(grossGang[i]);
				if (pod2[i] != null)
					model.setPod2(pod2[i]);
				if (commence[i] != null)
					model.setCommence(commence[i]);
				if (rfChk[i] != null)
					model.setRfChk(rfChk[i]);
				if (pageNo[i] != null)
					model.setPageNo(pageNo[i]);
				if (netGang[i] != null)
					model.setNetGang(netGang[i]);
				if (temp[i] != null)
					model.setTemp(temp[i]);
				if (crane[i] != null)
					model.setCrane(crane[i]);
				if (sztp[i] != null)
					model.setSztp(sztp[i]);
				if (updateUser[i] != null)
					model.setUpdateUser(updateUser[i]);
				if (dml[i] != null)
					model.setDml(dml[i]);
				if (position[i] != null)
					model.setPosition(position[i]);
				if (weight[i] != null)
					model.setWeight(weight[i]);
				if (lostHr[i] != null)
					model.setLostHr(lostHr[i]);
				if (optionChk[i] != null)
					model.setOptionChk(optionChk[i]);
				if (precell[i] != null)
					model.setPrecell(precell[i]);
				if (imdg[i] != null)
					model.setImdg(imdg[i]);
				if (netWork[i] != null)
					model.setNetWork(netWork[i]);
				if (tempChk[i] != null)
					model.setTempChk(tempChk[i]);
				if (unno[i] != null)
					model.setUnno(unno[i]);
				if (ovh[i] != null)
					model.setOvh(ovh[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (callInd[i] != null)
					model.setCallInd(callInd[i]);
				if (complete[i] != null)
					model.setComplete(complete[i]);
				if (cargoType[i] != null)
					model.setCargoType(cargoType[i]);
				/*if (length[i] != null)
					model.setLength(length[i]);*/
				if (ovp[i] != null)
					model.setOvp(ovp[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (slot[i] != null)
					model.setSlot(slot[i]);
				if (shiftChk[i] != null)
					model.setShiftChk(shiftChk[i]);
				if (ovs[i] != null)
					model.setOvs(ovs[i]);
				if (voyNo[i] != null)
					model.setVoyNo(voyNo[i]);
				if (ova[i] != null)
					model.setOva(ova[i]);
				if (dgChk[i] != null)
					model.setDgChk(dgChk[i]);
				if (shiftRsn[i] != null)
					model.setShiftRsn(shiftRsn[i]);
				if (ovf[i] != null)
					model.setOvf(ovf[i]);
				if (cntrType[i] != null)
					model.setCntrType(cntrType[i]);
				if (mishandleChk[i] != null)
					model.setMishandleChk(mishandleChk[i]);
				if (unit[i] != null)
					model.setUnit(unit[i]);
				if (cntrSize[i] != null)
					model.setCntrSize(cntrSize[i]);
				if (commodity[i] != null)
					model.setCommodity(commodity[i]);
				if (oprCd[i] != null)
					model.setOprCd(oprCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (account[i] != null)
					model.setAccount(account[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTdrCntrDetailVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TdrCntrDetailVO[]
	 */
	public TdrCntrDetailVO[] getTdrCntrDetailVOs(){
		TdrCntrDetailVO[] vos = (TdrCntrDetailVO[])models.toArray(new TdrCntrDetailVO[models.size()]);
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
		this.shiftType = this.shiftType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.remark = this.remark .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psaClass = this.psaClass .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.por = this.por .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmCode = this.dmCode .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmChk = this.dmChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fpod = this.fpod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRsn = this.codRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.party = this.party .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePod = this.prePod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codChk = this.codChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pol = this.pol .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pod = this.pod .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmh = this.dmh .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hcChk = this.hcChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateTime = this.updateTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.status = this.status .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmb = this.dmb .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.width = this.width .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossWork = this.grossWork .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delvCd = this.delvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossGang = this.grossGang .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pod2 = this.pod2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commence = this.commence .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfChk = this.rfChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pageNo = this.pageNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netGang = this.netGang .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.temp = this.temp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crane = this.crane .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sztp = this.sztp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updateUser = this.updateUser .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dml = this.dml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.position = this.position .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.weight = this.weight .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lostHr = this.lostHr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.optionChk = this.optionChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.precell = this.precell .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdg = this.imdg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWork = this.netWork .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tempChk = this.tempChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unno = this.unno .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovh = this.ovh .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callInd = this.callInd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.complete = this.complete .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cargoType = this.cargoType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.length = this.length .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovp = this.ovp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slot = this.slot .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shiftChk = this.shiftChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovs = this.ovs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voyNo = this.voyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ova = this.ova .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgChk = this.dgChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shiftRsn = this.shiftRsn .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovf = this.ovf .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrType = this.cntrType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mishandleChk = this.mishandleChk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.unit = this.unit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSize = this.cntrSize .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commodity = this.commodity .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oprCd = this.oprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.account = this.account .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
