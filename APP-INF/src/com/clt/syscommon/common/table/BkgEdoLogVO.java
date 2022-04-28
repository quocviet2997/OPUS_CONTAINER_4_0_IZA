/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEdoLogVO.java
*@FileTitle : BkgEdoLogVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.29
*@LastModifier : 안진응
*@LastVersion : 1.0
* 2009.06.29 안진응 
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
 * @author 안진응
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgEdoLogVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEdoLogVO> models = new ArrayList<BkgEdoLogVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String edoRsltCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edoRcvDt = null;
	/* Column Info */
	private String ackMsg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String mfRefNo = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String edoSeq = null;
	/* Column Info */
	private String mfSeqNo = null;
	/* Column Info */
	private String updUsrId = null;

	/* Column Info */
	private String blNo = null;		//blNo 컬럼 추가
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEdoLogVO() {}

	public BkgEdoLogVO(String ibflag, String pagerows, String bkgNo, String edoSeq, String mfRefNo, String mfSeqNo, String edoRsltCd, String edoRcvDt, String ackMsg, String creUsrId, String creDt, String updUsrId, String updDt, String blNo) {
		this.updDt = updDt;
		this.edoRsltCd = edoRsltCd;
		this.creDt = creDt;
		this.edoRcvDt = edoRcvDt;
		this.ackMsg = ackMsg;
		this.pagerows = pagerows;
		this.mfRefNo = mfRefNo;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.creUsrId = creUsrId;
		this.edoSeq = edoSeq;
		this.mfSeqNo = mfSeqNo;
		this.updUsrId = updUsrId;
		this.blNo = blNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("edo_rslt_cd", getEdoRsltCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edo_rcv_dt", getEdoRcvDt());
		this.hashColumns.put("ack_msg", getAckMsg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("mf_ref_no", getMfRefNo());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("edo_seq", getEdoSeq());
		this.hashColumns.put("mf_seq_no", getMfSeqNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("bl_no", getBlNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("edo_rslt_cd", "edoRsltCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edo_rcv_dt", "edoRcvDt");
		this.hashFields.put("ack_msg", "ackMsg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("mf_ref_no", "mfRefNo");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("edo_seq", "edoSeq");
		this.hashFields.put("mf_seq_no", "mfSeqNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("bl_no", "blNo");
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
	 * @return edoRsltCd
	 */
	public String getEdoRsltCd() {
		return this.edoRsltCd;
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
	 * @return edoRcvDt
	 */
	public String getEdoRcvDt() {
		return this.edoRcvDt;
	}
	
	/**
	 * Column Info
	 * @return ackMsg
	 */
	public String getAckMsg() {
		return this.ackMsg;
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
	 * @return mfRefNo
	 */
	public String getMfRefNo() {
		return this.mfRefNo;
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
	 * @return edoSeq
	 */
	public String getEdoSeq() {
		return this.edoSeq;
	}
	
	/**
	 * Column Info
	 * @return mfSeqNo
	 */
	public String getMfSeqNo() {
		return this.mfSeqNo;
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
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @param edoRsltCd
	 */
	public void setEdoRsltCd(String edoRsltCd) {
		this.edoRsltCd = edoRsltCd;
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
	 * @param edoRcvDt
	 */
	public void setEdoRcvDt(String edoRcvDt) {
		this.edoRcvDt = edoRcvDt;
	}
	
	/**
	 * Column Info
	 * @param ackMsg
	 */
	public void setAckMsg(String ackMsg) {
		this.ackMsg = ackMsg;
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
	 * @param mfRefNo
	 */
	public void setMfRefNo(String mfRefNo) {
		this.mfRefNo = mfRefNo;
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
	 * @param edoSeq
	 */
	public void setEdoSeq(String edoSeq) {
		this.edoSeq = edoSeq;
	}
	
	/**
	 * Column Info
	 * @param mfSeqNo
	 */
	public void setMfSeqNo(String mfSeqNo) {
		this.mfSeqNo = mfSeqNo;
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
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
	}	
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEdoRsltCd(JSPUtil.getParameter(request, "edo_rslt_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEdoRcvDt(JSPUtil.getParameter(request, "edo_rcv_dt", ""));
		setAckMsg(JSPUtil.getParameter(request, "ack_msg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setMfRefNo(JSPUtil.getParameter(request, "mf_ref_no", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEdoSeq(JSPUtil.getParameter(request, "edo_seq", ""));
		setMfSeqNo(JSPUtil.getParameter(request, "mf_seq_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEdoLogVO[]
	 */
	public BkgEdoLogVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEdoLogVO[]
	 */
	public BkgEdoLogVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEdoLogVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] edoRsltCd = (JSPUtil.getParameter(request, prefix	+ "edo_rslt_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edoRcvDt = (JSPUtil.getParameter(request, prefix	+ "edo_rcv_dt", length));
			String[] ackMsg = (JSPUtil.getParameter(request, prefix	+ "ack_msg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] mfRefNo = (JSPUtil.getParameter(request, prefix	+ "mf_ref_no", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] edoSeq = (JSPUtil.getParameter(request, prefix	+ "edo_seq", length));
			String[] mfSeqNo = (JSPUtil.getParameter(request, prefix	+ "mf_seq_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "blNo", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEdoLogVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (edoRsltCd[i] != null)
					model.setEdoRsltCd(edoRsltCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edoRcvDt[i] != null)
					model.setEdoRcvDt(edoRcvDt[i]);
				if (ackMsg[i] != null)
					model.setAckMsg(ackMsg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (mfRefNo[i] != null)
					model.setMfRefNo(mfRefNo[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (edoSeq[i] != null)
					model.setEdoSeq(edoSeq[i]);
				if (mfSeqNo[i] != null)
					model.setMfSeqNo(mfSeqNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEdoLogVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEdoLogVO[]
	 */
	public BkgEdoLogVO[] getBkgEdoLogVOs(){
		BkgEdoLogVO[] vos = (BkgEdoLogVO[])models.toArray(new BkgEdoLogVO[models.size()]);
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
		this.edoRsltCd = this.edoRsltCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRcvDt = this.edoRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ackMsg = this.ackMsg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfRefNo = this.mfRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoSeq = this.edoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mfSeqNo = this.mfSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
