/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SaqMdlCnstVO.java
*@FileTitle : SaqMdlCnstVO
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

public class SaqMdlCnstVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SaqMdlCnstVO> models = new ArrayList<SaqMdlCnstVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String mqtaEditFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mdlCnstCd = null;
	/* Column Info */
	private String mqtaUseFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String yqtaUseFlg = null;
	/* Column Info */
	private String ralocUseFlg = null;
	/* Column Info */
	private String yqtaEditFlg = null;
	/* Column Info */
	private String ralocEditFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String mdlCnstNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SaqMdlCnstVO() {}

	public SaqMdlCnstVO(String ibflag, String pagerows, String mdlCnstCd, String mdlCnstNm, String yqtaEditFlg, String yqtaUseFlg, String mqtaEditFlg, String mqtaUseFlg, String ralocEditFlg, String ralocUseFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.mqtaEditFlg = mqtaEditFlg;
		this.creDt = creDt;
		this.mdlCnstCd = mdlCnstCd;
		this.mqtaUseFlg = mqtaUseFlg;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.yqtaUseFlg = yqtaUseFlg;
		this.ralocUseFlg = ralocUseFlg;
		this.yqtaEditFlg = yqtaEditFlg;
		this.ralocEditFlg = ralocEditFlg;
		this.updUsrId = updUsrId;
		this.mdlCnstNm = mdlCnstNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("mqta_edit_flg", getMqtaEditFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mdl_cnst_cd", getMdlCnstCd());
		this.hashColumns.put("mqta_use_flg", getMqtaUseFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("yqta_use_flg", getYqtaUseFlg());
		this.hashColumns.put("raloc_use_flg", getRalocUseFlg());
		this.hashColumns.put("yqta_edit_flg", getYqtaEditFlg());
		this.hashColumns.put("raloc_edit_flg", getRalocEditFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("mdl_cnst_nm", getMdlCnstNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("mqta_edit_flg", "mqtaEditFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mdl_cnst_cd", "mdlCnstCd");
		this.hashFields.put("mqta_use_flg", "mqtaUseFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("yqta_use_flg", "yqtaUseFlg");
		this.hashFields.put("raloc_use_flg", "ralocUseFlg");
		this.hashFields.put("yqta_edit_flg", "yqtaEditFlg");
		this.hashFields.put("raloc_edit_flg", "ralocEditFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("mdl_cnst_nm", "mdlCnstNm");
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
	 * @return mqtaEditFlg
	 */
	public String getMqtaEditFlg() {
		return this.mqtaEditFlg;
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
	 * @return mdlCnstCd
	 */
	public String getMdlCnstCd() {
		return this.mdlCnstCd;
	}
	
	/**
	 * Column Info
	 * @return mqtaUseFlg
	 */
	public String getMqtaUseFlg() {
		return this.mqtaUseFlg;
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
	 * @return yqtaUseFlg
	 */
	public String getYqtaUseFlg() {
		return this.yqtaUseFlg;
	}
	
	/**
	 * Column Info
	 * @return ralocUseFlg
	 */
	public String getRalocUseFlg() {
		return this.ralocUseFlg;
	}
	
	/**
	 * Column Info
	 * @return yqtaEditFlg
	 */
	public String getYqtaEditFlg() {
		return this.yqtaEditFlg;
	}
	
	/**
	 * Column Info
	 * @return ralocEditFlg
	 */
	public String getRalocEditFlg() {
		return this.ralocEditFlg;
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
	 * @return mdlCnstNm
	 */
	public String getMdlCnstNm() {
		return this.mdlCnstNm;
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
	 * @param mqtaEditFlg
	 */
	public void setMqtaEditFlg(String mqtaEditFlg) {
		this.mqtaEditFlg = mqtaEditFlg;
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
	 * @param mdlCnstCd
	 */
	public void setMdlCnstCd(String mdlCnstCd) {
		this.mdlCnstCd = mdlCnstCd;
	}
	
	/**
	 * Column Info
	 * @param mqtaUseFlg
	 */
	public void setMqtaUseFlg(String mqtaUseFlg) {
		this.mqtaUseFlg = mqtaUseFlg;
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
	 * @param yqtaUseFlg
	 */
	public void setYqtaUseFlg(String yqtaUseFlg) {
		this.yqtaUseFlg = yqtaUseFlg;
	}
	
	/**
	 * Column Info
	 * @param ralocUseFlg
	 */
	public void setRalocUseFlg(String ralocUseFlg) {
		this.ralocUseFlg = ralocUseFlg;
	}
	
	/**
	 * Column Info
	 * @param yqtaEditFlg
	 */
	public void setYqtaEditFlg(String yqtaEditFlg) {
		this.yqtaEditFlg = yqtaEditFlg;
	}
	
	/**
	 * Column Info
	 * @param ralocEditFlg
	 */
	public void setRalocEditFlg(String ralocEditFlg) {
		this.ralocEditFlg = ralocEditFlg;
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
	 * @param mdlCnstNm
	 */
	public void setMdlCnstNm(String mdlCnstNm) {
		this.mdlCnstNm = mdlCnstNm;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setMqtaEditFlg(JSPUtil.getParameter(request, "mqta_edit_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMdlCnstCd(JSPUtil.getParameter(request, "mdl_cnst_cd", ""));
		setMqtaUseFlg(JSPUtil.getParameter(request, "mqta_use_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setYqtaUseFlg(JSPUtil.getParameter(request, "yqta_use_flg", ""));
		setRalocUseFlg(JSPUtil.getParameter(request, "raloc_use_flg", ""));
		setYqtaEditFlg(JSPUtil.getParameter(request, "yqta_edit_flg", ""));
		setRalocEditFlg(JSPUtil.getParameter(request, "raloc_edit_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setMdlCnstNm(JSPUtil.getParameter(request, "mdl_cnst_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SaqMdlCnstVO[]
	 */
	public SaqMdlCnstVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SaqMdlCnstVO[]
	 */
	public SaqMdlCnstVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SaqMdlCnstVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] mqtaEditFlg = (JSPUtil.getParameter(request, prefix	+ "mqta_edit_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mdlCnstCd = (JSPUtil.getParameter(request, prefix	+ "mdl_cnst_cd", length));
			String[] mqtaUseFlg = (JSPUtil.getParameter(request, prefix	+ "mqta_use_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] yqtaUseFlg = (JSPUtil.getParameter(request, prefix	+ "yqta_use_flg", length));
			String[] ralocUseFlg = (JSPUtil.getParameter(request, prefix	+ "raloc_use_flg", length));
			String[] yqtaEditFlg = (JSPUtil.getParameter(request, prefix	+ "yqta_edit_flg", length));
			String[] ralocEditFlg = (JSPUtil.getParameter(request, prefix	+ "raloc_edit_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] mdlCnstNm = (JSPUtil.getParameter(request, prefix	+ "mdl_cnst_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new SaqMdlCnstVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (mqtaEditFlg[i] != null)
					model.setMqtaEditFlg(mqtaEditFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mdlCnstCd[i] != null)
					model.setMdlCnstCd(mdlCnstCd[i]);
				if (mqtaUseFlg[i] != null)
					model.setMqtaUseFlg(mqtaUseFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (yqtaUseFlg[i] != null)
					model.setYqtaUseFlg(yqtaUseFlg[i]);
				if (ralocUseFlg[i] != null)
					model.setRalocUseFlg(ralocUseFlg[i]);
				if (yqtaEditFlg[i] != null)
					model.setYqtaEditFlg(yqtaEditFlg[i]);
				if (ralocEditFlg[i] != null)
					model.setRalocEditFlg(ralocEditFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (mdlCnstNm[i] != null)
					model.setMdlCnstNm(mdlCnstNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSaqMdlCnstVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SaqMdlCnstVO[]
	 */
	public SaqMdlCnstVO[] getSaqMdlCnstVOs(){
		SaqMdlCnstVO[] vos = (SaqMdlCnstVO[])models.toArray(new SaqMdlCnstVO[models.size()]);
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
		this.mqtaEditFlg = this.mqtaEditFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlCnstCd = this.mdlCnstCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mqtaUseFlg = this.mqtaUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaUseFlg = this.yqtaUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ralocUseFlg = this.ralocUseFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.yqtaEditFlg = this.yqtaEditFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ralocEditFlg = this.ralocEditFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mdlCnstNm = this.mdlCnstNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
