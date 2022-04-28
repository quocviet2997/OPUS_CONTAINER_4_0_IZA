/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgHldNtcUsrVO.java
*@FileTitle : BkgHldNtcUsrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.12
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2009.06.12 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgHldNtcUsrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHldNtcUsrVO> models = new ArrayList<BkgHldNtcUsrVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String cstmsLocCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String hldSeq = null;
	/* Column Info */
	private String cstmsDspoCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ntcEml = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ntcMzdCd = null;
	/* Column Info */
	private String ntcUsrId = null;
	/* Column Info */
	private String ntcEnblFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHldNtcUsrVO() {}

	public BkgHldNtcUsrVO(String ibflag, String pagerows, String hldSeq, String cstmsLocCd, String ntcUsrId, String cstmsDspoCd, String ntcMzdCd, String ntcEnblFlg, String ntcEml, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.cstmsLocCd = cstmsLocCd;
		this.creDt = creDt;
		this.hldSeq = hldSeq;
		this.cstmsDspoCd = cstmsDspoCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.ntcEml = ntcEml;
		this.creUsrId = creUsrId;
		this.ntcMzdCd = ntcMzdCd;
		this.ntcUsrId = ntcUsrId;
		this.ntcEnblFlg = ntcEnblFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cstms_loc_cd", getCstmsLocCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("hld_seq", getHldSeq());
		this.hashColumns.put("cstms_dspo_cd", getCstmsDspoCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ntc_eml", getNtcEml());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ntc_mzd_cd", getNtcMzdCd());
		this.hashColumns.put("ntc_usr_id", getNtcUsrId());
		this.hashColumns.put("ntc_enbl_flg", getNtcEnblFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cstms_loc_cd", "cstmsLocCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("hld_seq", "hldSeq");
		this.hashFields.put("cstms_dspo_cd", "cstmsDspoCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ntc_eml", "ntcEml");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ntc_mzd_cd", "ntcMzdCd");
		this.hashFields.put("ntc_usr_id", "ntcUsrId");
		this.hashFields.put("ntc_enbl_flg", "ntcEnblFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return cstmsLocCd
	 */
	public String getCstmsLocCd() {
		return this.cstmsLocCd;
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
	 * @return hldSeq
	 */
	public String getHldSeq() {
		return this.hldSeq;
	}
	
	/**
	 * Column Info
	 * @return cstmsDspoCd
	 */
	public String getCstmsDspoCd() {
		return this.cstmsDspoCd;
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
	 * @return ntcEml
	 */
	public String getNtcEml() {
		return this.ntcEml;
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
	 * @return ntcMzdCd
	 */
	public String getNtcMzdCd() {
		return this.ntcMzdCd;
	}
	
	/**
	 * Column Info
	 * @return ntcUsrId
	 */
	public String getNtcUsrId() {
		return this.ntcUsrId;
	}
	
	/**
	 * Column Info
	 * @return ntcEnblFlg
	 */
	public String getNtcEnblFlg() {
		return this.ntcEnblFlg;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param cstmsLocCd
	 */
	public void setCstmsLocCd(String cstmsLocCd) {
		this.cstmsLocCd = cstmsLocCd;
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
	 * @param hldSeq
	 */
	public void setHldSeq(String hldSeq) {
		this.hldSeq = hldSeq;
	}
	
	/**
	 * Column Info
	 * @param cstmsDspoCd
	 */
	public void setCstmsDspoCd(String cstmsDspoCd) {
		this.cstmsDspoCd = cstmsDspoCd;
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
	 * @param ntcEml
	 */
	public void setNtcEml(String ntcEml) {
		this.ntcEml = ntcEml;
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
	 * @param ntcMzdCd
	 */
	public void setNtcMzdCd(String ntcMzdCd) {
		this.ntcMzdCd = ntcMzdCd;
	}
	
	/**
	 * Column Info
	 * @param ntcUsrId
	 */
	public void setNtcUsrId(String ntcUsrId) {
		this.ntcUsrId = ntcUsrId;
	}
	
	/**
	 * Column Info
	 * @param ntcEnblFlg
	 */
	public void setNtcEnblFlg(String ntcEnblFlg) {
		this.ntcEnblFlg = ntcEnblFlg;
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
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCstmsLocCd(JSPUtil.getParameter(request, "cstms_loc_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setHldSeq(JSPUtil.getParameter(request, "hld_seq", ""));
		setCstmsDspoCd(JSPUtil.getParameter(request, "cstms_dspo_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setNtcEml(JSPUtil.getParameter(request, "ntc_eml", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setNtcMzdCd(JSPUtil.getParameter(request, "ntc_mzd_cd", ""));
		setNtcUsrId(JSPUtil.getParameter(request, "ntc_usr_id", ""));
		setNtcEnblFlg(JSPUtil.getParameter(request, "ntc_enbl_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHldNtcUsrVO[]
	 */
	public BkgHldNtcUsrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHldNtcUsrVO[]
	 */
	public BkgHldNtcUsrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHldNtcUsrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] cstmsLocCd = (JSPUtil.getParameter(request, prefix	+ "cstms_loc_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] hldSeq = (JSPUtil.getParameter(request, prefix	+ "hld_seq", length));
			String[] cstmsDspoCd = (JSPUtil.getParameter(request, prefix	+ "cstms_dspo_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ntcEml = (JSPUtil.getParameter(request, prefix	+ "ntc_eml", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ntcMzdCd = (JSPUtil.getParameter(request, prefix	+ "ntc_mzd_cd", length));
			String[] ntcUsrId = (JSPUtil.getParameter(request, prefix	+ "ntc_usr_id", length));
			String[] ntcEnblFlg = (JSPUtil.getParameter(request, prefix	+ "ntc_enbl_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgHldNtcUsrVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (cstmsLocCd[i] != null)
					model.setCstmsLocCd(cstmsLocCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (hldSeq[i] != null)
					model.setHldSeq(hldSeq[i]);
				if (cstmsDspoCd[i] != null)
					model.setCstmsDspoCd(cstmsDspoCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ntcEml[i] != null)
					model.setNtcEml(ntcEml[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ntcMzdCd[i] != null)
					model.setNtcMzdCd(ntcMzdCd[i]);
				if (ntcUsrId[i] != null)
					model.setNtcUsrId(ntcUsrId[i]);
				if (ntcEnblFlg[i] != null)
					model.setNtcEnblFlg(ntcEnblFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHldNtcUsrVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHldNtcUsrVO[]
	 */
	public BkgHldNtcUsrVO[] getBkgHldNtcUsrVOs(){
		BkgHldNtcUsrVO[] vos = (BkgHldNtcUsrVO[])models.toArray(new BkgHldNtcUsrVO[models.size()]);
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
		this.cstmsLocCd = this.cstmsLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hldSeq = this.hldSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cstmsDspoCd = this.cstmsDspoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcEml = this.ntcEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcMzdCd = this.ntcMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcUsrId = this.ntcUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ntcEnblFlg = this.ntcEnblFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
