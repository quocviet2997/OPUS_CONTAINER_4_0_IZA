/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSgGrpLocVO.java
*@FileTitle : PriSgGrpLocVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.04.21
*@LastModifier : 박성수
*@LastVersion : 1.0
* 2009.04.21 박성수 
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
 * @author 박성수
 * @since J2EE 1.5
 */

public class PriSgGrpLocVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSgGrpLocVO> models = new ArrayList<PriSgGrpLocVO>();
	
	/* Column Inpo */
	private String updUsrId = null;
	/* Column Inpo */
	private String prcGrpLocCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Inpo */
	private String updDt = null;
	/* Column Inpo */
	private String creDt = null;
	/* Column Inpo */
	private String grpLocSeq = null;
	/* Column Inpo */
	private String glineSeq = null;
	/* Column Inpo */
	private String creUsrId = null;
	/* Column Inpo */
	private String svcScpCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Inpo */
	private String prcGrpLocDesc = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSgGrpLocVO() {}

	public PriSgGrpLocVO(String ibflag, String pagerows, String svcScpCd, String glineSeq, String grpLocSeq, String prcGrpLocCd, String prcGrpLocDesc, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.prcGrpLocCd = prcGrpLocCd;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.creDt = creDt;
		this.grpLocSeq = grpLocSeq;
		this.glineSeq = glineSeq;
		this.creUsrId = creUsrId;
		this.svcScpCd = svcScpCd;
		this.pagerows = pagerows;
		this.prcGrpLocDesc = prcGrpLocDesc;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("prc_grp_loc_cd", getPrcGrpLocCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("grp_loc_seq", getGrpLocSeq());
		this.hashColumns.put("gline_seq", getGlineSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("prc_grp_loc_desc", getPrcGrpLocDesc());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("prc_grp_loc_cd", "prcGrpLocCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("grp_loc_seq", "grpLocSeq");
		this.hashFields.put("gline_seq", "glineSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("prc_grp_loc_desc", "prcGrpLocDesc");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPrcGrpLocCd() {
		return this.prcGrpLocCd;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getGrpLocSeq() {
		return this.grpLocSeq;
	}
	public String getGlineSeq() {
		return this.glineSeq;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getPrcGrpLocDesc() {
		return this.prcGrpLocDesc;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPrcGrpLocCd(String prcGrpLocCd) {
		this.prcGrpLocCd = prcGrpLocCd;
		//this.prcGrpLocCd=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setGrpLocSeq(String grpLocSeq) {
		this.grpLocSeq = grpLocSeq;
		//this.grpLocSeq=true;
	}
	public void setGlineSeq(String glineSeq) {
		this.glineSeq = glineSeq;
		//this.glineSeq=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
		//this.svcScpCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setPrcGrpLocDesc(String prcGrpLocDesc) {
		this.prcGrpLocDesc = prcGrpLocDesc;
		//this.prcGrpLocDesc=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPrcGrpLocCd(JSPUtil.getParameter(request, "prc_grp_loc_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setGrpLocSeq(JSPUtil.getParameter(request, "grp_loc_seq", ""));
		setGlineSeq(JSPUtil.getParameter(request, "gline_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPrcGrpLocDesc(JSPUtil.getParameter(request, "prc_grp_loc_desc", ""));
	}

	public PriSgGrpLocVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PriSgGrpLocVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSgGrpLocVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] prcGrpLocCd = (JSPUtil.getParameter(request, prefix	+ "prc_grp_loc_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] grpLocSeq = (JSPUtil.getParameter(request, prefix	+ "grp_loc_seq".trim(), length));
			String[] glineSeq = (JSPUtil.getParameter(request, prefix	+ "gline_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] prcGrpLocDesc = (JSPUtil.getParameter(request, prefix	+ "prc_grp_loc_desc".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSgGrpLocVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (prcGrpLocCd[i] != null)
					model.setPrcGrpLocCd(prcGrpLocCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (grpLocSeq[i] != null)
					model.setGrpLocSeq(grpLocSeq[i]);
				if (glineSeq[i] != null)
					model.setGlineSeq(glineSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (prcGrpLocDesc[i] != null)
					model.setPrcGrpLocDesc(prcGrpLocDesc[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPriSgGrpLocVOs();
	}

	public PriSgGrpLocVO[] getPriSgGrpLocVOs(){
		PriSgGrpLocVO[] vos = (PriSgGrpLocVO[])models.toArray(new PriSgGrpLocVO[models.size()]);
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
		this.prcGrpLocCd = this.prcGrpLocCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.grpLocSeq = this.grpLocSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.glineSeq = this.glineSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.prcGrpLocDesc = this.prcGrpLocDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
