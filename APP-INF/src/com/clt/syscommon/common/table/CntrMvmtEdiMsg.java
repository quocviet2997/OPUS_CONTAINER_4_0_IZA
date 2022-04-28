/*=========================================================
*Copyright(c) 2008 CyberLogitec
*@FileName : CntrMvmtEdiMsg.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2008.12.29
*@LastModifier : 안성인
*@LastVersion : 1.0
* 2008.12.29 안성인
* 1.0 최초 생성
=========================================================*/

package com.clt.syscommon.common.table;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 * @see CntrMvmtEdiMsg
 * @author 안성인
 * @since J2EE 1.5
*/
public class CntrMvmtEdiMsg implements Serializable {

	private static final long serialVersionUID = 1L;
	/* 컬럼 설명	*/
	private String cmemDmgFlag = null;
	/* 컬럼 설명	*/
	private String cnmvPickupNo = null;
	/* 컬럼 설명	*/
	private String cmemHngrFlg = null;
	/* 컬럼 설명	*/
	private String clmArvDt = null;
	/* 컬럼 설명	*/
	private String cmemArvYd = null;
	/* 컬럼 설명	*/
	private String cmemDtTm = null;
	/* 컬럼 설명	*/
	private String cmemActDt = null;
	/* 컬럼 설명	*/
	private String cmemFlatcarNo = null;
	/* 컬럼 설명	*/
	private String cmemCnmsCd = null;
	/* 컬럼 설명	*/
	private String cmemSealNo = null;
	/* 컬럼 설명	*/
	private String cmemTmlNm = null;
	/* 컬럼 설명	*/
	private String cmemEdiId = null;
	/* 컬럼 설명	*/
	private String cmemCntrNo = null;
	/* 컬럼 설명	*/
	private String cmemYd = null;
	/* 컬럼 설명	*/
	private String cmemPol = null;
	/* 컬럼 설명	*/
	private String cmemSvcOrdNo = null;
	/* 컬럼 설명	*/
	private String cmemMuidArea = null;
	/* 컬럼 설명	*/
	private String clmArvLoc = null;
	/* 컬럼 설명	*/
	private String cmemMgset = null;
	/* 컬럼 설명	*/
	private String cmemPod = null;
	/* 컬럼 설명	*/
	private String ibflag = null;
	/* 컬럼 설명	*/
	private String cmemPickupRqdt = null;
	/* 컬럼 설명	*/
	private String cmemSb = null;
	/* 컬럼 설명	*/
	private String cmemMuidDt = null;
	/* 컬럼 설명	*/
	private String cmemBkgNo = null;
	/* 컬럼 설명	*/
	private String trainNo = null;
	/* 컬럼 설명	*/
	private String cmemRstFlg = null;
	/* 컬럼 설명	*/
	private String cmemRtyCnt = null;
	/* 컬럼 설명	*/
	private String cmemDptYd = null;
	/* 컬럼 설명	*/
	private String cmemBkgCnt = null;
	/* 컬럼 설명	*/
	private String cmemBlNo = null;
	/* 컬럼 설명	*/
	private String cmemModeCd = null;
	/* 컬럼 설명	*/
	private String cmemChssNo = null;
	/* 컬럼 설명	*/
	private String cmemSightCd = null;
	/* 컬럼 설명	*/
	private String cnmvWaybillNo = null;
	/* 컬럼 설명	*/
	private String cmemMuidSeq = null;
	/* 컬럼 설명	*/
	private String clmSightCd = null;
	/* 컬럼 설명	*/
	private String cmemMsgId = null;
	/* 컬럼 설명	*/
	private String cmemPor = null;
	/* 컬럼 설명	*/
	private String cmemGateStat = null;
	/* 컬럼 설명	*/
	private String cmemCntCd = null;
	/* 컬럼 설명	*/
	private String cmemFlag = null;
	/* 컬럼 설명	*/
	private String cmemRmk = null;
	/* 컬럼 설명	*/
	private String cmemTol = null;
	/* 컬럼 설명	*/
	private String cmemDstLoc = null;
	/* 컬럼 설명	*/
	private String cmemCntrStat = null;
	/* 컬럼 설명	*/
	private String clmArvSplc = null;
	/* 컬럼 설명	*/
	private String cmemDel = null;
	/* 컬럼 설명	*/
	private String cmemVoyageNo = null;
	/* 컬럼 설명	*/
	private String clmDptSplc = null;
	/* 컬럼 설명	*/
	private String cmemVndrSeq = null;
	/* 컬럼 설명	*/
	private String cmem315Flg = null;
	/* 컬럼 설명	*/
	private String cmemBkgNoSplit = null;
	/* 컬럼 설명	*/
	private String cmemDirCd = null;
	/* 컬럼 설명	*/
	private String cmemVslCd = null;
	/* 컬럼 설명	*/
	private String pagerows = null;
	/* 컬럼 설명	*/
	private String cmemCstCd = null;
	/* 컬럼 설명	*/
	private String memSysDt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumn = new HashMap<String, String>();

	public CntrMvmtEdiMsg() {}

