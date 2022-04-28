/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgImdgPortRstrVO.java
*@FileTitle : ScgImdgPortRstrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.26
*@LastModifier : 장강철
*@LastVersion : 1.0
* 2009.05.26 장강철 
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
 * @author 장강철
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ScgImdgPortRstrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgImdgPortRstrVO> models = new ArrayList<ScgImdgPortRstrVO>();
	
	/* Column Info */
	private String rstrRmk = null;
	/* Column Info */
	private String kepSftDistIhbFlg = null;
	/* Column Info */
	private String imdgUnNoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String prohiPassFlg = null;
	/* Column Info */
	private String prohiPinspFlg = null;
	/* Column Info */
	private String dirDchgFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String prohiTsFlg = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String kepSftDistIhbDist = null;
	/* Column Info */
	private String prohiDchgFlg = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String dirTsFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String imdgUnNo = null;
	/* Column Info */
	private String prohiLodFlg = null;
	/* Column Info */
	private String imdgPortRstrExptFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String sftGadFlg = null;
	/* Column Info */
	private String dirLodFlg = null;
	/* Column Info */
	private String prohiNgtFlg = null;
	/* Column Info */
	private String xtraHndlChgFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String imdgPortRstrSeq = null;
	/* Column Info */
	private String prohiDyTmOpFlg = null;
	/* Column Info */
	private String prohiPortFlg = null;
	/* Column Info */
	private String imdgClssCd = null;
	/* Column Info */
	private String prohiDyTmInlndTzFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgImdgPortRstrVO() {}

	public ScgImdgPortRstrVO(String ibflag, String pagerows, String portCd, String imdgPortRstrSeq, String imdgPortRstrExptFlg, String imdgUnNo, String imdgUnNoSeq, String imdgClssCd, String prohiLodFlg, String prohiDchgFlg, String prohiTsFlg, String prohiPassFlg, String prohiDyTmOpFlg, String prohiDyTmInlndTzFlg, String prohiPortFlg, String prohiPinspFlg, String xtraHndlChgFlg, String sftGadFlg, String kepSftDistIhbFlg, String kepSftDistIhbDist, String rstrRmk, String prohiNgtFlg, String dirLodFlg, String dirDchgFlg, String dirTsFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.rstrRmk = rstrRmk;
		this.kepSftDistIhbFlg = kepSftDistIhbFlg;
		this.imdgUnNoSeq = imdgUnNoSeq;
		this.creDt = creDt;
		this.prohiPassFlg = prohiPassFlg;
		this.prohiPinspFlg = prohiPinspFlg;
		this.dirDchgFlg = dirDchgFlg;
		this.pagerows = pagerows;
		this.prohiTsFlg = prohiTsFlg;
		this.ibflag = ibflag;
		this.kepSftDistIhbDist = kepSftDistIhbDist;
		this.prohiDchgFlg = prohiDchgFlg;
		this.portCd = portCd;
		this.dirTsFlg = dirTsFlg;
		this.updUsrId = updUsrId;
		this.imdgUnNo = imdgUnNo;
		this.prohiLodFlg = prohiLodFlg;
		this.imdgPortRstrExptFlg = imdgPortRstrExptFlg;
		this.updDt = updDt;
		this.sftGadFlg = sftGadFlg;
		this.dirLodFlg = dirLodFlg;
		this.prohiNgtFlg = prohiNgtFlg;
		this.xtraHndlChgFlg = xtraHndlChgFlg;
		this.creUsrId = creUsrId;
		this.imdgPortRstrSeq = imdgPortRstrSeq;
		this.prohiDyTmOpFlg = prohiDyTmOpFlg;
		this.prohiPortFlg = prohiPortFlg;
		this.imdgClssCd = imdgClssCd;
		this.prohiDyTmInlndTzFlg = prohiDyTmInlndTzFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rstr_rmk", getRstrRmk());
		this.hashColumns.put("kep_sft_dist_ihb_flg", getKepSftDistIhbFlg());
		this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("prohi_pass_flg", getProhiPassFlg());
		this.hashColumns.put("prohi_pinsp_flg", getProhiPinspFlg());
		this.hashColumns.put("dir_dchg_flg", getDirDchgFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prohi_ts_flg", getProhiTsFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("kep_sft_dist_ihb_dist", getKepSftDistIhbDist());
		this.hashColumns.put("prohi_dchg_flg", getProhiDchgFlg());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("dir_ts_flg", getDirTsFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("imdg_un_no", getImdgUnNo());
		this.hashColumns.put("prohi_lod_flg", getProhiLodFlg());
		this.hashColumns.put("imdg_port_rstr_expt_flg", getImdgPortRstrExptFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sft_gad_flg", getSftGadFlg());
		this.hashColumns.put("dir_lod_flg", getDirLodFlg());
		this.hashColumns.put("prohi_ngt_flg", getProhiNgtFlg());
		this.hashColumns.put("xtra_hndl_chg_flg", getXtraHndlChgFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("imdg_port_rstr_seq", getImdgPortRstrSeq());
		this.hashColumns.put("prohi_dy_tm_op_flg", getProhiDyTmOpFlg());
		this.hashColumns.put("prohi_port_flg", getProhiPortFlg());
		this.hashColumns.put("imdg_clss_cd", getImdgClssCd());
		this.hashColumns.put("prohi_dy_tm_inlnd_tz_flg", getProhiDyTmInlndTzFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rstr_rmk", "rstrRmk");
		this.hashFields.put("kep_sft_dist_ihb_flg", "kepSftDistIhbFlg");
		this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("prohi_pass_flg", "prohiPassFlg");
		this.hashFields.put("prohi_pinsp_flg", "prohiPinspFlg");
		this.hashFields.put("dir_dchg_flg", "dirDchgFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("prohi_ts_flg", "prohiTsFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("kep_sft_dist_ihb_dist", "kepSftDistIhbDist");
		this.hashFields.put("prohi_dchg_flg", "prohiDchgFlg");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("dir_ts_flg", "dirTsFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("imdg_un_no", "imdgUnNo");
		this.hashFields.put("prohi_lod_flg", "prohiLodFlg");
		this.hashFields.put("imdg_port_rstr_expt_flg", "imdgPortRstrExptFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sft_gad_flg", "sftGadFlg");
		this.hashFields.put("dir_lod_flg", "dirLodFlg");
		this.hashFields.put("prohi_ngt_flg", "prohiNgtFlg");
		this.hashFields.put("xtra_hndl_chg_flg", "xtraHndlChgFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("imdg_port_rstr_seq", "imdgPortRstrSeq");
		this.hashFields.put("prohi_dy_tm_op_flg", "prohiDyTmOpFlg");
		this.hashFields.put("prohi_port_flg", "prohiPortFlg");
		this.hashFields.put("imdg_clss_cd", "imdgClssCd");
		this.hashFields.put("prohi_dy_tm_inlnd_tz_flg", "prohiDyTmInlndTzFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rstrRmk
	 */
	public String getRstrRmk() {
		return this.rstrRmk;
	}
	
	/**
	 * Column Info
	 * @return kepSftDistIhbFlg
	 */
	public String getKepSftDistIhbFlg() {
		return this.kepSftDistIhbFlg;
	}
	
	/**
	 * Column Info
	 * @return imdgUnNoSeq
	 */
	public String getImdgUnNoSeq() {
		return this.imdgUnNoSeq;
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
	 * @return prohiPassFlg
	 */
	public String getProhiPassFlg() {
		return this.prohiPassFlg;
	}
	
	/**
	 * Column Info
	 * @return prohiPinspFlg
	 */
	public String getProhiPinspFlg() {
		return this.prohiPinspFlg;
	}
	
	/**
	 * Column Info
	 * @return dirDchgFlg
	 */
	public String getDirDchgFlg() {
		return this.dirDchgFlg;
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
	 * @return prohiTsFlg
	 */
	public String getProhiTsFlg() {
		return this.prohiTsFlg;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return kepSftDistIhbDist
	 */
	public String getKepSftDistIhbDist() {
		return this.kepSftDistIhbDist;
	}
	
	/**
	 * Column Info
	 * @return prohiDchgFlg
	 */
	public String getProhiDchgFlg() {
		return this.prohiDchgFlg;
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
	 * @return dirTsFlg
	 */
	public String getDirTsFlg() {
		return this.dirTsFlg;
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
	 * @return prohiLodFlg
	 */
	public String getProhiLodFlg() {
		return this.prohiLodFlg;
	}
	
	/**
	 * Column Info
	 * @return imdgPortRstrExptFlg
	 */
	public String getImdgPortRstrExptFlg() {
		return this.imdgPortRstrExptFlg;
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
	 * @return sftGadFlg
	 */
	public String getSftGadFlg() {
		return this.sftGadFlg;
	}
	
	/**
	 * Column Info
	 * @return dirLodFlg
	 */
	public String getDirLodFlg() {
		return this.dirLodFlg;
	}
	
	/**
	 * Column Info
	 * @return prohiNgtFlg
	 */
	public String getProhiNgtFlg() {
		return this.prohiNgtFlg;
	}
	
	/**
	 * Column Info
	 * @return xtraHndlChgFlg
	 */
	public String getXtraHndlChgFlg() {
		return this.xtraHndlChgFlg;
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
	 * @return imdgPortRstrSeq
	 */
	public String getImdgPortRstrSeq() {
		return this.imdgPortRstrSeq;
	}
	
	/**
	 * Column Info
	 * @return prohiDyTmOpFlg
	 */
	public String getProhiDyTmOpFlg() {
		return this.prohiDyTmOpFlg;
	}
	
	/**
	 * Column Info
	 * @return prohiPortFlg
	 */
	public String getProhiPortFlg() {
		return this.prohiPortFlg;
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
	 * @return prohiDyTmInlndTzFlg
	 */
	public String getProhiDyTmInlndTzFlg() {
		return this.prohiDyTmInlndTzFlg;
	}
	

	/**
	 * Column Info
	 * @param rstrRmk
	 */
	public void setRstrRmk(String rstrRmk) {
		this.rstrRmk = rstrRmk;
	}
	
	/**
	 * Column Info
	 * @param kepSftDistIhbFlg
	 */
	public void setKepSftDistIhbFlg(String kepSftDistIhbFlg) {
		this.kepSftDistIhbFlg = kepSftDistIhbFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgUnNoSeq
	 */
	public void setImdgUnNoSeq(String imdgUnNoSeq) {
		this.imdgUnNoSeq = imdgUnNoSeq;
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
	 * @param prohiPassFlg
	 */
	public void setProhiPassFlg(String prohiPassFlg) {
		this.prohiPassFlg = prohiPassFlg;
	}
	
	/**
	 * Column Info
	 * @param prohiPinspFlg
	 */
	public void setProhiPinspFlg(String prohiPinspFlg) {
		this.prohiPinspFlg = prohiPinspFlg;
	}
	
	/**
	 * Column Info
	 * @param dirDchgFlg
	 */
	public void setDirDchgFlg(String dirDchgFlg) {
		this.dirDchgFlg = dirDchgFlg;
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
	 * @param prohiTsFlg
	 */
	public void setProhiTsFlg(String prohiTsFlg) {
		this.prohiTsFlg = prohiTsFlg;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param kepSftDistIhbDist
	 */
	public void setKepSftDistIhbDist(String kepSftDistIhbDist) {
		this.kepSftDistIhbDist = kepSftDistIhbDist;
	}
	
	/**
	 * Column Info
	 * @param prohiDchgFlg
	 */
	public void setProhiDchgFlg(String prohiDchgFlg) {
		this.prohiDchgFlg = prohiDchgFlg;
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
	 * @param dirTsFlg
	 */
	public void setDirTsFlg(String dirTsFlg) {
		this.dirTsFlg = dirTsFlg;
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
	 * @param prohiLodFlg
	 */
	public void setProhiLodFlg(String prohiLodFlg) {
		this.prohiLodFlg = prohiLodFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgPortRstrExptFlg
	 */
	public void setImdgPortRstrExptFlg(String imdgPortRstrExptFlg) {
		this.imdgPortRstrExptFlg = imdgPortRstrExptFlg;
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
	 * @param sftGadFlg
	 */
	public void setSftGadFlg(String sftGadFlg) {
		this.sftGadFlg = sftGadFlg;
	}
	
	/**
	 * Column Info
	 * @param dirLodFlg
	 */
	public void setDirLodFlg(String dirLodFlg) {
		this.dirLodFlg = dirLodFlg;
	}
	
	/**
	 * Column Info
	 * @param prohiNgtFlg
	 */
	public void setProhiNgtFlg(String prohiNgtFlg) {
		this.prohiNgtFlg = prohiNgtFlg;
	}
	
	/**
	 * Column Info
	 * @param xtraHndlChgFlg
	 */
	public void setXtraHndlChgFlg(String xtraHndlChgFlg) {
		this.xtraHndlChgFlg = xtraHndlChgFlg;
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
	 * @param imdgPortRstrSeq
	 */
	public void setImdgPortRstrSeq(String imdgPortRstrSeq) {
		this.imdgPortRstrSeq = imdgPortRstrSeq;
	}
	
	/**
	 * Column Info
	 * @param prohiDyTmOpFlg
	 */
	public void setProhiDyTmOpFlg(String prohiDyTmOpFlg) {
		this.prohiDyTmOpFlg = prohiDyTmOpFlg;
	}
	
	/**
	 * Column Info
	 * @param prohiPortFlg
	 */
	public void setProhiPortFlg(String prohiPortFlg) {
		this.prohiPortFlg = prohiPortFlg;
	}
	
	/**
	 * Column Info
	 * @param imdgClssCd
	 */
	public void setImdgClssCd(String imdgClssCd) {
		this.imdgClssCd = imdgClssCd;
	}
	
	/**
	 * Column Info
	 * @param prohiDyTmInlndTzFlg
	 */
	public void setProhiDyTmInlndTzFlg(String prohiDyTmInlndTzFlg) {
		this.prohiDyTmInlndTzFlg = prohiDyTmInlndTzFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRstrRmk(JSPUtil.getParameter(request, "rstr_rmk", ""));
		setKepSftDistIhbFlg(JSPUtil.getParameter(request, "kep_sft_dist_ihb_flg", ""));
		setImdgUnNoSeq(JSPUtil.getParameter(request, "imdg_un_no_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setProhiPassFlg(JSPUtil.getParameter(request, "prohi_pass_flg", ""));
		setProhiPinspFlg(JSPUtil.getParameter(request, "prohi_pinsp_flg", ""));
		setDirDchgFlg(JSPUtil.getParameter(request, "dir_dchg_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setProhiTsFlg(JSPUtil.getParameter(request, "prohi_ts_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setKepSftDistIhbDist(JSPUtil.getParameter(request, "kep_sft_dist_ihb_dist", ""));
		setProhiDchgFlg(JSPUtil.getParameter(request, "prohi_dchg_flg", ""));
		setPortCd(JSPUtil.getParameter(request, "port_cd", ""));
		setDirTsFlg(JSPUtil.getParameter(request, "dir_ts_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setImdgUnNo(JSPUtil.getParameter(request, "imdg_un_no", ""));
		setProhiLodFlg(JSPUtil.getParameter(request, "prohi_lod_flg", ""));
		setImdgPortRstrExptFlg(JSPUtil.getParameter(request, "imdg_port_rstr_expt_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSftGadFlg(JSPUtil.getParameter(request, "sft_gad_flg", ""));
		setDirLodFlg(JSPUtil.getParameter(request, "dir_lod_flg", ""));
		setProhiNgtFlg(JSPUtil.getParameter(request, "prohi_ngt_flg", ""));
		setXtraHndlChgFlg(JSPUtil.getParameter(request, "xtra_hndl_chg_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setImdgPortRstrSeq(JSPUtil.getParameter(request, "imdg_port_rstr_seq", ""));
		setProhiDyTmOpFlg(JSPUtil.getParameter(request, "prohi_dy_tm_op_flg", ""));
		setProhiPortFlg(JSPUtil.getParameter(request, "prohi_port_flg", ""));
		setImdgClssCd(JSPUtil.getParameter(request, "imdg_clss_cd", ""));
		setProhiDyTmInlndTzFlg(JSPUtil.getParameter(request, "prohi_dy_tm_inlnd_tz_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ScgImdgPortRstrVO[]
	 */
	public ScgImdgPortRstrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgImdgPortRstrVO[]
	 */
	public ScgImdgPortRstrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgImdgPortRstrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rstrRmk = (JSPUtil.getParameter(request, prefix	+ "rstr_rmk".trim(), length));
			String[] kepSftDistIhbFlg = (JSPUtil.getParameter(request, prefix	+ "kep_sft_dist_ihb_flg".trim(), length));
			String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] prohiPassFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_pass_flg".trim(), length));
			String[] prohiPinspFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_pinsp_flg".trim(), length));
			String[] dirDchgFlg = (JSPUtil.getParameter(request, prefix	+ "dir_dchg_flg".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] prohiTsFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_ts_flg".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] kepSftDistIhbDist = (JSPUtil.getParameter(request, prefix	+ "kep_sft_dist_ihb_dist".trim(), length));
			String[] prohiDchgFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_dchg_flg".trim(), length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd".trim(), length));
			String[] dirTsFlg = (JSPUtil.getParameter(request, prefix	+ "dir_ts_flg".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] imdgUnNo = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no".trim(), length));
			String[] prohiLodFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_lod_flg".trim(), length));
			String[] imdgPortRstrExptFlg = (JSPUtil.getParameter(request, prefix	+ "imdg_port_rstr_expt_flg".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] sftGadFlg = (JSPUtil.getParameter(request, prefix	+ "sft_gad_flg".trim(), length));
			String[] dirLodFlg = (JSPUtil.getParameter(request, prefix	+ "dir_lod_flg".trim(), length));
			String[] prohiNgtFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_ngt_flg".trim(), length));
			String[] xtraHndlChgFlg = (JSPUtil.getParameter(request, prefix	+ "xtra_hndl_chg_flg".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] imdgPortRstrSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_port_rstr_seq".trim(), length));
			String[] prohiDyTmOpFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_dy_tm_op_flg".trim(), length));
			String[] prohiPortFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_port_flg".trim(), length));
			String[] imdgClssCd = (JSPUtil.getParameter(request, prefix	+ "imdg_clss_cd".trim(), length));
			String[] prohiDyTmInlndTzFlg = (JSPUtil.getParameter(request, prefix	+ "prohi_dy_tm_inlnd_tz_flg".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgImdgPortRstrVO();
				if (rstrRmk[i] != null)
					model.setRstrRmk(rstrRmk[i]);
				if (kepSftDistIhbFlg[i] != null)
					model.setKepSftDistIhbFlg(kepSftDistIhbFlg[i]);
				if (imdgUnNoSeq[i] != null)
					model.setImdgUnNoSeq(imdgUnNoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (prohiPassFlg[i] != null)
					model.setProhiPassFlg(prohiPassFlg[i]);
				if (prohiPinspFlg[i] != null)
					model.setProhiPinspFlg(prohiPinspFlg[i]);
				if (dirDchgFlg[i] != null)
					model.setDirDchgFlg(dirDchgFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (prohiTsFlg[i] != null)
					model.setProhiTsFlg(prohiTsFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (kepSftDistIhbDist[i] != null)
					model.setKepSftDistIhbDist(kepSftDistIhbDist[i]);
				if (prohiDchgFlg[i] != null)
					model.setProhiDchgFlg(prohiDchgFlg[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (dirTsFlg[i] != null)
					model.setDirTsFlg(dirTsFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (imdgUnNo[i] != null)
					model.setImdgUnNo(imdgUnNo[i]);
				if (prohiLodFlg[i] != null)
					model.setProhiLodFlg(prohiLodFlg[i]);
				if (imdgPortRstrExptFlg[i] != null)
					model.setImdgPortRstrExptFlg(imdgPortRstrExptFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (sftGadFlg[i] != null)
					model.setSftGadFlg(sftGadFlg[i]);
				if (dirLodFlg[i] != null)
					model.setDirLodFlg(dirLodFlg[i]);
				if (prohiNgtFlg[i] != null)
					model.setProhiNgtFlg(prohiNgtFlg[i]);
				if (xtraHndlChgFlg[i] != null)
					model.setXtraHndlChgFlg(xtraHndlChgFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (imdgPortRstrSeq[i] != null)
					model.setImdgPortRstrSeq(imdgPortRstrSeq[i]);
				if (prohiDyTmOpFlg[i] != null)
					model.setProhiDyTmOpFlg(prohiDyTmOpFlg[i]);
				if (prohiPortFlg[i] != null)
					model.setProhiPortFlg(prohiPortFlg[i]);
				if (imdgClssCd[i] != null)
					model.setImdgClssCd(imdgClssCd[i]);
				if (prohiDyTmInlndTzFlg[i] != null)
					model.setProhiDyTmInlndTzFlg(prohiDyTmInlndTzFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgImdgPortRstrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ScgImdgPortRstrVO[]
	 */
	public ScgImdgPortRstrVO[] getScgImdgPortRstrVOs(){
		ScgImdgPortRstrVO[] vos = (ScgImdgPortRstrVO[])models.toArray(new ScgImdgPortRstrVO[models.size()]);
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
		this.rstrRmk = this.rstrRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kepSftDistIhbFlg = this.kepSftDistIhbFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNoSeq = this.imdgUnNoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiPassFlg = this.prohiPassFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiPinspFlg = this.prohiPinspFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirDchgFlg = this.dirDchgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiTsFlg = this.prohiTsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kepSftDistIhbDist = this.kepSftDistIhbDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiDchgFlg = this.prohiDchgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirTsFlg = this.dirTsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNo = this.imdgUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiLodFlg = this.prohiLodFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPortRstrExptFlg = this.imdgPortRstrExptFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sftGadFlg = this.sftGadFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirLodFlg = this.dirLodFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiNgtFlg = this.prohiNgtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xtraHndlChgFlg = this.xtraHndlChgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPortRstrSeq = this.imdgPortRstrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiDyTmOpFlg = this.prohiDyTmOpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiPortFlg = this.prohiPortFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgClssCd = this.imdgClssCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prohiDyTmInlndTzFlg = this.prohiDyTmInlndTzFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
