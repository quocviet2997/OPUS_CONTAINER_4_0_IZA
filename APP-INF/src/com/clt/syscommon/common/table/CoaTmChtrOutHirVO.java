/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaTmChtrOutHirVO.java
*@FileTitle : CoaTmChtrOutHirVO
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

public class CoaTmChtrOutHirVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaTmChtrOutHirVO> models = new ArrayList<CoaTmChtrOutHirVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslTeuUcAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String toHirSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String toVslClssCapa = null;
	/* Column Info */
	private String vslDlyUcAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fmVslClssCapa = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaTmChtrOutHirVO() {}

	public CoaTmChtrOutHirVO(String ibflag, String pagerows, String toHirSeq, String fmVslClssCapa, String toVslClssCapa, String vslTeuUcAmt, String vslDlyUcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslTeuUcAmt = vslTeuUcAmt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.toHirSeq = toHirSeq;
		this.creDt = creDt;
		this.toVslClssCapa = toVslClssCapa;
		this.vslDlyUcAmt = vslDlyUcAmt;
		this.updUsrId = updUsrId;
		this.fmVslClssCapa = fmVslClssCapa;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_teu_uc_amt", getVslTeuUcAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("to_hir_seq", getToHirSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("to_vsl_clss_capa", getToVslClssCapa());
		this.hashColumns.put("vsl_dly_uc_amt", getVslDlyUcAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("fm_vsl_clss_capa", getFmVslClssCapa());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_teu_uc_amt", "vslTeuUcAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("to_hir_seq", "toHirSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("to_vsl_clss_capa", "toVslClssCapa");
		this.hashFields.put("vsl_dly_uc_amt", "vslDlyUcAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("fm_vsl_clss_capa", "fmVslClssCapa");
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
	 * @return vslTeuUcAmt
	 */
	public String getVslTeuUcAmt() {
		return this.vslTeuUcAmt;
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
	 * @return toHirSeq
	 */
	public String getToHirSeq() {
		return this.toHirSeq;
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
	 * @return toVslClssCapa
	 */
	public String getToVslClssCapa() {
		return this.toVslClssCapa;
	}
	
	/**
	 * Column Info
	 * @return vslDlyUcAmt
	 */
	public String getVslDlyUcAmt() {
		return this.vslDlyUcAmt;
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
	 * @return fmVslClssCapa
	 */
	public String getFmVslClssCapa() {
		return this.fmVslClssCapa;
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
	 * @param vslTeuUcAmt
	 */
	public void setVslTeuUcAmt(String vslTeuUcAmt) {
		this.vslTeuUcAmt = vslTeuUcAmt;
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
	 * @param toHirSeq
	 */
	public void setToHirSeq(String toHirSeq) {
		this.toHirSeq = toHirSeq;
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
	 * @param toVslClssCapa
	 */
	public void setToVslClssCapa(String toVslClssCapa) {
		this.toVslClssCapa = toVslClssCapa;
	}
	
	/**
	 * Column Info
	 * @param vslDlyUcAmt
	 */
	public void setVslDlyUcAmt(String vslDlyUcAmt) {
		this.vslDlyUcAmt = vslDlyUcAmt;
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
	 * @param fmVslClssCapa
	 */
	public void setFmVslClssCapa(String fmVslClssCapa) {
		this.fmVslClssCapa = fmVslClssCapa;
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
		setVslTeuUcAmt(JSPUtil.getParameter(request, "vsl_teu_uc_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setToHirSeq(JSPUtil.getParameter(request, "to_hir_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setToVslClssCapa(JSPUtil.getParameter(request, "to_vsl_clss_capa", ""));
		setVslDlyUcAmt(JSPUtil.getParameter(request, "vsl_dly_uc_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFmVslClssCapa(JSPUtil.getParameter(request, "fm_vsl_clss_capa", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaTmChtrOutHirVO[]
	 */
	public CoaTmChtrOutHirVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaTmChtrOutHirVO[]
	 */
	public CoaTmChtrOutHirVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaTmChtrOutHirVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslTeuUcAmt = (JSPUtil.getParameter(request, prefix	+ "vsl_teu_uc_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] toHirSeq = (JSPUtil.getParameter(request, prefix	+ "to_hir_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] toVslClssCapa = (JSPUtil.getParameter(request, prefix	+ "to_vsl_clss_capa", length));
			String[] vslDlyUcAmt = (JSPUtil.getParameter(request, prefix	+ "vsl_dly_uc_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fmVslClssCapa = (JSPUtil.getParameter(request, prefix	+ "fm_vsl_clss_capa", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaTmChtrOutHirVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslTeuUcAmt[i] != null)
					model.setVslTeuUcAmt(vslTeuUcAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (toHirSeq[i] != null)
					model.setToHirSeq(toHirSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (toVslClssCapa[i] != null)
					model.setToVslClssCapa(toVslClssCapa[i]);
				if (vslDlyUcAmt[i] != null)
					model.setVslDlyUcAmt(vslDlyUcAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fmVslClssCapa[i] != null)
					model.setFmVslClssCapa(fmVslClssCapa[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaTmChtrOutHirVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaTmChtrOutHirVO[]
	 */
	public CoaTmChtrOutHirVO[] getCoaTmChtrOutHirVOs(){
		CoaTmChtrOutHirVO[] vos = (CoaTmChtrOutHirVO[])models.toArray(new CoaTmChtrOutHirVO[models.size()]);
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
		this.vslTeuUcAmt = this.vslTeuUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toHirSeq = this.toHirSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toVslClssCapa = this.toVslClssCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslDlyUcAmt = this.vslDlyUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmVslClssCapa = this.fmVslClssCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
