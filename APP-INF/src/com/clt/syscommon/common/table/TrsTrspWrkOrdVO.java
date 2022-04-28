/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsTrspWrkOrdVO.java
*@FileTitle : TrsTrspWrkOrdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsTrspWrkOrdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsTrspWrkOrdVO> models = new ArrayList<TrsTrspWrkOrdVO>();
	
	/* Column Info */
	private String cmdtDpUseFlg = null;
	/* Column Info */
	private String dtnUseFlg = null;
	/* Column Info */
	private String woN1stEmlRsltFlg = null;
	/* Column Info */
	private String interUseFlg = null;
	/* Column Info */
	private String woN3rdFaxRsltFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String woN3rdEmlRsltFlg = null;
	/* Column Info */
	private String woN1stFaxNo = null;
	/* Column Info */
	private String woN3rdEml = null;
	/* Column Info */
	private String woFmtTpCd = null;
	/* Column Info */
	private String woBlNoIssFlg = null;
	/* Column Info */
	private String woN1stEml = null;
	/* Column Info */
	private String woRmk = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String woN1stFaxRsltFlg = null;
	/* Column Info */
	private String dwUpdDt = null;
	/* Column Info */
	private String trspWoSeq = null;
	/* Column Info */
	private String woN2ndEml = null;
	/* Column Info */
	private String woOpnFlg = null;
	/* Column Info */
	private String woN1stEmlSndNo = null;
	/* Column Info */
	private String woRjctDt = null;
	/* Column Info */
	private String woN2ndFaxRsltFlg = null;
	/* Column Info */
	private String woEdiRcvRsltDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String woVndrSeq = null;
	/* Column Info */
	private String woN2ndEmlRsltFlg = null;
	/* Column Info */
	private String woEdiRcvRsltMsg = null;
	/* Column Info */
	private String woN2ndEmlSndNo = null;
	/* Column Info */
	private String woIssStsCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String woEdiUseFlg = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String woEdiRcvPurpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String woEdiRcvRsltCd = null;
	/* Column Info */
	private String woN2ndFaxSndNo = null;
	/* Column Info */
	private String woPrnUseFlg = null;
	/* Column Info */
	private String woN2ndFaxNo = null;
	/* Column Info */
	private String woN3rdEmlSndNo = null;
	/* Column Info */
	private String woN1stFaxSndNo = null;
	/* Column Info */
	private String woN3rdFaxNo = null;
	/* Column Info */
	private String trspWoOfcCtyCd = null;
	/* Column Info */
	private String woN3rdFaxSndNo = null;
	/* Column Info */
	private String woFaxUseFlg = null;
	/* Column Info */
	private String rtDpUseFlg = null;
	/* Column Info */
	private String woCntcPsonNm = null;
	/* Column Info */
	private String preDisUseFlg = null;
	/* Column Info */
	private String woEmlUseFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsTrspWrkOrdVO() {}

	public TrsTrspWrkOrdVO(String ibflag, String pagerows, String trspWoOfcCtyCd, String trspWoSeq, String woIssStsCd, String woVndrSeq, String woCntcPsonNm, String woPrnUseFlg, String woFaxUseFlg, String woEmlUseFlg, String woEdiUseFlg, String woN1stFaxNo, String woN2ndFaxNo, String woN3rdFaxNo, String woN1stFaxSndNo, String woN2ndFaxSndNo, String woN3rdFaxSndNo, String woN1stFaxRsltFlg, String woN2ndFaxRsltFlg, String woN3rdFaxRsltFlg, String woN1stEml, String woN2ndEml, String woN3rdEml, String woN2ndEmlSndNo, String woN1stEmlSndNo, String woN3rdEmlSndNo, String woN1stEmlRsltFlg, String woN2ndEmlRsltFlg, String woN3rdEmlRsltFlg, String woRmk, String woBlNoIssFlg, String woFmtTpCd, String woRjctDt, String woOpnFlg, String rtDpUseFlg, String cmdtDpUseFlg, String preDisUseFlg, String dtnUseFlg, String woEdiRcvRsltMsg, String woEdiRcvRsltCd, String woEdiRcvRsltDt, String woEdiRcvPurpCd, String interUseFlg, String creOfcCd, String deltFlg, String dwUpdDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.cmdtDpUseFlg = cmdtDpUseFlg;
		this.dtnUseFlg = dtnUseFlg;
		this.woN1stEmlRsltFlg = woN1stEmlRsltFlg;
		this.interUseFlg = interUseFlg;
		this.woN3rdFaxRsltFlg = woN3rdFaxRsltFlg;
		this.pagerows = pagerows;
		this.woN3rdEmlRsltFlg = woN3rdEmlRsltFlg;
		this.woN1stFaxNo = woN1stFaxNo;
		this.woN3rdEml = woN3rdEml;
		this.woFmtTpCd = woFmtTpCd;
		this.woBlNoIssFlg = woBlNoIssFlg;
		this.woN1stEml = woN1stEml;
		this.woRmk = woRmk;
		this.updUsrId = updUsrId;
		this.woN1stFaxRsltFlg = woN1stFaxRsltFlg;
		this.dwUpdDt = dwUpdDt;
		this.trspWoSeq = trspWoSeq;
		this.woN2ndEml = woN2ndEml;
		this.woOpnFlg = woOpnFlg;
		this.woN1stEmlSndNo = woN1stEmlSndNo;
		this.woRjctDt = woRjctDt;
		this.woN2ndFaxRsltFlg = woN2ndFaxRsltFlg;
		this.woEdiRcvRsltDt = woEdiRcvRsltDt;
		this.creUsrId = creUsrId;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.woVndrSeq = woVndrSeq;
		this.woN2ndEmlRsltFlg = woN2ndEmlRsltFlg;
		this.woEdiRcvRsltMsg = woEdiRcvRsltMsg;
		this.woN2ndEmlSndNo = woN2ndEmlSndNo;
		this.woIssStsCd = woIssStsCd;
		this.ibflag = ibflag;
		this.woEdiUseFlg = woEdiUseFlg;
		this.creOfcCd = creOfcCd;
		this.woEdiRcvPurpCd = woEdiRcvPurpCd;
		this.updDt = updDt;
		this.woEdiRcvRsltCd = woEdiRcvRsltCd;
		this.woN2ndFaxSndNo = woN2ndFaxSndNo;
		this.woPrnUseFlg = woPrnUseFlg;
		this.woN2ndFaxNo = woN2ndFaxNo;
		this.woN3rdEmlSndNo = woN3rdEmlSndNo;
		this.woN1stFaxSndNo = woN1stFaxSndNo;
		this.woN3rdFaxNo = woN3rdFaxNo;
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
		this.woN3rdFaxSndNo = woN3rdFaxSndNo;
		this.woFaxUseFlg = woFaxUseFlg;
		this.rtDpUseFlg = rtDpUseFlg;
		this.woCntcPsonNm = woCntcPsonNm;
		this.preDisUseFlg = preDisUseFlg;
		this.woEmlUseFlg = woEmlUseFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("cmdt_dp_use_flg", getCmdtDpUseFlg());
		this.hashColumns.put("dtn_use_flg", getDtnUseFlg());
		this.hashColumns.put("wo_n1st_eml_rslt_flg", getWoN1stEmlRsltFlg());
		this.hashColumns.put("inter_use_flg", getInterUseFlg());
		this.hashColumns.put("wo_n3rd_fax_rslt_flg", getWoN3rdFaxRsltFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("wo_n3rd_eml_rslt_flg", getWoN3rdEmlRsltFlg());
		this.hashColumns.put("wo_n1st_fax_no", getWoN1stFaxNo());
		this.hashColumns.put("wo_n3rd_eml", getWoN3rdEml());
		this.hashColumns.put("wo_fmt_tp_cd", getWoFmtTpCd());
		this.hashColumns.put("wo_bl_no_iss_flg", getWoBlNoIssFlg());
		this.hashColumns.put("wo_n1st_eml", getWoN1stEml());
		this.hashColumns.put("wo_rmk", getWoRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("wo_n1st_fax_rslt_flg", getWoN1stFaxRsltFlg());
		this.hashColumns.put("dw_upd_dt", getDwUpdDt());
		this.hashColumns.put("trsp_wo_seq", getTrspWoSeq());
		this.hashColumns.put("wo_n2nd_eml", getWoN2ndEml());
		this.hashColumns.put("wo_opn_flg", getWoOpnFlg());
		this.hashColumns.put("wo_n1st_eml_snd_no", getWoN1stEmlSndNo());
		this.hashColumns.put("wo_rjct_dt", getWoRjctDt());
		this.hashColumns.put("wo_n2nd_fax_rslt_flg", getWoN2ndFaxRsltFlg());
		this.hashColumns.put("wo_edi_rcv_rslt_dt", getWoEdiRcvRsltDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("wo_vndr_seq", getWoVndrSeq());
		this.hashColumns.put("wo_n2nd_eml_rslt_flg", getWoN2ndEmlRsltFlg());
		this.hashColumns.put("wo_edi_rcv_rslt_msg", getWoEdiRcvRsltMsg());
		this.hashColumns.put("wo_n2nd_eml_snd_no", getWoN2ndEmlSndNo());
		this.hashColumns.put("wo_iss_sts_cd", getWoIssStsCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("wo_edi_use_flg", getWoEdiUseFlg());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("wo_edi_rcv_purp_cd", getWoEdiRcvPurpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("wo_edi_rcv_rslt_cd", getWoEdiRcvRsltCd());
		this.hashColumns.put("wo_n2nd_fax_snd_no", getWoN2ndFaxSndNo());
		this.hashColumns.put("wo_prn_use_flg", getWoPrnUseFlg());
		this.hashColumns.put("wo_n2nd_fax_no", getWoN2ndFaxNo());
		this.hashColumns.put("wo_n3rd_eml_snd_no", getWoN3rdEmlSndNo());
		this.hashColumns.put("wo_n1st_fax_snd_no", getWoN1stFaxSndNo());
		this.hashColumns.put("wo_n3rd_fax_no", getWoN3rdFaxNo());
		this.hashColumns.put("trsp_wo_ofc_cty_cd", getTrspWoOfcCtyCd());
		this.hashColumns.put("wo_n3rd_fax_snd_no", getWoN3rdFaxSndNo());
		this.hashColumns.put("wo_fax_use_flg", getWoFaxUseFlg());
		this.hashColumns.put("rt_dp_use_flg", getRtDpUseFlg());
		this.hashColumns.put("wo_cntc_pson_nm", getWoCntcPsonNm());
		this.hashColumns.put("pre_dis_use_flg", getPreDisUseFlg());
		this.hashColumns.put("wo_eml_use_flg", getWoEmlUseFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("cmdt_dp_use_flg", "cmdtDpUseFlg");
		this.hashFields.put("dtn_use_flg", "dtnUseFlg");
		this.hashFields.put("wo_n1st_eml_rslt_flg", "woN1stEmlRsltFlg");
		this.hashFields.put("inter_use_flg", "interUseFlg");
		this.hashFields.put("wo_n3rd_fax_rslt_flg", "woN3rdFaxRsltFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("wo_n3rd_eml_rslt_flg", "woN3rdEmlRsltFlg");
		this.hashFields.put("wo_n1st_fax_no", "woN1stFaxNo");
		this.hashFields.put("wo_n3rd_eml", "woN3rdEml");
		this.hashFields.put("wo_fmt_tp_cd", "woFmtTpCd");
		this.hashFields.put("wo_bl_no_iss_flg", "woBlNoIssFlg");
		this.hashFields.put("wo_n1st_eml", "woN1stEml");
		this.hashFields.put("wo_rmk", "woRmk");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("wo_n1st_fax_rslt_flg", "woN1stFaxRsltFlg");
		this.hashFields.put("dw_upd_dt", "dwUpdDt");
		this.hashFields.put("trsp_wo_seq", "trspWoSeq");
		this.hashFields.put("wo_n2nd_eml", "woN2ndEml");
		this.hashFields.put("wo_opn_flg", "woOpnFlg");
		this.hashFields.put("wo_n1st_eml_snd_no", "woN1stEmlSndNo");
		this.hashFields.put("wo_rjct_dt", "woRjctDt");
		this.hashFields.put("wo_n2nd_fax_rslt_flg", "woN2ndFaxRsltFlg");
		this.hashFields.put("wo_edi_rcv_rslt_dt", "woEdiRcvRsltDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("wo_vndr_seq", "woVndrSeq");
		this.hashFields.put("wo_n2nd_eml_rslt_flg", "woN2ndEmlRsltFlg");
		this.hashFields.put("wo_edi_rcv_rslt_msg", "woEdiRcvRsltMsg");
		this.hashFields.put("wo_n2nd_eml_snd_no", "woN2ndEmlSndNo");
		this.hashFields.put("wo_iss_sts_cd", "woIssStsCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("wo_edi_use_flg", "woEdiUseFlg");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("wo_edi_rcv_purp_cd", "woEdiRcvPurpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("wo_edi_rcv_rslt_cd", "woEdiRcvRsltCd");
		this.hashFields.put("wo_n2nd_fax_snd_no", "woN2ndFaxSndNo");
		this.hashFields.put("wo_prn_use_flg", "woPrnUseFlg");
		this.hashFields.put("wo_n2nd_fax_no", "woN2ndFaxNo");
		this.hashFields.put("wo_n3rd_eml_snd_no", "woN3rdEmlSndNo");
		this.hashFields.put("wo_n1st_fax_snd_no", "woN1stFaxSndNo");
		this.hashFields.put("wo_n3rd_fax_no", "woN3rdFaxNo");
		this.hashFields.put("trsp_wo_ofc_cty_cd", "trspWoOfcCtyCd");
		this.hashFields.put("wo_n3rd_fax_snd_no", "woN3rdFaxSndNo");
		this.hashFields.put("wo_fax_use_flg", "woFaxUseFlg");
		this.hashFields.put("rt_dp_use_flg", "rtDpUseFlg");
		this.hashFields.put("wo_cntc_pson_nm", "woCntcPsonNm");
		this.hashFields.put("pre_dis_use_flg", "preDisUseFlg");
		this.hashFields.put("wo_eml_use_flg", "woEmlUseFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return cmdtDpUseFlg
	 */
	public String getCmdtDpUseFlg() {
		return this.cmdtDpUseFlg;
	}
	
	/**
	 * Column Info
	 * @return dtnUseFlg
	 */
	public String getDtnUseFlg() {
		return this.dtnUseFlg;
	}
	
	/**
	 * Column Info
	 * @return woN1stEmlRsltFlg
	 */
	public String getWoN1stEmlRsltFlg() {
		return this.woN1stEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return interUseFlg
	 */
	public String getInterUseFlg() {
		return this.interUseFlg;
	}
	
	/**
	 * Column Info
	 * @return woN3rdFaxRsltFlg
	 */
	public String getWoN3rdFaxRsltFlg() {
		return this.woN3rdFaxRsltFlg;
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
	 * @return woN3rdEmlRsltFlg
	 */
	public String getWoN3rdEmlRsltFlg() {
		return this.woN3rdEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return woN1stFaxNo
	 */
	public String getWoN1stFaxNo() {
		return this.woN1stFaxNo;
	}
	
	/**
	 * Column Info
	 * @return woN3rdEml
	 */
	public String getWoN3rdEml() {
		return this.woN3rdEml;
	}
	
	/**
	 * Column Info
	 * @return woFmtTpCd
	 */
	public String getWoFmtTpCd() {
		return this.woFmtTpCd;
	}
	
	/**
	 * Column Info
	 * @return woBlNoIssFlg
	 */
	public String getWoBlNoIssFlg() {
		return this.woBlNoIssFlg;
	}
	
	/**
	 * Column Info
	 * @return woN1stEml
	 */
	public String getWoN1stEml() {
		return this.woN1stEml;
	}
	
	/**
	 * Column Info
	 * @return woRmk
	 */
	public String getWoRmk() {
		return this.woRmk;
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
	 * @return woN1stFaxRsltFlg
	 */
	public String getWoN1stFaxRsltFlg() {
		return this.woN1stFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return dwUpdDt
	 */
	public String getDwUpdDt() {
		return this.dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return trspWoSeq
	 */
	public String getTrspWoSeq() {
		return this.trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @return woN2ndEml
	 */
	public String getWoN2ndEml() {
		return this.woN2ndEml;
	}
	
	/**
	 * Column Info
	 * @return woOpnFlg
	 */
	public String getWoOpnFlg() {
		return this.woOpnFlg;
	}
	
	/**
	 * Column Info
	 * @return woN1stEmlSndNo
	 */
	public String getWoN1stEmlSndNo() {
		return this.woN1stEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return woRjctDt
	 */
	public String getWoRjctDt() {
		return this.woRjctDt;
	}
	
	/**
	 * Column Info
	 * @return woN2ndFaxRsltFlg
	 */
	public String getWoN2ndFaxRsltFlg() {
		return this.woN2ndFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return woEdiRcvRsltDt
	 */
	public String getWoEdiRcvRsltDt() {
		return this.woEdiRcvRsltDt;
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
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return woVndrSeq
	 */
	public String getWoVndrSeq() {
		return this.woVndrSeq;
	}
	
	/**
	 * Column Info
	 * @return woN2ndEmlRsltFlg
	 */
	public String getWoN2ndEmlRsltFlg() {
		return this.woN2ndEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @return woEdiRcvRsltMsg
	 */
	public String getWoEdiRcvRsltMsg() {
		return this.woEdiRcvRsltMsg;
	}
	
	/**
	 * Column Info
	 * @return woN2ndEmlSndNo
	 */
	public String getWoN2ndEmlSndNo() {
		return this.woN2ndEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return woIssStsCd
	 */
	public String getWoIssStsCd() {
		return this.woIssStsCd;
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
	 * @return woEdiUseFlg
	 */
	public String getWoEdiUseFlg() {
		return this.woEdiUseFlg;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return woEdiRcvPurpCd
	 */
	public String getWoEdiRcvPurpCd() {
		return this.woEdiRcvPurpCd;
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
	 * @return woEdiRcvRsltCd
	 */
	public String getWoEdiRcvRsltCd() {
		return this.woEdiRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @return woN2ndFaxSndNo
	 */
	public String getWoN2ndFaxSndNo() {
		return this.woN2ndFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @return woPrnUseFlg
	 */
	public String getWoPrnUseFlg() {
		return this.woPrnUseFlg;
	}
	
	/**
	 * Column Info
	 * @return woN2ndFaxNo
	 */
	public String getWoN2ndFaxNo() {
		return this.woN2ndFaxNo;
	}
	
	/**
	 * Column Info
	 * @return woN3rdEmlSndNo
	 */
	public String getWoN3rdEmlSndNo() {
		return this.woN3rdEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @return woN1stFaxSndNo
	 */
	public String getWoN1stFaxSndNo() {
		return this.woN1stFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @return woN3rdFaxNo
	 */
	public String getWoN3rdFaxNo() {
		return this.woN3rdFaxNo;
	}
	
	/**
	 * Column Info
	 * @return trspWoOfcCtyCd
	 */
	public String getTrspWoOfcCtyCd() {
		return this.trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return woN3rdFaxSndNo
	 */
	public String getWoN3rdFaxSndNo() {
		return this.woN3rdFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @return woFaxUseFlg
	 */
	public String getWoFaxUseFlg() {
		return this.woFaxUseFlg;
	}
	
	/**
	 * Column Info
	 * @return rtDpUseFlg
	 */
	public String getRtDpUseFlg() {
		return this.rtDpUseFlg;
	}
	
	/**
	 * Column Info
	 * @return woCntcPsonNm
	 */
	public String getWoCntcPsonNm() {
		return this.woCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return preDisUseFlg
	 */
	public String getPreDisUseFlg() {
		return this.preDisUseFlg;
	}
	
	/**
	 * Column Info
	 * @return woEmlUseFlg
	 */
	public String getWoEmlUseFlg() {
		return this.woEmlUseFlg;
	}
	

	/**
	 * Column Info
	 * @param cmdtDpUseFlg
	 */
	public void setCmdtDpUseFlg(String cmdtDpUseFlg) {
		this.cmdtDpUseFlg = cmdtDpUseFlg;
	}
	
	/**
	 * Column Info
	 * @param dtnUseFlg
	 */
	public void setDtnUseFlg(String dtnUseFlg) {
		this.dtnUseFlg = dtnUseFlg;
	}
	
	/**
	 * Column Info
	 * @param woN1stEmlRsltFlg
	 */
	public void setWoN1stEmlRsltFlg(String woN1stEmlRsltFlg) {
		this.woN1stEmlRsltFlg = woN1stEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param interUseFlg
	 */
	public void setInterUseFlg(String interUseFlg) {
		this.interUseFlg = interUseFlg;
	}
	
	/**
	 * Column Info
	 * @param woN3rdFaxRsltFlg
	 */
	public void setWoN3rdFaxRsltFlg(String woN3rdFaxRsltFlg) {
		this.woN3rdFaxRsltFlg = woN3rdFaxRsltFlg;
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
	 * @param woN3rdEmlRsltFlg
	 */
	public void setWoN3rdEmlRsltFlg(String woN3rdEmlRsltFlg) {
		this.woN3rdEmlRsltFlg = woN3rdEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param woN1stFaxNo
	 */
	public void setWoN1stFaxNo(String woN1stFaxNo) {
		this.woN1stFaxNo = woN1stFaxNo;
	}
	
	/**
	 * Column Info
	 * @param woN3rdEml
	 */
	public void setWoN3rdEml(String woN3rdEml) {
		this.woN3rdEml = woN3rdEml;
	}
	
	/**
	 * Column Info
	 * @param woFmtTpCd
	 */
	public void setWoFmtTpCd(String woFmtTpCd) {
		this.woFmtTpCd = woFmtTpCd;
	}
	
	/**
	 * Column Info
	 * @param woBlNoIssFlg
	 */
	public void setWoBlNoIssFlg(String woBlNoIssFlg) {
		this.woBlNoIssFlg = woBlNoIssFlg;
	}
	
	/**
	 * Column Info
	 * @param woN1stEml
	 */
	public void setWoN1stEml(String woN1stEml) {
		this.woN1stEml = woN1stEml;
	}
	
	/**
	 * Column Info
	 * @param woRmk
	 */
	public void setWoRmk(String woRmk) {
		this.woRmk = woRmk;
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
	 * @param woN1stFaxRsltFlg
	 */
	public void setWoN1stFaxRsltFlg(String woN1stFaxRsltFlg) {
		this.woN1stFaxRsltFlg = woN1stFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param dwUpdDt
	 */
	public void setDwUpdDt(String dwUpdDt) {
		this.dwUpdDt = dwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param trspWoSeq
	 */
	public void setTrspWoSeq(String trspWoSeq) {
		this.trspWoSeq = trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @param woN2ndEml
	 */
	public void setWoN2ndEml(String woN2ndEml) {
		this.woN2ndEml = woN2ndEml;
	}
	
	/**
	 * Column Info
	 * @param woOpnFlg
	 */
	public void setWoOpnFlg(String woOpnFlg) {
		this.woOpnFlg = woOpnFlg;
	}
	
	/**
	 * Column Info
	 * @param woN1stEmlSndNo
	 */
	public void setWoN1stEmlSndNo(String woN1stEmlSndNo) {
		this.woN1stEmlSndNo = woN1stEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param woRjctDt
	 */
	public void setWoRjctDt(String woRjctDt) {
		this.woRjctDt = woRjctDt;
	}
	
	/**
	 * Column Info
	 * @param woN2ndFaxRsltFlg
	 */
	public void setWoN2ndFaxRsltFlg(String woN2ndFaxRsltFlg) {
		this.woN2ndFaxRsltFlg = woN2ndFaxRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param woEdiRcvRsltDt
	 */
	public void setWoEdiRcvRsltDt(String woEdiRcvRsltDt) {
		this.woEdiRcvRsltDt = woEdiRcvRsltDt;
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
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param woVndrSeq
	 */
	public void setWoVndrSeq(String woVndrSeq) {
		this.woVndrSeq = woVndrSeq;
	}
	
	/**
	 * Column Info
	 * @param woN2ndEmlRsltFlg
	 */
	public void setWoN2ndEmlRsltFlg(String woN2ndEmlRsltFlg) {
		this.woN2ndEmlRsltFlg = woN2ndEmlRsltFlg;
	}
	
	/**
	 * Column Info
	 * @param woEdiRcvRsltMsg
	 */
	public void setWoEdiRcvRsltMsg(String woEdiRcvRsltMsg) {
		this.woEdiRcvRsltMsg = woEdiRcvRsltMsg;
	}
	
	/**
	 * Column Info
	 * @param woN2ndEmlSndNo
	 */
	public void setWoN2ndEmlSndNo(String woN2ndEmlSndNo) {
		this.woN2ndEmlSndNo = woN2ndEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param woIssStsCd
	 */
	public void setWoIssStsCd(String woIssStsCd) {
		this.woIssStsCd = woIssStsCd;
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
	 * @param woEdiUseFlg
	 */
	public void setWoEdiUseFlg(String woEdiUseFlg) {
		this.woEdiUseFlg = woEdiUseFlg;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param woEdiRcvPurpCd
	 */
	public void setWoEdiRcvPurpCd(String woEdiRcvPurpCd) {
		this.woEdiRcvPurpCd = woEdiRcvPurpCd;
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
	 * @param woEdiRcvRsltCd
	 */
	public void setWoEdiRcvRsltCd(String woEdiRcvRsltCd) {
		this.woEdiRcvRsltCd = woEdiRcvRsltCd;
	}
	
	/**
	 * Column Info
	 * @param woN2ndFaxSndNo
	 */
	public void setWoN2ndFaxSndNo(String woN2ndFaxSndNo) {
		this.woN2ndFaxSndNo = woN2ndFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @param woPrnUseFlg
	 */
	public void setWoPrnUseFlg(String woPrnUseFlg) {
		this.woPrnUseFlg = woPrnUseFlg;
	}
	
	/**
	 * Column Info
	 * @param woN2ndFaxNo
	 */
	public void setWoN2ndFaxNo(String woN2ndFaxNo) {
		this.woN2ndFaxNo = woN2ndFaxNo;
	}
	
	/**
	 * Column Info
	 * @param woN3rdEmlSndNo
	 */
	public void setWoN3rdEmlSndNo(String woN3rdEmlSndNo) {
		this.woN3rdEmlSndNo = woN3rdEmlSndNo;
	}
	
	/**
	 * Column Info
	 * @param woN1stFaxSndNo
	 */
	public void setWoN1stFaxSndNo(String woN1stFaxSndNo) {
		this.woN1stFaxSndNo = woN1stFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @param woN3rdFaxNo
	 */
	public void setWoN3rdFaxNo(String woN3rdFaxNo) {
		this.woN3rdFaxNo = woN3rdFaxNo;
	}
	
	/**
	 * Column Info
	 * @param trspWoOfcCtyCd
	 */
	public void setTrspWoOfcCtyCd(String trspWoOfcCtyCd) {
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param woN3rdFaxSndNo
	 */
	public void setWoN3rdFaxSndNo(String woN3rdFaxSndNo) {
		this.woN3rdFaxSndNo = woN3rdFaxSndNo;
	}
	
	/**
	 * Column Info
	 * @param woFaxUseFlg
	 */
	public void setWoFaxUseFlg(String woFaxUseFlg) {
		this.woFaxUseFlg = woFaxUseFlg;
	}
	
	/**
	 * Column Info
	 * @param rtDpUseFlg
	 */
	public void setRtDpUseFlg(String rtDpUseFlg) {
		this.rtDpUseFlg = rtDpUseFlg;
	}
	
	/**
	 * Column Info
	 * @param woCntcPsonNm
	 */
	public void setWoCntcPsonNm(String woCntcPsonNm) {
		this.woCntcPsonNm = woCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param preDisUseFlg
	 */
	public void setPreDisUseFlg(String preDisUseFlg) {
		this.preDisUseFlg = preDisUseFlg;
	}
	
	/**
	 * Column Info
	 * @param woEmlUseFlg
	 */
	public void setWoEmlUseFlg(String woEmlUseFlg) {
		this.woEmlUseFlg = woEmlUseFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setCmdtDpUseFlg(JSPUtil.getParameter(request, "cmdt_dp_use_flg", ""));
		setDtnUseFlg(JSPUtil.getParameter(request, "dtn_use_flg", ""));
		setWoN1stEmlRsltFlg(JSPUtil.getParameter(request, "wo_n1st_eml_rslt_flg", ""));
		setInterUseFlg(JSPUtil.getParameter(request, "inter_use_flg", ""));
		setWoN3rdFaxRsltFlg(JSPUtil.getParameter(request, "wo_n3rd_fax_rslt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setWoN3rdEmlRsltFlg(JSPUtil.getParameter(request, "wo_n3rd_eml_rslt_flg", ""));
		setWoN1stFaxNo(JSPUtil.getParameter(request, "wo_n1st_fax_no", ""));
		setWoN3rdEml(JSPUtil.getParameter(request, "wo_n3rd_eml", ""));
		setWoFmtTpCd(JSPUtil.getParameter(request, "wo_fmt_tp_cd", ""));
		setWoBlNoIssFlg(JSPUtil.getParameter(request, "wo_bl_no_iss_flg", ""));
		setWoN1stEml(JSPUtil.getParameter(request, "wo_n1st_eml", ""));
		setWoRmk(JSPUtil.getParameter(request, "wo_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setWoN1stFaxRsltFlg(JSPUtil.getParameter(request, "wo_n1st_fax_rslt_flg", ""));
		setDwUpdDt(JSPUtil.getParameter(request, "dw_upd_dt", ""));
		setTrspWoSeq(JSPUtil.getParameter(request, "trsp_wo_seq", ""));
		setWoN2ndEml(JSPUtil.getParameter(request, "wo_n2nd_eml", ""));
		setWoOpnFlg(JSPUtil.getParameter(request, "wo_opn_flg", ""));
		setWoN1stEmlSndNo(JSPUtil.getParameter(request, "wo_n1st_eml_snd_no", ""));
		setWoRjctDt(JSPUtil.getParameter(request, "wo_rjct_dt", ""));
		setWoN2ndFaxRsltFlg(JSPUtil.getParameter(request, "wo_n2nd_fax_rslt_flg", ""));
		setWoEdiRcvRsltDt(JSPUtil.getParameter(request, "wo_edi_rcv_rslt_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setWoVndrSeq(JSPUtil.getParameter(request, "wo_vndr_seq", ""));
		setWoN2ndEmlRsltFlg(JSPUtil.getParameter(request, "wo_n2nd_eml_rslt_flg", ""));
		setWoEdiRcvRsltMsg(JSPUtil.getParameter(request, "wo_edi_rcv_rslt_msg", ""));
		setWoN2ndEmlSndNo(JSPUtil.getParameter(request, "wo_n2nd_eml_snd_no", ""));
		setWoIssStsCd(JSPUtil.getParameter(request, "wo_iss_sts_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setWoEdiUseFlg(JSPUtil.getParameter(request, "wo_edi_use_flg", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setWoEdiRcvPurpCd(JSPUtil.getParameter(request, "wo_edi_rcv_purp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setWoEdiRcvRsltCd(JSPUtil.getParameter(request, "wo_edi_rcv_rslt_cd", ""));
		setWoN2ndFaxSndNo(JSPUtil.getParameter(request, "wo_n2nd_fax_snd_no", ""));
		setWoPrnUseFlg(JSPUtil.getParameter(request, "wo_prn_use_flg", ""));
		setWoN2ndFaxNo(JSPUtil.getParameter(request, "wo_n2nd_fax_no", ""));
		setWoN3rdEmlSndNo(JSPUtil.getParameter(request, "wo_n3rd_eml_snd_no", ""));
		setWoN1stFaxSndNo(JSPUtil.getParameter(request, "wo_n1st_fax_snd_no", ""));
		setWoN3rdFaxNo(JSPUtil.getParameter(request, "wo_n3rd_fax_no", ""));
		setTrspWoOfcCtyCd(JSPUtil.getParameter(request, "trsp_wo_ofc_cty_cd", ""));
		setWoN3rdFaxSndNo(JSPUtil.getParameter(request, "wo_n3rd_fax_snd_no", ""));
		setWoFaxUseFlg(JSPUtil.getParameter(request, "wo_fax_use_flg", ""));
		setRtDpUseFlg(JSPUtil.getParameter(request, "rt_dp_use_flg", ""));
		setWoCntcPsonNm(JSPUtil.getParameter(request, "wo_cntc_pson_nm", ""));
		setPreDisUseFlg(JSPUtil.getParameter(request, "pre_dis_use_flg", ""));
		setWoEmlUseFlg(JSPUtil.getParameter(request, "wo_eml_use_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsTrspWrkOrdVO[]
	 */
	public TrsTrspWrkOrdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsTrspWrkOrdVO[]
	 */
	public TrsTrspWrkOrdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsTrspWrkOrdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] cmdtDpUseFlg = (JSPUtil.getParameter(request, prefix	+ "cmdt_dp_use_flg", length));
			String[] dtnUseFlg = (JSPUtil.getParameter(request, prefix	+ "dtn_use_flg", length));
			String[] woN1stEmlRsltFlg = (JSPUtil.getParameter(request, prefix	+ "wo_n1st_eml_rslt_flg", length));
			String[] interUseFlg = (JSPUtil.getParameter(request, prefix	+ "inter_use_flg", length));
			String[] woN3rdFaxRsltFlg = (JSPUtil.getParameter(request, prefix	+ "wo_n3rd_fax_rslt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] woN3rdEmlRsltFlg = (JSPUtil.getParameter(request, prefix	+ "wo_n3rd_eml_rslt_flg", length));
			String[] woN1stFaxNo = (JSPUtil.getParameter(request, prefix	+ "wo_n1st_fax_no", length));
			String[] woN3rdEml = (JSPUtil.getParameter(request, prefix	+ "wo_n3rd_eml", length));
			String[] woFmtTpCd = (JSPUtil.getParameter(request, prefix	+ "wo_fmt_tp_cd", length));
			String[] woBlNoIssFlg = (JSPUtil.getParameter(request, prefix	+ "wo_bl_no_iss_flg", length));
			String[] woN1stEml = (JSPUtil.getParameter(request, prefix	+ "wo_n1st_eml", length));
			String[] woRmk = (JSPUtil.getParameter(request, prefix	+ "wo_rmk", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] woN1stFaxRsltFlg = (JSPUtil.getParameter(request, prefix	+ "wo_n1st_fax_rslt_flg", length));
			String[] dwUpdDt = (JSPUtil.getParameter(request, prefix	+ "dw_upd_dt", length));
			String[] trspWoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_seq", length));
			String[] woN2ndEml = (JSPUtil.getParameter(request, prefix	+ "wo_n2nd_eml", length));
			String[] woOpnFlg = (JSPUtil.getParameter(request, prefix	+ "wo_opn_flg", length));
			String[] woN1stEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "wo_n1st_eml_snd_no", length));
			String[] woRjctDt = (JSPUtil.getParameter(request, prefix	+ "wo_rjct_dt", length));
			String[] woN2ndFaxRsltFlg = (JSPUtil.getParameter(request, prefix	+ "wo_n2nd_fax_rslt_flg", length));
			String[] woEdiRcvRsltDt = (JSPUtil.getParameter(request, prefix	+ "wo_edi_rcv_rslt_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] woVndrSeq = (JSPUtil.getParameter(request, prefix	+ "wo_vndr_seq", length));
			String[] woN2ndEmlRsltFlg = (JSPUtil.getParameter(request, prefix	+ "wo_n2nd_eml_rslt_flg", length));
			String[] woEdiRcvRsltMsg = (JSPUtil.getParameter(request, prefix	+ "wo_edi_rcv_rslt_msg", length));
			String[] woN2ndEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "wo_n2nd_eml_snd_no", length));
			String[] woIssStsCd = (JSPUtil.getParameter(request, prefix	+ "wo_iss_sts_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] woEdiUseFlg = (JSPUtil.getParameter(request, prefix	+ "wo_edi_use_flg", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] woEdiRcvPurpCd = (JSPUtil.getParameter(request, prefix	+ "wo_edi_rcv_purp_cd", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] woEdiRcvRsltCd = (JSPUtil.getParameter(request, prefix	+ "wo_edi_rcv_rslt_cd", length));
			String[] woN2ndFaxSndNo = (JSPUtil.getParameter(request, prefix	+ "wo_n2nd_fax_snd_no", length));
			String[] woPrnUseFlg = (JSPUtil.getParameter(request, prefix	+ "wo_prn_use_flg", length));
			String[] woN2ndFaxNo = (JSPUtil.getParameter(request, prefix	+ "wo_n2nd_fax_no", length));
			String[] woN3rdEmlSndNo = (JSPUtil.getParameter(request, prefix	+ "wo_n3rd_eml_snd_no", length));
			String[] woN1stFaxSndNo = (JSPUtil.getParameter(request, prefix	+ "wo_n1st_fax_snd_no", length));
			String[] woN3rdFaxNo = (JSPUtil.getParameter(request, prefix	+ "wo_n3rd_fax_no", length));
			String[] trspWoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_ofc_cty_cd", length));
			String[] woN3rdFaxSndNo = (JSPUtil.getParameter(request, prefix	+ "wo_n3rd_fax_snd_no", length));
			String[] woFaxUseFlg = (JSPUtil.getParameter(request, prefix	+ "wo_fax_use_flg", length));
			String[] rtDpUseFlg = (JSPUtil.getParameter(request, prefix	+ "rt_dp_use_flg", length));
			String[] woCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "wo_cntc_pson_nm", length));
			String[] preDisUseFlg = (JSPUtil.getParameter(request, prefix	+ "pre_dis_use_flg", length));
			String[] woEmlUseFlg = (JSPUtil.getParameter(request, prefix	+ "wo_eml_use_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsTrspWrkOrdVO();
				if (cmdtDpUseFlg[i] != null)
					model.setCmdtDpUseFlg(cmdtDpUseFlg[i]);
				if (dtnUseFlg[i] != null)
					model.setDtnUseFlg(dtnUseFlg[i]);
				if (woN1stEmlRsltFlg[i] != null)
					model.setWoN1stEmlRsltFlg(woN1stEmlRsltFlg[i]);
				if (interUseFlg[i] != null)
					model.setInterUseFlg(interUseFlg[i]);
				if (woN3rdFaxRsltFlg[i] != null)
					model.setWoN3rdFaxRsltFlg(woN3rdFaxRsltFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (woN3rdEmlRsltFlg[i] != null)
					model.setWoN3rdEmlRsltFlg(woN3rdEmlRsltFlg[i]);
				if (woN1stFaxNo[i] != null)
					model.setWoN1stFaxNo(woN1stFaxNo[i]);
				if (woN3rdEml[i] != null)
					model.setWoN3rdEml(woN3rdEml[i]);
				if (woFmtTpCd[i] != null)
					model.setWoFmtTpCd(woFmtTpCd[i]);
				if (woBlNoIssFlg[i] != null)
					model.setWoBlNoIssFlg(woBlNoIssFlg[i]);
				if (woN1stEml[i] != null)
					model.setWoN1stEml(woN1stEml[i]);
				if (woRmk[i] != null)
					model.setWoRmk(woRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (woN1stFaxRsltFlg[i] != null)
					model.setWoN1stFaxRsltFlg(woN1stFaxRsltFlg[i]);
				if (dwUpdDt[i] != null)
					model.setDwUpdDt(dwUpdDt[i]);
				if (trspWoSeq[i] != null)
					model.setTrspWoSeq(trspWoSeq[i]);
				if (woN2ndEml[i] != null)
					model.setWoN2ndEml(woN2ndEml[i]);
				if (woOpnFlg[i] != null)
					model.setWoOpnFlg(woOpnFlg[i]);
				if (woN1stEmlSndNo[i] != null)
					model.setWoN1stEmlSndNo(woN1stEmlSndNo[i]);
				if (woRjctDt[i] != null)
					model.setWoRjctDt(woRjctDt[i]);
				if (woN2ndFaxRsltFlg[i] != null)
					model.setWoN2ndFaxRsltFlg(woN2ndFaxRsltFlg[i]);
				if (woEdiRcvRsltDt[i] != null)
					model.setWoEdiRcvRsltDt(woEdiRcvRsltDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (woVndrSeq[i] != null)
					model.setWoVndrSeq(woVndrSeq[i]);
				if (woN2ndEmlRsltFlg[i] != null)
					model.setWoN2ndEmlRsltFlg(woN2ndEmlRsltFlg[i]);
				if (woEdiRcvRsltMsg[i] != null)
					model.setWoEdiRcvRsltMsg(woEdiRcvRsltMsg[i]);
				if (woN2ndEmlSndNo[i] != null)
					model.setWoN2ndEmlSndNo(woN2ndEmlSndNo[i]);
				if (woIssStsCd[i] != null)
					model.setWoIssStsCd(woIssStsCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (woEdiUseFlg[i] != null)
					model.setWoEdiUseFlg(woEdiUseFlg[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (woEdiRcvPurpCd[i] != null)
					model.setWoEdiRcvPurpCd(woEdiRcvPurpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (woEdiRcvRsltCd[i] != null)
					model.setWoEdiRcvRsltCd(woEdiRcvRsltCd[i]);
				if (woN2ndFaxSndNo[i] != null)
					model.setWoN2ndFaxSndNo(woN2ndFaxSndNo[i]);
				if (woPrnUseFlg[i] != null)
					model.setWoPrnUseFlg(woPrnUseFlg[i]);
				if (woN2ndFaxNo[i] != null)
					model.setWoN2ndFaxNo(woN2ndFaxNo[i]);
				if (woN3rdEmlSndNo[i] != null)
					model.setWoN3rdEmlSndNo(woN3rdEmlSndNo[i]);
				if (woN1stFaxSndNo[i] != null)
					model.setWoN1stFaxSndNo(woN1stFaxSndNo[i]);
				if (woN3rdFaxNo[i] != null)
					model.setWoN3rdFaxNo(woN3rdFaxNo[i]);
				if (trspWoOfcCtyCd[i] != null)
					model.setTrspWoOfcCtyCd(trspWoOfcCtyCd[i]);
				if (woN3rdFaxSndNo[i] != null)
					model.setWoN3rdFaxSndNo(woN3rdFaxSndNo[i]);
				if (woFaxUseFlg[i] != null)
					model.setWoFaxUseFlg(woFaxUseFlg[i]);
				if (rtDpUseFlg[i] != null)
					model.setRtDpUseFlg(rtDpUseFlg[i]);
				if (woCntcPsonNm[i] != null)
					model.setWoCntcPsonNm(woCntcPsonNm[i]);
				if (preDisUseFlg[i] != null)
					model.setPreDisUseFlg(preDisUseFlg[i]);
				if (woEmlUseFlg[i] != null)
					model.setWoEmlUseFlg(woEmlUseFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsTrspWrkOrdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsTrspWrkOrdVO[]
	 */
	public TrsTrspWrkOrdVO[] getTrsTrspWrkOrdVOs(){
		TrsTrspWrkOrdVO[] vos = (TrsTrspWrkOrdVO[])models.toArray(new TrsTrspWrkOrdVO[models.size()]);
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
		this.cmdtDpUseFlg = this.cmdtDpUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtnUseFlg = this.dtnUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN1stEmlRsltFlg = this.woN1stEmlRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.interUseFlg = this.interUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN3rdFaxRsltFlg = this.woN3rdFaxRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN3rdEmlRsltFlg = this.woN3rdEmlRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN1stFaxNo = this.woN1stFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN3rdEml = this.woN3rdEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woFmtTpCd = this.woFmtTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woBlNoIssFlg = this.woBlNoIssFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN1stEml = this.woN1stEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woRmk = this.woRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN1stFaxRsltFlg = this.woN1stFaxRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dwUpdDt = this.dwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoSeq = this.trspWoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN2ndEml = this.woN2ndEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woOpnFlg = this.woOpnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN1stEmlSndNo = this.woN1stEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woRjctDt = this.woRjctDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN2ndFaxRsltFlg = this.woN2ndFaxRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woEdiRcvRsltDt = this.woEdiRcvRsltDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woVndrSeq = this.woVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN2ndEmlRsltFlg = this.woN2ndEmlRsltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woEdiRcvRsltMsg = this.woEdiRcvRsltMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN2ndEmlSndNo = this.woN2ndEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woIssStsCd = this.woIssStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woEdiUseFlg = this.woEdiUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woEdiRcvPurpCd = this.woEdiRcvPurpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woEdiRcvRsltCd = this.woEdiRcvRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN2ndFaxSndNo = this.woN2ndFaxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woPrnUseFlg = this.woPrnUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN2ndFaxNo = this.woN2ndFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN3rdEmlSndNo = this.woN3rdEmlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN1stFaxSndNo = this.woN1stFaxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN3rdFaxNo = this.woN3rdFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoOfcCtyCd = this.trspWoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woN3rdFaxSndNo = this.woN3rdFaxSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woFaxUseFlg = this.woFaxUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rtDpUseFlg = this.rtDpUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woCntcPsonNm = this.woCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preDisUseFlg = this.preDisUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woEmlUseFlg = this.woEmlUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
