/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsHireVO.java
*@FileTitle : FmsHireVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.04
*@LastModifier : 
*@LastVersion : 1.0
* 2009.02.04  
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 
 * @since J2EE 1.5
 */

public class FmsHireVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsHireVO> models = new ArrayList<FmsHireVO>();
	
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String hirCurrN1stCd = null;
	/* Column Inpo */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Column Inpo */
	private String hirRtN1stAmt = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String effDt = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String hirCurrN2ndCd = null;
	/* Column Inpo */
	private String expDt = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String hirRtN2ndAmt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsHireVO() {}

	public FmsHireVO(String ibflag, String pagerows, String fletCtrtNo, String effDt, String expDt, String hirRtN1stAmt, String hirCurrN1stCd, String hirRtN2ndAmt, String hirCurrN2ndCd, String creUsrId, String creDt, String updUsrId, String updDt, String oriEffDt, String oriExpDt) {
		this.updDt = updDt;
		this.hirCurrN1stCd = hirCurrN1stCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.fletCtrtNo = fletCtrtNo;
		this.hirRtN1stAmt = hirRtN1stAmt;
		this.ibflag = ibflag;
		this.effDt = effDt;
		this.creUsrId = creUsrId;
		this.hirCurrN2ndCd = hirCurrN2ndCd;
		this.expDt = expDt;
		this.updUsrId = updUsrId;
		this.hirRtN2ndAmt = hirRtN2ndAmt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hir_curr_n1st_cd", getHirCurrN1stCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("hir_rt_n1st_amt", getHirRtN1stAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("hir_curr_n2nd_cd", getHirCurrN2ndCd());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("hir_rt_n2nd_amt", getHirRtN2ndAmt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hir_curr_n1st_cd", "hirCurrN1stCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("hir_rt_n1st_amt", "hirRtN1stAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("hir_curr_n2nd_cd", "hirCurrN2ndCd");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("hir_rt_n2nd_amt", "hirRtN2ndAmt");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getHirCurrN1stCd() {
		return this.hirCurrN1stCd;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getHirRtN1stAmt() {
		return this.hirRtN1stAmt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getHirCurrN2ndCd() {
		return this.hirCurrN2ndCd;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getHirRtN2ndAmt() {
		return this.hirRtN2ndAmt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setHirCurrN1stCd(String hirCurrN1stCd) {
		this.hirCurrN1stCd = hirCurrN1stCd;
		//this.hirCurrN1stCd=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setHirRtN1stAmt(String hirRtN1stAmt) {
		this.hirRtN1stAmt = hirRtN1stAmt;
		//this.hirRtN1stAmt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setHirCurrN2ndCd(String hirCurrN2ndCd) {
		this.hirCurrN2ndCd = hirCurrN2ndCd;
		//this.hirCurrN2ndCd=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setHirRtN2ndAmt(String hirRtN2ndAmt) {
		this.hirRtN2ndAmt = hirRtN2ndAmt;
		//this.hirRtN2ndAmt=true;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setHirCurrN1stCd(JSPUtil.getParameter(request, "hir_curr_n1st_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setHirRtN1stAmt(JSPUtil.getParameter(request, "hir_rt_n1st_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setHirCurrN2ndCd(JSPUtil.getParameter(request, "hir_curr_n2nd_cd", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setHirRtN2ndAmt(JSPUtil.getParameter(request, "hir_rt_n2nd_amt", ""));
	}

	public void fromRequestGrid(HttpServletRequest request) {
		fromRequestGrid(request, "");
	}

	public FmsHireVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsHireVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] hirCurrN1stCd = (JSPUtil.getParameter(request, prefix	+ "hir_curr_n1st_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] hirRtN1stAmt = (JSPUtil.getParameter(request, prefix	+ "hir_rt_n1st_amt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] hirCurrN2ndCd = (JSPUtil.getParameter(request, prefix	+ "hir_curr_n2nd_cd".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] hirRtN2ndAmt = (JSPUtil.getParameter(request, prefix	+ "hir_rt_n2nd_amt".trim(), length));
			
			String[] oriEffDt = (JSPUtil.getParameter(request, prefix	+ "ori_eff_dt".trim(), length));
			String[] oriExpDt = (JSPUtil.getParameter(request, prefix	+ "ori_exp_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsHireVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hirCurrN1stCd[i] != null)
					model.setHirCurrN1stCd(hirCurrN1stCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (hirRtN1stAmt[i] != null)
					model.setHirRtN1stAmt(hirRtN1stAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (hirCurrN2ndCd[i] != null)
					model.setHirCurrN2ndCd(hirCurrN2ndCd[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (hirRtN2ndAmt[i] != null)
					model.setHirRtN2ndAmt(hirRtN2ndAmt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		
		return getFmsHireVOs();
	}

	public FmsHireVO[] getFmsHireVOs(){
		FmsHireVO[] vos = (FmsHireVO[])models.toArray(new FmsHireVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}

}
