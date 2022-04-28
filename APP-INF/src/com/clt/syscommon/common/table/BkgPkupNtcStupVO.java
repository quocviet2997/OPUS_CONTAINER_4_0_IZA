/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgPkupNtcStupVO.java
*@FileTitle : BkgPkupNtcStupVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.12
*@LastModifier : 박미옥
*@LastVersion : 1.0
* 2009.06.12 박미옥 
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

public class BkgPkupNtcStupVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgPkupNtcStupVO> models = new ArrayList<BkgPkupNtcStupVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String eachFocNtcFlg = null;
	/* Column Info */
	private String pkupNtcSndTpCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String delCd = null;
	/* Column Info */
	private String pkupNtcSeq = null;
	/* Column Info */
	private String focClrRmkStupFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String autoNtcFlg = null;
	/* Column Info */
	private String hdTitCtnt = null;
	/* Column Info */
	private String eclzOblCpyFlg = null;
	/* Column Info */
	private String trkrNtcFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String autoNtcYdFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgPkupNtcStupVO() {}

	public BkgPkupNtcStupVO(String ibflag, String pagerows, String pkupNtcSeq, String pkupNtcSndTpCd, String ofcCd, String delCd, String autoNtcFlg, String eachFocNtcFlg, String trkrNtcFlg, String eclzOblCpyFlg, String focClrRmkStupFlg, String hdTitCtnt, String creUsrId, String creDt, String updUsrId, String updDt, String autoNtcYdFlg) {
		this.updDt = updDt;
		this.eachFocNtcFlg = eachFocNtcFlg;
		this.pkupNtcSndTpCd = pkupNtcSndTpCd;
		this.creDt = creDt;
		this.delCd = delCd;
		this.pkupNtcSeq = pkupNtcSeq;
		this.focClrRmkStupFlg = focClrRmkStupFlg;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.autoNtcFlg = autoNtcFlg;
		this.hdTitCtnt = hdTitCtnt;
		this.eclzOblCpyFlg = eclzOblCpyFlg;
		this.trkrNtcFlg = trkrNtcFlg;
		this.updUsrId = updUsrId;
		this.autoNtcYdFlg = autoNtcYdFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("each_foc_ntc_flg", getEachFocNtcFlg());
		this.hashColumns.put("pkup_ntc_snd_tp_cd", getPkupNtcSndTpCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("del_cd", getDelCd());
		this.hashColumns.put("pkup_ntc_seq", getPkupNtcSeq());
		this.hashColumns.put("foc_clr_rmk_stup_flg", getFocClrRmkStupFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("auto_ntc_flg", getAutoNtcFlg());
		this.hashColumns.put("hd_tit_ctnt", getHdTitCtnt());
		this.hashColumns.put("eclz_obl_cpy_flg", getEclzOblCpyFlg());
		this.hashColumns.put("trkr_ntc_flg", getTrkrNtcFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("auto_ntc_yd_flg", getAutoNtcYdFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("each_foc_ntc_flg", "eachFocNtcFlg");
		this.hashFields.put("pkup_ntc_snd_tp_cd", "pkupNtcSndTpCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("del_cd", "delCd");
		this.hashFields.put("pkup_ntc_seq", "pkupNtcSeq");
		this.hashFields.put("foc_clr_rmk_stup_flg", "focClrRmkStupFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("auto_ntc_flg", "autoNtcFlg");
		this.hashFields.put("hd_tit_ctnt", "hdTitCtnt");
		this.hashFields.put("eclz_obl_cpy_flg", "eclzOblCpyFlg");
		this.hashFields.put("trkr_ntc_flg", "trkrNtcFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("auto_ntc_yd_flg", "autoNtcYdFlg");
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
	 * @return eachFocNtcFlg
	 */
	public String getEachFocNtcFlg() {
		return this.eachFocNtcFlg;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcSndTpCd
	 */
	public String getPkupNtcSndTpCd() {
		return this.pkupNtcSndTpCd;
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
	 * @return delCd
	 */
	public String getDelCd() {
		return this.delCd;
	}
	
	/**
	 * Column Info
	 * @return pkupNtcSeq
	 */
	public String getPkupNtcSeq() {
		return this.pkupNtcSeq;
	}
	
	/**
	 * Column Info
	 * @return focClrRmkStupFlg
	 */
	public String getFocClrRmkStupFlg() {
		return this.focClrRmkStupFlg;
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
	 * @return autoNtcFlg
	 */
	public String getAutoNtcFlg() {
		return this.autoNtcFlg;
	}
	
	/**
	 * Column Info
	 * @return hdTitCtnt
	 */
	public String getHdTitCtnt() {
		return this.hdTitCtnt;
	}
	
	/**
	 * Column Info
	 * @return eclzOblCpyFlg
	 */
	public String getEclzOblCpyFlg() {
		return this.eclzOblCpyFlg;
	}
	
	/**
	 * Column Info
	 * @return trkrNtcFlg
	 */
	public String getTrkrNtcFlg() {
		return this.trkrNtcFlg;
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
	 * @return autoNtcYdFlg
	 */
	public String getAutoNtcYdFlg() {
		return this.autoNtcYdFlg;
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
	 * @param eachFocNtcFlg
	 */
	public void setEachFocNtcFlg(String eachFocNtcFlg) {
		this.eachFocNtcFlg = eachFocNtcFlg;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcSndTpCd
	 */
	public void setPkupNtcSndTpCd(String pkupNtcSndTpCd) {
		this.pkupNtcSndTpCd = pkupNtcSndTpCd;
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
	 * @param delCd
	 */
	public void setDelCd(String delCd) {
		this.delCd = delCd;
	}
	
	/**
	 * Column Info
	 * @param pkupNtcSeq
	 */
	public void setPkupNtcSeq(String pkupNtcSeq) {
		this.pkupNtcSeq = pkupNtcSeq;
	}
	
	/**
	 * Column Info
	 * @param focClrRmkStupFlg
	 */
	public void setFocClrRmkStupFlg(String focClrRmkStupFlg) {
		this.focClrRmkStupFlg = focClrRmkStupFlg;
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
	 * @param autoNtcFlg
	 */
	public void setAutoNtcFlg(String autoNtcFlg) {
		this.autoNtcFlg = autoNtcFlg;
	}
	
	/**
	 * Column Info
	 * @param hdTitCtnt
	 */
	public void setHdTitCtnt(String hdTitCtnt) {
		this.hdTitCtnt = hdTitCtnt;
	}
	
	/**
	 * Column Info
	 * @param eclzOblCpyFlg
	 */
	public void setEclzOblCpyFlg(String eclzOblCpyFlg) {
		this.eclzOblCpyFlg = eclzOblCpyFlg;
	}
	
	/**
	 * Column Info
	 * @param trkrNtcFlg
	 */
	public void setTrkrNtcFlg(String trkrNtcFlg) {
		this.trkrNtcFlg = trkrNtcFlg;
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
	 * @param autoNtcYdFlg
	 */
	public void setAutoNtcYdFlg(String autoNtcYdFlg) {
		this.autoNtcYdFlg = autoNtcYdFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setEachFocNtcFlg(JSPUtil.getParameter(request, "each_foc_ntc_flg", ""));
		setPkupNtcSndTpCd(JSPUtil.getParameter(request, "pkup_ntc_snd_tp_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDelCd(JSPUtil.getParameter(request, "del_cd", ""));
		setPkupNtcSeq(JSPUtil.getParameter(request, "pkup_ntc_seq", ""));
		setFocClrRmkStupFlg(JSPUtil.getParameter(request, "foc_clr_rmk_stup_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setAutoNtcFlg(JSPUtil.getParameter(request, "auto_ntc_flg", ""));
		setHdTitCtnt(JSPUtil.getParameter(request, "hd_tit_ctnt", ""));
		setEclzOblCpyFlg(JSPUtil.getParameter(request, "eclz_obl_cpy_flg", ""));
		setTrkrNtcFlg(JSPUtil.getParameter(request, "trkr_ntc_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAutoNtcYdFlg(JSPUtil.getParameter(request, "auto_ntc_yd_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgPkupNtcStupVO[]
	 */
	public BkgPkupNtcStupVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgPkupNtcStupVO[]
	 */
	public BkgPkupNtcStupVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgPkupNtcStupVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] eachFocNtcFlg = (JSPUtil.getParameter(request, prefix	+ "each_foc_ntc_flg", length));
			String[] pkupNtcSndTpCd = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_snd_tp_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] delCd = (JSPUtil.getParameter(request, prefix	+ "del_cd", length));
			String[] pkupNtcSeq = (JSPUtil.getParameter(request, prefix	+ "pkup_ntc_seq", length));
			String[] focClrRmkStupFlg = (JSPUtil.getParameter(request, prefix	+ "foc_clr_rmk_stup_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ofcCd = (JSPUtil.getParameter(request, prefix	+ "ofc_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] autoNtcFlg = (JSPUtil.getParameter(request, prefix	+ "auto_ntc_flg", length));
			String[] hdTitCtnt = (JSPUtil.getParameter(request, prefix	+ "hd_tit_ctnt", length));
			String[] eclzOblCpyFlg = (JSPUtil.getParameter(request, prefix	+ "eclz_obl_cpy_flg", length));
			String[] trkrNtcFlg = (JSPUtil.getParameter(request, prefix	+ "trkr_ntc_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] autoNtcYdFlg = (JSPUtil.getParameter(request, prefix	+ "auto_ntc_yd_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgPkupNtcStupVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (eachFocNtcFlg[i] != null)
					model.setEachFocNtcFlg(eachFocNtcFlg[i]);
				if (pkupNtcSndTpCd[i] != null)
					model.setPkupNtcSndTpCd(pkupNtcSndTpCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (delCd[i] != null)
					model.setDelCd(delCd[i]);
				if (pkupNtcSeq[i] != null)
					model.setPkupNtcSeq(pkupNtcSeq[i]);
				if (focClrRmkStupFlg[i] != null)
					model.setFocClrRmkStupFlg(focClrRmkStupFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (autoNtcFlg[i] != null)
					model.setAutoNtcFlg(autoNtcFlg[i]);
				if (hdTitCtnt[i] != null)
					model.setHdTitCtnt(hdTitCtnt[i]);
				if (eclzOblCpyFlg[i] != null)
					model.setEclzOblCpyFlg(eclzOblCpyFlg[i]);
				if (trkrNtcFlg[i] != null)
					model.setTrkrNtcFlg(trkrNtcFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (autoNtcYdFlg[i] != null)
					model.setAutoNtcYdFlg(autoNtcYdFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgPkupNtcStupVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgPkupNtcStupVO[]
	 */
	public BkgPkupNtcStupVO[] getBkgPkupNtcStupVOs(){
		BkgPkupNtcStupVO[] vos = (BkgPkupNtcStupVO[])models.toArray(new BkgPkupNtcStupVO[models.size()]);
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
		this.eachFocNtcFlg = this.eachFocNtcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcSndTpCd = this.pkupNtcSndTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.delCd = this.delCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pkupNtcSeq = this.pkupNtcSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.focClrRmkStupFlg = this.focClrRmkStupFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoNtcFlg = this.autoNtcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hdTitCtnt = this.hdTitCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eclzOblCpyFlg = this.eclzOblCpyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trkrNtcFlg = this.trkrNtcFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.autoNtcYdFlg = this.autoNtcYdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
