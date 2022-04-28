/*=========================================================
*Copyright(c) 2014 CyberLogitec
*@FileName : MdmVslCntrVO.java
*@FileTitle : MdmVslCntrVO
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

public class MdmVslCntrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmVslCntrVO> models = new ArrayList<MdmVslCntrVO>();
	
	/* Column Info */
	private String mnEngTpDesc = null;
	/* Column Info */
	private String bwthstRpmPwr = null;
	/* Column Info */
	private String vslDpth = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dplCapa = null;
	/* Column Info */
	private String gnrTpDesc = null;
	/* Column Info */
	private String fbdCapa = null;
	/* Column Info */
	private String vslHgt = null;
	/* Column Info */
	private String vslLodLineCertiExpDt = null;
	/* Column Info */
	private String vslSftRdoCertiExpDt = null;
	/* Column Info */
	private String rgstDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rgstPortCd = null;
	/* Column Info */
	private String vslHldKnt = null;
	/* Column Info */
	private String lbpLen = null;
	/* Column Info */
	private String callSgnNo = null;
	/* Column Info */
	private String grsRgstTongWgt = null;
	/* Column Info */
	private String clssNoRgstAreaNm = null;
	/* Column Info */
	private String tlxNo = null;
	/* Column Info */
	private String rfRcptKnt = null;
	/* Column Info */
	private String vslHlNo = null;
	/* Column Info */
	private String lloydNo = null;
	/* Column Info */
	private String suzNetTongWgt = null;
	/* Column Info */
	private String pnmNetTongWgt = null;
	/* Column Info */
	private String rgstNo = null;
	/* Column Info */
	private String vslRmk = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String loaLen = null;
	/* Column Info */
	private String rfRcptMaxKnt = null;
	/* Column Info */
	private String vslLnchDt = null;
	/* Column Info */
	private String vslBldrNm = null;
	/* Column Info */
	private String crwKnt = null;
	/* Column Info */
	private String vslCreOfcCd = null;
	/* Column Info */
	private String vslSftCstruCertiExpDt = null;
	/* Column Info */
	private String blstTnkCapa = null;
	/* Column Info */
	private String pnmGtWgt = null;
	/* Column Info */
	private String bwthstMkrNm = null;
	/* Column Info */
	private String vslClzDt = null;
	/* Column Info */
	private String suzGtWgt = null;
	/* Column Info */
	private String madnVoySuzNetTongWgt = null;
	/* Column Info */
	private String lgtShpTongWgt = null;
	/* Column Info */
	private String foilCapa = null;
	/* Column Info */
	private String vslDeratCertiExpDt = null;
	/* Column Info */
	private String ttlTeuKnt = null;
	/* Column Info */
	private String foilCsm = null;
	/* Column Info */
	private String doilCsm = null;
	/* Column Info */
	private String vslDeDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String dwtWgt = null;
	/* Column Info */
	private String mnEngRpmPwr = null;
	/* Column Info */
	private String crrCd = null;
	/* Column Info */
	private String vslSftEqCertiExpDt = null;
	/* Column Info */
	private String doilCapa = null;
	/* Column Info */
	private String vslClssFlg = null;
	/* Column Info */
	private String frshWtrCapa = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String cntrOpCapa = null;
	/* Column Info */
	private String piclbDesc = null;
	/* Column Info */
	private String vslOwnIndCd = null;
	/* Column Info */
	private String cntrDznCapa = null;
	/* Column Info */
	private String frshWtrCsm = null;
	/* Column Info */
	private String modiVslCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fdrDivCd = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String smrDrftHgt = null;
	/* Column Info */
	private String vslDeltOfcCd = null;
	/* Column Info */
	private String bwthstBhpPwr = null;
	/* Column Info */
	private String vslEdiNm = null;
	/* Column Info */
	private String vslEml = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiIfId = null;
	/* Column Info */
	private String mnEngMkrNm = null;
	/* Column Info */
	private String vslBldAreaNm = null;
	/* Column Info */
	private String gnrBhpPwr = null;
	/* Column Info */
	private String vslHtchKnt = null;
	/* Column Info */
	private String maxSpd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vslRgstCntCd = null;
	/* Column Info */
	private String vslEngNm = null;
	/* Column Info */
	private String cntrPnmCapa = null;
	/* Column Info */
	private String gnrRpmPwr = null;
	/* Column Info */
	private String vslClssNo = null;
	/* Column Info */
	private String netRgstTongWgt = null;
	/* Column Info */
	private String vslLoclNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String vslBldCd = null;
	/* Column Info */
	private String bwthstTpDesc = null;
	/* Column Info */
	private String ecnSpd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String mnEngBhpPwr = null;
	/* Column Info */
	private String cntrVslClssCapa = null;
	/* Column Info */
	private String vslKelLyDt = null;
	/* Column Info */
	private String intlTongCertiFlg = null;
	/* Column Info */
	private String vslWdt = null;
	/* Column Info */
	private String vslSvcSpd = null;
	/* Column Info */
	private String gnrMkrNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public MdmVslCntrVO() {}

	public MdmVslCntrVO(String ibflag, String pagerows, String vslCd, String vslClssFlg, String vslEngNm, String vslLoclNm, String foilCapa, String doilCapa, String frshWtrCapa, String callSgnNo, String rgstNo, String phnNo, String faxNo, String tlxNo, String vslEml, String piclbDesc, String rgstPortCd, String clssNoRgstAreaNm, String vslClssNo, String vslBldrNm, String loaLen, String lbpLen, String vslWdt, String vslDpth, String smrDrftHgt, String dwtWgt, String lgtShpTongWgt, String grsRgstTongWgt, String netRgstTongWgt, String pnmGtWgt, String pnmNetTongWgt, String suzGtWgt, String suzNetTongWgt, String mnEngMkrNm, String mnEngTpDesc, String mnEngBhpPwr, String vslOwnIndCd, String vslRgstCntCd, String vslBldCd, String crrCd, String fdrDivCd, String vslSvcSpd, String maxSpd, String ecnSpd, String crwKnt, String cntrDznCapa, String cntrOpCapa, String cntrPnmCapa, String cntrVslClssCapa, String rfRcptKnt, String rfRcptMaxKnt, String fbdCapa, String dplCapa, String blstTnkCapa, String foilCsm, String doilCsm, String frshWtrCsm, String mnEngRpmPwr, String gnrRpmPwr, String vslHgt, String rgstDt, String vslEdiNm, String coCd, String vslClzDt, String vslCreOfcCd, String vslDeltOfcCd, String vslBldAreaNm, String gnrMkrNm, String gnrTpDesc, String gnrBhpPwr, String bwthstMkrNm, String bwthstTpDesc, String bwthstBhpPwr, String bwthstRpmPwr, String lloydNo, String vslLnchDt, String vslDeDt, String vslKelLyDt, String vslHlNo, String ttlTeuKnt, String vslHtchKnt, String vslHldKnt, String vslRmk, String intlTongCertiFlg, String madnVoySuzNetTongWgt, String vslSftCstruCertiExpDt, String vslSftRdoCertiExpDt, String vslSftEqCertiExpDt, String vslLodLineCertiExpDt, String vslDeratCertiExpDt, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId, String modiVslCd) {
		this.mnEngTpDesc = mnEngTpDesc;
		this.bwthstRpmPwr = bwthstRpmPwr;
		this.vslDpth = vslDpth;
		this.pagerows = pagerows;
		this.dplCapa = dplCapa;
		this.gnrTpDesc = gnrTpDesc;
		this.fbdCapa = fbdCapa;
		this.vslHgt = vslHgt;
		this.vslLodLineCertiExpDt = vslLodLineCertiExpDt;
		this.vslSftRdoCertiExpDt = vslSftRdoCertiExpDt;
		this.rgstDt = rgstDt;
		this.updUsrId = updUsrId;
		this.rgstPortCd = rgstPortCd;
		this.vslHldKnt = vslHldKnt;
		this.lbpLen = lbpLen;
		this.callSgnNo = callSgnNo;
		this.grsRgstTongWgt = grsRgstTongWgt;
		this.clssNoRgstAreaNm = clssNoRgstAreaNm;
		this.tlxNo = tlxNo;
		this.rfRcptKnt = rfRcptKnt;
		this.vslHlNo = vslHlNo;
		this.lloydNo = lloydNo;
		this.suzNetTongWgt = suzNetTongWgt;
		this.pnmNetTongWgt = pnmNetTongWgt;
		this.rgstNo = rgstNo;
		this.vslRmk = vslRmk;
		this.deltFlg = deltFlg;
		this.loaLen = loaLen;
		this.rfRcptMaxKnt = rfRcptMaxKnt;
		this.vslLnchDt = vslLnchDt;
		this.vslBldrNm = vslBldrNm;
		this.crwKnt = crwKnt;
		this.vslCreOfcCd = vslCreOfcCd;
		this.vslSftCstruCertiExpDt = vslSftCstruCertiExpDt;
		this.blstTnkCapa = blstTnkCapa;
		this.pnmGtWgt = pnmGtWgt;
		this.bwthstMkrNm = bwthstMkrNm;
		this.vslClzDt = vslClzDt;
		this.suzGtWgt = suzGtWgt;
		this.madnVoySuzNetTongWgt = madnVoySuzNetTongWgt;
		this.lgtShpTongWgt = lgtShpTongWgt;
		this.foilCapa = foilCapa;
		this.vslDeratCertiExpDt = vslDeratCertiExpDt;
		this.ttlTeuKnt = ttlTeuKnt;
		this.foilCsm = foilCsm;
		this.doilCsm = doilCsm;
		this.vslDeDt = vslDeDt;
		this.vslCd = vslCd;
		this.dwtWgt = dwtWgt;
		this.mnEngRpmPwr = mnEngRpmPwr;
		this.crrCd = crrCd;
		this.vslSftEqCertiExpDt = vslSftEqCertiExpDt;
		this.doilCapa = doilCapa;
		this.vslClssFlg = vslClssFlg;
		this.frshWtrCapa = frshWtrCapa;
		this.phnNo = phnNo;
		this.cntrOpCapa = cntrOpCapa;
		this.piclbDesc = piclbDesc;
		this.vslOwnIndCd = vslOwnIndCd;
		this.cntrDznCapa = cntrDznCapa;
		this.frshWtrCsm = frshWtrCsm;
		this.modiVslCd = modiVslCd;
		this.creUsrId = creUsrId;
		this.fdrDivCd = fdrDivCd;
		this.faxNo = faxNo;
		this.smrDrftHgt = smrDrftHgt;
		this.vslDeltOfcCd = vslDeltOfcCd;
		this.bwthstBhpPwr = bwthstBhpPwr;
		this.vslEdiNm = vslEdiNm;
		this.vslEml = vslEml;
		this.creDt = creDt;
		this.eaiIfId = eaiIfId;
		this.mnEngMkrNm = mnEngMkrNm;
		this.vslBldAreaNm = vslBldAreaNm;
		this.gnrBhpPwr = gnrBhpPwr;
		this.vslHtchKnt = vslHtchKnt;
		this.maxSpd = maxSpd;
		this.ibflag = ibflag;
		this.vslRgstCntCd = vslRgstCntCd;
		this.vslEngNm = vslEngNm;
		this.cntrPnmCapa = cntrPnmCapa;
		this.gnrRpmPwr = gnrRpmPwr;
		this.vslClssNo = vslClssNo;
		this.netRgstTongWgt = netRgstTongWgt;
		this.vslLoclNm = vslLoclNm;
		this.updDt = updDt;
		this.coCd = coCd;
		this.vslBldCd = vslBldCd;
		this.bwthstTpDesc = bwthstTpDesc;
		this.ecnSpd = ecnSpd;
		this.eaiEvntDt = eaiEvntDt;
		this.mnEngBhpPwr = mnEngBhpPwr;
		this.cntrVslClssCapa = cntrVslClssCapa;
		this.vslKelLyDt = vslKelLyDt;
		this.intlTongCertiFlg = intlTongCertiFlg;
		this.vslWdt = vslWdt;
		this.vslSvcSpd = vslSvcSpd;
		this.gnrMkrNm = gnrMkrNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("mn_eng_tp_desc", getMnEngTpDesc());
		this.hashColumns.put("bwthst_rpm_pwr", getBwthstRpmPwr());
		this.hashColumns.put("vsl_dpth", getVslDpth());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dpl_capa", getDplCapa());
		this.hashColumns.put("gnr_tp_desc", getGnrTpDesc());
		this.hashColumns.put("fbd_capa", getFbdCapa());
		this.hashColumns.put("vsl_hgt", getVslHgt());
		this.hashColumns.put("vsl_lod_line_certi_exp_dt", getVslLodLineCertiExpDt());
		this.hashColumns.put("vsl_sft_rdo_certi_exp_dt", getVslSftRdoCertiExpDt());
		this.hashColumns.put("rgst_dt", getRgstDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rgst_port_cd", getRgstPortCd());
		this.hashColumns.put("vsl_hld_knt", getVslHldKnt());
		this.hashColumns.put("lbp_len", getLbpLen());
		this.hashColumns.put("call_sgn_no", getCallSgnNo());
		this.hashColumns.put("grs_rgst_tong_wgt", getGrsRgstTongWgt());
		this.hashColumns.put("clss_no_rgst_area_nm", getClssNoRgstAreaNm());
		this.hashColumns.put("tlx_no", getTlxNo());
		this.hashColumns.put("rf_rcpt_knt", getRfRcptKnt());
		this.hashColumns.put("vsl_hl_no", getVslHlNo());
		this.hashColumns.put("lloyd_no", getLloydNo());
		this.hashColumns.put("suz_net_tong_wgt", getSuzNetTongWgt());
		this.hashColumns.put("pnm_net_tong_wgt", getPnmNetTongWgt());
		this.hashColumns.put("rgst_no", getRgstNo());
		this.hashColumns.put("vsl_rmk", getVslRmk());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("loa_len", getLoaLen());
		this.hashColumns.put("rf_rcpt_max_knt", getRfRcptMaxKnt());
		this.hashColumns.put("vsl_lnch_dt", getVslLnchDt());
		this.hashColumns.put("vsl_bldr_nm", getVslBldrNm());
		this.hashColumns.put("crw_knt", getCrwKnt());
		this.hashColumns.put("vsl_cre_ofc_cd", getVslCreOfcCd());
		this.hashColumns.put("vsl_sft_cstru_certi_exp_dt", getVslSftCstruCertiExpDt());
		this.hashColumns.put("blst_tnk_capa", getBlstTnkCapa());
		this.hashColumns.put("pnm_gt_wgt", getPnmGtWgt());
		this.hashColumns.put("bwthst_mkr_nm", getBwthstMkrNm());
		this.hashColumns.put("vsl_clz_dt", getVslClzDt());
		this.hashColumns.put("suz_gt_wgt", getSuzGtWgt());
		this.hashColumns.put("madn_voy_suz_net_tong_wgt", getMadnVoySuzNetTongWgt());
		this.hashColumns.put("lgt_shp_tong_wgt", getLgtShpTongWgt());
		this.hashColumns.put("foil_capa", getFoilCapa());
		this.hashColumns.put("vsl_derat_certi_exp_dt", getVslDeratCertiExpDt());
		this.hashColumns.put("ttl_teu_knt", getTtlTeuKnt());
		this.hashColumns.put("foil_csm", getFoilCsm());
		this.hashColumns.put("doil_csm", getDoilCsm());
		this.hashColumns.put("vsl_de_dt", getVslDeDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("dwt_wgt", getDwtWgt());
		this.hashColumns.put("mn_eng_rpm_pwr", getMnEngRpmPwr());
		this.hashColumns.put("crr_cd", getCrrCd());
		this.hashColumns.put("vsl_sft_eq_certi_exp_dt", getVslSftEqCertiExpDt());
		this.hashColumns.put("doil_capa", getDoilCapa());
		this.hashColumns.put("vsl_clss_flg", getVslClssFlg());
		this.hashColumns.put("frsh_wtr_capa", getFrshWtrCapa());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("cntr_op_capa", getCntrOpCapa());
		this.hashColumns.put("piclb_desc", getPiclbDesc());
		this.hashColumns.put("vsl_own_ind_cd", getVslOwnIndCd());
		this.hashColumns.put("cntr_dzn_capa", getCntrDznCapa());
		this.hashColumns.put("frsh_wtr_csm", getFrshWtrCsm());
		this.hashColumns.put("modi_vsl_cd", getModiVslCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("fdr_div_cd", getFdrDivCd());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("smr_drft_hgt", getSmrDrftHgt());
		this.hashColumns.put("vsl_delt_ofc_cd", getVslDeltOfcCd());
		this.hashColumns.put("bwthst_bhp_pwr", getBwthstBhpPwr());
		this.hashColumns.put("vsl_edi_nm", getVslEdiNm());
		this.hashColumns.put("vsl_eml", getVslEml());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		this.hashColumns.put("mn_eng_mkr_nm", getMnEngMkrNm());
		this.hashColumns.put("vsl_bld_area_nm", getVslBldAreaNm());
		this.hashColumns.put("gnr_bhp_pwr", getGnrBhpPwr());
		this.hashColumns.put("vsl_htch_knt", getVslHtchKnt());
		this.hashColumns.put("max_spd", getMaxSpd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vsl_rgst_cnt_cd", getVslRgstCntCd());
		this.hashColumns.put("vsl_eng_nm", getVslEngNm());
		this.hashColumns.put("cntr_pnm_capa", getCntrPnmCapa());
		this.hashColumns.put("gnr_rpm_pwr", getGnrRpmPwr());
		this.hashColumns.put("vsl_clss_no", getVslClssNo());
		this.hashColumns.put("net_rgst_tong_wgt", getNetRgstTongWgt());
		this.hashColumns.put("vsl_locl_nm", getVslLoclNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("vsl_bld_cd", getVslBldCd());
		this.hashColumns.put("bwthst_tp_desc", getBwthstTpDesc());
		this.hashColumns.put("ecn_spd", getEcnSpd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("mn_eng_bhp_pwr", getMnEngBhpPwr());
		this.hashColumns.put("cntr_vsl_clss_capa", getCntrVslClssCapa());
		this.hashColumns.put("vsl_kel_ly_dt", getVslKelLyDt());
		this.hashColumns.put("intl_tong_certi_flg", getIntlTongCertiFlg());
		this.hashColumns.put("vsl_wdt", getVslWdt());
		this.hashColumns.put("vsl_svc_spd", getVslSvcSpd());
		this.hashColumns.put("gnr_mkr_nm", getGnrMkrNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("mn_eng_tp_desc", "mnEngTpDesc");
		this.hashFields.put("bwthst_rpm_pwr", "bwthstRpmPwr");
		this.hashFields.put("vsl_dpth", "vslDpth");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dpl_capa", "dplCapa");
		this.hashFields.put("gnr_tp_desc", "gnrTpDesc");
		this.hashFields.put("fbd_capa", "fbdCapa");
		this.hashFields.put("vsl_hgt", "vslHgt");
		this.hashFields.put("vsl_lod_line_certi_exp_dt", "vslLodLineCertiExpDt");
		this.hashFields.put("vsl_sft_rdo_certi_exp_dt", "vslSftRdoCertiExpDt");
		this.hashFields.put("rgst_dt", "rgstDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rgst_port_cd", "rgstPortCd");
		this.hashFields.put("vsl_hld_knt", "vslHldKnt");
		this.hashFields.put("lbp_len", "lbpLen");
		this.hashFields.put("call_sgn_no", "callSgnNo");
		this.hashFields.put("grs_rgst_tong_wgt", "grsRgstTongWgt");
		this.hashFields.put("clss_no_rgst_area_nm", "clssNoRgstAreaNm");
		this.hashFields.put("tlx_no", "tlxNo");
		this.hashFields.put("rf_rcpt_knt", "rfRcptKnt");
		this.hashFields.put("vsl_hl_no", "vslHlNo");
		this.hashFields.put("lloyd_no", "lloydNo");
		this.hashFields.put("suz_net_tong_wgt", "suzNetTongWgt");
		this.hashFields.put("pnm_net_tong_wgt", "pnmNetTongWgt");
		this.hashFields.put("rgst_no", "rgstNo");
		this.hashFields.put("vsl_rmk", "vslRmk");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("loa_len", "loaLen");
		this.hashFields.put("rf_rcpt_max_knt", "rfRcptMaxKnt");
		this.hashFields.put("vsl_lnch_dt", "vslLnchDt");
		this.hashFields.put("vsl_bldr_nm", "vslBldrNm");
		this.hashFields.put("crw_knt", "crwKnt");
		this.hashFields.put("vsl_cre_ofc_cd", "vslCreOfcCd");
		this.hashFields.put("vsl_sft_cstru_certi_exp_dt", "vslSftCstruCertiExpDt");
		this.hashFields.put("blst_tnk_capa", "blstTnkCapa");
		this.hashFields.put("pnm_gt_wgt", "pnmGtWgt");
		this.hashFields.put("bwthst_mkr_nm", "bwthstMkrNm");
		this.hashFields.put("vsl_clz_dt", "vslClzDt");
		this.hashFields.put("suz_gt_wgt", "suzGtWgt");
		this.hashFields.put("madn_voy_suz_net_tong_wgt", "madnVoySuzNetTongWgt");
		this.hashFields.put("lgt_shp_tong_wgt", "lgtShpTongWgt");
		this.hashFields.put("foil_capa", "foilCapa");
		this.hashFields.put("vsl_derat_certi_exp_dt", "vslDeratCertiExpDt");
		this.hashFields.put("ttl_teu_knt", "ttlTeuKnt");
		this.hashFields.put("foil_csm", "foilCsm");
		this.hashFields.put("doil_csm", "doilCsm");
		this.hashFields.put("vsl_de_dt", "vslDeDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("dwt_wgt", "dwtWgt");
		this.hashFields.put("mn_eng_rpm_pwr", "mnEngRpmPwr");
		this.hashFields.put("crr_cd", "crrCd");
		this.hashFields.put("vsl_sft_eq_certi_exp_dt", "vslSftEqCertiExpDt");
		this.hashFields.put("doil_capa", "doilCapa");
		this.hashFields.put("vsl_clss_flg", "vslClssFlg");
		this.hashFields.put("frsh_wtr_capa", "frshWtrCapa");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("cntr_op_capa", "cntrOpCapa");
		this.hashFields.put("piclb_desc", "piclbDesc");
		this.hashFields.put("vsl_own_ind_cd", "vslOwnIndCd");
		this.hashFields.put("cntr_dzn_capa", "cntrDznCapa");
		this.hashFields.put("frsh_wtr_csm", "frshWtrCsm");
		this.hashFields.put("modi_vsl_cd", "modiVslCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("fdr_div_cd", "fdrDivCd");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("smr_drft_hgt", "smrDrftHgt");
		this.hashFields.put("vsl_delt_ofc_cd", "vslDeltOfcCd");
		this.hashFields.put("bwthst_bhp_pwr", "bwthstBhpPwr");
		this.hashFields.put("vsl_edi_nm", "vslEdiNm");
		this.hashFields.put("vsl_eml", "vslEml");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_if_id", "eaiIfId");
		this.hashFields.put("mn_eng_mkr_nm", "mnEngMkrNm");
		this.hashFields.put("vsl_bld_area_nm", "vslBldAreaNm");
		this.hashFields.put("gnr_bhp_pwr", "gnrBhpPwr");
		this.hashFields.put("vsl_htch_knt", "vslHtchKnt");
		this.hashFields.put("max_spd", "maxSpd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vsl_rgst_cnt_cd", "vslRgstCntCd");
		this.hashFields.put("vsl_eng_nm", "vslEngNm");
		this.hashFields.put("cntr_pnm_capa", "cntrPnmCapa");
		this.hashFields.put("gnr_rpm_pwr", "gnrRpmPwr");
		this.hashFields.put("vsl_clss_no", "vslClssNo");
		this.hashFields.put("net_rgst_tong_wgt", "netRgstTongWgt");
		this.hashFields.put("vsl_locl_nm", "vslLoclNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("vsl_bld_cd", "vslBldCd");
		this.hashFields.put("bwthst_tp_desc", "bwthstTpDesc");
		this.hashFields.put("ecn_spd", "ecnSpd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("mn_eng_bhp_pwr", "mnEngBhpPwr");
		this.hashFields.put("cntr_vsl_clss_capa", "cntrVslClssCapa");
		this.hashFields.put("vsl_kel_ly_dt", "vslKelLyDt");
		this.hashFields.put("intl_tong_certi_flg", "intlTongCertiFlg");
		this.hashFields.put("vsl_wdt", "vslWdt");
		this.hashFields.put("vsl_svc_spd", "vslSvcSpd");
		this.hashFields.put("gnr_mkr_nm", "gnrMkrNm");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return mnEngTpDesc
	 */
	public String getMnEngTpDesc() {
		return this.mnEngTpDesc;
	}
	
	/**
	 * Column Info
	 * @return bwthstRpmPwr
	 */
	public String getBwthstRpmPwr() {
		return this.bwthstRpmPwr;
	}
	
	/**
	 * Column Info
	 * @return vslDpth
	 */
	public String getVslDpth() {
		return this.vslDpth;
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
	 * @return dplCapa
	 */
	public String getDplCapa() {
		return this.dplCapa;
	}
	
	/**
	 * Column Info
	 * @return gnrTpDesc
	 */
	public String getGnrTpDesc() {
		return this.gnrTpDesc;
	}
	
	/**
	 * Column Info
	 * @return fbdCapa
	 */
	public String getFbdCapa() {
		return this.fbdCapa;
	}
	
	/**
	 * Column Info
	 * @return vslHgt
	 */
	public String getVslHgt() {
		return this.vslHgt;
	}
	
	/**
	 * Column Info
	 * @return vslLodLineCertiExpDt
	 */
	public String getVslLodLineCertiExpDt() {
		return this.vslLodLineCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @return vslSftRdoCertiExpDt
	 */
	public String getVslSftRdoCertiExpDt() {
		return this.vslSftRdoCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @return rgstDt
	 */
	public String getRgstDt() {
		return this.rgstDt;
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
	 * @return rgstPortCd
	 */
	public String getRgstPortCd() {
		return this.rgstPortCd;
	}
	
	/**
	 * Column Info
	 * @return vslHldKnt
	 */
	public String getVslHldKnt() {
		return this.vslHldKnt;
	}
	
	/**
	 * Column Info
	 * @return lbpLen
	 */
	public String getLbpLen() {
		return this.lbpLen;
	}
	
	/**
	 * Column Info
	 * @return callSgnNo
	 */
	public String getCallSgnNo() {
		return this.callSgnNo;
	}
	
	/**
	 * Column Info
	 * @return grsRgstTongWgt
	 */
	public String getGrsRgstTongWgt() {
		return this.grsRgstTongWgt;
	}
	
	/**
	 * Column Info
	 * @return clssNoRgstAreaNm
	 */
	public String getClssNoRgstAreaNm() {
		return this.clssNoRgstAreaNm;
	}
	
	/**
	 * Column Info
	 * @return tlxNo
	 */
	public String getTlxNo() {
		return this.tlxNo;
	}
	
	/**
	 * Column Info
	 * @return rfRcptKnt
	 */
	public String getRfRcptKnt() {
		return this.rfRcptKnt;
	}
	
	/**
	 * Column Info
	 * @return vslHlNo
	 */
	public String getVslHlNo() {
		return this.vslHlNo;
	}
	
	/**
	 * Column Info
	 * @return lloydNo
	 */
	public String getLloydNo() {
		return this.lloydNo;
	}
	
	/**
	 * Column Info
	 * @return suzNetTongWgt
	 */
	public String getSuzNetTongWgt() {
		return this.suzNetTongWgt;
	}
	
	/**
	 * Column Info
	 * @return pnmNetTongWgt
	 */
	public String getPnmNetTongWgt() {
		return this.pnmNetTongWgt;
	}
	
	/**
	 * Column Info
	 * @return rgstNo
	 */
	public String getRgstNo() {
		return this.rgstNo;
	}
	
	/**
	 * Column Info
	 * @return vslRmk
	 */
	public String getVslRmk() {
		return this.vslRmk;
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
	 * @return loaLen
	 */
	public String getLoaLen() {
		return this.loaLen;
	}
	
	/**
	 * Column Info
	 * @return rfRcptMaxKnt
	 */
	public String getRfRcptMaxKnt() {
		return this.rfRcptMaxKnt;
	}
	
	/**
	 * Column Info
	 * @return vslLnchDt
	 */
	public String getVslLnchDt() {
		return this.vslLnchDt;
	}
	
	/**
	 * Column Info
	 * @return vslBldrNm
	 */
	public String getVslBldrNm() {
		return this.vslBldrNm;
	}
	
	/**
	 * Column Info
	 * @return crwKnt
	 */
	public String getCrwKnt() {
		return this.crwKnt;
	}
	
	/**
	 * Column Info
	 * @return vslCreOfcCd
	 */
	public String getVslCreOfcCd() {
		return this.vslCreOfcCd;
	}
	
	/**
	 * Column Info
	 * @return vslSftCstruCertiExpDt
	 */
	public String getVslSftCstruCertiExpDt() {
		return this.vslSftCstruCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @return blstTnkCapa
	 */
	public String getBlstTnkCapa() {
		return this.blstTnkCapa;
	}
	
	/**
	 * Column Info
	 * @return pnmGtWgt
	 */
	public String getPnmGtWgt() {
		return this.pnmGtWgt;
	}
	
	/**
	 * Column Info
	 * @return bwthstMkrNm
	 */
	public String getBwthstMkrNm() {
		return this.bwthstMkrNm;
	}
	
	/**
	 * Column Info
	 * @return vslClzDt
	 */
	public String getVslClzDt() {
		return this.vslClzDt;
	}
	
	/**
	 * Column Info
	 * @return suzGtWgt
	 */
	public String getSuzGtWgt() {
		return this.suzGtWgt;
	}
	
	/**
	 * Column Info
	 * @return madnVoySuzNetTongWgt
	 */
	public String getMadnVoySuzNetTongWgt() {
		return this.madnVoySuzNetTongWgt;
	}
	
	/**
	 * Column Info
	 * @return lgtShpTongWgt
	 */
	public String getLgtShpTongWgt() {
		return this.lgtShpTongWgt;
	}
	
	/**
	 * Column Info
	 * @return foilCapa
	 */
	public String getFoilCapa() {
		return this.foilCapa;
	}
	
	/**
	 * Column Info
	 * @return vslDeratCertiExpDt
	 */
	public String getVslDeratCertiExpDt() {
		return this.vslDeratCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @return ttlTeuKnt
	 */
	public String getTtlTeuKnt() {
		return this.ttlTeuKnt;
	}
	
	/**
	 * Column Info
	 * @return foilCsm
	 */
	public String getFoilCsm() {
		return this.foilCsm;
	}
	
	/**
	 * Column Info
	 * @return doilCsm
	 */
	public String getDoilCsm() {
		return this.doilCsm;
	}
	
	/**
	 * Column Info
	 * @return vslDeDt
	 */
	public String getVslDeDt() {
		return this.vslDeDt;
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
	 * @return dwtWgt
	 */
	public String getDwtWgt() {
		return this.dwtWgt;
	}
	
	/**
	 * Column Info
	 * @return mnEngRpmPwr
	 */
	public String getMnEngRpmPwr() {
		return this.mnEngRpmPwr;
	}
	
	/**
	 * Column Info
	 * @return crrCd
	 */
	public String getCrrCd() {
		return this.crrCd;
	}
	
	/**
	 * Column Info
	 * @return vslSftEqCertiExpDt
	 */
	public String getVslSftEqCertiExpDt() {
		return this.vslSftEqCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @return doilCapa
	 */
	public String getDoilCapa() {
		return this.doilCapa;
	}
	
	/**
	 * Column Info
	 * @return vslClssFlg
	 */
	public String getVslClssFlg() {
		return this.vslClssFlg;
	}
	
	/**
	 * Column Info
	 * @return frshWtrCapa
	 */
	public String getFrshWtrCapa() {
		return this.frshWtrCapa;
	}
	
	/**
	 * Column Info
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return cntrOpCapa
	 */
	public String getCntrOpCapa() {
		return this.cntrOpCapa;
	}
	
	/**
	 * Column Info
	 * @return piclbDesc
	 */
	public String getPiclbDesc() {
		return this.piclbDesc;
	}
	
	/**
	 * Column Info
	 * @return vslOwnIndCd
	 */
	public String getVslOwnIndCd() {
		return this.vslOwnIndCd;
	}
	
	/**
	 * Column Info
	 * @return cntrDznCapa
	 */
	public String getCntrDznCapa() {
		return this.cntrDznCapa;
	}
	
	/**
	 * Column Info
	 * @return frshWtrCsm
	 */
	public String getFrshWtrCsm() {
		return this.frshWtrCsm;
	}
	
	/**
	 * Column Info
	 * @return modiVslCd
	 */
	public String getModiVslCd() {
		return this.modiVslCd;
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
	 * @return fdrDivCd
	 */
	public String getFdrDivCd() {
		return this.fdrDivCd;
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
	 * @return smrDrftHgt
	 */
	public String getSmrDrftHgt() {
		return this.smrDrftHgt;
	}
	
	/**
	 * Column Info
	 * @return vslDeltOfcCd
	 */
	public String getVslDeltOfcCd() {
		return this.vslDeltOfcCd;
	}
	
	/**
	 * Column Info
	 * @return bwthstBhpPwr
	 */
	public String getBwthstBhpPwr() {
		return this.bwthstBhpPwr;
	}
	
	/**
	 * Column Info
	 * @return vslEdiNm
	 */
	public String getVslEdiNm() {
		return this.vslEdiNm;
	}
	
	/**
	 * Column Info
	 * @return vslEml
	 */
	public String getVslEml() {
		return this.vslEml;
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
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	
	/**
	 * Column Info
	 * @return mnEngMkrNm
	 */
	public String getMnEngMkrNm() {
		return this.mnEngMkrNm;
	}
	
	/**
	 * Column Info
	 * @return vslBldAreaNm
	 */
	public String getVslBldAreaNm() {
		return this.vslBldAreaNm;
	}
	
	/**
	 * Column Info
	 * @return gnrBhpPwr
	 */
	public String getGnrBhpPwr() {
		return this.gnrBhpPwr;
	}
	
	/**
	 * Column Info
	 * @return vslHtchKnt
	 */
	public String getVslHtchKnt() {
		return this.vslHtchKnt;
	}
	
	/**
	 * Column Info
	 * @return maxSpd
	 */
	public String getMaxSpd() {
		return this.maxSpd;
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
	 * @return vslRgstCntCd
	 */
	public String getVslRgstCntCd() {
		return this.vslRgstCntCd;
	}
	
	/**
	 * Column Info
	 * @return vslEngNm
	 */
	public String getVslEngNm() {
		return this.vslEngNm;
	}
	
	/**
	 * Column Info
	 * @return cntrPnmCapa
	 */
	public String getCntrPnmCapa() {
		return this.cntrPnmCapa;
	}
	
	/**
	 * Column Info
	 * @return gnrRpmPwr
	 */
	public String getGnrRpmPwr() {
		return this.gnrRpmPwr;
	}
	
	/**
	 * Column Info
	 * @return vslClssNo
	 */
	public String getVslClssNo() {
		return this.vslClssNo;
	}
	
	/**
	 * Column Info
	 * @return netRgstTongWgt
	 */
	public String getNetRgstTongWgt() {
		return this.netRgstTongWgt;
	}
	
	/**
	 * Column Info
	 * @return vslLoclNm
	 */
	public String getVslLoclNm() {
		return this.vslLoclNm;
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
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return vslBldCd
	 */
	public String getVslBldCd() {
		return this.vslBldCd;
	}
	
	/**
	 * Column Info
	 * @return bwthstTpDesc
	 */
	public String getBwthstTpDesc() {
		return this.bwthstTpDesc;
	}
	
	/**
	 * Column Info
	 * @return ecnSpd
	 */
	public String getEcnSpd() {
		return this.ecnSpd;
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
	 * @return mnEngBhpPwr
	 */
	public String getMnEngBhpPwr() {
		return this.mnEngBhpPwr;
	}
	
	/**
	 * Column Info
	 * @return cntrVslClssCapa
	 */
	public String getCntrVslClssCapa() {
		return this.cntrVslClssCapa;
	}
	
	/**
	 * Column Info
	 * @return vslKelLyDt
	 */
	public String getVslKelLyDt() {
		return this.vslKelLyDt;
	}
	
	/**
	 * Column Info
	 * @return intlTongCertiFlg
	 */
	public String getIntlTongCertiFlg() {
		return this.intlTongCertiFlg;
	}
	
	/**
	 * Column Info
	 * @return vslWdt
	 */
	public String getVslWdt() {
		return this.vslWdt;
	}
	
	/**
	 * Column Info
	 * @return vslSvcSpd
	 */
	public String getVslSvcSpd() {
		return this.vslSvcSpd;
	}
	
	/**
	 * Column Info
	 * @return gnrMkrNm
	 */
	public String getGnrMkrNm() {
		return this.gnrMkrNm;
	}
	

	/**
	 * Column Info
	 * @param mnEngTpDesc
	 */
	public void setMnEngTpDesc(String mnEngTpDesc) {
		this.mnEngTpDesc = mnEngTpDesc;
	}
	
	/**
	 * Column Info
	 * @param bwthstRpmPwr
	 */
	public void setBwthstRpmPwr(String bwthstRpmPwr) {
		this.bwthstRpmPwr = bwthstRpmPwr;
	}
	
	/**
	 * Column Info
	 * @param vslDpth
	 */
	public void setVslDpth(String vslDpth) {
		this.vslDpth = vslDpth;
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
	 * @param dplCapa
	 */
	public void setDplCapa(String dplCapa) {
		this.dplCapa = dplCapa;
	}
	
	/**
	 * Column Info
	 * @param gnrTpDesc
	 */
	public void setGnrTpDesc(String gnrTpDesc) {
		this.gnrTpDesc = gnrTpDesc;
	}
	
	/**
	 * Column Info
	 * @param fbdCapa
	 */
	public void setFbdCapa(String fbdCapa) {
		this.fbdCapa = fbdCapa;
	}
	
	/**
	 * Column Info
	 * @param vslHgt
	 */
	public void setVslHgt(String vslHgt) {
		this.vslHgt = vslHgt;
	}
	
	/**
	 * Column Info
	 * @param vslLodLineCertiExpDt
	 */
	public void setVslLodLineCertiExpDt(String vslLodLineCertiExpDt) {
		this.vslLodLineCertiExpDt = vslLodLineCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @param vslSftRdoCertiExpDt
	 */
	public void setVslSftRdoCertiExpDt(String vslSftRdoCertiExpDt) {
		this.vslSftRdoCertiExpDt = vslSftRdoCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @param rgstDt
	 */
	public void setRgstDt(String rgstDt) {
		this.rgstDt = rgstDt;
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
	 * @param rgstPortCd
	 */
	public void setRgstPortCd(String rgstPortCd) {
		this.rgstPortCd = rgstPortCd;
	}
	
	/**
	 * Column Info
	 * @param vslHldKnt
	 */
	public void setVslHldKnt(String vslHldKnt) {
		this.vslHldKnt = vslHldKnt;
	}
	
	/**
	 * Column Info
	 * @param lbpLen
	 */
	public void setLbpLen(String lbpLen) {
		this.lbpLen = lbpLen;
	}
	
	/**
	 * Column Info
	 * @param callSgnNo
	 */
	public void setCallSgnNo(String callSgnNo) {
		this.callSgnNo = callSgnNo;
	}
	
	/**
	 * Column Info
	 * @param grsRgstTongWgt
	 */
	public void setGrsRgstTongWgt(String grsRgstTongWgt) {
		this.grsRgstTongWgt = grsRgstTongWgt;
	}
	
	/**
	 * Column Info
	 * @param clssNoRgstAreaNm
	 */
	public void setClssNoRgstAreaNm(String clssNoRgstAreaNm) {
		this.clssNoRgstAreaNm = clssNoRgstAreaNm;
	}
	
	/**
	 * Column Info
	 * @param tlxNo
	 */
	public void setTlxNo(String tlxNo) {
		this.tlxNo = tlxNo;
	}
	
	/**
	 * Column Info
	 * @param rfRcptKnt
	 */
	public void setRfRcptKnt(String rfRcptKnt) {
		this.rfRcptKnt = rfRcptKnt;
	}
	
	/**
	 * Column Info
	 * @param vslHlNo
	 */
	public void setVslHlNo(String vslHlNo) {
		this.vslHlNo = vslHlNo;
	}
	
	/**
	 * Column Info
	 * @param lloydNo
	 */
	public void setLloydNo(String lloydNo) {
		this.lloydNo = lloydNo;
	}
	
	/**
	 * Column Info
	 * @param suzNetTongWgt
	 */
	public void setSuzNetTongWgt(String suzNetTongWgt) {
		this.suzNetTongWgt = suzNetTongWgt;
	}
	
	/**
	 * Column Info
	 * @param pnmNetTongWgt
	 */
	public void setPnmNetTongWgt(String pnmNetTongWgt) {
		this.pnmNetTongWgt = pnmNetTongWgt;
	}
	
	/**
	 * Column Info
	 * @param rgstNo
	 */
	public void setRgstNo(String rgstNo) {
		this.rgstNo = rgstNo;
	}
	
	/**
	 * Column Info
	 * @param vslRmk
	 */
	public void setVslRmk(String vslRmk) {
		this.vslRmk = vslRmk;
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
	 * @param loaLen
	 */
	public void setLoaLen(String loaLen) {
		this.loaLen = loaLen;
	}
	
	/**
	 * Column Info
	 * @param rfRcptMaxKnt
	 */
	public void setRfRcptMaxKnt(String rfRcptMaxKnt) {
		this.rfRcptMaxKnt = rfRcptMaxKnt;
	}
	
	/**
	 * Column Info
	 * @param vslLnchDt
	 */
	public void setVslLnchDt(String vslLnchDt) {
		this.vslLnchDt = vslLnchDt;
	}
	
	/**
	 * Column Info
	 * @param vslBldrNm
	 */
	public void setVslBldrNm(String vslBldrNm) {
		this.vslBldrNm = vslBldrNm;
	}
	
	/**
	 * Column Info
	 * @param crwKnt
	 */
	public void setCrwKnt(String crwKnt) {
		this.crwKnt = crwKnt;
	}
	
	/**
	 * Column Info
	 * @param vslCreOfcCd
	 */
	public void setVslCreOfcCd(String vslCreOfcCd) {
		this.vslCreOfcCd = vslCreOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vslSftCstruCertiExpDt
	 */
	public void setVslSftCstruCertiExpDt(String vslSftCstruCertiExpDt) {
		this.vslSftCstruCertiExpDt = vslSftCstruCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @param blstTnkCapa
	 */
	public void setBlstTnkCapa(String blstTnkCapa) {
		this.blstTnkCapa = blstTnkCapa;
	}
	
	/**
	 * Column Info
	 * @param pnmGtWgt
	 */
	public void setPnmGtWgt(String pnmGtWgt) {
		this.pnmGtWgt = pnmGtWgt;
	}
	
	/**
	 * Column Info
	 * @param bwthstMkrNm
	 */
	public void setBwthstMkrNm(String bwthstMkrNm) {
		this.bwthstMkrNm = bwthstMkrNm;
	}
	
	/**
	 * Column Info
	 * @param vslClzDt
	 */
	public void setVslClzDt(String vslClzDt) {
		this.vslClzDt = vslClzDt;
	}
	
	/**
	 * Column Info
	 * @param suzGtWgt
	 */
	public void setSuzGtWgt(String suzGtWgt) {
		this.suzGtWgt = suzGtWgt;
	}
	
	/**
	 * Column Info
	 * @param madnVoySuzNetTongWgt
	 */
	public void setMadnVoySuzNetTongWgt(String madnVoySuzNetTongWgt) {
		this.madnVoySuzNetTongWgt = madnVoySuzNetTongWgt;
	}
	
	/**
	 * Column Info
	 * @param lgtShpTongWgt
	 */
	public void setLgtShpTongWgt(String lgtShpTongWgt) {
		this.lgtShpTongWgt = lgtShpTongWgt;
	}
	
	/**
	 * Column Info
	 * @param foilCapa
	 */
	public void setFoilCapa(String foilCapa) {
		this.foilCapa = foilCapa;
	}
	
	/**
	 * Column Info
	 * @param vslDeratCertiExpDt
	 */
	public void setVslDeratCertiExpDt(String vslDeratCertiExpDt) {
		this.vslDeratCertiExpDt = vslDeratCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @param ttlTeuKnt
	 */
	public void setTtlTeuKnt(String ttlTeuKnt) {
		this.ttlTeuKnt = ttlTeuKnt;
	}
	
	/**
	 * Column Info
	 * @param foilCsm
	 */
	public void setFoilCsm(String foilCsm) {
		this.foilCsm = foilCsm;
	}
	
	/**
	 * Column Info
	 * @param doilCsm
	 */
	public void setDoilCsm(String doilCsm) {
		this.doilCsm = doilCsm;
	}
	
	/**
	 * Column Info
	 * @param vslDeDt
	 */
	public void setVslDeDt(String vslDeDt) {
		this.vslDeDt = vslDeDt;
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
	 * @param dwtWgt
	 */
	public void setDwtWgt(String dwtWgt) {
		this.dwtWgt = dwtWgt;
	}
	
	/**
	 * Column Info
	 * @param mnEngRpmPwr
	 */
	public void setMnEngRpmPwr(String mnEngRpmPwr) {
		this.mnEngRpmPwr = mnEngRpmPwr;
	}
	
	/**
	 * Column Info
	 * @param crrCd
	 */
	public void setCrrCd(String crrCd) {
		this.crrCd = crrCd;
	}
	
	/**
	 * Column Info
	 * @param vslSftEqCertiExpDt
	 */
	public void setVslSftEqCertiExpDt(String vslSftEqCertiExpDt) {
		this.vslSftEqCertiExpDt = vslSftEqCertiExpDt;
	}
	
	/**
	 * Column Info
	 * @param doilCapa
	 */
	public void setDoilCapa(String doilCapa) {
		this.doilCapa = doilCapa;
	}
	
	/**
	 * Column Info
	 * @param vslClssFlg
	 */
	public void setVslClssFlg(String vslClssFlg) {
		this.vslClssFlg = vslClssFlg;
	}
	
	/**
	 * Column Info
	 * @param frshWtrCapa
	 */
	public void setFrshWtrCapa(String frshWtrCapa) {
		this.frshWtrCapa = frshWtrCapa;
	}
	
	/**
	 * Column Info
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param cntrOpCapa
	 */
	public void setCntrOpCapa(String cntrOpCapa) {
		this.cntrOpCapa = cntrOpCapa;
	}
	
	/**
	 * Column Info
	 * @param piclbDesc
	 */
	public void setPiclbDesc(String piclbDesc) {
		this.piclbDesc = piclbDesc;
	}
	
	/**
	 * Column Info
	 * @param vslOwnIndCd
	 */
	public void setVslOwnIndCd(String vslOwnIndCd) {
		this.vslOwnIndCd = vslOwnIndCd;
	}
	
	/**
	 * Column Info
	 * @param cntrDznCapa
	 */
	public void setCntrDznCapa(String cntrDznCapa) {
		this.cntrDznCapa = cntrDznCapa;
	}
	
	/**
	 * Column Info
	 * @param frshWtrCsm
	 */
	public void setFrshWtrCsm(String frshWtrCsm) {
		this.frshWtrCsm = frshWtrCsm;
	}
	
	/**
	 * Column Info
	 * @param modiVslCd
	 */
	public void setModiVslCd(String modiVslCd) {
		this.modiVslCd = modiVslCd;
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
	 * @param fdrDivCd
	 */
	public void setFdrDivCd(String fdrDivCd) {
		this.fdrDivCd = fdrDivCd;
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
	 * @param smrDrftHgt
	 */
	public void setSmrDrftHgt(String smrDrftHgt) {
		this.smrDrftHgt = smrDrftHgt;
	}
	
	/**
	 * Column Info
	 * @param vslDeltOfcCd
	 */
	public void setVslDeltOfcCd(String vslDeltOfcCd) {
		this.vslDeltOfcCd = vslDeltOfcCd;
	}
	
	/**
	 * Column Info
	 * @param bwthstBhpPwr
	 */
	public void setBwthstBhpPwr(String bwthstBhpPwr) {
		this.bwthstBhpPwr = bwthstBhpPwr;
	}
	
	/**
	 * Column Info
	 * @param vslEdiNm
	 */
	public void setVslEdiNm(String vslEdiNm) {
		this.vslEdiNm = vslEdiNm;
	}
	
	/**
	 * Column Info
	 * @param vslEml
	 */
	public void setVslEml(String vslEml) {
		this.vslEml = vslEml;
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
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Column Info
	 * @param mnEngMkrNm
	 */
	public void setMnEngMkrNm(String mnEngMkrNm) {
		this.mnEngMkrNm = mnEngMkrNm;
	}
	
	/**
	 * Column Info
	 * @param vslBldAreaNm
	 */
	public void setVslBldAreaNm(String vslBldAreaNm) {
		this.vslBldAreaNm = vslBldAreaNm;
	}
	
	/**
	 * Column Info
	 * @param gnrBhpPwr
	 */
	public void setGnrBhpPwr(String gnrBhpPwr) {
		this.gnrBhpPwr = gnrBhpPwr;
	}
	
	/**
	 * Column Info
	 * @param vslHtchKnt
	 */
	public void setVslHtchKnt(String vslHtchKnt) {
		this.vslHtchKnt = vslHtchKnt;
	}
	
	/**
	 * Column Info
	 * @param maxSpd
	 */
	public void setMaxSpd(String maxSpd) {
		this.maxSpd = maxSpd;
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
	 * @param vslRgstCntCd
	 */
	public void setVslRgstCntCd(String vslRgstCntCd) {
		this.vslRgstCntCd = vslRgstCntCd;
	}
	
	/**
	 * Column Info
	 * @param vslEngNm
	 */
	public void setVslEngNm(String vslEngNm) {
		this.vslEngNm = vslEngNm;
	}
	
	/**
	 * Column Info
	 * @param cntrPnmCapa
	 */
	public void setCntrPnmCapa(String cntrPnmCapa) {
		this.cntrPnmCapa = cntrPnmCapa;
	}
	
	/**
	 * Column Info
	 * @param gnrRpmPwr
	 */
	public void setGnrRpmPwr(String gnrRpmPwr) {
		this.gnrRpmPwr = gnrRpmPwr;
	}
	
	/**
	 * Column Info
	 * @param vslClssNo
	 */
	public void setVslClssNo(String vslClssNo) {
		this.vslClssNo = vslClssNo;
	}
	
	/**
	 * Column Info
	 * @param netRgstTongWgt
	 */
	public void setNetRgstTongWgt(String netRgstTongWgt) {
		this.netRgstTongWgt = netRgstTongWgt;
	}
	
	/**
	 * Column Info
	 * @param vslLoclNm
	 */
	public void setVslLoclNm(String vslLoclNm) {
		this.vslLoclNm = vslLoclNm;
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
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param vslBldCd
	 */
	public void setVslBldCd(String vslBldCd) {
		this.vslBldCd = vslBldCd;
	}
	
	/**
	 * Column Info
	 * @param bwthstTpDesc
	 */
	public void setBwthstTpDesc(String bwthstTpDesc) {
		this.bwthstTpDesc = bwthstTpDesc;
	}
	
	/**
	 * Column Info
	 * @param ecnSpd
	 */
	public void setEcnSpd(String ecnSpd) {
		this.ecnSpd = ecnSpd;
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
	 * @param mnEngBhpPwr
	 */
	public void setMnEngBhpPwr(String mnEngBhpPwr) {
		this.mnEngBhpPwr = mnEngBhpPwr;
	}
	
	/**
	 * Column Info
	 * @param cntrVslClssCapa
	 */
	public void setCntrVslClssCapa(String cntrVslClssCapa) {
		this.cntrVslClssCapa = cntrVslClssCapa;
	}
	
	/**
	 * Column Info
	 * @param vslKelLyDt
	 */
	public void setVslKelLyDt(String vslKelLyDt) {
		this.vslKelLyDt = vslKelLyDt;
	}
	
	/**
	 * Column Info
	 * @param intlTongCertiFlg
	 */
	public void setIntlTongCertiFlg(String intlTongCertiFlg) {
		this.intlTongCertiFlg = intlTongCertiFlg;
	}
	
	/**
	 * Column Info
	 * @param vslWdt
	 */
	public void setVslWdt(String vslWdt) {
		this.vslWdt = vslWdt;
	}
	
	/**
	 * Column Info
	 * @param vslSvcSpd
	 */
	public void setVslSvcSpd(String vslSvcSpd) {
		this.vslSvcSpd = vslSvcSpd;
	}
	
	/**
	 * Column Info
	 * @param gnrMkrNm
	 */
	public void setGnrMkrNm(String gnrMkrNm) {
		this.gnrMkrNm = gnrMkrNm;
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
		setMnEngTpDesc(JSPUtil.getParameter(request, prefix + "mn_eng_tp_desc", ""));
		setBwthstRpmPwr(JSPUtil.getParameter(request, prefix + "bwthst_rpm_pwr", ""));
		setVslDpth(JSPUtil.getParameter(request, prefix + "vsl_dpth", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setDplCapa(JSPUtil.getParameter(request, prefix + "dpl_capa", ""));
		setGnrTpDesc(JSPUtil.getParameter(request, prefix + "gnr_tp_desc", ""));
		setFbdCapa(JSPUtil.getParameter(request, prefix + "fbd_capa", ""));
		setVslHgt(JSPUtil.getParameter(request, prefix + "vsl_hgt", ""));
		setVslLodLineCertiExpDt(JSPUtil.getParameter(request, prefix + "vsl_lod_line_certi_exp_dt", ""));
		setVslSftRdoCertiExpDt(JSPUtil.getParameter(request, prefix + "vsl_sft_rdo_certi_exp_dt", ""));
		setRgstDt(JSPUtil.getParameter(request, prefix + "rgst_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setRgstPortCd(JSPUtil.getParameter(request, prefix + "rgst_port_cd", ""));
		setVslHldKnt(JSPUtil.getParameter(request, prefix + "vsl_hld_knt", ""));
		setLbpLen(JSPUtil.getParameter(request, prefix + "lbp_len", ""));
		setCallSgnNo(JSPUtil.getParameter(request, prefix + "call_sgn_no", ""));
		setGrsRgstTongWgt(JSPUtil.getParameter(request, prefix + "grs_rgst_tong_wgt", ""));
		setClssNoRgstAreaNm(JSPUtil.getParameter(request, prefix + "clss_no_rgst_area_nm", ""));
		setTlxNo(JSPUtil.getParameter(request, prefix + "tlx_no", ""));
		setRfRcptKnt(JSPUtil.getParameter(request, prefix + "rf_rcpt_knt", ""));
		setVslHlNo(JSPUtil.getParameter(request, prefix + "vsl_hl_no", ""));
		setLloydNo(JSPUtil.getParameter(request, prefix + "lloyd_no", ""));
		setSuzNetTongWgt(JSPUtil.getParameter(request, prefix + "suz_net_tong_wgt", ""));
		setPnmNetTongWgt(JSPUtil.getParameter(request, prefix + "pnm_net_tong_wgt", ""));
		setRgstNo(JSPUtil.getParameter(request, prefix + "rgst_no", ""));
		setVslRmk(JSPUtil.getParameter(request, prefix + "vsl_rmk", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setLoaLen(JSPUtil.getParameter(request, prefix + "loa_len", ""));
		setRfRcptMaxKnt(JSPUtil.getParameter(request, prefix + "rf_rcpt_max_knt", ""));
		setVslLnchDt(JSPUtil.getParameter(request, prefix + "vsl_lnch_dt", ""));
		setVslBldrNm(JSPUtil.getParameter(request, prefix + "vsl_bldr_nm", ""));
		setCrwKnt(JSPUtil.getParameter(request, prefix + "crw_knt", ""));
		setVslCreOfcCd(JSPUtil.getParameter(request, prefix + "vsl_cre_ofc_cd", ""));
		setVslSftCstruCertiExpDt(JSPUtil.getParameter(request, prefix + "vsl_sft_cstru_certi_exp_dt", ""));
		setBlstTnkCapa(JSPUtil.getParameter(request, prefix + "blst_tnk_capa", ""));
		setPnmGtWgt(JSPUtil.getParameter(request, prefix + "pnm_gt_wgt", ""));
		setBwthstMkrNm(JSPUtil.getParameter(request, prefix + "bwthst_mkr_nm", ""));
		setVslClzDt(JSPUtil.getParameter(request, prefix + "vsl_clz_dt", ""));
		setSuzGtWgt(JSPUtil.getParameter(request, prefix + "suz_gt_wgt", ""));
		setMadnVoySuzNetTongWgt(JSPUtil.getParameter(request, prefix + "madn_voy_suz_net_tong_wgt", ""));
		setLgtShpTongWgt(JSPUtil.getParameter(request, prefix + "lgt_shp_tong_wgt", ""));
		setFoilCapa(JSPUtil.getParameter(request, prefix + "foil_capa", ""));
		setVslDeratCertiExpDt(JSPUtil.getParameter(request, prefix + "vsl_derat_certi_exp_dt", ""));
		setTtlTeuKnt(JSPUtil.getParameter(request, prefix + "ttl_teu_knt", ""));
		setFoilCsm(JSPUtil.getParameter(request, prefix + "foil_csm", ""));
		setDoilCsm(JSPUtil.getParameter(request, prefix + "doil_csm", ""));
		setVslDeDt(JSPUtil.getParameter(request, prefix + "vsl_de_dt", ""));
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setDwtWgt(JSPUtil.getParameter(request, prefix + "dwt_wgt", ""));
		setMnEngRpmPwr(JSPUtil.getParameter(request, prefix + "mn_eng_rpm_pwr", ""));
		setCrrCd(JSPUtil.getParameter(request, prefix + "crr_cd", ""));
		setVslSftEqCertiExpDt(JSPUtil.getParameter(request, prefix + "vsl_sft_eq_certi_exp_dt", ""));
		setDoilCapa(JSPUtil.getParameter(request, prefix + "doil_capa", ""));
		setVslClssFlg(JSPUtil.getParameter(request, prefix + "vsl_clss_flg", ""));
		setFrshWtrCapa(JSPUtil.getParameter(request, prefix + "frsh_wtr_capa", ""));
		setPhnNo(JSPUtil.getParameter(request, prefix + "phn_no", ""));
		setCntrOpCapa(JSPUtil.getParameter(request, prefix + "cntr_op_capa", ""));
		setPiclbDesc(JSPUtil.getParameter(request, prefix + "piclb_desc", ""));
		setVslOwnIndCd(JSPUtil.getParameter(request, prefix + "vsl_own_ind_cd", ""));
		setCntrDznCapa(JSPUtil.getParameter(request, prefix + "cntr_dzn_capa", ""));
		setFrshWtrCsm(JSPUtil.getParameter(request, prefix + "frsh_wtr_csm", ""));
		setModiVslCd(JSPUtil.getParameter(request, prefix + "modi_vsl_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setFdrDivCd(JSPUtil.getParameter(request, prefix + "fdr_div_cd", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
		setSmrDrftHgt(JSPUtil.getParameter(request, prefix + "smr_drft_hgt", ""));
		setVslDeltOfcCd(JSPUtil.getParameter(request, prefix + "vsl_delt_ofc_cd", ""));
		setBwthstBhpPwr(JSPUtil.getParameter(request, prefix + "bwthst_bhp_pwr", ""));
		setVslEdiNm(JSPUtil.getParameter(request, prefix + "vsl_edi_nm", ""));
		setVslEml(JSPUtil.getParameter(request, prefix + "vsl_eml", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEaiIfId(JSPUtil.getParameter(request, prefix + "eai_if_id", ""));
		setMnEngMkrNm(JSPUtil.getParameter(request, prefix + "mn_eng_mkr_nm", ""));
		setVslBldAreaNm(JSPUtil.getParameter(request, prefix + "vsl_bld_area_nm", ""));
		setGnrBhpPwr(JSPUtil.getParameter(request, prefix + "gnr_bhp_pwr", ""));
		setVslHtchKnt(JSPUtil.getParameter(request, prefix + "vsl_htch_knt", ""));
		setMaxSpd(JSPUtil.getParameter(request, prefix + "max_spd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setVslRgstCntCd(JSPUtil.getParameter(request, prefix + "vsl_rgst_cnt_cd", ""));
		setVslEngNm(JSPUtil.getParameter(request, prefix + "vsl_eng_nm", ""));
		setCntrPnmCapa(JSPUtil.getParameter(request, prefix + "cntr_pnm_capa", ""));
		setGnrRpmPwr(JSPUtil.getParameter(request, prefix + "gnr_rpm_pwr", ""));
		setVslClssNo(JSPUtil.getParameter(request, prefix + "vsl_clss_no", ""));
		setNetRgstTongWgt(JSPUtil.getParameter(request, prefix + "net_rgst_tong_wgt", ""));
		setVslLoclNm(JSPUtil.getParameter(request, prefix + "vsl_locl_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCoCd(JSPUtil.getParameter(request, prefix + "co_cd", ""));
		setVslBldCd(JSPUtil.getParameter(request, prefix + "vsl_bld_cd", ""));
		setBwthstTpDesc(JSPUtil.getParameter(request, prefix + "bwthst_tp_desc", ""));
		setEcnSpd(JSPUtil.getParameter(request, prefix + "ecn_spd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, prefix + "eai_evnt_dt", ""));
		setMnEngBhpPwr(JSPUtil.getParameter(request, prefix + "mn_eng_bhp_pwr", ""));
		setCntrVslClssCapa(JSPUtil.getParameter(request, prefix + "cntr_vsl_clss_capa", ""));
		setVslKelLyDt(JSPUtil.getParameter(request, prefix + "vsl_kel_ly_dt", ""));
		setIntlTongCertiFlg(JSPUtil.getParameter(request, prefix + "intl_tong_certi_flg", ""));
		setVslWdt(JSPUtil.getParameter(request, prefix + "vsl_wdt", ""));
		setVslSvcSpd(JSPUtil.getParameter(request, prefix + "vsl_svc_spd", ""));
		setGnrMkrNm(JSPUtil.getParameter(request, prefix + "gnr_mkr_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmVslCntrVO[]
	 */
	public MdmVslCntrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmVslCntrVO[]
	 */
	public MdmVslCntrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmVslCntrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] mnEngTpDesc = (JSPUtil.getParameter(request, prefix	+ "mn_eng_tp_desc", length));
			String[] bwthstRpmPwr = (JSPUtil.getParameter(request, prefix	+ "bwthst_rpm_pwr", length));
			String[] vslDpth = (JSPUtil.getParameter(request, prefix	+ "vsl_dpth", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] dplCapa = (JSPUtil.getParameter(request, prefix	+ "dpl_capa", length));
			String[] gnrTpDesc = (JSPUtil.getParameter(request, prefix	+ "gnr_tp_desc", length));
			String[] fbdCapa = (JSPUtil.getParameter(request, prefix	+ "fbd_capa", length));
			String[] vslHgt = (JSPUtil.getParameter(request, prefix	+ "vsl_hgt", length));
			String[] vslLodLineCertiExpDt = (JSPUtil.getParameter(request, prefix	+ "vsl_lod_line_certi_exp_dt", length));
			String[] vslSftRdoCertiExpDt = (JSPUtil.getParameter(request, prefix	+ "vsl_sft_rdo_certi_exp_dt", length));
			String[] rgstDt = (JSPUtil.getParameter(request, prefix	+ "rgst_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rgstPortCd = (JSPUtil.getParameter(request, prefix	+ "rgst_port_cd", length));
			String[] vslHldKnt = (JSPUtil.getParameter(request, prefix	+ "vsl_hld_knt", length));
			String[] lbpLen = (JSPUtil.getParameter(request, prefix	+ "lbp_len", length));
			String[] callSgnNo = (JSPUtil.getParameter(request, prefix	+ "call_sgn_no", length));
			String[] grsRgstTongWgt = (JSPUtil.getParameter(request, prefix	+ "grs_rgst_tong_wgt", length));
			String[] clssNoRgstAreaNm = (JSPUtil.getParameter(request, prefix	+ "clss_no_rgst_area_nm", length));
			String[] tlxNo = (JSPUtil.getParameter(request, prefix	+ "tlx_no", length));
			String[] rfRcptKnt = (JSPUtil.getParameter(request, prefix	+ "rf_rcpt_knt", length));
			String[] vslHlNo = (JSPUtil.getParameter(request, prefix	+ "vsl_hl_no", length));
			String[] lloydNo = (JSPUtil.getParameter(request, prefix	+ "lloyd_no", length));
			String[] suzNetTongWgt = (JSPUtil.getParameter(request, prefix	+ "suz_net_tong_wgt", length));
			String[] pnmNetTongWgt = (JSPUtil.getParameter(request, prefix	+ "pnm_net_tong_wgt", length));
			String[] rgstNo = (JSPUtil.getParameter(request, prefix	+ "rgst_no", length));
			String[] vslRmk = (JSPUtil.getParameter(request, prefix	+ "vsl_rmk", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] loaLen = (JSPUtil.getParameter(request, prefix	+ "loa_len", length));
			String[] rfRcptMaxKnt = (JSPUtil.getParameter(request, prefix	+ "rf_rcpt_max_knt", length));
			String[] vslLnchDt = (JSPUtil.getParameter(request, prefix	+ "vsl_lnch_dt", length));
			String[] vslBldrNm = (JSPUtil.getParameter(request, prefix	+ "vsl_bldr_nm", length));
			String[] crwKnt = (JSPUtil.getParameter(request, prefix	+ "crw_knt", length));
			String[] vslCreOfcCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cre_ofc_cd", length));
			String[] vslSftCstruCertiExpDt = (JSPUtil.getParameter(request, prefix	+ "vsl_sft_cstru_certi_exp_dt", length));
			String[] blstTnkCapa = (JSPUtil.getParameter(request, prefix	+ "blst_tnk_capa", length));
			String[] pnmGtWgt = (JSPUtil.getParameter(request, prefix	+ "pnm_gt_wgt", length));
			String[] bwthstMkrNm = (JSPUtil.getParameter(request, prefix	+ "bwthst_mkr_nm", length));
			String[] vslClzDt = (JSPUtil.getParameter(request, prefix	+ "vsl_clz_dt", length));
			String[] suzGtWgt = (JSPUtil.getParameter(request, prefix	+ "suz_gt_wgt", length));
			String[] madnVoySuzNetTongWgt = (JSPUtil.getParameter(request, prefix	+ "madn_voy_suz_net_tong_wgt", length));
			String[] lgtShpTongWgt = (JSPUtil.getParameter(request, prefix	+ "lgt_shp_tong_wgt", length));
			String[] foilCapa = (JSPUtil.getParameter(request, prefix	+ "foil_capa", length));
			String[] vslDeratCertiExpDt = (JSPUtil.getParameter(request, prefix	+ "vsl_derat_certi_exp_dt", length));
			String[] ttlTeuKnt = (JSPUtil.getParameter(request, prefix	+ "ttl_teu_knt", length));
			String[] foilCsm = (JSPUtil.getParameter(request, prefix	+ "foil_csm", length));
			String[] doilCsm = (JSPUtil.getParameter(request, prefix	+ "doil_csm", length));
			String[] vslDeDt = (JSPUtil.getParameter(request, prefix	+ "vsl_de_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] dwtWgt = (JSPUtil.getParameter(request, prefix	+ "dwt_wgt", length));
			String[] mnEngRpmPwr = (JSPUtil.getParameter(request, prefix	+ "mn_eng_rpm_pwr", length));
			String[] crrCd = (JSPUtil.getParameter(request, prefix	+ "crr_cd", length));
			String[] vslSftEqCertiExpDt = (JSPUtil.getParameter(request, prefix	+ "vsl_sft_eq_certi_exp_dt", length));
			String[] doilCapa = (JSPUtil.getParameter(request, prefix	+ "doil_capa", length));
			String[] vslClssFlg = (JSPUtil.getParameter(request, prefix	+ "vsl_clss_flg", length));
			String[] frshWtrCapa = (JSPUtil.getParameter(request, prefix	+ "frsh_wtr_capa", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] cntrOpCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_op_capa", length));
			String[] piclbDesc = (JSPUtil.getParameter(request, prefix	+ "piclb_desc", length));
			String[] vslOwnIndCd = (JSPUtil.getParameter(request, prefix	+ "vsl_own_ind_cd", length));
			String[] cntrDznCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_dzn_capa", length));
			String[] frshWtrCsm = (JSPUtil.getParameter(request, prefix	+ "frsh_wtr_csm", length));
			String[] modiVslCd = (JSPUtil.getParameter(request, prefix	+ "modi_vsl_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fdrDivCd = (JSPUtil.getParameter(request, prefix	+ "fdr_div_cd", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] smrDrftHgt = (JSPUtil.getParameter(request, prefix	+ "smr_drft_hgt", length));
			String[] vslDeltOfcCd = (JSPUtil.getParameter(request, prefix	+ "vsl_delt_ofc_cd", length));
			String[] bwthstBhpPwr = (JSPUtil.getParameter(request, prefix	+ "bwthst_bhp_pwr", length));
			String[] vslEdiNm = (JSPUtil.getParameter(request, prefix	+ "vsl_edi_nm", length));
			String[] vslEml = (JSPUtil.getParameter(request, prefix	+ "vsl_eml", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] eaiIfId = (JSPUtil.getParameter(request, prefix	+ "eai_if_id", length));
			String[] mnEngMkrNm = (JSPUtil.getParameter(request, prefix	+ "mn_eng_mkr_nm", length));
			String[] vslBldAreaNm = (JSPUtil.getParameter(request, prefix	+ "vsl_bld_area_nm", length));
			String[] gnrBhpPwr = (JSPUtil.getParameter(request, prefix	+ "gnr_bhp_pwr", length));
			String[] vslHtchKnt = (JSPUtil.getParameter(request, prefix	+ "vsl_htch_knt", length));
			String[] maxSpd = (JSPUtil.getParameter(request, prefix	+ "max_spd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vslRgstCntCd = (JSPUtil.getParameter(request, prefix	+ "vsl_rgst_cnt_cd", length));
			String[] vslEngNm = (JSPUtil.getParameter(request, prefix	+ "vsl_eng_nm", length));
			String[] cntrPnmCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_pnm_capa", length));
			String[] gnrRpmPwr = (JSPUtil.getParameter(request, prefix	+ "gnr_rpm_pwr", length));
			String[] vslClssNo = (JSPUtil.getParameter(request, prefix	+ "vsl_clss_no", length));
			String[] netRgstTongWgt = (JSPUtil.getParameter(request, prefix	+ "net_rgst_tong_wgt", length));
			String[] vslLoclNm = (JSPUtil.getParameter(request, prefix	+ "vsl_locl_nm", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] vslBldCd = (JSPUtil.getParameter(request, prefix	+ "vsl_bld_cd", length));
			String[] bwthstTpDesc = (JSPUtil.getParameter(request, prefix	+ "bwthst_tp_desc", length));
			String[] ecnSpd = (JSPUtil.getParameter(request, prefix	+ "ecn_spd", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] mnEngBhpPwr = (JSPUtil.getParameter(request, prefix	+ "mn_eng_bhp_pwr", length));
			String[] cntrVslClssCapa = (JSPUtil.getParameter(request, prefix	+ "cntr_vsl_clss_capa", length));
			String[] vslKelLyDt = (JSPUtil.getParameter(request, prefix	+ "vsl_kel_ly_dt", length));
			String[] intlTongCertiFlg = (JSPUtil.getParameter(request, prefix	+ "intl_tong_certi_flg", length));
			String[] vslWdt = (JSPUtil.getParameter(request, prefix	+ "vsl_wdt", length));
			String[] vslSvcSpd = (JSPUtil.getParameter(request, prefix	+ "vsl_svc_spd", length));
			String[] gnrMkrNm = (JSPUtil.getParameter(request, prefix	+ "gnr_mkr_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmVslCntrVO();
				if (mnEngTpDesc[i] != null)
					model.setMnEngTpDesc(mnEngTpDesc[i]);
				if (bwthstRpmPwr[i] != null)
					model.setBwthstRpmPwr(bwthstRpmPwr[i]);
				if (vslDpth[i] != null)
					model.setVslDpth(vslDpth[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dplCapa[i] != null)
					model.setDplCapa(dplCapa[i]);
				if (gnrTpDesc[i] != null)
					model.setGnrTpDesc(gnrTpDesc[i]);
				if (fbdCapa[i] != null)
					model.setFbdCapa(fbdCapa[i]);
				if (vslHgt[i] != null)
					model.setVslHgt(vslHgt[i]);
				if (vslLodLineCertiExpDt[i] != null)
					model.setVslLodLineCertiExpDt(vslLodLineCertiExpDt[i]);
				if (vslSftRdoCertiExpDt[i] != null)
					model.setVslSftRdoCertiExpDt(vslSftRdoCertiExpDt[i]);
				if (rgstDt[i] != null)
					model.setRgstDt(rgstDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rgstPortCd[i] != null)
					model.setRgstPortCd(rgstPortCd[i]);
				if (vslHldKnt[i] != null)
					model.setVslHldKnt(vslHldKnt[i]);
				if (lbpLen[i] != null)
					model.setLbpLen(lbpLen[i]);
				if (callSgnNo[i] != null)
					model.setCallSgnNo(callSgnNo[i]);
				if (grsRgstTongWgt[i] != null)
					model.setGrsRgstTongWgt(grsRgstTongWgt[i]);
				if (clssNoRgstAreaNm[i] != null)
					model.setClssNoRgstAreaNm(clssNoRgstAreaNm[i]);
				if (tlxNo[i] != null)
					model.setTlxNo(tlxNo[i]);
				if (rfRcptKnt[i] != null)
					model.setRfRcptKnt(rfRcptKnt[i]);
				if (vslHlNo[i] != null)
					model.setVslHlNo(vslHlNo[i]);
				if (lloydNo[i] != null)
					model.setLloydNo(lloydNo[i]);
				if (suzNetTongWgt[i] != null)
					model.setSuzNetTongWgt(suzNetTongWgt[i]);
				if (pnmNetTongWgt[i] != null)
					model.setPnmNetTongWgt(pnmNetTongWgt[i]);
				if (rgstNo[i] != null)
					model.setRgstNo(rgstNo[i]);
				if (vslRmk[i] != null)
					model.setVslRmk(vslRmk[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (loaLen[i] != null)
					model.setLoaLen(loaLen[i]);
				if (rfRcptMaxKnt[i] != null)
					model.setRfRcptMaxKnt(rfRcptMaxKnt[i]);
				if (vslLnchDt[i] != null)
					model.setVslLnchDt(vslLnchDt[i]);
				if (vslBldrNm[i] != null)
					model.setVslBldrNm(vslBldrNm[i]);
				if (crwKnt[i] != null)
					model.setCrwKnt(crwKnt[i]);
				if (vslCreOfcCd[i] != null)
					model.setVslCreOfcCd(vslCreOfcCd[i]);
				if (vslSftCstruCertiExpDt[i] != null)
					model.setVslSftCstruCertiExpDt(vslSftCstruCertiExpDt[i]);
				if (blstTnkCapa[i] != null)
					model.setBlstTnkCapa(blstTnkCapa[i]);
				if (pnmGtWgt[i] != null)
					model.setPnmGtWgt(pnmGtWgt[i]);
				if (bwthstMkrNm[i] != null)
					model.setBwthstMkrNm(bwthstMkrNm[i]);
				if (vslClzDt[i] != null)
					model.setVslClzDt(vslClzDt[i]);
				if (suzGtWgt[i] != null)
					model.setSuzGtWgt(suzGtWgt[i]);
				if (madnVoySuzNetTongWgt[i] != null)
					model.setMadnVoySuzNetTongWgt(madnVoySuzNetTongWgt[i]);
				if (lgtShpTongWgt[i] != null)
					model.setLgtShpTongWgt(lgtShpTongWgt[i]);
				if (foilCapa[i] != null)
					model.setFoilCapa(foilCapa[i]);
				if (vslDeratCertiExpDt[i] != null)
					model.setVslDeratCertiExpDt(vslDeratCertiExpDt[i]);
				if (ttlTeuKnt[i] != null)
					model.setTtlTeuKnt(ttlTeuKnt[i]);
				if (foilCsm[i] != null)
					model.setFoilCsm(foilCsm[i]);
				if (doilCsm[i] != null)
					model.setDoilCsm(doilCsm[i]);
				if (vslDeDt[i] != null)
					model.setVslDeDt(vslDeDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (dwtWgt[i] != null)
					model.setDwtWgt(dwtWgt[i]);
				if (mnEngRpmPwr[i] != null)
					model.setMnEngRpmPwr(mnEngRpmPwr[i]);
				if (crrCd[i] != null)
					model.setCrrCd(crrCd[i]);
				if (vslSftEqCertiExpDt[i] != null)
					model.setVslSftEqCertiExpDt(vslSftEqCertiExpDt[i]);
				if (doilCapa[i] != null)
					model.setDoilCapa(doilCapa[i]);
				if (vslClssFlg[i] != null)
					model.setVslClssFlg(vslClssFlg[i]);
				if (frshWtrCapa[i] != null)
					model.setFrshWtrCapa(frshWtrCapa[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (cntrOpCapa[i] != null)
					model.setCntrOpCapa(cntrOpCapa[i]);
				if (piclbDesc[i] != null)
					model.setPiclbDesc(piclbDesc[i]);
				if (vslOwnIndCd[i] != null)
					model.setVslOwnIndCd(vslOwnIndCd[i]);
				if (cntrDznCapa[i] != null)
					model.setCntrDznCapa(cntrDznCapa[i]);
				if (frshWtrCsm[i] != null)
					model.setFrshWtrCsm(frshWtrCsm[i]);
				if (modiVslCd[i] != null)
					model.setModiVslCd(modiVslCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fdrDivCd[i] != null)
					model.setFdrDivCd(fdrDivCd[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (smrDrftHgt[i] != null)
					model.setSmrDrftHgt(smrDrftHgt[i]);
				if (vslDeltOfcCd[i] != null)
					model.setVslDeltOfcCd(vslDeltOfcCd[i]);
				if (bwthstBhpPwr[i] != null)
					model.setBwthstBhpPwr(bwthstBhpPwr[i]);
				if (vslEdiNm[i] != null)
					model.setVslEdiNm(vslEdiNm[i]);
				if (vslEml[i] != null)
					model.setVslEml(vslEml[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				if (mnEngMkrNm[i] != null)
					model.setMnEngMkrNm(mnEngMkrNm[i]);
				if (vslBldAreaNm[i] != null)
					model.setVslBldAreaNm(vslBldAreaNm[i]);
				if (gnrBhpPwr[i] != null)
					model.setGnrBhpPwr(gnrBhpPwr[i]);
				if (vslHtchKnt[i] != null)
					model.setVslHtchKnt(vslHtchKnt[i]);
				if (maxSpd[i] != null)
					model.setMaxSpd(maxSpd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vslRgstCntCd[i] != null)
					model.setVslRgstCntCd(vslRgstCntCd[i]);
				if (vslEngNm[i] != null)
					model.setVslEngNm(vslEngNm[i]);
				if (cntrPnmCapa[i] != null)
					model.setCntrPnmCapa(cntrPnmCapa[i]);
				if (gnrRpmPwr[i] != null)
					model.setGnrRpmPwr(gnrRpmPwr[i]);
				if (vslClssNo[i] != null)
					model.setVslClssNo(vslClssNo[i]);
				if (netRgstTongWgt[i] != null)
					model.setNetRgstTongWgt(netRgstTongWgt[i]);
				if (vslLoclNm[i] != null)
					model.setVslLoclNm(vslLoclNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (vslBldCd[i] != null)
					model.setVslBldCd(vslBldCd[i]);
				if (bwthstTpDesc[i] != null)
					model.setBwthstTpDesc(bwthstTpDesc[i]);
				if (ecnSpd[i] != null)
					model.setEcnSpd(ecnSpd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (mnEngBhpPwr[i] != null)
					model.setMnEngBhpPwr(mnEngBhpPwr[i]);
				if (cntrVslClssCapa[i] != null)
					model.setCntrVslClssCapa(cntrVslClssCapa[i]);
				if (vslKelLyDt[i] != null)
					model.setVslKelLyDt(vslKelLyDt[i]);
				if (intlTongCertiFlg[i] != null)
					model.setIntlTongCertiFlg(intlTongCertiFlg[i]);
				if (vslWdt[i] != null)
					model.setVslWdt(vslWdt[i]);
				if (vslSvcSpd[i] != null)
					model.setVslSvcSpd(vslSvcSpd[i]);
				if (gnrMkrNm[i] != null)
					model.setGnrMkrNm(gnrMkrNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmVslCntrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmVslCntrVO[]
	 */
	public MdmVslCntrVO[] getMdmVslCntrVOs(){
		MdmVslCntrVO[] vos = (MdmVslCntrVO[])models.toArray(new MdmVslCntrVO[models.size()]);
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
		this.mnEngTpDesc = this.mnEngTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bwthstRpmPwr = this.bwthstRpmPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDpth = this.vslDpth .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dplCapa = this.dplCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnrTpDesc = this.gnrTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fbdCapa = this.fbdCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslHgt = this.vslHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLodLineCertiExpDt = this.vslLodLineCertiExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSftRdoCertiExpDt = this.vslSftRdoCertiExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstDt = this.rgstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstPortCd = this.rgstPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslHldKnt = this.vslHldKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lbpLen = this.lbpLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSgnNo = this.callSgnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsRgstTongWgt = this.grsRgstTongWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clssNoRgstAreaNm = this.clssNoRgstAreaNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tlxNo = this.tlxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfRcptKnt = this.rfRcptKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslHlNo = this.vslHlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lloydNo = this.lloydNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.suzNetTongWgt = this.suzNetTongWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pnmNetTongWgt = this.pnmNetTongWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgstNo = this.rgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslRmk = this.vslRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loaLen = this.loaLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfRcptMaxKnt = this.rfRcptMaxKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLnchDt = this.vslLnchDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBldrNm = this.vslBldrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crwKnt = this.crwKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCreOfcCd = this.vslCreOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSftCstruCertiExpDt = this.vslSftCstruCertiExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blstTnkCapa = this.blstTnkCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pnmGtWgt = this.pnmGtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bwthstMkrNm = this.bwthstMkrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClzDt = this.vslClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.suzGtWgt = this.suzGtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.madnVoySuzNetTongWgt = this.madnVoySuzNetTongWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgtShpTongWgt = this.lgtShpTongWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.foilCapa = this.foilCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDeratCertiExpDt = this.vslDeratCertiExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTeuKnt = this.ttlTeuKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.foilCsm = this.foilCsm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doilCsm = this.doilCsm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDeDt = this.vslDeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwtWgt = this.dwtWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnEngRpmPwr = this.mnEngRpmPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crrCd = this.crrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSftEqCertiExpDt = this.vslSftEqCertiExpDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.doilCapa = this.doilCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClssFlg = this.vslClssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frshWtrCapa = this.frshWtrCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrOpCapa = this.cntrOpCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.piclbDesc = this.piclbDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslOwnIndCd = this.vslOwnIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrDznCapa = this.cntrDznCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.frshWtrCsm = this.frshWtrCsm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiVslCd = this.modiVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdrDivCd = this.fdrDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.smrDrftHgt = this.smrDrftHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDeltOfcCd = this.vslDeltOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bwthstBhpPwr = this.bwthstBhpPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslEdiNm = this.vslEdiNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslEml = this.vslEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnEngMkrNm = this.mnEngMkrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBldAreaNm = this.vslBldAreaNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnrBhpPwr = this.gnrBhpPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslHtchKnt = this.vslHtchKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.maxSpd = this.maxSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslRgstCntCd = this.vslRgstCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslEngNm = this.vslEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrPnmCapa = this.cntrPnmCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnrRpmPwr = this.gnrRpmPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslClssNo = this.vslClssNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netRgstTongWgt = this.netRgstTongWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslLoclNm = this.vslLoclNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslBldCd = this.vslBldCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bwthstTpDesc = this.bwthstTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ecnSpd = this.ecnSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnEngBhpPwr = this.mnEngBhpPwr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrVslClssCapa = this.cntrVslClssCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslKelLyDt = this.vslKelLyDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.intlTongCertiFlg = this.intlTongCertiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslWdt = this.vslWdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSvcSpd = this.vslSvcSpd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gnrMkrNm = this.gnrMkrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
