/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgKrWhfRtVO.java
*@FileTitle : BkgKrWhfRtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.06
*@LastModifier : 정재엽
*@LastVersion : 1.0
* 2009.10.06 정재엽 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 정재엽
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgKrWhfRtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgKrWhfRtVO> models = new ArrayList<BkgKrWhfRtVO>();
	
	/* Column Info */
	private String blkMeasQty = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String whfBndCd = null;
	/* Column Info */
	private String blk45ftQty = null;
	/* Column Info */
	private String rtonWgt = null;
	/* Column Info */
	private String cntrFeuQty = null;
	/* Column Info */
	private String whfDeclNo = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String taxFeuQty = null;
	/* Column Info */
	private String whfDeclIfFlg = null;
	/* Page Number, Cancel Flag로 사용함 */
	private String pagerows = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String arIfDt = null;
	/* Column Info */
	private String cntrTpszTeuQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String blCustNm = null;
	/* Column Info */
	private String exptTeuQty = null;
	/* Column Info */
	private String cntrWgt = null;
	/* Column Info */
	private String blkFeuQty = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String krCstmsFrtTpCd = null;
	/* Column Info */
	private String whfNtcNo = null;
	/* Column Info */
	private String portOfcCd = null;
	/* Column Info */
	private String teuQty = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String diffAmt = null;
	/* Column Info */
	private String blkTeuQty = null;
	/* Column Info */
	private String cntrTpsz45ftQty = null;
	/* Column Info */
	private String chgRtSeq = null;
	/* Column Info */
	private String cntrRatUtCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String declRmk = null;
	/* Column Info */
	private String ibCstmsCustCd = null;
	/* Column Info */
	private String exptFeuQty = null;
	/* Column Info */
	private String whfDeclDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String taxCustNm = null;
	/* Column Info */
	private String taxTeuQty = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String tax45ftQty = null;
	/* Column Info */
	private String krWhfExptCd = null;
	/* Column Info */
	private String expt45ftQty = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String newChgAmt = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String cntrTeuQty = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dcFlg = null;
	/* Column Info */
	private String bbCgoWgt = null;
	/* Column Info */
	private String cntr45ftQty = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String arIfFlg = null;
	/* Column Info */
	private String cntrTpszFeuQty = null;
	/* Column Info */
	private String oldChgAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgKrWhfRtVO() {}

	public BkgKrWhfRtVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String whfBndCd, String blNo, String chgRtSeq, String rtonWgt, String cntrWgt, String measQty, String teuQty, String cntrRatUtCd, String cntrQty, String oldChgAmt, String newChgAmt, String diffAmt, String whfDeclNo, String whfNtcNo, String whfDeclDt, String krWhfExptCd, String whfDeclIfFlg, String arIfFlg, String arIfDt, String declRmk, String wgtUtCd, String measUtCd, String portOfcCd, String cmdtCd, String ibCstmsCustCd, String blCustNm, String taxCustNm, String cntrTeuQty, String cntrFeuQty, String cntr45ftQty, String cntrTpszTeuQty, String cntrTpszFeuQty, String cntrTpsz45ftQty, String exptTeuQty, String exptFeuQty, String expt45ftQty, String taxTeuQty, String taxFeuQty, String tax45ftQty, String dcFlg, String krCstmsFrtTpCd, String blkTeuQty, String blkFeuQty, String blk45ftQty, String portCd, String bbCgoWgt, String blkMeasQty, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.blkMeasQty = blkMeasQty;
		this.vslCd = vslCd;
		this.whfBndCd = whfBndCd;
		this.blk45ftQty = blk45ftQty;
		this.rtonWgt = rtonWgt;
		this.cntrFeuQty = cntrFeuQty;
		this.whfDeclNo = whfDeclNo;
		this.blNo = blNo;
		this.taxFeuQty = taxFeuQty;
		this.whfDeclIfFlg = whfDeclIfFlg;
		this.pagerows = pagerows;
		this.wgtUtCd = wgtUtCd;
		this.arIfDt = arIfDt;
		this.cntrTpszTeuQty = cntrTpszTeuQty;
		this.updUsrId = updUsrId;
		this.blCustNm = blCustNm;
		this.exptTeuQty = exptTeuQty;
		this.cntrWgt = cntrWgt;
		this.blkFeuQty = blkFeuQty;
		this.skdVoyNo = skdVoyNo;
		this.krCstmsFrtTpCd = krCstmsFrtTpCd;
		this.whfNtcNo = whfNtcNo;
		this.portOfcCd = portOfcCd;
		this.teuQty = teuQty;
		this.creUsrId = creUsrId;
		this.diffAmt = diffAmt;
		this.blkTeuQty = blkTeuQty;
		this.cntrTpsz45ftQty = cntrTpsz45ftQty;
		this.chgRtSeq = chgRtSeq;
		this.cntrRatUtCd = cntrRatUtCd;
		this.creDt = creDt;
		this.declRmk = declRmk;
		this.ibCstmsCustCd = ibCstmsCustCd;
		this.exptFeuQty = exptFeuQty;
		this.whfDeclDt = whfDeclDt;
		this.ibflag = ibflag;
		this.taxCustNm = taxCustNm;
		this.taxTeuQty = taxTeuQty;
		this.cmdtCd = cmdtCd;
		this.measQty = measQty;
		this.tax45ftQty = tax45ftQty;
		this.krWhfExptCd = krWhfExptCd;
		this.expt45ftQty = expt45ftQty;
		this.cntrQty = cntrQty;
		this.portCd = portCd;
		this.newChgAmt = newChgAmt;
		this.measUtCd = measUtCd;
		this.cntrTeuQty = cntrTeuQty;
		this.updDt = updDt;
		this.dcFlg = dcFlg;
		this.bbCgoWgt = bbCgoWgt;
		this.cntr45ftQty = cntr45ftQty;
		this.skdDirCd = skdDirCd;
		this.arIfFlg = arIfFlg;
		this.cntrTpszFeuQty = cntrTpszFeuQty;
		this.oldChgAmt = oldChgAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("blk_meas_qty", getBlkMeasQty());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("whf_bnd_cd", getWhfBndCd());
		this.hashColumns.put("blk_45ft_qty", getBlk45ftQty());
		this.hashColumns.put("rton_wgt", getRtonWgt());
		this.hashColumns.put("cntr_feu_qty", getCntrFeuQty());
		this.hashColumns.put("whf_decl_no", getWhfDeclNo());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("tax_feu_qty", getTaxFeuQty());
		this.hashColumns.put("whf_decl_if_flg", getWhfDeclIfFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("ar_if_dt", getArIfDt());
		this.hashColumns.put("cntr_tpsz_teu_qty", getCntrTpszTeuQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bl_cust_nm", getBlCustNm());
		this.hashColumns.put("expt_teu_qty", getExptTeuQty());
		this.hashColumns.put("cntr_wgt", getCntrWgt());
		this.hashColumns.put("blk_feu_qty", getBlkFeuQty());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("kr_cstms_frt_tp_cd", getKrCstmsFrtTpCd());
		this.hashColumns.put("whf_ntc_no", getWhfNtcNo());
		this.hashColumns.put("port_ofc_cd", getPortOfcCd());
		this.hashColumns.put("teu_qty", getTeuQty());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("diff_amt", getDiffAmt());
		this.hashColumns.put("blk_teu_qty", getBlkTeuQty());
		this.hashColumns.put("cntr_tpsz_45ft_qty", getCntrTpsz45ftQty());
		this.hashColumns.put("chg_rt_seq", getChgRtSeq());
		this.hashColumns.put("cntr_rat_ut_cd", getCntrRatUtCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("decl_rmk", getDeclRmk());
		this.hashColumns.put("ib_cstms_cust_cd", getIbCstmsCustCd());
		this.hashColumns.put("expt_feu_qty", getExptFeuQty());
		this.hashColumns.put("whf_decl_dt", getWhfDeclDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("tax_cust_nm", getTaxCustNm());
		this.hashColumns.put("tax_teu_qty", getTaxTeuQty());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("tax_45ft_qty", getTax45ftQty());
		this.hashColumns.put("kr_whf_expt_cd", getKrWhfExptCd());
		this.hashColumns.put("expt_45ft_qty", getExpt45ftQty());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("new_chg_amt", getNewChgAmt());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("cntr_teu_qty", getCntrTeuQty());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dc_flg", getDcFlg());
		this.hashColumns.put("bb_cgo_wgt", getBbCgoWgt());
		this.hashColumns.put("cntr_45ft_qty", getCntr45ftQty());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("ar_if_flg", getArIfFlg());
		this.hashColumns.put("cntr_tpsz_feu_qty", getCntrTpszFeuQty());
		this.hashColumns.put("old_chg_amt", getOldChgAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("blk_meas_qty", "blkMeasQty");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("whf_bnd_cd", "whfBndCd");
		this.hashFields.put("blk_45ft_qty", "blk45ftQty");
		this.hashFields.put("rton_wgt", "rtonWgt");
		this.hashFields.put("cntr_feu_qty", "cntrFeuQty");
		this.hashFields.put("whf_decl_no", "whfDeclNo");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("tax_feu_qty", "taxFeuQty");
		this.hashFields.put("whf_decl_if_flg", "whfDeclIfFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("ar_if_dt", "arIfDt");
		this.hashFields.put("cntr_tpsz_teu_qty", "cntrTpszTeuQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bl_cust_nm", "blCustNm");
		this.hashFields.put("expt_teu_qty", "exptTeuQty");
		this.hashFields.put("cntr_wgt", "cntrWgt");
		this.hashFields.put("blk_feu_qty", "blkFeuQty");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("kr_cstms_frt_tp_cd", "krCstmsFrtTpCd");
		this.hashFields.put("whf_ntc_no", "whfNtcNo");
		this.hashFields.put("port_ofc_cd", "portOfcCd");
		this.hashFields.put("teu_qty", "teuQty");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("diff_amt", "diffAmt");
		this.hashFields.put("blk_teu_qty", "blkTeuQty");
		this.hashFields.put("cntr_tpsz_45ft_qty", "cntrTpsz45ftQty");
		this.hashFields.put("chg_rt_seq", "chgRtSeq");
		this.hashFields.put("cntr_rat_ut_cd", "cntrRatUtCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("decl_rmk", "declRmk");
		this.hashFields.put("ib_cstms_cust_cd", "ibCstmsCustCd");
		this.hashFields.put("expt_feu_qty", "exptFeuQty");
		this.hashFields.put("whf_decl_dt", "whfDeclDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("tax_cust_nm", "taxCustNm");
		this.hashFields.put("tax_teu_qty", "taxTeuQty");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("tax_45ft_qty", "tax45ftQty");
		this.hashFields.put("kr_whf_expt_cd", "krWhfExptCd");
		this.hashFields.put("expt_45ft_qty", "expt45ftQty");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("new_chg_amt", "newChgAmt");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("cntr_teu_qty", "cntrTeuQty");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dc_flg", "dcFlg");
		this.hashFields.put("bb_cgo_wgt", "bbCgoWgt");
		this.hashFields.put("cntr_45ft_qty", "cntr45ftQty");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("ar_if_flg", "arIfFlg");
		this.hashFields.put("cntr_tpsz_feu_qty", "cntrTpszFeuQty");
		this.hashFields.put("old_chg_amt", "oldChgAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return blkMeasQty
	 */
	public String getBlkMeasQty() {
		return this.blkMeasQty;
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
	 * @return whfBndCd
	 */
	public String getWhfBndCd() {
		return this.whfBndCd;
	}
	
	/**
	 * Column Info
	 * @return blk45ftQty
	 */
	public String getBlk45ftQty() {
		return this.blk45ftQty;
	}
	
	/**
	 * Column Info
	 * @return rtonWgt
	 */
	public String getRtonWgt() {
		return this.rtonWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrFeuQty
	 */
	public String getCntrFeuQty() {
		return this.cntrFeuQty;
	}
	
	/**
	 * Column Info
	 * @return whfDeclNo
	 */
	public String getWhfDeclNo() {
		return this.whfDeclNo;
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
	 * @return taxFeuQty
	 */
	public String getTaxFeuQty() {
		return this.taxFeuQty;
	}
	
	/**
	 * Column Info
	 * @return whfDeclIfFlg
	 */
	public String getWhfDeclIfFlg() {
		return this.whfDeclIfFlg;
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
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return arIfDt
	 */
	public String getArIfDt() {
		return this.arIfDt;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszTeuQty
	 */
	public String getCntrTpszTeuQty() {
		return this.cntrTpszTeuQty;
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
	 * @return blCustNm
	 */
	public String getBlCustNm() {
		return this.blCustNm;
	}
	
	/**
	 * Column Info
	 * @return exptTeuQty
	 */
	public String getExptTeuQty() {
		return this.exptTeuQty;
	}
	
	/**
	 * Column Info
	 * @return cntrWgt
	 */
	public String getCntrWgt() {
		return this.cntrWgt;
	}
	
	/**
	 * Column Info
	 * @return blkFeuQty
	 */
	public String getBlkFeuQty() {
		return this.blkFeuQty;
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
	 * @return krCstmsFrtTpCd
	 */
	public String getKrCstmsFrtTpCd() {
		return this.krCstmsFrtTpCd;
	}
	
	/**
	 * Column Info
	 * @return whfNtcNo
	 */
	public String getWhfNtcNo() {
		return this.whfNtcNo;
	}
	
	/**
	 * Column Info
	 * @return portOfcCd
	 */
	public String getPortOfcCd() {
		return this.portOfcCd;
	}
	
	/**
	 * Column Info
	 * @return teuQty
	 */
	public String getTeuQty() {
		return this.teuQty;
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
	 * @return diffAmt
	 */
	public String getDiffAmt() {
		return this.diffAmt;
	}
	
	/**
	 * Column Info
	 * @return blkTeuQty
	 */
	public String getBlkTeuQty() {
		return this.blkTeuQty;
	}
	
	/**
	 * Column Info
	 * @return cntrTpsz45ftQty
	 */
	public String getCntrTpsz45ftQty() {
		return this.cntrTpsz45ftQty;
	}
	
	/**
	 * Column Info
	 * @return chgRtSeq
	 */
	public String getChgRtSeq() {
		return this.chgRtSeq;
	}
	
	/**
	 * Column Info
	 * @return cntrRatUtCd
	 */
	public String getCntrRatUtCd() {
		return this.cntrRatUtCd;
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
	 * @return declRmk
	 */
	public String getDeclRmk() {
		return this.declRmk;
	}
	
	/**
	 * Column Info
	 * @return ibCstmsCustCd
	 */
	public String getIbCstmsCustCd() {
		return this.ibCstmsCustCd;
	}
	
	/**
	 * Column Info
	 * @return exptFeuQty
	 */
	public String getExptFeuQty() {
		return this.exptFeuQty;
	}
	
	/**
	 * Column Info
	 * @return whfDeclDt
	 */
	public String getWhfDeclDt() {
		return this.whfDeclDt;
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
	 * @return taxCustNm
	 */
	public String getTaxCustNm() {
		return this.taxCustNm;
	}
	
	/**
	 * Column Info
	 * @return taxTeuQty
	 */
	public String getTaxTeuQty() {
		return this.taxTeuQty;
	}
	
	/**
	 * Column Info
	 * @return cmdtCd
	 */
	public String getCmdtCd() {
		return this.cmdtCd;
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
	 * @return tax45ftQty
	 */
	public String getTax45ftQty() {
		return this.tax45ftQty;
	}
	
	/**
	 * Column Info
	 * @return krWhfExptCd
	 */
	public String getKrWhfExptCd() {
		return this.krWhfExptCd;
	}
	
	/**
	 * Column Info
	 * @return expt45ftQty
	 */
	public String getExpt45ftQty() {
		return this.expt45ftQty;
	}
	
	/**
	 * Column Info
	 * @return cntrQty
	 */
	public String getCntrQty() {
		return this.cntrQty;
	}
	
	/**
	 * Column Info
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
	}
	
	/**
	 * Column Info
	 * @return newChgAmt
	 */
	public String getNewChgAmt() {
		return this.newChgAmt;
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
	 * @return cntrTeuQty
	 */
	public String getCntrTeuQty() {
		return this.cntrTeuQty;
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
	 * @return dcFlg
	 */
	public String getDcFlg() {
		return this.dcFlg;
	}
	
	/**
	 * Column Info
	 * @return bbCgoWgt
	 */
	public String getBbCgoWgt() {
		return this.bbCgoWgt;
	}
	
	/**
	 * Column Info
	 * @return cntr45ftQty
	 */
	public String getCntr45ftQty() {
		return this.cntr45ftQty;
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
	 * @return arIfFlg
	 */
	public String getArIfFlg() {
		return this.arIfFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszFeuQty
	 */
	public String getCntrTpszFeuQty() {
		return this.cntrTpszFeuQty;
	}
	
	/**
	 * Column Info
	 * @return oldChgAmt
	 */
	public String getOldChgAmt() {
		return this.oldChgAmt;
	}
	

	/**
	 * Column Info
	 * @param blkMeasQty
	 */
	public void setBlkMeasQty(String blkMeasQty) {
		this.blkMeasQty = blkMeasQty;
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
	 * @param whfBndCd
	 */
	public void setWhfBndCd(String whfBndCd) {
		this.whfBndCd = whfBndCd;
	}
	
	/**
	 * Column Info
	 * @param blk45ftQty
	 */
	public void setBlk45ftQty(String blk45ftQty) {
		this.blk45ftQty = blk45ftQty;
	}
	
	/**
	 * Column Info
	 * @param rtonWgt
	 */
	public void setRtonWgt(String rtonWgt) {
		this.rtonWgt = rtonWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrFeuQty
	 */
	public void setCntrFeuQty(String cntrFeuQty) {
		this.cntrFeuQty = cntrFeuQty;
	}
	
	/**
	 * Column Info
	 * @param whfDeclNo
	 */
	public void setWhfDeclNo(String whfDeclNo) {
		this.whfDeclNo = whfDeclNo;
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
	 * @param taxFeuQty
	 */
	public void setTaxFeuQty(String taxFeuQty) {
		this.taxFeuQty = taxFeuQty;
	}
	
	/**
	 * Column Info
	 * @param whfDeclIfFlg
	 */
	public void setWhfDeclIfFlg(String whfDeclIfFlg) {
		this.whfDeclIfFlg = whfDeclIfFlg;
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
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param arIfDt
	 */
	public void setArIfDt(String arIfDt) {
		this.arIfDt = arIfDt;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszTeuQty
	 */
	public void setCntrTpszTeuQty(String cntrTpszTeuQty) {
		this.cntrTpszTeuQty = cntrTpszTeuQty;
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
	 * @param blCustNm
	 */
	public void setBlCustNm(String blCustNm) {
		this.blCustNm = blCustNm;
	}
	
	/**
	 * Column Info
	 * @param exptTeuQty
	 */
	public void setExptTeuQty(String exptTeuQty) {
		this.exptTeuQty = exptTeuQty;
	}
	
	/**
	 * Column Info
	 * @param cntrWgt
	 */
	public void setCntrWgt(String cntrWgt) {
		this.cntrWgt = cntrWgt;
	}
	
	/**
	 * Column Info
	 * @param blkFeuQty
	 */
	public void setBlkFeuQty(String blkFeuQty) {
		this.blkFeuQty = blkFeuQty;
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
	 * @param krCstmsFrtTpCd
	 */
	public void setKrCstmsFrtTpCd(String krCstmsFrtTpCd) {
		this.krCstmsFrtTpCd = krCstmsFrtTpCd;
	}
	
	/**
	 * Column Info
	 * @param whfNtcNo
	 */
	public void setWhfNtcNo(String whfNtcNo) {
		this.whfNtcNo = whfNtcNo;
	}
	
	/**
	 * Column Info
	 * @param portOfcCd
	 */
	public void setPortOfcCd(String portOfcCd) {
		this.portOfcCd = portOfcCd;
	}
	
	/**
	 * Column Info
	 * @param teuQty
	 */
	public void setTeuQty(String teuQty) {
		this.teuQty = teuQty;
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
	 * @param diffAmt
	 */
	public void setDiffAmt(String diffAmt) {
		this.diffAmt = diffAmt;
	}
	
	/**
	 * Column Info
	 * @param blkTeuQty
	 */
	public void setBlkTeuQty(String blkTeuQty) {
		this.blkTeuQty = blkTeuQty;
	}
	
	/**
	 * Column Info
	 * @param cntrTpsz45ftQty
	 */
	public void setCntrTpsz45ftQty(String cntrTpsz45ftQty) {
		this.cntrTpsz45ftQty = cntrTpsz45ftQty;
	}
	
	/**
	 * Column Info
	 * @param chgRtSeq
	 */
	public void setChgRtSeq(String chgRtSeq) {
		this.chgRtSeq = chgRtSeq;
	}
	
	/**
	 * Column Info
	 * @param cntrRatUtCd
	 */
	public void setCntrRatUtCd(String cntrRatUtCd) {
		this.cntrRatUtCd = cntrRatUtCd;
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
	 * @param declRmk
	 */
	public void setDeclRmk(String declRmk) {
		this.declRmk = declRmk;
	}
	
	/**
	 * Column Info
	 * @param ibCstmsCustCd
	 */
	public void setIbCstmsCustCd(String ibCstmsCustCd) {
		this.ibCstmsCustCd = ibCstmsCustCd;
	}
	
	/**
	 * Column Info
	 * @param exptFeuQty
	 */
	public void setExptFeuQty(String exptFeuQty) {
		this.exptFeuQty = exptFeuQty;
	}
	
	/**
	 * Column Info
	 * @param whfDeclDt
	 */
	public void setWhfDeclDt(String whfDeclDt) {
		this.whfDeclDt = whfDeclDt;
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
	 * @param taxCustNm
	 */
	public void setTaxCustNm(String taxCustNm) {
		this.taxCustNm = taxCustNm;
	}
	
	/**
	 * Column Info
	 * @param taxTeuQty
	 */
	public void setTaxTeuQty(String taxTeuQty) {
		this.taxTeuQty = taxTeuQty;
	}
	
	/**
	 * Column Info
	 * @param cmdtCd
	 */
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
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
	 * @param tax45ftQty
	 */
	public void setTax45ftQty(String tax45ftQty) {
		this.tax45ftQty = tax45ftQty;
	}
	
	/**
	 * Column Info
	 * @param krWhfExptCd
	 */
	public void setKrWhfExptCd(String krWhfExptCd) {
		this.krWhfExptCd = krWhfExptCd;
	}
	
	/**
	 * Column Info
	 * @param expt45ftQty
	 */
	public void setExpt45ftQty(String expt45ftQty) {
		this.expt45ftQty = expt45ftQty;
	}
	
	/**
	 * Column Info
	 * @param cntrQty
	 */
	public void setCntrQty(String cntrQty) {
		this.cntrQty = cntrQty;
	}
	
	/**
	 * Column Info
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
	}
	
	/**
	 * Column Info
	 * @param newChgAmt
	 */
	public void setNewChgAmt(String newChgAmt) {
		this.newChgAmt = newChgAmt;
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
	 * @param cntrTeuQty
	 */
	public void setCntrTeuQty(String cntrTeuQty) {
		this.cntrTeuQty = cntrTeuQty;
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
	 * @param dcFlg
	 */
	public void setDcFlg(String dcFlg) {
		this.dcFlg = dcFlg;
	}
	
	/**
	 * Column Info
	 * @param bbCgoWgt
	 */
	public void setBbCgoWgt(String bbCgoWgt) {
		this.bbCgoWgt = bbCgoWgt;
	}
	
	/**
	 * Column Info
	 * @param cntr45ftQty
	 */
	public void setCntr45ftQty(String cntr45ftQty) {
		this.cntr45ftQty = cntr45ftQty;
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
	 * @param arIfFlg
	 */
	public void setArIfFlg(String arIfFlg) {
		this.arIfFlg = arIfFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszFeuQty
	 */
	public void setCntrTpszFeuQty(String cntrTpszFeuQty) {
		this.cntrTpszFeuQty = cntrTpszFeuQty;
	}
	
	/**
	 * Column Info
	 * @param oldChgAmt
	 */
	public void setOldChgAmt(String oldChgAmt) {
		this.oldChgAmt = oldChgAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setBlkMeasQty(JSPUtil.getParameter(request, "blk_meas_qty", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setWhfBndCd(JSPUtil.getParameter(request, "whf_bnd_cd", ""));
		setBlk45ftQty(JSPUtil.getParameter(request, "blk_45ft_qty", ""));
		setRtonWgt(JSPUtil.getParameter(request, "rton_wgt", ""));
		setCntrFeuQty(JSPUtil.getParameter(request, "cntr_feu_qty", ""));
		setWhfDeclNo(JSPUtil.getParameter(request, "whf_decl_no", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setTaxFeuQty(JSPUtil.getParameter(request, "tax_feu_qty", ""));
		setWhfDeclIfFlg(JSPUtil.getParameter(request, "whf_decl_if_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setArIfDt(JSPUtil.getParameter(request, "ar_if_dt", ""));
		setCntrTpszTeuQty(JSPUtil.getParameter(request, "cntr_tpsz_teu_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBlCustNm(JSPUtil.getParameter(request, "bl_cust_nm", ""));
		setExptTeuQty(JSPUtil.getParameter(request, "expt_teu_qty", ""));
		setCntrWgt(JSPUtil.getParameter(request, "cntr_wgt", ""));
		setBlkFeuQty(JSPUtil.getParameter(request, "blk_feu_qty", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setKrCstmsFrtTpCd(JSPUtil.getParameter(request, "kr_cstms_frt_tp_cd", ""));
		setWhfNtcNo(JSPUtil.getParameter(request, "whf_ntc_no", ""));
		setPortOfcCd(JSPUtil.getParameter(request, "port_ofc_cd", ""));
		setTeuQty(JSPUtil.getParameter(request, "teu_qty", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDiffAmt(JSPUtil.getParameter(request, "diff_amt", ""));
		setBlkTeuQty(JSPUtil.getParameter(request, "blk_teu_qty", ""));
		setCntrTpsz45ftQty(JSPUtil.getParameter(request, "cntr_tpsz_45ft_qty", ""));
		setChgRtSeq(JSPUtil.getParameter(request, "chg_rt_seq", ""));
		setCntrRatUtCd(JSPUtil.getParameter(request, "cntr_rat_ut_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeclRmk(JSPUtil.getParameter(request, "decl_rmk", ""));
		setIbCstmsCustCd(JSPUtil.getParameter(request, "ib_cstms_cust_cd", ""));
		setExptFeuQty(JSPUtil.getParameter(request, "expt_feu_qty", ""));
		setWhfDeclDt(JSPUtil.getParameter(request, "whf_decl_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTaxCustNm(JSPUtil.getParameter(request, "tax_cust_nm", ""));
		setTaxTeuQty(JSPUtil.getParameter(request, "tax_teu_qty", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setTax45ftQty(JSPUtil.getParameter(request, "tax_45ft_qty", ""));
		setKrWhfExptCd(JSPUtil.getParameter(request, "kr_whf_expt_cd", ""));
		setExpt45ftQty(JSPUtil.getParameter(request, "expt_45ft_qty", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setNewChgAmt(JSPUtil.getParameter(request, "new_chg_amt", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setCntrTeuQty(JSPUtil.getParameter(request, "cntr_teu_qty", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDcFlg(JSPUtil.getParameter(request, "dc_flg", ""));
		setBbCgoWgt(JSPUtil.getParameter(request, "bb_cgo_wgt", ""));
		setCntr45ftQty(JSPUtil.getParameter(request, "cntr_45ft_qty", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setArIfFlg(JSPUtil.getParameter(request, "ar_if_flg", ""));
		setCntrTpszFeuQty(JSPUtil.getParameter(request, "cntr_tpsz_feu_qty", ""));
		setOldChgAmt(JSPUtil.getParameter(request, "old_chg_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgKrWhfRtVO[]
	 */
	public BkgKrWhfRtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgKrWhfRtVO[]
	 */
	public BkgKrWhfRtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgKrWhfRtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] blkMeasQty = (JSPUtil.getParameter(request, prefix	+ "blk_meas_qty", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] whfBndCd = (JSPUtil.getParameter(request, prefix	+ "whf_bnd_cd", length));
			String[] blk45ftQty = (JSPUtil.getParameter(request, prefix	+ "blk_45ft_qty", length));
			String[] rtonWgt = (JSPUtil.getParameter(request, prefix	+ "rton_wgt", length));
			String[] cntrFeuQty = (JSPUtil.getParameter(request, prefix	+ "cntr_feu_qty", length));
			String[] whfDeclNo = (JSPUtil.getParameter(request, prefix	+ "whf_decl_no", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] taxFeuQty = (JSPUtil.getParameter(request, prefix	+ "tax_feu_qty", length));
			String[] whfDeclIfFlg = (JSPUtil.getParameter(request, prefix	+ "whf_decl_if_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] arIfDt = (JSPUtil.getParameter(request, prefix	+ "ar_if_dt", length));
			String[] cntrTpszTeuQty = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_teu_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] blCustNm = (JSPUtil.getParameter(request, prefix	+ "bl_cust_nm", length));
			String[] exptTeuQty = (JSPUtil.getParameter(request, prefix	+ "expt_teu_qty", length));
			String[] cntrWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_wgt", length));
			String[] blkFeuQty = (JSPUtil.getParameter(request, prefix	+ "blk_feu_qty", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] krCstmsFrtTpCd = (JSPUtil.getParameter(request, prefix	+ "kr_cstms_frt_tp_cd", length));
			String[] whfNtcNo = (JSPUtil.getParameter(request, prefix	+ "whf_ntc_no", length));
			String[] portOfcCd = (JSPUtil.getParameter(request, prefix	+ "port_ofc_cd", length));
			String[] teuQty = (JSPUtil.getParameter(request, prefix	+ "teu_qty", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] diffAmt = (JSPUtil.getParameter(request, prefix	+ "diff_amt", length));
			String[] blkTeuQty = (JSPUtil.getParameter(request, prefix	+ "blk_teu_qty", length));
			String[] cntrTpsz45ftQty = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_45ft_qty", length));
			String[] chgRtSeq = (JSPUtil.getParameter(request, prefix	+ "chg_rt_seq", length));
			String[] cntrRatUtCd = (JSPUtil.getParameter(request, prefix	+ "cntr_rat_ut_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] declRmk = (JSPUtil.getParameter(request, prefix	+ "decl_rmk", length));
			String[] ibCstmsCustCd = (JSPUtil.getParameter(request, prefix	+ "ib_cstms_cust_cd", length));
			String[] exptFeuQty = (JSPUtil.getParameter(request, prefix	+ "expt_feu_qty", length));
			String[] whfDeclDt = (JSPUtil.getParameter(request, prefix	+ "whf_decl_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] taxCustNm = (JSPUtil.getParameter(request, prefix	+ "tax_cust_nm", length));
			String[] taxTeuQty = (JSPUtil.getParameter(request, prefix	+ "tax_teu_qty", length));
			String[] cmdtCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] tax45ftQty = (JSPUtil.getParameter(request, prefix	+ "tax_45ft_qty", length));
			String[] krWhfExptCd = (JSPUtil.getParameter(request, prefix	+ "kr_whf_expt_cd", length));
			String[] expt45ftQty = (JSPUtil.getParameter(request, prefix	+ "expt_45ft_qty", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] newChgAmt = (JSPUtil.getParameter(request, prefix	+ "new_chg_amt", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] cntrTeuQty = (JSPUtil.getParameter(request, prefix	+ "cntr_teu_qty", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dcFlg = (JSPUtil.getParameter(request, prefix	+ "dc_flg", length));
			String[] bbCgoWgt = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_wgt", length));
			String[] cntr45ftQty = (JSPUtil.getParameter(request, prefix	+ "cntr_45ft_qty", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] arIfFlg = (JSPUtil.getParameter(request, prefix	+ "ar_if_flg", length));
			String[] cntrTpszFeuQty = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_feu_qty", length));
			String[] oldChgAmt = (JSPUtil.getParameter(request, prefix	+ "old_chg_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgKrWhfRtVO();
				if (blkMeasQty[i] != null)
					model.setBlkMeasQty(blkMeasQty[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (whfBndCd[i] != null)
					model.setWhfBndCd(whfBndCd[i]);
				if (blk45ftQty[i] != null)
					model.setBlk45ftQty(blk45ftQty[i]);
				if (rtonWgt[i] != null)
					model.setRtonWgt(rtonWgt[i]);
				if (cntrFeuQty[i] != null)
					model.setCntrFeuQty(cntrFeuQty[i]);
				if (whfDeclNo[i] != null)
					model.setWhfDeclNo(whfDeclNo[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (taxFeuQty[i] != null)
					model.setTaxFeuQty(taxFeuQty[i]);
				if (whfDeclIfFlg[i] != null)
					model.setWhfDeclIfFlg(whfDeclIfFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (arIfDt[i] != null)
					model.setArIfDt(arIfDt[i]);
				if (cntrTpszTeuQty[i] != null)
					model.setCntrTpszTeuQty(cntrTpszTeuQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (blCustNm[i] != null)
					model.setBlCustNm(blCustNm[i]);
				if (exptTeuQty[i] != null)
					model.setExptTeuQty(exptTeuQty[i]);
				if (cntrWgt[i] != null)
					model.setCntrWgt(cntrWgt[i]);
				if (blkFeuQty[i] != null)
					model.setBlkFeuQty(blkFeuQty[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (krCstmsFrtTpCd[i] != null)
					model.setKrCstmsFrtTpCd(krCstmsFrtTpCd[i]);
				if (whfNtcNo[i] != null)
					model.setWhfNtcNo(whfNtcNo[i]);
				if (portOfcCd[i] != null)
					model.setPortOfcCd(portOfcCd[i]);
				if (teuQty[i] != null)
					model.setTeuQty(teuQty[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (diffAmt[i] != null)
					model.setDiffAmt(diffAmt[i]);
				if (blkTeuQty[i] != null)
					model.setBlkTeuQty(blkTeuQty[i]);
				if (cntrTpsz45ftQty[i] != null)
					model.setCntrTpsz45ftQty(cntrTpsz45ftQty[i]);
				if (chgRtSeq[i] != null)
					model.setChgRtSeq(chgRtSeq[i]);
				if (cntrRatUtCd[i] != null)
					model.setCntrRatUtCd(cntrRatUtCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (declRmk[i] != null)
					model.setDeclRmk(declRmk[i]);
				if (ibCstmsCustCd[i] != null)
					model.setIbCstmsCustCd(ibCstmsCustCd[i]);
				if (exptFeuQty[i] != null)
					model.setExptFeuQty(exptFeuQty[i]);
				if (whfDeclDt[i] != null)
					model.setWhfDeclDt(whfDeclDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (taxCustNm[i] != null)
					model.setTaxCustNm(taxCustNm[i]);
				if (taxTeuQty[i] != null)
					model.setTaxTeuQty(taxTeuQty[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (tax45ftQty[i] != null)
					model.setTax45ftQty(tax45ftQty[i]);
				if (krWhfExptCd[i] != null)
					model.setKrWhfExptCd(krWhfExptCd[i]);
				if (expt45ftQty[i] != null)
					model.setExpt45ftQty(expt45ftQty[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (newChgAmt[i] != null)
					model.setNewChgAmt(newChgAmt[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (cntrTeuQty[i] != null)
					model.setCntrTeuQty(cntrTeuQty[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dcFlg[i] != null)
					model.setDcFlg(dcFlg[i]);
				if (bbCgoWgt[i] != null)
					model.setBbCgoWgt(bbCgoWgt[i]);
				if (cntr45ftQty[i] != null)
					model.setCntr45ftQty(cntr45ftQty[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (arIfFlg[i] != null)
					model.setArIfFlg(arIfFlg[i]);
				if (cntrTpszFeuQty[i] != null)
					model.setCntrTpszFeuQty(cntrTpszFeuQty[i]);
				if (oldChgAmt[i] != null)
					model.setOldChgAmt(oldChgAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgKrWhfRtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgKrWhfRtVO[]
	 */
	public BkgKrWhfRtVO[] getBkgKrWhfRtVOs(){
		BkgKrWhfRtVO[] vos = (BkgKrWhfRtVO[])models.toArray(new BkgKrWhfRtVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
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
	 * 필드에 있는 값을 스트링 배열로 반환.
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = null;
		}
		return arr;
	}

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.blkMeasQty = this.blkMeasQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfBndCd = this.whfBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blk45ftQty = this.blk45ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtonWgt = this.rtonWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrFeuQty = this.cntrFeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclNo = this.whfDeclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxFeuQty = this.taxFeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclIfFlg = this.whfDeclIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfDt = this.arIfDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszTeuQty = this.cntrTpszTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCustNm = this.blCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptTeuQty = this.exptTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrWgt = this.cntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blkFeuQty = this.blkFeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krCstmsFrtTpCd = this.krCstmsFrtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfNtcNo = this.whfNtcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portOfcCd = this.portOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.teuQty = this.teuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffAmt = this.diffAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blkTeuQty = this.blkTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpsz45ftQty = this.cntrTpsz45ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgRtSeq = this.chgRtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrRatUtCd = this.cntrRatUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.declRmk = this.declRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibCstmsCustCd = this.ibCstmsCustCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptFeuQty = this.exptFeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.whfDeclDt = this.whfDeclDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxCustNm = this.taxCustNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.taxTeuQty = this.taxTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tax45ftQty = this.tax45ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.krWhfExptCd = this.krWhfExptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expt45ftQty = this.expt45ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newChgAmt = this.newChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTeuQty = this.cntrTeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcFlg = this.dcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoWgt = this.bbCgoWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntr45ftQty = this.cntr45ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arIfFlg = this.arIfFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszFeuQty = this.cntrTpszFeuQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldChgAmt = this.oldChgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
