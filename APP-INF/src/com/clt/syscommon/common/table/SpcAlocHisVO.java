/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpcAlocHisVO.java
*@FileTitle : SpcAlocHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 최윤성
*@LastVersion : 1.0
* 2009.07.23 최윤성 
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
 * @author 최윤성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SpcAlocHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpcAlocHisVO> models = new ArrayList<SpcAlocHisVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String bkgAval40ftQty = null;
	/* Column Info */
	private String asgnTtlWgt = null;
	/* Column Info */
	private String alocTtlWgt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String repTrdCd = null;
	/* Column Info */
	private String modiUsrId = null;
	/* Column Info */
	private String asgnRfQty = null;
	/* Column Info */
	private String usdBkg40ftQty = null;
	/* Column Info */
	private String bkgAvalTtlWgt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mnlAlocRmk = null;
	/* Column Info */
	private String slsOfcCd = null;
	/* Column Info */
	private String alocUsrId = null;
	/* Column Info */
	private String aloc45ftHcQty = null;
	/* Column Info */
	private String asgn40ftQty = null;
	/* Column Info */
	private String usdBkg40ftHcQty = null;
	/* Column Info */
	private String bkgAvalRfQty = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String modiSeq = null;
	/* Column Info */
	private String custSpcGnteQty = null;
	/* Column Info */
	private String asgn20ftQty = null;
	/* Column Info */
	private String modiGdt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String slsRhqCd = null;
	/* Column Info */
	private String fcastRfQty = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String usdBkg45ftHcQty = null;
	/* Column Info */
	private String alocGdt = null;
	/* Column Info */
	private String fcast40ftHcQty = null;
	/* Column Info */
	private String subTrdCd = null;
	/* Column Info */
	private String asgn45ftHcQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String usdBkg20ftQty = null;
	/* Column Info */
	private String alocLodQty = null;
	/* Column Info */
	private String bkgAval40ftHcQty = null;
	/* Column Info */
	private String alocRfQty = null;
	/* Column Info */
	private String asgnTtlQty = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String tsFlg = null;
	/* Column Info */
	private String fcastTtlQty = null;
	/* Column Info */
	private String usdBkgRfQty = null;
	/* Column Info */
	private String usdBkgTtlQty = null;
	/* Column Info */
	private String aloc40ftHcQty = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String fcastTtlWgt = null;
	/* Column Info */
	private String podYdCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String iocTsCd = null;
	/* Column Info */
	private String asgn40ftHcQty = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Column Info */
	private String bkgAvalTtlQty = null;
	/* Column Info */
	private String bkgAval45ftHcQty = null;
	/* Column Info */
	private String bkgAval20ftQty = null;
	/* Column Info */
	private String fcast45ftHcQty = null;
	/* Column Info */
	private String polYdCd = null;
	/* Column Info */
	private String usdBkgTtlWgt = null;
	/* Column Info */
	private String slsRgnOfcCd = null;
	/* Column Info */
	private String repSubTrdCd = null;
	/* Column Info */
	private String mnlFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpcAlocHisVO() {}

	public SpcAlocHisVO(String ibflag, String pagerows, String rlaneCd, String dirCd, String vslCd, String skdVoyNo, String skdDirCd, String slsOfcCd, String polYdCd, String podYdCd, String tsFlg, String mnlFlg, String modiSeq, String repTrdCd, String repSubTrdCd, String trdCd, String subTrdCd, String iocCd, String slsRhqCd, String slsRgnOfcCd, String asgnTtlQty, String asgn20ftQty, String asgn40ftQty, String asgn40ftHcQty, String asgn45ftHcQty, String asgnRfQty, String asgnTtlWgt, String bkgAvalTtlQty, String bkgAval20ftQty, String bkgAval40ftQty, String bkgAval40ftHcQty, String bkgAval45ftHcQty, String bkgAvalRfQty, String bkgAvalTtlWgt, String alocUsrId, String alocGdt, String custSpcGnteQty, String modiUsrId, String modiGdt, String mnlAlocRmk, String iocTsCd, String fcastTtlQty, String fcast40ftHcQty, String fcast45ftHcQty, String fcastRfQty, String fcastTtlWgt, String usdBkgTtlQty, String usdBkg20ftQty, String usdBkg40ftQty, String usdBkg40ftHcQty, String usdBkg45ftHcQty, String usdBkgRfQty, String usdBkgTtlWgt, String alocLodQty, String aloc40ftHcQty, String aloc45ftHcQty, String alocRfQty, String alocTtlWgt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.vslCd = vslCd;
		this.bkgAval40ftQty = bkgAval40ftQty;
		this.asgnTtlWgt = asgnTtlWgt;
		this.alocTtlWgt = alocTtlWgt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.repTrdCd = repTrdCd;
		this.modiUsrId = modiUsrId;
		this.asgnRfQty = asgnRfQty;
		this.usdBkg40ftQty = usdBkg40ftQty;
		this.bkgAvalTtlWgt = bkgAvalTtlWgt;
		this.pagerows = pagerows;
		this.mnlAlocRmk = mnlAlocRmk;
		this.slsOfcCd = slsOfcCd;
		this.alocUsrId = alocUsrId;
		this.aloc45ftHcQty = aloc45ftHcQty;
		this.asgn40ftQty = asgn40ftQty;
		this.usdBkg40ftHcQty = usdBkg40ftHcQty;
		this.bkgAvalRfQty = bkgAvalRfQty;
		this.updUsrId = updUsrId;
		this.modiSeq = modiSeq;
		this.custSpcGnteQty = custSpcGnteQty;
		this.asgn20ftQty = asgn20ftQty;
		this.modiGdt = modiGdt;
		this.skdVoyNo = skdVoyNo;
		this.slsRhqCd = slsRhqCd;
		this.fcastRfQty = fcastRfQty;
		this.creUsrId = creUsrId;
		this.usdBkg45ftHcQty = usdBkg45ftHcQty;
		this.alocGdt = alocGdt;
		this.fcast40ftHcQty = fcast40ftHcQty;
		this.subTrdCd = subTrdCd;
		this.asgn45ftHcQty = asgn45ftHcQty;
		this.creDt = creDt;
		this.usdBkg20ftQty = usdBkg20ftQty;
		this.alocLodQty = alocLodQty;
		this.bkgAval40ftHcQty = bkgAval40ftHcQty;
		this.alocRfQty = alocRfQty;
		this.asgnTtlQty = asgnTtlQty;
		this.ibflag = ibflag;
		this.tsFlg = tsFlg;
		this.fcastTtlQty = fcastTtlQty;
		this.usdBkgRfQty = usdBkgRfQty;
		this.usdBkgTtlQty = usdBkgTtlQty;
		this.aloc40ftHcQty = aloc40ftHcQty;
		this.dirCd = dirCd;
		this.fcastTtlWgt = fcastTtlWgt;
		this.podYdCd = podYdCd;
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.iocTsCd = iocTsCd;
		this.asgn40ftHcQty = asgn40ftHcQty;
		this.skdDirCd = skdDirCd;
		this.bkgAvalTtlQty = bkgAvalTtlQty;
		this.bkgAval45ftHcQty = bkgAval45ftHcQty;
		this.bkgAval20ftQty = bkgAval20ftQty;
		this.fcast45ftHcQty = fcast45ftHcQty;
		this.polYdCd = polYdCd;
		this.usdBkgTtlWgt = usdBkgTtlWgt;
		this.slsRgnOfcCd = slsRgnOfcCd;
		this.repSubTrdCd = repSubTrdCd;
		this.mnlFlg = mnlFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("bkg_aval_40ft_qty", getBkgAval40ftQty());
		this.hashColumns.put("asgn_ttl_wgt", getAsgnTtlWgt());
		this.hashColumns.put("aloc_ttl_wgt", getAlocTtlWgt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("rep_trd_cd", getRepTrdCd());
		this.hashColumns.put("modi_usr_id", getModiUsrId());
		this.hashColumns.put("asgn_rf_qty", getAsgnRfQty());
		this.hashColumns.put("usd_bkg_40ft_qty", getUsdBkg40ftQty());
		this.hashColumns.put("bkg_aval_ttl_wgt", getBkgAvalTtlWgt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mnl_aloc_rmk", getMnlAlocRmk());
		this.hashColumns.put("sls_ofc_cd", getSlsOfcCd());
		this.hashColumns.put("aloc_usr_id", getAlocUsrId());
		this.hashColumns.put("aloc_45ft_hc_qty", getAloc45ftHcQty());
		this.hashColumns.put("asgn_40ft_qty", getAsgn40ftQty());
		this.hashColumns.put("usd_bkg_40ft_hc_qty", getUsdBkg40ftHcQty());
		this.hashColumns.put("bkg_aval_rf_qty", getBkgAvalRfQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("modi_seq", getModiSeq());
		this.hashColumns.put("cust_spc_gnte_qty", getCustSpcGnteQty());
		this.hashColumns.put("asgn_20ft_qty", getAsgn20ftQty());
		this.hashColumns.put("modi_gdt", getModiGdt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("sls_rhq_cd", getSlsRhqCd());
		this.hashColumns.put("fcast_rf_qty", getFcastRfQty());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("usd_bkg_45ft_hc_qty", getUsdBkg45ftHcQty());
		this.hashColumns.put("aloc_gdt", getAlocGdt());
		this.hashColumns.put("fcast_40ft_hc_qty", getFcast40ftHcQty());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		this.hashColumns.put("asgn_45ft_hc_qty", getAsgn45ftHcQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("usd_bkg_20ft_qty", getUsdBkg20ftQty());
		this.hashColumns.put("aloc_lod_qty", getAlocLodQty());
		this.hashColumns.put("bkg_aval_40ft_hc_qty", getBkgAval40ftHcQty());
		this.hashColumns.put("aloc_rf_qty", getAlocRfQty());
		this.hashColumns.put("asgn_ttl_qty", getAsgnTtlQty());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ts_flg", getTsFlg());
		this.hashColumns.put("fcast_ttl_qty", getFcastTtlQty());
		this.hashColumns.put("usd_bkg_rf_qty", getUsdBkgRfQty());
		this.hashColumns.put("usd_bkg_ttl_qty", getUsdBkgTtlQty());
		this.hashColumns.put("aloc_40ft_hc_qty", getAloc40ftHcQty());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("fcast_ttl_wgt", getFcastTtlWgt());
		this.hashColumns.put("pod_yd_cd", getPodYdCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("ioc_ts_cd", getIocTsCd());
		this.hashColumns.put("asgn_40ft_hc_qty", getAsgn40ftHcQty());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("bkg_aval_ttl_qty", getBkgAvalTtlQty());
		this.hashColumns.put("bkg_aval_45ft_hc_qty", getBkgAval45ftHcQty());
		this.hashColumns.put("bkg_aval_20ft_qty", getBkgAval20ftQty());
		this.hashColumns.put("fcast_45ft_hc_qty", getFcast45ftHcQty());
		this.hashColumns.put("pol_yd_cd", getPolYdCd());
		this.hashColumns.put("usd_bkg_ttl_wgt", getUsdBkgTtlWgt());
		this.hashColumns.put("sls_rgn_ofc_cd", getSlsRgnOfcCd());
		this.hashColumns.put("rep_sub_trd_cd", getRepSubTrdCd());
		this.hashColumns.put("mnl_flg", getMnlFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bkg_aval_40ft_qty", "bkgAval40ftQty");
		this.hashFields.put("asgn_ttl_wgt", "asgnTtlWgt");
		this.hashFields.put("aloc_ttl_wgt", "alocTtlWgt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("rep_trd_cd", "repTrdCd");
		this.hashFields.put("modi_usr_id", "modiUsrId");
		this.hashFields.put("asgn_rf_qty", "asgnRfQty");
		this.hashFields.put("usd_bkg_40ft_qty", "usdBkg40ftQty");
		this.hashFields.put("bkg_aval_ttl_wgt", "bkgAvalTtlWgt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mnl_aloc_rmk", "mnlAlocRmk");
		this.hashFields.put("sls_ofc_cd", "slsOfcCd");
		this.hashFields.put("aloc_usr_id", "alocUsrId");
		this.hashFields.put("aloc_45ft_hc_qty", "aloc45ftHcQty");
		this.hashFields.put("asgn_40ft_qty", "asgn40ftQty");
		this.hashFields.put("usd_bkg_40ft_hc_qty", "usdBkg40ftHcQty");
		this.hashFields.put("bkg_aval_rf_qty", "bkgAvalRfQty");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("modi_seq", "modiSeq");
		this.hashFields.put("cust_spc_gnte_qty", "custSpcGnteQty");
		this.hashFields.put("asgn_20ft_qty", "asgn20ftQty");
		this.hashFields.put("modi_gdt", "modiGdt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("sls_rhq_cd", "slsRhqCd");
		this.hashFields.put("fcast_rf_qty", "fcastRfQty");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("usd_bkg_45ft_hc_qty", "usdBkg45ftHcQty");
		this.hashFields.put("aloc_gdt", "alocGdt");
		this.hashFields.put("fcast_40ft_hc_qty", "fcast40ftHcQty");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
		this.hashFields.put("asgn_45ft_hc_qty", "asgn45ftHcQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("usd_bkg_20ft_qty", "usdBkg20ftQty");
		this.hashFields.put("aloc_lod_qty", "alocLodQty");
		this.hashFields.put("bkg_aval_40ft_hc_qty", "bkgAval40ftHcQty");
		this.hashFields.put("aloc_rf_qty", "alocRfQty");
		this.hashFields.put("asgn_ttl_qty", "asgnTtlQty");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ts_flg", "tsFlg");
		this.hashFields.put("fcast_ttl_qty", "fcastTtlQty");
		this.hashFields.put("usd_bkg_rf_qty", "usdBkgRfQty");
		this.hashFields.put("usd_bkg_ttl_qty", "usdBkgTtlQty");
		this.hashFields.put("aloc_40ft_hc_qty", "aloc40ftHcQty");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("fcast_ttl_wgt", "fcastTtlWgt");
		this.hashFields.put("pod_yd_cd", "podYdCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("ioc_ts_cd", "iocTsCd");
		this.hashFields.put("asgn_40ft_hc_qty", "asgn40ftHcQty");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("bkg_aval_ttl_qty", "bkgAvalTtlQty");
		this.hashFields.put("bkg_aval_45ft_hc_qty", "bkgAval45ftHcQty");
		this.hashFields.put("bkg_aval_20ft_qty", "bkgAval20ftQty");
		this.hashFields.put("fcast_45ft_hc_qty", "fcast45ftHcQty");
		this.hashFields.put("pol_yd_cd", "polYdCd");
		this.hashFields.put("usd_bkg_ttl_wgt", "usdBkgTtlWgt");
		this.hashFields.put("sls_rgn_ofc_cd", "slsRgnOfcCd");
		this.hashFields.put("rep_sub_trd_cd", "repSubTrdCd");
		this.hashFields.put("mnl_flg", "mnlFlg");
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
	 * @return bkgAval40ftQty
	 */
	public String getBkgAval40ftQty() {
		return this.bkgAval40ftQty;
	}
	
	/**
	 * Column Info
	 * @return asgnTtlWgt
	 */
	public String getAsgnTtlWgt() {
		return this.asgnTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return alocTtlWgt
	 */
	public String getAlocTtlWgt() {
		return this.alocTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return repTrdCd
	 */
	public String getRepTrdCd() {
		return this.repTrdCd;
	}
	
	/**
	 * Column Info
	 * @return modiUsrId
	 */
	public String getModiUsrId() {
		return this.modiUsrId;
	}
	
	/**
	 * Column Info
	 * @return asgnRfQty
	 */
	public String getAsgnRfQty() {
		return this.asgnRfQty;
	}
	
	/**
	 * Column Info
	 * @return usdBkg40ftQty
	 */
	public String getUsdBkg40ftQty() {
		return this.usdBkg40ftQty;
	}
	
	/**
	 * Column Info
	 * @return bkgAvalTtlWgt
	 */
	public String getBkgAvalTtlWgt() {
		return this.bkgAvalTtlWgt;
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
	 * @return mnlAlocRmk
	 */
	public String getMnlAlocRmk() {
		return this.mnlAlocRmk;
	}
	
	/**
	 * Column Info
	 * @return slsOfcCd
	 */
	public String getSlsOfcCd() {
		return this.slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return alocUsrId
	 */
	public String getAlocUsrId() {
		return this.alocUsrId;
	}
	
	/**
	 * Column Info
	 * @return aloc45ftHcQty
	 */
	public String getAloc45ftHcQty() {
		return this.aloc45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return asgn40ftQty
	 */
	public String getAsgn40ftQty() {
		return this.asgn40ftQty;
	}
	
	/**
	 * Column Info
	 * @return usdBkg40ftHcQty
	 */
	public String getUsdBkg40ftHcQty() {
		return this.usdBkg40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return bkgAvalRfQty
	 */
	public String getBkgAvalRfQty() {
		return this.bkgAvalRfQty;
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
	 * @return modiSeq
	 */
	public String getModiSeq() {
		return this.modiSeq;
	}
	
	/**
	 * Column Info
	 * @return custSpcGnteQty
	 */
	public String getCustSpcGnteQty() {
		return this.custSpcGnteQty;
	}
	
	/**
	 * Column Info
	 * @return asgn20ftQty
	 */
	public String getAsgn20ftQty() {
		return this.asgn20ftQty;
	}
	
	/**
	 * Column Info
	 * @return modiGdt
	 */
	public String getModiGdt() {
		return this.modiGdt;
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
	 * @return slsRhqCd
	 */
	public String getSlsRhqCd() {
		return this.slsRhqCd;
	}
	
	/**
	 * Column Info
	 * @return fcastRfQty
	 */
	public String getFcastRfQty() {
		return this.fcastRfQty;
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
	 * @return usdBkg45ftHcQty
	 */
	public String getUsdBkg45ftHcQty() {
		return this.usdBkg45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return alocGdt
	 */
	public String getAlocGdt() {
		return this.alocGdt;
	}
	
	/**
	 * Column Info
	 * @return fcast40ftHcQty
	 */
	public String getFcast40ftHcQty() {
		return this.fcast40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
	}
	
	/**
	 * Column Info
	 * @return asgn45ftHcQty
	 */
	public String getAsgn45ftHcQty() {
		return this.asgn45ftHcQty;
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
	 * @return usdBkg20ftQty
	 */
	public String getUsdBkg20ftQty() {
		return this.usdBkg20ftQty;
	}
	
	/**
	 * Column Info
	 * @return alocLodQty
	 */
	public String getAlocLodQty() {
		return this.alocLodQty;
	}
	
	/**
	 * Column Info
	 * @return bkgAval40ftHcQty
	 */
	public String getBkgAval40ftHcQty() {
		return this.bkgAval40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return alocRfQty
	 */
	public String getAlocRfQty() {
		return this.alocRfQty;
	}
	
	/**
	 * Column Info
	 * @return asgnTtlQty
	 */
	public String getAsgnTtlQty() {
		return this.asgnTtlQty;
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
	 * @return tsFlg
	 */
	public String getTsFlg() {
		return this.tsFlg;
	}
	
	/**
	 * Column Info
	 * @return fcastTtlQty
	 */
	public String getFcastTtlQty() {
		return this.fcastTtlQty;
	}
	
	/**
	 * Column Info
	 * @return usdBkgRfQty
	 */
	public String getUsdBkgRfQty() {
		return this.usdBkgRfQty;
	}
	
	/**
	 * Column Info
	 * @return usdBkgTtlQty
	 */
	public String getUsdBkgTtlQty() {
		return this.usdBkgTtlQty;
	}
	
	/**
	 * Column Info
	 * @return aloc40ftHcQty
	 */
	public String getAloc40ftHcQty() {
		return this.aloc40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return fcastTtlWgt
	 */
	public String getFcastTtlWgt() {
		return this.fcastTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return podYdCd
	 */
	public String getPodYdCd() {
		return this.podYdCd;
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
	}
	
	/**
	 * Column Info
	 * @return iocTsCd
	 */
	public String getIocTsCd() {
		return this.iocTsCd;
	}
	
	/**
	 * Column Info
	 * @return asgn40ftHcQty
	 */
	public String getAsgn40ftHcQty() {
		return this.asgn40ftHcQty;
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
	 * @return bkgAvalTtlQty
	 */
	public String getBkgAvalTtlQty() {
		return this.bkgAvalTtlQty;
	}
	
	/**
	 * Column Info
	 * @return bkgAval45ftHcQty
	 */
	public String getBkgAval45ftHcQty() {
		return this.bkgAval45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return bkgAval20ftQty
	 */
	public String getBkgAval20ftQty() {
		return this.bkgAval20ftQty;
	}
	
	/**
	 * Column Info
	 * @return fcast45ftHcQty
	 */
	public String getFcast45ftHcQty() {
		return this.fcast45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @return polYdCd
	 */
	public String getPolYdCd() {
		return this.polYdCd;
	}
	
	/**
	 * Column Info
	 * @return usdBkgTtlWgt
	 */
	public String getUsdBkgTtlWgt() {
		return this.usdBkgTtlWgt;
	}
	
	/**
	 * Column Info
	 * @return slsRgnOfcCd
	 */
	public String getSlsRgnOfcCd() {
		return this.slsRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @return repSubTrdCd
	 */
	public String getRepSubTrdCd() {
		return this.repSubTrdCd;
	}
	
	/**
	 * Column Info
	 * @return mnlFlg
	 */
	public String getMnlFlg() {
		return this.mnlFlg;
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
	 * @param bkgAval40ftQty
	 */
	public void setBkgAval40ftQty(String bkgAval40ftQty) {
		this.bkgAval40ftQty = bkgAval40ftQty;
	}
	
	/**
	 * Column Info
	 * @param asgnTtlWgt
	 */
	public void setAsgnTtlWgt(String asgnTtlWgt) {
		this.asgnTtlWgt = asgnTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param alocTtlWgt
	 */
	public void setAlocTtlWgt(String alocTtlWgt) {
		this.alocTtlWgt = alocTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param repTrdCd
	 */
	public void setRepTrdCd(String repTrdCd) {
		this.repTrdCd = repTrdCd;
	}
	
	/**
	 * Column Info
	 * @param modiUsrId
	 */
	public void setModiUsrId(String modiUsrId) {
		this.modiUsrId = modiUsrId;
	}
	
	/**
	 * Column Info
	 * @param asgnRfQty
	 */
	public void setAsgnRfQty(String asgnRfQty) {
		this.asgnRfQty = asgnRfQty;
	}
	
	/**
	 * Column Info
	 * @param usdBkg40ftQty
	 */
	public void setUsdBkg40ftQty(String usdBkg40ftQty) {
		this.usdBkg40ftQty = usdBkg40ftQty;
	}
	
	/**
	 * Column Info
	 * @param bkgAvalTtlWgt
	 */
	public void setBkgAvalTtlWgt(String bkgAvalTtlWgt) {
		this.bkgAvalTtlWgt = bkgAvalTtlWgt;
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
	 * @param mnlAlocRmk
	 */
	public void setMnlAlocRmk(String mnlAlocRmk) {
		this.mnlAlocRmk = mnlAlocRmk;
	}
	
	/**
	 * Column Info
	 * @param slsOfcCd
	 */
	public void setSlsOfcCd(String slsOfcCd) {
		this.slsOfcCd = slsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param alocUsrId
	 */
	public void setAlocUsrId(String alocUsrId) {
		this.alocUsrId = alocUsrId;
	}
	
	/**
	 * Column Info
	 * @param aloc45ftHcQty
	 */
	public void setAloc45ftHcQty(String aloc45ftHcQty) {
		this.aloc45ftHcQty = aloc45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param asgn40ftQty
	 */
	public void setAsgn40ftQty(String asgn40ftQty) {
		this.asgn40ftQty = asgn40ftQty;
	}
	
	/**
	 * Column Info
	 * @param usdBkg40ftHcQty
	 */
	public void setUsdBkg40ftHcQty(String usdBkg40ftHcQty) {
		this.usdBkg40ftHcQty = usdBkg40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param bkgAvalRfQty
	 */
	public void setBkgAvalRfQty(String bkgAvalRfQty) {
		this.bkgAvalRfQty = bkgAvalRfQty;
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
	 * @param modiSeq
	 */
	public void setModiSeq(String modiSeq) {
		this.modiSeq = modiSeq;
	}
	
	/**
	 * Column Info
	 * @param custSpcGnteQty
	 */
	public void setCustSpcGnteQty(String custSpcGnteQty) {
		this.custSpcGnteQty = custSpcGnteQty;
	}
	
	/**
	 * Column Info
	 * @param asgn20ftQty
	 */
	public void setAsgn20ftQty(String asgn20ftQty) {
		this.asgn20ftQty = asgn20ftQty;
	}
	
	/**
	 * Column Info
	 * @param modiGdt
	 */
	public void setModiGdt(String modiGdt) {
		this.modiGdt = modiGdt;
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
	 * @param slsRhqCd
	 */
	public void setSlsRhqCd(String slsRhqCd) {
		this.slsRhqCd = slsRhqCd;
	}
	
	/**
	 * Column Info
	 * @param fcastRfQty
	 */
	public void setFcastRfQty(String fcastRfQty) {
		this.fcastRfQty = fcastRfQty;
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
	 * @param usdBkg45ftHcQty
	 */
	public void setUsdBkg45ftHcQty(String usdBkg45ftHcQty) {
		this.usdBkg45ftHcQty = usdBkg45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param alocGdt
	 */
	public void setAlocGdt(String alocGdt) {
		this.alocGdt = alocGdt;
	}
	
	/**
	 * Column Info
	 * @param fcast40ftHcQty
	 */
	public void setFcast40ftHcQty(String fcast40ftHcQty) {
		this.fcast40ftHcQty = fcast40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Column Info
	 * @param asgn45ftHcQty
	 */
	public void setAsgn45ftHcQty(String asgn45ftHcQty) {
		this.asgn45ftHcQty = asgn45ftHcQty;
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
	 * @param usdBkg20ftQty
	 */
	public void setUsdBkg20ftQty(String usdBkg20ftQty) {
		this.usdBkg20ftQty = usdBkg20ftQty;
	}
	
	/**
	 * Column Info
	 * @param alocLodQty
	 */
	public void setAlocLodQty(String alocLodQty) {
		this.alocLodQty = alocLodQty;
	}
	
	/**
	 * Column Info
	 * @param bkgAval40ftHcQty
	 */
	public void setBkgAval40ftHcQty(String bkgAval40ftHcQty) {
		this.bkgAval40ftHcQty = bkgAval40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param alocRfQty
	 */
	public void setAlocRfQty(String alocRfQty) {
		this.alocRfQty = alocRfQty;
	}
	
	/**
	 * Column Info
	 * @param asgnTtlQty
	 */
	public void setAsgnTtlQty(String asgnTtlQty) {
		this.asgnTtlQty = asgnTtlQty;
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
	 * @param tsFlg
	 */
	public void setTsFlg(String tsFlg) {
		this.tsFlg = tsFlg;
	}
	
	/**
	 * Column Info
	 * @param fcastTtlQty
	 */
	public void setFcastTtlQty(String fcastTtlQty) {
		this.fcastTtlQty = fcastTtlQty;
	}
	
	/**
	 * Column Info
	 * @param usdBkgRfQty
	 */
	public void setUsdBkgRfQty(String usdBkgRfQty) {
		this.usdBkgRfQty = usdBkgRfQty;
	}
	
	/**
	 * Column Info
	 * @param usdBkgTtlQty
	 */
	public void setUsdBkgTtlQty(String usdBkgTtlQty) {
		this.usdBkgTtlQty = usdBkgTtlQty;
	}
	
	/**
	 * Column Info
	 * @param aloc40ftHcQty
	 */
	public void setAloc40ftHcQty(String aloc40ftHcQty) {
		this.aloc40ftHcQty = aloc40ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param fcastTtlWgt
	 */
	public void setFcastTtlWgt(String fcastTtlWgt) {
		this.fcastTtlWgt = fcastTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param podYdCd
	 */
	public void setPodYdCd(String podYdCd) {
		this.podYdCd = podYdCd;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
	}
	
	/**
	 * Column Info
	 * @param iocTsCd
	 */
	public void setIocTsCd(String iocTsCd) {
		this.iocTsCd = iocTsCd;
	}
	
	/**
	 * Column Info
	 * @param asgn40ftHcQty
	 */
	public void setAsgn40ftHcQty(String asgn40ftHcQty) {
		this.asgn40ftHcQty = asgn40ftHcQty;
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
	 * @param bkgAvalTtlQty
	 */
	public void setBkgAvalTtlQty(String bkgAvalTtlQty) {
		this.bkgAvalTtlQty = bkgAvalTtlQty;
	}
	
	/**
	 * Column Info
	 * @param bkgAval45ftHcQty
	 */
	public void setBkgAval45ftHcQty(String bkgAval45ftHcQty) {
		this.bkgAval45ftHcQty = bkgAval45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param bkgAval20ftQty
	 */
	public void setBkgAval20ftQty(String bkgAval20ftQty) {
		this.bkgAval20ftQty = bkgAval20ftQty;
	}
	
	/**
	 * Column Info
	 * @param fcast45ftHcQty
	 */
	public void setFcast45ftHcQty(String fcast45ftHcQty) {
		this.fcast45ftHcQty = fcast45ftHcQty;
	}
	
	/**
	 * Column Info
	 * @param polYdCd
	 */
	public void setPolYdCd(String polYdCd) {
		this.polYdCd = polYdCd;
	}
	
	/**
	 * Column Info
	 * @param usdBkgTtlWgt
	 */
	public void setUsdBkgTtlWgt(String usdBkgTtlWgt) {
		this.usdBkgTtlWgt = usdBkgTtlWgt;
	}
	
	/**
	 * Column Info
	 * @param slsRgnOfcCd
	 */
	public void setSlsRgnOfcCd(String slsRgnOfcCd) {
		this.slsRgnOfcCd = slsRgnOfcCd;
	}
	
	/**
	 * Column Info
	 * @param repSubTrdCd
	 */
	public void setRepSubTrdCd(String repSubTrdCd) {
		this.repSubTrdCd = repSubTrdCd;
	}
	
	/**
	 * Column Info
	 * @param mnlFlg
	 */
	public void setMnlFlg(String mnlFlg) {
		this.mnlFlg = mnlFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setBkgAval40ftQty(JSPUtil.getParameter(request, "bkg_aval_40ft_qty", ""));
		setAsgnTtlWgt(JSPUtil.getParameter(request, "asgn_ttl_wgt", ""));
		setAlocTtlWgt(JSPUtil.getParameter(request, "aloc_ttl_wgt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setRepTrdCd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
		setModiUsrId(JSPUtil.getParameter(request, "modi_usr_id", ""));
		setAsgnRfQty(JSPUtil.getParameter(request, "asgn_rf_qty", ""));
		setUsdBkg40ftQty(JSPUtil.getParameter(request, "usd_bkg_40ft_qty", ""));
		setBkgAvalTtlWgt(JSPUtil.getParameter(request, "bkg_aval_ttl_wgt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMnlAlocRmk(JSPUtil.getParameter(request, "mnl_aloc_rmk", ""));
		setSlsOfcCd(JSPUtil.getParameter(request, "sls_ofc_cd", ""));
		setAlocUsrId(JSPUtil.getParameter(request, "aloc_usr_id", ""));
		setAloc45ftHcQty(JSPUtil.getParameter(request, "aloc_45ft_hc_qty", ""));
		setAsgn40ftQty(JSPUtil.getParameter(request, "asgn_40ft_qty", ""));
		setUsdBkg40ftHcQty(JSPUtil.getParameter(request, "usd_bkg_40ft_hc_qty", ""));
		setBkgAvalRfQty(JSPUtil.getParameter(request, "bkg_aval_rf_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setModiSeq(JSPUtil.getParameter(request, "modi_seq", ""));
		setCustSpcGnteQty(JSPUtil.getParameter(request, "cust_spc_gnte_qty", ""));
		setAsgn20ftQty(JSPUtil.getParameter(request, "asgn_20ft_qty", ""));
		setModiGdt(JSPUtil.getParameter(request, "modi_gdt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setSlsRhqCd(JSPUtil.getParameter(request, "sls_rhq_cd", ""));
		setFcastRfQty(JSPUtil.getParameter(request, "fcast_rf_qty", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setUsdBkg45ftHcQty(JSPUtil.getParameter(request, "usd_bkg_45ft_hc_qty", ""));
		setAlocGdt(JSPUtil.getParameter(request, "aloc_gdt", ""));
		setFcast40ftHcQty(JSPUtil.getParameter(request, "fcast_40ft_hc_qty", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
		setAsgn45ftHcQty(JSPUtil.getParameter(request, "asgn_45ft_hc_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUsdBkg20ftQty(JSPUtil.getParameter(request, "usd_bkg_20ft_qty", ""));
		setAlocLodQty(JSPUtil.getParameter(request, "aloc_lod_qty", ""));
		setBkgAval40ftHcQty(JSPUtil.getParameter(request, "bkg_aval_40ft_hc_qty", ""));
		setAlocRfQty(JSPUtil.getParameter(request, "aloc_rf_qty", ""));
		setAsgnTtlQty(JSPUtil.getParameter(request, "asgn_ttl_qty", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTsFlg(JSPUtil.getParameter(request, "ts_flg", ""));
		setFcastTtlQty(JSPUtil.getParameter(request, "fcast_ttl_qty", ""));
		setUsdBkgRfQty(JSPUtil.getParameter(request, "usd_bkg_rf_qty", ""));
		setUsdBkgTtlQty(JSPUtil.getParameter(request, "usd_bkg_ttl_qty", ""));
		setAloc40ftHcQty(JSPUtil.getParameter(request, "aloc_40ft_hc_qty", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setFcastTtlWgt(JSPUtil.getParameter(request, "fcast_ttl_wgt", ""));
		setPodYdCd(JSPUtil.getParameter(request, "pod_yd_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setIocTsCd(JSPUtil.getParameter(request, "ioc_ts_cd", ""));
		setAsgn40ftHcQty(JSPUtil.getParameter(request, "asgn_40ft_hc_qty", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setBkgAvalTtlQty(JSPUtil.getParameter(request, "bkg_aval_ttl_qty", ""));
		setBkgAval45ftHcQty(JSPUtil.getParameter(request, "bkg_aval_45ft_hc_qty", ""));
		setBkgAval20ftQty(JSPUtil.getParameter(request, "bkg_aval_20ft_qty", ""));
		setFcast45ftHcQty(JSPUtil.getParameter(request, "fcast_45ft_hc_qty", ""));
		setPolYdCd(JSPUtil.getParameter(request, "pol_yd_cd", ""));
		setUsdBkgTtlWgt(JSPUtil.getParameter(request, "usd_bkg_ttl_wgt", ""));
		setSlsRgnOfcCd(JSPUtil.getParameter(request, "sls_rgn_ofc_cd", ""));
		setRepSubTrdCd(JSPUtil.getParameter(request, "rep_sub_trd_cd", ""));
		setMnlFlg(JSPUtil.getParameter(request, "mnl_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpcAlocHisVO[]
	 */
	public SpcAlocHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpcAlocHisVO[]
	 */
	public SpcAlocHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpcAlocHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] bkgAval40ftQty = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_40ft_qty", length));
			String[] asgnTtlWgt = (JSPUtil.getParameter(request, prefix	+ "asgn_ttl_wgt", length));
			String[] alocTtlWgt = (JSPUtil.getParameter(request, prefix	+ "aloc_ttl_wgt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] repTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_trd_cd", length));
			String[] modiUsrId = (JSPUtil.getParameter(request, prefix	+ "modi_usr_id", length));
			String[] asgnRfQty = (JSPUtil.getParameter(request, prefix	+ "asgn_rf_qty", length));
			String[] usdBkg40ftQty = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_40ft_qty", length));
			String[] bkgAvalTtlWgt = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_ttl_wgt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mnlAlocRmk = (JSPUtil.getParameter(request, prefix	+ "mnl_aloc_rmk", length));
			String[] slsOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_ofc_cd", length));
			String[] alocUsrId = (JSPUtil.getParameter(request, prefix	+ "aloc_usr_id", length));
			String[] aloc45ftHcQty = (JSPUtil.getParameter(request, prefix	+ "aloc_45ft_hc_qty", length));
			String[] asgn40ftQty = (JSPUtil.getParameter(request, prefix	+ "asgn_40ft_qty", length));
			String[] usdBkg40ftHcQty = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_40ft_hc_qty", length));
			String[] bkgAvalRfQty = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_rf_qty", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] modiSeq = (JSPUtil.getParameter(request, prefix	+ "modi_seq", length));
			String[] custSpcGnteQty = (JSPUtil.getParameter(request, prefix	+ "cust_spc_gnte_qty", length));
			String[] asgn20ftQty = (JSPUtil.getParameter(request, prefix	+ "asgn_20ft_qty", length));
			String[] modiGdt = (JSPUtil.getParameter(request, prefix	+ "modi_gdt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] slsRhqCd = (JSPUtil.getParameter(request, prefix	+ "sls_rhq_cd", length));
			String[] fcastRfQty = (JSPUtil.getParameter(request, prefix	+ "fcast_rf_qty", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] usdBkg45ftHcQty = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_45ft_hc_qty", length));
			String[] alocGdt = (JSPUtil.getParameter(request, prefix	+ "aloc_gdt", length));
			String[] fcast40ftHcQty = (JSPUtil.getParameter(request, prefix	+ "fcast_40ft_hc_qty", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			String[] asgn45ftHcQty = (JSPUtil.getParameter(request, prefix	+ "asgn_45ft_hc_qty", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] usdBkg20ftQty = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_20ft_qty", length));
			String[] alocLodQty = (JSPUtil.getParameter(request, prefix	+ "aloc_lod_qty", length));
			String[] bkgAval40ftHcQty = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_40ft_hc_qty", length));
			String[] alocRfQty = (JSPUtil.getParameter(request, prefix	+ "aloc_rf_qty", length));
			String[] asgnTtlQty = (JSPUtil.getParameter(request, prefix	+ "asgn_ttl_qty", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] tsFlg = (JSPUtil.getParameter(request, prefix	+ "ts_flg", length));
			String[] fcastTtlQty = (JSPUtil.getParameter(request, prefix	+ "fcast_ttl_qty", length));
			String[] usdBkgRfQty = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_rf_qty", length));
			String[] usdBkgTtlQty = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_ttl_qty", length));
			String[] aloc40ftHcQty = (JSPUtil.getParameter(request, prefix	+ "aloc_40ft_hc_qty", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] fcastTtlWgt = (JSPUtil.getParameter(request, prefix	+ "fcast_ttl_wgt", length));
			String[] podYdCd = (JSPUtil.getParameter(request, prefix	+ "pod_yd_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] iocTsCd = (JSPUtil.getParameter(request, prefix	+ "ioc_ts_cd", length));
			String[] asgn40ftHcQty = (JSPUtil.getParameter(request, prefix	+ "asgn_40ft_hc_qty", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] bkgAvalTtlQty = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_ttl_qty", length));
			String[] bkgAval45ftHcQty = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_45ft_hc_qty", length));
			String[] bkgAval20ftQty = (JSPUtil.getParameter(request, prefix	+ "bkg_aval_20ft_qty", length));
			String[] fcast45ftHcQty = (JSPUtil.getParameter(request, prefix	+ "fcast_45ft_hc_qty", length));
			String[] polYdCd = (JSPUtil.getParameter(request, prefix	+ "pol_yd_cd", length));
			String[] usdBkgTtlWgt = (JSPUtil.getParameter(request, prefix	+ "usd_bkg_ttl_wgt", length));
			String[] slsRgnOfcCd = (JSPUtil.getParameter(request, prefix	+ "sls_rgn_ofc_cd", length));
			String[] repSubTrdCd = (JSPUtil.getParameter(request, prefix	+ "rep_sub_trd_cd", length));
			String[] mnlFlg = (JSPUtil.getParameter(request, prefix	+ "mnl_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpcAlocHisVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bkgAval40ftQty[i] != null)
					model.setBkgAval40ftQty(bkgAval40ftQty[i]);
				if (asgnTtlWgt[i] != null)
					model.setAsgnTtlWgt(asgnTtlWgt[i]);
				if (alocTtlWgt[i] != null)
					model.setAlocTtlWgt(alocTtlWgt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (repTrdCd[i] != null)
					model.setRepTrdCd(repTrdCd[i]);
				if (modiUsrId[i] != null)
					model.setModiUsrId(modiUsrId[i]);
				if (asgnRfQty[i] != null)
					model.setAsgnRfQty(asgnRfQty[i]);
				if (usdBkg40ftQty[i] != null)
					model.setUsdBkg40ftQty(usdBkg40ftQty[i]);
				if (bkgAvalTtlWgt[i] != null)
					model.setBkgAvalTtlWgt(bkgAvalTtlWgt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mnlAlocRmk[i] != null)
					model.setMnlAlocRmk(mnlAlocRmk[i]);
				if (slsOfcCd[i] != null)
					model.setSlsOfcCd(slsOfcCd[i]);
				if (alocUsrId[i] != null)
					model.setAlocUsrId(alocUsrId[i]);
				if (aloc45ftHcQty[i] != null)
					model.setAloc45ftHcQty(aloc45ftHcQty[i]);
				if (asgn40ftQty[i] != null)
					model.setAsgn40ftQty(asgn40ftQty[i]);
				if (usdBkg40ftHcQty[i] != null)
					model.setUsdBkg40ftHcQty(usdBkg40ftHcQty[i]);
				if (bkgAvalRfQty[i] != null)
					model.setBkgAvalRfQty(bkgAvalRfQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (modiSeq[i] != null)
					model.setModiSeq(modiSeq[i]);
				if (custSpcGnteQty[i] != null)
					model.setCustSpcGnteQty(custSpcGnteQty[i]);
				if (asgn20ftQty[i] != null)
					model.setAsgn20ftQty(asgn20ftQty[i]);
				if (modiGdt[i] != null)
					model.setModiGdt(modiGdt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (slsRhqCd[i] != null)
					model.setSlsRhqCd(slsRhqCd[i]);
				if (fcastRfQty[i] != null)
					model.setFcastRfQty(fcastRfQty[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (usdBkg45ftHcQty[i] != null)
					model.setUsdBkg45ftHcQty(usdBkg45ftHcQty[i]);
				if (alocGdt[i] != null)
					model.setAlocGdt(alocGdt[i]);
				if (fcast40ftHcQty[i] != null)
					model.setFcast40ftHcQty(fcast40ftHcQty[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				if (asgn45ftHcQty[i] != null)
					model.setAsgn45ftHcQty(asgn45ftHcQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (usdBkg20ftQty[i] != null)
					model.setUsdBkg20ftQty(usdBkg20ftQty[i]);
				if (alocLodQty[i] != null)
					model.setAlocLodQty(alocLodQty[i]);
				if (bkgAval40ftHcQty[i] != null)
					model.setBkgAval40ftHcQty(bkgAval40ftHcQty[i]);
				if (alocRfQty[i] != null)
					model.setAlocRfQty(alocRfQty[i]);
				if (asgnTtlQty[i] != null)
					model.setAsgnTtlQty(asgnTtlQty[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (tsFlg[i] != null)
					model.setTsFlg(tsFlg[i]);
				if (fcastTtlQty[i] != null)
					model.setFcastTtlQty(fcastTtlQty[i]);
				if (usdBkgRfQty[i] != null)
					model.setUsdBkgRfQty(usdBkgRfQty[i]);
				if (usdBkgTtlQty[i] != null)
					model.setUsdBkgTtlQty(usdBkgTtlQty[i]);
				if (aloc40ftHcQty[i] != null)
					model.setAloc40ftHcQty(aloc40ftHcQty[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (fcastTtlWgt[i] != null)
					model.setFcastTtlWgt(fcastTtlWgt[i]);
				if (podYdCd[i] != null)
					model.setPodYdCd(podYdCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (iocTsCd[i] != null)
					model.setIocTsCd(iocTsCd[i]);
				if (asgn40ftHcQty[i] != null)
					model.setAsgn40ftHcQty(asgn40ftHcQty[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (bkgAvalTtlQty[i] != null)
					model.setBkgAvalTtlQty(bkgAvalTtlQty[i]);
				if (bkgAval45ftHcQty[i] != null)
					model.setBkgAval45ftHcQty(bkgAval45ftHcQty[i]);
				if (bkgAval20ftQty[i] != null)
					model.setBkgAval20ftQty(bkgAval20ftQty[i]);
				if (fcast45ftHcQty[i] != null)
					model.setFcast45ftHcQty(fcast45ftHcQty[i]);
				if (polYdCd[i] != null)
					model.setPolYdCd(polYdCd[i]);
				if (usdBkgTtlWgt[i] != null)
					model.setUsdBkgTtlWgt(usdBkgTtlWgt[i]);
				if (slsRgnOfcCd[i] != null)
					model.setSlsRgnOfcCd(slsRgnOfcCd[i]);
				if (repSubTrdCd[i] != null)
					model.setRepSubTrdCd(repSubTrdCd[i]);
				if (mnlFlg[i] != null)
					model.setMnlFlg(mnlFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpcAlocHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpcAlocHisVO[]
	 */
	public SpcAlocHisVO[] getSpcAlocHisVOs(){
		SpcAlocHisVO[] vos = (SpcAlocHisVO[])models.toArray(new SpcAlocHisVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAval40ftQty = this.bkgAval40ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgnTtlWgt = this.asgnTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocTtlWgt = this.alocTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repTrdCd = this.repTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiUsrId = this.modiUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgnRfQty = this.asgnRfQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkg40ftQty = this.usdBkg40ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAvalTtlWgt = this.bkgAvalTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlAlocRmk = this.mnlAlocRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsOfcCd = this.slsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocUsrId = this.alocUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aloc45ftHcQty = this.aloc45ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgn40ftQty = this.asgn40ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkg40ftHcQty = this.usdBkg40ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAvalRfQty = this.bkgAvalRfQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiSeq = this.modiSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSpcGnteQty = this.custSpcGnteQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgn20ftQty = this.asgn20ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiGdt = this.modiGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsRhqCd = this.slsRhqCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastRfQty = this.fcastRfQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkg45ftHcQty = this.usdBkg45ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocGdt = this.alocGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcast40ftHcQty = this.fcast40ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgn45ftHcQty = this.asgn45ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkg20ftQty = this.usdBkg20ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocLodQty = this.alocLodQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAval40ftHcQty = this.bkgAval40ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocRfQty = this.alocRfQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgnTtlQty = this.asgnTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsFlg = this.tsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastTtlQty = this.fcastTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkgRfQty = this.usdBkgRfQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkgTtlQty = this.usdBkgTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aloc40ftHcQty = this.aloc40ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcastTtlWgt = this.fcastTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podYdCd = this.podYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iocTsCd = this.iocTsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.asgn40ftHcQty = this.asgn40ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAvalTtlQty = this.bkgAvalTtlQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAval45ftHcQty = this.bkgAval45ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAval20ftQty = this.bkgAval20ftQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fcast45ftHcQty = this.fcast45ftHcQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polYdCd = this.polYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdBkgTtlWgt = this.usdBkgTtlWgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsRgnOfcCd = this.slsRgnOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repSubTrdCd = this.repSubTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlFlg = this.mnlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
