/*=========================================================
*Copyright(c) 2016 CyberLogitec
*@FileName : CargoStatusForCustomerVO.java
*@FileTitle : CargoStatusForCustomerVO
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

public class CargoStatusForCustomerVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CargoStatusForCustomerVO> models = new ArrayList<CargoStatusForCustomerVO>();
	
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ediRmk1 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ediRmk2 = null;
	/* Column Info */
	private String ediStsSeq = null;
	/* Column Info */
	private String ediPreSavFlg = null;
	/* Column Info */
	private String ediPstStsCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String preEdiGrpCd = null;
	/* Column Info */
	private String pstEdiGrpCd = null;
	/* Column Info */
	private String orgEdiStsCd = null;
	/* Column Info */
	private String ediPreStsCd = null;
	/* Column Info */
	private String ediPstSavFlg = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String updDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public CargoStatusForCustomerVO() {}

	public CargoStatusForCustomerVO(String ibflag, String pagerows, String orgEdiStsCd, String ediStsSeq, String ediPreStsCd, String ediPreSavFlg, String preEdiGrpCd, String ediPstStsCd, String ediPstSavFlg, String pstEdiGrpCd, String ediRmk1, String ediRmk2, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt) {
		this.pagerows = pagerows;
		this.ediRmk1 = ediRmk1;
		this.ibflag = ibflag;
		this.ediRmk2 = ediRmk2;
		this.ediStsSeq = ediStsSeq;
		this.ediPreSavFlg = ediPreSavFlg;
		this.ediPstStsCd = ediPstStsCd;
		this.updUsrId = updUsrId;
		this.creUsrId = creUsrId;
		this.creDt = creDt;
		this.preEdiGrpCd = preEdiGrpCd;
		this.pstEdiGrpCd = pstEdiGrpCd;
		this.orgEdiStsCd = orgEdiStsCd;
		this.ediPreStsCd = ediPreStsCd;
		this.ediPstSavFlg = ediPstSavFlg;
		this.edwUpdDt = edwUpdDt;
		this.updDt = updDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("edi_rmk1", getEdiRmk1());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edi_rmk2", getEdiRmk2());
		this.hashColumns.put("edi_sts_seq", getEdiStsSeq());
		this.hashColumns.put("edi_pre_sav_flg", getEdiPreSavFlg());
		this.hashColumns.put("edi_pst_sts_cd", getEdiPstStsCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pre_edi_grp_cd", getPreEdiGrpCd());
		this.hashColumns.put("pst_edi_grp_cd", getPstEdiGrpCd());
		this.hashColumns.put("org_edi_sts_cd", getOrgEdiStsCd());
		this.hashColumns.put("edi_pre_sts_cd", getEdiPreStsCd());
		this.hashColumns.put("edi_pst_sav_flg", getEdiPstSavFlg());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("edi_rmk1", "ediRmk1");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edi_rmk2", "ediRmk2");
		this.hashFields.put("edi_sts_seq", "ediStsSeq");
		this.hashFields.put("edi_pre_sav_flg", "ediPreSavFlg");
		this.hashFields.put("edi_pst_sts_cd", "ediPstStsCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pre_edi_grp_cd", "preEdiGrpCd");
		this.hashFields.put("pst_edi_grp_cd", "pstEdiGrpCd");
		this.hashFields.put("org_edi_sts_cd", "orgEdiStsCd");
		this.hashFields.put("edi_pre_sts_cd", "ediPreStsCd");
		this.hashFields.put("edi_pst_sav_flg", "ediPstSavFlg");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("upd_dt", "updDt");
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
	 * @return ediStsSeq
	 */
	public String getEdiStsSeq() {
		return this.ediStsSeq;
	}
	
	/**
	 * Column Info
	 * @return ediPreSavFlg
	 */
	public String getEdiPreSavFlg() {
		return this.ediPreSavFlg;
	}
	
	/**
	 * Column Info
	 * @return ediPstStsCd
	 */
	public String getEdiPstStsCd() {
		return this.ediPstStsCd;
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
	 * @return preEdiGrpCd
	 */
	public String getPreEdiGrpCd() {
		return this.preEdiGrpCd;
	}
	
	/**
	 * Column Info
	 * @return pstEdiGrpCd
	 */
	public String getPstEdiGrpCd() {
		return this.pstEdiGrpCd;
	}
	
	/**
	 * Column Info
	 * @return orgEdiStsCd
	 */
	public String getOrgEdiStsCd() {
		return this.orgEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediPreStsCd
	 */
	public String getEdiPreStsCd() {
		return this.ediPreStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediPstSavFlg
	 */
	public String getEdiPstSavFlg() {
		return this.ediPstSavFlg;
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
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param ediStsSeq
	 */
	public void setEdiStsSeq(String ediStsSeq) {
		this.ediStsSeq = ediStsSeq;
	}
	
	/**
	 * Column Info
	 * @param ediPreSavFlg
	 */
	public void setEdiPreSavFlg(String ediPreSavFlg) {
		this.ediPreSavFlg = ediPreSavFlg;
	}
	
	/**
	 * Column Info
	 * @param ediPstStsCd
	 */
	public void setEdiPstStsCd(String ediPstStsCd) {
		this.ediPstStsCd = ediPstStsCd;
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
	 * @param preEdiGrpCd
	 */
	public void setPreEdiGrpCd(String preEdiGrpCd) {
		this.preEdiGrpCd = preEdiGrpCd;
	}
	
	/**
	 * Column Info
	 * @param pstEdiGrpCd
	 */
	public void setPstEdiGrpCd(String pstEdiGrpCd) {
		this.pstEdiGrpCd = pstEdiGrpCd;
	}
	
	/**
	 * Column Info
	 * @param orgEdiStsCd
	 */
	public void setOrgEdiStsCd(String orgEdiStsCd) {
		this.orgEdiStsCd = orgEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediPreStsCd
	 */
	public void setEdiPreStsCd(String ediPreStsCd) {
		this.ediPreStsCd = ediPreStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediPstSavFlg
	 */
	public void setEdiPstSavFlg(String ediPstSavFlg) {
		this.ediPstSavFlg = ediPstSavFlg;
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
		setEdiRmk1(JSPUtil.getParameter(request, prefix + "edi_rmk1", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEdiRmk2(JSPUtil.getParameter(request, prefix + "edi_rmk2", ""));
		setEdiStsSeq(JSPUtil.getParameter(request, prefix + "edi_sts_seq", ""));
		setEdiPreSavFlg(JSPUtil.getParameter(request, prefix + "edi_pre_sav_flg", ""));
		setEdiPstStsCd(JSPUtil.getParameter(request, prefix + "edi_pst_sts_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPreEdiGrpCd(JSPUtil.getParameter(request, prefix + "pre_edi_grp_cd", ""));
		setPstEdiGrpCd(JSPUtil.getParameter(request, prefix + "pst_edi_grp_cd", ""));
		setOrgEdiStsCd(JSPUtil.getParameter(request, prefix + "org_edi_sts_cd", ""));
		setEdiPreStsCd(JSPUtil.getParameter(request, prefix + "edi_pre_sts_cd", ""));
		setEdiPstSavFlg(JSPUtil.getParameter(request, prefix + "edi_pst_sav_flg", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CargoStatusForCustomerVO[]
	 */
	public CargoStatusForCustomerVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CargoStatusForCustomerVO[]
	 */
	public CargoStatusForCustomerVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CargoStatusForCustomerVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ediRmk1 = (JSPUtil.getParameter(request, prefix	+ "edi_rmk1", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ediRmk2 = (JSPUtil.getParameter(request, prefix	+ "edi_rmk2", length));
			String[] ediStsSeq = (JSPUtil.getParameter(request, prefix	+ "edi_sts_seq", length));
			String[] ediPreSavFlg = (JSPUtil.getParameter(request, prefix	+ "edi_pre_sav_flg", length));
			String[] ediPstStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_pst_sts_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] preEdiGrpCd = (JSPUtil.getParameter(request, prefix	+ "pre_edi_grp_cd", length));
			String[] pstEdiGrpCd = (JSPUtil.getParameter(request, prefix	+ "pst_edi_grp_cd", length));
			String[] orgEdiStsCd = (JSPUtil.getParameter(request, prefix	+ "org_edi_sts_cd", length));
			String[] ediPreStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_pre_sts_cd", length));
			String[] ediPstSavFlg = (JSPUtil.getParameter(request, prefix	+ "edi_pst_sav_flg", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new CargoStatusForCustomerVO();
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ediRmk1[i] != null)
					model.setEdiRmk1(ediRmk1[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ediRmk2[i] != null)
					model.setEdiRmk2(ediRmk2[i]);
				if (ediStsSeq[i] != null)
					model.setEdiStsSeq(ediStsSeq[i]);
				if (ediPreSavFlg[i] != null)
					model.setEdiPreSavFlg(ediPreSavFlg[i]);
				if (ediPstStsCd[i] != null)
					model.setEdiPstStsCd(ediPstStsCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (preEdiGrpCd[i] != null)
					model.setPreEdiGrpCd(preEdiGrpCd[i]);
				if (pstEdiGrpCd[i] != null)
					model.setPstEdiGrpCd(pstEdiGrpCd[i]);
				if (orgEdiStsCd[i] != null)
					model.setOrgEdiStsCd(orgEdiStsCd[i]);
				if (ediPreStsCd[i] != null)
					model.setEdiPreStsCd(ediPreStsCd[i]);
				if (ediPstSavFlg[i] != null)
					model.setEdiPstSavFlg(ediPstSavFlg[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchCargoStatusForCustomerListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CargoStatusForCustomerVO[]
	 */
	public CargoStatusForCustomerVO[] getSearchCargoStatusForCustomerListVOs(){
		CargoStatusForCustomerVO[] vos = (CargoStatusForCustomerVO[])models.toArray(new CargoStatusForCustomerVO[models.size()]);
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
		this.ediRmk1 = this.ediRmk1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRmk2 = this.ediRmk2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStsSeq = this.ediStsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediPreSavFlg = this.ediPreSavFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediPstStsCd = this.ediPstStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preEdiGrpCd = this.preEdiGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstEdiGrpCd = this.pstEdiGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgEdiStsCd = this.orgEdiStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediPreStsCd = this.ediPreStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediPstSavFlg = this.ediPstSavFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
