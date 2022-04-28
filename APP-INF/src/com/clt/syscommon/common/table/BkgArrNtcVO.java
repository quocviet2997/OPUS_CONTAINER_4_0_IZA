/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgArrNtcVO.java
*@FileTitle : BkgArrNtcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.20
*@LastModifier : 박만건
*@LastVersion : 1.0
* 2009.11.20 박만건 
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
 * @author 박만건
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgArrNtcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgArrNtcVO> models = new ArrayList<BkgArrNtcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ntcRvisFlg = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String anFomCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rtnYdCd = null;
	/* Column Info */
	private String vslNm = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String faxSndKnt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pkupYdCd = null;
	/* Column Info */
	private String pkupFreeDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String vslInfoSetFlg = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String pkupAvalGdt = null;
	/* Column Info */
	private String delArrDt = null;
	/* Column Info */
	private String pkupAvalDt = null;
	/* Column Info */
	private String chnAgnCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String podArrDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgArrNtcVO() {}

	public BkgArrNtcVO(String ibflag, String pagerows, String bkgNo, String vslCd, String skdVoyNo, String skdDirCd, String vslNm, String chnAgnCd, String vslInfoSetFlg, String anFomCd, String podArrDt, String delArrDt, String pkupAvalDt, String pkupAvalGdt, String pkupFreeDt, String pkupYdCd, String rtnYdCd, String diffRmk, String faxSndKnt, String ntcRvisFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.ntcRvisFlg = ntcRvisFlg;
		this.vslCd = vslCd;
		this.anFomCd = anFomCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.rtnYdCd = rtnYdCd;
		this.vslNm = vslNm;
		this.skdDirCd = skdDirCd;
		this.faxSndKnt = faxSndKnt;
		this.pagerows = pagerows;
		this.pkupYdCd = pkupYdCd;
		this.pkupFreeDt = pkupFreeDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.vslInfoSetFlg = vslInfoSetFlg;
		this.diffRmk = diffRmk;
		this.pkupAvalGdt = pkupAvalGdt;
		this.delArrDt = delArrDt;
		this.pkupAvalDt = pkupAvalDt;
		this.chnAgnCd = chnAgnCd;
		this.updUsrId = updUsrId;
		this.podArrDt = podArrDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ntc_rvis_flg", getNtcRvisFlg());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("an_fom_cd", getAnFomCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rtn_yd_cd", getRtnYdCd());
		this.hashColumns.put("vsl_nm", getVslNm());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("fax_snd_knt", getFaxSndKnt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pkup_yd_cd", getPkupYdCd());
		this.hashColumns.put("pkup_free_dt", getPkupFreeDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("vsl_info_set_flg", getVslInfoSetFlg());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("pkup_aval_gdt", getPkupAvalGdt());
		this.hashColumns.put("del_arr_dt", getDelArrDt());
		this.hashColumns.put("pkup_aval_dt", getPkupAvalDt());
		this.hashColumns.put("chn_agn_cd", getChnAgnCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pod_arr_dt", getPodArrDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ntc_rvis_flg", "ntcRvisFlg");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("an_fom_cd", "anFomCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rtn_yd_cd", "rtnYdCd");
		this.hashFields.put("vsl_nm", "vslNm");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("fax_snd_knt", "faxSndKnt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pkup_yd_cd", "pkupYdCd");
		this.hashFields.put("pkup_free_dt", "pkupFreeDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("vsl_info_set_flg", "vslInfoSetFlg");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("pkup_aval_gdt", "pkupAvalGdt");
		this.hashFields.put("del_arr_dt", "delArrDt");
		this.hashFields.put("pkup_aval_dt", "pkupAvalDt");
		this.hashFields.put("chn_agn_cd", "chnAgnCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pod_arr_dt", "podArrDt");
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
	 * @return ntcRvisFlg
	 */
	public String getNtcRvisFlg() {
		return this.ntcRvisFlg;
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
	 * @return anFomCd
	 */
	public String getAnFomCd() {
		return this.anFomCd;
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
	 * @return rtnYdCd
	 */
	public String getRtnYdCd() {
		return this.rtnYdCd;
	}
	
	/**
	 * Column Info
	 * @return vslNm
	 */
	public String getVslNm() {
		return this.vslNm;
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
	 * @return faxSndKnt
	 */
	public String getFaxSndKnt() {
		return this.faxSndKnt;
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
	 * @return pkupYdCd
	 */
	public String getPkupYdCd() {
		return this.pkupYdCd;
	}
	
	/**
	 * Column Info
	 * @return pkupFreeDt
	 */
	public String getPkupFreeDt() {
		return this.pkupFreeDt;
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
	 * @return vslInfoSetFlg
	 */
	public String getVslInfoSetFlg() {
		return this.vslInfoSetFlg;
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
	 * @return pkupAvalGdt
	 */
	public String getPkupAvalGdt() {
		return this.pkupAvalGdt;
	}
	
	/**
	 * Column Info
	 * @return delArrDt
	 */
	public String getDelArrDt() {
		return this.delArrDt;
	}
	
	/**
	 * Column Info
	 * @return pkupAvalDt
	 */
	public String getPkupAvalDt() {
		return this.pkupAvalDt;
	}
	
	/**
	 * Column Info
	 * @return chnAgnCd
	 */
	public String getChnAgnCd() {
		return this.chnAgnCd;
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
	 * @return podArrDt
	 */
	public String getPodArrDt() {
		return this.podArrDt;
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
	 * @param ntcRvisFlg
	 */
	public void setNtcRvisFlg(String ntcRvisFlg) {
		this.ntcRvisFlg = ntcRvisFlg;
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
	 * @param anFomCd
	 */
	public void setAnFomCd(String anFomCd) {
		this.anFomCd = anFomCd;
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
	 * @param rtnYdCd
	 */
	public void setRtnYdCd(String rtnYdCd) {
		this.rtnYdCd = rtnYdCd;
	}
	
	/**
	 * Column Info
	 * @param vslNm
	 */
	public void setVslNm(String vslNm) {
		this.vslNm = vslNm;
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
	 * @param faxSndKnt
	 */
	public void setFaxSndKnt(String faxSndKnt) {
		this.faxSndKnt = faxSndKnt;
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
	 * @param pkupYdCd
	 */
	public void setPkupYdCd(String pkupYdCd) {
		this.pkupYdCd = pkupYdCd;
	}
	
	/**
	 * Column Info
	 * @param pkupFreeDt
	 */
	public void setPkupFreeDt(String pkupFreeDt) {
		this.pkupFreeDt = pkupFreeDt;
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
	 * @param vslInfoSetFlg
	 */
	public void setVslInfoSetFlg(String vslInfoSetFlg) {
		this.vslInfoSetFlg = vslInfoSetFlg;
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
	 * @param pkupAvalGdt
	 */
	public void setPkupAvalGdt(String pkupAvalGdt) {
		this.pkupAvalGdt = pkupAvalGdt;
	}
	
	/**
	 * Column Info
	 * @param delArrDt
	 */
	public void setDelArrDt(String delArrDt) {
		this.delArrDt = delArrDt;
	}
	
	/**
	 * Column Info
	 * @param pkupAvalDt
	 */
	public void setPkupAvalDt(String pkupAvalDt) {
		this.pkupAvalDt = pkupAvalDt;
	}
	
	/**
	 * Column Info
	 * @param chnAgnCd
	 */
	public void setChnAgnCd(String chnAgnCd) {
		this.chnAgnCd = chnAgnCd;
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
	 * @param podArrDt
	 */
	public void setPodArrDt(String podArrDt) {
		this.podArrDt = podArrDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setNtcRvisFlg(JSPUtil.getParameter(request, "ntc_rvis_flg", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setAnFomCd(JSPUtil.getParameter(request, "an_fom_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setRtnYdCd(JSPUtil.getParameter(request, "rtn_yd_cd", ""));
		setVslNm(JSPUtil.getParameter(request, "vsl_nm", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setFaxSndKnt(JSPUtil.getParameter(request, "fax_snd_knt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPkupYdCd(JSPUtil.getParameter(request, "pkup_yd_cd", ""));
		setPkupFreeDt(JSPUtil.getParameter(request, "pkup_free_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setVslInfoSetFlg(JSPUtil.getParameter(request, "vsl_info_set_flg", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setPkupAvalGdt(JSPUtil.getParameter(request, "pkup_aval_gdt", ""));
		setDelArrDt(JSPUtil.getParameter(request, "del_arr_dt", ""));
		setPkupAvalDt(JSPUtil.getParameter(request, "pkup_aval_dt", ""));
		setChnAgnCd(JSPUtil.getParameter(request, "chn_agn_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPodArrDt(JSPUtil.getParameter(request, "pod_arr_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgArrNtcVO[]
	 */
	public BkgArrNtcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgArrNtcVO[]
	 */
	public BkgArrNtcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgArrNtcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ntcRvisFlg = (JSPUtil.getParameter(request, prefix	+ "ntc_rvis_flg", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] anFomCd = (JSPUtil.getParameter(request, prefix	+ "an_fom_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rtnYdCd = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_cd", length));
			String[] vslNm = (JSPUtil.getParameter(request, prefix	+ "vsl_nm", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] faxSndKnt = (JSPUtil.getParameter(request, prefix	+ "fax_snd_knt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pkupYdCd = (JSPUtil.getParameter(request, prefix	+ "pkup_yd_cd", length));
			String[] pkupFreeDt = (JSPUtil.getParameter(request, prefix	+ "pkup_free_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] vslInfoSetFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_info_set_flg", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] pkupAvalGdt = (JSPUtil.getParameter(request, prefix	+ "pkup_aval_gdt", length));
			String[] delArrDt = (JSPUtil.getParameter(request, prefix	+ "del_arr_dt", length));
			String[] pkupAvalDt = (JSPUtil.getParameter(request, prefix	+ "pkup_aval_dt", length));
			String[] chnAgnCd = (JSPUtil.getParameter(request, prefix	+ "chn_agn_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] podArrDt = (JSPUtil.getParameter(request, prefix	+ "pod_arr_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgArrNtcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ntcRvisFlg[i] != null)
					model.setNtcRvisFlg(ntcRvisFlg[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (anFomCd[i] != null)
					model.setAnFomCd(anFomCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rtnYdCd[i] != null)
					model.setRtnYdCd(rtnYdCd[i]);
				if (vslNm[i] != null)
					model.setVslNm(vslNm[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (faxSndKnt[i] != null)
					model.setFaxSndKnt(faxSndKnt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pkupYdCd[i] != null)
					model.setPkupYdCd(pkupYdCd[i]);
				if (pkupFreeDt[i] != null)
					model.setPkupFreeDt(pkupFreeDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (vslInfoSetFlg[i] != null)
					model.setVslInfoSetFlg(vslInfoSetFlg[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (pkupAvalGdt[i] != null)
					model.setPkupAvalGdt(pkupAvalGdt[i]);
				if (delArrDt[i] != null)
					model.setDelArrDt(delArrDt[i]);
				if (pkupAvalDt[i] != null)
					model.setPkupAvalDt(pkupAvalDt[i]);
				if (chnAgnCd[i] != null)
					model.setChnAgnCd(chnAgnCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (podArrDt[i] != null)
					model.setPodArrDt(podArrDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgArrNtcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgArrNtcVO[]
	 */
	public BkgArrNtcVO[] getBkgArrNtcVOs(){
		BkgArrNtcVO[] vos = (BkgArrNtcVO[])models.toArray(new BkgArrNtcVO[models.size()]);
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
		this.ntcRvisFlg = this.ntcRvisFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anFomCd = this.anFomCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdCd = this.rtnYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslNm = this.vslNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxSndKnt = this.faxSndKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupYdCd = this.pkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupFreeDt = this.pkupFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslInfoSetFlg = this.vslInfoSetFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupAvalGdt = this.pkupAvalGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delArrDt = this.delArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupAvalDt = this.pkupAvalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chnAgnCd = this.chnAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podArrDt = this.podArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
