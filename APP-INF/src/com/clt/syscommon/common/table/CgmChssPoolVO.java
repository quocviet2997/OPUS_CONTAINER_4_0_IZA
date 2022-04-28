/*=========================================================
*Copyright(c) 2009 CyberLogitec
*@FileName : CgmChssPoolVO.java
*@FileTitle : CgmChssPoolVO
*Open Issues :
*Change history :
*@LastModifyDate : 2009.05.08
*@LastModifier : 김창식
*@LastVersion : 1.0
* 2009.05.08 김창식 
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
 * @author 김창식
 * @since J2EE 1.5
 */

public class CgmChssPoolVO extends AbstractValueObject {

	private static final long serialVersionUID = 1L;
	
	private Collection<CgmChssPoolVO> models = new ArrayList<CgmChssPoolVO>();
	
	/* Column Info */
	private String updUsrId = null;
	/* Status */
	private String ibflag = null;
	/* Column Info */
	private String updDt = null;
	/* Column Info */
	private String creDt = null;
	/* Column Info */
	private String chssPoolNm = null;
	/* Column Info */
	private String creUsrId = null;
	/* Column Info */
	private String poolMgmtCoCd = null;
	/* Page Number */
	private String pagerows = null;
	/* Column Info */
	private String chssPoolCd = null;

	/*	hashColumnInpo	*/
	private HashMap<String, String> hashColumns = new HashMap<String, String>();

	/*	hashFildInpo	*/
	private HashMap<String, String> hashFields = new HashMap<String, String>();
	
	public CgmChssPoolVO() {}

	public CgmChssPoolVO(String ibflag, String pagerows, String chssPoolCd, String chssPoolNm, String poolMgmtCoCd, String creUsrId, String creDt, String updUsrId, String updDt) {
		this.updUsrId = updUsrId;
		this.ibflag = ibflag;
		this.updDt = updDt;
		this.creDt = creDt;
		this.chssPoolNm = chssPoolNm;
		this.creUsrId = creUsrId;
		this.poolMgmtCoCd = poolMgmtCoCd;
		this.pagerows = pagerows;
		this.chssPoolCd = chssPoolCd;
	}
	
	/**
	 * hashColumnInpo
	 * @return HashMap
	 */
	public HashMap<String, String> getColumnValues(){
		this.hashColumns.put("upd_usr_id", getUpdUsrId());
		this.hashColumns.put("ibflag", getIbflag());
		this.hashColumns.put("upd_dt", getUpdDt());
		this.hashColumns.put("cre_dt", getCreDt());
		this.hashColumns.put("chss_pool_nm", getChssPoolNm());
		this.hashColumns.put("cre_usr_id", getCreUsrId());
		this.hashColumns.put("pool_mgmt_co_cd", getPoolMgmtCoCd());
		this.hashColumns.put("pagerows", getPagerows());
		this.hashColumns.put("chss_pool_cd", getChssPoolCd());
		return this.hashColumns;
	}
	
	/**
	 * hashFildInpo
	 * @return
	 */
	public HashMap<String, String> getFieldNames(){
		this.hashFields.put("upd_usr_id", "updUsrId");
		this.hashFields.put("ibflag", "ibflag");
		this.hashFields.put("upd_dt", "updDt");
		this.hashFields.put("cre_dt", "creDt");
		this.hashFields.put("chss_pool_nm", "chssPoolNm");
		this.hashFields.put("cre_usr_id", "creUsrId");
		this.hashFields.put("pool_mgmt_co_cd", "poolMgmtCoCd");
		this.hashFields.put("pagerows", "pagerows");
		this.hashFields.put("chss_pool_cd", "chssPoolCd");
		return this.hashFields;
	}
	
	public String getUpdUsrId() {
		return this.updUsrId;
	}
	public String getIbflag() {
		return this.ibflag;
	}
	public String getUpdDt() {
		return this.updDt;
	}
	public String getCreDt() {
		return this.creDt;
	}
	public String getChssPoolNm() {
		return this.chssPoolNm;
	}
	public String getCreUsrId() {
		return this.creUsrId;
	}
	public String getPoolMgmtCoCd() {
		return this.poolMgmtCoCd;
	}
	public String getPagerows() {
		return this.pagerows;
	}
	public String getChssPoolCd() {
		return this.chssPoolCd;
	}

