/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DomDocSndHisVO.java
*@FileTitle : DomDocSndHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.06
*@LastModifier : 최의엽
*@LastVersion : 1.0
* 2009.07.06 최의엽 
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.component.common.AbstractValueObject;

/**
 * Table Value Object<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 최의엽
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class DomDocSndHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<DomDocSndHisVO> models = new ArrayList<DomDocSndHisVO>();
	
	/* Column Info */
	private String docParaNo1 = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String docParaNo2 = null;
	/* Column Info */
	private String docParaNo3 = null;
	/* Column Info */
	private String docParaNo4 = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dmstDocSndTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String dmstApplCd = null;
	/* Column Info */
	private String dmstDocSndNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public DomDocSndHisVO() {}

	public DomDocSndHisVO(String ibflag, String pagerows, String dmstApplCd, String dmstDocSndTpCd, String dmstDocSndNo, String docParaNo1, String docParaNo2, String docParaNo3, String docParaNo4, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.docParaNo1 = docParaNo1;
		this.updDt = updDt;
		this.docParaNo2 = docParaNo2;
		this.docParaNo3 = docParaNo3;
		this.docParaNo4 = docParaNo4;
		this.creDt = creDt;
		this.dmstDocSndTpCd = dmstDocSndTpCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.dmstApplCd = dmstApplCd;
		this.dmstDocSndNo = dmstDocSndNo;
		this.creUsrId = creUsrId;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("doc_para_no1", getDocParaNo1());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("doc_para_no2", getDocParaNo2());
		this.hashColumns.put("doc_para_no3", getDocParaNo3());
		this.hashColumns.put("doc_para_no4", getDocParaNo4());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dmst_doc_snd_tp_cd", getDmstDocSndTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dmst_appl_cd", getDmstApplCd());
		this.hashColumns.put("dmst_doc_snd_no", getDmstDocSndNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("doc_para_no1", "docParaNo1");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("doc_para_no2", "docParaNo2");
		this.hashFields.put("doc_para_no3", "docParaNo3");
		this.hashFields.put("doc_para_no4", "docParaNo4");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dmst_doc_snd_tp_cd", "dmstDocSndTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dmst_appl_cd", "dmstApplCd");
		this.hashFields.put("dmst_doc_snd_no", "dmstDocSndNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return docParaNo1
	 */
	public String getDocParaNo1() {
		return this.docParaNo1;
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
	 * @return docParaNo2
	 */
	public String getDocParaNo2() {
		return this.docParaNo2;
	}
	
	/**
	 * Column Info
	 * @return docParaNo3
	 */
	public String getDocParaNo3() {
		return this.docParaNo3;
	}
	
	/**
	 * Column Info
	 * @return docParaNo4
	 */
	public String getDocParaNo4() {
		return this.docParaNo4;
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
	 * @return dmstDocSndTpCd
	 */
	public String getDmstDocSndTpCd() {
		return this.dmstDocSndTpCd;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return dmstApplCd
	 */
	public String getDmstApplCd() {
		return this.dmstApplCd;
	}
	
	/**
	 * Column Info
	 * @return dmstDocSndNo
	 */
	public String getDmstDocSndNo() {
		return this.dmstDocSndNo;
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
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	

	/**
	 * Column Info
	 * @param docParaNo1
	 */
	public void setDocParaNo1(String docParaNo1) {
		this.docParaNo1 = docParaNo1;
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
	 * @param docParaNo2
	 */
	public void setDocParaNo2(String docParaNo2) {
		this.docParaNo2 = docParaNo2;
	}
	
	/**
	 * Column Info
	 * @param docParaNo3
	 */
	public void setDocParaNo3(String docParaNo3) {
		this.docParaNo3 = docParaNo3;
	}
	
	/**
	 * Column Info
	 * @param docParaNo4
	 */
	public void setDocParaNo4(String docParaNo4) {
		this.docParaNo4 = docParaNo4;
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
	 * @param dmstDocSndTpCd
	 */
	public void setDmstDocSndTpCd(String dmstDocSndTpCd) {
		this.dmstDocSndTpCd = dmstDocSndTpCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param dmstApplCd
	 */
	public void setDmstApplCd(String dmstApplCd) {
		this.dmstApplCd = dmstApplCd;
	}
	
	/**
	 * Column Info
	 * @param dmstDocSndNo
	 */
	public void setDmstDocSndNo(String dmstDocSndNo) {
		this.dmstDocSndNo = dmstDocSndNo;
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
		setDocParaNo1(JSPUtil.getParameter(request, "doc_para_no1", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setDocParaNo2(JSPUtil.getParameter(request, "doc_para_no2", ""));
		setDocParaNo3(JSPUtil.getParameter(request, "doc_para_no3", ""));
		setDocParaNo4(JSPUtil.getParameter(request, "doc_para_no4", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDmstDocSndTpCd(JSPUtil.getParameter(request, "dmst_doc_snd_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDmstApplCd(JSPUtil.getParameter(request, "dmst_appl_cd", ""));
		setDmstDocSndNo(JSPUtil.getParameter(request, "dmst_doc_snd_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return DomDocSndHisVO[]
	 */
	public DomDocSndHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return DomDocSndHisVO[]
	 */
	public DomDocSndHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		DomDocSndHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] docParaNo1 = (JSPUtil.getParameter(request, prefix	+ "doc_para_no1", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] docParaNo2 = (JSPUtil.getParameter(request, prefix	+ "doc_para_no2", length));
			String[] docParaNo3 = (JSPUtil.getParameter(request, prefix	+ "doc_para_no3", length));
			String[] docParaNo4 = (JSPUtil.getParameter(request, prefix	+ "doc_para_no4", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dmstDocSndTpCd = (JSPUtil.getParameter(request, prefix	+ "dmst_doc_snd_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] dmstApplCd = (JSPUtil.getParameter(request, prefix	+ "dmst_appl_cd", length));
			String[] dmstDocSndNo = (JSPUtil.getParameter(request, prefix	+ "dmst_doc_snd_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new DomDocSndHisVO();
				if (docParaNo1[i] != null)
					model.setDocParaNo1(docParaNo1[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (docParaNo2[i] != null)
					model.setDocParaNo2(docParaNo2[i]);
				if (docParaNo3[i] != null)
					model.setDocParaNo3(docParaNo3[i]);
				if (docParaNo4[i] != null)
					model.setDocParaNo4(docParaNo4[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dmstDocSndTpCd[i] != null)
					model.setDmstDocSndTpCd(dmstDocSndTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (dmstApplCd[i] != null)
					model.setDmstApplCd(dmstApplCd[i]);
				if (dmstDocSndNo[i] != null)
					model.setDmstDocSndNo(dmstDocSndNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getDomDocSndHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return DomDocSndHisVO[]
	 */
	public DomDocSndHisVO[] getDomDocSndHisVOs(){
		DomDocSndHisVO[] vos = (DomDocSndHisVO[])models.toArray(new DomDocSndHisVO[models.size()]);
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
		this.docParaNo1 = this.docParaNo1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docParaNo2 = this.docParaNo2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docParaNo3 = this.docParaNo3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.docParaNo4 = this.docParaNo4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstDocSndTpCd = this.dmstDocSndTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstApplCd = this.dmstApplCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstDocSndNo = this.dmstDocSndNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
