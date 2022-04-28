/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgOtsDtlVO.java
*@FileTitle : BkgOtsDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.03.26
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2010.03.26 박성호 
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
 * @author 박성호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgOtsDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgOtsDtlVO> models = new ArrayList<BkgOtsDtlVO>();
	
	/* Column Info */
	private String adjLstUpdDt = null;
	/* Column Info */
	private String adjFrtAmt = null;
	/* Column Info */
	private String preCfmOfcCurrRto = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String cfmOfcCurrRto = null;
	/* Column Info */
	private String invLstUpdDt = null;
	/* Column Info */
	private String balWfgAmt = null;
	/* Column Info */
	private String balRsvUsdAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String preCfmUsdRto = null;
	/* Column Info */
	private String balWfgUsdAmt = null;
	/* Column Info */
	private String invCttAmt = null;
	/* Column Info */
	private String cltCttAmt = null;
	/* Column Info */
	private String balCttUsdAmt = null;
	/* Column Info */
	private String balFrtAmt = null;
	/* Column Info */
	private String cltWfgAmt = null;
	/* Column Info */
	private String cltBlNo = null;
	/* Column Info */
	private String ppdAmt = null;
	/* Column Info */
	private String balLstUpdDt = null;
	/* Column Info */
	private String balFrtOfcCurrAmt = null;
	/* Column Info */
	private String adjCttAmt = null;
	/* Column Info */
	private String invRsvAmt = null;
	/* Column Info */
	private String cltFrtAmt = null;
	/* Column Info */
	private String adjTaxAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String invWfgAmt = null;
	/* Column Info */
	private String cltLstUpdDt = null;
	/* Column Info */
	private String wrtfAmt = null;
	/* Column Info */
	private String invTaxAmt = null;
	/* Column Info */
	private String adjWfgAmt = null;
	/* Column Info */
	private String ppdLstUpdDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String balRsvAmt = null;
	/* Column Info */
	private String balCttAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String balCttOfcCurrAmt = null;
	/* Column Info */
	private String cltRsvAmt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String balTaxUsdAmt = null;
	/* Column Info */
	private String blCurrCd = null;
	/* Column Info */
	private String balTaxOfcCurrAmt = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String balFrtUsdAmt = null;
	/* Column Info */
	private String invFrtAmt = null;
	/* Column Info */
	private String balTaxAmt = null;
	/* Column Info */
	private String adjRsvAmt = null;
	/* Column Info */
	private String cltTaxAmt = null;
	/* Column Info */
	private String cfmUsdRto = null;
	/* Column Info */
	private String wrtfLstUpdDt = null;
	/* Column Info */
	private String balWfgOfcCurrAmt = null;
	/* Column Info */
	private String balRsvOfcCurrAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgOtsDtlVO() {}

	public BkgOtsDtlVO(String ibflag, String pagerows, String ofcCd, String cltBlNo, String invNo, String blCurrCd, String invFrtAmt, String invWfgAmt, String invCttAmt, String invTaxAmt, String invRsvAmt, String invLstUpdDt, String cltFrtAmt, String cltWfgAmt, String cltCttAmt, String cltTaxAmt, String cltRsvAmt, String cltLstUpdDt, String adjFrtAmt, String adjWfgAmt, String adjCttAmt, String adjTaxAmt, String adjRsvAmt, String adjLstUpdDt, String balFrtAmt, String balWfgAmt, String balCttAmt, String balTaxAmt, String balRsvAmt, String balLstUpdDt, String wrtfAmt, String wrtfLstUpdDt, String ppdAmt, String ppdLstUpdDt, String preCfmOfcCurrRto, String preCfmUsdRto, String cfmOfcCurrRto, String cfmUsdRto, String balFrtOfcCurrAmt, String balWfgOfcCurrAmt, String balCttOfcCurrAmt, String balTaxOfcCurrAmt, String balRsvOfcCurrAmt, String balFrtUsdAmt, String balWfgUsdAmt, String balCttUsdAmt, String balTaxUsdAmt, String balRsvUsdAmt, String creDt, String creUsrId, String updDt, String updUsrId) {
		this.adjLstUpdDt = adjLstUpdDt;
		this.adjFrtAmt = adjFrtAmt;
		this.preCfmOfcCurrRto = preCfmOfcCurrRto;
		this.pagerows = pagerows;
		this.cfmOfcCurrRto = cfmOfcCurrRto;
		this.invLstUpdDt = invLstUpdDt;
		this.balWfgAmt = balWfgAmt;
		this.balRsvUsdAmt = balRsvUsdAmt;
		this.updUsrId = updUsrId;
		this.preCfmUsdRto = preCfmUsdRto;
		this.balWfgUsdAmt = balWfgUsdAmt;
		this.invCttAmt = invCttAmt;
		this.cltCttAmt = cltCttAmt;
		this.balCttUsdAmt = balCttUsdAmt;
		this.balFrtAmt = balFrtAmt;
		this.cltWfgAmt = cltWfgAmt;
		this.cltBlNo = cltBlNo;
		this.ppdAmt = ppdAmt;
		this.balLstUpdDt = balLstUpdDt;
		this.balFrtOfcCurrAmt = balFrtOfcCurrAmt;
		this.adjCttAmt = adjCttAmt;
		this.invRsvAmt = invRsvAmt;
		this.cltFrtAmt = cltFrtAmt;
		this.adjTaxAmt = adjTaxAmt;
		this.creUsrId = creUsrId;
		this.invWfgAmt = invWfgAmt;
		this.cltLstUpdDt = cltLstUpdDt;
		this.wrtfAmt = wrtfAmt;
		this.invTaxAmt = invTaxAmt;
		this.adjWfgAmt = adjWfgAmt;
		this.ppdLstUpdDt = ppdLstUpdDt;
		this.creDt = creDt;
		this.balRsvAmt = balRsvAmt;
		this.balCttAmt = balCttAmt;
		this.ibflag = ibflag;
		this.balCttOfcCurrAmt = balCttOfcCurrAmt;
		this.cltRsvAmt = cltRsvAmt;
		this.updDt = updDt;
		this.balTaxUsdAmt = balTaxUsdAmt;
		this.blCurrCd = blCurrCd;
		this.balTaxOfcCurrAmt = balTaxOfcCurrAmt;
		this.invNo = invNo;
		this.ofcCd = ofcCd;
		this.balFrtUsdAmt = balFrtUsdAmt;
		this.invFrtAmt = invFrtAmt;
		this.balTaxAmt = balTaxAmt;
		this.adjRsvAmt = adjRsvAmt;
		this.cltTaxAmt = cltTaxAmt;
		this.cfmUsdRto = cfmUsdRto;
		this.wrtfLstUpdDt = wrtfLstUpdDt;
		this.balWfgOfcCurrAmt = balWfgOfcCurrAmt;
		this.balRsvOfcCurrAmt = balRsvOfcCurrAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("adj_lst_upd_dt", getAdjLstUpdDt());
		this.hashColumns.put("adj_frt_amt", getAdjFrtAmt());
		this.hashColumns.put("pre_cfm_ofc_curr_rto", getPreCfmOfcCurrRto());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cfm_ofc_curr_rto", getCfmOfcCurrRto());
		this.hashColumns.put("inv_lst_upd_dt", getInvLstUpdDt());
		this.hashColumns.put("bal_wfg_amt", getBalWfgAmt());
		this.hashColumns.put("bal_rsv_usd_amt", getBalRsvUsdAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pre_cfm_usd_rto", getPreCfmUsdRto());
		this.hashColumns.put("bal_wfg_usd_amt", getBalWfgUsdAmt());
		this.hashColumns.put("inv_ctt_amt", getInvCttAmt());
		this.hashColumns.put("clt_ctt_amt", getCltCttAmt());
		this.hashColumns.put("bal_ctt_usd_amt", getBalCttUsdAmt());
		this.hashColumns.put("bal_frt_amt", getBalFrtAmt());
		this.hashColumns.put("clt_wfg_amt", getCltWfgAmt());
		this.hashColumns.put("clt_bl_no", getCltBlNo());
		this.hashColumns.put("ppd_amt", getPpdAmt());
		this.hashColumns.put("bal_lst_upd_dt", getBalLstUpdDt());
		this.hashColumns.put("bal_frt_ofc_curr_amt", getBalFrtOfcCurrAmt());
		this.hashColumns.put("adj_ctt_amt", getAdjCttAmt());
		this.hashColumns.put("inv_rsv_amt", getInvRsvAmt());
		this.hashColumns.put("clt_frt_amt", getCltFrtAmt());
		this.hashColumns.put("adj_tax_amt", getAdjTaxAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("inv_wfg_amt", getInvWfgAmt());
		this.hashColumns.put("clt_lst_upd_dt", getCltLstUpdDt());
		this.hashColumns.put("wrtf_amt", getWrtfAmt());
		this.hashColumns.put("inv_tax_amt", getInvTaxAmt());
		this.hashColumns.put("adj_wfg_amt", getAdjWfgAmt());
		this.hashColumns.put("ppd_lst_upd_dt", getPpdLstUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bal_rsv_amt", getBalRsvAmt());
		this.hashColumns.put("bal_ctt_amt", getBalCttAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bal_ctt_ofc_curr_amt", getBalCttOfcCurrAmt());
		this.hashColumns.put("clt_rsv_amt", getCltRsvAmt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bal_tax_usd_amt", getBalTaxUsdAmt());
		this.hashColumns.put("bl_curr_cd", getBlCurrCd());
		this.hashColumns.put("bal_tax_ofc_curr_amt", getBalTaxOfcCurrAmt());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("bal_frt_usd_amt", getBalFrtUsdAmt());
		this.hashColumns.put("inv_frt_amt", getInvFrtAmt());
		this.hashColumns.put("bal_tax_amt", getBalTaxAmt());
		this.hashColumns.put("adj_rsv_amt", getAdjRsvAmt());
		this.hashColumns.put("clt_tax_amt", getCltTaxAmt());
		this.hashColumns.put("cfm_usd_rto", getCfmUsdRto());
		this.hashColumns.put("wrtf_lst_upd_dt", getWrtfLstUpdDt());
		this.hashColumns.put("bal_wfg_ofc_curr_amt", getBalWfgOfcCurrAmt());
		this.hashColumns.put("bal_rsv_ofc_curr_amt", getBalRsvOfcCurrAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("adj_lst_upd_dt", "adjLstUpdDt");
		this.hashFields.put("adj_frt_amt", "adjFrtAmt");
		this.hashFields.put("pre_cfm_ofc_curr_rto", "preCfmOfcCurrRto");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cfm_ofc_curr_rto", "cfmOfcCurrRto");
		this.hashFields.put("inv_lst_upd_dt", "invLstUpdDt");
		this.hashFields.put("bal_wfg_amt", "balWfgAmt");
		this.hashFields.put("bal_rsv_usd_amt", "balRsvUsdAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pre_cfm_usd_rto", "preCfmUsdRto");
		this.hashFields.put("bal_wfg_usd_amt", "balWfgUsdAmt");
		this.hashFields.put("inv_ctt_amt", "invCttAmt");
		this.hashFields.put("clt_ctt_amt", "cltCttAmt");
		this.hashFields.put("bal_ctt_usd_amt", "balCttUsdAmt");
		this.hashFields.put("bal_frt_amt", "balFrtAmt");
		this.hashFields.put("clt_wfg_amt", "cltWfgAmt");
		this.hashFields.put("clt_bl_no", "cltBlNo");
		this.hashFields.put("ppd_amt", "ppdAmt");
		this.hashFields.put("bal_lst_upd_dt", "balLstUpdDt");
		this.hashFields.put("bal_frt_ofc_curr_amt", "balFrtOfcCurrAmt");
		this.hashFields.put("adj_ctt_amt", "adjCttAmt");
		this.hashFields.put("inv_rsv_amt", "invRsvAmt");
		this.hashFields.put("clt_frt_amt", "cltFrtAmt");
		this.hashFields.put("adj_tax_amt", "adjTaxAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("inv_wfg_amt", "invWfgAmt");
		this.hashFields.put("clt_lst_upd_dt", "cltLstUpdDt");
		this.hashFields.put("wrtf_amt", "wrtfAmt");
		this.hashFields.put("inv_tax_amt", "invTaxAmt");
		this.hashFields.put("adj_wfg_amt", "adjWfgAmt");
		this.hashFields.put("ppd_lst_upd_dt", "ppdLstUpdDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bal_rsv_amt", "balRsvAmt");
		this.hashFields.put("bal_ctt_amt", "balCttAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bal_ctt_ofc_curr_amt", "balCttOfcCurrAmt");
		this.hashFields.put("clt_rsv_amt", "cltRsvAmt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bal_tax_usd_amt", "balTaxUsdAmt");
		this.hashFields.put("bl_curr_cd", "blCurrCd");
		this.hashFields.put("bal_tax_ofc_curr_amt", "balTaxOfcCurrAmt");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("bal_frt_usd_amt", "balFrtUsdAmt");
		this.hashFields.put("inv_frt_amt", "invFrtAmt");
		this.hashFields.put("bal_tax_amt", "balTaxAmt");
		this.hashFields.put("adj_rsv_amt", "adjRsvAmt");
		this.hashFields.put("clt_tax_amt", "cltTaxAmt");
		this.hashFields.put("cfm_usd_rto", "cfmUsdRto");
		this.hashFields.put("wrtf_lst_upd_dt", "wrtfLstUpdDt");
		this.hashFields.put("bal_wfg_ofc_curr_amt", "balWfgOfcCurrAmt");
		this.hashFields.put("bal_rsv_ofc_curr_amt", "balRsvOfcCurrAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return adjLstUpdDt
	 */
	public String getAdjLstUpdDt() {
		return this.adjLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @return adjFrtAmt
	 */
	public String getAdjFrtAmt() {
		return this.adjFrtAmt;
	}
	
	/**
	 * Column Info
	 * @return preCfmOfcCurrRto
	 */
	public String getPreCfmOfcCurrRto() {
		return this.preCfmOfcCurrRto;
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
	 * @return cfmOfcCurrRto
	 */
	public String getCfmOfcCurrRto() {
		return this.cfmOfcCurrRto;
	}
	
	/**
	 * Column Info
	 * @return invLstUpdDt
	 */
	public String getInvLstUpdDt() {
		return this.invLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @return balWfgAmt
	 */
	public String getBalWfgAmt() {
		return this.balWfgAmt;
	}
	
	/**
	 * Column Info
	 * @return balRsvUsdAmt
	 */
	public String getBalRsvUsdAmt() {
		return this.balRsvUsdAmt;
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
	 * @return preCfmUsdRto
	 */
	public String getPreCfmUsdRto() {
		return this.preCfmUsdRto;
	}
	
	/**
	 * Column Info
	 * @return balWfgUsdAmt
	 */
	public String getBalWfgUsdAmt() {
		return this.balWfgUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return invCttAmt
	 */
	public String getInvCttAmt() {
		return this.invCttAmt;
	}
	
	/**
	 * Column Info
	 * @return cltCttAmt
	 */
	public String getCltCttAmt() {
		return this.cltCttAmt;
	}
	
	/**
	 * Column Info
	 * @return balCttUsdAmt
	 */
	public String getBalCttUsdAmt() {
		return this.balCttUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return balFrtAmt
	 */
	public String getBalFrtAmt() {
		return this.balFrtAmt;
	}
	
	/**
	 * Column Info
	 * @return cltWfgAmt
	 */
	public String getCltWfgAmt() {
		return this.cltWfgAmt;
	}
	
	/**
	 * Column Info
	 * @return cltBlNo
	 */
	public String getCltBlNo() {
		return this.cltBlNo;
	}
	
	/**
	 * Column Info
	 * @return ppdAmt
	 */
	public String getPpdAmt() {
		return this.ppdAmt;
	}
	
	/**
	 * Column Info
	 * @return balLstUpdDt
	 */
	public String getBalLstUpdDt() {
		return this.balLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @return balFrtOfcCurrAmt
	 */
	public String getBalFrtOfcCurrAmt() {
		return this.balFrtOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @return adjCttAmt
	 */
	public String getAdjCttAmt() {
		return this.adjCttAmt;
	}
	
	/**
	 * Column Info
	 * @return invRsvAmt
	 */
	public String getInvRsvAmt() {
		return this.invRsvAmt;
	}
	
	/**
	 * Column Info
	 * @return cltFrtAmt
	 */
	public String getCltFrtAmt() {
		return this.cltFrtAmt;
	}
	
	/**
	 * Column Info
	 * @return adjTaxAmt
	 */
	public String getAdjTaxAmt() {
		return this.adjTaxAmt;
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
	 * @return invWfgAmt
	 */
	public String getInvWfgAmt() {
		return this.invWfgAmt;
	}
	
	/**
	 * Column Info
	 * @return cltLstUpdDt
	 */
	public String getCltLstUpdDt() {
		return this.cltLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @return wrtfAmt
	 */
	public String getWrtfAmt() {
		return this.wrtfAmt;
	}
	
	/**
	 * Column Info
	 * @return invTaxAmt
	 */
	public String getInvTaxAmt() {
		return this.invTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return adjWfgAmt
	 */
	public String getAdjWfgAmt() {
		return this.adjWfgAmt;
	}
	
	/**
	 * Column Info
	 * @return ppdLstUpdDt
	 */
	public String getPpdLstUpdDt() {
		return this.ppdLstUpdDt;
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
	 * @return balRsvAmt
	 */
	public String getBalRsvAmt() {
		return this.balRsvAmt;
	}
	
	/**
	 * Column Info
	 * @return balCttAmt
	 */
	public String getBalCttAmt() {
		return this.balCttAmt;
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
	 * @return balCttOfcCurrAmt
	 */
	public String getBalCttOfcCurrAmt() {
		return this.balCttOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @return cltRsvAmt
	 */
	public String getCltRsvAmt() {
		return this.cltRsvAmt;
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
	 * @return balTaxUsdAmt
	 */
	public String getBalTaxUsdAmt() {
		return this.balTaxUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return blCurrCd
	 */
	public String getBlCurrCd() {
		return this.blCurrCd;
	}
	
	/**
	 * Column Info
	 * @return balTaxOfcCurrAmt
	 */
	public String getBalTaxOfcCurrAmt() {
		return this.balTaxOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @return invNo
	 */
	public String getInvNo() {
		return this.invNo;
	}
	
	/**
	 * Column Info
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return balFrtUsdAmt
	 */
	public String getBalFrtUsdAmt() {
		return this.balFrtUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return invFrtAmt
	 */
	public String getInvFrtAmt() {
		return this.invFrtAmt;
	}
	
	/**
	 * Column Info
	 * @return balTaxAmt
	 */
	public String getBalTaxAmt() {
		return this.balTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return adjRsvAmt
	 */
	public String getAdjRsvAmt() {
		return this.adjRsvAmt;
	}
	
	/**
	 * Column Info
	 * @return cltTaxAmt
	 */
	public String getCltTaxAmt() {
		return this.cltTaxAmt;
	}
	
	/**
	 * Column Info
	 * @return cfmUsdRto
	 */
	public String getCfmUsdRto() {
		return this.cfmUsdRto;
	}
	
	/**
	 * Column Info
	 * @return wrtfLstUpdDt
	 */
	public String getWrtfLstUpdDt() {
		return this.wrtfLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @return balWfgOfcCurrAmt
	 */
	public String getBalWfgOfcCurrAmt() {
		return this.balWfgOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @return balRsvOfcCurrAmt
	 */
	public String getBalRsvOfcCurrAmt() {
		return this.balRsvOfcCurrAmt;
	}
	

	/**
	 * Column Info
	 * @param adjLstUpdDt
	 */
	public void setAdjLstUpdDt(String adjLstUpdDt) {
		this.adjLstUpdDt = adjLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @param adjFrtAmt
	 */
	public void setAdjFrtAmt(String adjFrtAmt) {
		this.adjFrtAmt = adjFrtAmt;
	}
	
	/**
	 * Column Info
	 * @param preCfmOfcCurrRto
	 */
	public void setPreCfmOfcCurrRto(String preCfmOfcCurrRto) {
		this.preCfmOfcCurrRto = preCfmOfcCurrRto;
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
	 * @param cfmOfcCurrRto
	 */
	public void setCfmOfcCurrRto(String cfmOfcCurrRto) {
		this.cfmOfcCurrRto = cfmOfcCurrRto;
	}
	
	/**
	 * Column Info
	 * @param invLstUpdDt
	 */
	public void setInvLstUpdDt(String invLstUpdDt) {
		this.invLstUpdDt = invLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @param balWfgAmt
	 */
	public void setBalWfgAmt(String balWfgAmt) {
		this.balWfgAmt = balWfgAmt;
	}
	
	/**
	 * Column Info
	 * @param balRsvUsdAmt
	 */
	public void setBalRsvUsdAmt(String balRsvUsdAmt) {
		this.balRsvUsdAmt = balRsvUsdAmt;
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
	 * @param preCfmUsdRto
	 */
	public void setPreCfmUsdRto(String preCfmUsdRto) {
		this.preCfmUsdRto = preCfmUsdRto;
	}
	
	/**
	 * Column Info
	 * @param balWfgUsdAmt
	 */
	public void setBalWfgUsdAmt(String balWfgUsdAmt) {
		this.balWfgUsdAmt = balWfgUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param invCttAmt
	 */
	public void setInvCttAmt(String invCttAmt) {
		this.invCttAmt = invCttAmt;
	}
	
	/**
	 * Column Info
	 * @param cltCttAmt
	 */
	public void setCltCttAmt(String cltCttAmt) {
		this.cltCttAmt = cltCttAmt;
	}
	
	/**
	 * Column Info
	 * @param balCttUsdAmt
	 */
	public void setBalCttUsdAmt(String balCttUsdAmt) {
		this.balCttUsdAmt = balCttUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param balFrtAmt
	 */
	public void setBalFrtAmt(String balFrtAmt) {
		this.balFrtAmt = balFrtAmt;
	}
	
	/**
	 * Column Info
	 * @param cltWfgAmt
	 */
	public void setCltWfgAmt(String cltWfgAmt) {
		this.cltWfgAmt = cltWfgAmt;
	}
	
	/**
	 * Column Info
	 * @param cltBlNo
	 */
	public void setCltBlNo(String cltBlNo) {
		this.cltBlNo = cltBlNo;
	}
	
	/**
	 * Column Info
	 * @param ppdAmt
	 */
	public void setPpdAmt(String ppdAmt) {
		this.ppdAmt = ppdAmt;
	}
	
	/**
	 * Column Info
	 * @param balLstUpdDt
	 */
	public void setBalLstUpdDt(String balLstUpdDt) {
		this.balLstUpdDt = balLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @param balFrtOfcCurrAmt
	 */
	public void setBalFrtOfcCurrAmt(String balFrtOfcCurrAmt) {
		this.balFrtOfcCurrAmt = balFrtOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @param adjCttAmt
	 */
	public void setAdjCttAmt(String adjCttAmt) {
		this.adjCttAmt = adjCttAmt;
	}
	
	/**
	 * Column Info
	 * @param invRsvAmt
	 */
	public void setInvRsvAmt(String invRsvAmt) {
		this.invRsvAmt = invRsvAmt;
	}
	
	/**
	 * Column Info
	 * @param cltFrtAmt
	 */
	public void setCltFrtAmt(String cltFrtAmt) {
		this.cltFrtAmt = cltFrtAmt;
	}
	
	/**
	 * Column Info
	 * @param adjTaxAmt
	 */
	public void setAdjTaxAmt(String adjTaxAmt) {
		this.adjTaxAmt = adjTaxAmt;
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
	 * @param invWfgAmt
	 */
	public void setInvWfgAmt(String invWfgAmt) {
		this.invWfgAmt = invWfgAmt;
	}
	
	/**
	 * Column Info
	 * @param cltLstUpdDt
	 */
	public void setCltLstUpdDt(String cltLstUpdDt) {
		this.cltLstUpdDt = cltLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @param wrtfAmt
	 */
	public void setWrtfAmt(String wrtfAmt) {
		this.wrtfAmt = wrtfAmt;
	}
	
	/**
	 * Column Info
	 * @param invTaxAmt
	 */
	public void setInvTaxAmt(String invTaxAmt) {
		this.invTaxAmt = invTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param adjWfgAmt
	 */
	public void setAdjWfgAmt(String adjWfgAmt) {
		this.adjWfgAmt = adjWfgAmt;
	}
	
	/**
	 * Column Info
	 * @param ppdLstUpdDt
	 */
	public void setPpdLstUpdDt(String ppdLstUpdDt) {
		this.ppdLstUpdDt = ppdLstUpdDt;
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
	 * @param balRsvAmt
	 */
	public void setBalRsvAmt(String balRsvAmt) {
		this.balRsvAmt = balRsvAmt;
	}
	
	/**
	 * Column Info
	 * @param balCttAmt
	 */
	public void setBalCttAmt(String balCttAmt) {
		this.balCttAmt = balCttAmt;
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
	 * @param balCttOfcCurrAmt
	 */
	public void setBalCttOfcCurrAmt(String balCttOfcCurrAmt) {
		this.balCttOfcCurrAmt = balCttOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @param cltRsvAmt
	 */
	public void setCltRsvAmt(String cltRsvAmt) {
		this.cltRsvAmt = cltRsvAmt;
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
	 * @param balTaxUsdAmt
	 */
	public void setBalTaxUsdAmt(String balTaxUsdAmt) {
		this.balTaxUsdAmt = balTaxUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param blCurrCd
	 */
	public void setBlCurrCd(String blCurrCd) {
		this.blCurrCd = blCurrCd;
	}
	
	/**
	 * Column Info
	 * @param balTaxOfcCurrAmt
	 */
	public void setBalTaxOfcCurrAmt(String balTaxOfcCurrAmt) {
		this.balTaxOfcCurrAmt = balTaxOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @param invNo
	 */
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	
	/**
	 * Column Info
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param balFrtUsdAmt
	 */
	public void setBalFrtUsdAmt(String balFrtUsdAmt) {
		this.balFrtUsdAmt = balFrtUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param invFrtAmt
	 */
	public void setInvFrtAmt(String invFrtAmt) {
		this.invFrtAmt = invFrtAmt;
	}
	
	/**
	 * Column Info
	 * @param balTaxAmt
	 */
	public void setBalTaxAmt(String balTaxAmt) {
		this.balTaxAmt = balTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param adjRsvAmt
	 */
	public void setAdjRsvAmt(String adjRsvAmt) {
		this.adjRsvAmt = adjRsvAmt;
	}
	
	/**
	 * Column Info
	 * @param cltTaxAmt
	 */
	public void setCltTaxAmt(String cltTaxAmt) {
		this.cltTaxAmt = cltTaxAmt;
	}
	
	/**
	 * Column Info
	 * @param cfmUsdRto
	 */
	public void setCfmUsdRto(String cfmUsdRto) {
		this.cfmUsdRto = cfmUsdRto;
	}
	
	/**
	 * Column Info
	 * @param wrtfLstUpdDt
	 */
	public void setWrtfLstUpdDt(String wrtfLstUpdDt) {
		this.wrtfLstUpdDt = wrtfLstUpdDt;
	}
	
	/**
	 * Column Info
	 * @param balWfgOfcCurrAmt
	 */
	public void setBalWfgOfcCurrAmt(String balWfgOfcCurrAmt) {
		this.balWfgOfcCurrAmt = balWfgOfcCurrAmt;
	}
	
	/**
	 * Column Info
	 * @param balRsvOfcCurrAmt
	 */
	public void setBalRsvOfcCurrAmt(String balRsvOfcCurrAmt) {
		this.balRsvOfcCurrAmt = balRsvOfcCurrAmt;
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
		setAdjLstUpdDt(JSPUtil.getParameter(request, prefix + "adj_lst_upd_dt", ""));
		setAdjFrtAmt(JSPUtil.getParameter(request, prefix + "adj_frt_amt", ""));
		setPreCfmOfcCurrRto(JSPUtil.getParameter(request, prefix + "pre_cfm_ofc_curr_rto", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCfmOfcCurrRto(JSPUtil.getParameter(request, prefix + "cfm_ofc_curr_rto", ""));
		setInvLstUpdDt(JSPUtil.getParameter(request, prefix + "inv_lst_upd_dt", ""));
		setBalWfgAmt(JSPUtil.getParameter(request, prefix + "bal_wfg_amt", ""));
		setBalRsvUsdAmt(JSPUtil.getParameter(request, prefix + "bal_rsv_usd_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPreCfmUsdRto(JSPUtil.getParameter(request, prefix + "pre_cfm_usd_rto", ""));
		setBalWfgUsdAmt(JSPUtil.getParameter(request, prefix + "bal_wfg_usd_amt", ""));
		setInvCttAmt(JSPUtil.getParameter(request, prefix + "inv_ctt_amt", ""));
		setCltCttAmt(JSPUtil.getParameter(request, prefix + "clt_ctt_amt", ""));
		setBalCttUsdAmt(JSPUtil.getParameter(request, prefix + "bal_ctt_usd_amt", ""));
		setBalFrtAmt(JSPUtil.getParameter(request, prefix + "bal_frt_amt", ""));
		setCltWfgAmt(JSPUtil.getParameter(request, prefix + "clt_wfg_amt", ""));
		setCltBlNo(JSPUtil.getParameter(request, prefix + "clt_bl_no", ""));
		setPpdAmt(JSPUtil.getParameter(request, prefix + "ppd_amt", ""));
		setBalLstUpdDt(JSPUtil.getParameter(request, prefix + "bal_lst_upd_dt", ""));
		setBalFrtOfcCurrAmt(JSPUtil.getParameter(request, prefix + "bal_frt_ofc_curr_amt", ""));
		setAdjCttAmt(JSPUtil.getParameter(request, prefix + "adj_ctt_amt", ""));
		setInvRsvAmt(JSPUtil.getParameter(request, prefix + "inv_rsv_amt", ""));
		setCltFrtAmt(JSPUtil.getParameter(request, prefix + "clt_frt_amt", ""));
		setAdjTaxAmt(JSPUtil.getParameter(request, prefix + "adj_tax_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setInvWfgAmt(JSPUtil.getParameter(request, prefix + "inv_wfg_amt", ""));
		setCltLstUpdDt(JSPUtil.getParameter(request, prefix + "clt_lst_upd_dt", ""));
		setWrtfAmt(JSPUtil.getParameter(request, prefix + "wrtf_amt", ""));
		setInvTaxAmt(JSPUtil.getParameter(request, prefix + "inv_tax_amt", ""));
		setAdjWfgAmt(JSPUtil.getParameter(request, prefix + "adj_wfg_amt", ""));
		setPpdLstUpdDt(JSPUtil.getParameter(request, prefix + "ppd_lst_upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setBalRsvAmt(JSPUtil.getParameter(request, prefix + "bal_rsv_amt", ""));
		setBalCttAmt(JSPUtil.getParameter(request, prefix + "bal_ctt_amt", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBalCttOfcCurrAmt(JSPUtil.getParameter(request, prefix + "bal_ctt_ofc_curr_amt", ""));
		setCltRsvAmt(JSPUtil.getParameter(request, prefix + "clt_rsv_amt", ""));
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setBalTaxUsdAmt(JSPUtil.getParameter(request, prefix + "bal_tax_usd_amt", ""));
		setBlCurrCd(JSPUtil.getParameter(request, prefix + "bl_curr_cd", ""));
		setBalTaxOfcCurrAmt(JSPUtil.getParameter(request, prefix + "bal_tax_ofc_curr_amt", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setBalFrtUsdAmt(JSPUtil.getParameter(request, prefix + "bal_frt_usd_amt", ""));
		setInvFrtAmt(JSPUtil.getParameter(request, prefix + "inv_frt_amt", ""));
		setBalTaxAmt(JSPUtil.getParameter(request, prefix + "bal_tax_amt", ""));
		setAdjRsvAmt(JSPUtil.getParameter(request, prefix + "adj_rsv_amt", ""));
		setCltTaxAmt(JSPUtil.getParameter(request, prefix + "clt_tax_amt", ""));
		setCfmUsdRto(JSPUtil.getParameter(request, prefix + "cfm_usd_rto", ""));
		setWrtfLstUpdDt(JSPUtil.getParameter(request, prefix + "wrtf_lst_upd_dt", ""));
		setBalWfgOfcCurrAmt(JSPUtil.getParameter(request, prefix + "bal_wfg_ofc_curr_amt", ""));
		setBalRsvOfcCurrAmt(JSPUtil.getParameter(request, prefix + "bal_rsv_ofc_curr_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgOtsDtlVO[]
	 */
	public BkgOtsDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgOtsDtlVO[]
	 */
	public BkgOtsDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgOtsDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] adjLstUpdDt = (JSPUtil.getParameter(request, prefix	+ "adj_lst_upd_dt", length));
			String[] adjFrtAmt = (JSPUtil.getParameter(request, prefix	+ "adj_frt_amt", length));
			String[] preCfmOfcCurrRto = (JSPUtil.getParameter(request, prefix	+ "pre_cfm_ofc_curr_rto", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] cfmOfcCurrRto = (JSPUtil.getParameter(request, prefix	+ "cfm_ofc_curr_rto", length));
			String[] invLstUpdDt = (JSPUtil.getParameter(request, prefix	+ "inv_lst_upd_dt", length));
			String[] balWfgAmt = (JSPUtil.getParameter(request, prefix	+ "bal_wfg_amt", length));
			String[] balRsvUsdAmt = (JSPUtil.getParameter(request, prefix	+ "bal_rsv_usd_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] preCfmUsdRto = (JSPUtil.getParameter(request, prefix	+ "pre_cfm_usd_rto", length));
			String[] balWfgUsdAmt = (JSPUtil.getParameter(request, prefix	+ "bal_wfg_usd_amt", length));
			String[] invCttAmt = (JSPUtil.getParameter(request, prefix	+ "inv_ctt_amt", length));
			String[] cltCttAmt = (JSPUtil.getParameter(request, prefix	+ "clt_ctt_amt", length));
			String[] balCttUsdAmt = (JSPUtil.getParameter(request, prefix	+ "bal_ctt_usd_amt", length));
			String[] balFrtAmt = (JSPUtil.getParameter(request, prefix	+ "bal_frt_amt", length));
			String[] cltWfgAmt = (JSPUtil.getParameter(request, prefix	+ "clt_wfg_amt", length));
			String[] cltBlNo = (JSPUtil.getParameter(request, prefix	+ "clt_bl_no", length));
			String[] ppdAmt = (JSPUtil.getParameter(request, prefix	+ "ppd_amt", length));
			String[] balLstUpdDt = (JSPUtil.getParameter(request, prefix	+ "bal_lst_upd_dt", length));
			String[] balFrtOfcCurrAmt = (JSPUtil.getParameter(request, prefix	+ "bal_frt_ofc_curr_amt", length));
			String[] adjCttAmt = (JSPUtil.getParameter(request, prefix	+ "adj_ctt_amt", length));
			String[] invRsvAmt = (JSPUtil.getParameter(request, prefix	+ "inv_rsv_amt", length));
			String[] cltFrtAmt = (JSPUtil.getParameter(request, prefix	+ "clt_frt_amt", length));
			String[] adjTaxAmt = (JSPUtil.getParameter(request, prefix	+ "adj_tax_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] invWfgAmt = (JSPUtil.getParameter(request, prefix	+ "inv_wfg_amt", length));
			String[] cltLstUpdDt = (JSPUtil.getParameter(request, prefix	+ "clt_lst_upd_dt", length));
			String[] wrtfAmt = (JSPUtil.getParameter(request, prefix	+ "wrtf_amt", length));
			String[] invTaxAmt = (JSPUtil.getParameter(request, prefix	+ "inv_tax_amt", length));
			String[] adjWfgAmt = (JSPUtil.getParameter(request, prefix	+ "adj_wfg_amt", length));
			String[] ppdLstUpdDt = (JSPUtil.getParameter(request, prefix	+ "ppd_lst_upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] balRsvAmt = (JSPUtil.getParameter(request, prefix	+ "bal_rsv_amt", length));
			String[] balCttAmt = (JSPUtil.getParameter(request, prefix	+ "bal_ctt_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] balCttOfcCurrAmt = (JSPUtil.getParameter(request, prefix	+ "bal_ctt_ofc_curr_amt", length));
			String[] cltRsvAmt = (JSPUtil.getParameter(request, prefix	+ "clt_rsv_amt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] balTaxUsdAmt = (JSPUtil.getParameter(request, prefix	+ "bal_tax_usd_amt", length));
			String[] blCurrCd = (JSPUtil.getParameter(request, prefix	+ "bl_curr_cd", length));
			String[] balTaxOfcCurrAmt = (JSPUtil.getParameter(request, prefix	+ "bal_tax_ofc_curr_amt", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] balFrtUsdAmt = (JSPUtil.getParameter(request, prefix	+ "bal_frt_usd_amt", length));
			String[] invFrtAmt = (JSPUtil.getParameter(request, prefix	+ "inv_frt_amt", length));
			String[] balTaxAmt = (JSPUtil.getParameter(request, prefix	+ "bal_tax_amt", length));
			String[] adjRsvAmt = (JSPUtil.getParameter(request, prefix	+ "adj_rsv_amt", length));
			String[] cltTaxAmt = (JSPUtil.getParameter(request, prefix	+ "clt_tax_amt", length));
			String[] cfmUsdRto = (JSPUtil.getParameter(request, prefix	+ "cfm_usd_rto", length));
			String[] wrtfLstUpdDt = (JSPUtil.getParameter(request, prefix	+ "wrtf_lst_upd_dt", length));
			String[] balWfgOfcCurrAmt = (JSPUtil.getParameter(request, prefix	+ "bal_wfg_ofc_curr_amt", length));
			String[] balRsvOfcCurrAmt = (JSPUtil.getParameter(request, prefix	+ "bal_rsv_ofc_curr_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgOtsDtlVO();
				if (adjLstUpdDt[i] != null)
					model.setAdjLstUpdDt(adjLstUpdDt[i]);
				if (adjFrtAmt[i] != null)
					model.setAdjFrtAmt(adjFrtAmt[i]);
				if (preCfmOfcCurrRto[i] != null)
					model.setPreCfmOfcCurrRto(preCfmOfcCurrRto[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (cfmOfcCurrRto[i] != null)
					model.setCfmOfcCurrRto(cfmOfcCurrRto[i]);
				if (invLstUpdDt[i] != null)
					model.setInvLstUpdDt(invLstUpdDt[i]);
				if (balWfgAmt[i] != null)
					model.setBalWfgAmt(balWfgAmt[i]);
				if (balRsvUsdAmt[i] != null)
					model.setBalRsvUsdAmt(balRsvUsdAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (preCfmUsdRto[i] != null)
					model.setPreCfmUsdRto(preCfmUsdRto[i]);
				if (balWfgUsdAmt[i] != null)
					model.setBalWfgUsdAmt(balWfgUsdAmt[i]);
				if (invCttAmt[i] != null)
					model.setInvCttAmt(invCttAmt[i]);
				if (cltCttAmt[i] != null)
					model.setCltCttAmt(cltCttAmt[i]);
				if (balCttUsdAmt[i] != null)
					model.setBalCttUsdAmt(balCttUsdAmt[i]);
				if (balFrtAmt[i] != null)
					model.setBalFrtAmt(balFrtAmt[i]);
				if (cltWfgAmt[i] != null)
					model.setCltWfgAmt(cltWfgAmt[i]);
				if (cltBlNo[i] != null)
					model.setCltBlNo(cltBlNo[i]);
				if (ppdAmt[i] != null)
					model.setPpdAmt(ppdAmt[i]);
				if (balLstUpdDt[i] != null)
					model.setBalLstUpdDt(balLstUpdDt[i]);
				if (balFrtOfcCurrAmt[i] != null)
					model.setBalFrtOfcCurrAmt(balFrtOfcCurrAmt[i]);
				if (adjCttAmt[i] != null)
					model.setAdjCttAmt(adjCttAmt[i]);
				if (invRsvAmt[i] != null)
					model.setInvRsvAmt(invRsvAmt[i]);
				if (cltFrtAmt[i] != null)
					model.setCltFrtAmt(cltFrtAmt[i]);
				if (adjTaxAmt[i] != null)
					model.setAdjTaxAmt(adjTaxAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (invWfgAmt[i] != null)
					model.setInvWfgAmt(invWfgAmt[i]);
				if (cltLstUpdDt[i] != null)
					model.setCltLstUpdDt(cltLstUpdDt[i]);
				if (wrtfAmt[i] != null)
					model.setWrtfAmt(wrtfAmt[i]);
				if (invTaxAmt[i] != null)
					model.setInvTaxAmt(invTaxAmt[i]);
				if (adjWfgAmt[i] != null)
					model.setAdjWfgAmt(adjWfgAmt[i]);
				if (ppdLstUpdDt[i] != null)
					model.setPpdLstUpdDt(ppdLstUpdDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (balRsvAmt[i] != null)
					model.setBalRsvAmt(balRsvAmt[i]);
				if (balCttAmt[i] != null)
					model.setBalCttAmt(balCttAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (balCttOfcCurrAmt[i] != null)
					model.setBalCttOfcCurrAmt(balCttOfcCurrAmt[i]);
				if (cltRsvAmt[i] != null)
					model.setCltRsvAmt(cltRsvAmt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (balTaxUsdAmt[i] != null)
					model.setBalTaxUsdAmt(balTaxUsdAmt[i]);
				if (blCurrCd[i] != null)
					model.setBlCurrCd(blCurrCd[i]);
				if (balTaxOfcCurrAmt[i] != null)
					model.setBalTaxOfcCurrAmt(balTaxOfcCurrAmt[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (balFrtUsdAmt[i] != null)
					model.setBalFrtUsdAmt(balFrtUsdAmt[i]);
				if (invFrtAmt[i] != null)
					model.setInvFrtAmt(invFrtAmt[i]);
				if (balTaxAmt[i] != null)
					model.setBalTaxAmt(balTaxAmt[i]);
				if (adjRsvAmt[i] != null)
					model.setAdjRsvAmt(adjRsvAmt[i]);
				if (cltTaxAmt[i] != null)
					model.setCltTaxAmt(cltTaxAmt[i]);
				if (cfmUsdRto[i] != null)
					model.setCfmUsdRto(cfmUsdRto[i]);
				if (wrtfLstUpdDt[i] != null)
					model.setWrtfLstUpdDt(wrtfLstUpdDt[i]);
				if (balWfgOfcCurrAmt[i] != null)
					model.setBalWfgOfcCurrAmt(balWfgOfcCurrAmt[i]);
				if (balRsvOfcCurrAmt[i] != null)
					model.setBalRsvOfcCurrAmt(balRsvOfcCurrAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgOtsDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgOtsDtlVO[]
	 */
	public BkgOtsDtlVO[] getBkgOtsDtlVOs(){
		BkgOtsDtlVO[] vos = (BkgOtsDtlVO[])models.toArray(new BkgOtsDtlVO[models.size()]);
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
		this.adjLstUpdDt = this.adjLstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjFrtAmt = this.adjFrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCfmOfcCurrRto = this.preCfmOfcCurrRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmOfcCurrRto = this.cfmOfcCurrRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invLstUpdDt = this.invLstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balWfgAmt = this.balWfgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balRsvUsdAmt = this.balRsvUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preCfmUsdRto = this.preCfmUsdRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balWfgUsdAmt = this.balWfgUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invCttAmt = this.invCttAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltCttAmt = this.cltCttAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balCttUsdAmt = this.balCttUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balFrtAmt = this.balFrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltWfgAmt = this.cltWfgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltBlNo = this.cltBlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdAmt = this.ppdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balLstUpdDt = this.balLstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balFrtOfcCurrAmt = this.balFrtOfcCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjCttAmt = this.adjCttAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invRsvAmt = this.invRsvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltFrtAmt = this.cltFrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjTaxAmt = this.adjTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invWfgAmt = this.invWfgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltLstUpdDt = this.cltLstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrtfAmt = this.wrtfAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invTaxAmt = this.invTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjWfgAmt = this.adjWfgAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdLstUpdDt = this.ppdLstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balRsvAmt = this.balRsvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balCttAmt = this.balCttAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balCttOfcCurrAmt = this.balCttOfcCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltRsvAmt = this.cltRsvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balTaxUsdAmt = this.balTaxUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blCurrCd = this.blCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balTaxOfcCurrAmt = this.balTaxOfcCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balFrtUsdAmt = this.balFrtUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invFrtAmt = this.invFrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balTaxAmt = this.balTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.adjRsvAmt = this.adjRsvAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltTaxAmt = this.cltTaxAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfmUsdRto = this.cfmUsdRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.wrtfLstUpdDt = this.wrtfLstUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balWfgOfcCurrAmt = this.balWfgOfcCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.balRsvOfcCurrAmt = this.balRsvOfcCurrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
