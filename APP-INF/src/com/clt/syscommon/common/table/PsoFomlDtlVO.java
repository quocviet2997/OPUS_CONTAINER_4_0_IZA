/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoFomlDtlVO.java
*@FileTitle : PsoFomlDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.02
*@LastModifier : 김진일
*@LastVersion : 1.0
* 2009.11.02 김진일 
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
 * @author 김진일
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PsoFomlDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PsoFomlDtlVO> models = new ArrayList<PsoFomlDtlVO>();
	
	/* Column Info */
	private String rtObjListNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fomlPrtCtnt = null;
	/* Column Info */
	private String psoFomlOprCd = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String fomlSeq = null;
	/* Column Info */
	private String consNm = null;
	/* Column Info */
	private String psoFomlDtlTpCd = null;
	/* Column Info */
	private String fomlNo = null;
	/* Column Info */
	private String objListNo = null;
	/* Column Info */
	private String rowNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PsoFomlDtlVO() {}

	public PsoFomlDtlVO(String ibflag, String pagerows, String fomlNo, String fomlSeq, String psoFomlDtlTpCd, String psoFomlOprCd, String objListNo, String fomlPrtCtnt, String consNm, String rowNo, String creUsrId, String creDt, String updUsrId, String updDt, String rtObjListNo) {
		this.rtObjListNo = rtObjListNo;
		this.updDt = updDt;
		this.fomlPrtCtnt = fomlPrtCtnt;
		this.psoFomlOprCd = psoFomlOprCd;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.fomlSeq = fomlSeq;
		this.consNm = consNm;
		this.psoFomlDtlTpCd = psoFomlDtlTpCd;
		this.fomlNo = fomlNo;
		this.objListNo = objListNo;
		this.rowNo = rowNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("rt_obj_list_no", getRtObjListNo());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("foml_prt_ctnt", getFomlPrtCtnt());
		this.hashColumns.put("pso_foml_opr_cd", getPsoFomlOprCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("foml_seq", getFomlSeq());
		this.hashColumns.put("cons_nm", getConsNm());
		this.hashColumns.put("pso_foml_dtl_tp_cd", getPsoFomlDtlTpCd());
		this.hashColumns.put("foml_no", getFomlNo());
		this.hashColumns.put("obj_list_no", getObjListNo());
		this.hashColumns.put("row_no", getRowNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("rt_obj_list_no", "rtObjListNo");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("foml_prt_ctnt", "fomlPrtCtnt");
		this.hashFields.put("pso_foml_opr_cd", "psoFomlOprCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("foml_seq", "fomlSeq");
		this.hashFields.put("cons_nm", "consNm");
		this.hashFields.put("pso_foml_dtl_tp_cd", "psoFomlDtlTpCd");
		this.hashFields.put("foml_no", "fomlNo");
		this.hashFields.put("obj_list_no", "objListNo");
		this.hashFields.put("row_no", "rowNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return rtObjListNo
	 */
	public String getRtObjListNo() {
		return this.rtObjListNo;
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
	 * @return fomlPrtCtnt
	 */
	public String getFomlPrtCtnt() {
		return this.fomlPrtCtnt;
	}
	
	/**
	 * Column Info
	 * @return psoFomlOprCd
	 */
	public String getPsoFomlOprCd() {
		return this.psoFomlOprCd;
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
	 * @return fomlSeq
	 */
	public String getFomlSeq() {
		return this.fomlSeq;
	}
	
	/**
	 * Column Info
	 * @return consNm
	 */
	public String getConsNm() {
		return this.consNm;
	}
	
	/**
	 * Column Info
	 * @return psoFomlDtlTpCd
	 */
	public String getPsoFomlDtlTpCd() {
		return this.psoFomlDtlTpCd;
	}
	
	/**
	 * Column Info
	 * @return fomlNo
	 */
	public String getFomlNo() {
		return this.fomlNo;
	}
	
	/**
	 * Column Info
	 * @return objListNo
	 */
	public String getObjListNo() {
		return this.objListNo;
	}
	
	/**
	 * Column Info
	 * @return rowNo
	 */
	public String getRowNo() {
		return this.rowNo;
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
	 * @param rtObjListNo
	 */
	public void setRtObjListNo(String rtObjListNo) {
		this.rtObjListNo = rtObjListNo;
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
	 * @param fomlPrtCtnt
	 */
	public void setFomlPrtCtnt(String fomlPrtCtnt) {
		this.fomlPrtCtnt = fomlPrtCtnt;
	}
	
	/**
	 * Column Info
	 * @param psoFomlOprCd
	 */
	public void setPsoFomlOprCd(String psoFomlOprCd) {
		this.psoFomlOprCd = psoFomlOprCd;
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
	 * @param fomlSeq
	 */
	public void setFomlSeq(String fomlSeq) {
		this.fomlSeq = fomlSeq;
	}
	
	/**
	 * Column Info
	 * @param consNm
	 */
	public void setConsNm(String consNm) {
		this.consNm = consNm;
	}
	
	/**
	 * Column Info
	 * @param psoFomlDtlTpCd
	 */
	public void setPsoFomlDtlTpCd(String psoFomlDtlTpCd) {
		this.psoFomlDtlTpCd = psoFomlDtlTpCd;
	}
	
	/**
	 * Column Info
	 * @param fomlNo
	 */
	public void setFomlNo(String fomlNo) {
		this.fomlNo = fomlNo;
	}
	
	/**
	 * Column Info
	 * @param objListNo
	 */
	public void setObjListNo(String objListNo) {
		this.objListNo = objListNo;
	}
	
	/**
	 * Column Info
	 * @param rowNo
	 */
	public void setRowNo(String rowNo) {
		this.rowNo = rowNo;
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
		setRtObjListNo(JSPUtil.getParameter(request, "rt_obj_list_no", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setFomlPrtCtnt(JSPUtil.getParameter(request, "foml_prt_ctnt", ""));
		setPsoFomlOprCd(JSPUtil.getParameter(request, "pso_foml_opr_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setFomlSeq(JSPUtil.getParameter(request, "foml_seq", ""));
		setConsNm(JSPUtil.getParameter(request, "cons_nm", ""));
		setPsoFomlDtlTpCd(JSPUtil.getParameter(request, "pso_foml_dtl_tp_cd", ""));
		setFomlNo(JSPUtil.getParameter(request, "foml_no", ""));
		setObjListNo(JSPUtil.getParameter(request, "obj_list_no", ""));
		setRowNo(JSPUtil.getParameter(request, "row_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoFomlDtlVO[]
	 */
	public PsoFomlDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoFomlDtlVO[]
	 */
	public PsoFomlDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PsoFomlDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rtObjListNo = (JSPUtil.getParameter(request, prefix	+ "rt_obj_list_no", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fomlPrtCtnt = (JSPUtil.getParameter(request, prefix	+ "foml_prt_ctnt", length));
			String[] psoFomlOprCd = (JSPUtil.getParameter(request, prefix	+ "pso_foml_opr_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] fomlSeq = (JSPUtil.getParameter(request, prefix	+ "foml_seq", length));
			String[] consNm = (JSPUtil.getParameter(request, prefix	+ "cons_nm", length));
			String[] psoFomlDtlTpCd = (JSPUtil.getParameter(request, prefix	+ "pso_foml_dtl_tp_cd", length));
			String[] fomlNo = (JSPUtil.getParameter(request, prefix	+ "foml_no", length));
			String[] objListNo = (JSPUtil.getParameter(request, prefix	+ "obj_list_no", length));
			String[] rowNo = (JSPUtil.getParameter(request, prefix	+ "row_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new PsoFomlDtlVO();
				if (rtObjListNo[i] != null)
					model.setRtObjListNo(rtObjListNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fomlPrtCtnt[i] != null)
					model.setFomlPrtCtnt(fomlPrtCtnt[i]);
				if (psoFomlOprCd[i] != null)
					model.setPsoFomlOprCd(psoFomlOprCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (fomlSeq[i] != null)
					model.setFomlSeq(fomlSeq[i]);
				if (consNm[i] != null)
					model.setConsNm(consNm[i]);
				if (psoFomlDtlTpCd[i] != null)
					model.setPsoFomlDtlTpCd(psoFomlDtlTpCd[i]);
				if (fomlNo[i] != null)
					model.setFomlNo(fomlNo[i]);
				if (objListNo[i] != null)
					model.setObjListNo(objListNo[i]);
				if (rowNo[i] != null)
					model.setRowNo(rowNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPsoFomlDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PsoFomlDtlVO[]
	 */
	public PsoFomlDtlVO[] getPsoFomlDtlVOs(){
		PsoFomlDtlVO[] vos = (PsoFomlDtlVO[])models.toArray(new PsoFomlDtlVO[models.size()]);
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
		this.rtObjListNo = this.rtObjListNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlPrtCtnt = this.fomlPrtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoFomlOprCd = this.psoFomlOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlSeq = this.fomlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.consNm = this.consNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoFomlDtlTpCd = this.psoFomlDtlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fomlNo = this.fomlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.objListNo = this.objListNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rowNo = this.rowNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
