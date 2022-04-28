/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : PriSpScpAproRefUsrVO.java
*@FileTitle : PriSpScpAproRefUsrVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 변영주
*@LastVersion : 1.0
* 2009.05.06 변영주 
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
 * @author 변영주
 * @since J2EE 1.5
 */

public class PriSpScpAproRefUsrVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<PriSpScpAproRefUsrVO> models = new ArrayList<PriSpScpAproRefUsrVO>();
	
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String propNo = null;
	/* Column Info */
	private String svcScpCd = null;
	/* Column Info */
	private String amdtSeq = null;
	/* Column Info */
	private String aproRefUsrOfcCd = null;
	/* Column Info */
	private String aproRefUsrId = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String aproRefTpCd = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String aproRqstSeq = null;
	/* Column Info */
	private String creUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public PriSpScpAproRefUsrVO() {}

	public PriSpScpAproRefUsrVO(String ibflag, String pagerows, String propNo, String amdtSeq, String aproRqstSeq, String svcScpCd, String aproRefTpCd, String aproRefUsrId, String aproRefUsrOfcCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.ibflag = ibflag;
		this.propNo = propNo;
		this.svcScpCd = svcScpCd;
		this.amdtSeq = amdtSeq;
		this.aproRefUsrOfcCd = aproRefUsrOfcCd;
		this.aproRefUsrId = aproRefUsrId;
		this.updUsrId = updUsrId;
		this.aproRefTpCd = aproRefTpCd;
		this.updDt = updDt;
		this.creDt = creDt;
		this.aproRqstSeq = aproRqstSeq;
		this.creUsrId = creUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("prop_no", getPropNo());
		this.hashColumns.put("svc_scp_cd", getSvcScpCd());
		this.hashColumns.put("amdt_seq", getAmdtSeq());
		this.hashColumns.put("apro_ref_usr_ofc_cd", getAproRefUsrOfcCd());
		this.hashColumns.put("apro_ref_usr_id", getAproRefUsrId());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("apro_ref_tp_cd", getAproRefTpCd());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("apro_rqst_seq", getAproRqstSeq());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("prop_no", "propNo");
		this.hashFields.put("svc_scp_cd", "svcScpCd");
		this.hashFields.put("amdt_seq", "amdtSeq");
		this.hashFields.put("apro_ref_usr_ofc_cd", "aproRefUsrOfcCd");
		this.hashFields.put("apro_ref_usr_id", "aproRefUsrId");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("apro_ref_tp_cd", "aproRefTpCd");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("apro_rqst_seq", "aproRqstSeq");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getIbflag() {
		return this.ibflag;
	}
	public String getPropNo() {
		return this.propNo;
	}
	public String getSvcScpCd() {
		return this.svcScpCd;
	}
	public String getAmdtSeq() {
		return this.amdtSeq;
	}
	public String getAproRefUsrOfcCd() {
		return this.aproRefUsrOfcCd;
	}
	public String getAproRefUsrId() {
		return this.aproRefUsrId;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getAproRefTpCd() {
		return this.aproRefTpCd;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getAproRqstSeq() {
		return this.aproRqstSeq;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setPropNo(String propNo) {
		this.propNo = propNo;
		//this.propNo=true;
	}
	public void setSvcScpCd(String svcScpCd) {
		this.svcScpCd = svcScpCd;
		//this.svcScpCd=true;
	}
	public void setAmdtSeq(String amdtSeq) {
		this.amdtSeq = amdtSeq;
		//this.amdtSeq=true;
	}
	public void setAproRefUsrOfcCd(String aproRefUsrOfcCd) {
		this.aproRefUsrOfcCd = aproRefUsrOfcCd;
		//this.aproRefUsrOfcCd=true;
	}
	public void setAproRefUsrId(String aproRefUsrId) {
		this.aproRefUsrId = aproRefUsrId;
		//this.aproRefUsrId=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setAproRefTpCd(String aproRefTpCd) {
		this.aproRefTpCd = aproRefTpCd;
		//this.aproRefTpCd=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setAproRqstSeq(String aproRqstSeq) {
		this.aproRqstSeq = aproRqstSeq;
		//this.aproRqstSeq=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setPropNo(JSPUtil.getParameter(request, "prop_no", ""));
		setSvcScpCd(JSPUtil.getParameter(request, "svc_scp_cd", ""));
		setAmdtSeq(JSPUtil.getParameter(request, "amdt_seq", ""));
		setAproRefUsrOfcCd(JSPUtil.getParameter(request, "apro_ref_usr_ofc_cd", ""));
		setAproRefUsrId(JSPUtil.getParameter(request, "apro_ref_usr_id", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setAproRefTpCd(JSPUtil.getParameter(request, "apro_ref_tp_cd", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setAproRqstSeq(JSPUtil.getParameter(request, "apro_rqst_seq", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public PriSpScpAproRefUsrVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public PriSpScpAproRefUsrVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		PriSpScpAproRefUsrVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] propNo = (JSPUtil.getParameter(request, prefix	+ "prop_no".trim(), length));
			String[] svcScpCd = (JSPUtil.getParameter(request, prefix	+ "svc_scp_cd".trim(), length));
			String[] amdtSeq = (JSPUtil.getParameter(request, prefix	+ "amdt_seq".trim(), length));
			String[] aproRefUsrOfcCd = (JSPUtil.getParameter(request, prefix	+ "apro_ref_usr_ofc_cd".trim(), length));
			String[] aproRefUsrId = (JSPUtil.getParameter(request, prefix	+ "apro_ref_usr_id".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] aproRefTpCd = (JSPUtil.getParameter(request, prefix	+ "apro_ref_tp_cd".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] aproRqstSeq = (JSPUtil.getParameter(request, prefix	+ "apro_rqst_seq".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new PriSpScpAproRefUsrVO();
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (propNo[i] != null)
					model.setPropNo(propNo[i]);
				if (svcScpCd[i] != null)
					model.setSvcScpCd(svcScpCd[i]);
				if (amdtSeq[i] != null)
					model.setAmdtSeq(amdtSeq[i]);
				if (aproRefUsrOfcCd[i] != null)
					model.setAproRefUsrOfcCd(aproRefUsrOfcCd[i]);
				if (aproRefUsrId[i] != null)
					model.setAproRefUsrId(aproRefUsrId[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (aproRefTpCd[i] != null)
					model.setAproRefTpCd(aproRefTpCd[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (aproRqstSeq[i] != null)
					model.setAproRqstSeq(aproRqstSeq[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getPriSpScpAproRefUsrVOs();
	}

	public PriSpScpAproRefUsrVO[] getPriSpScpAproRefUsrVOs(){
		PriSpScpAproRefUsrVO[] vos = (PriSpScpAproRefUsrVO[])models.toArray(new PriSpScpAproRefUsrVO[models.size()]);
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
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.propNo = this.propNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcScpCd = this.svcScpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.amdtSeq = this.amdtSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRefUsrOfcCd = this.aproRefUsrOfcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRefUsrId = this.aproRefUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRefTpCd = this.aproRefTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aproRqstSeq = this.aproRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
