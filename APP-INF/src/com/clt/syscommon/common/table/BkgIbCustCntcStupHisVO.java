/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : BkgIbCustCntcStupHisVO.java
*@FileTitle : BkgIbCustCntcStupHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.07.30
*@LastModifier : 
*@LastVersion : 1.0
* 2010.07.30  
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

public class BkgIbCustCntcStupHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgIbCustCntcStupHisVO> models = new ArrayList<BkgIbCustCntcStupHisVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String cngUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* Column Info */
	private String oldAutoUpdFlg = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String cngGdt = null;
	/* Column Info */
	private String hisSeq = null;
	/* Column Info */
	private String cngDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String newAutoUpdFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgIbCustCntcStupHisVO() {}

	public BkgIbCustCntcStupHisVO(String ibflag, String pagerows, String ofcCd, String hisSeq, String oldAutoUpdFlg, String newAutoUpdFlg, String cngDt, String cngGdt, String cngUsrId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creDt = creDt;
		this.cngUsrId = cngUsrId;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.oldAutoUpdFlg = oldAutoUpdFlg;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.cngGdt = cngGdt;
		this.hisSeq = hisSeq;
		this.cngDt = cngDt;
		this.updUsrId = updUsrId;
		this.newAutoUpdFlg = newAutoUpdFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("cng_usr_id", getCngUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("old_auto_upd_flg", getOldAutoUpdFlg());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cng_gdt", getCngGdt());
		this.hashColumns.put("his_seq", getHisSeq());
		this.hashColumns.put("cng_dt", getCngDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("new_auto_upd_flg", getNewAutoUpdFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("cng_usr_id", "cngUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("old_auto_upd_flg", "oldAutoUpdFlg");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cng_gdt", "cngGdt");
		this.hashFields.put("his_seq", "hisSeq");
		this.hashFields.put("cng_dt", "cngDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("new_auto_upd_flg", "newAutoUpdFlg");
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return cngUsrId
	 */
	public String getCngUsrId() {
		return this.cngUsrId;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
	}
	
	/**
	 * Column Info
	 * @return oldAutoUpdFlg
	 */
	public String getOldAutoUpdFlg() {
		return this.oldAutoUpdFlg;
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
	 * @return cngGdt
	 */
	public String getCngGdt() {
		return this.cngGdt;
	}
	
	/**
	 * Column Info
	 * @return hisSeq
	 */
	public String getHisSeq() {
		return this.hisSeq;
	}
	
	/**
	 * Column Info
	 * @return cngDt
	 */
	public String getCngDt() {
		return this.cngDt;
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
	 * @return newAutoUpdFlg
	 */
	public String getNewAutoUpdFlg() {
		return this.newAutoUpdFlg;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param cngUsrId
	 */
	public void setCngUsrId(String cngUsrId) {
		this.cngUsrId = cngUsrId;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
	}
	
	/**
	 * Column Info
	 * @param oldAutoUpdFlg
	 */
	public void setOldAutoUpdFlg(String oldAutoUpdFlg) {
		this.oldAutoUpdFlg = oldAutoUpdFlg;
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
	 * @param cngGdt
	 */
	public void setCngGdt(String cngGdt) {
		this.cngGdt = cngGdt;
	}
	
	/**
	 * Column Info
	 * @param hisSeq
	 */
	public void setHisSeq(String hisSeq) {
		this.hisSeq = hisSeq;
	}
	
	/**
	 * Column Info
	 * @param cngDt
	 */
	public void setCngDt(String cngDt) {
		this.cngDt = cngDt;
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
	 * @param newAutoUpdFlg
	 */
	public void setNewAutoUpdFlg(String newAutoUpdFlg) {
		this.newAutoUpdFlg = newAutoUpdFlg;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setCngUsrId(JSPUtil.getParameter(request, prefix + "cng_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, prefix + "ofc_cd", ""));
		setOldAutoUpdFlg(JSPUtil.getParameter(request, prefix + "old_auto_upd_flg", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setCngGdt(JSPUtil.getParameter(request, prefix + "cng_gdt", ""));
		setHisSeq(JSPUtil.getParameter(request, prefix + "his_seq", ""));
		setCngDt(JSPUtil.getParameter(request, prefix + "cng_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setNewAutoUpdFlg(JSPUtil.getParameter(request, prefix + "new_auto_upd_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgIbCustCntcStupHisVO[]
	 */
	public BkgIbCustCntcStupHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgIbCustCntcStupHisVO[]
	 */
	public BkgIbCustCntcStupHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgIbCustCntcStupHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] cngUsrId = (JSPUtil.getParameter(request, prefix	+ "cng_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] oldAutoUpdFlg = (JSPUtil.getParameter(request, prefix	+ "old_auto_upd_flg", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] cngGdt = (JSPUtil.getParameter(request, prefix	+ "cng_gdt", length));
			String[] hisSeq = (JSPUtil.getParameter(request, prefix	+ "his_seq", length));
			String[] cngDt = (JSPUtil.getParameter(request, prefix	+ "cng_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] newAutoUpdFlg = (JSPUtil.getParameter(request, prefix	+ "new_auto_upd_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgIbCustCntcStupHisVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (cngUsrId[i] != null)
					model.setCngUsrId(cngUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (oldAutoUpdFlg[i] != null)
					model.setOldAutoUpdFlg(oldAutoUpdFlg[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (cngGdt[i] != null)
					model.setCngGdt(cngGdt[i]);
				if (hisSeq[i] != null)
					model.setHisSeq(hisSeq[i]);
				if (cngDt[i] != null)
					model.setCngDt(cngDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (newAutoUpdFlg[i] != null)
					model.setNewAutoUpdFlg(newAutoUpdFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgIbCustCntcStupHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgIbCustCntcStupHisVO[]
	 */
	public BkgIbCustCntcStupHisVO[] getBkgIbCustCntcStupHisVOs(){
		BkgIbCustCntcStupHisVO[] vos = (BkgIbCustCntcStupHisVO[])models.toArray(new BkgIbCustCntcStupHisVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngUsrId = this.cngUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldAutoUpdFlg = this.oldAutoUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngGdt = this.cngGdt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hisSeq = this.hisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cngDt = this.cngDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.newAutoUpdFlg = this.newAutoUpdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
