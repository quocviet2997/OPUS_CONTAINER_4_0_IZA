/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : ScgIrrTpCdVO.java
*@FileTitle : ScgIrrTpCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.06
*@LastModifier : 이도형
*@LastVersion : 1.0
* 2009.05.06 이도형 
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
 * - PDTO(Data Transfer Object including Parameters)<br>
 * - 관련 Event에서 작성, 서버실행요청시 PDTO의 역할을 수행하는 Value Object<br>
 *
 * @author 이도형
 * @since J2EE 1.5
 */

public class ScgIrrTpCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<ScgIrrTpCdVO> models = new ArrayList<ScgIrrTpCdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String dgFlg = null;
	/* Column Info */
	private String spclCgoIrrTpDesc = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String spclCgoIrrTpNm = null;
	/* Column Info */
	private String deltFlg = null;
	/* Column Info */
	private String awkFlg = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String spclCgoIrrTpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public ScgIrrTpCdVO() {}

	public ScgIrrTpCdVO(String ibflag, String pagerows, String spclCgoIrrTpCd, String spclCgoIrrTpNm, String spclCgoIrrTpDesc, String dgFlg, String awkFlg, String deltFlg, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.creUsrId = creUsrId;
		this.dgFlg = dgFlg;
		this.spclCgoIrrTpDesc = spclCgoIrrTpDesc;
		this.ibflag = ibflag;
		this.spclCgoIrrTpNm = spclCgoIrrTpNm;
		this.deltFlg = deltFlg;
		this.awkFlg = awkFlg;
		this.creDt = creDt;
		this.spclCgoIrrTpCd = spclCgoIrrTpCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("dg_flg", getDgFlg());
		this.hashColumns.put("spcl_cgo_irr_tp_desc", getSpclCgoIrrTpDesc());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("spcl_cgo_irr_tp_nm", getSpclCgoIrrTpNm());
		this.hashColumns.put("delt_flg", getDeltFlg());
		this.hashColumns.put("awk_flg", getAwkFlg());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("spcl_cgo_irr_tp_cd", getSpclCgoIrrTpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("dg_flg", "dgFlg");
		this.hashFields.put("spcl_cgo_irr_tp_desc", "spclCgoIrrTpDesc");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("spcl_cgo_irr_tp_nm", "spclCgoIrrTpNm");
		this.hashFields.put("delt_flg", "deltFlg");
		this.hashFields.put("awk_flg", "awkFlg");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("spcl_cgo_irr_tp_cd", "spclCgoIrrTpCd");
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("pagerows", "pagerows");
		return this.hashFields;
	}
	
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getDgFlg() {
		return this.dgFlg;
	}
	public String getSpclCgoIrrTpDesc() {
		return this.spclCgoIrrTpDesc;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getSpclCgoIrrTpNm() {
		return this.spclCgoIrrTpNm;
	}
	public String getDeltFlg() {
		return this.deltFlg;
	}
	public String getAwkFlg() {
		return this.awkFlg;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getSpclCgoIrrTpCd() {
		return this.spclCgoIrrTpCd;
	}
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getPagerows() {
		return this.pagerows;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setDgFlg(String dgFlg) {
		this.dgFlg = dgFlg;
		//this.dgFlg=true;
	}
	public void setSpclCgoIrrTpDesc(String spclCgoIrrTpDesc) {
		this.spclCgoIrrTpDesc = spclCgoIrrTpDesc;
		//this.spclCgoIrrTpDesc=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setSpclCgoIrrTpNm(String spclCgoIrrTpNm) {
		this.spclCgoIrrTpNm = spclCgoIrrTpNm;
		//this.spclCgoIrrTpNm=true;
	}
	public void setDeltFlg(String deltFlg) {
		this.deltFlg = deltFlg;
		//this.deltFlg=true;
	}
	public void setAwkFlg(String awkFlg) {
		this.awkFlg = awkFlg;
		//this.awkFlg=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setSpclCgoIrrTpCd(String spclCgoIrrTpCd) {
		this.spclCgoIrrTpCd = spclCgoIrrTpCd;
		//this.spclCgoIrrTpCd=true;
	}
	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setDgFlg(JSPUtil.getParameter(request, "dg_flg", ""));
		setSpclCgoIrrTpDesc(JSPUtil.getParameter(request, "spcl_cgo_irr_tp_desc", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setSpclCgoIrrTpNm(JSPUtil.getParameter(request, "spcl_cgo_irr_tp_nm", ""));
		setDeltFlg(JSPUtil.getParameter(request, "delt_flg", ""));
		setAwkFlg(JSPUtil.getParameter(request, "awk_flg", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setSpclCgoIrrTpCd(JSPUtil.getParameter(request, "spcl_cgo_irr_tp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	public ScgIrrTpCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public ScgIrrTpCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		ScgIrrTpCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] dgFlg = (JSPUtil.getParameter(request, prefix	+ "dg_flg".trim(), length));
			String[] spclCgoIrrTpDesc = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_irr_tp_desc".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] spclCgoIrrTpNm = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_irr_tp_nm".trim(), length));
			String[] deltFlg = (JSPUtil.getParameter(request, prefix	+ "delt_flg".trim(), length));
			String[] awkFlg = (JSPUtil.getParameter(request, prefix	+ "awk_flg".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] spclCgoIrrTpCd = (JSPUtil.getParameter(request, prefix	+ "spcl_cgo_irr_tp_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new ScgIrrTpCdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (dgFlg[i] != null)
					model.setDgFlg(dgFlg[i]);
				if (spclCgoIrrTpDesc[i] != null)
					model.setSpclCgoIrrTpDesc(spclCgoIrrTpDesc[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (spclCgoIrrTpNm[i] != null)
					model.setSpclCgoIrrTpNm(spclCgoIrrTpNm[i]);
				if (deltFlg[i] != null)
					model.setDeltFlg(deltFlg[i]);
				if (awkFlg[i] != null)
					model.setAwkFlg(awkFlg[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (spclCgoIrrTpCd[i] != null)
					model.setSpclCgoIrrTpCd(spclCgoIrrTpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getScgIrrTpCdVOs();
	}

	public ScgIrrTpCdVO[] getScgIrrTpCdVOs(){
		ScgIrrTpCdVO[] vos = (ScgIrrTpCdVO[])models.toArray(new ScgIrrTpCdVO[models.size()]);
		return vos;
	}
	
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
		} catch (Exception ex) {}
		return ret.toString();
	}
	
	/**
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 * @throws IllegalAccessException
	 */
	private String[] getField(Field[] field, int i) throws IllegalAccessException {
		String[] arr;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void onDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.dgFlg = this.dgFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoIrrTpDesc = this.spclCgoIrrTpDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoIrrTpNm = this.spclCgoIrrTpNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.deltFlg = this.deltFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.awkFlg = this.awkFlg .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.spclCgoIrrTpCd = this.spclCgoIrrTpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
