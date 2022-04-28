/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEdoPtyTrspVO.java
*@FileTitle : BkgEdoPtyTrspVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.06.25
*@LastModifier : 안진응
*@LastVersion : 1.0
* 2009.06.25 안진응 
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
 * @author 안진응
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class BkgEdoPtyTrspVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEdoPtyTrspVO> models = new ArrayList<BkgEdoPtyTrspVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String ptyNm2 = null;
	/* Column Info */
	private String phnNo = null;
	/* Column Info */
	private String ptyNm3 = null;
	/* Column Info */
	private String ptyNm1 = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edoPtyCd = null;
	/* Column Info */
	private String ptyAddr1 = null;
	/* Column Info */
	private String ptyAddr3 = null;
	/* Column Info */
	private String ptyRepNm = null;
	/* Column Info */
	private String ptyAddr2 = null;
	/* Column Info */
	private String edoRqstSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String edoRqstNo = null;
	/* Column Info */
	private String ptyCntcPsonNm = null;
	/* Column Info */
	private String ptyRgstNo = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEdoPtyTrspVO() {}

	public BkgEdoPtyTrspVO(String ibflag, String pagerows, String edoRqstNo, String edoRqstSeq, String edoPtyCd, String ptyRgstNo, String ptyCntcPsonNm, String ptyRepNm, String phnNo, String ptyNm1, String ptyNm2, String ptyNm3, String ptyAddr1, String ptyAddr2, String ptyAddr3, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.ptyNm2 = ptyNm2;
		this.phnNo = phnNo;
		this.ptyNm3 = ptyNm3;
		this.ptyNm1 = ptyNm1;
		this.creDt = creDt;
		this.edoPtyCd = edoPtyCd;
		this.ptyAddr1 = ptyAddr1;
		this.ptyAddr3 = ptyAddr3;
		this.ptyRepNm = ptyRepNm;
		this.ptyAddr2 = ptyAddr2;
		this.edoRqstSeq = edoRqstSeq;
		this.pagerows = pagerows;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.edoRqstNo = edoRqstNo;
		this.ptyCntcPsonNm = ptyCntcPsonNm;
		this.ptyRgstNo = ptyRgstNo;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("pty_nm2", getPtyNm2());
		this.hashColumns.put("phn_no", getPhnNo());
		this.hashColumns.put("pty_nm3", getPtyNm3());
		this.hashColumns.put("pty_nm1", getPtyNm1());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edo_pty_cd", getEdoPtyCd());
		this.hashColumns.put("pty_addr1", getPtyAddr1());
		this.hashColumns.put("pty_addr3", getPtyAddr3());
		this.hashColumns.put("pty_rep_nm", getPtyRepNm());
		this.hashColumns.put("pty_addr2", getPtyAddr2());
		this.hashColumns.put("edo_rqst_seq", getEdoRqstSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edo_rqst_no", getEdoRqstNo());
		this.hashColumns.put("pty_cntc_pson_nm", getPtyCntcPsonNm());
		this.hashColumns.put("pty_rgst_no", getPtyRgstNo());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("pty_nm2", "ptyNm2");
		this.hashFields.put("phn_no", "phnNo");
		this.hashFields.put("pty_nm3", "ptyNm3");
		this.hashFields.put("pty_nm1", "ptyNm1");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edo_pty_cd", "edoPtyCd");
		this.hashFields.put("pty_addr1", "ptyAddr1");
		this.hashFields.put("pty_addr3", "ptyAddr3");
		this.hashFields.put("pty_rep_nm", "ptyRepNm");
		this.hashFields.put("pty_addr2", "ptyAddr2");
		this.hashFields.put("edo_rqst_seq", "edoRqstSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edo_rqst_no", "edoRqstNo");
		this.hashFields.put("pty_cntc_pson_nm", "ptyCntcPsonNm");
		this.hashFields.put("pty_rgst_no", "ptyRgstNo");
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
	 * @return ptyNm2
	 */
	public String getPtyNm2() {
		return this.ptyNm2;
	}
	
	/**
	 * Column Info
	 * @return phnNo
	 */
	public String getPhnNo() {
		return this.phnNo;
	}
	
	/**
	 * Column Info
	 * @return ptyNm3
	 */
	public String getPtyNm3() {
		return this.ptyNm3;
	}
	
	/**
	 * Column Info
	 * @return ptyNm1
	 */
	public String getPtyNm1() {
		return this.ptyNm1;
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
	 * @return edoPtyCd
	 */
	public String getEdoPtyCd() {
		return this.edoPtyCd;
	}
	
	/**
	 * Column Info
	 * @return ptyAddr1
	 */
	public String getPtyAddr1() {
		return this.ptyAddr1;
	}
	
	/**
	 * Column Info
	 * @return ptyAddr3
	 */
	public String getPtyAddr3() {
		return this.ptyAddr3;
	}
	
	/**
	 * Column Info
	 * @return ptyRepNm
	 */
	public String getPtyRepNm() {
		return this.ptyRepNm;
	}
	
	/**
	 * Column Info
	 * @return ptyAddr2
	 */
	public String getPtyAddr2() {
		return this.ptyAddr2;
	}
	
	/**
	 * Column Info
	 * @return edoRqstSeq
	 */
	public String getEdoRqstSeq() {
		return this.edoRqstSeq;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @return ibflag
	 */
	public String getIbflag() {
		return this.ibflag;
	}
	
	/**
	 * Column Info
	 * @return edoRqstNo
	 */
	public String getEdoRqstNo() {
		return this.edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @return ptyCntcPsonNm
	 */
	public String getPtyCntcPsonNm() {
		return this.ptyCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @return ptyRgstNo
	 */
	public String getPtyRgstNo() {
		return this.ptyRgstNo;
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
	 * @param ptyNm2
	 */
	public void setPtyNm2(String ptyNm2) {
		this.ptyNm2 = ptyNm2;
	}
	
	/**
	 * Column Info
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}
	
	/**
	 * Column Info
	 * @param ptyNm3
	 */
	public void setPtyNm3(String ptyNm3) {
		this.ptyNm3 = ptyNm3;
	}
	
	/**
	 * Column Info
	 * @param ptyNm1
	 */
	public void setPtyNm1(String ptyNm1) {
		this.ptyNm1 = ptyNm1;
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
	 * @param edoPtyCd
	 */
	public void setEdoPtyCd(String edoPtyCd) {
		this.edoPtyCd = edoPtyCd;
	}
	
	/**
	 * Column Info
	 * @param ptyAddr1
	 */
	public void setPtyAddr1(String ptyAddr1) {
		this.ptyAddr1 = ptyAddr1;
	}
	
	/**
	 * Column Info
	 * @param ptyAddr3
	 */
	public void setPtyAddr3(String ptyAddr3) {
		this.ptyAddr3 = ptyAddr3;
	}
	
	/**
	 * Column Info
	 * @param ptyRepNm
	 */
	public void setPtyRepNm(String ptyRepNm) {
		this.ptyRepNm = ptyRepNm;
	}
	
	/**
	 * Column Info
	 * @param ptyAddr2
	 */
	public void setPtyAddr2(String ptyAddr2) {
		this.ptyAddr2 = ptyAddr2;
	}
	
	/**
	 * Column Info
	 * @param edoRqstSeq
	 */
	public void setEdoRqstSeq(String edoRqstSeq) {
		this.edoRqstSeq = edoRqstSeq;
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
	 * VO Data Value( C:Creation, U:Update, D:Delete )
	 * @param ibflag
	 */
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
	}
	
	/**
	 * Column Info
	 * @param edoRqstNo
	 */
	public void setEdoRqstNo(String edoRqstNo) {
		this.edoRqstNo = edoRqstNo;
	}
	
	/**
	 * Column Info
	 * @param ptyCntcPsonNm
	 */
	public void setPtyCntcPsonNm(String ptyCntcPsonNm) {
		this.ptyCntcPsonNm = ptyCntcPsonNm;
	}
	
	/**
	 * Column Info
	 * @param ptyRgstNo
	 */
	public void setPtyRgstNo(String ptyRgstNo) {
		this.ptyRgstNo = ptyRgstNo;
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
		setPtyNm2(JSPUtil.getParameter(request, "pty_nm2", ""));
		setPhnNo(JSPUtil.getParameter(request, "phn_no", ""));
		setPtyNm3(JSPUtil.getParameter(request, "pty_nm3", ""));
		setPtyNm1(JSPUtil.getParameter(request, "pty_nm1", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEdoPtyCd(JSPUtil.getParameter(request, "edo_pty_cd", ""));
		setPtyAddr1(JSPUtil.getParameter(request, "pty_addr1", ""));
		setPtyAddr3(JSPUtil.getParameter(request, "pty_addr3", ""));
		setPtyRepNm(JSPUtil.getParameter(request, "pty_rep_nm", ""));
		setPtyAddr2(JSPUtil.getParameter(request, "pty_addr2", ""));
		setEdoRqstSeq(JSPUtil.getParameter(request, "edo_rqst_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEdoRqstNo(JSPUtil.getParameter(request, "edo_rqst_no", ""));
		setPtyCntcPsonNm(JSPUtil.getParameter(request, "pty_cntc_pson_nm", ""));
		setPtyRgstNo(JSPUtil.getParameter(request, "pty_rgst_no", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEdoPtyTrspVO[]
	 */
	public BkgEdoPtyTrspVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEdoPtyTrspVO[]
	 */
	public BkgEdoPtyTrspVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEdoPtyTrspVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] ptyNm2 = (JSPUtil.getParameter(request, prefix	+ "pty_nm2", length));
			String[] phnNo = (JSPUtil.getParameter(request, prefix	+ "phn_no", length));
			String[] ptyNm3 = (JSPUtil.getParameter(request, prefix	+ "pty_nm3", length));
			String[] ptyNm1 = (JSPUtil.getParameter(request, prefix	+ "pty_nm1", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edoPtyCd = (JSPUtil.getParameter(request, prefix	+ "edo_pty_cd", length));
			String[] ptyAddr1 = (JSPUtil.getParameter(request, prefix	+ "pty_addr1", length));
			String[] ptyAddr3 = (JSPUtil.getParameter(request, prefix	+ "pty_addr3", length));
			String[] ptyRepNm = (JSPUtil.getParameter(request, prefix	+ "pty_rep_nm", length));
			String[] ptyAddr2 = (JSPUtil.getParameter(request, prefix	+ "pty_addr2", length));
			String[] edoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] edoRqstNo = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_no", length));
			String[] ptyCntcPsonNm = (JSPUtil.getParameter(request, prefix	+ "pty_cntc_pson_nm", length));
			String[] ptyRgstNo = (JSPUtil.getParameter(request, prefix	+ "pty_rgst_no", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEdoPtyTrspVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (ptyNm2[i] != null)
					model.setPtyNm2(ptyNm2[i]);
				if (phnNo[i] != null)
					model.setPhnNo(phnNo[i]);
				if (ptyNm3[i] != null)
					model.setPtyNm3(ptyNm3[i]);
				if (ptyNm1[i] != null)
					model.setPtyNm1(ptyNm1[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edoPtyCd[i] != null)
					model.setEdoPtyCd(edoPtyCd[i]);
				if (ptyAddr1[i] != null)
					model.setPtyAddr1(ptyAddr1[i]);
				if (ptyAddr3[i] != null)
					model.setPtyAddr3(ptyAddr3[i]);
				if (ptyRepNm[i] != null)
					model.setPtyRepNm(ptyRepNm[i]);
				if (ptyAddr2[i] != null)
					model.setPtyAddr2(ptyAddr2[i]);
				if (edoRqstSeq[i] != null)
					model.setEdoRqstSeq(edoRqstSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (edoRqstNo[i] != null)
					model.setEdoRqstNo(edoRqstNo[i]);
				if (ptyCntcPsonNm[i] != null)
					model.setPtyCntcPsonNm(ptyCntcPsonNm[i]);
				if (ptyRgstNo[i] != null)
					model.setPtyRgstNo(ptyRgstNo[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEdoPtyTrspVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEdoPtyTrspVO[]
	 */
	public BkgEdoPtyTrspVO[] getBkgEdoPtyTrspVOs(){
		BkgEdoPtyTrspVO[] vos = (BkgEdoPtyTrspVO[])models.toArray(new BkgEdoPtyTrspVO[models.size()]);
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
		this.ptyNm2 = this.ptyNm2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.phnNo = this.phnNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyNm3 = this.ptyNm3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyNm1 = this.ptyNm1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoPtyCd = this.edoPtyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyAddr1 = this.ptyAddr1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyAddr3 = this.ptyAddr3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyRepNm = this.ptyRepNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyAddr2 = this.ptyAddr2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstSeq = this.edoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstNo = this.edoRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyCntcPsonNm = this.ptyCntcPsonNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ptyRgstNo = this.ptyRgstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
