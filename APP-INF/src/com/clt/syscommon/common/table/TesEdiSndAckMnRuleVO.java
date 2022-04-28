/*=========================================================
*Copyright(c) 2013 CyberLogitec
*@FileName : TesEdiSndAckMnRuleVO.java
*@FileTitle : TesEdiSndAckMnRuleVO
*Open Issues :
*Change history :
*@LastModifyDate : 2013.02.19
*@LastModifier : 
*@LastVersion : 1.0
* 2013.02.19  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesEdiSndAckMnRuleVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesEdiSndAckMnRuleVO> models = new ArrayList<TesEdiSndAckMnRuleVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ackActTpCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String implSubTpCd = null;
	/* Column Info */
	private String rcvrId = null;
	/* Column Info */
	private String cfmDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String fileSeqUseFlg = null;
	/* Column Info */
	private String deltDt = null;
	/* Column Info */
	private String implTpCd = null;
	/* Column Info */
	private String cfmFlg = null;
	/* Column Info */
	private String implMnTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ediVndrSeq = null;
	/* Column Info */
	private String exeRowKnt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sndrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String invOfcCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesEdiSndAckMnRuleVO() {}

	public TesEdiSndAckMnRuleVO(String ibflag, String pagerows, String ediVndrSeq, String invOfcCd, String rcvrId, String sndrId, String cfmFlg, String cfmDt, String deltFlg, String deltDt, String ackActTpCd, String exeRowKnt, String implTpCd, String fileSeqUseFlg, String creUsrId, String creDt, String updUsrId, String updDt, String implMnTpCd, String implSubTpCd) {
		this.updDt = updDt;
		this.ackActTpCd = ackActTpCd;
		this.deltFlg = deltFlg;
		this.implSubTpCd = implSubTpCd;
		this.rcvrId = rcvrId;
		this.cfmDt = cfmDt;
		this.creDt = creDt;
		this.fileSeqUseFlg = fileSeqUseFlg;
		this.deltDt = deltDt;
		this.implTpCd = implTpCd;
		this.cfmFlg = cfmFlg;
		this.implMnTpCd = implMnTpCd;
		this.pagerows = pagerows;
		this.ediVndrSeq = ediVndrSeq;
		this.exeRowKnt = exeRowKnt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.sndrId = sndrId;
		this.updUsrId = updUsrId;
		this.invOfcCd = invOfcCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ack_act_tp_cd", getAckActTpCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("impl_sub_tp_cd", getImplSubTpCd());
		this.hashColumns.put("rcvr_id", getRcvrId());
		this.hashColumns.put("cfm_dt", getCfmDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("file_seq_use_flg", getFileSeqUseFlg());
		this.hashColumns.put("delt_dt", getDeltDt());
		this.hashColumns.put("impl_tp_cd", getImplTpCd());
		this.hashColumns.put("cfm_flg", getCfmFlg());
		this.hashColumns.put("impl_mn_tp_cd", getImplMnTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("edi_vndr_seq", getEdiVndrSeq());
		this.hashColumns.put("exe_row_knt", getExeRowKnt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sndr_id", getSndrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("inv_ofc_cd", getInvOfcCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ack_act_tp_cd", "ackActTpCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("impl_sub_tp_cd", "implSubTpCd");
		this.hashFields.put("rcvr_id", "rcvrId");
		this.hashFields.put("cfm_dt", "cfmDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("file_seq_use_flg", "fileSeqUseFlg");
		this.hashFields.put("delt_dt", "deltDt");
		this.hashFields.put("impl_tp_cd", "implTpCd");
		this.hashFields.put("cfm_flg", "cfmFlg");
		this.hashFields.put("impl_mn_tp_cd", "implMnTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("edi_vndr_seq", "ediVndrSeq");
		this.hashFields.put("exe_row_knt", "exeRowKnt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sndr_id", "sndrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("inv_ofc_cd", "invOfcCd");
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
	 * @return ackActTpCd
	 */
	public String getAckActTpCd() {
		return this.ackActTpCd;
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
	 * @return implSubTpCd
	 */
	public String getImplSubTpCd() {
		return this.implSubTpCd;
	}
	
	/**
	 * Column Info
	 * @return rcvrId
	 */
	public String getRcvrId() {
		return this.rcvrId;
	}
	
	/**
	 * Column Info
	 * @return cfmDt
	 */
	public String getCfmDt() {
		return this.cfmDt;
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
	 * @return fileSeqUseFlg
	 */
	public String getFileSeqUseFlg() {
		return this.fileSeqUseFlg;
	}
	
	/**
	 * Column Info
	 * @return deltDt
	 */
	public String getDeltDt() {
		return this.deltDt;
	}
	
	/**
	 * Column Info
	 * @return implTpCd
	 */
	public String getImplTpCd() {
		return this.implTpCd;
	}
	
	/**
	 * Column Info
	 * @return cfmFlg
	 */
	public String getCfmFlg() {
		return this.cfmFlg;
	}
	
	/**
	 * Column Info
	 * @return implMnTpCd
	 */
	public String getImplMnTpCd() {
		return this.implMnTpCd;
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
	 * @return ediVndrSeq
	 */
	public String getEdiVndrSeq() {
		return this.ediVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return exeRowKnt
	 */
	public String getExeRowKnt() {
		return this.exeRowKnt;
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
	 * @return sndrId
	 */
	public String getSndrId() {
		return this.sndrId;
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
	 * @return invOfcCd
	 */
	public String getInvOfcCd() {
		return this.invOfcCd;
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
	 * @param ackActTpCd
	 */
	public void setAckActTpCd(String ackActTpCd) {
		this.ackActTpCd = ackActTpCd;
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
	 * @param implSubTpCd
	 */
	public void setImplSubTpCd(String implSubTpCd) {
		this.implSubTpCd = implSubTpCd;
	}
	
	/**
	 * Column Info
	 * @param rcvrId
	 */
	public void setRcvrId(String rcvrId) {
		this.rcvrId = rcvrId;
	}
	
	/**
	 * Column Info
	 * @param cfmDt
	 */
	public void setCfmDt(String cfmDt) {
		this.cfmDt = cfmDt;
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
	 * @param fileSeqUseFlg
	 */
	public void setFileSeqUseFlg(String fileSeqUseFlg) {
		this.fileSeqUseFlg = fileSeqUseFlg;
	}
	
	/**
	 * Column Info
	 * @param deltDt
	 */
	public void setDeltDt(String deltDt) {
		this.deltDt = deltDt;
	}
	
	/**
	 * Column Info
	 * @param implTpCd
	 */
	public void setImplTpCd(String implTpCd) {
		this.implTpCd = implTpCd;
	}
	
	/**
	 * Column Info
	 * @param cfmFlg
	 */
	public void setCfmFlg(String cfmFlg) {
		this.cfmFlg = cfmFlg;
	}
	
	/**
	 * Column Info
	 * @param implMnTpCd
	 */
	public void setImplMnTpCd(String implMnTpCd) {
		this.implMnTpCd = implMnTpCd;
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
	 * @param ediVndrSeq
	 */
	public void setEdiVndrSeq(String ediVndrSeq) {
		this.ediVndrSeq = ediVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param exeRowKnt
	 */
	public void setExeRowKnt(String exeRowKnt) {
		this.exeRowKnt = exeRowKnt;
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
	 * @param sndrId
	 */
	public void setSndrId(String sndrId) {
		this.sndrId = sndrId;
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
	 * @param invOfcCd
	 */
	public void setInvOfcCd(String invOfcCd) {
		this.invOfcCd = invOfcCd;
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
		setAckActTpCd(JSPUtil.getParameter(request, prefix + "ack_act_tp_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setImplSubTpCd(JSPUtil.getParameter(request, prefix + "impl_sub_tp_cd", ""));
		setRcvrId(JSPUtil.getParameter(request, prefix + "rcvr_id", ""));
		setCfmDt(JSPUtil.getParameter(request, prefix + "cfm_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setFileSeqUseFlg(JSPUtil.getParameter(request, prefix + "file_seq_use_flg", ""));
		setDeltDt(JSPUtil.getParameter(request, prefix + "delt_dt", ""));
		setImplTpCd(JSPUtil.getParameter(request, prefix + "impl_tp_cd", ""));
		setCfmFlg(JSPUtil.getParameter(request, prefix + "cfm_flg", ""));
		setImplMnTpCd(JSPUtil.getParameter(request, prefix + "impl_mn_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setEdiVndrSeq(JSPUtil.getParameter(request, prefix + "edi_vndr_seq", ""));
		setExeRowKnt(JSPUtil.getParameter(request, prefix + "exe_row_knt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setSndrId(JSPUtil.getParameter(request, prefix + "sndr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setInvOfcCd(JSPUtil.getParameter(request, prefix + "inv_ofc_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesEdiSndAckMnRuleVO[]
	 */
	public TesEdiSndAckMnRuleVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesEdiSndAckMnRuleVO[]
	 */
	public TesEdiSndAckMnRuleVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesEdiSndAckMnRuleVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ackActTpCd = (JSPUtil.getParameter(request, prefix	+ "ack_act_tp_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] implSubTpCd = (JSPUtil.getParameter(request, prefix	+ "impl_sub_tp_cd", length));
			String[] rcvrId = (JSPUtil.getParameter(request, prefix	+ "rcvr_id", length));
			String[] cfmDt = (JSPUtil.getParameter(request, prefix	+ "cfm_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] fileSeqUseFlg = (JSPUtil.getParameter(request, prefix	+ "file_seq_use_flg", length));
			String[] deltDt = (JSPUtil.getParameter(request, prefix	+ "delt_dt", length));
			String[] implTpCd = (JSPUtil.getParameter(request, prefix	+ "impl_tp_cd", length));
			String[] cfmFlg = (JSPUtil.getParameter(request, prefix	+ "cfm_flg", length));
			String[] implMnTpCd = (JSPUtil.getParameter(request, prefix	+ "impl_mn_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ediVndrSeq = (JSPUtil.getParameter(request, prefix	+ "edi_vndr_seq", length));
			String[] exeRowKnt = (JSPUtil.getParameter(request, prefix	+ "exe_row_knt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sndrId = (JSPUtil.getParameter(request, prefix	+ "sndr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] invOfcCd = (JSPUtil.getParameter(request, prefix	+ "inv_ofc_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesEdiSndAckMnRuleVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ackActTpCd[i] != null)
					model.setAckActTpCd(ackActTpCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (implSubTpCd[i] != null)
					model.setImplSubTpCd(implSubTpCd[i]);
				if (rcvrId[i] != null)
					model.setRcvrId(rcvrId[i]);
				if (cfmDt[i] != null)
					model.setCfmDt(cfmDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (fileSeqUseFlg[i] != null)
					model.setFileSeqUseFlg(fileSeqUseFlg[i]);
				if (deltDt[i] != null)
					model.setDeltDt(deltDt[i]);
				if (implTpCd[i] != null)
					model.setImplTpCd(implTpCd[i]);
				if (cfmFlg[i] != null)
					model.setCfmFlg(cfmFlg[i]);
				if (implMnTpCd[i] != null)
					model.setImplMnTpCd(implMnTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ediVndrSeq[i] != null)
					model.setEdiVndrSeq(ediVndrSeq[i]);
				if (exeRowKnt[i] != null)
					model.setExeRowKnt(exeRowKnt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sndrId[i] != null)
					model.setSndrId(sndrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (invOfcCd[i] != null)
					model.setInvOfcCd(invOfcCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesEdiSndAckMnRuleVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesEdiSndAckMnRuleVO[]
	 */
	public TesEdiSndAckMnRuleVO[] getTesEdiSndAckMnRuleVOs(){
		TesEdiSndAckMnRuleVO[] vos = (TesEdiSndAckMnRuleVO[])models.toArray(new TesEdiSndAckMnRuleVO[models.size()]);
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
		this.ackActTpCd = this.ackActTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.implSubTpCd = this.implSubTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvrId = this.rcvrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmDt = this.cfmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileSeqUseFlg = this.fileSeqUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltDt = this.deltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.implTpCd = this.implTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmFlg = this.cfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.implMnTpCd = this.implMnTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediVndrSeq = this.ediVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeRowKnt = this.exeRowKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndrId = this.sndrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invOfcCd = this.invOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
