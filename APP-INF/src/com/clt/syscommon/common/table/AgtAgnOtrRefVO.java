/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : AgtAgnOtrRefVO.java
*@FileTitle : AgtAgnOtrRefVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.08.21
*@LastModifier : 이호진
*@LastVersion : 1.0
* 2009.08.21 이호진 
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

public class AgtAgnOtrRefVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<AgtAgnOtrRefVO> models = new ArrayList<AgtAgnOtrRefVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vndrCntCd = null;
	/* Column Info */
	private String otrInfoNo = null;
	/* Column Info */
	private String agnSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Column Info */
	private String agmtOfcCd = null;
	/* Column Info */
	private String otrRefDivCd = null;
	/* Column Info */
	private String otrLvlCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String agnAgmtSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String agnAgmtVerSeq = null;
	/* Column Info */
	private String agmtOfcCtyCd = null;
	/* Column Info */
	private String vndrSeq = null;
	/* Column Info */
	private String acTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String gubunValue = null;
	/* Column Info */
	private String infoNo = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public AgtAgnOtrRefVO() {}

	public AgtAgnOtrRefVO(String ibflag, String pagerows, String agmtOfcCd, String agmtOfcCtyCd, String agnAgmtSeq, String vndrCntCd, String vndrSeq, String agnAgmtVerSeq, String ioBndCd, String acTpCd, String agnSeq, String otrRefDivCd, String otrLvlCd, String otrInfoNo, String creUsrId, String creDt, String updUsrId, String updDt, String gubunValue, String infoNo) {
		this.updDt = updDt;
		this.vndrCntCd = vndrCntCd;
		this.otrInfoNo = otrInfoNo;
		this.agnSeq = agnSeq;
		this.creDt = creDt;
		this.ioBndCd = ioBndCd;
		this.agmtOfcCd = agmtOfcCd;
		this.otrRefDivCd = otrRefDivCd;
		this.otrLvlCd = otrLvlCd;
		this.pagerows = pagerows;
		this.agnAgmtSeq = agnAgmtSeq;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.agnAgmtVerSeq = agnAgmtVerSeq;
		this.agmtOfcCtyCd = agmtOfcCtyCd;
		this.vndrSeq = vndrSeq;
		this.acTpCd = acTpCd;
		this.updUsrId = updUsrId;
		this.gubunValue = gubunValue;
		this.infoNo = infoNo;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vndr_cnt_cd", getVndrCntCd());
		this.hashColumns.put("otr_info_no", getOtrInfoNo());
		this.hashColumns.put("agn_seq", getAgnSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("agmt_ofc_cd", getAgmtOfcCd());
		this.hashColumns.put("otr_ref_div_cd", getOtrRefDivCd());
		this.hashColumns.put("otr_lvl_cd", getOtrLvlCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("agn_agmt_seq", getAgnAgmtSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("agn_agmt_ver_seq", getAgnAgmtVerSeq());
		this.hashColumns.put("agmt_ofc_cty_cd", getAgmtOfcCtyCd());
		this.hashColumns.put("vndr_seq", getVndrSeq());
		this.hashColumns.put("ac_tp_cd", getAcTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("gubun_value", getGubunValue());
		this.hashColumns.put("info_no", getInfoNo());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vndr_cnt_cd", "vndrCntCd");
		this.hashFields.put("otr_info_no", "otrInfoNo");
		this.hashFields.put("agn_seq", "agnSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("agmt_ofc_cd", "agmtOfcCd");
		this.hashFields.put("otr_ref_div_cd", "otrRefDivCd");
		this.hashFields.put("otr_lvl_cd", "otrLvlCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("agn_agmt_seq", "agnAgmtSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("agn_agmt_ver_seq", "agnAgmtVerSeq");
		this.hashFields.put("agmt_ofc_cty_cd", "agmtOfcCtyCd");
		this.hashFields.put("vndr_seq", "vndrSeq");
		this.hashFields.put("ac_tp_cd", "acTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("gubun_value", "gubunValue");
		this.hashFields.put("info_no", "infoNo");
		return this.hashFields;
	}
	
	public String getInfoNo() {
    	return infoNo;
    }

	

	public String getGubunValue() {
    	return gubunValue;
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
	 * @return vndrCntCd
	 */
	public String getVndrCntCd() {
		return this.vndrCntCd;
	}
	
	/**
	 * Column Info
	 * @return otrInfoNo
	 */
	public String getOtrInfoNo() {
		return this.otrInfoNo;
	}
	
	/**
	 * Column Info
	 * @return agnSeq
	 */
	public String getAgnSeq() {
		return this.agnSeq;
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
	 * @return ioBndCd
	 */
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	
	/**
	 * Column Info
	 * @return agmtOfcCd
	 */
	public String getAgmtOfcCd() {
		return this.agmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @return otrRefDivCd
	 */
	public String getOtrRefDivCd() {
		return this.otrRefDivCd;
	}
	
	/**
	 * Column Info
	 * @return otrLvlCd
	 */
	public String getOtrLvlCd() {
		return this.otrLvlCd;
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
	 * @return agnAgmtSeq
	 */
	public String getAgnAgmtSeq() {
		return this.agnAgmtSeq;
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
	 * @return agnAgmtVerSeq
	 */
	public String getAgnAgmtVerSeq() {
		return this.agnAgmtVerSeq;
	}
	
	/**
	 * Column Info
	 * @return agmtOfcCtyCd
	 */
	public String getAgmtOfcCtyCd() {
		return this.agmtOfcCtyCd;
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
	 * @return acTpCd
	 */
	public String getAcTpCd() {
		return this.acTpCd;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	public void setInfoNo(String infoNo) {
    	this.infoNo = infoNo;
    }
	
	public void setGubunValue(String gubunValue) {
    	this.gubunValue = gubunValue;
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
	 * @param vndrCntCd
	 */
	public void setVndrCntCd(String vndrCntCd) {
		this.vndrCntCd = vndrCntCd;
	}
	
	/**
	 * Column Info
	 * @param otrInfoNo
	 */
	public void setOtrInfoNo(String otrInfoNo) {
		this.otrInfoNo = otrInfoNo;
	}
	
	/**
	 * Column Info
	 * @param agnSeq
	 */
	public void setAgnSeq(String agnSeq) {
		this.agnSeq = agnSeq;
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
	 * @param ioBndCd
	 */
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
	}
	
	/**
	 * Column Info
	 * @param agmtOfcCd
	 */
	public void setAgmtOfcCd(String agmtOfcCd) {
		this.agmtOfcCd = agmtOfcCd;
	}
	
	/**
	 * Column Info
	 * @param otrRefDivCd
	 */
	public void setOtrRefDivCd(String otrRefDivCd) {
		this.otrRefDivCd = otrRefDivCd;
	}
	
	/**
	 * Column Info
	 * @param otrLvlCd
	 */
	public void setOtrLvlCd(String otrLvlCd) {
		this.otrLvlCd = otrLvlCd;
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
	 * @param agnAgmtSeq
	 */
	public void setAgnAgmtSeq(String agnAgmtSeq) {
		this.agnAgmtSeq = agnAgmtSeq;
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
	 * @param agnAgmtVerSeq
	 */
	public void setAgnAgmtVerSeq(String agnAgmtVerSeq) {
		this.agnAgmtVerSeq = agnAgmtVerSeq;
	}
	
	/**
	 * Column Info
	 * @param agmtOfcCtyCd
	 */
	public void setAgmtOfcCtyCd(String agmtOfcCtyCd) {
		this.agmtOfcCtyCd = agmtOfcCtyCd;
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
	 * @param acTpCd
	 */
	public void setAcTpCd(String acTpCd) {
		this.acTpCd = acTpCd;
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
		setVndrCntCd(JSPUtil.getParameter(request, "vndr_cnt_cd", ""));
		setOtrInfoNo(JSPUtil.getParameter(request, "otr_info_no", ""));
		setAgnSeq(JSPUtil.getParameter(request, "agn_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setAgmtOfcCd(JSPUtil.getParameter(request, "agmt_ofc_cd", ""));
		setOtrRefDivCd(JSPUtil.getParameter(request, "otr_ref_div_cd", ""));
		setOtrLvlCd(JSPUtil.getParameter(request, "otr_lvl_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setAgnAgmtSeq(JSPUtil.getParameter(request, "agn_agmt_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setAgnAgmtVerSeq(JSPUtil.getParameter(request, "agn_agmt_ver_seq", ""));
		setAgmtOfcCtyCd(JSPUtil.getParameter(request, "agmt_ofc_cty_cd", ""));
		setVndrSeq(JSPUtil.getParameter(request, "vndr_seq", ""));
		setAcTpCd(JSPUtil.getParameter(request, "ac_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setGubunValue(JSPUtil.getParameter(request, "gubun_value", ""));
		setInfoNo(JSPUtil.getParameter(request, "info_no", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return AgtAgnOtrRefVO[]
	 */
	public AgtAgnOtrRefVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return AgtAgnOtrRefVO[]
	 */
	public AgtAgnOtrRefVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		AgtAgnOtrRefVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vndrCntCd = (JSPUtil.getParameter(request, prefix	+ "vndr_cnt_cd", length));
			String[] otrInfoNo = (JSPUtil.getParameter(request, prefix	+ "otr_info_no", length));
			String[] agnSeq = (JSPUtil.getParameter(request, prefix	+ "agn_seq", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd", length));
			String[] agmtOfcCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cd", length));
			String[] otrRefDivCd = (JSPUtil.getParameter(request, prefix	+ "otr_ref_div_cd", length));
			String[] otrLvlCd = (JSPUtil.getParameter(request, prefix	+ "otr_lvl_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] agnAgmtSeq = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_seq", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] agnAgmtVerSeq = (JSPUtil.getParameter(request, prefix	+ "agn_agmt_ver_seq", length));
			String[] agmtOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "agmt_ofc_cty_cd", length));
			String[] vndrSeq = (JSPUtil.getParameter(request, prefix	+ "vndr_seq", length));
			String[] acTpCd = (JSPUtil.getParameter(request, prefix	+ "ac_tp_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] gubunValue = (JSPUtil.getParameter(request, prefix	+ "gubun_value", length));
			String[] infoNo = (JSPUtil.getParameter(request, prefix	+ "info_no", length));
			
			for (int i = 0; i < length; i++) {
				model = new AgtAgnOtrRefVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vndrCntCd[i] != null)
					model.setVndrCntCd(vndrCntCd[i]);
				if (otrInfoNo[i] != null)
					model.setOtrInfoNo(otrInfoNo[i]);
				if (agnSeq[i] != null)
					model.setAgnSeq(agnSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (agmtOfcCd[i] != null)
					model.setAgmtOfcCd(agmtOfcCd[i]);
				if (otrRefDivCd[i] != null)
					model.setOtrRefDivCd(otrRefDivCd[i]);
				if (otrLvlCd[i] != null)
					model.setOtrLvlCd(otrLvlCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (agnAgmtSeq[i] != null)
					model.setAgnAgmtSeq(agnAgmtSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (agnAgmtVerSeq[i] != null)
					model.setAgnAgmtVerSeq(agnAgmtVerSeq[i]);
				if (agmtOfcCtyCd[i] != null)
					model.setAgmtOfcCtyCd(agmtOfcCtyCd[i]);
				if (vndrSeq[i] != null)
					model.setVndrSeq(vndrSeq[i]);
				if (acTpCd[i] != null)
					model.setAcTpCd(acTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (gubunValue[i] != null)
					model.setGubunValue(gubunValue[i]);
				if (infoNo[i] != null)
					model.setInfoNo(infoNo[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getAgtAgnOtrRefVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return AgtAgnOtrRefVO[]
	 */
	public AgtAgnOtrRefVO[] getAgtAgnOtrRefVOs(){
		AgtAgnOtrRefVO[] vos = (AgtAgnOtrRefVO[])models.toArray(new AgtAgnOtrRefVO[models.size()]);
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
		this.vndrCntCd = this.vndrCntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrInfoNo = this.otrInfoNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnSeq = this.agnSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCd = this.agmtOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrRefDivCd = this.otrRefDivCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.otrLvlCd = this.otrLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtSeq = this.agnAgmtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agnAgmtVerSeq = this.agnAgmtVerSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.agmtOfcCtyCd = this.agmtOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vndrSeq = this.vndrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.acTpCd = this.acTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gubunValue = this.gubunValue .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.infoNo = this.infoNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
