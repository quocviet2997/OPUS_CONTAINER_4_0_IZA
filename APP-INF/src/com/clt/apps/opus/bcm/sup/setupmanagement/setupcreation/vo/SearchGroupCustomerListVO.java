/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchGroupCustomerListVO.java
*@FileTitle : SearchGroupCustomerListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.02.22
*@LastModifier : 
*@LastVersion : 1.0
* 2011.02.22  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo;

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

public class SearchGroupCustomerListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchGroupCustomerListVO> models = new ArrayList<SearchGroupCustomerListVO>();
	
	/* Column Info */
	private String scEffEndDt = null;
	/* Column Info */
	private String ediGrpCd = null;
	/* Column Info */
	private String bkgCfmAutoFlg = null;
	/* Column Info */
	private String blDrftAutoFlg = null;
	/* Column Info */
	private String coDivCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String custRole = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String scEffStDt = null;
	/* Column Info */
	private String blDrftFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgCtrtDivCd = null;
	/* Column Info */
	private String bkgCfmFlg = null;
	/* Column Info */
	private String cgoTrcSvcFlg = null;
	/* Column Info */
	private String scNo = null;
	/* Column Info */
	private String anFlg = null;
	/* Column Info */
	private String esvcBlTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String ibSvcFlg = null;
	/* Column Info */
	private String vtCustOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchGroupCustomerListVO() {}

	public SearchGroupCustomerListVO(String ibflag, String pagerows, String ediGrpCd, String coDivCd, String custCntCd, String custSeq, String custRole, String scNo, String scEffStDt, String scEffEndDt, String ibSvcFlg, String cgoTrcSvcFlg, String bkgCtrtDivCd, String esvcBlTpCd, String bkgCfmFlg, String bkgCfmAutoFlg, String blDrftAutoFlg, String blDrftFlg, String anFlg, String creUsrId, String updUsrId, String vtCustOfcCd) {
		this.scEffEndDt = scEffEndDt;
		this.ediGrpCd = ediGrpCd;
		this.bkgCfmAutoFlg = bkgCfmAutoFlg;
		this.blDrftAutoFlg = blDrftAutoFlg;
		this.coDivCd = coDivCd;
		this.custSeq = custSeq;
		this.custRole = custRole;
		this.pagerows = pagerows;
		this.scEffStDt = scEffStDt;
		this.blDrftFlg = blDrftFlg;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgCtrtDivCd = bkgCtrtDivCd;
		this.bkgCfmFlg = bkgCfmFlg;
		this.cgoTrcSvcFlg = cgoTrcSvcFlg;
		this.scNo = scNo;
		this.anFlg = anFlg;
		this.esvcBlTpCd = esvcBlTpCd;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.ibSvcFlg = ibSvcFlg;
		this.vtCustOfcCd = vtCustOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("sc_eff_end_dt", getScEffEndDt());
		this.hashColumns.put("edi_grp_cd", getEdiGrpCd());
		this.hashColumns.put("bkg_cfm_auto_flg", getBkgCfmAutoFlg());
		this.hashColumns.put("bl_drft_auto_flg", getBlDrftAutoFlg());
		this.hashColumns.put("co_div_cd", getCoDivCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("cust_role", getCustRole());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("sc_eff_st_dt", getScEffStDt());
		this.hashColumns.put("bl_drft_flg", getBlDrftFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_ctrt_div_cd", getBkgCtrtDivCd());
		this.hashColumns.put("bkg_cfm_flg", getBkgCfmFlg());
		this.hashColumns.put("cgo_trc_svc_flg", getCgoTrcSvcFlg());
		this.hashColumns.put("sc_no", getScNo());
		this.hashColumns.put("an_flg", getAnFlg());
		this.hashColumns.put("esvc_bl_tp_cd", getEsvcBlTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("ib_svc_flg", getIbSvcFlg());
		this.hashColumns.put("vt_cust_ofc_cd", getVtCustOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("sc_eff_end_dt", "scEffEndDt");
		this.hashFields.put("edi_grp_cd", "ediGrpCd");
		this.hashFields.put("bkg_cfm_auto_flg", "bkgCfmAutoFlg");
		this.hashFields.put("bl_drft_auto_flg", "blDrftAutoFlg");
		this.hashFields.put("co_div_cd", "coDivCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("cust_role", "custRole");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("sc_eff_st_dt", "scEffStDt");
		this.hashFields.put("bl_drft_flg", "blDrftFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_ctrt_div_cd", "bkgCtrtDivCd");
		this.hashFields.put("bkg_cfm_flg", "bkgCfmFlg");
		this.hashFields.put("cgo_trc_svc_flg", "cgoTrcSvcFlg");
		this.hashFields.put("sc_no", "scNo");
		this.hashFields.put("an_flg", "anFlg");
		this.hashFields.put("esvc_bl_tp_cd", "esvcBlTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("ib_svc_flg", "ibSvcFlg");
		this.hashFields.put("vt_cust_ofc_cd", "vtCustOfcCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return scEffEndDt
	 */
	public String getScEffEndDt() {
		return this.scEffEndDt;
	}
	
	/**
	 * Column Info
	 * @return ediGrpCd
	 */
	public String getEdiGrpCd() {
		return this.ediGrpCd;
	}
	
	/**
	 * Column Info
	 * @return bkgCfmAutoFlg
	 */
	public String getBkgCfmAutoFlg() {
		return this.bkgCfmAutoFlg;
	}
	
	/**
	 * Column Info
	 * @return blDrftAutoFlg
	 */
	public String getBlDrftAutoFlg() {
		return this.blDrftAutoFlg;
	}
	
	/**
	 * Column Info
	 * @return coDivCd
	 */
	public String getCoDivCd() {
		return this.coDivCd;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return custRole
	 */
	public String getCustRole() {
		return this.custRole;
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
	 * @return scEffStDt
	 */
	public String getScEffStDt() {
		return this.scEffStDt;
	}
	
	/**
	 * Column Info
	 * @return blDrftFlg
	 */
	public String getBlDrftFlg() {
		return this.blDrftFlg;
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
	 * @return bkgCtrtDivCd
	 */
	public String getBkgCtrtDivCd() {
		return this.bkgCtrtDivCd;
	}
	
	/**
	 * Column Info
	 * @return bkgCfmFlg
	 */
	public String getBkgCfmFlg() {
		return this.bkgCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return cgoTrcSvcFlg
	 */
	public String getCgoTrcSvcFlg() {
		return this.cgoTrcSvcFlg;
	}
	
	/**
	 * Column Info
	 * @return scNo
	 */
	public String getScNo() {
		return this.scNo;
	}
	
	/**
	 * Column Info
	 * @return anFlg
	 */
	public String getAnFlg() {
		return this.anFlg;
	}
	
	/**
	 * Column Info
	 * @return esvcBlTpCd
	 */
	public String getEsvcBlTpCd() {
		return this.esvcBlTpCd;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return ibSvcFlg
	 */
	public String getIbSvcFlg() {
		return this.ibSvcFlg;
	}
	
	/**
	 * Column Info
	 * @return vtCustOfcCd
	 */
	public String getVtCustOfcCd() {
		return this.vtCustOfcCd;
	}	
	

	/**
	 * Column Info
	 * @param scEffEndDt
	 */
	public void setScEffEndDt(String scEffEndDt) {
		this.scEffEndDt = scEffEndDt;
	}
	
	/**
	 * Column Info
	 * @param ediGrpCd
	 */
	public void setEdiGrpCd(String ediGrpCd) {
		this.ediGrpCd = ediGrpCd;
	}
	
	/**
	 * Column Info
	 * @param bkgCfmAutoFlg
	 */
	public void setBkgCfmAutoFlg(String bkgCfmAutoFlg) {
		this.bkgCfmAutoFlg = bkgCfmAutoFlg;
	}
	
	/**
	 * Column Info
	 * @param blDrftAutoFlg
	 */
	public void setBlDrftAutoFlg(String blDrftAutoFlg) {
		this.blDrftAutoFlg = blDrftAutoFlg;
	}
	
	/**
	 * Column Info
	 * @param coDivCd
	 */
	public void setCoDivCd(String coDivCd) {
		this.coDivCd = coDivCd;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param custRole
	 */
	public void setCustRole(String custRole) {
		this.custRole = custRole;
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
	 * @param scEffStDt
	 */
	public void setScEffStDt(String scEffStDt) {
		this.scEffStDt = scEffStDt;
	}
	
	/**
	 * Column Info
	 * @param blDrftFlg
	 */
	public void setBlDrftFlg(String blDrftFlg) {
		this.blDrftFlg = blDrftFlg;
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
	 * @param bkgCtrtDivCd
	 */
	public void setBkgCtrtDivCd(String bkgCtrtDivCd) {
		this.bkgCtrtDivCd = bkgCtrtDivCd;
	}
	
	/**
	 * Column Info
	 * @param bkgCfmFlg
	 */
	public void setBkgCfmFlg(String bkgCfmFlg) {
		this.bkgCfmFlg = bkgCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param cgoTrcSvcFlg
	 */
	public void setCgoTrcSvcFlg(String cgoTrcSvcFlg) {
		this.cgoTrcSvcFlg = cgoTrcSvcFlg;
	}
	
	/**
	 * Column Info
	 * @param scNo
	 */
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	
	/**
	 * Column Info
	 * @param anFlg
	 */
	public void setAnFlg(String anFlg) {
		this.anFlg = anFlg;
	}
	
	/**
	 * Column Info
	 * @param esvcBlTpCd
	 */
	public void setEsvcBlTpCd(String esvcBlTpCd) {
		this.esvcBlTpCd = esvcBlTpCd;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param ibSvcFlg
	 */
	public void setIbSvcFlg(String ibSvcFlg) {
		this.ibSvcFlg = ibSvcFlg;
	}
	
	/**
	 * Column Info
	 * @param vtCustOfcCd
	 */
	public void setVtCustOfcCd(String vtCustOfcCd) {
		this.vtCustOfcCd = vtCustOfcCd;
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
		setScEffEndDt(JSPUtil.getParameter(request, prefix + "sc_eff_end_dt", ""));
		setEdiGrpCd(JSPUtil.getParameter(request, prefix + "edi_grp_cd", ""));
		setBkgCfmAutoFlg(JSPUtil.getParameter(request, prefix + "bkg_cfm_auto_flg", ""));
		setBlDrftAutoFlg(JSPUtil.getParameter(request, prefix + "bl_drft_auto_flg", ""));
		setCoDivCd(JSPUtil.getParameter(request, prefix + "co_div_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setCustRole(JSPUtil.getParameter(request, prefix + "cust_role", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setScEffStDt(JSPUtil.getParameter(request, prefix + "sc_eff_st_dt", ""));
		setBlDrftFlg(JSPUtil.getParameter(request, prefix + "bl_drft_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBkgCtrtDivCd(JSPUtil.getParameter(request, prefix + "bkg_ctrt_div_cd", ""));
		setBkgCfmFlg(JSPUtil.getParameter(request, prefix + "bkg_cfm_flg", ""));
		setCgoTrcSvcFlg(JSPUtil.getParameter(request, prefix + "cgo_trc_svc_flg", ""));
		setScNo(JSPUtil.getParameter(request, prefix + "sc_no", ""));
		setAnFlg(JSPUtil.getParameter(request, prefix + "an_flg", ""));
		setEsvcBlTpCd(JSPUtil.getParameter(request, prefix + "esvc_bl_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
		setIbSvcFlg(JSPUtil.getParameter(request, prefix + "ib_svc_flg", ""));
		setVtCustOfcCd(JSPUtil.getParameter(request, prefix + "vt_cust_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchGroupCustomerListVO[]
	 */
	public SearchGroupCustomerListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchGroupCustomerListVO[]
	 */
	public SearchGroupCustomerListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchGroupCustomerListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] scEffEndDt = (JSPUtil.getParameter(request, prefix	+ "sc_eff_end_dt", length));
			String[] ediGrpCd = (JSPUtil.getParameter(request, prefix	+ "edi_grp_cd", length));
			String[] bkgCfmAutoFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_cfm_auto_flg", length));
			String[] blDrftAutoFlg = (JSPUtil.getParameter(request, prefix	+ "bl_drft_auto_flg", length));
			String[] coDivCd = (JSPUtil.getParameter(request, prefix	+ "co_div_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] custRole = (JSPUtil.getParameter(request, prefix	+ "cust_role", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] scEffStDt = (JSPUtil.getParameter(request, prefix	+ "sc_eff_st_dt", length));
			String[] blDrftFlg = (JSPUtil.getParameter(request, prefix	+ "bl_drft_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgCtrtDivCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ctrt_div_cd", length));
			String[] bkgCfmFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_cfm_flg", length));
			String[] cgoTrcSvcFlg = (JSPUtil.getParameter(request, prefix	+ "cgo_trc_svc_flg", length));
			String[] scNo = (JSPUtil.getParameter(request, prefix	+ "sc_no", length));
			String[] anFlg = (JSPUtil.getParameter(request, prefix	+ "an_flg", length));
			String[] esvcBlTpCd = (JSPUtil.getParameter(request, prefix	+ "esvc_bl_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] ibSvcFlg = (JSPUtil.getParameter(request, prefix	+ "ib_svc_flg", length));
			String[] vtCustOfcCd = (JSPUtil.getParameter(request, prefix	+ "vt_cust_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchGroupCustomerListVO();
				if (scEffEndDt[i] != null)
					model.setScEffEndDt(scEffEndDt[i]);
				if (ediGrpCd[i] != null)
					model.setEdiGrpCd(ediGrpCd[i]);
				if (bkgCfmAutoFlg[i] != null)
					model.setBkgCfmAutoFlg(bkgCfmAutoFlg[i]);
				if (blDrftAutoFlg[i] != null)
					model.setBlDrftAutoFlg(blDrftAutoFlg[i]);
				if (coDivCd[i] != null)
					model.setCoDivCd(coDivCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (custRole[i] != null)
					model.setCustRole(custRole[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (scEffStDt[i] != null)
					model.setScEffStDt(scEffStDt[i]);
				if (blDrftFlg[i] != null)
					model.setBlDrftFlg(blDrftFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgCtrtDivCd[i] != null)
					model.setBkgCtrtDivCd(bkgCtrtDivCd[i]);
				if (bkgCfmFlg[i] != null)
					model.setBkgCfmFlg(bkgCfmFlg[i]);
				if (cgoTrcSvcFlg[i] != null)
					model.setCgoTrcSvcFlg(cgoTrcSvcFlg[i]);
				if (scNo[i] != null)
					model.setScNo(scNo[i]);
				if (anFlg[i] != null)
					model.setAnFlg(anFlg[i]);
				if (esvcBlTpCd[i] != null)
					model.setEsvcBlTpCd(esvcBlTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (ibSvcFlg[i] != null)
					model.setIbSvcFlg(ibSvcFlg[i]);
				if (vtCustOfcCd[i] != null)
					model.setVtCustOfcCd(vtCustOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchGroupCustomerListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchGroupCustomerListVO[]
	 */
	public SearchGroupCustomerListVO[] getSearchGroupCustomerListVOs(){
		SearchGroupCustomerListVO[] vos = (SearchGroupCustomerListVO[])models.toArray(new SearchGroupCustomerListVO[models.size()]);
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
		this.scEffEndDt = this.scEffEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediGrpCd = this.ediGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCfmAutoFlg = this.bkgCfmAutoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blDrftAutoFlg = this.blDrftAutoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coDivCd = this.coDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custRole = this.custRole .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scEffStDt = this.scEffStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blDrftFlg = this.blDrftFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCtrtDivCd = this.bkgCtrtDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCfmFlg = this.bkgCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoTrcSvcFlg = this.cgoTrcSvcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scNo = this.scNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anFlg = this.anFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.esvcBlTpCd = this.esvcBlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibSvcFlg = this.ibSvcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vtCustOfcCd = this.vtCustOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
