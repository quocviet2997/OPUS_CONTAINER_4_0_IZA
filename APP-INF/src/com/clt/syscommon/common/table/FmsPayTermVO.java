/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : FmsPayTermVO.java
*@FileTitle : FmsPayTermVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.02.05
*@LastModifier : 
*@LastVersion : 1.0
* 2009.02.05  
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

public class FmsPayTermVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<FmsPayTermVO> models = new ArrayList<FmsPayTermVO>();
	
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String ctrtPayTermCd = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String effDt = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String expDt = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String fletCtrtNo = null;
	/* Page Number */
	private String pagerows = null;
	
	/* Column Inpo */
	private String oriEffDt = null;
	/* Column Inpo */
	private String oriExpDt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public FmsPayTermVO() {}

	public FmsPayTermVO(String ibflag, String pagerows, String fletCtrtNo, String effDt, String expDt, String ctrtPayTermCd, String creUsrId, String creDt, String updUsrId, String updDt, String oriEffDt, String oriExpDt) {
		this.updDt = updDt;
		this.ctrtPayTermCd = ctrtPayTermCd;
		this.creUsrId = creUsrId;
		this.effDt = effDt;
		this.ibflag = ibflag;
		this.creDt = creDt;
		this.expDt = expDt;
		this.updUsrId = updUsrId;
		this.fletCtrtNo = fletCtrtNo;
		this.pagerows = pagerows;
		
		this.oriEffDt = oriEffDt;
		this.oriExpDt = oriExpDt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ctrt_pay_term_cd", getCtrtPayTermCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("eff_dt", getEffDt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("exp_dt", getExpDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("flet_ctrt_no", getFletCtrtNo());
		this.hashColumns.put("pagerows", getPagerows());
		
		this.hashColumns.put("ori_eff_dt", getOriEffDt());
		this.hashColumns.put("ori_exp_dt", getOriExpDt());
		
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ctrt_pay_term_cd", "ctrtPayTermCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("eff_dt", "effDt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("exp_dt", "expDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("flet_ctrt_no", "fletCtrtNo");
		this.hashFields.put("pagerows", "pagerows");
		
		this.hashFields.put("ori_eff_dt", "oriEffDt");
		this.hashFields.put("ori_exp_dt", "oriExpDt");
		
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCtrtPayTermCd() {
		return this.ctrtPayTermCd;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getEffDt() {
		return this.effDt;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getExpDt() {
		return this.expDt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getFletCtrtNo() {
		return this.fletCtrtNo;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	
	public String getOriEffDt() {
		return this.oriEffDt;
	}
	
	public String getOriExpDt() {
		return this.oriExpDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCtrtPayTermCd(String ctrtPayTermCd) {
		this.ctrtPayTermCd = ctrtPayTermCd;
		//this.ctrtPayTermCd=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setEffDt(String effDt) {
		this.effDt = effDt;
		//this.effDt=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setExpDt(String expDt) {
		this.expDt = expDt;
		//this.expDt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setFletCtrtNo(String fletCtrtNo) {
		this.fletCtrtNo = fletCtrtNo;
		//this.fletCtrtNo=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	
	public void setOriEffDt(String oriEffDt) {
		this.oriEffDt = oriEffDt;
		//this.effDt=true;
	}
	
	public void setOriExpDt(String oriExpDt) {
		this.oriExpDt = oriExpDt;
		//this.effDt=true;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCtrtPayTermCd(JSPUtil.getParameter(request, "ctrt_pay_term_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEffDt(JSPUtil.getParameter(request, "eff_dt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setExpDt(JSPUtil.getParameter(request, "exp_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFletCtrtNo(JSPUtil.getParameter(request, "flet_ctrt_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		
		setOriEffDt(JSPUtil.getParameter(request, "ori_eff_dt", ""));
		setOriExpDt(JSPUtil.getParameter(request, "ori_exp_dt", ""));
	}

	public void fromRequestGrid(HttpServletRequest request) {
		fromRequestGrid(request, "");
	}

	public FmsPayTermVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		FmsPayTermVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp==null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] ctrtPayTermCd = (JSPUtil.getParameter(request, prefix	+ "ctrt_pay_term_cd".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] effDt = (JSPUtil.getParameter(request, prefix	+ "eff_dt".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] expDt = (JSPUtil.getParameter(request, prefix	+ "exp_dt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] fletCtrtNo = (JSPUtil.getParameter(request, prefix	+ "flet_ctrt_no".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			String[] oriEffDt = (JSPUtil.getParameter(request, prefix	+ "ori_eff_dt".trim(), length));
			String[] oriExpDt = (JSPUtil.getParameter(request, prefix	+ "ori_exp_dt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new FmsPayTermVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ctrtPayTermCd[i] != null)
					model.setCtrtPayTermCd(ctrtPayTermCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (effDt[i] != null)
					model.setEffDt(effDt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (expDt[i] != null)
					model.setExpDt(expDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fletCtrtNo[i] != null)
					model.setFletCtrtNo(fletCtrtNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				
				if (oriEffDt[i] != null)
					model.setOriEffDt(oriEffDt[i]);
				
				if (oriExpDt[i] != null)
					model.setOriExpDt(oriExpDt[i]);
				
				models.add(model);
			}

		} catch (Exception e) {}
		
		return getFmsPayTermVOs();
	}

	public FmsPayTermVO[] getFmsPayTermVOs(){
		FmsPayTermVO[] vos = (FmsPayTermVO[])models.toArray(new FmsPayTermVO[models.size()]);
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
