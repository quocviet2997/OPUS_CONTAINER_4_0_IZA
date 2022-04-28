/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaCntrRepoRuleVO.java
*@FileTitle : CoaCntrRepoRuleVO
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

public class CoaCntrRepoRuleVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaCntrRepoRuleVO> models = new ArrayList<CoaCntrRepoRuleVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String imbalToRto = null;
	/* Column Info */
	private String imbalFmRto = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String opbAllAplyFlg = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String mbToRto = null;
	/* Column Info */
	private String eqRepoCrLvl = null;
	/* Column Info */
	private String imbalAllAplyFlg = null;
	/* Column Info */
	private String opbFmAmt = null;
	/* Column Info */
	private String mbAllAplyFlg = null;
	/* Column Info */
	private String mbFmRto = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String opbToAmt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaCntrRepoRuleVO() {}

	public CoaCntrRepoRuleVO(String ibflag, String pagerows, String costYrmon, String cntrTpszCd, String eqRepoCrLvl, String imbalAllAplyFlg, String imbalFmRto, String imbalToRto, String opbAllAplyFlg, String opbFmAmt, String opbToAmt, String mbAllAplyFlg, String mbFmRto, String mbToRto, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creDt = creDt;
		this.imbalToRto = imbalToRto;
		this.imbalFmRto = imbalFmRto;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.costYrmon = costYrmon;
		this.opbAllAplyFlg = opbAllAplyFlg;
		this.cntrTpszCd = cntrTpszCd;
		this.mbToRto = mbToRto;
		this.eqRepoCrLvl = eqRepoCrLvl;
		this.imbalAllAplyFlg = imbalAllAplyFlg;
		this.opbFmAmt = opbFmAmt;
		this.mbAllAplyFlg = mbAllAplyFlg;
		this.mbFmRto = mbFmRto;
		this.updUsrId = updUsrId;
		this.opbToAmt = opbToAmt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("imbal_to_rto", getImbalToRto());
		this.hashColumns.put("imbal_fm_rto", getImbalFmRto());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("opb_all_aply_flg", getOpbAllAplyFlg());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("mb_to_rto", getMbToRto());
		this.hashColumns.put("eq_repo_cr_lvl", getEqRepoCrLvl());
		this.hashColumns.put("imbal_all_aply_flg", getImbalAllAplyFlg());
		this.hashColumns.put("opb_fm_amt", getOpbFmAmt());
		this.hashColumns.put("mb_all_aply_flg", getMbAllAplyFlg());
		this.hashColumns.put("mb_fm_rto", getMbFmRto());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("opb_to_amt", getOpbToAmt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("imbal_to_rto", "imbalToRto");
		this.hashFields.put("imbal_fm_rto", "imbalFmRto");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("opb_all_aply_flg", "opbAllAplyFlg");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("mb_to_rto", "mbToRto");
		this.hashFields.put("eq_repo_cr_lvl", "eqRepoCrLvl");
		this.hashFields.put("imbal_all_aply_flg", "imbalAllAplyFlg");
		this.hashFields.put("opb_fm_amt", "opbFmAmt");
		this.hashFields.put("mb_all_aply_flg", "mbAllAplyFlg");
		this.hashFields.put("mb_fm_rto", "mbFmRto");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("opb_to_amt", "opbToAmt");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return imbalToRto
	 */
	public String getImbalToRto() {
		return this.imbalToRto;
	}
	
	/**
	 * Column Info
	 * @return imbalFmRto
	 */
	public String getImbalFmRto() {
		return this.imbalFmRto;
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
	 * @return opbAllAplyFlg
	 */
	public String getOpbAllAplyFlg() {
		return this.opbAllAplyFlg;
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
	 * @return mbToRto
	 */
	public String getMbToRto() {
		return this.mbToRto;
	}
	
	/**
	 * Column Info
	 * @return eqRepoCrLvl
	 */
	public String getEqRepoCrLvl() {
		return this.eqRepoCrLvl;
	}
	
	/**
	 * Column Info
	 * @return imbalAllAplyFlg
	 */
	public String getImbalAllAplyFlg() {
		return this.imbalAllAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return opbFmAmt
	 */
	public String getOpbFmAmt() {
		return this.opbFmAmt;
	}
	
	/**
	 * Column Info
	 * @return mbAllAplyFlg
	 */
	public String getMbAllAplyFlg() {
		return this.mbAllAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return mbFmRto
	 */
	public String getMbFmRto() {
		return this.mbFmRto;
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
	 * @return opbToAmt
	 */
	public String getOpbToAmt() {
		return this.opbToAmt;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param imbalToRto
	 */
	public void setImbalToRto(String imbalToRto) {
		this.imbalToRto = imbalToRto;
	}
	
	/**
	 * Column Info
	 * @param imbalFmRto
	 */
	public void setImbalFmRto(String imbalFmRto) {
		this.imbalFmRto = imbalFmRto;
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
	 * @param opbAllAplyFlg
	 */
	public void setOpbAllAplyFlg(String opbAllAplyFlg) {
		this.opbAllAplyFlg = opbAllAplyFlg;
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
	 * @param mbToRto
	 */
	public void setMbToRto(String mbToRto) {
		this.mbToRto = mbToRto;
	}
	
	/**
	 * Column Info
	 * @param eqRepoCrLvl
	 */
	public void setEqRepoCrLvl(String eqRepoCrLvl) {
		this.eqRepoCrLvl = eqRepoCrLvl;
	}
	
	/**
	 * Column Info
	 * @param imbalAllAplyFlg
	 */
	public void setImbalAllAplyFlg(String imbalAllAplyFlg) {
		this.imbalAllAplyFlg = imbalAllAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param opbFmAmt
	 */
	public void setOpbFmAmt(String opbFmAmt) {
		this.opbFmAmt = opbFmAmt;
	}
	
	/**
	 * Column Info
	 * @param mbAllAplyFlg
	 */
	public void setMbAllAplyFlg(String mbAllAplyFlg) {
		this.mbAllAplyFlg = mbAllAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param mbFmRto
	 */
	public void setMbFmRto(String mbFmRto) {
		this.mbFmRto = mbFmRto;
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
	 * @param opbToAmt
	 */
	public void setOpbToAmt(String opbToAmt) {
		this.opbToAmt = opbToAmt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setImbalToRto(JSPUtil.getParameter(request, "imbal_to_rto", ""));
		setImbalFmRto(JSPUtil.getParameter(request, "imbal_fm_rto", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setOpbAllAplyFlg(JSPUtil.getParameter(request, "opb_all_aply_flg", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setMbToRto(JSPUtil.getParameter(request, "mb_to_rto", ""));
		setEqRepoCrLvl(JSPUtil.getParameter(request, "eq_repo_cr_lvl", ""));
		setImbalAllAplyFlg(JSPUtil.getParameter(request, "imbal_all_aply_flg", ""));
		setOpbFmAmt(JSPUtil.getParameter(request, "opb_fm_amt", ""));
		setMbAllAplyFlg(JSPUtil.getParameter(request, "mb_all_aply_flg", ""));
		setMbFmRto(JSPUtil.getParameter(request, "mb_fm_rto", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOpbToAmt(JSPUtil.getParameter(request, "opb_to_amt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaCntrRepoRuleVO[]
	 */
	public CoaCntrRepoRuleVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaCntrRepoRuleVO[]
	 */
	public CoaCntrRepoRuleVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaCntrRepoRuleVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] imbalToRto = (JSPUtil.getParameter(request, prefix	+ "imbal_to_rto", length));
			String[] imbalFmRto = (JSPUtil.getParameter(request, prefix	+ "imbal_fm_rto", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] opbAllAplyFlg = (JSPUtil.getParameter(request, prefix	+ "opb_all_aply_flg", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] mbToRto = (JSPUtil.getParameter(request, prefix	+ "mb_to_rto", length));
			String[] eqRepoCrLvl = (JSPUtil.getParameter(request, prefix	+ "eq_repo_cr_lvl", length));
			String[] imbalAllAplyFlg = (JSPUtil.getParameter(request, prefix	+ "imbal_all_aply_flg", length));
			String[] opbFmAmt = (JSPUtil.getParameter(request, prefix	+ "opb_fm_amt", length));
			String[] mbAllAplyFlg = (JSPUtil.getParameter(request, prefix	+ "mb_all_aply_flg", length));
			String[] mbFmRto = (JSPUtil.getParameter(request, prefix	+ "mb_fm_rto", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] opbToAmt = (JSPUtil.getParameter(request, prefix	+ "opb_to_amt", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaCntrRepoRuleVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (imbalToRto[i] != null)
					model.setImbalToRto(imbalToRto[i]);
				if (imbalFmRto[i] != null)
					model.setImbalFmRto(imbalFmRto[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (opbAllAplyFlg[i] != null)
					model.setOpbAllAplyFlg(opbAllAplyFlg[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (mbToRto[i] != null)
					model.setMbToRto(mbToRto[i]);
				if (eqRepoCrLvl[i] != null)
					model.setEqRepoCrLvl(eqRepoCrLvl[i]);
				if (imbalAllAplyFlg[i] != null)
					model.setImbalAllAplyFlg(imbalAllAplyFlg[i]);
				if (opbFmAmt[i] != null)
					model.setOpbFmAmt(opbFmAmt[i]);
				if (mbAllAplyFlg[i] != null)
					model.setMbAllAplyFlg(mbAllAplyFlg[i]);
				if (mbFmRto[i] != null)
					model.setMbFmRto(mbFmRto[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (opbToAmt[i] != null)
					model.setOpbToAmt(opbToAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaCntrRepoRuleVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaCntrRepoRuleVO[]
	 */
	public CoaCntrRepoRuleVO[] getCoaCntrRepoRuleVOs(){
		CoaCntrRepoRuleVO[] vos = (CoaCntrRepoRuleVO[])models.toArray(new CoaCntrRepoRuleVO[models.size()]);
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
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imbalToRto = this.imbalToRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imbalFmRto = this.imbalFmRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opbAllAplyFlg = this.opbAllAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mbToRto = this.mbToRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eqRepoCrLvl = this.eqRepoCrLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imbalAllAplyFlg = this.imbalAllAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opbFmAmt = this.opbFmAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mbAllAplyFlg = this.mbAllAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mbFmRto = this.mbFmRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.opbToAmt = this.opbToAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
