/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvArGiroVO.java
*@FileTitle : InvArGiroVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.04.27 김세일 
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
 * @author 김세일
 * @since J2EE 1.5
 */

public class InvArGiroVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvArGiroVO> models = new ArrayList<InvArGiroVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String giroRmk = null;
	/* Column Info */
	private String blSrcNo = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String tvaGiroAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String issDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String splGiroAmt = null;
	/* Column Info */
	private String giroNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvArGiroVO() {}

	public InvArGiroVO(String ibflag, String pagerows, String giroNo, String blSrcNo, String arOfcCd, String splGiroAmt, String tvaGiroAmt, String issDt, String giroRmk, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.giroRmk = giroRmk;
		this.blSrcNo = blSrcNo;
		this.deltFlg = deltFlg;
		this.tvaGiroAmt = tvaGiroAmt;
		this.creDt = creDt;
		this.arOfcCd = arOfcCd;
		this.pagerows = pagerows;
		this.issDt = issDt;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.splGiroAmt = splGiroAmt;
		this.giroNo = giroNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("giro_rmk", getGiroRmk());
		this.hashColumns.put("bl_src_no", getBlSrcNo());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("tva_giro_amt", getTvaGiroAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("iss_dt", getIssDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("spl_giro_amt", getSplGiroAmt());
		this.hashColumns.put("giro_no", getGiroNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("giro_rmk", "giroRmk");
		this.hashFields.put("bl_src_no", "blSrcNo");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("tva_giro_amt", "tvaGiroAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("iss_dt", "issDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("spl_giro_amt", "splGiroAmt");
		this.hashFields.put("giro_no", "giroNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getGiroRmk() {
		return this.giroRmk;
	}
	public String getBlSrcNo() {
		return this.blSrcNo;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getTvaGiroAmt() {
		return this.tvaGiroAmt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getIssDt() {
		return this.issDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getSplGiroAmt() {
		return this.splGiroAmt;
	}
	public String getGiroNo() {
		return this.giroNo;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setGiroRmk(String giroRmk) {
		this.giroRmk = giroRmk;
		//this.giroRmk=true;
	}
	public void setBlSrcNo(String blSrcNo) {
		this.blSrcNo = blSrcNo;
		//this.blSrcNo=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setTvaGiroAmt(String tvaGiroAmt) {
		this.tvaGiroAmt = tvaGiroAmt;
		//this.tvaGiroAmt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setIssDt(String issDt) {
		this.issDt = issDt;
		//this.issDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setSplGiroAmt(String splGiroAmt) {
		this.splGiroAmt = splGiroAmt;
		//this.splGiroAmt=true;
	}
	public void setGiroNo(String giroNo) {
		this.giroNo = giroNo;
		//this.giroNo=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setGiroRmk(JSPUtil.getParameter(request, "giro_rmk", ""));
		setBlSrcNo(JSPUtil.getParameter(request, "bl_src_no", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setTvaGiroAmt(JSPUtil.getParameter(request, "tva_giro_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIssDt(JSPUtil.getParameter(request, "iss_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSplGiroAmt(JSPUtil.getParameter(request, "spl_giro_amt", ""));
		setGiroNo(JSPUtil.getParameter(request, "giro_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	public InvArGiroVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvArGiroVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvArGiroVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] giroRmk = (JSPUtil.getParameter(request, prefix	+ "giro_rmk".trim(), length));
			String[] blSrcNo = (JSPUtil.getParameter(request, prefix	+ "bl_src_no".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] tvaGiroAmt = (JSPUtil.getParameter(request, prefix	+ "tva_giro_amt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] issDt = (JSPUtil.getParameter(request, prefix	+ "iss_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] splGiroAmt = (JSPUtil.getParameter(request, prefix	+ "spl_giro_amt".trim(), length));
			String[] giroNo = (JSPUtil.getParameter(request, prefix	+ "giro_no".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvArGiroVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (giroRmk[i] != null)
					model.setGiroRmk(giroRmk[i]);
				if (blSrcNo[i] != null)
					model.setBlSrcNo(blSrcNo[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (tvaGiroAmt[i] != null)
					model.setTvaGiroAmt(tvaGiroAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (issDt[i] != null)
					model.setIssDt(issDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (splGiroAmt[i] != null)
					model.setSplGiroAmt(splGiroAmt[i]);
				if (giroNo[i] != null)
					model.setGiroNo(giroNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvArGiroVOs();
	}

	public InvArGiroVO[] getInvArGiroVOs(){
		InvArGiroVO[] vos = (InvArGiroVO[])models.toArray(new InvArGiroVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.giroRmk = this.giroRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blSrcNo = this.blSrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tvaGiroAmt = this.tvaGiroAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.issDt = this.issDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.splGiroAmt = this.splGiroAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.giroNo = this.giroNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
