/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrHolEffRtoVO.java
*@FileTitle : EqrHolEffRtoVO
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

public class EqrHolEffRtoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrHolEffRtoVO> models = new ArrayList<EqrHolEffRtoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String wkDyCd = null;
	/* Column Info */
	private String holYr = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stDt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String cntNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String holEffYrwk = null;
	/* Column Info */
	private String cntCd = null;
	/* Column Info */
	private String rccDivFlg = null;
	/* Column Info */
	private String holEffRto = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrHolEffRtoVO() {}

	public EqrHolEffRtoVO(String ibflag, String pagerows, String holYr, String cntCd, String rccDivFlg, String stDt, String holEffYrwk, String ioBndCd, String wkDyCd, String holEffRto, String cntNm, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.wkDyCd = wkDyCd;
		this.holYr = holYr;
		this.creDt = creDt;
		this.stDt = stDt;
		this.ioBndCd = ioBndCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.cntNm = cntNm;
		this.creUsrId = creUsrId;
		this.holEffYrwk = holEffYrwk;
		this.cntCd = cntCd;
		this.rccDivFlg = rccDivFlg;
		this.holEffRto = holEffRto;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("wk_dy_cd", getWkDyCd());
		this.hashColumns.put("hol_yr", getHolYr());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("st_dt", getStDt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cnt_nm", getCntNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hol_eff_yrwk", getHolEffYrwk());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("rcc_div_flg", getRccDivFlg());
		this.hashColumns.put("hol_eff_rto", getHolEffRto());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("wk_dy_cd", "wkDyCd");
		this.hashFields.put("hol_yr", "holYr");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("st_dt", "stDt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cnt_nm", "cntNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hol_eff_yrwk", "holEffYrwk");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("rcc_div_flg", "rccDivFlg");
		this.hashFields.put("hol_eff_rto", "holEffRto");
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
	 * @return wkDyCd
	 */
	public String getWkDyCd() {
		return this.wkDyCd;
	}
	
	/**
	 * Column Info
	 * @return holYr
	 */
	public String getHolYr() {
		return this.holYr;
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
	 * @return stDt
	 */
	public String getStDt() {
		return this.stDt;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
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
	 * @return cntNm
	 */
	public String getCntNm() {
		return this.cntNm;
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
	 * @return holEffYrwk
	 */
	public String getHolEffYrwk() {
		return this.holEffYrwk;
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
	 * @return rccDivFlg
	 */
	public String getRccDivFlg() {
		return this.rccDivFlg;
	}
	
	/**
	 * Column Info
	 * @return holEffRto
	 */
	public String getHolEffRto() {
		return this.holEffRto;
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
	 * @param wkDyCd
	 */
	public void setWkDyCd(String wkDyCd) {
		this.wkDyCd = wkDyCd;
	}
	
	/**
	 * Column Info
	 * @param holYr
	 */
	public void setHolYr(String holYr) {
		this.holYr = holYr;
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
	 * @param stDt
	 */
	public void setStDt(String stDt) {
		this.stDt = stDt;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
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
	 * @param cntNm
	 */
	public void setCntNm(String cntNm) {
		this.cntNm = cntNm;
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
	 * @param holEffYrwk
	 */
	public void setHolEffYrwk(String holEffYrwk) {
		this.holEffYrwk = holEffYrwk;
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
	 * @param rccDivFlg
	 */
	public void setRccDivFlg(String rccDivFlg) {
		this.rccDivFlg = rccDivFlg;
	}
	
	/**
	 * Column Info
	 * @param holEffRto
	 */
	public void setHolEffRto(String holEffRto) {
		this.holEffRto = holEffRto;
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
		setWkDyCd(JSPUtil.getParameter(request, "wk_dy_cd", ""));
		setHolYr(JSPUtil.getParameter(request, "hol_yr", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStDt(JSPUtil.getParameter(request, "st_dt", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCntNm(JSPUtil.getParameter(request, "cnt_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setHolEffYrwk(JSPUtil.getParameter(request, "hol_eff_yrwk", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setRccDivFlg(JSPUtil.getParameter(request, "rcc_div_flg", ""));
		setHolEffRto(JSPUtil.getParameter(request, "hol_eff_rto", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrHolEffRtoVO[]
	 */
	public EqrHolEffRtoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrHolEffRtoVO[]
	 */
	public EqrHolEffRtoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrHolEffRtoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] wkDyCd = (JSPUtil.getParameter(request, prefix	+ "wk_dy_cd", length));
			String[] holYr = (JSPUtil.getParameter(request, prefix	+ "hol_yr", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stDt = (JSPUtil.getParameter(request, prefix	+ "st_dt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] cntNm = (JSPUtil.getParameter(request, prefix	+ "cnt_nm", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] holEffYrwk = (JSPUtil.getParameter(request, prefix	+ "hol_eff_yrwk", length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd", length));
			String[] rccDivFlg = (JSPUtil.getParameter(request, prefix	+ "rcc_div_flg", length));
			String[] holEffRto = (JSPUtil.getParameter(request, prefix	+ "hol_eff_rto", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrHolEffRtoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (wkDyCd[i] != null)
					model.setWkDyCd(wkDyCd[i]);
				if (holYr[i] != null)
					model.setHolYr(holYr[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stDt[i] != null)
					model.setStDt(stDt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (cntNm[i] != null)
					model.setCntNm(cntNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (holEffYrwk[i] != null)
					model.setHolEffYrwk(holEffYrwk[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (rccDivFlg[i] != null)
					model.setRccDivFlg(rccDivFlg[i]);
				if (holEffRto[i] != null)
					model.setHolEffRto(holEffRto[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrHolEffRtoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrHolEffRtoVO[]
	 */
	public EqrHolEffRtoVO[] getEqrHolEffRtoVOs(){
		EqrHolEffRtoVO[] vos = (EqrHolEffRtoVO[])models.toArray(new EqrHolEffRtoVO[models.size()]);
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
		this.wkDyCd = this.wkDyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.holYr = this.holYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stDt = this.stDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntNm = this.cntNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.holEffYrwk = this.holEffYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccDivFlg = this.rccDivFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.holEffRto = this.holEffRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
