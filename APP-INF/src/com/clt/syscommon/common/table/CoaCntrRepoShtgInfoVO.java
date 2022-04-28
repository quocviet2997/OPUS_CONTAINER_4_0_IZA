/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaCntrRepoShtgInfoVO.java
*@FileTitle : CoaCntrRepoShtgInfoVO
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

public class CoaCntrRepoShtgInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaCntrRepoShtgInfoVO> models = new ArrayList<CoaCntrRepoShtgInfoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mbAmt = null;
	/* Column Info */
	private String eccCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String imbalAmt = null;
	/* Column Info */
	private String rccCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String eqRepoCrRto = null;
	/* Column Info */
	private String lccCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String imbalCrLvl = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String opbAmt = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String opbCrLvl = null;
	/* Column Info */
	private String mbCrLvl = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaCntrRepoShtgInfoVO() {}

	public CoaCntrRepoShtgInfoVO(String ibflag, String pagerows, String costYrmon, String cntrTpszCd, String eccCd, String lccCd, String rccCd, String imbalCrLvl, String opbCrLvl, String mbCrLvl, String eqRepoCrRto, String imbalAmt, String opbAmt, String mbAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.mbAmt = mbAmt;
		this.eccCd = eccCd;
		this.creDt = creDt;
		this.imbalAmt = imbalAmt;
		this.rccCd = rccCd;
		this.pagerows = pagerows;
		this.eqRepoCrRto = eqRepoCrRto;
		this.lccCd = lccCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.imbalCrLvl = imbalCrLvl;
		this.costYrmon = costYrmon;
		this.opbAmt = opbAmt;
		this.cntrTpszCd = cntrTpszCd;
		this.opbCrLvl = opbCrLvl;
		this.mbCrLvl = mbCrLvl;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mb_amt", getMbAmt());
		this.hashColumns.put("ecc_cd", getEccCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("imbal_amt", getImbalAmt());
		this.hashColumns.put("rcc_cd", getRccCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("eq_repo_cr_rto", getEqRepoCrRto());
		this.hashColumns.put("lcc_cd", getLccCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("imbal_cr_lvl", getImbalCrLvl());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("opb_amt", getOpbAmt());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("opb_cr_lvl", getOpbCrLvl());
		this.hashColumns.put("mb_cr_lvl", getMbCrLvl());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mb_amt", "mbAmt");
		this.hashFields.put("ecc_cd", "eccCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("imbal_amt", "imbalAmt");
		this.hashFields.put("rcc_cd", "rccCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("eq_repo_cr_rto", "eqRepoCrRto");
		this.hashFields.put("lcc_cd", "lccCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("imbal_cr_lvl", "imbalCrLvl");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("opb_amt", "opbAmt");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("opb_cr_lvl", "opbCrLvl");
		this.hashFields.put("mb_cr_lvl", "mbCrLvl");
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
	 * @return mbAmt
	 */
	public String getMbAmt() {
		return this.mbAmt;
	}
	
	/**
	 * Column Info
	 * @return eccCd
	 */
	public String getEccCd() {
		return this.eccCd;
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
	 * @return imbalAmt
	 */
	public String getImbalAmt() {
		return this.imbalAmt;
	}
	
	/**
	 * Column Info
	 * @return rccCd
	 */
	public String getRccCd() {
		return this.rccCd;
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
	 * @return eqRepoCrRto
	 */
	public String getEqRepoCrRto() {
		return this.eqRepoCrRto;
	}
	
	/**
	 * Column Info
	 * @return lccCd
	 */
	public String getLccCd() {
		return this.lccCd;
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
	 * @return imbalCrLvl
	 */
	public String getImbalCrLvl() {
		return this.imbalCrLvl;
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
	 * @return opbAmt
	 */
	public String getOpbAmt() {
		return this.opbAmt;
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
	 * @return opbCrLvl
	 */
	public String getOpbCrLvl() {
		return this.opbCrLvl;
	}
	
	/**
	 * Column Info
	 * @return mbCrLvl
	 */
	public String getMbCrLvl() {
		return this.mbCrLvl;
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
	 * @param mbAmt
	 */
	public void setMbAmt(String mbAmt) {
		this.mbAmt = mbAmt;
	}
	
	/**
	 * Column Info
	 * @param eccCd
	 */
	public void setEccCd(String eccCd) {
		this.eccCd = eccCd;
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
	 * @param imbalAmt
	 */
	public void setImbalAmt(String imbalAmt) {
		this.imbalAmt = imbalAmt;
	}
	
	/**
	 * Column Info
	 * @param rccCd
	 */
	public void setRccCd(String rccCd) {
		this.rccCd = rccCd;
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
	 * @param eqRepoCrRto
	 */
	public void setEqRepoCrRto(String eqRepoCrRto) {
		this.eqRepoCrRto = eqRepoCrRto;
	}
	
	/**
	 * Column Info
	 * @param lccCd
	 */
	public void setLccCd(String lccCd) {
		this.lccCd = lccCd;
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
	 * @param imbalCrLvl
	 */
	public void setImbalCrLvl(String imbalCrLvl) {
		this.imbalCrLvl = imbalCrLvl;
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
	 * @param opbAmt
	 */
	public void setOpbAmt(String opbAmt) {
		this.opbAmt = opbAmt;
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
	 * @param opbCrLvl
	 */
	public void setOpbCrLvl(String opbCrLvl) {
		this.opbCrLvl = opbCrLvl;
	}
	
	/**
	 * Column Info
	 * @param mbCrLvl
	 */
	public void setMbCrLvl(String mbCrLvl) {
		this.mbCrLvl = mbCrLvl;
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
		setMbAmt(JSPUtil.getParameter(request, "mb_amt", ""));
		setEccCd(JSPUtil.getParameter(request, "ecc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setImbalAmt(JSPUtil.getParameter(request, "imbal_amt", ""));
		setRccCd(JSPUtil.getParameter(request, "rcc_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setEqRepoCrRto(JSPUtil.getParameter(request, "eq_repo_cr_rto", ""));
		setLccCd(JSPUtil.getParameter(request, "lcc_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setImbalCrLvl(JSPUtil.getParameter(request, "imbal_cr_lvl", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setOpbAmt(JSPUtil.getParameter(request, "opb_amt", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setOpbCrLvl(JSPUtil.getParameter(request, "opb_cr_lvl", ""));
		setMbCrLvl(JSPUtil.getParameter(request, "mb_cr_lvl", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaCntrRepoShtgInfoVO[]
	 */
	public CoaCntrRepoShtgInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaCntrRepoShtgInfoVO[]
	 */
	public CoaCntrRepoShtgInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaCntrRepoShtgInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mbAmt = (JSPUtil.getParameter(request, prefix	+ "mb_amt", length));
			String[] eccCd = (JSPUtil.getParameter(request, prefix	+ "ecc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] imbalAmt = (JSPUtil.getParameter(request, prefix	+ "imbal_amt", length));
			String[] rccCd = (JSPUtil.getParameter(request, prefix	+ "rcc_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] eqRepoCrRto = (JSPUtil.getParameter(request, prefix	+ "eq_repo_cr_rto", length));
			String[] lccCd = (JSPUtil.getParameter(request, prefix	+ "lcc_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] imbalCrLvl = (JSPUtil.getParameter(request, prefix	+ "imbal_cr_lvl", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] opbAmt = (JSPUtil.getParameter(request, prefix	+ "opb_amt", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] opbCrLvl = (JSPUtil.getParameter(request, prefix	+ "opb_cr_lvl", length));
			String[] mbCrLvl = (JSPUtil.getParameter(request, prefix	+ "mb_cr_lvl", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaCntrRepoShtgInfoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mbAmt[i] != null)
					model.setMbAmt(mbAmt[i]);
				if (eccCd[i] != null)
					model.setEccCd(eccCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (imbalAmt[i] != null)
					model.setImbalAmt(imbalAmt[i]);
				if (rccCd[i] != null)
					model.setRccCd(rccCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (eqRepoCrRto[i] != null)
					model.setEqRepoCrRto(eqRepoCrRto[i]);
				if (lccCd[i] != null)
					model.setLccCd(lccCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (imbalCrLvl[i] != null)
					model.setImbalCrLvl(imbalCrLvl[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (opbAmt[i] != null)
					model.setOpbAmt(opbAmt[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (opbCrLvl[i] != null)
					model.setOpbCrLvl(opbCrLvl[i]);
				if (mbCrLvl[i] != null)
					model.setMbCrLvl(mbCrLvl[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaCntrRepoShtgInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaCntrRepoShtgInfoVO[]
	 */
	public CoaCntrRepoShtgInfoVO[] getCoaCntrRepoShtgInfoVOs(){
		CoaCntrRepoShtgInfoVO[] vos = (CoaCntrRepoShtgInfoVO[])models.toArray(new CoaCntrRepoShtgInfoVO[models.size()]);
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
		this.mbAmt = this.mbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eccCd = this.eccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imbalAmt = this.imbalAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rccCd = this.rccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRepoCrRto = this.eqRepoCrRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lccCd = this.lccCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imbalCrLvl = this.imbalCrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opbAmt = this.opbAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opbCrLvl = this.opbCrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mbCrLvl = this.mbCrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
