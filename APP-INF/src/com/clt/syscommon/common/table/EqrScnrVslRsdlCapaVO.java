/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrScnrVslRsdlCapaVO.java
*@FileTitle : EqrScnrVslRsdlCapaVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.06
*@LastModifier : 이행지
*@LastVersion : 1.0
* 2009.08.06 이행지 
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
 * @author 이행지
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrScnrVslRsdlCapaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrScnrVslRsdlCapaVO> models = new ArrayList<EqrScnrVslRsdlCapaVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String scnrId = null;
	/* Column Info */
	private String vslBsaWgt = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String vslBsaSpc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String vslFullWgt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String vslFullSpc = null;
	/* Column Info */
	private String ttlRsdlWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String vslLaneCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fcastYrwk = null;
	/* Column Info */
	private String ttlRsdlSpc = null;
	/* Column Info */
	private String vslSpc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String vslDeadSpc = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrScnrVslRsdlCapaVO() {}

	public EqrScnrVslRsdlCapaVO(String ibflag, String pagerows, String scnrId, String coCd, String fcastYrwk, String eccCd, String vslLaneCd, String vslCd, String skdVoyNo, String skdDirCd, String vslBsaSpc, String vslBsaWgt, String vslFullSpc, String vslFullWgt, String vslDeadSpc, String vslSpc, String ttlRsdlSpc, String ttlRsdlWgt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.coCd = coCd;
		this.scnrId = scnrId;
		this.vslBsaWgt = vslBsaWgt;
		this.eccCd = eccCd;
		this.vslBsaSpc = vslBsaSpc;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.vslFullWgt = vslFullWgt;
		this.skdDirCd = skdDirCd;
		this.vslFullSpc = vslFullSpc;
		this.ttlRsdlWgt = ttlRsdlWgt;
		this.pagerows = pagerows;
		this.vslLaneCd = vslLaneCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fcastYrwk = fcastYrwk;
		this.ttlRsdlSpc = ttlRsdlSpc;
		this.vslSpc = vslSpc;
		this.updUsrId = updUsrId;
		this.vslDeadSpc = vslDeadSpc;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("scnr_id", getScnrId());
		this.hashColumns.put("vsl_bsa_wgt", getVslBsaWgt());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("vsl_bsa_spc", getVslBsaSpc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("vsl_full_wgt", getVslFullWgt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("vsl_full_spc", getVslFullSpc());
		this.hashColumns.put("ttl_rsdl_wgt", getTtlRsdlWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("vsl_lane_cd", getVslLaneCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fcast_yrwk", getFcastYrwk());
		this.hashColumns.put("ttl_rsdl_spc", getTtlRsdlSpc());
		this.hashColumns.put("vsl_spc", getVslSpc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("vsl_dead_spc", getVslDeadSpc());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("scnr_id", "scnrId");
		this.hashFields.put("vsl_bsa_wgt", "vslBsaWgt");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("vsl_bsa_spc", "vslBsaSpc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("vsl_full_wgt", "vslFullWgt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("vsl_full_spc", "vslFullSpc");
		this.hashFields.put("ttl_rsdl_wgt", "ttlRsdlWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("vsl_lane_cd", "vslLaneCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fcast_yrwk", "fcastYrwk");
		this.hashFields.put("ttl_rsdl_spc", "ttlRsdlSpc");
		this.hashFields.put("vsl_spc", "vslSpc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("vsl_dead_spc", "vslDeadSpc");
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
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return scnrId
	 */
	public String getScnrId() {
		return this.scnrId;
	}
	
	/**
	 * Column Info
	 * @return vslBsaWgt
	 */
	public String getVslBsaWgt() {
		return this.vslBsaWgt;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
	}
	
	/**
	 * Column Info
	 * @return vslBsaSpc
	 */
	public String getVslBsaSpc() {
		return this.vslBsaSpc;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return vslFullWgt
	 */
	public String getVslFullWgt() {
		return this.vslFullWgt;
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
	 * @return vslFullSpc
	 */
	public String getVslFullSpc() {
		return this.vslFullSpc;
	}
	
	/**
	 * Column Info
	 * @return ttlRsdlWgt
	 */
	public String getTtlRsdlWgt() {
		return this.ttlRsdlWgt;
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
	 * @return fcastYrwk
	 */
	public String getFcastYrwk() {
		return this.fcastYrwk;
	}
	
	/**
	 * Column Info
	 * @return ttlRsdlSpc
	 */
	public String getTtlRsdlSpc() {
		return this.ttlRsdlSpc;
	}
	
	/**
	 * Column Info
	 * @return vslSpc
	 */
	public String getVslSpc() {
		return this.vslSpc;
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
	 * @return vslDeadSpc
	 */
	public String getVslDeadSpc() {
		return this.vslDeadSpc;
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
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param scnrId
	 */
	public void setScnrId(String scnrId) {
		this.scnrId = scnrId;
	}
	
	/**
	 * Column Info
	 * @param vslBsaWgt
	 */
	public void setVslBsaWgt(String vslBsaWgt) {
		this.vslBsaWgt = vslBsaWgt;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
	}
	
	/**
	 * Column Info
	 * @param vslBsaSpc
	 */
	public void setVslBsaSpc(String vslBsaSpc) {
		this.vslBsaSpc = vslBsaSpc;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param vslFullWgt
	 */
	public void setVslFullWgt(String vslFullWgt) {
		this.vslFullWgt = vslFullWgt;
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
	 * @param vslFullSpc
	 */
	public void setVslFullSpc(String vslFullSpc) {
		this.vslFullSpc = vslFullSpc;
	}
	
	/**
	 * Column Info
	 * @param ttlRsdlWgt
	 */
	public void setTtlRsdlWgt(String ttlRsdlWgt) {
		this.ttlRsdlWgt = ttlRsdlWgt;
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
	 * @param fcastYrwk
	 */
	public void setFcastYrwk(String fcastYrwk) {
		this.fcastYrwk = fcastYrwk;
	}
	
	/**
	 * Column Info
	 * @param ttlRsdlSpc
	 */
	public void setTtlRsdlSpc(String ttlRsdlSpc) {
		this.ttlRsdlSpc = ttlRsdlSpc;
	}
	
	/**
	 * Column Info
	 * @param vslSpc
	 */
	public void setVslSpc(String vslSpc) {
		this.vslSpc = vslSpc;
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
	 * @param vslDeadSpc
	 */
	public void setVslDeadSpc(String vslDeadSpc) {
		this.vslDeadSpc = vslDeadSpc;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setScnrId(JSPUtil.getParameter(request, "scnr_id", ""));
		setVslBsaWgt(JSPUtil.getParameter(request, "vsl_bsa_wgt", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setVslBsaSpc(JSPUtil.getParameter(request, "vsl_bsa_spc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setVslFullWgt(JSPUtil.getParameter(request, "vsl_full_wgt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setVslFullSpc(JSPUtil.getParameter(request, "vsl_full_spc", ""));
		setTtlRsdlWgt(JSPUtil.getParameter(request, "ttl_rsdl_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setVslLaneCd(JSPUtil.getParameter(request, "vsl_lane_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFcastYrwk(JSPUtil.getParameter(request, "fcast_yrwk", ""));
		setTtlRsdlSpc(JSPUtil.getParameter(request, "ttl_rsdl_spc", ""));
		setVslSpc(JSPUtil.getParameter(request, "vsl_spc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setVslDeadSpc(JSPUtil.getParameter(request, "vsl_dead_spc", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrScnrVslRsdlCapaVO[]
	 */
	public EqrScnrVslRsdlCapaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrVslRsdlCapaVO[]
	 */
	public EqrScnrVslRsdlCapaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrScnrVslRsdlCapaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] vslBsaWgt = (JSPUtil.getParameter(request, prefix	+ "vsl_bsa_wgt", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] vslBsaSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_bsa_spc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslFullWgt = (JSPUtil.getParameter(request, prefix	+ "vsl_full_wgt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] vslFullSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_full_spc", length));
			String[] ttlRsdlWgt = (JSPUtil.getParameter(request, prefix	+ "ttl_rsdl_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] vslLaneCd = (JSPUtil.getParameter(request, prefix	+ "vsl_lane_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fcastYrwk = (JSPUtil.getParameter(request, prefix	+ "fcast_yrwk", length));
			String[] ttlRsdlSpc = (JSPUtil.getParameter(request, prefix	+ "ttl_rsdl_spc", length));
			String[] vslSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_spc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] vslDeadSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_dead_spc", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrVslRsdlCapaVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (vslBsaWgt[i] != null)
					model.setVslBsaWgt(vslBsaWgt[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (vslBsaSpc[i] != null)
					model.setVslBsaSpc(vslBsaSpc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (vslFullWgt[i] != null)
					model.setVslFullWgt(vslFullWgt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (vslFullSpc[i] != null)
					model.setVslFullSpc(vslFullSpc[i]);
				if (ttlRsdlWgt[i] != null)
					model.setTtlRsdlWgt(ttlRsdlWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vslLaneCd[i] != null)
					model.setVslLaneCd(vslLaneCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fcastYrwk[i] != null)
					model.setFcastYrwk(fcastYrwk[i]);
				if (ttlRsdlSpc[i] != null)
					model.setTtlRsdlSpc(ttlRsdlSpc[i]);
				if (vslSpc[i] != null)
					model.setVslSpc(vslSpc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (vslDeadSpc[i] != null)
					model.setVslDeadSpc(vslDeadSpc[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrVslRsdlCapaVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrScnrVslRsdlCapaVO[]
	 */
	public EqrScnrVslRsdlCapaVO[] fromRequestGridArrayList(HttpServletRequest request, String prefix) {
		EqrScnrVslRsdlCapaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] scnrId = (JSPUtil.getParameter(request, prefix	+ "scnr_id", length));
			String[] vslBsaWgt = (JSPUtil.getParameter(request, prefix	+ "vsl_bsa_wgt", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] vslBsaSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_bsa_spc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] vslFullWgt = (JSPUtil.getParameter(request, prefix	+ "vsl_full_wgt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] vslFullSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_full_spc", length));
			String[] ttlRsdlWgt = (JSPUtil.getParameter(request, prefix	+ "ttl_rsdl_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] vslLaneCd = (JSPUtil.getParameter(request, prefix	+ "vsl_lane_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fcastYrwk = (JSPUtil.getParameter(request, prefix	+ "fcast_yrwk", length));
			String[] ttlRsdlSpc = (JSPUtil.getParameter(request, prefix	+ "ttl_rsdl_spc", length));
			String[] vslSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_spc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] vslDeadSpc = (JSPUtil.getParameter(request, prefix	+ "vsl_dead_spc", length));
			String[] vvd = (JSPUtil.getParameter(request, prefix	+ "vvd", length));				// VVD 항목 추가  2009.08.10 by Haeng-ji,Lee
			
			for (int i = 0; i < length; i++) {
				model = new EqrScnrVslRsdlCapaVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i].substring(0,1));
				if (scnrId[i] != null)
					model.setScnrId(scnrId[i]);
				if (vslBsaWgt[i] != null)
					model.setVslBsaWgt(vslBsaWgt[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (vslBsaSpc[i] != null)
					model.setVslBsaSpc(vslBsaSpc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vslFullWgt[i] != null)
					model.setVslFullWgt(vslFullWgt[i]);
				if (vslFullSpc[i] != null)
					model.setVslFullSpc(vslFullSpc[i]);
				if (ttlRsdlWgt[i] != null)
					model.setTtlRsdlWgt(ttlRsdlWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (vslLaneCd[i] != null)
					model.setVslLaneCd(vslLaneCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fcastYrwk[i] != null)
					model.setFcastYrwk(fcastYrwk[i]);
				if (ttlRsdlSpc[i] != null)
					model.setTtlRsdlSpc(ttlRsdlSpc[i]);
				if (vslSpc[i] != null)
					model.setVslSpc(vslSpc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (vslDeadSpc[i] != null)
					model.setVslDeadSpc(vslDeadSpc[i]);
				/* VVD로 받아온 값을  vs_cd, skd_voy_no, skd_dir_cd에 각각  담기. */
				if (vvd[i] != null)
					model.setVslCd(vvd[i].substring(0,4));
				if (vvd[i] != null)
					model.setSkdVoyNo(vvd[i].substring(4,8));
				if (vvd[i] != null)
					model.setSkdDirCd(vvd[i].substring(8,9));
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrScnrVslRsdlCapaVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrScnrVslRsdlCapaVO[]
	 */
	public EqrScnrVslRsdlCapaVO[] getEqrScnrVslRsdlCapaVOs(){
		EqrScnrVslRsdlCapaVO[] vos = (EqrScnrVslRsdlCapaVO[])models.toArray(new EqrScnrVslRsdlCapaVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scnrId = this.scnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBsaWgt = this.vslBsaWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBsaSpc = this.vslBsaSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslFullWgt = this.vslFullWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslFullSpc = this.vslFullSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlRsdlWgt = this.ttlRsdlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLaneCd = this.vslLaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastYrwk = this.fcastYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlRsdlSpc = this.ttlRsdlSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSpc = this.vslSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDeadSpc = this.vslDeadSpc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
