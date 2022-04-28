/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : MdmCommodityVO.java
*@FileTitle : MdmCommodityVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김재연
*@LastVersion : 1.0
* 2009.04.27 김재연 
* 1.0 Creation
* 2010.03.30
* - FMC_EXP_FLG 필드 추가
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
 * @author 김재연
 * @since J2EE 1.5
 */

public class MdmCommodityVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<MdmCommodityVO> models = new ArrayList<MdmCommodityVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String grpCmdtCd = null;
	/* Column Info */
	private String eaiEvntDt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String cmdtCd = null;
	/* Column Info */
	private String repImdgLvlCd = null;
	/* Column Info */
	private String cmdtNm = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String repCmdtCd = null;
	
	private String fmcExpFlg = null;
	/* Column Info */
	private String eaiIfId = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public MdmCommodityVO() {}

	public MdmCommodityVO(String ibflag, String pagerows, String cmdtCd, String cmdtNm, String repImdgLvlCd, String repCmdtCd, String grpCmdtCd, String creUsrId, String creDt, String updUsrId, String updDt, String deltFlg, String eaiEvntDt, String fmcExpFlg, String eaiIfId) {
		this.ibflag = ibflag;
		this.grpCmdtCd = grpCmdtCd;
		this.eaiEvntDt = eaiEvntDt;
		this.updUsrId = updUsrId;
		this.cmdtCd = cmdtCd;
		this.repImdgLvlCd = repImdgLvlCd;
		this.cmdtNm = cmdtNm;
		this.updDt = updDt;
		this.creDt = creDt;
		this.deltFlg = deltFlg;
		this.creUsrId = creUsrId;
		this.pagerows = pagerows;
		this.repCmdtCd = repCmdtCd;
		this.fmcExpFlg = fmcExpFlg;
		this.eaiIfId = eaiIfId;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("grp_cmdt_cd", getGrpCmdtCd());
		this.hashColumns.put("eai_evnt_dt", getEaiEvntDt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("cmdt_cd", getCmdtCd());
		this.hashColumns.put("rep_imdg_lvl_cd", getRepImdgLvlCd());
		this.hashColumns.put("cmdt_nm", getCmdtNm());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("rep_cmdt_cd", getRepCmdtCd());
		this.hashColumns.put("fmc_exp_flg", getFmcExpFlg());
		this.hashColumns.put("eai_if_id", getEaiIfId());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("grp_cmdt_cd", "grpCmdtCd");
		this.hashFields.put("eai_evnt_dt", "eaiEvntDt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("cmdt_cd", "cmdtCd");
		this.hashFields.put("rep_imdg_lvl_cd", "repImdgLvlCd");
		this.hashFields.put("cmdt_nm", "cmdtNm");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("rep_cmdt_cd", "repCmdtCd");
		this.hashFields.put("fmc_exp_flg", "fmcExpFlg");
		this.hashFields.put("eai_if_id", "eaiIfId");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getGrpCmdtCd() {
		return this.grpCmdtCd;
	}
	public String getEaiEvntDt() {
		return this.eaiEvntDt;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getCmdtCd() {
		return this.cmdtCd;
	}
	public String getRepImdgLvlCd() {
		return this.repImdgLvlCd;
	}
	public String getCmdtNm() {
		return this.cmdtNm;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getRepCmdtCd() {
		return this.repCmdtCd;
	}
	public String getFmcExpFlg() {
		return this.fmcExpFlg;
	}
	
	/**
	 * Column Info
	 * @return eaiIfId
	 */
	public String getEaiIfId() {
		return this.eaiIfId;
	}
	

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setGrpCmdtCd(String grpCmdtCd) {
		this.grpCmdtCd = grpCmdtCd;
		//this.grpCmdtCd=true;
	}
	public void setEaiEvntDt(String eaiEvntDt) {
		this.eaiEvntDt = eaiEvntDt;
		//this.eaiEvntDt=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setCmdtCd(String cmdtCd) {
		this.cmdtCd = cmdtCd;
		//this.cmdtCd=true;
	}
	public void setRepImdgLvlCd(String repImdgLvlCd) {
		this.repImdgLvlCd = repImdgLvlCd;
		//this.repImdgLvlCd=true;
	}
	public void setCmdtNm(String cmdtNm) {
		this.cmdtNm = cmdtNm;
		//this.cmdtNm=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setRepCmdtCd(String repCmdtCd) {
		this.repCmdtCd = repCmdtCd;
		//this.repCmdtCd=true;
	}
	public void setFmcExpFlg(String fmcExpFlg) {
		this.fmcExpFlg = fmcExpFlg;
		//this.fmcExpFlg=true;
	}
	
	/**
	 * Column Info
	 * @param eaiIfId
	 */
	public void setEaiIfId(String eaiIfId) {
		this.eaiIfId = eaiIfId;
	}
	
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setGrpCmdtCd(JSPUtil.getParameter(request, "grp_cmdt_cd", ""));
		setEaiEvntDt(JSPUtil.getParameter(request, "eai_evnt_dt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setCmdtCd(JSPUtil.getParameter(request, "cmdt_cd", ""));
		setRepImdgLvlCd(JSPUtil.getParameter(request, "rep_imdg_lvl_cd", ""));
		setCmdtNm(JSPUtil.getParameter(request, "cmdt_nm", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setRepCmdtCd(JSPUtil.getParameter(request, "rep_cmdt_cd", ""));
		setFmcExpFlg(JSPUtil.getParameter(request, "fmc_exp_flg", ""));
		setEaiIfId(JSPUtil.getParameter(request, "eai_if_id", ""));
	}

	public MdmCommodityVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public MdmCommodityVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		MdmCommodityVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag       = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim()         , length));
			String[] grpCmdtCd    = (JSPUtil.getParameter(request, prefix	+ "grp_cmdt_cd".trim()    , length));
			String[] eaiEvntDt    = (JSPUtil.getParameter(request, prefix	+ "eai_evnt_dt".trim()    , length));
			String[] updUsrId     = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim()     , length));
			String[] cmdtCd       = (JSPUtil.getParameter(request, prefix	+ "cmdt_cd".trim()        , length));
			String[] repImdgLvlCd = (JSPUtil.getParameter(request, prefix	+ "rep_imdg_lvl_cd".trim(), length));
			String[] cmdtNm       = (JSPUtil.getParameter(request, prefix	+ "cmdt_nm".trim()        , length));
			String[] updDt        = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim()         , length));
			String[] creDt        = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim()         , length));
			String[] deltFlg      = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim()       , length));
			String[] creUsrId     = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim()     , length));
			String[] pagerows     = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim()       , length));
			String[] repCmdtCd    = (JSPUtil.getParameter(request, prefix	+ "rep_cmdt_cd".trim()    , length));
			String[] fmcExpFlg    = (JSPUtil.getParameter(request, prefix	+ "fmc_exp_flg".trim()    , length));
			String[] eaiIfId      = (JSPUtil.getParameter(request, prefix	+ "eai_if_id".trim()      , length));
			
			for (int i = 0; i < length; i++) {
				model = new MdmCommodityVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (grpCmdtCd[i] != null)
					model.setGrpCmdtCd(grpCmdtCd[i]);
				if (eaiEvntDt[i] != null)
					model.setEaiEvntDt(eaiEvntDt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (cmdtCd[i] != null)
					model.setCmdtCd(cmdtCd[i]);
				if (repImdgLvlCd[i] != null)
					model.setRepImdgLvlCd(repImdgLvlCd[i]);
				if (cmdtNm[i] != null)
					model.setCmdtNm(cmdtNm[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (repCmdtCd[i] != null)
					model.setRepCmdtCd(repCmdtCd[i]);
				if (fmcExpFlg[i] != null)
					model.setFmcExpFlg(fmcExpFlg[i]);
				if (eaiIfId[i] != null)
					model.setEaiIfId(eaiIfId[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getMdmCommodityVOs();
	}

	public MdmCommodityVO[] getMdmCommodityVOs(){
		MdmCommodityVO[] vos = (MdmCommodityVO[])models.toArray(new MdmCommodityVO[models.size()]);
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
		this.ibflag       = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpCmdtCd    = this.grpCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiEvntDt    = this.eaiEvntDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId     = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtCd       = this.cmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repImdgLvlCd = this.repImdgLvlCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cmdtNm       = this.cmdtNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt        = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt        = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg      = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId     = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows     = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.repCmdtCd    = this.repCmdtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmcExpFlg    = this.fmcExpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.eaiIfId      = this.eaiIfId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
