/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCorrectionVO.java
*@FileTitle : BkgCorrectionVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.12.21
*@LastModifier : 류대영
*@LastVersion : 1.0
* 2009.12.21 류대영 
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
 * @author 류대영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCorrectionVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCorrectionVO> models = new ArrayList<BkgCorrectionVO>();
	
	/* Column Info */
	private String corrDt = null;
	/* Column Info */
	private String rtCorrFlg = null;
	/* Column Info */
	private String corrReadOfcFlg1 = null;
	/* Column Info */
	private String corrReadOfcFlg2 = null;
	/* Column Info */
	private String corrReadOfcFlg3 = null;
	/* Column Info */
	private String bisSysIfFlg = null;
	/* Column Info */
	private String corrReadOfcFlg4 = null;
	/* Column Info */
	private String corrReadOfcFlg5 = null;
	/* Column Info */
	private String corrReadOfcFlg6 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cxlModiFlg = null;
	/* Column Info */
	private String bbModiFlg = null;
	/* Column Info */
	private String bkgCmbModiFlg = null;
	/* Column Info */
	private String bkgCntrModiFlg = null;
	/* Column Info */
	private String blObrdCorrFlg = null;
	/* Column Info */
	private String eqSubModiFlg = null;
	/* Column Info */
	private String ibInterRmk = null;
	/* Column Info */
	private String blMkDescModiFlg = null;
	/* Column Info */
	private String corrCxlFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String chgTermCorrFlg = null;
	/* Column Info */
	private String custModiFlg = null;
	/* Column Info */
	private String rtModiFlg = null;
	/* Column Info */
	private String trnkVslCorrFlg = null;
	/* Column Info */
	private String awkModiFlg = null;
	/* Column Info */
	private String caRlyPortModiFlg = null;
	/* Column Info */
	private String dgModiFlg = null;
	/* Column Info */
	private String corrUsrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String custCorrFlg = null;
	/* Column Info */
	private String prpstVslCorrFlg = null;
	/* Column Info */
	private String docPerfExptCd = null;
	/* Column Info */
	private String rdnAcptFlg = null;
	/* Column Info */
	private String measQtyCorrFlg = null;
	/* Column Info */
	private String cmdtCorrFlg = null;
	/* Column Info */
	private String ibTroModiFlg = null;
	/* Column Info */
	private String cntrMfModiFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rfModiFlg = null;
	/* Column Info */
	private String hngrModiFlg = null;
	/* Column Info */
	private String obTroModiFlg = null;
	/* Column Info */
	private String rdnNo = null;
	/* Column Info */
	private String bndCorrFlg = null;
	/* Column Info */
	private String corrNtcOfcCd6 = null;
	/* Column Info */
	private String corrNtcOfcCd7 = null;
	/* Column Info */
	private String expnFlg = null;
	/* Column Info */
	private String newBkgCreFlg = null;
	/* Column Info */
	private String caOtrRsnCorrFlg = null;
	/* Column Info */
	private String corrNtcOfcCd4 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String corrNtcOfcCd5 = null;
	/* Column Info */
	private String bkgCreModiFlg = null;
	/* Column Info */
	private String corrNtcOfcCd8 = null;
	/* Column Info */
	private String socModiFlg = null;
	/* Column Info */
	private String cnslModiFlg = null;
	/* Column Info */
	private String corrGdt = null;
	/* Column Info */
	private String corrNtcOfcCd2 = null;
	/* Column Info */
	private String corrNtcOfcCd3 = null;
	/* Column Info */
	private String corrNtcOfcCd1 = null;
	/* Column Info */
	private String corrOfcCd = null;
	/* Column Info */
	private String bkgCorrRmk = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String caRsnCd = null;
	/* Column Info */
	private String rcreModiFlg = null;
	/* Column Info */
	private String bkgSplitModiFlg = null;
	/* Column Info */
	private String docPerfExptDt = null;
	/* Column Info */
	private String brogGenCorrFlg = null;
	/* Column Info */
	private String corrNo = null;
	/* Column Info */
	private String ratFlg = null;
	/* Column Info */
	private String qtyCorrFlg = null;
	/* Column Info */
	private String rvisSeq = null;
	/* Column Info */
	private String codModiFlg = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String rcvdeTermCorrFlg = null;
	/* Column Info */
	private String corrReadOfcFlg8 = null;
	/* Column Info */
	private String routCorrFlg = null;
	/* Column Info */
	private String corrReadOfcFlg7 = null;
	/* Column Info */
	private String rdModiFlg = null;
	/* Column Info */
	private String sccModiCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCorrectionVO() {}

	public BkgCorrectionVO(String ibflag, String pagerows, String bkgNo, String corrNo, String caRsnCd, String corrUsrId, String corrDt, String ratFlg, String expnFlg, String newBkgCreFlg, String rcreModiFlg, String bkgCreModiFlg, String corrCxlFlg, String obTroModiFlg, String ibTroModiFlg, String bkgSplitModiFlg, String codModiFlg, String cxlModiFlg, String caRlyPortModiFlg, String dgModiFlg, String awkModiFlg, String rfModiFlg, String bbModiFlg, String rdModiFlg, String hngrModiFlg, String socModiFlg, String eqSubModiFlg, String custModiFlg, String blMkDescModiFlg, String cnslModiFlg, String bkgCntrModiFlg, String cntrMfModiFlg, String rtModiFlg, String blObrdCorrFlg, String rtCorrFlg, String chgTermCorrFlg, String rcvdeTermCorrFlg, String routCorrFlg, String custCorrFlg, String qtyCorrFlg, String measQtyCorrFlg, String cmdtCorrFlg, String trnkVslCorrFlg, String prpstVslCorrFlg, String caOtrRsnCorrFlg, String bndCorrFlg, String brogGenCorrFlg, String bisSysIfFlg, String sccModiCd, String bkgCorrRmk, String corrOfcCd, String docPerfExptCd, String docPerfExptDt, String diffRmk, String corrNtcOfcCd1, String corrReadOfcFlg1, String corrNtcOfcCd2, String corrReadOfcFlg2, String corrNtcOfcCd3, String corrReadOfcFlg3, String corrNtcOfcCd4, String corrReadOfcFlg4, String corrNtcOfcCd5, String corrReadOfcFlg5, String corrNtcOfcCd6, String corrReadOfcFlg6, String corrNtcOfcCd7, String corrReadOfcFlg7, String corrNtcOfcCd8, String corrReadOfcFlg8, String ibInterRmk, String creUsrId, String creDt, String updUsrId, String updDt, String corrGdt, String rdnNo, String rvisSeq, String rdnAcptFlg, String bkgCmbModiFlg) {
		this.corrDt = corrDt;
		this.rtCorrFlg = rtCorrFlg;
		this.corrReadOfcFlg1 = corrReadOfcFlg1;
		this.corrReadOfcFlg2 = corrReadOfcFlg2;
		this.corrReadOfcFlg3 = corrReadOfcFlg3;
		this.bisSysIfFlg = bisSysIfFlg;
		this.corrReadOfcFlg4 = corrReadOfcFlg4;
		this.corrReadOfcFlg5 = corrReadOfcFlg5;
		this.corrReadOfcFlg6 = corrReadOfcFlg6;
		this.pagerows = pagerows;
		this.cxlModiFlg = cxlModiFlg;
		this.bbModiFlg = bbModiFlg;
		this.bkgCmbModiFlg = bkgCmbModiFlg;
		this.bkgCntrModiFlg = bkgCntrModiFlg;
		this.blObrdCorrFlg = blObrdCorrFlg;
		this.eqSubModiFlg = eqSubModiFlg;
		this.ibInterRmk = ibInterRmk;
		this.blMkDescModiFlg = blMkDescModiFlg;
		this.corrCxlFlg = corrCxlFlg;
		this.updUsrId = updUsrId;
		this.chgTermCorrFlg = chgTermCorrFlg;
		this.custModiFlg = custModiFlg;
		this.rtModiFlg = rtModiFlg;
		this.trnkVslCorrFlg = trnkVslCorrFlg;
		this.awkModiFlg = awkModiFlg;
		this.caRlyPortModiFlg = caRlyPortModiFlg;
		this.dgModiFlg = dgModiFlg;
		this.corrUsrId = corrUsrId;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.custCorrFlg = custCorrFlg;
		this.prpstVslCorrFlg = prpstVslCorrFlg;
		this.docPerfExptCd = docPerfExptCd;
		this.rdnAcptFlg = rdnAcptFlg;
		this.measQtyCorrFlg = measQtyCorrFlg;
		this.cmdtCorrFlg = cmdtCorrFlg;
		this.ibTroModiFlg = ibTroModiFlg;
		this.cntrMfModiFlg = cntrMfModiFlg;
		this.creDt = creDt;
		this.rfModiFlg = rfModiFlg;
		this.hngrModiFlg = hngrModiFlg;
		this.obTroModiFlg = obTroModiFlg;
		this.rdnNo = rdnNo;
		this.bndCorrFlg = bndCorrFlg;
		this.corrNtcOfcCd6 = corrNtcOfcCd6;
		this.corrNtcOfcCd7 = corrNtcOfcCd7;
		this.expnFlg = expnFlg;
		this.newBkgCreFlg = newBkgCreFlg;
		this.caOtrRsnCorrFlg = caOtrRsnCorrFlg;
		this.corrNtcOfcCd4 = corrNtcOfcCd4;
		this.ibflag = ibflag;
		this.corrNtcOfcCd5 = corrNtcOfcCd5;
		this.bkgCreModiFlg = bkgCreModiFlg;
		this.corrNtcOfcCd8 = corrNtcOfcCd8;
		this.socModiFlg = socModiFlg;
		this.cnslModiFlg = cnslModiFlg;
		this.corrGdt = corrGdt;
		this.corrNtcOfcCd2 = corrNtcOfcCd2;
		this.corrNtcOfcCd3 = corrNtcOfcCd3;
		this.corrNtcOfcCd1 = corrNtcOfcCd1;
		this.corrOfcCd = corrOfcCd;
		this.bkgCorrRmk = bkgCorrRmk;
		this.updDt = updDt;
		this.caRsnCd = caRsnCd;
		this.rcreModiFlg = rcreModiFlg;
		this.bkgSplitModiFlg = bkgSplitModiFlg;
		this.docPerfExptDt = docPerfExptDt;
		this.brogGenCorrFlg = brogGenCorrFlg;
		this.corrNo = corrNo;
		this.ratFlg = ratFlg;
		this.qtyCorrFlg = qtyCorrFlg;
		this.rvisSeq = rvisSeq;
		this.codModiFlg = codModiFlg;
		this.diffRmk = diffRmk;
		this.rcvdeTermCorrFlg = rcvdeTermCorrFlg;
		this.corrReadOfcFlg8 = corrReadOfcFlg8;
		this.routCorrFlg = routCorrFlg;
		this.corrReadOfcFlg7 = corrReadOfcFlg7;
		this.rdModiFlg = rdModiFlg;
		this.sccModiCd = sccModiCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("corr_dt", getCorrDt());
		this.hashColumns.put("rt_corr_flg", getRtCorrFlg());
		this.hashColumns.put("corr_read_ofc_flg1", getCorrReadOfcFlg1());
		this.hashColumns.put("corr_read_ofc_flg2", getCorrReadOfcFlg2());
		this.hashColumns.put("corr_read_ofc_flg3", getCorrReadOfcFlg3());
		this.hashColumns.put("bis_sys_if_flg", getBisSysIfFlg());
		this.hashColumns.put("corr_read_ofc_flg4", getCorrReadOfcFlg4());
		this.hashColumns.put("corr_read_ofc_flg5", getCorrReadOfcFlg5());
		this.hashColumns.put("corr_read_ofc_flg6", getCorrReadOfcFlg6());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cxl_modi_flg", getCxlModiFlg());
		this.hashColumns.put("bb_modi_flg", getBbModiFlg());
		this.hashColumns.put("bkg_cmb_modi_flg", getBkgCmbModiFlg());
		this.hashColumns.put("bkg_cntr_modi_flg", getBkgCntrModiFlg());
		this.hashColumns.put("bl_obrd_corr_flg", getBlObrdCorrFlg());
		this.hashColumns.put("eq_sub_modi_flg", getEqSubModiFlg());
		this.hashColumns.put("ib_inter_rmk", getIbInterRmk());
		this.hashColumns.put("bl_mk_desc_modi_flg", getBlMkDescModiFlg());
		this.hashColumns.put("corr_cxl_flg", getCorrCxlFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("chg_term_corr_flg", getChgTermCorrFlg());
		this.hashColumns.put("cust_modi_flg", getCustModiFlg());
		this.hashColumns.put("rt_modi_flg", getRtModiFlg());
		this.hashColumns.put("trnk_vsl_corr_flg", getTrnkVslCorrFlg());
		this.hashColumns.put("awk_modi_flg", getAwkModiFlg());
		this.hashColumns.put("ca_rly_port_modi_flg", getCaRlyPortModiFlg());
		this.hashColumns.put("dg_modi_flg", getDgModiFlg());
		this.hashColumns.put("corr_usr_id", getCorrUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cust_corr_flg", getCustCorrFlg());
		this.hashColumns.put("prpst_vsl_corr_flg", getPrpstVslCorrFlg());
		this.hashColumns.put("doc_perf_expt_cd", getDocPerfExptCd());
		this.hashColumns.put("rdn_acpt_flg", getRdnAcptFlg());
		this.hashColumns.put("meas_qty_corr_flg", getMeasQtyCorrFlg());
		this.hashColumns.put("cmdt_corr_flg", getCmdtCorrFlg());
		this.hashColumns.put("ib_tro_modi_flg", getIbTroModiFlg());
		this.hashColumns.put("cntr_mf_modi_flg", getCntrMfModiFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rf_modi_flg", getRfModiFlg());
		this.hashColumns.put("hngr_modi_flg", getHngrModiFlg());
		this.hashColumns.put("ob_tro_modi_flg", getObTroModiFlg());
		this.hashColumns.put("rdn_no", getRdnNo());
		this.hashColumns.put("bnd_corr_flg", getBndCorrFlg());
		this.hashColumns.put("corr_ntc_ofc_cd6", getCorrNtcOfcCd6());
		this.hashColumns.put("corr_ntc_ofc_cd7", getCorrNtcOfcCd7());
		this.hashColumns.put("expn_flg", getExpnFlg());
		this.hashColumns.put("new_bkg_cre_flg", getNewBkgCreFlg());
		this.hashColumns.put("ca_otr_rsn_corr_flg", getCaOtrRsnCorrFlg());
		this.hashColumns.put("corr_ntc_ofc_cd4", getCorrNtcOfcCd4());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("corr_ntc_ofc_cd5", getCorrNtcOfcCd5());
		this.hashColumns.put("bkg_cre_modi_flg", getBkgCreModiFlg());
		this.hashColumns.put("corr_ntc_ofc_cd8", getCorrNtcOfcCd8());
		this.hashColumns.put("soc_modi_flg", getSocModiFlg());
		this.hashColumns.put("cnsl_modi_flg", getCnslModiFlg());
		this.hashColumns.put("corr_gdt", getCorrGdt());
		this.hashColumns.put("corr_ntc_ofc_cd2", getCorrNtcOfcCd2());
		this.hashColumns.put("corr_ntc_ofc_cd3", getCorrNtcOfcCd3());
		this.hashColumns.put("corr_ntc_ofc_cd1", getCorrNtcOfcCd1());
		this.hashColumns.put("corr_ofc_cd", getCorrOfcCd());
		this.hashColumns.put("bkg_corr_rmk", getBkgCorrRmk());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ca_rsn_cd", getCaRsnCd());
		this.hashColumns.put("rcre_modi_flg", getRcreModiFlg());
		this.hashColumns.put("bkg_split_modi_flg", getBkgSplitModiFlg());
		this.hashColumns.put("doc_perf_expt_dt", getDocPerfExptDt());
		this.hashColumns.put("brog_gen_corr_flg", getBrogGenCorrFlg());
		this.hashColumns.put("corr_no", getCorrNo());
		this.hashColumns.put("rat_flg", getRatFlg());
		this.hashColumns.put("qty_corr_flg", getQtyCorrFlg());
		this.hashColumns.put("rvis_seq", getRvisSeq());
		this.hashColumns.put("cod_modi_flg", getCodModiFlg());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("rcvde_term_corr_flg", getRcvdeTermCorrFlg());
		this.hashColumns.put("corr_read_ofc_flg8", getCorrReadOfcFlg8());
		this.hashColumns.put("rout_corr_flg", getRoutCorrFlg());
		this.hashColumns.put("corr_read_ofc_flg7", getCorrReadOfcFlg7());
		this.hashColumns.put("rd_modi_flg", getRdModiFlg());
		this.hashColumns.put("scc_modi_cd", getSccModiCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("corr_dt", "corrDt");
		this.hashFields.put("rt_corr_flg", "rtCorrFlg");
		this.hashFields.put("corr_read_ofc_flg1", "corrReadOfcFlg1");
		this.hashFields.put("corr_read_ofc_flg2", "corrReadOfcFlg2");
		this.hashFields.put("corr_read_ofc_flg3", "corrReadOfcFlg3");
		this.hashFields.put("bis_sys_if_flg", "bisSysIfFlg");
		this.hashFields.put("corr_read_ofc_flg4", "corrReadOfcFlg4");
		this.hashFields.put("corr_read_ofc_flg5", "corrReadOfcFlg5");
		this.hashFields.put("corr_read_ofc_flg6", "corrReadOfcFlg6");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cxl_modi_flg", "cxlModiFlg");
		this.hashFields.put("bb_modi_flg", "bbModiFlg");
		this.hashFields.put("bkg_cmb_modi_flg", "bkgCmbModiFlg");
		this.hashFields.put("bkg_cntr_modi_flg", "bkgCntrModiFlg");
		this.hashFields.put("bl_obrd_corr_flg", "blObrdCorrFlg");
		this.hashFields.put("eq_sub_modi_flg", "eqSubModiFlg");
		this.hashFields.put("ib_inter_rmk", "ibInterRmk");
		this.hashFields.put("bl_mk_desc_modi_flg", "blMkDescModiFlg");
		this.hashFields.put("corr_cxl_flg", "corrCxlFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("chg_term_corr_flg", "chgTermCorrFlg");
		this.hashFields.put("cust_modi_flg", "custModiFlg");
		this.hashFields.put("rt_modi_flg", "rtModiFlg");
		this.hashFields.put("trnk_vsl_corr_flg", "trnkVslCorrFlg");
		this.hashFields.put("awk_modi_flg", "awkModiFlg");
		this.hashFields.put("ca_rly_port_modi_flg", "caRlyPortModiFlg");
		this.hashFields.put("dg_modi_flg", "dgModiFlg");
		this.hashFields.put("corr_usr_id", "corrUsrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cust_corr_flg", "custCorrFlg");
		this.hashFields.put("prpst_vsl_corr_flg", "prpstVslCorrFlg");
		this.hashFields.put("doc_perf_expt_cd", "docPerfExptCd");
		this.hashFields.put("rdn_acpt_flg", "rdnAcptFlg");
		this.hashFields.put("meas_qty_corr_flg", "measQtyCorrFlg");
		this.hashFields.put("cmdt_corr_flg", "cmdtCorrFlg");
		this.hashFields.put("ib_tro_modi_flg", "ibTroModiFlg");
		this.hashFields.put("cntr_mf_modi_flg", "cntrMfModiFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rf_modi_flg", "rfModiFlg");
		this.hashFields.put("hngr_modi_flg", "hngrModiFlg");
		this.hashFields.put("ob_tro_modi_flg", "obTroModiFlg");
		this.hashFields.put("rdn_no", "rdnNo");
		this.hashFields.put("bnd_corr_flg", "bndCorrFlg");
		this.hashFields.put("corr_ntc_ofc_cd6", "corrNtcOfcCd6");
		this.hashFields.put("corr_ntc_ofc_cd7", "corrNtcOfcCd7");
		this.hashFields.put("expn_flg", "expnFlg");
		this.hashFields.put("new_bkg_cre_flg", "newBkgCreFlg");
		this.hashFields.put("ca_otr_rsn_corr_flg", "caOtrRsnCorrFlg");
		this.hashFields.put("corr_ntc_ofc_cd4", "corrNtcOfcCd4");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("corr_ntc_ofc_cd5", "corrNtcOfcCd5");
		this.hashFields.put("bkg_cre_modi_flg", "bkgCreModiFlg");
		this.hashFields.put("corr_ntc_ofc_cd8", "corrNtcOfcCd8");
		this.hashFields.put("soc_modi_flg", "socModiFlg");
		this.hashFields.put("cnsl_modi_flg", "cnslModiFlg");
		this.hashFields.put("corr_gdt", "corrGdt");
		this.hashFields.put("corr_ntc_ofc_cd2", "corrNtcOfcCd2");
		this.hashFields.put("corr_ntc_ofc_cd3", "corrNtcOfcCd3");
		this.hashFields.put("corr_ntc_ofc_cd1", "corrNtcOfcCd1");
		this.hashFields.put("corr_ofc_cd", "corrOfcCd");
		this.hashFields.put("bkg_corr_rmk", "bkgCorrRmk");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ca_rsn_cd", "caRsnCd");
		this.hashFields.put("rcre_modi_flg", "rcreModiFlg");
		this.hashFields.put("bkg_split_modi_flg", "bkgSplitModiFlg");
		this.hashFields.put("doc_perf_expt_dt", "docPerfExptDt");
		this.hashFields.put("brog_gen_corr_flg", "brogGenCorrFlg");
		this.hashFields.put("corr_no", "corrNo");
		this.hashFields.put("rat_flg", "ratFlg");
		this.hashFields.put("qty_corr_flg", "qtyCorrFlg");
		this.hashFields.put("rvis_seq", "rvisSeq");
		this.hashFields.put("cod_modi_flg", "codModiFlg");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("rcvde_term_corr_flg", "rcvdeTermCorrFlg");
		this.hashFields.put("corr_read_ofc_flg8", "corrReadOfcFlg8");
		this.hashFields.put("rout_corr_flg", "routCorrFlg");
		this.hashFields.put("corr_read_ofc_flg7", "corrReadOfcFlg7");
		this.hashFields.put("rd_modi_flg", "rdModiFlg");
		this.hashFields.put("scc_modi_cd", "sccModiCd");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return corrDt
	 */
	public String getCorrDt() {
		return this.corrDt;
	}
	
	/**
	 * Column Info
	 * @return rtCorrFlg
	 */
	public String getRtCorrFlg() {
		return this.rtCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg1
	 */
	public String getCorrReadOfcFlg1() {
		return this.corrReadOfcFlg1;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg2
	 */
	public String getCorrReadOfcFlg2() {
		return this.corrReadOfcFlg2;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg3
	 */
	public String getCorrReadOfcFlg3() {
		return this.corrReadOfcFlg3;
	}
	
	/**
	 * Column Info
	 * @return bisSysIfFlg
	 */
	public String getBisSysIfFlg() {
		return this.bisSysIfFlg;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg4
	 */
	public String getCorrReadOfcFlg4() {
		return this.corrReadOfcFlg4;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg5
	 */
	public String getCorrReadOfcFlg5() {
		return this.corrReadOfcFlg5;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg6
	 */
	public String getCorrReadOfcFlg6() {
		return this.corrReadOfcFlg6;
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
	 * @return cxlModiFlg
	 */
	public String getCxlModiFlg() {
		return this.cxlModiFlg;
	}
	
	/**
	 * Column Info
	 * @return bbModiFlg
	 */
	public String getBbModiFlg() {
		return this.bbModiFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgCmbModiFlg
	 */
	public String getBkgCmbModiFlg() {
		return this.bkgCmbModiFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgCntrModiFlg
	 */
	public String getBkgCntrModiFlg() {
		return this.bkgCntrModiFlg;
	}
	
	/**
	 * Column Info
	 * @return blObrdCorrFlg
	 */
	public String getBlObrdCorrFlg() {
		return this.blObrdCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return eqSubModiFlg
	 */
	public String getEqSubModiFlg() {
		return this.eqSubModiFlg;
	}
	
	/**
	 * Column Info
	 * @return ibInterRmk
	 */
	public String getIbInterRmk() {
		return this.ibInterRmk;
	}
	
	/**
	 * Column Info
	 * @return blMkDescModiFlg
	 */
	public String getBlMkDescModiFlg() {
		return this.blMkDescModiFlg;
	}
	
	/**
	 * Column Info
	 * @return corrCxlFlg
	 */
	public String getCorrCxlFlg() {
		return this.corrCxlFlg;
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
	 * @return chgTermCorrFlg
	 */
	public String getChgTermCorrFlg() {
		return this.chgTermCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return custModiFlg
	 */
	public String getCustModiFlg() {
		return this.custModiFlg;
	}
	
	/**
	 * Column Info
	 * @return rtModiFlg
	 */
	public String getRtModiFlg() {
		return this.rtModiFlg;
	}
	
	/**
	 * Column Info
	 * @return trnkVslCorrFlg
	 */
	public String getTrnkVslCorrFlg() {
		return this.trnkVslCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return awkModiFlg
	 */
	public String getAwkModiFlg() {
		return this.awkModiFlg;
	}
	
	/**
	 * Column Info
	 * @return caRlyPortModiFlg
	 */
	public String getCaRlyPortModiFlg() {
		return this.caRlyPortModiFlg;
	}
	
	/**
	 * Column Info
	 * @return dgModiFlg
	 */
	public String getDgModiFlg() {
		return this.dgModiFlg;
	}
	
	/**
	 * Column Info
	 * @return corrUsrId
	 */
	public String getCorrUsrId() {
		return this.corrUsrId;
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
	 * @return custCorrFlg
	 */
	public String getCustCorrFlg() {
		return this.custCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return prpstVslCorrFlg
	 */
	public String getPrpstVslCorrFlg() {
		return this.prpstVslCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return docPerfExptCd
	 */
	public String getDocPerfExptCd() {
		return this.docPerfExptCd;
	}
	
	/**
	 * Column Info
	 * @return rdnAcptFlg
	 */
	public String getRdnAcptFlg() {
		return this.rdnAcptFlg;
	}
	
	/**
	 * Column Info
	 * @return measQtyCorrFlg
	 */
	public String getMeasQtyCorrFlg() {
		return this.measQtyCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return cmdtCorrFlg
	 */
	public String getCmdtCorrFlg() {
		return this.cmdtCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return ibTroModiFlg
	 */
	public String getIbTroModiFlg() {
		return this.ibTroModiFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrMfModiFlg
	 */
	public String getCntrMfModiFlg() {
		return this.cntrMfModiFlg;
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
	 * @return rfModiFlg
	 */
	public String getRfModiFlg() {
		return this.rfModiFlg;
	}
	
	/**
	 * Column Info
	 * @return hngrModiFlg
	 */
	public String getHngrModiFlg() {
		return this.hngrModiFlg;
	}
	
	/**
	 * Column Info
	 * @return obTroModiFlg
	 */
	public String getObTroModiFlg() {
		return this.obTroModiFlg;
	}
	
	/**
	 * Column Info
	 * @return rdnNo
	 */
	public String getRdnNo() {
		return this.rdnNo;
	}
	
	/**
	 * Column Info
	 * @return bndCorrFlg
	 */
	public String getBndCorrFlg() {
		return this.bndCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd6
	 */
	public String getCorrNtcOfcCd6() {
		return this.corrNtcOfcCd6;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd7
	 */
	public String getCorrNtcOfcCd7() {
		return this.corrNtcOfcCd7;
	}
	
	/**
	 * Column Info
	 * @return expnFlg
	 */
	public String getExpnFlg() {
		return this.expnFlg;
	}
	
	/**
	 * Column Info
	 * @return newBkgCreFlg
	 */
	public String getNewBkgCreFlg() {
		return this.newBkgCreFlg;
	}
	
	/**
	 * Column Info
	 * @return caOtrRsnCorrFlg
	 */
	public String getCaOtrRsnCorrFlg() {
		return this.caOtrRsnCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd4
	 */
	public String getCorrNtcOfcCd4() {
		return this.corrNtcOfcCd4;
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
	 * @return corrNtcOfcCd5
	 */
	public String getCorrNtcOfcCd5() {
		return this.corrNtcOfcCd5;
	}
	
	/**
	 * Column Info
	 * @return bkgCreModiFlg
	 */
	public String getBkgCreModiFlg() {
		return this.bkgCreModiFlg;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd8
	 */
	public String getCorrNtcOfcCd8() {
		return this.corrNtcOfcCd8;
	}
	
	/**
	 * Column Info
	 * @return socModiFlg
	 */
	public String getSocModiFlg() {
		return this.socModiFlg;
	}
	
	/**
	 * Column Info
	 * @return cnslModiFlg
	 */
	public String getCnslModiFlg() {
		return this.cnslModiFlg;
	}
	
	/**
	 * Column Info
	 * @return corrGdt
	 */
	public String getCorrGdt() {
		return this.corrGdt;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd2
	 */
	public String getCorrNtcOfcCd2() {
		return this.corrNtcOfcCd2;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd3
	 */
	public String getCorrNtcOfcCd3() {
		return this.corrNtcOfcCd3;
	}
	
	/**
	 * Column Info
	 * @return corrNtcOfcCd1
	 */
	public String getCorrNtcOfcCd1() {
		return this.corrNtcOfcCd1;
	}
	
	/**
	 * Column Info
	 * @return corrOfcCd
	 */
	public String getCorrOfcCd() {
		return this.corrOfcCd;
	}
	
	/**
	 * Column Info
	 * @return bkgCorrRmk
	 */
	public String getBkgCorrRmk() {
		return this.bkgCorrRmk;
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
	 * @return caRsnCd
	 */
	public String getCaRsnCd() {
		return this.caRsnCd;
	}
	
	/**
	 * Column Info
	 * @return rcreModiFlg
	 */
	public String getRcreModiFlg() {
		return this.rcreModiFlg;
	}
	
	/**
	 * Column Info
	 * @return bkgSplitModiFlg
	 */
	public String getBkgSplitModiFlg() {
		return this.bkgSplitModiFlg;
	}
	
	/**
	 * Column Info
	 * @return docPerfExptDt
	 */
	public String getDocPerfExptDt() {
		return this.docPerfExptDt;
	}
	
	/**
	 * Column Info
	 * @return brogGenCorrFlg
	 */
	public String getBrogGenCorrFlg() {
		return this.brogGenCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return corrNo
	 */
	public String getCorrNo() {
		return this.corrNo;
	}
	
	/**
	 * Column Info
	 * @return ratFlg
	 */
	public String getRatFlg() {
		return this.ratFlg;
	}
	
	/**
	 * Column Info
	 * @return qtyCorrFlg
	 */
	public String getQtyCorrFlg() {
		return this.qtyCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return rvisSeq
	 */
	public String getRvisSeq() {
		return this.rvisSeq;
	}
	
	/**
	 * Column Info
	 * @return codModiFlg
	 */
	public String getCodModiFlg() {
		return this.codModiFlg;
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
	 * @return rcvdeTermCorrFlg
	 */
	public String getRcvdeTermCorrFlg() {
		return this.rcvdeTermCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg8
	 */
	public String getCorrReadOfcFlg8() {
		return this.corrReadOfcFlg8;
	}
	
	/**
	 * Column Info
	 * @return routCorrFlg
	 */
	public String getRoutCorrFlg() {
		return this.routCorrFlg;
	}
	
	/**
	 * Column Info
	 * @return corrReadOfcFlg7
	 */
	public String getCorrReadOfcFlg7() {
		return this.corrReadOfcFlg7;
	}
	
	/**
	 * Column Info
	 * @return rdModiFlg
	 */
	public String getRdModiFlg() {
		return this.rdModiFlg;
	}
	
	/**
	 * Column Info
	 * @return sccModiCd
	 */
	public String getSccModiCd() {
		return this.sccModiCd;
	}
	

	/**
	 * Column Info
	 * @param corrDt
	 */
	public void setCorrDt(String corrDt) {
		this.corrDt = corrDt;
	}
	
	/**
	 * Column Info
	 * @param rtCorrFlg
	 */
	public void setRtCorrFlg(String rtCorrFlg) {
		this.rtCorrFlg = rtCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg1
	 */
	public void setCorrReadOfcFlg1(String corrReadOfcFlg1) {
		this.corrReadOfcFlg1 = corrReadOfcFlg1;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg2
	 */
	public void setCorrReadOfcFlg2(String corrReadOfcFlg2) {
		this.corrReadOfcFlg2 = corrReadOfcFlg2;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg3
	 */
	public void setCorrReadOfcFlg3(String corrReadOfcFlg3) {
		this.corrReadOfcFlg3 = corrReadOfcFlg3;
	}
	
	/**
	 * Column Info
	 * @param bisSysIfFlg
	 */
	public void setBisSysIfFlg(String bisSysIfFlg) {
		this.bisSysIfFlg = bisSysIfFlg;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg4
	 */
	public void setCorrReadOfcFlg4(String corrReadOfcFlg4) {
		this.corrReadOfcFlg4 = corrReadOfcFlg4;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg5
	 */
	public void setCorrReadOfcFlg5(String corrReadOfcFlg5) {
		this.corrReadOfcFlg5 = corrReadOfcFlg5;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg6
	 */
	public void setCorrReadOfcFlg6(String corrReadOfcFlg6) {
		this.corrReadOfcFlg6 = corrReadOfcFlg6;
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
	 * @param cxlModiFlg
	 */
	public void setCxlModiFlg(String cxlModiFlg) {
		this.cxlModiFlg = cxlModiFlg;
	}
	
	/**
	 * Column Info
	 * @param bbModiFlg
	 */
	public void setBbModiFlg(String bbModiFlg) {
		this.bbModiFlg = bbModiFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgCmbModiFlg
	 */
	public void setBkgCmbModiFlg(String bkgCmbModiFlg) {
		this.bkgCmbModiFlg = bkgCmbModiFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgCntrModiFlg
	 */
	public void setBkgCntrModiFlg(String bkgCntrModiFlg) {
		this.bkgCntrModiFlg = bkgCntrModiFlg;
	}
	
	/**
	 * Column Info
	 * @param blObrdCorrFlg
	 */
	public void setBlObrdCorrFlg(String blObrdCorrFlg) {
		this.blObrdCorrFlg = blObrdCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param eqSubModiFlg
	 */
	public void setEqSubModiFlg(String eqSubModiFlg) {
		this.eqSubModiFlg = eqSubModiFlg;
	}
	
	/**
	 * Column Info
	 * @param ibInterRmk
	 */
	public void setIbInterRmk(String ibInterRmk) {
		this.ibInterRmk = ibInterRmk;
	}
	
	/**
	 * Column Info
	 * @param blMkDescModiFlg
	 */
	public void setBlMkDescModiFlg(String blMkDescModiFlg) {
		this.blMkDescModiFlg = blMkDescModiFlg;
	}
	
	/**
	 * Column Info
	 * @param corrCxlFlg
	 */
	public void setCorrCxlFlg(String corrCxlFlg) {
		this.corrCxlFlg = corrCxlFlg;
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
	 * @param chgTermCorrFlg
	 */
	public void setChgTermCorrFlg(String chgTermCorrFlg) {
		this.chgTermCorrFlg = chgTermCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param custModiFlg
	 */
	public void setCustModiFlg(String custModiFlg) {
		this.custModiFlg = custModiFlg;
	}
	
	/**
	 * Column Info
	 * @param rtModiFlg
	 */
	public void setRtModiFlg(String rtModiFlg) {
		this.rtModiFlg = rtModiFlg;
	}
	
	/**
	 * Column Info
	 * @param trnkVslCorrFlg
	 */
	public void setTrnkVslCorrFlg(String trnkVslCorrFlg) {
		this.trnkVslCorrFlg = trnkVslCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param awkModiFlg
	 */
	public void setAwkModiFlg(String awkModiFlg) {
		this.awkModiFlg = awkModiFlg;
	}
	
	/**
	 * Column Info
	 * @param caRlyPortModiFlg
	 */
	public void setCaRlyPortModiFlg(String caRlyPortModiFlg) {
		this.caRlyPortModiFlg = caRlyPortModiFlg;
	}
	
	/**
	 * Column Info
	 * @param dgModiFlg
	 */
	public void setDgModiFlg(String dgModiFlg) {
		this.dgModiFlg = dgModiFlg;
	}
	
	/**
	 * Column Info
	 * @param corrUsrId
	 */
	public void setCorrUsrId(String corrUsrId) {
		this.corrUsrId = corrUsrId;
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
	 * @param custCorrFlg
	 */
	public void setCustCorrFlg(String custCorrFlg) {
		this.custCorrFlg = custCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param prpstVslCorrFlg
	 */
	public void setPrpstVslCorrFlg(String prpstVslCorrFlg) {
		this.prpstVslCorrFlg = prpstVslCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param docPerfExptCd
	 */
	public void setDocPerfExptCd(String docPerfExptCd) {
		this.docPerfExptCd = docPerfExptCd;
	}
	
	/**
	 * Column Info
	 * @param rdnAcptFlg
	 */
	public void setRdnAcptFlg(String rdnAcptFlg) {
		this.rdnAcptFlg = rdnAcptFlg;
	}
	
	/**
	 * Column Info
	 * @param measQtyCorrFlg
	 */
	public void setMeasQtyCorrFlg(String measQtyCorrFlg) {
		this.measQtyCorrFlg = measQtyCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param cmdtCorrFlg
	 */
	public void setCmdtCorrFlg(String cmdtCorrFlg) {
		this.cmdtCorrFlg = cmdtCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param ibTroModiFlg
	 */
	public void setIbTroModiFlg(String ibTroModiFlg) {
		this.ibTroModiFlg = ibTroModiFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrMfModiFlg
	 */
	public void setCntrMfModiFlg(String cntrMfModiFlg) {
		this.cntrMfModiFlg = cntrMfModiFlg;
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
	 * @param rfModiFlg
	 */
	public void setRfModiFlg(String rfModiFlg) {
		this.rfModiFlg = rfModiFlg;
	}
	
	/**
	 * Column Info
	 * @param hngrModiFlg
	 */
	public void setHngrModiFlg(String hngrModiFlg) {
		this.hngrModiFlg = hngrModiFlg;
	}
	
	/**
	 * Column Info
	 * @param obTroModiFlg
	 */
	public void setObTroModiFlg(String obTroModiFlg) {
		this.obTroModiFlg = obTroModiFlg;
	}
	
	/**
	 * Column Info
	 * @param rdnNo
	 */
	public void setRdnNo(String rdnNo) {
		this.rdnNo = rdnNo;
	}
	
	/**
	 * Column Info
	 * @param bndCorrFlg
	 */
	public void setBndCorrFlg(String bndCorrFlg) {
		this.bndCorrFlg = bndCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd6
	 */
	public void setCorrNtcOfcCd6(String corrNtcOfcCd6) {
		this.corrNtcOfcCd6 = corrNtcOfcCd6;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd7
	 */
	public void setCorrNtcOfcCd7(String corrNtcOfcCd7) {
		this.corrNtcOfcCd7 = corrNtcOfcCd7;
	}
	
	/**
	 * Column Info
	 * @param expnFlg
	 */
	public void setExpnFlg(String expnFlg) {
		this.expnFlg = expnFlg;
	}
	
	/**
	 * Column Info
	 * @param newBkgCreFlg
	 */
	public void setNewBkgCreFlg(String newBkgCreFlg) {
		this.newBkgCreFlg = newBkgCreFlg;
	}
	
	/**
	 * Column Info
	 * @param caOtrRsnCorrFlg
	 */
	public void setCaOtrRsnCorrFlg(String caOtrRsnCorrFlg) {
		this.caOtrRsnCorrFlg = caOtrRsnCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd4
	 */
	public void setCorrNtcOfcCd4(String corrNtcOfcCd4) {
		this.corrNtcOfcCd4 = corrNtcOfcCd4;
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
	 * @param corrNtcOfcCd5
	 */
	public void setCorrNtcOfcCd5(String corrNtcOfcCd5) {
		this.corrNtcOfcCd5 = corrNtcOfcCd5;
	}
	
	/**
	 * Column Info
	 * @param bkgCreModiFlg
	 */
	public void setBkgCreModiFlg(String bkgCreModiFlg) {
		this.bkgCreModiFlg = bkgCreModiFlg;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd8
	 */
	public void setCorrNtcOfcCd8(String corrNtcOfcCd8) {
		this.corrNtcOfcCd8 = corrNtcOfcCd8;
	}
	
	/**
	 * Column Info
	 * @param socModiFlg
	 */
	public void setSocModiFlg(String socModiFlg) {
		this.socModiFlg = socModiFlg;
	}
	
	/**
	 * Column Info
	 * @param cnslModiFlg
	 */
	public void setCnslModiFlg(String cnslModiFlg) {
		this.cnslModiFlg = cnslModiFlg;
	}
	
	/**
	 * Column Info
	 * @param corrGdt
	 */
	public void setCorrGdt(String corrGdt) {
		this.corrGdt = corrGdt;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd2
	 */
	public void setCorrNtcOfcCd2(String corrNtcOfcCd2) {
		this.corrNtcOfcCd2 = corrNtcOfcCd2;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd3
	 */
	public void setCorrNtcOfcCd3(String corrNtcOfcCd3) {
		this.corrNtcOfcCd3 = corrNtcOfcCd3;
	}
	
	/**
	 * Column Info
	 * @param corrNtcOfcCd1
	 */
	public void setCorrNtcOfcCd1(String corrNtcOfcCd1) {
		this.corrNtcOfcCd1 = corrNtcOfcCd1;
	}
	
	/**
	 * Column Info
	 * @param corrOfcCd
	 */
	public void setCorrOfcCd(String corrOfcCd) {
		this.corrOfcCd = corrOfcCd;
	}
	
	/**
	 * Column Info
	 * @param bkgCorrRmk
	 */
	public void setBkgCorrRmk(String bkgCorrRmk) {
		this.bkgCorrRmk = bkgCorrRmk;
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
	 * @param caRsnCd
	 */
	public void setCaRsnCd(String caRsnCd) {
		this.caRsnCd = caRsnCd;
	}
	
	/**
	 * Column Info
	 * @param rcreModiFlg
	 */
	public void setRcreModiFlg(String rcreModiFlg) {
		this.rcreModiFlg = rcreModiFlg;
	}
	
	/**
	 * Column Info
	 * @param bkgSplitModiFlg
	 */
	public void setBkgSplitModiFlg(String bkgSplitModiFlg) {
		this.bkgSplitModiFlg = bkgSplitModiFlg;
	}
	
	/**
	 * Column Info
	 * @param docPerfExptDt
	 */
	public void setDocPerfExptDt(String docPerfExptDt) {
		this.docPerfExptDt = docPerfExptDt;
	}
	
	/**
	 * Column Info
	 * @param brogGenCorrFlg
	 */
	public void setBrogGenCorrFlg(String brogGenCorrFlg) {
		this.brogGenCorrFlg = brogGenCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param corrNo
	 */
	public void setCorrNo(String corrNo) {
		this.corrNo = corrNo;
	}
	
	/**
	 * Column Info
	 * @param ratFlg
	 */
	public void setRatFlg(String ratFlg) {
		this.ratFlg = ratFlg;
	}
	
	/**
	 * Column Info
	 * @param qtyCorrFlg
	 */
	public void setQtyCorrFlg(String qtyCorrFlg) {
		this.qtyCorrFlg = qtyCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param rvisSeq
	 */
	public void setRvisSeq(String rvisSeq) {
		this.rvisSeq = rvisSeq;
	}
	
	/**
	 * Column Info
	 * @param codModiFlg
	 */
	public void setCodModiFlg(String codModiFlg) {
		this.codModiFlg = codModiFlg;
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
	 * @param rcvdeTermCorrFlg
	 */
	public void setRcvdeTermCorrFlg(String rcvdeTermCorrFlg) {
		this.rcvdeTermCorrFlg = rcvdeTermCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg8
	 */
	public void setCorrReadOfcFlg8(String corrReadOfcFlg8) {
		this.corrReadOfcFlg8 = corrReadOfcFlg8;
	}
	
	/**
	 * Column Info
	 * @param routCorrFlg
	 */
	public void setRoutCorrFlg(String routCorrFlg) {
		this.routCorrFlg = routCorrFlg;
	}
	
	/**
	 * Column Info
	 * @param corrReadOfcFlg7
	 */
	public void setCorrReadOfcFlg7(String corrReadOfcFlg7) {
		this.corrReadOfcFlg7 = corrReadOfcFlg7;
	}
	
	/**
	 * Column Info
	 * @param rdModiFlg
	 */
	public void setRdModiFlg(String rdModiFlg) {
		this.rdModiFlg = rdModiFlg;
	}
	
	/**
	 * Column Info
	 * @param sccModiCd
	 */
	public void setSccModiCd(String sccModiCd) {
		this.sccModiCd = sccModiCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCorrDt(JSPUtil.getParameter(request, "corr_dt", ""));
		setRtCorrFlg(JSPUtil.getParameter(request, "rt_corr_flg", ""));
		setCorrReadOfcFlg1(JSPUtil.getParameter(request, "corr_read_ofc_flg1", ""));
		setCorrReadOfcFlg2(JSPUtil.getParameter(request, "corr_read_ofc_flg2", ""));
		setCorrReadOfcFlg3(JSPUtil.getParameter(request, "corr_read_ofc_flg3", ""));
		setBisSysIfFlg(JSPUtil.getParameter(request, "bis_sys_if_flg", ""));
		setCorrReadOfcFlg4(JSPUtil.getParameter(request, "corr_read_ofc_flg4", ""));
		setCorrReadOfcFlg5(JSPUtil.getParameter(request, "corr_read_ofc_flg5", ""));
		setCorrReadOfcFlg6(JSPUtil.getParameter(request, "corr_read_ofc_flg6", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCxlModiFlg(JSPUtil.getParameter(request, "cxl_modi_flg", ""));
		setBbModiFlg(JSPUtil.getParameter(request, "bb_modi_flg", ""));
		setBkgCmbModiFlg(JSPUtil.getParameter(request, "bkg_cmb_modi_flg", ""));
		setBkgCntrModiFlg(JSPUtil.getParameter(request, "bkg_cntr_modi_flg", ""));
		setBlObrdCorrFlg(JSPUtil.getParameter(request, "bl_obrd_corr_flg", ""));
		setEqSubModiFlg(JSPUtil.getParameter(request, "eq_sub_modi_flg", ""));
		setIbInterRmk(JSPUtil.getParameter(request, "ib_inter_rmk", ""));
		setBlMkDescModiFlg(JSPUtil.getParameter(request, "bl_mk_desc_modi_flg", ""));
		setCorrCxlFlg(JSPUtil.getParameter(request, "corr_cxl_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setChgTermCorrFlg(JSPUtil.getParameter(request, "chg_term_corr_flg", ""));
		setCustModiFlg(JSPUtil.getParameter(request, "cust_modi_flg", ""));
		setRtModiFlg(JSPUtil.getParameter(request, "rt_modi_flg", ""));
		setTrnkVslCorrFlg(JSPUtil.getParameter(request, "trnk_vsl_corr_flg", ""));
		setAwkModiFlg(JSPUtil.getParameter(request, "awk_modi_flg", ""));
		setCaRlyPortModiFlg(JSPUtil.getParameter(request, "ca_rly_port_modi_flg", ""));
		setDgModiFlg(JSPUtil.getParameter(request, "dg_modi_flg", ""));
		setCorrUsrId(JSPUtil.getParameter(request, "corr_usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCustCorrFlg(JSPUtil.getParameter(request, "cust_corr_flg", ""));
		setPrpstVslCorrFlg(JSPUtil.getParameter(request, "prpst_vsl_corr_flg", ""));
		setDocPerfExptCd(JSPUtil.getParameter(request, "doc_perf_expt_cd", ""));
		setRdnAcptFlg(JSPUtil.getParameter(request, "rdn_acpt_flg", ""));
		setMeasQtyCorrFlg(JSPUtil.getParameter(request, "meas_qty_corr_flg", ""));
		setCmdtCorrFlg(JSPUtil.getParameter(request, "cmdt_corr_flg", ""));
		setIbTroModiFlg(JSPUtil.getParameter(request, "ib_tro_modi_flg", ""));
		setCntrMfModiFlg(JSPUtil.getParameter(request, "cntr_mf_modi_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRfModiFlg(JSPUtil.getParameter(request, "rf_modi_flg", ""));
		setHngrModiFlg(JSPUtil.getParameter(request, "hngr_modi_flg", ""));
		setObTroModiFlg(JSPUtil.getParameter(request, "ob_tro_modi_flg", ""));
		setRdnNo(JSPUtil.getParameter(request, "rdn_no", ""));
		setBndCorrFlg(JSPUtil.getParameter(request, "bnd_corr_flg", ""));
		setCorrNtcOfcCd6(JSPUtil.getParameter(request, "corr_ntc_ofc_cd6", ""));
		setCorrNtcOfcCd7(JSPUtil.getParameter(request, "corr_ntc_ofc_cd7", ""));
		setExpnFlg(JSPUtil.getParameter(request, "expn_flg", ""));
		setNewBkgCreFlg(JSPUtil.getParameter(request, "new_bkg_cre_flg", ""));
		setCaOtrRsnCorrFlg(JSPUtil.getParameter(request, "ca_otr_rsn_corr_flg", ""));
		setCorrNtcOfcCd4(JSPUtil.getParameter(request, "corr_ntc_ofc_cd4", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCorrNtcOfcCd5(JSPUtil.getParameter(request, "corr_ntc_ofc_cd5", ""));
		setBkgCreModiFlg(JSPUtil.getParameter(request, "bkg_cre_modi_flg", ""));
		setCorrNtcOfcCd8(JSPUtil.getParameter(request, "corr_ntc_ofc_cd8", ""));
		setSocModiFlg(JSPUtil.getParameter(request, "soc_modi_flg", ""));
		setCnslModiFlg(JSPUtil.getParameter(request, "cnsl_modi_flg", ""));
		setCorrGdt(JSPUtil.getParameter(request, "corr_gdt", ""));
		setCorrNtcOfcCd2(JSPUtil.getParameter(request, "corr_ntc_ofc_cd2", ""));
		setCorrNtcOfcCd3(JSPUtil.getParameter(request, "corr_ntc_ofc_cd3", ""));
		setCorrNtcOfcCd1(JSPUtil.getParameter(request, "corr_ntc_ofc_cd1", ""));
		setCorrOfcCd(JSPUtil.getParameter(request, "corr_ofc_cd", ""));
		setBkgCorrRmk(JSPUtil.getParameter(request, "bkg_corr_rmk", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCaRsnCd(JSPUtil.getParameter(request, "ca_rsn_cd", ""));
		setRcreModiFlg(JSPUtil.getParameter(request, "rcre_modi_flg", ""));
		setBkgSplitModiFlg(JSPUtil.getParameter(request, "bkg_split_modi_flg", ""));
		setDocPerfExptDt(JSPUtil.getParameter(request, "doc_perf_expt_dt", ""));
		setBrogGenCorrFlg(JSPUtil.getParameter(request, "brog_gen_corr_flg", ""));
		setCorrNo(JSPUtil.getParameter(request, "corr_no", ""));
		setRatFlg(JSPUtil.getParameter(request, "rat_flg", ""));
		setQtyCorrFlg(JSPUtil.getParameter(request, "qty_corr_flg", ""));
		setRvisSeq(JSPUtil.getParameter(request, "rvis_seq", ""));
		setCodModiFlg(JSPUtil.getParameter(request, "cod_modi_flg", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setRcvdeTermCorrFlg(JSPUtil.getParameter(request, "rcvde_term_corr_flg", ""));
		setCorrReadOfcFlg8(JSPUtil.getParameter(request, "corr_read_ofc_flg8", ""));
		setRoutCorrFlg(JSPUtil.getParameter(request, "rout_corr_flg", ""));
		setCorrReadOfcFlg7(JSPUtil.getParameter(request, "corr_read_ofc_flg7", ""));
		setRdModiFlg(JSPUtil.getParameter(request, "rd_modi_flg", ""));
		setSccModiCd(JSPUtil.getParameter(request, "scc_modi_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCorrectionVO[]
	 */
	public BkgCorrectionVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCorrectionVO[]
	 */
	public BkgCorrectionVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCorrectionVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] corrDt = (JSPUtil.getParameter(request, prefix	+ "corr_dt", length));
			String[] rtCorrFlg = (JSPUtil.getParameter(request, prefix	+ "rt_corr_flg", length));
			String[] corrReadOfcFlg1 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg1", length));
			String[] corrReadOfcFlg2 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg2", length));
			String[] corrReadOfcFlg3 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg3", length));
			String[] bisSysIfFlg = (JSPUtil.getParameter(request, prefix	+ "bis_sys_if_flg", length));
			String[] corrReadOfcFlg4 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg4", length));
			String[] corrReadOfcFlg5 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg5", length));
			String[] corrReadOfcFlg6 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg6", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cxlModiFlg = (JSPUtil.getParameter(request, prefix	+ "cxl_modi_flg", length));
			String[] bbModiFlg = (JSPUtil.getParameter(request, prefix	+ "bb_modi_flg", length));
			String[] bkgCmbModiFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_cmb_modi_flg", length));
			String[] bkgCntrModiFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_cntr_modi_flg", length));
			String[] blObrdCorrFlg = (JSPUtil.getParameter(request, prefix	+ "bl_obrd_corr_flg", length));
			String[] eqSubModiFlg = (JSPUtil.getParameter(request, prefix	+ "eq_sub_modi_flg", length));
			String[] ibInterRmk = (JSPUtil.getParameter(request, prefix	+ "ib_inter_rmk", length));
			String[] blMkDescModiFlg = (JSPUtil.getParameter(request, prefix	+ "bl_mk_desc_modi_flg", length));
			String[] corrCxlFlg = (JSPUtil.getParameter(request, prefix	+ "corr_cxl_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] chgTermCorrFlg = (JSPUtil.getParameter(request, prefix	+ "chg_term_corr_flg", length));
			String[] custModiFlg = (JSPUtil.getParameter(request, prefix	+ "cust_modi_flg", length));
			String[] rtModiFlg = (JSPUtil.getParameter(request, prefix	+ "rt_modi_flg", length));
			String[] trnkVslCorrFlg = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_corr_flg", length));
			String[] awkModiFlg = (JSPUtil.getParameter(request, prefix	+ "awk_modi_flg", length));
			String[] caRlyPortModiFlg = (JSPUtil.getParameter(request, prefix	+ "ca_rly_port_modi_flg", length));
			String[] dgModiFlg = (JSPUtil.getParameter(request, prefix	+ "dg_modi_flg", length));
			String[] corrUsrId = (JSPUtil.getParameter(request, prefix	+ "corr_usr_id", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] custCorrFlg = (JSPUtil.getParameter(request, prefix	+ "cust_corr_flg", length));
			String[] prpstVslCorrFlg = (JSPUtil.getParameter(request, prefix	+ "prpst_vsl_corr_flg", length));
			String[] docPerfExptCd = (JSPUtil.getParameter(request, prefix	+ "doc_perf_expt_cd", length));
			String[] rdnAcptFlg = (JSPUtil.getParameter(request, prefix	+ "rdn_acpt_flg", length));
			String[] measQtyCorrFlg = (JSPUtil.getParameter(request, prefix	+ "meas_qty_corr_flg", length));
			String[] cmdtCorrFlg = (JSPUtil.getParameter(request, prefix	+ "cmdt_corr_flg", length));
			String[] ibTroModiFlg = (JSPUtil.getParameter(request, prefix	+ "ib_tro_modi_flg", length));
			String[] cntrMfModiFlg = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_modi_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rfModiFlg = (JSPUtil.getParameter(request, prefix	+ "rf_modi_flg", length));
			String[] hngrModiFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_modi_flg", length));
			String[] obTroModiFlg = (JSPUtil.getParameter(request, prefix	+ "ob_tro_modi_flg", length));
			String[] rdnNo = (JSPUtil.getParameter(request, prefix	+ "rdn_no", length));
			String[] bndCorrFlg = (JSPUtil.getParameter(request, prefix	+ "bnd_corr_flg", length));
			String[] corrNtcOfcCd6 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd6", length));
			String[] corrNtcOfcCd7 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd7", length));
			String[] expnFlg = (JSPUtil.getParameter(request, prefix	+ "expn_flg", length));
			String[] newBkgCreFlg = (JSPUtil.getParameter(request, prefix	+ "new_bkg_cre_flg", length));
			String[] caOtrRsnCorrFlg = (JSPUtil.getParameter(request, prefix	+ "ca_otr_rsn_corr_flg", length));
			String[] corrNtcOfcCd4 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd4", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] corrNtcOfcCd5 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd5", length));
			String[] bkgCreModiFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_cre_modi_flg", length));
			String[] corrNtcOfcCd8 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd8", length));
			String[] socModiFlg = (JSPUtil.getParameter(request, prefix	+ "soc_modi_flg", length));
			String[] cnslModiFlg = (JSPUtil.getParameter(request, prefix	+ "cnsl_modi_flg", length));
			String[] corrGdt = (JSPUtil.getParameter(request, prefix	+ "corr_gdt", length));
			String[] corrNtcOfcCd2 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd2", length));
			String[] corrNtcOfcCd3 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd3", length));
			String[] corrNtcOfcCd1 = (JSPUtil.getParameter(request, prefix	+ "corr_ntc_ofc_cd1", length));
			String[] corrOfcCd = (JSPUtil.getParameter(request, prefix	+ "corr_ofc_cd", length));
			String[] bkgCorrRmk = (JSPUtil.getParameter(request, prefix	+ "bkg_corr_rmk", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] caRsnCd = (JSPUtil.getParameter(request, prefix	+ "ca_rsn_cd", length));
			String[] rcreModiFlg = (JSPUtil.getParameter(request, prefix	+ "rcre_modi_flg", length));
			String[] bkgSplitModiFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_split_modi_flg", length));
			String[] docPerfExptDt = (JSPUtil.getParameter(request, prefix	+ "doc_perf_expt_dt", length));
			String[] brogGenCorrFlg = (JSPUtil.getParameter(request, prefix	+ "brog_gen_corr_flg", length));
			String[] corrNo = (JSPUtil.getParameter(request, prefix	+ "corr_no", length));
			String[] ratFlg = (JSPUtil.getParameter(request, prefix	+ "rat_flg", length));
			String[] qtyCorrFlg = (JSPUtil.getParameter(request, prefix	+ "qty_corr_flg", length));
			String[] rvisSeq = (JSPUtil.getParameter(request, prefix	+ "rvis_seq", length));
			String[] codModiFlg = (JSPUtil.getParameter(request, prefix	+ "cod_modi_flg", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] rcvdeTermCorrFlg = (JSPUtil.getParameter(request, prefix	+ "rcvde_term_corr_flg", length));
			String[] corrReadOfcFlg8 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg8", length));
			String[] routCorrFlg = (JSPUtil.getParameter(request, prefix	+ "rout_corr_flg", length));
			String[] corrReadOfcFlg7 = (JSPUtil.getParameter(request, prefix	+ "corr_read_ofc_flg7", length));
			String[] rdModiFlg = (JSPUtil.getParameter(request, prefix	+ "rd_modi_flg", length));
			String[] sccModiCd = (JSPUtil.getParameter(request, prefix	+ "scc_modi_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCorrectionVO();
				if (corrDt[i] != null)
					model.setCorrDt(corrDt[i]);
				if (rtCorrFlg[i] != null)
					model.setRtCorrFlg(rtCorrFlg[i]);
				if (corrReadOfcFlg1[i] != null)
					model.setCorrReadOfcFlg1(corrReadOfcFlg1[i]);
				if (corrReadOfcFlg2[i] != null)
					model.setCorrReadOfcFlg2(corrReadOfcFlg2[i]);
				if (corrReadOfcFlg3[i] != null)
					model.setCorrReadOfcFlg3(corrReadOfcFlg3[i]);
				if (bisSysIfFlg[i] != null)
					model.setBisSysIfFlg(bisSysIfFlg[i]);
				if (corrReadOfcFlg4[i] != null)
					model.setCorrReadOfcFlg4(corrReadOfcFlg4[i]);
				if (corrReadOfcFlg5[i] != null)
					model.setCorrReadOfcFlg5(corrReadOfcFlg5[i]);
				if (corrReadOfcFlg6[i] != null)
					model.setCorrReadOfcFlg6(corrReadOfcFlg6[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cxlModiFlg[i] != null)
					model.setCxlModiFlg(cxlModiFlg[i]);
				if (bbModiFlg[i] != null)
					model.setBbModiFlg(bbModiFlg[i]);
				if (bkgCmbModiFlg[i] != null)
					model.setBkgCmbModiFlg(bkgCmbModiFlg[i]);
				if (bkgCntrModiFlg[i] != null)
					model.setBkgCntrModiFlg(bkgCntrModiFlg[i]);
				if (blObrdCorrFlg[i] != null)
					model.setBlObrdCorrFlg(blObrdCorrFlg[i]);
				if (eqSubModiFlg[i] != null)
					model.setEqSubModiFlg(eqSubModiFlg[i]);
				if (ibInterRmk[i] != null)
					model.setIbInterRmk(ibInterRmk[i]);
				if (blMkDescModiFlg[i] != null)
					model.setBlMkDescModiFlg(blMkDescModiFlg[i]);
				if (corrCxlFlg[i] != null)
					model.setCorrCxlFlg(corrCxlFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (chgTermCorrFlg[i] != null)
					model.setChgTermCorrFlg(chgTermCorrFlg[i]);
				if (custModiFlg[i] != null)
					model.setCustModiFlg(custModiFlg[i]);
				if (rtModiFlg[i] != null)
					model.setRtModiFlg(rtModiFlg[i]);
				if (trnkVslCorrFlg[i] != null)
					model.setTrnkVslCorrFlg(trnkVslCorrFlg[i]);
				if (awkModiFlg[i] != null)
					model.setAwkModiFlg(awkModiFlg[i]);
				if (caRlyPortModiFlg[i] != null)
					model.setCaRlyPortModiFlg(caRlyPortModiFlg[i]);
				if (dgModiFlg[i] != null)
					model.setDgModiFlg(dgModiFlg[i]);
				if (corrUsrId[i] != null)
					model.setCorrUsrId(corrUsrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (custCorrFlg[i] != null)
					model.setCustCorrFlg(custCorrFlg[i]);
				if (prpstVslCorrFlg[i] != null)
					model.setPrpstVslCorrFlg(prpstVslCorrFlg[i]);
				if (docPerfExptCd[i] != null)
					model.setDocPerfExptCd(docPerfExptCd[i]);
				if (rdnAcptFlg[i] != null)
					model.setRdnAcptFlg(rdnAcptFlg[i]);
				if (measQtyCorrFlg[i] != null)
					model.setMeasQtyCorrFlg(measQtyCorrFlg[i]);
				if (cmdtCorrFlg[i] != null)
					model.setCmdtCorrFlg(cmdtCorrFlg[i]);
				if (ibTroModiFlg[i] != null)
					model.setIbTroModiFlg(ibTroModiFlg[i]);
				if (cntrMfModiFlg[i] != null)
					model.setCntrMfModiFlg(cntrMfModiFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rfModiFlg[i] != null)
					model.setRfModiFlg(rfModiFlg[i]);
				if (hngrModiFlg[i] != null)
					model.setHngrModiFlg(hngrModiFlg[i]);
				if (obTroModiFlg[i] != null)
					model.setObTroModiFlg(obTroModiFlg[i]);
				if (rdnNo[i] != null)
					model.setRdnNo(rdnNo[i]);
				if (bndCorrFlg[i] != null)
					model.setBndCorrFlg(bndCorrFlg[i]);
				if (corrNtcOfcCd6[i] != null)
					model.setCorrNtcOfcCd6(corrNtcOfcCd6[i]);
				if (corrNtcOfcCd7[i] != null)
					model.setCorrNtcOfcCd7(corrNtcOfcCd7[i]);
				if (expnFlg[i] != null)
					model.setExpnFlg(expnFlg[i]);
				if (newBkgCreFlg[i] != null)
					model.setNewBkgCreFlg(newBkgCreFlg[i]);
				if (caOtrRsnCorrFlg[i] != null)
					model.setCaOtrRsnCorrFlg(caOtrRsnCorrFlg[i]);
				if (corrNtcOfcCd4[i] != null)
					model.setCorrNtcOfcCd4(corrNtcOfcCd4[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (corrNtcOfcCd5[i] != null)
					model.setCorrNtcOfcCd5(corrNtcOfcCd5[i]);
				if (bkgCreModiFlg[i] != null)
					model.setBkgCreModiFlg(bkgCreModiFlg[i]);
				if (corrNtcOfcCd8[i] != null)
					model.setCorrNtcOfcCd8(corrNtcOfcCd8[i]);
				if (socModiFlg[i] != null)
					model.setSocModiFlg(socModiFlg[i]);
				if (cnslModiFlg[i] != null)
					model.setCnslModiFlg(cnslModiFlg[i]);
				if (corrGdt[i] != null)
					model.setCorrGdt(corrGdt[i]);
				if (corrNtcOfcCd2[i] != null)
					model.setCorrNtcOfcCd2(corrNtcOfcCd2[i]);
				if (corrNtcOfcCd3[i] != null)
					model.setCorrNtcOfcCd3(corrNtcOfcCd3[i]);
				if (corrNtcOfcCd1[i] != null)
					model.setCorrNtcOfcCd1(corrNtcOfcCd1[i]);
				if (corrOfcCd[i] != null)
					model.setCorrOfcCd(corrOfcCd[i]);
				if (bkgCorrRmk[i] != null)
					model.setBkgCorrRmk(bkgCorrRmk[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (caRsnCd[i] != null)
					model.setCaRsnCd(caRsnCd[i]);
				if (rcreModiFlg[i] != null)
					model.setRcreModiFlg(rcreModiFlg[i]);
				if (bkgSplitModiFlg[i] != null)
					model.setBkgSplitModiFlg(bkgSplitModiFlg[i]);
				if (docPerfExptDt[i] != null)
					model.setDocPerfExptDt(docPerfExptDt[i]);
				if (brogGenCorrFlg[i] != null)
					model.setBrogGenCorrFlg(brogGenCorrFlg[i]);
				if (corrNo[i] != null)
					model.setCorrNo(corrNo[i]);
				if (ratFlg[i] != null)
					model.setRatFlg(ratFlg[i]);
				if (qtyCorrFlg[i] != null)
					model.setQtyCorrFlg(qtyCorrFlg[i]);
				if (rvisSeq[i] != null)
					model.setRvisSeq(rvisSeq[i]);
				if (codModiFlg[i] != null)
					model.setCodModiFlg(codModiFlg[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (rcvdeTermCorrFlg[i] != null)
					model.setRcvdeTermCorrFlg(rcvdeTermCorrFlg[i]);
				if (corrReadOfcFlg8[i] != null)
					model.setCorrReadOfcFlg8(corrReadOfcFlg8[i]);
				if (routCorrFlg[i] != null)
					model.setRoutCorrFlg(routCorrFlg[i]);
				if (corrReadOfcFlg7[i] != null)
					model.setCorrReadOfcFlg7(corrReadOfcFlg7[i]);
				if (rdModiFlg[i] != null)
					model.setRdModiFlg(rdModiFlg[i]);
				if (sccModiCd[i] != null)
					model.setSccModiCd(sccModiCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCorrectionVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCorrectionVO[]
	 */
	public BkgCorrectionVO[] getBkgCorrectionVOs(){
		BkgCorrectionVO[] vos = (BkgCorrectionVO[])models.toArray(new BkgCorrectionVO[models.size()]);
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
		this.corrDt = this.corrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtCorrFlg = this.rtCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg1 = this.corrReadOfcFlg1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg2 = this.corrReadOfcFlg2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg3 = this.corrReadOfcFlg3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bisSysIfFlg = this.bisSysIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg4 = this.corrReadOfcFlg4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg5 = this.corrReadOfcFlg5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg6 = this.corrReadOfcFlg6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cxlModiFlg = this.cxlModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbModiFlg = this.bbModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCmbModiFlg = this.bkgCmbModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCntrModiFlg = this.bkgCntrModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blObrdCorrFlg = this.blObrdCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqSubModiFlg = this.eqSubModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibInterRmk = this.ibInterRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blMkDescModiFlg = this.blMkDescModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrCxlFlg = this.corrCxlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgTermCorrFlg = this.chgTermCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custModiFlg = this.custModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtModiFlg = this.rtModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCorrFlg = this.trnkVslCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkModiFlg = this.awkModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caRlyPortModiFlg = this.caRlyPortModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgModiFlg = this.dgModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrUsrId = this.corrUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCorrFlg = this.custCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prpstVslCorrFlg = this.prpstVslCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docPerfExptCd = this.docPerfExptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdnAcptFlg = this.rdnAcptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQtyCorrFlg = this.measQtyCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCorrFlg = this.cmdtCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibTroModiFlg = this.ibTroModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfModiFlg = this.cntrMfModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rfModiFlg = this.rfModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrModiFlg = this.hngrModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obTroModiFlg = this.obTroModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdnNo = this.rdnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bndCorrFlg = this.bndCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd6 = this.corrNtcOfcCd6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd7 = this.corrNtcOfcCd7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expnFlg = this.expnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newBkgCreFlg = this.newBkgCreFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caOtrRsnCorrFlg = this.caOtrRsnCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd4 = this.corrNtcOfcCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd5 = this.corrNtcOfcCd5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCreModiFlg = this.bkgCreModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd8 = this.corrNtcOfcCd8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socModiFlg = this.socModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnslModiFlg = this.cnslModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrGdt = this.corrGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd2 = this.corrNtcOfcCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd3 = this.corrNtcOfcCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNtcOfcCd1 = this.corrNtcOfcCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrOfcCd = this.corrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCorrRmk = this.bkgCorrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.caRsnCd = this.caRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcreModiFlg = this.rcreModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgSplitModiFlg = this.bkgSplitModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docPerfExptDt = this.docPerfExptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brogGenCorrFlg = this.brogGenCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrNo = this.corrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ratFlg = this.ratFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.qtyCorrFlg = this.qtyCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rvisSeq = this.rvisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codModiFlg = this.codModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvdeTermCorrFlg = this.rcvdeTermCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg8 = this.corrReadOfcFlg8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routCorrFlg = this.routCorrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.corrReadOfcFlg7 = this.corrReadOfcFlg7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdModiFlg = this.rdModiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sccModiCd = this.sccModiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
