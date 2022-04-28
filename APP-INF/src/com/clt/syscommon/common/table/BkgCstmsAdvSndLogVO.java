/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsAdvSndLogVO.java
*@FileTitle : BkgCstmsAdvSndLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.14
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2009.05.14 김민정 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김민정
 * @since J2EE 1.5
 * @see ..
 */

public class BkgCstmsAdvSndLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvSndLogVO> models = new ArrayList<BkgCstmsAdvSndLogVO>();
	
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String ackRcvTpId = null;
	/* Column Info */
	private String ackTpNo = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String sndUsrOfcCd = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String ackRcvDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String crrBatNo = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String trsmMsgTpId = null;
	/* Column Info */
	private String ackRcvKnt = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String vslDepRptFlg = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String hisSeq = null;
	/* Column Info */
	private String autoVslDepRptFlg = null;
	/* Column Info */
	private String sndUsrId = null;
	/* Column Info */
	private String ackAcptKnt = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String podCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ackSndKnt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvSndLogVO() {}

	public BkgCstmsAdvSndLogVO(String ibflag, String pagerows, String cntCd, String ioBndCd, String sndDt, String hisSeq, String trsmMsgTpId, String vslCd, String skdVoyNo, String skdDirCd, String polCd, String podCd, String vslDepRptFlg, String autoVslDepRptFlg, String sndUsrId, String sndUsrOfcCd, String ackTpNo, String ackRcvDt, String crrBatNo, String ackRcvTpId, String ackSndKnt, String ackRcvKnt, String ackAcptKnt, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.cntCd = cntCd;
		this.ackRcvTpId = ackRcvTpId;
		this.ackTpNo = ackTpNo;
		this.sndDt = sndDt;
		this.sndUsrOfcCd = sndUsrOfcCd;
		this.ioBndCd = ioBndCd;
		this.ackRcvDt = ackRcvDt;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.crrBatNo = crrBatNo;
		this.deltFlg = deltFlg;
		this.trsmMsgTpId = trsmMsgTpId;
		this.ackRcvKnt = ackRcvKnt;
		this.ibflag = ibflag;
		this.vslDepRptFlg = vslDepRptFlg;
		this.skdDirCd = skdDirCd;
		this.hisSeq = hisSeq;
		this.autoVslDepRptFlg = autoVslDepRptFlg;
		this.sndUsrId = sndUsrId;
		this.ackAcptKnt = ackAcptKnt;
		this.polCd = polCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.creUsrId = creUsrId;
		this.podCd = podCd;
		this.pagerows = pagerows;
		this.ackSndKnt = ackSndKnt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("ack_rcv_tp_id", getAckRcvTpId());
		this.hashColumns.put("ack_tp_no", getAckTpNo());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("snd_usr_ofc_cd", getSndUsrOfcCd());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("ack_rcv_dt", getAckRcvDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("crr_bat_no", getCrrBatNo());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("trsm_msg_tp_id", getTrsmMsgTpId());
		this.hashColumns.put("ack_rcv_knt", getAckRcvKnt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vsl_dep_rpt_flg", getVslDepRptFlg());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("his_seq", getHisSeq());
		this.hashColumns.put("auto_vsl_dep_rpt_flg", getAutoVslDepRptFlg());
		this.hashColumns.put("snd_usr_id", getSndUsrId());
		this.hashColumns.put("ack_acpt_knt", getAckAcptKnt());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ack_snd_knt", getAckSndKnt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("ack_rcv_tp_id", "ackRcvTpId");
		this.hashFields.put("ack_tp_no", "ackTpNo");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("snd_usr_ofc_cd", "sndUsrOfcCd");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("ack_rcv_dt", "ackRcvDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("crr_bat_no", "crrBatNo");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("trsm_msg_tp_id", "trsmMsgTpId");
		this.hashFields.put("ack_rcv_knt", "ackRcvKnt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vsl_dep_rpt_flg", "vslDepRptFlg");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("his_seq", "hisSeq");
		this.hashFields.put("auto_vsl_dep_rpt_flg", "autoVslDepRptFlg");
		this.hashFields.put("snd_usr_id", "sndUsrId");
		this.hashFields.put("ack_acpt_knt", "ackAcptKnt");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ack_snd_knt", "ackSndKnt");
		return this.hashFields;
	}
	
	public String getCntCd() {
		return this.cntCd;
	}
	public String getAckRcvTpId() {
		return this.ackRcvTpId;
	}
	public String getAckTpNo() {
		return this.ackTpNo;
	}
	public String getSndDt() {
		return this.sndDt;
	}
	public String getSndUsrOfcCd() {
		return this.sndUsrOfcCd;
	}
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	public String getAckRcvDt() {
		return this.ackRcvDt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getVslCd() {
		return this.vslCd;
	}
	public String getCrrBatNo() {
		return this.crrBatNo;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getTrsmMsgTpId() {
		return this.trsmMsgTpId;
	}
	public String getAckRcvKnt() {
		return this.ackRcvKnt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getVslDepRptFlg() {
		return this.vslDepRptFlg;
	}
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	public String getHisSeq() {
		return this.hisSeq;
	}
	public String getAutoVslDepRptFlg() {
		return this.autoVslDepRptFlg;
	}
	public String getSndUsrId() {
		return this.sndUsrId;
	}
	public String getAckAcptKnt() {
		return this.ackAcptKnt;
	}
	public String getPolCd() {
		return this.polCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPodCd() {
		return this.podCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getAckSndKnt() {
		return this.ackSndKnt;
	}

	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
		//this.cntCd=true;
	}
	public void setAckRcvTpId(String ackRcvTpId) {
		this.ackRcvTpId = ackRcvTpId;
		//this.ackRcvTpId=true;
	}
	public void setAckTpNo(String ackTpNo) {
		this.ackTpNo = ackTpNo;
		//this.ackTpNo=true;
	}
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
		//this.sndDt=true;
	}
	public void setSndUsrOfcCd(String sndUsrOfcCd) {
		this.sndUsrOfcCd = sndUsrOfcCd;
		//this.sndUsrOfcCd=true;
	}
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
		//this.ioBndCd=true;
	}
	public void setAckRcvDt(String ackRcvDt) {
		this.ackRcvDt = ackRcvDt;
		//this.ackRcvDt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
		//this.vslCd=true;
	}
	public void setCrrBatNo(String crrBatNo) {
		this.crrBatNo = crrBatNo;
		//this.crrBatNo=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setTrsmMsgTpId(String trsmMsgTpId) {
		this.trsmMsgTpId = trsmMsgTpId;
		//this.trsmMsgTpId=true;
	}
	public void setAckRcvKnt(String ackRcvKnt) {
		this.ackRcvKnt = ackRcvKnt;
		//this.ackRcvKnt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setVslDepRptFlg(String vslDepRptFlg) {
		this.vslDepRptFlg = vslDepRptFlg;
		//this.vslDepRptFlg=true;
	}
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
		//this.skdDirCd=true;
	}
	public void setHisSeq(String hisSeq) {
		this.hisSeq = hisSeq;
		//this.hisSeq=true;
	}
	public void setAutoVslDepRptFlg(String autoVslDepRptFlg) {
		this.autoVslDepRptFlg = autoVslDepRptFlg;
		//this.autoVslDepRptFlg=true;
	}
	public void setSndUsrId(String sndUsrId) {
		this.sndUsrId = sndUsrId;
		//this.sndUsrId=true;
	}
	public void setAckAcptKnt(String ackAcptKnt) {
		this.ackAcptKnt = ackAcptKnt;
		//this.ackAcptKnt=true;
	}
	public void setPolCd(String polCd) {
		this.polCd = polCd;
		//this.polCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
		//this.skdVoyNo=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPodCd(String podCd) {
		this.podCd = podCd;
		//this.podCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setAckSndKnt(String ackSndKnt) {
		this.ackSndKnt = ackSndKnt;
		//this.ackSndKnt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setAckRcvTpId(JSPUtil.getParameter(request, "ack_rcv_tp_id", ""));
		setAckTpNo(JSPUtil.getParameter(request, "ack_tp_no", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setSndUsrOfcCd(JSPUtil.getParameter(request, "snd_usr_ofc_cd", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setAckRcvDt(JSPUtil.getParameter(request, "ack_rcv_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setCrrBatNo(JSPUtil.getParameter(request, "crr_bat_no", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setTrsmMsgTpId(JSPUtil.getParameter(request, "trsm_msg_tp_id", ""));
		setAckRcvKnt(JSPUtil.getParameter(request, "ack_rcv_knt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVslDepRptFlg(JSPUtil.getParameter(request, "vsl_dep_rpt_flg", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setHisSeq(JSPUtil.getParameter(request, "his_seq", ""));
		setAutoVslDepRptFlg(JSPUtil.getParameter(request, "auto_vsl_dep_rpt_flg", ""));
		setSndUsrId(JSPUtil.getParameter(request, "snd_usr_id", ""));
		setAckAcptKnt(JSPUtil.getParameter(request, "ack_acpt_knt", ""));
		setPolCd(JSPUtil.getParameter(request, "pol_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAckSndKnt(JSPUtil.getParameter(request, "ack_snd_knt", ""));
	}

	public BkgCstmsAdvSndLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsAdvSndLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvSndLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd".trim(), length));
			String[] ackRcvTpId = (JSPUtil.getParameter(request, prefix	+ "ack_rcv_tp_id".trim(), length));
			String[] ackTpNo = (JSPUtil.getParameter(request, prefix	+ "ack_tp_no".trim(), length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt".trim(), length));
			String[] sndUsrOfcCd = (JSPUtil.getParameter(request, prefix	+ "snd_usr_ofc_cd".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] ackRcvDt = (JSPUtil.getParameter(request, prefix	+ "ack_rcv_dt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] crrBatNo = (JSPUtil.getParameter(request, prefix	+ "crr_bat_no".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] trsmMsgTpId = (JSPUtil.getParameter(request, prefix	+ "trsm_msg_tp_id".trim(), length));
			String[] ackRcvKnt = (JSPUtil.getParameter(request, prefix	+ "ack_rcv_knt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] vslDepRptFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_dep_rpt_flg".trim(), length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd".trim(), length));
			String[] hisSeq = (JSPUtil.getParameter(request, prefix	+ "his_seq".trim(), length));
			String[] autoVslDepRptFlg = (JSPUtil.getParameter(request, prefix	+ "auto_vsl_dep_rpt_flg".trim(), length));
			String[] sndUsrId = (JSPUtil.getParameter(request, prefix	+ "snd_usr_id".trim(), length));
			String[] ackAcptKnt = (JSPUtil.getParameter(request, prefix	+ "ack_acpt_knt".trim(), length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ackSndKnt = (JSPUtil.getParameter(request, prefix	+ "ack_snd_knt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvSndLogVO();
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (ackRcvTpId[i] != null)
					model.setAckRcvTpId(ackRcvTpId[i]);
				if (ackTpNo[i] != null)
					model.setAckTpNo(ackTpNo[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (sndUsrOfcCd[i] != null)
					model.setSndUsrOfcCd(sndUsrOfcCd[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (ackRcvDt[i] != null)
					model.setAckRcvDt(ackRcvDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (crrBatNo[i] != null)
					model.setCrrBatNo(crrBatNo[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (trsmMsgTpId[i] != null)
					model.setTrsmMsgTpId(trsmMsgTpId[i]);
				if (ackRcvKnt[i] != null)
					model.setAckRcvKnt(ackRcvKnt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vslDepRptFlg[i] != null)
					model.setVslDepRptFlg(vslDepRptFlg[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (hisSeq[i] != null)
					model.setHisSeq(hisSeq[i]);
				if (autoVslDepRptFlg[i] != null)
					model.setAutoVslDepRptFlg(autoVslDepRptFlg[i]);
				if (sndUsrId[i] != null)
					model.setSndUsrId(sndUsrId[i]);
				if (ackAcptKnt[i] != null)
					model.setAckAcptKnt(ackAcptKnt[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ackSndKnt[i] != null)
					model.setAckSndKnt(ackSndKnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvSndLogVOs();
	}

	public BkgCstmsAdvSndLogVO[] getBkgCstmsAdvSndLogVOs(){
		BkgCstmsAdvSndLogVO[] vos = (BkgCstmsAdvSndLogVO[])models.toArray(new BkgCstmsAdvSndLogVO[models.size()]);
		return vos;
	}
	
	public String toString() {
		StringBuffer ret = new StringBuffer();
		Field[] field = this.getClass().getDeclaredFields();
		String space = "";
		try{
			for(int i = 0; i < field.length; i++){
				String[] arr = null;
				arr = getField(field, i);
				if(arr != null){
					for(int j = 0; j < arr.length; j++) {
						ret.append(field[i].getName().concat(space).substring(0, 30).concat("= ") + arr[j] + "\n");
					}
				} else {
					ret.append(field[i].getName() + " =  null \n");
				}
			}
		} catch (Exception ex) {
			return null;
		}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackRcvTpId = this.ackRcvTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackTpNo = this.ackTpNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndUsrOfcCd = this.sndUsrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackRcvDt = this.ackRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrBatNo = this.crrBatNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trsmMsgTpId = this.trsmMsgTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackRcvKnt = this.ackRcvKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDepRptFlg = this.vslDepRptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hisSeq = this.hisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoVslDepRptFlg = this.autoVslDepRptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndUsrId = this.sndUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackAcptKnt = this.ackAcptKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackSndKnt = this.ackSndKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
