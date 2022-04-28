/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmEqLotVO.java
*@FileTitle : CgmEqLotVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.30
*@LastModifier : 박의수
*@LastVersion : 1.0
* 2009.04.30 박의수 
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

public class CgmEqLotVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmEqLotVO> models = new ArrayList<CgmEqLotVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String fmSerNo = null;
	/* Column Inpo */
	private String fincVndrSeq = null;
	/* Column Inpo */
	private String deYrmon = null;
	/* Column Inpo */
	private String agmtSeq = null;
	/* Column Inpo */
	private String eqLotNo = null;
	/* Column Inpo */
	private String toSerNo = null;
	/* Column Inpo */
	private String eqSpecNo = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String eqPfxCd = null;
	/* Column Inpo */
	private String agmtVerNo = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String eqKndCd = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String agmtOfcCtyCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmEqLotVO() {}

	public CgmEqLotVO(String ibflag, String pagerows, String eqLotNo, String eqKndCd, String eqPfxCd, String fmSerNo, String toSerNo, String fincVndrSeq, String eqSpecNo, String deYrmon, String agmtOfcCtyCd, String agmtSeq, String agmtVerNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.fmSerNo = fmSerNo;
		this.fincVndrSeq = fincVndrSeq;
		this.deYrmon = deYrmon;
		this.agmtSeq = agmtSeq;
		this.eqLotNo = eqLotNo;
		this.toSerNo = toSerNo;
		this.eqSpecNo = eqSpecNo;
		this.updUsrId = updUsrId;
		this.eqPfxCd = eqPfxCd;
		this.agmtVerNo = agmtVerNo;
		this.updDt = updDt;
		this.creDt = creDt;
		this.eqKndCd = eqKndCd;
		this.creUsrId = creUsrId;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fm_ser_no", getFmSerNo());
		this.hashColumns.put("finc_vndr_seq", getFincVndrSeq());
		this.hashColumns.put("de_yrmon", getDeYrmon());
		this.hashColumns.put("agmt_seq", getAgmtSeq());
		this.hashColumns.put("eq_lot_no", getEqLotNo());
		this.hashColumns.put("to_ser_no", getToSerNo());
		this.hashColumns.put("eq_spec_no", getEqSpecNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("eq_pfx_cd", getEqPfxCd());
		this.hashColumns.put("agmt_ver_no", getAgmtVerNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eq_knd_cd", getEqKndCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fm_ser_no", "fmSerNo");
		this.hashFields.put("finc_vndr_seq", "fincVndrSeq");
		this.hashFields.put("de_yrmon", "deYrmon");
		this.hashFields.put("agmt_seq", "agmtSeq");
		this.hashFields.put("eq_lot_no", "eqLotNo");
		this.hashFields.put("to_ser_no", "toSerNo");
		this.hashFields.put("eq_spec_no", "eqSpecNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("eq_pfx_cd", "eqPfxCd");
		this.hashFields.put("agmt_ver_no", "agmtVerNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eq_knd_cd", "eqKndCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getFmSerNo() {
		return this.fmSerNo;
	}
	public String getFincVndrSeq() {
		return this.fincVndrSeq;
	}
	public String getDeYrmon() {
		return this.deYrmon;
	}
	public String getAgmtSeq() {
		return this.agmtSeq;
	}
	public String getEqLotNo() {
		return this.eqLotNo;
	}
	public String getToSerNo() {
		return this.toSerNo;
	}
	public String getEqSpecNo() {
		return this.eqSpecNo;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getEqPfxCd() {
		return this.eqPfxCd;
	}
	public String getAgmtVerNo() {
		return this.agmtVerNo;
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
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setFmSerNo(String fmSerNo) {
		this.fmSerNo = fmSerNo;
		//this.fmSerNo=true;
	}
	public void setFincVndrSeq(String fincVndrSeq) {
		this.fincVndrSeq = fincVndrSeq;
		//this.fincVndrSeq=true;
	}
	public void setDeYrmon(String deYrmon) {
		this.deYrmon = deYrmon;
		//this.deYrmon=true;
	}
	public void setAgmtSeq(String agmtSeq) {
		this.agmtSeq = agmtSeq;
		//this.agmtSeq=true;
	}
	public void setEqLotNo(String eqLotNo) {
		this.eqLotNo = eqLotNo;
		//this.eqLotNo=true;
	}
	public void setToSerNo(String toSerNo) {
		this.toSerNo = toSerNo;
		//this.toSerNo=true;
	}
	public void setEqSpecNo(String eqSpecNo) {
		this.eqSpecNo = eqSpecNo;
		//this.eqSpecNo=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setEqPfxCd(String eqPfxCd) {
		this.eqPfxCd = eqPfxCd;
		//this.eqPfxCd=true;
	}
	public void setAgmtVerNo(String agmtVerNo) {
		this.agmtVerNo = agmtVerNo;
		//this.agmtVerNo=true;
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
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		//this.agmtOfcCtyCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFmSerNo(JSPUtil.getParameter(request, "fm_ser_no", ""));
		setFincVndrSeq(JSPUtil.getParameter(request, "finc_vndr_seq", ""));
		setDeYrmon(JSPUtil.getParameter(request, "de_yrmon", ""));
		setAgmtSeq(JSPUtil.getParameter(request, "agmt_seq", ""));
		setEqLotNo(JSPUtil.getParameter(request, "eq_lot_no", ""));
		setToSerNo(JSPUtil.getParameter(request, "to_ser_no", ""));
		setEqSpecNo(JSPUtil.getParameter(request, "eq_spec_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEqPfxCd(JSPUtil.getParameter(request, "eq_pfx_cd", ""));
		setAgmtVerNo(JSPUtil.getParameter(request, "agmt_ver_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEqKndCd(JSPUtil.getParameter(request, "eq_knd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public CgmEqLotVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmEqLotVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmEqLotVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] fmSerNo = (JSPUtil.getParameter(request, prefix	+ "fm_ser_no".trim(), length));
			String[] fincVndrSeq = (JSPUtil.getParameter(request, prefix	+ "finc_vndr_seq".trim(), length));
			String[] deYrmon = (JSPUtil.getParameter(request, prefix	+ "de_yrmon".trim(), length));
			String[] agmtSeq = (JSPUtil.getParameter(request, prefix	+ "agmt_seq".trim(), length));
			String[] eqLotNo = (JSPUtil.getParameter(request, prefix	+ "eq_lot_no".trim(), length));
			String[] toSerNo = (JSPUtil.getParameter(request, prefix	+ "to_ser_no".trim(), length));
			String[] eqSpecNo = (JSPUtil.getParameter(request, prefix	+ "eq_spec_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] eqPfxCd = (JSPUtil.getParameter(request, prefix	+ "eq_pfx_cd".trim(), length));
			String[] agmtVerNo = (JSPUtil.getParameter(request, prefix	+ "agmt_ver_no".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] eqKndCd = (JSPUtil.getParameter(request, prefix	+ "eq_knd_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmEqLotVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fmSerNo[i] != null)
					model.setFmSerNo(fmSerNo[i]);
				if (fincVndrSeq[i] != null)
					model.setFincVndrSeq(fincVndrSeq[i]);
				if (deYrmon[i] != null)
					model.setDeYrmon(deYrmon[i]);
				if (agmtSeq[i] != null)
					model.setAgmtSeq(agmtSeq[i]);
				if (eqLotNo[i] != null)
					model.setEqLotNo(eqLotNo[i]);
				if (toSerNo[i] != null)
					model.setToSerNo(toSerNo[i]);
				if (eqSpecNo[i] != null)
					model.setEqSpecNo(eqSpecNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eqPfxCd[i] != null)
					model.setEqPfxCd(eqPfxCd[i]);
				if (agmtVerNo[i] != null)
					model.setAgmtVerNo(agmtVerNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eqKndCd[i] != null)
					model.setEqKndCd(eqKndCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmEqLotVOs();
	}

	public CgmEqLotVO[] getCgmEqLotVOs(){
		CgmEqLotVO[] vos = (CgmEqLotVO[])models.toArray(new CgmEqLotVO[models.size()]);
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
		this.fmSerNo = this.fmSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fincVndrSeq = this.fincVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deYrmon = this.deYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtSeq = this.agmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqLotNo = this.eqLotNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toSerNo = this.toSerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSpecNo = this.eqSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqPfxCd = this.eqPfxCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtVerNo = this.agmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqKndCd = this.eqKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
