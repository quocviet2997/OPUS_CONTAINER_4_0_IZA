/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : SearchYardListVO.java
*@FileTitle : SearchYardListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.03.07
*@LastModifier : 
*@LastVersion : 1.0
* 2011.03.07  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.bcm.sup.setupmanagement.setupcreation.vo;

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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SearchYardListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SearchYardListVO> models = new ArrayList<SearchYardListVO>();
	
	/* Column Info */
	private String slanCd3 = null;
	/* Column Info */
	private String slanCd4 = null;
	/* Column Info */
	private String slanCd5 = null;
	/* Column Info */
	private String slanCd6 = null;
	/* Column Info */
	private String mtyRlseEdiFlg = null;
	/* Column Info */
	private String slanCd1 = null;
	/* Column Info */
	private String slanCd2 = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String preTsFlg = null;
	/* Column Info */
	private String pstTsAckFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ediRcvId = null;
	/* Column Info */
	private String portCd = null;
	/* Column Info */
	private String slanCd8 = null;
	/* Column Info */
	private String slanCd7 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String slanCd9 = null;
	/* Column Info */
	private String bkgAutoEdiFlg = null;
	/* Column Info */
	private String ediSndId = null;
	/* Column Info */
	private String slanCd10 = null;
	/* Column Info */
	private String pstTsFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ydCd = null;
	/* Column Info */
	private String bkgYdTpCd = null;
	/* Column Info */
	private String fullRlseEdiCd = null;
	/* Column Info */
	private String bkgMnlEdiFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SearchYardListVO() {}

	public SearchYardListVO(String ibflag, String pagerows, String ydCd, String bkgYdTpCd, String portCd, String ediRcvId, String slanCd1, String slanCd2, String slanCd3, String slanCd4, String slanCd5, String slanCd6, String slanCd7, String slanCd8, String slanCd9, String slanCd10, String bkgAutoEdiFlg, String mtyRlseEdiFlg, String ediSndId, String fullRlseEdiCd, String bkgMnlEdiFlg, String preTsFlg, String pstTsFlg, String pstTsAckFlg, String creUsrId, String updUsrId) {
		this.slanCd3 = slanCd3;
		this.slanCd4 = slanCd4;
		this.slanCd5 = slanCd5;
		this.slanCd6 = slanCd6;
		this.mtyRlseEdiFlg = mtyRlseEdiFlg;
		this.slanCd1 = slanCd1;
		this.slanCd2 = slanCd2;
		this.pagerows = pagerows;
		this.preTsFlg = preTsFlg;
		this.pstTsAckFlg = pstTsAckFlg;
		this.ibflag = ibflag;
		this.ediRcvId = ediRcvId;
		this.portCd = portCd;
		this.slanCd8 = slanCd8;
		this.slanCd7 = slanCd7;
		this.updUsrId = updUsrId;
		this.slanCd9 = slanCd9;
		this.bkgAutoEdiFlg = bkgAutoEdiFlg;
		this.ediSndId = ediSndId;
		this.slanCd10 = slanCd10;
		this.pstTsFlg = pstTsFlg;
		this.creUsrId = creUsrId;
		this.ydCd = ydCd;
		this.bkgYdTpCd = bkgYdTpCd;
		this.fullRlseEdiCd = fullRlseEdiCd;
		this.bkgMnlEdiFlg = bkgMnlEdiFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("slan_cd3", getSlanCd3());
		this.hashColumns.put("slan_cd4", getSlanCd4());
		this.hashColumns.put("slan_cd5", getSlanCd5());
		this.hashColumns.put("slan_cd6", getSlanCd6());
		this.hashColumns.put("mty_rlse_edi_flg", getMtyRlseEdiFlg());
		this.hashColumns.put("slan_cd1", getSlanCd1());
		this.hashColumns.put("slan_cd2", getSlanCd2());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pre_ts_flg", getPreTsFlg());
		this.hashColumns.put("pst_ts_ack_flg", getPstTsAckFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edi_rcv_id", getEdiRcvId());
		this.hashColumns.put("port_cd", getPortCd());
		this.hashColumns.put("slan_cd8", getSlanCd8());
		this.hashColumns.put("slan_cd7", getSlanCd7());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("slan_cd9", getSlanCd9());
		this.hashColumns.put("bkg_auto_edi_flg", getBkgAutoEdiFlg());
		this.hashColumns.put("edi_snd_id", getEdiSndId());
		this.hashColumns.put("slan_cd10", getSlanCd10());
		this.hashColumns.put("pst_ts_flg", getPstTsFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yd_cd", getYdCd());
		this.hashColumns.put("bkg_yd_tp_cd", getBkgYdTpCd());
		this.hashColumns.put("full_rlse_edi_cd", getFullRlseEdiCd());
		this.hashColumns.put("bkg_mnl_edi_flg", getBkgMnlEdiFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("slan_cd3", "slanCd3");
		this.hashFields.put("slan_cd4", "slanCd4");
		this.hashFields.put("slan_cd5", "slanCd5");
		this.hashFields.put("slan_cd6", "slanCd6");
		this.hashFields.put("mty_rlse_edi_flg", "mtyRlseEdiFlg");
		this.hashFields.put("slan_cd1", "slanCd1");
		this.hashFields.put("slan_cd2", "slanCd2");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pre_ts_flg", "preTsFlg");
		this.hashFields.put("pst_ts_ack_flg", "pstTsAckFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edi_rcv_id", "ediRcvId");
		this.hashFields.put("port_cd", "portCd");
		this.hashFields.put("slan_cd8", "slanCd8");
		this.hashFields.put("slan_cd7", "slanCd7");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("slan_cd9", "slanCd9");
		this.hashFields.put("bkg_auto_edi_flg", "bkgAutoEdiFlg");
		this.hashFields.put("edi_snd_id", "ediSndId");
		this.hashFields.put("slan_cd10", "slanCd10");
		this.hashFields.put("pst_ts_flg", "pstTsFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yd_cd", "ydCd");
		this.hashFields.put("bkg_yd_tp_cd", "bkgYdTpCd");
		this.hashFields.put("full_rlse_edi_cd", "fullRlseEdiCd");
		this.hashFields.put("bkg_mnl_edi_flg", "bkgMnlEdiFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return slanCd3
	 */
	public String getSlanCd3() {
		return this.slanCd3;
	}
	
	/**
	 * Column Info
	 * @return slanCd4
	 */
	public String getSlanCd4() {
		return this.slanCd4;
	}
	
	/**
	 * Column Info
	 * @return slanCd5
	 */
	public String getSlanCd5() {
		return this.slanCd5;
	}
	
	/**
	 * Column Info
	 * @return slanCd6
	 */
	public String getSlanCd6() {
		return this.slanCd6;
	}
	
	/**
	 * Column Info
	 * @return mtyRlseEdiFlg
	 */
	public String getMtyRlseEdiFlg() {
		return this.mtyRlseEdiFlg;
	}
	
	/**
	 * Column Info
	 * @return slanCd1
	 */
	public String getSlanCd1() {
		return this.slanCd1;
	}
	
	/**
	 * Column Info
	 * @return slanCd2
	 */
	public String getSlanCd2() {
		return this.slanCd2;
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
	 * @return preTsFlg
	 */
	public String getPreTsFlg() {
		return this.preTsFlg;
	}
	
	/**
	 * Column Info
	 * @return pstTsAckFlg
	 */
	public String getPstTsAckFlg() {
		return this.pstTsAckFlg;
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
	 * @return ediRcvId
	 */
	public String getEdiRcvId() {
		return this.ediRcvId;
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
	 * @return slanCd8
	 */
	public String getSlanCd8() {
		return this.slanCd8;
	}
	
	/**
	 * Column Info
	 * @return slanCd7
	 */
	public String getSlanCd7() {
		return this.slanCd7;
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
	 * @return slanCd9
	 */
	public String getSlanCd9() {
		return this.slanCd9;
	}
	
	/**
	 * Column Info
	 * @return bkgAutoEdiFlg
	 */
	public String getBkgAutoEdiFlg() {
		return this.bkgAutoEdiFlg;
	}
	
	/**
	 * Column Info
	 * @return ediSndId
	 */
	public String getEdiSndId() {
		return this.ediSndId;
	}
	
	/**
	 * Column Info
	 * @return slanCd10
	 */
	public String getSlanCd10() {
		return this.slanCd10;
	}
	
	/**
	 * Column Info
	 * @return pstTsFlg
	 */
	public String getPstTsFlg() {
		return this.pstTsFlg;
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
	 * @return ydCd
	 */
	public String getYdCd() {
		return this.ydCd;
	}
	
	/**
	 * Column Info
	 * @return bkgYdTpCd
	 */
	public String getBkgYdTpCd() {
		return this.bkgYdTpCd;
	}
	
	/**
	 * Column Info
	 * @return fullRlseEdiCd
	 */
	public String getFullRlseEdiCd() {
		return this.fullRlseEdiCd;
	}
	
	/**
	 * Column Info
	 * @return bkgMnlEdiFlg
	 */
	public String getBkgMnlEdiFlg() {
		return this.bkgMnlEdiFlg;
	}
	

	/**
	 * Column Info
	 * @param slanCd3
	 */
	public void setSlanCd3(String slanCd3) {
		this.slanCd3 = slanCd3;
	}
	
	/**
	 * Column Info
	 * @param slanCd4
	 */
	public void setSlanCd4(String slanCd4) {
		this.slanCd4 = slanCd4;
	}
	
	/**
	 * Column Info
	 * @param slanCd5
	 */
	public void setSlanCd5(String slanCd5) {
		this.slanCd5 = slanCd5;
	}
	
	/**
	 * Column Info
	 * @param slanCd6
	 */
	public void setSlanCd6(String slanCd6) {
		this.slanCd6 = slanCd6;
	}
	
	/**
	 * Column Info
	 * @param mtyRlseEdiFlg
	 */
	public void setMtyRlseEdiFlg(String mtyRlseEdiFlg) {
		this.mtyRlseEdiFlg = mtyRlseEdiFlg;
	}
	
	/**
	 * Column Info
	 * @param slanCd1
	 */
	public void setSlanCd1(String slanCd1) {
		this.slanCd1 = slanCd1;
	}
	
	/**
	 * Column Info
	 * @param slanCd2
	 */
	public void setSlanCd2(String slanCd2) {
		this.slanCd2 = slanCd2;
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
	 * @param preTsFlg
	 */
	public void setPreTsFlg(String preTsFlg) {
		this.preTsFlg = preTsFlg;
	}
	
	/**
	 * Column Info
	 * @param pstTsAckFlg
	 */
	public void setPstTsAckFlg(String pstTsAckFlg) {
		this.pstTsAckFlg = pstTsAckFlg;
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
	 * @param ediRcvId
	 */
	public void setEdiRcvId(String ediRcvId) {
		this.ediRcvId = ediRcvId;
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
	 * @param slanCd8
	 */
	public void setSlanCd8(String slanCd8) {
		this.slanCd8 = slanCd8;
	}
	
	/**
	 * Column Info
	 * @param slanCd7
	 */
	public void setSlanCd7(String slanCd7) {
		this.slanCd7 = slanCd7;
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
	 * @param slanCd9
	 */
	public void setSlanCd9(String slanCd9) {
		this.slanCd9 = slanCd9;
	}
	
	/**
	 * Column Info
	 * @param bkgAutoEdiFlg
	 */
	public void setBkgAutoEdiFlg(String bkgAutoEdiFlg) {
		this.bkgAutoEdiFlg = bkgAutoEdiFlg;
	}
	
	/**
	 * Column Info
	 * @param ediSndId
	 */
	public void setEdiSndId(String ediSndId) {
		this.ediSndId = ediSndId;
	}
	
	/**
	 * Column Info
	 * @param slanCd10
	 */
	public void setSlanCd10(String slanCd10) {
		this.slanCd10 = slanCd10;
	}
	
	/**
	 * Column Info
	 * @param pstTsFlg
	 */
	public void setPstTsFlg(String pstTsFlg) {
		this.pstTsFlg = pstTsFlg;
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
	 * @param ydCd
	 */
	public void setYdCd(String ydCd) {
		this.ydCd = ydCd;
	}
	
	/**
	 * Column Info
	 * @param bkgYdTpCd
	 */
	public void setBkgYdTpCd(String bkgYdTpCd) {
		this.bkgYdTpCd = bkgYdTpCd;
	}
	
	/**
	 * Column Info
	 * @param fullRlseEdiCd
	 */
	public void setFullRlseEdiCd(String fullRlseEdiCd) {
		this.fullRlseEdiCd = fullRlseEdiCd;
	}
	
	/**
	 * Column Info
	 * @param bkgMnlEdiFlg
	 */
	public void setBkgMnlEdiFlg(String bkgMnlEdiFlg) {
		this.bkgMnlEdiFlg = bkgMnlEdiFlg;
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
		setSlanCd3(JSPUtil.getParameter(request, prefix + "slan_cd3", ""));
		setSlanCd4(JSPUtil.getParameter(request, prefix + "slan_cd4", ""));
		setSlanCd5(JSPUtil.getParameter(request, prefix + "slan_cd5", ""));
		setSlanCd6(JSPUtil.getParameter(request, prefix + "slan_cd6", ""));
		setMtyRlseEdiFlg(JSPUtil.getParameter(request, prefix + "mty_rlse_edi_flg", ""));
		setSlanCd1(JSPUtil.getParameter(request, prefix + "slan_cd1", ""));
		setSlanCd2(JSPUtil.getParameter(request, prefix + "slan_cd2", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setPreTsFlg(JSPUtil.getParameter(request, prefix + "pre_ts_flg", ""));
		setPstTsAckFlg(JSPUtil.getParameter(request, prefix + "pst_ts_ack_flg", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setEdiRcvId(JSPUtil.getParameter(request, prefix + "edi_rcv_id", ""));
		setPortCd(JSPUtil.getParameter(request, prefix + "port_cd", ""));
		setSlanCd8(JSPUtil.getParameter(request, prefix + "slan_cd8", ""));
		setSlanCd7(JSPUtil.getParameter(request, prefix + "slan_cd7", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setSlanCd9(JSPUtil.getParameter(request, prefix + "slan_cd9", ""));
		setBkgAutoEdiFlg(JSPUtil.getParameter(request, prefix + "bkg_auto_edi_flg", ""));
		setEdiSndId(JSPUtil.getParameter(request, prefix + "edi_snd_id", ""));
		setSlanCd10(JSPUtil.getParameter(request, prefix + "slan_cd10", ""));
		setPstTsFlg(JSPUtil.getParameter(request, prefix + "pst_ts_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setYdCd(JSPUtil.getParameter(request, prefix + "yd_cd", ""));
		setBkgYdTpCd(JSPUtil.getParameter(request, prefix + "bkg_yd_tp_cd", ""));
		setFullRlseEdiCd(JSPUtil.getParameter(request, prefix + "full_rlse_edi_cd", ""));
		setBkgMnlEdiFlg(JSPUtil.getParameter(request, prefix + "bkg_mnl_edi_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SearchYardListVO[]
	 */
	public SearchYardListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SearchYardListVO[]
	 */
	public SearchYardListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SearchYardListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] slanCd3 = (JSPUtil.getParameter(request, prefix	+ "slan_cd3", length));
			String[] slanCd4 = (JSPUtil.getParameter(request, prefix	+ "slan_cd4", length));
			String[] slanCd5 = (JSPUtil.getParameter(request, prefix	+ "slan_cd5", length));
			String[] slanCd6 = (JSPUtil.getParameter(request, prefix	+ "slan_cd6", length));
			String[] mtyRlseEdiFlg = (JSPUtil.getParameter(request, prefix	+ "mty_rlse_edi_flg", length));
			String[] slanCd1 = (JSPUtil.getParameter(request, prefix	+ "slan_cd1", length));
			String[] slanCd2 = (JSPUtil.getParameter(request, prefix	+ "slan_cd2", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] preTsFlg = (JSPUtil.getParameter(request, prefix	+ "pre_ts_flg", length));
			String[] pstTsAckFlg = (JSPUtil.getParameter(request, prefix	+ "pst_ts_ack_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ediRcvId = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_id", length));
			String[] portCd = (JSPUtil.getParameter(request, prefix	+ "port_cd", length));
			String[] slanCd8 = (JSPUtil.getParameter(request, prefix	+ "slan_cd8", length));
			String[] slanCd7 = (JSPUtil.getParameter(request, prefix	+ "slan_cd7", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] slanCd9 = (JSPUtil.getParameter(request, prefix	+ "slan_cd9", length));
			String[] bkgAutoEdiFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_auto_edi_flg", length));
			String[] ediSndId = (JSPUtil.getParameter(request, prefix	+ "edi_snd_id", length));
			String[] slanCd10 = (JSPUtil.getParameter(request, prefix	+ "slan_cd10", length));
			String[] pstTsFlg = (JSPUtil.getParameter(request, prefix	+ "pst_ts_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ydCd = (JSPUtil.getParameter(request, prefix	+ "yd_cd", length));
			String[] bkgYdTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_yd_tp_cd", length));
			String[] fullRlseEdiCd = (JSPUtil.getParameter(request, prefix	+ "full_rlse_edi_cd", length));
			String[] bkgMnlEdiFlg = (JSPUtil.getParameter(request, prefix	+ "bkg_mnl_edi_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new SearchYardListVO();
				if (slanCd3[i] != null)
					model.setSlanCd3(slanCd3[i]);
				if (slanCd4[i] != null)
					model.setSlanCd4(slanCd4[i]);
				if (slanCd5[i] != null)
					model.setSlanCd5(slanCd5[i]);
				if (slanCd6[i] != null)
					model.setSlanCd6(slanCd6[i]);
				if (mtyRlseEdiFlg[i] != null)
					model.setMtyRlseEdiFlg(mtyRlseEdiFlg[i]);
				if (slanCd1[i] != null)
					model.setSlanCd1(slanCd1[i]);
				if (slanCd2[i] != null)
					model.setSlanCd2(slanCd2[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (preTsFlg[i] != null)
					model.setPreTsFlg(preTsFlg[i]);
				if (pstTsAckFlg[i] != null)
					model.setPstTsAckFlg(pstTsAckFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ediRcvId[i] != null)
					model.setEdiRcvId(ediRcvId[i]);
				if (portCd[i] != null)
					model.setPortCd(portCd[i]);
				if (slanCd8[i] != null)
					model.setSlanCd8(slanCd8[i]);
				if (slanCd7[i] != null)
					model.setSlanCd7(slanCd7[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (slanCd9[i] != null)
					model.setSlanCd9(slanCd9[i]);
				if (bkgAutoEdiFlg[i] != null)
					model.setBkgAutoEdiFlg(bkgAutoEdiFlg[i]);
				if (ediSndId[i] != null)
					model.setEdiSndId(ediSndId[i]);
				if (slanCd10[i] != null)
					model.setSlanCd10(slanCd10[i]);
				if (pstTsFlg[i] != null)
					model.setPstTsFlg(pstTsFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ydCd[i] != null)
					model.setYdCd(ydCd[i]);
				if (bkgYdTpCd[i] != null)
					model.setBkgYdTpCd(bkgYdTpCd[i]);
				if (fullRlseEdiCd[i] != null)
					model.setFullRlseEdiCd(fullRlseEdiCd[i]);
				if (bkgMnlEdiFlg[i] != null)
					model.setBkgMnlEdiFlg(bkgMnlEdiFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchYardListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SearchYardListVO[]
	 */
	public SearchYardListVO[] getSearchYardListVOs(){
		SearchYardListVO[] vos = (SearchYardListVO[])models.toArray(new SearchYardListVO[models.size()]);
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
		this.slanCd3 = this.slanCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd4 = this.slanCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd5 = this.slanCd5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd6 = this.slanCd6 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mtyRlseEdiFlg = this.mtyRlseEdiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd1 = this.slanCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd2 = this.slanCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preTsFlg = this.preTsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstTsAckFlg = this.pstTsAckFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvId = this.ediRcvId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.portCd = this.portCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd8 = this.slanCd8 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd7 = this.slanCd7 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd9 = this.slanCd9 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAutoEdiFlg = this.bkgAutoEdiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndId = this.ediSndId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd10 = this.slanCd10 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pstTsFlg = this.pstTsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ydCd = this.ydCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgYdTpCd = this.bkgYdTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fullRlseEdiCd = this.fullRlseEdiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMnlEdiFlg = this.bkgMnlEdiFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
