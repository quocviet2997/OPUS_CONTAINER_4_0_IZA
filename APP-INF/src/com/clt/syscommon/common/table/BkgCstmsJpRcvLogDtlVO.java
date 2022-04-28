/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsJpRcvLogDtlVO.java
*@FileTitle : BkgCstmsJpRcvLogDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.01
*@LastModifier : 
*@LastVersion : 1.0
* 2009.07.01  
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
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgCstmsJpRcvLogDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsJpRcvLogDtlVO> models = new ArrayList<BkgCstmsJpRcvLogDtlVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String jpMsgTpCd = null;
	/* Column Info */
	private String ediRcvMsg = null;
	/* Column Info */
	private String rcvDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String rcvDtlSeq = null;
	/* Column Info */
	private String rcvSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsJpRcvLogDtlVO() {}

	public BkgCstmsJpRcvLogDtlVO(String ibflag, String pagerows, String jpMsgTpCd, String rcvDt, String rcvSeq, String rcvDtlSeq, String ediRcvMsg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.jpMsgTpCd = jpMsgTpCd;
		this.ediRcvMsg = ediRcvMsg;
		this.rcvDt = rcvDt;
		this.creDt = creDt;
		this.rcvDtlSeq = rcvDtlSeq;
		this.rcvSeq = rcvSeq;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("jp_msg_tp_cd", getJpMsgTpCd());
		this.hashColumns.put("edi_rcv_msg", getEdiRcvMsg());
		this.hashColumns.put("rcv_dt", getRcvDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("rcv_dtl_seq", getRcvDtlSeq());
		this.hashColumns.put("rcv_seq", getRcvSeq());
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
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("jp_msg_tp_cd", "jpMsgTpCd");
		this.hashFields.put("edi_rcv_msg", "ediRcvMsg");
		this.hashFields.put("rcv_dt", "rcvDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("rcv_dtl_seq", "rcvDtlSeq");
		this.hashFields.put("rcv_seq", "rcvSeq");
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
	 * @return jpMsgTpCd
	 */
	public String getJpMsgTpCd() {
		return this.jpMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @return ediRcvMsg
	 */
	public String getEdiRcvMsg() {
		return this.ediRcvMsg;
	}
	
	/**
	 * Column Info
	 * @return rcvDt
	 */
	public String getRcvDt() {
		return this.rcvDt;
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
	 * @return rcvDtlSeq
	 */
	public String getRcvDtlSeq() {
		return this.rcvDtlSeq;
	}
	
	/**
	 * Column Info
	 * @return rcvSeq
	 */
	public String getRcvSeq() {
		return this.rcvSeq;
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
	 * @param jpMsgTpCd
	 */
	public void setJpMsgTpCd(String jpMsgTpCd) {
		this.jpMsgTpCd = jpMsgTpCd;
	}
	
	/**
	 * Column Info
	 * @param ediRcvMsg
	 */
	public void setEdiRcvMsg(String ediRcvMsg) {
		this.ediRcvMsg = ediRcvMsg;
	}
	
	/**
	 * Column Info
	 * @param rcvDt
	 */
	public void setRcvDt(String rcvDt) {
		this.rcvDt = rcvDt;
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
	 * @param rcvDtlSeq
	 */
	public void setRcvDtlSeq(String rcvDtlSeq) {
		this.rcvDtlSeq = rcvDtlSeq;
	}
	
	/**
	 * Column Info
	 * @param rcvSeq
	 */
	public void setRcvSeq(String rcvSeq) {
		this.rcvSeq = rcvSeq;
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
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setJpMsgTpCd(JSPUtil.getParameter(request, "jp_msg_tp_cd", ""));
		setEdiRcvMsg(JSPUtil.getParameter(request, "edi_rcv_msg", ""));
		setRcvDt(JSPUtil.getParameter(request, "rcv_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setRcvDtlSeq(JSPUtil.getParameter(request, "rcv_dtl_seq", ""));
		setRcvSeq(JSPUtil.getParameter(request, "rcv_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsJpRcvLogDtlVO[]
	 */
	public BkgCstmsJpRcvLogDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsJpRcvLogDtlVO[]
	 */
	public BkgCstmsJpRcvLogDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsJpRcvLogDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] jpMsgTpCd = (JSPUtil.getParameter(request, prefix	+ "jp_msg_tp_cd", length));
			String[] ediRcvMsg = (JSPUtil.getParameter(request, prefix	+ "edi_rcv_msg", length));
			String[] rcvDt = (JSPUtil.getParameter(request, prefix	+ "rcv_dt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] rcvDtlSeq = (JSPUtil.getParameter(request, prefix	+ "rcv_dtl_seq", length));
			String[] rcvSeq = (JSPUtil.getParameter(request, prefix	+ "rcv_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsJpRcvLogDtlVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (jpMsgTpCd[i] != null)
					model.setJpMsgTpCd(jpMsgTpCd[i]);
				if (ediRcvMsg[i] != null)
					model.setEdiRcvMsg(ediRcvMsg[i]);
				if (rcvDt[i] != null)
					model.setRcvDt(rcvDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (rcvDtlSeq[i] != null)
					model.setRcvDtlSeq(rcvDtlSeq[i]);
				if (rcvSeq[i] != null)
					model.setRcvSeq(rcvSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsJpRcvLogDtlVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsJpRcvLogDtlVO[]
	 */
	public BkgCstmsJpRcvLogDtlVO[] getBkgCstmsJpRcvLogDtlVOs(){
		BkgCstmsJpRcvLogDtlVO[] vos = (BkgCstmsJpRcvLogDtlVO[])models.toArray(new BkgCstmsJpRcvLogDtlVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jpMsgTpCd = this.jpMsgTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediRcvMsg = this.ediRcvMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDt = this.rcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvDtlSeq = this.rcvDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rcvSeq = this.rcvSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
