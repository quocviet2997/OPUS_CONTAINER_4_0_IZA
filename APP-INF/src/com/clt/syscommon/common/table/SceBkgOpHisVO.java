/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : SceBkgOpHisVO.java
*@FileTitle : SceBkgOpHisVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.10.15
*@LastModifier : 김인수
*@LastVersion : 1.0
* 2009.10.15 김인수 
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
 * @author 김인수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class SceBkgOpHisVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<SceBkgOpHisVO> models = new ArrayList<SceBkgOpHisVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String contiCd = null;
	/* Column Info */
	private String troSubSeq = null;
	/* Column Info */
	private String bkgRcvNo = null;
	/* Column Info */
	private String troSeq = null;
	/* Column Info */
	private String bkgEvntRmk = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String bkgEvntDt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String prtFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String bkgRcvDt = null;
	/* Column Info */
	private String pctlNo = null;
	/* Column Info */
	private String bkgEvntTpCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String bkgNo = null;
	/* Column Info */
	private String cntrNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public SceBkgOpHisVO() {}

	public SceBkgOpHisVO(String ibflag, String pagerows, String bkgRcvDt, String bkgRcvNo, String bkgNo, String bkgEvntDt, String cntrNo, String bkgEvntTpCd, String bkgEvntRmk, String pctlNo, String troSeq, String troSubSeq, String ioBndCd, String contiCd, String prtFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.contiCd = contiCd;
		this.troSubSeq = troSubSeq;
		this.bkgRcvNo = bkgRcvNo;
		this.troSeq = troSeq;
		this.bkgEvntRmk = bkgEvntRmk;
		this.creDt = creDt;
		this.bkgEvntDt = bkgEvntDt;
		this.ioBndCd = ioBndCd;
		this.prtFlg = prtFlg;
		this.pagerows = pagerows;
		this.bkgRcvDt = bkgRcvDt;
		this.pctlNo = pctlNo;
		this.bkgEvntTpCd = bkgEvntTpCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.bkgNo = bkgNo;
		this.cntrNo = cntrNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("conti_cd", getContiCd());
		this.hashColumns.put("tro_sub_seq", getTroSubSeq());
		this.hashColumns.put("bkg_rcv_no", getBkgRcvNo());
		this.hashColumns.put("tro_seq", getTroSeq());
		this.hashColumns.put("bkg_evnt_rmk", getBkgEvntRmk());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("bkg_evnt_dt", getBkgEvntDt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("prt_flg", getPrtFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("bkg_rcv_dt", getBkgRcvDt());
		this.hashColumns.put("pctl_no", getPctlNo());
		this.hashColumns.put("bkg_evnt_tp_cd", getBkgEvntTpCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("bkg_no", getBkgNo());
		this.hashColumns.put("cntr_no", getCntrNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("conti_cd", "contiCd");
		this.hashFields.put("tro_sub_seq", "troSubSeq");
		this.hashFields.put("bkg_rcv_no", "bkgRcvNo");
		this.hashFields.put("tro_seq", "troSeq");
		this.hashFields.put("bkg_evnt_rmk", "bkgEvntRmk");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("bkg_evnt_dt", "bkgEvntDt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("prt_flg", "prtFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("bkg_rcv_dt", "bkgRcvDt");
		this.hashFields.put("pctl_no", "pctlNo");
		this.hashFields.put("bkg_evnt_tp_cd", "bkgEvntTpCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("bkg_no", "bkgNo");
		this.hashFields.put("cntr_no", "cntrNo");
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
	 * @return contiCd
	 */
	public String getContiCd() {
		return this.contiCd;
	}
	
	/**
	 * Column Info
	 * @return troSubSeq
	 */
	public String getTroSubSeq() {
		return this.troSubSeq;
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
	 * @return troSeq
	 */
	public String getTroSeq() {
		return this.troSeq;
	}
	
	/**
	 * Column Info
	 * @return bkgEvntRmk
	 */
	public String getBkgEvntRmk() {
		return this.bkgEvntRmk;
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
	 * @return bkgEvntDt
	 */
	public String getBkgEvntDt() {
		return this.bkgEvntDt;
	}
	
	/**
	 * Column Info
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return prtFlg
	 */
	public String getPrtFlg() {
		return this.prtFlg;
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
	 * @return bkgRcvDt
	 */
	public String getBkgRcvDt() {
		return this.bkgRcvDt;
	}
	
	/**
	 * Column Info
	 * @return pctlNo
	 */
	public String getPctlNo() {
		return this.pctlNo;
	}
	
	/**
	 * Column Info
	 * @return bkgEvntTpCd
	 */
	public String getBkgEvntTpCd() {
		return this.bkgEvntTpCd;
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
	 * @return bkgNo
	 */
	public String getBkgNo() {
		return this.bkgNo;
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
	 * @param contiCd
	 */
	public void setContiCd(String contiCd) {
		this.contiCd = contiCd;
	}
	
	/**
	 * Column Info
	 * @param troSubSeq
	 */
	public void setTroSubSeq(String troSubSeq) {
		this.troSubSeq = troSubSeq;
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
	 * @param troSeq
	 */
	public void setTroSeq(String troSeq) {
		this.troSeq = troSeq;
	}
	
	/**
	 * Column Info
	 * @param bkgEvntRmk
	 */
	public void setBkgEvntRmk(String bkgEvntRmk) {
		this.bkgEvntRmk = bkgEvntRmk;
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
	 * @param bkgEvntDt
	 */
	public void setBkgEvntDt(String bkgEvntDt) {
		this.bkgEvntDt = bkgEvntDt;
	}
	
	/**
	 * Column Info
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param prtFlg
	 */
	public void setPrtFlg(String prtFlg) {
		this.prtFlg = prtFlg;
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
	 * @param bkgRcvDt
	 */
	public void setBkgRcvDt(String bkgRcvDt) {
		this.bkgRcvDt = bkgRcvDt;
	}
	
	/**
	 * Column Info
	 * @param pctlNo
	 */
	public void setPctlNo(String pctlNo) {
		this.pctlNo = pctlNo;
	}
	
	/**
	 * Column Info
	 * @param bkgEvntTpCd
	 */
	public void setBkgEvntTpCd(String bkgEvntTpCd) {
		this.bkgEvntTpCd = bkgEvntTpCd;
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
	 * @param bkgNo
	 */
	public void setBkgNo(String bkgNo) {
		this.bkgNo = bkgNo;
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
		setContiCd(JSPUtil.getParameter(request, "conti_cd", ""));
		setTroSubSeq(JSPUtil.getParameter(request, "tro_sub_seq", ""));
		setBkgRcvNo(JSPUtil.getParameter(request, "bkg_rcv_no", ""));
		setTroSeq(JSPUtil.getParameter(request, "tro_seq", ""));
		setBkgEvntRmk(JSPUtil.getParameter(request, "bkg_evnt_rmk", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setBkgEvntDt(JSPUtil.getParameter(request, "bkg_evnt_dt", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setPrtFlg(JSPUtil.getParameter(request, "prt_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setBkgRcvDt(JSPUtil.getParameter(request, "bkg_rcv_dt", ""));
		setPctlNo(JSPUtil.getParameter(request, "pctl_no", ""));
		setBkgEvntTpCd(JSPUtil.getParameter(request, "bkg_evnt_tp_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setBkgNo(JSPUtil.getParameter(request, "bkg_no", ""));
		setCntrNo(JSPUtil.getParameter(request, "cntr_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return SceBkgOpHisVO[]
	 */
	public SceBkgOpHisVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return SceBkgOpHisVO[]
	 */
	public SceBkgOpHisVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		SceBkgOpHisVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] contiCd = (JSPUtil.getParameter(request, prefix	+ "conti_cd", length));
			String[] troSubSeq = (JSPUtil.getParameter(request, prefix	+ "tro_sub_seq", length));
			String[] bkgRcvNo = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_no", length));
			String[] troSeq = (JSPUtil.getParameter(request, prefix	+ "tro_seq", length));
			String[] bkgEvntRmk = (JSPUtil.getParameter(request, prefix	+ "bkg_evnt_rmk", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] bkgEvntDt = (JSPUtil.getParameter(request, prefix	+ "bkg_evnt_dt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] prtFlg = (JSPUtil.getParameter(request, prefix	+ "prt_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] bkgRcvDt = (JSPUtil.getParameter(request, prefix	+ "bkg_rcv_dt", length));
			String[] pctlNo = (JSPUtil.getParameter(request, prefix	+ "pctl_no", length));
			String[] bkgEvntTpCd = (JSPUtil.getParameter(request, prefix	+ "bkg_evnt_tp_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] bkgNo = (JSPUtil.getParameter(request, prefix	+ "bkg_no", length));
			String[] cntrNo = (JSPUtil.getParameter(request, prefix	+ "cntr_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new SceBkgOpHisVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (contiCd[i] != null)
					model.setContiCd(contiCd[i]);
				if (troSubSeq[i] != null)
					model.setTroSubSeq(troSubSeq[i]);
				if (bkgRcvNo[i] != null)
					model.setBkgRcvNo(bkgRcvNo[i]);
				if (troSeq[i] != null)
					model.setTroSeq(troSeq[i]);
				if (bkgEvntRmk[i] != null)
					model.setBkgEvntRmk(bkgEvntRmk[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (bkgEvntDt[i] != null)
					model.setBkgEvntDt(bkgEvntDt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (prtFlg[i] != null)
					model.setPrtFlg(prtFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (bkgRcvDt[i] != null)
					model.setBkgRcvDt(bkgRcvDt[i]);
				if (pctlNo[i] != null)
					model.setPctlNo(pctlNo[i]);
				if (bkgEvntTpCd[i] != null)
					model.setBkgEvntTpCd(bkgEvntTpCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (bkgNo[i] != null)
					model.setBkgNo(bkgNo[i]);
				if (cntrNo[i] != null)
					model.setCntrNo(cntrNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getSceBkgOpHisVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return SceBkgOpHisVO[]
	 */
	public SceBkgOpHisVO[] getSceBkgOpHisVOs(){
		SceBkgOpHisVO[] vos = (SceBkgOpHisVO[])models.toArray(new SceBkgOpHisVO[models.size()]);
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
		this.contiCd = this.contiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troSubSeq = this.troSubSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvNo = this.bkgRcvNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.troSeq = this.troSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEvntRmk = this.bkgEvntRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEvntDt = this.bkgEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prtFlg = this.prtFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgRcvDt = this.bkgRcvDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pctlNo = this.pctlNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgEvntTpCd = this.bkgEvntTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bkgNo = this.bkgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrNo = this.cntrNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
