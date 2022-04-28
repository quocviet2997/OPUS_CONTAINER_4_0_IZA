/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrInpDatRedLgtAltVO.java
*@FileTitle : EqrInpDatRedLgtAltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.21
*@LastModifier : 정은호
*@LastVersion : 1.0
* 2009.07.21 정은호 
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
 * @author 정은호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrInpDatRedLgtAltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrInpDatRedLgtAltVO> models = new ArrayList<EqrInpDatRedLgtAltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String altCostAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntrSzCd = null;
	/* Column Info */
	private String altBseCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rccCd = null;
	/* Column Info */
	private String altItmDivCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String vslDlayDys = null;
	/* Page Number */
	private String pagerows = null;
	
	/* input parameter */
	private String  altCostAmtUsnyc     	= "";
	private String  altBseCdUsnyc     		= "";
	private String  altCostAmtDeham     	= "";
	private String  altBseCdDeham     		= "";
	private String  altCostAmtSgsin     	= "";
	private String  altBseCdSgsin     		= "";
	private String  altCostAmtKrsel     	= "";
	private String  altBseCdKrsel     		= "";
	private String  altCostAmtCnhkg     	= "";
	private String  altBseCdCnhkg     		= "";
	private String  altCostAmtCnsha     	= "";
	private String  altBseCdCnsha     		= "";
	private String  altCostAmtJptyo     	= "";
	private String  altBseCdJptyo     		= "";
	private String  altCostAmtTwtpe     	= "";
	private String  altBseCdTwtpe     		= "";

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrInpDatRedLgtAltVO() {}

	public EqrInpDatRedLgtAltVO(String ibflag, String pagerows, String rccCd, String altItmDivCd, String cntrSzCd, String altCostAmt, String altBseCd, String vslDlayDys, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.altCostAmt = altCostAmt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.cntrSzCd = cntrSzCd;
		this.altBseCd = altBseCd;
		this.creDt = creDt;
		this.rccCd = rccCd;
		this.altItmDivCd = altItmDivCd;
		this.updUsrId = updUsrId;
		this.vslDlayDys = vslDlayDys;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("alt_cost_amt", getAltCostAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cntr_sz_cd", getCntrSzCd());
		this.hashColumns.put("alt_bse_cd", getAltBseCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("alt_itm_div_cd", getAltItmDivCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("vsl_dlay_dys", getVslDlayDys());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("alt_cost_amt", "altCostAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cntr_sz_cd", "cntrSzCd");
		this.hashFields.put("alt_bse_cd", "altBseCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("alt_itm_div_cd", "altItmDivCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("vsl_dlay_dys", "vslDlayDys");
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
	 * @return altCostAmt
	 */
	public String getAltCostAmt() {
		return this.altCostAmt;
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
	 * @return cntrSzCd
	 */
	public String getCntrSzCd() {
		return this.cntrSzCd;
	}
	
	/**
	 * Column Info
	 * @return altBseCd
	 */
	public String getAltBseCd() {
		return this.altBseCd;
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
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
	}
	
	/**
	 * Column Info
	 * @return altItmDivCd
	 */
	public String getAltItmDivCd() {
		return this.altItmDivCd;
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
	 * @return vslDlayDys
	 */
	public String getVslDlayDys() {
		return this.vslDlayDys;
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
	 * @param altCostAmt
	 */
	public void setAltCostAmt(String altCostAmt) {
		this.altCostAmt = altCostAmt;
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
	 * @param cntrSzCd
	 */
	public void setCntrSzCd(String cntrSzCd) {
		this.cntrSzCd = cntrSzCd;
	}
	
	/**
	 * Column Info
	 * @param altBseCd
	 */
	public void setAltBseCd(String altBseCd) {
		this.altBseCd = altBseCd;
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
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
	}
	
	/**
	 * Column Info
	 * @param altItmDivCd
	 */
	public void setAltItmDivCd(String altItmDivCd) {
		this.altItmDivCd = altItmDivCd;
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
	 * @param vslDlayDys
	 */
	public void setVslDlayDys(String vslDlayDys) {
		this.vslDlayDys = vslDlayDys;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	public String getAltCostAmtUsnyc() {
		return altCostAmtUsnyc;
	}

	public void setAltCostAmtUsnyc(String altCostAmtUsnyc) {
		this.altCostAmtUsnyc = altCostAmtUsnyc;
	}

	public String getAltBseCdUsnyc() {
		return altBseCdUsnyc;
	}

	public void setAltBseCdUsnyc(String altBseCdUsnyc) {
		this.altBseCdUsnyc = altBseCdUsnyc;
	}

	public String getAltCostAmtDeham() {
		return altCostAmtDeham;
	}

	public void setAltCostAmtDeham(String altCostAmtDeham) {
		this.altCostAmtDeham = altCostAmtDeham;
	}

	public String getAltBseCdDeham() {
		return altBseCdDeham;
	}

	public void setAltBseCdDeham(String altBseCdDeham) {
		this.altBseCdDeham = altBseCdDeham;
	}

	public String getAltCostAmtSgsin() {
		return altCostAmtSgsin;
	}

	public void setAltCostAmtSgsin(String altCostAmtSgsin) {
		this.altCostAmtSgsin = altCostAmtSgsin;
	}

	public String getAltBseCdSgsin() {
		return altBseCdSgsin;
	}

	public void setAltBseCdSgsin(String altBseCdSgsin) {
		this.altBseCdSgsin = altBseCdSgsin;
	}

	public String getAltCostAmtKrsel() {
		return altCostAmtKrsel;
	}

	public void setAltCostAmtKrsel(String altCostAmtKrsel) {
		this.altCostAmtKrsel = altCostAmtKrsel;
	}

	public String getAltBseCdKrsel() {
		return altBseCdKrsel;
	}

	public void setAltBseCdKrsel(String altBseCdKrsel) {
		this.altBseCdKrsel = altBseCdKrsel;
	}

	public String getAltCostAmtCnhkg() {
		return altCostAmtCnhkg;
	}

	public void setAltCostAmtCnhkg(String altCostAmtCnhkg) {
		this.altCostAmtCnhkg = altCostAmtCnhkg;
	}

	public String getAltBseCdCnhkg() {
		return altBseCdCnhkg;
	}

	public void setAltBseCdCnhkg(String altBseCdCnhkg) {
		this.altBseCdCnhkg = altBseCdCnhkg;
	}

	public String getAltCostAmtCnsha() {
		return altCostAmtCnsha;
	}

	public void setAltCostAmtCnsha(String altCostAmtCnsha) {
		this.altCostAmtCnsha = altCostAmtCnsha;
	}

	public String getAltBseCdCnsha() {
		return altBseCdCnsha;
	}

	public void setAltBseCdCnsha(String altBseCdCnsha) {
		this.altBseCdCnsha = altBseCdCnsha;
	}

	public String getAltCostAmtJptyo() {
		return altCostAmtJptyo;
	}

	public void setAltCostAmtJptyo(String altCostAmtJptyo) {
		this.altCostAmtJptyo = altCostAmtJptyo;
	}

	public String getAltBseCdJptyo() {
		return altBseCdJptyo;
	}

	public void setAltBseCdJptyo(String altBseCdJptyo) {
		this.altBseCdJptyo = altBseCdJptyo;
	}

	public String getAltCostAmtTwtpe() {
		return altCostAmtTwtpe;
	}

	public void setAltCostAmtTwtpe(String altCostAmtTwtpe) {
		this.altCostAmtTwtpe = altCostAmtTwtpe;
	}

	public String getAltBseCdTwtpe() {
		return altBseCdTwtpe;
	}

	public void setAltBseCdTwtpe(String altBseCdTwtpe) {
		this.altBseCdTwtpe = altBseCdTwtpe;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAltCostAmt(JSPUtil.getParameter(request, "alt_cost_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntrSzCd(JSPUtil.getParameter(request, "cntr_sz_cd", ""));
		setAltBseCd(JSPUtil.getParameter(request, "alt_bse_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRccCd(JSPUtil.getParameter(request, "rcc_cd", ""));
		setAltItmDivCd(JSPUtil.getParameter(request, "alt_itm_div_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setVslDlayDys(JSPUtil.getParameter(request, "vsl_dlay_dys", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrInpDatRedLgtAltVO[]
	 */
	public EqrInpDatRedLgtAltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrInpDatRedLgtAltVO[]
	 */
	public EqrInpDatRedLgtAltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrInpDatRedLgtAltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] altCostAmt = (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntrSzCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sz_cd", length));
			String[] altBseCd = (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] altItmDivCd = (JSPUtil.getParameter(request, prefix	+ "alt_itm_div_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] vslDlayDys = (JSPUtil.getParameter(request, prefix	+ "vsl_dlay_dys", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			// 입력 파라메타 설정
			String[]  altCostAmtUsnyc     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_usnyc", length));
			String[]  altBseCdUsnyc     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_usnyc", length));
			String[]  altCostAmtDeham     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_deham", length));
			String[]  altBseCdDeham     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_deham", length));
			String[]  altCostAmtSgsin     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_sgsin", length));
			String[]  altBseCdSgsin     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_sgsin", length));
			String[]  altCostAmtKrsel     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_krsel", length));
			String[]  altBseCdKrsel     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_krsel", length));
			String[]  altCostAmtCnhkg     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_cnhkg", length));
			String[]  altBseCdCnhkg     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_cnhkg", length));
			String[]  altCostAmtCnsha     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_cnsha", length));
			String[]  altBseCdCnsha     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_cnsha", length));
			String[]  altCostAmtJptyo     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_jptyo", length));
			String[]  altBseCdJptyo     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_jptyo", length));
			String[]  altCostAmtTwtpe     	= (JSPUtil.getParameter(request, prefix	+ "alt_cost_amt_twtpe", length));
			String[]  altBseCdTwtpe     		= (JSPUtil.getParameter(request, prefix	+ "alt_bse_cd_twtpe", length));

			
			for (int i = 0; i < length; i++) {
				model = new EqrInpDatRedLgtAltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (altCostAmt[i] != null)
					model.setAltCostAmt(altCostAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntrSzCd[i] != null)
					model.setCntrSzCd(cntrSzCd[i]);
				if (altBseCd[i] != null)
					model.setAltBseCd(altBseCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (altItmDivCd[i] != null)
					model.setAltItmDivCd(altItmDivCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (vslDlayDys[i] != null)
					model.setVslDlayDys(vslDlayDys[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (altCostAmtUsnyc[i] != null)
					model.setAltCostAmtUsnyc(altCostAmtUsnyc[i]);
				if (altBseCdUsnyc[i] != null)
					model.setAltBseCdUsnyc(altBseCdUsnyc[i]);
				if (altCostAmtDeham[i] != null)
					model.setAltCostAmtDeham(altCostAmtDeham[i]);
				if (altBseCdDeham[i] != null)
					model.setAltBseCdDeham(altBseCdDeham[i]);
				if (altCostAmtSgsin[i] != null)
					model.setAltCostAmtSgsin(altCostAmtSgsin[i]);
				if (altBseCdSgsin[i] != null)
					model.setAltBseCdSgsin(altBseCdSgsin[i]);
				if (altCostAmtKrsel[i] != null)
					model.setAltCostAmtKrsel(altCostAmtKrsel[i]);
				if (altBseCdKrsel[i] != null)
					model.setAltBseCdKrsel(altBseCdKrsel[i]);
				if (altBseCdCnhkg[i] != null)
					model.setAltBseCdCnhkg(altBseCdCnhkg[i]);
				if (altCostAmtCnsha[i] != null)
					model.setAltCostAmtCnsha(altCostAmtCnsha[i]);
				if (altBseCdCnsha[i] != null)
					model.setAltBseCdCnsha(altBseCdCnsha[i]);
				if (altCostAmtJptyo[i] != null)
					model.setAltCostAmtJptyo(altCostAmtJptyo[i]);
				if (altBseCdJptyo[i] != null)
					model.setAltBseCdJptyo(altBseCdJptyo[i]);
				if (altCostAmtTwtpe[i] != null)
					model.setAltCostAmtTwtpe(altCostAmtTwtpe[i]);
				if (altBseCdTwtpe[i] != null)
					model.setAltBseCdTwtpe(altBseCdTwtpe[i]);
				if (altCostAmtCnhkg[i] != null)
					model.setAltCostAmtCnhkg(altCostAmtCnhkg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrInpDatRedLgtAltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrInpDatRedLgtAltVO[]
	 */
	public EqrInpDatRedLgtAltVO[] getEqrInpDatRedLgtAltVOs(){
		EqrInpDatRedLgtAltVO[] vos = (EqrInpDatRedLgtAltVO[])models.toArray(new EqrInpDatRedLgtAltVO[models.size()]);
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
		this.altCostAmt = this.altCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrSzCd = this.cntrSzCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.altBseCd = this.altBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.altItmDivCd = this.altItmDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDlayDys = this.vslDlayDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
