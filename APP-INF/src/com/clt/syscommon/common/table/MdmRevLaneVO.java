/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmRevLaneVO.java
*@FileTitle : MdmRevLaneVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.04
*@LastModifier : 김세일
*@LastVersion : 1.0
* 2009.05.04 김세일 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 김세일
 * @since J2EE 1.5
 */

public class MdmRevLaneVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmRevLaneVO> models = new ArrayList<MdmRevLaneVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String modiRlaneCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vslTpCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String repTrdCd = null;
	/* Column Info */
	private String vslSlanCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String rlaneNm = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String eaiIfId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmRevLaneVO() {}

	public MdmRevLaneVO(String ibflag, String pagerows, String rlaneCd, String rlaneNm, String vslTpCd, String repTrdCd, String vslSlanCd, String modiRlaneCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String eaiIfId) {
		this.updDt = updDt;
		this.modiRlaneCd = modiRlaneCd;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.vslTpCd = vslTpCd;
		this.rlaneCd = rlaneCd;
		this.eaiEvntDt = eaiEvntDt;
		this.repTrdCd = repTrdCd;
		this.vslSlanCd = vslSlanCd;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.rlaneNm = rlaneNm;
		this.updUsrId = updUsrId;
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("modi_rlane_cd", getModiRlaneCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vsl_tp_cd", getVslTpCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("rep_trd_cd", getRepTrdCd());
		this.hashColumns.put("vsl_slan_cd", getVslSlanCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("rlane_nm", getRlaneNm());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("modi_rlane_cd", "modiRlaneCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vsl_tp_cd", "vslTpCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("rep_trd_cd", "repTrdCd");
		this.hashFields.put("vsl_slan_cd", "vslSlanCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("rlane_nm", "rlaneNm");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("eai_if_id", "eaiIfId");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getModiRlaneCd() {
		return this.modiRlaneCd;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getVslTpCd() {
		return this.vslTpCd;
	}
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	public String getRepTrdCd() {
		return this.repTrdCd;
	}
	public String getVslSlanCd() {
		return this.vslSlanCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getRlaneNm() {
		return this.rlaneNm;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	
	/**
	 * Column Info
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setModiRlaneCd(String modiRlaneCd) {
		this.modiRlaneCd = modiRlaneCd;
		//this.modiRlaneCd=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setVslTpCd(String vslTpCd) {
		this.vslTpCd = vslTpCd;
		//this.vslTpCd=true;
	}
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
		//this.rlaneCd=true;
	}
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
		//this.eaiEvntDt=true;
	}
	public void setRepTrdCd(String repTrdCd) {
		this.repTrdCd = repTrdCd;
		//this.repTrdCd=true;
	}
	public void setVslSlanCd(String vslSlanCd) {
		this.vslSlanCd = vslSlanCd;
		//this.vslSlanCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setRlaneNm(String rlaneNm) {
		this.rlaneNm = rlaneNm;
		//this.rlaneNm=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	
	/**
	 * Column Info
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setModiRlaneCd(JSPUtil.getParameter(request, "modi_rlane_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setVslTpCd(JSPUtil.getParameter(request, "vsl_tp_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setRepTrdCd(JSPUtil.getParameter(request, "rep_trd_cd", ""));
		setVslSlanCd(JSPUtil.getParameter(request, "vsl_slan_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setRlaneNm(JSPUtil.getParameter(request, "rlane_nm", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
	}

	public MdmRevLaneVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public MdmRevLaneVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmRevLaneVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt       = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim()       , length));
			String[] modiRlaneCd = (JSPUtil.getParameter(request, prefix	+ "modi_rlane_cd".trim(), length));
			String[] deltFlg     = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim()     , length));
			String[] creDt       = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim()       , length));
			String[] vslTpCd     = (JSPUtil.getParameter(request, prefix	+ "vsl_tp_cd".trim()    , length));
			String[] rlaneCd     = (JSPUtil.getParameter(request, prefix	+ "rlane_cd".trim()     , length));
			String[] eaiEvntDt   = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim()  , length));
			String[] repTrdCd    = (JSPUtil.getParameter(request, prefix	+ "rep_trd_cd".trim()   , length));
			String[] vslSlanCd   = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_cd".trim()  , length));
			String[] pagerows    = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim()     , length));
			String[] ibflag      = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim()       , length));
			String[] creUsrId    = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim()   , length));
			String[] rlaneNm     = (JSPUtil.getParameter(request, prefix	+ "rlane_nm".trim()     , length));
			String[] updUsrId    = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim()   , length));
			String[] eaiIfId     = (JSPUtil.getParameter(request, prefix	+ "eai_if_id".trim()    , length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmRevLaneVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (modiRlaneCd[i] != null)
					model.setModiRlaneCd(modiRlaneCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vslTpCd[i] != null)
					model.setVslTpCd(vslTpCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (repTrdCd[i] != null)
					model.setRepTrdCd(repTrdCd[i]);
				if (vslSlanCd[i] != null)
					model.setVslSlanCd(vslSlanCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (rlaneNm[i] != null)
					model.setRlaneNm(rlaneNm[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getMdmRevLaneVOs();
	}

	public MdmRevLaneVO[] getMdmRevLaneVOs(){
		MdmRevLaneVO[] vos = (MdmRevLaneVO[])models.toArray(new MdmRevLaneVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.updDt       = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.modiRlaneCd = this.modiRlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg     = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt       = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslTpCd     = this.vslTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd     = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt   = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repTrdCd    = this.repTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanCd   = this.vslSlanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows    = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag      = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId    = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneNm     = this.rlaneNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId    = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId     = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
