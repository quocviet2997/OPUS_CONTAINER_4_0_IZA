/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgCstmsAdvSndLogDtlVO.java
*@FileTitle : BkgCstmsAdvSndLogDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.14
*@LastModifier : 김민정
*@LastVersion : 1.0
* 2009.05.14 김민정 
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
 * @author 김민정
 * @since J2EE 1.5
 * @see ..
 */

public class BkgCstmsAdvSndLogDtlVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgCstmsAdvSndLogDtlVO> models = new ArrayList<BkgCstmsAdvSndLogDtlVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String dtlSeq = null;
	/* Column Info */
	private String cntCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String sndDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String hisSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ediSndLogCtnt = null;
	/* Column Info */
	private String ioBndCd = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgCstmsAdvSndLogDtlVO() {}

	public BkgCstmsAdvSndLogDtlVO(String ibflag, String pagerows, String cntCd, String ioBndCd, String sndDt, String hisSeq, String dtlSeq, String ediSndLogCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.dtlSeq = dtlSeq;
		this.cntCd = cntCd;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.sndDt = sndDt;
		this.creDt = creDt;
		this.hisSeq = hisSeq;
		this.creUsrId = creUsrId;
		this.ediSndLogCtnt = ediSndLogCtnt;
		this.ioBndCd = ioBndCd;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("dtl_seq", getDtlSeq());
		this.hashColumns.put("cnt_cd", getCntCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("snd_dt", getSndDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("his_seq", getHisSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("edi_snd_log_ctnt", getEdiSndLogCtnt());
		this.hashColumns.put("io_bnd_cd", getIoBndCd());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("dtl_seq", "dtlSeq");
		this.hashFields.put("cnt_cd", "cntCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("snd_dt", "sndDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("his_seq", "hisSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("edi_snd_log_ctnt", "ediSndLogCtnt");
		this.hashFields.put("io_bnd_cd", "ioBndCd");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getDtlSeq() {
		return this.dtlSeq;
	}
	public String getCntCd() {
		return this.cntCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getSndDt() {
		return this.sndDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getHisSeq() {
		return this.hisSeq;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getEdiSndLogCtnt() {
		return this.ediSndLogCtnt;
	}
	public String getIoBndCd() {
		return this.ioBndCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setDtlSeq(String dtlSeq) {
		this.dtlSeq = dtlSeq;
		//this.dtlSeq=true;
	}
	public void setCntCd(String cntCd) {
		this.cntCd = cntCd;
		//this.cntCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setSndDt(String sndDt) {
		this.sndDt = sndDt;
		//this.sndDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setHisSeq(String hisSeq) {
		this.hisSeq = hisSeq;
		//this.hisSeq=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setEdiSndLogCtnt(String ediSndLogCtnt) {
		this.ediSndLogCtnt = ediSndLogCtnt;
		//this.ediSndLogCtnt=true;
	}
	public void setIoBndCd(String ioBndCd) {
		this.ioBndCd = ioBndCd;
		//this.ioBndCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setDtlSeq(JSPUtil.getParameter(request, "dtl_seq", ""));
		setCntCd(JSPUtil.getParameter(request, "cnt_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setSndDt(JSPUtil.getParameter(request, "snd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setHisSeq(JSPUtil.getParameter(request, "his_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setEdiSndLogCtnt(JSPUtil.getParameter(request, "edi_snd_log_ctnt", ""));
		setIoBndCd(JSPUtil.getParameter(request, "io_bnd_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public BkgCstmsAdvSndLogDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgCstmsAdvSndLogDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgCstmsAdvSndLogDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] dtlSeq = (JSPUtil.getParameter(request, prefix	+ "dtl_seq".trim(), length));
			String[] cntCd = (JSPUtil.getParameter(request, prefix	+ "cnt_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] sndDt = (JSPUtil.getParameter(request, prefix	+ "snd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] hisSeq = (JSPUtil.getParameter(request, prefix	+ "his_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ediSndLogCtnt = (JSPUtil.getParameter(request, prefix	+ "edi_snd_log_ctnt".trim(), length));
			String[] ioBndCd = (JSPUtil.getParameter(request, prefix	+ "io_bnd_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgCstmsAdvSndLogDtlVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (dtlSeq[i] != null)
					model.setDtlSeq(dtlSeq[i]);
				if (cntCd[i] != null)
					model.setCntCd(cntCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (sndDt[i] != null)
					model.setSndDt(sndDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (hisSeq[i] != null)
					model.setHisSeq(hisSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ediSndLogCtnt[i] != null)
					model.setEdiSndLogCtnt(ediSndLogCtnt[i]);
				if (ioBndCd[i] != null)
					model.setIoBndCd(ioBndCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgCstmsAdvSndLogDtlVOs();
	}

	public BkgCstmsAdvSndLogDtlVO[] getBkgCstmsAdvSndLogDtlVOs(){
		BkgCstmsAdvSndLogDtlVO[] vos = (BkgCstmsAdvSndLogDtlVO[])models.toArray(new BkgCstmsAdvSndLogDtlVO[models.size()]);
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
	public void onDataFormat(){
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dtlSeq = this.dtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntCd = this.cntCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sndDt = this.sndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hisSeq = this.hisSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ediSndLogCtnt = this.ediSndLogCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ioBndCd = this.ioBndCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
