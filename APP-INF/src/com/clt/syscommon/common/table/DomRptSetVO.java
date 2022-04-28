/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : DomRptSetVO.java
*@FileTitle : DomRptSetVO
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

public class DomRptSetVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<DomRptSetVO> models = new ArrayList<DomRptSetVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String dmstRptRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String dmstRptKndCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String dmstRptItmCd4 = null;
	/* Column Info */
	private String dmstRptItmCd3 = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dmstRptUsrId = null;
	/* Column Info */
	private String dmstRptItmCd5 = null;
	/* Column Info */
	private String dmstRptItmCd2 = null;
	/* Column Info */
	private String dmstRptItmCd1 = null;
	/* Column Info */
	private String dmstRptSeq = null;
	/* Column Info */
	private String dmstRptNm = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public DomRptSetVO() {}

	public DomRptSetVO(String ibflag, String pagerows, String dmstRptUsrId, String dmstRptKndCd, String dmstRptSeq, String dmstRptNm, String dmstRptItmCd1, String dmstRptItmCd2, String dmstRptItmCd3, String dmstRptItmCd4, String dmstRptItmCd5, String dmstRptRmk, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.dmstRptRmk = dmstRptRmk;
		this.creDt = creDt;
		this.dmstRptKndCd = dmstRptKndCd;
		this.pagerows = pagerows;
		this.dmstRptItmCd4 = dmstRptItmCd4;
		this.dmstRptItmCd3 = dmstRptItmCd3;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.dmstRptUsrId = dmstRptUsrId;
		this.dmstRptItmCd5 = dmstRptItmCd5;
		this.dmstRptItmCd2 = dmstRptItmCd2;
		this.dmstRptItmCd1 = dmstRptItmCd1;
		this.dmstRptSeq = dmstRptSeq;
		this.dmstRptNm = dmstRptNm;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("dmst_rpt_rmk", getDmstRptRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dmst_rpt_knd_cd", getDmstRptKndCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("dmst_rpt_itm_cd4", getDmstRptItmCd4());
		this.hashColumns.put("dmst_rpt_itm_cd3", getDmstRptItmCd3());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dmst_rpt_usr_id", getDmstRptUsrId());
		this.hashColumns.put("dmst_rpt_itm_cd5", getDmstRptItmCd5());
		this.hashColumns.put("dmst_rpt_itm_cd2", getDmstRptItmCd2());
		this.hashColumns.put("dmst_rpt_itm_cd1", getDmstRptItmCd1());
		this.hashColumns.put("dmst_rpt_seq", getDmstRptSeq());
		this.hashColumns.put("dmst_rpt_nm", getDmstRptNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("dmst_rpt_rmk", "dmstRptRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dmst_rpt_knd_cd", "dmstRptKndCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("dmst_rpt_itm_cd4", "dmstRptItmCd4");
		this.hashFields.put("dmst_rpt_itm_cd3", "dmstRptItmCd3");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dmst_rpt_usr_id", "dmstRptUsrId");
		this.hashFields.put("dmst_rpt_itm_cd5", "dmstRptItmCd5");
		this.hashFields.put("dmst_rpt_itm_cd2", "dmstRptItmCd2");
		this.hashFields.put("dmst_rpt_itm_cd1", "dmstRptItmCd1");
		this.hashFields.put("dmst_rpt_seq", "dmstRptSeq");
		this.hashFields.put("dmst_rpt_nm", "dmstRptNm");
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
	 * @return dmstRptRmk
	 */
	public String getDmstRptRmk() {
		return this.dmstRptRmk;
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
	 * @return dmstRptKndCd
	 */
	public String getDmstRptKndCd() {
		return this.dmstRptKndCd;
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
	 * @return dmstRptItmCd4
	 */
	public String getDmstRptItmCd4() {
		return this.dmstRptItmCd4;
	}
	
	/**
	 * Column Info
	 * @return dmstRptItmCd3
	 */
	public String getDmstRptItmCd3() {
		return this.dmstRptItmCd3;
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
	 * @return dmstRptUsrId
	 */
	public String getDmstRptUsrId() {
		return this.dmstRptUsrId;
	}
	
	/**
	 * Column Info
	 * @return dmstRptItmCd5
	 */
	public String getDmstRptItmCd5() {
		return this.dmstRptItmCd5;
	}
	
	/**
	 * Column Info
	 * @return dmstRptItmCd2
	 */
	public String getDmstRptItmCd2() {
		return this.dmstRptItmCd2;
	}
	
	/**
	 * Column Info
	 * @return dmstRptItmCd1
	 */
	public String getDmstRptItmCd1() {
		return this.dmstRptItmCd1;
	}
	
	/**
	 * Column Info
	 * @return dmstRptSeq
	 */
	public String getDmstRptSeq() {
		return this.dmstRptSeq;
	}
	
	/**
	 * Column Info
	 * @return dmstRptNm
	 */
	public String getDmstRptNm() {
		return this.dmstRptNm;
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
	 * @param dmstRptRmk
	 */
	public void setDmstRptRmk(String dmstRptRmk) {
		this.dmstRptRmk = dmstRptRmk;
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
	 * @param dmstRptKndCd
	 */
	public void setDmstRptKndCd(String dmstRptKndCd) {
		this.dmstRptKndCd = dmstRptKndCd;
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
	 * @param dmstRptItmCd4
	 */
	public void setDmstRptItmCd4(String dmstRptItmCd4) {
		this.dmstRptItmCd4 = dmstRptItmCd4;
	}
	
	/**
	 * Column Info
	 * @param dmstRptItmCd3
	 */
	public void setDmstRptItmCd3(String dmstRptItmCd3) {
		this.dmstRptItmCd3 = dmstRptItmCd3;
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
	 * @param dmstRptUsrId
	 */
	public void setDmstRptUsrId(String dmstRptUsrId) {
		this.dmstRptUsrId = dmstRptUsrId;
	}
	
	/**
	 * Column Info
	 * @param dmstRptItmCd5
	 */
	public void setDmstRptItmCd5(String dmstRptItmCd5) {
		this.dmstRptItmCd5 = dmstRptItmCd5;
	}
	
	/**
	 * Column Info
	 * @param dmstRptItmCd2
	 */
	public void setDmstRptItmCd2(String dmstRptItmCd2) {
		this.dmstRptItmCd2 = dmstRptItmCd2;
	}
	
	/**
	 * Column Info
	 * @param dmstRptItmCd1
	 */
	public void setDmstRptItmCd1(String dmstRptItmCd1) {
		this.dmstRptItmCd1 = dmstRptItmCd1;
	}
	
	/**
	 * Column Info
	 * @param dmstRptSeq
	 */
	public void setDmstRptSeq(String dmstRptSeq) {
		this.dmstRptSeq = dmstRptSeq;
	}
	
	/**
	 * Column Info
	 * @param dmstRptNm
	 */
	public void setDmstRptNm(String dmstRptNm) {
		this.dmstRptNm = dmstRptNm;
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
		setDmstRptRmk(JSPUtil.getParameter(request, "dmst_rpt_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDmstRptKndCd(JSPUtil.getParameter(request, "dmst_rpt_knd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setDmstRptItmCd4(JSPUtil.getParameter(request, "dmst_rpt_itm_cd4", ""));
		setDmstRptItmCd3(JSPUtil.getParameter(request, "dmst_rpt_itm_cd3", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDmstRptUsrId(JSPUtil.getParameter(request, "dmst_rpt_usr_id", ""));
		setDmstRptItmCd5(JSPUtil.getParameter(request, "dmst_rpt_itm_cd5", ""));
		setDmstRptItmCd2(JSPUtil.getParameter(request, "dmst_rpt_itm_cd2", ""));
		setDmstRptItmCd1(JSPUtil.getParameter(request, "dmst_rpt_itm_cd1", ""));
		setDmstRptSeq(JSPUtil.getParameter(request, "dmst_rpt_seq", ""));
		setDmstRptNm(JSPUtil.getParameter(request, "dmst_rpt_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return DomRptSetVO[]
	 */
	public DomRptSetVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return DomRptSetVO[]
	 */
	public DomRptSetVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		DomRptSetVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] dmstRptRmk = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_rmk", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] dmstRptKndCd = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_knd_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] dmstRptItmCd4 = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_cd4", length));
			String[] dmstRptItmCd3 = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_cd3", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] dmstRptUsrId = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_usr_id", length));
			String[] dmstRptItmCd5 = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_cd5", length));
			String[] dmstRptItmCd2 = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_cd2", length));
			String[] dmstRptItmCd1 = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_itm_cd1", length));
			String[] dmstRptSeq = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_seq", length));
			String[] dmstRptNm = (JSPUtil.getParameter(request, prefix	+ "dmst_rpt_nm", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new DomRptSetVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (dmstRptRmk[i] != null)
					model.setDmstRptRmk(dmstRptRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (dmstRptKndCd[i] != null)
					model.setDmstRptKndCd(dmstRptKndCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (dmstRptItmCd4[i] != null)
					model.setDmstRptItmCd4(dmstRptItmCd4[i]);
				if (dmstRptItmCd3[i] != null)
					model.setDmstRptItmCd3(dmstRptItmCd3[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dmstRptUsrId[i] != null)
					model.setDmstRptUsrId(dmstRptUsrId[i]);
				if (dmstRptItmCd5[i] != null)
					model.setDmstRptItmCd5(dmstRptItmCd5[i]);
				if (dmstRptItmCd2[i] != null)
					model.setDmstRptItmCd2(dmstRptItmCd2[i]);
				if (dmstRptItmCd1[i] != null)
					model.setDmstRptItmCd1(dmstRptItmCd1[i]);
				if (dmstRptSeq[i] != null)
					model.setDmstRptSeq(dmstRptSeq[i]);
				if (dmstRptNm[i] != null)
					model.setDmstRptNm(dmstRptNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getDomRptSetVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return DomRptSetVO[]
	 */
	public DomRptSetVO[] getDomRptSetVOs(){
		DomRptSetVO[] vos = (DomRptSetVO[])models.toArray(new DomRptSetVO[models.size()]);
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
		this.dmstRptRmk = this.dmstRptRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptKndCd = this.dmstRptKndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmCd4 = this.dmstRptItmCd4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmCd3 = this.dmstRptItmCd3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptUsrId = this.dmstRptUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmCd5 = this.dmstRptItmCd5 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmCd2 = this.dmstRptItmCd2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptItmCd1 = this.dmstRptItmCd1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptSeq = this.dmstRptSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dmstRptNm = this.dmstRptNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
