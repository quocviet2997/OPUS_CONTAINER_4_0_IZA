/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaInterPrcVO.java
*@FileTitle : CoaInterPrcVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : 임옥영
*@LastVersion : 1.0
* 2009.09.25 임옥영 
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
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaInterPrcVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaInterPrcVO> models = new ArrayList<CoaInterPrcVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String vslCd = null;
	/* Column Info */
	private String ucPerSltAmt = null;
	/* Column Info */
	private String toTrdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String skdVoyNo = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String aplyUcAmt = null;
	/* Column Info */
	private String iptLoddQty = null;
	/* Column Info */
	private String skdDirCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String fmTrdCd = null;
	/* Column Info */
	private String sltUcPerDyAmt = null;
	/* Column Info */
	private String rmnAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String ttlTzDys = null;
	/* Column Info */
	private String iptAsgnAmt = null;
	/* Column Info */
	private String iptTzDys = null;
	/* Column Info */
	private String hjsSlsAmt = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stndCostCd = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaInterPrcVO() {}

	public CoaInterPrcVO(String ibflag, String pagerows, String vslCd, String skdDirCd, String skdVoyNo, String rlaneCd, String fmTrdCd, String toTrdCd, String stndCostCd, String ttlTzDys, String ucPerSltAmt, String sltUcPerDyAmt, String iptTzDys, String aplyUcAmt, String hjsSlsAmt, String iptLoddQty, String iptAsgnAmt, String rmnAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.vslCd = vslCd;
		this.ucPerSltAmt = ucPerSltAmt;
		this.toTrdCd = toTrdCd;
		this.creDt = creDt;
		this.skdVoyNo = skdVoyNo;
		this.rlaneCd = rlaneCd;
		this.aplyUcAmt = aplyUcAmt;
		this.iptLoddQty = iptLoddQty;
		this.skdDirCd = skdDirCd;
		this.pagerows = pagerows;
		this.fmTrdCd = fmTrdCd;
		this.sltUcPerDyAmt = sltUcPerDyAmt;
		this.rmnAmt = rmnAmt;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.ttlTzDys = ttlTzDys;
		this.iptAsgnAmt = iptAsgnAmt;
		this.iptTzDys = iptTzDys;
		this.hjsSlsAmt = hjsSlsAmt;
		this.updUsrId = updUsrId;
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("vsl_cd", getVslCd());
		this.hashColumns.put("uc_per_slt_amt", getUcPerSltAmt());
		this.hashColumns.put("to_trd_cd", getToTrdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("skd_voy_no", getSkdVoyNo());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("aply_uc_amt", getAplyUcAmt());
		this.hashColumns.put("ipt_lodd_qty", getIptLoddQty());
		this.hashColumns.put("skd_dir_cd", getSkdDirCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("fm_trd_cd", getFmTrdCd());
		this.hashColumns.put("slt_uc_per_dy_amt", getSltUcPerDyAmt());
		this.hashColumns.put("rmn_amt", getRmnAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("ttl_tz_dys", getTtlTzDys());
		this.hashColumns.put("ipt_asgn_amt", getIptAsgnAmt());
		this.hashColumns.put("ipt_tz_dys", getIptTzDys());
		this.hashColumns.put("hjs_sls_amt", getHjsSlsAmt());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("stnd_cost_cd", getStndCostCd());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("vsl_cd", "vslCd");
		this.hashFields.put("uc_per_slt_amt", "ucPerSltAmt");
		this.hashFields.put("to_trd_cd", "toTrdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("skd_voy_no", "skdVoyNo");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("aply_uc_amt", "aplyUcAmt");
		this.hashFields.put("ipt_lodd_qty", "iptLoddQty");
		this.hashFields.put("skd_dir_cd", "skdDirCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("fm_trd_cd", "fmTrdCd");
		this.hashFields.put("slt_uc_per_dy_amt", "sltUcPerDyAmt");
		this.hashFields.put("rmn_amt", "rmnAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("ttl_tz_dys", "ttlTzDys");
		this.hashFields.put("ipt_asgn_amt", "iptAsgnAmt");
		this.hashFields.put("ipt_tz_dys", "iptTzDys");
		this.hashFields.put("hjs_sls_amt", "hjsSlsAmt");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("stnd_cost_cd", "stndCostCd");
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
	 * @return ucPerSltAmt
	 */
	public String getUcPerSltAmt() {
		return this.ucPerSltAmt;
	}
	
	/**
	 * Column Info
	 * @return toTrdCd
	 */
	public String getToTrdCd() {
		return this.toTrdCd;
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
	 * @return skdVoyNo
	 */
	public String getSkdVoyNo() {
		return this.skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @return rlaneCd
	 */
	public String getRlaneCd() {
		return this.rlaneCd;
	}
	
	/**
	 * Column Info
	 * @return aplyUcAmt
	 */
	public String getAplyUcAmt() {
		return this.aplyUcAmt;
	}
	
	/**
	 * Column Info
	 * @return iptLoddQty
	 */
	public String getIptLoddQty() {
		return this.iptLoddQty;
	}
	
	/**
	 * Column Info
	 * @return skdDirCd
	 */
	public String getSkdDirCd() {
		return this.skdDirCd;
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
	 * @return fmTrdCd
	 */
	public String getFmTrdCd() {
		return this.fmTrdCd;
	}
	
	/**
	 * Column Info
	 * @return sltUcPerDyAmt
	 */
	public String getSltUcPerDyAmt() {
		return this.sltUcPerDyAmt;
	}
	
	/**
	 * Column Info
	 * @return rmnAmt
	 */
	public String getRmnAmt() {
		return this.rmnAmt;
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
	 * @return ttlTzDys
	 */
	public String getTtlTzDys() {
		return this.ttlTzDys;
	}
	
	/**
	 * Column Info
	 * @return iptAsgnAmt
	 */
	public String getIptAsgnAmt() {
		return this.iptAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @return iptTzDys
	 */
	public String getIptTzDys() {
		return this.iptTzDys;
	}
	
	/**
	 * Column Info
	 * @return hjsSlsAmt
	 */
	public String getHjsSlsAmt() {
		return this.hjsSlsAmt;
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
	 * @return stndCostCd
	 */
	public String getStndCostCd() {
		return this.stndCostCd;
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
	 * @param ucPerSltAmt
	 */
	public void setUcPerSltAmt(String ucPerSltAmt) {
		this.ucPerSltAmt = ucPerSltAmt;
	}
	
	/**
	 * Column Info
	 * @param toTrdCd
	 */
	public void setToTrdCd(String toTrdCd) {
		this.toTrdCd = toTrdCd;
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
	 * @param skdVoyNo
	 */
	public void setSkdVoyNo(String skdVoyNo) {
		this.skdVoyNo = skdVoyNo;
	}
	
	/**
	 * Column Info
	 * @param rlaneCd
	 */
	public void setRlaneCd(String rlaneCd) {
		this.rlaneCd = rlaneCd;
	}
	
	/**
	 * Column Info
	 * @param aplyUcAmt
	 */
	public void setAplyUcAmt(String aplyUcAmt) {
		this.aplyUcAmt = aplyUcAmt;
	}
	
	/**
	 * Column Info
	 * @param iptLoddQty
	 */
	public void setIptLoddQty(String iptLoddQty) {
		this.iptLoddQty = iptLoddQty;
	}
	
	/**
	 * Column Info
	 * @param skdDirCd
	 */
	public void setSkdDirCd(String skdDirCd) {
		this.skdDirCd = skdDirCd;
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
	 * @param fmTrdCd
	 */
	public void setFmTrdCd(String fmTrdCd) {
		this.fmTrdCd = fmTrdCd;
	}
	
	/**
	 * Column Info
	 * @param sltUcPerDyAmt
	 */
	public void setSltUcPerDyAmt(String sltUcPerDyAmt) {
		this.sltUcPerDyAmt = sltUcPerDyAmt;
	}
	
	/**
	 * Column Info
	 * @param rmnAmt
	 */
	public void setRmnAmt(String rmnAmt) {
		this.rmnAmt = rmnAmt;
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
	 * @param ttlTzDys
	 */
	public void setTtlTzDys(String ttlTzDys) {
		this.ttlTzDys = ttlTzDys;
	}
	
	/**
	 * Column Info
	 * @param iptAsgnAmt
	 */
	public void setIptAsgnAmt(String iptAsgnAmt) {
		this.iptAsgnAmt = iptAsgnAmt;
	}
	
	/**
	 * Column Info
	 * @param iptTzDys
	 */
	public void setIptTzDys(String iptTzDys) {
		this.iptTzDys = iptTzDys;
	}
	
	/**
	 * Column Info
	 * @param hjsSlsAmt
	 */
	public void setHjsSlsAmt(String hjsSlsAmt) {
		this.hjsSlsAmt = hjsSlsAmt;
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
	 * @param stndCostCd
	 */
	public void setStndCostCd(String stndCostCd) {
		this.stndCostCd = stndCostCd;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setVslCd(JSPUtil.getParameter(request, "vsl_cd", ""));
		setUcPerSltAmt(JSPUtil.getParameter(request, "uc_per_slt_amt", ""));
		setToTrdCd(JSPUtil.getParameter(request, "to_trd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSkdVoyNo(JSPUtil.getParameter(request, "skd_voy_no", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setAplyUcAmt(JSPUtil.getParameter(request, "aply_uc_amt", ""));
		setIptLoddQty(JSPUtil.getParameter(request, "ipt_lodd_qty", ""));
		setSkdDirCd(JSPUtil.getParameter(request, "skd_dir_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setFmTrdCd(JSPUtil.getParameter(request, "fm_trd_cd", ""));
		setSltUcPerDyAmt(JSPUtil.getParameter(request, "slt_uc_per_dy_amt", ""));
		setRmnAmt(JSPUtil.getParameter(request, "rmn_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setTtlTzDys(JSPUtil.getParameter(request, "ttl_tz_dys", ""));
		setIptAsgnAmt(JSPUtil.getParameter(request, "ipt_asgn_amt", ""));
		setIptTzDys(JSPUtil.getParameter(request, "ipt_tz_dys", ""));
		setHjsSlsAmt(JSPUtil.getParameter(request, "hjs_sls_amt", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStndCostCd(JSPUtil.getParameter(request, "stnd_cost_cd", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaInterPrcVO[]
	 */
	public CoaInterPrcVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaInterPrcVO[]
	 */
	public CoaInterPrcVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaInterPrcVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] vslCd = (JSPUtil.getParameter(request, prefix	+ "vsl_cd", length));
			String[] ucPerSltAmt = (JSPUtil.getParameter(request, prefix	+ "uc_per_slt_amt", length));
			String[] toTrdCd = (JSPUtil.getParameter(request, prefix	+ "to_trd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] skdVoyNo = (JSPUtil.getParameter(request, prefix	+ "skd_voy_no", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] aplyUcAmt = (JSPUtil.getParameter(request, prefix	+ "aply_uc_amt", length));
			String[] iptLoddQty = (JSPUtil.getParameter(request, prefix	+ "ipt_lodd_qty", length));
			String[] skdDirCd = (JSPUtil.getParameter(request, prefix	+ "skd_dir_cd", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] fmTrdCd = (JSPUtil.getParameter(request, prefix	+ "fm_trd_cd", length));
			String[] sltUcPerDyAmt = (JSPUtil.getParameter(request, prefix	+ "slt_uc_per_dy_amt", length));
			String[] rmnAmt = (JSPUtil.getParameter(request, prefix	+ "rmn_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] ttlTzDys = (JSPUtil.getParameter(request, prefix	+ "ttl_tz_dys", length));
			String[] iptAsgnAmt = (JSPUtil.getParameter(request, prefix	+ "ipt_asgn_amt", length));
			String[] iptTzDys = (JSPUtil.getParameter(request, prefix	+ "ipt_tz_dys", length));
			String[] hjsSlsAmt = (JSPUtil.getParameter(request, prefix	+ "hjs_sls_amt", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stndCostCd = (JSPUtil.getParameter(request, prefix	+ "stnd_cost_cd", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaInterPrcVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (vslCd[i] != null)
					model.setVslCd(vslCd[i]);
				if (ucPerSltAmt[i] != null)
					model.setUcPerSltAmt(ucPerSltAmt[i]);
				if (toTrdCd[i] != null)
					model.setToTrdCd(toTrdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (skdVoyNo[i] != null)
					model.setSkdVoyNo(skdVoyNo[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (aplyUcAmt[i] != null)
					model.setAplyUcAmt(aplyUcAmt[i]);
				if (iptLoddQty[i] != null)
					model.setIptLoddQty(iptLoddQty[i]);
				if (skdDirCd[i] != null)
					model.setSkdDirCd(skdDirCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (fmTrdCd[i] != null)
					model.setFmTrdCd(fmTrdCd[i]);
				if (sltUcPerDyAmt[i] != null)
					model.setSltUcPerDyAmt(sltUcPerDyAmt[i]);
				if (rmnAmt[i] != null)
					model.setRmnAmt(rmnAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (ttlTzDys[i] != null)
					model.setTtlTzDys(ttlTzDys[i]);
				if (iptAsgnAmt[i] != null)
					model.setIptAsgnAmt(iptAsgnAmt[i]);
				if (iptTzDys[i] != null)
					model.setIptTzDys(iptTzDys[i]);
				if (hjsSlsAmt[i] != null)
					model.setHjsSlsAmt(hjsSlsAmt[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stndCostCd[i] != null)
					model.setStndCostCd(stndCostCd[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaInterPrcVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaInterPrcVO[]
	 */
	public CoaInterPrcVO[] getCoaInterPrcVOs(){
		CoaInterPrcVO[] vos = (CoaInterPrcVO[])models.toArray(new CoaInterPrcVO[models.size()]);
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
		this.ucPerSltAmt = this.ucPerSltAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.toTrdCd = this.toTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdVoyNo = this.skdVoyNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.aplyUcAmt = this.aplyUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iptLoddQty = this.iptLoddQty .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.skdDirCd = this.skdDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fmTrdCd = this.fmTrdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.sltUcPerDyAmt = this.sltUcPerDyAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rmnAmt = this.rmnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ttlTzDys = this.ttlTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iptAsgnAmt = this.iptAsgnAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.iptTzDys = this.iptTzDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.hjsSlsAmt = this.hjsSlsAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stndCostCd = this.stndCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
