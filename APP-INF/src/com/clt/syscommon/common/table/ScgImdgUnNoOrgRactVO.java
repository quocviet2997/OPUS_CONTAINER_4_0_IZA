/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgImdgUnNoOrgRactVO.java
*@FileTitle : ScgImdgUnNoOrgRactVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.14
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.05.14 이도형 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이도형
 * @since J2EE 1.5
 * @see AbstractValueObject
 */

public class ScgImdgUnNoOrgRactVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgImdgUnNoOrgRactVO> models = new ArrayList<ScgImdgUnNoOrgRactVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String n3rdImdgSubsRskLblCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String imdgUnNoSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String n1stImdgSubsRskLblCd = null;
	/* Column Info */
	private String imdgPckMzdCd = null;
	/* Column Info */
	private String imdgOrgRactTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String imdgEmerTemp = null;
	/* Column Info */
	private String imdgCtrlTemp = null;
	/* Column Info */
	private String imdgConcRtCtnt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String imdgUnNo = null;
	/* Column Info */
	private String imdgTecNm = null;
	/* Column Info */
	private String n2ndImdgSubsRskLblCd = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgImdgUnNoOrgRactVO() {}

	public ScgImdgUnNoOrgRactVO(String ibflag, String pagerows, String imdgUnNo, String imdgUnNoSeq, String imdgOrgRactTpCd, String imdgTecNm, String imdgConcRtCtnt, String imdgPckMzdCd, String imdgCtrlTemp, String imdgEmerTemp, String n1stImdgSubsRskLblCd, String n2ndImdgSubsRskLblCd, String n3rdImdgSubsRskLblCd, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.n3rdImdgSubsRskLblCd = n3rdImdgSubsRskLblCd;
		this.deltFlg = deltFlg;
		this.imdgUnNoSeq = imdgUnNoSeq;
		this.creDt = creDt;
		this.n1stImdgSubsRskLblCd = n1stImdgSubsRskLblCd;
		this.imdgPckMzdCd = imdgPckMzdCd;
		this.imdgOrgRactTpCd = imdgOrgRactTpCd;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.imdgEmerTemp = imdgEmerTemp;
		this.imdgCtrlTemp = imdgCtrlTemp;
		this.imdgConcRtCtnt = imdgConcRtCtnt;
		this.updUsrId = updUsrId;
		this.imdgUnNo = imdgUnNo;
		this.imdgTecNm = imdgTecNm;
		this.n2ndImdgSubsRskLblCd = n2ndImdgSubsRskLblCd;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("n3rd_imdg_subs_rsk_lbl_cd", getN3rdImdgSubsRskLblCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("imdg_un_no_seq", getImdgUnNoSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("n1st_imdg_subs_rsk_lbl_cd", getN1stImdgSubsRskLblCd());
		this.hashColumns.put("imdg_pck_mzd_cd", getImdgPckMzdCd());
		this.hashColumns.put("imdg_org_ract_tp_cd", getImdgOrgRactTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("imdg_emer_temp", getImdgEmerTemp());
		this.hashColumns.put("imdg_ctrl_temp", getImdgCtrlTemp());
		this.hashColumns.put("imdg_conc_rt_ctnt", getImdgConcRtCtnt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("imdg_un_no", getImdgUnNo());
		this.hashColumns.put("imdg_tec_nm", getImdgTecNm());
		this.hashColumns.put("n2nd_imdg_subs_rsk_lbl_cd", getN2ndImdgSubsRskLblCd());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("n3rd_imdg_subs_rsk_lbl_cd", "n3rdImdgSubsRskLblCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("imdg_un_no_seq", "imdgUnNoSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("n1st_imdg_subs_rsk_lbl_cd", "n1stImdgSubsRskLblCd");
		this.hashFields.put("imdg_pck_mzd_cd", "imdgPckMzdCd");
		this.hashFields.put("imdg_org_ract_tp_cd", "imdgOrgRactTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("imdg_emer_temp", "imdgEmerTemp");
		this.hashFields.put("imdg_ctrl_temp", "imdgCtrlTemp");
		this.hashFields.put("imdg_conc_rt_ctnt", "imdgConcRtCtnt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("imdg_un_no", "imdgUnNo");
		this.hashFields.put("imdg_tec_nm", "imdgTecNm");
		this.hashFields.put("n2nd_imdg_subs_rsk_lbl_cd", "n2ndImdgSubsRskLblCd");
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
	 * @return n3rdImdgSubsRskLblCd
	 */
	public String getN3rdImdgSubsRskLblCd() {
		return this.n3rdImdgSubsRskLblCd;
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
	 * @return imdgUnNoSeq
	 */
	public String getImdgUnNoSeq() {
		return this.imdgUnNoSeq;
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
	 * @return n1stImdgSubsRskLblCd
	 */
	public String getN1stImdgSubsRskLblCd() {
		return this.n1stImdgSubsRskLblCd;
	}
	
	/**
	 * Column Info
	 * @return imdgPckMzdCd
	 */
	public String getImdgPckMzdCd() {
		return this.imdgPckMzdCd;
	}
	
	/**
	 * Column Info
	 * @return imdgOrgRactTpCd
	 */
	public String getImdgOrgRactTpCd() {
		return this.imdgOrgRactTpCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Status
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return imdgEmerTemp
	 */
	public String getImdgEmerTemp() {
		return this.imdgEmerTemp;
	}
	
	/**
	 * Column Info
	 * @return imdgCtrlTemp
	 */
	public String getImdgCtrlTemp() {
		return this.imdgCtrlTemp;
	}
	
	/**
	 * Column Info
	 * @return imdgConcRtCtnt
	 */
	public String getImdgConcRtCtnt() {
		return this.imdgConcRtCtnt;
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
	 * @return imdgUnNo
	 */
	public String getImdgUnNo() {
		return this.imdgUnNo;
	}
	
	/**
	 * Column Info
	 * @return imdgTecNm
	 */
	public String getImdgTecNm() {
		return this.imdgTecNm;
	}
	
	/**
	 * Column Info
	 * @return n2ndImdgSubsRskLblCd
	 */
	public String getN2ndImdgSubsRskLblCd() {
		return this.n2ndImdgSubsRskLblCd;
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
	 * @param n3rdImdgSubsRskLblCd
	 */
	public void setN3rdImdgSubsRskLblCd(String n3rdImdgSubsRskLblCd) {
		this.n3rdImdgSubsRskLblCd = n3rdImdgSubsRskLblCd;
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
	 * @param imdgUnNoSeq
	 */
	public void setImdgUnNoSeq(String imdgUnNoSeq) {
		this.imdgUnNoSeq = imdgUnNoSeq;
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
	 * @param n1stImdgSubsRskLblCd
	 */
	public void setN1stImdgSubsRskLblCd(String n1stImdgSubsRskLblCd) {
		this.n1stImdgSubsRskLblCd = n1stImdgSubsRskLblCd;
	}
	
	/**
	 * Column Info
	 * @param imdgPckMzdCd
	 */
	public void setImdgPckMzdCd(String imdgPckMzdCd) {
		this.imdgPckMzdCd = imdgPckMzdCd;
	}
	
	/**
	 * Column Info
	 * @param imdgOrgRactTpCd
	 */
	public void setImdgOrgRactTpCd(String imdgOrgRactTpCd) {
		this.imdgOrgRactTpCd = imdgOrgRactTpCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Status
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param imdgEmerTemp
	 */
	public void setImdgEmerTemp(String imdgEmerTemp) {
		this.imdgEmerTemp = imdgEmerTemp;
	}
	
	/**
	 * Column Info
	 * @param imdgCtrlTemp
	 */
	public void setImdgCtrlTemp(String imdgCtrlTemp) {
		this.imdgCtrlTemp = imdgCtrlTemp;
	}
	
	/**
	 * Column Info
	 * @param imdgConcRtCtnt
	 */
	public void setImdgConcRtCtnt(String imdgConcRtCtnt) {
		this.imdgConcRtCtnt = imdgConcRtCtnt;
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
	 * @param imdgUnNo
	 */
	public void setImdgUnNo(String imdgUnNo) {
		this.imdgUnNo = imdgUnNo;
	}
	
	/**
	 * Column Info
	 * @param imdgTecNm
	 */
	public void setImdgTecNm(String imdgTecNm) {
		this.imdgTecNm = imdgTecNm;
	}
	
	/**
	 * Column Info
	 * @param n2ndImdgSubsRskLblCd
	 */
	public void setN2ndImdgSubsRskLblCd(String n2ndImdgSubsRskLblCd) {
		this.n2ndImdgSubsRskLblCd = n2ndImdgSubsRskLblCd;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setN3rdImdgSubsRskLblCd(JSPUtil.getParameter(request, "n3rd_imdg_subs_rsk_lbl_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setImdgUnNoSeq(JSPUtil.getParameter(request, "imdg_un_no_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setN1stImdgSubsRskLblCd(JSPUtil.getParameter(request, "n1st_imdg_subs_rsk_lbl_cd", ""));
		setImdgPckMzdCd(JSPUtil.getParameter(request, "imdg_pck_mzd_cd", ""));
		setImdgOrgRactTpCd(JSPUtil.getParameter(request, "imdg_org_ract_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setImdgEmerTemp(JSPUtil.getParameter(request, "imdg_emer_temp", ""));
		setImdgCtrlTemp(JSPUtil.getParameter(request, "imdg_ctrl_temp", ""));
		setImdgConcRtCtnt(JSPUtil.getParameter(request, "imdg_conc_rt_ctnt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setImdgUnNo(JSPUtil.getParameter(request, "imdg_un_no", ""));
		setImdgTecNm(JSPUtil.getParameter(request, "imdg_tec_nm", ""));
		setN2ndImdgSubsRskLblCd(JSPUtil.getParameter(request, "n2nd_imdg_subs_rsk_lbl_cd", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return ScgImdgUnNoOrgRactVO[]
	 */
	public ScgImdgUnNoOrgRactVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return ScgImdgUnNoOrgRactVO[]
	 */
	public ScgImdgUnNoOrgRactVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgImdgUnNoOrgRactVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] n3rdImdgSubsRskLblCd = (JSPUtil.getParameter(request, prefix	+ "n3rd_imdg_subs_rsk_lbl_cd".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] imdgUnNoSeq = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] n1stImdgSubsRskLblCd = (JSPUtil.getParameter(request, prefix	+ "n1st_imdg_subs_rsk_lbl_cd".trim(), length));
			String[] imdgPckMzdCd = (JSPUtil.getParameter(request, prefix	+ "imdg_pck_mzd_cd".trim(), length));
			String[] imdgOrgRactTpCd = (JSPUtil.getParameter(request, prefix	+ "imdg_org_ract_tp_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] imdgEmerTemp = (JSPUtil.getParameter(request, prefix	+ "imdg_emer_temp".trim(), length));
			String[] imdgCtrlTemp = (JSPUtil.getParameter(request, prefix	+ "imdg_ctrl_temp".trim(), length));
			String[] imdgConcRtCtnt = (JSPUtil.getParameter(request, prefix	+ "imdg_conc_rt_ctnt".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] imdgUnNo = (JSPUtil.getParameter(request, prefix	+ "imdg_un_no".trim(), length));
			String[] imdgTecNm = (JSPUtil.getParameter(request, prefix	+ "imdg_tec_nm".trim(), length));
			String[] n2ndImdgSubsRskLblCd = (JSPUtil.getParameter(request, prefix	+ "n2nd_imdg_subs_rsk_lbl_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgImdgUnNoOrgRactVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (n3rdImdgSubsRskLblCd[i] != null)
					model.setN3rdImdgSubsRskLblCd(n3rdImdgSubsRskLblCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (imdgUnNoSeq[i] != null)
					model.setImdgUnNoSeq(imdgUnNoSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (n1stImdgSubsRskLblCd[i] != null)
					model.setN1stImdgSubsRskLblCd(n1stImdgSubsRskLblCd[i]);
				if (imdgPckMzdCd[i] != null)
					model.setImdgPckMzdCd(imdgPckMzdCd[i]);
				if (imdgOrgRactTpCd[i] != null)
					model.setImdgOrgRactTpCd(imdgOrgRactTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (imdgEmerTemp[i] != null)
					model.setImdgEmerTemp(imdgEmerTemp[i]);
				if (imdgCtrlTemp[i] != null)
					model.setImdgCtrlTemp(imdgCtrlTemp[i]);
				if (imdgConcRtCtnt[i] != null)
					model.setImdgConcRtCtnt(imdgConcRtCtnt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (imdgUnNo[i] != null)
					model.setImdgUnNo(imdgUnNo[i]);
				if (imdgTecNm[i] != null)
					model.setImdgTecNm(imdgTecNm[i]);
				if (n2ndImdgSubsRskLblCd[i] != null)
					model.setN2ndImdgSubsRskLblCd(n2ndImdgSubsRskLblCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getScgImdgUnNoOrgRactVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return ScgImdgUnNoOrgRactVO[]
	 */
	public ScgImdgUnNoOrgRactVO[] getScgImdgUnNoOrgRactVOs(){
		ScgImdgUnNoOrgRactVO[] vos = (ScgImdgUnNoOrgRactVO[])models.toArray(new ScgImdgUnNoOrgRactVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n3rdImdgSubsRskLblCd = this.n3rdImdgSubsRskLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNoSeq = this.imdgUnNoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n1stImdgSubsRskLblCd = this.n1stImdgSubsRskLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgPckMzdCd = this.imdgPckMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgOrgRactTpCd = this.imdgOrgRactTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgEmerTemp = this.imdgEmerTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgCtrlTemp = this.imdgCtrlTemp .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgConcRtCtnt = this.imdgConcRtCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgUnNo = this.imdgUnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.imdgTecNm = this.imdgTecNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.n2ndImdgSubsRskLblCd = this.n2ndImdgSubsRskLblCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
