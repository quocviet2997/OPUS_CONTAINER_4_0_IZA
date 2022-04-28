/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaMonRoutRpbVO.java
*@FileTitle : CoaMonRoutRpbVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaMonRoutRpbVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaMonRoutRpbVO> models = new ArrayList<CoaMonRoutRpbVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String iocCd = null;
	/* Column Info */
	private String bkgPorCd = null;
	/* Column Info */
	private String scrChgAvgRpbRev = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String bkgOftAvgRpbRev = null;
	/* Column Info */
	private String bkgAvgRpbRev = null;
	/* Column Info */
	private String bkgMiscAvgRpbRev = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String bkgDelCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rpbYrmon = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaMonRoutRpbVO() {}

	public CoaMonRoutRpbVO(String ibflag, String pagerows, String rpbYrmon, String rlaneCd, String iocCd, String bkgPorCd, String bkgDelCd, String cntrTpszCd, String bkgAvgRpbRev, String bkgOftAvgRpbRev, String bkgMiscAvgRpbRev, String scrChgAvgRpbRev, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.iocCd = iocCd;
		this.bkgPorCd = bkgPorCd;
		this.scrChgAvgRpbRev = scrChgAvgRpbRev;
		this.creDt = creDt;
		this.rlaneCd = rlaneCd;
		this.bkgOftAvgRpbRev = bkgOftAvgRpbRev;
		this.bkgAvgRpbRev = bkgAvgRpbRev;
		this.bkgMiscAvgRpbRev = bkgMiscAvgRpbRev;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.bkgDelCd = bkgDelCd;
		this.cntrTpszCd = cntrTpszCd;
		this.updUsrId = updUsrId;
		this.rpbYrmon = rpbYrmon;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ioc_cd", getIocCd());
		this.hashColumns.put("bkg_por_cd", getBkgPorCd());
		this.hashColumns.put("scr_chg_avg_rpb_rev", getScrChgAvgRpbRev());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("bkg_oft_avg_rpb_rev", getBkgOftAvgRpbRev());
		this.hashColumns.put("bkg_avg_rpb_rev", getBkgAvgRpbRev());
		this.hashColumns.put("bkg_misc_avg_rpb_rev", getBkgMiscAvgRpbRev());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("bkg_del_cd", getBkgDelCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rpb_yrmon", getRpbYrmon());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ioc_cd", "iocCd");
		this.hashFields.put("bkg_por_cd", "bkgPorCd");
		this.hashFields.put("scr_chg_avg_rpb_rev", "scrChgAvgRpbRev");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("bkg_oft_avg_rpb_rev", "bkgOftAvgRpbRev");
		this.hashFields.put("bkg_avg_rpb_rev", "bkgAvgRpbRev");
		this.hashFields.put("bkg_misc_avg_rpb_rev", "bkgMiscAvgRpbRev");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("bkg_del_cd", "bkgDelCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rpb_yrmon", "rpbYrmon");
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
	 * @return iocCd
	 */
	public String getIocCd() {
		return this.iocCd;
	}
	
	/**
	 * Column Info
	 * @return bkgPorCd
	 */
	public String getBkgPorCd() {
		return this.bkgPorCd;
	}
	
	/**
	 * Column Info
	 * @return scrChgAvgRpbRev
	 */
	public String getScrChgAvgRpbRev() {
		return this.scrChgAvgRpbRev;
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
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return bkgOftAvgRpbRev
	 */
	public String getBkgOftAvgRpbRev() {
		return this.bkgOftAvgRpbRev;
	}
	
	/**
	 * Column Info
	 * @return bkgAvgRpbRev
	 */
	public String getBkgAvgRpbRev() {
		return this.bkgAvgRpbRev;
	}
	
	/**
	 * Column Info
	 * @return bkgMiscAvgRpbRev
	 */
	public String getBkgMiscAvgRpbRev() {
		return this.bkgMiscAvgRpbRev;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return bkgDelCd
	 */
	public String getBkgDelCd() {
		return this.bkgDelCd;
	}
	
	/**
	 * Column Info
	 * @return cntrTpszCd
	 */
	public String getCntrTpszCd() {
		return this.cntrTpszCd;
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
	 * @return rpbYrmon
	 */
	public String getRpbYrmon() {
		return this.rpbYrmon;
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
	 * @param iocCd
	 */
	public void setIocCd(String iocCd) {
		this.iocCd = iocCd;
	}
	
	/**
	 * Column Info
	 * @param bkgPorCd
	 */
	public void setBkgPorCd(String bkgPorCd) {
		this.bkgPorCd = bkgPorCd;
	}
	
	/**
	 * Column Info
	 * @param scrChgAvgRpbRev
	 */
	public void setScrChgAvgRpbRev(String scrChgAvgRpbRev) {
		this.scrChgAvgRpbRev = scrChgAvgRpbRev;
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
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param bkgOftAvgRpbRev
	 */
	public void setBkgOftAvgRpbRev(String bkgOftAvgRpbRev) {
		this.bkgOftAvgRpbRev = bkgOftAvgRpbRev;
	}
	
	/**
	 * Column Info
	 * @param bkgAvgRpbRev
	 */
	public void setBkgAvgRpbRev(String bkgAvgRpbRev) {
		this.bkgAvgRpbRev = bkgAvgRpbRev;
	}
	
	/**
	 * Column Info
	 * @param bkgMiscAvgRpbRev
	 */
	public void setBkgMiscAvgRpbRev(String bkgMiscAvgRpbRev) {
		this.bkgMiscAvgRpbRev = bkgMiscAvgRpbRev;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param bkgDelCd
	 */
	public void setBkgDelCd(String bkgDelCd) {
		this.bkgDelCd = bkgDelCd;
	}
	
	/**
	 * Column Info
	 * @param cntrTpszCd
	 */
	public void setCntrTpszCd(String cntrTpszCd) {
		this.cntrTpszCd = cntrTpszCd;
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
	 * @param rpbYrmon
	 */
	public void setRpbYrmon(String rpbYrmon) {
		this.rpbYrmon = rpbYrmon;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setIocCd(JSPUtil.getParameter(request, "ioc_cd", ""));
		setBkgPorCd(JSPUtil.getParameter(request, "bkg_por_cd", ""));
		setScrChgAvgRpbRev(JSPUtil.getParameter(request, "scr_chg_avg_rpb_rev", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setBkgOftAvgRpbRev(JSPUtil.getParameter(request, "bkg_oft_avg_rpb_rev", ""));
		setBkgAvgRpbRev(JSPUtil.getParameter(request, "bkg_avg_rpb_rev", ""));
		setBkgMiscAvgRpbRev(JSPUtil.getParameter(request, "bkg_misc_avg_rpb_rev", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setBkgDelCd(JSPUtil.getParameter(request, "bkg_del_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRpbYrmon(JSPUtil.getParameter(request, "rpb_yrmon", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaMonRoutRpbVO[]
	 */
	public CoaMonRoutRpbVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaMonRoutRpbVO[]
	 */
	public CoaMonRoutRpbVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaMonRoutRpbVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] iocCd = (JSPUtil.getParameter(request, prefix	+ "ioc_cd", length));
			String[] bkgPorCd = (JSPUtil.getParameter(request, prefix	+ "bkg_por_cd", length));
			String[] scrChgAvgRpbRev = (JSPUtil.getParameter(request, prefix	+ "scr_chg_avg_rpb_rev", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] bkgOftAvgRpbRev = (JSPUtil.getParameter(request, prefix	+ "bkg_oft_avg_rpb_rev", length));
			String[] bkgAvgRpbRev = (JSPUtil.getParameter(request, prefix	+ "bkg_avg_rpb_rev", length));
			String[] bkgMiscAvgRpbRev = (JSPUtil.getParameter(request, prefix	+ "bkg_misc_avg_rpb_rev", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] bkgDelCd = (JSPUtil.getParameter(request, prefix	+ "bkg_del_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rpbYrmon = (JSPUtil.getParameter(request, prefix	+ "rpb_yrmon", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaMonRoutRpbVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (iocCd[i] != null)
					model.setIocCd(iocCd[i]);
				if (bkgPorCd[i] != null)
					model.setBkgPorCd(bkgPorCd[i]);
				if (scrChgAvgRpbRev[i] != null)
					model.setScrChgAvgRpbRev(scrChgAvgRpbRev[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (bkgOftAvgRpbRev[i] != null)
					model.setBkgOftAvgRpbRev(bkgOftAvgRpbRev[i]);
				if (bkgAvgRpbRev[i] != null)
					model.setBkgAvgRpbRev(bkgAvgRpbRev[i]);
				if (bkgMiscAvgRpbRev[i] != null)
					model.setBkgMiscAvgRpbRev(bkgMiscAvgRpbRev[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (bkgDelCd[i] != null)
					model.setBkgDelCd(bkgDelCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rpbYrmon[i] != null)
					model.setRpbYrmon(rpbYrmon[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaMonRoutRpbVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaMonRoutRpbVO[]
	 */
	public CoaMonRoutRpbVO[] getCoaMonRoutRpbVOs(){
		CoaMonRoutRpbVO[] vos = (CoaMonRoutRpbVO[])models.toArray(new CoaMonRoutRpbVO[models.size()]);
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
		this.iocCd = this.iocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgPorCd = this.bkgPorCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.scrChgAvgRpbRev = this.scrChgAvgRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgOftAvgRpbRev = this.bkgOftAvgRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgAvgRpbRev = this.bkgAvgRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgMiscAvgRpbRev = this.bkgMiscAvgRpbRev .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgDelCd = this.bkgDelCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rpbYrmon = this.rpbYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
