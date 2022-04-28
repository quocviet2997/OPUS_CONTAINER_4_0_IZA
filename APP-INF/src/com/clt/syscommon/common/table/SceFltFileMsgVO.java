/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : SceFltFileMsgVO.java
*@FileTitle : SceFltFileMsgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.12
*@LastModifier : 오현경
*@LastVersion : 1.0
* 2010.05.12 오현경 
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
 * @author 오현경
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceFltFileMsgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceFltFileMsgVO> models = new ArrayList<SceFltFileMsgVO>();
	
	/* Column Info */
	private String polDepEstmDt = null;
	/* Column Info */
	private String crntSkdVoyNo = null;
	/* Column Info */
	private String callSkdDirCd = null;
	/* Column Info */
	private String podDepEstmDt = null;
	/* Column Info */
	private String ediRcvSeq = null;
	/* Column Info */
	private String copNo = null;
	/* Column Info */
	private String ediEvntNodCd = null;
	/* Column Info */
	private String custEdiStsCd = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String provTrdPrnrId = null;
	/* Column Info */
	private String ediStndStsCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String custTrdPrnrId = null;
	/* Column Info */
	private String callSkdVoyNo = null;
	/* Column Info */
	private String delNodCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String porDepActDt = null;
	/* Column Info */
	private String ibdTrspNo = null;
	/* Column Info */
	private String ediGrpCd = null;
	/* Column Info */
	private String ediSndHr = null;
	/* Column Info */
	private String podNodCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ediSndSeq = null;
	/* Column Info */
	private String podArrActDt = null;
	/* Column Info */
	private String trnkVslCd = null;
	/* Column Info */
	private String trnkSkdVoyNo = null;
	/* Column Info */
	private String ediSndDt = null;
	/* Column Info */
	private String ediRcvDtlSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String delArrActDt = null;
	/* Column Info */
	private String fltFileRefNo = null;
	/* Column Info */
	private String trnkSkdDirCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String polArrActDt = null;
	/* Column Info */
	private String podArrEstmDt = null;
	/* Column Info */
	private String polArrEstmDt = null;
	/* Column Info */
	private String delArrEstmDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String porNodCd = null;
	/* Column Info */
	private String porDepEstmDt = null;
	/* Column Info */
	private String polNodCd = null;
	/* Column Info */
	private String crntSkdDirCd = null;
	/* Column Info */
	private String podDepActDt = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String polDepActDt = null;
	/* Column Info */
	private String callVslCd = null;
	/* Column Info */
	private String crntVslCd = null;
	/* Column Info */
	private String ediEvntDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceFltFileMsgVO() {}

	public SceFltFileMsgVO(String ibflag, String pagerows, String ediSndDt, String ediSndHr, String ediSndSeq, String fltFileRefNo, String blNo, String bkgNo, String ediEvntNodCd, String ediEvntDt, String porDepEstmDt, String porDepActDt, String polArrEstmDt, String polArrActDt, String polDepEstmDt, String polDepActDt, String podArrEstmDt, String podArrActDt, String podDepEstmDt, String podDepActDt, String delArrEstmDt, String delArrActDt, String porNodCd, String polNodCd, String podNodCd, String delNodCd, String provTrdPrnrId, String custTrdPrnrId, String custEdiStsCd, String ediStndStsCd, String ediGrpCd, String trnkVslCd, String trnkSkdVoyNo, String trnkSkdDirCd, String creUsrId, String creDt, String updUsrId, String updDt, String copNo, String cntrNo, String crntVslCd, String crntSkdVoyNo, String crntSkdDirCd, String callVslCd, String callSkdVoyNo, String callSkdDirCd, String ediRcvSeq, String ediRcvDtlSeq, String ibdTrspNo) {
		this.polDepEstmDt = polDepEstmDt;
		this.crntSkdVoyNo = crntSkdVoyNo;
		this.callSkdDirCd = callSkdDirCd;
		this.podDepEstmDt = podDepEstmDt;
		this.ediRcvSeq = ediRcvSeq;
		this.copNo = copNo;
		this.ediEvntNodCd = ediEvntNodCd;
		this.custEdiStsCd = custEdiStsCd;
		this.blNo = blNo;
		this.provTrdPrnrId = provTrdPrnrId;
		this.ediStndStsCd = ediStndStsCd;
		this.pagerows = pagerows;
		this.custTrdPrnrId = custTrdPrnrId;
		this.callSkdVoyNo = callSkdVoyNo;
		this.delNodCd = delNodCd;
		this.updUsrId = updUsrId;
		this.porDepActDt = porDepActDt;
		this.ibdTrspNo = ibdTrspNo;
		this.ediGrpCd = ediGrpCd;
		this.ediSndHr = ediSndHr;
		this.podNodCd = podNodCd;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.ediSndSeq = ediSndSeq;
		this.podArrActDt = podArrActDt;
		this.trnkVslCd = trnkVslCd;
		this.trnkSkdVoyNo = trnkSkdVoyNo;
		this.ediSndDt = ediSndDt;
		this.ediRcvDtlSeq = ediRcvDtlSeq;
		this.creDt = creDt;
		this.delArrActDt = delArrActDt;
		this.fltFileRefNo = fltFileRefNo;
		this.trnkSkdDirCd = trnkSkdDirCd;
		this.ibflag = ibflag;
		this.polArrActDt = polArrActDt;
		this.podArrEstmDt = podArrEstmDt;
		this.polArrEstmDt = polArrEstmDt;
		this.delArrEstmDt = delArrEstmDt;
		this.updDt = updDt;
		this.porNodCd = porNodCd;
		this.porDepEstmDt = porDepEstmDt;
		this.polNodCd = polNodCd;
		this.crntSkdDirCd = crntSkdDirCd;
		this.podDepActDt = podDepActDt;
		this.cntrNo = cntrNo;
		this.polDepActDt = polDepActDt;
		this.callVslCd = callVslCd;
		this.crntVslCd = crntVslCd;
		this.ediEvntDt = ediEvntDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("pol_dep_estm_dt", getPolDepEstmDt());
		this.hashColumns.put("crnt_skd_voy_no", getCrntSkdVoyNo());
		this.hashColumns.put("call_skd_dir_cd", getCallSkdDirCd());
		this.hashColumns.put("pod_dep_estm_dt", getPodDepEstmDt());
		this.hashColumns.put("edi_rcv_seq", getEdiRcvSeq());
		this.hashColumns.put("cop_no", getCopNo());
		this.hashColumns.put("edi_evnt_nod_cd", getEdiEvntNodCd());
		this.hashColumns.put("cust_edi_sts_cd", getCustEdiStsCd());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("prov_trd_prnr_id", getProvTrdPrnrId());
		this.hashColumns.put("edi_stnd_sts_cd", getEdiStndStsCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cust_trd_prnr_id", getCustTrdPrnrId());
		this.hashColumns.put("call_skd_voy_no", getCallSkdVoyNo());
		this.hashColumns.put("del_nod_cd", getDelNodCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("por_dep_act_dt", getPorDepActDt());
		this.hashColumns.put("ibd_trsp_no", getIbdTrspNo());
		this.hashColumns.put("edi_grp_cd", getEdiGrpCd());
		this.hashColumns.put("edi_snd_hr", getEdiSndHr());
		this.hashColumns.put("pod_nod_cd", getPodNodCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("edi_snd_seq", getEdiSndSeq());
		this.hashColumns.put("pod_arr_act_dt", getPodArrActDt());
		this.hashColumns.put("trnk_vsl_cd", getTrnkVslCd());
		this.hashColumns.put("trnk_skd_voy_no", getTrnkSkdVoyNo());
		this.hashColumns.put("edi_snd_dt", getEdiSndDt());
		this.hashColumns.put("edi_rcv_dtl_seq", getEdiRcvDtlSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("del_arr_act_dt", getDelArrActDt());
		this.hashColumns.put("flt_file_ref_no", getFltFileRefNo());
		this.hashColumns.put("trnk_skd_dir_cd", getTrnkSkdDirCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pol_arr_act_dt", getPolArrActDt());
		this.hashColumns.put("pod_arr_estm_dt", getPodArrEstmDt());
		this.hashColumns.put("pol_arr_estm_dt", getPolArrEstmDt());
		this.hashColumns.put("del_arr_estm_dt", getDelArrEstmDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("por_nod_cd", getPorNodCd());
		this.hashColumns.put("por_dep_estm_dt", getPorDepEstmDt());
		this.hashColumns.put("pol_nod_cd", getPolNodCd());
		this.hashColumns.put("crnt_skd_dir_cd", getCrntSkdDirCd());
		this.hashColumns.put("pod_dep_act_dt", getPodDepActDt());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("pol_dep_act_dt", getPolDepActDt());
		this.hashColumns.put("call_vsl_cd", getCallVslCd());
		this.hashColumns.put("crnt_vsl_cd", getCrntVslCd());
		this.hashColumns.put("edi_evnt_dt", getEdiEvntDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("pol_dep_estm_dt", "polDepEstmDt");
		this.hashFields.put("crnt_skd_voy_no", "crntSkdVoyNo");
		this.hashFields.put("call_skd_dir_cd", "callSkdDirCd");
		this.hashFields.put("pod_dep_estm_dt", "podDepEstmDt");
		this.hashFields.put("edi_rcv_seq", "ediRcvSeq");
		this.hashFields.put("cop_no", "copNo");
		this.hashFields.put("edi_evnt_nod_cd", "ediEvntNodCd");
		this.hashFields.put("cust_edi_sts_cd", "custEdiStsCd");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("prov_trd_prnr_id", "provTrdPrnrId");
		this.hashFields.put("edi_stnd_sts_cd", "ediStndStsCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cust_trd_prnr_id", "custTrdPrnrId");
		this.hashFields.put("call_skd_voy_no", "callSkdVoyNo");
		this.hashFields.put("del_nod_cd", "delNodCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("por_dep_act_dt", "porDepActDt");
		this.hashFields.put("ibd_trsp_no", "ibdTrspNo");
		this.hashFields.put("edi_grp_cd", "ediGrpCd");
		this.hashFields.put("edi_snd_hr", "ediSndHr");
		this.hashFields.put("pod_nod_cd", "podNodCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("edi_snd_seq", "ediSndSeq");
		this.hashFields.put("pod_arr_act_dt", "podArrActDt");
		this.hashFields.put("trnk_vsl_cd", "trnkVslCd");
		this.hashFields.put("trnk_skd_voy_no", "trnkSkdVoyNo");
		this.hashFields.put("edi_snd_dt", "ediSndDt");
		this.hashFields.put("edi_rcv_dtl_seq", "ediRcvDtlSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("del_arr_act_dt", "delArrActDt");
		this.hashFields.put("flt_file_ref_no", "fltFileRefNo");
		this.hashFields.put("trnk_skd_dir_cd", "trnkSkdDirCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pol_arr_act_dt", "polArrActDt");
		this.hashFields.put("pod_arr_estm_dt", "podArrEstmDt");
		this.hashFields.put("pol_arr_estm_dt", "polArrEstmDt");
		this.hashFields.put("del_arr_estm_dt", "delArrEstmDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("por_nod_cd", "porNodCd");
		this.hashFields.put("por_dep_estm_dt", "porDepEstmDt");
		this.hashFields.put("pol_nod_cd", "polNodCd");
		this.hashFields.put("crnt_skd_dir_cd", "crntSkdDirCd");
		this.hashFields.put("pod_dep_act_dt", "podDepActDt");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("pol_dep_act_dt", "polDepActDt");
		this.hashFields.put("call_vsl_cd", "callVslCd");
		this.hashFields.put("crnt_vsl_cd", "crntVslCd");
		this.hashFields.put("edi_evnt_dt", "ediEvntDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return polDepEstmDt
	 */
	public String getPolDepEstmDt() {
		return this.polDepEstmDt;
	}
	
	/**
	 * Column Info
	 * @return crntSkdVoyNo
	 */
	public String getCrntSkdVoyNo() {
		return this.crntSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return callSkdDirCd
	 */
	public String getCallSkdDirCd() {
		return this.callSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return podDepEstmDt
	 */
	public String getPodDepEstmDt() {
		return this.podDepEstmDt;
	}
	
	/**
	 * Column Info
	 * @return ediRcvSeq
	 */
	public String getEdiRcvSeq() {
		return this.ediRcvSeq;
	}
	
	/**
	 * Column Info
	 * @return copNo
	 */
	public String getCopNo() {
		return this.copNo;
	}
	
	/**
	 * Column Info
	 * @return ediEvntNodCd
	 */
	public String getEdiEvntNodCd() {
		return this.ediEvntNodCd;
	}
	
	/**
	 * Column Info
	 * @return custEdiStsCd
	 */
	public String getCustEdiStsCd() {
		return this.custEdiStsCd;
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
	 * @return provTrdPrnrId
	 */
	public String getProvTrdPrnrId() {
		return this.provTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @return ediStndStsCd
	 */
	public String getEdiStndStsCd() {
		return this.ediStndStsCd;
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
	 * @return custTrdPrnrId
	 */
	public String getCustTrdPrnrId() {
		return this.custTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @return callSkdVoyNo
	 */
	public String getCallSkdVoyNo() {
		return this.callSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return delNodCd
	 */
	public String getDelNodCd() {
		return this.delNodCd;
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
	 * @return porDepActDt
	 */
	public String getPorDepActDt() {
		return this.porDepActDt;
	}
	
	/**
	 * Column Info
	 * @return ibdTrspNo
	 */
	public String getIbdTrspNo() {
		return this.ibdTrspNo;
	}
	
	/**
	 * Column Info
	 * @return ediGrpCd
	 */
	public String getEdiGrpCd() {
		return this.ediGrpCd;
	}
	
	/**
	 * Column Info
	 * @return ediSndHr
	 */
	public String getEdiSndHr() {
		return this.ediSndHr;
	}
	
	/**
	 * Column Info
	 * @return podNodCd
	 */
	public String getPodNodCd() {
		return this.podNodCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return ediSndSeq
	 */
	public String getEdiSndSeq() {
		return this.ediSndSeq;
	}
	
	/**
	 * Column Info
	 * @return podArrActDt
	 */
	public String getPodArrActDt() {
		return this.podArrActDt;
	}
	
	/**
	 * Column Info
	 * @return trnkVslCd
	 */
	public String getTrnkVslCd() {
		return this.trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdVoyNo
	 */
	public String getTrnkSkdVoyNo() {
		return this.trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return ediSndDt
	 */
	public String getEdiSndDt() {
		return this.ediSndDt;
	}
	
	/**
	 * Column Info
	 * @return ediRcvDtlSeq
	 */
	public String getEdiRcvDtlSeq() {
		return this.ediRcvDtlSeq;
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
	 * @return delArrActDt
	 */
	public String getDelArrActDt() {
		return this.delArrActDt;
	}
	
	/**
	 * Column Info
	 * @return fltFileRefNo
	 */
	public String getFltFileRefNo() {
		return this.fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @return trnkSkdDirCd
	 */
	public String getTrnkSkdDirCd() {
		return this.trnkSkdDirCd;
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
	 * @return polArrActDt
	 */
	public String getPolArrActDt() {
		return this.polArrActDt;
	}
	
	/**
	 * Column Info
	 * @return podArrEstmDt
	 */
	public String getPodArrEstmDt() {
		return this.podArrEstmDt;
	}
	
	/**
	 * Column Info
	 * @return polArrEstmDt
	 */
	public String getPolArrEstmDt() {
		return this.polArrEstmDt;
	}
	
	/**
	 * Column Info
	 * @return delArrEstmDt
	 */
	public String getDelArrEstmDt() {
		return this.delArrEstmDt;
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
	 * @return porNodCd
	 */
	public String getPorNodCd() {
		return this.porNodCd;
	}
	
	/**
	 * Column Info
	 * @return porDepEstmDt
	 */
	public String getPorDepEstmDt() {
		return this.porDepEstmDt;
	}
	
	/**
	 * Column Info
	 * @return polNodCd
	 */
	public String getPolNodCd() {
		return this.polNodCd;
	}
	
	/**
	 * Column Info
	 * @return crntSkdDirCd
	 */
	public String getCrntSkdDirCd() {
		return this.crntSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return podDepActDt
	 */
	public String getPodDepActDt() {
		return this.podDepActDt;
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
	 * @return polDepActDt
	 */
	public String getPolDepActDt() {
		return this.polDepActDt;
	}
	
	/**
	 * Column Info
	 * @return callVslCd
	 */
	public String getCallVslCd() {
		return this.callVslCd;
	}
	
	/**
	 * Column Info
	 * @return crntVslCd
	 */
	public String getCrntVslCd() {
		return this.crntVslCd;
	}
	
	/**
	 * Column Info
	 * @return ediEvntDt
	 */
	public String getEdiEvntDt() {
		return this.ediEvntDt;
	}
	

	/**
	 * Column Info
	 * @param polDepEstmDt
	 */
	public void setPolDepEstmDt(String polDepEstmDt) {
		this.polDepEstmDt = polDepEstmDt;
	}
	
	/**
	 * Column Info
	 * @param crntSkdVoyNo
	 */
	public void setCrntSkdVoyNo(String crntSkdVoyNo) {
		this.crntSkdVoyNo = crntSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param callSkdDirCd
	 */
	public void setCallSkdDirCd(String callSkdDirCd) {
		this.callSkdDirCd = callSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param podDepEstmDt
	 */
	public void setPodDepEstmDt(String podDepEstmDt) {
		this.podDepEstmDt = podDepEstmDt;
	}
	
	/**
	 * Column Info
	 * @param ediRcvSeq
	 */
	public void setEdiRcvSeq(String ediRcvSeq) {
		this.ediRcvSeq = ediRcvSeq;
	}
	
	/**
	 * Column Info
	 * @param copNo
	 */
	public void setCopNo(String copNo) {
		this.copNo = copNo;
	}
	
	/**
	 * Column Info
	 * @param ediEvntNodCd
	 */
	public void setEdiEvntNodCd(String ediEvntNodCd) {
		this.ediEvntNodCd = ediEvntNodCd;
	}
	
	/**
	 * Column Info
	 * @param custEdiStsCd
	 */
	public void setCustEdiStsCd(String custEdiStsCd) {
		this.custEdiStsCd = custEdiStsCd;
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
	 * @param provTrdPrnrId
	 */
	public void setProvTrdPrnrId(String provTrdPrnrId) {
		this.provTrdPrnrId = provTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @param ediStndStsCd
	 */
	public void setEdiStndStsCd(String ediStndStsCd) {
		this.ediStndStsCd = ediStndStsCd;
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
	 * @param custTrdPrnrId
	 */
	public void setCustTrdPrnrId(String custTrdPrnrId) {
		this.custTrdPrnrId = custTrdPrnrId;
	}
	
	/**
	 * Column Info
	 * @param callSkdVoyNo
	 */
	public void setCallSkdVoyNo(String callSkdVoyNo) {
		this.callSkdVoyNo = callSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param delNodCd
	 */
	public void setDelNodCd(String delNodCd) {
		this.delNodCd = delNodCd;
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
	 * @param porDepActDt
	 */
	public void setPorDepActDt(String porDepActDt) {
		this.porDepActDt = porDepActDt;
	}
	
	/**
	 * Column Info
	 * @param ibdTrspNo
	 */
	public void setIbdTrspNo(String ibdTrspNo) {
		this.ibdTrspNo = ibdTrspNo;
	}
	
	/**
	 * Column Info
	 * @param ediGrpCd
	 */
	public void setEdiGrpCd(String ediGrpCd) {
		this.ediGrpCd = ediGrpCd;
	}
	
	/**
	 * Column Info
	 * @param ediSndHr
	 */
	public void setEdiSndHr(String ediSndHr) {
		this.ediSndHr = ediSndHr;
	}
	
	/**
	 * Column Info
	 * @param podNodCd
	 */
	public void setPodNodCd(String podNodCd) {
		this.podNodCd = podNodCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param ediSndSeq
	 */
	public void setEdiSndSeq(String ediSndSeq) {
		this.ediSndSeq = ediSndSeq;
	}
	
	/**
	 * Column Info
	 * @param podArrActDt
	 */
	public void setPodArrActDt(String podArrActDt) {
		this.podArrActDt = podArrActDt;
	}
	
	/**
	 * Column Info
	 * @param trnkVslCd
	 */
	public void setTrnkVslCd(String trnkVslCd) {
		this.trnkVslCd = trnkVslCd;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdVoyNo
	 */
	public void setTrnkSkdVoyNo(String trnkSkdVoyNo) {
		this.trnkSkdVoyNo = trnkSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param ediSndDt
	 */
	public void setEdiSndDt(String ediSndDt) {
		this.ediSndDt = ediSndDt;
	}
	
	/**
	 * Column Info
	 * @param ediRcvDtlSeq
	 */
	public void setEdiRcvDtlSeq(String ediRcvDtlSeq) {
		this.ediRcvDtlSeq = ediRcvDtlSeq;
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
	 * @param delArrActDt
	 */
	public void setDelArrActDt(String delArrActDt) {
		this.delArrActDt = delArrActDt;
	}
	
	/**
	 * Column Info
	 * @param fltFileRefNo
	 */
	public void setFltFileRefNo(String fltFileRefNo) {
		this.fltFileRefNo = fltFileRefNo;
	}
	
	/**
	 * Column Info
	 * @param trnkSkdDirCd
	 */
	public void setTrnkSkdDirCd(String trnkSkdDirCd) {
		this.trnkSkdDirCd = trnkSkdDirCd;
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
	 * @param polArrActDt
	 */
	public void setPolArrActDt(String polArrActDt) {
		this.polArrActDt = polArrActDt;
	}
	
	/**
	 * Column Info
	 * @param podArrEstmDt
	 */
	public void setPodArrEstmDt(String podArrEstmDt) {
		this.podArrEstmDt = podArrEstmDt;
	}
	
	/**
	 * Column Info
	 * @param polArrEstmDt
	 */
	public void setPolArrEstmDt(String polArrEstmDt) {
		this.polArrEstmDt = polArrEstmDt;
	}
	
	/**
	 * Column Info
	 * @param delArrEstmDt
	 */
	public void setDelArrEstmDt(String delArrEstmDt) {
		this.delArrEstmDt = delArrEstmDt;
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
	 * @param porNodCd
	 */
	public void setPorNodCd(String porNodCd) {
		this.porNodCd = porNodCd;
	}
	
	/**
	 * Column Info
	 * @param porDepEstmDt
	 */
	public void setPorDepEstmDt(String porDepEstmDt) {
		this.porDepEstmDt = porDepEstmDt;
	}
	
	/**
	 * Column Info
	 * @param polNodCd
	 */
	public void setPolNodCd(String polNodCd) {
		this.polNodCd = polNodCd;
	}
	
	/**
	 * Column Info
	 * @param crntSkdDirCd
	 */
	public void setCrntSkdDirCd(String crntSkdDirCd) {
		this.crntSkdDirCd = crntSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param podDepActDt
	 */
	public void setPodDepActDt(String podDepActDt) {
		this.podDepActDt = podDepActDt;
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
	 * @param polDepActDt
	 */
	public void setPolDepActDt(String polDepActDt) {
		this.polDepActDt = polDepActDt;
	}
	
	/**
	 * Column Info
	 * @param callVslCd
	 */
	public void setCallVslCd(String callVslCd) {
		this.callVslCd = callVslCd;
	}
	
	/**
	 * Column Info
	 * @param crntVslCd
	 */
	public void setCrntVslCd(String crntVslCd) {
		this.crntVslCd = crntVslCd;
	}
	
	/**
	 * Column Info
	 * @param ediEvntDt
	 */
	public void setEdiEvntDt(String ediEvntDt) {
		this.ediEvntDt = ediEvntDt;
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
		setPolDepEstmDt(JSPUtil.getParameter(request, prefix + "pol_dep_estm_dt", ""));
		setCrntSkdVoyNo(JSPUtil.getParameter(request, prefix + "crnt_skd_voy_no", ""));
		setCallSkdDirCd(JSPUtil.getParameter(request, prefix + "call_skd_dir_cd", ""));
		setPodDepEstmDt(JSPUtil.getParameter(request, prefix + "pod_dep_estm_dt", ""));
		setEdiRcvSeq(JSPUtil.getParameter(request, prefix + "edi_rcv_seq", ""));
		setCopNo(JSPUtil.getParameter(request, prefix + "cop_no", ""));
		setEdiEvntNodCd(JSPUtil.getParameter(request, prefix + "edi_evnt_nod_cd", ""));
		setCustEdiStsCd(JSPUtil.getParameter(request, prefix + "cust_edi_sts_cd", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setProvTrdPrnrId(JSPUtil.getParameter(request, prefix + "prov_trd_prnr_id", ""));
		setEdiStndStsCd(JSPUtil.getParameter(request, prefix + "edi_stnd_sts_cd", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCustTrdPrnrId(JSPUtil.getParameter(request, prefix + "cust_trd_prnr_id", ""));
		setCallSkdVoyNo(JSPUtil.getParameter(request, prefix + "call_skd_voy_no", ""));
		setDelNodCd(JSPUtil.getParameter(request, prefix + "del_nod_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPorDepActDt(JSPUtil.getParameter(request, prefix + "por_dep_act_dt", ""));
		setIbdTrspNo(JSPUtil.getParameter(request, prefix + "ibd_trsp_no", ""));
		setEdiGrpCd(JSPUtil.getParameter(request, prefix + "edi_grp_cd", ""));
		setEdiSndHr(JSPUtil.getParameter(request, prefix + "edi_snd_hr", ""));
		setPodNodCd(JSPUtil.getParameter(request, prefix + "pod_nod_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setEdiSndSeq(JSPUtil.getParameter(request, prefix + "edi_snd_seq", ""));
		setPodArrActDt(JSPUtil.getParameter(request, prefix + "pod_arr_act_dt", ""));
		setTrnkVslCd(JSPUtil.getParameter(request, prefix + "trnk_vsl_cd", ""));
		setTrnkSkdVoyNo(JSPUtil.getParameter(request, prefix + "trnk_skd_voy_no", ""));
		setEdiSndDt(JSPUtil.getParameter(request, prefix + "edi_snd_dt", ""));
		setEdiRcvDtlSeq(JSPUtil.getParameter(request, prefix + "edi_rcv_dtl_seq", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setDelArrActDt(JSPUtil.getParameter(request, prefix + "del_arr_act_dt", ""));
		setFltFileRefNo(JSPUtil.getParameter(request, prefix + "flt_file_ref_no", ""));
		setTrnkSkdDirCd(JSPUtil.getParameter(request, prefix + "trnk_skd_dir_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPolArrActDt(JSPUtil.getParameter(request, prefix + "pol_arr_act_dt", ""));
		setPodArrEstmDt(JSPUtil.getParameter(request, prefix + "pod_arr_estm_dt", ""));
		setPolArrEstmDt(JSPUtil.getParameter(request, prefix + "pol_arr_estm_dt", ""));
		setDelArrEstmDt(JSPUtil.getParameter(request, prefix + "del_arr_estm_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setPorNodCd(JSPUtil.getParameter(request, prefix + "por_nod_cd", ""));
		setPorDepEstmDt(JSPUtil.getParameter(request, prefix + "por_dep_estm_dt", ""));
		setPolNodCd(JSPUtil.getParameter(request, prefix + "pol_nod_cd", ""));
		setCrntSkdDirCd(JSPUtil.getParameter(request, prefix + "crnt_skd_dir_cd", ""));
		setPodDepActDt(JSPUtil.getParameter(request, prefix + "pod_dep_act_dt", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setPolDepActDt(JSPUtil.getParameter(request, prefix + "pol_dep_act_dt", ""));
		setCallVslCd(JSPUtil.getParameter(request, prefix + "call_vsl_cd", ""));
		setCrntVslCd(JSPUtil.getParameter(request, prefix + "crnt_vsl_cd", ""));
		setEdiEvntDt(JSPUtil.getParameter(request, prefix + "edi_evnt_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceFltFileMsgVO[]
	 */
	public SceFltFileMsgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceFltFileMsgVO[]
	 */
	public SceFltFileMsgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceFltFileMsgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] polDepEstmDt = (JSPUtil.getParameter(request, prefix	+ "pol_dep_estm_dt", length));
			String[] crntSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "crnt_skd_voy_no", length));
			String[] callSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "call_skd_dir_cd", length));
			String[] podDepEstmDt = (JSPUtil.getParameter(request, prefix	+ "pod_dep_estm_dt", length));
			String[] ediRcvSeq = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_seq", length));
			String[] copNo = (JSPUtil.getParameter(request, prefix	+ "cop_no", length));
			String[] ediEvntNodCd = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_nod_cd", length));
			String[] custEdiStsCd = (JSPUtil.getParameter(request, prefix	+ "cust_edi_sts_cd", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] provTrdPrnrId = (JSPUtil.getParameter(request, prefix	+ "prov_trd_prnr_id", length));
			String[] ediStndStsCd = (JSPUtil.getParameter(request, prefix	+ "edi_stnd_sts_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] custTrdPrnrId = (JSPUtil.getParameter(request, prefix	+ "cust_trd_prnr_id", length));
			String[] callSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "call_skd_voy_no", length));
			String[] delNodCd = (JSPUtil.getParameter(request, prefix	+ "del_nod_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] porDepActDt = (JSPUtil.getParameter(request, prefix	+ "por_dep_act_dt", length));
			String[] ibdTrspNo = (JSPUtil.getParameter(request, prefix	+ "ibd_trsp_no", length));
			String[] ediGrpCd = (JSPUtil.getParameter(request, prefix	+ "edi_grp_cd", length));
			String[] ediSndHr = (JSPUtil.getParameter(request, prefix	+ "edi_snd_hr", length));
			String[] podNodCd = (JSPUtil.getParameter(request, prefix	+ "pod_nod_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ediSndSeq = (JSPUtil.getParameter(request, prefix	+ "edi_snd_seq", length));
			String[] podArrActDt = (JSPUtil.getParameter(request, prefix	+ "pod_arr_act_dt", length));
			String[] trnkVslCd = (JSPUtil.getParameter(request, prefix	+ "trnk_vsl_cd", length));
			String[] trnkSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_voy_no", length));
			String[] ediSndDt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_dt", length));
			String[] ediRcvDtlSeq = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_dtl_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] delArrActDt = (JSPUtil.getParameter(request, prefix	+ "del_arr_act_dt", length));
			String[] fltFileRefNo = (JSPUtil.getParameter(request, prefix	+ "flt_file_ref_no", length));
			String[] trnkSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "trnk_skd_dir_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] polArrActDt = (JSPUtil.getParameter(request, prefix	+ "pol_arr_act_dt", length));
			String[] podArrEstmDt = (JSPUtil.getParameter(request, prefix	+ "pod_arr_estm_dt", length));
			String[] polArrEstmDt = (JSPUtil.getParameter(request, prefix	+ "pol_arr_estm_dt", length));
			String[] delArrEstmDt = (JSPUtil.getParameter(request, prefix	+ "del_arr_estm_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] porNodCd = (JSPUtil.getParameter(request, prefix	+ "por_nod_cd", length));
			String[] porDepEstmDt = (JSPUtil.getParameter(request, prefix	+ "por_dep_estm_dt", length));
			String[] polNodCd = (JSPUtil.getParameter(request, prefix	+ "pol_nod_cd", length));
			String[] crntSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "crnt_skd_dir_cd", length));
			String[] podDepActDt = (JSPUtil.getParameter(request, prefix	+ "pod_dep_act_dt", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] polDepActDt = (JSPUtil.getParameter(request, prefix	+ "pol_dep_act_dt", length));
			String[] callVslCd = (JSPUtil.getParameter(request, prefix	+ "call_vsl_cd", length));
			String[] crntVslCd = (JSPUtil.getParameter(request, prefix	+ "crnt_vsl_cd", length));
			String[] ediEvntDt = (JSPUtil.getParameter(request, prefix	+ "edi_evnt_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceFltFileMsgVO();
				if (polDepEstmDt[i] != null)
					model.setPolDepEstmDt(polDepEstmDt[i]);
				if (crntSkdVoyNo[i] != null)
					model.setCrntSkdVoyNo(crntSkdVoyNo[i]);
				if (callSkdDirCd[i] != null)
					model.setCallSkdDirCd(callSkdDirCd[i]);
				if (podDepEstmDt[i] != null)
					model.setPodDepEstmDt(podDepEstmDt[i]);
				if (ediRcvSeq[i] != null)
					model.setEdiRcvSeq(ediRcvSeq[i]);
				if (copNo[i] != null)
					model.setCopNo(copNo[i]);
				if (ediEvntNodCd[i] != null)
					model.setEdiEvntNodCd(ediEvntNodCd[i]);
				if (custEdiStsCd[i] != null)
					model.setCustEdiStsCd(custEdiStsCd[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (provTrdPrnrId[i] != null)
					model.setProvTrdPrnrId(provTrdPrnrId[i]);
				if (ediStndStsCd[i] != null)
					model.setEdiStndStsCd(ediStndStsCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (custTrdPrnrId[i] != null)
					model.setCustTrdPrnrId(custTrdPrnrId[i]);
				if (callSkdVoyNo[i] != null)
					model.setCallSkdVoyNo(callSkdVoyNo[i]);
				if (delNodCd[i] != null)
					model.setDelNodCd(delNodCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (porDepActDt[i] != null)
					model.setPorDepActDt(porDepActDt[i]);
				if (ibdTrspNo[i] != null)
					model.setIbdTrspNo(ibdTrspNo[i]);
				if (ediGrpCd[i] != null)
					model.setEdiGrpCd(ediGrpCd[i]);
				if (ediSndHr[i] != null)
					model.setEdiSndHr(ediSndHr[i]);
				if (podNodCd[i] != null)
					model.setPodNodCd(podNodCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ediSndSeq[i] != null)
					model.setEdiSndSeq(ediSndSeq[i]);
				if (podArrActDt[i] != null)
					model.setPodArrActDt(podArrActDt[i]);
				if (trnkVslCd[i] != null)
					model.setTrnkVslCd(trnkVslCd[i]);
				if (trnkSkdVoyNo[i] != null)
					model.setTrnkSkdVoyNo(trnkSkdVoyNo[i]);
				if (ediSndDt[i] != null)
					model.setEdiSndDt(ediSndDt[i]);
				if (ediRcvDtlSeq[i] != null)
					model.setEdiRcvDtlSeq(ediRcvDtlSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (delArrActDt[i] != null)
					model.setDelArrActDt(delArrActDt[i]);
				if (fltFileRefNo[i] != null)
					model.setFltFileRefNo(fltFileRefNo[i]);
				if (trnkSkdDirCd[i] != null)
					model.setTrnkSkdDirCd(trnkSkdDirCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (polArrActDt[i] != null)
					model.setPolArrActDt(polArrActDt[i]);
				if (podArrEstmDt[i] != null)
					model.setPodArrEstmDt(podArrEstmDt[i]);
				if (polArrEstmDt[i] != null)
					model.setPolArrEstmDt(polArrEstmDt[i]);
				if (delArrEstmDt[i] != null)
					model.setDelArrEstmDt(delArrEstmDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (porNodCd[i] != null)
					model.setPorNodCd(porNodCd[i]);
				if (porDepEstmDt[i] != null)
					model.setPorDepEstmDt(porDepEstmDt[i]);
				if (polNodCd[i] != null)
					model.setPolNodCd(polNodCd[i]);
				if (crntSkdDirCd[i] != null)
					model.setCrntSkdDirCd(crntSkdDirCd[i]);
				if (podDepActDt[i] != null)
					model.setPodDepActDt(podDepActDt[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (polDepActDt[i] != null)
					model.setPolDepActDt(polDepActDt[i]);
				if (callVslCd[i] != null)
					model.setCallVslCd(callVslCd[i]);
				if (crntVslCd[i] != null)
					model.setCrntVslCd(crntVslCd[i]);
				if (ediEvntDt[i] != null)
					model.setEdiEvntDt(ediEvntDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceFltFileMsgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceFltFileMsgVO[]
	 */
	public SceFltFileMsgVO[] getSceFltFileMsgVOs(){
		SceFltFileMsgVO[] vos = (SceFltFileMsgVO[])models.toArray(new SceFltFileMsgVO[models.size()]);
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
		this.polDepEstmDt = this.polDepEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntSkdVoyNo = this.crntSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSkdDirCd = this.callSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podDepEstmDt = this.podDepEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvSeq = this.ediRcvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copNo = this.copNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntNodCd = this.ediEvntNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custEdiStsCd = this.custEdiStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.provTrdPrnrId = this.provTrdPrnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediStndStsCd = this.ediStndStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTrdPrnrId = this.custTrdPrnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callSkdVoyNo = this.callSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delNodCd = this.delNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porDepActDt = this.porDepActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibdTrspNo = this.ibdTrspNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediGrpCd = this.ediGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndHr = this.ediSndHr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podNodCd = this.podNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndSeq = this.ediSndSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podArrActDt = this.podArrActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkVslCd = this.trnkVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdVoyNo = this.trnkSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndDt = this.ediSndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvDtlSeq = this.ediRcvDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delArrActDt = this.delArrActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fltFileRefNo = this.fltFileRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trnkSkdDirCd = this.trnkSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polArrActDt = this.polArrActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podArrEstmDt = this.podArrEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polArrEstmDt = this.polArrEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delArrEstmDt = this.delArrEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porNodCd = this.porNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porDepEstmDt = this.porDepEstmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polNodCd = this.polNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntSkdDirCd = this.crntSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podDepActDt = this.podDepActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polDepActDt = this.polDepActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.callVslCd = this.callVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crntVslCd = this.crntVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediEvntDt = this.ediEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
