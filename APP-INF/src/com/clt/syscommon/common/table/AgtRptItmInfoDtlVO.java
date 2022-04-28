/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AgtRptItmInfoDtlVO.java
*@FileTitle : AgtRptItmInfoDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.20
*@LastModifier : 추경원
*@LastVersion : 1.0
* 2009.08.20 추경원 
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
 * @author 추경원
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtRptItmInfoDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtRptItmInfoDtlVO> models = new ArrayList<AgtRptItmInfoDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String slctItmFomSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String rptItmColNm = null;
	/* Column Info */
	private String rptUsrId = null;
	/* Column Info */
	private String rptItmCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rptItmDesc = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtRptItmInfoDtlVO() {}

	public AgtRptItmInfoDtlVO(String ibflag, String pagerows, String rptUsrId, String slctItmFomSeq, String rptItmCd, String rptItmDesc, String rptItmColNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.slctItmFomSeq = slctItmFomSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.rptItmColNm = rptItmColNm;
		this.rptUsrId = rptUsrId;
		this.rptItmCd = rptItmCd;
		this.creDt = creDt;
		this.rptItmDesc = rptItmDesc;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("slct_itm_fom_seq", getSlctItmFomSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("rpt_itm_col_nm", getRptItmColNm());
		this.hashColumns.put("rpt_usr_id", getRptUsrId());
		this.hashColumns.put("rpt_itm_cd", getRptItmCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rpt_itm_desc", getRptItmDesc());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("slct_itm_fom_seq", "slctItmFomSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("rpt_itm_col_nm", "rptItmColNm");
		this.hashFields.put("rpt_usr_id", "rptUsrId");
		this.hashFields.put("rpt_itm_cd", "rptItmCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rpt_itm_desc", "rptItmDesc");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return slctItmFomSeq
	 */
	public String getSlctItmFomSeq() {
		return this.slctItmFomSeq;
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
	 * @return rptItmColNm
	 */
	public String getRptItmColNm() {
		return this.rptItmColNm;
	}
	
	/**
	 * Column Info
	 * @return rptUsrId
	 */
	public String getRptUsrId() {
		return this.rptUsrId;
	}
	
	/**
	 * Column Info
	 * @return rptItmCd
	 */
	public String getRptItmCd() {
		return this.rptItmCd;
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
	 * @return rptItmDesc
	 */
	public String getRptItmDesc() {
		return this.rptItmDesc;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param slctItmFomSeq
	 */
	public void setSlctItmFomSeq(String slctItmFomSeq) {
		this.slctItmFomSeq = slctItmFomSeq;
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
	 * @param rptItmColNm
	 */
	public void setRptItmColNm(String rptItmColNm) {
		this.rptItmColNm = rptItmColNm;
	}
	
	/**
	 * Column Info
	 * @param rptUsrId
	 */
	public void setRptUsrId(String rptUsrId) {
		this.rptUsrId = rptUsrId;
	}
	
	/**
	 * Column Info
	 * @param rptItmCd
	 */
	public void setRptItmCd(String rptItmCd) {
		this.rptItmCd = rptItmCd;
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
	 * @param rptItmDesc
	 */
	public void setRptItmDesc(String rptItmDesc) {
		this.rptItmDesc = rptItmDesc;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSlctItmFomSeq(JSPUtil.getParameter(request, "slct_itm_fom_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setRptItmColNm(JSPUtil.getParameter(request, "rpt_itm_col_nm", ""));
		setRptUsrId(JSPUtil.getParameter(request, "rpt_usr_id", ""));
		setRptItmCd(JSPUtil.getParameter(request, "rpt_itm_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRptItmDesc(JSPUtil.getParameter(request, "rpt_itm_desc", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtRptItmInfoDtlVO[]
	 */
	public AgtRptItmInfoDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtRptItmInfoDtlVO[]
	 */
	public AgtRptItmInfoDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtRptItmInfoDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] slctItmFomSeq = (JSPUtil.getParameter(request, prefix	+ "slct_itm_fom_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] rptItmColNm = (JSPUtil.getParameter(request, prefix	+ "rpt_itm_col_nm", length));
			String[] rptUsrId = (JSPUtil.getParameter(request, prefix	+ "rpt_usr_id", length));
			String[] rptItmCd = (JSPUtil.getParameter(request, prefix	+ "rpt_itm_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rptItmDesc = (JSPUtil.getParameter(request, prefix	+ "rpt_itm_desc", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtRptItmInfoDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (slctItmFomSeq[i] != null)
					model.setSlctItmFomSeq(slctItmFomSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (rptItmColNm[i] != null)
					model.setRptItmColNm(rptItmColNm[i]);
				if (rptUsrId[i] != null)
					model.setRptUsrId(rptUsrId[i]);
				if (rptItmCd[i] != null)
					model.setRptItmCd(rptItmCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rptItmDesc[i] != null)
					model.setRptItmDesc(rptItmDesc[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtRptItmInfoDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtRptItmInfoDtlVO[]
	 */
	public AgtRptItmInfoDtlVO[] getAgtRptItmInfoDtlVOs(){
		AgtRptItmInfoDtlVO[] vos = (AgtRptItmInfoDtlVO[])models.toArray(new AgtRptItmInfoDtlVO[models.size()]);
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
		this.slctItmFomSeq = this.slctItmFomSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptItmColNm = this.rptItmColNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptUsrId = this.rptUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptItmCd = this.rptItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptItmDesc = this.rptItmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
