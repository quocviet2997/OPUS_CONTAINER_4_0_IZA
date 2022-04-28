/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SceFltFileMsgDtlVslVO.java
*@FileTitle : SceFltFileMsgDtlVslVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.12
*@LastModifier : 오현경
*@LastVersion : 1.0
* 2010.05.12 오현경 
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
 * @author 오현경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceFltFileMsgDtlVslVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceFltFileMsgDtlVslVO> models = new ArrayList<SceFltFileMsgDtlVslVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vvdRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fltFileRefNo = null;
	/* Column Info */
	private String destActArrDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String destNodCd = null;
	/* Column Info */
	private String destActDepDt = null;
	/* Column Info */
	private String vvdSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String destEstmDepDt = null;
	/* Column Info */
	private String orgActArrDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String ediSndHr = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ediSndSeq = null;
	/* Column Info */
	private String orgEstmDepDt = null;
	/* Column Info */
	private String orgEstmArrDt = null;
	/* Column Info */
	private String destEstmArrDt = null;
	/* Column Info */
	private String orgActDepDt = null;
	/* Column Info */
	private String orgNodCd = null;
	/* Column Info */
	private String ediSndDtlSeq = null;
	/* Column Info */
	private String ediSndDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceFltFileMsgDtlVslVO() {}

	public SceFltFileMsgDtlVslVO(String ibflag, String pagerows, String ediSndDt, String ediSndHr, String ediSndSeq, String ediSndDtlSeq, String fltFileRefNo, String vvdSeq, String vslCd, String skdVoyNo, String skdDirCd, String orgNodCd, String destNodCd, String orgEstmArrDt, String orgEstmDepDt, String destEstmArrDt, String destEstmDepDt, String orgActArrDt, String orgActDepDt, String destActArrDt, String destActDepDt, String vvdRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.vvdRmk = vvdRmk;
		this.creDt = creDt;
		this.fltFileRefNo = fltFileRefNo;
		this.destActArrDt = destActArrDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.destNodCd = destNodCd;
		this.destActDepDt = destActDepDt;
		this.vvdSeq = vvdSeq;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.destEstmDepDt = destEstmDepDt;
		this.orgActArrDt = orgActArrDt;
		this.skdVoyNo = skdVoyNo;
		this.skdDirCd = skdDirCd;
		this.ediSndHr = ediSndHr;
		this.creUsrId = creUsrId;
		this.ediSndSeq = ediSndSeq;
		this.orgEstmDepDt = orgEstmDepDt;
		this.orgEstmArrDt = orgEstmArrDt;
		this.destEstmArrDt = destEstmArrDt;
		this.orgActDepDt = orgActDepDt;
		this.orgNodCd = orgNodCd;
		this.ediSndDtlSeq = ediSndDtlSeq;
		this.ediSndDt = ediSndDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vvd_rmk", getVvdRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("flt_file_ref_no", getFltFileRefNo());
		this.hashColumns.put("dest_act_arr_dt", getDestActArrDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dest_nod_cd", getDestNodCd());
		this.hashColumns.put("dest_act_dep_dt", getDestActDepDt());
		this.hashColumns.put("vvd_seq", getVvdSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dest_estm_dep_dt", getDestEstmDepDt());
		this.hashColumns.put("org_act_arr_dt", getOrgActArrDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("edi_snd_hr", getEdiSndHr());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("edi_snd_seq", getEdiSndSeq());
		this.hashColumns.put("org_estm_dep_dt", getOrgEstmDepDt());
		this.hashColumns.put("org_estm_arr_dt", getOrgEstmArrDt());
		this.hashColumns.put("dest_estm_arr_dt", getDestEstmArrDt());
		this.hashColumns.put("org_act_dep_dt", getOrgActDepDt());
		this.hashColumns.put("org_nod_cd", getOrgNodCd());
		this.hashColumns.put("edi_snd_dtl_seq", getEdiSndDtlSeq());
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vvd_rmk", "vvdRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("flt_file_ref_no", "fltFileRefNo");
		this.hashFields.put("dest_act_arr_dt", "destActArrDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dest_nod_cd", "destNodCd");
		this.hashFields.put("dest_act_dep_dt", "destActDepDt");
		this.hashFields.put("vvd_seq", "vvdSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dest_estm_dep_dt", "destEstmDepDt");
		this.hashFields.put("org_act_arr_dt", "orgActArrDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("edi_snd_hr", "ediSndHr");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("edi_snd_seq", "ediSndSeq");
		this.hashFields.put("org_estm_dep_dt", "orgEstmDepDt");
		this.hashFields.put("org_estm_arr_dt", "orgEstmArrDt");
		this.hashFields.put("dest_estm_arr_dt", "destEstmArrDt");
		this.hashFields.put("org_act_dep_dt", "orgActDepDt");
		this.hashFields.put("org_nod_cd", "orgNodCd");
		this.hashFields.put("edi_snd_dtl_seq", "ediSndDtlSeq");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
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
	 * @return vvdRmk
	 */
	public String getVvdRmk() {
		return this.vvdRmk;
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
	 * @return fltFileRefNo
	 */
	public String getFltFileRefNo() {
		return this.fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @return destActArrDt
	 */
	public String getDestActArrDt() {
		return this.destActArrDt;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return destNodCd
	 */
	public String getDestNodCd() {
		return this.destNodCd;
	}
	
	/**
	 * Column Info
	 * @return destActDepDt
	 */
	public String getDestActDepDt() {
		return this.destActDepDt;
	}
	
	/**
	 * Column Info
	 * @return vvdSeq
	 */
	public String getVvdSeq() {
		return this.vvdSeq;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return destEstmDepDt
	 */
	public String getDestEstmDepDt() {
		return this.destEstmDepDt;
	}
	
	/**
	 * Column Info
	 * @return orgActArrDt
	 */
	public String getOrgActArrDt() {
		return this.orgActArrDt;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndHr
	 */
	public String getEdiSndHr() {
		return this.ediSndHr;
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
	 * @return ediSndSeq
	 */
	public String getEdiSndSeq() {
		return this.ediSndSeq;
	}
	
	/**
	 * Column Info
	 * @return orgEstmDepDt
	 */
	public String getOrgEstmDepDt() {
		return this.orgEstmDepDt;
	}
	
	/**
	 * Column Info
	 * @return orgEstmArrDt
	 */
	public String getOrgEstmArrDt() {
		return this.orgEstmArrDt;
	}
	
	/**
	 * Column Info
	 * @return destEstmArrDt
	 */
	public String getDestEstmArrDt() {
		return this.destEstmArrDt;
	}
	
	/**
	 * Column Info
	 * @return orgActDepDt
	 */
	public String getOrgActDepDt() {
		return this.orgActDepDt;
	}
	
	/**
	 * Column Info
	 * @return orgNodCd
	 */
	public String getOrgNodCd() {
		return this.orgNodCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndDtlSeq
	 */
	public String getEdiSndDtlSeq() {
		return this.ediSndDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return ediSndDt
	 */
	public String getEdiSndDt() {
		return this.ediSndDt;
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
	 * @param vvdRmk
	 */
	public void setVvdRmk(String vvdRmk) {
		this.vvdRmk = vvdRmk;
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
	 * @param fltFileRefNo
	 */
	public void setFltFileRefNo(String fltFileRefNo) {
		this.fltFileRefNo = fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @param destActArrDt
	 */
	public void setDestActArrDt(String destActArrDt) {
		this.destActArrDt = destActArrDt;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param destNodCd
	 */
	public void setDestNodCd(String destNodCd) {
		this.destNodCd = destNodCd;
	}
	
	/**
	 * Column Info
	 * @param destActDepDt
	 */
	public void setDestActDepDt(String destActDepDt) {
		this.destActDepDt = destActDepDt;
	}
	
	/**
	 * Column Info
	 * @param vvdSeq
	 */
	public void setVvdSeq(String vvdSeq) {
		this.vvdSeq = vvdSeq;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param destEstmDepDt
	 */
	public void setDestEstmDepDt(String destEstmDepDt) {
		this.destEstmDepDt = destEstmDepDt;
	}
	
	/**
	 * Column Info
	 * @param orgActArrDt
	 */
	public void setOrgActArrDt(String orgActArrDt) {
		this.orgActArrDt = orgActArrDt;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndHr
	 */
	public void setEdiSndHr(String ediSndHr) {
		this.ediSndHr = ediSndHr;
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
	 * @param ediSndSeq
	 */
	public void setEdiSndSeq(String ediSndSeq) {
		this.ediSndSeq = ediSndSeq;
	}
	
	/**
	 * Column Info
	 * @param orgEstmDepDt
	 */
	public void setOrgEstmDepDt(String orgEstmDepDt) {
		this.orgEstmDepDt = orgEstmDepDt;
	}
	
	/**
	 * Column Info
	 * @param orgEstmArrDt
	 */
	public void setOrgEstmArrDt(String orgEstmArrDt) {
		this.orgEstmArrDt = orgEstmArrDt;
	}
	
	/**
	 * Column Info
	 * @param destEstmArrDt
	 */
	public void setDestEstmArrDt(String destEstmArrDt) {
		this.destEstmArrDt = destEstmArrDt;
	}
	
	/**
	 * Column Info
	 * @param orgActDepDt
	 */
	public void setOrgActDepDt(String orgActDepDt) {
		this.orgActDepDt = orgActDepDt;
	}
	
	/**
	 * Column Info
	 * @param orgNodCd
	 */
	public void setOrgNodCd(String orgNodCd) {
		this.orgNodCd = orgNodCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndDtlSeq
	 */
	public void setEdiSndDtlSeq(String ediSndDtlSeq) {
		this.ediSndDtlSeq = ediSndDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param ediSndDt
	 */
	public void setEdiSndDt(String ediSndDt) {
		this.ediSndDt = ediSndDt;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setVvdRmk(JSPUtil.getParameter(request, prefix + "vvd_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setFltFileRefNo(JSPUtil.getParameter(request, prefix + "flt_file_ref_no", ""));
		setDestActArrDt(JSPUtil.getParameter(request, prefix + "dest_act_arr_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setDestNodCd(JSPUtil.getParameter(request, prefix + "dest_nod_cd", ""));
		setDestActDepDt(JSPUtil.getParameter(request, prefix + "dest_act_dep_dt", ""));
		setVvdSeq(JSPUtil.getParameter(request, prefix + "vvd_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDestEstmDepDt(JSPUtil.getParameter(request, prefix + "dest_estm_dep_dt", ""));
		setOrgActArrDt(JSPUtil.getParameter(request, prefix + "org_act_arr_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setEdiSndHr(JSPUtil.getParameter(request, prefix + "edi_snd_hr", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setEdiSndSeq(JSPUtil.getParameter(request, prefix + "edi_snd_seq", ""));
		setOrgEstmDepDt(JSPUtil.getParameter(request, prefix + "org_estm_dep_dt", ""));
		setOrgEstmArrDt(JSPUtil.getParameter(request, prefix + "org_estm_arr_dt", ""));
		setDestEstmArrDt(JSPUtil.getParameter(request, prefix + "dest_estm_arr_dt", ""));
		setOrgActDepDt(JSPUtil.getParameter(request, prefix + "org_act_dep_dt", ""));
		setOrgNodCd(JSPUtil.getParameter(request, prefix + "org_nod_cd", ""));
		setEdiSndDtlSeq(JSPUtil.getParameter(request, prefix + "edi_snd_dtl_seq", ""));
		setEdiSndDt(JSPUtil.getParameter(request, prefix + "edi_snd_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceFltFileMsgDtlVslVO[]
	 */
	public SceFltFileMsgDtlVslVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceFltFileMsgDtlVslVO[]
	 */
	public SceFltFileMsgDtlVslVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceFltFileMsgDtlVslVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] vvdRmk = (JSPUtil.getParameter(request, prefix	+ "vvd_rmk", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fltFileRefNo = (JSPUtil.getParameter(request, prefix	+ "flt_file_ref_no", length));
			String[] destActArrDt = (JSPUtil.getParameter(request, prefix	+ "dest_act_arr_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] destNodCd = (JSPUtil.getParameter(request, prefix	+ "dest_nod_cd", length));
			String[] destActDepDt = (JSPUtil.getParameter(request, prefix	+ "dest_act_dep_dt", length));
			String[] vvdSeq = (JSPUtil.getParameter(request, prefix	+ "vvd_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] destEstmDepDt = (JSPUtil.getParameter(request, prefix	+ "dest_estm_dep_dt", length));
			String[] orgActArrDt = (JSPUtil.getParameter(request, prefix	+ "org_act_arr_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] ediSndHr = (JSPUtil.getParameter(request, prefix	+ "edi_snd_hr", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ediSndSeq = (JSPUtil.getParameter(request, prefix	+ "edi_snd_seq", length));
			String[] orgEstmDepDt = (JSPUtil.getParameter(request, prefix	+ "org_estm_dep_dt", length));
			String[] orgEstmArrDt = (JSPUtil.getParameter(request, prefix	+ "org_estm_arr_dt", length));
			String[] destEstmArrDt = (JSPUtil.getParameter(request, prefix	+ "dest_estm_arr_dt", length));
			String[] orgActDepDt = (JSPUtil.getParameter(request, prefix	+ "org_act_dep_dt", length));
			String[] orgNodCd = (JSPUtil.getParameter(request, prefix	+ "org_nod_cd", length));
			String[] ediSndDtlSeq = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dtl_seq", length));
			String[] ediSndDt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceFltFileMsgDtlVslVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vvdRmk[i] != null)
					model.setVvdRmk(vvdRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fltFileRefNo[i] != null)
					model.setFltFileRefNo(fltFileRefNo[i]);
				if (destActArrDt[i] != null)
					model.setDestActArrDt(destActArrDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (destNodCd[i] != null)
					model.setDestNodCd(destNodCd[i]);
				if (destActDepDt[i] != null)
					model.setDestActDepDt(destActDepDt[i]);
				if (vvdSeq[i] != null)
					model.setVvdSeq(vvdSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (destEstmDepDt[i] != null)
					model.setDestEstmDepDt(destEstmDepDt[i]);
				if (orgActArrDt[i] != null)
					model.setOrgActArrDt(orgActArrDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (ediSndHr[i] != null)
					model.setEdiSndHr(ediSndHr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ediSndSeq[i] != null)
					model.setEdiSndSeq(ediSndSeq[i]);
				if (orgEstmDepDt[i] != null)
					model.setOrgEstmDepDt(orgEstmDepDt[i]);
				if (orgEstmArrDt[i] != null)
					model.setOrgEstmArrDt(orgEstmArrDt[i]);
				if (destEstmArrDt[i] != null)
					model.setDestEstmArrDt(destEstmArrDt[i]);
				if (orgActDepDt[i] != null)
					model.setOrgActDepDt(orgActDepDt[i]);
				if (orgNodCd[i] != null)
					model.setOrgNodCd(orgNodCd[i]);
				if (ediSndDtlSeq[i] != null)
					model.setEdiSndDtlSeq(ediSndDtlSeq[i]);
				if (ediSndDt[i] != null)
					model.setEdiSndDt(ediSndDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceFltFileMsgDtlVslVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceFltFileMsgDtlVslVO[]
	 */
	public SceFltFileMsgDtlVslVO[] getSceFltFileMsgDtlVslVOs(){
		SceFltFileMsgDtlVslVO[] vos = (SceFltFileMsgDtlVslVO[])models.toArray(new SceFltFileMsgDtlVslVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdRmk = this.vvdRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltFileRefNo = this.fltFileRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destActArrDt = this.destActArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destNodCd = this.destNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destActDepDt = this.destActDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdSeq = this.vvdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destEstmDepDt = this.destEstmDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgActArrDt = this.orgActArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndHr = this.ediSndHr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndSeq = this.ediSndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgEstmDepDt = this.orgEstmDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgEstmArrDt = this.orgEstmArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destEstmArrDt = this.destEstmArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgActDepDt = this.orgActDepDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgNodCd = this.orgNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDtlSeq = this.ediSndDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt = this.ediSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