	public void setUpdUsrId(String updUsrId) {
		this.updUsrId = updUsrId;
		//this.updUsrId=true;
	}
	public void setIbflag(String ibflag) {
		this.ibflag = ibflag;
		//this.ibflag=true;
	}
	public void setUpdDt(String updDt) {
		this.updDt = updDt;
		//this.updDt=true;
	}
	public void setCreDt(String creDt) {
		this.creDt = creDt;
		//this.creDt=true;
	}
	public void setChssPoolNm(String chssPoolNm) {
		this.chssPoolNm = chssPoolNm;
		//this.chssPoolNm=true;
	}
	public void setCreUsrId(String creUsrId) {
		this.creUsrId = creUsrId;
		//this.creUsrId=true;
	}
	public void setPoolMgmtCoCd(String poolMgmtCoCd) {
		this.poolMgmtCoCd = poolMgmtCoCd;
		//this.poolMgmtCoCd=true;
	}
	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
		//this.pagerows=true;
	}
	public void setChssPoolCd(String chssPoolCd) {
		this.chssPoolCd = chssPoolCd;
		//this.chssPoolCd=true;
	}
	public void fromRequest(HttpServletRequest request) {
		setUpdUsrId(JSPUtil.getParameter(request, "upd_usr_id", ""));
		setIbflag(JSPUtil.getParameter(request, "ibflag", ""));
		setUpdDt(JSPUtil.getParameter(request, "upd_dt", ""));
		setCreDt(JSPUtil.getParameter(request, "cre_dt", ""));
		setChssPoolNm(JSPUtil.getParameter(request, "chss_pool_nm", ""));
		setCreUsrId(JSPUtil.getParameter(request, "cre_usr_id", ""));
		setPoolMgmtCoCd(JSPUtil.getParameter(request, "pool_mgmt_co_cd", ""));
		setPagerows(JSPUtil.getParameter(request, "pagerows", ""));
		setChssPoolCd(JSPUtil.getParameter(request, "chss_pool_cd", ""));
	}

	public CgmChssPoolVO[] fromRequestGrid(HttpServletRequest request) {
		return fromRequestGrid(request, "");
	}

	public CgmChssPoolVO[] fromRequestGrid(HttpServletRequest request, String prefix) {
		CgmChssPoolVO model = null;
		
		String[] tmp = request.getParameterValues(prefix + "ibflag");
  		if(tmp == null)
   			return null;

  		int length = request.getParameterValues(prefix + "ibflag").length;
  
		try {
			String[] updUsrId = (JSPUtil.getParameter(request, prefix	+ "upd_usr_id".trim(), length));
			String[] ibflag = (JSPUtil.getParameter(request, prefix	+ "ibflag".trim(), length));
			String[] updDt = (JSPUtil.getParameter(request, prefix	+ "upd_dt".trim(), length));
			String[] creDt = (JSPUtil.getParameter(request, prefix	+ "cre_dt".trim(), length));
			String[] chssPoolNm = (JSPUtil.getParameter(request, prefix	+ "chss_pool_nm".trim(), length));
			String[] creUsrId = (JSPUtil.getParameter(request, prefix	+ "cre_usr_id".trim(), length));
			String[] poolMgmtCoCd = (JSPUtil.getParameter(request, prefix	+ "pool_mgmt_co_cd".trim(), length));
			String[] pagerows = (JSPUtil.getParameter(request, prefix	+ "pagerows".trim(), length));
			String[] chssPoolCd = (JSPUtil.getParameter(request, prefix	+ "chss_pool_cd".trim(), length));
			
			for (int i = 0; i < length; i++) {
				model = new CgmChssPoolVO();
				if (updUsrId[i] != null)
					model.setUpdUsrId(updUsrId[i]);
				if (ibflag[i] != null)
					model.setIbflag(ibflag[i]);
				if (updDt[i] != null)
					model.setUpdDt(updDt[i]);
				if (creDt[i] != null)
					model.setCreDt(creDt[i]);
				if (chssPoolNm[i] != null)
					model.setChssPoolNm(chssPoolNm[i]);
				if (creUsrId[i] != null)
					model.setCreUsrId(creUsrId[i]);
				if (poolMgmtCoCd[i] != null)
					model.setPoolMgmtCoCd(poolMgmtCoCd[i]);
				if (pagerows[i] != null)
					model.setPagerows(pagerows[i]);
				if (chssPoolCd[i] != null)
					model.setChssPoolCd(chssPoolCd[i]);
				models.add(model);
			}

		} catch (Exception e) {}
		return getCgmChssPoolVOs();
	}

	public CgmChssPoolVO[] getCgmChssPoolVOs(){
		CgmChssPoolVO[] vos = (CgmChssPoolVO[])models.toArray(new CgmChssPoolVO[models.size()]);
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
		this.updUsrId = this.updUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.ibflag = this.ibflag .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.updDt = this.updDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creDt = this.creDt .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolNm = this.chssPoolNm .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.creUsrId = this.creUsrId .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.poolMgmtCoCd = this.poolMgmtCoCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.pagerows = this.pagerows .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
		this.chssPoolCd = this.chssPoolCd .replaceAll(",", "").replaceAll("-", "").replaceAll("/", "").replaceAll(":", "");
	}
}
