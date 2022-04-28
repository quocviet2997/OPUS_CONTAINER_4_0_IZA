/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : AgtCommBkgInfoVO.java
*@FileTitle : AgtCommBkgInfoVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.05.12
*@LastModifier : 박성진
*@LastVersion : 1.0
* 2010.05.12 박성진 
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
 * @author 박성진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtCommBkgInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtCommBkgInfoVO> models = new ArrayList<AgtCommBkgInfoVO>();
	
	/* Column Info */
	private String ifDt = null;
	/* Column Info */
	private String colNm = null;
	/* Column Info */
	private String pagerowstot = null;
	/* Column Info */
	private String cltOtrAmt = null;
	/* Column Info */
	private String sDirCd = null;
	/* Column Info */
	private String facAmt = null;
	/* Column Info */
	private String ddctAmt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String ffCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String comIi = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String sailArrDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String netAmt = null;
	/* Column Info */
	private String polCd = null;
	/* Column Info */
	private String commAproNo = null;
	/* Column Info */
	private String comI = null;
	/* Column Info */
	private String obSlsOfcCd = null;
	/* Column Info */
	private String searchDtFr = null;
	/* Column Info */
	private String bkgOfcCd = null;
	/* Column Info */
	private String feu = null;
	/* Column Info */
	private String calcDt = null;
	/* Column Info */
	private String commVvd = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String tsAmt = null;
	/* Column Info */
	private String aproDt = null;
	/* Column Info */
	private String cltFrtAmt = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String teu = null;
	/* Column Info */
	private String socAmt = null;
	/* Column Info */
	private String porCd = null;
	/* Column Info */
	private String currCd = null;
	/* Column Info */
	private String stsOption = null;
	/* Column Info */
	private String searchDtTo = null;
	/* Column Info */
	private String brokerageAmt = null;
	/* Column Info */
	private String chfAmt = null;
	/* Column Info */
	private String pymtAmt = null;
	/* Column Info */
	private String ffName = null;
	/* Column Info */
	private String agnCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String crossAmt = null;
	/* Column Info */
	private String sRlaneCd = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String panCode = null;
	/* Column Info */
	private String grossAmt = null;
	/* Column Info */
	private String rqstDt = null;
	/* Column Info */
	private String pagerowsper = null;
	/* Column Info */
	private String ffAddr = null;
	/* Column Info */
	private String trAmt = null;
	/* Column Info */
	private String ppdOtrAmt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String teuFeu = null;
	/* Column Info */
	private String arOfcCd = null;
	/* Column Info */
	private String broAddr4 = null;
	/* Column Info */
	private String invNo = null;
	/* Column Info */
	private String sTrdCd = null;
	/* Column Info */
	private String broAddr5 = null;
	/* Column Info */
	private String usdAmt = null;
	/* Column Info */
	private String broAddr6 = null;
	/* Column Info */
	private String docAmt = null;
	/* Column Info */
	private String broAddr1 = null;
	/* Column Info */
	private String broAddr2 = null;
	/* Column Info */
	private String broAddr3 = null;
	/* Column Info */
	private String ppdFrtAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtCommBkgInfoVO() {}

	public AgtCommBkgInfoVO(String ibflag, String pagerows, String ifDt, String colNm, String pagerowstot, String cltOtrAmt, String sDirCd, String facAmt, String ddctAmt, String trdCd, String ffCd, String rlaneCd, String comIi, String sailArrDt, String blNo, String polCd, String netAmt, String commAproNo, String comI, String obSlsOfcCd, String searchDtFr, String bkgOfcCd, String calcDt, String commVvd, String delCd, String tsAmt, String aproDt, String cltFrtAmt, String podCd, String bkgNo, String socAmt, String porCd, String currCd, String stsOption, String searchDtTo, String brokerageAmt, String chfAmt, String pymtAmt, String ffName, String agnCd, String crossAmt, String sRlaneCd, String dirCd, String panCode, String grossAmt, String rqstDt, String pagerowsper, String ffAddr, String trAmt, String ppdOtrAmt, String ioBndCd, String teuFeu, String arOfcCd, String sTrdCd, String invNo, String broAddr4, String broAddr5, String broAddr6, String usdAmt, String docAmt, String broAddr1, String broAddr2, String broAddr3, String ppdFrtAmt, String teu, String feu) {
		this.ifDt = ifDt;
		this.colNm = colNm;
		this.pagerowstot = pagerowstot;
		this.cltOtrAmt = cltOtrAmt;
		this.sDirCd = sDirCd;
		this.facAmt = facAmt;
		this.ddctAmt = ddctAmt;
		this.trdCd = trdCd;
		this.ffCd = ffCd;
		this.rlaneCd = rlaneCd;
		this.comIi = comIi;
		this.blNo = blNo;
		this.sailArrDt = sailArrDt;
		this.pagerows = pagerows;
		this.netAmt = netAmt;
		this.polCd = polCd;
		this.commAproNo = commAproNo;
		this.comI = comI;
		this.obSlsOfcCd = obSlsOfcCd;
		this.searchDtFr = searchDtFr;
		this.bkgOfcCd = bkgOfcCd;
		this.feu = feu;
		this.calcDt = calcDt;
		this.commVvd = commVvd;
		this.delCd = delCd;
		this.tsAmt = tsAmt;
		this.aproDt = aproDt;
		this.cltFrtAmt = cltFrtAmt;
		this.podCd = podCd;
		this.bkgNo = bkgNo;
		this.teu = teu;
		this.socAmt = socAmt;
		this.porCd = porCd;
		this.currCd = currCd;
		this.stsOption = stsOption;
		this.searchDtTo = searchDtTo;
		this.brokerageAmt = brokerageAmt;
		this.chfAmt = chfAmt;
		this.pymtAmt = pymtAmt;
		this.ffName = ffName;
		this.agnCd = agnCd;
		this.ibflag = ibflag;
		this.crossAmt = crossAmt;
		this.sRlaneCd = sRlaneCd;
		this.dirCd = dirCd;
		this.panCode = panCode;
		this.grossAmt = grossAmt;
		this.rqstDt = rqstDt;
		this.pagerowsper = pagerowsper;
		this.ffAddr = ffAddr;
		this.trAmt = trAmt;
		this.ppdOtrAmt = ppdOtrAmt;
		this.ioBndCd = ioBndCd;
		this.teuFeu = teuFeu;
		this.arOfcCd = arOfcCd;
		this.broAddr4 = broAddr4;
		this.invNo = invNo;
		this.sTrdCd = sTrdCd;
		this.broAddr5 = broAddr5;
		this.usdAmt = usdAmt;
		this.broAddr6 = broAddr6;
		this.docAmt = docAmt;
		this.broAddr1 = broAddr1;
		this.broAddr2 = broAddr2;
		this.broAddr3 = broAddr3;
		this.ppdFrtAmt = ppdFrtAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("if_dt", getIfDt());
		this.hashColumns.put("col_nm", getColNm());
		this.hashColumns.put("pagerowstot", getPagerowstot());
		this.hashColumns.put("clt_otr_amt", getCltOtrAmt());
		this.hashColumns.put("s_dir_cd", getSDirCd());
		this.hashColumns.put("fac_amt", getFacAmt());
		this.hashColumns.put("ddct_amt", getDdctAmt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("ff_cd", getFfCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("com_ii", getComIi());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("sail_arr_dt", getSailArrDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("net_amt", getNetAmt());
		this.hashColumns.put("pol_cd", getPolCd());
		this.hashColumns.put("comm_apro_no", getCommAproNo());
		this.hashColumns.put("com_i", getComI());
		this.hashColumns.put("ob_sls_ofc_cd", getObSlsOfcCd());
		this.hashColumns.put("search_dt_fr", getSearchDtFr());
		this.hashColumns.put("bkg_ofc_cd", getBkgOfcCd());
		this.hashColumns.put("feu", getFeu());
		this.hashColumns.put("calc_dt", getCalcDt());
		this.hashColumns.put("comm_vvd", getCommVvd());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("ts_amt", getTsAmt());
		this.hashColumns.put("apro_dt", getAproDt());
		this.hashColumns.put("clt_frt_amt", getCltFrtAmt());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("teu", getTeu());
		this.hashColumns.put("soc_amt", getSocAmt());
		this.hashColumns.put("por_cd", getPorCd());
		this.hashColumns.put("curr_cd", getCurrCd());
		this.hashColumns.put("sts_option", getStsOption());
		this.hashColumns.put("search_dt_to", getSearchDtTo());
		this.hashColumns.put("brokerage_amt", getBrokerageAmt());
		this.hashColumns.put("chf_amt", getChfAmt());
		this.hashColumns.put("pymt_amt", getPymtAmt());
		this.hashColumns.put("ff_name", getFfName());
		this.hashColumns.put("agn_cd", getAgnCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cross_amt", getCrossAmt());
		this.hashColumns.put("s_rlane_cd", getSRlaneCd());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("pan_code", getPanCode());
		this.hashColumns.put("gross_amt", getGrossAmt());
		this.hashColumns.put("rqst_dt", getRqstDt());
		this.hashColumns.put("pagerowsper", getPagerowsper());
		this.hashColumns.put("ff_addr", getFfAddr());
		this.hashColumns.put("tr_amt", getTrAmt());
		this.hashColumns.put("ppd_otr_amt", getPpdOtrAmt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("teu_feu", getTeuFeu());
		this.hashColumns.put("ar_ofc_cd", getArOfcCd());
		this.hashColumns.put("bro_addr4", getBroAddr4());
		this.hashColumns.put("inv_no", getInvNo());
		this.hashColumns.put("s_trd_cd", getSTrdCd());
		this.hashColumns.put("bro_addr5", getBroAddr5());
		this.hashColumns.put("usd_amt", getUsdAmt());
		this.hashColumns.put("bro_addr6", getBroAddr6());
		this.hashColumns.put("doc_amt", getDocAmt());
		this.hashColumns.put("bro_addr1", getBroAddr1());
		this.hashColumns.put("bro_addr2", getBroAddr2());
		this.hashColumns.put("bro_addr3", getBroAddr3());
		this.hashColumns.put("ppd_frt_amt", getPpdFrtAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("if_dt", "ifDt");
		this.hashFields.put("col_nm", "colNm");
		this.hashFields.put("pagerowstot", "pagerowstot");
		this.hashFields.put("clt_otr_amt", "cltOtrAmt");
		this.hashFields.put("s_dir_cd", "sDirCd");
		this.hashFields.put("fac_amt", "facAmt");
		this.hashFields.put("ddct_amt", "ddctAmt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("ff_cd", "ffCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("com_ii", "comIi");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("sail_arr_dt", "sailArrDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("net_amt", "netAmt");
		this.hashFields.put("pol_cd", "polCd");
		this.hashFields.put("comm_apro_no", "commAproNo");
		this.hashFields.put("com_i", "comI");
		this.hashFields.put("ob_sls_ofc_cd", "obSlsOfcCd");
		this.hashFields.put("search_dt_fr", "searchDtFr");
		this.hashFields.put("bkg_ofc_cd", "bkgOfcCd");
		this.hashFields.put("feu", "feu");
		this.hashFields.put("calc_dt", "calcDt");
		this.hashFields.put("comm_vvd", "commVvd");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("ts_amt", "tsAmt");
		this.hashFields.put("apro_dt", "aproDt");
		this.hashFields.put("clt_frt_amt", "cltFrtAmt");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("teu", "teu");
		this.hashFields.put("soc_amt", "socAmt");
		this.hashFields.put("por_cd", "porCd");
		this.hashFields.put("curr_cd", "currCd");
		this.hashFields.put("sts_option", "stsOption");
		this.hashFields.put("search_dt_to", "searchDtTo");
		this.hashFields.put("brokerage_amt", "brokerageAmt");
		this.hashFields.put("chf_amt", "chfAmt");
		this.hashFields.put("pymt_amt", "pymtAmt");
		this.hashFields.put("ff_name", "ffName");
		this.hashFields.put("agn_cd", "agnCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cross_amt", "crossAmt");
		this.hashFields.put("s_rlane_cd", "sRlaneCd");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("pan_code", "panCode");
		this.hashFields.put("gross_amt", "grossAmt");
		this.hashFields.put("rqst_dt", "rqstDt");
		this.hashFields.put("pagerowsper", "pagerowsper");
		this.hashFields.put("ff_addr", "ffAddr");
		this.hashFields.put("tr_amt", "trAmt");
		this.hashFields.put("ppd_otr_amt", "ppdOtrAmt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("teu_feu", "teuFeu");
		this.hashFields.put("ar_ofc_cd", "arOfcCd");
		this.hashFields.put("bro_addr4", "broAddr4");
		this.hashFields.put("inv_no", "invNo");
		this.hashFields.put("s_trd_cd", "sTrdCd");
		this.hashFields.put("bro_addr5", "broAddr5");
		this.hashFields.put("usd_amt", "usdAmt");
		this.hashFields.put("bro_addr6", "broAddr6");
		this.hashFields.put("doc_amt", "docAmt");
		this.hashFields.put("bro_addr1", "broAddr1");
		this.hashFields.put("bro_addr2", "broAddr2");
		this.hashFields.put("bro_addr3", "broAddr3");
		this.hashFields.put("ppd_frt_amt", "ppdFrtAmt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ifDt
	 */
	public String getIfDt() {
		return this.ifDt;
	}
	
	/**
	 * Column Info
	 * @return colNm
	 */
	public String getColNm() {
		return this.colNm;
	}
	
	/**
	 * Column Info
	 * @return pagerowstot
	 */
	public String getPagerowstot() {
		return this.pagerowstot;
	}
	
	/**
	 * Column Info
	 * @return cltOtrAmt
	 */
	public String getCltOtrAmt() {
		return this.cltOtrAmt;
	}
	
	/**
	 * Column Info
	 * @return sDirCd
	 */
	public String getSDirCd() {
		return this.sDirCd;
	}
	
	/**
	 * Column Info
	 * @return facAmt
	 */
	public String getFacAmt() {
		return this.facAmt;
	}
	
	/**
	 * Column Info
	 * @return ddctAmt
	 */
	public String getDdctAmt() {
		return this.ddctAmt;
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
	 * @return ffCd
	 */
	public String getFfCd() {
		return this.ffCd;
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
	 * @return comIi
	 */
	public String getComIi() {
		return this.comIi;
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
	 * @return sailArrDt
	 */
	public String getSailArrDt() {
		return this.sailArrDt;
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
	 * @return netAmt
	 */
	public String getNetAmt() {
		return this.netAmt;
	}
	
	/**
	 * Column Info
	 * @return polCd
	 */
	public String getPolCd() {
		return this.polCd;
	}
	
	/**
	 * Column Info
	 * @return commAproNo
	 */
	public String getCommAproNo() {
		return this.commAproNo;
	}
	
	/**
	 * Column Info
	 * @return comI
	 */
	public String getComI() {
		return this.comI;
	}
	
	/**
	 * Column Info
	 * @return obSlsOfcCd
	 */
	public String getObSlsOfcCd() {
		return this.obSlsOfcCd;
	}
	
	/**
	 * Column Info
	 * @return searchDtFr
	 */
	public String getSearchDtFr() {
		return this.searchDtFr;
	}
	
	/**
	 * Column Info
	 * @return bkgOfcCd
	 */
	public String getBkgOfcCd() {
		return this.bkgOfcCd;
	}
	
	/**
	 * Column Info
	 * @return feu
	 */
	public String getFeu() {
		return this.feu;
	}
	
	/**
	 * Column Info
	 * @return calcDt
	 */
	public String getCalcDt() {
		return this.calcDt;
	}
	
	/**
	 * Column Info
	 * @return commVvd
	 */
	public String getCommVvd() {
		return this.commVvd;
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
	 * @return tsAmt
	 */
	public String getTsAmt() {
		return this.tsAmt;
	}
	
	/**
	 * Column Info
	 * @return aproDt
	 */
	public String getAproDt() {
		return this.aproDt;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
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
	 * @return teu
	 */
	public String getTeu() {
		return this.teu;
	}
	
	/**
	 * Column Info
	 * @return socAmt
	 */
	public String getSocAmt() {
		return this.socAmt;
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
	 * @return currCd
	 */
	public String getCurrCd() {
		return this.currCd;
	}
	
	/**
	 * Column Info
	 * @return stsOption
	 */
	public String getStsOption() {
		return this.stsOption;
	}
	
	/**
	 * Column Info
	 * @return searchDtTo
	 */
	public String getSearchDtTo() {
		return this.searchDtTo;
	}
	
	/**
	 * Column Info
	 * @return brokerageAmt
	 */
	public String getBrokerageAmt() {
		return this.brokerageAmt;
	}
	
	/**
	 * Column Info
	 * @return chfAmt
	 */
	public String getChfAmt() {
		return this.chfAmt;
	}
	
	/**
	 * Column Info
	 * @return pymtAmt
	 */
	public String getPymtAmt() {
		return this.pymtAmt;
	}
	
	/**
	 * Column Info
	 * @return ffName
	 */
	public String getFfName() {
		return this.ffName;
	}
	
	/**
	 * Column Info
	 * @return agnCd
	 */
	public String getAgnCd() {
		return this.agnCd;
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
	 * @return crossAmt
	 */
	public String getCrossAmt() {
		return this.crossAmt;
	}
	
	/**
	 * Column Info
	 * @return sRlaneCd
	 */
	public String getSRlaneCd() {
		return this.sRlaneCd;
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
	 * @return panCode
	 */
	public String getPanCode() {
		return this.panCode;
	}
	
	/**
	 * Column Info
	 * @return grossAmt
	 */
	public String getGrossAmt() {
		return this.grossAmt;
	}
	
	/**
	 * Column Info
	 * @return rqstDt
	 */
	public String getRqstDt() {
		return this.rqstDt;
	}
	
	/**
	 * Column Info
	 * @return pagerowsper
	 */
	public String getPagerowsper() {
		return this.pagerowsper;
	}
	
	/**
	 * Column Info
	 * @return ffAddr
	 */
	public String getFfAddr() {
		return this.ffAddr;
	}
	
	/**
	 * Column Info
	 * @return trAmt
	 */
	public String getTrAmt() {
		return this.trAmt;
	}
	
	/**
	 * Column Info
	 * @return ppdOtrAmt
	 */
	public String getPpdOtrAmt() {
		return this.ppdOtrAmt;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return teuFeu
	 */
	public String getTeuFeu() {
		return this.teuFeu;
	}
	
	/**
	 * Column Info
	 * @return arOfcCd
	 */
	public String getArOfcCd() {
		return this.arOfcCd;
	}
	
	/**
	 * Column Info
	 * @return broAddr4
	 */
	public String getBroAddr4() {
		return this.broAddr4;
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
	 * @return sTrdCd
	 */
	public String getSTrdCd() {
		return this.sTrdCd;
	}
	
	/**
	 * Column Info
	 * @return broAddr5
	 */
	public String getBroAddr5() {
		return this.broAddr5;
	}
	
	/**
	 * Column Info
	 * @return usdAmt
	 */
	public String getUsdAmt() {
		return this.usdAmt;
	}
	
	/**
	 * Column Info
	 * @return broAddr6
	 */
	public String getBroAddr6() {
		return this.broAddr6;
	}
	
	/**
	 * Column Info
	 * @return docAmt
	 */
	public String getDocAmt() {
		return this.docAmt;
	}
	
	/**
	 * Column Info
	 * @return broAddr1
	 */
	public String getBroAddr1() {
		return this.broAddr1;
	}
	
	/**
	 * Column Info
	 * @return broAddr2
	 */
	public String getBroAddr2() {
		return this.broAddr2;
	}
	
	/**
	 * Column Info
	 * @return broAddr3
	 */
	public String getBroAddr3() {
		return this.broAddr3;
	}
	
	/**
	 * Column Info
	 * @return ppdFrtAmt
	 */
	public String getPpdFrtAmt() {
		return this.ppdFrtAmt;
	}
	

	/**
	 * Column Info
	 * @param ifDt
	 */
	public void setIfDt(String ifDt) {
		this.ifDt = ifDt;
	}
	
	/**
	 * Column Info
	 * @param colNm
	 */
	public void setColNm(String colNm) {
		this.colNm = colNm;
	}
	
	/**
	 * Column Info
	 * @param pagerowstot
	 */
	public void setPagerowstot(String pagerowstot) {
		this.pagerowstot = pagerowstot;
	}
	
	/**
	 * Column Info
	 * @param cltOtrAmt
	 */
	public void setCltOtrAmt(String cltOtrAmt) {
		this.cltOtrAmt = cltOtrAmt;
	}
	
	/**
	 * Column Info
	 * @param sDirCd
	 */
	public void setSDirCd(String sDirCd) {
		this.sDirCd = sDirCd;
	}
	
	/**
	 * Column Info
	 * @param facAmt
	 */
	public void setFacAmt(String facAmt) {
		this.facAmt = facAmt;
	}
	
	/**
	 * Column Info
	 * @param ddctAmt
	 */
	public void setDdctAmt(String ddctAmt) {
		this.ddctAmt = ddctAmt;
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
	 * @param ffCd
	 */
	public void setFfCd(String ffCd) {
		this.ffCd = ffCd;
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
	 * @param comIi
	 */
	public void setComIi(String comIi) {
		this.comIi = comIi;
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
	 * @param sailArrDt
	 */
	public void setSailArrDt(String sailArrDt) {
		this.sailArrDt = sailArrDt;
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
	 * @param netAmt
	 */
	public void setNetAmt(String netAmt) {
		this.netAmt = netAmt;
	}
	
	/**
	 * Column Info
	 * @param polCd
	 */
	public void setPolCd(String polCd) {
		this.polCd = polCd;
	}
	
	/**
	 * Column Info
	 * @param commAproNo
	 */
	public void setCommAproNo(String commAproNo) {
		this.commAproNo = commAproNo;
	}
	
	/**
	 * Column Info
	 * @param comI
	 */
	public void setComI(String comI) {
		this.comI = comI;
	}
	
	/**
	 * Column Info
	 * @param obSlsOfcCd
	 */
	public void setObSlsOfcCd(String obSlsOfcCd) {
		this.obSlsOfcCd = obSlsOfcCd;
	}
	
	/**
	 * Column Info
	 * @param searchDtFr
	 */
	public void setSearchDtFr(String searchDtFr) {
		this.searchDtFr = searchDtFr;
	}
	
	/**
	 * Column Info
	 * @param bkgOfcCd
	 */
	public void setBkgOfcCd(String bkgOfcCd) {
		this.bkgOfcCd = bkgOfcCd;
	}
	
	/**
	 * Column Info
	 * @param feu
	 */
	public void setFeu(String feu) {
		this.feu = feu;
	}
	
	/**
	 * Column Info
	 * @param calcDt
	 */
	public void setCalcDt(String calcDt) {
		this.calcDt = calcDt;
	}
	
	/**
	 * Column Info
	 * @param commVvd
	 */
	public void setCommVvd(String commVvd) {
		this.commVvd = commVvd;
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
	 * @param tsAmt
	 */
	public void setTsAmt(String tsAmt) {
		this.tsAmt = tsAmt;
	}
	
	/**
	 * Column Info
	 * @param aproDt
	 */
	public void setAproDt(String aproDt) {
		this.aproDt = aproDt;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
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
	 * @param teu
	 */
	public void setTeu(String teu) {
		this.teu = teu;
	}
	
	/**
	 * Column Info
	 * @param socAmt
	 */
	public void setSocAmt(String socAmt) {
		this.socAmt = socAmt;
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
	 * @param currCd
	 */
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	
	/**
	 * Column Info
	 * @param stsOption
	 */
	public void setStsOption(String stsOption) {
		this.stsOption = stsOption;
	}
	
	/**
	 * Column Info
	 * @param searchDtTo
	 */
	public void setSearchDtTo(String searchDtTo) {
		this.searchDtTo = searchDtTo;
	}
	
	/**
	 * Column Info
	 * @param brokerageAmt
	 */
	public void setBrokerageAmt(String brokerageAmt) {
		this.brokerageAmt = brokerageAmt;
	}
	
	/**
	 * Column Info
	 * @param chfAmt
	 */
	public void setChfAmt(String chfAmt) {
		this.chfAmt = chfAmt;
	}
	
	/**
	 * Column Info
	 * @param pymtAmt
	 */
	public void setPymtAmt(String pymtAmt) {
		this.pymtAmt = pymtAmt;
	}
	
	/**
	 * Column Info
	 * @param ffName
	 */
	public void setFfName(String ffName) {
		this.ffName = ffName;
	}
	
	/**
	 * Column Info
	 * @param agnCd
	 */
	public void setAgnCd(String agnCd) {
		this.agnCd = agnCd;
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
	 * @param crossAmt
	 */
	public void setCrossAmt(String crossAmt) {
		this.crossAmt = crossAmt;
	}
	
	/**
	 * Column Info
	 * @param sRlaneCd
	 */
	public void setSRlaneCd(String sRlaneCd) {
		this.sRlaneCd = sRlaneCd;
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
	 * @param panCode
	 */
	public void setPanCode(String panCode) {
		this.panCode = panCode;
	}
	
	/**
	 * Column Info
	 * @param grossAmt
	 */
	public void setGrossAmt(String grossAmt) {
		this.grossAmt = grossAmt;
	}
	
	/**
	 * Column Info
	 * @param rqstDt
	 */
	public void setRqstDt(String rqstDt) {
		this.rqstDt = rqstDt;
	}
	
	/**
	 * Column Info
	 * @param pagerowsper
	 */
	public void setPagerowsper(String pagerowsper) {
		this.pagerowsper = pagerowsper;
	}
	
	/**
	 * Column Info
	 * @param ffAddr
	 */
	public void setFfAddr(String ffAddr) {
		this.ffAddr = ffAddr;
	}
	
	/**
	 * Column Info
	 * @param trAmt
	 */
	public void setTrAmt(String trAmt) {
		this.trAmt = trAmt;
	}
	
	/**
	 * Column Info
	 * @param ppdOtrAmt
	 */
	public void setPpdOtrAmt(String ppdOtrAmt) {
		this.ppdOtrAmt = ppdOtrAmt;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param teuFeu
	 */
	public void setTeuFeu(String teuFeu) {
		this.teuFeu = teuFeu;
	}
	
	/**
	 * Column Info
	 * @param arOfcCd
	 */
	public void setArOfcCd(String arOfcCd) {
		this.arOfcCd = arOfcCd;
	}
	
	/**
	 * Column Info
	 * @param broAddr4
	 */
	public void setBroAddr4(String broAddr4) {
		this.broAddr4 = broAddr4;
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
	 * @param sTrdCd
	 */
	public void setSTrdCd(String sTrdCd) {
		this.sTrdCd = sTrdCd;
	}
	
	/**
	 * Column Info
	 * @param broAddr5
	 */
	public void setBroAddr5(String broAddr5) {
		this.broAddr5 = broAddr5;
	}
	
	/**
	 * Column Info
	 * @param usdAmt
	 */
	public void setUsdAmt(String usdAmt) {
		this.usdAmt = usdAmt;
	}
	
	/**
	 * Column Info
	 * @param broAddr6
	 */
	public void setBroAddr6(String broAddr6) {
		this.broAddr6 = broAddr6;
	}
	
	/**
	 * Column Info
	 * @param docAmt
	 */
	public void setDocAmt(String docAmt) {
		this.docAmt = docAmt;
	}
	
	/**
	 * Column Info
	 * @param broAddr1
	 */
	public void setBroAddr1(String broAddr1) {
		this.broAddr1 = broAddr1;
	}
	
	/**
	 * Column Info
	 * @param broAddr2
	 */
	public void setBroAddr2(String broAddr2) {
		this.broAddr2 = broAddr2;
	}
	
	/**
	 * Column Info
	 * @param broAddr3
	 */
	public void setBroAddr3(String broAddr3) {
		this.broAddr3 = broAddr3;
	}
	
	/**
	 * Column Info
	 * @param ppdFrtAmt
	 */
	public void setPpdFrtAmt(String ppdFrtAmt) {
		this.ppdFrtAmt = ppdFrtAmt;
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
		setIfDt(JSPUtil.getParameter(request, prefix + "if_dt", ""));
		setColNm(JSPUtil.getParameter(request, prefix + "col_nm", ""));
		setPagerowstot(JSPUtil.getParameter(request, prefix + "pagerowstot", ""));
		setCltOtrAmt(JSPUtil.getParameter(request, prefix + "clt_otr_amt", ""));
		setSDirCd(JSPUtil.getParameter(request, prefix + "s_dir_cd", ""));
		setFacAmt(JSPUtil.getParameter(request, prefix + "fac_amt", ""));
		setDdctAmt(JSPUtil.getParameter(request, prefix + "ddct_amt", ""));
		setTrdCd(JSPUtil.getParameter(request, prefix + "trd_cd", ""));
		setFfCd(JSPUtil.getParameter(request, prefix + "ff_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, prefix + "rlane_cd", ""));
		setComIi(JSPUtil.getParameter(request, prefix + "com_ii", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setSailArrDt(JSPUtil.getParameter(request, prefix + "sail_arr_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setNetAmt(JSPUtil.getParameter(request, prefix + "net_amt", ""));
		setPolCd(JSPUtil.getParameter(request, prefix + "pol_cd", ""));
		setCommAproNo(JSPUtil.getParameter(request, prefix + "comm_apro_no", ""));
		setComI(JSPUtil.getParameter(request, prefix + "com_i", ""));
		setObSlsOfcCd(JSPUtil.getParameter(request, prefix + "ob_sls_ofc_cd", ""));
		setSearchDtFr(JSPUtil.getParameter(request, prefix + "search_dt_fr", ""));
		setBkgOfcCd(JSPUtil.getParameter(request, prefix + "bkg_ofc_cd", ""));
		setFeu(JSPUtil.getParameter(request, prefix + "feu", ""));
		setCalcDt(JSPUtil.getParameter(request, prefix + "calc_dt", ""));
		setCommVvd(JSPUtil.getParameter(request, prefix + "comm_vvd", ""));
		setDelCd(JSPUtil.getParameter(request, prefix + "del_cd", ""));
		setTsAmt(JSPUtil.getParameter(request, prefix + "ts_amt", ""));
		setAproDt(JSPUtil.getParameter(request, prefix + "apro_dt", ""));
		setCltFrtAmt(JSPUtil.getParameter(request, prefix + "clt_frt_amt", ""));
		setPodCd(JSPUtil.getParameter(request, prefix + "pod_cd", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setTeu(JSPUtil.getParameter(request, prefix + "teu", ""));
		setSocAmt(JSPUtil.getParameter(request, prefix + "soc_amt", ""));
		setPorCd(JSPUtil.getParameter(request, prefix + "por_cd", ""));
		setCurrCd(JSPUtil.getParameter(request, prefix + "curr_cd", ""));
		setStsOption(JSPUtil.getParameter(request, prefix + "sts_option", ""));
		setSearchDtTo(JSPUtil.getParameter(request, prefix + "search_dt_to", ""));
		setBrokerageAmt(JSPUtil.getParameter(request, prefix + "brokerage_amt", ""));
		setChfAmt(JSPUtil.getParameter(request, prefix + "chf_amt", ""));
		setPymtAmt(JSPUtil.getParameter(request, prefix + "pymt_amt", ""));
		setFfName(JSPUtil.getParameter(request, prefix + "ff_name", ""));
		setAgnCd(JSPUtil.getParameter(request, prefix + "agn_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCrossAmt(JSPUtil.getParameter(request, prefix + "cross_amt", ""));
		setSRlaneCd(JSPUtil.getParameter(request, prefix + "s_rlane_cd", ""));
		setDirCd(JSPUtil.getParameter(request, prefix + "dir_cd", ""));
		setPanCode(JSPUtil.getParameter(request, prefix + "pan_code", ""));
		setGrossAmt(JSPUtil.getParameter(request, prefix + "gross_amt", ""));
		setRqstDt(JSPUtil.getParameter(request, prefix + "rqst_dt", ""));
		setPagerowsper(JSPUtil.getParameter(request, prefix + "pagerowsper", ""));
		setFfAddr(JSPUtil.getParameter(request, prefix + "ff_addr", ""));
		setTrAmt(JSPUtil.getParameter(request, prefix + "tr_amt", ""));
		setPpdOtrAmt(JSPUtil.getParameter(request, prefix + "ppd_otr_amt", ""));
		setIoBndCd(JSPUtil.getParameter(request, prefix + "io_bnd_cd", ""));
		setTeuFeu(JSPUtil.getParameter(request, prefix + "teu_feu", ""));
		setArOfcCd(JSPUtil.getParameter(request, prefix + "ar_ofc_cd", ""));
		setBroAddr4(JSPUtil.getParameter(request, prefix + "bro_addr4", ""));
		setInvNo(JSPUtil.getParameter(request, prefix + "inv_no", ""));
		setSTrdCd(JSPUtil.getParameter(request, prefix + "s_trd_cd", ""));
		setBroAddr5(JSPUtil.getParameter(request, prefix + "bro_addr5", ""));
		setUsdAmt(JSPUtil.getParameter(request, prefix + "usd_amt", ""));
		setBroAddr6(JSPUtil.getParameter(request, prefix + "bro_addr6", ""));
		setDocAmt(JSPUtil.getParameter(request, prefix + "doc_amt", ""));
		setBroAddr1(JSPUtil.getParameter(request, prefix + "bro_addr1", ""));
		setBroAddr2(JSPUtil.getParameter(request, prefix + "bro_addr2", ""));
		setBroAddr3(JSPUtil.getParameter(request, prefix + "bro_addr3", ""));
		setPpdFrtAmt(JSPUtil.getParameter(request, prefix + "ppd_frt_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtCommBkgInfoVO[]
	 */
	public AgtCommBkgInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtCommBkgInfoVO[]
	 */
	public AgtCommBkgInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtCommBkgInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ifDt = (JSPUtil.getParameter(request, prefix	+ "if_dt", length));
			String[] colNm = (JSPUtil.getParameter(request, prefix	+ "col_nm", length));
			String[] pagerowstot = (JSPUtil.getParameter(request, prefix	+ "pagerowstot", length));
			String[] cltOtrAmt = (JSPUtil.getParameter(request, prefix	+ "clt_otr_amt", length));
			String[] sDirCd = (JSPUtil.getParameter(request, prefix	+ "s_dir_cd", length));
			String[] facAmt = (JSPUtil.getParameter(request, prefix	+ "fac_amt", length));
			String[] ddctAmt = (JSPUtil.getParameter(request, prefix	+ "ddct_amt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] ffCd = (JSPUtil.getParameter(request, prefix	+ "ff_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] comIi = (JSPUtil.getParameter(request, prefix	+ "com_ii", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] sailArrDt = (JSPUtil.getParameter(request, prefix	+ "sail_arr_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] netAmt = (JSPUtil.getParameter(request, prefix	+ "net_amt", length));
			String[] polCd = (JSPUtil.getParameter(request, prefix	+ "pol_cd", length));
			String[] commAproNo = (JSPUtil.getParameter(request, prefix	+ "comm_apro_no", length));
			String[] comI = (JSPUtil.getParameter(request, prefix	+ "com_i", length));
			String[] obSlsOfcCd = (JSPUtil.getParameter(request, prefix	+ "ob_sls_ofc_cd", length));
			String[] searchDtFr = (JSPUtil.getParameter(request, prefix	+ "search_dt_fr", length));
			String[] bkgOfcCd = (JSPUtil.getParameter(request, prefix	+ "bkg_ofc_cd", length));
			String[] feu = (JSPUtil.getParameter(request, prefix	+ "feu", length));
			String[] calcDt = (JSPUtil.getParameter(request, prefix	+ "calc_dt", length));
			String[] commVvd = (JSPUtil.getParameter(request, prefix	+ "comm_vvd", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] tsAmt = (JSPUtil.getParameter(request, prefix	+ "ts_amt", length));
			String[] aproDt = (JSPUtil.getParameter(request, prefix	+ "apro_dt", length));
			String[] cltFrtAmt = (JSPUtil.getParameter(request, prefix	+ "clt_frt_amt", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] teu = (JSPUtil.getParameter(request, prefix	+ "teu", length));
			String[] socAmt = (JSPUtil.getParameter(request, prefix	+ "soc_amt", length));
			String[] porCd = (JSPUtil.getParameter(request, prefix	+ "por_cd", length));
			String[] currCd = (JSPUtil.getParameter(request, prefix	+ "curr_cd", length));
			String[] stsOption = (JSPUtil.getParameter(request, prefix	+ "sts_option", length));
			String[] searchDtTo = (JSPUtil.getParameter(request, prefix	+ "search_dt_to", length));
			String[] brokerageAmt = (JSPUtil.getParameter(request, prefix	+ "brokerage_amt", length));
			String[] chfAmt = (JSPUtil.getParameter(request, prefix	+ "chf_amt", length));
			String[] pymtAmt = (JSPUtil.getParameter(request, prefix	+ "pymt_amt", length));
			String[] ffName = (JSPUtil.getParameter(request, prefix	+ "ff_name", length));
			String[] agnCd = (JSPUtil.getParameter(request, prefix	+ "agn_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] crossAmt = (JSPUtil.getParameter(request, prefix	+ "cross_amt", length));
			String[] sRlaneCd = (JSPUtil.getParameter(request, prefix	+ "s_rlane_cd", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] panCode = (JSPUtil.getParameter(request, prefix	+ "pan_code", length));
			String[] grossAmt = (JSPUtil.getParameter(request, prefix	+ "gross_amt", length));
			String[] rqstDt = (JSPUtil.getParameter(request, prefix	+ "rqst_dt", length));
			String[] pagerowsper = (JSPUtil.getParameter(request, prefix	+ "pagerowsper", length));
			String[] ffAddr = (JSPUtil.getParameter(request, prefix	+ "ff_addr", length));
			String[] trAmt = (JSPUtil.getParameter(request, prefix	+ "tr_amt", length));
			String[] ppdOtrAmt = (JSPUtil.getParameter(request, prefix	+ "ppd_otr_amt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] teuFeu = (JSPUtil.getParameter(request, prefix	+ "teu_feu", length));
			String[] arOfcCd = (JSPUtil.getParameter(request, prefix	+ "ar_ofc_cd", length));
			String[] broAddr4 = (JSPUtil.getParameter(request, prefix	+ "bro_addr4", length));
			String[] invNo = (JSPUtil.getParameter(request, prefix	+ "inv_no", length));
			String[] sTrdCd = (JSPUtil.getParameter(request, prefix	+ "s_trd_cd", length));
			String[] broAddr5 = (JSPUtil.getParameter(request, prefix	+ "bro_addr5", length));
			String[] usdAmt = (JSPUtil.getParameter(request, prefix	+ "usd_amt", length));
			String[] broAddr6 = (JSPUtil.getParameter(request, prefix	+ "bro_addr6", length));
			String[] docAmt = (JSPUtil.getParameter(request, prefix	+ "doc_amt", length));
			String[] broAddr1 = (JSPUtil.getParameter(request, prefix	+ "bro_addr1", length));
			String[] broAddr2 = (JSPUtil.getParameter(request, prefix	+ "bro_addr2", length));
			String[] broAddr3 = (JSPUtil.getParameter(request, prefix	+ "bro_addr3", length));
			String[] ppdFrtAmt = (JSPUtil.getParameter(request, prefix	+ "ppd_frt_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtCommBkgInfoVO();
				if (ifDt[i] != null)
					model.setIfDt(ifDt[i]);
				if (colNm[i] != null)
					model.setColNm(colNm[i]);
				if (pagerowstot[i] != null)
					model.setPagerowstot(pagerowstot[i]);
				if (cltOtrAmt[i] != null)
					model.setCltOtrAmt(cltOtrAmt[i]);
				if (sDirCd[i] != null)
					model.setSDirCd(sDirCd[i]);
				if (facAmt[i] != null)
					model.setFacAmt(facAmt[i]);
				if (ddctAmt[i] != null)
					model.setDdctAmt(ddctAmt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (ffCd[i] != null)
					model.setFfCd(ffCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (comIi[i] != null)
					model.setComIi(comIi[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (sailArrDt[i] != null)
					model.setSailArrDt(sailArrDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (netAmt[i] != null)
					model.setNetAmt(netAmt[i]);
				if (polCd[i] != null)
					model.setPolCd(polCd[i]);
				if (commAproNo[i] != null)
					model.setCommAproNo(commAproNo[i]);
				if (comI[i] != null)
					model.setComI(comI[i]);
				if (obSlsOfcCd[i] != null)
					model.setObSlsOfcCd(obSlsOfcCd[i]);
				if (searchDtFr[i] != null)
					model.setSearchDtFr(searchDtFr[i]);
				if (bkgOfcCd[i] != null)
					model.setBkgOfcCd(bkgOfcCd[i]);
				if (feu[i] != null)
					model.setFeu(feu[i]);
				if (calcDt[i] != null)
					model.setCalcDt(calcDt[i]);
				if (commVvd[i] != null)
					model.setCommVvd(commVvd[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (tsAmt[i] != null)
					model.setTsAmt(tsAmt[i]);
				if (aproDt[i] != null)
					model.setAproDt(aproDt[i]);
				if (cltFrtAmt[i] != null)
					model.setCltFrtAmt(cltFrtAmt[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (teu[i] != null)
					model.setTeu(teu[i]);
				if (socAmt[i] != null)
					model.setSocAmt(socAmt[i]);
				if (porCd[i] != null)
					model.setPorCd(porCd[i]);
				if (currCd[i] != null)
					model.setCurrCd(currCd[i]);
				if (stsOption[i] != null)
					model.setStsOption(stsOption[i]);
				if (searchDtTo[i] != null)
					model.setSearchDtTo(searchDtTo[i]);
				if (brokerageAmt[i] != null)
					model.setBrokerageAmt(brokerageAmt[i]);
				if (chfAmt[i] != null)
					model.setChfAmt(chfAmt[i]);
				if (pymtAmt[i] != null)
					model.setPymtAmt(pymtAmt[i]);
				if (ffName[i] != null)
					model.setFfName(ffName[i]);
				if (agnCd[i] != null)
					model.setAgnCd(agnCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (crossAmt[i] != null)
					model.setCrossAmt(crossAmt[i]);
				if (sRlaneCd[i] != null)
					model.setSRlaneCd(sRlaneCd[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (panCode[i] != null)
					model.setPanCode(panCode[i]);
				if (grossAmt[i] != null)
					model.setGrossAmt(grossAmt[i]);
				if (rqstDt[i] != null)
					model.setRqstDt(rqstDt[i]);
				if (pagerowsper[i] != null)
					model.setPagerowsper(pagerowsper[i]);
				if (ffAddr[i] != null)
					model.setFfAddr(ffAddr[i]);
				if (trAmt[i] != null)
					model.setTrAmt(trAmt[i]);
				if (ppdOtrAmt[i] != null)
					model.setPpdOtrAmt(ppdOtrAmt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (teuFeu[i] != null)
					model.setTeuFeu(teuFeu[i]);
				if (arOfcCd[i] != null)
					model.setArOfcCd(arOfcCd[i]);
				if (broAddr4[i] != null)
					model.setBroAddr4(broAddr4[i]);
				if (invNo[i] != null)
					model.setInvNo(invNo[i]);
				if (sTrdCd[i] != null)
					model.setSTrdCd(sTrdCd[i]);
				if (broAddr5[i] != null)
					model.setBroAddr5(broAddr5[i]);
				if (usdAmt[i] != null)
					model.setUsdAmt(usdAmt[i]);
				if (broAddr6[i] != null)
					model.setBroAddr6(broAddr6[i]);
				if (docAmt[i] != null)
					model.setDocAmt(docAmt[i]);
				if (broAddr1[i] != null)
					model.setBroAddr1(broAddr1[i]);
				if (broAddr2[i] != null)
					model.setBroAddr2(broAddr2[i]);
				if (broAddr3[i] != null)
					model.setBroAddr3(broAddr3[i]);
				if (ppdFrtAmt[i] != null)
					model.setPpdFrtAmt(ppdFrtAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtCommBkgInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtCommBkgInfoVO[]
	 */
	public AgtCommBkgInfoVO[] getAgtCommBkgInfoVOs(){
		AgtCommBkgInfoVO[] vos = (AgtCommBkgInfoVO[])models.toArray(new AgtCommBkgInfoVO[models.size()]);
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
		this.ifDt = this.ifDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.colNm = this.colNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerowstot = this.pagerowstot .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltOtrAmt = this.cltOtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sDirCd = this.sDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.facAmt = this.facAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ddctAmt = this.ddctAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffCd = this.ffCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comIi = this.comIi .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sailArrDt = this.sailArrDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.netAmt = this.netAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.polCd = this.polCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commAproNo = this.commAproNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.comI = this.comI .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obSlsOfcCd = this.obSlsOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.searchDtFr = this.searchDtFr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOfcCd = this.bkgOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.feu = this.feu .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.calcDt = this.calcDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.commVvd = this.commVvd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tsAmt = this.tsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproDt = this.aproDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cltFrtAmt = this.cltFrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.teu = this.teu .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.socAmt = this.socAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.porCd = this.porCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.currCd = this.currCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stsOption = this.stsOption .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.searchDtTo = this.searchDtTo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brokerageAmt = this.brokerageAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chfAmt = this.chfAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pymtAmt = this.pymtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffName = this.ffName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCd = this.agnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crossAmt = this.crossAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sRlaneCd = this.sRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.panCode = this.panCode .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grossAmt = this.grossAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rqstDt = this.rqstDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerowsper = this.pagerowsper .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ffAddr = this.ffAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trAmt = this.trAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdOtrAmt = this.ppdOtrAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.teuFeu = this.teuFeu .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arOfcCd = this.arOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.broAddr4 = this.broAddr4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.invNo = this.invNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sTrdCd = this.sTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.broAddr5 = this.broAddr5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usdAmt = this.usdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.broAddr6 = this.broAddr6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docAmt = this.docAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.broAddr1 = this.broAddr1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.broAddr2 = this.broAddr2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.broAddr3 = this.broAddr3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ppdFrtAmt = this.ppdFrtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
