/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MstCntrSpecVO.java
*@FileTitle : MstCntrSpecVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.22
*@LastModifier : 김석준
*@LastVersion : 1.0
* 2009.05.22 김석준 
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
 * @author 김석준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MstCntrSpecVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MstCntrSpecVO> models = new ArrayList<MstCntrSpecVO>();
	
	/* Column Info */
	private String cntrSpecNo = null;
	/* Column Info */
	private String lodCapa = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String opnDorWdt = null;
	/* Column Info */
	private String xterLen = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String tareWgt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String opnDorHgt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ownCntrFlg = null;
	/* Column Info */
	private String interLen = null;
	/* Column Info */
	private String rcLdbHgt = null;
	/* Column Info */
	private String interWdt = null;
	/* Column Info */
	private String interHgt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String specYr = null;
	/* Column Info */
	private String tnkCapa = null;
	/* Column Info */
	private String xterHgt = null;
	/* Column Info */
	private String cntrGrsWgt = null;
	/* Column Info */
	private String cntrMtrlCd = null;
	/* Column Info */
	private String xterWdt = null;
	/* Column Info */
	private String rcLdbCapa = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MstCntrSpecVO() {}

	public MstCntrSpecVO(String ibflag, String pagerows, String cntrSpecNo, String ownCntrFlg, String specYr, String cntrTpszCd, String cntrMtrlCd, String lodCapa, String cntrGrsWgt, String tareWgt, String interLen, String interWdt, String interHgt, String xterLen, String xterWdt, String xterHgt, String opnDorWdt, String opnDorHgt, String rcLdbCapa, String rcLdbHgt, String tnkCapa, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.cntrSpecNo = cntrSpecNo;
		this.lodCapa = lodCapa;
		this.creDt = creDt;
		this.opnDorWdt = opnDorWdt;
		this.xterLen = xterLen;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.cntrTpszCd = cntrTpszCd;
		this.tareWgt = tareWgt;
		this.updUsrId = updUsrId;
		this.opnDorHgt = opnDorHgt;
		this.updDt = updDt;
		this.ownCntrFlg = ownCntrFlg;
		this.interLen = interLen;
		this.rcLdbHgt = rcLdbHgt;
		this.interWdt = interWdt;
		this.interHgt = interHgt;
		this.creUsrId = creUsrId;
		this.diffRmk = diffRmk;
		this.specYr = specYr;
		this.tnkCapa = tnkCapa;
		this.xterHgt = xterHgt;
		this.cntrGrsWgt = cntrGrsWgt;
		this.cntrMtrlCd = cntrMtrlCd;
		this.xterWdt = xterWdt;
		this.rcLdbCapa = rcLdbCapa;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cntr_spec_no", getCntrSpecNo());
		this.hashColumns.put("lod_capa", getLodCapa());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("opn_dor_wdt", getOpnDorWdt());
		this.hashColumns.put("xter_len", getXterLen());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("tare_wgt", getTareWgt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("opn_dor_hgt", getOpnDorHgt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("own_cntr_flg", getOwnCntrFlg());
		this.hashColumns.put("inter_len", getInterLen());
		this.hashColumns.put("rc_ldb_hgt", getRcLdbHgt());
		this.hashColumns.put("inter_wdt", getInterWdt());
		this.hashColumns.put("inter_hgt", getInterHgt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("spec_yr", getSpecYr());
		this.hashColumns.put("tnk_capa", getTnkCapa());
		this.hashColumns.put("xter_hgt", getXterHgt());
		this.hashColumns.put("cntr_grs_wgt", getCntrGrsWgt());
		this.hashColumns.put("cntr_mtrl_cd", getCntrMtrlCd());
		this.hashColumns.put("xter_wdt", getXterWdt());
		this.hashColumns.put("rc_ldb_capa", getRcLdbCapa());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cntr_spec_no", "cntrSpecNo");
		this.hashFields.put("lod_capa", "lodCapa");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("opn_dor_wdt", "opnDorWdt");
		this.hashFields.put("xter_len", "xterLen");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("tare_wgt", "tareWgt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("opn_dor_hgt", "opnDorHgt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("own_cntr_flg", "ownCntrFlg");
		this.hashFields.put("inter_len", "interLen");
		this.hashFields.put("rc_ldb_hgt", "rcLdbHgt");
		this.hashFields.put("inter_wdt", "interWdt");
		this.hashFields.put("inter_hgt", "interHgt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("spec_yr", "specYr");
		this.hashFields.put("tnk_capa", "tnkCapa");
		this.hashFields.put("xter_hgt", "xterHgt");
		this.hashFields.put("cntr_grs_wgt", "cntrGrsWgt");
		this.hashFields.put("cntr_mtrl_cd", "cntrMtrlCd");
		this.hashFields.put("xter_wdt", "xterWdt");
		this.hashFields.put("rc_ldb_capa", "rcLdbCapa");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cntrSpecNo
	 */
	public String getCntrSpecNo() {
		return this.cntrSpecNo;
	}
	
	/**
	 * Column Info
	 * @return lodCapa
	 */
	public String getLodCapa() {
		return this.lodCapa;
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
	 * @return opnDorWdt
	 */
	public String getOpnDorWdt() {
		return this.opnDorWdt;
	}
	
	/**
	 * Column Info
	 * @return xterLen
	 */
	public String getXterLen() {
		return this.xterLen;
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
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @return tareWgt
	 */
	public String getTareWgt() {
		return this.tareWgt;
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
	 * @return opnDorHgt
	 */
	public String getOpnDorHgt() {
		return this.opnDorHgt;
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
	 * @return ownCntrFlg
	 */
	public String getOwnCntrFlg() {
		return this.ownCntrFlg;
	}
	
	/**
	 * Column Info
	 * @return interLen
	 */
	public String getInterLen() {
		return this.interLen;
	}
	
	/**
	 * Column Info
	 * @return rcLdbHgt
	 */
	public String getRcLdbHgt() {
		return this.rcLdbHgt;
	}
	
	/**
	 * Column Info
	 * @return interWdt
	 */
	public String getInterWdt() {
		return this.interWdt;
	}
	
	/**
	 * Column Info
	 * @return interHgt
	 */
	public String getInterHgt() {
		return this.interHgt;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return specYr
	 */
	public String getSpecYr() {
		return this.specYr;
	}
	
	/**
	 * Column Info
	 * @return tnkCapa
	 */
	public String getTnkCapa() {
		return this.tnkCapa;
	}
	
	/**
	 * Column Info
	 * @return xterHgt
	 */
	public String getXterHgt() {
		return this.xterHgt;
	}
	
	/**
	 * Column Info
	 * @return cntrGrsWgt
	 */
	public String getCntrGrsWgt() {
		return this.cntrGrsWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrMtrlCd
	 */
	public String getCntrMtrlCd() {
		return this.cntrMtrlCd;
	}
	
	/**
	 * Column Info
	 * @return xterWdt
	 */
	public String getXterWdt() {
		return this.xterWdt;
	}
	
	/**
	 * Column Info
	 * @return rcLdbCapa
	 */
	public String getRcLdbCapa() {
		return this.rcLdbCapa;
	}
	

	/**
	 * Column Info
	 * @param cntrSpecNo
	 */
	public void setCntrSpecNo(String cntrSpecNo) {
		this.cntrSpecNo = cntrSpecNo;
	}
	
	/**
	 * Column Info
	 * @param lodCapa
	 */
	public void setLodCapa(String lodCapa) {
		this.lodCapa = lodCapa;
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
	 * @param opnDorWdt
	 */
	public void setOpnDorWdt(String opnDorWdt) {
		this.opnDorWdt = opnDorWdt;
	}
	
	/**
	 * Column Info
	 * @param xterLen
	 */
	public void setXterLen(String xterLen) {
		this.xterLen = xterLen;
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
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
	}
	
	/**
	 * Column Info
	 * @param tareWgt
	 */
	public void setTareWgt(String tareWgt) {
		this.tareWgt = tareWgt;
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
	 * @param opnDorHgt
	 */
	public void setOpnDorHgt(String opnDorHgt) {
		this.opnDorHgt = opnDorHgt;
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
	 * @param ownCntrFlg
	 */
	public void setOwnCntrFlg(String ownCntrFlg) {
		this.ownCntrFlg = ownCntrFlg;
	}
	
	/**
	 * Column Info
	 * @param interLen
	 */
	public void setInterLen(String interLen) {
		this.interLen = interLen;
	}
	
	/**
	 * Column Info
	 * @param rcLdbHgt
	 */
	public void setRcLdbHgt(String rcLdbHgt) {
		this.rcLdbHgt = rcLdbHgt;
	}
	
	/**
	 * Column Info
	 * @param interWdt
	 */
	public void setInterWdt(String interWdt) {
		this.interWdt = interWdt;
	}
	
	/**
	 * Column Info
	 * @param interHgt
	 */
	public void setInterHgt(String interHgt) {
		this.interHgt = interHgt;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param specYr
	 */
	public void setSpecYr(String specYr) {
		this.specYr = specYr;
	}
	
	/**
	 * Column Info
	 * @param tnkCapa
	 */
	public void setTnkCapa(String tnkCapa) {
		this.tnkCapa = tnkCapa;
	}
	
	/**
	 * Column Info
	 * @param xterHgt
	 */
	public void setXterHgt(String xterHgt) {
		this.xterHgt = xterHgt;
	}
	
	/**
	 * Column Info
	 * @param cntrGrsWgt
	 */
	public void setCntrGrsWgt(String cntrGrsWgt) {
		this.cntrGrsWgt = cntrGrsWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrMtrlCd
	 */
	public void setCntrMtrlCd(String cntrMtrlCd) {
		this.cntrMtrlCd = cntrMtrlCd;
	}
	
	/**
	 * Column Info
	 * @param xterWdt
	 */
	public void setXterWdt(String xterWdt) {
		this.xterWdt = xterWdt;
	}
	
	/**
	 * Column Info
	 * @param rcLdbCapa
	 */
	public void setRcLdbCapa(String rcLdbCapa) {
		this.rcLdbCapa = rcLdbCapa;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCntrSpecNo(JSPUtil.getParameter(request, "cntr_spec_no", ""));
		setLodCapa(JSPUtil.getParameter(request, "lod_capa", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setOpnDorWdt(JSPUtil.getParameter(request, "opn_dor_wdt", ""));
		setXterLen(JSPUtil.getParameter(request, "xter_len", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setTareWgt(JSPUtil.getParameter(request, "tare_wgt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOpnDorHgt(JSPUtil.getParameter(request, "opn_dor_hgt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOwnCntrFlg(JSPUtil.getParameter(request, "own_cntr_flg", ""));
		setInterLen(JSPUtil.getParameter(request, "inter_len", ""));
		setRcLdbHgt(JSPUtil.getParameter(request, "rc_ldb_hgt", ""));
		setInterWdt(JSPUtil.getParameter(request, "inter_wdt", ""));
		setInterHgt(JSPUtil.getParameter(request, "inter_hgt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setSpecYr(JSPUtil.getParameter(request, "spec_yr", ""));
		setTnkCapa(JSPUtil.getParameter(request, "tnk_capa", ""));
		setXterHgt(JSPUtil.getParameter(request, "xter_hgt", ""));
		setCntrGrsWgt(JSPUtil.getParameter(request, "cntr_grs_wgt", ""));
		setCntrMtrlCd(JSPUtil.getParameter(request, "cntr_mtrl_cd", ""));
		setXterWdt(JSPUtil.getParameter(request, "xter_wdt", ""));
		setRcLdbCapa(JSPUtil.getParameter(request, "rc_ldb_capa", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MstCntrSpecVO[]
	 */
	public MstCntrSpecVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MstCntrSpecVO[]
	 */
	public MstCntrSpecVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MstCntrSpecVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntrSpecNo = (JSPUtil.getParameter(request, prefix	+ "cntr_spec_no".trim(), length));
			String[] lodCapa = (JSPUtil.getParameter(request, prefix	+ "lod_capa".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] opnDorWdt = (JSPUtil.getParameter(request, prefix	+ "opn_dor_wdt".trim(), length));
			String[] xterLen = (JSPUtil.getParameter(request, prefix	+ "xter_len".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd".trim(), length));
			String[] tareWgt = (JSPUtil.getParameter(request, prefix	+ "tare_wgt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] opnDorHgt = (JSPUtil.getParameter(request, prefix	+ "opn_dor_hgt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] ownCntrFlg = (JSPUtil.getParameter(request, prefix	+ "own_cntr_flg".trim(), length));
			String[] interLen = (JSPUtil.getParameter(request, prefix	+ "inter_len".trim(), length));
			String[] rcLdbHgt = (JSPUtil.getParameter(request, prefix	+ "rc_ldb_hgt".trim(), length));
			String[] interWdt = (JSPUtil.getParameter(request, prefix	+ "inter_wdt".trim(), length));
			String[] interHgt = (JSPUtil.getParameter(request, prefix	+ "inter_hgt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk".trim(), length));
			String[] specYr = (JSPUtil.getParameter(request, prefix	+ "spec_yr".trim(), length));
			String[] tnkCapa = (JSPUtil.getParameter(request, prefix	+ "tnk_capa".trim(), length));
			String[] xterHgt = (JSPUtil.getParameter(request, prefix	+ "xter_hgt".trim(), length));
			String[] cntrGrsWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_grs_wgt".trim(), length));
			String[] cntrMtrlCd = (JSPUtil.getParameter(request, prefix	+ "cntr_mtrl_cd".trim(), length));
			String[] xterWdt = (JSPUtil.getParameter(request, prefix	+ "xter_wdt".trim(), length));
			String[] rcLdbCapa = (JSPUtil.getParameter(request, prefix	+ "rc_ldb_capa".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new MstCntrSpecVO();
				if (cntrSpecNo[i] != null)
					model.setCntrSpecNo(cntrSpecNo[i]);
				if (lodCapa[i] != null)
					model.setLodCapa(lodCapa[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (opnDorWdt[i] != null)
					model.setOpnDorWdt(opnDorWdt[i]);
				if (xterLen[i] != null)
					model.setXterLen(xterLen[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (tareWgt[i] != null)
					model.setTareWgt(tareWgt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (opnDorHgt[i] != null)
					model.setOpnDorHgt(opnDorHgt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ownCntrFlg[i] != null)
					model.setOwnCntrFlg(ownCntrFlg[i]);
				if (interLen[i] != null)
					model.setInterLen(interLen[i]);
				if (rcLdbHgt[i] != null)
					model.setRcLdbHgt(rcLdbHgt[i]);
				if (interWdt[i] != null)
					model.setInterWdt(interWdt[i]);
				if (interHgt[i] != null)
					model.setInterHgt(interHgt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (specYr[i] != null)
					model.setSpecYr(specYr[i]);
				if (tnkCapa[i] != null)
					model.setTnkCapa(tnkCapa[i]);
				if (xterHgt[i] != null)
					model.setXterHgt(xterHgt[i]);
				if (cntrGrsWgt[i] != null)
					model.setCntrGrsWgt(cntrGrsWgt[i]);
				if (cntrMtrlCd[i] != null)
					model.setCntrMtrlCd(cntrMtrlCd[i]);
				if (xterWdt[i] != null)
					model.setXterWdt(xterWdt[i]);
				if (rcLdbCapa[i] != null)
					model.setRcLdbCapa(rcLdbCapa[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMstCntrSpecVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MstCntrSpecVO[]
	 */
	public MstCntrSpecVO[] getMstCntrSpecVOs(){
		MstCntrSpecVO[] vos = (MstCntrSpecVO[])models.toArray(new MstCntrSpecVO[models.size()]);
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
		this.cntrSpecNo = this.cntrSpecNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodCapa = this.lodCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opnDorWdt = this.opnDorWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterLen = this.xterLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tareWgt = this.tareWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opnDorHgt = this.opnDorHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownCntrFlg = this.ownCntrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interLen = this.interLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcLdbHgt = this.rcLdbHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interWdt = this.interWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interHgt = this.interHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.specYr = this.specYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tnkCapa = this.tnkCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterHgt = this.xterHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrGrsWgt = this.cntrGrsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMtrlCd = this.cntrMtrlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xterWdt = this.xterWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcLdbCapa = this.rcLdbCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
