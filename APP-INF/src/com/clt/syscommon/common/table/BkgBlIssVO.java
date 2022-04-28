/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgBlIssVO.java
*@FileTitle : BkgBlIssVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.17
*@LastModifier : 이남경
*@LastVersion : 1.0
* 2009.11.17 이남경 
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
 * @author 이남경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgBlIssVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgBlIssVO> models = new ArrayList<BkgBlIssVO>();
	
	/* Column Info */
	private String oblRtInclKnt = null;
	/* Column Info */
	private String oblInetPrnDt = null;
	/* Column Info */
	private String nonNegoRtXcldKnt = null;
	/* Column Info */
	private String blRdyFlg = null;
	/* Column Info */
	private String oblPrnFlg = null;
	/* Column Info */
	private String oblRtXcldKnt = null;
	/* Column Info */
	private String orgPpdRcvUpdOfcCd = null;
	/* Column Info */
	private String orgN3ptyPpdCd = null;
	/* Column Info */
	private String oblIssDt = null;
	/* Column Info */
	private String rqstIssDt = null;
	/* Column Info */
	private String ibdDocRcvOfcCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String orgN3ptyPpdUpdDt = null;
	/* Column Info */
	private String destN3ptyCltUpdUsrId = null;
	/* Column Info */
	private String oblRdemDt = null;
	/* Column Info */
	private String oblInetPrnGdt = null;
	/* Column Info */
	private String oblIssUsrId = null;
	/* Column Info */
	private String cstmsCntrExpDt = null;
	/* Column Info */
	private String blRdyDt = null;
	/* Column Info */
	private String ibdDocRcvUsrId = null;
	/* Column Info */
	private String blRdyUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String oblIssOfcCd = null;
	/* Column Info */
	private String orgPpdRcvUpdUsrId = null;
	/* Column Info */
	private String nonNegoRtInclKnt = null;
	/* Column Info */
	private String destCltRcvUpdDt = null;
	/* Column Info */
	private String oblRdemFlg = null;
	/* Column Info */
	private String blDocRqstRmk = null;
	/* Column Info */
	private String blIssKnt = null;
	/* Column Info */
	private String cstmsClrLocCd = null;
	/* Column Info */
	private String rqstBlTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String oblSrndFlg = null;
	/* Column Info */
	private String oblRdemUsrId = null;
	/* Column Info */
	private String destCltRcvUpdUsrId = null;
	/* Column Info */
	private String oblTtlKnt = null;
	/* Column Info */
	private String destN3ptyCltUpdDt = null;
	/* Column Info */
	private String rqstIssPlcNm = null;
	/* Column Info */
	private String destN3ptyCltCd = null;
	/* Column Info */
	private String cstmsEntrCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cstmsClrWhNm = null;
	/* Column Info */
	private String blPrfShprDt = null;
	/* Column Info */
	private String oblIssTpCd = null;
	/* Column Info */
	private String otrDocRcvOfcCd = null;
	/* Column Info */
	private String orgPpdRcvUpdDt = null;
	/* Column Info */
	private String otrDocRcvUsrId = null;
	/* Column Info */
	private String oblInetFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String destN3ptyCltUpdOfcCd = null;
	/* Column Info */
	private String otrDocCgorFlg = null;
	/* Column Info */
	private String blPrfShprFlg = null;
	/* Column Info */
	private String blRdyTpCd = null;
	/* Column Info */
	private String blPrnViaCd = null;
	/* Column Info */
	private String ibdDocRcvDt = null;
	/* Column Info */
	private String blOtrDocRcvCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String blCpyKnt = null;
	/* Column Info */
	private String oblIssFlg = null;
	/* Column Info */
	private String orgPpdRcvCd = null;
	/* Column Info */
	private String cpyTtlKnt = null;
	/* Column Info */
	private String oblIssKnt = null;
	/* Column Info */
	private String destCltRcvCd = null;
	/* Column Info */
	private String ibdDocRcvFlg = null;
	/* Column Info */
	private String orgN3ptyPpdUpdOfcCd = null;
	/* Column Info */
	private String orgN3ptyPpdUpdUsrId = null;
	/* Column Info */
	private String blDeToCd = null;
	/* Column Info */
	private String destCltRcvUpdOfcCd = null;
	/* Column Info */
	private String otrDocRcvDt = null;
	/* Column Info */
	private String oblRlseFlg = null;
	/* Column Info */
	private String oblRdemKnt = null;
	/* Column Info */
	private String blPrfShprUsrId = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String blDeMzdCd = null;
	/* Column Info */
	private String blRdyOfcCd = null;
	/* Column Info */
	private String oblRdemUpdUsrId = null;
	/* Column Info */
	private String oblRdemOfcCd = null;
	/* Column Info */
	private String blPrfShprOfcCd = null;
	/* Column Info */
	private String oblIssRmk = null;
	/* Column Info */
	private String wblPrnFlg = null;
	/* Column Info */
	private String blIssTpCd = null;
	/* Column Info */
	private String inetCtrlPtyNm = null;
	/* Column Info */
	private String inetCtrlPtyNo = null;
	/* Column Info */
	private String ftpSndFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgBlIssVO() {}

	public BkgBlIssVO(String ibflag, String pagerows, String bkgNo, String blRdyTpCd, String blRdyFlg, String blRdyOfcCd, String blRdyUsrId, String blRdyDt, String rqstBlTpCd, String oblRtInclKnt, String oblRtXcldKnt, String oblTtlKnt, String nonNegoRtInclKnt, String nonNegoRtXcldKnt, String cpyTtlKnt, String rqstIssPlcNm, String rqstIssDt, String blDeToCd, String blDeMzdCd, String blDocRqstRmk, String blIssKnt, String blCpyKnt, String blPrnViaCd, String oblInetFlg, String oblInetPrnDt, String oblPrnFlg, String cstmsCntrExpDt, String oblIssDt, String oblIssOfcCd, String oblIssUsrId, String oblIssTpCd, String oblIssKnt, String oblIssFlg, String oblRlseFlg, String oblSrndFlg, String oblRdemFlg, String oblRdemOfcCd, String oblRdemUsrId, String oblRdemUpdUsrId, String oblRdemDt, String oblRdemKnt, String otrDocCgorFlg, String blOtrDocRcvCd, String otrDocRcvOfcCd, String otrDocRcvUsrId, String otrDocRcvDt, String ibdDocRcvFlg, String ibdDocRcvOfcCd, String ibdDocRcvUsrId, String ibdDocRcvDt, String cstmsEntrCd, String cstmsClrLocCd, String cstmsClrWhNm, String orgPpdRcvCd, String destCltRcvCd, String orgN3ptyPpdCd, String destN3ptyCltCd, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String oblInetPrnGdt, String destCltRcvUpdUsrId, String orgN3ptyPpdUpdUsrId, String destN3ptyCltUpdUsrId, String orgPpdRcvUpdUsrId, String orgPpdRcvUpdDt, String destCltRcvUpdDt, String orgN3ptyPpdUpdDt, String destN3ptyCltUpdDt, String blPrfShprUsrId, String blPrfShprDt, String blPrfShprFlg, String blPrfShprOfcCd, String orgPpdRcvUpdOfcCd, String destCltRcvUpdOfcCd, String orgN3ptyPpdUpdOfcCd, String destN3ptyCltUpdOfcCd, String oblIssRmk, String wblPrnFlg, String blIssTpCd, String inetCtrlPtyNm, String inetCtrlPtyNo, String ftpSndFlg) {
		this.oblRtInclKnt = oblRtInclKnt;
		this.oblInetPrnDt = oblInetPrnDt;
		this.nonNegoRtXcldKnt = nonNegoRtXcldKnt;
		this.blRdyFlg = blRdyFlg;
		this.oblPrnFlg = oblPrnFlg;
		this.oblRtXcldKnt = oblRtXcldKnt;
		this.orgPpdRcvUpdOfcCd = orgPpdRcvUpdOfcCd;
		this.orgN3ptyPpdCd = orgN3ptyPpdCd;
		this.oblIssDt = oblIssDt;
		this.rqstIssDt = rqstIssDt;
		this.ibdDocRcvOfcCd = ibdDocRcvOfcCd;
		this.pagerows = pagerows;
		this.orgN3ptyPpdUpdDt = orgN3ptyPpdUpdDt;
		this.destN3ptyCltUpdUsrId = destN3ptyCltUpdUsrId;
		this.oblRdemDt = oblRdemDt;
		this.oblInetPrnGdt = oblInetPrnGdt;
		this.oblIssUsrId = oblIssUsrId;
		this.cstmsCntrExpDt = cstmsCntrExpDt;
		this.blRdyDt = blRdyDt;
		this.ibdDocRcvUsrId = ibdDocRcvUsrId;
		this.blRdyUsrId = blRdyUsrId;
		this.updUsrId = updUsrId;
		this.oblIssOfcCd = oblIssOfcCd;
		this.orgPpdRcvUpdUsrId = orgPpdRcvUpdUsrId;
		this.nonNegoRtInclKnt = nonNegoRtInclKnt;
		this.destCltRcvUpdDt = destCltRcvUpdDt;
		this.oblRdemFlg = oblRdemFlg;
		this.blDocRqstRmk = blDocRqstRmk;
		this.blIssKnt = blIssKnt;
		this.cstmsClrLocCd = cstmsClrLocCd;
		this.rqstBlTpCd = rqstBlTpCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.oblSrndFlg = oblSrndFlg;
		this.oblRdemUsrId = oblRdemUsrId;
		this.destCltRcvUpdUsrId = destCltRcvUpdUsrId;
		this.oblTtlKnt = oblTtlKnt;
		this.destN3ptyCltUpdDt = destN3ptyCltUpdDt;
		this.rqstIssPlcNm = rqstIssPlcNm;
		this.destN3ptyCltCd = destN3ptyCltCd;
		this.cstmsEntrCd = cstmsEntrCd;
		this.creDt = creDt;
		this.cstmsClrWhNm = cstmsClrWhNm;
		this.blPrfShprDt = blPrfShprDt;
		this.oblIssTpCd = oblIssTpCd;
		this.otrDocRcvOfcCd = otrDocRcvOfcCd;
		this.orgPpdRcvUpdDt = orgPpdRcvUpdDt;
		this.otrDocRcvUsrId = otrDocRcvUsrId;
		this.oblInetFlg = oblInetFlg;
		this.ibflag = ibflag;
		this.destN3ptyCltUpdOfcCd = destN3ptyCltUpdOfcCd;
		this.otrDocCgorFlg = otrDocCgorFlg;
		this.blPrfShprFlg = blPrfShprFlg;
		this.blRdyTpCd = blRdyTpCd;
		this.blPrnViaCd = blPrnViaCd;
		this.ibdDocRcvDt = ibdDocRcvDt;
		this.blOtrDocRcvCd = blOtrDocRcvCd;
		this.updDt = updDt;
		this.blCpyKnt = blCpyKnt;
		this.oblIssFlg = oblIssFlg;
		this.orgPpdRcvCd = orgPpdRcvCd;
		this.cpyTtlKnt = cpyTtlKnt;
		this.oblIssKnt = oblIssKnt;
		this.destCltRcvCd = destCltRcvCd;
		this.ibdDocRcvFlg = ibdDocRcvFlg;
		this.orgN3ptyPpdUpdOfcCd = orgN3ptyPpdUpdOfcCd;
		this.orgN3ptyPpdUpdUsrId = orgN3ptyPpdUpdUsrId;
		this.blDeToCd = blDeToCd;
		this.destCltRcvUpdOfcCd = destCltRcvUpdOfcCd;
		this.otrDocRcvDt = otrDocRcvDt;
		this.oblRlseFlg = oblRlseFlg;
		this.oblRdemKnt = oblRdemKnt;
		this.blPrfShprUsrId = blPrfShprUsrId;
		this.diffRmk = diffRmk;
		this.blDeMzdCd = blDeMzdCd;
		this.blRdyOfcCd = blRdyOfcCd;
		this.oblRdemUpdUsrId = oblRdemUpdUsrId;
		this.oblRdemOfcCd = oblRdemOfcCd;
		this.blPrfShprOfcCd = blPrfShprOfcCd;
		this.oblIssRmk = oblIssRmk;
		this.wblPrnFlg = wblPrnFlg;
		this.blIssTpCd = blIssTpCd;
		this.inetCtrlPtyNm = inetCtrlPtyNm;
		this.inetCtrlPtyNo =inetCtrlPtyNo;
		this.ftpSndFlg = ftpSndFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("obl_rt_incl_knt", getOblRtInclKnt());
		this.hashColumns.put("obl_inet_prn_dt", getOblInetPrnDt());
		this.hashColumns.put("non_nego_rt_xcld_knt", getNonNegoRtXcldKnt());
		this.hashColumns.put("bl_rdy_flg", getBlRdyFlg());
		this.hashColumns.put("obl_prn_flg", getOblPrnFlg());
		this.hashColumns.put("obl_rt_xcld_knt", getOblRtXcldKnt());
		this.hashColumns.put("org_ppd_rcv_upd_ofc_cd", getOrgPpdRcvUpdOfcCd());
		this.hashColumns.put("org_n3pty_ppd_cd", getOrgN3ptyPpdCd());
		this.hashColumns.put("obl_iss_dt", getOblIssDt());
		this.hashColumns.put("rqst_iss_dt", getRqstIssDt());
		this.hashColumns.put("ibd_doc_rcv_ofc_cd", getIbdDocRcvOfcCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("org_n3pty_ppd_upd_dt", getOrgN3ptyPpdUpdDt());
		this.hashColumns.put("dest_n3pty_clt_upd_usr_id", getDestN3ptyCltUpdUsrId());
		this.hashColumns.put("obl_rdem_dt", getOblRdemDt());
		this.hashColumns.put("obl_inet_prn_gdt", getOblInetPrnGdt());
		this.hashColumns.put("obl_iss_usr_id", getOblIssUsrId());
		this.hashColumns.put("cstms_cntr_exp_dt", getCstmsCntrExpDt());
		this.hashColumns.put("bl_rdy_dt", getBlRdyDt());
		this.hashColumns.put("ibd_doc_rcv_usr_id", getIbdDocRcvUsrId());
		this.hashColumns.put("bl_rdy_usr_id", getBlRdyUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("obl_iss_ofc_cd", getOblIssOfcCd());
		this.hashColumns.put("org_ppd_rcv_upd_usr_id", getOrgPpdRcvUpdUsrId());
		this.hashColumns.put("non_nego_rt_incl_knt", getNonNegoRtInclKnt());
		this.hashColumns.put("dest_clt_rcv_upd_dt", getDestCltRcvUpdDt());
		this.hashColumns.put("obl_rdem_flg", getOblRdemFlg());
		this.hashColumns.put("bl_doc_rqst_rmk", getBlDocRqstRmk());
		this.hashColumns.put("bl_iss_knt", getBlIssKnt());
		this.hashColumns.put("cstms_clr_loc_cd", getCstmsClrLocCd());
		this.hashColumns.put("rqst_bl_tp_cd", getRqstBlTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("obl_srnd_flg", getOblSrndFlg());
		this.hashColumns.put("obl_rdem_usr_id", getOblRdemUsrId());
		this.hashColumns.put("dest_clt_rcv_upd_usr_id", getDestCltRcvUpdUsrId());
		this.hashColumns.put("obl_ttl_knt", getOblTtlKnt());
		this.hashColumns.put("dest_n3pty_clt_upd_dt", getDestN3ptyCltUpdDt());
		this.hashColumns.put("rqst_iss_plc_nm", getRqstIssPlcNm());
		this.hashColumns.put("dest_n3pty_clt_cd", getDestN3ptyCltCd());
		this.hashColumns.put("cstms_entr_cd", getCstmsEntrCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cstms_clr_wh_nm", getCstmsClrWhNm());
		this.hashColumns.put("bl_prf_shpr_dt", getBlPrfShprDt());
		this.hashColumns.put("obl_iss_tp_cd", getOblIssTpCd());
		this.hashColumns.put("otr_doc_rcv_ofc_cd", getOtrDocRcvOfcCd());
		this.hashColumns.put("org_ppd_rcv_upd_dt", getOrgPpdRcvUpdDt());
		this.hashColumns.put("otr_doc_rcv_usr_id", getOtrDocRcvUsrId());
		this.hashColumns.put("obl_inet_flg", getOblInetFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dest_n3pty_clt_upd_ofc_cd", getDestN3ptyCltUpdOfcCd());
		this.hashColumns.put("otr_doc_cgor_flg", getOtrDocCgorFlg());
		this.hashColumns.put("bl_prf_shpr_flg", getBlPrfShprFlg());
		this.hashColumns.put("bl_rdy_tp_cd", getBlRdyTpCd());
		this.hashColumns.put("bl_prn_via_cd", getBlPrnViaCd());
		this.hashColumns.put("ibd_doc_rcv_dt", getIbdDocRcvDt());
		this.hashColumns.put("bl_otr_doc_rcv_cd", getBlOtrDocRcvCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bl_cpy_knt", getBlCpyKnt());
		this.hashColumns.put("obl_iss_flg", getOblIssFlg());
		this.hashColumns.put("org_ppd_rcv_cd", getOrgPpdRcvCd());
		this.hashColumns.put("cpy_ttl_knt", getCpyTtlKnt());
		this.hashColumns.put("obl_iss_knt", getOblIssKnt());
		this.hashColumns.put("dest_clt_rcv_cd", getDestCltRcvCd());
		this.hashColumns.put("ibd_doc_rcv_flg", getIbdDocRcvFlg());
		this.hashColumns.put("org_n3pty_ppd_upd_ofc_cd", getOrgN3ptyPpdUpdOfcCd());
		this.hashColumns.put("org_n3pty_ppd_upd_usr_id", getOrgN3ptyPpdUpdUsrId());
		this.hashColumns.put("bl_de_to_cd", getBlDeToCd());
		this.hashColumns.put("dest_clt_rcv_upd_ofc_cd", getDestCltRcvUpdOfcCd());
		this.hashColumns.put("otr_doc_rcv_dt", getOtrDocRcvDt());
		this.hashColumns.put("obl_rlse_flg", getOblRlseFlg());
		this.hashColumns.put("obl_rdem_knt", getOblRdemKnt());
		this.hashColumns.put("bl_prf_shpr_usr_id", getBlPrfShprUsrId());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("bl_de_mzd_cd", getBlDeMzdCd());
		this.hashColumns.put("bl_rdy_ofc_cd", getBlRdyOfcCd());
		this.hashColumns.put("obl_rdem_upd_usr_id", getOblRdemUpdUsrId());
		this.hashColumns.put("obl_rdem_ofc_cd", getOblRdemOfcCd());
		this.hashColumns.put("bl_prf_shpr_ofc_cd", getBlPrfShprOfcCd());
		this.hashColumns.put("obl_iss_rmk", getOblIssRmk());
		this.hashColumns.put("wbl_prn_flg", getWblPrnFlg());
		this.hashColumns.put("bl_iss_tp_cd", getBlIssTpCd());
		this.hashColumns.put("inet_ctrl_pty_nm", getInetCtrlPtyNm());
		this.hashColumns.put("inet_ctrl_pty_no", getInetCtrlPtyNo());
		this.hashColumns.put("ftp_snd_flg", getFtpSndFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("obl_rt_incl_knt", "oblRtInclKnt");
		this.hashFields.put("obl_inet_prn_dt", "oblInetPrnDt");
		this.hashFields.put("non_nego_rt_xcld_knt", "nonNegoRtXcldKnt");
		this.hashFields.put("bl_rdy_flg", "blRdyFlg");
		this.hashFields.put("obl_prn_flg", "oblPrnFlg");
		this.hashFields.put("obl_rt_xcld_knt", "oblRtXcldKnt");
		this.hashFields.put("org_ppd_rcv_upd_ofc_cd", "orgPpdRcvUpdOfcCd");
		this.hashFields.put("org_n3pty_ppd_cd", "orgN3ptyPpdCd");
		this.hashFields.put("obl_iss_dt", "oblIssDt");
		this.hashFields.put("rqst_iss_dt", "rqstIssDt");
		this.hashFields.put("ibd_doc_rcv_ofc_cd", "ibdDocRcvOfcCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("org_n3pty_ppd_upd_dt", "orgN3ptyPpdUpdDt");
		this.hashFields.put("dest_n3pty_clt_upd_usr_id", "destN3ptyCltUpdUsrId");
		this.hashFields.put("obl_rdem_dt", "oblRdemDt");
		this.hashFields.put("obl_inet_prn_gdt", "oblInetPrnGdt");
		this.hashFields.put("obl_iss_usr_id", "oblIssUsrId");
		this.hashFields.put("cstms_cntr_exp_dt", "cstmsCntrExpDt");
		this.hashFields.put("bl_rdy_dt", "blRdyDt");
		this.hashFields.put("ibd_doc_rcv_usr_id", "ibdDocRcvUsrId");
		this.hashFields.put("bl_rdy_usr_id", "blRdyUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("obl_iss_ofc_cd", "oblIssOfcCd");
		this.hashFields.put("org_ppd_rcv_upd_usr_id", "orgPpdRcvUpdUsrId");
		this.hashFields.put("non_nego_rt_incl_knt", "nonNegoRtInclKnt");
		this.hashFields.put("dest_clt_rcv_upd_dt", "destCltRcvUpdDt");
		this.hashFields.put("obl_rdem_flg", "oblRdemFlg");
		this.hashFields.put("bl_doc_rqst_rmk", "blDocRqstRmk");
		this.hashFields.put("bl_iss_knt", "blIssKnt");
		this.hashFields.put("cstms_clr_loc_cd", "cstmsClrLocCd");
		this.hashFields.put("rqst_bl_tp_cd", "rqstBlTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("obl_srnd_flg", "oblSrndFlg");
		this.hashFields.put("obl_rdem_usr_id", "oblRdemUsrId");
		this.hashFields.put("dest_clt_rcv_upd_usr_id", "destCltRcvUpdUsrId");
		this.hashFields.put("obl_ttl_knt", "oblTtlKnt");
		this.hashFields.put("dest_n3pty_clt_upd_dt", "destN3ptyCltUpdDt");
		this.hashFields.put("rqst_iss_plc_nm", "rqstIssPlcNm");
		this.hashFields.put("dest_n3pty_clt_cd", "destN3ptyCltCd");
		this.hashFields.put("cstms_entr_cd", "cstmsEntrCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cstms_clr_wh_nm", "cstmsClrWhNm");
		this.hashFields.put("bl_prf_shpr_dt", "blPrfShprDt");
		this.hashFields.put("obl_iss_tp_cd", "oblIssTpCd");
		this.hashFields.put("otr_doc_rcv_ofc_cd", "otrDocRcvOfcCd");
		this.hashFields.put("org_ppd_rcv_upd_dt", "orgPpdRcvUpdDt");
		this.hashFields.put("otr_doc_rcv_usr_id", "otrDocRcvUsrId");
		this.hashFields.put("obl_inet_flg", "oblInetFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dest_n3pty_clt_upd_ofc_cd", "destN3ptyCltUpdOfcCd");
		this.hashFields.put("otr_doc_cgor_flg", "otrDocCgorFlg");
		this.hashFields.put("bl_prf_shpr_flg", "blPrfShprFlg");
		this.hashFields.put("bl_rdy_tp_cd", "blRdyTpCd");
		this.hashFields.put("bl_prn_via_cd", "blPrnViaCd");
		this.hashFields.put("ibd_doc_rcv_dt", "ibdDocRcvDt");
		this.hashFields.put("bl_otr_doc_rcv_cd", "blOtrDocRcvCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bl_cpy_knt", "blCpyKnt");
		this.hashFields.put("obl_iss_flg", "oblIssFlg");
		this.hashFields.put("org_ppd_rcv_cd", "orgPpdRcvCd");
		this.hashFields.put("cpy_ttl_knt", "cpyTtlKnt");
		this.hashFields.put("obl_iss_knt", "oblIssKnt");
		this.hashFields.put("dest_clt_rcv_cd", "destCltRcvCd");
		this.hashFields.put("ibd_doc_rcv_flg", "ibdDocRcvFlg");
		this.hashFields.put("org_n3pty_ppd_upd_ofc_cd", "orgN3ptyPpdUpdOfcCd");
		this.hashFields.put("org_n3pty_ppd_upd_usr_id", "orgN3ptyPpdUpdUsrId");
		this.hashFields.put("bl_de_to_cd", "blDeToCd");
		this.hashFields.put("dest_clt_rcv_upd_ofc_cd", "destCltRcvUpdOfcCd");
		this.hashFields.put("otr_doc_rcv_dt", "otrDocRcvDt");
		this.hashFields.put("obl_rlse_flg", "oblRlseFlg");
		this.hashFields.put("obl_rdem_knt", "oblRdemKnt");
		this.hashFields.put("bl_prf_shpr_usr_id", "blPrfShprUsrId");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("bl_de_mzd_cd", "blDeMzdCd");
		this.hashFields.put("bl_rdy_ofc_cd", "blRdyOfcCd");
		this.hashFields.put("obl_rdem_upd_usr_id", "oblRdemUpdUsrId");
		this.hashFields.put("obl_rdem_ofc_cd", "oblRdemOfcCd");
		this.hashFields.put("bl_prf_shpr_ofc_cd", "blPrfShprOfcCd");
		this.hashFields.put("obl_iss_rmk", "oblIssRmk");
		this.hashFields.put("wbl_prn_flg", "wblPrnFlg");
		this.hashFields.put("bl_iss_tp_cd", "blIssTpCd");
		this.hashFields.put("inet_ctrl_pty_nm", "inetCtrlPtyNm");
		this.hashFields.put("inet_ctrl_pty_no", "inetCtrlPtyNo");
		this.hashFields.put("ftp_snd_flg", "ftpSndFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return oblRtInclKnt
	 */
	public String getOblRtInclKnt() {
		return this.oblRtInclKnt;
	}
	
	/**
	 * Column Info
	 * @return oblInetPrnDt
	 */
	public String getOblInetPrnDt() {
		return this.oblInetPrnDt;
	}
	
	/**
	 * Column Info
	 * @return nonNegoRtXcldKnt
	 */
	public String getNonNegoRtXcldKnt() {
		return this.nonNegoRtXcldKnt;
	}
	
	/**
	 * Column Info
	 * @return blRdyFlg
	 */
	public String getBlRdyFlg() {
		return this.blRdyFlg;
	}
	
	/**
	 * Column Info
	 * @return oblPrnFlg
	 */
	public String getOblPrnFlg() {
		return this.oblPrnFlg;
	}
	
	/**
	 * Column Info
	 * @return oblRtXcldKnt
	 */
	public String getOblRtXcldKnt() {
		return this.oblRtXcldKnt;
	}
	
	/**
	 * Column Info
	 * @return orgPpdRcvUpdOfcCd
	 */
	public String getOrgPpdRcvUpdOfcCd() {
		return this.orgPpdRcvUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @return orgN3ptyPpdCd
	 */
	public String getOrgN3ptyPpdCd() {
		return this.orgN3ptyPpdCd;
	}
	
	/**
	 * Column Info
	 * @return oblIssDt
	 */
	public String getOblIssDt() {
		return this.oblIssDt;
	}
	
	/**
	 * Column Info
	 * @return rqstIssDt
	 */
	public String getRqstIssDt() {
		return this.rqstIssDt;
	}
	
	/**
	 * Column Info
	 * @return ibdDocRcvOfcCd
	 */
	public String getIbdDocRcvOfcCd() {
		return this.ibdDocRcvOfcCd;
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
	 * @return orgN3ptyPpdUpdDt
	 */
	public String getOrgN3ptyPpdUpdDt() {
		return this.orgN3ptyPpdUpdDt;
	}
	
	/**
	 * Column Info
	 * @return destN3ptyCltUpdUsrId
	 */
	public String getDestN3ptyCltUpdUsrId() {
		return this.destN3ptyCltUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @return oblRdemDt
	 */
	public String getOblRdemDt() {
		return this.oblRdemDt;
	}
	
	/**
	 * Column Info
	 * @return oblInetPrnGdt
	 */
	public String getOblInetPrnGdt() {
		return this.oblInetPrnGdt;
	}
	
	/**
	 * Column Info
	 * @return oblIssUsrId
	 */
	public String getOblIssUsrId() {
		return this.oblIssUsrId;
	}
	
	/**
	 * Column Info
	 * @return cstmsCntrExpDt
	 */
	public String getCstmsCntrExpDt() {
		return this.cstmsCntrExpDt;
	}
	
	/**
	 * Column Info
	 * @return blRdyDt
	 */
	public String getBlRdyDt() {
		return this.blRdyDt;
	}
	
	/**
	 * Column Info
	 * @return ibdDocRcvUsrId
	 */
	public String getIbdDocRcvUsrId() {
		return this.ibdDocRcvUsrId;
	}
	
	/**
	 * Column Info
	 * @return blRdyUsrId
	 */
	public String getBlRdyUsrId() {
		return this.blRdyUsrId;
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
	 * @return oblIssOfcCd
	 */
	public String getOblIssOfcCd() {
		return this.oblIssOfcCd;
	}
	
	/**
	 * Column Info
	 * @return orgPpdRcvUpdUsrId
	 */
	public String getOrgPpdRcvUpdUsrId() {
		return this.orgPpdRcvUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @return nonNegoRtInclKnt
	 */
	public String getNonNegoRtInclKnt() {
		return this.nonNegoRtInclKnt;
	}
	
	/**
	 * Column Info
	 * @return destCltRcvUpdDt
	 */
	public String getDestCltRcvUpdDt() {
		return this.destCltRcvUpdDt;
	}
	
	/**
	 * Column Info
	 * @return oblRdemFlg
	 */
	public String getOblRdemFlg() {
		return this.oblRdemFlg;
	}
	
	/**
	 * Column Info
	 * @return blDocRqstRmk
	 */
	public String getBlDocRqstRmk() {
		return this.blDocRqstRmk;
	}
	
	/**
	 * Column Info
	 * @return blIssKnt
	 */
	public String getBlIssKnt() {
		return this.blIssKnt;
	}
	
	/**
	 * Column Info
	 * @return cstmsClrLocCd
	 */
	public String getCstmsClrLocCd() {
		return this.cstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @return rqstBlTpCd
	 */
	public String getRqstBlTpCd() {
		return this.rqstBlTpCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return oblSrndFlg
	 */
	public String getOblSrndFlg() {
		return this.oblSrndFlg;
	}
	
	/**
	 * Column Info
	 * @return oblRdemUsrId
	 */
	public String getOblRdemUsrId() {
		return this.oblRdemUsrId;
	}
	
	/**
	 * Column Info
	 * @return destCltRcvUpdUsrId
	 */
	public String getDestCltRcvUpdUsrId() {
		return this.destCltRcvUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @return oblTtlKnt
	 */
	public String getOblTtlKnt() {
		return this.oblTtlKnt;
	}
	
	/**
	 * Column Info
	 * @return destN3ptyCltUpdDt
	 */
	public String getDestN3ptyCltUpdDt() {
		return this.destN3ptyCltUpdDt;
	}
	
	/**
	 * Column Info
	 * @return rqstIssPlcNm
	 */
	public String getRqstIssPlcNm() {
		return this.rqstIssPlcNm;
	}
	
	/**
	 * Column Info
	 * @return destN3ptyCltCd
	 */
	public String getDestN3ptyCltCd() {
		return this.destN3ptyCltCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsEntrCd
	 */
	public String getCstmsEntrCd() {
		return this.cstmsEntrCd;
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
	 * @return cstmsClrWhNm
	 */
	public String getCstmsClrWhNm() {
		return this.cstmsClrWhNm;
	}
	
	/**
	 * Column Info
	 * @return blPrfShprDt
	 */
	public String getBlPrfShprDt() {
		return this.blPrfShprDt;
	}
	
	/**
	 * Column Info
	 * @return oblIssTpCd
	 */
	public String getOblIssTpCd() {
		return this.oblIssTpCd;
	}
	
	/**
	 * Column Info
	 * @return otrDocRcvOfcCd
	 */
	public String getOtrDocRcvOfcCd() {
		return this.otrDocRcvOfcCd;
	}
	
	/**
	 * Column Info
	 * @return orgPpdRcvUpdDt
	 */
	public String getOrgPpdRcvUpdDt() {
		return this.orgPpdRcvUpdDt;
	}
	
	/**
	 * Column Info
	 * @return otrDocRcvUsrId
	 */
	public String getOtrDocRcvUsrId() {
		return this.otrDocRcvUsrId;
	}
	
	/**
	 * Column Info
	 * @return oblInetFlg
	 */
	public String getOblInetFlg() {
		return this.oblInetFlg;
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
	 * @return destN3ptyCltUpdOfcCd
	 */
	public String getDestN3ptyCltUpdOfcCd() {
		return this.destN3ptyCltUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @return otrDocCgorFlg
	 */
	public String getOtrDocCgorFlg() {
		return this.otrDocCgorFlg;
	}
	
	/**
	 * Column Info
	 * @return blPrfShprFlg
	 */
	public String getBlPrfShprFlg() {
		return this.blPrfShprFlg;
	}
	
	/**
	 * Column Info
	 * @return blRdyTpCd
	 */
	public String getBlRdyTpCd() {
		return this.blRdyTpCd;
	}
	
	/**
	 * Column Info
	 * @return blPrnViaCd
	 */
	public String getBlPrnViaCd() {
		return this.blPrnViaCd;
	}
	
	/**
	 * Column Info
	 * @return ibdDocRcvDt
	 */
	public String getIbdDocRcvDt() {
		return this.ibdDocRcvDt;
	}
	
	/**
	 * Column Info
	 * @return blOtrDocRcvCd
	 */
	public String getBlOtrDocRcvCd() {
		return this.blOtrDocRcvCd;
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
	 * @return blCpyKnt
	 */
	public String getBlCpyKnt() {
		return this.blCpyKnt;
	}
	
	/**
	 * Column Info
	 * @return oblIssFlg
	 */
	public String getOblIssFlg() {
		return this.oblIssFlg;
	}
	
	/**
	 * Column Info
	 * @return orgPpdRcvCd
	 */
	public String getOrgPpdRcvCd() {
		return this.orgPpdRcvCd;
	}
	
	/**
	 * Column Info
	 * @return cpyTtlKnt
	 */
	public String getCpyTtlKnt() {
		return this.cpyTtlKnt;
	}
	
	/**
	 * Column Info
	 * @return oblIssKnt
	 */
	public String getOblIssKnt() {
		return this.oblIssKnt;
	}
	
	/**
	 * Column Info
	 * @return destCltRcvCd
	 */
	public String getDestCltRcvCd() {
		return this.destCltRcvCd;
	}
	
	/**
	 * Column Info
	 * @return ibdDocRcvFlg
	 */
	public String getIbdDocRcvFlg() {
		return this.ibdDocRcvFlg;
	}
	
	/**
	 * Column Info
	 * @return orgN3ptyPpdUpdOfcCd
	 */
	public String getOrgN3ptyPpdUpdOfcCd() {
		return this.orgN3ptyPpdUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @return orgN3ptyPpdUpdUsrId
	 */
	public String getOrgN3ptyPpdUpdUsrId() {
		return this.orgN3ptyPpdUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @return blDeToCd
	 */
	public String getBlDeToCd() {
		return this.blDeToCd;
	}
	
	/**
	 * Column Info
	 * @return destCltRcvUpdOfcCd
	 */
	public String getDestCltRcvUpdOfcCd() {
		return this.destCltRcvUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @return otrDocRcvDt
	 */
	public String getOtrDocRcvDt() {
		return this.otrDocRcvDt;
	}
	
	/**
	 * Column Info
	 * @return oblRlseFlg
	 */
	public String getOblRlseFlg() {
		return this.oblRlseFlg;
	}
	
	/**
	 * Column Info
	 * @return oblRdemKnt
	 */
	public String getOblRdemKnt() {
		return this.oblRdemKnt;
	}
	
	/**
	 * Column Info
	 * @return blPrfShprUsrId
	 */
	public String getBlPrfShprUsrId() {
		return this.blPrfShprUsrId;
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
	 * @return blDeMzdCd
	 */
	public String getBlDeMzdCd() {
		return this.blDeMzdCd;
	}
	
	/**
	 * Column Info
	 * @return blRdyOfcCd
	 */
	public String getBlRdyOfcCd() {
		return this.blRdyOfcCd;
	}
	
	/**
	 * Column Info
	 * @return oblRdemUpdUsrId
	 */
	public String getOblRdemUpdUsrId() {
		return this.oblRdemUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @return oblRdemOfcCd
	 */
	public String getOblRdemOfcCd() {
		return this.oblRdemOfcCd;
	}
	
	/**
	 * Column Info
	 * @return blPrfShprOfcCd
	 */
	public String getBlPrfShprOfcCd() {
		return this.blPrfShprOfcCd;
	}

	/**
	 * Column Info
	 * @return oblIssRmk
	 */
	public String getOblIssRmk() {
		return this.oblIssRmk;
	}
	
	/**
	 * Column Info
	 * @return blIssTpCd
	 */
	public String getBlIssTpCd() {
		return this.blIssTpCd;
	}

	/**
	 * Column Info
	 * @param oblRtInclKnt
	 */
	public void setOblRtInclKnt(String oblRtInclKnt) {
		this.oblRtInclKnt = oblRtInclKnt;
	}
	
	/**
	 * Column Info
	 * @param oblInetPrnDt
	 */
	public void setOblInetPrnDt(String oblInetPrnDt) {
		this.oblInetPrnDt = oblInetPrnDt;
	}
	
	/**
	 * Column Info
	 * @param nonNegoRtXcldKnt
	 */
	public void setNonNegoRtXcldKnt(String nonNegoRtXcldKnt) {
		this.nonNegoRtXcldKnt = nonNegoRtXcldKnt;
	}
	
	/**
	 * Column Info
	 * @param blRdyFlg
	 */
	public void setBlRdyFlg(String blRdyFlg) {
		this.blRdyFlg = blRdyFlg;
	}
	
	/**
	 * Column Info
	 * @param oblPrnFlg
	 */
	public void setOblPrnFlg(String oblPrnFlg) {
		this.oblPrnFlg = oblPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param oblRtXcldKnt
	 */
	public void setOblRtXcldKnt(String oblRtXcldKnt) {
		this.oblRtXcldKnt = oblRtXcldKnt;
	}
	
	/**
	 * Column Info
	 * @param orgPpdRcvUpdOfcCd
	 */
	public void setOrgPpdRcvUpdOfcCd(String orgPpdRcvUpdOfcCd) {
		this.orgPpdRcvUpdOfcCd = orgPpdRcvUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @param orgN3ptyPpdCd
	 */
	public void setOrgN3ptyPpdCd(String orgN3ptyPpdCd) {
		this.orgN3ptyPpdCd = orgN3ptyPpdCd;
	}
	
	/**
	 * Column Info
	 * @param oblIssDt
	 */
	public void setOblIssDt(String oblIssDt) {
		this.oblIssDt = oblIssDt;
	}
	
	/**
	 * Column Info
	 * @param rqstIssDt
	 */
	public void setRqstIssDt(String rqstIssDt) {
		this.rqstIssDt = rqstIssDt;
	}
	
	/**
	 * Column Info
	 * @param ibdDocRcvOfcCd
	 */
	public void setIbdDocRcvOfcCd(String ibdDocRcvOfcCd) {
		this.ibdDocRcvOfcCd = ibdDocRcvOfcCd;
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
	 * @param orgN3ptyPpdUpdDt
	 */
	public void setOrgN3ptyPpdUpdDt(String orgN3ptyPpdUpdDt) {
		this.orgN3ptyPpdUpdDt = orgN3ptyPpdUpdDt;
	}
	
	/**
	 * Column Info
	 * @param destN3ptyCltUpdUsrId
	 */
	public void setDestN3ptyCltUpdUsrId(String destN3ptyCltUpdUsrId) {
		this.destN3ptyCltUpdUsrId = destN3ptyCltUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @param oblRdemDt
	 */
	public void setOblRdemDt(String oblRdemDt) {
		this.oblRdemDt = oblRdemDt;
	}
	
	/**
	 * Column Info
	 * @param oblInetPrnGdt
	 */
	public void setOblInetPrnGdt(String oblInetPrnGdt) {
		this.oblInetPrnGdt = oblInetPrnGdt;
	}
	
	/**
	 * Column Info
	 * @param oblIssUsrId
	 */
	public void setOblIssUsrId(String oblIssUsrId) {
		this.oblIssUsrId = oblIssUsrId;
	}
	
	/**
	 * Column Info
	 * @param cstmsCntrExpDt
	 */
	public void setCstmsCntrExpDt(String cstmsCntrExpDt) {
		this.cstmsCntrExpDt = cstmsCntrExpDt;
	}
	
	/**
	 * Column Info
	 * @param blRdyDt
	 */
	public void setBlRdyDt(String blRdyDt) {
		this.blRdyDt = blRdyDt;
	}
	
	/**
	 * Column Info
	 * @param ibdDocRcvUsrId
	 */
	public void setIbdDocRcvUsrId(String ibdDocRcvUsrId) {
		this.ibdDocRcvUsrId = ibdDocRcvUsrId;
	}
	
	/**
	 * Column Info
	 * @param blRdyUsrId
	 */
	public void setBlRdyUsrId(String blRdyUsrId) {
		this.blRdyUsrId = blRdyUsrId;
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
	 * @param oblIssOfcCd
	 */
	public void setOblIssOfcCd(String oblIssOfcCd) {
		this.oblIssOfcCd = oblIssOfcCd;
	}
	
	/**
	 * Column Info
	 * @param orgPpdRcvUpdUsrId
	 */
	public void setOrgPpdRcvUpdUsrId(String orgPpdRcvUpdUsrId) {
		this.orgPpdRcvUpdUsrId = orgPpdRcvUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @param nonNegoRtInclKnt
	 */
	public void setNonNegoRtInclKnt(String nonNegoRtInclKnt) {
		this.nonNegoRtInclKnt = nonNegoRtInclKnt;
	}
	
	/**
	 * Column Info
	 * @param destCltRcvUpdDt
	 */
	public void setDestCltRcvUpdDt(String destCltRcvUpdDt) {
		this.destCltRcvUpdDt = destCltRcvUpdDt;
	}
	
	/**
	 * Column Info
	 * @param oblRdemFlg
	 */
	public void setOblRdemFlg(String oblRdemFlg) {
		this.oblRdemFlg = oblRdemFlg;
	}
	
	/**
	 * Column Info
	 * @param blDocRqstRmk
	 */
	public void setBlDocRqstRmk(String blDocRqstRmk) {
		this.blDocRqstRmk = blDocRqstRmk;
	}
	
	/**
	 * Column Info
	 * @param blIssKnt
	 */
	public void setBlIssKnt(String blIssKnt) {
		this.blIssKnt = blIssKnt;
	}
	
	/**
	 * Column Info
	 * @param cstmsClrLocCd
	 */
	public void setCstmsClrLocCd(String cstmsClrLocCd) {
		this.cstmsClrLocCd = cstmsClrLocCd;
	}
	
	/**
	 * Column Info
	 * @param rqstBlTpCd
	 */
	public void setRqstBlTpCd(String rqstBlTpCd) {
		this.rqstBlTpCd = rqstBlTpCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param oblSrndFlg
	 */
	public void setOblSrndFlg(String oblSrndFlg) {
		this.oblSrndFlg = oblSrndFlg;
	}
	
	/**
	 * Column Info
	 * @param oblRdemUsrId
	 */
	public void setOblRdemUsrId(String oblRdemUsrId) {
		this.oblRdemUsrId = oblRdemUsrId;
	}
	
	/**
	 * Column Info
	 * @param destCltRcvUpdUsrId
	 */
	public void setDestCltRcvUpdUsrId(String destCltRcvUpdUsrId) {
		this.destCltRcvUpdUsrId = destCltRcvUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @param oblTtlKnt
	 */
	public void setOblTtlKnt(String oblTtlKnt) {
		this.oblTtlKnt = oblTtlKnt;
	}
	
	/**
	 * Column Info
	 * @param destN3ptyCltUpdDt
	 */
	public void setDestN3ptyCltUpdDt(String destN3ptyCltUpdDt) {
		this.destN3ptyCltUpdDt = destN3ptyCltUpdDt;
	}
	
	/**
	 * Column Info
	 * @param rqstIssPlcNm
	 */
	public void setRqstIssPlcNm(String rqstIssPlcNm) {
		this.rqstIssPlcNm = rqstIssPlcNm;
	}
	
	/**
	 * Column Info
	 * @param destN3ptyCltCd
	 */
	public void setDestN3ptyCltCd(String destN3ptyCltCd) {
		this.destN3ptyCltCd = destN3ptyCltCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsEntrCd
	 */
	public void setCstmsEntrCd(String cstmsEntrCd) {
		this.cstmsEntrCd = cstmsEntrCd;
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
	 * @param cstmsClrWhNm
	 */
	public void setCstmsClrWhNm(String cstmsClrWhNm) {
		this.cstmsClrWhNm = cstmsClrWhNm;
	}
	
	/**
	 * Column Info
	 * @param blPrfShprDt
	 */
	public void setBlPrfShprDt(String blPrfShprDt) {
		this.blPrfShprDt = blPrfShprDt;
	}
	
	/**
	 * Column Info
	 * @param oblIssTpCd
	 */
	public void setOblIssTpCd(String oblIssTpCd) {
		this.oblIssTpCd = oblIssTpCd;
	}
	
	/**
	 * Column Info
	 * @param otrDocRcvOfcCd
	 */
	public void setOtrDocRcvOfcCd(String otrDocRcvOfcCd) {
		this.otrDocRcvOfcCd = otrDocRcvOfcCd;
	}
	
	/**
	 * Column Info
	 * @param orgPpdRcvUpdDt
	 */
	public void setOrgPpdRcvUpdDt(String orgPpdRcvUpdDt) {
		this.orgPpdRcvUpdDt = orgPpdRcvUpdDt;
	}
	
	/**
	 * Column Info
	 * @param otrDocRcvUsrId
	 */
	public void setOtrDocRcvUsrId(String otrDocRcvUsrId) {
		this.otrDocRcvUsrId = otrDocRcvUsrId;
	}
	
	/**
	 * Column Info
	 * @param oblInetFlg
	 */
	public void setOblInetFlg(String oblInetFlg) {
		this.oblInetFlg = oblInetFlg;
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
	 * @param destN3ptyCltUpdOfcCd
	 */
	public void setDestN3ptyCltUpdOfcCd(String destN3ptyCltUpdOfcCd) {
		this.destN3ptyCltUpdOfcCd = destN3ptyCltUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @param otrDocCgorFlg
	 */
	public void setOtrDocCgorFlg(String otrDocCgorFlg) {
		this.otrDocCgorFlg = otrDocCgorFlg;
	}
	
	/**
	 * Column Info
	 * @param blPrfShprFlg
	 */
	public void setBlPrfShprFlg(String blPrfShprFlg) {
		this.blPrfShprFlg = blPrfShprFlg;
	}
	
	/**
	 * Column Info
	 * @param blRdyTpCd
	 */
	public void setBlRdyTpCd(String blRdyTpCd) {
		this.blRdyTpCd = blRdyTpCd;
	}
	
	/**
	 * Column Info
	 * @param blPrnViaCd
	 */
	public void setBlPrnViaCd(String blPrnViaCd) {
		this.blPrnViaCd = blPrnViaCd;
	}
	
	/**
	 * Column Info
	 * @param ibdDocRcvDt
	 */
	public void setIbdDocRcvDt(String ibdDocRcvDt) {
		this.ibdDocRcvDt = ibdDocRcvDt;
	}
	
	/**
	 * Column Info
	 * @param blOtrDocRcvCd
	 */
	public void setBlOtrDocRcvCd(String blOtrDocRcvCd) {
		this.blOtrDocRcvCd = blOtrDocRcvCd;
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
	 * @param blCpyKnt
	 */
	public void setBlCpyKnt(String blCpyKnt) {
		this.blCpyKnt = blCpyKnt;
	}
	
	/**
	 * Column Info
	 * @param oblIssFlg
	 */
	public void setOblIssFlg(String oblIssFlg) {
		this.oblIssFlg = oblIssFlg;
	}
	
	/**
	 * Column Info
	 * @param orgPpdRcvCd
	 */
	public void setOrgPpdRcvCd(String orgPpdRcvCd) {
		this.orgPpdRcvCd = orgPpdRcvCd;
	}
	
	/**
	 * Column Info
	 * @param cpyTtlKnt
	 */
	public void setCpyTtlKnt(String cpyTtlKnt) {
		this.cpyTtlKnt = cpyTtlKnt;
	}
	
	/**
	 * Column Info
	 * @param oblIssKnt
	 */
	public void setOblIssKnt(String oblIssKnt) {
		this.oblIssKnt = oblIssKnt;
	}
	
	/**
	 * Column Info
	 * @param destCltRcvCd
	 */
	public void setDestCltRcvCd(String destCltRcvCd) {
		this.destCltRcvCd = destCltRcvCd;
	}
	
	/**
	 * Column Info
	 * @param ibdDocRcvFlg
	 */
	public void setIbdDocRcvFlg(String ibdDocRcvFlg) {
		this.ibdDocRcvFlg = ibdDocRcvFlg;
	}
	
	/**
	 * Column Info
	 * @param orgN3ptyPpdUpdOfcCd
	 */
	public void setOrgN3ptyPpdUpdOfcCd(String orgN3ptyPpdUpdOfcCd) {
		this.orgN3ptyPpdUpdOfcCd = orgN3ptyPpdUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @param orgN3ptyPpdUpdUsrId
	 */
	public void setOrgN3ptyPpdUpdUsrId(String orgN3ptyPpdUpdUsrId) {
		this.orgN3ptyPpdUpdUsrId = orgN3ptyPpdUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @param blDeToCd
	 */
	public void setBlDeToCd(String blDeToCd) {
		this.blDeToCd = blDeToCd;
	}
	
	/**
	 * Column Info
	 * @param destCltRcvUpdOfcCd
	 */
	public void setDestCltRcvUpdOfcCd(String destCltRcvUpdOfcCd) {
		this.destCltRcvUpdOfcCd = destCltRcvUpdOfcCd;
	}
	
	/**
	 * Column Info
	 * @param otrDocRcvDt
	 */
	public void setOtrDocRcvDt(String otrDocRcvDt) {
		this.otrDocRcvDt = otrDocRcvDt;
	}
	
	/**
	 * Column Info
	 * @param oblRlseFlg
	 */
	public void setOblRlseFlg(String oblRlseFlg) {
		this.oblRlseFlg = oblRlseFlg;
	}
	
	/**
	 * Column Info
	 * @param oblRdemKnt
	 */
	public void setOblRdemKnt(String oblRdemKnt) {
		this.oblRdemKnt = oblRdemKnt;
	}
	
	/**
	 * Column Info
	 * @param blPrfShprUsrId
	 */
	public void setBlPrfShprUsrId(String blPrfShprUsrId) {
		this.blPrfShprUsrId = blPrfShprUsrId;
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
	 * @param blDeMzdCd
	 */
	public void setBlDeMzdCd(String blDeMzdCd) {
		this.blDeMzdCd = blDeMzdCd;
	}
	
	/**
	 * Column Info
	 * @param blRdyOfcCd
	 */
	public void setBlRdyOfcCd(String blRdyOfcCd) {
		this.blRdyOfcCd = blRdyOfcCd;
	}
	
	/**
	 * Column Info
	 * @param oblRdemUpdUsrId
	 */
	public void setOblRdemUpdUsrId(String oblRdemUpdUsrId) {
		this.oblRdemUpdUsrId = oblRdemUpdUsrId;
	}
	
	/**
	 * Column Info
	 * @param oblRdemOfcCd
	 */
	public void setOblRdemOfcCd(String oblRdemOfcCd) {
		this.oblRdemOfcCd = oblRdemOfcCd;
	}
	
	/**
	 * Column Info
	 * @param blPrfShprOfcCd
	 */
	public void setBlPrfShprOfcCd(String blPrfShprOfcCd) {
		this.blPrfShprOfcCd = blPrfShprOfcCd;
	}
	
	/**
	 * Column Info
	 * @param oblIssRmk
	 */
	public void setOblIssRmk(String oblIssRmk) {
		this.oblIssRmk = oblIssRmk;
	}
	
	/**
	 * @return the wblPrnFlg
	 */
	public String getWblPrnFlg() {
		return wblPrnFlg;
	}

	/**
	 * @param wblPrnFlg the wblPrnFlg to set
	 */
	public void setWblPrnFlg(String wblPrnFlg) {
		this.wblPrnFlg = wblPrnFlg;
	}
	
	/**
	 * Column Info
	 * @param blIssTpCd
	 */
	public void setBlIssTpCd(String blIssTpCd) {
		this.blIssTpCd = blIssTpCd;
	}
	
	/**
	 * @return the inetCtrlPtyNm
	 */
	public String getInetCtrlPtyNm() {
		return inetCtrlPtyNm;
	}

	/**
	 * @param inetCtrlPtyNm the inetCtrlPtyNm to set
	 */
	public void setInetCtrlPtyNm(String inetCtrlPtyNm) {
		this.inetCtrlPtyNm = inetCtrlPtyNm;
	}

	/**
	 * @return the inetCtrlPtyNo
	 */
	public String getInetCtrlPtyNo() {
		return inetCtrlPtyNo;
	}

	/**
	 * @param inetCtrlPtyNo the inetCtrlPtyNo to set
	 */
	public void setInetCtrlPtyNo(String inetCtrlPtyNo) {
		this.inetCtrlPtyNo = inetCtrlPtyNo;
	}

	/**
	 * @return the ftpSndFlg
	 */
	public String getFtpSndFlg() {
		return ftpSndFlg;
	}

	/**
	 * @param ftpSndFlg the ftpSndFlg to set
	 */
	public void setFtpSndFlg(String ftpSndFlg) {
		this.ftpSndFlg = ftpSndFlg;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setOblRtInclKnt(JSPUtil.getParameter(request, "obl_rt_incl_knt", ""));
		setOblInetPrnDt(JSPUtil.getParameter(request, "obl_inet_prn_dt", ""));
		setNonNegoRtXcldKnt(JSPUtil.getParameter(request, "non_nego_rt_xcld_knt", ""));
		setBlRdyFlg(JSPUtil.getParameter(request, "bl_rdy_flg", ""));
		setOblPrnFlg(JSPUtil.getParameter(request, "obl_prn_flg", ""));
		setOblRtXcldKnt(JSPUtil.getParameter(request, "obl_rt_xcld_knt", ""));
		setOrgPpdRcvUpdOfcCd(JSPUtil.getParameter(request, "org_ppd_rcv_upd_ofc_cd", ""));
		setOrgN3ptyPpdCd(JSPUtil.getParameter(request, "org_n3pty_ppd_cd", ""));
		setOblIssDt(JSPUtil.getParameter(request, "obl_iss_dt", ""));
		setRqstIssDt(JSPUtil.getParameter(request, "rqst_iss_dt", ""));
		setIbdDocRcvOfcCd(JSPUtil.getParameter(request, "ibd_doc_rcv_ofc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOrgN3ptyPpdUpdDt(JSPUtil.getParameter(request, "org_n3pty_ppd_upd_dt", ""));
		setDestN3ptyCltUpdUsrId(JSPUtil.getParameter(request, "dest_n3pty_clt_upd_usr_id", ""));
		setOblRdemDt(JSPUtil.getParameter(request, "obl_rdem_dt", ""));
		setOblInetPrnGdt(JSPUtil.getParameter(request, "obl_inet_prn_gdt", ""));
		setOblIssUsrId(JSPUtil.getParameter(request, "obl_iss_usr_id", ""));
		setCstmsCntrExpDt(JSPUtil.getParameter(request, "cstms_cntr_exp_dt", ""));
		setBlRdyDt(JSPUtil.getParameter(request, "bl_rdy_dt", ""));
		setIbdDocRcvUsrId(JSPUtil.getParameter(request, "ibd_doc_rcv_usr_id", ""));
		setBlRdyUsrId(JSPUtil.getParameter(request, "bl_rdy_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOblIssOfcCd(JSPUtil.getParameter(request, "obl_iss_ofc_cd", ""));
		setOrgPpdRcvUpdUsrId(JSPUtil.getParameter(request, "org_ppd_rcv_upd_usr_id", ""));
		setNonNegoRtInclKnt(JSPUtil.getParameter(request, "non_nego_rt_incl_knt", ""));
		setDestCltRcvUpdDt(JSPUtil.getParameter(request, "dest_clt_rcv_upd_dt", ""));
		setOblRdemFlg(JSPUtil.getParameter(request, "obl_rdem_flg", ""));
		setBlDocRqstRmk(JSPUtil.getParameter(request, "bl_doc_rqst_rmk", ""));
		setBlIssKnt(JSPUtil.getParameter(request, "bl_iss_knt", ""));
		setCstmsClrLocCd(JSPUtil.getParameter(request, "cstms_clr_loc_cd", ""));
		setRqstBlTpCd(JSPUtil.getParameter(request, "rqst_bl_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setOblSrndFlg(JSPUtil.getParameter(request, "obl_srnd_flg", ""));
		setOblRdemUsrId(JSPUtil.getParameter(request, "obl_rdem_usr_id", ""));
		setDestCltRcvUpdUsrId(JSPUtil.getParameter(request, "dest_clt_rcv_upd_usr_id", ""));
		setOblTtlKnt(JSPUtil.getParameter(request, "obl_ttl_knt", ""));
		setDestN3ptyCltUpdDt(JSPUtil.getParameter(request, "dest_n3pty_clt_upd_dt", ""));
		setRqstIssPlcNm(JSPUtil.getParameter(request, "rqst_iss_plc_nm", ""));
		setDestN3ptyCltCd(JSPUtil.getParameter(request, "dest_n3pty_clt_cd", ""));
		setCstmsEntrCd(JSPUtil.getParameter(request, "cstms_entr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCstmsClrWhNm(JSPUtil.getParameter(request, "cstms_clr_wh_nm", ""));
		setBlPrfShprDt(JSPUtil.getParameter(request, "bl_prf_shpr_dt", ""));
		setOblIssTpCd(JSPUtil.getParameter(request, "obl_iss_tp_cd", ""));
		setOtrDocRcvOfcCd(JSPUtil.getParameter(request, "otr_doc_rcv_ofc_cd", ""));
		setOrgPpdRcvUpdDt(JSPUtil.getParameter(request, "org_ppd_rcv_upd_dt", ""));
		setOtrDocRcvUsrId(JSPUtil.getParameter(request, "otr_doc_rcv_usr_id", ""));
		setOblInetFlg(JSPUtil.getParameter(request, "obl_inet_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDestN3ptyCltUpdOfcCd(JSPUtil.getParameter(request, "dest_n3pty_clt_upd_ofc_cd", ""));
		setOtrDocCgorFlg(JSPUtil.getParameter(request, "otr_doc_cgor_flg", ""));
		setBlPrfShprFlg(JSPUtil.getParameter(request, "bl_prf_shpr_flg", ""));
		setBlRdyTpCd(JSPUtil.getParameter(request, "bl_rdy_tp_cd", ""));
		setBlPrnViaCd(JSPUtil.getParameter(request, "bl_prn_via_cd", ""));
		setIbdDocRcvDt(JSPUtil.getParameter(request, "ibd_doc_rcv_dt", ""));
		setBlOtrDocRcvCd(JSPUtil.getParameter(request, "bl_otr_doc_rcv_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBlCpyKnt(JSPUtil.getParameter(request, "bl_cpy_knt", ""));
		setOblIssFlg(JSPUtil.getParameter(request, "obl_iss_flg", ""));
		setOrgPpdRcvCd(JSPUtil.getParameter(request, "org_ppd_rcv_cd", ""));
		setCpyTtlKnt(JSPUtil.getParameter(request, "cpy_ttl_knt", ""));
		setOblIssKnt(JSPUtil.getParameter(request, "obl_iss_knt", ""));
		setDestCltRcvCd(JSPUtil.getParameter(request, "dest_clt_rcv_cd", ""));
		setIbdDocRcvFlg(JSPUtil.getParameter(request, "ibd_doc_rcv_flg", ""));
		setOrgN3ptyPpdUpdOfcCd(JSPUtil.getParameter(request, "org_n3pty_ppd_upd_ofc_cd", ""));
		setOrgN3ptyPpdUpdUsrId(JSPUtil.getParameter(request, "org_n3pty_ppd_upd_usr_id", ""));
		setBlDeToCd(JSPUtil.getParameter(request, "bl_de_to_cd", ""));
		setDestCltRcvUpdOfcCd(JSPUtil.getParameter(request, "dest_clt_rcv_upd_ofc_cd", ""));
		setOtrDocRcvDt(JSPUtil.getParameter(request, "otr_doc_rcv_dt", ""));
		setOblRlseFlg(JSPUtil.getParameter(request, "obl_rlse_flg", ""));
		setOblRdemKnt(JSPUtil.getParameter(request, "obl_rdem_knt", ""));
		setBlPrfShprUsrId(JSPUtil.getParameter(request, "bl_prf_shpr_usr_id", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setBlDeMzdCd(JSPUtil.getParameter(request, "bl_de_mzd_cd", ""));
		setBlRdyOfcCd(JSPUtil.getParameter(request, "bl_rdy_ofc_cd", ""));
		setOblRdemUpdUsrId(JSPUtil.getParameter(request, "obl_rdem_upd_usr_id", ""));
		setOblRdemOfcCd(JSPUtil.getParameter(request, "obl_rdem_ofc_cd", ""));
		setBlPrfShprOfcCd(JSPUtil.getParameter(request, "bl_prf_shpr_ofc_cd", ""));
		setOblIssRmk(JSPUtil.getParameter(request, "obl_iss_rmk", ""));
		setWblPrnFlg(JSPUtil.getParameter(request, "wbl_prn_flg", ""));
		setBlIssTpCd(JSPUtil.getParameter(request, "bl_iss_tp_cd", ""));
		setInetCtrlPtyNm(JSPUtil.getParameter(request, "inet_ctrl_pty_nm", ""));
		setInetCtrlPtyNo(JSPUtil.getParameter(request, "inet_ctrl_pty_no", ""));
		setFtpSndFlg(JSPUtil.getParameter(request, "ftp_snd_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgBlIssVO[]
	 */
	public BkgBlIssVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgBlIssVO[]
	 */
	public BkgBlIssVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgBlIssVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] oblRtInclKnt = (JSPUtil.getParameter(request, prefix	+ "obl_rt_incl_knt", length));
			String[] oblInetPrnDt = (JSPUtil.getParameter(request, prefix	+ "obl_inet_prn_dt", length));
			String[] nonNegoRtXcldKnt = (JSPUtil.getParameter(request, prefix	+ "non_nego_rt_xcld_knt", length));
			String[] blRdyFlg = (JSPUtil.getParameter(request, prefix	+ "bl_rdy_flg", length));
			String[] oblPrnFlg = (JSPUtil.getParameter(request, prefix	+ "obl_prn_flg", length));
			String[] oblRtXcldKnt = (JSPUtil.getParameter(request, prefix	+ "obl_rt_xcld_knt", length));
			String[] orgPpdRcvUpdOfcCd = (JSPUtil.getParameter(request, prefix	+ "org_ppd_rcv_upd_ofc_cd", length));
			String[] orgN3ptyPpdCd = (JSPUtil.getParameter(request, prefix	+ "org_n3pty_ppd_cd", length));
			String[] oblIssDt = (JSPUtil.getParameter(request, prefix	+ "obl_iss_dt", length));
			String[] rqstIssDt = (JSPUtil.getParameter(request, prefix	+ "rqst_iss_dt", length));
			String[] ibdDocRcvOfcCd = (JSPUtil.getParameter(request, prefix	+ "ibd_doc_rcv_ofc_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] orgN3ptyPpdUpdDt = (JSPUtil.getParameter(request, prefix	+ "org_n3pty_ppd_upd_dt", length));
			String[] destN3ptyCltUpdUsrId = (JSPUtil.getParameter(request, prefix	+ "dest_n3pty_clt_upd_usr_id", length));
			String[] oblRdemDt = (JSPUtil.getParameter(request, prefix	+ "obl_rdem_dt", length));
			String[] oblInetPrnGdt = (JSPUtil.getParameter(request, prefix	+ "obl_inet_prn_gdt", length));
			String[] oblIssUsrId = (JSPUtil.getParameter(request, prefix	+ "obl_iss_usr_id", length));
			String[] cstmsCntrExpDt = (JSPUtil.getParameter(request, prefix	+ "cstms_cntr_exp_dt", length));
			String[] blRdyDt = (JSPUtil.getParameter(request, prefix	+ "bl_rdy_dt", length));
			String[] ibdDocRcvUsrId = (JSPUtil.getParameter(request, prefix	+ "ibd_doc_rcv_usr_id", length));
			String[] blRdyUsrId = (JSPUtil.getParameter(request, prefix	+ "bl_rdy_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] oblIssOfcCd = (JSPUtil.getParameter(request, prefix	+ "obl_iss_ofc_cd", length));
			String[] orgPpdRcvUpdUsrId = (JSPUtil.getParameter(request, prefix	+ "org_ppd_rcv_upd_usr_id", length));
			String[] nonNegoRtInclKnt = (JSPUtil.getParameter(request, prefix	+ "non_nego_rt_incl_knt", length));
			String[] destCltRcvUpdDt = (JSPUtil.getParameter(request, prefix	+ "dest_clt_rcv_upd_dt", length));
			String[] oblRdemFlg = (JSPUtil.getParameter(request, prefix	+ "obl_rdem_flg", length));
			String[] blDocRqstRmk = (JSPUtil.getParameter(request, prefix	+ "bl_doc_rqst_rmk", length));
			String[] blIssKnt = (JSPUtil.getParameter(request, prefix	+ "bl_iss_knt", length));
			String[] cstmsClrLocCd = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_loc_cd", length));
			String[] rqstBlTpCd = (JSPUtil.getParameter(request, prefix	+ "rqst_bl_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] oblSrndFlg = (JSPUtil.getParameter(request, prefix	+ "obl_srnd_flg", length));
			String[] oblRdemUsrId = (JSPUtil.getParameter(request, prefix	+ "obl_rdem_usr_id", length));
			String[] destCltRcvUpdUsrId = (JSPUtil.getParameter(request, prefix	+ "dest_clt_rcv_upd_usr_id", length));
			String[] oblTtlKnt = (JSPUtil.getParameter(request, prefix	+ "obl_ttl_knt", length));
			String[] destN3ptyCltUpdDt = (JSPUtil.getParameter(request, prefix	+ "dest_n3pty_clt_upd_dt", length));
			String[] rqstIssPlcNm = (JSPUtil.getParameter(request, prefix	+ "rqst_iss_plc_nm", length));
			String[] destN3ptyCltCd = (JSPUtil.getParameter(request, prefix	+ "dest_n3pty_clt_cd", length));
			String[] cstmsEntrCd = (JSPUtil.getParameter(request, prefix	+ "cstms_entr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cstmsClrWhNm = (JSPUtil.getParameter(request, prefix	+ "cstms_clr_wh_nm", length));
			String[] blPrfShprDt = (JSPUtil.getParameter(request, prefix	+ "bl_prf_shpr_dt", length));
			String[] oblIssTpCd = (JSPUtil.getParameter(request, prefix	+ "obl_iss_tp_cd", length));
			String[] otrDocRcvOfcCd = (JSPUtil.getParameter(request, prefix	+ "otr_doc_rcv_ofc_cd", length));
			String[] orgPpdRcvUpdDt = (JSPUtil.getParameter(request, prefix	+ "org_ppd_rcv_upd_dt", length));
			String[] otrDocRcvUsrId = (JSPUtil.getParameter(request, prefix	+ "otr_doc_rcv_usr_id", length));
			String[] oblInetFlg = (JSPUtil.getParameter(request, prefix	+ "obl_inet_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] destN3ptyCltUpdOfcCd = (JSPUtil.getParameter(request, prefix	+ "dest_n3pty_clt_upd_ofc_cd", length));
			String[] otrDocCgorFlg = (JSPUtil.getParameter(request, prefix	+ "otr_doc_cgor_flg", length));
			String[] blPrfShprFlg = (JSPUtil.getParameter(request, prefix	+ "bl_prf_shpr_flg", length));
			String[] blRdyTpCd = (JSPUtil.getParameter(request, prefix	+ "bl_rdy_tp_cd", length));
			String[] blPrnViaCd = (JSPUtil.getParameter(request, prefix	+ "bl_prn_via_cd", length));
			String[] ibdDocRcvDt = (JSPUtil.getParameter(request, prefix	+ "ibd_doc_rcv_dt", length));
			String[] blOtrDocRcvCd = (JSPUtil.getParameter(request, prefix	+ "bl_otr_doc_rcv_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] blCpyKnt = (JSPUtil.getParameter(request, prefix	+ "bl_cpy_knt", length));
			String[] oblIssFlg = (JSPUtil.getParameter(request, prefix	+ "obl_iss_flg", length));
			String[] orgPpdRcvCd = (JSPUtil.getParameter(request, prefix	+ "org_ppd_rcv_cd", length));
			String[] cpyTtlKnt = (JSPUtil.getParameter(request, prefix	+ "cpy_ttl_knt", length));
			String[] oblIssKnt = (JSPUtil.getParameter(request, prefix	+ "obl_iss_knt", length));
			String[] destCltRcvCd = (JSPUtil.getParameter(request, prefix	+ "dest_clt_rcv_cd", length));
			String[] ibdDocRcvFlg = (JSPUtil.getParameter(request, prefix	+ "ibd_doc_rcv_flg", length));
			String[] orgN3ptyPpdUpdOfcCd = (JSPUtil.getParameter(request, prefix	+ "org_n3pty_ppd_upd_ofc_cd", length));
			String[] orgN3ptyPpdUpdUsrId = (JSPUtil.getParameter(request, prefix	+ "org_n3pty_ppd_upd_usr_id", length));
			String[] blDeToCd = (JSPUtil.getParameter(request, prefix	+ "bl_de_to_cd", length));
			String[] destCltRcvUpdOfcCd = (JSPUtil.getParameter(request, prefix	+ "dest_clt_rcv_upd_ofc_cd", length));
			String[] otrDocRcvDt = (JSPUtil.getParameter(request, prefix	+ "otr_doc_rcv_dt", length));
			String[] oblRlseFlg = (JSPUtil.getParameter(request, prefix	+ "obl_rlse_flg", length));
			String[] oblRdemKnt = (JSPUtil.getParameter(request, prefix	+ "obl_rdem_knt", length));
			String[] blPrfShprUsrId = (JSPUtil.getParameter(request, prefix	+ "bl_prf_shpr_usr_id", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] blDeMzdCd = (JSPUtil.getParameter(request, prefix	+ "bl_de_mzd_cd", length));
			String[] blRdyOfcCd = (JSPUtil.getParameter(request, prefix	+ "bl_rdy_ofc_cd", length));
			String[] oblRdemUpdUsrId = (JSPUtil.getParameter(request, prefix	+ "obl_rdem_upd_usr_id", length));
			String[] oblRdemOfcCd = (JSPUtil.getParameter(request, prefix	+ "obl_rdem_ofc_cd", length));
			String[] blPrfShprOfcCd = (JSPUtil.getParameter(request, prefix	+ "bl_prf_shpr_ofc_cd", length));
			String[] oblIssRmk = (JSPUtil.getParameter(request, prefix	+ "obl_iss_rmk", length));
			String[] wblPrnFlg = (JSPUtil.getParameter(request, prefix	+ "wbl_prn_flg", length));
			String[] blIssTpCd = (JSPUtil.getParameter(request, prefix + "bl_iss_tp_cd", length));
			String[] inetCtrlPtyNm = (JSPUtil.getParameter(request, prefix + "inet_ctrl_pty_nm", length));
			String[] inetCtrlPtyNo = (JSPUtil.getParameter(request, prefix + "inet_ctrl_pty_no", length));
			String[] ftpSndFlg = (JSPUtil.getParameter(request, prefix + "ftp_snd_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgBlIssVO();
				if (oblRtInclKnt[i] != null)
					model.setOblRtInclKnt(oblRtInclKnt[i]);
				if (oblInetPrnDt[i] != null)
					model.setOblInetPrnDt(oblInetPrnDt[i]);
				if (nonNegoRtXcldKnt[i] != null)
					model.setNonNegoRtXcldKnt(nonNegoRtXcldKnt[i]);
				if (blRdyFlg[i] != null)
					model.setBlRdyFlg(blRdyFlg[i]);
				if (oblPrnFlg[i] != null)
					model.setOblPrnFlg(oblPrnFlg[i]);
				if (oblRtXcldKnt[i] != null)
					model.setOblRtXcldKnt(oblRtXcldKnt[i]);
				if (orgPpdRcvUpdOfcCd[i] != null)
					model.setOrgPpdRcvUpdOfcCd(orgPpdRcvUpdOfcCd[i]);
				if (orgN3ptyPpdCd[i] != null)
					model.setOrgN3ptyPpdCd(orgN3ptyPpdCd[i]);
				if (oblIssDt[i] != null)
					model.setOblIssDt(oblIssDt[i]);
				if (rqstIssDt[i] != null)
					model.setRqstIssDt(rqstIssDt[i]);
				if (ibdDocRcvOfcCd[i] != null)
					model.setIbdDocRcvOfcCd(ibdDocRcvOfcCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (orgN3ptyPpdUpdDt[i] != null)
					model.setOrgN3ptyPpdUpdDt(orgN3ptyPpdUpdDt[i]);
				if (destN3ptyCltUpdUsrId[i] != null)
					model.setDestN3ptyCltUpdUsrId(destN3ptyCltUpdUsrId[i]);
				if (oblRdemDt[i] != null)
					model.setOblRdemDt(oblRdemDt[i]);
				if (oblInetPrnGdt[i] != null)
					model.setOblInetPrnGdt(oblInetPrnGdt[i]);
				if (oblIssUsrId[i] != null)
					model.setOblIssUsrId(oblIssUsrId[i]);
				if (cstmsCntrExpDt[i] != null)
					model.setCstmsCntrExpDt(cstmsCntrExpDt[i]);
				if (blRdyDt[i] != null)
					model.setBlRdyDt(blRdyDt[i]);
				if (ibdDocRcvUsrId[i] != null)
					model.setIbdDocRcvUsrId(ibdDocRcvUsrId[i]);
				if (blRdyUsrId[i] != null)
					model.setBlRdyUsrId(blRdyUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (oblIssOfcCd[i] != null)
					model.setOblIssOfcCd(oblIssOfcCd[i]);
				if (orgPpdRcvUpdUsrId[i] != null)
					model.setOrgPpdRcvUpdUsrId(orgPpdRcvUpdUsrId[i]);
				if (nonNegoRtInclKnt[i] != null)
					model.setNonNegoRtInclKnt(nonNegoRtInclKnt[i]);
				if (destCltRcvUpdDt[i] != null)
					model.setDestCltRcvUpdDt(destCltRcvUpdDt[i]);
				if (oblRdemFlg[i] != null)
					model.setOblRdemFlg(oblRdemFlg[i]);
				if (blDocRqstRmk[i] != null)
					model.setBlDocRqstRmk(blDocRqstRmk[i]);
				if (blIssKnt[i] != null)
					model.setBlIssKnt(blIssKnt[i]);
				if (cstmsClrLocCd[i] != null)
					model.setCstmsClrLocCd(cstmsClrLocCd[i]);
				if (rqstBlTpCd[i] != null)
					model.setRqstBlTpCd(rqstBlTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (oblSrndFlg[i] != null)
					model.setOblSrndFlg(oblSrndFlg[i]);
				if (oblRdemUsrId[i] != null)
					model.setOblRdemUsrId(oblRdemUsrId[i]);
				if (destCltRcvUpdUsrId[i] != null)
					model.setDestCltRcvUpdUsrId(destCltRcvUpdUsrId[i]);
				if (oblTtlKnt[i] != null)
					model.setOblTtlKnt(oblTtlKnt[i]);
				if (destN3ptyCltUpdDt[i] != null)
					model.setDestN3ptyCltUpdDt(destN3ptyCltUpdDt[i]);
				if (rqstIssPlcNm[i] != null)
					model.setRqstIssPlcNm(rqstIssPlcNm[i]);
				if (destN3ptyCltCd[i] != null)
					model.setDestN3ptyCltCd(destN3ptyCltCd[i]);
				if (cstmsEntrCd[i] != null)
					model.setCstmsEntrCd(cstmsEntrCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cstmsClrWhNm[i] != null)
					model.setCstmsClrWhNm(cstmsClrWhNm[i]);
				if (blPrfShprDt[i] != null)
					model.setBlPrfShprDt(blPrfShprDt[i]);
				if (oblIssTpCd[i] != null)
					model.setOblIssTpCd(oblIssTpCd[i]);
				if (otrDocRcvOfcCd[i] != null)
					model.setOtrDocRcvOfcCd(otrDocRcvOfcCd[i]);
				if (orgPpdRcvUpdDt[i] != null)
					model.setOrgPpdRcvUpdDt(orgPpdRcvUpdDt[i]);
				if (otrDocRcvUsrId[i] != null)
					model.setOtrDocRcvUsrId(otrDocRcvUsrId[i]);
				if (oblInetFlg[i] != null)
					model.setOblInetFlg(oblInetFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (destN3ptyCltUpdOfcCd[i] != null)
					model.setDestN3ptyCltUpdOfcCd(destN3ptyCltUpdOfcCd[i]);
				if (otrDocCgorFlg[i] != null)
					model.setOtrDocCgorFlg(otrDocCgorFlg[i]);
				if (blPrfShprFlg[i] != null)
					model.setBlPrfShprFlg(blPrfShprFlg[i]);
				if (blRdyTpCd[i] != null)
					model.setBlRdyTpCd(blRdyTpCd[i]);
				if (blPrnViaCd[i] != null)
					model.setBlPrnViaCd(blPrnViaCd[i]);
				if (ibdDocRcvDt[i] != null)
					model.setIbdDocRcvDt(ibdDocRcvDt[i]);
				if (blOtrDocRcvCd[i] != null)
					model.setBlOtrDocRcvCd(blOtrDocRcvCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (blCpyKnt[i] != null)
					model.setBlCpyKnt(blCpyKnt[i]);
				if (oblIssFlg[i] != null)
					model.setOblIssFlg(oblIssFlg[i]);
				if (orgPpdRcvCd[i] != null)
					model.setOrgPpdRcvCd(orgPpdRcvCd[i]);
				if (cpyTtlKnt[i] != null)
					model.setCpyTtlKnt(cpyTtlKnt[i]);
				if (oblIssKnt[i] != null)
					model.setOblIssKnt(oblIssKnt[i]);
				if (destCltRcvCd[i] != null)
					model.setDestCltRcvCd(destCltRcvCd[i]);
				if (ibdDocRcvFlg[i] != null)
					model.setIbdDocRcvFlg(ibdDocRcvFlg[i]);
				if (orgN3ptyPpdUpdOfcCd[i] != null)
					model.setOrgN3ptyPpdUpdOfcCd(orgN3ptyPpdUpdOfcCd[i]);
				if (orgN3ptyPpdUpdUsrId[i] != null)
					model.setOrgN3ptyPpdUpdUsrId(orgN3ptyPpdUpdUsrId[i]);
				if (blDeToCd[i] != null)
					model.setBlDeToCd(blDeToCd[i]);
				if (destCltRcvUpdOfcCd[i] != null)
					model.setDestCltRcvUpdOfcCd(destCltRcvUpdOfcCd[i]);
				if (otrDocRcvDt[i] != null)
					model.setOtrDocRcvDt(otrDocRcvDt[i]);
				if (oblRlseFlg[i] != null)
					model.setOblRlseFlg(oblRlseFlg[i]);
				if (oblRdemKnt[i] != null)
					model.setOblRdemKnt(oblRdemKnt[i]);
				if (blPrfShprUsrId[i] != null)
					model.setBlPrfShprUsrId(blPrfShprUsrId[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (blDeMzdCd[i] != null)
					model.setBlDeMzdCd(blDeMzdCd[i]);
				if (blRdyOfcCd[i] != null)
					model.setBlRdyOfcCd(blRdyOfcCd[i]);
				if (oblRdemUpdUsrId[i] != null)
					model.setOblRdemUpdUsrId(oblRdemUpdUsrId[i]);
				if (oblRdemOfcCd[i] != null)
					model.setOblRdemOfcCd(oblRdemOfcCd[i]);
				if (blPrfShprOfcCd[i] != null)
					model.setBlPrfShprOfcCd(blPrfShprOfcCd[i]);
				if (oblIssRmk[i] != null)
					model.setOblIssRmk(oblIssRmk[i]);
				if (wblPrnFlg[i] != null)
					model.setWblPrnFlg(wblPrnFlg[i]);
				if (blIssTpCd[i] != null)
					model.setBlIssTpCd(blIssTpCd[i]);
				if (inetCtrlPtyNm[i] != null)
					model.setInetCtrlPtyNm(inetCtrlPtyNm[i]);
				if (inetCtrlPtyNo[i] != null)
					model.setInetCtrlPtyNo(inetCtrlPtyNo[i]);
				if (ftpSndFlg[i] != null)
					model.setFtpSndFlg(ftpSndFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgBlIssVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgBlIssVO[]
	 */
	public BkgBlIssVO[] getBkgBlIssVOs(){
		BkgBlIssVO[] vos = (BkgBlIssVO[])models.toArray(new BkgBlIssVO[models.size()]);
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
		this.oblRtInclKnt = this.oblRtInclKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblInetPrnDt = this.oblInetPrnDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nonNegoRtXcldKnt = this.nonNegoRtXcldKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRdyFlg = this.blRdyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblPrnFlg = this.oblPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRtXcldKnt = this.oblRtXcldKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPpdRcvUpdOfcCd = this.orgPpdRcvUpdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgN3ptyPpdCd = this.orgN3ptyPpdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssDt = this.oblIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstIssDt = this.rqstIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdDocRcvOfcCd = this.ibdDocRcvOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgN3ptyPpdUpdDt = this.orgN3ptyPpdUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destN3ptyCltUpdUsrId = this.destN3ptyCltUpdUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRdemDt = this.oblRdemDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblInetPrnGdt = this.oblInetPrnGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssUsrId = this.oblIssUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsCntrExpDt = this.cstmsCntrExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRdyDt = this.blRdyDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdDocRcvUsrId = this.ibdDocRcvUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRdyUsrId = this.blRdyUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssOfcCd = this.oblIssOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPpdRcvUpdUsrId = this.orgPpdRcvUpdUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nonNegoRtInclKnt = this.nonNegoRtInclKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destCltRcvUpdDt = this.destCltRcvUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRdemFlg = this.oblRdemFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blDocRqstRmk = this.blDocRqstRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blIssKnt = this.blIssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrLocCd = this.cstmsClrLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstBlTpCd = this.rqstBlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblSrndFlg = this.oblSrndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRdemUsrId = this.oblRdemUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destCltRcvUpdUsrId = this.destCltRcvUpdUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblTtlKnt = this.oblTtlKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destN3ptyCltUpdDt = this.destN3ptyCltUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstIssPlcNm = this.rqstIssPlcNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destN3ptyCltCd = this.destN3ptyCltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsEntrCd = this.cstmsEntrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsClrWhNm = this.cstmsClrWhNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrfShprDt = this.blPrfShprDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssTpCd = this.oblIssTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrDocRcvOfcCd = this.otrDocRcvOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPpdRcvUpdDt = this.orgPpdRcvUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrDocRcvUsrId = this.otrDocRcvUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblInetFlg = this.oblInetFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destN3ptyCltUpdOfcCd = this.destN3ptyCltUpdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrDocCgorFlg = this.otrDocCgorFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrfShprFlg = this.blPrfShprFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRdyTpCd = this.blRdyTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrnViaCd = this.blPrnViaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdDocRcvDt = this.ibdDocRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blOtrDocRcvCd = this.blOtrDocRcvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCpyKnt = this.blCpyKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssFlg = this.oblIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgPpdRcvCd = this.orgPpdRcvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cpyTtlKnt = this.cpyTtlKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssKnt = this.oblIssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destCltRcvCd = this.destCltRcvCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdDocRcvFlg = this.ibdDocRcvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgN3ptyPpdUpdOfcCd = this.orgN3ptyPpdUpdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgN3ptyPpdUpdUsrId = this.orgN3ptyPpdUpdUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blDeToCd = this.blDeToCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.destCltRcvUpdOfcCd = this.destCltRcvUpdOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrDocRcvDt = this.otrDocRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRlseFlg = this.oblRlseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRdemKnt = this.oblRdemKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrfShprUsrId = this.blPrfShprUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blDeMzdCd = this.blDeMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blRdyOfcCd = this.blRdyOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRdemUpdUsrId = this.oblRdemUpdUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblRdemOfcCd = this.oblRdemOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blPrfShprOfcCd = this.blPrfShprOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oblIssRmk = this.oblIssRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wblPrnFlg = this.wblPrnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blIssTpCd = this.blIssTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inetCtrlPtyNm = this.inetCtrlPtyNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inetCtrlPtyNo = this.inetCtrlPtyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ftpSndFlg = this.ftpSndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
