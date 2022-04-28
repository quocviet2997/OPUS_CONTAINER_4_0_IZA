/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmChssMvmtHisVO.java
*@FileTitle : CgmChssMvmtHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmChssMvmtHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmChssMvmtHisVO> models = new ArrayList<CgmChssMvmtHisVO>();
	
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cnmvYr = null;
	/* Column Info */
	private String sysSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cnmvIdNo = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String cntrOwnrCoCd = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String mvmtCoCd = null;
	/* Column Info */
	private String gateIoCd = null;
	/* Column Info */
	private String mvmtRsnCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String chssOwnrCoCd = null;
	/* Column Info */
	private String mgstNo = null;
	/* Column Info */
	private String mvmtDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mvmtStsCd = null;
	/* Column Info */
	private String destYdCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmChssMvmtHisVO() {}

	public CgmChssMvmtHisVO(String ibflag, String pagerows, String chssNo, String mvmtDt, String sysSeq, String chssOwnrCoCd, String ydCd, String cntrNo, String cnmvYr, String cnmvIdNo, String cntrOwnrCoCd, String destYdCd, String gateIoCd, String vndrSeq, String mvmtStsCd, String mvmtRsnCd, String mgstNo, String bkgNo, String bkgNoSplit, String mvmtCoCd, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.bkgNoSplit = bkgNoSplit;
		this.bkgNo = bkgNo;
		this.cnmvYr = cnmvYr;
		this.sysSeq = sysSeq;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.cntrNo = cntrNo;
		this.cnmvIdNo = cnmvIdNo;
		this.ibflag = ibflag;
		this.vndrSeq = vndrSeq;
		this.cntrOwnrCoCd = cntrOwnrCoCd;
		this.ydCd = ydCd;
		this.chssNo = chssNo;
		this.diffRmk = diffRmk;
		this.mvmtCoCd = mvmtCoCd;
		this.gateIoCd = gateIoCd;
		this.mvmtRsnCd = mvmtRsnCd;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.chssOwnrCoCd = chssOwnrCoCd;
		this.mgstNo = mgstNo;
		this.mvmtDt = mvmtDt;
		this.pagerows = pagerows;
		this.mvmtStsCd = mvmtStsCd;
		this.destYdCd = destYdCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cnmv_yr", getCnmvYr());
		this.hashColumns.put("sys_seq", getSysSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cnmv_id_no", getCnmvIdNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("cntr_ownr_co_cd", getCntrOwnrCoCd());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("mvmt_co_cd", getMvmtCoCd());
		this.hashColumns.put("gate_io_cd", getGateIoCd());
		this.hashColumns.put("mvmt_rsn_cd", getMvmtRsnCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("chss_ownr_co_cd", getChssOwnrCoCd());
		this.hashColumns.put("mgst_no", getMgstNo());
		this.hashColumns.put("mvmt_dt", getMvmtDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mvmt_sts_cd", getMvmtStsCd());
		this.hashColumns.put("dest_yd_cd", getDestYdCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cnmv_yr", "cnmvYr");
		this.hashFields.put("sys_seq", "sysSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cnmv_id_no", "cnmvIdNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("cntr_ownr_co_cd", "cntrOwnrCoCd");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("mvmt_co_cd", "mvmtCoCd");
		this.hashFields.put("gate_io_cd", "gateIoCd");
		this.hashFields.put("mvmt_rsn_cd", "mvmtRsnCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("chss_ownr_co_cd", "chssOwnrCoCd");
		this.hashFields.put("mgst_no", "mgstNo");
		this.hashFields.put("mvmt_dt", "mvmtDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mvmt_sts_cd", "mvmtStsCd");
		this.hashFields.put("dest_yd_cd", "destYdCd");
		return this.hashFields;
	}
	
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	public String getBkgNo() {
		return this.bkgNo;
	}
	public String getCnmvYr() {
		return this.cnmvYr;
	}
	public String getSysSeq() {
		return this.sysSeq;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getCnmvIdNo() {
		return this.cnmvIdNo;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getCntrOwnrCoCd() {
		return this.cntrOwnrCoCd;
	}
	public String getYdCd() {
		return this.ydCd;
	}
	public String getChssNo() {
		return this.chssNo;
	}
	public String getDiffRmk() {
		return this.diffRmk;
	}
	public String getMvmtCoCd() {
		return this.mvmtCoCd;
	}
	public String getGateIoCd() {
		return this.gateIoCd;
	}
	public String getMvmtRsnCd() {
		return this.mvmtRsnCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getChssOwnrCoCd() {
		return this.chssOwnrCoCd;
	}
	public String getMgstNo() {
		return this.mgstNo;
	}
	public String getMvmtDt() {
		return this.mvmtDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getMvmtStsCd() {
		return this.mvmtStsCd;
	}
	public String getDestYdCd() {
		return this.destYdCd;
	}

	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
		//this.bkgNoSplit=true;
	}
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
		//this.bkgNo=true;
	}
	public void setCnmvYr(String cnmvYr) {
		this.cnmvYr = cnmvYr;
		//this.cnmvYr=true;
	}
	public void setSysSeq(String sysSeq) {
		this.sysSeq = sysSeq;
		//this.sysSeq=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setCnmvIdNo(String cnmvIdNo) {
		this.cnmvIdNo = cnmvIdNo;
		//this.cnmvIdNo=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setCntrOwnrCoCd(String cntrOwnrCoCd) {
		this.cntrOwnrCoCd = cntrOwnrCoCd;
		//this.cntrOwnrCoCd=true;
	}
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
		//this.ydCd=true;
	}
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
		//this.chssNo=true;
	}
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
		//this.diffRmk=true;
	}
	public void setMvmtCoCd(String mvmtCoCd) {
		this.mvmtCoCd = mvmtCoCd;
		//this.mvmtCoCd=true;
	}
	public void setGateIoCd(String gateIoCd) {
		this.gateIoCd = gateIoCd;
		//this.gateIoCd=true;
	}
	public void setMvmtRsnCd(String mvmtRsnCd) {
		this.mvmtRsnCd = mvmtRsnCd;
		//this.mvmtRsnCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setChssOwnrCoCd(String chssOwnrCoCd) {
		this.chssOwnrCoCd = chssOwnrCoCd;
		//this.chssOwnrCoCd=true;
	}
	public void setMgstNo(String mgstNo) {
		this.mgstNo = mgstNo;
		//this.mgstNo=true;
	}
	public void setMvmtDt(String mvmtDt) {
		this.mvmtDt = mvmtDt;
		//this.mvmtDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setMvmtStsCd(String mvmtStsCd) {
		this.mvmtStsCd = mvmtStsCd;
		//this.mvmtStsCd=true;
	}
	public void setDestYdCd(String destYdCd) {
		this.destYdCd = destYdCd;
		//this.destYdCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setBkgNoSplit(JSPUtil.getParameter(request, "bkg_no_split", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCnmvYr(JSPUtil.getParameter(request, "cnmv_yr", ""));
		setSysSeq(JSPUtil.getParameter(request, "sys_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setCnmvIdNo(JSPUtil.getParameter(request, "cnmv_id_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setCntrOwnrCoCd(JSPUtil.getParameter(request, "cntr_ownr_co_cd", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setMvmtCoCd(JSPUtil.getParameter(request, "mvmt_co_cd", ""));
		setGateIoCd(JSPUtil.getParameter(request, "gate_io_cd", ""));
		setMvmtRsnCd(JSPUtil.getParameter(request, "mvmt_rsn_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setChssOwnrCoCd(JSPUtil.getParameter(request, "chss_ownr_co_cd", ""));
		setMgstNo(JSPUtil.getParameter(request, "mgst_no", ""));
		setMvmtDt(JSPUtil.getParameter(request, "mvmt_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMvmtStsCd(JSPUtil.getParameter(request, "mvmt_sts_cd", ""));
		setDestYdCd(JSPUtil.getParameter(request, "dest_yd_cd", ""));
	}

	public CgmChssMvmtHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmChssMvmtHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmChssMvmtHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split".trim(), length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no".trim(), length));
			String[] cnmvYr = (JSPUtil.getParameter(request, prefix	+ "cnmv_yr".trim(), length));
			String[] sysSeq = (JSPUtil.getParameter(request, prefix	+ "sys_seq".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] cnmvIdNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_id_no".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] cntrOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "cntr_ownr_co_cd".trim(), length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd".trim(), length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] mvmtCoCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_co_cd".trim(), length));
			String[] gateIoCd = (JSPUtil.getParameter(request, prefix	+ "gate_io_cd".trim(), length));
			String[] mvmtRsnCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_rsn_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] chssOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "chss_ownr_co_cd".trim(), length));
			String[] mgstNo = (JSPUtil.getParameter(request, prefix	+ "mgst_no".trim(), length));
			String[] mvmtDt = (JSPUtil.getParameter(request, prefix	+ "mvmt_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] mvmtStsCd = (JSPUtil.getParameter(request, prefix	+ "mvmt_sts_cd".trim(), length));
			String[] destYdCd = (JSPUtil.getParameter(request, prefix	+ "dest_yd_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmChssMvmtHisVO();
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cnmvYr[i] != null)
					model.setCnmvYr(cnmvYr[i]);
				if (sysSeq[i] != null)
					model.setSysSeq(sysSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cnmvIdNo[i] != null)
					model.setCnmvIdNo(cnmvIdNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (cntrOwnrCoCd[i] != null)
					model.setCntrOwnrCoCd(cntrOwnrCoCd[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (mvmtCoCd[i] != null)
					model.setMvmtCoCd(mvmtCoCd[i]);
				if (gateIoCd[i] != null)
					model.setGateIoCd(gateIoCd[i]);
				if (mvmtRsnCd[i] != null)
					model.setMvmtRsnCd(mvmtRsnCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (chssOwnrCoCd[i] != null)
					model.setChssOwnrCoCd(chssOwnrCoCd[i]);
				if (mgstNo[i] != null)
					model.setMgstNo(mgstNo[i]);
				if (mvmtDt[i] != null)
					model.setMvmtDt(mvmtDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mvmtStsCd[i] != null)
					model.setMvmtStsCd(mvmtStsCd[i]);
				if (destYdCd[i] != null)
					model.setDestYdCd(destYdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmChssMvmtHisVOs();
	}

	public CgmChssMvmtHisVO[] getCgmChssMvmtHisVOs(){
		CgmChssMvmtHisVO[] vos = (CgmChssMvmtHisVO[])models.toArray(new CgmChssMvmtHisVO[models.size()]);
		return vos;
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
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvYr = this.cnmvYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sysSeq = this.sysSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvIdNo = this.cnmvIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOwnrCoCd = this.cntrOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtCoCd = this.mvmtCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gateIoCd = this.gateIoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtRsnCd = this.mvmtRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssOwnrCoCd = this.chssOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstNo = this.mgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtDt = this.mvmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtStsCd = this.mvmtStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destYdCd = this.destYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
