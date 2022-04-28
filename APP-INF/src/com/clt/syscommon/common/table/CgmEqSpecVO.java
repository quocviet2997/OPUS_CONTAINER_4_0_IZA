/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmEqSpecVO.java
*@FileTitle : CgmEqSpecVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.28
*@LastModifier : 박의수
*@LastVersion : 1.0
* 2009.04.28 박의수 
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
 * @author 박의수
 * @since J2EE 1.5
 */

public class CgmEqSpecVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmEqSpecVO> models = new ArrayList<CgmEqSpecVO>();
	
	/* Column Info */
	private String eqTpszCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String mgstFuelCapa = null;
	/* Column Info */
	private String mgstVltgCapa = null;
	/* Column Info */
	private String eqSpecNo = null;
	/* Column Info */
	private String chssTtlDimHgt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eqKndCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String chssPayldWgt = null;
	/* Column Info */
	private String chssTtlDimLen = null;
	/* Column Info */
	private String chssTtlDimWdt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chssTareWgt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmEqSpecVO() {}

	public CgmEqSpecVO(String ibflag, String pagerows, String eqSpecNo, String eqKndCd, String eqTpszCd, String vndrSeq, String chssTareWgt, String chssPayldWgt, String chssTtlDimLen, String chssTtlDimWdt, String chssTtlDimHgt, String mgstVltgCapa, String mgstFuelCapa, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.eqTpszCd = eqTpszCd;
		this.ibflag = ibflag;
		this.vndrSeq = vndrSeq;
		this.mgstFuelCapa = mgstFuelCapa;
		this.mgstVltgCapa = mgstVltgCapa;
		this.eqSpecNo = eqSpecNo;
		this.chssTtlDimHgt = chssTtlDimHgt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.creUsrId = creUsrId;
		this.chssPayldWgt = chssPayldWgt;
		this.chssTtlDimLen = chssTtlDimLen;
		this.chssTtlDimWdt = chssTtlDimWdt;
		this.pagerows = pagerows;
		this.chssTareWgt = chssTareWgt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("eq_tpsz_cd", getEqTpszCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("mgst_fuel_capa", getMgstFuelCapa());
		this.hashColumns.put("mgst_vltg_capa", getMgstVltgCapa());
		this.hashColumns.put("eq_spec_no", getEqSpecNo());
		this.hashColumns.put("chss_ttl_dim_hgt", getChssTtlDimHgt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("chss_payld_wgt", getChssPayldWgt());
		this.hashColumns.put("chss_ttl_dim_len", getChssTtlDimLen());
		this.hashColumns.put("chss_ttl_dim_wdt", getChssTtlDimWdt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_tare_wgt", getChssTareWgt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("eq_tpsz_cd", "eqTpszCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("mgst_fuel_capa", "mgstFuelCapa");
		this.hashFields.put("mgst_vltg_capa", "mgstVltgCapa");
		this.hashFields.put("eq_spec_no", "eqSpecNo");
		this.hashFields.put("chss_ttl_dim_hgt", "chssTtlDimHgt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("chss_payld_wgt", "chssPayldWgt");
		this.hashFields.put("chss_ttl_dim_len", "chssTtlDimLen");
		this.hashFields.put("chss_ttl_dim_wdt", "chssTtlDimWdt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_tare_wgt", "chssTareWgt");
		return this.hashFields;
	}
	
	public String getEqTpszCd() {
		return this.eqTpszCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	public String getMgstFuelCapa() {
		return this.mgstFuelCapa;
	}
	public String getMgstVltgCapa() {
		return this.mgstVltgCapa;
	}
	public String getEqSpecNo() {
		return this.eqSpecNo;
	}
	public String getChssTtlDimHgt() {
		return this.chssTtlDimHgt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getEqKndCd() {
		return this.eqKndCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getChssPayldWgt() {
		return this.chssPayldWgt;
	}
	public String getChssTtlDimLen() {
		return this.chssTtlDimLen;
	}
	public String getChssTtlDimWdt() {
		return this.chssTtlDimWdt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssTareWgt() {
		return this.chssTareWgt;
	}

	public void setEqTpszCd(String eqTpszCd) {
		this.eqTpszCd = eqTpszCd;
		//this.eqTpszCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
		//this.vndrSeq=true;
	}
	public void setMgstFuelCapa(String mgstFuelCapa) {
		this.mgstFuelCapa = mgstFuelCapa;
		//this.mgstFuelCapa=true;
	}
	public void setMgstVltgCapa(String mgstVltgCapa) {
		this.mgstVltgCapa = mgstVltgCapa;
		//this.mgstVltgCapa=true;
	}
	public void setEqSpecNo(String eqSpecNo) {
		this.eqSpecNo = eqSpecNo;
		//this.eqSpecNo=true;
	}
	public void setChssTtlDimHgt(String chssTtlDimHgt) {
		this.chssTtlDimHgt = chssTtlDimHgt;
		//this.chssTtlDimHgt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setEqKndCd(String eqKndCd) {
		this.eqKndCd = eqKndCd;
		//this.eqKndCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setChssPayldWgt(String chssPayldWgt) {
		this.chssPayldWgt = chssPayldWgt;
		//this.chssPayldWgt=true;
	}
	public void setChssTtlDimLen(String chssTtlDimLen) {
		this.chssTtlDimLen = chssTtlDimLen;
		//this.chssTtlDimLen=true;
	}
	public void setChssTtlDimWdt(String chssTtlDimWdt) {
		this.chssTtlDimWdt = chssTtlDimWdt;
		//this.chssTtlDimWdt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setChssTareWgt(String chssTareWgt) {
		this.chssTareWgt = chssTareWgt;
		//this.chssTareWgt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setEqTpszCd(JSPUtil.getParameter(request, "eq_tpsz_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setMgstFuelCapa(JSPUtil.getParameter(request, "mgst_fuel_capa", ""));
		setMgstVltgCapa(JSPUtil.getParameter(request, "mgst_vltg_capa", ""));
		setEqSpecNo(JSPUtil.getParameter(request, "eq_spec_no", ""));
		setChssTtlDimHgt(JSPUtil.getParameter(request, "chss_ttl_dim_hgt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setChssPayldWgt(JSPUtil.getParameter(request, "chss_payld_wgt", ""));
		setChssTtlDimLen(JSPUtil.getParameter(request, "chss_ttl_dim_len", ""));
		setChssTtlDimWdt(JSPUtil.getParameter(request, "chss_ttl_dim_wdt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssTareWgt(JSPUtil.getParameter(request, "chss_tare_wgt", ""));
	}

	public CgmEqSpecVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmEqSpecVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmEqSpecVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] eqTpszCd = (JSPUtil.getParameter(request, prefix	+ "eq_tpsz_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq".trim(), length));
			String[] mgstFuelCapa = (JSPUtil.getParameter(request, prefix	+ "mgst_fuel_capa".trim(), length));
			String[] mgstVltgCapa = (JSPUtil.getParameter(request, prefix	+ "mgst_vltg_capa".trim(), length));
			String[] eqSpecNo = (JSPUtil.getParameter(request, prefix	+ "eq_spec_no".trim(), length));
			String[] chssTtlDimHgt = (JSPUtil.getParameter(request, prefix	+ "chss_ttl_dim_hgt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] chssPayldWgt = (JSPUtil.getParameter(request, prefix	+ "chss_payld_wgt".trim(), length));
			String[] chssTtlDimLen = (JSPUtil.getParameter(request, prefix	+ "chss_ttl_dim_len".trim(), length));
			String[] chssTtlDimWdt = (JSPUtil.getParameter(request, prefix	+ "chss_ttl_dim_wdt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssTareWgt = (JSPUtil.getParameter(request, prefix	+ "chss_tare_wgt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmEqSpecVO();
				if (eqTpszCd[i] != null)
					model.setEqTpszCd(eqTpszCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (mgstFuelCapa[i] != null)
					model.setMgstFuelCapa(mgstFuelCapa[i]);
				if (mgstVltgCapa[i] != null)
					model.setMgstVltgCapa(mgstVltgCapa[i]);
				if (eqSpecNo[i] != null)
					model.setEqSpecNo(eqSpecNo[i]);
				if (chssTtlDimHgt[i] != null)
					model.setChssTtlDimHgt(chssTtlDimHgt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (chssPayldWgt[i] != null)
					model.setChssPayldWgt(chssPayldWgt[i]);
				if (chssTtlDimLen[i] != null)
					model.setChssTtlDimLen(chssTtlDimLen[i]);
				if (chssTtlDimWdt[i] != null)
					model.setChssTtlDimWdt(chssTtlDimWdt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssTareWgt[i] != null)
					model.setChssTareWgt(chssTareWgt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmEqSpecVOs();
	}

	public CgmEqSpecVO[] getCgmEqSpecVOs(){
		CgmEqSpecVO[] vos = (CgmEqSpecVO[])models.toArray(new CgmEqSpecVO[models.size()]);
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
		this.eqTpszCd = this.eqTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstFuelCapa = this.mgstFuelCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mgstVltgCapa = this.mgstVltgCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSpecNo = this.eqSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTtlDimHgt = this.chssTtlDimHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPayldWgt = this.chssPayldWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTtlDimLen = this.chssTtlDimLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTtlDimWdt = this.chssTtlDimWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssTareWgt = this.chssTareWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
