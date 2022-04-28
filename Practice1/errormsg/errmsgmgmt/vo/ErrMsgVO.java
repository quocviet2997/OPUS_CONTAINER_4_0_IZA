/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : ErrMsgVO.java
*@FileTitle : ErrMsgVO
*Open Issues :
*Change history :
*@LastModifyDate : 2022.04.06
*@LastModifier : 
*@LastVersion : 1.0
* 2022.04.06  
* 1.0 Creation
=========================================================*/

package com.clt.apps.opus.esm.clv.doutraining.errmsgmgmt.vo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.core.layer.event.EventException;

/**
 * [multiErrMsgVO] modify ErrMsgVOs to save the change in database.<br>
 * 
 * @param e Event
 * @return EventResponse
 * @exception EventException
 */

/**
 * Table Value Ojbect<br>
 * A Value Object that is created in the related event and performs the role of data delivery when a server execution request is made.
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class ErrMsgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ErrMsgVO> models = new ArrayList<ErrMsgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String errMsgCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String langTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String errDesc = null;
	/* Column Info */
	private String errMsg = null;
	/* Column Info */
	private String errLvlCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edwUpdDt = null;
	/* Column Info */
	private String errTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	Hashtable to store values of table columns */
	private HashMap<String, String> hashColumns = new LinkedHashMap<String, String>();

	/*	Hashtable that stores member variables corresponding to table columns */
	private HashMap<String, String> hashFields = new LinkedHashMap<String, String>();
	
	public ErrMsgVO() {}

	public ErrMsgVO(String ibflag, String pagerows, String errMsgCd, String errLvlCd, String errTpCd, String errMsg, String errDesc, String langTpCd, String creUsrId, String creDt, String updUsrId, String updDt, String edwUpdDt) {
		this.updDt = updDt;
		this.errMsgCd = errMsgCd;
		this.creUsrId = creUsrId;
		this.langTpCd = langTpCd;
		this.ibflag = ibflag;
		this.errDesc = errDesc;
		this.errMsg = errMsg;
		this.errLvlCd = errLvlCd;
		this.creDt = creDt;
		this.edwUpdDt = edwUpdDt;
		this.errTpCd = errTpCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * Returns the value to be stored in the table column as Hashtable<"column_name", "value">
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("err_msg_cd", getErrMsgCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("lang_tp_cd", getLangTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("err_desc", getErrDesc());
		this.hashColumns.put("err_msg", getErrMsg());
		this.hashColumns.put("err_lvl_cd", getErrLvlCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edw_upd_dt", getEdwUpdDt());
		this.hashColumns.put("err_tp_cd", getErrTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * Stores member variable names corresponding to column names and returns them as Hashtable<"column_name", "variable">
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("err_msg_cd", "errMsgCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("lang_tp_cd", "langTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("err_desc", "errDesc");
		this.hashFields.put("err_msg", "errMsg");
		this.hashFields.put("err_lvl_cd", "errLvlCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edw_upd_dt", "edwUpdDt");
		this.hashFields.put("err_tp_cd", "errTpCd");
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
	 * @return errMsgCd
	 */
	public String getErrMsgCd() {
		return this.errMsgCd;
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
	 * @return langTpCd
	 */
	public String getLangTpCd() {
		return this.langTpCd;
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
	 * @return errDesc
	 */
	public String getErrDesc() {
		return this.errDesc;
	}
	
	/**
	 * Column Info
	 * @return errMsg
	 */
	public String getErrMsg() {
		return this.errMsg;
	}
	
	/**
	 * Column Info
	 * @return errLvlCd
	 */
	public String getErrLvlCd() {
		return this.errLvlCd;
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
	 * @return edwUpdDt
	 */
	public String getEdwUpdDt() {
		return this.edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @return errTpCd
	 */
	public String getErrTpCd() {
		return this.errTpCd;
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
	 * @param errMsgCd
	 */
	public void setErrMsgCd(String errMsgCd) {
		this.errMsgCd = errMsgCd;
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
	 * @param langTpCd
	 */
	public void setLangTpCd(String langTpCd) {
		this.langTpCd = langTpCd;
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
	 * @param errDesc
	 */
	public void setErrDesc(String errDesc) {
		this.errDesc = errDesc;
	}
	
	/**
	 * Column Info
	 * @param errMsg
	 */
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	/**
	 * Column Info
	 * @param errLvlCd
	 */
	public void setErrLvlCd(String errLvlCd) {
		this.errLvlCd = errLvlCd;
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
	 * @param edwUpdDt
	 */
	public void setEdwUpdDt(String edwUpdDt) {
		this.edwUpdDt = edwUpdDt;
	}
	
	/**
	 * Column Info
	 * @param errTpCd
	 */
	public void setErrTpCd(String errTpCd) {
		this.errTpCd = errTpCd;
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
	 * Extract the request data and set it in the member variable of VO.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Extract the request data and set it in the member variable of VO.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		// Gets a parameter from the request and invokes the objects toString method.
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setErrMsgCd(JSPUtil.getParameter(request, prefix + "err_msg_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setLangTpCd(JSPUtil.getParameter(request, prefix + "lang_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setErrDesc(JSPUtil.getParameter(request, prefix + "err_desc", ""));
		setErrMsg(JSPUtil.getParameter(request, prefix + "err_msg", ""));
		setErrLvlCd(JSPUtil.getParameter(request, prefix + "err_lvl_cd", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setEdwUpdDt(JSPUtil.getParameter(request, prefix + "edw_upd_dt", ""));
		setErrTpCd(JSPUtil.getParameter(request, prefix + "err_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
	}

	/**
	 * Converts Request data to VO array and returns it.
	 * @param request
	 * @return ErrMsgVO[]
	 */
	public ErrMsgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Several requests passed over are DATA in VO Class.
	 * @param request
	 * @param prefix
	 * @return ErrMsgVO[]
	 */
	public ErrMsgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ErrMsgVO model = null;
		// Returns an array of String objects containing all of the values the given request parameter has, or null if the parameter does not exist.
		// If the parameter has a single value, the array has a length of 1.
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
  		// append a list ErrMsgVO which generate from parameter in grid to models
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] errMsgCd = (JSPUtil.getParameter(request, prefix	+ "err_msg_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] langTpCd = (JSPUtil.getParameter(request, prefix	+ "lang_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] errDesc = (JSPUtil.getParameter(request, prefix	+ "err_desc", length));
			String[] errMsg = (JSPUtil.getParameter(request, prefix	+ "err_msg", length));
			String[] errLvlCd = (JSPUtil.getParameter(request, prefix	+ "err_lvl_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edwUpdDt = (JSPUtil.getParameter(request, prefix	+ "edw_upd_dt", length));
			String[] errTpCd = (JSPUtil.getParameter(request, prefix	+ "err_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new ErrMsgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (errMsgCd[i] != null)
					model.setErrMsgCd(errMsgCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (langTpCd[i] != null)
					model.setLangTpCd(langTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (errDesc[i] != null)
					model.setErrDesc(errDesc[i]);
				if (errMsg[i] != null)
					model.setErrMsg(errMsg[i]);
				if (errLvlCd[i] != null)
					model.setErrLvlCd(errLvlCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edwUpdDt[i] != null)
					model.setEdwUpdDt(edwUpdDt[i]);
				if (errTpCd[i] != null)
					model.setErrTpCd(errTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getErrMsgVOs();
	}

	/**
	 * return VO array
	 * @return ErrMsgVO[]
	 */
	public ErrMsgVO[] getErrMsgVOs(){
		ErrMsgVO[] vos = (ErrMsgVO[])models.toArray(new ErrMsgVO[models.size()]);
		return vos;
	}
	
	/**
	 * Convert the contents of VO Class to String
	 */
	public String toString() {
		// reflectionToString	uses ReflectionToStringBuilder to generate a toString for the specified object
			// ReflectionToStringBuilder Assists in implementing Object.toString() methods using reflection.
				// This class uses reflection to determine the fields to append.
				// Using reflection to access (private) fields circumvents any synchronization protection guarding access to these fields.
					// Take special care to exclude non-thread-safe collection classes, because these classes may throw ConcurrentModificationException if modified while the toString method is executing.
		// ToStringStyle		control string format for ToStringBuilder
			// DEFAULT_STYLE			The default toString style
			// JSON_STYLE				The JSON toString style
			// MULTI_LINE_STYLE			The multi line toString style
			// NO_CLASS_NAME_STYLE		The no class name toString style
			// NO_FIELD_NAMES_STYLE		The no field names toString style
			// SHORT_PREFIX_STYLE		The short prefix toString style
			// SIMPLE_STYLE				The simple toString style
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* Remove special characters from formatted string ("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errMsgCd = this.errMsgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.langTpCd = this.langTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errDesc = this.errDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errMsg = this.errMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errLvlCd = this.errLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edwUpdDt = this.edwUpdDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.errTpCd = this.errTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
