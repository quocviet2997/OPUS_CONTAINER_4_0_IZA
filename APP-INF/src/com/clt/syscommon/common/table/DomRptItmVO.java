/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DomRptItmVO.java
*@FileTitle : DomRptItmVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.22
*@LastModifier : 장창수
*@LastVersion : 1.0
* 2009.09.22 장창수 
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
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 장창수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class DomRptItmVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<DomRptItmVO> models = new ArrayList<DomRptItmVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dpSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String dmstRptItmCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dmstRptItmRmk = null;
	/* Column Info */
	private String dmstRptItmNm = null;
	/* Column Info */
	private String dmstRptKndCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public DomRptItmVO() {}

	public DomRptItmVO(String ibflag, String pagerows, String dmstRptKndCd, String dmstRptItmCd, String dmstRptItmNm, String dmstRptItmRmk, String dpSeq, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.dpSeq = dpSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.dmstRptItmCd = dmstRptItmCd;
		this.creDt = creDt;
		this.dmstRptItmRmk = dmstRptItmRmk;
		this.dmstRptItmNm = dmstRptItmNm;
		this.dmstRptKndCd = dmstRptKndCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("dmst_rpt_itm_cd", getDmstRptItmCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dmst_rpt_itm_rmk", getDmstRptItmRmk());
		this.hashColumns.put("dmst_rpt_itm_nm", getDmstRptItmNm());
		this.hashColumns.put("dmst_rpt_knd_cd", getDmstRptKndCd());
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
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("dmst_rpt_itm_cd", "dmstRptItmCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dmst_rpt_itm_rmk", "dmstRptItmRmk");
		this.hashFields.put("dmst_rpt_itm_nm", "dmstRptItmNm");
		this.hashFields.put("dmst_rpt_knd_cd", "dmstRptKndCd");
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
	 * @return dpSeq
	 */
	public String getDpSeq() {
		return this.dpSeq;
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
	 * @return dmstRptItmCd
	 */
	public String getDmstRptItmCd() {
		return this.dmstRptItmCd;
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
	 * @return dmstRptItmRmk
	 */
	public String getDmstRptItmRmk() {
		return this.dmstRptItmRmk;
	}
	
	/**
	 * Column Info
	 * @return dmstRptItmNm
	 */
	public String getDmstRptItmNm() {
		return this.dmstRptItmNm;
	}
	
	/**
	 * Column Info
	 * @return dmstRptKndCd
	 */
	public String getDmstRptKndCd() {
		return this.dmstRptKndCd;
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
	 * @param dpSeq
	 */
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
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
	 * @param dmstRptItmCd
	 */
	public void setDmstRptItmCd(String dmstRptItmCd) {
		this.dmstRptItmCd = dmstRptItmCd;
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
	 * @param dmstRptItmRmk
	 */
	public void setDmstRptItmRmk(String dmstRptItmRmk) {
		this.dmstRptItmRmk = dmstRptItmRmk;
	}
	
	/**
	 * Column Info
	 * @param dmstRptItmNm
	 */
	public void setDmstRptItmNm(String dmstRptItmNm) {
		this.dmstRptItmNm = dmstRptItmNm;
	}
	
	/**
	 * Column Info
	 * @param dmstRptKndCd
	 */
	public void setDmstRptKndCd(String dmstRptKndCd) {
		this.dmstRptKndCd = dmstRptKndCd;
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
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setDmstRptItmCd(JSPUtil.getParameter(request, "dmst_rpt_itm_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDmstRptItmRmk(JSPUtil.getParameter(request, "dmst_rpt_itm_rmk", ""));
		setDmstRptItmNm(JSPUtil.getParameter(request, "dmst_rpt_itm_nm", ""));
		setDmstRptKndCd(JSPUtil.getParameter(request, "dmst_rpt_knd_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return DomRptItmVO[]
	 */
	public DomRptItmVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return DomRptItmVO[]
	 */
	public DomRptItmVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		DomRptItmVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] dmstRptItmCd = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dmstRptItmRmk = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_rmk", length));
			String[] dmstRptItmNm = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_nm", length));
			String[] dmstRptKndCd = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_knd_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new DomRptItmVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (dmstRptItmCd[i] != null)
					model.setDmstRptItmCd(dmstRptItmCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dmstRptItmRmk[i] != null)
					model.setDmstRptItmRmk(dmstRptItmRmk[i]);
				if (dmstRptItmNm[i] != null)
					model.setDmstRptItmNm(dmstRptItmNm[i]);
				if (dmstRptKndCd[i] != null)
					model.setDmstRptKndCd(dmstRptKndCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getDomRptItmVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return DomRptItmVO[]
	 */
	public DomRptItmVO[] getDomRptItmVOs(){
		DomRptItmVO[] vos = (DomRptItmVO[])models.toArray(new DomRptItmVO[models.size()]);
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
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmCd = this.dmstRptItmCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmRmk = this.dmstRptItmRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmNm = this.dmstRptItmNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptKndCd = this.dmstRptKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
