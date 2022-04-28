/*=========================================================
*Copyright(c) 2010 CyberLogitec
*@FileName : VskLanePicVO.java
*@FileTitle : VskLanePicVO
*Open Issues :
*Change history :
*@LastModifyDate : 2010.02.18
*@LastModifier : 함대성
*@LastVersion : 1.0
* 2010.02.18 함대성 
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
 * @author 함대성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class VskLanePicVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<VskLanePicVO> models = new ArrayList<VskLanePicVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lanePicSeq = null;
	/* Column Info */
	private String rgnShpOprCd = null;
	/* Column Info */
	private String jbDesc = null;
	/* Column Info */
	private String laneRmk = null;
	/* Column Info */
	private String lanePicUsrEml = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mphnNo = null;
	/* Column Info */
	private String picVslDesc = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String vslSlanNm = null;
	/* Column Info */
	private String usrNm = null;
	/* Column Info */
	private String laneMngUsrDesc = null;
	/* Column Info */
	private String picPhnNo = null;
	/* Column Info */
	private String faxNo = null;
	/* Column Info */
	private String lanePicTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String picEml = null;
	/* Column Info */
	private String vslOprCd = null;
	
	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public VskLanePicVO() {}

	public VskLanePicVO(String ibflag, String pagerows, String slanCd, String lanePicSeq, String lanePicTpCd, String vslSlanNm, String laneMngUsrDesc, String usrNm, String jbDesc, String picVslDesc, String picPhnNo, String mphnNo, String faxNo, String lanePicUsrEml, String picEml, String laneRmk, String creUsrId, String creDt, String updUsrId, String updDt, String rgnShpOprCd, String vslOprCd) {
		this.updDt = updDt;
		this.lanePicSeq = lanePicSeq;
		this.rgnShpOprCd = rgnShpOprCd;
		this.jbDesc = jbDesc;
		this.laneRmk = laneRmk;
		this.lanePicUsrEml = lanePicUsrEml;
		this.creDt = creDt;
		this.mphnNo = mphnNo;
		this.picVslDesc = picVslDesc;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.slanCd = slanCd;
		this.vslSlanNm = vslSlanNm;
		this.usrNm = usrNm;
		this.laneMngUsrDesc = laneMngUsrDesc;
		this.picPhnNo = picPhnNo;
		this.faxNo = faxNo;
		this.lanePicTpCd = lanePicTpCd;
		this.updUsrId = updUsrId;
		this.picEml = picEml;
		this.vslOprCd = vslOprCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lane_pic_seq", getLanePicSeq());
		this.hashColumns.put("rgn_shp_opr_cd", getRgnShpOprCd());
		this.hashColumns.put("jb_desc", getJbDesc());
		this.hashColumns.put("lane_rmk", getLaneRmk());
		this.hashColumns.put("lane_pic_usr_eml", getLanePicUsrEml());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mphn_no", getMphnNo());
		this.hashColumns.put("pic_vsl_desc", getPicVslDesc());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("vsl_slan_nm", getVslSlanNm());
		this.hashColumns.put("usr_nm", getUsrNm());
		this.hashColumns.put("lane_mng_usr_desc", getLaneMngUsrDesc());
		this.hashColumns.put("pic_phn_no", getPicPhnNo());
		this.hashColumns.put("fax_no", getFaxNo());
		this.hashColumns.put("lane_pic_tp_cd", getLanePicTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pic_eml", getPicEml());
		this.hashColumns.put("vsl_opr_cd", getVslOprCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lane_pic_seq", "lanePicSeq");
		this.hashFields.put("rgn_shp_opr_cd", "rgnShpOprCd");
		this.hashFields.put("jb_desc", "jbDesc");
		this.hashFields.put("lane_rmk", "laneRmk");
		this.hashFields.put("lane_pic_usr_eml", "lanePicUsrEml");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mphn_no", "mphnNo");
		this.hashFields.put("pic_vsl_desc", "picVslDesc");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("vsl_slan_nm", "vslSlanNm");
		this.hashFields.put("usr_nm", "usrNm");
		this.hashFields.put("lane_mng_usr_desc", "laneMngUsrDesc");
		this.hashFields.put("pic_phn_no", "picPhnNo");
		this.hashFields.put("fax_no", "faxNo");
		this.hashFields.put("lane_pic_tp_cd", "lanePicTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pic_eml", "picEml");
		this.hashFields.put("vsl_opr_cd", "vslOprCd");
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
	 * @return lanePicSeq
	 */
	public String getLanePicSeq() {
		return this.lanePicSeq;
	}
	
	/**
	 * Column Info
	 * @return rgnShpOprCd
	 */
	public String getRgnShpOprCd() {
		return this.rgnShpOprCd;
	}
	
	/**
	 * Column Info
	 * @return jbDesc
	 */
	public String getJbDesc() {
		return this.jbDesc;
	}
	
	/**
	 * Column Info
	 * @return laneRmk
	 */
	public String getLaneRmk() {
		return this.laneRmk;
	}
	
	/**
	 * Column Info
	 * @return lanePicUsrEml
	 */
	public String getLanePicUsrEml() {
		return this.lanePicUsrEml;
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
	 * @return mphnNo
	 */
	public String getMphnNo() {
		return this.mphnNo;
	}
	
	/**
	 * Column Info
	 * @return picVslDesc
	 */
	public String getPicVslDesc() {
		return this.picVslDesc;
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
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return vslSlanNm
	 */
	public String getVslSlanNm() {
		return this.vslSlanNm;
	}
	
	/**
	 * Column Info
	 * @return usrNm
	 */
	public String getUsrNm() {
		return this.usrNm;
	}
	
	/**
	 * Column Info
	 * @return laneMngUsrDesc
	 */
	public String getLaneMngUsrDesc() {
		return this.laneMngUsrDesc;
	}
	
	/**
	 * Column Info
	 * @return picPhnNo
	 */
	public String getPicPhnNo() {
		return this.picPhnNo;
	}
	
	/**
	 * Column Info
	 * @return faxNo
	 */
	public String getFaxNo() {
		return this.faxNo;
	}
	
	/**
	 * Column Info
	 * @return lanePicTpCd
	 */
	public String getLanePicTpCd() {
		return this.lanePicTpCd;
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
	 * @return picEml
	 */
	public String getPicEml() {
		return this.picEml;
	}
	
	/**
	 * Column Info
	 * @return vslOprCd
	 */
	public String getVslOprCd() {
		return this.vslOprCd;
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
	 * @param lanePicSeq
	 */
	public void setLanePicSeq(String lanePicSeq) {
		this.lanePicSeq = lanePicSeq;
	}
	
	/**
	 * Column Info
	 * @param rgnShpOprCd
	 */
	public void setRgnShpOprCd(String rgnShpOprCd) {
		this.rgnShpOprCd = rgnShpOprCd;
	}
	
	/**
	 * Column Info
	 * @param jbDesc
	 */
	public void setJbDesc(String jbDesc) {
		this.jbDesc = jbDesc;
	}
	
	/**
	 * Column Info
	 * @param laneRmk
	 */
	public void setLaneRmk(String laneRmk) {
		this.laneRmk = laneRmk;
	}
	
	/**
	 * Column Info
	 * @param lanePicUsrEml
	 */
	public void setLanePicUsrEml(String lanePicUsrEml) {
		this.lanePicUsrEml = lanePicUsrEml;
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
	 * @param mphnNo
	 */
	public void setMphnNo(String mphnNo) {
		this.mphnNo = mphnNo;
	}
	
	/**
	 * Column Info
	 * @param picVslDesc
	 */
	public void setPicVslDesc(String picVslDesc) {
		this.picVslDesc = picVslDesc;
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
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param vslSlanNm
	 */
	public void setVslSlanNm(String vslSlanNm) {
		this.vslSlanNm = vslSlanNm;
	}
	
	/**
	 * Column Info
	 * @param usrNm
	 */
	public void setUsrNm(String usrNm) {
		this.usrNm = usrNm;
	}
	
	/**
	 * Column Info
	 * @param laneMngUsrDesc
	 */
	public void setLaneMngUsrDesc(String laneMngUsrDesc) {
		this.laneMngUsrDesc = laneMngUsrDesc;
	}
	
	/**
	 * Column Info
	 * @param picPhnNo
	 */
	public void setPicPhnNo(String picPhnNo) {
		this.picPhnNo = picPhnNo;
	}
	
	/**
	 * Column Info
	 * @param faxNo
	 */
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	
	/**
	 * Column Info
	 * @param lanePicTpCd
	 */
	public void setLanePicTpCd(String lanePicTpCd) {
		this.lanePicTpCd = lanePicTpCd;
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
	 * @param picEml
	 */
	public void setPicEml(String picEml) {
		this.picEml = picEml;
	}

	/**
	 * Column Info
	 * @param vslOprCd
	 */
	public void setVslOprCd(String vslOprCd) {
		this.vslOprCd = vslOprCd;
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
		setLanePicSeq(JSPUtil.getParameter(request, prefix + "lane_pic_seq", ""));
		setRgnShpOprCd(JSPUtil.getParameter(request, prefix + "rgn_shp_opr_cd", ""));
		setJbDesc(JSPUtil.getParameter(request, prefix + "jb_desc", ""));
		setLaneRmk(JSPUtil.getParameter(request, prefix + "lane_rmk", ""));
		setLanePicUsrEml(JSPUtil.getParameter(request, prefix + "lane_pic_usr_eml", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setMphnNo(JSPUtil.getParameter(request, prefix + "mphn_no", ""));
		setPicVslDesc(JSPUtil.getParameter(request, prefix + "pic_vsl_desc", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setSlanCd(JSPUtil.getParameter(request, prefix + "slan_cd", ""));
		setVslSlanNm(JSPUtil.getParameter(request, prefix + "vsl_slan_nm", ""));
		setUsrNm(JSPUtil.getParameter(request, prefix + "usr_nm", ""));
		setLaneMngUsrDesc(JSPUtil.getParameter(request, prefix + "lane_mng_usr_desc", ""));
		setPicPhnNo(JSPUtil.getParameter(request, prefix + "pic_phn_no", ""));
		setFaxNo(JSPUtil.getParameter(request, prefix + "fax_no", ""));
		setLanePicTpCd(JSPUtil.getParameter(request, prefix + "lane_pic_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setPicEml(JSPUtil.getParameter(request, prefix + "pic_eml", ""));
		setVslOprCd(JSPUtil.getParameter(request, prefix + "vsl_opr_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return VskLanePicVO[]
	 */
	public VskLanePicVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return VskLanePicVO[]
	 */
	public VskLanePicVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		VskLanePicVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lanePicSeq = (JSPUtil.getParameter(request, prefix	+ "lane_pic_seq", length));
			String[] rgnShpOprCd = (JSPUtil.getParameter(request, prefix	+ "rgn_shp_opr_cd", length));
			String[] jbDesc = (JSPUtil.getParameter(request, prefix	+ "jb_desc", length));
			String[] laneRmk = (JSPUtil.getParameter(request, prefix	+ "lane_rmk", length));
			String[] lanePicUsrEml = (JSPUtil.getParameter(request, prefix	+ "lane_pic_usr_eml", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mphnNo = (JSPUtil.getParameter(request, prefix	+ "mphn_no", length));
			String[] picVslDesc = (JSPUtil.getParameter(request, prefix	+ "pic_vsl_desc", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] vslSlanNm = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_nm", length));
			String[] usrNm = (JSPUtil.getParameter(request, prefix	+ "usr_nm", length));
			String[] laneMngUsrDesc = (JSPUtil.getParameter(request, prefix	+ "lane_mng_usr_desc", length));
			String[] picPhnNo = (JSPUtil.getParameter(request, prefix	+ "pic_phn_no", length));
			String[] faxNo = (JSPUtil.getParameter(request, prefix	+ "fax_no", length));
			String[] lanePicTpCd = (JSPUtil.getParameter(request, prefix	+ "lane_pic_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] picEml = (JSPUtil.getParameter(request, prefix	+ "pic_eml", length));
			String[] vslOprCd = (JSPUtil.getParameter(request, prefix	+ "vsl_opr_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new VskLanePicVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lanePicSeq[i] != null)
					model.setLanePicSeq(lanePicSeq[i]);
				if (rgnShpOprCd[i] != null)
					model.setRgnShpOprCd(rgnShpOprCd[i]);
				if (jbDesc[i] != null)
					model.setJbDesc(jbDesc[i]);
				if (laneRmk[i] != null)
					model.setLaneRmk(laneRmk[i]);
				if (lanePicUsrEml[i] != null)
					model.setLanePicUsrEml(lanePicUsrEml[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mphnNo[i] != null)
					model.setMphnNo(mphnNo[i]);
				if (picVslDesc[i] != null)
					model.setPicVslDesc(picVslDesc[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (vslSlanNm[i] != null)
					model.setVslSlanNm(vslSlanNm[i]);
				if (usrNm[i] != null)
					model.setUsrNm(usrNm[i]);
				if (laneMngUsrDesc[i] != null)
					model.setLaneMngUsrDesc(laneMngUsrDesc[i]);
				if (picPhnNo[i] != null)
					model.setPicPhnNo(picPhnNo[i]);
				if (faxNo[i] != null)
					model.setFaxNo(faxNo[i]);
				if (lanePicTpCd[i] != null)
					model.setLanePicTpCd(lanePicTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (picEml[i] != null)
					model.setPicEml(picEml[i]);
				if (vslOprCd[i] != null)
					model.setVslOprCd(vslOprCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getVskLanePicVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return VskLanePicVO[]
	 */
	public VskLanePicVO[] getVskLanePicVOs(){
		VskLanePicVO[] vos = (VskLanePicVO[])models.toArray(new VskLanePicVO[models.size()]);
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
		this.lanePicSeq = this.lanePicSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rgnShpOprCd = this.rgnShpOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.jbDesc = this.jbDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneRmk = this.laneRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lanePicUsrEml = this.lanePicUsrEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mphnNo = this.mphnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.picVslDesc = this.picVslDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanNm = this.vslSlanNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrNm = this.usrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.laneMngUsrDesc = this.laneMngUsrDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.picPhnNo = this.picPhnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.faxNo = this.faxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lanePicTpCd = this.lanePicTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.picEml = this.picEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslOprCd = this.vslOprCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
