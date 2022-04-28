/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpcRalocMdlExeVO.java
*@FileTitle : SpcRalocMdlExeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.23
*@LastModifier : 최윤성
*@LastVersion : 1.0
* 2009.07.23 최윤성 
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
 * @author 최윤성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SpcRalocMdlExeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpcRalocMdlExeVO> models = new ArrayList<SpcRalocMdlExeVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String exeUsrId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String exeGdt = null;
	/* Column Info */
	private String ralocMdlExeStsCd = null;
	/* Column Info */
	private String ralocVerNo = null;
	/* Column Info */
	private String mdlStGdt = null;
	/* Column Info */
	private String mdlEndGdt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpcRalocMdlExeVO() {}

	public SpcRalocMdlExeVO(String ibflag, String pagerows, String ralocVerNo, String ralocMdlExeStsCd, String exeUsrId, String exeGdt, String mdlStGdt, String mdlEndGdt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.exeUsrId = exeUsrId;
		this.creDt = creDt;
		this.exeGdt = exeGdt;
		this.ralocMdlExeStsCd = ralocMdlExeStsCd;
		this.ralocVerNo = ralocVerNo;
		this.mdlStGdt = mdlStGdt;
		this.mdlEndGdt = mdlEndGdt;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("exe_usr_id", getExeUsrId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("exe_gdt", getExeGdt());
		this.hashColumns.put("raloc_mdl_exe_sts_cd", getRalocMdlExeStsCd());
		this.hashColumns.put("raloc_ver_no", getRalocVerNo());
		this.hashColumns.put("mdl_st_gdt", getMdlStGdt());
		this.hashColumns.put("mdl_end_gdt", getMdlEndGdt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("exe_usr_id", "exeUsrId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("exe_gdt", "exeGdt");
		this.hashFields.put("raloc_mdl_exe_sts_cd", "ralocMdlExeStsCd");
		this.hashFields.put("raloc_ver_no", "ralocVerNo");
		this.hashFields.put("mdl_st_gdt", "mdlStGdt");
		this.hashFields.put("mdl_end_gdt", "mdlEndGdt");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return exeUsrId
	 */
	public String getExeUsrId() {
		return this.exeUsrId;
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
	 * @return exeGdt
	 */
	public String getExeGdt() {
		return this.exeGdt;
	}
	
	/**
	 * Column Info
	 * @return ralocMdlExeStsCd
	 */
	public String getRalocMdlExeStsCd() {
		return this.ralocMdlExeStsCd;
	}
	
	/**
	 * Column Info
	 * @return ralocVerNo
	 */
	public String getRalocVerNo() {
		return this.ralocVerNo;
	}
	
	/**
	 * Column Info
	 * @return mdlStGdt
	 */
	public String getMdlStGdt() {
		return this.mdlStGdt;
	}
	
	/**
	 * Column Info
	 * @return mdlEndGdt
	 */
	public String getMdlEndGdt() {
		return this.mdlEndGdt;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param exeUsrId
	 */
	public void setExeUsrId(String exeUsrId) {
		this.exeUsrId = exeUsrId;
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
	 * @param exeGdt
	 */
	public void setExeGdt(String exeGdt) {
		this.exeGdt = exeGdt;
	}
	
	/**
	 * Column Info
	 * @param ralocMdlExeStsCd
	 */
	public void setRalocMdlExeStsCd(String ralocMdlExeStsCd) {
		this.ralocMdlExeStsCd = ralocMdlExeStsCd;
	}
	
	/**
	 * Column Info
	 * @param ralocVerNo
	 */
	public void setRalocVerNo(String ralocVerNo) {
		this.ralocVerNo = ralocVerNo;
	}
	
	/**
	 * Column Info
	 * @param mdlStGdt
	 */
	public void setMdlStGdt(String mdlStGdt) {
		this.mdlStGdt = mdlStGdt;
	}
	
	/**
	 * Column Info
	 * @param mdlEndGdt
	 */
	public void setMdlEndGdt(String mdlEndGdt) {
		this.mdlEndGdt = mdlEndGdt;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setExeUsrId(JSPUtil.getParameter(request, "exe_usr_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setExeGdt(JSPUtil.getParameter(request, "exe_gdt", ""));
		setRalocMdlExeStsCd(JSPUtil.getParameter(request, "raloc_mdl_exe_sts_cd", ""));
		setRalocVerNo(JSPUtil.getParameter(request, "raloc_ver_no", ""));
		setMdlStGdt(JSPUtil.getParameter(request, "mdl_st_gdt", ""));
		setMdlEndGdt(JSPUtil.getParameter(request, "mdl_end_gdt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpcRalocMdlExeVO[]
	 */
	public SpcRalocMdlExeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpcRalocMdlExeVO[]
	 */
	public SpcRalocMdlExeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpcRalocMdlExeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] exeUsrId = (JSPUtil.getParameter(request, prefix	+ "exe_usr_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] exeGdt = (JSPUtil.getParameter(request, prefix	+ "exe_gdt", length));
			String[] ralocMdlExeStsCd = (JSPUtil.getParameter(request, prefix	+ "raloc_mdl_exe_sts_cd", length));
			String[] ralocVerNo = (JSPUtil.getParameter(request, prefix	+ "raloc_ver_no", length));
			String[] mdlStGdt = (JSPUtil.getParameter(request, prefix	+ "mdl_st_gdt", length));
			String[] mdlEndGdt = (JSPUtil.getParameter(request, prefix	+ "mdl_end_gdt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpcRalocMdlExeVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (exeUsrId[i] != null)
					model.setExeUsrId(exeUsrId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (exeGdt[i] != null)
					model.setExeGdt(exeGdt[i]);
				if (ralocMdlExeStsCd[i] != null)
					model.setRalocMdlExeStsCd(ralocMdlExeStsCd[i]);
				if (ralocVerNo[i] != null)
					model.setRalocVerNo(ralocVerNo[i]);
				if (mdlStGdt[i] != null)
					model.setMdlStGdt(mdlStGdt[i]);
				if (mdlEndGdt[i] != null)
					model.setMdlEndGdt(mdlEndGdt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpcRalocMdlExeVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpcRalocMdlExeVO[]
	 */
	public SpcRalocMdlExeVO[] getSpcRalocMdlExeVOs(){
		SpcRalocMdlExeVO[] vos = (SpcRalocMdlExeVO[])models.toArray(new SpcRalocMdlExeVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeUsrId = this.exeUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exeGdt = this.exeGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ralocMdlExeStsCd = this.ralocMdlExeStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ralocVerNo = this.ralocVerNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlStGdt = this.mdlStGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlEndGdt = this.mdlEndGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
