/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSgStndNoteCtntVO.java
*@FileTitle : PriSgStndNoteCtntVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.17
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.04.17 이승준 
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
 * @author 이승준
 * @since J2EE 1.5
 */

public class PriSgStndNoteCtntVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSgStndNoteCtntVO> models = new ArrayList<PriSgStndNoteCtntVO>();
	
	/* Column Inpo */
	private String noteSeq = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String noteCtntSeq = null;
	/* Column Inpo */
	private String noteConvMapgId = null;
	/* Column Inpo */
	private String noteConvFlg = null;
	/* Column Inpo */
	private String svcScpCd = null;
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String dpSeq = null;
	/* Column Inpo */
	private String noteCtnt = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String noteHdrSeq = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String prcCustTpCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSgStndNoteCtntVO() {}

	public PriSgStndNoteCtntVO(String ibflag, String pagerows, String svcScpCd, String prcCustTpCd, String noteHdrSeq, String noteSeq, String noteCtntSeq, String noteCtnt, String noteConvFlg, String dpSeq, String noteConvMapgId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.noteSeq = noteSeq;
		this.ibflag = ibflag;
		this.noteCtntSeq = noteCtntSeq;
		this.noteConvMapgId = noteConvMapgId;
		this.noteConvFlg = noteConvFlg;
		this.svcScpCd = svcScpCd;
		this.updUsrId = updUsrId;
		this.dpSeq = dpSeq;
		this.noteCtnt = noteCtnt;
		this.updDt = updDt;
		this.creDt = creDt;
		this.noteHdrSeq = noteHdrSeq;
		this.creUsrId = creUsrId;
		this.prcCustTpCd = prcCustTpCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("note_seq", getNoteSeq());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("note_ctnt_seq", getNoteCtntSeq());
		this.hashColumns.put("note_conv_mapg_id", getNoteConvMapgId());
		this.hashColumns.put("note_conv_flg", getNoteConvFlg());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dp_seq", getDpSeq());
		this.hashColumns.put("note_ctnt", getNoteCtnt());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("note_hdr_seq", getNoteHdrSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("prc_cust_tp_cd", getPrcCustTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("note_seq", "noteSeq");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("note_ctnt_seq", "noteCtntSeq");
		this.hashFields.put("note_conv_mapg_id", "noteConvMapgId");
		this.hashFields.put("note_conv_flg", "noteConvFlg");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dp_seq", "dpSeq");
		this.hashFields.put("note_ctnt", "noteCtnt");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("note_hdr_seq", "noteHdrSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("prc_cust_tp_cd", "prcCustTpCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getNoteSeq() {
		return this.noteSeq;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getNoteCtntSeq() {
		return this.noteCtntSeq;
	}
	public String getNoteConvMapgId() {
		return this.noteConvMapgId;
	}
	public String getNoteConvFlg() {
		return this.noteConvFlg;
	}
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getDpSeq() {
		return this.dpSeq;
	}
	public String getNoteCtnt() {
		return this.noteCtnt;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getNoteHdrSeq() {
		return this.noteHdrSeq;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPrcCustTpCd() {
		return this.prcCustTpCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setNoteSeq(String noteSeq) {
		this.noteSeq = noteSeq;
		//this.noteSeq=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setNoteCtntSeq(String noteCtntSeq) {
		this.noteCtntSeq = noteCtntSeq;
		//this.noteCtntSeq=true;
	}
	public void setNoteConvMapgId(String noteConvMapgId) {
		this.noteConvMapgId = noteConvMapgId;
		//this.noteConvMapgId=true;
	}
	public void setNoteConvFlg(String noteConvFlg) {
		this.noteConvFlg = noteConvFlg;
		//this.noteConvFlg=true;
	}
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
		//this.svcScpCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setDpSeq(String dpSeq) {
		this.dpSeq = dpSeq;
		//this.dpSeq=true;
	}
	public void setNoteCtnt(String noteCtnt) {
		this.noteCtnt = noteCtnt;
		//this.noteCtnt=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setNoteHdrSeq(String noteHdrSeq) {
		this.noteHdrSeq = noteHdrSeq;
		//this.noteHdrSeq=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPrcCustTpCd(String prcCustTpCd) {
		this.prcCustTpCd = prcCustTpCd;
		//this.prcCustTpCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setNoteSeq(JSPUtil.getParameter(request, "note_seq", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setNoteCtntSeq(JSPUtil.getParameter(request, "note_ctnt_seq", ""));
		setNoteConvMapgId(JSPUtil.getParameter(request, "note_conv_mapg_id", ""));
		setNoteConvFlg(JSPUtil.getParameter(request, "note_conv_flg", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDpSeq(JSPUtil.getParameter(request, "dp_seq", ""));
		setNoteCtnt(JSPUtil.getParameter(request, "note_ctnt", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setNoteHdrSeq(JSPUtil.getParameter(request, "note_hdr_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPrcCustTpCd(JSPUtil.getParameter(request, "prc_cust_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public PriSgStndNoteCtntVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PriSgStndNoteCtntVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSgStndNoteCtntVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] noteSeq = (JSPUtil.getParameter(request, prefix	+ "note_seq".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] noteCtntSeq = (JSPUtil.getParameter(request, prefix	+ "note_ctnt_seq".trim(), length));
			String[] noteConvMapgId = (JSPUtil.getParameter(request, prefix	+ "note_conv_mapg_id".trim(), length));
			String[] noteConvFlg = (JSPUtil.getParameter(request, prefix	+ "note_conv_flg".trim(), length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] dpSeq = (JSPUtil.getParameter(request, prefix	+ "dp_seq".trim(), length));
			String[] noteCtnt = (JSPUtil.getParameter(request, prefix	+ "note_ctnt".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] noteHdrSeq = (JSPUtil.getParameter(request, prefix	+ "note_hdr_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] prcCustTpCd = (JSPUtil.getParameter(request, prefix	+ "prc_cust_tp_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSgStndNoteCtntVO();
				if (noteSeq[i] != null)
					model.setNoteSeq(noteSeq[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (noteCtntSeq[i] != null)
					model.setNoteCtntSeq(noteCtntSeq[i]);
				if (noteConvMapgId[i] != null)
					model.setNoteConvMapgId(noteConvMapgId[i]);
				if (noteConvFlg[i] != null)
					model.setNoteConvFlg(noteConvFlg[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (dpSeq[i] != null)
					model.setDpSeq(dpSeq[i]);
				if (noteCtnt[i] != null)
					model.setNoteCtnt(noteCtnt[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (noteHdrSeq[i] != null)
					model.setNoteHdrSeq(noteHdrSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (prcCustTpCd[i] != null)
					model.setPrcCustTpCd(prcCustTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPriSgStndNoteCtntVOs();
	}

	public PriSgStndNoteCtntVO[] getPriSgStndNoteCtntVOs(){
		PriSgStndNoteCtntVO[] vos = (PriSgStndNoteCtntVO[])models.toArray(new PriSgStndNoteCtntVO[models.size()]);
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
		this.noteSeq = this.noteSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteCtntSeq = this.noteCtntSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvMapgId = this.noteConvMapgId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteConvFlg = this.noteConvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dpSeq = this.dpSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteCtnt = this.noteCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.noteHdrSeq = this.noteHdrSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcCustTpCd = this.prcCustTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
