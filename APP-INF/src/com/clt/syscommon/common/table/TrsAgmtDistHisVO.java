/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TrsAgmtDistHisVO.java
*@FileTitle : TrsAgmtDistHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.05
*@LastModifier : 양봉준
*@LastVersion : 1.0
* 2009.07.05 양봉준 
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
 * @author 양봉준
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TrsAgmtDistHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TrsAgmtDistHisVO> models = new ArrayList<TrsAgmtDistHisVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String toNodCd = null;
	/* Column Info */
	private String convDist = null;
	/* Column Info */
	private String toNodZipCdCtnt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String distMeasUtCd = null;
	/* Column Info */
	private String bzcDist = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fmNodCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String hjlNo = null;
	/* Column Info */
	private String distHisSeq = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String convMeasUtCd = null;
	/* Column Info */
	private String fmNodZipCdCtnt = null;
	/* Column Info */
	private String trspCrrModCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TrsAgmtDistHisVO() {}

	public TrsAgmtDistHisVO(String ibflag, String pagerows, String fmNodCd, String toNodCd, String distHisSeq, String distMeasUtCd, String bzcDist, String convMeasUtCd, String convDist, String fmNodZipCdCtnt, String toNodZipCdCtnt, String creOfcCd, String trspCrrModCd, String hjlNo, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.toNodCd = toNodCd;
		this.convDist = convDist;
		this.toNodZipCdCtnt = toNodZipCdCtnt;
		this.creDt = creDt;
		this.distMeasUtCd = distMeasUtCd;
		this.bzcDist = bzcDist;
		this.pagerows = pagerows;
		this.fmNodCd = fmNodCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.hjlNo = hjlNo;
		this.distHisSeq = distHisSeq;
		this.creOfcCd = creOfcCd;
		this.convMeasUtCd = convMeasUtCd;
		this.fmNodZipCdCtnt = fmNodZipCdCtnt;
		this.trspCrrModCd = trspCrrModCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("to_nod_cd", getToNodCd());
		this.hashColumns.put("conv_dist", getConvDist());
		this.hashColumns.put("to_nod_zip_cd_ctnt", getToNodZipCdCtnt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("dist_meas_ut_cd", getDistMeasUtCd());
		this.hashColumns.put("bzc_dist", getBzcDist());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fm_nod_cd", getFmNodCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("hjl_no", getHjlNo());
		this.hashColumns.put("dist_his_seq", getDistHisSeq());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("conv_meas_ut_cd", getConvMeasUtCd());
		this.hashColumns.put("fm_nod_zip_cd_ctnt", getFmNodZipCdCtnt());
		this.hashColumns.put("trsp_crr_mod_cd", getTrspCrrModCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("to_nod_cd", "toNodCd");
		this.hashFields.put("conv_dist", "convDist");
		this.hashFields.put("to_nod_zip_cd_ctnt", "toNodZipCdCtnt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("dist_meas_ut_cd", "distMeasUtCd");
		this.hashFields.put("bzc_dist", "bzcDist");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fm_nod_cd", "fmNodCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("hjl_no", "hjlNo");
		this.hashFields.put("dist_his_seq", "distHisSeq");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("conv_meas_ut_cd", "convMeasUtCd");
		this.hashFields.put("fm_nod_zip_cd_ctnt", "fmNodZipCdCtnt");
		this.hashFields.put("trsp_crr_mod_cd", "trspCrrModCd");
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
	 * @return toNodCd
	 */
	public String getToNodCd() {
		return this.toNodCd;
	}
	
	/**
	 * Column Info
	 * @return convDist
	 */
	public String getConvDist() {
		return this.convDist;
	}
	
	/**
	 * Column Info
	 * @return toNodZipCdCtnt
	 */
	public String getToNodZipCdCtnt() {
		return this.toNodZipCdCtnt;
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
	 * @return distMeasUtCd
	 */
	public String getDistMeasUtCd() {
		return this.distMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @return bzcDist
	 */
	public String getBzcDist() {
		return this.bzcDist;
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
	 * @return fmNodCd
	 */
	public String getFmNodCd() {
		return this.fmNodCd;
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
	 * @return hjlNo
	 */
	public String getHjlNo() {
		return this.hjlNo;
	}
	
	/**
	 * Column Info
	 * @return distHisSeq
	 */
	public String getDistHisSeq() {
		return this.distHisSeq;
	}
	
	/**
	 * Column Info
	 * @return creOfcCd
	 */
	public String getCreOfcCd() {
		return this.creOfcCd;
	}
	
	/**
	 * Column Info
	 * @return convMeasUtCd
	 */
	public String getConvMeasUtCd() {
		return this.convMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @return fmNodZipCdCtnt
	 */
	public String getFmNodZipCdCtnt() {
		return this.fmNodZipCdCtnt;
	}
	
	/**
	 * Column Info
	 * @return trspCrrModCd
	 */
	public String getTrspCrrModCd() {
		return this.trspCrrModCd;
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
	 * @param toNodCd
	 */
	public void setToNodCd(String toNodCd) {
		this.toNodCd = toNodCd;
	}
	
	/**
	 * Column Info
	 * @param convDist
	 */
	public void setConvDist(String convDist) {
		this.convDist = convDist;
	}
	
	/**
	 * Column Info
	 * @param toNodZipCdCtnt
	 */
	public void setToNodZipCdCtnt(String toNodZipCdCtnt) {
		this.toNodZipCdCtnt = toNodZipCdCtnt;
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
	 * @param distMeasUtCd
	 */
	public void setDistMeasUtCd(String distMeasUtCd) {
		this.distMeasUtCd = distMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @param bzcDist
	 */
	public void setBzcDist(String bzcDist) {
		this.bzcDist = bzcDist;
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
	 * @param fmNodCd
	 */
	public void setFmNodCd(String fmNodCd) {
		this.fmNodCd = fmNodCd;
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
	 * @param hjlNo
	 */
	public void setHjlNo(String hjlNo) {
		this.hjlNo = hjlNo;
	}
	
	/**
	 * Column Info
	 * @param distHisSeq
	 */
	public void setDistHisSeq(String distHisSeq) {
		this.distHisSeq = distHisSeq;
	}
	
	/**
	 * Column Info
	 * @param creOfcCd
	 */
	public void setCreOfcCd(String creOfcCd) {
		this.creOfcCd = creOfcCd;
	}
	
	/**
	 * Column Info
	 * @param convMeasUtCd
	 */
	public void setConvMeasUtCd(String convMeasUtCd) {
		this.convMeasUtCd = convMeasUtCd;
	}
	
	/**
	 * Column Info
	 * @param fmNodZipCdCtnt
	 */
	public void setFmNodZipCdCtnt(String fmNodZipCdCtnt) {
		this.fmNodZipCdCtnt = fmNodZipCdCtnt;
	}
	
	/**
	 * Column Info
	 * @param trspCrrModCd
	 */
	public void setTrspCrrModCd(String trspCrrModCd) {
		this.trspCrrModCd = trspCrrModCd;
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
		setToNodCd(JSPUtil.getParameter(request, "to_nod_cd", ""));
		setConvDist(JSPUtil.getParameter(request, "conv_dist", ""));
		setToNodZipCdCtnt(JSPUtil.getParameter(request, "to_nod_zip_cd_ctnt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDistMeasUtCd(JSPUtil.getParameter(request, "dist_meas_ut_cd", ""));
		setBzcDist(JSPUtil.getParameter(request, "bzc_dist", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFmNodCd(JSPUtil.getParameter(request, "fm_nod_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setHjlNo(JSPUtil.getParameter(request, "hjl_no", ""));
		setDistHisSeq(JSPUtil.getParameter(request, "dist_his_seq", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setConvMeasUtCd(JSPUtil.getParameter(request, "conv_meas_ut_cd", ""));
		setFmNodZipCdCtnt(JSPUtil.getParameter(request, "fm_nod_zip_cd_ctnt", ""));
		setTrspCrrModCd(JSPUtil.getParameter(request, "trsp_crr_mod_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TrsAgmtDistHisVO[]
	 */
	public TrsAgmtDistHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TrsAgmtDistHisVO[]
	 */
	public TrsAgmtDistHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TrsAgmtDistHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] toNodCd = (JSPUtil.getParameter(request, prefix	+ "to_nod_cd", length));
			String[] convDist = (JSPUtil.getParameter(request, prefix	+ "conv_dist", length));
			String[] toNodZipCdCtnt = (JSPUtil.getParameter(request, prefix	+ "to_nod_zip_cd_ctnt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] distMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "dist_meas_ut_cd", length));
			String[] bzcDist = (JSPUtil.getParameter(request, prefix	+ "bzc_dist", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fmNodCd = (JSPUtil.getParameter(request, prefix	+ "fm_nod_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] hjlNo = (JSPUtil.getParameter(request, prefix	+ "hjl_no", length));
			String[] distHisSeq = (JSPUtil.getParameter(request, prefix	+ "dist_his_seq", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] convMeasUtCd = (JSPUtil.getParameter(request, prefix	+ "conv_meas_ut_cd", length));
			String[] fmNodZipCdCtnt = (JSPUtil.getParameter(request, prefix	+ "fm_nod_zip_cd_ctnt", length));
			String[] trspCrrModCd = (JSPUtil.getParameter(request, prefix	+ "trsp_crr_mod_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new TrsAgmtDistHisVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (toNodCd[i] != null)
					model.setToNodCd(toNodCd[i]);
				if (convDist[i] != null)
					model.setConvDist(convDist[i]);
				if (toNodZipCdCtnt[i] != null)
					model.setToNodZipCdCtnt(toNodZipCdCtnt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (distMeasUtCd[i] != null)
					model.setDistMeasUtCd(distMeasUtCd[i]);
				if (bzcDist[i] != null)
					model.setBzcDist(bzcDist[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fmNodCd[i] != null)
					model.setFmNodCd(fmNodCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (hjlNo[i] != null)
					model.setHjlNo(hjlNo[i]);
				if (distHisSeq[i] != null)
					model.setDistHisSeq(distHisSeq[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (convMeasUtCd[i] != null)
					model.setConvMeasUtCd(convMeasUtCd[i]);
				if (fmNodZipCdCtnt[i] != null)
					model.setFmNodZipCdCtnt(fmNodZipCdCtnt[i]);
				if (trspCrrModCd[i] != null)
					model.setTrspCrrModCd(trspCrrModCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTrsAgmtDistHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TrsAgmtDistHisVO[]
	 */
	public TrsAgmtDistHisVO[] getTrsAgmtDistHisVOs(){
		TrsAgmtDistHisVO[] vos = (TrsAgmtDistHisVO[])models.toArray(new TrsAgmtDistHisVO[models.size()]);
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
		this.toNodCd = this.toNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convDist = this.convDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toNodZipCdCtnt = this.toNodZipCdCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.distMeasUtCd = this.distMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bzcDist = this.bzcDist .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodCd = this.fmNodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjlNo = this.hjlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.distHisSeq = this.distHisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.convMeasUtCd = this.convMeasUtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmNodZipCdCtnt = this.fmNodZipCdCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspCrrModCd = this.trspCrrModCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
