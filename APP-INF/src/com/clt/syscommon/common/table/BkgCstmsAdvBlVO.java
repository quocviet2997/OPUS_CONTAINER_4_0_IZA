/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsAdvBlVO.java
*@FileTitle : BkgCstmsAdvBlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.15
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.03.15 김민정 
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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsAdvBlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvBlVO> models = new ArrayList<BkgCstmsAdvBlVO>();
	
	/* Column Info */
	private String ifDt = null;
	/* Column Info */
	private String cstmsAckRjctMsg = null;
	/* Column Info */
	private String actFileSkdDirCd = null;
	/* Column Info */
	private String usaLstLocCd = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String cstmsFileTpCd = null;
	/* Column Info */
	private String frobFlg = null;
	/* Column Info */
	private String inTzYdCntCd = null;
	/* Column Info */
	private String ifGdt = null;
	/* Column Info */
	private String inTzYdSteCd = null;
	/* Column Info */
	private String preMfNo = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String usrCmtCtnt = null;
	/* Column Info */
	private String prtFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspModId = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String inTzYdAddr = null;
	/* Column Info */
	private String cstmsAckKeyNo = null;
	/* Column Info */
	private String faxOfcCd = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String amsPckTpCd = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String cstmsPodCd = null;
	/* Column Info */
	private String delNodCd = null;
	/* Column Info */
	private String custToOrdFlg = null;
	/* Column Info */
	private String bdrOfcCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cstmsAckRcvDt = null;
	/* Column Info */
	private String cstmsPortCd = null;
	/* Column Info */
	private String cgoWgt = null;
	/* Column Info */
	private String cstmsLocCd = null;
	/* Column Info */
	private String amdtSndDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String ifFlg = null;
	/* Column Info */
	private String vslArrDt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String caIssDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cstmsAckRjctCd = null;
	/* Column Info */
	private String podNodCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String amdtSndGdt = null;
	/* Column Info */
	private String inTzYdZipId = null;
	/* Column Info */
	private String cstmsFileLocCd = null;
	/* Column Info */
	private String bdrIfDt = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String bdrIfUsrId = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String cstmsPolCd = null;
	/* Column Info */
	private String mfNo = null;
	/* Column Info */
	private String bdrFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String avcNoteTpId = null;
	/* Column Info */
	private String mfStsCd = null;
	/* Column Info */
	private String cstmsMfTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String faxCntCd = null;
	/* Column Info */
	private String scacCd = null;
	/* Column Info */
	private String cstmsAckRcvRsltCd = null;
	/* Column Info */
	private String mfSndDt = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String cstmsAckProcRsltCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String bdrDt = null;
	/* Column Info */
	private String caFlg = null;
	/* Column Info */
	private String inTzYdCtyNm = null;
	/* Column Info */
	private String rcvTermCd = null;
	/* Column Info */
	private String faxCustSeq = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String bdrIfGdt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String inTzYdCd = null;
	/* Column Info */
	private String trspTpId = null;
	/* Column Info */
	private String cstmsTrsmStsCd = null;
	/* Column Info */
	private String bdrGdt = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String inTzYdNm = null;
	/* Column Info */
	private String deTermCd = null;
	/* Column Info */
	private String mfSndGdt = null;
	/* Column Info */
	private String ibdLocGdsDesc = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String caNo = null;
	/* Column Info */
	private String hubLocCd = null;
	/* Column Info */
	private String amsTmlCd = null;
	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvBlVO() {}

	public BkgCstmsAdvBlVO(String ibflag, String pagerows, String cntCd, String blNo, String bkgNo, String vslCd, String skdVoyNo, String skdDirCd, String slanCd, String vslArrDt, String cstmsPolCd, String cstmsPodCd, String porCd, String polCd, String podCd, String podNodCd, String delCd, String delNodCd, String usaLstLocCd, String hubLocCd, String cstmsPortCd, String frobFlg, String actFileSkdDirCd, String mfStsCd, String cstmsLocCd, String pckQty, String amsPckTpCd, String cgoWgt, String wgtUtCd, String measQty, String measUtCd, String rcvTermCd, String deTermCd, String custToOrdFlg, String bdrFlg, String bdrDt, String bdrGdt, String bdrOfcCd, String bdrIfUsrId, String bdrIfDt, String bdrIfGdt, String caFlg, String caIssDt, String caNo, String scacCd, String cstmsFileTpCd, String mfNo, String fullMtyCd, String cstmsTrsmStsCd, String cstmsAckKeyNo, String cstmsAckRcvRsltCd, String cstmsAckProcRsltCd, String cstmsAckRjctCd, String cstmsAckRjctMsg, String cstmsAckRcvDt, String usrCmtCtnt, String ifFlg, String ifDt, String ifGdt, String diffRmk, String trspModId, String ibdLocGdsDesc, String cstmsMfTpCd, String mfSndDt, String mfSndGdt, String amdtSndDt, String amdtSndGdt, String preMfNo, String cstmsFileLocCd, String faxOfcCd, String faxCntCd, String faxCustSeq, String faxNo, String trspTpId, String inTzYdCd, String inTzYdNm, String inTzYdAddr, String inTzYdCtyNm, String inTzYdSteCd, String inTzYdCntCd, String inTzYdZipId, String prtFlg, String avcNoteTpId, String creUsrId, String creDt, String updUsrId, String updDt, String amsTmlCd) {
		this.ifDt = ifDt;
		this.cstmsAckRjctMsg = cstmsAckRjctMsg;
		this.actFileSkdDirCd = actFileSkdDirCd;
		this.usaLstLocCd = usaLstLocCd;
		this.vslCd = vslCd;
		this.cstmsFileTpCd = cstmsFileTpCd;
		this.frobFlg = frobFlg;
		this.inTzYdCntCd = inTzYdCntCd;
		this.ifGdt = ifGdt;
		this.inTzYdSteCd = inTzYdSteCd;
		this.preMfNo = preMfNo;
		this.blNo = blNo;
		this.usrCmtCtnt = usrCmtCtnt;
		this.prtFlg = prtFlg;
		this.pagerows = pagerows;
		this.trspModId = trspModId;
		this.polCd = polCd;
		this.inTzYdAddr = inTzYdAddr;
		this.cstmsAckKeyNo = cstmsAckKeyNo;
		this.faxOfcCd = faxOfcCd;
		this.cntCd = cntCd;
		this.amsPckTpCd = amsPckTpCd;
		this.wgtUtCd = wgtUtCd;
		this.cstmsPodCd = cstmsPodCd;
		this.delNodCd = delNodCd;
		this.custToOrdFlg = custToOrdFlg;
		this.bdrOfcCd = bdrOfcCd;
		this.updUsrId = updUsrId;
		this.cstmsAckRcvDt = cstmsAckRcvDt;
		this.cstmsPortCd = cstmsPortCd;
		this.cgoWgt = cgoWgt;
		this.cstmsLocCd = cstmsLocCd;
		this.amdtSndDt = amdtSndDt;
		this.delCd = delCd;
		this.skdVoyNo = skdVoyNo;
		this.ifFlg = ifFlg;
		this.vslArrDt = vslArrDt;
		this.podCd = podCd;
		this.caIssDt = caIssDt;
		this.creUsrId = creUsrId;
		this.cstmsAckRjctCd = cstmsAckRjctCd;
		this.podNodCd = podNodCd;
		this.bkgNo = bkgNo;
		this.amdtSndGdt = amdtSndGdt;
		this.inTzYdZipId = inTzYdZipId;
		this.cstmsFileLocCd = cstmsFileLocCd;
		this.bdrIfDt = bdrIfDt;
		this.faxNo = faxNo;
		this.fullMtyCd = fullMtyCd;
		this.bdrIfUsrId = bdrIfUsrId;
		this.porCd = porCd;
		this.cstmsPolCd = cstmsPolCd;
		this.mfNo = mfNo;
		this.bdrFlg = bdrFlg;
		this.creDt = creDt;
		this.avcNoteTpId = avcNoteTpId;
		this.mfStsCd = mfStsCd;
		this.cstmsMfTpCd = cstmsMfTpCd;
		this.ibflag = ibflag;
		this.faxCntCd = faxCntCd;
		this.scacCd = scacCd;
		this.cstmsAckRcvRsltCd = cstmsAckRcvRsltCd;
		this.mfSndDt = mfSndDt;
		this.measQty = measQty;
		this.cstmsAckProcRsltCd = cstmsAckProcRsltCd;
		this.pckQty = pckQty;
		this.bdrDt = bdrDt;
		this.caFlg = caFlg;
		this.inTzYdCtyNm = inTzYdCtyNm;
		this.rcvTermCd = rcvTermCd;
		this.faxCustSeq = faxCustSeq;
		this.measUtCd = measUtCd;
		this.bdrIfGdt = bdrIfGdt;
		this.updDt = updDt;
		this.inTzYdCd = inTzYdCd;
		this.trspTpId = trspTpId;
		this.cstmsTrsmStsCd = cstmsTrsmStsCd;
		this.bdrGdt = bdrGdt;
		this.skdDirCd = skdDirCd;
		this.inTzYdNm = inTzYdNm;
		this.deTermCd = deTermCd;
		this.mfSndGdt = mfSndGdt;
		this.ibdLocGdsDesc = ibdLocGdsDesc;
		this.diffRmk = diffRmk;
		this.slanCd = slanCd;
		this.caNo = caNo;
		this.hubLocCd = hubLocCd;
		this.amsTmlCd = amsTmlCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("if_dt", getIfDt());
		this.hashColumns.put("cstms_ack_rjct_msg", getCstmsAckRjctMsg());
		this.hashColumns.put("act_file_skd_dir_cd", getActFileSkdDirCd());
		this.hashColumns.put("usa_lst_loc_cd", getUsaLstLocCd());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("cstms_file_tp_cd", getCstmsFileTpCd());
		this.hashColumns.put("frob_flg", getFrobFlg());
		this.hashColumns.put("in_tz_yd_cnt_cd", getInTzYdCntCd());
		this.hashColumns.put("if_gdt", getIfGdt());
		this.hashColumns.put("in_tz_yd_ste_cd", getInTzYdSteCd());
		this.hashColumns.put("pre_mf_no", getPreMfNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("usr_cmt_ctnt", getUsrCmtCtnt());
		this.hashColumns.put("prt_flg", getPrtFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_mod_id", getTrspModId());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("in_tz_yd_addr", getInTzYdAddr());
		this.hashColumns.put("cstms_ack_key_no", getCstmsAckKeyNo());
		this.hashColumns.put("fax_ofc_cd", getFaxOfcCd());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("ams_pck_tp_cd", getAmsPckTpCd());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("cstms_pod_cd", getCstmsPodCd());
		this.hashColumns.put("del_nod_cd", getDelNodCd());
		this.hashColumns.put("cust_to_ord_flg", getCustToOrdFlg());
		this.hashColumns.put("bdr_ofc_cd", getBdrOfcCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cstms_ack_rcv_dt", getCstmsAckRcvDt());
		this.hashColumns.put("cstms_port_cd", getCstmsPortCd());
		this.hashColumns.put("cgo_wgt", getCgoWgt());
		this.hashColumns.put("cstms_loc_cd", getCstmsLocCd());
		this.hashColumns.put("amdt_snd_dt", getAmdtSndDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("if_flg", getIfFlg());
		this.hashColumns.put("vsl_arr_dt", getVslArrDt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("ca_iss_dt", getCaIssDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cstms_ack_rjct_cd", getCstmsAckRjctCd());
		this.hashColumns.put("pod_nod_cd", getPodNodCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("amdt_snd_gdt", getAmdtSndGdt());
		this.hashColumns.put("in_tz_yd_zip_id", getInTzYdZipId());
		this.hashColumns.put("cstms_file_loc_cd", getCstmsFileLocCd());
		this.hashColumns.put("bdr_if_dt", getBdrIfDt());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("bdr_if_usr_id", getBdrIfUsrId());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("cstms_pol_cd", getCstmsPolCd());
		this.hashColumns.put("mf_no", getMfNo());
		this.hashColumns.put("bdr_flg", getBdrFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("avc_note_tp_id", getAvcNoteTpId());
		this.hashColumns.put("mf_sts_cd", getMfStsCd());
		this.hashColumns.put("cstms_mf_tp_cd", getCstmsMfTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fax_cnt_cd", getFaxCntCd());
		this.hashColumns.put("scac_cd", getScacCd());
		this.hashColumns.put("cstms_ack_rcv_rslt_cd", getCstmsAckRcvRsltCd());
		this.hashColumns.put("mf_snd_dt", getMfSndDt());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("cstms_ack_proc_rslt_cd", getCstmsAckProcRsltCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("bdr_dt", getBdrDt());
		this.hashColumns.put("ca_flg", getCaFlg());
		this.hashColumns.put("in_tz_yd_cty_nm", getInTzYdCtyNm());
		this.hashColumns.put("rcv_term_cd", getRcvTermCd());
		this.hashColumns.put("fax_cust_seq", getFaxCustSeq());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("bdr_if_gdt", getBdrIfGdt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("in_tz_yd_cd", getInTzYdCd());
		this.hashColumns.put("trsp_tp_id", getTrspTpId());
		this.hashColumns.put("cstms_trsm_sts_cd", getCstmsTrsmStsCd());
		this.hashColumns.put("bdr_gdt", getBdrGdt());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("in_tz_yd_nm", getInTzYdNm());
		this.hashColumns.put("de_term_cd", getDeTermCd());
		this.hashColumns.put("mf_snd_gdt", getMfSndGdt());
		this.hashColumns.put("ibd_loc_gds_desc", getIbdLocGdsDesc());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("ca_no", getCaNo());
		this.hashColumns.put("hub_loc_cd", getHubLocCd());
		this.hashColumns.put("ams_tml_cd", getAmsTmlCd());		
		
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("if_dt", "ifDt");
		this.hashFields.put("cstms_ack_rjct_msg", "cstmsAckRjctMsg");
		this.hashFields.put("act_file_skd_dir_cd", "actFileSkdDirCd");
		this.hashFields.put("usa_lst_loc_cd", "usaLstLocCd");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("cstms_file_tp_cd", "cstmsFileTpCd");
		this.hashFields.put("frob_flg", "frobFlg");
		this.hashFields.put("in_tz_yd_cnt_cd", "inTzYdCntCd");
		this.hashFields.put("if_gdt", "ifGdt");
		this.hashFields.put("in_tz_yd_ste_cd", "inTzYdSteCd");
		this.hashFields.put("pre_mf_no", "preMfNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("usr_cmt_ctnt", "usrCmtCtnt");
		this.hashFields.put("prt_flg", "prtFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_mod_id", "trspModId");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("in_tz_yd_addr", "inTzYdAddr");
		this.hashFields.put("cstms_ack_key_no", "cstmsAckKeyNo");
		this.hashFields.put("fax_ofc_cd", "faxOfcCd");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("ams_pck_tp_cd", "amsPckTpCd");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("cstms_pod_cd", "cstmsPodCd");
		this.hashFields.put("del_nod_cd", "delNodCd");
		this.hashFields.put("cust_to_ord_flg", "custToOrdFlg");
		this.hashFields.put("bdr_ofc_cd", "bdrOfcCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cstms_ack_rcv_dt", "cstmsAckRcvDt");
		this.hashFields.put("cstms_port_cd", "cstmsPortCd");
		this.hashFields.put("cgo_wgt", "cgoWgt");
		this.hashFields.put("cstms_loc_cd", "cstmsLocCd");
		this.hashFields.put("amdt_snd_dt", "amdtSndDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("if_flg", "ifFlg");
		this.hashFields.put("vsl_arr_dt", "vslArrDt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("ca_iss_dt", "caIssDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cstms_ack_rjct_cd", "cstmsAckRjctCd");
		this.hashFields.put("pod_nod_cd", "podNodCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("amdt_snd_gdt", "amdtSndGdt");
		this.hashFields.put("in_tz_yd_zip_id", "inTzYdZipId");
		this.hashFields.put("cstms_file_loc_cd", "cstmsFileLocCd");
		this.hashFields.put("bdr_if_dt", "bdrIfDt");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("bdr_if_usr_id", "bdrIfUsrId");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("cstms_pol_cd", "cstmsPolCd");
		this.hashFields.put("mf_no", "mfNo");
		this.hashFields.put("bdr_flg", "bdrFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("avc_note_tp_id", "avcNoteTpId");
		this.hashFields.put("mf_sts_cd", "mfStsCd");
		this.hashFields.put("cstms_mf_tp_cd", "cstmsMfTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fax_cnt_cd", "faxCntCd");
		this.hashFields.put("scac_cd", "scacCd");
		this.hashFields.put("cstms_ack_rcv_rslt_cd", "cstmsAckRcvRsltCd");
		this.hashFields.put("mf_snd_dt", "mfSndDt");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("cstms_ack_proc_rslt_cd", "cstmsAckProcRsltCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("bdr_dt", "bdrDt");
		this.hashFields.put("ca_flg", "caFlg");
		this.hashFields.put("in_tz_yd_cty_nm", "inTzYdCtyNm");
		this.hashFields.put("rcv_term_cd", "rcvTermCd");
		this.hashFields.put("fax_cust_seq", "faxCustSeq");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("bdr_if_gdt", "bdrIfGdt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("in_tz_yd_cd", "inTzYdCd");
		this.hashFields.put("trsp_tp_id", "trspTpId");
		this.hashFields.put("cstms_trsm_sts_cd", "cstmsTrsmStsCd");
		this.hashFields.put("bdr_gdt", "bdrGdt");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("in_tz_yd_nm", "inTzYdNm");
		this.hashFields.put("de_term_cd", "deTermCd");
		this.hashFields.put("mf_snd_gdt", "mfSndGdt");
		this.hashFields.put("ibd_loc_gds_desc", "ibdLocGdsDesc");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("ca_no", "caNo");
		this.hashFields.put("hub_loc_cd", "hubLocCd");
		this.hashFields.put("ams_tml_cd", "amsTmlCd");		

		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ifDt
	 */
	public String getIfDt() {
		return this.ifDt;
	}
	
	/**
	 * Column Info
	 * @return cstmsAckRjctMsg
	 */
	public String getCstmsAckRjctMsg() {
		return this.cstmsAckRjctMsg;
	}
	
	/**
	 * Column Info
	 * @return actFileSkdDirCd
	 */
	public String getActFileSkdDirCd() {
		return this.actFileSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return usaLstLocCd
	 */
	public String getUsaLstLocCd() {
		return this.usaLstLocCd;
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
	 * @return cstmsFileTpCd
	 */
	public String getCstmsFileTpCd() {
		return this.cstmsFileTpCd;
	}
	
	/**
	 * Column Info
	 * @return frobFlg
	 */
	public String getFrobFlg() {
		return this.frobFlg;
	}
	
	/**
	 * Column Info
	 * @return inTzYdCntCd
	 */
	public String getInTzYdCntCd() {
		return this.inTzYdCntCd;
	}
	
	/**
	 * Column Info
	 * @return ifGdt
	 */
	public String getIfGdt() {
		return this.ifGdt;
	}
	
	/**
	 * Column Info
	 * @return inTzYdSteCd
	 */
	public String getInTzYdSteCd() {
		return this.inTzYdSteCd;
	}
	
	/**
	 * Column Info
	 * @return preMfNo
	 */
	public String getPreMfNo() {
		return this.preMfNo;
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
	 * @return usrCmtCtnt
	 */
	public String getUsrCmtCtnt() {
		return this.usrCmtCtnt;
	}
	
	/**
	 * Column Info
	 * @return prtFlg
	 */
	public String getPrtFlg() {
		return this.prtFlg;
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
	 * @return trspModId
	 */
	public String getTrspModId() {
		return this.trspModId;
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
	 * @return inTzYdAddr
	 */
	public String getInTzYdAddr() {
		return this.inTzYdAddr;
	}
	
	/**
	 * Column Info
	 * @return cstmsAckKeyNo
	 */
	public String getCstmsAckKeyNo() {
		return this.cstmsAckKeyNo;
	}
	
	/**
	 * Column Info
	 * @return faxOfcCd
	 */
	public String getFaxOfcCd() {
		return this.faxOfcCd;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return amsPckTpCd
	 */
	public String getAmsPckTpCd() {
		return this.amsPckTpCd;
	}
	
	/**
	 * Column Info
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsPodCd
	 */
	public String getCstmsPodCd() {
		return this.cstmsPodCd;
	}
	
	/**
	 * Column Info
	 * @return delNodCd
	 */
	public String getDelNodCd() {
		return this.delNodCd;
	}
	
	/**
	 * Column Info
	 * @return custToOrdFlg
	 */
	public String getCustToOrdFlg() {
		return this.custToOrdFlg;
	}
	
	/**
	 * Column Info
	 * @return bdrOfcCd
	 */
	public String getBdrOfcCd() {
		return this.bdrOfcCd;
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
	 * @return cstmsAckRcvDt
	 */
	public String getCstmsAckRcvDt() {
		return this.cstmsAckRcvDt;
	}
	
	/**
	 * Column Info
	 * @return cstmsPortCd
	 */
	public String getCstmsPortCd() {
		return this.cstmsPortCd;
	}
	
	/**
	 * Column Info
	 * @return cgoWgt
	 */
	public String getCgoWgt() {
		return this.cgoWgt;
	}
	
	/**
	 * Column Info
	 * @return cstmsLocCd
	 */
	public String getCstmsLocCd() {
		return this.cstmsLocCd;
	}
	
	/**
	 * Column Info
	 * @return amdtSndDt
	 */
	public String getAmdtSndDt() {
		return this.amdtSndDt;
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
	 * @return ifFlg
	 */
	public String getIfFlg() {
		return this.ifFlg;
	}
	
	/**
	 * Column Info
	 * @return vslArrDt
	 */
	public String getVslArrDt() {
		return this.vslArrDt;
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
	 * @return caIssDt
	 */
	public String getCaIssDt() {
		return this.caIssDt;
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
	 * @return cstmsAckRjctCd
	 */
	public String getCstmsAckRjctCd() {
		return this.cstmsAckRjctCd;
	}
	
	/**
	 * Column Info
	 * @return podNodCd
	 */
	public String getPodNodCd() {
		return this.podNodCd;
	}
	
	/**
	 * Column Info
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return amdtSndGdt
	 */
	public String getAmdtSndGdt() {
		return this.amdtSndGdt;
	}
	
	/**
	 * Column Info
	 * @return inTzYdZipId
	 */
	public String getInTzYdZipId() {
		return this.inTzYdZipId;
	}
	
	/**
	 * Column Info
	 * @return cstmsFileLocCd
	 */
	public String getCstmsFileLocCd() {
		return this.cstmsFileLocCd;
	}
	
	/**
	 * Column Info
	 * @return bdrIfDt
	 */
	public String getBdrIfDt() {
		return this.bdrIfDt;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
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
	 * @return bdrIfUsrId
	 */
	public String getBdrIfUsrId() {
		return this.bdrIfUsrId;
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
	 * @return cstmsPolCd
	 */
	public String getCstmsPolCd() {
		return this.cstmsPolCd;
	}
	
	/**
	 * Column Info
	 * @return mfNo
	 */
	public String getMfNo() {
		return this.mfNo;
	}
	
	/**
	 * Column Info
	 * @return bdrFlg
	 */
	public String getBdrFlg() {
		return this.bdrFlg;
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
	 * @return avcNoteTpId
	 */
	public String getAvcNoteTpId() {
		return this.avcNoteTpId;
	}
	
	/**
	 * Column Info
	 * @return mfStsCd
	 */
	public String getMfStsCd() {
		return this.mfStsCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsMfTpCd
	 */
	public String getCstmsMfTpCd() {
		return this.cstmsMfTpCd;
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
	 * @return faxCntCd
	 */
	public String getFaxCntCd() {
		return this.faxCntCd;
	}
	
	/**
	 * Column Info
	 * @return scacCd
	 */
	public String getScacCd() {
		return this.scacCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsAckRcvRsltCd
	 */
	public String getCstmsAckRcvRsltCd() {
		return this.cstmsAckRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @return mfSndDt
	 */
	public String getMfSndDt() {
		return this.mfSndDt;
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
	 * @return cstmsAckProcRsltCd
	 */
	public String getCstmsAckProcRsltCd() {
		return this.cstmsAckProcRsltCd;
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
	 * @return bdrDt
	 */
	public String getBdrDt() {
		return this.bdrDt;
	}
	
	/**
	 * Column Info
	 * @return caFlg
	 */
	public String getCaFlg() {
		return this.caFlg;
	}
	
	/**
	 * Column Info
	 * @return inTzYdCtyNm
	 */
	public String getInTzYdCtyNm() {
		return this.inTzYdCtyNm;
	}
	
	/**
	 * Column Info
	 * @return rcvTermCd
	 */
	public String getRcvTermCd() {
		return this.rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @return faxCustSeq
	 */
	public String getFaxCustSeq() {
		return this.faxCustSeq;
	}
	
	/**
	 * Column Info
	 * @return measUtCd
	 */
	public String getMeasUtCd() {
		return this.measUtCd;
	}
	
	/**
	 * Column Info
	 * @return bdrIfGdt
	 */
	public String getBdrIfGdt() {
		return this.bdrIfGdt;
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
	 * @return inTzYdCd
	 */
	public String getInTzYdCd() {
		return this.inTzYdCd;
	}
	
	/**
	 * Column Info
	 * @return trspTpId
	 */
	public String getTrspTpId() {
		return this.trspTpId;
	}
	
	/**
	 * Column Info
	 * @return cstmsTrsmStsCd
	 */
	public String getCstmsTrsmStsCd() {
		return this.cstmsTrsmStsCd;
	}
	
	/**
	 * Column Info
	 * @return bdrGdt
	 */
	public String getBdrGdt() {
		return this.bdrGdt;
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
	 * @return inTzYdNm
	 */
	public String getInTzYdNm() {
		return this.inTzYdNm;
	}
	
	/**
	 * Column Info
	 * @return deTermCd
	 */
	public String getDeTermCd() {
		return this.deTermCd;
	}
	
	/**
	 * Column Info
	 * @return mfSndGdt
	 */
	public String getMfSndGdt() {
		return this.mfSndGdt;
	}
	
	/**
	 * Column Info
	 * @return ibdLocGdsDesc
	 */
	public String getIbdLocGdsDesc() {
		return this.ibdLocGdsDesc;
	}
	
	/**
	 * Column Info
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
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
	 * @return caNo
	 */
	public String getCaNo() {
		return this.caNo;
	}
	
	/**
	 * Column Info
	 * @return hubLocCd
	 */
	public String getHubLocCd() {
		return this.hubLocCd;
	}

	/**
	 * Column Info
	 * @return amsTmlCd
	 */
	public String getAmsTmlCd() {
		return this.amsTmlCd;
	}	

	/**
	 * Column Info
	 * @param ifDt
	 */
	public void setIfDt(String ifDt) {
		this.ifDt = ifDt;
	}
	
	/**
	 * Column Info
	 * @param cstmsAckRjctMsg
	 */
	public void setCstmsAckRjctMsg(String cstmsAckRjctMsg) {
		this.cstmsAckRjctMsg = cstmsAckRjctMsg;
	}
	
	/**
	 * Column Info
	 * @param actFileSkdDirCd
	 */
	public void setActFileSkdDirCd(String actFileSkdDirCd) {
		this.actFileSkdDirCd = actFileSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param usaLstLocCd
	 */
	public void setUsaLstLocCd(String usaLstLocCd) {
		this.usaLstLocCd = usaLstLocCd;
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
	 * @param cstmsFileTpCd
	 */
	public void setCstmsFileTpCd(String cstmsFileTpCd) {
		this.cstmsFileTpCd = cstmsFileTpCd;
	}
	
	/**
	 * Column Info
	 * @param frobFlg
	 */
	public void setFrobFlg(String frobFlg) {
		this.frobFlg = frobFlg;
	}
	
	/**
	 * Column Info
	 * @param inTzYdCntCd
	 */
	public void setInTzYdCntCd(String inTzYdCntCd) {
		this.inTzYdCntCd = inTzYdCntCd;
	}
	
	/**
	 * Column Info
	 * @param ifGdt
	 */
	public void setIfGdt(String ifGdt) {
		this.ifGdt = ifGdt;
	}
	
	/**
	 * Column Info
	 * @param inTzYdSteCd
	 */
	public void setInTzYdSteCd(String inTzYdSteCd) {
		this.inTzYdSteCd = inTzYdSteCd;
	}
	
	/**
	 * Column Info
	 * @param preMfNo
	 */
	public void setPreMfNo(String preMfNo) {
		this.preMfNo = preMfNo;
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
	 * @param usrCmtCtnt
	 */
	public void setUsrCmtCtnt(String usrCmtCtnt) {
		this.usrCmtCtnt = usrCmtCtnt;
	}
	
	/**
	 * Column Info
	 * @param prtFlg
	 */
	public void setPrtFlg(String prtFlg) {
		this.prtFlg = prtFlg;
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
	 * @param trspModId
	 */
	public void setTrspModId(String trspModId) {
		this.trspModId = trspModId;
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
	 * @param inTzYdAddr
	 */
	public void setInTzYdAddr(String inTzYdAddr) {
		this.inTzYdAddr = inTzYdAddr;
	}
	
	/**
	 * Column Info
	 * @param cstmsAckKeyNo
	 */
	public void setCstmsAckKeyNo(String cstmsAckKeyNo) {
		this.cstmsAckKeyNo = cstmsAckKeyNo;
	}
	
	/**
	 * Column Info
	 * @param faxOfcCd
	 */
	public void setFaxOfcCd(String faxOfcCd) {
		this.faxOfcCd = faxOfcCd;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param amsPckTpCd
	 */
	public void setAmsPckTpCd(String amsPckTpCd) {
		this.amsPckTpCd = amsPckTpCd;
	}
	
	/**
	 * Column Info
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsPodCd
	 */
	public void setCstmsPodCd(String cstmsPodCd) {
		this.cstmsPodCd = cstmsPodCd;
	}
	
	/**
	 * Column Info
	 * @param delNodCd
	 */
	public void setDelNodCd(String delNodCd) {
		this.delNodCd = delNodCd;
	}
	
	/**
	 * Column Info
	 * @param custToOrdFlg
	 */
	public void setCustToOrdFlg(String custToOrdFlg) {
		this.custToOrdFlg = custToOrdFlg;
	}
	
	/**
	 * Column Info
	 * @param bdrOfcCd
	 */
	public void setBdrOfcCd(String bdrOfcCd) {
		this.bdrOfcCd = bdrOfcCd;
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
	 * @param cstmsAckRcvDt
	 */
	public void setCstmsAckRcvDt(String cstmsAckRcvDt) {
		this.cstmsAckRcvDt = cstmsAckRcvDt;
	}
	
	/**
	 * Column Info
	 * @param cstmsPortCd
	 */
	public void setCstmsPortCd(String cstmsPortCd) {
		this.cstmsPortCd = cstmsPortCd;
	}
	
	/**
	 * Column Info
	 * @param cgoWgt
	 */
	public void setCgoWgt(String cgoWgt) {
		this.cgoWgt = cgoWgt;
	}
	
	/**
	 * Column Info
	 * @param cstmsLocCd
	 */
	public void setCstmsLocCd(String cstmsLocCd) {
		this.cstmsLocCd = cstmsLocCd;
	}
	
	/**
	 * Column Info
	 * @param amdtSndDt
	 */
	public void setAmdtSndDt(String amdtSndDt) {
		this.amdtSndDt = amdtSndDt;
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
	 * @param ifFlg
	 */
	public void setIfFlg(String ifFlg) {
		this.ifFlg = ifFlg;
	}
	
	/**
	 * Column Info
	 * @param vslArrDt
	 */
	public void setVslArrDt(String vslArrDt) {
		this.vslArrDt = vslArrDt;
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
	 * @param caIssDt
	 */
	public void setCaIssDt(String caIssDt) {
		this.caIssDt = caIssDt;
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
	 * @param cstmsAckRjctCd
	 */
	public void setCstmsAckRjctCd(String cstmsAckRjctCd) {
		this.cstmsAckRjctCd = cstmsAckRjctCd;
	}
	
	/**
	 * Column Info
	 * @param podNodCd
	 */
	public void setPodNodCd(String podNodCd) {
		this.podNodCd = podNodCd;
	}
	
	/**
	 * Column Info
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param amdtSndGdt
	 */
	public void setAmdtSndGdt(String amdtSndGdt) {
		this.amdtSndGdt = amdtSndGdt;
	}
	
	/**
	 * Column Info
	 * @param inTzYdZipId
	 */
	public void setInTzYdZipId(String inTzYdZipId) {
		this.inTzYdZipId = inTzYdZipId;
	}
	
	/**
	 * Column Info
	 * @param cstmsFileLocCd
	 */
	public void setCstmsFileLocCd(String cstmsFileLocCd) {
		this.cstmsFileLocCd = cstmsFileLocCd;
	}
	
	/**
	 * Column Info
	 * @param bdrIfDt
	 */
	public void setBdrIfDt(String bdrIfDt) {
		this.bdrIfDt = bdrIfDt;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
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
	 * @param bdrIfUsrId
	 */
	public void setBdrIfUsrId(String bdrIfUsrId) {
		this.bdrIfUsrId = bdrIfUsrId;
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
	 * @param cstmsPolCd
	 */
	public void setCstmsPolCd(String cstmsPolCd) {
		this.cstmsPolCd = cstmsPolCd;
	}
	
	/**
	 * Column Info
	 * @param mfNo
	 */
	public void setMfNo(String mfNo) {
		this.mfNo = mfNo;
	}
	
	/**
	 * Column Info
	 * @param bdrFlg
	 */
	public void setBdrFlg(String bdrFlg) {
		this.bdrFlg = bdrFlg;
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
	 * @param avcNoteTpId
	 */
	public void setAvcNoteTpId(String avcNoteTpId) {
		this.avcNoteTpId = avcNoteTpId;
	}
	
	/**
	 * Column Info
	 * @param mfStsCd
	 */
	public void setMfStsCd(String mfStsCd) {
		this.mfStsCd = mfStsCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsMfTpCd
	 */
	public void setCstmsMfTpCd(String cstmsMfTpCd) {
		this.cstmsMfTpCd = cstmsMfTpCd;
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
	 * @param faxCntCd
	 */
	public void setFaxCntCd(String faxCntCd) {
		this.faxCntCd = faxCntCd;
	}
	
	/**
	 * Column Info
	 * @param scacCd
	 */
	public void setScacCd(String scacCd) {
		this.scacCd = scacCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsAckRcvRsltCd
	 */
	public void setCstmsAckRcvRsltCd(String cstmsAckRcvRsltCd) {
		this.cstmsAckRcvRsltCd = cstmsAckRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @param mfSndDt
	 */
	public void setMfSndDt(String mfSndDt) {
		this.mfSndDt = mfSndDt;
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
	 * @param cstmsAckProcRsltCd
	 */
	public void setCstmsAckProcRsltCd(String cstmsAckProcRsltCd) {
		this.cstmsAckProcRsltCd = cstmsAckProcRsltCd;
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
	 * @param bdrDt
	 */
	public void setBdrDt(String bdrDt) {
		this.bdrDt = bdrDt;
	}
	
	/**
	 * Column Info
	 * @param caFlg
	 */
	public void setCaFlg(String caFlg) {
		this.caFlg = caFlg;
	}
	
	/**
	 * Column Info
	 * @param inTzYdCtyNm
	 */
	public void setInTzYdCtyNm(String inTzYdCtyNm) {
		this.inTzYdCtyNm = inTzYdCtyNm;
	}
	
	/**
	 * Column Info
	 * @param rcvTermCd
	 */
	public void setRcvTermCd(String rcvTermCd) {
		this.rcvTermCd = rcvTermCd;
	}
	
	/**
	 * Column Info
	 * @param faxCustSeq
	 */
	public void setFaxCustSeq(String faxCustSeq) {
		this.faxCustSeq = faxCustSeq;
	}
	
	/**
	 * Column Info
	 * @param measUtCd
	 */
	public void setMeasUtCd(String measUtCd) {
		this.measUtCd = measUtCd;
	}
	
	/**
	 * Column Info
	 * @param bdrIfGdt
	 */
	public void setBdrIfGdt(String bdrIfGdt) {
		this.bdrIfGdt = bdrIfGdt;
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
	 * @param inTzYdCd
	 */
	public void setInTzYdCd(String inTzYdCd) {
		this.inTzYdCd = inTzYdCd;
	}
	
	/**
	 * Column Info
	 * @param trspTpId
	 */
	public void setTrspTpId(String trspTpId) {
		this.trspTpId = trspTpId;
	}
	
	/**
	 * Column Info
	 * @param cstmsTrsmStsCd
	 */
	public void setCstmsTrsmStsCd(String cstmsTrsmStsCd) {
		this.cstmsTrsmStsCd = cstmsTrsmStsCd;
	}
	
	/**
	 * Column Info
	 * @param bdrGdt
	 */
	public void setBdrGdt(String bdrGdt) {
		this.bdrGdt = bdrGdt;
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
	 * @param inTzYdNm
	 */
	public void setInTzYdNm(String inTzYdNm) {
		this.inTzYdNm = inTzYdNm;
	}
	
	/**
	 * Column Info
	 * @param deTermCd
	 */
	public void setDeTermCd(String deTermCd) {
		this.deTermCd = deTermCd;
	}
	
	/**
	 * Column Info
	 * @param mfSndGdt
	 */
	public void setMfSndGdt(String mfSndGdt) {
		this.mfSndGdt = mfSndGdt;
	}
	
	/**
	 * Column Info
	 * @param ibdLocGdsDesc
	 */
	public void setIbdLocGdsDesc(String ibdLocGdsDesc) {
		this.ibdLocGdsDesc = ibdLocGdsDesc;
	}
	
	/**
	 * Column Info
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
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
	 * @param caNo
	 */
	public void setCaNo(String caNo) {
		this.caNo = caNo;
	}
	
	/**
	 * Column Info
	 * @param hubLocCd
	 */
	public void setHubLocCd(String hubLocCd) {
		this.hubLocCd = hubLocCd;
	}
	
	/**
	 * Column Info
	 * @param amsTmlCd
	 */
	public void setAmsTmlCd(String amsTmlCd) {
		this.amsTmlCd = amsTmlCd;
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
		setIfDt(JSPUtil.getParameter(request, prefix + "if_dt", ""));
		setCstmsAckRjctMsg(JSPUtil.getParameter(request, prefix + "cstms_ack_rjct_msg", ""));
		setActFileSkdDirCd(JSPUtil.getParameter(request, prefix + "act_file_skd_dir_cd", ""));
		setUsaLstLocCd(JSPUtil.getParameter(request, prefix + "usa_lst_loc_cd", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setCstmsFileTpCd(JSPUtil.getParameter(request, prefix + "cstms_file_tp_cd", ""));
		setFrobFlg(JSPUtil.getParameter(request, prefix + "frob_flg", ""));
		setInTzYdCntCd(JSPUtil.getParameter(request, prefix + "in_tz_yd_cnt_cd", ""));
		setIfGdt(JSPUtil.getParameter(request, prefix + "if_gdt", ""));
		setInTzYdSteCd(JSPUtil.getParameter(request, prefix + "in_tz_yd_ste_cd", ""));
		setPreMfNo(JSPUtil.getParameter(request, prefix + "pre_mf_no", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setUsrCmtCtnt(JSPUtil.getParameter(request, prefix + "usr_cmt_ctnt", ""));
		setPrtFlg(JSPUtil.getParameter(request, prefix + "prt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setTrspModId(JSPUtil.getParameter(request, prefix + "trsp_mod_id", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setInTzYdAddr(JSPUtil.getParameter(request, prefix + "in_tz_yd_addr", ""));
		setCstmsAckKeyNo(JSPUtil.getParameter(request, prefix + "cstms_ack_key_no", ""));
		setFaxOfcCd(JSPUtil.getParameter(request, prefix + "fax_ofc_cd", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setAmsPckTpCd(JSPUtil.getParameter(request, prefix + "ams_pck_tp_cd", ""));
		setWgtUtCd(JSPUtil.getParameter(request, prefix + "wgt_ut_cd", ""));
		setCstmsPodCd(JSPUtil.getParameter(request, prefix + "cstms_pod_cd", ""));
		setDelNodCd(JSPUtil.getParameter(request, prefix + "del_nod_cd", ""));
		setCustToOrdFlg(JSPUtil.getParameter(request, prefix + "cust_to_ord_flg", ""));
		setBdrOfcCd(JSPUtil.getParameter(request, prefix + "bdr_ofc_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setCstmsAckRcvDt(JSPUtil.getParameter(request, prefix + "cstms_ack_rcv_dt", ""));
		setCstmsPortCd(JSPUtil.getParameter(request, prefix + "cstms_port_cd", ""));
		setCgoWgt(JSPUtil.getParameter(request, prefix + "cgo_wgt", ""));
		setCstmsLocCd(JSPUtil.getParameter(request, prefix + "cstms_loc_cd", ""));
		setAmdtSndDt(JSPUtil.getParameter(request, prefix + "amdt_snd_dt", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setIfFlg(JSPUtil.getParameter(request, prefix + "if_flg", ""));
		setVslArrDt(JSPUtil.getParameter(request, prefix + "vsl_arr_dt", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setCaIssDt(JSPUtil.getParameter(request, prefix + "ca_iss_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCstmsAckRjctCd(JSPUtil.getParameter(request, prefix + "cstms_ack_rjct_cd", ""));
		setPodNodCd(JSPUtil.getParameter(request, prefix + "pod_nod_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setAmdtSndGdt(JSPUtil.getParameter(request, prefix + "amdt_snd_gdt", ""));
		setInTzYdZipId(JSPUtil.getParameter(request, prefix + "in_tz_yd_zip_id", ""));
		setCstmsFileLocCd(JSPUtil.getParameter(request, prefix + "cstms_file_loc_cd", ""));
		setBdrIfDt(JSPUtil.getParameter(request, prefix + "bdr_if_dt", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
		setFullMtyCd(JSPUtil.getParameter(request, prefix + "full_mty_cd", ""));
		setBdrIfUsrId(JSPUtil.getParameter(request, prefix + "bdr_if_usr_id", ""));
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setCstmsPolCd(JSPUtil.getParameter(request, prefix + "cstms_pol_cd", ""));
		setMfNo(JSPUtil.getParameter(request, prefix + "mf_no", ""));
		setBdrFlg(JSPUtil.getParameter(request, prefix + "bdr_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setAvcNoteTpId(JSPUtil.getParameter(request, prefix + "avc_note_tp_id", ""));
		setMfStsCd(JSPUtil.getParameter(request, prefix + "mf_sts_cd", ""));
		setCstmsMfTpCd(JSPUtil.getParameter(request, prefix + "cstms_mf_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setFaxCntCd(JSPUtil.getParameter(request, prefix + "fax_cnt_cd", ""));
		setScacCd(JSPUtil.getParameter(request, prefix + "scac_cd", ""));
		setCstmsAckRcvRsltCd(JSPUtil.getParameter(request, prefix + "cstms_ack_rcv_rslt_cd", ""));
		setMfSndDt(JSPUtil.getParameter(request, prefix + "mf_snd_dt", ""));
		setMeasQty(JSPUtil.getParameter(request, prefix + "meas_qty", ""));
		setCstmsAckProcRsltCd(JSPUtil.getParameter(request, prefix + "cstms_ack_proc_rslt_cd", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setBdrDt(JSPUtil.getParameter(request, prefix + "bdr_dt", ""));
		setCaFlg(JSPUtil.getParameter(request, prefix + "ca_flg", ""));
		setInTzYdCtyNm(JSPUtil.getParameter(request, prefix + "in_tz_yd_cty_nm", ""));
		setRcvTermCd(JSPUtil.getParameter(request, prefix + "rcv_term_cd", ""));
		setFaxCustSeq(JSPUtil.getParameter(request, prefix + "fax_cust_seq", ""));
		setMeasUtCd(JSPUtil.getParameter(request, prefix + "meas_ut_cd", ""));
		setBdrIfGdt(JSPUtil.getParameter(request, prefix + "bdr_if_gdt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setInTzYdCd(JSPUtil.getParameter(request, prefix + "in_tz_yd_cd", ""));
		setTrspTpId(JSPUtil.getParameter(request, prefix + "trsp_tp_id", ""));
		setCstmsTrsmStsCd(JSPUtil.getParameter(request, prefix + "cstms_trsm_sts_cd", ""));
		setBdrGdt(JSPUtil.getParameter(request, prefix + "bdr_gdt", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setInTzYdNm(JSPUtil.getParameter(request, prefix + "in_tz_yd_nm", ""));
		setDeTermCd(JSPUtil.getParameter(request, prefix + "de_term_cd", ""));
		setMfSndGdt(JSPUtil.getParameter(request, prefix + "mf_snd_gdt", ""));
		setIbdLocGdsDesc(JSPUtil.getParameter(request, prefix + "ibd_loc_gds_desc", ""));
		setDiffRmk(JSPUtil.getParameter(request, prefix + "diff_rmk", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setCaNo(JSPUtil.getParameter(request, prefix + "ca_no", ""));
		setHubLocCd(JSPUtil.getParameter(request, prefix + "hub_loc_cd", ""));
		setAmsTmlCd(JSPUtil.getParameter(request, prefix + "ams_tml_cd", ""));		
		
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAdvBlVO[]
	 */
	public BkgCstmsAdvBlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAdvBlVO[]
	 */
	public BkgCstmsAdvBlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvBlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ifDt = (JSPUtil.getParameter(request, prefix	+ "if_dt", length));
			String[] cstmsAckRjctMsg = (JSPUtil.getParameter(request, prefix	+ "cstms_ack_rjct_msg", length));
			String[] actFileSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "act_file_skd_dir_cd", length));
			String[] usaLstLocCd = (JSPUtil.getParameter(request, prefix	+ "usa_lst_loc_cd", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] cstmsFileTpCd = (JSPUtil.getParameter(request, prefix	+ "cstms_file_tp_cd", length));
			String[] frobFlg = (JSPUtil.getParameter(request, prefix	+ "frob_flg", length));
			String[] inTzYdCntCd = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_cnt_cd", length));
			String[] ifGdt = (JSPUtil.getParameter(request, prefix	+ "if_gdt", length));
			String[] inTzYdSteCd = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_ste_cd", length));
			String[] preMfNo = (JSPUtil.getParameter(request, prefix	+ "pre_mf_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] usrCmtCtnt = (JSPUtil.getParameter(request, prefix	+ "usr_cmt_ctnt", length));
			String[] prtFlg = (JSPUtil.getParameter(request, prefix	+ "prt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspModId = (JSPUtil.getParameter(request, prefix	+ "trsp_mod_id", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] inTzYdAddr = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_addr", length));
			String[] cstmsAckKeyNo = (JSPUtil.getParameter(request, prefix	+ "cstms_ack_key_no", length));
			String[] faxOfcCd = (JSPUtil.getParameter(request, prefix	+ "fax_ofc_cd", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] amsPckTpCd = (JSPUtil.getParameter(request, prefix	+ "ams_pck_tp_cd", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] cstmsPodCd = (JSPUtil.getParameter(request, prefix	+ "cstms_pod_cd", length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd", length));
			String[] custToOrdFlg = (JSPUtil.getParameter(request, prefix	+ "cust_to_ord_flg", length));
			String[] bdrOfcCd = (JSPUtil.getParameter(request, prefix	+ "bdr_ofc_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] cstmsAckRcvDt = (JSPUtil.getParameter(request, prefix	+ "cstms_ack_rcv_dt", length));
			String[] cstmsPortCd = (JSPUtil.getParameter(request, prefix	+ "cstms_port_cd", length));
			String[] cgoWgt = (JSPUtil.getParameter(request, prefix	+ "cgo_wgt", length));
			String[] cstmsLocCd = (JSPUtil.getParameter(request, prefix	+ "cstms_loc_cd", length));
			String[] amdtSndDt = (JSPUtil.getParameter(request, prefix	+ "amdt_snd_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] ifFlg = (JSPUtil.getParameter(request, prefix	+ "if_flg", length));
			String[] vslArrDt = (JSPUtil.getParameter(request, prefix	+ "vsl_arr_dt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] caIssDt = (JSPUtil.getParameter(request, prefix	+ "ca_iss_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cstmsAckRjctCd = (JSPUtil.getParameter(request, prefix	+ "cstms_ack_rjct_cd", length));
			String[] podNodCd = (JSPUtil.getParameter(request, prefix	+ "pod_nod_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] amdtSndGdt = (JSPUtil.getParameter(request, prefix	+ "amdt_snd_gdt", length));
			String[] inTzYdZipId = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_zip_id", length));
			String[] cstmsFileLocCd = (JSPUtil.getParameter(request, prefix	+ "cstms_file_loc_cd", length));
			String[] bdrIfDt = (JSPUtil.getParameter(request, prefix	+ "bdr_if_dt", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] bdrIfUsrId = (JSPUtil.getParameter(request, prefix	+ "bdr_if_usr_id", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] cstmsPolCd = (JSPUtil.getParameter(request, prefix	+ "cstms_pol_cd", length));
			String[] mfNo = (JSPUtil.getParameter(request, prefix	+ "mf_no", length));
			String[] bdrFlg = (JSPUtil.getParameter(request, prefix	+ "bdr_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] avcNoteTpId = (JSPUtil.getParameter(request, prefix	+ "avc_note_tp_id", length));
			String[] mfStsCd = (JSPUtil.getParameter(request, prefix	+ "mf_sts_cd", length));
			String[] cstmsMfTpCd = (JSPUtil.getParameter(request, prefix	+ "cstms_mf_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] faxCntCd = (JSPUtil.getParameter(request, prefix	+ "fax_cnt_cd", length));
			String[] scacCd = (JSPUtil.getParameter(request, prefix	+ "scac_cd", length));
			String[] cstmsAckRcvRsltCd = (JSPUtil.getParameter(request, prefix	+ "cstms_ack_rcv_rslt_cd", length));
			String[] mfSndDt = (JSPUtil.getParameter(request, prefix	+ "mf_snd_dt", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] cstmsAckProcRsltCd = (JSPUtil.getParameter(request, prefix	+ "cstms_ack_proc_rslt_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] bdrDt = (JSPUtil.getParameter(request, prefix	+ "bdr_dt", length));
			String[] caFlg = (JSPUtil.getParameter(request, prefix	+ "ca_flg", length));
			String[] inTzYdCtyNm = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_cty_nm", length));
			String[] rcvTermCd = (JSPUtil.getParameter(request, prefix	+ "rcv_term_cd", length));
			String[] faxCustSeq = (JSPUtil.getParameter(request, prefix	+ "fax_cust_seq", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] bdrIfGdt = (JSPUtil.getParameter(request, prefix	+ "bdr_if_gdt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] inTzYdCd = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_cd", length));
			String[] trspTpId = (JSPUtil.getParameter(request, prefix	+ "trsp_tp_id", length));
			String[] cstmsTrsmStsCd = (JSPUtil.getParameter(request, prefix	+ "cstms_trsm_sts_cd", length));
			String[] bdrGdt = (JSPUtil.getParameter(request, prefix	+ "bdr_gdt", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] inTzYdNm = (JSPUtil.getParameter(request, prefix	+ "in_tz_yd_nm", length));
			String[] deTermCd = (JSPUtil.getParameter(request, prefix	+ "de_term_cd", length));
			String[] mfSndGdt = (JSPUtil.getParameter(request, prefix	+ "mf_snd_gdt", length));
			String[] ibdLocGdsDesc = (JSPUtil.getParameter(request, prefix	+ "ibd_loc_gds_desc", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] caNo = (JSPUtil.getParameter(request, prefix	+ "ca_no", length));
			String[] hubLocCd = (JSPUtil.getParameter(request, prefix	+ "hub_loc_cd", length));
			String[] amsTmlCd = (JSPUtil.getParameter(request, prefix	+ "ams_tml_cd", length));			
						
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvBlVO();
				if (ifDt[i] != null)
					model.setIfDt(ifDt[i]);
				if (cstmsAckRjctMsg[i] != null)
					model.setCstmsAckRjctMsg(cstmsAckRjctMsg[i]);
				if (actFileSkdDirCd[i] != null)
					model.setActFileSkdDirCd(actFileSkdDirCd[i]);
				if (usaLstLocCd[i] != null)
					model.setUsaLstLocCd(usaLstLocCd[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (cstmsFileTpCd[i] != null)
					model.setCstmsFileTpCd(cstmsFileTpCd[i]);
				if (frobFlg[i] != null)
					model.setFrobFlg(frobFlg[i]);
				if (inTzYdCntCd[i] != null)
					model.setInTzYdCntCd(inTzYdCntCd[i]);
				if (ifGdt[i] != null)
					model.setIfGdt(ifGdt[i]);
				if (inTzYdSteCd[i] != null)
					model.setInTzYdSteCd(inTzYdSteCd[i]);
				if (preMfNo[i] != null)
					model.setPreMfNo(preMfNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (usrCmtCtnt[i] != null)
					model.setUsrCmtCtnt(usrCmtCtnt[i]);
				if (prtFlg[i] != null)
					model.setPrtFlg(prtFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspModId[i] != null)
					model.setTrspModId(trspModId[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (inTzYdAddr[i] != null)
					model.setInTzYdAddr(inTzYdAddr[i]);
				if (cstmsAckKeyNo[i] != null)
					model.setCstmsAckKeyNo(cstmsAckKeyNo[i]);
				if (faxOfcCd[i] != null)
					model.setFaxOfcCd(faxOfcCd[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (amsPckTpCd[i] != null)
					model.setAmsPckTpCd(amsPckTpCd[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (cstmsPodCd[i] != null)
					model.setCstmsPodCd(cstmsPodCd[i]);
				if (delNodCd[i] != null)
					model.setDelNodCd(delNodCd[i]);
				if (custToOrdFlg[i] != null)
					model.setCustToOrdFlg(custToOrdFlg[i]);
				if (bdrOfcCd[i] != null)
					model.setBdrOfcCd(bdrOfcCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cstmsAckRcvDt[i] != null)
					model.setCstmsAckRcvDt(cstmsAckRcvDt[i]);
				if (cstmsPortCd[i] != null)
					model.setCstmsPortCd(cstmsPortCd[i]);
				if (cgoWgt[i] != null)
					model.setCgoWgt(cgoWgt[i]);
				if (cstmsLocCd[i] != null)
					model.setCstmsLocCd(cstmsLocCd[i]);
				if (amdtSndDt[i] != null)
					model.setAmdtSndDt(amdtSndDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (ifFlg[i] != null)
					model.setIfFlg(ifFlg[i]);
				if (vslArrDt[i] != null)
					model.setVslArrDt(vslArrDt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (caIssDt[i] != null)
					model.setCaIssDt(caIssDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cstmsAckRjctCd[i] != null)
					model.setCstmsAckRjctCd(cstmsAckRjctCd[i]);
				if (podNodCd[i] != null)
					model.setPodNodCd(podNodCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (amdtSndGdt[i] != null)
					model.setAmdtSndGdt(amdtSndGdt[i]);
				if (inTzYdZipId[i] != null)
					model.setInTzYdZipId(inTzYdZipId[i]);
				if (cstmsFileLocCd[i] != null)
					model.setCstmsFileLocCd(cstmsFileLocCd[i]);
				if (bdrIfDt[i] != null)
					model.setBdrIfDt(bdrIfDt[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (bdrIfUsrId[i] != null)
					model.setBdrIfUsrId(bdrIfUsrId[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (cstmsPolCd[i] != null)
					model.setCstmsPolCd(cstmsPolCd[i]);
				if (mfNo[i] != null)
					model.setMfNo(mfNo[i]);
				if (bdrFlg[i] != null)
					model.setBdrFlg(bdrFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (avcNoteTpId[i] != null)
					model.setAvcNoteTpId(avcNoteTpId[i]);
				if (mfStsCd[i] != null)
					model.setMfStsCd(mfStsCd[i]);
				if (cstmsMfTpCd[i] != null)
					model.setCstmsMfTpCd(cstmsMfTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (faxCntCd[i] != null)
					model.setFaxCntCd(faxCntCd[i]);
				if (scacCd[i] != null)
					model.setScacCd(scacCd[i]);
				if (cstmsAckRcvRsltCd[i] != null)
					model.setCstmsAckRcvRsltCd(cstmsAckRcvRsltCd[i]);
				if (mfSndDt[i] != null)
					model.setMfSndDt(mfSndDt[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (cstmsAckProcRsltCd[i] != null)
					model.setCstmsAckProcRsltCd(cstmsAckProcRsltCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (bdrDt[i] != null)
					model.setBdrDt(bdrDt[i]);
				if (caFlg[i] != null)
					model.setCaFlg(caFlg[i]);
				if (inTzYdCtyNm[i] != null)
					model.setInTzYdCtyNm(inTzYdCtyNm[i]);
				if (rcvTermCd[i] != null)
					model.setRcvTermCd(rcvTermCd[i]);
				if (faxCustSeq[i] != null)
					model.setFaxCustSeq(faxCustSeq[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (bdrIfGdt[i] != null)
					model.setBdrIfGdt(bdrIfGdt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (inTzYdCd[i] != null)
					model.setInTzYdCd(inTzYdCd[i]);
				if (trspTpId[i] != null)
					model.setTrspTpId(trspTpId[i]);
				if (cstmsTrsmStsCd[i] != null)
					model.setCstmsTrsmStsCd(cstmsTrsmStsCd[i]);
				if (bdrGdt[i] != null)
					model.setBdrGdt(bdrGdt[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (inTzYdNm[i] != null)
					model.setInTzYdNm(inTzYdNm[i]);
				if (deTermCd[i] != null)
					model.setDeTermCd(deTermCd[i]);
				if (mfSndGdt[i] != null)
					model.setMfSndGdt(mfSndGdt[i]);
				if (ibdLocGdsDesc[i] != null)
					model.setIbdLocGdsDesc(ibdLocGdsDesc[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (caNo[i] != null)
					model.setCaNo(caNo[i]);
				if (hubLocCd[i] != null)
					model.setHubLocCd(hubLocCd[i]);
				if (amsTmlCd[i] != null)
					model.setAmsTmlCd(amsTmlCd[i]);
								
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvBlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAdvBlVO[]
	 */
	public BkgCstmsAdvBlVO[] getBkgCstmsAdvBlVOs(){
		BkgCstmsAdvBlVO[] vos = (BkgCstmsAdvBlVO[])models.toArray(new BkgCstmsAdvBlVO[models.size()]);
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
		this.ifDt = this.ifDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAckRjctMsg = this.cstmsAckRjctMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actFileSkdDirCd = this.actFileSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaLstLocCd = this.usaLstLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsFileTpCd = this.cstmsFileTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frobFlg = this.frobFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdCntCd = this.inTzYdCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifGdt = this.ifGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdSteCd = this.inTzYdSteCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preMfNo = this.preMfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrCmtCtnt = this.usrCmtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prtFlg = this.prtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspModId = this.trspModId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdAddr = this.inTzYdAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAckKeyNo = this.cstmsAckKeyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxOfcCd = this.faxOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsPckTpCd = this.amsPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPodCd = this.cstmsPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNodCd = this.delNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custToOrdFlg = this.custToOrdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrOfcCd = this.bdrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAckRcvDt = this.cstmsAckRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPortCd = this.cstmsPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoWgt = this.cgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsLocCd = this.cstmsLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSndDt = this.amdtSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifFlg = this.ifFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslArrDt = this.vslArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caIssDt = this.caIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAckRjctCd = this.cstmsAckRjctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNodCd = this.podNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSndGdt = this.amdtSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdZipId = this.inTzYdZipId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsFileLocCd = this.cstmsFileLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrIfDt = this.bdrIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrIfUsrId = this.bdrIfUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPolCd = this.cstmsPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfNo = this.mfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrFlg = this.bdrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avcNoteTpId = this.avcNoteTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfStsCd = this.mfStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsMfTpCd = this.cstmsMfTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxCntCd = this.faxCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scacCd = this.scacCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAckRcvRsltCd = this.cstmsAckRcvRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndDt = this.mfSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsAckProcRsltCd = this.cstmsAckProcRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrDt = this.bdrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caFlg = this.caFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdCtyNm = this.inTzYdCtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvTermCd = this.rcvTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxCustSeq = this.faxCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrIfGdt = this.bdrIfGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdCd = this.inTzYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspTpId = this.trspTpId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsTrsmStsCd = this.cstmsTrsmStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdrGdt = this.bdrGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inTzYdNm = this.inTzYdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deTermCd = this.deTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSndGdt = this.mfSndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdLocGdsDesc = this.ibdLocGdsDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caNo = this.caNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hubLocCd = this.hubLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amsTmlCd = this.amsTmlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");		
		
	}
}
