/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqCostApplBseVO.java
*@FileTitle : SaqCostApplBseVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 김민아
*@LastVersion : 1.0
* 2009.07.23 김민아 
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
 * @author 김민아
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SaqCostApplBseVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqCostApplBseVO> models = new ArrayList<SaqCostApplBseVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String costDivDesc = null;
	/* Column Info */
	private String bseQtrCd = null;
	/* Column Info */
	private String applYr = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String applMon = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bseYr = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String costDivCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqCostApplBseVO() {}

	public SaqCostApplBseVO(String ibflag, String pagerows, String bseYr, String bseQtrCd, String costDivCd, String costDivDesc, String applYr, String applMon, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.costDivDesc = costDivDesc;
		this.bseQtrCd = bseQtrCd;
		this.applYr = applYr;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.applMon = applMon;
		this.creDt = creDt;
		this.bseYr = bseYr;
		this.updUsrId = updUsrId;
		this.costDivCd = costDivCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cost_div_desc", getCostDivDesc());
		this.hashColumns.put("bse_qtr_cd", getBseQtrCd());
		this.hashColumns.put("appl_yr", getApplYr());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("appl_mon", getApplMon());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bse_yr", getBseYr());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cost_div_cd", getCostDivCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cost_div_desc", "costDivDesc");
		this.hashFields.put("bse_qtr_cd", "bseQtrCd");
		this.hashFields.put("appl_yr", "applYr");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("appl_mon", "applMon");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bse_yr", "bseYr");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cost_div_cd", "costDivCd");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return costDivDesc
	 */
	public String getCostDivDesc() {
		return this.costDivDesc;
	}
	
	/**
	 * Column Info
	 * @return bseQtrCd
	 */
	public String getBseQtrCd() {
		return this.bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @return applYr
	 */
	public String getApplYr() {
		return this.applYr;
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
	 * @return applMon
	 */
	public String getApplMon() {
		return this.applMon;
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
	 * @return bseYr
	 */
	public String getBseYr() {
		return this.bseYr;
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
	 * @return costDivCd
	 */
	public String getCostDivCd() {
		return this.costDivCd;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param costDivDesc
	 */
	public void setCostDivDesc(String costDivDesc) {
		this.costDivDesc = costDivDesc;
	}
	
	/**
	 * Column Info
	 * @param bseQtrCd
	 */
	public void setBseQtrCd(String bseQtrCd) {
		this.bseQtrCd = bseQtrCd;
	}
	
	/**
	 * Column Info
	 * @param applYr
	 */
	public void setApplYr(String applYr) {
		this.applYr = applYr;
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
	 * @param applMon
	 */
	public void setApplMon(String applMon) {
		this.applMon = applMon;
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
	 * @param bseYr
	 */
	public void setBseYr(String bseYr) {
		this.bseYr = bseYr;
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
	 * @param costDivCd
	 */
	public void setCostDivCd(String costDivCd) {
		this.costDivCd = costDivCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCostDivDesc(JSPUtil.getParameter(request, "cost_div_desc", ""));
		setBseQtrCd(JSPUtil.getParameter(request, "bse_qtr_cd", ""));
		setApplYr(JSPUtil.getParameter(request, "appl_yr", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setApplMon(JSPUtil.getParameter(request, "appl_mon", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBseYr(JSPUtil.getParameter(request, "bse_yr", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCostDivCd(JSPUtil.getParameter(request, "cost_div_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqCostApplBseVO[]
	 */
	public SaqCostApplBseVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqCostApplBseVO[]
	 */
	public SaqCostApplBseVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqCostApplBseVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] costDivDesc = (JSPUtil.getParameter(request, prefix	+ "cost_div_desc", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, prefix	+ "bse_qtr_cd", length));
			String[] applYr = (JSPUtil.getParameter(request, prefix	+ "appl_yr", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] applMon = (JSPUtil.getParameter(request, prefix	+ "appl_mon", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bseYr = (JSPUtil.getParameter(request, prefix	+ "bse_yr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] costDivCd = (JSPUtil.getParameter(request, prefix	+ "cost_div_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqCostApplBseVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costDivDesc[i] != null)
					model.setCostDivDesc(costDivDesc[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bseQtrCd[i]);
				if (applYr[i] != null)
					model.setApplYr(applYr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (applMon[i] != null)
					model.setApplMon(applMon[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bseYr[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (costDivCd[i] != null)
					model.setCostDivCd(costDivCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqCostApplBseVOs();
	}
	
	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqCostApplBseVO[]
	 */
	public SaqCostApplBseVO[] fromRequestGrid(HttpServletRequest request, String bse_yr, String bse_qtr_cd) {
		SaqCostApplBseVO model = null;
		
		String[] tmp = request.getParameterValues("appl_mon");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues("appl_mon").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, "upd_dt", length));
			String[] costDivDesc = (JSPUtil.getParameter(request, "cost_div_desc", length));
			String[] bseQtrCd = (JSPUtil.getParameter(request, "bse_qtr_cd", length));
			String[] applYr = (JSPUtil.getParameter(request, "appl_yr", length));
			String[] creUsrId = (JSPUtil.getParameter(request, "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, "ibflag", length));
			String[] applMon = (JSPUtil.getParameter(request, "appl_mon", length));
			String[] creDt = (JSPUtil.getParameter(request, "cre_dt", length));
			String[] bseYr = (JSPUtil.getParameter(request, "bse_yr", length));
			String[] updUsrId = (JSPUtil.getParameter(request, "upd_usr_id", length));
			String[] costDivCd = (JSPUtil.getParameter(request, "cost_div_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqCostApplBseVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (costDivDesc[i] != null)
					model.setCostDivDesc(costDivDesc[i]);
				if (bseQtrCd[i] != null)
					model.setBseQtrCd(bse_qtr_cd); // 변수 사용
				if (applYr[i] != null)
					model.setApplYr(applYr[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (applMon[i] != null)
					model.setApplMon(applMon[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bseYr[i] != null)
					model.setBseYr(bse_yr); // 변수 사용
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (costDivCd[i] != null)
					model.setCostDivCd(costDivCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqCostApplBseVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqCostApplBseVO[]
	 */
	public SaqCostApplBseVO[] getSaqCostApplBseVOs(){
		SaqCostApplBseVO[] vos = (SaqCostApplBseVO[])models.toArray(new SaqCostApplBseVO[models.size()]);
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
		this.costDivDesc = this.costDivDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseQtrCd = this.bseQtrCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.applYr = this.applYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.applMon = this.applMon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseYr = this.bseYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costDivCd = this.costDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
