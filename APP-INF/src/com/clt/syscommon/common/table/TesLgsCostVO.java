/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : TesLgsCostVO.java
*@FileTitle : TesLgsCostVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.05
*@LastModifier : 박재흥
*@LastVersion : 1.0
* 2010.07.05 박재흥 
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
 * @author 박재흥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesLgsCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesLgsCostVO> models = new ArrayList<TesLgsCostVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lgsCostAbbrNm = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String lgsCostCdClssLvl = null;
	/* Column Info */
	private String lgsCostDtlCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String crrAcctCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String lgsCostSubjCd = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String acctCd = null;
	/* Column Info */
	private String lgsCostRmk = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String lgsCostFullNm = null;
	/* Column Info */
	private String lgsCostOptNo = null;
	/* Column Info */
	private String thrpFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesLgsCostVO() {}

	public TesLgsCostVO(String ibflag, String pagerows, String lgsCostCd, String lgsCostFullNm, String lgsCostSubjCd, String lgsCostDtlCd, String lgsCostCdClssLvl, String lgsCostOptNo, String lgsCostAbbrNm, String acctCd, String lgsCostRmk, String thrpFlg, String crrAcctCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.lgsCostAbbrNm = lgsCostAbbrNm;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.lgsCostCdClssLvl = lgsCostCdClssLvl;
		this.lgsCostDtlCd = lgsCostDtlCd;
		this.pagerows = pagerows;
		this.crrAcctCd = crrAcctCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.lgsCostSubjCd = lgsCostSubjCd;
		this.lgsCostCd = lgsCostCd;
		this.acctCd = acctCd;
		this.lgsCostRmk = lgsCostRmk;
		this.updUsrId = updUsrId;
		this.lgsCostFullNm = lgsCostFullNm;
		this.lgsCostOptNo = lgsCostOptNo;
		this.thrpFlg = thrpFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lgs_cost_abbr_nm", getLgsCostAbbrNm());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("lgs_cost_cd_clss_lvl", getLgsCostCdClssLvl());
		this.hashColumns.put("lgs_cost_dtl_cd", getLgsCostDtlCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("crr_acct_cd", getCrrAcctCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("lgs_cost_subj_cd", getLgsCostSubjCd());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("acct_cd", getAcctCd());
		this.hashColumns.put("lgs_cost_rmk", getLgsCostRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("lgs_cost_full_nm", getLgsCostFullNm());
		this.hashColumns.put("lgs_cost_opt_no", getLgsCostOptNo());
		this.hashColumns.put("thrp_flg", getThrpFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lgs_cost_abbr_nm", "lgsCostAbbrNm");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("lgs_cost_cd_clss_lvl", "lgsCostCdClssLvl");
		this.hashFields.put("lgs_cost_dtl_cd", "lgsCostDtlCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("crr_acct_cd", "crrAcctCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("lgs_cost_subj_cd", "lgsCostSubjCd");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("acct_cd", "acctCd");
		this.hashFields.put("lgs_cost_rmk", "lgsCostRmk");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("lgs_cost_full_nm", "lgsCostFullNm");
		this.hashFields.put("lgs_cost_opt_no", "lgsCostOptNo");
		this.hashFields.put("thrp_flg", "thrpFlg");
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
	 * @return lgsCostAbbrNm
	 */
	public String getLgsCostAbbrNm() {
		return this.lgsCostAbbrNm;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return lgsCostCdClssLvl
	 */
	public String getLgsCostCdClssLvl() {
		return this.lgsCostCdClssLvl;
	}
	
	/**
	 * Column Info
	 * @return lgsCostDtlCd
	 */
	public String getLgsCostDtlCd() {
		return this.lgsCostDtlCd;
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
	 * @return crrAcctCd
	 */
	public String getCrrAcctCd() {
		return this.crrAcctCd;
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
	 * @return lgsCostSubjCd
	 */
	public String getLgsCostSubjCd() {
		return this.lgsCostSubjCd;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return acctCd
	 */
	public String getAcctCd() {
		return this.acctCd;
	}
	
	/**
	 * Column Info
	 * @return lgsCostRmk
	 */
	public String getLgsCostRmk() {
		return this.lgsCostRmk;
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
	 * @return lgsCostFullNm
	 */
	public String getLgsCostFullNm() {
		return this.lgsCostFullNm;
	}
	
	/**
	 * Column Info
	 * @return lgsCostOptNo
	 */
	public String getLgsCostOptNo() {
		return this.lgsCostOptNo;
	}
	
	/**
	 * Column Info
	 * @return thrpFlg
	 */
	public String getThrpFlg() {
		return this.thrpFlg;
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
	 * @param lgsCostAbbrNm
	 */
	public void setLgsCostAbbrNm(String lgsCostAbbrNm) {
		this.lgsCostAbbrNm = lgsCostAbbrNm;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param lgsCostCdClssLvl
	 */
	public void setLgsCostCdClssLvl(String lgsCostCdClssLvl) {
		this.lgsCostCdClssLvl = lgsCostCdClssLvl;
	}
	
	/**
	 * Column Info
	 * @param lgsCostDtlCd
	 */
	public void setLgsCostDtlCd(String lgsCostDtlCd) {
		this.lgsCostDtlCd = lgsCostDtlCd;
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
	 * @param crrAcctCd
	 */
	public void setCrrAcctCd(String crrAcctCd) {
		this.crrAcctCd = crrAcctCd;
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
	 * @param lgsCostSubjCd
	 */
	public void setLgsCostSubjCd(String lgsCostSubjCd) {
		this.lgsCostSubjCd = lgsCostSubjCd;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param acctCd
	 */
	public void setAcctCd(String acctCd) {
		this.acctCd = acctCd;
	}
	
	/**
	 * Column Info
	 * @param lgsCostRmk
	 */
	public void setLgsCostRmk(String lgsCostRmk) {
		this.lgsCostRmk = lgsCostRmk;
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
	 * @param lgsCostFullNm
	 */
	public void setLgsCostFullNm(String lgsCostFullNm) {
		this.lgsCostFullNm = lgsCostFullNm;
	}
	
	/**
	 * Column Info
	 * @param lgsCostOptNo
	 */
	public void setLgsCostOptNo(String lgsCostOptNo) {
		this.lgsCostOptNo = lgsCostOptNo;
	}
	
	/**
	 * Column Info
	 * @param thrpFlg
	 */
	public void setThrpFlg(String thrpFlg) {
		this.thrpFlg = thrpFlg;
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
		setLgsCostAbbrNm(JSPUtil.getParameter(request, prefix + "lgs_cost_abbr_nm", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setLgsCostCdClssLvl(JSPUtil.getParameter(request, prefix + "lgs_cost_cd_clss_lvl", ""));
		setLgsCostDtlCd(JSPUtil.getParameter(request, prefix + "lgs_cost_dtl_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCrrAcctCd(JSPUtil.getParameter(request, prefix + "crr_acct_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setLgsCostSubjCd(JSPUtil.getParameter(request, prefix + "lgs_cost_subj_cd", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setAcctCd(JSPUtil.getParameter(request, prefix + "acct_cd", ""));
		setLgsCostRmk(JSPUtil.getParameter(request, prefix + "lgs_cost_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setLgsCostFullNm(JSPUtil.getParameter(request, prefix + "lgs_cost_full_nm", ""));
		setLgsCostOptNo(JSPUtil.getParameter(request, prefix + "lgs_cost_opt_no", ""));
		setThrpFlg(JSPUtil.getParameter(request, prefix + "thrp_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesLgsCostVO[]
	 */
	public TesLgsCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesLgsCostVO[]
	 */
	public TesLgsCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesLgsCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lgsCostAbbrNm = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_abbr_nm", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] lgsCostCdClssLvl = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd_clss_lvl", length));
			String[] lgsCostDtlCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_dtl_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] crrAcctCd = (JSPUtil.getParameter(request, prefix	+ "crr_acct_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] lgsCostSubjCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_subj_cd", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] acctCd = (JSPUtil.getParameter(request, prefix	+ "acct_cd", length));
			String[] lgsCostRmk = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_rmk", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] lgsCostFullNm = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_full_nm", length));
			String[] lgsCostOptNo = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_opt_no", length));
			String[] thrpFlg = (JSPUtil.getParameter(request, prefix	+ "thrp_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesLgsCostVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lgsCostAbbrNm[i] != null)
					model.setLgsCostAbbrNm(lgsCostAbbrNm[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (lgsCostCdClssLvl[i] != null)
					model.setLgsCostCdClssLvl(lgsCostCdClssLvl[i]);
				if (lgsCostDtlCd[i] != null)
					model.setLgsCostDtlCd(lgsCostDtlCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (crrAcctCd[i] != null)
					model.setCrrAcctCd(crrAcctCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (lgsCostSubjCd[i] != null)
					model.setLgsCostSubjCd(lgsCostSubjCd[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (acctCd[i] != null)
					model.setAcctCd(acctCd[i]);
				if (lgsCostRmk[i] != null)
					model.setLgsCostRmk(lgsCostRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (lgsCostFullNm[i] != null)
					model.setLgsCostFullNm(lgsCostFullNm[i]);
				if (lgsCostOptNo[i] != null)
					model.setLgsCostOptNo(lgsCostOptNo[i]);
				if (thrpFlg[i] != null)
					model.setThrpFlg(thrpFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesLgsCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesLgsCostVO[]
	 */
	public TesLgsCostVO[] getTesLgsCostVOs(){
		TesLgsCostVO[] vos = (TesLgsCostVO[])models.toArray(new TesLgsCostVO[models.size()]);
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
		this.lgsCostAbbrNm = this.lgsCostAbbrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCdClssLvl = this.lgsCostCdClssLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostDtlCd = this.lgsCostDtlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrAcctCd = this.crrAcctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostSubjCd = this.lgsCostSubjCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctCd = this.acctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostRmk = this.lgsCostRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostFullNm = this.lgsCostFullNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostOptNo = this.lgsCostOptNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.thrpFlg = this.thrpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
