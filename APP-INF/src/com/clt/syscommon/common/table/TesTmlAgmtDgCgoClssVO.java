/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesTmlAgmtDgCgoClssVO.java
*@FileTitle : TesTmlAgmtDgCgoClssVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.09.25 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesTmlAgmtDgCgoClssVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlAgmtDgCgoClssVO> models = new ArrayList<TesTmlAgmtDgCgoClssVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tmlAgmtOfcCtyCd = null;
	/* Column Info */
	private String dcgoN1stClssFlg = null;
	/* Column Info */
	private String dcgoN4thClssFlg = null;
	/* Column Info */
	private String dcgoSamClssFlg = null;
	/* Column Info */
	private String loclCreDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dcgoNonClssFlg = null;
	/* Column Info */
	private String dcgoAplyTpCd = null;
	/* Column Info */
	private String dcgoN2ndClssFlg = null;
	/* Column Info */
	private String dcgoN7thClssFlg = null;
	/* Column Info */
	private String dcgoN3rdClssFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tmlAgmtVerNo = null;
	/* Column Info */
	private String dcgoN5thClssFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dcgoN9thClssFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String dcgoN8thClssFlg = null;
	/* Column Info */
	private String tmlAgmtSeq = null;
	/* Column Info */
	private String tmlAgmtDtlSeq = null;
	/* Column Info */
	private String dcgoN6thClssFlg = null;
	/* Column Info */
	private String loclUpdDt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesTmlAgmtDgCgoClssVO() {}

	public TesTmlAgmtDgCgoClssVO(String ibflag, String pagerows, String tmlAgmtOfcCtyCd, String tmlAgmtSeq, String tmlAgmtVerNo, String tmlAgmtDtlSeq, String dcgoAplyTpCd, String dcgoN1stClssFlg, String dcgoN2ndClssFlg, String dcgoN3rdClssFlg, String dcgoN4thClssFlg, String dcgoN5thClssFlg, String dcgoN6thClssFlg, String dcgoN7thClssFlg, String dcgoN8thClssFlg, String dcgoN9thClssFlg, String dcgoNonClssFlg, String dcgoSamClssFlg, String creUsrId, String creDt, String updUsrId, String updDt, String loclCreDt, String loclUpdDt) {
		this.updDt = updDt;
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
		this.dcgoN1stClssFlg = dcgoN1stClssFlg;
		this.dcgoN4thClssFlg = dcgoN4thClssFlg;
		this.dcgoSamClssFlg = dcgoSamClssFlg;
		this.loclCreDt = loclCreDt;
		this.creDt = creDt;
		this.dcgoNonClssFlg = dcgoNonClssFlg;
		this.dcgoAplyTpCd = dcgoAplyTpCd;
		this.dcgoN2ndClssFlg = dcgoN2ndClssFlg;
		this.dcgoN7thClssFlg = dcgoN7thClssFlg;
		this.dcgoN3rdClssFlg = dcgoN3rdClssFlg;
		this.pagerows = pagerows;
		this.tmlAgmtVerNo = tmlAgmtVerNo;
		this.dcgoN5thClssFlg = dcgoN5thClssFlg;
		this.creUsrId = creUsrId;
		this.dcgoN9thClssFlg = dcgoN9thClssFlg;
		this.ibflag = ibflag;
		this.dcgoN8thClssFlg = dcgoN8thClssFlg;
		this.tmlAgmtSeq = tmlAgmtSeq;
		this.tmlAgmtDtlSeq = tmlAgmtDtlSeq;
		this.dcgoN6thClssFlg = dcgoN6thClssFlg;
		this.loclUpdDt = loclUpdDt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tml_agmt_ofc_cty_cd", getTmlAgmtOfcCtyCd());
		this.hashColumns.put("dcgo_n1st_clss_flg", getDcgoN1stClssFlg());
		this.hashColumns.put("dcgo_n4th_clss_flg", getDcgoN4thClssFlg());
		this.hashColumns.put("dcgo_sam_clss_flg", getDcgoSamClssFlg());
		this.hashColumns.put("locl_cre_dt", getLoclCreDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dcgo_non_clss_flg", getDcgoNonClssFlg());
		this.hashColumns.put("dcgo_aply_tp_cd", getDcgoAplyTpCd());
		this.hashColumns.put("dcgo_n2nd_clss_flg", getDcgoN2ndClssFlg());
		this.hashColumns.put("dcgo_n7th_clss_flg", getDcgoN7thClssFlg());
		this.hashColumns.put("dcgo_n3rd_clss_flg", getDcgoN3rdClssFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tml_agmt_ver_no", getTmlAgmtVerNo());
		this.hashColumns.put("dcgo_n5th_clss_flg", getDcgoN5thClssFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dcgo_n9th_clss_flg", getDcgoN9thClssFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dcgo_n8th_clss_flg", getDcgoN8thClssFlg());
		this.hashColumns.put("tml_agmt_seq", getTmlAgmtSeq());
		this.hashColumns.put("tml_agmt_dtl_seq", getTmlAgmtDtlSeq());
		this.hashColumns.put("dcgo_n6th_clss_flg", getDcgoN6thClssFlg());
		this.hashColumns.put("locl_upd_dt", getLoclUpdDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tml_agmt_ofc_cty_cd", "tmlAgmtOfcCtyCd");
		this.hashFields.put("dcgo_n1st_clss_flg", "dcgoN1stClssFlg");
		this.hashFields.put("dcgo_n4th_clss_flg", "dcgoN4thClssFlg");
		this.hashFields.put("dcgo_sam_clss_flg", "dcgoSamClssFlg");
		this.hashFields.put("locl_cre_dt", "loclCreDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dcgo_non_clss_flg", "dcgoNonClssFlg");
		this.hashFields.put("dcgo_aply_tp_cd", "dcgoAplyTpCd");
		this.hashFields.put("dcgo_n2nd_clss_flg", "dcgoN2ndClssFlg");
		this.hashFields.put("dcgo_n7th_clss_flg", "dcgoN7thClssFlg");
		this.hashFields.put("dcgo_n3rd_clss_flg", "dcgoN3rdClssFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tml_agmt_ver_no", "tmlAgmtVerNo");
		this.hashFields.put("dcgo_n5th_clss_flg", "dcgoN5thClssFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dcgo_n9th_clss_flg", "dcgoN9thClssFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dcgo_n8th_clss_flg", "dcgoN8thClssFlg");
		this.hashFields.put("tml_agmt_seq", "tmlAgmtSeq");
		this.hashFields.put("tml_agmt_dtl_seq", "tmlAgmtDtlSeq");
		this.hashFields.put("dcgo_n6th_clss_flg", "dcgoN6thClssFlg");
		this.hashFields.put("locl_upd_dt", "loclUpdDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return tmlAgmtOfcCtyCd
	 */
	public String getTmlAgmtOfcCtyCd() {
		return this.tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return dcgoN1stClssFlg
	 */
	public String getDcgoN1stClssFlg() {
		return this.dcgoN1stClssFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoN4thClssFlg
	 */
	public String getDcgoN4thClssFlg() {
		return this.dcgoN4thClssFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoSamClssFlg
	 */
	public String getDcgoSamClssFlg() {
		return this.dcgoSamClssFlg;
	}
	
	/**
	 * Column Info
	 * @return loclCreDt
	 */
	public String getLoclCreDt() {
		return this.loclCreDt;
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
	 * @return dcgoNonClssFlg
	 */
	public String getDcgoNonClssFlg() {
		return this.dcgoNonClssFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoAplyTpCd
	 */
	public String getDcgoAplyTpCd() {
		return this.dcgoAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @return dcgoN2ndClssFlg
	 */
	public String getDcgoN2ndClssFlg() {
		return this.dcgoN2ndClssFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoN7thClssFlg
	 */
	public String getDcgoN7thClssFlg() {
		return this.dcgoN7thClssFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoN3rdClssFlg
	 */
	public String getDcgoN3rdClssFlg() {
		return this.dcgoN3rdClssFlg;
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
	 * @return tmlAgmtVerNo
	 */
	public String getTmlAgmtVerNo() {
		return this.tmlAgmtVerNo;
	}
	
	/**
	 * Column Info
	 * @return dcgoN5thClssFlg
	 */
	public String getDcgoN5thClssFlg() {
		return this.dcgoN5thClssFlg;
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
	 * @return dcgoN9thClssFlg
	 */
	public String getDcgoN9thClssFlg() {
		return this.dcgoN9thClssFlg;
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
	 * @return dcgoN8thClssFlg
	 */
	public String getDcgoN8thClssFlg() {
		return this.dcgoN8thClssFlg;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtSeq
	 */
	public String getTmlAgmtSeq() {
		return this.tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlAgmtDtlSeq
	 */
	public String getTmlAgmtDtlSeq() {
		return this.tmlAgmtDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return dcgoN6thClssFlg
	 */
	public String getDcgoN6thClssFlg() {
		return this.dcgoN6thClssFlg;
	}
	
	/**
	 * Column Info
	 * @return loclUpdDt
	 */
	public String getLoclUpdDt() {
		return this.loclUpdDt;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtOfcCtyCd
	 */
	public void setTmlAgmtOfcCtyCd(String tmlAgmtOfcCtyCd) {
		this.tmlAgmtOfcCtyCd = tmlAgmtOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param dcgoN1stClssFlg
	 */
	public void setDcgoN1stClssFlg(String dcgoN1stClssFlg) {
		this.dcgoN1stClssFlg = dcgoN1stClssFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoN4thClssFlg
	 */
	public void setDcgoN4thClssFlg(String dcgoN4thClssFlg) {
		this.dcgoN4thClssFlg = dcgoN4thClssFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoSamClssFlg
	 */
	public void setDcgoSamClssFlg(String dcgoSamClssFlg) {
		this.dcgoSamClssFlg = dcgoSamClssFlg;
	}
	
	/**
	 * Column Info
	 * @param loclCreDt
	 */
	public void setLoclCreDt(String loclCreDt) {
		this.loclCreDt = loclCreDt;
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
	 * @param dcgoNonClssFlg
	 */
	public void setDcgoNonClssFlg(String dcgoNonClssFlg) {
		this.dcgoNonClssFlg = dcgoNonClssFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoAplyTpCd
	 */
	public void setDcgoAplyTpCd(String dcgoAplyTpCd) {
		this.dcgoAplyTpCd = dcgoAplyTpCd;
	}
	
	/**
	 * Column Info
	 * @param dcgoN2ndClssFlg
	 */
	public void setDcgoN2ndClssFlg(String dcgoN2ndClssFlg) {
		this.dcgoN2ndClssFlg = dcgoN2ndClssFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoN7thClssFlg
	 */
	public void setDcgoN7thClssFlg(String dcgoN7thClssFlg) {
		this.dcgoN7thClssFlg = dcgoN7thClssFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoN3rdClssFlg
	 */
	public void setDcgoN3rdClssFlg(String dcgoN3rdClssFlg) {
		this.dcgoN3rdClssFlg = dcgoN3rdClssFlg;
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
	 * @param tmlAgmtVerNo
	 */
	public void setTmlAgmtVerNo(String tmlAgmtVerNo) {
		this.tmlAgmtVerNo = tmlAgmtVerNo;
	}
	
	/**
	 * Column Info
	 * @param dcgoN5thClssFlg
	 */
	public void setDcgoN5thClssFlg(String dcgoN5thClssFlg) {
		this.dcgoN5thClssFlg = dcgoN5thClssFlg;
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
	 * @param dcgoN9thClssFlg
	 */
	public void setDcgoN9thClssFlg(String dcgoN9thClssFlg) {
		this.dcgoN9thClssFlg = dcgoN9thClssFlg;
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
	 * @param dcgoN8thClssFlg
	 */
	public void setDcgoN8thClssFlg(String dcgoN8thClssFlg) {
		this.dcgoN8thClssFlg = dcgoN8thClssFlg;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtSeq
	 */
	public void setTmlAgmtSeq(String tmlAgmtSeq) {
		this.tmlAgmtSeq = tmlAgmtSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlAgmtDtlSeq
	 */
	public void setTmlAgmtDtlSeq(String tmlAgmtDtlSeq) {
		this.tmlAgmtDtlSeq = tmlAgmtDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param dcgoN6thClssFlg
	 */
	public void setDcgoN6thClssFlg(String dcgoN6thClssFlg) {
		this.dcgoN6thClssFlg = dcgoN6thClssFlg;
	}
	
	/**
	 * Column Info
	 * @param loclUpdDt
	 */
	public void setLoclUpdDt(String loclUpdDt) {
		this.loclUpdDt = loclUpdDt;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTmlAgmtOfcCtyCd(JSPUtil.getParameter(request, "tml_agmt_ofc_cty_cd", ""));
		setDcgoN1stClssFlg(JSPUtil.getParameter(request, "dcgo_n1st_clss_flg", ""));
		setDcgoN4thClssFlg(JSPUtil.getParameter(request, "dcgo_n4th_clss_flg", ""));
		setDcgoSamClssFlg(JSPUtil.getParameter(request, "dcgo_sam_clss_flg", ""));
		setLoclCreDt(JSPUtil.getParameter(request, "locl_cre_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDcgoNonClssFlg(JSPUtil.getParameter(request, "dcgo_non_clss_flg", ""));
		setDcgoAplyTpCd(JSPUtil.getParameter(request, "dcgo_aply_tp_cd", ""));
		setDcgoN2ndClssFlg(JSPUtil.getParameter(request, "dcgo_n2nd_clss_flg", ""));
		setDcgoN7thClssFlg(JSPUtil.getParameter(request, "dcgo_n7th_clss_flg", ""));
		setDcgoN3rdClssFlg(JSPUtil.getParameter(request, "dcgo_n3rd_clss_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTmlAgmtVerNo(JSPUtil.getParameter(request, "tml_agmt_ver_no", ""));
		setDcgoN5thClssFlg(JSPUtil.getParameter(request, "dcgo_n5th_clss_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDcgoN9thClssFlg(JSPUtil.getParameter(request, "dcgo_n9th_clss_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDcgoN8thClssFlg(JSPUtil.getParameter(request, "dcgo_n8th_clss_flg", ""));
		setTmlAgmtSeq(JSPUtil.getParameter(request, "tml_agmt_seq", ""));
		setTmlAgmtDtlSeq(JSPUtil.getParameter(request, "tml_agmt_dtl_seq", ""));
		setDcgoN6thClssFlg(JSPUtil.getParameter(request, "dcgo_n6th_clss_flg", ""));
		setLoclUpdDt(JSPUtil.getParameter(request, "locl_upd_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlAgmtDgCgoClssVO[]
	 */
	public TesTmlAgmtDgCgoClssVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlAgmtDgCgoClssVO[]
	 */
	public TesTmlAgmtDgCgoClssVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlAgmtDgCgoClssVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] tmlAgmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ofc_cty_cd", length));
			String[] dcgoN1stClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n1st_clss_flg", length));
			String[] dcgoN4thClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n4th_clss_flg", length));
			String[] dcgoSamClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_sam_clss_flg", length));
			String[] loclCreDt = (JSPUtil.getParameter(request, prefix	+ "locl_cre_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dcgoNonClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_non_clss_flg", length));
			String[] dcgoAplyTpCd = (JSPUtil.getParameter(request, prefix	+ "dcgo_aply_tp_cd", length));
			String[] dcgoN2ndClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n2nd_clss_flg", length));
			String[] dcgoN7thClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n7th_clss_flg", length));
			String[] dcgoN3rdClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n3rd_clss_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] tmlAgmtVerNo = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_ver_no", length));
			String[] dcgoN5thClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n5th_clss_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] dcgoN9thClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n9th_clss_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] dcgoN8thClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n8th_clss_flg", length));
			String[] tmlAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_seq", length));
			String[] tmlAgmtDtlSeq = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_dtl_seq", length));
			String[] dcgoN6thClssFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_n6th_clss_flg", length));
			String[] loclUpdDt = (JSPUtil.getParameter(request, prefix	+ "locl_upd_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlAgmtDgCgoClssVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tmlAgmtOfcCtyCd[i] != null)
					model.setTmlAgmtOfcCtyCd(tmlAgmtOfcCtyCd[i]);
				if (dcgoN1stClssFlg[i] != null)
					model.setDcgoN1stClssFlg(dcgoN1stClssFlg[i]);
				if (dcgoN4thClssFlg[i] != null)
					model.setDcgoN4thClssFlg(dcgoN4thClssFlg[i]);
				if (dcgoSamClssFlg[i] != null)
					model.setDcgoSamClssFlg(dcgoSamClssFlg[i]);
				if (loclCreDt[i] != null)
					model.setLoclCreDt(loclCreDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dcgoNonClssFlg[i] != null)
					model.setDcgoNonClssFlg(dcgoNonClssFlg[i]);
				if (dcgoAplyTpCd[i] != null)
					model.setDcgoAplyTpCd(dcgoAplyTpCd[i]);
				if (dcgoN2ndClssFlg[i] != null)
					model.setDcgoN2ndClssFlg(dcgoN2ndClssFlg[i]);
				if (dcgoN7thClssFlg[i] != null)
					model.setDcgoN7thClssFlg(dcgoN7thClssFlg[i]);
				if (dcgoN3rdClssFlg[i] != null)
					model.setDcgoN3rdClssFlg(dcgoN3rdClssFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tmlAgmtVerNo[i] != null)
					model.setTmlAgmtVerNo(tmlAgmtVerNo[i]);
				if (dcgoN5thClssFlg[i] != null)
					model.setDcgoN5thClssFlg(dcgoN5thClssFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dcgoN9thClssFlg[i] != null)
					model.setDcgoN9thClssFlg(dcgoN9thClssFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (dcgoN8thClssFlg[i] != null)
					model.setDcgoN8thClssFlg(dcgoN8thClssFlg[i]);
				if (tmlAgmtSeq[i] != null)
					model.setTmlAgmtSeq(tmlAgmtSeq[i]);
				if (tmlAgmtDtlSeq[i] != null)
					model.setTmlAgmtDtlSeq(tmlAgmtDtlSeq[i]);
				if (dcgoN6thClssFlg[i] != null)
					model.setDcgoN6thClssFlg(dcgoN6thClssFlg[i]);
				if (loclUpdDt[i] != null)
					model.setLoclUpdDt(loclUpdDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlAgmtDgCgoClssVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlAgmtDgCgoClssVO[]
	 */
	public TesTmlAgmtDgCgoClssVO[] getTesTmlAgmtDgCgoClssVOs(){
		TesTmlAgmtDgCgoClssVO[] vos = (TesTmlAgmtDgCgoClssVO[])models.toArray(new TesTmlAgmtDgCgoClssVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtOfcCtyCd = this.tmlAgmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN1stClssFlg = this.dcgoN1stClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN4thClssFlg = this.dcgoN4thClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoSamClssFlg = this.dcgoSamClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclCreDt = this.loclCreDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoNonClssFlg = this.dcgoNonClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoAplyTpCd = this.dcgoAplyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN2ndClssFlg = this.dcgoN2ndClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN7thClssFlg = this.dcgoN7thClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN3rdClssFlg = this.dcgoN3rdClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtVerNo = this.tmlAgmtVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN5thClssFlg = this.dcgoN5thClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN9thClssFlg = this.dcgoN9thClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN8thClssFlg = this.dcgoN8thClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtSeq = this.tmlAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtDtlSeq = this.tmlAgmtDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoN6thClssFlg = this.dcgoN6thClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclUpdDt = this.loclUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
