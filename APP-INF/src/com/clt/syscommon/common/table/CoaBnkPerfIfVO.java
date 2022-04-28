/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaBnkPerfIfVO.java
*@FileTitle : CoaBnkPerfIfVO
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

public class CoaBnkPerfIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaBnkPerfIfVO> models = new ArrayList<CoaBnkPerfIfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String portDys = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String bnkCateCd = null;
	/* Column Info */
	private String actCsmAmt = null;
	/* Column Info */
	private String estmCsmAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String seaDys = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String estmCsmQty = null;
	/* Column Info */
	private String actBnkUcAmt = null;
	/* Column Info */
	private String estmBnkUcAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String actCsmQty = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaBnkPerfIfVO() {}

	public CoaBnkPerfIfVO(String ibflag, String pagerows, String costYrmon, String rlaneCd, String vslCd, String skdVoyNo, String skdDirCd, String bnkCateCd, String portDys, String seaDys, String actCsmQty, String estmCsmQty, String actCsmAmt, String estmCsmAmt, String actBnkUcAmt, String estmBnkUcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.portDys = portDys;
		this.vslCd = vslCd;
		this.bnkCateCd = bnkCateCd;
		this.actCsmAmt = actCsmAmt;
		this.estmCsmAmt = estmCsmAmt;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.rlaneCd = rlaneCd;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.seaDys = seaDys;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.estmCsmQty = estmCsmQty;
		this.actBnkUcAmt = actBnkUcAmt;
		this.estmBnkUcAmt = estmBnkUcAmt;
		this.updUsrId = updUsrId;
		this.actCsmQty = actCsmQty;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("port_dys", getPortDys());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("bnk_cate_cd", getBnkCateCd());
		this.hashColumns.put("act_csm_amt", getActCsmAmt());
		this.hashColumns.put("estm_csm_amt", getEstmCsmAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("sea_dys", getSeaDys());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("estm_csm_qty", getEstmCsmQty());
		this.hashColumns.put("act_bnk_uc_amt", getActBnkUcAmt());
		this.hashColumns.put("estm_bnk_uc_amt", getEstmBnkUcAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("act_csm_qty", getActCsmQty());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("port_dys", "portDys");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("bnk_cate_cd", "bnkCateCd");
		this.hashFields.put("act_csm_amt", "actCsmAmt");
		this.hashFields.put("estm_csm_amt", "estmCsmAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("sea_dys", "seaDys");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("estm_csm_qty", "estmCsmQty");
		this.hashFields.put("act_bnk_uc_amt", "actBnkUcAmt");
		this.hashFields.put("estm_bnk_uc_amt", "estmBnkUcAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("act_csm_qty", "actCsmQty");
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
	 * @return portDys
	 */
	public String getPortDys() {
		return this.portDys;
	}
	
	/**
	 * Column Info
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return bnkCateCd
	 */
	public String getBnkCateCd() {
		return this.bnkCateCd;
	}
	
	/**
	 * Column Info
	 * @return actCsmAmt
	 */
	public String getActCsmAmt() {
		return this.actCsmAmt;
	}
	
	/**
	 * Column Info
	 * @return estmCsmAmt
	 */
	public String getEstmCsmAmt() {
		return this.estmCsmAmt;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
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
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return seaDys
	 */
	public String getSeaDys() {
		return this.seaDys;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return estmCsmQty
	 */
	public String getEstmCsmQty() {
		return this.estmCsmQty;
	}
	
	/**
	 * Column Info
	 * @return actBnkUcAmt
	 */
	public String getActBnkUcAmt() {
		return this.actBnkUcAmt;
	}
	
	/**
	 * Column Info
	 * @return estmBnkUcAmt
	 */
	public String getEstmBnkUcAmt() {
		return this.estmBnkUcAmt;
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
	 * @return actCsmQty
	 */
	public String getActCsmQty() {
		return this.actCsmQty;
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
	 * @param portDys
	 */
	public void setPortDys(String portDys) {
		this.portDys = portDys;
	}
	
	/**
	 * Column Info
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param bnkCateCd
	 */
	public void setBnkCateCd(String bnkCateCd) {
		this.bnkCateCd = bnkCateCd;
	}
	
	/**
	 * Column Info
	 * @param actCsmAmt
	 */
	public void setActCsmAmt(String actCsmAmt) {
		this.actCsmAmt = actCsmAmt;
	}
	
	/**
	 * Column Info
	 * @param estmCsmAmt
	 */
	public void setEstmCsmAmt(String estmCsmAmt) {
		this.estmCsmAmt = estmCsmAmt;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
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
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param seaDys
	 */
	public void setSeaDys(String seaDys) {
		this.seaDys = seaDys;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param estmCsmQty
	 */
	public void setEstmCsmQty(String estmCsmQty) {
		this.estmCsmQty = estmCsmQty;
	}
	
	/**
	 * Column Info
	 * @param actBnkUcAmt
	 */
	public void setActBnkUcAmt(String actBnkUcAmt) {
		this.actBnkUcAmt = actBnkUcAmt;
	}
	
	/**
	 * Column Info
	 * @param estmBnkUcAmt
	 */
	public void setEstmBnkUcAmt(String estmBnkUcAmt) {
		this.estmBnkUcAmt = estmBnkUcAmt;
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
	 * @param actCsmQty
	 */
	public void setActCsmQty(String actCsmQty) {
		this.actCsmQty = actCsmQty;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setPortDys(JSPUtil.getParameter(request, "port_dys", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setBnkCateCd(JSPUtil.getParameter(request, "bnk_cate_cd", ""));
		setActCsmAmt(JSPUtil.getParameter(request, "act_csm_amt", ""));
		setEstmCsmAmt(JSPUtil.getParameter(request, "estm_csm_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setSeaDys(JSPUtil.getParameter(request, "sea_dys", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setEstmCsmQty(JSPUtil.getParameter(request, "estm_csm_qty", ""));
		setActBnkUcAmt(JSPUtil.getParameter(request, "act_bnk_uc_amt", ""));
		setEstmBnkUcAmt(JSPUtil.getParameter(request, "estm_bnk_uc_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setActCsmQty(JSPUtil.getParameter(request, "act_csm_qty", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaBnkPerfIfVO[]
	 */
	public CoaBnkPerfIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaBnkPerfIfVO[]
	 */
	public CoaBnkPerfIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaBnkPerfIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] portDys = (JSPUtil.getParameter(request, prefix	+ "port_dys", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] bnkCateCd = (JSPUtil.getParameter(request, prefix	+ "bnk_cate_cd", length));
			String[] actCsmAmt = (JSPUtil.getParameter(request, prefix	+ "act_csm_amt", length));
			String[] estmCsmAmt = (JSPUtil.getParameter(request, prefix	+ "estm_csm_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] seaDys = (JSPUtil.getParameter(request, prefix	+ "sea_dys", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] estmCsmQty = (JSPUtil.getParameter(request, prefix	+ "estm_csm_qty", length));
			String[] actBnkUcAmt = (JSPUtil.getParameter(request, prefix	+ "act_bnk_uc_amt", length));
			String[] estmBnkUcAmt = (JSPUtil.getParameter(request, prefix	+ "estm_bnk_uc_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] actCsmQty = (JSPUtil.getParameter(request, prefix	+ "act_csm_qty", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaBnkPerfIfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (portDys[i] != null)
					model.setPortDys(portDys[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (bnkCateCd[i] != null)
					model.setBnkCateCd(bnkCateCd[i]);
				if (actCsmAmt[i] != null)
					model.setActCsmAmt(actCsmAmt[i]);
				if (estmCsmAmt[i] != null)
					model.setEstmCsmAmt(estmCsmAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (seaDys[i] != null)
					model.setSeaDys(seaDys[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (estmCsmQty[i] != null)
					model.setEstmCsmQty(estmCsmQty[i]);
				if (actBnkUcAmt[i] != null)
					model.setActBnkUcAmt(actBnkUcAmt[i]);
				if (estmBnkUcAmt[i] != null)
					model.setEstmBnkUcAmt(estmBnkUcAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (actCsmQty[i] != null)
					model.setActCsmQty(actCsmQty[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaBnkPerfIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaBnkPerfIfVO[]
	 */
	public CoaBnkPerfIfVO[] getCoaBnkPerfIfVOs(){
		CoaBnkPerfIfVO[] vos = (CoaBnkPerfIfVO[])models.toArray(new CoaBnkPerfIfVO[models.size()]);
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
		this.portDys = this.portDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bnkCateCd = this.bnkCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCsmAmt = this.actCsmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCsmAmt = this.estmCsmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.seaDys = this.seaDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmCsmQty = this.estmCsmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actBnkUcAmt = this.actBnkUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.estmBnkUcAmt = this.estmBnkUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actCsmQty = this.actCsmQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
