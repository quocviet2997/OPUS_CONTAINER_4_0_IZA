/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : InvChnChgVO.java
*@FileTitle : InvChnChgVO
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

public class InvChnChgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<InvChnChgVO> models = new ArrayList<InvChnChgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String chgDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String taxChgCd = null;
	/* Column Info */
	private String taxChgLoclNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String taxChgNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public InvChnChgVO() {}

	public InvChnChgVO(String ibflag, String pagerows, String taxChgNo, String arOfcCd, String taxChgCd, String taxChgLoclNm, String chgDesc, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.deltFlg = deltFlg;
		this.chgDesc = chgDesc;
		this.creDt = creDt;
		this.taxChgCd = taxChgCd;
		this.taxChgLoclNm = taxChgLoclNm;
		this.updUsrId = updUsrId;
		this.arOfcCd = arOfcCd;
		this.taxChgNo = taxChgNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("chg_desc", getChgDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("tax_chg_cd", getTaxChgCd());
		this.hashColumns.put("tax_chg_locl_nm", getTaxChgLoclNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("tax_chg_no", getTaxChgNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("chg_desc", "chgDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("tax_chg_cd", "taxChgCd");
		this.hashFields.put("tax_chg_locl_nm", "taxChgLoclNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("tax_chg_no", "taxChgNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getChgDesc() {
		return this.chgDesc;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getTaxChgCd() {
		return this.taxChgCd;
	}
	public String getTaxChgLoclNm() {
		return this.taxChgLoclNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	public String getTaxChgNo() {
		return this.taxChgNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setChgDesc(String chgDesc) {
		this.chgDesc = chgDesc;
		//this.chgDesc=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setTaxChgCd(String taxChgCd) {
		this.taxChgCd = taxChgCd;
		//this.taxChgCd=true;
	}
	public void setTaxChgLoclNm(String taxChgLoclNm) {
		this.taxChgLoclNm = taxChgLoclNm;
		//this.taxChgLoclNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
		//this.arOfcCd=true;
	}
	public void setTaxChgNo(String taxChgNo) {
		this.taxChgNo = taxChgNo;
		//this.taxChgNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setChgDesc(JSPUtil.getParameter(request, "chg_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTaxChgCd(JSPUtil.getParameter(request, "tax_chg_cd", ""));
		setTaxChgLoclNm(JSPUtil.getParameter(request, "tax_chg_locl_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setArOfcCd(JSPUtil.getParameter(request, "ar_ofc_cd", ""));
		setTaxChgNo(JSPUtil.getParameter(request, "tax_chg_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public InvChnChgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public InvChnChgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		InvChnChgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] chgDesc = (JSPUtil.getParameter(request, prefix	+ "chg_desc".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] taxChgCd = (JSPUtil.getParameter(request, prefix	+ "tax_chg_cd".trim(), length));
			String[] taxChgLoclNm = (JSPUtil.getParameter(request, prefix	+ "tax_chg_locl_nm".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd".trim(), length));
			String[] taxChgNo = (JSPUtil.getParameter(request, prefix	+ "tax_chg_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new InvChnChgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (chgDesc[i] != null)
					model.setChgDesc(chgDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (taxChgCd[i] != null)
					model.setTaxChgCd(taxChgCd[i]);
				if (taxChgLoclNm[i] != null)
					model.setTaxChgLoclNm(taxChgLoclNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (taxChgNo[i] != null)
					model.setTaxChgNo(taxChgNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getInvChnChgVOs();
	}

	public InvChnChgVO[] getInvChnChgVOs(){
		InvChnChgVO[] vos = (InvChnChgVO[])models.toArray(new InvChnChgVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgDesc = this.chgDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxChgCd = this.taxChgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxChgLoclNm = this.taxChgLoclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxChgNo = this.taxChgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
