/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TotVesselVO.java
*@FileTitle : TotVesselVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.21
*@LastModifier : 장창수
*@LastVersion : 1.0
* 2009.05.21 장창수 
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
 * @author 장창수
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TotVesselVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TotVesselVO> models = new ArrayList<TotVesselVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String stlYr = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String vslRmk = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String vslSeq = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tongFletTpCd = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String ctrtEndDt = null;
	/* Column Info */
	private String ctrtStDt = null;
	/* Column Info */
	private String ldbCapaQty = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TotVesselVO() {}

	public TotVesselVO(String ibflag, String pagerows, String stlYr, String vslCd, String vslSeq, String tongFletTpCd, String ctrtStDt, String ctrtEndDt, String ldbCapaQty, String deltFlg, String vslRmk, String creDt, String creUsrId, String updDt, String updUsrId) {
		this.updDt = updDt;
		this.stlYr = stlYr;
		this.vslCd = vslCd;
		this.vslRmk = vslRmk;
		this.deltFlg = deltFlg;
		this.creDt = creDt;
		this.vslSeq = vslSeq;
		this.pagerows = pagerows;
		this.tongFletTpCd = tongFletTpCd;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.ctrtEndDt = ctrtEndDt;
		this.ctrtStDt = ctrtStDt;
		this.ldbCapaQty = ldbCapaQty;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("stl_yr", getStlYr());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("vsl_rmk", getVslRmk());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("vsl_seq", getVslSeq());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tong_flet_tp_cd", getTongFletTpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ctrt_end_dt", getCtrtEndDt());
		this.hashColumns.put("ctrt_st_dt", getCtrtStDt());
		this.hashColumns.put("ldb_capa_qty", getLdbCapaQty());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("stl_yr", "stlYr");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("vsl_rmk", "vslRmk");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("vsl_seq", "vslSeq");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tong_flet_tp_cd", "tongFletTpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ctrt_end_dt", "ctrtEndDt");
		this.hashFields.put("ctrt_st_dt", "ctrtStDt");
		this.hashFields.put("ldb_capa_qty", "ldbCapaQty");
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
	 * @return stlYr
	 */
	public String getStlYr() {
		return this.stlYr;
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
	 * @return vslRmk
	 */
	public String getVslRmk() {
		return this.vslRmk;
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
	 * @return creDt
	 */
	public String getCreDt() {
		return this.creDt;
	}
	
	/**
	 * Column Info
	 * @return vslSeq
	 */
	public String getVslSeq() {
		return this.vslSeq;
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
	 * @return tongFletTpCd
	 */
	public String getTongFletTpCd() {
		return this.tongFletTpCd;
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
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
	}
	
	/**
	 * Column Info
	 * @return ctrtEndDt
	 */
	public String getCtrtEndDt() {
		return this.ctrtEndDt;
	}
	
	/**
	 * Column Info
	 * @return ctrtStDt
	 */
	public String getCtrtStDt() {
		return this.ctrtStDt;
	}
	
	/**
	 * Column Info
	 * @return ldbCapaQty
	 */
	public String getLdbCapaQty() {
		return this.ldbCapaQty;
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
	 * @param stlYr
	 */
	public void setStlYr(String stlYr) {
		this.stlYr = stlYr;
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
	 * @param vslRmk
	 */
	public void setVslRmk(String vslRmk) {
		this.vslRmk = vslRmk;
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
	 * @param creDt
	 */
	public void setCreDt(String creDt) {
		this.creDt = creDt;
	}
	
	/**
	 * Column Info
	 * @param vslSeq
	 */
	public void setVslSeq(String vslSeq) {
		this.vslSeq = vslSeq;
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
	 * @param tongFletTpCd
	 */
	public void setTongFletTpCd(String tongFletTpCd) {
		this.tongFletTpCd = tongFletTpCd;
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
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
	}
	
	/**
	 * Column Info
	 * @param ctrtEndDt
	 */
	public void setCtrtEndDt(String ctrtEndDt) {
		this.ctrtEndDt = ctrtEndDt;
	}
	
	/**
	 * Column Info
	 * @param ctrtStDt
	 */
	public void setCtrtStDt(String ctrtStDt) {
		this.ctrtStDt = ctrtStDt;
	}
	
	/**
	 * Column Info
	 * @param ldbCapaQty
	 */
	public void setLdbCapaQty(String ldbCapaQty) {
		this.ldbCapaQty = ldbCapaQty;
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
		setStlYr(JSPUtil.getParameter(request, "stl_yr", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setVslRmk(JSPUtil.getParameter(request, "vsl_rmk", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setVslSeq(JSPUtil.getParameter(request, "vsl_seq", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTongFletTpCd(JSPUtil.getParameter(request, "tong_flet_tp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCtrtEndDt(JSPUtil.getParameter(request, "ctrt_end_dt", ""));
		setCtrtStDt(JSPUtil.getParameter(request, "ctrt_st_dt", ""));
		setLdbCapaQty(JSPUtil.getParameter(request, "ldb_capa_qty", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TotVesselVO[]
	 */
	public TotVesselVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TotVesselVO[]
	 */
	public TotVesselVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TotVesselVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] stlYr = (JSPUtil.getParameter(request, prefix	+ "stl_yr".trim(), length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd".trim(), length));
			String[] vslRmk = (JSPUtil.getParameter(request, prefix	+ "vsl_rmk".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] vslSeq = (JSPUtil.getParameter(request, prefix	+ "vsl_seq".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] tongFletTpCd = (JSPUtil.getParameter(request, prefix	+ "tong_flet_tp_cd".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ctrtEndDt = (JSPUtil.getParameter(request, prefix	+ "ctrt_end_dt".trim(), length));
			String[] ctrtStDt = (JSPUtil.getParameter(request, prefix	+ "ctrt_st_dt".trim(), length));
			String[] ldbCapaQty = (JSPUtil.getParameter(request, prefix	+ "ldb_capa_qty".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new TotVesselVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (stlYr[i] != null)
					model.setStlYr(stlYr[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (vslRmk[i] != null)
					model.setVslRmk(vslRmk[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (vslSeq[i] != null)
					model.setVslSeq(vslSeq[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tongFletTpCd[i] != null)
					model.setTongFletTpCd(tongFletTpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ctrtEndDt[i] != null)
					model.setCtrtEndDt(ctrtEndDt[i]);
				if (ctrtStDt[i] != null)
					model.setCtrtStDt(ctrtStDt[i]);
				if (ldbCapaQty[i] != null)
					model.setLdbCapaQty(ldbCapaQty[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTotVesselVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TotVesselVO[]
	 */
	public TotVesselVO[] getTotVesselVOs(){
		TotVesselVO[] vos = (TotVesselVO[])models.toArray(new TotVesselVO[models.size()]);
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
		this.stlYr = this.stlYr .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslCd = this.vslCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslRmk = this.vslRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSeq = this.vslSeq .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tongFletTpCd = this.tongFletTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtEndDt = this.ctrtEndDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ctrtStDt = this.ctrtStDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ldbCapaQty = this.ldbCapaQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
