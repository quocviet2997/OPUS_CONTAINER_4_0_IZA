/*=========================================================
*Copyright(c) 2012 CyberLogitec
*@FileName : SamSlsActVO.java
*@FileTitle : SamSlsActVO
*Open Issues :
*Change history :
*@LastModifyDate : 2012.02.16
*@LastModifier : 서미진
*@LastVersion : 1.0
* 2012.02.16 서미진 
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
 * @author 서미진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SamSlsActVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SamSlsActVO> models = new ArrayList<SamSlsActVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String slsMgrCmtDesc = null;
	/* Column Info */
	private String slsActSubTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String slsActActDt = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String srepCd = null;
	/* Column Info */
	private String callRptFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slsActTpCd = null;
	/* Column Info */
	private String actPlnDt = null;
	/* Column Info */
	private String actChnlCd = null;
	/* Column Info */
	private String slsActSeq = null;
	/* Column Info */
	private String srepCmtDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SamSlsActVO() {}

	public SamSlsActVO(String ibflag, String pagerows, String custCntCd, String custSeq, String srepCd, String slsActSeq, String actPlnDt, String slsActActDt, String actChnlCd, String srepCmtDesc, String slsMgrCmtDesc, String callRptFlg, String creUsrId, String updUsrId, String updDt, String slsActTpCd, String creDt, String slsActSubTpCd) {
		this.updDt = updDt;
		this.slsMgrCmtDesc = slsMgrCmtDesc;
		this.slsActSubTpCd = slsActSubTpCd;
		this.creDt = creDt;
		this.slsActActDt = slsActActDt;
		this.custSeq = custSeq;
		this.srepCd = srepCd;
		this.callRptFlg = callRptFlg;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.slsActTpCd = slsActTpCd;
		this.actPlnDt = actPlnDt;
		this.actChnlCd = actChnlCd;
		this.slsActSeq = slsActSeq;
		this.srepCmtDesc = srepCmtDesc;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sls_mgr_cmt_desc", getSlsMgrCmtDesc());
		this.hashColumns.put("sls_act_sub_tp_cd", getSlsActSubTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sls_act_act_dt", getSlsActActDt());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("srep_cd", getSrepCd());
		this.hashColumns.put("call_rpt_flg", getCallRptFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sls_act_tp_cd", getSlsActTpCd());
		this.hashColumns.put("act_pln_dt", getActPlnDt());
		this.hashColumns.put("act_chnl_cd", getActChnlCd());
		this.hashColumns.put("sls_act_seq", getSlsActSeq());
		this.hashColumns.put("srep_cmt_desc", getSrepCmtDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sls_mgr_cmt_desc", "slsMgrCmtDesc");
		this.hashFields.put("sls_act_sub_tp_cd", "slsActSubTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sls_act_act_dt", "slsActActDt");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("srep_cd", "srepCd");
		this.hashFields.put("call_rpt_flg", "callRptFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sls_act_tp_cd", "slsActTpCd");
		this.hashFields.put("act_pln_dt", "actPlnDt");
		this.hashFields.put("act_chnl_cd", "actChnlCd");
		this.hashFields.put("sls_act_seq", "slsActSeq");
		this.hashFields.put("srep_cmt_desc", "srepCmtDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
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
	 * @return slsMgrCmtDesc
	 */
	public String getSlsMgrCmtDesc() {
		return this.slsMgrCmtDesc;
	}
	
	/**
	 * Column Info
	 * @return slsActSubTpCd
	 */
	public String getSlsActSubTpCd() {
		return this.slsActSubTpCd;
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
	 * @return slsActActDt
	 */
	public String getSlsActActDt() {
		return this.slsActActDt;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
	}
	
	/**
	 * Column Info
	 * @return srepCd
	 */
	public String getSrepCd() {
		return this.srepCd;
	}
	
	/**
	 * Column Info
	 * @return callRptFlg
	 */
	public String getCallRptFlg() {
		return this.callRptFlg;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return slsActTpCd
	 */
	public String getSlsActTpCd() {
		return this.slsActTpCd;
	}
	
	/**
	 * Column Info
	 * @return actPlnDt
	 */
	public String getActPlnDt() {
		return this.actPlnDt;
	}
	
	/**
	 * Column Info
	 * @return actChnlCd
	 */
	public String getActChnlCd() {
		return this.actChnlCd;
	}
	
	/**
	 * Column Info
	 * @return slsActSeq
	 */
	public String getSlsActSeq() {
		return this.slsActSeq;
	}
	
	/**
	 * Column Info
	 * @return srepCmtDesc
	 */
	public String getSrepCmtDesc() {
		return this.srepCmtDesc;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
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
	 * @param slsMgrCmtDesc
	 */
	public void setSlsMgrCmtDesc(String slsMgrCmtDesc) {
		this.slsMgrCmtDesc = slsMgrCmtDesc;
	}
	
	/**
	 * Column Info
	 * @param slsActSubTpCd
	 */
	public void setSlsActSubTpCd(String slsActSubTpCd) {
		this.slsActSubTpCd = slsActSubTpCd;
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
	 * @param slsActActDt
	 */
	public void setSlsActActDt(String slsActActDt) {
		this.slsActActDt = slsActActDt;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
	}
	
	/**
	 * Column Info
	 * @param srepCd
	 */
	public void setSrepCd(String srepCd) {
		this.srepCd = srepCd;
	}
	
	/**
	 * Column Info
	 * @param callRptFlg
	 */
	public void setCallRptFlg(String callRptFlg) {
		this.callRptFlg = callRptFlg;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param slsActTpCd
	 */
	public void setSlsActTpCd(String slsActTpCd) {
		this.slsActTpCd = slsActTpCd;
	}
	
	/**
	 * Column Info
	 * @param actPlnDt
	 */
	public void setActPlnDt(String actPlnDt) {
		this.actPlnDt = actPlnDt;
	}
	
	/**
	 * Column Info
	 * @param actChnlCd
	 */
	public void setActChnlCd(String actChnlCd) {
		this.actChnlCd = actChnlCd;
	}
	
	/**
	 * Column Info
	 * @param slsActSeq
	 */
	public void setSlsActSeq(String slsActSeq) {
		this.slsActSeq = slsActSeq;
	}
	
	/**
	 * Column Info
	 * @param srepCmtDesc
	 */
	public void setSrepCmtDesc(String srepCmtDesc) {
		this.srepCmtDesc = srepCmtDesc;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
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
		setSlsMgrCmtDesc(JSPUtil.getParameter(request, prefix + "sls_mgr_cmt_desc", ""));
		setSlsActSubTpCd(JSPUtil.getParameter(request, prefix + "sls_act_sub_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setSlsActActDt(JSPUtil.getParameter(request, prefix + "sls_act_act_dt", ""));
		setCustSeq(JSPUtil.getParameter(request, prefix + "cust_seq", ""));
		setSrepCd(JSPUtil.getParameter(request, prefix + "srep_cd", ""));
		setCallRptFlg(JSPUtil.getParameter(request, prefix + "call_rpt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setSlsActTpCd(JSPUtil.getParameter(request, prefix + "sls_act_tp_cd", ""));
		setActPlnDt(JSPUtil.getParameter(request, prefix + "act_pln_dt", ""));
		setActChnlCd(JSPUtil.getParameter(request, prefix + "act_chnl_cd", ""));
		setSlsActSeq(JSPUtil.getParameter(request, prefix + "sls_act_seq", ""));
		setSrepCmtDesc(JSPUtil.getParameter(request, prefix + "srep_cmt_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, prefix + "cust_cnt_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SamSlsActVO[]
	 */
	public SamSlsActVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SamSlsActVO[]
	 */
	public SamSlsActVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SamSlsActVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] slsMgrCmtDesc = (JSPUtil.getParameter(request, prefix	+ "sls_mgr_cmt_desc", length));
			String[] slsActSubTpCd = (JSPUtil.getParameter(request, prefix	+ "sls_act_sub_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] slsActActDt = (JSPUtil.getParameter(request, prefix	+ "sls_act_act_dt", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] srepCd = (JSPUtil.getParameter(request, prefix	+ "srep_cd", length));
			String[] callRptFlg = (JSPUtil.getParameter(request, prefix	+ "call_rpt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slsActTpCd = (JSPUtil.getParameter(request, prefix	+ "sls_act_tp_cd", length));
			String[] actPlnDt = (JSPUtil.getParameter(request, prefix	+ "act_pln_dt", length));
			String[] actChnlCd = (JSPUtil.getParameter(request, prefix	+ "act_chnl_cd", length));
			String[] slsActSeq = (JSPUtil.getParameter(request, prefix	+ "sls_act_seq", length));
			String[] srepCmtDesc = (JSPUtil.getParameter(request, prefix	+ "srep_cmt_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SamSlsActVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (slsMgrCmtDesc[i] != null)
					model.setSlsMgrCmtDesc(slsMgrCmtDesc[i]);
				if (slsActSubTpCd[i] != null)
					model.setSlsActSubTpCd(slsActSubTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (slsActActDt[i] != null)
					model.setSlsActActDt(slsActActDt[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (srepCd[i] != null)
					model.setSrepCd(srepCd[i]);
				if (callRptFlg[i] != null)
					model.setCallRptFlg(callRptFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slsActTpCd[i] != null)
					model.setSlsActTpCd(slsActTpCd[i]);
				if (actPlnDt[i] != null)
					model.setActPlnDt(actPlnDt[i]);
				if (actChnlCd[i] != null)
					model.setActChnlCd(actChnlCd[i]);
				if (slsActSeq[i] != null)
					model.setSlsActSeq(slsActSeq[i]);
				if (srepCmtDesc[i] != null)
					model.setSrepCmtDesc(srepCmtDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSamSlsActVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SamSlsActVO[]
	 */
	public SamSlsActVO[] getSamSlsActVOs(){
		SamSlsActVO[] vos = (SamSlsActVO[])models.toArray(new SamSlsActVO[models.size()]);
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
		this.slsMgrCmtDesc = this.slsMgrCmtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActSubTpCd = this.slsActSubTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActActDt = this.slsActActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCd = this.srepCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callRptFlg = this.callRptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActTpCd = this.slsActTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actPlnDt = this.actPlnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actChnlCd = this.actChnlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsActSeq = this.slsActSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.srepCmtDesc = this.srepCmtDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
