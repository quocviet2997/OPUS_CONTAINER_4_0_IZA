/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PackageTypeVO.java
*@FileTitle : PackageTypeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.16
*@LastModifier : 우지석
*@LastVersion : 1.0
* 2009.04.16 우지석 
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
 * @author 우지석
 * @since J2EE 1.5
 */

public class PackageTypeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PackageTypeVO> models = new ArrayList<PackageTypeVO>();
	
	/* Column Inpo */
	private String pkgHancos = null;
	/* Column Inpo */
	private String pkgAuthid = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String pkgDelind = null;
	/* Column Inpo */
	private String pkgUpdt = null;
	/* Column Inpo */
	private String pkgAms = null;
	/* Column Inpo */
	private String pkgCd = null;
	/* Column Inpo */
	private String pkgJapan = null;
	/* Column Inpo */
	private String pkgDesc = null;
	/* Column Inpo */
	private String pkgCredt = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PackageTypeVO() {}

	public PackageTypeVO(String ibflag, String pagerows, String pkgCd, String pkgDesc, String pkgAms, String pkgCredt, String pkgUpdt, String pkgAuthid, String pkgDelind, String pkgHancos, String pkgJapan) {
		this.pkgHancos = pkgHancos;
		this.pkgAuthid = pkgAuthid;
		this.ibflag = ibflag;
		this.pkgDelind = pkgDelind;
		this.pkgUpdt = pkgUpdt;
		this.pkgAms = pkgAms;
		this.pkgCd = pkgCd;
		this.pkgJapan = pkgJapan;
		this.pkgDesc = pkgDesc;
		this.pkgCredt = pkgCredt;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pkg_hancos", getPkgHancos());
		this.hashColumns.put("pkg_authid", getPkgAuthid());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pkg_delind", getPkgDelind());
		this.hashColumns.put("pkg_updt", getPkgUpdt());
		this.hashColumns.put("pkg_ams", getPkgAms());
		this.hashColumns.put("pkg_cd", getPkgCd());
		this.hashColumns.put("pkg_japan", getPkgJapan());
		this.hashColumns.put("pkg_desc", getPkgDesc());
		this.hashColumns.put("pkg_credt", getPkgCredt());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pkg_hancos", "pkgHancos");
		this.hashFields.put("pkg_authid", "pkgAuthid");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pkg_delind", "pkgDelind");
		this.hashFields.put("pkg_updt", "pkgUpdt");
		this.hashFields.put("pkg_ams", "pkgAms");
		this.hashFields.put("pkg_cd", "pkgCd");
		this.hashFields.put("pkg_japan", "pkgJapan");
		this.hashFields.put("pkg_desc", "pkgDesc");
		this.hashFields.put("pkg_credt", "pkgCredt");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getPkgHancos() {
		return this.pkgHancos;
	}
	public String getPkgAuthid() {
		return this.pkgAuthid;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getPkgDelind() {
		return this.pkgDelind;
	}
	public String getPkgUpdt() {
		return this.pkgUpdt;
	}
	public String getPkgAms() {
		return this.pkgAms;
	}
	public String getPkgCd() {
		return this.pkgCd;
	}
	public String getPkgJapan() {
		return this.pkgJapan;
	}
	public String getPkgDesc() {
		return this.pkgDesc;
	}
	public String getPkgCredt() {
		return this.pkgCredt;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setPkgHancos(String pkgHancos) {
		this.pkgHancos = pkgHancos;
		//this.pkgHancos=true;
	}
	public void setPkgAuthid(String pkgAuthid) {
		this.pkgAuthid = pkgAuthid;
		//this.pkgAuthid=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setPkgDelind(String pkgDelind) {
		this.pkgDelind = pkgDelind;
		//this.pkgDelind=true;
	}
	public void setPkgUpdt(String pkgUpdt) {
		this.pkgUpdt = pkgUpdt;
		//this.pkgUpdt=true;
	}
	public void setPkgAms(String pkgAms) {
		this.pkgAms = pkgAms;
		//this.pkgAms=true;
	}
	public void setPkgCd(String pkgCd) {
		this.pkgCd = pkgCd;
		//this.pkgCd=true;
	}
	public void setPkgJapan(String pkgJapan) {
		this.pkgJapan = pkgJapan;
		//this.pkgJapan=true;
	}
	public void setPkgDesc(String pkgDesc) {
		this.pkgDesc = pkgDesc;
		//this.pkgDesc=true;
	}
	public void setPkgCredt(String pkgCredt) {
		this.pkgCredt = pkgCredt;
		//this.pkgCredt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setPkgHancos(JSPUtil.getParameter(request, "pkg_hancos", ""));
		setPkgAuthid(JSPUtil.getParameter(request, "pkg_authid", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPkgDelind(JSPUtil.getParameter(request, "pkg_delind", ""));
		setPkgUpdt(JSPUtil.getParameter(request, "pkg_updt", ""));
		setPkgAms(JSPUtil.getParameter(request, "pkg_ams", ""));
		setPkgCd(JSPUtil.getParameter(request, "pkg_cd", ""));
		setPkgJapan(JSPUtil.getParameter(request, "pkg_japan", ""));
		setPkgDesc(JSPUtil.getParameter(request, "pkg_desc", ""));
		setPkgCredt(JSPUtil.getParameter(request, "pkg_credt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public PackageTypeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PackageTypeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PackageTypeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pkgHancos = (JSPUtil.getParameter(request, prefix	+ "pkg_hancos".trim(), length));
			String[] pkgAuthid = (JSPUtil.getParameter(request, prefix	+ "pkg_authid".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] pkgDelind = (JSPUtil.getParameter(request, prefix	+ "pkg_delind".trim(), length));
			String[] pkgUpdt = (JSPUtil.getParameter(request, prefix	+ "pkg_updt".trim(), length));
			String[] pkgAms = (JSPUtil.getParameter(request, prefix	+ "pkg_ams".trim(), length));
			String[] pkgCd = (JSPUtil.getParameter(request, prefix	+ "pkg_cd".trim(), length));
			String[] pkgJapan = (JSPUtil.getParameter(request, prefix	+ "pkg_japan".trim(), length));
			String[] pkgDesc = (JSPUtil.getParameter(request, prefix	+ "pkg_desc".trim(), length));
			String[] pkgCredt = (JSPUtil.getParameter(request, prefix	+ "pkg_credt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PackageTypeVO();
				if (pkgHancos[i] != null)
					model.setPkgHancos(pkgHancos[i]);
				if (pkgAuthid[i] != null)
					model.setPkgAuthid(pkgAuthid[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pkgDelind[i] != null)
					model.setPkgDelind(pkgDelind[i]);
				if (pkgUpdt[i] != null)
					model.setPkgUpdt(pkgUpdt[i]);
				if (pkgAms[i] != null)
					model.setPkgAms(pkgAms[i]);
				if (pkgCd[i] != null)
					model.setPkgCd(pkgCd[i]);
				if (pkgJapan[i] != null)
					model.setPkgJapan(pkgJapan[i]);
				if (pkgDesc[i] != null)
					model.setPkgDesc(pkgDesc[i]);
				if (pkgCredt[i] != null)
					model.setPkgCredt(pkgCredt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPackageTypeVOs();
	}

	public PackageTypeVO[] getPackageTypeVOs(){
		PackageTypeVO[] vos = (PackageTypeVO[])models.toArray(new PackageTypeVO[models.size()]);
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
		this.pkgHancos = this.pkgHancos .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgAuthid = this.pkgAuthid .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgDelind = this.pkgDelind .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgUpdt = this.pkgUpdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgAms = this.pkgAms .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgCd = this.pkgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgJapan = this.pkgJapan .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgDesc = this.pkgDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkgCredt = this.pkgCredt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
