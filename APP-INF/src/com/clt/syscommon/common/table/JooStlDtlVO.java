/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : JooStlDtlVO.java
*@FileTitle : JooStlDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.21
*@LastModifier : 박희동
*@LastVersion : 1.0
* 2009.07.21 박희동 
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
 * @author 박희동
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class JooStlDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<JooStlDtlVO> models = new ArrayList<JooStlDtlVO>();
	
	/* Column Info */
	private String stlSeq = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bsaQty = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stlUsdAmt = null;
	/* Column Info */
	private String stlDtlSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String acctYrmon = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bsaSltPrc = null;
	/* Column Info */
	private String stlLoclAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stlVvdSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public JooStlDtlVO() {}

	public JooStlDtlVO(String ibflag, String pagerows, String acctYrmon, String stlVvdSeq, String stlSeq, String stlDtlSeq, String bsaQty, String bsaSltPrc, String stlLoclAmt, String stlUsdAmt, String creDt, String creUsrId, String updDt, String updUsrId) {
		this.stlSeq = stlSeq;
		this.updDt = updDt;
		this.bsaQty = bsaQty;
		this.creDt = creDt;
		this.stlUsdAmt = stlUsdAmt;
		this.stlDtlSeq = stlDtlSeq;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.acctYrmon = acctYrmon;
		this.creUsrId = creUsrId;
		this.bsaSltPrc = bsaSltPrc;
		this.stlLoclAmt = stlLoclAmt;
		this.updUsrId = updUsrId;
		this.stlVvdSeq = stlVvdSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("stl_seq", getStlSeq());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bsa_qty", getBsaQty());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stl_usd_amt", getStlUsdAmt());
		this.hashColumns.put("stl_dtl_seq", getStlDtlSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("acct_yrmon", getAcctYrmon());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bsa_slt_prc", getBsaSltPrc());
		this.hashColumns.put("stl_locl_amt", getStlLoclAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stl_vvd_seq", getStlVvdSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("stl_seq", "stlSeq");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bsa_qty", "bsaQty");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stl_usd_amt", "stlUsdAmt");
		this.hashFields.put("stl_dtl_seq", "stlDtlSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("acct_yrmon", "acctYrmon");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bsa_slt_prc", "bsaSltPrc");
		this.hashFields.put("stl_locl_amt", "stlLoclAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stl_vvd_seq", "stlVvdSeq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return stlSeq
	 */
	public String getStlSeq() {
		return this.stlSeq;
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
	 * @return bsaQty
	 */
	public String getBsaQty() {
		return this.bsaQty;
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
	 * @return stlUsdAmt
	 */
	public String getStlUsdAmt() {
		return this.stlUsdAmt;
	}
	
	/**
	 * Column Info
	 * @return stlDtlSeq
	 */
	public String getStlDtlSeq() {
		return this.stlDtlSeq;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return acctYrmon
	 */
	public String getAcctYrmon() {
		return this.acctYrmon;
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
	 * @return bsaSltPrc
	 */
	public String getBsaSltPrc() {
		return this.bsaSltPrc;
	}
	
	/**
	 * Column Info
	 * @return stlLoclAmt
	 */
	public String getStlLoclAmt() {
		return this.stlLoclAmt;
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
	 * @return stlVvdSeq
	 */
	public String getStlVvdSeq() {
		return this.stlVvdSeq;
	}
	

	/**
	 * Column Info
	 * @param stlSeq
	 */
	public void setStlSeq(String stlSeq) {
		this.stlSeq = stlSeq;
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
	 * @param bsaQty
	 */
	public void setBsaQty(String bsaQty) {
		this.bsaQty = bsaQty;
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
	 * @param stlUsdAmt
	 */
	public void setStlUsdAmt(String stlUsdAmt) {
		this.stlUsdAmt = stlUsdAmt;
	}
	
	/**
	 * Column Info
	 * @param stlDtlSeq
	 */
	public void setStlDtlSeq(String stlDtlSeq) {
		this.stlDtlSeq = stlDtlSeq;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param acctYrmon
	 */
	public void setAcctYrmon(String acctYrmon) {
		this.acctYrmon = acctYrmon;
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
	 * @param bsaSltPrc
	 */
	public void setBsaSltPrc(String bsaSltPrc) {
		this.bsaSltPrc = bsaSltPrc;
	}
	
	/**
	 * Column Info
	 * @param stlLoclAmt
	 */
	public void setStlLoclAmt(String stlLoclAmt) {
		this.stlLoclAmt = stlLoclAmt;
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
	 * @param stlVvdSeq
	 */
	public void setStlVvdSeq(String stlVvdSeq) {
		this.stlVvdSeq = stlVvdSeq;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setStlSeq(JSPUtil.getParameter(request, "stl_seq", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBsaQty(JSPUtil.getParameter(request, "bsa_qty", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStlUsdAmt(JSPUtil.getParameter(request, "stl_usd_amt", ""));
		setStlDtlSeq(JSPUtil.getParameter(request, "stl_dtl_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAcctYrmon(JSPUtil.getParameter(request, "acct_yrmon", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBsaSltPrc(JSPUtil.getParameter(request, "bsa_slt_prc", ""));
		setStlLoclAmt(JSPUtil.getParameter(request, "stl_locl_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStlVvdSeq(JSPUtil.getParameter(request, "stl_vvd_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return JooStlDtlVO[]
	 */
	public JooStlDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return JooStlDtlVO[]
	 */
	public JooStlDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		JooStlDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] stlSeq = (JSPUtil.getParameter(request, prefix	+ "stl_seq", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bsaQty = (JSPUtil.getParameter(request, prefix	+ "bsa_qty", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stlUsdAmt = (JSPUtil.getParameter(request, prefix	+ "stl_usd_amt", length));
			String[] stlDtlSeq = (JSPUtil.getParameter(request, prefix	+ "stl_dtl_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] acctYrmon = (JSPUtil.getParameter(request, prefix	+ "acct_yrmon", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bsaSltPrc = (JSPUtil.getParameter(request, prefix	+ "bsa_slt_prc", length));
			String[] stlLoclAmt = (JSPUtil.getParameter(request, prefix	+ "stl_locl_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stlVvdSeq = (JSPUtil.getParameter(request, prefix	+ "stl_vvd_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new JooStlDtlVO();
				if (stlSeq[i] != null)
					model.setStlSeq(stlSeq[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bsaQty[i] != null)
					model.setBsaQty(bsaQty[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stlUsdAmt[i] != null)
					model.setStlUsdAmt(stlUsdAmt[i]);
				if (stlDtlSeq[i] != null)
					model.setStlDtlSeq(stlDtlSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (acctYrmon[i] != null)
					model.setAcctYrmon(acctYrmon[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bsaSltPrc[i] != null)
					model.setBsaSltPrc(bsaSltPrc[i]);
				if (stlLoclAmt[i] != null)
					model.setStlLoclAmt(stlLoclAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stlVvdSeq[i] != null)
					model.setStlVvdSeq(stlVvdSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getJooStlDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return JooStlDtlVO[]
	 */
	public JooStlDtlVO[] getJooStlDtlVOs(){
		JooStlDtlVO[] vos = (JooStlDtlVO[])models.toArray(new JooStlDtlVO[models.size()]);
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
		this.stlSeq = this.stlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaQty = this.bsaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlUsdAmt = this.stlUsdAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlDtlSeq = this.stlDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acctYrmon = this.acctYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaSltPrc = this.bsaSltPrc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlLoclAmt = this.stlLoclAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stlVvdSeq = this.stlVvdSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
