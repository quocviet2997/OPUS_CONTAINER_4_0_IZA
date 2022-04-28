/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AgtChnLaneAgnVO.java
*@FileTitle : AgtChnLaneAgnVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.28
*@LastModifier : 이호진
*@LastVersion : 1.0
* 2009.07.28 이호진 
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
 * @author 이호진
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class AgtChnLaneAgnVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtChnLaneAgnVO> models = new ArrayList<AgtChnLaneAgnVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String agnCustSeq = null;
	/* Column Info */
	private String agnVndrCntCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chnBkgAgnNm = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String agnCd = null;
	/* Column Info */
	private String agnVndrSeq = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String agnCntCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String agnFincOfcCd = null;
	/* Column Info */
	private String vndrNm = null;
	/* Column Info */
	private String oldPodCd = null;
	/* Column Info */
	private String custCd = null;
	/* Column Info */
	private String oldSlanCd = null;	

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtChnLaneAgnVO() {}

	public AgtChnLaneAgnVO(String ibflag, String pagerows, String slanCd, String podCd, String agnCd, String agnCntCd, String agnCustSeq, 
						String chnBkgAgnNm, String agnFincOfcCd, String agnVndrCntCd, String agnVndrSeq, String deltFlg, String creUsrId, 
						String creDt, String updUsrId, String updDt, String vndrNm, String custCd, String oldPodCd, String oldSlanCd) {
		this.updDt = updDt;
		this.agnCustSeq = agnCustSeq;
		this.agnVndrCntCd = agnVndrCntCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.chnBkgAgnNm = chnBkgAgnNm;
		this.pagerows = pagerows;
		this.podCd = podCd;
		this.agnCd = agnCd;
		this.agnVndrSeq = agnVndrSeq;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.slanCd = slanCd;
		this.agnCntCd = agnCntCd;
		this.updUsrId = updUsrId;
		this.agnFincOfcCd = agnFincOfcCd;
		this.vndrNm = vndrNm;
		this.oldPodCd = oldPodCd;
		this.custCd = custCd;
		this.oldSlanCd = oldSlanCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("agn_cust_seq", getAgnCustSeq());
		this.hashColumns.put("agn_vndr_cnt_cd", getAgnVndrCntCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chn_bkg_agn_nm", getChnBkgAgnNm());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("agn_cd", getAgnCd());
		this.hashColumns.put("agn_vndr_seq", getAgnVndrSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("agn_cnt_cd", getAgnCntCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("agn_finc_ofc_cd", getAgnFincOfcCd());
		this.hashColumns.put("vndr_nm", getVndrNm());
		this.hashColumns.put("old_pod_cd", getOldPodCd());
		this.hashColumns.put("cust_cd", getCustCd());
		this.hashColumns.put("old_slan_cd", getOldSlanCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("agn_cust_seq", "agnCustSeq");
		this.hashFields.put("agn_vndr_cnt_cd", "agnVndrCntCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chn_bkg_agn_nm", "chnBkgAgnNm");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("agn_cd", "agnCd");
		this.hashFields.put("agn_vndr_seq", "agnVndrSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("agn_cnt_cd", "agnCntCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("agn_finc_ofc_cd", "agnFincOfcCd");
		this.hashFields.put("vndr_nm", "vndrNm");
		this.hashFields.put("old_pod_cd", "oldPodCd");
		this.hashFields.put("cust_cd", "custCd");
		this.hashFields.put("old_slan_cd", "oldSlanCd");
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
	 * @return agnCustSeq
	 */
	public String getAgnCustSeq() {
		return this.agnCustSeq;
	}
	
	/**
	 * Column Info
	 * @return agnVndrCntCd
	 */
	public String getAgnVndrCntCd() {
		return this.agnVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return deltFlg
	 */
	public String getDeltFlg() {
		return this.deltFlg;
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
	 * @return chnBkgAgnNm
	 */
	public String getChnBkgAgnNm() {
		return this.chnBkgAgnNm;
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
	 * @return podCd
	 */
	public String getPodCd() {
		return this.podCd;
	}
	
	/**
	 * Column Info
	 * @return agnCd
	 */
	public String getAgnCd() {
		return this.agnCd;
	}
	
	/**
	 * Column Info
	 * @return agnVndrSeq
	 */
	public String getAgnVndrSeq() {
		return this.agnVndrSeq;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return agnCntCd
	 */
	public String getAgnCntCd() {
		return this.agnCntCd;
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
	 * @return agnFincOfcCd
	 */
	public String getAgnFincOfcCd() {
		return this.agnFincOfcCd;
	}
	/**
	 * Column Info
	 * @return vndrNm
	 */
	public String getVndrNm() {
		return this.vndrNm;
	}
	
	/**
	 * Column Info
	 * @return oldPodCd
	 */
	public String getOldPodCd() {
		return this.oldPodCd;
	}
	
	/**
	 * Column Info
	 * @return custCd
	 */
	public String getCustCd() {
		return this.custCd;
	}
	
	/**
	 * Column Info
	 * @return oldSlanCd
	 */
	public String getOldSlanCd() {
		return this.oldSlanCd;
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
	 * @param agnCustSeq
	 */
	public void setAgnCustSeq(String agnCustSeq) {
		this.agnCustSeq = agnCustSeq;
	}
	
	/**
	 * Column Info
	 * @param agnVndrCntCd
	 */
	public void setAgnVndrCntCd(String agnVndrCntCd) {
		this.agnVndrCntCd = agnVndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param deltFlg
	 */
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
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
	 * @param chnBkgAgnNm
	 */
	public void setChnBkgAgnNm(String chnBkgAgnNm) {
		this.chnBkgAgnNm = chnBkgAgnNm;
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
	 * @param podCd
	 */
	public void setPodCd(String podCd) {
		this.podCd = podCd;
	}
	
	/**
	 * Column Info
	 * @param agnCd
	 */
	public void setAgnCd(String agnCd) {
		this.agnCd = agnCd;
	}
	
	/**
	 * Column Info
	 * @param agnVndrSeq
	 */
	public void setAgnVndrSeq(String agnVndrSeq) {
		this.agnVndrSeq = agnVndrSeq;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param agnCntCd
	 */
	public void setAgnCntCd(String agnCntCd) {
		this.agnCntCd = agnCntCd;
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
	 * @param agnFincOfcCd
	 */
	public void setAgnFincOfcCd(String agnFincOfcCd) {
		this.agnFincOfcCd = agnFincOfcCd;
	}
	
	/**
	 * Column Info
	 * @param vndrNm
	 */
	public void setVndrNm(String vndrNm) {
		this.vndrNm = vndrNm;
	}
	
	/**
	 * Column Info
	 * @param oldPodCd
	 */
	public void setOldPodCd(String oldPodCd) {
		this.oldPodCd = oldPodCd;
	}
	
	/**
	 * Column Info
	 * @param custCd
	 */
	public void setCustCd(String custCd) {
		this.custCd = custCd;
	}
	
	/**
	 * Column Info
	 * @param oldSlanCd
	 */
	public void setOldSlanCd(String oldSlanCd) {
		this.oldSlanCd = oldSlanCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setAgnCustSeq(JSPUtil.getParameter(request, "agn_cust_seq", ""));
		setAgnVndrCntCd(JSPUtil.getParameter(request, "agn_vndr_cnt_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChnBkgAgnNm(JSPUtil.getParameter(request, "chn_bkg_agn_nm", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setAgnCd(JSPUtil.getParameter(request, "agn_cd", ""));
		setAgnVndrSeq(JSPUtil.getParameter(request, "agn_vndr_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setAgnCntCd(JSPUtil.getParameter(request, "agn_cnt_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAgnFincOfcCd(JSPUtil.getParameter(request, "agn_finc_ofc_cd", ""));
		setVndrNm(JSPUtil.getParameter(request, "vndr_nm", ""));
		setOldPodCd(JSPUtil.getParameter(request, "old_pod_cd", ""));
		setCustCd(JSPUtil.getParameter(request, "cust_cd", ""));
		setOldSlanCd(JSPUtil.getParameter(request, "old_slan_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtChnLaneAgnVO[]
	 */
	public AgtChnLaneAgnVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtChnLaneAgnVO[]
	 */
	public AgtChnLaneAgnVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtChnLaneAgnVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] agnCustSeq = (JSPUtil.getParameter(request, prefix	+ "agn_cust_seq", length));
			String[] agnVndrCntCd = (JSPUtil.getParameter(request, prefix	+ "agn_vndr_cnt_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] chnBkgAgnNm = (JSPUtil.getParameter(request, prefix	+ "chn_bkg_agn_nm", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] agnCd = (JSPUtil.getParameter(request, prefix	+ "agn_cd", length));
			String[] agnVndrSeq = (JSPUtil.getParameter(request, prefix	+ "agn_vndr_seq", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] agnCntCd = (JSPUtil.getParameter(request, prefix	+ "agn_cnt_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] agnFincOfcCd = (JSPUtil.getParameter(request, prefix	+ "agn_finc_ofc_cd", length));
			String[] vndrNm = (JSPUtil.getParameter(request, prefix	+ "vndr_nm", length));
			String[] oldPodCd = (JSPUtil.getParameter(request, prefix	+ "old_pod_cd", length));
			String[] custCd = (JSPUtil.getParameter(request, prefix	+ "cust_cd", length));
			String[] oldSlanCd = (JSPUtil.getParameter(request, prefix	+ "old_slan_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtChnLaneAgnVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (agnCustSeq[i] != null)
					model.setAgnCustSeq(agnCustSeq[i]);
				if (agnVndrCntCd[i] != null)
					model.setAgnVndrCntCd(agnVndrCntCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chnBkgAgnNm[i] != null)
					model.setChnBkgAgnNm(chnBkgAgnNm[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (agnCd[i] != null)
					model.setAgnCd(agnCd[i]);
				if (agnVndrSeq[i] != null)
					model.setAgnVndrSeq(agnVndrSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (agnCntCd[i] != null)
					model.setAgnCntCd(agnCntCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (agnFincOfcCd[i] != null)
					model.setAgnFincOfcCd(agnFincOfcCd[i]);
				if (vndrNm[i] != null)
					model.setVndrNm(vndrNm[i]);
				if (oldPodCd[i] != null)
					model.setOldPodCd(oldPodCd[i]);
				if (custCd[i] != null)
					model.setCustCd(custCd[i]);
				if (oldSlanCd[i] != null)
					model.setOldSlanCd(oldSlanCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtChnLaneAgnVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtChnLaneAgnVO[]
	 */
	public AgtChnLaneAgnVO[] getAgtChnLaneAgnVOs(){
		AgtChnLaneAgnVO[] vos = (AgtChnLaneAgnVO[])models.toArray(new AgtChnLaneAgnVO[models.size()]);
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
		this.agnCustSeq = this.agnCustSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnVndrCntCd = this.agnVndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chnBkgAgnNm = this.chnBkgAgnNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCd = this.agnCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnVndrSeq = this.agnVndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnCntCd = this.agnCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnFincOfcCd = this.agnFincOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrNm = this.vndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldPodCd = this.oldPodCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.custCd = this.custCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.oldSlanCd = this.oldSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
