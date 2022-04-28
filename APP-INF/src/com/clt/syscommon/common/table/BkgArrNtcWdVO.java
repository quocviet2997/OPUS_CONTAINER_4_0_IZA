/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgArrNtcWdVO.java
*@FileTitle : BkgArrNtcWdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.20
*@LastModifier : 박만건
*@LastVersion : 1.0
* 2009.11.20 박만건 
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
 * @author 박만건
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgArrNtcWdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgArrNtcWdVO> models = new ArrayList<BkgArrNtcWdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String anSeq = null;
	/* Column Info */
	private String drftBlBankAcctDpFlg = null;
	/* Column Info */
	private String addrCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String anTpCd = null;
	/* Column Info */
	private String eclzBlCpyFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String arrPrvFomCd = null;
	/* Column Info */
	private String bankInAcctCtnt = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String imptNtcRmk = null;
	/* Column Info */
	private String loclLangFlg = null;
	/* Column Info */
	private String chnAgnCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgArrNtcWdVO() {}

	public BkgArrNtcWdVO(String ibflag, String pagerows, String anSeq, String anTpCd, String ofcCd, String podCd, String chnAgnCd, String loclLangFlg, String arrPrvFomCd, String eclzBlCpyFlg, String addrCtnt, String imptNtcRmk, String bankInAcctCtnt, String drftBlBankAcctDpFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.anSeq = anSeq;
		this.drftBlBankAcctDpFlg = drftBlBankAcctDpFlg;
		this.addrCtnt = addrCtnt;
		this.creDt = creDt;
		this.anTpCd = anTpCd;
		this.eclzBlCpyFlg = eclzBlCpyFlg;
		this.pagerows = pagerows;
		this.podCd = podCd;
		this.arrPrvFomCd = arrPrvFomCd;
		this.bankInAcctCtnt = bankInAcctCtnt;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.imptNtcRmk = imptNtcRmk;
		this.loclLangFlg = loclLangFlg;
		this.chnAgnCd = chnAgnCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("an_seq", getAnSeq());
		this.hashColumns.put("drft_bl_bank_acct_dp_flg", getDrftBlBankAcctDpFlg());
		this.hashColumns.put("addr_ctnt", getAddrCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("an_tp_cd", getAnTpCd());
		this.hashColumns.put("eclz_bl_cpy_flg", getEclzBlCpyFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("arr_prv_fom_cd", getArrPrvFomCd());
		this.hashColumns.put("bank_in_acct_ctnt", getBankInAcctCtnt());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("impt_ntc_rmk", getImptNtcRmk());
		this.hashColumns.put("locl_lang_flg", getLoclLangFlg());
		this.hashColumns.put("chn_agn_cd", getChnAgnCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("an_seq", "anSeq");
		this.hashFields.put("drft_bl_bank_acct_dp_flg", "drftBlBankAcctDpFlg");
		this.hashFields.put("addr_ctnt", "addrCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("an_tp_cd", "anTpCd");
		this.hashFields.put("eclz_bl_cpy_flg", "eclzBlCpyFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("arr_prv_fom_cd", "arrPrvFomCd");
		this.hashFields.put("bank_in_acct_ctnt", "bankInAcctCtnt");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("impt_ntc_rmk", "imptNtcRmk");
		this.hashFields.put("locl_lang_flg", "loclLangFlg");
		this.hashFields.put("chn_agn_cd", "chnAgnCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
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
	 * @return anSeq
	 */
	public String getAnSeq() {
		return this.anSeq;
	}
	
	/**
	 * Column Info
	 * @return drftBlBankAcctDpFlg
	 */
	public String getDrftBlBankAcctDpFlg() {
		return this.drftBlBankAcctDpFlg;
	}
	
	/**
	 * Column Info
	 * @return addrCtnt
	 */
	public String getAddrCtnt() {
		return this.addrCtnt;
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
	 * @return anTpCd
	 */
	public String getAnTpCd() {
		return this.anTpCd;
	}
	
	/**
	 * Column Info
	 * @return eclzBlCpyFlg
	 */
	public String getEclzBlCpyFlg() {
		return this.eclzBlCpyFlg;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return arrPrvFomCd
	 */
	public String getArrPrvFomCd() {
		return this.arrPrvFomCd;
	}
	
	/**
	 * Column Info
	 * @return bankInAcctCtnt
	 */
	public String getBankInAcctCtnt() {
		return this.bankInAcctCtnt;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return imptNtcRmk
	 */
	public String getImptNtcRmk() {
		return this.imptNtcRmk;
	}
	
	/**
	 * Column Info
	 * @return loclLangFlg
	 */
	public String getLoclLangFlg() {
		return this.loclLangFlg;
	}
	
	/**
	 * Column Info
	 * @return chnAgnCd
	 */
	public String getChnAgnCd() {
		return this.chnAgnCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param anSeq
	 */
	public void setAnSeq(String anSeq) {
		this.anSeq = anSeq;
	}
	
	/**
	 * Column Info
	 * @param drftBlBankAcctDpFlg
	 */
	public void setDrftBlBankAcctDpFlg(String drftBlBankAcctDpFlg) {
		this.drftBlBankAcctDpFlg = drftBlBankAcctDpFlg;
	}
	
	/**
	 * Column Info
	 * @param addrCtnt
	 */
	public void setAddrCtnt(String addrCtnt) {
		this.addrCtnt = addrCtnt;
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
	 * @param anTpCd
	 */
	public void setAnTpCd(String anTpCd) {
		this.anTpCd = anTpCd;
	}
	
	/**
	 * Column Info
	 * @param eclzBlCpyFlg
	 */
	public void setEclzBlCpyFlg(String eclzBlCpyFlg) {
		this.eclzBlCpyFlg = eclzBlCpyFlg;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param arrPrvFomCd
	 */
	public void setArrPrvFomCd(String arrPrvFomCd) {
		this.arrPrvFomCd = arrPrvFomCd;
	}
	
	/**
	 * Column Info
	 * @param bankInAcctCtnt
	 */
	public void setBankInAcctCtnt(String bankInAcctCtnt) {
		this.bankInAcctCtnt = bankInAcctCtnt;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param imptNtcRmk
	 */
	public void setImptNtcRmk(String imptNtcRmk) {
		this.imptNtcRmk = imptNtcRmk;
	}
	
	/**
	 * Column Info
	 * @param loclLangFlg
	 */
	public void setLoclLangFlg(String loclLangFlg) {
		this.loclLangFlg = loclLangFlg;
	}
	
	/**
	 * Column Info
	 * @param chnAgnCd
	 */
	public void setChnAgnCd(String chnAgnCd) {
		this.chnAgnCd = chnAgnCd;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAnSeq(JSPUtil.getParameter(request, "an_seq", ""));
		setDrftBlBankAcctDpFlg(JSPUtil.getParameter(request, "drft_bl_bank_acct_dp_flg", ""));
		setAddrCtnt(JSPUtil.getParameter(request, "addr_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAnTpCd(JSPUtil.getParameter(request, "an_tp_cd", ""));
		setEclzBlCpyFlg(JSPUtil.getParameter(request, "eclz_bl_cpy_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setArrPrvFomCd(JSPUtil.getParameter(request, "arr_prv_fom_cd", ""));
		setBankInAcctCtnt(JSPUtil.getParameter(request, "bank_in_acct_ctnt", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setImptNtcRmk(JSPUtil.getParameter(request, "impt_ntc_rmk", ""));
		setLoclLangFlg(JSPUtil.getParameter(request, "locl_lang_flg", ""));
		setChnAgnCd(JSPUtil.getParameter(request, "chn_agn_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgArrNtcWdVO[]
	 */
	public BkgArrNtcWdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgArrNtcWdVO[]
	 */
	public BkgArrNtcWdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgArrNtcWdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] anSeq = (JSPUtil.getParameter(request, prefix	+ "an_seq", length));
			String[] drftBlBankAcctDpFlg = (JSPUtil.getParameter(request, prefix	+ "drft_bl_bank_acct_dp_flg", length));
			String[] addrCtnt = (JSPUtil.getParameter(request, prefix	+ "addr_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] anTpCd = (JSPUtil.getParameter(request, prefix	+ "an_tp_cd", length));
			String[] eclzBlCpyFlg = (JSPUtil.getParameter(request, prefix	+ "eclz_bl_cpy_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] arrPrvFomCd = (JSPUtil.getParameter(request, prefix	+ "arr_prv_fom_cd", length));
			String[] bankInAcctCtnt = (JSPUtil.getParameter(request, prefix	+ "bank_in_acct_ctnt", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] imptNtcRmk = (JSPUtil.getParameter(request, prefix	+ "impt_ntc_rmk", length));
			String[] loclLangFlg = (JSPUtil.getParameter(request, prefix	+ "locl_lang_flg", length));
			String[] chnAgnCd = (JSPUtil.getParameter(request, prefix	+ "chn_agn_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgArrNtcWdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (anSeq[i] != null)
					model.setAnSeq(anSeq[i]);
				if (drftBlBankAcctDpFlg[i] != null)
					model.setDrftBlBankAcctDpFlg(drftBlBankAcctDpFlg[i]);
				if (addrCtnt[i] != null)
					model.setAddrCtnt(addrCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (anTpCd[i] != null)
					model.setAnTpCd(anTpCd[i]);
				if (eclzBlCpyFlg[i] != null)
					model.setEclzBlCpyFlg(eclzBlCpyFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (arrPrvFomCd[i] != null)
					model.setArrPrvFomCd(arrPrvFomCd[i]);
				if (bankInAcctCtnt[i] != null)
					model.setBankInAcctCtnt(bankInAcctCtnt[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (imptNtcRmk[i] != null)
					model.setImptNtcRmk(imptNtcRmk[i]);
				if (loclLangFlg[i] != null)
					model.setLoclLangFlg(loclLangFlg[i]);
				if (chnAgnCd[i] != null)
					model.setChnAgnCd(chnAgnCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgArrNtcWdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgArrNtcWdVO[]
	 */
	public BkgArrNtcWdVO[] getBkgArrNtcWdVOs(){
		BkgArrNtcWdVO[] vos = (BkgArrNtcWdVO[])models.toArray(new BkgArrNtcWdVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anSeq = this.anSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.drftBlBankAcctDpFlg = this.drftBlBankAcctDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addrCtnt = this.addrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.anTpCd = this.anTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eclzBlCpyFlg = this.eclzBlCpyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.arrPrvFomCd = this.arrPrvFomCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bankInAcctCtnt = this.bankInAcctCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imptNtcRmk = this.imptNtcRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclLangFlg = this.loclLangFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chnAgnCd = this.chnAgnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
