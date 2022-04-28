/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceBkgOpParaVO.java
*@FileTitle : SceBkgOpParaVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.11.06
*@LastModifier : 김인수
*@LastVersion : 1.0
* 2009.11.06 김인수 
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
 * @author 김인수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceBkgOpParaVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceBkgOpParaVO> models = new ArrayList<SceBkgOpParaVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgRcvNo = null;
	/* Column Info */
	private String bkgParaSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgParaCtnt = null;
	/* Column Info */
	private String bkgParaSubSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String bkgRcvDt = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceBkgOpParaVO() {}

	public SceBkgOpParaVO(String ibflag, String pagerows, String bkgRcvDt, String bkgRcvNo, String bkgParaSeq, String bkgParaSubSeq, String bkgParaCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgRcvNo = bkgRcvNo;
		this.bkgParaSeq = bkgParaSeq;
		this.creDt = creDt;
		this.bkgParaCtnt = bkgParaCtnt;
		this.bkgParaSubSeq = bkgParaSubSeq;
		this.updUsrId = updUsrId;
		this.bkgRcvDt = bkgRcvDt;
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
		this.hashColumns.put("bkg_rcv_no", getBkgRcvNo());
		this.hashColumns.put("bkg_para_seq", getBkgParaSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_para_ctnt", getBkgParaCtnt());
		this.hashColumns.put("bkg_para_sub_seq", getBkgParaSubSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bkg_rcv_dt", getBkgRcvDt());
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
		this.hashFields.put("bkg_rcv_no", "bkgRcvNo");
		this.hashFields.put("bkg_para_seq", "bkgParaSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_para_ctnt", "bkgParaCtnt");
		this.hashFields.put("bkg_para_sub_seq", "bkgParaSubSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bkg_rcv_dt", "bkgRcvDt");
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
	 * @return bkgRcvNo
	 */
	public String getBkgRcvNo() {
		return this.bkgRcvNo;
	}
	
	/**
	 * Column Info
	 * @return bkgParaSeq
	 */
	public String getBkgParaSeq() {
		return this.bkgParaSeq;
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
	 * @return bkgParaCtnt
	 */
	public String getBkgParaCtnt() {
		return this.bkgParaCtnt;
	}
	
	/**
	 * Column Info
	 * @return bkgParaSubSeq
	 */
	public String getBkgParaSubSeq() {
		return this.bkgParaSubSeq;
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
	 * @return bkgRcvDt
	 */
	public String getBkgRcvDt() {
		return this.bkgRcvDt;
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
	 * @param bkgRcvNo
	 */
	public void setBkgRcvNo(String bkgRcvNo) {
		this.bkgRcvNo = bkgRcvNo;
	}
	
	/**
	 * Column Info
	 * @param bkgParaSeq
	 */
	public void setBkgParaSeq(String bkgParaSeq) {
		this.bkgParaSeq = bkgParaSeq;
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
	 * @param bkgParaCtnt
	 */
	public void setBkgParaCtnt(String bkgParaCtnt) {
		this.bkgParaCtnt = bkgParaCtnt;
	}
	
	/**
	 * Column Info
	 * @param bkgParaSubSeq
	 */
	public void setBkgParaSubSeq(String bkgParaSubSeq) {
		this.bkgParaSubSeq = bkgParaSubSeq;
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
	 * @param bkgRcvDt
	 */
	public void setBkgRcvDt(String bkgRcvDt) {
		this.bkgRcvDt = bkgRcvDt;
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
		setBkgRcvNo(JSPUtil.getParameter(request, "bkg_rcv_no", ""));
		setBkgParaSeq(JSPUtil.getParameter(request, "bkg_para_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgParaCtnt(JSPUtil.getParameter(request, "bkg_para_ctnt", ""));
		setBkgParaSubSeq(JSPUtil.getParameter(request, "bkg_para_sub_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBkgRcvDt(JSPUtil.getParameter(request, "bkg_rcv_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceBkgOpParaVO[]
	 */
	public SceBkgOpParaVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceBkgOpParaVO[]
	 */
	public SceBkgOpParaVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceBkgOpParaVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgRcvNo = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_no", length));
			String[] bkgParaSeq = (JSPUtil.getParameter(request, prefix	+ "bkg_para_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgParaCtnt = (JSPUtil.getParameter(request, prefix	+ "bkg_para_ctnt", length));
			String[] bkgParaSubSeq = (JSPUtil.getParameter(request, prefix	+ "bkg_para_sub_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] bkgRcvDt = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceBkgOpParaVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgRcvNo[i] != null)
					model.setBkgRcvNo(bkgRcvNo[i]);
				if (bkgParaSeq[i] != null)
					model.setBkgParaSeq(bkgParaSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgParaCtnt[i] != null)
					model.setBkgParaCtnt(bkgParaCtnt[i]);
				if (bkgParaSubSeq[i] != null)
					model.setBkgParaSubSeq(bkgParaSubSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (bkgRcvDt[i] != null)
					model.setBkgRcvDt(bkgRcvDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceBkgOpParaVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceBkgOpParaVO[]
	 */
	public SceBkgOpParaVO[] getSceBkgOpParaVOs(){
		SceBkgOpParaVO[] vos = (SceBkgOpParaVO[])models.toArray(new SceBkgOpParaVO[models.size()]);
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
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvNo = this.bkgRcvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgParaSeq = this.bkgParaSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgParaCtnt = this.bkgParaCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgParaSubSeq = this.bkgParaSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvDt = this.bkgRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
