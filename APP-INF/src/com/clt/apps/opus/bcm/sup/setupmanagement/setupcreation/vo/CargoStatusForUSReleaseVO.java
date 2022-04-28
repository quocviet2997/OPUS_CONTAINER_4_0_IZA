/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : CargoStatusForUSReleaseVO.java
*@FileTitle : CargoStatusForUSReleaseVO
*Open Issues :
*Change history :
*@LastModifyDate : 2016.03.02
*@LastModifier : 김성욱
*@LastVersion : 1.0
* 2016.03.02 김성욱 
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 김성욱
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CargoStatusForUSReleaseVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CargoStatusForUSReleaseVO> models = new ArrayList<CargoStatusForUSReleaseVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String copIbRailChkCd = null;
	/* Column Info */
	private String ediRmk1 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ediRmk2 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ediPreSntStsCd = null;
	/* Column Info */
	private String ediOrgStsCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ediEvntStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public CargoStatusForUSReleaseVO() {}

	public CargoStatusForUSReleaseVO(String ibflag, String pagerows, String ediOrgStsCd, String ediPreSntStsCd, String ediEvntStsCd, String ediRmk1, String ediRmk2, String creUsrId, String creDt, String updUsrId, String updDt, String copIbRailChkCd, String edwUpdDt) {
		this.pagerows = pagerows;
		this.copIbRailChkCd = copIbRailChkCd;
		this.ediRmk1 = ediRmk1;
		this.ibflag = ibflag;
		this.ediRmk2 = ediRmk2;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.ediPreSntStsCd = ediPreSntStsCd;
		this.ediOrgStsCd = ediOrgStsCd;
		this.edwUpdDt = edwUpdDt;
		this.updDt = updDt;
		this.ediEvntStsCd = ediEvntStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cop_ib_rail_chk_cd", getCopIbRailChkCd());
		this.hashColumns.put("edi_rmk1", getEdiRmk1());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edi_rmk2", getEdiRmk2());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edi_pre_snt_sts_cd", getEdiPreSntStsCd());
		this.hashColumns.put("edi_org_sts_cd", getEdiOrgStsCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("edi_evnt_sts_cd", getEdiEvntStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cop_ib_rail_chk_cd", "copIbRailChkCd");
		this.hashFields.put("edi_rmk1", "ediRmk1");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edi_rmk2", "ediRmk2");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edi_pre_snt_sts_cd", "ediPreSntStsCd");
		this.hashFields.put("edi_org_sts_cd", "ediOrgStsCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("edi_evnt_sts_cd", "ediEvntStsCd");
		return this.hashFields;
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
	 * @return copIbRailChkCd
	 */
	public String getCopIbRailChkCd() {
		return this.copIbRailChkCd;
	}
	
	/**
	 * Column Info
	 * @return ediRmk1
	 */
	public String getEdiRmk1() {
		return this.ediRmk1;
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
	 * @return ediRmk2
	 */
	public String getEdiRmk2() {
		return this.ediRmk2;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return ediPreSntStsCd
	 */
	public String getEdiPreSntStsCd() {
		return this.ediPreSntStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediOrgStsCd
	 */
	public String getEdiOrgStsCd() {
		return this.ediOrgStsCd;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
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
	 * @return ediEvntStsCd
	 */
	public String getEdiEvntStsCd() {
		return this.ediEvntStsCd;
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
	 * @param copIbRailChkCd
	 */
	public void setCopIbRailChkCd(String copIbRailChkCd) {
		this.copIbRailChkCd = copIbRailChkCd;
	}
	
	/**
	 * Column Info
	 * @param ediRmk1
	 */
	public void setEdiRmk1(String ediRmk1) {
		this.ediRmk1 = ediRmk1;
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
	 * @param ediRmk2
	 */
	public void setEdiRmk2(String ediRmk2) {
		this.ediRmk2 = ediRmk2;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param ediPreSntStsCd
	 */
	public void setEdiPreSntStsCd(String ediPreSntStsCd) {
		this.ediPreSntStsCd = ediPreSntStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediOrgStsCd
	 */
	public void setEdiOrgStsCd(String ediOrgStsCd) {
		this.ediOrgStsCd = ediOrgStsCd;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
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
	 * @param ediEvntStsCd
	 */
	public void setEdiEvntStsCd(String ediEvntStsCd) {
		this.ediEvntStsCd = ediEvntStsCd;
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
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCopIbRailChkCd(JSPUtil.getParameter(request, prefix + "cop_ib_rail_chk_cd", ""));
		setEdiRmk1(JSPUtil.getParameter(request, prefix + "edi_rmk1", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEdiRmk2(JSPUtil.getParameter(request, prefix + "edi_rmk2", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdiPreSntStsCd(JSPUtil.getParameter(request, prefix + "edi_pre_snt_sts_cd", ""));
		setEdiOrgStsCd(JSPUtil.getParameter(request, prefix + "edi_org_sts_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setEdiEvntStsCd(JSPUtil.getParameter(request, prefix + "edi_evnt_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CargoStatusForUSReleaseVO[]
	 */
	public CargoStatusForUSReleaseVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CargoStatusForUSReleaseVO[]
	 */
	public CargoStatusForUSReleaseVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CargoStatusForUSReleaseVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] copIbRailChkCd = (JSPUtil.getParameter(request, prefix	+ "cop_ib_rail_chk_cd", length));
			String[] ediRmk1 = (JSPUtil.getParameter(request, prefix	+ "edi_rmk1", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ediRmk2 = (JSPUtil.getParameter(request, prefix	+ "edi_rmk2", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ediPreSntStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_pre_snt_sts_cd", length));
			String[] ediOrgStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_org_sts_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ediEvntStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CargoStatusForUSReleaseVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (copIbRailChkCd[i] != null)
					model.setCopIbRailChkCd(copIbRailChkCd[i]);
				if (ediRmk1[i] != null)
					model.setEdiRmk1(ediRmk1[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ediRmk2[i] != null)
					model.setEdiRmk2(ediRmk2[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ediPreSntStsCd[i] != null)
					model.setEdiPreSntStsCd(ediPreSntStsCd[i]);
				if (ediOrgStsCd[i] != null)
					model.setEdiOrgStsCd(ediOrgStsCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ediEvntStsCd[i] != null)
					model.setEdiEvntStsCd(ediEvntStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCargoStatusForUSReleaseVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CargoStatusForUSReleaseVO[]
	 */
	public CargoStatusForUSReleaseVO[] getCargoStatusForUSReleaseVOs(){
		CargoStatusForUSReleaseVO[] vos = (CargoStatusForUSReleaseVO[])models.toArray(new CargoStatusForUSReleaseVO[models.size()]);
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
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copIbRailChkCd = this.copIbRailChkCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRmk1 = this.ediRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRmk2 = this.ediRmk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediPreSntStsCd = this.ediPreSntStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediOrgStsCd = this.ediOrgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntStsCd = this.ediEvntStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
