/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgHldWdVO.java
*@FileTitle : BkgHldWdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.01
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2009.09.01 박미옥 
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
 * @author 박미옥
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgHldWdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgHldWdVO> models = new ArrayList<BkgHldWdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String hldNtcTpCd = null;
	/* Column Info */
	private String addrCtnt = null;
	/* Column Info */
	private String eclzOblFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String podCd = null;
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String sndOfcCntcCtnt = null;
	/* Column Info */
	private String autoNtcFlg = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgHldWdVO() {}

	public BkgHldWdVO(String ibflag, String pagerows, String ofcCd, String podCd, String hldNtcTpCd, String eclzOblFlg, String addrCtnt, String sndOfcCntcCtnt, String creUsrId, String creDt, String updUsrId, String updDt, String autoNtcFlg) {
		this.updDt = updDt;
		this.hldNtcTpCd = hldNtcTpCd;
		this.addrCtnt = addrCtnt;
		this.eclzOblFlg = eclzOblFlg;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.podCd = podCd;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.sndOfcCntcCtnt = sndOfcCntcCtnt;
		this.autoNtcFlg = autoNtcFlg;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("hld_ntc_tp_cd", getHldNtcTpCd());
		this.hashColumns.put("addr_ctnt", getAddrCtnt());
		this.hashColumns.put("eclz_obl_flg", getEclzOblFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("pod_cd", getPodCd());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("snd_ofc_cntc_ctnt", getSndOfcCntcCtnt());
		this.hashColumns.put("auto_ntc_flg", getAutoNtcFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("hld_ntc_tp_cd", "hldNtcTpCd");
		this.hashFields.put("addr_ctnt", "addrCtnt");
		this.hashFields.put("eclz_obl_flg", "eclzOblFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("pod_cd", "podCd");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("snd_ofc_cntc_ctnt", "sndOfcCntcCtnt");
		this.hashFields.put("auto_ntc_flg", "autoNtcFlg");
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
	 * @return hldNtcTpCd
	 */
	public String getHldNtcTpCd() {
		return this.hldNtcTpCd;
	}
	
	/**
	 * Column Info
	 * @return addrCtnt
	 */
	public String getAddrCtnt() {
		return this.addrCtnt;
	}
	
	/**
	 * Column Info
	 * @return eclzOblFlg
	 */
	public String getEclzOblFlg() {
		return this.eclzOblFlg;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return ofcCd
	 */
	public String getOfcCd() {
		return this.ofcCd;
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
	 * @return sndOfcCntcCtnt
	 */
	public String getSndOfcCntcCtnt() {
		return this.sndOfcCntcCtnt;
	}
	
	/**
	 * Column Info
	 * @return autoNtcFlg
	 */
	public String getAutoNtcFlg() {
		return this.autoNtcFlg;
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
	 * @param hldNtcTpCd
	 */
	public void setHldNtcTpCd(String hldNtcTpCd) {
		this.hldNtcTpCd = hldNtcTpCd;
	}
	
	/**
	 * Column Info
	 * @param addrCtnt
	 */
	public void setAddrCtnt(String addrCtnt) {
		this.addrCtnt = addrCtnt;
	}
	
	/**
	 * Column Info
	 * @param eclzOblFlg
	 */
	public void setEclzOblFlg(String eclzOblFlg) {
		this.eclzOblFlg = eclzOblFlg;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param ofcCd
	 */
	public void setOfcCd(String ofcCd) {
		this.ofcCd = ofcCd;
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
	 * @param sndOfcCntcCtnt
	 */
	public void setSndOfcCntcCtnt(String sndOfcCntcCtnt) {
		this.sndOfcCntcCtnt = sndOfcCntcCtnt;
	}
	
	/**
	 * Column Info
	 * @param autoNtcFlg
	 */
	public void setAutoNtcFlg(String autoNtcFlg) {
		this.autoNtcFlg = autoNtcFlg;
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
		setHldNtcTpCd(JSPUtil.getParameter(request, "hld_ntc_tp_cd", ""));
		setAddrCtnt(JSPUtil.getParameter(request, "addr_ctnt", ""));
		setEclzOblFlg(JSPUtil.getParameter(request, "eclz_obl_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPodCd(JSPUtil.getParameter(request, "pod_cd", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSndOfcCntcCtnt(JSPUtil.getParameter(request, "snd_ofc_cntc_ctnt", ""));
		setAutoNtcFlg(JSPUtil.getParameter(request, "auto_ntc_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgHldWdVO[]
	 */
	public BkgHldWdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgHldWdVO[]
	 */
	public BkgHldWdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgHldWdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] hldNtcTpCd = (JSPUtil.getParameter(request, prefix	+ "hld_ntc_tp_cd", length));
			String[] addrCtnt = (JSPUtil.getParameter(request, prefix	+ "addr_ctnt", length));
			String[] eclzOblFlg = (JSPUtil.getParameter(request, prefix	+ "eclz_obl_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] podCd = (JSPUtil.getParameter(request, prefix	+ "pod_cd", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] sndOfcCntcCtnt = (JSPUtil.getParameter(request, prefix	+ "snd_ofc_cntc_ctnt", length));
			String[] autoNtcFlg = (JSPUtil.getParameter(request, prefix	+ "auto_ntc_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgHldWdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (hldNtcTpCd[i] != null)
					model.setHldNtcTpCd(hldNtcTpCd[i]);
				if (addrCtnt[i] != null)
					model.setAddrCtnt(addrCtnt[i]);
				if (eclzOblFlg[i] != null)
					model.setEclzOblFlg(eclzOblFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (podCd[i] != null)
					model.setPodCd(podCd[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (sndOfcCntcCtnt[i] != null)
					model.setSndOfcCntcCtnt(sndOfcCntcCtnt[i]);
				if (autoNtcFlg[i] != null)
					model.setAutoNtcFlg(autoNtcFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgHldWdVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgHldWdVO[]
	 */
	public BkgHldWdVO[] getBkgHldWdVOs(){
		BkgHldWdVO[] vos = (BkgHldWdVO[])models.toArray(new BkgHldWdVO[models.size()]);
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
		this.hldNtcTpCd = this.hldNtcTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.addrCtnt = this.addrCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eclzOblFlg = this.eclzOblFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.podCd = this.podCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndOfcCntcCtnt = this.sndOfcCntcCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoNtcFlg = this.autoNtcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
