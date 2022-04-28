/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PreDispatchStatusListVO.java
*@FileTitle : PreDispatchStatusListVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.21
*@LastModifier : 최진오
*@LastVersion : 1.0
* 2009.09.21 최진오 
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
 * @author 최진오
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class PreDispatchStatusListVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PreDispatchStatusListVO> models = new ArrayList<PreDispatchStatusListVO>();
	
	/* Column Info */
	private String trspWoSeq = null;
	/* Column Info */
	private String disN1stFaxNo = null;
	/* Column Info */
	private String trspDisRefNo = null;
	/* Column Info */
	private String disN2ndEml = null;
	/* Column Info */
	private String trspSoSeq = null;
	/* Column Info */
	private String vndrLglEngNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String trspWoOfcCtyCd = null;
	/* Column Info */
	private String trspSoOfcCtyCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String woIssKnt = null;
	/* Column Info */
	private String disN3rdEml = null;
	/* Column Info */
	private String creOfcCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String disN3rdFaxNo = null;
	/* Column Info */
	private String disN2ndFaxNo = null;
	/* Column Info */
	private String localTime = null;
	/* Column Info */
	private String disN1stEml = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String trspDisIssSeq = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PreDispatchStatusListVO() {}

	public PreDispatchStatusListVO(String ibflag, String pagerows, String trspWoOfcCtyCd, String trspWoSeq, String woIssKnt, String trspSoOfcCtyCd, String trspSoSeq, String vndrSeq, String disN1stFaxNo, String disN2ndFaxNo, String disN3rdFaxNo, String disN1stEml, String disN2ndEml, String disN3rdEml, String vndrLglEngNm, String creOfcCd, String updUsrId, String localTime, String trspDisRefNo, String trspDisIssSeq) {
		this.trspWoSeq = trspWoSeq;
		this.disN1stFaxNo = disN1stFaxNo;
		this.trspDisRefNo = trspDisRefNo;
		this.disN2ndEml = disN2ndEml;
		this.trspSoSeq = trspSoSeq;
		this.vndrLglEngNm = vndrLglEngNm;
		this.pagerows = pagerows;
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
		this.ibflag = ibflag;
		this.woIssKnt = woIssKnt;
		this.disN3rdEml = disN3rdEml;
		this.creOfcCd = creOfcCd;
		this.vndrSeq = vndrSeq;
		this.disN3rdFaxNo = disN3rdFaxNo;
		this.disN2ndFaxNo = disN2ndFaxNo;
		this.localTime = localTime;
		this.disN1stEml = disN1stEml;
		this.updUsrId = updUsrId;
		this.trspDisIssSeq = trspDisIssSeq;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("trsp_wo_seq", getTrspWoSeq());
		this.hashColumns.put("dis_n1st_fax_no", getDisN1stFaxNo());
		this.hashColumns.put("trsp_dis_ref_no", getTrspDisRefNo());
		this.hashColumns.put("dis_n2nd_eml", getDisN2ndEml());
		this.hashColumns.put("trsp_so_seq", getTrspSoSeq());
		this.hashColumns.put("vndr_lgl_eng_nm", getVndrLglEngNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("trsp_wo_ofc_cty_cd", getTrspWoOfcCtyCd());
		this.hashColumns.put("trsp_so_ofc_cty_cd", getTrspSoOfcCtyCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("wo_iss_knt", getWoIssKnt());
		this.hashColumns.put("dis_n3rd_eml", getDisN3rdEml());
		this.hashColumns.put("cre_ofc_cd", getCreOfcCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("dis_n3rd_fax_no", getDisN3rdFaxNo());
		this.hashColumns.put("dis_n2nd_fax_no", getDisN2ndFaxNo());
		this.hashColumns.put("local_time", getLocalTime());
		this.hashColumns.put("dis_n1st_eml", getDisN1stEml());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("trsp_dis_iss_seq", this.getTrspDisIssSeq());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("trsp_wo_seq", "trspWoSeq");
		this.hashFields.put("dis_n1st_fax_no", "disN1stFaxNo");
		this.hashFields.put("trsp_dis_ref_no", "trspDisRefNo");
		this.hashFields.put("dis_n2nd_eml", "disN2ndEml");
		this.hashFields.put("trsp_so_seq", "trspSoSeq");
		this.hashFields.put("vndr_lgl_eng_nm", "vndrLglEngNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("trsp_wo_ofc_cty_cd", "trspWoOfcCtyCd");
		this.hashFields.put("trsp_so_ofc_cty_cd", "trspSoOfcCtyCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("wo_iss_knt", "woIssKnt");
		this.hashFields.put("dis_n3rd_eml", "disN3rdEml");
		this.hashFields.put("cre_ofc_cd", "creOfcCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("dis_n3rd_fax_no", "disN3rdFaxNo");
		this.hashFields.put("dis_n2nd_fax_no", "disN2ndFaxNo");
		this.hashFields.put("local_time", "localTime");
		this.hashFields.put("dis_n1st_eml", "disN1stEml");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("trsp_dis_iss_seq", "trspDisIssSeq");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return trspWoSeq
	 */
	public String getTrspWoSeq() {
		return this.trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @return disN1stFaxNo
	 */
	public String getDisN1stFaxNo() {
		return this.disN1stFaxNo;
	}
	
	/**
	 * Column Info
	 * @return trspDisRefNo
	 */
	public String getTrspDisRefNo() {
		return this.trspDisRefNo;
	}
	
	/**
	 * Column Info
	 * @return disN2ndEml
	 */
	public String getDisN2ndEml() {
		return this.disN2ndEml;
	}
	
	/**
	 * Column Info
	 * @return trspSoSeq
	 */
	public String getTrspSoSeq() {
		return this.trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @return vndrLglEngNm
	 */
	public String getVndrLglEngNm() {
		return this.vndrLglEngNm;
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
	 * @return trspWoOfcCtyCd
	 */
	public String getTrspWoOfcCtyCd() {
		return this.trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @return trspSoOfcCtyCd
	 */
	public String getTrspSoOfcCtyCd() {
		return this.trspSoOfcCtyCd;
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
	 * @return woIssKnt
	 */
	public String getWoIssKnt() {
		return this.woIssKnt;
	}
	
	/**
	 * Column Info
	 * @return disN3rdEml
	 */
	public String getDisN3rdEml() {
		return this.disN3rdEml;
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
	 * @return vndrSeq
	 */
	public String getVndrSeq() {
		return this.vndrSeq;
	}
	
	/**
	 * Column Info
	 * @return disN3rdFaxNo
	 */
	public String getDisN3rdFaxNo() {
		return this.disN3rdFaxNo;
	}
	
	/**
	 * Column Info
	 * @return disN2ndFaxNo
	 */
	public String getDisN2ndFaxNo() {
		return this.disN2ndFaxNo;
	}
	
	/**
	 * Column Info
	 * @return localTime
	 */
	public String getLocalTime() {
		return this.localTime;
	}
	
	/**
	 * Column Info
	 * @return disN1stEml
	 */
	public String getDisN1stEml() {
		return this.disN1stEml;
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
	 * @return trspDisIssSeq
	 */
	public String getTrspDisIssSeq() {
		return trspDisIssSeq;
	}

	/**
	 * Column Info
	 * @param trspWoSeq
	 */
	public void setTrspWoSeq(String trspWoSeq) {
		this.trspWoSeq = trspWoSeq;
	}
	
	/**
	 * Column Info
	 * @param disN1stFaxNo
	 */
	public void setDisN1stFaxNo(String disN1stFaxNo) {
		this.disN1stFaxNo = disN1stFaxNo;
	}
	
	/**
	 * Column Info
	 * @param trspDisRefNo
	 */
	public void setTrspDisRefNo(String trspDisRefNo) {
		this.trspDisRefNo = trspDisRefNo;
	}
	
	/**
	 * Column Info
	 * @param disN2ndEml
	 */
	public void setDisN2ndEml(String disN2ndEml) {
		this.disN2ndEml = disN2ndEml;
	}
	
	/**
	 * Column Info
	 * @param trspSoSeq
	 */
	public void setTrspSoSeq(String trspSoSeq) {
		this.trspSoSeq = trspSoSeq;
	}
	
	/**
	 * Column Info
	 * @param vndrLglEngNm
	 */
	public void setVndrLglEngNm(String vndrLglEngNm) {
		this.vndrLglEngNm = vndrLglEngNm;
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
	 * @param trspWoOfcCtyCd
	 */
	public void setTrspWoOfcCtyCd(String trspWoOfcCtyCd) {
		this.trspWoOfcCtyCd = trspWoOfcCtyCd;
	}
	
	/**
	 * Column Info
	 * @param trspSoOfcCtyCd
	 */
	public void setTrspSoOfcCtyCd(String trspSoOfcCtyCd) {
		this.trspSoOfcCtyCd = trspSoOfcCtyCd;
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
	 * @param woIssKnt
	 */
	public void setWoIssKnt(String woIssKnt) {
		this.woIssKnt = woIssKnt;
	}
	
	/**
	 * Column Info
	 * @param disN3rdEml
	 */
	public void setDisN3rdEml(String disN3rdEml) {
		this.disN3rdEml = disN3rdEml;
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
	 * @param vndrSeq
	 */
	public void setVndrSeq(String vndrSeq) {
		this.vndrSeq = vndrSeq;
	}
	
	/**
	 * Column Info
	 * @param disN3rdFaxNo
	 */
	public void setDisN3rdFaxNo(String disN3rdFaxNo) {
		this.disN3rdFaxNo = disN3rdFaxNo;
	}
	
	/**
	 * Column Info
	 * @param disN2ndFaxNo
	 */
	public void setDisN2ndFaxNo(String disN2ndFaxNo) {
		this.disN2ndFaxNo = disN2ndFaxNo;
	}
	
	/**
	 * Column Info
	 * @param localTime
	 */
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	
	/**
	 * Column Info
	 * @param disN1stEml
	 */
	public void setDisN1stEml(String disN1stEml) {
		this.disN1stEml = disN1stEml;
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
	 * @param trspDisIssSeq
	 */
	public void setTrspDisIssSeq(String trspDisIssSeq) {
		this.trspDisIssSeq = trspDisIssSeq;
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setTrspWoSeq(JSPUtil.getParameter(request, "trsp_wo_seq", ""));
		setDisN1stFaxNo(JSPUtil.getParameter(request, "dis_n1st_fax_no", ""));
		setTrspDisRefNo(JSPUtil.getParameter(request, "trsp_dis_ref_no", ""));
		setDisN2ndEml(JSPUtil.getParameter(request, "dis_n2nd_eml", ""));
		setTrspSoSeq(JSPUtil.getParameter(request, "trsp_so_seq", ""));
		setVndrLglEngNm(JSPUtil.getParameter(request, "vndr_lgl_eng_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTrspWoOfcCtyCd(JSPUtil.getParameter(request, "trsp_wo_ofc_cty_cd", ""));
		setTrspSoOfcCtyCd(JSPUtil.getParameter(request, "trsp_so_ofc_cty_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setWoIssKnt(JSPUtil.getParameter(request, "wo_iss_knt", ""));
		setDisN3rdEml(JSPUtil.getParameter(request, "dis_n3rd_eml", ""));
		setCreOfcCd(JSPUtil.getParameter(request, "cre_ofc_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setDisN3rdFaxNo(JSPUtil.getParameter(request, "dis_n3rd_fax_no", ""));
		setDisN2ndFaxNo(JSPUtil.getParameter(request, "dis_n2nd_fax_no", ""));
		setLocalTime(JSPUtil.getParameter(request, "local_time", ""));
		setDisN1stEml(JSPUtil.getParameter(request, "dis_n1st_eml", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTrspDisIssSeq(JSPUtil.getParameter(request, "trsp_dis_iss_seq", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return PreDispatchStatusListVO[]
	 */
	public PreDispatchStatusListVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PreDispatchStatusListVO[]
	 */
	public PreDispatchStatusListVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PreDispatchStatusListVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] trspWoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_seq", length));
			String[] disN1stFaxNo = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_fax_no", length));
			String[] trspDisRefNo = (JSPUtil.getParameter(request, prefix	+ "trsp_dis_ref_no", length));
			String[] disN2ndEml = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_eml", length));
			String[] trspSoSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_so_seq", length));
			String[] vndrLglEngNm = (JSPUtil.getParameter(request, prefix	+ "vndr_lgl_eng_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] trspWoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_wo_ofc_cty_cd", length));
			String[] trspSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "trsp_so_ofc_cty_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] woIssKnt = (JSPUtil.getParameter(request, prefix	+ "wo_iss_knt", length));
			String[] disN3rdEml = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_eml", length));
			String[] creOfcCd = (JSPUtil.getParameter(request, prefix	+ "cre_ofc_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] disN3rdFaxNo = (JSPUtil.getParameter(request, prefix	+ "dis_n3rd_fax_no", length));
			String[] disN2ndFaxNo = (JSPUtil.getParameter(request, prefix	+ "dis_n2nd_fax_no", length));
			String[] localTime = (JSPUtil.getParameter(request, prefix	+ "local_time", length));
			String[] disN1stEml = (JSPUtil.getParameter(request, prefix	+ "dis_n1st_eml", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] trspDisIssSeq = (JSPUtil.getParameter(request, prefix	+ "trsp_dis_iss_seq", length));
			
			for (int i = 0; i < length; i++) {
				model = new PreDispatchStatusListVO();
				if (trspWoSeq[i] != null)
					model.setTrspWoSeq(trspWoSeq[i]);
				if (disN1stFaxNo[i] != null)
					model.setDisN1stFaxNo(disN1stFaxNo[i]);
				if (trspDisRefNo[i] != null)
					model.setTrspDisRefNo(trspDisRefNo[i]);
				if (disN2ndEml[i] != null)
					model.setDisN2ndEml(disN2ndEml[i]);
				if (trspSoSeq[i] != null)
					model.setTrspSoSeq(trspSoSeq[i]);
				if (vndrLglEngNm[i] != null)
					model.setVndrLglEngNm(vndrLglEngNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (trspWoOfcCtyCd[i] != null)
					model.setTrspWoOfcCtyCd(trspWoOfcCtyCd[i]);
				if (trspSoOfcCtyCd[i] != null)
					model.setTrspSoOfcCtyCd(trspSoOfcCtyCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (woIssKnt[i] != null)
					model.setWoIssKnt(woIssKnt[i]);
				if (disN3rdEml[i] != null)
					model.setDisN3rdEml(disN3rdEml[i]);
				if (creOfcCd[i] != null)
					model.setCreOfcCd(creOfcCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (disN3rdFaxNo[i] != null)
					model.setDisN3rdFaxNo(disN3rdFaxNo[i]);
				if (disN2ndFaxNo[i] != null)
					model.setDisN2ndFaxNo(disN2ndFaxNo[i]);
				if (localTime[i] != null)
					model.setLocalTime(localTime[i]);
				if (disN1stEml[i] != null)
					model.setDisN1stEml(disN1stEml[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (trspDisIssSeq[i] != null)
					model.setTrspDisIssSeq(trspDisIssSeq[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSearchPreDispatchStatusListVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return PreDispatchStatusListVO[]
	 */
	public PreDispatchStatusListVO[] getSearchPreDispatchStatusListVOs(){
		PreDispatchStatusListVO[] vos = (PreDispatchStatusListVO[])models.toArray(new PreDispatchStatusListVO[models.size()]);
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
		this.trspWoSeq = this.trspWoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stFaxNo = this.disN1stFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspDisRefNo = this.trspDisRefNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndEml = this.disN2ndEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoSeq = this.trspSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrLglEngNm = this.vndrLglEngNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspWoOfcCtyCd = this.trspWoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspSoOfcCtyCd = this.trspSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.woIssKnt = this.woIssKnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdEml = this.disN3rdEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creOfcCd = this.creOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN3rdFaxNo = this.disN3rdFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN2ndFaxNo = this.disN2ndFaxNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.localTime = this.localTime .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.disN1stEml = this.disN1stEml .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trspDisIssSeq = this.trspDisIssSeq.replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
