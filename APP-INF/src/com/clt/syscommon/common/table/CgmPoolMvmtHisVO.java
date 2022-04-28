/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmPoolMvmtHisVO.java
*@FileTitle : CgmPoolMvmtHisVO
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

public class CgmPoolMvmtHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmPoolMvmtHisVO> models = new ArrayList<CgmPoolMvmtHisVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String eqTpszRepCd = null;
	/* Column Info */
	private String cntrOwnrCoCd = null;
	/* Column Info */
	private String chssNo = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String chssUseCoNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String gateIoCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String locNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ydComFlg = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String chssTpszCd = null;
	/* Column Info */
	private String mgstNo = null;
	/* Column Info */
	private String chssOwnrCoCd = null;
	/* Column Info */
	private String mvmtDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String orgCoCd = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmPoolMvmtHisVO() {}

	public CgmPoolMvmtHisVO(String ibflag, String pagerows, String chssNo, String mvmtDt, String chssOwnrCoCd, String orgCoCd, String chssPoolCd, String chssTpszCd, String eqTpszRepCd, String ydCd, String ydComFlg, String locNm, String cntrNo, String cntrOwnrCoCd, String gateIoCd, String cntrTpszCd, String mgstNo, String chssUseCoNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.eqTpszRepCd = eqTpszRepCd;
		this.cntrOwnrCoCd = cntrOwnrCoCd;
		this.chssNo = chssNo;
		this.ydCd = ydCd;
		this.chssUseCoNm = chssUseCoNm;
		this.updUsrId = updUsrId;
		this.gateIoCd = gateIoCd;
		this.updDt = updDt;
		this.creDt = creDt;
		this.locNm = locNm;
		this.creUsrId = creUsrId;
		this.ydComFlg = ydComFlg;
		this.cntrNo = cntrNo;
		this.chssTpszCd = chssTpszCd;
		this.mgstNo = mgstNo;
		this.chssOwnrCoCd = chssOwnrCoCd;
		this.mvmtDt = mvmtDt;
		this.pagerows = pagerows;
		this.cntrTpszCd = cntrTpszCd;
		this.orgCoCd = orgCoCd;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eq_tpsz_rep_cd", getEqTpszRepCd());
		this.hashColumns.put("cntr_ownr_co_cd", getCntrOwnrCoCd());
		this.hashColumns.put("chss_no", getChssNo());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("chss_use_co_nm", getChssUseCoNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("gate_io_cd", getGateIoCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("loc_nm", getLocNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yd_com_flg", getYdComFlg());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("chss_tpsz_cd", getChssTpszCd());
		this.hashColumns.put("mgst_no", getMgstNo());
		this.hashColumns.put("chss_ownr_co_cd", getChssOwnrCoCd());
		this.hashColumns.put("mvmt_dt", getMvmtDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("org_co_cd", getOrgCoCd());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eq_tpsz_rep_cd", "eqTpszRepCd");
		this.hashFields.put("cntr_ownr_co_cd", "cntrOwnrCoCd");
		this.hashFields.put("chss_no", "chssNo");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("chss_use_co_nm", "chssUseCoNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("gate_io_cd", "gateIoCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("loc_nm", "locNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yd_com_flg", "ydComFlg");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("chss_tpsz_cd", "chssTpszCd");
		this.hashFields.put("mgst_no", "mgstNo");
		this.hashFields.put("chss_ownr_co_cd", "chssOwnrCoCd");
		this.hashFields.put("mvmt_dt", "mvmtDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("org_co_cd", "orgCoCd");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getEqTpszRepCd() {
		return this.eqTpszRepCd;
	}
	public String getCntrOwnrCoCd() {
		return this.cntrOwnrCoCd;
	}
	public String getChssNo() {
		return this.chssNo;
	}
	public String getYdCd() {
		return this.ydCd;
	}
	public String getChssUseCoNm() {
		return this.chssUseCoNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getGateIoCd() {
		return this.gateIoCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getLocNm() {
		return this.locNm;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getYdComFlg() {
		return this.ydComFlg;
	}
	public String getCntrNo() {
		return this.cntrNo;
	}
	public String getChssTpszCd() {
		return this.chssTpszCd;
	}
	public String getMgstNo() {
		return this.mgstNo;
	}
	public String getChssOwnrCoCd() {
		return this.chssOwnrCoCd;
	}
	public String getMvmtDt() {
		return this.mvmtDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	public String getOrgCoCd() {
		return this.orgCoCd;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setEqTpszRepCd(String eqTpszRepCd) {
		this.eqTpszRepCd = eqTpszRepCd;
		//this.eqTpszRepCd=true;
	}
	public void setCntrOwnrCoCd(String cntrOwnrCoCd) {
		this.cntrOwnrCoCd = cntrOwnrCoCd;
		//this.cntrOwnrCoCd=true;
	}
	public void setChssNo(String chssNo) {
		this.chssNo = chssNo;
		//this.chssNo=true;
	}
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
		//this.ydCd=true;
	}
	public void setChssUseCoNm(String chssUseCoNm) {
		this.chssUseCoNm = chssUseCoNm;
		//this.chssUseCoNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setGateIoCd(String gateIoCd) {
		this.gateIoCd = gateIoCd;
		//this.gateIoCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setLocNm(String locNm) {
		this.locNm = locNm;
		//this.locNm=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setYdComFlg(String ydComFlg) {
		this.ydComFlg = ydComFlg;
		//this.ydComFlg=true;
	}
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
		//this.cntrNo=true;
	}
	public void setChssTpszCd(String chssTpszCd) {
		this.chssTpszCd = chssTpszCd;
		//this.chssTpszCd=true;
	}
	public void setMgstNo(String mgstNo) {
		this.mgstNo = mgstNo;
		//this.mgstNo=true;
	}
	public void setChssOwnrCoCd(String chssOwnrCoCd) {
		this.chssOwnrCoCd = chssOwnrCoCd;
		//this.chssOwnrCoCd=true;
	}
	public void setMvmtDt(String mvmtDt) {
		this.mvmtDt = mvmtDt;
		//this.mvmtDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
		//this.cntrTpszCd=true;
	}
	public void setOrgCoCd(String orgCoCd) {
		this.orgCoCd = orgCoCd;
		//this.orgCoCd=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEqTpszRepCd(JSPUtil.getParameter(request, "eq_tpsz_rep_cd", ""));
		setCntrOwnrCoCd(JSPUtil.getParameter(request, "cntr_ownr_co_cd", ""));
		setChssNo(JSPUtil.getParameter(request, "chss_no", ""));
		setYdCd(JSPUtil.getParameter(request, "yd_cd", ""));
		setChssUseCoNm(JSPUtil.getParameter(request, "chss_use_co_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setGateIoCd(JSPUtil.getParameter(request, "gate_io_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setLocNm(JSPUtil.getParameter(request, "loc_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setYdComFlg(JSPUtil.getParameter(request, "yd_com_flg", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setChssTpszCd(JSPUtil.getParameter(request, "chss_tpsz_cd", ""));
		setMgstNo(JSPUtil.getParameter(request, "mgst_no", ""));
		setChssOwnrCoCd(JSPUtil.getParameter(request, "chss_ownr_co_cd", ""));
		setMvmtDt(JSPUtil.getParameter(request, "mvmt_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setOrgCoCd(JSPUtil.getParameter(request, "org_co_cd", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmPoolMvmtHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmPoolMvmtHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmPoolMvmtHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] eqTpszRepCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_rep_cd".trim(), length));
			String[] cntrOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "cntr_ownr_co_cd".trim(), length));
			String[] chssNo = (JSPUtil.getParameter(request, prefix	+ "chss_no".trim(), length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd".trim(), length));
			String[] chssUseCoNm = (JSPUtil.getParameter(request, prefix	+ "chss_use_co_nm".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] gateIoCd = (JSPUtil.getParameter(request, prefix	+ "gate_io_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] locNm = (JSPUtil.getParameter(request, prefix	+ "loc_nm".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ydComFlg = (JSPUtil.getParameter(request, prefix	+ "yd_com_flg".trim(), length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no".trim(), length));
			String[] chssTpszCd = (JSPUtil.getParameter(request, prefix	+ "chss_tpsz_cd".trim(), length));
			String[] mgstNo = (JSPUtil.getParameter(request, prefix	+ "mgst_no".trim(), length));
			String[] chssOwnrCoCd = (JSPUtil.getParameter(request, prefix	+ "chss_ownr_co_cd".trim(), length));
			String[] mvmtDt = (JSPUtil.getParameter(request, prefix	+ "mvmt_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] orgCoCd = (JSPUtil.getParameter(request, prefix	+ "org_co_cd".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmPoolMvmtHisVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (eqTpszRepCd[i] != null)
					model.setEqTpszRepCd(eqTpszRepCd[i]);
				if (cntrOwnrCoCd[i] != null)
					model.setCntrOwnrCoCd(cntrOwnrCoCd[i]);
				if (chssNo[i] != null)
					model.setChssNo(chssNo[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (chssUseCoNm[i] != null)
					model.setChssUseCoNm(chssUseCoNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (gateIoCd[i] != null)
					model.setGateIoCd(gateIoCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (locNm[i] != null)
					model.setLocNm(locNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ydComFlg[i] != null)
					model.setYdComFlg(ydComFlg[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (chssTpszCd[i] != null)
					model.setChssTpszCd(chssTpszCd[i]);
				if (mgstNo[i] != null)
					model.setMgstNo(mgstNo[i]);
				if (chssOwnrCoCd[i] != null)
					model.setChssOwnrCoCd(chssOwnrCoCd[i]);
				if (mvmtDt[i] != null)
					model.setMvmtDt(mvmtDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (orgCoCd[i] != null)
					model.setOrgCoCd(orgCoCd[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmPoolMvmtHisVOs();
	}

	public CgmPoolMvmtHisVO[] getCgmPoolMvmtHisVOs(){
		CgmPoolMvmtHisVO[] vos = (CgmPoolMvmtHisVO[])models.toArray(new CgmPoolMvmtHisVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqTpszRepCd = this.eqTpszRepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOwnrCoCd = this.cntrOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssNo = this.chssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssUseCoNm = this.chssUseCoNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gateIoCd = this.gateIoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locNm = this.locNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydComFlg = this.ydComFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTpszCd = this.chssTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstNo = this.mgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssOwnrCoCd = this.chssOwnrCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mvmtDt = this.mvmtDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgCoCd = this.orgCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
