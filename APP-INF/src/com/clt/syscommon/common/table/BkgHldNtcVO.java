/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgHldNtcVO.java
*@FileTitle : BkgHldNtcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.04.07
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2010.04.07 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgHldNtcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHldNtcVO> models = new ArrayList<BkgHldNtcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String preHldDt = null;
	/* Column Info */
	private String hldNtcTpCd = null;
	/* Column Info */
	private String hldEclzOblFlg = null;
	/* Column Info */
	private String cfmHldDt = null;
	/* Column Info */
	private String custNm = null;
	/* Column Info */
	private String cstmsHldNtcFomCd = null;
	/* Column Info */
	private String cstmsHldLocCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cstmsPreHldCd = null;
	/* Column Info */
	private String cstmsCfmHldCd = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String ntcSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String hldDiffRmk = null;
	/* Column Info */
	private String bkgCustTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHldNtcVO() {}

	public BkgHldNtcVO(String ibflag, String pagerows, String bkgNo, String ntcSeq, String hldNtcTpCd, String cstmsHldNtcFomCd, String cstmsHldLocCd, String custCntCd, String custSeq, String custNm, String cstmsPreHldCd, String preHldDt, String cstmsCfmHldCd, String cfmHldDt, String hldEclzOblFlg, String hldDiffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String bkgCustTpCd) {
		this.updDt = updDt;
		this.preHldDt = preHldDt;
		this.hldNtcTpCd = hldNtcTpCd;
		this.hldEclzOblFlg = hldEclzOblFlg;
		this.cfmHldDt = cfmHldDt;
		this.custNm = custNm;
		this.cstmsHldNtcFomCd = cstmsHldNtcFomCd;
		this.cstmsHldLocCd = cstmsHldLocCd;
		this.creDt = creDt;
		this.cstmsPreHldCd = cstmsPreHldCd;
		this.cstmsCfmHldCd = cstmsCfmHldCd;
		this.custSeq = custSeq;
		this.ntcSeq = ntcSeq;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.hldDiffRmk = hldDiffRmk;
		this.bkgCustTpCd = bkgCustTpCd;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pre_hld_dt", getPreHldDt());
		this.hashColumns.put("hld_ntc_tp_cd", getHldNtcTpCd());
		this.hashColumns.put("hld_eclz_obl_flg", getHldEclzOblFlg());
		this.hashColumns.put("cfm_hld_dt", getCfmHldDt());
		this.hashColumns.put("cust_nm", getCustNm());
		this.hashColumns.put("cstms_hld_ntc_fom_cd", getCstmsHldNtcFomCd());
		this.hashColumns.put("cstms_hld_loc_cd", getCstmsHldLocCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cstms_pre_hld_cd", getCstmsPreHldCd());
		this.hashColumns.put("cstms_cfm_hld_cd", getCstmsCfmHldCd());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("ntc_seq", getNtcSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("hld_diff_rmk", getHldDiffRmk());
		this.hashColumns.put("bkg_cust_tp_cd", getBkgCustTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pre_hld_dt", "preHldDt");
		this.hashFields.put("hld_ntc_tp_cd", "hldNtcTpCd");
		this.hashFields.put("hld_eclz_obl_flg", "hldEclzOblFlg");
		this.hashFields.put("cfm_hld_dt", "cfmHldDt");
		this.hashFields.put("cust_nm", "custNm");
		this.hashFields.put("cstms_hld_ntc_fom_cd", "cstmsHldNtcFomCd");
		this.hashFields.put("cstms_hld_loc_cd", "cstmsHldLocCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cstms_pre_hld_cd", "cstmsPreHldCd");
		this.hashFields.put("cstms_cfm_hld_cd", "cstmsCfmHldCd");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("ntc_seq", "ntcSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("hld_diff_rmk", "hldDiffRmk");
		this.hashFields.put("bkg_cust_tp_cd", "bkgCustTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
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
	 * @return preHldDt
	 */
	public String getPreHldDt() {
		return this.preHldDt;
	}
	
	/**
	 * Column Info
	 * @return hldNtcTpCd
	 */
	public String getHldNtcTpCd() {
		return this.hldNtcTpCd;
	}
	
	/**
	 * Column Info
	 * @return hldEclzOblFlg
	 */
	public String getHldEclzOblFlg() {
		return this.hldEclzOblFlg;
	}
	
	/**
	 * Column Info
	 * @return cfmHldDt
	 */
	public String getCfmHldDt() {
		return this.cfmHldDt;
	}
	
	/**
	 * Column Info
	 * @return custNm
	 */
	public String getCustNm() {
		return this.custNm;
	}
	
	/**
	 * Column Info
	 * @return cstmsHldNtcFomCd
	 */
	public String getCstmsHldNtcFomCd() {
		return this.cstmsHldNtcFomCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsHldLocCd
	 */
	public String getCstmsHldLocCd() {
		return this.cstmsHldLocCd;
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
	 * @return cstmsPreHldCd
	 */
	public String getCstmsPreHldCd() {
		return this.cstmsPreHldCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsCfmHldCd
	 */
	public String getCstmsCfmHldCd() {
		return this.cstmsCfmHldCd;
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
	 * @return ntcSeq
	 */
	public String getNtcSeq() {
		return this.ntcSeq;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return hldDiffRmk
	 */
	public String getHldDiffRmk() {
		return this.hldDiffRmk;
	}
	
	/**
	 * Column Info
	 * @return bkgCustTpCd
	 */
	public String getBkgCustTpCd() {
		return this.bkgCustTpCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param preHldDt
	 */
	public void setPreHldDt(String preHldDt) {
		this.preHldDt = preHldDt;
	}
	
	/**
	 * Column Info
	 * @param hldNtcTpCd
	 */
	public void setHldNtcTpCd(String hldNtcTpCd) {
		this.hldNtcTpCd = hldNtcTpCd;
	}
	
	/**
	 * Column Info
	 * @param hldEclzOblFlg
	 */
	public void setHldEclzOblFlg(String hldEclzOblFlg) {
		this.hldEclzOblFlg = hldEclzOblFlg;
	}
	
	/**
	 * Column Info
	 * @param cfmHldDt
	 */
	public void setCfmHldDt(String cfmHldDt) {
		this.cfmHldDt = cfmHldDt;
	}
	
	/**
	 * Column Info
	 * @param custNm
	 */
	public void setCustNm(String custNm) {
		this.custNm = custNm;
	}
	
	/**
	 * Column Info
	 * @param cstmsHldNtcFomCd
	 */
	public void setCstmsHldNtcFomCd(String cstmsHldNtcFomCd) {
		this.cstmsHldNtcFomCd = cstmsHldNtcFomCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsHldLocCd
	 */
	public void setCstmsHldLocCd(String cstmsHldLocCd) {
		this.cstmsHldLocCd = cstmsHldLocCd;
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
	 * @param cstmsPreHldCd
	 */
	public void setCstmsPreHldCd(String cstmsPreHldCd) {
		this.cstmsPreHldCd = cstmsPreHldCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsCfmHldCd
	 */
	public void setCstmsCfmHldCd(String cstmsCfmHldCd) {
		this.cstmsCfmHldCd = cstmsCfmHldCd;
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
	 * @param ntcSeq
	 */
	public void setNtcSeq(String ntcSeq) {
		this.ntcSeq = ntcSeq;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param hldDiffRmk
	 */
	public void setHldDiffRmk(String hldDiffRmk) {
		this.hldDiffRmk = hldDiffRmk;
	}
	
	/**
	 * Column Info
	 * @param bkgCustTpCd
	 */
	public void setBkgCustTpCd(String bkgCustTpCd) {
		this.bkgCustTpCd = bkgCustTpCd;
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
		setPreHldDt(JSPUtil.getParameter(request, prefix + "pre_hld_dt", ""));
		setHldNtcTpCd(JSPUtil.getParameter(request, prefix + "hld_ntc_tp_cd", ""));
		setHldEclzOblFlg(JSPUtil.getParameter(request, prefix + "hld_eclz_obl_flg", ""));
		setCfmHldDt(JSPUtil.getParameter(request, prefix + "cfm_hld_dt", ""));
		setCustNm(JSPUtil.getParameter(request, prefix + "cust_nm", ""));
		setCstmsHldNtcFomCd(JSPUtil.getParameter(request, prefix + "cstms_hld_ntc_fom_cd", ""));
		setCstmsHldLocCd(JSPUtil.getParameter(request, prefix + "cstms_hld_loc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCstmsPreHldCd(JSPUtil.getParameter(request, prefix + "cstms_pre_hld_cd", ""));
		setCstmsCfmHldCd(JSPUtil.getParameter(request, prefix + "cstms_cfm_hld_cd", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setNtcSeq(JSPUtil.getParameter(request, prefix + "ntc_seq", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setHldDiffRmk(JSPUtil.getParameter(request, prefix + "hld_diff_rmk", ""));
		setBkgCustTpCd(JSPUtil.getParameter(request, prefix + "bkg_cust_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHldNtcVO[]
	 */
	public BkgHldNtcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHldNtcVO[]
	 */
	public BkgHldNtcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHldNtcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] preHldDt = (JSPUtil.getParameter(request, prefix	+ "pre_hld_dt", length));
			String[] hldNtcTpCd = (JSPUtil.getParameter(request, prefix	+ "hld_ntc_tp_cd", length));
			String[] hldEclzOblFlg = (JSPUtil.getParameter(request, prefix	+ "hld_eclz_obl_flg", length));
			String[] cfmHldDt = (JSPUtil.getParameter(request, prefix	+ "cfm_hld_dt", length));
			String[] custNm = (JSPUtil.getParameter(request, prefix	+ "cust_nm", length));
			String[] cstmsHldNtcFomCd = (JSPUtil.getParameter(request, prefix	+ "cstms_hld_ntc_fom_cd", length));
			String[] cstmsHldLocCd = (JSPUtil.getParameter(request, prefix	+ "cstms_hld_loc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cstmsPreHldCd = (JSPUtil.getParameter(request, prefix	+ "cstms_pre_hld_cd", length));
			String[] cstmsCfmHldCd = (JSPUtil.getParameter(request, prefix	+ "cstms_cfm_hld_cd", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] ntcSeq = (JSPUtil.getParameter(request, prefix	+ "ntc_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] hldDiffRmk = (JSPUtil.getParameter(request, prefix	+ "hld_diff_rmk", length));
			String[] bkgCustTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cust_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgHldNtcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (preHldDt[i] != null)
					model.setPreHldDt(preHldDt[i]);
				if (hldNtcTpCd[i] != null)
					model.setHldNtcTpCd(hldNtcTpCd[i]);
				if (hldEclzOblFlg[i] != null)
					model.setHldEclzOblFlg(hldEclzOblFlg[i]);
				if (cfmHldDt[i] != null)
					model.setCfmHldDt(cfmHldDt[i]);
				if (custNm[i] != null)
					model.setCustNm(custNm[i]);
				if (cstmsHldNtcFomCd[i] != null)
					model.setCstmsHldNtcFomCd(cstmsHldNtcFomCd[i]);
				if (cstmsHldLocCd[i] != null)
					model.setCstmsHldLocCd(cstmsHldLocCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cstmsPreHldCd[i] != null)
					model.setCstmsPreHldCd(cstmsPreHldCd[i]);
				if (cstmsCfmHldCd[i] != null)
					model.setCstmsCfmHldCd(cstmsCfmHldCd[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (ntcSeq[i] != null)
					model.setNtcSeq(ntcSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (hldDiffRmk[i] != null)
					model.setHldDiffRmk(hldDiffRmk[i]);
				if (bkgCustTpCd[i] != null)
					model.setBkgCustTpCd(bkgCustTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHldNtcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHldNtcVO[]
	 */
	public BkgHldNtcVO[] getBkgHldNtcVOs(){
		BkgHldNtcVO[] vos = (BkgHldNtcVO[])models.toArray(new BkgHldNtcVO[models.size()]);
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
		this.preHldDt = this.preHldDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldNtcTpCd = this.hldNtcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldEclzOblFlg = this.hldEclzOblFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmHldDt = this.cfmHldDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custNm = this.custNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsHldNtcFomCd = this.cstmsHldNtcFomCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsHldLocCd = this.cstmsHldLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPreHldCd = this.cstmsPreHldCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsCfmHldCd = this.cstmsCfmHldCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcSeq = this.ntcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldDiffRmk = this.hldDiffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCustTpCd = this.bkgCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
