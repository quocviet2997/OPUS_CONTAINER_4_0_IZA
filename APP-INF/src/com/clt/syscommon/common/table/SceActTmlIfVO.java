/*========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceActTmlIfVO.java
*@FileTitle : SceActTmlIfVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.26
*@LastModifier : 김인수
*@LastVersion : 1.0
* 2009.11.26 김인수 
* 1.0 Creation
========================================================*/

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

public class SceActTmlIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceActTmlIfVO> models = new ArrayList<SceActTmlIfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String copCngTtlKnt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String actRcvNo = null;
	/* Column Info */
	private String vpsPortCd = null;
	/* Column Info */
	private String tmlIfStsCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String copCngScsKnt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String copEvntSeq = null;
	/* Column Info */
	private String clptIndSeq = null;
	/* Column Info */
	private String copCngErrKnt = null;
	/* Column Info */
	private String nodCd = null;
	/* Column Info */
	private String actRcvDt = null;
	/* Column Info */
	private String callYdIndSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String callYdIndCngFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceActTmlIfVO() {}

	public SceActTmlIfVO(String ibflag, String pagerows, String actRcvDt, String actRcvNo, String vslCd, String skdVoyNo, String skdDirCd, String vpsPortCd, String clptIndSeq, String nodCd, String callYdIndSeq, String tmlIfStsCd, String copEvntSeq, String copCngTtlKnt, String copCngScsKnt, String copCngErrKnt, String creUsrId, String creDt, String updUsrId, String updDt, String callYdIndCngFlg) {
		this.updDt = updDt;
		this.copCngTtlKnt = copCngTtlKnt;
		this.vslCd = vslCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.actRcvNo = actRcvNo;
		this.vpsPortCd = vpsPortCd;
		this.tmlIfStsCd = tmlIfStsCd;
		this.creUsrId = creUsrId;
		this.copCngScsKnt = copCngScsKnt;
		this.ibflag = ibflag;
		this.copEvntSeq = copEvntSeq;
		this.clptIndSeq = clptIndSeq;
		this.copCngErrKnt = copCngErrKnt;
		this.nodCd = nodCd;
		this.actRcvDt = actRcvDt;
		this.callYdIndSeq = callYdIndSeq;
		this.updUsrId = updUsrId;
		this.callYdIndCngFlg = callYdIndCngFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cop_cng_ttl_knt", getCopCngTtlKnt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("act_rcv_no", getActRcvNo());
		this.hashColumns.put("vps_port_cd", getVpsPortCd());
		this.hashColumns.put("tml_if_sts_cd", getTmlIfStsCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cop_cng_scs_knt", getCopCngScsKnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cop_evnt_seq", getCopEvntSeq());
		this.hashColumns.put("clpt_ind_seq", getClptIndSeq());
		this.hashColumns.put("cop_cng_err_knt", getCopCngErrKnt());
		this.hashColumns.put("nod_cd", getNodCd());
		this.hashColumns.put("act_rcv_dt", getActRcvDt());
		this.hashColumns.put("call_yd_ind_seq", getCallYdIndSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("call_yd_ind_cng_flg", getCallYdIndCngFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cop_cng_ttl_knt", "copCngTtlKnt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("act_rcv_no", "actRcvNo");
		this.hashFields.put("vps_port_cd", "vpsPortCd");
		this.hashFields.put("tml_if_sts_cd", "tmlIfStsCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cop_cng_scs_knt", "copCngScsKnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cop_evnt_seq", "copEvntSeq");
		this.hashFields.put("clpt_ind_seq", "clptIndSeq");
		this.hashFields.put("cop_cng_err_knt", "copCngErrKnt");
		this.hashFields.put("nod_cd", "nodCd");
		this.hashFields.put("act_rcv_dt", "actRcvDt");
		this.hashFields.put("call_yd_ind_seq", "callYdIndSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("call_yd_ind_cng_flg", "callYdIndCngFlg");
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
	 * @return copCngTtlKnt
	 */
	public String getCopCngTtlKnt() {
		return this.copCngTtlKnt;
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
	 * Column Info
	 * @return actRcvNo
	 */
	public String getActRcvNo() {
		return this.actRcvNo;
	}
	
	/**
	 * Column Info
	 * @return vpsPortCd
	 */
	public String getVpsPortCd() {
		return this.vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @return tmlIfStsCd
	 */
	public String getTmlIfStsCd() {
		return this.tmlIfStsCd;
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
	 * @return copCngScsKnt
	 */
	public String getCopCngScsKnt() {
		return this.copCngScsKnt;
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
	 * @return copEvntSeq
	 */
	public String getCopEvntSeq() {
		return this.copEvntSeq;
	}
	
	/**
	 * Column Info
	 * @return clptIndSeq
	 */
	public String getClptIndSeq() {
		return this.clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @return copCngErrKnt
	 */
	public String getCopCngErrKnt() {
		return this.copCngErrKnt;
	}
	
	/**
	 * Column Info
	 * @return nodCd
	 */
	public String getNodCd() {
		return this.nodCd;
	}
	
	/**
	 * Column Info
	 * @return actRcvDt
	 */
	public String getActRcvDt() {
		return this.actRcvDt;
	}
	
	/**
	 * Column Info
	 * @return callYdIndSeq
	 */
	public String getCallYdIndSeq() {
		return this.callYdIndSeq;
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
	 * @return callYdIndCngFlg
	 */
	public String getCallYdIndCngFlg() {
		return this.callYdIndCngFlg;
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
	 * @param copCngTtlKnt
	 */
	public void setCopCngTtlKnt(String copCngTtlKnt) {
		this.copCngTtlKnt = copCngTtlKnt;
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
	 * Column Info
	 * @param actRcvNo
	 */
	public void setActRcvNo(String actRcvNo) {
		this.actRcvNo = actRcvNo;
	}
	
	/**
	 * Column Info
	 * @param vpsPortCd
	 */
	public void setVpsPortCd(String vpsPortCd) {
		this.vpsPortCd = vpsPortCd;
	}
	
	/**
	 * Column Info
	 * @param tmlIfStsCd
	 */
	public void setTmlIfStsCd(String tmlIfStsCd) {
		this.tmlIfStsCd = tmlIfStsCd;
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
	 * @param copCngScsKnt
	 */
	public void setCopCngScsKnt(String copCngScsKnt) {
		this.copCngScsKnt = copCngScsKnt;
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
	 * @param copEvntSeq
	 */
	public void setCopEvntSeq(String copEvntSeq) {
		this.copEvntSeq = copEvntSeq;
	}
	
	/**
	 * Column Info
	 * @param clptIndSeq
	 */
	public void setClptIndSeq(String clptIndSeq) {
		this.clptIndSeq = clptIndSeq;
	}
	
	/**
	 * Column Info
	 * @param copCngErrKnt
	 */
	public void setCopCngErrKnt(String copCngErrKnt) {
		this.copCngErrKnt = copCngErrKnt;
	}
	
	/**
	 * Column Info
	 * @param nodCd
	 */
	public void setNodCd(String nodCd) {
		this.nodCd = nodCd;
	}
	
	/**
	 * Column Info
	 * @param actRcvDt
	 */
	public void setActRcvDt(String actRcvDt) {
		this.actRcvDt = actRcvDt;
	}
	
	/**
	 * Column Info
	 * @param callYdIndSeq
	 */
	public void setCallYdIndSeq(String callYdIndSeq) {
		this.callYdIndSeq = callYdIndSeq;
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
	 * @param callYdIndCngFlg
	 */
	public void setCallYdIndCngFlg(String callYdIndCngFlg) {
		this.callYdIndCngFlg = callYdIndCngFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCopCngTtlKnt(JSPUtil.getParameter(request, "cop_cng_ttl_knt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setActRcvNo(JSPUtil.getParameter(request, "act_rcv_no", ""));
		setVpsPortCd(JSPUtil.getParameter(request, "vps_port_cd", ""));
		setTmlIfStsCd(JSPUtil.getParameter(request, "tml_if_sts_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCopCngScsKnt(JSPUtil.getParameter(request, "cop_cng_scs_knt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCopEvntSeq(JSPUtil.getParameter(request, "cop_evnt_seq", ""));
		setClptIndSeq(JSPUtil.getParameter(request, "clpt_ind_seq", ""));
		setCopCngErrKnt(JSPUtil.getParameter(request, "cop_cng_err_knt", ""));
		setNodCd(JSPUtil.getParameter(request, "nod_cd", ""));
		setActRcvDt(JSPUtil.getParameter(request, "act_rcv_dt", ""));
		setCallYdIndSeq(JSPUtil.getParameter(request, "call_yd_ind_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "call_yd_ind_cng_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceActTmlIfVO[]
	 */
	public SceActTmlIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceActTmlIfVO[]
	 */
	public SceActTmlIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceActTmlIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] copCngTtlKnt = (JSPUtil.getParameter(request, prefix	+ "cop_cng_ttl_knt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] actRcvNo = (JSPUtil.getParameter(request, prefix	+ "act_rcv_no", length));
			String[] vpsPortCd = (JSPUtil.getParameter(request, prefix	+ "vps_port_cd", length));
			String[] tmlIfStsCd = (JSPUtil.getParameter(request, prefix	+ "tml_if_sts_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] copCngScsKnt = (JSPUtil.getParameter(request, prefix	+ "cop_cng_scs_knt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] copEvntSeq = (JSPUtil.getParameter(request, prefix	+ "cop_evnt_seq", length));
			String[] clptIndSeq = (JSPUtil.getParameter(request, prefix	+ "clpt_ind_seq", length));
			String[] copCngErrKnt = (JSPUtil.getParameter(request, prefix	+ "cop_cng_err_knt", length));
			String[] nodCd = (JSPUtil.getParameter(request, prefix	+ "nod_cd", length));
			String[] actRcvDt = (JSPUtil.getParameter(request, prefix	+ "act_rcv_dt", length));
			String[] callYdIndSeq = (JSPUtil.getParameter(request, prefix	+ "call_yd_ind_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] callYdIndCngFlg = (JSPUtil.getParameter(request, prefix	+ "call_yd_ind_cng_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceActTmlIfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (copCngTtlKnt[i] != null)
					model.setCopCngTtlKnt(copCngTtlKnt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (actRcvNo[i] != null)
					model.setActRcvNo(actRcvNo[i]);
				if (vpsPortCd[i] != null)
					model.setVpsPortCd(vpsPortCd[i]);
				if (tmlIfStsCd[i] != null)
					model.setTmlIfStsCd(tmlIfStsCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (copCngScsKnt[i] != null)
					model.setCopCngScsKnt(copCngScsKnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (copEvntSeq[i] != null)
					model.setCopEvntSeq(copEvntSeq[i]);
				if (clptIndSeq[i] != null)
					model.setClptIndSeq(clptIndSeq[i]);
				if (copCngErrKnt[i] != null)
					model.setCopCngErrKnt(copCngErrKnt[i]);
				if (nodCd[i] != null)
					model.setNodCd(nodCd[i]);
				if (actRcvDt[i] != null)
					model.setActRcvDt(actRcvDt[i]);
				if (callYdIndSeq[i] != null)
					model.setCallYdIndSeq(callYdIndSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (callYdIndCngFlg[i] != null)
					model.setCallYdIndCngFlg(callYdIndCngFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceActTmlIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceActTmlIfVO[]
	 */
	public SceActTmlIfVO[] getSceActTmlIfVOs(){
		SceActTmlIfVO[] vos = (SceActTmlIfVO[])models.toArray(new SceActTmlIfVO[models.size()]);
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
		this.copCngTtlKnt = this.copCngTtlKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actRcvNo = this.actRcvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vpsPortCd = this.vpsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlIfStsCd = this.tmlIfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copCngScsKnt = this.copCngScsKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copEvntSeq = this.copEvntSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clptIndSeq = this.clptIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copCngErrKnt = this.copCngErrKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nodCd = this.nodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actRcvDt = this.actRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callYdIndSeq = this.callYdIndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callYdIndCngFlg = this.callYdIndCngFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
