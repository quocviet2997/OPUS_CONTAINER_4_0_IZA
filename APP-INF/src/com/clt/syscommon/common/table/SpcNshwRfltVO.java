/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SpcNshwRfltVO.java
*@FileTitle : SpcNshwRfltVO
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

public class SpcNshwRfltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SpcNshwRfltVO> models = new ArrayList<SpcNshwRfltVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String alocDdctBseCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String alocDdctTgtCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String alocDdctModCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String alocDdctCsCd = null;
	/* Column Info */
	private String alocDdctModVal = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String subTrdCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SpcNshwRfltVO() {}

	public SpcNshwRfltVO(String ibflag, String pagerows, String trdCd, String subTrdCd, String rlaneCd, String dirCd, String alocDdctBseCd, String alocDdctCsCd, String alocDdctTgtCd, String alocDdctModCd, String alocDdctModVal, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.alocDdctBseCd = alocDdctBseCd;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.alocDdctTgtCd = alocDdctTgtCd;
		this.pagerows = pagerows;
		this.alocDdctModCd = alocDdctModCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.dirCd = dirCd;
		this.alocDdctCsCd = alocDdctCsCd;
		this.alocDdctModVal = alocDdctModVal;
		this.updUsrId = updUsrId;
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("aloc_ddct_bse_cd", getAlocDdctBseCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("aloc_ddct_tgt_cd", getAlocDdctTgtCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("aloc_ddct_mod_cd", getAlocDdctModCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("aloc_ddct_cs_cd", getAlocDdctCsCd());
		this.hashColumns.put("aloc_ddct_mod_val", getAlocDdctModVal());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sub_trd_cd", getSubTrdCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("aloc_ddct_bse_cd", "alocDdctBseCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("aloc_ddct_tgt_cd", "alocDdctTgtCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("aloc_ddct_mod_cd", "alocDdctModCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("aloc_ddct_cs_cd", "alocDdctCsCd");
		this.hashFields.put("aloc_ddct_mod_val", "alocDdctModVal");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sub_trd_cd", "subTrdCd");
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
	 * @return alocDdctBseCd
	 */
	public String getAlocDdctBseCd() {
		return this.alocDdctBseCd;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return alocDdctTgtCd
	 */
	public String getAlocDdctTgtCd() {
		return this.alocDdctTgtCd;
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
	 * @return alocDdctModCd
	 */
	public String getAlocDdctModCd() {
		return this.alocDdctModCd;
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
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return alocDdctCsCd
	 */
	public String getAlocDdctCsCd() {
		return this.alocDdctCsCd;
	}
	
	/**
	 * Column Info
	 * @return alocDdctModVal
	 */
	public String getAlocDdctModVal() {
		return this.alocDdctModVal;
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
	 * @return subTrdCd
	 */
	public String getSubTrdCd() {
		return this.subTrdCd;
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
	 * @param alocDdctBseCd
	 */
	public void setAlocDdctBseCd(String alocDdctBseCd) {
		this.alocDdctBseCd = alocDdctBseCd;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param alocDdctTgtCd
	 */
	public void setAlocDdctTgtCd(String alocDdctTgtCd) {
		this.alocDdctTgtCd = alocDdctTgtCd;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Column Info
	 * @param alocDdctModCd
	 */
	public void setAlocDdctModCd(String alocDdctModCd) {
		this.alocDdctModCd = alocDdctModCd;
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
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param alocDdctCsCd
	 */
	public void setAlocDdctCsCd(String alocDdctCsCd) {
		this.alocDdctCsCd = alocDdctCsCd;
	}
	
	/**
	 * Column Info
	 * @param alocDdctModVal
	 */
	public void setAlocDdctModVal(String alocDdctModVal) {
		this.alocDdctModVal = alocDdctModVal;
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
	 * @param subTrdCd
	 */
	public void setSubTrdCd(String subTrdCd) {
		this.subTrdCd = subTrdCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAlocDdctBseCd(JSPUtil.getParameter(request, "aloc_ddct_bse_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setAlocDdctTgtCd(JSPUtil.getParameter(request, "aloc_ddct_tgt_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAlocDdctModCd(JSPUtil.getParameter(request, "aloc_ddct_mod_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setAlocDdctCsCd(JSPUtil.getParameter(request, "aloc_ddct_cs_cd", ""));
		setAlocDdctModVal(JSPUtil.getParameter(request, "aloc_ddct_mod_val", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setSubTrdCd(JSPUtil.getParameter(request, "sub_trd_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SpcNshwRfltVO[]
	 */
	public SpcNshwRfltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SpcNshwRfltVO[]
	 */
	public SpcNshwRfltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SpcNshwRfltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] alocDdctBseCd = (JSPUtil.getParameter(request, prefix	+ "aloc_ddct_bse_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] alocDdctTgtCd = (JSPUtil.getParameter(request, prefix	+ "aloc_ddct_tgt_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] alocDdctModCd = (JSPUtil.getParameter(request, prefix	+ "aloc_ddct_mod_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] alocDdctCsCd = (JSPUtil.getParameter(request, prefix	+ "aloc_ddct_cs_cd", length));
			String[] alocDdctModVal = (JSPUtil.getParameter(request, prefix	+ "aloc_ddct_mod_val", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] subTrdCd = (JSPUtil.getParameter(request, prefix	+ "sub_trd_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new SpcNshwRfltVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (alocDdctBseCd[i] != null)
					model.setAlocDdctBseCd(alocDdctBseCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (alocDdctTgtCd[i] != null)
					model.setAlocDdctTgtCd(alocDdctTgtCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (alocDdctModCd[i] != null)
					model.setAlocDdctModCd(alocDdctModCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (alocDdctCsCd[i] != null)
					model.setAlocDdctCsCd(alocDdctCsCd[i]);
				if (alocDdctModVal[i] != null)
					model.setAlocDdctModVal(alocDdctModVal[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (subTrdCd[i] != null)
					model.setSubTrdCd(subTrdCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSpcNshwRfltVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SpcNshwRfltVO[]
	 */
	public SpcNshwRfltVO[] getSpcNshwRfltVOs(){
		SpcNshwRfltVO[] vos = (SpcNshwRfltVO[])models.toArray(new SpcNshwRfltVO[models.size()]);
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
		this.alocDdctBseCd = this.alocDdctBseCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocDdctTgtCd = this.alocDdctTgtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocDdctModCd = this.alocDdctModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocDdctCsCd = this.alocDdctCsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.alocDdctModVal = this.alocDdctModVal .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.subTrdCd = this.subTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
