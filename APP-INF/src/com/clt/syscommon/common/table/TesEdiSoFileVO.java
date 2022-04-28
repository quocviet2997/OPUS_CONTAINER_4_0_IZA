/*=========================================================
*Copyright(c) 2011 CyberLogitec
*@FileName : TesEdiSoFileVO.java
*@FileTitle : TesEdiSoFileVO
*Open Issues :
*Change history :
*@LastModifyDate : 2011.09.23
*@LastModifier : 
*@LastVersion : 1.0
* 2011.09.23  
* 1.0 Creation
=========================================================*/

package com.clt.syscommon.common.table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.clt.framework.component.common.AbstractValueObject;
import com.clt.framework.component.util.JSPUtil;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesEdiSoFileVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesEdiSoFileVO> models = new ArrayList<TesEdiSoFileVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String fileSavId = null;
	/* Column Info */
	private String savPathNm = null;
	/* Column Info */
	private String tmlEdiSoOfcCtyCd = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String savCfmFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String savFileNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String fileRmk = null;
	/* Column Info */
	private String orgFileNm = null;
	/* Column Info */
	private String fileSeq = null;
	/* Column Info */
	private String tmlSoSeq = null;
	/* Column Info */
	private String tmlEdiSoSeq = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String tmlSoOfcCtyCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesEdiSoFileVO() {}

	public TesEdiSoFileVO(String ibflag, String pagerows, String fileSeq, String orgFileNm, String savFileNm, String savPathNm, String tmlEdiSoOfcCtyCd, String tmlEdiSoSeq, String tmlSoOfcCtyCd, String tmlSoSeq, String savCfmFlg, String deltFlg, String fileRmk, String fileSavId, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.fileSavId = fileSavId;
		this.savPathNm = savPathNm;
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
		this.deltFlg = deltFlg;
		this.savCfmFlg = savCfmFlg;
		this.creDt = creDt;
		this.pagerows = pagerows;
		this.savFileNm = savFileNm;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.fileRmk = fileRmk;
		this.orgFileNm = orgFileNm;
		this.fileSeq = fileSeq;
		this.tmlSoSeq = tmlSoSeq;
		this.tmlEdiSoSeq = tmlEdiSoSeq;
		this.updUsrId = updUsrId;
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("file_sav_id", getFileSavId());
		this.hashColumns.put("sav_path_nm", getSavPathNm());
		this.hashColumns.put("tml_edi_so_ofc_cty_cd", getTmlEdiSoOfcCtyCd());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("sav_cfm_flg", getSavCfmFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("sav_file_nm", getSavFileNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("file_rmk", getFileRmk());
		this.hashColumns.put("org_file_nm", getOrgFileNm());
		this.hashColumns.put("file_seq", getFileSeq());
		this.hashColumns.put("tml_so_seq", getTmlSoSeq());
		this.hashColumns.put("tml_edi_so_seq", getTmlEdiSoSeq());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("tml_so_ofc_cty_cd", getTmlSoOfcCtyCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("file_sav_id", "fileSavId");
		this.hashFields.put("sav_path_nm", "savPathNm");
		this.hashFields.put("tml_edi_so_ofc_cty_cd", "tmlEdiSoOfcCtyCd");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("sav_cfm_flg", "savCfmFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("sav_file_nm", "savFileNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("file_rmk", "fileRmk");
		this.hashFields.put("org_file_nm", "orgFileNm");
		this.hashFields.put("file_seq", "fileSeq");
		this.hashFields.put("tml_so_seq", "tmlSoSeq");
		this.hashFields.put("tml_edi_so_seq", "tmlEdiSoSeq");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("tml_so_ofc_cty_cd", "tmlSoOfcCtyCd");
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
	 * @return fileSavId
	 */
	public String getFileSavId() {
		return this.fileSavId;
	}
	
	/**
	 * Column Info
	 * @return savPathNm
	 */
	public String getSavPathNm() {
		return this.savPathNm;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoOfcCtyCd
	 */
	public String getTmlEdiSoOfcCtyCd() {
		return this.tmlEdiSoOfcCtyCd;
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
	 * @return savCfmFlg
	 */
	public String getSavCfmFlg() {
		return this.savCfmFlg;
	}
	
	/**
	 * Column Info
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
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
	 * @return savFileNm
	 */
	public String getSavFileNm() {
		return this.savFileNm;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return fileRmk
	 */
	public String getFileRmk() {
		return this.fileRmk;
	}
	
	/**
	 * Column Info
	 * @return orgFileNm
	 */
	public String getOrgFileNm() {
		return this.orgFileNm;
	}
	
	/**
	 * Column Info
	 * @return fileSeq
	 */
	public String getFileSeq() {
		return this.fileSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlSoSeq
	 */
	public String getTmlSoSeq() {
		return this.tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @return tmlEdiSoSeq
	 */
	public String getTmlEdiSoSeq() {
		return this.tmlEdiSoSeq;
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
	 * @return tmlSoOfcCtyCd
	 */
	public String getTmlSoOfcCtyCd() {
		return this.tmlSoOfcCtyCd;
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
	 * @param fileSavId
	 */
	public void setFileSavId(String fileSavId) {
		this.fileSavId = fileSavId;
	}
	
	/**
	 * Column Info
	 * @param savPathNm
	 */
	public void setSavPathNm(String savPathNm) {
		this.savPathNm = savPathNm;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoOfcCtyCd
	 */
	public void setTmlEdiSoOfcCtyCd(String tmlEdiSoOfcCtyCd) {
		this.tmlEdiSoOfcCtyCd = tmlEdiSoOfcCtyCd;
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
	 * @param savCfmFlg
	 */
	public void setSavCfmFlg(String savCfmFlg) {
		this.savCfmFlg = savCfmFlg;
	}
	
	/**
	 * Column Info
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
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
	 * @param savFileNm
	 */
	public void setSavFileNm(String savFileNm) {
		this.savFileNm = savFileNm;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param fileRmk
	 */
	public void setFileRmk(String fileRmk) {
		this.fileRmk = fileRmk;
	}
	
	/**
	 * Column Info
	 * @param orgFileNm
	 */
	public void setOrgFileNm(String orgFileNm) {
		this.orgFileNm = orgFileNm;
	}
	
	/**
	 * Column Info
	 * @param fileSeq
	 */
	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlSoSeq
	 */
	public void setTmlSoSeq(String tmlSoSeq) {
		this.tmlSoSeq = tmlSoSeq;
	}
	
	/**
	 * Column Info
	 * @param tmlEdiSoSeq
	 */
	public void setTmlEdiSoSeq(String tmlEdiSoSeq) {
		this.tmlEdiSoSeq = tmlEdiSoSeq;
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
	 * @param tmlSoOfcCtyCd
	 */
	public void setTmlSoOfcCtyCd(String tmlSoOfcCtyCd) {
		this.tmlSoOfcCtyCd = tmlSoOfcCtyCd;
	}
	
/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		fromRequest(request,"");
	}

	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request, String prefix) {
		setUpdDt(JSPUtil.getParameter(request, prefix + "upd_dt", ""));
		setFileSavId(JSPUtil.getParameter(request, prefix + "file_sav_id", ""));
		setSavPathNm(JSPUtil.getParameter(request, prefix + "sav_path_nm", ""));
		setTmlEdiSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_edi_so_ofc_cty_cd", ""));
		setDeltFlg(JSPUtil.getParameter(request, prefix + "delt_flg", ""));
		setSavCfmFlg(JSPUtil.getParameter(request, prefix + "sav_cfm_flg", ""));
		setCreDt(JSPUtil.getParameter(request, prefix + "cre_dt", ""));
		setPagerows(JSPUtil.getParameter(request, prefix + "pagerows", ""));
		setSavFileNm(JSPUtil.getParameter(request, prefix + "sav_file_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, prefix + "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, prefix + "ibflag", ""));
		setFileRmk(JSPUtil.getParameter(request, prefix + "file_rmk", ""));
		setOrgFileNm(JSPUtil.getParameter(request, prefix + "org_file_nm", ""));
		setFileSeq(JSPUtil.getParameter(request, prefix + "file_seq", ""));
		setTmlSoSeq(JSPUtil.getParameter(request, prefix + "tml_so_seq", ""));
		setTmlEdiSoSeq(JSPUtil.getParameter(request, prefix + "tml_edi_so_seq", ""));
		setUpdUsrId(JSPUtil.getParameter(request, prefix + "upd_usr_id", ""));
		setTmlSoOfcCtyCd(JSPUtil.getParameter(request, prefix + "tml_so_ofc_cty_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesEdiSoFileVO[]
	 */
	public TesEdiSoFileVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesEdiSoFileVO[]
	 */
	public TesEdiSoFileVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesEdiSoFileVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] fileSavId = (JSPUtil.getParameter(request, prefix	+ "file_sav_id", length));
			String[] savPathNm = (JSPUtil.getParameter(request, prefix	+ "sav_path_nm", length));
			String[] tmlEdiSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_ofc_cty_cd", length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg", length));
			String[] savCfmFlg = (JSPUtil.getParameter(request, prefix	+ "sav_cfm_flg", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] savFileNm = (JSPUtil.getParameter(request, prefix	+ "sav_file_nm", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] fileRmk = (JSPUtil.getParameter(request, prefix	+ "file_rmk", length));
			String[] orgFileNm = (JSPUtil.getParameter(request, prefix	+ "org_file_nm", length));
			String[] fileSeq = (JSPUtil.getParameter(request, prefix	+ "file_seq", length));
			String[] tmlSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_so_seq", length));
			String[] tmlEdiSoSeq = (JSPUtil.getParameter(request, prefix	+ "tml_edi_so_seq", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] tmlSoOfcCtyCd = (JSPUtil.getParameter(request, prefix	+ "tml_so_ofc_cty_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesEdiSoFileVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (fileSavId[i] != null)
					model.setFileSavId(fileSavId[i]);
				if (savPathNm[i] != null)
					model.setSavPathNm(savPathNm[i]);
				if (tmlEdiSoOfcCtyCd[i] != null)
					model.setTmlEdiSoOfcCtyCd(tmlEdiSoOfcCtyCd[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (savCfmFlg[i] != null)
					model.setSavCfmFlg(savCfmFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (savFileNm[i] != null)
					model.setSavFileNm(savFileNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (fileRmk[i] != null)
					model.setFileRmk(fileRmk[i]);
				if (orgFileNm[i] != null)
					model.setOrgFileNm(orgFileNm[i]);
				if (fileSeq[i] != null)
					model.setFileSeq(fileSeq[i]);
				if (tmlSoSeq[i] != null)
					model.setTmlSoSeq(tmlSoSeq[i]);
				if (tmlEdiSoSeq[i] != null)
					model.setTmlEdiSoSeq(tmlEdiSoSeq[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (tmlSoOfcCtyCd[i] != null)
					model.setTmlSoOfcCtyCd(tmlSoOfcCtyCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesEdiSoFileVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesEdiSoFileVO[]
	 */
	public TesEdiSoFileVO[] getTesEdiSoFileVOs(){
		TesEdiSoFileVO[] vos = (TesEdiSoFileVO[])models.toArray(new TesEdiSoFileVO[models.size()]);
		return vos;
	}
	
	/**
	 * VO Class의 내용을 String으로 변환
	 */
	public String toString() {
		   return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE );
	   }

	/**
	* 포맷팅된 문자열에서 특수문자 제거("-","/",",",":")
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileSavId = this.fileSavId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.savPathNm = this.savPathNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoOfcCtyCd = this.tmlEdiSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.savCfmFlg = this.savCfmFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.savFileNm = this.savFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileRmk = this.fileRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.orgFileNm = this.orgFileNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fileSeq = this.fileSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoSeq = this.tmlSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlEdiSoSeq = this.tmlEdiSoSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlSoOfcCtyCd = this.tmlSoOfcCtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
