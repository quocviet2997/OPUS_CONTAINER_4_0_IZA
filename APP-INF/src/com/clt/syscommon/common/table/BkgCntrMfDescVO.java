/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCntrMfDescVO.java
*@FileTitle : BkgCntrMfDescVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.29
*@LastModifier : 김영출
*@LastVersion : 1.0
* 2009.07.29 김영출 
* 1.0 Creation
 * -------------------------------------------------------- 
 * History
 * 2010.12.07 최도순 [CHM-201007310] BKG C/M 화면에 DG SEQ 선택 필드 (구주 24 HR)
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
 * @author 김영출
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCntrMfDescVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCntrMfDescVO> models = new ArrayList<BkgCntrMfDescVO>();
	
	/* Column Info */
	private String cstmsDeclNo = null;
	/* Column Info */
	private String rdCgoFlg = null;
	/* Column Info */
	private String ncmNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cntrMfWgt = null;
	/* Column Info */
	private String cntrMfSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bbCgoFlg = null;
	/* Column Info */
	private String dcgoFlg = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String cmdtHsCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String hamoTrfCd = null;
	/* Column Info */
	private String awkCgoFlg = null;
	/* Column Info */
	private String cntrMfMkDesc = null;
	/* Column Info */
	private String cntrMfNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String poNo = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String hngrFlg = null;
	/* Column Info */
	private String cntrMfGdsDesc = null;
	/* Column Info */
	private String hblSeq = null;
	/* Column Info */
	private String rcFlg = null;
	/* Column Info */
	private String dcgoSeq = null;
	/* Column Info */
	private String mrnNo = null;
	/* Column Info */
	private String mrnDt = null;
	/* Column Info */
	private String cntrMfWgtUt = null;
	/* Column Info */
	private String cntrMfMeasUt = null;
	/* Column Info */
	private String markDesc = null;
	/* Column Info */
	private String markNo1 = null;
	/* Column Info */
	private String markNo2 = null;
	/* Column Info */
	private String markNo3 = null;
	/* Column Info */
	private String markNo4 = null;
	/* Column Info */
	private String markNo5 = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCntrMfDescVO() {}

	public BkgCntrMfDescVO(String ibflag, String pagerows, String bkgNo, String cntrMfSeq, String cntrNo, String pckQty, String pckTpCd, String cntrMfWgt, String wgtUtCd, String measQty, String measUtCd, String dcgoFlg, String bbCgoFlg, String awkCgoFlg, String rcFlg, String rdCgoFlg, String hngrFlg, String cntrMfMkDesc, String cntrMfGdsDesc, String hblSeq, String hamoTrfCd, String ncmNo, String poNo, String cntrMfNo, String cstmsDeclNo, String creUsrId, String creDt, String updUsrId, String updDt, String cmdtHsCd, String dcgoSeq, String mrnNo, String mrnDt, String cntrMfWgtUt, String cntrMfMeasUt, String markDesc, String markNo1, String markNo2, String markNo3, String markNo4, String markNo5) {
		this.cstmsDeclNo = cstmsDeclNo;
		this.rdCgoFlg = rdCgoFlg;
		this.ncmNo = ncmNo;
		this.creDt = creDt;
		this.cntrMfWgt = cntrMfWgt;
		this.cntrMfSeq = cntrMfSeq;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.bbCgoFlg = bbCgoFlg;
		this.dcgoFlg = dcgoFlg;
		this.measQty = measQty;
		this.wgtUtCd = wgtUtCd;
		this.pckQty = pckQty;
		this.cmdtHsCd = cmdtHsCd;
		this.measUtCd = measUtCd;
		this.pckTpCd = pckTpCd;
		this.updUsrId = updUsrId;
		this.updDt = updDt;
		this.hamoTrfCd = hamoTrfCd;
		this.awkCgoFlg = awkCgoFlg;
		this.cntrMfMkDesc = cntrMfMkDesc;
		this.cntrMfNo = cntrMfNo;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.poNo = poNo;
		this.cntrNo = cntrNo;
		this.hngrFlg = hngrFlg;
		this.cntrMfGdsDesc = cntrMfGdsDesc;
		this.hblSeq = hblSeq;
		this.rcFlg = rcFlg;
		this.dcgoSeq = dcgoSeq;
		this.mrnNo= mrnNo;
		this.mrnDt = mrnDt;
		this.cntrMfWgtUt = cntrMfWgtUt;
		this.cntrMfMeasUt = cntrMfMeasUt;
		this.markDesc = markDesc;
		this.markNo1 = markNo1;
		this.markNo2 = markNo2;
		this.markNo3 = markNo3;
		this.markNo4 = markNo4;
		this.markNo5 = markNo5;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cstms_decl_no", getCstmsDeclNo());
		this.hashColumns.put("rd_cgo_flg", getRdCgoFlg());
		this.hashColumns.put("ncm_no", getNcmNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cntr_mf_wgt", getCntrMfWgt());
		this.hashColumns.put("cntr_mf_seq", getCntrMfSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bb_cgo_flg", getBbCgoFlg());
		this.hashColumns.put("dcgo_flg", getDcgoFlg());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("cmdt_hs_cd", getCmdtHsCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hamo_trf_cd", getHamoTrfCd());
		this.hashColumns.put("awk_cgo_flg", getAwkCgoFlg());
		this.hashColumns.put("cntr_mf_mk_desc", getCntrMfMkDesc());
		this.hashColumns.put("cntr_mf_no", getCntrMfNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("po_no", getPoNo());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("hngr_flg", getHngrFlg());
		this.hashColumns.put("cntr_mf_gds_desc", getCntrMfGdsDesc());
		this.hashColumns.put("hbl_seq", getHblSeq());
		this.hashColumns.put("rc_flg", getRcFlg());
		this.hashColumns.put("dcgo_seq", getDcgoSeq());
		this.hashColumns.put("mrn_no", getMrnNo());
		this.hashColumns.put("mrn_dt", getMrnDt());
		this.hashColumns.put("cntr_mf_wgt_ut", getCntrMfWgtUt());
		this.hashColumns.put("cntr_mf_meas_ut", getCntrMfMeasUt());
		this.hashColumns.put("mark_desc", getMarkDesc());
		this.hashColumns.put("mark_no1", getMarkNo1());
		this.hashColumns.put("mark_no2", getMarkNo2());
		this.hashColumns.put("mark_no3", getMarkNo3());
		this.hashColumns.put("mark_no4", getMarkNo4());
		this.hashColumns.put("mark_no5", getMarkNo5());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cstms_decl_no", "cstmsDeclNo");
		this.hashFields.put("rd_cgo_flg", "rdCgoFlg");
		this.hashFields.put("ncm_no", "ncmNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cntr_mf_wgt", "cntrMfWgt");
		this.hashFields.put("cntr_mf_seq", "cntrMfSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bb_cgo_flg", "bbCgoFlg");
		this.hashFields.put("dcgo_flg", "dcgoFlg");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("cmdt_hs_cd", "cmdtHsCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hamo_trf_cd", "hamoTrfCd");
		this.hashFields.put("awk_cgo_flg", "awkCgoFlg");
		this.hashFields.put("cntr_mf_mk_desc", "cntrMfMkDesc");
		this.hashFields.put("cntr_mf_no", "cntrMfNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("po_no", "poNo");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("hngr_flg", "hngrFlg");
		this.hashFields.put("cntr_mf_gds_desc", "cntrMfGdsDesc");
		this.hashFields.put("hbl_seq", "hblSeq");
		this.hashFields.put("rc_flg", "rcFlg");
		this.hashFields.put("dcgo_seq", "dcgoSeq");
		this.hashFields.put("mrn_no", "mrnNo");
		this.hashFields.put("mrn_dt", "mrnDt");
		this.hashFields.put("cntr_mf_wgt_ut", "cntrMfWgtUt");
		this.hashFields.put("cntr_mf_meas_ut", "cntrMfMeasUt");
		this.hashFields.put("mark_desc", "markDesc");
		this.hashFields.put("mark_no1", "markNo1");
		this.hashFields.put("mark_no2", "markNo2");
		this.hashFields.put("mark_no3", "markNo3");
		this.hashFields.put("mark_no4", "markNo4");
		this.hashFields.put("mark_no5", "markNo5");
		return this.hashFields;
	}

	public String getMrnNo() {
		return mrnNo;
	}

	public void setMrnNo(String mrnNo) {
		this.mrnNo = mrnNo;
	}

	public String getMrnDt() {
		return mrnDt;
	}

	public void setMrnDt(String mrnDt) {
		this.mrnDt = mrnDt;
	}
	
	
	/**
	 * @return the dcgoSeq
	 */
	public String getDcgoSeq() {
		return dcgoSeq;
	}

	/**
	 * @param dcgoSeq the dcgoSeq to set
	 */
	public void setDcgoSeq(String dcgoSeq) {
		this.dcgoSeq = dcgoSeq;
	}

	/**
	 * Column Info
	 * @return cstmsDeclNo
	 */
	public String getCstmsDeclNo() {
		return this.cstmsDeclNo;
	}
	
	/**
	 * Column Info
	 * @return rdCgoFlg
	 */
	public String getRdCgoFlg() {
		return this.rdCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return ncmNo
	 */
	public String getNcmNo() {
		return this.ncmNo;
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
	 * @return cntrMfWgt
	 */
	public String getCntrMfWgt() {
		return this.cntrMfWgt;
	}
	
	/**
	 * Column Info
	 * @return cntrMfSeq
	 */
	public String getCntrMfSeq() {
		return this.cntrMfSeq;
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
	 * @return bbCgoFlg
	 */
	public String getBbCgoFlg() {
		return this.bbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return dcgoFlg
	 */
	public String getDcgoFlg() {
		return this.dcgoFlg;
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
	 * @return wgtUtCd
	 */
	public String getWgtUtCd() {
		return this.wgtUtCd;
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
	 * @return cmdtHsCd
	 */
	public String getCmdtHsCd() {
		return this.cmdtHsCd;
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
	 * @return pckTpCd
	 */
	public String getPckTpCd() {
		return this.pckTpCd;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return hamoTrfCd
	 */
	public String getHamoTrfCd() {
		return this.hamoTrfCd;
	}
	
	/**
	 * Column Info
	 * @return awkCgoFlg
	 */
	public String getAwkCgoFlg() {
		return this.awkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrMfMkDesc
	 */
	public String getCntrMfMkDesc() {
		return this.cntrMfMkDesc;
	}
	
	/**
	 * Column Info
	 * @return cntrMfNo
	 */
	public String getCntrMfNo() {
		return this.cntrMfNo;
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
	 * @return poNo
	 */
	public String getPoNo() {
		return this.poNo;
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
	 * @return hngrFlg
	 */
	public String getHngrFlg() {
		return this.hngrFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrMfGdsDesc
	 */
	public String getCntrMfGdsDesc() {
		return this.cntrMfGdsDesc;
	}
	
	/**
	 * Column Info
	 * @return hblSeq
	 */
	public String getHblSeq() {
		return this.hblSeq;
	}
	
	/**
	 * Column Info
	 * @return rcFlg
	 */
	public String getRcFlg() {
		return this.rcFlg;
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
	 * @return markNo1
	 */
	public String getMarkNo1() {
		return this.markNo1;
	}
	
	/**
	 * Column Info
	 * @return markNo2
	 */
	public String getMarkNo2() {
		return this.markNo2;
	}
	
	/**
	 * Column Info
	 * @return markNo3
	 */
	public String getMarkNo3() {
		return this.markNo3;
	}
	
	/**
	 * Column Info
	 * @return markNo4
	 */
	public String getMarkNo4() {
		return this.markNo4;
	}
	
	/**
	 * Column Info
	 * @return markNo5
	 */
	public String getMarkNo5() {
		return this.markNo5;
	}
	
	/**
	 * Column Info
	 * @param cstmsDeclNo
	 */
	public void setCstmsDeclNo(String cstmsDeclNo) {
		this.cstmsDeclNo = cstmsDeclNo;
	}
	
	/**
	 * Column Info
	 * @param rdCgoFlg
	 */
	public void setRdCgoFlg(String rdCgoFlg) {
		this.rdCgoFlg = rdCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param ncmNo
	 */
	public void setNcmNo(String ncmNo) {
		this.ncmNo = ncmNo;
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
	 * @param cntrMfWgt
	 */
	public void setCntrMfWgt(String cntrMfWgt) {
		this.cntrMfWgt = cntrMfWgt;
	}
	
	/**
	 * Column Info
	 * @param cntrMfSeq
	 */
	public void setCntrMfSeq(String cntrMfSeq) {
		this.cntrMfSeq = cntrMfSeq;
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
	 * @param bbCgoFlg
	 */
	public void setBbCgoFlg(String bbCgoFlg) {
		this.bbCgoFlg = bbCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param dcgoFlg
	 */
	public void setDcgoFlg(String dcgoFlg) {
		this.dcgoFlg = dcgoFlg;
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
	 * @param wgtUtCd
	 */
	public void setWgtUtCd(String wgtUtCd) {
		this.wgtUtCd = wgtUtCd;
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
	 * @param cmdtHsCd
	 */
	public void setCmdtHsCd(String cmdtHsCd) {
		this.cmdtHsCd = cmdtHsCd;
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
	 * @param pckTpCd
	 */
	public void setPckTpCd(String pckTpCd) {
		this.pckTpCd = pckTpCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param hamoTrfCd
	 */
	public void setHamoTrfCd(String hamoTrfCd) {
		this.hamoTrfCd = hamoTrfCd;
	}
	
	/**
	 * Column Info
	 * @param awkCgoFlg
	 */
	public void setAwkCgoFlg(String awkCgoFlg) {
		this.awkCgoFlg = awkCgoFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrMfMkDesc
	 */
	public void setCntrMfMkDesc(String cntrMfMkDesc) {
		this.cntrMfMkDesc = cntrMfMkDesc;
	}
	
	/**
	 * Column Info
	 * @param cntrMfNo
	 */
	public void setCntrMfNo(String cntrMfNo) {
		this.cntrMfNo = cntrMfNo;
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
	 * @param poNo
	 */
	public void setPoNo(String poNo) {
		this.poNo = poNo;
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
	 * @param hngrFlg
	 */
	public void setHngrFlg(String hngrFlg) {
		this.hngrFlg = hngrFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrMfGdsDesc
	 */
	public void setCntrMfGdsDesc(String cntrMfGdsDesc) {
		this.cntrMfGdsDesc = cntrMfGdsDesc;
	}
	
	/**
	 * Column Info
	 * @param hblSeq
	 */
	public void setHblSeq(String hblSeq) {
		this.hblSeq = hblSeq;
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
	 * @param markNo1
	 */
	public void setMarkNo1(String markNo1) {
		this.markNo1 = markNo1;
	}
	
	/**
	 * Column Info
	 * @param markNo2
	 */
	public void setMarkNo2(String markNo2) {
		this.markNo2 = markNo2;
	}
	
	/**
	 * Column Info
	 * @param markNo3
	 */
	public void setMarkNo3(String markNo3) {
		this.markNo3 = markNo3;
	}
	
	/**
	 * Column Info
	 * @param markNo4
	 */
	public void setMarkNo4(String markNo4) {
		this.markNo4 = markNo4;
	}
	
	/**
	 * Column Info
	 * @param markNo5
	 */
	public void setMarkNo5(String markNo5) {
		this.markNo5 = markNo5;
	}
	
	/**
	 * Column Info
	 * @param rcFlg
	 */
	public void setRcFlg(String rcFlg) {
		this.rcFlg = rcFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCstmsDeclNo(JSPUtil.getParameter(request, "cstms_decl_no", ""));
		setRdCgoFlg(JSPUtil.getParameter(request, "rd_cgo_flg", ""));
		setNcmNo(JSPUtil.getParameter(request, "ncm_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCntrMfWgt(JSPUtil.getParameter(request, "cntr_mf_wgt", ""));
		setCntrMfSeq(JSPUtil.getParameter(request, "cntr_mf_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBbCgoFlg(JSPUtil.getParameter(request, "bb_cgo_flg", ""));
		setDcgoFlg(JSPUtil.getParameter(request, "dcgo_flg", ""));
		setMeasQty(JSPUtil.getParameter(request, "meas_qty", ""));
		setWgtUtCd(JSPUtil.getParameter(request, "wgt_ut_cd", ""));
		setPckQty(JSPUtil.getParameter(request, "pck_qty", ""));
		setCmdtHsCd(JSPUtil.getParameter(request, "cmdt_hs_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, "meas_ut_cd", ""));
		setPckTpCd(JSPUtil.getParameter(request, "pck_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setHamoTrfCd(JSPUtil.getParameter(request, "hamo_trf_cd", ""));
		setAwkCgoFlg(JSPUtil.getParameter(request, "awk_cgo_flg", ""));
		setCntrMfMkDesc(JSPUtil.getParameter(request, "cntr_mf_mk_desc", ""));
		setCntrMfNo(JSPUtil.getParameter(request, "cntr_mf_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setPoNo(JSPUtil.getParameter(request, "po_no", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setHngrFlg(JSPUtil.getParameter(request, "hngr_flg", ""));
		setCntrMfGdsDesc(JSPUtil.getParameter(request, "cntr_mf_gds_desc", ""));
		setHblSeq(JSPUtil.getParameter(request, "hbl_seq", ""));
		setRcFlg(JSPUtil.getParameter(request, "rc_flg", ""));
		setDcgoSeq(JSPUtil.getParameter(request, "dcgo_seq", ""));
		setMrnNo(JSPUtil.getParameter(request, "mrn_no", ""));
		setMrnDt(JSPUtil.getParameter(request, "mrn_dt", ""));
		setCntrMfWgtUt(JSPUtil.getParameter(request, "cntr_mf_wgt_ut", ""));
		setCntrMfMeasUt(JSPUtil.getParameter(request, "cntr_mf_meas_ut", ""));
		setMarkDesc(JSPUtil.getParameter(request, "mark_desc", ""));
		setMarkNo1(JSPUtil.getParameter(request, "mark_no1", ""));
		setMarkNo2(JSPUtil.getParameter(request, "mark_no2", ""));
		setMarkNo3(JSPUtil.getParameter(request, "mark_no3", ""));
		setMarkNo4(JSPUtil.getParameter(request, "mark_no4", ""));
		setMarkNo5(JSPUtil.getParameter(request, "mark_no5", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCntrMfDescVO[]
	 */
	public BkgCntrMfDescVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCntrMfDescVO[]
	 */
	public BkgCntrMfDescVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCntrMfDescVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cstmsDeclNo = (JSPUtil.getParameter(request, prefix	+ "cstms_decl_no", length));
			String[] rdCgoFlg = (JSPUtil.getParameter(request, prefix	+ "rd_cgo_flg", length));
			String[] ncmNo = (JSPUtil.getParameter(request, prefix	+ "ncm_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cntrMfWgt = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_wgt", length));
			String[] cntrMfSeq = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bbCgoFlg = (JSPUtil.getParameter(request, prefix	+ "bb_cgo_flg", length));
			String[] dcgoFlg = (JSPUtil.getParameter(request, prefix	+ "dcgo_flg", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] cmdtHsCd = (JSPUtil.getParameter(request, prefix	+ "cmdt_hs_cd", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] hamoTrfCd = (JSPUtil.getParameter(request, prefix	+ "hamo_trf_cd", length));
			String[] awkCgoFlg = (JSPUtil.getParameter(request, prefix	+ "awk_cgo_flg", length));
			String[] cntrMfMkDesc = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_mk_desc", length));
			String[] cntrMfNo = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] poNo = (JSPUtil.getParameter(request, prefix	+ "po_no", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] hngrFlg = (JSPUtil.getParameter(request, prefix	+ "hngr_flg", length));
			String[] cntrMfGdsDesc = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_gds_desc", length));
			String[] hblSeq = (JSPUtil.getParameter(request, prefix	+ "hbl_seq", length));
			String[] rcFlg = (JSPUtil.getParameter(request, prefix	+ "rc_flg", length));
			String[] dcgoSeq = (JSPUtil.getParameter(request, prefix	+ "dcgo_seq", length));
			String[] mrnNo = (JSPUtil.getParameter(request, prefix	+ "mrn_no", length));
			String[] mrnDt= (JSPUtil.getParameter(request, prefix	+ "mrn_dt", length));
			String[] cntrMfWgtUt = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_wgt_ut", length));
			String[] cntrMfMeasUt = (JSPUtil.getParameter(request, prefix	+ "cntr_mf_meas_ut", length));
			String[] markDesc = (JSPUtil.getParameter(request, prefix	+ "mark_desc", length));
			String[] markNo1 = (JSPUtil.getParameter(request, prefix	+ "mark_no1", length));
			String[] markNo2 = (JSPUtil.getParameter(request, prefix	+ "mark_no2", length));
			String[] markNo3 = (JSPUtil.getParameter(request, prefix	+ "mark_no3", length));
			String[] markNo4 = (JSPUtil.getParameter(request, prefix	+ "mark_no4", length));
			String[] markNo5 = (JSPUtil.getParameter(request, prefix	+ "mark_no5", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCntrMfDescVO();
				if (cstmsDeclNo[i] != null)
					model.setCstmsDeclNo(cstmsDeclNo[i]);
				if (rdCgoFlg[i] != null)
					model.setRdCgoFlg(rdCgoFlg[i]);
				if (ncmNo[i] != null)
					model.setNcmNo(ncmNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cntrMfWgt[i] != null)
					model.setCntrMfWgt(cntrMfWgt[i]);
				if (cntrMfSeq[i] != null)
					model.setCntrMfSeq(cntrMfSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bbCgoFlg[i] != null)
					model.setBbCgoFlg(bbCgoFlg[i]);
				if (dcgoFlg[i] != null)
					model.setDcgoFlg(dcgoFlg[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (cmdtHsCd[i] != null)
					model.setCmdtHsCd(cmdtHsCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hamoTrfCd[i] != null)
					model.setHamoTrfCd(hamoTrfCd[i]);
				if (awkCgoFlg[i] != null)
					model.setAwkCgoFlg(awkCgoFlg[i]);
				if (cntrMfMkDesc[i] != null)
					model.setCntrMfMkDesc(cntrMfMkDesc[i]);
				if (cntrMfNo[i] != null)
					model.setCntrMfNo(cntrMfNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (poNo[i] != null)
					model.setPoNo(poNo[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (hngrFlg[i] != null)
					model.setHngrFlg(hngrFlg[i]);
				if (cntrMfGdsDesc[i] != null)
					model.setCntrMfGdsDesc(cntrMfGdsDesc[i]);
				if (hblSeq[i] != null)
					model.setHblSeq(hblSeq[i]);
				if (rcFlg[i] != null)
					model.setRcFlg(rcFlg[i]);
				if (dcgoSeq[i] != null)
					model.setDcgoSeq(dcgoSeq[i]);
				if (mrnNo[i] != null)
					model.setMrnNo(mrnNo[i]);
				if (mrnDt[i] != null)
					model.setMrnDt(mrnDt[i]);
				if (cntrMfWgtUt[i] != null)
					model.setCntrMfWgtUt(cntrMfWgtUt[i]);
				if (cntrMfMeasUt[i] != null)
					model.setCntrMfMeasUt(cntrMfMeasUt[i]);
				if (markDesc[i] != null)
					model.setMarkDesc(markDesc[i]);
				if (markNo1[i] != null)
					model.setMarkNo1(markNo1[i]);
				if (markNo2[i] != null)
					model.setMarkNo2(markNo2[i]);
				if (markNo3[i] != null)
					model.setMarkNo3(markNo3[i]);
				if (markNo4[i] != null)
					model.setMarkNo4(markNo4[i]);
				if (markNo5[i] != null)
					model.setMarkNo5(markNo5[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCntrMfDescVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCntrMfDescVO[]
	 */
	public BkgCntrMfDescVO[] getBkgCntrMfDescVOs(){
		BkgCntrMfDescVO[] vos = (BkgCntrMfDescVO[])models.toArray(new BkgCntrMfDescVO[models.size()]);
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
		this.cstmsDeclNo = this.cstmsDeclNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rdCgoFlg = this.rdCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ncmNo = this.ncmNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfWgt = this.cntrMfWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfSeq = this.cntrMfSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bbCgoFlg = this.bbCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoFlg = this.dcgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtHsCd = this.cmdtHsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hamoTrfCd = this.hamoTrfCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkCgoFlg = this.awkCgoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfMkDesc = this.cntrMfMkDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfNo = this.cntrMfNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poNo = this.poNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hngrFlg = this.hngrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfGdsDesc = this.cntrMfGdsDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hblSeq = this.hblSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcFlg = this.rcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoSeq = this.dcgoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnNo = this.mrnNo. replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnDt= this.mrnDt. replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfWgtUt = this.cntrMfWgtUt. replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrMfMeasUt = this.cntrMfMeasUt. replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markDesc = this.markDesc. replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markNo1 = this.markNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markNo2 = this.markNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markNo3 = this.markNo3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markNo4 = this.markNo4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.markNo5 = this.markNo5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
