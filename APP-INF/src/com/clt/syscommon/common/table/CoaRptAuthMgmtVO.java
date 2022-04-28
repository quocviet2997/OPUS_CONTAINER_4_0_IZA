/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaRptAuthMgmtVO.java
*@FileTitle : CoaRptAuthMgmtVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaRptAuthMgmtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaRptAuthMgmtVO> models = new ArrayList<CoaRptAuthMgmtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ofcLvlDesc = null;
	/* Column Info */
	private String ofcLvl = null;
	/* Column Info */
	private String ofcVwCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String pfitVwCd = null;
	/* Column Info */
	private String ofcVwDfltCd = null;
	/* Column Info */
	private String pfitLvlCd = null;
	/* Column Info */
	private String ofcVwSlctFlg = null;
	/* Column Info */
	private String pfitLvlSlctFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String pfitVwDfltCd = null;
	/* Column Info */
	private String pfitVwSlctFlg = null;
	/* Column Info */
	private String pfitLvlDfltCd = null;
	/* Column Info */
	private String rptSeq = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaRptAuthMgmtVO() {}

	public CoaRptAuthMgmtVO(String ibflag, String pagerows, String rptSeq, String ofcLvl, String ofcLvlDesc, String pfitVwCd, String pfitVwDfltCd, String pfitVwSlctFlg, String ofcVwCd, String ofcVwDfltCd, String ofcVwSlctFlg, String pfitLvlCd, String pfitLvlDfltCd, String pfitLvlSlctFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.ofcLvlDesc = ofcLvlDesc;
		this.ofcLvl = ofcLvl;
		this.ofcVwCd = ofcVwCd;
		this.creDt = creDt;
		this.pfitVwCd = pfitVwCd;
		this.ofcVwDfltCd = ofcVwDfltCd;
		this.pfitLvlCd = pfitLvlCd;
		this.ofcVwSlctFlg = ofcVwSlctFlg;
		this.pfitLvlSlctFlg = pfitLvlSlctFlg;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.pfitVwDfltCd = pfitVwDfltCd;
		this.pfitVwSlctFlg = pfitVwSlctFlg;
		this.pfitLvlDfltCd = pfitLvlDfltCd;
		this.rptSeq = rptSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ofc_lvl_desc", getOfcLvlDesc());
		this.hashColumns.put("ofc_lvl", getOfcLvl());
		this.hashColumns.put("ofc_vw_cd", getOfcVwCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pfit_vw_cd", getPfitVwCd());
		this.hashColumns.put("ofc_vw_dflt_cd", getOfcVwDfltCd());
		this.hashColumns.put("pfit_lvl_cd", getPfitLvlCd());
		this.hashColumns.put("ofc_vw_slct_flg", getOfcVwSlctFlg());
		this.hashColumns.put("pfit_lvl_slct_flg", getPfitLvlSlctFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("pfit_vw_dflt_cd", getPfitVwDfltCd());
		this.hashColumns.put("pfit_vw_slct_flg", getPfitVwSlctFlg());
		this.hashColumns.put("pfit_lvl_dflt_cd", getPfitLvlDfltCd());
		this.hashColumns.put("rpt_seq", getRptSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ofc_lvl_desc", "ofcLvlDesc");
		this.hashFields.put("ofc_lvl", "ofcLvl");
		this.hashFields.put("ofc_vw_cd", "ofcVwCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pfit_vw_cd", "pfitVwCd");
		this.hashFields.put("ofc_vw_dflt_cd", "ofcVwDfltCd");
		this.hashFields.put("pfit_lvl_cd", "pfitLvlCd");
		this.hashFields.put("ofc_vw_slct_flg", "ofcVwSlctFlg");
		this.hashFields.put("pfit_lvl_slct_flg", "pfitLvlSlctFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("pfit_vw_dflt_cd", "pfitVwDfltCd");
		this.hashFields.put("pfit_vw_slct_flg", "pfitVwSlctFlg");
		this.hashFields.put("pfit_lvl_dflt_cd", "pfitLvlDfltCd");
		this.hashFields.put("rpt_seq", "rptSeq");
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
	 * @return ofcLvlDesc
	 */
	public String getOfcLvlDesc() {
		return this.ofcLvlDesc;
	}
	
	/**
	 * Column Info
	 * @return ofcLvl
	 */
	public String getOfcLvl() {
		return this.ofcLvl;
	}
	
	/**
	 * Column Info
	 * @return ofcVwCd
	 */
	public String getOfcVwCd() {
		return this.ofcVwCd;
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
	 * @return pfitVwCd
	 */
	public String getPfitVwCd() {
		return this.pfitVwCd;
	}
	
	/**
	 * Column Info
	 * @return ofcVwDfltCd
	 */
	public String getOfcVwDfltCd() {
		return this.ofcVwDfltCd;
	}
	
	/**
	 * Column Info
	 * @return pfitLvlCd
	 */
	public String getPfitLvlCd() {
		return this.pfitLvlCd;
	}
	
	/**
	 * Column Info
	 * @return ofcVwSlctFlg
	 */
	public String getOfcVwSlctFlg() {
		return this.ofcVwSlctFlg;
	}
	
	/**
	 * Column Info
	 * @return pfitLvlSlctFlg
	 */
	public String getPfitLvlSlctFlg() {
		return this.pfitLvlSlctFlg;
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
	 * @return pfitVwDfltCd
	 */
	public String getPfitVwDfltCd() {
		return this.pfitVwDfltCd;
	}
	
	/**
	 * Column Info
	 * @return pfitVwSlctFlg
	 */
	public String getPfitVwSlctFlg() {
		return this.pfitVwSlctFlg;
	}
	
	/**
	 * Column Info
	 * @return pfitLvlDfltCd
	 */
	public String getPfitLvlDfltCd() {
		return this.pfitLvlDfltCd;
	}
	
	/**
	 * Column Info
	 * @return rptSeq
	 */
	public String getRptSeq() {
		return this.rptSeq;
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
	 * @param ofcLvlDesc
	 */
	public void setOfcLvlDesc(String ofcLvlDesc) {
		this.ofcLvlDesc = ofcLvlDesc;
	}
	
	/**
	 * Column Info
	 * @param ofcLvl
	 */
	public void setOfcLvl(String ofcLvl) {
		this.ofcLvl = ofcLvl;
	}
	
	/**
	 * Column Info
	 * @param ofcVwCd
	 */
	public void setOfcVwCd(String ofcVwCd) {
		this.ofcVwCd = ofcVwCd;
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
	 * @param pfitVwCd
	 */
	public void setPfitVwCd(String pfitVwCd) {
		this.pfitVwCd = pfitVwCd;
	}
	
	/**
	 * Column Info
	 * @param ofcVwDfltCd
	 */
	public void setOfcVwDfltCd(String ofcVwDfltCd) {
		this.ofcVwDfltCd = ofcVwDfltCd;
	}
	
	/**
	 * Column Info
	 * @param pfitLvlCd
	 */
	public void setPfitLvlCd(String pfitLvlCd) {
		this.pfitLvlCd = pfitLvlCd;
	}
	
	/**
	 * Column Info
	 * @param ofcVwSlctFlg
	 */
	public void setOfcVwSlctFlg(String ofcVwSlctFlg) {
		this.ofcVwSlctFlg = ofcVwSlctFlg;
	}
	
	/**
	 * Column Info
	 * @param pfitLvlSlctFlg
	 */
	public void setPfitLvlSlctFlg(String pfitLvlSlctFlg) {
		this.pfitLvlSlctFlg = pfitLvlSlctFlg;
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
	 * @param pfitVwDfltCd
	 */
	public void setPfitVwDfltCd(String pfitVwDfltCd) {
		this.pfitVwDfltCd = pfitVwDfltCd;
	}
	
	/**
	 * Column Info
	 * @param pfitVwSlctFlg
	 */
	public void setPfitVwSlctFlg(String pfitVwSlctFlg) {
		this.pfitVwSlctFlg = pfitVwSlctFlg;
	}
	
	/**
	 * Column Info
	 * @param pfitLvlDfltCd
	 */
	public void setPfitLvlDfltCd(String pfitLvlDfltCd) {
		this.pfitLvlDfltCd = pfitLvlDfltCd;
	}
	
	/**
	 * Column Info
	 * @param rptSeq
	 */
	public void setRptSeq(String rptSeq) {
		this.rptSeq = rptSeq;
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
		setOfcLvlDesc(JSPUtil.getParameter(request, "ofc_lvl_desc", ""));
		setOfcLvl(JSPUtil.getParameter(request, "ofc_lvl", ""));
		setOfcVwCd(JSPUtil.getParameter(request, "ofc_vw_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPfitVwCd(JSPUtil.getParameter(request, "pfit_vw_cd", ""));
		setOfcVwDfltCd(JSPUtil.getParameter(request, "ofc_vw_dflt_cd", ""));
		setPfitLvlCd(JSPUtil.getParameter(request, "pfit_lvl_cd", ""));
		setOfcVwSlctFlg(JSPUtil.getParameter(request, "ofc_vw_slct_flg", ""));
		setPfitLvlSlctFlg(JSPUtil.getParameter(request, "pfit_lvl_slct_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPfitVwDfltCd(JSPUtil.getParameter(request, "pfit_vw_dflt_cd", ""));
		setPfitVwSlctFlg(JSPUtil.getParameter(request, "pfit_vw_slct_flg", ""));
		setPfitLvlDfltCd(JSPUtil.getParameter(request, "pfit_lvl_dflt_cd", ""));
		setRptSeq(JSPUtil.getParameter(request, "rpt_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaRptAuthMgmtVO[]
	 */
	public CoaRptAuthMgmtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaRptAuthMgmtVO[]
	 */
	public CoaRptAuthMgmtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaRptAuthMgmtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ofcLvlDesc = (JSPUtil.getParameter(request, prefix	+ "ofc_lvl_desc", length));
			String[] ofcLvl = (JSPUtil.getParameter(request, prefix	+ "ofc_lvl", length));
			String[] ofcVwCd = (JSPUtil.getParameter(request, prefix	+ "ofc_vw_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pfitVwCd = (JSPUtil.getParameter(request, prefix	+ "pfit_vw_cd", length));
			String[] ofcVwDfltCd = (JSPUtil.getParameter(request, prefix	+ "ofc_vw_dflt_cd", length));
			String[] pfitLvlCd = (JSPUtil.getParameter(request, prefix	+ "pfit_lvl_cd", length));
			String[] ofcVwSlctFlg = (JSPUtil.getParameter(request, prefix	+ "ofc_vw_slct_flg", length));
			String[] pfitLvlSlctFlg = (JSPUtil.getParameter(request, prefix	+ "pfit_lvl_slct_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] pfitVwDfltCd = (JSPUtil.getParameter(request, prefix	+ "pfit_vw_dflt_cd", length));
			String[] pfitVwSlctFlg = (JSPUtil.getParameter(request, prefix	+ "pfit_vw_slct_flg", length));
			String[] pfitLvlDfltCd = (JSPUtil.getParameter(request, prefix	+ "pfit_lvl_dflt_cd", length));
			String[] rptSeq = (JSPUtil.getParameter(request, prefix	+ "rpt_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaRptAuthMgmtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ofcLvlDesc[i] != null)
					model.setOfcLvlDesc(ofcLvlDesc[i]);
				if (ofcLvl[i] != null)
					model.setOfcLvl(ofcLvl[i]);
				if (ofcVwCd[i] != null)
					model.setOfcVwCd(ofcVwCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pfitVwCd[i] != null)
					model.setPfitVwCd(pfitVwCd[i]);
				if (ofcVwDfltCd[i] != null)
					model.setOfcVwDfltCd(ofcVwDfltCd[i]);
				if (pfitLvlCd[i] != null)
					model.setPfitLvlCd(pfitLvlCd[i]);
				if (ofcVwSlctFlg[i] != null)
					model.setOfcVwSlctFlg(ofcVwSlctFlg[i]);
				if (pfitLvlSlctFlg[i] != null)
					model.setPfitLvlSlctFlg(pfitLvlSlctFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (pfitVwDfltCd[i] != null)
					model.setPfitVwDfltCd(pfitVwDfltCd[i]);
				if (pfitVwSlctFlg[i] != null)
					model.setPfitVwSlctFlg(pfitVwSlctFlg[i]);
				if (pfitLvlDfltCd[i] != null)
					model.setPfitLvlDfltCd(pfitLvlDfltCd[i]);
				if (rptSeq[i] != null)
					model.setRptSeq(rptSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaRptAuthMgmtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaRptAuthMgmtVO[]
	 */
	public CoaRptAuthMgmtVO[] getCoaRptAuthMgmtVOs(){
		CoaRptAuthMgmtVO[] vos = (CoaRptAuthMgmtVO[])models.toArray(new CoaRptAuthMgmtVO[models.size()]);
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
		this.ofcLvlDesc = this.ofcLvlDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcLvl = this.ofcLvl .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcVwCd = this.ofcVwCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfitVwCd = this.pfitVwCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcVwDfltCd = this.ofcVwDfltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfitLvlCd = this.pfitLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcVwSlctFlg = this.ofcVwSlctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfitLvlSlctFlg = this.pfitLvlSlctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfitVwDfltCd = this.pfitVwDfltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfitVwSlctFlg = this.pfitVwSlctFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pfitLvlDfltCd = this.pfitLvlDfltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptSeq = this.rptSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
