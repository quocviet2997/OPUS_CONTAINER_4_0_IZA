/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMonQtaMdlExeVO.java
*@FileTitle : SaqMonQtaMdlExeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqMonQtaMdlExeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMonQtaMdlExeVO> models = new ArrayList<SaqMonQtaMdlExeVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fnlVerFlg = null;
	/* Column Info */
	private String exeUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String exeGdt = null;
	/* Column Info */
	private String bseYr = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slsFcastPubNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String mdlStGdt = null;
	/* Column Info */
	private String mdlEndGdt = null;
	/* Column Info */
	private String mqtaMdlVerNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String saqExeStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMonQtaMdlExeVO() {}

	public SaqMonQtaMdlExeVO(String ibflag, String pagerows, String mqtaMdlVerNo, String slsFcastPubNo, String saqExeStsCd, String bseYr, String bseQtrCd, String fnlVerFlg, String exeUsrId, String exeGdt, String mdlStGdt, String mdlEndGdt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.fnlVerFlg = fnlVerFlg;
		this.exeUsrId = exeUsrId;
		this.creDt = creDt;
		this.exeGdt = exeGdt;
		this.bseYr = bseYr;
		this.pagerows = pagerows;
		this.bseQtrCd = bseQtrCd;
		this.ibflag = ibflag;
		this.slsFcastPubNo = slsFcastPubNo;
		this.creUsrId = creUsrId;
		this.mdlStGdt = mdlStGdt;
		this.mdlEndGdt = mdlEndGdt;
		this.mqtaMdlVerNo = mqtaMdlVerNo;
		this.updUsrId = updUsrId;
		this.saqExeStsCd = saqExeStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("fnl_ver_flg", getFnlVerFlg());
		this.hashColumns.put("exe_usr_id", getExeUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("exe_gdt", getExeGdt());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sls_fcast_pub_no", getSlsFcastPubNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("mdl_st_gdt", getMdlStGdt());
		this.hashColumns.put("mdl_end_gdt", getMdlEndGdt());
		this.hashColumns.put("mqta_mdl_ver_no", getMqtaMdlVerNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("saq_exe_sts_cd", getSaqExeStsCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("fnl_ver_flg", "fnlVerFlg");
		this.hashFields.put("exe_usr_id", "exeUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("exe_gdt", "exeGdt");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sls_fcast_pub_no", "slsFcastPubNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("mdl_st_gdt", "mdlStGdt");
		this.hashFields.put("mdl_end_gdt", "mdlEndGdt");
		this.hashFields.put("mqta_mdl_ver_no", "mqtaMdlVerNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("saq_exe_sts_cd", "saqExeStsCd");
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
	 * @return fnlVerFlg
	 */
	public String getFnlVerFlg() {
		return this.fnlVerFlg;
	}
	
	/**
	 * Column Info
	 * @return exeUsrId
	 */
	public String getExeUsrId() {
		return this.exeUsrId;
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
	 * @return exeGdt
	 */
	public String getExeGdt() {
		return this.exeGdt;
	}
	
	/**
	 * Column Info
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
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
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
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
	 * @return slsFcastPubNo
	 */
	public String getSlsFcastPubNo() {
		return this.slsFcastPubNo;
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
	 * @return mdlStGdt
	 */
	public String getMdlStGdt() {
		return this.mdlStGdt;
	}
	
	/**
	 * Column Info
	 * @return mdlEndGdt
	 */
	public String getMdlEndGdt() {
		return this.mdlEndGdt;
	}
	
	/**
	 * Column Info
	 * @return mqtaMdlVerNo
	 */
	public String getMqtaMdlVerNo() {
		return this.mqtaMdlVerNo;
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
	 * @return saqExeStsCd
	 */
	public String getSaqExeStsCd() {
		return this.saqExeStsCd;
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
	 * @param fnlVerFlg
	 */
	public void setFnlVerFlg(String fnlVerFlg) {
		this.fnlVerFlg = fnlVerFlg;
	}
	
	/**
	 * Column Info
	 * @param exeUsrId
	 */
	public void setExeUsrId(String exeUsrId) {
		this.exeUsrId = exeUsrId;
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
	 * @param exeGdt
	 */
	public void setExeGdt(String exeGdt) {
		this.exeGdt = exeGdt;
	}
	
	/**
	 * Column Info
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
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
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
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
	 * @param slsFcastPubNo
	 */
	public void setSlsFcastPubNo(String slsFcastPubNo) {
		this.slsFcastPubNo = slsFcastPubNo;
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
	 * @param mdlStGdt
	 */
	public void setMdlStGdt(String mdlStGdt) {
		this.mdlStGdt = mdlStGdt;
	}
	
	/**
	 * Column Info
	 * @param mdlEndGdt
	 */
	public void setMdlEndGdt(String mdlEndGdt) {
		this.mdlEndGdt = mdlEndGdt;
	}
	
	/**
	 * Column Info
	 * @param mqtaMdlVerNo
	 */
	public void setMqtaMdlVerNo(String mqtaMdlVerNo) {
		this.mqtaMdlVerNo = mqtaMdlVerNo;
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
	 * @param saqExeStsCd
	 */
	public void setSaqExeStsCd(String saqExeStsCd) {
		this.saqExeStsCd = saqExeStsCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFnlVerFlg(JSPUtil.getParameter(request, "fnl_ver_flg", ""));
		setExeUsrId(JSPUtil.getParameter(request, "exe_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setExeGdt(JSPUtil.getParameter(request, "exe_gdt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSlsFcastPubNo(JSPUtil.getParameter(request, "sls_fcast_pub_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setMdlStGdt(JSPUtil.getParameter(request, "mdl_st_gdt", ""));
		setMdlEndGdt(JSPUtil.getParameter(request, "mdl_end_gdt", ""));
		setMqtaMdlVerNo(JSPUtil.getParameter(request, "mqta_mdl_ver_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSaqExeStsCd(JSPUtil.getParameter(request, "saq_exe_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMonQtaMdlExeVO[]
	 */
	public SaqMonQtaMdlExeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMonQtaMdlExeVO[]
	 */
	public SaqMonQtaMdlExeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMonQtaMdlExeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fnlVerFlg = (JSPUtil.getParameter(request, prefix	+ "fnl_ver_flg", length));
			String[] exeUsrId = (JSPUtil.getParameter(request, prefix	+ "exe_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] exeGdt = (JSPUtil.getParameter(request, prefix	+ "exe_gdt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slsFcastPubNo = (JSPUtil.getParameter(request, prefix	+ "sls_fcast_pub_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] mdlStGdt = (JSPUtil.getParameter(request, prefix	+ "mdl_st_gdt", length));
			String[] mdlEndGdt = (JSPUtil.getParameter(request, prefix	+ "mdl_end_gdt", length));
			String[] mqtaMdlVerNo = (JSPUtil.getParameter(request, prefix	+ "mqta_mdl_ver_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] saqExeStsCd = (JSPUtil.getParameter(request, prefix	+ "saq_exe_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMonQtaMdlExeVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fnlVerFlg[i] != null)
					model.setFnlVerFlg(fnlVerFlg[i]);
				if (exeUsrId[i] != null)
					model.setExeUsrId(exeUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (exeGdt[i] != null)
					model.setExeGdt(exeGdt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slsFcastPubNo[i] != null)
					model.setSlsFcastPubNo(slsFcastPubNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (mdlStGdt[i] != null)
					model.setMdlStGdt(mdlStGdt[i]);
				if (mdlEndGdt[i] != null)
					model.setMdlEndGdt(mdlEndGdt[i]);
				if (mqtaMdlVerNo[i] != null)
					model.setMqtaMdlVerNo(mqtaMdlVerNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (saqExeStsCd[i] != null)
					model.setSaqExeStsCd(saqExeStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMonQtaMdlExeVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqMonQtaMdlExeVO[]
	 */
	public SaqMonQtaMdlExeVO[] getSaqMonQtaMdlExeVOs(){
		SaqMonQtaMdlExeVO[] vos = (SaqMonQtaMdlExeVO[])models.toArray(new SaqMonQtaMdlExeVO[models.size()]);
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
		this.fnlVerFlg = this.fnlVerFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeUsrId = this.exeUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeGdt = this.exeGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsFcastPubNo = this.slsFcastPubNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlStGdt = this.mdlStGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlEndGdt = this.mdlEndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaMdlVerNo = this.mqtaMdlVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.saqExeStsCd = this.saqExeStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
