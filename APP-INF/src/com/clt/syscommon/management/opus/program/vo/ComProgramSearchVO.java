/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ComProgramSearchVO.java
*@FileTitle : ComProgramSearchVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.10
*@LastModifier : 정인선
*@LastVersion : 1.0
* 2009.07.10 정인선 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.management.opus.program.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 정인선
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ComProgramSearchVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ComProgramSearchVO> models = new ArrayList<ComProgramSearchVO>();
	
	/* Column Info */
	private String popupFlg = null;
	/* Column Info */
	private String pgmTpCd = null;
	/* Column Info */
	private String useFlg = null;
	/* Column Info */
	private String pgmNm = null;
	/* Column Info */
	private String pgmNo = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pgmUrl = null;
	/* Column Info */
	private String pgmStsCd = null;
	/* Column Info */
	private String devNm = null;
	/* Column Info */
	private String roles = null;
	/* Column Info */
	private String pgmDesc = null;
	/* Column Info */
	private String pgmMnuDivCd = null;
	/* Column Info */
	private String ofcs = null;
	/* Column Info */
	private String devDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ComProgramSearchVO() {}

	public ComProgramSearchVO(String ibflag, String pagerows, String pgmNo, String pgmNm, String pgmDesc, String pgmUrl, String roles, String ofcs, String pgmMnuDivCd, String pgmTpCd, String pgmStsCd, String devNm, String devDt, String popupFlg, String useFlg) {
		this.popupFlg = popupFlg;
		this.pgmTpCd = pgmTpCd;
		this.useFlg = useFlg;
		this.pgmNm = pgmNm;
		this.pgmNo = pgmNo;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.pgmUrl = pgmUrl;
		this.pgmStsCd = pgmStsCd;
		this.devNm = devNm;
		this.roles = roles;
		this.pgmDesc = pgmDesc;
		this.pgmMnuDivCd = pgmMnuDivCd;
		this.ofcs = ofcs;
		this.devDt = devDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("popup_flg", getPopupFlg());
		this.hashColumns.put("pgm_tp_cd", getPgmTpCd());
		this.hashColumns.put("use_flg", getUseFlg());
		this.hashColumns.put("pgm_nm", getPgmNm());
		this.hashColumns.put("pgm_no", getPgmNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pgm_url", getPgmUrl());
		this.hashColumns.put("pgm_sts_cd", getPgmStsCd());
		this.hashColumns.put("dev_nm", getDevNm());
		this.hashColumns.put("roles", getRoles());
		this.hashColumns.put("pgm_desc", getPgmDesc());
		this.hashColumns.put("pgm_mnu_div_cd", getPgmMnuDivCd());
		this.hashColumns.put("ofcs", getOfcs());
		this.hashColumns.put("dev_dt", getDevDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("popup_flg", "popupFlg");
		this.hashFields.put("pgm_tp_cd", "pgmTpCd");
		this.hashFields.put("use_flg", "useFlg");
		this.hashFields.put("pgm_nm", "pgmNm");
		this.hashFields.put("pgm_no", "pgmNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pgm_url", "pgmUrl");
		this.hashFields.put("pgm_sts_cd", "pgmStsCd");
		this.hashFields.put("dev_nm", "devNm");
		this.hashFields.put("roles", "roles");
		this.hashFields.put("pgm_desc", "pgmDesc");
		this.hashFields.put("pgm_mnu_div_cd", "pgmMnuDivCd");
		this.hashFields.put("ofcs", "ofcs");
		this.hashFields.put("dev_dt", "devDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return popupFlg
	 */
	public String getPopupFlg() {
		return this.popupFlg;
	}
	
	/**
	 * Column Info
	 * @return pgmTpCd
	 */
	public String getPgmTpCd() {
		return this.pgmTpCd;
	}
	
	/**
	 * Column Info
	 * @return useFlg
	 */
	public String getUseFlg() {
		return this.useFlg;
	}
	
	/**
	 * Column Info
	 * @return pgmNm
	 */
	public String getPgmNm() {
		return this.pgmNm;
	}
	
	/**
	 * Column Info
	 * @return pgmNo
	 */
	public String getPgmNo() {
		return this.pgmNo;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return pgmUrl
	 */
	public String getPgmUrl() {
		return this.pgmUrl;
	}
	
	/**
	 * Column Info
	 * @return pgmStsCd
	 */
	public String getPgmStsCd() {
		return this.pgmStsCd;
	}
	
	/**
	 * Column Info
	 * @return devNm
	 */
	public String getDevNm() {
		return this.devNm;
	}
	
	/**
	 * Column Info
	 * @return roles
	 */
	public String getRoles() {
		return this.roles;
	}
	
	/**
	 * Column Info
	 * @return pgmDesc
	 */
	public String getPgmDesc() {
		return this.pgmDesc;
	}
	
	/**
	 * Column Info
	 * @return pgmMnuDivCd
	 */
	public String getPgmMnuDivCd() {
		return this.pgmMnuDivCd;
	}
	
	/**
	 * Column Info
	 * @return ofcs
	 */
	public String getOfcs() {
		return this.ofcs;
	}
	
	/**
	 * Column Info
	 * @return devDt
	 */
	public String getDevDt() {
		return this.devDt;
	}
	

	/**
	 * Column Info
	 * @param popupFlg
	 */
	public void setPopupFlg(String popupFlg) {
		this.popupFlg = popupFlg;
	}
	
	/**
	 * Column Info
	 * @param pgmTpCd
	 */
	public void setPgmTpCd(String pgmTpCd) {
		this.pgmTpCd = pgmTpCd;
	}
	
	/**
	 * Column Info
	 * @param useFlg
	 */
	public void setUseFlg(String useFlg) {
		this.useFlg = useFlg;
	}
	
	/**
	 * Column Info
	 * @param pgmNm
	 */
	public void setPgmNm(String pgmNm) {
		this.pgmNm = pgmNm;
	}
	
	/**
	 * Column Info
	 * @param pgmNo
	 */
	public void setPgmNo(String pgmNo) {
		this.pgmNo = pgmNo;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param pgmUrl
	 */
	public void setPgmUrl(String pgmUrl) {
		this.pgmUrl = pgmUrl;
	}
	
	/**
	 * Column Info
	 * @param pgmStsCd
	 */
	public void setPgmStsCd(String pgmStsCd) {
		this.pgmStsCd = pgmStsCd;
	}
	
	/**
	 * Column Info
	 * @param devNm
	 */
	public void setDevNm(String devNm) {
		this.devNm = devNm;
	}
	
	/**
	 * Column Info
	 * @param roles
	 */
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	/**
	 * Column Info
	 * @param pgmDesc
	 */
	public void setPgmDesc(String pgmDesc) {
		this.pgmDesc = pgmDesc;
	}
	
	/**
	 * Column Info
	 * @param pgmMnuDivCd
	 */
	public void setPgmMnuDivCd(String pgmMnuDivCd) {
		this.pgmMnuDivCd = pgmMnuDivCd;
	}
	
	/**
	 * Column Info
	 * @param ofcs
	 */
	public void setOfcs(String ofcs) {
		this.ofcs = ofcs;
	}
	
	/**
	 * Column Info
	 * @param devDt
	 */
	public void setDevDt(String devDt) {
		this.devDt = devDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setPopupFlg(JSPUtil.getParameter(request, "popup_flg", ""));
		setPgmTpCd(JSPUtil.getParameter(request, "pgm_tp_cd", ""));
		setUseFlg(JSPUtil.getParameter(request, "use_flg", ""));
		setPgmNm(JSPUtil.getParameter(request, "pgm_nm", ""));
		setPgmNo(JSPUtil.getParameter(request, "pgm_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPgmUrl(JSPUtil.getParameter(request, "pgm_url", ""));
		setPgmStsCd(JSPUtil.getParameter(request, "pgm_sts_cd", ""));
		setDevNm(JSPUtil.getParameter(request, "dev_nm", ""));
		setRoles(JSPUtil.getParameter(request, "roles", ""));
		setPgmDesc(JSPUtil.getParameter(request, "pgm_desc", ""));
		setPgmMnuDivCd(JSPUtil.getParameter(request, "pgm_mnu_div_cd", ""));
		setOfcs(JSPUtil.getParameter(request, "ofcs", ""));
		setDevDt(JSPUtil.getParameter(request, "dev_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ComProgramSearchVO[]
	 */
	public ComProgramSearchVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ComProgramSearchVO[]
	 */
	public ComProgramSearchVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ComProgramSearchVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] popupFlg = (JSPUtil.getParameter(request, prefix	+ "popup_flg", length));
			String[] pgmTpCd = (JSPUtil.getParameter(request, prefix	+ "pgm_tp_cd", length));
			String[] useFlg = (JSPUtil.getParameter(request, prefix	+ "use_flg", length));
			String[] pgmNm = (JSPUtil.getParameter(request, prefix	+ "pgm_nm", length));
			String[] pgmNo = (JSPUtil.getParameter(request, prefix	+ "pgm_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pgmUrl = (JSPUtil.getParameter(request, prefix	+ "pgm_url", length));
			String[] pgmStsCd = (JSPUtil.getParameter(request, prefix	+ "pgm_sts_cd", length));
			String[] devNm = (JSPUtil.getParameter(request, prefix	+ "dev_nm", length));
			String[] roles = (JSPUtil.getParameter(request, prefix	+ "roles", length));
			String[] pgmDesc = (JSPUtil.getParameter(request, prefix	+ "pgm_desc", length));
			String[] pgmMnuDivCd = (JSPUtil.getParameter(request, prefix	+ "pgm_mnu_div_cd", length));
			String[] ofcs = (JSPUtil.getParameter(request, prefix	+ "ofcs", length));
			String[] devDt = (JSPUtil.getParameter(request, prefix	+ "dev_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new ComProgramSearchVO();
				if (popupFlg[i] != null)
					model.setPopupFlg(popupFlg[i]);
				if (pgmTpCd[i] != null)
					model.setPgmTpCd(pgmTpCd[i]);
				if (useFlg[i] != null)
					model.setUseFlg(useFlg[i]);
				if (pgmNm[i] != null)
					model.setPgmNm(pgmNm[i]);
				if (pgmNo[i] != null)
					model.setPgmNo(pgmNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pgmUrl[i] != null)
					model.setPgmUrl(pgmUrl[i]);
				if (pgmStsCd[i] != null)
					model.setPgmStsCd(pgmStsCd[i]);
				if (devNm[i] != null)
					model.setDevNm(devNm[i]);
				if (roles[i] != null)
					model.setRoles(roles[i]);
				if (pgmDesc[i] != null)
					model.setPgmDesc(pgmDesc[i]);
				if (pgmMnuDivCd[i] != null)
					model.setPgmMnuDivCd(pgmMnuDivCd[i]);
				if (ofcs[i] != null)
					model.setOfcs(ofcs[i]);
				if (devDt[i] != null)
					model.setDevDt(devDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getComProgramSearchVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ComProgramSearchVO[]
	 */
	public ComProgramSearchVO[] getComProgramSearchVOs(){
		ComProgramSearchVO[] vos = (ComProgramSearchVO[])models.toArray(new ComProgramSearchVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.popupFlg = this.popupFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmTpCd = this.pgmTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.useFlg = this.useFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNm = this.pgmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmNo = this.pgmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmUrl = this.pgmUrl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmStsCd = this.pgmStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.devNm = this.devNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.roles = this.roles .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmDesc = this.pgmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pgmMnuDivCd = this.pgmMnuDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcs = this.ofcs .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.devDt = this.devDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
