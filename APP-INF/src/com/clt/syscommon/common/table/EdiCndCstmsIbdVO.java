/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EdiCndCstmsIbdVO.java
*@FileTitle : EdiCndCstmsIbdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.14
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.14  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EdiCndCstmsIbdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EdiCndCstmsIbdVO> models = new ArrayList<EdiCndCstmsIbdVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String ibdIpiLoclIndCd = null;
	/* Column Info */
	private String ibdBkgStsCd = null;
	/* Column Info */
	private String cndLocGdsCd = null;
	/* Column Info */
	private String ibdCstmsClrIndCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String ibdIssDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String vslDchgPortCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ibdTpCd = null;
	/* Column Info */
	private String ibdNonVslOpCrrFtrCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String ibdCstmsClrLocCd = null;
	/* Column Info */
	private String ibdNo = null;
	/* Column Info */
	private String ibdTrspHubCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EdiCndCstmsIbdVO() {}

	public EdiCndCstmsIbdVO(String ibflag, String pagerows, String blNo, String bkgNo, String vslCd, String skdVoyNo, String skdDirCd, String vslDchgPortCd, String ibdTrspHubCtyCd, String ibdCstmsClrLocCd, String ibdBkgStsCd, String ibdTpCd, String ibdNo, String ibdIssDt, String ibdCstmsClrIndCd, String ibdIpiLoclIndCd, String ibdNonVslOpCrrFtrCd, String cndLocGdsCd, String eaiEvntDt) {
		this.vslCd = vslCd;
		this.ibdIpiLoclIndCd = ibdIpiLoclIndCd;
		this.ibdBkgStsCd = ibdBkgStsCd;
		this.cndLocGdsCd = cndLocGdsCd;
		this.ibdCstmsClrIndCd = ibdCstmsClrIndCd;
		this.skdVoyNo = skdVoyNo;
		this.ibdIssDt = ibdIssDt;
		this.eaiEvntDt = eaiEvntDt;
		this.vslDchgPortCd = vslDchgPortCd;
		this.blNo = blNo;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.ibdTpCd = ibdTpCd;
		this.ibdNonVslOpCrrFtrCd = ibdNonVslOpCrrFtrCd;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
		this.ibdNo = ibdNo;
		this.ibdTrspHubCtyCd = ibdTrspHubCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("ibd_ipi_locl_ind_cd", getIbdIpiLoclIndCd());
		this.hashColumns.put("ibd_bkg_sts_cd", getIbdBkgStsCd());
		this.hashColumns.put("cnd_loc_gds_cd", getCndLocGdsCd());
		this.hashColumns.put("ibd_cstms_clr_ind_cd", getIbdCstmsClrIndCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("ibd_iss_dt", getIbdIssDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("vsl_dchg_port_cd", getVslDchgPortCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibd_tp_cd", getIbdTpCd());
		this.hashColumns.put("ibd_non_vsl_op_crr_ftr_cd", getIbdNonVslOpCrrFtrCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ibd_cstms_clr_loc_cd", getIbdCstmsClrLocCd());
		this.hashColumns.put("ibd_no", getIbdNo());
		this.hashColumns.put("ibd_trsp_hub_cty_cd", getIbdTrspHubCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("ibd_ipi_locl_ind_cd", "ibdIpiLoclIndCd");
		this.hashFields.put("ibd_bkg_sts_cd", "ibdBkgStsCd");
		this.hashFields.put("cnd_loc_gds_cd", "cndLocGdsCd");
		this.hashFields.put("ibd_cstms_clr_ind_cd", "ibdCstmsClrIndCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("ibd_iss_dt", "ibdIssDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("vsl_dchg_port_cd", "vslDchgPortCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibd_tp_cd", "ibdTpCd");
		this.hashFields.put("ibd_non_vsl_op_crr_ftr_cd", "ibdNonVslOpCrrFtrCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ibd_cstms_clr_loc_cd", "ibdCstmsClrLocCd");
		this.hashFields.put("ibd_no", "ibdNo");
		this.hashFields.put("ibd_trsp_hub_cty_cd", "ibdTrspHubCtyCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return ibdIpiLoclIndCd
	 */
	public String getIbdIpiLoclIndCd() {
		return this.ibdIpiLoclIndCd;
	}
	
	/**
	 * Column Info
	 * @return ibdBkgStsCd
	 */
	public String getIbdBkgStsCd() {
		return this.ibdBkgStsCd;
	}
	
	/**
	 * Column Info
	 * @return cndLocGdsCd
	 */
	public String getCndLocGdsCd() {
		return this.cndLocGdsCd;
	}
	
	/**
	 * Column Info
	 * @return ibdCstmsClrIndCd
	 */
	public String getIbdCstmsClrIndCd() {
		return this.ibdCstmsClrIndCd;
	}
	
	/**
	 * Column Info
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return ibdIssDt
	 */
	public String getIbdIssDt() {
		return this.ibdIssDt;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return vslDchgPortCd
	 */
	public String getVslDchgPortCd() {
		return this.vslDchgPortCd;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return ibdTpCd
	 */
	public String getIbdTpCd() {
		return this.ibdTpCd;
	}
	
	/**
	 * Column Info
	 * @return ibdNonVslOpCrrFtrCd
	 */
	public String getIbdNonVslOpCrrFtrCd() {
		return this.ibdNonVslOpCrrFtrCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return ibdCstmsClrLocCd
	 */
	public String getIbdCstmsClrLocCd() {
		return this.ibdCstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @return ibdNo
	 */
	public String getIbdNo() {
		return this.ibdNo;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspHubCtyCd
	 */
	public String getIbdTrspHubCtyCd() {
		return this.ibdTrspHubCtyCd;
	}
	

	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param ibdIpiLoclIndCd
	 */
	public void setIbdIpiLoclIndCd(String ibdIpiLoclIndCd) {
		this.ibdIpiLoclIndCd = ibdIpiLoclIndCd;
	}
	
	/**
	 * Column Info
	 * @param ibdBkgStsCd
	 */
	public void setIbdBkgStsCd(String ibdBkgStsCd) {
		this.ibdBkgStsCd = ibdBkgStsCd;
	}
	
	/**
	 * Column Info
	 * @param cndLocGdsCd
	 */
	public void setCndLocGdsCd(String cndLocGdsCd) {
		this.cndLocGdsCd = cndLocGdsCd;
	}
	
	/**
	 * Column Info
	 * @param ibdCstmsClrIndCd
	 */
	public void setIbdCstmsClrIndCd(String ibdCstmsClrIndCd) {
		this.ibdCstmsClrIndCd = ibdCstmsClrIndCd;
	}
	
	/**
	 * Column Info
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param ibdIssDt
	 */
	public void setIbdIssDt(String ibdIssDt) {
		this.ibdIssDt = ibdIssDt;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param vslDchgPortCd
	 */
	public void setVslDchgPortCd(String vslDchgPortCd) {
		this.vslDchgPortCd = vslDchgPortCd;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param ibdTpCd
	 */
	public void setIbdTpCd(String ibdTpCd) {
		this.ibdTpCd = ibdTpCd;
	}
	
	/**
	 * Column Info
	 * @param ibdNonVslOpCrrFtrCd
	 */
	public void setIbdNonVslOpCrrFtrCd(String ibdNonVslOpCrrFtrCd) {
		this.ibdNonVslOpCrrFtrCd = ibdNonVslOpCrrFtrCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param ibdCstmsClrLocCd
	 */
	public void setIbdCstmsClrLocCd(String ibdCstmsClrLocCd) {
		this.ibdCstmsClrLocCd = ibdCstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @param ibdNo
	 */
	public void setIbdNo(String ibdNo) {
		this.ibdNo = ibdNo;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspHubCtyCd
	 */
	public void setIbdTrspHubCtyCd(String ibdTrspHubCtyCd) {
		this.ibdTrspHubCtyCd = ibdTrspHubCtyCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setIbdIpiLoclIndCd(JSPUtil.getParameter(request, "ibd_ipi_locl_ind_cd", ""));
		setIbdBkgStsCd(JSPUtil.getParameter(request, "ibd_bkg_sts_cd", ""));
		setCndLocGdsCd(JSPUtil.getParameter(request, "cnd_loc_gds_cd", ""));
		setIbdCstmsClrIndCd(JSPUtil.getParameter(request, "ibd_cstms_clr_ind_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setIbdIssDt(JSPUtil.getParameter(request, "ibd_iss_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setVslDchgPortCd(JSPUtil.getParameter(request, "vsl_dchg_port_cd", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbdTpCd(JSPUtil.getParameter(request, "ibd_tp_cd", ""));
		setIbdNonVslOpCrrFtrCd(JSPUtil.getParameter(request, "ibd_non_vsl_op_crr_ftr_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setIbdCstmsClrLocCd(JSPUtil.getParameter(request, "ibd_cstms_clr_loc_cd", ""));
		setIbdNo(JSPUtil.getParameter(request, "ibd_no", ""));
		setIbdTrspHubCtyCd(JSPUtil.getParameter(request, "ibd_trsp_hub_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EdiCndCstmsIbdVO[]
	 */
	public EdiCndCstmsIbdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EdiCndCstmsIbdVO[]
	 */
	public EdiCndCstmsIbdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EdiCndCstmsIbdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] ibdIpiLoclIndCd = (JSPUtil.getParameter(request, prefix	+ "ibd_ipi_locl_ind_cd", length));
			String[] ibdBkgStsCd = (JSPUtil.getParameter(request, prefix	+ "ibd_bkg_sts_cd", length));
			String[] cndLocGdsCd = (JSPUtil.getParameter(request, prefix	+ "cnd_loc_gds_cd", length));
			String[] ibdCstmsClrIndCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cstms_clr_ind_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] ibdIssDt = (JSPUtil.getParameter(request, prefix	+ "ibd_iss_dt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] vslDchgPortCd = (JSPUtil.getParameter(request, prefix	+ "vsl_dchg_port_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibdTpCd = (JSPUtil.getParameter(request, prefix	+ "ibd_tp_cd", length));
			String[] ibdNonVslOpCrrFtrCd = (JSPUtil.getParameter(request, prefix	+ "ibd_non_vsl_op_crr_ftr_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ibdCstmsClrLocCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cstms_clr_loc_cd", length));
			String[] ibdNo = (JSPUtil.getParameter(request, prefix	+ "ibd_no", length));
			String[] ibdTrspHubCtyCd = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_hub_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new EdiCndCstmsIbdVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (ibdIpiLoclIndCd[i] != null)
					model.setIbdIpiLoclIndCd(ibdIpiLoclIndCd[i]);
				if (ibdBkgStsCd[i] != null)
					model.setIbdBkgStsCd(ibdBkgStsCd[i]);
				if (cndLocGdsCd[i] != null)
					model.setCndLocGdsCd(cndLocGdsCd[i]);
				if (ibdCstmsClrIndCd[i] != null)
					model.setIbdCstmsClrIndCd(ibdCstmsClrIndCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (ibdIssDt[i] != null)
					model.setIbdIssDt(ibdIssDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (vslDchgPortCd[i] != null)
					model.setVslDchgPortCd(vslDchgPortCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibdTpCd[i] != null)
					model.setIbdTpCd(ibdTpCd[i]);
				if (ibdNonVslOpCrrFtrCd[i] != null)
					model.setIbdNonVslOpCrrFtrCd(ibdNonVslOpCrrFtrCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ibdCstmsClrLocCd[i] != null)
					model.setIbdCstmsClrLocCd(ibdCstmsClrLocCd[i]);
				if (ibdNo[i] != null)
					model.setIbdNo(ibdNo[i]);
				if (ibdTrspHubCtyCd[i] != null)
					model.setIbdTrspHubCtyCd(ibdTrspHubCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEdiCndCstmsIbdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EdiCndCstmsIbdVO[]
	 */
	public EdiCndCstmsIbdVO[] getEdiCndCstmsIbdVOs(){
		EdiCndCstmsIbdVO[] vos = (EdiCndCstmsIbdVO[])models.toArray(new EdiCndCstmsIbdVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdIpiLoclIndCd = this.ibdIpiLoclIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdBkgStsCd = this.ibdBkgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndLocGdsCd = this.cndLocGdsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCstmsClrIndCd = this.ibdCstmsClrIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdIssDt = this.ibdIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDchgPortCd = this.vslDchgPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTpCd = this.ibdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdNonVslOpCrrFtrCd = this.ibdNonVslOpCrrFtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCstmsClrLocCd = this.ibdCstmsClrLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdNo = this.ibdNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspHubCtyCd = this.ibdTrspHubCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
