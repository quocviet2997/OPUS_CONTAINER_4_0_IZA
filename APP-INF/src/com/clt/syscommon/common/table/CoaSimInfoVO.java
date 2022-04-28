/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaSimInfoVO.java
*@FileTitle : CoaSimInfoVO
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

import com.clt.framework.component.util.JSPUtil;
import com.clt.framework.component.common.AbstractValueObject;

/**
 * Table Value Ojbect<br>
 * 관련 Event 에서 생성, 서버실행요청시 Data 전달역할을 수행하는 Value Object
 *
 * @author 임옥영
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class CoaSimInfoVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaSimInfoVO> models = new ArrayList<CoaSimInfoVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String coCd = null;
	/* Column Info */
	private String simStsCd = null;
	/* Column Info */
	private String extdLaneFlg = null;
	/* Column Info */
	private String simDeptCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String simDt = null;
	/* Column Info */
	private String simNo = null;
	/* Column Info */
	private String brthItvalDys = null;
	/* Page Number */
	private String pagerows = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String expcOtPerfRto = null;
	/* Column Info */
	private String slanCd = null;
	/* Column Info */
	private String svcDurDys = null;
	/* Column Info */
	private String simRmk = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaSimInfoVO() {}

	public CoaSimInfoVO(String ibflag, String pagerows, String simDt, String simNo, String slanCd, String simDeptCd, String extdLaneFlg, String simRmk, String creUsrId, String creDt, String updUsrId, String updDt, String svcDurDys, String brthItvalDys, String expcOtPerfRto, String simStsCd, String coCd) {
		this.updDt = updDt;
		this.coCd = coCd;
		this.simStsCd = simStsCd;
		this.extdLaneFlg = extdLaneFlg;
		this.simDeptCd = simDeptCd;
		this.creDt = creDt;
		this.simDt = simDt;
		this.simNo = simNo;
		this.brthItvalDys = brthItvalDys;
		this.pagerows = pagerows;
		this.ibflag = ibflag;
		this.creUsrId = creUsrId;
		this.expcOtPerfRto = expcOtPerfRto;
		this.slanCd = slanCd;
		this.svcDurDys = svcDurDys;
		this.simRmk = simRmk;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("co_cd", getCoCd());
		this.hashColumns.put("sim_sts_cd", getSimStsCd());
		this.hashColumns.put("extd_lane_flg", getExtdLaneFlg());
		this.hashColumns.put("sim_dept_cd", getSimDeptCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("sim_dt", getSimDt());
		this.hashColumns.put("sim_no", getSimNo());
		this.hashColumns.put("brth_itval_dys", getBrthItvalDys());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("expc_ot_perf_rto", getExpcOtPerfRto());
		this.hashColumns.put("slan_cd", getSlanCd());
		this.hashColumns.put("svc_dur_dys", getSvcDurDys());
		this.hashColumns.put("sim_rmk", getSimRmk());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("co_cd", "coCd");
		this.hashFields.put("sim_sts_cd", "simStsCd");
		this.hashFields.put("extd_lane_flg", "extdLaneFlg");
		this.hashFields.put("sim_dept_cd", "simDeptCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("sim_dt", "simDt");
		this.hashFields.put("sim_no", "simNo");
		this.hashFields.put("brth_itval_dys", "brthItvalDys");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("expc_ot_perf_rto", "expcOtPerfRto");
		this.hashFields.put("slan_cd", "slanCd");
		this.hashFields.put("svc_dur_dys", "svcDurDys");
		this.hashFields.put("sim_rmk", "simRmk");
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
	 * @return coCd
	 */
	public String getCoCd() {
		return this.coCd;
	}
	
	/**
	 * Column Info
	 * @return simStsCd
	 */
	public String getSimStsCd() {
		return this.simStsCd;
	}
	
	/**
	 * Column Info
	 * @return extdLaneFlg
	 */
	public String getExtdLaneFlg() {
		return this.extdLaneFlg;
	}
	
	/**
	 * Column Info
	 * @return simDeptCd
	 */
	public String getSimDeptCd() {
		return this.simDeptCd;
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
	 * @return simDt
	 */
	public String getSimDt() {
		return this.simDt;
	}
	
	/**
	 * Column Info
	 * @return simNo
	 */
	public String getSimNo() {
		return this.simNo;
	}
	
	/**
	 * Column Info
	 * @return brthItvalDys
	 */
	public String getBrthItvalDys() {
		return this.brthItvalDys;
	}
	
	/**
	 * Page Number
	 * @return pagerows
	 */
	public String getPagerows() {
		return this.pagerows;
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
	 * @return expcOtPerfRto
	 */
	public String getExpcOtPerfRto() {
		return this.expcOtPerfRto;
	}
	
	/**
	 * Column Info
	 * @return slanCd
	 */
	public String getSlanCd() {
		return this.slanCd;
	}
	
	/**
	 * Column Info
	 * @return svcDurDys
	 */
	public String getSvcDurDys() {
		return this.svcDurDys;
	}
	
	/**
	 * Column Info
	 * @return simRmk
	 */
	public String getSimRmk() {
		return this.simRmk;
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
	 * @param coCd
	 */
	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}
	
	/**
	 * Column Info
	 * @param simStsCd
	 */
	public void setSimStsCd(String simStsCd) {
		this.simStsCd = simStsCd;
	}
	
	/**
	 * Column Info
	 * @param extdLaneFlg
	 */
	public void setExtdLaneFlg(String extdLaneFlg) {
		this.extdLaneFlg = extdLaneFlg;
	}
	
	/**
	 * Column Info
	 * @param simDeptCd
	 */
	public void setSimDeptCd(String simDeptCd) {
		this.simDeptCd = simDeptCd;
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
	 * @param simDt
	 */
	public void setSimDt(String simDt) {
		this.simDt = simDt;
	}
	
	/**
	 * Column Info
	 * @param simNo
	 */
	public void setSimNo(String simNo) {
		this.simNo = simNo;
	}
	
	/**
	 * Column Info
	 * @param brthItvalDys
	 */
	public void setBrthItvalDys(String brthItvalDys) {
		this.brthItvalDys = brthItvalDys;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
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
	 * @param expcOtPerfRto
	 */
	public void setExpcOtPerfRto(String expcOtPerfRto) {
		this.expcOtPerfRto = expcOtPerfRto;
	}
	
	/**
	 * Column Info
	 * @param slanCd
	 */
	public void setSlanCd(String slanCd) {
		this.slanCd = slanCd;
	}
	
	/**
	 * Column Info
	 * @param svcDurDys
	 */
	public void setSvcDurDys(String svcDurDys) {
		this.svcDurDys = svcDurDys;
	}
	
	/**
	 * Column Info
	 * @param simRmk
	 */
	public void setSimRmk(String simRmk) {
		this.simRmk = simRmk;
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
		setCoCd(JSPUtil.getParameter(request, "co_cd", ""));
		setSimStsCd(JSPUtil.getParameter(request, "sim_sts_cd", ""));
		setExtdLaneFlg(JSPUtil.getParameter(request, "extd_lane_flg", ""));
		setSimDeptCd(JSPUtil.getParameter(request, "sim_dept_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSimDt(JSPUtil.getParameter(request, "sim_dt", ""));
		setSimNo(JSPUtil.getParameter(request, "sim_no", ""));
		setBrthItvalDys(JSPUtil.getParameter(request, "brth_itval_dys", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setExpcOtPerfRto(JSPUtil.getParameter(request, "expc_ot_perf_rto", ""));
		setSlanCd(JSPUtil.getParameter(request, "slan_cd", ""));
		setSvcDurDys(JSPUtil.getParameter(request, "svc_dur_dys", ""));
		setSimRmk(JSPUtil.getParameter(request, "sim_rmk", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaSimInfoVO[]
	 */
	public CoaSimInfoVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaSimInfoVO[]
	 */
	public CoaSimInfoVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaSimInfoVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] coCd = (JSPUtil.getParameter(request, prefix	+ "co_cd", length));
			String[] simStsCd = (JSPUtil.getParameter(request, prefix	+ "sim_sts_cd", length));
			String[] extdLaneFlg = (JSPUtil.getParameter(request, prefix	+ "extd_lane_flg", length));
			String[] simDeptCd = (JSPUtil.getParameter(request, prefix	+ "sim_dept_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] simDt = (JSPUtil.getParameter(request, prefix	+ "sim_dt", length));
			String[] simNo = (JSPUtil.getParameter(request, prefix	+ "sim_no", length));
			String[] brthItvalDys = (JSPUtil.getParameter(request, prefix	+ "brth_itval_dys", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] expcOtPerfRto = (JSPUtil.getParameter(request, prefix	+ "expc_ot_perf_rto", length));
			String[] slanCd = (JSPUtil.getParameter(request, prefix	+ "slan_cd", length));
			String[] svcDurDys = (JSPUtil.getParameter(request, prefix	+ "svc_dur_dys", length));
			String[] simRmk = (JSPUtil.getParameter(request, prefix	+ "sim_rmk", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaSimInfoVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (coCd[i] != null)
					model.setCoCd(coCd[i]);
				if (simStsCd[i] != null)
					model.setSimStsCd(simStsCd[i]);
				if (extdLaneFlg[i] != null)
					model.setExtdLaneFlg(extdLaneFlg[i]);
				if (simDeptCd[i] != null)
					model.setSimDeptCd(simDeptCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (simDt[i] != null)
					model.setSimDt(simDt[i]);
				if (simNo[i] != null)
					model.setSimNo(simNo[i]);
				if (brthItvalDys[i] != null)
					model.setBrthItvalDys(brthItvalDys[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (expcOtPerfRto[i] != null)
					model.setExpcOtPerfRto(expcOtPerfRto[i]);
				if (slanCd[i] != null)
					model.setSlanCd(slanCd[i]);
				if (svcDurDys[i] != null)
					model.setSvcDurDys(svcDurDys[i]);
				if (simRmk[i] != null)
					model.setSimRmk(simRmk[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaSimInfoVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaSimInfoVO[]
	 */
	public CoaSimInfoVO[] getCoaSimInfoVOs(){
		CoaSimInfoVO[] vos = (CoaSimInfoVO[])models.toArray(new CoaSimInfoVO[models.size()]);
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
		this.coCd = this.coCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simStsCd = this.simStsCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.extdLaneFlg = this.extdLaneFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simDeptCd = this.simDeptCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simDt = this.simDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simNo = this.simNo .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.brthItvalDys = this.brthItvalDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.expcOtPerfRto = this.expcOtPerfRto .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.slanCd = this.slanCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.svcDurDys = this.svcDurDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.simRmk = this.simRmk .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
