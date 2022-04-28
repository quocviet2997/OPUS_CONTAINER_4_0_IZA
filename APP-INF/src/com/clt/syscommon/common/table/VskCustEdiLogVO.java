/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VskCustEdiLogVO.java
*@FileTitle : VskCustEdiLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.01.08
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.01.08 함대성 
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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskCustEdiLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskCustEdiLogVO> models = new ArrayList<VskCustEdiLogVO>();
	
	/* Column Info */
	private String routRcvDt = null;
	/* Column Info */
	private String n2ndPodCgoClzDt = null;
	/* Column Info */
	private String n1stPolCd = null;
	/* Column Info */
	private String n2ndLaneFdrFlg = null;
	/* Column Info */
	private String n1stLaneFdrFlg = null;
	/* Column Info */
	private String n2ndPodCd = null;
	/* Column Info */
	private String polEtdDt = null;
	/* Column Info */
	private String n3rdSkdVoyNo = null;
	/* Column Info */
	private String n1stPolEtdDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String n2ndPolEtaDt = null;
	/* Column Info */
	private String n3rdSkdDirCd = null;
	/* Column Info */
	private String n3rdPolCgoClzDt = null;
	/* Column Info */
	private String custTrdPrnrId = null;
	/* Column Info */
	private String n3rdPodEtaDt = null;
	/* Column Info */
	private String porEtdDt = null;
	/* Column Info */
	private String n2ndSkdDirCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String n1stPodCd = null;
	/* Column Info */
	private String n1stPolEtaDt = null;
	/* Column Info */
	private String n3rdPodEtbDt = null;
	/* Column Info */
	private String n1stPolEtbDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String n2ndSlanCd = null;
	/* Column Info */
	private String n2ndVslCd = null;
	/* Column Info */
	private String n2ndPolEtdDt = null;
	/* Column Info */
	private String routSeq = null;
	/* Column Info */
	private String n2ndPolEtbDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String n1stPodCgoClzDt = null;
	/* Column Info */
	private String n1stPodEtaDt = null;
	/* Column Info */
	private String n1stSkdVoyNo = null;
	/* Column Info */
	private String n3rdPodEtdDt = null;
	/* Column Info */
	private String n3rdLaneFdrFlg = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String n2ndPolCgoClzDt = null;
	/* Column Info */
	private String n3rdSlanCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String deDt = null;
	/* Column Info */
	private String n1stPodEtbDt = null;
	/* Column Info */
	private String n3rdPodCgoClzDt = null;
	/* Column Info */
	private String n1stPodEtdDt = null;
	/* Column Info */
	private String polDocClzDt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vskdEdiSndId = null;
	/* Column Info */
	private String n3rdPolEtbDt = null;
	/* Column Info */
	private String n2ndPodEtbDt = null;
	/* Column Info */
	private String n3rdPolEtaDt = null;
	/* Column Info */
	private String n3rdPolCd = null;
	/* Column Info */
	private String n2ndPodEtaDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n1stVslCd = null;
	/* Column Info */
	private String n1stPolCgoClzDt = null;
	/* Column Info */
	private String n3rdPolEtdDt = null;
	/* Column Info */
	private String n3rdPodCd = null;
	/* Column Info */
	private String n2ndPodEtdDt = null;
	/* Column Info */
	private String n3rdVslCd = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String n2ndPolCd = null;
	/* Column Info */
	private String n1stSlanCd = null;
	/* Column Info */
	private String n2ndSkdVoyNo = null;
	/* Column Info */
	private String n1stSkdDirCd = null;
	/* Column Info */
	private String delEtaDt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskCustEdiLogVO() {}

	public VskCustEdiLogVO(String ibflag, String pagerows, String routRcvDt, String routSeq, String vskdEdiSndId, String custTrdPrnrId, String porEtdDt, String polEtdDt, String polDocClzDt, String delEtaDt, String n1stSlanCd, String n1stVslCd, String n1stSkdVoyNo, String n1stSkdDirCd, String n1stLaneFdrFlg, String n1stPolCgoClzDt, String n1stPolEtaDt, String n1stPolEtbDt, String n1stPolEtdDt, String n1stPodCgoClzDt, String n1stPodEtaDt, String n1stPodEtbDt, String n1stPodEtdDt, String n2ndSlanCd, String n2ndVslCd, String n2ndSkdVoyNo, String n2ndSkdDirCd, String n2ndLaneFdrFlg, String n2ndPolCgoClzDt, String n2ndPolEtaDt, String n2ndPolEtbDt, String n2ndPolEtdDt, String n2ndPodCgoClzDt, String n2ndPodEtaDt, String n2ndPodEtbDt, String n2ndPodEtdDt, String n3rdSlanCd, String n3rdVslCd, String n3rdSkdVoyNo, String n3rdSkdDirCd, String n3rdLaneFdrFlg, String n3rdPolCgoClzDt, String n3rdPolEtaDt, String n3rdPolEtbDt, String n3rdPolEtdDt, String n3rdPodCgoClzDt, String n3rdPodEtaDt, String n3rdPodEtbDt, String n3rdPodEtdDt, String deDt, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String porCd, String delCd, String n1stPolCd, String n1stPodCd, String n2ndPolCd, String n2ndPodCd, String n3rdPolCd, String n3rdPodCd) {
		this.routRcvDt = routRcvDt;
		this.n2ndPodCgoClzDt = n2ndPodCgoClzDt;
		this.n1stPolCd = n1stPolCd;
		this.n2ndLaneFdrFlg = n2ndLaneFdrFlg;
		this.n1stLaneFdrFlg = n1stLaneFdrFlg;
		this.n2ndPodCd = n2ndPodCd;
		this.polEtdDt = polEtdDt;
		this.n3rdSkdVoyNo = n3rdSkdVoyNo;
		this.n1stPolEtdDt = n1stPolEtdDt;
		this.pagerows = pagerows;
		this.n2ndPolEtaDt = n2ndPolEtaDt;
		this.n3rdSkdDirCd = n3rdSkdDirCd;
		this.n3rdPolCgoClzDt = n3rdPolCgoClzDt;
		this.custTrdPrnrId = custTrdPrnrId;
		this.n3rdPodEtaDt = n3rdPodEtaDt;
		this.porEtdDt = porEtdDt;
		this.n2ndSkdDirCd = n2ndSkdDirCd;
		this.updUsrId = updUsrId;
		this.n1stPodCd = n1stPodCd;
		this.n1stPolEtaDt = n1stPolEtaDt;
		this.n3rdPodEtbDt = n3rdPodEtbDt;
		this.n1stPolEtbDt = n1stPolEtbDt;
		this.delCd = delCd;
		this.n2ndSlanCd = n2ndSlanCd;
		this.n2ndVslCd = n2ndVslCd;
		this.n2ndPolEtdDt = n2ndPolEtdDt;
		this.routSeq = routSeq;
		this.n2ndPolEtbDt = n2ndPolEtbDt;
		this.creUsrId = creUsrId;
		this.n1stPodCgoClzDt = n1stPodCgoClzDt;
		this.n1stPodEtaDt = n1stPodEtaDt;
		this.n1stSkdVoyNo = n1stSkdVoyNo;
		this.n3rdPodEtdDt = n3rdPodEtdDt;
		this.n3rdLaneFdrFlg = n3rdLaneFdrFlg;
		this.porCd = porCd;
		this.n2ndPolCgoClzDt = n2ndPolCgoClzDt;
		this.n3rdSlanCd = n3rdSlanCd;
		this.creDt = creDt;
		this.deDt = deDt;
		this.n1stPodEtbDt = n1stPodEtbDt;
		this.n3rdPodCgoClzDt = n3rdPodCgoClzDt;
		this.n1stPodEtdDt = n1stPodEtdDt;
		this.polDocClzDt = polDocClzDt;
		this.ibflag = ibflag;
		this.vskdEdiSndId = vskdEdiSndId;
		this.n3rdPolEtbDt = n3rdPolEtbDt;
		this.n2ndPodEtbDt = n2ndPodEtbDt;
		this.n3rdPolEtaDt = n3rdPolEtaDt;
		this.n3rdPolCd = n3rdPolCd;
		this.n2ndPodEtaDt = n2ndPodEtaDt;
		this.updDt = updDt;
		this.n1stVslCd = n1stVslCd;
		this.n1stPolCgoClzDt = n1stPolCgoClzDt;
		this.n3rdPolEtdDt = n3rdPolEtdDt;
		this.n3rdPodCd = n3rdPodCd;
		this.n2ndPodEtdDt = n2ndPodEtdDt;
		this.n3rdVslCd = n3rdVslCd;
		this.diffRmk = diffRmk;
		this.n2ndPolCd = n2ndPolCd;
		this.n1stSlanCd = n1stSlanCd;
		this.n2ndSkdVoyNo = n2ndSkdVoyNo;
		this.n1stSkdDirCd = n1stSkdDirCd;
		this.delEtaDt = delEtaDt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rout_rcv_dt", getRoutRcvDt());
		this.hashColumns.put("n2nd_pod_cgo_clz_dt", getN2ndPodCgoClzDt());
		this.hashColumns.put("n1st_pol_cd", getN1stPolCd());
		this.hashColumns.put("n2nd_lane_fdr_flg", getN2ndLaneFdrFlg());
		this.hashColumns.put("n1st_lane_fdr_flg", getN1stLaneFdrFlg());
		this.hashColumns.put("n2nd_pod_cd", getN2ndPodCd());
		this.hashColumns.put("pol_etd_dt", getPolEtdDt());
		this.hashColumns.put("n3rd_skd_voy_no", getN3rdSkdVoyNo());
		this.hashColumns.put("n1st_pol_etd_dt", getN1stPolEtdDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("n2nd_pol_eta_dt", getN2ndPolEtaDt());
		this.hashColumns.put("n3rd_skd_dir_cd", getN3rdSkdDirCd());
		this.hashColumns.put("n3rd_pol_cgo_clz_dt", getN3rdPolCgoClzDt());
		this.hashColumns.put("cust_trd_prnr_id", getCustTrdPrnrId());
		this.hashColumns.put("n3rd_pod_eta_dt", getN3rdPodEtaDt());
		this.hashColumns.put("por_etd_dt", getPorEtdDt());
		this.hashColumns.put("n2nd_skd_dir_cd", getN2ndSkdDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("n1st_pod_cd", getN1stPodCd());
		this.hashColumns.put("n1st_pol_eta_dt", getN1stPolEtaDt());
		this.hashColumns.put("n3rd_pod_etb_dt", getN3rdPodEtbDt());
		this.hashColumns.put("n1st_pol_etb_dt", getN1stPolEtbDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("n2nd_slan_cd", getN2ndSlanCd());
		this.hashColumns.put("n2nd_vsl_cd", getN2ndVslCd());
		this.hashColumns.put("n2nd_pol_etd_dt", getN2ndPolEtdDt());
		this.hashColumns.put("rout_seq", getRoutSeq());
		this.hashColumns.put("n2nd_pol_etb_dt", getN2ndPolEtbDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("n1st_pod_cgo_clz_dt", getN1stPodCgoClzDt());
		this.hashColumns.put("n1st_pod_eta_dt", getN1stPodEtaDt());
		this.hashColumns.put("n1st_skd_voy_no", getN1stSkdVoyNo());
		this.hashColumns.put("n3rd_pod_etd_dt", getN3rdPodEtdDt());
		this.hashColumns.put("n3rd_lane_fdr_flg", getN3rdLaneFdrFlg());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("n2nd_pol_cgo_clz_dt", getN2ndPolCgoClzDt());
		this.hashColumns.put("n3rd_slan_cd", getN3rdSlanCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("de_dt", getDeDt());
		this.hashColumns.put("n1st_pod_etb_dt", getN1stPodEtbDt());
		this.hashColumns.put("n3rd_pod_cgo_clz_dt", getN3rdPodCgoClzDt());
		this.hashColumns.put("n1st_pod_etd_dt", getN1stPodEtdDt());
		this.hashColumns.put("pol_doc_clz_dt", getPolDocClzDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vskd_edi_snd_id", getVskdEdiSndId());
		this.hashColumns.put("n3rd_pol_etb_dt", getN3rdPolEtbDt());
		this.hashColumns.put("n2nd_pod_etb_dt", getN2ndPodEtbDt());
		this.hashColumns.put("n3rd_pol_eta_dt", getN3rdPolEtaDt());
		this.hashColumns.put("n3rd_pol_cd", getN3rdPolCd());
		this.hashColumns.put("n2nd_pod_eta_dt", getN2ndPodEtaDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n1st_vsl_cd", getN1stVslCd());
		this.hashColumns.put("n1st_pol_cgo_clz_dt", getN1stPolCgoClzDt());
		this.hashColumns.put("n3rd_pol_etd_dt", getN3rdPolEtdDt());
		this.hashColumns.put("n3rd_pod_cd", getN3rdPodCd());
		this.hashColumns.put("n2nd_pod_etd_dt", getN2ndPodEtdDt());
		this.hashColumns.put("n3rd_vsl_cd", getN3rdVslCd());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("n2nd_pol_cd", getN2ndPolCd());
		this.hashColumns.put("n1st_slan_cd", getN1stSlanCd());
		this.hashColumns.put("n2nd_skd_voy_no", getN2ndSkdVoyNo());
		this.hashColumns.put("n1st_skd_dir_cd", getN1stSkdDirCd());
		this.hashColumns.put("del_eta_dt", getDelEtaDt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rout_rcv_dt", "routRcvDt");
		this.hashFields.put("n2nd_pod_cgo_clz_dt", "n2ndPodCgoClzDt");
		this.hashFields.put("n1st_pol_cd", "n1stPolCd");
		this.hashFields.put("n2nd_lane_fdr_flg", "n2ndLaneFdrFlg");
		this.hashFields.put("n1st_lane_fdr_flg", "n1stLaneFdrFlg");
		this.hashFields.put("n2nd_pod_cd", "n2ndPodCd");
		this.hashFields.put("pol_etd_dt", "polEtdDt");
		this.hashFields.put("n3rd_skd_voy_no", "n3rdSkdVoyNo");
		this.hashFields.put("n1st_pol_etd_dt", "n1stPolEtdDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("n2nd_pol_eta_dt", "n2ndPolEtaDt");
		this.hashFields.put("n3rd_skd_dir_cd", "n3rdSkdDirCd");
		this.hashFields.put("n3rd_pol_cgo_clz_dt", "n3rdPolCgoClzDt");
		this.hashFields.put("cust_trd_prnr_id", "custTrdPrnrId");
		this.hashFields.put("n3rd_pod_eta_dt", "n3rdPodEtaDt");
		this.hashFields.put("por_etd_dt", "porEtdDt");
		this.hashFields.put("n2nd_skd_dir_cd", "n2ndSkdDirCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("n1st_pod_cd", "n1stPodCd");
		this.hashFields.put("n1st_pol_eta_dt", "n1stPolEtaDt");
		this.hashFields.put("n3rd_pod_etb_dt", "n3rdPodEtbDt");
		this.hashFields.put("n1st_pol_etb_dt", "n1stPolEtbDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("n2nd_slan_cd", "n2ndSlanCd");
		this.hashFields.put("n2nd_vsl_cd", "n2ndVslCd");
		this.hashFields.put("n2nd_pol_etd_dt", "n2ndPolEtdDt");
		this.hashFields.put("rout_seq", "routSeq");
		this.hashFields.put("n2nd_pol_etb_dt", "n2ndPolEtbDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("n1st_pod_cgo_clz_dt", "n1stPodCgoClzDt");
		this.hashFields.put("n1st_pod_eta_dt", "n1stPodEtaDt");
		this.hashFields.put("n1st_skd_voy_no", "n1stSkdVoyNo");
		this.hashFields.put("n3rd_pod_etd_dt", "n3rdPodEtdDt");
		this.hashFields.put("n3rd_lane_fdr_flg", "n3rdLaneFdrFlg");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("n2nd_pol_cgo_clz_dt", "n2ndPolCgoClzDt");
		this.hashFields.put("n3rd_slan_cd", "n3rdSlanCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("de_dt", "deDt");
		this.hashFields.put("n1st_pod_etb_dt", "n1stPodEtbDt");
		this.hashFields.put("n3rd_pod_cgo_clz_dt", "n3rdPodCgoClzDt");
		this.hashFields.put("n1st_pod_etd_dt", "n1stPodEtdDt");
		this.hashFields.put("pol_doc_clz_dt", "polDocClzDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vskd_edi_snd_id", "vskdEdiSndId");
		this.hashFields.put("n3rd_pol_etb_dt", "n3rdPolEtbDt");
		this.hashFields.put("n2nd_pod_etb_dt", "n2ndPodEtbDt");
		this.hashFields.put("n3rd_pol_eta_dt", "n3rdPolEtaDt");
		this.hashFields.put("n3rd_pol_cd", "n3rdPolCd");
		this.hashFields.put("n2nd_pod_eta_dt", "n2ndPodEtaDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n1st_vsl_cd", "n1stVslCd");
		this.hashFields.put("n1st_pol_cgo_clz_dt", "n1stPolCgoClzDt");
		this.hashFields.put("n3rd_pol_etd_dt", "n3rdPolEtdDt");
		this.hashFields.put("n3rd_pod_cd", "n3rdPodCd");
		this.hashFields.put("n2nd_pod_etd_dt", "n2ndPodEtdDt");
		this.hashFields.put("n3rd_vsl_cd", "n3rdVslCd");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("n2nd_pol_cd", "n2ndPolCd");
		this.hashFields.put("n1st_slan_cd", "n1stSlanCd");
		this.hashFields.put("n2nd_skd_voy_no", "n2ndSkdVoyNo");
		this.hashFields.put("n1st_skd_dir_cd", "n1stSkdDirCd");
		this.hashFields.put("del_eta_dt", "delEtaDt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return routRcvDt
	 */
	public String getRoutRcvDt() {
		return this.routRcvDt;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodCgoClzDt
	 */
	public String getN2ndPodCgoClzDt() {
		return this.n2ndPodCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return n1stPolCd
	 */
	public String getN1stPolCd() {
		return this.n1stPolCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndLaneFdrFlg
	 */
	public String getN2ndLaneFdrFlg() {
		return this.n2ndLaneFdrFlg;
	}
	
	/**
	 * Column Info
	 * @return n1stLaneFdrFlg
	 */
	public String getN1stLaneFdrFlg() {
		return this.n1stLaneFdrFlg;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodCd
	 */
	public String getN2ndPodCd() {
		return this.n2ndPodCd;
	}
	
	/**
	 * Column Info
	 * @return polEtdDt
	 */
	public String getPolEtdDt() {
		return this.polEtdDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdSkdVoyNo
	 */
	public String getN3rdSkdVoyNo() {
		return this.n3rdSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return n1stPolEtdDt
	 */
	public String getN1stPolEtdDt() {
		return this.n1stPolEtdDt;
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
	 * @return n2ndPolEtaDt
	 */
	public String getN2ndPolEtaDt() {
		return this.n2ndPolEtaDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdSkdDirCd
	 */
	public String getN3rdSkdDirCd() {
		return this.n3rdSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolCgoClzDt
	 */
	public String getN3rdPolCgoClzDt() {
		return this.n3rdPolCgoClzDt;
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
	 * @return n3rdPodEtaDt
	 */
	public String getN3rdPodEtaDt() {
		return this.n3rdPodEtaDt;
	}
	
	/**
	 * Column Info
	 * @return porEtdDt
	 */
	public String getPorEtdDt() {
		return this.porEtdDt;
	}
	
	/**
	 * Column Info
	 * @return n2ndSkdDirCd
	 */
	public String getN2ndSkdDirCd() {
		return this.n2ndSkdDirCd;
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
	 * @return n1stPodCd
	 */
	public String getN1stPodCd() {
		return this.n1stPodCd;
	}
	
	/**
	 * Column Info
	 * @return n1stPolEtaDt
	 */
	public String getN1stPolEtaDt() {
		return this.n1stPolEtaDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPodEtbDt
	 */
	public String getN3rdPodEtbDt() {
		return this.n3rdPodEtbDt;
	}
	
	/**
	 * Column Info
	 * @return n1stPolEtbDt
	 */
	public String getN1stPolEtbDt() {
		return this.n1stPolEtbDt;
	}
	
	/**
	 * Column Info
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndSlanCd
	 */
	public String getN2ndSlanCd() {
		return this.n2ndSlanCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndVslCd
	 */
	public String getN2ndVslCd() {
		return this.n2ndVslCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPolEtdDt
	 */
	public String getN2ndPolEtdDt() {
		return this.n2ndPolEtdDt;
	}
	
	/**
	 * Column Info
	 * @return routSeq
	 */
	public String getRoutSeq() {
		return this.routSeq;
	}
	
	/**
	 * Column Info
	 * @return n2ndPolEtbDt
	 */
	public String getN2ndPolEtbDt() {
		return this.n2ndPolEtbDt;
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
	 * @return n1stPodCgoClzDt
	 */
	public String getN1stPodCgoClzDt() {
		return this.n1stPodCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return n1stPodEtaDt
	 */
	public String getN1stPodEtaDt() {
		return this.n1stPodEtaDt;
	}
	
	/**
	 * Column Info
	 * @return n1stSkdVoyNo
	 */
	public String getN1stSkdVoyNo() {
		return this.n1stSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return n3rdPodEtdDt
	 */
	public String getN3rdPodEtdDt() {
		return this.n3rdPodEtdDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdLaneFdrFlg
	 */
	public String getN3rdLaneFdrFlg() {
		return this.n3rdLaneFdrFlg;
	}
	
	/**
	 * Column Info
	 * @return porCd
	 */
	public String getPorCd() {
		return this.porCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPolCgoClzDt
	 */
	public String getN2ndPolCgoClzDt() {
		return this.n2ndPolCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdSlanCd
	 */
	public String getN3rdSlanCd() {
		return this.n3rdSlanCd;
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
	 * @return deDt
	 */
	public String getDeDt() {
		return this.deDt;
	}
	
	/**
	 * Column Info
	 * @return n1stPodEtbDt
	 */
	public String getN1stPodEtbDt() {
		return this.n1stPodEtbDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPodCgoClzDt
	 */
	public String getN3rdPodCgoClzDt() {
		return this.n3rdPodCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return n1stPodEtdDt
	 */
	public String getN1stPodEtdDt() {
		return this.n1stPodEtdDt;
	}
	
	/**
	 * Column Info
	 * @return polDocClzDt
	 */
	public String getPolDocClzDt() {
		return this.polDocClzDt;
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
	 * @return vskdEdiSndId
	 */
	public String getVskdEdiSndId() {
		return this.vskdEdiSndId;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolEtbDt
	 */
	public String getN3rdPolEtbDt() {
		return this.n3rdPolEtbDt;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodEtbDt
	 */
	public String getN2ndPodEtbDt() {
		return this.n2ndPodEtbDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolEtaDt
	 */
	public String getN3rdPolEtaDt() {
		return this.n3rdPolEtaDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolCd
	 */
	public String getN3rdPolCd() {
		return this.n3rdPolCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodEtaDt
	 */
	public String getN2ndPodEtaDt() {
		return this.n2ndPodEtaDt;
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
	 * @return n1stVslCd
	 */
	public String getN1stVslCd() {
		return this.n1stVslCd;
	}
	
	/**
	 * Column Info
	 * @return n1stPolCgoClzDt
	 */
	public String getN1stPolCgoClzDt() {
		return this.n1stPolCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPolEtdDt
	 */
	public String getN3rdPolEtdDt() {
		return this.n3rdPolEtdDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdPodCd
	 */
	public String getN3rdPodCd() {
		return this.n3rdPodCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndPodEtdDt
	 */
	public String getN2ndPodEtdDt() {
		return this.n2ndPodEtdDt;
	}
	
	/**
	 * Column Info
	 * @return n3rdVslCd
	 */
	public String getN3rdVslCd() {
		return this.n3rdVslCd;
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
	 * @return n2ndPolCd
	 */
	public String getN2ndPolCd() {
		return this.n2ndPolCd;
	}
	
	/**
	 * Column Info
	 * @return n1stSlanCd
	 */
	public String getN1stSlanCd() {
		return this.n1stSlanCd;
	}
	
	/**
	 * Column Info
	 * @return n2ndSkdVoyNo
	 */
	public String getN2ndSkdVoyNo() {
		return this.n2ndSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return n1stSkdDirCd
	 */
	public String getN1stSkdDirCd() {
		return this.n1stSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return delEtaDt
	 */
	public String getDelEtaDt() {
		return this.delEtaDt;
	}
	

	/**
	 * Column Info
	 * @param routRcvDt
	 */
	public void setRoutRcvDt(String routRcvDt) {
		this.routRcvDt = routRcvDt;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodCgoClzDt
	 */
	public void setN2ndPodCgoClzDt(String n2ndPodCgoClzDt) {
		this.n2ndPodCgoClzDt = n2ndPodCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param n1stPolCd
	 */
	public void setN1stPolCd(String n1stPolCd) {
		this.n1stPolCd = n1stPolCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndLaneFdrFlg
	 */
	public void setN2ndLaneFdrFlg(String n2ndLaneFdrFlg) {
		this.n2ndLaneFdrFlg = n2ndLaneFdrFlg;
	}
	
	/**
	 * Column Info
	 * @param n1stLaneFdrFlg
	 */
	public void setN1stLaneFdrFlg(String n1stLaneFdrFlg) {
		this.n1stLaneFdrFlg = n1stLaneFdrFlg;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodCd
	 */
	public void setN2ndPodCd(String n2ndPodCd) {
		this.n2ndPodCd = n2ndPodCd;
	}
	
	/**
	 * Column Info
	 * @param polEtdDt
	 */
	public void setPolEtdDt(String polEtdDt) {
		this.polEtdDt = polEtdDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdSkdVoyNo
	 */
	public void setN3rdSkdVoyNo(String n3rdSkdVoyNo) {
		this.n3rdSkdVoyNo = n3rdSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param n1stPolEtdDt
	 */
	public void setN1stPolEtdDt(String n1stPolEtdDt) {
		this.n1stPolEtdDt = n1stPolEtdDt;
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
	 * @param n2ndPolEtaDt
	 */
	public void setN2ndPolEtaDt(String n2ndPolEtaDt) {
		this.n2ndPolEtaDt = n2ndPolEtaDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdSkdDirCd
	 */
	public void setN3rdSkdDirCd(String n3rdSkdDirCd) {
		this.n3rdSkdDirCd = n3rdSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolCgoClzDt
	 */
	public void setN3rdPolCgoClzDt(String n3rdPolCgoClzDt) {
		this.n3rdPolCgoClzDt = n3rdPolCgoClzDt;
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
	 * @param n3rdPodEtaDt
	 */
	public void setN3rdPodEtaDt(String n3rdPodEtaDt) {
		this.n3rdPodEtaDt = n3rdPodEtaDt;
	}
	
	/**
	 * Column Info
	 * @param porEtdDt
	 */
	public void setPorEtdDt(String porEtdDt) {
		this.porEtdDt = porEtdDt;
	}
	
	/**
	 * Column Info
	 * @param n2ndSkdDirCd
	 */
	public void setN2ndSkdDirCd(String n2ndSkdDirCd) {
		this.n2ndSkdDirCd = n2ndSkdDirCd;
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
	 * @param n1stPodCd
	 */
	public void setN1stPodCd(String n1stPodCd) {
		this.n1stPodCd = n1stPodCd;
	}
	
	/**
	 * Column Info
	 * @param n1stPolEtaDt
	 */
	public void setN1stPolEtaDt(String n1stPolEtaDt) {
		this.n1stPolEtaDt = n1stPolEtaDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPodEtbDt
	 */
	public void setN3rdPodEtbDt(String n3rdPodEtbDt) {
		this.n3rdPodEtbDt = n3rdPodEtbDt;
	}
	
	/**
	 * Column Info
	 * @param n1stPolEtbDt
	 */
	public void setN1stPolEtbDt(String n1stPolEtbDt) {
		this.n1stPolEtbDt = n1stPolEtbDt;
	}
	
	/**
	 * Column Info
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndSlanCd
	 */
	public void setN2ndSlanCd(String n2ndSlanCd) {
		this.n2ndSlanCd = n2ndSlanCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndVslCd
	 */
	public void setN2ndVslCd(String n2ndVslCd) {
		this.n2ndVslCd = n2ndVslCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPolEtdDt
	 */
	public void setN2ndPolEtdDt(String n2ndPolEtdDt) {
		this.n2ndPolEtdDt = n2ndPolEtdDt;
	}
	
	/**
	 * Column Info
	 * @param routSeq
	 */
	public void setRoutSeq(String routSeq) {
		this.routSeq = routSeq;
	}
	
	/**
	 * Column Info
	 * @param n2ndPolEtbDt
	 */
	public void setN2ndPolEtbDt(String n2ndPolEtbDt) {
		this.n2ndPolEtbDt = n2ndPolEtbDt;
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
	 * @param n1stPodCgoClzDt
	 */
	public void setN1stPodCgoClzDt(String n1stPodCgoClzDt) {
		this.n1stPodCgoClzDt = n1stPodCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param n1stPodEtaDt
	 */
	public void setN1stPodEtaDt(String n1stPodEtaDt) {
		this.n1stPodEtaDt = n1stPodEtaDt;
	}
	
	/**
	 * Column Info
	 * @param n1stSkdVoyNo
	 */
	public void setN1stSkdVoyNo(String n1stSkdVoyNo) {
		this.n1stSkdVoyNo = n1stSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param n3rdPodEtdDt
	 */
	public void setN3rdPodEtdDt(String n3rdPodEtdDt) {
		this.n3rdPodEtdDt = n3rdPodEtdDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdLaneFdrFlg
	 */
	public void setN3rdLaneFdrFlg(String n3rdLaneFdrFlg) {
		this.n3rdLaneFdrFlg = n3rdLaneFdrFlg;
	}
	
	/**
	 * Column Info
	 * @param porCd
	 */
	public void setPorCd(String porCd) {
		this.porCd = porCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPolCgoClzDt
	 */
	public void setN2ndPolCgoClzDt(String n2ndPolCgoClzDt) {
		this.n2ndPolCgoClzDt = n2ndPolCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdSlanCd
	 */
	public void setN3rdSlanCd(String n3rdSlanCd) {
		this.n3rdSlanCd = n3rdSlanCd;
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
	 * @param deDt
	 */
	public void setDeDt(String deDt) {
		this.deDt = deDt;
	}
	
	/**
	 * Column Info
	 * @param n1stPodEtbDt
	 */
	public void setN1stPodEtbDt(String n1stPodEtbDt) {
		this.n1stPodEtbDt = n1stPodEtbDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPodCgoClzDt
	 */
	public void setN3rdPodCgoClzDt(String n3rdPodCgoClzDt) {
		this.n3rdPodCgoClzDt = n3rdPodCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param n1stPodEtdDt
	 */
	public void setN1stPodEtdDt(String n1stPodEtdDt) {
		this.n1stPodEtdDt = n1stPodEtdDt;
	}
	
	/**
	 * Column Info
	 * @param polDocClzDt
	 */
	public void setPolDocClzDt(String polDocClzDt) {
		this.polDocClzDt = polDocClzDt;
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
	 * @param vskdEdiSndId
	 */
	public void setVskdEdiSndId(String vskdEdiSndId) {
		this.vskdEdiSndId = vskdEdiSndId;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolEtbDt
	 */
	public void setN3rdPolEtbDt(String n3rdPolEtbDt) {
		this.n3rdPolEtbDt = n3rdPolEtbDt;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodEtbDt
	 */
	public void setN2ndPodEtbDt(String n2ndPodEtbDt) {
		this.n2ndPodEtbDt = n2ndPodEtbDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolEtaDt
	 */
	public void setN3rdPolEtaDt(String n3rdPolEtaDt) {
		this.n3rdPolEtaDt = n3rdPolEtaDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolCd
	 */
	public void setN3rdPolCd(String n3rdPolCd) {
		this.n3rdPolCd = n3rdPolCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodEtaDt
	 */
	public void setN2ndPodEtaDt(String n2ndPodEtaDt) {
		this.n2ndPodEtaDt = n2ndPodEtaDt;
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
	 * @param n1stVslCd
	 */
	public void setN1stVslCd(String n1stVslCd) {
		this.n1stVslCd = n1stVslCd;
	}
	
	/**
	 * Column Info
	 * @param n1stPolCgoClzDt
	 */
	public void setN1stPolCgoClzDt(String n1stPolCgoClzDt) {
		this.n1stPolCgoClzDt = n1stPolCgoClzDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPolEtdDt
	 */
	public void setN3rdPolEtdDt(String n3rdPolEtdDt) {
		this.n3rdPolEtdDt = n3rdPolEtdDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdPodCd
	 */
	public void setN3rdPodCd(String n3rdPodCd) {
		this.n3rdPodCd = n3rdPodCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndPodEtdDt
	 */
	public void setN2ndPodEtdDt(String n2ndPodEtdDt) {
		this.n2ndPodEtdDt = n2ndPodEtdDt;
	}
	
	/**
	 * Column Info
	 * @param n3rdVslCd
	 */
	public void setN3rdVslCd(String n3rdVslCd) {
		this.n3rdVslCd = n3rdVslCd;
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
	 * @param n2ndPolCd
	 */
	public void setN2ndPolCd(String n2ndPolCd) {
		this.n2ndPolCd = n2ndPolCd;
	}
	
	/**
	 * Column Info
	 * @param n1stSlanCd
	 */
	public void setN1stSlanCd(String n1stSlanCd) {
		this.n1stSlanCd = n1stSlanCd;
	}
	
	/**
	 * Column Info
	 * @param n2ndSkdVoyNo
	 */
	public void setN2ndSkdVoyNo(String n2ndSkdVoyNo) {
		this.n2ndSkdVoyNo = n2ndSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param n1stSkdDirCd
	 */
	public void setN1stSkdDirCd(String n1stSkdDirCd) {
		this.n1stSkdDirCd = n1stSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param delEtaDt
	 */
	public void setDelEtaDt(String delEtaDt) {
		this.delEtaDt = delEtaDt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRoutRcvDt(JSPUtil.getParameter(request, "rout_rcv_dt", ""));
		setN2ndPodCgoClzDt(JSPUtil.getParameter(request, "n2nd_pod_cgo_clz_dt", ""));
		setN1stPolCd(JSPUtil.getParameter(request, "n1st_pol_cd", ""));
		setN2ndLaneFdrFlg(JSPUtil.getParameter(request, "n2nd_lane_fdr_flg", ""));
		setN1stLaneFdrFlg(JSPUtil.getParameter(request, "n1st_lane_fdr_flg", ""));
		setN2ndPodCd(JSPUtil.getParameter(request, "n2nd_pod_cd", ""));
		setPolEtdDt(JSPUtil.getParameter(request, "pol_etd_dt", ""));
		setN3rdSkdVoyNo(JSPUtil.getParameter(request, "n3rd_skd_voy_no", ""));
		setN1stPolEtdDt(JSPUtil.getParameter(request, "n1st_pol_etd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setN2ndPolEtaDt(JSPUtil.getParameter(request, "n2nd_pol_eta_dt", ""));
		setN3rdSkdDirCd(JSPUtil.getParameter(request, "n3rd_skd_dir_cd", ""));
		setN3rdPolCgoClzDt(JSPUtil.getParameter(request, "n3rd_pol_cgo_clz_dt", ""));
		setCustTrdPrnrId(JSPUtil.getParameter(request, "cust_trd_prnr_id", ""));
		setN3rdPodEtaDt(JSPUtil.getParameter(request, "n3rd_pod_eta_dt", ""));
		setPorEtdDt(JSPUtil.getParameter(request, "por_etd_dt", ""));
		setN2ndSkdDirCd(JSPUtil.getParameter(request, "n2nd_skd_dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setN1stPodCd(JSPUtil.getParameter(request, "n1st_pod_cd", ""));
		setN1stPolEtaDt(JSPUtil.getParameter(request, "n1st_pol_eta_dt", ""));
		setN3rdPodEtbDt(JSPUtil.getParameter(request, "n3rd_pod_etb_dt", ""));
		setN1stPolEtbDt(JSPUtil.getParameter(request, "n1st_pol_etb_dt", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setN2ndSlanCd(JSPUtil.getParameter(request, "n2nd_slan_cd", ""));
		setN2ndVslCd(JSPUtil.getParameter(request, "n2nd_vsl_cd", ""));
		setN2ndPolEtdDt(JSPUtil.getParameter(request, "n2nd_pol_etd_dt", ""));
		setRoutSeq(JSPUtil.getParameter(request, "rout_seq", ""));
		setN2ndPolEtbDt(JSPUtil.getParameter(request, "n2nd_pol_etb_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setN1stPodCgoClzDt(JSPUtil.getParameter(request, "n1st_pod_cgo_clz_dt", ""));
		setN1stPodEtaDt(JSPUtil.getParameter(request, "n1st_pod_eta_dt", ""));
		setN1stSkdVoyNo(JSPUtil.getParameter(request, "n1st_skd_voy_no", ""));
		setN3rdPodEtdDt(JSPUtil.getParameter(request, "n3rd_pod_etd_dt", ""));
		setN3rdLaneFdrFlg(JSPUtil.getParameter(request, "n3rd_lane_fdr_flg", ""));
		setPorCd(JSPUtil.getParameter(request, "por_cd", ""));
		setN2ndPolCgoClzDt(JSPUtil.getParameter(request, "n2nd_pol_cgo_clz_dt", ""));
		setN3rdSlanCd(JSPUtil.getParameter(request, "n3rd_slan_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeDt(JSPUtil.getParameter(request, "de_dt", ""));
		setN1stPodEtbDt(JSPUtil.getParameter(request, "n1st_pod_etb_dt", ""));
		setN3rdPodCgoClzDt(JSPUtil.getParameter(request, "n3rd_pod_cgo_clz_dt", ""));
		setN1stPodEtdDt(JSPUtil.getParameter(request, "n1st_pod_etd_dt", ""));
		setPolDocClzDt(JSPUtil.getParameter(request, "pol_doc_clz_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVskdEdiSndId(JSPUtil.getParameter(request, "vskd_edi_snd_id", ""));
		setN3rdPolEtbDt(JSPUtil.getParameter(request, "n3rd_pol_etb_dt", ""));
		setN2ndPodEtbDt(JSPUtil.getParameter(request, "n2nd_pod_etb_dt", ""));
		setN3rdPolEtaDt(JSPUtil.getParameter(request, "n3rd_pol_eta_dt", ""));
		setN3rdPolCd(JSPUtil.getParameter(request, "n3rd_pol_cd", ""));
		setN2ndPodEtaDt(JSPUtil.getParameter(request, "n2nd_pod_eta_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setN1stVslCd(JSPUtil.getParameter(request, "n1st_vsl_cd", ""));
		setN1stPolCgoClzDt(JSPUtil.getParameter(request, "n1st_pol_cgo_clz_dt", ""));
		setN3rdPolEtdDt(JSPUtil.getParameter(request, "n3rd_pol_etd_dt", ""));
		setN3rdPodCd(JSPUtil.getParameter(request, "n3rd_pod_cd", ""));
		setN2ndPodEtdDt(JSPUtil.getParameter(request, "n2nd_pod_etd_dt", ""));
		setN3rdVslCd(JSPUtil.getParameter(request, "n3rd_vsl_cd", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setN2ndPolCd(JSPUtil.getParameter(request, "n2nd_pol_cd", ""));
		setN1stSlanCd(JSPUtil.getParameter(request, "n1st_slan_cd", ""));
		setN2ndSkdVoyNo(JSPUtil.getParameter(request, "n2nd_skd_voy_no", ""));
		setN1stSkdDirCd(JSPUtil.getParameter(request, "n1st_skd_dir_cd", ""));
		setDelEtaDt(JSPUtil.getParameter(request, "del_eta_dt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskCustEdiLogVO[]
	 */
	public VskCustEdiLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskCustEdiLogVO[]
	 */
	public VskCustEdiLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskCustEdiLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] routRcvDt = (JSPUtil.getParameter(request, prefix	+ "rout_rcv_dt", length));
			String[] n2ndPodCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_cgo_clz_dt", length));
			String[] n1stPolCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_cd", length));
			String[] n2ndLaneFdrFlg = (JSPUtil.getParameter(request, prefix	+ "n2nd_lane_fdr_flg", length));
			String[] n1stLaneFdrFlg = (JSPUtil.getParameter(request, prefix	+ "n1st_lane_fdr_flg", length));
			String[] n2ndPodCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_cd", length));
			String[] polEtdDt = (JSPUtil.getParameter(request, prefix	+ "pol_etd_dt", length));
			String[] n3rdSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "n3rd_skd_voy_no", length));
			String[] n1stPolEtdDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_etd_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] n2ndPolEtaDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_eta_dt", length));
			String[] n3rdSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_skd_dir_cd", length));
			String[] n3rdPolCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_cgo_clz_dt", length));
			String[] custTrdPrnrId = (JSPUtil.getParameter(request, prefix	+ "cust_trd_prnr_id", length));
			String[] n3rdPodEtaDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_eta_dt", length));
			String[] porEtdDt = (JSPUtil.getParameter(request, prefix	+ "por_etd_dt", length));
			String[] n2ndSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_skd_dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] n1stPodCd = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_cd", length));
			String[] n1stPolEtaDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_eta_dt", length));
			String[] n3rdPodEtbDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_etb_dt", length));
			String[] n1stPolEtbDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_etb_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] n2ndSlanCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_slan_cd", length));
			String[] n2ndVslCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_vsl_cd", length));
			String[] n2ndPolEtdDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_etd_dt", length));
			String[] routSeq = (JSPUtil.getParameter(request, prefix	+ "rout_seq", length));
			String[] n2ndPolEtbDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_etb_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] n1stPodCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_cgo_clz_dt", length));
			String[] n1stPodEtaDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_eta_dt", length));
			String[] n1stSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "n1st_skd_voy_no", length));
			String[] n3rdPodEtdDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_etd_dt", length));
			String[] n3rdLaneFdrFlg = (JSPUtil.getParameter(request, prefix	+ "n3rd_lane_fdr_flg", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] n2ndPolCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_cgo_clz_dt", length));
			String[] n3rdSlanCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_slan_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] deDt = (JSPUtil.getParameter(request, prefix	+ "de_dt", length));
			String[] n1stPodEtbDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_etb_dt", length));
			String[] n3rdPodCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_cgo_clz_dt", length));
			String[] n1stPodEtdDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pod_etd_dt", length));
			String[] polDocClzDt = (JSPUtil.getParameter(request, prefix	+ "pol_doc_clz_dt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vskdEdiSndId = (JSPUtil.getParameter(request, prefix	+ "vskd_edi_snd_id", length));
			String[] n3rdPolEtbDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_etb_dt", length));
			String[] n2ndPodEtbDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_etb_dt", length));
			String[] n3rdPolEtaDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_eta_dt", length));
			String[] n3rdPolCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_cd", length));
			String[] n2ndPodEtaDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_eta_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] n1stVslCd = (JSPUtil.getParameter(request, prefix	+ "n1st_vsl_cd", length));
			String[] n1stPolCgoClzDt = (JSPUtil.getParameter(request, prefix	+ "n1st_pol_cgo_clz_dt", length));
			String[] n3rdPolEtdDt = (JSPUtil.getParameter(request, prefix	+ "n3rd_pol_etd_dt", length));
			String[] n3rdPodCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_pod_cd", length));
			String[] n2ndPodEtdDt = (JSPUtil.getParameter(request, prefix	+ "n2nd_pod_etd_dt", length));
			String[] n3rdVslCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_vsl_cd", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] n2ndPolCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_pol_cd", length));
			String[] n1stSlanCd = (JSPUtil.getParameter(request, prefix	+ "n1st_slan_cd", length));
			String[] n2ndSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "n2nd_skd_voy_no", length));
			String[] n1stSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "n1st_skd_dir_cd", length));
			String[] delEtaDt = (JSPUtil.getParameter(request, prefix	+ "del_eta_dt", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskCustEdiLogVO();
				if (routRcvDt[i] != null)
					model.setRoutRcvDt(routRcvDt[i]);
				if (n2ndPodCgoClzDt[i] != null)
					model.setN2ndPodCgoClzDt(n2ndPodCgoClzDt[i]);
				if (n1stPolCd[i] != null)
					model.setN1stPolCd(n1stPolCd[i]);
				if (n2ndLaneFdrFlg[i] != null)
					model.setN2ndLaneFdrFlg(n2ndLaneFdrFlg[i]);
				if (n1stLaneFdrFlg[i] != null)
					model.setN1stLaneFdrFlg(n1stLaneFdrFlg[i]);
				if (n2ndPodCd[i] != null)
					model.setN2ndPodCd(n2ndPodCd[i]);
				if (polEtdDt[i] != null)
					model.setPolEtdDt(polEtdDt[i]);
				if (n3rdSkdVoyNo[i] != null)
					model.setN3rdSkdVoyNo(n3rdSkdVoyNo[i]);
				if (n1stPolEtdDt[i] != null)
					model.setN1stPolEtdDt(n1stPolEtdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (n2ndPolEtaDt[i] != null)
					model.setN2ndPolEtaDt(n2ndPolEtaDt[i]);
				if (n3rdSkdDirCd[i] != null)
					model.setN3rdSkdDirCd(n3rdSkdDirCd[i]);
				if (n3rdPolCgoClzDt[i] != null)
					model.setN3rdPolCgoClzDt(n3rdPolCgoClzDt[i]);
				if (custTrdPrnrId[i] != null)
					model.setCustTrdPrnrId(custTrdPrnrId[i]);
				if (n3rdPodEtaDt[i] != null)
					model.setN3rdPodEtaDt(n3rdPodEtaDt[i]);
				if (porEtdDt[i] != null)
					model.setPorEtdDt(porEtdDt[i]);
				if (n2ndSkdDirCd[i] != null)
					model.setN2ndSkdDirCd(n2ndSkdDirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (n1stPodCd[i] != null)
					model.setN1stPodCd(n1stPodCd[i]);
				if (n1stPolEtaDt[i] != null)
					model.setN1stPolEtaDt(n1stPolEtaDt[i]);
				if (n3rdPodEtbDt[i] != null)
					model.setN3rdPodEtbDt(n3rdPodEtbDt[i]);
				if (n1stPolEtbDt[i] != null)
					model.setN1stPolEtbDt(n1stPolEtbDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (n2ndSlanCd[i] != null)
					model.setN2ndSlanCd(n2ndSlanCd[i]);
				if (n2ndVslCd[i] != null)
					model.setN2ndVslCd(n2ndVslCd[i]);
				if (n2ndPolEtdDt[i] != null)
					model.setN2ndPolEtdDt(n2ndPolEtdDt[i]);
				if (routSeq[i] != null)
					model.setRoutSeq(routSeq[i]);
				if (n2ndPolEtbDt[i] != null)
					model.setN2ndPolEtbDt(n2ndPolEtbDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (n1stPodCgoClzDt[i] != null)
					model.setN1stPodCgoClzDt(n1stPodCgoClzDt[i]);
				if (n1stPodEtaDt[i] != null)
					model.setN1stPodEtaDt(n1stPodEtaDt[i]);
				if (n1stSkdVoyNo[i] != null)
					model.setN1stSkdVoyNo(n1stSkdVoyNo[i]);
				if (n3rdPodEtdDt[i] != null)
					model.setN3rdPodEtdDt(n3rdPodEtdDt[i]);
				if (n3rdLaneFdrFlg[i] != null)
					model.setN3rdLaneFdrFlg(n3rdLaneFdrFlg[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (n2ndPolCgoClzDt[i] != null)
					model.setN2ndPolCgoClzDt(n2ndPolCgoClzDt[i]);
				if (n3rdSlanCd[i] != null)
					model.setN3rdSlanCd(n3rdSlanCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (deDt[i] != null)
					model.setDeDt(deDt[i]);
				if (n1stPodEtbDt[i] != null)
					model.setN1stPodEtbDt(n1stPodEtbDt[i]);
				if (n3rdPodCgoClzDt[i] != null)
					model.setN3rdPodCgoClzDt(n3rdPodCgoClzDt[i]);
				if (n1stPodEtdDt[i] != null)
					model.setN1stPodEtdDt(n1stPodEtdDt[i]);
				if (polDocClzDt[i] != null)
					model.setPolDocClzDt(polDocClzDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vskdEdiSndId[i] != null)
					model.setVskdEdiSndId(vskdEdiSndId[i]);
				if (n3rdPolEtbDt[i] != null)
					model.setN3rdPolEtbDt(n3rdPolEtbDt[i]);
				if (n2ndPodEtbDt[i] != null)
					model.setN2ndPodEtbDt(n2ndPodEtbDt[i]);
				if (n3rdPolEtaDt[i] != null)
					model.setN3rdPolEtaDt(n3rdPolEtaDt[i]);
				if (n3rdPolCd[i] != null)
					model.setN3rdPolCd(n3rdPolCd[i]);
				if (n2ndPodEtaDt[i] != null)
					model.setN2ndPodEtaDt(n2ndPodEtaDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n1stVslCd[i] != null)
					model.setN1stVslCd(n1stVslCd[i]);
				if (n1stPolCgoClzDt[i] != null)
					model.setN1stPolCgoClzDt(n1stPolCgoClzDt[i]);
				if (n3rdPolEtdDt[i] != null)
					model.setN3rdPolEtdDt(n3rdPolEtdDt[i]);
				if (n3rdPodCd[i] != null)
					model.setN3rdPodCd(n3rdPodCd[i]);
				if (n2ndPodEtdDt[i] != null)
					model.setN2ndPodEtdDt(n2ndPodEtdDt[i]);
				if (n3rdVslCd[i] != null)
					model.setN3rdVslCd(n3rdVslCd[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (n2ndPolCd[i] != null)
					model.setN2ndPolCd(n2ndPolCd[i]);
				if (n1stSlanCd[i] != null)
					model.setN1stSlanCd(n1stSlanCd[i]);
				if (n2ndSkdVoyNo[i] != null)
					model.setN2ndSkdVoyNo(n2ndSkdVoyNo[i]);
				if (n1stSkdDirCd[i] != null)
					model.setN1stSkdDirCd(n1stSkdDirCd[i]);
				if (delEtaDt[i] != null)
					model.setDelEtaDt(delEtaDt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskCustEdiLogVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskCustEdiLogVO[]
	 */
	public VskCustEdiLogVO[] getVskCustEdiLogVOs(){
		VskCustEdiLogVO[] vos = (VskCustEdiLogVO[])models.toArray(new VskCustEdiLogVO[models.size()]);
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
		this.routRcvDt = this.routRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodCgoClzDt = this.n2ndPodCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolCd = this.n1stPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndLaneFdrFlg = this.n2ndLaneFdrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stLaneFdrFlg = this.n1stLaneFdrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodCd = this.n2ndPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polEtdDt = this.polEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdSkdVoyNo = this.n3rdSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolEtdDt = this.n1stPolEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolEtaDt = this.n2ndPolEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdSkdDirCd = this.n3rdSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolCgoClzDt = this.n3rdPolCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTrdPrnrId = this.custTrdPrnrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodEtaDt = this.n3rdPodEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porEtdDt = this.porEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndSkdDirCd = this.n2ndSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodCd = this.n1stPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolEtaDt = this.n1stPolEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodEtbDt = this.n3rdPodEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolEtbDt = this.n1stPolEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndSlanCd = this.n2ndSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndVslCd = this.n2ndVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolEtdDt = this.n2ndPolEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.routSeq = this.routSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolEtbDt = this.n2ndPolEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodCgoClzDt = this.n1stPodCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodEtaDt = this.n1stPodEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stSkdVoyNo = this.n1stSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodEtdDt = this.n3rdPodEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdLaneFdrFlg = this.n3rdLaneFdrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolCgoClzDt = this.n2ndPolCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdSlanCd = this.n3rdSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deDt = this.deDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodEtbDt = this.n1stPodEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodCgoClzDt = this.n3rdPodCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPodEtdDt = this.n1stPodEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polDocClzDt = this.polDocClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vskdEdiSndId = this.vskdEdiSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolEtbDt = this.n3rdPolEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodEtbDt = this.n2ndPodEtbDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolEtaDt = this.n3rdPolEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolCd = this.n3rdPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodEtaDt = this.n2ndPodEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stVslCd = this.n1stVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stPolCgoClzDt = this.n1stPolCgoClzDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPolEtdDt = this.n3rdPolEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdPodCd = this.n3rdPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPodEtdDt = this.n2ndPodEtdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdVslCd = this.n3rdVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndPolCd = this.n2ndPolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stSlanCd = this.n1stSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndSkdVoyNo = this.n2ndSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stSkdDirCd = this.n1stSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delEtaDt = this.delEtaDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
