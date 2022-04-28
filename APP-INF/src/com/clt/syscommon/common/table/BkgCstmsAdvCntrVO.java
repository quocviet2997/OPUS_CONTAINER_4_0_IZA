/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsAdvCntrVO.java
*@FileTitle : BkgCstmsAdvCntrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.15
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2010.03.15 김민정 
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
 * @author 김민정
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsAdvCntrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvCntrVO> models = new ArrayList<BkgCstmsAdvCntrVO>();
	
	/* Column Info */
	private String arrGdt = null;
	/* Column Info */
	private String xptFlg = null;
	/* Column Info */
	private String cndIbdNoUpldId = null;
	/* Column Info */
	private String arrDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dtyFreeDt = null;
	/* Column Info */
	private String cgoArrAcptDt = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String prtFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String xptAcptDt = null;
	/* Column Info */
	private String pkupYdCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cnmvStsCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String wgtUtCd = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String ibdCntrStsCd = null;
	/* Column Info */
	private String xptDt = null;
	/* Column Info */
	private String pckTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String avalGdt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String usaIbTrspNo = null;
	/* Column Info */
	private String railCrrRefNo = null;
	/* Column Info */
	private String cndIbdNoUpldDt = null;
	/* Column Info */
	private String arrFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String avalDt = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String fullMtyCd = null;
	/* Column Info */
	private String grsWgt = null;
	/* Column Info */
	private String pkupNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvCntrVO() {}

	public BkgCstmsAdvCntrVO(String ibflag, String pagerows, String cntCd, String blNo, String cntrNo, String cntrTpszCd, String ibdCntrStsCd, String pkupNo, String railCrrRefNo, String usaIbTrspNo, String arrDt, String arrGdt, String dtyFreeDt, String cnmvStsCd, String ydCd, String cgoArrAcptDt, String xptDt, String xptAcptDt, String arrFlg, String xptFlg, String fullMtyCd, String pckQty, String pckTpCd, String grsWgt, String wgtUtCd, String avalDt, String avalGdt, String pkupYdCd, String cndIbdNoUpldId, String cndIbdNoUpldDt, String prtFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.arrGdt = arrGdt;
		this.xptFlg = xptFlg;
		this.cndIbdNoUpldId = cndIbdNoUpldId;
		this.arrDt = arrDt;
		this.creDt = creDt;
		this.dtyFreeDt = dtyFreeDt;
		this.cgoArrAcptDt = cgoArrAcptDt;
		this.blNo = blNo;
		this.prtFlg = prtFlg;
		this.pagerows = pagerows;
		this.xptAcptDt = xptAcptDt;
		this.pkupYdCd = pkupYdCd;
		this.ibflag = ibflag;
		this.cnmvStsCd = cnmvStsCd;
		this.cntrTpszCd = cntrTpszCd;
		this.cntCd = cntCd;
		this.wgtUtCd = wgtUtCd;
		this.pckQty = pckQty;
		this.ibdCntrStsCd = ibdCntrStsCd;
		this.xptDt = xptDt;
		this.pckTpCd = pckTpCd;
		this.updUsrId = updUsrId;
		this.avalGdt = avalGdt;
		this.updDt = updDt;
		this.usaIbTrspNo = usaIbTrspNo;
		this.railCrrRefNo = railCrrRefNo;
		this.cndIbdNoUpldDt = cndIbdNoUpldDt;
		this.arrFlg = arrFlg;
		this.creUsrId = creUsrId;
		this.avalDt = avalDt;
		this.ydCd = ydCd;
		this.cntrNo = cntrNo;
		this.fullMtyCd = fullMtyCd;
		this.grsWgt = grsWgt;
		this.pkupNo = pkupNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("arr_gdt", getArrGdt());
		this.hashColumns.put("xpt_flg", getXptFlg());
		this.hashColumns.put("cnd_ibd_no_upld_id", getCndIbdNoUpldId());
		this.hashColumns.put("arr_dt", getArrDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dty_free_dt", getDtyFreeDt());
		this.hashColumns.put("cgo_arr_acpt_dt", getCgoArrAcptDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("prt_flg", getPrtFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("xpt_acpt_dt", getXptAcptDt());
		this.hashColumns.put("pkup_yd_cd", getPkupYdCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnmv_sts_cd", getCnmvStsCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("wgt_ut_cd", getWgtUtCd());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("ibd_cntr_sts_cd", getIbdCntrStsCd());
		this.hashColumns.put("xpt_dt", getXptDt());
		this.hashColumns.put("pck_tp_cd", getPckTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("aval_gdt", getAvalGdt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("usa_ib_trsp_no", getUsaIbTrspNo());
		this.hashColumns.put("rail_crr_ref_no", getRailCrrRefNo());
		this.hashColumns.put("cnd_ibd_no_upld_dt", getCndIbdNoUpldDt());
		this.hashColumns.put("arr_flg", getArrFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("aval_dt", getAvalDt());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("full_mty_cd", getFullMtyCd());
		this.hashColumns.put("grs_wgt", getGrsWgt());
		this.hashColumns.put("pkup_no", getPkupNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("arr_gdt", "arrGdt");
		this.hashFields.put("xpt_flg", "xptFlg");
		this.hashFields.put("cnd_ibd_no_upld_id", "cndIbdNoUpldId");
		this.hashFields.put("arr_dt", "arrDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dty_free_dt", "dtyFreeDt");
		this.hashFields.put("cgo_arr_acpt_dt", "cgoArrAcptDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("prt_flg", "prtFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("xpt_acpt_dt", "xptAcptDt");
		this.hashFields.put("pkup_yd_cd", "pkupYdCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnmv_sts_cd", "cnmvStsCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("wgt_ut_cd", "wgtUtCd");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("ibd_cntr_sts_cd", "ibdCntrStsCd");
		this.hashFields.put("xpt_dt", "xptDt");
		this.hashFields.put("pck_tp_cd", "pckTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("aval_gdt", "avalGdt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("usa_ib_trsp_no", "usaIbTrspNo");
		this.hashFields.put("rail_crr_ref_no", "railCrrRefNo");
		this.hashFields.put("cnd_ibd_no_upld_dt", "cndIbdNoUpldDt");
		this.hashFields.put("arr_flg", "arrFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("aval_dt", "avalDt");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("full_mty_cd", "fullMtyCd");
		this.hashFields.put("grs_wgt", "grsWgt");
		this.hashFields.put("pkup_no", "pkupNo");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return arrGdt
	 */
	public String getArrGdt() {
		return this.arrGdt;
	}
	
	/**
	 * Column Info
	 * @return xptFlg
	 */
	public String getXptFlg() {
		return this.xptFlg;
	}
	
	/**
	 * Column Info
	 * @return cndIbdNoUpldId
	 */
	public String getCndIbdNoUpldId() {
		return this.cndIbdNoUpldId;
	}
	
	/**
	 * Column Info
	 * @return arrDt
	 */
	public String getArrDt() {
		return this.arrDt;
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
	 * @return dtyFreeDt
	 */
	public String getDtyFreeDt() {
		return this.dtyFreeDt;
	}
	
	/**
	 * Column Info
	 * @return cgoArrAcptDt
	 */
	public String getCgoArrAcptDt() {
		return this.cgoArrAcptDt;
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
	 * @return xptAcptDt
	 */
	public String getXptAcptDt() {
		return this.xptAcptDt;
	}
	
	/**
	 * Column Info
	 * @return pkupYdCd
	 */
	public String getPkupYdCd() {
		return this.pkupYdCd;
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
	 * @return cnmvStsCd
	 */
	public String getCnmvStsCd() {
		return this.cnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return ibdCntrStsCd
	 */
	public String getIbdCntrStsCd() {
		return this.ibdCntrStsCd;
	}
	
	/**
	 * Column Info
	 * @return xptDt
	 */
	public String getXptDt() {
		return this.xptDt;
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
	 * @return avalGdt
	 */
	public String getAvalGdt() {
		return this.avalGdt;
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
	 * @return usaIbTrspNo
	 */
	public String getUsaIbTrspNo() {
		return this.usaIbTrspNo;
	}
	
	/**
	 * Column Info
	 * @return railCrrRefNo
	 */
	public String getRailCrrRefNo() {
		return this.railCrrRefNo;
	}
	
	/**
	 * Column Info
	 * @return cndIbdNoUpldDt
	 */
	public String getCndIbdNoUpldDt() {
		return this.cndIbdNoUpldDt;
	}
	
	/**
	 * Column Info
	 * @return arrFlg
	 */
	public String getArrFlg() {
		return this.arrFlg;
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
	 * @return avalDt
	 */
	public String getAvalDt() {
		return this.avalDt;
	}
	
	/**
	 * Column Info
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
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
	 * @return fullMtyCd
	 */
	public String getFullMtyCd() {
		return this.fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @return grsWgt
	 */
	public String getGrsWgt() {
		return this.grsWgt;
	}
	
	/**
	 * Column Info
	 * @return pkupNo
	 */
	public String getPkupNo() {
		return this.pkupNo;
	}
	

	/**
	 * Column Info
	 * @param arrGdt
	 */
	public void setArrGdt(String arrGdt) {
		this.arrGdt = arrGdt;
	}
	
	/**
	 * Column Info
	 * @param xptFlg
	 */
	public void setXptFlg(String xptFlg) {
		this.xptFlg = xptFlg;
	}
	
	/**
	 * Column Info
	 * @param cndIbdNoUpldId
	 */
	public void setCndIbdNoUpldId(String cndIbdNoUpldId) {
		this.cndIbdNoUpldId = cndIbdNoUpldId;
	}
	
	/**
	 * Column Info
	 * @param arrDt
	 */
	public void setArrDt(String arrDt) {
		this.arrDt = arrDt;
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
	 * @param dtyFreeDt
	 */
	public void setDtyFreeDt(String dtyFreeDt) {
		this.dtyFreeDt = dtyFreeDt;
	}
	
	/**
	 * Column Info
	 * @param cgoArrAcptDt
	 */
	public void setCgoArrAcptDt(String cgoArrAcptDt) {
		this.cgoArrAcptDt = cgoArrAcptDt;
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
	 * @param xptAcptDt
	 */
	public void setXptAcptDt(String xptAcptDt) {
		this.xptAcptDt = xptAcptDt;
	}
	
	/**
	 * Column Info
	 * @param pkupYdCd
	 */
	public void setPkupYdCd(String pkupYdCd) {
		this.pkupYdCd = pkupYdCd;
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
	 * @param cnmvStsCd
	 */
	public void setCnmvStsCd(String cnmvStsCd) {
		this.cnmvStsCd = cnmvStsCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param ibdCntrStsCd
	 */
	public void setIbdCntrStsCd(String ibdCntrStsCd) {
		this.ibdCntrStsCd = ibdCntrStsCd;
	}
	
	/**
	 * Column Info
	 * @param xptDt
	 */
	public void setXptDt(String xptDt) {
		this.xptDt = xptDt;
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
	 * @param avalGdt
	 */
	public void setAvalGdt(String avalGdt) {
		this.avalGdt = avalGdt;
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
	 * @param usaIbTrspNo
	 */
	public void setUsaIbTrspNo(String usaIbTrspNo) {
		this.usaIbTrspNo = usaIbTrspNo;
	}
	
	/**
	 * Column Info
	 * @param railCrrRefNo
	 */
	public void setRailCrrRefNo(String railCrrRefNo) {
		this.railCrrRefNo = railCrrRefNo;
	}
	
	/**
	 * Column Info
	 * @param cndIbdNoUpldDt
	 */
	public void setCndIbdNoUpldDt(String cndIbdNoUpldDt) {
		this.cndIbdNoUpldDt = cndIbdNoUpldDt;
	}
	
	/**
	 * Column Info
	 * @param arrFlg
	 */
	public void setArrFlg(String arrFlg) {
		this.arrFlg = arrFlg;
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
	 * @param avalDt
	 */
	public void setAvalDt(String avalDt) {
		this.avalDt = avalDt;
	}
	
	/**
	 * Column Info
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
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
	 * @param fullMtyCd
	 */
	public void setFullMtyCd(String fullMtyCd) {
		this.fullMtyCd = fullMtyCd;
	}
	
	/**
	 * Column Info
	 * @param grsWgt
	 */
	public void setGrsWgt(String grsWgt) {
		this.grsWgt = grsWgt;
	}
	
	/**
	 * Column Info
	 * @param pkupNo
	 */
	public void setPkupNo(String pkupNo) {
		this.pkupNo = pkupNo;
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
		setArrGdt(JSPUtil.getParameter(request, prefix + "arr_gdt", ""));
		setXptFlg(JSPUtil.getParameter(request, prefix + "xpt_flg", ""));
		setCndIbdNoUpldId(JSPUtil.getParameter(request, prefix + "cnd_ibd_no_upld_id", ""));
		setArrDt(JSPUtil.getParameter(request, prefix + "arr_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setDtyFreeDt(JSPUtil.getParameter(request, prefix + "dty_free_dt", ""));
		setCgoArrAcptDt(JSPUtil.getParameter(request, prefix + "cgo_arr_acpt_dt", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setPrtFlg(JSPUtil.getParameter(request, prefix + "prt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setXptAcptDt(JSPUtil.getParameter(request, prefix + "xpt_acpt_dt", ""));
		setPkupYdCd(JSPUtil.getParameter(request, prefix + "pkup_yd_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCnmvStsCd(JSPUtil.getParameter(request, prefix + "cnmv_sts_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, prefix + "cntr_tpsz_cd", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setWgtUtCd(JSPUtil.getParameter(request, prefix + "wgt_ut_cd", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setIbdCntrStsCd(JSPUtil.getParameter(request, prefix + "ibd_cntr_sts_cd", ""));
		setXptDt(JSPUtil.getParameter(request, prefix + "xpt_dt", ""));
		setPckTpCd(JSPUtil.getParameter(request, prefix + "pck_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setAvalGdt(JSPUtil.getParameter(request, prefix + "aval_gdt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setUsaIbTrspNo(JSPUtil.getParameter(request, prefix + "usa_ib_trsp_no", ""));
		setRailCrrRefNo(JSPUtil.getParameter(request, prefix + "rail_crr_ref_no", ""));
		setCndIbdNoUpldDt(JSPUtil.getParameter(request, prefix + "cnd_ibd_no_upld_dt", ""));
		setArrFlg(JSPUtil.getParameter(request, prefix + "arr_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setAvalDt(JSPUtil.getParameter(request, prefix + "aval_dt", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setFullMtyCd(JSPUtil.getParameter(request, prefix + "full_mty_cd", ""));
		setGrsWgt(JSPUtil.getParameter(request, prefix + "grs_wgt", ""));
		setPkupNo(JSPUtil.getParameter(request, prefix + "pkup_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsAdvCntrVO[]
	 */
	public BkgCstmsAdvCntrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsAdvCntrVO[]
	 */
	public BkgCstmsAdvCntrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvCntrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] arrGdt = (JSPUtil.getParameter(request, prefix	+ "arr_gdt", length));
			String[] xptFlg = (JSPUtil.getParameter(request, prefix	+ "xpt_flg", length));
			String[] cndIbdNoUpldId = (JSPUtil.getParameter(request, prefix	+ "cnd_ibd_no_upld_id", length));
			String[] arrDt = (JSPUtil.getParameter(request, prefix	+ "arr_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dtyFreeDt = (JSPUtil.getParameter(request, prefix	+ "dty_free_dt", length));
			String[] cgoArrAcptDt = (JSPUtil.getParameter(request, prefix	+ "cgo_arr_acpt_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] prtFlg = (JSPUtil.getParameter(request, prefix	+ "prt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] xptAcptDt = (JSPUtil.getParameter(request, prefix	+ "xpt_acpt_dt", length));
			String[] pkupYdCd = (JSPUtil.getParameter(request, prefix	+ "pkup_yd_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cnmvStsCd = (JSPUtil.getParameter(request, prefix	+ "cnmv_sts_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] wgtUtCd = (JSPUtil.getParameter(request, prefix	+ "wgt_ut_cd", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] ibdCntrStsCd = (JSPUtil.getParameter(request, prefix	+ "ibd_cntr_sts_cd", length));
			String[] xptDt = (JSPUtil.getParameter(request, prefix	+ "xpt_dt", length));
			String[] pckTpCd = (JSPUtil.getParameter(request, prefix	+ "pck_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] avalGdt = (JSPUtil.getParameter(request, prefix	+ "aval_gdt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] usaIbTrspNo = (JSPUtil.getParameter(request, prefix	+ "usa_ib_trsp_no", length));
			String[] railCrrRefNo = (JSPUtil.getParameter(request, prefix	+ "rail_crr_ref_no", length));
			String[] cndIbdNoUpldDt = (JSPUtil.getParameter(request, prefix	+ "cnd_ibd_no_upld_dt", length));
			String[] arrFlg = (JSPUtil.getParameter(request, prefix	+ "arr_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] avalDt = (JSPUtil.getParameter(request, prefix	+ "aval_dt", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] fullMtyCd = (JSPUtil.getParameter(request, prefix	+ "full_mty_cd", length));
			String[] grsWgt = (JSPUtil.getParameter(request, prefix	+ "grs_wgt", length));
			String[] pkupNo = (JSPUtil.getParameter(request, prefix	+ "pkup_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvCntrVO();
				if (arrGdt[i] != null)
					model.setArrGdt(arrGdt[i]);
				if (xptFlg[i] != null)
					model.setXptFlg(xptFlg[i]);
				if (cndIbdNoUpldId[i] != null)
					model.setCndIbdNoUpldId(cndIbdNoUpldId[i]);
				if (arrDt[i] != null)
					model.setArrDt(arrDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dtyFreeDt[i] != null)
					model.setDtyFreeDt(dtyFreeDt[i]);
				if (cgoArrAcptDt[i] != null)
					model.setCgoArrAcptDt(cgoArrAcptDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (prtFlg[i] != null)
					model.setPrtFlg(prtFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (xptAcptDt[i] != null)
					model.setXptAcptDt(xptAcptDt[i]);
				if (pkupYdCd[i] != null)
					model.setPkupYdCd(pkupYdCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cnmvStsCd[i] != null)
					model.setCnmvStsCd(cnmvStsCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (wgtUtCd[i] != null)
					model.setWgtUtCd(wgtUtCd[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (ibdCntrStsCd[i] != null)
					model.setIbdCntrStsCd(ibdCntrStsCd[i]);
				if (xptDt[i] != null)
					model.setXptDt(xptDt[i]);
				if (pckTpCd[i] != null)
					model.setPckTpCd(pckTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (avalGdt[i] != null)
					model.setAvalGdt(avalGdt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (usaIbTrspNo[i] != null)
					model.setUsaIbTrspNo(usaIbTrspNo[i]);
				if (railCrrRefNo[i] != null)
					model.setRailCrrRefNo(railCrrRefNo[i]);
				if (cndIbdNoUpldDt[i] != null)
					model.setCndIbdNoUpldDt(cndIbdNoUpldDt[i]);
				if (arrFlg[i] != null)
					model.setArrFlg(arrFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (avalDt[i] != null)
					model.setAvalDt(avalDt[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (fullMtyCd[i] != null)
					model.setFullMtyCd(fullMtyCd[i]);
				if (grsWgt[i] != null)
					model.setGrsWgt(grsWgt[i]);
				if (pkupNo[i] != null)
					model.setPkupNo(pkupNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvCntrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsAdvCntrVO[]
	 */
	public BkgCstmsAdvCntrVO[] getBkgCstmsAdvCntrVOs(){
		BkgCstmsAdvCntrVO[] vos = (BkgCstmsAdvCntrVO[])models.toArray(new BkgCstmsAdvCntrVO[models.size()]);
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
		this.arrGdt = this.arrGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptFlg = this.xptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndIbdNoUpldId = this.cndIbdNoUpldId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrDt = this.arrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtyFreeDt = this.dtyFreeDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cgoArrAcptDt = this.cgoArrAcptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prtFlg = this.prtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptAcptDt = this.xptAcptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupYdCd = this.pkupYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cnmvStsCd = this.cnmvStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wgtUtCd = this.wgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdCntrStsCd = this.ibdCntrStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xptDt = this.xptDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckTpCd = this.pckTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalGdt = this.avalGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usaIbTrspNo = this.usaIbTrspNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railCrrRefNo = this.railCrrRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cndIbdNoUpldDt = this.cndIbdNoUpldDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrFlg = this.arrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalDt = this.avalDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullMtyCd = this.fullMtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgt = this.grsWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNo = this.pkupNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
