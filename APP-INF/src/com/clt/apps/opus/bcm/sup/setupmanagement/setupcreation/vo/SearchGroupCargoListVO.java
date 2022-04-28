/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchGroupCargoListVO.java
*@FileTitle : SearchGroupCargoListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.08
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.08  
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

public class SearchGroupCargoListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchGroupCargoListVO> models = new ArrayList<SearchGroupCargoListVO>();
	
	/* Column Info */
	private String ediCntrSndTpCd = null;
	/* Column Info */
	private String destCntDesc = null;
	/* Column Info */
	private String ediVslTpCd = null;
	/* Column Info */
	private String ediGrpCd = null;
	/* Column Info */
	private String custEdiStsCd = null;
	/* Column Info */
	private String ediSndItvalHrmnt = null;
	/* Column Info */
	private String coDivCd = null;
	/* Column Info */
	private String ediStndStsCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ediEvntCd = null;
	/* Column Info */
	private String ediCgoRmk = null;
	/* Column Info */
	private String orgContiDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String destContiDesc = null;
	/* Column Info */
	private String orgDestCntDesc = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ediStsSeq = null;
	/* Column Info */
	private String ediAutoSndFlg = null;
	/* Column Info */
	private String ediSndFlg = null;
	/* Column Info */
	private String updUsrId = null;	
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String custSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchGroupCargoListVO() {}

	public SearchGroupCargoListVO(String ibflag, String pagerows, String ediGrpCd, String coDivCd, String ediStndStsCd, String ediStsSeq, String custEdiStsCd, String ediEvntCd, String ediSndFlg, String ediVslTpCd, String ediSndItvalHrmnt, String ediCntrSndTpCd, String orgContiDesc, String orgDestCntDesc, String destContiDesc, String destCntDesc, String ediCgoRmk, String ediAutoSndFlg, String creUsrId, String updUsrId, String custCntCd, String custSeq) {
		this.ediCntrSndTpCd = ediCntrSndTpCd;
		this.destCntDesc = destCntDesc;
		this.ediVslTpCd = ediVslTpCd;
		this.ediGrpCd = ediGrpCd;
		this.custEdiStsCd = custEdiStsCd;
		this.ediSndItvalHrmnt = ediSndItvalHrmnt;
		this.coDivCd = coDivCd;
		this.ediStndStsCd = ediStndStsCd;
		this.pagerows = pagerows;
		this.ediEvntCd = ediEvntCd;
		this.ediCgoRmk = ediCgoRmk;
		this.orgContiDesc = orgContiDesc;
		this.creUsrId = creUsrId;
		this.destContiDesc = destContiDesc;
		this.orgDestCntDesc = orgDestCntDesc;
		this.ibflag = ibflag;
		this.ediStsSeq = ediStsSeq;
		this.ediAutoSndFlg = ediAutoSndFlg;
		this.ediSndFlg = ediSndFlg;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.custSeq = custSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("edi_cntr_snd_tp_cd", getEdiCntrSndTpCd());
		this.hashColumns.put("dest_cnt_desc", getDestCntDesc());
		this.hashColumns.put("edi_vsl_tp_cd", getEdiVslTpCd());
		this.hashColumns.put("edi_grp_cd", getEdiGrpCd());
		this.hashColumns.put("cust_edi_sts_cd", getCustEdiStsCd());
		this.hashColumns.put("edi_snd_itval_hrmnt", getEdiSndItvalHrmnt());
		this.hashColumns.put("co_div_cd", getCoDivCd());
		this.hashColumns.put("edi_stnd_sts_cd", getEdiStndStsCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("edi_evnt_cd", getEdiEvntCd());
		this.hashColumns.put("edi_cgo_rmk", getEdiCgoRmk());
		this.hashColumns.put("org_conti_desc", getOrgContiDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dest_conti_desc", getDestContiDesc());
		this.hashColumns.put("org_dest_cnt_desc", getOrgDestCntDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edi_sts_seq", getEdiStsSeq());
		this.hashColumns.put("edi_auto_snd_flg", getEdiAutoSndFlg());
		this.hashColumns.put("edi_snd_flg", getEdiSndFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("edi_cntr_snd_tp_cd", "ediCntrSndTpCd");
		this.hashFields.put("dest_cnt_desc", "destCntDesc");
		this.hashFields.put("edi_vsl_tp_cd", "ediVslTpCd");
		this.hashFields.put("edi_grp_cd", "ediGrpCd");
		this.hashFields.put("cust_edi_sts_cd", "custEdiStsCd");
		this.hashFields.put("edi_snd_itval_hrmnt", "ediSndItvalHrmnt");
		this.hashFields.put("co_div_cd", "coDivCd");
		this.hashFields.put("edi_stnd_sts_cd", "ediStndStsCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("edi_evnt_cd", "ediEvntCd");
		this.hashFields.put("edi_cgo_rmk", "ediCgoRmk");
		this.hashFields.put("org_conti_desc", "orgContiDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dest_conti_desc", "destContiDesc");
		this.hashFields.put("org_dest_cnt_desc", "orgDestCntDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edi_sts_seq", "ediStsSeq");
		this.hashFields.put("edi_auto_snd_flg", "ediAutoSndFlg");
		this.hashFields.put("edi_snd_flg", "ediSndFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("cust_seq", "custSeq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ediCntrSndTpCd
	 */
	public String getEdiCntrSndTpCd() {
		return this.ediCntrSndTpCd;
	}
	
	/**
	 * Column Info
	 * @return destCntDesc
	 */
	public String getDestCntDesc() {
		return this.destCntDesc;
	}
	
	/**
	 * Column Info
	 * @return ediVslTpCd
	 */
	public String getEdiVslTpCd() {
		return this.ediVslTpCd;
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
	 * @return custEdiStsCd
	 */
	public String getCustEdiStsCd() {
		return this.custEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndItvalHrmnt
	 */
	public String getEdiSndItvalHrmnt() {
		return this.ediSndItvalHrmnt;
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
	 * @return ediStndStsCd
	 */
	public String getEdiStndStsCd() {
		return this.ediStndStsCd;
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
	 * @return ediEvntCd
	 */
	public String getEdiEvntCd() {
		return this.ediEvntCd;
	}
	
	/**
	 * Column Info
	 * @return ediCgoRmk
	 */
	public String getEdiCgoRmk() {
		return this.ediCgoRmk;
	}
	
	/**
	 * Column Info
	 * @return orgContiDesc
	 */
	public String getOrgContiDesc() {
		return this.orgContiDesc;
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
	 * @return destContiDesc
	 */
	public String getDestContiDesc() {
		return this.destContiDesc;
	}
	
	/**
	 * Column Info
	 * @return orgDestCntDesc
	 */
	public String getOrgDestCntDesc() {
		return this.orgDestCntDesc;
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
	 * @return ediStsSeq
	 */
	public String getEdiStsSeq() {
		return this.ediStsSeq;
	}
	
	/**
	 * Column Info
	 * @return ediAutoSndFlg
	 */
	public String getEdiAutoSndFlg() {
		return this.ediAutoSndFlg;
	}
	
	/**
	 * Column Info
	 * @return ediSndFlg
	 */
	public String getEdiSndFlg() {
		return this.ediSndFlg;
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
	 * @return updUsrId
	 */
	public String getCustSeq() {
		return this.custSeq;
	}

	/**
	 * Column Info
	 * @param ediCntrSndTpCd
	 */
	public void setEdiCntrSndTpCd(String ediCntrSndTpCd) {
		this.ediCntrSndTpCd = ediCntrSndTpCd;
	}
	
	/**
	 * Column Info
	 * @param destCntDesc
	 */
	public void setDestCntDesc(String destCntDesc) {
		this.destCntDesc = destCntDesc;
	}
	
	/**
	 * Column Info
	 * @param ediVslTpCd
	 */
	public void setEdiVslTpCd(String ediVslTpCd) {
		this.ediVslTpCd = ediVslTpCd;
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
	 * @param custEdiStsCd
	 */
	public void setCustEdiStsCd(String custEdiStsCd) {
		this.custEdiStsCd = custEdiStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndItvalHrmnt
	 */
	public void setEdiSndItvalHrmnt(String ediSndItvalHrmnt) {
		this.ediSndItvalHrmnt = ediSndItvalHrmnt;
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
	 * @param ediStndStsCd
	 */
	public void setEdiStndStsCd(String ediStndStsCd) {
		this.ediStndStsCd = ediStndStsCd;
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
	 * @param ediEvntCd
	 */
	public void setEdiEvntCd(String ediEvntCd) {
		this.ediEvntCd = ediEvntCd;
	}
	
	/**
	 * Column Info
	 * @param ediCgoRmk
	 */
	public void setEdiCgoRmk(String ediCgoRmk) {
		this.ediCgoRmk = ediCgoRmk;
	}
	
	/**
	 * Column Info
	 * @param orgContiDesc
	 */
	public void setOrgContiDesc(String orgContiDesc) {
		this.orgContiDesc = orgContiDesc;
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
	 * @param destContiDesc
	 */
	public void setDestContiDesc(String destContiDesc) {
		this.destContiDesc = destContiDesc;
	}
	
	/**
	 * Column Info
	 * @param orgDestCntDesc
	 */
	public void setOrgDestCntDesc(String orgDestCntDesc) {
		this.orgDestCntDesc = orgDestCntDesc;
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
	 * @param ediStsSeq
	 */
	public void setEdiStsSeq(String ediStsSeq) {
		this.ediStsSeq = ediStsSeq;
	}
	
	/**
	 * Column Info
	 * @param ediAutoSndFlg
	 */
	public void setEdiAutoSndFlg(String ediAutoSndFlg) {
		this.ediAutoSndFlg = ediAutoSndFlg;
	}
	
	/**
	 * Column Info
	 * @param ediSndFlg
	 */
	public void setEdiSndFlg(String ediSndFlg) {
		this.ediSndFlg = ediSndFlg;
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
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
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
		setEdiCntrSndTpCd(JSPUtil.getParameter(request, prefix + "edi_cntr_snd_tp_cd", ""));
		setDestCntDesc(JSPUtil.getParameter(request, prefix + "dest_cnt_desc", ""));
		setEdiVslTpCd(JSPUtil.getParameter(request, prefix + "edi_vsl_tp_cd", ""));
		setEdiGrpCd(JSPUtil.getParameter(request, prefix + "edi_grp_cd", ""));
		setCustEdiStsCd(JSPUtil.getParameter(request, prefix + "cust_edi_sts_cd", ""));
		setEdiSndItvalHrmnt(JSPUtil.getParameter(request, prefix + "edi_snd_itval_hrmnt", ""));
		setCoDivCd(JSPUtil.getParameter(request, prefix + "co_div_cd", ""));
		setEdiStndStsCd(JSPUtil.getParameter(request, prefix + "edi_stnd_sts_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setEdiEvntCd(JSPUtil.getParameter(request, prefix + "edi_evnt_cd", ""));
		setEdiCgoRmk(JSPUtil.getParameter(request, prefix + "edi_cgo_rmk", ""));
		setOrgContiDesc(JSPUtil.getParameter(request, prefix + "org_conti_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setDestContiDesc(JSPUtil.getParameter(request, prefix + "dest_conti_desc", ""));
		setOrgDestCntDesc(JSPUtil.getParameter(request, prefix + "org_dest_cnt_desc", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEdiStsSeq(JSPUtil.getParameter(request, prefix + "edi_sts_seq", ""));
		setEdiAutoSndFlg(JSPUtil.getParameter(request, prefix + "edi_auto_snd_flg", ""));
		setEdiSndFlg(JSPUtil.getParameter(request, prefix + "edi_snd_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchGroupCargoListVO[]
	 */
	public SearchGroupCargoListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchGroupCargoListVO[]
	 */
	public SearchGroupCargoListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchGroupCargoListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ediCntrSndTpCd = (JSPUtil.getParameter(request, prefix	+ "edi_cntr_snd_tp_cd", length));
			String[] destCntDesc = (JSPUtil.getParameter(request, prefix	+ "dest_cnt_desc", length));
			String[] ediVslTpCd = (JSPUtil.getParameter(request, prefix	+ "edi_vsl_tp_cd", length));
			String[] ediGrpCd = (JSPUtil.getParameter(request, prefix	+ "edi_grp_cd", length));
			String[] custEdiStsCd = (JSPUtil.getParameter(request, prefix	+ "cust_edi_sts_cd", length));
			String[] ediSndItvalHrmnt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_itval_hrmnt", length));
			String[] coDivCd = (JSPUtil.getParameter(request, prefix	+ "co_div_cd", length));
			String[] ediStndStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_stnd_sts_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ediEvntCd = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_cd", length));
			String[] ediCgoRmk = (JSPUtil.getParameter(request, prefix	+ "edi_cgo_rmk", length));
			String[] orgContiDesc = (JSPUtil.getParameter(request, prefix	+ "org_conti_desc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] destContiDesc = (JSPUtil.getParameter(request, prefix	+ "dest_conti_desc", length));
			String[] orgDestCntDesc = (JSPUtil.getParameter(request, prefix	+ "org_dest_cnt_desc", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ediStsSeq = (JSPUtil.getParameter(request, prefix	+ "edi_sts_seq", length));
			String[] ediAutoSndFlg = (JSPUtil.getParameter(request, prefix	+ "edi_auto_snd_flg", length));
			String[] ediSndFlg = (JSPUtil.getParameter(request, prefix	+ "edi_snd_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchGroupCargoListVO();
				if (ediCntrSndTpCd[i] != null)
					model.setEdiCntrSndTpCd(ediCntrSndTpCd[i]);
				if (destCntDesc[i] != null)
					model.setDestCntDesc(destCntDesc[i]);
				if (ediVslTpCd[i] != null)
					model.setEdiVslTpCd(ediVslTpCd[i]);
				if (ediGrpCd[i] != null)
					model.setEdiGrpCd(ediGrpCd[i]);
				if (custEdiStsCd[i] != null)
					model.setCustEdiStsCd(custEdiStsCd[i]);
				if (ediSndItvalHrmnt[i] != null)
					model.setEdiSndItvalHrmnt(ediSndItvalHrmnt[i]);
				if (coDivCd[i] != null)
					model.setCoDivCd(coDivCd[i]);
				if (ediStndStsCd[i] != null)
					model.setEdiStndStsCd(ediStndStsCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ediEvntCd[i] != null)
					model.setEdiEvntCd(ediEvntCd[i]);
				if (ediCgoRmk[i] != null)
					model.setEdiCgoRmk(ediCgoRmk[i]);
				if (orgContiDesc[i] != null)
					model.setOrgContiDesc(orgContiDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (destContiDesc[i] != null)
					model.setDestContiDesc(destContiDesc[i]);
				if (orgDestCntDesc[i] != null)
					model.setOrgDestCntDesc(orgDestCntDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ediStsSeq[i] != null)
					model.setEdiStsSeq(ediStsSeq[i]);
				if (ediAutoSndFlg[i] != null)
					model.setEdiAutoSndFlg(ediAutoSndFlg[i]);
				if (ediSndFlg[i] != null)
					model.setEdiSndFlg(ediSndFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchGroupCargoListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchGroupCargoListVO[]
	 */
	public SearchGroupCargoListVO[] getSearchGroupCargoListVOs(){
		SearchGroupCargoListVO[] vos = (SearchGroupCargoListVO[])models.toArray(new SearchGroupCargoListVO[models.size()]);
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
		this.ediCntrSndTpCd = this.ediCntrSndTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destCntDesc = this.destCntDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediVslTpCd = this.ediVslTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediGrpCd = this.ediGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custEdiStsCd = this.custEdiStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndItvalHrmnt = this.ediSndItvalHrmnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coDivCd = this.coDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStndStsCd = this.ediStndStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntCd = this.ediEvntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediCgoRmk = this.ediCgoRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgContiDesc = this.orgContiDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destContiDesc = this.destContiDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgDestCntDesc = this.orgDestCntDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStsSeq = this.ediStsSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediAutoSndFlg = this.ediAutoSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndFlg = this.ediSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
