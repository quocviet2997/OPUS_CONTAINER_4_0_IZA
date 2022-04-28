/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSgCtrtCluzDtlVO.java
*@FileTitle : PriSgCtrtCluzDtlVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.28
*@LastModifier : 이승준
*@LastVersion : 1.0
* 2009.04.28 이승준 
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

public class PriSgCtrtCluzDtlVO extends AbstractValueObject {

private static final long serialVersionUID = 1L;
	
	private Collection<PriSgCtrtCluzDtlVO> models = new ArrayList<PriSgCtrtCluzDtlVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ctrtCluzDtlSeq = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String glineSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String chgCd = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String ctrtCluzSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ctrtCluzCtnt = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSgCtrtCluzDtlVO() {}

	public PriSgCtrtCluzDtlVO(String ibflag, String pagerows, String svcScpCd, String glineSeq, String ctrtCluzSeq, String ctrtCluzDtlSeq, String chgCd, String ctrtCluzCtnt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.ctrtCluzDtlSeq = ctrtCluzDtlSeq;
		this.creDt = creDt;
		this.glineSeq = glineSeq;
		this.creUsrId = creUsrId;
		this.chgCd = chgCd;
		this.svcScpCd = svcScpCd;
		this.ctrtCluzSeq = ctrtCluzSeq;
		this.pagerows = pagerows;
		this.ctrtCluzCtnt = ctrtCluzCtnt;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("ctrt_cluz_dtl_seq", getCtrtCluzDtlSeq());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("gline_seq", getGlineSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("chg_cd", getChgCd());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("ctrt_cluz_seq", getCtrtCluzSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ctrt_cluz_ctnt", getCtrtCluzCtnt());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("ctrt_cluz_dtl_seq", "ctrtCluzDtlSeq");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("gline_seq", "glineSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("chg_cd", "chgCd");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("ctrt_cluz_seq", "ctrtCluzSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ctrt_cluz_ctnt", "ctrtCluzCtnt");
		return this.hashFields;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @return updDt
	 */
	public String getUpdDt() {
		return this.updDt;
	}
	
	/**
	 * Column Info
	 * @return ctrtCluzDtlSeq
	 */
	public String getCtrtCluzDtlSeq() {
		return this.ctrtCluzDtlSeq;
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
	 * @return glineSeq
	 */
	public String getGlineSeq() {
		return this.glineSeq;
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
	 * @return chgCd
	 */
	public String getChgCd() {
		return this.chgCd;
	}
	
	/**
	 * Column Info
	 * @return svcScpCd
	 */
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	
	/**
	 * Column Info
	 * @return ctrtCluzSeq
	 */
	public String getCtrtCluzSeq() {
		return this.ctrtCluzSeq;
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
	 * @return ctrtCluzCtnt
	 */
	public String getCtrtCluzCtnt() {
		return this.ctrtCluzCtnt;
	}
	

	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}
	
	/**
	 * Column Info
	 * @param ctrtCluzDtlSeq
	 */
	public void setCtrtCluzDtlSeq(String ctrtCluzDtlSeq) {
		this.ctrtCluzDtlSeq = ctrtCluzDtlSeq;
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
	 * @param glineSeq
	 */
	public void setGlineSeq(String glineSeq) {
		this.glineSeq = glineSeq;
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
	 * @param chgCd
	 */
	public void setChgCd(String chgCd) {
		this.chgCd = chgCd;
	}
	
	/**
	 * Column Info
	 * @param svcScpCd
	 */
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
	}
	
	/**
	 * Column Info
	 * @param ctrtCluzSeq
	 */
	public void setCtrtCluzSeq(String ctrtCluzSeq) {
		this.ctrtCluzSeq = ctrtCluzSeq;
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
	 * @param ctrtCluzCtnt
	 */
	public void setCtrtCluzCtnt(String ctrtCluzCtnt) {
		this.ctrtCluzCtnt = ctrtCluzCtnt;
	}
	
	/**
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCtrtCluzDtlSeq(JSPUtil.getParameter(request, "ctrt_cluz_dtl_seq", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setGlineSeq(JSPUtil.getParameter(request, "gline_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setChgCd(JSPUtil.getParameter(request, "chg_cd", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setCtrtCluzSeq(JSPUtil.getParameter(request, "ctrt_cluz_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCtrtCluzCtnt(JSPUtil.getParameter(request, "ctrt_cluz_ctnt", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return PriSgCtrtCluzDtlVO[]
	 */
	public PriSgCtrtCluzDtlVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return PriSgCtrtCluzDtlVO[]
	 */
	public PriSgCtrtCluzDtlVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSgCtrtCluzDtlVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] ctrtCluzDtlSeq = (JSPUtil.getParameter(request, prefix	+ "ctrt_cluz_dtl_seq".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] glineSeq = (JSPUtil.getParameter(request, prefix	+ "gline_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] chgCd = (JSPUtil.getParameter(request, prefix	+ "chg_cd".trim(), length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd".trim(), length));
			String[] ctrtCluzSeq = (JSPUtil.getParameter(request, prefix	+ "ctrt_cluz_seq".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] ctrtCluzCtnt = (JSPUtil.getParameter(request, prefix	+ "ctrt_cluz_ctnt".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSgCtrtCluzDtlVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ctrtCluzDtlSeq[i] != null)
					model.setCtrtCluzDtlSeq(ctrtCluzDtlSeq[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (glineSeq[i] != null)
					model.setGlineSeq(glineSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (chgCd[i] != null)
					model.setChgCd(chgCd[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (ctrtCluzSeq[i] != null)
					model.setCtrtCluzSeq(ctrtCluzSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ctrtCluzCtnt[i] != null)
					model.setCtrtCluzCtnt(ctrtCluzCtnt[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getPriSgCtrtCluzDtlVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return PriSgCtrtCluzDtlVO[]
	 */
	public PriSgCtrtCluzDtlVO[] getPriSgCtrtCluzDtlVOs(){
		PriSgCtrtCluzDtlVO[] vos = (PriSgCtrtCluzDtlVO[])models.toArray(new PriSgCtrtCluzDtlVO[models.size()]);
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
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtCluzDtlSeq = this.ctrtCluzDtlSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glineSeq = this.glineSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chgCd = this.chgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtCluzSeq = this.ctrtCluzSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtCluzCtnt = this.ctrtCluzCtnt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
