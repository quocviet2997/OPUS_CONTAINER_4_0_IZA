/*=========================================================
*Copyright(c) 2017 CyberLogitec
*@FileName : TrsSvcOrdBkgCngHisVO.java
*@FileTitle : TrsSvcOrdBkgCngHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2017.02.07
*@LastModifier : 
*@LastVersion : 1.0
* 2017.02.07  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

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

public class TrsSvcOrdBkgCngHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsSvcOrdBkgCngHisVO> models = new ArrayList<TrsSvcOrdBkgCngHisVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String colN1stRmk = null;
	/* Column Info */
	private String cngCateSubCd = null;
	/* Column Info */
	private String trspSoSubSeq = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String colN2ndRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String preColN1stRmk = null;
	/* Column Info */
	private String cngCateCd = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String preColN2ndRmk = null;
	/* Column Info */
	private String trspSoHisSeq = null;
	/* Column Info */
	private String trspCngSubSeq = null;
	/* Column Info */
	private String acptIndFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TrsSvcOrdBkgCngHisVO() {}

	public TrsSvcOrdBkgCngHisVO(String ibflag, String pagerows, String trspSoOfcCtyCd, String trspSoSeq, String trspSoHisSeq, String trspSoSubSeq, String bkgNo, String cngCateCd, String cngCateSubCd, String trspCngSubSeq, String colN1stRmk, String colN2ndRmk, String preColN1stRmk, String preColN2ndRmk, String acptIndFlg, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt) {
		this.updDt = updDt;
		this.colN1stRmk = colN1stRmk;
		this.cngCateSubCd = cngCateSubCd;
		this.trspSoSubSeq = trspSoSubSeq;
		this.trspSoSeq = trspSoSeq;
		this.colN2ndRmk = colN2ndRmk;
		this.creDt = creDt;
		this.preColN1stRmk = preColN1stRmk;
		this.cngCateCd = cngCateCd;
		this.edwUpdDt = edwUpdDt;
		this.pagerows = pagerows;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.preColN2ndRmk = preColN2ndRmk;
		this.trspSoHisSeq = trspSoHisSeq;
		this.trspCngSubSeq = trspCngSubSeq;
		this.acptIndFlg = acptIndFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("col_n1st_rmk", getColN1stRmk());
		this.hashColumns.put("cng_cate_sub_cd", getCngCateSubCd());
		this.hashColumns.put("trsp_so_sub_seq", getTrspSoSubSeq());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("col_n2nd_rmk", getColN2ndRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pre_col_n1st_rmk", getPreColN1stRmk());
		this.hashColumns.put("cng_cate_cd", getCngCateCd());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("pre_col_n2nd_rmk", getPreColN2ndRmk());
		this.hashColumns.put("trsp_so_his_seq", getTrspSoHisSeq());
		this.hashColumns.put("trsp_cng_sub_seq", getTrspCngSubSeq());
		this.hashColumns.put("acpt_ind_flg", getAcptIndFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("col_n1st_rmk", "colN1stRmk");
		this.hashFields.put("cng_cate_sub_cd", "cngCateSubCd");
		this.hashFields.put("trsp_so_sub_seq", "trspSoSubSeq");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("col_n2nd_rmk", "colN2ndRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pre_col_n1st_rmk", "preColN1stRmk");
		this.hashFields.put("cng_cate_cd", "cngCateCd");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("pre_col_n2nd_rmk", "preColN2ndRmk");
		this.hashFields.put("trsp_so_his_seq", "trspSoHisSeq");
		this.hashFields.put("trsp_cng_sub_seq", "trspCngSubSeq");
		this.hashFields.put("acpt_ind_flg", "acptIndFlg");
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
	 * @return colN1stRmk
	 */
	public String getColN1stRmk() {
		return this.colN1stRmk;
	}
	
	/**
	 * Column Info
	 * @return cngCateSubCd
	 */
	public String getCngCateSubCd() {
		return this.cngCateSubCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoSubSeq
	 */
	public String getTrspSoSubSeq() {
		return this.trspSoSubSeq;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @return colN2ndRmk
	 */
	public String getColN2ndRmk() {
		return this.colN2ndRmk;
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
	 * @return preColN1stRmk
	 */
	public String getPreColN1stRmk() {
		return this.preColN1stRmk;
	}
	
	/**
	 * Column Info
	 * @return cngCateCd
	 */
	public String getCngCateCd() {
		return this.cngCateCd;
	}
	
	/**
	 * Column Info
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
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
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
	}
	
	/**
	 * Column Info
	 * @return preColN2ndRmk
	 */
	public String getPreColN2ndRmk() {
		return this.preColN2ndRmk;
	}
	
	/**
	 * Column Info
	 * @return trspSoHisSeq
	 */
	public String getTrspSoHisSeq() {
		return this.trspSoHisSeq;
	}
	
	/**
	 * Column Info
	 * @return trspCngSubSeq
	 */
	public String getTrspCngSubSeq() {
		return this.trspCngSubSeq;
	}
	
	/**
	 * Column Info
	 * @return acptIndFlg
	 */
	public String getAcptIndFlg() {
		return this.acptIndFlg;
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
	 * @param colN1stRmk
	 */
	public void setColN1stRmk(String colN1stRmk) {
		this.colN1stRmk = colN1stRmk;
	}
	
	/**
	 * Column Info
	 * @param cngCateSubCd
	 */
	public void setCngCateSubCd(String cngCateSubCd) {
		this.cngCateSubCd = cngCateSubCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoSubSeq
	 */
	public void setTrspSoSubSeq(String trspSoSubSeq) {
		this.trspSoSubSeq = trspSoSubSeq;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @param colN2ndRmk
	 */
	public void setColN2ndRmk(String colN2ndRmk) {
		this.colN2ndRmk = colN2ndRmk;
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
	 * @param preColN1stRmk
	 */
	public void setPreColN1stRmk(String preColN1stRmk) {
		this.preColN1stRmk = preColN1stRmk;
	}
	
	/**
	 * Column Info
	 * @param cngCateCd
	 */
	public void setCngCateCd(String cngCateCd) {
		this.cngCateCd = cngCateCd;
	}
	
	/**
	 * Column Info
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
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
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
	}
	
	/**
	 * Column Info
	 * @param preColN2ndRmk
	 */
	public void setPreColN2ndRmk(String preColN2ndRmk) {
		this.preColN2ndRmk = preColN2ndRmk;
	}
	
	/**
	 * Column Info
	 * @param trspSoHisSeq
	 */
	public void setTrspSoHisSeq(String trspSoHisSeq) {
		this.trspSoHisSeq = trspSoHisSeq;
	}
	
	/**
	 * Column Info
	 * @param trspCngSubSeq
	 */
	public void setTrspCngSubSeq(String trspCngSubSeq) {
		this.trspCngSubSeq = trspCngSubSeq;
	}
	
	/**
	 * Column Info
	 * @param acptIndFlg
	 */
	public void setAcptIndFlg(String acptIndFlg) {
		this.acptIndFlg = acptIndFlg;
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
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setColN1stRmk(JSPUtil.getParameter(request, prefix + "col_n1st_rmk", ""));
		setCngCateSubCd(JSPUtil.getParameter(request, prefix + "cng_cate_sub_cd", ""));
		setTrspSoSubSeq(JSPUtil.getParameter(request, prefix + "trsp_so_sub_seq", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, prefix + "trsp_so_seq", ""));
		setColN2ndRmk(JSPUtil.getParameter(request, prefix + "col_n2nd_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPreColN1stRmk(JSPUtil.getParameter(request, prefix + "pre_col_n1st_rmk", ""));
		setCngCateCd(JSPUtil.getParameter(request, prefix + "cng_cate_cd", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "trsp_so_ofc_cty_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, prefix + "bkg_no", ""));
		setPreColN2ndRmk(JSPUtil.getParameter(request, prefix + "pre_col_n2nd_rmk", ""));
		setTrspSoHisSeq(JSPUtil.getParameter(request, prefix + "trsp_so_his_seq", ""));
		setTrspCngSubSeq(JSPUtil.getParameter(request, prefix + "trsp_cng_sub_seq", ""));
		setAcptIndFlg(JSPUtil.getParameter(request, prefix + "acpt_ind_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsSvcOrdBkgCngHisVO[]
	 */
	public TrsSvcOrdBkgCngHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsSvcOrdBkgCngHisVO[]
	 */
	public TrsSvcOrdBkgCngHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsSvcOrdBkgCngHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] colN1stRmk = (JSPUtil.getParameter(request, prefix	+ "col_n1st_rmk", length));
			String[] cngCateSubCd = (JSPUtil.getParameter(request, prefix	+ "cng_cate_sub_cd", length));
			String[] trspSoSubSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_sub_seq", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] colN2ndRmk = (JSPUtil.getParameter(request, prefix	+ "col_n2nd_rmk", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] preColN1stRmk = (JSPUtil.getParameter(request, prefix	+ "pre_col_n1st_rmk", length));
			String[] cngCateCd = (JSPUtil.getParameter(request, prefix	+ "cng_cate_cd", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] preColN2ndRmk = (JSPUtil.getParameter(request, prefix	+ "pre_col_n2nd_rmk", length));
			String[] trspSoHisSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_his_seq", length));
			String[] trspCngSubSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_cng_sub_seq", length));
			String[] acptIndFlg = (JSPUtil.getParameter(request, prefix	+ "acpt_ind_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsSvcOrdBkgCngHisVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (colN1stRmk[i] != null)
					model.setColN1stRmk(colN1stRmk[i]);
				if (cngCateSubCd[i] != null)
					model.setCngCateSubCd(cngCateSubCd[i]);
				if (trspSoSubSeq[i] != null)
					model.setTrspSoSubSeq(trspSoSubSeq[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (colN2ndRmk[i] != null)
					model.setColN2ndRmk(colN2ndRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (preColN1stRmk[i] != null)
					model.setPreColN1stRmk(preColN1stRmk[i]);
				if (cngCateCd[i] != null)
					model.setCngCateCd(cngCateCd[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (preColN2ndRmk[i] != null)
					model.setPreColN2ndRmk(preColN2ndRmk[i]);
				if (trspSoHisSeq[i] != null)
					model.setTrspSoHisSeq(trspSoHisSeq[i]);
				if (trspCngSubSeq[i] != null)
					model.setTrspCngSubSeq(trspCngSubSeq[i]);
				if (acptIndFlg[i] != null)
					model.setAcptIndFlg(acptIndFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsSvcOrdBkgCngHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsSvcOrdBkgCngHisVO[]
	 */
	public TrsSvcOrdBkgCngHisVO[] getTrsSvcOrdBkgCngHisVOs(){
		TrsSvcOrdBkgCngHisVO[] vos = (TrsSvcOrdBkgCngHisVO[])models.toArray(new TrsSvcOrdBkgCngHisVO[models.size()]);
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
		this.colN1stRmk = this.colN1stRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngCateSubCd = this.cngCateSubCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSubSeq = this.trspSoSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.colN2ndRmk = this.colN2ndRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preColN1stRmk = this.preColN1stRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngCateCd = this.cngCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.preColN2ndRmk = this.preColN2ndRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoHisSeq = this.trspSoHisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCngSubSeq = this.trspCngSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acptIndFlg = this.acptIndFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
