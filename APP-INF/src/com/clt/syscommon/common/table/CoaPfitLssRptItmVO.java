/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaPfitLssRptItmVO.java
*@FileTitle : CoaPfitLssRptItmVO
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

public class CoaPfitLssRptItmVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaPfitLssRptItmVO> models = new ArrayList<CoaPfitLssRptItmVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rptVwCd = null;
	/* Column Info */
	private String loclRptItmDesc = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String sgrpCostCd = null;
	/* Column Info */
	private String rptItmDesc = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String rptItmColrFlg = null;
	/* Column Info */
	private String rptDpSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String sgrpCostCdDesc = null;
	/* Column Info */
	private String stndCostTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String rptDpSgrpSeq = null;
	/* Column Info */
	private String stndCostCd = null;
	/* Column Info */
	private String sgrpLoclDesc = null; 

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaPfitLssRptItmVO() {}

	public CoaPfitLssRptItmVO(String ibflag, String pagerows, String stndCostCd, String rptVwCd, String sgrpCostCd, String stndCostTpCd, String rptItmDesc, String loclRptItmDesc, String sgrpCostCdDesc, String sgrpLoclDesc, String rptDpSeq, String rptDpSgrpSeq, String rptItmColrFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.rptVwCd = rptVwCd;
		this.loclRptItmDesc = loclRptItmDesc;
		this.creDt = creDt;
		this.sgrpCostCd = sgrpCostCd;
		this.rptItmDesc = rptItmDesc;
		this.pagerows = pagerows;
		this.rptItmColrFlg = rptItmColrFlg;
		this.rptDpSeq = rptDpSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.sgrpCostCdDesc = sgrpCostCdDesc;
		this.stndCostTpCd = stndCostTpCd;
		this.updUsrId = updUsrId;
		this.rptDpSgrpSeq = rptDpSgrpSeq;
		this.stndCostCd = stndCostCd;
		this.sgrpLoclDesc = sgrpLoclDesc;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rpt_vw_cd", getRptVwCd());
		this.hashColumns.put("locl_rpt_itm_desc", getLoclRptItmDesc());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sgrp_cost_cd", getSgrpCostCd());
		this.hashColumns.put("rpt_itm_desc", getRptItmDesc());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rpt_itm_colr_flg", getRptItmColrFlg());
		this.hashColumns.put("rpt_dp_seq", getRptDpSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("sgrp_cost_cd_desc", getSgrpCostCdDesc());
		this.hashColumns.put("stnd_cost_tp_cd", getStndCostTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("rpt_dp_sgrp_seq", getRptDpSgrpSeq());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		this.hashColumns.put("sgrp_locl_desc", getSgrpLoclDesc());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rpt_vw_cd", "rptVwCd");
		this.hashFields.put("locl_rpt_itm_desc", "loclRptItmDesc");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sgrp_cost_cd", "sgrpCostCd");
		this.hashFields.put("rpt_itm_desc", "rptItmDesc");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rpt_itm_colr_flg", "rptItmColrFlg");
		this.hashFields.put("rpt_dp_seq", "rptDpSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("sgrp_cost_cd_desc", "sgrpCostCdDesc");
		this.hashFields.put("stnd_cost_tp_cd", "stndCostTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("rpt_dp_sgrp_seq", "rptDpSgrpSeq");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
		this.hashFields.put("sgrp_locl_desc", "sgrpLoclDesc");
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
	 * @return rptVwCd
	 */
	public String getRptVwCd() {
		return this.rptVwCd;
	}
	
	/**
	 * Column Info
	 * @return loclRptItmDesc
	 */
	public String getLoclRptItmDesc() {
		return this.loclRptItmDesc;
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
	 * @return sgrpCostCd
	 */
	public String getSgrpCostCd() {
		return this.sgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @return rptItmDesc
	 */
	public String getRptItmDesc() {
		return this.rptItmDesc;
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
	 * @return rptItmColrFlg
	 */
	public String getRptItmColrFlg() {
		return this.rptItmColrFlg;
	}
	
	/**
	 * Column Info
	 * @return rptDpSeq
	 */
	public String getRptDpSeq() {
		return this.rptDpSeq;
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
	 * @return sgrpCostCdDesc
	 */
	public String getSgrpCostCdDesc() {
		return this.sgrpCostCdDesc;
	}
	
	/**
	 * Column Info
	 * @return stndCostTpCd
	 */
	public String getStndCostTpCd() {
		return this.stndCostTpCd;
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
	 * @return rptDpSgrpSeq
	 */
	public String getRptDpSgrpSeq() {
		return this.rptDpSgrpSeq;
	}
	
	/**
	 * Column Info
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
	}
	
	/**
	 * Column Info
	 * @return sgrpLoclDesc
	 */
	public String getSgrpLoclDesc() {
		return this.sgrpLoclDesc;
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
	 * @param rptVwCd
	 */
	public void setRptVwCd(String rptVwCd) {
		this.rptVwCd = rptVwCd;
	}
	
	/**
	 * Column Info
	 * @param loclRptItmDesc
	 */
	public void setLoclRptItmDesc(String loclRptItmDesc) {
		this.loclRptItmDesc = loclRptItmDesc;
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
	 * @param sgrpCostCd
	 */
	public void setSgrpCostCd(String sgrpCostCd) {
		this.sgrpCostCd = sgrpCostCd;
	}
	
	/**
	 * Column Info
	 * @param rptItmDesc
	 */
	public void setRptItmDesc(String rptItmDesc) {
		this.rptItmDesc = rptItmDesc;
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
	 * @param rptItmColrFlg
	 */
	public void setRptItmColrFlg(String rptItmColrFlg) {
		this.rptItmColrFlg = rptItmColrFlg;
	}
	
	/**
	 * Column Info
	 * @param rptDpSeq
	 */
	public void setRptDpSeq(String rptDpSeq) {
		this.rptDpSeq = rptDpSeq;
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
	 * @param sgrpCostCdDesc
	 */
	public void setSgrpCostCdDesc(String sgrpCostCdDesc) {
		this.sgrpCostCdDesc = sgrpCostCdDesc;
	}
	
	/**
	 * Column Info
	 * @param stndCostTpCd
	 */
	public void setStndCostTpCd(String stndCostTpCd) {
		this.stndCostTpCd = stndCostTpCd;
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
	 * @param rptDpSgrpSeq
	 */
	public void setRptDpSgrpSeq(String rptDpSgrpSeq) {
		this.rptDpSgrpSeq = rptDpSgrpSeq;
	}
	
	/**
	 * Column Info
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * Column Info
	 * @param sgrpLoclDesc
	 */
	public void setSgrpLoclDesc(String sgrpLoclDesc) {
		this.sgrpLoclDesc = sgrpLoclDesc;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRptVwCd(JSPUtil.getParameter(request, "rpt_vw_cd", ""));
		setLoclRptItmDesc(JSPUtil.getParameter(request, "locl_rpt_itm_desc", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSgrpCostCd(JSPUtil.getParameter(request, "sgrp_cost_cd", ""));
		setRptItmDesc(JSPUtil.getParameter(request, "rpt_itm_desc", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRptItmColrFlg(JSPUtil.getParameter(request, "rpt_itm_colr_flg", ""));
		setRptDpSeq(JSPUtil.getParameter(request, "rpt_dp_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSgrpCostCdDesc(JSPUtil.getParameter(request, "sgrp_cost_cd_desc", ""));
		setStndCostTpCd(JSPUtil.getParameter(request, "stnd_cost_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setRptDpSgrpSeq(JSPUtil.getParameter(request, "rpt_dp_sgrp_seq", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
		setSgrpLoclDesc(JSPUtil.getParameter(request, "sgrp_locl_desc", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaPfitLssRptItmVO[]
	 */
	public CoaPfitLssRptItmVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaPfitLssRptItmVO[]
	 */
	public CoaPfitLssRptItmVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaPfitLssRptItmVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rptVwCd = (JSPUtil.getParameter(request, prefix	+ "rpt_vw_cd", length));
			String[] loclRptItmDesc = (JSPUtil.getParameter(request, prefix	+ "locl_rpt_itm_desc", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] sgrpCostCd = (JSPUtil.getParameter(request, prefix	+ "sgrp_cost_cd", length));
			String[] rptItmDesc = (JSPUtil.getParameter(request, prefix	+ "rpt_itm_desc", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] rptItmColrFlg = (JSPUtil.getParameter(request, prefix	+ "rpt_itm_colr_flg", length));
			String[] rptDpSeq = (JSPUtil.getParameter(request, prefix	+ "rpt_dp_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] sgrpCostCdDesc = (JSPUtil.getParameter(request, prefix	+ "sgrp_cost_cd_desc", length));
			String[] stndCostTpCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] rptDpSgrpSeq = (JSPUtil.getParameter(request, prefix	+ "rpt_dp_sgrp_seq", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			String[] sgrpLoclDesc = (JSPUtil.getParameter(request, prefix	+ "sgrp_locl_desc", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaPfitLssRptItmVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rptVwCd[i] != null)
					model.setRptVwCd(rptVwCd[i]);
				if (loclRptItmDesc[i] != null)
					model.setLoclRptItmDesc(loclRptItmDesc[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (sgrpCostCd[i] != null)
					model.setSgrpCostCd(sgrpCostCd[i]);
				if (rptItmDesc[i] != null)
					model.setRptItmDesc(rptItmDesc[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (rptItmColrFlg[i] != null)
					model.setRptItmColrFlg(rptItmColrFlg[i]);
				if (rptDpSeq[i] != null)
					model.setRptDpSeq(rptDpSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (sgrpCostCdDesc[i] != null)
					model.setSgrpCostCdDesc(sgrpCostCdDesc[i]);
				if (stndCostTpCd[i] != null)
					model.setStndCostTpCd(stndCostTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (rptDpSgrpSeq[i] != null)
					model.setRptDpSgrpSeq(rptDpSgrpSeq[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				if (sgrpLoclDesc[i] != null)
					model.setSgrpLoclDesc(sgrpLoclDesc[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaPfitLssRptItmVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaPfitLssRptItmVO[]
	 */
	public CoaPfitLssRptItmVO[] getCoaPfitLssRptItmVOs(){
		CoaPfitLssRptItmVO[] vos = (CoaPfitLssRptItmVO[])models.toArray(new CoaPfitLssRptItmVO[models.size()]);
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
		this.rptVwCd = this.rptVwCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.loclRptItmDesc = this.loclRptItmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sgrpCostCd = this.sgrpCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptItmDesc = this.rptItmDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptItmColrFlg = this.rptItmColrFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptDpSeq = this.rptDpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sgrpCostCdDesc = this.sgrpCostCdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostTpCd = this.stndCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rptDpSgrpSeq = this.rptDpSgrpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sgrpLoclDesc = this.sgrpLoclDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