	public CntrMvmtEdiMsg(String ibflag, String pagerows, String cmemEdiId, String cmemMsgId, String cmemMuidArea, String cmemMuidDt, String cmemMuidSeq, String cmemTmlNm, String cmemCntrNo, String cmemYd, String cmemDtTm, String cmemGateStat, String cmemCntrStat, String cmemChssNo, String cmemVslCd, String cmemVoyageNo, String cmemDirCd, String cmemBlNo, String cmemBkgCnt, String cmemBkgNo, String cmemBkgNoSplit, String cmemPol, String cmemPod, String cmemTol, String cmemSealNo, String cmemMgset, String cmemSb, String cmemCntCd, String cmemVndrSeq, String cmemModeCd, String cmemFlatcarNo, String cmemCnmsCd, String cmemHngrFlg, String cnmvWaybillNo, String cnmvPickupNo, String clmArvDt, String clmArvLoc, String clmSightCd, String cmemActDt, String cmemPor, String cmemDel, String cmemDptYd, String cmemDstLoc, String cmemArvYd, String cmemSvcOrdNo, String cmemCstCd, String cmemPickupRqdt, String cmemRstFlg, String cmemRmk, String cmemRtyCnt, String trainNo, String clmArvSplc, String clmDptSplc, String memSysDt, String cmemFlag, String cmemSightCd, String cmem315Flg, String cmemDmgFlag) {
		this.cmemDmgFlag = cmemDmgFlag;
		this.cnmvPickupNo = cnmvPickupNo;
		this.cmemHngrFlg = cmemHngrFlg;
		this.clmArvDt = clmArvDt;
		this.cmemArvYd = cmemArvYd;
		this.cmemDtTm = cmemDtTm;
		this.cmemActDt = cmemActDt;
		this.cmemFlatcarNo = cmemFlatcarNo;
		this.cmemCnmsCd = cmemCnmsCd;
		this.cmemSealNo = cmemSealNo;
		this.cmemTmlNm = cmemTmlNm;
		this.cmemEdiId = cmemEdiId;
		this.cmemCntrNo = cmemCntrNo;
		this.cmemYd = cmemYd;
		this.cmemPol = cmemPol;
		this.cmemSvcOrdNo = cmemSvcOrdNo;
		this.cmemMuidArea = cmemMuidArea;
		this.clmArvLoc = clmArvLoc;
		this.cmemMgset = cmemMgset;
		this.cmemPod = cmemPod;
		this.ibflag = ibflag;
		this.cmemPickupRqdt = cmemPickupRqdt;
		this.cmemSb = cmemSb;
		this.cmemMuidDt = cmemMuidDt;
		this.cmemBkgNo = cmemBkgNo;
		this.trainNo = trainNo;
		this.cmemRstFlg = cmemRstFlg;
		this.cmemRtyCnt = cmemRtyCnt;
		this.cmemDptYd = cmemDptYd;
		this.cmemBkgCnt = cmemBkgCnt;
		this.cmemBlNo = cmemBlNo;
		this.cmemModeCd = cmemModeCd;
		this.cmemChssNo = cmemChssNo;
		this.cmemSightCd = cmemSightCd;
		this.cnmvWaybillNo = cnmvWaybillNo;
		this.cmemMuidSeq = cmemMuidSeq;
		this.clmSightCd = clmSightCd;
		this.cmemMsgId = cmemMsgId;
		this.cmemPor = cmemPor;
		this.cmemGateStat = cmemGateStat;
		this.cmemCntCd = cmemCntCd;
		this.cmemFlag = cmemFlag;
		this.cmemRmk = cmemRmk;
		this.cmemTol = cmemTol;
		this.cmemDstLoc = cmemDstLoc;
		this.cmemCntrStat = cmemCntrStat;
		this.clmArvSplc = clmArvSplc;
		this.cmemDel = cmemDel;
		this.cmemVoyageNo = cmemVoyageNo;
		this.clmDptSplc = clmDptSplc;
		this.cmemVndrSeq = cmemVndrSeq;
		this.cmem315Flg = cmem315Flg;
		this.cmemBkgNoSplit = cmemBkgNoSplit;
		this.cmemDirCd = cmemDirCd;
		this.cmemVslCd = cmemVslCd;
		this.pagerows = pagerows;
		this.cmemCstCd = cmemCstCd;
		this.memSysDt = memSysDt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValue(){
		this.hashColumn.put("cmem_dmg_flag", getCmemDmgFlag());
		this.hashColumn.put("cnmv_pickup_no", getCnmvPickupNo());
		this.hashColumn.put("cmem_hngr_flg", getCmemHngrFlg());
		this.hashColumn.put("clm_arv_dt", getClmArvDt());
		this.hashColumn.put("cmem_arv_yd", getCmemArvYd());
		this.hashColumn.put("cmem_dt_tm", getCmemDtTm());
		this.hashColumn.put("cmem_act_dt", getCmemActDt());
		this.hashColumn.put("cmem_flatcar_no", getCmemFlatcarNo());
		this.hashColumn.put("cmem_cnms_cd", getCmemCnmsCd());
		this.hashColumn.put("cmem_seal_no", getCmemSealNo());
		this.hashColumn.put("cmem_tml_nm", getCmemTmlNm());
		this.hashColumn.put("cmem_edi_id", getCmemEdiId());
		this.hashColumn.put("cmem_cntr_no", getCmemCntrNo());
		this.hashColumn.put("cmem_yd", getCmemYd());
		this.hashColumn.put("cmem_pol", getCmemPol());
		this.hashColumn.put("cmem_svc_ord_no", getCmemSvcOrdNo());
		this.hashColumn.put("cmem_muid_area", getCmemMuidArea());
		this.hashColumn.put("clm_arv_loc", getClmArvLoc());
		this.hashColumn.put("cmem_mgset", getCmemMgset());
		this.hashColumn.put("cmem_pod", getCmemPod());
		this.hashColumn.put("ibflag", getIbflag());
		this.hashColumn.put("cmem_pickup_rqdt", getCmemPickupRqdt());
		this.hashColumn.put("cmem_sb", getCmemSb());
		this.hashColumn.put("cmem_muid_dt", getCmemMuidDt());
		this.hashColumn.put("cmem_bkg_no", getCmemBkgNo());
		this.hashColumn.put("train_no", getTrainNo());
		this.hashColumn.put("cmem_rst_flg", getCmemRstFlg());
		this.hashColumn.put("cmem_rty_cnt", getCmemRtyCnt());
		this.hashColumn.put("cmem_dpt_yd", getCmemDptYd());
		this.hashColumn.put("cmem_bkg_cnt", getCmemBkgCnt());
		this.hashColumn.put("cmem_bl_no", getCmemBlNo());
		this.hashColumn.put("cmem_mode_cd", getCmemModeCd());
		this.hashColumn.put("cmem_chss_no", getCmemChssNo());
		this.hashColumn.put("cmem_sight_cd", getCmemSightCd());
		this.hashColumn.put("cnmv_waybill_no", getCnmvWaybillNo());
		this.hashColumn.put("cmem_muid_seq", getCmemMuidSeq());
		this.hashColumn.put("clm_sight_cd", getClmSightCd());
		this.hashColumn.put("cmem_msg_id", getCmemMsgId());
		this.hashColumn.put("cmem_por", getCmemPor());
		this.hashColumn.put("cmem_gate_stat", getCmemGateStat());
		this.hashColumn.put("cmem_cnt_cd", getCmemCntCd());
		this.hashColumn.put("cmem_flag", getCmemFlag());
		this.hashColumn.put("cmem_rmk", getCmemRmk());
		this.hashColumn.put("cmem_tol", getCmemTol());
		this.hashColumn.put("cmem_dst_loc", getCmemDstLoc());
		this.hashColumn.put("cmem_cntr_stat", getCmemCntrStat());
		this.hashColumn.put("clm_arv_splc", getClmArvSplc());
		this.hashColumn.put("cmem_del", getCmemDel());
		this.hashColumn.put("cmem_voyage_no", getCmemVoyageNo());
		this.hashColumn.put("clm_dpt_splc", getClmDptSplc());
		this.hashColumn.put("cmem_vndr_seq", getCmemVndrSeq());
		this.hashColumn.put("cmem_315_flg", getCmem315Flg());
		this.hashColumn.put("cmem_bkg_no_split", getCmemBkgNoSplit());
		this.hashColumn.put("cmem_dir_cd", getCmemDirCd());
		this.hashColumn.put("cmem_vsl_cd", getCmemVslCd());
		this.hashColumn.put("pagerows", getPage_rows());
		this.hashColumn.put("cmem_cst_cd", getCmemCstCd());
		this.hashColumn.put("mem_sys_dt", getMemSysDt());
		return this.hashColumn;
	}
	
	public String getCmemDmgFlag() {
		return this.cmemDmgFlag;
	}
	public String getCnmvPickupNo() {
		return this.cnmvPickupNo;
	}
	public String getCmemHngrFlg() {
		return this.cmemHngrFlg;
	}
	public String getClmArvDt() {
		return this.clmArvDt;
	}
	public String getCmemArvYd() {
		return this.cmemArvYd;
	}
	public String getCmemDtTm() {
		return this.cmemDtTm;
	}
	public String getCmemActDt() {
		return this.cmemActDt;
	}
	public String getCmemFlatcarNo() {
		return this.cmemFlatcarNo;
	}
	public String getCmemCnmsCd() {
		return this.cmemCnmsCd;
	}
	public String getCmemSealNo() {
		return this.cmemSealNo;
	}
	public String getCmemTmlNm() {
		return this.cmemTmlNm;
	}
	public String getCmemEdiId() {
		return this.cmemEdiId;
	}
	public String getCmemCntrNo() {
		return this.cmemCntrNo;
	}
	public String getCmemYd() {
		return this.cmemYd;
	}
	public String getCmemPol() {
		return this.cmemPol;
	}
	public String getCmemSvcOrdNo() {
		return this.cmemSvcOrdNo;
	}
	public String getCmemMuidArea() {
		return this.cmemMuidArea;
	}
	public String getClmArvLoc() {
		return this.clmArvLoc;
	}
	public String getCmemMgset() {
		return this.cmemMgset;
	}
	public String getCmemPod() {
		return this.cmemPod;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCmemPickupRqdt() {
		return this.cmemPickupRqdt;
	}
	public String getCmemSb() {
		return this.cmemSb;
	}
	public String getCmemMuidDt() {
		return this.cmemMuidDt;
	}
	public String getCmemBkgNo() {
		return this.cmemBkgNo;
	}
	public String getTrainNo() {
		return this.trainNo;
	}
	public String getCmemRstFlg() {
		return this.cmemRstFlg;
	}
	public String getCmemRtyCnt() {
		return this.cmemRtyCnt;
	}
	public String getCmemDptYd() {
		return this.cmemDptYd;
	}
	public String getCmemBkgCnt() {
		return this.cmemBkgCnt;
	}
	public String getCmemBlNo() {
		return this.cmemBlNo;
	}
	public String getCmemModeCd() {
		return this.cmemModeCd;
	}
	public String getCmemChssNo() {
		return this.cmemChssNo;
	}
	public String getCmemSightCd() {
		return this.cmemSightCd;
	}
	public String getCnmvWaybillNo() {
		return this.cnmvWaybillNo;
	}
	public String getCmemMuidSeq() {
		return this.cmemMuidSeq;
	}
	public String getClmSightCd() {
		return this.clmSightCd;
	}
	public String getCmemMsgId() {
		return this.cmemMsgId;
	}
	public String getCmemPor() {
		return this.cmemPor;
	}
	public String getCmemGateStat() {
		return this.cmemGateStat;
	}
	public String getCmemCntCd() {
		return this.cmemCntCd;
	}
	public String getCmemFlag() {
		return this.cmemFlag;
	}
	public String getCmemRmk() {
		return this.cmemRmk;
	}
	public String getCmemTol() {
		return this.cmemTol;
	}
	public String getCmemDstLoc() {
		return this.cmemDstLoc;
	}
	public String getCmemCntrStat() {
		return this.cmemCntrStat;
	}
	public String getClmArvSplc() {
		return this.clmArvSplc;
	}
	public String getCmemDel() {
		return this.cmemDel;
	}
	public String getCmemVoyageNo() {
		return this.cmemVoyageNo;
	}
	public String getClmDptSplc() {
		return this.clmDptSplc;
	}
	public String getCmemVndrSeq() {
		return this.cmemVndrSeq;
	}
	public String getCmem315Flg() {
		return this.cmem315Flg;
	}
	public String getCmemBkgNoSplit() {
		return this.cmemBkgNoSplit;
	}
	public String getCmemDirCd() {
		return this.cmemDirCd;
	}
	public String getCmemVslCd() {
		return this.cmemVslCd;
	}
	public String getPage_rows() {
		return this.pagerows;
	}
	public String getCmemCstCd() {
		return this.cmemCstCd;
	}
	public String getMemSysDt() {
		return this.memSysDt;
	}

	public void setCmemDmgFlag(String cmemDmgFlag) {
		this.cmemDmgFlag = cmemDmgFlag;
		//this.cmemDmgFlag=true;
	}
	public void setCnmvPickupNo(String cnmvPickupNo) {
		this.cnmvPickupNo = cnmvPickupNo;
		//this.cnmvPickupNo=true;
	}
	public void setCmemHngrFlg(String cmemHngrFlg) {
		this.cmemHngrFlg = cmemHngrFlg;
		//this.cmemHngrFlg=true;
	}
	public void setClmArvDt(String clmArvDt) {
		this.clmArvDt = clmArvDt;
		//this.clmArvDt=true;
	}
	public void setCmemArvYd(String cmemArvYd) {
		this.cmemArvYd = cmemArvYd;
		//this.cmemArvYd=true;
	}
	public void setCmemDtTm(String cmemDtTm) {
		this.cmemDtTm = cmemDtTm;
		//this.cmemDtTm=true;
	}
	public void setCmemActDt(String cmemActDt) {
		this.cmemActDt = cmemActDt;
		//this.cmemActDt=true;
	}
	public void setCmemFlatcarNo(String cmemFlatcarNo) {
		this.cmemFlatcarNo = cmemFlatcarNo;
		//this.cmemFlatcarNo=true;
	}
	public void setCmemCnmsCd(String cmemCnmsCd) {
		this.cmemCnmsCd = cmemCnmsCd;
		//this.cmemCnmsCd=true;
	}
	public void setCmemSealNo(String cmemSealNo) {
		this.cmemSealNo = cmemSealNo;
		//this.cmemSealNo=true;
	}
	public void setCmemTmlNm(String cmemTmlNm) {
		this.cmemTmlNm = cmemTmlNm;
		//this.cmemTmlNm=true;
	}
	public void setCmemEdiId(String cmemEdiId) {
		this.cmemEdiId = cmemEdiId;
		//this.cmemEdiId=true;
	}
	public void setCmemCntrNo(String cmemCntrNo) {
		this.cmemCntrNo = cmemCntrNo;
		//this.cmemCntrNo=true;
	}
	public void setCmemYd(String cmemYd) {
		this.cmemYd = cmemYd;
		//this.cmemYd=true;
	}
	public void setCmemPol(String cmemPol) {
		this.cmemPol = cmemPol;
		//this.cmemPol=true;
	}
	public void setCmemSvcOrdNo(String cmemSvcOrdNo) {
		this.cmemSvcOrdNo = cmemSvcOrdNo;
		//this.cmemSvcOrdNo=true;
	}
	public void setCmemMuidArea(String cmemMuidArea) {
		this.cmemMuidArea = cmemMuidArea;
		//this.cmemMuidArea=true;
	}
	public void setClmArvLoc(String clmArvLoc) {
		this.clmArvLoc = clmArvLoc;
		//this.clmArvLoc=true;
	}
	public void setCmemMgset(String cmemMgset) {
		this.cmemMgset = cmemMgset;
		//this.cmemMgset=true;
	}
	public void setCmemPod(String cmemPod) {
		this.cmemPod = cmemPod;
		//this.cmemPod=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCmemPickupRqdt(String cmemPickupRqdt) {
		this.cmemPickupRqdt = cmemPickupRqdt;
		//this.cmemPickupRqdt=true;
	}
	public void setCmemSb(String cmemSb) {
		this.cmemSb = cmemSb;
		//this.cmemSb=true;
	}
	public void setCmemMuidDt(String cmemMuidDt) {
		this.cmemMuidDt = cmemMuidDt;
		//this.cmemMuidDt=true;
	}
	public void setCmemBkgNo(String cmemBkgNo) {
		this.cmemBkgNo = cmemBkgNo;
		//this.cmemBkgNo=true;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
		//this.trainNo=true;
	}
	public void setCmemRstFlg(String cmemRstFlg) {
		this.cmemRstFlg = cmemRstFlg;
		//this.cmemRstFlg=true;
	}
	public void setCmemRtyCnt(String cmemRtyCnt) {
		this.cmemRtyCnt = cmemRtyCnt;
		//this.cmemRtyCnt=true;
	}
	public void setCmemDptYd(String cmemDptYd) {
		this.cmemDptYd = cmemDptYd;
		//this.cmemDptYd=true;
	}
	public void setCmemBkgCnt(String cmemBkgCnt) {
		this.cmemBkgCnt = cmemBkgCnt;
		//this.cmemBkgCnt=true;
	}
	public void setCmemBlNo(String cmemBlNo) {
		this.cmemBlNo = cmemBlNo;
		//this.cmemBlNo=true;
	}
	public void setCmemModeCd(String cmemModeCd) {
		this.cmemModeCd = cmemModeCd;
		//this.cmemModeCd=true;
	}
	public void setCmemChssNo(String cmemChssNo) {
		this.cmemChssNo = cmemChssNo;
		//this.cmemChssNo=true;
	}
	public void setCmemSightCd(String cmemSightCd) {
		this.cmemSightCd = cmemSightCd;
		//this.cmemSightCd=true;
	}
	public void setCnmvWaybillNo(String cnmvWaybillNo) {
		this.cnmvWaybillNo = cnmvWaybillNo;
		//this.cnmvWaybillNo=true;
	}
	public void setCmemMuidSeq(String cmemMuidSeq) {
		this.cmemMuidSeq = cmemMuidSeq;
		//this.cmemMuidSeq=true;
	}
	public void setClmSightCd(String clmSightCd) {
		this.clmSightCd = clmSightCd;
		//this.clmSightCd=true;
	}
	public void setCmemMsgId(String cmemMsgId) {
		this.cmemMsgId = cmemMsgId;
		//this.cmemMsgId=true;
	}
	public void setCmemPor(String cmemPor) {
		this.cmemPor = cmemPor;
		//this.cmemPor=true;
	}
	public void setCmemGateStat(String cmemGateStat) {
		this.cmemGateStat = cmemGateStat;
		//this.cmemGateStat=true;
	}
	public void setCmemCntCd(String cmemCntCd) {
		this.cmemCntCd = cmemCntCd;
		//this.cmemCntCd=true;
	}
	public void setCmemFlag(String cmemFlag) {
		this.cmemFlag = cmemFlag;
		//this.cmemFlag=true;
	}
	public void setCmemRmk(String cmemRmk) {
		this.cmemRmk = cmemRmk;
		//this.cmemRmk=true;
	}
	public void setCmemTol(String cmemTol) {
		this.cmemTol = cmemTol;
		//this.cmemTol=true;
	}
	public void setCmemDstLoc(String cmemDstLoc) {
		this.cmemDstLoc = cmemDstLoc;
		//this.cmemDstLoc=true;
	}
	public void setCmemCntrStat(String cmemCntrStat) {
		this.cmemCntrStat = cmemCntrStat;
		//this.cmemCntrStat=true;
	}
	public void setClmArvSplc(String clmArvSplc) {
		this.clmArvSplc = clmArvSplc;
		//this.clmArvSplc=true;
	}
	public void setCmemDel(String cmemDel) {
		this.cmemDel = cmemDel;
		//this.cmemDel=true;
	}
	public void setCmemVoyageNo(String cmemVoyageNo) {
		this.cmemVoyageNo = cmemVoyageNo;
		//this.cmemVoyageNo=true;
	}
	public void setClmDptSplc(String clmDptSplc) {
		this.clmDptSplc = clmDptSplc;
		//this.clmDptSplc=true;
	}
	public void setCmemVndrSeq(String cmemVndrSeq) {
		this.cmemVndrSeq = cmemVndrSeq;
		//this.cmemVndrSeq=true;
	}
	public void setCmem315Flg(String cmem315Flg) {
		this.cmem315Flg = cmem315Flg;
		//this.cmem315Flg=true;
	}
	public void setCmemBkgNoSplit(String cmemBkgNoSplit) {
		this.cmemBkgNoSplit = cmemBkgNoSplit;
		//this.cmemBkgNoSplit=true;
	}
	public void setCmemDirCd(String cmemDirCd) {
		this.cmemDirCd = cmemDirCd;
		//this.cmemDirCd=true;
	}
	public void setCmemVslCd(String cmemVslCd) {
		this.cmemVslCd = cmemVslCd;
		//this.cmemVslCd=true;
	}
	public void setPage_rows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setCmemCstCd(String cmemCstCd) {
		this.cmemCstCd = cmemCstCd;
		//this.cmemCstCd=true;
	}
	public void setMemSysDt(String memSysDt) {
		this.memSysDt = memSysDt;
		//this.memSysDt=true;
	}
	public static CntrMvmtEdiMsg fromRequest(HttpServletRequest request) {
		CntrMvmtEdiMsg model = new CntrMvmtEdiMsg();
		try {
			model.setCmemDmgFlag(JSPUtil.getParameter(request, "cmem_dmg_flag", ""));
			model.setCnmvPickupNo(JSPUtil.getParameter(request, "cnmv_pickup_no", ""));
			model.setCmemHngrFlg(JSPUtil.getParameter(request, "cmem_hngr_flg", ""));
			model.setClmArvDt(JSPUtil.getParameter(request, "clm_arv_dt", ""));
			model.setCmemArvYd(JSPUtil.getParameter(request, "cmem_arv_yd", ""));
			model.setCmemDtTm(JSPUtil.getParameter(request, "cmem_dt_tm", ""));
			model.setCmemActDt(JSPUtil.getParameter(request, "cmem_act_dt", ""));
			model.setCmemFlatcarNo(JSPUtil.getParameter(request, "cmem_flatcar_no", ""));
			model.setCmemCnmsCd(JSPUtil.getParameter(request, "cmem_cnms_cd", ""));
			model.setCmemSealNo(JSPUtil.getParameter(request, "cmem_seal_no", ""));
			model.setCmemTmlNm(JSPUtil.getParameter(request, "cmem_tml_nm", ""));
			model.setCmemEdiId(JSPUtil.getParameter(request, "cmem_edi_id", ""));
			model.setCmemCntrNo(JSPUtil.getParameter(request, "cmem_cntr_no", ""));
			model.setCmemYd(JSPUtil.getParameter(request, "cmem_yd", ""));
			model.setCmemPol(JSPUtil.getParameter(request, "cmem_pol", ""));
			model.setCmemSvcOrdNo(JSPUtil.getParameter(request, "cmem_svc_ord_no", ""));
			model.setCmemMuidArea(JSPUtil.getParameter(request, "cmem_muid_area", ""));
			model.setClmArvLoc(JSPUtil.getParameter(request, "clm_arv_loc", ""));
			model.setCmemMgset(JSPUtil.getParameter(request, "cmem_mgset", ""));
			model.setCmemPod(JSPUtil.getParameter(request, "cmem_pod", ""));
			model.setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
			model.setCmemPickupRqdt(JSPUtil.getParameter(request, "cmem_pickup_rqdt", ""));
			model.setCmemSb(JSPUtil.getParameter(request, "cmem_sb", ""));
			model.setCmemMuidDt(JSPUtil.getParameter(request, "cmem_muid_dt", ""));
			model.setCmemBkgNo(JSPUtil.getParameter(request, "cmem_bkg_no", ""));
			model.setTrainNo(JSPUtil.getParameter(request, "train_no", ""));
			model.setCmemRstFlg(JSPUtil.getParameter(request, "cmem_rst_flg", ""));
			model.setCmemRtyCnt(JSPUtil.getParameter(request, "cmem_rty_cnt", ""));
			model.setCmemDptYd(JSPUtil.getParameter(request, "cmem_dpt_yd", ""));
			model.setCmemBkgCnt(JSPUtil.getParameter(request, "cmem_bkg_cnt", ""));
			model.setCmemBlNo(JSPUtil.getParameter(request, "cmem_bl_no", ""));
			model.setCmemModeCd(JSPUtil.getParameter(request, "cmem_mode_cd", ""));
			model.setCmemChssNo(JSPUtil.getParameter(request, "cmem_chss_no", ""));
			model.setCmemSightCd(JSPUtil.getParameter(request, "cmem_sight_cd", ""));
			model.setCnmvWaybillNo(JSPUtil.getParameter(request, "cnmv_waybill_no", ""));
			model.setCmemMuidSeq(JSPUtil.getParameter(request, "cmem_muid_seq", ""));
			model.setClmSightCd(JSPUtil.getParameter(request, "clm_sight_cd", ""));
			model.setCmemMsgId(JSPUtil.getParameter(request, "cmem_msg_id", ""));
			model.setCmemPor(JSPUtil.getParameter(request, "cmem_por", ""));
			model.setCmemGateStat(JSPUtil.getParameter(request, "cmem_gate_stat", ""));
			model.setCmemCntCd(JSPUtil.getParameter(request, "cmem_cnt_cd", ""));
			model.setCmemFlag(JSPUtil.getParameter(request, "cmem_flag", ""));
			model.setCmemRmk(JSPUtil.getParameter(request, "cmem_rmk", ""));
			model.setCmemTol(JSPUtil.getParameter(request, "cmem_tol", ""));
			model.setCmemDstLoc(JSPUtil.getParameter(request, "cmem_dst_loc", ""));
			model.setCmemCntrStat(JSPUtil.getParameter(request, "cmem_cntr_stat", ""));
			model.setClmArvSplc(JSPUtil.getParameter(request, "clm_arv_splc", ""));
			model.setCmemDel(JSPUtil.getParameter(request, "cmem_del", ""));
			model.setCmemVoyageNo(JSPUtil.getParameter(request, "cmem_voyage_no", ""));
			model.setClmDptSplc(JSPUtil.getParameter(request, "clm_dpt_splc", ""));
			model.setCmemVndrSeq(JSPUtil.getParameter(request, "cmem_vndr_seq", ""));
			model.setCmem315Flg(JSPUtil.getParameter(request, "cmem_315_flg", ""));
			model.setCmemBkgNoSplit(JSPUtil.getParameter(request, "cmem_bkg_no_split", ""));
			model.setCmemDirCd(JSPUtil.getParameter(request, "cmem_dir_cd", ""));
			model.setCmemVslCd(JSPUtil.getParameter(request, "cmem_vsl_cd", ""));
			model.setPage_rows(JSPUtil.getParameter(request, "pagerows", ""));
			model.setCmemCstCd(JSPUtil.getParameter(request, "cmem_cst_cd", ""));
			model.setMemSysDt(JSPUtil.getParameter(request, "mem_sys_dt", ""));
		} catch (Exception e) {}
		return model;
	}

	public static Collection<CntrMvmtEdiMsg> fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public static Collection<CntrMvmtEdiMsg> fromRequestGrid(HttpServletRequest request, String prefix) {
		CntrMvmtEdiMsg model = null;
		Collection<CntrMvmtEdiMsg> models = new ArrayList<CntrMvmtEdiMsg>();

		
		String[] tmp = request.getParameterValues(prefix + "cmem_edi_id");
  		if(tmp==null)
   			return models;

  		int length = request.getParameterValues(prefix + "cmem_edi_id").length;
  
		try {
			String[] cmemDmgFlag = (JSPUtil.getParameter(request, prefix	+ "cmem_dmg_flag".trim(), length));
			String[] cnmvPickupNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_pickup_no".trim(), length));
			String[] cmemHngrFlg = (JSPUtil.getParameter(request, prefix	+ "cmem_hngr_flg".trim(), length));
			String[] clmArvDt = (JSPUtil.getParameter(request, prefix	+ "clm_arv_dt".trim(), length));
			String[] cmemArvYd = (JSPUtil.getParameter(request, prefix	+ "cmem_arv_yd".trim(), length));
			String[] cmemDtTm = (JSPUtil.getParameter(request, prefix	+ "cmem_dt_tm".trim(), length));
			String[] cmemActDt = (JSPUtil.getParameter(request, prefix	+ "cmem_act_dt".trim(), length));
			String[] cmemFlatcarNo = (JSPUtil.getParameter(request, prefix	+ "cmem_flatcar_no".trim(), length));
			String[] cmemCnmsCd = (JSPUtil.getParameter(request, prefix	+ "cmem_cnms_cd".trim(), length));
			String[] cmemSealNo = (JSPUtil.getParameter(request, prefix	+ "cmem_seal_no".trim(), length));
			String[] cmemTmlNm = (JSPUtil.getParameter(request, prefix	+ "cmem_tml_nm".trim(), length));
			String[] cmemEdiId = (JSPUtil.getParameter(request, prefix	+ "cmem_edi_id".trim(), length));
			String[] cmemCntrNo = (JSPUtil.getParameter(request, prefix	+ "cmem_cntr_no".trim(), length));
			String[] cmemYd = (JSPUtil.getParameter(request, prefix	+ "cmem_yd".trim(), length));
			String[] cmemPol = (JSPUtil.getParameter(request, prefix	+ "cmem_pol".trim(), length));
			String[] cmemSvcOrdNo = (JSPUtil.getParameter(request, prefix	+ "cmem_svc_ord_no".trim(), length));
			String[] cmemMuidArea = (JSPUtil.getParameter(request, prefix	+ "cmem_muid_area".trim(), length));
			String[] clmArvLoc = (JSPUtil.getParameter(request, prefix	+ "clm_arv_loc".trim(), length));
			String[] cmemMgset = (JSPUtil.getParameter(request, prefix	+ "cmem_mgset".trim(), length));
			String[] cmemPod = (JSPUtil.getParameter(request, prefix	+ "cmem_pod".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] cmemPickupRqdt = (JSPUtil.getParameter(request, prefix	+ "cmem_pickup_rqdt".trim(), length));
			String[] cmemSb = (JSPUtil.getParameter(request, prefix	+ "cmem_sb".trim(), length));
			String[] cmemMuidDt = (JSPUtil.getParameter(request, prefix	+ "cmem_muid_dt".trim(), length));
			String[] cmemBkgNo = (JSPUtil.getParameter(request, prefix	+ "cmem_bkg_no".trim(), length));
			String[] trainNo = (JSPUtil.getParameter(request, prefix	+ "train_no".trim(), length));
			String[] cmemRstFlg = (JSPUtil.getParameter(request, prefix	+ "cmem_rst_flg".trim(), length));
			String[] cmemRtyCnt = (JSPUtil.getParameter(request, prefix	+ "cmem_rty_cnt".trim(), length));
			String[] cmemDptYd = (JSPUtil.getParameter(request, prefix	+ "cmem_dpt_yd".trim(), length));
			String[] cmemBkgCnt = (JSPUtil.getParameter(request, prefix	+ "cmem_bkg_cnt".trim(), length));
			String[] cmemBlNo = (JSPUtil.getParameter(request, prefix	+ "cmem_bl_no".trim(), length));
			String[] cmemModeCd = (JSPUtil.getParameter(request, prefix	+ "cmem_mode_cd".trim(), length));
			String[] cmemChssNo = (JSPUtil.getParameter(request, prefix	+ "cmem_chss_no".trim(), length));
			String[] cmemSightCd = (JSPUtil.getParameter(request, prefix	+ "cmem_sight_cd".trim(), length));
			String[] cnmvWaybillNo = (JSPUtil.getParameter(request, prefix	+ "cnmv_waybill_no".trim(), length));
			String[] cmemMuidSeq = (JSPUtil.getParameter(request, prefix	+ "cmem_muid_seq".trim(), length));
			String[] clmSightCd = (JSPUtil.getParameter(request, prefix	+ "clm_sight_cd".trim(), length));
			String[] cmemMsgId = (JSPUtil.getParameter(request, prefix	+ "cmem_msg_id".trim(), length));
			String[] cmemPor = (JSPUtil.getParameter(request, prefix	+ "cmem_por".trim(), length));
			String[] cmemGateStat = (JSPUtil.getParameter(request, prefix	+ "cmem_gate_stat".trim(), length));
			String[] cmemCntCd = (JSPUtil.getParameter(request, prefix	+ "cmem_cnt_cd".trim(), length));
			String[] cmemFlag = (JSPUtil.getParameter(request, prefix	+ "cmem_flag".trim(), length));
			String[] cmemRmk = (JSPUtil.getParameter(request, prefix	+ "cmem_rmk".trim(), length));
			String[] cmemTol = (JSPUtil.getParameter(request, prefix	+ "cmem_tol".trim(), length));
			String[] cmemDstLoc = (JSPUtil.getParameter(request, prefix	+ "cmem_dst_loc".trim(), length));
			String[] cmemCntrStat = (JSPUtil.getParameter(request, prefix	+ "cmem_cntr_stat".trim(), length));
			String[] clmArvSplc = (JSPUtil.getParameter(request, prefix	+ "clm_arv_splc".trim(), length));
			String[] cmemDel = (JSPUtil.getParameter(request, prefix	+ "cmem_del".trim(), length));
			String[] cmemVoyageNo = (JSPUtil.getParameter(request, prefix	+ "cmem_voyage_no".trim(), length));
			String[] clmDptSplc = (JSPUtil.getParameter(request, prefix	+ "clm_dpt_splc".trim(), length));
			String[] cmemVndrSeq = (JSPUtil.getParameter(request, prefix	+ "cmem_vndr_seq".trim(), length));
			String[] cmem315Flg = (JSPUtil.getParameter(request, prefix	+ "cmem_315_flg".trim(), length));
			String[] cmemBkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "cmem_bkg_no_split".trim(), length));
			String[] cmemDirCd = (JSPUtil.getParameter(request, prefix	+ "cmem_dir_cd".trim(), length));
			String[] cmemVslCd = (JSPUtil.getParameter(request, prefix	+ "cmem_vsl_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] cmemCstCd = (JSPUtil.getParameter(request, prefix	+ "cmem_cst_cd".trim(), length));
			String[] memSysDt = (JSPUtil.getParameter(request, prefix	+ "mem_sys_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CntrMvmtEdiMsg();
				if (cmemDmgFlag[i] != null)
					model.setCmemDmgFlag(cmemDmgFlag[i]);
				if (cnmvPickupNo[i] != null)
					model.setCnmvPickupNo(cnmvPickupNo[i]);
				if (cmemHngrFlg[i] != null)
					model.setCmemHngrFlg(cmemHngrFlg[i]);
				if (clmArvDt[i] != null)
					model.setClmArvDt(clmArvDt[i]);
				if (cmemArvYd[i] != null)
					model.setCmemArvYd(cmemArvYd[i]);
				if (cmemDtTm[i] != null)
					model.setCmemDtTm(cmemDtTm[i]);
				if (cmemActDt[i] != null)
					model.setCmemActDt(cmemActDt[i]);
				if (cmemFlatcarNo[i] != null)
					model.setCmemFlatcarNo(cmemFlatcarNo[i]);
				if (cmemCnmsCd[i] != null)
					model.setCmemCnmsCd(cmemCnmsCd[i]);
				if (cmemSealNo[i] != null)
					model.setCmemSealNo(cmemSealNo[i]);
				if (cmemTmlNm[i] != null)
					model.setCmemTmlNm(cmemTmlNm[i]);
				if (cmemEdiId[i] != null)
					model.setCmemEdiId(cmemEdiId[i]);
				if (cmemCntrNo[i] != null)
					model.setCmemCntrNo(cmemCntrNo[i]);
				if (cmemYd[i] != null)
					model.setCmemYd(cmemYd[i]);
				if (cmemPol[i] != null)
					model.setCmemPol(cmemPol[i]);
				if (cmemSvcOrdNo[i] != null)
					model.setCmemSvcOrdNo(cmemSvcOrdNo[i]);
				if (cmemMuidArea[i] != null)
					model.setCmemMuidArea(cmemMuidArea[i]);
				if (clmArvLoc[i] != null)
					model.setClmArvLoc(clmArvLoc[i]);
				if (cmemMgset[i] != null)
					model.setCmemMgset(cmemMgset[i]);
				if (cmemPod[i] != null)
					model.setCmemPod(cmemPod[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cmemPickupRqdt[i] != null)
					model.setCmemPickupRqdt(cmemPickupRqdt[i]);
				if (cmemSb[i] != null)
					model.setCmemSb(cmemSb[i]);
				if (cmemMuidDt[i] != null)
					model.setCmemMuidDt(cmemMuidDt[i]);
				if (cmemBkgNo[i] != null)
					model.setCmemBkgNo(cmemBkgNo[i]);
				if (trainNo[i] != null)
					model.setTrainNo(trainNo[i]);
				if (cmemRstFlg[i] != null)
					model.setCmemRstFlg(cmemRstFlg[i]);
				if (cmemRtyCnt[i] != null)
					model.setCmemRtyCnt(cmemRtyCnt[i]);
				if (cmemDptYd[i] != null)
					model.setCmemDptYd(cmemDptYd[i]);
				if (cmemBkgCnt[i] != null)
					model.setCmemBkgCnt(cmemBkgCnt[i]);
				if (cmemBlNo[i] != null)
					model.setCmemBlNo(cmemBlNo[i]);
				if (cmemModeCd[i] != null)
					model.setCmemModeCd(cmemModeCd[i]);
				if (cmemChssNo[i] != null)
					model.setCmemChssNo(cmemChssNo[i]);
				if (cmemSightCd[i] != null)
					model.setCmemSightCd(cmemSightCd[i]);
				if (cnmvWaybillNo[i] != null)
					model.setCnmvWaybillNo(cnmvWaybillNo[i]);
				if (cmemMuidSeq[i] != null)
					model.setCmemMuidSeq(cmemMuidSeq[i]);
				if (clmSightCd[i] != null)
					model.setClmSightCd(clmSightCd[i]);
				if (cmemMsgId[i] != null)
					model.setCmemMsgId(cmemMsgId[i]);
				if (cmemPor[i] != null)
					model.setCmemPor(cmemPor[i]);
				if (cmemGateStat[i] != null)
					model.setCmemGateStat(cmemGateStat[i]);
				if (cmemCntCd[i] != null)
					model.setCmemCntCd(cmemCntCd[i]);
				if (cmemFlag[i] != null)
					model.setCmemFlag(cmemFlag[i]);
				if (cmemRmk[i] != null)
					model.setCmemRmk(cmemRmk[i]);
				if (cmemTol[i] != null)
					model.setCmemTol(cmemTol[i]);
				if (cmemDstLoc[i] != null)
					model.setCmemDstLoc(cmemDstLoc[i]);
				if (cmemCntrStat[i] != null)
					model.setCmemCntrStat(cmemCntrStat[i]);
				if (clmArvSplc[i] != null)
					model.setClmArvSplc(clmArvSplc[i]);
				if (cmemDel[i] != null)
					model.setCmemDel(cmemDel[i]);
				if (cmemVoyageNo[i] != null)
					model.setCmemVoyageNo(cmemVoyageNo[i]);
				if (clmDptSplc[i] != null)
					model.setClmDptSplc(clmDptSplc[i]);
				if (cmemVndrSeq[i] != null)
					model.setCmemVndrSeq(cmemVndrSeq[i]);
				if (cmem315Flg[i] != null)
					model.setCmem315Flg(cmem315Flg[i]);
				if (cmemBkgNoSplit[i] != null)
					model.setCmemBkgNoSplit(cmemBkgNoSplit[i]);
				if (cmemDirCd[i] != null)
					model.setCmemDirCd(cmemDirCd[i]);
				if (cmemVslCd[i] != null)
					model.setCmemVslCd(cmemVslCd[i]);
				if (pagerows[i] != null)
					model.setPage_rows(pagerows[i]);
				if (cmemCstCd[i] != null)
					model.setCmemCstCd(cmemCstCd[i]);
				if (memSysDt[i] != null)
					model.setMemSysDt(memSysDt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return models;
	}

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
		} catch (Exception ex) {}
		return ret.toString();
	}

	private String[] getField(Field[] field, int i)
			throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}

}
