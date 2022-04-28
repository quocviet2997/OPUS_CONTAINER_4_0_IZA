/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsJpVslVO.java
*@FileTitle : BkgCstmsJpVslVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.22
*@LastModifier : 
*@LastVersion : 1.0
* 2009.06.22  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsJpVslVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsJpVslVO> models = new ArrayList<BkgCstmsJpVslVO>();
	
	/* Column Info */
	private String lodgPckQty = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String lodgFlg = null;
	/* Column Info */
	private String nxtSkdDirCd = null;
	/* Column Info */
	private String nxtSkdVoyNo = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mfRmk = null;
	/* Column Info */
	private String locCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String lodgWgt = null;
	/* Column Info */
	private String jpLodgCd = null;
	/* Column Info */
	private String cstmsPckTpCd = null;
	/* Column Info */
	private String ttlCrwKnt = null;
	/* Column Info */
	private String notEmbCrwQty = null;
	/* Column Info */
	private String notAuthCrwQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String capNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String notCrwBkQty = null;
	/* Column Info */
	private String psptNo9 = null;
	/* Column Info */
	private String psptNo8 = null;
	/* Column Info */
	private String psptNo10 = null;
	/* Column Info */
	private String cstmsMfCd = null;
	/* Column Info */
	private String debkCrwQty = null;
	/* Column Info */
	private String psptNo13 = null;
	/* Column Info */
	private String n1stClptCd = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String psptNo14 = null;
	/* Column Info */
	private String psptNo11 = null;
	/* Column Info */
	private String psptNo12 = null;
	/* Column Info */
	private String dchgWgt = null;
	/* Column Info */
	private String lodgCmdtCtnt = null;
	/* Column Info */
	private String portSkdDirCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String psptNo15 = null;
	/* Column Info */
	private String psptNo16 = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String portSkdVoyNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String lodgRsnDesc = null;
	/* Column Info */
	private String lodgRmk = null;
	/* Column Info */
	private String psptNo6 = null;
	/* Column Info */
	private String psptNo7 = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsJpVslVO() {}

	public BkgCstmsJpVslVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String podCd, String capNm, String notCrwBkQty, String notAuthCrwQty, String notEmbCrwQty, String debkCrwQty, String ttlCrwKnt, String psptNo6, String psptNo7, String psptNo8, String psptNo9, String psptNo10, String psptNo11, String psptNo12, String psptNo13, String psptNo14, String psptNo15, String psptNo16, String lodgWgt, String dchgWgt, String portSkdVoyNo, String portSkdDirCd, String nxtSkdVoyNo, String nxtSkdDirCd, String locCd, String cstmsMfCd, String lodgFlg, String jpLodgCd, String lodgRsnDesc, String lodgCmdtCtnt, String lodgPckQty, String cstmsPckTpCd, String lodgRmk, String n1stClptCd, String mfRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.lodgPckQty = lodgPckQty;
		this.vslCd = vslCd;
		this.lodgFlg = lodgFlg;
		this.nxtSkdDirCd = nxtSkdDirCd;
		this.nxtSkdVoyNo = nxtSkdVoyNo;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.mfRmk = mfRmk;
		this.locCd = locCd;
		this.ibflag = ibflag;
		this.lodgWgt = lodgWgt;
		this.jpLodgCd = jpLodgCd;
		this.cstmsPckTpCd = cstmsPckTpCd;
		this.ttlCrwKnt = ttlCrwKnt;
		this.notEmbCrwQty = notEmbCrwQty;
		this.notAuthCrwQty = notAuthCrwQty;
		this.updUsrId = updUsrId;
		this.capNm = capNm;
		this.updDt = updDt;
		this.notCrwBkQty = notCrwBkQty;
		this.psptNo9 = psptNo9;
		this.psptNo8 = psptNo8;
		this.psptNo10 = psptNo10;
		this.cstmsMfCd = cstmsMfCd;
		this.debkCrwQty = debkCrwQty;
		this.psptNo13 = psptNo13;
		this.n1stClptCd = n1stClptCd;
		this.skdVoyNo = skdVoyNo;
		this.psptNo14 = psptNo14;
		this.psptNo11 = psptNo11;
		this.psptNo12 = psptNo12;
		this.dchgWgt = dchgWgt;
		this.lodgCmdtCtnt = lodgCmdtCtnt;
		this.portSkdDirCd = portSkdDirCd;
		this.skdDirCd = skdDirCd;
		this.psptNo15 = psptNo15;
		this.psptNo16 = psptNo16;
		this.podCd = podCd;
		this.portSkdVoyNo = portSkdVoyNo;
		this.creUsrId = creUsrId;
		this.lodgRsnDesc = lodgRsnDesc;
		this.lodgRmk = lodgRmk;
		this.psptNo6 = psptNo6;
		this.psptNo7 = psptNo7;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lodg_pck_qty", getLodgPckQty());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("lodg_flg", getLodgFlg());
		this.hashColumns.put("nxt_skd_dir_cd", getNxtSkdDirCd());
		this.hashColumns.put("nxt_skd_voy_no", getNxtSkdVoyNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mf_rmk", getMfRmk());
		this.hashColumns.put("loc_cd", getLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("lodg_wgt", getLodgWgt());
		this.hashColumns.put("jp_lodg_cd", getJpLodgCd());
		this.hashColumns.put("cstms_pck_tp_cd", getCstmsPckTpCd());
		this.hashColumns.put("ttl_crw_knt", getTtlCrwKnt());
		this.hashColumns.put("not_emb_crw_qty", getNotEmbCrwQty());
		this.hashColumns.put("not_auth_crw_qty", getNotAuthCrwQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cap_nm", getCapNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("not_crw_bk_qty", getNotCrwBkQty());
		this.hashColumns.put("pspt_no9", getPsptNo9());
		this.hashColumns.put("pspt_no8", getPsptNo8());
		this.hashColumns.put("pspt_no10", getPsptNo10());
		this.hashColumns.put("cstms_mf_cd", getCstmsMfCd());
		this.hashColumns.put("debk_crw_qty", getDebkCrwQty());
		this.hashColumns.put("pspt_no13", getPsptNo13());
		this.hashColumns.put("n1st_clpt_cd", getN1stClptCd());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("pspt_no14", getPsptNo14());
		this.hashColumns.put("pspt_no11", getPsptNo11());
		this.hashColumns.put("pspt_no12", getPsptNo12());
		this.hashColumns.put("dchg_wgt", getDchgWgt());
		this.hashColumns.put("lodg_cmdt_ctnt", getLodgCmdtCtnt());
		this.hashColumns.put("port_skd_dir_cd", getPortSkdDirCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pspt_no15", getPsptNo15());
		this.hashColumns.put("pspt_no16", getPsptNo16());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("port_skd_voy_no", getPortSkdVoyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lodg_rsn_desc", getLodgRsnDesc());
		this.hashColumns.put("lodg_rmk", getLodgRmk());
		this.hashColumns.put("pspt_no6", getPsptNo6());
		this.hashColumns.put("pspt_no7", getPsptNo7());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lodg_pck_qty", "lodgPckQty");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("lodg_flg", "lodgFlg");
		this.hashFields.put("nxt_skd_dir_cd", "nxtSkdDirCd");
		this.hashFields.put("nxt_skd_voy_no", "nxtSkdVoyNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mf_rmk", "mfRmk");
		this.hashFields.put("loc_cd", "locCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("lodg_wgt", "lodgWgt");
		this.hashFields.put("jp_lodg_cd", "jpLodgCd");
		this.hashFields.put("cstms_pck_tp_cd", "cstmsPckTpCd");
		this.hashFields.put("ttl_crw_knt", "ttlCrwKnt");
		this.hashFields.put("not_emb_crw_qty", "notEmbCrwQty");
		this.hashFields.put("not_auth_crw_qty", "notAuthCrwQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cap_nm", "capNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("not_crw_bk_qty", "notCrwBkQty");
		this.hashFields.put("pspt_no9", "psptNo9");
		this.hashFields.put("pspt_no8", "psptNo8");
		this.hashFields.put("pspt_no10", "psptNo10");
		this.hashFields.put("cstms_mf_cd", "cstmsMfCd");
		this.hashFields.put("debk_crw_qty", "debkCrwQty");
		this.hashFields.put("pspt_no13", "psptNo13");
		this.hashFields.put("n1st_clpt_cd", "n1stClptCd");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("pspt_no14", "psptNo14");
		this.hashFields.put("pspt_no11", "psptNo11");
		this.hashFields.put("pspt_no12", "psptNo12");
		this.hashFields.put("dchg_wgt", "dchgWgt");
		this.hashFields.put("lodg_cmdt_ctnt", "lodgCmdtCtnt");
		this.hashFields.put("port_skd_dir_cd", "portSkdDirCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pspt_no15", "psptNo15");
		this.hashFields.put("pspt_no16", "psptNo16");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("port_skd_voy_no", "portSkdVoyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lodg_rsn_desc", "lodgRsnDesc");
		this.hashFields.put("lodg_rmk", "lodgRmk");
		this.hashFields.put("pspt_no6", "psptNo6");
		this.hashFields.put("pspt_no7", "psptNo7");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return lodgPckQty
	 */
	public String getLodgPckQty() {
		return this.lodgPckQty;
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
	 * @return lodgFlg
	 */
	public String getLodgFlg() {
		return this.lodgFlg;
	}
	
	/**
	 * Column Info
	 * @return nxtSkdDirCd
	 */
	public String getNxtSkdDirCd() {
		return this.nxtSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return nxtSkdVoyNo
	 */
	public String getNxtSkdVoyNo() {
		return this.nxtSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return mfRmk
	 */
	public String getMfRmk() {
		return this.mfRmk;
	}
	
	/**
	 * Column Info
	 * @return locCd
	 */
	public String getLocCd() {
		return this.locCd;
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
	 * @return lodgWgt
	 */
	public String getLodgWgt() {
		return this.lodgWgt;
	}
	
	/**
	 * Column Info
	 * @return jpLodgCd
	 */
	public String getJpLodgCd() {
		return this.jpLodgCd;
	}
	
	/**
	 * Column Info
	 * @return cstmsPckTpCd
	 */
	public String getCstmsPckTpCd() {
		return this.cstmsPckTpCd;
	}
	
	/**
	 * Column Info
	 * @return ttlCrwKnt
	 */
	public String getTtlCrwKnt() {
		return this.ttlCrwKnt;
	}
	
	/**
	 * Column Info
	 * @return notEmbCrwQty
	 */
	public String getNotEmbCrwQty() {
		return this.notEmbCrwQty;
	}
	
	/**
	 * Column Info
	 * @return notAuthCrwQty
	 */
	public String getNotAuthCrwQty() {
		return this.notAuthCrwQty;
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
	 * @return capNm
	 */
	public String getCapNm() {
		return this.capNm;
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
	 * @return notCrwBkQty
	 */
	public String getNotCrwBkQty() {
		return this.notCrwBkQty;
	}
	
	/**
	 * Column Info
	 * @return psptNo9
	 */
	public String getPsptNo9() {
		return this.psptNo9;
	}
	
	/**
	 * Column Info
	 * @return psptNo8
	 */
	public String getPsptNo8() {
		return this.psptNo8;
	}
	
	/**
	 * Column Info
	 * @return psptNo10
	 */
	public String getPsptNo10() {
		return this.psptNo10;
	}
	
	/**
	 * Column Info
	 * @return cstmsMfCd
	 */
	public String getCstmsMfCd() {
		return this.cstmsMfCd;
	}
	
	/**
	 * Column Info
	 * @return debkCrwQty
	 */
	public String getDebkCrwQty() {
		return this.debkCrwQty;
	}
	
	/**
	 * Column Info
	 * @return psptNo13
	 */
	public String getPsptNo13() {
		return this.psptNo13;
	}
	
	/**
	 * Column Info
	 * @return n1stClptCd
	 */
	public String getN1stClptCd() {
		return this.n1stClptCd;
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
	 * @return psptNo14
	 */
	public String getPsptNo14() {
		return this.psptNo14;
	}
	
	/**
	 * Column Info
	 * @return psptNo11
	 */
	public String getPsptNo11() {
		return this.psptNo11;
	}
	
	/**
	 * Column Info
	 * @return psptNo12
	 */
	public String getPsptNo12() {
		return this.psptNo12;
	}
	
	/**
	 * Column Info
	 * @return dchgWgt
	 */
	public String getDchgWgt() {
		return this.dchgWgt;
	}
	
	/**
	 * Column Info
	 * @return lodgCmdtCtnt
	 */
	public String getLodgCmdtCtnt() {
		return this.lodgCmdtCtnt;
	}
	
	/**
	 * Column Info
	 * @return portSkdDirCd
	 */
	public String getPortSkdDirCd() {
		return this.portSkdDirCd;
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
	 * @return psptNo15
	 */
	public String getPsptNo15() {
		return this.psptNo15;
	}
	
	/**
	 * Column Info
	 * @return psptNo16
	 */
	public String getPsptNo16() {
		return this.psptNo16;
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
	 * @return portSkdVoyNo
	 */
	public String getPortSkdVoyNo() {
		return this.portSkdVoyNo;
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
	 * @return lodgRsnDesc
	 */
	public String getLodgRsnDesc() {
		return this.lodgRsnDesc;
	}
	
	/**
	 * Column Info
	 * @return lodgRmk
	 */
	public String getLodgRmk() {
		return this.lodgRmk;
	}
	
	/**
	 * Column Info
	 * @return psptNo6
	 */
	public String getPsptNo6() {
		return this.psptNo6;
	}
	
	/**
	 * Column Info
	 * @return psptNo7
	 */
	public String getPsptNo7() {
		return this.psptNo7;
	}
	

	/**
	 * Column Info
	 * @param lodgPckQty
	 */
	public void setLodgPckQty(String lodgPckQty) {
		this.lodgPckQty = lodgPckQty;
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
	 * @param lodgFlg
	 */
	public void setLodgFlg(String lodgFlg) {
		this.lodgFlg = lodgFlg;
	}
	
	/**
	 * Column Info
	 * @param nxtSkdDirCd
	 */
	public void setNxtSkdDirCd(String nxtSkdDirCd) {
		this.nxtSkdDirCd = nxtSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param nxtSkdVoyNo
	 */
	public void setNxtSkdVoyNo(String nxtSkdVoyNo) {
		this.nxtSkdVoyNo = nxtSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param mfRmk
	 */
	public void setMfRmk(String mfRmk) {
		this.mfRmk = mfRmk;
	}
	
	/**
	 * Column Info
	 * @param locCd
	 */
	public void setLocCd(String locCd) {
		this.locCd = locCd;
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
	 * @param lodgWgt
	 */
	public void setLodgWgt(String lodgWgt) {
		this.lodgWgt = lodgWgt;
	}
	
	/**
	 * Column Info
	 * @param jpLodgCd
	 */
	public void setJpLodgCd(String jpLodgCd) {
		this.jpLodgCd = jpLodgCd;
	}
	
	/**
	 * Column Info
	 * @param cstmsPckTpCd
	 */
	public void setCstmsPckTpCd(String cstmsPckTpCd) {
		this.cstmsPckTpCd = cstmsPckTpCd;
	}
	
	/**
	 * Column Info
	 * @param ttlCrwKnt
	 */
	public void setTtlCrwKnt(String ttlCrwKnt) {
		this.ttlCrwKnt = ttlCrwKnt;
	}
	
	/**
	 * Column Info
	 * @param notEmbCrwQty
	 */
	public void setNotEmbCrwQty(String notEmbCrwQty) {
		this.notEmbCrwQty = notEmbCrwQty;
	}
	
	/**
	 * Column Info
	 * @param notAuthCrwQty
	 */
	public void setNotAuthCrwQty(String notAuthCrwQty) {
		this.notAuthCrwQty = notAuthCrwQty;
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
	 * @param capNm
	 */
	public void setCapNm(String capNm) {
		this.capNm = capNm;
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
	 * @param notCrwBkQty
	 */
	public void setNotCrwBkQty(String notCrwBkQty) {
		this.notCrwBkQty = notCrwBkQty;
	}
	
	/**
	 * Column Info
	 * @param psptNo9
	 */
	public void setPsptNo9(String psptNo9) {
		this.psptNo9 = psptNo9;
	}
	
	/**
	 * Column Info
	 * @param psptNo8
	 */
	public void setPsptNo8(String psptNo8) {
		this.psptNo8 = psptNo8;
	}
	
	/**
	 * Column Info
	 * @param psptNo10
	 */
	public void setPsptNo10(String psptNo10) {
		this.psptNo10 = psptNo10;
	}
	
	/**
	 * Column Info
	 * @param cstmsMfCd
	 */
	public void setCstmsMfCd(String cstmsMfCd) {
		this.cstmsMfCd = cstmsMfCd;
	}
	
	/**
	 * Column Info
	 * @param debkCrwQty
	 */
	public void setDebkCrwQty(String debkCrwQty) {
		this.debkCrwQty = debkCrwQty;
	}
	
	/**
	 * Column Info
	 * @param psptNo13
	 */
	public void setPsptNo13(String psptNo13) {
		this.psptNo13 = psptNo13;
	}
	
	/**
	 * Column Info
	 * @param n1stClptCd
	 */
	public void setN1stClptCd(String n1stClptCd) {
		this.n1stClptCd = n1stClptCd;
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
	 * @param psptNo14
	 */
	public void setPsptNo14(String psptNo14) {
		this.psptNo14 = psptNo14;
	}
	
	/**
	 * Column Info
	 * @param psptNo11
	 */
	public void setPsptNo11(String psptNo11) {
		this.psptNo11 = psptNo11;
	}
	
	/**
	 * Column Info
	 * @param psptNo12
	 */
	public void setPsptNo12(String psptNo12) {
		this.psptNo12 = psptNo12;
	}
	
	/**
	 * Column Info
	 * @param dchgWgt
	 */
	public void setDchgWgt(String dchgWgt) {
		this.dchgWgt = dchgWgt;
	}
	
	/**
	 * Column Info
	 * @param lodgCmdtCtnt
	 */
	public void setLodgCmdtCtnt(String lodgCmdtCtnt) {
		this.lodgCmdtCtnt = lodgCmdtCtnt;
	}
	
	/**
	 * Column Info
	 * @param portSkdDirCd
	 */
	public void setPortSkdDirCd(String portSkdDirCd) {
		this.portSkdDirCd = portSkdDirCd;
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
	 * @param psptNo15
	 */
	public void setPsptNo15(String psptNo15) {
		this.psptNo15 = psptNo15;
	}
	
	/**
	 * Column Info
	 * @param psptNo16
	 */
	public void setPsptNo16(String psptNo16) {
		this.psptNo16 = psptNo16;
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
	 * @param portSkdVoyNo
	 */
	public void setPortSkdVoyNo(String portSkdVoyNo) {
		this.portSkdVoyNo = portSkdVoyNo;
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
	 * @param lodgRsnDesc
	 */
	public void setLodgRsnDesc(String lodgRsnDesc) {
		this.lodgRsnDesc = lodgRsnDesc;
	}
	
	/**
	 * Column Info
	 * @param lodgRmk
	 */
	public void setLodgRmk(String lodgRmk) {
		this.lodgRmk = lodgRmk;
	}
	
	/**
	 * Column Info
	 * @param psptNo6
	 */
	public void setPsptNo6(String psptNo6) {
		this.psptNo6 = psptNo6;
	}
	
	/**
	 * Column Info
	 * @param psptNo7
	 */
	public void setPsptNo7(String psptNo7) {
		this.psptNo7 = psptNo7;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setLodgPckQty(JSPUtil.getParameter(request, "lodg_pck_qty", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setLodgFlg(JSPUtil.getParameter(request, "lodg_flg", ""));
		setNxtSkdDirCd(JSPUtil.getParameter(request, "nxt_skd_dir_cd", ""));
		setNxtSkdVoyNo(JSPUtil.getParameter(request, "nxt_skd_voy_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMfRmk(JSPUtil.getParameter(request, "mf_rmk", ""));
		setLocCd(JSPUtil.getParameter(request, "loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLodgWgt(JSPUtil.getParameter(request, "lodg_wgt", ""));
		setJpLodgCd(JSPUtil.getParameter(request, "jp_lodg_cd", ""));
		setCstmsPckTpCd(JSPUtil.getParameter(request, "cstms_pck_tp_cd", ""));
		setTtlCrwKnt(JSPUtil.getParameter(request, "ttl_crw_knt", ""));
		setNotEmbCrwQty(JSPUtil.getParameter(request, "not_emb_crw_qty", ""));
		setNotAuthCrwQty(JSPUtil.getParameter(request, "not_auth_crw_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCapNm(JSPUtil.getParameter(request, "cap_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setNotCrwBkQty(JSPUtil.getParameter(request, "not_crw_bk_qty", ""));
		setPsptNo9(JSPUtil.getParameter(request, "pspt_no9", ""));
		setPsptNo8(JSPUtil.getParameter(request, "pspt_no8", ""));
		setPsptNo10(JSPUtil.getParameter(request, "pspt_no10", ""));
		setCstmsMfCd(JSPUtil.getParameter(request, "cstms_mf_cd", ""));
		setDebkCrwQty(JSPUtil.getParameter(request, "debk_crw_qty", ""));
		setPsptNo13(JSPUtil.getParameter(request, "pspt_no13", ""));
		setN1stClptCd(JSPUtil.getParameter(request, "n1st_clpt_cd", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setPsptNo14(JSPUtil.getParameter(request, "pspt_no14", ""));
		setPsptNo11(JSPUtil.getParameter(request, "pspt_no11", ""));
		setPsptNo12(JSPUtil.getParameter(request, "pspt_no12", ""));
		setDchgWgt(JSPUtil.getParameter(request, "dchg_wgt", ""));
		setLodgCmdtCtnt(JSPUtil.getParameter(request, "lodg_cmdt_ctnt", ""));
		setPortSkdDirCd(JSPUtil.getParameter(request, "port_skd_dir_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPsptNo15(JSPUtil.getParameter(request, "pspt_no15", ""));
		setPsptNo16(JSPUtil.getParameter(request, "pspt_no16", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setPortSkdVoyNo(JSPUtil.getParameter(request, "port_skd_voy_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLodgRsnDesc(JSPUtil.getParameter(request, "lodg_rsn_desc", ""));
		setLodgRmk(JSPUtil.getParameter(request, "lodg_rmk", ""));
		setPsptNo6(JSPUtil.getParameter(request, "pspt_no6", ""));
		setPsptNo7(JSPUtil.getParameter(request, "pspt_no7", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsJpVslVO[]
	 */
	public BkgCstmsJpVslVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsJpVslVO[]
	 */
	public BkgCstmsJpVslVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsJpVslVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] lodgPckQty = (JSPUtil.getParameter(request, prefix	+ "lodg_pck_qty", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] lodgFlg = (JSPUtil.getParameter(request, prefix	+ "lodg_flg", length));
			String[] nxtSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "nxt_skd_dir_cd", length));
			String[] nxtSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "nxt_skd_voy_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mfRmk = (JSPUtil.getParameter(request, prefix	+ "mf_rmk", length));
			String[] locCd = (JSPUtil.getParameter(request, prefix	+ "loc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] lodgWgt = (JSPUtil.getParameter(request, prefix	+ "lodg_wgt", length));
			String[] jpLodgCd = (JSPUtil.getParameter(request, prefix	+ "jp_lodg_cd", length));
			String[] cstmsPckTpCd = (JSPUtil.getParameter(request, prefix	+ "cstms_pck_tp_cd", length));
			String[] ttlCrwKnt = (JSPUtil.getParameter(request, prefix	+ "ttl_crw_knt", length));
			String[] notEmbCrwQty = (JSPUtil.getParameter(request, prefix	+ "not_emb_crw_qty", length));
			String[] notAuthCrwQty = (JSPUtil.getParameter(request, prefix	+ "not_auth_crw_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] capNm = (JSPUtil.getParameter(request, prefix	+ "cap_nm", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] notCrwBkQty = (JSPUtil.getParameter(request, prefix	+ "not_crw_bk_qty", length));
			String[] psptNo9 = (JSPUtil.getParameter(request, prefix	+ "pspt_no9", length));
			String[] psptNo8 = (JSPUtil.getParameter(request, prefix	+ "pspt_no8", length));
			String[] psptNo10 = (JSPUtil.getParameter(request, prefix	+ "pspt_no10", length));
			String[] cstmsMfCd = (JSPUtil.getParameter(request, prefix	+ "cstms_mf_cd", length));
			String[] debkCrwQty = (JSPUtil.getParameter(request, prefix	+ "debk_crw_qty", length));
			String[] psptNo13 = (JSPUtil.getParameter(request, prefix	+ "pspt_no13", length));
			String[] n1stClptCd = (JSPUtil.getParameter(request, prefix	+ "n1st_clpt_cd", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] psptNo14 = (JSPUtil.getParameter(request, prefix	+ "pspt_no14", length));
			String[] psptNo11 = (JSPUtil.getParameter(request, prefix	+ "pspt_no11", length));
			String[] psptNo12 = (JSPUtil.getParameter(request, prefix	+ "pspt_no12", length));
			String[] dchgWgt = (JSPUtil.getParameter(request, prefix	+ "dchg_wgt", length));
			String[] lodgCmdtCtnt = (JSPUtil.getParameter(request, prefix	+ "lodg_cmdt_ctnt", length));
			String[] portSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "port_skd_dir_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] psptNo15 = (JSPUtil.getParameter(request, prefix	+ "pspt_no15", length));
			String[] psptNo16 = (JSPUtil.getParameter(request, prefix	+ "pspt_no16", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] portSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "port_skd_voy_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] lodgRsnDesc = (JSPUtil.getParameter(request, prefix	+ "lodg_rsn_desc", length));
			String[] lodgRmk = (JSPUtil.getParameter(request, prefix	+ "lodg_rmk", length));
			String[] psptNo6 = (JSPUtil.getParameter(request, prefix	+ "pspt_no6", length));
			String[] psptNo7 = (JSPUtil.getParameter(request, prefix	+ "pspt_no7", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsJpVslVO();
				if (lodgPckQty[i] != null)
					model.setLodgPckQty(lodgPckQty[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (lodgFlg[i] != null)
					model.setLodgFlg(lodgFlg[i]);
				if (nxtSkdDirCd[i] != null)
					model.setNxtSkdDirCd(nxtSkdDirCd[i]);
				if (nxtSkdVoyNo[i] != null)
					model.setNxtSkdVoyNo(nxtSkdVoyNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mfRmk[i] != null)
					model.setMfRmk(mfRmk[i]);
				if (locCd[i] != null)
					model.setLocCd(locCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (lodgWgt[i] != null)
					model.setLodgWgt(lodgWgt[i]);
				if (jpLodgCd[i] != null)
					model.setJpLodgCd(jpLodgCd[i]);
				if (cstmsPckTpCd[i] != null)
					model.setCstmsPckTpCd(cstmsPckTpCd[i]);
				if (ttlCrwKnt[i] != null)
					model.setTtlCrwKnt(ttlCrwKnt[i]);
				if (notEmbCrwQty[i] != null)
					model.setNotEmbCrwQty(notEmbCrwQty[i]);
				if (notAuthCrwQty[i] != null)
					model.setNotAuthCrwQty(notAuthCrwQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (capNm[i] != null)
					model.setCapNm(capNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (notCrwBkQty[i] != null)
					model.setNotCrwBkQty(notCrwBkQty[i]);
				if (psptNo9[i] != null)
					model.setPsptNo9(psptNo9[i]);
				if (psptNo8[i] != null)
					model.setPsptNo8(psptNo8[i]);
				if (psptNo10[i] != null)
					model.setPsptNo10(psptNo10[i]);
				if (cstmsMfCd[i] != null)
					model.setCstmsMfCd(cstmsMfCd[i]);
				if (debkCrwQty[i] != null)
					model.setDebkCrwQty(debkCrwQty[i]);
				if (psptNo13[i] != null)
					model.setPsptNo13(psptNo13[i]);
				if (n1stClptCd[i] != null)
					model.setN1stClptCd(n1stClptCd[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (psptNo14[i] != null)
					model.setPsptNo14(psptNo14[i]);
				if (psptNo11[i] != null)
					model.setPsptNo11(psptNo11[i]);
				if (psptNo12[i] != null)
					model.setPsptNo12(psptNo12[i]);
				if (dchgWgt[i] != null)
					model.setDchgWgt(dchgWgt[i]);
				if (lodgCmdtCtnt[i] != null)
					model.setLodgCmdtCtnt(lodgCmdtCtnt[i]);
				if (portSkdDirCd[i] != null)
					model.setPortSkdDirCd(portSkdDirCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (psptNo15[i] != null)
					model.setPsptNo15(psptNo15[i]);
				if (psptNo16[i] != null)
					model.setPsptNo16(psptNo16[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (portSkdVoyNo[i] != null)
					model.setPortSkdVoyNo(portSkdVoyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (lodgRsnDesc[i] != null)
					model.setLodgRsnDesc(lodgRsnDesc[i]);
				if (lodgRmk[i] != null)
					model.setLodgRmk(lodgRmk[i]);
				if (psptNo6[i] != null)
					model.setPsptNo6(psptNo6[i]);
				if (psptNo7[i] != null)
					model.setPsptNo7(psptNo7[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsJpVslVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsJpVslVO[]
	 */
	public BkgCstmsJpVslVO[] getBkgCstmsJpVslVOs(){
		BkgCstmsJpVslVO[] vos = (BkgCstmsJpVslVO[])models.toArray(new BkgCstmsJpVslVO[models.size()]);
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
		this.lodgPckQty = this.lodgPckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgFlg = this.lodgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtSkdDirCd = this.nxtSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nxtSkdVoyNo = this.nxtSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfRmk = this.mfRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.locCd = this.locCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgWgt = this.lodgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jpLodgCd = this.jpLodgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsPckTpCd = this.cstmsPckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlCrwKnt = this.ttlCrwKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.notEmbCrwQty = this.notEmbCrwQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.notAuthCrwQty = this.notAuthCrwQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.capNm = this.capNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.notCrwBkQty = this.notCrwBkQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo9 = this.psptNo9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo8 = this.psptNo8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo10 = this.psptNo10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsMfCd = this.cstmsMfCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.debkCrwQty = this.debkCrwQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo13 = this.psptNo13 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stClptCd = this.n1stClptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo14 = this.psptNo14 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo11 = this.psptNo11 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo12 = this.psptNo12 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dchgWgt = this.dchgWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgCmdtCtnt = this.lodgCmdtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portSkdDirCd = this.portSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo15 = this.psptNo15 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo16 = this.psptNo16 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portSkdVoyNo = this.portSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgRsnDesc = this.lodgRsnDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgRmk = this.lodgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo6 = this.psptNo6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psptNo7 = this.psptNo7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
