/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgIbCustCntcHisVO.java
*@FileTitle : BkgIbCustCntcHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.13
*@LastModifier : 박성호
*@LastVersion : 1.0
* 2009.08.13 박성호 
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
 * @author 박성호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgIbCustCntcHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgIbCustCntcHisVO> models = new ArrayList<BkgIbCustCntcHisVO>();
	
	/* Column Info */
	private String nrthAmerFaxChgDpFlg = null;
	/* Column Info */
	private String nrthAmerEmlChgDpFlg = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String custCntcTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sndSelFlg = null;
	/* Column Info */
	private String custSeq = null;
	/* Column Info */
	private String blNo = null;
	/* Column Info */
	private String cngUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String newCntcCtnt = null;
	/* Column Info */
	private String cntcViaCd = null;
	/* Column Info */
	private String hisSeq = null;
	/* Column Info */
	private String cngDt = null;
	/* Column Info */
	private String oldCntcCtnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String custCntCd = null;
	/* Column Info */
	private String autoMnlFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgIbCustCntcHisVO() {}

	public BkgIbCustCntcHisVO(String ibflag, String pagerows, String custCntCd, String nrthAmerFaxChgDpFlg, String nrthAmerEmlChgDpFlg, String custSeq, String ofcCd, String custCntcTpCd, String hisSeq, String cntcViaCd, String oldCntcCtnt, String newCntcCtnt, String blNo, String autoMnlFlg, String sndSelFlg, String cngDt, String cngUsrId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.nrthAmerFaxChgDpFlg= nrthAmerFaxChgDpFlg;
		this.nrthAmerEmlChgDpFlg =nrthAmerEmlChgDpFlg;
		this.custCntcTpCd = custCntcTpCd;
		this.creDt = creDt;
		this.sndSelFlg = sndSelFlg;
		this.custSeq = custSeq;
		this.blNo = blNo;
		this.cngUsrId = cngUsrId;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.newCntcCtnt = newCntcCtnt;
		this.cntcViaCd = cntcViaCd;
		this.hisSeq = hisSeq;
		this.cngDt = cngDt;
		this.oldCntcCtnt = oldCntcCtnt;
		this.updUsrId = updUsrId;
		this.custCntCd = custCntCd;
		this.autoMnlFlg = autoMnlFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("nrth_amer_fax_chg_dp_flg", getNrthAmerFaxChgDpFlg());
		this.hashColumns.put("nrth_amer_eml_chg_dp_flg", getNrthAmerEmlChgDpFlg());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cust_cntc_tp_cd", getCustCntcTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("snd_sel_flg", getSndSelFlg());
		this.hashColumns.put("cust_seq", getCustSeq());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("cng_usr_id", getCngUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("new_cntc_ctnt", getNewCntcCtnt());
		this.hashColumns.put("cntc_via_cd", getCntcViaCd());
		this.hashColumns.put("his_seq", getHisSeq());
		this.hashColumns.put("cng_dt", getCngDt());
		this.hashColumns.put("old_cntc_ctnt", getOldCntcCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cust_cnt_cd", getCustCntCd());
		this.hashColumns.put("auto_mnl_flg", getAutoMnlFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("nrth_amer_fax_chg_dp_flg", "nrthAmerFaxChgDpFlg");
		this.hashFields.put("nrth_amer_eml_chg_dp_flg", "nrthAmerEmlChgDpFlg");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cust_cntc_tp_cd", "custCntcTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("snd_sel_flg", "sndSelFlg");
		this.hashFields.put("cust_seq", "custSeq");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("cng_usr_id", "cngUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("new_cntc_ctnt", "newCntcCtnt");
		this.hashFields.put("cntc_via_cd", "cntcViaCd");
		this.hashFields.put("his_seq", "hisSeq");
		this.hashFields.put("cng_dt", "cngDt");
		this.hashFields.put("old_cntc_ctnt", "oldCntcCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cust_cnt_cd", "custCntCd");
		this.hashFields.put("auto_mnl_flg", "autoMnlFlg");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerFaxChgDpFlg
	 */
	public String getNrthAmerFaxChgDpFlg() {
		return this.nrthAmerFaxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @return nrthAmerEmlChgDpFlg
	 */
	public String getNrthAmerEmlChgDpFlg() {
		return this.nrthAmerEmlChgDpFlg;
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
	 * @return custCntcTpCd
	 */
	public String getCustCntcTpCd() {
		return this.custCntcTpCd;
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
	 * @return sndSelFlg
	 */
	public String getSndSelFlg() {
		return this.sndSelFlg;
	}
	
	/**
	 * Column Info
	 * @return custSeq
	 */
	public String getCustSeq() {
		return this.custSeq;
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
	 * @return cngUsrId
	 */
	public String getCngUsrId() {
		return this.cngUsrId;
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
	 * @return newCntcCtnt
	 */
	public String getNewCntcCtnt() {
		return this.newCntcCtnt;
	}
	
	/**
	 * Column Info
	 * @return cntcViaCd
	 */
	public String getCntcViaCd() {
		return this.cntcViaCd;
	}
	
	/**
	 * Column Info
	 * @return hisSeq
	 */
	public String getHisSeq() {
		return this.hisSeq;
	}
	
	/**
	 * Column Info
	 * @return cngDt
	 */
	public String getCngDt() {
		return this.cngDt;
	}
	
	/**
	 * Column Info
	 * @return oldCntcCtnt
	 */
	public String getOldCntcCtnt() {
		return this.oldCntcCtnt;
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
	 * @return custCntCd
	 */
	public String getCustCntCd() {
		return this.custCntCd;
	}
	
	/**
	 * Column Info
	 * @return autoMnlFlg
	 */
	public String getAutoMnlFlg() {
		return this.autoMnlFlg;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerFaxChgDpFlg
	 */
	public void setNrthAmerFaxChgDpFlg(String nrthAmerFaxChgDpFlg) {
		this.nrthAmerFaxChgDpFlg = nrthAmerFaxChgDpFlg;
	}
	
	/**
	 * Column Info
	 * @param nrthAmerEmlChgDpFlg
	 */
	public void setNrthAmerEmlChgDpFlg(String nrthAmerEmlChgDpFlg) {
		this.nrthAmerEmlChgDpFlg = nrthAmerEmlChgDpFlg;
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
	 * @param custCntcTpCd
	 */
	public void setCustCntcTpCd(String custCntcTpCd) {
		this.custCntcTpCd = custCntcTpCd;
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
	 * @param sndSelFlg
	 */
	public void setSndSelFlg(String sndSelFlg) {
		this.sndSelFlg = sndSelFlg;
	}
	
	/**
	 * Column Info
	 * @param custSeq
	 */
	public void setCustSeq(String custSeq) {
		this.custSeq = custSeq;
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
	 * @param cngUsrId
	 */
	public void setCngUsrId(String cngUsrId) {
		this.cngUsrId = cngUsrId;
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
	 * @param newCntcCtnt
	 */
	public void setNewCntcCtnt(String newCntcCtnt) {
		this.newCntcCtnt = newCntcCtnt;
	}
	
	/**
	 * Column Info
	 * @param cntcViaCd
	 */
	public void setCntcViaCd(String cntcViaCd) {
		this.cntcViaCd = cntcViaCd;
	}
	
	/**
	 * Column Info
	 * @param hisSeq
	 */
	public void setHisSeq(String hisSeq) {
		this.hisSeq = hisSeq;
	}
	
	/**
	 * Column Info
	 * @param cngDt
	 */
	public void setCngDt(String cngDt) {
		this.cngDt = cngDt;
	}
	
	/**
	 * Column Info
	 * @param oldCntcCtnt
	 */
	public void setOldCntcCtnt(String oldCntcCtnt) {
		this.oldCntcCtnt = oldCntcCtnt;
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
	 * @param custCntCd
	 */
	public void setCustCntCd(String custCntCd) {
		this.custCntCd = custCntCd;
	}
	
	/**
	 * Column Info
	 * @param autoMnlFlg
	 */
	public void setAutoMnlFlg(String autoMnlFlg) {
		this.autoMnlFlg = autoMnlFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setNrthAmerFaxChgDpFlg(JSPUtil.getParameter(request, "nrth_amer_fax_chg_dp_flg", ""));
		setNrthAmerEmlChgDpFlg(JSPUtil.getParameter(request, "nrth_amer_eml_chg_dp_flg", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCustCntcTpCd(JSPUtil.getParameter(request, "cust_cntc_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSndSelFlg(JSPUtil.getParameter(request, "snd_sel_flg", ""));
		setCustSeq(JSPUtil.getParameter(request, "cust_seq", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setCngUsrId(JSPUtil.getParameter(request, "cng_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setNewCntcCtnt(JSPUtil.getParameter(request, "new_cntc_ctnt", ""));
		setCntcViaCd(JSPUtil.getParameter(request, "cntc_via_cd", ""));
		setHisSeq(JSPUtil.getParameter(request, "his_seq", ""));
		setCngDt(JSPUtil.getParameter(request, "cng_dt", ""));
		setOldCntcCtnt(JSPUtil.getParameter(request, "old_cntc_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCustCntCd(JSPUtil.getParameter(request, "cust_cnt_cd", ""));
		setAutoMnlFlg(JSPUtil.getParameter(request, "auto_mnl_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgIbCustCntcHisVO[]
	 */
	public BkgIbCustCntcHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgIbCustCntcHisVO[]
	 */
	public BkgIbCustCntcHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgIbCustCntcHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] nrthAmerFaxChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_fax_chg_dp_flg", length));
			String[] nrthAmerEmlChgDpFlg = (JSPUtil.getParameter(request, prefix	+ "nrth_amer_eml_chg_dp_flg", length));
			String[] custCntcTpCd = (JSPUtil.getParameter(request, prefix	+ "cust_cntc_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sndSelFlg = (JSPUtil.getParameter(request, prefix	+ "snd_sel_flg", length));
			String[] custSeq = (JSPUtil.getParameter(request, prefix	+ "cust_seq", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] cngUsrId = (JSPUtil.getParameter(request, prefix	+ "cng_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] newCntcCtnt = (JSPUtil.getParameter(request, prefix	+ "new_cntc_ctnt", length));
			String[] cntcViaCd = (JSPUtil.getParameter(request, prefix	+ "cntc_via_cd", length));
			String[] hisSeq = (JSPUtil.getParameter(request, prefix	+ "his_seq", length));
			String[] cngDt = (JSPUtil.getParameter(request, prefix	+ "cng_dt", length));
			String[] oldCntcCtnt = (JSPUtil.getParameter(request, prefix	+ "old_cntc_ctnt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] custCntCd = (JSPUtil.getParameter(request, prefix	+ "cust_cnt_cd", length));
			String[] autoMnlFlg = (JSPUtil.getParameter(request, prefix	+ "auto_mnl_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgIbCustCntcHisVO();
				if (nrthAmerFaxChgDpFlg[i] != null)
					model.setNrthAmerFaxChgDpFlg(nrthAmerFaxChgDpFlg[i]);
				if (nrthAmerEmlChgDpFlg[i] != null)
					model.setNrthAmerEmlChgDpFlg(nrthAmerEmlChgDpFlg[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (custCntcTpCd[i] != null)
					model.setCustCntcTpCd(custCntcTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sndSelFlg[i] != null)
					model.setSndSelFlg(sndSelFlg[i]);
				if (custSeq[i] != null)
					model.setCustSeq(custSeq[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (cngUsrId[i] != null)
					model.setCngUsrId(cngUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (newCntcCtnt[i] != null)
					model.setNewCntcCtnt(newCntcCtnt[i]);
				if (cntcViaCd[i] != null)
					model.setCntcViaCd(cntcViaCd[i]);
				if (hisSeq[i] != null)
					model.setHisSeq(hisSeq[i]);
				if (cngDt[i] != null)
					model.setCngDt(cngDt[i]);
				if (oldCntcCtnt[i] != null)
					model.setOldCntcCtnt(oldCntcCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (custCntCd[i] != null)
					model.setCustCntCd(custCntCd[i]);
				if (autoMnlFlg[i] != null)
					model.setAutoMnlFlg(autoMnlFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgIbCustCntcHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgIbCustCntcHisVO[]
	 */
	public BkgIbCustCntcHisVO[] getBkgIbCustCntcHisVOs(){
		BkgIbCustCntcHisVO[] vos = (BkgIbCustCntcHisVO[])models.toArray(new BkgIbCustCntcHisVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerFaxChgDpFlg = this.nrthAmerFaxChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.nrthAmerEmlChgDpFlg = this.nrthAmerEmlChgDpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntcTpCd = this.custCntcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndSelFlg = this.sndSelFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custSeq = this.custSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngUsrId = this.cngUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newCntcCtnt = this.newCntcCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntcViaCd = this.cntcViaCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hisSeq = this.hisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngDt = this.cngDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldCntcCtnt = this.oldCntcCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCntCd = this.custCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoMnlFlg = this.autoMnlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
