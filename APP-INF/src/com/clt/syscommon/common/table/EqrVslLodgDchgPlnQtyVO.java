/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : EqrVslLodgDchgPlnQtyVO.java
*@FileTitle : EqrVslLodgDchgPlnQtyVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.27
*@LastModifier : 
*@LastVersion : 1.0
* 2009.08.27  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class EqrVslLodgDchgPlnQtyVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<EqrVslLodgDchgPlnQtyVO> models = new ArrayList<EqrVslLodgDchgPlnQtyVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String prePlnCntrQty = null;
	/* Column Info */
	private String plnUcAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String plnYrwk = null;
	/* Column Info */
	private String plnSeq = null;
	/* Column Info */
	private String lodgPortCostAmt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String repoPlnId = null;
	/* Column Info */
	private String codSimFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String prePlnDchgLocCd = null;
	/* Column Info */
	private String cntrTpszCd = null;
	/* Column Info */
	private String codDchgPlnFlg = null;
	/* Column Info */
	private String cntrQty = null;
	/* Column Info */
	private String lodgDchgCostAmt = null;
	/* Column Info */
	private String dchgPortCostAmt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public EqrVslLodgDchgPlnQtyVO() {}

	public EqrVslLodgDchgPlnQtyVO(String ibflag, String pagerows, String repoPlnId, String plnYrwk, String plnSeq, String cntrTpszCd, String cntrQty, String lodgDchgCostAmt, String prePlnCntrQty, String plnUcAmt, String lodgPortCostAmt, String creUsrId, String creDt, String updUsrId, String updDt, String codSimFlg, String codDchgPlnFlg, String prePlnDchgLocCd, String dchgPortCostAmt) {
		this.updDt = updDt;
		this.prePlnCntrQty = prePlnCntrQty;
		this.plnUcAmt = plnUcAmt;
		this.creDt = creDt;
		this.plnYrwk = plnYrwk;
		this.plnSeq = plnSeq;
		this.lodgPortCostAmt = lodgPortCostAmt;
		this.pagerows = pagerows;
		this.repoPlnId = repoPlnId;
		this.codSimFlg = codSimFlg;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.prePlnDchgLocCd = prePlnDchgLocCd;
		this.cntrTpszCd = cntrTpszCd;
		this.codDchgPlnFlg = codDchgPlnFlg;
		this.cntrQty = cntrQty;
		this.lodgDchgCostAmt = lodgDchgCostAmt;
		this.dchgPortCostAmt = dchgPortCostAmt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pre_pln_cntr_qty", getPrePlnCntrQty());
		this.hashColumns.put("pln_uc_amt", getPlnUcAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pln_yrwk", getPlnYrwk());
		this.hashColumns.put("pln_seq", getPlnSeq());
		this.hashColumns.put("lodg_port_cost_amt", getLodgPortCostAmt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("repo_pln_id", getRepoPlnId());
		this.hashColumns.put("cod_sim_flg", getCodSimFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pre_pln_dchg_loc_cd", getPrePlnDchgLocCd());
		this.hashColumns.put("cntr_tpsz_cd", getCntrTpszCd());
		this.hashColumns.put("cod_dchg_pln_flg", getCodDchgPlnFlg());
		this.hashColumns.put("cntr_qty", getCntrQty());
		this.hashColumns.put("lodg_dchg_cost_amt", getLodgDchgCostAmt());
		this.hashColumns.put("dchg_port_cost_amt", getDchgPortCostAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pre_pln_cntr_qty", "prePlnCntrQty");
		this.hashFields.put("pln_uc_amt", "plnUcAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pln_yrwk", "plnYrwk");
		this.hashFields.put("pln_seq", "plnSeq");
		this.hashFields.put("lodg_port_cost_amt", "lodgPortCostAmt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("repo_pln_id", "repoPlnId");
		this.hashFields.put("cod_sim_flg", "codSimFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pre_pln_dchg_loc_cd", "prePlnDchgLocCd");
		this.hashFields.put("cntr_tpsz_cd", "cntrTpszCd");
		this.hashFields.put("cod_dchg_pln_flg", "codDchgPlnFlg");
		this.hashFields.put("cntr_qty", "cntrQty");
		this.hashFields.put("lodg_dchg_cost_amt", "lodgDchgCostAmt");
		this.hashFields.put("dchg_port_cost_amt", "dchgPortCostAmt");
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
	 * @return prePlnCntrQty
	 */
	public String getPrePlnCntrQty() {
		return this.prePlnCntrQty;
	}
	
	/**
	 * Column Info
	 * @return plnUcAmt
	 */
	public String getPlnUcAmt() {
		return this.plnUcAmt;
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
	 * @return plnYrwk
	 */
	public String getPlnYrwk() {
		return this.plnYrwk;
	}
	
	/**
	 * Column Info
	 * @return plnSeq
	 */
	public String getPlnSeq() {
		return this.plnSeq;
	}
	
	/**
	 * Column Info
	 * @return lodgPortCostAmt
	 */
	public String getLodgPortCostAmt() {
		return this.lodgPortCostAmt;
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
	 * @return repoPlnId
	 */
	public String getRepoPlnId() {
		return this.repoPlnId;
	}
	
	/**
	 * Column Info
	 * @return codSimFlg
	 */
	public String getCodSimFlg() {
		return this.codSimFlg;
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
	 * @return prePlnDchgLocCd
	 */
	public String getPrePlnDchgLocCd() {
		return this.prePlnDchgLocCd;
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
	 * @return codDchgPlnFlg
	 */
	public String getCodDchgPlnFlg() {
		return this.codDchgPlnFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrQty
	 */
	public String getCntrQty() {
		return this.cntrQty;
	}
	
	/**
	 * Column Info
	 * @return lodgDchgCostAmt
	 */
	public String getLodgDchgCostAmt() {
		return this.lodgDchgCostAmt;
	}
	
	/**
	 * Column Info
	 * @return dchgPortCostAmt
	 */
	public String getDchgPortCostAmt() {
		return this.dchgPortCostAmt;
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
	 * @param prePlnCntrQty
	 */
	public void setPrePlnCntrQty(String prePlnCntrQty) {
		this.prePlnCntrQty = prePlnCntrQty;
	}
	
	/**
	 * Column Info
	 * @param plnUcAmt
	 */
	public void setPlnUcAmt(String plnUcAmt) {
		this.plnUcAmt = plnUcAmt;
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
	 * @param plnYrwk
	 */
	public void setPlnYrwk(String plnYrwk) {
		this.plnYrwk = plnYrwk;
	}
	
	/**
	 * Column Info
	 * @param plnSeq
	 */
	public void setPlnSeq(String plnSeq) {
		this.plnSeq = plnSeq;
	}
	
	/**
	 * Column Info
	 * @param lodgPortCostAmt
	 */
	public void setLodgPortCostAmt(String lodgPortCostAmt) {
		this.lodgPortCostAmt = lodgPortCostAmt;
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
	 * @param repoPlnId
	 */
	public void setRepoPlnId(String repoPlnId) {
		this.repoPlnId = repoPlnId;
	}
	
	/**
	 * Column Info
	 * @param codSimFlg
	 */
	public void setCodSimFlg(String codSimFlg) {
		this.codSimFlg = codSimFlg;
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
	 * @param prePlnDchgLocCd
	 */
	public void setPrePlnDchgLocCd(String prePlnDchgLocCd) {
		this.prePlnDchgLocCd = prePlnDchgLocCd;
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
	 * @param codDchgPlnFlg
	 */
	public void setCodDchgPlnFlg(String codDchgPlnFlg) {
		this.codDchgPlnFlg = codDchgPlnFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrQty
	 */
	public void setCntrQty(String cntrQty) {
		this.cntrQty = cntrQty;
	}
	
	/**
	 * Column Info
	 * @param lodgDchgCostAmt
	 */
	public void setLodgDchgCostAmt(String lodgDchgCostAmt) {
		this.lodgDchgCostAmt = lodgDchgCostAmt;
	}
	
	/**
	 * Column Info
	 * @param dchgPortCostAmt
	 */
	public void setDchgPortCostAmt(String dchgPortCostAmt) {
		this.dchgPortCostAmt = dchgPortCostAmt;
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
		setPrePlnCntrQty(JSPUtil.getParameter(request, "pre_pln_cntr_qty", ""));
		setPlnUcAmt(JSPUtil.getParameter(request, "pln_uc_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPlnYrwk(JSPUtil.getParameter(request, "pln_yrwk", ""));
		setPlnSeq(JSPUtil.getParameter(request, "pln_seq", ""));
		setLodgPortCostAmt(JSPUtil.getParameter(request, "lodg_port_cost_amt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRepoPlnId(JSPUtil.getParameter(request, "repo_pln_id", ""));
		setCodSimFlg(JSPUtil.getParameter(request, "cod_sim_flg", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPrePlnDchgLocCd(JSPUtil.getParameter(request, "pre_pln_dchg_loc_cd", ""));
		setCntrTpszCd(JSPUtil.getParameter(request, "cntr_tpsz_cd", ""));
		setCodDchgPlnFlg(JSPUtil.getParameter(request, "cod_dchg_pln_flg", ""));
		setCntrQty(JSPUtil.getParameter(request, "cntr_qty", ""));
		setLodgDchgCostAmt(JSPUtil.getParameter(request, "lodg_dchg_cost_amt", ""));
		setDchgPortCostAmt(JSPUtil.getParameter(request, "dchg_port_cost_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return EqrVslLodgDchgPlnQtyVO[]
	 */
	public EqrVslLodgDchgPlnQtyVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return EqrVslLodgDchgPlnQtyVO[]
	 */
	public EqrVslLodgDchgPlnQtyVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		EqrVslLodgDchgPlnQtyVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] prePlnCntrQty = (JSPUtil.getParameter(request, prefix	+ "pre_pln_cntr_qty", length));
			String[] plnUcAmt = (JSPUtil.getParameter(request, prefix	+ "pln_uc_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] plnYrwk = (JSPUtil.getParameter(request, prefix	+ "pln_yrwk", length));
			String[] plnSeq = (JSPUtil.getParameter(request, prefix	+ "pln_seq", length));
			String[] lodgPortCostAmt = (JSPUtil.getParameter(request, prefix	+ "lodg_port_cost_amt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] repoPlnId = (JSPUtil.getParameter(request, prefix	+ "repo_pln_id", length));
			String[] codSimFlg = (JSPUtil.getParameter(request, prefix	+ "cod_sim_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] prePlnDchgLocCd = (JSPUtil.getParameter(request, prefix	+ "pre_pln_dchg_loc_cd", length));
			String[] cntrTpszCd = (JSPUtil.getParameter(request, prefix	+ "cntr_tpsz_cd", length));
			String[] codDchgPlnFlg = (JSPUtil.getParameter(request, prefix	+ "cod_dchg_pln_flg", length));
			String[] cntrQty = (JSPUtil.getParameter(request, prefix	+ "cntr_qty", length));
			String[] lodgDchgCostAmt = (JSPUtil.getParameter(request, prefix	+ "lodg_dchg_cost_amt", length));
			String[] dchgPortCostAmt = (JSPUtil.getParameter(request, prefix	+ "dchg_port_cost_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new EqrVslLodgDchgPlnQtyVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (prePlnCntrQty[i] != null)
					model.setPrePlnCntrQty(prePlnCntrQty[i]);
				if (plnUcAmt[i] != null)
					model.setPlnUcAmt(plnUcAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (plnYrwk[i] != null)
					model.setPlnYrwk(plnYrwk[i]);
				if (plnSeq[i] != null)
					model.setPlnSeq(plnSeq[i]);
				if (lodgPortCostAmt[i] != null)
					model.setLodgPortCostAmt(lodgPortCostAmt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (repoPlnId[i] != null)
					model.setRepoPlnId(repoPlnId[i]);
				if (codSimFlg[i] != null)
					model.setCodSimFlg(codSimFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (prePlnDchgLocCd[i] != null)
					model.setPrePlnDchgLocCd(prePlnDchgLocCd[i]);
				if (cntrTpszCd[i] != null)
					model.setCntrTpszCd(cntrTpszCd[i]);
				if (codDchgPlnFlg[i] != null)
					model.setCodDchgPlnFlg(codDchgPlnFlg[i]);
				if (cntrQty[i] != null)
					model.setCntrQty(cntrQty[i]);
				if (lodgDchgCostAmt[i] != null)
					model.setLodgDchgCostAmt(lodgDchgCostAmt[i]);
				if (dchgPortCostAmt[i] != null)
					model.setDchgPortCostAmt(dchgPortCostAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getEqrVslLodgDchgPlnQtyVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return EqrVslLodgDchgPlnQtyVO[]
	 */
	public EqrVslLodgDchgPlnQtyVO[] getEqrVslLodgDchgPlnQtyVOs(){
		EqrVslLodgDchgPlnQtyVO[] vos = (EqrVslLodgDchgPlnQtyVO[])models.toArray(new EqrVslLodgDchgPlnQtyVO[models.size()]);
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
		this.prePlnCntrQty = this.prePlnCntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnUcAmt = this.plnUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnYrwk = this.plnYrwk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plnSeq = this.plnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgPortCostAmt = this.lodgPortCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repoPlnId = this.repoPlnId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codSimFlg = this.codSimFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prePlnDchgLocCd = this.prePlnDchgLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrTpszCd = this.cntrTpszCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codDchgPlnFlg = this.codDchgPlnFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrQty = this.cntrQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lodgDchgCostAmt = this.lodgDchgCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dchgPortCostAmt = this.dchgPortCostAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
