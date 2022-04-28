/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmCrCustVO.java
*@FileTitle : MdmCrCustVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.03
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2009.06.03 박성호 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 박성호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgMdmCrCustVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgMdmCrCustVO> models = new ArrayList<BkgMdmCrCustVO>();
	
	/* Column Info */
	private String ibEml = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String loclNm = null;
	/* Column Info */
	private String crCustTpCd = null;
	/* Column Info */
	private String obEml = null;
	/* Column Info */
	private String actCustCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String crCustRmk = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String loclZipCd = null;
	/* Column Info */
	private String addr1 = null;
	/* Column Info */
	private String addr2 = null;
	/* Column Info */
	private String krIbOfcCd = null;
	/* Column Info */
	private String faxNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgMdmCrCustVO() {}
/**
 * 
 * @param ibflag
 * @param pagerows
 * @param actCustCd
 * @param obEml
 * @param ibEml
 * @param loclNm
 * @param addr1
 * @param addr2
 * @param crCustTpCd
 * @param krIbOfcCd
 * @param loclZipCd
 * @param phnNo
 * @param faxNo
 * @param crCustRmk
 */
	public BkgMdmCrCustVO(String ibflag, String pagerows, String actCustCd, String obEml, String ibEml, String loclNm, String addr1, String addr2, String crCustTpCd, String krIbOfcCd, String loclZipCd, String phnNo, String faxNo, String crCustRmk) {
		this.ibEml = ibEml;
		this.phnNo = phnNo;
		this.loclNm = loclNm;
		this.crCustTpCd = crCustTpCd;
		this.obEml = obEml;
		this.actCustCd = actCustCd;
		this.pagerows = pagerows;
		this.crCustRmk = crCustRmk;
		this.ibflag = ibflag;
		this.loclZipCd = loclZipCd;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.krIbOfcCd = krIbOfcCd;
		this.faxNo = faxNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ib_eml", getIbEml());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("locl_nm", getLoclNm());
		this.hashColumns.put("cr_cust_tp_cd", getCrCustTpCd());
		this.hashColumns.put("ob_eml", getObEml());
		this.hashColumns.put("act_cust_cd", getActCustCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cr_cust_rmk", getCrCustRmk());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("locl_zip_cd", getLoclZipCd());
		this.hashColumns.put("addr1", getAddr1());
		this.hashColumns.put("addr2", getAddr2());
		this.hashColumns.put("kr_ib_ofc_cd", getKrIbOfcCd());
		this.hashColumns.put("fax_no", getFaxNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ib_eml", "ibEml");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("locl_nm", "loclNm");
		this.hashFields.put("cr_cust_tp_cd", "crCustTpCd");
		this.hashFields.put("ob_eml", "obEml");
		this.hashFields.put("act_cust_cd", "actCustCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cr_cust_rmk", "crCustRmk");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("locl_zip_cd", "loclZipCd");
		this.hashFields.put("addr1", "addr1");
		this.hashFields.put("addr2", "addr2");
		this.hashFields.put("kr_ib_ofc_cd", "krIbOfcCd");
		this.hashFields.put("fax_no", "faxNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ibEml
	 */
	public String getIbEml() {
		return this.ibEml;
	}
	
	/**
	 * Column Info
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return loclNm
	 */
	public String getLoclNm() {
		return this.loclNm;
	}
	
	/**
	 * Column Info
	 * @return crCustTpCd
	 */
	public String getCrCustTpCd() {
		return this.crCustTpCd;
	}
	
	/**
	 * Column Info
	 * @return obEml
	 */
	public String getObEml() {
		return this.obEml;
	}
	
	/**
	 * Column Info
	 * @return actCustCd
	 */
	public String getActCustCd() {
		return this.actCustCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Column Info
	 * @return crCustRmk
	 */
	public String getCrCustRmk() {
		return this.crCustRmk;
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
	 * @return loclZipCd
	 */
	public String getLoclZipCd() {
		return this.loclZipCd;
	}
	
	/**
	 * Column Info
	 * @return addr1
	 */
	public String getAddr1() {
		return this.addr1;
	}
	
	/**
	 * Column Info
	 * @return addr2
	 */
	public String getAddr2() {
		return this.addr2;
	}
	
	/**
	 * Column Info
	 * @return krIbOfcCd
	 */
	public String getKrIbOfcCd() {
		return this.krIbOfcCd;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	

	/**
	 * Column Info
	 * @param ibEml
	 */
	public void setIbEml(String ibEml) {
		this.ibEml = ibEml;
	}
	
	/**
	 * Column Info
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param loclNm
	 */
	public void setLoclNm(String loclNm) {
		this.loclNm = loclNm;
	}
	
	/**
	 * Column Info
	 * @param crCustTpCd
	 */
	public void setCrCustTpCd(String crCustTpCd) {
		this.crCustTpCd = crCustTpCd;
	}
	
	/**
	 * Column Info
	 * @param obEml
	 */
	public void setObEml(String obEml) {
		this.obEml = obEml;
	}
	
	/**
	 * Column Info
	 * @param actCustCd
	 */
	public void setActCustCd(String actCustCd) {
		this.actCustCd = actCustCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param crCustRmk
	 */
	public void setCrCustRmk(String crCustRmk) {
		this.crCustRmk = crCustRmk;
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
	 * @param loclZipCd
	 */
	public void setLoclZipCd(String loclZipCd) {
		this.loclZipCd = loclZipCd;
	}
	
	/**
	 * Column Info
	 * @param addr1
	 */
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	
	/**
	 * Column Info
	 * @param addr2
	 */
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	
	/**
	 * Column Info
	 * @param krIbOfcCd
	 */
	public void setKrIbOfcCd(String krIbOfcCd) {
		this.krIbOfcCd = krIbOfcCd;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setIbEml(JSPUtil.getParameter(request, "ib_eml", ""));
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setLoclNm(JSPUtil.getParameter(request, "locl_nm", ""));
		setCrCustTpCd(JSPUtil.getParameter(request, "cr_cust_tp_cd", ""));
		setObEml(JSPUtil.getParameter(request, "ob_eml", ""));
		setActCustCd(JSPUtil.getParameter(request, "act_cust_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCrCustRmk(JSPUtil.getParameter(request, "cr_cust_rmk", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLoclZipCd(JSPUtil.getParameter(request, "locl_zip_cd", ""));
		setAddr1(JSPUtil.getParameter(request, "addr1", ""));
		setAddr2(JSPUtil.getParameter(request, "addr2", ""));
		setKrIbOfcCd(JSPUtil.getParameter(request, "kr_ib_ofc_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgMdmCrCustVO[]
	 */
	public BkgMdmCrCustVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgMdmCrCustVO[]
	 */
	public BkgMdmCrCustVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgMdmCrCustVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibEml = (JSPUtil.getParameter(request, prefix	+ "ib_eml".trim(), length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no".trim(), length));
			String[] loclNm = (JSPUtil.getParameter(request, prefix	+ "locl_nm".trim(), length));
			String[] crCustTpCd = (JSPUtil.getParameter(request, prefix	+ "cr_cust_tp_cd".trim(), length));
			String[] obEml = (JSPUtil.getParameter(request, prefix	+ "ob_eml".trim(), length));
			String[] actCustCd = (JSPUtil.getParameter(request, prefix	+ "act_cust_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] crCustRmk = (JSPUtil.getParameter(request, prefix	+ "cr_cust_rmk".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] loclZipCd = (JSPUtil.getParameter(request, prefix	+ "locl_zip_cd".trim(), length));
			String[] addr1 = (JSPUtil.getParameter(request, prefix	+ "addr1".trim(), length));
			String[] addr2 = (JSPUtil.getParameter(request, prefix	+ "addr2".trim(), length));
			String[] krIbOfcCd = (JSPUtil.getParameter(request, prefix	+ "kr_ib_ofc_cd".trim(), length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgMdmCrCustVO();
				if (ibEml[i] != null)
					model.setIbEml(ibEml[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (loclNm[i] != null)
					model.setLoclNm(loclNm[i]);
				if (crCustTpCd[i] != null)
					model.setCrCustTpCd(crCustTpCd[i]);
				if (obEml[i] != null)
					model.setObEml(obEml[i]);
				if (actCustCd[i] != null)
					model.setActCustCd(actCustCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (crCustRmk[i] != null)
					model.setCrCustRmk(crCustRmk[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (loclZipCd[i] != null)
					model.setLoclZipCd(loclZipCd[i]);
				if (addr1[i] != null)
					model.setAddr1(addr1[i]);
				if (addr2[i] != null)
					model.setAddr2(addr2[i]);
				if (krIbOfcCd[i] != null)
					model.setKrIbOfcCd(krIbOfcCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmCrCustVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmCrCustVO[]
	 */
	public BkgMdmCrCustVO[] getMdmCrCustVOs(){
		BkgMdmCrCustVO[] vos = (BkgMdmCrCustVO[])models.toArray(new BkgMdmCrCustVO[models.size()]);
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
		this.ibEml = this.ibEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclNm = this.loclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crCustTpCd = this.crCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obEml = this.obEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCustCd = this.actCustCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crCustRmk = this.crCustRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclZipCd = this.loclZipCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addr1 = this.addr1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addr2 = this.addr2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krIbOfcCd = this.krIbOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
