/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BsaSltPrcVO.java
*@FileTitle : BsaSltPrcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.03
*@LastModifier : 남궁진호
*@LastVersion : 1.0
* 2009.09.03 남궁진호 
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
 * @author 남궁진호
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BsaSltPrcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BsaSltPrcVO> models = new ArrayList<BsaSltPrcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String subChtrBsaCapa = null;
	/* Column Info */
	private String crsChtrBsaCapa = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String bsaSltPrcToDt = null;
	/* Column Info */
	private String joEvntDt = null;
	/* Column Info */
	private String bsaSltCostTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vvdCd = null;
	/* Column Info */
	private String bsaSltPrcFmDt = null;
	/* Column Info */
	private String coBfrSubCapa = null;
	/* Column Info */
	private String dirCd = null;
	/* Column Info */
	private String sltPrcSeq = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BsaSltPrcVO() {}

	public BsaSltPrcVO(String ibflag, String pagerows, String trdCd, String rlaneCd, String dirCd, String bsaSltCostTpCd, String sltPrcSeq, String vvdCd, String bsaSltPrcFmDt, String bsaSltPrcToDt, String coBfrSubCapa, String subChtrBsaCapa, String crsChtrBsaCapa, String joEvntDt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.subChtrBsaCapa = subChtrBsaCapa;
		this.crsChtrBsaCapa = crsChtrBsaCapa;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.bsaSltPrcToDt = bsaSltPrcToDt;
		this.joEvntDt = joEvntDt;
		this.bsaSltCostTpCd = bsaSltCostTpCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.vvdCd = vvdCd;
		this.bsaSltPrcFmDt = bsaSltPrcFmDt;
		this.coBfrSubCapa = coBfrSubCapa;
		this.dirCd = dirCd;
		this.sltPrcSeq = sltPrcSeq;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("sub_chtr_bsa_capa", getSubChtrBsaCapa());
		this.hashColumns.put("crs_chtr_bsa_capa", getCrsChtrBsaCapa());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("bsa_slt_prc_to_dt", getBsaSltPrcToDt());
		this.hashColumns.put("jo_evnt_dt", getJoEvntDt());
		this.hashColumns.put("bsa_slt_cost_tp_cd", getBsaSltCostTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vvd_cd", getVvdCd());
		this.hashColumns.put("bsa_slt_prc_fm_dt", getBsaSltPrcFmDt());
		this.hashColumns.put("co_bfr_sub_capa", getCoBfrSubCapa());
		this.hashColumns.put("dir_cd", getDirCd());
		this.hashColumns.put("slt_prc_seq", getSltPrcSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("sub_chtr_bsa_capa", "subChtrBsaCapa");
		this.hashFields.put("crs_chtr_bsa_capa", "crsChtrBsaCapa");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("bsa_slt_prc_to_dt", "bsaSltPrcToDt");
		this.hashFields.put("jo_evnt_dt", "joEvntDt");
		this.hashFields.put("bsa_slt_cost_tp_cd", "bsaSltCostTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vvd_cd", "vvdCd");
		this.hashFields.put("bsa_slt_prc_fm_dt", "bsaSltPrcFmDt");
		this.hashFields.put("co_bfr_sub_capa", "coBfrSubCapa");
		this.hashFields.put("dir_cd", "dirCd");
		this.hashFields.put("slt_prc_seq", "sltPrcSeq");
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
	 * @return subChtrBsaCapa
	 */
	public String getSubChtrBsaCapa() {
		return this.subChtrBsaCapa;
	}
	
	/**
	 * Column Info
	 * @return crsChtrBsaCapa
	 */
	public String getCrsChtrBsaCapa() {
		return this.crsChtrBsaCapa;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return bsaSltPrcToDt
	 */
	public String getBsaSltPrcToDt() {
		return this.bsaSltPrcToDt;
	}
	
	/**
	 * Column Info
	 * @return joEvntDt
	 */
	public String getJoEvntDt() {
		return this.joEvntDt;
	}
	
	/**
	 * Column Info
	 * @return bsaSltCostTpCd
	 */
	public String getBsaSltCostTpCd() {
		return this.bsaSltCostTpCd;
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
	 * @return vvdCd
	 */
	public String getVvdCd() {
		return this.vvdCd;
	}
	
	/**
	 * Column Info
	 * @return bsaSltPrcFmDt
	 */
	public String getBsaSltPrcFmDt() {
		return this.bsaSltPrcFmDt;
	}
	
	/**
	 * Column Info
	 * @return coBfrSubCapa
	 */
	public String getCoBfrSubCapa() {
		return this.coBfrSubCapa;
	}
	
	/**
	 * Column Info
	 * @return dirCd
	 */
	public String getDirCd() {
		return this.dirCd;
	}
	
	/**
	 * Column Info
	 * @return sltPrcSeq
	 */
	public String getSltPrcSeq() {
		return this.sltPrcSeq;
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
	 * @param subChtrBsaCapa
	 */
	public void setSubChtrBsaCapa(String subChtrBsaCapa) {
		this.subChtrBsaCapa = subChtrBsaCapa;
	}
	
	/**
	 * Column Info
	 * @param crsChtrBsaCapa
	 */
	public void setCrsChtrBsaCapa(String crsChtrBsaCapa) {
		this.crsChtrBsaCapa = crsChtrBsaCapa;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param bsaSltPrcToDt
	 */
	public void setBsaSltPrcToDt(String bsaSltPrcToDt) {
		this.bsaSltPrcToDt = bsaSltPrcToDt;
	}
	
	/**
	 * Column Info
	 * @param joEvntDt
	 */
	public void setJoEvntDt(String joEvntDt) {
		this.joEvntDt = joEvntDt;
	}
	
	/**
	 * Column Info
	 * @param bsaSltCostTpCd
	 */
	public void setBsaSltCostTpCd(String bsaSltCostTpCd) {
		this.bsaSltCostTpCd = bsaSltCostTpCd;
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
	 * @param vvdCd
	 */
	public void setVvdCd(String vvdCd) {
		this.vvdCd = vvdCd;
	}
	
	/**
	 * Column Info
	 * @param bsaSltPrcFmDt
	 */
	public void setBsaSltPrcFmDt(String bsaSltPrcFmDt) {
		this.bsaSltPrcFmDt = bsaSltPrcFmDt;
	}
	
	/**
	 * Column Info
	 * @param coBfrSubCapa
	 */
	public void setCoBfrSubCapa(String coBfrSubCapa) {
		this.coBfrSubCapa = coBfrSubCapa;
	}
	
	/**
	 * Column Info
	 * @param dirCd
	 */
	public void setDirCd(String dirCd) {
		this.dirCd = dirCd;
	}
	
	/**
	 * Column Info
	 * @param sltPrcSeq
	 */
	public void setSltPrcSeq(String sltPrcSeq) {
		this.sltPrcSeq = sltPrcSeq;
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
		setSubChtrBsaCapa(JSPUtil.getParameter(request, "sub_chtr_bsa_capa", ""));
		setCrsChtrBsaCapa(JSPUtil.getParameter(request, "crs_chtr_bsa_capa", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setBsaSltPrcToDt(JSPUtil.getParameter(request, "bsa_slt_prc_to_dt", ""));
		setJoEvntDt(JSPUtil.getParameter(request, "jo_evnt_dt", ""));
		setBsaSltCostTpCd(JSPUtil.getParameter(request, "bsa_slt_cost_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVvdCd(JSPUtil.getParameter(request, "vvd_cd", ""));
		setBsaSltPrcFmDt(JSPUtil.getParameter(request, "bsa_slt_prc_fm_dt", ""));
		setCoBfrSubCapa(JSPUtil.getParameter(request, "co_bfr_sub_capa", ""));
		setDirCd(JSPUtil.getParameter(request, "dir_cd", ""));
		setSltPrcSeq(JSPUtil.getParameter(request, "slt_prc_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BsaSltPrcVO[]
	 */
	public BsaSltPrcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BsaSltPrcVO[]
	 */
	public BsaSltPrcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BsaSltPrcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] subChtrBsaCapa = (JSPUtil.getParameter(request, prefix	+ "sub_chtr_bsa_capa", length));
			String[] crsChtrBsaCapa = (JSPUtil.getParameter(request, prefix	+ "crs_chtr_bsa_capa", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] bsaSltPrcToDt = (JSPUtil.getParameter(request, prefix	+ "bsa_slt_prc_to_dt", length));
			String[] joEvntDt = (JSPUtil.getParameter(request, prefix	+ "jo_evnt_dt", length));
			String[] bsaSltCostTpCd = (JSPUtil.getParameter(request, prefix	+ "bsa_slt_cost_tp_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vvdCd = (JSPUtil.getParameter(request, prefix	+ "vvd_cd", length));
			String[] bsaSltPrcFmDt = (JSPUtil.getParameter(request, prefix	+ "bsa_slt_prc_fm_dt", length));
			String[] coBfrSubCapa = (JSPUtil.getParameter(request, prefix	+ "co_bfr_sub_capa", length));
			String[] dirCd = (JSPUtil.getParameter(request, prefix	+ "dir_cd", length));
			String[] sltPrcSeq = (JSPUtil.getParameter(request, prefix	+ "slt_prc_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BsaSltPrcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (subChtrBsaCapa[i] != null)
					model.setSubChtrBsaCapa(subChtrBsaCapa[i]);
				if (crsChtrBsaCapa[i] != null)
					model.setCrsChtrBsaCapa(crsChtrBsaCapa[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (bsaSltPrcToDt[i] != null)
					model.setBsaSltPrcToDt(bsaSltPrcToDt[i]);
				if (joEvntDt[i] != null)
					model.setJoEvntDt(joEvntDt[i]);
				if (bsaSltCostTpCd[i] != null)
					model.setBsaSltCostTpCd(bsaSltCostTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vvdCd[i] != null)
					model.setVvdCd(vvdCd[i]);
				if (bsaSltPrcFmDt[i] != null)
					model.setBsaSltPrcFmDt(bsaSltPrcFmDt[i]);
				if (coBfrSubCapa[i] != null)
					model.setCoBfrSubCapa(coBfrSubCapa[i]);
				if (dirCd[i] != null)
					model.setDirCd(dirCd[i]);
				if (sltPrcSeq[i] != null)
					model.setSltPrcSeq(sltPrcSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBsaSltPrcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BsaSltPrcVO[]
	 */
	public BsaSltPrcVO[] getBsaSltPrcVOs(){
		BsaSltPrcVO[] vos = (BsaSltPrcVO[])models.toArray(new BsaSltPrcVO[models.size()]);
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
		this.subChtrBsaCapa = this.subChtrBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.crsChtrBsaCapa = this.crsChtrBsaCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaSltPrcToDt = this.bsaSltPrcToDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.joEvntDt = this.joEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaSltCostTpCd = this.bsaSltCostTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vvdCd = this.vvdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bsaSltPrcFmDt = this.bsaSltPrcFmDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coBfrSubCapa = this.coBfrSubCapa .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dirCd = this.dirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltPrcSeq = this.sltPrcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
