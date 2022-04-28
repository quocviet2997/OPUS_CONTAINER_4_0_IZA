/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : EqrCtrlMtyLodgPlnVO.java
*@FileTitle : EqrCtrlMtyLodgPlnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.08.05
*@LastModifier : 
*@LastVersion : 1.0
* 2013.08.05  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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

public class EqrCtrlMtyLodgPlnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrCtrlMtyLodgPlnVO> models = new ArrayList<EqrCtrlMtyLodgPlnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String fnlCbfDt = null;
	/* Column Info */
	private String mtyLodgPlnTeuQty = null;
	/* Column Info */
	private String plnRsnHdrCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fnlCbfFlg = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String vslLaneCd = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String plnRsnRmk = null;
	/* Column Info */
	private String polYdCd = null;
	/* Column Info */
	private String plnRsnSubCd = null;
	/* Column Info */
	private String mtyLodgPlnTonWgt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String subTrdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrCtrlMtyLodgPlnVO() {}

	public EqrCtrlMtyLodgPlnVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String polYdCd, String trdCd, String subTrdCd, String vslLaneCd, String mtyLodgPlnTeuQty, String mtyLodgPlnTonWgt, String plnRsnHdrCd, String plnRsnSubCd, String plnRsnRmk, String fnlCbfFlg, String fnlCbfDt, String creUsrId, String creDt, String updUsrId, String updDt, String polCd) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.fnlCbfDt = fnlCbfDt;
		this.mtyLodgPlnTeuQty = mtyLodgPlnTeuQty;
		this.plnRsnHdrCd = plnRsnHdrCd;
		this.creDt = creDt;
		this.fnlCbfFlg = fnlCbfFlg;
		this.skdVoyNo = skdVoyNo;
		this.trdCd = trdCd;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.vslLaneCd = vslLaneCd;
		this.polCd = polCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.plnRsnRmk = plnRsnRmk;
		this.polYdCd = polYdCd;
		this.plnRsnSubCd = plnRsnSubCd;
		this.mtyLodgPlnTonWgt = mtyLodgPlnTonWgt;
		this.updUsrId = updUsrId;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("fnl_cbf_dt", getFnlCbfDt());
		this.hashColumns.put("mty_lodg_pln_teu_qty", getMtyLodgPlnTeuQty());
		this.hashColumns.put("pln_rsn_hdr_cd", getPlnRsnHdrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("fnl_cbf_flg", getFnlCbfFlg());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vsl_lane_cd", getVslLaneCd());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pln_rsn_rmk", getPlnRsnRmk());
		this.hashColumns.put("pol_yd_cd", getPolYdCd());
		this.hashColumns.put("pln_rsn_sub_cd", getPlnRsnSubCd());
		this.hashColumns.put("mty_lodg_pln_ton_wgt", getMtyLodgPlnTonWgt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("fnl_cbf_dt", "fnlCbfDt");
		this.hashFields.put("mty_lodg_pln_teu_qty", "mtyLodgPlnTeuQty");
		this.hashFields.put("pln_rsn_hdr_cd", "plnRsnHdrCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("fnl_cbf_flg", "fnlCbfFlg");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vsl_lane_cd", "vslLaneCd");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pln_rsn_rmk", "plnRsnRmk");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("pln_rsn_sub_cd", "plnRsnSubCd");
		this.hashFields.put("mty_lodg_pln_ton_wgt", "mtyLodgPlnTonWgt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
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
	 * @return fnlCbfDt
	 */
	public String getFnlCbfDt() {
		return this.fnlCbfDt;
	}
	
	/**
	 * Column Info
	 * @return mtyLodgPlnTeuQty
	 */
	public String getMtyLodgPlnTeuQty() {
		return this.mtyLodgPlnTeuQty;
	}
	
	/**
	 * Column Info
	 * @return plnRsnHdrCd
	 */
	public String getPlnRsnHdrCd() {
		return this.plnRsnHdrCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return fnlCbfFlg
	 */
	public String getFnlCbfFlg() {
		return this.fnlCbfFlg;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
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
	 * @return vslLaneCd
	 */
	public String getVslLaneCd() {
		return this.vslLaneCd;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return plnRsnRmk
	 */
	public String getPlnRsnRmk() {
		return this.plnRsnRmk;
	}
	
	/**
	 * Column Info
	 * @return polYdCd
	 */
	public String getPolYdCd() {
		return this.polYdCd;
	}
	
	/**
	 * Column Info
	 * @return plnRsnSubCd
	 */
	public String getPlnRsnSubCd() {
		return this.plnRsnSubCd;
	}
	
	/**
	 * Column Info
	 * @return mtyLodgPlnTonWgt
	 */
	public String getMtyLodgPlnTonWgt() {
		return this.mtyLodgPlnTonWgt;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	

	/**
	 * Column Info
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param fnlCbfDt
	 */
	public void setFnlCbfDt(String fnlCbfDt) {
		this.fnlCbfDt = fnlCbfDt;
	}
	
	/**
	 * Column Info
	 * @param mtyLodgPlnTeuQty
	 */
	public void setMtyLodgPlnTeuQty(String mtyLodgPlnTeuQty) {
		this.mtyLodgPlnTeuQty = mtyLodgPlnTeuQty;
	}
	
	/**
	 * Column Info
	 * @param plnRsnHdrCd
	 */
	public void setPlnRsnHdrCd(String plnRsnHdrCd) {
		this.plnRsnHdrCd = plnRsnHdrCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param fnlCbfFlg
	 */
	public void setFnlCbfFlg(String fnlCbfFlg) {
		this.fnlCbfFlg = fnlCbfFlg;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
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
	 * @param vslLaneCd
	 */
	public void setVslLaneCd(String vslLaneCd) {
		this.vslLaneCd = vslLaneCd;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param plnRsnRmk
	 */
	public void setPlnRsnRmk(String plnRsnRmk) {
		this.plnRsnRmk = plnRsnRmk;
	}
	
	/**
	 * Column Info
	 * @param polYdCd
	 */
	public void setPolYdCd(String polYdCd) {
		this.polYdCd = polYdCd;
	}
	
	/**
	 * Column Info
	 * @param plnRsnSubCd
	 */
	public void setPlnRsnSubCd(String plnRsnSubCd) {
		this.plnRsnSubCd = plnRsnSubCd;
	}
	
	/**
	 * Column Info
	 * @param mtyLodgPlnTonWgt
	 */
	public void setMtyLodgPlnTonWgt(String mtyLodgPlnTonWgt) {
		this.mtyLodgPlnTonWgt = mtyLodgPlnTonWgt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setFnlCbfDt(JSPUtil.getParameter(request, prefix + "fnl_cbf_dt", ""));
		setMtyLodgPlnTeuQty(JSPUtil.getParameter(request, prefix + "mty_lodg_pln_teu_qty", ""));
		setPlnRsnHdrCd(JSPUtil.getParameter(request, prefix + "pln_rsn_hdr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setFnlCbfFlg(JSPUtil.getParameter(request, prefix + "fnl_cbf_flg", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setTrdCd(JSPUtil.getParameter(request, prefix + "trd_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setVslLaneCd(JSPUtil.getParameter(request, prefix + "vsl_lane_cd", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPlnRsnRmk(JSPUtil.getParameter(request, prefix + "pln_rsn_rmk", ""));
		setPolYdCd(JSPUtil.getParameter(request, prefix + "pol_yd_cd", ""));
		setPlnRsnSubCd(JSPUtil.getParameter(request, prefix + "pln_rsn_sub_cd", ""));
		setMtyLodgPlnTonWgt(JSPUtil.getParameter(request, prefix + "mty_lodg_pln_ton_wgt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, prefix + "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrCtrlMtyLodgPlnVO[]
	 */
	public EqrCtrlMtyLodgPlnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrCtrlMtyLodgPlnVO[]
	 */
	public EqrCtrlMtyLodgPlnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrCtrlMtyLodgPlnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] fnlCbfDt = (JSPUtil.getParameter(request, prefix	+ "fnl_cbf_dt", length));
			String[] mtyLodgPlnTeuQty = (JSPUtil.getParameter(request, prefix	+ "mty_lodg_pln_teu_qty", length));
			String[] plnRsnHdrCd = (JSPUtil.getParameter(request, prefix	+ "pln_rsn_hdr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fnlCbfFlg = (JSPUtil.getParameter(request, prefix	+ "fnl_cbf_flg", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] vslLaneCd = (JSPUtil.getParameter(request, prefix	+ "vsl_lane_cd", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] plnRsnRmk = (JSPUtil.getParameter(request, prefix	+ "pln_rsn_rmk", length));
			String[] polYdCd = (JSPUtil.getParameter(request, prefix	+ "pol_yd_cd", length));
			String[] plnRsnSubCd = (JSPUtil.getParameter(request, prefix	+ "pln_rsn_sub_cd", length));
			String[] mtyLodgPlnTonWgt = (JSPUtil.getParameter(request, prefix	+ "mty_lodg_pln_ton_wgt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrCtrlMtyLodgPlnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (fnlCbfDt[i] != null)
					model.setFnlCbfDt(fnlCbfDt[i]);
				if (mtyLodgPlnTeuQty[i] != null)
					model.setMtyLodgPlnTeuQty(mtyLodgPlnTeuQty[i]);
				if (plnRsnHdrCd[i] != null)
					model.setPlnRsnHdrCd(plnRsnHdrCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fnlCbfFlg[i] != null)
					model.setFnlCbfFlg(fnlCbfFlg[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vslLaneCd[i] != null)
					model.setVslLaneCd(vslLaneCd[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (plnRsnRmk[i] != null)
					model.setPlnRsnRmk(plnRsnRmk[i]);
				if (polYdCd[i] != null)
					model.setPolYdCd(polYdCd[i]);
				if (plnRsnSubCd[i] != null)
					model.setPlnRsnSubCd(plnRsnSubCd[i]);
				if (mtyLodgPlnTonWgt[i] != null)
					model.setMtyLodgPlnTonWgt(mtyLodgPlnTonWgt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrCtrlMtyLodgPlnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrCtrlMtyLodgPlnVO[]
	 */
	public EqrCtrlMtyLodgPlnVO[] getEqrCtrlMtyLodgPlnVOs(){
		EqrCtrlMtyLodgPlnVO[] vos = (EqrCtrlMtyLodgPlnVO[])models.toArray(new EqrCtrlMtyLodgPlnVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlCbfDt = this.fnlCbfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyLodgPlnTeuQty = this.mtyLodgPlnTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnRsnHdrCd = this.plnRsnHdrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlCbfFlg = this.fnlCbfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLaneCd = this.vslLaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnRsnRmk = this.plnRsnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd = this.polYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnRsnSubCd = this.plnRsnSubCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyLodgPlnTonWgt = this.mtyLodgPlnTonWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
