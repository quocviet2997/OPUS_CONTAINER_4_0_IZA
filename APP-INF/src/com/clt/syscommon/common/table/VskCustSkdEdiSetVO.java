/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VskCustSkdEdiSetVO.java
*@FileTitle : VskCustSkdEdiSetVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.11
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.01.11 함대성 
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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskCustSkdEdiSetVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskCustSkdEdiSetVO> models = new ArrayList<VskCustSkdEdiSetVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String useFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String preDmySkdFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ediMsgNm = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String wrkRsrcNm = null;
	/* Column Info */
	private String sndToDys = null;
	/* Column Info */
	private String sndFmDys = null;
	/* Column Info */
	private String custTrdPrnrId = null;
	/* Column Info */
	private String ediStupId = null;
	/* Column Info */
	private String ediSndrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String pstDmySkdFlg = null;
	/* Column Info */
	private String ediSvcTpNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskCustSkdEdiSetVO() {}

	public VskCustSkdEdiSetVO(String ibflag, String pagerows, String ediStupId, String custTrdPrnrId, String ediSndrId, String ediMsgNm, String ediSvcTpNm, String wrkRsrcNm, String sndFmDys, String sndToDys, String preDmySkdFlg, String pstDmySkdFlg, String creUsrId, String creDt, String updUsrId, String updDt, String useFlg, String eaiEvntDt) {
		this.updDt = updDt;
		this.useFlg = useFlg;
		this.creDt = creDt;
		this.eaiEvntDt = eaiEvntDt;
		this.preDmySkdFlg = preDmySkdFlg;
		this.pagerows = pagerows;
		this.ediMsgNm = ediMsgNm;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.wrkRsrcNm = wrkRsrcNm;
		this.sndToDys = sndToDys;
		this.sndFmDys = sndFmDys;
		this.custTrdPrnrId = custTrdPrnrId;
		this.ediStupId = ediStupId;
		this.ediSndrId = ediSndrId;
		this.updUsrId = updUsrId;
		this.pstDmySkdFlg = pstDmySkdFlg;
		this.ediSvcTpNm = ediSvcTpNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("use_flg", getUseFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("pre_dmy_skd_flg", getPreDmySkdFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("edi_msg_nm", getEdiMsgNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("wrk_rsrc_nm", getWrkRsrcNm());
		this.hashColumns.put("snd_to_dys", getSndToDys());
		this.hashColumns.put("snd_fm_dys", getSndFmDys());
		this.hashColumns.put("cust_trd_prnr_id", getCustTrdPrnrId());
		this.hashColumns.put("edi_stup_id", getEdiStupId());
		this.hashColumns.put("edi_sndr_id", getEdiSndrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pst_dmy_skd_flg", getPstDmySkdFlg());
		this.hashColumns.put("edi_svc_tp_nm", getEdiSvcTpNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("use_flg", "useFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("pre_dmy_skd_flg", "preDmySkdFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("edi_msg_nm", "ediMsgNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("wrk_rsrc_nm", "wrkRsrcNm");
		this.hashFields.put("snd_to_dys", "sndToDys");
		this.hashFields.put("snd_fm_dys", "sndFmDys");
		this.hashFields.put("cust_trd_prnr_id", "custTrdPrnrId");
		this.hashFields.put("edi_stup_id", "ediStupId");
		this.hashFields.put("edi_sndr_id", "ediSndrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pst_dmy_skd_flg", "pstDmySkdFlg");
		this.hashFields.put("edi_svc_tp_nm", "ediSvcTpNm");
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
	 * @return useFlg
	 */
	public String getUseFlg() {
		return this.useFlg;
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
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return preDmySkdFlg
	 */
	public String getPreDmySkdFlg() {
		return this.preDmySkdFlg;
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
	 * @return ediMsgNm
	 */
	public String getEdiMsgNm() {
		return this.ediMsgNm;
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
	 * @return wrkRsrcNm
	 */
	public String getWrkRsrcNm() {
		return this.wrkRsrcNm;
	}
	
	/**
	 * Column Info
	 * @return sndToDys
	 */
	public String getSndToDys() {
		return this.sndToDys;
	}
	
	/**
	 * Column Info
	 * @return sndFmDys
	 */
	public String getSndFmDys() {
		return this.sndFmDys;
	}
	
	/**
	 * Column Info
	 * @return custTrdPrnrId
	 */
	public String getCustTrdPrnrId() {
		return this.custTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @return ediStupId
	 */
	public String getEdiStupId() {
		return this.ediStupId;
	}
	
	/**
	 * Column Info
	 * @return ediSndrId
	 */
	public String getEdiSndrId() {
		return this.ediSndrId;
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
	 * @return pstDmySkdFlg
	 */
	public String getPstDmySkdFlg() {
		return this.pstDmySkdFlg;
	}
	
	/**
	 * Column Info
	 * @return ediSvcTpNm
	 */
	public String getEdiSvcTpNm() {
		return this.ediSvcTpNm;
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
	 * @param useFlg
	 */
	public void setUseFlg(String useFlg) {
		this.useFlg = useFlg;
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
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param preDmySkdFlg
	 */
	public void setPreDmySkdFlg(String preDmySkdFlg) {
		this.preDmySkdFlg = preDmySkdFlg;
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
	 * @param ediMsgNm
	 */
	public void setEdiMsgNm(String ediMsgNm) {
		this.ediMsgNm = ediMsgNm;
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
	 * @param wrkRsrcNm
	 */
	public void setWrkRsrcNm(String wrkRsrcNm) {
		this.wrkRsrcNm = wrkRsrcNm;
	}
	
	/**
	 * Column Info
	 * @param sndToDys
	 */
	public void setSndToDys(String sndToDys) {
		this.sndToDys = sndToDys;
	}
	
	/**
	 * Column Info
	 * @param sndFmDys
	 */
	public void setSndFmDys(String sndFmDys) {
		this.sndFmDys = sndFmDys;
	}
	
	/**
	 * Column Info
	 * @param custTrdPrnrId
	 */
	public void setCustTrdPrnrId(String custTrdPrnrId) {
		this.custTrdPrnrId = custTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @param ediStupId
	 */
	public void setEdiStupId(String ediStupId) {
		this.ediStupId = ediStupId;
	}
	
	/**
	 * Column Info
	 * @param ediSndrId
	 */
	public void setEdiSndrId(String ediSndrId) {
		this.ediSndrId = ediSndrId;
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
	 * @param pstDmySkdFlg
	 */
	public void setPstDmySkdFlg(String pstDmySkdFlg) {
		this.pstDmySkdFlg = pstDmySkdFlg;
	}
	
	/**
	 * Column Info
	 * @param ediSvcTpNm
	 */
	public void setEdiSvcTpNm(String ediSvcTpNm) {
		this.ediSvcTpNm = ediSvcTpNm;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setUseFlg(JSPUtil.getParameter(request, "use_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setPreDmySkdFlg(JSPUtil.getParameter(request, "pre_dmy_skd_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEdiMsgNm(JSPUtil.getParameter(request, "edi_msg_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setWrkRsrcNm(JSPUtil.getParameter(request, "wrk_rsrc_nm", ""));
		setSndToDys(JSPUtil.getParameter(request, "snd_to_dys", ""));
		setSndFmDys(JSPUtil.getParameter(request, "snd_fm_dys", ""));
		setCustTrdPrnrId(JSPUtil.getParameter(request, "cust_trd_prnr_id", ""));
		setEdiStupId(JSPUtil.getParameter(request, "edi_stup_id", ""));
		setEdiSndrId(JSPUtil.getParameter(request, "edi_sndr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPstDmySkdFlg(JSPUtil.getParameter(request, "pst_dmy_skd_flg", ""));
		setEdiSvcTpNm(JSPUtil.getParameter(request, "edi_svc_tp_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskCustSkdEdiSetVO[]
	 */
	public VskCustSkdEdiSetVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskCustSkdEdiSetVO[]
	 */
	public VskCustSkdEdiSetVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskCustSkdEdiSetVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] useFlg = (JSPUtil.getParameter(request, prefix	+ "use_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] preDmySkdFlg = (JSPUtil.getParameter(request, prefix	+ "pre_dmy_skd_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ediMsgNm = (JSPUtil.getParameter(request, prefix	+ "edi_msg_nm", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] wrkRsrcNm = (JSPUtil.getParameter(request, prefix	+ "wrk_rsrc_nm", length));
			String[] sndToDys = (JSPUtil.getParameter(request, prefix	+ "snd_to_dys", length));
			String[] sndFmDys = (JSPUtil.getParameter(request, prefix	+ "snd_fm_dys", length));
			String[] custTrdPrnrId = (JSPUtil.getParameter(request, prefix	+ "cust_trd_prnr_id", length));
			String[] ediStupId = (JSPUtil.getParameter(request, prefix	+ "edi_stup_id", length));
			String[] ediSndrId = (JSPUtil.getParameter(request, prefix	+ "edi_sndr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pstDmySkdFlg = (JSPUtil.getParameter(request, prefix	+ "pst_dmy_skd_flg", length));
			String[] ediSvcTpNm = (JSPUtil.getParameter(request, prefix	+ "edi_svc_tp_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskCustSkdEdiSetVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (useFlg[i] != null)
					model.setUseFlg(useFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (preDmySkdFlg[i] != null)
					model.setPreDmySkdFlg(preDmySkdFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ediMsgNm[i] != null)
					model.setEdiMsgNm(ediMsgNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (wrkRsrcNm[i] != null)
					model.setWrkRsrcNm(wrkRsrcNm[i]);
				if (sndToDys[i] != null)
					model.setSndToDys(sndToDys[i]);
				if (sndFmDys[i] != null)
					model.setSndFmDys(sndFmDys[i]);
				if (custTrdPrnrId[i] != null)
					model.setCustTrdPrnrId(custTrdPrnrId[i]);
				if (ediStupId[i] != null)
					model.setEdiStupId(ediStupId[i]);
				if (ediSndrId[i] != null)
					model.setEdiSndrId(ediSndrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pstDmySkdFlg[i] != null)
					model.setPstDmySkdFlg(pstDmySkdFlg[i]);
				if (ediSvcTpNm[i] != null)
					model.setEdiSvcTpNm(ediSvcTpNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskCustSkdEdiSetVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskCustSkdEdiSetVO[]
	 */
	public VskCustSkdEdiSetVO[] getVskCustSkdEdiSetVOs(){
		VskCustSkdEdiSetVO[] vos = (VskCustSkdEdiSetVO[])models.toArray(new VskCustSkdEdiSetVO[models.size()]);
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
		this.useFlg = this.useFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDmySkdFlg = this.preDmySkdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediMsgNm = this.ediMsgNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrkRsrcNm = this.wrkRsrcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndToDys = this.sndToDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndFmDys = this.sndFmDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTrdPrnrId = this.custTrdPrnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStupId = this.ediStupId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndrId = this.ediSndrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstDmySkdFlg = this.pstDmySkdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSvcTpNm = this.ediSvcTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
