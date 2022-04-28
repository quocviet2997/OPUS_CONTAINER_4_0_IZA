/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfCgoBkgFcastWgtGrpVO.java
*@FileTitle : OpfCgoBkgFcastWgtGrpVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.19
*@LastModifier : 김종옥
*@LastVersion : 1.0
* 2009.10.19 김종옥 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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
 * @author 김종옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class OpfCgoBkgFcastWgtGrpVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfCgoBkgFcastWgtGrpVO> models = new ArrayList<OpfCgoBkgFcastWgtGrpVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String toLmtWgt = null;
	/* Column Info */
	private String cntrSzCd = null;
	/* Column Info */
	private String cntrWgtGrpSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String wgtGrpCdDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String cntrWgtGrpCd = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String fmLmtWgt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfCgoBkgFcastWgtGrpVO() {}

	public OpfCgoBkgFcastWgtGrpVO(String ibflag, String pagerows, String slanCd, String skdDirCd, String polCd, String cntrSzCd, String fullMtyCd, String cntrWgtGrpCd, String wgtGrpCdDesc, String fmLmtWgt, String creUsrId, String creDt, String updUsrId, String updDt, String toLmtWgt, String cntrWgtGrpSeq) {
		this.updDt = updDt;
		this.toLmtWgt = toLmtWgt;
		this.cntrSzCd = cntrSzCd;
		this.cntrWgtGrpSeq = cntrWgtGrpSeq;
		this.creDt = creDt;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.polCd = polCd;
		this.wgtGrpCdDesc = wgtGrpCdDesc;
		this.creUsrId = creUsrId;
		this.slanCd = slanCd;
		this.cntrWgtGrpCd = cntrWgtGrpCd;
		this.fullMtyCd = fullMtyCd;
		this.fmLmtWgt = fmLmtWgt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("to_lmt_wgt", getToLmtWgt());
		this.hashColumns.put("cntr_sz_cd", getCntrSzCd());
		this.hashColumns.put("cntr_wgt_grp_seq", getCntrWgtGrpSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("wgt_grp_cd_desc", getWgtGrpCdDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("cntr_wgt_grp_cd", getCntrWgtGrpCd());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("fm_lmt_wgt", getFmLmtWgt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("to_lmt_wgt", "toLmtWgt");
		this.hashFields.put("cntr_sz_cd", "cntrSzCd");
		this.hashFields.put("cntr_wgt_grp_seq", "cntrWgtGrpSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("wgt_grp_cd_desc", "wgtGrpCdDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("cntr_wgt_grp_cd", "cntrWgtGrpCd");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("fm_lmt_wgt", "fmLmtWgt");
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
	 * @return toLmtWgt
	 */
	public String getToLmtWgt() {
		return this.toLmtWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrSzCd
	 */
	public String getCntrSzCd() {
		return this.cntrSzCd;
	}
	
	/**
	 * Column Info
	 * @return cntrWgtGrpSeq
	 */
	public String getCntrWgtGrpSeq() {
		return this.cntrWgtGrpSeq;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return wgtGrpCdDesc
	 */
	public String getWgtGrpCdDesc() {
		return this.wgtGrpCdDesc;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return cntrWgtGrpCd
	 */
	public String getCntrWgtGrpCd() {
		return this.cntrWgtGrpCd;
	}
	
	/**
	 * Column Info
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return fmLmtWgt
	 */
	public String getFmLmtWgt() {
		return this.fmLmtWgt;
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
	 * @param toLmtWgt
	 */
	public void setToLmtWgt(String toLmtWgt) {
		this.toLmtWgt = toLmtWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrSzCd
	 */
	public void setCntrSzCd(String cntrSzCd) {
		this.cntrSzCd = cntrSzCd;
	}
	
	/**
	 * Column Info
	 * @param cntrWgtGrpSeq
	 */
	public void setCntrWgtGrpSeq(String cntrWgtGrpSeq) {
		this.cntrWgtGrpSeq = cntrWgtGrpSeq;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param wgtGrpCdDesc
	 */
	public void setWgtGrpCdDesc(String wgtGrpCdDesc) {
		this.wgtGrpCdDesc = wgtGrpCdDesc;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param cntrWgtGrpCd
	 */
	public void setCntrWgtGrpCd(String cntrWgtGrpCd) {
		this.cntrWgtGrpCd = cntrWgtGrpCd;
	}
	
	/**
	 * Column Info
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param fmLmtWgt
	 */
	public void setFmLmtWgt(String fmLmtWgt) {
		this.fmLmtWgt = fmLmtWgt;
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
		setToLmtWgt(JSPUtil.getParameter(request, "to_lmt_wgt", ""));
		setCntrSzCd(JSPUtil.getParameter(request, "cntr_sz_cd", ""));
		setCntrWgtGrpSeq(JSPUtil.getParameter(request, "cntr_wgt_grp_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setWgtGrpCdDesc(JSPUtil.getParameter(request, "wgt_grp_cd_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setCntrWgtGrpCd(JSPUtil.getParameter(request, "cntr_wgt_grp_cd", ""));
		setFullMtyCd(JSPUtil.getParameter(request, "full_mty_cd", ""));
		setFmLmtWgt(JSPUtil.getParameter(request, "fm_lmt_wgt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfCgoBkgFcastWgtGrpVO[]
	 */
	public OpfCgoBkgFcastWgtGrpVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfCgoBkgFcastWgtGrpVO[]
	 */
	public OpfCgoBkgFcastWgtGrpVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfCgoBkgFcastWgtGrpVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toLmtWgt = (JSPUtil.getParameter(request, prefix	+ "to_lmt_wgt", length));
			String[] cntrSzCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_cd", length));
			String[] cntrWgtGrpSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt_grp_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] wgtGrpCdDesc = (JSPUtil.getParameter(request, prefix	+ "wgt_grp_cd_desc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] cntrWgtGrpCd = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt_grp_cd", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] fmLmtWgt = (JSPUtil.getParameter(request, prefix	+ "fm_lmt_wgt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfCgoBkgFcastWgtGrpVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toLmtWgt[i] != null)
					model.setToLmtWgt(toLmtWgt[i]);
				if (cntrSzCd[i] != null)
					model.setCntrSzCd(cntrSzCd[i]);
				if (cntrWgtGrpSeq[i] != null)
					model.setCntrWgtGrpSeq(cntrWgtGrpSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (wgtGrpCdDesc[i] != null)
					model.setWgtGrpCdDesc(wgtGrpCdDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (cntrWgtGrpCd[i] != null)
					model.setCntrWgtGrpCd(cntrWgtGrpCd[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (fmLmtWgt[i] != null)
					model.setFmLmtWgt(fmLmtWgt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfCgoBkgFcastWgtGrpVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfCgoBkgFcastWgtGrpVO[]
	 */
	public OpfCgoBkgFcastWgtGrpVO[] getOpfCgoBkgFcastWgtGrpVOs(){
		OpfCgoBkgFcastWgtGrpVO[] vos = (OpfCgoBkgFcastWgtGrpVO[])models.toArray(new OpfCgoBkgFcastWgtGrpVO[models.size()]);
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
		this.toLmtWgt = this.toLmtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzCd = this.cntrSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgtGrpSeq = this.cntrWgtGrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtGrpCdDesc = this.wgtGrpCdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgtGrpCd = this.cntrWgtGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmLmtWgt = this.fmLmtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
