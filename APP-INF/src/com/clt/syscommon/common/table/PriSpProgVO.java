/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSpProgVO.java
*@FileTitle : PriSpProgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 변영주
*@LastVersion : 1.0
* 2009.05.06 변영주 
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
 * @author 변영주
 * @since J2EE 1.5
 */

public class PriSpProgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSpProgVO> models = new ArrayList<PriSpProgVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String progUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String propStsCd = null;
	/* Column Info */
	private String progOfcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String progDt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSpProgVO() {}

	public PriSpProgVO(String ibflag, String pagerows, String propNo, String amdtSeq, String propStsCd, String progUsrId, String progOfcCd, String progDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.progUsrId = progUsrId;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.propStsCd = propStsCd;
		this.progOfcCd = progOfcCd;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.propNo = propNo;
		this.amdtSeq = amdtSeq;
		this.pagerows = pagerows;
		this.progDt = progDt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("prog_usr_id", getProgUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("prop_sts_cd", getPropStsCd());
		this.hashColumns.put("prog_ofc_cd", getProgOfcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prog_dt", getProgDt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("prog_usr_id", "progUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("prop_sts_cd", "propStsCd");
		this.hashFields.put("prog_ofc_cd", "progOfcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("prog_dt", "progDt");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getProgUsrId() {
		return this.progUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getPropStsCd() {
		return this.propStsCd;
	}
	public String getProgOfcCd() {
		return this.progOfcCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPropNo() {
		return this.propNo;
	}
	public String getAmdtSeq() {
		return this.amdtSeq;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getProgDt() {
		return this.progDt;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setProgUsrId(String progUsrId) {
		this.progUsrId = progUsrId;
		//this.progUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setPropStsCd(String propStsCd) {
		this.propStsCd = propStsCd;
		//this.propStsCd=true;
	}
	public void setProgOfcCd(String progOfcCd) {
		this.progOfcCd = progOfcCd;
		//this.progOfcCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPropNo(String propNo) {
		this.propNo = propNo;
		//this.propNo=true;
	}
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
		//this.amdtSeq=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setProgDt(String progDt) {
		this.progDt = progDt;
		//this.progDt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setProgUsrId(JSPUtil.getParameter(request, "prog_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPropStsCd(JSPUtil.getParameter(request, "prop_sts_cd", ""));
		setProgOfcCd(JSPUtil.getParameter(request, "prog_ofc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setProgDt(JSPUtil.getParameter(request, "prog_dt", ""));
	}

	public PriSpProgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PriSpProgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSpProgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] progUsrId = (JSPUtil.getParameter(request, prefix	+ "prog_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] propStsCd = (JSPUtil.getParameter(request, prefix	+ "prop_sts_cd".trim(), length));
			String[] progOfcCd = (JSPUtil.getParameter(request, prefix	+ "prog_ofc_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no".trim(), length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] progDt = (JSPUtil.getParameter(request, prefix	+ "prog_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSpProgVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (progUsrId[i] != null)
					model.setProgUsrId(progUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (propStsCd[i] != null)
					model.setPropStsCd(propStsCd[i]);
				if (progOfcCd[i] != null)
					model.setProgOfcCd(progOfcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (progDt[i] != null)
					model.setProgDt(progDt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPriSpProgVOs();
	}

	public PriSpProgVO[] getPriSpProgVOs(){
		PriSpProgVO[] vos = (PriSpProgVO[])models.toArray(new PriSpProgVO[models.size()]);
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
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progUsrId = this.progUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propStsCd = this.propStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progOfcCd = this.progOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.progDt = this.progDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
