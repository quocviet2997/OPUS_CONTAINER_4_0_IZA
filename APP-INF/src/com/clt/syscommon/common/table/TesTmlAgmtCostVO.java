/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : TesTmlAgmtCostVO.java
*@FileTitle : TesTmlAgmtCostVO
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

public class TesTmlAgmtCostVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<TesTmlAgmtCostVO> models = new ArrayList<TesTmlAgmtCostVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String railRmpFlg = null;
	/* Column Info */
	private String tmlAgmtMgmtCd = null;
	/* Column Info */
	private String creUsrId = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String lgsCostCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String mrnTmlFlg = null;
	/* Column Info */
	private String cfsFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Column Info */
	private String fdckCyFlg = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public TesTmlAgmtCostVO() {}

	public TesTmlAgmtCostVO(String ibflag, String pagerows, String lgsCostCd, String tmlAgmtMgmtCd, String mrnTmlFlg, String fdckCyFlg, String cfsFlg, String railRmpFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.railRmpFlg = railRmpFlg;
		this.tmlAgmtMgmtCd = tmlAgmtMgmtCd;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.lgsCostCd = lgsCostCd;
		this.creDt = creDt;
		this.mrnTmlFlg = mrnTmlFlg;
		this.cfsFlg = cfsFlg;
		this.updUsrId = updUsrId;
		this.fdckCyFlg = fdckCyFlg;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("rail_rmp_flg", getRailRmpFlg());
		this.hashColumns.put("tml_agmt_mgmt_cd", getTmlAgmtMgmtCd());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("lgs_cost_cd", getLgsCostCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("mrn_tml_flg", getMrnTmlFlg());
		this.hashColumns.put("cfs_flg", getCfsFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("fdck_cy_flg", getFdckCyFlg());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("rail_rmp_flg", "railRmpFlg");
		this.hashFields.put("tml_agmt_mgmt_cd", "tmlAgmtMgmtCd");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("lgs_cost_cd", "lgsCostCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("mrn_tml_flg", "mrnTmlFlg");
		this.hashFields.put("cfs_flg", "cfsFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("fdck_cy_flg", "fdckCyFlg");
		this.hashFields.put("pagerows", "pagerows");
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
	 * @return railRmpFlg
	 */
	public String getRailRmpFlg() {
		return this.railRmpFlg;
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
	 * @return lgsCostCd
	 */
	public String getLgsCostCd() {
		return this.lgsCostCd;
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
	 * @return fdckCyFlg
	 */
	public String getFdckCyFlg() {
		return this.fdckCyFlg;
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
	 * @param updDt
	 */
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
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
	 * @param lgsCostCd
	 */
	public void setLgsCostCd(String lgsCostCd) {
		this.lgsCostCd = lgsCostCd;
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
	 * @param fdckCyFlg
	 */
	public void setFdckCyFlg(String fdckCyFlg) {
		this.fdckCyFlg = fdckCyFlg;
	}
	
	/**
	 * Page Number
	 * @param pagerows
	 */
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}
	
	/**
	 * Request 의 데이터를 추출하여 VO 의 멤버변수에 설정.
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setRailRmpFlg(JSPUtil.getParameter(request, "rail_rmp_flg", ""));
		setTmlAgmtMgmtCd(JSPUtil.getParameter(request, "tml_agmt_mgmt_cd", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setLgsCostCd(JSPUtil.getParameter(request, "lgs_cost_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setMrnTmlFlg(JSPUtil.getParameter(request, "mrn_tml_flg", ""));
		setCfsFlg(JSPUtil.getParameter(request, "cfs_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setFdckCyFlg(JSPUtil.getParameter(request, "fdck_cy_flg", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return TesTmlAgmtCostVO[]
	 */
	public TesTmlAgmtCostVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return TesTmlAgmtCostVO[]
	 */
	public TesTmlAgmtCostVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		TesTmlAgmtCostVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] railRmpFlg = (JSPUtil.getParameter(request, prefix	+ "rail_rmp_flg", length));
			String[] tmlAgmtMgmtCd = (JSPUtil.getParameter(request, prefix	+ "tml_agmt_mgmt_cd", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] lgsCostCd = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] mrnTmlFlg = (JSPUtil.getParameter(request, prefix	+ "mrn_tml_flg", length));
			String[] cfsFlg = (JSPUtil.getParameter(request, prefix	+ "cfs_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] fdckCyFlg = (JSPUtil.getParameter(request, prefix	+ "fdck_cy_flg", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new TesTmlAgmtCostVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (railRmpFlg[i] != null)
					model.setRailRmpFlg(railRmpFlg[i]);
				if (tmlAgmtMgmtCd[i] != null)
					model.setTmlAgmtMgmtCd(tmlAgmtMgmtCd[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (lgsCostCd[i] != null)
					model.setLgsCostCd(lgsCostCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (mrnTmlFlg[i] != null)
					model.setMrnTmlFlg(mrnTmlFlg[i]);
				if (cfsFlg[i] != null)
					model.setCfsFlg(cfsFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (fdckCyFlg[i] != null)
					model.setFdckCyFlg(fdckCyFlg[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getTesTmlAgmtCostVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return TesTmlAgmtCostVO[]
	 */
	public TesTmlAgmtCostVO[] getTesTmlAgmtCostVOs(){
		TesTmlAgmtCostVO[] vos = (TesTmlAgmtCostVO[])models.toArray(new TesTmlAgmtCostVO[models.size()]);
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
		this.railRmpFlg = this.railRmpFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.tmlAgmtMgmtCd = this.tmlAgmtMgmtCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCd = this.lgsCostCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.mrnTmlFlg = this.mrnTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.cfsFlg = this.cfsFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.fdckCyFlg = this.fdckCyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
