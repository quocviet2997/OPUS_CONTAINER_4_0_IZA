/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsChnAwkVO.java
*@FileTitle : BkgCstmsChnAwkVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.02
*@LastModifier : 
*@LastVersion : 1.0
* 2009.09.02  
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

public class BkgCstmsChnAwkVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsChnAwkVO> models = new ArrayList<BkgCstmsChnAwkVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ovrDimRtLen = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String blNo = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ovrDimRearLen = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ovrHgt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ovrDimFntLen = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String awkSeqNo = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String ovrDimLfLen = null;
	/* Column Info */
	private String chnMfSndIndCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsChnAwkVO() {}

	public BkgCstmsChnAwkVO(String ibflag, String pagerows, String chnMfSndIndCd, String blNo, String awkSeqNo, String cntrNo, String ovrDimFntLen, String ovrDimRearLen, String ovrHgt, String ovrDimLfLen, String ovrDimRtLen, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.ovrDimRtLen = ovrDimRtLen;
		this.creDt = creDt;
		this.blNo = blNo;
		this.pagerows = pagerows;
		this.ovrDimRearLen = ovrDimRearLen;
		this.ibflag = ibflag;
		this.ovrHgt = ovrHgt;
		this.creUsrId = creUsrId;
		this.ovrDimFntLen = ovrDimFntLen;
		this.cntrNo = cntrNo;
		this.awkSeqNo = awkSeqNo;
		this.updUsrId = updUsrId;
		this.ovrDimLfLen = ovrDimLfLen;
		this.chnMfSndIndCd = chnMfSndIndCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ovr_dim_rt_len", getOvrDimRtLen());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bl_no", getBlNo());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ovr_dim_rear_len", getOvrDimRearLen());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ovr_hgt", getOvrHgt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ovr_dim_fnt_len", getOvrDimFntLen());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("awk_seq_no", getAwkSeqNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ovr_dim_lf_len", getOvrDimLfLen());
		this.hashColumns.put("chn_mf_snd_ind_cd", getChnMfSndIndCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ovr_dim_rt_len", "ovrDimRtLen");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bl_no", "blNo");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ovr_dim_rear_len", "ovrDimRearLen");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ovr_hgt", "ovrHgt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ovr_dim_fnt_len", "ovrDimFntLen");
		this.hashFields.put("cntr_no", "cntrNo");
		this.hashFields.put("awk_seq_no", "awkSeqNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ovr_dim_lf_len", "ovrDimLfLen");
		this.hashFields.put("chn_mf_snd_ind_cd", "chnMfSndIndCd");
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
	 * @return ovrDimRtLen
	 */
	public String getOvrDimRtLen() {
		return this.ovrDimRtLen;
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
	 * @return blNo
	 */
	public String getBlNo() {
		return this.blNo;
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
	 * @return ovrDimRearLen
	 */
	public String getOvrDimRearLen() {
		return this.ovrDimRearLen;
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
	 * @return ovrHgt
	 */
	public String getOvrHgt() {
		return this.ovrHgt;
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
	 * @return ovrDimFntLen
	 */
	public String getOvrDimFntLen() {
		return this.ovrDimFntLen;
	}
	
	/**
	 * Column Info
	 * @return cntrNo
	 */
	public String getCntrNo() {
		return this.cntrNo;
	}
	
	/**
	 * Column Info
	 * @return awkSeqNo
	 */
	public String getAwkSeqNo() {
		return this.awkSeqNo;
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
	 * @return ovrDimLfLen
	 */
	public String getOvrDimLfLen() {
		return this.ovrDimLfLen;
	}
	
	/**
	 * Column Info
	 * @return chnMfSndIndCd
	 */
	public String getChnMfSndIndCd() {
		return this.chnMfSndIndCd;
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
	 * @param ovrDimRtLen
	 */
	public void setOvrDimRtLen(String ovrDimRtLen) {
		this.ovrDimRtLen = ovrDimRtLen;
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
	 * @param blNo
	 */
	public void setBlNo(String blNo) {
		this.blNo = blNo;
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
	 * @param ovrDimRearLen
	 */
	public void setOvrDimRearLen(String ovrDimRearLen) {
		this.ovrDimRearLen = ovrDimRearLen;
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
	 * @param ovrHgt
	 */
	public void setOvrHgt(String ovrHgt) {
		this.ovrHgt = ovrHgt;
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
	 * @param ovrDimFntLen
	 */
	public void setOvrDimFntLen(String ovrDimFntLen) {
		this.ovrDimFntLen = ovrDimFntLen;
	}
	
	/**
	 * Column Info
	 * @param cntrNo
	 */
	public void setCntrNo(String cntrNo) {
		this.cntrNo = cntrNo;
	}
	
	/**
	 * Column Info
	 * @param awkSeqNo
	 */
	public void setAwkSeqNo(String awkSeqNo) {
		this.awkSeqNo = awkSeqNo;
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
	 * @param ovrDimLfLen
	 */
	public void setOvrDimLfLen(String ovrDimLfLen) {
		this.ovrDimLfLen = ovrDimLfLen;
	}
	
	/**
	 * Column Info
	 * @param chnMfSndIndCd
	 */
	public void setChnMfSndIndCd(String chnMfSndIndCd) {
		this.chnMfSndIndCd = chnMfSndIndCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setOvrDimRtLen(JSPUtil.getParameter(request, "ovr_dim_rt_len", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBlNo(JSPUtil.getParameter(request, "bl_no", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOvrDimRearLen(JSPUtil.getParameter(request, "ovr_dim_rear_len", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOvrHgt(JSPUtil.getParameter(request, "ovr_hgt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setOvrDimFntLen(JSPUtil.getParameter(request, "ovr_dim_fnt_len", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setAwkSeqNo(JSPUtil.getParameter(request, "awk_seq_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setOvrDimLfLen(JSPUtil.getParameter(request, "ovr_dim_lf_len", ""));
		setChnMfSndIndCd(JSPUtil.getParameter(request, "chn_mf_snd_ind_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgCstmsChnAwkVO[]
	 */
	public BkgCstmsChnAwkVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgCstmsChnAwkVO[]
	 */
	public BkgCstmsChnAwkVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsChnAwkVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ovrDimRtLen = (JSPUtil.getParameter(request, prefix	+ "ovr_dim_rt_len", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] blNo = (JSPUtil.getParameter(request, prefix	+ "bl_no", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ovrDimRearLen = (JSPUtil.getParameter(request, prefix	+ "ovr_dim_rear_len", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ovrHgt = (JSPUtil.getParameter(request, prefix	+ "ovr_hgt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ovrDimFntLen = (JSPUtil.getParameter(request, prefix	+ "ovr_dim_fnt_len", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] awkSeqNo = (JSPUtil.getParameter(request, prefix	+ "awk_seq_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] ovrDimLfLen = (JSPUtil.getParameter(request, prefix	+ "ovr_dim_lf_len", length));
			String[] chnMfSndIndCd = (JSPUtil.getParameter(request, prefix	+ "chn_mf_snd_ind_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsChnAwkVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ovrDimRtLen[i] != null)
					model.setOvrDimRtLen(ovrDimRtLen[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (blNo[i] != null)
					model.setBlNo(blNo[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ovrDimRearLen[i] != null)
					model.setOvrDimRearLen(ovrDimRearLen[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ovrHgt[i] != null)
					model.setOvrHgt(ovrHgt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ovrDimFntLen[i] != null)
					model.setOvrDimFntLen(ovrDimFntLen[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (awkSeqNo[i] != null)
					model.setAwkSeqNo(awkSeqNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ovrDimLfLen[i] != null)
					model.setOvrDimLfLen(ovrDimLfLen[i]);
				if (chnMfSndIndCd[i] != null)
					model.setChnMfSndIndCd(chnMfSndIndCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsChnAwkVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgCstmsChnAwkVO[]
	 */
	public BkgCstmsChnAwkVO[] getBkgCstmsChnAwkVOs(){
		BkgCstmsChnAwkVO[] vos = (BkgCstmsChnAwkVO[])models.toArray(new BkgCstmsChnAwkVO[models.size()]);
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
		this.ovrDimRtLen = this.ovrDimRtLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.blNo = this.blNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrDimRearLen = this.ovrDimRearLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrHgt = this.ovrHgt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrDimFntLen = this.ovrDimFntLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkSeqNo = this.awkSeqNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ovrDimLfLen = this.ovrDimLfLen .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chnMfSndIndCd = this.chnMfSndIndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
