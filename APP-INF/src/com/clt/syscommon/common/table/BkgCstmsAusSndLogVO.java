/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : BkgCstmsAusSndLogVO.java
*@FileTitle : BkgCstmsAusSndLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2014.12.24
*@LastModifier : 
*@LastVersion : 1.0
* 2014.12.24  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

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

public class BkgCstmsAusSndLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAusSndLogVO> models = new ArrayList<BkgCstmsAusSndLogVO>();
	
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String rtnYdSeq = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String msgRgstId = null;
	/* Column Info */
	private String ausSndLogId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String mrnNo = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String logGdt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String porYdCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String ediRcvMsgCtnt = null;
	/* Column Info */
	private String logDt = null;
	/* Column Info */
	private String rcvKeyDatCtnt = null;
	/* Column Info */
	private String logFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String emlSndRsltFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cntcPsonEml = null;
	/* Column Info */
	private String sndFlg = null;
	/* Column Info */
	private String mrnChkNo = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String ediRefId = null;
	/* Column Info */
	private String ediSndMsgCtnt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String otrNtfyYdCd = null;
	/* Column Info */
	private String ydSeq = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String doNo = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String polYdCd = null;
	/* Column Info */
	private String logSeq = null;
	/* Column Info */
	private String cstmsRqstFlg = null;
	/* Column Info */
	private String msgSndNo = null;
	/* Column Info */
	private String mfSndSeq = null;
	/* Column Info */
	private String actCd = null;
	/* Column Info */
	private String cntrTp = null;
	/* Column Info */
	private String bkgCgoTpCd = null;
	/* Column Info */
	private String cntrSize = null;
	/* Column Info */
	private String cntrMfSeq = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String cntrMfWgt = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String desc = null;
	/* Column Info */
	private String cntrMfWgtUt = null;
	/* Column Info */
	private String cntrMfMeasUt = null;
	/* Column Info */
	private String markDesc = null;
	/* Column Info */
	private String maxSndSeq = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public BkgCstmsAusSndLogVO() {}

	public BkgCstmsAusSndLogVO(String ibflag, String pagerows, String ausSndLogId, String msgSndNo, String sndDt, String logSeq, String ofcCd, String vslCd, String skdVoyNo, String skdDirCd, String podCd, String logFlg, String logDt, String logGdt, String blNo, String doNo, String sndFlg, String msgRgstId, String cstmsRqstFlg, String polCd, String polYdCd, String porCd, String porYdCd, String otrNtfyYdCd, String rtnYdSeq, String ydSeq, String ediSndMsgCtnt, String rcvKeyDatCtnt, String delCd, String cntcPsonEml, String emlSndRsltFlg, String creUsrId, String creDt, String updUsrId, String updDt, String ediRefId, String mrnNo, String mrnChkNo, String cntrNo, String ediRcvMsgCtnt, String mfSndSeq, String actCd, String cntrTp, String bkgCgoTpCd, String cntrSize,  String cntrMfSeq,  String pckTpCd, String pckQty,  String cntrMfWgt, String measQty, String desc, String cntrMfWgtUt, String cntrMfMeasUt, String markDesc, String maxSndSeq) {
		this.porCd = porCd;
		this.rtnYdSeq = rtnYdSeq;
		this.vslCd = vslCd;
		this.msgRgstId = msgRgstId;
		this.ausSndLogId = ausSndLogId;
		this.creDt = creDt;
		this.sndDt = sndDt;
		this.mrnNo = mrnNo;
		this.blNo = blNo;
		this.logGdt = logGdt;
		this.pagerows = pagerows;
		this.porYdCd = porYdCd;
		this.ibflag = ibflag;
		this.polCd = polCd;
		this.ediRcvMsgCtnt = ediRcvMsgCtnt;
		this.logDt = logDt;
		this.rcvKeyDatCtnt = rcvKeyDatCtnt;
		this.logFlg = logFlg;
		this.updUsrId = updUsrId;
		this.emlSndRsltFlg = emlSndRsltFlg;
		this.updDt = updDt;
		this.cntcPsonEml = cntcPsonEml;
		this.sndFlg = sndFlg;
		this.mrnChkNo = mrnChkNo;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.ediRefId = ediRefId;
		this.ediSndMsgCtnt = ediSndMsgCtnt;
		this.skdDirCd = skdDirCd;
		this.otrNtfyYdCd = otrNtfyYdCd;
		this.ydSeq = ydSeq;
		this.podCd = podCd;
		this.doNo = doNo;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.cntrNo = cntrNo;
		this.polYdCd = polYdCd;
		this.logSeq = logSeq;
		this.cstmsRqstFlg = cstmsRqstFlg;
		this.msgSndNo = msgSndNo;
		this.mfSndSeq =mfSndSeq;
		this.actCd = actCd;
		this.cntrTp = cntrTp;
		this.bkgCgoTpCd = bkgCgoTpCd;
		this.cntrSize = cntrSize;
		this.cntrMfSeq = cntrMfSeq;
		this.pckTpCd = pckTpCd;
		this.pckQty = pckQty;
		this.cntrMfWgt = cntrMfWgt;
		this.measQty = measQty;
		this.desc = desc;
		this.cntrMfWgtUt = cntrMfWgtUt;
		this.cntrMfMeasUt = cntrMfMeasUt;
		this.markDesc = markDesc;
		this.maxSndSeq = maxSndSeq;

	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("rtn_yd_seq", getRtnYdSeq());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("msg_rgst_id", getMsgRgstId());
		this.hashColumns.put("aus_snd_log_id", getAusSndLogId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("mrn_no", getMrnNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("log_gdt", getLogGdt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("por_yd_cd", getPorYdCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("edi_rcv_msg_ctnt", getEdiRcvMsgCtnt());
		this.hashColumns.put("log_dt", getLogDt());
		this.hashColumns.put("rcv_key_dat_ctnt", getRcvKeyDatCtnt());
		this.hashColumns.put("log_flg", getLogFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("eml_snd_rslt_flg", getEmlSndRsltFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cntc_pson_eml", getCntcPsonEml());
		this.hashColumns.put("snd_flg", getSndFlg());
		this.hashColumns.put("mrn_chk_no", getMrnChkNo());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("edi_ref_id", getEdiRefId());
		this.hashColumns.put("edi_snd_msg_ctnt", getEdiSndMsgCtnt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("otr_ntfy_yd_cd", getOtrNtfyYdCd());
		this.hashColumns.put("yd_seq", getYdSeq());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("do_no", getDoNo());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("pol_yd_cd", getPolYdCd());
		this.hashColumns.put("log_seq", getLogSeq());
		this.hashColumns.put("cstms_rqst_flg", getCstmsRqstFlg());
		this.hashColumns.put("mf_snd_seq", getMfSndSeq());
		this.hashColumns.put("act_cd", getActCd());
		this.hashColumns.put("cntr_tp", getCntrTp());
		this.hashColumns.put("bkg_cgo_tp_cd", getBkgCgoTpCd());
		this.hashColumns.put("cntr_size", getCntrSize());
		this.hashColumns.put("cntr_mf_seq", getCntrMfSeq());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("cntr_mf_wgt", getCntrMfWgt());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("desc", getDesc());
		this.hashColumns.put("cntr_mf_wgt_ut", getCntrMfWgtUt());
		this.hashColumns.put("cntr_mf_meas_ut", getCntrMfMeasUt());
		this.hashColumns.put("mark_desc", getMarkDesc());
		this.hashColumns.put("max_snd_seq", getMaxSndSeq());
		
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("rtn_yd_seq", "rtnYdSeq");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("msg_rgst_id", "msgRgstId");
		this.hashFields.put("aus_snd_log_id", "ausSndLogId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("mrn_no", "mrnNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("log_gdt", "logGdt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("por_yd_cd", "porYdCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("edi_rcv_msg_ctnt", "ediRcvMsgCtnt");
		this.hashFields.put("log_dt", "logDt");
		this.hashFields.put("rcv_key_dat_ctnt", "rcvKeyDatCtnt");
		this.hashFields.put("log_flg", "logFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("eml_snd_rslt_flg", "emlSndRsltFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cntc_pson_eml", "cntcPsonEml");
		this.hashFields.put("snd_flg", "sndFlg");
		this.hashFields.put("mrn_chk_no", "mrnChkNo");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("edi_ref_id", "ediRefId");
		this.hashFields.put("edi_snd_msg_ctnt", "ediSndMsgCtnt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("otr_ntfy_yd_cd", "otrNtfyYdCd");
		this.hashFields.put("yd_seq", "ydSeq");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("do_no", "doNo");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("log_seq", "logSeq");
		this.hashFields.put("cstms_rqst_flg", "cstmsRqstFlg");
		this.hashFields.put("mf_snd_seq", "mfSndSeq");
		this.hashFields.put("act_cd", "actCd");
		this.hashFields.put("cntr_tp", "cntrTp");
		this.hashFields.put("bkg_cgo_tp_cd", "bkgCgoTpCd");
		this.hashFields.put("cntr_size", "cntrSize");
		this.hashFields.put("cntr_mf_seq", "cntrMfSeq");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("cntr_mf_wgt", "cntrMfWgt");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("desc", "desc");
		this.hashFields.put("cntr_mf_wgt_ut", "cntrMfWgtUt");
		this.hashFields.put("cntr_mf_meas_ut", "cntrMfMeasUt");
		this.hashFields.put("mark_desc", "markDesc");
		this.hashFields.put("max_snd_seq", "maxSndSeq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
	}
	
	/**
	 * Column Info
	 * @return rtnYdSeq
	 */
	public String getRtnYdSeq() {
		return this.rtnYdSeq;
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
	 * @return msgRgstId
	 */
	public String getMsgRgstId() {
		return this.msgRgstId;
	}
	
	/**
	 * Column Info
	 * @return ausSndLogId
	 */
	public String getAusSndLogId() {
		return this.ausSndLogId;
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
	 * @return sndDt
	 */
	public String getSndDt() {
		return this.sndDt;
	}
	
	/**
	 * Column Info
	 * @return mrnNo
	 */
	public String getMrnNo() {
		return this.mrnNo;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
	}
	
	/**
	 * Column Info
	 * @return logGdt
	 */
	public String getLogGdt() {
		return this.logGdt;
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
	 * @return porYdCd
	 */
	public String getPorYdCd() {
		return this.porYdCd;
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
	 * @return ediRcvMsgCtnt
	 */
	public String getEdiRcvMsgCtnt() {
		return this.ediRcvMsgCtnt;
	}
	
	/**
	 * Column Info
	 * @return logDt
	 */
	public String getLogDt() {
		return this.logDt;
	}
	
	/**
	 * Column Info
	 * @return rcvKeyDatCtnt
	 */
	public String getRcvKeyDatCtnt() {
		return this.rcvKeyDatCtnt;
	}
	
	/**
	 * Column Info
	 * @return logFlg
	 */
	public String getLogFlg() {
		return this.logFlg;
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
	 * @return emlSndRsltFlg
	 */
	public String getEmlSndRsltFlg() {
		return this.emlSndRsltFlg;
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
	 * @return cntcPsonEml
	 */
	public String getCntcPsonEml() {
		return this.cntcPsonEml;
	}
	
	/**
	 * Column Info
	 * @return sndFlg
	 */
	public String getSndFlg() {
		return this.sndFlg;
	}
	
	/**
	 * Column Info
	 * @return mrnChkNo
	 */
	public String getMrnChkNo() {
		return this.mrnChkNo;
	}
	
	/**
	 * Column Info
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
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
	 * @return ediRefId
	 */
	public String getEdiRefId() {
		return this.ediRefId;
	}
	
	/**
	 * Column Info
	 * @return ediSndMsgCtnt
	 */
	public String getEdiSndMsgCtnt() {
		return this.ediSndMsgCtnt;
	}
	
	/**
	 * Column Info
	 * @return mfSndSeq
	 */
	public String getMfSndSeq() {
		return this.mfSndSeq;
	}
	
	/**
	 * Column Info
	 * @return actCd
	 */
	public String getActCd() {
		return this.actCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTp
	 */
	public String getCntrTp() {
		return this.cntrTp;
	}
	
	/**
	 * Column Info
	 * @return bkgCgoTpCd
	 */
	public String getBkgCgoTpCd() {
		return this.bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @return cntrSize
	 */
	public String getCntrSize() {
		return this.cntrSize;
	}
	
	/**
	 * Column Info
	 * @return cntrMfSeq
	 */
	public String getCntrMfSeq() {
		return this.cntrMfSeq;
	}
	
	
	/**
	 * Column Info
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
	}
	
	/**
	 * Column Info
	 * @return pckQty
	 */
	public String getPckQty() {
		return this.pckQty;
	}
	
	/**
	 * Column Info
	 * @return cntrMfWgt
	 */
	public String getCntrMfWgt() {
		return this.cntrMfWgt;
	}
	
	/**
	 * Column Info
	 * @return measQty
	 */
	public String getMeasQty() {
		return this.measQty;
	}
	
	/**
	 * Column Info
	 * @return desc
	 */
	public String getDesc() {
		return this.desc;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return otrNtfyYdCd
	 */
	public String getOtrNtfyYdCd() {
		return this.otrNtfyYdCd;
	}
	
	/**
	 * Column Info
	 * @return ydSeq
	 */
	public String getYdSeq() {
		return this.ydSeq;
	}
	
	/**
	 * Column Info
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return doNo
	 */
	public String getDoNo() {
		return this.doNo;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return polYdCd
	 */
	public String getPolYdCd() {
		return this.polYdCd;
	}
	
	/**
	 * Column Info
	 * @return logSeq
	 */
	public String getLogSeq() {
		return this.logSeq;
	}
	
	/**
	 * Column Info
	 * @return cstmsRqstFlg
	 */
	public String getCstmsRqstFlg() {
		return this.cstmsRqstFlg;
	}
	
	/**
	 * Column Info
	 * @return msgSndNo
	 */
	public String getMsgSndNo() {
		return this.msgSndNo;
	}
	
	/**
	 * Column Info
	 * @return cntrMfWgtUt
	 */
	public String getCntrMfWgtUt() {
		return this.cntrMfWgtUt;
	}
	
	/**
	 * Column Info
	 * @return cntrMfMeasUt
	 */
	public String getCntrMfMeasUt() {
		return this.cntrMfMeasUt;
	}
	
	/**
	 * Column Info
	 * @return markDesc
	 */
	public String getMarkDesc() {
		return this.markDesc;
	}
	
	/**
	 * Column Info
	 * @return maxSndSeq
	 */
	public String getMaxSndSeq() {
		return this.maxSndSeq;
	}
	
	/**
	 * Column Info
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
	}
	
	/**
	 * Column Info
	 * @param rtnYdSeq
	 */
	public void setRtnYdSeq(String rtnYdSeq) {
		this.rtnYdSeq = rtnYdSeq;
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
	 * @param msgRgstId
	 */
	public void setMsgRgstId(String msgRgstId) {
		this.msgRgstId = msgRgstId;
	}
	
	/**
	 * Column Info
	 * @param ausSndLogId
	 */
	public void setAusSndLogId(String ausSndLogId) {
		this.ausSndLogId = ausSndLogId;
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
	 * @param sndDt
	 */
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
	}
	
	/**
	 * Column Info
	 * @param mrnNo
	 */
	public void setMrnNo(String mrnNo) {
		this.mrnNo = mrnNo;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Column Info
	 * @param logGdt
	 */
	public void setLogGdt(String logGdt) {
		this.logGdt = logGdt;
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
	 * @param porYdCd
	 */
	public void setPorYdCd(String porYdCd) {
		this.porYdCd = porYdCd;
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
	 * @param ediRcvMsgCtnt
	 */
	public void setEdiRcvMsgCtnt(String ediRcvMsgCtnt) {
		this.ediRcvMsgCtnt = ediRcvMsgCtnt;
	}
	
	/**
	 * Column Info
	 * @param logDt
	 */
	public void setLogDt(String logDt) {
		this.logDt = logDt;
	}
	
	/**
	 * Column Info
	 * @param rcvKeyDatCtnt
	 */
	public void setRcvKeyDatCtnt(String rcvKeyDatCtnt) {
		this.rcvKeyDatCtnt = rcvKeyDatCtnt;
	}
	
	/**
	 * Column Info
	 * @param logFlg
	 */
	public void setLogFlg(String logFlg) {
		this.logFlg = logFlg;
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
	 * @param emlSndRsltFlg
	 */
	public void setEmlSndRsltFlg(String emlSndRsltFlg) {
		this.emlSndRsltFlg = emlSndRsltFlg;
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
	 * @param cntcPsonEml
	 */
	public void setCntcPsonEml(String cntcPsonEml) {
		this.cntcPsonEml = cntcPsonEml;
	}
	
	/**
	 * Column Info
	 * @param sndFlg
	 */
	public void setSndFlg(String sndFlg) {
		this.sndFlg = sndFlg;
	}
	
	/**
	 * Column Info
	 * @param mrnChkNo
	 */
	public void setMrnChkNo(String mrnChkNo) {
		this.mrnChkNo = mrnChkNo;
	}
	
	/**
	 * Column Info
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
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
	 * @param ediRefId
	 */
	public void setEdiRefId(String ediRefId) {
		this.ediRefId = ediRefId;
	}
	
	/**
	 * Column Info
	 * @param ediSndMsgCtnt
	 */
	public void setEdiSndMsgCtnt(String ediSndMsgCtnt) {
		this.ediSndMsgCtnt = ediSndMsgCtnt;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param otrNtfyYdCd
	 */
	public void setOtrNtfyYdCd(String otrNtfyYdCd) {
		this.otrNtfyYdCd = otrNtfyYdCd;
	}
	
	/**
	 * Column Info
	 * @param ydSeq
	 */
	public void setYdSeq(String ydSeq) {
		this.ydSeq = ydSeq;
	}
	
	/**
	 * Column Info
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param doNo
	 */
	public void setDoNo(String doNo) {
		this.doNo = doNo;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param polYdCd
	 */
	public void setPolYdCd(String polYdCd) {
		this.polYdCd = polYdCd;
	}
	
	/**
	 * Column Info
	 * @param logSeq
	 */
	public void setLogSeq(String logSeq) {
		this.logSeq = logSeq;
	}
	
	/**
	 * Column Info
	 * @param cstmsRqstFlg
	 */
	public void setCstmsRqstFlg(String cstmsRqstFlg) {
		this.cstmsRqstFlg = cstmsRqstFlg;
	}
	
	/**
	 * Column Info
	 * @param msgSndNo
	 */
	public void setMsgSndNo(String msgSndNo) {
		this.msgSndNo = msgSndNo;
	}
	
	/**
	 * Column Info
	 * @param mfSndSeq
	 */
	public void setMfSndSeq(String mfSndSeq) {
		this.mfSndSeq = mfSndSeq;
	}
	
	/**
	 * Column Info
	 * @param actCd
	 */
	public void setActCd(String actCd) {
		this.actCd = actCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTp
	 */
	public void setCntrTp(String cntrTp) {
		this.cntrTp = cntrTp;
	}
	
	/**
	 * Column Info
	 * @param bkgCgoTpCd
	 */
	public void setBkgCgoTpCd(String bkgCgoTpCd) {
		this.bkgCgoTpCd = bkgCgoTpCd;
	}
	
	/**
	 * Column Info
	 * @param cntrSize
	 */
	public void setCntrSize(String cntrSize) {
		this.cntrSize = cntrSize;
	}
	
	/**
	 * Column Info
	 * @param cntrMfSeq
	 */
	public void setCntrMfSeq(String cntrMfSeq) {
		this.cntrMfSeq = cntrMfSeq;
	}
	
	/**
	 * Column Info
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
	}
	
	/**
	 * Column Info
	 * @param pckQty
	 */
	public void setPckQty(String pckQty) {
		this.pckQty = pckQty;
	}
	
	/**
	 * Column Info
	 * @param cntrMfWgt
	 */
	public void setCntrMfWgt(String cntrMfWgt) {
		this.cntrMfWgt = cntrMfWgt;
	}
	
	/**
	 * Column Info
	 * @param measQty
	 */
	public void setMeasQty(String measQty) {
		this.measQty = measQty;
	}
	
	/**
	 * Column Info
	 * @param desc
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	/**
	 * Column Info
	 * @param cntrMfWgtUt
	 */
	public void setCntrMfWgtUt(String cntrMfWgtUt) {
		this.cntrMfWgtUt = cntrMfWgtUt;
	}
	
	/**
	 * Column Info
	 * @param cntrMfMeasUt
	 */
	public void setCntrMfMeasUt(String cntrMfMeasUt) {
		this.cntrMfMeasUt = cntrMfMeasUt;
	}
	
	/**
	 * Column Info
	 * @param markDesc
	 */
	public void setMarkDesc(String markDesc) {
		this.markDesc = markDesc;
	}
	
	/**
	 * Column Info
	 * @param maxSndSeq
	 */
	public void setMaxSndSeq(String maxSndSeq) {
		this.maxSndSeq = maxSndSeq;
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
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setRtnYdSeq(JSPUtil.getParameter(request, prefix + "rtn_yd_seq", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setMsgRgstId(JSPUtil.getParameter(request, prefix + "msg_rgst_id", ""));
		setAusSndLogId(JSPUtil.getParameter(request, prefix + "aus_snd_log_id", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setSndDt(JSPUtil.getParameter(request, prefix + "snd_dt", ""));
		setMrnNo(JSPUtil.getParameter(request, prefix + "mrn_no", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setLogGdt(JSPUtil.getParameter(request, prefix + "log_gdt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPorYdCd(JSPUtil.getParameter(request, prefix + "por_yd_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setEdiRcvMsgCtnt(JSPUtil.getParameter(request, prefix + "edi_rcv_msg_ctnt", ""));
		setLogDt(JSPUtil.getParameter(request, prefix + "log_dt", ""));
		setRcvKeyDatCtnt(JSPUtil.getParameter(request, prefix + "rcv_key_dat_ctnt", ""));
		setLogFlg(JSPUtil.getParameter(request, prefix + "log_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setEmlSndRsltFlg(JSPUtil.getParameter(request, prefix + "eml_snd_rslt_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCntcPsonEml(JSPUtil.getParameter(request, prefix + "cntc_pson_eml", ""));
		setSndFlg(JSPUtil.getParameter(request, prefix + "snd_flg", ""));
		setMrnChkNo(JSPUtil.getParameter(request, prefix + "mrn_chk_no", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setEdiRefId(JSPUtil.getParameter(request, prefix + "edi_ref_id", ""));
		setEdiSndMsgCtnt(JSPUtil.getParameter(request, prefix + "edi_snd_msg_ctnt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setOtrNtfyYdCd(JSPUtil.getParameter(request, prefix + "otr_ntfy_yd_cd", ""));
		setYdSeq(JSPUtil.getParameter(request, prefix + "yd_seq", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setDoNo(JSPUtil.getParameter(request, prefix + "do_no", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setPolYdCd(JSPUtil.getParameter(request, prefix + "pol_yd_cd", ""));
		setLogSeq(JSPUtil.getParameter(request, prefix + "log_seq", ""));
		setCstmsRqstFlg(JSPUtil.getParameter(request, prefix + "cstms_rqst_flg", ""));
		setMsgSndNo(JSPUtil.getParameter(request, prefix + "msg_snd_no", ""));
		setMfSndSeq(JSPUtil.getParameter(request, prefix + "mf_snd_seq", ""));
		setActCd(JSPUtil.getParameter(request, prefix + "act_cd", ""));
		setCntrTp(JSPUtil.getParameter(request, prefix + "cntr_tp", ""));
		setBkgCgoTpCd(JSPUtil.getParameter(request, prefix + "bkg_cgo_tp_cd", ""));
		setCntrSize(JSPUtil.getParameter(request, prefix + "cntr_size", ""));
		setCntrMfSeq(JSPUtil.getParameter(request, prefix + "cntr_mf_seq", ""));
		setPckTpCd(JSPUtil.getParameter(request, prefix + "pck_tp_cd", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setCntrMfWgt(JSPUtil.getParameter(request, prefix + "cntr_mf_wgt", ""));
		setMeasQty(JSPUtil.getParameter(request, prefix + "meas_qty", ""));
		setDesc(JSPUtil.getParameter(request, prefix + "desc", ""));
		setCntrMfWgtUt(JSPUtil.getParameter(request, prefix + "cntr_mf_wgt_ut", ""));
		setCntrMfMeasUt(JSPUtil.getParameter(request, prefix + "cntr_mf_meas_ut", ""));
		setMarkDesc(JSPUtil.getParameter(request, prefix + "mark_desc", ""));
		setMaxSndSeq(JSPUtil.getParameter(request, prefix + "max_snd_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAusSndLogVO[]
	 */
	public BkgCstmsAusSndLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAusSndLogVO[]
	 */
	public BkgCstmsAusSndLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAusSndLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] rtnYdSeq = (JSPUtil.getParameter(request, prefix	+ "rtn_yd_seq", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] msgRgstId = (JSPUtil.getParameter(request, prefix	+ "msg_rgst_id", length));
			String[] ausSndLogId = (JSPUtil.getParameter(request, prefix	+ "aus_snd_log_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt", length));
			String[] mrnNo = (JSPUtil.getParameter(request, prefix	+ "mrn_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] logGdt = (JSPUtil.getParameter(request, prefix	+ "log_gdt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] porYdCd = (JSPUtil.getParameter(request, prefix	+ "por_yd_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] ediRcvMsgCtnt = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_msg_ctnt", length));
			String[] logDt = (JSPUtil.getParameter(request, prefix	+ "log_dt", length));
			String[] rcvKeyDatCtnt = (JSPUtil.getParameter(request, prefix	+ "rcv_key_dat_ctnt", length));
			String[] logFlg = (JSPUtil.getParameter(request, prefix	+ "log_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] emlSndRsltFlg = (JSPUtil.getParameter(request, prefix	+ "eml_snd_rslt_flg", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cntcPsonEml = (JSPUtil.getParameter(request, prefix	+ "cntc_pson_eml", length));
			String[] sndFlg = (JSPUtil.getParameter(request, prefix	+ "snd_flg", length));
			String[] mrnChkNo = (JSPUtil.getParameter(request, prefix	+ "mrn_chk_no", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] ediRefId = (JSPUtil.getParameter(request, prefix	+ "edi_ref_id", length));
			String[] ediSndMsgCtnt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_msg_ctnt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] otrNtfyYdCd = (JSPUtil.getParameter(request, prefix	+ "otr_ntfy_yd_cd", length));
			String[] ydSeq = (JSPUtil.getParameter(request, prefix	+ "yd_seq", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] doNo = (JSPUtil.getParameter(request, prefix	+ "do_no", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] polYdCd = (JSPUtil.getParameter(request, prefix	+ "pol_yd_cd", length));
			String[] logSeq = (JSPUtil.getParameter(request, prefix	+ "log_seq", length));
			String[] cstmsRqstFlg = (JSPUtil.getParameter(request, prefix	+ "cstms_rqst_flg", length));
			String[] msgSndNo = (JSPUtil.getParameter(request, prefix	+ "msg_snd_no", length));
			String[] mfSndSeq = (JSPUtil.getParameter(request, prefix	+ "mf_snd_seq", length));
			String[] actCd = (JSPUtil.getParameter(request, prefix	+ "act_cd", length));
			String[] cntrTp = (JSPUtil.getParameter(request, prefix	+ "cntr_tp", length));
			String[] bkgCgoTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp_cd", length));
			String[] cntrSize = (JSPUtil.getParameter(request, prefix	+ "cntr_size", length));
			String[] cntrMfSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_seq", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] cntrMfWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_wgt", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] desc = (JSPUtil.getParameter(request, prefix	+ "desc", length));
			String[] cntrMfWgtUt = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_wgt_ut", length));
			String[] cntrMfMeasUt = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_meas_ut", length));
			String[] markDesc = (JSPUtil.getParameter(request, prefix	+ "mark_desc", length));
			String[] maxSndSeq = (JSPUtil.getParameter(request, prefix	+ "max_snd_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAusSndLogVO();
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (rtnYdSeq[i] != null)
					model.setRtnYdSeq(rtnYdSeq[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (msgRgstId[i] != null)
					model.setMsgRgstId(msgRgstId[i]);
				if (ausSndLogId[i] != null)
					model.setAusSndLogId(ausSndLogId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (mrnNo[i] != null)
					model.setMrnNo(mrnNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (logGdt[i] != null)
					model.setLogGdt(logGdt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (porYdCd[i] != null)
					model.setPorYdCd(porYdCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (ediRcvMsgCtnt[i] != null)
					model.setEdiRcvMsgCtnt(ediRcvMsgCtnt[i]);
				if (logDt[i] != null)
					model.setLogDt(logDt[i]);
				if (rcvKeyDatCtnt[i] != null)
					model.setRcvKeyDatCtnt(rcvKeyDatCtnt[i]);
				if (logFlg[i] != null)
					model.setLogFlg(logFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (emlSndRsltFlg[i] != null)
					model.setEmlSndRsltFlg(emlSndRsltFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cntcPsonEml[i] != null)
					model.setCntcPsonEml(cntcPsonEml[i]);
				if (sndFlg[i] != null)
					model.setSndFlg(sndFlg[i]);
				if (mrnChkNo[i] != null)
					model.setMrnChkNo(mrnChkNo[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (ediRefId[i] != null)
					model.setEdiRefId(ediRefId[i]);
				if (ediSndMsgCtnt[i] != null)
					model.setEdiSndMsgCtnt(ediSndMsgCtnt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (otrNtfyYdCd[i] != null)
					model.setOtrNtfyYdCd(otrNtfyYdCd[i]);
				if (ydSeq[i] != null)
					model.setYdSeq(ydSeq[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (doNo[i] != null)
					model.setDoNo(doNo[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (polYdCd[i] != null)
					model.setPolYdCd(polYdCd[i]);
				if (logSeq[i] != null)
					model.setLogSeq(logSeq[i]);
				if (cstmsRqstFlg[i] != null)
					model.setCstmsRqstFlg(cstmsRqstFlg[i]);
				if (msgSndNo[i] != null)
					model.setMsgSndNo(msgSndNo[i]);
				if (mfSndSeq[i] != null)
					model.setMfSndSeq(mfSndSeq[i]);
				if (actCd[i] != null)
					model.setActCd(actCd[i]);
				if (cntrTp[i] != null)
					model.setCntrTp(cntrTp[i]);
				if (bkgCgoTpCd[i] != null)
					model.setBkgCgoTpCd(bkgCgoTpCd[i]);
				if (cntrSize[i] != null)
					model.setCntrSize(cntrSize[i]);
				if (cntrMfSeq[i] != null)
					model.setCntrMfSeq(cntrMfSeq[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (cntrMfWgt[i] != null)
					model.setCntrMfWgt(cntrMfWgt[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (desc[i] != null)
					model.setDesc(desc[i]);
				if (cntrMfWgtUt[i] != null)
					model.setCntrMfWgtUt(cntrMfWgtUt[i]);
				if (cntrMfMeasUt[i] != null)
					model.setCntrMfMeasUt(cntrMfMeasUt[i]);
				if (markDesc[i] != null)
					model.setMarkDesc(markDesc[i]);
				if (maxSndSeq[i] != null)
					model.setMaxSndSeq(maxSndSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAusSndLogVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAusSndLogVO[]
	 */
	public BkgCstmsAusSndLogVO[] getBkgCstmsAusSndLogVOs(){
		BkgCstmsAusSndLogVO[] vos = (BkgCstmsAusSndLogVO[])models.toArray(new BkgCstmsAusSndLogVO[models.size()]);
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
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtnYdSeq = this.rtnYdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgRgstId = this.msgRgstId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ausSndLogId = this.ausSndLogId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnNo = this.mrnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logGdt = this.logGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porYdCd = this.porYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvMsgCtnt = this.ediRcvMsgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logDt = this.logDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvKeyDatCtnt = this.rcvKeyDatCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logFlg = this.logFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndRsltFlg = this.emlSndRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcPsonEml = this.cntcPsonEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndFlg = this.sndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnChkNo = this.mrnChkNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRefId = this.ediRefId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndMsgCtnt = this.ediSndMsgCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrNtfyYdCd = this.otrNtfyYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydSeq = this.ydSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doNo = this.doNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd = this.polYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.logSeq = this.logSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsRqstFlg = this.cstmsRqstFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.msgSndNo = this.msgSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndSeq = this.mfSndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCd = this.actCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTp = this.cntrTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTpCd = this.bkgCgoTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSize = this.cntrSize .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfSeq = this.cntrMfSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfWgt = this.cntrMfWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.desc = this.desc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfWgtUt = this.cntrMfWgtUt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfMeasUt = this.cntrMfMeasUt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markDesc = this.markDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxSndSeq = this.maxSndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
