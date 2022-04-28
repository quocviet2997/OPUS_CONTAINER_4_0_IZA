/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : OpfStvDmgCdVO.java
*@FileTitle : OpfStvDmgCdVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.12
*@LastModifier : 우지석
*@LastVersion : 1.0
* 2009.05.12 우지석 
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
 * @author 우지석
 * @since J2EE 1.5
 * @see AbstractValueObject
 */

public class OpfStvDmgCdVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<OpfStvDmgCdVO> models = new ArrayList<OpfStvDmgCdVO>();
	
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String stvDmgCdDesc = null;
	/* Column Info */
	private String creUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String stvDmgCd = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String stvDmgCateCd = null;
	/* Column Info */
	private String stvDmgGrpCd = null;
	/* Column Info */
	private String updUsrId = null;
	/* Page Number */
	private String pagerows = null;

	/*	Table Column name으로 맴버변수 value 담는다*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	Table Column name으로 맴버변수 name 	담는다*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public OpfStvDmgCdVO() {}

	/**
	 * OpfStvDmgCdVO 객체 생성
	 */
	public OpfStvDmgCdVO(String ibflag, String pagerows, String stvDmgCateCd, String stvDmgCd, String stvDmgCdDesc, String stvDmgGrpCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updDt = updDt;
		this.stvDmgCdDesc = stvDmgCdDesc;
		this.creUsrId = creUsrId;
		this.ibflag = ibflag;
		this.stvDmgCd = stvDmgCd;
		this.creDt = creDt;
		this.stvDmgCateCd = stvDmgCateCd;
		this.stvDmgGrpCd = stvDmgGrpCd;
		this.updUsrId = updUsrId;
		this.pagerows = pagerows;
	}
	
	/**
	 * Table Column name 으로 맴버변수에 value를 리턴한다.
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("stv_dmg_cd_desc", getStvDmgCdDesc());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("stv_dmg_cd", getStvDmgCd());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("stv_dmg_cate_cd", getStvDmgCateCd());
		this.hashColumns.put("stv_dmg_grp_cd", getStvDmgGrpCd());
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("pagerows", getPagerows());
		return this.hashColumns;
	}
	
	/**
	 * Table Column name 으로 맴버변수를 호출한다
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("stv_dmg_cd_desc", "stvDmgCdDesc");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("stv_dmg_cd", "stvDmgCd");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("stv_dmg_cate_cd", "stvDmgCateCd");
		this.hashFields.put("stv_dmg_grp_cd", "stvDmgGrpCd");
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
	 * @return stvDmgCdDesc
	 */
	public String getStvDmgCdDesc() {
		return this.stvDmgCdDesc;
	}
	
	/**
	 * Column Info
	 * @return creUsrId
	 */
	public String getCreUsrId() {
		return this.creUsrId;
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
	 * @return stvDmgCd
	 */
	public String getStvDmgCd() {
		return this.stvDmgCd;
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
	 * @return stvDmgCateCd
	 */
	public String getStvDmgCateCd() {
		return this.stvDmgCateCd;
	}
	
	/**
	 * Column Info
	 * @return stvDmgGrpCd
	 */
	public String getStvDmgGrpCd() {
		return this.stvDmgGrpCd;
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
	 * @param stvDmgCdDesc
	 */
	public void setStvDmgCdDesc(String stvDmgCdDesc) {
		this.stvDmgCdDesc = stvDmgCdDesc;
	}
	
	/**
	 * Column Info
	 * @param creUsrId
	 */
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
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
	 * @param stvDmgCd
	 */
	public void setStvDmgCd(String stvDmgCd) {
		this.stvDmgCd = stvDmgCd;
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
	 * @param stvDmgCateCd
	 */
	public void setStvDmgCateCd(String stvDmgCateCd) {
		this.stvDmgCateCd = stvDmgCateCd;
	}
	
	/**
	 * Column Info
	 * @param stvDmgGrpCd
	 */
	public void setStvDmgGrpCd(String stvDmgGrpCd) {
		this.stvDmgGrpCd = stvDmgGrpCd;
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
	 * Request 넘어온 단건 DATA를 VO Class 에 담는다. 
	 * @param request
	 */
	public void fromRequest(HttpServletRequest request) {
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setStvDmgCdDesc(JSPUtil.getParameter(request, "stv_dmg_cd_desc", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setStvDmgCd(JSPUtil.getParameter(request, "stv_dmg_cd", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setStvDmgCateCd(JSPUtil.getParameter(request, "stv_dmg_cate_cd", ""));
		setStvDmgGrpCd(JSPUtil.getParameter(request, "stv_dmg_grp_cd", ""));
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
	}

	/**
	 * Request를 VO Class를 담는다.
	 * @param request
	 * @return OpfStvDmgCdVO[]
	 */
	public OpfStvDmgCdVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	/**
	 * Request 넘어온 여러 건 DATA를 VO Class 에 담는다. 
	 * @param request
	 * @param prefix
	 * @return OpfStvDmgCdVO[]
	 */
	public OpfStvDmgCdVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		OpfStvDmgCdVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] stvDmgCdDesc = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_cd_desc".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] stvDmgCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_cd".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] stvDmgCateCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_cate_cd".trim(), length));
			String[] stvDmgGrpCd = (JSPUtil.getParameter(request, prefix	+ "stv_dmg_grp_cd".trim(), length));
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new OpfStvDmgCdVO();
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (stvDmgCdDesc[i] != null)
					model.setStvDmgCdDesc(stvDmgCdDesc[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (stvDmgCd[i] != null)
					model.setStvDmgCd(stvDmgCd[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (stvDmgCateCd[i] != null)
					model.setStvDmgCateCd(stvDmgCateCd[i]);
				if (stvDmgGrpCd[i] != null)
					model.setStvDmgGrpCd(stvDmgGrpCd[i]);
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				models.add(model);
			}

		} catch (Exception e) {
			return null;
		}
		return getOpfStvDmgCdVOs();
	}

	/**
	 * 여러 VO Calss를 배열화 한다 
	 * @return OpfStvDmgCdVO[]
	 */
	public OpfStvDmgCdVO[] getOpfStvDmgCdVOs(){
		OpfStvDmgCdVO[] vos = (OpfStvDmgCdVO[])models.toArray(new OpfStvDmgCdVO[models.size()]);
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
	 * 각 클래스 해당하는 필드 정보를 배열에 담는다 
	 * @param field
	 * @param i
	 * @return String[]
	 */
	private String[] getField(Field[] field, int i) {
		String[] arr = null;
		try{
			arr = (String[]) field[i].get(this);
		}catch(Exception ex){
			arr = getFieldCatct(field, i, arr);
		}
		return arr;
	}
	
	/**
	 * getField 에서 catch문에 대한 로직
	 * @param field
	 * @param i
	 * @param arr
	 * @return arr
	 */
	private String[] getFieldCatct(Field[] field, int i, String[] arr) {
		try {
			arr = new String[1];
			arr[0] = String.valueOf(field[i].get(this));
		} catch (IllegalAccessException e) {
			return null;
		}
		return arr;
	}
	
	/**
	* DataFormat 설정
	*/
	public void unDataFormat(){
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgCdDesc = this.stvDmgCdDesc .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgCd = this.stvDmgCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgCateCd = this.stvDmgCateCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.stvDmgGrpCd = this.stvDmgGrpCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
