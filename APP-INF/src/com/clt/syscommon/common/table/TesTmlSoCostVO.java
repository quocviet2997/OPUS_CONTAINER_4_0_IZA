/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesTmlSoCostVO.java
*@FileTitle : TesTmlSoCostVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.09.25
*@LastModifier : yOng hO lEE
*@LastVersion : 1.0
* 2009.09.25 yOng hO lEE 
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
 * @author yOng hO lEE
 * @since J2EE 1.6
 * @see AbstractValueObject
 */

public class TesTmlSoCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlSoCostVO> models = new ArrayList<TesTmlSoCostVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String rvisCntrListCd = null;
	/* Column Info */
	private String railRmpFlg = null;
	/* Column Info */
	private String costCalcMzdCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mrnTmlFlg = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String tmlAgmtMgmtCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String odckRailChgFlg = null;
	/* Column Info */
	private String cntrStyCd = null;
	/* Column Info */
	private String fdckCyTmlFlg = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String fdckCyStoFlg = null;
	/* Column Info */
	private String xcldTmlFlg = null;
	/* Column Info */
	private String cfsFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String stoInvFlg = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesTmlSoCostVO() {}

	public TesTmlSoCostVO(String ibflag, String pagerows, String lgsCostCd, String costCalcMzdCd, String tmlAgmtMgmtCd, String mrnTmlFlg, String odckRailChgFlg, String fdckCyTmlFlg, String fdckCyStoFlg, String stoInvFlg, String cfsFlg, String railRmpFlg, String xcldTmlFlg, String rvisCntrListCd, String cntrStyCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.rvisCntrListCd = rvisCntrListCd;
		this.railRmpFlg = railRmpFlg;
		this.costCalcMzdCd = costCalcMzdCd;
		this.creDt = creDt;
		this.mrnTmlFlg = mrnTmlFlg;
		this.pagerows = pagerows;
		this.tmlAgmtMgmtCd = tmlAgmtMgmtCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.odckRailChgFlg = odckRailChgFlg;
		this.cntrStyCd = cntrStyCd;
		this.fdckCyTmlFlg = fdckCyTmlFlg;
		this.lgsCostCd = lgsCostCd;
		this.fdckCyStoFlg = fdckCyStoFlg;
		this.xcldTmlFlg = xcldTmlFlg;
		this.cfsFlg = cfsFlg;
		this.updUsrId = updUsrId;
		this.stoInvFlg = stoInvFlg;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rvis_cntr_list_cd", getRvisCntrListCd());
		this.hashColumns.put("rail_rmp_flg", getRailRmpFlg());
		this.hashColumns.put("cost_calc_mzd_cd", getCostCalcMzdCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mrn_tml_flg", getMrnTmlFlg());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("tml_agmt_mgmt_cd", getTmlAgmtMgmtCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("odck_rail_chg_flg", getOdckRailChgFlg());
		this.hashColumns.put("cntr_sty_cd", getCntrStyCd());
		this.hashColumns.put("fdck_cy_tml_flg", getFdckCyTmlFlg());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("fdck_cy_sto_flg", getFdckCyStoFlg());
		this.hashColumns.put("xcld_tml_flg", getXcldTmlFlg());
		this.hashColumns.put("cfs_flg", getCfsFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("sto_inv_flg", getStoInvFlg());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rvis_cntr_list_cd", "rvisCntrListCd");
		this.hashFields.put("rail_rmp_flg", "railRmpFlg");
		this.hashFields.put("cost_calc_mzd_cd", "costCalcMzdCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mrn_tml_flg", "mrnTmlFlg");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("tml_agmt_mgmt_cd", "tmlAgmtMgmtCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("odck_rail_chg_flg", "odckRailChgFlg");
		this.hashFields.put("cntr_sty_cd", "cntrStyCd");
		this.hashFields.put("fdck_cy_tml_flg", "fdckCyTmlFlg");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("fdck_cy_sto_flg", "fdckCyStoFlg");
		this.hashFields.put("xcld_tml_flg", "xcldTmlFlg");
		this.hashFields.put("cfs_flg", "cfsFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("sto_inv_flg", "stoInvFlg");
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
	 * @return rvisCntrListCd
	 */
	public String getRvisCntrListCd() {
		return this.rvisCntrListCd;
	}
	
	/**
	 * Column Info
	 * @return railRmpFlg
	 */
	public String getRailRmpFlg() {
		return this.railRmpFlg;
	}
	
	/**
	 * Column Info
	 * @return costCalcMzdCd
	 */
	public String getCostCalcMzdCd() {
		return this.costCalcMzdCd;
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
	 * @return mrnTmlFlg
	 */
	public String getMrnTmlFlg() {
		return this.mrnTmlFlg;
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
	 * @return tmlAgmtMgmtCd
	 */
	public String getTmlAgmtMgmtCd() {
		return this.tmlAgmtMgmtCd;
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
	 * @return odckRailChgFlg
	 */
	public String getOdckRailChgFlg() {
		return this.odckRailChgFlg;
	}
	
	/**
	 * Column Info
	 * @return cntrStyCd
	 */
	public String getCntrStyCd() {
		return this.cntrStyCd;
	}
	
	/**
	 * Column Info
	 * @return fdckCyTmlFlg
	 */
	public String getFdckCyTmlFlg() {
		return this.fdckCyTmlFlg;
	}
	
	/**
	 * Column Info
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @return fdckCyStoFlg
	 */
	public String getFdckCyStoFlg() {
		return this.fdckCyStoFlg;
	}
	
	/**
	 * Column Info
	 * @return xcldTmlFlg
	 */
	public String getXcldTmlFlg() {
		return this.xcldTmlFlg;
	}
	
	/**
	 * Column Info
	 * @return cfsFlg
	 */
	public String getCfsFlg() {
		return this.cfsFlg;
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
	 * @return stoInvFlg
	 */
	public String getStoInvFlg() {
		return this.stoInvFlg;
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
	 * @param rvisCntrListCd
	 */
	public void setRvisCntrListCd(String rvisCntrListCd) {
		this.rvisCntrListCd = rvisCntrListCd;
	}
	
	/**
	 * Column Info
	 * @param railRmpFlg
	 */
	public void setRailRmpFlg(String railRmpFlg) {
		this.railRmpFlg = railRmpFlg;
	}
	
	/**
	 * Column Info
	 * @param costCalcMzdCd
	 */
	public void setCostCalcMzdCd(String costCalcMzdCd) {
		this.costCalcMzdCd = costCalcMzdCd;
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
	 * @param mrnTmlFlg
	 */
	public void setMrnTmlFlg(String mrnTmlFlg) {
		this.mrnTmlFlg = mrnTmlFlg;
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
	 * @param tmlAgmtMgmtCd
	 */
	public void setTmlAgmtMgmtCd(String tmlAgmtMgmtCd) {
		this.tmlAgmtMgmtCd = tmlAgmtMgmtCd;
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
	 * @param odckRailChgFlg
	 */
	public void setOdckRailChgFlg(String odckRailChgFlg) {
		this.odckRailChgFlg = odckRailChgFlg;
	}
	
	/**
	 * Column Info
	 * @param cntrStyCd
	 */
	public void setCntrStyCd(String cntrStyCd) {
		this.cntrStyCd = cntrStyCd;
	}
	
	/**
	 * Column Info
	 * @param fdckCyTmlFlg
	 */
	public void setFdckCyTmlFlg(String fdckCyTmlFlg) {
		this.fdckCyTmlFlg = fdckCyTmlFlg;
	}
	
	/**
	 * Column Info
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
	}
	
	/**
	 * Column Info
	 * @param fdckCyStoFlg
	 */
	public void setFdckCyStoFlg(String fdckCyStoFlg) {
		this.fdckCyStoFlg = fdckCyStoFlg;
	}
	
	/**
	 * Column Info
	 * @param xcldTmlFlg
	 */
	public void setXcldTmlFlg(String xcldTmlFlg) {
		this.xcldTmlFlg = xcldTmlFlg;
	}
	
	/**
	 * Column Info
	 * @param cfsFlg
	 */
	public void setCfsFlg(String cfsFlg) {
		this.cfsFlg = cfsFlg;
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
	 * @param stoInvFlg
	 */
	public void setStoInvFlg(String stoInvFlg) {
		this.stoInvFlg = stoInvFlg;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRvisCntrListCd(JSPUtil.getParameter(request, "rvis_cntr_list_cd", ""));
		setRailRmpFlg(JSPUtil.getParameter(request, "rail_rmp_flg", ""));
		setCostCalcMzdCd(JSPUtil.getParameter(request, "cost_calc_mzd_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMrnTmlFlg(JSPUtil.getParameter(request, "mrn_tml_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setTmlAgmtMgmtCd(JSPUtil.getParameter(request, "tml_agmt_mgmt_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setOdckRailChgFlg(JSPUtil.getParameter(request, "odck_rail_chg_flg", ""));
		setCntrStyCd(JSPUtil.getParameter(request, "cntr_sty_cd", ""));
		setFdckCyTmlFlg(JSPUtil.getParameter(request, "fdck_cy_tml_flg", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setFdckCyStoFlg(JSPUtil.getParameter(request, "fdck_cy_sto_flg", ""));
		setXcldTmlFlg(JSPUtil.getParameter(request, "xcld_tml_flg", ""));
		setCfsFlg(JSPUtil.getParameter(request, "cfs_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setStoInvFlg(JSPUtil.getParameter(request, "sto_inv_flg", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlSoCostVO[]
	 */
	public TesTmlSoCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlSoCostVO[]
	 */
	public TesTmlSoCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlSoCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] rvisCntrListCd = (JSPUtil.getParameter(request, prefix	+ "rvis_cntr_list_cd", length));
			String[] railRmpFlg = (JSPUtil.getParameter(request, prefix	+ "rail_rmp_flg", length));
			String[] costCalcMzdCd = (JSPUtil.getParameter(request, prefix	+ "cost_calc_mzd_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mrnTmlFlg = (JSPUtil.getParameter(request, prefix	+ "mrn_tml_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			String[] tmlAgmtMgmtCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_mgmt_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] odckRailChgFlg = (JSPUtil.getParameter(request, prefix	+ "odck_rail_chg_flg", length));
			String[] cntrStyCd = (JSPUtil.getParameter(request, prefix	+ "cntr_sty_cd", length));
			String[] fdckCyTmlFlg = (JSPUtil.getParameter(request, prefix	+ "fdck_cy_tml_flg", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] fdckCyStoFlg = (JSPUtil.getParameter(request, prefix	+ "fdck_cy_sto_flg", length));
			String[] xcldTmlFlg = (JSPUtil.getParameter(request, prefix	+ "xcld_tml_flg", length));
			String[] cfsFlg = (JSPUtil.getParameter(request, prefix	+ "cfs_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] stoInvFlg = (JSPUtil.getParameter(request, prefix	+ "sto_inv_flg", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlSoCostVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (rvisCntrListCd[i] != null)
					model.setRvisCntrListCd(rvisCntrListCd[i]);
				if (railRmpFlg[i] != null)
					model.setRailRmpFlg(railRmpFlg[i]);
				if (costCalcMzdCd[i] != null)
					model.setCostCalcMzdCd(costCalcMzdCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mrnTmlFlg[i] != null)
					model.setMrnTmlFlg(mrnTmlFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (tmlAgmtMgmtCd[i] != null)
					model.setTmlAgmtMgmtCd(tmlAgmtMgmtCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (odckRailChgFlg[i] != null)
					model.setOdckRailChgFlg(odckRailChgFlg[i]);
				if (cntrStyCd[i] != null)
					model.setCntrStyCd(cntrStyCd[i]);
				if (fdckCyTmlFlg[i] != null)
					model.setFdckCyTmlFlg(fdckCyTmlFlg[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (fdckCyStoFlg[i] != null)
					model.setFdckCyStoFlg(fdckCyStoFlg[i]);
				if (xcldTmlFlg[i] != null)
					model.setXcldTmlFlg(xcldTmlFlg[i]);
				if (cfsFlg[i] != null)
					model.setCfsFlg(cfsFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (stoInvFlg[i] != null)
					model.setStoInvFlg(stoInvFlg[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlSoCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlSoCostVO[]
	 */
	public TesTmlSoCostVO[] getTesTmlSoCostVOs(){
		TesTmlSoCostVO[] vos = (TesTmlSoCostVO[])models.toArray(new TesTmlSoCostVO[models.size()]);
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
		this.rvisCntrListCd = this.rvisCntrListCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.railRmpFlg = this.railRmpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costCalcMzdCd = this.costCalcMzdCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnTmlFlg = this.mrnTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtMgmtCd = this.tmlAgmtMgmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.odckRailChgFlg = this.odckRailChgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cntrStyCd = this.cntrStyCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdckCyTmlFlg = this.fdckCyTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdckCyStoFlg = this.fdckCyStoFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.xcldTmlFlg = this.xcldTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfsFlg = this.cfsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stoInvFlg = this.stoInvFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
