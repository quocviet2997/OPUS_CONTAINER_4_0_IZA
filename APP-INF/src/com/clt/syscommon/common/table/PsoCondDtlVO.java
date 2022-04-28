/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PsoCondDtlVO.java
*@FileTitle : PsoCondDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.16
*@LastModifier : 김진일
*@LastVersion : 1.0
* 2009.11.16 김진일 
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

public class PsoCondDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PsoCondDtlVO> models = new ArrayList<PsoCondDtlVO>();
	
	/* Column Info */
	private String rtObjListNo = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String condOprValCtnt = null;
	/* Column Info */
	private String condSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String psoCondDtlTpCd = null;
	/* Column Info */
	private String consNm = null;
	/* Column Info */
	private String psoCondOprCd = null;
	/* Column Info */
	private String objListNo = null;
	/* Column Info */
	private String condNo = null;
	/* Column Info */
	private String rowNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PsoCondDtlVO() {}

	public PsoCondDtlVO(String ibflag, String pagerows, String condNo, String condSeq, String psoCondDtlTpCd, String psoCondOprCd, String objListNo, String condOprValCtnt, String consNm, String rowNo, String creUsrId, String creDt, String updUsrId, String updDt, String rtObjListNo) {
		this.rtObjListNo = rtObjListNo;
		this.updDt = updDt;
		this.condOprValCtnt = condOprValCtnt;
		this.condSeq = condSeq;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.psoCondDtlTpCd = psoCondDtlTpCd;
		this.consNm = consNm;
		this.psoCondOprCd = psoCondOprCd;
		this.objListNo = objListNo;
		this.condNo = condNo;
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
		this.hashColumns.put("cond_opr_val_ctnt", getCondOprValCtnt());
		this.hashColumns.put("cond_seq", getCondSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pso_cond_dtl_tp_cd", getPsoCondDtlTpCd());
		this.hashColumns.put("cons_nm", getConsNm());
		this.hashColumns.put("pso_cond_opr_cd", getPsoCondOprCd());
		this.hashColumns.put("obj_list_no", getObjListNo());
		this.hashColumns.put("cond_no", getCondNo());
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
		this.hashFields.put("cond_opr_val_ctnt", "condOprValCtnt");
		this.hashFields.put("cond_seq", "condSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pso_cond_dtl_tp_cd", "psoCondDtlTpCd");
		this.hashFields.put("cons_nm", "consNm");
		this.hashFields.put("pso_cond_opr_cd", "psoCondOprCd");
		this.hashFields.put("obj_list_no", "objListNo");
		this.hashFields.put("cond_no", "condNo");
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
	 * @return condOprValCtnt
	 */
	public String getCondOprValCtnt() {
		return this.condOprValCtnt;
	}
	
	/**
	 * Column Info
	 * @return condSeq
	 */
	public String getCondSeq() {
		return this.condSeq;
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
	 * @return psoCondDtlTpCd
	 */
	public String getPsoCondDtlTpCd() {
		return this.psoCondDtlTpCd;
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
	 * @return psoCondOprCd
	 */
	public String getPsoCondOprCd() {
		return this.psoCondOprCd;
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
	 * @return condNo
	 */
	public String getCondNo() {
		return this.condNo;
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
	 * @param condOprValCtnt
	 */
	public void setCondOprValCtnt(String condOprValCtnt) {
		this.condOprValCtnt = condOprValCtnt;
	}
	
	/**
	 * Column Info
	 * @param condSeq
	 */
	public void setCondSeq(String condSeq) {
		this.condSeq = condSeq;
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
	 * @param psoCondDtlTpCd
	 */
	public void setPsoCondDtlTpCd(String psoCondDtlTpCd) {
		this.psoCondDtlTpCd = psoCondDtlTpCd;
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
	 * @param psoCondOprCd
	 */
	public void setPsoCondOprCd(String psoCondOprCd) {
		this.psoCondOprCd = psoCondOprCd;
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
	 * @param condNo
	 */
	public void setCondNo(String condNo) {
		this.condNo = condNo;
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
		setCondOprValCtnt(JSPUtil.getParameter(request, "cond_opr_val_ctnt", ""));
		setCondSeq(JSPUtil.getParameter(request, "cond_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPsoCondDtlTpCd(JSPUtil.getParameter(request, "pso_cond_dtl_tp_cd", ""));
		setConsNm(JSPUtil.getParameter(request, "cons_nm", ""));
		setPsoCondOprCd(JSPUtil.getParameter(request, "pso_cond_opr_cd", ""));
		setObjListNo(JSPUtil.getParameter(request, "obj_list_no", ""));
		setCondNo(JSPUtil.getParameter(request, "cond_no", ""));
		setRowNo(JSPUtil.getParameter(request, "row_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PsoCondDtlVO[]
	 */
	public PsoCondDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PsoCondDtlVO[]
	 */
	public PsoCondDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PsoCondDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] rtObjListNo = (JSPUtil.getParameter(request, prefix	+ "rt_obj_list_no", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] condOprValCtnt = (JSPUtil.getParameter(request, prefix	+ "cond_opr_val_ctnt", length));
			String[] condSeq = (JSPUtil.getParameter(request, prefix	+ "cond_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] psoCondDtlTpCd = (JSPUtil.getParameter(request, prefix	+ "pso_cond_dtl_tp_cd", length));
			String[] consNm = (JSPUtil.getParameter(request, prefix	+ "cons_nm", length));
			String[] psoCondOprCd = (JSPUtil.getParameter(request, prefix	+ "pso_cond_opr_cd", length));
			String[] objListNo = (JSPUtil.getParameter(request, prefix	+ "obj_list_no", length));
			String[] condNo = (JSPUtil.getParameter(request, prefix	+ "cond_no", length));
			String[] rowNo = (JSPUtil.getParameter(request, prefix	+ "row_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new PsoCondDtlVO();
				if (rtObjListNo[i] != null)
					model.setRtObjListNo(rtObjListNo[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (condOprValCtnt[i] != null)
					model.setCondOprValCtnt(condOprValCtnt[i]);
				if (condSeq[i] != null)
					model.setCondSeq(condSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (psoCondDtlTpCd[i] != null)
					model.setPsoCondDtlTpCd(psoCondDtlTpCd[i]);
				if (consNm[i] != null)
					model.setConsNm(consNm[i]);
				if (psoCondOprCd[i] != null)
					model.setPsoCondOprCd(psoCondOprCd[i]);
				if (objListNo[i] != null)
					model.setObjListNo(objListNo[i]);
				if (condNo[i] != null)
					model.setCondNo(condNo[i]);
				if (rowNo[i] != null)
					model.setRowNo(rowNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPsoCondDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PsoCondDtlVO[]
	 */
	public PsoCondDtlVO[] getPsoCondDtlVOs(){
		PsoCondDtlVO[] vos = (PsoCondDtlVO[])models.toArray(new PsoCondDtlVO[models.size()]);
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
		this.condOprValCtnt = this.condOprValCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.condSeq = this.condSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoCondDtlTpCd = this.psoCondDtlTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.consNm = this.consNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.psoCondOprCd = this.psoCondOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.objListNo = this.objListNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.condNo = this.condNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rowNo = this.rowNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
