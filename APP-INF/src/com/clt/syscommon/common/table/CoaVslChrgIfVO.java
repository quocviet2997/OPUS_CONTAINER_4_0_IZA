/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaVslChrgIfVO.java
*@FileTitle : CoaVslChrgIfVO
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

public class CoaVslChrgIfVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaVslChrgIfVO> models = new ArrayList<CoaVslChrgIfVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String n1stHirRt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n2ndHirRt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String n2ndCurrCd = null;
	/* Column Info */
	private String chrgCtrtSeq = null;
	/* Column Info */
	private String ctrtEffFmDt = null;
	/* Column Info */
	private String ctrtEffToDt = null;
	/* Column Info */
	private String chrgCtrtNo = null;
	/* Column Info */
	private String n1stCurrCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaVslChrgIfVO() {}

	public CoaVslChrgIfVO(String ibflag, String pagerows, String costYrmon, String vslCd, String chrgCtrtNo, String chrgCtrtSeq, String ctrtEffFmDt, String ctrtEffToDt, String n1stHirRt, String n1stCurrCd, String n2ndHirRt, String n2ndCurrCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.n1stHirRt = n1stHirRt;
		this.creDt = creDt;
		this.n2ndHirRt = n2ndHirRt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.costYrmon = costYrmon;
		this.n2ndCurrCd = n2ndCurrCd;
		this.chrgCtrtSeq = chrgCtrtSeq;
		this.ctrtEffFmDt = ctrtEffFmDt;
		this.ctrtEffToDt = ctrtEffToDt;
		this.chrgCtrtNo = chrgCtrtNo;
		this.n1stCurrCd = n1stCurrCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("n1st_hir_rt", getN1stHirRt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n2nd_hir_rt", getN2ndHirRt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("n2nd_curr_cd", getN2ndCurrCd());
		this.hashColumns.put("chrg_ctrt_seq", getChrgCtrtSeq());
		this.hashColumns.put("ctrt_eff_fm_dt", getCtrtEffFmDt());
		this.hashColumns.put("ctrt_eff_to_dt", getCtrtEffToDt());
		this.hashColumns.put("chrg_ctrt_no", getChrgCtrtNo());
		this.hashColumns.put("n1st_curr_cd", getN1stCurrCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("n1st_hir_rt", "n1stHirRt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n2nd_hir_rt", "n2ndHirRt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("n2nd_curr_cd", "n2ndCurrCd");
		this.hashFields.put("chrg_ctrt_seq", "chrgCtrtSeq");
		this.hashFields.put("ctrt_eff_fm_dt", "ctrtEffFmDt");
		this.hashFields.put("ctrt_eff_to_dt", "ctrtEffToDt");
		this.hashFields.put("chrg_ctrt_no", "chrgCtrtNo");
		this.hashFields.put("n1st_curr_cd", "n1stCurrCd");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return n1stHirRt
	 */
	public String getN1stHirRt() {
		return this.n1stHirRt;
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
	 * @return n2ndHirRt
	 */
	public String getN2ndHirRt() {
		return this.n2ndHirRt;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return n2ndCurrCd
	 */
	public String getN2ndCurrCd() {
		return this.n2ndCurrCd;
	}
	
	/**
	 * Column Info
	 * @return chrgCtrtSeq
	 */
	public String getChrgCtrtSeq() {
		return this.chrgCtrtSeq;
	}
	
	/**
	 * Column Info
	 * @return ctrtEffFmDt
	 */
	public String getCtrtEffFmDt() {
		return this.ctrtEffFmDt;
	}
	
	/**
	 * Column Info
	 * @return ctrtEffToDt
	 */
	public String getCtrtEffToDt() {
		return this.ctrtEffToDt;
	}
	
	/**
	 * Column Info
	 * @return chrgCtrtNo
	 */
	public String getChrgCtrtNo() {
		return this.chrgCtrtNo;
	}
	
	/**
	 * Column Info
	 * @return n1stCurrCd
	 */
	public String getN1stCurrCd() {
		return this.n1stCurrCd;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param n1stHirRt
	 */
	public void setN1stHirRt(String n1stHirRt) {
		this.n1stHirRt = n1stHirRt;
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
	 * @param n2ndHirRt
	 */
	public void setN2ndHirRt(String n2ndHirRt) {
		this.n2ndHirRt = n2ndHirRt;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param n2ndCurrCd
	 */
	public void setN2ndCurrCd(String n2ndCurrCd) {
		this.n2ndCurrCd = n2ndCurrCd;
	}
	
	/**
	 * Column Info
	 * @param chrgCtrtSeq
	 */
	public void setChrgCtrtSeq(String chrgCtrtSeq) {
		this.chrgCtrtSeq = chrgCtrtSeq;
	}
	
	/**
	 * Column Info
	 * @param ctrtEffFmDt
	 */
	public void setCtrtEffFmDt(String ctrtEffFmDt) {
		this.ctrtEffFmDt = ctrtEffFmDt;
	}
	
	/**
	 * Column Info
	 * @param ctrtEffToDt
	 */
	public void setCtrtEffToDt(String ctrtEffToDt) {
		this.ctrtEffToDt = ctrtEffToDt;
	}
	
	/**
	 * Column Info
	 * @param chrgCtrtNo
	 */
	public void setChrgCtrtNo(String chrgCtrtNo) {
		this.chrgCtrtNo = chrgCtrtNo;
	}
	
	/**
	 * Column Info
	 * @param n1stCurrCd
	 */
	public void setN1stCurrCd(String n1stCurrCd) {
		this.n1stCurrCd = n1stCurrCd;
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
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setN1stHirRt(JSPUtil.getParameter(request, "n1st_hir_rt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN2ndHirRt(JSPUtil.getParameter(request, "n2nd_hir_rt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setN2ndCurrCd(JSPUtil.getParameter(request, "n2nd_curr_cd", ""));
		setChrgCtrtSeq(JSPUtil.getParameter(request, "chrg_ctrt_seq", ""));
		setCtrtEffFmDt(JSPUtil.getParameter(request, "ctrt_eff_fm_dt", ""));
		setCtrtEffToDt(JSPUtil.getParameter(request, "ctrt_eff_to_dt", ""));
		setChrgCtrtNo(JSPUtil.getParameter(request, "chrg_ctrt_no", ""));
		setN1stCurrCd(JSPUtil.getParameter(request, "n1st_curr_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaVslChrgIfVO[]
	 */
	public CoaVslChrgIfVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaVslChrgIfVO[]
	 */
	public CoaVslChrgIfVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaVslChrgIfVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] n1stHirRt = (JSPUtil.getParameter(request, prefix	+ "n1st_hir_rt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] n2ndHirRt = (JSPUtil.getParameter(request, prefix	+ "n2nd_hir_rt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] n2ndCurrCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_curr_cd", length));
			String[] chrgCtrtSeq = (JSPUtil.getParameter(request, prefix	+ "chrg_ctrt_seq", length));
			String[] ctrtEffFmDt = (JSPUtil.getParameter(request, prefix	+ "ctrt_eff_fm_dt", length));
			String[] ctrtEffToDt = (JSPUtil.getParameter(request, prefix	+ "ctrt_eff_to_dt", length));
			String[] chrgCtrtNo = (JSPUtil.getParameter(request, prefix	+ "chrg_ctrt_no", length));
			String[] n1stCurrCd = (JSPUtil.getParameter(request, prefix	+ "n1st_curr_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaVslChrgIfVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (n1stHirRt[i] != null)
					model.setN1stHirRt(n1stHirRt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n2ndHirRt[i] != null)
					model.setN2ndHirRt(n2ndHirRt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (n2ndCurrCd[i] != null)
					model.setN2ndCurrCd(n2ndCurrCd[i]);
				if (chrgCtrtSeq[i] != null)
					model.setChrgCtrtSeq(chrgCtrtSeq[i]);
				if (ctrtEffFmDt[i] != null)
					model.setCtrtEffFmDt(ctrtEffFmDt[i]);
				if (ctrtEffToDt[i] != null)
					model.setCtrtEffToDt(ctrtEffToDt[i]);
				if (chrgCtrtNo[i] != null)
					model.setChrgCtrtNo(chrgCtrtNo[i]);
				if (n1stCurrCd[i] != null)
					model.setN1stCurrCd(n1stCurrCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaVslChrgIfVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaVslChrgIfVO[]
	 */
	public CoaVslChrgIfVO[] getCoaVslChrgIfVOs(){
		CoaVslChrgIfVO[] vos = (CoaVslChrgIfVO[])models.toArray(new CoaVslChrgIfVO[models.size()]);
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
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stHirRt = this.n1stHirRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndHirRt = this.n2ndHirRt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndCurrCd = this.n2ndCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chrgCtrtSeq = this.chrgCtrtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtEffFmDt = this.ctrtEffFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtEffToDt = this.ctrtEffToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chrgCtrtNo = this.chrgCtrtNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stCurrCd = this.n1stCurrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
