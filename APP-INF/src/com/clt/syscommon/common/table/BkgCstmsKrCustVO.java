/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgCstmsKrCustVO.java
*@FileTitle : BkgCstmsKrCustVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.10.28
*@LastModifier : 
*@LastVersion : 1.0
* 2010.10.28  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsKrCustVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsKrCustVO> models = new ArrayList<BkgCstmsKrCustVO>();
	
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String bkgCgoTp = null;
	/* Column Info */
	private String inBound = null;
	/* Column Info */
	private String bkgNoSplit = null;
	/* Column Info */
	private String custAddr = null;
	/* Column Info */
	private String kcdTp = null;
	/* Column Info */
	private String exptKcdTp = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ktSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String username = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String custCd = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String bcsTp = null;
	/* Column Info */
	private String custName = null;
	/* Column Info */
	private String obType = null;
	/* Column Info */
	private String ktPort = null;
	/* Column Info */
	private String custTel = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsKrCustVO() {}

	public BkgCstmsKrCustVO(String ibflag, String pagerows, String vslCd, String bkgCgoTp, String bkgNoSplit, String custAddr, String kcdTp, String exptKcdTp, String ktSeq, String username, String bkgNo, String custCd, String cntCd, String bcsTp, String obType, String custName, String ktPort, String custTel, String inBound) {
		this.vslCd = vslCd;
		this.bkgCgoTp = bkgCgoTp;
		this.inBound = inBound;
		this.bkgNoSplit = bkgNoSplit;
		this.custAddr = custAddr;
		this.kcdTp = kcdTp;
		this.exptKcdTp = exptKcdTp;
		this.pagerows = pagerows;
		this.ktSeq = ktSeq;
		this.ibflag = ibflag;
		this.username = username;
		this.bkgNo = bkgNo;
		this.custCd = custCd;
		this.cntCd = cntCd;
		this.bcsTp = bcsTp;
		this.custName = custName;
		this.obType = obType;
		this.ktPort = ktPort;
		this.custTel = custTel;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("bkg_cgo_tp", getBkgCgoTp());
		this.hashColumns.put("in_bound", getInBound());
		this.hashColumns.put("bkg_no_split", getBkgNoSplit());
		this.hashColumns.put("cust_addr", getCustAddr());
		this.hashColumns.put("kcd_tp", getKcdTp());
		this.hashColumns.put("expt_kcd_tp", getExptKcdTp());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("kt_seq", getKtSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("username", getUsername());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cust_cd", getCustCd());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("bcs_tp", getBcsTp());
		this.hashColumns.put("cust_name", getCustName());
		this.hashColumns.put("ob_type", getObType());
		this.hashColumns.put("kt_port", getKtPort());
		this.hashColumns.put("cust_tel", getCustTel());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bkg_cgo_tp", "bkgCgoTp");
		this.hashFields.put("in_bound", "inBound");
		this.hashFields.put("bkg_no_split", "bkgNoSplit");
		this.hashFields.put("cust_addr", "custAddr");
		this.hashFields.put("kcd_tp", "kcdTp");
		this.hashFields.put("expt_kcd_tp", "exptKcdTp");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("kt_seq", "ktSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("username", "username");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cust_cd", "custCd");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("bcs_tp", "bcsTp");
		this.hashFields.put("cust_name", "custName");
		this.hashFields.put("ob_type", "obType");
		this.hashFields.put("kt_port", "ktPort");
		this.hashFields.put("cust_tel", "custTel");
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
	 * @return bkgCgoTp
	 */
	public String getBkgCgoTp() {
		return this.bkgCgoTp;
	}
	
	/**
	 * Column Info
	 * @return inBound
	 */
	public String getInBound() {
		return this.inBound;
	}
	
	/**
	 * Column Info
	 * @return bkgNoSplit
	 */
	public String getBkgNoSplit() {
		return this.bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @return custAddr
	 */
	public String getCustAddr() {
		return this.custAddr;
	}
	
	/**
	 * Column Info
	 * @return kcdTp
	 */
	public String getKcdTp() {
		return this.kcdTp;
	}
	
	/**
	 * Column Info
	 * @return exptKcdTp
	 */
	public String getExptKcdTp() {
		return this.exptKcdTp;
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
	 * @return ktSeq
	 */
	public String getKtSeq() {
		return this.ktSeq;
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
	 * @return username
	 */
	public String getUsername() {
		return this.username;
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
	 * @return custCd
	 */
	public String getCustCd() {
		return this.custCd;
	}
	
	/**
	 * Column Info
	 * @return cntCd
	 */
	public String getCntCd() {
		return this.cntCd;
	}
	
	/**
	 * Column Info
	 * @return bcsTp
	 */
	public String getBcsTp() {
		return this.bcsTp;
	}
	
	/**
	 * Column Info
	 * @return custName
	 */
	public String getCustName() {
		return this.custName;
	}
	
	/**
	 * Column Info
	 * @return obType
	 */
	public String getObType() {
		return this.obType;
	}
	
	/**
	 * Column Info
	 * @return ktPort
	 */
	public String getKtPort() {
		return this.ktPort;
	}
	
	/**
	 * Column Info
	 * @return custTel
	 */
	public String getCustTel() {
		return this.custTel;
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
	 * @param bkgCgoTp
	 */
	public void setBkgCgoTp(String bkgCgoTp) {
		this.bkgCgoTp = bkgCgoTp;
	}
	
	/**
	 * Column Info
	 * @param inBound
	 */
	public void setInBound(String inBound) {
		this.inBound = inBound;
	}
	
	/**
	 * Column Info
	 * @param bkgNoSplit
	 */
	public void setBkgNoSplit(String bkgNoSplit) {
		this.bkgNoSplit = bkgNoSplit;
	}
	
	/**
	 * Column Info
	 * @param custAddr
	 */
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	/**
	 * Column Info
	 * @param kcdTp
	 */
	public void setKcdTp(String kcdTp) {
		this.kcdTp = kcdTp;
	}
	
	/**
	 * Column Info
	 * @param exptKcdTp
	 */
	public void setExptKcdTp(String exptKcdTp) {
		this.exptKcdTp = exptKcdTp;
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
	 * @param ktSeq
	 */
	public void setKtSeq(String ktSeq) {
		this.ktSeq = ktSeq;
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
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
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
	 * @param custCd
	 */
	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}
	
	/**
	 * Column Info
	 * @param cntCd
	 */
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
	}
	
	/**
	 * Column Info
	 * @param bcsTp
	 */
	public void setBcsTp(String bcsTp) {
		this.bcsTp = bcsTp;
	}
	
	/**
	 * Column Info
	 * @param custName
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	/**
	 * Column Info
	 * @param obType
	 */
	public void setObType(String obType) {
		this.obType = obType;
	}
	
	/**
	 * Column Info
	 * @param ktPort
	 */
	public void setKtPort(String ktPort) {
		this.ktPort = ktPort;
	}
	
	/**
	 * Column Info
	 * @param custTel
	 */
	public void setCustTel(String custTel) {
		this.custTel = custTel;
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
		setVslCd(JSPUtil.getParameter(request, prefix + "vsl_cd", ""));
		setBkgCgoTp(JSPUtil.getParameter(request, prefix + "bkg_cgo_tp", ""));
		setInBound(JSPUtil.getParameter(request, prefix + "in_bound", ""));
		setBkgNoSplit(JSPUtil.getParameter(request, prefix + "bkg_no_split", ""));
		setCustAddr(JSPUtil.getParameter(request, prefix + "cust_addr", ""));
		setKcdTp(JSPUtil.getParameter(request, prefix + "kcd_tp", ""));
		setExptKcdTp(JSPUtil.getParameter(request, prefix + "expt_kcd_tp", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setKtSeq(JSPUtil.getParameter(request, prefix + "kt_seq", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setUsername(JSPUtil.getParameter(request, prefix + "username", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setCustCd(JSPUtil.getParameter(request, prefix + "cust_cd", ""));
		setCntCd(JSPUtil.getParameter(request, prefix + "cnt_cd", ""));
		setBcsTp(JSPUtil.getParameter(request, prefix + "bcs_tp", ""));
		setCustName(JSPUtil.getParameter(request, prefix + "cust_name", ""));
		setObType(JSPUtil.getParameter(request, prefix + "ob_type", ""));
		setKtPort(JSPUtil.getParameter(request, prefix + "kt_port", ""));
		setCustTel(JSPUtil.getParameter(request, prefix + "cust_tel", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsKrCustVO[]
	 */
	public BkgCstmsKrCustVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsKrCustVO[]
	 */
	public BkgCstmsKrCustVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsKrCustVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] bkgCgoTp = (JSPUtil.getParameter(request, prefix	+ "bkg_cgo_tp", length));
			String[] inBound = (JSPUtil.getParameter(request, prefix	+ "in_bound", length));
			String[] bkgNoSplit = (JSPUtil.getParameter(request, prefix	+ "bkg_no_split", length));
			String[] custAddr = (JSPUtil.getParameter(request, prefix	+ "cust_addr", length));
			String[] kcdTp = (JSPUtil.getParameter(request, prefix	+ "kcd_tp", length));
			String[] exptKcdTp = (JSPUtil.getParameter(request, prefix	+ "expt_kcd_tp", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ktSeq = (JSPUtil.getParameter(request, prefix	+ "kt_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] username = (JSPUtil.getParameter(request, prefix	+ "username", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] custCd = (JSPUtil.getParameter(request, prefix	+ "cust_cd", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] bcsTp = (JSPUtil.getParameter(request, prefix	+ "bcs_tp", length));
			String[] custName = (JSPUtil.getParameter(request, prefix	+ "cust_name", length));
			String[] obType = (JSPUtil.getParameter(request, prefix	+ "ob_type", length));
			String[] ktPort = (JSPUtil.getParameter(request, prefix	+ "kt_port", length));
			String[] custTel = (JSPUtil.getParameter(request, prefix	+ "cust_tel", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsKrCustVO();
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bkgCgoTp[i] != null)
					model.setBkgCgoTp(bkgCgoTp[i]);
				if (inBound[i] != null)
					model.setInBound(inBound[i]);
				if (bkgNoSplit[i] != null)
					model.setBkgNoSplit(bkgNoSplit[i]);
				if (custAddr[i] != null)
					model.setCustAddr(custAddr[i]);
				if (kcdTp[i] != null)
					model.setKcdTp(kcdTp[i]);
				if (exptKcdTp[i] != null)
					model.setExptKcdTp(exptKcdTp[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ktSeq[i] != null)
					model.setKtSeq(ktSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (username[i] != null)
					model.setUsername(username[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (custCd[i] != null)
					model.setCustCd(custCd[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (bcsTp[i] != null)
					model.setBcsTp(bcsTp[i]);
				if (custName[i] != null)
					model.setCustName(custName[i]);
				if (obType[i] != null)
					model.setObType(obType[i]);
				if (ktPort[i] != null)
					model.setKtPort(ktPort[i]);
				if (custTel[i] != null)
					model.setCustTel(custTel[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsKrCustVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsKrCustVO[]
	 */
	public BkgCstmsKrCustVO[] getBkgCstmsKrCustVOs(){
		BkgCstmsKrCustVO[] vos = (BkgCstmsKrCustVO[])models.toArray(new BkgCstmsKrCustVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgCgoTp = this.bkgCgoTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.inBound = this.inBound .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNoSplit = this.bkgNoSplit .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custAddr = this.custAddr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.kcdTp = this.kcdTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptKcdTp = this.exptKcdTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ktSeq = this.ktSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.username = this.username .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCd = this.custCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bcsTp = this.bcsTp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custName = this.custName .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.obType = this.obType .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ktPort = this.ktPort .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custTel = this.custTel .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
