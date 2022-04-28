/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PackageTypeVO.java
*@FileTitle : PackageTypeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.07.28 김석준 
* 1.0 Creation
=========================================================*/

package com.clt.bizcommon.packagetype.vo;

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
 * @author 김석준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PackageTypeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PackageTypeVO> models = new ArrayList<PackageTypeVO>();
	
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pckCd = null;
	/* Column Info */
	private String pckNm = null;
	/* Column Info */
	private String usaCstmsPckCd = null;
	
	/*
	 * 20120208 added by JUN SUNG, KIM
	 * mdm yn 추가 관련 param
	 */
	private String mdmYN = null;
	private String deltFlg = null;
	
	
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PackageTypeVO() {}

	public PackageTypeVO(String ibflag, String pagerows, String pckCd, String pckNm, String usaCstmsPckCd) {
		this.ibflag = ibflag;
		this.pckCd = pckCd;
		this.pckNm = pckNm;
		this.usaCstmsPckCd = usaCstmsPckCd;
		this.pagerows = pagerows;
	}
	
	public PackageTypeVO(String ibflag, String pagerows, String pckCd, String pckNm, String usaCstmsPckCd, String mdmYN, String deltFlg) {
		this.ibflag = ibflag;
		this.pckCd = pckCd;
		this.pckNm = pckNm;
		this.usaCstmsPckCd = usaCstmsPckCd;
		this.mdmYN = mdmYN;
		this.deltFlg = deltFlg;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pck_cd", getPckCd());
		this.hashColumns.put("pck_nm", getPckNm());
		this.hashColumns.put("usa_cstms_pck_cd", getUsaCstmsPckCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pck_cd", "pckCd");
		this.hashFields.put("pck_nm", "pckNm");
		this.hashFields.put("usa_cstms_pck_cd", "usaCstmsPckCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
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
	 * @return pckCd
	 */
	public String getPckCd() {
		return this.pckCd;
	}
	
	/**
	 * Column Info
	 * @return pckNm
	 */
	public String getPckNm() {
		return this.pckNm;
	}
	
	/**
	 * Column Info
	 * @return usaCstmsPckCd
	 */
	public String getUsaCstmsPckCd() {
		return this.usaCstmsPckCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}

	
	public String getMdmYN() {
		return mdmYN;
	}

	public void setMdmYN(String mdmYN) {
		this.mdmYN = mdmYN;
	}

	public String getDeltFlg() {
		return deltFlg;
	}

	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param pckCd
	 */
	public void setPckCd(String pckCd) {
		this.pckCd = pckCd;
	}
	
	/**
	 * Column Info
	 * @param pckNm
	 */
	public void setPckNm(String pckNm) {
		this.pckNm = pckNm;
	}
	
	/**
	 * Column Info
	 * @param usaCstmsPckCd
	 */
	public void setUsaCstmsPckCd(String usaCstmsPckCd) {
		this.usaCstmsPckCd = usaCstmsPckCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPckCd(JSPUtil.getParameter(request, "pck_cd", ""));
		setPckNm(JSPUtil.getParameter(request, "pck_nm", ""));
		setUsaCstmsPckCd(JSPUtil.getParameter(request, "usa_cstms_pck_cd", ""));
		setMdmYN(JSPUtil.getParameter(request, "mdm_yn", ""));
		if("Y".equals(this.mdmYN)){
			setDeltFlg(JSPUtil.getParameter(request, "delt_flg", "N"));
		}else{
			setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		}
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PackageTypeVO[]
	 */
	public PackageTypeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PackageTypeVO[]
	 */
	public PackageTypeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PackageTypeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pckCd = (JSPUtil.getParameter(request, prefix	+ "pck_cd", length));
			String[] pckNm = (JSPUtil.getParameter(request, prefix	+ "pck_nm", length));
			String[] usaCstmsPckCd = (JSPUtil.getParameter(request, prefix	+ "usa_cstms_pck_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new PackageTypeVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pckCd[i] != null)
					model.setPckCd(pckCd[i]);
				if (pckNm[i] != null)
					model.setPckNm(pckNm[i]);
				if (usaCstmsPckCd[i] != null)
					model.setUsaCstmsPckCd(usaCstmsPckCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPackageTypeVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PackageTypeVO[]
	 */
	public PackageTypeVO[] getPackageTypeVOs(){
		PackageTypeVO[] vos = (PackageTypeVO[])models.toArray(new PackageTypeVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckCd = this.pckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckNm = this.pckNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaCstmsPckCd = this.usaCstmsPckCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
