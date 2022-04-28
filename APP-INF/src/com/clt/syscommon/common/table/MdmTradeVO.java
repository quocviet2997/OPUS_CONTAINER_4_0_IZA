/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmTradeVO.java
*@FileTitle : MdmTradeVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.29
*@LastModifier : 최윤성
*@LastVersion : 1.0
* 2009.09.29 최윤성 
* 1.0 Creation
* 2010.06.28 CHOI.Y.S - TicketID : CHM-201004307, CHM-201004304, CHM-201004306
* - EAI_IF_ID 필드 관련 내역 추가
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
 * @author 최윤성
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class MdmTradeVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmTradeVO> models = new ArrayList<MdmTradeVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String trdNm = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String modiTrdCd = null;
	/* Column Info */
	private String stEffDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String vslTpCd = null;
	/* Column Info */
	private String endEffDt = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ofcCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fmContiCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String toContiCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String eaiIfId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmTradeVO() {}

	public MdmTradeVO(String ibflag, String pagerows, String trdCd, String trdNm, String vslTpCd, String fmContiCd, String toContiCd, String modiTrdCd, String ofcCd, String stEffDt, String endEffDt, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId) {
		this.updDt = updDt;
		this.trdNm = trdNm;
		this.deltFlg = deltFlg;
		this.modiTrdCd = modiTrdCd;
		this.stEffDt = stEffDt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.vslTpCd = vslTpCd;
		this.endEffDt = endEffDt;
		this.eaiEvntDt = eaiEvntDt;
		this.pagerows = pagerows;
		this.ofcCd = ofcCd;
		this.ibflag = ibflag;
		this.fmContiCd = fmContiCd;
		this.creUsrId = creUsrId;
		this.toContiCd = toContiCd;
		this.updUsrId = updUsrId;
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("trd_nm", getTrdNm());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("modi_trd_cd", getModiTrdCd());
		this.hashColumns.put("st_eff_dt", getStEffDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("vsl_tp_cd", getVslTpCd());
		this.hashColumns.put("end_eff_dt", getEndEffDt());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ofc_cd", getOfcCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("fm_conti_cd", getFmContiCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("to_conti_cd", getToContiCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("trd_nm", "trdNm");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("modi_trd_cd", "modiTrdCd");
		this.hashFields.put("st_eff_dt", "stEffDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("vsl_tp_cd", "vslTpCd");
		this.hashFields.put("end_eff_dt", "endEffDt");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ofc_cd", "ofcCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("fm_conti_cd", "fmContiCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("to_conti_cd", "toContiCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("eai_if_id", "eaiIfId");
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
	 * @return trdNm
	 */
	public String getTrdNm() {
		return this.trdNm;
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
	 * @return modiTrdCd
	 */
	public String getModiTrdCd() {
		return this.modiTrdCd;
	}
	
	/**
	 * Column Info
	 * @return stEffDt
	 */
	public String getStEffDt() {
		return this.stEffDt;
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
	 * @return vslTpCd
	 */
	public String getVslTpCd() {
		return this.vslTpCd;
	}
	
	/**
	 * Column Info
	 * @return endEffDt
	 */
	public String getEndEffDt() {
		return this.endEffDt;
	}
	
	/**
	 * Column Info
	 * @return eaiEvntDt
	 */
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
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
	 * @return fmContiCd
	 */
	public String getFmContiCd() {
		return this.fmContiCd;
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
	 * @return toContiCd
	 */
	public String getToContiCd() {
		return this.toContiCd;
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
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	
	
	/**
	 * Column Info
	 * @param trdNm
	 */
	public void setTrdNm(String trdNm) {
		this.trdNm = trdNm;
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
	 * @param modiTrdCd
	 */
	public void setModiTrdCd(String modiTrdCd) {
		this.modiTrdCd = modiTrdCd;
	}
	
	/**
	 * Column Info
	 * @param stEffDt
	 */
	public void setStEffDt(String stEffDt) {
		this.stEffDt = stEffDt;
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
	 * @param vslTpCd
	 */
	public void setVslTpCd(String vslTpCd) {
		this.vslTpCd = vslTpCd;
	}
	
	/**
	 * Column Info
	 * @param endEffDt
	 */
	public void setEndEffDt(String endEffDt) {
		this.endEffDt = endEffDt;
	}
	
	/**
	 * Column Info
	 * @param eaiEvntDt
	 */
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
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
	 * @param fmContiCd
	 */
	public void setFmContiCd(String fmContiCd) {
		this.fmContiCd = fmContiCd;
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
	 * @param toContiCd
	 */
	public void setToContiCd(String toContiCd) {
		this.toContiCd = toContiCd;
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
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTrdNm(JSPUtil.getParameter(request, "trd_nm", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setModiTrdCd(JSPUtil.getParameter(request, "modi_trd_cd", ""));
		setStEffDt(JSPUtil.getParameter(request, "st_eff_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setVslTpCd(JSPUtil.getParameter(request, "vsl_tp_cd", ""));
		setEndEffDt(JSPUtil.getParameter(request, "end_eff_dt", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOfcCd(JSPUtil.getParameter(request, "ofc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setFmContiCd(JSPUtil.getParameter(request, "fm_conti_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setToContiCd(JSPUtil.getParameter(request, "to_conti_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return MdmTradeVO[]
	 */
	public MdmTradeVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return MdmTradeVO[]
	 */
	public MdmTradeVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmTradeVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt     = (JSPUtil.getParameter(request, prefix	+ "upd_dt"     , length));
			String[] trdNm     = (JSPUtil.getParameter(request, prefix	+ "trd_nm"     , length));
			String[] deltFlg   = (JSPUtil.getParameter(request, prefix	+ "delt_flg"   , length));
			String[] modiTrdCd = (JSPUtil.getParameter(request, prefix	+ "modi_trd_cd", length));
			String[] stEffDt   = (JSPUtil.getParameter(request, prefix	+ "st_eff_dt"  , length));
			String[] creDt     = (JSPUtil.getParameter(request, prefix	+ "cre_dt"     , length));
			String[] trdCd     = (JSPUtil.getParameter(request, prefix	+ "trd_cd"     , length));
			String[] vslTpCd   = (JSPUtil.getParameter(request, prefix	+ "vsl_tp_cd"  , length));
			String[] endEffDt  = (JSPUtil.getParameter(request, prefix	+ "end_eff_dt" , length));
			String[] eaiEvntDt = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt", length));
			String[] pagerows  = (JSPUtil.getParameter(request, prefix	+ "pagerows"   , length));
			String[] ofcCd     = (JSPUtil.getParameter(request, prefix	+ "ofc_cd"     , length));
			String[] ibflag    = (JSPUtil.getParameter(request, prefix	+ "ibflag"     , length));
			String[] fmContiCd = (JSPUtil.getParameter(request, prefix	+ "fm_conti_cd", length));
			String[] creUsrId  = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id" , length));
			String[] toContiCd = (JSPUtil.getParameter(request, prefix	+ "to_conti_cd", length));
			String[] updUsrId  = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id" , length));
			String[] eaiIfId   = (JSPUtil.getParameter(request, prefix	+ "eai_if_id"  , length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmTradeVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (trdNm[i] != null)
					model.setTrdNm(trdNm[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (modiTrdCd[i] != null)
					model.setModiTrdCd(modiTrdCd[i]);
				if (stEffDt[i] != null)
					model.setStEffDt(stEffDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (vslTpCd[i] != null)
					model.setVslTpCd(vslTpCd[i]);
				if (endEffDt[i] != null)
					model.setEndEffDt(endEffDt[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ofcCd[i] != null)
					model.setOfcCd(ofcCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fmContiCd[i] != null)
					model.setFmContiCd(fmContiCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (toContiCd[i] != null)
					model.setToContiCd(toContiCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getMdmTradeVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return MdmTradeVO[]
	 */
	public MdmTradeVO[] getMdmTradeVOs(){
		MdmTradeVO[] vos = (MdmTradeVO[])models.toArray(new MdmTradeVO[models.size()]);
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
		this.updDt     = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdNm     = this.trdNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg   = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiTrdCd = this.modiTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stEffDt   = this.stEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt     = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd     = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTpCd   = this.vslTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.endEffDt  = this.endEffDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows  = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ofcCd     = this.ofcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag    = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmContiCd = this.fmContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId  = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toContiCd = this.toContiCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId  = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId   = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
