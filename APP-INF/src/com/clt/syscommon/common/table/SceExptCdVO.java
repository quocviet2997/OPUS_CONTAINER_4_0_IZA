/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceExptCdVO.java
*@FileTitle : SceExptCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.04
*@LastModifier : 신한성
*@LastVersion : 1.0
* 2009.08.04 신한성 
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
 * @author 신한성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceExptCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceExptCdVO> models = new ArrayList<SceExptCdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String exptCdDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String actFlg = null;
	/* Column Info */
	private String copExptTpDtlDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String exptCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String exptCdNm = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceExptCdVO() {}

	public SceExptCdVO(String ibflag, String pagerows, String exptCd, String exptCdNm, String exptCdDesc, String copExptTpDtlDesc, String actFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.exptCdDesc = exptCdDesc;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.actFlg = actFlg;
		this.copExptTpDtlDesc = copExptTpDtlDesc;
		this.creDt = creDt;
		this.exptCd = exptCd;
		this.updUsrId = updUsrId;
		this.exptCdNm = exptCdNm;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("expt_cd_desc", getExptCdDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("act_flg", getActFlg());
		this.hashColumns.put("cop_expt_tp_dtl_desc", getCopExptTpDtlDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("expt_cd", getExptCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("expt_cd_nm", getExptCdNm());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("expt_cd_desc", "exptCdDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("act_flg", "actFlg");
		this.hashFields.put("cop_expt_tp_dtl_desc", "copExptTpDtlDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("expt_cd", "exptCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("expt_cd_nm", "exptCdNm");
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
	 * @return exptCdDesc
	 */
	public String getExptCdDesc() {
		return this.exptCdDesc;
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
	 * @return actFlg
	 */
	public String getActFlg() {
		return this.actFlg;
	}
	
	/**
	 * Column Info
	 * @return copExptTpDtlDesc
	 */
	public String getCopExptTpDtlDesc() {
		return this.copExptTpDtlDesc;
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
	 * @return exptCd
	 */
	public String getExptCd() {
		return this.exptCd;
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
	 * @return exptCdNm
	 */
	public String getExptCdNm() {
		return this.exptCdNm;
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
	 * @param exptCdDesc
	 */
	public void setExptCdDesc(String exptCdDesc) {
		this.exptCdDesc = exptCdDesc;
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
	 * @param actFlg
	 */
	public void setActFlg(String actFlg) {
		this.actFlg = actFlg;
	}
	
	/**
	 * Column Info
	 * @param copExptTpDtlDesc
	 */
	public void setCopExptTpDtlDesc(String copExptTpDtlDesc) {
		this.copExptTpDtlDesc = copExptTpDtlDesc;
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
	 * @param exptCd
	 */
	public void setExptCd(String exptCd) {
		this.exptCd = exptCd;
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
	 * @param exptCdNm
	 */
	public void setExptCdNm(String exptCdNm) {
		this.exptCdNm = exptCdNm;
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
		setExptCdDesc(JSPUtil.getParameter(request, "expt_cd_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setActFlg(JSPUtil.getParameter(request, "act_flg", ""));
		setCopExptTpDtlDesc(JSPUtil.getParameter(request, "cop_expt_tp_dtl_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setExptCd(JSPUtil.getParameter(request, "expt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setExptCdNm(JSPUtil.getParameter(request, "expt_cd_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceExptCdVO[]
	 */
	public SceExptCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceExptCdVO[]
	 */
	public SceExptCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceExptCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] exptCdDesc = (JSPUtil.getParameter(request, prefix	+ "expt_cd_desc", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] actFlg = (JSPUtil.getParameter(request, prefix	+ "act_flg", length));
			String[] copExptTpDtlDesc = (JSPUtil.getParameter(request, prefix	+ "cop_expt_tp_dtl_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] exptCd = (JSPUtil.getParameter(request, prefix	+ "expt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] exptCdNm = (JSPUtil.getParameter(request, prefix	+ "expt_cd_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceExptCdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (exptCdDesc[i] != null)
					model.setExptCdDesc(exptCdDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (actFlg[i] != null)
					model.setActFlg(actFlg[i]);
				if (copExptTpDtlDesc[i] != null)
					model.setCopExptTpDtlDesc(copExptTpDtlDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (exptCd[i] != null)
					model.setExptCd(exptCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (exptCdNm[i] != null)
					model.setExptCdNm(exptCdNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceExptCdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceExptCdVO[]
	 */
	public SceExptCdVO[] getSceExptCdVOs(){
		SceExptCdVO[] vos = (SceExptCdVO[])models.toArray(new SceExptCdVO[models.size()]);
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
		this.exptCdDesc = this.exptCdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actFlg = this.actFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.copExptTpDtlDesc = this.copExptTpDtlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptCd = this.exptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.exptCdNm = this.exptCdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
