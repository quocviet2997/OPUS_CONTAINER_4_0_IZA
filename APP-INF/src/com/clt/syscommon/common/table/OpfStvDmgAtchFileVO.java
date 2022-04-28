/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfStvDmgAtchFileVO.java
*@FileTitle : OpfStvDmgAtchFileVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.25
*@LastModifier : 이선영
*@LastVersion : 1.0
* 2009.06.25 이선영 
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
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 이선영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class OpfStvDmgAtchFileVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfStvDmgAtchFileVO> models = new ArrayList<OpfStvDmgAtchFileVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String fileSavId = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stvDmgAtchFileSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String stvDmgAtchFileTpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String stvDmgProcCd = null;
	/* Column Info */
	private String fileNm = null;
	/* Column Info */
	private String stvDmgNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfStvDmgAtchFileVO() {}

	public OpfStvDmgAtchFileVO(String ibflag, String pagerows, String stvDmgNo, String stvDmgProcCd, String stvDmgAtchFileTpCd, String stvDmgAtchFileSeq, String vslCd, String fileNm, String fileSavId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.fileSavId = fileSavId;
		this.creDt = creDt;
		this.stvDmgAtchFileSeq = stvDmgAtchFileSeq;
		this.pagerows = pagerows;
		this.stvDmgAtchFileTpCd = stvDmgAtchFileTpCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.stvDmgProcCd = stvDmgProcCd;
		this.fileNm = fileNm;
		this.stvDmgNo = stvDmgNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("file_sav_id", getFileSavId());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stv_dmg_atch_file_seq", getStvDmgAtchFileSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("stv_dmg_atch_file_tp_cd", getStvDmgAtchFileTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("stv_dmg_proc_cd", getStvDmgProcCd());
		this.hashColumns.put("file_nm", getFileNm());
		this.hashColumns.put("stv_dmg_no", getStvDmgNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("file_sav_id", "fileSavId");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stv_dmg_atch_file_seq", "stvDmgAtchFileSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("stv_dmg_atch_file_tp_cd", "stvDmgAtchFileTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("stv_dmg_proc_cd", "stvDmgProcCd");
		this.hashFields.put("file_nm", "fileNm");
		this.hashFields.put("stv_dmg_no", "stvDmgNo");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return vslCd
	 */
	public String getVslCd() {
		return this.vslCd;
	}
	
	/**
	 * Column Info
	 * @return fileSavId
	 */
	public String getFileSavId() {
		return this.fileSavId;
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
	 * @return stvDmgAtchFileSeq
	 */
	public String getStvDmgAtchFileSeq() {
		return this.stvDmgAtchFileSeq;
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
	 * @return stvDmgAtchFileTpCd
	 */
	public String getStvDmgAtchFileTpCd() {
		return this.stvDmgAtchFileTpCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return stvDmgProcCd
	 */
	public String getStvDmgProcCd() {
		return this.stvDmgProcCd;
	}
	
	/**
	 * Column Info
	 * @return fileNm
	 */
	public String getFileNm() {
		return this.fileNm;
	}
	
	/**
	 * Column Info
	 * @return stvDmgNo
	 */
	public String getStvDmgNo() {
		return this.stvDmgNo;
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
	 * @param vslCd
	 */
	public void setVslCd(String vslCd) {
		this.vslCd = vslCd;
	}
	
	/**
	 * Column Info
	 * @param fileSavId
	 */
	public void setFileSavId(String fileSavId) {
		this.fileSavId = fileSavId;
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
	 * @param stvDmgAtchFileSeq
	 */
	public void setStvDmgAtchFileSeq(String stvDmgAtchFileSeq) {
		this.stvDmgAtchFileSeq = stvDmgAtchFileSeq;
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
	 * @param stvDmgAtchFileTpCd
	 */
	public void setStvDmgAtchFileTpCd(String stvDmgAtchFileTpCd) {
		this.stvDmgAtchFileTpCd = stvDmgAtchFileTpCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param stvDmgProcCd
	 */
	public void setStvDmgProcCd(String stvDmgProcCd) {
		this.stvDmgProcCd = stvDmgProcCd;
	}
	
	/**
	 * Column Info
	 * @param fileNm
	 */
	public void setFileNm(String fileNm) {
		this.fileNm = fileNm;
	}
	
	/**
	 * Column Info
	 * @param stvDmgNo
	 */
	public void setStvDmgNo(String stvDmgNo) {
		this.stvDmgNo = stvDmgNo;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setFileSavId(JSPUtil.getParameter(request, "file_sav_id", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStvDmgAtchFileSeq(JSPUtil.getParameter(request, "stv_dmg_atch_file_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setStvDmgAtchFileTpCd(JSPUtil.getParameter(request, "stv_dmg_atch_file_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setStvDmgProcCd(JSPUtil.getParameter(request, "stv_dmg_proc_cd", ""));
		setFileNm(JSPUtil.getParameter(request, "file_nm", ""));
		setStvDmgNo(JSPUtil.getParameter(request, "stv_dmg_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return OpfStvDmgAtchFileVO[]
	 */
	public OpfStvDmgAtchFileVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfStvDmgAtchFileVO[]
	 */
	public OpfStvDmgAtchFileVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfStvDmgAtchFileVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] fileSavId = (JSPUtil.getParameter(request, prefix	+ "file_sav_id", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] stvDmgAtchFileSeq = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_atch_file_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] stvDmgAtchFileTpCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_atch_file_tp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] stvDmgProcCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_proc_cd", length));
			String[] fileNm = (JSPUtil.getParameter(request, prefix	+ "file_nm", length));
			String[] stvDmgNo = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfStvDmgAtchFileVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (fileSavId[i] != null)
					model.setFileSavId(fileSavId[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stvDmgAtchFileSeq[i] != null)
					model.setStvDmgAtchFileSeq(stvDmgAtchFileSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (stvDmgAtchFileTpCd[i] != null)
					model.setStvDmgAtchFileTpCd(stvDmgAtchFileTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (stvDmgProcCd[i] != null)
					model.setStvDmgProcCd(stvDmgProcCd[i]);
				if (fileNm[i] != null)
					model.setFileNm(fileNm[i]);
				if (stvDmgNo[i] != null)
					model.setStvDmgNo(stvDmgNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfStvDmgAtchFileVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return OpfStvDmgAtchFileVO[]
	 */
	public OpfStvDmgAtchFileVO[] getOpfStvDmgAtchFileVOs(){
		OpfStvDmgAtchFileVO[] vos = (OpfStvDmgAtchFileVO[])models.toArray(new OpfStvDmgAtchFileVO[models.size()]);
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
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileSavId = this.fileSavId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgAtchFileSeq = this.stvDmgAtchFileSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgAtchFileTpCd = this.stvDmgAtchFileTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgProcCd = this.stvDmgProcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileNm = this.fileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgNo = this.stvDmgNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
