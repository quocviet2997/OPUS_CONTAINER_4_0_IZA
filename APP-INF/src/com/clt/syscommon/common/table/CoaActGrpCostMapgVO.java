/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CoaActGrpCostMapgVO.java
*@FileTitle : CoaActGrpCostMapgVO
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

public class CoaActGrpCostMapgVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CoaActGrpCostMapgVO> models = new ArrayList<CoaActGrpCostMapgVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String lgsCostAutoCdFlg = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String actGrpTmlFlg = null;
	/* Column Info */
	private String costActGrpCd = null;
	/* VO Data Value( C:Creation, U:Update, D:Delete ) */
	private String ibflag = null;
	/* Column Info */
	private String coaCostSrcCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String lgsCostCdChkFlg = null;
	/* Column Info */
	private String costAplyFlg = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	테이블 컬럼의 값을 저장하는 Hashtable */
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	테이블 컬럼에 대응되는 멤버변수를 저장하는 Hashtable */
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CoaActGrpCostMapgVO() {}

	public CoaActGrpCostMapgVO(String ibflag, String pagerows, String costActGrpCd, String coaCostSrcCd, String costAplyFlg, String lgsCostCdChkFlg, String actGrpTmlFlg, String lgsCostAutoCdFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.lgsCostAutoCdFlg = lgsCostAutoCdFlg;
		this.creUsrId = creUsrId;
		this.actGrpTmlFlg = actGrpTmlFlg;
		this.costActGrpCd = costActGrpCd;
		this.ibflag = ibflag;
		this.coaCostSrcCd = coaCostSrcCd;
		this.creDt = creDt;
		this.lgsCostCdChkFlg = lgsCostCdChkFlg;
		this.costAplyFlg = costAplyFlg;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * 테이블 컬럼에 저장할 값을 Hashtable<"column_name", "value"> 로 반환
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("lgs_cost_auto_cd_flg", getLgsCostAutoCdFlg());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("act_grp_tml_flg", getActGrpTmlFlg());
		this.hashColumns.put("cost_act_grp_cd", getCostActGrpCd());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("coa_cost_src_cd", getCoaCostSrcCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("lgs_cost_cd_chk_flg", getLgsCostCdChkFlg());
		this.hashColumns.put("cost_aply_flg", getCostAplyFlg());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * 컬럼명에 대응되는 멤버변수명을 저장하여 Hashtable<"column_name", "variable"> 로 반환   
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("lgs_cost_auto_cd_flg", "lgsCostAutoCdFlg");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("act_grp_tml_flg", "actGrpTmlFlg");
		this.hashFields.put("cost_act_grp_cd", "costActGrpCd");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("coa_cost_src_cd", "coaCostSrcCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("lgs_cost_cd_chk_flg", "lgsCostCdChkFlg");
		this.hashFields.put("cost_aply_flg", "costAplyFlg");
		this.hashFields.put("upd_usr_id", "updUsrId");
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
	 * @return lgsCostAutoCdFlg
	 */
	public String getLgsCostAutoCdFlg() {
		return this.lgsCostAutoCdFlg;
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
	 * @return actGrpTmlFlg
	 */
	public String getActGrpTmlFlg() {
		return this.actGrpTmlFlg;
	}
	
	/**
	 * Column Info
	 * @return costActGrpCd
	 */
	public String getCostActGrpCd() {
		return this.costActGrpCd;
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
	 * @return coaCostSrcCd
	 */
	public String getCoaCostSrcCd() {
		return this.coaCostSrcCd;
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
	 * @return lgsCostCdChkFlg
	 */
	public String getLgsCostCdChkFlg() {
		return this.lgsCostCdChkFlg;
	}
	
	/**
	 * Column Info
	 * @return costAplyFlg
	 */
	public String getCostAplyFlg() {
		return this.costAplyFlg;
	}
	
	/**
	 * Column Info
	 * @return updUsrId
	 */
	public String getUpdUsrId() {
		return this.updUsrId;
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
	 * @param lgsCostAutoCdFlg
	 */
	public void setLgsCostAutoCdFlg(String lgsCostAutoCdFlg) {
		this.lgsCostAutoCdFlg = lgsCostAutoCdFlg;
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
	 * @param actGrpTmlFlg
	 */
	public void setActGrpTmlFlg(String actGrpTmlFlg) {
		this.actGrpTmlFlg = actGrpTmlFlg;
	}
	
	/**
	 * Column Info
	 * @param costActGrpCd
	 */
	public void setCostActGrpCd(String costActGrpCd) {
		this.costActGrpCd = costActGrpCd;
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
	 * @param coaCostSrcCd
	 */
	public void setCoaCostSrcCd(String coaCostSrcCd) {
		this.coaCostSrcCd = coaCostSrcCd;
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
	 * @param lgsCostCdChkFlg
	 */
	public void setLgsCostCdChkFlg(String lgsCostCdChkFlg) {
		this.lgsCostCdChkFlg = lgsCostCdChkFlg;
	}
	
	/**
	 * Column Info
	 * @param costAplyFlg
	 */
	public void setCostAplyFlg(String costAplyFlg) {
		this.costAplyFlg = costAplyFlg;
	}
	
	/**
	 * Column Info
	 * @param updUsrId
	 */
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
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
		setLgsCostAutoCdFlg(JSPUtil.getParameter(request, "lgs_cost_auto_cd_flg", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setActGrpTmlFlg(JSPUtil.getParameter(request, "act_grp_tml_flg", ""));
		setCostActGrpCd(JSPUtil.getParameter(request, "cost_act_grp_cd", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setCoaCostSrcCd(JSPUtil.getParameter(request, "coa_cost_src_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setLgsCostCdChkFlg(JSPUtil.getParameter(request, "lgs_cost_cd_chk_flg", ""));
		setCostAplyFlg(JSPUtil.getParameter(request, "cost_aply_flg", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request 의 데이터를 VO 배열로 변환하여 반환.
	 * @param request
	 * @return CoaActGrpCostMapgVO[]
	 */
	public CoaActGrpCostMapgVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return CoaActGrpCostMapgVO[]
	 */
	public CoaActGrpCostMapgVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CoaActGrpCostMapgVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt", length));
			String[] lgsCostAutoCdFlg = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_auto_cd_flg", length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id", length));
			String[] actGrpTmlFlg = (JSPUtil.getParameter(request, prefix	+ "act_grp_tml_flg", length));
			String[] costActGrpCd = (JSPUtil.getParameter(request, prefix	+ "cost_act_grp_cd", length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag", length));
			String[] coaCostSrcCd = (JSPUtil.getParameter(request, prefix	+ "coa_cost_src_cd", length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt", length));
			String[] lgsCostCdChkFlg = (JSPUtil.getParameter(request, prefix	+ "lgs_cost_cd_chk_flg", length));
			String[] costAplyFlg = (JSPUtil.getParameter(request, prefix	+ "cost_aply_flg", length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id", length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows", length));
			
			for (int i = 0; i < length; i++) {
				model = new CoaActGrpCostMapgVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (lgsCostAutoCdFlg[i] != null)
					model.setLgsCostAutoCdFlg(lgsCostAutoCdFlg[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (actGrpTmlFlg[i] != null)
					model.setActGrpTmlFlg(actGrpTmlFlg[i]);
				if (costActGrpCd[i] != null)
					model.setCostActGrpCd(costActGrpCd[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (coaCostSrcCd[i] != null)
					model.setCoaCostSrcCd(coaCostSrcCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (lgsCostCdChkFlg[i] != null)
					model.setLgsCostCdChkFlg(lgsCostCdChkFlg[i]);
				if (costAplyFlg[i] != null)
					model.setCostAplyFlg(costAplyFlg[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getCoaActGrpCostMapgVOs();
	}

	/**
	 * VO 배열을 반환
	 * @return CoaActGrpCostMapgVO[]
	 */
	public CoaActGrpCostMapgVO[] getCoaActGrpCostMapgVOs(){
		CoaActGrpCostMapgVO[] vos = (CoaActGrpCostMapgVO[])models.toArray(new CoaActGrpCostMapgVO[models.size()]);
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
		this.lgsCostAutoCdFlg = this.lgsCostAutoCdFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.actGrpTmlFlg = this.actGrpTmlFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costActGrpCd = this.costActGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.coaCostSrcCd = this.coaCostSrcCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.lgsCostCdChkFlg = this.lgsCostCdChkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.costAplyFlg = this.costAplyFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
