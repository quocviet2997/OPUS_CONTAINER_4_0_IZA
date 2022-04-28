/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComProgramVO.java
*@FileTitle : ComProgramVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.16
*@LastModifier : 김경범
*@LastVersion : 1.0
* 2009.02.16 김경범 
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
 * @author 김경범
 * @since J2EE 1.5
 */

public class ComProgramVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComProgramVO> models = new ArrayList<ComProgramVO>();
	
	/* Column Inpo */
	private String pgmSubSysCd = null;
	/* Column Inpo */
	private String pgmNm = null;
	/* Column Inpo */
	private String pgmMnuDivCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String popupFlg = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String pgmDesc = null;
	/* Column Inpo */
	private String pgmNo = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String modiDt = null;
	/* Column Inpo */
	private String pgmStsCd = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String pgmLvlDivCd = null;
	/* Column Inpo */
	private String pgmTpCd = null;
	/* Column Inpo */
	private String useFlg = null;
	/* Column Inpo */
	private String devDt = null;
	/* Column Inpo */
	private String pgmApplCd = null;
	/* Column Inpo */
	private String pgmUrl = null;
	/* Column Inpo */
	private String devNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComProgramVO() {}

	public ComProgramVO(String ibflag, String pagerows, String pgmNo, String pgmApplCd, String pgmSubSysCd, String pgmLvlDivCd, String pgmTpCd, String pgmNm, String pgmDesc, String pgmUrl, String pgmMnuDivCd, String pgmStsCd, String devNm, String devDt, String modiDt, String popupFlg, String useFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.pgmSubSysCd = pgmSubSysCd;
		this.pgmNm = pgmNm;
		this.pgmMnuDivCd = pgmMnuDivCd;
		this.ibflag = ibflag;
		this.popupFlg = popupFlg;
		this.updUsrId = updUsrId;
		this.pgmDesc = pgmDesc;
		this.pgmNo = pgmNo;
		this.updDt = updDt;
		this.modiDt = modiDt;
		this.pgmStsCd = pgmStsCd;
		this.creDt = creDt;
		this.creUsrId = creUsrId;
		this.pgmLvlDivCd = pgmLvlDivCd;
		this.pgmTpCd = pgmTpCd;
		this.useFlg = useFlg;
		this.devDt = devDt;
		this.pgmApplCd = pgmApplCd;
		this.pgmUrl = pgmUrl;
		this.devNm = devNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pgm_sub_sys_cd", getPgmSubSysCd());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("pgm_mnu_div_cd", getPgmMnuDivCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("popup_flg", getPopupFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pgm_desc", getPgmDesc());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("modi_dt", getModiDt());
		this.hashColumns.put("pgm_sts_cd", getPgmStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pgm_lvl_div_cd", getPgmLvlDivCd());
		this.hashColumns.put("pgm_tp_cd", getPgmTpCd());
		this.hashColumns.put("use_flg", getUseFlg());
		this.hashColumns.put("dev_dt", getDevDt());
		this.hashColumns.put("pgm_appl_cd", getPgmApplCd());
		this.hashColumns.put("pgm_url", getPgmUrl());
		this.hashColumns.put("dev_nm", getDevNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pgm_sub_sys_cd", "pgmSubSysCd");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("pgm_mnu_div_cd", "pgmMnuDivCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("popup_flg", "popupFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pgm_desc", "pgmDesc");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("modi_dt", "modiDt");
		this.hashFields.put("pgm_sts_cd", "pgmStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pgm_lvl_div_cd", "pgmLvlDivCd");
		this.hashFields.put("pgm_tp_cd", "pgmTpCd");
		this.hashFields.put("use_flg", "useFlg");
		this.hashFields.put("dev_dt", "devDt");
		this.hashFields.put("pgm_appl_cd", "pgmApplCd");
		this.hashFields.put("pgm_url", "pgmUrl");
		this.hashFields.put("dev_nm", "devNm");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getPgmSubSysCd() {
		return this.pgmSubSysCd;
	}
	public String getPgmNm() {
		return this.pgmNm;
	}
	public String getPgmMnuDivCd() {
		return this.pgmMnuDivCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getPopupFlg() {
		return this.popupFlg;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPgmDesc() {
		return this.pgmDesc;
	}
	public String getPgmNo() {
		return this.pgmNo;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getModiDt() {
		return this.modiDt;
	}
	public String getPgmStsCd() {
		return this.pgmStsCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPgmLvlDivCd() {
		return this.pgmLvlDivCd;
	}
	public String getPgmTpCd() {
		return this.pgmTpCd;
	}
	public String getUseFlg() {
		return this.useFlg;
	}
	public String getDevDt() {
		return this.devDt;
	}
	public String getPgmApplCd() {
		return this.pgmApplCd;
	}
	public String getPgmUrl() {
		return this.pgmUrl;
	}
	public String getDevNm() {
		return this.devNm;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setPgmSubSysCd(String pgmSubSysCd) {
		this.pgmSubSysCd = pgmSubSysCd;
		//this.pgmSubSysCd=true;
	}
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
		//this.pgmNm=true;
	}
	public void setPgmMnuDivCd(String pgmMnuDivCd) {
		this.pgmMnuDivCd = pgmMnuDivCd;
		//this.pgmMnuDivCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setPopupFlg(String popupFlg) {
		this.popupFlg = popupFlg;
		//this.popupFlg=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPgmDesc(String pgmDesc) {
		this.pgmDesc = pgmDesc;
		//this.pgmDesc=true;
	}
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
		//this.pgmNo=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setModiDt(String modiDt) {
		this.modiDt = modiDt;
		//this.modiDt=true;
	}
	public void setPgmStsCd(String pgmStsCd) {
		this.pgmStsCd = pgmStsCd;
		//this.pgmStsCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPgmLvlDivCd(String pgmLvlDivCd) {
		this.pgmLvlDivCd = pgmLvlDivCd;
		//this.pgmLvlDivCd=true;
	}
	public void setPgmTpCd(String pgmTpCd) {
		this.pgmTpCd = pgmTpCd;
		//this.pgmTpCd=true;
	}
	public void setUseFlg(String useFlg) {
		this.useFlg = useFlg;
		//this.useFlg=true;
	}
	public void setDevDt(String devDt) {
		this.devDt = devDt;
		//this.devDt=true;
	}
	public void setPgmApplCd(String pgmApplCd) {
		this.pgmApplCd = pgmApplCd;
		//this.pgmApplCd=true;
	}
	public void setPgmUrl(String pgmUrl) {
		this.pgmUrl = pgmUrl;
		//this.pgmUrl=true;
	}
	public void setDevNm(String devNm) {
		this.devNm = devNm;
		//this.devNm=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setPgmSubSysCd(JSPUtil.getParameter(request, "pgm_sub_sys_cd", ""));
		setPgmNm(JSPUtil.getParameter(request, "pgm_nm", ""));
		setPgmMnuDivCd(JSPUtil.getParameter(request, "pgm_mnu_div_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPopupFlg(JSPUtil.getParameter(request, "popup_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPgmDesc(JSPUtil.getParameter(request, "pgm_desc", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setModiDt(JSPUtil.getParameter(request, "modi_dt", ""));
		setPgmStsCd(JSPUtil.getParameter(request, "pgm_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPgmLvlDivCd(JSPUtil.getParameter(request, "pgm_lvl_div_cd", ""));
		setPgmTpCd(JSPUtil.getParameter(request, "pgm_tp_cd", ""));
		setUseFlg(JSPUtil.getParameter(request, "use_flg", ""));
		setDevDt(JSPUtil.getParameter(request, "dev_dt", ""));
		setPgmApplCd(JSPUtil.getParameter(request, "pgm_appl_cd", ""));
		setPgmUrl(JSPUtil.getParameter(request, "pgm_url", ""));
		setDevNm(JSPUtil.getParameter(request, "dev_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public ComProgramVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ComProgramVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComProgramVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pgmSubSysCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sub_sys_cd".trim(), length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm".trim(), length));
			String[] pgmMnuDivCd = (JSPUtil.getParameter(request, prefix	+ "pgm_mnu_div_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] popupFlg = (JSPUtil.getParameter(request, prefix	+ "popup_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pgmDesc = (JSPUtil.getParameter(request, prefix	+ "pgm_desc".trim(), length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] modiDt = (JSPUtil.getParameter(request, prefix	+ "modi_dt".trim(), length));
			String[] pgmStsCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sts_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pgmLvlDivCd = (JSPUtil.getParameter(request, prefix	+ "pgm_lvl_div_cd".trim(), length));
			String[] pgmTpCd = (JSPUtil.getParameter(request, prefix	+ "pgm_tp_cd".trim(), length));
			String[] useFlg = (JSPUtil.getParameter(request, prefix	+ "use_flg".trim(), length));
			String[] devDt = (JSPUtil.getParameter(request, prefix	+ "dev_dt".trim(), length));
			String[] pgmApplCd = (JSPUtil.getParameter(request, prefix	+ "pgm_appl_cd".trim(), length));
			String[] pgmUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_url".trim(), length));
			String[] devNm = (JSPUtil.getParameter(request, prefix	+ "dev_nm".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComProgramVO();
				if (pgmSubSysCd[i] != null)
					model.setPgmSubSysCd(pgmSubSysCd[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (pgmMnuDivCd[i] != null)
					model.setPgmMnuDivCd(pgmMnuDivCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (popupFlg[i] != null)
					model.setPopupFlg(popupFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pgmDesc[i] != null)
					model.setPgmDesc(pgmDesc[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (modiDt[i] != null)
					model.setModiDt(modiDt[i]);
				if (pgmStsCd[i] != null)
					model.setPgmStsCd(pgmStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pgmLvlDivCd[i] != null)
					model.setPgmLvlDivCd(pgmLvlDivCd[i]);
				if (pgmTpCd[i] != null)
					model.setPgmTpCd(pgmTpCd[i]);
				if (useFlg[i] != null)
					model.setUseFlg(useFlg[i]);
				if (devDt[i] != null)
					model.setDevDt(devDt[i]);
				if (pgmApplCd[i] != null)
					model.setPgmApplCd(pgmApplCd[i]);
				if (pgmUrl[i] != null)
					model.setPgmUrl(pgmUrl[i]);
				if (devNm[i] != null)
					model.setDevNm(devNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getComProgramVOs();
	}

	public ComProgramVO[] getComProgramVOs(){
		ComProgramVO[] vos = (ComProgramVO[])models.toArray(new ComProgramVO[models.size()]);
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
		this.pgmSubSysCd = this.pgmSubSysCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmMnuDivCd = this.pgmMnuDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.popupFlg = this.popupFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmDesc = this.pgmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiDt = this.modiDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmStsCd = this.pgmStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmLvlDivCd = this.pgmLvlDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmTpCd = this.pgmTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.useFlg = this.useFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.devDt = this.devDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmApplCd = this.pgmApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmUrl = this.pgmUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.devNm = this.devNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
