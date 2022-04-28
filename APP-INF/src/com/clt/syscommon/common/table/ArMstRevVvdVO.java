/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ArMstRevVvdVO.java
*@FileTitle : ArMstRevVvdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.28
*@LastModifier : 서창열
*@LastVersion : 1.0
* 2009.04.28 서창열 
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
 * @author 서창열
 * @since J2EE 1.5
 */

public class ArMstRevVvdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ArMstRevVvdVO> models = new ArrayList<ArMstRevVvdVO>();
	
	/* Column Info */
	private String portChkFlg = null;
	/* Column Info */
	private String revPortCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String comVvdFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String rlaneDirCd = null;
	/* Column Info */
	private String revYrmon = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String vvdComLvl = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String voyTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lodQty = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String slanCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ArMstRevVvdVO() {}

	public ArMstRevVvdVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String rlaneDirCd, String voyTpCd, String slanCd, String portChkFlg, String lodQty, String revPortCd, String revYrmon, String comVvdFlg, String vvdComLvl, String rlaneCd, String deltFlg, String creUsrId, String creDt, String eaiEvntDt) {
		this.portChkFlg = portChkFlg;
		this.revPortCd = revPortCd;
		this.ibflag = ibflag;
		this.comVvdFlg = comVvdFlg;
		this.skdDirCd = skdDirCd;
		this.rlaneDirCd = rlaneDirCd;
		this.revYrmon = revYrmon;
		this.eaiEvntDt = eaiEvntDt;
		this.rlaneCd = rlaneCd;
		this.vvdComLvl = vvdComLvl;
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.deltFlg = deltFlg;
		this.skdVoyNo = skdVoyNo;
		this.voyTpCd = voyTpCd;
		this.creUsrId = creUsrId;
		this.lodQty = lodQty;
		this.pagerows = pagerows;
		this.slanCd = slanCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("port_chk_flg", getPortChkFlg());
		this.hashColumns.put("rev_port_cd", getRevPortCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("com_vvd_flg", getComVvdFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("rlane_dir_cd", getRlaneDirCd());
		this.hashColumns.put("rev_yrmon", getRevYrmon());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("vvd_com_lvl", getVvdComLvl());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("voy_tp_cd", getVoyTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("slan_cd", getSlanCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("port_chk_flg", "portChkFlg");
		this.hashFields.put("rev_port_cd", "revPortCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("com_vvd_flg", "comVvdFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("rlane_dir_cd", "rlaneDirCd");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("vvd_com_lvl", "vvdComLvl");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("voy_tp_cd", "voyTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("slan_cd", "slanCd");
		return this.hashFields;
	}
	
	public String getPortChkFlg() {
		return this.portChkFlg;
	}
	public String getRevPortCd() {
		return this.revPortCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getComVvdFlg() {
		return this.comVvdFlg;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getRlaneDirCd() {
		return this.rlaneDirCd;
	}
	public String getRevYrmon() {
		return this.revYrmon;
	}
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	public String getVvdComLvl() {
		return this.vvdComLvl;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getVoyTpCd() {
		return this.voyTpCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getLodQty() {
		return this.lodQty;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getSlanCd() {
		return this.slanCd;
	}

	public void setPortChkFlg(String portChkFlg) {
		this.portChkFlg = portChkFlg;
		//this.portChkFlg=true;
	}
	public void setRevPortCd(String revPortCd) {
		this.revPortCd = revPortCd;
		//this.revPortCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setComVvdFlg(String comVvdFlg) {
		this.comVvdFlg = comVvdFlg;
		//this.comVvdFlg=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setRlaneDirCd(String rlaneDirCd) {
		this.rlaneDirCd = rlaneDirCd;
		//this.rlaneDirCd=true;
	}
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
		//this.revYrmon=true;
	}
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
		//this.eaiEvntDt=true;
	}
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
		//this.rlaneCd=true;
	}
	public void setVvdComLvl(String vvdComLvl) {
		this.vvdComLvl = vvdComLvl;
		//this.vvdComLvl=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setVoyTpCd(String voyTpCd) {
		this.voyTpCd = voyTpCd;
		//this.voyTpCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setLodQty(String lodQty) {
		this.lodQty = lodQty;
		//this.lodQty=true;
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
		setPortChkFlg(JSPUtil.getParameter(request, "port_chk_flg", ""));
		setRevPortCd(JSPUtil.getParameter(request, "rev_port_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setComVvdFlg(JSPUtil.getParameter(request, "com_vvd_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setRlaneDirCd(JSPUtil.getParameter(request, "rlane_dir_cd", ""));
		setRevYrmon(JSPUtil.getParameter(request, "rev_yrmon", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setVvdComLvl(JSPUtil.getParameter(request, "vvd_com_lvl", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setVoyTpCd(JSPUtil.getParameter(request, "voy_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLodQty(JSPUtil.getParameter(request, "lod_qty", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
	}

	public ArMstRevVvdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ArMstRevVvdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ArMstRevVvdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] portChkFlg = (JSPUtil.getParameter(request, prefix	+ "port_chk_flg".trim(), length));
			String[] revPortCd = (JSPUtil.getParameter(request, prefix	+ "rev_port_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] comVvdFlg = (JSPUtil.getParameter(request, prefix	+ "com_vvd_flg".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] rlaneDirCd = (JSPUtil.getParameter(request, prefix	+ "rlane_dir_cd".trim(), length));
			String[] revYrmon = (JSPUtil.getParameter(request, prefix	+ "rev_yrmon".trim(), length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim(), length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd".trim(), length));
			String[] vvdComLvl = (JSPUtil.getParameter(request, prefix	+ "vvd_com_lvl".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] voyTpCd = (JSPUtil.getParameter(request, prefix	+ "voy_tp_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ArMstRevVvdVO();
				if (portChkFlg[i] != null)
					model.setPortChkFlg(portChkFlg[i]);
				if (revPortCd[i] != null)
					model.setRevPortCd(revPortCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (comVvdFlg[i] != null)
					model.setComVvdFlg(comVvdFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (rlaneDirCd[i] != null)
					model.setRlaneDirCd(rlaneDirCd[i]);
				if (revYrmon[i] != null)
					model.setRevYrmon(revYrmon[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (vvdComLvl[i] != null)
					model.setVvdComLvl(vvdComLvl[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (voyTpCd[i] != null)
					model.setVoyTpCd(voyTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getArMstRevVvdVOs();
	}

	public ArMstRevVvdVO[] getArMstRevVvdVOs(){
		ArMstRevVvdVO[] vos = (ArMstRevVvdVO[])models.toArray(new ArMstRevVvdVO[models.size()]);
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
		this.portChkFlg = this.portChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPortCd = this.revPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comVvdFlg = this.comVvdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneDirCd = this.rlaneDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon = this.revYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdComLvl = this.vvdComLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voyTpCd = this.voyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
