/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqYryQtaMdlExeVO.java
*@FileTitle : SaqYryQtaMdlExeVO
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

public class SaqYryQtaMdlExeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqYryQtaMdlExeVO> models = new ArrayList<SaqYryQtaMdlExeVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String toMon = null;
	/* Column Info */
	private String fnlVerFlg = null;
	/* Column Info */
	private String exeUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String plnScnrNo = null;
	/* Column Info */
	private String exeGdt = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String fmMon = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String yqtaMdlVerNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slsFcastPubNo = null;
	/* Column Info */
	private String mdlStGdt = null;
	/* Column Info */
	private String mdlEndGdt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String saqExeStsCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqYryQtaMdlExeVO() {}

	public SaqYryQtaMdlExeVO(String ibflag, String pagerows, String yqtaMdlVerNo, String plnScnrNo, String slsFcastPubNo, String saqExeStsCd, String bseYr, String fmMon, String toMon, String fnlVerFlg, String exeUsrId, String exeGdt, String mdlStGdt, String mdlEndGdt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.toMon = toMon;
		this.fnlVerFlg = fnlVerFlg;
		this.exeUsrId = exeUsrId;
		this.creDt = creDt;
		this.plnScnrNo = plnScnrNo;
		this.exeGdt = exeGdt;
		this.bseYr = bseYr;
		this.fmMon = fmMon;
		this.pagerows = pagerows;
		this.yqtaMdlVerNo = yqtaMdlVerNo;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.slsFcastPubNo = slsFcastPubNo;
		this.mdlStGdt = mdlStGdt;
		this.mdlEndGdt = mdlEndGdt;
		this.updUsrId = updUsrId;
		this.saqExeStsCd = saqExeStsCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("to_mon", getToMon());
		this.hashColumns.put("fnl_ver_flg", getFnlVerFlg());
		this.hashColumns.put("exe_usr_id", getExeUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pln_scnr_no", getPlnScnrNo());
		this.hashColumns.put("exe_gdt", getExeGdt());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("fm_mon", getFmMon());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("yqta_mdl_ver_no", getYqtaMdlVerNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sls_fcast_pub_no", getSlsFcastPubNo());
		this.hashColumns.put("mdl_st_gdt", getMdlStGdt());
		this.hashColumns.put("mdl_end_gdt", getMdlEndGdt());
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
		this.hashFields.put("to_mon", "toMon");
		this.hashFields.put("fnl_ver_flg", "fnlVerFlg");
		this.hashFields.put("exe_usr_id", "exeUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pln_scnr_no", "plnScnrNo");
		this.hashFields.put("exe_gdt", "exeGdt");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("fm_mon", "fmMon");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("yqta_mdl_ver_no", "yqtaMdlVerNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sls_fcast_pub_no", "slsFcastPubNo");
		this.hashFields.put("mdl_st_gdt", "mdlStGdt");
		this.hashFields.put("mdl_end_gdt", "mdlEndGdt");
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
	 * @return toMon
	 */
	public String getToMon() {
		return this.toMon;
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
	 * @return plnScnrNo
	 */
	public String getPlnScnrNo() {
		return this.plnScnrNo;
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
	 * Column Info
	 * @return fmMon
	 */
	public String getFmMon() {
		return this.fmMon;
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
	 * @return yqtaMdlVerNo
	 */
	public String getYqtaMdlVerNo() {
		return this.yqtaMdlVerNo;
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
	 * @return slsFcastPubNo
	 */
	public String getSlsFcastPubNo() {
		return this.slsFcastPubNo;
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
	 * @param toMon
	 */
	public void setToMon(String toMon) {
		this.toMon = toMon;
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
	 * @param plnScnrNo
	 */
	public void setPlnScnrNo(String plnScnrNo) {
		this.plnScnrNo = plnScnrNo;
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
	 * Column Info
	 * @param fmMon
	 */
	public void setFmMon(String fmMon) {
		this.fmMon = fmMon;
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
	 * @param yqtaMdlVerNo
	 */
	public void setYqtaMdlVerNo(String yqtaMdlVerNo) {
		this.yqtaMdlVerNo = yqtaMdlVerNo;
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
	 * @param slsFcastPubNo
	 */
	public void setSlsFcastPubNo(String slsFcastPubNo) {
		this.slsFcastPubNo = slsFcastPubNo;
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
		setToMon(JSPUtil.getParameter(request, "to_mon", ""));
		setFnlVerFlg(JSPUtil.getParameter(request, "fnl_ver_flg", ""));
		setExeUsrId(JSPUtil.getParameter(request, "exe_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPlnScnrNo(JSPUtil.getParameter(request, "pln_scnr_no", ""));
		setExeGdt(JSPUtil.getParameter(request, "exe_gdt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setFmMon(JSPUtil.getParameter(request, "fm_mon", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setYqtaMdlVerNo(JSPUtil.getParameter(request, "yqta_mdl_ver_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSlsFcastPubNo(JSPUtil.getParameter(request, "sls_fcast_pub_no", ""));
		setMdlStGdt(JSPUtil.getParameter(request, "mdl_st_gdt", ""));
		setMdlEndGdt(JSPUtil.getParameter(request, "mdl_end_gdt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSaqExeStsCd(JSPUtil.getParameter(request, "saq_exe_sts_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqYryQtaMdlExeVO[]
	 */
	public SaqYryQtaMdlExeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqYryQtaMdlExeVO[]
	 */
	public SaqYryQtaMdlExeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqYryQtaMdlExeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toMon = (JSPUtil.getParameter(request, prefix	+ "to_mon", length));
			String[] fnlVerFlg = (JSPUtil.getParameter(request, prefix	+ "fnl_ver_flg", length));
			String[] exeUsrId = (JSPUtil.getParameter(request, prefix	+ "exe_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] plnScnrNo = (JSPUtil.getParameter(request, prefix	+ "pln_scnr_no", length));
			String[] exeGdt = (JSPUtil.getParameter(request, prefix	+ "exe_gdt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] fmMon = (JSPUtil.getParameter(request, prefix	+ "fm_mon", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] yqtaMdlVerNo = (JSPUtil.getParameter(request, prefix	+ "yqta_mdl_ver_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slsFcastPubNo = (JSPUtil.getParameter(request, prefix	+ "sls_fcast_pub_no", length));
			String[] mdlStGdt = (JSPUtil.getParameter(request, prefix	+ "mdl_st_gdt", length));
			String[] mdlEndGdt = (JSPUtil.getParameter(request, prefix	+ "mdl_end_gdt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] saqExeStsCd = (JSPUtil.getParameter(request, prefix	+ "saq_exe_sts_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqYryQtaMdlExeVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toMon[i] != null)
					model.setToMon(toMon[i]);
				if (fnlVerFlg[i] != null)
					model.setFnlVerFlg(fnlVerFlg[i]);
				if (exeUsrId[i] != null)
					model.setExeUsrId(exeUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (plnScnrNo[i] != null)
					model.setPlnScnrNo(plnScnrNo[i]);
				if (exeGdt[i] != null)
					model.setExeGdt(exeGdt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (fmMon[i] != null)
					model.setFmMon(fmMon[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (yqtaMdlVerNo[i] != null)
					model.setYqtaMdlVerNo(yqtaMdlVerNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slsFcastPubNo[i] != null)
					model.setSlsFcastPubNo(slsFcastPubNo[i]);
				if (mdlStGdt[i] != null)
					model.setMdlStGdt(mdlStGdt[i]);
				if (mdlEndGdt[i] != null)
					model.setMdlEndGdt(mdlEndGdt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (saqExeStsCd[i] != null)
					model.setSaqExeStsCd(saqExeStsCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqYryQtaMdlExeVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqYryQtaMdlExeVO[]
	 */
	public SaqYryQtaMdlExeVO[] getSaqYryQtaMdlExeVOs(){
		SaqYryQtaMdlExeVO[] vos = (SaqYryQtaMdlExeVO[])models.toArray(new SaqYryQtaMdlExeVO[models.size()]);
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
		this.toMon = this.toMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fnlVerFlg = this.fnlVerFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeUsrId = this.exeUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnScnrNo = this.plnScnrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeGdt = this.exeGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmMon = this.fmMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaMdlVerNo = this.yqtaMdlVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slsFcastPubNo = this.slsFcastPubNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlStGdt = this.mdlStGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlEndGdt = this.mdlEndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.saqExeStsCd = this.saqExeStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
