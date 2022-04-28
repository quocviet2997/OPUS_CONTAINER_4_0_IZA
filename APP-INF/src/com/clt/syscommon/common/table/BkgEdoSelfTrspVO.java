/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : BkgEdoSelfTrspVO.java
*@FileTitle : BkgEdoSelfTrspVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.07.01
*@LastModifier : 안진응
*@LastVersion : 1.0
* 2009.07.01 안진응 
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

public class BkgEdoSelfTrspVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<BkgEdoSelfTrspVO> models = new ArrayList<BkgEdoSelfTrspVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String bdDepAreaNo = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String edoRqstSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String ownTrspCd = null;
	/* Column Info */
	private String bdArrAreaNm = null;
	/* Column Info */
	private String gdsDesc3 = null;
	/* Column Info */
	private String gdsDesc4 = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String edoRqstNo = null;
	/* Column Info */
	private String edoIssDt = null;
	/* Column Info */
	private String bdArrAreaNo = null;
	/* Column Info */
	private String gdsDesc1 = null;
	/* Column Info */
	private String gdsDesc2 = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String miscDesc = null;
	/* Column Info */
	private String bdDepAreaVndrNm = null;
	/* Column Info */
	private String bdArrAreaVndrNm = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public BkgEdoSelfTrspVO() {}

	public BkgEdoSelfTrspVO(String ibflag, String pagerows, String edoRqstNo, String edoRqstSeq, String ownTrspCd, String edoIssDt, String bdDepAreaNo, String bdArrAreaNo, String bdArrAreaNm, String gdsDesc1, String gdsDesc2, String gdsDesc3, String gdsDesc4, String miscDesc, String creUsrId, String creDt, String updUsrId, String updDt, String bdDepAreaVndrNm, String bdArrAreaVndrNm) {
		this.updDt = updDt;
		this.bdDepAreaNo = bdDepAreaNo;
		this.creDt = creDt;
		this.edoRqstSeq = edoRqstSeq;
		this.pagerows = pagerows;
		this.ownTrspCd = ownTrspCd;
		this.bdArrAreaNm = bdArrAreaNm;
		this.gdsDesc3 = gdsDesc3;
		this.gdsDesc4 = gdsDesc4;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.edoRqstNo = edoRqstNo;
		this.edoIssDt = edoIssDt;
		this.bdArrAreaNo = bdArrAreaNo;
		this.gdsDesc1 = gdsDesc1;
		this.gdsDesc2 = gdsDesc2;
		this.updUsrId = updUsrId;
		this.miscDesc = miscDesc;
		this.bdDepAreaVndrNm = bdDepAreaVndrNm;
		this.bdArrAreaVndrNm = bdArrAreaVndrNm;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("bd_dep_area_no", getBdDepAreaNo());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("edo_rqst_seq", getEdoRqstSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("own_trsp_cd", getOwnTrspCd());
		this.hashColumns.put("bd_arr_area_nm", getBdArrAreaNm());
		this.hashColumns.put("gds_desc3", getGdsDesc3());
		this.hashColumns.put("gds_desc4", getGdsDesc4());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("edo_rqst_no", getEdoRqstNo());
		this.hashColumns.put("edo_iss_dt", getEdoIssDt());
		this.hashColumns.put("bd_arr_area_no", getBdArrAreaNo());
		this.hashColumns.put("gds_desc1", getGdsDesc1());
		this.hashColumns.put("gds_desc2", getGdsDesc2());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("misc_desc", getMiscDesc());
		this.hashColumns.put("bd_dep_area_vndr_nm", getBdDepAreaVndrNm());
		this.hashColumns.put("bd_arr_area_vndr_nm", getBdArrAreaVndrNm());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("bd_dep_area_no", "bdDepAreaNo");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("edo_rqst_seq", "edoRqstSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("own_trsp_cd", "ownTrspCd");
		this.hashFields.put("bd_arr_area_nm", "bdArrAreaNm");
		this.hashFields.put("gds_desc3", "gdsDesc3");
		this.hashFields.put("gds_desc4", "gdsDesc4");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("edo_rqst_no", "edoRqstNo");
		this.hashFields.put("edo_iss_dt", "edoIssDt");
		this.hashFields.put("bd_arr_area_no", "bdArrAreaNo");
		this.hashFields.put("gds_desc1", "gdsDesc1");
		this.hashFields.put("gds_desc2", "gdsDesc2");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("misc_desc", "miscDesc");
		this.hashFields.put("bd_dep_area_vndr_nm", "bdDepAreaVndrNm");
		this.hashFields.put("bd_arr_area_vndr_nm", "bdArrAreaVndrNm");
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
	 * @return bdDepAreaNo
	 */
	public String getBdDepAreaNo() {
		return this.bdDepAreaNo;
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
	 * @return ownTrspCd
	 */
	public String getOwnTrspCd() {
		return this.ownTrspCd;
	}
	
	/**
	 * Column Info
	 * @return bdArrAreaNm
	 */
	public String getBdArrAreaNm() {
		return this.bdArrAreaNm;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc3
	 */
	public String getGdsDesc3() {
		return this.gdsDesc3;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc4
	 */
	public String getGdsDesc4() {
		return this.gdsDesc4;
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
	 * @return edoIssDt
	 */
	public String getEdoIssDt() {
		return this.edoIssDt;
	}
	
	/**
	 * Column Info
	 * @return bdArrAreaNo
	 */
	public String getBdArrAreaNo() {
		return this.bdArrAreaNo;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc1
	 */
	public String getGdsDesc1() {
		return this.gdsDesc1;
	}
	
	/**
	 * Column Info
	 * @return gdsDesc2
	 */
	public String getGdsDesc2() {
		return this.gdsDesc2;
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
	 * @return miscDesc
	 */
	public String getBdDepAreaVndrNm() {
		return this.bdDepAreaVndrNm;
	}
	
	/**
	 * Column Info
	 * @return miscDesc
	 */
	public String getBdArrAreaVndrNm() {
		return this.bdArrAreaVndrNm;
	}
	
	/**
	 * Column Info
	 * @return miscDesc
	 */
	public String getMiscDesc() {
		return this.miscDesc;
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
	 * @param bdDepAreaNo
	 */
	public void setBdDepAreaNo(String bdDepAreaNo) {
		this.bdDepAreaNo = bdDepAreaNo;
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
	 * @param ownTrspCd
	 */
	public void setOwnTrspCd(String ownTrspCd) {
		this.ownTrspCd = ownTrspCd;
	}
	
	/**
	 * Column Info
	 * @param bdArrAreaNm
	 */
	public void setBdArrAreaNm(String bdArrAreaNm) {
		this.bdArrAreaNm = bdArrAreaNm;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc3
	 */
	public void setGdsDesc3(String gdsDesc3) {
		this.gdsDesc3 = gdsDesc3;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc4
	 */
	public void setGdsDesc4(String gdsDesc4) {
		this.gdsDesc4 = gdsDesc4;
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
	 * @param edoIssDt
	 */
	public void setEdoIssDt(String edoIssDt) {
		this.edoIssDt = edoIssDt;
	}
	
	/**
	 * Column Info
	 * @param bdArrAreaNo
	 */
	public void setBdArrAreaNo(String bdArrAreaNo) {
		this.bdArrAreaNo = bdArrAreaNo;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc1
	 */
	public void setGdsDesc1(String gdsDesc1) {
		this.gdsDesc1 = gdsDesc1;
	}
	
	/**
	 * Column Info
	 * @param gdsDesc2
	 */
	public void setGdsDesc2(String gdsDesc2) {
		this.gdsDesc2 = gdsDesc2;
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
	 * @param miscDesc
	 */
	public void setMiscDesc(String miscDesc) {
		this.miscDesc = miscDesc;
	}

	/**
	 * Column Info
	 * @param bdDepAreaVndrNm
	 */
	public void setBdDepAreaVndrNm(String bdDepAreaVndrNm) {
		this.bdDepAreaVndrNm = bdDepAreaVndrNm;
	}

	/**
	 * Column Info
	 * @param bdArrAreaVndrNm
	 */
	public void setBdArrAreaVndrNm(String bdArrAreaVndrNm) {
		this.bdArrAreaVndrNm = bdArrAreaVndrNm;
	}	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setBdDepAreaNo(JSPUtil.getParameter(request, "bd_dep_area_no", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setEdoRqstSeq(JSPUtil.getParameter(request, "edo_rqst_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setOwnTrspCd(JSPUtil.getParameter(request, "own_trsp_cd", ""));
		setBdArrAreaNm(JSPUtil.getParameter(request, "bd_arr_area_nm", ""));
		setGdsDesc3(JSPUtil.getParameter(request, "gds_desc3", ""));
		setGdsDesc4(JSPUtil.getParameter(request, "gds_desc4", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setEdoRqstNo(JSPUtil.getParameter(request, "edo_rqst_no", ""));
		setEdoIssDt(JSPUtil.getParameter(request, "edo_iss_dt", ""));
		setBdArrAreaNo(JSPUtil.getParameter(request, "bd_arr_area_no", ""));
		setGdsDesc1(JSPUtil.getParameter(request, "gds_desc1", ""));
		setGdsDesc2(JSPUtil.getParameter(request, "gds_desc2", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setMiscDesc(JSPUtil.getParameter(request, "misc_desc", ""));
		setBdDepAreaVndrNm(JSPUtil.getParameter(request, "bd_dep_area_vndr_nm", ""));
		setBdArrAreaVndrNm(JSPUtil.getParameter(request, "bd_arr_area_vndr_nm", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return BkgEdoSelfTrspVO[]
	 */
	public BkgEdoSelfTrspVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return BkgEdoSelfTrspVO[]
	 */
	public BkgEdoSelfTrspVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		BkgEdoSelfTrspVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] bdDepAreaNo = (JSPUtil.getParameter(request, prefix	+ "bd_dep_area_no", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] edoRqstSeq = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_seq", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ownTrspCd = (JSPUtil.getParameter(request, prefix	+ "own_trsp_cd", length));
			String[] bdArrAreaNm = (JSPUtil.getParameter(request, prefix	+ "bd_arr_area_nm", length));
			String[] gdsDesc3 = (JSPUtil.getParameter(request, prefix	+ "gds_desc3", length));
			String[] gdsDesc4 = (JSPUtil.getParameter(request, prefix	+ "gds_desc4", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] edoRqstNo = (JSPUtil.getParameter(request, prefix	+ "edo_rqst_no", length));
			String[] edoIssDt = (JSPUtil.getParameter(request, prefix	+ "edo_iss_dt", length));
			String[] bdArrAreaNo = (JSPUtil.getParameter(request, prefix	+ "bd_arr_area_no", length));
			String[] gdsDesc1 = (JSPUtil.getParameter(request, prefix	+ "gds_desc1", length));
			String[] gdsDesc2 = (JSPUtil.getParameter(request, prefix	+ "gds_desc2", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] miscDesc = (JSPUtil.getParameter(request, prefix	+ "misc_desc", length));
			String[] bdDepAreaVndrNm = (JSPUtil.getParameter(request, prefix	+ "bd_dep_area_vndr_nm", length));
			String[] bdArrAreaVndrNm = (JSPUtil.getParameter(request, prefix	+ "bd_arr_area_vndr_nm", length));
			
			for (int i = 0; i < length; i++) {
				model = new BkgEdoSelfTrspVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (bdDepAreaNo[i] != null)
					model.setBdDepAreaNo(bdDepAreaNo[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (edoRqstSeq[i] != null)
					model.setEdoRqstSeq(edoRqstSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ownTrspCd[i] != null)
					model.setOwnTrspCd(ownTrspCd[i]);
				if (bdArrAreaNm[i] != null)
					model.setBdArrAreaNm(bdArrAreaNm[i]);
				if (gdsDesc3[i] != null)
					model.setGdsDesc3(gdsDesc3[i]);
				if (gdsDesc4[i] != null)
					model.setGdsDesc4(gdsDesc4[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (edoRqstNo[i] != null)
					model.setEdoRqstNo(edoRqstNo[i]);
				if (edoIssDt[i] != null)
					model.setEdoIssDt(edoIssDt[i]);
				if (bdArrAreaNo[i] != null)
					model.setBdArrAreaNo(bdArrAreaNo[i]);
				if (gdsDesc1[i] != null)
					model.setGdsDesc1(gdsDesc1[i]);
				if (gdsDesc2[i] != null)
					model.setGdsDesc2(gdsDesc2[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (miscDesc[i] != null)
					model.setMiscDesc(miscDesc[i]);
				if (bdDepAreaVndrNm[i] != null)
					model.setBdDepAreaVndrNm(bdDepAreaVndrNm[i]);
				if (bdArrAreaVndrNm[i] != null)
					model.setBdArrAreaVndrNm(bdArrAreaVndrNm[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getBkgEdoSelfTrspVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return BkgEdoSelfTrspVO[]
	 */
	public BkgEdoSelfTrspVO[] getBkgEdoSelfTrspVOs(){
		BkgEdoSelfTrspVO[] vos = (BkgEdoSelfTrspVO[])models.toArray(new BkgEdoSelfTrspVO[models.size()]);
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
		this.bdDepAreaNo = this.bdDepAreaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstSeq = this.edoRqstSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ownTrspCd = this.ownTrspCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdArrAreaNm = this.bdArrAreaNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc3 = this.gdsDesc3 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc4 = this.gdsDesc4 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoRqstNo = this.edoRqstNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.edoIssDt = this.edoIssDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdArrAreaNo = this.bdArrAreaNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc1 = this.gdsDesc1 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.gdsDesc2 = this.gdsDesc2 .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.miscDesc = this.miscDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdDepAreaVndrNm = this.bdDepAreaVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bdArrAreaVndrNm = this.bdArrAreaVndrNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
