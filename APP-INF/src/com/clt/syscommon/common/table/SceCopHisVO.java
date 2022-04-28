/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SceCopHisVO.java
*@FileTitle : SceCopHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.20
*@LastModifier : 김인수
*@LastVersion : 1.0
* 2010.03.20 김인수 
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
 * @author 김인수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceCopHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceCopHisVO> models = new ArrayList<SceCopHisVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String obTroSubSeq = null;
	/* Column Info */
	private String scsFlg = null;
	/* Column Info */
	private String bkgStsCd = null;
	/* Column Info */
	private String umchStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String acclSeq = null;
	/* Column Info */
	private String obTroSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String pctlNo = null;
	/* Column Info */
	private String bkgEvntTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String ibTroSubSeq = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String copStsCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ibTroSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceCopHisVO() {}

	public SceCopHisVO(String ibflag, String pagerows, String copNo, String acclSeq, String cntrNo, String bkgNo, String cntrTpszCd, String pctlNo, String bkgStsCd, String copStsCd, String bkgEvntTpCd, String umchStsCd, String obTroSeq, String obTroSubSeq, String ibTroSeq, String ibTroSubSeq, String creUsrId, String creDt, String updUsrId, String updDt, String scsFlg) {
		this.updDt = updDt;
		this.obTroSubSeq = obTroSubSeq;
		this.scsFlg = scsFlg;
		this.bkgStsCd = bkgStsCd;
		this.umchStsCd = umchStsCd;
		this.creDt = creDt;
		this.copNo = copNo;
		this.acclSeq = acclSeq;
		this.obTroSeq = obTroSeq;
		this.pagerows = pagerows;
		this.pctlNo = pctlNo;
		this.bkgEvntTpCd = bkgEvntTpCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.ibTroSubSeq = ibTroSubSeq;
		this.cntrNo = cntrNo;
		this.cntrTpszCd = cntrTpszCd;
		this.copStsCd = copStsCd;
		this.updUsrId = updUsrId;
		this.ibTroSeq = ibTroSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ob_tro_sub_seq", getObTroSubSeq());
		this.hashColumns.put("scs_flg", getScsFlg());
		this.hashColumns.put("bkg_sts_cd", getBkgStsCd());
		this.hashColumns.put("umch_sts_cd", getUmchStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("accl_seq", getAcclSeq());
		this.hashColumns.put("ob_tro_seq", getObTroSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("bkg_evnt_tp_cd", getBkgEvntTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("ib_tro_sub_seq", getIbTroSubSeq());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cop_sts_cd", getCopStsCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ib_tro_seq", getIbTroSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ob_tro_sub_seq", "obTroSubSeq");
		this.hashFields.put("scs_flg", "scsFlg");
		this.hashFields.put("bkg_sts_cd", "bkgStsCd");
		this.hashFields.put("umch_sts_cd", "umchStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("accl_seq", "acclSeq");
		this.hashFields.put("ob_tro_seq", "obTroSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("bkg_evnt_tp_cd", "bkgEvntTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("ib_tro_sub_seq", "ibTroSubSeq");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cop_sts_cd", "copStsCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ib_tro_seq", "ibTroSeq");
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
	 * @return obTroSubSeq
	 */
	public String getObTroSubSeq() {
		return this.obTroSubSeq;
	}
	
	/**
	 * Column Info
	 * @return scsFlg
	 */
	public String getScsFlg() {
		return this.scsFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgStsCd
	 */
	public String getBkgStsCd() {
		return this.bkgStsCd;
	}
	
	/**
	 * Column Info
	 * @return umchStsCd
	 */
	public String getUmchStsCd() {
		return this.umchStsCd;
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
	 * @return copNo
	 */
	public String getCopNo() {
		return this.copNo;
	}
	
	/**
	 * Column Info
	 * @return acclSeq
	 */
	public String getAcclSeq() {
		return this.acclSeq;
	}
	
	/**
	 * Column Info
	 * @return obTroSeq
	 */
	public String getObTroSeq() {
		return this.obTroSeq;
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
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
	}
	
	/**
	 * Column Info
	 * @return bkgEvntTpCd
	 */
	public String getBkgEvntTpCd() {
		return this.bkgEvntTpCd;
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
	 * @return ibTroSubSeq
	 */
	public String getIbTroSubSeq() {
		return this.ibTroSubSeq;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
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
	 * @return copStsCd
	 */
	public String getCopStsCd() {
		return this.copStsCd;
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
	 * @return ibTroSeq
	 */
	public String getIbTroSeq() {
		return this.ibTroSeq;
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
	 * @param obTroSubSeq
	 */
	public void setObTroSubSeq(String obTroSubSeq) {
		this.obTroSubSeq = obTroSubSeq;
	}
	
	/**
	 * Column Info
	 * @param scsFlg
	 */
	public void setScsFlg(String scsFlg) {
		this.scsFlg = scsFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgStsCd
	 */
	public void setBkgStsCd(String bkgStsCd) {
		this.bkgStsCd = bkgStsCd;
	}
	
	/**
	 * Column Info
	 * @param umchStsCd
	 */
	public void setUmchStsCd(String umchStsCd) {
		this.umchStsCd = umchStsCd;
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
	 * @param copNo
	 */
	public void setCopNo(String copNo) {
		this.copNo = copNo;
	}
	
	/**
	 * Column Info
	 * @param acclSeq
	 */
	public void setAcclSeq(String acclSeq) {
		this.acclSeq = acclSeq;
	}
	
	/**
	 * Column Info
	 * @param obTroSeq
	 */
	public void setObTroSeq(String obTroSeq) {
		this.obTroSeq = obTroSeq;
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
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
	}
	
	/**
	 * Column Info
	 * @param bkgEvntTpCd
	 */
	public void setBkgEvntTpCd(String bkgEvntTpCd) {
		this.bkgEvntTpCd = bkgEvntTpCd;
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
	 * @param ibTroSubSeq
	 */
	public void setIbTroSubSeq(String ibTroSubSeq) {
		this.ibTroSubSeq = ibTroSubSeq;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
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
	 * @param copStsCd
	 */
	public void setCopStsCd(String copStsCd) {
		this.copStsCd = copStsCd;
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
	 * @param ibTroSeq
	 */
	public void setIbTroSeq(String ibTroSeq) {
		this.ibTroSeq = ibTroSeq;
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
		setObTroSubSeq(JSPUtil.getParameter(request, prefix + "ob_tro_sub_seq", ""));
		setScsFlg(JSPUtil.getParameter(request, prefix + "scs_flg", ""));
		setBkgStsCd(JSPUtil.getParameter(request, prefix + "bkg_sts_cd", ""));
		setUmchStsCd(JSPUtil.getParameter(request, prefix + "umch_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCopNo(JSPUtil.getParameter(request, prefix + "cop_no", ""));
		setAcclSeq(JSPUtil.getParameter(request, prefix + "accl_seq", ""));
		setObTroSeq(JSPUtil.getParameter(request, prefix + "ob_tro_seq", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPctlNo(JSPUtil.getParameter(request, prefix + "pctl_no", ""));
		setBkgEvntTpCd(JSPUtil.getParameter(request, prefix + "bkg_evnt_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setIbTroSubSeq(JSPUtil.getParameter(request, prefix + "ib_tro_sub_seq", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setCopStsCd(JSPUtil.getParameter(request, prefix + "cop_sts_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setIbTroSeq(JSPUtil.getParameter(request, prefix + "ib_tro_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceCopHisVO[]
	 */
	public SceCopHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceCopHisVO[]
	 */
	public SceCopHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceCopHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] obTroSubSeq = (JSPUtil.getParameter(request, prefix	+ "ob_tro_sub_seq", length));
			String[] scsFlg = (JSPUtil.getParameter(request, prefix	+ "scs_flg", length));
			String[] bkgStsCd = (JSPUtil.getParameter(request, prefix	+ "bkg_sts_cd", length));
			String[] umchStsCd = (JSPUtil.getParameter(request, prefix	+ "umch_sts_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] acclSeq = (JSPUtil.getParameter(request, prefix	+ "accl_seq", length));
			String[] obTroSeq = (JSPUtil.getParameter(request, prefix	+ "ob_tro_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] bkgEvntTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_evnt_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] ibTroSubSeq = (JSPUtil.getParameter(request, prefix	+ "ib_tro_sub_seq", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] copStsCd = (JSPUtil.getParameter(request, prefix	+ "cop_sts_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ibTroSeq = (JSPUtil.getParameter(request, prefix	+ "ib_tro_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceCopHisVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (obTroSubSeq[i] != null)
					model.setObTroSubSeq(obTroSubSeq[i]);
				if (scsFlg[i] != null)
					model.setScsFlg(scsFlg[i]);
				if (bkgStsCd[i] != null)
					model.setBkgStsCd(bkgStsCd[i]);
				if (umchStsCd[i] != null)
					model.setUmchStsCd(umchStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (acclSeq[i] != null)
					model.setAcclSeq(acclSeq[i]);
				if (obTroSeq[i] != null)
					model.setObTroSeq(obTroSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (bkgEvntTpCd[i] != null)
					model.setBkgEvntTpCd(bkgEvntTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (ibTroSubSeq[i] != null)
					model.setIbTroSubSeq(ibTroSubSeq[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (copStsCd[i] != null)
					model.setCopStsCd(copStsCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ibTroSeq[i] != null)
					model.setIbTroSeq(ibTroSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceCopHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceCopHisVO[]
	 */
	public SceCopHisVO[] getSceCopHisVOs(){
		SceCopHisVO[] vos = (SceCopHisVO[])models.toArray(new SceCopHisVO[models.size()]);
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
		this.obTroSubSeq = this.obTroSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scsFlg = this.scsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgStsCd = this.bkgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.umchStsCd = this.umchStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acclSeq = this.acclSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obTroSeq = this.obTroSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEvntTpCd = this.bkgEvntTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTroSubSeq = this.ibTroSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copStsCd = this.copStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTroSeq = this.ibTroSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
