/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ApLuValVO.java
*@FileTitle : ApLuValVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.29
*@LastModifier : 
*@LastVersion : 1.0
* 2009.10.29  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ApLuValVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ApLuValVO> models = new ArrayList<ApLuValVO>();
	
	/* Column Info */
	private String luStActDt = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String avalFlg = null;
	/* Column Info */
	private String luCd = null;
	/* Column Info */
	private String luEndActDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String luTpIndCd = null;
	/* Column Info */
	private String luDesc = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String luDeltFlg = null;
	/* Column Info */
	private String luCtnt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ApLuValVO() {}

	public ApLuValVO(String ibflag, String pagerows, String luTpIndCd, String luCd, String luDeltFlg, String luCtnt, String luDesc, String luStActDt, String luEndActDt, String creDt, String creUsrId, String updDt, String updUsrId, String eaiEvntDt, String avalFlg) {
		this.luStActDt = luStActDt;
		this.updDt = updDt;
		this.avalFlg = avalFlg;
		this.luCd = luCd;
		this.luEndActDt = luEndActDt;
		this.creDt = creDt;
		this.eaiEvntDt = eaiEvntDt;
		this.luTpIndCd = luTpIndCd;
		this.luDesc = luDesc;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.luDeltFlg = luDeltFlg;
		this.luCtnt = luCtnt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("lu_st_act_dt", getLuStActDt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("aval_flg", getAvalFlg());
		this.hashColumns.put("lu_cd", getLuCd());
		this.hashColumns.put("lu_end_act_dt", getLuEndActDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("lu_tp_ind_cd", getLuTpIndCd());
		this.hashColumns.put("lu_desc", getLuDesc());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lu_delt_flg", getLuDeltFlg());
		this.hashColumns.put("lu_ctnt", getLuCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("lu_st_act_dt", "luStActDt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("aval_flg", "avalFlg");
		this.hashFields.put("lu_cd", "luCd");
		this.hashFields.put("lu_end_act_dt", "luEndActDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("lu_tp_ind_cd", "luTpIndCd");
		this.hashFields.put("lu_desc", "luDesc");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lu_delt_flg", "luDeltFlg");
		this.hashFields.put("lu_ctnt", "luCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return luStActDt
	 */
	public String getLuStActDt() {
		return this.luStActDt;
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
	 * @return avalFlg
	 */
	public String getAvalFlg() {
		return this.avalFlg;
	}
	
	/**
	 * Column Info
	 * @return luCd
	 */
	public String getLuCd() {
		return this.luCd;
	}
	
	/**
	 * Column Info
	 * @return luEndActDt
	 */
	public String getLuEndActDt() {
		return this.luEndActDt;
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
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @return luTpIndCd
	 */
	public String getLuTpIndCd() {
		return this.luTpIndCd;
	}
	
	/**
	 * Column Info
	 * @return luDesc
	 */
	public String getLuDesc() {
		return this.luDesc;
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
	 * @return luDeltFlg
	 */
	public String getLuDeltFlg() {
		return this.luDeltFlg;
	}
	
	/**
	 * Column Info
	 * @return luCtnt
	 */
	public String getLuCtnt() {
		return this.luCtnt;
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
	 * @param luStActDt
	 */
	public void setLuStActDt(String luStActDt) {
		this.luStActDt = luStActDt;
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
	 * @param avalFlg
	 */
	public void setAvalFlg(String avalFlg) {
		this.avalFlg = avalFlg;
	}
	
	/**
	 * Column Info
	 * @param luCd
	 */
	public void setLuCd(String luCd) {
		this.luCd = luCd;
	}
	
	/**
	 * Column Info
	 * @param luEndActDt
	 */
	public void setLuEndActDt(String luEndActDt) {
		this.luEndActDt = luEndActDt;
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
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
	}
	
	/**
	 * Column Info
	 * @param luTpIndCd
	 */
	public void setLuTpIndCd(String luTpIndCd) {
		this.luTpIndCd = luTpIndCd;
	}
	
	/**
	 * Column Info
	 * @param luDesc
	 */
	public void setLuDesc(String luDesc) {
		this.luDesc = luDesc;
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
	 * @param luDeltFlg
	 */
	public void setLuDeltFlg(String luDeltFlg) {
		this.luDeltFlg = luDeltFlg;
	}
	
	/**
	 * Column Info
	 * @param luCtnt
	 */
	public void setLuCtnt(String luCtnt) {
		this.luCtnt = luCtnt;
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
		setLuStActDt(JSPUtil.getParameter(request, "lu_st_act_dt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAvalFlg(JSPUtil.getParameter(request, "aval_flg", ""));
		setLuCd(JSPUtil.getParameter(request, "lu_cd", ""));
		setLuEndActDt(JSPUtil.getParameter(request, "lu_end_act_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setLuTpIndCd(JSPUtil.getParameter(request, "lu_tp_ind_cd", ""));
		setLuDesc(JSPUtil.getParameter(request, "lu_desc", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setLuDeltFlg(JSPUtil.getParameter(request, "lu_delt_flg", ""));
		setLuCtnt(JSPUtil.getParameter(request, "lu_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return ApLuValVO[]
	 */
	public ApLuValVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ApLuValVO[]
	 */
	public ApLuValVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ApLuValVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] luStActDt = (JSPUtil.getParameter(request, prefix	+ "lu_st_act_dt", length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] avalFlg = (JSPUtil.getParameter(request, prefix	+ "aval_flg", length));
			String[] luCd = (JSPUtil.getParameter(request, prefix	+ "lu_cd", length));
			String[] luEndActDt = (JSPUtil.getParameter(request, prefix	+ "lu_end_act_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] luTpIndCd = (JSPUtil.getParameter(request, prefix	+ "lu_tp_ind_cd", length));
			String[] luDesc = (JSPUtil.getParameter(request, prefix	+ "lu_desc", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] luDeltFlg = (JSPUtil.getParameter(request, prefix	+ "lu_delt_flg", length));
			String[] luCtnt = (JSPUtil.getParameter(request, prefix	+ "lu_ctnt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new ApLuValVO();
				if (luStActDt[i] != null)
					model.setLuStActDt(luStActDt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (avalFlg[i] != null)
					model.setAvalFlg(avalFlg[i]);
				if (luCd[i] != null)
					model.setLuCd(luCd[i]);
				if (luEndActDt[i] != null)
					model.setLuEndActDt(luEndActDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (luTpIndCd[i] != null)
					model.setLuTpIndCd(luTpIndCd[i]);
				if (luDesc[i] != null)
					model.setLuDesc(luDesc[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (luDeltFlg[i] != null)
					model.setLuDeltFlg(luDeltFlg[i]);
				if (luCtnt[i] != null)
					model.setLuCtnt(luCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getApLuValVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return ApLuValVO[]
	 */
	public ApLuValVO[] getApLuValVOs(){
		ApLuValVO[] vos = (ApLuValVO[])models.toArray(new ApLuValVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.luStActDt = this.luStActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.avalFlg = this.avalFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.luCd = this.luCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.luEndActDt = this.luEndActDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.luTpIndCd = this.luTpIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.luDesc = this.luDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.luDeltFlg = this.luDeltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.luCtnt = this.luCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
