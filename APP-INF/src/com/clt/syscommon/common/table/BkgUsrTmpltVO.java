/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgUsrTmpltVO.java
*@FileTitle : BkgUsrTmpltVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.27
*@LastModifier : 김영출
*@LastVersion : 1.0
* 2009.04.27 김영출 
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
 * @author 김영출
 * @since J2EE 1.5
 */

public class BkgUsrTmpltVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgUsrTmpltVO> models = new ArrayList<BkgUsrTmpltVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tmpltHdrNm = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String tmpltSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String usrId = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String tmpltTpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tmpltCtnt = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgUsrTmpltVO() {}

	public BkgUsrTmpltVO(String ibflag, String pagerows, String usrId, String tmpltTpCd, String tmpltSeq, String tmpltHdrNm, String tmpltCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.tmpltHdrNm = tmpltHdrNm;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.tmpltSeq = tmpltSeq;
		this.creDt = creDt;
		this.usrId = usrId;
		this.creUsrId = creUsrId;
		this.tmpltTpCd = tmpltTpCd;
		this.pagerows = pagerows;
		this.tmpltCtnt = tmpltCtnt;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tmplt_hdr_nm", getTmpltHdrNm());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("tmplt_seq", getTmpltSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("usr_id", getUsrId());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("tmplt_tp_cd", getTmpltTpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tmplt_ctnt", getTmpltCtnt());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tmplt_hdr_nm", "tmpltHdrNm");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("tmplt_seq", "tmpltSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("usr_id", "usrId");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("tmplt_tp_cd", "tmpltTpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tmplt_ctnt", "tmpltCtnt");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getTmpltHdrNm() {
		return this.tmpltHdrNm;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getTmpltSeq() {
		return this.tmpltSeq;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getUsrId() {
		return this.usrId;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getTmpltTpCd() {
		return this.tmpltTpCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getTmpltCtnt() {
		return this.tmpltCtnt;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setTmpltHdrNm(String tmpltHdrNm) {
		this.tmpltHdrNm = tmpltHdrNm;
		//this.tmpltHdrNm=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setTmpltSeq(String tmpltSeq) {
		this.tmpltSeq = tmpltSeq;
		//this.tmpltSeq=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
		//this.usrId=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setTmpltTpCd(String tmpltTpCd) {
		this.tmpltTpCd = tmpltTpCd;
		//this.tmpltTpCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setTmpltCtnt(String tmpltCtnt) {
		this.tmpltCtnt = tmpltCtnt;
		//this.tmpltCtnt=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setTmpltHdrNm(JSPUtil.getParameter(request, "tmplt_hdr_nm", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setTmpltSeq(JSPUtil.getParameter(request, "tmplt_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setUsrId(JSPUtil.getParameter(request, "usr_id", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setTmpltTpCd(JSPUtil.getParameter(request, "tmplt_tp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTmpltCtnt(JSPUtil.getParameter(request, "tmplt_ctnt", ""));
	}

	public BkgUsrTmpltVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public BkgUsrTmpltVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgUsrTmpltVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] tmpltHdrNm = (JSPUtil.getParameter(request, prefix	+ "tmplt_hdr_nm".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] tmpltSeq = (JSPUtil.getParameter(request, prefix	+ "tmplt_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] usrId = (JSPUtil.getParameter(request, prefix	+ "usr_id".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] tmpltTpCd = (JSPUtil.getParameter(request, prefix	+ "tmplt_tp_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] tmpltCtnt = (JSPUtil.getParameter(request, prefix	+ "tmplt_ctnt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgUsrTmpltVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tmpltHdrNm[i] != null)
					model.setTmpltHdrNm(tmpltHdrNm[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (tmpltSeq[i] != null)
					model.setTmpltSeq(tmpltSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (usrId[i] != null)
					model.setUsrId(usrId[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (tmpltTpCd[i] != null)
					model.setTmpltTpCd(tmpltTpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tmpltCtnt[i] != null)
					model.setTmpltCtnt(tmpltCtnt[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getBkgUsrTmpltVOs();
	}

	public BkgUsrTmpltVO[] getBkgUsrTmpltVOs(){
		BkgUsrTmpltVO[] vos = (BkgUsrTmpltVO[])models.toArray(new BkgUsrTmpltVO[models.size()]);
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
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltHdrNm = this.tmpltHdrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltSeq = this.tmpltSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.usrId = this.usrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltTpCd = this.tmpltTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmpltCtnt = this.tmpltCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
