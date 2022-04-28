/*=========================================================
*Copyright(c) 2015 CyberLogitec
*@FileName : BkgCstmsTmlCllDgCgoVO.java
*@FileTitle : BkgCstmsTmlCllDgCgoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2015.11.01
*@LastModifier : 
*@LastVersion : 1.0
* 2015.11.01  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
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

public class BkgCstmsTmlCllDgCgoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsTmlCllDgCgoVO> models = new ArrayList<BkgCstmsTmlCllDgCgoVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String emerCntcPhnNo = null;
	/* Column Info */
	private String dcgoRefNo = null;
	/* Column Info */
	private String dgLblCd = null;
	/* Column Info */
	private String flshPntCdoTemp = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String emerCntcPsonNm = null;
	/* Column Info */
	private String netWgtUtCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dgPckGrpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String emerPrcNo = null;
	/* Column Info */
	private String measQty = null;
	/* Column Info */
	private String grsWgtUtCd = null;
	/* Column Info */
	private String grsCntrWgt = null;
	/* Column Info */
	private String cllDgSeq = null;
	/* Column Info */
	private String pckQty = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String measUtCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String imdgUnNo = null;
	/* Column Info */
	private String dgLblDesc = null;
	/* Column Info */
	private String dgCntrSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dgRmk = null;
	/* Column Info */
	private String netWgt = null;
	/* Column Info */
	private String polutFlg = null;
	/* Column Info */
	private String imdgPgNo = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String aplyNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String hzdCtnt = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String dgDesc = null;
	/* Column Info */
	private String cntrLodgNo = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String tmlPckUtId = null;
	/* Column Info */
	private String stwgDesc = null;
	/* Column Info */
	private String imdgClssCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public BkgCstmsTmlCllDgCgoVO() {}

	public BkgCstmsTmlCllDgCgoVO(String ibflag, String pagerows, String vslCd, String skdVoyNo, String skdDirCd, String portCd, String bkgNo, String cntrNo, String cntrLodgNo, String cllDgSeq, String imdgUnNo, String imdgClssCd, String dgDesc, String emerCntcPhnNo, String imdgPgNo, String flshPntCdoTemp, String dgRmk, String emerPrcNo, String dgPckGrpCd, String polutFlg, String dgLblCd, String dgLblDesc, String pckQty, String tmlPckUtId, String netWgt, String netWgtUtCd, String grsCntrWgt, String grsWgtUtCd, String measQty, String measUtCd, String hzdCtnt, String stwgDesc, String creUsrId, String creDt, String updUsrId, String updDt, String dgCntrSeq, String emerCntcPsonNm, String edwUpdDt, String aplyNo, String dcgoRefNo) {
		this.vslCd = vslCd;
		this.emerCntcPhnNo = emerCntcPhnNo;
		this.dcgoRefNo = dcgoRefNo;
		this.dgLblCd = dgLblCd;
		this.flshPntCdoTemp = flshPntCdoTemp;
		this.creDt = creDt;
		this.emerCntcPsonNm = emerCntcPsonNm;
		this.netWgtUtCd = netWgtUtCd;
		this.edwUpdDt = edwUpdDt;
		this.pagerows = pagerows;
		this.dgPckGrpCd = dgPckGrpCd;
		this.ibflag = ibflag;
		this.emerPrcNo = emerPrcNo;
		this.measQty = measQty;
		this.grsWgtUtCd = grsWgtUtCd;
		this.grsCntrWgt = grsCntrWgt;
		this.cllDgSeq = cllDgSeq;
		this.pckQty = pckQty;
		this.portCd = portCd;
		this.measUtCd = measUtCd;
		this.updUsrId = updUsrId;
		this.imdgUnNo = imdgUnNo;
		this.dgLblDesc = dgLblDesc;
		this.dgCntrSeq = dgCntrSeq;
		this.updDt = updDt;
		this.dgRmk = dgRmk;
		this.netWgt = netWgt;
		this.polutFlg = polutFlg;
		this.imdgPgNo = imdgPgNo;
		this.skdVoyNo = skdVoyNo;
		this.skdDirCd = skdDirCd;
		this.aplyNo = aplyNo;
		this.creUsrId = creUsrId;
		this.hzdCtnt = hzdCtnt;
		this.bkgNo = bkgNo;
		this.dgDesc = dgDesc;
		this.cntrLodgNo = cntrLodgNo;
		this.cntrNo = cntrNo;
		this.tmlPckUtId = tmlPckUtId;
		this.stwgDesc = stwgDesc;
		this.imdgClssCd = imdgClssCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("emer_cntc_phn_no", getEmerCntcPhnNo());
		this.hashColumns.put("dcgo_ref_no", getDcgoRefNo());
		this.hashColumns.put("dg_lbl_cd", getDgLblCd());
		this.hashColumns.put("flsh_pnt_cdo_temp", getFlshPntCdoTemp());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("emer_cntc_pson_nm", getEmerCntcPsonNm());
		this.hashColumns.put("net_wgt_ut_cd", getNetWgtUtCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dg_pck_grp_cd", getDgPckGrpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("emer_prc_no", getEmerPrcNo());
		this.hashColumns.put("meas_qty", getMeasQty());
		this.hashColumns.put("grs_wgt_ut_cd", getGrsWgtUtCd());
		this.hashColumns.put("grs_cntr_wgt", getGrsCntrWgt());
		this.hashColumns.put("cll_dg_seq", getCllDgSeq());
		this.hashColumns.put("pck_qty", getPckQty());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("meas_ut_cd", getMeasUtCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("imdg_un_no", getImdgUnNo());
		this.hashColumns.put("dg_lbl_desc", getDgLblDesc());
		this.hashColumns.put("dg_cntr_seq", getDgCntrSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dg_rmk", getDgRmk());
		this.hashColumns.put("net_wgt", getNetWgt());
		this.hashColumns.put("polut_flg", getPolutFlg());
		this.hashColumns.put("imdg_pg_no", getImdgPgNo());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("aply_no", getAplyNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hzd_ctnt", getHzdCtnt());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("dg_desc", getDgDesc());
		this.hashColumns.put("cntr_lodg_no", getCntrLodgNo());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("tml_pck_ut_id", getTmlPckUtId());
		this.hashColumns.put("stwg_desc", getStwgDesc());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("emer_cntc_phn_no", "emerCntcPhnNo");
		this.hashFields.put("dcgo_ref_no", "dcgoRefNo");
		this.hashFields.put("dg_lbl_cd", "dgLblCd");
		this.hashFields.put("flsh_pnt_cdo_temp", "flshPntCdoTemp");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("emer_cntc_pson_nm", "emerCntcPsonNm");
		this.hashFields.put("net_wgt_ut_cd", "netWgtUtCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dg_pck_grp_cd", "dgPckGrpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("emer_prc_no", "emerPrcNo");
		this.hashFields.put("meas_qty", "measQty");
		this.hashFields.put("grs_wgt_ut_cd", "grsWgtUtCd");
		this.hashFields.put("grs_cntr_wgt", "grsCntrWgt");
		this.hashFields.put("cll_dg_seq", "cllDgSeq");
		this.hashFields.put("pck_qty", "pckQty");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("meas_ut_cd", "measUtCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("imdg_un_no", "imdgUnNo");
		this.hashFields.put("dg_lbl_desc", "dgLblDesc");
		this.hashFields.put("dg_cntr_seq", "dgCntrSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dg_rmk", "dgRmk");
		this.hashFields.put("net_wgt", "netWgt");
		this.hashFields.put("polut_flg", "polutFlg");
		this.hashFields.put("imdg_pg_no", "imdgPgNo");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("aply_no", "aplyNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hzd_ctnt", "hzdCtnt");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("dg_desc", "dgDesc");
		this.hashFields.put("cntr_lodg_no", "cntrLodgNo");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("tml_pck_ut_id", "tmlPckUtId");
		this.hashFields.put("stwg_desc", "stwgDesc");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		return this.hashFields;
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
	 * @return emerCntcPhnNo
	 */
	public String getEmerCntcPhnNo() {
		return this.emerCntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @return dcgoRefNo
	 */
	public String getDcgoRefNo() {
		return this.dcgoRefNo;
	}
	
	/**
	 * Column Info
	 * @return dgLblCd
	 */
	public String getDgLblCd() {
		return this.dgLblCd;
	}
	
	/**
	 * Column Info
	 * @return flshPntCdoTemp
	 */
	public String getFlshPntCdoTemp() {
		return this.flshPntCdoTemp;
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
	 * @return emerCntcPsonNm
	 */
	public String getEmerCntcPsonNm() {
		return this.emerCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return netWgtUtCd
	 */
	public String getNetWgtUtCd() {
		return this.netWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
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
	 * @return dgPckGrpCd
	 */
	public String getDgPckGrpCd() {
		return this.dgPckGrpCd;
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
	 * @return emerPrcNo
	 */
	public String getEmerPrcNo() {
		return this.emerPrcNo;
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
	 * @return grsWgtUtCd
	 */
	public String getGrsWgtUtCd() {
		return this.grsWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @return grsCntrWgt
	 */
	public String getGrsCntrWgt() {
		return this.grsCntrWgt;
	}
	
	/**
	 * Column Info
	 * @return cllDgSeq
	 */
	public String getCllDgSeq() {
		return this.cllDgSeq;
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
	 * @return portCd
	 */
	public String getPortCd() {
		return this.portCd;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return imdgUnNo
	 */
	public String getImdgUnNo() {
		return this.imdgUnNo;
	}
	
	/**
	 * Column Info
	 * @return dgLblDesc
	 */
	public String getDgLblDesc() {
		return this.dgLblDesc;
	}
	
	/**
	 * Column Info
	 * @return dgCntrSeq
	 */
	public String getDgCntrSeq() {
		return this.dgCntrSeq;
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
	 * @return dgRmk
	 */
	public String getDgRmk() {
		return this.dgRmk;
	}
	
	/**
	 * Column Info
	 * @return netWgt
	 */
	public String getNetWgt() {
		return this.netWgt;
	}
	
	/**
	 * Column Info
	 * @return polutFlg
	 */
	public String getPolutFlg() {
		return this.polutFlg;
	}
	
	/**
	 * Column Info
	 * @return imdgPgNo
	 */
	public String getImdgPgNo() {
		return this.imdgPgNo;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
	}
	
	/**
	 * Column Info
	 * @return aplyNo
	 */
	public String getAplyNo() {
		return this.aplyNo;
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
	 * @return hzdCtnt
	 */
	public String getHzdCtnt() {
		return this.hzdCtnt;
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
	 * @return dgDesc
	 */
	public String getDgDesc() {
		return this.dgDesc;
	}
	
	/**
	 * Column Info
	 * @return cntrLodgNo
	 */
	public String getCntrLodgNo() {
		return this.cntrLodgNo;
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
	 * @return tmlPckUtId
	 */
	public String getTmlPckUtId() {
		return this.tmlPckUtId;
	}
	
	/**
	 * Column Info
	 * @return stwgDesc
	 */
	public String getStwgDesc() {
		return this.stwgDesc;
	}
	
	/**
	 * Column Info
	 * @return imdgClssCd
	 */
	public String getImdgClssCd() {
		return this.imdgClssCd;
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
	 * @param emerCntcPhnNo
	 */
	public void setEmerCntcPhnNo(String emerCntcPhnNo) {
		this.emerCntcPhnNo = emerCntcPhnNo;
	}
	
	/**
	 * Column Info
	 * @param dcgoRefNo
	 */
	public void setDcgoRefNo(String dcgoRefNo) {
		this.dcgoRefNo = dcgoRefNo;
	}
	
	/**
	 * Column Info
	 * @param dgLblCd
	 */
	public void setDgLblCd(String dgLblCd) {
		this.dgLblCd = dgLblCd;
	}
	
	/**
	 * Column Info
	 * @param flshPntCdoTemp
	 */
	public void setFlshPntCdoTemp(String flshPntCdoTemp) {
		this.flshPntCdoTemp = flshPntCdoTemp;
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
	 * @param emerCntcPsonNm
	 */
	public void setEmerCntcPsonNm(String emerCntcPsonNm) {
		this.emerCntcPsonNm = emerCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param netWgtUtCd
	 */
	public void setNetWgtUtCd(String netWgtUtCd) {
		this.netWgtUtCd = netWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
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
	 * @param dgPckGrpCd
	 */
	public void setDgPckGrpCd(String dgPckGrpCd) {
		this.dgPckGrpCd = dgPckGrpCd;
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
	 * @param emerPrcNo
	 */
	public void setEmerPrcNo(String emerPrcNo) {
		this.emerPrcNo = emerPrcNo;
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
	 * @param grsWgtUtCd
	 */
	public void setGrsWgtUtCd(String grsWgtUtCd) {
		this.grsWgtUtCd = grsWgtUtCd;
	}
	
	/**
	 * Column Info
	 * @param grsCntrWgt
	 */
	public void setGrsCntrWgt(String grsCntrWgt) {
		this.grsCntrWgt = grsCntrWgt;
	}
	
	/**
	 * Column Info
	 * @param cllDgSeq
	 */
	public void setCllDgSeq(String cllDgSeq) {
		this.cllDgSeq = cllDgSeq;
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
	 * @param portCd
	 */
	public void setPortCd(String portCd) {
		this.portCd = portCd;
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
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Column Info
	 * @param imdgUnNo
	 */
	public void setImdgUnNo(String imdgUnNo) {
		this.imdgUnNo = imdgUnNo;
	}
	
	/**
	 * Column Info
	 * @param dgLblDesc
	 */
	public void setDgLblDesc(String dgLblDesc) {
		this.dgLblDesc = dgLblDesc;
	}
	
	/**
	 * Column Info
	 * @param dgCntrSeq
	 */
	public void setDgCntrSeq(String dgCntrSeq) {
		this.dgCntrSeq = dgCntrSeq;
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
	 * @param dgRmk
	 */
	public void setDgRmk(String dgRmk) {
		this.dgRmk = dgRmk;
	}
	
	/**
	 * Column Info
	 * @param netWgt
	 */
	public void setNetWgt(String netWgt) {
		this.netWgt = netWgt;
	}
	
	/**
	 * Column Info
	 * @param polutFlg
	 */
	public void setPolutFlg(String polutFlg) {
		this.polutFlg = polutFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgPgNo
	 */
	public void setImdgPgNo(String imdgPgNo) {
		this.imdgPgNo = imdgPgNo;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
	}
	
	/**
	 * Column Info
	 * @param aplyNo
	 */
	public void setAplyNo(String aplyNo) {
		this.aplyNo = aplyNo;
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
	 * @param hzdCtnt
	 */
	public void setHzdCtnt(String hzdCtnt) {
		this.hzdCtnt = hzdCtnt;
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
	 * @param dgDesc
	 */
	public void setDgDesc(String dgDesc) {
		this.dgDesc = dgDesc;
	}
	
	/**
	 * Column Info
	 * @param cntrLodgNo
	 */
	public void setCntrLodgNo(String cntrLodgNo) {
		this.cntrLodgNo = cntrLodgNo;
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
	 * @param tmlPckUtId
	 */
	public void setTmlPckUtId(String tmlPckUtId) {
		this.tmlPckUtId = tmlPckUtId;
	}
	
	/**
	 * Column Info
	 * @param stwgDesc
	 */
	public void setStwgDesc(String stwgDesc) {
		this.stwgDesc = stwgDesc;
	}
	
	/**
	 * Column Info
	 * @param imdgClssCd
	 */
	public void setImdgClssCd(String imdgClssCd) {
		this.imdgClssCd = imdgClssCd;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setEmerCntcPhnNo(JSPUtil.getParameter(request, prefix + "emer_cntc_phn_no", ""));
		setDcgoRefNo(JSPUtil.getParameter(request, prefix + "dcgo_ref_no", ""));
		setDgLblCd(JSPUtil.getParameter(request, prefix + "dg_lbl_cd", ""));
		setFlshPntCdoTemp(JSPUtil.getParameter(request, prefix + "flsh_pnt_cdo_temp", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEmerCntcPsonNm(JSPUtil.getParameter(request, prefix + "emer_cntc_pson_nm", ""));
		setNetWgtUtCd(JSPUtil.getParameter(request, prefix + "net_wgt_ut_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setDgPckGrpCd(JSPUtil.getParameter(request, prefix + "dg_pck_grp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEmerPrcNo(JSPUtil.getParameter(request, prefix + "emer_prc_no", ""));
		setMeasQty(JSPUtil.getParameter(request, prefix + "meas_qty", ""));
		setGrsWgtUtCd(JSPUtil.getParameter(request, prefix + "grs_wgt_ut_cd", ""));
		setGrsCntrWgt(JSPUtil.getParameter(request, prefix + "grs_cntr_wgt", ""));
		setCllDgSeq(JSPUtil.getParameter(request, prefix + "cll_dg_seq", ""));
		setPckQty(JSPUtil.getParameter(request, prefix + "pck_qty", ""));
		setPortCd(JSPUtil.getParameter(request, prefix + "port_cd", ""));
		setMeasUtCd(JSPUtil.getParameter(request, prefix + "meas_ut_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setImdgUnNo(JSPUtil.getParameter(request, prefix + "imdg_un_no", ""));
		setDgLblDesc(JSPUtil.getParameter(request, prefix + "dg_lbl_desc", ""));
		setDgCntrSeq(JSPUtil.getParameter(request, prefix + "dg_cntr_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setDgRmk(JSPUtil.getParameter(request, prefix + "dg_rmk", ""));
		setNetWgt(JSPUtil.getParameter(request, prefix + "net_wgt", ""));
		setPolutFlg(JSPUtil.getParameter(request, prefix + "polut_flg", ""));
		setImdgPgNo(JSPUtil.getParameter(request, prefix + "imdg_pg_no", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, prefix + "skd_voy_no", ""));
		setSkdDirCd(JSPUtil.getParameter(request, prefix + "skd_dir_cd", ""));
		setAplyNo(JSPUtil.getParameter(request, prefix + "aply_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setHzdCtnt(JSPUtil.getParameter(request, prefix + "hzd_ctnt", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setDgDesc(JSPUtil.getParameter(request, prefix + "dg_desc", ""));
		setCntrLodgNo(JSPUtil.getParameter(request, prefix + "cntr_lodg_no", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setTmlPckUtId(JSPUtil.getParameter(request, prefix + "tml_pck_ut_id", ""));
		setStwgDesc(JSPUtil.getParameter(request, prefix + "stwg_desc", ""));
		setImdgClssCd(JSPUtil.getParameter(request, prefix + "imdg_clss_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsTmlCllDgCgoVO[]
	 */
	public BkgCstmsTmlCllDgCgoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsTmlCllDgCgoVO[]
	 */
	public BkgCstmsTmlCllDgCgoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsTmlCllDgCgoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] emerCntcPhnNo = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_phn_no", length));
			String[] dcgoRefNo = (JSPUtil.getParameter(request, prefix	+ "dcgo_ref_no", length));
			String[] dgLblCd = (JSPUtil.getParameter(request, prefix	+ "dg_lbl_cd", length));
			String[] flshPntCdoTemp = (JSPUtil.getParameter(request, prefix	+ "flsh_pnt_cdo_temp", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] emerCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "emer_cntc_pson_nm", length));
			String[] netWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "net_wgt_ut_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] dgPckGrpCd = (JSPUtil.getParameter(request, prefix	+ "dg_pck_grp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] emerPrcNo = (JSPUtil.getParameter(request, prefix	+ "emer_prc_no", length));
			String[] measQty = (JSPUtil.getParameter(request, prefix	+ "meas_qty", length));
			String[] grsWgtUtCd = (JSPUtil.getParameter(request, prefix	+ "grs_wgt_ut_cd", length));
			String[] grsCntrWgt = (JSPUtil.getParameter(request, prefix	+ "grs_cntr_wgt", length));
			String[] cllDgSeq = (JSPUtil.getParameter(request, prefix	+ "cll_dg_seq", length));
			String[] pckQty = (JSPUtil.getParameter(request, prefix	+ "pck_qty", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] measUtCd = (JSPUtil.getParameter(request, prefix	+ "meas_ut_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] imdgUnNo = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no", length));
			String[] dgLblDesc = (JSPUtil.getParameter(request, prefix	+ "dg_lbl_desc", length));
			String[] dgCntrSeq = (JSPUtil.getParameter(request, prefix	+ "dg_cntr_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dgRmk = (JSPUtil.getParameter(request, prefix	+ "dg_rmk", length));
			String[] netWgt = (JSPUtil.getParameter(request, prefix	+ "net_wgt", length));
			String[] polutFlg = (JSPUtil.getParameter(request, prefix	+ "polut_flg", length));
			String[] imdgPgNo = (JSPUtil.getParameter(request, prefix	+ "imdg_pg_no", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] aplyNo = (JSPUtil.getParameter(request, prefix	+ "aply_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] hzdCtnt = (JSPUtil.getParameter(request, prefix	+ "hzd_ctnt", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] dgDesc = (JSPUtil.getParameter(request, prefix	+ "dg_desc", length));
			String[] cntrLodgNo = (JSPUtil.getParameter(request, prefix	+ "cntr_lodg_no", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] tmlPckUtId = (JSPUtil.getParameter(request, prefix	+ "tml_pck_ut_id", length));
			String[] stwgDesc = (JSPUtil.getParameter(request, prefix	+ "stwg_desc", length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsTmlCllDgCgoVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (emerCntcPhnNo[i] != null)
					model.setEmerCntcPhnNo(emerCntcPhnNo[i]);
				if (dcgoRefNo[i] != null)
					model.setDcgoRefNo(dcgoRefNo[i]);
				if (dgLblCd[i] != null)
					model.setDgLblCd(dgLblCd[i]);
				if (flshPntCdoTemp[i] != null)
					model.setFlshPntCdoTemp(flshPntCdoTemp[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (emerCntcPsonNm[i] != null)
					model.setEmerCntcPsonNm(emerCntcPsonNm[i]);
				if (netWgtUtCd[i] != null)
					model.setNetWgtUtCd(netWgtUtCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dgPckGrpCd[i] != null)
					model.setDgPckGrpCd(dgPckGrpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (emerPrcNo[i] != null)
					model.setEmerPrcNo(emerPrcNo[i]);
				if (measQty[i] != null)
					model.setMeasQty(measQty[i]);
				if (grsWgtUtCd[i] != null)
					model.setGrsWgtUtCd(grsWgtUtCd[i]);
				if (grsCntrWgt[i] != null)
					model.setGrsCntrWgt(grsCntrWgt[i]);
				if (cllDgSeq[i] != null)
					model.setCllDgSeq(cllDgSeq[i]);
				if (pckQty[i] != null)
					model.setPckQty(pckQty[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (measUtCd[i] != null)
					model.setMeasUtCd(measUtCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (imdgUnNo[i] != null)
					model.setImdgUnNo(imdgUnNo[i]);
				if (dgLblDesc[i] != null)
					model.setDgLblDesc(dgLblDesc[i]);
				if (dgCntrSeq[i] != null)
					model.setDgCntrSeq(dgCntrSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dgRmk[i] != null)
					model.setDgRmk(dgRmk[i]);
				if (netWgt[i] != null)
					model.setNetWgt(netWgt[i]);
				if (polutFlg[i] != null)
					model.setPolutFlg(polutFlg[i]);
				if (imdgPgNo[i] != null)
					model.setImdgPgNo(imdgPgNo[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (aplyNo[i] != null)
					model.setAplyNo(aplyNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hzdCtnt[i] != null)
					model.setHzdCtnt(hzdCtnt[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (dgDesc[i] != null)
					model.setDgDesc(dgDesc[i]);
				if (cntrLodgNo[i] != null)
					model.setCntrLodgNo(cntrLodgNo[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (tmlPckUtId[i] != null)
					model.setTmlPckUtId(tmlPckUtId[i]);
				if (stwgDesc[i] != null)
					model.setStwgDesc(stwgDesc[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsTmlCllDgCgoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsTmlCllDgCgoVO[]
	 */
	public BkgCstmsTmlCllDgCgoVO[] getBkgCstmsTmlCllDgCgoVOs(){
		BkgCstmsTmlCllDgCgoVO[] vos = (BkgCstmsTmlCllDgCgoVO[])models.toArray(new BkgCstmsTmlCllDgCgoVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPhnNo = this.emerCntcPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dcgoRefNo = this.dcgoRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgLblCd = this.dgLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.flshPntCdoTemp = this.flshPntCdoTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerCntcPsonNm = this.emerCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWgtUtCd = this.netWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgPckGrpCd = this.dgPckGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emerPrcNo = this.emerPrcNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measQty = this.measQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsWgtUtCd = this.grsWgtUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grsCntrWgt = this.grsCntrWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cllDgSeq = this.cllDgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pckQty = this.pckQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.measUtCd = this.measUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNo = this.imdgUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgLblDesc = this.dgLblDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgCntrSeq = this.dgCntrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgRmk = this.dgRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netWgt = this.netWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polutFlg = this.polutFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPgNo = this.imdgPgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyNo = this.aplyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hzdCtnt = this.hzdCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgDesc = this.dgDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrLodgNo = this.cntrLodgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlPckUtId = this.tmlPckUtId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stwgDesc = this.stwgDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
