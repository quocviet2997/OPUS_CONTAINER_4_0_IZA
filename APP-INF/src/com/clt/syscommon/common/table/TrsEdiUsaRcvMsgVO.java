/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : TrsEdiUsaRcvMsgVO.java
*@FileTitle : TrsEdiUsaRcvMsgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.06.05
*@LastModifier : 
*@LastVersion : 1.0
* 2015.06.05  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsEdiUsaRcvMsgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsEdiUsaRcvMsgVO> models = new ArrayList<TrsEdiUsaRcvMsgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String trspWoSeq = null;
	/* Column Info */
	private String rcvMsgTpCd = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rcvMsgSeq = null;
	/* Column Info */
	private String rcvMsgStsCd = null;
	/* Column Info */
	private String ediRjctRsnCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String trspWoOfcCtyCd = null;
	/* Column Info */
	private String fuelRto = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rcvAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rcvMsgSubSeq = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TrsEdiUsaRcvMsgVO() {}

	public TrsEdiUsaRcvMsgVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String rcvMsgSeq, String trspWoOfcCtyCd, String trspWoSeq, String lgsCostCd, String currCd, String rcvAmt, String fuelRto, String rcvMsgStsCd, String creUsrId, String creDt, String updUsrId, String updDt, String rcvMsgTpCd, String ediRjctRsnCd, String rcvMsgSubSeq) {
		this.updDt = updDt;
		this.currCd = currCd;
		this.trspWoSeq = trspWoSeq;
		this.rcvMsgTpCd = rcvMsgTpCd;
		this.trspSoSeq = trspSoSeq;
		this.creDt = creDt;
		this.rcvMsgSeq = rcvMsgSeq;
		this.rcvMsgStsCd = rcvMsgStsCd;
		this.ediRjctRsnCd = ediRjctRsnCd;
		this.pagerows = pagerows;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
		this.fuelRto = fuelRto;
		this.ibflag = ibflag;
		this.rcvAmt = rcvAmt;
		this.creUsrId = creUsrId;
		this.rcvMsgSubSeq = rcvMsgSubSeq;
		this.lgsCostCd = lgsCostCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("trsp_wo_seq", getTrspWoSeq());
		this.hashColumns.put("rcv_msg_tp_cd", getRcvMsgTpCd());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rcv_msg_seq", getRcvMsgSeq());
		this.hashColumns.put("rcv_msg_sts_cd", getRcvMsgStsCd());
		this.hashColumns.put("edi_rjct_rsn_cd", getEdiRjctRsnCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("trsp_wo_ofc_cty_cd", getTrspWoOfcCtyCd());
		this.hashColumns.put("fuel_rto", getFuelRto());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rcv_amt", getRcvAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rcv_msg_sub_seq", getRcvMsgSubSeq());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("trsp_wo_seq", "trspWoSeq");
		this.hashFields.put("rcv_msg_tp_cd", "rcvMsgTpCd");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rcv_msg_seq", "rcvMsgSeq");
		this.hashFields.put("rcv_msg_sts_cd", "rcvMsgStsCd");
		this.hashFields.put("edi_rjct_rsn_cd", "ediRjctRsnCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("trsp_wo_ofc_cty_cd", "trspWoOfcCtyCd");
		this.hashFields.put("fuel_rto", "fuelRto");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rcv_amt", "rcvAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rcv_msg_sub_seq", "rcvMsgSubSeq");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return trspWoSeq
	 */
	public String getTrspWoSeq() {
		return this.trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @return rcvMsgTpCd
	 */
	public String getRcvMsgTpCd() {
		return this.rcvMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
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
	 * @return rcvMsgSeq
	 */
	public String getRcvMsgSeq() {
		return this.rcvMsgSeq;
	}
	
	/**
	 * Column Info
	 * @return rcvMsgStsCd
	 */
	public String getRcvMsgStsCd() {
		return this.rcvMsgStsCd;
	}
	
	/**
	 * Column Info
	 * @return ediRjctRsnCd
	 */
	public String getEdiRjctRsnCd() {
		return this.ediRjctRsnCd;
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
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return trspWoOfcCtyCd
	 */
	public String getTrspWoOfcCtyCd() {
		return this.trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return fuelRto
	 */
	public String getFuelRto() {
		return this.fuelRto;
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
	 * @return rcvAmt
	 */
	public String getRcvAmt() {
		return this.rcvAmt;
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
	 * @return rcvMsgSubSeq
	 */
	public String getRcvMsgSubSeq() {
		return this.rcvMsgSubSeq;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param trspWoSeq
	 */
	public void setTrspWoSeq(String trspWoSeq) {
		this.trspWoSeq = trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @param rcvMsgTpCd
	 */
	public void setRcvMsgTpCd(String rcvMsgTpCd) {
		this.rcvMsgTpCd = rcvMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
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
	 * @param rcvMsgSeq
	 */
	public void setRcvMsgSeq(String rcvMsgSeq) {
		this.rcvMsgSeq = rcvMsgSeq;
	}
	
	/**
	 * Column Info
	 * @param rcvMsgStsCd
	 */
	public void setRcvMsgStsCd(String rcvMsgStsCd) {
		this.rcvMsgStsCd = rcvMsgStsCd;
	}
	
	/**
	 * Column Info
	 * @param ediRjctRsnCd
	 */
	public void setEdiRjctRsnCd(String ediRjctRsnCd) {
		this.ediRjctRsnCd = ediRjctRsnCd;
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
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param trspWoOfcCtyCd
	 */
	public void setTrspWoOfcCtyCd(String trspWoOfcCtyCd) {
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param fuelRto
	 */
	public void setFuelRto(String fuelRto) {
		this.fuelRto = fuelRto;
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
	 * @param rcvAmt
	 */
	public void setRcvAmt(String rcvAmt) {
		this.rcvAmt = rcvAmt;
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
	 * @param rcvMsgSubSeq
	 */
	public void setRcvMsgSubSeq(String rcvMsgSubSeq) {
		this.rcvMsgSubSeq = rcvMsgSubSeq;
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
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setTrspWoSeq(JSPUtil.getParameter(request, prefix + "trsp_wo_seq", ""));
		setRcvMsgTpCd(JSPUtil.getParameter(request, prefix + "rcv_msg_tp_cd", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setRcvMsgSeq(JSPUtil.getParameter(request, prefix + "rcv_msg_seq", ""));
		setRcvMsgStsCd(JSPUtil.getParameter(request, prefix + "rcv_msg_sts_cd", ""));
		setEdiRjctRsnCd(JSPUtil.getParameter(request, prefix + "edi_rjct_rsn_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setTrspWoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_wo_ofc_cty_cd", ""));
		setFuelRto(JSPUtil.getParameter(request, prefix + "fuel_rto", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setRcvAmt(JSPUtil.getParameter(request, prefix + "rcv_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setRcvMsgSubSeq(JSPUtil.getParameter(request, prefix + "rcv_msg_sub_seq", ""));
		setLgsCostCd(JSPUtil.getParameter(request, prefix + "lgs_cost_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsEdiUsaRcvMsgVO[]
	 */
	public TrsEdiUsaRcvMsgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsEdiUsaRcvMsgVO[]
	 */
	public TrsEdiUsaRcvMsgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsEdiUsaRcvMsgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] trspWoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_seq", length));
			String[] rcvMsgTpCd = (JSPUtil.getParameter(request, prefix	+ "rcv_msg_tp_cd", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rcvMsgSeq = (JSPUtil.getParameter(request, prefix	+ "rcv_msg_seq", length));
			String[] rcvMsgStsCd = (JSPUtil.getParameter(request, prefix	+ "rcv_msg_sts_cd", length));
			String[] ediRjctRsnCd = (JSPUtil.getParameter(request, prefix	+ "edi_rjct_rsn_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] trspWoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_ofc_cty_cd", length));
			String[] fuelRto = (JSPUtil.getParameter(request, prefix	+ "fuel_rto", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rcvAmt = (JSPUtil.getParameter(request, prefix	+ "rcv_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] rcvMsgSubSeq = (JSPUtil.getParameter(request, prefix	+ "rcv_msg_sub_seq", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsEdiUsaRcvMsgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (trspWoSeq[i] != null)
					model.setTrspWoSeq(trspWoSeq[i]);
				if (rcvMsgTpCd[i] != null)
					model.setRcvMsgTpCd(rcvMsgTpCd[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rcvMsgSeq[i] != null)
					model.setRcvMsgSeq(rcvMsgSeq[i]);
				if (rcvMsgStsCd[i] != null)
					model.setRcvMsgStsCd(rcvMsgStsCd[i]);
				if (ediRjctRsnCd[i] != null)
					model.setEdiRjctRsnCd(ediRjctRsnCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (trspWoOfcCtyCd[i] != null)
					model.setTrspWoOfcCtyCd(trspWoOfcCtyCd[i]);
				if (fuelRto[i] != null)
					model.setFuelRto(fuelRto[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rcvAmt[i] != null)
					model.setRcvAmt(rcvAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rcvMsgSubSeq[i] != null)
					model.setRcvMsgSubSeq(rcvMsgSubSeq[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsEdiUsaRcvMsgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsEdiUsaRcvMsgVO[]
	 */
	public TrsEdiUsaRcvMsgVO[] getTrsEdiUsaRcvMsgVOs(){
		TrsEdiUsaRcvMsgVO[] vos = (TrsEdiUsaRcvMsgVO[])models.toArray(new TrsEdiUsaRcvMsgVO[models.size()]);
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
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoSeq = this.trspWoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvMsgTpCd = this.rcvMsgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvMsgSeq = this.rcvMsgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvMsgStsCd = this.rcvMsgStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRjctRsnCd = this.ediRjctRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoOfcCtyCd = this.trspWoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fuelRto = this.fuelRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvAmt = this.rcvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvMsgSubSeq = this.rcvMsgSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
