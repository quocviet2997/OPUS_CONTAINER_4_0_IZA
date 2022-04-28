/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : IbCustCntcVO.java
*@FileTitle : IbCustCntcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.13
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2009.08.13 박성호 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

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

public class BkgIbCustCntcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgIbCustCntcVO> models = new ArrayList<BkgIbCustCntcVO>();
	
	/* Column Info */
	private String nrthAmerEmlChgDpFlgOrg = null;
	/* Column Info */
	private String nrthAmerEmlChgDpFlg = null;
	/* Column Info */
	private String nrthAmerFaxChgDpFlgOrg = null;
	/* Column Info */
	private String nrthAmerFaxChgDpFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String faxSndFlgOrg = null;
	/* Column Info */
	private String cntcRmk = null;
	/* Column Info */
	private String custCntcTpCd = null;
	/* Column Info */
	private String cntcEmlOrg = null;
	/* Column Info */
	private String mphnNo = null;
	/* Column Info */
	private String cntcEml = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String emlSndFlg = null;
	/* Column Info */
	private String emlSndFlgOrg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String faxSndFlg = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String faxNoOrg = null;
	/* Column Info */
	private String custCd = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	
	private List<MdmCustomerVO> mdmCustomerVO = null;
	private List<BkgIbCustCntcVO> detailBkgIbCustCntcVO = null;
	

	public List<MdmCustomerVO> getMdmCustomerVO() {
		return mdmCustomerVO;
	}

	public void setMdmCustomerVO(List<MdmCustomerVO> mdmCustomerVO) {
		this.mdmCustomerVO = mdmCustomerVO;
	}

	public List<BkgIbCustCntcVO> getDetailBkgIbCustCntcVO() {
		return detailBkgIbCustCntcVO;
	}

	public void setDetailBkgIbCustCntcVO(List<BkgIbCustCntcVO> detailBkgIbCustCntcVO) {
		this.detailBkgIbCustCntcVO = detailBkgIbCustCntcVO;
	}



	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgIbCustCntcVO() {}

	public BkgIbCustCntcVO(String ibflag, String pagerows, String ofcCd, String nrthAmerFaxChgDpFlgOrg, String nrthAmerFaxChgDpFlg, String nrthAmerEmlChgDpFlgOrg, String nrthAmerEmlChgDpFlg, String custCntcTpCd, String faxNo, String faxNoOrg, String faxSndFlg, String faxSndFlgOrg, String cntcEml, String cntcEmlOrg, String emlSndFlg, String emlSndFlgOrg, String phnNo, String mphnNo, String updDt, String updUsrId, String usrNm, String cntcRmk, String custCd, String custCntCd, String custSeq, String creUsrId) {
		this.nrthAmerEmlChgDpFlgOrg =nrthAmerEmlChgDpFlgOrg;
		this.nrthAmerEmlChgDpFlg = nrthAmerEmlChgDpFlg;
		this.nrthAmerFaxChgDpFlgOrg =nrthAmerFaxChgDpFlgOrg;
		this.nrthAmerFaxChgDpFlg = nrthAmerFaxChgDpFlg;
		this.updDt = updDt;
		this.phnNo = phnNo;
		this.faxSndFlgOrg = faxSndFlgOrg;
		this.cntcRmk = cntcRmk;
		this.custCntcTpCd = custCntcTpCd;
		this.cntcEmlOrg = cntcEmlOrg;
		this.mphnNo = mphnNo;
		this.cntcEml = cntcEml;
		this.custSeq = custSeq;
		this.emlSndFlg = emlSndFlg;
		this.emlSndFlgOrg = emlSndFlgOrg;
		this.pagerows = pagerows;
		this.faxSndFlg = faxSndFlg;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.usrNm = usrNm;
		this.faxNoOrg = faxNoOrg;
		this.custCd = custCd;
		this.faxNo = faxNo;
		this.custCntCd = custCntCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("nrth_amer_fax_chg_dp_flg_org", getNrthAmerFaxChgDpFlgOrg());
		this.hashColumns.put("nrth_amer_fax_chg_dp_flg", getNrthAmerFaxChgDpFlg());
		this.hashColumns.put("nrth_amer_eml_chg_dp_flg_org", getNrthAmerEmlChgDpFlgOrg());
		this.hashColumns.put("nrth_amer_eml_chg_dp_flg", getNrthAmerEmlChgDpFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("fax_snd_flg_org", getFaxSndFlgOrg());
		this.hashColumns.put("cntc_rmk", getCntcRmk());
		this.hashColumns.put("cust_cntc_tp_cd", getCustCntcTpCd());
		this.hashColumns.put("cntc_eml_org", getCntcEmlOrg());
		this.hashColumns.put("mphn_no", getMphnNo());
		this.hashColumns.put("cntc_eml", getCntcEml());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("eml_snd_flg", getEmlSndFlg());
		this.hashColumns.put("eml_snd_flg_org", getEmlSndFlgOrg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fax_snd_flg", getFaxSndFlg());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("fax_no_org", getFaxNoOrg());
		this.hashColumns.put("cust_cd", getCustCd());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("nrth_amer_eml_chg_dp_flg_org", "nrthAmerEmlChgDpFlgOrg");
		this.hashFields.put("nrth_amer_eml_chg_dp_flg", "nrthAmerEmlChgDpFlg");
		this.hashFields.put("nrth_amer_fax_chg_dp_flg_org", "nrthAmerFaxChgDpFlgOrg");
		this.hashFields.put("nrth_amer_fax_chg_dp_flg", "nrthAmerFaxChgDpFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("fax_snd_flg_org", "faxSndFlgOrg");
		this.hashFields.put("cntc_rmk", "cntcRmk");
		this.hashFields.put("cust_cntc_tp_cd", "custCntcTpCd");
		this.hashFields.put("cntc_eml_org", "cntcEmlOrg");
		this.hashFields.put("mphn_no", "mphnNo");
		this.hashFields.put("cntc_eml", "cntcEml");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("eml_snd_flg", "emlSndFlg");
		this.hashFields.put("eml_snd_flg_org", "emlSndFlgOrg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fax_snd_flg", "faxSndFlg");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("fax_no_org", "faxNoOrg");
		this.hashFields.put("cust_cd", "custCd");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerEmlChgDpFlg
	 */
	public String getNrthAmerEmlChgDpFlg() {
		return this.nrthAmerEmlChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerEmlChgDpFlgOrg
	 */
	public String getNrthAmerEmlChgDpFlgOrg() {
		return this.nrthAmerEmlChgDpFlgOrg;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerFaxChgDpFlg
	 */
	public String getNrthAmerFaxChgDpFlg() {
		return this.nrthAmerFaxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerFaxChgDpFlgOrg
	 */
	public String getNrthAmerFaxChgDpFlgOrg() {
		return this.nrthAmerFaxChgDpFlgOrg;
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
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return faxSndFlgOrg
	 */
	public String getFaxSndFlgOrg() {
		return this.faxSndFlgOrg;
	}
	
	/**
	 * Column Info
	 * @return cntcRmk
	 */
	public String getCntcRmk() {
		return this.cntcRmk;
	}
	
	/**
	 * Column Info
	 * @return custCntcTpCd
	 */
	public String getCustCntcTpCd() {
		return this.custCntcTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntcEmlOrg
	 */
	public String getCntcEmlOrg() {
		return this.cntcEmlOrg;
	}
	
	/**
	 * Column Info
	 * @return mphnNo
	 */
	public String getMphnNo() {
		return this.mphnNo;
	}
	
	/**
	 * Column Info
	 * @return cntcEml
	 */
	public String getCntcEml() {
		return this.cntcEml;
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
	 * @return emlSndFlg
	 */
	public String getEmlSndFlg() {
		return this.emlSndFlg;
	}
	
	/**
	 * Column Info
	 * @return emlSndFlgOrg
	 */
	public String getEmlSndFlgOrg() {
		return this.emlSndFlgOrg;
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
	 * @return faxSndFlg
	 */
	public String getFaxSndFlg() {
		return this.faxSndFlg;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return usrNm
	 */
	public String getUsrNm() {
		return this.usrNm;
	}
	
	/**
	 * Column Info
	 * @return faxNoOrg
	 */
	public String getFaxNoOrg() {
		return this.faxNoOrg;
	}
	
	/**
	 * Column Info
	 * @return custCd
	 */
	public String getCustCd() {
		return this.custCd;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
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
	 * @param nrthAmerEmlChgDpFlg
	 */
	public void setNrthAmerEmlChgDpFlg(String nrthAmerEmlChgDpFlg) {
		this.nrthAmerEmlChgDpFlg = nrthAmerEmlChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerEmlChgDpFlgOrg
	 */
	public void setNrthAmerEmlChgDpFlgOrg(String nrthAmerEmlChgDpFlgOrg) {
		this.nrthAmerEmlChgDpFlgOrg = nrthAmerEmlChgDpFlgOrg;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerFaxChgDpFlg
	 */
	public void setNrthAmerFaxChgDpFlg(String nrthAmerFaxChgDpFlg) {
		this.nrthAmerFaxChgDpFlg = nrthAmerFaxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerFaxChgDpFlgOrg
	 */
	public void setNrthAmerFaxChgDpFlgOrg(String nrthAmerFaxChgDpFlgOrg) {
		this.nrthAmerFaxChgDpFlgOrg = nrthAmerFaxChgDpFlgOrg;
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
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param faxSndFlgOrg
	 */
	public void setFaxSndFlgOrg(String faxSndFlgOrg) {
		this.faxSndFlgOrg = faxSndFlgOrg;
	}
	
	/**
	 * Column Info
	 * @param cntcRmk
	 */
	public void setCntcRmk(String cntcRmk) {
		this.cntcRmk = cntcRmk;
	}
	
	/**
	 * Column Info
	 * @param custCntcTpCd
	 */
	public void setCustCntcTpCd(String custCntcTpCd) {
		this.custCntcTpCd = custCntcTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntcEmlOrg
	 */
	public void setCntcEmlOrg(String cntcEmlOrg) {
		this.cntcEmlOrg = cntcEmlOrg;
	}
	
	/**
	 * Column Info
	 * @param mphnNo
	 */
	public void setMphnNo(String mphnNo) {
		this.mphnNo = mphnNo;
	}
	
	/**
	 * Column Info
	 * @param cntcEml
	 */
	public void setCntcEml(String cntcEml) {
		this.cntcEml = cntcEml;
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
	 * @param emlSndFlg
	 */
	public void setEmlSndFlg(String emlSndFlg) {
		this.emlSndFlg = emlSndFlg;
	}
	
	/**
	 * Column Info
	 * @param emlSndFlgOrg
	 */
	public void setEmlSndFlgOrg(String emlSndFlgOrg) {
		this.emlSndFlgOrg = emlSndFlgOrg;
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
	 * @param faxSndFlg
	 */
	public void setFaxSndFlg(String faxSndFlg) {
		this.faxSndFlg = faxSndFlg;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param usrNm
	 */
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	
	/**
	 * Column Info
	 * @param faxNoOrg
	 */
	public void setFaxNoOrg(String faxNoOrg) {
		this.faxNoOrg = faxNoOrg;
	}
	
	/**
	 * Column Info
	 * @param custCd
	 */
	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setNrthAmerEmlChgDpFlgOrg(JSPUtil.getParameter(request, "nrth_amer_eml_chg_dp_flg_org", ""));
		setNrthAmerEmlChgDpFlg(JSPUtil.getParameter(request, "nrth_amer_eml_chg_dp_flg", ""));
		setNrthAmerFaxChgDpFlgOrg(JSPUtil.getParameter(request, "nrth_amer_fax_chg_dp_flg_org", ""));
		setNrthAmerFaxChgDpFlg(JSPUtil.getParameter(request, "nrth_amer_fax_chg_dp_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setFaxSndFlgOrg(JSPUtil.getParameter(request, "fax_snd_flg_org", ""));
		setCntcRmk(JSPUtil.getParameter(request, "cntc_rmk", ""));
		setCustCntcTpCd(JSPUtil.getParameter(request, "cust_cntc_tp_cd", ""));
		setCntcEmlOrg(JSPUtil.getParameter(request, "cntc_eml_org", ""));
		setMphnNo(JSPUtil.getParameter(request, "mphn_no", ""));
		setCntcEml(JSPUtil.getParameter(request, "cntc_eml", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setEmlSndFlg(JSPUtil.getParameter(request, "eml_snd_flg", ""));
		setEmlSndFlgOrg(JSPUtil.getParameter(request, "eml_snd_flg_org", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFaxSndFlg(JSPUtil.getParameter(request, "fax_snd_flg", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUsrNm(JSPUtil.getParameter(request, "usr_nm", ""));
		setFaxNoOrg(JSPUtil.getParameter(request, "fax_no_org", ""));
		setCustCd(JSPUtil.getParameter(request, "cust_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, "fax_no", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return IbCustCntcVO[]
	 */
	public BkgIbCustCntcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return IbCustCntcVO[]
	 */
	public BkgIbCustCntcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgIbCustCntcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] nrthAmerEmlChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_eml_chg_dp_flg", length));
			String[] nrthAmerEmlChgDpFlgOrg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_eml_chg_dp_flg_org", length));
			String[] nrthAmerFaxChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_fax_chg_dp_flg", length));
			String[] nrthAmerFaxChgDpFlgOrg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_fax_chg_dp_flg_org", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] faxSndFlgOrg = (JSPUtil.getParameter(request, prefix	+ "fax_snd_flg_org", length));
			String[] cntcRmk = (JSPUtil.getParameter(request, prefix	+ "cntc_rmk", length));
			String[] custCntcTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_cntc_tp_cd", length));
			String[] cntcEmlOrg = (JSPUtil.getParameter(request, prefix	+ "cntc_eml_org", length));
			String[] mphnNo = (JSPUtil.getParameter(request, prefix	+ "mphn_no", length));
			String[] cntcEml = (JSPUtil.getParameter(request, prefix	+ "cntc_eml", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] emlSndFlg = (JSPUtil.getParameter(request, prefix	+ "eml_snd_flg", length));
			String[] emlSndFlgOrg = (JSPUtil.getParameter(request, prefix	+ "eml_snd_flg_org", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] faxSndFlg = (JSPUtil.getParameter(request, prefix	+ "fax_snd_flg", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] faxNoOrg = (JSPUtil.getParameter(request, prefix	+ "fax_no_org", length));
			String[] custCd = (JSPUtil.getParameter(request, prefix	+ "cust_cd", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgIbCustCntcVO();
				if (nrthAmerFaxChgDpFlg[i] != null)
					model.setNrthAmerFaxChgDpFlg(nrthAmerFaxChgDpFlg[i]);
				if (nrthAmerFaxChgDpFlgOrg[i] != null)
					model.setNrthAmerFaxChgDpFlgOrg(nrthAmerFaxChgDpFlgOrg[i]);
				if (nrthAmerEmlChgDpFlg[i] != null)
					model.setNrthAmerEmlChgDpFlg(nrthAmerEmlChgDpFlg[i]);
				if (nrthAmerEmlChgDpFlgOrg[i] != null)
					model.setNrthAmerEmlChgDpFlgOrg(nrthAmerEmlChgDpFlgOrg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (faxSndFlgOrg[i] != null)
					model.setFaxSndFlgOrg(faxSndFlgOrg[i]);
				if (cntcRmk[i] != null)
					model.setCntcRmk(cntcRmk[i]);
				if (custCntcTpCd[i] != null)
					model.setCustCntcTpCd(custCntcTpCd[i]);
				if (cntcEmlOrg[i] != null)
					model.setCntcEmlOrg(cntcEmlOrg[i]);
				if (mphnNo[i] != null)
					model.setMphnNo(mphnNo[i]);
				if (cntcEml[i] != null)
					model.setCntcEml(cntcEml[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (emlSndFlg[i] != null)
					model.setEmlSndFlg(emlSndFlg[i]);
				if (emlSndFlgOrg[i] != null)
					model.setEmlSndFlgOrg(emlSndFlgOrg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (faxSndFlg[i] != null)
					model.setFaxSndFlg(faxSndFlg[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (faxNoOrg[i] != null)
					model.setFaxNoOrg(faxNoOrg[i]);
				if (custCd[i] != null)
					model.setCustCd(custCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getIbCustCntcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return IbCustCntcVO[]
	 */
	public BkgIbCustCntcVO[] getIbCustCntcVOs(){
		BkgIbCustCntcVO[] vos = (BkgIbCustCntcVO[])models.toArray(new BkgIbCustCntcVO[models.size()]);
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
		this.nrthAmerEmlChgDpFlgOrg = this.nrthAmerEmlChgDpFlgOrg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerEmlChgDpFlg = this.nrthAmerEmlChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerFaxChgDpFlgOrg = this.nrthAmerFaxChgDpFlgOrg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerFaxChgDpFlg = this.nrthAmerFaxChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndFlgOrg = this.faxSndFlgOrg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcRmk = this.cntcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntcTpCd = this.custCntcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcEmlOrg = this.cntcEmlOrg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mphnNo = this.mphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcEml = this.cntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndFlg = this.emlSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndFlgOrg = this.emlSndFlgOrg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndFlg = this.faxSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNoOrg = this.faxNoOrg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCd = this.custCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
