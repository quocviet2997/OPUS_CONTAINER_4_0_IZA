/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : BkgVvd.java
*@FileTitle : Bkg Booking
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 정윤태
*@LastVersion : 1.0
* 2008.12.29 정윤태
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정윤태
 * @see BkgCre079HTMLAction 참조
 * @since J2EE 1.5
 */

public class BkgVvd implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String updDt = null;
	/* 컬럼 설명	*/
	private String vslCd = null;
	/* 컬럼 설명	*/
	private String bkgNoSplit = null;
	/* 컬럼 설명	*/
	private String creDt = null;
	/* 컬럼 설명	*/
	private String skdVoyNo = null;
	/* 컬럼 설명	*/
	private String vslSeq = null;
	/* 컬럼 설명	*/
	private String skdCallSeq = null;
	/* 컬럼 설명	*/
	private String skdDirCd = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String podCd = null;
	/* 컬럼 설명	*/
	private String creUsrId = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String bkgNo = null;
	/* 컬럼 설명	*/
	private String polCd = null;
	/* 컬럼 설명	*/
	private String slanCd = null;
	/* 컬럼 설명	*/
	private String cntrLodgFlg = null;
	/* 컬럼 설명	*/
	private String trnsModCd = null;
	/* 컬럼 설명	*/
	private String polYdCd = null;
	/* 컬럼 설명	*/
	private String opCd = null;
	/* 컬럼 설명	*/
	private String vslPrePstCd = null;
	/* 컬럼 설명	*/
	private String podYdCd = null;
	/* 컬럼 설명	*/
	private String updUsrId = null;
	
	/* 컬럼 설명	*/
	private String bkgOfcCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public BkgVvd() {}

	public BkgVvd(String ibflag, String pagerows, String bkgNo, String bkgNoSplit, String vslPrePstCd, String vslSeq, String slanCd, String vslCd, String skdVoyNo, String skdDirCd, String skdCallSeq, String opCd, String polCd, String polYdCd, String podCd, String podYdCd, String trnsModCd, String cntrLodgFlg, String creDt, String creUsrId, String updDt, String updUsrId, String bkgOfcCd) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.bkgNoSplit = bkgNoSplit;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.vslSeq = vslSeq;
		this.skdCallSeq = skdCallSeq;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.podCd = podCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.polCd = polCd;
		this.slanCd = slanCd;
		this.cntrLodgFlg = cntrLodgFlg;
		this.trnsModCd = trnsModCd;
		this.polYdCd = polYdCd;
		this.opCd = opCd;
		this.vslPrePstCd = vslPrePstCd;
		this.podYdCd = podYdCd;
		this.updUsrId = updUsrId;
		this.bkgOfcCd = bkgOfcCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("upd_dt", getUpdDt());
		this.hashColumn.put("vsl_cd", getVslCd());
		this.hashColumn.put("bkg_no_split", getBkgNoSplit());
		this.hashColumn.put("cre_dt", getCreDt());
		this.hashColumn.put("skd_voy_no", getSkdVoyNo());
		this.hashColumn.put("vsl_seq", getVslSeq());
		this.hashColumn.put("skd_call_seq", getSkdCallSeq());
		this.hashColumn.put("skd_dir_cd", getSkdDirCd());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("pod_cd", getPodCd());
		this.hashColumn.put("cre_usr_id", getCreUsrId());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("bkg_no", getBkgNo());
		this.hashColumn.put("pol_cd", getPolCd());
		this.hashColumn.put("slan_cd", getSlanCd());
		this.hashColumn.put("cntr_lodg_flg", getCntrLodgFlg());
		this.hashColumn.put("trns_mod_cd", getTrnsModCd());
		this.hashColumn.put("pol_yd_cd", getPolYdCd());
		this.hashColumn.put("op_cd", getOpCd());
		this.hashColumn.put("vsl_pre_pst_cd", getVslPrePstCd());
		this.hashColumn.put("pod_yd_cd", getPodYdCd());
		this.hashColumn.put("upd_usr_id", getUpdUsrId());
		this.hashColumn.put("bkg_ofc_cd", getBkgOfcCd());
		return this.hashColumn;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getVslSeq() {
		return this.vslSeq;
	}
	public String getSkdCallSeq() {
		return this.skdCallSeq;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getPolCd() {
		return this.polCd;
	}
	public String getSlanCd() {
		return this.slanCd;
	}
	public String getCntrLodgFlg() {
		return this.cntrLodgFlg;
	}
	public String getTrnsModCd() {
		return this.trnsModCd;
	}
	public String getPolYdCd() {
		return this.polYdCd;
	}
	public String getOpCd() {
		return this.opCd;
	}
	public String getVslPrePstCd() {
		return this.vslPrePstCd;
	}
	public String getPodYdCd() {
		return this.podYdCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setVslSeq(String vslSeq) {
		this.vslSeq = vslSeq;
		//this.vslSeq=true;
	}
	public void setSkdCallSeq(String skdCallSeq) {
		this.skdCallSeq = skdCallSeq;
		//this.skdCallSeq=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setPolCd(String polCd) {
		this.polCd = polCd;
		//this.polCd=true;
	}
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
		//this.slanCd=true;
	}
	public void setCntrLodgFlg(String cntrLodgFlg) {
		this.cntrLodgFlg = cntrLodgFlg;
		//this.cntrLodgFlg=true;
	}
	public void setTrnsModCd(String trnsModCd) {
		this.trnsModCd = trnsModCd;
		//this.trnsModCd=true;
	}
	public void setPolYdCd(String polYdCd) {
		this.polYdCd = polYdCd;
		//this.polYdCd=true;
	}
	public void setOpCd(String opCd) {
		this.opCd = opCd;
		//this.opCd=true;
	}
	public void setVslPrePstCd(String vslPrePstCd) {
		this.vslPrePstCd = vslPrePstCd;
		//this.vslPrePstCd=true;
	}
	public void setPodYdCd(String podYdCd) {
		this.podYdCd = podYdCd;
		//this.podYdCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
		//this.cust_cnt_cd=true;
	}
	
	public static BkgVvd fromRequest(HttpServletRequest request) {
		BkgVvd model = new BkgVvd();
		try {
			model.setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
			model.setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
			model.setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
			model.setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
			model.setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
			model.setVslSeq(JSPUtil.getParameter(request, "vsl_seq", ""));
			model.setSkdCallSeq(JSPUtil.getParameter(request, "skd_call_seq", ""));
			model.setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
			model.setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
			model.setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
			model.setCntrLodgFlg(JSPUtil.getParameter(request, "cntr_lodg_flg", ""));
			model.setTrnsModCd(JSPUtil.getParameter(request, "trns_mod_cd", ""));
			model.setPolYdCd(JSPUtil.getParameter(request, "pol_yd_cd", ""));
			model.setOpCd(JSPUtil.getParameter(request, "op_cd", ""));
			model.setVslPrePstCd(JSPUtil.getParameter(request, "vsl_pre_pst_cd", ""));
			model.setPodYdCd(JSPUtil.getParameter(request, "pod_yd_cd", ""));
			model.setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
			model.setBkgOfcCd(JSPUtil.getParameter(request, "bkg_ofc_cd", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<BkgVvd> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<BkgVvd> fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgVvd model = null;
		Collection<BkgVvd> models = new ArrayList<BkgVvd>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] vslSeq = (JSPUtil.getParameter(request, prefix	+ "vsl_seq".trim(), length));
			String[] skdCallSeq = (JSPUtil.getParameter(request, prefix	+ "skd_call_seq".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			String[] cntrLodgFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_lodg_flg".trim(), length));
			String[] trnsModCd = (JSPUtil.getParameter(request, prefix	+ "trns_mod_cd".trim(), length));
			String[] polYdCd = (JSPUtil.getParameter(request, prefix	+ "pol_yd_cd".trim(), length));
			String[] opCd = (JSPUtil.getParameter(request, prefix	+ "op_cd".trim(), length));
			String[] vslPrePstCd = (JSPUtil.getParameter(request, prefix	+ "vsl_pre_pst_cd".trim(), length));
			String[] podYdCd = (JSPUtil.getParameter(request, prefix	+ "pod_yd_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgVvd();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslSeq[i] != null)
					model.setVslSeq(vslSeq[i]);
				if (skdCallSeq[i] != null)
					model.setSkdCallSeq(skdCallSeq[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (cntrLodgFlg[i] != null)
					model.setCntrLodgFlg(cntrLodgFlg[i]);
				if (trnsModCd[i] != null)
					model.setTrnsModCd(trnsModCd[i]);
				if (polYdCd[i] != null)
					model.setPolYdCd(polYdCd[i]);
				if (opCd[i] != null)
					model.setOpCd(opCd[i]);
				if (vslPrePstCd[i] != null)
					model.setVslPrePstCd(vslPrePstCd[i]);
				if (podYdCd[i] != null)
					model.setPodYdCd(podYdCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
	}

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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}

}
