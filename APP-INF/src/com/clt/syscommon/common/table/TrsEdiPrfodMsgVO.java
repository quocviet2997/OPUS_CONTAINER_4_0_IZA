/*=========================================================
*Copyright(c) 2018 CyberLogitec
*@FileName : TrsEdiPrfodMsgVO.java
*@FileTitle : TrsEdiPrfodMsgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2018.04.16
*@LastModifier : 
*@LastVersion : 1.0
* 2018.04.16  
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

public class TrsEdiPrfodMsgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsEdiPrfodMsgVO> models = new ArrayList<TrsEdiPrfodMsgVO>();
	
	/* Column Info */
	private String ifRmk = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String prfodMsgSeq = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String prfodDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String emlSndNo = null;
	/* Column Info */
	private String ifFlg = null;
	/* Column Info */
	private String ediRefId = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public TrsEdiPrfodMsgVO() {}

	public TrsEdiPrfodMsgVO(String ibflag, String pagerows, String blNo, String cntrNo, String prfodMsgSeq, String prfodDt, String ediRefId, String ifFlg, String ifRmk, String emlSndNo, String creDt) {
		this.ifRmk = ifRmk;
		this.ibflag = ibflag;
		this.prfodMsgSeq = prfodMsgSeq;
		this.cntrNo = cntrNo;
		this.prfodDt = prfodDt;
		this.creDt = creDt;
		this.emlSndNo = emlSndNo;
		this.ifFlg = ifFlg;
		this.ediRefId = ediRefId;
		this.blNo = blNo;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("if_rmk", getIfRmk());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("prfod_msg_seq", getPrfodMsgSeq());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("prfod_dt", getPrfodDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eml_snd_no", getEmlSndNo());
		this.hashColumns.put("if_flg", getIfFlg());
		this.hashColumns.put("edi_ref_id", getEdiRefId());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("if_rmk", "ifRmk");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("prfod_msg_seq", "prfodMsgSeq");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("prfod_dt", "prfodDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eml_snd_no", "emlSndNo");
		this.hashFields.put("if_flg", "ifFlg");
		this.hashFields.put("edi_ref_id", "ediRefId");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return ifRmk
	 */
	public String getIfRmk() {
		return this.ifRmk;
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
	 * @return prfodMsgSeq
	 */
	public String getPrfodMsgSeq() {
		return this.prfodMsgSeq;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return prfodDt
	 */
	public String getPrfodDt() {
		return this.prfodDt;
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
	 * @return emlSndNo
	 */
	public String getEmlSndNo() {
		return this.emlSndNo;
	}
	
	/**
	 * Column Info
	 * @return ifFlg
	 */
	public String getIfFlg() {
		return this.ifFlg;
	}
	
	/**
	 * Column Info
	 * @return ediRefId
	 */
	public String getEdiRefId() {
		return this.ediRefId;
	}
	
	/**
	 * Column Info
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @param ifRmk
	 */
	public void setIfRmk(String ifRmk) {
		this.ifRmk = ifRmk;
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
	 * @param prfodMsgSeq
	 */
	public void setPrfodMsgSeq(String prfodMsgSeq) {
		this.prfodMsgSeq = prfodMsgSeq;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param prfodDt
	 */
	public void setPrfodDt(String prfodDt) {
		this.prfodDt = prfodDt;
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
	 * @param emlSndNo
	 */
	public void setEmlSndNo(String emlSndNo) {
		this.emlSndNo = emlSndNo;
	}
	
	/**
	 * Column Info
	 * @param ifFlg
	 */
	public void setIfFlg(String ifFlg) {
		this.ifFlg = ifFlg;
	}
	
	/**
	 * Column Info
	 * @param ediRefId
	 */
	public void setEdiRefId(String ediRefId) {
		this.ediRefId = ediRefId;
	}
	
	/**
	 * Column Info
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
		setIfRmk(JSPUtil.getParameter(request, prefix + "if_rmk", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setPrfodMsgSeq(JSPUtil.getParameter(request, prefix + "prfod_msg_seq", ""));
		setCntrNo(JSPUtil.getParameter(request, prefix + "cntr_no", ""));
		setPrfodDt(JSPUtil.getParameter(request, prefix + "prfod_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEmlSndNo(JSPUtil.getParameter(request, prefix + "eml_snd_no", ""));
		setIfFlg(JSPUtil.getParameter(request, prefix + "if_flg", ""));
		setEdiRefId(JSPUtil.getParameter(request, prefix + "edi_ref_id", ""));
		setBlNo(JSPUtil.getParameter(request, prefix + "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsEdiPrfodMsgVO[]
	 */
	public TrsEdiPrfodMsgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsEdiPrfodMsgVO[]
	 */
	public TrsEdiPrfodMsgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsEdiPrfodMsgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ifRmk = (JSPUtil.getParameter(request, prefix	+ "if_rmk", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] prfodMsgSeq = (JSPUtil.getParameter(request, prefix	+ "prfod_msg_seq", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] prfodDt = (JSPUtil.getParameter(request, prefix	+ "prfod_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] emlSndNo = (JSPUtil.getParameter(request, prefix	+ "eml_snd_no", length));
			String[] ifFlg = (JSPUtil.getParameter(request, prefix	+ "if_flg", length));
			String[] ediRefId = (JSPUtil.getParameter(request, prefix	+ "edi_ref_id", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsEdiPrfodMsgVO();
				if (ifRmk[i] != null)
					model.setIfRmk(ifRmk[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (prfodMsgSeq[i] != null)
					model.setPrfodMsgSeq(prfodMsgSeq[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (prfodDt[i] != null)
					model.setPrfodDt(prfodDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (emlSndNo[i] != null)
					model.setEmlSndNo(emlSndNo[i]);
				if (ifFlg[i] != null)
					model.setIfFlg(ifFlg[i]);
				if (ediRefId[i] != null)
					model.setEdiRefId(ediRefId[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsEdiPrfodMsgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsEdiPrfodMsgVO[]
	 */
	public TrsEdiPrfodMsgVO[] getTrsEdiPrfodMsgVOs(){
		TrsEdiPrfodMsgVO[] vos = (TrsEdiPrfodMsgVO[])models.toArray(new TrsEdiPrfodMsgVO[models.size()]);
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
		this.ifRmk = this.ifRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prfodMsgSeq = this.prfodMsgSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prfodDt = this.prfodDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.emlSndNo = this.emlSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifFlg = this.ifFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRefId = this.ediRefId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
