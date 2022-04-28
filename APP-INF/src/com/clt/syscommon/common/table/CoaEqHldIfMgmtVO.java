/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaEqHldIfMgmtVO.java
*@FileTitle : CoaEqHldIfMgmtVO
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

public class CoaEqHldIfMgmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaEqHldIfMgmtVO> models = new ArrayList<CoaEqHldIfMgmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String adjRtAmt = null;
	/* Column Info */
	private String verTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String plcyPrcAmt = null;
	/* Column Info */
	private String costYr = null;
	/* Column Info */
	private String actPrcAmt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String costMon = null;
	/* Column Info */
	private String ifVerCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaEqHldIfMgmtVO() {}

	public CoaEqHldIfMgmtVO(String ibflag, String pagerows, String costYr, String costMon, String verTpCd, String ifVerCd, String cntrTpszCd, String actPrcAmt, String adjRtAmt, String plcyPrcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.adjRtAmt = adjRtAmt;
		this.verTpCd = verTpCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.plcyPrcAmt = plcyPrcAmt;
		this.costYr = costYr;
		this.actPrcAmt = actPrcAmt;
		this.cntrTpszCd = cntrTpszCd;
		this.costMon = costMon;
		this.ifVerCd = ifVerCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("adj_rt_amt", getAdjRtAmt());
		this.hashColumns.put("ver_tp_cd", getVerTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("plcy_prc_amt", getPlcyPrcAmt());
		this.hashColumns.put("cost_yr", getCostYr());
		this.hashColumns.put("act_prc_amt", getActPrcAmt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cost_mon", getCostMon());
		this.hashColumns.put("if_ver_cd", getIfVerCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("adj_rt_amt", "adjRtAmt");
		this.hashFields.put("ver_tp_cd", "verTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("plcy_prc_amt", "plcyPrcAmt");
		this.hashFields.put("cost_yr", "costYr");
		this.hashFields.put("act_prc_amt", "actPrcAmt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cost_mon", "costMon");
		this.hashFields.put("if_ver_cd", "ifVerCd");
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
	 * @return adjRtAmt
	 */
	public String getAdjRtAmt() {
		return this.adjRtAmt;
	}
	
	/**
	 * Column Info
	 * @return verTpCd
	 */
	public String getVerTpCd() {
		return this.verTpCd;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return plcyPrcAmt
	 */
	public String getPlcyPrcAmt() {
		return this.plcyPrcAmt;
	}
	
	/**
	 * Column Info
	 * @return costYr
	 */
	public String getCostYr() {
		return this.costYr;
	}
	
	/**
	 * Column Info
	 * @return actPrcAmt
	 */
	public String getActPrcAmt() {
		return this.actPrcAmt;
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
	 * @return costMon
	 */
	public String getCostMon() {
		return this.costMon;
	}
	
	/**
	 * Column Info
	 * @return ifVerCd
	 */
	public String getIfVerCd() {
		return this.ifVerCd;
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
	 * @param adjRtAmt
	 */
	public void setAdjRtAmt(String adjRtAmt) {
		this.adjRtAmt = adjRtAmt;
	}
	
	/**
	 * Column Info
	 * @param verTpCd
	 */
	public void setVerTpCd(String verTpCd) {
		this.verTpCd = verTpCd;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param plcyPrcAmt
	 */
	public void setPlcyPrcAmt(String plcyPrcAmt) {
		this.plcyPrcAmt = plcyPrcAmt;
	}
	
	/**
	 * Column Info
	 * @param costYr
	 */
	public void setCostYr(String costYr) {
		this.costYr = costYr;
	}
	
	/**
	 * Column Info
	 * @param actPrcAmt
	 */
	public void setActPrcAmt(String actPrcAmt) {
		this.actPrcAmt = actPrcAmt;
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
	 * @param costMon
	 */
	public void setCostMon(String costMon) {
		this.costMon = costMon;
	}
	
	/**
	 * Column Info
	 * @param ifVerCd
	 */
	public void setIfVerCd(String ifVerCd) {
		this.ifVerCd = ifVerCd;
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
		setAdjRtAmt(JSPUtil.getParameter(request, "adj_rt_amt", ""));
		setVerTpCd(JSPUtil.getParameter(request, "ver_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPlcyPrcAmt(JSPUtil.getParameter(request, "plcy_prc_amt", ""));
		setCostYr(JSPUtil.getParameter(request, "cost_yr", ""));
		setActPrcAmt(JSPUtil.getParameter(request, "act_prc_amt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCostMon(JSPUtil.getParameter(request, "cost_mon", ""));
		setIfVerCd(JSPUtil.getParameter(request, "if_ver_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaEqHldIfMgmtVO[]
	 */
	public CoaEqHldIfMgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaEqHldIfMgmtVO[]
	 */
	public CoaEqHldIfMgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaEqHldIfMgmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] adjRtAmt = (JSPUtil.getParameter(request, prefix	+ "adj_rt_amt", length));
			String[] verTpCd = (JSPUtil.getParameter(request, prefix	+ "ver_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] plcyPrcAmt = (JSPUtil.getParameter(request, prefix	+ "plcy_prc_amt", length));
			String[] costYr = (JSPUtil.getParameter(request, prefix	+ "cost_yr", length));
			String[] actPrcAmt = (JSPUtil.getParameter(request, prefix	+ "act_prc_amt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] costMon = (JSPUtil.getParameter(request, prefix	+ "cost_mon", length));
			String[] ifVerCd = (JSPUtil.getParameter(request, prefix	+ "if_ver_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaEqHldIfMgmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (adjRtAmt[i] != null)
					model.setAdjRtAmt(adjRtAmt[i]);
				if (verTpCd[i] != null)
					model.setVerTpCd(verTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (plcyPrcAmt[i] != null)
					model.setPlcyPrcAmt(plcyPrcAmt[i]);
				if (costYr[i] != null)
					model.setCostYr(costYr[i]);
				if (actPrcAmt[i] != null)
					model.setActPrcAmt(actPrcAmt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (costMon[i] != null)
					model.setCostMon(costMon[i]);
				if (ifVerCd[i] != null)
					model.setIfVerCd(ifVerCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaEqHldIfMgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaEqHldIfMgmtVO[]
	 */
	public CoaEqHldIfMgmtVO[] getCoaEqHldIfMgmtVOs(){
		CoaEqHldIfMgmtVO[] vos = (CoaEqHldIfMgmtVO[])models.toArray(new CoaEqHldIfMgmtVO[models.size()]);
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
		this.adjRtAmt = this.adjRtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.verTpCd = this.verTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plcyPrcAmt = this.plcyPrcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYr = this.costYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actPrcAmt = this.actPrcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costMon = this.costMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ifVerCd = this.ifVerCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
