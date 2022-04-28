/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaSltMgmtUtVO.java
*@FileTitle : CoaSltMgmtUtVO
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

public class CoaSltMgmtUtVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaSltMgmtUtVO> models = new ArrayList<CoaSltMgmtUtVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String laneGrpCd = null;
	/* Column Info */
	private String costLaneTpCd = null;
	/* Column Info */
	private String bseUcAmt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String trdCd = null;
	/* Column Info */
	private String rlaneCd = null;
	/* Column Info */
	private String vslAvgDys = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String plcyPrcUtAmt = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String vslSltDysUcAmt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String costYrmon = null;
	/* Column Info */
	private String vslSlanDirCd = null;
	/* Column Info */
	private String updUsrId = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaSltMgmtUtVO() {}

	public CoaSltMgmtUtVO(String ibflag, String pagerows, String costYrmon, String trdCd, String rlaneCd, String vslSlanDirCd, String costLaneTpCd, String laneGrpCd, String bseUcAmt, String plcyPrcUtAmt, String vslAvgDys, String vslSltDysUcAmt, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.laneGrpCd = laneGrpCd;
		this.costLaneTpCd = costLaneTpCd;
		this.bseUcAmt = bseUcAmt;
		this.creDt = creDt;
		this.trdCd = trdCd;
		this.rlaneCd = rlaneCd;
		this.vslAvgDys = vslAvgDys;
		this.pagerows = pagerows;
		this.plcyPrcUtAmt = plcyPrcUtAmt;
		this.ibflag = ibflag;
		this.vslSltDysUcAmt = vslSltDysUcAmt;
		this.creUsrId = creUsrId;
		this.costYrmon = costYrmon;
		this.vslSlanDirCd = vslSlanDirCd;
		this.updUsrId = updUsrId;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lane_grp_cd", getLaneGrpCd());
		this.hashColumns.put("cost_lane_tp_cd", getCostLaneTpCd());
		this.hashColumns.put("bse_uc_amt", getBseUcAmt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("trd_cd", getTrdCd());
		this.hashColumns.put("rlane_cd", getRlaneCd());
		this.hashColumns.put("vsl_avg_dys", getVslAvgDys());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("plcy_prc_ut_amt", getPlcyPrcUtAmt());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("vsl_slt_dys_uc_amt", getVslSltDysUcAmt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("cost_yrmon", getCostYrmon());
		this.hashColumns.put("vsl_slan_dir_cd", getVslSlanDirCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lane_grp_cd", "laneGrpCd");
		this.hashFields.put("cost_lane_tp_cd", "costLaneTpCd");
		this.hashFields.put("bse_uc_amt", "bseUcAmt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("trd_cd", "trdCd");
		this.hashFields.put("rlane_cd", "rlaneCd");
		this.hashFields.put("vsl_avg_dys", "vslAvgDys");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("plcy_prc_ut_amt", "plcyPrcUtAmt");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("vsl_slt_dys_uc_amt", "vslSltDysUcAmt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("cost_yrmon", "costYrmon");
		this.hashFields.put("vsl_slan_dir_cd", "vslSlanDirCd");
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
	 * @return laneGrpCd
	 */
	public String getLaneGrpCd() {
		return this.laneGrpCd;
	}
	
	/**
	 * Column Info
	 * @return costLaneTpCd
	 */
	public String getCostLaneTpCd() {
		return this.costLaneTpCd;
	}
	
	/**
	 * Column Info
	 * @return bseUcAmt
	 */
	public String getBseUcAmt() {
		return this.bseUcAmt;
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
	 * @return trdCd
	 */
	public String getTrdCd() {
		return this.trdCd;
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
	 * @return vslAvgDys
	 */
	public String getVslAvgDys() {
		return this.vslAvgDys;
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
	 * @return plcyPrcUtAmt
	 */
	public String getPlcyPrcUtAmt() {
		return this.plcyPrcUtAmt;
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
	 * @return vslSltDysUcAmt
	 */
	public String getVslSltDysUcAmt() {
		return this.vslSltDysUcAmt;
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
	 * @return costYrmon
	 */
	public String getCostYrmon() {
		return this.costYrmon;
	}
	
	/**
	 * Column Info
	 * @return vslSlanDirCd
	 */
	public String getVslSlanDirCd() {
		return this.vslSlanDirCd;
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
	 * @param laneGrpCd
	 */
	public void setLaneGrpCd(String laneGrpCd) {
		this.laneGrpCd = laneGrpCd;
	}
	
	/**
	 * Column Info
	 * @param costLaneTpCd
	 */
	public void setCostLaneTpCd(String costLaneTpCd) {
		this.costLaneTpCd = costLaneTpCd;
	}
	
	/**
	 * Column Info
	 * @param bseUcAmt
	 */
	public void setBseUcAmt(String bseUcAmt) {
		this.bseUcAmt = bseUcAmt;
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
	 * @param trdCd
	 */
	public void setTrdCd(String trdCd) {
		this.trdCd = trdCd;
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
	 * @param vslAvgDys
	 */
	public void setVslAvgDys(String vslAvgDys) {
		this.vslAvgDys = vslAvgDys;
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
	 * @param plcyPrcUtAmt
	 */
	public void setPlcyPrcUtAmt(String plcyPrcUtAmt) {
		this.plcyPrcUtAmt = plcyPrcUtAmt;
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
	 * @param vslSltDysUcAmt
	 */
	public void setVslSltDysUcAmt(String vslSltDysUcAmt) {
		this.vslSltDysUcAmt = vslSltDysUcAmt;
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
	 * @param costYrmon
	 */
	public void setCostYrmon(String costYrmon) {
		this.costYrmon = costYrmon;
	}
	
	/**
	 * Column Info
	 * @param vslSlanDirCd
	 */
	public void setVslSlanDirCd(String vslSlanDirCd) {
		this.vslSlanDirCd = vslSlanDirCd;
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
		setLaneGrpCd(JSPUtil.getParameter(request, "lane_grp_cd", ""));
		setCostLaneTpCd(JSPUtil.getParameter(request, "cost_lane_tp_cd", ""));
		setBseUcAmt(JSPUtil.getParameter(request, "bse_uc_amt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setTrdCd(JSPUtil.getParameter(request, "trd_cd", ""));
		setRlaneCd(JSPUtil.getParameter(request, "rlane_cd", ""));
		setVslAvgDys(JSPUtil.getParameter(request, "vsl_avg_dys", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setPlcyPrcUtAmt(JSPUtil.getParameter(request, "plcy_prc_ut_amt", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setVslSltDysUcAmt(JSPUtil.getParameter(request, "vsl_slt_dys_uc_amt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setCostYrmon(JSPUtil.getParameter(request, "cost_yrmon", ""));
		setVslSlanDirCd(JSPUtil.getParameter(request, "vsl_slan_dir_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaSltMgmtUtVO[]
	 */
	public CoaSltMgmtUtVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaSltMgmtUtVO[]
	 */
	public CoaSltMgmtUtVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaSltMgmtUtVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] laneGrpCd = (JSPUtil.getParameter(request, prefix	+ "lane_grp_cd", length));
			String[] costLaneTpCd = (JSPUtil.getParameter(request, prefix	+ "cost_lane_tp_cd", length));
			String[] bseUcAmt = (JSPUtil.getParameter(request, prefix	+ "bse_uc_amt", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] trdCd = (JSPUtil.getParameter(request, prefix	+ "trd_cd", length));
			String[] rlaneCd = (JSPUtil.getParameter(request, prefix	+ "rlane_cd", length));
			String[] vslAvgDys = (JSPUtil.getParameter(request, prefix	+ "vsl_avg_dys", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] plcyPrcUtAmt = (JSPUtil.getParameter(request, prefix	+ "plcy_prc_ut_amt", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] vslSltDysUcAmt = (JSPUtil.getParameter(request, prefix	+ "vsl_slt_dys_uc_amt", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] costYrmon = (JSPUtil.getParameter(request, prefix	+ "cost_yrmon", length));
			String[] vslSlanDirCd = (JSPUtil.getParameter(request, prefix	+ "vsl_slan_dir_cd", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaSltMgmtUtVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (laneGrpCd[i] != null)
					model.setLaneGrpCd(laneGrpCd[i]);
				if (costLaneTpCd[i] != null)
					model.setCostLaneTpCd(costLaneTpCd[i]);
				if (bseUcAmt[i] != null)
					model.setBseUcAmt(bseUcAmt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (trdCd[i] != null)
					model.setTrdCd(trdCd[i]);
				if (rlaneCd[i] != null)
					model.setRlaneCd(rlaneCd[i]);
				if (vslAvgDys[i] != null)
					model.setVslAvgDys(vslAvgDys[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (plcyPrcUtAmt[i] != null)
					model.setPlcyPrcUtAmt(plcyPrcUtAmt[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (vslSltDysUcAmt[i] != null)
					model.setVslSltDysUcAmt(vslSltDysUcAmt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (costYrmon[i] != null)
					model.setCostYrmon(costYrmon[i]);
				if (vslSlanDirCd[i] != null)
					model.setVslSlanDirCd(vslSlanDirCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaSltMgmtUtVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaSltMgmtUtVO[]
	 */
	public CoaSltMgmtUtVO[] getCoaSltMgmtUtVOs(){
		CoaSltMgmtUtVO[] vos = (CoaSltMgmtUtVO[])models.toArray(new CoaSltMgmtUtVO[models.size()]);
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
		this.laneGrpCd = this.laneGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costLaneTpCd = this.costLaneTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.bseUcAmt = this.bseUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.trdCd = this.trdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.rlaneCd = this.rlaneCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslAvgDys = this.vslAvgDys .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.plcyPrcUtAmt = this.plcyPrcUtAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSltDysUcAmt = this.vslSltDysUcAmt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costYrmon = this.costYrmon .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.vslSlanDirCd = this.vslSlanDirCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
