/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComUpldFile.java
*@FileTitle : ComUpldFile
*Open Issues :
*Change history :
*@LastModifyDate : 2009.01.06
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.01.06 정인선
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 정인선
 * @since J2EE 1.5
 */

public class ComUpldFile implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String updDt = null;
	/* 컬럼 설명	*/
	private String pgmSubSysCd = null;
	/* 컬럼 설명	*/
	private String fileSavId = null;
	/* 컬럼 설명	*/
	private String creUsrId = null;
	/* 컬럼 설명	*/
	private String fileUpldNm = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String deltFlg = null;
	/* 컬럼 설명	*/
	private String fileSzCapa = null;
	/* 컬럼 설명	*/
	private String creDt = null;
	/* 컬럼 설명	*/
	private String filePathUrl = null;
	/* 컬럼 설명	*/
	private String updUsrId = null;
	/* 컬럼 설명	*/
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public ComUpldFile() {}

	public ComUpldFile(String ibflag, String pagerows, String fileSavId, String fileUpldNm, String fileSzCapa, String filePathUrl, String pgmSubSysCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.pgmSubSysCd = pgmSubSysCd;
		this.fileSavId = fileSavId;
		this.creUsrId = creUsrId;
		this.fileUpldNm = fileUpldNm;
		this.ibflag = ibflag;
		this.deltFlg = deltFlg;
		this.fileSzCapa = fileSzCapa;
		this.creDt = creDt;
		this.filePathUrl = filePathUrl;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("upd_dt", getUpdDt());
		this.hashColumn.put("pgm_sub_sys_cd", getPgmSubSysCd());
		this.hashColumn.put("file_sav_id", getFileSavId());
		this.hashColumn.put("cre_usr_id", getCreUsrId());
		this.hashColumn.put("file_upld_nm", getFileUpldNm());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("delt_flg", getDeltFlg());
		this.hashColumn.put("file_sz_capa", getFileSzCapa());
		this.hashColumn.put("cre_dt", getCreDt());
		this.hashColumn.put("file_path_url", getFilePathUrl());
		this.hashColumn.put("upd_usr_id", getUpdUsrId());
		this.hashColumn.put("pagerows", getPagerows());
		return this.hashColumn;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getPgmSubSysCd() {
		return this.pgmSubSysCd;
	}
	public String getFileSavId() {
		return this.fileSavId;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getFileUpldNm() {
		return this.fileUpldNm;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getFileSzCapa() {
		return this.fileSzCapa;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getFilePathUrl() {
		return this.filePathUrl;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setPgmSubSysCd(String pgmSubSysCd) {
		this.pgmSubSysCd = pgmSubSysCd;
		//this.pgmSubSysCd=true;
	}
	public void setFileSavId(String fileSavId) {
		this.fileSavId = fileSavId;
		//this.fileSavId=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setFileUpldNm(String fileUpldNm) {
		this.fileUpldNm = fileUpldNm;
		//this.fileUpldNm=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setFileSzCapa(String fileSzCapa) {
		this.fileSzCapa = fileSzCapa;
		//this.fileSzCapa=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setFilePathUrl(String filePathUrl) {
		this.filePathUrl = filePathUrl;
		//this.filePathUrl=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public static ComUpldFile fromRequest(HttpServletRequest request) {
		ComUpldFile model = new ComUpldFile();
		try {
			model.setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
			model.setPgmSubSysCd(JSPUtil.getParameter(request, "pgm_sub_sys_cd", ""));
			model.setFileSavId(JSPUtil.getParameter(request, "file_sav_id", ""));
			model.setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
			model.setFileUpldNm(JSPUtil.getParameter(request, "file_upld_nm", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
			model.setFileSzCapa(JSPUtil.getParameter(request, "file_sz_capa", ""));
			model.setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
			model.setFilePathUrl(JSPUtil.getParameter(request, "file_path_url", ""));
			model.setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
			model.setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<ComUpldFile> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<ComUpldFile> fromRequestGrid(HttpServletRequest request, String prefix) {
		ComUpldFile model = null;
		Collection<ComUpldFile> models = new ArrayList<ComUpldFile>();

		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] pgmSubSysCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sub_sys_cd".trim(), length));
			String[] fileSavId = (JSPUtil.getParameter(request, prefix	+ "file_sav_id".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] fileUpldNm = (JSPUtil.getParameter(request, prefix	+ "file_upld_nm".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] fileSzCapa = (JSPUtil.getParameter(request, prefix	+ "file_sz_capa".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] filePathUrl = (JSPUtil.getParameter(request, prefix	+ "file_path_url".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ComUpldFile();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (pgmSubSysCd[i] != null)
					model.setPgmSubSysCd(pgmSubSysCd[i]);
				if (fileSavId[i] != null)
					model.setFileSavId(fileSavId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fileUpldNm[i] != null)
					model.setFileUpldNm(fileUpldNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (fileSzCapa[i] != null)
					model.setFileSzCapa(fileSzCapa[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (filePathUrl[i] != null)
					model.setFilePathUrl(filePathUrl[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
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

}
