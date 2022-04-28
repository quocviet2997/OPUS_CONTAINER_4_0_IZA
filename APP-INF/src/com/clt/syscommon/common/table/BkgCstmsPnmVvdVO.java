/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsPnmVvdVO.java
*@FileTitle : BkgCstmsPnmVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.24
*@LastModifier : 김승민
*@LastVersion : 1.0
* 2009.04.24 김승민 
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
 * @author 김승민
 * @since J2EE 1.5
 */

public class BkgCstmsPnmVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsPnmVvdVO> models = new ArrayList<BkgCstmsPnmVvdVO>();
	
	/* Column Inpo */
	private String pnmVslOprCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String skdDirCd = null;
	/* Column Inpo */
	private String etaDt = null;
	/* Column Inpo */
	private String pnmOrgCd = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String pnmDestCd = null;
	/* Column Inpo */
	private String vstNo = null;
	/* Column Inpo */
	private String mvmtSeq = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String polCd = null;
	/* Column Inpo */
	private String vslCd = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String skdVoyNo = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String shpIdNo = null;
	/* Column Inpo */
	private String podCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String slanCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsPnmVvdVO() {}

	public BkgCstmsPnmVvdVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String polCd, String podCd, String etaDt, String slanCd, String shpIdNo, String vstNo, String mvmtSeq, String pnmVslOprCd, String pnmOrgCd, String pnmDestCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pnmVslOprCd = pnmVslOprCd;
		this.ibflag = ibflag;
		this.skdDirCd = skdDirCd;
		this.etaDt = etaDt;
		this.pnmOrgCd = pnmOrgCd;
		this.updUsrId = updUsrId;
		this.pnmDestCd = pnmDestCd;
		this.vstNo = vstNo;
		this.mvmtSeq = mvmtSeq;
		this.updDt = updDt;
		this.polCd = polCd;
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.creUsrId = creUsrId;
		this.shpIdNo = shpIdNo;
		this.podCd = podCd;
		this.pagerows = pagerows;
		this.slanCd = slanCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pnm_vsl_opr_cd", getPnmVslOprCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("eta_dt", getEtaDt());
		this.hashColumns.put("pnm_org_cd", getPnmOrgCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pnm_dest_cd", getPnmDestCd());
		this.hashColumns.put("vst_no", getVstNo());
		this.hashColumns.put("mvmt_seq", getMvmtSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("shp_id_no", getShpIdNo());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("slan_cd", getSlanCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pnm_vsl_opr_cd", "pnmVslOprCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("eta_dt", "etaDt");
		this.hashFields.put("pnm_org_cd", "pnmOrgCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pnm_dest_cd", "pnmDestCd");
		this.hashFields.put("vst_no", "vstNo");
		this.hashFields.put("mvmt_seq", "mvmtSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("shp_id_no", "shpIdNo");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("slan_cd", "slanCd");
		return this.hashFields;
	}
	
	public String getPnmVslOprCd() {
		return this.pnmVslOprCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getEtaDt() {
		return this.etaDt;
	}
	public String getPnmOrgCd() {
		return this.pnmOrgCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPnmDestCd() {
		return this.pnmDestCd;
	}
	public String getVstNo() {
		return this.vstNo;
	}
	public String getMvmtSeq() {
		return this.mvmtSeq;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getPolCd() {
		return this.polCd;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getShpIdNo() {
		return this.shpIdNo;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getSlanCd() {
		return this.slanCd;
	}

	public void setPnmVslOprCd(String pnmVslOprCd) {
		this.pnmVslOprCd = pnmVslOprCd;
		//this.pnmVslOprCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setEtaDt(String etaDt) {
		this.etaDt = etaDt;
		//this.etaDt=true;
	}
	public void setPnmOrgCd(String pnmOrgCd) {
		this.pnmOrgCd = pnmOrgCd;
		//this.pnmOrgCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPnmDestCd(String pnmDestCd) {
		this.pnmDestCd = pnmDestCd;
		//this.pnmDestCd=true;
	}
	public void setVstNo(String vstNo) {
		this.vstNo = vstNo;
		//this.vstNo=true;
	}
	public void setMvmtSeq(String mvmtSeq) {
		this.mvmtSeq = mvmtSeq;
		//this.mvmtSeq=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setPolCd(String polCd) {
		this.polCd = polCd;
		//this.polCd=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setShpIdNo(String shpIdNo) {
		this.shpIdNo = shpIdNo;
		//this.shpIdNo=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
		//this.slanCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setPnmVslOprCd(JSPUtil.getParameter(request, "pnm_vsl_opr_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setEtaDt(JSPUtil.getParameter(request, "eta_dt", ""));
		setPnmOrgCd(JSPUtil.getParameter(request, "pnm_org_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPnmDestCd(JSPUtil.getParameter(request, "pnm_dest_cd", ""));
		setVstNo(JSPUtil.getParameter(request, "vst_no", ""));
		setMvmtSeq(JSPUtil.getParameter(request, "mvmt_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setShpIdNo(JSPUtil.getParameter(request, "shp_id_no", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
	}

	public BkgCstmsPnmVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsPnmVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsPnmVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pnmVslOprCd = (JSPUtil.getParameter(request, prefix	+ "pnm_vsl_opr_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] etaDt = (JSPUtil.getParameter(request, prefix	+ "eta_dt".trim(), length));
			String[] pnmOrgCd = (JSPUtil.getParameter(request, prefix	+ "pnm_org_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pnmDestCd = (JSPUtil.getParameter(request, prefix	+ "pnm_dest_cd".trim(), length));
			String[] vstNo = (JSPUtil.getParameter(request, prefix	+ "vst_no".trim(), length));
			String[] mvmtSeq = (JSPUtil.getParameter(request, prefix	+ "mvmt_seq".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] shpIdNo = (JSPUtil.getParameter(request, prefix	+ "shp_id_no".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsPnmVvdVO();
				if (pnmVslOprCd[i] != null)
					model.setPnmVslOprCd(pnmVslOprCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (etaDt[i] != null)
					model.setEtaDt(etaDt[i]);
				if (pnmOrgCd[i] != null)
					model.setPnmOrgCd(pnmOrgCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pnmDestCd[i] != null)
					model.setPnmDestCd(pnmDestCd[i]);
				if (vstNo[i] != null)
					model.setVstNo(vstNo[i]);
				if (mvmtSeq[i] != null)
					model.setMvmtSeq(mvmtSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (shpIdNo[i] != null)
					model.setShpIdNo(shpIdNo[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBkgCstmsPnmVvdVOs();
	}

	public BkgCstmsPnmVvdVO[] getBkgCstmsPnmVvdVOs(){
		BkgCstmsPnmVvdVO[] vos = (BkgCstmsPnmVvdVO[])models.toArray(new BkgCstmsPnmVvdVO[models.size()]);
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
		this.pnmVslOprCd = this.pnmVslOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.etaDt = this.etaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pnmOrgCd = this.pnmOrgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pnmDestCd = this.pnmDestCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vstNo = this.vstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtSeq = this.mvmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.shpIdNo = this.shpIdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
