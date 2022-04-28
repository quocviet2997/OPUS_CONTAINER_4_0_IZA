/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCodVO.java
*@FileTitle : BkgCodVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 최영희
*@LastVersion : 1.0
* 2009.07.23 최영희 
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
 * @author 최영희
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCodVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCodVO> models = new ArrayList<BkgCodVO>();
	
	/* Column Info */
	private String rgnCd = null;
	/* Column Info */
	private String codChgTtlCostAmt = null;
	/* Column Info */
	private String oldVslCd = null;
	/* Column Info */
	private String newPorYdCd = null;
	/* Column Info */
	private String codAuthFlg = null;
	/* Column Info */
	private String codStsCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String codIssDt = null;
	/* Column Info */
	private String pctlNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String oldPolYdCd = null;
	/* Column Info */
	private String codTrfCostAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String newDelYdCd = null;
	/* Column Info */
	private String codRqstSeq = null;
	/* Column Info */
	private String codRhndPortCd = null;
	/* Column Info */
	private String oldDelYdCd = null;
	/* Column Info */
	private String codCngCostRmk = null;
	/* Column Info */
	private String codRqstRsnCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String newSkdVoyNo = null;
	/* Column Info */
	private String codRjctRsnRmk = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String codRhndPortYdCd = null;
	/* Column Info */
	private String oldPodYdCd = null;
	/* Column Info */
	private String newVslCd = null;
	/* Column Info */
	private String codRqstOfcCd = null;
	/* Column Info */
	private String codRjctCd = null;
	/* Column Info */
	private String oldSkdVoyNo = null;
	/* Column Info */
	private String newSkdDirCd = null;
	/* Column Info */
	private String newPolYdCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String diffRmk = null;
	/* Column Info */
	private String oldSkdDirCd = null;
	/* Column Info */
	private String newPodYdCd = null;
	/* Column Info */
	private String codFnlCostAmt = null;
	/* Column Info */
	private String oldPorYdCd = null;
	/* Column Info */
	private String newDeTermCd = null;
	/* Column Info */
	private String codMnlFlg = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCodVO() {}

	public BkgCodVO(String ibflag, String pagerows, String bkgNo, String codRqstSeq, String codStsCd, String codIssDt, String codRqstRsnCd, String rgnCd, String oldVslCd, String oldSkdVoyNo, String oldSkdDirCd, String oldPorYdCd, String oldPolYdCd, String oldPodYdCd, String oldDelYdCd, String newVslCd, String newSkdVoyNo, String newSkdDirCd, String newPorYdCd, String newPolYdCd, String newPodYdCd, String newDelYdCd, String codRhndPortCd, String codRhndPortYdCd, String codCngCostRmk, String codChgTtlCostAmt, String codTrfCostAmt, String codFnlCostAmt, String codRqstOfcCd, String codAuthFlg, String codRjctCd, String codRjctRsnRmk, String pctlNo, String diffRmk, String creUsrId, String creDt, String updUsrId, String updDt, String newDeTermCd, String codMnlFlg) {
		this.rgnCd = rgnCd;
		this.codChgTtlCostAmt = codChgTtlCostAmt;
		this.oldVslCd = oldVslCd;
		this.newPorYdCd = newPorYdCd;
		this.codAuthFlg = codAuthFlg;
		this.codStsCd = codStsCd;
		this.creDt = creDt;
		this.codIssDt = codIssDt;
		this.pctlNo = pctlNo;
		this.pagerows = pagerows;
		this.oldPolYdCd = oldPolYdCd;
		this.codTrfCostAmt = codTrfCostAmt;
		this.ibflag = ibflag;
		this.newDelYdCd = newDelYdCd;
		this.codRqstSeq = codRqstSeq;
		this.codRhndPortCd = codRhndPortCd;
		this.oldDelYdCd = oldDelYdCd;
		this.codCngCostRmk = codCngCostRmk;
		this.codRqstRsnCd = codRqstRsnCd;
		this.updUsrId = updUsrId;
		this.newSkdVoyNo = newSkdVoyNo;
		this.codRjctRsnRmk = codRjctRsnRmk;
		this.updDt = updDt;
		this.codRhndPortYdCd = codRhndPortYdCd;
		this.oldPodYdCd = oldPodYdCd;
		this.newVslCd = newVslCd;
		this.codRqstOfcCd = codRqstOfcCd;
		this.codRjctCd = codRjctCd;
		this.oldSkdVoyNo = oldSkdVoyNo;
		this.newSkdDirCd = newSkdDirCd;
		this.newPolYdCd = newPolYdCd;
		this.creUsrId = creUsrId;
		this.bkgNo = bkgNo;
		this.diffRmk = diffRmk;
		this.oldSkdDirCd = oldSkdDirCd;
		this.newPodYdCd = newPodYdCd;
		this.codFnlCostAmt = codFnlCostAmt;
		this.oldPorYdCd = oldPorYdCd;
		this.newDeTermCd = newDeTermCd;
		this.codMnlFlg = codMnlFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rgn_cd", getRgnCd());
		this.hashColumns.put("cod_chg_ttl_cost_amt", getCodChgTtlCostAmt());
		this.hashColumns.put("old_vsl_cd", getOldVslCd());
		this.hashColumns.put("new_por_yd_cd", getNewPorYdCd());
		this.hashColumns.put("cod_auth_flg", getCodAuthFlg());
		this.hashColumns.put("cod_sts_cd", getCodStsCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cod_iss_dt", getCodIssDt());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("old_pol_yd_cd", getOldPolYdCd());
		this.hashColumns.put("cod_trf_cost_amt", getCodTrfCostAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("new_del_yd_cd", getNewDelYdCd());
		this.hashColumns.put("cod_rqst_seq", getCodRqstSeq());
		this.hashColumns.put("cod_rhnd_port_cd", getCodRhndPortCd());
		this.hashColumns.put("old_del_yd_cd", getOldDelYdCd());
		this.hashColumns.put("cod_cng_cost_rmk", getCodCngCostRmk());
		this.hashColumns.put("cod_rqst_rsn_cd", getCodRqstRsnCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("new_skd_voy_no", getNewSkdVoyNo());
		this.hashColumns.put("cod_rjct_rsn_rmk", getCodRjctRsnRmk());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cod_rhnd_port_yd_cd", getCodRhndPortYdCd());
		this.hashColumns.put("old_pod_yd_cd", getOldPodYdCd());
		this.hashColumns.put("new_vsl_cd", getNewVslCd());
		this.hashColumns.put("cod_rqst_ofc_cd", getCodRqstOfcCd());
		this.hashColumns.put("cod_rjct_cd", getCodRjctCd());
		this.hashColumns.put("old_skd_voy_no", getOldSkdVoyNo());
		this.hashColumns.put("new_skd_dir_cd", getNewSkdDirCd());
		this.hashColumns.put("new_pol_yd_cd", getNewPolYdCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("diff_rmk", getDiffRmk());
		this.hashColumns.put("old_skd_dir_cd", getOldSkdDirCd());
		this.hashColumns.put("new_pod_yd_cd", getNewPodYdCd());
		this.hashColumns.put("cod_fnl_cost_amt", getCodFnlCostAmt());
		this.hashColumns.put("old_por_yd_cd", getOldPorYdCd());
		this.hashColumns.put("new_de_term_cd", getNewDeTermCd());
		this.hashColumns.put("cod_mnl_flg", getCodMnlFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rgn_cd", "rgnCd");
		this.hashFields.put("cod_chg_ttl_cost_amt", "codChgTtlCostAmt");
		this.hashFields.put("old_vsl_cd", "oldVslCd");
		this.hashFields.put("new_por_yd_cd", "newPorYdCd");
		this.hashFields.put("cod_auth_flg", "codAuthFlg");
		this.hashFields.put("cod_sts_cd", "codStsCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cod_iss_dt", "codIssDt");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("old_pol_yd_cd", "oldPolYdCd");
		this.hashFields.put("cod_trf_cost_amt", "codTrfCostAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("new_del_yd_cd", "newDelYdCd");
		this.hashFields.put("cod_rqst_seq", "codRqstSeq");
		this.hashFields.put("cod_rhnd_port_cd", "codRhndPortCd");
		this.hashFields.put("old_del_yd_cd", "oldDelYdCd");
		this.hashFields.put("cod_cng_cost_rmk", "codCngCostRmk");
		this.hashFields.put("cod_rqst_rsn_cd", "codRqstRsnCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("new_skd_voy_no", "newSkdVoyNo");
		this.hashFields.put("cod_rjct_rsn_rmk", "codRjctRsnRmk");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cod_rhnd_port_yd_cd", "codRhndPortYdCd");
		this.hashFields.put("old_pod_yd_cd", "oldPodYdCd");
		this.hashFields.put("new_vsl_cd", "newVslCd");
		this.hashFields.put("cod_rqst_ofc_cd", "codRqstOfcCd");
		this.hashFields.put("cod_rjct_cd", "codRjctCd");
		this.hashFields.put("old_skd_voy_no", "oldSkdVoyNo");
		this.hashFields.put("new_skd_dir_cd", "newSkdDirCd");
		this.hashFields.put("new_pol_yd_cd", "newPolYdCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("diff_rmk", "diffRmk");
		this.hashFields.put("old_skd_dir_cd", "oldSkdDirCd");
		this.hashFields.put("new_pod_yd_cd", "newPodYdCd");
		this.hashFields.put("cod_fnl_cost_amt", "codFnlCostAmt");
		this.hashFields.put("old_por_yd_cd", "oldPorYdCd");
		this.hashFields.put("new_de_term_cd", "newDeTermCd");
		this.hashFields.put("cod_mnl_flg", "codMnlFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rgnCd
	 */
	public String getRgnCd() {
		return this.rgnCd;
	}
	
	/**
	 * Column Info
	 * @return codChgTtlCostAmt
	 */
	public String getCodChgTtlCostAmt() {
		return this.codChgTtlCostAmt;
	}
	
	/**
	 * Column Info
	 * @return oldVslCd
	 */
	public String getOldVslCd() {
		return this.oldVslCd;
	}
	
	/**
	 * Column Info
	 * @return newPorYdCd
	 */
	public String getNewPorYdCd() {
		return this.newPorYdCd;
	}
	
	/**
	 * Column Info
	 * @return codAuthFlg
	 */
	public String getCodAuthFlg() {
		return this.codAuthFlg;
	}
	
	/**
	 * Column Info
	 * @return codStsCd
	 */
	public String getCodStsCd() {
		return this.codStsCd;
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
	 * @return codIssDt
	 */
	public String getCodIssDt() {
		return this.codIssDt;
	}
	
	/**
	 * Column Info
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
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
	 * @return oldPolYdCd
	 */
	public String getOldPolYdCd() {
		return this.oldPolYdCd;
	}
	
	/**
	 * Column Info
	 * @return codTrfCostAmt
	 */
	public String getCodTrfCostAmt() {
		return this.codTrfCostAmt;
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
	 * @return newDelYdCd
	 */
	public String getNewDelYdCd() {
		return this.newDelYdCd;
	}
	
	/**
	 * Column Info
	 * @return codRqstSeq
	 */
	public String getCodRqstSeq() {
		return this.codRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return codRhndPortCd
	 */
	public String getCodRhndPortCd() {
		return this.codRhndPortCd;
	}
	
	/**
	 * Column Info
	 * @return oldDelYdCd
	 */
	public String getOldDelYdCd() {
		return this.oldDelYdCd;
	}
	
	/**
	 * Column Info
	 * @return codCngCostRmk
	 */
	public String getCodCngCostRmk() {
		return this.codCngCostRmk;
	}
	
	/**
	 * Column Info
	 * @return codRqstRsnCd
	 */
	public String getCodRqstRsnCd() {
		return this.codRqstRsnCd;
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
	 * @return newSkdVoyNo
	 */
	public String getNewSkdVoyNo() {
		return this.newSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return codRjctRsnRmk
	 */
	public String getCodRjctRsnRmk() {
		return this.codRjctRsnRmk;
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
	 * @return codRhndPortYdCd
	 */
	public String getCodRhndPortYdCd() {
		return this.codRhndPortYdCd;
	}
	
	/**
	 * Column Info
	 * @return oldPodYdCd
	 */
	public String getOldPodYdCd() {
		return this.oldPodYdCd;
	}
	
	/**
	 * Column Info
	 * @return newVslCd
	 */
	public String getNewVslCd() {
		return this.newVslCd;
	}
	
	/**
	 * Column Info
	 * @return codRqstOfcCd
	 */
	public String getCodRqstOfcCd() {
		return this.codRqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @return codRjctCd
	 */
	public String getCodRjctCd() {
		return this.codRjctCd;
	}
	
	/**
	 * Column Info
	 * @return oldSkdVoyNo
	 */
	public String getOldSkdVoyNo() {
		return this.oldSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return newSkdDirCd
	 */
	public String getNewSkdDirCd() {
		return this.newSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return newPolYdCd
	 */
	public String getNewPolYdCd() {
		return this.newPolYdCd;
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
	 * @return diffRmk
	 */
	public String getDiffRmk() {
		return this.diffRmk;
	}
	
	/**
	 * Column Info
	 * @return oldSkdDirCd
	 */
	public String getOldSkdDirCd() {
		return this.oldSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @return newPodYdCd
	 */
	public String getNewPodYdCd() {
		return this.newPodYdCd;
	}
	
	/**
	 * Column Info
	 * @return codFnlCostAmt
	 */
	public String getCodFnlCostAmt() {
		return this.codFnlCostAmt;
	}
	
	/**
	 * Column Info
	 * @return oldPorYdCd
	 */
	public String getOldPorYdCd() {
		return this.oldPorYdCd;
	}

	/**
	 * Column Info
	 * @return newDeTermCd
	 */
	public String getNewDeTermCd() {
		return newDeTermCd;
	}

	/**
	 * Column Info
	 * @return codMnlFlg
	 */
	public String getCodMnlFlg() {
		return codMnlFlg;
	}
	/**
	 * Column Info
	 * @param rgnCd
	 */
	public void setRgnCd(String rgnCd) {
		this.rgnCd = rgnCd;
	}
	
	/**
	 * Column Info
	 * @param codChgTtlCostAmt
	 */
	public void setCodChgTtlCostAmt(String codChgTtlCostAmt) {
		this.codChgTtlCostAmt = codChgTtlCostAmt;
	}
	
	/**
	 * Column Info
	 * @param oldVslCd
	 */
	public void setOldVslCd(String oldVslCd) {
		this.oldVslCd = oldVslCd;
	}
	
	/**
	 * Column Info
	 * @param newPorYdCd
	 */
	public void setNewPorYdCd(String newPorYdCd) {
		this.newPorYdCd = newPorYdCd;
	}
	
	/**
	 * Column Info
	 * @param codAuthFlg
	 */
	public void setCodAuthFlg(String codAuthFlg) {
		this.codAuthFlg = codAuthFlg;
	}
	
	/**
	 * Column Info
	 * @param codStsCd
	 */
	public void setCodStsCd(String codStsCd) {
		this.codStsCd = codStsCd;
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
	 * @param codIssDt
	 */
	public void setCodIssDt(String codIssDt) {
		this.codIssDt = codIssDt;
	}
	
	/**
	 * Column Info
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
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
	 * @param oldPolYdCd
	 */
	public void setOldPolYdCd(String oldPolYdCd) {
		this.oldPolYdCd = oldPolYdCd;
	}
	
	/**
	 * Column Info
	 * @param codTrfCostAmt
	 */
	public void setCodTrfCostAmt(String codTrfCostAmt) {
		this.codTrfCostAmt = codTrfCostAmt;
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
	 * @param newDelYdCd
	 */
	public void setNewDelYdCd(String newDelYdCd) {
		this.newDelYdCd = newDelYdCd;
	}
	
	/**
	 * Column Info
	 * @param codRqstSeq
	 */
	public void setCodRqstSeq(String codRqstSeq) {
		this.codRqstSeq = codRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param codRhndPortCd
	 */
	public void setCodRhndPortCd(String codRhndPortCd) {
		this.codRhndPortCd = codRhndPortCd;
	}
	
	/**
	 * Column Info
	 * @param oldDelYdCd
	 */
	public void setOldDelYdCd(String oldDelYdCd) {
		this.oldDelYdCd = oldDelYdCd;
	}
	
	/**
	 * Column Info
	 * @param codCngCostRmk
	 */
	public void setCodCngCostRmk(String codCngCostRmk) {
		this.codCngCostRmk = codCngCostRmk;
	}
	
	/**
	 * Column Info
	 * @param codRqstRsnCd
	 */
	public void setCodRqstRsnCd(String codRqstRsnCd) {
		this.codRqstRsnCd = codRqstRsnCd;
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
	 * @param newSkdVoyNo
	 */
	public void setNewSkdVoyNo(String newSkdVoyNo) {
		this.newSkdVoyNo = newSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param codRjctRsnRmk
	 */
	public void setCodRjctRsnRmk(String codRjctRsnRmk) {
		this.codRjctRsnRmk = codRjctRsnRmk;
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
	 * @param codRhndPortYdCd
	 */
	public void setCodRhndPortYdCd(String codRhndPortYdCd) {
		this.codRhndPortYdCd = codRhndPortYdCd;
	}
	
	/**
	 * Column Info
	 * @param oldPodYdCd
	 */
	public void setOldPodYdCd(String oldPodYdCd) {
		this.oldPodYdCd = oldPodYdCd;
	}
	
	/**
	 * Column Info
	 * @param newVslCd
	 */
	public void setNewVslCd(String newVslCd) {
		this.newVslCd = newVslCd;
	}
	
	/**
	 * Column Info
	 * @param codRqstOfcCd
	 */
	public void setCodRqstOfcCd(String codRqstOfcCd) {
		this.codRqstOfcCd = codRqstOfcCd;
	}
	
	/**
	 * Column Info
	 * @param codRjctCd
	 */
	public void setCodRjctCd(String codRjctCd) {
		this.codRjctCd = codRjctCd;
	}
	
	/**
	 * Column Info
	 * @param oldSkdVoyNo
	 */
	public void setOldSkdVoyNo(String oldSkdVoyNo) {
		this.oldSkdVoyNo = oldSkdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param newSkdDirCd
	 */
	public void setNewSkdDirCd(String newSkdDirCd) {
		this.newSkdDirCd = newSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param newPolYdCd
	 */
	public void setNewPolYdCd(String newPolYdCd) {
		this.newPolYdCd = newPolYdCd;
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
	 * @param diffRmk
	 */
	public void setDiffRmk(String diffRmk) {
		this.diffRmk = diffRmk;
	}
	
	/**
	 * Column Info
	 * @param oldSkdDirCd
	 */
	public void setOldSkdDirCd(String oldSkdDirCd) {
		this.oldSkdDirCd = oldSkdDirCd;
	}
	
	/**
	 * Column Info
	 * @param newPodYdCd
	 */
	public void setNewPodYdCd(String newPodYdCd) {
		this.newPodYdCd = newPodYdCd;
	}
	
	/**
	 * Column Info
	 * @param codFnlCostAmt
	 */
	public void setCodFnlCostAmt(String codFnlCostAmt) {
		this.codFnlCostAmt = codFnlCostAmt;
	}
	
	/**
	 * Column Info
	 * @param oldPorYdCd
	 */
	public void setOldPorYdCd(String oldPorYdCd) {
		this.oldPorYdCd = oldPorYdCd;
	}
	/**
	 * Column Info
	 * @param newDeTermCd
	 */
	public void setNewDeTermCd(String newDeTermCd) {
		this.newDeTermCd = newDeTermCd;
	}
	/**
	 * Column Info
	 * @param codMnlFlg
	 */
	public void setCodMnlFlg(String codMnlFlg) {
		this.codMnlFlg = codMnlFlg;
	}
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setRgnCd(JSPUtil.getParameter(request, "rgn_cd", ""));
		setCodChgTtlCostAmt(JSPUtil.getParameter(request, "cod_chg_ttl_cost_amt", ""));
		setOldVslCd(JSPUtil.getParameter(request, "old_vsl_cd", ""));
		setNewPorYdCd(JSPUtil.getParameter(request, "new_por_yd_cd", ""));
		setCodAuthFlg(JSPUtil.getParameter(request, "cod_auth_flg", ""));
		setCodStsCd(JSPUtil.getParameter(request, "cod_sts_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setCodIssDt(JSPUtil.getParameter(request, "cod_iss_dt", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOldPolYdCd(JSPUtil.getParameter(request, "old_pol_yd_cd", ""));
		setCodTrfCostAmt(JSPUtil.getParameter(request, "cod_trf_cost_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setNewDelYdCd(JSPUtil.getParameter(request, "new_del_yd_cd", ""));
		setCodRqstSeq(JSPUtil.getParameter(request, "cod_rqst_seq", ""));
		setCodRhndPortCd(JSPUtil.getParameter(request, "cod_rhnd_port_cd", ""));
		setOldDelYdCd(JSPUtil.getParameter(request, "old_del_yd_cd", ""));
		setCodCngCostRmk(JSPUtil.getParameter(request, "cod_cng_cost_rmk", ""));
		setCodRqstRsnCd(JSPUtil.getParameter(request, "cod_rqst_rsn_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setNewSkdVoyNo(JSPUtil.getParameter(request, "new_skd_voy_no", ""));
		setCodRjctRsnRmk(JSPUtil.getParameter(request, "cod_rjct_rsn_rmk", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCodRhndPortYdCd(JSPUtil.getParameter(request, "cod_rhnd_port_yd_cd", ""));
		setOldPodYdCd(JSPUtil.getParameter(request, "old_pod_yd_cd", ""));
		setNewVslCd(JSPUtil.getParameter(request, "new_vsl_cd", ""));
		setCodRqstOfcCd(JSPUtil.getParameter(request, "cod_rqst_ofc_cd", ""));
		setCodRjctCd(JSPUtil.getParameter(request, "cod_rjct_cd", ""));
		setOldSkdVoyNo(JSPUtil.getParameter(request, "old_skd_voy_no", ""));
		setNewSkdDirCd(JSPUtil.getParameter(request, "new_skd_dir_cd", ""));
		setNewPolYdCd(JSPUtil.getParameter(request, "new_pol_yd_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setDiffRmk(JSPUtil.getParameter(request, "diff_rmk", ""));
		setOldSkdDirCd(JSPUtil.getParameter(request, "old_skd_dir_cd", ""));
		setNewPodYdCd(JSPUtil.getParameter(request, "new_pod_yd_cd", ""));
		setCodFnlCostAmt(JSPUtil.getParameter(request, "cod_fnl_cost_amt", ""));
		setOldPorYdCd(JSPUtil.getParameter(request, "old_por_yd_cd", ""));
		setNewDeTermCd(JSPUtil.getParameter(request, "new_de_term_cd", ""));
		setCodMnlFlg(JSPUtil.getParameter(request, "cod_mnl_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCodVO[]
	 */
	public BkgCodVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCodVO[]
	 */
	public BkgCodVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCodVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rgnCd = (JSPUtil.getParameter(request, prefix	+ "rgn_cd", length));
			String[] codChgTtlCostAmt = (JSPUtil.getParameter(request, prefix	+ "cod_chg_ttl_cost_amt", length));
			String[] oldVslCd = (JSPUtil.getParameter(request, prefix	+ "old_vsl_cd", length));
			String[] newPorYdCd = (JSPUtil.getParameter(request, prefix	+ "new_por_yd_cd", length));
			String[] codAuthFlg = (JSPUtil.getParameter(request, prefix	+ "cod_auth_flg", length));
			String[] codStsCd = (JSPUtil.getParameter(request, prefix	+ "cod_sts_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] codIssDt = (JSPUtil.getParameter(request, prefix	+ "cod_iss_dt", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] oldPolYdCd = (JSPUtil.getParameter(request, prefix	+ "old_pol_yd_cd", length));
			String[] codTrfCostAmt = (JSPUtil.getParameter(request, prefix	+ "cod_trf_cost_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] newDelYdCd = (JSPUtil.getParameter(request, prefix	+ "new_del_yd_cd", length));
			String[] codRqstSeq = (JSPUtil.getParameter(request, prefix	+ "cod_rqst_seq", length));
			String[] codRhndPortCd = (JSPUtil.getParameter(request, prefix	+ "cod_rhnd_port_cd", length));
			String[] oldDelYdCd = (JSPUtil.getParameter(request, prefix	+ "old_del_yd_cd", length));
			String[] codCngCostRmk = (JSPUtil.getParameter(request, prefix	+ "cod_cng_cost_rmk", length));
			String[] codRqstRsnCd = (JSPUtil.getParameter(request, prefix	+ "cod_rqst_rsn_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] newSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "new_skd_voy_no", length));
			String[] codRjctRsnRmk = (JSPUtil.getParameter(request, prefix	+ "cod_rjct_rsn_rmk", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] codRhndPortYdCd = (JSPUtil.getParameter(request, prefix	+ "cod_rhnd_port_yd_cd", length));
			String[] oldPodYdCd = (JSPUtil.getParameter(request, prefix	+ "old_pod_yd_cd", length));
			String[] newVslCd = (JSPUtil.getParameter(request, prefix	+ "new_vsl_cd", length));
			String[] codRqstOfcCd = (JSPUtil.getParameter(request, prefix	+ "cod_rqst_ofc_cd", length));
			String[] codRjctCd = (JSPUtil.getParameter(request, prefix	+ "cod_rjct_cd", length));
			String[] oldSkdVoyNo = (JSPUtil.getParameter(request, prefix	+ "old_skd_voy_no", length));
			String[] newSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "new_skd_dir_cd", length));
			String[] newPolYdCd = (JSPUtil.getParameter(request, prefix	+ "new_pol_yd_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] diffRmk = (JSPUtil.getParameter(request, prefix	+ "diff_rmk", length));
			String[] oldSkdDirCd = (JSPUtil.getParameter(request, prefix	+ "old_skd_dir_cd", length));
			String[] newPodYdCd = (JSPUtil.getParameter(request, prefix	+ "new_pod_yd_cd", length));
			String[] codFnlCostAmt = (JSPUtil.getParameter(request, prefix	+ "cod_fnl_cost_amt", length));
			String[] oldPorYdCd = (JSPUtil.getParameter(request, prefix	+ "old_por_yd_cd", length));
			String[] newDeTermCd = (JSPUtil.getParameter(request, prefix	+ "new_de_term_cd", length));
			String[] codMnlFlg = (JSPUtil.getParameter(request, prefix	+ "cod_mnl_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCodVO();
				if (rgnCd[i] != null)
					model.setRgnCd(rgnCd[i]);
				if (codChgTtlCostAmt[i] != null)
					model.setCodChgTtlCostAmt(codChgTtlCostAmt[i]);
				if (oldVslCd[i] != null)
					model.setOldVslCd(oldVslCd[i]);
				if (newPorYdCd[i] != null)
					model.setNewPorYdCd(newPorYdCd[i]);
				if (codAuthFlg[i] != null)
					model.setCodAuthFlg(codAuthFlg[i]);
				if (codStsCd[i] != null)
					model.setCodStsCd(codStsCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (codIssDt[i] != null)
					model.setCodIssDt(codIssDt[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (oldPolYdCd[i] != null)
					model.setOldPolYdCd(oldPolYdCd[i]);
				if (codTrfCostAmt[i] != null)
					model.setCodTrfCostAmt(codTrfCostAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (newDelYdCd[i] != null)
					model.setNewDelYdCd(newDelYdCd[i]);
				if (codRqstSeq[i] != null)
					model.setCodRqstSeq(codRqstSeq[i]);
				if (codRhndPortCd[i] != null)
					model.setCodRhndPortCd(codRhndPortCd[i]);
				if (oldDelYdCd[i] != null)
					model.setOldDelYdCd(oldDelYdCd[i]);
				if (codCngCostRmk[i] != null)
					model.setCodCngCostRmk(codCngCostRmk[i]);
				if (codRqstRsnCd[i] != null)
					model.setCodRqstRsnCd(codRqstRsnCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (newSkdVoyNo[i] != null)
					model.setNewSkdVoyNo(newSkdVoyNo[i]);
				if (codRjctRsnRmk[i] != null)
					model.setCodRjctRsnRmk(codRjctRsnRmk[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (codRhndPortYdCd[i] != null)
					model.setCodRhndPortYdCd(codRhndPortYdCd[i]);
				if (oldPodYdCd[i] != null)
					model.setOldPodYdCd(oldPodYdCd[i]);
				if (newVslCd[i] != null)
					model.setNewVslCd(newVslCd[i]);
				if (codRqstOfcCd[i] != null)
					model.setCodRqstOfcCd(codRqstOfcCd[i]);
				if (codRjctCd[i] != null)
					model.setCodRjctCd(codRjctCd[i]);
				if (oldSkdVoyNo[i] != null)
					model.setOldSkdVoyNo(oldSkdVoyNo[i]);
				if (newSkdDirCd[i] != null)
					model.setNewSkdDirCd(newSkdDirCd[i]);
				if (newPolYdCd[i] != null)
					model.setNewPolYdCd(newPolYdCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (diffRmk[i] != null)
					model.setDiffRmk(diffRmk[i]);
				if (oldSkdDirCd[i] != null)
					model.setOldSkdDirCd(oldSkdDirCd[i]);
				if (newPodYdCd[i] != null)
					model.setNewPodYdCd(newPodYdCd[i]);
				if (codFnlCostAmt[i] != null)
					model.setCodFnlCostAmt(codFnlCostAmt[i]);
				if (oldPorYdCd[i] != null)
					model.setOldPorYdCd(oldPorYdCd[i]);
				if (newDeTermCd[i] != null)
					model.setNewDeTermCd(newDeTermCd[i]);
				if (codMnlFlg[i] != null)
					model.setCodMnlFlg(codMnlFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCodVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCodVO[]
	 */
	public BkgCodVO[] getBkgCodVOs(){
		BkgCodVO[] vos = (BkgCodVO[])models.toArray(new BkgCodVO[models.size()]);
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
		this.rgnCd = this.rgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codChgTtlCostAmt = this.codChgTtlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldVslCd = this.oldVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newPorYdCd = this.newPorYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codAuthFlg = this.codAuthFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codStsCd = this.codStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codIssDt = this.codIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldPolYdCd = this.oldPolYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codTrfCostAmt = this.codTrfCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newDelYdCd = this.newDelYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRqstSeq = this.codRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRhndPortCd = this.codRhndPortCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldDelYdCd = this.oldDelYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codCngCostRmk = this.codCngCostRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRqstRsnCd = this.codRqstRsnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newSkdVoyNo = this.newSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRjctRsnRmk = this.codRjctRsnRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRhndPortYdCd = this.codRhndPortYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldPodYdCd = this.oldPodYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newVslCd = this.newVslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRqstOfcCd = this.codRqstOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRjctCd = this.codRjctCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldSkdVoyNo = this.oldSkdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newSkdDirCd = this.newSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newPolYdCd = this.newPolYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.diffRmk = this.diffRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldSkdDirCd = this.oldSkdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newPodYdCd = this.newPodYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codFnlCostAmt = this.codFnlCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldPorYdCd = this.oldPorYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newDeTermCd= this.newDeTermCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codMnlFlg= this.codMnlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
