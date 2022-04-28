/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCodHisDtlVO.java
*@FileTitle : BkgCodHisDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 최영희
*@LastVersion : 1.0
* 2009.07.23 최영희 
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
 * @author 최영희
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCodHisDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCodHisDtlVO> models = new ArrayList<BkgCodHisDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String codHisSeq = null;
	/* Column Info */
	private String newCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String codBkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String codRqstSeq = null;
	/* Column Info */
	private String codHisItmCd = null;
	/* Column Info */
	private String codHisDtlSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String oldCtnt = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCodHisDtlVO() {}

	public BkgCodHisDtlVO(String ibflag, String pagerows, String codBkgNo, String codRqstSeq, String codHisSeq, String codHisDtlSeq, String codHisItmCd, String oldCtnt, String newCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.codHisSeq = codHisSeq;
		this.newCtnt = newCtnt;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.codBkgNo = codBkgNo;
		this.creUsrId = creUsrId;
		this.codRqstSeq = codRqstSeq;
		this.codHisItmCd = codHisItmCd;
		this.codHisDtlSeq = codHisDtlSeq;
		this.updUsrId = updUsrId;
		this.oldCtnt = oldCtnt;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cod_his_seq", getCodHisSeq());
		this.hashColumns.put("new_ctnt", getNewCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cod_bkg_no", getCodBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cod_rqst_seq", getCodRqstSeq());
		this.hashColumns.put("cod_his_itm_cd", getCodHisItmCd());
		this.hashColumns.put("cod_his_dtl_seq", getCodHisDtlSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("old_ctnt", getOldCtnt());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cod_his_seq", "codHisSeq");
		this.hashFields.put("new_ctnt", "newCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cod_bkg_no", "codBkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cod_rqst_seq", "codRqstSeq");
		this.hashFields.put("cod_his_itm_cd", "codHisItmCd");
		this.hashFields.put("cod_his_dtl_seq", "codHisDtlSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("old_ctnt", "oldCtnt");
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
	 * @return codHisSeq
	 */
	public String getCodHisSeq() {
		return this.codHisSeq;
	}
	
	/**
	 * Column Info
	 * @return newCtnt
	 */
	public String getNewCtnt() {
		return this.newCtnt;
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
	 * @return codBkgNo
	 */
	public String getCodBkgNo() {
		return this.codBkgNo;
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
	 * @return codRqstSeq
	 */
	public String getCodRqstSeq() {
		return this.codRqstSeq;
	}
	
	/**
	 * Column Info
	 * @return codHisItmCd
	 */
	public String getCodHisItmCd() {
		return this.codHisItmCd;
	}
	
	/**
	 * Column Info
	 * @return codHisDtlSeq
	 */
	public String getCodHisDtlSeq() {
		return this.codHisDtlSeq;
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
	 * @return oldCtnt
	 */
	public String getOldCtnt() {
		return this.oldCtnt;
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
	 * @param codHisSeq
	 */
	public void setCodHisSeq(String codHisSeq) {
		this.codHisSeq = codHisSeq;
	}
	
	/**
	 * Column Info
	 * @param newCtnt
	 */
	public void setNewCtnt(String newCtnt) {
		this.newCtnt = newCtnt;
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
	 * @param codBkgNo
	 */
	public void setCodBkgNo(String codBkgNo) {
		this.codBkgNo = codBkgNo;
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
	 * @param codRqstSeq
	 */
	public void setCodRqstSeq(String codRqstSeq) {
		this.codRqstSeq = codRqstSeq;
	}
	
	/**
	 * Column Info
	 * @param codHisItmCd
	 */
	public void setCodHisItmCd(String codHisItmCd) {
		this.codHisItmCd = codHisItmCd;
	}
	
	/**
	 * Column Info
	 * @param codHisDtlSeq
	 */
	public void setCodHisDtlSeq(String codHisDtlSeq) {
		this.codHisDtlSeq = codHisDtlSeq;
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
	 * @param oldCtnt
	 */
	public void setOldCtnt(String oldCtnt) {
		this.oldCtnt = oldCtnt;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCodHisSeq(JSPUtil.getParameter(request, "cod_his_seq", ""));
		setNewCtnt(JSPUtil.getParameter(request, "new_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCodBkgNo(JSPUtil.getParameter(request, "cod_bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCodRqstSeq(JSPUtil.getParameter(request, "cod_rqst_seq", ""));
		setCodHisItmCd(JSPUtil.getParameter(request, "cod_his_itm_cd", ""));
		setCodHisDtlSeq(JSPUtil.getParameter(request, "cod_his_dtl_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOldCtnt(JSPUtil.getParameter(request, "old_ctnt", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCodHisDtlVO[]
	 */
	public BkgCodHisDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCodHisDtlVO[]
	 */
	public BkgCodHisDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCodHisDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] codHisSeq = (JSPUtil.getParameter(request, prefix	+ "cod_his_seq", length));
			String[] newCtnt = (JSPUtil.getParameter(request, prefix	+ "new_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] codBkgNo = (JSPUtil.getParameter(request, prefix	+ "cod_bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] codRqstSeq = (JSPUtil.getParameter(request, prefix	+ "cod_rqst_seq", length));
			String[] codHisItmCd = (JSPUtil.getParameter(request, prefix	+ "cod_his_itm_cd", length));
			String[] codHisDtlSeq = (JSPUtil.getParameter(request, prefix	+ "cod_his_dtl_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] oldCtnt = (JSPUtil.getParameter(request, prefix	+ "old_ctnt", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCodHisDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (codHisSeq[i] != null)
					model.setCodHisSeq(codHisSeq[i]);
				if (newCtnt[i] != null)
					model.setNewCtnt(newCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (codBkgNo[i] != null)
					model.setCodBkgNo(codBkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (codRqstSeq[i] != null)
					model.setCodRqstSeq(codRqstSeq[i]);
				if (codHisItmCd[i] != null)
					model.setCodHisItmCd(codHisItmCd[i]);
				if (codHisDtlSeq[i] != null)
					model.setCodHisDtlSeq(codHisDtlSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (oldCtnt[i] != null)
					model.setOldCtnt(oldCtnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCodHisDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCodHisDtlVO[]
	 */
	public BkgCodHisDtlVO[] getBkgCodHisDtlVOs(){
		BkgCodHisDtlVO[] vos = (BkgCodHisDtlVO[])models.toArray(new BkgCodHisDtlVO[models.size()]);
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
		this.codHisSeq = this.codHisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newCtnt = this.newCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codBkgNo = this.codBkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codRqstSeq = this.codRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codHisItmCd = this.codHisItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.codHisDtlSeq = this.codHisDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldCtnt = this.oldCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
