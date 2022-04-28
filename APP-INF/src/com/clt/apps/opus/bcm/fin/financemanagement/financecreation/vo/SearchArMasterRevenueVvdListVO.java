/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchArMasterRevenueVvdListVO.java
*@FileTitle : SearchArMasterRevenueVvdListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.10
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.10  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.fin.financemanagement.financecreation.vo;

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

public class SearchArMasterRevenueVvdListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchArMasterRevenueVvdListVO> models = new ArrayList<SearchArMasterRevenueVvdListVO>();
	
	/* Column Info */
	private String lodQty = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String revYrmon = null;
	/* Column Info */
	private String hRlaneDirCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String hVslCd = null;
	/* Column Info */
	private String revPortCd = null;
	/* Column Info */
	private String portChkFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String voyTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hSkdVoyNo = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String rlaneDirCd = null;
	/* Column Info */
	private String hSkdDirCd = null;
	/* Column Info */
	private String comVvdFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String vvdComLvl = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchArMasterRevenueVvdListVO() {}

	public SearchArMasterRevenueVvdListVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String rlaneDirCd, String hVslCd, String hSkdVoyNo, String hSkdDirCd, String hRlaneDirCd, String voyTpCd, String slanCd, String portChkFlg, String revPortCd, String lodQty, String revYrmon, String comVvdFlg, String vvdComLvl, String rlaneCd, String deltFlg, String updUsrId, String creUsrId) {
		this.lodQty = lodQty;
		this.vslCd = vslCd;
		this.deltFlg = deltFlg;
		this.revYrmon = revYrmon;
		this.hRlaneDirCd = hRlaneDirCd;
		this.skdVoyNo = skdVoyNo;
		this.rlaneCd = rlaneCd;
		this.hVslCd = hVslCd;
		this.revPortCd = revPortCd;
		this.portChkFlg = portChkFlg;
		this.skdDirCd = skdDirCd;
		this.voyTpCd = voyTpCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.hSkdVoyNo = hSkdVoyNo;
		this.slanCd = slanCd;
		this.rlaneDirCd = rlaneDirCd;
		this.hSkdDirCd = hSkdDirCd;
		this.comVvdFlg = comVvdFlg;
		this.updUsrId = updUsrId;
		this.vvdComLvl = vvdComLvl;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lod_qty", getLodQty());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("rev_yrmon", getRevYrmon());
		this.hashColumns.put("h_rlane_dir_cd", getHRlaneDirCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("h_vsl_cd", getHVslCd());
		this.hashColumns.put("rev_port_cd", getRevPortCd());
		this.hashColumns.put("port_chk_flg", getPortChkFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("voy_tp_cd", getVoyTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("h_skd_voy_no", getHSkdVoyNo());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("rlane_dir_cd", getRlaneDirCd());
		this.hashColumns.put("h_skd_dir_cd", getHSkdDirCd());
		this.hashColumns.put("com_vvd_flg", getComVvdFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("vvd_com_lvl", getVvdComLvl());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lod_qty", "lodQty");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("rev_yrmon", "revYrmon");
		this.hashFields.put("h_rlane_dir_cd", "hRlaneDirCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("h_vsl_cd", "hVslCd");
		this.hashFields.put("rev_port_cd", "revPortCd");
		this.hashFields.put("port_chk_flg", "portChkFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("voy_tp_cd", "voyTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("h_skd_voy_no", "hSkdVoyNo");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("rlane_dir_cd", "rlaneDirCd");
		this.hashFields.put("h_skd_dir_cd", "hSkdDirCd");
		this.hashFields.put("com_vvd_flg", "comVvdFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("vvd_com_lvl", "vvdComLvl");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return lodQty
	 */
	public String getLodQty() {
		return this.lodQty;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return revYrmon
	 */
	public String getRevYrmon() {
		return this.revYrmon;
	}
	
	/**
	 * Column Info
	 * @return hRlaneDirCd
	 */
	public String getHRlaneDirCd() {
		return this.hRlaneDirCd;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return hVslCd
	 */
	public String getHVslCd() {
		return this.hVslCd;
	}
	
	/**
	 * Column Info
	 * @return revPortCd
	 */
	public String getRevPortCd() {
		return this.revPortCd;
	}
	
	/**
	 * Column Info
	 * @return portChkFlg
	 */
	public String getPortChkFlg() {
		return this.portChkFlg;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return voyTpCd
	 */
	public String getVoyTpCd() {
		return this.voyTpCd;
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
	 * @return hSkdVoyNo
	 */
	public String getHSkdVoyNo() {
		return this.hSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneDirCd
	 */
	public String getRlaneDirCd() {
		return this.rlaneDirCd;
	}
	
	/**
	 * Column Info
	 * @return hSkdDirCd
	 */
	public String getHSkdDirCd() {
		return this.hSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return comVvdFlg
	 */
	public String getComVvdFlg() {
		return this.comVvdFlg;
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
	 * @return vvdComLvl
	 */
	public String getVvdComLvl() {
		return this.vvdComLvl;
	}
	

	/**
	 * Column Info
	 * @param lodQty
	 */
	public void setLodQty(String lodQty) {
		this.lodQty = lodQty;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param revYrmon
	 */
	public void setRevYrmon(String revYrmon) {
		this.revYrmon = revYrmon;
	}
	
	/**
	 * Column Info
	 * @param hRlaneDirCd
	 */
	public void setHRlaneDirCd(String hRlaneDirCd) {
		this.hRlaneDirCd = hRlaneDirCd;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param hVslCd
	 */
	public void setHVslCd(String hVslCd) {
		this.hVslCd = hVslCd;
	}
	
	/**
	 * Column Info
	 * @param revPortCd
	 */
	public void setRevPortCd(String revPortCd) {
		this.revPortCd = revPortCd;
	}
	
	/**
	 * Column Info
	 * @param portChkFlg
	 */
	public void setPortChkFlg(String portChkFlg) {
		this.portChkFlg = portChkFlg;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param voyTpCd
	 */
	public void setVoyTpCd(String voyTpCd) {
		this.voyTpCd = voyTpCd;
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
	 * @param hSkdVoyNo
	 */
	public void setHSkdVoyNo(String hSkdVoyNo) {
		this.hSkdVoyNo = hSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneDirCd
	 */
	public void setRlaneDirCd(String rlaneDirCd) {
		this.rlaneDirCd = rlaneDirCd;
	}
	
	/**
	 * Column Info
	 * @param hSkdDirCd
	 */
	public void setHSkdDirCd(String hSkdDirCd) {
		this.hSkdDirCd = hSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param comVvdFlg
	 */
	public void setComVvdFlg(String comVvdFlg) {
		this.comVvdFlg = comVvdFlg;
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
	 * @param vvdComLvl
	 */
	public void setVvdComLvl(String vvdComLvl) {
		this.vvdComLvl = vvdComLvl;
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
		setLodQty(JSPUtil.getParameter(request, prefix + "lod_qty", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setRevYrmon(JSPUtil.getParameter(request, prefix + "rev_yrmon", ""));
		setHRlaneDirCd(JSPUtil.getParameter(request, prefix + "h_rlane_dir_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setHVslCd(JSPUtil.getParameter(request, prefix + "h_vsl_cd", ""));
		setRevPortCd(JSPUtil.getParameter(request, prefix + "rev_port_cd", ""));
		setPortChkFlg(JSPUtil.getParameter(request, prefix + "port_chk_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setVoyTpCd(JSPUtil.getParameter(request, prefix + "voy_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setHSkdVoyNo(JSPUtil.getParameter(request, prefix + "h_skd_voy_no", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setRlaneDirCd(JSPUtil.getParameter(request, prefix + "rlane_dir_cd", ""));
		setHSkdDirCd(JSPUtil.getParameter(request, prefix + "h_skd_dir_cd", ""));
		setComVvdFlg(JSPUtil.getParameter(request, prefix + "com_vvd_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setVvdComLvl(JSPUtil.getParameter(request, prefix + "vvd_com_lvl", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchArMasterRevenueVvdListVO[]
	 */
	public SearchArMasterRevenueVvdListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchArMasterRevenueVvdListVO[]
	 */
	public SearchArMasterRevenueVvdListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchArMasterRevenueVvdListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lodQty = (JSPUtil.getParameter(request, prefix	+ "lod_qty", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] revYrmon = (JSPUtil.getParameter(request, prefix	+ "rev_yrmon", length));
			String[] hRlaneDirCd = (JSPUtil.getParameter(request, prefix	+ "h_rlane_dir_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] hVslCd = (JSPUtil.getParameter(request, prefix	+ "h_vsl_cd", length));
			String[] revPortCd = (JSPUtil.getParameter(request, prefix	+ "rev_port_cd", length));
			String[] portChkFlg = (JSPUtil.getParameter(request, prefix	+ "port_chk_flg", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] voyTpCd = (JSPUtil.getParameter(request, prefix	+ "voy_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "h_skd_voy_no", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] rlaneDirCd = (JSPUtil.getParameter(request, prefix	+ "rlane_dir_cd", length));
			String[] hSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "h_skd_dir_cd", length));
			String[] comVvdFlg = (JSPUtil.getParameter(request, prefix	+ "com_vvd_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] vvdComLvl = (JSPUtil.getParameter(request, prefix	+ "vvd_com_lvl", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchArMasterRevenueVvdListVO();
				if (lodQty[i] != null)
					model.setLodQty(lodQty[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (revYrmon[i] != null)
					model.setRevYrmon(revYrmon[i]);
				if (hRlaneDirCd[i] != null)
					model.setHRlaneDirCd(hRlaneDirCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (hVslCd[i] != null)
					model.setHVslCd(hVslCd[i]);
				if (revPortCd[i] != null)
					model.setRevPortCd(revPortCd[i]);
				if (portChkFlg[i] != null)
					model.setPortChkFlg(portChkFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (voyTpCd[i] != null)
					model.setVoyTpCd(voyTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hSkdVoyNo[i] != null)
					model.setHSkdVoyNo(hSkdVoyNo[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (rlaneDirCd[i] != null)
					model.setRlaneDirCd(rlaneDirCd[i]);
				if (hSkdDirCd[i] != null)
					model.setHSkdDirCd(hSkdDirCd[i]);
				if (comVvdFlg[i] != null)
					model.setComVvdFlg(comVvdFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (vvdComLvl[i] != null)
					model.setVvdComLvl(vvdComLvl[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchArMasterRevenueVvdListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchArMasterRevenueVvdListVO[]
	 */
	public SearchArMasterRevenueVvdListVO[] getSearchArMasterRevenueVvdListVOs(){
		SearchArMasterRevenueVvdListVO[] vos = (SearchArMasterRevenueVvdListVO[])models.toArray(new SearchArMasterRevenueVvdListVO[models.size()]);
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
		this.lodQty = this.lodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revYrmon = this.revYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hRlaneDirCd = this.hRlaneDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hVslCd = this.hVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.revPortCd = this.revPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portChkFlg = this.portChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.voyTpCd = this.voyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hSkdVoyNo = this.hSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneDirCd = this.rlaneDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hSkdDirCd = this.hSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comVvdFlg = this.comVvdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdComLvl = this.vvdComLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
