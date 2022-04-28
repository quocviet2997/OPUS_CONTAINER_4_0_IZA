/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgClzTmVO.java
*@FileTitle : BkgClzTmVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.25
*@LastModifier : 최영희
*@LastVersion : 1.0
* 2009.11.25 최영희 
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
 * @author 최영희
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgClzTmVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgClzTmVO> models = new ArrayList<BkgClzTmVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ntcFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mnlSetUsrId = null;
	/* Column Info */
	private String clzTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String sysSetDt = null;
	/* Column Info */
	private String clzYdCd = null;
	/* Column Info */
	private String mnlSetDt = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgClzTmVO() {}

	public BkgClzTmVO(String ibflag, String pagerows, String bkgNo, String clzTpCd, String clzYdCd, String mnlSetDt, String mnlSetUsrId, String ntcFlg, String creUsrId, String creDt, String updUsrId, String updDt, String sysSetDt) {
		this.updDt = updDt;
		this.ntcFlg = ntcFlg;
		this.creDt = creDt;
		this.mnlSetUsrId = mnlSetUsrId;
		this.clzTpCd = clzTpCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.sysSetDt = sysSetDt;
		this.clzYdCd = clzYdCd;
		this.mnlSetDt = mnlSetDt;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ntc_flg", getNtcFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mnl_set_usr_id", getMnlSetUsrId());
		this.hashColumns.put("clz_tp_cd", getClzTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("sys_set_dt", getSysSetDt());
		this.hashColumns.put("clz_yd_cd", getClzYdCd());
		this.hashColumns.put("mnl_set_dt", getMnlSetDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ntc_flg", "ntcFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mnl_set_usr_id", "mnlSetUsrId");
		this.hashFields.put("clz_tp_cd", "clzTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("sys_set_dt", "sysSetDt");
		this.hashFields.put("clz_yd_cd", "clzYdCd");
		this.hashFields.put("mnl_set_dt", "mnlSetDt");
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
	 * @return ntcFlg
	 */
	public String getNtcFlg() {
		return this.ntcFlg;
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
	 * @return mnlSetUsrId
	 */
	public String getMnlSetUsrId() {
		return this.mnlSetUsrId;
	}
	
	/**
	 * Column Info
	 * @return clzTpCd
	 */
	public String getClzTpCd() {
		return this.clzTpCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @return sysSetDt
	 */
	public String getSysSetDt() {
		return this.sysSetDt;
	}
	
	/**
	 * Column Info
	 * @return clzYdCd
	 */
	public String getClzYdCd() {
		return this.clzYdCd;
	}
	
	/**
	 * Column Info
	 * @return mnlSetDt
	 */
	public String getMnlSetDt() {
		return this.mnlSetDt;
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
	 * @param ntcFlg
	 */
	public void setNtcFlg(String ntcFlg) {
		this.ntcFlg = ntcFlg;
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
	 * @param mnlSetUsrId
	 */
	public void setMnlSetUsrId(String mnlSetUsrId) {
		this.mnlSetUsrId = mnlSetUsrId;
	}
	
	/**
	 * Column Info
	 * @param clzTpCd
	 */
	public void setClzTpCd(String clzTpCd) {
		this.clzTpCd = clzTpCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
	 * @param sysSetDt
	 */
	public void setSysSetDt(String sysSetDt) {
		this.sysSetDt = sysSetDt;
	}
	
	/**
	 * Column Info
	 * @param clzYdCd
	 */
	public void setClzYdCd(String clzYdCd) {
		this.clzYdCd = clzYdCd;
	}
	
	/**
	 * Column Info
	 * @param mnlSetDt
	 */
	public void setMnlSetDt(String mnlSetDt) {
		this.mnlSetDt = mnlSetDt;
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
		setNtcFlg(JSPUtil.getParameter(request, "ntc_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMnlSetUsrId(JSPUtil.getParameter(request, "mnl_set_usr_id", ""));
		setClzTpCd(JSPUtil.getParameter(request, "clz_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSysSetDt(JSPUtil.getParameter(request, "sys_set_dt", ""));
		setClzYdCd(JSPUtil.getParameter(request, "clz_yd_cd", ""));
		setMnlSetDt(JSPUtil.getParameter(request, "mnl_set_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgClzTmVO[]
	 */
	public BkgClzTmVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgClzTmVO[]
	 */
	public BkgClzTmVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgClzTmVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ntcFlg = (JSPUtil.getParameter(request, prefix	+ "ntc_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mnlSetUsrId = (JSPUtil.getParameter(request, prefix	+ "mnl_set_usr_id", length));
			String[] clzTpCd = (JSPUtil.getParameter(request, prefix	+ "clz_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] sysSetDt = (JSPUtil.getParameter(request, prefix	+ "sys_set_dt", length));
			String[] clzYdCd = (JSPUtil.getParameter(request, prefix	+ "clz_yd_cd", length));
			String[] mnlSetDt = (JSPUtil.getParameter(request, prefix	+ "mnl_set_dt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgClzTmVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ntcFlg[i] != null)
					model.setNtcFlg(ntcFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mnlSetUsrId[i] != null)
					model.setMnlSetUsrId(mnlSetUsrId[i]);
				if (clzTpCd[i] != null)
					model.setClzTpCd(clzTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (sysSetDt[i] != null)
					model.setSysSetDt(sysSetDt[i]);
				if (clzYdCd[i] != null)
					model.setClzYdCd(clzYdCd[i]);
				if (mnlSetDt[i] != null)
					model.setMnlSetDt(mnlSetDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgClzTmVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgClzTmVO[]
	 */
	public BkgClzTmVO[] getBkgClzTmVOs(){
		BkgClzTmVO[] vos = (BkgClzTmVO[])models.toArray(new BkgClzTmVO[models.size()]);
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
		this.ntcFlg = this.ntcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlSetUsrId = this.mnlSetUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clzTpCd = this.clzTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sysSetDt = this.sysSetDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.clzYdCd = this.clzYdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mnlSetDt = this.mnlSetDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
