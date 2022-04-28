/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SceVslSkdEmlVO.java
*@FileTitle : SceVslSkdEmlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.27
*@LastModifier : 박준용
*@LastVersion : 1.0
* 2010.07.27 박준용 
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
 * @author 박준용
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceVslSkdEmlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceVslSkdEmlVO> models = new ArrayList<SceVslSkdEmlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String fmPortCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String svcEndDt = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String emlGrpId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String vskdDurId = null;
	/* Column Info */
	private String svcStDt = null;
	/* Column Info */
	private String emlJbId = null;
	/* Column Info */
	private String toPortCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceVslSkdEmlVO() {}

	public SceVslSkdEmlVO(String ibflag, String pagerows, String emlJbId, String svcStDt, String svcEndDt, String emlGrpId, String vslSlanCd, String fmPortCd, String toPortCd, String vskdDurId, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.deltFlg = deltFlg;
		this.fmPortCd = fmPortCd;
		this.creDt = creDt;
		this.svcEndDt = svcEndDt;
		this.vslSlanCd = vslSlanCd;
		this.pagerows = pagerows;
		this.emlGrpId = emlGrpId;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.vskdDurId = vskdDurId;
		this.svcStDt = svcStDt;
		this.emlJbId = emlJbId;
		this.toPortCd = toPortCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("fm_port_cd", getFmPortCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("svc_end_dt", getSvcEndDt());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eml_grp_id", getEmlGrpId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("vskd_dur_id", getVskdDurId());
		this.hashColumns.put("svc_st_dt", getSvcStDt());
		this.hashColumns.put("eml_jb_id", getEmlJbId());
		this.hashColumns.put("to_port_cd", getToPortCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("fm_port_cd", "fmPortCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("svc_end_dt", "svcEndDt");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eml_grp_id", "emlGrpId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("vskd_dur_id", "vskdDurId");
		this.hashFields.put("svc_st_dt", "svcStDt");
		this.hashFields.put("eml_jb_id", "emlJbId");
		this.hashFields.put("to_port_cd", "toPortCd");
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
	}
	
	/**
	 * Column Info
	 * @return fmPortCd
	 */
	public String getFmPortCd() {
		return this.fmPortCd;
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
	 * @return svcEndDt
	 */
	public String getSvcEndDt() {
		return this.svcEndDt;
	}
	
	/**
	 * Column Info
	 * @return vslSlanCd
	 */
	public String getVslSlanCd() {
		return this.vslSlanCd;
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
	 * @return emlGrpId
	 */
	public String getEmlGrpId() {
		return this.emlGrpId;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return vskdDurId
	 */
	public String getVskdDurId() {
		return this.vskdDurId;
	}
	
	/**
	 * Column Info
	 * @return svcStDt
	 */
	public String getSvcStDt() {
		return this.svcStDt;
	}
	
	/**
	 * Column Info
	 * @return emlJbId
	 */
	public String getEmlJbId() {
		return this.emlJbId;
	}
	
	/**
	 * Column Info
	 * @return toPortCd
	 */
	public String getToPortCd() {
		return this.toPortCd;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
	}
	
	/**
	 * Column Info
	 * @param fmPortCd
	 */
	public void setFmPortCd(String fmPortCd) {
		this.fmPortCd = fmPortCd;
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
	 * @param svcEndDt
	 */
	public void setSvcEndDt(String svcEndDt) {
		this.svcEndDt = svcEndDt;
	}
	
	/**
	 * Column Info
	 * @param vslSlanCd
	 */
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
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
	 * @param emlGrpId
	 */
	public void setEmlGrpId(String emlGrpId) {
		this.emlGrpId = emlGrpId;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param vskdDurId
	 */
	public void setVskdDurId(String vskdDurId) {
		this.vskdDurId = vskdDurId;
	}
	
	/**
	 * Column Info
	 * @param svcStDt
	 */
	public void setSvcStDt(String svcStDt) {
		this.svcStDt = svcStDt;
	}
	
	/**
	 * Column Info
	 * @param emlJbId
	 */
	public void setEmlJbId(String emlJbId) {
		this.emlJbId = emlJbId;
	}
	
	/**
	 * Column Info
	 * @param toPortCd
	 */
	public void setToPortCd(String toPortCd) {
		this.toPortCd = toPortCd;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setFmPortCd(JSPUtil.getParameter(request, prefix + "fm_port_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setSvcEndDt(JSPUtil.getParameter(request, prefix + "svc_end_dt", ""));
		setVslSlanCd(JSPUtil.getParameter(request, prefix + "vsl_slan_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setEmlGrpId(JSPUtil.getParameter(request, prefix + "eml_grp_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setVskdDurId(JSPUtil.getParameter(request, prefix + "vskd_dur_id", ""));
		setSvcStDt(JSPUtil.getParameter(request, prefix + "svc_st_dt", ""));
		setEmlJbId(JSPUtil.getParameter(request, prefix + "eml_jb_id", ""));
		setToPortCd(JSPUtil.getParameter(request, prefix + "to_port_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceVslSkdEmlVO[]
	 */
	public SceVslSkdEmlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceVslSkdEmlVO[]
	 */
	public SceVslSkdEmlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceVslSkdEmlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] fmPortCd = (JSPUtil.getParameter(request, prefix	+ "fm_port_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] svcEndDt = (JSPUtil.getParameter(request, prefix	+ "svc_end_dt", length));
			String[] vslSlanCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] emlGrpId = (JSPUtil.getParameter(request, prefix	+ "eml_grp_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] vskdDurId = (JSPUtil.getParameter(request, prefix	+ "vskd_dur_id", length));
			String[] svcStDt = (JSPUtil.getParameter(request, prefix	+ "svc_st_dt", length));
			String[] emlJbId = (JSPUtil.getParameter(request, prefix	+ "eml_jb_id", length));
			String[] toPortCd = (JSPUtil.getParameter(request, prefix	+ "to_port_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceVslSkdEmlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (fmPortCd[i] != null)
					model.setFmPortCd(fmPortCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (svcEndDt[i] != null)
					model.setSvcEndDt(svcEndDt[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (emlGrpId[i] != null)
					model.setEmlGrpId(emlGrpId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (vskdDurId[i] != null)
					model.setVskdDurId(vskdDurId[i]);
				if (svcStDt[i] != null)
					model.setSvcStDt(svcStDt[i]);
				if (emlJbId[i] != null)
					model.setEmlJbId(emlJbId[i]);
				if (toPortCd[i] != null)
					model.setToPortCd(toPortCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceVslSkdEmlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceVslSkdEmlVO[]
	 */
	public SceVslSkdEmlVO[] getSceVslSkdEmlVOs(){
		SceVslSkdEmlVO[] vos = (SceVslSkdEmlVO[])models.toArray(new SceVslSkdEmlVO[models.size()]);
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
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmPortCd = this.fmPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcEndDt = this.svcEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlGrpId = this.emlGrpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vskdDurId = this.vskdDurId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcStDt = this.svcStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlJbId = this.emlJbId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toPortCd = this.toPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
